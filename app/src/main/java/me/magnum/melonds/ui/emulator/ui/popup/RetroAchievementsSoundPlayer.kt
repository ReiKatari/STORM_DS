package me.magnum.melonds.ui.emulator.ui.popup

import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import java.util.concurrent.atomic.AtomicReference
import kotlin.math.PI
import kotlin.math.exp
import kotlin.math.sin

object RetroAchievementsSoundPlayer {

    const val SOUND_CHIME = "chime"
    const val SOUND_FANFARE = "fanfare"
    const val SOUND_CLASSIC = "classic"
    const val SOUND_NONE = "none"

    private const val SAMPLE_RATE = 44100
    private val activeTrackRef = AtomicReference<AudioTrack?>(null)

    fun play(soundKey: String?) {
        val normalized = soundKey ?: SOUND_CHIME
        if (normalized == SOUND_NONE) {
            stopActiveTrack()
            return
        }

        Thread({
            runCatching {
                stopActiveTrack()
                val pcm = synthesize(normalized)
                if (pcm.isEmpty()) return@runCatching

                val attrs = AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build()
                val format = AudioFormat.Builder()
                    .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                    .setSampleRate(SAMPLE_RATE)
                    .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
                    .build()
                val track = AudioTrack.Builder()
                    .setAudioAttributes(attrs)
                    .setAudioFormat(format)
                    .setTransferMode(AudioTrack.MODE_STATIC)
                    .setBufferSizeInBytes(pcm.size * 2)
                    .build()

                activeTrackRef.set(track)
                track.write(pcm, 0, pcm.size)
                track.play()

                val durationMs = (pcm.size * 1000L) / SAMPLE_RATE
                Thread.sleep(durationMs + 50L)

                runCatching {
                    track.stop()
                    track.release()
                }
                activeTrackRef.compareAndSet(track, null)
            }
        }, "RASoundPlayer").apply {
            isDaemon = true
            start()
        }
    }

    private fun stopActiveTrack() {
        val prev = activeTrackRef.getAndSet(null) ?: return
        runCatching {
            prev.stop()
            prev.release()
        }
    }

    private fun synthesize(soundKey: String): ShortArray {
        return when (soundKey) {
            SOUND_FANFARE -> synthesizeFanfare()
            SOUND_CLASSIC -> synthesizeClassic()
            SOUND_CHIME -> synthesizeChime()
            else -> synthesizeChime()
        }
    }

    private fun synthesizeChime(): ShortArray {
        val durationSec = 0.29
        val totalSamples = (SAMPLE_RATE * durationSec).toInt()
        val out = ShortArray(totalSamples)
        val note1Start = 0.0
        val note2Start = 0.085

        for (i in 0 until totalSamples) {
            val t = i.toDouble() / SAMPLE_RATE
            var sample = 0.0

            if (t >= note1Start) {
                val dt = t - note1Start
                val env = attackEnvelope(dt, 0.008) * exp(-dt * 12.0)
                sample += env * (0.75 * sin(2.0 * PI * 1046.50 * dt) + 0.25 * sin(2.0 * PI * 2093.00 * dt))
            }
            if (t >= note2Start) {
                val dt = t - note2Start
                val env = attackEnvelope(dt, 0.008) * exp(-dt * 9.5)
                sample += env * (0.78 * sin(2.0 * PI * 1318.51 * dt) + 0.22 * sin(2.0 * PI * 2637.02 * dt))
            }

            out[i] = (sample * 0.42 * Short.MAX_VALUE).toInt().coerceIn(-32768, 32767).toShort()
        }
        return out
    }

    private fun synthesizeFanfare(): ShortArray {
        val notes = listOf(
            Triple(523.25, 0.000, 0.075), // C5
            Triple(659.25, 0.065, 0.075), // E5
            Triple(783.99, 0.130, 0.075), // G5
            Triple(1046.50, 0.195, 0.155), // C6
        )
        val durationSec = 0.35
        val totalSamples = (SAMPLE_RATE * durationSec).toInt()
        val out = ShortArray(totalSamples)

        for (i in 0 until totalSamples) {
            val t = i.toDouble() / SAMPLE_RATE
            var sample = 0.0
            for ((freq, start, len) in notes) {
                if (t >= start && t <= start + len) {
                    val dt = t - start
                    val attack = attackEnvelope(dt, 0.006)
                    val release = if (dt > len - 0.025) ((start + len - t) / 0.025).coerceIn(0.0, 1.0) else 1.0
                    val decay = exp(-dt * 5.0)
                    val wave = 0.70 * sin(2.0 * PI * freq * dt) +
                        0.22 * sin(2.0 * PI * freq * 2.0 * dt) +
                        0.08 * sin(2.0 * PI * freq * 3.0 * dt)
                    sample += attack * release * decay * wave
                }
            }
            out[i] = (sample * 0.40 * Short.MAX_VALUE).toInt().coerceIn(-32768, 32767).toShort()
        }
        return out
    }

    private fun synthesizeClassic(): ShortArray {
        val durationSec = 0.22
        val totalSamples = (SAMPLE_RATE * durationSec).toInt()
        val out = ShortArray(totalSamples)
        val split = 0.09

        for (i in 0 until totalSamples) {
            val t = i.toDouble() / SAMPLE_RATE
            val sample = if (t < split) {
                val env = attackEnvelope(t, 0.006) * exp(-t * 10.0)
                env * sin(2.0 * PI * 880.0 * t)
            } else {
                val dt = t - split
                val env = attackEnvelope(dt, 0.006) * exp(-dt * 11.0)
                env * sin(2.0 * PI * 1174.66 * dt)
            }
            out[i] = (sample * 0.40 * Short.MAX_VALUE).toInt().coerceIn(-32768, 32767).toShort()
        }
        return out
    }

    private fun attackEnvelope(dt: Double, attackSec: Double): Double {
        return if (dt < attackSec) (dt / attackSec).coerceIn(0.0, 1.0) else 1.0
    }
}
