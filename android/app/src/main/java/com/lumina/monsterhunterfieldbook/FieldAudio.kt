package com.lumina.monsterhunterfieldbook

import android.content.Context
import android.media.*
import android.os.*
import android.animation.ValueAnimator
import org.json.*
import java.io.File

data class MusicTrack(val id:String,val title:String,val path:String,val builtin:Boolean)

/** Foreground-only native playback. Imported audio remains in private app files. */
class FieldAudio(private val context:Context,private val prefs:NativePrefs):AudioManager.OnAudioFocusChangeListener {
    private val manager=context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
    private var player:MediaPlayer?=null
    private var retiring:MediaPlayer?=null
    private var intro:MediaPlayer?=null
    private var fade:ValueAnimator?=null
    private var edition="world"
    private var foreground=false
    private var introductionDone=false
    private var focused=false
    private var prepared=false
    private var selected=""
    private val handler=Handler(Looper.getMainLooper())
    val trackId get()=selected
    val playing get()=prepared&&runCatching{player?.isPlaying==true}.getOrDefault(false)
    val position get()=if(prepared)runCatching{player?.currentPosition?:0}.getOrDefault(0)else 0
    val duration get()=if(prepared)runCatching{player?.duration?:0}.getOrDefault(0)else 0
    fun tracks():List<MusicTrack>{
        val list=mutableListOf(MusicTrack("world","Stars at Our Backs","music/world.mp3",true),MusicTrack("iceborne","Nay! The Honor is All Ours","music/iceborne.mp3",true))
        val customs=runCatching{JSONArray(prefs.text("tracks","[]"))}.getOrDefault(JSONArray())
        for(i in 0 until customs.length()){val item=customs.getJSONObject(i);val name=item.optString("file");if(name.matches(Regex("custom-[a-f0-9-]+\\.audio"))&&File(context.filesDir,"music/"+name).exists())list+=MusicTrack(item.getString("id"),item.getString("title"),File(context.filesDir,"music/"+name).path,false)}
        val hidden=runCatching{JSONArray(prefs.text("hiddenTracks","[]"))}.getOrDefault(JSONArray());val hiddenIds=(0 until hidden.length()).map{hidden.getString(it)}
        val order=runCatching{JSONArray(prefs.text("trackOrder","[]"))}.getOrDefault(JSONArray());val orderIds=(0 until order.length()).map{order.getString(it)}
        return list.filter{it.id !in hiddenIds}.sortedBy{val index=orderIds.indexOf(it.id);if(index<0)10000 else index}
    }
    fun formation(){
        if(!foreground||!focus())return
        intro=runCatching{MediaPlayer().apply{
            setAudioAttributes(attributes());context.assets.openFd("music/formation.wav").use{setDataSource(it.fileDescriptor,it.startOffset,it.length)};prepare();setVolume(.65f,.65f);setOnCompletionListener{it.release();intro=null};start()
        }}.getOrNull()
    }
    private fun attributes()=AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_MEDIA).setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build()
    private fun focus():Boolean {if(focused)return true;focused=manager.requestAudioFocus(this,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN)==AudioManager.AUDIOFOCUS_REQUEST_GRANTED;return focused}
    fun introductionFinished(){introductionDone=true;play(edition)}
    fun play(next:String){
        edition=next
        if(!foreground||!introductionDone||!prefs.flag("musicEnabled")||prefs.flag("musicPaused",false)){pausePlayers();return}
        if(!focus())return
        val tracks=tracks();val desired=if(prefs.flag("followTheme"))next else prefs.text("musicTrack",selected.ifBlank{next})
        val track=tracks.find{it.id==desired}?:tracks.firstOrNull()
        if(track==null){pausePlayers();return}
        if(selected!=track.id||player==null)choose(track.id,false)
        else if(prepared&&!playing){player?.start();crossfade()}else updateVolume()
    }
    fun select(id:String){prefs.set("followTheme",false);prefs.set("musicTrack",id);prefs.set("musicPaused",false);prefs.set("musicEnabled",true);choose(id,true)}
    private fun rememberPosition(){
        if(!prepared||selected.isBlank())return
        val positions=runCatching{JSONObject(prefs.text("musicPositions","{}"))}.getOrDefault(JSONObject());positions.put(selected,position);prefs.set("musicPositions",positions.toString())
    }
    private fun choose(id:String,force:Boolean){
        val track=tracks().find{it.id==id}?:return
        if(!force&&id==selected&&player!=null)return
        rememberPosition();fade?.cancel();retiring?.release();retiring=player;player=null;prepared=false;selected=id;prefs.set("musicTrack",id)
        if(!foreground||!introductionDone||!focus())return
        val next=MediaPlayer();player=next
        runCatching{
            next.setAudioAttributes(attributes())
            if(track.builtin)context.assets.openFd(track.path).use{next.setDataSource(it.fileDescriptor,it.startOffset,it.length)}else next.setDataSource(track.path)
            next.setVolume(0f,0f)
            next.setOnPreparedListener{
                if(player!==it)return@setOnPreparedListener
                prepared=true;it.isLooping=prefs.text("musicMode","library")=="one"
                if(prefs.flag("rememberMusicPosition")){
                    val positions=runCatching{JSONObject(prefs.text("musicPositions","{}"))}.getOrDefault(JSONObject());val position=positions.optInt(id,0);if(position in 1 until it.duration)it.seekTo(position)
                }
                if(foreground&&introductionDone&&prefs.flag("musicEnabled")&&!prefs.flag("musicPaused",false)){it.start();crossfade()}
            }
            next.setOnCompletionListener{advance(1)}
            next.setOnErrorListener{p,_,_->if(player===p){prepared=false;player=null};p.release();true}
            next.prepareAsync()
        }.onFailure{if(player===next){prepared=false;player=null};next.release()}
    }
    private fun crossfade(){
        fade?.cancel();val volume=prefs.number("volume",25).coerceIn(0,100)/100f
        fade=ValueAnimator.ofFloat(0f,1f).apply{duration=1200;addUpdateListener{val t=it.animatedValue as Float
            runCatching{player?.setVolume(volume*t,volume*t);retiring?.setVolume(volume*(1-t),volume*(1-t))}
            if(t>=1f){retiring?.release();retiring=null}
        };start()}
    }
    fun toggle(){val pause=!prefs.flag("musicPaused",false);prefs.set("musicPaused",pause);if(pause)pausePlayers()else {prefs.set("musicEnabled",true);play(edition)}}
    fun seek(milliseconds:Int){if(prepared)runCatching{player?.seekTo(milliseconds.coerceIn(0,duration));rememberPosition()}}
    fun advance(delta:Int){
        val tracks=tracks();if(tracks.isEmpty())return
        if(delta<0&&position>3000){seek(0);return}
        val current=tracks.indexOfFirst{it.id==selected}.coerceAtLeast(0)
        val index=if(prefs.text("musicMode","library")=="shuffle"&&tracks.size>1)tracks.indices.filter{it!=current}.random()else (current+delta+tracks.size)%tracks.size
        prefs.set("followTheme",false);prefs.set("musicPaused",false);choose(tracks[index].id,true)
    }
    fun move(id:String,delta:Int){
        val ids=tracks().map{it.id}.toMutableList();val from=ids.indexOf(id);if(from<0)return;val to=(from+delta).coerceIn(0,ids.lastIndex);ids.add(to,ids.removeAt(from));prefs.set("trackOrder",JSONArray(ids).toString())
    }
    fun remove(id:String){
        val track=tracks().find{it.id==id}?:return
        if(track.builtin){val hidden=JSONArray(prefs.text("hiddenTracks","[]"));hidden.put(id);prefs.set("hiddenTracks",hidden.toString())}
        else {
            val custom=JSONArray(prefs.text("tracks","[]"));val keep=JSONArray();for(i in 0 until custom.length()){val item=custom.getJSONObject(i);if(item.optString("id")!=id)keep.put(item)}
            prefs.set("tracks",keep.toString());File(track.path).delete()
        }
        if(selected==id){player?.release();player=null;prepared=false;selected="";play(edition)}
    }
    fun restoreBuiltins(){prefs.set("hiddenTracks","[]");play(edition)}
    fun updateVolume(){
        val v=prefs.number("volume",25).coerceIn(0,100)/100f
        if(prepared)runCatching{player?.setVolume(v,v);player?.isLooping=prefs.text("musicMode","library")=="one"}
    }
    private fun pausePlayers(){rememberPosition();fade?.cancel();runCatching{if(prepared)player?.pause()};runCatching{retiring?.release()};retiring=null;runCatching{intro?.pause()}}
    fun resume(){foreground=true;if(introductionDone)play(edition)else if(intro!=null&&focus())runCatching{intro?.start()}}
    fun pause(){foreground=false;pausePlayers();manager.abandonAudioFocus(this);focused=false}
    override fun onAudioFocusChange(change:Int){handler.post{when(change){
        AudioManager.AUDIOFOCUS_GAIN->{focused=true;if(foreground){if(introductionDone)play(edition)else runCatching{intro?.start()}}}
        AudioManager.AUDIOFOCUS_LOSS,AudioManager.AUDIOFOCUS_LOSS_TRANSIENT->{focused=false;pausePlayers()}
        AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK->runCatching{if(prepared)player?.setVolume(.04f,.04f)}
    }}}
    fun release(){pause();intro?.release();player?.release();intro=null;player=null;handler.removeCallbacksAndMessages(null)}
}
