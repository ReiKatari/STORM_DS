package me.magnum.melonds.impl.retroachievements.offline

import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@Serializable
data class OfflinePrefetchCacheAchievement(
    @ProtoNumber(1) val id: Long = 0,
    @ProtoNumber(2) val memoryAddress: String = "",
)

@Serializable
data class OfflinePrefetchCacheLeaderboard(
    @ProtoNumber(1) val id: Long = 0,
    @ProtoNumber(2) val memoryAddress: String = "",
    @ProtoNumber(3) val format: String = "",
)

@Serializable
data class OfflinePrefetchCacheFile(
    @ProtoNumber(1) val romHash: String = "",
    @ProtoNumber(2) val gameId: Long = 0,
    @ProtoNumber(3) val achievements: List<OfflinePrefetchCacheAchievement> = emptyList(),
    @ProtoNumber(4) val leaderboards: List<OfflinePrefetchCacheLeaderboard> = emptyList(),
    @ProtoNumber(5) val richPresencePatch: String? = null,
    @ProtoNumber(6) val iconUrl: String = "",
    @ProtoNumber(7) val fetchedAtEpochMs: Long = 0,
)

object OfflinePrefetchCacheCodec {
    fun encode(file: OfflinePrefetchCacheFile): ByteArray {
        return OfflineLedgerCodec.proto.encodeToByteArray(OfflinePrefetchCacheFile.serializer(), file)
    }

    fun decode(bytes: ByteArray): OfflinePrefetchCacheFile {
        return OfflineLedgerCodec.proto.decodeFromByteArray(OfflinePrefetchCacheFile.serializer(), bytes)
    }
}

