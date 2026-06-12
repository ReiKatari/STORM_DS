package me.magnum.melonds.impl.retroachievements.offline

data class SmartSyncPlanItem(
    val unlock: OfflineUnlockEvent,
)

object SmartSyncPlanner {
    fun plan(
        pendingUnlocks: List<OfflineUnlockEvent>,
        sessions: Map<String, OfflineSessionEvent>,
    ): List<SmartSyncPlanItem> {
        if (pendingUnlocks.isEmpty()) return emptyList()

        val unlocksBySession = pendingUnlocks.groupBy { it.sessionId.ifBlank { "__unknown__" } }

        val orderedSessionIds = unlocksBySession.keys.sortedWith(
            compareBy<String> { sessions[it]?.startedAtEpochMs ?: Long.MAX_VALUE }
                .thenBy { sessions[it]?.seq ?: Long.MAX_VALUE }
                .thenBy { it },
        )

        val planItems = mutableListOf<SmartSyncPlanItem>()

        orderedSessionIds.forEach { sessionId ->
            val sessionUnlocks = unlocksBySession[sessionId].orEmpty().sortedWith(
                compareBy<OfflineUnlockEvent> { it.offsetFromSessionStartMs }
                    .thenBy { it.orderIndex }
                    .thenBy { it.seq },
            )
            sessionUnlocks.forEach { unlock ->
                planItems += SmartSyncPlanItem(unlock = unlock)
            }
        }

        return planItems
    }
}
