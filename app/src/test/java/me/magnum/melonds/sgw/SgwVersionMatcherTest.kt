package me.magnum.melonds.sgw

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class SgwVersionMatcherTest {

    private fun fakeDesc(
        name: String,
        fileName: String,
        platform: SgwPlatform = SgwPlatform.NDS,
    ) = SgwVersionMatcher.LocalRomDescriptor(
        id = fileName,
        name = name,
        fileName = fileName,
        platform = platform,
    )

    private fun fakeEntry(
        id: Int,
        title: String,
        version: String,
        kind: SgwSourceKind = SgwSourceKind.MAIN_CATALOG,
        platform: SgwPlatform = SgwPlatform.NDS,
    ): SgwGameEntry = SgwGameEntry(
        id = id,
        title = title,
        normalizedTitle = SgwVersionMatcher.normalizeTitle(title),
        platform = platform,
        version = version,
        releaseYear = 2009,
        fileSizeBytes = 1024L,
        coverUrl = null,
        downloadUrl = "https://stormgamesworld.ru/api/games/$id/download",
        fallbackDownloadUrl = null,
        sourceKind = kind,
        hasTranslation = kind == SgwSourceKind.TRANSLATION,
        translatorTeam = if (kind == SgwSourceKind.TRANSLATION) "STORM TEAM" else null,
    )

    @Test
    fun normalizeTitle_stripsRegionVersionAndExtension_preservesSequelNumbers() {
        assertEquals(
            "pokemon platinum",
            SgwVersionMatcher.normalizeTitle("Pokemon - Platinum (USA) [RUS v1.2].nds")
        )
        assertEquals(
            "new super mario bros",
            SgwVersionMatcher.normalizeTitle("New Super Mario Bros. (Europe) (Rev 2).zip")
        )
        assertEquals(
            "pokemon black 2",
            SgwVersionMatcher.normalizeTitle("Pokemon Black 2 (USA).nds")
        )
        assertEquals(
            "cooking mama 2",
            SgwVersionMatcher.normalizeTitle("Cooking Mama 2 (Europe) v1.0.nds")
        )
        assertEquals(
            "fifa 08",
            SgwVersionMatcher.normalizeTitle("FIFA 08 (USA).nds")
        )
        assertEquals(
            "super mario 64 ds",
            SgwVersionMatcher.normalizeTitle("Super Mario 64 DS (USA)_v1.2.nds")
        )
        assertEquals(
            "999",
            SgwVersionMatcher.normalizeTitle("999 (USA) build 3.nds")
        )
    }

    @Test
    fun extractVersion_handlesExplicitPrefixesAndAvoidsTitleRNumbers() {
        assertEquals("1.2", SgwVersionMatcher.extractVersion("Chrono_Trigger_v1.2.nds"))
        assertEquals("1.0", SgwVersionMatcher.extractVersion("Chrono Trigger [RUS v1.0].nds"))
        assertEquals("2", SgwVersionMatcher.extractVersion("New Super Mario Bros (Rev 2).nds"))
        assertEquals("1.4.2", SgwVersionMatcher.extractVersion("Game ver 1.4.2.nds"))
        assertNull(SgwVersionMatcher.extractVersion("R4 Revolution.nds"))
        assertNull(SgwVersionMatcher.extractVersion("R-Type Command (USA).nds"))
        assertNull(SgwVersionMatcher.extractVersion("Pokemon Black 2 (USA).nds"))
    }

    @Test
    fun compareVersions_ordersSemanticVersionsProperly() {
        assertTrue(SgwVersionMatcher.isRemoteNewer("1.0", "1.2"))
        assertTrue(SgwVersionMatcher.isRemoteNewer("1.9", "1.10"))
        assertFalse(SgwVersionMatcher.isRemoteNewer(null, "1.0"))
        assertFalse(SgwVersionMatcher.isRemoteNewer(null, "1.0.0"))
        assertFalse(SgwVersionMatcher.isRemoteNewer(null, ""))
        assertTrue(SgwVersionMatcher.isRemoteNewer(null, "1.1"))
        assertFalse(SgwVersionMatcher.isRemoteNewer("2.0", "1.5"))
        assertFalse(SgwVersionMatcher.isRemoteNewer("1.2.0", "1.2"))
        assertFalse(SgwVersionMatcher.isRemoteNewer("1.0", ""))
    }

    @Test
    fun hasTranslationMarker_avoidsFalsePositivesAndDetectsRuAndCyrillic() {
        assertFalse(SgwVersionMatcher.hasTranslationMarker("Crusader of Centy.nds"))
        assertFalse(SgwVersionMatcher.hasTranslationMarker("Virus Shooter XX.nds"))
        assertFalse(SgwVersionMatcher.hasTranslationMarker("Kid Icarus (USA).nds"))
        assertFalse(SgwVersionMatcher.hasTranslationMarker("Rugrats (USA).nds"))

        assertTrue(SgwVersionMatcher.hasTranslationMarker("Chrono Trigger (RU).nds"))
        assertTrue(SgwVersionMatcher.hasTranslationMarker("Chrono Trigger [RUS].nds"))
        assertTrue(SgwVersionMatcher.hasTranslationMarker("Chrono_Trigger_ru_v1.0.nds"))
        assertTrue(SgwVersionMatcher.hasTranslationMarker("Хроно Триггер.nds"))
        assertTrue(SgwVersionMatcher.hasTranslationMarker("Chrono Trigger (STORM TEAM).nds"))
    }

    @Test
    fun findUpdates_doesNotTriggerFalseUpdateForUnversionedRomAt10() {
        val desc = fakeDesc("Chrono Trigger (RU)", "Chrono Trigger (RU).nds")
        val trans = fakeEntry(22, "Chrono Trigger", "1.0", SgwSourceKind.TRANSLATION)

        val updates = SgwVersionMatcher.findUpdatesForDescriptors(listOf(desc), emptyList(), listOf(trans))
        assertTrue(updates.isEmpty())
    }

    @Test
    fun findUpdates_isolatesNdsAndDsiPlatforms() {
        val dsiDesc = fakeDesc("Shantae", "Shantae (USA).dsi", platform = SgwPlatform.DSI)
        val ndsEntry = fakeEntry(99, "Shantae", "2.0", SgwSourceKind.MAIN_CATALOG, platform = SgwPlatform.NDS)
        val dsiEntry = fakeEntry(100, "Shantae", "1.2", SgwSourceKind.MAIN_CATALOG, platform = SgwPlatform.DSI)

        val mismatch = SgwVersionMatcher.findUpdatesForDescriptors(listOf(dsiDesc), listOf(ndsEntry), emptyList())
        assertTrue(mismatch.isEmpty())

        val match = SgwVersionMatcher.findUpdatesForDescriptors(listOf(dsiDesc), listOf(ndsEntry, dsiEntry), emptyList())
        assertEquals(1, match.size)
        assertEquals(SgwPlatform.DSI, match.first().remoteEntry.platform)
    }

    @Test
    fun findUpdates_detectsNewerMainVersion() {
        val desc = fakeDesc("Mario Kart DS", "Mario Kart DS v1.0.nds")
        val entry = fakeEntry(10, "Mario Kart DS", "1.1", SgwSourceKind.MAIN_CATALOG)

        val updates = SgwVersionMatcher.findUpdatesForDescriptors(listOf(desc), listOf(entry), emptyList())
        assertEquals(1, updates.size)
        assertEquals(SgwUpdateReason.NEWER_VERSION, updates.first().reason)
        assertEquals("1.1", updates.first().remoteEntry.version)
    }

    @Test
    fun findUpdates_detectsRussianTranslationForUntranslatedRom() {
        val desc = fakeDesc("Chrono Trigger", "Chrono Trigger (USA).nds")
        val trans = fakeEntry(22, "Chrono Trigger", "1.0", SgwSourceKind.TRANSLATION)

        val updates = SgwVersionMatcher.findUpdatesForDescriptors(listOf(desc), emptyList(), listOf(trans))
        assertEquals(1, updates.size)
        assertEquals(SgwUpdateReason.RUSSIAN_TRANSLATION_AVAILABLE, updates.first().reason)
    }

    @Test
    fun findUpdates_detectsNewerTranslationRelease() {
        val desc = fakeDesc("Chrono Trigger [RUS]", "Chrono Trigger [RUS v1.0].nds")
        val older = fakeEntry(22, "Chrono Trigger", "1.0", SgwSourceKind.TRANSLATION)
        val newer = fakeEntry(22, "Chrono Trigger", "1.3", SgwSourceKind.TRANSLATION)

        val updates = SgwVersionMatcher.findUpdatesForDescriptors(listOf(desc), emptyList(), listOf(older, newer))
        assertEquals(1, updates.size)
        assertEquals(SgwUpdateReason.TRANSLATION_UPDATE, updates.first().reason)
        assertEquals("1.3", updates.first().remoteEntry.version)
    }
}
