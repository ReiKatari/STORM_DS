package me.magnum.melonds.domain.services
import me.magnum.melonds.multiplayer.MultiplayerSession

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.MelonDSAndroidInterface
import me.magnum.melonds.MelonRomDecryptor
import me.magnum.melonds.common.romprocessors.RomFileProcessorFactory
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.VideoRenderer
import me.magnum.melonds.domain.model.VulkanDriverConfiguration
import me.magnum.melonds.domain.model.VulkanDriverMode
import me.magnum.melonds.domain.model.emulator.validation.FirmwareLaunchPreconditionCheckResult
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.emulator.validation.RomLaunchPreconditionCheckResult
import me.magnum.melonds.domain.model.rom.config.RuntimeConsoleType
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.impl.AdrenoVulkanDriverSupport
import me.magnum.melonds.impl.compat.GameCompatibilityManager
import java.io.File

class EmulatorLaunchPreconditionChecker(
    private val context: Context,
    private val configurationDirectoryVerifier: ConfigurationDirectoryVerifier,
    private val romFileProcessorFactory: RomFileProcessorFactory,
    private val dsiNandManager: DSiNandManager,
    private val settingsRepository: SettingsRepository,
) {

    suspend fun checkRomLaunchPreconditions(candidate: Rom): RomLaunchPreconditionCheckResult {
        val rom = candidate.copy(resolvedDsiProfile = settingsRepository.getDsiProfile())
        settingsRepository.setActiveRomContext(
            gameCode = rom.gameCode,
            romName = rom.config.customName ?: rom.name,
            fileName = rom.fileName,
        )
        val renderer = if (MultiplayerSession.active) {
            VideoRenderer.VULKAN
        } else {
            settingsRepository.getEffectiveVideoRenderer(rom.config)
        }
        getRendererValidationFailureOrNull(renderer, rom.config.customVulkanDriverName)?.let {
            val fallbackRenderer = GameCompatibilityManager.resolveSupportedFallbackRenderer(context)
            GameCompatibilityManager.markDeviceVulkanUnavailable(context)
            GameCompatibilityManager.recordCapabilityFallbackNotice(
                context = context,
                requested = VideoRenderer.VULKAN,
                fallback = fallbackRenderer,
            )
            if (rom.config.videoRenderer == null) {
                settingsRepository.setCurrentVideoRenderer(fallbackRenderer)
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

        val encryptionStatus = withContext(Dispatchers.IO) {
            MelonRomDecryptor.checkEncryption(context, targetRom.uri)
        }
        if (encryptionStatus == MelonRomDecryptor.EncryptionStatus.MODCRYPT_ENCRYPTED) {
            return RomLaunchPreconditionCheckResult.RomEncrypted(targetRom)
        }

        val configurationDirResult = getRomConfigurationDirectoryResult(targetRom)
        if (configurationDirResult.status != ConfigurationDirResult.Status.VALID) {
            return RomLaunchPreconditionCheckResult.BiosConfigurationIncorrect(configurationDirResult)
        }

        return RomLaunchPreconditionCheckResult.Success(targetRom)
    }

    suspend fun checkFirmwareLaunchPreconditions(consoleType: ConsoleType): FirmwareLaunchPreconditionCheckResult {
        val profile = if (consoleType == ConsoleType.DSi) settingsRepository.getDsiProfile() else null
        val renderer = if (MultiplayerSession.active) VideoRenderer.VULKAN else settingsRepository.getCurrentVideoRenderer()
        getRendererValidationFailureOrNull(renderer)?.let {
            val fallbackRenderer = GameCompatibilityManager.resolveSupportedFallbackRenderer(context)
            GameCompatibilityManager.markDeviceVulkanUnavailable(context)
            GameCompatibilityManager.recordCapabilityFallbackNotice(
                context = context,
                requested = VideoRenderer.VULKAN,
                fallback = fallbackRenderer,
            )
            if (!MultiplayerSession.active) {
                settingsRepository.setCurrentVideoRenderer(fallbackRenderer)
            }
        }

        val configurationDirResult = if (consoleType == ConsoleType.DSi) {
            configurationDirectoryVerifier.checkDsiConfigurationDirectory(profile)
        } else {
            configurationDirectoryVerifier.checkDsConfigurationDirectory()
        }
        if (configurationDirResult.status != ConfigurationDirResult.Status.VALID) {
            return FirmwareLaunchPreconditionCheckResult.BiosConfigurationIncorrect(configurationDirResult)
        }

        return FirmwareLaunchPreconditionCheckResult.Success(consoleType, profile)
    }

    private suspend fun checkDsiWarePreconditions(rom: Rom): RomLaunchPreconditionCheckResult {
        // Direct launch: NAND installation is completely bypassed; games boot directly
        return RomLaunchPreconditionCheckResult.Success(rom)
    }

    private fun getRomConfigurationDirectoryResult(rom: Rom): ConfigurationDirResult {
        val isDsiWare = rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut || (rom.config.runtimeConsoleType == RuntimeConsoleType.DSi)
        val romTargetConsoleType = if (isDsiWare) ConsoleType.DSi else ConsoleType.DS

        if (!settingsRepository.useCustomBios() && romTargetConsoleType == ConsoleType.DS) {
            return ConfigurationDirResult(ConsoleType.DS, ConfigurationDirResult.Status.VALID, emptyArray(), emptyArray())
        }

        val result = if (romTargetConsoleType == ConsoleType.DSi) {
            configurationDirectoryVerifier.checkDsiConfigurationDirectory(rom.resolvedDsiProfile)
        } else {
            configurationDirectoryVerifier.checkDsConfigurationDirectory()
        }
        if (result.status != ConfigurationDirResult.Status.VALID) {
            // Built-in FreeBIOS (DS) and Direct DSi Boot (DSi) handle missing custom BIOS files automatically
            return ConfigurationDirResult(romTargetConsoleType, ConfigurationDirResult.Status.VALID, emptyArray(), emptyArray())
        }
        return result
    }

    private suspend fun getRendererValidationFailureOrNull(
        renderer: VideoRenderer,
        customVulkanDriverName: String? = null,
    ): RendererValidationFailure? {
        if (renderer != VideoRenderer.VULKAN) {
            return null
        }

        return withContext(Dispatchers.Default) {
            MelonDSAndroidInterface.configureVulkanDriver(
                getVulkanDriverConfigurationForRom(customVulkanDriverName)
            )
            if (!MelonDSAndroidInterface.isVulkanRendererSupported()) {
                RendererValidationFailure.UNSUPPORTED
            } else {
                null
            }
        }
    }

    private fun getVulkanDriverConfigurationForRom(customDriverName: String?): VulkanDriverConfiguration {
        val defaultConfiguration = settingsRepository.getVulkanDriverConfiguration(context.applicationInfo.nativeLibraryDir)
        if (customDriverName == null) {
            return defaultConfiguration
        }
        val tmpDir = File(context.cacheDir, "adrenotools/tmp").apply { mkdirs() }
        if (customDriverName == "__SYSTEM__") {
            return VulkanDriverConfiguration(
                mode = VulkanDriverMode.SYSTEM,
                tmpLibDir = tmpDir.absolutePath,
                hookLibDir = context.applicationInfo.nativeLibraryDir,
                customDriverDir = null,
                customDriverName = null,
                customDriverDisplayName = null,
            )
        }
        val installedDrivers = settingsRepository.getInstalledVulkanDrivers()
        val matchingDriver = installedDrivers.firstOrNull {
            it.id == customDriverName || it.displayName == customDriverName || it.driverName == customDriverName
        }
        if (matchingDriver != null && AdrenoVulkanDriverSupport.isSupported(context)) {
            val resolvedDriver = if (File(matchingDriver.driverDir, matchingDriver.driverName).isFile) {
                matchingDriver
            } else {
                File(context.filesDir, "adreno-drivers")
                    .walkTopDown()
                    .firstOrNull { it.isFile && it.name == matchingDriver.driverName }
                    ?.let { matchingDriver.copy(driverDir = it.parentFile?.absolutePath ?: matchingDriver.driverDir) }
                    ?: matchingDriver
            }
            val driverDirWithSlash = if (resolvedDriver.driverDir.endsWith(File.separator)) {
                resolvedDriver.driverDir
            } else {
                resolvedDriver.driverDir + File.separator
            }
            return VulkanDriverConfiguration(
                mode = VulkanDriverMode.CUSTOM,
                tmpLibDir = tmpDir.absolutePath,
                hookLibDir = context.applicationInfo.nativeLibraryDir,
                customDriverDir = driverDirWithSlash,
                customDriverName = resolvedDriver.driverName,
                customDriverDisplayName = resolvedDriver.displayName,
            )
        }
        return defaultConfiguration
    }

    private enum class RendererValidationFailure {
        UNSUPPORTED,
        INIT_FAILED,
    }
}
