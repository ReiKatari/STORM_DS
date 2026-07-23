package me.magnum.melonds.ui.emulator.component

import android.util.Log
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import me.magnum.rcheevosapi.model.RAAchievement
import me.magnum.rcheevosapi.model.RAAwardAchievementResponse
import me.magnum.rcheevosapi.model.RAUserAuth

class HardcoreSubmissionQueue(
    private val submitAchievement: suspend (
        RAAchievement,
        RAUserAuth.Authenticated,
    ) -> Result<RAAwardAchievementResponse>,
    private val canSubmitForActiveIdentity: suspend (RAUserAuth.Authenticated) -> Boolean = { true },
    private val traceLogger: (String, List<Pair<String, Any?>>) -> Unit =
        ::logHardcoreSubmissionQueueTrace,
) {
    data class DrainResult(
        val submittedCount: Int,
        val remainingCount: Int,
    ) {
        val attemptedCount: Int get() = submittedCount + remainingCount
    }

    private data class QueuedAchievement(
        val achievement: RAAchievement,
        val authentication: RAUserAuth.Authenticated,
    )

    private val operationMutex = Mutex()
    private val pendingMutex = Mutex()
    private val pending = linkedMapOf<Long, QueuedAchievement>()
    private var activeSessionId: String? = null
    private var activeAuthentication: RAUserAuth.Authenticated? = null
    private var closed = true

    suspend fun beginSession(
        sessionId: String,
        authentication: RAUserAuth.Authenticated,
    ): Boolean {
        if (sessionId.isBlank()) {
            return false
        }
        return operationMutex.withLock {
            if (
                !closed &&
                activeSessionId == sessionId &&
                activeAuthentication == authentication
            ) {
                return@withLock true
            }
            pendingMutex.withLock {
                if (pending.isNotEmpty()) {
                    return@withLock false
                }
                activeSessionId = sessionId
                activeAuthentication = authentication
                closed = false
                true
            }
        }
    }

    suspend fun add(
        sessionId: String,
        achievement: RAAchievement,
        authentication: RAUserAuth.Authenticated,
    ): Boolean {
        val added = operationMutex.withLock {
            if (
                closed ||
                activeSessionId != sessionId ||
                activeAuthentication != authentication
            ) {
                return@withLock false
            }
            pendingMutex.withLock {
                pending[achievement.id] = QueuedAchievement(achievement, authentication)
                true
            }
        }
        logRaTrace(
            if (added) "hardcore_queue_add" else "hardcore_queue_add_rejected",
            "achievement_id" to achievement.id,
            "size" to currentSize(),
        )
        return added
    }

    suspend fun pendingCount(): Int = pendingMutex.withLock { pending.size }

    suspend fun discardAll(sessionId: String): Int {
        return operationMutex.withLock {
            if (activeSessionId != sessionId) {
                return@withLock 0
            }
            closed = true
            activeSessionId = null
            activeAuthentication = null
            pendingMutex.withLock {
                val cleared = pending.size
                pending.clear()
                cleared
            }
        }.also { logRaTrace("hardcore_queue_discarded", "count" to it) }
    }

    suspend fun drain(sessionId: String): DrainResult {
        return operationMutex.withLock {
            if (closed || activeSessionId != sessionId) {
                return@withLock DrainResult(submittedCount = 0, remainingCount = currentSize())
            }
            val toSubmit = pendingMutex.withLock { pending.values.toList() }
            if (toSubmit.isEmpty()) {
                return@withLock DrainResult(submittedCount = 0, remainingCount = 0)
            }

            logRaTrace("hardcore_queue_drain_start", "size" to toSubmit.size)
            var submitted = 0
            for (queued in toSubmit) {
                if (
                    queued.authentication != activeAuthentication ||
                    !canSubmitForActiveIdentity(queued.authentication)
                ) {
                    logRaTrace(
                        "hardcore_queue_drain_blocked",
                        "reason" to "identity_mismatch",
                        "remaining" to currentSize(),
                    )
                    break
                }
                val result = submitAchievement(
                    queued.achievement,
                    queued.authentication,
                )
                if (result.isSuccess) {
                    pendingMutex.withLock {
                        pending.remove(queued.achievement.id, queued)
                    }
                    submitted++
                    logRaTrace("hardcore_queue_drain_submitted", "achievement_id" to queued.achievement.id)
                } else {
                    logRaTrace(
                        "hardcore_queue_drain_failed",
                        "achievement_id" to queued.achievement.id,
                        "error" to (result.exceptionOrNull()?.javaClass?.simpleName ?: "unknown"),
                    )
                }
            }
            val remaining = currentSize()
            logRaTrace("hardcore_queue_drain_complete", "submitted" to submitted, "remaining" to remaining)
            DrainResult(submittedCount = submitted, remainingCount = remaining)
        }
    }

    private suspend fun currentSize(): Int = pendingMutex.withLock { pending.size }

    private fun logRaTrace(eventType: String, vararg fields: Pair<String, Any?>) {
        traceLogger(eventType, fields.toList())
    }
}

private fun logHardcoreSubmissionQueueTrace(
    eventType: String,
    fields: List<Pair<String, Any?>>,
) {
    val message = buildString {
        append("event_type=").append(eventType)
        append(" submit_path=hardcore_queue")
        fields.forEach { (key, value) ->
            if (value != null) {
                append(' ')
                append(key)
                append('=')
                append(value.toString().replace(' ', '_'))
            }
        }
    }
    Log.i("RATrace", message)
}
