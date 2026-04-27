package me.magnum.melonds.ui.emulator.component

import android.util.Log
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import me.magnum.melonds.domain.repositories.RetroAchievementsRepository
import me.magnum.rcheevosapi.model.RAAchievement

class HardcoreSubmissionQueue(
    private val retroAchievementsRepository: RetroAchievementsRepository,
) {
    data class DrainResult(
        val submittedCount: Int,
        val remainingCount: Int,
    ) {
        val attemptedCount: Int get() = submittedCount + remainingCount
    }

    private val mutex = Mutex()
    private val pending = linkedMapOf<Long, RAAchievement>()

    suspend fun add(achievement: RAAchievement) {
        mutex.withLock {
            pending[achievement.id] = achievement
        }
        logRaTrace("hardcore_queue_add", "achievement_id" to achievement.id, "size" to currentSize())
    }

    suspend fun pendingCount(): Int = mutex.withLock { pending.size }

    suspend fun discardAll(): Int {
        return mutex.withLock {
            val cleared = pending.size
            pending.clear()
            cleared
        }.also { logRaTrace("hardcore_queue_discarded", "count" to it) }
    }

    suspend fun drain(): DrainResult {
        val toSubmit = mutex.withLock { pending.values.toList() }
        if (toSubmit.isEmpty()) {
            return DrainResult(submittedCount = 0, remainingCount = 0)
        }

        logRaTrace("hardcore_queue_drain_start", "size" to toSubmit.size)
        var submitted = 0
        for (achievement in toSubmit) {
            val result = retroAchievementsRepository.awardAchievement(achievement, forHardcoreMode = true)
            if (result.isSuccess) {
                mutex.withLock { pending.remove(achievement.id) }
                submitted++
                logRaTrace("hardcore_queue_drain_submitted", "achievement_id" to achievement.id)
            } else {
                logRaTrace(
                    "hardcore_queue_drain_failed",
                    "achievement_id" to achievement.id,
                    "error" to (result.exceptionOrNull()?.message ?: "unknown"),
                )
            }
        }
        val remaining = mutex.withLock { pending.size }
        logRaTrace("hardcore_queue_drain_complete", "submitted" to submitted, "remaining" to remaining)
        return DrainResult(submittedCount = submitted, remainingCount = remaining)
    }

    private suspend fun currentSize(): Int = mutex.withLock { pending.size }

    private fun logRaTrace(eventType: String, vararg fields: Pair<String, Any?>) {
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
}
