package me.magnum.melonds.impl.retroachievements.offline

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.currentTime
import me.magnum.rcheevosapi.exception.UnsuccessfulRequestException
import me.magnum.rcheevosapi.model.RAAchievement
import me.magnum.rcheevosapi.model.RAAchievementSet
import me.magnum.rcheevosapi.model.RAAwardAchievementResponse
import me.magnum.rcheevosapi.model.RAGame
import me.magnum.rcheevosapi.model.RAGameId
import me.magnum.rcheevosapi.model.RASetId
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.IOException
import java.net.URI
import kotlin.time.Clock
import kotlin.time.Instant

class SmartSyncEngineTest {

    private companion object {
        const val LEDGER_EXPIRATION_WINDOW_MS = 14L * 24L * 60L * 60L * 1000L
    }

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

    @Test
    @OptIn(ExperimentalCoroutinesApi::class)
    fun smartSyncDoesNotStartRaSessionForOldGameReplay() = runTest {
        val userId = "player"
        val gameHash = "abc123"
        val gameId = 42L
        val achievementId = 1001L
        val raClient = RecordingSmartSyncRaClient(gameId = gameId, achievementId = achievementId)
        val ledgerRepository = OfflineLedgerRepository(
            storage = InMemoryOfflineLedgerStorage(),
            signer = PassthroughOfflineLedgerSigner,
            clock = MutableClock(601_000L),
        )
        val prefetchCacheRepository = OfflinePrefetchCacheRepository(InMemoryOfflinePrefetchCacheStorage())

        prefetchCacheRepository.write(
            userId = userId,
            contentId = gameHash,
            file = OfflinePrefetchCacheFile(
                romHash = gameHash,
                gameId = gameId,
                richPresencePatch = "",
                achievements = listOf(
                    OfflinePrefetchCacheAchievement(
                        id = achievementId,
                        memoryAddress = "0xH1234=1",
                    )
                ),
            ),
        )
        ledgerRepository.appendSessionStart(
            userId = userId,
            contentId = gameHash,
            gameId = gameId,
            sessionId = "session",
            startedAtEpochMs = 1_000L,
            isHardcore = false,
            unlockMode = OfflineUnlockMode.SOFTCORE,
            offlineType = OfflineUnlockType.OFFLINE_FROM_START,
        ).getOrThrow()
        ledgerRepository.appendAchievementUnlock(
            userId = userId,
            contentId = gameHash,
            gameId = gameId,
            achievementId = achievementId,
            isHardcore = false,
            sessionId = "session",
            localTimestampEpochMs = 1_000L,
            offsetFromSessionStartMs = 0L,
            orderIndex = 0L,
            unlockMode = OfflineUnlockMode.SOFTCORE,
            offlineType = OfflineUnlockType.OFFLINE_FROM_START,
        ).getOrThrow()

        val result = SmartSyncEngine(
            raClient = raClient,
            ledgerRepository = ledgerRepository,
            prefetchCacheRepository = prefetchCacheRepository,
            clockMillis = { 601_000L },
            logSink = { _, _ -> },
        ).syncSoftcoreNow(userId, gameHash)

        assertTrue(result.isSuccess)
        assertEquals(0L, currentTime)
        assertEquals(1, result.getOrThrow().submittedCount)
        assertFalse(raClient.requestLog.any { it["r"] == "startsession" })
        val awardRequest = raClient.requestLog.single { it["r"] == "awardachievement" }
        assertEquals(gameHash, awardRequest["m"])
        assertEquals("600", awardRequest["o"])
    }

    @Test
    fun smartSyncDiscardsLegacyHardcoreLedgerEntriesWithoutRaRequests() = runTest {
        val userId = "player"
        val gameHash = "abc123"
        val gameId = 42L
        val achievementId = 1001L
        val raClient = RecordingSmartSyncRaClient(gameId = gameId, achievementId = achievementId)
        val ledgerRepository = OfflineLedgerRepository(
            storage = InMemoryOfflineLedgerStorage(),
            signer = PassthroughOfflineLedgerSigner,
            clock = MutableClock(2_000L),
        )
        val prefetchCacheRepository = OfflinePrefetchCacheRepository(InMemoryOfflinePrefetchCacheStorage())

        ledgerRepository.appendSessionStart(
            userId = userId,
            contentId = gameHash,
            gameId = gameId,
            sessionId = "session",
            startedAtEpochMs = 1_000L,
            isHardcore = true,
            unlockMode = OfflineUnlockMode.HARDCORE,
            offlineType = OfflineUnlockType.OFFLINE_AFTER_START,
        ).getOrThrow()
        ledgerRepository.appendAchievementUnlock(
            userId = userId,
            contentId = gameHash,
            gameId = gameId,
            achievementId = achievementId,
            isHardcore = true,
            sessionId = "session",
            localTimestampEpochMs = 1_000L,
            offsetFromSessionStartMs = 0L,
            orderIndex = 0L,
            unlockMode = OfflineUnlockMode.HARDCORE,
            offlineType = OfflineUnlockType.OFFLINE_AFTER_START,
        ).getOrThrow()

        val result = SmartSyncEngine(
            raClient = raClient,
            ledgerRepository = ledgerRepository,
            prefetchCacheRepository = prefetchCacheRepository,
            logSink = { _, _ -> },
        ).syncHardcoreNow(userId, gameHash)

        assertTrue(result.isSuccess)
        assertEquals(0, result.getOrThrow().submittedCount)
        assertTrue(raClient.requestLog.isEmpty())
        assertEquals(0, ledgerRepository.getStatus(userId, gameHash).pendingHardcoreUnlockCount)
    }

