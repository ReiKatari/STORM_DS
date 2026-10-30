package me.magnum.melonds.ui.settings.fragments

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.preference.Preference
import androidx.preference.SeekBarPreference
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.domain.model.SizeUnit
import me.magnum.melonds.impl.SettingsBackupManager
import me.magnum.melonds.ui.settings.PreferenceFragmentHelper
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
import me.magnum.melonds.ui.settings.viewmodel.RomPreferencesViewModel
import me.magnum.melonds.utils.SizeUtils
import javax.inject.Inject
import kotlin.math.pow

@AndroidEntryPoint
class RomsPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private val viewModel by viewModels<RomPreferencesViewModel>()
    private val helper by lazy { PreferenceFragmentHelper(this, uriPermissionManager, directoryAccessValidator) }
    @Inject lateinit var uriPermissionManager: UriPermissionManager
    @Inject lateinit var directoryAccessValidator: DirectoryAccessValidator
    @Inject lateinit var settingsBackupManager: SettingsBackupManager

    private lateinit var clearRomCachePreference: Preference

    override fun getTitle() = getString(R.string.category_roms)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_roms, rootKey)
        val cacheSizePreference = findPreference<SeekBarPreference>("rom_cache_max_size")!!
        clearRomCachePreference = findPreference<Preference>("rom_cache_clear") ?: findPreference("clear_rom_cache")!!

        helper.setupStoragePickerPreference(findPreference<StoragePickerPreference>("rom_search_dirs")!!) { uri, persistDirectory ->
            handleSettingsMirror(uri, persistDirectory)
        }

        updateMaxCacheSizePreferenceSummary(cacheSizePreference, cacheSizePreference.value)

        cacheSizePreference.setOnPreferenceChangeListener { preference, newValue ->
            updateMaxCacheSizePreferenceSummary(preference as SeekBarPreference, newValue as Int)
            true
        }
        val raCoversPref = findPreference<androidx.preference.SwitchPreference>("rom_ra_covers_enabled")
        val gameTdb2dCoversPref = findPreference<androidx.preference.SwitchPreference>("rom_gametdb_2d_covers_enabled")
        val gameTdb3dCoversPref = findPreference<androidx.preference.SwitchPreference>("rom_gametdb_3d_covers_enabled")

        clearRomCachePreference.setOnPreferenceClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle(R.string.v780_clear_rom_cache_confirm_title)
                .setMessage(R.string.v780_clear_rom_cache_confirm_message)
                .setPositiveButton(R.string.v780_clear_rom_cache_confirm_title) { _, _ ->
                    if (!viewModel.clearRomCache()) {
                        Toast.makeText(requireContext(), R.string.error_clear_rom_cache, Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(requireContext(), R.string.v780_clear_rom_cache_success, Toast.LENGTH_SHORT).show()
                    }
                }
                .setNegativeButton(android.R.string.cancel, null)
                .show()
            true
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.romCacheSize.collect {
                    val cacheSizeRepresentation = SizeUtils.getBestSizeStringRepresentation(requireContext(), it)
                    val summaryStr = getString(R.string.cache_size, cacheSizeRepresentation)
                    clearRomCachePreference.summary = summaryStr
                    findPreference<Preference>("clear_rom_cache")?.summary = summaryStr
                }
            }
        }
    }

    private fun updateMaxCacheSizePreferenceSummary(maxCacheSizePreference: SeekBarPreference, cacheSizeStep: Int) {
        val cacheSize = SizeUnit.MB(128) * 2.toDouble().pow(cacheSizeStep).toLong()
        maxCacheSizePreference.summary = SizeUtils.getBestSizeStringRepresentation(requireContext(), cacheSize)
    }

    private fun handleSettingsMirror(uri: Uri, persistDirectory: () -> Unit) {
        if (!settingsBackupManager.isMirrorEnabled()) {
            persistDirectory()
            return
        }

        if (!settingsBackupManager.hasMirrorAt(uri)) {
            settingsBackupManager.rememberMirrorFallback(uri)
            persistDirectory()
            settingsBackupManager.requestMirrorWrite()
            return
        }

        AlertDialog.Builder(requireContext())
            .setTitle(R.string.settings_mirror_detected_title)
            .setMessage(R.string.settings_mirror_detected_message)
            .setPositiveButton(R.string.settings_mirror_restore) { _, _ ->
                settingsBackupManager.rememberMirrorFallback(uri)
                settingsBackupManager.restoreMirrorFrom(uri)
                persistDirectory()
                settingsBackupManager.requestMirrorWrite()
            }
            .setNegativeButton(R.string.settings_mirror_ignore) { _, _ ->
                settingsBackupManager.rememberMirrorFallback(uri)
                persistDirectory()
                settingsBackupManager.overwriteMirrorAt(uri)
                settingsBackupManager.requestMirrorWrite()
            }
            .show()
    }
}
