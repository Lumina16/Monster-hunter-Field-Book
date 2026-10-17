package com.lumina.monsterhunterfieldbook

import android.content.Context
import android.graphics.*
import android.graphics.drawable.GradientDrawable
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import kotlin.math.*

fun blend(a:Int,b:Int,t:Float):Int = Color.rgb((Color.red(a)*(1-t)+Color.red(b)*t).toInt(),(Color.green(a)*(1-t)+Color.green(b)*t).toInt(),(Color.blue(a)*(1-t)+Color.blue(b)*t).toInt())
fun alphaColour(c:Int,a:Int)=Color.argb(a,Color.red(c),Color.green(c),Color.blue(c))

class EmblemView(context:Context,var colour:Int=Color.rgb(217,183,122)):View(context){
    var formation=1f;set(value){field=value;invalidate()}
    var frost=false
    private val paint=Paint(Paint.ANTI_ALIAS_FLAG)
    private fun polygon(vararg points:Float):Path = Path().apply{moveTo(points[0],points[1]);for(i in 2 until points.size step 2)lineTo(points[i],points[i+1]);close()}
    override fun onDraw(c:Canvas){
        super.onDraw(c);c.save();val scale=min(width/48f,height/48f)*.92f;c.translate((width-48*scale)/2,(height-48*scale)/2);c.scale(scale,scale)
        val edge=polygon(24f,2f,43f,13f,43f,35f,24f,46f,5f,35f,5f,13f)
        val face=polygon(24f,5f,40f,14.5f,40f,33.5f,24f,43f,8f,33.5f,8f,14.5f)
        paint.style=Paint.Style.FILL;paint.color=blend(Color.rgb(21,25,26),colour,.35f);c.drawPath(edge,paint)
        paint.style=Paint.Style.STROKE;paint.strokeWidth=.8f;paint.color=blend(colour,Color.WHITE,.25f);c.drawPath(edge,paint)
        paint.style=Paint.Style.FILL;paint.color=if(frost)Color.rgb(24,51,70)else Color.rgb(28,39,32);c.drawPath(face,paint)
        paint.style=Paint.Style.STROKE;paint.strokeWidth=1.15f;paint.color=colour;c.drawPath(face,paint)
        val snow=Path().apply{
            moveTo(24f,11f);lineTo(24f,37f);moveTo(12.7f,17.5f);lineTo(35.3f,30.5f);moveTo(12.7f,30.5f);lineTo(35.3f,17.5f)
            moveTo(19f,13f);lineTo(24f,18f);lineTo(29f,13f);moveTo(19f,35f);lineTo(24f,30f);lineTo(29f,35f)
            moveTo(13f,22f);lineTo(20f,23f);lineTo(18f,16f);moveTo(35f,26f);lineTo(28f,25f);lineTo(30f,32f)
            moveTo(13f,26f);lineTo(20f,25f);lineTo(18f,32f);moveTo(35f,22f);lineTo(28f,23f);lineTo(30f,16f)
        }
        paint.strokeWidth=1.25f;paint.strokeJoin=Paint.Join.ROUND
        if(formation>=1)c.drawPath(snow,paint)else{
            val measure=PathMeasure(snow,false);var contour=0;do{val partial=Path();measure.getSegment(0f,measure.length*((formation*12-contour).coerceIn(0f,1f)),partial,true);c.drawPath(partial,paint);contour++}while(measure.nextContour())
        }
        c.restore()
    }
}

class GlyphView(context:Context,val glyph:String,var colour:Int):View(context){
    private val p=Paint(Paint.ANTI_ALIAS_FLAG).apply{style=Paint.Style.STROKE;strokeWidth=1.6f;strokeCap=Paint.Cap.ROUND;strokeJoin=Paint.Join.ROUND}
    override fun onDraw(c:Canvas){
        c.save();val s=min(width,height)/24f;c.translate((width-24*s)/2,(height-24*s)/2);c.scale(s,s);p.color=colour
        when(glyph){
            "search"->{c.drawCircle(10f,10f,6.8f,p);c.drawLine(15f,15f,21f,21f,p)}
            "close"->{c.drawLine(5f,5f,19f,19f,p);c.drawLine(19f,5f,5f,19f,p)}
            "back"->{c.drawLine(20f,12f,4f,12f,p);c.drawLine(4f,12f,10f,6f,p);c.drawLine(4f,12f,10f,18f,p)}
            "bookmark"->{val path=Path();path.moveTo(6f,3f);path.lineTo(18f,3f);path.lineTo(18f,21f);path.lineTo(12f,17f);path.lineTo(6f,21f);path.close();c.drawPath(path,p)}
            "music"->{c.drawLine(9f,18f,9f,5f,p);c.drawLine(9f,5f,20f,3f,p);c.drawLine(20f,3f,20f,16f,p);c.drawLine(9f,9f,20f,7f,p);c.drawOval(3f,16f,9f,21f,p);c.drawOval(14f,14f,20f,19f,p)}
            "settings"->{for(i in 0..7){c.save();c.rotate(i*45f,12f,12f);c.drawRect(10f,2f,14f,5f,p);c.restore()};c.drawCircle(12f,12f,8f,p);c.drawCircle(12f,12f,3f,p)}
            "triangle"->{p.style=Paint.Style.FILL;val path=Path();path.moveTo(7f,4f);path.lineTo(19f,12f);path.lineTo(7f,20f);path.close();c.drawPath(path,p);p.style=Paint.Style.STROKE}
            else->{c.drawLine(4f,12f,20f,12f,p);c.drawLine(14f,6f,20f,12f,p);c.drawLine(14f,18f,20f,12f,p)}
        };c.restore()
    }
}

