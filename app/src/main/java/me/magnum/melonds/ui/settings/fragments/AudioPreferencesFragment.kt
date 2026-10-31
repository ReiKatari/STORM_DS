package me.magnum.melonds.ui.settings.fragments

import android.Manifest
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import androidx.preference.Preference
import androidx.preference.ListPreference
import androidx.preference.SeekBarPreference
import androidx.preference.SwitchPreference
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.MelonEmulator
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.MicSource
import me.magnum.melonds.extensions.isMicrophonePermissionGranted
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.utils.enumValueOfIgnoreCase

@AndroidEntryPoint
class AudioPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private var micSourcePreference: ListPreference? = null
    private var audioLatencyPreference: ListPreference? = null
    private var agcNoiseGatePreference: SwitchPreference? = null

    private val microphonePermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
        if (granted) {
            micSourcePreference?.value = MicSource.DEVICE.name.lowercase()
            micSourcePreference?.let { updateMicSourceSummary(it, MicSource.DEVICE.name.lowercase()) }
        }
    }

    override fun getTitle() = getString(R.string.category_audio)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_audio, rootKey)
        val volumePreference = findPreference<SeekBarPreference>("volume")
        micSourcePreference = findPreference("mic_source")
        audioLatencyPreference = findPreference("audio_latency")
        agcNoiseGatePreference = findPreference("mic_agc_noise_gate_enabled")

        agcNoiseGatePreference?.let { pref ->
            MelonEmulator.setMicrophoneAgcEnabled(pref.isChecked)
            pref.setOnPreferenceChangeListener { _, newValue ->
                val enabled = newValue as? Boolean ?: true
                MelonEmulator.setMicrophoneAgcEnabled(enabled)
                true
            }
        }

        volumePreference?.let {
            updateVolumePreferenceSummary(it, it.value)
            it.setOnPreferenceChangeListener { _, newValue ->
                updateVolumePreferenceSummary(it, newValue as Int)
                true
            }
        }

        audioLatencyPreference?.let { latencyPref ->
            updateAudioLatencySummary(latencyPref, latencyPref.value)
            latencyPref.setOnPreferenceChangeListener { _, newValue ->
                updateAudioLatencySummary(latencyPref, newValue as? String)
                true
            }
        }

        micSourcePreference?.let { micPref ->
            updateMicSourceSummary(micPref, micPref.value)
            micPref.setOnPreferenceChangeListener { _, newValue ->
                val newMicSource = enumValueOfIgnoreCase<MicSource>(newValue as String)
                if (newMicSource == MicSource.DEVICE && !requireContext().isMicrophonePermissionGranted()) {
                    requestMicrophonePermission(false)
                    false
                } else {
                    updateMicSourceSummary(micPref, newValue as? String)
                    true
                }
            }
        }

        findPreference<Preference>("audio_dsp_preset")?.setOnPreferenceClickListener {
            showAudioDspPresetDialog()
            true
        }

        hideDependentsWhenInactive("sound_enabled", "audio_interpolation", "audio_bitrate", "volume", "audio_latency", "audio_dsp_preset", "audio_soft_limiter_enabled", "audio_bass_boost_enabled", "audio_bass_boost_strength", "audio_spatial_audio_enabled", "audio_reverb_enabled")
    }

    override fun onResume() {
        super.onResume()
        micSourcePreference?.let { updateMicSourceSummary(it, it.value) }
        audioLatencyPreference?.let { updateAudioLatencySummary(it, it.value) }
        agcNoiseGatePreference?.let { MelonEmulator.setMicrophoneAgcEnabled(it.isChecked) }
    }

    private fun updateAudioLatencySummary(pref: ListPreference, value: String?) {
        val index = pref.findIndexOfValue(value)
        val entry = if (index >= 0 && index < pref.entries.size) pref.entries[index] else (value ?: "")
        val approx = when (value) {
            "low" -> getString(R.string.v780_audio_latency_approx_low)
            "medium" -> getString(R.string.v780_audio_latency_approx_medium)
            "high" -> getString(R.string.v780_audio_latency_approx_high)
            else -> null
        }
        pref.summary = if (approx != null) "$entry ($approx)" else entry
    }

    private fun updateMicSourceSummary(pref: ListPreference, value: String?) {
        val index = pref.findIndexOfValue(value)
        val entry = if (index >= 0 && index < pref.entries.size) pref.entries[index] else (value ?: "")
        val newMicSource = enumValueOfIgnoreCase<MicSource>(value ?: "")
        if (newMicSource == MicSource.DEVICE) {
            val hasPerm = requireContext().isMicrophonePermissionGranted()
            val status = if (hasPerm) {
                getString(R.string.v780_mic_permission_granted)
            } else {
                getString(R.string.v780_mic_permission_required)
            }
            pref.summary = "$entry — $status"
        } else {
            pref.summary = entry
        }
    }

    private fun updateVolumePreferenceSummary(volumePreference: SeekBarPreference, volume: Int) {
        val pct = kotlin.math.round(volume / 256f * 100f).toInt().coerceIn(0, 200)
        volumePreference.summary = when {
            pct == 0 || volume <= 0 -> "0% (-∞ dB)"
            pct == 100 -> "100% (0.0 dB)"
            else -> {
                val db = 20.0 * kotlin.math.log10(volume / 256.0)
                String.format(java.util.Locale.US, "%d%% (%+.1f dB)", pct, db)
            }
        }
    }

    private fun requestMicrophonePermission(overrideRationaleRequest: Boolean) {
        if (!overrideRationaleRequest && shouldShowRequestPermissionRationale(Manifest.permission.RECORD_AUDIO)) {
            AlertDialog.Builder(requireContext())
                .setTitle(R.string.microphone_permission_required)
                .setMessage(R.string.microphone_permission_required_info)
                .setPositiveButton(R.string.ok) { _, _ -> requestMicrophonePermission(true) }
                .show()
        } else {
            microphonePermissionLauncher.launch(Manifest.permission.RECORD_AUDIO)
        }
    }

    private fun showAudioDspPresetDialog() {
        val options = arrayOf(
            getString(R.string.v794_audio_preset_studio),
            getString(R.string.v794_audio_preset_cyber_bass),
            getString(R.string.v794_audio_preset_spatial_3d),
            getString(R.string.v794_audio_preset_night_mode)
        )
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.v794_audio_dsp_preset_title)
            .setItems(options) { _, which ->
                applyAudioDspPreset(which, options[which])
            }
            .setNegativeButton(R.string.cancel, null)
            .show()
    }

    private fun applyAudioDspPreset(presetIndex: Int, presetTitle: String) {
        val softLimit: Boolean
        val bassBoost: Boolean
        val bassStrength: Int
        val spatial: Boolean
        val reverb: Boolean

        when (presetIndex) {
            0 -> { // Studio Original
                softLimit = false
                bassBoost = false
                bassStrength = 5
                spatial = false
                reverb = false
            }
            1 -> { // Deep Bass (Cyber Bass)
                softLimit = true
                bassBoost = true
                bassStrength = 8
                spatial = false
                reverb = false
            }
            2 -> { // 3D Spatial
                softLimit = true
                bassBoost = false
                bassStrength = 5
                spatial = true
                reverb = true
            }
            3 -> { // Night Mode
                softLimit = true
                bassBoost = false
                bassStrength = 5
                spatial = false
                reverb = false
            }
            else -> return
        }

        preferenceManager.sharedPreferences?.edit()?.apply {
            putBoolean("audio_soft_limiter_enabled", softLimit)
            putBoolean("audio_bass_boost_enabled", bassBoost)
            putInt("audio_bass_boost_strength", bassStrength)
            putBoolean("audio_spatial_audio_enabled", spatial)
            putBoolean("audio_reverb_enabled", reverb)
            apply()
        }

        findPreference<SwitchPreference>("audio_soft_limiter_enabled")?.isChecked = softLimit
        findPreference<SwitchPreference>("audio_bass_boost_enabled")?.isChecked = bassBoost
        findPreference<SeekBarPreference>("audio_bass_boost_strength")?.value = bassStrength
        findPreference<SwitchPreference>("audio_spatial_audio_enabled")?.isChecked = spatial
        findPreference<SwitchPreference>("audio_reverb_enabled")?.isChecked = reverb

        Toast.makeText(requireContext(), getString(R.string.v794_audio_preset_applied, presetTitle), Toast.LENGTH_SHORT).show()
    }
}
