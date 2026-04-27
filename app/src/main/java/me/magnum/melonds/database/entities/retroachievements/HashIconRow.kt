package me.magnum.melonds.database.entities.retroachievements

import androidx.room.ColumnInfo

/**
 * Projection result of joining `ra_game_hash_library` with `ra_game`. Exposes the URL of a game's
 * RetroAchievements badge keyed by a ROM hash, used to show the official RA cover as the ROM's
 * thumbnail in the ROM list.
 */
data class HashIconRow(
    @ColumnInfo(name = "hash") val hash: String,
    @ColumnInfo(name = "iconUrl") val iconUrl: String,
)
