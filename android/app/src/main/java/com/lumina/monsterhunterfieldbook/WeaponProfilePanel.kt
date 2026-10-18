package com.lumina.monsterhunterfieldbook

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.graphics.*
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.view.animation.PathInterpolator
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.*
import org.json.JSONArray
import org.json.JSONObject
import java.lang.ref.WeakReference
import java.text.NumberFormat
import java.util.Locale
import java.util.WeakHashMap
import kotlin.math.max
import kotlin.math.min

object WeaponModel {
    private val parsed=WeakHashMap<FieldRecord,JSONObject>()
    private val known=mutableMapOf<String,WeakReference<FieldRecord>>()

    fun data(record:FieldRecord):JSONObject=synchronized(parsed){parsed.getOrPut(record){record.data()}}
    fun rawId(record:FieldRecord)=data(record).optString("id")
    fun register(records:List<FieldRecord>){records.forEach{known[rawId(it)]=WeakReference(it)}}
    fun record(id:String):FieldRecord?=known[id]?.get()
    fun parent(record:FieldRecord):String=data(record).optString("parent").takeIf{it!="null"}?:""
    fun elementNames(record:FieldRecord):List<String> = elements(record).map{it.first}
    fun elements(record:FieldRecord):List<Pair<String,JSONObject?>> {
        val raw=data(record).optJSONArray("elements")?:return emptyList()
        return (0 until raw.length()).mapNotNull{i->
            val value=raw.opt(i)
            val name=when(value){
                is JSONObject->value.optString("type").ifBlank{value.optString("name")}
                is String->value
                else->""
            }.takeIf{it.isNotBlank()}
            name?.let{it to (value as? JSONObject)}
        }
    }
    fun shown(value:Any?):String=if(value==null||value==JSONObject.NULL||value=="")"—"else value.toString()
    fun number(value:Any?):String{
        val number=when(value){is Number->value.toDouble();else->value?.toString()?.toDoubleOrNull()}
        if(number==null||!number.isFinite())return shown(value)
        return NumberFormat.getNumberInstance(Locale.US).apply{maximumFractionDigits=3}.format(number)
    }
    fun elementText(record:FieldRecord):String=elements(record).joinToString(" · "){(name,value)->
        val detail=value?.let{" ${shown(it.opt(if(it.isNull("value"))"damage"else "value"))}${if(it.optBoolean("hidden"))" (hidden)"else ""}"}?:""
        "$name$detail"
    }.ifBlank{"—"}
    fun slots(record:FieldRecord):List<Int> {
        val raw=data(record).optJSONArray("slots")?:return emptyList()
        return (0 until raw.length()).map{i->
            val item=raw.opt(i)
            if(item is JSONObject)item.optInt("level",item.optInt("rank"))else item.toString().toIntOrNull()?:0
        }.filter{it>0}
    }
    fun factText(value:Any?):String=when(value){
        is String->if(value.startsWith("data:")||Regex("^https?://").containsMatchIn(value))""else value
        is JSONArray->(0 until value.length()).joinToString(" "){factText(value.opt(it))}
        is JSONObject->value.keys().asSequence().filter{it !in setOf("source","sources","image","artUrl","artSource","url","path","data","maps")}.joinToString(" "){factText(value.opt(it))}
        else->""
    }
    fun matches(record:FieldRecord,state:JSONObject):Boolean{
        val data=data(record)
        if(state.optString("rank","all")!="all"&&data.optString("rank")!=state.optString("rank"))return false
        if(state.optString("rarity","all")!="all"&&data.opt("rarity").toString()!=state.optString("rarity"))return false
        val elements=elementNames(record)
        val elementFilter=state.optString("element","all")
        if(elementFilter!="all"&&!((elementFilter=="none"&&elements.isEmpty())||elementFilter in elements))return false
        val hasForge=data.optJSONObject("forge")!=null
        val hasUpgrade=data.optJSONObject("upgrade")!=null
        when(state.optString("obtain","all")){
            "forge"->if(!hasForge)return false
            "upgrade"->if(!hasUpgrade)return false
            "reward"->if(hasForge||hasUpgrade)return false
        }
        val haystack=(listOf(record.name)+elements+listOf(data.optString("family"),factText(data.opt("attributes")))).joinToString(" ").lowercase(Locale.ROOT)
        val tokens=state.optString("q").trim().lowercase(Locale.ROOT).split(Regex("\\s+")).filter{it.isNotBlank()}
        return tokens.all{it in haystack}
    }
    fun filtered(records:List<FieldRecord>,state:JSONObject,sort:String="source"):List<FieldRecord>{
        val rows=records.filter{matches(it,state)}
        return when(sort){
            "name"->rows.sortedWith(compareBy(String.CASE_INSENSITIVE_ORDER){it.name})
            "attack","rarity"->rows.sortedWith(compareByDescending<FieldRecord>{data(it).optDouble(sort,0.0)}.thenBy(String.CASE_INSENSITIVE_ORDER){it.name})
            else->rows
        }
    }
    fun visual(a:MainActivity,record:FieldRecord):String=record.image.ifBlank{
        a.libraryData.optJSONObject("nativeVisuals")?.optJSONObject("weaponTypes")
            ?.optJSONObject(data(record).optString("type"))
            ?.optJSONObject("rarityIcons")
            ?.optString(data(record).optInt("rarity",1).toString()).orEmpty()
    }
    fun effectPath(a:MainActivity,name:String):String{
        val effects=a.libraryData.optJSONObject("nativeVisuals")?.optJSONObject("effects")?:return ""
        val key=name.lowercase(Locale.ROOT).replace(Regex("[\\s_-]"),"").let{
            mapOf(
                "paralyze" to "paralysis","paralysisattack" to "paralysis","poisonattack" to "poison",
                "blastblight" to "blast","iceblight" to "ice","waterblight" to "water",
                "fireblight" to "fire","thunderblight" to "thunder","dragonblight" to "dragon"
            )[it]?:it
        }
        val match=effects.keys().asSequence().firstOrNull{it.lowercase(Locale.ROOT).replace(Regex("[\\s_-]"),"")==key}
        return match?.let{effects.optString(it)}.orEmpty()
    }
    fun icon(a:MainActivity,record:FieldRecord,size:Int=30)=ImageView(a).apply{
        scaleType=ImageView.ScaleType.FIT_CENTER
        contentDescription="${record.name}, rarity ${data(record).optInt("rarity",1)}"
        layoutParams=LinearLayout.LayoutParams(a.dp(size),a.dp(size))
        val path=visual(a,record)
        if(path.isNotBlank())a.assetImage(path,this)
    }
    fun rarityColour(rarity:Int):Int=Color.parseColor(
        arrayOf("#AAAAAA","#AAAAAA","#DEDEDE","#A1C42E","#48AB3F","#5CAEBB","#595CDA","#8D59EF","#C76D46","#B3436A","#0AD5FA","#FAC81E","#B4F5FF")[rarity.coerceIn(1,12)]
    )
}

