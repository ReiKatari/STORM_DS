package me.magnum.melonds.ui.updates

import me.magnum.melonds.domain.model.DownloadProgress
import me.magnum.melonds.github.StormUpdateMirrorClient
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class StormUpdateDialogsTest {

    @Test
    fun parseReleaseNotes_parsesMarkdownAndStripsReleaseHtmlTags() {
        val sample = """
            > 💡 **Релиз 8.9.0** - *Обновление STORM DS*

            ---

            ### 🚀 Ключевые изменения
            - 🌟 **Окно обновлений**: Единый дизайн для Android и Windows

            <details>
            <summary><b>📋 Полный список изменений</b></summary>

            | Платформа | Файл | Размер |
            |---|---|---|
            | Android | `STORM_DS_8.9.0.apk` | 77.7 MB |

            </details>
        """.trimIndent()

        val blocks = parseReleaseNotes(sample)
        assertTrue(blocks.any { it is ReleaseNoteBlock.Paragraph && it.text.contains("Релиз 8.9.0") })
        assertTrue(blocks.any { it is ReleaseNoteBlock.Divider })
        assertTrue(blocks.any { it is ReleaseNoteBlock.Heading && it.level == 3 && it.text.contains("Ключевые изменения") })
        assertTrue(blocks.any { it is ReleaseNoteBlock.Bullet && it.text.contains("Окно обновлений") })
        assertTrue(blocks.any { it is ReleaseNoteBlock.Heading || it is ReleaseNoteBlock.Paragraph && it.text.contains("Полный список изменений") })
        assertTrue(blocks.any { it is ReleaseNoteBlock.TableRow && it.cells.size == 3 && it.cells[0] == "Android" })
        // HTML tags must not remain inside parsed text blocks
        assertTrue(blocks.none { block ->
            val t = when (block) {
                is ReleaseNoteBlock.Heading -> block.text
                is ReleaseNoteBlock.Bullet -> block.text
                is ReleaseNoteBlock.Paragraph -> block.text
                is ReleaseNoteBlock.TableRow -> block.cells.joinToString(" ")
                ReleaseNoteBlock.Divider -> ""
            }
            "<details>" in t || "</details>" in t || "<summary>" in t || "<b>" in t
        })
    }

    @Test
    fun detectMirrorLabel_identifiesStormGamesWorldAndGithub() {
        assertEquals(
            "STORM GAMES WORLD",
            detectMirrorLabel("https://stormgamesworld.ru/programs?repo=STORM_DS", ""),
        )
        assertEquals(
            "STORM GAMES WORLD",
            detectMirrorLabel("", "https://storm-games.world/uploads/programs/STORM_DS/STORM_DS_8.9.0.apk"),
        )
        assertEquals(
            "GitHub",
            detectMirrorLabel("https://github.com/ReiKatari/STORM_DS/releases/tag/8.9.0", ""),
        )
    }

    @Test
    fun normalizeStormGamesWorldDownloadUrl_handlesRelativeAndLoopbackUrls() {
        assertEquals(
            "https://stormgamesworld.ru/uploads/programs/STORM_DS/STORM_DS_8.9.0.apk",
            StormUpdateMirrorClient.normalizeStormGamesWorldDownloadUrl(
                "/uploads/programs/STORM_DS/STORM_DS_8.9.0.apk",
                "STORM_DS_8.9.0.apk",
                isAltHost = false,
            ),
        )
        assertEquals(
            "https://storm-games.world/uploads/programs/STORM_DS/STORM_DS_8.9.0.apk",
            StormUpdateMirrorClient.normalizeStormGamesWorldDownloadUrl(
                "http://127.0.0.1:8080/uploads/programs/STORM_DS/STORM_DS_8.9.0.apk",
                "STORM_DS_8.9.0.apk",
                isAltHost = true,
            ),
        )
    }

    @Test
    fun installPermissionRequired_carriesApkPath() {
        val progress = DownloadProgress.InstallPermissionRequired("/data/user/0/com.stormds.emulator/cache/updates/update.apk")
        assertEquals("/data/user/0/com.stormds.emulator/cache/updates/update.apk", progress.apkPath)
    }
}
