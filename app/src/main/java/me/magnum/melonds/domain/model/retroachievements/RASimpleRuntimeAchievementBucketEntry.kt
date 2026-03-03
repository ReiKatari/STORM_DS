package me.magnum.melonds.domain.model.retroachievements

data class RASimpleRuntimeAchievementBucketEntry(
    val achievementId: Long,
    val subsetId: Long,
    val bucketType: Int,
)
