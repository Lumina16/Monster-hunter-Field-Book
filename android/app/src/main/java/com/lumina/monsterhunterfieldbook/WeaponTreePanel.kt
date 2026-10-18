package com.lumina.monsterhunterfieldbook

import android.content.res.ColorStateList
import android.graphics.*
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import android.os.Bundle
import android.os.SystemClock
import android.text.TextUtils
import android.view.*
import android.view.accessibility.AccessibilityNodeInfo
import android.view.animation.DecelerateInterpolator
import android.widget.*
import org.json.JSONObject
import kotlin.math.exp
import kotlin.math.hypot
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt

object WeaponTreeLayout {
    const val BASE_SCALE=.5f
    const val NODE_WIDTH=232f
    const val NODE_HEIGHT=88f
    const val DEPTH_GAP=270f
    const val LEAF_GAP=116f

    data class Position(val x:Float,val y:Float)
    data class Graph(
        val family:String,
        val roots:List<FieldRecord>,
        val records:List<FieldRecord>,
        val positions:Map<String,Position>,
        val selected:String,
        val width:Float,
        val height:Float,
        val rootY:Float
    )

    fun rawId(record:FieldRecord):String=WeaponModel.data(record).let{if(it.isNull("id"))record.id else it.optString("id").ifBlank{record.id}}
    fun parentId(record:FieldRecord):String=WeaponModel.data(record).let{if(it.isNull("parent"))""else it.optString("parent")}

    fun rootOf(record:FieldRecord,byId:Map<String,FieldRecord>):FieldRecord {
        var current=record
        val seen=linkedSetOf<String>()
        while(seen.add(rawId(current))){
            val parent=byId[parentId(current)]?:break
            if(rawId(parent) in seen)break
            current=parent
        }
        return current
    }

    fun build(records:List<FieldRecord>,requestedFamily:String,selected:String):Graph {
        val byId=records.associateBy{rawId(it)}
        val rootMap=linkedMapOf<String,FieldRecord>()
        records.forEach{val root=rootOf(it,byId);rootMap[rawId(root)]=root}
        val activeFamily=if(requestedFamily=="default"||(requestedFamily!="all"&&requestedFamily !in byId)){
            val chosen=byId[selected]?.let{rootOf(it,byId)}
                ?:rootMap.values.firstOrNull{Regex("ore tree|bone tree",RegexOption.IGNORE_CASE).containsMatchIn(WeaponModel.data(it).optString("family"))}
                ?:rootMap.values.firstOrNull()
            chosen?.let{rawId(it)}?:"all"
        }else requestedFamily
        val children=linkedMapOf<String,MutableList<FieldRecord>>()
        records.forEach{children.getOrPut(parentId(it)){mutableListOf()}+=it}
        var leaf=0
        val positions=linkedMapOf<String,Position>()
        val visited=linkedSetOf<String>()
        fun visit(record:FieldRecord,depth:Int){
            val id=rawId(record)
            if(!visited.add(id))return
            val kids=children[id].orEmpty()
            val start=leaf
            kids.forEach{visit(it,depth+1)}
            if(kids.isEmpty())leaf++
            val row=if(kids.isNotEmpty())(start+leaf-1)/2f else start.toFloat()
            positions[id]=Position(depth*DEPTH_GAP,row*LEAF_GAP)
        }
        rootMap.forEach{(id,root)->
            if(activeFamily=="all"||activeFamily==id){
                visit(root,0)
                leaf++
            }
        }
        val shown=records.filter{rawId(it) in positions}
        val activeSelected=if(selected in positions)selected else shown.firstOrNull()?.let{rawId(it)}?:""
        val width=max(400f,positions.values.maxOfOrNull{it.x+NODE_WIDTH+20f}?:400f)
        val height=max(250f,leaf*LEAF_GAP)
        val rootY=positions[activeFamily]?.y?:0f
        return Graph(activeFamily,rootMap.values.toList(),shown,positions,activeSelected,width,height,rootY)
    }

    fun clampPan(value:Float,viewport:Float,content:Float):Float {
        val minPan=min(16f,viewport-content-24f)-viewport*.25f
        val maxPan=max(16f,viewport*.5f)
        return min(maxPan,max(minPan,value))
    }
}

