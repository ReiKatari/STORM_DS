package me.magnum.melonds.database.daos

import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow
import me.magnum.melonds.database.entities.CheatFolderWithCheats
import me.magnum.melonds.database.entities.GameEntity

data class GameSearchProjection(
    @ColumnInfo(name = "game_id") val gameId: Long,
    @ColumnInfo(name = "game_name") val gameName: String,
    @ColumnInfo(name = "game_code") val gameCode: String,
    @ColumnInfo(name = "cheat_count") val cheatCount: Int,
)

@Dao
interface GameDao {
    @Query("SELECT * FROM game")
    suspend fun getGames(): List<GameEntity>

    @Query("SELECT COUNT(*) FROM game")
    suspend fun getGameCount(): Int

    @Query("SELECT * FROM game WHERE id = :gameId")
    suspend fun getGame(gameId: Long): GameEntity?

    @Query("SELECT * FROM game WHERE game_code = :gameCode AND game_checksum = :gameChecksum")
    suspend fun findGame(gameCode: String, gameChecksum: String): GameEntity?

    @Query("SELECT * FROM game WHERE game_code = :gameCode LIMIT 1")
    suspend fun findGameByCode(gameCode: String): GameEntity?

    @Query("SELECT * FROM game WHERE game_checksum = :gameChecksum LIMIT 1")
    suspend fun findGameByChecksum(gameChecksum: String): GameEntity?

    @Query("SELECT * FROM game WHERE game_code LIKE :codePrefix || '%' LIMIT 1")
    suspend fun findGameByPrefix(codePrefix: String): GameEntity?

    @Query("SELECT * FROM game WHERE game_code LIKE :codePrefix || '%'")
    suspend fun findGamesByPrefix(codePrefix: String): List<GameEntity>

    @Query("SELECT * FROM game WHERE name LIKE '%' || :titleKeyword || '%' LIMIT 1")
    suspend fun findGameByTitle(titleKeyword: String): GameEntity?

    @Transaction
    @Query("SELECT * FROM cheat_folder WHERE game_id = :gameId")
    fun getGameCheats(gameId: Long): Flow<List<CheatFolderWithCheats>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertGame(game: GameEntity): Long

    @Query("DELETE FROM game WHERE id NOT IN (SELECT DISTINCT game_id FROM cheat_folder)")
    suspend fun deleteEmptyGames()

    @Query("DELETE FROM game")
    suspend fun deleteAllGames()

    @Query(
        """
        SELECT
            game.id AS game_id,
            game.name AS game_name,
            game.game_code AS game_code,
            COUNT(cheat.id) AS cheat_count
        FROM game
        LEFT JOIN cheat_folder ON game.id = cheat_folder.game_id
        LEFT JOIN cheat ON cheat_folder.id = cheat.cheat_folder_id
        WHERE :query = ''
            OR game.name LIKE '%' || :query || '%'
            OR game.game_code LIKE '%' || :query || '%'
        GROUP BY game.id
        ORDER BY game.name COLLATE NOCASE ASC
        LIMIT :limit
        """
    )
    suspend fun searchGamesWithCheatCount(query: String, limit: Int = 50): List<GameSearchProjection>
}