private fun weaponElements(a:MainActivity,record:FieldRecord,size:Float,colour:Int):ViewGroup=WeaponFlowLayout(a,8,5).apply{
    val values=WeaponModel.elements(record)
    if(values.isEmpty())addView(a.text("—",size,colour=colour))
    values.forEach{(name,value)->addView(weaponElement(a,name,value,size,colour),ViewGroup.LayoutParams(-2,-2))}
}

private fun weaponElement(a:MainActivity,name:String,value:JSONObject?,size:Float,colour:Int)=a.row().apply{
    val effect=WeaponModel.effectPath(a,name)
    if(effect.isNotBlank()){
        val icon=ImageView(a).apply{
            scaleType=ImageView.ScaleType.FIT_CENTER
            importantForAccessibility=View.IMPORTANT_FOR_ACCESSIBILITY_NO
        }
        addView(icon,LinearLayout.LayoutParams(a.dp(18),a.dp(18)).apply{rightMargin=a.dp(7)})
        a.assetImage(effect,icon)
    }
    val detail=value?.let{" ${WeaponModel.shown(it.opt(if(it.isNull("value"))"damage"else "value"))}${if(it.optBoolean("hidden"))" (hidden)"else ""}"}?:""
    addView(a.text("$name$detail",size,colour=colour),LinearLayout.LayoutParams(-2,-2))
}

private class WeaponFlowLayout(private val a:MainActivity,gap:Int=8,rowGap:Int=8):ViewGroup(a) {
    private val gapPx=a.dp(gap)
    private val rowGapPx=a.dp(rowGap)
    private val positions=mutableListOf<Rect>()
    override fun generateDefaultLayoutParams()=LayoutParams(-2,-2)
    override fun onMeasure(widthMeasureSpec:Int,heightMeasureSpec:Int){
        val maxWidth=(MeasureSpec.getSize(widthMeasureSpec)-paddingLeft-paddingRight).coerceAtLeast(1)
        positions.clear()
        var x=0;var y=0;var lineHeight=0;var widest=0
        for(i in 0 until childCount){
            val child=getChildAt(i)
            if(child.visibility==GONE){positions+=Rect();continue}
            measureChild(child,MeasureSpec.makeMeasureSpec(maxWidth,MeasureSpec.AT_MOST),heightMeasureSpec)
            if(x>0&&x+child.measuredWidth>maxWidth){
                widest=max(widest,x-gapPx)
                y+=lineHeight+rowGapPx
                x=0
                lineHeight=0
            }
            positions+=Rect(paddingLeft+x,paddingTop+y,paddingLeft+x+child.measuredWidth,paddingTop+y+child.measuredHeight)
            x+=child.measuredWidth+gapPx
            lineHeight=max(lineHeight,child.measuredHeight)
        }
        widest=max(widest,(x-gapPx).coerceAtLeast(0))
        setMeasuredDimension(resolveSize(widest+paddingLeft+paddingRight,widthMeasureSpec),resolveSize(y+lineHeight+paddingTop+paddingBottom,heightMeasureSpec))
    }
    override fun onLayout(changed:Boolean,left:Int,top:Int,right:Int,bottom:Int){
        for(i in 0 until childCount){
            val rect=positions.getOrNull(i)?:continue
            getChildAt(i).layout(rect.left,rect.top,rect.right,rect.bottom)
        }
    }
}

private class WeaponDisclosureDrawable(private val a:MainActivity,private val group:ReadingGroup):Drawable() {
    private val paint=Paint(Paint.ANTI_ALIAS_FLAG).apply{
        style=Paint.Style.STROKE
        strokeWidth=a.dp(1.3f).toFloat()
        strokeCap=Paint.Cap.ROUND
        strokeJoin=Paint.Join.ROUND
    }
    override fun getIntrinsicWidth()=a.dp(17)
    override fun getIntrinsicHeight()=a.dp(17)
    override fun draw(canvas:Canvas){
        paint.color=a.muted
        val cx=bounds.exactCenterX()
        val cy=bounds.exactCenterY()
        val s=a.dp(4).toFloat()
        canvas.save()
        if(group.expanded)canvas.rotate(90f,cx,cy)
        val path=Path().apply{
            moveTo(cx-s/2f,cy-s)
            lineTo(cx+s/2f,cy)
            lineTo(cx-s/2f,cy+s)
        }
        canvas.drawPath(path,paint)
        canvas.restore()
    }
    override fun setAlpha(alpha:Int){paint.alpha=alpha}
    override fun setColorFilter(filter:ColorFilter?){paint.colorFilter=filter}
    @Deprecated("Drawable contract") override fun getOpacity()=PixelFormat.TRANSLUCENT
}

private class WeaponSharpnessView(a:MainActivity,private val values:List<Float>):View(a) {
    private val colours=intArrayOf(Color.rgb(197,64,54),Color.rgb(217,113,47),Color.rgb(216,189,82),Color.rgb(117,161,84),Color.rgb(82,147,202),Color.rgb(236,235,220),Color.rgb(168,131,206))
    private val paint=Paint(Paint.ANTI_ALIAS_FLAG)
    override fun onDraw(canvas:Canvas){
        val total=values.sum().takeIf{it>0f}?:1f
        var left=0f
        values.forEachIndexed{i,v->
            paint.color=colours[i.coerceAtMost(6)]
            val right=left+width*(v/total)
            canvas.drawRect(left,0f,right,height.toFloat(),paint)
            left=right
        }
    }
}

