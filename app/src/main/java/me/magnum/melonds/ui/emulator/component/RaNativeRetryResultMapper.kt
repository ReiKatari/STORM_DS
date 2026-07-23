package me.magnum.melonds.ui.emulator.component

import me.magnum.melonds.domain.model.retroachievements.RaNativePendingRetryResult
import me.magnum.melonds.domain.model.retroachievements.RaNativePendingSubmissionResolution
import me.magnum.melonds.domain.model.retroachievements.RaNativePendingSubmissionType
import me.magnum.melonds.domain.model.retroachievements.RaPendingSubmissionType

object RaNativeRetryResultMapper {
    fun map(
        nativeResult: RaNativePendingRetryResult,
        expectedSessionId: Long,
        expectedTypesByNativeId: Map<Long, RaPendingSubmissionType>,
    ): NativeRaRetryOutcome {
        val accepted = linkedSetOf<Long>()
        val alreadyAccepted = linkedSetOf<Long>()
        val retryableFailures = linkedSetOf<Long>()
        val permanentFailures = linkedSetOf<Long>()
        val seenNativeIds = mutableSetOf<Long>()
        var invalidResolution =
            nativeResult.transportFailure ||
                nativeResult.submissionSessionId != expectedSessionId

        nativeResult.resolutions.forEach { nativeResolution ->
            if (!seenNativeIds.add(nativeResolution.nativeSubmissionId)) {
                invalidResolution = true
                return@forEach
            }
            val expectedType = when (expectedTypesByNativeId[nativeResolution.nativeSubmissionId]) {
                RaPendingSubmissionType.ACHIEVEMENT -> RaNativePendingSubmissionType.ACHIEVEMENT
                RaPendingSubmissionType.LEADERBOARD -> RaNativePendingSubmissionType.LEADERBOARD
                null -> null
            }
            if (expectedType == null || expectedType != nativeResolution.submissionType) {
                invalidResolution = true
                return@forEach
            }

            when (nativeResolution.resolution) {
                RaNativePendingSubmissionResolution.ACCEPTED -> {
                    accepted += nativeResolution.nativeSubmissionId
                }
                RaNativePendingSubmissionResolution.ALREADY_ACCEPTED -> {
                    alreadyAccepted += nativeResolution.nativeSubmissionId
                }
                RaNativePendingSubmissionResolution.PERMANENT_FAILURE -> {
                    permanentFailures += nativeResolution.nativeSubmissionId
                }
                RaNativePendingSubmissionResolution.RETRYABLE_FAILURE -> {
                    retryableFailures += nativeResolution.nativeSubmissionId
                }
            }
        }

        val resolvedIds = accepted + alreadyAccepted + retryableFailures + permanentFailures
        if (expectedTypesByNativeId.keys.any { it !in resolvedIds }) {
            invalidResolution = true
        }

        if (invalidResolution) {
            return NativeRaRetryOutcome(transientFailure = true)
        }

        return NativeRaRetryOutcome(
            acceptedNativeSubmissionIds = accepted,
            alreadyAcceptedNativeSubmissionIds = alreadyAccepted,
            retryableFailureNativeSubmissionIds = retryableFailures,
            permanentFailureNativeSubmissionIds = permanentFailures,
            transientFailure = false,
        )
    }
}
