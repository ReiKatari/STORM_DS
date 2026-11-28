package me.magnum.melonds.ui.updates

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.OpenInNew
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.ErrorOutline
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.Storage
import androidx.compose.material.icons.filled.SystemUpdate
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.flow.StateFlow
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.DownloadProgress
import me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.WatermelonMono
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

internal sealed interface ReleaseNoteBlock {
    data class Heading(val text: String, val level: Int) : ReleaseNoteBlock
    data class Bullet(val text: String) : ReleaseNoteBlock
    data class TableRow(val cells: List<String>) : ReleaseNoteBlock
    data class Paragraph(val text: String) : ReleaseNoteBlock
    object Divider : ReleaseNoteBlock
}

private val LANG_START_TAG_REGEX = Regex("""<!--\s*lang\s*:\s*([a-zA-Z_-]+)\s*-->""", RegexOption.IGNORE_CASE)
private val LANG_END_TAG_REGEX = Regex("""<!--\s*/lang\s*-->""", RegexOption.IGNORE_CASE)

internal fun normalizeReleaseLocaleCode(raw: String): String {
    val clean = raw.trim().lowercase(Locale.ROOT).replace('_', '-')
    return when {
        clean == "in" -> "id"
        clean.startsWith("in-") -> "id-" + clean.removePrefix("in-")
        clean == "iw" -> "he"
        clean.startsWith("iw-") -> "he-" + clean.removePrefix("iw-")
        else -> clean
    }
}

internal fun matchReleaseLanguageHeading(rawHeading: String): String? {
    var cleaned = rawHeading.trim().trimStart('#').trim()
    cleaned = cleaned.trimEnd(':', '：').trim()
    cleaned = cleaned.removePrefix("[").removeSuffix("]").trim()
    val norm = normalizeReleaseLocaleCode(cleaned)
    return when (norm) {
        "ru", "русский", "russian" -> "ru"
        "en", "english", "английский" -> "en"
        "de", "deutsch", "german", "немецкий" -> "de"
        "es", "español", "espanol", "spanish", "испанский" -> "es"
        "fr", "français", "francais", "french", "французский" -> "fr"
        "id", "in", "indonesian", "bahasa indonesia", "индонезийский" -> "id"
        "it", "italiano", "italian", "итальянский" -> "it"
        "ja", "jp", "日本語", "japanese", "японский" -> "ja"
        "pt-br", "pt", "português", "portugues", "português (brasil)", "portugues (brasil)", "portuguese", "португальский" -> "pt-br"
        "zh-hans", "zh-cn", "zh", "简体中文", "中文", "chinese", "chinese (simplified)", "китайский" -> "zh-hans"
        "ko", "kr", "한국어", "korean", "корейский" -> "ko"
        "hi", "हिन्दी", "हिंदी", "hindi", "хинди" -> "hi"
        else -> null
    }
}

