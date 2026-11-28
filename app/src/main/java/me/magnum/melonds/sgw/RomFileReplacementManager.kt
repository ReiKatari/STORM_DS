package me.magnum.melonds.sgw

import android.content.Context
import android.net.Uri
import android.os.Environment
import android.os.ParcelFileDescriptor
import android.system.Os
import androidx.documentfile.provider.DocumentFile
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.database.MelonDatabase
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.ui.romlist.boxart.BoxArtRepository
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.zip.ZipInputStream
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RomFileReplacementManager @Inject constructor(
    @param:ApplicationContext private val context: Context,
    private val apiClient: SgwApiClient,
    private val settingsRepository: SettingsRepository,
    private val romsRepository: RomsRepository,
    private val boxArtRepository: BoxArtRepository,
    private val database: MelonDatabase,
    private val uriHandler: UriHandler,
) {
    private val romExtensions = setOf("nds", "dsi", "srl")

    suspend fun downloadNewRom(
        entry: SgwGameEntry,
        onProgress: (downloadedBytes: Long, totalBytes: Long) -> Unit,
        isCancelled: () -> Boolean,
    ): SgwReplaceResult = withContext(Dispatchers.IO) {
        val workDir = File(context.cacheDir, "sgw_stage").apply { mkdirs() }
        val partFile = File(workDir, "entry_${entry.id}_${entry.translationReleaseId ?: 0}.part")
        var extractedTempFile: File? = null

        try {
            val outcome = apiClient.downloadWithResume(entry, partFile, onProgress, isCancelled)
            if (!outcome.success) {
                return@withContext SgwReplaceResult(
                    success = false,
                    httpStatusCode = outcome.httpStatusCode,
                    errorMessage = outcome.errorMessage ?: "Download failed",
                )
            }

            val (romPayload, finalFileName) = prepareRomPayload(partFile, outcome.suggestedFileName, entry)
            extractedTempFile = if (romPayload.absolutePath != partFile.absolutePath) romPayload else null
            if (!romPayload.isFile || romPayload.length() <= 0L) {
                return@withContext SgwReplaceResult(success = false, errorMessage = "Empty ROM payload")
            }

            val targetDirDoc = resolveInstallDirectoryDoc()
                ?: return@withContext SgwReplaceResult(success = false, errorMessage = "No writable ROM folder configured")

            val writtenDoc = writeFileIntoDocumentDir(targetDirDoc, romPayload, finalFileName)
                ?: return@withContext SgwReplaceResult(success = false, errorMessage = "Failed to write ROM file")

            if (writtenDoc.length() <= 0L) {
                runCatching { writtenDoc.delete() }
                return@withContext SgwReplaceResult(success = false, errorMessage = "Written ROM file is empty")
            }

            partFile.delete()
            extractedTempFile?.delete()
            romsRepository.rescanRoms()

            SgwReplaceResult(
                success = true,
                newRomUri = writtenDoc.uri,
                newFileName = writtenDoc.name ?: finalFileName,
            )
        } catch (t: Throwable) {
            SgwReplaceResult(success = false, errorMessage = t.message ?: t::class.java.simpleName)
        } finally {
            extractedTempFile?.takeIf { it.exists() }?.delete()
        }
    }

    suspend fun downloadAndReplaceRom(
        oldRom: Rom,
        entry: SgwGameEntry,
        onProgress: (downloadedBytes: Long, totalBytes: Long) -> Unit,
        isCancelled: () -> Boolean,
    ): SgwReplaceResult = withContext(Dispatchers.IO) {
        val workDir = File(context.cacheDir, "sgw_stage").apply { mkdirs() }
        val partFile = File(workDir, "replace_${entry.id}_${entry.translationReleaseId ?: 0}.part")
        var extractedTempFile: File? = null

        try {
            val outcome = apiClient.downloadWithResume(entry, partFile, onProgress, isCancelled)
            if (!outcome.success) {
                // Critical safety check: never touch or delete oldRom on HTTP 404 or download failure
                return@withContext SgwReplaceResult(
                    success = false,
                    httpStatusCode = outcome.httpStatusCode,
                    errorMessage = outcome.errorMessage ?: "Download failed",
                )
            }

            val (romPayload, suggestedName) = prepareRomPayload(partFile, outcome.suggestedFileName, entry)
            extractedTempFile = if (romPayload.absolutePath != partFile.absolutePath) romPayload else null
            if (!romPayload.isFile || romPayload.length() <= 0L) {
                return@withContext SgwReplaceResult(success = false, errorMessage = "Empty ROM payload")
            }

            val parentDirDoc = resolveParentDirectoryForRom(oldRom)
                ?: return@withContext SgwReplaceResult(success = false, errorMessage = "ROM folder unavailable")

            val finalFileName = ensureDistinctTargetFileName(oldRom.fileName, suggestedName)
            val newDoc = writeFileIntoDocumentDir(parentDirDoc, romPayload, finalFileName)
                ?: return@withContext SgwReplaceResult(success = false, errorMessage = "Failed to write replacement ROM")

            if (newDoc.length() <= 0L) {
                runCatching { newDoc.delete() }
                return@withContext SgwReplaceResult(success = false, errorMessage = "Replacement ROM verification failed")
            }

            val resolvedNewName = newDoc.name ?: finalFileName
            val oldBase = oldRom.fileName.substringBeforeLast('.')
            val newBase = resolvedNewName.substringBeforeLast('.')

            var migratedSaves = 0
            var migratedStates = 0
            if (oldBase.isNotBlank() && newBase.isNotBlank() && oldBase != newBase) {
                migratedSaves = migrateSaveFilesAndOptions(oldRom, oldBase, newBase)
                migratedStates = migrateSaveStates(oldRom, oldBase, newBase)
            }
            migrateSaveStateScreenshots(oldRom.uri, newDoc.uri)
            migrateSaveStateCustomNames(oldRom.uri, newDoc.uri)
            boxArtRepository.migrateCover(oldRom, newDoc.uri, resolvedNewName)
            migratePlayStats(oldRom.uri, newDoc.uri, entry.title)

            // Delete old ROM strictly AFTER verified creation and full save migration
            deleteDocumentSafely(oldRom.uri)

            partFile.delete()
            extractedTempFile?.delete()
            romsRepository.rescanRoms()

            // Re-apply user per-ROM config to the newly created ROM entry if custom
            val updatedRom = oldRom.copy(
                fileName = resolvedNewName,
                uri = newDoc.uri,
            )
            romsRepository.updateRomConfig(updatedRom, oldRom.config)

            SgwReplaceResult(
                success = true,
                newRomUri = newDoc.uri,
                newFileName = resolvedNewName,
                migratedSavesCount = migratedSaves,
                migratedStatesCount = migratedStates,
            )
        } catch (t: Throwable) {
            SgwReplaceResult(success = false, errorMessage = t.message ?: t::class.java.simpleName)
        } finally {
            extractedTempFile?.takeIf { it.exists() }?.delete()
        }
    }

    private fun prepareRomPayload(partFile: File, suggestedName: String?, entry: SgwGameEntry): Pair<File, String> {
        val isZip = isZipFile(partFile) || (suggestedName?.endsWith(".zip", ignoreCase = true) == true)
        if (!isZip) {
            val defaultExt = if (entry.platform == SgwPlatform.DSI) "dsi" else "nds"
            val name = normalizeRomFilename(suggestedName ?: "${entry.title}.$defaultExt", defaultExt)
            return partFile to name
        }

        ZipInputStream(FileInputStream(partFile).buffered()).use { zis ->
            var zipEntry = zis.nextEntry
            while (zipEntry != null) {
                if (!zipEntry.isDirectory) {
                    val entryName = zipEntry.name.substringAfterLast('/')
                    val ext = entryName.substringAfterLast('.', "").lowercase()
                    if (ext in romExtensions) {
                        val outTemp = File(partFile.parentFile, "extracted_${entry.id}.$ext")
                        FileOutputStream(outTemp, false).use { out ->
                            zis.copyTo(out)
                            out.flush()
                        }
                        if (outTemp.length() > 0L) {
                            return outTemp to entryName
                        }
                    }
                }
                zipEntry = zis.nextEntry
            }
        }
        throw IllegalStateException("ZIP archive contains no .nds/.dsi/.srl ROM file")
    }

    private fun isZipFile(file: File): Boolean {
        if (!file.isFile || file.length() < 4L) return false
        return runCatching {
            FileInputStream(file).use { fis ->
                val sig = ByteArray(4)
                fis.read(sig) == 4 && sig[0] == 0x50.toByte() && sig[1] == 0x4B.toByte()
            }
        }.getOrDefault(false)
    }

    private fun normalizeRomFilename(rawName: String, fallbackExt: String): String {
        val clean = rawName.substringAfterLast('/').replace(Regex("""[\\/:*?"<>|]"""), "_").trim()
        val ext = clean.substringAfterLast('.', "").lowercase()
        return if (ext in romExtensions) clean else "${clean.substringBeforeLast('.')}.$fallbackExt"
    }

    private fun ensureDistinctTargetFileName(oldFileName: String, candidateName: String): String {
        if (!oldFileName.equals(candidateName, ignoreCase = true)) {
            return candidateName
        }
        val base = candidateName.substringBeforeLast('.')
        val ext = candidateName.substringAfterLast('.', "nds")
        return "${base}_updated.$ext"
    }

    private fun resolveInstallDirectoryDoc(): DocumentFile? {
        for (dirUri in settingsRepository.getRomSearchDirectories()) {
            val doc = uriHandler.getUriTreeDocument(dirUri)
            if (doc != null && doc.exists() && doc.canWrite()) return doc
        }
        val fallbackDir = File(Environment.getExternalStorageDirectory(), "STORM DS/roms").apply { mkdirs() }
        return if (fallbackDir.isDirectory && fallbackDir.canWrite()) DocumentFile.fromFile(fallbackDir) else null
    }

    private fun resolveParentDirectoryForRom(rom: Rom): DocumentFile? {
        rom.parentTreeUri?.let { treeUri ->
            val doc = uriHandler.getUriTreeDocument(treeUri)
            if (doc != null && doc.exists() && doc.canWrite()) return doc
        }
        if (rom.uri.scheme == "file") {
            val parent = rom.uri.path?.let(::File)?.parentFile
            if (parent != null && parent.isDirectory && parent.canWrite()) return DocumentFile.fromFile(parent)
        }
        return resolveInstallDirectoryDoc()
    }

    private fun writeFileIntoDocumentDir(dirDoc: DocumentFile, source: File, fileName: String): DocumentFile? {
        if (dirDoc.uri.scheme == "file" && !dirDoc.uri.path.isNullOrBlank()) {
            val dest = File(dirDoc.uri.path!!, fileName)
            source.inputStream().use { input ->
                FileOutputStream(dest, false).use { output ->
                    input.copyTo(output)
                    output.flush()
                }
            }
            return DocumentFile.fromFile(dest)
        }

        val existing = dirDoc.findFile(fileName)
        val created = existing ?: dirDoc.createFile("application/octet-stream", fileName) ?: return null
        val outStream = runCatching { context.contentResolver.openOutputStream(created.uri, "wt") }.getOrNull()
            ?: runCatching { context.contentResolver.openOutputStream(created.uri, "rwt") }.getOrNull()
            ?: runCatching {
                val pfd = context.contentResolver.openFileDescriptor(created.uri, "rw") ?: return@runCatching null
                Os.ftruncate(pfd.fileDescriptor, 0L)
                ParcelFileDescriptor.AutoCloseOutputStream(pfd)
            }.getOrNull()
            ?: return null

        outStream.use { out ->
            source.inputStream().use { input ->
                input.copyTo(out)
                out.flush()
            }
        }
        return created
    }

    private fun migrateSaveFilesAndOptions(oldRom: Rom, oldBase: String, newBase: String): Int {
        var count = 0
        val extensions = listOf("sav", "srm", "dsv", "opts")

        val extRoot = runCatching { Environment.getExternalStorageDirectory() }.getOrNull()
        if (extRoot != null) {
            val savesDir = File(extRoot, "STORM DS/saves")
            if (savesDir.isDirectory) {
                for (ext in extensions) {
                    val src = File(savesDir, "$oldBase.$ext")
                    val dst = File(savesDir, "$newBase.$ext")
                    if (src.isFile && src.length() > 0L) {
                        src.copyTo(dst, overwrite = true)
                        count++
                    }
                }
            }
        }

        val saveDirDoc = runCatching { uriHandler.getUriTreeDocument(settingsRepository.getSaveFileDirectory(oldRom)) }.getOrNull()
        if (saveDirDoc != null && saveDirDoc.isDirectory) {
            for (ext in extensions) {
                val srcDoc = saveDirDoc.findFile("$oldBase.$ext") ?: saveDirDoc.findFile("$oldBase.$ext.bin")
                if (srcDoc != null && srcDoc.length() > 0L) {
                    if (copyDocumentFile(srcDoc, saveDirDoc, "$newBase.$ext")) {
                        count++
                    }
                }
            }
        }
        return count
    }

    private fun migrateSaveStates(oldRom: Rom, oldBase: String, newBase: String): Int {
        var count = 0
        val stateDirUri = settingsRepository.getSaveStateDirectory(oldRom) ?: return 0
        val stateDirDoc = uriHandler.getUriTreeDocument(stateDirUri) ?: return 0
        val suffixes = (0..8).map { "ml$it" } + "periodic_autosave.ml"

        for (suffix in suffixes) {
            val srcName = "$oldBase.$suffix"
            val dstName = "$newBase.$suffix"
            val srcDoc = stateDirDoc.findFile(srcName)
            if (srcDoc != null && srcDoc.length() > 0L) {
                if (copyDocumentFile(srcDoc, stateDirDoc, dstName)) {
                    count++
                }
            }
        }
        return count
    }

    private fun copyDocumentFile(srcDoc: DocumentFile, targetDir: DocumentFile, destName: String): Boolean {
        return runCatching {
            val dstDoc = targetDir.findFile(destName) ?: targetDir.createFile("*/*", destName) ?: return false
            context.contentResolver.openInputStream(srcDoc.uri)?.use { input ->
                context.contentResolver.openOutputStream(dstDoc.uri, "wt")?.use { out ->
                    input.copyTo(out)
                    out.flush()
                }
            }
            dstDoc.length() > 0L
        }.getOrDefault(false)
    }

    private fun migrateSaveStateScreenshots(oldUri: Uri, newUri: Uri) {
        val oldHash = oldUri.hashCode().toString()
        val newHash = newUri.hashCode().toString()
        if (oldHash == newHash) return

        val dirs = listOfNotNull(
            runCatching { File(Environment.getExternalStorageDirectory(), "STORM DS/screenshots/savestates") }.getOrNull(),
            File(context.filesDir, "ss_screenshots"),
        )
        for (root in dirs) {
            val oldDir = File(root, oldHash)
            if (oldDir.isDirectory) {
                val newDir = File(root, newHash).apply { mkdirs() }
                oldDir.listFiles()?.forEach { file ->
                    if (file.isFile) {
                        runCatching { file.copyTo(File(newDir, file.name), overwrite = true) }
                    }
                }
            }
        }
    }

    private fun migrateSaveStateCustomNames(oldUri: Uri, newUri: Uri) {
        val oldHash = oldUri.hashCode()
        val newHash = newUri.hashCode()
        if (oldHash == newHash) return
        val prefs = context.getSharedPreferences("save_state_names", Context.MODE_PRIVATE)
        val editor = prefs.edit()
        for (slot in -1..8) {
            val v = prefs.getString("${oldHash}_slot_$slot", null)
            if (!v.isNullOrBlank()) {
                editor.putString("${newHash}_slot_$slot", v)
            }
        }
        editor.apply()
    }

    private suspend fun migratePlayStats(oldUri: Uri, newUri: Uri, title: String) {
        val oldStr = oldUri.toString()
        val newStr = newUri.toString()
        if (oldStr == newStr) return

        runCatching {
            val dao = database.playStatsDao()
            dao.migrateRomUri(oldStr, newStr, title)
            dao.migrateSessionsRomUri(oldStr, newStr, title)
        }
        runCatching {
            val prefs = context.getSharedPreferences("storm_play_stats", Context.MODE_PRIVATE)
            val oldMeta = prefs.getString("rom_meta_$oldStr", null)
            if (oldMeta != null) {
                prefs.edit().putString("rom_meta_$newStr", oldMeta).apply()
            }
        }
    }

    private fun deleteDocumentSafely(uri: Uri) {
        if (uri.scheme == "file") {
            uri.path?.let(::File)?.takeIf { it.exists() }?.delete()
            return
        }
        uriHandler.getUriDocument(uri)?.delete()
    }
}
