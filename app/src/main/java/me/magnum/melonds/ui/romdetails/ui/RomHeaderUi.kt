package me.magnum.melonds.ui.romdetails.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.material.icons.filled.Wifi
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Tune
import androidx.compose.ui.platform.LocalContext

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
            .let { if (isFocused) it.background(colors.green.copy(alpha = 0.6f)) else it }
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
                .let { if (isFocused) it.background(colors.green.copy(alpha = 0.5f)) else it }
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
fun NetplayLobbyButton(
    size: Dp,
    rom: Rom,
    onLaunchRom: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    var dialogOpen by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val colors = watermelon

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

    Box(
        modifier = modifier
            .size(size)
            .clip(RoundedCornerShape(13.dp))
            .background(Color.Black.copy(alpha = 0.3f))
            .let { if (isFocused) it.background(colors.green.copy(alpha = 0.5f)) else it }
            .clickable(interactionSource = interactionSource, indication = null) { dialogOpen = true },
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            imageVector = Icons.Filled.Wifi,
            contentDescription = "Netplay / NiFi",
            tint = colors.green,
            modifier = Modifier.size(22.dp),
        )
    }
}

@Composable
fun RomInfoChip(
    label: String,
    value: String,
    modifier: Modifier = Modifier,
    maxLines: Int = 1,
    textAlign: androidx.compose.ui.text.style.TextAlign = androidx.compose.ui.text.style.TextAlign.Center,
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Black.copy(alpha = 0.38f))
            .padding(horizontal = 8.dp, vertical = 5.dp),
        horizontalAlignment = horizontalAlignment,
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
            fontSize = 9.5.sp,
            lineHeight = 11.5.sp,
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
    initialsSize: androidx.compose.ui.unit.TextUnit,
    onClick: (() -> Unit)? = null,
) {
    val context = androidx.compose.ui.platform.LocalContext.current
    Box(
        modifier = Modifier
            .width(width)
            .aspectRatio(DsBoxArtAspectRatio)
            .shadow(10.dp, RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
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

    Box(
        modifier = modifier
            .height(44.dp)
            .clip(shape)
            .background(Color.Black.copy(alpha = 0.35f))
            .let { if (isFocused) it.border(1.5.dp, colors.green, shape) else it.border(1.dp, Color.White.copy(alpha = 0.12f), shape) }
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 8.dp),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Icon(imageVector = icon, contentDescription = null, tint = tint, modifier = Modifier.size(17.dp))
            Spacer(Modifier.width(6.dp))
            Text(
                text = label,
                color = Color.White,
                fontFamily = SpaceGrotesk,
                fontSize = 11.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
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
    val isRu = remember { java.util.Locale.getDefault().language.startsWith("ru") }
    var isExpanded by remember { mutableStateOf(false) }

    val fileExt = remember(rom.fileName) {
        rom.fileName.substringAfterLast('.', "NDS").uppercase()
    }
    val gameCodeStr = remember(rom.gameCode) {
        rom.gameCode.ifBlank { "NTR-XXXX" }
    }
    val platformStr = remember(rom) { romPlatformLabel(rom) }

    Column(
        modifier = modifier
            .fillMaxWidth(0.94f)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.Black.copy(alpha = 0.35f))
            .border(1.dp, Color.White.copy(alpha = 0.12f), RoundedCornerShape(12.dp))
            .padding(10.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { isExpanded = !isExpanded },
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                Box(
                    modifier = Modifier
                        .width(3.dp)
                        .height(12.dp)
                        .clip(RoundedCornerShape(1.5.dp))
                        .background(colors.green),
                )
                Text(
                    text = if (isRu) "ТЕХНИЧЕСКИЙ ПАСПОРТ И СТАТУС" else "TECHNICAL SPECS AND STATUS",
                    color = Color.White.copy(alpha = 0.9f),
                    fontFamily = SpaceGrotesk,
                    fontSize = 10.5.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.6.sp,
                )
            }
            Text(
                text = if (isExpanded) "▲" else "▼",
                color = colors.green,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        // 4 Specs Badges Row
        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
        ) {
            RomInfoChip(
                label = "GAME CODE",
                value = gameCodeStr,
                modifier = Modifier.weight(1f),
            )
            RomInfoChip(
                label = if (isRu) "ПЛАТФОРМА" else "PLATFORM",
                value = platformStr,
                modifier = Modifier.weight(1f),
            )
            RomInfoChip(
                label = if (isRu) "ФОРМАТ" else "FORMAT",
                value = fileExt,
                modifier = Modifier.weight(0.8f),
            )
            RomInfoChip(
                label = if (isRu) "СТАТУС .SAV" else "SAVE STATUS",
                value = if (isRu) "АКТИВЕН" else "READY",
                modifier = Modifier.weight(1f),
            )
        }

        if (isExpanded) {
            Spacer(Modifier.height(10.dp))
            Box(Modifier.fillMaxWidth().height(1.dp).background(Color.White.copy(alpha = 0.1f)))
            Spacer(Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                // Button to copy GameCode / info
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.Black.copy(alpha = 0.4f))
                        .border(1.dp, colors.green.copy(alpha = 0.4f), RoundedCornerShape(8.dp))
                        .clickable {
                            val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
                            val clip = ClipData.newPlainText("GameCode", "$gameCodeStr (${rom.fileName})")
                            clipboard?.setPrimaryClip(clip)
                            Toast.makeText(context, if (isRu) "GameCode $gameCodeStr скопирован!" else "GameCode copied!", Toast.LENGTH_SHORT).show()
                        }
                        .padding(vertical = 6.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = if (isRu) "Скопировать GameCode" else "Copy GameCode",
                        color = colors.green,
                        fontFamily = SpaceGrotesk,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }

                // Button to open full cover preview
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.Black.copy(alpha = 0.4f))
                        .border(1.dp, Color.White.copy(alpha = 0.2f), RoundedCornerShape(8.dp))
                        .clickable(onClick = onShowCover)
                        .padding(vertical = 6.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = if (isRu) "Открыть обложку" else "View Cover",
                        color = Color.White,
                        fontFamily = SpaceGrotesk,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }
            }
        }
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
    var showFullScreenCover by remember { mutableStateOf(false) }

    if (showFullScreenCover) {
        FullScreenCoverDialog(
            rom = rom,
            boxArtUrl = boxArtUrl,
            onDismiss = { showFullScreenCover = false }
        )
    }

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

            // 2. ROM Icon / Cover Art strictly centered with click to enlarge
            HeroCover(
                rom = rom,
                boxArtUrl = boxArtUrl,
                raCoverUrl = raCoverUrl,
                width = 126.dp,
                initialsSize = 36.sp,
                onClick = { showFullScreenCover = true }
            )

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

            // Technical Passport & Save Status Card
            RomTechPassportCard(
                rom = rom,
                onShowCover = { showFullScreenCover = true },
            )

            Spacer(Modifier.height(10.dp))

            // Balanced 2-Row Action Deck
            // Row 1: Primary Hero Play Button
            PlayButton(
                height = 48.dp,
                onClick = onLaunchRom,
                focusRequester = initialFocusRequester,
                modifier = Modifier.fillMaxWidth(0.94f),
            )

            Spacer(Modifier.height(8.dp))

            // Row 2: Structured Quick Action Tiles
            val isRu = remember { java.util.Locale.getDefault().language.startsWith("ru") }
            Row(
                modifier = Modifier.fillMaxWidth(0.94f),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                NetplayLobbyButton(size = 44.dp, rom = rom, onLaunchRom = onLaunchRom, modifier = Modifier.weight(1f))
                SaveActionsButton(size = 44.dp, onSendSaveFile = onSendSaveFile, onImportSaveFile = onImportSaveFile, modifier = Modifier.weight(1f))
                QuickActionTile(
                    icon = Icons.Filled.Image,
                    label = if (isRu) "Обложка" else "Cover",
                    tint = Color.White,
                    onClick = { showFullScreenCover = true },
                    modifier = Modifier.weight(1.2f),
                )
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
    var showFullScreenCover by remember { mutableStateOf(false) }

    if (showFullScreenCover) {
        FullScreenCoverDialog(
            rom = rom,
            boxArtUrl = boxArtUrl,
            onDismiss = { showFullScreenCover = false }
        )
    }

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
                HeroCover(
                    rom = rom,
                    boxArtUrl = boxArtUrl,
                    raCoverUrl = raCoverUrl,
                    width = 84.dp,
                    initialsSize = 22.sp,
                    onClick = { showFullScreenCover = true }
                )
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

                Spacer(Modifier.height(6.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    RomInfoChip(
                        label = stringResource(R.string.rom_info_file),
                        value = rom.fileName,
                        maxLines = 3,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Start,
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.weight(1.3f),
                    )
                    RomInfoChip(
                        label = stringResource(R.string.rom_info_last_played),
                        value = lastPlayedStr,
                        modifier = Modifier.weight(0.9f),
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                PlayButton(
                    height = 50.dp,
                    onClick = onLaunchRom,
                    focusRequester = initialFocusRequester,
                    modifier = Modifier.weight(1f),
                )
                NetplayLobbyButton(size = 50.dp, rom = rom, onLaunchRom = onLaunchRom)
                SaveActionsButton(size = 50.dp, onSendSaveFile = onSendSaveFile, onImportSaveFile = onImportSaveFile)
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
    val isRu = remember { java.util.Locale.getDefault().language.startsWith("ru") }
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
                                else -> colors.surface.copy(alpha = 0.6f)
                            }
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
