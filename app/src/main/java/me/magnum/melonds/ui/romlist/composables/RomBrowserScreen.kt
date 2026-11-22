package me.magnum.melonds.ui.romlist.composables

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.LocalOverscrollFactory
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ViewList
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.foundation.MutatePriority
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeoutOrNull
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.RomFilter
import me.magnum.melonds.domain.model.RomScanningStatus
import me.magnum.melonds.domain.model.RomViewMode
import me.magnum.melonds.domain.model.SortingMode
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.multiplayer.MultiplayerActivity
import me.magnum.melonds.multiplayer.MultiplayerInvitePill
import me.magnum.melonds.multiplayer.MultiplayerNearby
import me.magnum.melonds.multiplayer.MultiplayerNearbyWatch
import me.magnum.melonds.multiplayer.Pulse
import me.magnum.melonds.ui.common.WatermelonMark
import me.magnum.melonds.ui.romlist.RomBrowserEntry
import me.magnum.melonds.ui.romlist.RomBrowserUiState
import me.magnum.melonds.ui.romlist.RomListActivity
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.watermelon

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RomBrowserScreen(
    state: RomBrowserUiState,
    coverByHash: Map<String, String>,
    boxArtByUri: Map<String, String>,
    searchQuery: String,
    allowConfiguration: Boolean,
    isShortcutPickerMode: Boolean = false,
    scanningStatus: RomScanningStatus,
    confirmedAchievementHashes: Set<String>,
    isRaAuthenticated: Boolean,
    onFolderClick: (RomBrowserEntry.Folder) -> Unit,
    onRomClick: (Rom) -> Unit,
    onQuickResumeRom: (Rom) -> Unit = onRomClick,
    onRomLongPress: (Rom) -> Unit,
    onRomConfigClick: (Rom) -> Unit,
    onFilterSelected: (RomFilter) -> Unit,
    onSortSelected: (SortingMode) -> Unit,
    onNavigateUp: () -> Unit,
    onRefresh: () -> Unit,
    onSearchQueryChanged: (String?) -> Unit,
    onToggleViewMode: () -> Unit,
    onBootFirmwareDs: () -> Unit,
    onBootFirmwareDsi: () -> Unit,
    onOpenSingleRom: () -> Unit = {},
    onRandomRom: () -> Unit = {},
    onCheckUpdates: () -> Unit = {},
    onOpenSettings: () -> Unit,
    onOpenPlayerStats: () -> Unit = {},
    onReportProblem: () -> Unit = {},
    onOpenMultiplayer: (() -> Unit)? = null,
    onJoinNearby: ((String) -> Unit)? = null,
    onRomVisible: (Rom) -> Unit = {},
    onFocusedRomChanged: (Rom?) -> Unit = {},
    onDpadDownGateChanged: ((() -> Boolean)?) -> Unit = {},
) {
    val colors = watermelon
    val screenContext = androidx.compose.ui.platform.LocalContext.current
    val openMultiplayerAction: () -> Unit = onOpenMultiplayer ?: {
        val activity = screenContext as? RomListActivity
        if (activity != null) {
            activity.openMultiplayer()
        } else {
            screenContext.startActivity(android.content.Intent(screenContext, MultiplayerActivity::class.java))
        }
    }
    val joinNearbyAction: (String) -> Unit = onJoinNearby ?: { key ->
        val activity = screenContext as? RomListActivity
        if (activity != null) {
            activity.openMultiplayer(key)
        } else {
            screenContext.startActivity(
                android.content.Intent(screenContext, MultiplayerActivity::class.java)
                    .putExtra(MultiplayerActivity.EXTRA_JOIN, key)
            )
        }
    }
    val coroutineScope = rememberCoroutineScope()
    val gridState = remember { LazyGridState(0, 0) }
    val listState = remember { LazyListState(0, 0) }
    val itemFocusRequesters = remember { mutableStateMapOf<String, FocusRequester>() }
    var focusedEntryIndex by remember { mutableIntStateOf(-1) }

    val isGridDragged by gridState.interactionSource.collectIsDraggedAsState()
    val isListDragged by listState.interactionSource.collectIsDraggedAsState()
    val latestScanningStatus = rememberUpdatedState(scanningStatus)

    var pinToTop by remember { mutableStateOf(true) }
    var userHasScrolledManually by remember { mutableStateOf(false) }
    var userRefreshPending by remember { mutableStateOf(false) }
    var refreshEpoch by remember { mutableIntStateOf(0) }

    val firstEntryKey = remember(state.entries) {
        state.entries.firstOrNull()?.let { entry ->
            when (entry) {
                is RomBrowserEntry.Folder -> "folder:${entry.docId}"
                is RomBrowserEntry.RomItem -> "rom:${entry.rom.uri}"
            }
        }
    }

    val isCurrentlyAtTop by remember(state.viewMode) {
        derivedStateOf {
            when (state.viewMode) {
                RomViewMode.GRID -> gridState.firstVisibleItemIndex == 0 && gridState.firstVisibleItemScrollOffset <= 10
                RomViewMode.LIST -> listState.firstVisibleItemIndex == 0 && listState.firstVisibleItemScrollOffset <= 10
            }
        }
    }

    suspend fun resetScrollToTop() {
        gridState.requestScrollToItem(0, 0)
        listState.requestScrollToItem(0, 0)
        withFrameNanos { }
        gridState.scrollToItem(0, 0)
        listState.scrollToItem(0, 0)
    }

    fun snapToTop() {
        gridState.requestScrollToItem(0, 0)
        listState.requestScrollToItem(0, 0)
        coroutineScope.launch {
            resetScrollToTop()
        }
    }

    val handleRefreshWithScrollReset: () -> Unit = {
        focusedEntryIndex = -1
        userHasScrolledManually = false
        pinToTop = true
        userRefreshPending = true
        refreshEpoch++
        coroutineScope.launch {
            resetScrollToTop()
        }
        onRefresh()
    }

    val isEffectivelyRefreshing = userRefreshPending || scanningStatus == RomScanningStatus.SCANNING
    val refreshState = rememberPullRefreshState(
        refreshing = isEffectivelyRefreshing,
        onRefresh = handleRefreshWithScrollReset,
    )

    // Initial launch: unconditionally anchor to first item (0, 0)
    LaunchedEffect(Unit) {
        pinToTop = true
        userHasScrolledManually = false
        focusedEntryIndex = -1
        resetScrollToTop()
    }

    // Releases the spinner deterministically and anchors back to top upon completion.
    LaunchedEffect(userRefreshPending) {
        if (!userRefreshPending) return@LaunchedEffect
        val statusFlow = snapshotFlow { latestScanningStatus.value }
        val started = withTimeoutOrNull(1_500L) {
            statusFlow.first { it == RomScanningStatus.SCANNING }
        } != null
        if (started) {
            withTimeoutOrNull(60_000L) {
                statusFlow.first { it == RomScanningStatus.NOT_SCANNING }
            }
        }
        userRefreshPending = false
        userHasScrolledManually = false
        pinToTop = true
        refreshEpoch++
        resetScrollToTop()
    }

    // The user takes control of the scroll position only when they actively drag away from top.
    LaunchedEffect(isGridDragged, isListDragged) {
        if ((isGridDragged || isListDragged) && !userRefreshPending) {
            val isScrolledAway = when (state.viewMode) {
                RomViewMode.GRID -> gridState.firstVisibleItemIndex > 0 || gridState.firstVisibleItemScrollOffset > 30
                RomViewMode.LIST -> listState.firstVisibleItemIndex > 0 || listState.firstVisibleItemScrollOffset > 30
            }
            if (isScrolledAway) {
                userHasScrolledManually = true
                pinToTop = false
            }
        }
    }

    // Continuously track scroll position so flings/momentum away from top disable pinToTop.
    LaunchedEffect(state.viewMode) {
        snapshotFlow { isCurrentlyAtTop }
            .distinctUntilChanged()
            .collect { atTop ->
                if (!atTop && !userRefreshPending) {
                    userHasScrolledManually = true
                    pinToTop = false
                }
            }
    }

    // When at top and not dragging, keep top pinned and clear manual scroll flag
    LaunchedEffect(isCurrentlyAtTop, isGridDragged, isListDragged) {
        if (isCurrentlyAtTop && !isGridDragged && !isListDragged) {
            userHasScrolledManually = false
            pinToTop = true
        }
    }

    // D-pad / controller navigation also counts as the user taking control.
    LaunchedEffect(focusedEntryIndex) {
        if (focusedEntryIndex > 0) {
            pinToTop = false
            userHasScrolledManually = true
        }
    }

    // Apply the pinned position for every new list emission, refresh, or when pinToTop is set.
    LaunchedEffect(state.entries, refreshEpoch, pinToTop) {
        if ((pinToTop || !userHasScrolledManually || userRefreshPending) && state.entries.isNotEmpty()) {
            focusedEntryIndex = -1
            resetScrollToTop()
        }
    }

    // A (re)scan started by the system keeps the list pinned if the user hasn't scrolled manually away
    LaunchedEffect(scanningStatus) {
        if (scanningStatus == RomScanningStatus.SCANNING && (!userHasScrolledManually || isCurrentlyAtTop)) {
            pinToTop = true
            snapToTop()
        }
    }

    val folderCount = remember(state.entries) { state.entries.takeWhile { it is RomBrowserEntry.Folder }.size }
    val hasFolders = folderCount > 0
    val romCount = state.entries.size - folderCount
    val showAlphabetBar = (state.alphabetIndex.isNotEmpty() || hasFolders) && state.sortingMode == SortingMode.ALPHABETICALLY

    val isAtLibraryTop = state.isAtVirtualRoot || !state.canNavigateUp
    val showContinueShelf = !isShortcutPickerMode && isAtLibraryTop && !state.isSearchActive && state.filter == RomFilter.ALL && state.continuePlaying.isNotEmpty()
    val showSectionHeader = !state.isSearchActive

    val gridLeadingItems = if (hasFolders) 1 else 0
    val listLeadingItems = 0

    // Changing filter, folder, search or sorting always starts again from the first game.
    LaunchedEffect(state.filter, state.breadcrumbs, state.isSearchActive, state.sortingMode, state.sortingOrder) {
        focusedEntryIndex = -1
        userHasScrolledManually = false
        pinToTop = true
        resetScrollToTop()
    }

    LaunchedEffect(focusedEntryIndex, state.entries) {
        val focusedRom = (state.entries.getOrNull(focusedEntryIndex) as? RomBrowserEntry.RomItem)?.rom
        onFocusedRomChanged(focusedRom)
    }

    val gridColumnCount by remember { derivedStateOf { gridState.currentColumnCount() } }
    val firstRomEntryIndexInLastGridRow = remember(romCount, folderCount, gridColumnCount) {
        if (romCount <= 0) {
            Int.MAX_VALUE
        } else {
            folderCount + firstIndexInLastGridRow(totalItems = romCount, columnCount = gridColumnCount)
        }
    }

    DisposableEffect(state.viewMode, focusedEntryIndex, firstRomEntryIndexInLastGridRow, state.entries.size, onDpadDownGateChanged) {
        onDpadDownGateChanged {
            if (state.entries.isEmpty() || focusedEntryIndex < 0) {
                false
            } else {
                when (state.viewMode) {
                    RomViewMode.GRID -> focusedEntryIndex >= firstRomEntryIndexInLastGridRow
                    RomViewMode.LIST -> focusedEntryIndex == state.entries.lastIndex
                }
            }
        }
        onDispose {
            onDpadDownGateChanged(null)
        }
    }

    val renderAlphabetBar: @Composable androidx.compose.foundation.layout.BoxScope.() -> Unit = {
        if (showAlphabetBar) {
            val leadingItems = when (state.viewMode) {
                RomViewMode.GRID -> gridLeadingItems
                RomViewMode.LIST -> listLeadingItems
            }
            val activeFirstVis by remember(state.viewMode, leadingItems, folderCount) {
                derivedStateOf {
                    val firstVisItem = when (state.viewMode) {
                        RomViewMode.GRID -> gridState.firstVisibleItemIndex
                        RomViewMode.LIST -> listState.firstVisibleItemIndex
                    }
                    when (state.viewMode) {
                        RomViewMode.GRID -> (firstVisItem - leadingItems + folderCount).coerceAtLeast(0)
                        RomViewMode.LIST -> (firstVisItem - leadingItems).coerceAtLeast(0)
                    }
                }
            }
            val activeLetter by remember(state.alphabetIndex, state.viewMode, pinToTop, isCurrentlyAtTop, userHasScrolledManually) {
                derivedStateOf {
                    if (pinToTop || isCurrentlyAtTop || !userHasScrolledManually) {
                        state.alphabetIndex.keys.firstOrNull() ?: '#'
                    } else {
                        letterForIndex(state.alphabetIndex, activeFirstVis)
                    }
                }
            }
            val isInFolderSection by remember(folderCount, state.viewMode) {
                derivedStateOf { hasFolders && activeFirstVis < folderCount }
            }
            AlphabetIndexBar(
                alphabetIndex = state.alphabetIndex,
                activeLetter = activeLetter,
                hasFolders = hasFolders,
                isInFolderSection = isInFolderSection,
                isInteractive = !userRefreshPending,
                onFoldersClicked = {
                    if (userRefreshPending) return@AlphabetIndexBar
                    coroutineScope.launch {
                        userHasScrolledManually = false
                        pinToTop = true
                        snapToTop()
                        withFrameNanos { }
                        requestFirstVisibleRomFocus(
                            state = state,
                            gridState = gridState,
                            listState = listState,
                            itemFocusRequesters = itemFocusRequesters,
                        )
                    }
                },
                onLetterTouched = { idx, letter ->
                    if (userRefreshPending) return@AlphabetIndexBar
                    coroutineScope.launch {
                        if (letter == '#' || idx <= 0) {
                            userHasScrolledManually = false
                            pinToTop = true
                            snapToTop()
                        } else {
                            userHasScrolledManually = true
                            pinToTop = false
                            val targetItemIndex = when (state.viewMode) {
                                RomViewMode.GRID -> leadingItems + (idx - folderCount).coerceAtLeast(0)
                                RomViewMode.LIST -> leadingItems + idx
                            }
                            when (state.viewMode) {
                                RomViewMode.GRID -> gridState.scrollToItem(targetItemIndex, 0)
                                RomViewMode.LIST -> listState.scrollToItem(targetItemIndex, 0)
                            }
                        }
                    }
                },
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(top = 8.dp, bottom = 12.dp, end = 2.dp),
            )
        }
    }

    Surface(color = colors.bg, modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize().windowInsetsPadding(WindowInsets.systemBars.union(WindowInsets.displayCutout))) {
            Column(modifier = Modifier.fillMaxSize()) {
                if (isShortcutPickerMode) {
                    ShortcutPickerLibraryHeader(
                        isSearchActive = state.isSearchActive,
                        searchQuery = searchQuery,
                        viewMode = state.viewMode,
                        onSearchQueryChanged = onSearchQueryChanged,
                        onToggleViewMode = onToggleViewMode,
                    )
                } else {
                    WatermelonLibraryHeader(
                        isSearchActive = state.isSearchActive,
                        searchQuery = searchQuery,
                        viewMode = state.viewMode,
                        onSearchQueryChanged = onSearchQueryChanged,
                        onToggleViewMode = onToggleViewMode,
                        onBootFirmwareDs = onBootFirmwareDs,
                        onBootFirmwareDsi = onBootFirmwareDsi,
                        onOpenSingleRom = onOpenSingleRom,
                        onRandomRom = onRandomRom,
                        onRefresh = handleRefreshWithScrollReset,
                        onCheckUpdates = onCheckUpdates,
                        onOpenSettings = onOpenSettings,
                        onOpenPlayerStats = onOpenPlayerStats,
                        onReportProblem = onReportProblem,
                    )
                    if (!state.isSearchActive) {
                        MultiplayerNearbyWatch()
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 5.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            MultiplayerEntryButton(onClick = openMultiplayerAction)
                            MultiplayerInvitePill(onJoin = joinNearbyAction)
                        }
                    }
                }

                if (scanningStatus == RomScanningStatus.SCANNING) {
                    LinearProgressIndicator(
                        color = colors.green,
                        backgroundColor = colors.surface2,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }

                BreadcrumbBar(
                    breadcrumbs = state.breadcrumbs,
                    canNavigateUp = state.canNavigateUp,
                    isAtVirtualRoot = state.isAtVirtualRoot,
                    isSearchActive = state.isSearchActive,
                    onNavigateUp = onNavigateUp,
                )

                val configuration = LocalConfiguration.current
                val isLandscape = configuration.screenWidthDp > configuration.screenHeightDp

                if (isLandscape) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                    ) {
                        // Left 38%: Continue Playing or Quick Library Sidebar
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(0.38f)
                                .fillMaxHeight()
                                .padding(start = 16.dp, end = 10.dp, top = 6.dp, bottom = 6.dp),
                        ) {
                            if (!isShortcutPickerMode && state.continuePlaying.isNotEmpty() && !state.isSearchActive && !state.canNavigateUp) {
                                ContinuePlayingLandscapeColumn(
                                    roms = state.continuePlaying,
                                    coverByHash = coverByHash,
                                    boxArtByUri = boxArtByUri,
                                    quickResumeHasSaveState = state.quickResumeHasSaveState,
                                    quickResumeSaveTimestamp = state.quickResumeSaveTimestamp,
                                    onRomClicked = onRomClick,
                                    onQuickResumeRom = onQuickResumeRom,
                                    onRomLongPressed = onRomLongPress,
                                    onRomFocused = onFocusedRomChanged,
                                    onRomVisible = onRomVisible,
                                )
                            } else {
                                CompactLandscapeSidebar(
                                    totalRoms = state.entries.size,
                                    filter = state.filter,
                                    onFilterSelected = onFilterSelected,
                                )
                            }
                        }

                        // Sleek Vertical Gradient Divider
                        Box(
                            modifier = Modifier
                                .width(1.dp)
                                .fillMaxHeight()
                                .padding(vertical = 8.dp)
                                .background(
                                    Brush.verticalGradient(
                                        listOf(
                                            Color.Transparent,
                                            colors.line.copy(alpha = 0.6f),
                                            colors.red.copy(alpha = 0.5f),
                                            colors.line.copy(alpha = 0.6f),
                                            Color.Transparent,
                                        )
                                    )
                                )
                        )

                        // Right 62%: Filters, Section Header, and Game List
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                                .padding(start = 10.dp, end = 16.dp),
                        ) {
                            FilterChipsRow(
                                selected = state.filter,
                                onFilterSelected = onFilterSelected,
                            )
                            if (showSectionHeader) {
                                val romsCount = state.entries.drop(folderCount).size
                                LibrarySectionHeader(
                                    title = if (state.canNavigateUp) state.breadcrumbs.lastOrNull() ?: stringResource(R.string.rom_all_games) else stringResource(R.string.rom_all_games),
                                    inFolder = state.canNavigateUp,
                                    sortingMode = state.sortingMode,
                                    sortingOrder = state.sortingOrder,
                                    gamesCount = romsCount,
                                    viewMode = state.viewMode,
                                    onToggleViewMode = onToggleViewMode,
                                    onNavigateUp = onNavigateUp,
                                    onSortSelected = onSortSelected,
                                    modifier = Modifier.padding(horizontal = 0.dp),
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .pullRefresh(refreshState),
                            ) {
                                if (state.entries.isEmpty()) {
                                    Column(modifier = Modifier.fillMaxSize()) {
                                        EmptyState(filter = state.filter, isScanning = isEffectivelyRefreshing)
                                    }
                                } else {
                                    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
                                        AnimatedContent(
                                            targetState = state.viewMode,
                                            transitionSpec = {
                                                (fadeIn(animationSpec = tween(180)) + scaleIn(
                                                    initialScale = 0.96f,
                                                    animationSpec = spring(
                                                        dampingRatio = Spring.DampingRatioNoBouncy,
                                                        stiffness = Spring.StiffnessMediumLow
                                                    )
                                                )) togetherWith fadeOut(animationSpec = tween(130))
                                            },
                                            label = "view_mode"
                                        ) { mode ->
                                            when (mode) {
                                                RomViewMode.GRID -> GridContent(
                                                    state = state,
                                                    gridState = gridState,
                                                    coverByHash = coverByHash,
                                                    boxArtByUri = boxArtByUri,
                                                    confirmedAchievementHashes = confirmedAchievementHashes,
                                                    isRaAuthenticated = isRaAuthenticated,
                                                    showAlphabetBar = showAlphabetBar,
                                                    showContinueShelf = false,
                                                    showSectionHeader = false,
                                                    folderCount = folderCount,
                                                    viewportHeight = maxHeight,
                                                    itemFocusRequesters = itemFocusRequesters,
                                                    focusedEntryIndex = focusedEntryIndex,
                                                    firstRomEntryIndexInLastGridRow = firstRomEntryIndexInLastGridRow,
                                                    onFocusedEntryIndexChanged = { focusedEntryIndex = it },
                                                    onRomFocused = onFocusedRomChanged,
                                                    onFolderClick = onFolderClick,
                                                    onRomClick = onRomClick,
                                                    onRomLongPress = onRomLongPress,
                                                    onFilterSelected = onFilterSelected,
                                                    onSortSelected = onSortSelected,
                                                    onNavigateUp = onNavigateUp,
                                                    onRomVisible = onRomVisible,
                                                )
                                                RomViewMode.LIST -> ListContent(
                                                    state = state,
                                                    listState = listState,
                                                    coverByHash = coverByHash,
                                                    boxArtByUri = boxArtByUri,
                                                    allowConfiguration = allowConfiguration,
                                                    confirmedAchievementHashes = confirmedAchievementHashes,
                                                    isRaAuthenticated = isRaAuthenticated,
                                                    showAlphabetBar = showAlphabetBar,
                                                    showContinueShelf = false,
                                                    showSectionHeader = false,
                                                    folderCount = folderCount,
                                                    viewportHeight = maxHeight,
                                                    itemFocusRequesters = itemFocusRequesters,
                                                    focusedEntryIndex = focusedEntryIndex,
                                                    onFocusedEntryIndexChanged = { focusedEntryIndex = it },
                                                    onRomFocused = onFocusedRomChanged,
                                                    onFolderClick = onFolderClick,
                                                    onRomClick = onRomClick,
                                                    onRomLongPress = onRomLongPress,
                                                    onRomConfigClick = onRomConfigClick,
                                                    onFilterSelected = onFilterSelected,
                                                    onSortSelected = onSortSelected,
                                                    onNavigateUp = onNavigateUp,
                                                    onRomVisible = onRomVisible,
                                                )
                                            }
                                        }
                                    }
                                }
                                PullRefreshIndicator(
                                    refreshing = isEffectivelyRefreshing,
                                    state = refreshState,
                                    modifier = Modifier.align(Alignment.TopCenter),
                                    backgroundColor = colors.surface,
                                    contentColor = colors.red,
                                )
                                renderAlphabetBar()
                            }
                        }
                    }
                } else {
                    // Portrait mode
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                    ) {
                        FilterChipsRow(
                            selected = state.filter,
                            onFilterSelected = onFilterSelected,
                        )
                        if (showContinueShelf) {
                            ContinuePlayingShelf(
                                roms = state.continuePlaying,
                                coverByHash = coverByHash,
                                boxArtByUri = boxArtByUri,
                                quickResumeHasSaveState = state.quickResumeHasSaveState,
                                quickResumeSaveTimestamp = state.quickResumeSaveTimestamp,
                                onRomClicked = onRomClick,
                                onQuickResumeRom = onQuickResumeRom,
                                onRomLongPressed = onRomLongPress,
                                horizontalPadding = 0.dp,
                                onRomFocused = onFocusedRomChanged,
                                onRomVisible = onRomVisible,
                            )
                        }
                        if (showSectionHeader) {
                            val romsCount = state.entries.drop(folderCount).size
                            LibrarySectionHeader(
                                title = if (state.canNavigateUp) state.breadcrumbs.lastOrNull() ?: stringResource(R.string.rom_all_games) else stringResource(R.string.rom_all_games),
                                inFolder = state.canNavigateUp,
                                sortingMode = state.sortingMode,
                                sortingOrder = state.sortingOrder,
                                gamesCount = romsCount,
                                viewMode = state.viewMode,
                                onToggleViewMode = onToggleViewMode,
                                onNavigateUp = onNavigateUp,
                                onSortSelected = onSortSelected,
                                modifier = Modifier.padding(horizontal = 0.dp),
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .pullRefresh(refreshState),
                    ) {
                        if (state.entries.isEmpty() && !showContinueShelf) {
                            Column(modifier = Modifier.fillMaxSize()) {
                                EmptyState(filter = state.filter, isScanning = isEffectivelyRefreshing)
                            }
                        } else {
                            BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
                                AnimatedContent(
                                    targetState = state.viewMode,
                                    transitionSpec = {
                                        (fadeIn(animationSpec = tween(180)) + scaleIn(
                                            initialScale = 0.96f,
                                            animationSpec = spring(
                                                dampingRatio = Spring.DampingRatioNoBouncy,
                                                stiffness = Spring.StiffnessMediumLow
                                            )
                                        )) togetherWith fadeOut(animationSpec = tween(130))
                                    },
                                    label = "view_mode"
                                ) { mode ->
                                    when (mode) {
                                        RomViewMode.GRID -> GridContent(
                                            state = state,
                                            gridState = gridState,
                                            coverByHash = coverByHash,
                                            boxArtByUri = boxArtByUri,
                                            confirmedAchievementHashes = confirmedAchievementHashes,
                                            isRaAuthenticated = isRaAuthenticated,
                                            showAlphabetBar = showAlphabetBar,
                                            showContinueShelf = false,
                                            showSectionHeader = false,
                                            folderCount = folderCount,
                                            viewportHeight = maxHeight,
                                            itemFocusRequesters = itemFocusRequesters,
                                            focusedEntryIndex = focusedEntryIndex,
                                            firstRomEntryIndexInLastGridRow = firstRomEntryIndexInLastGridRow,
                                            onFocusedEntryIndexChanged = { focusedEntryIndex = it },
                                            onRomFocused = onFocusedRomChanged,
                                            onFolderClick = onFolderClick,
                                            onRomClick = onRomClick,
                                            onRomLongPress = onRomLongPress,
                                            onFilterSelected = onFilterSelected,
                                            onSortSelected = onSortSelected,
                                            onNavigateUp = onNavigateUp,
                                            onRomVisible = onRomVisible,
                                        )
                                        RomViewMode.LIST -> ListContent(
                                            state = state,
                                            listState = listState,
                                            coverByHash = coverByHash,
                                            boxArtByUri = boxArtByUri,
                                            allowConfiguration = allowConfiguration,
                                            confirmedAchievementHashes = confirmedAchievementHashes,
                                            isRaAuthenticated = isRaAuthenticated,
                                            showAlphabetBar = showAlphabetBar,
                                            showContinueShelf = false,
                                            showSectionHeader = false,
                                            folderCount = folderCount,
                                            viewportHeight = maxHeight,
                                            itemFocusRequesters = itemFocusRequesters,
                                            focusedEntryIndex = focusedEntryIndex,
                                            onFocusedEntryIndexChanged = { focusedEntryIndex = it },
                                            onRomFocused = onFocusedRomChanged,
                                            onFolderClick = onFolderClick,
                                            onRomClick = onRomClick,
                                            onRomLongPress = onRomLongPress,
                                            onRomConfigClick = onRomConfigClick,
                                            onFilterSelected = onFilterSelected,
                                            onSortSelected = onSortSelected,
                                            onNavigateUp = onNavigateUp,
                                            onRomVisible = onRomVisible,
                                        )
                                    }
                                }
                            }
                        }
                        PullRefreshIndicator(
                            refreshing = isEffectivelyRefreshing,
                            state = refreshState,
                            modifier = Modifier.align(Alignment.TopCenter),
                            backgroundColor = colors.surface,
                            contentColor = colors.red,
                        )

                        // Alphabet Index Bar: anchored inside the games list area
                        renderAlphabetBar()
                    }
                }
            }
        }
    }
}

