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
import java.io.InputStream
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

class AndroidDSiNandManager(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
    private val dsiWareMetadataRepository: DSiWareMetadataRepository,
    private val biosDirectoryVerifier: ConfigurationDirectoryVerifier,
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
            mapOpenNandReturnCodeToResult(result).also {
                if (!it.isFailure()) {
                    if (nandUsageCount.getAndIncrement() == 0) {
                        isNandOpen.set(true)
                    }
                }
            }
        }
    }

    override suspend fun listTitles(): List<DSiWareTitle> = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return emptyList()
        }

        return MelonDSiNand.listTitles()
    }

    override suspend fun importTitle(titleUri: Uri): ImportDSiWareTitleResult = nandControlLock.withLock {
        withContext(Dispatchers.IO) {
            if (!isNandOpen.get()) {
                return@withContext ImportDSiWareTitleResult.NAND_NOT_OPEN
            }

            var categoryId: UInt = 0.toUInt()
            var titleId: UInt = 0.toUInt()

            val titleIdResult = suspendRunCatching {
                context.contentResolver.openInputStream(titleUri)?.use {
                    it.skipFully(DSIWARE_TITLE_ID_OFFSET)
                    titleId = it.readUIntLe()
                    categoryId = it.readUIntLe()
                } ?: throw EOFException("Unable to open selected title")
            }
            if (titleIdResult.isFailure) {
                Log.w(TAG, "DSiWareImport: failed to read selected title id uri=$titleUri", titleIdResult.exceptionOrNull())
                return@withContext ImportDSiWareTitleResult.ERROR_OPENING_FILE
            }

            Log.i(TAG, "DSiWareImport: selected category=${categoryId.toHex()} title=${titleId.toHex()} uri=$titleUri")

            if (categoryId != DSIWARE_CATEGORY) {
                Log.w(TAG, "DSiWareImport: rejected non-DSiWare title category=${categoryId.toHex()} title=${titleId.toHex()}")
                return@withContext ImportDSiWareTitleResult.NOT_DSIWARE_TITLE
            }

            val installedTitles = MelonDSiNand.listTitles()
            val titleAlreadyInstalled = installedTitles.any { it.titleId.toUInt() == titleId }
            if (titleAlreadyInstalled) {
                Log.w(TAG, "DSiWareImport: title already imported category=${categoryId.toHex()} title=${titleId.toHex()}")
                return@withContext ImportDSiWareTitleResult.TITLE_ALREADY_IMPORTED
            }

            val tmdMetadataResult = suspendRunCatching {
                dsiWareMetadataRepository.getDSiWareTitleMetadata(categoryId, titleId)
            }

            if (tmdMetadataResult.isFailure) {
                Log.w(TAG, "DSiWareImport: failed to fetch TMD category=${categoryId.toHex()} title=${titleId.toHex()}", tmdMetadataResult.exceptionOrNull())
                return@withContext ImportDSiWareTitleResult.METADATA_FETCH_FAILED
            }

            val tmdMetadata = tmdMetadataResult.getOrThrow()
            val tmdCategoryId = tmdMetadata.readUIntBe(TMD_TITLE_ID_OFFSET)
            val tmdTitleId = tmdMetadata.readUIntBe(TMD_TITLE_ID_OFFSET + 4)
            if (tmdCategoryId != categoryId || tmdTitleId != titleId) {
                Log.w(
                    TAG,
                    "DSiWareImport: TMD/title mismatch selected=${categoryId.toHex()}/${titleId.toHex()} tmd=${tmdCategoryId.toHex()}/${tmdTitleId.toHex()}"
                )
                return@withContext ImportDSiWareTitleResult.METADATA_FETCH_FAILED
            }

            val result = mapImportTitleReturnCodeToResult(MelonDSiNand.importTitle(titleUri.toString(), tmdMetadata))
            Log.i(TAG, "DSiWareImport: native result=$result category=${categoryId.toHex()} title=${titleId.toHex()}")
            result
        }
    }

    override suspend fun deleteTitle(title: DSiWareTitle): Unit = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return
        }

        MelonDSiNand.deleteTitle((title.titleId and 0xFFFFFFFF).toInt())
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

    override suspend fun importTitleFile(title: DSiWareTitle, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return false
        }

        return MelonDSiNand.importTitleFile((title.titleId and 0xFFFFFFFF).toInt(), fileType.ordinal, fileUri.toString())
    }

    override suspend fun exportTitleFile(title: DSiWareTitle, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean = nandControlLock.withLock {
        if (!isNandOpen.get()) {
            return false
        }

        return MelonDSiNand.exportTitleFile((title.titleId and 0xFFFFFFFF).toInt(), fileType.ordinal, fileUri.toString())
    }

    override fun closeNand() {
        if (nandUsageCount.decrementAndGet() == 0) {
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
