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

    private data class LogTarget(
        val logsDir: java.io.File,
        val logFile: java.io.File,
        val isPrimaryExternal: Boolean,
    )

    private fun resolvePrimaryLogsDir(): java.io.File {
        return java.io.File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/logs")
    }

    private fun canWritePrimaryExternalDir(): Boolean {
        val hasPerm = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            android.os.Environment.isExternalStorageManager()
        } else {
            androidx.core.content.ContextCompat.checkSelfPermission(
                context,
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE,
            ) == android.content.pm.PackageManager.PERMISSION_GRANTED
        }
        if (!hasPerm) return false
        val primaryDir = resolvePrimaryLogsDir()
        return runCatching {
            (primaryDir.exists() || primaryDir.mkdirs()) && primaryDir.isDirectory && primaryDir.canWrite()
        }.getOrDefault(false)
    }

    private fun rotateIfNeeded(logFile: java.io.File) {
        if (logFile.exists() && logFile.length() >= MAX_LOG_FILE_BYTES) {
            val rotated = java.io.File(logFile.parentFile, "$LOG_FILE_NAME.1")
            runCatching {
                if (rotated.exists()) rotated.delete()
                logFile.renameTo(rotated)
            }
        }
    }

    private fun resolveWritableLogFile(): Pair<LogTarget, java.io.FileOutputStream>? {
        val primaryDir = resolvePrimaryLogsDir()
        val candidates = buildList {
            add(LogTarget(primaryDir, java.io.File(primaryDir, LOG_FILE_NAME), isPrimaryExternal = true))
            context.getExternalFilesDir(null)?.let { extFiles ->
                val dir = java.io.File(extFiles, "logs")
                add(LogTarget(dir, java.io.File(dir, LOG_FILE_NAME), isPrimaryExternal = false))
            }
            val internalDir = java.io.File(context.filesDir, "logs")
            add(LogTarget(internalDir, java.io.File(internalDir, LOG_FILE_NAME), isPrimaryExternal = false))
        }
        for (target in candidates) {
            val stream = runCatching {
                target.logsDir.mkdirs()
                rotateIfNeeded(target.logFile)
                java.io.FileOutputStream(target.logFile, true)
            }.getOrNull()
            if (stream != null) {
                return target to stream
            }
        }
        return null
    }

    private suspend fun recordLogcat() {
        val coroutineContext = currentCoroutineContext()
        while (coroutineContext.isActive) {
            val opened = resolveWritableLogFile()
            if (opened == null) {
                Log.w(TAG, "Could not open app log file in external storage or app-specific fallback dir")
                return
            }
            var (target, outputStream) = opened
            var switchToPrimary = false

            try {
                outputStream.use { stream ->
                    var writer = BufferedWriter(OutputStreamWriter(stream))
                    var currentFileStream: java.io.FileOutputStream = stream
                    var bytesWrittenApprox = target.logFile.length()
                    var linesSinceCheck = 0

                    fun writeHeader(w: BufferedWriter, dir: java.io.File) {
                        w.appendLine()
                        w.appendLine("STORM DS app log")
                        w.appendLine("started=${DATE_FORMAT.format(Date())}")
                        w.appendLine("pid=${Process.myPid()}")
                        w.appendLine("logsDirectory=${dir.absolutePath}")
                        w.appendLine()
                        w.flush()
                    }

                    writeHeader(writer, target.logsDir)

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
                                bytesWrittenApprox += line.length + 1L
                                linesSinceCheck++

                                if (linesSinceCheck >= CHECK_INTERVAL_LINES) {
                                    linesSinceCheck = 0
                                    writer.flush()
                                    if (!target.isPrimaryExternal && canWritePrimaryExternalDir()) {
                                        switchToPrimary = true
                                        break
                                    }
                                    if (bytesWrittenApprox >= MAX_LOG_FILE_BYTES || target.logFile.length() >= MAX_LOG_FILE_BYTES) {
                                        runCatching { writer.close() }
                                        rotateIfNeeded(target.logFile)
                                        currentFileStream = java.io.FileOutputStream(target.logFile, true)
                                        writer = BufferedWriter(OutputStreamWriter(currentFileStream))
                                        bytesWrittenApprox = target.logFile.length()
                                        writeHeader(writer, target.logsDir)
                                    }
                                }
                            }
                        }
                    } finally {
                        runCatching { writer.flush() }
                        runCatching { if (currentFileStream !== stream) currentFileStream.close() }
                        logcatProcess.destroy()
                        runCatching {
                            logcatProcess.waitFor()
                        }
                        cancellationHandle.dispose()
                    }
                }
            } catch (e: Throwable) {
                Log.w(TAG, "Could not open app log file for writing: ${target.logFile.absolutePath}", e)
                return
            }

            if (!switchToPrimary) {
                return
            }
        }
    }

    private companion object {
        const val TAG = "AppLogFileRecorder"
        const val LOG_FILE_NAME = "STORM_DS.log"
        const val MAX_LOG_FILE_BYTES = 2L * 1024L * 1024L
        const val CHECK_INTERVAL_LINES = 100
        val DATE_FORMAT = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z", Locale.US)
    }
}
