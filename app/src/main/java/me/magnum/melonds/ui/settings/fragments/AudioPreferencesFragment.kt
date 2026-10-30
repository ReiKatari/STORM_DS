package me.magnum.melonds.ui.settings.fragments

import android.Manifest
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
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

        hideDependentsWhenInactive("sound_enabled", "audio_interpolation", "audio_bitrate", "volume", "audio_latency", "audio_soft_limiter_enabled", "audio_bass_boost_enabled", "audio_bass_boost_strength", "audio_spatial_audio_enabled", "audio_reverb_enabled")
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
        val volumePercentage = (volume / volumePreference.max.toFloat() * 100f).toInt()
        volumePreference.summary = getString(R.string.volume_percentage, volumePercentage)
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
}
