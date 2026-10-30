package me.magnum.melonds.database.entities

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "play_sessions",
    indices = [
        Index("dayKey"),
        Index("romUri"),
    ],
)
data class PlaySessionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val dayKey: String,
    val romUri: String,
    val romName: String,
    val startedAtMs: Long,
    val durationMs: Long,
)
