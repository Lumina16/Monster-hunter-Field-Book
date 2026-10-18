package com.lumina.monsterhunterfieldbook

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.json.JSONObject
import java.util.concurrent.Executors

data class FieldRecord(val id:String,val kind:String,val name:String,val game:String,val summary:String,val image:String,val payload:String) {
    fun data()=JSONObject(payload)
}
data class LibraryFilter(val kind:String,val category:String="",val query:String="",val game:String="all",val rank:String="all",val rarity:String="all",val type:String="all",val sort:String="name")
data class LibraryPage(val records:List<FieldRecord>,val total:Int)

/** Call database methods on executor. The UI never scans catalogue data. */
class Catalogue(private val context:Context) {
    val executor=Executors.newSingleThreadExecutor()
    @Volatile var ready=false
        private set
    private lateinit var db:SQLiteDatabase
    private var names=listOf<Triple<String,String,String>>()
    fun open(){
        val file=context.getDatabasePath("catalogue-0.3.0.db")
        if(!file.exists()){
            file.parentFile?.mkdirs();val tmp=java.io.File(file.path+".tmp")
            context.assets.open("catalogue.db").use{input->tmp.outputStream().use{input.copyTo(it)}}
            check(tmp.renameTo(file)){"Cannot install offline catalogue"}
        }
        db=SQLiteDatabase.openDatabase(file.path,null,SQLiteDatabase.OPEN_READONLY)
        val list=mutableListOf<Triple<String,String,String>>()
        db.rawQuery("SELECT id,name,kind FROM records",null).use{c->while(c.moveToNext())list+=Triple(c.getString(0),SearchRanking.normalise(c.getString(1)),c.getString(2))}
        names=list;ready=true
    }
    private fun rows(sql:String,args:Array<String> = emptyArray()):List<FieldRecord>{
        if(!ready)return emptyList()
        val list=mutableListOf<FieldRecord>()
        db.rawQuery(sql,args).use{c->while(c.moveToNext())list+=FieldRecord(c.getString(0),c.getString(1),c.getString(2),c.getString(3),c.getString(4),c.getString(5),c.getString(6))}
        return list
    }
    fun record(id:String)=rows("SELECT * FROM records WHERE id=?",arrayOf(id)).firstOrNull()
    fun reference(value:String,kind:String?=null):List<FieldRecord>{
        val filter=if(kind==null)""else " AND kind=?"
        val args=mutableListOf(value,value,value);if(kind!=null)args+=kind
        return rows("SELECT * FROM records WHERE (raw_id=? OR name=? COLLATE NOCASE OR id=?)$filter ORDER BY ordinal LIMIT 20",args.toTypedArray())
    }
    fun related(id:String,offset:Int=0,limit:Int=60)=rows("SELECT DISTINCT r.* FROM records r JOIN links l ON r.id=l.target WHERE l.source=? ORDER BY r.kind,r.name COLLATE NOCASE LIMIT ? OFFSET ?",arrayOf(id,limit.toString(),offset.toString()))
    fun browse(filter:LibraryFilter,offset:Int=0,limit:Int=60):LibraryPage{
        if(!ready)return LibraryPage(emptyList(),0)
        val clauses=mutableListOf("kind=?");val args=mutableListOf(filter.kind)
        if(filter.category.isNotBlank()){clauses+="category=?";args+=filter.category}
        if(filter.game=="world")clauses+="game IN ('world', 'both')"
        if(filter.rank!="all"){clauses+="rank=?";args+=filter.rank}
        if(filter.rarity!="all"){clauses+="rarity=?";args+=filter.rarity}
        if(filter.type!="all"){clauses+="equipment_type=?";args+=filter.type}
        SearchRanking.tokens(filter.query).forEach{token->
            clauses+="(name LIKE ? ESCAPE '\\' OR summary LIKE ? ESCAPE '\\' OR payload LIKE ? ESCAPE '\\')"
            val term="%"+token.replace("%","\\%").replace("_","\\_")+"%";repeat(3){args+=term}
        }
        val where=clauses.joinToString(" AND ")
        val total=db.rawQuery("SELECT COUNT(*) FROM records WHERE $where",args.toTypedArray()).use{it.moveToFirst();it.getInt(0)}
        val order=when(filter.sort){"rarity"->"rarity DESC,name COLLATE NOCASE";"attack"->"attack DESC,name COLLATE NOCASE";"source","tree"->"ordinal";else->"name COLLATE NOCASE"}
        return LibraryPage(rows("SELECT * FROM records WHERE $where ORDER BY $order LIMIT ? OFFSET ?",(args+listOf(limit.toString(),offset.toString())).toTypedArray()),total)
    }
    fun search(query:String,kind:String="All",related:Boolean=false):List<FieldRecord>{
        if(!ready)return emptyList()
        val tokens=SearchRanking.tokens(query);if(tokens.isEmpty())return emptyList()
        val filter=if(kind=="All")"" else " AND r.kind=?"
        val args=mutableListOf(tokens.joinToString(" "){"\"$it\"*"});if(kind!="All")args+=kind
        var hits=runCatching{rows("SELECT r.* FROM records r JOIN names n ON r.id=n.id WHERE names MATCH ?$filter LIMIT 200",args.toTypedArray())}.getOrDefault(emptyList())
        if(related){val relatedArgs=mutableListOf("%"+query.replace("%","\\%").replace("_","\\_")+"%");if(kind!="All")relatedArgs+=kind;hits=rows("SELECT r.* FROM records r WHERE r.payload LIKE ? ESCAPE '\\'$filter LIMIT 120",relatedArgs.toTypedArray())}
        if(hits.size<8 && tokens.size<=4 && tokens.all{it.length>=3}){
            val fuzzy=names.asSequence().filter{kind=="All"||it.third==kind}.mapNotNull{entry->
                val words=entry.second.split(' ');val distances=tokens.map{q->words.minOfOrNull{SearchRanking.distance(it,q)}?:4}
                if(distances.all{it<=1}&&distances.sum()<=2)entry.first to distances.sum() else null
            }.sortedBy{it.second}.take(15).mapNotNull{record(it.first)}.toList()
            hits=(hits+fuzzy).distinctBy{it.id}
        }
        return hits.sortedWith(compareBy<FieldRecord>{SearchRanking.rank(it.name,query)}.thenBy{it.name}).take(100)
    }
    fun counts():Map<String,Int>{val result=linkedMapOf<String,Int>();if(ready)db.rawQuery("SELECT kind,COUNT(*) FROM records GROUP BY kind",null).use{c->while(c.moveToNext())result[c.getString(0)]=c.getInt(1)};return result}
    fun close(){executor.execute{ready=false;if(::db.isInitialized)db.close()};executor.shutdown()}
}
