package me.magnum.melonds.impl.retroachievements.offline

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HardcoreOfflineLossTracker @Inject constructor(
    @ApplicationContext context: Context,
) {
    private val sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

    data class PendingHardcoreUnlockLoss(
        val userId: String,
        val contentId: String,
        val gameTitle: String,
        val achievementCount: Int,
        val leaderboardCount: Int,
    ) {
        val totalCount: Int
            get() = achievementCount + leaderboardCount
    }

    fun markPendingSubmissions(
        userId: String,
        contentId: String,
        gameTitle: String,
        achievementCount: Int,
        leaderboardCount: Int,
    ) {
        require(achievementCount >= 0)
        require(leaderboardCount >= 0)
        if (achievementCount + leaderboardCount == 0) {
            clearPendingUnlocks(userId, contentId)
            return
        }
        sharedPreferences.edit()
            .putString(KEY_USER_ID, userId)
            .putString(KEY_CONTENT_ID, contentId)
            .putString(KEY_GAME_TITLE, gameTitle)
            .putInt(KEY_ACHIEVEMENT_COUNT, achievementCount)
            .putInt(KEY_LEADERBOARD_COUNT, leaderboardCount)
            .commit()
    }

    fun markPendingUnlocks(userId: String, contentId: String, gameTitle: String) {
        markPendingSubmissions(userId, contentId, gameTitle, 1, 0)
    }

    fun clearPendingUnlocks(userId: String, contentId: String) {
        val current = peekPendingUnlocks() ?: return
        if (current.userId == userId && current.contentId == contentId) {
            clearAll()
        }
    }

    fun consumePendingUnlocks(): PendingHardcoreUnlockLoss? {
        val current = peekPendingUnlocks() ?: return null
        clearAll()
        return current
    }

    private fun peekPendingUnlocks(): PendingHardcoreUnlockLoss? {
        val userId = sharedPreferences.getString(KEY_USER_ID, null) ?: return null
        val contentId = sharedPreferences.getString(KEY_CONTENT_ID, null) ?: return null
        val gameTitle = sharedPreferences.getString(KEY_GAME_TITLE, null).orEmpty().ifBlank { contentId }
        val counts = resolveStoredPendingCounts(
            hasAchievementCount = sharedPreferences.contains(KEY_ACHIEVEMENT_COUNT),
            achievementCount = sharedPreferences.getInt(KEY_ACHIEVEMENT_COUNT, 0),
            hasLeaderboardCount = sharedPreferences.contains(KEY_LEADERBOARD_COUNT),
            leaderboardCount = sharedPreferences.getInt(KEY_LEADERBOARD_COUNT, 0),
        )
        return PendingHardcoreUnlockLoss(
            userId = userId,
            contentId = contentId,
            gameTitle = gameTitle,
            achievementCount = counts.first,
            leaderboardCount = counts.second,
        )
    }

    private fun clearAll() {
        sharedPreferences.edit()
            .remove(KEY_USER_ID)
            .remove(KEY_CONTENT_ID)
            .remove(KEY_GAME_TITLE)
            .remove(KEY_ACHIEVEMENT_COUNT)
            .remove(KEY_LEADERBOARD_COUNT)
            .commit()
    }

    private companion object {
        private const val PREFERENCES_NAME = "hardcore_offline_loss_tracker"
        private const val KEY_USER_ID = "user_id"
        private const val KEY_CONTENT_ID = "content_id"
        private const val KEY_GAME_TITLE = "game_title"
        private const val KEY_ACHIEVEMENT_COUNT = "achievement_count"
        private const val KEY_LEADERBOARD_COUNT = "leaderboard_count"
    }
}

internal fun resolveStoredPendingCounts(
    hasAchievementCount: Boolean,
    achievementCount: Int,
    hasLeaderboardCount: Boolean,
    leaderboardCount: Int,
): Pair<Int, Int> {
    if (!hasAchievementCount && !hasLeaderboardCount) {
        return 1 to 0
    }
    return achievementCount.coerceAtLeast(0) to leaderboardCount.coerceAtLeast(0)
}
