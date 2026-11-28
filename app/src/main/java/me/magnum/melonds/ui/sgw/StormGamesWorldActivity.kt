package me.magnum.melonds.ui.sgw

import android.os.Bundle
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.core.view.WindowCompat
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.ui.theme.MelonTheme

@AndroidEntryPoint
class StormGamesWorldActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_INITIAL_TAB = "sgw_initial_tab"
        const val EXTRA_HIGHLIGHT_ROM_URI = "sgw_highlight_rom_uri"
    }

    private val viewModel by viewModels<StormGamesWorldViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        AppThemeManager.applyEdgeToEdgeTheme(this)
        window.clearFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            intent?.getStringExtra(EXTRA_INITIAL_TAB)?.let { tabName ->
                runCatching { SgwStoreTab.valueOf(tabName) }.getOrNull()?.let(viewModel::selectTab)
            }
            intent?.getStringExtra(EXTRA_HIGHLIGHT_ROM_URI)?.takeIf { it.isNotBlank() }?.let { uri ->
                viewModel.setHighlightedRomUri(uri)
            }
        }

        setContent {
            MelonTheme {
                val snapshot by viewModel.snapshot.collectAsState()
                val isLoading by viewModel.isLoading.collectAsState()
                val selectedTab by viewModel.selectedTab.collectAsState()
                val searchQuery by viewModel.searchQuery.collectAsState()
                val downloadProgress by viewModel.downloadProgress.collectAsState()
                val isBusy by viewModel.isBusy.collectAsState()
                val highlightedRomUri by viewModel.highlightedRomUri.collectAsState()
                val lastReplaceResult by viewModel.lastReplaceResult.collectAsState()

                BackHandler { finish() }

                StormGamesWorldScreen(
                    snapshot = snapshot,
                    isLoading = isLoading,
                    selectedTab = selectedTab,
                    searchQuery = searchQuery,
                    downloadProgress = downloadProgress,
                    isBusy = isBusy,
                    highlightedRomUri = highlightedRomUri,
                    lastReplaceResult = lastReplaceResult,
                    onBack = { finish() },
                    onSelectTab = viewModel::selectTab,
                    onSearchChange = viewModel::updateSearchQuery,
                    onRefresh = { viewModel.refreshCatalog(force = true) },
                    onDownloadEntry = viewModel::downloadGame,
                    onUpdateRom = viewModel::updateInstalledRom,
                    onCancelDownload = viewModel::cancelDownload,
                    onDismissResult = viewModel::clearLastResult,
                )
            }
        }
    }
}
