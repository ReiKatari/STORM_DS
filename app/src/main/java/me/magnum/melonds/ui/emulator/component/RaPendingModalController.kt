package me.magnum.melonds.ui.emulator.component

import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.atomic.AtomicBoolean
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import me.magnum.melonds.domain.model.retroachievements.RaPendingCounts
import me.magnum.melonds.ui.emulator.model.RaPendingSyncResultAction

sealed interface RaPendingModalState {
    data object None : RaPendingModalState

    data class ExitPrompt(
        val requestId: Long,
        val pending: RaPendingCounts,
        val exitContext: RaPendingExitContext,
    ) : RaPendingModalState

    data class Syncing(
        val requestId: Long,
        val pending: RaPendingCounts,
        val priority: RaPendingModalPriority,
    ) : RaPendingModalState

    data class Result(
        val requestId: Long,
        val result: RaPendingSyncResult,
        val action: RaPendingSyncResultAction,
        val priority: RaPendingModalPriority,
    ) : RaPendingModalState
}

enum class RaPendingModalPriority {
    MANUAL_SYNC,
    RESUMABLE_EXIT,
    TERMINAL_EXIT,
}

class RaPendingModalController {
    private val lock = Any()
    private val nextRequestId = AtomicLong(1L)
    private val _state = MutableStateFlow<RaPendingModalState>(RaPendingModalState.None)

    val state = _state.asStateFlow()

    fun beginExitPrompt(
        pending: RaPendingCounts,
        exitContext: RaPendingExitContext,
    ): Long? {
        val requestedPriority = exitContext.toPriority()
        return synchronized(lock) {
            val currentPriority = currentPriorityLocked()
            if (currentPriority != null && currentPriority.ordinal >= requestedPriority.ordinal) {
                return@synchronized null
            }
            nextIdLocked().also { requestId ->
                _state.value = RaPendingModalState.ExitPrompt(
                    requestId = requestId,
                    pending = pending,
                    exitContext = exitContext,
                )
            }
        }
    }

    fun beginManualSync(pending: RaPendingCounts): Long? {
        return synchronized(lock) {
            if (_state.value != RaPendingModalState.None) {
                return@synchronized null
            }
            nextIdLocked().also { requestId ->
                _state.value = RaPendingModalState.Syncing(
                    requestId = requestId,
                    pending = pending,
                    priority = RaPendingModalPriority.MANUAL_SYNC,
                )
            }
        }
    }

    fun transitionExitToSyncing(
        requestId: Long,
        pending: RaPendingCounts,
    ): Boolean {
        return synchronized(lock) {
            val current = _state.value as? RaPendingModalState.ExitPrompt
                ?: return@synchronized false
            if (current.requestId != requestId) {
                return@synchronized false
            }
            _state.value = RaPendingModalState.Syncing(
                requestId = requestId,
                pending = pending,
                priority = current.exitContext.toPriority(),
            )
            true
        }
    }

    fun showResult(
        requestId: Long,
        result: RaPendingSyncResult,
        action: RaPendingSyncResultAction,
    ): Boolean {
        return synchronized(lock) {
            val current = _state.value as? RaPendingModalState.Syncing
                ?: return@synchronized false
            if (current.requestId != requestId) {
                return@synchronized false
            }
            _state.value = RaPendingModalState.Result(
                requestId = requestId,
                result = result,
                action = action,
                priority = current.priority,
            )
            true
        }
    }

    fun isCurrentExitPrompt(requestId: Long): Boolean {
        return synchronized(lock) {
            (_state.value as? RaPendingModalState.ExitPrompt)?.requestId == requestId
        }
    }

    fun consumeResultAction(
        requestId: Long,
        action: RaPendingSyncResultAction,
    ): Boolean {
        return synchronized(lock) {
            val current = _state.value as? RaPendingModalState.Result
                ?: return@synchronized false
            if (current.requestId != requestId || current.action != action) {
                return@synchronized false
            }
            _state.value = RaPendingModalState.None
            true
        }
    }

    fun clear(requestId: Long): Boolean {
        return synchronized(lock) {
            if (_state.value.requestIdOrNull() != requestId) {
                return@synchronized false
            }
            _state.value = RaPendingModalState.None
            true
        }
    }

    fun reset() {
        synchronized(lock) {
            _state.value = RaPendingModalState.None
        }
    }

    fun blocksLifecycleResume(): Boolean = _state.value != RaPendingModalState.None

    private fun currentPriorityLocked(): RaPendingModalPriority? {
        return when (val current = _state.value) {
            RaPendingModalState.None -> null
            is RaPendingModalState.ExitPrompt -> current.exitContext.toPriority()
            is RaPendingModalState.Syncing -> current.priority
            is RaPendingModalState.Result -> current.priority
        }
    }

    private fun nextIdLocked(): Long {
        while (true) {
            val current = nextRequestId.get()
            val requestId = current.takeIf { it > 0L } ?: 1L
            val next = if (requestId == Long.MAX_VALUE) 1L else requestId + 1L
            if (nextRequestId.compareAndSet(current, next)) {
                return requestId
            }
        }
    }
}

class RaSessionStopGate {
    private val terminalStopObserved = AtomicBoolean(false)

    fun observeTerminalStop() {
        terminalStopObserved.set(true)
    }

    fun resolve(requested: RaPendingExitContext): RaPendingExitContext {
        return if (terminalStopObserved.get()) {
            RaPendingExitContext.TERMINAL_STOP
        } else {
            requested
        }
    }

    fun canResume(): Boolean = !terminalStopObserved.get()

    fun reset() {
        terminalStopObserved.set(false)
    }
}

private fun RaPendingExitContext.toPriority(): RaPendingModalPriority {
    return when (this) {
        RaPendingExitContext.RESUMABLE_SESSION -> RaPendingModalPriority.RESUMABLE_EXIT
        RaPendingExitContext.TERMINAL_STOP -> RaPendingModalPriority.TERMINAL_EXIT
    }
}

private fun RaPendingModalState.requestIdOrNull(): Long? {
    return when (this) {
        RaPendingModalState.None -> null
        is RaPendingModalState.ExitPrompt -> requestId
        is RaPendingModalState.Syncing -> requestId
        is RaPendingModalState.Result -> requestId
    }
}
