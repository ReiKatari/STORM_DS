package me.magnum.rcheevosapi

import me.magnum.rcheevosapi.model.RAUserAuth

interface RASignatureProvider {
    fun provideAchievementSignature(
        achievementId: Long,
        userAuth: RAUserAuth.Authenticated,
        forHardcoreMode: Boolean,
        offsetSeconds: Long? = null,
    ): String
    fun provideLeaderboardSignature(leaderboardId: Long, score: Int, userAuth: RAUserAuth.Authenticated): String
}
