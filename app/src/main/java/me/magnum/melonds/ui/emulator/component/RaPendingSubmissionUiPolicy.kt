package me.magnum.melonds.ui.emulator.component

import me.magnum.melonds.domain.model.retroachievements.RaPendingCounts

enum class RaPendingRuntimeOwner {
    RC_CLIENT,
    LEGACY_KOTLIN,
    NONE,
}

data class RaPendingSyncMenuContext(
    val isRomSessionActive: Boolean,
    val isRetroAchievementsActive: Boolean,
    val sessionStartedOnline: Boolean,
    val isHardcore: Boolean,
    val runtimeOwner: RaPendingRuntimeOwner,
    val isBackendProxyActive: Boolean,
    val counts: RaPendingCounts,
)

data class RaPendingSyncMenuState(
    val isVisible: Boolean,
    val pendingCount: Int,
    val label: String?,
)

enum class RaPendingManualSyncAction {
    START_SYNC,
    REOPEN_PAUSE_MENU,
}

data class RaPendingSubmissionBreakdown(
    val total: Int,
    val achievementUnlocks: Int,
    val leaderboardEntries: Int,
    val retryable: Int,
    val permanentFailures: Int,
) {
    val hasPending: Boolean get() = total > 0

    companion object {
        fun from(counts: RaPendingCounts) = RaPendingSubmissionBreakdown(
            total = counts.total,
            achievementUnlocks = counts.achievementUnlocks,
            leaderboardEntries = counts.leaderboardEntries,
            retryable = counts.retryable,
            permanentFailures = counts.permanentFailures,
        )
    }
}

data class RaPendingExitPromptState(
    val isRequired: Boolean,
    val pending: RaPendingSubmissionBreakdown,
)

enum class RaPendingExitOutcome {
    EXIT,
    KEEP_SESSION_OPEN,
}

enum class RaPendingExitFollowUp {
    EXIT,
    RESUME_SESSION,
    KEEP_SESSION_PAUSED,
}

enum class RaPendingExitContext {
    RESUMABLE_SESSION,
    TERMINAL_STOP,
}

enum class RaPendingExitReason {
    SYNC_COMPLETED,
    SYNC_INCOMPLETE,
    CONTINUE_PLAYING,
    DISCARD_COMPLETED,
    DISCARD_INCOMPLETE,
}

data class RaPendingExitDecision(
    val outcome: RaPendingExitOutcome,
    val reason: RaPendingExitReason,
    val before: RaPendingSubmissionBreakdown,
    val remaining: RaPendingSubmissionBreakdown,
    val exitContext: RaPendingExitContext = RaPendingExitContext.RESUMABLE_SESSION,
) {
    val shouldExit: Boolean get() = outcome == RaPendingExitOutcome.EXIT
    val followUp: RaPendingExitFollowUp
        get() = when {
            shouldExit -> RaPendingExitFollowUp.EXIT
            reason == RaPendingExitReason.CONTINUE_PLAYING &&
                exitContext == RaPendingExitContext.RESUMABLE_SESSION ->
                RaPendingExitFollowUp.RESUME_SESSION
            else -> RaPendingExitFollowUp.KEEP_SESSION_PAUSED
        }
}

object RaPendingSubmissionUiPolicy {
    fun manualSyncAction(currentCounts: RaPendingCounts): RaPendingManualSyncAction {
        return if (currentCounts.total > 0) {
            RaPendingManualSyncAction.START_SYNC
        } else {
            RaPendingManualSyncAction.REOPEN_PAUSE_MENU
        }
    }

    fun mustKeepRuntimeForPendingSettingsDisable(
        requestedEnabled: Boolean,
        isHardcore: Boolean,
        runtimeOwner: RaPendingRuntimeOwner,
        pendingCount: Int,
        contextStillValid: Boolean,
    ): Boolean {
        return !requestedEnabled &&
            isHardcore &&
            runtimeOwner == RaPendingRuntimeOwner.RC_CLIENT &&
            pendingCount > 0 &&
            contextStillValid
    }

    fun syncMenuState(
        context: RaPendingSyncMenuContext,
        labelFormatter: (Int) -> String = { count -> "Sync RetroAchievements ($count)" },
    ): RaPendingSyncMenuState {
        val isEligible =
            context.isRomSessionActive &&
                context.isRetroAchievementsActive &&
                context.sessionStartedOnline &&
                context.isHardcore &&
                context.runtimeOwner == RaPendingRuntimeOwner.RC_CLIENT &&
                !context.isBackendProxyActive
        val isVisible = isEligible && context.counts.total > 0
        return RaPendingSyncMenuState(
            isVisible = isVisible,
            pendingCount = context.counts.total,
            label = if (isVisible) labelFormatter(context.counts.total) else null,
        )
    }

    fun exitPromptState(counts: RaPendingCounts): RaPendingExitPromptState {
        val pending = RaPendingSubmissionBreakdown.from(counts)
        return RaPendingExitPromptState(
            isRequired = pending.hasPending,
            pending = pending,
        )
    }

    fun afterSyncAndExit(result: RaPendingSyncResult): RaPendingExitDecision {
        val remaining = RaPendingSubmissionBreakdown.from(result.remaining)
        return RaPendingExitDecision(
            outcome = if (remaining.hasPending) {
                RaPendingExitOutcome.KEEP_SESSION_OPEN
            } else {
                RaPendingExitOutcome.EXIT
            },
            reason = if (remaining.hasPending) {
                RaPendingExitReason.SYNC_INCOMPLETE
            } else {
                RaPendingExitReason.SYNC_COMPLETED
            },
            before = RaPendingSubmissionBreakdown.from(result.before),
            remaining = remaining,
        )
    }

    fun continuePlaying(
        counts: RaPendingCounts,
        exitContext: RaPendingExitContext = RaPendingExitContext.RESUMABLE_SESSION,
    ): RaPendingExitDecision {
        val pending = RaPendingSubmissionBreakdown.from(counts)
        return RaPendingExitDecision(
            outcome = RaPendingExitOutcome.KEEP_SESSION_OPEN,
            reason = RaPendingExitReason.CONTINUE_PLAYING,
            before = pending,
            remaining = pending,
            exitContext = exitContext,
        )
    }

    fun afterDiscardAndExit(
        before: RaPendingCounts,
        remaining: RaPendingCounts,
    ): RaPendingExitDecision {
        val remainingBreakdown = RaPendingSubmissionBreakdown.from(remaining)
        return RaPendingExitDecision(
            outcome = if (remainingBreakdown.hasPending) {
                RaPendingExitOutcome.KEEP_SESSION_OPEN
            } else {
                RaPendingExitOutcome.EXIT
            },
            reason = if (remainingBreakdown.hasPending) {
                RaPendingExitReason.DISCARD_INCOMPLETE
            } else {
                RaPendingExitReason.DISCARD_COMPLETED
            },
            before = RaPendingSubmissionBreakdown.from(before),
            remaining = remainingBreakdown,
        )
    }
}