class WeaponMaterialsView(
    private val a:MainActivity,
    val record:FieldRecord,
    val state:JSONObject,
    val compact:Boolean=false,
    private val onSelect:(String)->Unit,
    private val onInfo:(String)->Unit={}
):LinearLayout(a) {
    private val data=WeaponModel.data(record)
    init{orientation=VERTICAL;render()}

    private fun render(){
        removeAllViews()
        if(!compact){
            val head=a.row().apply{gravity=Gravity.TOP}
            head.addView(WeaponModel.icon(a,record,36),LayoutParams(a.dp(40),a.dp(44)))
            head.addView(a.text(record.name,if(a.wide)27f else 25f,true).apply{setPadding(a.dp(12),0,a.dp(8),0)},LayoutParams(0,-2,1f))
            val save=FrameLayout(a)
            val glyph=GlyphView(a,"bookmark",if(a.isBookmarked(record.id))a.accent else a.muted)
            save.addView(glyph,FrameLayout.LayoutParams(a.dp(21),a.dp(21),Gravity.CENTER))
            fun sync(){
                val active=a.isBookmarked(record.id)
                save.contentDescription=if(active)"Remove saved entry"else "Save entry"
                glyph.colour=if(active)a.accent else a.muted
                glyph.invalidate()
                save.isSelected=active
            }
            a.touch(save){a.toggleBookmark(record.id);sync()}
            sync()
            head.addView(save,LayoutParams(a.dp(40),a.dp(40)))
            addView(head)
            a.gap(this,24)
            val stats=GridLayout(a).apply{columnCount=if(a.resources.configuration.screenWidthDp>=650)4 else 2}
            listOf(
                "Attack" to WeaponModel.shown(data.opt("attack")),
                "Affinity" to "${WeaponModel.shown(data.opt("affinity"))}%",
                "Rarity" to WeaponModel.shown(data.opt("rarity")),
                "Defense" to WeaponModel.shown(data.opt("defense")?:0)
            ).forEachIndexed{i,(label,value)->
                stats.addView(stat(label,a.text(value,15f)),GridLayout.LayoutParams().apply{
                    width=0
                    columnSpec=GridLayout.spec(i%stats.columnCount,1f)
                    rowSpec=GridLayout.spec(i/stats.columnCount)
                    setMargins(0,0,a.dp(18),a.dp(22))
                })
            }
            addView(stats,LayoutParams(-1,-2))
            addView(stat("Element / status",weaponElements(a,record,15f,a.ink)),LayoutParams(-1,-2).apply{bottomMargin=a.dp(22)})
            val slotValues=WeaponModel.slots(record)
            val slotRow=a.row().apply{gravity=Gravity.TOP}
            if(slotValues.isEmpty())slotRow.addView(a.text("None",15f,colour=a.muted))
            else slotValues.forEach{level->
                val chip=a.row().apply{
                    setPadding(a.dp(6),a.dp(5),a.dp(8),a.dp(5))
                    minimumHeight=a.dp(40)
                    background=a.surface(0)
                    val path=a.libraryData.optJSONObject("nativeVisuals")?.optJSONObject("slots")?.optString(level.toString()).orEmpty()
                    if(path.isNotBlank()){
                        val icon=ImageView(a).apply{scaleType=ImageView.ScaleType.FIT_CENTER}
                        addView(icon,LayoutParams(a.dp(20),a.dp(22)))
                        a.assetImage(path,icon)
                    }
                    addView(a.text("Lv $level",12f).apply{setPadding(a.dp(5),0,0,0)})
                    contentDescription="Find decorations fitting slot level $level"
                    a.touch(this){a.showCompatibleDecorations(level)}
                }
                slotRow.addView(chip,LayoutParams(-2,-2).apply{rightMargin=a.dp(7)})
            }
            addView(stat("Slots",slotRow),LayoutParams(-1,-2).apply{bottomMargin=a.dp(22)})
            sharpness()?.let{addView(stat("Sharpness",it),LayoutParams(-1,-2).apply{bottomMargin=a.dp(22)})}
            data.optJSONObject("attributes")?.let{attrs->
                attrs.keys().forEach{key->
                    val value=attrs.opt(key)
                    if(value!=null&&value!=JSONObject.NULL&&value!=""&&value!=false){
                        addView(stat(key.replace(Regex("([A-Z])")," $1"),a.text(value.toString(),15f)),LayoutParams(-1,-2).apply{bottomMargin=a.dp(22)})
                    }
                }
            }
        }
        val paths=listOf("forge","upgrade").filter{data.optJSONObject(it)!=null}
        if(paths.isNotEmpty()){
            if(state.optString("path") !in paths)state.put("path",if("upgrade" in paths)"upgrade"else "forge")
            val toggle=a.row().apply{contentDescription="Crafting path"}
            paths.forEach{path->
                val active=state.optString("path")==path
                val btn=a.button(if(path=="forge")"Forge"else "Upgrade"){state.put("path",path);render()}.apply{
                    background=a.surface(if(active)alphaColour(a.accent,24)else 0)
                    setTextColor(if(active)a.accent else a.muted)
                    isSelected=active
                }
                toggle.addView(btn,LayoutParams(0,a.dp(44),1f).apply{rightMargin=a.dp(7)})
            }
            addView(toggle)
            a.gap(this,16)
            val path=state.optString("path")
            val recipe=data.getJSONObject(path)
            if(!compact&&path=="upgrade"&&WeaponModel.parent(record).isNotBlank()){
                val parentId=WeaponModel.parent(record)
                val parentRow=a.row()
                parentRow.addView(a.text("From ",12f,colour=a.muted))
                val link=a.text(WeaponModel.record(parentId)?.name?:parentId,12f,colour=a.accent)
                a.touch(link){onSelect(parentId)}
                parentRow.addView(link,LayoutParams(0,-2,1f))
                addView(parentRow)
                a.gap(this,16)
            }
            val mats=recipe.optJSONArray("materials")
            if(mats==null||mats.length()==0)addView(a.text("—",15f,colour=a.muted))
            else for(i in 0 until mats.length()){
                val m=mats.optJSONObject(i)?:continue
                val name=m.optString("name")
                val row=a.row().apply{gravity=Gravity.CENTER_VERTICAL;setPadding(0,a.dp(7),0,a.dp(7))}
                val icon=ImageView(a).apply{
                    scaleType=ImageView.ScaleType.FIT_CENTER
                    importantForAccessibility=View.IMPORTANT_FOR_ACCESSIBILITY_NO
                }
                row.addView(icon,LayoutParams(a.dp(24),a.dp(24)).apply{rightMargin=a.dp(8)})
                row.addView(a.text(name,if(compact)14f else 15f,colour=a.accent),LayoutParams(0,-2,1f))
                if(m.has("quantity"))row.addView(a.text(" ×${WeaponModel.shown(m.opt("quantity"))}",if(compact)14f else 15f))
                row.contentDescription="$name${if(m.has("quantity"))", quantity ${WeaponModel.shown(m.opt("quantity"))}"else ""}"
                a.touch(row){a.showWeaponItem(name,m.optString("id"))}
                addView(row,LayoutParams(-1,-2))
                a.catalogue.executor.execute{
                    val hit=runCatching{a.catalogue.reference(name,"Items").firstOrNull{it.name.equals(name,true)}}.getOrNull()
                    a.runOnUiThread{
                        if(!a.isDestroyed&&!a.isFinishing&&isAttachedToWindow&&hit?.image?.isNotBlank()==true)a.assetImage(hit.image,icon)
                    }
                }
                if(m.has("points"))addView(a.text("${WeaponModel.shown(m.opt("points"))} pts each",10f,colour=a.muted).apply{setPadding(a.dp(32),0,0,a.dp(4))})
            }
            a.gap(this,14)
            addView(a.text(if(recipe.has("zenny")&&!recipe.isNull("zenny"))"${WeaponModel.number(recipe.opt("zenny"))} z"else "Price not supplied",if(compact)16f else 15f,colour=a.muted))
        }else{
            val obtain=data.opt("obtain")
            fun description(item:Any?):String=when(item){
                is JSONObject->item.optString("description").ifBlank{item.optString("method").ifBlank{item.optString("name")}}
                is String->item
                else->""
            }
            val text=when(obtain){
                is JSONArray->(0 until obtain.length()).joinToString("\n"){description(obtain.opt(it))}
                is JSONObject->description(obtain).ifBlank{"Quest or appraisal reward"}
                is String->obtain
                else->"Quest or appraisal reward"
            }
            val note=a.text(text,if(compact)14f else 15f)
            if(!compact){note.background=a.surface();a.pad(note,16)}
            addView(note)
        }
        if(compact){
            a.gap(this,12)
            val footer=a.row().apply{gravity=Gravity.END}
            footer.addView(a.button("Info"){onInfo(WeaponModel.rawId(record))},LayoutParams(a.dp(88),a.dp(42)))
            addView(footer)
        }
    }

    private fun stat(label:String,value:View)=a.column().apply{
        addView(a.text(label,12f,colour=a.muted))
        a.gap(this,7)
        addView(value,LayoutParams(-1,value.layoutParams?.height?:-2))
    }

    private fun sharpness():View?{
        val raw=data.opt("sharpness")?:return null
        val list=when(raw){
            is JSONArray->(0 until raw.length()).map{raw.opt(it)}
            is JSONObject->raw.keys().asSequence().map{raw.opt(it)}.toList()
            else->return null
        }
        if(!list.all{it is Number})return null
        return WeaponSharpnessView(a,list.map{(it as Number).toFloat()}).apply{
            layoutParams=LayoutParams(-1,a.dp(12))
            contentDescription="Sharpness: ${list.joinToString(" / ")}"
        }
    }
}

