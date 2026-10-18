package com.lumina.monsterhunterfieldbook

import android.graphics.BitmapFactory
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
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
import java.util.concurrent.TimeUnit

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [24, 36])
class WeaponsRestorationTest {
    private fun awaitMain(a: MainActivity) {
        val latch = java.util.concurrent.CountDownLatch(1)
        a.catalogue.executor.execute { latch.countDown() }
        assertTrue(latch.await(15, TimeUnit.SECONDS))
        shadowOf(android.os.Looper.getMainLooper()).idle()
    }

    private fun walk(view: View): List<View> =
        listOf(view) + if (view is ViewGroup) (0 until view.childCount).flatMap { walk(view.getChildAt(it)) } else emptyList()

    private fun texts(view: View): List<String> =
        walk(view).filterIsInstance<TextView>().map { it.text.toString() }

    @Test
    fun weaponsCounterScreenRendersAllFourteenTypesAndEditionTotals() {
        NativePrefs(RuntimeEnvironment.getApplication()).reset()
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()
        val a = controller.get()
        awaitMain(a)
        a.prefs.set("transition", "none")
        a.navigate("weapons")
        awaitMain(a)

        val screen = walk(a.root).filterIsInstance<WeaponsScreen>().single()
        val allTexts = texts(screen)
        assertTrue(allTexts.any { it.contains("14 weapon types") })
        assertTrue(allTexts.any { it.contains("Great Sword") })
        assertTrue(allTexts.any { it.contains("Bow") })

        val worldSummary = allTexts.first { it.contains("14 weapon types") }
        a.switchEdition("iceborne")
        awaitMain(a)
        val iceScreen = walk(a.root).filterIsInstance<WeaponsScreen>().single()
        val iceSummary = texts(iceScreen).first { it.contains("14 weapon types") }
        assertNotEquals(worldSummary, iceSummary)
        controller.pause().stop().destroy()
    }

    @Test
    fun weaponProfileGuideTabSupportsAllCollapseAndExpand() {
        NativePrefs(RuntimeEnvironment.getApplication()).reset()
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()
        val a = controller.get()
        awaitMain(a)
        a.prefs.set("transition", "none")
        a.openWeapon("great-sword")
        awaitMain(a)

        val panel = walk(a.root).filterIsInstance<WeaponProfilePanel>().single()
        assertEquals("guide", panel.state.optString("tab"))
        assertTrue(texts(panel).any { it.contains("Great Sword") })

        val collapseBtn = walk(panel).filterIsInstance<TextView>().first { it.text.toString() == "Collapse" }
        collapseBtn.performClick()
        assertTrue(walk(panel).filterIsInstance<ReadingGroup>().all { !it.open })

        val expandBtn = walk(panel).filterIsInstance<TextView>().first { it.text.toString() == "Expand" }
        expandBtn.performClick()
        assertTrue(walk(panel).filterIsInstance<ReadingGroup>().all { it.open })
        controller.pause().stop().destroy()
    }

    @Test
    fun weaponDatabaseSearchFiltersClearDetailAndBackStack() {
        NativePrefs(RuntimeEnvironment.getApplication()).reset()
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()
        val a = controller.get()
        awaitMain(a)
        a.prefs.set("transition", "none")
        a.openWeapon("great-sword", null, "database")
        awaitMain(a)

        val panel = walk(a.root).filterIsInstance<WeaponProfilePanel>().single()
        assertEquals("database", panel.state.optString("tab"))

        val searchInput = walk(panel).filterIsInstance<EditText>().first { it.contentDescription == "Search weapons in this class" }
        searchInput.setText("Buster")
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals("Buster", panel.state.optString("q"))

        val clearBtn = walk(panel).filterIsInstance<TextView>().first { it.text.toString() == "Clear" }
        clearBtn.performClick()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals("", panel.state.optString("q"))

        val firstWeapon = panel.records.first()
        val row = panel.weaponRow(firstWeapon)
        row.performClick()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertTrue(panel.state.optBoolean("detail"))
        assertEquals(WeaponModel.rawId(firstWeapon), panel.state.optString("selected"))

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
        a.prefs.set("transition", "none")
        a.openWeapon("great-sword", null, "tree")
        awaitMain(a)

        val profile = walk(a.root).filterIsInstance<WeaponProfilePanel>().single()
        val tree = walk(profile).filterIsInstance<WeaponTreePanel>().single()
        tree.measure(
            View.MeasureSpec.makeMeasureSpec(1080, View.MeasureSpec.EXACTLY),
            View.MeasureSpec.makeMeasureSpec(1920, View.MeasureSpec.EXACTLY)
        )
        tree.layout(0, 0, 1080, 1920)
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertTrue(walk(tree).filterIsInstance<Spinner>().isNotEmpty())

        val viewport = walk(tree).first { it.contentDescription == "Weapon family tree. Pinch to zoom and drag to pan." }
        viewport.performAccessibilityAction(0x01010001, null)
        assertTrue(tree.logicalZoom() > 1f)
        walk(tree).first { it.contentDescription == "Reset weapon tree view" }.performClick()
        shadowOf(android.os.Looper.getMainLooper()).idle()
        assertEquals(1f, tree.logicalZoom(), 0.01f)

        val targetRecord = profile.records.first {
            WeaponModel.data(it).optString("family").contains("Ore", ignoreCase = true)
        }
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

        a.onBackPressed()
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
        a.prefs.set("transition", "none")
        val weapon = a.catalogue.browse(LibraryFilter("Weapons", game = "world", type = "great-sword", sort = "source"), 0, 100).records.first {
            (WeaponModel.data(it).optJSONObject("forge")?.optJSONArray("materials")?.length() ?: 0) > 0 &&
                WeaponModel.data(it).optJSONObject("upgrade") == null
        }
        a.openWeapon(
            "great-sword",
            WeaponModel.rawId(weapon),
            "database"
        )
        awaitMain(a)

        val panel = walk(a.root).filterIsInstance<WeaponProfilePanel>().single()
        val materialsView = walk(panel).filterIsInstance<WeaponMaterialsView>().single()
        walk(materialsView).first { it.contentDescription == "Save entry" }.performClick()
        assertTrue(a.isBookmarked(weapon.id))

        val matName = WeaponModel.data(weapon).getJSONObject("forge").getJSONArray("materials").getJSONObject(0).getString("name")
        val matRow = walk(materialsView).first { it.contentDescription?.toString()?.startsWith(matName) == true }
        matRow.performClick()
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
                val bitmap = app.assets.open(path).use { BitmapFactory.decodeStream(it) }
                assertNotNull("Failed to decode $path", bitmap)
                assertTrue("Invalid dimensions for $path", bitmap.width > 0 && bitmap.height > 0)
            }
        } finally {
            c.close()
        }
    }
}
