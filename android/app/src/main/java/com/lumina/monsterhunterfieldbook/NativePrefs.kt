package com.lumina.monsterhunterfieldbook

import android.content.Context
import org.json.JSONObject

class NativePrefs(context: Context) {
    private val storage=context.getSharedPreferences("native-field-book",Context.MODE_PRIVATE)
    var values=runCatching { JSONObject(storage.getString("preferences","{}")!!) }.getOrDefault(JSONObject())
        private set
    fun number(key:String, default:Int)=values.optInt(key,default)
    fun flag(key:String, default:Boolean=true)=values.optBoolean(key,default)
    fun text(key:String, default:String)=values.optString(key,default)
    fun set(key:String,value:Any){values.put(key,value);save()}
    fun save(){storage.edit().putString("preferences",values.toString()).apply()}
    fun reset(){values=JSONObject();save()}
    fun snapshot()=JSONObject(values.toString())
    fun applySnapshot(snapshot:JSONObject){values=JSONObject(snapshot.toString());save()}
}
