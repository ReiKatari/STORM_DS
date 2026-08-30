package me.magnum.melonds.impl.dsinand

import android.content.Context
import android.net.Uri
import android.util.Log
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.utils.RomProcessor
import java.io.File
import java.io.RandomAccessFile
import java.nio.charset.StandardCharsets
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DsiStorageTitlesScanner @Inject constructor(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
) {
    companion object {
        private const val TAG = "DsiStorageScanner"
    }

    private val cachedGameCodes = mutableSetOf<String>()
    private val cachedTitleIds = mutableSetOf<Long>()
    private val romGameCodeCache = ConcurrentHashMap<String, String>()
    private var lastScanTimestamp = 0L

    @Synchronized
    fun refreshStorageTitles(): Pair<Set<String>, Set<Long>> {
        val now = System.currentTimeMillis()
        if (now - lastScanTimestamp < 3000L && cachedGameCodes.isNotEmpty()) {
            return cachedGameCodes.toSet() to cachedTitleIds.toSet()
        }

        val gameCodes = mutableSetOf<String>()
        val titleIds = mutableSetOf<Long>()

        val candidateLocations = mutableListOf<File>()

        // 1. DSi SD-Card image / directory from settings or root storage
        settingsRepository.getDsiSdCardDirectory()?.let { uri ->
            uri.path?.let { p ->
                val f = File(p)
                if (f.exists()) candidateLocations.add(f)
            }
        }

        val extStorage = android.os.Environment.getExternalStorageDirectory()
        val defaultLocations = listOf(
            File(extStorage, "STORM DS/bios/dsi/sd_card.bin"),
            File(extStorage, "STORM DS/bios/dsi/sd.bin"),
            File(extStorage, "STORM DS/bios/dsi/sd_card"),
            File(extStorage, "STORM DS/bios/dsi"),
            File(context.filesDir, "bios/dsi/sd_card.bin"),
            File(context.filesDir, "bios/dsi/sd.bin"),
            File(extStorage, "STORM DS/bios/dsi/nand.bin"),
            File(context.filesDir, "bios/dsi/nand.bin"),
        )

        for (loc in defaultLocations) {
            if (loc.exists() && !candidateLocations.contains(loc)) {
                candidateLocations.add(loc)
            }
        }

        for (loc in candidateLocations) {
            try {
                if (loc.isDirectory) {
                    scanDirectory(loc, gameCodes, titleIds)
                } else if (loc.isFile && loc.length() >= 512 * 1024L) {
                    scanImageFile(loc, gameCodes, titleIds)
                }
            } catch (e: Throwable) {
                Log.w(TAG, "Error scanning DSi storage location: ${loc.absolutePath}", e)
            }
        }

        cachedGameCodes.clear()
        cachedGameCodes.addAll(gameCodes)
        cachedTitleIds.clear()
        cachedTitleIds.addAll(titleIds)
        lastScanTimestamp = now

        return cachedGameCodes.toSet() to cachedTitleIds.toSet()
    }

    fun getInstalledDsiGameCodes(): Set<String> {
        val (codes, _) = refreshStorageTitles()
        return codes
    }

    fun getInstalledDsiTitleIds(): Set<Long> {
        val (_, ids) = refreshStorageTitles()
        return ids
    }

    fun isDsiWareOrDsiRom(rom: Rom): Boolean {
        if (rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut) return true
        if (rom.fileName.endsWith(".dsi", ignoreCase = true) || rom.uri.path?.endsWith(".dsi", ignoreCase = true) == true) return true
        val code = resolveRomGameCode(rom)
        val gc0 = code.getOrNull(0)?.uppercaseChar()
        return gc0 == 'K' || gc0 == 'V' || gc0 == 'H'
    }

    fun isDsiTitleInstalledInStorage(rom: Rom): Boolean {
        val installedCodes = getInstalledDsiGameCodes()
        val installedTitleIds = getInstalledDsiTitleIds()

        // If no DSi storage image/folder exists at all, do not filter out
        if (installedCodes.isEmpty() && installedTitleIds.isEmpty()) {
            return true
        }

        val code = resolveRomGameCode(rom).uppercase().trim()
        if (code.isNotEmpty() && installedCodes.contains(code)) {
            return true
        }

        val tid = rom.installedDsiWareTitleId ?: resolveRomTitleId(rom)
        if (tid != null && tid > 0L) {
            if (installedTitleIds.contains(tid) || installedTitleIds.contains(tid and 0xFFFFFFFFL)) {
                return true
            }
        }

        return false
    }

    fun resolveRomGameCode(rom: Rom): String {
        if (rom.gameCode.isNotBlank()) return rom.gameCode
        val cached = romGameCodeCache[rom.uri.toString()]
        if (cached != null) return cached

        val extracted = RomProcessor.readGameCode(context, rom.uri)
        if (extracted.isNotBlank()) {
            romGameCodeCache[rom.uri.toString()] = extracted
            return extracted
        }
        return ""
    }

    private fun bytesToInt(data: ByteArray, offset: Int): Int {
        return (data[offset].toInt() and 0xFF) or
            (data[offset + 1].toInt() and 0xFF).shl(8) or
            (data[offset + 2].toInt() and 0xFF).shl(16) or
            (data[offset + 3].toInt() and 0xFF).shl(24)
    }

    fun resolveRomTitleId(rom: Rom): Long? {
        if (rom.installedDsiWareTitleId != null && rom.installedDsiWareTitleId > 0L) {
            return rom.installedDsiWareTitleId
        }
        return runCatching {
            context.contentResolver.openInputStream(rom.uri)?.use { stream ->
                val buf = ByteArray(0x238)
                val read = stream.read(buf)
                if (read >= 0x238) {
                    val cat = bytesToInt(buf, 0x234).toLong() and 0xFFFFFFFFL
                    val id = bytesToInt(buf, 0x230).toLong() and 0xFFFFFFFFL
                    if (cat == 0x00030004L || cat == 0x00030005L || cat == 0x04000300L) {
                        id
                    } else null
                } else null
            }
        }.getOrNull()
    }

    private fun scanDirectory(dir: File, gameCodes: MutableSet<String>, titleIds: MutableSet<Long>) {
        val files = dir.listFiles() ?: return
        for (f in files) {
            if (f.isDirectory) {
                val name = f.name.uppercase()
                if (name.length == 8 && name.all { it in "0123456789ABCDEF" }) {
                    try {
                        val tid = name.toLong(16)
                        titleIds.add(tid)
                        val bytes = name.chunked(2).map { it.toInt(16).toByte() }.toByteArray()
                        val code = String(bytes, StandardCharsets.US_ASCII)
                        if (code.all { it in 'A'..'Z' || it in '0'..'9' }) {
                            gameCodes.add(code)
                        }
                    } catch (_: Throwable) {}
                }
                scanDirectory(f, gameCodes, titleIds)
            } else if (f.isFile && (f.name.endsWith(".nds", ignoreCase = true) || f.name.endsWith(".dsi", ignoreCase = true) || f.name.endsWith(".app", ignoreCase = true))) {
                runCatching {
                    RandomAccessFile(f, "r").use { raf ->
                        if (raf.length() >= 0x238) {
                            val header = ByteArray(0x238)
                            raf.readFully(header)
                            val gc = String(header, 0x0C, 4, StandardCharsets.US_ASCII).trim()
                            if (gc.length == 4 && gc.all { it in 'A'..'Z' || it in '0'..'9' }) {
                                gameCodes.add(gc.uppercase())
                            }
                            val cat = bytesToInt(header, 0x234).toLong() and 0xFFFFFFFFL
                            val id = bytesToInt(header, 0x230).toLong() and 0xFFFFFFFFL
                            if (id > 0L && (cat == 0x00030004L || cat == 0x00030005L || cat == 0x04000300L)) {
                                titleIds.add(id)
                            }
                        }
                    }
                }
            }
        }
    }

    private fun scanImageFile(imgFile: File, gameCodes: MutableSet<String>, titleIds: MutableSet<Long>) {
        runCatching {
            RandomAccessFile(imgFile, "r").use { raf ->
                val len = raf.length().coerceAtMost(300L * 1024 * 1024L)
                val bufSize = 64 * 1024
                val buffer = ByteArray(bufSize)
                var pos = 0L

                while (pos < len) {
                    raf.seek(pos)
                    val bytesRead = raf.read(buffer)
                    if (bytesRead <= 0) break

                    for (i in 0 until bytesRead - 8) {
                        val c0 = buffer[i].toInt().toChar()
                        val c1 = buffer[i + 1].toInt().toChar()
                        if (c0 == '4' && (c1 in 'B'..'F' || c1 in '0'..'9' || c1 in 'b'..'f')) {
                            val hexCandidate = String(buffer, i, 8, StandardCharsets.US_ASCII)
                            if (hexCandidate.length == 8 && hexCandidate.all { it in "0123456789ABCDEFabcdef" }) {
                                val up = hexCandidate.uppercase()
                                try {
                                    val tid = up.toLong(16)
                                    titleIds.add(tid)
                                    val b0 = up.substring(0, 2).toInt(16).toByte()
                                    val b1 = up.substring(2, 4).toInt(16).toByte()
                                    val b2 = up.substring(4, 6).toInt(16).toByte()
                                    val b3 = up.substring(6, 8).toInt(16).toByte()
                                    val codeStr = String(byteArrayOf(b0, b1, b2, b3), StandardCharsets.US_ASCII)
                                    if (codeStr.all { it in 'A'..'Z' || it in '0'..'9' }) {
                                        gameCodes.add(codeStr)
                                    }
                                } catch (_: Throwable) {}
                            }
                        }

                        if (i + 0x200 <= bytesRead) {
                            val unitCode = buffer[i + 0x12].toInt() and 0xFF
                            if (unitCode == 0x02 || unitCode == 0x03) {
                                val gc = String(buffer, i + 0x0C, 4, StandardCharsets.US_ASCII)
                                if (gc.length == 4 && gc.all { it in 'A'..'Z' || it in '0'..'9' }) {
                                    val gc0 = gc[0]
                                    if (gc0 == 'K' || gc0 == 'V' || gc0 == 'H' || gc0 == '4') {
                                        gameCodes.add(gc.uppercase())
                                    }
                                }
                            }
                        }
                    }

                    pos += (bufSize - 512)
                }
            }
        }
    }
}
