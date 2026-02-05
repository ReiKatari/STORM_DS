package me.magnum.melonds.impl.retroachievements.offline

import android.content.Context
import androidx.security.crypto.EncryptedFile
import androidx.security.crypto.MasterKeys
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AndroidEncryptedFileStore @Inject constructor(
    @ApplicationContext private val context: Context,
) {

    @Suppress("DEPRECATION")
    private val masterKeyAlias: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
    }

    suspend fun read(file: File): ByteArray? = withContext(Dispatchers.IO) {
        if (!file.exists()) return@withContext null
        encryptedFile(file).openFileInput().use { it.readBytes() }
    }

    suspend fun writeAtomically(file: File, bytes: ByteArray) = withContext(Dispatchers.IO) {
        val parent = file.parentFile
        if (parent == null) {
            // Best-effort fallback (should not happen for our use-cases).
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
        // Therefore, if we encrypt using a different filename and then rename the file,
        // decryption will fail. Keep the filename identical and only change its directory.
        val tmpDir = File(parent, ".tmp")
        if (!tmpDir.exists()) {
            tmpDir.mkdirs()
        }

        val tmpFile = File(tmpDir, file.name)
        if (tmpFile.exists()) {
            tmpFile.delete()
        }

        encryptedFile(tmpFile).openFileOutput().use { output ->
            output.write(bytes)
        }

        if (file.exists()) {
            file.delete()
        }

        if (!tmpFile.renameTo(file)) {
            tmpFile.copyTo(target = file, overwrite = true)
            tmpFile.delete()
        }
    }

    suspend fun delete(file: File) = withContext(Dispatchers.IO) {
        file.delete()
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
