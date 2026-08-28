package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceManager
import androidx.preference.SwitchPreference
import com.smp.masterswitchpreference.MasterSwitchPreference
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.extensions.isSustainedPerformanceModeAvailable
import me.magnum.melonds.impl.SettingsBackupManager
import me.magnum.melonds.ui.settings.PreferenceFragmentHelper
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import javax.inject.Inject

@AndroidEntryPoint
class GeneralPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private val helper by lazy { PreferenceFragmentHelper(this, uriPermissionManager, directoryAccessValidator) }
    @Inject lateinit var uriPermissionManager: UriPermissionManager
    @Inject lateinit var directoryAccessValidator: DirectoryAccessValidator
    @Inject lateinit var settingsBackupManager: SettingsBackupManager

    private var rewindPreference: Preference? = null
    private lateinit var frameLimitSpeedPreference: ListPreference

    private val backupLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.backup(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.settings_backup_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(requireContext(), R.string.settings_backup_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    private val restoreLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.restore(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.settings_restore_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(requireContext(), R.string.settings_restore_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        runCatching { setPreferencesFromResource(R.xml.pref_general, rootKey) }
        runCatching { addPreferencesFromResource(R.xml.pref_general_updates) }

        findPreference<Preference>("enable_rewind")?.let { pref ->
            rewindPreference = pref
            pref.setOnPreferenceClickListener {
                me.magnum.melonds.ui.settings.dialogs.showSettingsRewindDialog(requireContext()) {
                    updateRewindSummary()
                }
                true
            }
            updateRewindSummary()
        }
        findPreference<ListPreference>("frame_limit_speed_multiplier")?.let { pref ->
            frameLimitSpeedPreference = pref
            helper.bindPreferenceSummaryToValue(pref)
            pref.sharedPreferences?.registerOnSharedPreferenceChangeListener(sharedPreferenceChangeListener)
        }
        findPreference<SwitchPreference>("enable_sustained_performance")?.let { pref ->
            pref.isVisible = requireContext().isSustainedPerformanceModeAvailable()
        }

        val themePreference = findPreference<ListPreference>("theme")
        if (themePreference != null) {
            helper.bindPreferenceSummaryToValue(themePreference)
            themePreference.setOnPreferenceChangeListener { _, newValue ->
                me.magnum.melonds.ui.theme.AppThemeManager.updateTheme(requireContext(), newValue as String)
                activity?.recreate()
                true
            }
        }

        val accentPreference = findPreference<ListPreference>("theme_accent_color")
        if (accentPreference != null) {
            if (accentPreference.value.isNullOrEmpty()) {
                accentPreference.value = "electric_cyan"
            }
            helper.bindPreferenceSummaryToValue(accentPreference)
            accentPreference.setOnPreferenceChangeListener { _, newValue ->
                val newAccent = newValue as String
                me.magnum.melonds.ui.theme.AppThemeManager.accentColorState.value = newAccent
                accentPreference.sharedPreferences?.edit()?.putString("theme_accent_color", newAccent)?.apply()
                view?.post { applyAccentColorToViews() }
                activity?.recreate()
                true
            }
        }

        val cardStylePreference = findPreference<ListPreference>("rom_card_style")
        if (cardStylePreference != null) {
            helper.bindPreferenceSummaryToValue(cardStylePreference)
            cardStylePreference.setOnPreferenceChangeListener { _, newValue ->
                val newStyle = newValue as String
                me.magnum.melonds.ui.theme.AppThemeManager.cardStyleState.value = newStyle
                cardStylePreference.sharedPreferences?.edit()?.putString("rom_card_style", newStyle)?.apply()
                true
            }
        }

        updateFrameLimitSpeedPreferenceState()

        findPreference<Preference>("backup_settings")?.setOnPreferenceClickListener {
            backupLauncher.launch(null)
            true
        }
        findPreference<Preference>("restore_settings")?.setOnPreferenceClickListener {
            restoreLauncher.launch(null)
            true
        }
    }

    override fun onResume() {
        super.onResume()
        updateRewindSummary()
        updateFrameLimitSpeedPreferenceState()
    }

    private fun updateRewindSummary() {
        val pref = rewindPreference ?: return
        val sp = androidx.preference.PreferenceManager.getDefaultSharedPreferences(requireContext())
        val isEnabled = sp.getBoolean("enable_rewind", false)
        val period = sp.getInt("rewind_period", 10)
        val window = sp.getInt("rewind_window", 6) * 10
        pref.summary = if (isEnabled) {
            "Включено (Интервал: ${period}с, Буфер: ${window}с)"
        } else {
            "Отключено"
        }
    }

    override fun onDestroy() {
        if (::frameLimitSpeedPreference.isInitialized) {
            frameLimitSpeedPreference.sharedPreferences?.unregisterOnSharedPreferenceChangeListener(sharedPreferenceChangeListener)
        }
        super.onDestroy()
    }

    override fun getTitle() = getString(R.string.category_general)

    private val sharedPreferenceChangeListener = android.content.SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
        if (::frameLimitSpeedPreference.isInitialized && (key == "ra_hardcore_enabled" || key == frameLimitSpeedPreference.key)) {
            updateFrameLimitSpeedPreferenceState()
        }
    }

    private fun updateFrameLimitSpeedPreferenceState() {
        if (!::frameLimitSpeedPreference.isInitialized) return
        val preferences = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val hardcoreEnabled = preferences.getBoolean("ra_hardcore_enabled", false)
        frameLimitSpeedPreference.isVisible = !hardcoreEnabled
        if (!hardcoreEnabled) {
            frameLimitSpeedPreference.summary = frameLimitSpeedPreference.entry ?: getString(R.string.not_set)
        }
    }
}
