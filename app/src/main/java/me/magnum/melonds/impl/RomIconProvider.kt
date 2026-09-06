package me.magnum.melonds.impl

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.core.graphics.createBitmap
import androidx.documentfile.provider.DocumentFile
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.romprocessors.RomFileProcessorFactory
import me.magnum.melonds.domain.model.rom.Rom
import java.io.File
import java.nio.ByteBuffer
import java.util.*
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/**
 * Provider for ROM icons that supports caching. Both memory and disk caches are supported. If upon
 * request an icon is not found, it is generated and, if generated successfully, it's stored on both
 * caches.
 * The name of the file for the disk cache is the hash of the ROM's URI.
 */
class RomIconProvider(private val context: Context, private val romFileProcessorFactory: RomFileProcessorFactory) {
    companion object {
        private const val ICON_CACHE_DIR = "rom_icons"
        private const val MAX_MEMORY_CACHE_BYTES = 32 * 1024 * 1024
    }

    private val memoryIconCache = object : android.util.LruCache<String, Bitmap>(MAX_MEMORY_CACHE_BYTES) {
        override fun sizeOf(key: String, value: Bitmap): Int = value.byteCount.coerceAtLeast(1)
    }
    private val romIconLocks = Collections.synchronizedMap(mutableMapOf<String, ReentrantLock>())

    private val internalIconCacheDir: File by lazy {
        File(context.filesDir, ICON_CACHE_DIR).apply {
            if (!exists()) {
                mkdirs()
                // Seamlessly migrate legacy cached icons from externalCacheDir if present
                runCatching {
                    context.externalCacheDir?.let { ext ->
                        val extDir = File(ext, ICON_CACHE_DIR)
                        if (extDir.isDirectory) {
                            extDir.copyRecursively(this, overwrite = false)
                        }
                    }
                }
            }
        }
    }

    suspend fun getRomIcon(rom: Rom): Bitmap? = withContext(Dispatchers.IO) {
        val primaryKey = getPrimaryCacheKey(rom)
        getRomIconLock(primaryKey).withLock {
            loadIcon(rom)
        }
    }

    fun clearIconCache() {
        memoryIconCache.evictAll()
        runCatching {
            if (internalIconCacheDir.isDirectory) {
                internalIconCacheDir.deleteRecursively()
            }
            context.externalCacheDir?.let { ext ->
                val extDir = File(ext, ICON_CACHE_DIR)
                if (extDir.isDirectory) {
                    extDir.deleteRecursively()
                }
            }
        }
    }

    private fun getRomIconLock(lockKey: String): ReentrantLock {
        synchronized(romIconLocks) {
            return romIconLocks.getOrPut(lockKey) {
                ReentrantLock()
            }
        }
    }

    private fun getPrimaryCacheKey(rom: Rom): String {
        return runCatching {
            val md = java.security.MessageDigest.getInstance("MD5")
            val bytes = md.digest(rom.uri.toString().toByteArray(Charsets.UTF_8))
            bytes.joinToString("") { "%02x".format(it) }
        }.getOrElse {
            rom.uri.hashCode().toString()
        }
    }

    private fun getCandidateKeys(rom: Rom): List<String> {
        val keys = mutableListOf<String>()
        keys.add(getPrimaryCacheKey(rom))
        if (rom.gameCode.isNotBlank()) {
            keys.add("code_${rom.gameCode}_${rom.fileName.hashCode()}")
        }
        keys.add(rom.uri.hashCode().toString())
        return keys.distinct()
    }

    private fun loadIcon(rom: Rom): Bitmap? {
        val keys = getCandidateKeys(rom)
        for (k in keys) {
            val fromMem = memoryIconCache.get(k)
            if (fromMem != null) return fromMem
        }

        val bitmap = loadIconFromDisk(rom)
        if (bitmap != null) {
            for (k in keys) {
                memoryIconCache.put(k, bitmap)
            }
        }
        return bitmap
    }

    private fun loadIconFromDisk(rom: Rom): Bitmap? {
        rom.installedDsiWareIcon?.let { icon ->
            return createBitmap(32, 32).apply {
                copyPixelsFromBuffer(ByteBuffer.wrap(icon))
            }
        }

        val keys = getCandidateKeys(rom)
        // 1. Search persistent internal cache directory
        for (k in keys) {
            val file = File(internalIconCacheDir, k)
            if (file.isFile && file.length() > 0) {
                val bmp = BitmapFactory.decodeFile(file.absolutePath)
                if (bmp != null) return bmp
            }
        }

        // 2. Fallback: check legacy external cache directory
        val extCacheDir = context.externalCacheDir?.let { File(it, ICON_CACHE_DIR) }
        if (extCacheDir?.isDirectory == true) {
            for (k in keys) {
                val file = File(extCacheDir, k)
                if (file.isFile && file.length() > 0) {
                    val bmp = BitmapFactory.decodeFile(file.absolutePath)
                    if (bmp != null) {
                        saveRomIcon(rom, bmp) // Persist to internal cache
                        return bmp
                    }
                }
            }
        }

        // 3. Extract icon from ROM binary via processor
        val romProcessor = romFileProcessorFactory.getFileRomProcessorForFileName(rom.fileName)
            ?: (DocumentFile.fromSingleUri(context, rom.uri)?.let { romFileProcessorFactory.getFileRomProcessorForDocument(it) })
            ?: romFileProcessorFactory.getFileRomProcessorForDocument(rom.uri)
            ?: return null
        val bitmap = romProcessor.getRomIcon(rom)
        if (bitmap != null) {
            saveRomIcon(rom, bitmap)
        }
        return bitmap
    }

    private fun saveRomIcon(rom: Rom, icon: Bitmap) {
        val keys = getCandidateKeys(rom)
        if (internalIconCacheDir.isDirectory || internalIconCacheDir.mkdirs()) {
            for (k in keys) {
                val iconFile = File(internalIconCacheDir, k)
                try {
                    iconFile.outputStream().use {
                        icon.compress(Bitmap.CompressFormat.PNG, 100, it)
                    }
                } catch (_: Exception) {
                    // Ignore disk write errors
                }
            }
        }
    }
}