class WeaponTreePanel(
    private val a:MainActivity,
    private val records:List<FieldRecord>,
    val state:JSONObject,
    private val onInfo:(String)->Unit
):LinearLayout(a) {
    private val density=resources.displayMetrics.density
    private val compact=resources.configuration.screenWidthDp<=780
    private val shell=FrameLayout(a)
    private val familySelector=Spinner(a,Spinner.MODE_DROPDOWN)
    private val zoomLabel=a.text("100%",if(compact)11f else 12f,colour=a.muted)
    private val materialHost=MaterialHost()
    private var graph=WeaponTreeLayout.build(records,state.optString("family","default"),state.optString("selected"))
    private val viewport=TreeViewport()
    private var materialVersion=0
    private var selectorReady=false
    private val pendingIcons=mutableMapOf<String,MutableList<ImageView>>()

    private data class TreeGesture(val zoom:Float,val x:Float,val y:Float,val midX:Float,val midY:Float,val distance:Float)

    init {
        orientation=VERTICAL
        addView(shell,LayoutParams(-1,-1))
        val content=a.column()
        shell.addView(content,FrameLayout.LayoutParams(-1,-1))
        val toolbar=object:LinearLayout(a){
            init{orientation=HORIZONTAL;gravity=Gravity.CENTER_VERTICAL}
            override fun onMeasure(widthMeasureSpec:Int,heightMeasureSpec:Int){
                val available=MeasureSpec.getSize(widthMeasureSpec)-paddingLeft-paddingRight
                val reserved=a.dp(if(compact)111 else 125)
                familySelector.layoutParams.width=min(a.dp(340),min((available*.7f).roundToInt(),max(0,available-reserved)))
                super.onMeasure(widthMeasureSpec,heightMeasureSpec)
            }
        }.apply{
            minimumHeight=a.dp(58)
            setPadding(a.dp(if(compact)8 else 12),a.dp(if(compact)8 else 9),a.dp(if(compact)8 else 12),a.dp(if(compact)8 else 9))
        }
        familySelector.contentDescription="Weapon family"
        familySelector.background=a.surface()
        toolbar.addView(familySelector,LayoutParams(0,a.dp(40)))
        toolbar.addView(View(a),LayoutParams(0,1,1f))
        zoomLabel.gravity=Gravity.CENTER
        zoomLabel.contentDescription="Tree zoom, 100 percent"
        toolbar.addView(zoomLabel,LayoutParams(-2,a.dp(40)).apply{marginStart=a.dp(if(compact)9 else 12)})
        val reset=a.button("Reset"){resetViewport()}.apply{
            minHeight=a.dp(40)
            minimumHeight=a.dp(40)
            setPadding(a.dp(if(compact)9 else 12),0,0,0)
            background=null
            setTextColor(a.accent)
            contentDescription="Reset weapon tree view"
        }
        toolbar.addView(reset,LayoutParams(-2,a.dp(40)))
        content.addView(toolbar,LayoutParams(-1,-2))
        a.rule(content)
        content.addView(viewport,LayoutParams(-1,0,1f))
        val margin=a.dp(if(compact)6 else 10)
        shell.addView(materialHost,FrameLayout.LayoutParams(-1,-2,Gravity.BOTTOM).apply{leftMargin=margin;rightMargin=margin;bottomMargin=margin})
        materialHost.visibility=View.GONE
        writeGraphState()
        bindFamilies()
        viewport.populate()
        if(state.optBoolean("treeDetails"))showMaterials(false)
    }

    fun snapshot():JSONObject=state

    fun logicalZoom():Float=treeState().optDouble("zoom",1.0).toFloat()

    private fun treeState():JSONObject=state.optJSONObject("tree")?:JSONObject().put("zoom",1).put("x",16).put("y",16).also{state.put("tree",it)}

    private fun units(value:Float):Float=value*density

    private fun selectedId():String=state.optString("selected").let{if(it=="null")""else it}

    private fun writeGraphState(){
        if(state.optString("family","default")!=graph.family)state.put("treeInitialized",false)
        state.put("family",graph.family)
        state.put("selected",if(graph.selected.isEmpty())JSONObject.NULL else graph.selected)
    }

    private fun bindFamilies(){
        val labels=listOf("All")+graph.roots.map{
            val family=WeaponModel.data(it).optString("family")
            if(family.isBlank())it.name else "$family · ${it.name}"
        }
        val ids=listOf("all")+graph.roots.map{WeaponTreeLayout.rawId(it)}
        familySelector.adapter=object:ArrayAdapter<String>(a,android.R.layout.simple_spinner_item,labels){
            override fun getView(position:Int,recycled:View?,parent:ViewGroup):View=a.row().apply{
                setPadding(a.dp(8),0,a.dp(7),0)
                addView(a.text(labels[position],12f).apply{maxLines=1;ellipsize=TextUtils.TruncateAt.END},LayoutParams(0,-2,1f))
                addView(a.text("⌄",14f,colour=a.muted),LayoutParams(-2,-2))
            }
            override fun getDropDownView(position:Int,recycled:View?,parent:ViewGroup):View=a.text(labels[position],12f).apply{
                setPadding(a.dp(12),a.dp(11),a.dp(12),a.dp(11))
                setBackgroundColor(a.panel)
                minHeight=a.dp(44)
            }
        }
        familySelector.setSelection(ids.indexOf(graph.family).coerceAtLeast(0),false)
        familySelector.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent:AdapterView<*>?,view:View?,position:Int,id:Long){
                if(!selectorReady){
                    selectorReady=true
                    if(ids[position]==graph.family)return
                }
                val next=ids[position]
                if(next==state.optString("family"))return
                state.put("family",next).put("treeInitialized",false).put("treeDetails",false)
                hideMaterials(false)
                graph=WeaponTreeLayout.build(records,next,selectedId())
                writeGraphState()
                viewport.populate()
                viewport.post{if(viewport.width>0&&viewport.height>0)resetViewport()}
            }
            override fun onNothingSelected(parent:AdapterView<*>?)=Unit
        }
    }

    fun resetViewport(){
        if(viewport.width==0||viewport.height==0){
            viewport.post{if(viewport.width>0&&viewport.height>0)resetViewport()}
            return
        }
        val initialY=min(16f,(viewport.height/density)*.35f-graph.rootY*WeaponTreeLayout.BASE_SCALE)
        state.put("tree",JSONObject().put("zoom",1).put("x",16).put("y",initialY))
        state.put("treeInitialized",true)
        viewport.updateTransform()
    }

    fun closeMaterials():Boolean{
        if(!state.optBoolean("treeDetails"))return false
        state.put("treeDetails",false)
        hideMaterials(true)
        return true
    }

    private fun select(record:FieldRecord){
        state.put("selected",WeaponTreeLayout.rawId(record)).put("treeDetails",true)
        viewport.updateSelection()
        showMaterials(true)
    }

    private fun showMaterials(animate:Boolean){
        val record=graph.records.firstOrNull{WeaponTreeLayout.rawId(it)==selectedId()}?:return
        val wasHidden=materialHost.visibility!=View.VISIBLE||materialHost.alpha<1f
        materialVersion++
        materialHost.animate().cancel()
        materialHost.removeAllViews()
        val head=a.row().apply{
            setPadding(a.dp(16),a.dp(13),a.dp(16),a.dp(13))
            addView(a.text(record.name,if(compact)17f else 18f,true).apply{setLineSpacing(0f,1.5f)},LayoutParams(0,-2,1f))
            addView(a.iconButton("close","Close weapon materials"){closeMaterials()},LayoutParams(a.dp(36),a.dp(36)).apply{marginStart=a.dp(10)})
        }
        materialHost.addView(head)
        a.rule(materialHost)
        val scroll=ScrollView(a).apply{
            isFillViewport=false
            overScrollMode=View.OVER_SCROLL_IF_CONTENT_SCROLLS
        }
        val materials=WeaponMaterialsView(
            a,
            record,
            state,
            true,
            {parentId->graph.records.firstOrNull{WeaponTreeLayout.rawId(it)==parentId}?.let{select(it)}},
            {id->onInfo(id)}
        ).apply{
            val pad=a.dp(if(compact)14 else 18)
            setPadding(pad,pad,pad,pad)
        }
        scroll.addView(materials,FrameLayout.LayoutParams(-1,-2))
        materialHost.addView(scroll,LayoutParams(-1,-2))
        materialHost.visibility=View.VISIBLE
        materialHost.isEnabled=true
        materialHost.alpha=1f
        materialHost.translationY=0f
        if(wasHidden&&animate&&a.motionDuration(170)>0){
            materialHost.alpha=0f
            materialHost.translationY=units(5f)
            materialHost.animate().alpha(1f).translationY(0f).setDuration(a.motionDuration(170)).setInterpolator(DecelerateInterpolator()).start()
        }
        materialHost.requestLayout()
    }

    private fun hideMaterials(animate:Boolean){
        val token=++materialVersion
        materialHost.animate().cancel()
        if(materialHost.visibility!=View.VISIBLE)return
        materialHost.isEnabled=false
        if(animate&&a.motionDuration(140)>0){
            materialHost.animate().alpha(0f).setDuration(a.motionDuration(140)).setInterpolator(DecelerateInterpolator()).withEndAction{
                if(token==materialVersion){
                    materialHost.visibility=View.GONE
                    materialHost.alpha=1f
                }
            }.start()
        }else{
            materialHost.visibility=View.GONE
            materialHost.alpha=1f
        }
    }

    private inner class MaterialHost:LinearLayout(a) {
        init {
            orientation=VERTICAL
            elevation=a.dp(7).toFloat()
            clipToOutline=true
            background=a.surface(a.panel,false,5f).apply{setStroke(a.dp(1),alphaColour(a.accent,102))}
            accessibilityLiveRegion=View.ACCESSIBILITY_LIVE_REGION_POLITE
        }
        override fun onMeasure(widthMeasureSpec:Int,heightMeasureSpec:Int){
            val cap=((if(shell.height>0)shell.height else MeasureSpec.getSize(heightMeasureSpec))*(if(compact).56f else .52f)).roundToInt().coerceAtLeast(0)
            super.onMeasure(widthMeasureSpec,MeasureSpec.makeMeasureSpec(cap,MeasureSpec.AT_MOST))
        }
        override fun dispatchTouchEvent(event:MotionEvent):Boolean=if(isEnabled)super.dispatchTouchEvent(event)else true
    }

    private inner class TreeViewport:FrameLayout(a) {
        private val drawing=TreeDrawing()
        private val gridPaint=Paint(Paint.ANTI_ALIAS_FLAG).apply{color=a.line}
        private val points=linkedMapOf<Int,PointF>()
        private var gesture:TreeGesture?=null
        private var suppressed=false
        private var lastDrag=-350L
        private var pressedNode:View?=null
        private var lastBackgroundTap=0L
        private var lastBackgroundPoint=PointF()

        init {
            setWillNotDraw(false)
            clipChildren=true
            clipToPadding=true
            isFocusable=true
            isClickable=true
            importantForAccessibility=View.IMPORTANT_FOR_ACCESSIBILITY_YES
            contentDescription="Weapon family tree. Pinch to zoom and drag to pan."
            addView(drawing)
        }

        fun populate(){
            drawing.populate()
            drawing.layoutParams=LayoutParams(a.dp(graph.width),a.dp(graph.height))
            if(state.optBoolean("treeInitialized"))updateTransform()
            else post{if(width>0&&height>0)resetViewport()}
            requestLayout()
        }

        fun updateSelection(){drawing.updateSelection()}

        fun updateTransform(){
            val tree=treeState()
            val zoom=tree.optDouble("zoom",1.0).toFloat().takeIf{it.isFinite()}?.coerceIn(.5f,6f)?:1f
            val scale=WeaponTreeLayout.BASE_SCALE*zoom
            var x=tree.optDouble("x",16.0).toFloat().takeIf{it.isFinite()}?:16f
            var y=tree.optDouble("y",16.0).toFloat().takeIf{it.isFinite()}?:16f
            if(width>0)x=WeaponTreeLayout.clampPan(x,width/density,graph.width*scale)
            if(height>0)y=WeaponTreeLayout.clampPan(y,height/density,graph.height*scale)
            tree.put("zoom",zoom).put("x",x).put("y",y)
            drawing.pivotX=0f
            drawing.pivotY=0f
            drawing.scaleX=scale
            drawing.scaleY=scale
            drawing.translationX=units(x)
            drawing.translationY=units(y)
            val pct=(zoom*100).roundToInt()
            zoomLabel.text="$pct%"
            zoomLabel.contentDescription="Tree zoom, $pct percent"
            invalidate()
        }

        override fun onSizeChanged(w:Int,h:Int,oldw:Int,oldh:Int){
            super.onSizeChanged(w,h,oldw,oldh)
            if(w>0&&h>0){
                if(state.optBoolean("treeInitialized"))updateTransform()
                else resetViewport()
                materialHost.requestLayout()
            }
        }

        override fun onDraw(canvas:Canvas){
            super.onDraw(canvas)
            val step=units(20f)
            var x=units(1f)
            while(x<width){
                var y=units(1f)
                while(y<height){
                    canvas.drawCircle(x,y,units(.75f),gridPaint)
                    y+=step
                }
                x+=step
            }
        }

        override fun onInterceptTouchEvent(event:MotionEvent):Boolean=true

        private fun midpoint():Triple<Float,Float,Float>{
            val first=points.values.firstOrNull()?:return Triple(0f,0f,0f)
            val second=points.values.drop(1).firstOrNull()?:return Triple(first.x,first.y,0f)
            return Triple((first.x+second.x)/2f,(first.y+second.y)/2f,hypot(first.x-second.x,first.y-second.y))
        }

        private fun beginGesture(){
            if(points.isEmpty()){gesture=null;return}
            val (midX,midY,distance)=midpoint()
            val tree=treeState()
            gesture=TreeGesture(logicalZoom(),tree.optDouble("x",16.0).toFloat(),tree.optDouble("y",16.0).toFloat(),midX,midY,distance)
        }

        private fun setView(zoom:Float,x:Float,y:Float){
            treeState().put("zoom",zoom).put("x",x).put("y",y)
            state.put("treeInitialized",true)
            updateTransform()
        }

        private fun hitNode(x:Float,y:Float):View?{
            val tree=treeState()
            val scale=WeaponTreeLayout.BASE_SCALE*logicalZoom()
            val canvasX=(x-tree.optDouble("x",16.0).toFloat())/scale
            val canvasY=(y-tree.optDouble("y",16.0).toFloat())/scale
            val hit=graph.records.lastOrNull{record->
                val pos=graph.positions[WeaponTreeLayout.rawId(record)]?:return@lastOrNull false
                canvasX>=pos.x&&canvasX<=pos.x+WeaponTreeLayout.NODE_WIDTH&&canvasY>=pos.y&&canvasY<=pos.y+WeaponTreeLayout.NODE_HEIGHT
            }?:return null
            return drawing.nodes[WeaponTreeLayout.rawId(hit)]
        }

        override fun onTouchEvent(event:MotionEvent):Boolean{
            when(event.actionMasked){
                MotionEvent.ACTION_DOWN->{
                    parent.requestDisallowInterceptTouchEvent(true)
                    points.clear()
                    suppressed=false
                    points[event.getPointerId(0)]=PointF(event.x/density,event.y/density)
                    pressedNode=hitNode(event.x/density,event.y/density)?.also{it.isPressed=true}
                    beginGesture()
                }
                MotionEvent.ACTION_POINTER_DOWN->{
                    for(i in 0 until event.pointerCount)points[event.getPointerId(i)]=PointF(event.getX(i)/density,event.getY(i)/density)
                    suppressed=true
                    lastDrag=SystemClock.uptimeMillis()
                    pressedNode?.isPressed=false
                    beginGesture()
                }
                MotionEvent.ACTION_MOVE->{
                    for(i in 0 until event.pointerCount){
                        val id=event.getPointerId(i)
                        if(id in points)points[id]=PointF(event.getX(i)/density,event.getY(i)/density)
                    }
                    val start=gesture
                    if(start!=null){
                        val (midX,midY,distance)=midpoint()
                        var nextZoom=start.zoom
                        var nextX=start.x+midX-start.midX
                        var nextY=start.y+midY-start.midY
                        if(points.size>1&&start.distance>0f){
                            nextZoom=(start.zoom*(distance/start.distance)).coerceIn(.5f,6f)
                            val ratio=nextZoom/start.zoom
                            nextX=midX-(start.midX-start.x)*ratio
                            nextY=midY-(start.midY-start.y)*ratio
                        }
                        if(hypot(midX-start.midX,midY-start.midY)>5f||points.size>1){
                            suppressed=true
                            lastDrag=SystemClock.uptimeMillis()
                            pressedNode?.isPressed=false
                        }
                        setView(nextZoom,nextX,nextY)
                    }
                }
                MotionEvent.ACTION_POINTER_UP->{
                    points.remove(event.getPointerId(event.actionIndex))
                    for(i in 0 until event.pointerCount){
                        if(i!=event.actionIndex){
                            val id=event.getPointerId(i)
                            if(id in points)points[id]=PointF(event.getX(i)/density,event.getY(i)/density)
                        }
                    }
                    beginGesture()
                }
                MotionEvent.ACTION_UP->{
                    val hit=hitNode(event.x/density,event.y/density)
                    pressedNode?.isPressed=false
                    if(!suppressed&&SystemClock.uptimeMillis()-lastDrag>=350){
                        if(hit!=null&&hit==pressedNode){
                            hit.performClick()
                            lastBackgroundTap=0L
                        }else if(hit==null){
                            val now=SystemClock.uptimeMillis()
                            val pointX=event.x/density
                            val pointY=event.y/density
                            if(lastBackgroundTap>0&&now-lastBackgroundTap<=ViewConfiguration.getDoubleTapTimeout()&&hypot(pointX-lastBackgroundPoint.x,pointY-lastBackgroundPoint.y)<40f){
                                setView(if(logicalZoom()==1f)2f else 1f,0f,0f)
                                lastBackgroundTap=0L
                            }else{
                                closeMaterials()
                                lastBackgroundTap=now
                                lastBackgroundPoint=PointF(pointX,pointY)
                            }
                            performClick()
                        }
                    }
                    pressedNode=null
                    points.clear()
                    gesture=null
                    parent.requestDisallowInterceptTouchEvent(false)
                }
                MotionEvent.ACTION_CANCEL->{
                    pressedNode?.isPressed=false
                    pressedNode=null
                    points.clear()
                    gesture=null
                    suppressed=true
                    parent.requestDisallowInterceptTouchEvent(false)
                }
            }
            return true
        }

        override fun performClick():Boolean{super.performClick();return true}

        override fun onGenericMotionEvent(event:MotionEvent):Boolean{
            if(event.action==MotionEvent.ACTION_SCROLL&&(event.metaState and (KeyEvent.META_CTRL_ON or KeyEvent.META_META_ON))!=0){
                val tree=treeState()
                val nextZoom=(logicalZoom()*exp(event.getAxisValue(MotionEvent.AXIS_VSCROLL)*.3f)).coerceIn(.5f,6f)
                setView(nextZoom,tree.optDouble("x",16.0).toFloat(),tree.optDouble("y",16.0).toFloat())
                return true
            }
            return super.onGenericMotionEvent(event)
        }

        override fun onKeyDown(keyCode:Int,event:KeyEvent):Boolean{
            val tree=treeState()
            var zoom=logicalZoom()
            var x=tree.optDouble("x",16.0).toFloat()
            var y=tree.optDouble("y",16.0).toFloat()
            when(keyCode){
                KeyEvent.KEYCODE_DPAD_UP->y+=50f
                KeyEvent.KEYCODE_DPAD_DOWN->y-=50f
                KeyEvent.KEYCODE_DPAD_LEFT->x+=50f
                KeyEvent.KEYCODE_DPAD_RIGHT->x-=50f
                KeyEvent.KEYCODE_PLUS,KeyEvent.KEYCODE_EQUALS,KeyEvent.KEYCODE_NUMPAD_ADD->zoom=min(6f,zoom+.25f)
                KeyEvent.KEYCODE_MINUS,KeyEvent.KEYCODE_NUMPAD_SUBTRACT->zoom=max(.5f,zoom-.25f)
                KeyEvent.KEYCODE_0,KeyEvent.KEYCODE_NUMPAD_0->{zoom=1f;x=0f;y=0f}
                else->return super.onKeyDown(keyCode,event)
            }
            setView(zoom,x,y)
            return true
        }

        override fun onInitializeAccessibilityNodeInfo(info:AccessibilityNodeInfo){
            super.onInitializeAccessibilityNodeInfo(info)
            info.addAction(AccessibilityNodeInfo.AccessibilityAction(0x01010001,"Zoom in"))
            info.addAction(AccessibilityNodeInfo.AccessibilityAction(0x01010002,"Zoom out"))
            info.addAction(AccessibilityNodeInfo.AccessibilityAction(0x01010003,"Reset view"))
        }

        override fun performAccessibilityAction(action:Int,arguments:Bundle?):Boolean{
            when(action){
                0x01010001,0x01010002->{
                    val tree=treeState()
                    val delta=if(action==0x01010001).25f else -.25f
                    setView((logicalZoom()+delta).coerceIn(.5f,6f),tree.optDouble("x",16.0).toFloat(),tree.optDouble("y",16.0).toFloat())
                    return true
                }
                0x01010003->{resetViewport();return true}
                else->return super.performAccessibilityAction(action,arguments)
            }
        }
    }

    private inner class TreeDrawing:ViewGroup(a) {
        val nodes=linkedMapOf<String,View>()
        private val edgePaint=Paint(Paint.ANTI_ALIAS_FLAG).apply{
            color=alphaColour(a.accent,102)
            strokeWidth=units(1.5f)
            style=Paint.Style.STROKE
        }
        private val path=Path()

        init {
            setWillNotDraw(false)
            clipChildren=false
            importantForAccessibility=View.IMPORTANT_FOR_ACCESSIBILITY_NO
        }

        fun populate(){
            removeAllViews()
            nodes.clear()
            graph.records.forEach{record->
                val data=WeaponModel.data(record)
                val elements=data.optJSONArray("elements")
                val elementNames=(0 until (elements?.length()?:0)).mapNotNull{index->
                    val item=elements?.opt(index)
                    when(item){
                        is String->item
                        is JSONObject->item.optString("type").ifBlank{item.optString("name")}
                        else->null
                    }?.takeIf{it.isNotBlank()}
                }
                val node=a.row().apply{
                    setPadding(a.dp(13),a.dp(12),a.dp(13),a.dp(12))
                    gravity=Gravity.CENTER_VERTICAL
                    contentDescription=buildString{
                        append("${record.name}, rarity ${data.optInt("rarity",1)}")
                        if(elementNames.isNotEmpty())append(", ${elementNames.joinToString(", ")}")
                    }
                    importantForAccessibility=View.IMPORTANT_FOR_ACCESSIBILITY_YES
                    descendantFocusability=FOCUS_BLOCK_DESCENDANTS
                    isFocusable=true
                    isClickable=true
                    setOnClickListener{select(record)}
                }
                val label=a.text(record.name,20f).apply{
                    textSize=(20f*a.prefs.number("font",100)/100f).coerceIn(16f,27f)
                    maxLines=3
                    ellipsize=TextUtils.TruncateAt.END
                    setLineSpacing(0f,1.35f)
                    importantForAccessibility=View.IMPORTANT_FOR_ACCESSIBILITY_NO
                }
                node.addView(label,LayoutParams(0,-2,1f))
                val icons=a.row().apply{importantForAccessibility=View.IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS}
                val visuals=a.libraryData.optJSONObject("nativeVisuals")
                val rarityAsset=record.image.ifBlank{
                    visuals?.optJSONObject("weaponTypes")
                        ?.optJSONObject(data.optString("type"))
                        ?.optJSONObject("rarityIcons")
                        ?.optString(data.optInt("rarity",1).coerceIn(1,12).toString()).orEmpty()
                }
                if(rarityAsset.isNotBlank())addIcon(icons,rarityAsset,30,32,"Rarity ${data.optInt("rarity",1)}")
                elementNames.forEach{name->
                    val key=when(val raw=name.lowercase().replace(Regex("[\\s_-]"),"")){
                        "fireblight"->"fire"
                        "waterblight"->"water"
                        "thunderblight"->"thunder"
                        "iceblight"->"ice"
                        "dragonblight"->"dragon"
                        "blastblight","blastscourge"->"blast"
                        "paralyze","paralyzed","paralysed"->"paralysis"
                        "ko"->"stun"
                        "exhaustion"->"exhaust"
                        else->raw
                    }
                    val effectAsset=visuals?.optJSONObject("effects")?.optString(key).orEmpty()
                    if(effectAsset.isNotBlank())addIcon(icons,effectAsset,24,27,name)
                }
                node.addView(icons,LinearLayout.LayoutParams(-2,-2).apply{marginStart=a.dp(12)})
                addView(node,ViewGroup.LayoutParams(a.dp(WeaponTreeLayout.NODE_WIDTH),a.dp(WeaponTreeLayout.NODE_HEIGHT)))
                nodes[WeaponTreeLayout.rawId(record)]=node
            }
            updateSelection()
            requestLayout()
            invalidate()
        }

        private fun addIcon(parent:LinearLayout,asset:String,width:Int,height:Int,label:String){
            val view=ImageView(a).apply{
                scaleType=ImageView.ScaleType.FIT_CENTER
                contentDescription=label
                tag=asset
            }
            parent.addView(view,LinearLayout.LayoutParams(a.dp(width),a.dp(height)).apply{if(parent.childCount>0)marginStart=a.dp(8)})
            val waiting=pendingIcons.getOrPut(asset){mutableListOf()}
            waiting+=view
            if(waiting.size==1){
                a.loadBitmap(asset){bitmap->
                    pendingIcons.remove(asset)?.forEach{target->
                        if(bitmap!=null&&target.tag==asset)target.setImageBitmap(bitmap)
                    }
                }
            }
        }

        fun updateSelection(){
            graph.records.forEach{record->
                val id=WeaponTreeLayout.rawId(record)
                val node=nodes[id]?:return@forEach
                val active=id==selectedId()
                node.isSelected=active
                val data=WeaponModel.data(record)
                val reward=data.optJSONObject("forge")==null&&data.optJSONObject("upgrade")==null
                val fill=if(a.prefs.text("theme","game")=="game")Color.parseColor(if(a.isIce)"#172938"else "#1b271f")else blend(a.bg,a.ink,.075f)
                val box=GradientDrawable().apply{
                    setColor(fill)
                    cornerRadius=units(3f)
                    if(reward)setStroke(a.dp(1),if(active)a.accent else a.line,units(5f),units(4f))
                    else setStroke(a.dp(1),if(active)a.accent else a.line)
                }
                node.background=if(a.prefs.text("touch","ripple")!="none"&&a.motionDuration(170)>0){
                    RippleDrawable(ColorStateList.valueOf(alphaColour(a.accent,60)),box,GradientDrawable().apply{setColor(Color.WHITE);cornerRadius=units(3f)})
                }else box
            }
        }

        override fun onMeasure(widthMeasureSpec:Int,heightMeasureSpec:Int){
            val nodeWidth=a.dp(WeaponTreeLayout.NODE_WIDTH)
            val nodeHeight=a.dp(WeaponTreeLayout.NODE_HEIGHT)
            for(i in 0 until childCount){
                getChildAt(i).measure(MeasureSpec.makeMeasureSpec(nodeWidth,MeasureSpec.EXACTLY),MeasureSpec.makeMeasureSpec(nodeHeight,MeasureSpec.EXACTLY))
            }
            setMeasuredDimension(a.dp(graph.width),a.dp(graph.height))
        }

        override fun onLayout(changed:Boolean,left:Int,top:Int,right:Int,bottom:Int){
            graph.records.forEach{record->
                val id=WeaponTreeLayout.rawId(record)
                val node=nodes[id]?:return@forEach
                val pos=graph.positions[id]?:return@forEach
                val l=a.dp(pos.x)
                val t=a.dp(pos.y)
                node.layout(l,t,l+node.measuredWidth,t+node.measuredHeight)
            }
        }

        override fun onDraw(canvas:Canvas){
            super.onDraw(canvas)
            path.rewind()
            graph.records.forEach{record->
                val parent=graph.positions[WeaponTreeLayout.parentId(record)]?:return@forEach
                val child=graph.positions[WeaponTreeLayout.rawId(record)]?:return@forEach
                val x1=units(parent.x+WeaponTreeLayout.NODE_WIDTH)
                val y1=units(parent.y+WeaponTreeLayout.NODE_HEIGHT/2f)
                val midX=units(parent.x+WeaponTreeLayout.NODE_WIDTH+19f)
                val x2=units(child.x)
                val y2=units(child.y+WeaponTreeLayout.NODE_HEIGHT/2f)
                path.moveTo(x1,y1)
                path.lineTo(midX,y1)
                path.lineTo(midX,y2)
                path.lineTo(x2,y2)
            }
            canvas.drawPath(path,edgePaint)
        }
    }
}
