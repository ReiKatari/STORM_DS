package me.magnum.melonds.domain.services

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import me.magnum.melonds.MelonDSAndroidInterface
import me.magnum.melonds.common.romprocessors.RomFileProcessorFactory
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.VideoRenderer
import me.magnum.melonds.domain.model.VulkanPipelineProfile
import me.magnum.melonds.domain.model.emulator.validation.FirmwareLaunchPreconditionCheckResult
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.emulator.validation.RomLaunchPreconditionCheckResult
import me.magnum.melonds.domain.model.rom.config.RuntimeConsoleType
import me.magnum.melonds.domain.repositories.SettingsRepository
import java.nio.ByteBuffer
import java.nio.ByteOrder

class EmulatorLaunchPreconditionChecker(
    private val context: Context,
    private val configurationDirectoryVerifier: ConfigurationDirectoryVerifier,
    private val romFileProcessorFactory: RomFileProcessorFactory,
    private val dsiNandManager: DSiNandManager,
    private val settingsRepository: SettingsRepository,
) {

    suspend fun checkRomLaunchPreconditions(rom: Rom): RomLaunchPreconditionCheckResult {
        val renderer = settingsRepository.getEffectiveVideoRenderer(rom.config)
        getRendererValidationFailureOrNull(renderer)?.let {
            return when (it) {
                RendererValidationFailure.UNSUPPORTED -> RomLaunchPreconditionCheckResult.RendererUnsupported(VideoRenderer.VULKAN)
                RendererValidationFailure.INIT_FAILED -> RomLaunchPreconditionCheckResult.RendererInitFailed(VideoRenderer.VULKAN)
            }
        }

        var targetRom = rom
        if (rom.isDsiWareTitle) {
            val dsiWareCheckResult = checkDsiWarePreconditions(rom)
            if (dsiWareCheckResult !is RomLaunchPreconditionCheckResult.Success) {
                return dsiWareCheckResult
            }
            targetRom = dsiWareCheckResult.rom
        }

        val configurationDirResult = getRomConfigurationDirectoryResult(targetRom)
        if (configurationDirResult.status != ConfigurationDirResult.Status.VALID) {
            return RomLaunchPreconditionCheckResult.BiosConfigurationIncorrect(configurationDirResult)
        }

        return RomLaunchPreconditionCheckResult.Success(targetRom)
    }

    suspend fun checkFirmwareLaunchPreconditions(consoleType: ConsoleType): FirmwareLaunchPreconditionCheckResult {
        getRendererValidationFailureOrNull(settingsRepository.getCurrentVideoRenderer())?.let {
            return when (it) {
                RendererValidationFailure.UNSUPPORTED -> FirmwareLaunchPreconditionCheckResult.RendererUnsupported(VideoRenderer.VULKAN)
                RendererValidationFailure.INIT_FAILED -> FirmwareLaunchPreconditionCheckResult.RendererInitFailed(VideoRenderer.VULKAN)
            }
        }

        val configurationDirResult = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(consoleType)
        if (configurationDirResult.status != ConfigurationDirResult.Status.VALID) {
            return FirmwareLaunchPreconditionCheckResult.BiosConfigurationIncorrect(configurationDirResult)
        }

        return FirmwareLaunchPreconditionCheckResult.Success(consoleType)
    }

    private suspend fun checkDsiWarePreconditions(rom: Rom): RomLaunchPreconditionCheckResult {
        // Direct launch: NAND installation is completely bypassed; games boot directly
        return RomLaunchPreconditionCheckResult.Success(rom)
    }

    private fun getRomConfigurationDirectoryResult(rom: Rom): ConfigurationDirResult {
        val isDsiTitle = rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut || rom.isDsiEnhanced
        val romTargetConsoleType = if (isDsiTitle) ConsoleType.DSi else ConsoleType.DS

        if (!settingsRepository.useCustomBios() && romTargetConsoleType == ConsoleType.DS) {
            return ConfigurationDirResult(ConsoleType.DS, ConfigurationDirResult.Status.VALID, emptyArray(), emptyArray())
        }

        val result = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(romTargetConsoleType)
        if (result.status != ConfigurationDirResult.Status.VALID && romTargetConsoleType == ConsoleType.DSi) {
            // Direct DSi Boot support: native engine handles candidate path auto-discovery and synthetic fallback
            return ConfigurationDirResult(ConsoleType.DSi, ConfigurationDirResult.Status.VALID, emptyArray(), emptyArray())
        }
        return result
    }

    private suspend fun getRendererValidationFailureOrNull(renderer: VideoRenderer): RendererValidationFailure? {
        if (renderer != VideoRenderer.VULKAN) {
            return null
        }

        return withContext(Dispatchers.Default) {
            MelonDSAndroidInterface.configureVulkanDriver(
                settingsRepository.getVulkanDriverConfiguration(context.applicationInfo.nativeLibraryDir)
            )
            val pipelineProfile = VulkanPipelineProfile.fromFastPathPreference(
                settingsRepository.isVulkanFastPathEnabled().first()
            )
            when {
                !MelonDSAndroidInterface.isVulkanRendererSupported() -> RendererValidationFailure.UNSUPPORTED
                !MelonDSAndroidInterface.canInitializeVulkanRenderer(pipelineProfile) -> RendererValidationFailure.INIT_FAILED
                else -> null
            }
        }
    }

    private enum class RendererValidationFailure {
        UNSUPPORTED,
        INIT_FAILED,
    }
}
