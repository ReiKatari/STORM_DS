package me.magnum.melonds.ui.romdetails.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Save
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romdetails.model.RomDetailsTab
import me.magnum.melonds.ui.romlist.composables.RegionBadge
import me.magnum.melonds.ui.romlist.composables.resolveRomRegionBadge
import me.magnum.melonds.ui.romlist.composables.DsBoxArtAspectRatio
import me.magnum.melonds.ui.romlist.composables.RomMiniIcon
import me.magnum.melonds.ui.romlist.composables.ScanlinesOverlay
import me.magnum.melonds.ui.romlist.composables.formatHoursLabel
import me.magnum.melonds.ui.romlist.composables.romIconRequest
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import me.magnum.melonds.ui.romlist.composables.romGradient
import me.magnum.melonds.ui.romlist.composables.romInitials
import me.magnum.melonds.ui.romlist.composables.romPlatformLabel
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import kotlin.time.Duration

@Composable
fun HeroCircleButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    contentDescription: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val colors = watermelon
    Box(
        modifier = modifier
            .size(38.dp)
            .clip(CircleShape)
            .background(Color.Black.copy(alpha = 0.28f))
            .let { if (isFocused) it.background(colors.red.copy(alpha = 0.6f)) else it }
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Icon(icon, contentDescription = contentDescription, tint = Color.White, modifier = Modifier.size(20.dp))
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
    size: Dp,
    onSendSaveFile: () -> Unit,
    onImportSaveFile: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var menuOpen by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val colors = watermelon
    Box(modifier = modifier) {
        Box(
            modifier = Modifier
                .size(size)
                .clip(RoundedCornerShape(13.dp))
                .background(Color.Black.copy(alpha = 0.3f))
                .let { if (isFocused) it.background(colors.red.copy(alpha = 0.5f)) else it }
                .clickable(interactionSource = interactionSource, indication = null) { menuOpen = true },
            contentAlignment = Alignment.Center,
        ) {
            Icon(Icons.Filled.Save, contentDescription = null, tint = Color.White, modifier = Modifier.size(20.dp))
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
fun RomInfoChip(
    label: String,
    value: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Black.copy(alpha = 0.38f))
            .padding(horizontal = 8.dp, vertical = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = label.uppercase(),
            color = Color.White.copy(alpha = 0.50f),
            fontFamily = WatermelonMono,
            fontSize = 8.5.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.4.sp,
            maxLines = 1,
        )
        Spacer(Modifier.height(1.dp))
        Text(
            text = value,
            color = Color.White.copy(alpha = 0.95f),
            fontFamily = WatermelonMono,
            fontSize = 10.5.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
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
    initialsSize: androidx.compose.ui.unit.TextUnit,
) {
    val context = androidx.compose.ui.platform.LocalContext.current
    Box(
        modifier = Modifier
            .width(width)
            .aspectRatio(DsBoxArtAspectRatio)
            .shadow(10.dp, RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
            .background(romGradient(romDisplayName(rom))),
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
    val colors = watermelon
    val context = androidx.compose.ui.platform.LocalContext.current
    Box(modifier = modifier) {
        if (boxArtUrl != null) {
            AsyncImage(
                model = boxArtUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.75f,
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
                    alpha = 0.35f,
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }
        Box(
            Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color.Black.copy(alpha = 0.55f), colors.bg),
                    ),
                ),
        )
    }
}

@Composable
fun RomHeroVertical(
    rom: Rom,
    boxArtUrl: String?,
    raCoverUrl: String?,
    initialFocusRequester: FocusRequester?,
    onLaunchRom: () -> Unit,
    onNavigateBack: () -> Unit,
    onSendSaveFile: () -> Unit,
    onImportSaveFile: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier.fillMaxWidth()) {
        HeroBackdrop(rom = rom, boxArtUrl = boxArtUrl, modifier = Modifier.matchParentSize())

        // Top Back Button Overlay
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 16.dp, top = 14.dp),
        ) {
            HeroCircleButton(Icons.AutoMirrored.Filled.ArrowBack, null, onNavigateBack)
        }

        Column(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(4.dp))

            // 1. System Badge centered on top of icon
            Box(
                Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .background(Color.Black.copy(alpha = 0.50f))
                    .padding(horizontal = 10.dp, vertical = 3.5.dp),
            ) {
                Text(
                    text = romPlatformLabel(rom),
                    color = Color.White,
                    fontFamily = WatermelonMono,
                    fontSize = 10.sp,
                    lineHeight = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.8.sp,
                )
            }

            Spacer(Modifier.height(10.dp))

            // 2. ROM Icon / Cover Art strictly centered
            HeroCover(rom, boxArtUrl, raCoverUrl, width = 126.dp, initialsSize = 36.sp)

            Spacer(Modifier.height(12.dp))

            // 3. Game title centered below icon (up to 3 lines)
            Text(
                text = romDisplayName(rom),
                color = Color.White,
                fontFamily = SpaceGrotesk,
                fontSize = 20.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.fillMaxWidth(0.92f),
            )

            // 4. Developer name centered
            if (rom.developerName.isNotBlank()) {
                Text(
                    text = rom.developerName,
                    color = Color.White.copy(alpha = 0.75f),
                    fontFamily = me.magnum.melonds.ui.theme.Manrope,
                    fontSize = 12.sp,
                    maxLines = 1,
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 3.dp),
                )
            }

            Spacer(Modifier.height(8.dp))

            // 5. Region Flag Badge & Play Time centered under title
            val regionBadge = resolveRomRegionBadge(rom)
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth(),
            ) {
                if (regionBadge != null) {
                    RegionBadge(
                        flag = regionBadge.first,
                        code = regionBadge.second,
                        modifier = Modifier.padding(end = 8.dp),
                    )
                }
                if (rom.totalPlayTime != Duration.ZERO) {
                    Text(
                        text = stringResource(R.string.rom_total_play_time_format, formatHoursLabel(rom.totalPlayTime)),
                        color = Color.White.copy(alpha = 0.85f),
                        fontFamily = WatermelonMono,
                        fontSize = 11.sp,
                    )
                }
            }

            Spacer(Modifier.height(10.dp))

            // Game metadata chips row (Filename, Last Played, RetroAchievements Hash)
            val dateFormat = remember { java.text.SimpleDateFormat("dd.MM.yyyy", java.util.Locale.getDefault()) }
            val lastPlayedStr = rom.lastPlayed?.let { dateFormat.format(it) } ?: stringResource(R.string.rom_info_never)
            val hashStr = if (rom.retroAchievementsHash.isNotBlank()) rom.retroAchievementsHash.take(8).uppercase() else "NTR-ROM"

            Row(
                modifier = Modifier.fillMaxWidth(0.94f),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                RomInfoChip(
                    label = stringResource(R.string.rom_info_file),
                    value = rom.fileName,
                    modifier = Modifier.weight(1.1f),
                )
                RomInfoChip(
                    label = stringResource(R.string.rom_info_last_played),
                    value = lastPlayedStr,
                    modifier = Modifier.weight(0.95f),
                )
                RomInfoChip(
                    label = "ID / HASH",
                    value = hashStr,
                    modifier = Modifier.weight(0.85f),
                )
            }

            Spacer(Modifier.height(12.dp))

            // 6. Action buttons centered
            Row(
                Modifier.fillMaxWidth(0.92f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                PlayButton(
                    height = 50.dp,
                    onClick = onLaunchRom,
                    focusRequester = initialFocusRequester,
                    modifier = Modifier.weight(1f),
                )
                Spacer(Modifier.width(9.dp))
                SaveActionsButton(size = 50.dp, onSendSaveFile = onSendSaveFile, onImportSaveFile = onImportSaveFile)
            }
        }
    }
}

