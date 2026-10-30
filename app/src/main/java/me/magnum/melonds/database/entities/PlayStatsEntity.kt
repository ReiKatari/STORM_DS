package me.magnum.melonds.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "play_stats")
data class PlayStatsEntity(
    @PrimaryKey
    val romUri: String,
    val romName: String,
    val gameCode: String,
    val launchCount: Int,
    val totalPlayTimeMs: Long,
    val lastPlayedEpochMs: Long,
)
