package me.magnum.melonds.common.cheats

import android.util.Log
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.CheatFolder
import me.magnum.melonds.domain.model.Game
import java.nio.ByteBuffer
import java.nio.charset.CharacterCodingException
import java.nio.charset.Charset
import java.nio.charset.CodingErrorAction
import java.util.Locale

class UsrCheatDatParser : CheatDatabaseParser {

    companion object {
        private const val TAG = "UsrCheatDatParser"
        private const val MAGIC_HEADER = "R4 CheatCode"
        private const val GAME_TABLE_OFFSET = 0x100
        private const val GAME_TABLE_RECORD_SIZE = 16
    }

    override fun parseCheatDatabase(databaseStream: ProgressTrackerInputStream, parseListener: CheatDatabaseParserListener) {
        val bytes = databaseStream.readBytes()
        if (bytes.size < GAME_TABLE_OFFSET + GAME_TABLE_RECORD_SIZE) {
            throw IllegalArgumentException("usrcheat.dat file is too small (${bytes.size} bytes)")
        }

        // 1. Verify Magic Header (0x00..0x0B)
        val magic = String(bytes, 0, 12, Charsets.US_ASCII)
        if (!magic.startsWith(MAGIC_HEADER)) {
            throw IllegalArgumentException("Invalid R4 cheat database header: '$magic'")
        }

        // 2. Auto-detect database title & encoding (0x10..0x4A)
        val dbCharset = detectEncoding(bytes, 0x10, 0x3B)
        var dbTitleEnd = 0x10
        while (dbTitleEnd < 0x4B && dbTitleEnd < bytes.size && bytes[dbTitleEnd] != 0.toByte()) {
            dbTitleEnd++
        }
        val rawDbTitle = if (dbTitleEnd > 0x10) {
            decodeSmart(bytes, 0x10, dbTitleEnd - 0x10, dbCharset).trim()
        } else {
            ""
        }
        val databaseName = rawDbTitle.replace("\\(.*?\\)".toRegex(), "").trim().ifEmpty { "R4 Action Replay Database" }
        Log.i(TAG, "Parsing R4 Cheat Database: '$databaseName' (encoding: ${dbCharset.name()})")

        val cheatDatabase = parseListener.onDatabaseParseStart(databaseName)

        // 3. Parse Game Pointer Table starting at 0x100
        // Record format (16 bytes):
        //   [0..3]   ASCII gameCode (4 bytes)
        //   [4..7]   UInt32 CRC32 gameChecksum (little-endian)
        //   [8..15]  UInt64 gameOffset (little-endian, lower 32-bits active)
        // Sentinel: gameCode empty/zero or gameOffset == 0
        data class GamePointer(val code: String, val checksum: String, val offset: Long)
        val gamePointers = mutableListOf<GamePointer>()

        var tablePos = GAME_TABLE_OFFSET
        while (tablePos + GAME_TABLE_RECORD_SIZE <= bytes.size) {
            val codeBytes = bytes.copyOfRange(tablePos, tablePos + 4)
            if (codeBytes.all { it == 0.toByte() }) {
                break
            }
            val gameCode = String(codeBytes, Charsets.US_ASCII).trim('\u0000', ' ')
            if (gameCode.isEmpty()) {
                break
            }

            val checksumRaw = readInt32LE(bytes, tablePos + 4)
            val checksumHex = String.format(Locale.ROOT, "%08X", checksumRaw.toLong() and 0xFFFFFFFFL)

            val offsetRaw = readInt64LE(bytes, tablePos + 8) and 0x7FFFFFFF
            if (offsetRaw == 0L || offsetRaw >= bytes.size) {
                break
            }

            gamePointers.add(GamePointer(gameCode, checksumHex, offsetRaw))
            tablePos += GAME_TABLE_RECORD_SIZE
        }

        Log.i(TAG, "Found ${gamePointers.size} games in usrcheat.dat table")

        // 4. Parse each Game structure
        for (pointer in gamePointers) {
            try {
                var cursor = ((pointer.offset + 3) and -4L).toInt()
                if (cursor >= bytes.size) continue

                // Game Title (null-terminated string)
                val (gameName, nextCursor) = readNullTerminatedString(bytes, cursor, dbCharset)
                cursor = (nextCursor + 3) and -4
                if (cursor + 4 > bytes.size) continue

                parseListener.onGameParseStart(gameName)

                // headerCount (count = raw & 0x0FFFFFFF)
                val rawHeaderCount = readInt32LE(bytes, cursor)
                cursor += 4
                val itemCount = rawHeaderCount and 0x0FFFFFFF

                val folders = mutableListOf<CheatFolder>()
                val rootCheats = mutableListOf<Cheat>()

                for (itemIndex in 0 until itemCount) {
                    if (cursor + 4 > bytes.size) break
                    val itemHeader = readInt32LE(bytes, cursor)
                    cursor += 4

                    val isFolder = (itemHeader and 0x10000000) != 0
                    if (isFolder) {
                        // Folder: subCount = itemHeader & 0x00FFFFFF
                        val subCount = itemHeader and 0x00FFFFFF
                        val (folderName, c1) = readNullTerminatedString(bytes, cursor, dbCharset)
                        cursor = c1
                        val (_, c2) = readNullTerminatedString(bytes, cursor, dbCharset)
                        cursor = (c2 + 3) and -4

                        val folderCheats = mutableListOf<Cheat>()
                        for (subIndex in 0 until subCount) {
                            if (cursor >= bytes.size) break
                            val (cheatName, c3) = readNullTerminatedString(bytes, cursor, dbCharset)
                            cursor = c3
                            val (cheatNote, c4) = readNullTerminatedString(bytes, cursor, dbCharset)
                            cursor = (c4 + 3) and -4

                            if (cursor + 4 > bytes.size) break
                            val codeWordsCount = readInt32LE(bytes, cursor)
                            cursor += 4

                            val codeStr = parseActionReplayWords(bytes, cursor, codeWordsCount)
                            cursor += codeWordsCount * 4
                            cursor = (cursor + 3) and -4

                            folderCheats.add(
                                Cheat(
                                    id = null,
                                    cheatDatabaseId = cheatDatabase.id ?: 0L,
                                    name = cheatName.ifBlank { "Cheat ${subIndex + 1}" },
                                    description = cheatNote.takeIf { it.isNotBlank() },
                                    code = codeStr,
                                    enabled = false,
                                )
                            )
                        }

                        if (folderCheats.isNotEmpty()) {
                            folders.add(CheatFolder(id = null, name = folderName.ifBlank { "Cheats" }, cheats = folderCheats))
                        }
                    } else {
                        // Individual root cheat
                        val (cheatName, c3) = readNullTerminatedString(bytes, cursor, dbCharset)
                        cursor = c3
                        val (cheatNote, c4) = readNullTerminatedString(bytes, cursor, dbCharset)
                        cursor = (c4 + 3) and -4

                        if (cursor + 4 > bytes.size) break
                        val codeWordsCount = readInt32LE(bytes, cursor)
                        cursor += 4

                        val codeStr = parseActionReplayWords(bytes, cursor, codeWordsCount)
                        cursor += codeWordsCount * 4
                        cursor = (cursor + 3) and -4

                        rootCheats.add(
                            Cheat(
                                id = null,
                                cheatDatabaseId = cheatDatabase.id ?: 0L,
                                name = cheatName.ifBlank { "Cheat ${itemIndex + 1}" },
                                description = cheatNote.takeIf { it.isNotBlank() },
                                code = codeStr,
                                enabled = false,
                            )
                        )
                    }
                }

                if (rootCheats.isNotEmpty()) {
                    folders.add(0, CheatFolder(id = null, name = "General", cheats = rootCheats))
                }

                if (folders.isNotEmpty()) {
                    val game = Game(
                        id = null,
                        name = gameName.ifBlank { pointer.code },
                        gameCode = pointer.code,
                        gameChecksum = pointer.checksum,
                        cheats = folders,
                    )
                    parseListener.onGameParsed(game)
                }
            } catch (e: Exception) {
                Log.w(TAG, "Error parsing game at offset ${pointer.offset} (${pointer.code}): ${e.message}")
            }
        }

        parseListener.onParseComplete()
    }

