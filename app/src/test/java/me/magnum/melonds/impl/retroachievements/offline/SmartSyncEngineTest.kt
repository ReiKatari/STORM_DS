package me.magnum.melonds.impl.retroachievements.offline

import me.magnum.rcheevosapi.exception.UnsuccessfulRequestException
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.IOException

class SmartSyncEngineTest {

    @Test
    fun detectsUnpromotedAchievementRejectionAsPermanent() {
        val error = UnsuccessfulRequestException(
            """HTTP 409: no status message; body={"Success":false,"Status":409,"Code":"invalid_state","Error":"Unpromoted_achievements_cannot_be_unlocked."}""",
        )

        assertTrue(isPermanentSmartSyncAwardRejection(error))
        assertEquals("Unpromoted achievements cannot be unlocked.", smartSyncAwardRejectionReason(error))
    }

    @Test
    fun doesNotTreatTransientOrGenericFailuresAsPermanent() {
        assertFalse(isPermanentSmartSyncAwardRejection(IOException("timeout")))
        assertFalse(isPermanentSmartSyncAwardRejection(UnsuccessfulRequestException("HTTP 500: server error")))
        assertFalse(isPermanentSmartSyncAwardRejection(UnsuccessfulRequestException("User already has this achievement unlocked")))
    }
}
