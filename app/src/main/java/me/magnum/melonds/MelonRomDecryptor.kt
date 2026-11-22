package me.magnum.melonds

import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.ParcelFileDescriptor
import android.provider.DocumentsContract
import android.provider.OpenableColumns
import android.system.Os
import android.util.Log
import androidx.documentfile.provider.DocumentFile
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.impl.NdsRomCache
import me.magnum.melonds.utils.FileUtils
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import java.util.Locale
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream
import java.util.zip.ZipOutputStream

/**
 * JNI bridge for DSi ROM Modcrypt decryption.
 * Checks if a ROM file is encrypted (AES-128-CTR Modcrypt) and can decrypt it in-place on disk.
 * Supports raw DSi ROMs (.nds/.dsi/.srl/.app), containers (.cia/.tad), single-ROM .zip archives,
 * direct file paths, SAF ParcelFileDescriptors, and atomic/safe stream fallbacks.
 */
object MelonRomDecryptor {
    private const val TAG = "MelonRomDecryptor"
    private val RAW_ROM_EXTENSIONS = setOf("nds", "dsi", "srl", "app", "ids")
    private val ZIP_ROM_EXTENSIONS = setOf("nds", "dsi", "srl", "ids")
    private val SKIPPED_ARCHIVE_EXTENSIONS = setOf("7z", "rar")

    private val CRC16_TABLE = IntArray(256).apply {
        for (i in 0 until 256) {
            var crc = i
            for (b in 0 until 8) {
                crc = if ((crc and 1) != 0) (crc ushr 1) xor 0xA001 else (crc ushr 1)
            }
            this[i] = crc and 0xFFFF
        }
    }

    enum class EncryptionStatus(val code: Int) {
        NOT_ENCRYPTED(0),
        MODCRYPT_ENCRYPTED(1),
        ERROR_READING_FILE(-1),
        ERROR_NOT_DSI_ROM(-2),
        ERROR_FILE_TOO_SMALL(-3);

        companion object {
            fun fromCode(code: Int): EncryptionStatus =
                entries.find { it.code == code } ?: ERROR_READING_FILE
        }
    }

    enum class DecryptResult(val code: Int) {
        SUCCESS(0),
        ALREADY_DECRYPTED(1),
        ERROR_READING_FILE(-1),
        ERROR_WRITING_FILE(-2),
        ERROR_NOT_DSI_ROM(-3),
        ERROR_FILE_TOO_SMALL(-4),
        ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS(-5),
        ERROR_VALIDATION_FAILED(-6);

        companion object {
            fun fromCode(code: Int): DecryptResult =
                entries.find { it.code == code } ?: ERROR_READING_FILE
        }
    }

    interface DecryptProgressCallback {
        fun onProgress(current: Int, total: Int)
    }

    private data class ContainerSlice(
        val offset: Long,
        val size: Long,
    )

    fun checkEncryption(romPath: String): EncryptionStatus {
        return try {
            EncryptionStatus.fromCode(checkEncryptionNative(romPath))
        } catch (_: Throwable) {
            EncryptionStatus.ERROR_READING_FILE
        }
    }

    fun checkEncryption(context: Context, uri: Uri): EncryptionStatus {
        if (uri.scheme == Rom.INSTALLED_DSIWARE_URI_SCHEME) {
            return EncryptionStatus.NOT_ENCRYPTED
        }

        val path = FileUtils.getAbsolutePathFromSAFUri(context, uri)
        val ext = resolveExtension(context, uri, path)
        if (ext in SKIPPED_ARCHIVE_EXTENSIONS) {
            return EncryptionStatus.NOT_ENCRYPTED
        }

        if (ext == "cia" || ext == "tad") {
            return checkContainerEncryption(context, uri, path, ext)
        }

        if (ext == "zip" || ext == "ndz") {
            return checkZipEncryption(context, uri, path)
        }

        if (ext.isNotEmpty() && ext !in RAW_ROM_EXTENSIONS) {
            return EncryptionStatus.NOT_ENCRYPTED
        }

        if (path != null) {
            val status = checkEncryption(path)
            if (status != EncryptionStatus.ERROR_READING_FILE) {
                return status
            }
        }

        return try {
            context.contentResolver.openFileDescriptor(uri, "r")?.use { pfd ->
                EncryptionStatus.fromCode(checkEncryptionFdNative(pfd.fd))
            } ?: EncryptionStatus.ERROR_READING_FILE
        } catch (_: Throwable) {
            EncryptionStatus.ERROR_READING_FILE
        }
    }

