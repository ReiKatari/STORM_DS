package me.magnum.melonds.impl.retroachievements.offline

interface OfflinePrefetchCacheStorage {
    suspend fun exists(userId: String, contentId: String): Boolean
    suspend fun read(userId: String, contentId: String): ByteArray?
    suspend fun write(userId: String, contentId: String, bytes: ByteArray)
    suspend fun delete(userId: String, contentId: String)
}