internal fun selectLocalizedReleaseNotes(raw: String, locale: Locale = Locale.getDefault()): String {
    if (raw.isBlank()) return ""
    val normalizedRaw = raw.replace("\r\n", "\n")
    val lines = normalizedRaw.lines()

    // Pass 1: explicit <!-- lang:XX --> ... <!-- /lang --> blocks
    val markerSections = LinkedHashMap<String, StringBuilder>()
    var activeMarkerLang: String? = null
    for (line in lines) {
        val startMatch = LANG_START_TAG_REGEX.find(line)
        if (startMatch != null) {
            activeMarkerLang = normalizeReleaseLocaleCode(startMatch.groupValues[1])
            markerSections.getOrPut(activeMarkerLang) { StringBuilder() }
            continue
        }
        if (LANG_END_TAG_REGEX.containsMatchIn(line)) {
            activeMarkerLang = null
            continue
        }
        val current = activeMarkerLang
        if (current != null) {
            markerSections[current]?.appendLine(line)
        }
    }

    val sections: Map<String, String> = if (markerSections.size >= 2) {
        markerSections.mapValues { it.value.toString().trim() }.filterValues { it.isNotBlank() }
    } else {
        // Pass 2: Markdown headings like ## Русский / ## English / ### Deutsch
        val headingSections = LinkedHashMap<String, StringBuilder>()
        var currentHeadingLang: String? = null
        for (line in lines) {
            val trimmed = line.trim()
            if (LANG_START_TAG_REGEX.containsMatchIn(trimmed) || LANG_END_TAG_REGEX.containsMatchIn(trimmed)) {
                continue
            }
            if (trimmed.startsWith("## ") || trimmed.startsWith("### ")) {
                val detected = matchReleaseLanguageHeading(trimmed)
                if (detected != null) {
                    currentHeadingLang = detected
                    headingSections.getOrPut(detected) { StringBuilder() }
                    continue
                }
            }
            val current = currentHeadingLang
            if (current != null) {
                headingSections[current]?.appendLine(line)
            }
        }
        headingSections.mapValues { it.value.toString().trim() }.filterValues { it.isNotBlank() }
    }

    if (sections.size < 2) {
        return lines
            .filterNot { LANG_START_TAG_REGEX.containsMatchIn(it) || LANG_END_TAG_REGEX.containsMatchIn(it) }
            .joinToString("\n")
            .trim()
    }

    val lang = normalizeReleaseLocaleCode(locale.language)
    val country = locale.country.lowercase(Locale.ROOT)
    val script = locale.script.lowercase(Locale.ROOT)

    val candidates = buildList {
        if (lang.isNotEmpty() && script.isNotEmpty()) add("$lang-$script")
        if (lang.isNotEmpty() && country.isNotEmpty()) add("$lang-$country")
        if (lang == "zh") add("zh-hans")
        if (lang == "pt") add("pt-br")
        if (lang.isNotEmpty()) add(lang)
        add("en")
        add("ru")
    }

    for (code in candidates) {
        val exact = sections[code]
        if (!exact.isNullOrBlank()) return exact
        val base = code.substringBefore('-')
        val prefixMatch = sections.entries.firstOrNull { (k, v) ->
            v.isNotBlank() && k.substringBefore('-') == base
        }?.value
        if (!prefixMatch.isNullOrBlank()) return prefixMatch
    }

    return sections.values.firstOrNull { it.isNotBlank() } ?: raw.trim()
}

private val HTML_TAG_REGEX = Regex("</?(?:details|summary|b|i|br\\s*/?)>", RegexOption.IGNORE_CASE)

internal fun parseReleaseNotes(raw: String): List<ReleaseNoteBlock> {
    val lines = raw.replace("\r\n", "\n").lines()
    val result = mutableListOf<ReleaseNoteBlock>()
    for (line in lines) {
        var cleaned = line.replace(HTML_TAG_REGEX, "").trim()
        if (cleaned.startsWith(">")) {
            cleaned = cleaned.removePrefix(">").trim()
        }
        when {
            cleaned.isEmpty() -> continue
            cleaned == "---" || cleaned == "***" || cleaned == "___" -> {
                result += ReleaseNoteBlock.Divider
            }
            cleaned.startsWith("### ") -> {
                result += ReleaseNoteBlock.Heading(cleaned.removePrefix("### ").trim(), 3)
            }
            cleaned.startsWith("## ") -> {
                result += ReleaseNoteBlock.Heading(cleaned.removePrefix("## ").trim(), 2)
            }
            cleaned.startsWith("# ") -> {
                result += ReleaseNoteBlock.Heading(cleaned.removePrefix("# ").trim(), 1)
            }
            cleaned.startsWith("- ") || cleaned.startsWith("* ") -> {
                result += ReleaseNoteBlock.Bullet(cleaned.drop(2).trim())
            }
            cleaned.startsWith("|") && cleaned.endsWith("|") -> {
                val cells = cleaned.trim('|').split('|').map { it.trim() }
                val isAlignRow = cells.isNotEmpty() && cells.all { cell ->
                    cell.isNotEmpty() && cell.all { ch -> ch == '-' || ch == ':' || ch == ' ' }
                }
                if (!isAlignRow && cells.any { it.isNotEmpty() }) {
                    result += ReleaseNoteBlock.TableRow(cells)
                }
            }
            else -> {
                result += ReleaseNoteBlock.Paragraph(cleaned)
            }
        }
    }
    return result
}