    fun decryptRom(romPath: String, progressCallback: DecryptProgressCallback? = null): DecryptResult {
        return try {
            DecryptResult.fromCode(decryptRomNative(romPath, progressCallback))
        } catch (_: Throwable) {
            DecryptResult.ERROR_READING_FILE
        }
    }

    fun decryptRom(context: Context, uri: Uri, progressCallback: DecryptProgressCallback? = null): DecryptResult {
        if (uri.scheme == Rom.INSTALLED_DSIWARE_URI_SCHEME) {
            return DecryptResult.ALREADY_DECRYPTED
        }

        val path = FileUtils.getAbsolutePathFromSAFUri(context, uri)
        val ext = resolveExtension(context, uri, path)
        if (ext in SKIPPED_ARCHIVE_EXTENSIONS) {
            return DecryptResult.ERROR_NOT_DSI_ROM
        }

        if (ext == "cia" || ext == "tad") {
            return decryptContainerRom(context, uri, path, ext, progressCallback)
        }

        if (ext == "zip" || ext == "ndz") {
            return decryptZipRom(context, uri, path, progressCallback)
        }

        // Raw DSi ROM: prefer atomic sibling temp replacement on direct path
        if (path != null) {
            val targetFile = File(path)
            if (targetFile.isFile && targetFile.canRead() && targetFile.canWrite()) {
                val atomicResult = decryptDirectFileAtomically(targetFile, progressCallback)
                if (atomicResult != null) {
                    return atomicResult
                }
            }
        }

        // SAF content:// or fallback: copy to cache -> decrypt -> validate -> write back safely
        val cacheFile = File(context.cacheDir, "modcrypt_temp_${System.currentTimeMillis()}.nds")
        return try {
            openSourceInputStream(context, uri, path)?.use { input ->
                FileOutputStream(cacheFile).use { output ->
                    input.copyTo(output)
                }
            } ?: return DecryptResult.ERROR_READING_FILE

            val tempResult = decryptRom(cacheFile.absolutePath, progressCallback)
            if (tempResult == DecryptResult.ALREADY_DECRYPTED) {
                return DecryptResult.ALREADY_DECRYPTED
            }
            if (tempResult != DecryptResult.SUCCESS) {
                return tempResult
            }
            if (!validateDecryptedRomFile(cacheFile)) {
                return DecryptResult.ERROR_VALIDATION_FAILED
            }

            if (writeFileToTarget(context, uri, path, cacheFile)) {
                DecryptResult.SUCCESS
            } else {
                DecryptResult.ERROR_WRITING_FILE
            }
        } catch (e: Throwable) {
            Log.e(TAG, "Fallback decryption failed: ${e.message}")
            DecryptResult.ERROR_READING_FILE
        } finally {
            runCatching { cacheFile.delete() }
        }
    }