    private fun parseActionReplayWords(bytes: ByteArray, offset: Int, count: Int): String {
        if (count <= 0 || offset >= bytes.size) return ""
        val sb = StringBuilder()
        var w = 0
        var pos = offset
        while (w < count && pos + 4 <= bytes.size) {
            val word1 = readInt32LE(bytes, pos)
            pos += 4
            w++
            if (w < count && pos + 4 <= bytes.size) {
                val word2 = readInt32LE(bytes, pos)
                pos += 4
                w++
                sb.append(String.format(Locale.ROOT, "%08X %08X\n", word1.toLong() and 0xFFFFFFFFL, word2.toLong() and 0xFFFFFFFFL))
            } else {
                sb.append(String.format(Locale.ROOT, "%08X\n", word1.toLong() and 0xFFFFFFFFL))
            }
        }
        return sb.toString().trimEnd()
    }

    private fun readNullTerminatedString(bytes: ByteArray, startOffset: Int, charset: Charset): Pair<String, Int> {
        var end = startOffset
        while (end < bytes.size && bytes[end] != 0.toByte()) {
            end++
        }
        val length = end - startOffset
        val text = if (length > 0) decodeSmart(bytes, startOffset, length, charset) else ""
        return text to (end + 1)
    }

    private fun detectEncoding(bytes: ByteArray, offset: Int, length: Int): Charset {
        val actualLen = minOf(length, bytes.size - offset)
        if (actualLen <= 0) return Charsets.UTF_8

        // Test UTF-8 validity
        val utf8Decoder = Charsets.UTF_8.newDecoder()
            .onMalformedInput(CodingErrorAction.REPORT)
            .onUnmappableCharacter(CodingErrorAction.REPORT)
        try {
            utf8Decoder.decode(ByteBuffer.wrap(bytes, offset, actualLen))
            return Charsets.UTF_8
        } catch (_: CharacterCodingException) {}

        // Test CP1251 (Windows-1251 Cyrillic)
        val cp1251 = Charset.forName("windows-1251")
        try {
            val decoded = cp1251.newDecoder()
                .onMalformedInput(CodingErrorAction.REPORT)
                .decode(ByteBuffer.wrap(bytes, offset, actualLen)).toString()
            if (decoded.any { it in '\u0400'..'\u04FF' }) {
                return cp1251
            }
        } catch (_: Exception) {}

        // Test Shift-JIS
        val sjis = Charset.forName("Shift_JIS")
        try {
            val decoded = sjis.newDecoder()
                .onMalformedInput(CodingErrorAction.REPORT)
                .decode(ByteBuffer.wrap(bytes, offset, actualLen)).toString()
            if (decoded.any { it in '\u3040'..'\u30FF' || it in '\u4E00'..'\u9FFF' }) {
                return sjis
            }
        } catch (_: Exception) {}

        return Charsets.ISO_8859_1
    }

