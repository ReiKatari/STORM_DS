package me.magnum.melonds

import android.content.Context
import android.net.Uri
import android.os.ParcelFileDescriptor
import android.util.Log
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.utils.FileUtils
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

/**
 * JNI bridge for DSi ROM Modcrypt decryption.
 * Checks if a ROM file is encrypted (AES-128-CTR Modcrypt) and can decrypt it in-place on disk.
 * Supports direct file paths, SAF ParcelFileDescriptors, and robust stream cache fallbacks.
 */
object MelonRomDecryptor {
    private const val TAG = "MelonRomDecryptor"

    enum class EncryptionStatus(val code: Int) {
        NOT_ENCRYPTED(0),
        MODCRYPT_ENCRYPTED(1),
        ERROR_READING_FILE(-1),
        ERROR_NOT_DSI_ROM(-2),
        ERROR_FILE_TOO_SMALL(-3);

        companion object {
            fun fromCode(code: Int): EncryptionStatus =
                entries.find { it.code == code } ?: ERROR_READING_FILE
        }
    }

    enum class DecryptResult(val code: Int) {
        SUCCESS(0),
        ALREADY_DECRYPTED(1),
        ERROR_READING_FILE(-1),
        ERROR_WRITING_FILE(-2),
        ERROR_NOT_DSI_ROM(-3),
        ERROR_FILE_TOO_SMALL(-4),
        ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS(-5);

        companion object {
            fun fromCode(code: Int): DecryptResult =
                entries.find { it.code == code } ?: ERROR_READING_FILE
        }
    }

    interface DecryptProgressCallback {
        fun onProgress(current: Int, total: Int)
    }

    fun checkEncryption(romPath: String): EncryptionStatus {
        return try {
            EncryptionStatus.fromCode(checkEncryptionNative(romPath))
        } catch (_: Throwable) {
            EncryptionStatus.ERROR_READING_FILE
        }
    }

    fun checkEncryption(context: Context, uri: Uri): EncryptionStatus {
        if (uri.scheme == Rom.INSTALLED_DSIWARE_URI_SCHEME) {
            return EncryptionStatus.NOT_ENCRYPTED
        }

        val path = FileUtils.getAbsolutePathFromSAFUri(context, uri)
        if (path != null) {
            val status = checkEncryption(path)
            if (status != EncryptionStatus.ERROR_READING_FILE) {
                return status
            }
        }

        return try {
            context.contentResolver.openFileDescriptor(uri, "r")?.use { pfd ->
                EncryptionStatus.fromCode(checkEncryptionFdNative(pfd.fd))
            } ?: EncryptionStatus.ERROR_READING_FILE
        } catch (_: Throwable) {
            EncryptionStatus.ERROR_READING_FILE
        }
    }

    fun decryptRom(romPath: String, progressCallback: DecryptProgressCallback? = null): DecryptResult {
        return try {
            DecryptResult.fromCode(decryptRomNative(romPath, progressCallback))
        } catch (_: Throwable) {
            DecryptResult.ERROR_READING_FILE
        }
    }

    fun decryptRom(context: Context, uri: Uri, progressCallback: DecryptProgressCallback? = null): DecryptResult {
        if (uri.scheme == Rom.INSTALLED_DSIWARE_URI_SCHEME) {
            return DecryptResult.ALREADY_DECRYPTED
        }

        val path = FileUtils.getAbsolutePathFromSAFUri(context, uri)
        if (path != null) {
            val result = decryptRom(path, progressCallback)
            if (result == DecryptResult.SUCCESS || result == DecryptResult.ALREADY_DECRYPTED) {
                return result
            }
        }

        // Try direct file descriptor
        val fdResult = try {
            context.contentResolver.openFileDescriptor(uri, "rw")?.use { pfd ->
                DecryptResult.fromCode(decryptRomFdNative(pfd.fd, progressCallback))
            }
        } catch (e: Throwable) {
            Log.w(TAG, "Direct FD decryption open failed: ${e.message}, trying stream copy fallback")
            null
        }

        if (fdResult == DecryptResult.SUCCESS || fdResult == DecryptResult.ALREADY_DECRYPTED) {
            return fdResult
        }

        // Fallback: Copy to cache -> Decrypt -> Write back to SAF output stream
        return try {
            val cacheFile = File(context.cacheDir, "modcrypt_temp_${System.currentTimeMillis()}.nds")
            context.contentResolver.openInputStream(uri)?.use { input ->
                FileOutputStream(cacheFile).use { output ->
                    input.copyTo(output)
                }
            } ?: return DecryptResult.ERROR_READING_FILE

            val tempResult = decryptRom(cacheFile.absolutePath, progressCallback)
            if (tempResult == DecryptResult.SUCCESS || tempResult == DecryptResult.ALREADY_DECRYPTED) {
                val outStream = runCatching { context.contentResolver.openOutputStream(uri, "rwt") }.getOrNull()
                    ?: runCatching { context.contentResolver.openOutputStream(uri, "wt") }.getOrNull()
                    ?: runCatching { context.contentResolver.openOutputStream(uri, "w") }.getOrNull()
                    ?: runCatching { context.contentResolver.openOutputStream(uri) }.getOrNull()

                if (outStream != null) {
                    outStream.use { out ->
                        FileInputStream(cacheFile).use { inStream ->
                            inStream.copyTo(out)
                        }
                    }
                    cacheFile.delete()
                    DecryptResult.SUCCESS
                } else {
                    cacheFile.delete()
                    DecryptResult.ERROR_WRITING_FILE
                }
            } else {
                cacheFile.delete()
                tempResult
            }
        } catch (e: Throwable) {
            Log.e(TAG, "Fallback decryption failed: ${e.message}")
            DecryptResult.ERROR_READING_FILE
        }
    }

    private external fun checkEncryptionNative(romPath: String): Int
    private external fun checkEncryptionFdNative(fd: Int): Int
    private external fun decryptRomNative(romPath: String, progressCallback: DecryptProgressCallback?): Int
    private external fun decryptRomFdNative(fd: Int, progressCallback: DecryptProgressCallback?): Int
}
