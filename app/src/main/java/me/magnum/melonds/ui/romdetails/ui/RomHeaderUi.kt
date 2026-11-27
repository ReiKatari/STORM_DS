package me.magnum.melonds.ui.romdetails.ui

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.repositories.SaveStatesRepository
import me.magnum.melonds.impl.RomSaveFileManager
import me.magnum.melonds.ui.common.WatermelonCard
import me.magnum.melonds.ui.common.WatermelonRowSeparator
import me.magnum.melonds.ui.common.bouncingClickable
import me.magnum.melonds.ui.romdetails.model.RomDetailsTab
import me.magnum.melonds.ui.romlist.composables.DsBoxArtAspectRatio
import me.magnum.melonds.ui.romlist.composables.PlatformBadge
import me.magnum.melonds.ui.romlist.composables.RegionBadge
import me.magnum.melonds.ui.romlist.composables.RomMiniIcon
import me.magnum.melonds.ui.romlist.composables.ScanlinesOverlay
import me.magnum.melonds.ui.romlist.composables.formatHoursLabel
import me.magnum.melonds.ui.romlist.composables.resolveRomRegionBadge
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import me.magnum.melonds.ui.romlist.composables.romGradient
import me.magnum.melonds.ui.romlist.composables.romIconRequest
import me.magnum.melonds.ui.romlist.composables.romPlatformLabel
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import kotlin.time.Duration

