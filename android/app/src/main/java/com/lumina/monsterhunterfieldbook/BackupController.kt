package com.lumina.monsterhunterfieldbook

import android.app.*
import android.content.*
import android.widget.*
import org.json.*
import java.util.concurrent.Executors

/** Native-only backup format. Validation finishes before any preferences change. */
object NativeBackup {
    const val FORMAT="monster-hunter-field-book-native"
    const val MAX_BYTES=2*1024*1024
    private val integers=mapOf("font" to 75..160,"lineSpacing" to 0..20,"letterSpacing" to 0..20,"wordSpacing" to 0..12,"iconSize" to 75..140,"gradientStrength" to 0..60,"speed" to 0..100,"volume" to 0..100)
    private val flags=setOf("animations","gradients","glow","particles","blur","imageMotion","musicEnabled","confirmExit","rememberScroll","singleGroup","rememberGroups","searchHistory","followTheme","musicPaused","rememberMusicPosition")
    private val objects=setOf("bookmarks","recent","visualProfiles","readingGroups","campChecks","musicPositions","trackOrder","hiddenTracks")
    private val enums=mapOf("density" to setOf("compact","comfortable"),"startup" to setOf("overview","last"),"settingsLayout" to setOf("center","split"),"performance" to setOf("full","light"),"transition" to setOf("liquid","fade","slide","zoom","none"),"touch" to setOf("ripple","halo","glow","sparks","none"),"musicMode" to setOf("one","library","shuffle"),"edition" to setOf("world","iceborne"),"columns" to setOf("auto","1","2","3","4","5","6"),"rows" to (1..8).map{it.toString()}.toSet(),"gradientAngle" to setOf("0","1","2"))
    fun encode(values:JSONObject):String {
        val copy=JSONObject(values.toString());copy.remove("tracks");copy.remove("speedUndo")
        return JSONObject().put("format",FORMAT).put("version",1).put("appVersion","0.2.0").put("values",copy).toString(2)
    }
    fun decode(text:String):JSONObject {
        require(text.toByteArray(Charsets.UTF_8).size<=MAX_BYTES){"Backup is too large."}
        val backup=JSONObject(text);require(backup.optString("format")==FORMAT&&backup.optInt("version")==1){"Choose a native Field Book backup."}
        val values=backup.getJSONObject("values");require(values.length()<=50000){"Backup contains too many settings."}
        validate(values)
        values.remove("speedUndo");return values
    }
    private fun validate(values:JSONObject,preset:Boolean=false){
        values.keys().forEach{key->
            val value=values.get(key)
            require(value is String||value is Number||value is Boolean){"Invalid setting value: "+key}
            if(preset)require(key in SettingsPanel.visualKeys){"Invalid saved-look setting: "+key}
            if(key in integers){require(value is Number&&value.toDouble()==value.toInt().toDouble()&&value.toInt() in integers.getValue(key)){"Setting is out of range: "+key}}
            if(key in flags)require(value is Boolean){"Invalid switch: "+key}
            enums[key]?.let{require(value.toString() in it){"Unknown option: "+key}}
            if(key=="theme")require(value is String&&(value in SettingsPanel.palettes.keys||value in setOf("game","custom"))){"Unknown theme."}
            if(key.startsWith("sort:")||key in setOf("sortWeapons","sortResources"))require(value in setOf("name","source","rarity","attack","tree")){"Unknown sort order."}
            if(key in setOf("customBg","customAccent","customInk"))require(value is Int||value is Long){"Invalid colour."}
            if(value is String){
                require(value.length<=MAX_BYTES/2){"Setting value is too large."}
                if(key in objects||key.startsWith("progress:")||key.startsWith("goals:")||key.startsWith("filter:")||key.startsWith("mapView:")){
                    if(key in setOf("bookmarks","recent","trackOrder","hiddenTracks")){
                        val array=JSONArray(value);require(array.length()<=20000){"Too many saved entries."};for(i in 0 until array.length())require(array.get(i) is String){"Invalid saved entry."}
                    }else if(key=="visualProfiles"){
                        val profiles=JSONArray(value);require(profiles.length()<=200){"Too many saved looks."}
                        for(i in 0 until profiles.length()){val profile=profiles.getJSONObject(i);require(profile.getString("name").length<=50){"Saved look name is too long."};validate(profile.getJSONObject("values"),true)}
                    }else{
                        val objectValue=JSONObject(value)
                        if(key=="readingGroups"||key=="campChecks"||key.startsWith("progress:")||key.startsWith("goals:"))objectValue.keys().forEach{require(objectValue.get(it) is Boolean){"Invalid checklist value."}}
                        if(key=="musicPositions")objectValue.keys().forEach{require(objectValue.get(it) is Number&&objectValue.getDouble(it)>=0){"Invalid music position."}}
                        if(key.startsWith("mapView:"))listOf("scale","x","y").forEach{require(objectValue.optDouble(it,0.0).isFinite()){ "Invalid map position." }}
                        if(key.startsWith("filter:")){
                            require(objectValue.optString("game","all") in setOf("all","world","iceborne")){"Invalid collection filter."}
                            require(objectValue.optString("sort","name") in setOf("name","rarity","attack","source","tree")){"Invalid collection sort."}
                        }
                    }
                }
            }
            require(key!="tracks"){"Music files are managed on this device."}
        }
    }
}

