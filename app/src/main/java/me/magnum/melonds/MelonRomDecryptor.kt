package me.magnum.melonds

import android.content.Context
import android.net.Uri
import android.os.ParcelFileDescriptor
import me.magnum.melonds.utils.FileUtils

/**
 * JNI bridge for DSi ROM Modcrypt decryption.
 * Checks if a ROM file is encrypted (AES-128-CTR Modcrypt) and can decrypt it in-place on disk.
 * Supports direct file paths and Android Storage Access Framework (SAF) content:// URIs via ParcelFileDescriptor.
 */
object MelonRomDecryptor {

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
        val path = FileUtils.getAbsolutePathFromSAFUri(context, uri)
        if (path != null) {
            val result = decryptRom(path, progressCallback)
            if (result == DecryptResult.SUCCESS || result == DecryptResult.ALREADY_DECRYPTED) {
                return result
            }
        }

        return try {
            context.contentResolver.openFileDescriptor(uri, "rw")?.use { pfd ->
                DecryptResult.fromCode(decryptRomFdNative(pfd.fd, progressCallback))
            } ?: DecryptResult.ERROR_READING_FILE
        } catch (_: Throwable) {
            DecryptResult.ERROR_READING_FILE
        }
    }

    private external fun checkEncryptionNative(romPath: String): Int
    private external fun checkEncryptionFdNative(fd: Int): Int
    private external fun decryptRomNative(romPath: String, progressCallback: DecryptProgressCallback?): Int
    private external fun decryptRomFdNative(fd: Int, progressCallback: DecryptProgressCallback?): Int
}