private fun buildInlineStyledText(
    text: String,
    baseColor: Color,
    boldColor: Color,
    codeColor: Color,
): AnnotatedString = buildAnnotatedString {
    var i = 0
    while (i < text.length) {
        when {
            text.startsWith("**", i) -> {
                val end = text.indexOf("**", i + 2)
                if (end > i + 2) {
                    withStyle(SpanStyle(color = boldColor, fontWeight = FontWeight.Bold)) {
                        append(text.substring(i + 2, end))
                    }
                    i = end + 2
                } else {
                    withStyle(SpanStyle(color = baseColor)) { append("**") }
                    i += 2
                }
            }
            text[i] == '`' -> {
                val end = text.indexOf('`', i + 1)
                if (end > i + 1) {
                    withStyle(
                        SpanStyle(
                            color = codeColor,
                            fontFamily = WatermelonMono,
                            fontWeight = FontWeight.Medium,
                        )
                    ) {
                        append(text.substring(i + 1, end))
                    }
                    i = end + 1
                } else {
                    withStyle(SpanStyle(color = baseColor)) { append('`') }
                    i += 1
                }
            }
            else -> {
                val nextBold = text.indexOf("**", i)
                val nextCode = text.indexOf('`', i)
                val nextSpecial = listOf(nextBold, nextCode).filter { it >= 0 }.minOrNull() ?: text.length
                val end = if (nextSpecial == i) i + 1 else nextSpecial
                withStyle(SpanStyle(color = baseColor)) {
                    append(text.substring(i, end))
                }
                i = end
            }
        }
    }
}

internal fun detectMirrorLabel(sourceUrl: String, downloadUrl: String): String {
    val combined = "$sourceUrl $downloadUrl".lowercase(Locale.ROOT)
    return if ("stormgamesworld.ru" in combined || "storm-games.world" in combined) {
        "STORM GAMES WORLD"
    } else {
        "GitHub"
    }
}

private fun formatEpochMillisDate(epochMillis: Long): String {
    if (epochMillis <= 0L) return ""
    return runCatching {
        SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(Date(epochMillis))
    }.getOrDefault("")
}

