package com.lumina.monsterhunterfieldbook

import android.app.AlertDialog
import android.view.*
import android.widget.*
import org.json.*

object RouteProgress {
    fun state(p:NativePrefs,game:String)=runCatching{JSONObject(p.text("progress:"+game,"{}"))}.getOrDefault(JSONObject())
    fun complete(stage:JSONObject,state:JSONObject):Boolean {val tasks=stage.optJSONArray("tasks")?:return false;return tasks.length()>0&&(0 until tasks.length()).all{state.optBoolean(tasks.getJSONObject(it).getString("id"))}}
    fun completeAll(stages:JSONArray,state:JSONObject)=stages.length()>0&&(0 until stages.length()).all{complete(stages.getJSONObject(it),state)}
    fun visible(stages:JSONArray,state:JSONObject):Int {for(i in 0 until stages.length())if(!complete(stages.getJSONObject(i),state))return i+1;return stages.length()}
}

class ProgressScreen(private val a:MainActivity):ScrollView(a) {
    private val body=a.column()
    private val game=a.currentEdition
    private val stages=a.libraryData.getJSONObject("speedrun").getJSONArray(game)
    private val state=RouteProgress.state(a.prefs,game)
    private val groups=mutableListOf<ReadingGroup>()
    init {
        a.pad(body,14);addView(body)
        body.addView(a.text("Speedrun · "+game.uppercase(),27f,true));a.gap(body)
        val total=(0 until stages.length()).sumOf{stages.getJSONObject(it).getJSONArray("tasks").length()}
        val done=(0 until stages.length()).sumOf{i->val tasks=stages.getJSONObject(i).getJSONArray("tasks");(0 until tasks.length()).count{state.optBoolean(tasks.getJSONObject(it).getString("id"))}}
        body.addView(a.text(done.toString()+" / "+total+" requirements",14f,colour=a.accent))
        val bar=ProgressBar(a,null,android.R.attr.progressBarStyleHorizontal);bar.max=total;bar.progress=done;bar.contentDescription=done.toString()+" of "+total+" story requirements completed";body.addView(bar,LinearLayout.LayoutParams(-1,a.dp(12)));a.gap(body)
        val visible=RouteProgress.visible(stages,state)
        for(i in 0 until visible){
            val stage=stages.getJSONObject(i);val complete=RouteProgress.complete(stage,state)
            val group=ReadingGroup(a,"route:"+game+":"+stage.getString("id"),(i+1).toString()+". "+stage.getString("title")+(if(complete)" · complete"else""),groups,!complete){inner->
                inner.addView(a.text(stage.optString("rank"),11f,colour=a.muted))
                val tasks=stage.getJSONArray("tasks")
                for(j in 0 until tasks.length()){
                    val task=tasks.getJSONObject(j);val id=task.getString("id")
                    val row=a.row();val check=CheckBox(a);check.text=task.getString("name");check.setTextColor(a.ink);check.isChecked=state.optBoolean(id);check.minHeight=a.dp(48)
                    row.addView(check,LinearLayout.LayoutParams(0,-2,1f))
                    val reference=task.optString("questId").ifBlank{task.optString("monsterId")}
                    if(reference.isNotBlank())row.addView(a.button("Info"){a.openReference(reference)})
                    check.setOnCheckedChangeListener{_,value->
                        state.put(id,value);a.prefs.set("progress:"+game,state.toString());a.prefs.values.remove("speedUndo");a.prefs.save();a.refreshCurrentSection()
                    };inner.addView(row)
                }
                val tips=stage.optJSONArray("tips")?:JSONArray()
                for(j in 0 until tips.length())inner.addView(a.text("• "+tips.getString(j),13f,colour=a.muted))
            }
            body.addView(group,LinearLayout.LayoutParams(-1,-2).apply{bottomMargin=a.dp(12)})
        }
        if(RouteProgress.completeAll(stages,state)){
            body.addView(a.text(game.uppercase()+" STORY COMPLETE",16f,true,colour=a.accent));a.gap(body)
            if(game=="world")body.addView(a.button("Continue to Iceborne"){a.switchEdition("iceborne")})
        }else body.addView(a.text("Complete the current stage to reveal the next requirements.",12f,colour=a.muted))
        a.gap(body)
        body.addView(a.button("Reset this route"){
            AlertDialog.Builder(a).setTitle("Reset "+game.uppercase()+" route?").setMessage("Clears this campaign’s checked requirements. Other campaign progress is kept. Undo is available until the next task change.")
                .setNegativeButton("Keep",null).setPositiveButton("Reset"){_,_->
                    a.prefs.set("speedUndo",JSONObject().put("game",game).put("tasks",state).toString());a.prefs.set("progress:"+game,"{}");a.refreshCurrentSection()
                }.show()
        })
        val undo=runCatching{JSONObject(a.prefs.text("speedUndo","{}"))}.getOrDefault(JSONObject())
        if(undo.optString("game")==game&&undo.has("tasks"))body.addView(a.button("Undo route reset"){
            a.prefs.set("progress:"+game,undo.getJSONObject("tasks").toString());a.prefs.values.remove("speedUndo");a.prefs.save();a.refreshCurrentSection()
        })
        a.gap(body,18)
        val guidance=a.libraryData.getJSONObject("progress").getJSONArray(game)
        body.addView(ReadingGroup(a,"campaign:"+game,"Campaign guidance & general goals",groups){inner->
            val checked=runCatching{JSONObject(a.prefs.text("goals:"+game,"{}"))}.getOrDefault(JSONObject())
            for(i in 0 until guidance.length()){
                val chapter=guidance.getJSONObject(i);inner.addView(a.text(chapter.getString("title"),17f,true));inner.addView(a.text(chapter.optString("text"),14f));val tasks=chapter.getJSONArray("tasks")
                for(j in 0 until tasks.length()){
                    val key=chapter.getString("id")+":"+j
                    inner.addView(CheckBox(a).apply{text=tasks.getString(j);setTextColor(a.ink);isChecked=checked.optBoolean(key);setOnCheckedChangeListener{_,v->checked.put(key,v);a.prefs.set("goals:"+game,checked.toString())}})
                };a.gap(inner,14)
            }
        },LinearLayout.LayoutParams(-1,-2))
    }
}
