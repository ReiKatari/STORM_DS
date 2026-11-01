package me.magnum.melonds.ui.romlist.composables

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.common.WatermelonRowSeparator
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import java.io.File
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun RomTechnicalInfoDialog(
    rom: Rom,
    onDismiss: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current
    var fileSizeBytes by remember { mutableStateOf<Long?>(null) }

    LaunchedEffect(rom.uri) {
        val size = withContext(Dispatchers.IO) {
            runCatching {
                if (rom.uri.scheme == "file") {
                    rom.uri.path?.let { File(it).length() } ?: 0L
                } else {
                    context.contentResolver.openFileDescriptor(rom.uri, "r")?.use {
                        it.statSize
                    } ?: 0L
                }
            }.getOrDefault(0L)
        }
        fileSizeBytes = size
    }

    val dateFormat = remember { SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()) }
    val lastPlayedStr = remember(rom.lastPlayed) {
        rom.lastPlayed?.let { dateFormat.format(it) } ?: context.getString(R.string.rom_info_never_played)
    }

    val platformStr = remember(rom.isDsiWareTitle, rom.isDsiEnhanced) {
        when {
            rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut -> "Nintendo DSiWare"
            rom.isDsiEnhanced -> "Nintendo DS (DSi Enhanced)"
            else -> "Nintendo DS"
        }
    }

    val isRu = remember { java.util.Locale.getDefault().language.startsWith("ru") }
    val playTimeStr = remember(rom.totalPlayTime) {
        val hours = rom.totalPlayTime.inWholeHours
        val minutes = (rom.totalPlayTime.inWholeMinutes % 60)
        val seconds = (rom.totalPlayTime.inWholeSeconds % 60)
        if (hours > 0) {
            "${hours}ч ${minutes}м"
        } else if (minutes > 0) {
            "${minutes}м ${seconds}с"
        } else {
            "${seconds}с"
        }
    }

    val unitCodeStr = remember(rom.isDsiWareTitle, rom.isDsiEnhanced, rom.isInstalledDsiWareShortcut) {
        when {
            rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut -> "0x03 (DSi)"
            rom.isDsiEnhanced -> "0x02 (DSi+)"
            else -> "0x00 (NDS)"
        }
    }

    val formattedSize = remember(fileSizeBytes) {
        fileSizeBytes?.let { bytes ->
            if (bytes <= 0) "—"
            else {
                val mb = bytes / (1024.0 * 1024.0)
                if (mb >= 1.0) {
                    String.format(Locale.US, "%.2f MB (%d B)", mb, bytes)
                } else {
                    val kb = bytes / 1024.0
                    String.format(Locale.US, "%.1f KB (%d B)", kb, bytes)
                }
            }
        } ?: "..."
    }

    val copyToClipboard = {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
        val textBuilder = StringBuilder()
        textBuilder.appendLine("STORM DS - ТЕХНИЧЕСКИЙ ПАСПОРТ ROM")
        textBuilder.appendLine("========================================")
        textBuilder.appendLine("${context.getString(R.string.rom_info_title_label)}: ${romDisplayName(rom)}")
        if (rom.name != romDisplayName(rom)) {
            textBuilder.appendLine("Internal Title: ${rom.name}")
        }
        textBuilder.appendLine("${context.getString(R.string.rom_info_file_name_label)}: ${rom.fileName}")
        textBuilder.appendLine("URI: ${rom.uri}")
        textBuilder.appendLine("${context.getString(R.string.rom_info_file_size_label)}: $formattedSize")
        textBuilder.appendLine("${context.getString(R.string.rom_info_platform_label)}: $platformStr")
        textBuilder.appendLine("UnitCode: $unitCodeStr")
        if (rom.gameCode.isNotBlank()) {
            textBuilder.appendLine("${context.getString(R.string.rom_info_game_code_label)}: ${rom.gameCode}")
        }
        val hashStr = if (rom.retroAchievementsHash.isNotBlank()) rom.retroAchievementsHash.uppercase() else "—"
        textBuilder.appendLine("CRC32 / RA Hash: $hashStr")
        textBuilder.appendLine("${context.getString(R.string.rom_info_play_time_label)}: $playTimeStr")
        textBuilder.appendLine("${context.getString(R.string.rom_info_last_played_label)}: $lastPlayedStr")
        textBuilder.appendLine("========================================")

        val clip = ClipData.newPlainText("ROM Technical Info", textBuilder.toString())
        clipboard?.setPrimaryClip(clip)
        Toast.makeText(context, context.getString(R.string.rom_technical_info_copied), Toast.LENGTH_SHORT).show()
    }

    Dialog(onDismissRequest = onDismiss) {
        androidx.compose.runtime.CompositionLocalProvider(androidx.compose.material.LocalElevationOverlay provides null) {
            Surface(
                shape = RoundedCornerShape(18.dp),
                color = colors.surface,
                elevation = 22.dp,
                modifier = Modifier
                    .widthIn(max = 400.dp)
                    .fillMaxWidth(),
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .verticalScroll(rememberScrollState()),
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Box(
                            modifier = Modifier
                                .width(3.dp)
                                .height(16.dp)
                                .clip(RoundedCornerShape(1.5.dp))
                                .background(colors.green),
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = stringResource(R.string.rom_technical_info_title),
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }

                    Spacer(Modifier.height(14.dp))

                    // 2-Column Hardware Badges Grid
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Column(
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            HardwareBadge(
                                label = "GAME CODE",
                                value = rom.gameCode.ifBlank { "NTR-XXXX" },
                                isAccent = true,
                            )
                            HardwareBadge(
                                label = if (isRu) "РАЗМЕР ROM" else "ROM SIZE",
                                value = formattedSize.split(" (").first(),
                            )
                        }
                        Column(
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            HardwareBadge(
                                label = "UNIT CODE",
                                value = unitCodeStr,
                            )
                            HardwareBadge(
                                label = "CRC32 / HASH",
                                value = if (rom.retroAchievementsHash.isNotBlank()) rom.retroAchievementsHash.take(10).uppercase() else "—",
                            )
                        }
                    }

                    Spacer(Modifier.height(14.dp))
                    WatermelonRowSeparator()
                    Spacer(Modifier.height(10.dp))

                    TechInfoRow(stringResource(R.string.rom_info_title_label), romDisplayName(rom))
                    if (rom.name != romDisplayName(rom)) {
                        TechInfoRow("Internal Name", rom.name)
                    }
                    TechInfoRow(stringResource(R.string.rom_info_file_name_label), rom.fileName)
                    TechInfoRow(stringResource(R.string.rom_info_platform_label), platformStr)
                    TechInfoRow(stringResource(R.string.rom_info_play_time_label), playTimeStr)
                    TechInfoRow(stringResource(R.string.rom_info_last_played_label), lastPlayedStr)
                    TechInfoRow("URI", rom.uri.toString(), isMono = true)

                    Spacer(Modifier.height(16.dp))
                    WatermelonRowSeparator()
                    Spacer(Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        OutlinedButton(
                            onClick = copyToClipboard,
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                backgroundColor = colors.surface2,
                                contentColor = colors.text,
                            ),
                            border = androidx.compose.foundation.BorderStroke(1.dp, colors.green.copy(alpha = 0.5f)),
                        ) {
                            Icon(
                                imageVector = Icons.Filled.ContentCopy,
                                contentDescription = null,
                                tint = colors.green,
                                modifier = Modifier.padding(end = 6.dp),
                            )
                            Text(
                                text = stringResource(R.string.rom_technical_info_copy),
                                fontSize = 12.5.sp,
                                fontFamily = SpaceGrotesk,
                                fontWeight = FontWeight.SemiBold,
                                color = colors.text,
                            )
                        }

                        Spacer(Modifier.width(8.dp))

                        TextButton(onClick = onDismiss) {
                            Text(
                                text = stringResource(android.R.string.ok),
                                color = colors.text2,
                                fontWeight = FontWeight.Medium,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun HardwareBadge(
    label: String,
    value: String,
    isAccent: Boolean = false,
) {
    val colors = watermelon
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(if (isAccent) colors.green.copy(alpha = 0.12f) else colors.surface2)
            .border(
                width = 1.dp,
                color = if (isAccent) colors.green.copy(alpha = 0.5f) else colors.line,
                shape = RoundedCornerShape(10.dp),
            )
            .padding(horizontal = 10.dp, vertical = 7.dp),
    ) {
        Text(
            text = label,
            color = if (isAccent) colors.green else colors.text3,
            fontFamily = WatermelonMono,
            fontSize = 9.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.6.sp,
        )
        Spacer(Modifier.height(2.dp))
        Text(
            text = value,
            color = colors.text,
            fontFamily = WatermelonMono,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun TechInfoRow(label: String, value: String, isMono: Boolean = false) {
    val colors = watermelon
    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Text(
            text = label,
            color = colors.text3,
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium,
        )
        Text(
            text = value,
            color = colors.text,
            fontFamily = if (isMono) WatermelonMono else null,
            fontSize = 12.5.sp,
            lineHeight = 15.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(top = 1.dp),
        )
    }
}
