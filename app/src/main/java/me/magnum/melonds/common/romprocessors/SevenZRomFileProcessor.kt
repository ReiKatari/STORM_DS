package me.magnum.melonds.common.romprocessors

import android.app.ActivityManager
import android.content.Context
import android.net.Uri
import android.os.ParcelFileDescriptor
import android.util.Log
import androidx.core.content.getSystemService
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.domain.model.SizeUnit
import me.magnum.melonds.impl.NdsRomCache
import me.magnum.melonds.utils.FileUtils
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry
import org.apache.commons.compress.archivers.sevenz.SevenZFile
import java.io.File
import java.io.FileInputStream
import java.io.FilterInputStream
import java.io.InputStream

class SevenZRomFileProcessor(private val context: Context, uriHandler: UriHandler, ndsRomCache: NdsRomCache) : CompressedRomFileProcessor(context, uriHandler, ndsRomCache) {
    companion object {
        private const val TAG = "SevenZRomProcessor"
        private const val MIN_MEMORY_LIMIT_KB = 1024L

        internal fun calculateMaxMemoryLimitKb(deviceMemoryBytes: Long, maxHeapBytes: Long): Int {
            val deviceMemoryLimitBytes = (deviceMemoryBytes * 0.1f).toLong()
            val heapMemoryLimitBytes = maxHeapBytes / 3
            val memoryLimitBytes = minOf(deviceMemoryLimitBytes, heapMemoryLimitBytes)
                .coerceAtLeast(MIN_MEMORY_LIMIT_KB * 1024)

            return (memoryLimitBytes / 1024)
                .coerceAtMost(Int.MAX_VALUE.toLong())
                .toInt()
        }
    }

    override fun openRomUriInputStream(uri: Uri): InputStream? {
        val directFile = FileUtils.resolveDirectFileFromExternalStorageUri(uri)
        if (directFile != null && directFile.exists() && directFile.canRead()) {
            runCatching { return FileInputStream(directFile) }
        }
        if (uri.scheme == "file" || uri.scheme == null) {
            uri.path?.let { path ->
                val file = File(path)
                if (file.exists() && file.canRead()) {
                    runCatching { return FileInputStream(file) }
                }
            }
        }
        runCatching {
            context.contentResolver.openFileDescriptor(uri, "r")?.let { pfd ->
                return ParcelFileDescriptor.AutoCloseInputStream(pfd)
            }
        }
        return runCatching { context.contentResolver.openInputStream(uri) }.getOrNull()
    }

    override fun getNdsEntryStreamInFileStream(fileStream: InputStream): RomFileStream? {
        if (fileStream !is FileInputStream) {
            runCatching { fileStream.close() }
            return null
        }

        val maxMemoryLimitKb = calculateMaxMemoryLimitKb(
            deviceMemoryBytes = getDeviceMemoryBytes(),
            maxHeapBytes = Runtime.getRuntime().maxMemory()
        )

        var sevenZFile: SevenZFile? = null
        var returned = false
        return try {
            sevenZFile = SevenZFile.Builder()
                .setMaxMemoryLimitKb(maxMemoryLimitKb)
                .setSeekableByteChannel(fileStream.channel)
                .get()

            val ndsEntry = getNdsEntryInFile(sevenZFile) ?: return null
            val entryStream = SevenZEntryInputStream(sevenZFile.getInputStream(ndsEntry), sevenZFile, fileStream)
            val romFileStream = RomFileStream(entryStream, SizeUnit.Bytes(ndsEntry.size))
            returned = true
            romFileStream
        } finally {
            if (!returned) {
                runCatching { sevenZFile?.close() }
                runCatching { fileStream.close() }
            }
        }
    }

    private fun getDeviceMemoryBytes(): Long {
        return context.getSystemService<ActivityManager>()?.let {
            val memoryInfo = ActivityManager.MemoryInfo()
            it.getMemoryInfo(memoryInfo)
            memoryInfo.totalMem
        } ?: Runtime.getRuntime().maxMemory()
    }

    private fun getNdsEntryInFile(sevenZFile: SevenZFile): SevenZArchiveEntry? {
        do {
            val nextEntry = sevenZFile.nextEntry ?: break
            if (!nextEntry.isDirectory && isSupportedRomFile(nextEntry.name)) {
                return nextEntry
            }
        } while (true)
        return null
    }

    private class SevenZEntryInputStream(
        stream: InputStream,
        private val sevenZFile: SevenZFile,
        private val fileStream: InputStream,
    ) : FilterInputStream(stream) {
        override fun close() {
            try {
                super.close()
            } finally {
                try {
                    sevenZFile.close()
                } catch (e: Exception) {
                    Log.w(TAG, "Failed to close 7z archive", e)
                } finally {
                    try {
                        fileStream.close()
                    } catch (e: Exception) {
                        Log.w(TAG, "Failed to close 7z file stream", e)
                    }
                }
            }
        }
    }
}
