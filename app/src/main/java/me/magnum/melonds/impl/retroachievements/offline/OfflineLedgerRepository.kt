package me.magnum.melonds.impl.retroachievements.offline

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import kotlin.time.Clock

/**
 * Offline achievement ledger.
 *
 * Security note:
 * - This protects against *offline tampering* (editing/removing/reordering stored unlocks).
 * - It does NOT attempt to prevent runtime cheating while the emulator is running.
 */
class OfflineLedgerRepository(
    private val storage: OfflineLedgerStorage,
    private val signer: OfflineLedgerSigner,
    private val clock: Clock = Clock.System,
) {

    private val mutex = Mutex()

    suspend fun getStatus(userId: String, contentId: String): OfflineLedgerStatus {
        return mutex.withLock {
            val bytes = try {
                storage.read(userId, contentId)
            } catch (_: Exception) {
                return@withLock OfflineLedgerStatus(OfflineLedgerIntegrity.IO_ERROR)
            }

            if (bytes == null) {
                return@withLock OfflineLedgerStatus(OfflineLedgerIntegrity.EMPTY)
            }

            val file = try {
                OfflineLedgerCodec.decodeFile(bytes)
            } catch (_: Exception) {
                return@withLock OfflineLedgerStatus(OfflineLedgerIntegrity.TAMPERED)
            }

            val verification = verify(file.records)
            if (verification.integrity != OfflineLedgerIntegrity.OK) {
                return@withLock OfflineLedgerStatus(verification.integrity)
            }

            val unlocks = file.records
                .asSequence()
                .filter { it.payload.recordType == OfflineLedgerRecordType.ACHIEVEMENT_UNLOCK }
                .map { record ->
                    val payload = record.payload
                    val unlockMode = resolveUnlockMode(payload)
                    val offlineType = resolveOfflineType(payload)
                    OfflineUnlockEvent(
                        seq = payload.seq,
                        userId = payload.userId,
                        contentId = payload.contentId,
                        gameId = payload.gameId,
                        achievementId = payload.achievementId,
                        isHardcore = unlockMode == OfflineUnlockMode.HARDCORE,
                        sessionId = payload.sessionId,
                        localTimestampEpochMs = payload.localTimestampEpochMs,
                        offsetFromSessionStartMs = payload.offsetFromSessionStartMs,
                        orderIndex = payload.orderIndex,
                        unlockMode = unlockMode,
                        offlineType = offlineType,
                        pendingSync = payload.pendingSync || payload.recordType == OfflineLedgerRecordType.ACHIEVEMENT_UNLOCK,
                    )
                }
                .toList()

            val ackedSeqs = file.records
                .asSequence()
                .filter { it.payload.recordType == OfflineLedgerRecordType.ACHIEVEMENT_ACK }
                .map { it.payload.ackedSeq }
                .filter { it != 0L }
                .toSet()

            val pendingUnlocks = unlocks.filterNot { ackedSeqs.contains(it.seq) }

            val sessions = buildSessions(file.records)
            OfflineLedgerStatus(
                integrity = OfflineLedgerIntegrity.OK,
                pendingUnlocks = pendingUnlocks,
                sessions = sessions,
            )
        }
    }

    suspend fun appendSessionStart(
        userId: String,
        contentId: String,
        gameId: Long,
        sessionId: String,
        startedAtEpochMs: Long,
        isHardcore: Boolean,
        unlockMode: OfflineUnlockMode = if (isHardcore) OfflineUnlockMode.HARDCORE else OfflineUnlockMode.SOFTCORE,
        offlineType: OfflineUnlockType = OfflineUnlockType.OFFLINE_AFTER_START,
    ): Result<Unit> {
        val payload = OfflineLedgerPayload(
            recordType = OfflineLedgerRecordType.SESSION_START,
            userId = userId,
            contentId = contentId,
            gameId = gameId,
            isHardcore = isHardcore,
            sessionId = sessionId,
            localTimestampEpochMs = startedAtEpochMs,
            unlockMode = unlockMode,
            offlineType = offlineType,
            pendingSync = false,
        )
        return appendRecord(userId, contentId, payload)
    }

    suspend fun appendSessionEnd(
        userId: String,
        contentId: String,
        gameId: Long,
        sessionId: String,
        endedAtEpochMs: Long,
        estimatedPlayDurationMs: Long,
        isHardcore: Boolean,
        unlockMode: OfflineUnlockMode = if (isHardcore) OfflineUnlockMode.HARDCORE else OfflineUnlockMode.SOFTCORE,
        offlineType: OfflineUnlockType = OfflineUnlockType.OFFLINE_AFTER_START,
    ): Result<Unit> {
        val payload = OfflineLedgerPayload(
            recordType = OfflineLedgerRecordType.SESSION_END,
            userId = userId,
            contentId = contentId,
            gameId = gameId,
            isHardcore = isHardcore,
            sessionId = sessionId,
            localTimestampEpochMs = endedAtEpochMs,
            estimatedPlayDurationMs = estimatedPlayDurationMs,
            unlockMode = unlockMode,
            offlineType = offlineType,
            pendingSync = false,
        )
        return appendRecord(userId, contentId, payload)
    }

    suspend fun appendAchievementUnlock(
        userId: String,
        contentId: String,
        gameId: Long,
        achievementId: Long,
        isHardcore: Boolean,
        sessionId: String,
        localTimestampEpochMs: Long,
        offsetFromSessionStartMs: Long,
        orderIndex: Long,
        unlockMode: OfflineUnlockMode = if (isHardcore) OfflineUnlockMode.HARDCORE else OfflineUnlockMode.SOFTCORE,
        offlineType: OfflineUnlockType = OfflineUnlockType.OFFLINE_AFTER_START,
    ): Result<Unit> {
        val payload = OfflineLedgerPayload(
            recordType = OfflineLedgerRecordType.ACHIEVEMENT_UNLOCK,
            userId = userId,
            contentId = contentId,
            gameId = gameId,
            achievementId = achievementId,
            isHardcore = isHardcore,
            sessionId = sessionId,
            localTimestampEpochMs = localTimestampEpochMs,
            offsetFromSessionStartMs = offsetFromSessionStartMs,
            orderIndex = orderIndex,
            unlockMode = unlockMode,
            offlineType = offlineType,
            pendingSync = true,
        )
        return appendRecord(userId, contentId, payload)
    }

    suspend fun appendAchievementAck(
        userId: String,
        contentId: String,
        gameId: Long,
        achievementId: Long,
        isHardcore: Boolean,
        ackedSeq: Long,
        unlockMode: OfflineUnlockMode = if (isHardcore) OfflineUnlockMode.HARDCORE else OfflineUnlockMode.SOFTCORE,
        offlineType: OfflineUnlockType = OfflineUnlockType.OFFLINE_AFTER_START,
    ): Result<Unit> {
        val payload = OfflineLedgerPayload(
            recordType = OfflineLedgerRecordType.ACHIEVEMENT_ACK,
            userId = userId,
            contentId = contentId,
            gameId = gameId,
            achievementId = achievementId,
            isHardcore = isHardcore,
            localTimestampEpochMs = clock.now().toEpochMilliseconds(),
            ackedSeq = ackedSeq,
            unlockMode = unlockMode,
            offlineType = offlineType,
            pendingSync = false,
        )
        return appendRecord(userId, contentId, payload)
    }

    suspend fun discardPendingHardcoreUnlocks(
        userId: String,
        contentId: String,
    ): Result<Int> {
        val status = getStatus(userId, contentId)
        if (status.integrity != OfflineLedgerIntegrity.OK) {
            return Result.failure(IllegalStateException("Offline ledger integrity is ${status.integrity}"))
        }

        val pendingHardcoreUnlocks = status.pendingUnlocks
            .filter { it.unlockMode == OfflineUnlockMode.HARDCORE }

        if (pendingHardcoreUnlocks.isEmpty()) {
            return Result.success(0)
        }

        var ackedCount = 0
        pendingHardcoreUnlocks.forEach { unlock ->
            val ackResult = appendAchievementAck(
                userId = userId,
                contentId = contentId,
                gameId = unlock.gameId,
                achievementId = unlock.achievementId,
                isHardcore = true,
                ackedSeq = unlock.seq,
                unlockMode = unlock.unlockMode,
                offlineType = unlock.offlineType,
            )
            if (ackResult.isFailure) {
                return Result.failure(ackResult.exceptionOrNull() ?: IllegalStateException("Failed to discard pending hardcore unlock"))
            }
            ackedCount++
        }

        return Result.success(ackedCount)
    }

    suspend fun resetLedger(
        userId: String,
        contentId: String,
    ): Result<Unit> = mutex.withLock {
        return@withLock withContext(Dispatchers.IO) {
            try {
                storage.delete(userId, contentId)
                Result.success(Unit)
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }

    private suspend fun appendRecord(
        userId: String,
        contentId: String,
        payload: OfflineLedgerPayload,
    ): Result<Unit> = mutex.withLock {
        return@withLock withContext(Dispatchers.IO) {
            try {
                val currentBytes = storage.read(userId, contentId)
                val currentFile = currentBytes?.let { OfflineLedgerCodec.decodeFile(it) } ?: OfflineLedgerFile()

                val verification = verify(currentFile.records)
                when (verification.integrity) {
                    OfflineLedgerIntegrity.OK,
                    OfflineLedgerIntegrity.EMPTY -> Unit
                    else -> return@withContext Result.failure(IllegalStateException("Offline ledger integrity is ${verification.integrity}"))
                }

                val nextSeq = (verification.lastSeq ?: 0L) + 1L
                val prevHash = verification.lastPayloadHash ?: ByteArray(0)

                val payloadWithChain = payload.copy(
                    seq = nextSeq,
                    prevHash = prevHash,
                )

                val payloadBytes = OfflineLedgerCodec.encodePayload(payloadWithChain)
                val payloadHash = sha256(payloadBytes)
                val signature = signer.sign(payloadHash)

                val record = OfflineLedgerRecord(
                    payload = payloadWithChain,
                    payloadHash = payloadHash,
                    signature = signature,
                )

                val newFile = OfflineLedgerFile(records = currentFile.records + record)
                val newBytes = OfflineLedgerCodec.encodeFile(newFile)
                storage.write(userId, contentId, newBytes)
                Result.success(Unit)
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }

    private data class Verification(
        val integrity: OfflineLedgerIntegrity,
        val lastSeq: Long? = null,
        val lastPayloadHash: ByteArray? = null,
    )

    private fun verify(records: List<OfflineLedgerRecord>): Verification {
        if (records.isEmpty()) {
            return Verification(OfflineLedgerIntegrity.EMPTY, lastSeq = null, lastPayloadHash = null)
        }

        var expectedPrevHash = ByteArray(0)
        var expectedSeq = records.first().payload.seq

        records.forEachIndexed { index, record ->
            val payload = record.payload
            val payloadBytes = OfflineLedgerCodec.encodePayload(payload)
            val computedPayloadHash = sha256(payloadBytes)

            if (!computedPayloadHash.contentEquals(record.payloadHash)) {
                return Verification(OfflineLedgerIntegrity.TAMPERED)
            }

            if (!payload.prevHash.contentEquals(expectedPrevHash)) {
                return Verification(OfflineLedgerIntegrity.TAMPERED)
            }

            if (index > 0 && payload.seq != expectedSeq) {
                return Verification(OfflineLedgerIntegrity.TAMPERED)
            }

            val signatureValid = try {
                signer.verify(record.payloadHash, record.signature)
            } catch (_: Exception) {
                false
            }

            if (!signatureValid) {
                return Verification(OfflineLedgerIntegrity.SIGNING_KEY_INVALID)
            }

            expectedPrevHash = record.payloadHash
            expectedSeq = payload.seq + 1L
        }

        val last = records.last()
        return Verification(
            integrity = OfflineLedgerIntegrity.OK,
            lastSeq = last.payload.seq,
            lastPayloadHash = last.payloadHash,
        )
    }

    private fun buildSessions(records: List<OfflineLedgerRecord>): Map<String, OfflineSessionEvent> {
        val sessionsById = mutableMapOf<String, OfflineSessionEvent>()

        records.forEach { record ->
            val payload = record.payload
            val sessionId = payload.sessionId
            if (sessionId.isBlank()) return@forEach

            when (payload.recordType) {
                OfflineLedgerRecordType.SESSION_START -> {
                    val existing = sessionsById[sessionId]
                    sessionsById[sessionId] = OfflineSessionEvent(
                        seq = payload.seq,
                        sessionId = sessionId,
                        startedAtEpochMs = payload.localTimestampEpochMs,
                        endedAtEpochMs = existing?.endedAtEpochMs,
                        estimatedPlayDurationMs = existing?.estimatedPlayDurationMs,
                    )
                }
                OfflineLedgerRecordType.SESSION_END -> {
                    val existing = sessionsById[sessionId]
                    sessionsById[sessionId] = OfflineSessionEvent(
                        seq = existing?.seq ?: payload.seq,
                        sessionId = sessionId,
                        startedAtEpochMs = existing?.startedAtEpochMs,
                        endedAtEpochMs = payload.localTimestampEpochMs,
                        estimatedPlayDurationMs = payload.estimatedPlayDurationMs.takeIf { it > 0 } ?: existing?.estimatedPlayDurationMs,
                    )
                }
                else -> Unit
            }
        }

        return sessionsById
    }

    private fun resolveUnlockMode(payload: OfflineLedgerPayload): OfflineUnlockMode {
        return when (payload.unlockMode) {
            OfflineUnlockMode.SOFTCORE,
            OfflineUnlockMode.HARDCORE -> payload.unlockMode
            OfflineUnlockMode.UNKNOWN -> if (payload.isHardcore) {
                OfflineUnlockMode.HARDCORE
            } else {
                OfflineUnlockMode.SOFTCORE
            }
        }
    }

    private fun resolveOfflineType(payload: OfflineLedgerPayload): OfflineUnlockType {
        return when (payload.offlineType) {
            OfflineUnlockType.OFFLINE_FROM_START,
            OfflineUnlockType.OFFLINE_AFTER_START -> payload.offlineType
            OfflineUnlockType.UNKNOWN -> OfflineUnlockType.OFFLINE_AFTER_START
        }
    }
}
