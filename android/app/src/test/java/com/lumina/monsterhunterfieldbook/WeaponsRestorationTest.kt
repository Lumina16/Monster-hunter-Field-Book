package com.lumina.monsterhunterfieldbook

import android.graphics.BitmapFactory
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ScrollView
import android.widget.Spinner
import android.widget.TextView
import org.json.JSONObject
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.Shadows.shadowOf
import org.robolectric.annotation.Config
import java.time.Duration
import java.util.concurrent.TimeUnit

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [24, 36], qualifiers = "w411dp-h891dp-port")
class WeaponsRestorationTest {
    private fun walk(v: View): List<View> =
        listOf(v) + if (v is ViewGroup) (0 until v.childCount).flatMap { walk(v.getChildAt(it)) } else emptyList()

    private fun awaitMain(a: MainActivity) {
        a.catalogue.executor.submit {}.get(30, TimeUnit.SECONDS)
        shadowOf(android.os.Looper.getMainLooper()).idleFor(Duration.ofSeconds(5))
        a.catalogue.executor.submit {}.get(30, TimeUnit.SECONDS)
        shadowOf(android.os.Looper.getMainLooper()).idle()
    }

    @Test
    fun weaponsLandingPageCardsSigilsFiltersNoticeAndProfileOpening() {
        NativePrefs(RuntimeEnvironment.getApplication()).reset()
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()
        val a = controller.get()
        awaitMain(a)
        a.setEdition("world")
        a.navigate("weapons")
        awaitMain(a)

        val screen = walk(a.root).filterIsInstance<WeaponsScreen>().single()
        assertFalse(walk(a.root).any { it.javaClass.name.contains("WebView") })
        assertTrue(walk(screen).filterIsInstance<TextView>().any { it.text.toString().contains("The World foundation.") })
        assertTrue(walk(screen).filterIsInstance<TextView>().any { it.text.toString() == "Great Sword" })
        assertTrue(walk(screen).filterIsInstance<TextView>().any { it.text.toString() == "Bow" })

        walk(screen).filterIsInstance<TextView>().first { it.text.toString() == "Ranged" }.performClick()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        val rangedScreen = walk(a.root).filterIsInstance<WeaponsScreen>().single()
        assertFalse(walk(rangedScreen).filterIsInstance<TextView>().any { it.text.toString() == "Great Sword" })
        assertTrue(walk(rangedScreen).filterIsInstance<TextView>().any { it.text.toString() == "Bow" })

        walk(rangedScreen).filterIsInstance<TextView>().first { it.text.toString() == "All 14 weapons" }.performClick()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        a.setEdition("iceborne")
        awaitMain(a)
        val ibScreen = walk(a.root).filterIsInstance<WeaponsScreen>().single()
        assertTrue(walk(ibScreen).filterIsInstance<TextView>().any { it.text.toString().contains("Iceborne additions included.") })

        walk(ibScreen).first { it.contentDescription == "Save Great Sword" }.performClick()
        assertTrue(a.isBookmarked("weapon:great-sword"))

        walk(ibScreen).filterIsInstance<TextView>().first { it.text.toString() == "Great Sword" }.let { tv ->
            generateSequence(tv.parent) { it.parent }.filterIsInstance<View>().first { it.isClickable }.performClick()
        }
        awaitMain(a)
        assertTrue(walk(a.root).filterIsInstance<WeaponProfilePanel>().isNotEmpty())
        controller.pause().stop().destroy()
    }

