package me.magnum.melonds.ui.romdetails.ui

import android.view.KeyEvent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Surface
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowSizeClass
import kotlinx.coroutines.launch
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.common.UnifiedBackButton
import me.magnum.melonds.ui.common.WatermelonRowSeparator
import me.magnum.melonds.ui.romdetails.model.OfflineAchievementsUiState
import me.magnum.melonds.ui.romdetails.model.RomConfigUiState
import me.magnum.melonds.ui.romdetails.model.RomConfigUpdateEvent
import me.magnum.melonds.ui.romdetails.model.RomDetailsTab
import me.magnum.melonds.ui.romdetails.model.RomRetroAchievementsUiState
import me.magnum.melonds.ui.theme.watermelon
import me.magnum.rcheevosapi.model.RAAchievement

@Composable
fun RomDetailsScreen(
    rom: Rom,
    boxArtUrl: String?,
    raCoverUrl: String?,
    romConfigUiState: RomConfigUiState,
    retroAchievementsUiState: RomRetroAchievementsUiState,
    offlineAchievementsUiState: OfflineAchievementsUiState,
    onNavigateBack: () -> Unit,
    onLaunchRom: (Rom) -> Unit,
    onRomConfigUpdate: (RomConfigUpdateEvent) -> Unit,
    onCustomInputConfigEdited: () -> Unit,
    onRetroAchievementsLogin: (username: String, password: String) -> Unit,
    onRetroAchievementsRetryLoad: () -> Unit,
    onViewAchievement: (RAAchievement) -> Unit,
    onOfflineSyncNow: () -> Unit,
    onSendSaveFile: () -> Unit,
    onImportSaveFile: () -> Unit,
    onAchievementFocused: (me.magnum.melonds.ui.common.achievements.ui.model.AchievementUiModel?) -> Unit = {},
    onSettingFocused: (String?, String?) -> Unit = { _, _ -> },
) {
    val colors = watermelon
    val pagerState = rememberPagerState(
        initialPage = RomDetailsTab.OVERVIEW.tabIndex,
        pageCount = { RomDetailsTab.entries.size },
    )
    LaunchedEffect(pagerState.currentPage) {
        if (pagerState.currentPage != RomDetailsTab.RETRO_ACHIEVEMENTS.tabIndex) {
            onAchievementFocused(null)
        }
        if (pagerState.currentPage != RomDetailsTab.CONFIG.tabIndex) {
            onSettingFocused(null, null)
        }
    }
    val focusRequester = remember { FocusRequester() }
    val pageFocusRequesters = remember { List(RomDetailsTab.entries.size) { FocusRequester() } }
    val coroutineScope = rememberCoroutineScope()
    val navigateToTab = remember(coroutineScope, pagerState) {
        { tab: RomDetailsTab ->
            coroutineScope.launch {
                pagerState.animateScrollToPage(tab.tabIndex)
                pageFocusRequesters[tab.tabIndex].requestFocus()
            }
            Unit
        }
    }

    val windowSizeClass = currentWindowAdaptiveInfo().windowSizeClass
    val isLandscape = windowSizeClass.isWidthAtLeastBreakpoint(WindowSizeClass.WIDTH_DP_MEDIUM_LOWER_BOUND)

    val keyHandlingModifier = Modifier.onPreviewKeyEvent {
        if (it.nativeKeyEvent.action == KeyEvent.ACTION_DOWN) {
            when (it.key) {
                Key.ButtonL1 -> {
                    if (pagerState.currentPage > 0) {
                        navigateToTab(RomDetailsTab.entries[pagerState.currentPage - 1])
                        return@onPreviewKeyEvent true
                    }
                }
                Key.ButtonR1 -> {
                    if (pagerState.currentPage < RomDetailsTab.entries.lastIndex) {
                        navigateToTab(RomDetailsTab.entries[pagerState.currentPage + 1])
                        return@onPreviewKeyEvent true
                    }
                }
                Key.ButtonStart -> onLaunchRom(rom)
            }
        }
        false
    }

    val currentTab = RomDetailsTab.entries[pagerState.currentPage]

    Surface(color = colors.bg, modifier = Modifier.fillMaxSize().then(keyHandlingModifier)) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Compact Header Strip matching SettingsActivity top statusBar + displayCutout insets
            RomDetailsCompactTopBar(
                rom = rom,
                boxArtUrl = boxArtUrl,
                raCoverUrl = raCoverUrl,
                showQuickLaunch = currentTab != RomDetailsTab.OVERVIEW,
                onLaunchRom = { onLaunchRom(rom) },
                modifier = Modifier
                    .background(colors.bg)
                    .windowInsetsPadding(WindowInsets.statusBars.union(WindowInsets.displayCutout).only(WindowInsetsSides.Top))
                    .windowInsetsPadding(WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal)),
            )

            // Tab Strip (Overview | Config | Cheats | Achievements | Offline)
            RomDetailsTabRow(
                currentTab = currentTab,
                onTabClicked = navigateToTab,
                modifier = Modifier.windowInsetsPadding(WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal)),
            )

            // Full-Screen Pager Body
            HorizontalPager(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .windowInsetsPadding(WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal)),
                state = pagerState,
                userScrollEnabled = false,
            ) { pageIndex ->
                val pageFocusRequester = pageFocusRequesters[pageIndex]
                when (pageIndex) {
                    RomDetailsTab.OVERVIEW.tabIndex -> {
                        RomOverviewTab(
                            rom = rom,
                            boxArtUrl = boxArtUrl,
                            raCoverUrl = raCoverUrl,
                            isLandscape = isLandscape,
                            initialFocusRequester = focusRequester,
                            onLaunchRom = { onLaunchRom(rom) },
                            onSendSaveFile = onSendSaveFile,
                            onImportSaveFile = onImportSaveFile,
                            modifier = Modifier
                                .fillMaxSize()
                                .focusRequester(pageFocusRequester),
                        )
                    }
                    RomDetailsTab.CONFIG.tabIndex -> {
                        RomConfigUi(
                            modifier = Modifier
                                .fillMaxSize()
                                .focusRequester(pageFocusRequester),
                            contentPadding = PaddingValues(bottom = 12.dp),
                            rom = rom,
                            romConfigUiState = romConfigUiState,
                            onConfigUpdate = onRomConfigUpdate,
                            onCustomInputConfigEdited = onCustomInputConfigEdited,
                            onSettingFocused = { title, value -> onSettingFocused(title, value) },
                        )
                    }
                    RomDetailsTab.CHEATS.tabIndex -> {
                        RomCheatsUi(
                            rom = rom,
                            modifier = Modifier
                                .fillMaxSize()
                                .focusRequester(pageFocusRequester),
                        )
                    }
                    RomDetailsTab.RETRO_ACHIEVEMENTS.tabIndex -> {
                        RomRetroAchievementsUi(
                            modifier = Modifier
                                .fillMaxSize()
                                .focusRequester(pageFocusRequester),
                            contentPadding = PaddingValues(bottom = 12.dp),
                            retroAchievementsUiState = retroAchievementsUiState,
                            offlineAchievementsUiState = offlineAchievementsUiState,
                            onLogin = onRetroAchievementsLogin,
                            onRetryLoad = onRetroAchievementsRetryLoad,
                            onViewAchievement = onViewAchievement,
                            onSyncOfflineNow = onOfflineSyncNow,
                            onAchievementFocused = { onAchievementFocused(it) },
                        )
                    }
                    RomDetailsTab.OFFLINE_ACHIEVEMENTS.tabIndex -> {
                        RomOfflineAchievementsUi(
                            modifier = Modifier
                                .fillMaxSize()
                                .focusRequester(pageFocusRequester),
                            contentPadding = PaddingValues(bottom = 12.dp),
                            offlineAchievementsUiState = offlineAchievementsUiState,
                            onSyncOfflineNow = onOfflineSyncNow,
                        )
                    }
                }
            }

            // Unified Bottom-Centered Circular Back Button Footer
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colors.bg)
                    .windowInsetsPadding(WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal))
                    .navigationBarsPadding(),
            ) {
                WatermelonRowSeparator()
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, bottom = 14.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    UnifiedBackButton(onClick = onNavigateBack)
                }
            }
        }

        LaunchedEffect(focusRequester) {
            runCatching { focusRequester.requestFocus() }
        }
    }
}
