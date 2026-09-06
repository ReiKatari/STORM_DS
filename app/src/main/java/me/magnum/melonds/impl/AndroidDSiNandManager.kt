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

    private fun backupNandFileIfNeeded(config: me.magnum.melonds.domain.model.EmulatorConfiguration) {
        val nandUri = config.dsiNandUri ?: return
        try {
            val backupFile = File(context.filesDir, "nand_golden_backup.bin")
            if (!backupFile.exists() || backupFile.length() < 512 * 1024) {
                context.contentResolver.openInputStream(nandUri)?.use { input ->
                    backupFile.outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
                Log.i(TAG, "backupNandFileIfNeeded: created golden backup at ${backupFile.absolutePath}")
            }
        } catch (e: Throwable) {
            Log.w(TAG, "backupNandFileIfNeeded: error backing up NAND", e)
        }
    }

    private fun restoreNandFileFromBackupIfNeeded(config: me.magnum.melonds.domain.model.EmulatorConfiguration): Boolean {
        val nandUri = config.dsiNandUri ?: return false
        try {
            val backupFile = File(context.filesDir, "nand_golden_backup.bin")
            if (backupFile.exists() && backupFile.length() >= 512 * 1024) {
                context.contentResolver.openOutputStream(nandUri, "wt")?.use { output ->
                    backupFile.inputStream().use { input ->
                        input.copyTo(output)
                    }
                }
                Log.w(TAG, "restoreNandFileFromBackupIfNeeded: restored NAND from ${backupFile.absolutePath}")
                return true
            }
        } catch (e: Throwable) {
            Log.w(TAG, "restoreNandFileFromBackupIfNeeded: error restoring NAND", e)
        }
        return false
    }

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

            val config = settingsRepository.getEmulatorConfiguration()
            backupNandFileIfNeeded(config)
            var result = MelonDSiNand.openNand(config)
            var mapped = mapOpenNandReturnCodeToResult(result)
            if (mapped.isFailure() && restoreNandFileFromBackupIfNeeded(config)) {
                result = MelonDSiNand.openNand(config)
                mapped = mapOpenNandReturnCodeToResult(result)
            }
            if (!mapped.isFailure()) {
                isNandOpen.set(true)
                nandUsageCount.set(1)
                ensureSystemFontTableOnNand()
            }
            mapped
        }
    }

    private fun ensureSystemFontTableOnNand() {
        runCatching {
            context.assets.open("bios/dsi/TWLFontTable.dat").use { input ->
                val fontBytes = input.readBytes()
                if (fontBytes.isNotEmpty()) {
                    MelonDSiNand.ensureSystemFontTable(fontBytes)
                }
            }
        }.onFailure {
            Log.w(TAG, "ensureSystemFontTableOnNand: unable to load TWLFontTable.dat from assets", it)
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

                        val rawTitleId = (((gameCode.getOrNull(0)?.code ?: 0) shl 24) or
                            ((gameCode.getOrNull(1)?.code ?: 0) shl 16) or
                            ((gameCode.getOrNull(2)?.code ?: 0) shl 8) or
                            (gameCode.getOrNull(3)?.code ?: 0)).toUInt()

                        val rawCategoryId = DSIWARE_CATEGORY
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

                        titleId = rawTitleId
                        categoryId = rawCategoryId
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

    override suspend fun ensureTitleSaveStructure(
        titleId: Long,
        romHeaderBytes: ByteArray,
        tmdMetadata: ByteArray?,
    ): Boolean = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return false
        }

        return MelonDSiNand.ensureTitleSaveStructure((titleId and 0xFFFFFFFF).toInt(), romHeaderBytes, tmdMetadata)
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

        val tempFile = File(context.cacheDir, "dsiware_import_${System.currentTimeMillis()}.bin")
        val copyResult = runCatching {
            context.contentResolver.openInputStream(fileUri)?.use { input ->
                tempFile.outputStream().use { output ->
                    input.copyTo(output)
                }
            } ?: throw EOFException("Unable to open URI: $fileUri")
        }
        if (copyResult.isFailure || !tempFile.exists() || tempFile.length() < 512L) {
            runCatching { tempFile.delete() }
            return false
        }
        try {
            return MelonDSiNand.importTitleFile((titleId and 0xFFFFFFFFL).toInt(), fileType.ordinal, tempFile.absolutePath)
        } finally {
            runCatching { tempFile.delete() }
        }
    }

    override suspend fun exportTitleFile(title: DSiWareTitle, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean {
        return exportTitleFile(title.titleId, fileType, fileUri)
    }

    override suspend fun exportTitleFile(titleId: Long, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return false
        }

        val tempFile = File(context.cacheDir, "dsiware_export_${System.currentTimeMillis()}.bin")
        val exported = MelonDSiNand.exportTitleFile((titleId and 0xFFFFFFFFL).toInt(), fileType.ordinal, tempFile.absolutePath)
        if (exported && tempFile.exists() && tempFile.length() > 0L) {
            runCatching {
                val openStream = {
                    runCatching { context.contentResolver.openOutputStream(fileUri, "rwt") }.getOrNull()
                        ?: runCatching { context.contentResolver.openOutputStream(fileUri, "w") }.getOrNull()
                }
                if (fileUri.scheme == "file") {
                    val destFile = fileUri.path?.let(::File)
                    if (destFile != null) {
                        tempFile.copyTo(destFile, overwrite = true)
                    } else {
                        openStream()?.use { output ->
                            tempFile.inputStream().use { input -> input.copyTo(output) }
                        }
                    }
                } else {
                    openStream()?.use { output ->
                        tempFile.inputStream().use { input -> input.copyTo(output) }
                    }
                }
            }
        }
        runCatching { tempFile.delete() }
        return exported
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
