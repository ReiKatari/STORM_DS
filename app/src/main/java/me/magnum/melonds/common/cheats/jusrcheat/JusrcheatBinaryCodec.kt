package me.magnum.melonds.common.cheats.jusrcheat

import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.io.RandomAccessFile
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.charset.Charset

/**
 * High-performance binary codec for R4 usrcheat.dat cheat databases.
 * Directly based on and modernized from xperia64/Jusrcheat specification.
 */
object JusrcheatBinaryCodec {
    const val MAGIC = "R4 CheatCode"
    const val HEADER_SIZE = 0x100
    const val DEFAULT_CODE_OFFSET = 0x100

    private val CHARSET_LATIN1: Charset = Charsets.ISO_8859_1
    private val CHARSET_UTF8: Charset = Charsets.UTF_8

    fun alignTo4(pos: Int): Int = (4 - (pos and 3)) and 3

    fun alignStr(len: Int): Int = ((4 - (len and 3)) and 3) + len

    fun isValidHeader(data: ByteArray): Boolean {
        if (data.size < 12) return false
        val magicBytes = MAGIC.toByteArray(CHARSET_LATIN1)
        for (i in magicBytes.indices) {
            if (data[i] != magicBytes[i]) return false
        }
        return true
    }

    fun parseHeader(data: ByteArray): JusrcheatHeader {
        if (!isValidHeader(data)) {
            throw IllegalArgumentException("Invalid usrcheat.dat header: Magic mismatch")
        }
        val buffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN)
        val codeOffset = buffer.getInt(0x0C)

        // Title at 0x10..0x4B
        val titleBytes = ByteArray(59)
        System.arraycopy(data, 0x10, titleBytes, 0, 59)
        var titleLen = 0
        while (titleLen < 59 && titleBytes[titleLen] != 0.toByte()) {
            titleLen++
        }
        val title = String(titleBytes, 0, titleLen, CHARSET_LATIN1).trim()

        val encodingByte = data.getOrNull(0x4C) ?: 0
        val encoding = when (encodingByte.toInt() and 0xFF) {
            0xD5 -> 0 // GBK
            0xF5 -> 1 // BIG5
            0x75 -> 2 // SJIS
            0x55 -> 3 // UTF8
            else -> 3
        }
        val enabled = ((data.getOrNull(0x50)?.toInt() ?: 0) and 0x01) != 0

