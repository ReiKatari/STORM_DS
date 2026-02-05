package me.magnum.melonds.impl.retroachievements.offline

import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@Serializable
enum class OfflineLedgerRecordType {
    SESSION_START,
    SESSION_END,
    ACHIEVEMENT_UNLOCK,
    ACHIEVEMENT_ACK,
}

@Serializable
enum class OfflineUnlockMode {
    UNKNOWN,
    SOFTCORE,
    HARDCORE,
}

@Serializable
enum class OfflineUnlockType {
    UNKNOWN,
    OFFLINE_FROM_START,
    OFFLINE_AFTER_START,
}

@Serializable
data class OfflineLedgerPayload(
    @ProtoNumber(1) val recordType: OfflineLedgerRecordType = OfflineLedgerRecordType.SESSION_START,
    @ProtoNumber(2) val seq: Long = 0,
    @ProtoNumber(3) val userId: String = "",
    @ProtoNumber(4) val contentId: String = "",
    @ProtoNumber(5) val gameId: Long = 0,
    @ProtoNumber(6) val achievementId: Long = 0,
    @ProtoNumber(7) val isHardcore: Boolean = false,
    @ProtoNumber(8) val sessionId: String = "",
    @ProtoNumber(9) val localTimestampEpochMs: Long = 0,
    @ProtoNumber(10) val offsetFromSessionStartMs: Long = 0,
    @ProtoNumber(11) val orderIndex: Long = 0,
    @ProtoNumber(12) val ackedSeq: Long = 0,
    @ProtoNumber(13) val estimatedPlayDurationMs: Long = 0,
    @ProtoNumber(14) val prevHash: ByteArray = ByteArray(0),
    @ProtoNumber(15) val unlockMode: OfflineUnlockMode = OfflineUnlockMode.UNKNOWN,
    @ProtoNumber(16) val offlineType: OfflineUnlockType = OfflineUnlockType.UNKNOWN,
    @ProtoNumber(17) val pendingSync: Boolean = false,
)

@Serializable
data class OfflineLedgerRecord(
    @ProtoNumber(1) val payload: OfflineLedgerPayload = OfflineLedgerPayload(),
    @ProtoNumber(2) val payloadHash: ByteArray = ByteArray(0),
    @ProtoNumber(3) val signature: ByteArray = ByteArray(0),
)

@Serializable
data class OfflineLedgerFile(
    @ProtoNumber(1) val records: List<OfflineLedgerRecord> = emptyList(),
)

data class OfflineUnlockEvent(
    val seq: Long,
    val userId: String,
    val contentId: String,
    val gameId: Long,
    val achievementId: Long,
    val isHardcore: Boolean,
    val sessionId: String,
    val localTimestampEpochMs: Long,
    val offsetFromSessionStartMs: Long,
    val orderIndex: Long,
    val unlockMode: OfflineUnlockMode = if (isHardcore) OfflineUnlockMode.HARDCORE else OfflineUnlockMode.SOFTCORE,
    val offlineType: OfflineUnlockType = OfflineUnlockType.OFFLINE_AFTER_START,
    val pendingSync: Boolean = true,
)

data class OfflineSessionEvent(
    val seq: Long,
    val sessionId: String,
    val startedAtEpochMs: Long?,
    val endedAtEpochMs: Long?,
    val estimatedPlayDurationMs: Long?,
)

enum class OfflineLedgerIntegrity {
    OK,
    EMPTY,
    TAMPERED,
    SIGNING_KEY_INVALID,
    IO_ERROR,
}

data class OfflineLedgerStatus(
    val integrity: OfflineLedgerIntegrity,
    val pendingUnlocks: List<OfflineUnlockEvent> = emptyList(),
    val sessions: Map<String, OfflineSessionEvent> = emptyMap(),
) {
    val pendingUnlockCount: Int get() = pendingUnlocks.size
    val pendingSoftcoreUnlockCount: Int get() = pendingUnlocks.count { it.unlockMode == OfflineUnlockMode.SOFTCORE }
    val pendingHardcoreUnlockCount: Int get() = pendingUnlocks.count { it.unlockMode == OfflineUnlockMode.HARDCORE }
    val hasPendingHardcoreUnlocks: Boolean get() = pendingHardcoreUnlockCount > 0
}
