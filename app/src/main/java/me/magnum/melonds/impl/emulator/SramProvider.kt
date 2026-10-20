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

        val rootUri = rootDocument.uri
        if (rootUri.scheme == "file") {
            val saveDirPath = rootUri.path
            if (!saveDirPath.isNullOrBlank()) {
                val saveDir = File(saveDirPath).apply { mkdirs() }
                // Auto-migrate any legacy RawDocumentFile '*.sav.bin' / '*.srm.bin' / '*.dsv.bin' / '*.opts.bin' files
                runCatching {
                    saveDir.listFiles()?.forEach { file ->
                        val name = file.name
                        if (name.endsWith(".sav.bin", ignoreCase = true) ||
                            name.endsWith(".srm.bin", ignoreCase = true) ||
                            name.endsWith(".dsv.bin", ignoreCase = true) ||
                            name.endsWith(".opts.bin", ignoreCase = true)
                        ) {
                            val cleanName = name.substring(0, name.length - 4)
                            val cleanFile = File(saveDir, cleanName)
                            if (!cleanFile.exists() || (cleanFile.length() == 0L && file.length() > 0L)) {
                                if (cleanFile.exists()) cleanFile.delete()
                                if (file.renameTo(cleanFile)) {
                                    Log.i("SramProvider", "Auto-migrated legacy save '$name' -> '$cleanName'")
                                }
                            } else if (cleanFile.length() >= file.length()) {
                                file.delete()
                            }
                        }
                    }
                }

                val sramFile = File(saveDir, sramFileName)
                val legacyBinFile = File(saveDir, "$sramFileName.bin")
                if (!sramFile.exists() && legacyBinFile.exists()) {
                    if (!legacyBinFile.renameTo(sramFile)) {
                        runCatching { legacyBinFile.copyTo(sramFile, overwrite = true); legacyBinFile.delete() }
                    }
                }

                if (sramFile.exists() && sramFile.length() == 0L) {
                    Log.w("SramProvider", "Detected 0-byte corrupt save stub '$sramFileName', purging and recreating")
                    runCatching { sramFile.delete() }
                }

                if (!sramFile.exists()) {
                    val created = runCatching { sramFile.createNewFile() || sramFile.exists() }.getOrDefault(false)
                    if (!created && !sramFile.exists()) {
                        throw SramLoadException("Could not create SRAM file at ${sramFile.absolutePath}")
                    }
                } else {
                    runCatching { File(saveDir, "$sramFileName.bak").takeIf { it.exists() }?.delete() }
                    if (sramFile.length() > 0L) {
                        runCatching {
                            val extRoot = runCatching { android.os.Environment.getExternalStorageDirectory() }.getOrNull()
                            val cacheBackupDir = if (extRoot != null) {
                                File(extRoot, "STORM DS/cache/save_backups").apply { mkdirs() }
                            } else {
                                File(context.cacheDir, "save_backups").apply { mkdirs() }
                            }
                            val backupFile = File(cacheBackupDir, "$sramFileName.bak")
                            sramFile.inputStream().use { input ->
                                backupFile.outputStream().use { output ->
                                    input.copyTo(output)
                                }
                            }
                        }
                    }
                }
                return Uri.fromFile(sramFile)
            }
        }

        var sramDocument = rootDocument.findFile(sramFileName)
        if (sramDocument == null) {
            val legacyBinDoc = rootDocument.findFile("$sramFileName.bin")
            if (legacyBinDoc != null) {
                runCatching { legacyBinDoc.renameTo(sramFileName) }
                sramDocument = rootDocument.findFile(sramFileName) ?: legacyBinDoc
            }
        }
        return if (sramDocument != null) {
            if (sramDocument.length() == 0L) {
                Log.w("SramProvider", "Detected 0-byte corrupt save stub '$sramFileName', purging and recreating")
                runCatching { sramDocument.delete() }
                val recreated = rootDocument.createFile("*/*", sramFileName)?.uri
                recreated ?: (rootDocument.findFile(sramFileName)?.uri ?: rootDocument.findFile("$sramFileName.bin")?.uri ?: throw SramLoadException("Could not recreate SRAM file at ${rootDocument.uri}"))
            } else {
                // Remove legacy in-place .bak duplicate to keep user folder clean
                runCatching { rootDocument.findFile("$sramFileName.bak")?.delete() }

                // Keep emergency recovery copy in STORM DS cache directory without cluttering user saves folder
                runCatching {
                    val extRoot = runCatching { android.os.Environment.getExternalStorageDirectory() }.getOrNull()
                    val cacheBackupDir = if (extRoot != null) {
                        File(extRoot, "STORM DS/cache/save_backups").apply { mkdirs() }
                    } else {
                        File(context.cacheDir, "save_backups").apply { mkdirs() }
                    }
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
            val newSramUri = rootDocument.createFile("*/*", sramFileName)?.uri
            if (newSramUri == null) {
                rootDocument.findFile(sramFileName)?.uri
                    ?: rootDocument.findFile("$sramFileName.bin")?.uri
                    ?: throw SramLoadException("Could not create temporary SRAM file at ${rootDocument.uri}")
            } else {
                newSramUri
            }
        }
    }
}
