package com.lumina.monsterhunterfieldbook

import android.animation.*
import android.app.*
import android.content.*
import android.content.res.Configuration
import android.graphics.*
import android.graphics.drawable.*
import android.os.*
import android.text.*
import android.text.style.ScaleXSpan
import android.view.*
import android.view.inputmethod.InputMethodManager
import android.widget.*
import org.json.*
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger
import kotlin.math.*

class MainActivity:Activity(){
    lateinit var prefs:NativePrefs
    lateinit var catalogue:Catalogue
    private lateinit var audio:FieldAudio
    val music get()=audio
    lateinit var root:FrameLayout
    private lateinit var base:LinearLayout
    private lateinit var content:FrameLayout
    private lateinit var emblem:EmblemView
    private lateinit var bodyFont:Typeface
    private lateinit var titleFont:Typeface
    private val handler=Handler(Looper.getMainLooper())
    private val images=Executors.newFixedThreadPool(2)
    private val fileIo=Executors.newSingleThreadExecutor()
    private val cache=object:android.util.LruCache<String,Bitmap>(16*1024){override fun sizeOf(key:String,value:Bitmap)=value.byteCount/1024}
    private var ready=false
    private var foreground=false
    private var introDone=false
    private var introView:FrameLayout?=null
    private var introAnimator:ValueAnimator?=null
    private var introStarted=false
    private var destroyed=false
    private val searchGeneration=AtomicInteger()
    private var searchQuery=""
    private var searchKind="All"
    private var searchRelated=false
    private var queryInput:EditText?=null
    private var resultBody:LinearLayout?=null
    private var resultScroll:ScrollView?=null
    private var settings:SettingsPanel?=null
    private var activeSection="overview"
    private var library:LibraryScreen?=null
    private val libraryStates=mutableMapOf<String,JSONObject>()
    lateinit var libraryData:JSONObject
    lateinit var backups:BackupController
    val currentEdition get()=edition
    private val sectionHistory=java.util.ArrayDeque<String>()
    private var edition="world"
    private var recent=JSONArray()
    private var bookmarks=JSONArray()
    private val sections=listOf("overview" to "Overview","bestiary" to "Bestiary","weapons" to "Weapons","equipment" to "Equipment","locales" to "Locales","progression" to "Speedrun","preparation" to "Item Libraries","notes" to "Field Notes","quests" to "Quests")
    private data class Overlay(val kind:String,val container:FrameLayout,val panel:View,var closing:Boolean=false)
    private val overlays=mutableListOf<Overlay>()
    val isIce get()=edition=="iceborne"
    val bg:Int get()=themeColours()[0]
    val accent:Int get()=themeColours()[1]
    val ink:Int get()=themeColours()[2]
    val panel:Int get()=blend(bg,ink,.045f)
    val muted:Int get()=blend(bg,ink,.65f)
    val line:Int get()=blend(bg,ink,.2f)
    val wide get()=resources.configuration.screenWidthDp>=650
    val landscape get()=resources.configuration.orientation==Configuration.ORIENTATION_LANDSCAPE
    val useSplitLibrary get()=resources.configuration.screenWidthDp>=600 || (landscape && resources.configuration.screenWidthDp>=560)
    val historyEnabled get()=prefs.flag("searchHistory")
    fun dp(n:Number)=(n.toFloat()*resources.displayMetrics.density).roundToInt()
    fun motionDuration(base:Long):Long{if(!prefs.flag("animations"))return 0L;val speed=prefs.number("speed",50);return if(speed==0)0L else (base*(1.65f-speed*.013f)).toLong()}
    fun themeColours():IntArray{
        val theme=prefs.text("theme","game")
        val default=if(isIce)intArrayOf(Color.rgb(12,20,34),Color.rgb(159,212,237),Color.rgb(231,239,243))else intArrayOf(Color.rgb(13,21,18),Color.rgb(217,183,122),Color.rgb(238,233,220))
        return if(theme=="custom")intArrayOf(prefs.number("customBg",default[0]),prefs.number("customAccent",default[1]),prefs.number("customInk",default[2]))else SettingsPanel.palettes[theme]?:default
    }
    override fun onCreate(state:Bundle?){
        super.onCreate(state);volumeControlStream=android.media.AudioManager.STREAM_MUSIC
        prefs=NativePrefs(this);libraryData=assets.open("library.json").bufferedReader().use{JSONObject(it.readText())};backups=BackupController(this);edition=state?.getString("edition")?:prefs.text("edition","world")
        activeSection=state?.getString("section")?:if(prefs.text("startup","overview")=="last")prefs.text("lastSection","overview")else "overview"
        searchQuery=state?.getString("query")?:"";searchKind=state?.getString("kind")?:"All"
        state?.getString("libraries")?.let{raw->runCatching{JSONObject(raw)}.getOrNull()?.let{saved->saved.keys().forEach{key->libraryStates[key]=saved.getJSONObject(key)}}}
        state?.getStringArrayList("navigation")?.forEach{sectionHistory.addLast(it)}
        recent=runCatching{JSONArray(prefs.text("recent","[]"))}.getOrDefault(JSONArray())
        bookmarks=runCatching{JSONArray(prefs.text("bookmarks","[]"))}.getOrDefault(JSONArray())
        titleFont=runCatching{Typeface.createFromAsset(assets,"fonts/title.ttf")}.getOrDefault(Typeface.create("serif",Typeface.NORMAL))
        bodyFont=runCatching{Typeface.createFromAsset(assets,"fonts/body.ttf")}.getOrDefault(Typeface.create("sans-serif",Typeface.NORMAL))
        audio=FieldAudio(this,prefs);audio.play(edition);catalogue=Catalogue(this)
        root=FrameLayout(this);root.setBackgroundColor(bg);setContentView(root);fullscreen();renderBase()
        catalogue.executor.execute{
            runCatching{catalogue.open()}.onSuccess{runOnUiThread{if(!destroyed){ready=true;if(overlays.lastOrNull()?.kind=="search")runSearch();if(activeSection!="overview")renderSection()}}}
                .onFailure{runOnUiThread{if(!destroyed)toast("Offline catalogue could not open: ${it.message}")}}
        }
        if(state==null)showIntro()else{
            introDone=true;audio.introductionFinished()
            when(state.getString("overlay")){"settings"->showSettings(state.getString("settingsTab")?:"Appearance");"search"->showSearch()}
            val recordIds=state.getStringArrayList("records")?:arrayListOf()
            if(recordIds.isNotEmpty())catalogue.executor.execute{
                val records=recordIds.mapNotNull{catalogue.record(it)}
                runOnUiThread{if(!destroyed)records.forEach{showRecord(it)}}
            }
        }
    }
    private fun fullscreen(){
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        if(Build.VERSION.SDK_INT>=30){window.setDecorFitsSystemWindows(false);window.insetsController?.apply{hide(WindowInsets.Type.systemBars());systemBarsBehavior=WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE}}
        else @Suppress("DEPRECATION") window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
        if(Build.VERSION.SDK_INT>=28){window.attributes=window.attributes.apply{layoutInDisplayCutoutMode=WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER}}
    }
    override fun onWindowFocusChanged(hasFocus:Boolean){super.onWindowFocusChanged(hasFocus);if(hasFocus)fullscreen()}
    override fun onResume(){super.onResume();foreground=true;audio.resume();if(!introDone&&introStarted)introAnimator?.resume()}
    override fun onPause(){foreground=false;audio.pause();introAnimator?.pause();super.onPause()}
    override fun onDestroy(){destroyed=true;searchGeneration.incrementAndGet();handler.removeCallbacksAndMessages(null);introAnimator?.cancel();audio.release();backups.release();fileIo.shutdownNow();images.shutdownNow();catalogue.close();super.onDestroy()}
    override fun onConfigurationChanged(config:Configuration){super.onConfigurationChanged(config);fullscreen();val scroll=(content.getChildAt(0) as? ScrollView)?.scrollY?:0;renderBase();(content.getChildAt(0) as? ScrollView)?.post{(content.getChildAt(0) as? ScrollView)?.scrollTo(0,scroll)};settings?.takeIf{overlays.lastOrNull()?.kind=="settings"}?.rebuild();root.requestLayout()}
    override fun onSaveInstanceState(out:Bundle){
        library?.let{libraryStates[activeSection]=it.snapshot()}
        out.putString("edition",edition);out.putString("section",activeSection);out.putString("query",searchQuery);out.putString("kind",searchKind)
        out.putString("overlay",overlays.lastOrNull{it.kind!="record"}?.kind);out.putString("settingsTab",settings?.category)
        out.putString("libraries",JSONObject(libraryStates as Map<*,*>).toString());out.putStringArrayList("navigation",ArrayList(sectionHistory))
        out.putStringArrayList("records",ArrayList(overlays.mapNotNull{(it.panel as? ViewGroup)?.getChildAt(0) as? RecordPanel}.map{it.record.id}))
        super.onSaveInstanceState(out)
    }

