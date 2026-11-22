package me.magnum.rcheevosapi.model

import java.net.URL

data class RAAchievement(
    val id: Long,
    val gameId: RAGameId,
    val setId: RASetId,
    val totalAwardsCasual: Int?,
    val totalAwardsHardcore: Int?,
    val title: String,
    val description: String,
    val points: Int,
    val displayOrder: Int,
    val badgeUrlUnlocked: URL,
    val badgeUrlLocked: URL,
    val memoryAddress: String,
    val type: Type,
    val achievementType: String? = null,
) {

    enum class Type {
        CORE,
        UNOFFICIAL
    }

    fun getCleanTitle(): String {
        return title.removeSuffix("[m]").trim()
    }

    fun isMissable(): Boolean {
        return achievementType == "missable" || title.endsWith("[m]")
    }
}