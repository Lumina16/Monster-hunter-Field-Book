package com.lumina.monsterhunterfieldbook

import android.content.res.Configuration
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.Shadows.shadowOf
import java.time.Duration

@RunWith(RobolectricTestRunner::class)
@Config(sdk=[24,36],qualifiers="w411dp-h891dp-port")
class NativeFoundationTest {
    private fun walk(v:View):List<View> = listOf(v)+if(v is ViewGroup)(0 until v.childCount).flatMap{walk(v.getChildAt(it))}else emptyList()
    @Test fun bundledCatalogueSupportsNamesTyposAndAttributeQueries(){
        val catalogue=Catalogue(org.robolectric.RuntimeEnvironment.getApplication())
        catalogue.open()
        try {
            assertEquals("Rathalos",catalogue.search("Rathalos").first().name)
            assertTrue(catalogue.search("rathlos","Monsters").any{it.name=="Rathalos"})
            assertTrue(catalogue.search("fire great sword","Weapons").isNotEmpty())
            assertTrue(catalogue.search("Honey","Recipes",related=true).isNotEmpty())
        } finally {catalogue.close()}
    }
    @Test fun nativeOverviewSettingsAndSearchRetainState(){
        val controller=Robolectric.buildActivity(MainActivity::class.java).setup()
        val activity=controller.get();val root=activity.root
        assertFalse(walk(root).any{it.javaClass.name.contains("WebView")})
        shadowOf(android.os.Looper.getMainLooper()).idleFor(Duration.ofSeconds(5))
        walk(root).first{it.contentDescription=="Settings"}.performClick()
        val heading=walk(root).filterIsInstance<TextView>().first{it.text.toString()=="Text & spacing"}
        val container=heading.parent as ViewGroup
        val card=container.parent as ViewGroup
        assertEquals(View.GONE,card.getChildAt(1).visibility)
        container.performClick()
        assertEquals(View.VISIBLE,card.getChildAt(1).visibility)
        activity.onBackPressed();shadowOf(android.os.Looper.getMainLooper()).idleFor(Duration.ofSeconds(1))
        walk(root).first{it.contentDescription=="Settings"}.performClick()
        val again=walk(root).filterIsInstance<TextView>().first{it.text.toString()=="Text & spacing"}
        assertEquals(View.GONE,((again.parent as ViewGroup).parent as ViewGroup).getChildAt(1).visibility)
        activity.onBackPressed();shadowOf(android.os.Looper.getMainLooper()).idleFor(Duration.ofSeconds(1))
        activity.showSearch()
        val input=walk(root).filterIsInstance<EditText>().first();input.setText("Rathalos")
        activity.onConfigurationChanged(Configuration(activity.resources.configuration).apply{orientation=Configuration.ORIENTATION_LANDSCAPE;screenWidthDp=891;screenHeightDp=411})
        assertEquals("Rathalos",walk(root).filterIsInstance<EditText>().first().text.toString())
        controller.pause().stop().destroy()
    }
}
