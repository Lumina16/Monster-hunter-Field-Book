package com.lumina.monsterhunterfieldbook

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.view.*
import android.widget.*
import org.json.JSONObject
import java.util.concurrent.atomic.AtomicInteger
import kotlin.math.max
import kotlin.math.roundToInt

private class WeaponPillFlow(context:Context,private val gap:Int):ViewGroup(context) {
    override fun onMeasure(widthMeasureSpec:Int,heightMeasureSpec:Int){
        val width=MeasureSpec.getSize(widthMeasureSpec)
        var x=0;var y=0;var rowHeight=0
        for(i in 0 until childCount){
            val child=getChildAt(i)
            child.measure(MeasureSpec.makeMeasureSpec(width,MeasureSpec.AT_MOST),MeasureSpec.makeMeasureSpec(0,MeasureSpec.UNSPECIFIED))
            if(x>0&&x+child.measuredWidth>width){y+=rowHeight+gap;x=0;rowHeight=0}
            x+=child.measuredWidth+gap
            rowHeight=max(rowHeight,child.measuredHeight)
        }
        setMeasuredDimension(width,resolveSize(y+rowHeight,heightMeasureSpec))
    }
    override fun onLayout(changed:Boolean,left:Int,top:Int,right:Int,bottom:Int){
        val width=right-left
        var x=0;var y=0;var rowHeight=0
        for(i in 0 until childCount){
            val child=getChildAt(i)
            if(x>0&&x+child.measuredWidth>width){y+=rowHeight+gap;x=0;rowHeight=0}
            child.layout(x,y,x+child.measuredWidth,y+child.measuredHeight)
            x+=child.measuredWidth+gap
            rowHeight=max(rowHeight,child.measuredHeight)
        }
    }
}

class WeaponsScreen(private val a:MainActivity,restored:JSONObject?=null):ScrollView(a) {
    private val page=a.column()
    private val chips=a.row()
    private val grid=a.column()
    private val token=AtomicInteger()
    private var kind=restored?.optString("kind","all")?:"all"
    private var position=restored?.optInt("scroll",0)?:0
    private var guides=listOf<FieldRecord>()
    private var columns=columnCount(a.resources.configuration.screenWidthDp)
    private val chipViews=linkedMapOf<String,TextView>()

    private fun columnCount(width:Int)=when{width>1150->3;width>480->2;else->1}

    init {
        isFillViewport=false
        isHorizontalScrollBarEnabled=false
        addView(page,LayoutParams(-1,-2))
        val side=(a.resources.configuration.screenWidthDp*.05f).roundToInt().coerceIn(16,52)
        page.setPadding(a.dp(side),a.dp(if(a.resources.configuration.screenWidthDp<=780)19 else 30),a.dp(side),a.dp(28))
        page.addView(a.text("${a.currentEdition.uppercase()} / WEAPON HANDBOOK",9f,colour=a.accent).apply{letterSpacing=.14f})
        a.gap(page,9)
        page.addView(a.text("Find your hunting rhythm.",if(a.resources.configuration.screenWidthDp<=780)27f else 29f,true))
        a.gap(page,8)
        page.addView(a.text("All fourteen weapon types. Learn a reliable loop, understand the tradeoffs, and choose skills that support how you actually hunt.",13f,colour=a.muted))
        a.gap(page,18)
        listOf("all" to "All 14 weapons","melee" to "Melee","ranged" to "Ranged").forEach{(id,label)->
            val chip=a.button(label){kind=id;syncChips();renderCards()}.apply{
                textSize=11f*a.prefs.number("font",100)/100f
                minHeight=a.dp(40)
                setPadding(a.dp(12),a.dp(7),a.dp(12),a.dp(7))
            }
            chipViews[id]=chip
            chips.addView(chip,LinearLayout.LayoutParams(-2,a.dp(40)).apply{marginEnd=a.dp(7)})
        }
        page.addView(chips)
        syncChips()
        a.gap(page,18)
        val noticeBody=a.column().apply{
            background=a.surface(alphaColour(a.accent,6),true,0f)
            setPadding(a.dp(16),a.dp(14),a.dp(16),a.dp(14))
            addView(a.textBold(if(a.isIce)"Iceborne additions included."else "The World foundation.",11f,a.muted))
            addView(a.text(if(a.isIce)"Each guide separates the World foundation from the expansion’s new moves and example sequences."else "These guides focus on base-game moves. Switch to Iceborne for Clutch Claw integrations and expansion moves.",11f,colour=a.muted))
        }
        val notice=FrameLayout(a).apply{
            addView(noticeBody,FrameLayout.LayoutParams(-1,-2))
            addView(View(a).apply{setBackgroundColor(a.accent)},FrameLayout.LayoutParams(a.dp(2),-1))
        }
        page.addView(notice,LinearLayout.LayoutParams(-1,-2))
        a.gap(page,25)
        page.addView(grid,LinearLayout.LayoutParams(-1,-2))
        a.gap(page,20)
        page.addView(a.text("Learning curve describes resource and execution demands, not a damage ranking. Move names are platform-neutral; use the in-game control list for your device.",10f,colour=a.muted))
        if(a.catalogue.ready){
            val generation=token.incrementAndGet()
            a.catalogue.executor.execute{
                val rows=a.catalogue.browse(LibraryFilter("Weapon Guides",sort="source"),0,20).records
                a.runOnUiThread{
                    if(generation==token.get()){
                        guides=rows
                        renderCards()
                        post{scrollTo(0,position)}
                    }
                }
            }
        }else grid.addView(a.text("Preparing offline catalogue…",13f,colour=a.muted))
    }