fun showStormUpdateAvailableDialog(
    context: Context,
    currentVersion: String,
    newVersion: String,
    changelogMd: String,
    binarySizeBytes: Long,
    publishedEpochMillis: Long,
    sourceReleaseUrl: String,
    downloadUrl: String,
    mirrorSources: Map<me.magnum.melonds.github.UpdateDownloadSource, me.magnum.melonds.domain.model.appupdate.UpdateSourceOption> = emptyMap(),
    defaultSource: me.magnum.melonds.github.UpdateDownloadSource = me.magnum.melonds.github.UpdateDownloadSource.ASK,
    titleOverride: String? = null,
    onUpdateNow: (me.magnum.melonds.github.UpdateDownloadSource) -> Unit,
    onRemindLater: () -> Unit,
    onSkipVersion: () -> Unit,
): Dialog {
    val cleanCur = currentVersion.trim().removePrefix("v").removePrefix("V")
    val cleanNew = newVersion.trim().removePrefix("v").removePrefix("V")
    val detectedDefault = if (detectMirrorLabel(sourceReleaseUrl, downloadUrl) == "STORM GAMES WORLD") {
        me.magnum.melonds.github.UpdateDownloadSource.STORM_GAMES_WORLD
    } else {
        me.magnum.melonds.github.UpdateDownloadSource.GITHUB
    }
    val initialSource = when (defaultSource) {
        me.magnum.melonds.github.UpdateDownloadSource.GITHUB,
        me.magnum.melonds.github.UpdateDownloadSource.STORM_GAMES_WORLD -> {
            if (mirrorSources.isEmpty() || mirrorSources.containsKey(defaultSource)) defaultSource else detectedDefault
        }
        me.magnum.melonds.github.UpdateDownloadSource.ASK -> detectedDefault
    }
    val dateLabel = formatEpochMillisDate(publishedEpochMillis)
    val activeLocale = context.resources.configuration.locales.let { list ->
        if (!list.isEmpty) list[0] else Locale.getDefault()
    }
    val localizedChangelog = selectLocalizedReleaseNotes(
        changelogMd.ifBlank { "STORM DS $cleanNew" },
        activeLocale,
    )
    val parsedBlocks = parseReleaseNotes(
        localizedChangelog.ifBlank { "STORM DS $cleanNew" }
    )

    return showSettingsComposeDialog(
        context = context,
        onDismiss = onRemindLater,
    ) { dismiss ->
        val colors = LocalWatermelonColors.current
        val ctx = LocalContext.current
        var selectedSource by remember { mutableStateOf(initialSource) }
        val activeOption = mirrorSources[selectedSource]
        val activeSizeBytes = activeOption?.binarySize ?: binarySizeBytes
        val activeDownloadUrl = activeOption?.downloadUri?.toString() ?: downloadUrl
        val activeReleaseUrl = activeOption?.sourceReleaseUrl ?: sourceReleaseUrl
        val mirrorLabel = if (selectedSource == me.magnum.melonds.github.UpdateDownloadSource.STORM_GAMES_WORLD) {
            "STORM GAMES WORLD"
        } else {
            detectMirrorLabel(activeReleaseUrl, activeDownloadUrl)
        }
        val sizeMb = if (activeSizeBytes > 0L) activeSizeBytes.toDouble() / (1024.0 * 1024.0) else 0.0
        val sizeLabel = if (sizeMb > 0.0) stringResource(R.string.update_dialog_size_mb_fmt, sizeMb) else ""

        UpdateDialogCardShell(
            colors = colors,
            onDismissBackdrop = {
                dismiss()
                onRemindLater()
            },
        ) {
            // Header
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp, vertical = 14.dp),
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.green.copy(alpha = 0.14f))
                        .border(1.dp, colors.green.copy(alpha = 0.45f), RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = Icons.Filled.SystemUpdate,
                        contentDescription = null,
                        tint = colors.green,
                        modifier = Modifier.size(22.dp),
                    )
                }
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = titleOverride ?: stringResource(R.string.update_dialog_title),
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = "STORM DS",
                        color = colors.text2,
                        fontFamily = WatermelonMono,
                        fontSize = 11.sp,
                    )
                }
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(RoundedCornerShape(9.dp))
                        .background(colors.surface2)
                        .border(1.dp, colors.line, RoundedCornerShape(9.dp))
                        .clickable {
                            dismiss()
                            onRemindLater()
                        },
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = null,
                        tint = colors.text2,
                        modifier = Modifier.size(16.dp),
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(colors.line),
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = false)
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 18.dp, vertical = 14.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                // Version Transition Card: Current -> New (clean without 'v' prefix)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(colors.surface2)
                        .border(1.dp, colors.line, RoundedCornerShape(14.dp))
                        .padding(horizontal = 12.dp, vertical = 10.dp),
                ) {
                    VersionBadgeColumn(
                        label = stringResource(R.string.update_dialog_current_label),
                        version = cleanCur,
                        accent = false,
                        colors = colors,
                        modifier = Modifier.weight(1f),
                    )
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .size(30.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(colors.green.copy(alpha = 0.14f)),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(16.dp),
                        )
                    }
                    VersionBadgeColumn(
                        label = stringResource(R.string.update_dialog_new_label),
                        version = cleanNew,
                        accent = true,
                        colors = colors,
                        modifier = Modifier.weight(1f),
                    )
                }

                // Metadata Chips: Mirror Source, Size, Release Date
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    MetadataChip(Icons.Filled.Public, mirrorLabel, colors, highlighted = true)
                    if (sizeLabel.isNotBlank()) {
                        MetadataChip(Icons.Filled.Storage, sizeLabel, colors)
                    }
                    if (dateLabel.isNotBlank()) {
                        MetadataChip(Icons.Filled.CalendarToday, dateLabel, colors)
                    }
                }

                // Changelog Section Label
                Text(
                    text = stringResource(R.string.update_dialog_whats_new).uppercase(Locale.getDefault()),
                    color = colors.text2,
                    fontFamily = WatermelonMono,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.7.sp,
                )

                // Scrollable Structured Changelog Card
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 100.dp, max = 220.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(colors.bg)
                        .border(1.dp, colors.line, RoundedCornerShape(14.dp))
                        .verticalScroll(rememberScrollState())
                        .padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(7.dp),
                ) {
                    parsedBlocks.forEach { block ->
                        when (block) {
                            is ReleaseNoteBlock.Divider -> {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 2.dp)
                                        .height(1.dp)
                                        .background(colors.line),
                                )
                            }
                            is ReleaseNoteBlock.Heading -> {
                                val topPad = if (block.level <= 2) 4.dp else 2.dp
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(top = topPad),
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(3.dp)
                                            .height(14.dp)
                                            .clip(RoundedCornerShape(1.5.dp))
                                            .background(colors.green),
                                    )
                                    Spacer(Modifier.width(8.dp))
                                    Text(
                                        text = buildInlineStyledText(block.text, colors.text, colors.text, colors.green),
                                        color = colors.text,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = if (block.level <= 2) 13.5.sp else 12.5.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }
                            }
                            is ReleaseNoteBlock.Bullet -> {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 4.dp),
                                    verticalAlignment = Alignment.Top,
                                ) {
                                    Text(
                                        text = "-",
                                        color = colors.green,
                                        fontFamily = WatermelonMono,
                                        fontSize = 12.5.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(end = 7.dp),
                                    )
                                    Text(
                                        text = buildInlineStyledText(block.text, colors.text2, colors.text, colors.green),
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 12.5.sp,
                                        lineHeight = 17.sp,
                                        modifier = Modifier.weight(1f),
                                    )
                                }
                            }
                            is ReleaseNoteBlock.TableRow -> {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(colors.surface2.copy(alpha = 0.65f))
                                        .padding(horizontal = 8.dp, vertical = 5.dp),
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                ) {
                                    Text(
                                        text = block.cells.joinToString(" | "),
                                        color = colors.text2,
                                        fontFamily = WatermelonMono,
                                        fontSize = 11.sp,
                                        lineHeight = 15.sp,
                                        modifier = Modifier.fillMaxWidth(),
                                    )
                                }
                            }
                            is ReleaseNoteBlock.Paragraph -> {
                                Text(
                                    text = buildInlineStyledText(block.text, colors.text2, colors.text, colors.green),
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 12.5.sp,
                                    lineHeight = 17.sp,
                                )
                            }
                        }
                    }
                }

                // Download Source Selector (GitHub vs STORM GAMES WORLD)
                val ghAvailable = mirrorSources.isEmpty() && detectedDefault == me.magnum.melonds.github.UpdateDownloadSource.GITHUB ||
                    mirrorSources.containsKey(me.magnum.melonds.github.UpdateDownloadSource.GITHUB)
                val sgwAvailable = mirrorSources.isEmpty() && detectedDefault == me.magnum.melonds.github.UpdateDownloadSource.STORM_GAMES_WORLD ||
                    mirrorSources.containsKey(me.magnum.melonds.github.UpdateDownloadSource.STORM_GAMES_WORLD)
                Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text(
                        text = stringResource(R.string.update_download_source_picker_label).uppercase(Locale.getDefault()),
                        color = colors.text2,
                        fontFamily = WatermelonMono,
                        fontSize = 10.5.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.6.sp,
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        val sourceChoices = listOf(
                            Triple(me.magnum.melonds.github.UpdateDownloadSource.GITHUB, "GitHub", ghAvailable),
                            Triple(me.magnum.melonds.github.UpdateDownloadSource.STORM_GAMES_WORLD, "STORM GAMES WORLD", sgwAvailable),
                        )
                        sourceChoices.forEach { (src, label, available) ->
                            val isSelected = selectedSource == src
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .clip(RoundedCornerShape(11.dp))
                                    .background(
                                        when {
                                            isSelected -> colors.green.copy(alpha = 0.16f)
                                            else -> colors.surface2
                                        }
                                    )
                                    .border(
                                        1.dp,
                                        when {
                                            isSelected -> colors.green
                                            else -> colors.line
                                        },
                                        RoundedCornerShape(11.dp),
                                    )
                                    .then(
                                        if (available) Modifier.clickable { selectedSource = src } else Modifier
                                    )
                                    .padding(horizontal = 8.dp, vertical = 9.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Text(
                                    text = label,
                                    color = when {
                                        isSelected -> colors.green
                                        available -> colors.text
                                        else -> colors.text3
                                    },
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 12.sp,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                    maxLines = 1,
                                )
                            }
                        }
                    }
                }

                // Primary Update CTA
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(13.dp))
                        .background(colors.green)
                        .clickable {
                            dismiss()
                            onUpdateNow(selectedSource)
                        }
                        .padding(vertical = 13.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.CloudDownload,
                            contentDescription = null,
                            tint = Color(0xFF07131A),
                            modifier = Modifier.size(18.dp),
                        )
                        Text(
                            text = stringResource(R.string.update_dialog_update_now),
                            color = Color(0xFF07131A),
                            fontFamily = SpaceGrotesk,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }

                // Secondary Actions: Remind Later + Skip Version
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    SecondaryActionButton(
                        text = stringResource(R.string.update_dialog_remind_later),
                        colors = colors,
                        modifier = Modifier.weight(1f),
                    ) {
                        dismiss()
                        onRemindLater()
                    }
                    SecondaryActionButton(
                        text = stringResource(R.string.update_dialog_skip_version),
                        colors = colors,
                        modifier = Modifier.weight(1f),
                    ) {
                        dismiss()
                        onSkipVersion()
                    }
                }

                // Footer Link to Open Release Page
                if (activeReleaseUrl.isNotBlank()) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clip(RoundedCornerShape(8.dp))
                            .clickable {
                                runCatching {
                                    ctx.startActivity(
                                        Intent(Intent.ACTION_VIEW, Uri.parse(activeReleaseUrl))
                                            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                                    )
                                }
                            }
                            .padding(horizontal = 10.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.OpenInNew,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(14.dp),
                        )
                        Text(
                            text = stringResource(R.string.update_dialog_open_page),
                            color = colors.green,
                            fontFamily = SpaceGrotesk,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }
            }
        }
    }
}

