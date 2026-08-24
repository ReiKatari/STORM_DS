package me.magnum.melonds.ui.romlist.composables

import android.text.format.DateUtils
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.ui.text.style.TextAlign
import me.magnum.melonds.ui.theme.WatermelonColors
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material.icons.filled.ViewList
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.RomFilter
import me.magnum.melonds.domain.model.RomViewMode
import me.magnum.melonds.domain.model.SortingMode
import me.magnum.melonds.domain.model.SortingOrder
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.common.WatermelonMark
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import kotlin.time.Duration

@Composable
fun WatermelonLibraryHeader(
    isSearchActive: Boolean,
    searchQuery: String,
    viewMode: RomViewMode,
    dsiWareBootMode: me.magnum.melonds.domain.model.dsinand.DSiWareBootMode = me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.AUTOLOAD,
    onDsiWareBootModeChanged: (me.magnum.melonds.domain.model.dsinand.DSiWareBootMode) -> Unit = {},
    onSearchQueryChanged: (String?) -> Unit,
    onToggleViewMode: () -> Unit,
    onBootFirmwareDs: () -> Unit,
    onBootFirmwareDsi: () -> Unit,
    onOpenDsiWareManager: () -> Unit,
    onOpenSingleRom: () -> Unit = {},
    onRefresh: () -> Unit,
    onOpenSettings: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    var searchOpen by remember { mutableStateOf(isSearchActive) }
    var overflowOpen by remember { mutableStateOf(false) }
    var bootModeMenuOpen by remember { mutableStateOf(false) }
    val searchFocusRequester = remember { FocusRequester() }

    Column(modifier = modifier.fillMaxWidth().background(colors.bg)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(start = 14.dp, end = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (searchOpen) {
                IconButton(
                    onClick = {
                        searchOpen = false
                        onSearchQueryChanged(null)
                    },
                    modifier = Modifier.size(38.dp),
                ) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, tint = colors.text2, modifier = Modifier.size(20.dp))
                }
                BasicTextField(
                    value = searchQuery,
                    onValueChange = { onSearchQueryChanged(it) },
                    singleLine = true,
                    keyboardOptions = androidx.compose.foundation.text.KeyboardOptions(imeAction = androidx.compose.ui.text.input.ImeAction.Search),
                    textStyle = TextStyle(color = colors.text, fontSize = 15.sp),
                    cursorBrush = SolidColor(colors.red),
                    decorationBox = { innerTextField ->
                        Box {
                            if (searchQuery.isEmpty()) {
                                Text(
                                    text = stringResource(R.string.hint_search_roms),
                                    color = colors.text3,
                                    fontSize = 15.sp,
                                )
                            }
                            innerTextField()
                        }
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 6.dp)
                        .focusRequester(searchFocusRequester),
                )
                LaunchedEffect(Unit) {
                    runCatching { searchFocusRequester.requestFocus() }
                }
                IconButton(
                    onClick = { onSearchQueryChanged("") },
                    modifier = Modifier.size(38.dp),
                ) {
                    Icon(Icons.Filled.Close, contentDescription = null, tint = colors.text2, modifier = Modifier.size(18.dp))
                }
            } else {
                Row(
                    modifier = Modifier.weight(1f, fill = false),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    WatermelonMark(height = 22.dp)
                    Spacer(Modifier.width(7.dp))
                    Text(
                        text = "STORM ",
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = (-0.3).sp,
                        maxLines = 1,
                    )
                    Text(
                        text = "DS",
                        color = Color(0xFF00E5FF),
                        fontFamily = SpaceGrotesk,
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = (-0.3).sp,
                        maxLines = 1,
                    )
                }

                Spacer(Modifier.weight(1f))

                // Styled DSiWare Boot Mode Quick Switcher
                Box(modifier = Modifier.padding(end = 2.dp)) {
                    val (modeIcon, modeLabel, modeColor) = when (dsiWareBootMode) {
                        me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.AUTOLOAD -> Triple("🚀", "Auto", Color(0xFF00E5FF))
                        me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.DIRECT -> Triple("⚡", "Direct", Color(0xFFFFAB00))
                        me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.SYSTEM_MENU -> Triple("🎮", "NAND", Color(0xFFE040FB))
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(colors.surface2)
                            .border(1.dp, modeColor.copy(alpha = 0.5f), RoundedCornerShape(6.dp))
                            .clickable { bootModeMenuOpen = true }
                            .padding(horizontal = 6.dp, vertical = 4.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = modeIcon, fontSize = 10.5.sp)
                            Spacer(Modifier.width(3.dp))
                            Text(
                                text = modeLabel,
                                color = modeColor,
                                fontFamily = WatermelonMono,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                    DropdownMenu(
                        expanded = bootModeMenuOpen,
                        onDismissRequest = { bootModeMenuOpen = false },
                    ) {
                        DropdownMenuItem(
                            onClick = {
                                bootModeMenuOpen = false
                                onDsiWareBootModeChanged(me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.DIRECT)
                            }
                        ) {
                            Column {
                                Text("⚡ Direct Boot (Прямой старт)", color = colors.text, fontWeight = FontWeight.Bold, fontSize = 13.5.sp)
                                Text("Быстрый старт игры напрямую в память RAM", color = colors.text3, fontSize = 11.sp)
                            }
                        }
                        DropdownMenuItem(
                            onClick = {
                                bootModeMenuOpen = false
                                onDsiWareBootModeChanged(me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.AUTOLOAD)
                            }
                        ) {
                            Column {
                                Text("🚀 Autoload (Запуск через прошивку)", color = colors.text, fontWeight = FontWeight.Bold, fontSize = 13.5.sp)
                                Text("Запуск через DSi Firmware warmboot (как в RetroArch)", color = colors.text3, fontSize = 11.sp)
                            }
                        }
                        DropdownMenuItem(
                            onClick = {
                                bootModeMenuOpen = false
                                onDsiWareBootModeChanged(me.magnum.melonds.domain.model.dsinand.DSiWareBootMode.SYSTEM_MENU)
                            }
                        ) {
                            Column {
                                Text("🎮 NAND Launcher (Меню DSi)", color = colors.text, fontWeight = FontWeight.Bold, fontSize = 13.5.sp)
                                Text("Полный запуск в официальное меню DSi", color = colors.text3, fontSize = 11.sp)
                            }
                        }
                    }
                }

                IconButton(onClick = { searchOpen = true; onSearchQueryChanged("") }, modifier = Modifier.size(36.dp)) {
                    Icon(Icons.Filled.Search, contentDescription = stringResource(R.string.action_search_roms), tint = colors.text2, modifier = Modifier.size(19.dp))
                }
                IconButton(onClick = onToggleViewMode, modifier = Modifier.size(36.dp)) {
                    Icon(
                        imageVector = if (viewMode == RomViewMode.GRID) Icons.Filled.ViewList else Icons.Filled.GridView,
                        contentDescription = stringResource(R.string.rom_view_toggle),
                        tint = colors.text2,
                        modifier = Modifier.size(19.dp),
                    )
                }
                Box {
                    IconButton(onClick = { overflowOpen = true }, modifier = Modifier.size(36.dp)) {
                        Icon(Icons.Filled.MoreVert, contentDescription = null, tint = colors.text2, modifier = Modifier.size(19.dp))
                    }
                    DropdownMenu(expanded = overflowOpen, onDismissRequest = { overflowOpen = false }) {
                        DropdownMenuItem(onClick = { overflowOpen = false; onOpenSingleRom() }) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Filled.Folder, contentDescription = null, tint = colors.red, modifier = Modifier.size(18.dp))
                                Spacer(Modifier.width(8.dp))
                                Text(stringResource(R.string.action_open_single_rom))
                            }
                        }
                        DropdownMenuItem(onClick = { overflowOpen = false; onBootFirmwareDs() }) {
                            Text(stringResource(R.string.action_boot_firmware_ds))
                        }
                        DropdownMenuItem(onClick = { overflowOpen = false; onBootFirmwareDsi() }) {
                            Text(stringResource(R.string.action_boot_firmware_dsi))
                        }
                        DropdownMenuItem(onClick = { overflowOpen = false; onOpenDsiWareManager() }) {
                            Text(stringResource(R.string.dsiware_manager))
                        }
                        DropdownMenuItem(onClick = { overflowOpen = false; onRefresh() }) {
                            Text(stringResource(R.string.action_refresh_rom_list))
                        }
                    }
                }
                IconButton(onClick = onOpenSettings, modifier = Modifier.size(36.dp)) {
                    Icon(Icons.Filled.Tune, contentDescription = stringResource(R.string.settings), tint = colors.text2, modifier = Modifier.size(19.dp))
                }
            }
        }
        Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
    }
}

