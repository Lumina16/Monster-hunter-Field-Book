package com.lumina.monsterhunterfieldbook

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Handler
import android.os.Looper
import android.animation.ValueAnimator

/** Two native players crossfade; no service or background playback. */
class FieldAudio(private val context:Context,private val prefs:NativePrefs):AudioManager.OnAudioFocusChangeListener {
    private val manager=context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
    private var player:MediaPlayer?=null
    private var retiring:MediaPlayer?=null
    private var intro:MediaPlayer?=null
    private var fade:ValueAnimator?=null
    private var edition=""
    private var foreground=false
    private var introductionDone=false
    private var focused=false
    private val handler=Handler(Looper.getMainLooper())
    private fun make(path:String):MediaPlayer = MediaPlayer().apply{
        setAudioAttributes(AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_MEDIA).setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build())
        context.assets.openFd(path).use{setDataSource(it.fileDescriptor,it.startOffset,it.length)}
        prepare()
    }
    private fun focus():Boolean {
        if(focused)return true
        focused=manager.requestAudioFocus(this,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN)==AudioManager.AUDIOFOCUS_REQUEST_GRANTED
        return focused
    }
    fun formation(){
        if(!foreground||!focus())return
        intro=runCatching{make("music/formation.wav").apply{setVolume(.65f,.65f);setOnCompletionListener{it.release();intro=null};start()}}.getOrNull()
    }
    fun introductionFinished(){introductionDone=true;play(edition.ifBlank{"world"})}
    fun play(next:String){
        val changed=edition!=next;edition=next
        if(!foreground||!introductionDone||!prefs.flag("musicEnabled")){pausePlayers();return}
        if(!focus())return
        if(changed||player==null){
            fade?.cancel();retiring?.release();retiring=player
            player=runCatching{make("music/$next.mp3").apply{isLooping=true;setVolume(0f,0f);start()}}.getOrNull()
            crossfade(true)
        }else if(player?.isPlaying!=true){player?.start();crossfade(false)}else updateVolume()
    }
    private fun crossfade(replace:Boolean){
        fade?.cancel();val volume=prefs.number("volume",25)/100f
        fade=ValueAnimator.ofFloat(0f,1f).apply{
            duration=1200;addUpdateListener{val t=it.animatedValue as Float
                runCatching{player?.setVolume(volume*t,volume*t);retiring?.setVolume(volume*(1-t),volume*(1-t))}
                if(t>=1f){retiring?.release();retiring=null}
            };start()
        }
    }
    fun updateVolume(){val v=prefs.number("volume",25)/100f;runCatching{player?.setVolume(v,v)}}
    private fun pausePlayers(){fade?.cancel();runCatching{player?.pause();retiring?.pause();intro?.pause()}}
    fun resume(){foreground=true;if(introductionDone)play(edition.ifBlank{"world"})else if(intro!=null&&focus())runCatching{intro?.start()}}
    fun pause(){foreground=false;pausePlayers();manager.abandonAudioFocus(this);focused=false}
    override fun onAudioFocusChange(change:Int){
        handler.post{when(change){AudioManager.AUDIOFOCUS_GAIN->{focused=true;if(foreground&&introductionDone&&prefs.flag("musicEnabled"))play(edition.ifBlank{"world"})}
            AudioManager.AUDIOFOCUS_LOSS,AudioManager.AUDIOFOCUS_LOSS_TRANSIENT->{focused=false;pausePlayers()}
            AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK->{runCatching{player?.setVolume(.06f,.06f)}}}}
    }
    fun release(){pause();intro?.release();player?.release();retiring?.release();intro=null;player=null;retiring=null}
}
