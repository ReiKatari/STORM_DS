package me.magnum.melonds

/**
 * JNI bridge for DSi ROM Modcrypt decryption.
 * Checks if a ROM file is encrypted (AES-128-CTR Modcrypt) and can decrypt it in-place on disk.
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
        return EncryptionStatus.fromCode(checkEncryptionNative(romPath))
    }

    fun decryptRom(romPath: String, progressCallback: DecryptProgressCallback? = null): DecryptResult {
        return DecryptResult.fromCode(decryptRomNative(romPath, progressCallback))
    }

    private external fun checkEncryptionNative(romPath: String): Int
    private external fun decryptRomNative(romPath: String, progressCallback: DecryptProgressCallback?): Int
}
