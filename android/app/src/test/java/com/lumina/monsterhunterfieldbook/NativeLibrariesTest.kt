package com.lumina.monsterhunterfieldbook

import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import org.json.*
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.*
import org.robolectric.annotation.Config
import java.time.Duration
import java.util.concurrent.TimeUnit

@RunWith(RobolectricTestRunner::class)
@Config(sdk=[24,36],qualifiers="w411dp-h891dp-port")
class NativeLibrariesTest {
    private fun walk(v:View):List<View> = listOf(v)+if(v is ViewGroup)(0 until v.childCount).flatMap{walk(v.getChildAt(it))}else emptyList()
    private fun catalogue()=Catalogue(RuntimeEnvironment.getApplication()).apply{open()}
    @Test fun completeProfilesAndLibrariesAreAccessible(){
        val c=catalogue()
        try {
            assertTrue(c.counts().values.sum()>10000)
            listOf("Monsters","Weapons","Equipment","Creatures","Items","Recipes","Quests","Locales","Maps","Field Notes","Weapon Guides","Builds","Preparation").forEach{kind->
                val page=c.browse(LibraryFilter(kind));assertTrue(kind,page.total>0);assertTrue(page.records.isNotEmpty());assertEquals(page.records.first(),c.record(page.records.first().id))
            }
            val monster=c.reference("rathalos","Monsters").single().data()
            assertTrue(monster.getJSONObject("database").getJSONArray("hitzones").length()>0)
            assertTrue(monster.getJSONObject("database").getJSONArray("rewards").length()>0)
            val armour=c.browse(LibraryFilter("Equipment","armours",game="iceborne",rank="MR")).records
            assertTrue(armour.isNotEmpty());assertTrue(armour.all{it.data().getString("rank")=="MR"})
            assertTrue(armour.first().data().has("skills"))
            val first=c.browse(LibraryFilter("Weapons"),0,20).records
            val second=c.browse(LibraryFilter("Weapons"),20,20).records
            assertTrue(first.none{a->second.any{b->a.id==b.id}})
            assertTrue(c.browse(LibraryFilter("Items",query="unfindablezq")).records.isEmpty())
        } finally {c.close()}
    }
    @Test fun materialLinksIncludeRecipesAndEquipment(){
        val c=catalogue()
        try {
            val potion=c.reference("Potion","Items").first();assertTrue(c.related(potion.id).any{it.kind=="Recipes"})
            val ore=c.reference("Iron Ore","Items").first();assertTrue(c.related(ore.id,0,1000).any{it.kind in setOf("Weapons","Equipment")})
            val locale=c.browse(LibraryFilter("Locales")).records.first();assertTrue(locale.data().getJSONArray("maps").getJSONObject(0).getString("image").startsWith("art/"))
        } finally {c.close()}
    }
    @Test fun routeUnlockingRelocksWithoutErasingOtherCampaign(){
        val assets=RuntimeEnvironment.getApplication().assets
        val stages=assets.open("library.json").bufferedReader().use{JSONObject(it.readText()).getJSONObject("speedrun").getJSONArray("world")}
        val state=JSONObject();assertFalse(RouteProgress.completeAll(stages,state));assertEquals(1,RouteProgress.visible(stages,state))
        for(i in 0 until stages.length()){
            val tasks=stages.getJSONObject(i).getJSONArray("tasks");for(j in 0 until tasks.length())state.put(tasks.getJSONObject(j).getString("id"),true)
        }
        assertTrue(RouteProgress.completeAll(stages,state))
        val ice=JSONObject().put("saved-iceborne-task",true)
        state.put(stages.getJSONObject(0).getJSONArray("tasks").getJSONObject(0).getString("id"),false)
        assertFalse(RouteProgress.completeAll(stages,state));assertTrue(ice.getBoolean("saved-iceborne-task"))
    }
    @Test fun nativeBackupRoundTripsAndRejectsInvalidValuesBeforeMutation(){
        val prefs=NativePrefs(RuntimeEnvironment.getApplication());prefs.reset()
        prefs.set("bookmarks",JSONArray().put("Monsters::rathalos:Rathalos").toString());prefs.set("columns","6");prefs.set("progress:world",JSONObject().put("task",true).toString())
        val encoded=NativeBackup.encode(prefs.snapshot());assertEquals(prefs.snapshot().toString(),NativeBackup.decode(encoded).toString())
        listOf(JSONObject().put("font",99999),JSONObject().put("columns","0"),JSONObject().put("bookmarks","[1]"),JSONObject().put("progress:world","{\"task\":\"yes\"}"),JSONObject().put("visualProfiles","[{\"name\":\"bad\",\"values\":{\"font\":99999}}]")).forEach{bad->
            val before=prefs.snapshot().toString();assertTrue(runCatching{NativeBackup.decode(JSONObject().put("format",NativeBackup.FORMAT).put("version",1).put("values",bad).toString())}.isFailure);assertEquals(before,prefs.snapshot().toString())
        }
        assertTrue(runCatching{NativeBackup.decode("{\"format\":\"html-backup\",\"version\":1,\"values\":{}}")} .isFailure)
        prefs.reset()
    }
    @Test fun zeroOnlyMonsterRowsAreHiddenButUsefulValuesRemain(){
        assertFalse(ContentText.monsterRow(JSONObject().put("name","Ivy").put("damage",0).put("initial",JSONObject.NULL)))
        assertTrue(ContentText.monsterRow(JSONObject().put("name","Mount").put("initial",50).put("damage",0)))
        assertFalse(ContentText.useful("0.0",true));assertTrue(ContentText.useful(0,false))
    }
    @Test fun exactManualGridAndNativeProfileWorkOnNarrowPhone(){
        NativePrefs(RuntimeEnvironment.getApplication()).reset()
        val controller=Robolectric.buildActivity(MainActivity::class.java).setup();val a=controller.get()
        a.catalogue.executor.submit{}.get(30,TimeUnit.SECONDS)
        Shadows.shadowOf(android.os.Looper.getMainLooper()).idleFor(Duration.ofSeconds(5))
        a.prefs.set("columns","6");a.navigate("bestiary")
        a.catalogue.executor.submit{}.get(30,TimeUnit.SECONDS);Shadows.shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals(6,walk(a.root).filterIsInstance<GridView>().single().numColumns)
        assertFalse(walk(a.root).any{it.javaClass.name.contains("WebView")})
        val record=a.catalogue.reference("rathalos","Monsters").single();a.showRecord(record)
        assertTrue(walk(a.root).filterIsInstance<RecordPanel>().any{it.record.id==record.id})
        a.onBackPressed();Shadows.shadowOf(android.os.Looper.getMainLooper()).idleFor(Duration.ofSeconds(1))
        assertEquals(6,walk(a.root).filterIsInstance<GridView>().single().numColumns)
        controller.pause().stop().destroy()
    }
}
