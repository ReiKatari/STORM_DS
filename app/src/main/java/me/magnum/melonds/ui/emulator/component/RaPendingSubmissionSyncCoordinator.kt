package me.magnum.melonds.ui.emulator.component

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import me.magnum.melonds.domain.model.retroachievements.PendingRaSubmission
import me.magnum.melonds.domain.model.retroachievements.PendingRaSubmissionStatus
import me.magnum.melonds.domain.model.retroachievements.RaPendingCounts
import me.magnum.melonds.domain.model.retroachievements.RaPendingSubmissionType

enum class RaPendingSyncSource {
    RUNTIME_RECONNECTED,
    PAUSE_MENU,
    EXIT_DIALOG,
    BEFORE_ONLINE_SUBMISSION,
}

data class NativeRaRetryOutcome(
    val acceptedNativeSubmissionIds: Set<Long> = emptySet(),
    val alreadyAcceptedNativeSubmissionIds: Set<Long> = emptySet(),
    val retryableFailureNativeSubmissionIds: Set<Long> = emptySet(),
    val permanentFailureNativeSubmissionIds: Set<Long> = emptySet(),
    val transientFailure: Boolean = false,
)

data class ExpectedNativeRaSubmission(
    val nativeSubmissionId: Long,
    val type: RaPendingSubmissionType,
)

fun interface NativeRaRetryOwner {
    suspend fun retryPendingSubmissions(expectedSubmissions: List<ExpectedNativeRaSubmission>): NativeRaRetryOutcome
}

data class RaPendingSyncResult(
    val source: RaPendingSyncSource,
    val before: RaPendingCounts,
    val submittedAchievements: Int,
    val submittedLeaderboardEntries: Int,
    val alreadyAccepted: Int,
    val failedAchievements: Int,
    val failedLeaderboardEntries: Int,
    val remaining: RaPendingCounts,
    val transientFailure: Boolean,
) {
    val submitted: Int get() = submittedAchievements + submittedLeaderboardEntries
    val failed: Int get() = failedAchievements + failedLeaderboardEntries
}