    private fun decryptDirectFileAtomically(
        targetFile: File,
        progressCallback: DecryptProgressCallback?,
    ): DecryptResult? {
        val parentDir = targetFile.parentFile ?: return null
        val siblingTemp = File(parentDir, ".${targetFile.name}.storm_decrypt_${System.currentTimeMillis()}.tmp")
        return try {
            FileInputStream(targetFile).use { input ->
                FileOutputStream(siblingTemp).use { output ->
                    input.copyTo(output)
                    output.fd.sync()
                }
            }

            val result = decryptRom(siblingTemp.absolutePath, progressCallback)
            when (result) {
                DecryptResult.ALREADY_DECRYPTED -> {
                    runCatching { siblingTemp.delete() }
                    DecryptResult.ALREADY_DECRYPTED
                }
                DecryptResult.SUCCESS -> {
                    if (!validateDecryptedRomFile(siblingTemp)) {
                        runCatching { siblingTemp.delete() }
                        return DecryptResult.ERROR_VALIDATION_FAILED
                    }
                    if (replaceFileAtomically(siblingTemp, targetFile)) {
                        DecryptResult.SUCCESS
                    } else {
                        runCatching { siblingTemp.delete() }
                        DecryptResult.ERROR_WRITING_FILE
                    }
                }
                else -> {
                    runCatching { siblingTemp.delete() }
                    result
                }
            }
        } catch (e: Throwable) {
            Log.w(TAG, "Atomic sibling temp decryption failed for ${targetFile.absolutePath}: ${e.message}")
            runCatching { siblingTemp.delete() }
            null
        }
    }

    private fun checkContainerEncryption(
        context: Context,
        uri: Uri,
        path: String?,
        ext: String,
    ): EncryptionStatus {
        val tempSlice = File(context.cacheDir, "modcrypt_check_${ext}_${System.currentTimeMillis()}.nds")
        return try {
            val extracted = extractContainerPayloadToTemp(context, uri, path, ext, tempSlice)
            if (!extracted) {
                return EncryptionStatus.ERROR_NOT_DSI_ROM
            }
            checkEncryption(tempSlice.absolutePath)
        } catch (e: Throwable) {
            Log.w(TAG, "Container encryption check failed ($ext): ${e.message}")
            EncryptionStatus.ERROR_READING_FILE
        } finally {
            runCatching { tempSlice.delete() }
        }
    }

    private fun decryptContainerRom(
        context: Context,
        uri: Uri,
        path: String?,
        ext: String,
        progressCallback: DecryptProgressCallback?,
    ): DecryptResult {
        val tempRom = File(context.cacheDir, "modcrypt_container_${ext}_${System.currentTimeMillis()}.nds")
        return try {
            val extracted = extractContainerPayloadToTemp(context, uri, path, ext, tempRom)
            if (!extracted) {
                return DecryptResult.ERROR_NOT_DSI_ROM
            }

            val result = decryptRom(tempRom.absolutePath, progressCallback)
            if (result != DecryptResult.SUCCESS && result != DecryptResult.ALREADY_DECRYPTED) {
                return result
            }
            if (!validateDecryptedRomFile(tempRom)) {
                return DecryptResult.ERROR_VALIDATION_FAILED
            }

            if (writeSiblingNdsFromContainer(context, uri, path, tempRom)) {
                DecryptResult.SUCCESS
            } else {
                DecryptResult.ERROR_WRITING_FILE
            }
        } catch (e: Throwable) {
            Log.e(TAG, "Container decryption failed ($ext): ${e.message}")
            DecryptResult.ERROR_READING_FILE
        } finally {
            runCatching { tempRom.delete() }
        }
    }

    private fun extractContainerPayloadToTemp(
        context: Context,
        uri: Uri,
        path: String?,
        ext: String,
        destFile: File,
    ): Boolean {
        val rawCopy = File(context.cacheDir, "modcrypt_raw_${ext}_${System.currentTimeMillis()}.bin")
        try {
            val sourceFile = if (path != null && File(path).isFile && File(path).canRead()) {
                File(path)
            } else {
                openSourceInputStream(context, uri, path)?.use { input ->
                    FileOutputStream(rawCopy).use { output ->
                        input.copyTo(output)
                    }
                } ?: return false
                rawCopy
            }

            val slice = if (ext == "cia") {
                inspectCiaSlice(sourceFile)
            } else {
                inspectTadSlice(sourceFile)
            } ?: return false

            FileInputStream(sourceFile).use { fis ->
                skipExact(fis, slice.offset)
                FileOutputStream(destFile).use { fos ->
                    copyExact(fis, fos, slice.size)
                }
            }
            return destFile.length() >= 0x400L
        } finally {
            runCatching { rawCopy.delete() }
        }
    }

