package me.magnum.melonds.common.cheats

import android.util.Log
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.CheatFolder
import me.magnum.melonds.domain.model.Game
import java.io.File
import java.io.FileOutputStream
import java.io.RandomAccessFile
import java.nio.ByteBuffer
import java.nio.charset.CharacterCodingException
import java.nio.charset.Charset
import java.nio.charset.CodingErrorAction
import java.util.Locale

class UsrCheatDatParser(
    private val cacheDir: File? = null,
) : CheatDatabaseParser {

    companion object {
        private const val TAG = "UsrCheatDatParser"
        private const val MAGIC_HEADER = "R4 CheatCode"
        private const val GAME_TABLE_OFFSET = 0x100
        private const val GAME_TABLE_RECORD_SIZE = 16
        private const val BUFFER_SIZE = 32 * 1024
    }

    override fun parseCheatDatabase(databaseStream: ProgressTrackerInputStream, parseListener: CheatDatabaseParserListener) {
        val tempFile = if (cacheDir != null && (cacheDir.exists() || cacheDir.mkdirs())) {
            File.createTempFile("usrcheat_parse_", ".dat", cacheDir)
        } else {
            File.createTempFile("usrcheat_parse_", ".dat")
        }

        try {
            FileOutputStream(tempFile).use { fos ->
                val copyBuf = ByteArray(BUFFER_SIZE)
                while (true) {
                    val read = databaseStream.read(copyBuf)
                    if (read <= 0) break
                    fos.write(copyBuf, 0, read)
                }
                fos.flush()
            }

            val fileLength = tempFile.length()
            if (fileLength < GAME_TABLE_OFFSET + GAME_TABLE_RECORD_SIZE) {
                throw IllegalArgumentException("usrcheat.dat file is too small ($fileLength bytes)")
            }

            RandomAccessFile(tempFile, "r").use { raf ->
                val reader = BufferedRandomAccessReader(raf, fileLength)
                val header = ByteArray(GAME_TABLE_OFFSET)
                val headerRead = reader.readBytes(header, header.size)
                if (headerRead < GAME_TABLE_OFFSET) {
                    throw IllegalArgumentException("usrcheat.dat header is too small ($headerRead bytes)")
                }

                // 1. Verify Magic Header (0x00..0x0B)
                val magic = String(header, 0, 12, Charsets.US_ASCII)
                if (!magic.startsWith(MAGIC_HEADER)) {
                    throw IllegalArgumentException("Invalid R4 cheat database header: '$magic'")
                }

                // 2. Auto-detect database title & encoding (0x10..0x4A)
                val dbCharset = detectEncoding(header, 0x10, 0x3B)
                var dbTitleEnd = 0x10
                while (dbTitleEnd < 0x4B && dbTitleEnd < header.size && header[dbTitleEnd] != 0.toByte()) {
                    dbTitleEnd++
                }
                val rawDbTitle = if (dbTitleEnd > 0x10) {
                    decodeSmart(header, 0x10, dbTitleEnd - 0x10, dbCharset).trim()
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

                reader.seek(GAME_TABLE_OFFSET.toLong())
                val codeBytes = ByteArray(4)
                while (reader.position() + GAME_TABLE_RECORD_SIZE <= fileLength) {
                    if (reader.readBytes(codeBytes, 4) < 4) break
                    if (codeBytes.all { it == 0.toByte() }) {
                        break
                    }
                    val gameCode = String(codeBytes, Charsets.US_ASCII).trim('\u0000', ' ')
                    if (gameCode.isEmpty()) {
                        break
                    }

                    val checksumRaw = reader.readInt32LE()
                    val checksumHex = String.format(Locale.ROOT, "%08X", checksumRaw.toLong() and 0xFFFFFFFFL)

                    val offsetRaw = reader.readInt64LE() and 0x7FFFFFFFL
                    if (offsetRaw == 0L || offsetRaw >= fileLength) {
                        break
                    }

                    gamePointers.add(GamePointer(gameCode, checksumHex, offsetRaw))
                }

                Log.i(TAG, "Found ${gamePointers.size} games in usrcheat.dat table")

                val stringScratch = ByteArrayList(256)

                // 4. Parse each Game structure
                for (pointer in gamePointers) {
                    try {
                        var cursor = (pointer.offset + 3L) and -4L
                        if (cursor >= fileLength) continue

                        reader.seek(cursor)

                        // Game Title (null-terminated string)
                        val gameName = readNullTerminatedString(reader, dbCharset, stringScratch)
                        reader.align4()
                        cursor = reader.position()
                        if (cursor + 4L > fileLength) continue

                        parseListener.onGameParseStart(gameName)

                        // headerCount (count = raw & 0x0FFFFFFF)
                        val rawHeaderCount = reader.readInt32LE()
                        cursor = reader.position()
                        val maxItemsRemaining = ((fileLength - cursor).coerceAtLeast(0L)) / 4L
                        val itemCount = (rawHeaderCount and 0x0FFFFFFF).toLong().coerceIn(0L, maxItemsRemaining).toInt()

                        val folders = mutableListOf<CheatFolder>()
                        val rootCheats = mutableListOf<Cheat>()

                        // Master code: 8 ints = 32 bytes before the first folder/cheat item
                        if (cursor + 32L <= fileLength) {
                            reader.seek(cursor + 32L)
                        }

                        for (itemIndex in 0 until itemCount) {
                            if (reader.position() + 4L > fileLength) break
                            val itemHeader = reader.readInt32LE()

                            val isFolder = (itemHeader and 0x10000000) != 0
                            if (isFolder) {
                                // Folder: subCount = itemHeader & 0x00FFFFFF
                                val maxSubRemaining = ((fileLength - reader.position()).coerceAtLeast(0L)) / 4L
                                val subCount = (itemHeader and 0x00FFFFFF).toLong().coerceIn(0L, maxSubRemaining).toInt()
                                val folderName = readNullTerminatedString(reader, dbCharset, stringScratch)
                                readNullTerminatedString(reader, dbCharset, stringScratch)
                                reader.align4()

                                val folderCheats = mutableListOf<Cheat>()
                                for (subIndex in 0 until subCount) {
                                    if (reader.position() >= fileLength) break
                                    val cheatName = readNullTerminatedString(reader, dbCharset, stringScratch)
                                    val cheatNote = readNullTerminatedString(reader, dbCharset, stringScratch)
                                    reader.align4()

                                    if (reader.position() + 4L > fileLength) break
                                    val codeWordsCount = reader.readInt32LE()
                                    if (codeWordsCount < 0 || reader.position() + codeWordsCount.toLong() * 4L > fileLength) {
                                        break
                                    }

                                    val codeStr = parseActionReplayWords(reader, fileLength, codeWordsCount)
                                    reader.align4()

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
                                val cheatName = readNullTerminatedString(reader, dbCharset, stringScratch)
                                val cheatNote = readNullTerminatedString(reader, dbCharset, stringScratch)
                                reader.align4()

                                if (reader.position() + 4L > fileLength) break
                                val codeWordsCount = reader.readInt32LE()
                                if (codeWordsCount < 0 || reader.position() + codeWordsCount.toLong() * 4L > fileLength) {
                                    break
                                }

                                val codeStr = parseActionReplayWords(reader, fileLength, codeWordsCount)
                                reader.align4()

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
        } finally {
            runCatching { tempFile.delete() }
        }
    }

    private fun parseActionReplayWords(reader: BufferedRandomAccessReader, fileLength: Long, count: Int): String {
        if (count <= 0 || reader.position() >= fileLength) return ""
        val sb = StringBuilder()
        var w = 0
        while (w < count && reader.position() + 4L <= fileLength) {
            val word1 = reader.readInt32LE()
            w++
            if (w < count && reader.position() + 4L <= fileLength) {
                val word2 = reader.readInt32LE()
                w++
                sb.append(String.format(Locale.ROOT, "%08X %08X\n", word1.toLong() and 0xFFFFFFFFL, word2.toLong() and 0xFFFFFFFFL))
            } else {
                sb.append(String.format(Locale.ROOT, "%08X\n", word1.toLong() and 0xFFFFFFFFL))
            }
        }
        return sb.toString().trimEnd()
    }

    private fun readNullTerminatedString(
        reader: BufferedRandomAccessReader,
        charset: Charset,
        scratch: ByteArrayList,
    ): String {
        scratch.clear()
        while (true) {
            val b = reader.readByte()
            if (b <= 0) break
            scratch.add(b.toByte())
        }
        return if (scratch.size > 0) decodeSmart(scratch.data, 0, scratch.size, charset) else ""
    }

    private class ByteArrayList(initialCapacity: Int) {
        var data = ByteArray(initialCapacity)
            private set
        var size = 0
            private set

        fun clear() {
            size = 0
        }

        fun add(value: Byte) {
            if (size == data.size) {
                data = data.copyOf(data.size * 2)
            }
            data[size++] = value
        }
    }

    private class BufferedRandomAccessReader(
        private val raf: RandomAccessFile,
        private val fileLength: Long,
    ) {
        private val buffer = ByteArray(BUFFER_SIZE)
        private var bufFileOffset = 0L
        private var bufLen = 0
        private var bufPos = 0

        fun position(): Long = bufFileOffset + bufPos

        fun seek(pos: Long) {
            val clamped = pos.coerceIn(0L, fileLength)
            if (clamped >= bufFileOffset && clamped < bufFileOffset + bufLen) {
                bufPos = (clamped - bufFileOffset).toInt()
                return
            }
            bufFileOffset = clamped
            bufPos = 0
            bufLen = 0
        }

        fun align4() {
            seek((position() + 3L) and -4L)
        }

        private fun ensureBuffered(): Boolean {
            if (bufPos < bufLen) return true
            val currentPos = position()
            if (currentPos >= fileLength) return false
            raf.seek(currentPos)
            val read = raf.read(buffer, 0, buffer.size)
            if (read <= 0) return false
            bufFileOffset = currentPos
            bufPos = 0
            bufLen = read
            return true
        }

        fun readByte(): Int {
            if (!ensureBuffered()) return -1
            return buffer[bufPos++].toInt() and 0xFF
        }

        fun readBytes(dst: ByteArray, length: Int): Int {
            var total = 0
            while (total < length && ensureBuffered()) {
                val available = bufLen - bufPos
                val toCopy = minOf(available, length - total)
                System.arraycopy(buffer, bufPos, dst, total, toCopy)
                bufPos += toCopy
                total += toCopy
            }
            return total
        }

        fun readInt32LE(): Int {
            if (bufPos + 4 <= bufLen) {
                val b0 = buffer[bufPos].toInt() and 0xFF
                val b1 = buffer[bufPos + 1].toInt() and 0xFF
                val b2 = buffer[bufPos + 2].toInt() and 0xFF
                val b3 = buffer[bufPos + 3].toInt() and 0xFF
                bufPos += 4
                return b0 or (b1 shl 8) or (b2 shl 16) or (b3 shl 24)
            }
            if (position() + 4L > fileLength) return 0
            val b0 = readByte().coerceAtLeast(0)
            val b1 = readByte().coerceAtLeast(0)
            val b2 = readByte().coerceAtLeast(0)
            val b3 = readByte().coerceAtLeast(0)
            return b0 or (b1 shl 8) or (b2 shl 16) or (b3 shl 24)
        }

        fun readInt64LE(): Long {
            if (position() + 8L > fileLength) return 0L
            val low = readInt32LE().toLong() and 0xFFFFFFFFL
            val high = readInt32LE().toLong() and 0xFFFFFFFFL
            return low or (high shl 32)
        }
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
}
