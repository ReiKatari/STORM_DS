package me.magnum.melonds.ui.emulator.component

enum class RaHardcoreContinuityState {
    ONLINE_LIVE,
    OFFLINE_ACCUMULATING,
    PENDING_RA_SUBMISSIONS,
    RECONCILING_RA_SUBMISSIONS,
}

sealed interface RaHardcoreContinuityEvent {
    data class NetworkLost(val pendingTotal: Int) : RaHardcoreContinuityEvent
    data class NetworkRestored(val pendingTotal: Int) : RaHardcoreContinuityEvent
    data class PendingChanged(
        val pendingTotal: Int,
        val networkAvailable: Boolean,
    ) : RaHardcoreContinuityEvent
    data class ReconciliationStarted(val pendingTotal: Int) : RaHardcoreContinuityEvent
    data class ReconciliationFinished(
        val remainingTotal: Int,
        val networkAvailable: Boolean,
    ) : RaHardcoreContinuityEvent
    data object SessionReset : RaHardcoreContinuityEvent
}

object RaHardcoreContinuityStateMachine {
    fun reduce(
        current: RaHardcoreContinuityState,
        event: RaHardcoreContinuityEvent,
    ): RaHardcoreContinuityState {
        return when (event) {
            is RaHardcoreContinuityEvent.NetworkLost -> {
                requireNonNegative(event.pendingTotal)
                if (event.pendingTotal > 0) {
                    RaHardcoreContinuityState.PENDING_RA_SUBMISSIONS
                } else {
                    RaHardcoreContinuityState.OFFLINE_ACCUMULATING
                }
            }
            is RaHardcoreContinuityEvent.NetworkRestored -> {
                requireNonNegative(event.pendingTotal)
                if (event.pendingTotal > 0) {
                    RaHardcoreContinuityState.PENDING_RA_SUBMISSIONS
                } else {
                    RaHardcoreContinuityState.ONLINE_LIVE
                }
            }
            is RaHardcoreContinuityEvent.PendingChanged -> {
                requireNonNegative(event.pendingTotal)
                if (current == RaHardcoreContinuityState.RECONCILING_RA_SUBMISSIONS) {
                    current
                } else if (event.pendingTotal > 0) {
                    RaHardcoreContinuityState.PENDING_RA_SUBMISSIONS
                } else if (event.networkAvailable) {
                    RaHardcoreContinuityState.ONLINE_LIVE
                } else {
                    RaHardcoreContinuityState.OFFLINE_ACCUMULATING
                }
            }
            is RaHardcoreContinuityEvent.ReconciliationStarted -> {
                requireNonNegative(event.pendingTotal)
                if (event.pendingTotal > 0) {
                    RaHardcoreContinuityState.RECONCILING_RA_SUBMISSIONS
                } else {
                    current
                }
            }
            is RaHardcoreContinuityEvent.ReconciliationFinished -> {
                requireNonNegative(event.remainingTotal)
                if (event.remainingTotal > 0) {
                    RaHardcoreContinuityState.PENDING_RA_SUBMISSIONS
                } else if (event.networkAvailable) {
                    RaHardcoreContinuityState.ONLINE_LIVE
                } else {
                    RaHardcoreContinuityState.OFFLINE_ACCUMULATING
                }
            }
            RaHardcoreContinuityEvent.SessionReset -> RaHardcoreContinuityState.ONLINE_LIVE
        }
    }

    private fun requireNonNegative(value: Int) {
        require(value >= 0) { "pending submission count must not be negative" }
    }
}
