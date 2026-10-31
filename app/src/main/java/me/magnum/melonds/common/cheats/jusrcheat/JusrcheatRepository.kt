package me.magnum.melonds.common.cheats.jusrcheat

import android.content.Context
import android.net.Uri
import android.os.Environment
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import me.magnum.melonds.database.MelonDatabase
import me.magnum.melonds.database.entities.CheatDatabaseEntity
import me.magnum.melonds.database.entities.CheatEntity
import me.magnum.melonds.database.entities.CheatFolderEntity
import me.magnum.melonds.database.entities.CheatStatusUpdate
import me.magnum.melonds.database.entities.GameEntity
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.RomInfo
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.RandomAccessFile
import java.util.zip.GZIPInputStream

/**
 * Modernized Repository providing instant browsing, cross-region mapping,
 * and cheat attachment for all 4,079+ NDS games in usrcheat.dat.
 */
class JusrcheatRepository private constructor(
    private val context: Context,
    private val database: MelonDatabase
) {
    companion object {
        private const val TAG = "JusrcheatRepo"
        private const val ASSET_DAT_GZ = "cheats/usrcheat.dat.gz"
        private const val LOCAL_DAT_NAME = "usrcheat.dat"

        @Volatile
        private var instance: JusrcheatRepository? = null

        fun getInstance(context: Context, database: MelonDatabase): JusrcheatRepository {
            return instance ?: synchronized(this) {
                instance ?: JusrcheatRepository(context.applicationContext, database).also { instance = it }
            }
        }
    }

    private val mutex = Mutex()
    private var isInitialized = false
    private var header: JusrcheatHeader? = null
    private val gameMetaList = ArrayList<JusrcheatGameMeta>(4100)
    private val gameMetaByCode = HashMap<String, MutableList<JusrcheatGameMeta>>(4100)
    private var activeDatFile: File? = null
    private var cachedDatBytes: ByteArray? = null

    suspend fun ensureInitialized(): Boolean = withContext(Dispatchers.IO) {
        if (isInitialized && gameMetaList.isNotEmpty()) return@withContext true

        mutex.withLock {
            if (isInitialized && gameMetaList.isNotEmpty()) return@withLock true

            try {
                val datFile = resolveOrCreateDatFile()
                if (datFile == null || !datFile.exists() || datFile.length() < 1000) {
                    Log.e(TAG, "Failed to resolve valid usrcheat.dat")
                    return@withLock false
                }
                activeDatFile = datFile

                // Load file into memory for instant index scan (<15 ms)
                val fileLen = datFile.length().toInt()
                val bytes = ByteArray(fileLen)
                BufferedInputStream(FileInputStream(datFile)).use { bis ->
                    var readTotal = 0
                    while (readTotal < fileLen) {
                        val count = bis.read(bytes, readTotal, fileLen - readTotal)
                        if (count <= 0) break
                        readTotal += count
                    }
                }
                cachedDatBytes = bytes

                val parsedHeader = JusrcheatBinaryCodec.parseHeader(bytes)
                header = parsedHeader

                val pointers = JusrcheatBinaryCodec.parsePointers(bytes, parsedHeader.codeOffset)
                val metas = JusrcheatBinaryCodec.parseGameMetaList(bytes, pointers)

                gameMetaList.clear()
                gameMetaList.addAll(metas)

                gameMetaByCode.clear()
                for (meta in metas) {
                    val codeUpper = meta.gameId.trim().uppercase()
                    gameMetaByCode.getOrPut(codeUpper) { mutableListOf() }.add(meta)
                }

                isInitialized = true
                Log.i(TAG, "Successfully initialized Jusrcheat database with ${gameMetaList.size} games")
                return@withLock true
            } catch (e: Exception) {
                Log.e(TAG, "Error initializing Jusrcheat database", e)
                return@withLock false
            }
        }
    }

    private fun resolveOrCreateDatFile(): File? {
        // 1. Check external storage /storage/emulated/0/STORM DS/cheats/usrcheat.dat
        val extDir = File(Environment.getExternalStorageDirectory(), "STORM DS/cheats")
        val extDat = File(extDir, LOCAL_DAT_NAME)
        if (extDat.exists() && extDat.length() > 1_000_000) {
            return extDat
        }

        // 2. Check internal filesDir / cheats / usrcheat.dat
        val internalDir = File(context.filesDir, "cheats").apply { mkdirs() }
        val internalDat = File(internalDir, LOCAL_DAT_NAME)
        if (internalDat.exists() && internalDat.length() > 1_000_000) {
            return internalDat
        }

        // 3. Atomically extract bundled assets/cheats/usrcheat.dat.gz
        try {
            val tmpFile = File(internalDir, "$LOCAL_DAT_NAME.tmp")
            context.assets.open(ASSET_DAT_GZ).use { assetStream ->
                GZIPInputStream(assetStream).use { gzStream ->
                    BufferedOutputStream(FileOutputStream(tmpFile)).use { fos ->
                        val buffer = ByteArray(64 * 1024)
                        var read: Int
                        while (gzStream.read(buffer).also { read = it } != -1) {
                            fos.write(buffer, 0, read)
                        }
                    }
                }
            }
            if (tmpFile.exists() && tmpFile.length() > 1_000_000) {
                if (internalDat.exists()) internalDat.delete()
                tmpFile.renameTo(internalDat)
                return internalDat
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error extracting asset usrcheat.dat.gz", e)
        }

        return if (internalDat.exists()) internalDat else null
    }

    fun getAllGames(): List<JusrcheatGameMeta> {
        return gameMetaList
    }

    fun searchGames(query: String, regionFilter: String = "ALL"): List<JusrcheatGameMeta> {
        val q = query.trim().uppercase()
        val r = regionFilter.trim().uppercase()

        return gameMetaList.filter { meta ->
            val matchesRegion = when (r) {
                "ALL", "ВСЕ" -> true
                "USA" -> meta.region.equals("USA", ignoreCase = true)
                "EUROPE", "ЕВРОПА" -> meta.region.equals("Europe", ignoreCase = true)
                "JAPAN", "ЯПОНИЯ" -> meta.region.equals("Japan", ignoreCase = true)
                else -> true
            }

            if (!matchesRegion) return@filter false
            if (q.isBlank()) return@filter true

            meta.title.contains(q, ignoreCase = true) ||
                    meta.gameId.contains(q, ignoreCase = true) ||
                    meta.crcHex.contains(q, ignoreCase = true)
        }
    }

    /**
     * Resolves related cross-region entries based on 3-letter game prefix.
     * For example, 'VACV' (Assassin's Creed II - Discovery EU/Rus) -> 'VACE' (USA release).
     */
    fun findCrossRegionFamily(gameCode: String): List<JusrcheatGameMeta> {
        val clean = gameCode.trim().uppercase()
        if (clean.length < 3) return emptyList()
        val familyPrefix = clean.take(3)
        return gameMetaList.filter { it.gameId.startsWith(familyPrefix, ignoreCase = true) }
    }

    fun loadGame(meta: JusrcheatGameMeta): JusrcheatGame? {
        val bytes = cachedDatBytes ?: return null
        return runCatching {
            JusrcheatBinaryCodec.parseGame(bytes, meta.offset, meta.gameId, meta.crc32)
        }.getOrNull()
    }

    fun loadGameById(gameId: String): JusrcheatGame? {
        val meta = gameMetaByCode[gameId.trim().uppercase()]?.firstOrNull() ?: return null
        return loadGame(meta)
    }

    suspend fun attachCheatToActiveRom(
        romInfo: RomInfo,
        sourceGameId: String,
        cheat: JusrcheatCode,
        enable: Boolean = true
    ): Cheat = withContext(Dispatchers.IO) {
        val targetGameCode = romInfo.gameCode.trim().uppercase()
        val targetChecksum = romInfo.headerChecksumString().trim().uppercase()
        val targetTitle = romInfo.gameTitle.ifBlank { romInfo.gameName }

        var gameEntity = (if (targetChecksum.isNotBlank()) database.gameDao().findGameByChecksum(targetChecksum) else null)
            ?: database.gameDao().findGameByCode(targetGameCode)

        if (gameEntity == null) {
            val newGameId = database.gameDao().insertGame(
                GameEntity(
                    id = null,
                    name = targetTitle,
                    gameCode = targetGameCode,
                    gameChecksum = targetChecksum
                )
            )
            gameEntity = database.gameDao().getGame(newGameId) ?: GameEntity(
                id = newGameId,
                name = targetTitle,
                gameCode = targetGameCode,
                gameChecksum = targetChecksum
            )
        }

        val folderName = "Jusrcheat [$sourceGameId]"
        val existingFolders = database.cheatFolderDao().getFoldersForGame(gameEntity.id!!)
        var targetFolder = existingFolders.find { it.name.equals(folderName, ignoreCase = true) }

        if (targetFolder == null) {
            val newFolderId = database.cheatFolderDao().insertCheatFolder(
                CheatFolderEntity(
                    id = null,
                    gameId = gameEntity.id!!,
                    name = folderName
                )
            )
            targetFolder = CheatFolderEntity(
                id = newFolderId,
                gameId = gameEntity.id!!,
                name = folderName
            )
        }

        val dbId = CheatDatabaseEntity.CUSTOM_CHEATS_DATABASE_ID
        val folderCheats = database.cheatDao().getFolderCheatsList(targetFolder.id!!)
        val existingCheat = folderCheats.find { it.code == cheat.codeHexLines || it.name == cheat.name }

        val finalCheatEntity = if (existingCheat != null) {
            database.cheatDao().updateCheatsStatus(listOf(CheatStatusUpdate(existingCheat.id!!, enable)))
            existingCheat.copy(enabled = enable)
        } else {
            val newCheat = CheatEntity(
                id = null,
                cheatFolderId = targetFolder.id!!,
                cheatDatabaseId = dbId,
                name = cheat.name,
                description = cheat.note.ifBlank { null },
                code = cheat.getFormattedCode(),
                enabled = enable
            )
            val insertedId = database.cheatDao().insertCheat(newCheat)
            newCheat.copy(id = insertedId)
        }

        Cheat(
            id = finalCheatEntity.id,
            cheatDatabaseId = finalCheatEntity.cheatDatabaseId,
            name = finalCheatEntity.name,
            description = finalCheatEntity.description,
            code = finalCheatEntity.code,
            enabled = finalCheatEntity.enabled
        )
    }

    suspend fun attachFolderToActiveRom(
        romInfo: RomInfo,
        sourceGameId: String,
        folder: JusrcheatFolder,
        enableAll: Boolean = false
    ) = withContext(Dispatchers.IO) {
        for (c in folder.cheats) {
            attachCheatToActiveRom(romInfo, sourceGameId, c, enable = enableAll || c.enabled)
        }
    }

    suspend fun attachEntireGameToActiveRom(
        romInfo: RomInfo,
        jusrGame: JusrcheatGame,
        enableAll: Boolean = false
    ) = withContext(Dispatchers.IO) {
        for (c in jusrGame.directCheats) {
            attachCheatToActiveRom(romInfo, jusrGame.gameId, c, enable = enableAll || c.enabled)
        }
        for (f in jusrGame.folders) {
            for (c in f.cheats) {
                attachCheatToActiveRom(romInfo, jusrGame.gameId, c, enable = enableAll || c.enabled)
            }
        }
    }

    suspend fun exportUsrcheatDat(destinationFile: File): Boolean = withContext(Dispatchers.IO) {
        try {
            val bytes = cachedDatBytes ?: return@withContext false
            destinationFile.parentFile?.mkdirs()
            FileOutputStream(destinationFile).use { fos ->
                fos.write(bytes)
            }
            true
        } catch (e: Exception) {
            Log.e(TAG, "Error exporting usrcheat.dat", e)
            false
        }
    }
}