    @Test
    fun weaponProfileTabsMoveLoopsAndOpenFullWeaponRecordTransitions() {
        NativePrefs(RuntimeEnvironment.getApplication()).reset()
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()
        val a = controller.get()
        awaitMain(a)
        val guide = a.catalogue.browse(LibraryFilter("Weapon Guides"), 0, 20).records.first { it.rawId == "great-sword" }
        a.openWeaponProfile(guide)
        awaitMain(a)

        val panel = walk(a.root).filterIsInstance<WeaponProfilePanel>().single()
        assertEquals("guide", panel.state.optString("tab"))
        val worldFold = walk(panel).filterIsInstance<TextView>().first { it.text.toString() == "World move loop" }
        (worldFold.parent as View).performClick()
        assertFalse(a.weaponFolds["weapon_fold:great-sword:world"] ?: true)
        (worldFold.parent as View).performClick()
        assertTrue(a.weaponFolds["weapon_fold:great-sword:world"] ?: false)

        val openFull = walk(panel).filterIsInstance<TextView>().first { it.text.toString().startsWith("Open full weapon record") }
        openFull.performClick()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals("database", panel.state.optString("tab"))
        assertTrue(panel.state.optBoolean("detail"))
        assertEquals("guide", panel.state.optString("detailOrigin"))

        a.onBackPressed()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals("guide", panel.state.optString("tab"))
        assertFalse(panel.state.optBoolean("detail"))
        controller.pause().stop().destroy()
    }

    @Test
    fun databaseFiltersSingleScreenReplacementOriginReturnAndCompactHeader() {
        NativePrefs(RuntimeEnvironment.getApplication()).reset()
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()
        val a = controller.get()
        awaitMain(a)
        val guide = a.catalogue.browse(LibraryFilter("Weapon Guides"), 0, 20).records.first { it.rawId == "great-sword" }
        a.openWeaponProfile(guide, JSONObject().put("tab", "database"))
        awaitMain(a)

        val panel = walk(a.root).filterIsInstance<WeaponProfilePanel>().single()
        val search = walk(panel).filterIsInstance<EditText>().single()
        search.setText("Buster")
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals("Buster", panel.state.optString("q"))

        walk(panel).filterIsInstance<TextView>().first { it.text.toString() == "Reset" }.performClick()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals("", panel.state.optString("q"))

        val showMore = walk(panel).filterIsInstance<TextView>().firstOrNull { it.text.toString().startsWith("Show more") }
        if (showMore != null) {
            showMore.performClick()
            shadowOf(android.os.Looper.getMainLooper()).idle()
            assertEquals(160, panel.state.optInt("limit"))
        }

        val firstWeapon = panel.records.first()
        walk(panel).filterIsInstance<TextView>().first { it.text.toString() == firstWeapon.name }.let { tv ->
            generateSequence(tv.parent) { it.parent }.filterIsInstance<View>().first { it.isClickable }.performClick()
        }
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertTrue(panel.state.optBoolean("detail"))
        assertEquals("list", panel.state.optString("detailOrigin"))
        assertFalse(walk(panel).any { it is EditText })

        val detailScroll = walk(panel).filterIsInstance<ScrollView>().first()
        detailScroll.scrollTo(0, a.dp(160))
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals(View.VISIBLE, panel.getChildAt(0).visibility)

        a.onBackPressed()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertFalse(panel.state.optBoolean("detail"))
        assertEquals("database", panel.state.optString("tab"))
        controller.pause().stop().destroy()
    }

    @Test
    fun upgradeTreeFamilySelectorPanZoomResetMaterialsDockAndInfoReturn() {
        NativePrefs(RuntimeEnvironment.getApplication()).reset()
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()
        val a = controller.get()
        awaitMain(a)
        val guide = a.catalogue.browse(LibraryFilter("Weapon Guides"), 0, 20).records.first { it.rawId == "great-sword" }
        a.openWeaponProfile(guide, JSONObject().put("tab", "tree"))
        awaitMain(a)

        val profile = walk(a.root).filterIsInstance<WeaponProfilePanel>().single()
        val tree = walk(profile).filterIsInstance<WeaponTreePanel>().single()
        assertTrue(walk(tree).filterIsInstance<Spinner>().isNotEmpty())

        walk(tree).filterIsInstance<TextView>().first { it.text.toString() == "+" }.performClick()
        assertTrue(tree.logicalZoom() > 1f)
        walk(tree).filterIsInstance<TextView>().first { it.text.toString() == "Reset" }.performClick()
        assertEquals(1f, tree.logicalZoom(), 0.01f)

        val targetRecord = profile.records.first()
        tree.select(targetRecord)
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals("tree", profile.state.optString("tab"))
        assertFalse(profile.state.optBoolean("detail"))
        assertTrue(profile.state.optBoolean("treeDetails"))
        assertTrue(walk(tree).filterIsInstance<WeaponMaterialsView>().isNotEmpty())

        walk(tree).filterIsInstance<TextView>().first { it.text.toString() == "Info" }.performClick()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals("database", profile.state.optString("tab"))
        assertTrue(profile.state.optBoolean("detail"))
        assertEquals("tree", profile.state.optString("detailOrigin"))

        walk(profile).filterIsInstance<TextView>().first { it.text.toString() == "Back to tree" }.performClick()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals("tree", profile.state.optString("tab"))
        assertFalse(profile.state.optBoolean("detail"))
        controller.pause().stop().destroy()
    }

