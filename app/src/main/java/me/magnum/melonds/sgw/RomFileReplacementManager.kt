package me.magnum.melonds.sgw

import android.content.Context
import android.net.Uri
import android.os.Environment
import android.os.ParcelFileDescriptor
import android.provider.DocumentsContract
import android.system.Os
import android.util.Log
import androidx.documentfile.provider.DocumentFile
import com.github.junrar.Archive
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.isActive
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.database.MelonDatabase
import me.magnum.melonds.domain.model.SaveStateSlot
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.ui.quickresume.QuickResumeStore
import me.magnum.melonds.ui.romlist.boxart.BoxArtRepository
import me.magnum.melonds.utils.FileUtils
import org.apache.commons.compress.archivers.sevenz.SevenZFile
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.zip.ZipInputStream
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.time.Duration

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
    companion object {
        private const val TAG = "RomFileReplacement"
        private const val MIN_VALID_ROM_BYTES = 512L
        private const val RESCAN_MATCH_TIMEOUT_MS = 4_000L
    }

    private val romExtensions = setOf("nds", "dsi", "srl")

    suspend fun downloadNewRom(
        entry: SgwGameEntry,
        onProgress: (downloadedBytes: Long, totalBytes: Long) -> Unit,
        isCancelled: () -> Boolean,
    ): SgwReplaceResult = withContext(Dispatchers.IO) {
        val targetDirDoc = resolveInstallDirectoryDoc(registerIfEmpty = true)
            ?: return@withContext SgwReplaceResult(success = false, errorMessage = "No writable ROM folder configured")

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

            if (isCancelled() || !currentCoroutineContext().isActive) {
                return@withContext SgwReplaceResult(success = false, errorMessage = "Cancelled by user")
            }

            val (romPayload, finalFileName) = prepareRomPayload(partFile, outcome.suggestedFileName, entry)
            extractedTempFile = if (romPayload.absolutePath != partFile.absolutePath) romPayload else null
            verifyRomPayload(romPayload)

            if (isCancelled() || !currentCoroutineContext().isActive) {
                return@withContext SgwReplaceResult(success = false, errorMessage = "Cancelled by user")
            }

            val writtenDoc = writeFileIntoDocumentDir(targetDirDoc, romPayload, finalFileName)
                ?: return@withContext SgwReplaceResult(success = false, errorMessage = "Failed to write ROM file")

            if (writtenDoc.length() < MIN_VALID_ROM_BYTES) {
                runCatching { writtenDoc.delete() }
                return@withContext SgwReplaceResult(success = false, errorMessage = "Written ROM file is invalid or empty")
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
        val parentDirDoc = resolveParentDirectoryForRom(oldRom)
            ?: return@withContext SgwReplaceResult(
                success = false,
                errorMessage = "ROM folder is read-only or unavailable",
            )

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

            if (isCancelled() || !currentCoroutineContext().isActive) {
                return@withContext SgwReplaceResult(success = false, errorMessage = "Cancelled by user")
            }

            val (romPayload, suggestedName) = prepareRomPayload(partFile, outcome.suggestedFileName, entry)
            extractedTempFile = if (romPayload.absolutePath != partFile.absolutePath) romPayload else null
            verifyRomPayload(romPayload)

            if (isCancelled() || !currentCoroutineContext().isActive) {
                return@withContext SgwReplaceResult(success = false, errorMessage = "Cancelled by user")
            }

            val finalFileName = ensureDistinctTargetFileName(oldRom.fileName, suggestedName)
            val newDoc = writeFileIntoDocumentDir(parentDirDoc, romPayload, finalFileName)
                ?: return@withContext SgwReplaceResult(success = false, errorMessage = "Failed to write replacement ROM")

            if (newDoc.length() < MIN_VALID_ROM_BYTES) {
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
            migrateQuickResumeKeys(oldRom, newDoc.uri, resolvedNewName)
            boxArtRepository.migrateCover(oldRom, newDoc.uri, resolvedNewName)
            migratePlayStats(oldRom.uri, newDoc.uri, entry.title)

            if (isCancelled() || !currentCoroutineContext().isActive) {
                return@withContext SgwReplaceResult(success = false, errorMessage = "Cancelled by user")
            }

            // Delete old ROM strictly AFTER verified creation and full save migration
            val oldDeleted = deleteDocumentSafely(oldRom.uri)
            if (!oldDeleted) {
                Log.w(TAG, "Failed to delete old ROM after replacement: ${oldRom.uri}")
            }

            partFile.delete()
            extractedTempFile?.delete()
            romsRepository.rescanRoms()

            val rescannedRom = withTimeoutOrNull(RESCAN_MATCH_TIMEOUT_MS) {
                romsRepository.getRoms()
                    .mapNotNull { list ->
                        list.firstOrNull { it.uri == newDoc.uri }
                            ?: list.firstOrNull { it.fileName.equals(resolvedNewName, ignoreCase = true) }
                    }
                    .first()
            }
            val targetRom = rescannedRom ?: oldRom.copy(
                fileName = resolvedNewName,
                uri = newDoc.uri,
            )
            romsRepository.updateRomConfig(targetRom, oldRom.config)
            if (oldRom.isFavorite && !targetRom.isFavorite) {
                romsRepository.setRomFavorite(targetRom, true)
            }
            val oldLastPlayed = oldRom.lastPlayed
            if (oldLastPlayed != null && (targetRom.lastPlayed == null || oldLastPlayed.after(targetRom.lastPlayed))) {
                romsRepository.setRomLastPlayed(targetRom, oldLastPlayed)
            }
            if (oldRom.totalPlayTime > targetRom.totalPlayTime && targetRom.totalPlayTime == Duration.ZERO) {
                val delta = oldRom.totalPlayTime - targetRom.totalPlayTime
                if (delta > Duration.ZERO) {
                    romsRepository.addRomPlayTime(targetRom, delta)
                }
            }

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
        if (isZip) {
            ZipInputStream(FileInputStream(partFile).buffered()).use { zis ->
                var zipEntry = zis.nextEntry
                while (zipEntry != null) {
                    if (!zipEntry.isDirectory) {
                        val cleanName = sanitizeArchiveRomEntryName(zipEntry.name.orEmpty())
                        if (cleanName != null) {
                            val ext = cleanName.substringAfterLast('.').lowercase()
                            val outTemp = File(partFile.parentFile, "extracted_${entry.id}_${entry.translationReleaseId ?: 0}.$ext")
                            FileOutputStream(outTemp, false).use { out ->
                                zis.copyTo(out)
                                out.flush()
                            }
                            if (outTemp.length() > 0L) {
                                return outTemp to cleanName
                            }
                        }
                    }
                    zipEntry = zis.nextEntry
                }
            }
            throw IllegalStateException("ZIP archive contains no .nds/.dsi/.srl ROM file")
        }

        val is7z = isSevenZFile(partFile) || (suggestedName?.endsWith(".7z", ignoreCase = true) == true)
        if (is7z) {
            SevenZFile.Builder().setFile(partFile).get().use { sevenZ ->
                var sevenZEntry = sevenZ.nextEntry
                while (sevenZEntry != null) {
                    if (!sevenZEntry.isDirectory) {
                        val cleanName = sanitizeArchiveRomEntryName(sevenZEntry.name.orEmpty())
                        if (cleanName != null) {
                            val ext = cleanName.substringAfterLast('.').lowercase()
                            val outTemp = File(partFile.parentFile, "extracted_${entry.id}_${entry.translationReleaseId ?: 0}.$ext")
                            sevenZ.getInputStream(sevenZEntry).use { input ->
                                FileOutputStream(outTemp, false).use { out ->
                                    input.copyTo(out)
                                    out.flush()
                                }
                            }
                            if (outTemp.length() > 0L) {
                                return outTemp to cleanName
                            }
                        }
                    }
                    sevenZEntry = sevenZ.nextEntry
                }
            }
            throw IllegalStateException("7z archive contains no .nds/.dsi/.srl ROM file")
        }

        val isRar = isRarFile(partFile) || (suggestedName?.endsWith(".rar", ignoreCase = true) == true)
        if (isRar) {
            Archive(partFile).use { archive ->
                val headers = archive.fileHeaders.orEmpty()
                for (header in headers) {
                    if (!header.isDirectory) {
                        val cleanName = sanitizeArchiveRomEntryName(header.fileName.orEmpty())
                        if (cleanName != null) {
                            val ext = cleanName.substringAfterLast('.').lowercase()
                            val outTemp = File(partFile.parentFile, "extracted_${entry.id}_${entry.translationReleaseId ?: 0}.$ext")
                            archive.getInputStream(header).use { input ->
                                FileOutputStream(outTemp, false).use { out ->
                                    input.copyTo(out)
                                    out.flush()
                                }
                            }
                            if (outTemp.length() > 0L) {
                                return outTemp to cleanName
                            }
                        }
                    }
                }
            }
            throw IllegalStateException("RAR archive contains no .nds/.dsi/.srl ROM file")
        }

        val defaultExt = if (entry.platform == SgwPlatform.DSI) "dsi" else "nds"
        val name = normalizeRomFilename(suggestedName ?: "${entry.title}.$defaultExt", defaultExt)
        return partFile to name
    }

    private fun sanitizeArchiveRomEntryName(rawEntryName: String): String? {
        val normalized = rawEntryName.replace('\\', '/')
        val segments = normalized.split('/').filter { it.isNotBlank() }
        if (segments.isEmpty() || segments.any { it == ".." }) {
            return null
        }
        val base = segments.last().replace(Regex("""[\\/:*?"<>|]"""), "_").trim()
        if (base.isBlank()) return null
        val ext = base.substringAfterLast('.', "").lowercase()
        return if (ext in romExtensions) base else null
    }

    private fun verifyRomPayload(payload: File) {
        if (!payload.isFile || payload.length() < MIN_VALID_ROM_BYTES) {
            throw IllegalStateException("ROM payload is missing or smaller than $MIN_VALID_ROM_BYTES bytes")
        }
        if (isZipFile(payload) || isSevenZFile(payload) || isRarFile(payload)) {
            throw IllegalStateException("ROM payload is still an unextracted archive")
        }
        val head = ByteArray(64)
        val read = FileInputStream(payload).use { it.read(head) }
        if (read > 0) {
            val headText = String(head, 0, read, Charsets.UTF_8).trimStart().lowercase()
            if (
                headText.startsWith("<html") ||
                headText.startsWith("<!doc") ||
                headText.startsWith("<?xml") ||
                headText.startsWith("<head") ||
                headText.startsWith("<body") ||
                headText.startsWith("<script")
            ) {
                throw IllegalStateException("Downloaded payload is HTML/XML instead of a ROM")
            }
        }
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

    private fun isSevenZFile(file: File): Boolean {
        if (!file.isFile || file.length() < 6L) return false
        return runCatching {
            FileInputStream(file).use { fis ->
                val sig = ByteArray(6)
                fis.read(sig) == 6 &&
                    sig[0] == 0x37.toByte() &&
                    sig[1] == 0x7A.toByte() &&
                    sig[2] == 0xBC.toByte() &&
                    sig[3] == 0xAF.toByte() &&
                    sig[4] == 0x27.toByte() &&
                    sig[5] == 0x1C.toByte()
            }
        }.getOrDefault(false)
    }

    private fun isRarFile(file: File): Boolean {
        if (!file.isFile || file.length() < 7L) return false
        return runCatching {
            FileInputStream(file).use { fis ->
                val sig = ByteArray(4)
                fis.read(sig) == 4 &&
                    sig[0] == 0x52.toByte() &&
                    sig[1] == 0x61.toByte() &&
                    sig[2] == 0x72.toByte() &&
                    sig[3] == 0x21.toByte()
            }
        }.getOrDefault(false)
    }

    private fun normalizeRomFilename(rawName: String, fallbackExt: String): String {
        val clean = rawName.substringAfterLast('/').substringAfterLast('\\')
            .replace(Regex("""[\\/:*?"<>|]"""), "_").trim()
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

    private fun resolveInstallDirectoryDoc(registerIfEmpty: Boolean = false): DocumentFile? {
        val searchDirs = settingsRepository.getRomSearchDirectories()
        for (dirUri in searchDirs) {
            val doc = resolveDirectoryDocumentAccurately(dirUri)
            if (doc != null && doc.exists() && doc.canWrite()) return doc
        }
        val fallbackDir = File(Environment.getExternalStorageDirectory(), "STORM DS/roms").apply { mkdirs() }
        if (fallbackDir.isDirectory && fallbackDir.canWrite()) {
            if (registerIfEmpty && searchDirs.isEmpty()) {
                settingsRepository.addRomSearchDirectory(Uri.fromFile(fallbackDir))
            }
            return DocumentFile.fromFile(fallbackDir)
        }
        return null
    }

    private fun resolveParentDirectoryForRom(rom: Rom): DocumentFile? {
        rom.parentTreeUri?.let { treeUri ->
            val doc = resolveDirectoryDocumentAccurately(treeUri)
            return if (doc != null && doc.exists() && doc.canWrite()) doc else null
        }
        if (rom.uri.scheme == "file") {
            val parent = rom.uri.path?.let(::File)?.parentFile
            return if (parent != null && parent.isDirectory && parent.canWrite()) {
                DocumentFile.fromFile(parent)
            } else {
                null
            }
        }
        return resolveInstallDirectoryDoc(registerIfEmpty = true)
    }

    private fun resolveDirectoryDocumentAccurately(uri: Uri): DocumentFile? {
        if (uri.scheme == "file" || uri.scheme == null) {
            val dir = uri.path?.let(::File)
            return if (dir != null && dir.isDirectory) DocumentFile.fromFile(dir) else null
        }
        val directFile = FileUtils.resolveDirectFileFromExternalStorageUri(uri)
        if (directFile != null && directFile.isDirectory && directFile.canWrite()) {
            return DocumentFile.fromFile(directFile)
        }
        val treeRoot = runCatching { DocumentFile.fromTreeUri(context, uri) }.getOrNull()
        val treeDocId = runCatching { DocumentsContract.getTreeDocumentId(uri) }.getOrNull()
        val docId = if (DocumentsContract.isDocumentUri(context, uri)) {
            runCatching { DocumentsContract.getDocumentId(uri) }.getOrNull()
        } else {
            null
        }
        if (treeRoot != null && treeDocId != null && docId != null && docId != treeDocId && docId.startsWith(treeDocId)) {
            val rel = docId.removePrefix(treeDocId).trimStart('/', ':')
            var current: DocumentFile? = treeRoot
            for (segment in rel.split('/').filter { it.isNotEmpty() }) {
                current = current?.findFile(segment)?.takeIf { it.isDirectory }
                if (current == null) break
            }
            if (current != null && current.exists()) {
                return current
            }
        }
        return uriHandler.getUriTreeDocument(uri)
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
                try {
                    Os.ftruncate(pfd.fileDescriptor, 0L)
                    ParcelFileDescriptor.AutoCloseOutputStream(pfd)
                } catch (t: Throwable) {
                    runCatching { pfd.close() }
                    throw t
                }
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
        val savesDir = extRoot?.let { File(it, "STORM DS/saves") }?.takeIf { it.isDirectory }
        if (savesDir != null) {
            for (ext in extensions) {
                val src = File(savesDir, "$oldBase.$ext")
                val dst = File(savesDir, "$newBase.$ext")
                if (src.isFile && src.length() > 0L) {
                    src.copyTo(dst, overwrite = true)
                    count++
                }
            }
        }

        val saveDirUri = runCatching { settingsRepository.getSaveFileDirectory(oldRom) }.getOrNull()
        val saveDirectDir = saveDirUri?.let { FileUtils.resolveDirectFileFromExternalStorageUri(it) }
        val isSameAsStormSaves = savesDir != null && saveDirectDir != null && runCatching {
            savesDir.canonicalPath == saveDirectDir.canonicalPath
        }.getOrDefault(false)

        if (!isSameAsStormSaves && saveDirUri != null) {
            val saveDirDoc = runCatching { resolveDirectoryDocumentAccurately(saveDirUri) }.getOrNull()
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
        }
        return count
    }

    private fun migrateSaveStates(oldRom: Rom, oldBase: String, newBase: String): Int {
        var count = 0
        val stateDirUri = settingsRepository.getSaveStateDirectory(oldRom) ?: return 0
        val stateDirDoc = resolveDirectoryDocumentAccurately(stateDirUri) ?: return 0
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
            if (targetDir.uri.scheme == "file" && !targetDir.uri.path.isNullOrBlank()) {
                val destFile = File(targetDir.uri.path!!, destName)
                context.contentResolver.openInputStream(srcDoc.uri)?.use { input ->
                    FileOutputStream(destFile, false).use { out ->
                        input.copyTo(out)
                        out.flush()
                    }
                } ?: return false
                return destFile.isFile && destFile.length() > 0L
            }

            val dstDoc = targetDir.findFile(destName) ?: targetDir.createFile("*/*", destName) ?: return false
            val outStream = runCatching { context.contentResolver.openOutputStream(dstDoc.uri, "wt") }.getOrNull()
                ?: runCatching { context.contentResolver.openOutputStream(dstDoc.uri, "rwt") }.getOrNull()
                ?: runCatching {
                    val pfd = context.contentResolver.openFileDescriptor(dstDoc.uri, "rw") ?: return@runCatching null
                    try {
                        Os.ftruncate(pfd.fileDescriptor, 0L)
                        ParcelFileDescriptor.AutoCloseOutputStream(pfd)
                    } catch (t: Throwable) {
                        runCatching { pfd.close() }
                        throw t
                    }
                }.getOrNull()
                ?: return false

            context.contentResolver.openInputStream(srcDoc.uri)?.use { input ->
                outStream.use { out ->
                    input.copyTo(out)
                    out.flush()
                }
            } ?: run {
                runCatching { outStream.close() }
                return false
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
        val slots = (-1..8).toList() + SaveStateSlot.PERIODIC_AUTO_SAVE_SLOT
        for (slot in slots) {
            val v = prefs.getString("${oldHash}_slot_$slot", null)
            if (!v.isNullOrBlank()) {
                editor.putString("${newHash}_slot_$slot", v)
            }
        }
        editor.apply()
    }

    private fun migrateQuickResumeKeys(oldRom: Rom, newUri: Uri, newFileName: String) {
        val oldUriStr = oldRom.uri.toString()
        val newUriStr = newUri.toString()
        if (oldUriStr == newUriStr) return

        runCatching {
            val quickTs = QuickResumeStore.getQuickSaveTimestamp(context, oldUriStr)
            if (quickTs != null && quickTs > 0L) {
                QuickResumeStore.markQuickSaveUpdated(context, newUriStr, quickTs)
                QuickResumeStore.clearQuickSave(context, oldUriStr)
            }
            val lastEntry = QuickResumeStore.getLastRomEntry(context)
            if (lastEntry != null && lastEntry.uriString == oldUriStr) {
                QuickResumeStore.rememberLastRom(
                    context,
                    oldRom.copy(uri = newUri, fileName = newFileName),
                )
            }
        }
    }

    private suspend fun migratePlayStats(oldUri: Uri, newUri: Uri, title: String) {
        val oldStr = oldUri.toString()
        val newStr = newUri.toString()
        if (oldStr == newStr) return

        runCatching {
            val dao = database.playStatsDao()
            dao.migrateRomStats(oldStr, newStr, title)
        }
        runCatching {
            val prefs = context.getSharedPreferences("storm_play_stats", Context.MODE_PRIVATE)
            val oldMeta = prefs.getString("rom_meta_$oldStr", null)
            if (oldMeta != null) {
                prefs.edit()
                    .putString("rom_meta_$newStr", oldMeta)
                    .remove("rom_meta_$oldStr")
                    .apply()
            }
        }
    }

    private fun deleteDocumentSafely(uri: Uri): Boolean {
        return runCatching {
            if (uri.scheme == "file") {
                val f = uri.path?.let(::File) ?: return false
                return !f.exists() || f.delete()
            }
            val docDeleted = uriHandler.getUriDocument(uri)?.delete() == true
            if (docDeleted) return true
            val directFile = FileUtils.resolveDirectFileFromExternalStorageUri(uri)
            if (directFile != null && directFile.exists()) {
                return directFile.delete()
            }
            uriHandler.getUriDocument(uri)?.exists() != true
        }.getOrDefault(false)
    }
}
