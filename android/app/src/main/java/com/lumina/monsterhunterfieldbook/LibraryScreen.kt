package com.lumina.monsterhunterfieldbook

import android.os.*
import android.text.*
import android.view.*
import android.widget.*
import org.json.JSONObject
import java.util.concurrent.atomic.AtomicInteger
import kotlin.math.*

/** Paged native browsing. Lists and exact-count grids share filters and selection. */
class LibraryScreen(private val a:MainActivity,private val section:String,private val restored:JSONObject?=null):LinearLayout(a) {
    private data class Collection(val kind:String,val category:String,val label:String)
    private val collections=when(section){
        "bestiary"->listOf(Collection("Monsters","","Large monsters"),Collection("Creatures","smallMonsters","Small monsters"),Collection("Creatures","endemicLife","Endemic life"))
        "weapons"->listOf(Collection("Weapons","","Weapon database"),Collection("Weapon Guides","","14 weapon handbooks"))
        "equipment"->listOf("armours" to "Armour","armourSets" to "Armour sets","decorations" to "Decorations","skills" to "Skills","charms" to "Charms","kinsects" to "Kinsects","palicoEquipment" to "Palico equipment","palicoGadgets" to "Palico gadgets","tools" to "Specialised tools","canteen" to "Canteen","foodSkills" to "Food skills").map{Collection("Equipment",it.first,it.second)}+Collection("Builds","","Build templates")
        "locales"->listOf(Collection("Locales","","Hunting locales"),Collection("Maps","","Atlases & bases"))
        "notes"->listOf(Collection("Field Notes","","Field notes"))
        "quests"->listOf(Collection("Quests","","Quests"))
        else->listOf(Collection("Items","","Resources"),Collection("Recipes","","Recipe"),Collection("Preparation","","Preparation quick reference"),Collection("Quests","","Quests"))
    }
    private val currentIndex=(restored?.optInt("collection")?:a.prefs.number("collection:"+section,0)).coerceIn(0,collections.lastIndex)
    private var collection=collections[currentIndex]
    private var filter=loadFilter(collection)
    private var tree=restored?.optBoolean("tree")?:false
    private var limit=restored?.optInt("limit")?:60
    private var selection=restored?.optString("selected")?:""
    private var position=restored?.optInt("position")?:if(a.prefs.flag("rememberScroll"))a.prefs.number("position:"+section,0)else 0
    private var topOffset=restored?.optInt("top")?:0
    private val records=mutableListOf<FieldRecord>()
    private val depths=mutableMapOf<String,Int>()
    private val generations=AtomicInteger()
    private val handler=Handler(Looper.getMainLooper())
    private var pending:Runnable?=null
    private val status=a.text("",12f,colour=a.muted)
    private lateinit var list:AbsListView
    private val listSlot=FrameLayout(a)
    private var details:FrameLayout?=null
    private val more=a.button("Show more"){capturePosition();limit+=batchSize();load(false)}
    private val adapter=object:BaseAdapter(){
        override fun getCount()=records.size
        override fun getItem(position:Int)=records[position]
        override fun getItemId(position:Int)=position.toLong()
        override fun getView(position:Int,convertView:View?,parent:ViewGroup):View{
            val record=records[position]
            return if(isGrid())gridCard(record)else a.recordRow(record){select(record)}.apply{
                if(tree)setPadding(a.dp(10+(depths[record.id]?:0)*15),paddingTop,paddingRight,paddingBottom)
                if(record.id==selection)background=a.surface()
            }
        }
    }
    private fun key(c:Collection)="filter:"+section+":"+c.category.ifBlank{c.kind}+":"+a.currentEdition
    private fun defaultSort(c:Collection)=a.prefs.text(when(c.kind){"Weapons"->"sortWeapons";"Items","Recipes"->"sortResources";else->"sort:"+c.category.ifBlank{c.kind}},"name")
    private fun loadFilter(c:Collection):LibraryFilter{
        val f=runCatching{JSONObject(a.prefs.text(key(c),"{}"))}.getOrDefault(JSONObject())
        return LibraryFilter(c.kind,c.category,f.optString("query"),f.optString("game",a.currentEdition),f.optString("rank","all"),f.optString("rarity","all"),f.optString("type","all"),f.optString("sort",defaultSort(c)))
    }
    private fun saveFilter(){
        a.prefs.set(key(collection),JSONObject().put("query",filter.query).put("game",filter.game).put("rank",filter.rank).put("rarity",filter.rarity).put("type",filter.type).put("sort",filter.sort).toString())
    }
    private fun isGrid()=section=="bestiary"
    private fun columns():Int=a.prefs.text("columns","auto").toIntOrNull()?.coerceIn(1,6)?:if(a.wide)4 else if(a.landscape)3 else 2
    private fun batchSize()=if(isGrid())columns()*(a.prefs.text("rows","6").toIntOrNull()?:6).coerceIn(1,8)else 60
    init {
        orientation=VERTICAL
        val title=a.row();title.setPadding(a.dp(14),a.dp(10),a.dp(10),a.dp(4))
        title.addView(a.text(when(section){"bestiary"->"Bestiary";"weapons"->"Weapons";"equipment"->"Equipment";"locales"->"Locales & bases";"notes"->"Field Notes";"quests"->"Quests";else->"Item Libraries"},24f,true),LayoutParams(0,-2,1f))
        if(section=="preparation")title.addView(a.button("Camp checklist"){a.showCampChecklist()})
        addView(title)
        val selector=Spinner(a);selector.contentDescription="Library collection";selector.adapter=ArrayAdapter(a,android.R.layout.simple_spinner_dropdown_item,collections.map{it.label});selector.setSelection(currentIndex);addView(selector,LayoutParams(-1,a.dp(46)))
        val searchRow=a.row();searchRow.setPadding(a.dp(10),0,a.dp(10),0)
        val search=EditText(a).apply{setSingleLine(true);hint="Filter this collection";setTextColor(a.ink);setHintTextColor(a.muted);textSize=15f;contentDescription="Filter this collection";setText(filter.query)}
        searchRow.addView(search,LayoutParams(0,a.dp(48),1f))
        val filterButton=a.button("Filters"){};searchRow.addView(filterButton);addView(searchRow)
        val filters=a.column();filters.visibility=GONE;filters.setPadding(a.dp(12),0,a.dp(12),a.dp(6));addView(filters)
        a.touch(filterButton){filters.visibility=if(filters.visibility==GONE)VISIBLE else GONE}
        fun choices(label:String,values:List<Pair<String,String>>,selected:String,onChange:(String)->Unit){
            val row=a.row();row.addView(a.text(label,12f),LayoutParams(a.dp(70),-2))
            val spinner=Spinner(a);spinner.contentDescription=label;spinner.adapter=ArrayAdapter(a,android.R.layout.simple_spinner_dropdown_item,values.map{it.second});val index=values.indexOfFirst{it.first==selected}.coerceAtLeast(0);spinner.setSelection(index)
            var previous=values[index].first
            spinner.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p:AdapterView<*>?,v:View?,position:Int,id:Long){val value=values[position].first;if(value!=previous){previous=value;onChange(value);saveFilter();limit=batchSize();positionReset();load()}}
                override fun onNothingSelected(p:AdapterView<*>?){}
            }
            row.addView(spinner,LayoutParams(0,a.dp(44),1f));filters.addView(row)
        }
        choices("Game",listOf("all" to "World + Iceborne","world" to "World","iceborne" to "Iceborne"),filter.game){filter=filter.copy(game=it)}
        choices("Rank",listOf("all" to "All ranks","LR" to "Low Rank","HR" to "High Rank","MR" to "Master Rank"),filter.rank){filter=filter.copy(rank=it)}
        choices("Rarity",listOf("all" to "All rarities")+(1..12).map{it.toString() to "Rarity "+it},filter.rarity){filter=filter.copy(rarity=it)}
        choices("Sort",listOf("name" to "Name A–Z","source" to "Source order","rarity" to "Highest rarity","attack" to "Highest attack"),filter.sort){filter=filter.copy(sort=it)}
        if(collection.kind=="Weapons"){
            val types=listOf("great-sword","long-sword","sword-and-shield","dual-blades","hammer","hunting-horn","lance","gunlance","switch-axe","charge-blade","insect-glaive","bow","light-bowgun","heavy-bowgun")
            choices("Weapon",listOf("all" to "All weapon types")+types.map{it to ContentText.label(it)},filter.type){filter=filter.copy(type=it)}
            val toggle=Switch(a);toggle.text="Weapon family tree";toggle.setTextColor(a.ink);toggle.isChecked=tree
            toggle.setOnCheckedChangeListener{_,v->tree=v;positionReset();load()};filters.addView(toggle)
        }
        filters.addView(a.button("Clear filters"){
            a.prefs.set(key(collection),"{}");a.prefs.set("position:"+section,0);a.replaceLibraryState(section,JSONObject().put("collection",collections.indexOf(collection)));a.refreshCurrentSection()
        })
        status.setPadding(a.dp(14),a.dp(7),a.dp(14),a.dp(7));addView(status)
        val main=a.row();main.gravity=Gravity.TOP;main.addView(listSlot,LayoutParams(0,-1,if(a.useSplitLibrary).43f else 1f))
        if(a.useSplitLibrary){
            details=FrameLayout(a);main.addView(details,LayoutParams(0,-1,.57f))
            details!!.addView(a.text("Select an entry to read its complete profile.",14f,colour=a.muted).apply{a.pad(this,18)})
        }
        addView(main,LayoutParams(-1,0,1f));addView(more,LayoutParams(-1,a.dp(44)))
        if(isGrid())list=GridView(a).apply{numColumns=columns();stretchMode=GridView.STRETCH_COLUMN_WIDTH;horizontalSpacing=a.dp(if(columns()>3)4 else 8);verticalSpacing=a.dp(7);setPadding(a.dp(8),0,a.dp(8),a.dp(8))}
        else list=ListView(a).apply{dividerHeight=0;setPadding(a.dp(6),0,a.dp(6),a.dp(6))}
        list.adapter=adapter;listSlot.addView(list,FrameLayout.LayoutParams(-1,-1))
        list.setOnScrollListener(object:AbsListView.OnScrollListener{
            override fun onScrollStateChanged(v:AbsListView?,state:Int){if(state==AbsListView.OnScrollListener.SCROLL_STATE_IDLE)capturePosition()}
            override fun onScroll(v:AbsListView?,first:Int,visible:Int,total:Int){}
        })
        selector.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p:AdapterView<*>?,v:View?,position:Int,id:Long){
                if(collection!=collections[position]){a.prefs.set("collection:"+section,position);a.replaceLibraryState(section,JSONObject().put("collection",position));a.refreshCurrentSection()}
            }
            override fun onNothingSelected(p:AdapterView<*>?){}
        }
        search.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s:CharSequence?,start:Int,count:Int,after:Int){}
            override fun afterTextChanged(s:Editable?){}
            override fun onTextChanged(s:CharSequence?,start:Int,before:Int,count:Int){
                filter=filter.copy(query=s.toString());saveFilter();pending?.let{handler.removeCallbacks(it)}
                pending=Runnable{positionReset();limit=batchSize();load()};handler.postDelayed(pending!!,180)
            }
        })
        if(restored==null)limit=batchSize();load(false)
    }
    private fun gridCard(record:FieldRecord):View{
        val card=a.column();card.gravity=Gravity.CENTER;card.background=a.surface();a.pad(card,if(columns()>3)3 else 9)
        val image=ImageView(a).apply{scaleType=ImageView.ScaleType.FIT_CENTER;contentDescription=record.name+" artwork"}
        val size=if(columns()>3)50 else if(columns()==3)75 else 120
        card.addView(image,LayoutParams(-1,a.dp(size)));if(record.image.isNotBlank())a.assetImage(record.image,image)
        card.addView(a.text(record.name,if(columns()>3)9f else 13f).apply{gravity=Gravity.CENTER;maxLines=3;ellipsize=TextUtils.TruncateAt.END},LayoutParams(-1,a.dp(if(columns()>3)40 else 46)))
        a.touch(card){select(record)};return card
    }
    private fun select(record:FieldRecord){
        selection=record.id
        val host=details
        if(host==null)a.showRecord(record)else {host.removeAllViews();host.addView(RecordPanel(a,record){selection="";host.removeAllViews()},FrameLayout.LayoutParams(-1,-1));adapter.notifyDataSetChanged()}
    }
    private fun positionReset(){position=0;topOffset=0}
    private fun load(reset:Boolean=true){
        if(reset)positionReset()
        if(!a.catalogue.ready){status.text="Preparing offline catalogue…";return}
        val token=generations.incrementAndGet();val f=filter;val max=if(tree&&collection.kind=="Weapons")10000 else limit.coerceAtMost(12000)
        status.text="Loading…";more.isEnabled=false
        a.catalogue.executor.execute{
            val result=runCatching{a.catalogue.browse(f,0,max)}
            a.runOnUiThread{
                if(!isAttachedToWindow||token!=generations.get())return@runOnUiThread
                result.onFailure{status.text="Could not load this library. Reopen it to try again."}
                result.onSuccess{page->
                    records.clear();depths.clear()
                    if(tree&&collection.kind=="Weapons"){
                        val source=page.records;val byId=source.associateBy{it.data().optString("id")};val children=source.groupBy{it.data().optString("parent")};val seen=mutableSetOf<String>()
                        fun append(r:FieldRecord,depth:Int){if(!seen.add(r.id))return;records+=r;depths[r.id]=depth.coerceAtMost(10);children[r.data().optString("id")]?.forEach{append(it,depth+1)}}
                        source.filter{it.data().optString("parent") !in byId}.forEach{append(it,0)};source.forEach{append(it,0)}
                    }else records+=page.records
                    status.text=records.size.toString()+" / "+page.total+" entries";more.visibility=if(records.size<page.total)VISIBLE else GONE;more.isEnabled=true
                    adapter.notifyDataSetChanged()
                    list.post{if(list is ListView)(list as ListView).setSelectionFromTop(position,topOffset)else list.setSelection(position)}
                    if(selection.isNotBlank()&&details!=null){records.firstOrNull{it.id==selection}?.let{select(it)}?:a.catalogue.executor.execute{val selected=a.catalogue.record(selection);a.runOnUiThread{if(isAttachedToWindow&&selected!=null)select(selected)}}}
                }
            }
        }
    }
    private fun capturePosition(){
        if(::list.isInitialized){position=list.firstVisiblePosition;topOffset=list.getChildAt(0)?.top?:0}
        if(a.prefs.flag("rememberScroll"))a.prefs.set("position:"+section,position)
    }
    fun snapshot():JSONObject{capturePosition();return JSONObject().put("collection",collections.indexOf(collection)).put("limit",limit).put("position",position).put("top",topOffset).put("selected",selection).put("tree",tree)}
    fun closeSelection():Boolean{if(selection.isBlank()||details==null)return false;selection="";details?.removeAllViews();adapter.notifyDataSetChanged();return true}
    override fun onDetachedFromWindow(){generations.incrementAndGet();pending?.let{handler.removeCallbacks(it)};super.onDetachedFromWindow()}
}
