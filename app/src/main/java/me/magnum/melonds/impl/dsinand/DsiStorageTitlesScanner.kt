package me.magnum.melonds.impl.dsinand

import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.documentfile.provider.DocumentFile
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.utils.RomProcessor
import java.io.File
import java.io.InputStream
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

    private val cachedGameCodes = java.util.concurrent.ConcurrentHashMap.newKeySet<String>()
    private val cachedTitleIds = java.util.concurrent.ConcurrentHashMap.newKeySet<Long>()
    private val cachedCleanNames = java.util.concurrent.ConcurrentHashMap.newKeySet<String>()
    private val romGameCodeCache = ConcurrentHashMap<String, String>()
    private var lastScanTimestamp = 0L

    @Synchronized
    fun refreshStorageTitles(): Pair<Set<String>, Set<Long>> {
        val now = System.currentTimeMillis()
        if (now - lastScanTimestamp < 60000L && cachedGameCodes.isNotEmpty()) {
            return cachedGameCodes.toSet() to cachedTitleIds.toSet()
        }

        val gameCodes = mutableSetOf<String>()
        val titleIds = mutableSetOf<Long>()
        val cleanNames = mutableSetOf<String>()

        // 1. Scan DSi SD-Card directory / Tree URI from settings
        settingsRepository.getDsiSdCardDirectory()?.let { uri ->
            scanUriTarget(uri, gameCodes, titleIds)
        }

        // 2. Auto-extract SD image to external sync directory if sync is empty
        val extStorage = android.os.Environment.getExternalStorageDirectory()
        val dsiSyncDir = File(extStorage, "STORM DS/bios/dsi/sync")
        val candidateImages = listOf(
            File(extStorage, "STORM DS/bios/dsi/sd_card.bin"),
            File(extStorage, "STORM DS/bios/dsi/sd.bin"),
            File(extStorage, "STORM DS/bios/sd_card.bin"),
            File(extStorage, "STORM DS/bios/sd.bin"),
            File(extStorage, "STORM DS/sd_card.bin"),
            File(extStorage, "STORM DS/dldi/dsi_sd.img"),
            File(extStorage, "STORM DS/dldi/dldi_sd.img"),
        )
        if (dsiSyncDir.exists() && dsiSyncDir.listFiles()?.isEmpty() == true) {
            for (img in candidateImages) {
                if (img.isFile && img.length() >= 512 * 1024L) {
                    if (me.magnum.melonds.utils.FatImageExtractor.extractFatImage(img, dsiSyncDir)) {
                        break
                    }
                }
            }
        }

        // 3. Collect clean names from sync directory
        dsiSyncDir.listFiles()?.forEach { f ->
            val c = f.nameWithoutExtension.lowercase().replace(Regex("[^a-z0-9]"), "")
            if (c.isNotEmpty()) cleanNames.add(c)
        }

        // 4. Scan standard DSi SD card directories and images
        val defaultLocations = candidateImages + listOf(
            dsiSyncDir,
            File(extStorage, "STORM DS/bios/dsi/sd_card"),
            File(extStorage, "STORM DS/bios/dsi"),
            File(extStorage, "STORM DS/dldi/sync"),
        )

        for (loc in defaultLocations) {
            try {
                if (loc.exists()) {
                    if (loc.isDirectory) {
                        scanLocalDirectory(loc, gameCodes, titleIds)
                    } else if (loc.isFile && loc.length() >= 512 * 1024L) {
                        scanImageFile(loc, gameCodes, titleIds)
                    }
                }
            } catch (e: Throwable) {
                Log.w(TAG, "Error scanning local location: ${loc.absolutePath}", e)
            }
        }

        cachedGameCodes.clear()
        cachedGameCodes.addAll(gameCodes)
        cachedTitleIds.clear()
        cachedTitleIds.addAll(titleIds)
        cachedCleanNames.clear()
        cachedCleanNames.addAll(cleanNames)
        lastScanTimestamp = now

        Log.i(TAG, "DSi SD Storage scanned. Found ${cachedGameCodes.size} GameCodes: $cachedGameCodes")
        return cachedGameCodes.toSet() to cachedTitleIds.toSet()
    }

    fun getInstalledDsiGameCodes(): Set<String> {
        return cachedGameCodes.toSet()
    }

    fun getInstalledDsiTitleIds(): Set<Long> {
        return cachedTitleIds.toSet()
    }

    fun isDsiWareOrDsiRom(rom: Rom): Boolean {
        // DSi Enhanced cartridge games must NEVER be filtered by SD card!
        if (rom.isDsiEnhanced) return false
        if (rom.isInstalledDsiWareShortcut) return true
        if (rom.isDsiWareTitle) return true
        if (rom.fileName.endsWith(".dsi", ignoreCase = true) || rom.uri.path?.endsWith(".dsi", ignoreCase = true) == true) return true
        val code = resolveRomGameCode(rom).trim().uppercase()
        if (code.length == 4 && (code.startsWith("K") || code.startsWith("H"))) {
            return true
        }
        return false
    }

    fun isDsiTitleInstalledInStorage(rom: Rom): Boolean {
        // DSi Enhanced cartridge games are always allowed!
        if (rom.isDsiEnhanced) return true

        // If DSi SD Card is not enabled, do not filter out
        if (!settingsRepository.isDsiSdCardEnabled()) {
            return true
        }

        // If no DSi SD card was discovered or not yet scanned, allow all ROMs
        if (cachedGameCodes.isEmpty() && cachedTitleIds.isEmpty() && cachedCleanNames.isEmpty()) {
            return true
        }

        val code = resolveRomGameCode(rom).uppercase().trim()
        if (code.isNotEmpty() && cachedGameCodes.contains(code)) {
            return true
        }

        val tid = rom.installedDsiWareTitleId ?: resolveRomTitleId(rom)
        if (tid != null && tid > 0L) {
            if (cachedTitleIds.contains(tid) || cachedTitleIds.contains(tid and 0xFFFFFFFFL)) {
                return true
            }
        }

        val cleanName = rom.name.lowercase().replace(Regex("[^a-z0-9]"), "")
        if (cleanName.length >= 3) {
            if (cachedCleanNames.any { c -> c == cleanName || c.contains(cleanName) || cleanName.contains(c) }) {
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

    private fun scanUriTarget(uri: Uri, gameCodes: MutableSet<String>, titleIds: MutableSet<Long>) {
        runCatching {
            if (uri.scheme == "file") {
                val f = uri.path?.let { File(it) }
                if (f != null && f.exists()) {
                    if (f.isDirectory) scanLocalDirectory(f, gameCodes, titleIds)
                    else if (f.isFile) scanImageFile(f, gameCodes, titleIds)
                }
                return
            }

            // Tree URI via SAF
            val docTree = DocumentFile.fromTreeUri(context, uri)
            if (docTree != null && docTree.isDirectory) {
                scanDocumentDirectory(docTree, gameCodes, titleIds, depth = 0)
                return
            }

            // Single Document URI
            val singleDoc = DocumentFile.fromSingleUri(context, uri)
            if (singleDoc != null && singleDoc.isFile) {
                context.contentResolver.openInputStream(uri)?.use { stream ->
                    scanStreamForTitles(stream, gameCodes, titleIds)
                }
            }
        }
    }

    private fun scanDocumentDirectory(dir: DocumentFile, gameCodes: MutableSet<String>, titleIds: MutableSet<Long>, depth: Int) {
        if (depth > 4) return
        val files = dir.listFiles()
        for (f in files) {
            if (f.isDirectory) {
                val name = f.name?.uppercase().orEmpty()
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
                scanDocumentDirectory(f, gameCodes, titleIds, depth + 1)
            } else if (f.isFile) {
                val name = f.name?.lowercase().orEmpty()
                if (name.endsWith(".nds") || name.endsWith(".dsi") || name.endsWith(".app")) {
                    runCatching {
                        context.contentResolver.openInputStream(f.uri)?.use { stream ->
                            val buf = ByteArray(0x238)
                            val read = stream.read(buf)
                            if (read >= 0x238) {
                                val gc = String(buf, 0x0C, 4, StandardCharsets.US_ASCII).trim()
                                if (gc.length == 4 && gc.all { it in 'A'..'Z' || it in '0'..'9' }) {
                                    gameCodes.add(gc.uppercase())
                                }
                                val cat = bytesToInt(buf, 0x234).toLong() and 0xFFFFFFFFL
                                val id = bytesToInt(buf, 0x230).toLong() and 0xFFFFFFFFL
                                if (id > 0L && (cat == 0x00030004L || cat == 0x00030005L || cat == 0x04000300L)) {
                                    titleIds.add(id)
                                }
                            }
                        }
                    }
                } else if (name.endsWith(".bin") || name.endsWith(".img")) {
                    runCatching {
                        context.contentResolver.openInputStream(f.uri)?.use { stream ->
                            scanStreamForTitles(stream, gameCodes, titleIds)
                        }
                    }
                }
            }
        }
    }

    private fun scanLocalDirectory(dir: File, gameCodes: MutableSet<String>, titleIds: MutableSet<Long>) {
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
                scanLocalDirectory(f, gameCodes, titleIds)
            } else if (f.isFile) {
                val name = f.name.lowercase()
                if (name.endsWith(".nds") || name.endsWith(".dsi") || name.endsWith(".app")) {
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
                } else if (name.endsWith(".bin") || name.endsWith(".img")) {
                    scanImageFile(f, gameCodes, titleIds)
                }
            }
        }
    }

    private fun scanStreamForTitles(stream: InputStream, gameCodes: MutableSet<String>, titleIds: MutableSet<Long>) {
        val bufSize = 64 * 1024
        val buffer = ByteArray(bufSize)
        var totalRead = 0L
        val maxRead = 300L * 1024 * 1024L

        while (totalRead < maxRead) {
            val bytesRead = stream.read(buffer)
            if (bytesRead <= 0) break
            totalRead += bytesRead
            parseBufferForTitles(buffer, bytesRead, gameCodes, titleIds)
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
                    parseBufferForTitles(buffer, bytesRead, gameCodes, titleIds)
                    pos += (bufSize - 512)
                }
            }
        }
    }

    private fun parseBufferForTitles(buffer: ByteArray, bytesRead: Int, gameCodes: MutableSet<String>, titleIds: MutableSet<Long>) {
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
    }
}
