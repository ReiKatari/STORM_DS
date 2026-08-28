package me.magnum.melonds.common.vibration

import me.magnum.melonds.domain.repositories.SettingsRepository

class TouchVibrator(private val delegate: VibratorDelegate, private val settingsRepository: SettingsRepository) {

    companion object {
        private const val VIBRATION_DURATION_MS = 25
    }

    fun supportsVibration() = delegate.supportsVibration()

    /**
     * Vibrates the device to provide touch feedback with the strength provided by the [SettingsRepository].
     */
    fun performTouchHapticFeedback() {
        val vibrationStrength = settingsRepository.getTouchHapticFeedbackStrength()
        performTouchHapticFeedback(vibrationStrength)
    }

    /**
     * Vibrates the device to provide touch feedback.
     *
     * @param vibrationStrength The strength of the vibration (between 1 and 100)
     */
    fun performTouchHapticFeedback(vibrationStrength: Int) {
        val mappedStrength = vibrationStrength.coerceIn(1, 100)
        val amplitude = (mappedStrength * 255) / 100
        val duration = if (delegate.supportsVibrationAmplitude()) {
            VIBRATION_DURATION_MS
        } else {
            10 + (mappedStrength * 50) / 100
        }
        delegate.vibrate(duration, amplitude.coerceIn(1, 255))
    }
}