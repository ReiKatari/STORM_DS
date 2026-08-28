package me.magnum.melonds.impl

import android.content.Context
import android.net.Uri
import android.os.Process
import android.util.Log
import androidx.documentfile.provider.DocumentFile
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.isActive
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import me.magnum.melonds.domain.repositories.SettingsRepository
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppLogFileRecorder @Inject constructor(
    @param:ApplicationContext private val context: Context,
    private val settingsRepository: SettingsRepository,
) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    fun start() {
        scope.launch {
            settingsRepository.observeAppLogFileEnabled().collectLatest { enabled ->
                if (enabled) {
                    recordLogcat()
                }
            }
        }
    }

    fun stop() {
        scope.cancel()
    }

    private suspend fun recordLogcat() {
        val rootBase = android.os.Environment.getExternalStorageDirectory()
        val logsDir = java.io.File(rootBase, "STORM DS/logs").apply { mkdirs() }
        val logFile = java.io.File(logsDir, LOG_FILE_NAME)

        try {
            java.io.FileOutputStream(logFile, true).use { outputStream ->
                BufferedWriter(OutputStreamWriter(outputStream)).use { writer ->
                    writer.appendLine()
                    writer.appendLine("STORM DS app log")
                    writer.appendLine("started=${DATE_FORMAT.format(Date())}")
                    writer.appendLine("pid=${Process.myPid()}")
                    writer.appendLine("logsDirectory=${logsDir.absolutePath}")
                    writer.appendLine()
                    writer.flush()

                    val logcatProcess = ProcessBuilder(
                        "logcat",
                        "-v",
                        "threadtime",
                        "--pid=${Process.myPid()}",
                        "-T",
                        "1",
                    )
                        .redirectErrorStream(true)
                        .start()

                    val coroutineContext = currentCoroutineContext()
                    val cancellationHandle = coroutineContext.job.invokeOnCompletion {
                        logcatProcess.destroy()
                    }
                    try {
                        logcatProcess.inputStream.bufferedReader().useLines { lines ->
                            for (line in lines) {
                                if (!coroutineContext.isActive) {
                                    break
                                }
                                writer.appendLine(line)
                                writer.flush()
                            }
                        }
                    } finally {
                        logcatProcess.destroy()
                        runCatching {
                            logcatProcess.waitFor()
                        }
                        cancellationHandle.dispose()
                    }
                }
            }
        } catch (e: Throwable) {
            Log.w(TAG, "Could not open app log file for writing: ${logFile.absolutePath}", e)
        }
    }

    private companion object {
        const val TAG = "AppLogFileRecorder"
        const val LOG_FILE_NAME = "STORM_DS.log"
        val DATE_FORMAT = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z", Locale.US)
    }
}