    @Test
    fun newLedgerExpiresFourteenDaysAfterOldestPendingUnlock() = runTest {
        val userId = "player"
        val gameHash = "abc123"
        val unlockTimeMs = 1_000L
        val clock = MutableClock(unlockTimeMs + 1_000L)
        val ledgerRepository = OfflineLedgerRepository(
            storage = InMemoryOfflineLedgerStorage(),
            signer = PassthroughOfflineLedgerSigner,
            clock = clock,
        )

        ledgerRepository.appendSessionStart(
            userId = userId,
            contentId = gameHash,
            gameId = 42L,
            sessionId = "session",
            startedAtEpochMs = unlockTimeMs,
            isHardcore = false,
            unlockMode = OfflineUnlockMode.SOFTCORE,
            offlineType = OfflineUnlockType.OFFLINE_FROM_START,
        ).getOrThrow()
        ledgerRepository.appendAchievementUnlock(
            userId = userId,
            contentId = gameHash,
            gameId = 42L,
            achievementId = 1001L,
            isHardcore = false,
            sessionId = "session",
            localTimestampEpochMs = unlockTimeMs,
            offsetFromSessionStartMs = 0L,
            orderIndex = 0L,
            unlockMode = OfflineUnlockMode.SOFTCORE,
            offlineType = OfflineUnlockType.OFFLINE_FROM_START,
        ).getOrThrow()

        val activeStatus = ledgerRepository.getStatus(userId, gameHash)
        assertEquals(OfflineLedgerIntegrity.OK, activeStatus.integrity)
        assertEquals(unlockTimeMs + LEDGER_EXPIRATION_WINDOW_MS, activeStatus.ledgerExpiresAtEpochMs)
        assertFalse(activeStatus.isExpired)

        clock.epochMs = unlockTimeMs + LEDGER_EXPIRATION_WINDOW_MS + 1L
        val expiredStatus = ledgerRepository.getStatus(userId, gameHash)
        assertTrue(expiredStatus.isExpired)
    }

    @Test
    fun legacyLedgerDoesNotReceiveNewExpirationPolicy() = runTest {
        val userId = "player"
        val gameHash = "abc123"
        val storage = InMemoryOfflineLedgerStorage()
        val clock = MutableClock(1_000L + LEDGER_EXPIRATION_WINDOW_MS + 1_000L)
        val ledgerRepository = OfflineLedgerRepository(
            storage = storage,
            signer = PassthroughOfflineLedgerSigner,
            clock = clock,
        )

        storage.write(
            userId = userId,
            contentId = gameHash,
            bytes = OfflineLedgerCodec.encodeFile(
                legacyLedgerFile(
                    userId = userId,
                    contentId = gameHash,
                    gameId = 42L,
                    achievementId = 1001L,
                    unlockTimeMs = 1_000L,
                )
            ),
        )

        val status = ledgerRepository.getStatus(userId, gameHash)
        assertEquals(OfflineLedgerIntegrity.OK, status.integrity)
        assertEquals(1, status.pendingSoftcoreUnlockCount)
        assertEquals(null, status.ledgerExpiresAtEpochMs)
        assertFalse(status.isExpired)
    }