    private fun inspectCiaSlice(file: File): ContainerSlice? {
        val fileLen = file.length()
        if (fileLen < 0x100L) return null
        FileInputStream(file).use { fis ->
            val hdr = ByteArray(0x40)
            if (readFully(fis, hdr) < 0x40) return null

            val headerSize = readUInt32LE(hdr, 0x00)
            val certSize = readUInt32LE(hdr, 0x08)
            val ticketSize = readUInt32LE(hdr, 0x0C)
            val tmdSize = readUInt32LE(hdr, 0x10)
            val contentSize = readUInt64LE(hdr, 0x18)

            if (headerSize < 0x20L || headerSize > 0x10000L) return null

            val contentOffset = align64(headerSize) + align64(certSize) + align64(ticketSize) + align64(tmdSize)
            if (contentOffset < 0L || contentOffset + 0x200L > fileLen) return null

            val romHeader = ByteArray(0x400)
            FileInputStream(file).use { romStream ->
                skipExact(romStream, contentOffset)
                val read = readFully(romStream, romHeader)
                if (read < 0x160) return null
            }

            if (!isValidRomHeader(romHeader)) {
                return null
            }

            val effectiveSize = if (contentSize > 0L && contentOffset + contentSize <= fileLen) {
                contentSize
            } else {
                fileLen - contentOffset
            }
            return ContainerSlice(contentOffset, effectiveSize)
        }
    }

    private fun inspectTadSlice(file: File): ContainerSlice? {
        val fileLen = file.length()
        if (fileLen < 0x100L) return null
        FileInputStream(file).use { fis ->
            val rawHeader = ByteArray(0x400)
            val rawRead = readFully(fis, rawHeader)
            if (rawRead >= 0x160 && isValidRomHeader(rawHeader)) {
                return ContainerSlice(0L, fileLen)
            }
        }

        FileInputStream(file).use { fis ->
            val hdr = ByteArray(0x20)
            if (readFully(fis, hdr) < 0x1C) return null

            val headerSize = readUInt32LE(hdr, 0x00)
            val certSize = readUInt32LE(hdr, 0x08)
            val crlSize = readUInt32LE(hdr, 0x0C)
            val ticketSize = readUInt32LE(hdr, 0x10)
            val tmdSize = readUInt32LE(hdr, 0x14)
            val dataSize = readUInt32LE(hdr, 0x18)

            if (headerSize < 0x20L || headerSize > 0x1000L) return null

            val dataOffset = align64(headerSize) + align64(certSize) + align64(crlSize) + align64(ticketSize) + align64(tmdSize)
            if (dataOffset < 0L || dataOffset + 0x200L > fileLen) return null

            val romHeader = ByteArray(0x400)
            FileInputStream(file).use { romStream ->
                skipExact(romStream, dataOffset)
                val read = readFully(romStream, romHeader)
                if (read < 0x160) return null
            }

            if (!isValidRomHeader(romHeader)) {
                return null
            }

            val effectiveSize = if (dataSize > 0L && dataOffset + dataSize <= fileLen) {
                dataSize
            } else {
                fileLen - dataOffset
            }
            return ContainerSlice(dataOffset, effectiveSize)
        }
    }

    private fun checkZipEncryption(context: Context, uri: Uri, path: String?): EncryptionStatus {
        val tempEntry = File(context.cacheDir, "modcrypt_zip_check_${System.currentTimeMillis()}.nds")
        return try {
            val singleEntryName = findSingleZipRomEntryName(context, uri, path)
                ?: return EncryptionStatus.NOT_ENCRYPTED

            val extracted = extractZipEntryToFile(context, uri, path, singleEntryName, tempEntry)
            if (!extracted) {
                return EncryptionStatus.ERROR_READING_FILE
            }
            checkEncryption(tempEntry.absolutePath)
        } catch (e: Throwable) {
            Log.w(TAG, "ZIP encryption check failed: ${e.message}")
            EncryptionStatus.ERROR_READING_FILE
        } finally {
            runCatching { tempEntry.delete() }
        }
    }

