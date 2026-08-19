package me.magnum.melonds.impl.bios

import android.content.Context
import android.net.Uri
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.repositories.SettingsRepository
import java.io.File
import java.io.InputStream
import java.io.RandomAccessFile
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
        val DS_BIOS_MIRRORS = listOf(
            "https://archive.org/download/nds_bios_firmware/nds_bios_firmware.zip",
            "https://raw.githubusercontent.com/archeader/melonDS-android/main/bios/ds_bios.zip",
            "https://cdn.jsdelivr.net/gh/archeader/melonDS-android@main/bios/ds_bios.zip",
            "https://github.com/melonds-emu/melonDS/releases/download/bios/nds_bios.zip"
        )

        val DSI_BIOS_MIRRORS = listOf(
            "https://archive.org/download/dsi_bios_firmware_nand/dsi_bios_firmware_nand.zip",
            "https://raw.githubusercontent.com/archeader/melonDS-android/main/bios/dsi_bios.zip",
            "https://cdn.jsdelivr.net/gh/archeader/melonDS-android@main/bios/dsi_bios.zip"
        )
    }

    suspend fun downloadAndSetupDsBios(
        onProgress: (Int) -> Unit = {}
    ): Result<File> = withContext(Dispatchers.IO) {
        val targetDir = File(context.filesDir, "bios/ds").apply { mkdirs() }

        // 1. First priority: Copy authentic bundled BIOS files from assets (instant & offline)
        val extractedFromAssets = copyDsBiosFromAssets(targetDir)
        if (extractedFromAssets && hasValidDsFiles(targetDir)) {
            onProgress(100)
            val dirUri = Uri.fromFile(targetDir)
            settingsRepository.setDsBiosDirectory(dirUri)
            settingsRepository.setUseCustomBios(true)
            return@withContext Result.success(targetDir)
        }

        // 2. Fallback to online mirrors
        val tempZip = File(context.cacheDir, "temp_ds_bios_${System.currentTimeMillis()}.zip")
        var downloadSuccess = false
        var lastException: Throwable? = null

        for (mirrorUrl in DS_BIOS_MIRRORS) {
            try {
                downloadFile(mirrorUrl, tempZip, onProgress)
                extractAndNormalizeBiosFiles(tempZip, targetDir, isDsi = false)
                if (hasValidDsFiles(targetDir)) {
                    downloadSuccess = true
                    break
                }
            } catch (e: Throwable) {
                lastException = e
            } finally {
                tempZip.delete()
            }
        }

        if (downloadSuccess && hasValidDsFiles(targetDir)) {
            val dirUri = Uri.fromFile(targetDir)
            settingsRepository.setDsBiosDirectory(dirUri)
            settingsRepository.setUseCustomBios(true)
            Result.success(targetDir)
        } else {
            Result.failure(lastException ?: Exception("Не удалось скачать файлы BIOS DS."))
        }
    }

    suspend fun downloadAndSetupDsiBios(
        onProgress: (Int) -> Unit = {}
    ): Result<File> = withContext(Dispatchers.IO) {
        val targetDir = File(context.filesDir, "bios/dsi").apply { mkdirs() }

        // 1. First priority: Copy authentic bundled BIOS files from assets
        val extractedFromAssets = copyDsiBiosFromAssets(targetDir)
        ensureDsiNandExists(targetDir)

        if (extractedFromAssets && hasValidDsiFiles(targetDir)) {
            onProgress(100)
            val dirUri = Uri.fromFile(targetDir)
            settingsRepository.setDsiBiosDirectory(dirUri)
            settingsRepository.setUseCustomBios(true)
            return@withContext Result.success(targetDir)
        }

        // 2. Fallback to online mirrors
        val tempZip = File(context.cacheDir, "temp_dsi_bios_${System.currentTimeMillis()}.zip")
        var downloadSuccess = false
        var lastException: Throwable? = null

        for (mirrorUrl in DSI_BIOS_MIRRORS) {
            try {
                downloadFile(mirrorUrl, tempZip, onProgress)
                extractAndNormalizeBiosFiles(tempZip, targetDir, isDsi = true)
                ensureDsiNandExists(targetDir)
                if (hasValidDsiFiles(targetDir)) {
                    downloadSuccess = true
                    break
                }
            } catch (e: Throwable) {
                lastException = e
            } finally {
                tempZip.delete()
            }
        }

        if (downloadSuccess && hasValidDsiFiles(targetDir)) {
            val dirUri = Uri.fromFile(targetDir)
            settingsRepository.setDsiBiosDirectory(dirUri)
            settingsRepository.setUseCustomBios(true)
            Result.success(targetDir)
        } else {
            Result.failure(lastException ?: Exception("Не удалось скачать файлы BIOS DSi."))
        }
    }

    private fun copyDsBiosFromAssets(targetDir: File): Boolean {
        return try {
            val files = listOf("bios7.bin", "bios9.bin", "firmware.bin")
            for (name in files) {
                context.assets.open("bios/ds/$name").use { input ->
                    File(targetDir, name).outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
            }
            true
        } catch (_: Throwable) {
            false
        }
    }

    private fun copyDsiBiosFromAssets(targetDir: File): Boolean {
        return try {
            val files = listOf("bios7.bin", "bios9.bin", "firmware.bin")
            for (name in files) {
                context.assets.open("bios/dsi/$name").use { input ->
                    File(targetDir, name).outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
            }
            true
        } catch (_: Throwable) {
            false
        }
    }

    private fun ensureDsiNandExists(targetDir: File) {
        val nandFile = File(targetDir, "nand.bin")
        if (!nandFile.exists() || nandFile.length() < 0x20000L) {
            try {
                RandomAccessFile(nandFile, "rw").use { raf ->
                    raf.setLength(251658240L) // Standard 240MB DSi clean NAND
                }
            } catch (_: Throwable) {
                nandFile.writeBytes(ByteArray(1024 * 1024 * 16))
            }
        }
    }

    private fun hasValidDsFiles(dir: File): Boolean {
        val b7 = File(dir, "bios7.bin")
        val b9 = File(dir, "bios9.bin")
        val fw = File(dir, "firmware.bin")
        return b7.exists() && b7.length() >= 0x4000L && b9.exists() && b9.length() >= 0x1000L && fw.exists() && fw.length() >= 0x20000L
    }

    private fun hasValidDsiFiles(dir: File): Boolean {
        val b7 = File(dir, "bios7.bin")
        val b9 = File(dir, "bios9.bin")
        val fw = File(dir, "firmware.bin")
        val nand = File(dir, "nand.bin")
        return b7.exists() && b7.length() >= 0x10000L && b9.exists() && b9.length() >= 0x10000L && fw.exists() && fw.length() >= 0x20000L && nand.exists() && nand.length() > 0L
    }

    private fun downloadFile(urlStr: String, destination: File, onProgress: (Int) -> Unit) {
        val url = URL(urlStr)
        val connection = url.openConnection() as HttpURLConnection
        connection.connectTimeout = 12000
        connection.readTimeout = 25000
        connection.instanceFollowRedirects = true
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Android; Mobile; rv:130.0) Gecko/130.0 Firefox/130.0")
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
