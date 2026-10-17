package com.lumina.monsterhunterfieldbook

import android.content.Intent
import android.net.Uri
import android.view.*
import android.widget.*
import org.json.*
import java.util.concurrent.atomic.AtomicInteger

object ContentText {
    private val labels=mapOf("cut" to "Sever","impact" to "Blunt","shot" to "Shot","zenny" to "Cost (zenny)","stats" to "Statistics","maxDefence" to "Maximum defence","questIds" to "Quests","forge" to "Forging","upgrade" to "Upgrading","parent" to "Previous weapon","previous" to "Previous upgrade","iceborne" to "Iceborne additions","world" to "World foundation","database" to "Detailed game data","guidingLands" to "Guiding Lands","slot" to "Slot level","slots" to "Decoration slots")
    fun label(key:String)=labels[key]?:key.replace(Regex("([a-z])([A-Z])"),"$1 $2").replace('-',' ').replace('_',' ').replaceFirstChar{it.uppercase()}
    fun clean(value:String)=value.replace(Regex("Image†[^\\s]+\\s*"),"").trim()
    fun useful(value:Any?,hideZero:Boolean=false):Boolean=when(value){
        null,JSONObject.NULL->false
        is Number->!hideZero||value.toDouble()!=0.0
        is String->value.isNotBlank()&&value.trim().lowercase() !in listOf("null","undefined","n/a","—","-")&&(!hideZero||value.trim().toDoubleOrNull()!=0.0)
        is JSONArray->(0 until value.length()).any{useful(value.opt(it),hideZero)}
        is JSONObject->value.keys().asSequence().any{useful(value.opt(it),hideZero)}
        else->true
    }
    fun value(value:Any?):String=when(value){null,JSONObject.NULL->"";is Boolean->if(value)"Yes"else"No";is JSONArray->(0 until value.length()).joinToString(" · "){value(value.opt(it))};is JSONObject->value.keys().asSequence().filter{useful(value.opt(it))}.joinToString(" · "){label(it)+": "+value(value.opt(it))};else->clean(value.toString())}
    fun monsterRow(value:JSONObject):Boolean {
        val identity=setOf("name","part","type","effect","id","rank","source","sources")
        val fields=value.keys().asSequence().filter{it !in identity}.toList()
        return fields.any{useful(value.opt(it),true)}
    }
}

/** Lazy content groups share the reader's single-open and remember preferences. */
class ReadingGroup(private val a:MainActivity,val key:String,title:String,private val siblings:MutableList<ReadingGroup>,defaultOpen:Boolean=false,private val populate:(LinearLayout)->Unit):LinearLayout(a) {
    private val inner=a.column()
    private val head=a.button(title){toggle()}
    private var filled=false
    var expanded=false
        private set
    init {
        orientation=VERTICAL;background=a.surface()
        head.gravity=Gravity.START or Gravity.CENTER_VERTICAL
        addView(head,LayoutParams(-1,-2));a.pad(inner,12);inner.visibility=GONE;addView(inner,LayoutParams(-1,-2));siblings+=this
        val memory=runCatching{JSONObject(a.prefs.text("readingGroups","{}"))}.getOrDefault(JSONObject())
        val initial=if(a.prefs.flag("rememberGroups")&&memory.has(key))memory.optBoolean(key)else defaultOpen
        if(initial)setOpen(true,false)
    }
    private fun toggle(){setOpen(!expanded,true)}
    fun setOpen(open:Boolean,remember:Boolean=true){
        if(open&&a.prefs.flag("singleGroup",false))siblings.filter{it!==this&&it.expanded}.forEach{it.setOpen(false,remember)}
        expanded=open;inner.animate().cancel()
        if(open){if(!filled){filled=true;populate(inner)};inner.visibility=VISIBLE;inner.alpha=1f}
        else if(remember&&a.motionDuration(160)>0){inner.animate().alpha(0f).setDuration(a.motionDuration(160)).withEndAction{if(!expanded){inner.visibility=GONE;inner.alpha=1f}}.start()}
        else {inner.visibility=GONE;inner.alpha=1f}
        head.contentDescription=head.text.toString()+if(open)", expanded"else", collapsed"
        if(remember&&a.prefs.flag("rememberGroups")){
            val memory=runCatching{JSONObject(a.prefs.text("readingGroups","{}"))}.getOrDefault(JSONObject());memory.put(key,open);a.prefs.set("readingGroups",memory.toString())
        }
    }
}

