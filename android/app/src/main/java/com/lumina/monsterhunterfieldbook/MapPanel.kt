package com.lumina.monsterhunterfieldbook

import android.graphics.*
import android.view.*
import android.widget.*
import org.json.JSONArray
import org.json.JSONObject
import kotlin.math.*

class MapPanel(private val a:MainActivity,private val maps:JSONArray,private val stateKey:String):LinearLayout(a) {
    private val canvas=ZoomMapView(a)
    private val caption=a.text("",11f,colour=a.muted)
    private val baseToggle=CheckBox(a).apply{text="Background";isChecked=true}
    private val floorToggle=CheckBox(a).apply{text="Map layer";isChecked=true}
    private var generation=0
    private var index=a.prefs.number("mapFloor:"+stateKey,0).coerceIn(0,max(0,maps.length()-1))
    init {
        orientation=VERTICAL
        val floors=Spinner(a);floors.contentDescription="Map floor"
        floors.adapter=ArrayAdapter(a,android.R.layout.simple_spinner_dropdown_item,(0 until maps.length()).map{maps.getJSONObject(it).optString("title",maps.getJSONObject(it).optString("name"))})
        floors.setSelection(index);addView(floors,LayoutParams(-1,a.dp(48)))
        val controls=a.row()
        controls.addView(a.button("−"){canvas.zoom(.8f)},LayoutParams(0,-2,1f))
        controls.addView(a.button("Reset"){canvas.reset();save()},LayoutParams(0,-2,1f))
        controls.addView(a.button("+"){canvas.zoom(1.25f)},LayoutParams(0,-2,1f))
        addView(controls)
        val layers=a.row();layers.addView(baseToggle);layers.addView(floorToggle);addView(layers)
        baseToggle.setTextColor(a.ink);floorToggle.setTextColor(a.ink)
        baseToggle.setOnCheckedChangeListener{_,v->canvas.showBase=v;canvas.invalidate();save()}
        floorToggle.setOnCheckedChangeListener{_,v->canvas.showOverlay=v;canvas.invalidate();save()}
        canvas.onChange={save()}
        addView(canvas,LayoutParams(-1,0,1f));addView(caption)
        floors.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p:AdapterView<*>?,v:android.view.View?,position:Int,id:Long){index=position;a.prefs.set("mapFloor:"+stateKey,position);load()}
            override fun onNothingSelected(p:AdapterView<*>?){}
        }
        load()
    }
    private fun load(){
        if(maps.length()==0)return
        val map=maps.getJSONObject(index);val token=++generation
        caption.text=map.optString("description");canvas.overlay=null;canvas.base=null;canvas.reset()
        val saved=runCatching{JSONObject(a.prefs.text("mapView:"+stateKey+":"+index,"{}"))}.getOrDefault(JSONObject())
        canvas.restore(saved);baseToggle.isChecked=canvas.showBase;floorToggle.isChecked=canvas.showOverlay
        val background=map.optString("backgroundImage").ifBlank{map.optString("background")}
        baseToggle.visibility=if(background.startsWith("art/"))VISIBLE else GONE
        fun set(path:String,isBase:Boolean){
            if(!path.startsWith("art/"))return
            a.loadBitmap(path){bitmap->if(token==generation){if(isBase)canvas.base=bitmap else canvas.overlay=bitmap;canvas.invalidate()}}
        }
        set(background,true);set(map.optString("image"),false)
        canvas.contentDescription=map.optString("title","Map")+". Pinch to zoom; drag to pan. Zoom controls are above."
    }
    private fun save(){a.prefs.set("mapView:"+stateKey+":"+index,canvas.snapshot().toString())}
    override fun onDetachedFromWindow(){save();generation++;super.onDetachedFromWindow()}
}