@Composable
fun WatermelonChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    selectedBg: Color = watermelon.red,
    fontSize: androidx.compose.ui.unit.TextUnit = 10.5.sp,
    cornerRadius: androidx.compose.ui.unit.Dp = 20.dp,
    horizontalPadding: androidx.compose.ui.unit.Dp = 13.dp,
    verticalPadding: androidx.compose.ui.unit.Dp = 7.dp,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(cornerRadius)
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    Box(
        modifier = modifier
            .clip(shape)
            .background(if (selected) selectedBg else if (colors.isDark) colors.surface2 else colors.surface3)
            .let { if (isFocused) it.border(1.dp, colors.red, shape) else it }
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick),
    ) {
        Text(
            text = label,
            color = if (selected) Color.White else colors.text2,
            fontFamily = SpaceGrotesk,
            fontSize = fontSize,
            lineHeight = fontSize,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.5.sp,
            modifier = Modifier.padding(horizontal = horizontalPadding, vertical = verticalPadding),
        )
    }
}

@Composable
fun FilterChipsRow(
    selected: RomFilter,
    onFilterSelected: (RomFilter) -> Unit,
    modifier: Modifier = Modifier,
) {
    val items = listOf(
        RomFilter.ALL to R.string.rom_filter_all,
        RomFilter.FAVORITES to R.string.rom_filter_favorites,
        RomFilter.DS_ONLY to R.string.rom_filter_ds,
        RomFilter.DSI_ENHANCED_ONLY to R.string.rom_filter_dsi_enhanced,
        RomFilter.DSIWARE_ONLY to R.string.rom_filter_dsiware,
        RomFilter.WITH_RETRO_ACHIEVEMENTS to R.string.rom_filter_retro_achievements,
    )
    val accentColor = Color(me.magnum.melonds.ui.theme.AppThemeManager.getAccentColor())
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 6.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(items) { (filter, label) ->
            val titleText = stringResource(label)
            val displayText = when (filter) {
                RomFilter.ALL -> "🎮 $titleText"
                RomFilter.FAVORITES -> "★ $titleText"
                RomFilter.DS_ONLY -> "🎮 Nintendo DS"
                RomFilter.DSI_ENHANCED_ONLY -> "⚡ Nintendo DSi Enhanced"
                RomFilter.DSIWARE_ONLY -> "🕹️ Nintendo DSiWare"
                RomFilter.WITH_RETRO_ACHIEVEMENTS -> "🏆 RA"
            }
            WatermelonChip(
                label = displayText,
                selected = filter == selected,
                selectedBg = accentColor,
                onClick = { onFilterSelected(filter) },
            )
        }
    }
}

