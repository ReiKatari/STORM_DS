package me.magnum.melonds.impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.repositories.DSiWareMetadataRepository
import java.io.EOFException
import java.net.URL
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.charset.StandardCharsets

class NusDSiWareMetadataRepository : DSiWareMetadataRepository {

    companion object {
        const val TMD_METADATA_SIZE = 520

        fun createTmd(
            categoryId: UInt,
            titleId: UInt,
            publicSaveSize: UInt = 0u,
            privateSaveSize: UInt = 0u,
            titleVersion: UShort = 0u,
            contentSize: Long = 0L,
            contentSha1: ByteArray? = null,
        ): ByteArray {
            val tmd = ByteArray(TMD_METADATA_SIZE)
            val buffer = ByteBuffer.wrap(tmd).order(ByteOrder.BIG_ENDIAN)

            // Signature Type: RSA-2048 (0x00010001)
            buffer.putInt(0x000, 0x00010001)

            // Issuer string at 0x140
            val issuer = "Root-CA00000001-CP0000000b".toByteArray(StandardCharsets.US_ASCII)
            System.arraycopy(issuer, 0, tmd, 0x140, issuer.size.coerceAtMost(64))

            // System Version at 0x184 (8 bytes) -> 0x0000000100000000
            buffer.putLong(0x184, 0x0000000100000000L)

            // Title ID: Category (4 bytes BE at 0x18C) + Title ID (4 bytes BE at 0x190)
            buffer.putInt(0x18C, categoryId.toInt())
            buffer.putInt(0x190, titleId.toInt())

            // Public Save Size at 0x19A (4 bytes BE)
            buffer.putInt(0x19A, publicSaveSize.toInt())

            // Private Save Size at 0x19E (4 bytes BE)
            buffer.putInt(0x19E, privateSaveSize.toInt())

            // Title Version at 0x1DC (2 bytes BE)
            buffer.putShort(0x1DC, titleVersion.toShort())

            // Number of Contents at 0x1DE (2 bytes BE) = 1
            buffer.putShort(0x1DE, 1.toShort())

            // Boot Content Index at 0x1E0 (2 bytes BE) = 0
            buffer.putShort(0x1E0, 0.toShort())

            // Content ID at 0x1E4 (4 bytes BE) = 0
            buffer.putInt(0x1E4, 0)

            // Content Index at 0x1E8 (2 bytes BE) = 0
            buffer.putShort(0x1E8, 0)

            // Content Type at 0x1EA (2 bytes BE) = 1
            buffer.putShort(0x1EA, 1.toShort())

            // Content Size at 0x1EC (8 bytes BE)
            buffer.putLong(0x1EC, contentSize)

            // Content SHA-1 Hash at 0x1F4 (20 bytes)
            if (contentSha1 != null && contentSha1.size >= 20) {
                System.arraycopy(contentSha1, 0, tmd, 0x1F4, 20)
            }

            return tmd
        }
    }

    override suspend fun getDSiWareTitleMetadata(categoryId: UInt, titleId: UInt): ByteArray = withContext(Dispatchers.IO) {
        val categoryIdHex = categoryId.toString(16).padStart(8, '0')
        val titleIdHex = titleId.toString(16).padStart(8, '0')
        val url = "http://nus.cdn.t.shop.nintendowifi.net/ccs/download/$categoryIdHex$titleIdHex/tmd"
        val downloaded = runCatching {
            val connection = URL(url).openConnection().apply {
                connectTimeout = 3_000
                readTimeout = 3_000
            }
            val tmdMetadata = connection.getInputStream().use { it.readBytes() }
            if (tmdMetadata.size >= TMD_METADATA_SIZE) {
                tmdMetadata.copyOf(TMD_METADATA_SIZE)
            } else null
        }.getOrNull()

        downloaded ?: createTmd(categoryId, titleId)
    }
}

