package me.magnum.melonds.ui.romdetails.model

sealed class RomRetroAchievementsUiState {
    data class LoggedOut(val existingUsername: String?) : RomRetroAchievementsUiState()
    object Loading : RomRetroAchievementsUiState()
    data class Ready(
        val sets: List<AchievementSetUiModel>,
        val pendingLedgerAchievementIds: Set<Long> = emptySet(),
    ) : RomRetroAchievementsUiState() {

        fun hasAchievements(): Boolean {
            return sets.any { it.buckets.isNotEmpty() }
        }
    }
    object LoginError : RomRetroAchievementsUiState()
    object AchievementLoadError : RomRetroAchievementsUiState()
}
