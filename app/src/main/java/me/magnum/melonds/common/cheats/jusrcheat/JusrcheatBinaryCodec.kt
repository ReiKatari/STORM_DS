package me.magnum.melonds.common.cheats.jusrcheat

import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.charset.Charset

/**
 * High-performance binary codec for R4 usrcheat.dat cheat databases.
 * Directly based on and modernized from xperia64/Jusrcheat specification.
 * Supports zero-copy ByteBuffer / MappedByteBuffer reads with zero large heap allocations.
 */
object JusrcheatBinaryCodec {
    const val MAGIC = "R4 CheatCode"
    const val HEADER_SIZE = 0x100
    const val DEFAULT_CODE_OFFSET = 0x100

    private val CHARSET_LATIN1: Charset = Charsets.ISO_8859_1
    private val CHARSET_UTF8: Charset = Charsets.UTF_8

    fun alignTo4(pos: Int): Int = (4 - (pos and 3)) and 3

    fun alignStr(len: Int): Int = ((4 - (len and 3)) and 3) + len

    fun isValidHeader(buffer: ByteBuffer): Boolean {
        if (buffer.capacity() < 12) return false
        val magicBytes = MAGIC.toByteArray(CHARSET_LATIN1)
        for (i in magicBytes.indices) {
            if (buffer.get(i) != magicBytes[i]) return false
        }
        return true
    }

    fun isValidHeader(data: ByteArray): Boolean {
        if (data.size < 12) return false
        return isValidHeader(ByteBuffer.wrap(data))
    }

    fun parseHeader(buffer: ByteBuffer): JusrcheatHeader {
        if (!isValidHeader(buffer)) {
            throw IllegalArgumentException("Invalid usrcheat.dat header: Magic mismatch")
        }
        val b = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN)
        val codeOffset = b.getInt(0x0C)

        // Title at 0x10..0x4B
        val titleBytes = ByteArray(59)
        b.position(0x10)
        b.get(titleBytes, 0, 59)
        var titleLen = 0
        while (titleLen < 59 && titleBytes[titleLen] != 0.toByte()) {
            titleLen++
        }
        val title = String(titleBytes, 0, titleLen, CHARSET_LATIN1).trim()

        val encodingByte = if (b.capacity() > 0x4C) b.get(0x4C) else 0
        val encoding = when (encodingByte.toInt() and 0xFF) {
            0xD5 -> 0 // GBK
            0xF5 -> 1 // BIG5
            0x75 -> 2 // SJIS
            0x55 -> 3 // UTF8
            else -> 3
        }
        val enabledByte = if (b.capacity() > 0x50) b.get(0x50) else 0
        val enabled = ((enabledByte.toInt()) and 0x01) != 0

