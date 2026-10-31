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

    companion object {
        var lastRom: Rom? = null
            internal set
        var lastSramUri: Uri? = null
            internal set
    }

    private fun rotateSramBackups(sramFileName: String, copyCurrent: (File) -> Boolean) {
        runCatching {
            val extRoot = runCatching { android.os.Environment.getExternalStorageDirectory() }.getOrNull()
            val stormDsRoot = if (extRoot != null) File(extRoot, "STORM DS") else null
            val cacheBackupDir = if (stormDsRoot != null && (stormDsRoot.exists() || stormDsRoot.mkdirs())) {
                File(stormDsRoot, "cache/save_backups").apply { mkdirs() }
            } else {
                File(context.cacheDir, "save_backups").apply { mkdirs() }
            }

            val bak1 = File(cacheBackupDir, "$sramFileName.bak1")
            val bak2 = File(cacheBackupDir, "$sramFileName.bak2")
            val bak3 = File(cacheBackupDir, "$sramFileName.bak3")

            // Rotate: .sav.bak3 <- .sav.bak2
            if (bak2.exists() && bak2.length() > 0L) {
                runCatching { bak2.copyTo(bak3, overwrite = true) }
            }
            // Rotate: .sav.bak2 <- .sav.bak1
            if (bak1.exists() && bak1.length() > 0L) {
                runCatching { bak1.copyTo(bak2, overwrite = true) }
            }

            // Copy current save to temporary file, verify size > 0, then atomically promote to bak1
            val tempBak = File(cacheBackupDir, "$sramFileName.tmp_bak")
            val copied = copyCurrent(tempBak)
            if (copied && tempBak.exists() && tempBak.length() > 0L) {
                if (!tempBak.renameTo(bak1)) {
                    tempBak.copyTo(bak1, overwrite = true)
                    tempBak.delete()
                }
                // Backward compatibility mirror for single .bak readers
                val legacyBak = File(cacheBackupDir, "$sramFileName.bak")
                runCatching { bak1.copyTo(legacyBak, overwrite = true) }
                Log.i("SramProvider", "Rotated SRAM backups: bak3 <= bak2 <= bak1 <= current '$sramFileName'")
            } else {
                tempBak.delete()
            }
        }
    }

    @Throws(SramLoadException::class)
    fun getSramForRom(rom: Rom): Uri {
        lastRom = rom
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
                        rotateSramBackups(sramFileName) { destFile ->
                            runCatching {
                                sramFile.inputStream().use { input ->
                                    destFile.outputStream().use { output ->
                                        input.copyTo(output)
                                    }
                                }
                                true
                            }.getOrDefault(false)
                        }
                    }
                }
                val resolvedUri = Uri.fromFile(sramFile)
                lastSramUri = resolvedUri
                return resolvedUri
            }
        }

        var sramDocument = runCatching { rootDocument.findFile(sramFileName) }.getOrNull()
        if (sramDocument == null) {
            val legacyBinDoc = runCatching { rootDocument.findFile("$sramFileName.bin") }.getOrNull()
            if (legacyBinDoc != null) {
                runCatching { legacyBinDoc.renameTo(sramFileName) }
                sramDocument = runCatching { rootDocument.findFile(sramFileName) }.getOrNull() ?: legacyBinDoc
            }
        }
        return if (sramDocument != null) {
            if (sramDocument.length() == 0L) {
                Log.w("SramProvider", "Detected 0-byte corrupt save stub '$sramFileName', purging and recreating")
                runCatching { sramDocument.delete() }
                val recreated = runCatching { rootDocument.createFile("*/*", sramFileName)?.uri }.getOrNull()
                val resolvedUri = recreated
                    ?: runCatching { rootDocument.findFile(sramFileName)?.uri }.getOrNull()
                    ?: runCatching { rootDocument.findFile("$sramFileName.bin")?.uri }.getOrNull()
                    ?: runCatching {
                        val stormDsRoot = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS")
                        val fallbackDir = File(if (stormDsRoot.exists() || stormDsRoot.mkdirs()) stormDsRoot else (context.getExternalFilesDir(null) ?: context.filesDir), "saves").apply { mkdirs() }
                        val fallbackFile = File(fallbackDir, sramFileName)
                        if (!fallbackFile.exists()) fallbackFile.createNewFile()
                        Uri.fromFile(fallbackFile)
                    }.getOrNull()
                    ?: throw SramLoadException("Could not recreate SRAM file at ${rootDocument.uri}")
                lastSramUri = resolvedUri
                resolvedUri
            } else {
                // Remove legacy in-place .bak duplicate to keep user folder clean
                runCatching { rootDocument.findFile("$sramFileName.bak")?.delete() }

                // Rotate up to 3 verified backup copies in STORM DS cache directory
                if (sramDocument.length() > 0L) {
                    rotateSramBackups(sramFileName) { destFile ->
                        runCatching {
                            context.contentResolver.openInputStream(sramDocument.uri)?.use { input ->
                                destFile.outputStream().use { output ->
                                    input.copyTo(output)
                                }
                            }
                            true
                        }.getOrDefault(false)
                    }
                }
                val resolvedUri = sramDocument.uri
                lastSramUri = resolvedUri
                resolvedUri
            }
        } else {
            val newSramUri = runCatching { rootDocument.createFile("*/*", sramFileName)?.uri }.getOrNull()
            val resolvedUri = if (newSramUri == null) {
                runCatching { rootDocument.findFile(sramFileName)?.uri }.getOrNull()
                    ?: runCatching { rootDocument.findFile("$sramFileName.bin")?.uri }.getOrNull()
                    ?: runCatching {
                        val stormDsRoot = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS")
                        val fallbackDir = File(if (stormDsRoot.exists() || stormDsRoot.mkdirs()) stormDsRoot else (context.getExternalFilesDir(null) ?: context.filesDir), "saves").apply { mkdirs() }
                        val fallbackFile = File(fallbackDir, sramFileName)
                        if (!fallbackFile.exists()) fallbackFile.createNewFile()
                        Uri.fromFile(fallbackFile)
                    }.getOrNull()
                    ?: throw SramLoadException("Could not create temporary SRAM file at ${rootDocument.uri}")
            } else {
                newSramUri
            }
            lastSramUri = resolvedUri
            resolvedUri
        }
    }
}
