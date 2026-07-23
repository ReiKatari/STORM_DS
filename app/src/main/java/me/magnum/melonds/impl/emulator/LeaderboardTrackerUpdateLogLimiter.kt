package me.magnum.melonds.impl.emulator

internal class LeaderboardTrackerUpdateLogLimiter(
    private val minimumIntervalNanos: Long = DEFAULT_MINIMUM_INTERVAL_NANOS,
    private val nanoTime: () -> Long = System::nanoTime,
) {
    data class Decision(
        val shouldLog: Boolean,
        val updateIndex: Long,
        val suppressedUpdates: Long,
    )

    private data class AttemptKey(
        val leaderboardId: Long,
        val attemptId: Long,
    )

    private data class AttemptState(
        var lastLoggedAtNanos: Long,
        var updateCount: Long,
        var suppressedUpdates: Long,
    )

    private val states = mutableMapOf<AttemptKey, AttemptState>()

    @Synchronized
    fun observe(leaderboardId: Long, attemptId: Long): Decision {
        val key = AttemptKey(leaderboardId, attemptId)
        val now = nanoTime()
        val state = states[key]
        if (state == null) {
            states[key] = AttemptState(
                lastLoggedAtNanos = now,
                updateCount = 1,
                suppressedUpdates = 0,
            )
            return Decision(shouldLog = true, updateIndex = 1, suppressedUpdates = 0)
        }

        state.updateCount++
        val elapsedNanos = now - state.lastLoggedAtNanos
        if (elapsedNanos < 0 || elapsedNanos >= minimumIntervalNanos) {
            val decision = Decision(
                shouldLog = true,
                updateIndex = state.updateCount,
                suppressedUpdates = state.suppressedUpdates,
            )
            state.lastLoggedAtNanos = now
            state.suppressedUpdates = 0
            return decision
        }

        state.suppressedUpdates++
        return Decision(
            shouldLog = false,
            updateIndex = state.updateCount,
            suppressedUpdates = state.suppressedUpdates,
        )
    }

    @Synchronized
    fun reset(leaderboardId: Long, attemptId: Long) {
        states.remove(AttemptKey(leaderboardId, attemptId))
    }

    @Synchronized
    fun resetAll() {
        states.clear()
    }

    private companion object {
        const val DEFAULT_MINIMUM_INTERVAL_NANOS = 1_000_000_000L
    }
}
