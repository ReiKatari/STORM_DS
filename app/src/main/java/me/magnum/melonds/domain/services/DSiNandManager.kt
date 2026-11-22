package me.magnum.melonds.domain.services

import android.net.Uri
import me.magnum.melonds.domain.model.DSiWareTitle
import me.magnum.melonds.domain.model.EmulatorConfiguration
import me.magnum.melonds.domain.model.dsinand.ImportDSiWareTitleResult
import me.magnum.melonds.domain.model.dsinand.OpenDSiNandResult
import me.magnum.melonds.domain.model.dsinand.DSiWareTitleFileType

interface DSiNandManager {
    interface Session : AutoCloseable {
        suspend fun <T> withNand(configuration: EmulatorConfiguration, block: suspend DSiNandManager.() -> T): T?
    }

    fun acquireSession(): Session?

    suspend fun <T> withNand(configuration: EmulatorConfiguration, block: suspend DSiNandManager.() -> T): T? {
        val session = acquireSession() ?: return null
        return try {
            session.withNand(configuration, block)
        } finally {
            session.close()
        }
    }

    suspend fun openNand(): OpenDSiNandResult
    suspend fun listTitles(): List<DSiWareTitle>
    suspend fun importTitle(titleUri: Uri): ImportDSiWareTitleResult
    suspend fun deleteTitle(title: DSiWareTitle)
    suspend fun deleteTitle(titleId: Long)
    suspend fun repairTitleSaves(titleId: Long): Boolean
    suspend fun ensureTitleSaveStructure(titleId: Long, romHeaderBytes: ByteArray, tmdMetadata: ByteArray? = null): Boolean
    suspend fun exportTitleExecutable(titleId: Long, outputPath: String): Boolean
    suspend fun importTitleFileFromPath(titleId: Long, fileType: DSiWareTitleFileType, filePath: String): Boolean
    suspend fun exportTitleFileToPath(titleId: Long, fileType: DSiWareTitleFileType, filePath: String): Boolean
    suspend fun importTitleFile(title: DSiWareTitle, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean
    suspend fun importTitleFile(titleId: Long, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean
    suspend fun exportTitleFile(title: DSiWareTitle, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean
    suspend fun exportTitleFile(titleId: Long, fileType: DSiWareTitleFileType, fileUri: Uri): Boolean
    fun closeNand()
}
