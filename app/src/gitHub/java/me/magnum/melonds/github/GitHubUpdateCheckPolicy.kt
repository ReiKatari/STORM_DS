package me.magnum.melonds.github

import java.util.concurrent.TimeUnit

object GitHubUpdateCheckPolicy {
    fun shouldCheckProduction(
        enabled: Boolean,
        lastCheckMillis: Long,
        nowMillis: Long,
        delayHours: Long = 22L,
    ): Boolean {
        if (!enabled) return false
        if (lastCheckMillis == -1L) return true
        return nowMillis - lastCheckMillis >= TimeUnit.HOURS.toMillis(delayHours)
    }
}
