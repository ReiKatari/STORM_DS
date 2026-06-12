package me.magnum.melonds.common.retroachievements

import me.magnum.rcheevosapi.model.RAUserAuth
import org.junit.Assert.assertEquals
import org.junit.Test

class AndroidRASignatureProviderTest {

    private val provider = AndroidRASignatureProvider()
    private val userAuth = RAUserAuth.Authenticated(username = "Player", token = "token")

    @Test
    fun achievementSignatureOmitsZeroOffset() {
        val signature = provider.provideAchievementSignature(
            achievementId = 123L,
            userAuth = userAuth,
            forHardcoreMode = false,
            offsetSeconds = 0L,
        )

        assertEquals("c4eba27c1429eee8ce023c58ec4ce4b3", signature)
    }

    @Test
    fun achievementSignatureIncludesNonZeroOffset() {
        val signature = provider.provideAchievementSignature(
            achievementId = 123L,
            userAuth = userAuth,
            forHardcoreMode = false,
            offsetSeconds = 600L,
        )

        assertEquals("2d2e765b55989541ce99fb85cf5280c2", signature)
    }
}
