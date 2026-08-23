package me.magnum.melonds.impl

import android.content.Context
import android.net.Uri
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import me.magnum.melonds.MelonDSiNand
import me.magnum.melonds.common.suspendRunCatching
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.DSiWareTitle
import me.magnum.melonds.domain.model.dsinand.DSiWareTitleFileType
import me.magnum.melonds.domain.model.dsinand.ImportDSiWareTitleResult
import me.magnum.melonds.domain.model.dsinand.OpenDSiNandResult
import me.magnum.melonds.domain.repositories.DSiWareMetadataRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.domain.services.ConfigurationDirectoryVerifier
import me.magnum.melonds.domain.services.DSiNandManager
import java.io.EOFException
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

class AndroidDSiNandManager(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
    private val dsiWareMetadataRepository: DSiWareMetadataRepository,
    private val biosDirectoryVerifier: ConfigurationDirectoryVerifier,
    private val dsiWareTitlesMetadataStore: DSiWareTitlesMetadataStore,
) : DSiNandManager {

    private companion object {
        const val TAG = "DSiNandManager"
        const val DSIWARE_TITLE_ID_OFFSET = 0x230L
        const val TMD_TITLE_ID_OFFSET = 0x18C
        val DSIWARE_CATEGORY = 0x00030004.toUInt()
    }

    private val nandControlLock = Mutex()
    private val nandUsageCount = AtomicInteger(0)
    private val isNandOpen = AtomicBoolean(false)

    override suspend fun openNand(): OpenDSiNandResult {
        return nandControlLock.withLock {
            if (isNandOpen.get()) {
                nandUsageCount.incrementAndGet()
                return OpenDSiNandResult.NAND_ALREADY_OPEN
            }
            val dsiDirectoryStatus = biosDirectoryVerifier.checkDsiConfigurationDirectory()
            if (dsiDirectoryStatus.status != ConfigurationDirResult.Status.VALID) {
                return OpenDSiNandResult.INVALID_DSI_SETUP
            }

            val result = MelonDSiNand.openNand(settingsRepository.getEmulatorConfiguration())
            val mapped = mapOpenNandReturnCodeToResult(result)
            if (!mapped.isFailure()) {
                isNandOpen.set(true)
                nandUsageCount.set(1)
            }
            mapped
        }
    }

    override suspend fun listTitles(): List<DSiWareTitle> = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return emptyList()
        }

        val titles = MelonDSiNand.listTitles()
        return titles.map { title ->
            val displayName = dsiWareTitlesMetadataStore.getDisplayName(title.titleId, title.name)
            if (displayName != title.name) {
                DSiWareTitle(
                    name = displayName,
                    producer = title.producer,
                    titleId = title.titleId,
                    icon = title.icon,
                    publicSavSize = title.publicSavSize,
                    privateSavSize = title.privateSavSize,
                    appFlags = title.appFlags,
                )
            } else {
                title
            }
        }
    }

    override suspend fun importTitle(titleUri: Uri): ImportDSiWareTitleResult = nandControlLock.withLock {
        withContext(Dispatchers.IO) {
            if (!isNandOpen.get()) {
                return@withContext ImportDSiWareTitleResult.NAND_NOT_OPEN
            }

            var categoryId: UInt = DSIWARE_CATEGORY
            var titleId: UInt = 0.toUInt()
            var publicSavSize: UInt = 0.toUInt()
            var privateSavSize: UInt = 0.toUInt()
            var titleVersion: UShort = 0.toUShort()
            var fileSize: Long = 0L
            var sha1Bytes: ByteArray? = null

            val tempFile = File(context.cacheDir, "dsiware_import_${System.currentTimeMillis()}.nds")
            val titleReadResult = suspendRunCatching {
                context.contentResolver.openInputStream(titleUri)?.use { input ->
                    FileOutputStream(tempFile).use { fileOut ->
                        val header = ByteArray(0x240)
                        var readBytes = 0
                        while (readBytes < 0x240) {
                            val count = input.read(header, readBytes, 0x240 - readBytes)
                            if (count <= 0) break
                            readBytes += count
                        }
                        if (readBytes < 0x160) throw EOFException("Unable to read selected title header (too small)")

                        fileOut.write(header, 0, readBytes)

                        val gameCode = String(header, 0x0C, 4, java.nio.charset.StandardCharsets.US_ASCII)
                        val unitCode = header[0x012].toInt() and 0xFF
                        val romVersion = (header[0x01E].toInt() and 0xFF).toUShort()

                        val rawTitleId = if (readBytes >= 0x234) {
                            ((header[0x230].toInt() and 0xFF) or
                                ((header[0x231].toInt() and 0xFF) shl 8) or
                                ((header[0x232].toInt() and 0xFF) shl 16) or
                                ((header[0x233].toInt() and 0xFF) shl 24)).toUInt()
                        } else 0.toUInt()

                        val rawCategoryId = if (readBytes >= 0x238) {
                            ((header[0x234].toInt() and 0xFF) or
                                ((header[0x235].toInt() and 0xFF) shl 8) or
                                ((header[0x236].toInt() and 0xFF) shl 16) or
                                ((header[0x237].toInt() and 0xFF) shl 24)).toUInt()
                        } else 0.toUInt()

                        val rawPublicSav = if (readBytes >= 0x23C) {
                            ((header[0x238].toInt() and 0xFF) or
                                ((header[0x239].toInt() and 0xFF) shl 8) or
                                ((header[0x23A].toInt() and 0xFF) shl 16) or
                                ((header[0x23B].toInt() and 0xFF) shl 24)).toUInt()
                        } else 0.toUInt()

                        val rawPrivateSav = if (readBytes >= 0x240) {
                            ((header[0x23C].toInt() and 0xFF) or
                                ((header[0x23D].toInt() and 0xFF) shl 8) or
                                ((header[0x23E].toInt() and 0xFF) shl 16) or
                                ((header[0x23F].toInt() and 0xFF) shl 24)).toUInt()
                        } else 0.toUInt()

                        titleId = if (rawTitleId != 0u) rawTitleId else {
                            ((gameCode.getOrNull(0)?.code ?: 0) or
                             ((gameCode.getOrNull(1)?.code ?: 0) shl 8) or
                             ((gameCode.getOrNull(2)?.code ?: 0) shl 16) or
                             ((gameCode.getOrNull(3)?.code ?: 0) shl 24)).toUInt()
                        }

                        categoryId = if (rawCategoryId != 0u) rawCategoryId else DSIWARE_CATEGORY
                        publicSavSize = rawPublicSav
                        privateSavSize = rawPrivateSav
                        titleVersion = romVersion

                        val digest = java.security.MessageDigest.getInstance("SHA-1")
                        digest.update(header, 0, readBytes)
                        fileSize = readBytes.toLong()
                        val buf = ByteArray(65536)
                        while (true) {
                            val len = input.read(buf)
                            if (len <= 0) break
                            digest.update(buf, 0, len)
                            fileOut.write(buf, 0, len)
                            fileSize += len
                        }
                        sha1Bytes = digest.digest()
                    }
                } ?: throw EOFException("Unable to open selected title")
            }

            if (titleReadResult.isFailure) {
                Log.w(TAG, "DSiWareImport: failed to read selected title id uri=$titleUri", titleReadResult.exceptionOrNull())
                runCatching { tempFile.delete() }
                return@withContext ImportDSiWareTitleResult.ERROR_OPENING_FILE
            }

            Log.i(TAG, "DSiWareImport: selected category=${categoryId.toHex()} title=${titleId.toHex()} size=$fileSize uri=$titleUri")

            try {
                val installedTitles = MelonDSiNand.listTitles()
                val titleAlreadyInstalled = installedTitles.any { it.titleId.toUInt() == titleId }
                if (titleAlreadyInstalled) {
                    Log.w(TAG, "DSiWareImport: title already imported category=${categoryId.toHex()} title=${titleId.toHex()}")
                    return@withContext ImportDSiWareTitleResult.TITLE_ALREADY_IMPORTED
                }

                val tmdMetadata = NusDSiWareMetadataRepository.createTmd(
                    categoryId = categoryId,
                    titleId = titleId,
                    publicSaveSize = publicSavSize,
                    privateSaveSize = privateSavSize,
                    titleVersion = titleVersion,
                    contentSize = fileSize,
                    contentSha1 = sha1Bytes,
                )

                val result = mapImportTitleReturnCodeToResult(MelonDSiNand.importTitle(tempFile.absolutePath, tmdMetadata))
                Log.i(TAG, "DSiWareImport: native result=$result category=${categoryId.toHex()} title=${titleId.toHex()}")
                if (result == ImportDSiWareTitleResult.SUCCESS) {
                    val originalFileName = runCatching {
                        androidx.documentfile.provider.DocumentFile.fromSingleUri(context, titleUri)?.name
                            ?: context.contentResolver.query(titleUri, arrayOf(android.provider.OpenableColumns.DISPLAY_NAME), null, null, null)?.use { cursor ->
                                if (cursor.moveToFirst()) {
                                    val idx = cursor.getColumnIndex(android.provider.OpenableColumns.DISPLAY_NAME)
                                    if (idx != -1) cursor.getString(idx) else null
                                } else null
                            }
                            ?: titleUri.lastPathSegment
                    }.getOrNull()?.substringBeforeLast('.')?.takeIf { it.isNotBlank() }

                    if (!originalFileName.isNullOrBlank()) {
                        dsiWareTitlesMetadataStore.setOriginalFileName(titleId.toLong(), originalFileName)
                    }

                    val raHash = runCatching {
                        java.io.FileInputStream(tempFile).use { fis ->
                            me.magnum.melonds.utils.RomProcessor.getRomMetadata(fis)?.retroAchievementsHash
                        }
                    }.getOrNull()?.takeIf { it.isNotBlank() }

                    dsiWareTitlesMetadataStore.setSourceUri(titleId.toLong(), titleUri.toString())

                    if (!raHash.isNullOrBlank()) {
                        dsiWareTitlesMetadataStore.setRaHash(titleId.toLong(), raHash)
                    }
                }
                result
            } finally {
                runCatching { tempFile.delete() }
            }
        }
    }

    override suspend fun deleteTitle(title: DSiWareTitle): Unit = deleteTitle(title.titleId)

    override suspend fun deleteTitle(titleId: Long): Unit = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return
        }

        MelonDSiNand.deleteTitle((titleId and 0xFFFFFFFFL).toInt())
    }

    override suspend fun repairTitleSaves(titleId: Long): Boolean = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return false
        }

        return MelonDSiNand.repairTitleSaves((titleId and 0xFFFFFFFF).toInt())
    }

    override suspend fun exportTitleExecutable(titleId: Long, outputPath: String): Boolean = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return false
        }

        return MelonDSiNand.exportTitleExecutable((titleId and 0xFFFFFFFF).toInt(), outputPath)
    }

    override suspend fun importTitleFileFromPath(titleId: Long, fileType: DSiWareTitleFileType, filePath: String): Boolean = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return false
        }

        return MelonDSiNand.importTitleFile((titleId and 0xFFFFFFFF).toInt(), fileType.ordinal, filePath)
    }

    override suspend fun exportTitleFileToPath(titleId: Long, fileType: DSiWareTitleFileType, filePath: String): Boolean = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return false
        }

        return MelonDSiNand.exportTitleFile((titleId and 0xFFFFFFFF).toInt(), fileType.ordinal, filePath)
    }

    override suspend fun importTitleFile(title: DSiWareTitle, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean {
        return importTitleFile(title.titleId, fileType, fileUri)
    }

    override suspend fun importTitleFile(titleId: Long, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return false
        }

        val targetPath: String = if (fileUri.scheme == "content") {
            val tempFile = File(context.cacheDir, "dsiware_import_data_${System.currentTimeMillis()}.bin")
            val copyResult = runCatching {
                context.contentResolver.openInputStream(fileUri)?.use { input ->
                    tempFile.outputStream().use { output ->
                        input.copyTo(output)
                    }
                } ?: throw EOFException("Unable to open content URI")
            }
            if (copyResult.isFailure) {
                runCatching { tempFile.delete() }
                return false
            }
            try {
                return MelonDSiNand.importTitleFile((titleId and 0xFFFFFFFFL).toInt(), fileType.ordinal, tempFile.absolutePath)
            } finally {
                runCatching { tempFile.delete() }
            }
        } else {
            fileUri.path ?: fileUri.toString()
        }

        return MelonDSiNand.importTitleFile((titleId and 0xFFFFFFFFL).toInt(), fileType.ordinal, targetPath)
    }

    override suspend fun exportTitleFile(title: DSiWareTitle, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean {
        return exportTitleFile(title.titleId, fileType, fileUri)
    }

    override suspend fun exportTitleFile(titleId: Long, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return false
        }

        return if (fileUri.scheme == "content") {
            val tempFile = File(context.cacheDir, "dsiware_export_data_${System.currentTimeMillis()}.bin")
            val exported = MelonDSiNand.exportTitleFile((titleId and 0xFFFFFFFFL).toInt(), fileType.ordinal, tempFile.absolutePath)
            if (exported && tempFile.exists()) {
                runCatching {
                    context.contentResolver.openOutputStream(fileUri, "wt")?.use { output ->
                        tempFile.inputStream().use { input ->
                            input.copyTo(output)
                        }
                    }
                }
            }
            runCatching { tempFile.delete() }
            exported
        } else {
            val path = fileUri.path ?: fileUri.toString()
            MelonDSiNand.exportTitleFile((titleId and 0xFFFFFFFFL).toInt(), fileType.ordinal, path)
        }
    }

    override fun closeNand() {
        if (nandUsageCount.decrementAndGet() <= 0) {
            nandUsageCount.set(0)
            isNandOpen.set(false)
            MelonDSiNand.closeNand()
        }
    }

    private fun mapOpenNandReturnCodeToResult(returnCode: Int): OpenDSiNandResult {
        return when (returnCode) {
            0 -> OpenDSiNandResult.SUCCESS
            1 -> OpenDSiNandResult.NAND_ALREADY_OPEN
            2 -> OpenDSiNandResult.BIOS7_NOT_FOUND
            3 -> OpenDSiNandResult.NAND_OPEN_FAILED
            else -> OpenDSiNandResult.UNKNOWN
        }
    }

    private fun mapImportTitleReturnCodeToResult(returnCode: Int): ImportDSiWareTitleResult {
        return when (returnCode) {
            0 -> ImportDSiWareTitleResult.SUCCESS
            1 -> ImportDSiWareTitleResult.NAND_NOT_OPEN
            2 -> ImportDSiWareTitleResult.ERROR_OPENING_FILE
            3 -> ImportDSiWareTitleResult.NOT_DSIWARE_TITLE
            4 -> ImportDSiWareTitleResult.TITLE_ALREADY_IMPORTED
            5 -> ImportDSiWareTitleResult.INSATLL_FAILED
            6 -> ImportDSiWareTitleResult.TITLE_LIMIT_REACHED
            7 -> ImportDSiWareTitleResult.DSI_MEMORY_FULL
            else -> ImportDSiWareTitleResult.UNKNOWN
        }
    }

    private fun InputStream.skipFully(byteCount: Long) {
        var remaining = byteCount
        while (remaining > 0) {
            val skipped = skip(remaining)
            if (skipped > 0) {
                remaining -= skipped
                continue
            }
            if (read() == -1) {
                throw EOFException("Reached EOF with $remaining bytes left to skip")
            }
            remaining--
        }
    }

    private fun InputStream.readByteOrThrow(): Int {
        val value = read()
        if (value == -1) {
            throw EOFException("Reached EOF while reading title id")
        }
        return value
    }

    private fun InputStream.readUIntLe(): UInt {
        return readByteOrThrow().toUInt() or
            readByteOrThrow().shl(8).toUInt() or
            readByteOrThrow().shl(16).toUInt() or
            readByteOrThrow().shl(24).toUInt()
    }

    private fun ByteArray.readUIntBe(offset: Int): UInt {
        if (offset < 0 || offset + 4 > size) {
            throw EOFException("Not enough bytes to read UInt at offset $offset")
        }
        return this[offset].toUByte().toUInt().shl(24) or
            this[offset + 1].toUByte().toUInt().shl(16) or
            this[offset + 2].toUByte().toUInt().shl(8) or
            this[offset + 3].toUByte().toUInt()
    }

    private fun UInt.toHex(): String {
        return toString(16).padStart(8, '0')
    }
}
