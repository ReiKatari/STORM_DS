package me.magnum.melonds.domain.model

data class RomMetadata(
    val romTitle: String,
    val developerName: String,
    val isDSiWareTitle: Boolean,
    val isDSiEnhanced: Boolean = false,
    val retroAchievementsHash: String,
    val gameCode: String = "",
    val titleId: Long = 0L,
)