    @Test
    fun materialSkillQuestRecipeAndMonsterLinksPlusBookmarking() {
        NativePrefs(RuntimeEnvironment.getApplication()).reset()
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()
        val a = controller.get()
        awaitMain(a)
        val guide = a.catalogue.browse(LibraryFilter("Weapon Guides"), 0, 20).records.first { it.rawId == "great-sword" }
        val weapon = a.catalogue.browse(LibraryFilter("Weapons"), 0, 50).records.first {
            WeaponModel.data(it).optString("type") == "great-sword" &&
                (WeaponModel.data(it).optJSONObject("forge")?.optJSONArray("materials")?.length() ?: 0) > 0
        }
        a.openWeaponProfile(
            guide,
            JSONObject().put("tab", "database").put("detail", true).put("selected", WeaponModel.rawId(weapon))
        )
        awaitMain(a)

        val panel = walk(a.root).filterIsInstance<WeaponProfilePanel>().single()
        walk(panel).first { it.contentDescription == "Save ${weapon.name}" }.performClick()
        assertTrue(a.isBookmarked("weapon-db:${WeaponModel.rawId(weapon)}"))

        val matName = WeaponModel.data(weapon).getJSONObject("forge").getJSONArray("materials").getJSONObject(0).getString("name")
        val matChip = walk(panel).filterIsInstance<TextView>().first { it.text.toString() == matName }
        (matChip.parent as View).performClick()
        awaitMain(a)
        assertTrue(walk(a.root).filterIsInstance<RecordPanel>().any { it.record.name.equals(matName, ignoreCase = true) })
        controller.pause().stop().destroy()
    }

    @Test
    fun worldOnlyLibraryFilteringIncludesBothAndAllRequiredImagesDecode() {
        val app = RuntimeEnvironment.getApplication()
        val c = Catalogue(app).apply { open() }
        try {
            val worldItems = c.browse(LibraryFilter("Items", game = "world"), 0, 500).records
            assertTrue(worldItems.any { it.game == "both" })
            assertTrue(worldItems.none { it.game == "iceborne" })

            val library = app.assets.open("library.json").bufferedReader().use { JSONObject(it.readText()) }
            val audit = library.getJSONObject("assetAudit")
            assertEquals(9547, audit.getInt("requiredAssignments"))
            assertEquals(0, audit.getJSONArray("missingAssignments").length())

            val requiredKinds = setOf("Monsters", "Weapons", "Items", "Recipes", "Equipment", "Creatures", "Locales", "Weapon Guides")
            val checkedPaths = linkedSetOf<String>()
            var assignedCount = 0
            requiredKinds.forEach { kind ->
                val page = c.browse(LibraryFilter(kind), 0, 5000)
                page.records.forEach { rec ->
                    assertTrue("Missing image for ${rec.id}", rec.image.isNotBlank())
                    assignedCount++
                    checkedPaths += rec.image
                }
            }
            assertEquals(9547, assignedCount)
            checkedPaths.forEach { path ->
                val bmp = app.assets.open(path).use { BitmapFactory.decodeStream(it) }
                assertNotNull("Failed to decode $path", bmp)
                bmp?.recycle()
            }
        } finally {
            c.close()
        }
    }
}
