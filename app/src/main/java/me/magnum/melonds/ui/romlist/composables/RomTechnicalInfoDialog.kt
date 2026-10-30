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

    val playTimeStr = remember(rom.totalPlayTime) {
        val hours = rom.totalPlayTime.inWholeHours
        val minutes = (rom.totalPlayTime.inWholeMinutes % 60)
        val seconds = (rom.totalPlayTime.inWholeSeconds % 60)
        if (hours > 0) {
            "${hours}h ${minutes}m"
        } else if (minutes > 0) {
            "${minutes}m ${seconds}s"
        } else {
            "${seconds}s"
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
        textBuilder.appendLine("${context.getString(R.string.rom_info_title_label)}: ${romDisplayName(rom)}")
        if (rom.name != romDisplayName(rom)) {
            textBuilder.appendLine("Internal Title: ${rom.name}")
        }
        textBuilder.appendLine("${context.getString(R.string.rom_info_file_name_label)}: ${rom.fileName}")
        textBuilder.appendLine("URI: ${rom.uri}")
        textBuilder.appendLine("${context.getString(R.string.rom_info_file_size_label)}: $formattedSize")
        textBuilder.appendLine("${context.getString(R.string.rom_info_platform_label)}: $platformStr")
        if (rom.gameCode.isNotBlank()) {
            textBuilder.appendLine("${context.getString(R.string.rom_info_game_code_label)}: ${rom.gameCode}")
        }
        textBuilder.appendLine("${context.getString(R.string.rom_info_play_time_label)}: $playTimeStr")
        textBuilder.appendLine("${context.getString(R.string.rom_info_last_played_label)}: $lastPlayedStr")

        val clip = ClipData.newPlainText("ROM Technical Info", textBuilder.toString())
        clipboard?.setPrimaryClip(clip)
        Toast.makeText(context, context.getString(R.string.rom_technical_info_copied), Toast.LENGTH_SHORT).show()
    }

    Dialog(onDismissRequest = onDismiss) {
        androidx.compose.runtime.CompositionLocalProvider(androidx.compose.material.LocalElevationOverlay provides null) {
            Surface(
                shape = RoundedCornerShape(16.dp),
                color = colors.surface,
                elevation = 20.dp,
                modifier = Modifier
                    .widthIn(max = 380.dp)
                    .fillMaxWidth(),
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .verticalScroll(rememberScrollState()),
                ) {
                    Text(
                        text = stringResource(R.string.rom_technical_info_title),
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(Modifier.height(14.dp))
                    WatermelonRowSeparator()
                    Spacer(Modifier.height(10.dp))

                    TechInfoRow(stringResource(R.string.rom_info_title_label), romDisplayName(rom))
                    if (rom.name != romDisplayName(rom)) {
                        TechInfoRow("Internal Name", rom.name)
                    }
                    TechInfoRow(stringResource(R.string.rom_info_file_name_label), rom.fileName)
                    TechInfoRow(stringResource(R.string.rom_info_file_size_label), formattedSize)
                    TechInfoRow(stringResource(R.string.rom_info_platform_label), platformStr)
                    if (rom.gameCode.isNotBlank()) {
                        TechInfoRow(stringResource(R.string.rom_info_game_code_label), rom.gameCode)
                    }
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
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                backgroundColor = colors.surface2,
                                contentColor = colors.text,
                            ),
                            border = androidx.compose.foundation.BorderStroke(1.dp, colors.line),
                        ) {
                            Icon(
                                imageVector = Icons.Filled.ContentCopy,
                                contentDescription = null,
                                tint = colors.text2,
                                modifier = Modifier.padding(end = 6.dp),
                            )
                            Text(
                                text = stringResource(R.string.rom_technical_info_copy),
                                fontSize = 12.5.sp,
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
private fun TechInfoRow(label: String, value: String, isMono: Boolean = false) {
    val colors = watermelon
    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp)) {
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
            fontSize = 13.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(top = 1.dp),
        )
    }
}