    private class RecordingSmartSyncRaClient(
        private val gameId: Long,
        private val achievementId: Long,
    ) : SmartSyncRaClient {
        val requestLog = mutableListOf<Map<String, String>>()

        override suspend fun getGameAchievementSets(gameHash: String): Result<RAGame> {
            requestLog += mapOf("r" to "achievementsets", "m" to gameHash)
            return Result.success(testGame(gameId = gameId, achievementId = achievementId))
        }

        override suspend fun awardAchievement(
            achievementId: Long,
            forHardcoreMode: Boolean,
            gameHash: String,
            offsetSeconds: Long?,
        ): Result<RAAwardAchievementResponse> {
            requestLog += buildMap {
                put("r", "awardachievement")
                put("a", achievementId.toString())
                put("h", if (forHardcoreMode) "1" else "0")
                put("m", gameHash)
                if (offsetSeconds != null) {
                    put("o", offsetSeconds.toString())
                }
            }
            return Result.success(
                RAAwardAchievementResponse(
                    achievementAwarded = true,
                    remainingAchievements = 0,
                )
            )
        }

        private fun testGame(gameId: Long, achievementId: Long): RAGame {
            val gameIdModel = RAGameId(gameId)
            val setId = RASetId(7L)
            return RAGame(
                id = gameIdModel,
                title = "Test Game",
                icon = testUrl("https://example.com/icon.png"),
                richPresencePatch = "",
                sets = listOf(
                    RAAchievementSet(
                        id = setId,
                        gameId = gameIdModel,
                        title = "Core",
                        type = RAAchievementSet.Type.Core,
                        iconUrl = testUrl("https://example.com/set.png"),
                        achievements = listOf(
                            RAAchievement(
                                id = achievementId,
                                gameId = gameIdModel,
                                setId = setId,
                                totalAwardsCasual = 1,
                                totalAwardsHardcore = 1,
                                title = "Test",
                                description = "Test",
                                points = 5,
                                displayOrder = 1,
                                badgeUrlUnlocked = testUrl("https://example.com/unlocked.png"),
                                badgeUrlLocked = testUrl("https://example.com/locked.png"),
                                memoryAddress = "0xH1234=1",
                                type = RAAchievement.Type.CORE,
                            )
                        ),
                        leaderboards = emptyList(),
                    )
                ),
            )
        }

        private fun testUrl(value: String) = URI(value).toURL()
    }

    private fun legacyLedgerFile(
        userId: String,
        contentId: String,
        gameId: Long,
        achievementId: Long,
        unlockTimeMs: Long,
    ): OfflineLedgerFile {
        val sessionPayload = OfflineLedgerPayload(
            recordType = OfflineLedgerRecordType.SESSION_START,
            seq = 1L,
            userId = userId,
            contentId = contentId,
            gameId = gameId,
            sessionId = "session",
            localTimestampEpochMs = unlockTimeMs,
            unlockMode = OfflineUnlockMode.SOFTCORE,
            offlineType = OfflineUnlockType.OFFLINE_FROM_START,
            pendingSync = false,
        )
        val sessionRecord = signedRecord(sessionPayload)
        val unlockPayload = OfflineLedgerPayload(
            recordType = OfflineLedgerRecordType.ACHIEVEMENT_UNLOCK,
            seq = 2L,
            userId = userId,
            contentId = contentId,
            gameId = gameId,
            achievementId = achievementId,
            sessionId = "session",
            localTimestampEpochMs = unlockTimeMs,
            prevHash = sessionRecord.payloadHash,
            unlockMode = OfflineUnlockMode.SOFTCORE,
            offlineType = OfflineUnlockType.OFFLINE_FROM_START,
            pendingSync = true,
        )

        return OfflineLedgerFile(
            records = listOf(sessionRecord, signedRecord(unlockPayload)),
            expirationPolicyVersion = 0,
        )
    }

    private fun signedRecord(payload: OfflineLedgerPayload): OfflineLedgerRecord {
        val payloadHash = sha256(OfflineLedgerCodec.encodePayload(payload))
        return OfflineLedgerRecord(
            payload = payload,
            payloadHash = payloadHash,
            signature = PassthroughOfflineLedgerSigner.sign(payloadHash),
        )
    }

    private class MutableClock(var epochMs: Long) : Clock {
        override fun now(): Instant = Instant.fromEpochMilliseconds(epochMs)
    }

    private class InMemoryOfflineLedgerStorage : OfflineLedgerStorage {
        private val entries = mutableMapOf<Pair<String, String>, ByteArray>()
        override suspend fun exists(userId: String, contentId: String): Boolean = entries.containsKey(userId to contentId)
        override suspend fun read(userId: String, contentId: String): ByteArray? = entries[userId to contentId]
        override suspend fun write(userId: String, contentId: String, bytes: ByteArray) {
            entries[userId to contentId] = bytes
        }
        override suspend fun delete(userId: String, contentId: String) {
            entries.remove(userId to contentId)
        }
    }

    private class InMemoryOfflinePrefetchCacheStorage : OfflinePrefetchCacheStorage {
        private val entries = mutableMapOf<Pair<String, String>, ByteArray>()
        override suspend fun exists(userId: String, contentId: String): Boolean = entries.containsKey(userId to contentId)
        override suspend fun read(userId: String, contentId: String): ByteArray? = entries[userId to contentId]
        override suspend fun write(userId: String, contentId: String, bytes: ByteArray) {
            entries[userId to contentId] = bytes
        }
        override suspend fun delete(userId: String, contentId: String) {
            entries.remove(userId to contentId)
        }
    }

    private object PassthroughOfflineLedgerSigner : OfflineLedgerSigner {
        override fun sign(payloadHash: ByteArray): ByteArray = payloadHash.copyOf()
        override fun verify(payloadHash: ByteArray, signature: ByteArray): Boolean = payloadHash.contentEquals(signature)
    }
}
