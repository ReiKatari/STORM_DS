package me.magnum.melonds.domain.model.retroachievements

data class RARuntimeBridgeConfig(
    val useRcClientRuntime: Boolean,
    val userAgent: String?,
    val username: String?,
    val apiToken: String?,
    val gameHash: String?,
    val gameId: Long?,
    val hardcoreEnabled: Boolean,
    val unofficialEnabled: Boolean,
    val encoreEnabled: Boolean,
)
