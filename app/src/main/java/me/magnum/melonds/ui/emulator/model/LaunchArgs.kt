package me.magnum.melonds.ui.emulator.model

import android.content.Intent
import android.net.Uri
import androidx.core.net.toUri
import androidx.lifecycle.SavedStateHandle
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.extensions.parcelable
import me.magnum.melonds.parcelables.RomParcelable
import me.magnum.melonds.ui.emulator.EmulatorActivity

sealed class LaunchArgs {
    data class RomObject(val rom: Rom) : LaunchArgs()
    data class RomUri(val uri: Uri) : LaunchArgs()
    data class RomPath(val path: String) : LaunchArgs()
    data class Firmware(val consoleType: ConsoleType, val startMultiplayerSession: Boolean = false) : LaunchArgs() {
        fun resumes(runningConsole: ConsoleType): Boolean = !startMultiplayerSession && consoleType == runningConsole
    }

    companion object {
        fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): LaunchArgs? {
            return if (savedStateHandle.get<Boolean>(EmulatorActivity.KEY_BOOT_FIRMWARE_ONLY) == true) {
                val consoleTypeParameter = savedStateHandle.get<Int>(EmulatorActivity.KEY_BOOT_FIRMWARE_CONSOLE)
                consoleTypeParameter?.let { ConsoleType.entries.getOrNull(it) }?.let {
                    Firmware(it, savedStateHandle.get<Boolean>(EmulatorActivity.KEY_START_MULTIPLAYER_FIRMWARE) == true)
                }
            } else {
                val romParcelable = savedStateHandle.get<RomParcelable>(EmulatorActivity.KEY_ROM)
                if (romParcelable != null) {
                    RomObject(romParcelable.rom)
                } else {
                    val uri = when (val uriEntry = savedStateHandle.get<Any>(EmulatorActivity.KEY_URI)) {
                        is String -> uriEntry.takeIf { it.isNotBlank() }?.toUri()
                        is Uri -> uriEntry
                        else -> null
                    }

                    if (uri != null) {
                        RomUri(uri)
                    } else {
                        savedStateHandle.get<String>(EmulatorActivity.KEY_PATH)
                            ?.takeIf { it.isNotBlank() }
                            ?.let(::RomPath)
                    }
                }
            }
        }

        fun fromIntent(intent: Intent): LaunchArgs? {
            val extras = intent.extras
            val bootFirmwareOnly = extras?.getBoolean(EmulatorActivity.KEY_BOOT_FIRMWARE_ONLY) ?: false

            return if (bootFirmwareOnly) {
                val consoleTypeParameter = extras?.getInt(EmulatorActivity.KEY_BOOT_FIRMWARE_CONSOLE, -1) ?: -1
                ConsoleType.entries.getOrNull(consoleTypeParameter)?.let {
                    Firmware(it, extras?.getBoolean(EmulatorActivity.KEY_START_MULTIPLAYER_FIRMWARE, false) == true)
                }
            } else {
                val romParcelable = extras?.parcelable<RomParcelable>(EmulatorActivity.KEY_ROM)
                val dataUri = intent.data
                val romPath = extras?.getString(EmulatorActivity.KEY_PATH)?.takeIf { it.isNotBlank() }
                @Suppress("DEPRECATION")
                val extraUri = when (val uriEntry = extras?.get(EmulatorActivity.KEY_URI)) {
                    is String -> uriEntry.takeIf { it.isNotBlank() }?.toUri()
                    is Uri -> uriEntry
                    else -> null
                }

                when {
                    romParcelable?.rom != null -> RomObject(romParcelable.rom)
                    dataUri != null -> RomUri(dataUri)
                    romPath != null -> RomPath(romPath)
                    extraUri != null -> RomUri(extraUri)
                    else -> null
                }
            }
        }
    }
}
