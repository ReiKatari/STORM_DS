package me.magnum.melonds.impl.emulator

import android.content.Context
import android.net.Uri
import android.util.Log
import java.io.File
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.repositories.SettingsRepository

class SramProvider(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
    private val uriHandler: UriHandler,
) {

    @Throws(SramLoadException::class)
    fun getSramForRom(rom: Rom): Uri {
        val rootDirUri = try {
            settingsRepository.getSaveFileDirectory(rom)
        } catch (_: Throwable) {
            val fallbackDir = File(context.getExternalFilesDir(null) ?: context.filesDir, "saves").apply { mkdirs() }
            Uri.fromFile(fallbackDir)
        }

        var rootDocument = uriHandler.getUriTreeDocument(rootDirUri)
        if (rootDocument == null) {
            // Safe fallback to app-private saves directory
            val fallbackDir = File(context.getExternalFilesDir(null) ?: context.filesDir, "saves").apply { mkdirs() }
            rootDocument = uriHandler.getUriTreeDocument(Uri.fromFile(fallbackDir))
                ?: androidx.documentfile.provider.DocumentFile.fromFile(fallbackDir)
        }

        val romDocument = uriHandler.getUriDocument(rom.uri)
        val romFileName = romDocument?.name ?: rom.fileName
        val saveExtension = if (settingsRepository.useSrmExtensionForSaveFiles()) "srm" else "sav"
        val sramFileName = romFileName.replaceAfterLast('.', saveExtension, "$romFileName.$saveExtension")
        Log.i("SramProvider", "resolved save file '$sramFileName' for rom='${rom.name}'")

        val sramDocument = rootDocument.findFile(sramFileName)
        return if (sramDocument != null) {
            // Create a shadow backup copy (.sav.bak) to protect user progress from corruption
            runCatching {
                if (sramDocument.length() > 0) {
                    val backupFileName = "$sramFileName.bak"
                    var backupDoc = rootDocument.findFile(backupFileName)
                    if (backupDoc == null) {
                        backupDoc = rootDocument.createFile("application/*", backupFileName)
                    }
                    if (backupDoc != null) {
                        context.contentResolver.openInputStream(sramDocument.uri)?.use { input ->
                            context.contentResolver.openOutputStream(backupDoc.uri)?.use { output ->
                                input.copyTo(output)
                            }
                        }
                        Log.i("SramProvider", "Created shadow backup '$backupFileName'")
                    }
                }
            }
            sramDocument.uri
        } else {
            val newSramUri = rootDocument.createFile("application/*", sramFileName)?.uri
            if (newSramUri == null) {
                rootDocument.findFile(sramFileName)?.uri ?: throw SramLoadException("Could not create temporary SRAM file at ${rootDocument.uri}")
            } else {
                newSramUri
            }
        }
    }
}
