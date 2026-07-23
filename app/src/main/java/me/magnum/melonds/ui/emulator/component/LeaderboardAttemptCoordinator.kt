package me.magnum.melonds.ui.emulator.component

import me.magnum.melonds.domain.model.retroachievements.RAEvent

data class LeaderboardAttemptKey(
    val leaderboardId: Long,
    val attemptId: Long,
)

internal class LeaderboardAttemptCoordinator {
    private enum class Phase { TRACKING, PENDING, SCOREBOARD, FAILED, CANCELED }

    private data class State(
        val key: LeaderboardAttemptKey,
        val phase: Phase,
        val lastSequence: Long,
    )

    sealed interface Transition {
        val key: LeaderboardAttemptKey

        data class Started(val event: RAEvent.OnLeaderboardAttemptStarted) : Transition {
            override val key = event.key()
        }

        data class Updated(val event: RAEvent.OnLeaderboardAttemptUpdated) : Transition {
            override val key = event.key()
        }

        data class TrackerHidden(val event: RAEvent.OnLeaderboardTrackerHidden) : Transition {
            override val key = event.key()
        }

        data class Canceled(val event: RAEvent.OnLeaderboardAttemptCancelled) : Transition {
            override val key = event.key()
        }

        data class Pending(val event: RAEvent.OnLeaderboardAttemptSubmitted) : Transition {
            override val key = event.key()
        }

        data class Scoreboard(val event: RAEvent.OnLeaderboardScoreboard) : Transition {
            override val key = event.key()
        }

        data class Failed(val event: RAEvent.OnLeaderboardSubmissionFailed) : Transition {
            override val key = event.key()
        }
    }

    private val statesByKey = mutableMapOf<LeaderboardAttemptKey, State>()
    private val latestAttemptIdByLeaderboard = mutableMapOf<Long, Long>()
    private var highestObservedAttemptId = 0L
    private var resetAttemptFloor = 0L
    private var awaitingRuntimeResetBarrier = false

    fun reset() {
        statesByKey.clear()
        latestAttemptIdByLeaderboard.clear()
        resetAttemptFloor = highestObservedAttemptId
        awaitingRuntimeResetBarrier = false
    }

    fun beginRuntimeReset() {
        retainPendingAttempts()
        latestAttemptIdByLeaderboard.clear()
        awaitingRuntimeResetBarrier = true
    }

    fun completeRuntimeReset(attemptFloor: Long) {
        retainPendingAttempts()
        latestAttemptIdByLeaderboard.clear()
        highestObservedAttemptId = maxOf(highestObservedAttemptId, attemptFloor)
        resetAttemptFloor = maxOf(resetAttemptFloor, attemptFloor)
        awaitingRuntimeResetBarrier = false
    }

    fun reduce(event: RAEvent): Transition? {
        if (
            awaitingRuntimeResetBarrier &&
            !isRetainedPendingResponse(event)
        ) {
            return null
        }

        return when (event) {
            is RAEvent.OnLeaderboardAttemptStarted -> reduceStarted(event)
            is RAEvent.OnLeaderboardAttemptUpdated -> reduceNonTerminal(event.key(), event.eventSequence, Phase.TRACKING) {
                Transition.Updated(event)
            }
            is RAEvent.OnLeaderboardTrackerHidden -> reduceNonTerminal(event.key(), event.eventSequence, null) {
                Transition.TrackerHidden(event)
            }
            is RAEvent.OnLeaderboardAttemptCancelled -> reduceTerminal(event.key(), event.eventSequence, Phase.CANCELED) {
                Transition.Canceled(event)
            }
            is RAEvent.OnLeaderboardAttemptSubmitted -> reducePending(event)
            is RAEvent.OnLeaderboardScoreboard -> reduceTerminal(
                event.key(),
                event.eventSequence,
                Phase.SCOREBOARD,
                allowRetainedPendingBeforeReset = true,
            ) {
                Transition.Scoreboard(event)
            }
            is RAEvent.OnLeaderboardSubmissionFailed -> reduceTerminal(
                event.key(),
                event.eventSequence,
                Phase.FAILED,
                allowRetainedPendingBeforeReset = true,
            ) {
                Transition.Failed(event)
            }
            is RAEvent.OnLeaderboardRuntimeReset -> null
            else -> null
        }
    }

    private fun reduceStarted(event: RAEvent.OnLeaderboardAttemptStarted): Transition? {
        val key = event.key()
        if (!acceptAttempt(key)) return null

        val current = statesByKey[key]
        if (current != null && event.eventSequence <= current.lastSequence) {
            return null
        }

        statesByKey.entries.removeAll { (existingKey, state) ->
            existingKey.leaderboardId == key.leaderboardId &&
                existingKey.attemptId < key.attemptId &&
                state.phase.isTerminal()
        }
        statesByKey[key] = State(key, Phase.TRACKING, event.eventSequence)
        return Transition.Started(event)
    }

    private fun reducePending(event: RAEvent.OnLeaderboardAttemptSubmitted): Transition? {
        val key = event.key()
        if (!acceptAttempt(key)) return null

        val current = statesByKey[key]
        if (current != null) {
            if (current.phase.isTerminal() || current.phase == Phase.PENDING || event.eventSequence <= current.lastSequence) {
                return null
            }
        }

        statesByKey[key] = State(key, Phase.PENDING, event.eventSequence)
        return Transition.Pending(event)
    }