@Composable
private fun ShortcutPickerLibraryHeader(
    isSearchActive: Boolean,
    searchQuery: String,
    viewMode: RomViewMode,
    onSearchQueryChanged: (String?) -> Unit,
    onToggleViewMode: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    var searchOpen by remember { mutableStateOf(isSearchActive) }
    LaunchedEffect(isSearchActive) {
        if (isSearchActive) searchOpen = true
    }
    BackHandler(enabled = searchOpen) {
        searchOpen = false
        onSearchQueryChanged(null)
    }
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
                    onClick = {
                        if (searchQuery.isNotEmpty()) {
                            onSearchQueryChanged("")
                        } else {
                            searchOpen = false
                            onSearchQueryChanged(null)
                        }
                    },
                    modifier = Modifier.size(36.dp),
                ) {
                    Icon(
                        Icons.Filled.Close,
                        contentDescription = stringResource(R.string.close),
                        tint = colors.text2,
                        modifier = Modifier.size(18.dp),
                    )
                }
                IconButton(onClick = onToggleViewMode, modifier = Modifier.size(36.dp)) {
                    Icon(
                        imageVector = if (viewMode == RomViewMode.GRID) Icons.Filled.ViewList else Icons.Filled.GridView,
                        contentDescription = stringResource(R.string.rom_view_toggle),
                        tint = colors.text2,
                        modifier = Modifier.size(19.dp),
                    )
                }
            } else {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(end = 4.dp),
                ) {
                    WatermelonMark(height = 22.dp)
                    Spacer(Modifier.width(7.dp))
                    Text(
                        text = buildAnnotatedString {
                            withStyle(SpanStyle(color = colors.text, fontWeight = FontWeight.Bold)) {
                                append("STORM ")
                            }
                            withStyle(SpanStyle(color = Color(0xFF00E5FF), fontWeight = FontWeight.Bold)) {
                                append("DS")
                            }
                        },
                        fontFamily = SpaceGrotesk,
                        fontSize = 18.sp,
                        letterSpacing = (-0.3).sp,
                        softWrap = false,
                        maxLines = 1,
                    )
                }

                Spacer(Modifier.weight(1f))

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
            }
        }
        Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun GridContent(
    state: RomBrowserUiState,
    gridState: LazyGridState,
    coverByHash: Map<String, String>,
    boxArtByUri: Map<String, String>,
    confirmedAchievementHashes: Set<String>,
    isRaAuthenticated: Boolean,
    showAlphabetBar: Boolean,
    showContinueShelf: Boolean,
    showSectionHeader: Boolean,
    folderCount: Int,
    viewportHeight: Dp,
    itemFocusRequesters: MutableMap<String, FocusRequester>,
    focusedEntryIndex: Int,
    firstRomEntryIndexInLastGridRow: Int,
    onFocusedEntryIndexChanged: (Int) -> Unit,
    onRomFocused: (Rom) -> Unit = {},
    onFolderClick: (RomBrowserEntry.Folder) -> Unit,
    onRomClick: (Rom) -> Unit,
    onRomLongPress: (Rom) -> Unit,
    onFilterSelected: (RomFilter) -> Unit,
    onSortSelected: (SortingMode) -> Unit,
    onNavigateUp: () -> Unit,
    onRomVisible: (Rom) -> Unit,
) {
    val folders = state.entries.take(folderCount).filterIsInstance<RomBrowserEntry.Folder>()
    val roms = state.entries.drop(folderCount).filterIsInstance<RomBrowserEntry.RomItem>()

    val context = androidx.compose.ui.platform.LocalContext.current
    val prefs = remember { androidx.preference.PreferenceManager.getDefaultSharedPreferences(context) }
    var isScraperEnabled by remember { mutableStateOf(prefs.getBoolean("rom_gametdb_covers_enabled", false)) }
    var isGameTdb2dEnabled by remember { mutableStateOf(prefs.getBoolean("rom_gametdb_2d_covers_enabled", false)) }
    var isGameTdb3dEnabled by remember { mutableStateOf(prefs.getBoolean("rom_gametdb_3d_covers_enabled", false)) }
    var isRaCoversEnabled by remember { mutableStateOf(prefs.getBoolean("rom_ra_covers_enabled", false)) }

    androidx.compose.runtime.DisposableEffect(prefs) {
        val listener = android.content.SharedPreferences.OnSharedPreferenceChangeListener { sp, key ->
            when (key) {
                "rom_gametdb_covers_enabled" -> isScraperEnabled = sp.getBoolean(key, false)
                "rom_gametdb_2d_covers_enabled" -> isGameTdb2dEnabled = sp.getBoolean(key, false)
                "rom_gametdb_3d_covers_enabled" -> isGameTdb3dEnabled = sp.getBoolean(key, false)
                "rom_ra_covers_enabled" -> isRaCoversEnabled = sp.getBoolean(key, false)
            }
        }
        prefs.registerOnSharedPreferenceChangeListener(listener)
        onDispose {
            prefs.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }
    val anyCoversEnabled = isScraperEnabled || isGameTdb2dEnabled || isGameTdb3dEnabled || isRaCoversEnabled
    val displayNameMode by me.magnum.melonds.ui.romlist.RomDisplayNameManager.modeFlow.collectAsState()

    RomListOverscrollProvider {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 104.dp),
            state = gridState,
            contentPadding = PaddingValues(
                start = 16.dp,
                end = if (showAlphabetBar) 28.dp else 16.dp,
                top = 0.dp,
                bottom = rememberTrailingLetterScrollPadding(
                    viewportHeight = viewportHeight,
                    visibleItemHeightPx = gridState.layoutInfo.visibleItemsInfo.maxOfOrNull { item -> item.size.height } ?: 0,
                    minimumPadding = if (state.filter == RomFilter.FAVORITES) 96.dp else 32.dp,
                ),
            ),
            verticalArrangement = Arrangement.spacedBy(11.dp),
            horizontalArrangement = Arrangement.spacedBy(11.dp),
            modifier = Modifier.fillMaxSize(),
        ) {
            if (folders.isNotEmpty()) {
                item(key = "folders", span = { GridItemSpan(maxLineSpan) }) {
                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        modifier = Modifier.fillMaxWidth().padding(bottom = 2.dp),
                    ) {
                        folders.forEachIndexed { folderIdx, folder ->
                            FolderGridCard(
                                name = folder.name,
                                relativePath = folder.relativePath,
                                onClick = { onFolderClick(folder) },
                                modifier = rememberRomBrowserItemFocusModifier(
                                    index = folderIdx,
                                    focusKey = "folder:${folder.docId}",
                                    itemFocusRequesters = itemFocusRequesters,
                                    focusedEntryIndex = focusedEntryIndex,
                                    onFocusedEntryIndexChanged = onFocusedEntryIndexChanged,
                                ),
                            )
                        }
                    }
                }
            }
            itemsIndexed(
                items = roms,
                key = { _, entry -> "rom:${entry.rom.uri}" },
                contentType = { _, _ -> "rom" },
            ) { romIdx, entry ->
                val entryIndex = folderCount + romIdx
                LaunchedEffect(entry.rom.uri) {
                    onRomVisible(entry.rom)
                }
                key(displayNameMode) {
                    RomGridCard(
                    rom = entry.rom,
                    coverUrl = coverByHash[entry.rom.retroAchievementsHash],
                    boxArtUrl = boxArtByUri[entry.rom.uri.toString()]?.takeIf { it.isNotEmpty() },
                    boxArtLoading = anyCoversEnabled && (boxArtByUri[entry.rom.uri.toString()] == null),
                    showAchievementBadge = isRaAuthenticated && ((entry.rom.retroAchievementsHash in confirmedAchievementHashes) || entry.rom.retroAchievementsHash.isNotBlank()),
                    onClick = { onRomClick(entry.rom) },
                    onLongPress = {
                        onRomLongPress(entry.rom)
                    },
                    modifier = rememberRomBrowserItemFocusModifier(
                        index = entryIndex,
                        focusKey = "rom:${entry.rom.uri}",
                        itemFocusRequesters = itemFocusRequesters,
                        focusedEntryIndex = focusedEntryIndex,
                        onFocusedEntryIndexChanged = onFocusedEntryIndexChanged,
                    ).cancelDpadDownIf(entryIndex >= firstRomEntryIndexInLastGridRow),
                )
                }
            }
        }
    }
}

