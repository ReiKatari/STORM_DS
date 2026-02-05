package me.magnum.melonds.ui.romdetails.model

sealed class RomDetailsToastEvent {

    enum class OfflineAchievementNotSyncedReason {
        MISSING_FROM_CURRENT_SET,
        DEFINITION_CHANGED,
        NOT_IN_PREFETCH_CACHE,
    }

    data class OfflineAchievementNotSynced(
        val title: String,
        val reason: OfflineAchievementNotSyncedReason,
    ) : RomDetailsToastEvent()

    data class OfflineAchievementsNotSyncedSummary(
        val skippedCount: Int,
    ) : RomDetailsToastEvent()
}