fun showStormUpdateProgressDialog(
    context: Context,
    versionLabel: String,
    progressFlow: StateFlow<DownloadProgress?>,
    onMoveToBackground: () -> Unit,
): Dialog {
    return showSettingsComposeDialog(
        context = context,
        onDismiss = onMoveToBackground,
    ) { dismiss ->
        val colors = LocalWatermelonColors.current
        val progressState by progressFlow.collectAsState()
        val cleanVer = versionLabel.trim().removePrefix("v").removePrefix("V")

        var lastSampleMs by remember { mutableLongStateOf(0L) }
        var lastSampleBytes by remember { mutableLongStateOf(0L) }
        var speedMbPerSec by remember { mutableDoubleStateOf(0.0) }

        LaunchedEffect(progressState) {
            val current = progressState
            if (current is DownloadProgress.DownloadUpdate) {
                val now = System.currentTimeMillis()
                if (lastSampleMs > 0L) {
                    val dt = now - lastSampleMs
                    val db = current.downloadedBytes - lastSampleBytes
                    if (dt >= 350L && db >= 0L) {
                        val instantSpeed = (db.toDouble() / (1024.0 * 1024.0)) / (dt.toDouble() / 1000.0)
                        speedMbPerSec = if (speedMbPerSec <= 0.01) instantSpeed else (speedMbPerSec * 0.65 + instantSpeed * 0.35)
                        lastSampleMs = now
                        lastSampleBytes = current.downloadedBytes
                    }
                } else {
                    lastSampleMs = now
                    lastSampleBytes = current.downloadedBytes
                }
            }
        }

        UpdateDialogCardShell(
            colors = colors,
            onDismissBackdrop = {},
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = false)
                    .verticalScroll(rememberScrollState())
                    .padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp),
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(11.dp))
                            .background(colors.green.copy(alpha = 0.14f))
                            .border(1.dp, colors.green.copy(alpha = 0.45f), RoundedCornerShape(11.dp)),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.CloudDownload,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(20.dp),
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = stringResource(R.string.downloading_update),
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        if (cleanVer.isNotBlank()) {
                            Text(
                                text = "STORM DS $cleanVer",
                                color = colors.text2,
                                fontFamily = WatermelonMono,
                                fontSize = 11.5.sp,
                            )
                        }
                    }
                }

                val dl = progressState as? DownloadProgress.DownloadUpdate
                val totalBytes = dl?.totalSize ?: 0L
                val downloadedBytes = dl?.downloadedBytes ?: 0L
                val fraction = if (dl != null && totalBytes > 0L) {
                    (downloadedBytes.toFloat() / totalBytes.toFloat()).coerceIn(0f, 1f)
                } else {
                    -1f
                }

                if (fraction >= 0f) {
                    LinearProgressIndicator(
                        progress = fraction,
                        color = colors.green,
                        backgroundColor = colors.surface2,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(8.dp)
                            .clip(RoundedCornerShape(6.dp)),
                    )
                } else {
                    LinearProgressIndicator(
                        color = colors.green,
                        backgroundColor = colors.surface2,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(8.dp)
                            .clip(RoundedCornerShape(6.dp)),
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    val leftLabel = when {
                        dl != null && totalBytes > 0L -> {
                            stringResource(
                                R.string.download_progress_sizes,
                                downloadedBytes.toDouble() / (1024.0 * 1024.0),
                                totalBytes.toDouble() / (1024.0 * 1024.0),
                            )
                        }
                        dl != null && downloadedBytes > 0L -> {
                            stringResource(
                                R.string.update_dialog_size_mb_fmt,
                                downloadedBytes.toDouble() / (1024.0 * 1024.0),
                            )
                        }
                        else -> stringResource(R.string.update_dialog_preparing)
                    }
                    Text(
                        text = leftLabel,
                        color = colors.text2,
                        fontFamily = WatermelonMono,
                        fontSize = 12.sp,
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        if (speedMbPerSec > 0.05) {
                            Text(
                                text = stringResource(R.string.update_dialog_speed_fmt, speedMbPerSec),
                                color = colors.text2,
                                fontFamily = WatermelonMono,
                                fontSize = 12.sp,
                            )
                        }
                        if (fraction >= 0f) {
                            Text(
                                text = "${(fraction * 100f).toInt()}%",
                                color = colors.green,
                                fontFamily = WatermelonMono,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                }

                SecondaryActionButton(
                    text = stringResource(R.string.move_to_background),
                    colors = colors,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    dismiss()
                    onMoveToBackground()
                }
            }
        }
    }
}

