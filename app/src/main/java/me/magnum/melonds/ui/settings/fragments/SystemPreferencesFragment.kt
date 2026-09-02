package me.magnum.melonds.ui.settings.fragments

import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.lifecycleScope
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreference
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.impl.SettingsBackupManager
import me.magnum.melonds.ui.settings.PreferenceFragmentHelper
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
import javax.inject.Inject

@AndroidEntryPoint
class SystemPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    @Inject lateinit var uriPermissionManager: UriPermissionManager
    @Inject lateinit var directoryAccessValidator: DirectoryAccessValidator
    @Inject lateinit var settingsBackupManager: SettingsBackupManager
    private val helper by lazy { PreferenceFragmentHelper(this, uriPermissionManager, directoryAccessValidator) }
    private var updatingMirrorPreference = false

    private val backupInternalLayoutLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.backupInternalLayout(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.internal_layout_backup_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(requireContext(), R.string.internal_layout_backup_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    private val backupExternalLayoutLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.backupExternalLayout(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.external_layout_backup_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(requireContext(), R.string.external_layout_backup_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    private val restoreInternalLayoutLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.restoreInternalLayout(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.internal_layout_restore_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(requireContext(), R.string.internal_layout_restore_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    private val restoreExternalLayoutLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.restoreExternalLayout(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.external_layout_restore_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(requireContext(), R.string.external_layout_restore_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    override fun getTitle() = getString(R.string.category_system)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_system, rootKey)
        val jitPreference = findPreference<SwitchPreference>("enable_jit")!!
        val stormCompilerPreference = findPreference<SwitchPreference>("enable_storm_compiler")!!
        val mirrorPreference = findPreference<SwitchPreference>("save_internal_config_as_file")!!

        val appLanguagePreference = findPreference<ListPreference>("app_language")
        appLanguagePreference?.setOnPreferenceChangeListener { _, newValue ->
            val langTag = newValue as? String ?: "default"
            if (langTag == "default") {
                androidx.appcompat.app.AppCompatDelegate.setApplicationLocales(androidx.core.os.LocaleListCompat.getEmptyLocaleList())
            } else {
                androidx.appcompat.app.AppCompatDelegate.setApplicationLocales(androidx.core.os.LocaleListCompat.forLanguageTags(langTag))
            }
            true
        }

        if (Build.SUPPORTED_64_BIT_ABIS.isEmpty()) {
            jitPreference.isChecked = false
            jitPreference.isVisible = false
            stormCompilerPreference.isChecked = false
            stormCompilerPreference.isVisible = false
        } else {
            // Ensure only one compiler is enabled on launch (default: STORM-Compiler)
            if (stormCompilerPreference.isChecked && jitPreference.isChecked) {
                jitPreference.isChecked = false
                preferenceManager.sharedPreferences?.edit()?.putBoolean("enable_jit", false)?.apply()
            } else if (!stormCompilerPreference.isChecked && !jitPreference.isChecked) {
                stormCompilerPreference.isChecked = true
                preferenceManager.sharedPreferences?.edit()?.putBoolean("enable_storm_compiler", true)?.apply()
            }

            jitPreference.setOnPreferenceChangeListener { _, newValue ->
                if (newValue == true) {
                    stormCompilerPreference.isChecked = false
                }
                true
            }
            stormCompilerPreference.setOnPreferenceChangeListener { _, newValue ->
                if (newValue == true) {
                    jitPreference.isChecked = false
                }
                true
            }
        }

        mirrorPreference.setOnPreferenceChangeListener { _, newValue ->
            if (updatingMirrorPreference) {
                return@setOnPreferenceChangeListener true
            }
            if (newValue != true) {
                preferenceManager.sharedPreferences?.edit()?.putBoolean("save_internal_config_as_file", false)?.apply()
                return@setOnPreferenceChangeListener true
            }

            lifecycleScope.launch(Dispatchers.IO) {
                try {
                    val mirrorDirectory = settingsBackupManager.getActiveMirrorDirectory()
                    val hasMirror = mirrorDirectory != null && runCatching { settingsBackupManager.hasMirrorAt(mirrorDirectory) }.getOrDefault(false)

                    withContext(Dispatchers.Main) {
                        if (!isAdded) return@withContext
                        val ctx = context ?: return@withContext

                        if (!hasMirror || mirrorDirectory == null) {
                            setMirrorEnabled(mirrorPreference)
                            settingsBackupManager.requestMirrorWrite()
                        } else {
                            AlertDialog.Builder(ctx)
                                .setTitle(R.string.settings_mirror_detected_title)
                                .setMessage(R.string.settings_mirror_detected_message)
                                .setPositiveButton(R.string.settings_mirror_restore) { _, _ ->
                                    setMirrorEnabled(mirrorPreference)
                                    lifecycleScope.launch(Dispatchers.IO) {
                                        runCatching {
                                            settingsBackupManager.restoreMirrorFrom(mirrorDirectory)
                                            settingsBackupManager.requestMirrorWrite()
                                        }
                                    }
                                }
                                .setNegativeButton(R.string.settings_mirror_ignore) { _, _ ->
                                    setMirrorEnabled(mirrorPreference)
                                    lifecycleScope.launch(Dispatchers.IO) {
                                        runCatching {
                                            settingsBackupManager.overwriteMirrorAt(mirrorDirectory)
                                            settingsBackupManager.requestMirrorWrite()
                                        }
                                    }
                                }
                                .setOnCancelListener {
                                    updatingMirrorPreference = true
                                    mirrorPreference.isChecked = false
                                    preferenceManager.sharedPreferences?.edit()?.putBoolean("save_internal_config_as_file", false)?.apply()
                                    updatingMirrorPreference = false
                                }
                                .show()
                        }
                    }
                } catch (e: Exception) {
                    withContext(Dispatchers.Main) {
                        if (isAdded) {
                            setMirrorEnabled(mirrorPreference)
                            settingsBackupManager.requestMirrorWrite()
                        }
                    }
                }
            }
            false
        }

        findPreference<Preference>("backup_internal_layout")?.setOnPreferenceClickListener {
            backupInternalLayoutLauncher.launch(null)
            true
        }
        findPreference<Preference>("backup_external_layout")?.setOnPreferenceClickListener {
            backupExternalLayoutLauncher.launch(null)
            true
        }
        findPreference<Preference>("restore_internal_layout")?.setOnPreferenceClickListener {
            restoreInternalLayoutLauncher.launch(null)
            true
        }
        findPreference<Preference>("restore_external_layout")?.setOnPreferenceClickListener {
            restoreExternalLayoutLauncher.launch(null)
            true
        }
    }

    private fun setMirrorEnabled(mirrorPreference: SwitchPreference) {
        updatingMirrorPreference = true
        mirrorPreference.isChecked = true
        preferenceManager.sharedPreferences?.edit()?.putBoolean("save_internal_config_as_file", true)?.apply()
        updatingMirrorPreference = false
    }
}
