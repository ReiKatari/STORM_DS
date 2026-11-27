package me.magnum.melonds.ui.updates

import me.magnum.melonds.domain.model.DownloadProgress
import me.magnum.melonds.github.StormUpdateMirrorClient
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.Locale

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

    @Test
    fun selectLocalizedReleaseNotes_selectsAllSupportedLanguagesFromHeadings() {
        val notes = """
            ## Русский
            - Русское изменение

            ## English
            - English change

            ## Deutsch
            - Deutsche Änderung

            ## Español
            - Cambio en español

            ## Français
            - Modification française

            ## Bahasa Indonesia
            - Perubahan Indonesia

            ## Italiano
            - Modifica italiana

            ## 日本語
            - 日本語の変更

            ## Português
            - Alteração em português

            ## 简体中文
            - 简体中文更改

            ## 한국어
            - 한국어 변경 사항

            ## हिन्दी
            - हिन्दी बदलाव
        """.trimIndent()

        assertEquals("- Русское изменение", selectLocalizedReleaseNotes(notes, Locale("ru", "RU")))
        assertEquals("- English change", selectLocalizedReleaseNotes(notes, Locale.US))
        assertEquals("- Deutsche Änderung", selectLocalizedReleaseNotes(notes, Locale.GERMAN))
        assertEquals("- Cambio en español", selectLocalizedReleaseNotes(notes, Locale("es", "ES")))
        assertEquals("- Modification française", selectLocalizedReleaseNotes(notes, Locale.FRENCH))
        assertEquals("- Perubahan Indonesia", selectLocalizedReleaseNotes(notes, Locale("id", "ID")))
        assertEquals("- Modifica italiana", selectLocalizedReleaseNotes(notes, Locale.ITALIAN))
        assertEquals("- 日本語の変更", selectLocalizedReleaseNotes(notes, Locale.JAPANESE))
        assertEquals("- Alteração em português", selectLocalizedReleaseNotes(notes, Locale("pt", "BR")))
        assertEquals("- 简体中文更改", selectLocalizedReleaseNotes(notes, Locale.SIMPLIFIED_CHINESE))
        assertEquals("- 한국어 변경 사항", selectLocalizedReleaseNotes(notes, Locale.KOREAN))
        assertEquals("- हिन्दी बदलाव", selectLocalizedReleaseNotes(notes, Locale("hi", "IN")))
    }

    @Test
    fun selectLocalizedReleaseNotes_normalizesLegacyIndonesianLocaleInToId() {
        val notes = """
            ## English
            - English note

            ## Bahasa Indonesia
            - Catatan rilis
        """.trimIndent()

        assertEquals("- Catatan rilis", selectLocalizedReleaseNotes(notes, Locale("in", "ID")))
    }

    @Test
    fun selectLocalizedReleaseNotes_supportsHtmlLangMarkers() {
        val notes = """
            <!-- lang:ru -->
            - Только русский
            <!-- /lang -->
            <!-- lang:ja -->
            - 日本語のみ
            <!-- /lang -->
        """.trimIndent()

        assertEquals("- 日本語のみ", selectLocalizedReleaseNotes(notes, Locale.JAPAN))
        assertEquals("- Только русский", selectLocalizedReleaseNotes(notes, Locale("ru", "RU")))
    }

    @Test
    fun selectLocalizedReleaseNotes_fallsBackToEnglishThenRussian() {
        val withEnglish = """
            ## Русский
            - Русский
            ## English
            - English
        """.trimIndent()
        assertEquals("- English", selectLocalizedReleaseNotes(withEnglish, Locale("sv", "SE")))

        val withoutEnglish = """
            ## Русский
            - Русский
            ## Deutsch
            - Deutsch
        """.trimIndent()
        assertEquals("- Русский", selectLocalizedReleaseNotes(withoutEnglish, Locale("sv", "SE")))
    }

    @Test
    fun selectLocalizedReleaseNotes_keepsSingleLanguageChangelogIntact() {
        val single = """
            ### Что нового
            - Оптимизация рендера
        """.trimIndent()

        assertEquals(single, selectLocalizedReleaseNotes(single, Locale.US))
    }
}