/** Clipping reveal, matching the original top-to-bottom menu expansion. */
open class RevealFrame(context:Context):FrameLayout(context){
    var reveal=1f;set(value){field=value;invalidate()}
    override fun dispatchDraw(canvas:Canvas){val checkpoint=canvas.save();canvas.clipRect(0f,0f,width.toFloat(),height*reveal);super.dispatchDraw(canvas);canvas.restoreToCount(checkpoint)}
}

class ColourWheel(context:Context,initial:Int,val change:(Int)->Unit):View(context){
    private val paint=Paint(Paint.ANTI_ALIAS_FLAG)
    private val hsv=FloatArray(3).also{Color.colorToHSV(initial,it)}
    var brightness:Float
        get()=hsv[2]
        set(value){hsv[2]=value;change(Color.HSVToColor(hsv));invalidate()}
    override fun onDraw(c:Canvas){
        val x=width/2f;val y=height/2f;val r=min(x,y)-12
        paint.shader=SweepGradient(x,y,intArrayOf(Color.RED,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,Color.MAGENTA,Color.RED),null);c.drawCircle(x,y,r,paint)
        paint.shader=RadialGradient(x,y,r,Color.WHITE,Color.TRANSPARENT,Shader.TileMode.CLAMP);c.drawCircle(x,y,r,paint);paint.shader=null
        val a=Math.toRadians(hsv[0].toDouble());val px=x+cos(a).toFloat()*hsv[1]*r;val py=y+sin(a).toFloat()*hsv[1]*r
        paint.color=Color.BLACK;paint.style=Paint.Style.STROKE;paint.strokeWidth=7f;c.drawCircle(px,py,9f,paint);paint.color=Color.WHITE;paint.strokeWidth=3f;c.drawCircle(px,py,9f,paint);paint.style=Paint.Style.FILL
    }
    override fun onTouchEvent(e:MotionEvent):Boolean{
        if(e.action==MotionEvent.ACTION_DOWN||e.action==MotionEvent.ACTION_MOVE){
            parent.requestDisallowInterceptTouchEvent(true);val x=e.x-width/2f;val y=e.y-height/2f
            hsv[0]=((atan2(y,x)*180/PI+360)%360).toFloat();hsv[1]=(hypot(x,y)/(min(width,height)/2f-12)).coerceIn(0f,1f)
            change(Color.HSVToColor(hsv));invalidate();return true
        };if(e.action==MotionEvent.ACTION_UP){performClick();return true};return true
    }
    override fun performClick():Boolean{super.performClick();return true}
}

class HaloView(context:Context,var tint:Int,val prefs:NativePrefs):View(context){
    private val paint=Paint(Paint.ANTI_ALIAS_FLAG)
    private var active=true
    private var phase=0f
    override fun onAttachedToWindow(){super.onAttachedToWindow();active=true;invalidate()}
    override fun onDetachedFromWindow(){active=false;super.onDetachedFromWindow()}
    override fun onDraw(c:Canvas){
        if(!prefs.flag("animations")||!prefs.flag("glow")||prefs.number("speed",50)==0||prefs.text("performance","full")=="light")return
        val r=min(width,height)/2.8f;phase+=.025f
        paint.shader=RadialGradient(width/2f,height/2f,r*1.4f,intArrayOf(Color.TRANSPARENT,alphaColour(tint,(35+18*sin(phase)).toInt()),Color.TRANSPARENT),floatArrayOf(0f,.68f,1f),Shader.TileMode.CLAMP)
        c.drawCircle(width/2f,height/2f,r*1.4f,paint);paint.shader=null
        if(active&&windowVisibility==VISIBLE)postInvalidateDelayed(33)
    }
}