    fun text(value:String,size:Float=14f,title:Boolean=false,colour:Int=ink):TextView=TextView(this).apply{
        text=spaced(value);textSize=size*prefs.number("font",100)/100f;typeface=if(title)titleFont else bodyFont;setTextColor(colour)
        tag=size;setLineSpacing(dp(prefs.number("lineSpacing",0)).toFloat(),1.22f);letterSpacing=prefs.number("letterSpacing",0)/100f
        importantForAccessibility=View.IMPORTANT_FOR_ACCESSIBILITY_YES
    }
    private fun spaced(value:String):CharSequence{
        val spacing=prefs.number("wordSpacing",0);if(spacing==0)return value
        return SpannableString(value).apply{value.forEachIndexed{i,c->if(c==' ')setSpan(ScaleXSpan(1+spacing*.08f),i,i+1,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)}}
    }
    fun column()=LinearLayout(this).apply{orientation=LinearLayout.VERTICAL}
    fun row()=LinearLayout(this).apply{orientation=LinearLayout.HORIZONTAL;gravity=Gravity.CENTER_VERTICAL}
    fun pad(view:View,n:Int=16){view.setPadding(dp(n),dp(n),dp(n),dp(n))}
    fun surface(colour:Int=panel,stroke:Boolean=true,radius:Float=4f):GradientDrawable=GradientDrawable().apply{
        cornerRadius=dp(radius).toFloat();setColor(colour);if(stroke)setStroke(dp(1),line)
        if(prefs.flag("gradients")&&prefs.number("gradientStrength",18)>0){
            val t=prefs.number("gradientStrength",18)/220f;colors=intArrayOf(blend(colour,accent,t),colour);orientation=when(prefs.number("gradientAngle",0)){1->GradientDrawable.Orientation.TL_BR;2->GradientDrawable.Orientation.TOP_BOTTOM;else->GradientDrawable.Orientation.LEFT_RIGHT}
        }
    }
    fun touch(view:View,onClick:()->Unit){
        val effect=prefs.text("touch","ripple");val body=view.background?:surface(Color.TRANSPARENT,false)
        if(effect!="none"&&prefs.flag("animations")&&prefs.number("speed",50)>0){
            val tint=when(effect){"halo"->alphaColour(accent,40);"glow"->alphaColour(accent,85);"sparks"->alphaColour(accent,105);else->alphaColour(Color.rgb(217,183,122),70)}
            view.background=RippleDrawable(android.content.res.ColorStateList.valueOf(tint),body,GradientDrawable().apply{setColor(Color.WHITE);cornerRadius=dp(4).toFloat()}).apply{if(effect=="ripple")radius=dp(280)}
        }
        view.isClickable=true;view.isFocusable=true;view.setOnClickListener{onClick()}
    }
    fun button(label:String,onClick:()->Unit):TextView=text(label,13f).apply{gravity=Gravity.CENTER;minHeight=dp(44);setPadding(dp(16),dp(9),dp(16),dp(9));background=surface();touch(this,onClick)}
    fun iconButton(glyph:String,label:String,onClick:()->Unit):FrameLayout=FrameLayout(this).apply{
        contentDescription=label;minimumWidth=dp(44);minimumHeight=dp(44)
        addView(GlyphView(this@MainActivity,glyph,muted),FrameLayout.LayoutParams(dp(23),dp(23),Gravity.CENTER));touch(this,onClick)
    }
    fun gap(parent:LinearLayout,n:Int=12){parent.addView(View(this),LinearLayout.LayoutParams(1,dp(n)))}
    fun rule(parent:LinearLayout){parent.addView(View(this).apply{setBackgroundColor(line)},LinearLayout.LayoutParams(-1,dp(1)))}
    fun toast(message:String)=Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    private fun renderBase(){
        library?.let{libraryStates[activeSection]=it.snapshot()};library=null
        if(::base.isInitialized)root.removeView(base)
        base=column();base.setBackgroundColor(bg);root.addView(base,0,FrameLayout.LayoutParams(-1,-1))
        val header=row();header.setPadding(dp(16),dp(10),dp(12),dp(8));header.minimumHeight=dp(70)
        emblem=EmblemView(this,accent).apply{frost=isIce;rotationX=9f;cameraDistance=dp(180).toFloat();contentDescription="Open 3D navigation"}
        header.addView(emblem,LinearLayout.LayoutParams(dp(40),dp(46)));touch(emblem){showMenu()}
        val brand=column();brand.setPadding(dp(9),0,dp(4),0)
        brand.addView(text("RESEARCH COMMISSION",7f,colour=muted).apply{letterSpacing=.2f})
        brand.addView(text("Hunter’s Field Guide",if(wide)20f else 15f,true))
        header.addView(brand,LinearLayout.LayoutParams(0,-2,1f));touch(brand){if(activeSection!="overview")navigate("overview")}
        if(wide||activeSection!="overview")header.addView(iconButton("search","Search field book"){showSearch()},LinearLayout.LayoutParams(dp(42),dp(44)))
        header.addView(iconButton("bookmark","Saved entries"){showSaved()},LinearLayout.LayoutParams(dp(38),dp(44)))
        header.addView(iconButton("music","Music controls"){showSettings("Music")},LinearLayout.LayoutParams(dp(38),dp(44)))
        header.addView(iconButton("settings","Settings"){showSettings()},LinearLayout.LayoutParams(dp(38),dp(44)))
        base.addView(header);rule(base)
        val editions=row()
        (if(activeSection=="progression"&&!worldComplete())listOf("world" to "WORLD")else listOf("world" to "WORLD","iceborne" to "ICEBORNE")).forEach{(id,name)->
            val selected=edition==id
            val tab=button((if(selected)"◆ " else "◇ ")+name){switchEdition(id)}.apply{
                setTextColor(if(selected)accent else muted);textSize=17f*prefs.number("font",100)/100;letterSpacing=.12f
                background=if(selected)GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,intArrayOf(bg,blend(bg,accent,.09f))).apply{setStroke(dp(1),line)}else android.graphics.drawable.ColorDrawable(bg)
            }
            val wrap=column();wrap.addView(tab,LinearLayout.LayoutParams(-1,dp(60)));wrap.addView(View(this).apply{setBackgroundColor(if(selected)accent else line)},LinearLayout.LayoutParams(-1,dp(if(selected)3 else 1)));editions.addView(wrap,LinearLayout.LayoutParams(0,-2,1f))
        };base.addView(editions)
        content=FrameLayout(this);base.addView(content,LinearLayout.LayoutParams(-1,0,1f));renderSection()
    }
    fun navigate(section:String,remember:Boolean=true){library?.let{libraryStates[activeSection]=it.snapshot()};library=null;if(section=="progression"&&!worldComplete()&&edition=="iceborne"){edition="world";prefs.set("edition",edition);audio.play(edition)};if(remember&&section!=activeSection)sectionHistory.addLast(activeSection);activeSection=section;prefs.set("lastSection",section);renderBase()}
    private fun renderSection(){
        library?.let{libraryStates[activeSection]=it.snapshot()};library=null;content.removeAllViews()
        when(activeSection){
            "overview"->overview()
            "progression"->{if(!worldComplete()&&edition=="iceborne")switchEdition("world")else content.addView(ProgressScreen(this),FrameLayout.LayoutParams(-1,-1))}
            else->{library=LibraryScreen(this,activeSection,libraryStates[activeSection]);content.addView(library,FrameLayout.LayoutParams(-1,-1))}
        }
    }
    fun refreshCurrentSection(){renderBase()}
    fun replaceLibraryState(section:String,state:JSONObject){library=null;libraryStates[section]=state}
    fun worldComplete()=RouteProgress.completeAll(libraryData.getJSONObject("speedrun").getJSONArray("world"),RouteProgress.state(prefs,"world"))
    fun switchEdition(next:String){if(edition==next)return;if(activeSection=="progression"&&next=="iceborne"&&!worldComplete())return;edition=next;prefs.set("edition",next);audio.play(next);renderBase()}
    fun loadBitmap(path:String,callback:(Bitmap?)->Unit){
        cache.get(path)?.let{callback(it);return}
        images.execute{val bitmap=runCatching{assets.open(path).use{BitmapFactory.decodeStream(it)}}.getOrNull();if(bitmap!=null)cache.put(path,bitmap);runOnUiThread{if(!destroyed)callback(bitmap)}}
    }
    fun assetImage(path:String,view:ImageView){
        view.tag=path;cache.get(path)?.let{view.setImageBitmap(it);return}
        images.execute{val bitmap=runCatching{assets.open(path).use{BitmapFactory.decodeStream(it)}}.getOrNull()
            if(bitmap!=null){cache.put(path,bitmap);runOnUiThread{if(!destroyed&&view.tag==path)view.setImageBitmap(bitmap)}}}
    }
    private fun overview(){
        val hero=FrameLayout(this);content.addView(hero,FrameLayout.LayoutParams(-1,-1))
        val artwork=ImageView(this).apply{scaleType=ImageView.ScaleType.FIT_CENTER;contentDescription=if(isIce)"Iceborne complete key artwork"else "World complete key artwork"}
        hero.addView(artwork,FrameLayout.LayoutParams(-1,-1));assetImage("art/$edition-hero.webp",artwork)
        hero.addView(View(this).apply{background=GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,intArrayOf(alphaColour(bg,20),alphaColour(bg,0),alphaColour(bg,100)))},FrameLayout.LayoutParams(-1,-1))
        val copy=column();copy.gravity=Gravity.CENTER;copy.setPadding(dp(20),0,dp(20),0)
        val logo=ImageView(this).apply{scaleType=ImageView.ScaleType.FIT_CENTER;contentDescription=if(isIce)"Monster Hunter World Iceborne logo"else "Monster Hunter World logo"}
        copy.addView(logo,LinearLayout.LayoutParams(dp(if(wide)390 else 290),dp(if(wide)148 else 118)));assetImage("art/$edition-logo.webp",logo)
        gap(copy,12)
        copy.addView(text(if(isIce)"Into the frost"else "A new world",if(wide)32f else 27f,true).apply{gravity=Gravity.CENTER;setShadowLayer(5f,1f,2f,Color.BLACK)})
        copy.addView(text(if(isIce)"Beyond your limits"else "A hunter’s calling",if(wide)34f else 28f,colour=accent).apply{gravity=Gravity.CENTER;setShadowLayer(5f,1f,2f,Color.BLACK)})
        gap(copy,24)
        val searchWrap=FrameLayout(this);searchWrap.addView(HaloView(this,accent,prefs),FrameLayout.LayoutParams(-1,-1))
        val search=iconButton("search","Search monsters, weapons, equipment and items"){showSearch()}
        search.background=GradientDrawable(GradientDrawable.Orientation.TL_BR,intArrayOf(blend(bg,accent,.16f),bg)).apply{shape=GradientDrawable.OVAL;setStroke(dp(1),accent)}
        touch(search){search.animate().scaleX(1.16f).scaleY(1.16f).setDuration(motionDuration(110)).withEndAction{search.animate().scaleX(1f).scaleY(1f).setDuration(motionDuration(220)).start()}.start();showSearch()}
        searchWrap.addView(search,FrameLayout.LayoutParams(dp(68),dp(68),Gravity.CENTER));copy.addView(searchWrap,LinearLayout.LayoutParams(dp(140),dp(118)))
        hero.addView(copy,FrameLayout.LayoutParams(-1,-2,Gravity.CENTER))
    }
    fun afterPreference(key:String){
        if(key in listOf("musicEnabled","volume","followTheme","musicMode","rememberMusicPosition")){audio.play(edition);audio.updateVolume();return}
        if(key=="reset"){audio.play(edition);audio.updateVolume()}
        renderBase();overlays.forEach{it.container.setBackgroundColor(alphaColour(bg,190))}
    }
    fun clearSearchHistory(){recent=JSONArray();prefs.set("recent","[]");if(queryInput!=null)runSearch()}
    private fun showIntro(){
        val cover=FrameLayout(this);cover.setBackgroundColor(bg);root.addView(cover,FrameLayout.LayoutParams(-1,-1));introView=cover
        val centre=column();centre.gravity=Gravity.CENTER
        val flake=EmblemView(this,accent).apply{formation=0f;rotationX=9f;rotationY=-65f;cameraDistance=dp(700).toFloat();contentDescription="Forming snowflake introduction"}
        centre.addView(flake,LinearLayout.LayoutParams(dp(138),dp(150)));gap(centre,22)
        centre.addView(text("MONSTER HUNTER",12f,colour=accent).apply{letterSpacing=.24f;gravity=Gravity.CENTER})
        centre.addView(text("Field Book",27f,true).apply{gravity=Gravity.CENTER})
        cover.addView(centre,FrameLayout.LayoutParams(-1,-2,Gravity.CENTER))
        cover.post{
            if(destroyed)return@post
            introStarted=true;if(foreground)audio.formation()
            introAnimator=ValueAnimator.ofFloat(0f,1f).apply{duration=3000;interpolator=android.view.animation.DecelerateInterpolator()
                addUpdateListener{val t=it.animatedValue as Float;flake.formation=(t*1.25f).coerceAtMost(1f);flake.rotationY=-65+65*t;flake.alpha=.3f+.7f*t}
                addListener(object:AnimatorListenerAdapter(){override fun onAnimationEnd(a:Animator){if(destroyed)return;cover.animate().alpha(0f).setDuration(600).withEndAction{if(!destroyed){root.removeView(cover);introView=null;introDone=true;audio.introductionFinished()}}.start()}});start()
            }
        }
    }
    private inner class BoundPanel:RevealFrame(this@MainActivity){
        var capWidth=840
        var fill=false
        override fun onMeasure(w:Int,h:Int){val maxW=min(MeasureSpec.getSize(w),dp(capWidth));val maxH=max(dp(80),MeasureSpec.getSize(h)-dp(if(landscape)16 else 36));super.onMeasure(MeasureSpec.makeMeasureSpec(maxW,if(fill)MeasureSpec.EXACTLY else MeasureSpec.AT_MOST),MeasureSpec.makeMeasureSpec(maxH,if(fill)MeasureSpec.EXACTLY else MeasureSpec.AT_MOST))}
    }
    private fun present(kind:String,body:View,width:Int=840,menu:Boolean=false):View{
        val container=FrameLayout(this);container.setBackgroundColor(alphaColour(bg,205));container.isClickable=true
        val holder=BoundPanel();holder.capWidth=width;holder.background=surface();holder.elevation=dp(12).toFloat();holder.isClickable=true
        holder.fill=kind in listOf("search","settings","record","saved","credits")
        holder.addView(body,FrameLayout.LayoutParams(-1,if(holder.fill)-1 else -2));val p=FrameLayout.LayoutParams(-1,if(holder.fill) -1 else -2,if(menu)Gravity.TOP or Gravity.START else Gravity.CENTER)
        p.setMargins(dp(12),dp(if(menu)80 else 12),dp(12),dp(12));container.addView(holder,p)
        val overlay=Overlay(kind,container,holder);overlays+=overlay;root.addView(container,FrameLayout.LayoutParams(-1,-1))
        container.setOnClickListener{dismiss()};holder.setOnClickListener{}
        enter(holder,container);return holder
    }
    private fun enter(view:View,container:View){
        val duration=motionDuration(340);if(duration==0L||prefs.text("transition","liquid")=="none")return
        container.alpha=0f;container.animate().alpha(1f).setDuration(duration).start()
        when(prefs.text("transition","liquid")){
            "liquid"->{(view as? RevealFrame)?.let{it.reveal=0f;ValueAnimator.ofFloat(0f,1f).apply{this.duration=duration;interpolator=android.view.animation.PathInterpolator(.22f,.75f,.3f,1f);addUpdateListener{a->it.reveal=a.animatedValue as Float};start()}}}
            "slide"->{view.translationY=dp(28).toFloat();view.animate().translationY(0f).setDuration(duration).start()}
            "zoom"->{view.scaleX=.91f;view.scaleY=.91f;view.animate().scaleX(1f).scaleY(1f).setDuration(duration).start()}
        }
    }
    private fun dismiss(){
        val overlay=overlays.lastOrNull()?:return;if(overlay.closing)return;overlay.closing=true
        if(overlay.kind=="search"){hideKeyboard();searchGeneration.incrementAndGet();queryInput=null;resultBody=null;resultScroll=null}
        if(overlay.kind=="menu")emblem.animate().rotationY(0f).setDuration(motionDuration(380)).start()
        val finish={root.removeView(overlay.container);overlays.remove(overlay);if(overlay.kind=="settings")settings=null}
        val duration=motionDuration(240)
        if(duration==0L||prefs.text("transition","liquid")=="none")finish()else overlay.container.animate().alpha(0f).setDuration(duration).withEndAction{finish()}.start()
    }
    private fun heading(title:String,close:()->Unit={dismiss()}):LinearLayout=row().apply{
        setPadding(dp(18),dp(14),dp(12),dp(14));addView(text(title,25f,true),LinearLayout.LayoutParams(0,-2,1f));addView(iconButton("close","Close $title",close),LinearLayout.LayoutParams(dp(44),dp(44)))
    }
    private fun showMenu(){
        if(overlays.lastOrNull()?.kind=="menu"){dismiss();return}
        emblem.animate().rotationY(180f).setDuration(motionDuration(380)).start()
        val body=column();body.addView(heading("Field Guide"));rule(body)
        val scroll=ScrollView(this);val list=column();pad(list,7);scroll.addView(list)
        sections.forEach{(key,label)->val b=button(label){dismiss();navigate(key)};b.gravity=Gravity.START or Gravity.CENTER_VERTICAL;b.setTextColor(if(key==activeSection)accent else muted);list.addView(b,LinearLayout.LayoutParams(-1,dp(44)))}
        list.addView(button("Sources & credits"){dismiss();showCredits()});body.addView(scroll)
        present("menu",body,340,true)
    }
    fun showSettings(category:String="Appearance"){
        if(overlays.lastOrNull()?.kind=="settings")return
        val host=column();settings=SettingsPanel(this,host,category);settings!!.rebuild();present("settings",host,if(prefs.text("settingsLayout","center")=="split"&&wide)1000 else 840)
    }
    fun closeTop()=dismiss()
    fun settingsHeading(title:String)=heading(title)
    fun showSearch(kind:String?=null){
        if(overlays.lastOrNull()?.kind=="search")return
        if(kind!=null)searchKind=kind
        val body=column();val searchRow=row();searchRow.setPadding(dp(14),dp(10),dp(7),dp(10))
        val input=EditText(this).apply{
            setSingleLine(true);hint="Search";contentDescription="Search both World and Iceborne";textSize=17f*prefs.number("font",100)/100f;typeface=bodyFont;setTextColor(ink);setHintTextColor(muted)
            background=android.graphics.drawable.ColorDrawable(Color.TRANSPARENT);inputType=android.text.InputType.TYPE_CLASS_TEXT or android.text.InputType.TYPE_TEXT_FLAG_CAP_SENTENCES;imeOptions=android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH;setText(searchQuery);setSelection(length())
        };queryInput=input
        searchRow.addView(input,LinearLayout.LayoutParams(0,dp(48),1f))
        searchRow.addView(iconButton("close","Clear search"){input.setText("")},LinearLayout.LayoutParams(dp(46),dp(48)))
        searchRow.addView(iconButton("back","Close search"){dismiss()},LinearLayout.LayoutParams(dp(44),dp(48)));body.addView(searchRow);rule(body)
        body.addView(text("WORLD + ICEBORNE · OFFLINE",10f,colour=accent).apply{setPadding(dp(18),dp(9),dp(12),dp(9));letterSpacing=.12f})
        val chips=HorizontalScrollView(this);chips.isHorizontalScrollBarEnabled=false;val chipRow=row();chipRow.setPadding(dp(10),0,dp(10),dp(8));chips.addView(chipRow)
        val categories=listOf("All","Monsters","Weapons","Weapon Guides","Equipment","Builds","Items","Recipes","Preparation","Quests","Locales","Maps","Field Notes","Creatures")
        categories.forEach{category->val chip=button(category){searchKind=category;for(i in 0 until chipRow.childCount)(chipRow.getChildAt(i) as TextView).setTextColor(if(categories[i]==category)accent else muted);runSearch()};chip.setTextColor(if(category==searchKind)accent else muted);val lp=LinearLayout.LayoutParams(-2,dp(40));lp.marginEnd=dp(6);chipRow.addView(chip,lp)};body.addView(chips);rule(body)
        resultScroll=ScrollView(this);resultBody=column();resultBody!!.setPadding(dp(10),dp(6),dp(10),dp(16));resultScroll!!.addView(resultBody);body.addView(resultScroll,LinearLayout.LayoutParams(-1,0,1f))
        present("search",body,900)
        input.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s:CharSequence?,start:Int,count:Int,after:Int){}
            override fun onTextChanged(s:CharSequence?,start:Int,before:Int,count:Int){searchQuery=s.toString();searchRelated=false;runSearch()}
            override fun afterTextChanged(s:Editable?){}
        })
        runSearch();input.requestFocus();input.postDelayed({if(!destroyed&&input.isAttachedToWindow&&overlays.lastOrNull()?.kind=="search")(getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager).showSoftInput(input,InputMethodManager.SHOW_IMPLICIT)},250)
    }
    private fun hideKeyboard(){(getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(root.windowToken,0)}
    private fun runSearch(){
        val body=resultBody?:return;val generation=searchGeneration.incrementAndGet();val query=searchQuery.trim();val kind=searchKind
        body.removeAllViews()
        if(query.isBlank()){
            if(historyEnabled&&recent.length()>0){
                val head=row();head.addView(text("Recent searches",15f),LinearLayout.LayoutParams(0,-2,1f));head.addView(button("Clear"){recent=JSONArray();prefs.set("recent","[]");runSearch()});body.addView(head)
                for(i in 0 until recent.length()){
                    val term=recent.optString(i);val line=row();line.addView(button(term){queryInput?.setText(term)},LinearLayout.LayoutParams(0,-2,1f));line.addView(iconButton("close","Remove $term from history"){val values=(0 until recent.length()).map{recent.getString(it)}.filter{it!=term};recent=JSONArray(values);prefs.set("recent",recent.toString());runSearch()},LinearLayout.LayoutParams(dp(44),dp(44)));body.addView(line)
                }
            }else body.addView(text("Search names, partial names or equipment attributes.\nTry “Rathalos”, “Potion” or “fire great sword”.",14f,colour=muted).apply{setPadding(dp(12),dp(20),dp(12),dp(16))})
            return
        }
        if(!ready){body.addView(text("Preparing offline search…",14f,colour=muted));return}
        body.addView(text("Searching…",13f,colour=muted))
        catalogue.executor.execute{
            if(generation!=searchGeneration.get())return@execute
            val records=runCatching{catalogue.search(query,kind,searchRelated)}
            runOnUiThread{if(!destroyed&&generation==searchGeneration.get()&&body===resultBody){
                body.removeAllViews();records.onFailure{body.addView(text("Search could not finish. Try another name.",14f,colour=muted))}
                records.onSuccess{hits->
                    body.addView(text(if(hits.isEmpty())"No matching records. Try a shorter name."else "${hits.size}${if(hits.size==100)"+" else ""} results${if(searchRelated)" · related records" else ""}",12f,colour=muted).apply{setPadding(dp(10),dp(10),0,dp(10))})
                    val groups=hits.groupBy{it.kind};groups.forEach{(group,list)->body.addView(text(group.uppercase(),10f,colour=accent).apply{letterSpacing=.14f;setPadding(dp(10),dp(14),0,dp(8))});list.forEach{body.addView(recordRow(it));rule(body)}}
                    resultScroll?.scrollTo(0,0)
                }
            }}
        }
    }
    fun recordRow(record:FieldRecord,onOpen:()->Unit={rememberQuery();hideKeyboard();showRecord(record)}):LinearLayout=row().apply{
        val spacing=if(prefs.text("density","compact")=="compact")13 else 20
        setPadding(dp(12),dp(spacing),dp(12),dp(spacing));minimumHeight=dp(86)
        if(record.image.isNotBlank()){
            val image=ImageView(this@MainActivity).apply{scaleType=ImageView.ScaleType.FIT_CENTER;contentDescription="${record.name} artwork"};val size=if(record.image.contains("/icons/"))40 else 68;addView(image,LinearLayout.LayoutParams(dp(size*prefs.number("iconSize",100)/100),dp(size)));assetImage(record.image,image)
        }else addView(EmblemView(this@MainActivity,accent),LinearLayout.LayoutParams(dp(38),dp(40)))
        val info=column();info.setPadding(dp(14),0,dp(4),0);info.addView(text(record.name,16f));info.addView(text(record.summary.take(180),12f,colour=muted).apply{maxLines=3;ellipsize=TextUtils.TruncateAt.END});info.addView(text(when(record.game){"world"->"WORLD";"iceborne"->"ICEBORNE";else->"WORLD + ICEBORNE"},9f,colour=accent).apply{letterSpacing=.12f;setPadding(0,dp(6),0,0)});addView(info,LinearLayout.LayoutParams(0,-2,1f))
        touch(this){onOpen()}
    }
    private fun rememberQuery(){if(!historyEnabled||searchQuery.isBlank())return;val values=mutableListOf(searchQuery.trim());for(i in 0 until recent.length()){val term=recent.getString(i);if(term!=searchQuery.trim())values+=term};recent=JSONArray(values.take(12));prefs.set("recent",recent.toString())}
    fun showRecord(record:FieldRecord){present("record",RecordPanel(this,record){dismiss()},1000)}
    fun closeLibraryDetail():Boolean=library?.closeSelection()?:false
    fun openReference(value:String,kind:String?=null){
        if(!catalogue.ready){toast("Preparing offline catalogue…");return}
        catalogue.executor.execute{val hits=catalogue.reference(value,kind);runOnUiThread{if(!destroyed){
            when(hits.size){0->toast("No separate record is available for this reference.");1->showRecord(hits.first());else->showRecordList("Choose a record",hits)}
        }}}
    }
    fun showRecordList(title:String,records:List<FieldRecord>){
        val body=column();body.addView(heading(title));val list=ListView(this)
        list.adapter=object:BaseAdapter(){override fun getCount()=records.size;override fun getItem(position:Int)=records[position];override fun getItemId(position:Int)=position.toLong();override fun getView(position:Int,convertView:View?,parent:ViewGroup):View=recordRow(records[position])}
        body.addView(list,LinearLayout.LayoutParams(-1,0,1f));present("saved",body,950)
    }
    fun isBookmarked(id:String)=(0 until bookmarks.length()).any{bookmarks.optString(it)==id}
    fun toggleBookmark(id:String){val ids=(0 until bookmarks.length()).map{bookmarks.getString(it)}.toMutableList();if(!ids.remove(id))ids+=id;bookmarks=JSONArray(ids);prefs.set("bookmarks",bookmarks.toString())}
    fun reloadStoredState(){bookmarks=runCatching{JSONArray(prefs.text("bookmarks","[]"))}.getOrDefault(JSONArray());recent=runCatching{JSONArray(prefs.text("recent","[]"))}.getOrDefault(JSONArray());libraryStates.clear();library=null;renderBase()}
    fun importMusic(uri:android.net.Uri){
        toast("Adding audio to the offline music library…")
        fileIo.execute{
            val result=runCatching{
                val id=java.util.UUID.randomUUID().toString();val folder=java.io.File(filesDir,"music").apply{mkdirs()};val file=java.io.File(folder,"custom-$id.audio")
                try{
                    contentResolver.openInputStream(uri)!!.use{input->file.outputStream().use{output->
                        val buffer=ByteArray(65536);var total=0L
                        while(true){val count=input.read(buffer);if(count<0)break;total+=count;require(total<=100L*1024*1024){"Choose an audio file smaller than 100 MB."};output.write(buffer,0,count)}
                    }}
                    val probe=android.media.MediaMetadataRetriever()
                    try{probe.setDataSource(file.path);require((probe.extractMetadata(android.media.MediaMetadataRetriever.METADATA_KEY_DURATION)?.toLongOrNull()?:0)>0){"That audio format could not be opened."}}finally{probe.release()}
                    val title=contentResolver.query(uri,arrayOf(android.provider.OpenableColumns.DISPLAY_NAME),null,null,null)?.use{cursor->if(cursor.moveToFirst())cursor.getString(0)else null}?:"Imported track"
                    JSONObject().put("id",id).put("title",title.take(100)).put("file",file.name)
                }catch(error:Exception){file.delete();throw error}
            }
            runOnUiThread{if(!destroyed){result.onSuccess{track->
                val tracks=JSONArray(prefs.text("tracks","[]"));tracks.put(track);prefs.set("tracks",tracks.toString());toast("Audio added for offline playback.");settings?.rebuild()
            }.onFailure{toast(it.message?:"Could not import that audio.")}}}
        }
    }
    fun showCampChecklist(){
        val body=column();body.addView(heading("Before leaving camp"));val checks=runCatching{JSONObject(prefs.text("campChecks","{}"))}.getOrDefault(JSONObject());val items=libraryData.getJSONArray("checklist")
        for(i in 0 until items.length())body.addView(CheckBox(this).apply{text=items.getString(i);setTextColor(ink);isChecked=checks.optBoolean(i.toString());minHeight=dp(50);setOnCheckedChangeListener{_,v->checks.put(i.toString(),v);prefs.set("campChecks",checks.toString())}})
        body.addView(button("Clear camp checklist"){prefs.set("campChecks","{}");dismiss();showCampChecklist()});present("checklist",body,650)
    }
    private fun readable(value:Any):String=when(value){is JSONArray->(0 until value.length()).joinToString(" · "){readable(value.get(it))};is JSONObject->value.keys().asSequence().filter{value.opt(it)!=JSONObject.NULL&&value.opt(it).toString()!="0"}.joinToString(" · "){key->"${key.replaceFirstChar{it.uppercase()}}: ${readable(value.get(key))}"};else->value.toString()}
    private fun showSaved(){
        val body=column();body.addView(heading("Saved entries"));rule(body);val scroll=ScrollView(this);val list=column();pad(list);scroll.addView(list);body.addView(scroll,LinearLayout.LayoutParams(-1,0,1f))
        if(!catalogue.ready){list.addView(text("Preparing saved entries…",14f));present("saved",body);return}
        if(bookmarks.length()==0)list.addView(text("No bookmarks yet. Search for a record to save it.",14f,colour=muted))else catalogue.executor.execute{val records=(0 until bookmarks.length()).mapNotNull{catalogue.record(bookmarks.getString(it))};runOnUiThread{if(!destroyed)records.forEach{list.addView(recordRow(it))}}}
        present("saved",body)
    }
    fun showCredits(){
        val body=column();body.addView(heading("Sources & credits"));rule(body);val scroll=ScrollView(this);val notes=column();pad(notes,20);scroll.addView(notes);body.addView(scroll,LinearLayout.LayoutParams(-1,0,1f))
        notes.addView(text("Unofficial fan project. Monster Hunter game material belongs to Capcom and the respective rights holders.\n\nNative Kotlin milestone 0.2.0\nSource data and artwork are retained from the completed HTML guide.",14f));gap(notes)
        val credits=assets.open("credits.json").bufferedReader().use{JSONObject(it.readText())};val sources=credits.optJSONArray("sources")?:JSONArray()
        for(i in 0 until sources.length()){val source=sources.getJSONObject(i);notes.addView(text(source.optString("name"),14f,colour=accent));notes.addView(text(source.optString("url"),11f,colour=muted));gap(notes,12)}
        notes.addView(text(credits.optJSONObject("iconLicense")?.optString("licenseText")?:"",10f,colour=muted));gap(notes)
        notes.addView(text(credits.optString("databaseLicense"),10f,colour=muted));gap(notes)
        notes.addView(text(credits.optString("fontLicense"),10f,colour=muted));present("credits",body)
    }
    @Deprecated("Activity result supports Android 7+") override fun onActivityResult(request:Int,result:Int,data:Intent?){super.onActivityResult(request,result,data);backups.onResult(request,result,data)}
    @Deprecated("Back handling supports Android 7+") override fun onBackPressed(){
        if(!introDone)return
        if(overlays.isNotEmpty()){dismiss();return}
        if(closeLibraryDetail())return
        if(sectionHistory.isNotEmpty()){navigate(sectionHistory.removeLast(),false);return}
        if(activeSection!="overview"){navigate("overview",false);return}
        if(prefs.flag("confirmExit"))AlertDialog.Builder(this).setTitle("Leave Field Book?").setMessage("Your settings and bookmarks are saved on this device.").setNegativeButton("Stay",null).setPositiveButton("Exit"){_,_->finish()}.show()else finish()
    }
}