class ZoomMapView(context:android.content.Context):View(context) {
    var base:Bitmap?=null
    var overlay:Bitmap?=null
    var showBase=true
    var showOverlay=true
    var onChange:(()->Unit)?=null
    private var scale=1f
    private var x=0f
    private var y=0f
    private var lastX=0f
    private var lastY=0f
    private val paint=Paint(Paint.ANTI_ALIAS_FLAG or Paint.FILTER_BITMAP_FLAG)
    private val pinch=ScaleGestureDetector(context,object:ScaleGestureDetector.SimpleOnScaleGestureListener(){
        override fun onScale(d:ScaleGestureDetector):Boolean{
            val old=scale;scale=(scale*d.scaleFactor).coerceIn(1f,8f)
            x=(x-(d.focusX-width/2f))*(scale/old)+(d.focusX-width/2f)
            y=(y-(d.focusY-height/2f))*(scale/old)+(d.focusY-height/2f)
            clamp();invalidate();return true
        }
    })
    private val gestures=GestureDetector(context,object:GestureDetector.SimpleOnGestureListener(){
        override fun onDown(e:MotionEvent)=true
        override fun onDoubleTap(e:MotionEvent):Boolean{if(scale>1.1f)reset()else zoom(2f);return true}
        override fun onSingleTapUp(e:MotionEvent):Boolean{performClick();return true}
    })
    init{isFocusable=true;isClickable=true;setBackgroundColor(Color.rgb(15,20,24))}
    fun reset(){scale=1f;x=0f;y=0f;invalidate()}
    fun zoom(factor:Float){scale=(scale*factor).coerceIn(1f,8f);clamp();invalidate();onChange?.invoke()}
    fun snapshot()=JSONObject().put("scale",scale).put("x",if(width>0)x/width else 0f).put("y",if(height>0)y/height else 0f).put("base",showBase).put("overlay",showOverlay)
    fun restore(saved:JSONObject){scale=saved.optDouble("scale",1.0).toFloat().coerceIn(1f,8f);showBase=saved.optBoolean("base",true);showOverlay=saved.optBoolean("overlay",true);post{x=saved.optDouble("x",0.0).toFloat()*width;y=saved.optDouble("y",0.0).toFloat()*height;clamp();invalidate()}}
    override fun onSizeChanged(w:Int,h:Int,oldw:Int,oldh:Int){if(oldw>0)x=x/oldw*w;if(oldh>0)y=y/oldh*h;clamp();super.onSizeChanged(w,h,oldw,oldh)}
    private fun clamp(){x=x.coerceIn(-width*(scale-1)/2f,width*(scale-1)/2f);y=y.coerceIn(-height*(scale-1)/2f,height*(scale-1)/2f)}
    override fun onDraw(c:Canvas){
        super.onDraw(c);c.save();c.translate(width/2f+x,height/2f+y);c.scale(scale,scale)
        fun draw(bitmap:Bitmap?){bitmap?:return;val fit=min(width.toFloat()/bitmap.width,height.toFloat()/bitmap.height);val w=bitmap.width*fit;val h=bitmap.height*fit;c.drawBitmap(bitmap,null,RectF(-w/2,-h/2,w/2,h/2),paint)}
        if(showBase)draw(base);if(showOverlay)draw(overlay);c.restore()
    }
    override fun onTouchEvent(e:MotionEvent):Boolean{
        pinch.onTouchEvent(e);gestures.onTouchEvent(e)
        when(e.actionMasked){
            MotionEvent.ACTION_DOWN->{lastX=e.x;lastY=e.y;parent.requestDisallowInterceptTouchEvent(true)}
            MotionEvent.ACTION_MOVE->{if(!pinch.isInProgress&&e.pointerCount==1){x+=e.x-lastX;y+=e.y-lastY;clamp();invalidate()};lastX=e.x;lastY=e.y}
            MotionEvent.ACTION_POINTER_UP->{val index=if(e.actionIndex==0)1 else 0;lastX=e.getX(index);lastY=e.getY(index)}
            MotionEvent.ACTION_UP,MotionEvent.ACTION_CANCEL->{parent.requestDisallowInterceptTouchEvent(false);onChange?.invoke()}
        };return true
    }
    override fun performClick():Boolean=super.performClick()
}
