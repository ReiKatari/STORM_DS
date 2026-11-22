package me.magnum.melonds.domain.services

import android.net.Uri
import androidx.core.net.toUri
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.DSiProfile
import me.magnum.melonds.domain.repositories.SettingsRepository

abstract class ConfigurationDirectoryVerifier(val settingsRepository: SettingsRepository) {
    fun checkDsConfigurationDirectory(): ConfigurationDirResult {
        return checkDsConfigurationDirectory(settingsRepository.getDsBiosDirectory())
    }

    fun checkDsiConfigurationDirectory(profile: DSiProfile? = settingsRepository.getDsiProfile()): ConfigurationDirResult {
        // DSi requires the DS custom BIOS and firmware to be configured
        val fallbackDirectory = settingsRepository.getDsiBiosDirectory()
        val targetDirectory = profile?.directoryUri?.toUri() ?: fallbackDirectory
        var dsiConfigurationResult = checkDsiConfigurationDirectory(targetDirectory)
        if (dsiConfigurationResult.status != ConfigurationDirResult.Status.VALID &&
            fallbackDirectory != null &&
            fallbackDirectory != targetDirectory
        ) {
            dsiConfigurationResult = checkDsiConfigurationDirectory(fallbackDirectory)
        }
        return if (dsiConfigurationResult.status != ConfigurationDirResult.Status.VALID) {
            dsiConfigurationResult
        } else {
            checkDsConfigurationDirectory()
        }
    }

    protected abstract fun checkDsConfigurationDirectory(directory: Uri?): ConfigurationDirResult
    protected abstract fun checkDsiConfigurationDirectory(directory: Uri?): ConfigurationDirResult

    fun checkConsoleConfigurationDirectory(consoleType: ConsoleType): ConfigurationDirResult {
        return when (consoleType) {
            ConsoleType.DS -> checkDsConfigurationDirectory()
            ConsoleType.DSi -> checkDsiConfigurationDirectory()
        }
    }

    fun checkConsoleConfigurationDirectory(consoleType: ConsoleType, directory: Uri?): ConfigurationDirResult {
        return when (consoleType) {
            ConsoleType.DS -> checkDsConfigurationDirectory(directory)
            ConsoleType.DSi -> checkDsiConfigurationDirectory(directory)
        }
    }
}