    private fun decryptZipRom(
        context: Context,
        uri: Uri,
        path: String?,
        progressCallback: DecryptProgressCallback?,
    ): DecryptResult {
        val tempEntry = File(context.cacheDir, "modcrypt_zip_entry_${System.currentTimeMillis()}.nds")
        val tempZip = File(context.cacheDir, "modcrypt_zip_repack_${System.currentTimeMillis()}.zip")
        return try {
            val singleEntryName = findSingleZipRomEntryName(context, uri, path)
                ?: return DecryptResult.ERROR_NOT_DSI_ROM

            if (!extractZipEntryToFile(context, uri, path, singleEntryName, tempEntry)) {
                return DecryptResult.ERROR_READING_FILE
            }

            val decryptResult = decryptRom(tempEntry.absolutePath, progressCallback)
            if (decryptResult == DecryptResult.ALREADY_DECRYPTED) {
                return DecryptResult.ALREADY_DECRYPTED
            }
            if (decryptResult != DecryptResult.SUCCESS) {
                return decryptResult
            }
            if (!validateDecryptedRomFile(tempEntry)) {
                return DecryptResult.ERROR_VALIDATION_FAILED
            }

            val sourceStream = openSourceInputStream(context, uri, path)
                ?: return DecryptResult.ERROR_READING_FILE
            sourceStream.use { src ->
                ZipInputStream(BufferedInputStream(src)).use { zis ->
                    ZipOutputStream(BufferedOutputStream(FileOutputStream(tempZip))).use { zos ->
                        val buffer = ByteArray(64 * 1024)
                        var entry = zis.nextEntry
                        while (entry != null) {
                            val newEntry = ZipEntry(entry.name)
                            zos.putNextEntry(newEntry)
                            if (!entry.isDirectory) {
                                if (entry.name == singleEntryName) {
                                    FileInputStream(tempEntry).use { decryptedIn ->
                                        decryptedIn.copyTo(zos)
                                    }
                                } else {
                                    while (true) {
                                        val read = zis.read(buffer)
                                        if (read <= 0) break
                                        zos.write(buffer, 0, read)
                                    }
                                }
                            }
                            zos.closeEntry()
                            zis.closeEntry()
                            entry = zis.nextEntry
                        }
                    }
                }
            }

            if (!tempZip.exists() || tempZip.length() == 0L) {
                return DecryptResult.ERROR_VALIDATION_FAILED
            }

            if (writeFileToTarget(context, uri, path, tempZip)) {
                NdsRomCache.invalidateCachedRom(context, uri)
                DecryptResult.SUCCESS
            } else {
                DecryptResult.ERROR_WRITING_FILE
            }
        } catch (e: Throwable) {
            Log.e(TAG, "ZIP decryption failed: ${e.message}")
            DecryptResult.ERROR_READING_FILE
        } finally {
            runCatching { tempEntry.delete() }
            runCatching { tempZip.delete() }
        }
    }

    private fun findSingleZipRomEntryName(context: Context, uri: Uri, path: String?): String? {
        val stream = openSourceInputStream(context, uri, path) ?: return null
        stream.use { src ->
            ZipInputStream(BufferedInputStream(src)).use { zis ->
                val romEntries = mutableListOf<String>()
                var entry = zis.nextEntry
                while (entry != null) {
                    if (!entry.isDirectory) {
                        val entryExt = entry.name.substringAfterLast('.', "").lowercase(Locale.ROOT)
                        if (entryExt in ZIP_ROM_EXTENSIONS) {
                            romEntries.add(entry.name)
                            if (romEntries.size > 1) {
                                return null
                            }
                        }
                    }
                    zis.closeEntry()
                    entry = zis.nextEntry
                }
                return romEntries.singleOrNull()
            }
        }
    }

