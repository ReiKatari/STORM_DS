package me.magnum.melonds.sgw

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SgwVersionMatcherTest {

    private fun fakeDesc(name: String, fileName: String) = SgwVersionMatcher.LocalRomDescriptor(
        id = fileName,
        name = name,
        fileName = fileName,
    )

    private fun fakeEntry(
        id: Int,
        title: String,
        version: String,
        kind: SgwSourceKind = SgwSourceKind.MAIN_CATALOG,
    ): SgwGameEntry = SgwGameEntry(
        id = id,
        title = title,
        normalizedTitle = SgwVersionMatcher.normalizeTitle(title),
        platform = SgwPlatform.NDS,
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
    fun normalizeTitle_stripsRegionVersionAndExtension() {
        assertEquals(
            "pokemon platinum",
            SgwVersionMatcher.normalizeTitle("Pokemon - Platinum (USA) [RUS v1.2].nds")
        )
        assertEquals(
            "new super mario bros",
            SgwVersionMatcher.normalizeTitle("New Super Mario Bros. (Europe) (Rev 2).zip")
        )
    }

    @Test
    fun compareVersions_ordersSemanticVersionsProperly() {
        assertTrue(SgwVersionMatcher.isRemoteNewer("1.0", "1.2"))
        assertTrue(SgwVersionMatcher.isRemoteNewer("1.9", "1.10"))
        assertTrue(SgwVersionMatcher.isRemoteNewer(null, "1.0"))
        assertFalse(SgwVersionMatcher.isRemoteNewer("2.0", "1.5"))
        assertFalse(SgwVersionMatcher.isRemoteNewer("1.2.0", "1.2"))
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
