package com.lumina.monsterhunterfieldbook

import android.app.AlertDialog
import android.content.Intent
import android.os.*
import android.view.*
import android.widget.*

/** Foreground player controls; refreshes only while this panel is visible. */
class MusicPanel(private val a:MainActivity):LinearLayout(a) {
    private val name=a.text("",16f,true)
    private val time=a.text("",12f,colour=a.muted)
    private val seek=SeekBar(a)
    private val play=a.button("Play / pause"){a.music.toggle();update()}
    private val queue=a.column()
    private val handler=Handler(Looper.getMainLooper())
    private var dragging=false
    private val ticker=object:Runnable{override fun run(){if(isShown)update();if(isAttachedToWindow)handler.postDelayed(this,700)}}
    init {
        orientation=VERTICAL
        addView(name);addView(time);a.gap(this,6)
        seek.contentDescription="Music playback position"
        seek.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onStartTrackingTouch(bar:SeekBar){dragging=true}
            override fun onProgressChanged(bar:SeekBar,value:Int,user:Boolean){if(user)time.text=stamp(value)+" / "+stamp(a.music.duration)}
            override fun onStopTrackingTouch(bar:SeekBar){dragging=false;a.music.seek(bar.progress)}
        });addView(seek,LayoutParams(-1,a.dp(44)))
        val controls=a.row()
        controls.addView(a.button("Previous"){a.music.advance(-1);update()},LayoutParams(0,-2,1f))
        controls.addView(play,LayoutParams(0,-2,1f))
        controls.addView(a.button("Next"){a.music.advance(1);update()},LayoutParams(0,-2,1f));addView(controls);a.gap(this)
        addView(a.button("Import audio file"){
            runCatching{a.startActivityForResult(Intent(Intent.ACTION_OPEN_DOCUMENT).addCategory(Intent.CATEGORY_OPENABLE).setType("audio/*"),703)}.onFailure{a.toast("No file picker is available.")}
        },LayoutParams(-1,-2));a.gap(this)
        addView(queue);rebuildQueue();update()
        addView(a.button("Restore bundled tracks"){a.music.restoreBuiltins();rebuildQueue();update()},LayoutParams(-1,-2))
    }
    private fun stamp(ms:Int)="%d:%02d".format(ms/60000,(ms/1000)%60)
    private fun update(){
        val track=a.music.tracks().find{it.id==a.music.trackId}
        name.text=track?.title?:"Choose a track"
        play.text=if(a.music.playing)"Pause"else"Play"
        if(!dragging){seek.max=a.music.duration.coerceAtLeast(1);seek.progress=a.music.position;time.text=stamp(a.music.position)+" / "+stamp(a.music.duration)}
    }
    private fun rebuildQueue(){
        queue.removeAllViews()
        a.music.tracks().forEach{track->
            val title=a.button(track.title){a.music.select(track.id);update()};title.gravity=Gravity.START or Gravity.CENTER_VERTICAL;queue.addView(title,LayoutParams(-1,-2))
            val controls=a.row()
            controls.addView(a.button("Move up"){a.music.move(track.id,-1);rebuildQueue()},LayoutParams(0,-2,1f))
            controls.addView(a.button("Move down"){a.music.move(track.id,1);rebuildQueue()},LayoutParams(0,-2,1f))
            controls.addView(a.button(if(track.builtin)"Hide"else"Remove"){
                AlertDialog.Builder(a).setTitle(if(track.builtin)"Hide bundled track?"else"Remove imported audio?").setMessage(track.title)
                    .setNegativeButton("Keep",null).setPositiveButton("Remove"){_,_->a.music.remove(track.id);rebuildQueue();update()}.show()
            },LayoutParams(0,-2,1f));queue.addView(controls);a.gap(queue,10)
        }
    }
    override fun onAttachedToWindow(){super.onAttachedToWindow();handler.post(ticker)}
    override fun onDetachedFromWindow(){handler.removeCallbacksAndMessages(null);super.onDetachedFromWindow()}
}
