package me.magnum.melonds.ui.romlist

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import me.magnum.melonds.domain.model.RomScanningStatus
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.parcelables.RomParcelable
import me.magnum.melonds.ui.romdetails.RomDetailsActivity
import me.magnum.melonds.ui.romlist.composables.RomBrowserScreen
import me.magnum.melonds.ui.romlist.composables.RomContextMenu
import me.magnum.melonds.ui.theme.MelonTheme

@AndroidEntryPoint
class RomListFragment : Fragment() {
    companion object {
        private const val KEY_ALLOW_ROM_CONFIGURATION = "allow_rom_configuration"
        private const val KEY_ROM_ENABLE_CRITERIA = "rom_enable_criteria"

        fun newInstance(allowRomConfiguration: Boolean, enableCriteria: RomEnableCriteria): RomListFragment {
            return RomListFragment().also {
                it.arguments = bundleOf(
                    KEY_ALLOW_ROM_CONFIGURATION to allowRomConfiguration,
                    KEY_ROM_ENABLE_CRITERIA to enableCriteria.toString(),
                )
            }
        }
    }

    enum class RomEnableCriteria {
        ENABLE_ALL,
        ENABLE_NON_DSIWARE,
    }

    @Inject lateinit var settingsRepository: SettingsRepository

    private val romListViewModel: RomListViewModel by activityViewModels()
    private lateinit var backPressedCallback: OnBackPressedCallback

    private var romSelectedListener: ((Rom) -> Unit)? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val allowRomConfiguration = arguments?.getBoolean(KEY_ALLOW_ROM_CONFIGURATION) ?: true

        backPressedCallback = object : OnBackPressedCallback(false) {
            override fun handleOnBackPressed() {
                romListViewModel.navigateUp()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this, backPressedCallback)

        return ComposeView(requireContext()).apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MelonTheme {
                    val state by romListViewModel.browserState.collectAsState()
                    val scanningStatus by romListViewModel.romScanningStatus
                        .collectAsState(initial = RomScanningStatus.NOT_SCANNING)
                    val confirmedAchievementHashes by romListViewModel.confirmedAchievementHashes.collectAsState()
                    val raCoverByHash by romListViewModel.raCoverByHash.collectAsState()
                    var contextRomUri by remember { mutableStateOf<String?>(null) }

                    backPressedCallback.isEnabled = state.canNavigateUp && !state.isSearchActive

                    val currentContextRom: Rom? = remember(contextRomUri, state.entries, state.continuePlaying) {
                        val target = contextRomUri ?: return@remember null
                        state.entries.firstNotNullOfOrNull {
                            (it as? RomBrowserEntry.RomItem)?.rom?.takeIf { r -> r.uri.toString() == target }
                        } ?: state.continuePlaying.firstOrNull { it.uri.toString() == target }
                    }

                    RomBrowserScreen(
                        state = state,
                        coverByHash = raCoverByHash,
                        allowConfiguration = allowRomConfiguration,
                        scanningStatus = scanningStatus,
                        confirmedAchievementHashes = confirmedAchievementHashes,
                        onFolderClick = { folder -> romListViewModel.openFolder(folder.docId) },
                        onRomClick = { rom ->
                            romListViewModel.setRomLastPlayedNow(rom)
                            romSelectedListener?.invoke(rom)
                        },
                        onRomLongPress = { rom -> contextRomUri = rom.uri.toString() },
                        onRomConfigClick = { rom -> openRomDetails(rom) },
                        onFilterSelected = { filter -> romListViewModel.setFilter(filter) },
                        onNavigateUp = { romListViewModel.navigateUp() },
                        onRefresh = { romListViewModel.refreshRoms() },
                    )

                    RomContextMenu(
                        rom = currentContextRom,
                        onDismiss = { contextRomUri = null },
                        onToggleFavorite = { rom -> romListViewModel.toggleFavorite(rom) },
                        onShowDetails = { rom -> openRomDetails(rom) },
                        onShare = { rom -> shareRom(rom) },
                    )
                }
            }
        }
    }

    private fun openRomDetails(rom: Rom) {
        val intent = Intent(requireContext(), RomDetailsActivity::class.java).apply {
            putExtra(RomDetailsActivity.KEY_ROM, RomParcelable(rom))
        }
        startActivity(intent)
    }

    private fun shareRom(rom: Rom) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "application/octet-stream"
            putExtra(Intent.EXTRA_STREAM, rom.uri)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }
        startActivity(Intent.createChooser(intent, rom.config.customName ?: rom.name))
    }

    fun setRomSelectedListener(listener: (Rom) -> Unit) {
        romSelectedListener = listener
    }
}