class RaPendingSubmissionSyncCoordinator(
    private val store: PendingRaSubmissionStore,
    private val operationScope: CoroutineScope,
    private val retryOwner: NativeRaRetryOwner,
) {
    private val flightLock = Any()
    private var activeFlight: CompletableDeferred<RaPendingSyncResult>? = null
    private var activeFlightJob: Job? = null
    private var closed = false

    suspend fun sync(source: RaPendingSyncSource): RaPendingSyncResult {
        var jobToStart: Job? = null
        val flight = synchronized(flightLock) {
            if (closed) {
                throw CancellationException("Pending submission coordinator is closed")
            }
            activeFlight ?: CompletableDeferred<RaPendingSyncResult>().also { newFlight ->
                activeFlight = newFlight
                val newJob = operationScope.launch(start = CoroutineStart.LAZY) {
                    try {
                        newFlight.complete(executeSync(source))
                    } catch (cancellation: CancellationException) {
                        newFlight.cancel(cancellation)
                        throw cancellation
                    } catch (throwable: Throwable) {
                        newFlight.completeExceptionally(throwable)
                    }
                }
                activeFlightJob = newJob
                newJob.invokeOnCompletion { cause ->
                    if (!newFlight.isCompleted) {
                        when (cause) {
                            is CancellationException -> newFlight.cancel(cause)
                            null -> newFlight.cancel(
                                CancellationException(
                                    "Pending submission sync ended without a result",
                                ),
                            )
                            else -> newFlight.completeExceptionally(cause)
                        }
                    }
                    synchronized(flightLock) {
                        if (activeFlight === newFlight) {
                            activeFlight = null
                            activeFlightJob = null
                        }
                    }
                }
                jobToStart = newJob
            }
        }
        jobToStart?.start()

        return flight.await()
    }

    fun close() {
        val flight: CompletableDeferred<RaPendingSyncResult>?
        val job: Job?
        synchronized(flightLock) {
            if (closed) {
                return
            }
            closed = true
            flight = activeFlight
            job = activeFlightJob
            activeFlight = null
            activeFlightJob = null
        }
        val cancellation = CancellationException("Pending submission coordinator closed")
        flight?.cancel(cancellation)
        job?.cancel(cancellation)
    }

    private suspend fun executeSync(source: RaPendingSyncSource): RaPendingSyncResult {
        val beforeSnapshot = store.snapshot.value
        val retryableRecords = beforeSnapshot.records.filter {
            it.status == PendingRaSubmissionStatus.RETRYABLE
        }
        if (retryableRecords.isEmpty()) {
            return RaPendingSyncResult(
                source = source,
                before = beforeSnapshot.counts,
                submittedAchievements = 0,
                submittedLeaderboardEntries = 0,
                alreadyAccepted = 0,
                failedAchievements = 0,
                failedLeaderboardEntries = 0,
                remaining = beforeSnapshot.counts,
                transientFailure = false,
            )
        }

        val outcome = try {
            retryOwner.retryPendingSubmissions(
                retryableRecords.map {
                    ExpectedNativeRaSubmission(
                        nativeSubmissionId = it.submission.nativeSubmissionId,
                        type = it.submission.type,
                    )
                },
            )
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (_: Throwable) {
            NativeRaRetryOutcome(transientFailure = true)
        }

        val retryableNativeIds = retryableRecords
            .mapTo(linkedSetOf()) { it.submission.nativeSubmissionId }
        val outcomeSets = listOf(
            outcome.acceptedNativeSubmissionIds,
            outcome.alreadyAcceptedNativeSubmissionIds,
            outcome.retryableFailureNativeSubmissionIds,
            outcome.permanentFailureNativeSubmissionIds,
        )
        val reportedIds = outcomeSets.flatten()
        val structurallyInvalid =
            reportedIds.any { it !in retryableNativeIds } ||
                reportedIds.size != reportedIds.toSet().size
        val safeOutcome = if (structurallyInvalid) {
            NativeRaRetryOutcome(transientFailure = true)
        } else {
            outcome
        }

        val accepted = safeOutcome.acceptedNativeSubmissionIds
            .intersect(retryableNativeIds)
        val alreadyAccepted = safeOutcome.alreadyAcceptedNativeSubmissionIds
            .intersect(retryableNativeIds)
            .minus(accepted)
        val permanentFailures = safeOutcome.permanentFailureNativeSubmissionIds
            .intersect(retryableNativeIds)
            .minus(accepted)
            .minus(alreadyAccepted)
        val retryableFailures = safeOutcome.retryableFailureNativeSubmissionIds
            .intersect(retryableNativeIds)
            .minus(accepted)
            .minus(alreadyAccepted)
            .minus(permanentFailures)

        store.applyNativeOutcome(
            acceptedNativeSubmissionIds = accepted,
            alreadyAcceptedNativeSubmissionIds = alreadyAccepted,
            retryableFailureNativeSubmissionIds = retryableFailures,
            permanentFailureNativeSubmissionIds = permanentFailures,
        )

        val resolvedNativeIds = accepted + alreadyAccepted + retryableFailures + permanentFailures
        val hasMissingOutcome = retryableNativeIds.any { it !in resolvedNativeIds }
        val transientFailure = safeOutcome.transientFailure || hasMissingOutcome
        val failedNativeIds = if (transientFailure) {
            retryableNativeIds.minus(accepted).minus(alreadyAccepted)
        } else {
            retryableFailures + permanentFailures
        }
        val submissionsByNativeId = retryableRecords.associateBy {
            it.submission.nativeSubmissionId
        }
        val submittedAchievements = accepted.count {
            submissionsByNativeId[it]?.submission is PendingRaSubmission.AchievementUnlock
        }
        val submittedLeaderboardEntries = accepted.count {
            submissionsByNativeId[it]?.submission is PendingRaSubmission.LeaderboardEntry
        }
        val failedAchievements = failedNativeIds.count {
            submissionsByNativeId[it]?.submission is PendingRaSubmission.AchievementUnlock
        }
        val failedLeaderboardEntries = failedNativeIds.count {
            submissionsByNativeId[it]?.submission is PendingRaSubmission.LeaderboardEntry
        }

        return RaPendingSyncResult(
            source = source,
            before = beforeSnapshot.counts,
            submittedAchievements = submittedAchievements,
            submittedLeaderboardEntries = submittedLeaderboardEntries,
            alreadyAccepted = alreadyAccepted.size,
            failedAchievements = failedAchievements,
            failedLeaderboardEntries = failedLeaderboardEntries,
            remaining = store.snapshot.value.counts,
            transientFailure = transientFailure,
        )
    }
}
