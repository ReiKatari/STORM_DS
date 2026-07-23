package me.magnum.melonds.domain.model.retroachievements

enum class RaNativePendingSubmissionType(val wireValue: Int) {
    ACHIEVEMENT(1),
    LEADERBOARD(2);

    companion object {
        fun fromWireValue(value: Int): RaNativePendingSubmissionType? {
            return entries.firstOrNull { it.wireValue == value }
        }
    }
}

enum class RaNativePendingSubmissionResolution(val wireValue: Int) {
    ACCEPTED(1),
    ALREADY_ACCEPTED(2),
    PERMANENT_FAILURE(3),
    RETRYABLE_FAILURE(4);

    companion object {
        fun fromWireValue(value: Int): RaNativePendingSubmissionResolution? {
            return entries.firstOrNull { it.wireValue == value }
        }
    }
}

data class RaNativePendingRetryResolution(
    val nativeSubmissionId: Long,
    val submissionType: RaNativePendingSubmissionType,
    val resolution: RaNativePendingSubmissionResolution,
    val resultCode: Int,
)

data class RaNativePendingRetryResult(
    val submissionSessionId: Long,
    val forcedRetryCount: Int,
    val resolutions: List<RaNativePendingRetryResolution>,
    val transportFailure: Boolean = false,
)
