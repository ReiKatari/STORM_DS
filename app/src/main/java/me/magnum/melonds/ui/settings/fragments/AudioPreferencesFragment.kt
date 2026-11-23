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
import java.util.concurrent.atomic.AtomicBoolean

@AndroidEntryPoint
class AudioPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    @javax.inject.Inject
    lateinit var settingsRepository: me.magnum.melonds.domain.repositories.SettingsRepository

    private var micSourcePreference: ListPreference? = null
    private var micGainPreference: SeekBarPreference? = null
    private var audioLatencyPreference: ListPreference? = null
    private var agcNoiseGatePreference: SwitchPreference? = null
    private var micNoiseGateThresholdPreference: SeekBarPreference? = null
    private var micVuMeterPreference: me.magnum.melonds.ui.settings.preferences.MicLevelMeterPreference? = null
    @Volatile private var activeTestTrack: android.media.AudioTrack? = null
    @Volatile private var activeTrackReleased: AtomicBoolean? = null
    private var activeTestThread: Thread? = null

    private val microphonePermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
        if (granted) {
            val deviceVal = MicSource.DEVICE.name.lowercase()
            micSourcePreference?.value = deviceVal
            micSourcePreference?.let { updateMicSourceSummary(it, deviceVal) }
            refreshAudioVisibility(micSourceOverride = deviceVal)
        }
    }

    override fun getTitle() = getString(R.string.category_audio)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_audio, rootKey)
        val volumePreference = findPreference<SeekBarPreference>("volume")
        micSourcePreference = findPreference("mic_source")
        micGainPreference = findPreference("mic_gain")
        audioLatencyPreference = findPreference("audio_latency")
        agcNoiseGatePreference = findPreference("mic_agc_noise_gate_enabled")
        micNoiseGateThresholdPreference = findPreference("mic_noise_gate_threshold")
        micVuMeterPreference = findPreference("mic_vu_meter")

        agcNoiseGatePreference?.let { pref ->
            MelonEmulator.setMicrophoneAgcEnabled(pref.isChecked)
            pref.setOnPreferenceChangeListener { _, newValue ->
                val enabled = newValue as? Boolean ?: true
                MelonEmulator.setMicrophoneAgcEnabled(enabled)
                val threshold = micNoiseGateThresholdPreference?.value ?: 25
                micVuMeterPreference?.setGateSettings(enabled, threshold)
                refreshAudioVisibility(agcEnabledOverride = enabled)
                true
            }
        }

        micNoiseGateThresholdPreference?.let { pref ->
            val initVal = pref.value.coerceIn(0, 100)
            pref.summary = getString(R.string.mic_noise_gate_threshold_summary, initVal)
            MelonEmulator.setMicrophoneNoiseGateThreshold(initVal)
            pref.setOnPreferenceChangeListener { _, newValue ->
                val pct = (newValue as? Int)?.coerceIn(0, 100) ?: 25
                pref.summary = getString(R.string.mic_noise_gate_threshold_summary, pct)
                MelonEmulator.setMicrophoneNoiseGateThreshold(pct)
                micVuMeterPreference?.setGateSettings(agcNoiseGatePreference?.isChecked ?: true, pct)
                true
            }
        }

        micVuMeterPreference?.apply {
            setGateSettings(
                enabled = agcNoiseGatePreference?.isChecked ?: true,
                thresholdPercent = micNoiseGateThresholdPreference?.value ?: 25,
            )
            onPermissionRequired = {
                requestMicrophonePermission(false)
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
                val newValStr = newValue as String
                val newMicSource = enumValueOfIgnoreCase<MicSource>(newValStr)
                if (newMicSource == MicSource.DEVICE && !requireContext().isMicrophonePermissionGranted()) {
                    requestMicrophonePermission(false)
                    false
                } else {
                    if (newMicSource != MicSource.DEVICE) {
                        micVuMeterPreference?.stopListening()
                    }
                    updateMicSourceSummary(micPref, newValStr)
                    refreshAudioVisibility(micSourceOverride = newValStr)
                    true
                }
            }
        }

        micGainPreference?.let { gainPref ->
            updateMicGainSummary(gainPref, gainPref.value)
            gainPref.setOnPreferenceChangeListener { _, newValue ->
                val gain = (newValue as? Int)?.coerceIn(1, 10) ?: 1
                updateMicGainSummary(gainPref, gain)
                true
            }
        }

        findPreference<Preference>("audio_dsp_preset")?.setOnPreferenceClickListener {
            showAudioDspPresetDialog()
            true
        }

        findPreference<Preference>("audio_dsp_test")?.setOnPreferenceClickListener {
            playAudioDspTestChord()
            true
        }

        findPreference<SwitchPreference>("sound_enabled")?.setOnPreferenceChangeListener { _, newValue ->
            applyLiteModeAudioState(soundEnabledOverride = newValue as? Boolean)
            true
        }

        findPreference<SwitchPreference>("audio_bass_boost_enabled")?.setOnPreferenceChangeListener { _, newValue ->
            refreshAudioVisibility(bassBoostEnabledOverride = newValue as? Boolean)
            true
        }

        applyLiteModeAudioState()
    }

    override fun onResume() {
        super.onResume()
        micSourcePreference?.let { updateMicSourceSummary(it, it.value) }
        micGainPreference?.let { updateMicGainSummary(it, it.value) }
        audioLatencyPreference?.let { updateAudioLatencySummary(it, it.value) }
        agcNoiseGatePreference?.let { MelonEmulator.setMicrophoneAgcEnabled(it.isChecked) }
        micNoiseGateThresholdPreference?.let {
            MelonEmulator.setMicrophoneNoiseGateThreshold(it.value.coerceIn(0, 100))
            micVuMeterPreference?.setGateSettings(agcNoiseGatePreference?.isChecked ?: true, it.value.coerceIn(0, 100))
        }
        applyLiteModeAudioState()
    }

    private fun applyLiteModeAudioState(soundEnabledOverride: Boolean? = null) {
        syncListPreferenceFromPrefs("audio_interpolation", "none")
        syncListPreferenceFromPrefs("audio_bitrate", "auto")
        val latencyPref = syncListPreferenceFromPrefs("audio_latency", "medium")
        syncSwitchPreferenceFromPrefs("audio_soft_limiter_enabled", true)
        syncSwitchPreferenceFromPrefs("audio_bass_boost_enabled", false)
        syncSwitchPreferenceFromPrefs("audio_spatial_audio_enabled", false)
        syncSwitchPreferenceFromPrefs("audio_reverb_enabled", false)

        val liteActive = settingsRepository.isLiteModeActive()
        val liteLockedAudioKeys = listOf(
            "audio_interpolation",
            "audio_bitrate",
            "audio_latency",
            "audio_dsp_preset",
            "audio_soft_limiter_enabled",
            "audio_bass_boost_enabled",
            "audio_bass_boost_strength",
            "audio_spatial_audio_enabled",
            "audio_reverb_enabled",
        )
        if (!liteActive) {
            liteLockedAudioKeys.forEach { key ->
                applyLiteModeLock(findPreference(key), liteLocked = false, restoreEnabled = true)
            }
            latencyPref?.let { updateAudioLatencySummary(it, it.value) }
            refreshAudioVisibility(soundEnabledOverride = soundEnabledOverride)
        } else {
            refreshAudioVisibility(soundEnabledOverride = soundEnabledOverride)
            liteLockedAudioKeys.forEach { key ->
                applyLiteModeLock(findPreference(key), liteLocked = true)
            }
        }
    }

    override fun onPause() {
        super.onPause()
        micVuMeterPreference?.stopListening()
        stopAudioDspTestChord()
    }

    private fun stopAudioDspTestChord() {
        activeTestThread?.interrupt()
        activeTestThread = null
        val track = activeTestTrack
        val released = activeTrackReleased
        activeTestTrack = null
        activeTrackReleased = null
        if (track != null && released != null && released.compareAndSet(false, true)) {
            runCatching {
                track.pause()
                track.flush()
                track.stop()
                track.release()
            }
        }
    }

    private fun playAudioDspTestChord() {
        stopAudioDspTestChord()
        val prefs = preferenceManager.sharedPreferences ?: return
        val volumeRaw = prefs.getInt("volume", 256).coerceIn(0, 512)
        val volumeGain = (volumeRaw / 256.0f).coerceIn(0f, 2.0f)
        val softLimiter = prefs.getBoolean("audio_soft_limiter_enabled", true)
        val bassBoost = prefs.getBoolean("audio_bass_boost_enabled", false)
        val bassStrength = prefs.getInt("audio_bass_boost_strength", 5).coerceIn(1, 10)
        val spatial = prefs.getBoolean("audio_spatial_audio_enabled", false)
        val reverb = prefs.getBoolean("audio_reverb_enabled", false)

        Toast.makeText(requireContext(), R.string.audio_dsp_test_playing, Toast.LENGTH_SHORT).show()

        val thread = Thread({
            if (Thread.currentThread().isInterrupted) return@Thread

            val sampleRate = 48000
            val durationSec = 1.35f
            val totalFrames = (sampleRate * durationSec).toInt()
            val pcm = ShortArray(totalFrames * 2)

            // Crisp DS-style arpeggiated chime (C4, E4, G4, B4, D5) + warm 82.4Hz bass foundation
            val noteFreqs = floatArrayOf(261.63f, 329.63f, 392.00f, 493.88f, 587.33f)
            val noteStarts = floatArrayOf(0.00f, 0.09f, 0.18f, 0.27f, 0.36f)
            val notePans = floatArrayOf(-0.45f, -0.20f, 0.05f, 0.28f, 0.50f)

            val reverbDelayL = IntArray(4096)
            val reverbDelayR = IntArray(4813)
            var revIdxL = 0
            var revIdxR = 0
            var bassLpL = 0f
            var bassLpR = 0f
            val bassAlpha = 0.022f // ~170 Hz low-pass for bass shelf boost

            for (i in 0 until totalFrames) {
                if ((i and 0xFF) == 0 && Thread.currentThread().isInterrupted) {
                    return@Thread
                }
                val t = i.toFloat() / sampleRate.toFloat()
                var left = 0f
                var right = 0f

                // Warm low-end fundamental so Bass Boost difference is immediately audible
                val bassEnv = kotlin.math.exp(-t * 2.4f) * (1f - kotlin.math.exp(-t * 45f))
                val bassSig = (kotlin.math.sin(2.0 * kotlin.math.PI * 82.41 * t).toFloat() * 0.26f +
                    kotlin.math.sin(2.0 * kotlin.math.PI * 164.81 * t).toFloat() * 0.12f) * bassEnv
                left += bassSig
                right += bassSig

                for (n in noteFreqs.indices) {
                    val dt = t - noteStarts[n]
                    if (dt >= 0f) {
                        val env = kotlin.math.exp(-dt * 4.2f) * (1f - kotlin.math.exp(-dt * 120f))
                        val f = noteFreqs[n].toDouble()
                        val tone = (kotlin.math.sin(2.0 * kotlin.math.PI * f * dt).toFloat() * 0.65f +
                            kotlin.math.sin(2.0 * kotlin.math.PI * f * 2.0 * dt).toFloat() * 0.22f +
                            kotlin.math.sin(2.0 * kotlin.math.PI * f * 3.0 * dt).toFloat() * 0.08f) * env * 0.28f
                        val pan = notePans[n]
                        left += tone * (1f - pan * 0.5f)
                        right += tone * (1f + pan * 0.5f)
                    }
                }

                // Bass boost low-shelf filter
                if (bassBoost) {
                    bassLpL += bassAlpha * (left - bassLpL)
                    bassLpR += bassAlpha * (right - bassLpR)
                    val boostGain = 0.25f * bassStrength
                    left += bassLpL * boostGain
                    right += bassLpR * boostGain
                }

                // Mid/Side stereo spatial widening
                if (spatial) {
                    val mid = (left + right) * 0.5f
                    val side = (left - right) * 0.5f * 1.65f
                    left = mid + side
                    right = mid - side
                }

                // Dual comb-tap stereo reverb
                if (reverb) {
                    val dL = reverbDelayL[revIdxL] / 32768f
                    val dR = reverbDelayR[revIdxR] / 32768f
                    val outL = left + dL * 0.42f + dR * 0.16f
                    val outR = right + dR * 0.42f + dL * 0.16f
                    reverbDelayL[revIdxL] = ((left + dL * 0.46f).coerceIn(-1f, 1f) * 32767f).toInt()
                    reverbDelayR[revIdxR] = ((right + dR * 0.46f).coerceIn(-1f, 1f) * 32767f).toInt()
                    revIdxL = (revIdxL + 1) % reverbDelayL.size
                    revIdxR = (revIdxR + 1) % reverbDelayR.size
                    left = outL
                    right = outR
                }

                // Master volume + soft tanh limiter
                left *= volumeGain
                right *= volumeGain
                if (softLimiter) {
                    left = kotlin.math.tanh(left.toDouble()).toFloat()
                    right = kotlin.math.tanh(right.toDouble()).toFloat()
                } else {
                    left = left.coerceIn(-1f, 1f)
                    right = right.coerceIn(-1f, 1f)
                }

                pcm[i * 2] = (left * 32767f).toInt().coerceIn(-32768, 32767).toShort()
                pcm[i * 2 + 1] = (right * 32767f).toInt().coerceIn(-32768, 32767).toShort()
            }

            if (Thread.currentThread().isInterrupted) return@Thread

            val trackReleased = AtomicBoolean(false)
            var track: android.media.AudioTrack? = null
            try {
                val attrs = android.media.AudioAttributes.Builder()
                    .setUsage(android.media.AudioAttributes.USAGE_GAME)
                    .setContentType(android.media.AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build()
                val format = android.media.AudioFormat.Builder()
                    .setEncoding(android.media.AudioFormat.ENCODING_PCM_16BIT)
                    .setSampleRate(sampleRate)
                    .setChannelMask(android.media.AudioFormat.CHANNEL_OUT_STEREO)
                    .build()
                track = android.media.AudioTrack.Builder()
                    .setAudioAttributes(attrs)
                    .setAudioFormat(format)
                    .setTransferMode(android.media.AudioTrack.MODE_STATIC)
                    .setBufferSizeInBytes(pcm.size * 2)
                    .build()
                activeTestTrack = track
                activeTrackReleased = trackReleased
                track.write(pcm, 0, pcm.size)
                if (Thread.currentThread().isInterrupted) return@Thread
                track.play()
                Thread.sleep((durationSec * 1000L).toLong() + 120L)
            } catch (_: Throwable) {
                // Interrupted or audio device unavailable
            } finally {
                if (track != null && trackReleased.compareAndSet(false, true)) {
                    runCatching {
                        track.stop()
                        track.release()
                    }
                }
                if (activeTestTrack === track) {
                    activeTestTrack = null
                    activeTrackReleased = null
                }
            }
        }, "StormAudioDspTest").apply {
            isDaemon = true
            start()
        }
        activeTestThread = thread
    }

    private fun refreshAudioVisibility(
        soundEnabledOverride: Boolean? = null,
        bassBoostEnabledOverride: Boolean? = null,
        micSourceOverride: String? = null,
        agcEnabledOverride: Boolean? = null,
    ) {
        val soundOn = soundEnabledOverride ?: (findPreference<SwitchPreference>("sound_enabled")?.isChecked ?: true)
        val bassOn = bassBoostEnabledOverride ?: (findPreference<SwitchPreference>("audio_bass_boost_enabled")?.isChecked ?: false)
        val micVal = micSourceOverride ?: micSourcePreference?.value ?: "blow"
        val agcOn = agcEnabledOverride ?: (agcNoiseGatePreference?.isChecked ?: true)

        listOf(
            "audio_mute_on_fast_forward",
            "audio_interpolation",
            "audio_bitrate",
            "volume",
            "audio_latency",
            "audio_dsp_preset",
            "audio_dsp_test",
            "audio_soft_limiter_enabled",
            "audio_bass_boost_enabled",
            "audio_spatial_audio_enabled",
            "audio_reverb_enabled",
        ).forEach { key ->
            findPreference<Preference>(key)?.isVisible = soundOn
        }

        findPreference<Preference>("audio_bass_boost_strength")?.let { pref ->
            val showStrength = soundOn && bassOn
            pref.isVisible = showStrength
            pref.isEnabled = showStrength
        }

        val isDeviceMic = micVal.equals("device", ignoreCase = true)
        micGainPreference?.let { pref ->
            pref.isVisible = isDeviceMic
            pref.isEnabled = isDeviceMic
        }
        agcNoiseGatePreference?.let { pref ->
            pref.isVisible = isDeviceMic
            pref.isEnabled = isDeviceMic
        }
        micNoiseGateThresholdPreference?.let { pref ->
            val showThreshold = isDeviceMic && agcOn
            pref.isVisible = showThreshold
            pref.isEnabled = showThreshold
        }
        micVuMeterPreference?.let { pref ->
            pref.isVisible = isDeviceMic
            pref.isEnabled = isDeviceMic
            if (!isDeviceMic) {
                pref.stopListening()
            }
        }
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

    private fun updateMicGainSummary(pref: SeekBarPreference, value: Int) {
        val gain = value.coerceIn(1, 10)
        pref.summary = "${gain}x - ${getString(R.string.device_microphone_gain_summary)}"
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
            pref.summary = "$entry - $status"
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
        val ctx = context ?: return
        val options = listOf<CharSequence>(
            getString(R.string.v794_audio_preset_studio),
            getString(R.string.v794_audio_preset_cyber_bass),
            getString(R.string.v794_audio_preset_spatial_3d),
            getString(R.string.v794_audio_preset_night_mode)
        )
        val values = listOf<CharSequence>("0", "1", "2", "3")
        me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog(ctx) { dismiss ->
            me.magnum.melonds.ui.settings.dialogs.SettingsChoiceDialogContent(
                title = getString(R.string.v794_audio_dsp_preset_title),
                subtitle = getString(R.string.v794_audio_dsp_preset_summary),
                options = options,
                values = values,
                selectedValue = null,
                onSelect = { chosen ->
                    val idx = chosen.toIntOrNull() ?: return@SettingsChoiceDialogContent
                    if (idx in options.indices) {
                        applyAudioDspPreset(idx, options[idx].toString())
                    }
                },
                onDismiss = dismiss,
            )
        }
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

        val nightVolume: Int? = if (presetIndex == 3) 166 else null

        preferenceManager.sharedPreferences?.edit()?.apply {
            putBoolean("audio_soft_limiter_enabled", softLimit)
            putBoolean("audio_bass_boost_enabled", bassBoost)
            putInt("audio_bass_boost_strength", bassStrength)
            putBoolean("audio_spatial_audio_enabled", spatial)
            putBoolean("audio_reverb_enabled", reverb)
            if (nightVolume != null) {
                putInt("volume", nightVolume)
            }
            apply()
        }

        findPreference<SwitchPreference>("audio_soft_limiter_enabled")?.isChecked = softLimit
        findPreference<SwitchPreference>("audio_bass_boost_enabled")?.isChecked = bassBoost
        findPreference<SeekBarPreference>("audio_bass_boost_strength")?.value = bassStrength
        findPreference<SwitchPreference>("audio_spatial_audio_enabled")?.isChecked = spatial
        findPreference<SwitchPreference>("audio_reverb_enabled")?.isChecked = reverb
        if (nightVolume != null) {
            findPreference<SeekBarPreference>("volume")?.let { volPref ->
                volPref.value = nightVolume
                updateVolumePreferenceSummary(volPref, nightVolume)
            }
        }
        refreshAudioVisibility(bassBoostEnabledOverride = bassBoost)

        Toast.makeText(requireContext(), getString(R.string.v794_audio_preset_applied, presetTitle), Toast.LENGTH_SHORT).show()
    }
}