@Composable
fun LibrarySectionHeader(
    title: String,
    inFolder: Boolean,
    sortingMode: SortingMode,
    sortingOrder: SortingOrder,
    gamesCount: Int,
    onNavigateUp: () -> Unit,
    onSortSelected: (SortingMode) -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 18.dp, bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (inFolder) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .clickable(onClick = onNavigateUp),
            ) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(R.string.rom_browser_navigate_up), tint = colors.text2, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(3.dp))
                Icon(Icons.Filled.Folder, contentDescription = null, tint = colors.green, modifier = Modifier.size(17.dp))
                Spacer(Modifier.width(6.dp))
                Text(
                    text = title,
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        } else {
            Text(
                text = title,
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
        Spacer(Modifier.weight(1f))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.weight(2f, fill = false),
        ) {
            items(
                listOf(
                    SortingMode.ALPHABETICALLY to "A-Z",
                    SortingMode.RECENTLY_PLAYED to null,
                    SortingMode.MOST_PLAYED to null,
                ),
            ) { (mode, literal) ->
                val base = literal ?: when (mode) {
                    SortingMode.RECENTLY_PLAYED -> stringResource(R.string.rom_sort_recent_chip)
                    SortingMode.MOST_PLAYED -> stringResource(R.string.rom_sort_most_played_chip)
                    else -> ""
                }
                val active = sortingMode == mode
                val arrow = if (active) {
                    if (sortingOrder == SortingOrder.ASCENDING) " ↑" else " ↓"
                } else {
                    ""
                }
                WatermelonChip(
                    label = base.uppercase() + arrow,
                    selected = active,
                    selectedBg = watermelon.green,
                    onClick = { onSortSelected(mode) },
                    fontSize = 8.5.sp,
                    cornerRadius = 12.dp,
                    horizontalPadding = 9.dp,
                    verticalPadding = 4.dp,
                )
            }
        }
        Spacer(Modifier.width(8.dp))
        Text(
            text = stringResource(R.string.rom_games_count, gamesCount),
            color = colors.text3,
            fontFamily = WatermelonMono,
            fontSize = 10.5.sp,
            maxLines = 1,
        )
    }
}