fun showStormUpdateInfoDialog(
    context: Context,
    title: String,
    message: String,
    versionBadge: String? = null,
    isError: Boolean = false,
    onRetry: (() -> Unit)? = null,
): Dialog {
    return showSettingsComposeDialog(context = context) { dismiss ->
        val colors = LocalWatermelonColors.current
        val accentColor = if (isError) colors.red else colors.green
        val icon = if (isError) Icons.Filled.ErrorOutline else Icons.Filled.CheckCircle

        UpdateDialogCardShell(
            colors = colors,
            onDismissBackdrop = dismiss,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = false)
                    .verticalScroll(rememberScrollState())
                    .padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(11.dp))
                            .background(accentColor.copy(alpha = 0.14f))
                            .border(1.dp, accentColor.copy(alpha = 0.45f), RoundedCornerShape(11.dp)),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = null,
                            tint = accentColor,
                            modifier = Modifier.size(20.dp),
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = title,
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        if (!versionBadge.isNullOrBlank()) {
                            Text(
                                text = versionBadge.trim().removePrefix("v").removePrefix("V"),
                                color = accentColor,
                                fontFamily = WatermelonMono,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }

                Text(
                    text = message,
                    color = colors.text2,
                    fontFamily = SpaceGrotesk,
                    fontSize = 13.sp,
                    lineHeight = 18.sp,
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    if (onRetry != null) {
                        SecondaryActionButton(
                            text = stringResource(R.string.update_dialog_retry),
                            colors = colors,
                            modifier = Modifier.weight(1f),
                        ) {
                            dismiss()
                            onRetry()
                        }
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(11.dp))
                            .background(colors.green)
                            .clickable { dismiss() }
                            .padding(vertical = 11.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = stringResource(R.string.ok),
                            color = Color(0xFF07131A),
                            fontFamily = SpaceGrotesk,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun UpdateDialogCardShell(
    colors: WatermelonColors,
    onDismissBackdrop: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.80f else 0.62f))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onDismissBackdrop() },
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 560.dp)
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(horizontal = 16.dp, vertical = 20.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(colors.surface)
                .border(1.2.dp, colors.line, RoundedCornerShape(20.dp))
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { },
        ) {
            content()
        }
    }
}

