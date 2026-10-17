package com.lumina.monsterhunterfieldbook

import android.animation.ValueAnimator
import android.app.AlertDialog
import android.graphics.Color
import android.view.*
import android.widget.*
import org.json.*

/** Native, immediately applied settings; groups are closed on each new visit. */
class SettingsPanel(private val a:MainActivity,private val host:LinearLayout,var category:String="Appearance") {
    private val opened=mutableSetOf<String>()
    private var scroll:ScrollView?=null
    private val categories=listOf("Appearance","Motion & effects","Browsing","Music","About & reset")
    companion object {
        val palettes=linkedMapOf(
            "forest" to intArrayOf(Color.rgb(13,21,18),Color.rgb(217,183,122),Color.rgb(238,233,220)),
            "frost" to intArrayOf(Color.rgb(12,20,34),Color.rgb(159,212,237),Color.rgb(231,239,243)),
            "obsidian" to intArrayOf(Color.rgb(14,14,17),Color.rgb(190,175,220),Color.rgb(235,231,245)),
            "ember" to intArrayOf(Color.rgb(34,20,18),Color.rgb(237,155,109),Color.rgb(250,233,220)),
            "ocean" to intArrayOf(Color.rgb(10,27,34),Color.rgb(101,210,217),Color.rgb(224,243,245)),
            "royal" to intArrayOf(Color.rgb(28,18,43),Color.rgb(196,155,232),Color.rgb(241,230,248)),
            "moss" to intArrayOf(Color.rgb(23,32,20),Color.rgb(173,204,125),Color.rgb(235,241,218)),
            "copper" to intArrayOf(Color.rgb(36,25,20),Color.rgb(220,169,117),Color.rgb(242,229,215)),
            "sakura" to intArrayOf(Color.rgb(39,24,32),Color.rgb(240,168,192),Color.rgb(250,231,238)),
            "storm" to intArrayOf(Color.rgb(24,29,38),Color.rgb(168,190,219),Color.rgb(232,237,246)),
            "rose" to intArrayOf(Color.rgb(36,28,38),Color.rgb(235,184,213),Color.rgb(246,232,242)),
            "parchment" to intArrayOf(Color.rgb(238,230,213),Color.rgb(110,80,42),Color.rgb(40,46,37)),
            "snow" to intArrayOf(Color.rgb(233,240,245),Color.rgb(38,87,119),Color.rgb(19,43,58))
        )
        val visualKeys=setOf("font","lineSpacing","letterSpacing","wordSpacing","density","iconSize","theme","customBg","customAccent","customInk","gradients","gradientStrength","gradientAngle","animations","speed","transition","touch","glow","particles","blur","imageMotion","performance")
    }
    private val p get()=a.prefs
    fun rebuild(){
        val position=scroll?.scrollY?:0;host.removeAllViews();host.setBackgroundColor(a.panel)
        host.addView(a.settingsHeading("Settings"));a.rule(host)
        val split=p.text("settingsLayout","center")=="split"&&a.wide
        val main=a.row();main.gravity=Gravity.TOP
        val tabs=if(split)a.column()else a.row()
        if(split){a.pad(tabs,10)}else tabs.setPadding(a.dp(10),0,a.dp(10),0)
        categories.forEach{label->val tab=a.button(label){category=label;scroll=null;rebuild()};tab.setTextColor(if(label==category)a.accent else a.muted);tabs.addView(tab,LinearLayout.LayoutParams(if(split)-1 else -2,a.dp(46)))}
        if(split){main.addView(tabs,LinearLayout.LayoutParams(a.dp(210),-1))}else{
            val horizontal=HorizontalScrollView(a);horizontal.isHorizontalScrollBarEnabled=false;horizontal.addView(tabs);host.addView(horizontal);a.rule(host)
        }
        scroll=ScrollView(a);val body=a.column();a.pad(body,16);scroll!!.addView(body)
        when(category){"Appearance"->appearance(body);"Motion & effects"->motion(body);"Browsing"->browsing(body);"Music"->music(body);else->about(body)}
        if(split){main.addView(scroll,LinearLayout.LayoutParams(0,-1,1f));host.addView(main,LinearLayout.LayoutParams(-1,0,1f))}else host.addView(scroll,LinearLayout.LayoutParams(-1,0,1f))
        scroll!!.post{scroll?.scrollTo(0,position)}
    }
    private fun changed(key:String,value:Any,rebuild:Boolean=false){p.set(key,value);a.afterPreference(key);if(rebuild)rebuild()}
    private fun group(parent:LinearLayout,title:String,content:(LinearLayout)->Unit){
        val card=a.column();card.background=a.surface();val head=a.row();head.setPadding(a.dp(13),a.dp(8),a.dp(13),a.dp(8));head.minimumHeight=a.dp(50)
        val triangle=GlyphView(a,"triangle",a.ink);head.addView(triangle,LinearLayout.LayoutParams(a.dp(16),a.dp(16)));head.addView(a.text(title,16f).apply{setPadding(a.dp(13),0,0,0)},LinearLayout.LayoutParams(0,-2,1f));card.addView(head)
        val inner=a.column();inner.setPadding(a.dp(15),a.dp(4),a.dp(15),a.dp(16));content(inner);inner.visibility=if(title in opened)View.VISIBLE else View.GONE;triangle.rotation=if(title in opened)90f else 0f;card.addView(inner)
        a.touch(head){
            val opening=inner.visibility==View.GONE
            if(opening){opened+=title;inner.visibility=View.VISIBLE;inner.alpha=0f;inner.animate().alpha(1f).setDuration(a.motionDuration(210)).start()}else{opened-=title;inner.visibility=View.GONE}
            triangle.animate().rotation(if(opening)90f else 0f).setDuration(a.motionDuration(250)).start()
            head.contentDescription="$title, ${if(opening)"expanded" else "collapsed"}"
        };head.contentDescription="$title, ${if(title in opened)"expanded" else "collapsed"}"
        parent.addView(card,LinearLayout.LayoutParams(-1,-2).apply{bottomMargin=a.dp(12)})
    }
    private fun help(body:LinearLayout,label:String){body.addView(a.text(label,12f,colour=a.muted).apply{setPadding(0,a.dp(6),0,a.dp(9))})}
    private fun toggle(body:LinearLayout,key:String,label:String,default:Boolean=true){
        val row=a.row();row.minimumHeight=a.dp(46);row.addView(a.text(label,13f),LinearLayout.LayoutParams(0,-2,1f))
        val control=Switch(a);control.contentDescription=label;control.isChecked=p.flag(key,default);control.buttonTintList=android.content.res.ColorStateList.valueOf(a.accent);control.thumbTintList=android.content.res.ColorStateList.valueOf(a.accent)
        control.setOnCheckedChangeListener{_,checked->changed(key,checked)};row.addView(control);body.addView(row)
    }
    private fun range(body:LinearLayout,key:String,label:String,min:Int,max:Int,default:Int,suffix:String=""){
        val heading=a.text("$label · ${p.number(key,default)}$suffix",13f);body.addView(heading)
        val seek=SeekBar(a);seek.max=max-min;seek.progress=p.number(key,default)-min;seek.contentDescription=label;seek.progressTintList=android.content.res.ColorStateList.valueOf(a.accent);seek.thumbTintList=android.content.res.ColorStateList.valueOf(a.accent)
        seek.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(bar:SeekBar,value:Int,user:Boolean){if(user){heading.text="$label · ${value+min}$suffix";changed(key,value+min)}}
            override fun onStartTrackingTouch(bar:SeekBar){}
            override fun onStopTrackingTouch(bar:SeekBar){if(key in listOf("font","lineSpacing","letterSpacing","wordSpacing"))rebuild()}
        });body.addView(seek,LinearLayout.LayoutParams(-1,a.dp(42)));a.gap(body,7)
    }
    private fun choice(body:LinearLayout,key:String,label:String,choices:List<Pair<String,String>>,default:String){
        body.addView(a.text(label,12f,colour=a.muted));a.gap(body,5)
        val selected=choices.find{it.first==p.text(key,default)}?.second?:choices.first().second
        val button=a.button("$selected     ⌄"){
            val labels=choices.map{it.second}.toTypedArray();val current=choices.indexOfFirst{it.first==p.text(key,default)}
            AlertDialog.Builder(a).setTitle(label).setSingleChoiceItems(labels,current){dialog,index->changed(key,choices[index].first);dialog.dismiss();rebuild()}.setNegativeButton("Cancel",null).show()
        };button.gravity=Gravity.START or Gravity.CENTER_VERTICAL;button.contentDescription="$label, $selected";body.addView(button,LinearLayout.LayoutParams(-1,a.dp(46)));a.gap(body,12)
    }
    private fun appearance(body:LinearLayout){
        group(body,"Text & spacing"){
            range(it,"font","Font size",80,150,100,"%")
            range(it,"lineSpacing","Extra line spacing",0,16,0)
            range(it,"letterSpacing","Letter spacing",0,20,0)
            range(it,"wordSpacing","Word spacing",0,12,0)
        }
        group(body,"Cards & icons"){
            choice(it,"density","Card spacing",listOf("compact" to "Compact","comfortable" to "Comfortable"),"compact")
            range(it,"iconSize","Icon size",75,140,100,"%")
            help(it,"Applies to native library cards and search result icons.")
        }
        group(body,"Theme presets & custom colours"){
            choice(it,"theme","Theme",listOf("game" to "Follow World / Iceborne")+palettes.keys.map{key->key to key.replaceFirstChar{c->c.uppercase()}}+listOf("custom" to "Custom colours"),"game")
            listOf(Triple("customBg","Background",a.bg),Triple("customAccent","Accent",a.accent),Triple("customInk","Text",a.ink)).forEach{(key,label,default)->
                it.addView(a.button("$label · colour wheel"){pickColour(key,label,p.number(key,default))});a.gap(it,8)
            }
        }
        group(body,"Gradients"){
            toggle(it,"gradients","Gradients")
            range(it,"gradientStrength","Gradient intensity",0,60,18,"%")
            choice(it,"gradientAngle","Direction",listOf("0" to "Horizontal","1" to "Diagonal","2" to "Vertical"),"0")
        }
        group(body,"Saved visual presets"){inner->
            val names=runCatching{JSONArray(p.text("visualProfiles","[]"))}.getOrDefault(JSONArray())
            help(inner,"Save appearance and motion together as a look. Bookmarks and history are kept separate.")
            inner.addView(a.button("Save current look"){
                val input=EditText(a);input.hint="Preset name";input.setSingleLine(true)
                AlertDialog.Builder(a).setTitle("Save visual preset").setView(input).setNegativeButton("Cancel",null).setPositiveButton("Save"){_,_->
                    val name=input.text.toString().trim().take(50).ifBlank{"My look"};val snapshot=JSONObject();visualKeys.forEach{key->if(p.values.has(key))snapshot.put(key,p.values.get(key))}
                    names.put(JSONObject().put("name",name).put("values",snapshot));p.set("visualProfiles",names.toString());rebuild()
                }.show()
            });a.gap(inner,8)
            for(i in 0 until names.length()){
                val record=names.getJSONObject(i);val row=a.row()
                row.addView(a.button(record.optString("name")){
                    val snapshot=record.getJSONObject("values");visualKeys.forEach{key->p.values.remove(key)};snapshot.keys().forEach{key->p.values.put(key,snapshot.get(key))};p.save();a.afterPreference("theme");rebuild()
                },LinearLayout.LayoutParams(0,-2,1f))
                row.addView(a.iconButton("close","Delete ${record.optString("name")}"){
                    AlertDialog.Builder(a).setTitle("Delete saved look?").setMessage(record.optString("name")).setNegativeButton("Keep",null).setPositiveButton("Delete"){_,_->names.remove(i);p.set("visualProfiles",names.toString());rebuild()}.show()
                },LinearLayout.LayoutParams(a.dp(44),a.dp(44)));inner.addView(row);a.gap(inner,6)
            }
        }
        group(body,"Icon & rarity legend"){
            addLegend(it)
        }
    }
    private fun pickColour(key:String,label:String,initial:Int){
        val existingColours=a.themeColours()
        var selected=initial;val box=a.column();a.pad(box,16)
        val swatch=a.text(String.format("#%06X",selected and 0xffffff),16f);box.addView(swatch)
        val wheel=ColourWheel(a,initial){value->
            selected=value;swatch.text=String.format("#%06X",value and 0xffffff);swatch.setTextColor(value)
            if(p.text("theme","game")!="custom"){p.set("customBg",existingColours[0]);p.set("customAccent",existingColours[1]);p.set("customInk",existingColours[2])}
            p.set("theme","custom");p.set(key,value)
        }
        box.addView(wheel,LinearLayout.LayoutParams(-1,a.dp(240)))
        box.addView(a.text("Brightness",12f));val brightness=SeekBar(a);brightness.max=100;brightness.progress=(wheel.brightness*100).toInt();brightness.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{override fun onProgressChanged(s:SeekBar,v:Int,user:Boolean){if(user)wheel.brightness=v/100f};override fun onStartTrackingTouch(s:SeekBar){};override fun onStopTrackingTouch(s:SeekBar){}});box.addView(brightness)
        wheel.setOnClickListener{a.afterPreference(key)}
        val dialog=AlertDialog.Builder(a).setTitle(label).setView(box).setPositiveButton("Done",null).create()
        dialog.setOnDismissListener{a.afterPreference(key);rebuild()};dialog.show()
    }
    private fun motion(body:LinearLayout){
        group(body,"Animation controls"){
            toggle(it,"animations","Global animations")
            range(it,"speed","Animation speed · 0 means off",0,100,50)
            help(it,"The launch snowflake and audio fades remain part of the fixed opening sequence.")
        }
        group(body,"Panel transitions"){
            choice(it,"transition","Transition",listOf("liquid" to "Liquid reveal","fade" to "Fade","slide" to "Soft slide","zoom" to "Soft zoom","none" to "None"),"liquid")
            val preview=a.text("Field record preview",16f,true);a.pad(preview);preview.background=a.surface();it.addView(preview,LinearLayout.LayoutParams(-1,a.dp(70)));a.gap(it,10)
            it.addView(a.button("Preview open & close"){
                preview.alpha=0f;preview.scaleX=if(p.text("transition","liquid")=="zoom").9f else 1f;preview.translationY=if(p.text("transition","liquid")=="slide")a.dp(15).toFloat()else 0f
                preview.animate().alpha(1f).scaleX(1f).translationY(0f).setDuration(a.motionDuration(350)).withEndAction{preview.postDelayed({preview.animate().alpha(.2f).setDuration(a.motionDuration(240)).withEndAction{preview.alpha=1f}.start()},600)}.start()
            })
        }
        group(body,"Touch effects"){
            choice(it,"touch","Touch effect",listOf("ripple" to "Original gold ripple","halo" to "Halo","glow" to "Soft glow","sparks" to "Spark wash","none" to "None"),"ripple")
            it.addView(a.button("Touch to preview"){a.toast("${p.text("touch","ripple").replaceFirstChar{c->c.uppercase()}} effect")})
        }
        group(body,"Ambient effects"){
            toggle(it,"glow","Ambient glow");toggle(it,"particles","Frost particles");toggle(it,"blur","Backdrop blur, where supported");toggle(it,"imageMotion","Idle artwork motion")
            help(it,"Older Android versions use a dimmed backdrop instead of expensive software blur. Expanded catalogue effects are preview preferences in this milestone.")
        }
        group(body,"Performance"){
            choice(it,"performance","Effects mode",listOf("full" to "Full effects","light" to "Light mode"),"full")
            help(it,"Light mode stops ambient glow. Search and artwork decoding run off the main thread.")
        }
    }
    private fun browsing(body:LinearLayout){
        group(body,"Bestiary card grid"){
            choice(it,"columns","Cards across",listOf("auto" to "Auto")+(1..6).map{n->"$n" to "$n"},"auto")
            choice(it,"rows","Rows per batch",(1..8).map{n->"$n" to "$n"},"6")
            val count=p.text("columns","auto").toIntOrNull()?:if(a.wide)4 else 2;val rows=p.text("rows","6").toIntOrNull()?:6
            help(it,"$count across × $rows rows · ${count*rows} cards per batch. Your manual columns are never reduced.")
            val grid=GridLayout(a);grid.columnCount=count
            repeat(count*rows){grid.addView(android.view.View(a).apply{background=a.surface(a.line,false)},GridLayout.LayoutParams().apply{width=0;height=a.dp(18);columnSpec=GridLayout.spec(GridLayout.UNDEFINED,1f);setMargins(a.dp(2),a.dp(2),a.dp(2),a.dp(2))})};it.addView(grid,LinearLayout.LayoutParams(-1,-2))
        }
        group(body,"When the guide opens"){
            choice(it,"startup","Start position",listOf("overview" to "Overview","last" to "Last section"),"overview")
            help(it,"The snowflake introduction plays on every fresh launch. Returning from another app keeps your current screen.")
        }
        group(body,"Reading & navigation"){
            choice(it,"settingsLayout","Tablet Settings layout",listOf("center" to "Centred panel","split" to "Categories and controls side by side"),"center")
            help(it,"Narrow screens automatically use compact Settings without changing your saved layout preference.")
            toggle(it,"confirmExit","Ask before exiting")
            toggle(it,"rememberScroll","Remember section position")
            toggle(it,"singleGroup","One expandable reading group at a time",false)
            toggle(it,"rememberGroups","Remember reading groups")
            help(it,"Settings groups always start closed. Reading preferences apply to profiles, maps and campaign guidance.")
        }
        group(body,"Search history"){
            toggle(it,"searchHistory","Remember searches on this device")
            it.addView(a.button("Clear search history"){
                AlertDialog.Builder(a).setTitle("Clear search history?").setNegativeButton("Keep",null).setPositiveButton("Clear"){_,_->a.clearSearchHistory();a.toast("History cleared.")}.show()
            })
        }
        group(body,"Default sorting"){
            choice(it,"sortResources","Resources",listOf("name" to "Name A–Z","rarity" to "Rarity"),"name")
            choice(it,"sortWeapons","Weapons",listOf("source" to "Original order","name" to "Name A–Z","attack" to "Attack"),"source")
            listOf("armours" to "Armour","armourSets" to "Armour sets","decorations" to "Decorations","skills" to "Skills","charms" to "Charms","kinsects" to "Kinsects","palicoEquipment" to "Palico equipment","palicoGadgets" to "Palico gadgets","tools" to "Tools","canteen" to "Canteen","foodSkills" to "Food skills","Monsters" to "Large monsters","smallMonsters" to "Small monsters","endemicLife" to "Endemic life","Quests" to "Quests").forEach{(key,label)->
                choice(it,"sort:"+key,label,listOf("name" to "Name A–Z","rarity" to "Highest rarity","source" to "Source order"),"name")
            }
            help(it,"Clear a collection’s filters to use its new default sorting order.")
        }
    }
    private fun music(body:LinearLayout){
        group(body,"Camp music"){
            toggle(it,"musicEnabled","Play music automatically")
            range(it,"volume","Music volume",0,100,25,"%")
            toggle(it,"followTheme","Follow World / Iceborne music")
            toggle(it,"rememberMusicPosition","Resume from saved track position")
            choice(it,"musicMode","Playback order",listOf("library" to "Loop library","one" to "Repeat current track","shuffle" to "Shuffle"),"library")
            help(it,"World: Stars at Our Backs\nIceborne: Nay! The Honor is All Ours\n\nMusic pauses when minimised and resumes on return. Theme changes crossfade between bundled tracks. The launch chime respects media volume.")
        }
        group(body,"Player & offline music library"){it.addView(MusicPanel(a),LinearLayout.LayoutParams(-1,-2))}
    }
    private fun about(body:LinearLayout){
        group(body,"This milestone"){
            it.addView(a.text("Monster Hunter Field Book\n0.2.0 · Offline libraries & progress",19f,true));a.gap(it)
            help(it,"Native libraries, complete source record data, weapon trees, maps, campaign tracking, bookmarks, backups and local music. All content is bundled. Source videos and reference links open online. Visual matching and decorative polish remain for a later milestone.")
            it.addView(a.button("Sources & credits"){a.showCredits()})
        }
        group(body,"Backup & restore"){
            help(it,"Export native settings, filters, bookmarks and progress. Restore validates the file before asking for confirmation. Imported audio files are kept on this device and are not included in the backup. HTML backups are not supported.")
            it.addView(a.button("Export native backup"){a.backups.export()});a.gap(it,8)
            it.addView(a.button("Restore native backup"){a.backups.importBackup()})
        }
        group(body,"Selective reset"){
            help(it,"Choose exactly which settings or progress to clear, then review the selection.")
            it.addView(a.button("Choose what to reset"){a.backups.selectiveReset()})
        }
        group(body,"Reset All Settings"){
            help(it,"Keeps bookmarks, campaign progress, camp checks, music files, search history and saved looks. Tick the scope and confirm to reset settings.")
            it.addView(a.button("Reset All Settings"){a.backups.resetAllSettings()})
        }
    }
    private fun addLegend(body:LinearLayout){
        help(body,"Tap an icon to inspect its meaning. Rarity is a tier, not a guarantee of the best equipment.")
        fun icon(label:String,path:String,description:String,colour:Int?=null){
            val row=a.row();val image=ImageView(a).apply{scaleType=ImageView.ScaleType.FIT_CENTER;contentDescription=label}
            row.addView(image,LinearLayout.LayoutParams(a.dp(35),a.dp(35)));if(path.isNotBlank())a.assetImage(path,image)
            row.addView(a.text(label,13f,colour=colour?:a.ink).apply{setPadding(a.dp(12),0,0,0)},LinearLayout.LayoutParams(0,a.dp(46),1f))
            a.touch(row){
                val box=a.column();a.pad(box,18);val enlarged=ImageView(a).apply{scaleType=ImageView.ScaleType.FIT_CENTER;contentDescription=label}
                box.addView(enlarged,LinearLayout.LayoutParams(-1,a.dp(150)));if(path.isNotBlank())a.assetImage(path,enlarged)
                box.addView(a.text(description,14f));AlertDialog.Builder(a).setTitle(label).setView(box).setPositiveButton("Close",null).show()
            };body.addView(row)
        }
        val colours=a.libraryData.getJSONObject("rarityColours")
        val equipment=a.libraryData.optJSONObject("legendEquipment")?.optJSONObject("armour-head")
        for(rarity in 1..12){val key=rarity.toString();icon("Rarity "+key,equipment?.optString(key)?:"","Equipment rarity "+key+". Weapon and armour icons use this tier’s colour.",runCatching{Color.parseColor(colours.getString(key))}.getOrDefault(a.accent))}
        val slots=a.libraryData.optJSONObject("legendSlots")?:JSONObject()
        for(level in 1..4)icon("Decoration slot "+level,slots.optString(level.toString()),"A level "+level+" slot accepts jewels of level "+level+" or lower. A jewel’s slot size is distinct from its rarity.")
        val names=a.libraryData.optJSONObject("effectNames")?:JSONObject();val legend=a.libraryData.optJSONObject("legend")?:JSONObject()
        names.keys().forEach{key->icon(ContentText.label(names.getString(key)),legend.optString(key),"Identifies the "+names.getString(key)+" element, ailment or effect in the guide. Consult each profile for its recorded effectiveness.")}
    }
}
