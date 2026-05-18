package me.magnum.melonds.impl.retroachievements.offline

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import me.magnum.rcheevosapi.RAApi
import me.magnum.rcheevosapi.exception.UnsuccessfulRequestException
import me.magnum.rcheevosapi.exception.UserNotAuthenticatedException
import me.magnum.rcheevosapi.model.RAAchievement
import me.magnum.rcheevosapi.model.RAGameId
import java.io.IOException
import kotlin.math.min
import kotlin.time.Duration.Companion.seconds

enum class SmartSyncSkipReason {
    MISSING_FROM_CURRENT_SET,
    DEFINITION_CHANGED,
    NOT_IN_PREFETCH_CACHE,
    SERVER_REJECTED,
}

data class SmartSyncSkippedAchievement(
    val achievementId: Long,
    val reason: SmartSyncSkipReason,
    val reasonDetail: String? = null,
)

data class SmartSyncResult(
    val submittedCount: Int,
    val skipped: List<SmartSyncSkippedAchievement>,
    val totalCount: Int,
) {
    val skippedCount: Int get() = skipped.size
}

class SmartSyncEngine(
    private val raApi: RAApi,
    private val ledgerRepository: OfflineLedgerRepository,
    private val prefetchCacheRepository: OfflinePrefetchCacheRepository,
) {

    private companion object {
        const val RA_TRACE_TAG = "RATrace"
    }

    suspend fun syncNow(userId: String, contentId: String): Result<SmartSyncResult> {
        return syncFiltered(userId = userId, contentId = contentId, modeFilter = null)
    }

    suspend fun syncSoftcoreNow(userId: String, contentId: String): Result<SmartSyncResult> {
        return syncFiltered(userId = userId, contentId = contentId, modeFilter = setOf(OfflineUnlockMode.SOFTCORE))
    }

    suspend fun syncHardcoreNow(userId: String, contentId: String): Result<SmartSyncResult> {
        return syncFiltered(userId = userId, contentId = contentId, modeFilter = setOf(OfflineUnlockMode.HARDCORE))
    }

    private suspend fun syncFiltered(
        userId: String,
        contentId: String,
        modeFilter: Set<OfflineUnlockMode>?,
    ): Result<SmartSyncResult> = withContext(Dispatchers.IO) {
        val filterTag = modeFilter?.joinToString(",") { it.name } ?: "ALL"
        logRaTrace("smart_sync_started", "filter" to filterTag, "content_id" to contentId)

        val ledgerStatus = ledgerRepository.getStatus(userId, contentId)
        if (ledgerStatus.integrity != OfflineLedgerIntegrity.OK) {
            logRaTrace(
                "smart_sync_failed",
                "filter" to filterTag,
                "reason" to "ledger_integrity_${ledgerStatus.integrity.name.lowercase()}",
            )
            return@withContext Result.failure(IllegalStateException("Ledger integrity is ${ledgerStatus.integrity}"))
        }

        val pending = ledgerStatus.pendingUnlocks.filter { unlock ->
            modeFilter?.contains(unlock.unlockMode) ?: true
        }
        if (pending.isEmpty()) {
            logRaTrace("smart_sync_no_pending", "filter" to filterTag)
            return@withContext Result.success(
                SmartSyncResult(
                    submittedCount = 0,
                    skipped = emptyList(),
                    totalCount = 0,
                )
            )
        }

        val cache = prefetchCacheRepository.readValid(userId, contentId)
        if (cache == null) {
            logRaTrace(
                "smart_sync_failed",
                "filter" to filterTag,
                "reason" to "prefetch_cache_missing",
                "pending" to pending.size,
            )
            return@withContext Result.failure(IllegalStateException("Prefetch cache missing"))
        }

        val cachedDefinitionById = cache.achievements.associate { it.id to it.memoryAddress }

        val currentGame = raApi.getGameAchievementSets(contentId).getOrElse { error ->
            logRaTrace(
                "smart_sync_failed",
                "filter" to filterTag,
                "reason" to "fetch_current_set_failed",
                "error" to (error.message ?: error.javaClass.simpleName),
            )
            return@withContext Result.failure(error)
        }

        if (currentGame.id.id != cache.gameId) {
            logRaTrace(
                "smart_sync_failed",
                "filter" to filterTag,
                "reason" to "game_id_mismatch",
                "expected" to cache.gameId,
                "actual" to currentGame.id.id,
            )
            return@withContext Result.failure(IllegalStateException("Game ID mismatch"))
        }

        val currentAchievementById = currentGame.sets
            .asSequence()
            .flatMap { it.achievements.asSequence() }
            .associateBy { it.id }

        val startSessionResult = raApi.startSession(
            gameId = RAGameId(cache.gameId),
            gameHash = contentId,
            forHardcoreMode = pending.any { it.unlockMode == OfflineUnlockMode.HARDCORE },
        )
        if (startSessionResult.isFailure) {
            val error = startSessionResult.exceptionOrNull()
            logRaTrace(
                "smart_sync_failed",
                "filter" to filterTag,
                "reason" to "start_session_failed",
                "error" to (error?.message ?: error?.javaClass?.simpleName ?: "unknown"),
            )
            return@withContext Result.failure(error ?: IllegalStateException("Failed to start RA session"))
        }

        val plan = SmartSyncPlanner.plan(
            pendingUnlocks = pending,
            sessions = ledgerStatus.sessions,
        )

        val skipped = mutableListOf<SmartSyncSkippedAchievement>()
        var submitted = 0
        for (item in plan) {
            delay(item.delayBeforeMs)
            val unlock = item.unlock

            val cachedDefinition = cachedDefinitionById[unlock.achievementId]
            val currentAchievement = currentAchievementById[unlock.achievementId]
            val currentDefinition = currentAchievement?.memoryAddress

            val skipReason = when {
                cachedDefinition == null -> SmartSyncSkipReason.NOT_IN_PREFETCH_CACHE
                currentDefinition == null -> SmartSyncSkipReason.MISSING_FROM_CURRENT_SET
                currentDefinition != cachedDefinition -> SmartSyncSkipReason.DEFINITION_CHANGED
                currentAchievement.type == RAAchievement.Type.UNOFFICIAL -> SmartSyncSkipReason.SERVER_REJECTED
                else -> null
            }

            if (skipReason != null) {
                val reasonDetail = if (skipReason == SmartSyncSkipReason.SERVER_REJECTED) {
                    "unofficial achievement in current RA set"
                } else {
                    null
                }
                logRaTrace(
                    "smart_sync_unlock_skipped",
                    "achievement_id" to unlock.achievementId,
                    "reason" to skipReason.name,
                    "detail" to reasonDetail,
                    "hardcore" to (unlock.unlockMode == OfflineUnlockMode.HARDCORE),
                )
                skipped += SmartSyncSkippedAchievement(
                    achievementId = unlock.achievementId,
                    reason = skipReason,
                    reasonDetail = reasonDetail,
                )
            } else {
                val awardResult = retryingAward(
                    achievementId = unlock.achievementId,
                    isHardcore = unlock.unlockMode == OfflineUnlockMode.HARDCORE,
                )
                if (awardResult.isFailure) {
                    val error = awardResult.exceptionOrNull()
                    if (isPermanentSmartSyncAwardRejection(error)) {
                        val reasonDetail = smartSyncAwardRejectionReason(error)
                        logRaTrace(
                            "smart_sync_unlock_skipped",
                            "achievement_id" to unlock.achievementId,
                            "reason" to SmartSyncSkipReason.SERVER_REJECTED.name,
                            "detail" to reasonDetail,
                            "hardcore" to (unlock.unlockMode == OfflineUnlockMode.HARDCORE),
                            "error" to (error?.message ?: error?.javaClass?.simpleName ?: "unknown"),
                        )
                        skipped += SmartSyncSkippedAchievement(
                            achievementId = unlock.achievementId,
                            reason = SmartSyncSkipReason.SERVER_REJECTED,
                            reasonDetail = reasonDetail,
                        )
                    } else {
                        logRaTrace(
                            "smart_sync_failed",
                            "filter" to filterTag,
                            "reason" to "award_failed",
                            "achievement_id" to unlock.achievementId,
                            "error" to (error?.message ?: error?.javaClass?.simpleName ?: "unknown"),
                            "submitted_so_far" to submitted,
                        )
                        return@withContext Result.failure(error ?: IllegalStateException("Award failed"))
                    }
                } else {
                    logRaTrace(
                        "smart_sync_unlock_submitted",
                        "achievement_id" to unlock.achievementId,
                        "hardcore" to (unlock.unlockMode == OfflineUnlockMode.HARDCORE),
                    )
                    submitted++
                }
            }

            ledgerRepository.appendAchievementAck(
                userId = userId,
                contentId = contentId,
                gameId = unlock.gameId,
                achievementId = unlock.achievementId,
                isHardcore = unlock.unlockMode == OfflineUnlockMode.HARDCORE,
                ackedSeq = unlock.seq,
                unlockMode = unlock.unlockMode,
                offlineType = unlock.offlineType,
            ).getOrElse { e ->
                logRaTrace(
                    "smart_sync_failed",
                    "filter" to filterTag,
                    "reason" to "ledger_ack_failed",
                    "achievement_id" to unlock.achievementId,
                    "error" to (e.message ?: e.javaClass.simpleName),
                )
                return@withContext Result.failure(e)
            }
        }

        logRaTrace(
            "smart_sync_completed",
            "filter" to filterTag,
            "submitted" to submitted,
            "skipped" to skipped.size,
            "total" to pending.size,
        )

        Result.success(
            SmartSyncResult(
                submittedCount = submitted,
                skipped = skipped,
                totalCount = pending.size,
            )
        )
    }

    private suspend fun retryingAward(achievementId: Long, isHardcore: Boolean): Result<Unit> {
        var attempt = 0
        var backoffMs = 2000L

        while (true) {
            attempt++
            val result = raApi.awardAchievement(achievementId, isHardcore)
            result.onSuccess {
                // OK (awarded) OR already unlocked (awarded=false) -> consider acked either way.
                return Result.success(Unit)
            }

            val exception = result.exceptionOrNull() ?: Exception("Unknown error")

            if (exception is UnsuccessfulRequestException && exception.message?.contains("User already has", ignoreCase = true) == true) {
                return Result.success(Unit)
            }

            if (exception is UserNotAuthenticatedException) {
                logRaTrace(
                    "smart_sync_award_unauthenticated",
                    "achievement_id" to achievementId,
                    "hardcore" to isHardcore,
                )
                return Result.failure(exception)
            }

            if (exception is IOException || exception.cause is IOException) {
                if (attempt >= 5) {
                    logRaTrace(
                        "smart_sync_award_io_exhausted",
                        "achievement_id" to achievementId,
                        "hardcore" to isHardcore,
                        "attempts" to attempt,
                    )
                    return Result.failure(exception)
                }
                logRaTrace(
                    "smart_sync_award_io_retry",
                    "achievement_id" to achievementId,
                    "attempt" to attempt,
                    "backoff_ms" to backoffMs,
                )
                delay(backoffMs)
                backoffMs = min(backoffMs * 2, 60.seconds.inWholeMilliseconds)
                continue
            }

            logRaTrace(
                "smart_sync_award_failed",
                "achievement_id" to achievementId,
                "hardcore" to isHardcore,
                "error" to (exception.message ?: exception.javaClass.simpleName),
            )
            return Result.failure(exception)
        }
    }

    private fun logRaTrace(eventType: String, vararg fields: Pair<String, Any?>) {
        val message = buildString {
            append("event_type=").append(eventType)
            append(" submit_path=").append("smart_sync_engine")
            fields.forEach { (key, value) ->
                if (value != null) {
                    append(' ')
                    append(key)
                    append('=')
                    append(value.toString().replace(' ', '_'))
                }
            }
        }
        Log.i(RA_TRACE_TAG, message)
    }
}

internal fun isPermanentSmartSyncAwardRejection(error: Throwable?): Boolean {
    if (error !is UnsuccessfulRequestException) return false

    val message = error.message ?: return false
    return message.contains("Unpromoted_achievements_cannot_be_unlocked", ignoreCase = true) ||
        (message.contains("\"Code\":\"invalid_state\"", ignoreCase = true) &&
            message.contains("Unpromoted", ignoreCase = true))
}

internal fun smartSyncAwardRejectionReason(error: Throwable?): String? {
    if (error !is UnsuccessfulRequestException) return null

    val message = error.message ?: return null
    val raError = Regex(""""Error"\s*:\s*"([^"]+)"""")
        .find(message)
        ?.groupValues
        ?.getOrNull(1)
        ?.replace('_', ' ')
        ?.trim()
        ?.takeIf { it.isNotBlank() }

    return raError ?: message.takeIf { isPermanentSmartSyncAwardRejection(error) }
}
