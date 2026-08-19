package me.magnum.melonds.impl.bios

import android.content.Context
import android.net.Uri
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.repositories.SettingsRepository
import java.io.File
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.zip.ZipInputStream
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BiosDownloadManager @Inject constructor(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
) {
    companion object {
        const val DS_BIOS_URL = "https://raw.githubusercontent.com/K11MCH1/AdrenoToolsDrivers/main/bios/ds_bios.zip"
        const val DSI_BIOS_URL = "https://raw.githubusercontent.com/K11MCH1/AdrenoToolsDrivers/main/bios/dsi_bios.zip"
    }

    suspend fun downloadAndSetupDsBios(
        onProgress: (Int) -> Unit = {}
    ): Result<File> = withContext(Dispatchers.IO) {
        runCatching {
            val targetDir = File(context.filesDir, "bios/ds").apply { mkdirs() }
            val tempZip = File(context.cacheDir, "temp_ds_bios_${System.currentTimeMillis()}.zip")

            try {
                downloadFile(DS_BIOS_URL, tempZip, onProgress)
                extractAndNormalizeBiosFiles(tempZip, targetDir, isDsi = false)

                val dirUri = Uri.fromFile(targetDir)
                settingsRepository.setDsBiosDirectory(dirUri)
                settingsRepository.setUseCustomBios(true)

                targetDir
            } finally {
                tempZip.delete()
            }
        }
    }

    suspend fun downloadAndSetupDsiBios(
        onProgress: (Int) -> Unit = {}
    ): Result<File> = withContext(Dispatchers.IO) {
        runCatching {
            val targetDir = File(context.filesDir, "bios/dsi").apply { mkdirs() }
            val tempZip = File(context.cacheDir, "temp_dsi_bios_${System.currentTimeMillis()}.zip")

            try {
                downloadFile(DSI_BIOS_URL, tempZip, onProgress)
                extractAndNormalizeBiosFiles(tempZip, targetDir, isDsi = true)

                val dirUri = Uri.fromFile(targetDir)
                settingsRepository.setDsiBiosDirectory(dirUri)
                settingsRepository.setUseCustomBios(true)

                targetDir
            } finally {
                tempZip.delete()
            }
        }
    }

    private fun downloadFile(urlStr: String, destination: File, onProgress: (Int) -> Unit) {
        val url = URL(urlStr)
        val connection = url.openConnection() as HttpURLConnection
        connection.connectTimeout = 15000
        connection.readTimeout = 30000
        connection.instanceFollowRedirects = true
        connection.connect()

        if (connection.responseCode !in 200..299) {
            throw java.io.IOException("HTTP error ${connection.responseCode}")
        }

        val totalLength = connection.contentLength
        var downloaded = 0

        connection.inputStream.use { input ->
            destination.outputStream().use { output ->
                val buffer = ByteArray(8192)
                var bytesRead: Int
                while (input.read(buffer).also { bytesRead = it } != -1) {
                    output.write(buffer, 0, bytesRead)
                    downloaded += bytesRead
                    if (totalLength > 0) {
                        onProgress(((downloaded.toDouble() / totalLength.toDouble()) * 100).toInt().coerceIn(0, 100))
                    }
                }
            }
        }
    }

    private fun extractAndNormalizeBiosFiles(zipFile: File, outputDir: File, isDsi: Boolean) {
        zipFile.inputStream().use { fileInput ->
            ZipInputStream(fileInput.buffered()).use { zip ->
                while (true) {
                    val entry = zip.nextEntry ?: break
                    val entryName = entry.name.substringAfterLast('/').lowercase()

                    val targetFileName = when {
                        entryName.contains("bios7") || entryName.contains("arm7") -> "bios7.bin"
                        entryName.contains("bios9") || entryName.contains("arm9") -> "bios9.bin"
                        entryName.contains("firmware") || entryName.contains("bios.bin") -> "firmware.bin"
                        isDsi && (entryName.contains("nand") || entryName.endsWith(".nand")) -> "nand.bin"
                        else -> null
                    }

                    if (targetFileName != null) {
                        val outFile = File(outputDir, targetFileName)
                        outFile.outputStream().use { out ->
                            zip.copyTo(out)
                        }
                    }
                    zip.closeEntry()
                }
            }
        }
    }
}
