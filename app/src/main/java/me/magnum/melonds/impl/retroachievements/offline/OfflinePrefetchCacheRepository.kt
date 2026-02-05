package me.magnum.melonds.impl.retroachievements.offline

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class OfflinePrefetchCacheRepository(
    private val storage: OfflinePrefetchCacheStorage,
) {
    private val mutex = Mutex()

    suspend fun hasCache(userId: String, contentId: String): Boolean {
        return storage.exists(userId, contentId)
    }

    suspend fun read(userId: String, contentId: String): OfflinePrefetchCacheFile? {
        return mutex.withLock {
            val bytes = try {
                storage.read(userId, contentId)
            } catch (e: CancellationException) {
                throw e
            } catch (_: Exception) {
                null
            } ?: return@withLock null

            try {
                OfflinePrefetchCacheCodec.decode(bytes)
            } catch (e: CancellationException) {
                throw e
            } catch (_: Exception) {
                null
            }
        }
    }

    suspend fun readValid(userId: String, contentId: String): OfflinePrefetchCacheFile? {
        val cache = read(userId, contentId) ?: return null
        if (cache.gameId == 0L) return null
        if (cache.romHash != contentId) return null
        return cache
    }

    suspend fun write(userId: String, contentId: String, file: OfflinePrefetchCacheFile) {
        mutex.withLock {
            storage.write(userId, contentId, OfflinePrefetchCacheCodec.encode(file))
        }
    }
}