@Composable
private fun ListContent(
    state: RomBrowserUiState,
    listState: LazyListState,
    coverByHash: Map<String, String>,
    boxArtByUri: Map<String, String>,
    allowConfiguration: Boolean,
    confirmedAchievementHashes: Set<String>,
    isRaAuthenticated: Boolean,
    showAlphabetBar: Boolean,
    showContinueShelf: Boolean,
    showSectionHeader: Boolean,
    folderCount: Int,
    viewportHeight: Dp,
    itemFocusRequesters: MutableMap<String, FocusRequester>,
    focusedEntryIndex: Int,
    onFocusedEntryIndexChanged: (Int) -> Unit,
    onRomFocused: (Rom) -> Unit = {},
    onFolderClick: (RomBrowserEntry.Folder) -> Unit,
    onRomClick: (Rom) -> Unit,
    onRomLongPress: (Rom) -> Unit,
    onRomConfigClick: (Rom) -> Unit,
    onFilterSelected: (RomFilter) -> Unit,
    onSortSelected: (SortingMode) -> Unit,
    onNavigateUp: () -> Unit,
    onRomVisible: (Rom) -> Unit,
) {
    val context = androidx.compose.ui.platform.LocalContext.current
    val prefs = remember { androidx.preference.PreferenceManager.getDefaultSharedPreferences(context) }
    var isScraperEnabled by remember { mutableStateOf(prefs.getBoolean("rom_gametdb_covers_enabled", false)) }
    var isGameTdb2dEnabled by remember { mutableStateOf(prefs.getBoolean("rom_gametdb_2d_covers_enabled", false)) }
    var isGameTdb3dEnabled by remember { mutableStateOf(prefs.getBoolean("rom_gametdb_3d_covers_enabled", false)) }
    var isRaCoversEnabled by remember { mutableStateOf(prefs.getBoolean("rom_ra_covers_enabled", false)) }

    androidx.compose.runtime.DisposableEffect(prefs) {
        val listener = android.content.SharedPreferences.OnSharedPreferenceChangeListener { sp, key ->
            when (key) {
                "rom_gametdb_covers_enabled" -> isScraperEnabled = sp.getBoolean(key, false)
                "rom_gametdb_2d_covers_enabled" -> isGameTdb2dEnabled = sp.getBoolean(key, false)
                "rom_gametdb_3d_covers_enabled" -> isGameTdb3dEnabled = sp.getBoolean(key, false)
                "rom_ra_covers_enabled" -> isRaCoversEnabled = sp.getBoolean(key, false)
            }
        }
        prefs.registerOnSharedPreferenceChangeListener(listener)
        onDispose {
            prefs.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }
    val anyCoversEnabled = isScraperEnabled || isGameTdb2dEnabled || isGameTdb3dEnabled || isRaCoversEnabled
    val displayNameMode by me.magnum.melonds.ui.romlist.RomDisplayNameManager.modeFlow.collectAsState()

    RomListOverscrollProvider {
        LazyColumn(
            state = listState,
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                start = 0.dp,
                end = if (showAlphabetBar) 28.dp else 0.dp,
                top = 0.dp,
                bottom = rememberTrailingLetterScrollPadding(
                    viewportHeight = viewportHeight,
                    visibleItemHeightPx = listState.layoutInfo.visibleItemsInfo.maxOfOrNull { item -> item.size } ?: 0,
                    minimumPadding = if (state.filter == RomFilter.FAVORITES) 96.dp else 32.dp,
                ),
            ),
        ) {
            itemsIndexed(
                items = state.entries,
                key = { _, entry ->
                    when (entry) {
                        is RomBrowserEntry.Folder -> "folder:${entry.docId}"
                        is RomBrowserEntry.RomItem -> "rom:${entry.rom.uri}"
                    }
                },
                contentType = { _, entry ->
                    when (entry) {
                        is RomBrowserEntry.Folder -> "folder"
                        is RomBrowserEntry.RomItem -> "rom"
                    }
                },
            ) { index, entry ->
                when (entry) {
                    is RomBrowserEntry.Folder -> FolderListRow(
                        name = entry.name,
                        relativePath = entry.relativePath,
                        onClick = { onFolderClick(entry) },
                        modifier = rememberRomBrowserItemFocusModifier(
                            index = index,
                            focusKey = entry.focusKey(),
                            itemFocusRequesters = itemFocusRequesters,
                            focusedEntryIndex = focusedEntryIndex,
                            onFocusedEntryIndexChanged = onFocusedEntryIndexChanged,
                        ).cancelDpadDownIf(index == state.entries.lastIndex),
                    )
                    is RomBrowserEntry.RomItem -> {
                        LaunchedEffect(entry.rom.uri) {
                            onRomVisible(entry.rom)
                        }
                        key(displayNameMode) {
                        RomListRow(
                            rom = entry.rom,
                            coverUrl = coverByHash[entry.rom.retroAchievementsHash],
                            boxArtUrl = boxArtByUri[entry.rom.uri.toString()]?.takeIf { it.isNotEmpty() },
                            boxArtLoading = anyCoversEnabled && (boxArtByUri[entry.rom.uri.toString()] == null),
                            allowConfiguration = allowConfiguration,
                            showAchievementBadge = isRaAuthenticated && ((entry.rom.retroAchievementsHash in confirmedAchievementHashes) || entry.rom.retroAchievementsHash.isNotBlank()),
                            onClick = { onRomClick(entry.rom) },
                            onLongPress = {
                                onRomLongPress(entry.rom)
                            },
                            onConfigClick = { onRomConfigClick(entry.rom) },
                            modifier = rememberRomBrowserItemFocusModifier(
                                index = index,
                                focusKey = entry.focusKey(),
                                itemFocusRequesters = itemFocusRequesters,
                                focusedEntryIndex = focusedEntryIndex,
                                onFocusedEntryIndexChanged = onFocusedEntryIndexChanged,
                            ).cancelDpadDownIf(index == state.entries.lastIndex),
                        )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun rememberRomBrowserItemFocusModifier(
    index: Int,
    focusKey: String,
    itemFocusRequesters: MutableMap<String, FocusRequester>,
    focusedEntryIndex: Int,
    onFocusedEntryIndexChanged: (Int) -> Unit,
): Modifier {
    val focusRequester = remember(focusKey) { FocusRequester() }
    DisposableEffect(focusKey, focusRequester) {
        itemFocusRequesters[focusKey] = focusRequester
        onDispose {
            if (itemFocusRequesters[focusKey] == focusRequester) {
                itemFocusRequesters.remove(focusKey)
            }
        }
    }
    return Modifier
        .focusRequester(focusRequester)
        .onFocusChanged { focusState ->
            if (focusState.isFocused) {
                onFocusedEntryIndexChanged(index)
            } else if (focusedEntryIndex == index) {
                onFocusedEntryIndexChanged(-1)
            }
        }
}

private fun Modifier.cancelDpadDownIf(cancel: Boolean): Modifier {
    if (!cancel) {
        return this
    }

    return onPreviewKeyEvent { keyEvent ->
        keyEvent.type == KeyEventType.KeyDown && keyEvent.key == Key.DirectionDown
    }.focusProperties {
        down = FocusRequester.Cancel
    }
}

@Composable
private fun rememberTrailingLetterScrollPadding(
    viewportHeight: Dp,
    visibleItemHeightPx: Int,
    minimumPadding: Dp,
): Dp {
    return minimumPadding
}

private suspend fun requestFirstVisibleRomFocus(
    state: RomBrowserUiState,
    gridState: LazyGridState,
    listState: LazyListState,
    itemFocusRequesters: Map<String, FocusRequester>,
) {
    repeat(4) {
        withFrameNanos { }
        val visibleIndexes = when (state.viewMode) {
            RomViewMode.GRID -> gridState.layoutInfo.visibleItemsInfo.map { item -> item.index }
            RomViewMode.LIST -> listState.layoutInfo.visibleItemsInfo.map { item -> item.index }
        }.sorted()
        val targetEntry = visibleIndexes
            .asSequence()
            .mapNotNull { index -> state.entries.getOrNull(index) as? RomBrowserEntry.RomItem }
            .firstOrNull()
            ?: state.entries.filterIsInstance<RomBrowserEntry.RomItem>().firstOrNull()
        val focusRequester = targetEntry?.let { itemFocusRequesters[it.focusKey()] }
        if (focusRequester != null) {
            runCatching { focusRequester.requestFocus() }
            return
        }
    }
}

private suspend fun requestRomFocusAtIndex(
    state: RomBrowserUiState,
    targetIndex: Int,
    gridState: LazyGridState,
    listState: LazyListState,
    itemFocusRequesters: Map<String, FocusRequester>,
) {
    repeat(4) {
        withFrameNanos { }
        val targetEntry = state.entries.getOrNull(targetIndex) as? RomBrowserEntry.RomItem
        val focusRequester = targetEntry?.let { itemFocusRequesters[it.focusKey()] }
        if (focusRequester != null) {
            runCatching { focusRequester.requestFocus() }
            return
        }
    }

    requestFirstVisibleRomFocus(
        state = state,
        gridState = gridState,
        listState = listState,
        itemFocusRequesters = itemFocusRequesters,
    )
}

private fun RomBrowserEntry.focusKey(): String {
    return when (this) {
        is RomBrowserEntry.Folder -> "folder:$docId"
        is RomBrowserEntry.RomItem -> focusKey()
    }
}

private fun RomBrowserEntry.RomItem.focusKey(): String {
    return "rom:${rom.uri}"
}

private fun LazyGridState.currentColumnCount(): Int {
    return ((layoutInfo.visibleItemsInfo.maxOfOrNull { item -> item.column } ?: 0) + 1).coerceAtLeast(1)
}

private fun firstIndexInLastGridRow(totalItems: Int, columnCount: Int): Int {
    val lastIndex = totalItems - 1
    if (lastIndex < 0) {
        return Int.MAX_VALUE
    }
    return lastIndex - (lastIndex % columnCount.coerceAtLeast(1))
}

@Composable
private fun RomListOverscrollProvider(
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalOverscrollFactory provides null) {
        content()
    }
}

private fun letterForIndex(alphabetIndex: Map<Char, Int>, currentIndex: Int): Char? {
    if (alphabetIndex.isEmpty()) return null
    val firstLetter = alphabetIndex.keys.firstOrNull() ?: '#'
    val firstIndex = alphabetIndex.values.firstOrNull() ?: 0
    if (currentIndex <= firstIndex) return firstLetter

    var match: Char? = null
    var matchIndex = -1
    alphabetIndex.forEach { (letter, startIndex) ->
        if (startIndex <= currentIndex && startIndex > matchIndex) {
            match = letter
            matchIndex = startIndex
        }
    }
    return match ?: firstLetter
}

@Composable
private fun EmptyState(filter: RomFilter, isScanning: Boolean = false) {
    val colors = watermelon
    Box(modifier = Modifier.fillMaxSize().padding(32.dp), contentAlignment = Alignment.Center) {
        if (isScanning) {
            CircularProgressIndicator(
                color = colors.red,
            )
        } else {
            val msg = when (filter) {
                RomFilter.ALL -> stringResource(R.string.no_roms_found)
                RomFilter.FAVORITES -> stringResource(R.string.rom_no_favorites)
                RomFilter.DS_ONLY -> stringResource(R.string.rom_filter_ds_empty)
                RomFilter.DSI_ENHANCED_ONLY -> stringResource(R.string.rom_filter_dsi_enhanced_empty)
                RomFilter.DSIWARE_ONLY -> stringResource(R.string.rom_filter_dsiware_empty)
                RomFilter.WITH_RETRO_ACHIEVEMENTS -> stringResource(R.string.rom_filter_retro_achievements_empty)
                RomFilter.RECENTLY_PLAYED,
                RomFilter.UNPLAYED,
                RomFilter.HAS_SAVES -> stringResource(R.string.no_roms_found)
            }
            Text(
                text = msg,
                color = colors.text2,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Composable
private fun MultiplayerEntryButton(onClick: () -> Unit) {
    val colors = watermelon
    val shape = RoundedCornerShape(16.dp)
    val interactionSource = remember { androidx.compose.foundation.interaction.MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val nearby by MultiplayerNearby.rooms.collectAsState()
    Row(
        modifier = Modifier
            .height(32.dp)
            .clip(shape)
            .background(if (colors.isDark) colors.surface2 else colors.surface3)
            .let {
                if (isFocused) it.border(2.dp, colors.red, shape) else it
            }
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(start = 10.dp, end = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(7.dp),
    ) {
        if (nearby.isNotEmpty()) {
            Pulse()
        }
        Text(
            text = stringResource(R.string.multiplayer_title),
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 12.5.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}