class BackupController(private val a:MainActivity) {
    private val executor=Executors.newSingleThreadExecutor()
    private var pendingExport=""
    private val appearance=setOf("font","lineSpacing","letterSpacing","wordSpacing","density","iconSize","theme","customBg","customAccent","customInk","gradients","gradientStrength","gradientAngle")
    private val motion=setOf("animations","speed","transition","touch","glow","particles","blur","imageMotion","performance")
    private val browsing=setOf("startup","lastSection","settingsLayout","confirmExit","rememberScroll","singleGroup","rememberGroups","searchHistory","readingGroups","columns","rows")
    private val personal=setOf("bookmarks","recent","visualProfiles","campChecks","tracks","musicPositions","edition","trackOrder","hiddenTracks")
    fun export(){
        pendingExport=NativeBackup.encode(a.prefs.snapshot())
        val intent=Intent(Intent.ACTION_CREATE_DOCUMENT).addCategory(Intent.CATEGORY_OPENABLE).setType("application/json").putExtra(Intent.EXTRA_TITLE,"Monster_Hunter_Field_Book_Backup.json")
        runCatching{a.startActivityForResult(intent,701)}.onFailure{a.toast("No file picker is available.")}
    }
    fun importBackup(){runCatching{a.startActivityForResult(Intent(Intent.ACTION_OPEN_DOCUMENT).addCategory(Intent.CATEGORY_OPENABLE).setType("*/*").putExtra(Intent.EXTRA_MIME_TYPES,arrayOf("application/json","text/plain")),702)}.onFailure{a.toast("No file picker is available.")}}
    fun onResult(request:Int,result:Int,data:Intent?){
        if(result!=Activity.RESULT_OK)return
        val uri=data?.data?:return
        if(request==703){a.importMusic(uri);return}
        if(request !in listOf(701,702))return
        executor.execute{
            val resultValue=runCatching{
                if(request==701){a.contentResolver.openOutputStream(uri,"wt")!!.bufferedWriter().use{it.write(pendingExport)};null}
                else {
                    val bytes=a.contentResolver.openInputStream(uri)!!.use{input->
                        val output=java.io.ByteArrayOutputStream();val buffer=ByteArray(8192);var total=0
                        while(true){val count=input.read(buffer);if(count<0)break;total+=count;require(total<=NativeBackup.MAX_BYTES){"Backup is too large."};output.write(buffer,0,count)};output.toByteArray()
                    }
                    NativeBackup.decode(String(bytes,Charsets.UTF_8))
                }
            }
            a.runOnUiThread{if(!a.isFinishing&&!a.isDestroyed){
                resultValue.onFailure{a.toast(it.message?:"Could not read or write that file.")}
                resultValue.onSuccess{values->if(values==null)a.toast("Backup exported.")else confirmImport(values)}
            }}
        }
    }
    private fun confirmImport(values:JSONObject){
        val marks=runCatching{JSONArray(values.optString("bookmarks","[]")).length()}.getOrDefault(0)
        AlertDialog.Builder(a).setTitle("Restore native backup?").setMessage("Restores settings, filters, "+marks+" bookmarks and saved progress from this file. Imported music files stay on this device.").setNegativeButton("Cancel",null).setPositiveButton("Restore"){_,_->
            listOf("tracks","trackOrder","hiddenTracks").forEach{key->if(a.prefs.values.has(key))values.put(key,a.prefs.values.get(key))}
            a.prefs.applySnapshot(values);a.reloadStoredState();a.afterPreference("reset");a.rebuildSettings();a.toast("Backup restored.")
        }.show()
    }
    fun resetAllSettings(){
        val box=a.column();a.pad(box,18)
        box.addView(a.text("Bookmarks, campaign progress, checklists, music files, history and saved looks are kept.",14f));a.gap(box)
        val checked=CheckBox(a).apply{text="Reset appearance, effects, browsing and music settings";setTextColor(a.ink);minHeight=a.dp(50)};box.addView(checked)
        val dialog=AlertDialog.Builder(a).setTitle("Reset All Settings").setView(box)
            .setNegativeButton("Cancel",null).setPositiveButton("Reset"){_,_->
                if(!checked.isChecked)return@setPositiveButton
                val keep=JSONObject();a.prefs.values.keys().forEach{key->if(key in personal||key.startsWith("progress:")||key.startsWith("goals:"))keep.put(key,a.prefs.values.get(key))}
                a.prefs.applySnapshot(keep);a.reloadStoredState();a.afterPreference("reset");a.rebuildSettings()
            }.create()
        dialog.setOnShowListener{dialog.getButton(AlertDialog.BUTTON_POSITIVE).isEnabled=false;checked.setOnCheckedChangeListener{_,value->dialog.getButton(AlertDialog.BUTTON_POSITIVE).isEnabled=value}};dialog.show()
    }
    fun selectiveReset(){
        val labels=arrayOf("Appearance","Motion & effects","Browsing options","Saved filters & positions","Bookmarks","Speedrun & checklists","Search history","Saved visual presets","Music settings")
        val selected=BooleanArray(labels.size)
        AlertDialog.Builder(a).setTitle("Choose what to reset").setMultiChoiceItems(labels,selected){_,index,value->selected[index]=value}.setNegativeButton("Cancel",null).setPositiveButton("Review"){_,_->
            val indices=selected.indices.filter{selected[it]};if(indices.isEmpty()){a.toast("Nothing selected.");return@setPositiveButton}
            AlertDialog.Builder(a).setTitle("Confirm selected reset").setMessage(indices.joinToString("\n"){labels[it]}).setNegativeButton("Keep",null).setPositiveButton("Reset"){_,_->
                val remove=a.prefs.values.keys().asSequence().filter{key->indices.any{scope->when(scope){
                    0->key in appearance;1->key in motion;2->key in browsing||key.startsWith("sort:")
                    3->listOf("filter:","position:","recordPosition:","mapFloor:","mapView:","collection:").any{key.startsWith(it)}
                    4->key=="bookmarks";5->key.startsWith("progress:")||key.startsWith("goals:")||key in setOf("campChecks","speedUndo")
                    6->key=="recent";7->key=="visualProfiles";else->key in setOf("musicEnabled","musicPaused","followTheme","volume","musicMode","musicTrack","musicPositions","rememberMusicPosition")
                }}}.toList()
                remove.forEach{a.prefs.values.remove(it)};a.prefs.save();a.reloadStoredState();a.afterPreference("reset");a.rebuildSettings();a.toast("Selected data reset.")
            }.show()
        }.show()
    }
    fun release(){executor.shutdownNow()}
}