    private inline fun reduceNonTerminal(
        key: LeaderboardAttemptKey,
        eventSequence: Long,
        nextPhase: Phase?,
        transition: () -> Transition,
    ): Transition? {
        if (!acceptAttempt(key)) return null

        val current = statesByKey[key] ?: return null
        if (current.phase.isTerminal() || eventSequence <= current.lastSequence) {
            return null
        }

        statesByKey[key] = current.copy(
            phase = nextPhase ?: current.phase,
            lastSequence = eventSequence,
        )
        return transition()
    }

    private inline fun reduceTerminal(
        key: LeaderboardAttemptKey,
        eventSequence: Long,
        phase: Phase,
        allowRetainedPendingBeforeReset: Boolean = false,
        transition: () -> Transition,
    ): Transition? {
        if (!acceptAttempt(key, allowRetainedPendingBeforeReset)) return null

        val current = statesByKey[key]
        if (current != null && (current.phase.isTerminal() || eventSequence <= current.lastSequence)) {
            return null
        }

        statesByKey[key] = State(key, phase, eventSequence)
        return transition()
    }

    private fun acceptAttempt(
        key: LeaderboardAttemptKey,
        allowRetainedPendingBeforeReset: Boolean = false,
    ): Boolean {
        val retainedPendingAttempt =
            allowRetainedPendingBeforeReset &&
                statesByKey[key]?.phase == Phase.PENDING
        if (key.attemptId <= resetAttemptFloor && !retainedPendingAttempt) return false
        val latestAttemptId = latestAttemptIdByLeaderboard[key.leaderboardId]
        if (
            statesByKey[key] == null &&
            latestAttemptId != null &&
            key.attemptId < latestAttemptId
        ) {
            return false
        }
        latestAttemptIdByLeaderboard[key.leaderboardId] =
            maxOf(latestAttemptId ?: 0L, key.attemptId)
        highestObservedAttemptId = maxOf(highestObservedAttemptId, key.attemptId)
        return true
    }

    private fun isRetainedPendingResponse(event: RAEvent): Boolean {
        val key = when (event) {
            is RAEvent.OnLeaderboardScoreboard -> event.key()
            is RAEvent.OnLeaderboardSubmissionFailed -> event.key()
            else -> return false
        }
        return statesByKey[key]?.phase == Phase.PENDING
    }

    private fun retainPendingAttempts() {
        statesByKey.entries.removeAll { it.value.phase != Phase.PENDING }
    }

    internal fun trackedAttemptCount(): Int = statesByKey.size

    private fun Phase.isTerminal(): Boolean {
        return this == Phase.SCOREBOARD || this == Phase.FAILED || this == Phase.CANCELED
    }
}

internal object LeaderboardSubmissionOwnership {
    enum class Owner {
        RC_CLIENT,
        LEGACY,
        NONE,
    }

    sealed interface Action {
        data object RuntimeOwnsSubmit : Action
        data class SubmitLegacy(
            val leaderboardId: Long,
            val value: Int,
            val formattedValue: String,
        ) : Action
        data object IgnoreProtocolMismatch : Action
    }

    fun resolve(owner: Owner, event: RAEvent): Action {
        return when (event) {
            is RAEvent.OnLeaderboardAttemptSubmitted,
            is RAEvent.OnLeaderboardScoreboard,
            is RAEvent.OnLeaderboardSubmissionFailed -> Action.RuntimeOwnsSubmit
            is RAEvent.OnLeaderboardRuntimeReset -> Action.IgnoreProtocolMismatch
            is RAEvent.OnLeaderboardAttemptCompleted -> {
                when (owner) {
                    Owner.RC_CLIENT, Owner.NONE -> Action.IgnoreProtocolMismatch
                    Owner.LEGACY -> Action.SubmitLegacy(
                        event.leaderboardId,
                        event.value,
                        event.formattedValue,
                    )
                }
            }
            else -> Action.IgnoreProtocolMismatch
        }
    }

    fun dispatch(
        owner: Owner,
        event: RAEvent,
        submitLegacy: (Action.SubmitLegacy) -> Unit,
    ): Action {
        return resolve(owner, event).also { action ->
            if (action is Action.SubmitLegacy) {
                submitLegacy(action)
            }
        }
    }
}

internal object AchievementSubmissionOwnership {
    enum class Owner {
        RC_CLIENT,
        LEGACY_KOTLIN,
    }

    enum class Action {
        RUNTIME_OWNS_SUBMIT,
        SUBMIT_FROM_KOTLIN,
    }

    fun dispatch(
        owner: Owner,
        submitFromKotlin: () -> Unit,
    ): Action {
        return when (owner) {
            Owner.RC_CLIENT -> Action.RUNTIME_OWNS_SUBMIT
            Owner.LEGACY_KOTLIN -> {
                submitFromKotlin()
                Action.SUBMIT_FROM_KOTLIN
            }
        }
    }
}

private fun RAEvent.OnLeaderboardAttemptStarted.key() = LeaderboardAttemptKey(leaderboardId, attemptId)
private fun RAEvent.OnLeaderboardAttemptUpdated.key() = LeaderboardAttemptKey(leaderboardId, attemptId)
private fun RAEvent.OnLeaderboardAttemptSubmitted.key() = LeaderboardAttemptKey(leaderboardId, attemptId)
private fun RAEvent.OnLeaderboardScoreboard.key() = LeaderboardAttemptKey(leaderboardId, attemptId)
private fun RAEvent.OnLeaderboardSubmissionFailed.key() = LeaderboardAttemptKey(leaderboardId, attemptId)
private fun RAEvent.OnLeaderboardAttemptCancelled.key() = LeaderboardAttemptKey(leaderboardId, attemptId)
private fun RAEvent.OnLeaderboardTrackerHidden.key() = LeaderboardAttemptKey(leaderboardId, attemptId)
