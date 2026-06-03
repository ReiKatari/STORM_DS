package me.magnum.melonds.domain.model.retroachievements

enum class RARuntimeBridgeMode(val nativeValue: Int) {
    RC_CLIENT_ONLINE(1),
    RC_CLIENT_OFFLINE(2),
}

data class RARuntimeBridgeConfig(
    val runtimeMode: RARuntimeBridgeMode,
    val userAgent: String?,
    val username: String?,
    val apiToken: String?,
    val gameHash: String?,
    val gameId: Long?,
    val hardcoreEnabled: Boolean,
    val unofficialEnabled: Boolean,
    val encoreEnabled: Boolean,
)