@Composable
fun RomHeroSidePanel(
    rom: Rom,
    boxArtUrl: String?,
    raCoverUrl: String?,
    initialFocusRequester: FocusRequester,
    onLaunchRom: () -> Unit,
    onNavigateBack: () -> Unit,
    onSendSaveFile: () -> Unit,
    onImportSaveFile: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier.width(252.dp).fillMaxHeight()) {
        HeroBackdrop(rom = rom, boxArtUrl = boxArtUrl, modifier = Modifier.matchParentSize())
        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            HeroCircleButton(Icons.AutoMirrored.Filled.ArrowBack, null, onNavigateBack)
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(
                    Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.Black.copy(alpha = 0.45f))
                        .padding(horizontal = 8.dp, vertical = 3.dp),
                ) {
                    Text(
                        text = romPlatformLabel(rom),
                        color = Color.White,
                        fontFamily = WatermelonMono,
                        fontSize = 9.sp,
                        lineHeight = 9.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
                Spacer(Modifier.height(8.dp))
                HeroCover(rom, boxArtUrl, raCoverUrl, width = 84.dp, initialsSize = 22.sp)
                Spacer(Modifier.height(8.dp))
                Text(
                    text = romDisplayName(rom),
                    color = Color.White,
                    fontFamily = SpaceGrotesk,
                    fontSize = 16.sp,
                    lineHeight = 19.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                )
                if (rom.developerName.isNotBlank()) {
                    Text(
                        text = rom.developerName,
                        color = Color.White.copy(alpha = 0.75f),
                        fontSize = 11.sp,
                        maxLines = 1,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(top = 2.dp),
                    )
                }
                val regionBadge = resolveRomRegionBadge(rom)
                if (regionBadge != null) {
                    Spacer(Modifier.height(6.dp))
                    RegionBadge(flag = regionBadge.first, code = regionBadge.second)
                }
                if (rom.totalPlayTime != Duration.ZERO) {
                    Text(
                        text = stringResource(R.string.rom_total_play_time_format, formatHoursLabel(rom.totalPlayTime)),
                        color = Color.White.copy(alpha = 0.75f),
                        fontFamily = WatermelonMono,
                        fontSize = 10.5.sp,
                        modifier = Modifier.padding(top = 6.dp),
                    )
                }
                val dateFormat = remember { java.text.SimpleDateFormat("dd.MM.yyyy", java.util.Locale.getDefault()) }
                val lastPlayedStr = rom.lastPlayed?.let { dateFormat.format(it) } ?: stringResource(R.string.rom_info_never)
                val hashStr = if (rom.retroAchievementsHash.isNotBlank()) rom.retroAchievementsHash.take(8).uppercase() else "NTR-ROM"

                Spacer(Modifier.height(6.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    RomInfoChip(
                        label = stringResource(R.string.rom_info_last_played),
                        value = lastPlayedStr,
                        modifier = Modifier.weight(1f),
                    )
                    RomInfoChip(
                        label = "HASH",
                        value = hashStr,
                        modifier = Modifier.weight(1f),
                    )
                }
            }
            Row {
                PlayButton(
                    height = 42.dp,
                    onClick = onLaunchRom,
                    focusRequester = initialFocusRequester,
                    modifier = Modifier.weight(1f),
                )
                Spacer(Modifier.width(9.dp))
                SaveActionsButton(size = 42.dp, onSendSaveFile = onSendSaveFile, onImportSaveFile = onImportSaveFile)
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
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier.padding(horizontal = 20.dp),
        ) {
            RomDetailsTab.entries.forEach { tab ->
                val label = when (tab) {
                    RomDetailsTab.CONFIG -> stringResource(R.string.rom_details_configuration_tab)
                    RomDetailsTab.RETRO_ACHIEVEMENTS -> stringResource(R.string.retro_achievements_tab)
                    RomDetailsTab.OFFLINE_ACHIEVEMENTS -> stringResource(R.string.rom_details_offline_achievements_tab)
                }
                val selected = tab == currentTab
                val interactionSource = remember { MutableInteractionSource() }
                val isFocused by interactionSource.collectIsFocusedAsState()
                Column(
                    modifier = Modifier
                        .width(IntrinsicSize.Max)
                        .clickable(interactionSource = interactionSource, indication = null) { onTabClicked(tab) },
                ) {
                    Text(
                        text = label.uppercase(),
                        color = when {
                            isFocused -> colors.red
                            selected -> colors.text
                            else -> colors.text3
                        },
                        fontFamily = WatermelonMono,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold,
                        letterSpacing = 0.7.sp,
                        maxLines = 1,
                        softWrap = false,
                        modifier = Modifier.padding(top = 12.dp, bottom = 10.dp),
                    )
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(2.dp)
                            .background(if (selected) colors.green else Color.Transparent),
                    )
                }
            }
        }
        Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
    }
}
