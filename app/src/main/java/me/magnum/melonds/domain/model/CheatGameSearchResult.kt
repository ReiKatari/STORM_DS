package me.magnum.melonds.domain.model

data class CheatGameSearchResult(
    val gameId: Long,
    val gameName: String,
    val gameCode: String,
    val cheatCount: Int,
)
