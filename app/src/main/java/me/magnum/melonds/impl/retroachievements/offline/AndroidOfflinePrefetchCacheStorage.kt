package me.magnum.melonds.impl.retroachievements.offline

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Stores the RetroAchievements prefetch cache in an encrypted, app-private file.
 *
 * This cache is not meant to prevent runtime cheating; it's only used to enable offline evaluation
 * after a warm-start while the user was online.
 */
@Singleton
class AndroidOfflinePrefetchCacheStorage @Inject constructor(
    private val encryptedFileStore: AndroidEncryptedFileStore,
    @ApplicationContext context: Context,
) : OfflinePrefetchCacheStorage {

    private val baseDir = File(context.noBackupFilesDir, "ra_offline/prefetch")

    override suspend fun exists(userId: String, contentId: String): Boolean {
        return cacheFile(userId, contentId).exists()
    }

    override suspend fun read(userId: String, contentId: String): ByteArray? {
        return encryptedFileStore.read(cacheFile(userId, contentId))
    }

    override suspend fun write(userId: String, contentId: String, bytes: ByteArray) {
        encryptedFileStore.writeAtomically(cacheFile(userId, contentId), bytes)
    }

    override suspend fun delete(userId: String, contentId: String) {
        encryptedFileStore.delete(cacheFile(userId, contentId))
    }

    private fun cacheFile(userId: String, contentId: String): File {
        val userDir = File(baseDir, sha256Hex(userId.encodeToByteArray()))
        return File(userDir, "${sha256Hex(contentId.encodeToByteArray())}.pb")
    }
}

