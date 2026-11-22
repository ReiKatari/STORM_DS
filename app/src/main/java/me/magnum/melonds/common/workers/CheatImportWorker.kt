package me.magnum.melonds.common.workers

import android.content.Context
import android.content.pm.ServiceInfo
import android.content.res.AssetFileDescriptor
import android.net.Uri
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import androidx.documentfile.provider.DocumentFile
import androidx.hilt.work.HiltWorker
import androidx.preference.PreferenceManager
import androidx.work.CoroutineWorker
import androidx.work.ForegroundInfo
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.CancellationException
import me.magnum.melonds.MelonDSApplication
import me.magnum.melonds.R
import me.magnum.melonds.common.cheats.CheatDatabaseParser
import me.magnum.melonds.common.cheats.ProgressTrackerInputStream
import me.magnum.melonds.common.cheats.UsrCheatDatabaseParser
import me.magnum.melonds.common.cheats.XmlCheatDatabaseParser
import me.magnum.melonds.domain.repositories.CheatsRepository
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.util.zip.ZipInputStream

@HiltWorker
class CheatImportWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val cheatsRepository: CheatsRepository
) : CoroutineWorker(appContext, workerParams) {

    companion object {
        private const val TAG = "CheatImportWorker"
        const val KEY_URI = "uri"
        const val KEY_PROGRESS_RELATIVE = "progress_relative"
        const val KEY_PROGRESS_ITEM = "progress_item"
        const val PREF_CHEATS_DB_LAST_UPDATED_MS = "cheats_db_last_updated_ms"

        private const val NOTIFICATION_ID_CHEATS_IMPORT = 100
        private const val PROGRESS_THROTTLE_MS = 250L
    }

    private fun markDatabaseUpdated() {
        PreferenceManager.getDefaultSharedPreferences(applicationContext)
            .edit()
            .putLong(PREF_CHEATS_DB_LAST_UPDATED_MS, System.currentTimeMillis())
            .apply()
    }

    private fun openInputStreamForUri(uri: Uri): InputStream? {
        return if (uri.scheme == "file") {
            val path = uri.path ?: return null
            val file = File(path)
            if (file.exists() && file.isFile) FileInputStream(file) else null
        } else {
            applicationContext.contentResolver.openInputStream(uri)
        }
    }

    override suspend fun doWork(): Result {
        runCatching { setForeground(createForegroundInfo(null, 0, true)) }

        val uri = inputData.getString(KEY_URI)?.toUri() ?: return Result.failure()

        try {
            val databaseDocument = if (uri.scheme == "file") {
                uri.path?.let { DocumentFile.fromFile(File(it)) }
            } else {
                DocumentFile.fromSingleUri(applicationContext, uri)
            }
            if (databaseDocument?.isFile != true) {
                return Result.failure()
            }

            val totalFileSize = if (uri.scheme == "file") {
                uri.path?.let { File(it).length().takeIf { len -> len > 0L } }
            } else {
                runCatching {
                    applicationContext.contentResolver.openAssetFileDescriptor(uri, "r")?.use {
                        val length = it.length
                        if (length == AssetFileDescriptor.UNKNOWN_LENGTH) null else length
                    }
                }.getOrNull()
            }

            val databaseExtension = databaseDocument.name?.substringAfterLast('.')?.lowercase()
            Log.i(TAG, "Importing cheat file '${databaseDocument.name}', ext='$databaseExtension', size=$totalFileSize")

            return when (databaseExtension) {
                "dat" -> parseStreamDocument(uri, UsrCheatDatabaseParser(), totalFileSize)
                "xml" -> parseStreamDocument(uri, XmlCheatDatabaseParser(), totalFileSize)
                "zip" -> parseZipDocument(uri)
                else -> {
                    val sniffedParser = sniffParserFromStream(uri)
                    if (sniffedParser != null) {
                        parseStreamDocument(uri, sniffedParser, totalFileSize)
                    } else {
                        Log.e(TAG, "Unsupported cheat database file format for '${databaseDocument.name}'")
                        Result.failure()
                    }
                }
            }
        } catch (e: CancellationException) {
            throw e
        } catch (e: Exception) {
            Log.e(TAG, "Exception during cheat database import: ${e.message}", e)
            return Result.failure()
        }
    }

    private fun sniffParserFromStream(uri: Uri): CheatDatabaseParser? {
        return runCatching {
            openInputStreamForUri(uri)?.use { stream ->
                val header = ByteArray(16)
                val read = stream.read(header)
                if (read >= 12 && String(header, 0, 12, Charsets.US_ASCII).startsWith("R4 CheatCode")) {
                    UsrCheatDatabaseParser()
                } else if (read >= 5 && (header[0] == '<'.code.toByte() || String(header, 0, read, Charsets.UTF_8).contains("<?xml"))) {
                    XmlCheatDatabaseParser()
                } else {
                    null
                }
            }
        }.getOrNull()
    }

    private suspend fun parseZipDocument(uri: Uri): Result {
        openInputStreamForUri(uri)?.use { rawIn ->
            val zipIn = ZipInputStream(rawIn.buffered())
            var entry = zipIn.nextEntry
            var matchingEntryName: String? = null
            var entrySize: Long? = null
            var isDat = false

            while (entry != null) {
                val entryName = entry.name.lowercase()
                if (!entry.isDirectory && (entryName.endsWith(".dat") || entryName.endsWith(".xml"))) {
                    matchingEntryName = entry.name
                    entrySize = entry.size.takeIf { it > 0L }
                    isDat = entryName.endsWith(".dat")
                    break
                }
                zipIn.closeEntry()
                entry = zipIn.nextEntry
            }

            if (matchingEntryName != null) {
                val parser: CheatDatabaseParser = if (isDat) UsrCheatDatabaseParser() else XmlCheatDatabaseParser()
                Log.i(TAG, "Found valid cheat entry in zip: '$matchingEntryName', using ${parser::class.simpleName}")
                val stream = ProgressTrackerInputStream(zipIn)
                importWithProgress(stream, parser, entrySize)
                Log.i(TAG, "Completed zip cheat database parse: '$matchingEntryName'")
                markDatabaseUpdated()
                return Result.success()
            } else {
                Log.w(TAG, "No .dat or .xml entries found inside zip archive $uri")
                return Result.failure()
            }
        }
        return Result.failure()
    }

    private suspend fun parseStreamDocument(uri: Uri, parser: CheatDatabaseParser, totalFileSize: Long?): Result {
        val input = openInputStreamForUri(uri) ?: return Result.failure()
        input.use {
            val stream = ProgressTrackerInputStream(it.buffered())
            importWithProgress(stream, parser, totalFileSize)
        }
        Log.i(TAG, "Completed direct cheat database parse with ${parser::class.simpleName}")
        markDatabaseUpdated()
        return Result.success()
    }

    private suspend fun importWithProgress(
        stream: ProgressTrackerInputStream,
        parser: CheatDatabaseParser,
        totalFileSize: Long?,
    ) {
        var lastProgressUpdateMs = 0L
        val isIndeterminate = totalFileSize == null || totalFileSize <= 0L
        cheatsRepository.replaceImportedCheats(stream, parser) { gameName ->
            val now = System.currentTimeMillis()
            if (now - lastProgressUpdateMs < PROGRESS_THROTTLE_MS) {
                return@replaceImportedCheats
            }
            lastProgressUpdateMs = now
            val readProgress = if (totalFileSize != null && totalFileSize > 0L) {
                (stream.totalReadBytes.toDouble() / totalFileSize * 100).toInt().coerceIn(0, 100)
            } else {
                0
            }

            setForegroundAsync(createForegroundInfo(gameName, readProgress, isIndeterminate))
            setProgressAsync(
                workDataOf(
                    KEY_PROGRESS_RELATIVE to readProgress / 100f,
                    KEY_PROGRESS_ITEM to gameName,
                )
            )
        }
    }

    private fun createForegroundInfo(gameName: String?, progress: Int, indeterminate: Boolean): ForegroundInfo {
        val notification = NotificationCompat.Builder(applicationContext, MelonDSApplication.NOTIFICATION_CHANNEL_ID_BACKGROUND_TASKS)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setSubText(applicationContext.getString(R.string.importing_cheats))
            .setContentTitle(gameName ?: "")
            .setColor(ContextCompat.getColor(applicationContext, R.color.melonMain))
            .setSmallIcon(R.drawable.ic_melon_small)
            .setProgress(100, progress, indeterminate)
            .build()

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            ForegroundInfo(NOTIFICATION_ID_CHEATS_IMPORT, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC)
        } else {
            ForegroundInfo(NOTIFICATION_ID_CHEATS_IMPORT, notification)
        }
    }
}
