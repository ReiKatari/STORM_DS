package me.magnum.rcheevosapi.model

/**
 * @param achievementAwarded Whether the achievement was actually awarded or not. If `false`, this means that the user had already unlocked the achievement
 * @param remainingAchievements The number of remaining achievements to unlock in the game
 * @param score The hardcore score of the user after the award
 * @param softcoreScore The softcore score of the user after the award
 */
data class RAAwardAchievementResponse(
    val achievementAwarded: Boolean,
    val remainingAchievements: Int,
    val score: Long = 0,
    val softcoreScore: Long = 0,
) {

    fun isSetMastered(): Boolean {
        return achievementAwarded && remainingAchievements == 0
    }
}