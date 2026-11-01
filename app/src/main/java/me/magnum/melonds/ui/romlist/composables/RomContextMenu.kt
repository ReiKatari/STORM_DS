package me.magnum.melonds.ui.romlist.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.FilterQuality
import coil.compose.AsyncImage
import androidx.compose.material.icons.filled.FileDownload
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
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
import me.magnum.melonds.MelonRomDecryptor
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun RomContextMenu(
    rom: Rom?,
    onDismiss: () -> Unit,
    onToggleFavorite: (Rom) -> Unit,
    onShowDetails: (Rom) -> Unit,
    onSendSaveFile: (Rom) -> Unit,
    onImportSaveFile: (Rom) -> Unit,
    onLaunchRom: (Rom) -> Unit = {},
    onDecryptRom: (Rom) -> Unit = {},
    onPickCustomCover: ((Rom) -> Unit)? = null,
    onClearCustomCover: ((Rom) -> Unit)? = null,
) {
    if (rom == null) return
    val colors = watermelon
    val context = LocalContext.current
    var showTechnicalInfo by remember { mutableStateOf(false) }
    val boxArtRepo = remember { runCatching { me.magnum.melonds.di.entrypoint.BoxArtEntryPoint.resolve(context).boxArtRepository() }.getOrNull() }
    val hasCustomCover = remember(rom) { boxArtRepo?.hasCustomCover(rom) ?: false }

    if (showTechnicalInfo) {
        RomTechnicalInfoDialog(
            rom = rom,
            onDismiss = {
                showTechnicalInfo = false
                onDismiss()
            }
        )
    }

    Dialog(onDismissRequest = onDismiss) {
        androidx.compose.runtime.CompositionLocalProvider(androidx.compose.material.LocalElevationOverlay provides null) {
        Surface(
            shape = RoundedCornerShape(17.dp),
            color = colors.surface,
            elevation = 22.dp,
            modifier = Modifier.widthIn(max = 345.dp),
        ) {
            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 10.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(9.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(9.dp)),
                        contentAlignment = Alignment.Center,
                    ) {
                        AsyncImage(
                            model = romIconRequest(context, rom),
                            contentDescription = null,
                            filterQuality = FilterQuality.None,
                            modifier = Modifier.fillMaxSize(),
                        )
                    }
                    Spacer(Modifier.width(11.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = romDisplayName(rom),
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 15.sp,
                            lineHeight = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                        )
                        val hours = formatHoursLabel(rom.totalPlayTime)
                        Text(
                            text = if (hours.isNotEmpty()) "${romPlatformLabel(rom)} · $hours" else romPlatformLabel(rom),
                            color = colors.text3,
                            fontFamily = WatermelonMono,
                            fontSize = 9.5.sp,
                            modifier = Modifier.padding(top = 2.dp),
                        )
                    }
                }
                val isRu = remember { java.util.Locale.getDefault().language.startsWith("ru") }
                Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
                Spacer(Modifier.height(6.dp))

                // Group 1: Launch and Game Profile
                ContextMenuGroup(title = if (isRu) "Запуск и профиль игры" else "Launch and Profile") {
                    ContextItem(
                        icon = Icons.Filled.PlayArrow,
                        iconTint = colors.red,
                        label = stringResource(R.string.play),
                        subtitle = if (isRu) "Запустить игру в эмуляторе" else "Launch game in emulator",
                        onClick = {
                            onLaunchRom(rom)
                            onDismiss()
                        },
                    )
                    ContextItem(
                        icon = if (rom.isFavorite) Icons.Filled.Star else Icons.Outlined.StarOutline,
                        iconTint = if (rom.isFavorite) WatermelonColors.favoriteStar else colors.text2,
                        label = stringResource(
                            if (rom.isFavorite) R.string.rom_action_unfavorite
                            else R.string.rom_action_favorite,
                        ),
                        subtitle = if (isRu) "Закрепить в начале библиотеки" else "Pin to top of library",
                        onClick = {
                            onToggleFavorite(rom)
                        },
                    )
                    ContextItem(
                        icon = Icons.Filled.Info,
                        iconTint = colors.green,
                        label = stringResource(R.string.rom_action_details),
                        subtitle = if (isRu) "Конфигурация, читы и достижения" else "Config, cheats and achievements",
                        onClick = {
                            onShowDetails(rom)
                            onDismiss()
                        },
                    )
                }

                Spacer(Modifier.height(4.dp))

                // Group 2: Cover and Save Data
                ContextMenuGroup(title = if (isRu) "Обложка и данные" else "Cover and Save Data") {
                    ContextItem(
                        icon = Icons.Filled.Share,
                        iconTint = colors.text2,
                        label = stringResource(R.string.rom_action_send_save_file),
                        subtitle = if (isRu) "Поделиться или бэкап .sav" else "Share or backup .sav file",
                        onClick = {
                            onSendSaveFile(rom)
                            onDismiss()
                        },
                    )
                    ContextItem(
                        icon = Icons.Filled.FileDownload,
                        iconTint = colors.text2,
                        label = stringResource(R.string.rom_action_import_save_file),
                        subtitle = if (isRu) "Восстановить .sav из файла" else "Restore .sav from external file",
                        onClick = {
                            onImportSaveFile(rom)
                            onDismiss()
                        },
                    )
                    if (onPickCustomCover != null) {
                        ContextItem(
                            icon = Icons.Filled.Image,
                            iconTint = colors.text2,
                            label = stringResource(R.string.custom_cover_pick),
                            subtitle = if (isRu) "Установить свою обложку" else "Set custom cover image",
                            onClick = {
                                onPickCustomCover(rom)
                                onDismiss()
                            },
                        )
                    }
                    if (hasCustomCover && onClearCustomCover != null) {
                        ContextItem(
                            icon = Icons.Filled.Delete,
                            iconTint = colors.red,
                            label = stringResource(R.string.custom_cover_reset),
                            subtitle = if (isRu) "Вернуть стандартную обложку" else "Reset to default cover",
                            onClick = {
                                onClearCustomCover(rom)
                                onDismiss()
                            },
                        )
                    }
                }

                Spacer(Modifier.height(4.dp))

                // Group 3: Technical Specs & Export
                ContextMenuGroup(title = if (isRu) "Технический паспорт и экспорт" else "Technical Specs and Export") {
                    ContextItem(
                        icon = Icons.Filled.Info,
                        iconTint = colors.green,
                        label = stringResource(R.string.rom_technical_info_title),
                        subtitle = if (isRu) "GameCode, CRC, размер и путь" else "GameCode, CRC, size and path",
                        onClick = {
                            showTechnicalInfo = true
                        },
                    )
                }
            }
        }
        }
    }
}