    private fun extractZipEntryToFile(
        context: Context,
        uri: Uri,
        path: String?,
        entryName: String,
        destFile: File,
    ): Boolean {
        val stream = openSourceInputStream(context, uri, path) ?: return false
        stream.use { src ->
            ZipInputStream(BufferedInputStream(src)).use { zis ->
                var entry = zis.nextEntry
                while (entry != null) {
                    if (!entry.isDirectory && entry.name == entryName) {
                        FileOutputStream(destFile).use { fos ->
                            zis.copyTo(fos)
                        }
                        return destFile.exists() && destFile.length() > 0L
                    }
                    zis.closeEntry()
                    entry = zis.nextEntry
                }
            }
        }
        return false
    }

    private fun openSourceInputStream(context: Context, uri: Uri, path: String?): InputStream? {
        if (path != null) {
            val file = File(path)
            if (file.isFile && file.canRead()) {
                return BufferedInputStream(FileInputStream(file))
            }
        }
        return context.contentResolver.openInputStream(uri)
    }

    private fun writeFileToTarget(context: Context, uri: Uri, path: String?, validatedSource: File): Boolean {
        if (!validatedSource.exists() || validatedSource.length() == 0L) {
            return false
        }

        if (path != null) {
            val targetFile = File(path)
            val parentDir = targetFile.parentFile
            if (parentDir != null && targetFile.canWrite()) {
                val siblingTemp = File(parentDir, ".${targetFile.name}.storm_stage_${System.currentTimeMillis()}.tmp")
                val staged = runCatching {
                    FileInputStream(validatedSource).use { input ->
                        FileOutputStream(siblingTemp).use { output ->
                            input.copyTo(output)
                            output.fd.sync()
                        }
                    }
                    replaceFileAtomically(siblingTemp, targetFile)
                }.getOrDefault(false)
                if (staged) {
                    return true
                }
                runCatching { siblingTemp.delete() }
            }
        }

        val outStream = openTruncatedOutputStream(context, uri) ?: return false
        return runCatching {
            outStream.use { out ->
                FileInputStream(validatedSource).use { inStream ->
                    inStream.copyTo(out)
                }
                out.flush()
            }
            true
        }.getOrElse { e ->
            Log.e(TAG, "Failed writing decrypted ROM back to URI: ${e.message}")
            false
        }
    }

    private fun writeSiblingNdsFromContainer(
        context: Context,
        uri: Uri,
        path: String?,
        validatedSource: File,
    ): Boolean {
        if (!validatedSource.exists() || validatedSource.length() == 0L) {
            return false
        }

        val baseName = resolveBaseName(context, uri, path)
        val siblingName = "$baseName.nds"

        if (path != null) {
            val sourceFile = File(path)
            val parentDir = sourceFile.parentFile
            if (parentDir != null && parentDir.isDirectory && parentDir.canWrite()) {
                val targetFile = File(parentDir, siblingName)
                val siblingTemp = File(parentDir, ".${siblingName}.storm_stage_${System.currentTimeMillis()}.tmp")
                val staged = runCatching {
                    FileInputStream(validatedSource).use { input ->
                        FileOutputStream(siblingTemp).use { output ->
                            input.copyTo(output)
                            output.fd.sync()
                        }
                    }
                    replaceFileAtomically(siblingTemp, targetFile)
                }.getOrDefault(false)
                if (staged) {
                    return true
                }
                runCatching { siblingTemp.delete() }
            }
        }

        val parentDoc = resolveSafParentDirectory(context, uri)
        if (parentDoc != null && parentDoc.canWrite()) {
            val targetDoc = parentDoc.findFile(siblingName)
                ?: parentDoc.createFile("application/octet-stream", siblingName)
            if (targetDoc != null) {
                val outStream = openTruncatedOutputStream(context, targetDoc.uri)
                if (outStream != null) {
                    val wrote = runCatching {
                        outStream.use { out ->
                            FileInputStream(validatedSource).use { inStream ->
                                inStream.copyTo(out)
                            }
                            out.flush()
                        }
                        true
                    }.getOrElse { e ->
                        Log.e(TAG, "Failed writing sibling .nds to SAF document $siblingName: ${e.message}")
                        false
                    }
                    if (wrote) {
                        return true
                    }
                }
            }
        }

        Log.e(TAG, "Cannot create sibling $siblingName for container URI $uri; refusing to overwrite container")
        return false
    }

