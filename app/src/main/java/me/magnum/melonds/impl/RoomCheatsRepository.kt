package me.magnum.melonds.impl

import android.content.Context
import android.net.Uri
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkInfo
import androidx.work.WorkManager
import androidx.work.workDataOf
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.mapNotNull
import me.magnum.melonds.common.cheats.jusrcheat.JusrcheatRepository
import me.magnum.melonds.common.workers.CheatImportWorker
import me.magnum.melonds.database.MelonDatabase
import me.magnum.melonds.database.entities.CheatDatabaseEntity
import me.magnum.melonds.database.entities.CheatEntity
import me.magnum.melonds.database.entities.CheatFolderEntity
import me.magnum.melonds.database.entities.CheatStatusUpdate
import me.magnum.melonds.database.entities.GameEntity
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.CheatDatabase
import me.magnum.melonds.domain.model.CheatFolder
import me.magnum.melonds.domain.model.CheatImportProgress
import me.magnum.melonds.domain.model.Game
import me.magnum.melonds.domain.model.RomInfo
import me.magnum.melonds.domain.repositories.CheatsRepository
import me.magnum.melonds.ui.cheats.model.CheatSubmissionForm

class RoomCheatsRepository(
    private val context: Context,
    private val database: MelonDatabase,
    private val settingsBackupManager: SettingsBackupManager,
) : CheatsRepository {
    companion object {
        private const val IMPORT_WORKER_NAME = "cheat_import_worker"
    }

    @get:JvmName("jusrcheatRepositoryProp")
    val jusrcheatRepository: JusrcheatRepository by lazy {
        JusrcheatRepository.getInstance(context, database)
    }

    override fun getJusrcheatRepository(): JusrcheatRepository {
        return jusrcheatRepository
    }

    override suspend fun getGames(): List<Game> {
        return database.gameDao().getGames().map { game ->
            Game(
                game.id,
                game.name,
                game.gameCode,
                game.gameChecksum,
                emptyList(),
            )
        }
    }

    override suspend fun findGameForRom(romInfo: RomInfo): Game? {
        val lookupCode = romInfo.cheatGameCode
        val cleanGameCode = romInfo.gameCode.take(4).uppercase()
        val checksumStr = romInfo.headerChecksumString()

        var gameEntity = database.gameDao().findGame(lookupCode, checksumStr)
            ?: (if (checksumStr.isNotBlank()) database.gameDao().findGameByChecksum(checksumStr) else null)
            ?: database.gameDao().findGameByCode(lookupCode)
            ?: (if (!romInfo.isDsiWareTitle && cleanGameCode.length == 4) database.gameDao().findGameByCode(cleanGameCode) else null)
            ?: (if (cleanGameCode.length >= 3) database.gameDao().findGameByPrefix(cleanGameCode.take(3)) else null)

        if (gameEntity == null || database.cheatFolderDao().getFoldersForGame(gameEntity.id ?: -1).isEmpty()) {
            val populated = me.magnum.melonds.common.cheats.EmbeddedActionReplayCheats.populateIfEmpty(
                database,
                lookupCode,
                romInfo.gameTitle.ifBlank { romInfo.gameName },
                checksumStr
            )
            if (populated) {
                gameEntity = database.gameDao().findGame(lookupCode, checksumStr)
                    ?: (if (checksumStr.isNotBlank()) database.gameDao().findGameByChecksum(checksumStr) else null)
                    ?: database.gameDao().findGameByCode(lookupCode)
                    ?: (if (!romInfo.isDsiWareTitle && cleanGameCode.length == 4) database.gameDao().findGameByCode(cleanGameCode) else null)
                    ?: (if (cleanGameCode.length >= 3) database.gameDao().findGameByPrefix(cleanGameCode.take(3)) else null)
            }
        }

        return gameEntity?.let {
            Game(
                it.id,
                it.name,
                it.gameCode,
                it.gameChecksum,
                emptyList(),
            )
        }
    }

    override fun getAllGameCheats(game: Game): Flow<List<CheatFolder>> {
        val gameId = game.id ?: return emptyFlow()

        return database.gameDao().getGameCheats(gameId).map { foldersWithCheats ->
            foldersWithCheats.map {
                CheatFolder(
                    it.cheatFolder.id,
                    it.cheatFolder.name,
                    it.cheats.map { cheat ->
                        Cheat(
                            cheat.id,
                            cheat.cheatDatabaseId,
                            cheat.name,
                            cheat.description,
                            cheat.code,
                            cheat.enabled
                        )
                    }
                )
            }
        }
    }

    override fun getFolderCheats(folder: CheatFolder): Flow<List<Cheat>> {
        return database.cheatDao().getFolderCheats(folder.id!!).map {
            it.map { cheat ->
                Cheat(
                    cheat.id,
                    cheat.cheatDatabaseId,
                    cheat.name,
                    cheat.description,
                    cheat.code,
                    cheat.enabled
                )
            }
        }
    }

    override suspend fun getRomEnabledCheats(romInfo: RomInfo): List<Cheat> {
        val lookupCode = romInfo.cheatGameCode
        val cleanGameCode = romInfo.gameCode.take(4).uppercase()
        val checksumStr = romInfo.headerChecksumString()

        // 1. Exact checksum + null checksum query
        val primaryCheats = database.cheatDao().getEnabledRomCheats(lookupCode, checksumStr)
        val codeCheats = if (primaryCheats.isNotEmpty()) primaryCheats else database.cheatDao().getEnabledRomCheats(cleanGameCode, checksumStr)

        // 2. Fallback CRC-agnostic query for patched ROMs ([T+Rus]) and attached cross-region/custom cheats
        val crcAgnosticLookup = database.cheatDao().getEnabledRomCheatsIgnoreCrc(lookupCode)
        val crcAgnosticCode = if (cleanGameCode != lookupCode) database.cheatDao().getEnabledRomCheatsIgnoreCrc(cleanGameCode) else emptyList()

        val allCandidates = (primaryCheats + codeCheats + crcAgnosticLookup + crcAgnosticCode)
            .distinctBy { it.id ?: (it.code.hashCode().toLong() xor it.name.hashCode().toLong()) }

        return allCandidates.map { cheat ->
            Cheat(
                cheat.id,
                cheat.cheatDatabaseId,
                cheat.name,
                cheat.description,
                cheat.code,
                cheat.enabled
            )
        }
    }

    override suspend fun updateCheatsStatus(cheats: List<Cheat>) {
        val cheatEntities = cheats.map {
            CheatStatusUpdate(it.id!!, it.enabled)
        }

        database.cheatDao().updateCheatsStatus(cheatEntities)
        settingsBackupManager.requestMirrorWrite()
    }

    override suspend fun addCheatFolder(folderName: String, game: Game) {
        val cheatFolderEntity = CheatFolderEntity(
            id = null,
            gameId = game.id!!,
            name = folderName,
        )

        database.cheatFolderDao().insertCheatFolder(cheatFolderEntity)
        settingsBackupManager.requestMirrorWrite()
    }

    override suspend fun deleteCheatDatabaseIfExists(databaseName: String) {
        database.cheatDatabaseDao().deleteCheatDatabase(databaseName)
        database.gameDao().deleteEmptyGames()
        database.cheatFolderDao().deleteEmptyFolders()
        settingsBackupManager.requestMirrorWrite()
    }

    override suspend fun addCheatDatabase(databaseName: String): CheatDatabase {
        val databaseEntity = CheatDatabaseEntity(
            id = null,
            name = databaseName,
        )

        val id = database.cheatDatabaseDao().insertCheatDatabase(databaseEntity)
        settingsBackupManager.requestMirrorWrite()
        return CheatDatabase(id, databaseName)
    }

    override suspend fun addGameCheats(game: Game): Game {
        var insertedGame = database.gameDao().findGame(game.gameCode, game.gameChecksum)
        if (insertedGame == null) {
            val gameEntity = GameEntity(
                id = null,
                name = game.name,
                gameCode = game.gameCode,
                gameChecksum = game.gameChecksum,
            )

            val id = database.gameDao().insertGame(gameEntity)
            insertedGame = gameEntity.copy(id = id)
        }

        game.cheats.forEach { folder ->
            val folderEntity = CheatFolderEntity(
                id = null,
                gameId = insertedGame.id!!,
                name = folder.name,
            )

            val folderId = database.cheatFolderDao().insertCheatFolder(folderEntity)
            val newCheats = folder.cheats.map {
                CheatEntity(
                    id = null,
                    cheatFolderId = folderId,
                    cheatDatabaseId = it.cheatDatabaseId,
                    name = it.name,
                    description = it.description,
                    code = it.code,
                    enabled = false
                )
            }
            if (newCheats.isNotEmpty()) {
                database.cheatDao().insertCheats(newCheats)
            }
        }

        settingsBackupManager.requestMirrorWrite()
        return Game(
            id = insertedGame.id,
            name = insertedGame.name,
            gameCode = insertedGame.gameCode,
            gameChecksum = insertedGame.gameChecksum,
            cheats = emptyList(),
        )
    }

    override suspend fun addCheat(folder: CheatFolder, cheat: Cheat) {
        val cheatEntity = CheatEntity(
            id = null,
            cheatFolderId = folder.id!!,
            cheatDatabaseId = cheat.cheatDatabaseId,
            name = cheat.name,
            description = cheat.description,
            code = cheat.code,
            enabled = cheat.enabled,
        )

        database.cheatDao().insertCheat(cheatEntity)
        settingsBackupManager.requestMirrorWrite()
    }

    override suspend fun addCustomCheat(folder: CheatFolder, cheatForm: CheatSubmissionForm) {
        val cheatEntity = CheatEntity(
            id = null,
            cheatFolderId = folder.id!!,
            cheatDatabaseId = CheatDatabaseEntity.CUSTOM_CHEATS_DATABASE_ID,
            name = cheatForm.name,
            description = cheatForm.description,
            code = cheatForm.code,
            enabled = false,
        )

        database.cheatDao().insertCheat(cheatEntity)
        settingsBackupManager.requestMirrorWrite()
    }

    override suspend fun updateCheat(cheat: Cheat) {
        val originalEntity = database.cheatDao().getCheat(cheat.id!!) ?: return
        val updatedCheatEntity = CheatEntity(
            id = cheat.id,
            cheatFolderId = originalEntity.cheatFolderId,
            cheatDatabaseId = originalEntity.cheatDatabaseId,
            name = cheat.name,
            description = cheat.description,
            code = cheat.code,
            enabled = cheat.enabled,
        )

        database.cheatDao().insertCheat(updatedCheatEntity)
        settingsBackupManager.requestMirrorWrite()
    }

    override suspend fun deleteCheat(cheat: Cheat) {
        val cheatId = cheat.id ?: return
        database.cheatDao().deleteCheat(cheatId)
        settingsBackupManager.requestMirrorWrite()
    }

    override fun importCheats(uri: Uri) {
        val workRequest = OneTimeWorkRequestBuilder<CheatImportWorker>()
                .setInputData(workDataOf(CheatImportWorker.KEY_URI to uri.toString()))
                .build()

        WorkManager.getInstance(context).enqueueUniqueWork(IMPORT_WORKER_NAME, ExistingWorkPolicy.KEEP, workRequest)
    }

    override fun isCheatImportOngoing(): Boolean {
        val workManager = WorkManager.getInstance(context)
        val statuses = workManager.getWorkInfosForUniqueWork(IMPORT_WORKER_NAME)
        val infos = statuses.get()

        return infos.any { !it.state.isFinished }
    }

    override fun getCheatImportProgress(): Flow<CheatImportProgress> {
        val workManager = WorkManager.getInstance(context)
        return workManager.getWorkInfosForUniqueWorkFlow(IMPORT_WORKER_NAME)
            .mapNotNull { workInfos ->
                val allWorkFinished = workInfos.all { it.state.isFinished }
                if (allWorkFinished) {
                    CheatImportProgress(CheatImportProgress.CheatImportStatus.NOT_IMPORTING, 0f, null)
                } else {
                    val workInfo = workInfos.first()
                    when (workInfo.state) {
                        WorkInfo.State.ENQUEUED -> CheatImportProgress(CheatImportProgress.CheatImportStatus.STARTING, 0f, null)
                        WorkInfo.State.RUNNING -> {
                            val relativeProgress = workInfo.progress.getFloat(CheatImportWorker.KEY_PROGRESS_RELATIVE, 0f)
                            val itemName = workInfo.progress.getString(CheatImportWorker.KEY_PROGRESS_ITEM)
                            CheatImportProgress(CheatImportProgress.CheatImportStatus.ONGOING, relativeProgress, itemName)
                        }
                        WorkInfo.State.SUCCEEDED -> CheatImportProgress(CheatImportProgress.CheatImportStatus.FINISHED, 1f, null)
                        WorkInfo.State.CANCELLED,
                        WorkInfo.State.FAILED -> CheatImportProgress(CheatImportProgress.CheatImportStatus.FAILED, 0f, null)
                        WorkInfo.State.BLOCKED -> null
                    }
                }
            }
    }
}