class WeaponProfilePanel(
    private val a:MainActivity,
    val guide:FieldRecord,
    val records:List<FieldRecord>,
    val state:JSONObject,
    private val close:()->Unit
):LinearLayout(a) {
    private val heading=a.row()
    private val tabs=a.row()
    private val host=FrameLayout(a)
    private val groups=mutableListOf<ReadingGroup>()
    private var scroll:ScrollView?=null
    private var list:ListView?=null
    private var treePanel:WeaponTreePanel?=null
    private val visible=mutableListOf<FieldRecord>()
    private var more:TextView?=null
    private var meta:TextView?=null
    private var filterToggle:TextView?=null
    private var filterPanel:View?=null
    private val handler=Handler(Looper.getMainLooper())
    private var pending:Runnable?=null
    private var restoring=false
    private var contentAnimation:ValueAnimator?=null
    private var renderedTab=""
    private var renderedDetail=false
    private var renderedId=""
    private val byId=records.associateBy{WeaponModel.rawId(it)}
    private val adapter=object:BaseAdapter(){
        override fun getCount()=visible.size
        override fun getItem(position:Int)=visible[position]
        override fun getItemId(position:Int)=position.toLong()
        override fun getView(position:Int,convertView:View?,parent:ViewGroup)=weaponRow(visible[position])
    }

    init {
        orientation=VERTICAL
        WeaponModel.register(records)
        if(!state.has("type"))state.put("type",guide.data().optString("id"))
        if(!state.has("tab"))state.put("tab","guide")
        if(!state.has("q"))state.put("q","")
        if(!state.has("family"))state.put("family","default")
        listOf("rank","rarity","element","obtain").forEach{if(!state.has(it))state.put(it,"all")}
        if(!state.has("path"))state.put("path","upgrade")
        if(!state.has("limit"))state.put("limit",40)
        if(!state.has("filtersOpen"))state.put("filtersOpen",false)
        if(!state.has("tree"))state.put("tree",JSONObject().put("zoom",1).put("x",0).put("y",0))
        if(!state.has("_memoryLoaded")){
            val memory=runCatching{JSONObject(a.prefs.text("filterMemory","{}"))}.getOrDefault(JSONObject()).optJSONObject("weapon:${state.optString("type")}")
            listOf("rank","rarity","element","obtain","family").forEach{if(memory?.has(it)==true)state.put(it,memory.opt(it))}
            state.put("_memoryLoaded",true)
        }
        heading.setPadding(a.dp(13),a.dp(10),a.dp(6),a.dp(10))
        heading.minimumHeight=a.dp(60)
        addView(heading,LayoutParams(-1,-2))
        a.rule(this)
        tabs.setPadding(a.dp(12),0,a.dp(12),0)
        addView(tabs,LayoutParams(-1,-2))
        addView(host,LayoutParams(-1,0,1f))
        render(false)
    }

    private fun saveFilters(){
        val all=runCatching{JSONObject(a.prefs.text("filterMemory","{}"))}.getOrDefault(JSONObject())
        val saved=JSONObject()
        listOf("rank","rarity","element","obtain","family").forEach{saved.put(it,state.opt(it))}
        all.put("weapon:${state.optString("type")}",saved)
        a.prefs.set("filterMemory",all.toString())
    }

    private fun capture(){
        list?.let{
            state.put("listPosition",it.firstVisiblePosition)
            state.put("listTop",it.getChildAt(0)?.top?:0)
        }
        scroll?.let{
            state.put(if(renderedTab=="guide")"guideScroll"else "detailScroll:$renderedId",it.scrollY)
        }
        treePanel?.snapshot()
    }

    fun snapshot():JSONObject{
        capture()
        saveFilters()
        return JSONObject(state.toString())
    }

    private fun trail():JSONArray=state.optJSONArray("_trail")?:JSONArray().also{state.put("_trail",it)}

    private fun checkpoint(){
        capture()
        val copy=JSONObject(state.toString()).apply{remove("_trail")}
        trail().put(copy)
    }

    fun back():Boolean{
        capture()
        if(state.optString("tab")=="tree"&&state.optBoolean("treeDetails")){
            if(treePanel?.closeMaterials()==true)return true
            state.put("treeDetails",false)
            render()
            return true
        }
        if(!state.optBoolean("detail"))return false
        val history=trail()
        if(history.length()>0){
            val previous=history.getJSONObject(history.length()-1)
            history.remove(history.length()-1)
            val kept=JSONArray(history.toString())
            state.keys().asSequence().toList().forEach{state.remove(it)}
            previous.keys().forEach{state.put(it,previous.opt(it))}
            state.put("_trail",kept)
        }else if(state.optString("detailOrigin")=="tree"){
            state.put("tab","tree").put("detail",false).put("detailOrigin",JSONObject.NULL).put("treeDetails",true)
        }else{
            state.put("detail",false).put("detailOrigin",JSONObject.NULL)
        }
        transitionContent(true){render(false)}
        return true
    }

    private fun select(rawId:String){
        if(rawId !in byId)return
        checkpoint()
        state.put("detailOrigin",if(state.optBoolean("detail"))"record"else "list")
        state.put("selected",rawId).put("detail",true).put("tab","database")
        render()
    }

    private fun showTreeInfo(rawId:String){
        if(rawId !in byId)return
        checkpoint()
        state.put("selected",rawId).put("tab","database").put("detail",true).put("detailOrigin","tree")
        render()
    }

    private fun render(animate:Boolean=false){
        handler.removeCallbacksAndMessages(null)
        pending=null
        scroll=null
        list=null
        treePanel=null
        more=null
        meta=null
        filterPanel=null
        filterToggle=null
        renderedTab=state.optString("tab","guide")
        renderedDetail=renderedTab=="database"&&state.optBoolean("detail")
        renderedId=state.optString("selected")
        buildHeading()
        buildTabs()
        host.removeAllViews()
        groups.clear()
        when(renderedTab){
            "database"->if(renderedDetail)renderDetails()else renderDatabase()
            "tree"->treePanel=WeaponTreePanel(a,records,state){showTreeInfo(it)}.also{host.addView(it,FrameLayout.LayoutParams(-1,-1))}
            else->renderGuide()
        }
        if(animate)arrival(190,false)
    }

    private fun buildHeading(){
        heading.removeAllViews()
        val selected=if(state.optBoolean("detail"))byId[renderedId]else null
        if(selected!=null){
            heading.addView(a.iconButton("back","Back to weapons"){back()},LayoutParams(a.dp(32),a.dp(44)))
            heading.addView(WeaponModel.icon(a,selected,29),LayoutParams(a.dp(29),a.dp(32)))
        }
        heading.addView(a.text(selected?.name?:guide.name,if(a.wide)22f else 20f,true).apply{setPadding(a.dp(if(selected==null)0 else 10),0,a.dp(8),0)},LayoutParams(0,-2,1f))
        if(selected!=null)heading.addView(a.text("Rarity ${WeaponModel.data(selected).optInt("rarity")}",10f,colour=a.muted),LayoutParams(-2,-2))
        heading.addView(a.iconButton("close","Close ${guide.name}",close),LayoutParams(a.dp(42),a.dp(44)))
    }

    private fun buildTabs(){
        tabs.removeAllViews()
        listOf("guide" to "Guide","database" to "Database","tree" to "Family Tree").forEach{(id,label)->
            val col=a.column()
            val active=state.optString("tab")==id
            val btn=a.button(label){
                if(state.optString("tab")!=id){
                    capture()
                    state.put("tab",id)
                    hideKeyboard()
                    buildTabs()
                    transitionContent(false){render(false)}
                }
            }.apply{
                setTextColor(if(active)a.accent else a.muted)
                background=ColorDrawable(0)
                textSize=13f*a.prefs.number("font",100)/100f
                setPadding(a.dp(6),a.dp(10),a.dp(6),a.dp(10))
                contentDescription="$label tab"
                isSelected=active
            }
            col.addView(btn,LayoutParams(-1,a.dp(48)))
            col.addView(View(a).apply{setBackgroundColor(if(active)a.accent else a.line)},LayoutParams(-1,a.dp(if(active)2 else 1)))
            tabs.addView(col,LayoutParams(0,-2,1f).apply{rightMargin=a.dp(8)})
        }
    }

    private fun transitionContent(returning:Boolean,replace:()->Unit){
        contentAnimation?.cancel()
        contentAnimation=null
        if(a.motionDuration(110)==0L||a.prefs.text("transition","liquid")=="none"){
            resetContentTransform()
            replace()
            return
        }
        val mode=a.prefs.text("transition","liquid")
        val startAlpha=host.alpha
        val startScale=host.scaleX
        val startY=host.translationY
        var cancelled=false
        contentAnimation=ValueAnimator.ofFloat(0f,1f).apply{
            duration=a.motionDuration(if(returning)190 else 110)
            interpolator=PathInterpolator(.42f,0f,1f,1f)
            addUpdateListener{animation->
                val t=animation.animatedValue as Float
                host.alpha=startAlpha+((if(mode=="liquid").25f else 0f)-startAlpha)*t
                if(mode=="slide")host.translationY=startY+(a.dp(10)-startY)*t
                if(mode=="zoom"){host.scaleX=startScale+(.97f-startScale)*t;host.scaleY=host.scaleX}
                blur(if(mode=="liquid")5f*t else 0f)
            }
            addListener(object:AnimatorListenerAdapter(){
                override fun onAnimationCancel(animation:Animator){cancelled=true}
                override fun onAnimationEnd(animation:Animator){
                    if(cancelled)return
                    resetContentTransform()
                    replace()
                    arrival(if(returning)170 else 190,returning)
                }
            })
            start()
        }
    }

    fun arrival(milliseconds:Long,returning:Boolean){
        val mode=if(returning)"return"else a.prefs.text("transition","liquid")
        if(a.motionDuration(milliseconds)==0L||mode=="none"){resetContentTransform();return}
        contentAnimation?.cancel()
        val fromAlpha=if(returning).55f else if(mode=="liquid").25f else 0f
        contentAnimation=ValueAnimator.ofFloat(0f,1f).apply{
            duration=a.motionDuration(milliseconds)
            interpolator=PathInterpolator(0f,0f,.58f,1f)
            addUpdateListener{animation->
                val t=animation.animatedValue as Float
                host.alpha=fromAlpha+(1f-fromAlpha)*t
                host.translationY=if(mode=="slide")a.dp(12)*(1f-t)else 0f
                host.scaleX=if(mode=="zoom").97f+.03f*t else 1f
                host.scaleY=host.scaleX
                blur(if(mode=="return")0f else (1f-t)*(if(mode=="liquid")5f else 1.5f))
            }
            addListener(object:AnimatorListenerAdapter(){
                override fun onAnimationEnd(animation:Animator){resetContentTransform()}
            })
            start()
        }
    }

    private fun blur(radius:Float){
        if(Build.VERSION.SDK_INT>=31){
            host.setRenderEffect(if(radius>.05f)RenderEffect.createBlurEffect(a.dp(radius).coerceAtLeast(1).toFloat(),a.dp(radius).coerceAtLeast(1).toFloat(),Shader.TileMode.CLAMP)else null)
        }
    }

    fun resetContentTransform(){
        host.alpha=1f
        host.translationY=0f
        host.scaleX=1f
        host.scaleY=1f
        blur(0f)
    }

    private fun contentScroll():Pair<ScrollView,LinearLayout>{
        val scroller=ScrollView(a).apply{isFillViewport=true;clipToPadding=false}
        val body=a.column().apply{setPadding(a.dp(if(a.wide)24 else 18),a.dp(16),a.dp(if(a.wide)24 else 18),a.dp(28))}
        scroller.addView(body)
        host.addView(scroller,FrameLayout.LayoutParams(-1,-1))
        scroll=scroller
        return scroller to body
    }

    private fun renderGuide(){
        val (scroller,body)=contentScroll()
        val g=guide.data()
        val chips=WeaponFlowLayout(a,8,10)
        fun pill(label:String,highlight:Boolean=false)=a.text(label,10f,colour=if(highlight)a.accent else a.muted).apply{
            background=a.surface(0,true,2f)
            setPadding(a.dp(8),a.dp(4),a.dp(8),a.dp(4))
        }
        chips.addView(pill(g.optString("role"),true),ViewGroup.LayoutParams(-2,-2))
        chips.addView(pill("${g.optString("complexity")} learning curve"),ViewGroup.LayoutParams(-2,-2))
        chips.addView(bookmark(guide.id),ViewGroup.LayoutParams(a.dp(40),a.dp(36)))
        body.addView(chips)
        a.gap(body,18)
        fun fold(title:String,key:String,fill:(LinearLayout)->Unit){
            val group=ReadingGroup(a,"${guide.id}:$key",title,groups,false,fill)
            group.background=ColorDrawable(0)
            (group.getChildAt(0) as? TextView)?.apply{
                background=ColorDrawable(0)
                setPadding(a.dp(4),a.dp(18),a.dp(4),a.dp(18))
                minHeight=a.dp(56)
                textSize=15f*a.prefs.number("font",100)/100f
                setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,WeaponDisclosureDrawable(a,group),null)
            }
            group.getChildAt(1)?.setPadding(a.dp(28),a.dp(5),a.dp(4),a.dp(24))
            body.addView(group,LayoutParams(-1,-2))
            a.rule(body)
        }
        fun bullets(parent:LinearLayout,items:JSONArray?){
            if(items==null)return
            for(i in 0 until items.length()){
                val line=a.row().apply{gravity=Gravity.TOP}
                line.addView(a.text("•",14f),LayoutParams(a.dp(20),-2))
                line.addView(a.text(items.optString(i),14f),LayoutParams(0,-2,1f))
                parent.addView(line)
                if(i<items.length()-1)a.gap(parent,12)
            }
        }
        fun paragraph(parent:LinearLayout,text:String){parent.addView(a.text(text,14f));a.gap(parent,12)}
        fold("Strengths","strengths"){bullets(it,g.optJSONArray("strengths"))}
        fold("Tradeoffs","tradeoffs"){bullets(it,g.optJSONArray("tradeoffs"))}
        fold("Movement & reach","movement"){paragraph(it,g.optString("mobility"));paragraph(it,g.optString("reach"))}
        fold("Defensive options","defense"){paragraph(it,g.optString("defense"))}
        a.gap(body,22)
        body.addView(a.text("World foundation loop",20f,true))
        a.gap(body,12)
        loops(body,g.optJSONArray("loop"))
        if(a.isIce){
            a.gap(body,18)
            advice(body,"ICEBORNE",g.optString("iceborne"))
            g.optJSONArray("iceborneLoop")?.takeIf{it.length()>0}?.let{a.gap(body,12);loops(body,it)}
        }
        a.gap(body,18)
        fold("Useful skills","skills"){bullets(it,g.optJSONArray("skills"))}
        fold("Common mistakes","mistakes"){bullets(it,g.optJSONArray("mistakes"))}
        a.gap(body,20)
        val progression=if(a.isIce)g.optString("iceborneProgression").ifBlank{g.optString("progression")}else g.optString("worldProgression").ifBlank{g.optString("progression")}
        advice(body,"EQUIPMENT DIRECTION",progression)
        scroller.post{scroller.scrollTo(0,state.optInt("guideScroll"))}
    }

    private fun loops(parent:LinearLayout,values:JSONArray?){
        if(values==null)return
        val columns=if(a.resources.configuration.screenWidthDp>780)4 else 2
        var current:LinearLayout?=null
        for(i in 0 until values.length()){
            if(i%columns==0){
                current=a.row().apply{gravity=Gravity.TOP}
                parent.addView(current,LayoutParams(-1,-2).apply{bottomMargin=a.dp(8)})
            }
            val card=a.column().apply{
                background=a.surface()
                setPadding(a.dp(14),a.dp(12),a.dp(14),a.dp(14))
                addView(a.text(String.format(Locale.US,"%02d",i+1),10f,colour=a.accent))
                a.gap(this,5)
                addView(a.text(values.optString(i),12f))
            }
            current!!.addView(card,LayoutParams(0,-2,1f).apply{rightMargin=a.dp(8)})
            if(i==values.length()-1){
                repeat(columns-1-i%columns){current!!.addView(View(a),LayoutParams(0,1,1f))}
            }
        }
    }

    private fun advice(parent:LinearLayout,label:String,value:String){
        val card=a.column().apply{background=a.surface(blend(a.panel,a.accent,.035f))}
        a.pad(card,16)
        card.addView(a.textBold(label,10f,a.accent).apply{letterSpacing=.14f})
        a.gap(card,10)
        card.addView(a.text(value,14f))
        parent.addView(card,LayoutParams(-1,-2))
    }

    private fun bookmark(id:String)=FrameLayout(a).apply{
        val glyph=GlyphView(a,"bookmark",if(a.isBookmarked(id))a.accent else a.muted)
        addView(glyph,FrameLayout.LayoutParams(a.dp(21),a.dp(21),Gravity.CENTER))
        fun sync(){
            val active=a.isBookmarked(id)
            glyph.colour=if(active)a.accent else a.muted
            glyph.invalidate()
            contentDescription=if(active)"Remove saved entry"else "Save entry"
            isSelected=active
            background=a.surface(if(active)alphaColour(a.accent,20)else 0,active,3f)
        }
        a.touch(this){a.toggleBookmark(id);sync()}
        sync()
    }

    private fun renderDatabase(){
        val body=a.column().apply{setPadding(a.dp(12),a.dp(14),a.dp(12),a.dp(12))}
        host.addView(body,FrameLayout.LayoutParams(-1,-1))
        val bar=a.row().apply{setPadding(a.dp(10),a.dp(9),a.dp(10),a.dp(9));background=a.surface()}
        val searchBox=a.row().apply{background=a.surface(a.bg)}
        searchBox.addView(GlyphView(a,"search",a.muted),LayoutParams(a.dp(18),a.dp(18)).apply{leftMargin=a.dp(10)})
        val input=EditText(a).apply{
            hint="Search"
            isSingleLine=true
            setTextColor(a.ink)
            setHintTextColor(a.muted)
            typeface=a.text("").typeface
            textSize=14f*a.prefs.number("font",100)/100f
            setText(state.optString("q"))
            background=ColorDrawable(0)
            contentDescription="Search this weapon database"
            imeOptions=EditorInfo.IME_ACTION_SEARCH
            setPadding(a.dp(10),a.dp(8),a.dp(4),a.dp(8))
        }
        searchBox.addView(input,LayoutParams(0,a.dp(44),1f))
        val clear=a.iconButton("close","Clear search"){input.setText("");input.requestFocus()}.apply{
            visibility=if(input.text.isNullOrEmpty())GONE else VISIBLE
        }
        searchBox.addView(clear,LayoutParams(a.dp(35),a.dp(42)))
        bar.addView(searchBox,LayoutParams(0,-2,1f))
        val toggle=a.button(filterLabel()){
            val open=!state.optBoolean("filtersOpen")
            state.put("filtersOpen",open)
            filterPanel?.visibility=if(open)VISIBLE else GONE
            filterToggle?.contentDescription="Filters, ${if(open)"expanded"else "collapsed"}"
        }.apply{
            setPadding(a.dp(9),a.dp(7),a.dp(9),a.dp(7))
            contentDescription="Filters, ${if(state.optBoolean("filtersOpen"))"expanded"else "collapsed"}"
        }
        filterToggle=toggle
        bar.addView(toggle,LayoutParams(-2,a.dp(44)).apply{leftMargin=a.dp(8)})
        body.addView(bar)
        val filterScroll=object:ScrollView(a){
            override fun onMeasure(widthMeasureSpec:Int,heightMeasureSpec:Int){
                val cap=((host.height.takeIf{it>0}?:resources.displayMetrics.heightPixels)*.45f).toInt()
                super.onMeasure(widthMeasureSpec,MeasureSpec.makeMeasureSpec(cap,MeasureSpec.AT_MOST))
            }
        }
        val filters=a.column().apply{background=a.surface();a.pad(this,14)}
        filterScroll.addView(filters)
        filterScroll.visibility=if(state.optBoolean("filtersOpen"))VISIBLE else GONE
        filterPanel=filterScroll
        body.addView(filterScroll,LayoutParams(-1,-2))
        val grid=GridLayout(a).apply{columnCount=if(resources.configuration.screenWidthDp>780)4 else 2}
        filters.addView(grid,LayoutParams(-1,-2))
        choices(grid,"Rank","rank",listOf("all" to "All","LR" to "Low Rank","HR" to "High Rank","MR" to "Master Rank"))
        val rarities=records.map{WeaponModel.data(it).optInt("rarity")}.distinct().sorted().map{"$it" to "Rarity $it"}
        choices(grid,"Rarity","rarity",listOf("all" to "All")+rarities)
        val elements=records.flatMap{WeaponModel.elementNames(it)}.distinct().sorted().map{it to it}
        choices(grid,"Element / status","element",listOf("all" to "All","none" to "No element")+elements)
        choices(grid,"Obtain","obtain",listOf("all" to "All","forge" to "Forge","upgrade" to "Upgrade","reward" to "Rewards"))
        filters.addView(a.button("Clear filters"){
            capture()
            listOf("rank","rarity","element","obtain").forEach{state.put(it,"all")}
            state.put("limit",40)
            state.put("listPosition",0).put("listTop",0)
            saveFilters()
            render()
        }.apply{background=ColorDrawable(0);setTextColor(a.accent);gravity=Gravity.START or Gravity.CENTER_VERTICAL})
        meta=a.text("",11f,colour=a.muted).apply{setPadding(a.dp(14),a.dp(10),a.dp(14),a.dp(10))}
        body.addView(meta)
        val listView=ListView(a).apply{
            divider=ColorDrawable(a.line)
            dividerHeight=a.dp(1)
            cacheColorHint=0
            isVerticalScrollBarEnabled=true
            setFooterDividersEnabled(false)
            background=a.surface(0)
            contentDescription="Weapons"
        }
        val moreBtn=a.button(""){}
        more=moreBtn
        listView.addFooterView(moreBtn,null,false)
        listView.adapter=adapter
        a.touch(moreBtn){
            capture()
            state.put("limit",state.optInt("limit",40)+40)
            updateRows(false)
        }
        listView.setOnScrollListener(object:AbsListView.OnScrollListener{
            override fun onScrollStateChanged(v:AbsListView?,scrollState:Int){if(scrollState!=0)hideKeyboard()}
            override fun onScroll(v:AbsListView?,first:Int,count:Int,total:Int){
                if(!restoring){
                    state.put("listPosition",first)
                    state.put("listTop",listView.getChildAt(0)?.top?:0)
                }
            }
        })
        list=listView
        body.addView(listView,LayoutParams(-1,0,1f))
        updateRows(false)
        input.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s:CharSequence?,start:Int,count:Int,after:Int)=Unit
            override fun onTextChanged(s:CharSequence?,start:Int,before:Int,count:Int){
                state.put("q",s?.toString()?:"").put("limit",40).put("listPosition",0).put("listTop",0)
                clear.visibility=if(s.isNullOrEmpty())GONE else VISIBLE
                pending?.let{handler.removeCallbacks(it)}
                pending=Runnable{updateRows(true)}.also{handler.postDelayed(it,80)}
            }
            override fun afterTextChanged(s:Editable?)=Unit
        })
        input.setOnEditorActionListener{_,action,_->if(action==EditorInfo.IME_ACTION_SEARCH){hideKeyboard();true}else false}
    }

    private fun filterLabel():String{
        val active=listOf("rank","rarity","element","obtain").count{state.optString(it,"all")!="all"}
        return "Filters${if(active>0)"  $active"else ""}"
    }

    private fun choices(parent:GridLayout,label:String,key:String,values:List<Pair<String,String>>){
        val col=a.column()
        col.addView(a.text(label,11f,colour=a.muted))
        val spinner=Spinner(a).apply{contentDescription=label;background=a.surface(a.bg)}
        val textAdapter=object:ArrayAdapter<String>(a,android.R.layout.simple_spinner_item,values.map{it.second}){
            override fun getView(position:Int,convertView:View?,parent:ViewGroup)=(super.getView(position,convertView,parent) as TextView).apply{
                setTextColor(a.ink);typeface=a.text("").typeface;textSize=13f;setPadding(a.dp(10),a.dp(8),a.dp(10),a.dp(8))
            }
            override fun getDropDownView(position:Int,convertView:View?,parent:ViewGroup)=(super.getDropDownView(position,convertView,parent) as TextView).apply{
                setTextColor(a.ink);setBackgroundColor(a.panel);typeface=a.text("").typeface;textSize=13f;setPadding(a.dp(14),a.dp(12),a.dp(14),a.dp(12))
            }
        }.apply{setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)}
        spinner.adapter=textAdapter
        val initial=values.indexOfFirst{it.first==state.optString(key,"all")}.coerceAtLeast(0)
        spinner.setSelection(initial)
        var current=values[initial].first
        spinner.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p:AdapterView<*>?,v:View?,position:Int,id:Long){
                val next=values[position].first
                if(next==current)return
                current=next
                state.put(key,next).put("limit",40).put("listPosition",0).put("listTop",0)
                saveFilters()
                updateRows(true)
            }
            override fun onNothingSelected(p:AdapterView<*>?)=Unit
        }
        col.addView(spinner,LayoutParams(-1,a.dp(44)).apply{topMargin=a.dp(9)})
        val index=parent.childCount
        parent.addView(col,GridLayout.LayoutParams().apply{
            width=0
            columnSpec=GridLayout.spec(index%parent.columnCount,1f)
            rowSpec=GridLayout.spec(index/parent.columnCount)
            rightMargin=a.dp(if(index%parent.columnCount!=parent.columnCount-1)12 else 0)
            bottomMargin=a.dp(15)
        })
    }

    fun updateRows(reset:Boolean){
        val all=WeaponModel.filtered(records,state,a.prefs.text("sortWeapons","source"))
        val limit=state.optInt("limit",40).coerceAtLeast(40)
        restoring=true
        visible.clear()
        visible.addAll(all.take(limit))
        meta?.text="${all.size} weapons"
        filterToggle?.text=filterLabel()
        more?.apply{
            text=if(all.isEmpty())"No matching weapons."else "Show more · ${min(limit,all.size)} of ${all.size}"
            visibility=if(all.isEmpty()||all.size>limit)VISIBLE else GONE
            isEnabled=all.isNotEmpty()
        }
        adapter.notifyDataSetChanged()
        list?.post{
            list?.setSelectionFromTop(if(reset)0 else state.optInt("listPosition"),if(reset)0 else state.optInt("listTop"))
            restoring=false
        }
    }

    fun weaponRow(record:FieldRecord):View{
        val data=WeaponModel.data(record)
        val row=a.row().apply{
            gravity=Gravity.CENTER_VERTICAL
            setPadding(a.dp(14),a.dp(13),a.dp(14),a.dp(13))
            minimumHeight=a.dp(76)
        }
        row.addView(WeaponModel.icon(a,record,32),LayoutParams(a.dp(42),a.dp(42)))
        val info=a.column()
        val top=a.row().apply{gravity=Gravity.TOP}
        top.addView(a.textBold(record.name,14f,a.accent),LayoutParams(0,-2,1f))
        top.addView(a.text("Rarity ${data.optInt("rarity")}",10f,colour=a.muted).apply{setPadding(a.dp(10),0,0,0)})
        info.addView(top)
        a.gap(info,5)
        val sub=WeaponFlowLayout(a,7,3)
        sub.addView(a.text("${data.optString("rank")}  ·  Attack ${WeaponModel.number(data.opt("attack"))}  ·  Affinity ${WeaponModel.shown(data.opt("affinity"))}%",12f,colour=a.muted),ViewGroup.LayoutParams(-2,-2))
        if(WeaponModel.elementNames(record).isNotEmpty()){
            sub.addView(a.text("·",12f,colour=a.muted),ViewGroup.LayoutParams(-2,-2))
            WeaponModel.elements(record).forEach{(name,value)->sub.addView(weaponElement(a,name,value,12f,a.muted),ViewGroup.LayoutParams(-2,-2))}
        }
        info.addView(sub)
        row.addView(info,LayoutParams(0,-2,1f).apply{leftMargin=a.dp(12)})
        if(WeaponModel.rawId(record)==state.optString("selected"))row.background=a.surface(alphaColour(a.accent,14),false)
        a.touch(row){capture();hideKeyboard();select(WeaponModel.rawId(record))}
        return row
    }

    private fun renderDetails(){
        val record=byId[state.optString("selected")]
        if(record==null){state.put("detail",false);render(false);return}
        val (scroller,body)=contentScroll()
        body.setPadding(a.dp(if(a.wide)29 else 20),a.dp(12),a.dp(if(a.wide)29 else 20),a.dp(25))
        body.addView(WeaponMaterialsView(a,record,state,false,{select(it)}),LayoutParams(-1,-2))
        scroller.post{scroller.scrollTo(0,state.optInt("detailScroll:${WeaponModel.rawId(record)}"))}
    }

    fun hideKeyboard(){
        (a.getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as? InputMethodManager)?.hideSoftInputFromWindow(windowToken,0)
    }

    override fun onDetachedFromWindow(){
        capture()
        saveFilters()
        contentAnimation?.cancel()
        handler.removeCallbacksAndMessages(null)
        super.onDetachedFromWindow()
    }
}