        return JusrcheatHeader(
            title = title,
            encoding = encoding,
            enabled = enabled,
            codeOffset = if (codeOffset > 0) codeOffset else DEFAULT_CODE_OFFSET
        )
    }

    fun parsePointers(data: ByteArray, codeOffset: Int): List<JusrcheatGamePointer> {
        val pointers = mutableListOf<JusrcheatGamePointer>()
        var offset = if (codeOffset > 0) codeOffset else DEFAULT_CODE_OFFSET
        val buffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN)

        while (offset + 16 <= data.size) {
            val b0 = data[offset]
            if (b0 == 0.toByte()) {
                // Separator block / end of pointer table
                break
            }
            val gameIdBytes = ByteArray(4)
            System.arraycopy(data, offset, gameIdBytes, 0, 4)
            val gameId = String(gameIdBytes, CHARSET_LATIN1)
            val crc32 = buffer.getInt(offset + 4).toLong() and 0xFFFFFFFFL
            val gameOffset = buffer.getInt(offset + 8).toLong() and 0xFFFFFFFFL

            pointers.add(JusrcheatGamePointer(gameId, crc32, gameOffset))
            offset += 16
        }
        return pointers
    }

    fun parseGameMetaList(data: ByteArray, pointers: List<JusrcheatGamePointer>): List<JusrcheatGameMeta> {
        val result = ArrayList<JusrcheatGameMeta>(pointers.size)
        for (i in pointers.indices) {
            val p = pointers[i]
            val gameOffset = p.offset.toInt()
            if (gameOffset < 0 || gameOffset >= data.size) continue

            // Null-terminated game title
            var endTitle = gameOffset
            while (endTitle < data.size && data[endTitle] != 0.toByte()) {
                endTitle++
            }
            val titleBytes = ByteArray(endTitle - gameOffset)
            System.arraycopy(data, gameOffset, titleBytes, 0, titleBytes.size)
            val title = String(titleBytes, CHARSET_LATIN1).trim()

            result.add(
                JusrcheatGameMeta(
                    index = i,
                    gameId = p.gameId,
                    crc32 = p.crc32,
                    title = title,
                    offset = p.offset
                )
            )
        }
        return result
    }

    fun parseGame(data: ByteArray, offset: Long, gameId: String, crc32: Long): JusrcheatGame {
        var cur = offset.toInt()
        if (cur < 0 || cur >= data.size) {
            return JusrcheatGame(gameId, crc32, gameId)
        }

        // Title
        var endTitle = cur
        while (endTitle < data.size && data[endTitle] != 0.toByte()) {
            endTitle++
        }
        val titleLen = endTitle - cur
        val titleBytes = ByteArray(titleLen)
        System.arraycopy(data, cur, titleBytes, 0, titleLen)
        val gameTitle = String(titleBytes, CHARSET_LATIN1).trim()
        cur = endTitle + 1
        cur += alignTo4(titleLen + 1)

        val buffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN)
        if (cur + 4 > data.size) {
            return JusrcheatGame(gameId, crc32, gameTitle)
        }

        val numItems = buffer.getShort(cur).toInt() and 0xFFFF
        val flags = buffer.getShort(cur + 2).toInt() and 0xFFFF
        cur += 4

        val gameEnabled = (flags and 0xF0) == 0xF0

        // Master code (8 ints = 32 bytes)
        val masterCodes = ArrayList<Int>(8)
        if (cur + 32 <= data.size) {
            for (m in 0 until 8) {
                masterCodes.add(buffer.getInt(cur + m * 4))
            }
            cur += 32
        }

        val folders = mutableListOf<JusrcheatFolder>()
        val directCheats = mutableListOf<JusrcheatCode>()

        var processedItems = 0
        while (processedItems < numItems && cur + 4 <= data.size) {
            val numberThings = buffer.getShort(cur).toInt() and 0xFFFF
            val itemFlags = buffer.getShort(cur + 2).toInt() and 0xFFFF
            cur += 4

            val isFolder = (itemFlags and 0x1000) != 0

            // Read item name
            var endName = cur
            while (endName < data.size && data[endName] != 0.toByte()) {
                endName++
            }
            val nameLen = endName - cur
            val nameBytes = ByteArray(nameLen)
            System.arraycopy(data, cur, nameBytes, 0, nameLen)
            val itemName = String(nameBytes, CHARSET_LATIN1).trim()
            cur = endName + 1

            // Read item desc
            var endDesc = cur
            while (endDesc < data.size && data[endDesc] != 0.toByte()) {
                endDesc++
            }
            val descLen = endDesc - cur
            val descBytes = ByteArray(descLen)
            System.arraycopy(data, cur, descBytes, 0, descLen)
            val itemDesc = String(descBytes, CHARSET_LATIN1).trim()
            cur = endDesc + 1

            cur += alignTo4(nameLen + 1 + descLen + 1)

            if (isFolder) {
                processedItems += 1
                val oneHot = (itemFlags and 0x0100) != 0
                val folder = JusrcheatFolder(
                    name = itemName,
                    note = itemDesc,
                    oneHot = oneHot
                )

                for (c in 0 until numberThings) {
                    if (cur + 4 > data.size) break
                    val codeNumberThings = buffer.getShort(cur).toInt() and 0xFFFF
                    val codeFlags = buffer.getShort(cur + 2).toInt() and 0xFFFF
                    cur += 4

                    val codeEnabled = (codeFlags and 0x0100) != 0

                    var cEndName = cur
                    while (cEndName < data.size && data[cEndName] != 0.toByte()) {
                        cEndName++
                    }
                    val cNameLen = cEndName - cur
                    val cNameBytes = ByteArray(cNameLen)
                    System.arraycopy(data, cur, cNameBytes, 0, cNameLen)
                    val cName = String(cNameBytes, CHARSET_LATIN1).trim()
                    cur = cEndName + 1

                    var cEndDesc = cur
                    while (cEndDesc < data.size && data[cEndDesc] != 0.toByte()) {
                        cEndDesc++
                    }
                    val cDescLen = cEndDesc - cur
                    val cDescBytes = ByteArray(cDescLen)
                    System.arraycopy(data, cur, cDescBytes, 0, cDescLen)
                    val cDesc = String(cDescBytes, CHARSET_LATIN1).trim()
                    cur = cEndDesc + 1

                    cur += alignTo4(cNameLen + 1 + cDescLen + 1)

                    if (cur + 4 <= data.size) {
                        val codeChunks = buffer.getInt(cur)
                        cur += 4

                        val words = ArrayList<Int>(codeChunks)
                        for (w in 0 until codeChunks) {
                            if (cur + 4 <= data.size) {
                                words.add(buffer.getInt(cur))
                                cur += 4
                            }
                        }

                        val parsedCode = JusrcheatCode(
                            name = cName,
                            note = cDesc,
                            enabled = codeEnabled,
                            codeWords = words
                        )
                        parsedCode.codeHexLines = parsedCode.getFormattedCode()
                        folder.cheats.add(parsedCode)
                    }
                }
                processedItems += numberThings
                folders.add(folder)
            } else {
                processedItems += 1
                val codeEnabled = (itemFlags and 0x0100) != 0
                val words = ArrayList<Int>()

                if (cur + 4 <= data.size) {
                    val codeChunks = buffer.getInt(cur)
                    cur += 4
                    for (w in 0 until codeChunks) {
                        if (cur + 4 <= data.size) {
                            words.add(buffer.getInt(cur))
                            cur += 4
                        }
                    }
                }

                val parsedCode = JusrcheatCode(
                    name = itemName,
                    note = itemDesc,
                    enabled = codeEnabled,
                    codeWords = words
                )
                parsedCode.codeHexLines = parsedCode.getFormattedCode()
                directCheats.add(parsedCode)
            }
        }

        return JusrcheatGame(
            gameId = gameId,
            crc32 = crc32,
            title = gameTitle,
            enabled = gameEnabled,
            masterCode = masterCodes,
            folders = folders,
            directCheats = directCheats
        )
    }

    fun parseCodeHexLinesToWords(codeHexLines: String): List<Int> {
        val cleaned = codeHexLines.replace("\n", " ").replace("\r", " ").trim()
        val tokens = cleaned.split("\\s+".toRegex()).filter { it.isNotBlank() }
        val words = ArrayList<Int>(tokens.size)
        for (token in tokens) {
            val hex = token.trim()
            if (hex.length == 8) {
                runCatching {
                    words.add(hex.toLong(16).toInt())
                }
            }
        }
        return words
    }

    private fun stringToAlignedBytes(s: String): ByteArray {
        val raw = s.toByteArray(CHARSET_LATIN1)
        val pad = alignTo4(raw.size + 1)
        val out = ByteArray(raw.size + 1 + pad)
        System.arraycopy(raw, 0, out, 0, raw.size)
        return out
    }

    private fun stringsToAlignedBytes(s1: String, s2: String): ByteArray {
        val b1 = s1.toByteArray(CHARSET_LATIN1)
        val b2 = s2.toByteArray(CHARSET_LATIN1)
        val totalLen = b1.size + 1 + b2.size + 1
        val pad = alignTo4(totalLen)
        val out = ByteArray(totalLen + pad)
        System.arraycopy(b1, 0, out, 0, b1.size)
        // b1 null byte is at b1.size (already 0)
        System.arraycopy(b2, 0, out, b1.size + 1, b2.size)
        // b2 null byte is at b1.size + 1 + b2.size (already 0)
        return out
    }

    fun serializeCode(code: JusrcheatCode): ByteArray {
        val words = if (code.codeWords.isNotEmpty()) code.codeWords else parseCodeHexLinesToWords(code.codeHexLines)
        val textBytes = stringsToAlignedBytes(code.name, code.note)
        val chunks = (textBytes.size / 4) + 1 + words.size

        val totalSize = 4 + textBytes.size + 4 + words.size * 4
        val out = ByteArray(totalSize)
        val buf = ByteBuffer.wrap(out).order(ByteOrder.LITTLE_ENDIAN)

        buf.putShort(chunks.toShort())
        buf.put(0.toByte())
        buf.put(if (code.enabled) 1.toByte() else 0.toByte())
        buf.put(textBytes)
        buf.putInt(words.size)
        for (w in words) {
            buf.putInt(w)
        }
        return out
    }

    fun serializeFolder(folder: JusrcheatFolder): ByteArray {
        val textBytes = stringsToAlignedBytes(folder.name, folder.note)
        val childCodesBytes = ByteArrayOutputStream()
        for (c in folder.cheats) {
            childCodesBytes.write(serializeCode(c))
        }
        val childBytes = childCodesBytes.toByteArray()

        val totalSize = 4 + textBytes.size + childBytes.size
        val out = ByteArray(totalSize)
        val buf = ByteBuffer.wrap(out).order(ByteOrder.LITTLE_ENDIAN)

        buf.putShort(folder.cheats.size.toShort())
        buf.put(0.toByte())
        val flagByte = (0x10 or (if (folder.oneHot) 1 else 0)).toByte()
        buf.put(flagByte)
        buf.put(textBytes)
        buf.put(childBytes)
        return out
    }

    fun serializeGame(game: JusrcheatGame): ByteArray {
        val titleBytes = stringToAlignedBytes(game.title)
        val itemsStream = ByteArrayOutputStream()

        for (c in game.directCheats) {
            itemsStream.write(serializeCode(c))
        }
        for (f in game.folders) {
            itemsStream.write(serializeFolder(f))
        }
        val itemsBytes = itemsStream.toByteArray()

        // Total number of items: direct cheats + folders + total codes inside folders
        val totalItems = game.directCheats.size + game.folders.size + game.folders.sumOf { it.cheats.size }

        val totalSize = titleBytes.size + 4 + 32 + itemsBytes.size
        val out = ByteArray(totalSize)
        val buf = ByteBuffer.wrap(out).order(ByteOrder.LITTLE_ENDIAN)

        buf.put(titleBytes)
        buf.putShort(totalItems.toShort())
        buf.put(0.toByte())
        buf.put(if (game.enabled) 0xF0.toByte() else 0.toByte())

        // Master code: 8 ints
        for (i in 0 until 8) {
            val mc = if (i < game.masterCode.size) game.masterCode[i] else if (i == 1) 1 else 0
            buf.putInt(mc)
        }
        buf.put(itemsBytes)
        return out
    }

    fun writeUsrcheat(outputStream: OutputStream, header: JusrcheatHeader, games: List<JusrcheatGame>) {
        val headerBytes = ByteArray(HEADER_SIZE)
        val magicBytes = MAGIC.toByteArray(CHARSET_LATIN1)
        System.arraycopy(magicBytes, 0, headerBytes, 0, magicBytes.size)

        val hBuf = ByteBuffer.wrap(headerBytes).order(ByteOrder.LITTLE_ENDIAN)
        hBuf.putInt(0x0C, DEFAULT_CODE_OFFSET)

        val titleRaw = header.title.take(59).toByteArray(CHARSET_LATIN1)
        System.arraycopy(titleRaw, 0, headerBytes, 0x10, titleRaw.size)

        // Encoding bytes
        headerBytes[0x4C] = 0x55.toByte()
        headerBytes[0x4D] = 0x73.toByte()
        headerBytes[0x4E] = 0x41.toByte()
        headerBytes[0x4F] = 0x59.toByte()

        if (header.enabled) {
            headerBytes[0x50] = (headerBytes[0x50].toInt() or 0x01).toByte()
        }

        outputStream.write(headerBytes)

        // Pointer Block: 16 bytes per game + 16 bytes terminator
        var nextOffset = DEFAULT_CODE_OFFSET + (games.size + 1) * 16
        val pointerBytes = ByteArray((games.size + 1) * 16)
        val pBuf = ByteBuffer.wrap(pointerBytes).order(ByteOrder.LITTLE_ENDIAN)

        val serializedGames = ArrayList<ByteArray>(games.size)
        for (game in games) {
            val gameBytes = serializeGame(game)
            serializedGames.add(gameBytes)

            val idBytes = game.gameId.padEnd(4, ' ').take(4).toByteArray(CHARSET_LATIN1)
            pBuf.put(idBytes)
            pBuf.putInt(game.crc32.toInt())
            pBuf.putInt(nextOffset)
            pBuf.putInt(0) // reserved

            nextOffset += gameBytes.size
        }
        // Terminator is already all zeroes
        outputStream.write(pointerBytes)

        // Write games
        for (gBytes in serializedGames) {
            outputStream.write(gBytes)
        }
    }
}
