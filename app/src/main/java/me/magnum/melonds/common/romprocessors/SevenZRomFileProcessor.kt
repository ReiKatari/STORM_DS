package me.magnum.melonds.common.romprocessors

import android.app.ActivityManager
import android.content.Context
import android.util.Log
import androidx.core.content.getSystemService
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.domain.model.SizeUnit
import me.magnum.melonds.impl.NdsRomCache
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry
import org.apache.commons.compress.archivers.sevenz.SevenZFile
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

    override fun getNdsEntryStreamInFileStream(fileStream: InputStream): RomFileStream? {
        if (fileStream !is FileInputStream) {
            return null
        }

        val maxMemoryLimitKb = calculateMaxMemoryLimitKb(
            deviceMemoryBytes = getDeviceMemoryBytes(),
            maxHeapBytes = Runtime.getRuntime().maxMemory()
        )

        val sevenZFile = SevenZFile.Builder()
            .setMaxMemoryLimitKb(maxMemoryLimitKb)
            .setSeekableByteChannel(fileStream.channel)
            .get()

        val ndsEntry = getNdsEntryInFile(sevenZFile)
        if (ndsEntry == null) {
            sevenZFile.close()
            return null
        }

        return try {
            val entryStream = SevenZEntryInputStream(sevenZFile.getInputStream(ndsEntry), sevenZFile)
            RomFileStream(entryStream, SizeUnit.Bytes(ndsEntry.size))
        } catch (e: Exception) {
            sevenZFile.close()
            throw e
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

    private class SevenZEntryInputStream(stream: InputStream, private val sevenZFile: SevenZFile) : FilterInputStream(stream) {
        override fun close() {
            try {
                super.close()
            } finally {
                try {
                    sevenZFile.close()
                } catch (e: Exception) {
                    Log.w(TAG, "Failed to close 7z archive", e)
                }
            }
        }
    }
}
