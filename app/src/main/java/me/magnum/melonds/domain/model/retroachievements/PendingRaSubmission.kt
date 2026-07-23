package me.magnum.melonds.domain.model.retroachievements

data class RaSubmissionContext(
    val userId: String,
    val gameId: Long,
    val contentHash: String,
    val sessionId: String,
    val nativeSessionId: Long,
)

enum class RaPendingSubmissionType {
    ACHIEVEMENT,
    LEADERBOARD,
}

sealed interface PendingRaSubmission {
    val type: RaPendingSubmissionType
    val context: RaSubmissionContext
    val submissionId: String
    val nativeSubmissionId: Long
    val sequence: Long
    val createdAtEpochMs: Long
    val hardcore: Boolean

    data class AchievementUnlock(
        override val context: RaSubmissionContext,
        override val submissionId: String,
        override val nativeSubmissionId: Long,
        override val sequence: Long,
        override val createdAtEpochMs: Long,
        override val hardcore: Boolean,
        val achievementId: Long,
    ) : PendingRaSubmission {
        override val type = RaPendingSubmissionType.ACHIEVEMENT
    }

    data class LeaderboardEntry(
        override val context: RaSubmissionContext,
        override val submissionId: String,
        override val nativeSubmissionId: Long,
        override val sequence: Long,
        override val createdAtEpochMs: Long,
        override val hardcore: Boolean,
        val leaderboardId: Long,
        val attemptId: Long,
        val rawScore: Int,
        val formattedScore: String,
    ) : PendingRaSubmission {
        override val type = RaPendingSubmissionType.LEADERBOARD
    }
}

enum class PendingRaSubmissionStatus {
    RETRYABLE,
    PERMANENT_FAILURE,
}

data class PendingRaSubmissionRecord(
    val submission: PendingRaSubmission,
    val status: PendingRaSubmissionStatus,
)

data class RaPendingCounts(
    val total: Int,
    val achievementUnlocks: Int,
    val leaderboardEntries: Int,
    val retryable: Int,
    val permanentFailures: Int,
) {
    companion object {
        val EMPTY = RaPendingCounts(
            total = 0,
            achievementUnlocks = 0,
            leaderboardEntries = 0,
            retryable = 0,
            permanentFailures = 0,
        )

        fun from(records: Collection<PendingRaSubmissionRecord>): RaPendingCounts {
            var achievementUnlocks = 0
            var leaderboardEntries = 0
            var retryable = 0
            var permanentFailures = 0

            records.forEach { record ->
                when (record.submission) {
                    is PendingRaSubmission.AchievementUnlock -> achievementUnlocks++
                    is PendingRaSubmission.LeaderboardEntry -> leaderboardEntries++
                }
                when (record.status) {
                    PendingRaSubmissionStatus.RETRYABLE -> retryable++
                    PendingRaSubmissionStatus.PERMANENT_FAILURE -> permanentFailures++
                }
            }

            return RaPendingCounts(
                total = records.size,
                achievementUnlocks = achievementUnlocks,
                leaderboardEntries = leaderboardEntries,
                retryable = retryable,
                permanentFailures = permanentFailures,
            )
        }
    }
}

data class PendingRaSubmissionSnapshot(
    val context: RaSubmissionContext,
    val records: List<PendingRaSubmissionRecord>,
    val counts: RaPendingCounts,
    val closed: Boolean,
) {
    companion object {
        fun empty(context: RaSubmissionContext, closed: Boolean = false) = PendingRaSubmissionSnapshot(
            context = context,
            records = emptyList(),
            counts = RaPendingCounts.EMPTY,
            closed = closed,
        )
    }
}
