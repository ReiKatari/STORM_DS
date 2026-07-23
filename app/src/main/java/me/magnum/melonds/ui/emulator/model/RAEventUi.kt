package me.magnum.melonds.ui.emulator.model

import me.magnum.rcheevosapi.model.RAAchievement
import me.magnum.rcheevosapi.model.RALeaderboard
import me.magnum.melonds.ui.emulator.component.LeaderboardAttemptKey
import java.net.URL
import kotlin.time.Duration

sealed class RAEventUi {
    data object Reset : RAEventUi()
    data class AchievementTriggered(val achievement: RAAchievement) : RAEventUi()
    data class AchievementTriggerError(val achievement: RAAchievement) : RAEventUi()
    data class AchievementPrimed(val achievement: RAAchievement) : RAEventUi()
    data class AchievementUnPrimed(val achievement: RAAchievement) : RAEventUi()
    data class AchievementProgressUpdated(val achievement: RAAchievement, val current: Int, val target: Int, val progress: String) : RAEventUi()
    data class AchievementProgressHidden(val achievementId: Long) : RAEventUi()
    data class LeaderboardAttemptStarted(val key: LeaderboardAttemptKey, val leaderboard: RALeaderboard, val gameIcon: URL) : RAEventUi()
    data class LeaderboardAttemptUpdated(val key: LeaderboardAttemptKey, val formattedValue: String) : RAEventUi()
    data class LeaderboardTrackerHidden(val key: LeaderboardAttemptKey) : RAEventUi()
    data class LeaderboardAttemptCancelled(
        val leaderboardId: Long,
        val attemptKey: LeaderboardAttemptKey? = null,
    ) : RAEventUi()
    data class LeaderboardSubmissionPending(
        val key: LeaderboardAttemptKey,
        val title: String,
        val gameIcon: URL?,
        val trackerDisplay: String,
    ) : RAEventUi()
    data class LeaderboardEntrySubmitted(
        val leaderboardId: Long,
        val attemptKey: LeaderboardAttemptKey?,
        val title: String,
        val gameIcon: URL?,
        val submittedScore: String,
        val bestScore: String?,
        val rank: Long,
        val numberOfEntries: Long,
    ) : RAEventUi()
    data class LeaderboardEntrySubmitError(
        val leaderboardId: Long,
        val attemptKey: LeaderboardAttemptKey? = null,
        val willRetryInBackground: Boolean = true,
    ) : RAEventUi()
    data object PendingDataSubmitted : RAEventUi()
    data class GameMastered(
        val gameTitle: String,
        val gameIcon: URL,
        val userName: String?,
        val playTime: Duration?,
        val forHardcodeMode: Boolean,
    ) : RAEventUi()
}