@Composable
fun RomDetailsCompactTopBar(
    rom: Rom,
    boxArtUrl: String?,
    raCoverUrl: String?,
    showQuickLaunch: Boolean,
    onLaunchRom: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val context = LocalContext.current
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(colors.bg)
            .padding(horizontal = 16.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(36.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(romGradient(romDisplayName(rom)))
                .border(1.dp, colors.line, RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center,
        ) {
            if (boxArtUrl != null) {
                AsyncImage(
                    model = boxArtUrl,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(),
                )
            } else {
                AsyncImage(
                    model = romIconRequest(context, rom),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    filterQuality = FilterQuality.None,
                    modifier = Modifier.size(28.dp),
                )
            }
        }
        Spacer(Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = romDisplayName(rom),
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 15.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            if (rom.developerName.isNotBlank()) {
                Text(
                    text = rom.developerName,
                    color = colors.text3,
                    fontFamily = Manrope,
                    fontSize = 11.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        Spacer(Modifier.width(8.dp))
        PlatformBadge(text = romPlatformLabel(rom), fontSize = 9.sp)
        if (showQuickLaunch) {
            Spacer(Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(34.dp)
                    .shadow(6.dp, RoundedCornerShape(10.dp), spotColor = colors.redGlow)
                    .clip(RoundedCornerShape(10.dp))
                    .background(colors.red)
                    .bouncingClickable(onClick = onLaunchRom),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = Icons.Filled.PlayArrow,
                    contentDescription = stringResource(R.string.play),
                    tint = Color.White,
                    modifier = Modifier.size(19.dp),
                )
            }
        }
    }
}

@Composable
fun PlayButton(
    height: Dp,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    focusRequester: FocusRequester? = null,
) {
    val colors = watermelon
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(13.dp)
    Row(
        modifier = modifier
            .height(height)
            .shadow(if (isFocused) 16.dp else 8.dp, shape, spotColor = colors.redGlow)
            .clip(shape)
            .background(colors.red)
            .let { if (focusRequester != null) it.focusRequester(focusRequester) else it }
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Icon(Icons.Filled.PlayArrow, contentDescription = null, tint = Color.White, modifier = Modifier.size(19.dp))
        Spacer(Modifier.width(9.dp))
        Text(
            text = stringResource(R.string.play).uppercase(),
            color = Color.White,
            fontFamily = SpaceGrotesk,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 0.3.sp,
        )
    }
}

@Composable
fun SaveActionsButton(
    height: Dp,
    onSendSaveFile: () -> Unit,
    onImportSaveFile: () -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
) {
    var menuOpen by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val colors = watermelon
    val shape = RoundedCornerShape(12.dp)
    Box(modifier = modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(height)
                .clip(shape)
                .background(colors.surface)
                .border(
                    width = if (isFocused) 1.5.dp else 1.dp,
                    color = if (isFocused) colors.green else colors.line,
                    shape = shape,
                )
                .clickable(interactionSource = interactionSource, indication = null) { menuOpen = true }
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Icon(Icons.Filled.Save, contentDescription = null, tint = colors.text, modifier = Modifier.size(17.dp))
            if (!label.isNullOrBlank()) {
                Spacer(Modifier.width(6.dp))
                Text(
                    text = label,
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 11.5.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        DropdownMenu(expanded = menuOpen, onDismissRequest = { menuOpen = false }) {
            DropdownMenuItem(onClick = { menuOpen = false; onSendSaveFile() }) {
                Text(stringResource(R.string.rom_action_send_save_file))
            }
            DropdownMenuItem(onClick = { menuOpen = false; onImportSaveFile() }) {
                Text(stringResource(R.string.rom_action_import_save_file))
            }
        }
    }
}

@Composable
fun NetplayLobbyButton(
    height: Dp,
    rom: Rom,
    onLaunchRom: () -> Unit = {},
    modifier: Modifier = Modifier,
    label: String? = null,
) {
    var dialogOpen by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val colors = watermelon
    val shape = RoundedCornerShape(12.dp)

    if (dialogOpen) {
        NetplayLobbyDialog(
            rom = rom,
            onDismiss = { dialogOpen = false },
            onJoinRoom = {
                dialogOpen = false
                onLaunchRom()
            },
        )
    }

    Row(
        modifier = modifier
            .height(height)
            .clip(shape)
            .background(colors.surface)
            .border(
                width = if (isFocused) 1.5.dp else 1.dp,
                color = if (isFocused) colors.green else colors.line,
                shape = shape,
            )
            .clickable(interactionSource = interactionSource, indication = null) { dialogOpen = true }
            .padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Icon(
            imageVector = Icons.Filled.Wifi,
            contentDescription = label ?: "Netplay / NiFi",
            tint = colors.green,
            modifier = Modifier.size(18.dp),
        )
        if (!label.isNullOrBlank()) {
            Spacer(Modifier.width(6.dp))
            Text(
                text = label,
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 11.5.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Composable
fun QuickActionTile(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    tint: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val colors = watermelon
    val shape = RoundedCornerShape(12.dp)

    Row(
        modifier = modifier
            .height(44.dp)
            .clip(shape)
            .background(colors.surface)
            .border(
                width = if (isFocused) 1.5.dp else 1.dp,
                color = if (isFocused) colors.green else colors.line,
                shape = shape,
            )
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Icon(imageVector = icon, contentDescription = null, tint = tint, modifier = Modifier.size(17.dp))
        Spacer(Modifier.width(6.dp))
        Text(
            text = label,
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 11.5.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
fun RomInfoChip(
    label: String,
    value: String,
    modifier: Modifier = Modifier,
    maxLines: Int = 1,
    textAlign: TextAlign = TextAlign.Center,
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
) {
    val colors = watermelon
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(colors.surface2)
            .border(1.dp, colors.line, RoundedCornerShape(10.dp))
            .padding(horizontal = 9.dp, vertical = 7.dp),
        horizontalAlignment = horizontalAlignment,
    ) {
        Text(
            text = label.uppercase(),
            color = colors.text3,
            fontFamily = WatermelonMono,
            fontSize = 8.5.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.4.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Spacer(Modifier.height(2.dp))
        Text(
            text = value,
            color = colors.text,
            fontFamily = WatermelonMono,
            fontSize = 10.sp,
            lineHeight = 12.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = maxLines,
            textAlign = textAlign,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun HeroCover(
    rom: Rom,
    boxArtUrl: String?,
    raCoverUrl: String?,
    width: Dp,
    onClick: (() -> Unit)? = null,
) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .width(width)
            .aspectRatio(DsBoxArtAspectRatio)
            .shadow(12.dp, RoundedCornerShape(14.dp))
            .clip(RoundedCornerShape(14.dp))
            .background(romGradient(romDisplayName(rom)))
            .let { if (onClick != null) it.clickable(onClick = onClick) else it },
    ) {
        if (boxArtUrl != null) {
            AsyncImage(
                model = boxArtUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
            )
        } else {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                AsyncImage(
                    model = romIconRequest(context, rom),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    filterQuality = FilterQuality.None,
                    modifier = Modifier
                        .size(width * 0.58f)
                        .clip(RoundedCornerShape(12.dp)),
                )
            }
        }
        ScanlinesOverlay()
        if (boxArtUrl != null) {
            RomMiniIcon(
                rom = rom,
                raCoverUrl = raCoverUrl,
                size = 26.dp,
                modifier = Modifier.align(Alignment.BottomStart).padding(5.dp),
            )
        }
    }
}

@Composable
private fun HeroBackdrop(rom: Rom, boxArtUrl: String?, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Box(modifier = modifier) {
        if (boxArtUrl != null) {
            AsyncImage(
                model = boxArtUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.78f,
                modifier = Modifier.fillMaxSize(),
            )
        } else {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(romGradient(romDisplayName(rom))),
                contentAlignment = Alignment.Center,
            ) {
                AsyncImage(
                    model = romIconRequest(context, rom),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    alpha = 0.30f,
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }
        Box(
            Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color(0x66090C12), Color(0xCC090C12), Color(0xEE090C12)),
                    ),
                ),
        )
    }
}

@EntryPoint
@InstallIn(SingletonComponent::class)
interface RomHeaderEntryPoint {
    fun romSaveFileManager(): RomSaveFileManager
    fun saveStatesRepository(): SaveStatesRepository
}

@Composable
fun RomOverviewTab(
    rom: Rom,
    boxArtUrl: String?,
    raCoverUrl: String?,
    isLandscape: Boolean,
    initialFocusRequester: FocusRequester?,
    onLaunchRom: () -> Unit,
    onSendSaveFile: () -> Unit,
    onImportSaveFile: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var showFullScreenCover by remember { mutableStateOf(false) }

    if (showFullScreenCover) {
        FullScreenCoverDialog(
            rom = rom,
            boxArtUrl = boxArtUrl,
            onDismiss = { showFullScreenCover = false },
        )
    }

    if (isLandscape) {
        Row(
            modifier = modifier
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Column(
                modifier = Modifier
                    .weight(0.95f)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                HeroShowcaseCard(
                    rom = rom,
                    boxArtUrl = boxArtUrl,
                    raCoverUrl = raCoverUrl,
                    coverWidth = 104.dp,
                    onShowCover = { showFullScreenCover = true },
                )
                OverviewActionDeck(
                    rom = rom,
                    initialFocusRequester = initialFocusRequester,
                    onLaunchRom = onLaunchRom,
                    onSendSaveFile = onSendSaveFile,
                    onImportSaveFile = onImportSaveFile,
                    onShowCover = { showFullScreenCover = true },
                )
            }
            Column(
                modifier = Modifier
                    .weight(1.05f)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                RomTechPassportCard(
                    rom = rom,
                    onShowCover = { showFullScreenCover = true },
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
    } else {
        Column(
            modifier = modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            HeroShowcaseCard(
                rom = rom,
                boxArtUrl = boxArtUrl,
                raCoverUrl = raCoverUrl,
                coverWidth = 118.dp,
                onShowCover = { showFullScreenCover = true },
            )
            OverviewActionDeck(
                rom = rom,
                initialFocusRequester = initialFocusRequester,
                onLaunchRom = onLaunchRom,
                onSendSaveFile = onSendSaveFile,
                onImportSaveFile = onImportSaveFile,
                onShowCover = { showFullScreenCover = true },
            )
            RomTechPassportCard(
                rom = rom,
                onShowCover = { showFullScreenCover = true },
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(Modifier.height(6.dp))
        }
    }
}

@Composable
private fun HeroShowcaseCard(
    rom: Rom,
    boxArtUrl: String?,
    raCoverUrl: String?,
    coverWidth: Dp,
    onShowCover: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current
    val shape = RoundedCornerShape(20.dp)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .border(1.dp, colors.line, shape),
    ) {
        HeroBackdrop(rom = rom, boxArtUrl = boxArtUrl, modifier = Modifier.matchParentSize())

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp, vertical = 18.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            HeroCover(
                rom = rom,
                boxArtUrl = boxArtUrl,
                raCoverUrl = raCoverUrl,
                width = coverWidth,
                onClick = onShowCover,
            )

            Spacer(Modifier.height(14.dp))

            Text(
                text = romDisplayName(rom),
                color = Color.White,
                fontFamily = SpaceGrotesk,
                fontSize = 19.sp,
                lineHeight = 23.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.fillMaxWidth(0.95f),
            )

            if (rom.developerName.isNotBlank()) {
                Text(
                    text = rom.developerName,
                    color = Color.White.copy(alpha = 0.78f),
                    fontFamily = Manrope,
                    fontSize = 12.5.sp,
                    maxLines = 1,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 4.dp),
                )
            }

            val regionBadge = resolveRomRegionBadge(rom)
            val playTimeStr = formatHoursLabel(context, rom.totalPlayTime)
            if (regionBadge != null || playTimeStr.isNotEmpty()) {
                Spacer(Modifier.height(10.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    if (regionBadge != null) {
                        RegionBadge(
                            flag = regionBadge.first,
                            code = regionBadge.second,
                            modifier = Modifier.padding(end = if (playTimeStr.isNotEmpty()) 10.dp else 0.dp),
                        )
                    }
                    if (playTimeStr.isNotEmpty()) {
                        Text(
                            text = stringResource(R.string.rom_total_play_time_format, playTimeStr),
                            color = Color.White.copy(alpha = 0.88f),
                            fontFamily = WatermelonMono,
                            fontSize = 11.sp,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun OverviewActionDeck(
    rom: Rom,
    initialFocusRequester: FocusRequester?,
    onLaunchRom: () -> Unit,
    onSendSaveFile: () -> Unit,
    onImportSaveFile: () -> Unit,
    onShowCover: () -> Unit,
) {
    val colors = watermelon
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        PlayButton(
            height = 50.dp,
            onClick = onLaunchRom,
            focusRequester = initialFocusRequester,
            modifier = Modifier.fillMaxWidth(),
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            NetplayLobbyButton(
                height = 44.dp,
                rom = rom,
                onLaunchRom = onLaunchRom,
                label = stringResource(R.string.v870_rom_header_netplay_label),
                modifier = Modifier.weight(1f),
            )
            if (!rom.isInstalledDsiWareShortcut) {
                SaveActionsButton(
                    height = 44.dp,
                    onSendSaveFile = onSendSaveFile,
                    onImportSaveFile = onImportSaveFile,
                    label = stringResource(R.string.v870_rom_header_saves_label),
                    modifier = Modifier.weight(1f),
                )
            }
            QuickActionTile(
                icon = Icons.Filled.Image,
                label = stringResource(R.string.v870_rom_header_cover_label),
                tint = colors.text,
                onClick = onShowCover,
                modifier = Modifier.weight(1f),
            )
        }
    }
}

@Composable
fun RomTechPassportCard(
    rom: Rom,
    onShowCover: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val colors = watermelon
    var isExpanded by remember { mutableStateOf(true) }

    val hasSaveData by produceState<Boolean?>(initialValue = null, rom.uri) {
        value = if (rom.isInstalledDsiWareShortcut) {
            false
        } else {
            withContext(Dispatchers.IO) {
                runCatching {
                    val ep = EntryPointAccessors.fromApplication(
                        context.applicationContext,
                        RomHeaderEntryPoint::class.java,
                    )
                    ep.romSaveFileManager().hasSaveFile(rom) ||
                        ep.saveStatesRepository().getRomQuickSaveStateSlot(rom).exists ||
                        ep.saveStatesRepository().getPeriodicAutoSaveSlot(rom).exists ||
                        ep.saveStatesRepository().getRomSaveStates(rom).any { it.exists }
                }.getOrDefault(false)
            }
        }
    }
    val saveStatusLabel = when (hasSaveData) {
        true -> stringResource(R.string.v870_rom_header_sav_found)
        false -> stringResource(R.string.v870_rom_header_sav_none)
        null -> "..."
    }

    val fileExt = remember(rom.fileName) {
        rom.fileName.substringAfterLast('.', "NDS").uppercase()
    }
    val gameCodeStr = remember(rom.gameCode) {
        rom.gameCode.ifBlank { "NTR-XXXX" }
    }
    val platformStr = remember(rom) { romPlatformLabel(rom) }
    val dateFormat = remember { java.text.SimpleDateFormat("dd.MM.yyyy", java.util.Locale.getDefault()) }
    val lastPlayedStr = remember(rom.lastPlayed) {
        rom.lastPlayed?.let { dateFormat.format(it) } ?: context.getString(R.string.rom_info_never)
    }

    WatermelonCard(modifier = modifier) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { isExpanded = !isExpanded },
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .width(3.dp)
                            .height(14.dp)
                            .clip(RoundedCornerShape(1.5.dp))
                            .background(colors.green),
                    )
                    Text(
                        text = stringResource(R.string.v870_rom_header_passport),
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.4.sp,
                    )
                }
                Text(
                    text = if (isExpanded) "▲" else "▼",
                    color = colors.green,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                )
            }

            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                RomInfoChip(
                    label = stringResource(R.string.rom_info_game_code_label),
                    value = gameCodeStr,
                    modifier = Modifier.weight(1f),
                )
                RomInfoChip(
                    label = stringResource(R.string.v870_rom_header_platform),
                    value = platformStr,
                    modifier = Modifier.weight(1f),
                )
            }

            Spacer(Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                RomInfoChip(
                    label = stringResource(R.string.v870_rom_header_format),
                    value = fileExt,
                    modifier = Modifier.weight(1f),
                )
                RomInfoChip(
                    label = stringResource(R.string.v870_rom_header_sav_status),
                    value = saveStatusLabel,
                    modifier = Modifier.weight(1f),
                )
            }

            if (isExpanded) {
                Spacer(Modifier.height(10.dp))
                WatermelonRowSeparator()
                Spacer(Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    RomInfoChip(
                        label = stringResource(R.string.rom_info_file),
                        value = rom.fileName,
                        maxLines = 2,
                        textAlign = TextAlign.Start,
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.weight(1.35f),
                    )
                    RomInfoChip(
                        label = stringResource(R.string.rom_info_last_played),
                        value = lastPlayedStr,
                        modifier = Modifier.weight(0.85f),
                    )
                }

                Spacer(Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(10.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.green.copy(alpha = 0.45f), RoundedCornerShape(10.dp))
                            .bouncingClickable {
                                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
                                val clip = ClipData.newPlainText("GameCode", "$gameCodeStr (${rom.fileName})")
                                clipboard?.setPrimaryClip(clip)
                                Toast.makeText(
                                    context,
                                    context.getString(R.string.v870_rom_header_gamecode_copied, gameCodeStr),
                                    Toast.LENGTH_SHORT,
                                ).show()
                            }
                            .padding(vertical = 8.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = stringResource(R.string.v870_rom_header_copy_gamecode),
                            color = colors.green,
                            fontFamily = SpaceGrotesk,
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(10.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(10.dp))
                            .bouncingClickable(onClick = onShowCover)
                            .padding(vertical = 8.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = stringResource(R.string.v870_rom_header_view_cover),
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun RomDetailsTabRow(
    currentTab: RomDetailsTab,
    onTabClicked: (RomDetailsTab) -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    Column(modifier = modifier.fillMaxWidth().background(colors.bg)) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 14.dp, vertical = 8.dp),
        ) {
            RomDetailsTab.entries.forEach { tab ->
                val (label, icon) = when (tab) {
                    RomDetailsTab.OVERVIEW -> stringResource(R.string.rom_details_overview_tab) to Icons.Filled.Info
                    RomDetailsTab.CONFIG -> stringResource(R.string.rom_details_configuration_tab) to Icons.Filled.Tune
                    RomDetailsTab.CHEATS -> stringResource(R.string.cheats) to Icons.Filled.SportsEsports
                    RomDetailsTab.RETRO_ACHIEVEMENTS -> stringResource(R.string.retro_achievements_tab) to Icons.Filled.EmojiEvents
                    RomDetailsTab.OFFLINE_ACHIEVEMENTS -> stringResource(R.string.rom_details_offline_achievements_tab) to Icons.Filled.Star
                }
                val selected = tab == currentTab
                val interactionSource = remember { MutableInteractionSource() }
                val isFocused by interactionSource.collectIsFocusedAsState()
                val shape = RoundedCornerShape(10.dp)

                Box(
                    modifier = Modifier
                        .clip(shape)
                        .background(
                            when {
                                selected -> colors.green.copy(alpha = 0.22f)
                                isFocused -> colors.surface2
                                else -> colors.surface.copy(alpha = 0.7f)
                            },
                        )
                        .border(
                            width = if (selected) 1.dp else 0.5.dp,
                            color = when {
                                selected -> colors.green
                                isFocused -> colors.green.copy(alpha = 0.5f)
                                else -> colors.line
                            },
                            shape = shape,
                        )
                        .clickable(interactionSource = interactionSource, indication = null) { onTabClicked(tab) }
                        .padding(horizontal = 12.dp, vertical = 7.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = null,
                            tint = if (selected) colors.green else colors.text3,
                            modifier = Modifier.size(15.dp),
                        )
                        Text(
                            text = label,
                            color = when {
                                selected -> colors.green
                                isFocused -> colors.text
                                else -> colors.text2
                            },
                            fontFamily = SpaceGrotesk,
                            fontSize = 12.sp,
                            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium,
                            maxLines = 1,
                        )
                    }
                }
            }
        }
        Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
    }
}
