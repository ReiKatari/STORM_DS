package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.impl.SharedPreferencesSettingsRepository
import me.magnum.melonds.ui.settings.PreferenceFragmentHelper
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import javax.inject.Inject

@AndroidEntryPoint
class FirmwarePreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {
    private val helper by lazy { PreferenceFragmentHelper(this, uriPermissionManager, directoryAccessValidator) }
    @Inject lateinit var uriPermissionManager: UriPermissionManager
    @Inject lateinit var directoryAccessValidator: DirectoryAccessValidator

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_internal_firmware_settings, rootKey)
        helper.bindPreferenceSummaryToValue(findPreference("firmware_settings_birthday"))

        val prefs = preferenceManager.sharedPreferences
        findPreference<ListPreference>("firmware_settings_language")?.let { languagePref ->
            if (prefs != null && !prefs.contains("firmware_settings_language")) {
                languagePref.value = SharedPreferencesSettingsRepository.resolveDefaultFirmwareLanguage(prefs).toString()
            }
        }

        val macPref = findPreference<Preference>("internal_mac_address")
        if (prefs?.getString("internal_mac_address", null).isNullOrBlank()) {
            val defaultMac = me.magnum.melonds.domain.model.MacAddress.randomDsAddress().toString()
            prefs?.edit()?.putString("internal_mac_address", defaultMac)?.apply()
        }
        macPref?.summary = prefs?.getString("internal_mac_address", null) ?: getString(R.string.not_set)

        macPref?.onPreferenceChangeListener = Preference.OnPreferenceChangeListener { _, newValue ->
            val macStr = (newValue as? String)?.trim() ?: return@OnPreferenceChangeListener false
            if (!isValidMacAddress(macStr)) {
                android.widget.Toast.makeText(requireContext(), R.string.v780_mac_invalid_format, android.widget.Toast.LENGTH_SHORT).show()
                false
            } else {
                val formatted = formatMacAddress(macStr)
                preferenceManager.sharedPreferences?.edit()?.putString("internal_mac_address", formatted)?.apply()
                macPref.summary = formatted
                false
            }
        }

        findPreference<Preference>("internal_randomize_mac")?.setOnPreferenceClickListener {
            val randomMac = me.magnum.melonds.domain.model.MacAddress.randomDsAddress().toString()
            preferenceManager.sharedPreferences?.edit()?.putString("internal_mac_address", randomMac)?.apply()
            macPref?.summary = randomMac
            android.widget.Toast.makeText(requireContext(), getString(R.string.v780_mac_generated, randomMac), android.widget.Toast.LENGTH_SHORT).show()
            true
        }

        hideDependentsWhenInactive("internal_randomize_mac_address", "internal_mac_address", "internal_randomize_mac", showWhenChecked = false)
    }

    private fun isValidMacAddress(mac: String): Boolean {
        val parts = mac.split(":", "-")
        if (parts.size != 6) return false
        return parts.all { it.length == 2 && it.toIntOrNull(16) != null }
    }

    private fun formatMacAddress(mac: String): String {
        return mac.split(":", "-").joinToString(":") { it.uppercase() }
    }

    override fun getTitle() = getString(R.string.internal_firmware_settings)
}