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
            val stormDsRoot = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS")
            val fallbackDir = File(if (stormDsRoot.exists() || stormDsRoot.mkdirs()) stormDsRoot else (context.getExternalFilesDir(null) ?: context.filesDir), "saves").apply { mkdirs() }
            Uri.fromFile(fallbackDir)
        }

        var rootDocument = uriHandler.getUriTreeDocument(rootDirUri)
        if (rootDocument == null) {
            // Safe fallback to STORM DS saves directory
            val stormDsRoot = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS")
            val fallbackDir = File(if (stormDsRoot.exists() || stormDsRoot.mkdirs()) stormDsRoot else (context.getExternalFilesDir(null) ?: context.filesDir), "saves").apply { mkdirs() }
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
            if (sramDocument.length() == 0L) {
                Log.w("SramProvider", "Detected 0-byte corrupt save stub '$sramFileName', purging and recreating")
                runCatching { sramDocument.delete() }
                val recreated = rootDocument.createFile("application/*", sramFileName)?.uri
                recreated ?: (rootDocument.findFile(sramFileName)?.uri ?: throw SramLoadException("Could not recreate SRAM file at ${rootDocument.uri}"))
            } else {
                // Remove legacy in-place .bak duplicate to keep user folder clean
                runCatching { rootDocument.findFile("$sramFileName.bak")?.delete() }

                // Keep emergency recovery copy in private cache directory without cluttering user saves folder
                runCatching {
                    val cacheBackupDir = File(context.cacheDir, "save_backups").apply { mkdirs() }
                    val backupFile = File(cacheBackupDir, "$sramFileName.bak")
                    context.contentResolver.openInputStream(sramDocument.uri)?.use { input ->
                        backupFile.outputStream().use { output ->
                            input.copyTo(output)
                        }
                    }
                }
                sramDocument.uri
            }
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