    override fun onSizeChanged(w:Int,h:Int,oldw:Int,oldh:Int){
        super.onSizeChanged(w,h,oldw,oldh)
        val next=columnCount((w/a.resources.displayMetrics.density).roundToInt())
        if(next!=columns){columns=next;renderCards()}
    }

    private fun syncChips(){
        chipViews.forEach{(id,chip)->
            chip.setTextColor(if(id==kind)a.accent else a.muted)
            chip.background=a.surface(if(id==kind)alphaColour(a.accent,18)else 0,true,2f)
            a.touch(chip){kind=id;syncChips();renderCards()}
        }
    }

    private fun renderCards(){
        grid.removeAllViews()
        val filtered=guides.filter{
            val ranged=it.data().optString("id") in setOf("bow","light-bowgun","heavy-bowgun")
            kind=="all"||(kind=="ranged")==ranged
        }
        filtered.chunked(columns).forEach{rowItems->
            val row=a.row().apply{gravity=Gravity.TOP}
            rowItems.forEachIndexed{index,record->
                row.addView(card(record),LinearLayout.LayoutParams(0,-2,1f).apply{if(index>0)marginStart=a.dp(14)})
            }
            repeat(columns-rowItems.size){
                row.addView(View(a),LinearLayout.LayoutParams(0,1,1f).apply{marginStart=a.dp(14)})
            }
            grid.addView(row,LinearLayout.LayoutParams(-1,-2).apply{bottomMargin=a.dp(14)})
        }
    }

    private fun card(record:FieldRecord):View {
        val data=record.data()
        val typeId=data.optString("id")
        val card=FrameLayout(a).apply{
            tag="weapon-card:$typeId"
            contentDescription="Open ${record.name}"
            background=a.surface(radius=3f)
        }
        val body=a.column()
        a.pad(body,if(a.prefs.text("density","compact")=="comfortable")22 else 17)
        card.addView(body,FrameLayout.LayoutParams(-1,-2))
        val top=a.row().apply{gravity=Gravity.CENTER_VERTICAL}
        val sigil=FrameLayout(a).apply{
            background=GradientDrawable().apply{
                shape=GradientDrawable.OVAL
                setColor(alphaColour(a.accent,10))
                setStroke(a.dp(1),alphaColour(a.accent,64))
            }
        }
        val icon=ImageView(a).apply{scaleType=ImageView.ScaleType.FIT_CENTER;contentDescription="${record.name} icon"}
        sigil.addView(icon,FrameLayout.LayoutParams(a.dp(38),a.dp(38),Gravity.CENTER))
        a.assetImage(record.image,icon)
        top.addView(sigil,LinearLayout.LayoutParams(a.dp(53),a.dp(53)))
        val titleWrap=a.column().apply{setPadding(a.dp(13),0,a.dp(21),0)}
        val ranged=typeId in setOf("bow","light-bowgun","heavy-bowgun")
        titleWrap.addView(a.text(if(ranged)"RANGED DISCIPLINE"else "MELEE DISCIPLINE",9f,colour=a.muted).apply{letterSpacing=.08f})
        titleWrap.addView(a.text(record.name,22f,true))
        top.addView(titleWrap,LinearLayout.LayoutParams(0,-2,1f))
        body.addView(top)
        a.gap(body,10)
        body.addView(a.text(data.optString("short"),13f))
        a.gap(body,12)
        val pills=WeaponPillFlow(a,a.dp(8))
        listOf("${data.optString("complexity")} learning curve",data.optString("role").substringBefore('•').trim()).forEach{label->
            val pill=a.text(label,10f,colour=a.muted).apply{
                background=a.surface(0,true,2f)
                setPadding(a.dp(8),a.dp(3),a.dp(8),a.dp(3))
            }
            pills.addView(pill,ViewGroup.LayoutParams(-2,-2))
        }
        body.addView(pills,LinearLayout.LayoutParams(-1,-2))
        val save=FrameLayout(a)
        val glyph=GlyphView(a,"bookmark",if(a.isBookmarked(record.id))a.accent else a.muted)
        save.addView(glyph,FrameLayout.LayoutParams(a.dp(17),a.dp(17),Gravity.CENTER))
        save.contentDescription="Bookmark ${record.name}"
        save.isSelected=a.isBookmarked(record.id)
        a.touch(save){
            a.toggleBookmark(record.id)
            save.isSelected=a.isBookmarked(record.id)
            glyph.colour=if(save.isSelected)a.accent else a.muted
            glyph.invalidate()
        }
        card.addView(save,FrameLayout.LayoutParams(a.dp(36),a.dp(36),Gravity.TOP or Gravity.END).apply{topMargin=a.dp(5);marginEnd=a.dp(4)})
        a.touch(card){a.openWeapon(typeId)}
        return card
    }

    fun snapshot():JSONObject=JSONObject().put("kind",kind).put("scroll",scrollY)

    override fun onDetachedFromWindow(){
        token.incrementAndGet()
        super.onDetachedFromWindow()
    }
}
