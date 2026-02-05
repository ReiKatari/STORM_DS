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
    )

    fun markPendingUnlocks(userId: String, contentId: String, gameTitle: String) {
        sharedPreferences.edit()
            .putString(KEY_USER_ID, userId)
            .putString(KEY_CONTENT_ID, contentId)
            .putString(KEY_GAME_TITLE, gameTitle)
            .apply()
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
        return PendingHardcoreUnlockLoss(
            userId = userId,
            contentId = contentId,
            gameTitle = gameTitle,
        )
    }

    private fun clearAll() {
        sharedPreferences.edit()
            .remove(KEY_USER_ID)
            .remove(KEY_CONTENT_ID)
            .remove(KEY_GAME_TITLE)
            .apply()
    }

    private companion object {
        private const val PREFERENCES_NAME = "hardcore_offline_loss_tracker"
        private const val KEY_USER_ID = "user_id"
        private const val KEY_CONTENT_ID = "content_id"
        private const val KEY_GAME_TITLE = "game_title"
    }
}
