package me.magnum.melonds.common.vibration

import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
class Api26VibratorDelegate(private val vibrator: Vibrator) : VibratorDelegate {
    override fun supportsVibration(): Boolean {
        return vibrator.hasVibrator()
    }

    override fun supportsVibrationAmplitude(): Boolean {
        return vibrator.hasAmplitudeControl()
    }

    override fun vibrate(duration: Int, amplitude: Int) {
        val durationMs = duration.toLong().coerceIn(5L, 150L)
        val amp = amplitude.coerceIn(1, 255)

        val effect = if (vibrator.hasAmplitudeControl()) {
            VibrationEffect.createOneShot(durationMs, amp)
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            VibrationEffect.createPredefined(VibrationEffect.EFFECT_CLICK)
        } else {
            VibrationEffect.createOneShot(durationMs, VibrationEffect.DEFAULT_AMPLITUDE)
        }

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                val attributes = android.os.VibrationAttributes.Builder()
                    .setUsage(android.os.VibrationAttributes.USAGE_TOUCH)
                    .build()
                vibrator.vibrate(effect, attributes)
            } else {
                val attributes = android.media.AudioAttributes.Builder()
                    .setContentType(android.media.AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .setUsage(android.media.AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .build()
                vibrator.vibrate(effect, attributes)
            }
        } catch (_: Exception) {
            try {
                vibrator.vibrate(effect)
            } catch (_: Exception) {}
        }
    }

    override fun startVibrating() {
        val vibrationPattern = longArrayOf(0, 100)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.BAKLAVA) {
            val effect = VibrationEffect.createRepeatingEffect(VibrationEffect.createWaveform(vibrationPattern, -1))
            vibrator.vibrate(effect)
        } else {
            vibrator.vibrate(vibrationPattern, 1)
        }
    }

    override fun stopVibrating() {
        vibrator.cancel()
    }
}