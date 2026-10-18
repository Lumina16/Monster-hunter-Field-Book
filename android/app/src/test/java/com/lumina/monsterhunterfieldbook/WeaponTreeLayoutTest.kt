package com.lumina.monsterhunterfieldbook

import org.json.JSONArray
import org.json.JSONObject
import org.junit.Assert.*
import org.junit.Test

class WeaponTreeLayoutTest {
    private fun fakeWeapon(id: String, name: String, parent: String = "", family: String = "Ore Tree", rarity: Int = 1): FieldRecord {
        val payload = JSONObject()
            .put("id", id)
            .put("name", name)
            .put("type", "great-sword")
            .put("family", family)
            .put("rarity", rarity)
            .put("attack", 480)
            .put("affinity", 0)
            .put("slots", JSONArray().put(1))
        if (parent.isNotBlank()) payload.put("parent", parent)
        return FieldRecord(
            id = "Weapons:great-sword:$id:$name",
            kind = "Weapons",
            name = name,
            game = "world",
            summary = "Great Sword",
            image = "art/icons/weapon-great-sword-r$rarity.png",
            payload = payload.toString(),
            rawId = id,
            category = "great-sword",
            rarity = rarity,
            rank = "LR"
        )
    }

    @Test
    fun weaponTreeLayoutBuildsConnectedFamilyAndClampsViewport() {
        val root = fakeWeapon("w-1", "Buster Sword I", family = "Ore Tree", rarity = 1)
        val childA = fakeWeapon("w-2", "Buster Sword II", parent = "w-1", family = "Ore Tree", rarity = 2)
        val childB = fakeWeapon("w-3", "Bone Blade I", family = "Bone Tree", rarity = 1)
        val records = listOf(root, childA, childB)
        WeaponModel.register(records)

        val familyGraph = WeaponTreeLayout.build(records, "default", "w-2")
        assertEquals("w-1", familyGraph.family)
        assertEquals(2, familyGraph.records.size)
        assertTrue(familyGraph.positions.getValue("w-2").x > familyGraph.positions.getValue("w-1").x)

        val allGraph = WeaponTreeLayout.build(records, "all", "w-3")
        assertEquals("all", allGraph.family)
        assertEquals(3, allGraph.records.size)
        assertEquals(listOf(1), WeaponModel.slots(root))
        assertEquals(0f, WeaponTreeLayout.clampPan(40f, 300f, 200f), 0.001f)
    }
}
