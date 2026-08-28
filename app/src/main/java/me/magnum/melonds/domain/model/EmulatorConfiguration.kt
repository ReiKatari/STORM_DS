package me.magnum.melonds.domain.model

import android.net.Uri
import androidx.annotation.Keep

@Keep
data class EmulatorConfiguration(
        val useCustomBios: Boolean,
        val showBootScreen: Boolean,
        val dsBios7Uri: Uri?,
        val dsBios9Uri: Uri?,
        val dsFirmwareUri: Uri?,
        val dsiBios7Uri: Uri?,
        val dsiBios9Uri: Uri?,
        val dsiFirmwareUri: Uri?,
        val dsiNandUri: Uri?,
        val internalDirectory: String,
        val fastForwardSpeedMultiplier: Float,
        val frameLimitSpeedMultiplier: Float,
        val rewindEnabled: Boolean,
        val rewindPeriodSeconds: Int,
        val rewindWindowSeconds: Int,
        val useJit: Boolean,
        val hgEngineFixEnabled: Boolean,
        val consoleType: ConsoleType,
        val soundEnabled: Boolean,
        val audioInterpolation: AudioInterpolation,
        val audioBitrate: AudioBitrate,
        val volume: Int,
        val audioLatency: AudioLatency,
        val micSource: MicSource,
        val firmwareConfiguration: FirmwareConfiguration,
        val rendererConfiguration: RendererConfiguration,
        val dldiSdCardConfiguration: DldiSdCardConfiguration,
        val dsiWareAutoloadTitleId: Long = 0L,
        val arm9OverclockMultiplier: Int = 1,
        val enable3dWidescreen: Boolean = false,
        val enable60FpsPatch: Boolean = false,
        val audioSoftLimiterEnabled: Boolean = true,
        val audioBassBoostEnabled: Boolean = false,
        val audioBassBoostStrength: Int = 5,
        val audioSpatialAudioEnabled: Boolean = false,
        val audioReverbEnabled: Boolean = false
)