@Composable
private fun ContextMenuGroup(
    title: String,
    content: @Composable ColumnScope.() -> Unit,
) {
    val colors = watermelon
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 3.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(colors.surface2.copy(alpha = 0.5f))
            .border(1.dp, colors.line, RoundedCornerShape(12.dp))
            .padding(vertical = 4.dp),
    ) {
        Text(
            text = title.uppercase(),
            color = colors.text3,
            fontFamily = SpaceGrotesk,
            fontSize = 9.5.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.6.sp,
            modifier = Modifier.padding(start = 12.dp, top = 4.dp, bottom = 2.dp),
        )
        content()
    }
}

@Composable
private fun ContextItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    iconTint: androidx.compose.ui.graphics.Color,
    label: String,
    subtitle: String? = null,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    val colors = watermelon
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .then(if (enabled) Modifier.clickable(onClick = onClick) else Modifier)
            .padding(horizontal = 12.dp, vertical = 7.dp),
    ) {
        Box(
            modifier = Modifier
                .size(32.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(colors.surface2),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = if (enabled) iconTint else colors.green,
                modifier = Modifier.size(18.dp)
            )
        }
        Spacer(Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = label,
                color = if (enabled) colors.text else colors.green,
                fontSize = 13.sp,
                fontFamily = SpaceGrotesk,
                fontWeight = if (enabled) FontWeight.SemiBold else FontWeight.Bold,
            )
            if (subtitle != null) {
                Text(
                    text = subtitle,
                    color = colors.text3,
                    fontSize = 10.5.sp,
                    lineHeight = 12.sp,
                )
            }
        }
    }
}