@Composable
private fun VersionBadgeColumn(
    label: String,
    version: String,
    accent: Boolean,
    colors: WatermelonColors,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(if (accent) colors.green.copy(alpha = 0.14f) else colors.bg)
            .border(
                1.dp,
                if (accent) colors.green.copy(alpha = 0.48f) else colors.line,
                RoundedCornerShape(10.dp),
            )
            .padding(horizontal = 10.dp, vertical = 7.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = label,
            color = colors.text2,
            fontFamily = SpaceGrotesk,
            fontSize = 10.5.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Spacer(Modifier.height(2.dp))
        Text(
            text = version,
            color = if (accent) colors.green else colors.text,
            fontFamily = WatermelonMono,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun MetadataChip(
    icon: ImageVector,
    label: String,
    colors: WatermelonColors,
    highlighted: Boolean = false,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier
            .clip(RoundedCornerShape(9.dp))
            .background(if (highlighted) colors.green.copy(alpha = 0.12f) else colors.surface2)
            .border(
                1.dp,
                if (highlighted) colors.green.copy(alpha = 0.40f) else colors.line,
                RoundedCornerShape(9.dp),
            )
            .padding(horizontal = 9.dp, vertical = 5.dp),
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = if (highlighted) colors.green else colors.text2,
            modifier = Modifier.size(13.dp),
        )
        Text(
            text = label,
            color = if (highlighted) colors.text else colors.text2,
            fontFamily = WatermelonMono,
            fontSize = 11.sp,
            maxLines = 1,
        )
    }
}

@Composable
private fun SecondaryActionButton(
    text: String,
    colors: WatermelonColors,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(11.dp))
            .background(colors.surface2)
            .border(1.dp, colors.line, RoundedCornerShape(11.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 10.dp, vertical = 11.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 12.5.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}
