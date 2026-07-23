package me.magnum.melonds.ui.emulator.component

import me.magnum.melonds.domain.model.retroachievements.RaSubmissionContext

data class RaActiveSubmissionContext(
    val isRcClientOnlineRuntime: Boolean,
    val runtimeHardcore: Boolean,
    val sessionHardcore: Boolean,
    val authenticatedUserId: String?,
    val authenticationTokenMatchesRuntime: Boolean,
    val runtimeUserId: String?,
    val runtimeGameId: Long?,
    val activeGameId: Long?,
    val runtimeContentHash: String?,
    val activeContentHash: String?,
    val nativeSessionId: Long,
)

object RaSubmissionContextValidator {
    fun matches(
        pending: RaSubmissionContext,
        active: RaActiveSubmissionContext,
    ): Boolean {
        return active.isRcClientOnlineRuntime &&
            active.runtimeHardcore &&
            active.sessionHardcore &&
            active.authenticatedUserId == pending.userId &&
            active.authenticationTokenMatchesRuntime &&
            active.runtimeUserId == pending.userId &&
            active.runtimeGameId == pending.gameId &&
            active.activeGameId == pending.gameId &&
            active.runtimeContentHash == pending.contentHash &&
            active.activeContentHash == pending.contentHash &&
            active.nativeSessionId == pending.nativeSessionId
    }
}
