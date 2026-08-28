package me.magnum.melonds.ui.settings.fragments

import android.Manifest
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.preference.ListPreference
import androidx.preference.SeekBarPreference
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.MicSource
import me.magnum.melonds.extensions.isMicrophonePermissionGranted
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.utils.enumValueOfIgnoreCase

@AndroidEntryPoint
class AudioPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private var micSourcePreference: ListPreference? = null

    private val microphonePermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
        if (granted) {
            micSourcePreference?.value = MicSource.DEVICE.name.lowercase()
        }
    }

    override fun getTitle() = getString(R.string.category_audio)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_audio, rootKey)
        val volumePreference = findPreference<SeekBarPreference>("volume")
        micSourcePreference = findPreference("mic_source")

        volumePreference?.let {
            updateVolumePreferenceSummary(it, it.value)
            it.setOnPreferenceChangeListener { _, newValue ->
                updateVolumePreferenceSummary(it, newValue as Int)
                true
            }
        }

        micSourcePreference?.setOnPreferenceChangeListener { _, newValue ->
            val newMicSource = enumValueOfIgnoreCase<MicSource>(newValue as String)
            if (newMicSource == MicSource.DEVICE && !requireContext().isMicrophonePermissionGranted()) {
                requestMicrophonePermission(false)
                false
            } else {
                true
            }
        }

        hideDependentsWhenInactive("sound_enabled", "audio_interpolation", "audio_bitrate", "volume", "audio_latency", "audio_soft_limiter_enabled", "audio_bass_boost_enabled", "audio_bass_boost_strength", "audio_spatial_audio_enabled", "audio_reverb_enabled")
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