package com.lumina.monsterhunterfieldbook

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.json.JSONObject
import java.util.concurrent.Executors

data class FieldRecord(val id:String,val kind:String,val name:String,val game:String,val summary:String,val image:String,val payload:String)

class Catalogue(private val context:Context) {
    val executor=Executors.newSingleThreadExecutor()
    @Volatile var ready=false
    private lateinit var db:SQLiteDatabase
    private var names=listOf<Triple<String,String,String>>()
    fun open(){
        val file=context.getDatabasePath("catalogue-0.1.0.db")
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
    private fun rows(sql:String,args:Array<String>):List<FieldRecord>{
        val list=mutableListOf<FieldRecord>()
        db.rawQuery(sql,args).use{c->while(c.moveToNext())list+=FieldRecord(c.getString(0),c.getString(1),c.getString(2),c.getString(3),c.getString(4),c.getString(5),c.getString(6))}
        return list
    }
    fun record(id:String)=rows("SELECT * FROM records WHERE id=?",arrayOf(id)).firstOrNull()
    fun search(query:String,kind:String="All",related:Boolean=false):List<FieldRecord>{
        if(!ready)return emptyList()
        val tokens=SearchRanking.tokens(query)
        if(tokens.isEmpty())return emptyList()
        val filter=if(kind=="All")"" else " AND r.kind=?"
        val args=mutableListOf(tokens.joinToString(" "){"\"$it\"*"});if(kind!="All")args+=kind
        var hits=runCatching{rows("SELECT r.* FROM records r JOIN names n ON r.id=n.id WHERE names MATCH ?$filter LIMIT 180",args.toTypedArray())}.getOrDefault(emptyList())
        if(related){
            val relatedArgs=mutableListOf("%"+query.replace("%","\\%").replace("_","\\_")+"%");if(kind!="All")relatedArgs+=kind
            hits=rows("SELECT r.* FROM records r WHERE r.payload LIKE ? ESCAPE '\\'$filter LIMIT 100",relatedArgs.toTypedArray())
        }
        if(hits.size<8 && tokens.size<=4 && tokens.all{it.length>=3}){
            val fuzzy=names.asSequence().filter{kind=="All"||it.third==kind}.mapNotNull{entry->
                val words=entry.second.split(' ')
                val distances=tokens.map{q->words.minOfOrNull{SearchRanking.distance(it,q)}?:4}
                if(distances.all{it<=1}&&distances.sum()<=2)entry.first to distances.sum() else null
            }.sortedBy{it.second}.take(15).mapNotNull{record(it.first)}.toList()
            hits=(hits+fuzzy).distinctBy{it.id}
        }
        return hits.sortedWith(compareBy<FieldRecord>{SearchRanking.rank(it.name,query)}.thenBy{it.name}).take(80)
    }
    fun close(){executor.execute{if(::db.isInitialized)db.close()};executor.shutdown()}
}
