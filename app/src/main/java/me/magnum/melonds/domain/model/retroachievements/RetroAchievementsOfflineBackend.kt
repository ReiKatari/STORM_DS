package me.magnum.melonds.domain.model.retroachievements

enum class RetroAchievementsOfflineBackend(val preferenceValue: String) {
    BUILT_IN("built_in"),
    RA_OFFLINE_PROXY("ra_offline_proxy");

    companion object {
        fun fromPreference(value: String?): RetroAchievementsOfflineBackend {
            return entries.firstOrNull { it.preferenceValue == value } ?: BUILT_IN
        }
    }
}
