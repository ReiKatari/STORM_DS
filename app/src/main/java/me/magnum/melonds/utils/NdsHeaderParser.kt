package me.magnum.melonds.utils

import android.content.Context
import android.net.Uri
import java.io.InputStream
import java.nio.charset.StandardCharsets

object NdsHeaderParser {
    data class ParsedHeader(
        val rawBytes: ByteArray,
        val bytesRead: Int,
        val gameCode: String,
        val unitCode: Int,
        val romVersion: UShort,
        val titleIdFromGameCode: Long?,
        val categoryLow: Int,
        val categoryHigh: Int,
        val publicSaveSize: UInt,
        val privateSaveSize: UInt,
    ) {
        val isDsiWare: Boolean
            get() {
                val gc0 = gameCode.getOrNull(0)
                return unitCode == 0x03 ||
                    categoryHigh == 0x00030004 ||
                    categoryHigh == 0x04000300 ||
                    categoryHigh == 0x00030005 ||
                    categoryLow == 0x00030004 ||
                    gc0 == 'K' ||
                    gc0 == 'H' ||
                    gc0 == '4'
            }
    }

    fun readHeader(
        context: Context,
        uri: Uri,
        maxBytes: Int = 0x1000,
        minBytes: Int = 0x10,
    ): ParsedHeader? {
        return runCatching {
            context.contentResolver.openInputStream(uri)?.use { stream ->
                readHeader(stream, maxBytes, minBytes)
            }
        }.getOrNull()
    }

    fun readHeader(
        stream: InputStream,
        maxBytes: Int = 0x1000,
        minBytes: Int = 0x10,
    ): ParsedHeader? {
        val buf = ByteArray(maxBytes)
        var read = 0
        while (read < maxBytes) {
            val count = stream.read(buf, read, maxBytes - read)
            if (count <= 0) break
            read += count
        }
        if (read < minBytes) return null
        return parse(buf, read)
    }

    fun parse(header: ByteArray, length: Int = header.size): ParsedHeader? {
        if (length < 0x10) return null
        val gameCode = String(header, 0x0C, 4, StandardCharsets.US_ASCII)
        val gc0 = (header[0x0C].toInt() and 0xFF).toLong()
        val gc1 = (header[0x0D].toInt() and 0xFF).toLong()
        val gc2 = (header[0x0E].toInt() and 0xFF).toLong()
        val gc3 = (header[0x0F].toInt() and 0xFF).toLong()
        val rawTitleId = ((gc0 shl 24) or (gc1 shl 16) or (gc2 shl 8) or gc3) and 0xFFFFFFFFL
        val unitCode = if (length > 0x12) header[0x12].toInt() and 0xFF else 0
        val romVersion = if (length > 0x1E) (header[0x1E].toInt() and 0xFF).toUShort() else 0u
        val categoryLow = if (length >= 0x234) readUInt32Le(header, 0x230).toInt() else 0
        val categoryHigh = if (length >= 0x238) readUInt32Le(header, 0x234).toInt() else 0
        val pubSav = if (length >= 0x23C) readUInt32Le(header, 0x238) else 0u
        val privSav = if (length >= 0x240) readUInt32Le(header, 0x23C) else 0u

        return ParsedHeader(
            rawBytes = header,
            bytesRead = length,
            gameCode = gameCode,
            unitCode = unitCode,
            romVersion = romVersion,
            titleIdFromGameCode = if (rawTitleId != 0L) rawTitleId else null,
            categoryLow = categoryLow,
            categoryHigh = categoryHigh,
            publicSaveSize = pubSav,
            privateSaveSize = privSav,
        )
    }

    fun readUInt32Le(bytes: ByteArray, offset: Int): UInt {
        return ((bytes[offset].toInt() and 0xFF) or
            ((bytes[offset + 1].toInt() and 0xFF) shl 8) or
            ((bytes[offset + 2].toInt() and 0xFF) shl 16) or
            ((bytes[offset + 3].toInt() and 0xFF) shl 24)).toUInt()
    }
}
