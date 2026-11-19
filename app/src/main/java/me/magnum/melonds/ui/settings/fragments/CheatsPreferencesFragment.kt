package me.magnum.melonds.ui.settings.fragments

import android.Manifest
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DeleteSweep
import androidx.compose.runtime.CompositionLocalProvider
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.SwitchPreference
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.common.Permission
import me.magnum.melonds.common.contracts.FilePickerContract
import me.magnum.melonds.domain.model.CheatImportProgress
import me.magnum.melonds.extensions.isNotificationPermissionGranted
import me.magnum.melonds.ui.settings.CheatsImportProgressDialog
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.dialogs.SettingsConfirmDialogContent
import me.magnum.melonds.ui.settings.dialogs.showCheatDatabaseSearchDialog
import me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog
import me.magnum.melonds.ui.settings.viewmodel.CheatsPreferencesViewModel
import me.magnum.melonds.ui.settings.viewmodel.OnlineCheatsDownloadResult
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@AndroidEntryPoint
class CheatsPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private val viewModel by viewModels<CheatsPreferencesViewModel>()
    private var isDownloadingOnline = false

    private val cheatFilePickerLauncher = registerForActivityResult(FilePickerContract(Permission.READ)) {
        if (it != null) {
            viewModel.importCheatsDatabase(it)
            CheatsImportProgressDialog().show(childFragmentManager, null)
        }
    }

    private val notificationPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
        handleCheatsImport()
    }

    override fun getTitle() = getString(R.string.cheats)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_cheats, rootKey)
        val importCheatsPreference = findPreference<Preference>("cheats_import")!!
        val downloadCheatsPreference = findPreference<Preference>("cheats_download_online")
        val downloadMirrorPreference = findPreference<ListPreference>(CheatsPreferencesViewModel.PREF_CHEATS_DOWNLOAD_MIRROR)
        val searchDatabasePreference = findPreference<Preference>("cheats_search_database")
        val clearDatabasePreference = findPreference<Preference>("cheats_clear_database")

        downloadCheatsPreference?.setOnPreferenceClickListener {
            if (isDownloadingOnline || viewModel.areCheatsBeingImported()) {
                if (viewModel.areCheatsBeingImported()) {
                    CheatsImportProgressDialog().show(childFragmentManager, null)
                }
                return@setOnPreferenceClickListener true
            }
            isDownloadingOnline = true
            downloadCheatsPreference.isEnabled = false
            downloadCheatsPreference.summary = getString(R.string.cheats_downloading_progress)
            val selectedMirror = downloadMirrorPreference?.value
            lifecycleScope.launch {
                val result = viewModel.downloadAndImportOnlineCheats(selectedMirror)
                isDownloadingOnline = false
                if (!isAdded) return@launch
                downloadCheatsPreference.isEnabled = true
                downloadCheatsPreference.summary = getString(R.string.cheats_download_online_summary)
                when (result) {
                    is OnlineCheatsDownloadResult.OnlineUsrCheatImportStarted -> {
                        CheatsImportProgressDialog().show(childFragmentManager, null)
                    }
                    is OnlineCheatsDownloadResult.EmbeddedFallbackLoaded -> {
                        updateDatabaseStatusSummary()
                        Toast.makeText(
                            requireContext(),
                            getString(R.string.cheats_download_fallback_embedded, result.gamesCount),
                            Toast.LENGTH_LONG
                        ).show()
                    }
                    is OnlineCheatsDownloadResult.Failed -> {
                        Toast.makeText(requireContext(), R.string.cheats_import_failed, Toast.LENGTH_LONG).show()
                    }
                }
            }
            true
        }

        importCheatsPreference.setOnPreferenceClickListener {
            if (!requestNotificationPermission()) {
                handleCheatsImport()
            }
            true
        }

        searchDatabasePreference?.setOnPreferenceClickListener {
            lifecycleScope.launch {
                val (games, _) = viewModel.getDatabaseStats()
                if (!isAdded) return@launch
                showCheatDatabaseSearchDialog(
                    context = requireContext(),
                    totalGamesCount = games,
                    onSearch = { query -> viewModel.searchGames(query) },
                )
            }
            true
        }

        clearDatabasePreference?.setOnPreferenceClickListener {
            val ctx = requireContext()
            val colors = AppThemeManager.getCurrentWatermelonColors(ctx)
            showSettingsComposeDialog(ctx) { dismiss ->
                CompositionLocalProvider(LocalWatermelonColors provides colors) {
                    SettingsConfirmDialogContent(
                        title = getString(R.string.cheats_clear_database_confirm_title),
                        message = getString(R.string.cheats_clear_database_confirm_message),
                        confirmText = getString(R.string.cheats_clear_database_confirm_action),
                        cancelText = getString(R.string.cancel),
                        icon = Icons.Filled.DeleteSweep,
                        isDestructive = true,
                        onConfirm = {
                            lifecycleScope.launch {
                                viewModel.clearCheatDatabase()
                                if (!isAdded) return@launch
                                updateDatabaseStatusSummary()
                                Toast.makeText(
                                    requireContext(),
                                    R.string.cheats_clear_database_success,
                                    Toast.LENGTH_SHORT,
                                ).show()
                            }
                        },
                        onDismiss = dismiss,
                    )
                }
            }
            true
        }

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.observeCheatsImportProgress().collect { progress ->
                    if (progress.status == CheatImportProgress.CheatImportStatus.NOT_IMPORTING ||
                        progress.status == CheatImportProgress.CheatImportStatus.FINISHED ||
                        progress.status == CheatImportProgress.CheatImportStatus.FAILED
                    ) {
                        updateDatabaseStatusSummary()
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        updateDatabaseStatusSummary()
    }

    private fun updateDatabaseStatusSummary() {
        val cheatsEnabledPref = findPreference<SwitchPreference>("cheats_enabled") ?: return
        lifecycleScope.launch {
            val (games, cheats) = viewModel.getDatabaseStats()
            val lastUpdatedMs = viewModel.getDatabaseLastUpdatedMs()
            if (!isAdded) return@launch
            cheatsEnabledPref.summary = if (games > 0 && cheats > 0) {
                if (lastUpdatedMs > 0L) {
                    val formattedDate = SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault())
                        .format(Date(lastUpdatedMs))
                    getString(R.string.cheats_db_status_loaded_with_date, games, cheats, formattedDate)
                } else {
                    getString(R.string.cheats_db_status_loaded, games, cheats)
                }
            } else {
                getString(R.string.cheats_db_status_empty)
            }
        }
    }

    private fun handleCheatsImport() {
        if (viewModel.areCheatsBeingImported()) {
            CheatsImportProgressDialog().show(childFragmentManager, null)
        } else {
            cheatFilePickerLauncher.launch(Pair(null, arrayOf("text/xml", "application/xml", "application/zip", "application/octet-stream", "*/*")))
        }
    }

    private fun requestNotificationPermission(): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
            return false
        }

        return if (requireContext().isNotificationPermissionGranted()) {
            false
        } else {
            notificationPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
            true
        }
    }
}
