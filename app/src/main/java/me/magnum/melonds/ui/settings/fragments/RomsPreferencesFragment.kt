package me.magnum.melonds.ui.settings.fragments

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.net.toUri
import androidx.documentfile.provider.DocumentFile
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.preference.Preference
import androidx.preference.PreferenceManager
import androidx.preference.SeekBarPreference
import androidx.preference.SwitchPreference
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.domain.model.SizeUnit
import me.magnum.melonds.extensions.addOnPreferenceChangeListener
import me.magnum.melonds.impl.SettingsBackupManager
import me.magnum.melonds.ui.settings.PreferenceFragmentHelper
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
import me.magnum.melonds.ui.settings.viewmodel.RomPreferencesViewModel
import me.magnum.melonds.utils.FileUtils
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
    private var romSearchDirsPref: StoragePickerPreference? = null
    private var gameTdbMasterPref: SwitchPreference? = null
    private var gameTdb2dCoversPref: SwitchPreference? = null
    private var gameTdb3dCoversPref: SwitchPreference? = null
    private var raCoversPref: SwitchPreference? = null

    override fun getTitle() = getString(R.string.category_roms)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_roms, rootKey)
        val cacheSizePreference = findPreference<SeekBarPreference>("rom_cache_max_size")!!
        clearRomCachePreference = findPreference<Preference>("rom_cache_clear") ?: findPreference("clear_rom_cache")!!

        romSearchDirsPref = findPreference<StoragePickerPreference>("rom_search_dirs")
        romSearchDirsPref?.let { dirsPref ->
            helper.setupStoragePickerPreference(dirsPref) { uri, persistDirectory ->
                handleSettingsMirror(uri, persistDirectory)
            }
            dirsPref.addOnPreferenceChangeListener { _, newValue ->
                updateRomSearchDirsSummary(newValue as? Set<*>)
                true
            }
            updateRomSearchDirsSummary()
        }

        updateMaxCacheSizePreferenceSummary(cacheSizePreference, cacheSizePreference.value)

        cacheSizePreference.setOnPreferenceChangeListener { preference, newValue ->
            updateMaxCacheSizePreferenceSummary(preference as SeekBarPreference, newValue as Int)
            true
        }

        gameTdbMasterPref = findPreference("rom_gametdb_covers_enabled")
        gameTdb2dCoversPref = findPreference("rom_gametdb_2d_covers_enabled")
        gameTdb3dCoversPref = findPreference("rom_gametdb_3d_covers_enabled")
        raCoversPref = findPreference("rom_ra_covers_enabled")

        setupCoverPreferences()
        syncCoverPreferencesState()
        updateRaCoversSummary()

        clearRomCachePreference.setOnPreferenceClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle(R.string.v780_clear_rom_cache_confirm_title)
                .setMessage(R.string.v780_clear_rom_cache_confirm_message)
                .setPositiveButton(R.string.v780_clear_rom_cache_confirm_title) { _, _ ->
                    viewLifecycleOwner.lifecycleScope.launch {
                        val cleared = viewModel.clearRomCache()
                        val ctx = context ?: return@launch
                        if (!cleared) {
                            Toast.makeText(ctx, R.string.error_clear_rom_cache, Toast.LENGTH_LONG).show()
                        } else {
                            Toast.makeText(ctx, R.string.v780_clear_rom_cache_success, Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                .setNegativeButton(android.R.string.cancel, null)
                .show()
            true
        }
    }

    override fun onResume() {
        super.onResume()
        updateRomSearchDirsSummary()
        syncCoverPreferencesState()
        updateRaCoversSummary()
    }

    private fun setupCoverPreferences() {
        gameTdbMasterPref?.setOnPreferenceChangeListener { _, newValue ->
            val enabled = newValue as Boolean
            gameTdb2dCoversPref?.isVisible = enabled
            gameTdb3dCoversPref?.isVisible = enabled
            if (enabled) {
                val has2d = gameTdb2dCoversPref?.isChecked == true
                val has3d = gameTdb3dCoversPref?.isChecked == true
                if (has2d && has3d) {
                    gameTdb2dCoversPref?.isChecked = false
                } else if (!has2d && !has3d) {
                    gameTdb3dCoversPref?.isChecked = true
                }
            } else {
                gameTdb2dCoversPref?.isChecked = false
                gameTdb3dCoversPref?.isChecked = false
            }
            view?.post { if (isAdded) updateRaCoversSummary() }
            true
        }

        gameTdb2dCoversPref?.setOnPreferenceChangeListener { _, newValue ->
            val enabled = newValue as Boolean
            if (enabled) {
                gameTdb3dCoversPref?.isChecked = false
            } else if (gameTdb3dCoversPref?.isChecked != true) {
                gameTdbMasterPref?.isChecked = false
                gameTdb2dCoversPref?.isVisible = false
                gameTdb3dCoversPref?.isVisible = false
            }
            view?.post { if (isAdded) updateRaCoversSummary() }
            true
        }

        gameTdb3dCoversPref?.setOnPreferenceChangeListener { _, newValue ->
            val enabled = newValue as Boolean
            if (enabled) {
                gameTdb2dCoversPref?.isChecked = false
            } else if (gameTdb2dCoversPref?.isChecked != true) {
                gameTdbMasterPref?.isChecked = false
                gameTdb2dCoversPref?.isVisible = false
                gameTdb3dCoversPref?.isVisible = false
            }
            view?.post { if (isAdded) updateRaCoversSummary() }
            true
        }

        raCoversPref?.setOnPreferenceChangeListener { _, _ ->
            view?.post { if (isAdded) updateRaCoversSummary() }
            true
        }
    }

    private fun syncCoverPreferencesState() {
        val master = gameTdbMasterPref ?: return
        val pref2d = gameTdb2dCoversPref
        val pref3d = gameTdb3dCoversPref

        if (!master.isChecked && (pref2d?.isChecked == true || pref3d?.isChecked == true)) {
            master.isChecked = true
        }

        val masterOn = master.isChecked
        pref2d?.isVisible = masterOn
        pref3d?.isVisible = masterOn
        if (masterOn) {
            val is2d = pref2d?.isChecked == true
            val is3d = pref3d?.isChecked == true
            if (is2d && is3d) {
                pref2d?.isChecked = false
            } else if (!is2d && !is3d) {
                pref3d?.isChecked = true
            }
        }
    }

    private fun updateRomSearchDirsSummary(overrideDirs: Set<*>? = null) {
        val pref = romSearchDirsPref ?: return
        val ctx = context ?: return
        val rawDirs = overrideDirs
            ?: PreferenceManager.getDefaultSharedPreferences(ctx).getStringSet("rom_search_dirs", emptySet())
            ?: emptySet<String>()
        val names = rawDirs.mapNotNull { entry ->
            val uriStr = entry as? String ?: return@mapNotNull null
            val uri = uriStr.toUri()
            val resolved = FileUtils.getAbsolutePathFromSAFUri(ctx, uri)
                ?: DocumentFile.fromTreeUri(ctx, uri)?.name
                ?: uri.lastPathSegment
                ?: uriStr
            val decoded = Uri.decode(resolved).trimEnd('/')
            val folderName = decoded.substringAfterLast(':').substringAfterLast('/').ifBlank { decoded }
            folderName.takeIf { it.isNotBlank() }
        }
        pref.summary = if (names.isEmpty()) {
            getString(R.string.v820_rom_search_dirs_empty)
        } else {
            names.joinToString(", ")
        }
    }

    private fun updateRaCoversSummary() {
        val pref = raCoversPref ?: return
        val ctx = context ?: return
        val sp = PreferenceManager.getDefaultSharedPreferences(ctx)
        val isRaSignedIn = !sp.getString("ra_username", null).isNullOrBlank() &&
            !sp.getString("ra_token", null).isNullOrBlank()
        val gameTdbEnabled = gameTdbMasterPref?.isChecked == true ||
            gameTdb2dCoversPref?.isChecked == true ||
            gameTdb3dCoversPref?.isChecked == true
        val fallbackTarget = if (gameTdbEnabled) {
            getString(R.string.v820_ra_covers_fallback_gametdb_and_icon)
        } else {
            getString(R.string.v820_ra_covers_fallback_icon_only)
        }
        pref.summary = if (isRaSignedIn) {
            getString(R.string.v820_ra_covers_summary_signed_in, fallbackTarget)
        } else {
            getString(R.string.v820_ra_covers_summary_not_signed_in, fallbackTarget)
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

        viewLifecycleOwner.lifecycleScope.launch {
            val hasMirror = withContext(Dispatchers.IO) {
                settingsBackupManager.hasMirrorAt(uri)
            }
            if (!hasMirror) {
                settingsBackupManager.rememberMirrorFallback(uri)
                persistDirectory()
                settingsBackupManager.requestMirrorWrite()
                return@launch
            }

            if (!isAdded) return@launch
            AlertDialog.Builder(requireContext())
                .setTitle(R.string.settings_mirror_detected_title)
                .setMessage(R.string.settings_mirror_detected_message)
                .setPositiveButton(R.string.settings_mirror_restore) { _, _ ->
                    viewLifecycleOwner.lifecycleScope.launch {
                        settingsBackupManager.rememberMirrorFallback(uri)
                        withContext(Dispatchers.IO) {
                            settingsBackupManager.restoreMirrorFrom(uri)
                        }
                        persistDirectory()
                        settingsBackupManager.requestMirrorWrite()
                    }
                }
                .setNegativeButton(R.string.settings_mirror_ignore) { _, _ ->
                    viewLifecycleOwner.lifecycleScope.launch {
                        settingsBackupManager.rememberMirrorFallback(uri)
                        persistDirectory()
                        withContext(Dispatchers.IO) {
                            settingsBackupManager.overwriteMirrorAt(uri)
                        }
                        settingsBackupManager.requestMirrorWrite()
                    }
                }
                .show()
        }
    }
}