        return JusrcheatHeader(
            title = title,
            encoding = encoding,
            enabled = enabled,
            codeOffset = if (codeOffset > 0) codeOffset else DEFAULT_CODE_OFFSET
        )
    }

    fun parseHeader(data: ByteArray): JusrcheatHeader = parseHeader(ByteBuffer.wrap(data))

    fun parsePointers(buffer: ByteBuffer, codeOffset: Int): List<JusrcheatGamePointer> {
        val pointers = mutableListOf<JusrcheatGamePointer>()
        var offset = if (codeOffset > 0) codeOffset else DEFAULT_CODE_OFFSET
        val b = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN)
        val cap = b.capacity()
        val gameIdBytes = ByteArray(4)

        while (offset + 16 <= cap) {
            val b0 = b.get(offset)
            if (b0 == 0.toByte()) {
                // Separator block / end of pointer table
                break
            }
            b.position(offset)
            b.get(gameIdBytes, 0, 4)
            val gameId = String(gameIdBytes, CHARSET_LATIN1)
            val crc32 = b.getInt(offset + 4).toLong() and 0xFFFFFFFFL
            val gameOffset = b.getInt(offset + 8).toLong() and 0xFFFFFFFFL

            pointers.add(JusrcheatGamePointer(gameId, crc32, gameOffset))
            offset += 16
        }
        return pointers
    }

    fun parsePointers(data: ByteArray, codeOffset: Int): List<JusrcheatGamePointer> =
        parsePointers(ByteBuffer.wrap(data), codeOffset)

    fun parseGameMetaList(buffer: ByteBuffer, pointers: List<JusrcheatGamePointer>): List<JusrcheatGameMeta> {
        val result = ArrayList<JusrcheatGameMeta>(pointers.size)
        val b = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN)
        val cap = b.capacity()
        val titleBuf = ByteArray(512)

        for (i in pointers.indices) {
            val p = pointers[i]
            val gameOffset = p.offset.toInt()
            if (gameOffset < 0 || gameOffset >= cap) continue

            // Null-terminated game title
            var endTitle = gameOffset
            while (endTitle < cap && b.get(endTitle) != 0.toByte()) {
                endTitle++
            }
            val titleLen = endTitle - gameOffset
            val titleBytes = if (titleLen <= titleBuf.size) titleBuf else ByteArray(titleLen)
            b.position(gameOffset)
            b.get(titleBytes, 0, titleLen)
            val title = String(titleBytes, 0, titleLen, CHARSET_LATIN1).trim()

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

    fun parseGameMetaList(data: ByteArray, pointers: List<JusrcheatGamePointer>): List<JusrcheatGameMeta> =
        parseGameMetaList(ByteBuffer.wrap(data), pointers)

    fun parseHeaderAndIndex(buffer: ByteBuffer): Pair<JusrcheatHeader, List<JusrcheatGameMeta>> {
        val h = parseHeader(buffer)
        val pointers = parsePointers(buffer, h.codeOffset)
        val metas = parseGameMetaList(buffer, pointers)
        return Pair(h, metas)
    }

    fun parseGame(buffer: ByteBuffer, offset: Long, gameId: String, crc32: Long): JusrcheatGame {
        var cur = offset.toInt()
        val cap = buffer.capacity()
        if (cur < 0 || cur >= cap) {
            return JusrcheatGame(gameId, crc32, gameId)
        }

        val b = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN)

        // Title
        var endTitle = cur
        while (endTitle < cap && b.get(endTitle) != 0.toByte()) {
            endTitle++
        }
        val titleLen = endTitle - cur
        val titleBytes = ByteArray(titleLen)
        b.position(cur)
        b.get(titleBytes, 0, titleLen)
        val gameTitle = String(titleBytes, CHARSET_LATIN1).trim()
        cur = endTitle + 1
        cur += alignTo4(titleLen + 1)

        if (cur + 4 > cap) {
            return JusrcheatGame(gameId, crc32, gameTitle)
        }

        val numItems = b.getShort(cur).toInt() and 0xFFFF
        val flags = b.getShort(cur + 2).toInt() and 0xFFFF
        cur += 4

        val gameEnabled = (flags and 0xF0) == 0xF0

        // Master code (8 ints = 32 bytes)
        val masterCodes = ArrayList<Int>(8)
        if (cur + 32 <= cap) {
            for (m in 0 until 8) {
                masterCodes.add(b.getInt(cur + m * 4))
            }
            cur += 32
        }

        val folders = mutableListOf<JusrcheatFolder>()
        val directCheats = mutableListOf<JusrcheatCode>()

        var processedItems = 0
        while (processedItems < numItems && cur + 4 <= cap) {
            val numberThings = b.getShort(cur).toInt() and 0xFFFF
            val itemFlags = b.getShort(cur + 2).toInt() and 0xFFFF
            cur += 4

            val isFolder = (itemFlags and 0x1000) != 0

            // Read item name
            var endName = cur
            while (endName < cap && b.get(endName) != 0.toByte()) {
                endName++
            }
            val nameLen = endName - cur
            val nameBytes = ByteArray(nameLen)
            b.position(cur)
            b.get(nameBytes, 0, nameLen)
            val itemName = String(nameBytes, CHARSET_LATIN1).trim()
            cur = endName + 1

            // Read item desc
            var endDesc = cur
            while (endDesc < cap && b.get(endDesc) != 0.toByte()) {
                endDesc++
            }
            val descLen = endDesc - cur
            val descBytes = ByteArray(descLen)
            b.position(cur)
            b.get(descBytes, 0, descLen)
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
                    if (cur + 4 > cap) break
                    val codeNumberThings = b.getShort(cur).toInt() and 0xFFFF
                    val codeFlags = b.getShort(cur + 2).toInt() and 0xFFFF
                    cur += 4

                    val codeEnabled = (codeFlags and 0x0100) != 0

                    var cEndName = cur
                    while (cEndName < cap && b.get(cEndName) != 0.toByte()) {
                        cEndName++
                    }
                    val cNameLen = cEndName - cur
                    val cNameBytes = ByteArray(cNameLen)
                    b.position(cur)
                    b.get(cNameBytes, 0, cNameLen)
                    val cName = String(cNameBytes, CHARSET_LATIN1).trim()
                    cur = cEndName + 1

                    var cEndDesc = cur
                    while (cEndDesc < cap && b.get(cEndDesc) != 0.toByte()) {
                        cEndDesc++
                    }
                    val cDescLen = cEndDesc - cur
                    val cDescBytes = ByteArray(cDescLen)
                    b.position(cur)
                    b.get(cDescBytes, 0, cDescLen)
                    val cDesc = String(cDescBytes, CHARSET_LATIN1).trim()
                    cur = cEndDesc + 1

                    cur += alignTo4(cNameLen + 1 + cDescLen + 1)

                    if (cur + 4 <= cap) {
                        val codeChunks = b.getInt(cur)
                        cur += 4

                        val words = ArrayList<Int>(codeChunks)
                        for (w in 0 until codeChunks) {
                            if (cur + 4 <= cap) {
                                words.add(b.getInt(cur))
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

                if (cur + 4 <= cap) {
                    val codeChunks = b.getInt(cur)
                    cur += 4
                    for (w in 0 until codeChunks) {
                        if (cur + 4 <= cap) {
                            words.add(b.getInt(cur))
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

    fun parseGame(data: ByteArray, offset: Long, gameId: String, crc32: Long): JusrcheatGame =
        parseGame(ByteBuffer.wrap(data), offset, gameId, crc32)

    fun parseGameCheats(buffer: ByteBuffer, entry: JusrcheatGameMeta): JusrcheatGame =
        parseGame(buffer, entry.offset, entry.gameId, entry.crc32)

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