    private fun resolveSafParentDirectory(context: Context, uri: Uri): DocumentFile? {
        if (!DocumentsContract.isTreeUri(uri)) {
            return null
        }
        return runCatching {
            val treeRoot = DocumentFile.fromTreeUri(context, uri) ?: return@runCatching null
            val treeId = DocumentsContract.getTreeDocumentId(uri)
            val docId = if (DocumentsContract.isDocumentUri(context, uri)) {
                DocumentsContract.getDocumentId(uri)
            } else {
                treeId
            }
            val parentDocId = if (docId.contains('/')) docId.substringBeforeLast('/') else treeId
            val relSegments = if (parentDocId.startsWith("$treeId/")) {
                parentDocId.removePrefix("$treeId/").split('/').filter { it.isNotEmpty() }
            } else {
                emptyList()
            }
            var dirDoc: DocumentFile? = treeRoot
            for (segment in relSegments) {
                dirDoc = dirDoc?.findFile(segment) ?: return@runCatching null
            }
            dirDoc
        }.getOrNull()
    }

    private fun resolveBaseName(context: Context, uri: Uri, path: String?): String {
        val candidates = mutableListOf<String>()
        if (!path.isNullOrBlank()) candidates.add(File(path).name)
        runCatching { DocumentFile.fromSingleUri(context, uri)?.name }.getOrNull()?.let { candidates.add(it) }
        runCatching {
            context.contentResolver.query(uri, arrayOf(OpenableColumns.DISPLAY_NAME), null, null, null)?.use { cursor ->
                if (cursor.moveToFirst()) {
                    val idx = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                    if (idx >= 0 && !cursor.isNull(idx)) {
                        cursor.getString(idx)?.let { candidates.add(it) }
                    }
                }
            }
        }
        uri.lastPathSegment?.let { candidates.add(it.substringAfterLast('/')) }
        for (name in candidates) {
            val base = name.substringBeforeLast('.').trim()
            if (base.isNotEmpty()) {
                return base
            }
        }
        return "decrypted_rom"
    }

    private fun openTruncatedOutputStream(context: Context, uri: Uri): OutputStream? {
        runCatching { context.contentResolver.openOutputStream(uri, "wt") }.getOrNull()?.let { return it }
        runCatching { context.contentResolver.openOutputStream(uri, "rwt") }.getOrNull()?.let { return it }
        return runCatching {
            val pfd = context.contentResolver.openFileDescriptor(uri, "rw") ?: return@runCatching null
            try {
                Os.ftruncate(pfd.fileDescriptor, 0L)
                ParcelFileDescriptor.AutoCloseOutputStream(pfd)
            } catch (t: Throwable) {
                runCatching { pfd.close() }
                throw t
            }
        }.getOrNull()
    }