@Composable
fun ContinuePlayingShelf(
    roms: List<Rom>,
    coverByHash: Map<String, String>,
    boxArtByUri: Map<String, String> = emptyMap(),
    onRomClicked: (Rom) -> Unit,
    onRomLongPressed: (Rom) -> Unit,
    modifier: Modifier = Modifier,
    horizontalPadding: androidx.compose.ui.unit.Dp = 16.dp,
    onRomFocused: (Rom) -> Unit = {},
    onRomVisible: (Rom) -> Unit = {},
) {
    if (roms.isEmpty()) return
    val context = androidx.compose.ui.platform.LocalContext.current
    val prefs = remember { androidx.preference.PreferenceManager.getDefaultSharedPreferences(context) }
    var isCollapsed by remember { mutableStateOf(prefs.getBoolean("continue_playing_shelf_collapsed", false)) }
    val colors = watermelon

    Column(modifier = modifier.padding(top = 14.dp, bottom = 4.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .clickable {
                    val next = !isCollapsed
                    isCollapsed = next
                    prefs.edit().putBoolean("continue_playing_shelf_collapsed", next).apply()
                }
                .padding(start = horizontalPadding, end = horizontalPadding, top = 4.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = stringResource(R.string.rom_continue_playing),
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 15.5.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                Spacer(Modifier.width(6.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(colors.surface2)
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = roms.size.toString(),
                        color = colors.text3,
                        fontSize = 11.sp,
                        fontFamily = WatermelonMono,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
            Text(
                text = if (isCollapsed) "▼" else "▲",
                color = colors.text3,
                fontSize = 11.sp,
                fontFamily = WatermelonMono,
                fontWeight = FontWeight.Bold,
            )
        }
        androidx.compose.animation.AnimatedVisibility(
            visible = !isCollapsed,
            enter = androidx.compose.animation.expandVertically() + androidx.compose.animation.fadeIn(),
            exit = androidx.compose.animation.shrinkVertically() + androidx.compose.animation.fadeOut(),
        ) {
            LazyRow(
                contentPadding = PaddingValues(horizontal = horizontalPadding),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                items(roms, key = { it.uri.toString() }) { rom ->
                    LaunchedEffect(rom.uri) {
                        onRomVisible(rom)
                    }
                    ContinuePlayingCard(
                        rom = rom,
                        coverUrl = coverByHash[rom.retroAchievementsHash],
                        boxArtUrl = boxArtByUri[rom.uri.toString()]?.takeIf { it.isNotEmpty() },
                        boxArtLoading = boxArtByUri[rom.uri.toString()] == null,
                        onClick = { onRomClicked(rom) },
                        onLongPress = { onRomLongPressed(rom) },
                        onFocused = onRomFocused,
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun ContinuePlayingCard(
    rom: Rom,
    coverUrl: String?,
    boxArtUrl: String?,
    boxArtLoading: Boolean = false,
    onClick: () -> Unit,
    onLongPress: () -> Unit,
    onFocused: (Rom) -> Unit = {},
) {
    val colors = watermelon
    val shape = RoundedCornerShape(8.dp)
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val isPressed by interactionSource.collectIsPressedAsState()
    androidx.compose.runtime.LaunchedEffect(isFocused) {
        if (isFocused) onFocused(rom)
    }
    val pressScale by androidx.compose.animation.core.animateFloatAsState(
        targetValue = if (isPressed) 0.95f else 1f,
        animationSpec = androidx.compose.animation.core.spring(
            dampingRatio = androidx.compose.animation.core.Spring.DampingRatioNoBouncy,
            stiffness = 4000f,
        ),
        label = "press",
    )

    Column(
        modifier = Modifier
            .width(116.dp)
            .scale(pressScale)
            .combinedClickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick,
                onLongClick = onLongPress,
            ),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(DsBoxArtAspectRatio)
                .shadow(6.dp, shape)
                .clip(shape)
                .then(if (isFocused) Modifier.border(3.dp, colors.red, shape) else Modifier),
        ) {
            WatermelonRomArt(
                rom = rom,
                boxArtUrl = boxArtUrl,
                raCoverUrl = coverUrl,
                initialsFontSize = 26.sp,
                boxArtLoading = boxArtLoading,
                modifier = Modifier.fillMaxWidth().aspectRatio(DsBoxArtAspectRatio),
            )
            PlatformBadge(
                text = romPlatformLabel(rom),
                fontSize = 8.sp,
                modifier = Modifier.align(Alignment.TopStart).padding(start = 6.dp, top = 6.dp),
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .fillMaxWidth()
                    .background(Brush.verticalGradient(listOf(Color.Transparent, Color.Black.copy(alpha = 0.72f))))
                    .padding(start = 8.dp, end = 8.dp, top = 9.dp, bottom = 7.dp),
            ) {
                Text(
                    text = romDisplayName(rom),
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.5.sp,
                    lineHeight = 12.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(end = 6.dp, bottom = 7.dp)
                    .size(22.dp)
                    .clip(CircleShape)
                    .background(Color.Black.copy(alpha = 0.4f))
                    .border(1.dp, Color.White.copy(alpha = 0.25f), CircleShape),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = Icons.Filled.PlayArrow,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(12.dp),
                )
            }
        }
        val lastPlayedLabel = rom.lastPlayed?.let {
            DateUtils.getRelativeTimeSpanString(it.time, System.currentTimeMillis(), DateUtils.MINUTE_IN_MILLIS).toString()
        }
        if (lastPlayedLabel != null) {
            Text(
                text = stringResource(R.string.rom_last_played_format, lastPlayedLabel),
                color = watermelon.text3,
                fontFamily = WatermelonMono,
                fontSize = 9.sp,
                lineHeight = 11.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 1.dp, top = 5.dp),
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ContinuePlayingLandscapeColumn(
    roms: List<Rom>,
    coverByHash: Map<String, String>,
    boxArtByUri: Map<String, String> = emptyMap(),
    onRomClicked: (Rom) -> Unit,
    onRomLongPressed: (Rom) -> Unit,
    modifier: Modifier = Modifier,
    onRomFocused: (Rom) -> Unit = {},
    onRomVisible: (Rom) -> Unit = {},
) {
    val colors = watermelon
    Column(modifier = modifier.fillMaxSize()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
        ) {
            Icon(
                imageVector = Icons.Filled.PlayArrow,
                contentDescription = null,
                tint = colors.red,
                modifier = Modifier.size(20.dp),
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = stringResource(R.string.rom_continue_playing),
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f),
            )
            if (roms.isNotEmpty()) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(colors.surface2)
                        .padding(horizontal = 7.dp, vertical = 2.dp),
                ) {
                    Text(
                        text = roms.size.toString(),
                        color = WatermelonColors.gold,
                        fontFamily = WatermelonMono,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }

        if (roms.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface)
                    .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                    .padding(16.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = stringResource(R.string.no_roms_found),
                    color = colors.text2,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                )
            }
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
            ) {
                items(roms, key = { it.uri.toString() }) { rom ->
                    LaunchedEffect(rom.uri) {
                        onRomVisible(rom)
                    }
                    ContinuePlayingLandscapeCard(
                        rom = rom,
                        coverUrl = coverByHash[rom.retroAchievementsHash],
                        boxArtUrl = boxArtByUri[rom.uri.toString()]?.takeIf { it.isNotEmpty() },
                        boxArtLoading = boxArtByUri[rom.uri.toString()] == null,
                        onClick = { onRomClicked(rom) },
                        onLongPress = { onRomLongPressed(rom) },
                        onFocused = onRomFocused,
                    )
                }
            }
        }
    }
}

@Composable
fun CompactLandscapeSidebar(
    totalRoms: Int,
    filter: RomFilter,
    onFilterSelected: (RomFilter) -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    Column(
        modifier = modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(14.dp))
            .background(colors.surface)
            .border(1.dp, colors.line, RoundedCornerShape(14.dp))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(colors.surface2),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = Icons.Filled.SportsEsports,
                contentDescription = null,
                tint = colors.red,
                modifier = Modifier.size(24.dp),
            )
        }
        Spacer(Modifier.height(10.dp))
        Text(
            text = "STORM DS",
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "Всего игр: $totalRoms",
            color = colors.text2,
            fontFamily = WatermelonMono,
            fontSize = 11.sp,
        )
        Spacer(Modifier.height(14.dp))
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(if (filter == RomFilter.FAVORITES) colors.red else colors.surface2)
                .clickable { onFilterSelected(if (filter == RomFilter.FAVORITES) RomFilter.ALL else RomFilter.FAVORITES) }
                .padding(horizontal = 12.dp, vertical = 7.dp),
        ) {
            Text(
                text = "★ Избранное",
                color = if (filter == RomFilter.FAVORITES) Color.White else colors.text2,
                fontSize = 11.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun ContinuePlayingLandscapeCard(
    rom: Rom,
    coverUrl: String?,
    boxArtUrl: String?,
    boxArtLoading: Boolean = false,
    onClick: () -> Unit,
    onLongPress: () -> Unit,
    onFocused: (Rom) -> Unit = {},
) {
    val colors = watermelon
    val shape = RoundedCornerShape(10.dp)
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val isPressed by interactionSource.collectIsPressedAsState()

    LaunchedEffect(isFocused) {
        if (isFocused) onFocused(rom)
    }

    val pressScale by androidx.compose.animation.core.animateFloatAsState(
        targetValue = if (isPressed) 0.97f else 1f,
        label = "press",
    )

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .scale(pressScale)
            .clip(shape)
            .background(if (isFocused) colors.surface2 else colors.surface)
            .border(
                width = if (isFocused) 2.dp else 1.dp,
                color = if (isFocused) colors.red else colors.line,
                shape = shape,
            )
            .combinedClickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick,
                onLongClick = onLongPress,
            )
            .padding(8.dp),
    ) {
        Box(
            modifier = Modifier
                .width(52.dp)
                .aspectRatio(DsBoxArtAspectRatio)
                .clip(RoundedCornerShape(6.dp)),
        ) {
            WatermelonRomArt(
                rom = rom,
                boxArtUrl = boxArtUrl,
                raCoverUrl = coverUrl,
                initialsFontSize = 14.sp,
                boxArtLoading = boxArtLoading,
                modifier = Modifier.fillMaxSize(),
            )
        }
        Spacer(Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = romDisplayName(rom),
                color = colors.text,
                fontWeight = FontWeight.Bold,
                fontSize = 12.5.sp,
                lineHeight = 16.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
            Spacer(Modifier.height(3.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                PlatformBadge(
                    text = romPlatformLabel(rom),
                    fontSize = 8.sp,
                )
                val lastPlayedLabel = rom.lastPlayed?.let {
                    DateUtils.getRelativeTimeSpanString(it.time, System.currentTimeMillis(), DateUtils.MINUTE_IN_MILLIS).toString()
                }
                if (lastPlayedLabel != null) {
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = lastPlayedLabel,
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 8.5.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
        Spacer(Modifier.width(6.dp))
        Box(
            modifier = Modifier
                .size(28.dp)
                .clip(CircleShape)
                .background(if (isFocused) colors.red else Color.White.copy(alpha = 0.10f)),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = Icons.Filled.PlayArrow,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(16.dp),
            )
        }
    }
}

@Composable
fun BreadcrumbBar(
    breadcrumbs: List<String>,
    canNavigateUp: Boolean,
    isAtVirtualRoot: Boolean,
    isSearchActive: Boolean,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier,
) {
    if (!isSearchActive) return
    val colors = watermelon
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (canNavigateUp && !isSearchActive) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .clickable(onClick = onNavigateUp)
                    .padding(end = 8.dp),
            ) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(R.string.rom_browser_navigate_up), tint = colors.text2, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(3.dp))
                Icon(Icons.Filled.Folder, contentDescription = null, tint = colors.green, modifier = Modifier.size(17.dp))
            }
        }
        val text = when {
            isSearchActive -> stringResource(R.string.rom_browser_search_results)
            breadcrumbs.isEmpty() -> stringResource(R.string.rom_browser_virtual_root)
            else -> breadcrumbs.joinToString(" / ")
        }
        Text(
            text = text,
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f),
        )
    }
}

@Composable
fun AlphabetIndexBar(
    alphabetIndex: Map<Char, Int>,
    activeLetter: Char?,
    hasFolders: Boolean,
    isInFolderSection: Boolean,
    onFoldersClicked: () -> Unit,
    onLetterTouched: (entriesIdx: Int, letter: Char) -> Unit,
    modifier: Modifier = Modifier,
) {
    if (alphabetIndex.isEmpty() && !hasFolders) return
    val colors = watermelon
    val letters = remember(alphabetIndex) { alphabetIndex.keys.toList() }
    val totalItems = letters.size + (if (hasFolders) 1 else 0)

    var hoverChar by remember { mutableStateOf<Char?>(null) }
    var isHoverFolder by remember { mutableStateOf(false) }
    var isTouching by remember { mutableStateOf(false) }
    var barHeightPx by remember { mutableStateOf(0) }

    fun handleDrag(yPx: Float) {
        if (barHeightPx <= 0 || totalItems == 0) return
        val itemHeight = barHeightPx.toFloat() / totalItems
        val rawIndex = (yPx / itemHeight).toInt()
        val clamped = rawIndex.coerceIn(0, totalItems - 1)

        if (hasFolders && clamped == 0) {
            if (!isHoverFolder) {
                isHoverFolder = true
                hoverChar = null
                onFoldersClicked()
            }
        } else {
            if (isHoverFolder) isHoverFolder = false
            val letterIdx = clamped - (if (hasFolders) 1 else 0)
            val ch = letters.getOrNull(letterIdx) ?: return
            if (ch != hoverChar) {
                hoverChar = ch
                alphabetIndex[ch]?.let { idx -> onLetterTouched(idx, ch) }
            }
        }
    }

    Box(modifier = modifier) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .width(24.dp)
                .fillMaxHeight()
                .focusProperties { canFocus = false }
                .onSizeChanged { barHeightPx = it.height }
                .pointerInput(letters, hasFolders) {
                    detectVerticalDragGestures(
                        onDragStart = {
                            isTouching = true
                            handleDrag(it.y)
                        },
                        onDragEnd = {
                            isTouching = false
                            hoverChar = null
                            isHoverFolder = false
                        },
                        onDragCancel = {
                            isTouching = false
                            hoverChar = null
                            isHoverFolder = false
                        },
                    ) { change, _ ->
                        handleDrag(change.position.y)
                        change.consume()
                    }
                },
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                if (hasFolders) {
                    val highlighted = isHoverFolder || (hoverChar == null && !isTouching && isInFolderSection)
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .focusProperties { canFocus = false }
                            .clickable { onFoldersClicked() },
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Folder,
                            contentDescription = null,
                            tint = if (highlighted) colors.green else colors.text3,
                            modifier = Modifier.size(12.dp),
                        )
                    }
                }
                letters.forEach { ch ->
                    val highlighted = hoverChar == ch ||
                        (hoverChar == null && !isTouching && !isInFolderSection && activeLetter == ch)
                    val isHovered = hoverChar == ch
                    val scale by androidx.compose.animation.core.animateFloatAsState(
                        targetValue = if (isHovered) 1.7f else if (highlighted) 1.15f else 1f,
                        animationSpec = androidx.compose.animation.core.spring(
                            dampingRatio = androidx.compose.animation.core.Spring.DampingRatioMediumBouncy,
                            stiffness = androidx.compose.animation.core.Spring.StiffnessMedium,
                        ),
                        label = "letter_scale",
                    )
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .focusProperties { canFocus = false }
                            .clickable { alphabetIndex[ch]?.let { idx -> onLetterTouched(idx, ch) } },
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = ch.toString(),
                            modifier = Modifier.scale(scale),
                            fontFamily = WatermelonMono,
                            fontSize = 8.5.sp,
                            lineHeight = 11.sp,
                            color = if (highlighted) colors.green else colors.text3,
                            fontWeight = if (highlighted) FontWeight.Bold else FontWeight.SemiBold,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        )
                    }
                }
            }
        }

        if (isTouching && (hoverChar != null || isHoverFolder)) {
            Box(
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(96.dp)
                    .shadow(8.dp, CircleShape)
                    .clip(CircleShape)
                    .background(colors.red),
                contentAlignment = Alignment.Center,
            ) {
                if (isHoverFolder) {
                    Icon(
                        imageVector = Icons.Filled.Folder,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(48.dp),
                    )
                } else {
                    hoverChar?.let { ch ->
                        Text(
                            text = ch.toString(),
                            color = Color.White,
                            fontFamily = SpaceGrotesk,
                            fontSize = 48.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }
}

internal fun formatPlayTime(duration: Duration): String {
    if (duration == Duration.ZERO) return ""
    val hours = duration.inWholeHours
    val minutes = (duration.inWholeMinutes % 60)
    return when {
        hours >= 1 -> "${hours}h ${minutes}m"
        minutes >= 1 -> "${minutes}m"
        else -> "<1m"
    }
}
