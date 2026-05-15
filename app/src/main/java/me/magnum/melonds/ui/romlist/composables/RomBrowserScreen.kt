package me.magnum.melonds.ui.romlist.composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.LocalOverscrollFactory
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.RomFilter
import me.magnum.melonds.domain.model.RomScanningStatus
import me.magnum.melonds.domain.model.RomViewMode
import me.magnum.melonds.domain.model.SortingMode
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.RomBrowserEntry
import me.magnum.melonds.ui.romlist.RomBrowserUiState

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RomBrowserScreen(
    state: RomBrowserUiState,
    coverByHash: Map<String, String>,
    allowConfiguration: Boolean,
    scanningStatus: RomScanningStatus,
    confirmedAchievementHashes: Set<String>,
    onFolderClick: (RomBrowserEntry.Folder) -> Unit,
    onRomClick: (Rom) -> Unit,
    onRomLongPress: (Rom) -> Unit,
    onRomConfigClick: (Rom) -> Unit,
    onFilterSelected: (RomFilter) -> Unit,
    onNavigateUp: () -> Unit,
    onRefresh: () -> Unit,
) {
    val refreshState = rememberPullRefreshState(
        refreshing = scanningStatus == RomScanningStatus.SCANNING,
        onRefresh = onRefresh,
    )
    val coroutineScope = rememberCoroutineScope()
    val gridState = rememberLazyGridState()
    val listState = rememberLazyListState()
    val itemFocusRequesters = remember { mutableStateMapOf<String, FocusRequester>() }

    val folderCount = remember(state.entries) { state.entries.takeWhile { it is RomBrowserEntry.Folder }.size }
    val hasFolders = folderCount > 0
    val showAlphabetBar = (state.alphabetIndex.isNotEmpty() || hasFolders) && state.sortingMode == SortingMode.ALPHABETICALLY

    LaunchedEffect(state.filter, state.breadcrumbs, state.isSearchActive) {
        gridState.scrollToItem(0)
        listState.scrollToItem(0)
    }

    Surface(color = MaterialTheme.colors.surface, modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize().systemBarsPadding()) {
            Column(modifier = Modifier.fillMaxSize()) {
                BreadcrumbBar(
                    breadcrumbs = state.breadcrumbs,
                    canNavigateUp = state.canNavigateUp,
                    isAtVirtualRoot = state.isAtVirtualRoot,
                    isSearchActive = state.isSearchActive,
                    onNavigateUp = onNavigateUp,
                )

                if (scanningStatus == RomScanningStatus.SCANNING) {
                    LinearProgressIndicator(
                        color = MaterialTheme.colors.secondary,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }

                AnimatedVisibility(visible = state.isAtVirtualRoot && !state.isSearchActive && state.continuePlaying.isNotEmpty()) {
                    ContinuePlayingShelf(
                        roms = state.continuePlaying,
                        coverByHash = coverByHash,
                        onRomClicked = onRomClick,
                        onRomLongPressed = onRomLongPress,
                    )
                }

                FilterChipsRow(
                    selected = state.filter,
                    onFilterSelected = onFilterSelected,
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .pullRefresh(refreshState),
                ) {
                    if (state.entries.isEmpty()) {
                        EmptyState(filter = state.filter)
                    } else {
                        Crossfade(targetState = state.viewMode, label = "view_mode") { mode ->
                            when (mode) {
                                RomViewMode.GRID -> GridContent(
                                    state = state,
                                    gridState = gridState,
                                    coverByHash = coverByHash,
                                    confirmedAchievementHashes = confirmedAchievementHashes,
                                    showAlphabetBar = showAlphabetBar,
                                    itemFocusRequesters = itemFocusRequesters,
                                    onFolderClick = onFolderClick,
                                    onRomClick = onRomClick,
                                    onRomLongPress = onRomLongPress,
                                )
                                RomViewMode.LIST -> ListContent(
                                    state = state,
                                    listState = listState,
                                    coverByHash = coverByHash,
                                    allowConfiguration = allowConfiguration,
                                    confirmedAchievementHashes = confirmedAchievementHashes,
                                    showAlphabetBar = showAlphabetBar,
                                    itemFocusRequesters = itemFocusRequesters,
                                    onFolderClick = onFolderClick,
                                    onRomClick = onRomClick,
                                    onRomLongPress = onRomLongPress,
                                    onRomConfigClick = onRomConfigClick,
                                )
                            }
                        }
                    }
                    PullRefreshIndicator(
                        refreshing = scanningStatus == RomScanningStatus.SCANNING,
                        state = refreshState,
                        modifier = Modifier.align(Alignment.TopCenter),
                        backgroundColor = MaterialTheme.colors.surface,
                        contentColor = MaterialTheme.colors.secondary,
                    )
                }
            }

            if (showAlphabetBar) {
                val activeFirstVis by remember(state.viewMode) {
                    derivedStateOf {
                        when (state.viewMode) {
                            RomViewMode.GRID -> gridState.firstVisibleItemIndex
                            RomViewMode.LIST -> listState.firstVisibleItemIndex
                        }
                    }
                }
                val activeLetter by remember(state.alphabetIndex, state.viewMode) {
                    derivedStateOf { letterForIndex(state.alphabetIndex, activeFirstVis) }
                }
                val isInFolderSection by remember(folderCount, state.viewMode) {
                    derivedStateOf { hasFolders && activeFirstVis < folderCount }
                }
                AlphabetIndexBar(
                    alphabetIndex = state.alphabetIndex,
                    activeLetter = activeLetter,
                    hasFolders = hasFolders,
                    isInFolderSection = isInFolderSection,
                    onFoldersClicked = {
                        coroutineScope.launch {
                            when (state.viewMode) {
                                RomViewMode.GRID -> gridState.scrollToItem(0)
                                RomViewMode.LIST -> listState.scrollToItem(0)
                            }
                            requestFirstVisibleRomFocus(
                                state = state,
                                gridState = gridState,
                                listState = listState,
                                itemFocusRequesters = itemFocusRequesters,
                            )
                        }
                    },
                    onLetterTouched = { idx, letter ->
                        coroutineScope.launch {
                            when (state.viewMode) {
                                RomViewMode.GRID -> smartScrollGrid(gridState, idx, letter, state.alphabetIndex)
                                RomViewMode.LIST -> smartScrollList(listState, idx, letter, state.alphabetIndex)
                            }
                            requestFirstVisibleRomFocus(
                                state = state,
                                gridState = gridState,
                                listState = listState,
                                itemFocusRequesters = itemFocusRequesters,
                            )
                        }
                    },
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }
    }
}

@Composable
private fun GridContent(
    state: RomBrowserUiState,
    gridState: LazyGridState,
    coverByHash: Map<String, String>,
    confirmedAchievementHashes: Set<String>,
    showAlphabetBar: Boolean,
    itemFocusRequesters: MutableMap<String, FocusRequester>,
    onFolderClick: (RomBrowserEntry.Folder) -> Unit,
    onRomClick: (Rom) -> Unit,
    onRomLongPress: (Rom) -> Unit,
) {
    RomListOverscrollProvider(filter = state.filter) {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 120.dp),
            state = gridState,
            contentPadding = PaddingValues(
                start = 12.dp,
                end = if (showAlphabetBar) 36.dp else 12.dp,
                top = 8.dp,
                bottom = if (state.filter == RomFilter.FAVORITES) 96.dp else 32.dp,
            ),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxSize(),
        ) {
            items(
                items = state.entries,
                key = { entry ->
                    when (entry) {
                        is RomBrowserEntry.Folder -> "folder:${entry.docId}"
                        is RomBrowserEntry.RomItem -> "rom:${entry.rom.uri}"
                    }
                },
            ) { entry ->
                when (entry) {
                    is RomBrowserEntry.Folder -> FolderGridCard(
                        name = entry.name,
                        relativePath = entry.relativePath,
                        onClick = { onFolderClick(entry) },
                        modifier = rememberRomBrowserItemFocusModifier(entry.focusKey(), itemFocusRequesters),
                    )
                    is RomBrowserEntry.RomItem -> RomGridCard(
                        rom = entry.rom,
                        coverUrl = coverByHash[entry.rom.retroAchievementsHash],
                        showAchievementBadge = entry.rom.retroAchievementsHash in confirmedAchievementHashes,
                        onClick = { onRomClick(entry.rom) },
                        onLongPress = { onRomLongPress(entry.rom) },
                        modifier = rememberRomBrowserItemFocusModifier(entry.focusKey(), itemFocusRequesters),
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
    allowConfiguration: Boolean,
    confirmedAchievementHashes: Set<String>,
    showAlphabetBar: Boolean,
    itemFocusRequesters: MutableMap<String, FocusRequester>,
    onFolderClick: (RomBrowserEntry.Folder) -> Unit,
    onRomClick: (Rom) -> Unit,
    onRomLongPress: (Rom) -> Unit,
    onRomConfigClick: (Rom) -> Unit,
) {
    RomListOverscrollProvider(filter = state.filter) {
        LazyColumn(
            state = listState,
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                start = 0.dp,
                end = if (showAlphabetBar) 36.dp else 0.dp,
                top = 4.dp,
                bottom = if (state.filter == RomFilter.FAVORITES) 96.dp else 32.dp,
            ),
        ) {
            items(
                items = state.entries,
                key = { entry ->
                    when (entry) {
                        is RomBrowserEntry.Folder -> "folder:${entry.docId}"
                        is RomBrowserEntry.RomItem -> "rom:${entry.rom.uri}"
                    }
                },
            ) { entry ->
                when (entry) {
                    is RomBrowserEntry.Folder -> FolderListRow(
                        name = entry.name,
                        relativePath = entry.relativePath,
                        onClick = { onFolderClick(entry) },
                        modifier = rememberRomBrowserItemFocusModifier(entry.focusKey(), itemFocusRequesters),
                    )
                    is RomBrowserEntry.RomItem -> RomListRow(
                        rom = entry.rom,
                        coverUrl = coverByHash[entry.rom.retroAchievementsHash],
                        allowConfiguration = allowConfiguration,
                        showAchievementBadge = entry.rom.retroAchievementsHash in confirmedAchievementHashes,
                        onClick = { onRomClick(entry.rom) },
                        onLongPress = { onRomLongPress(entry.rom) },
                        onConfigClick = { onRomConfigClick(entry.rom) },
                        modifier = rememberRomBrowserItemFocusModifier(entry.focusKey(), itemFocusRequesters),
                    )
                }
            }
        }
    }
}

@Composable
private fun rememberRomBrowserItemFocusModifier(
    focusKey: String,
    itemFocusRequesters: MutableMap<String, FocusRequester>,
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
    return Modifier.focusRequester(focusRequester)
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
        val focusRequester = targetEntry?.let { itemFocusRequesters[it.focusKey()] }
        if (focusRequester != null) {
            runCatching { focusRequester.requestFocus() }
            return
        }
    }
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

@Composable
private fun RomListOverscrollProvider(
    filter: RomFilter,
    content: @Composable () -> Unit,
) {
    if (filter == RomFilter.FAVORITES) {
        CompositionLocalProvider(LocalOverscrollFactory provides null) {
            content()
        }
    } else {
        content()
    }
}

private suspend fun smartScrollGrid(
    state: LazyGridState,
    idx: Int,
    @Suppress("UNUSED_PARAMETER") letter: Char,
    @Suppress("UNUSED_PARAMETER") alphabetIndex: Map<Char, Int>,
) {
    val visibleItems = state.layoutInfo.visibleItemsInfo
    val total = state.layoutInfo.totalItemsCount
    val cols = ((visibleItems.maxOfOrNull { it.column } ?: 0) + 1).coerceAtLeast(1)
    val visibleRows = visibleItems.distinctBy { it.row }.size.coerceAtLeast(1)
    val targetRow = idx / cols
    val totalRows = (total + cols - 1) / cols
    val rowsAfterTarget = (totalRows - 1) - targetRow

    if (rowsAfterTarget >= visibleRows) {
        state.scrollToItem(idx)
    } else {
        val firstRow = (targetRow - visibleRows + 1).coerceAtLeast(0)
        state.scrollToItem(firstRow * cols)
    }
}

private suspend fun smartScrollList(
    state: LazyListState,
    idx: Int,
    @Suppress("UNUSED_PARAMETER") letter: Char,
    @Suppress("UNUSED_PARAMETER") alphabetIndex: Map<Char, Int>,
) {
    val visibleCount = state.layoutInfo.visibleItemsInfo.size.coerceAtLeast(1)
    val total = state.layoutInfo.totalItemsCount
    val itemsAfterTarget = (total - 1) - idx

    if (itemsAfterTarget >= visibleCount) {
        state.scrollToItem(idx)
    } else {
        val firstVis = (idx - visibleCount + 1).coerceAtLeast(0)
        state.scrollToItem(firstVis)
    }
}

private fun letterForIndex(alphabetIndex: Map<Char, Int>, currentIndex: Int): Char? {
    if (alphabetIndex.isEmpty()) return null
    var match: Char? = null
    var matchIndex = -1
    alphabetIndex.forEach { (letter, startIndex) ->
        if (startIndex <= currentIndex && startIndex > matchIndex) {
            match = letter
            matchIndex = startIndex
        }
    }
    return match
}

@Composable
private fun EmptyState(filter: RomFilter) {
    Box(modifier = Modifier.fillMaxSize().padding(32.dp), contentAlignment = Alignment.Center) {
        val msg = when (filter) {
            RomFilter.ALL -> stringResource(R.string.no_roms_found)
            RomFilter.FAVORITES -> stringResource(R.string.rom_no_favorites)
            else -> stringResource(R.string.rom_no_results_filter)
        }
        Text(
            text = msg,
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onSurface,
            textAlign = TextAlign.Center,
        )
    }
}
