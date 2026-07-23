package me.magnum.melonds.ui.emulator.component

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import me.magnum.melonds.domain.model.retroachievements.PendingRaSubmission
import me.magnum.melonds.domain.model.retroachievements.PendingRaSubmissionRecord
import me.magnum.melonds.domain.model.retroachievements.PendingRaSubmissionSnapshot
import me.magnum.melonds.domain.model.retroachievements.PendingRaSubmissionStatus
import me.magnum.melonds.domain.model.retroachievements.RaPendingCounts
import me.magnum.melonds.domain.model.retroachievements.RaSubmissionContext

class PendingRaSubmissionStore(
    val context: RaSubmissionContext,
) {
    enum class AddResult {
        ADDED,
        DUPLICATE_SUBMISSION_ID,
        DUPLICATE_NATIVE_SUBMISSION_ID,
        DUPLICATE_LEADERBOARD_ATTEMPT_ID,
        CONTEXT_MISMATCH,
        CLOSED,
    }

    private val mutex = Mutex()
    private val recordsBySubmissionId = linkedMapOf<String, PendingRaSubmissionRecord>()
    private val seenSubmissionIds = mutableSetOf<String>()
    private val seenNativeSubmissionIds = mutableSetOf<Long>()
    private val seenLeaderboardAttemptIds = mutableSetOf<Long>()
    private val mutableSnapshot = MutableStateFlow(PendingRaSubmissionSnapshot.empty(context))
    private var closed = false

    val snapshot: StateFlow<PendingRaSubmissionSnapshot> = mutableSnapshot.asStateFlow()

    suspend fun add(submission: PendingRaSubmission): AddResult = mutex.withLock {
        when {
            closed -> AddResult.CLOSED
            submission.context != context -> AddResult.CONTEXT_MISMATCH
            submission.submissionId in seenSubmissionIds -> AddResult.DUPLICATE_SUBMISSION_ID
            submission.nativeSubmissionId in seenNativeSubmissionIds -> AddResult.DUPLICATE_NATIVE_SUBMISSION_ID
            submission is PendingRaSubmission.LeaderboardEntry &&
                submission.attemptId in seenLeaderboardAttemptIds -> AddResult.DUPLICATE_LEADERBOARD_ATTEMPT_ID
            else -> {
                seenSubmissionIds += submission.submissionId
                seenNativeSubmissionIds += submission.nativeSubmissionId
                if (submission is PendingRaSubmission.LeaderboardEntry) {
                    seenLeaderboardAttemptIds += submission.attemptId
                }
                recordsBySubmissionId[submission.submissionId] = PendingRaSubmissionRecord(
                    submission = submission,
                    status = PendingRaSubmissionStatus.RETRYABLE,
                )
                publishLocked()
                AddResult.ADDED
            }
        }
    }

    suspend fun accept(submissionId: String): Boolean = mutex.withLock {
        val removed = recordsBySubmissionId.remove(submissionId) != null
        if (removed) publishLocked()
        removed
    }

    suspend fun acceptByNativeSubmissionId(nativeSubmissionId: Long): Boolean = mutex.withLock {
        val submissionId = submissionIdForNativeIdLocked(nativeSubmissionId) ?: return@withLock false
        recordsBySubmissionId.remove(submissionId)
        publishLocked()
        true
    }

    suspend fun markPermanentFailure(submissionId: String): Boolean = mutex.withLock {
        updateStatusLocked(submissionId, PendingRaSubmissionStatus.PERMANENT_FAILURE)
    }

    suspend fun markPermanentFailureByNativeSubmissionId(nativeSubmissionId: Long): Boolean = mutex.withLock {
        val submissionId = submissionIdForNativeIdLocked(nativeSubmissionId) ?: return@withLock false
        updateStatusLocked(submissionId, PendingRaSubmissionStatus.PERMANENT_FAILURE)
    }

    suspend fun markRetryable(submissionId: String): Boolean = mutex.withLock {
        updateStatusLocked(submissionId, PendingRaSubmissionStatus.RETRYABLE)
    }

    suspend fun markRetryableByNativeSubmissionId(nativeSubmissionId: Long): Boolean = mutex.withLock {
        val submissionId = submissionIdForNativeIdLocked(nativeSubmissionId) ?: return@withLock false
        updateStatusLocked(submissionId, PendingRaSubmissionStatus.RETRYABLE)
    }

    suspend fun applyNativeOutcome(
        acceptedNativeSubmissionIds: Set<Long>,
        alreadyAcceptedNativeSubmissionIds: Set<Long>,
        retryableFailureNativeSubmissionIds: Set<Long>,
        permanentFailureNativeSubmissionIds: Set<Long>,
    ) = mutex.withLock {
        val resolvedNativeIds = acceptedNativeSubmissionIds + alreadyAcceptedNativeSubmissionIds
        if (resolvedNativeIds.isNotEmpty()) {
            recordsBySubmissionId.entries.removeAll { it.value.submission.nativeSubmissionId in resolvedNativeIds }
        }

        recordsBySubmissionId.replaceAll { _, record ->
            when (record.submission.nativeSubmissionId) {
                in permanentFailureNativeSubmissionIds -> record.copy(
                    status = PendingRaSubmissionStatus.PERMANENT_FAILURE,
                )
                in retryableFailureNativeSubmissionIds -> {
                    if (record.status == PendingRaSubmissionStatus.PERMANENT_FAILURE) {
                        record
                    } else {
                        record.copy(status = PendingRaSubmissionStatus.RETRYABLE)
                    }
                }
                else -> record
            }
        }
        publishLocked()
    }

    suspend fun discardCurrentSession(requestedContext: RaSubmissionContext = context): Int = mutex.withLock {
        if (closed || requestedContext != context) {
            return@withLock 0
        }
        val discarded = recordsBySubmissionId.size
        recordsBySubmissionId.clear()
        publishLocked()
        discarded
    }

    suspend fun discardByNativeSubmissionIds(
        nativeSubmissionIds: Set<Long>,
        requestedContext: RaSubmissionContext = context,
    ): Int = mutex.withLock {
        if (closed || requestedContext != context || nativeSubmissionIds.isEmpty()) {
            return@withLock 0
        }
        val matchingSubmissionIds = recordsBySubmissionId
            .filterValues { it.submission.nativeSubmissionId in nativeSubmissionIds }
            .keys
        if (matchingSubmissionIds.size != nativeSubmissionIds.size) {
            return@withLock 0
        }
        matchingSubmissionIds.forEach(recordsBySubmissionId::remove)
        publishLocked()
        matchingSubmissionIds.size
    }

    suspend fun cleanup(): Int = mutex.withLock {
        val discarded = recordsBySubmissionId.size
        recordsBySubmissionId.clear()
        seenSubmissionIds.clear()
        seenNativeSubmissionIds.clear()
        seenLeaderboardAttemptIds.clear()
        closed = true
        publishLocked()
        discarded
    }

    private fun updateStatusLocked(
        submissionId: String,
        status: PendingRaSubmissionStatus,
    ): Boolean {
        val current = recordsBySubmissionId[submissionId] ?: return false
        if (current.status == status) return true
        if (
            current.status == PendingRaSubmissionStatus.PERMANENT_FAILURE &&
            status == PendingRaSubmissionStatus.RETRYABLE
        ) {
            return false
        }
        recordsBySubmissionId[submissionId] = current.copy(status = status)
        publishLocked()
        return true
    }

    private fun submissionIdForNativeIdLocked(nativeSubmissionId: Long): String? {
        return recordsBySubmissionId.entries
            .firstOrNull { it.value.submission.nativeSubmissionId == nativeSubmissionId }
            ?.key
    }

    private fun publishLocked() {
        val records = recordsBySubmissionId.values.sortedWith(
            compareBy<PendingRaSubmissionRecord>(
                { it.submission.sequence },
                { it.submission.createdAtEpochMs },
                { it.submission.submissionId },
            ),
        )
        mutableSnapshot.value = PendingRaSubmissionSnapshot(
            context = context,
            records = records,
            counts = RaPendingCounts.from(records),
            closed = closed,
        )
    }
}