/** A complete native reader for the source's nested records and numeric tables. */
class RecordPanel(private val a:MainActivity,val record:FieldRecord,close:()->Unit):LinearLayout(a) {
    private val groups=mutableListOf<ReadingGroup>()
    private val generation=AtomicInteger()
    private val hideZero=record.kind in listOf("Monsters","Creatures")
    private val data=record.data()
    private val scroll=ScrollView(a)
    private val body=a.column()
    private val metadata=setOf("id","name","title","game","image","thumbnail","artUrl","artSource","sourceId","iconKey","iconColor","path","sha256","bytes","nativeWidth","nativeHeight","width","height","assetType")
    init {
        orientation=VERTICAL
        val heading=a.row();heading.setPadding(a.dp(12),a.dp(8),a.dp(6),a.dp(8))
        heading.addView(a.text(record.name,21f,true),LayoutParams(0,-2,1f))
        val bookmark=a.button(if(a.isBookmarked(record.id))"Saved"else"Save"){}
        a.touch(bookmark){a.toggleBookmark(record.id);bookmark.text=if(a.isBookmarked(record.id))"Saved"else"Save"}
        heading.addView(bookmark);heading.addView(a.iconButton("close","Close "+record.name,close),LayoutParams(a.dp(44),a.dp(44)))
        addView(heading);a.rule(this);scroll.addView(body);a.pad(body,14);addView(scroll,LayoutParams(-1,0,1f))
        body.addView(a.text(record.kind.uppercase()+" · "+when(record.game){"world"->"WORLD";"iceborne"->"ICEBORNE";else->"WORLD + ICEBORNE"},10f,colour=a.accent));a.gap(body,10)
        if(record.image.isNotBlank()){
            val image=ImageView(a).apply{scaleType=ImageView.ScaleType.FIT_CENTER;contentDescription=record.name+" artwork"};body.addView(image,LayoutParams(-1,a.dp(if(record.image.contains("/icons/"))90 else 200)));a.assetImage(record.image,image);a.gap(body,10)
        }
        listOf("summary","description","text","short","tip","overview").forEach{key->if(ContentText.useful(data.opt(key))){body.addView(a.text(ContentText.value(data.opt(key)),14f));a.gap(body,10)}}
        if(data.optJSONArray("maps")?.length()?.let{it>0}==true)mapGroup(data.getJSONArray("maps"))
        if(record.kind=="Maps"&&data.optString("image").startsWith("art/"))mapGroup(JSONArray().put(data))
        val detailKeys=data.keys().asSequence().filter{it !in metadata&&it !in setOf("summary","description","text","short","tip","overview","maps","source","sources","priceSource","unlockSource","video")}.toList()
        detailKeys.forEach{key->
            val v=data.opt(key)
            if(ContentText.useful(v,hideZero)){
                if(v is JSONObject && key=="database"){
                    v.keys().asSequence().filter{it !in setOf("name","source")}.forEach{sub->addGroup(ContentText.label(sub),v.opt(sub),key+"."+sub)}
                }else if(v is JSONArray||v is JSONObject)addGroup(ContentText.label(key),v,key)
                else field(body,key,v)
            }
        }
        data.optJSONObject("video")?.let{video->
            val url=video.optString("url");if(url.startsWith("https://")){
                val group=ReadingGroup(a,record.id+":video","Hunt video · opens online",groups){inner->inner.addView(a.text(video.optString("title"),14f));a.gap(inner,8);external(inner,url,"Open "+video.optString("channel","video"))};addCard(group)
            }
        }
        val related=ReadingGroup(a,record.id+":related","Related records, recipes & upgrades",groups){inner->loadRelated(inner,0)};addCard(related)
        val urls=mutableListOf<Pair<String,String>>()
        fun collectSources(value:Any?,field:String=""){
            when(value){
                is JSONObject->value.keys().forEach{k->collectSources(value.opt(k),k)}
                is JSONArray->for(i in 0 until value.length())collectSources(value.opt(i),field)
                is String->if(value.startsWith("https://")&&(field.contains("source",true)||field in listOf("url","artUrl","artSource")))urls+=ContentText.label(field) to value
            }
        }
        collectSources(data)
        if(urls.isNotEmpty()){val sources=ReadingGroup(a,record.id+":sources","Sources & credits",groups){inner->urls.distinctBy{it.second}.forEach{(_,url)->external(inner,url,sourceName(url));a.gap(inner,6)}};addCard(sources)}
        if(a.prefs.flag("rememberScroll"))scroll.post{scroll.scrollTo(0,a.prefs.number("recordPosition:"+record.id,0))}
    }
    private fun addCard(card:View){body.addView(card,LayoutParams(-1,-2).apply{bottomMargin=a.dp(10)})}
    private fun addGroup(title:String,value:Any?,key:String){
        if(!ContentText.useful(value,hideZero))return
        if(value is JSONArray&&hideZero&&value.length()>0&&((0 until value.length()).all{val row=value.opt(it);row is JSONObject&&!ContentText.monsterRow(row)}))return
        addCard(ReadingGroup(a,record.id+":"+key,title,groups){inner->render(inner,value,key)})
    }
    private fun sourceName(url:String):String=when{
        "MHWorldData" in url->"MHWorldData — "+ContentText.label(url.substringAfterLast('/').substringBefore('.').replace("_"," "))
        "kiranico" in url->"Kiranico — game database"
        "monsterhunterwiki" in url->"Monster Hunter Wiki — "+url.substringAfterLast('/').replace('_',' ')
        else->Uri.parse(url).host?.removePrefix("www.")?:"Reference"
    }
    private fun external(parent:LinearLayout,url:String,label:String){
        parent.addView(a.button(label){runCatching{a.startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(url)))}.onFailure{a.toast("No app is available to open this link.")}}.apply{gravity=Gravity.START or Gravity.CENTER_VERTICAL})
    }
    private fun field(parent:LinearLayout,key:String,value:Any?){
        if(!ContentText.useful(value,hideZero))return
        if(value is String&&value.startsWith("art/"))return
        val label=ContentText.label(key)
        val row=a.column();row.setPadding(0,a.dp(5),0,a.dp(8));row.addView(a.text(label,11f,colour=a.muted))
        val text=ContentText.value(value);val cell=a.text(text,14f)
        if(key in setOf("parent","previous","setId","questId","monsterId","itemId","name","previousName","localeId")){cell.setTextColor(a.accent);a.touch(cell){a.openReference(text)}}
        row.addView(cell);parent.addView(row)
    }
    private fun render(parent:LinearLayout,value:Any?,key:String,offset:Int=0){
        when(value){
            is JSONObject->value.keys().forEach{k->
                if(k !in metadata&&ContentText.useful(value.opt(k),hideZero)){
                    val v=value.opt(k)
                    if(v is JSONObject||v is JSONArray){parent.addView(a.text(ContentText.label(k),14f,true));render(parent,v,k);a.gap(parent,8)}
                    else field(parent,k,v)
                }
            }
            is JSONArray->{
                val list=(0 until value.length()).map{value.opt(it)}.filter{ContentText.useful(it,hideZero)&&(!hideZero||it !is JSONObject||ContentText.monsterRow(it))}
                val slice=list.drop(offset).take(30)
                val objects=slice.filterIsInstance<JSONObject>()
                val shallow=objects.isNotEmpty()&&objects.size==slice.size&&objects.all{o->o.keys().asSequence().all{o.opt(it) !is JSONObject&&o.opt(it) !is JSONArray}}
                if(shallow)table(parent,objects)else slice.forEach{item->
                    when(item){
                        is JSONObject->{val title=item.optString("name").ifBlank{item.optString("title")};if(title.isNotBlank()){
                            if(key in setOf("materials","ingredients","skills","links","rewards","gathering"))parent.addView(a.button(ContentText.clean(title)){a.openReference(title)}.apply{gravity=Gravity.START})
                            else parent.addView(a.text(ContentText.clean(title),15f,true))
                        };render(parent,item,key);a.rule(parent)}
                        else->{val t=ContentText.value(item);if(key in setOf("questIds","monsters","pieces"))parent.addView(a.button(t){a.openReference(t)}.apply{gravity=Gravity.START or Gravity.CENTER_VERTICAL})else parent.addView(a.text("• "+t,14f))}
                    };a.gap(parent,6)
                }
                if(offset+slice.size<list.size){val more=a.button("Show more · "+(list.size-offset-slice.size)+" remaining"){};a.touch(more){parent.removeView(more);render(parent,value,key,offset+slice.size)};parent.addView(more)}
            }
            else->field(parent,key,value)
        }
    }
    private fun table(parent:LinearLayout,rows:List<JSONObject>){
        val columns=rows.flatMap{it.keys().asSequence().toList()}.distinct().filter{key->key !in setOf("id","sourceId","image","thumbnail","source","sources")&&rows.any{ContentText.useful(it.opt(key),hideZero)}}
        if(columns.isEmpty())return
        val table=TableLayout(a);table.isStretchAllColumns=false
        val header=TableRow(a);columns.forEach{header.addView(a.text(ContentText.label(it),11f,colour=a.muted).apply{setPadding(a.dp(8),a.dp(8),a.dp(8),a.dp(8));minWidth=a.dp(65)})};table.addView(header)
        rows.forEach{entry->
            val row=TableRow(a);columns.forEach{key->
                val value=entry.opt(key);val t=if(ContentText.useful(value,hideZero))ContentText.value(value)else ""
                val cell=a.text(t,12f).apply{setPadding(a.dp(8),a.dp(8),a.dp(8),a.dp(8));maxWidth=a.dp(if(key in listOf("name","part","description","condition"))240 else 150)}
                if(key in setOf("name","item","monster","quest","id")&&t.isNotBlank()){cell.setTextColor(a.accent);a.touch(cell){a.openReference(t)}}
                row.addView(cell)
            };table.addView(row)
        }
        val horizontal=HorizontalScrollView(a);horizontal.addView(table);parent.addView(horizontal,LayoutParams(-1,-2))
    }
    private fun mapGroup(maps:JSONArray){addCard(ReadingGroup(a,record.id+":maps","Maps · zoom, floors & layers",groups,true){inner->inner.addView(MapPanel(a,maps,record.id),LayoutParams(-1,a.dp(if(a.landscape)300 else 420)))})}
    private fun loadRelated(parent:LinearLayout,offset:Int){
        val token=generation.incrementAndGet();val loading=a.text("Loading linked records…",12f,colour=a.muted);parent.addView(loading)
        a.catalogue.executor.execute{
            val records=runCatching{a.catalogue.related(record.id,offset)}.getOrDefault(emptyList())
            a.runOnUiThread{
                if(!isAttachedToWindow||token!=generation.get())return@runOnUiThread
                parent.removeView(loading)
                if(records.isEmpty()&&offset==0)parent.addView(a.text("No additional linked records are recorded.",12f,colour=a.muted))
                records.forEach{parent.addView(a.recordRow(it));a.rule(parent)}
                if(records.size==60){val more=a.button("Show more related records"){};a.touch(more){parent.removeView(more);loadRelated(parent,offset+60)};parent.addView(more)}
            }
        }
    }
    override fun onDetachedFromWindow(){if(a.prefs.flag("rememberScroll"))a.prefs.set("recordPosition:"+record.id,scroll.scrollY);generation.incrementAndGet();super.onDetachedFromWindow()}
}