    private fun decodeSmart(bytes: ByteArray, offset: Int, length: Int, defaultCharset: Charset): String {
        if (length <= 0) return ""
        return try {
            val decoder = defaultCharset.newDecoder()
                .onMalformedInput(CodingErrorAction.REPORT)
                .onUnmappableCharacter(CodingErrorAction.REPORT)
            decoder.decode(ByteBuffer.wrap(bytes, offset, length)).toString()
        } catch (_: CharacterCodingException) {
            try {
                Charset.forName("windows-1251").newDecoder().decode(ByteBuffer.wrap(bytes, offset, length)).toString()
            } catch (_: Exception) {
                try {
                    Charset.forName("Shift_JIS").newDecoder().decode(ByteBuffer.wrap(bytes, offset, length)).toString()
                } catch (_: Exception) {
                    String(bytes, offset, length, Charsets.ISO_8859_1)
                }
            }
        }
    }

    private fun readInt32LE(bytes: ByteArray, offset: Int): Int {
        if (offset + 4 > bytes.size) return 0
        return (bytes[offset].toInt() and 0xFF) or
            ((bytes[offset + 1].toInt() and 0xFF) shl 8) or
            ((bytes[offset + 2].toInt() and 0xFF) shl 16) or
            ((bytes[offset + 3].toInt() and 0xFF) shl 24)
    }

    private fun readInt64LE(bytes: ByteArray, offset: Int): Long {
        if (offset + 8 > bytes.size) return 0L
        val low = readInt32LE(bytes, offset).toLong() and 0xFFFFFFFFL
        val high = readInt32LE(bytes, offset + 4).toLong() and 0xFFFFFFFFL
        return low or (high shl 32)
    }
}
