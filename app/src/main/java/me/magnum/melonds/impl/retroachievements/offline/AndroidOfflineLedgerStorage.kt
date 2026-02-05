package me.magnum.melonds.impl.retroachievements.offline

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Stores the offline ledger in an encrypted, app-private file.
 *
 * Note: Encryption protects confidentiality at rest; tamper detection comes from the hash-chain + signatures.
 */
@Singleton
class AndroidOfflineLedgerStorage @Inject constructor(
    private val encryptedFileStore: AndroidEncryptedFileStore,
    @ApplicationContext context: Context,
) : OfflineLedgerStorage {

    private val baseDir = File(context.noBackupFilesDir, "ra_offline/ledger")

    override suspend fun exists(userId: String, contentId: String): Boolean {
        return ledgerFile(userId, contentId).exists()
    }

    override suspend fun read(userId: String, contentId: String): ByteArray? {
        return encryptedFileStore.read(ledgerFile(userId, contentId))
    }

    override suspend fun write(userId: String, contentId: String, bytes: ByteArray) {
        encryptedFileStore.writeAtomically(ledgerFile(userId, contentId), bytes)
    }

    override suspend fun delete(userId: String, contentId: String) {
        encryptedFileStore.delete(ledgerFile(userId, contentId))
    }

    private fun ledgerFile(userId: String, contentId: String): File {
        val userDir = File(baseDir, sha256Hex(userId.encodeToByteArray()))
        return File(userDir, "${sha256Hex(contentId.encodeToByteArray())}.pb")
    }
}

