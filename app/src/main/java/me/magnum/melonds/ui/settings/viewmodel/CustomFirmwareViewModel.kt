package me.magnum.melonds.ui.settings.viewmodel

import android.net.Uri
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.services.ConfigurationDirectoryVerifier
import javax.inject.Inject

@HiltViewModel
class CustomFirmwareViewModel @Inject constructor(
    private val configurationDirectoryVerifier: ConfigurationDirectoryVerifier
) : ViewModel() {

    fun getConsoleConfigurationDirectoryStatus(consoleType: ConsoleType): ConfigurationDirResult {
        return configurationDirectoryVerifier.checkConsoleConfigurationDirectory(consoleType)
    }

    fun getConsoleConfigurationDirectoryStatus(consoleType: ConsoleType, directory: Uri?): ConfigurationDirResult {
        return configurationDirectoryVerifier.checkConsoleConfigurationDirectory(consoleType, directory)
    }
}