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
import androidx.work.CoroutineWorker
import androidx.work.ForegroundInfo
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.runBlocking
import me.magnum.melonds.MelonDSApplication
import me.magnum.melonds.R
import me.magnum.melonds.common.cheats.CheatDatabaseParser
import me.magnum.melonds.common.cheats.CheatDatabaseParserListener
import me.magnum.melonds.common.cheats.ProgressTrackerInputStream
import me.magnum.melonds.common.cheats.UsrCheatDatParser
import me.magnum.melonds.common.cheats.XmlCheatDatabaseParser
import me.magnum.melonds.domain.model.CheatDatabase
import me.magnum.melonds.domain.model.Game
import me.magnum.melonds.domain.repositories.CheatsRepository
import java.io.InputStream
import java.util.zip.ZipInputStream
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

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

        private const val NOTIFICATION_ID_CHEATS_IMPORT = 100
    }

    override suspend fun doWork(): Result {
        setForeground(createForegroundInfo(null, 0, true))

        val uri = inputData.getString(KEY_URI)?.toUri() ?: return Result.failure()

        try {
            val databaseDocument = if (uri.scheme == "file") {
                uri.path?.let { DocumentFile.fromFile(java.io.File(it)) }
            } else {
                DocumentFile.fromSingleUri(applicationContext, uri)
            }
            if (databaseDocument?.isFile != true) {
                return Result.failure()
            }

            val totalFileSize = applicationContext.contentResolver.openAssetFileDescriptor(uri, "r")?.use {
                val length = it.length
                if (length == AssetFileDescriptor.UNKNOWN_LENGTH) {
                    null
                } else {
                    length
                }
            }

            val databaseExtension = databaseDocument.name?.substringAfterLast('.')?.lowercase()
            Log.i(TAG, "Importing cheat file '${databaseDocument.name}', ext='$databaseExtension', size=$totalFileSize")

            return when (databaseExtension) {
                "dat" -> parseStreamDocument(uri, UsrCheatDatParser(), totalFileSize)
                "xml" -> parseStreamDocument(uri, XmlCheatDatabaseParser(), totalFileSize)
                "zip" -> parseZipDocument(uri)
                else -> {
                    // Sniff format from the first bytes
                    val sniffedParser = sniffParserFromStream(uri)
                    if (sniffedParser != null) {
                        parseStreamDocument(uri, sniffedParser, totalFileSize)
                    } else {
                        Log.e(TAG, "Unsupported cheat database file format for '${databaseDocument.name}'")
                        Result.failure()
                    }
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Exception during cheat database import: ${e.message}", e)
            return Result.failure()
        }
    }

    private fun sniffParserFromStream(uri: Uri): CheatDatabaseParser? {
        return runCatching {
            applicationContext.contentResolver.openInputStream(uri)?.use { stream ->
                val header = ByteArray(16)
                val read = stream.read(header)
                if (read >= 12 && String(header, 0, 12, Charsets.US_ASCII).startsWith("R4 CheatCode")) {
                    UsrCheatDatParser()
                } else if (read >= 5 && (header[0] == '<'.code.toByte() || String(header, 0, read, Charsets.UTF_8).contains("<?xml"))) {
                    XmlCheatDatabaseParser()
                } else {
                    null
                }
            }
        }.getOrNull()
    }

    private suspend fun parseZipDocument(uri: Uri) = suspendCoroutine { continuation ->
        try {
            applicationContext.contentResolver.openInputStream(uri)?.use { rawIn ->
                val zipIn = ZipInputStream(rawIn.buffered())
                var entry = zipIn.nextEntry
                var matchingEntryName: String? = null
                var isDat = false

                while (entry != null) {
                    val entryName = entry.name.lowercase()
                    if (entryName.endsWith(".dat") || entryName.endsWith(".xml")) {
                        matchingEntryName = entry.name
                        isDat = entryName.endsWith(".dat")
                        break
                    }
                    zipIn.closeEntry()
                    entry = zipIn.nextEntry
                }

                if (matchingEntryName != null) {
                    val parser: CheatDatabaseParser = if (isDat) UsrCheatDatParser() else XmlCheatDatabaseParser()
                    Log.i(TAG, "Found valid cheat entry in zip: '$matchingEntryName', using ${parser::class.simpleName}")

                    val progressTrackerStream = ProgressTrackerInputStream(zipIn)
                    parser.parseCheatDatabase(progressTrackerStream, object : CheatDatabaseParserListener {
                        override fun onDatabaseParseStart(databaseName: String): CheatDatabase = runBlocking {
                            cheatsRepository.deleteCheatDatabaseIfExists(databaseName)
                            cheatsRepository.addCheatDatabase(databaseName)
                        }

                        override fun onGameParseStart(gameName: String) {
                            setForegroundAsync(createForegroundInfo(gameName, 50, true))
                            setProgressAsync(workDataOf(
                                KEY_PROGRESS_RELATIVE to 0.5f,
                                KEY_PROGRESS_ITEM to gameName
                            ))
                        }

                        override fun onGameParsed(game: Game): Unit = runBlocking {
                            cheatsRepository.addGameCheats(game)
                        }

                        override fun onParseComplete() {
                            Log.i(TAG, "Completed zip cheat database parse: '$matchingEntryName'")
                            continuation.resume(Result.success())
                        }
                    })
                } else {
                    Log.w(TAG, "No .dat or .xml entries found inside zip archive $uri")
                    continuation.resume(Result.failure())
                }
            } ?: continuation.resume(Result.failure())
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to parse zip cheat document: ${e.message}", e)
            continuation.resume(Result.failure())
        }
    }

    private suspend fun parseStreamDocument(uri: Uri, parser: CheatDatabaseParser, totalFileSize: Long?) = suspendCoroutine { continuation ->
        try {
            applicationContext.contentResolver.openInputStream(uri)?.use {
                val progressTrackerStream = ProgressTrackerInputStream(it)
                parser.parseCheatDatabase(progressTrackerStream, object : CheatDatabaseParserListener {
                    override fun onDatabaseParseStart(databaseName: String): CheatDatabase = runBlocking {
                        cheatsRepository.deleteCheatDatabaseIfExists(databaseName)
                        cheatsRepository.addCheatDatabase(databaseName)
                    }

                    override fun onGameParseStart(gameName: String) {
                        val readProgress = if (totalFileSize != null && totalFileSize > 0) {
                            (progressTrackerStream.totalReadBytes.toDouble() / totalFileSize * 100).toInt().coerceIn(0, 100)
                        } else {
                            50
                        }

                        setForegroundAsync(createForegroundInfo(gameName, readProgress, totalFileSize == null))
                        setProgressAsync(workDataOf(
                            KEY_PROGRESS_RELATIVE to readProgress / 100f,
                            KEY_PROGRESS_ITEM to gameName
                        ))
                    }

                    override fun onGameParsed(game: Game): Unit = runBlocking {
                        cheatsRepository.addGameCheats(game)
                    }

                    override fun onParseComplete() {
                        Log.i(TAG, "Completed direct cheat database parse with ${parser::class.simpleName}")
                        continuation.resume(Result.success())
                    }
                })
            } ?: continuation.resume(Result.failure())
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to parse direct cheat document: ${e.message}", e)
            continuation.resume(Result.failure())
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
