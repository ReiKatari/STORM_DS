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
            try {
                if (me.magnum.melonds.MelonRomDecryptor.checkEncryption(context, rom.uri) == me.magnum.melonds.MelonRomDecryptor.EncryptionStatus.MODCRYPT_ENCRYPTED) {
                    me.magnum.melonds.MelonRomDecryptor.decryptRom(context, rom.uri)
                }
            } catch (_: Throwable) { }

            val dsiWareCheckResult = checkDsiWarePreconditions(rom)
            if (dsiWareCheckResult !is RomLaunchPreconditionCheckResult.Success) {
                return dsiWareCheckResult
            }
            targetRom = dsiWareCheckResult.rom
        } else {
            try {
                if (me.magnum.melonds.MelonRomDecryptor.checkEncryption(context, rom.uri) == me.magnum.melonds.MelonRomDecryptor.EncryptionStatus.MODCRYPT_ENCRYPTED) {
                    me.magnum.melonds.MelonRomDecryptor.decryptRom(context, rom.uri)
                }
            } catch (_: Throwable) { }
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
        if (rom.isInstalledDsiWareShortcut || rom.uri.scheme == Rom.INSTALLED_DSIWARE_URI_SCHEME) {
            return checkInstalledDsiWareShortcutPreconditions(rom)
        }
        return RomLaunchPreconditionCheckResult.Success(rom)
    }

    private suspend fun checkInstalledDsiWareShortcutPreconditions(rom: Rom): RomLaunchPreconditionCheckResult {
        val installedTitleId = rom.installedDsiWareTitleId
            ?: return RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed(RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason.RomParseError)

        val openNandResult = dsiNandManager.openNand()
        if (openNandResult.isFailure()) {
            return RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed(RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason.NandError)
        }

        val isTitleInstalled = try {
            dsiNandManager.listTitles().any { (it.titleId and 0xFFFFFFFFL) == (installedTitleId and 0xFFFFFFFFL) }
        } finally {
            dsiNandManager.closeNand()
        }

        if (!isTitleInstalled) {
            return RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed(RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason.TitleNotInstalled)
        }

        return RomLaunchPreconditionCheckResult.Success(rom)
    }

    private fun getRomConfigurationDirectoryResult(rom: Rom): ConfigurationDirResult {
        if (rom.isInstalledDsiWareShortcut || rom.uri.scheme == Rom.INSTALLED_DSIWARE_URI_SCHEME) {
            return configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DSi)
        }

        if (!settingsRepository.useCustomBios() && rom.config.runtimeConsoleType == RuntimeConsoleType.DEFAULT) {
            return ConfigurationDirResult(ConsoleType.DS, ConfigurationDirResult.Status.VALID, emptyArray(), emptyArray())
        }

        val romTargetConsoleType = rom.config.runtimeConsoleType.targetConsoleType ?: settingsRepository.getDefaultConsoleType()
        if (romTargetConsoleType == ConsoleType.DS) {
            if (!settingsRepository.useCustomBios()) {
                return ConfigurationDirResult(ConsoleType.DS, ConfigurationDirResult.Status.VALID, emptyArray(), emptyArray())
            }
            return configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DS)
        }

        val dsiResult = configurationDirectoryVerifier.checkConsoleConfigurationDirectory(ConsoleType.DSi)
        if (dsiResult.status == ConfigurationDirResult.Status.VALID) {
            return dsiResult
        }

        // If custom BIOS is not strictly enforced in global settings, allow graceful fallback to DS mode
        if (!settingsRepository.useCustomBios()) {
            return ConfigurationDirResult(ConsoleType.DS, ConfigurationDirResult.Status.VALID, emptyArray(), emptyArray())
        }

        return dsiResult
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
