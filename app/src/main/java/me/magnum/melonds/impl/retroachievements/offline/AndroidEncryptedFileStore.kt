package me.magnum.melonds.impl.retroachievements.offline

import android.content.Context
import androidx.security.crypto.EncryptedFile
import androidx.security.crypto.MasterKeys
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import java.io.File
import java.io.IOException
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AndroidEncryptedFileStore @Inject constructor(
    @ApplicationContext private val context: Context,
) {
    private val lock = Mutex()

    @Suppress("DEPRECATION")
    private val masterKeyAlias: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
    }

    suspend fun read(file: File): ByteArray? = lock.withLock {
        withContext(Dispatchers.IO) {
            if (!file.exists()) return@withContext null
            encryptedFile(file).openFileInput().use { it.readBytes() }
        }
    }

    suspend fun writeAtomically(file: File, bytes: ByteArray) = lock.withLock {
        withContext(Dispatchers.IO) {
            val parent = file.parentFile
            if (parent == null) {
                if (file.exists()) {
                    file.delete()
                }
                encryptedFile(file).openFileOutput().use { output ->
                    output.write(bytes)
                }
                return@withContext
            }

            if (!parent.exists()) {
                parent.mkdirs()
            }

            // Important:
            // EncryptedFile uses `file.name` as associated data for AES-GCM-HKDF.
            // Keep the filename identical and isolate each atomic write in .tmp/<uuid>/<file.name>.
            val tmpParent = File(parent, ".tmp/${UUID.randomUUID()}")
            tmpParent.mkdirs()
            val tmpFile = File(tmpParent, file.name)

            try {
                encryptedFile(tmpFile).openFileOutput().use { output ->
                    output.write(bytes)
                }
                if (!tmpFile.isFile || (bytes.isNotEmpty() && tmpFile.length() <= 0L)) {
                    throw IOException("Encrypted temp file verification failed for ${file.name}")
                }

                if (tmpFile.renameTo(file)) {
                    return@withContext
                }

                val backupFile = if (file.exists()) File(tmpParent, "${file.name}.bak") else null
                val movedOldToBackup = backupFile != null && file.renameTo(backupFile)
                try {
                    if (!tmpFile.renameTo(file)) {
                        tmpFile.copyTo(target = file, overwrite = true)
                    }
                    if (!file.isFile || (bytes.isNotEmpty() && file.length() <= 0L)) {
                        throw IOException("Target file verification failed after copy for ${file.name}")
                    }
                } catch (t: Throwable) {
                    if (movedOldToBackup && backupFile != null && backupFile.exists()) {
                        runCatching {
                            if (file.exists()) file.delete()
                            backupFile.renameTo(file)
                        }
                    }
                    throw t
                }
            } finally {
                runCatching { tmpParent.deleteRecursively() }
            }
        }
    }

    suspend fun delete(file: File) = lock.withLock {
        withContext(Dispatchers.IO) {
            file.delete()
        }
    }

    private fun encryptedFile(file: File): EncryptedFile {
        @Suppress("DEPRECATION")
        return EncryptedFile.Builder(
            file,
            context,
            masterKeyAlias,
            EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB,
        ).build()
    }
}