    private fun replaceFileAtomically(source: File, target: File): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val moved = runCatching {
                Files.move(
                    source.toPath(),
                    target.toPath(),
                    StandardCopyOption.REPLACE_EXISTING,
                    StandardCopyOption.ATOMIC_MOVE,
                )
                true
            }.getOrElse {
                runCatching {
                    Files.move(
                        source.toPath(),
                        target.toPath(),
                        StandardCopyOption.REPLACE_EXISTING,
                    )
                    true
                }.getOrDefault(false)
            }
            if (moved) return true
        }
        if (source.renameTo(target)) return true
        val backup = File(target.parentFile, ".${target.name}.storm_bak_${System.currentTimeMillis()}")
        if (!target.renameTo(backup)) return false
        return if (source.renameTo(target)) {
            runCatching { backup.delete() }
            true
        } else {
            backup.renameTo(target)
            false
        }
    }

    private fun validateDecryptedRomFile(file: File): Boolean {
        if (!file.exists() || file.length() < 0x400L) {
            return false
        }
        val header = ByteArray(0x400)
        val readOk = runCatching {
            FileInputStream(file).use { fis ->
                readFully(fis, header) >= 0x160
            }
        }.getOrDefault(false)
        if (!readOk || !isValidRomHeader(header)) {
            return false
        }
        return checkEncryption(file.absolutePath) == EncryptionStatus.NOT_ENCRYPTED
    }

    private fun isValidRomHeader(header: ByteArray): Boolean {
        if (header.size < 0x160) return false
        val headerCrc = (header[0x15E].toInt() and 0xFF) or ((header[0x15F].toInt() and 0xFF) shl 8)
        if (headerCrc == 0 || headerCrc == 0xFFFF) return false
        return headerCrc == calcHeaderCrc16(header, 0x15E)
    }

    private fun calcHeaderCrc16(data: ByteArray, len: Int): Int {
        var crc = 0xFFFF
        for (i in 0 until len) {
            crc = (crc ushr 8) xor CRC16_TABLE[(crc xor (data[i].toInt() and 0xFF)) and 0xFF]
        }
        return crc and 0xFFFF
    }

    private fun resolveExtension(context: Context, uri: Uri, path: String?): String {
        val candidates = mutableListOf<String>()
        if (!path.isNullOrBlank()) candidates.add(File(path).name)
        runCatching { DocumentFile.fromSingleUri(context, uri)?.name }.getOrNull()?.let { candidates.add(it) }
        runCatching {
            context.contentResolver.query(uri, arrayOf(OpenableColumns.DISPLAY_NAME), null, null, null)?.use { cursor ->
                if (cursor.moveToFirst()) {
                    val idx = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                    if (idx >= 0 && !cursor.isNull(idx)) {
                        cursor.getString(idx)?.let { candidates.add(it) }
                    }
                }
            }
        }
        uri.lastPathSegment?.let { candidates.add(it) }
        for (name in candidates) {
            val dot = name.lastIndexOf('.')
            if (dot >= 0 && dot < name.length - 1) {
                return name.substring(dot + 1).lowercase(Locale.ROOT)
            }
        }
        return ""
    }

    private fun align64(size: Long): Long = (size + 63L) and -64L

    private fun readUInt32LE(buf: ByteArray, offset: Int): Long {
        return (buf[offset].toLong() and 0xFFL) or
            ((buf[offset + 1].toLong() and 0xFFL) shl 8) or
            ((buf[offset + 2].toLong() and 0xFFL) shl 16) or
            ((buf[offset + 3].toLong() and 0xFFL) shl 24)
    }

    private fun readUInt64LE(buf: ByteArray, offset: Int): Long {
        var value = 0L
        for (i in 0 until 8) {
            value = value or ((buf[offset + i].toLong() and 0xFFL) shl (i * 8))
        }
        return value
    }

    private fun readFully(input: InputStream, buffer: ByteArray): Int {
        var total = 0
        while (total < buffer.size) {
            val n = input.read(buffer, total, buffer.size - total)
            if (n <= 0) break
            total += n
        }
        return total
    }

    private fun skipExact(input: InputStream, bytesToSkip: Long) {
        var remaining = bytesToSkip
        while (remaining > 0L) {
            val skipped = input.skip(remaining)
            if (skipped > 0L) {
                remaining -= skipped
            } else {
                if (input.read() < 0) break
                remaining--
            }
        }
    }

    private fun copyExact(input: InputStream, output: OutputStream, size: Long) {
        val buffer = ByteArray(64 * 1024)
        var remaining = size
        while (remaining > 0L) {
            val toRead = minOf(buffer.size.toLong(), remaining).toInt()
            val n = input.read(buffer, 0, toRead)
            if (n <= 0) break
            output.write(buffer, 0, n)
            remaining -= n
        }
    }

    private external fun checkEncryptionNative(romPath: String): Int
    private external fun checkEncryptionFdNative(fd: Int): Int
    private external fun decryptRomNative(romPath: String, progressCallback: DecryptProgressCallback?): Int
    private external fun decryptRomFdNative(fd: Int, progressCallback: DecryptProgressCallback?): Int
}
