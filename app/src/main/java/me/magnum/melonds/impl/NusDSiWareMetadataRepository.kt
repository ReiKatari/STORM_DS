package me.magnum.melonds.impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.repositories.DSiWareMetadataRepository
import java.io.EOFException
import java.net.URL

class NusDSiWareMetadataRepository : DSiWareMetadataRepository {

    private companion object {
        const val TMD_METADATA_SIZE = 520
    }

    override suspend fun getDSiWareTitleMetadata(categoryId: UInt, titleId: UInt): ByteArray = withContext(Dispatchers.IO) {
        val categoryIdHex = categoryId.toString(16).padStart(8, '0')
        val titleIdHex = titleId.toString(16).padStart(8, '0')
        val url = "http://nus.cdn.t.shop.nintendowifi.net/ccs/download/$categoryIdHex$titleIdHex/tmd"
        val connection = URL(url).openConnection().apply {
            connectTimeout = 10_000
            readTimeout = 10_000
        }
        val tmdMetadata = connection.getInputStream().use { it.readBytes() }
        if (tmdMetadata.size < TMD_METADATA_SIZE) {
            throw EOFException("TMD response is too small: ${tmdMetadata.size} bytes")
        }

        tmdMetadata.copyOf(TMD_METADATA_SIZE)
    }
}
