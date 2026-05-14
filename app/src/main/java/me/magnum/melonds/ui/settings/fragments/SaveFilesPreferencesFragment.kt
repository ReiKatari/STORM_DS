package me.magnum.melonds.ui.settings.fragments

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.preference.PreferenceFragmentCompat
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.impl.SettingsBackupManager
import me.magnum.melonds.ui.settings.PreferenceFragmentHelper
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
import javax.inject.Inject

@AndroidEntryPoint
class SaveFilesPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private val helper by lazy { PreferenceFragmentHelper(this, uriPermissionManager, directoryAccessValidator) }
    @Inject lateinit var uriPermissionManager: UriPermissionManager
    @Inject lateinit var directoryAccessValidator: DirectoryAccessValidator
    @Inject lateinit var settingsBackupManager: SettingsBackupManager

    override fun getTitle() = getString(R.string.category_save_files)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_save_files, rootKey)
        helper.setupStoragePickerPreference(findPreference<StoragePickerPreference>("sram_dir")!!) { uri, persistDirectory ->
            handleSettingsMirror(uri, persistDirectory)
        }
    }

    private fun handleSettingsMirror(uri: Uri, persistDirectory: () -> Unit) {
        if (!settingsBackupManager.isMirrorEnabled()) {
            persistDirectory()
            return
        }

        if (!settingsBackupManager.hasMirrorAt(uri)) {
            persistDirectory()
            settingsBackupManager.requestMirrorWrite()
            return
        }

        AlertDialog.Builder(requireContext())
            .setTitle(R.string.settings_mirror_detected_title)
            .setMessage(R.string.settings_mirror_detected_message)
            .setPositiveButton(R.string.settings_mirror_restore) { _, _ ->
                settingsBackupManager.restoreMirrorFrom(uri)
                persistDirectory()
                settingsBackupManager.requestMirrorWrite()
            }
            .setNegativeButton(R.string.settings_mirror_ignore) { _, _ ->
                persistDirectory()
                settingsBackupManager.overwriteMirrorAt(uri)
                settingsBackupManager.requestMirrorWrite()
            }
            .show()
    }
}
