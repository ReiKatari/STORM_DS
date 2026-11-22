package me.magnum.melonds.impl.bios

import android.content.Context
import android.net.Uri
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.network.HttpRedirectHelper
import me.magnum.melonds.domain.repositories.SettingsRepository
import java.io.File
import java.io.IOException
import java.io.RandomAccessFile
import java.util.zip.ZipInputStream
import javax.inject.Inject
import javax.inject.Singleton
import me.magnum.melonds.R

@Singleton
class BiosDownloadManager @Inject constructor(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
) {
    companion object {
        val DS_BIOS_MIRRORS = listOf(
            "https://github.com/ReiKatari/STORM_DS_TOOLS/releases/download/0.0.3/Nintendo_DS.zip",
            "https://raw.githubusercontent.com/archeader/melonDS-android/main/bios/ds_bios.zip",
            "https://cdn.jsdelivr.net/gh/archeader/melonDS-android@main/bios/ds_bios.zip",
            "https://github.com/melonds-emu/melonDS/releases/download/bios/nds_bios.zip",
            "https://archive.org/download/nds_bios_firmware/nds_bios_firmware.zip"
        )

        val DSI_BIOS_MIRRORS = listOf(
            "https://github.com/ReiKatari/STORM_DS_TOOLS/releases/download/0.0.3/Nintendo_DSi.zip",
            "https://raw.githubusercontent.com/archeader/melonDS-android/main/bios/dsi_bios.zip",
            "https://cdn.jsdelivr.net/gh/archeader/melonDS-android@main/bios/dsi_bios.zip",
            "https://github.com/melonds-emu/melonDS/releases/download/bios/dsi_bios.zip",
            "https://archive.org/download/nds_bios_firmware/nds_bios_firmware.zip"
        )
    }

    private fun isBiosDownloadBlocked(): Boolean {
        return runCatching {
            androidx.preference.PreferenceManager.getDefaultSharedPreferences(context)
                .getBoolean("block_bios_download", false)
        }.getOrDefault(false)
    }

    suspend fun downloadAndSetupDsBios(
        onProgress: (Int) -> Unit = {}
    ): Result<File> = withContext(Dispatchers.IO) {
        if (isBiosDownloadBlocked()) {
            return@withContext Result.failure(
                IllegalStateException(context.getString(me.magnum.melonds.R.string.bios_download_blocked_error))
            )
        }
        val rootDsDir = File(File(android.os.Environment.getExternalStorageDirectory(), "STORM DS"), "bios/ds")
        val stagingDir = File(context.cacheDir, "staging_ds_bios_${System.currentTimeMillis()}").apply { mkdirs() }
        val tempZip = File(context.cacheDir, "temp_ds_bios_${System.currentTimeMillis()}.zip")
        var downloadSuccess = false
        var lastException: Throwable? = null

        try {
            for (mirrorUrl in DS_BIOS_MIRRORS) {
                try {
                    clearDirectoryContents(stagingDir)
                    downloadFile(mirrorUrl, tempZip, onProgress)
                    extractZipDirectly(tempZip, stagingDir)
                    if (hasValidDsFiles(stagingDir)) {
                        downloadSuccess = true
                        break
                    }
                } catch (e: Throwable) {
                    lastException = e
                } finally {
                    runCatching { tempZip.delete() }
                }
            }

            if (!downloadSuccess) {
                clearDirectoryContents(stagingDir)
                val extractedFromAssets = copyDsBiosFromAssets(stagingDir)
                if (extractedFromAssets && hasValidDsFiles(stagingDir)) {
                    downloadSuccess = true
                }
            }

            if (downloadSuccess && hasValidDsFiles(stagingDir)) {
                rootDsDir.mkdirs()
                copyStagedFiles(stagingDir, rootDsDir, preserveExistingNand = false)
                if (hasValidDsFiles(rootDsDir)) {
                    onProgress(100)
                    val dirUri = Uri.fromFile(rootDsDir)
                    settingsRepository.setDsBiosDirectory(dirUri)
                    settingsRepository.setUseCustomBios(true)
                    Result.success(rootDsDir)
                } else {
                    Result.failure(lastException ?: Exception(context.getString(R.string.v870_bios_ds_verify_failed)))
                }
            } else {
                Result.failure(lastException ?: Exception(context.getString(R.string.v870_bios_ds_download_failed)))
            }
        } finally {
            runCatching { tempZip.delete() }
            runCatching { stagingDir.deleteRecursively() }
        }
    }

    suspend fun downloadAndSetupDsiBios(
        onProgress: (Int) -> Unit = {}
    ): Result<File> = withContext(Dispatchers.IO) {
        if (isBiosDownloadBlocked()) {
            return@withContext Result.failure(
                IllegalStateException(context.getString(me.magnum.melonds.R.string.bios_download_blocked_error))
            )
        }
        val rootDsiDir = File(File(android.os.Environment.getExternalStorageDirectory(), "STORM DS"), "bios/dsi")
        val existingValidNand = File(rootDsiDir, "nand.bin").takeIf { isValidNandFile(it) }
        val stagingDir = File(context.cacheDir, "staging_dsi_bios_${System.currentTimeMillis()}").apply { mkdirs() }
        val tempZip = File(context.cacheDir, "temp_dsi_bios_${System.currentTimeMillis()}.zip")
        var downloadSuccess = false
        var lastException: Throwable? = null

        try {
            for (mirrorUrl in DSI_BIOS_MIRRORS) {
                try {
                    clearDirectoryContents(stagingDir)
                    downloadFile(mirrorUrl, tempZip, onProgress)
                    extractZipDirectly(tempZip, stagingDir)
                    val hasCoreBios = hasValidDsiCoreFiles(stagingDir)
                    val hasNand = isValidNandFile(File(stagingDir, "nand.bin")) || existingValidNand != null
                    if (hasCoreBios && hasNand) {
                        ensureFontTablePresent(stagingDir)
                        downloadSuccess = true
                        break
                    }
                } catch (e: Throwable) {
                    lastException = e
                } finally {
                    runCatching { tempZip.delete() }
                }
            }

            if (!downloadSuccess) {
                clearDirectoryContents(stagingDir)
                copyDsiBiosFromAssets(stagingDir)
                if (existingValidNand == null && !isValidNandFile(File(stagingDir, "nand.bin"))) {
                    createCleanDsiNand(File(stagingDir, "nand.bin"))
                }
                if (hasValidDsiCoreFiles(stagingDir) && (isValidNandFile(File(stagingDir, "nand.bin")) || existingValidNand != null)) {
                    ensureFontTablePresent(stagingDir)
                    downloadSuccess = true
                }
            }

            if (downloadSuccess) {
                rootDsiDir.mkdirs()
                copyStagedFiles(stagingDir, rootDsiDir, preserveExistingNand = existingValidNand != null)
                if (hasValidDsiFiles(rootDsiDir)) {
                    onProgress(100)
                    val dirUri = Uri.fromFile(rootDsiDir)
                    settingsRepository.setDsiBiosDirectory(dirUri)
                    settingsRepository.setUseCustomBios(true)
                    Result.success(rootDsiDir)
                } else {
                    Result.failure(lastException ?: Exception(context.getString(R.string.v870_bios_dsi_verify_failed)))
                }
            } else {
                Result.failure(lastException ?: Exception(context.getString(R.string.v870_bios_dsi_download_failed)))
            }
        } finally {
            runCatching { tempZip.delete() }
            runCatching { stagingDir.deleteRecursively() }
        }
    }

    private fun clearDirectoryContents(dir: File) {
        dir.listFiles()?.forEach { it.deleteRecursively() }
    }

    private fun copyStagedFiles(stagingDir: File, targetDir: File, preserveExistingNand: Boolean) {
        stagingDir.listFiles()?.forEach { srcFile ->
            if (!srcFile.isFile) return@forEach
            if (preserveExistingNand && srcFile.name.equals("nand.bin", ignoreCase = true)) {
                val existingNand = File(targetDir, "nand.bin")
                if (isValidNandFile(existingNand)) {
                    return@forEach
                }
            }
            srcFile.copyTo(File(targetDir, srcFile.name), overwrite = true)
        }
    }

    private fun createCleanDsiNand(nandFile: File) {
        try {
            RandomAccessFile(nandFile, "rw").use { raf ->
                raf.setLength(251658240L) // 240 MB

                // 1. Write MBR at sector 0
                val mbr = ByteArray(512)
                // Partition 1: active (0x80), start LBA 0x0800 (sector 2048), FAT16 (0x06), sectors 0x00060000
                mbr[0x1BE] = 0x80.toByte()
                mbr[0x1C2] = 0x06.toByte() // FAT16
                // Start LBA 0x0800
                mbr[0x1C6] = 0x00.toByte()
                mbr[0x1C7] = 0x08.toByte()
                mbr[0x1C8] = 0x00.toByte()
                mbr[0x1C9] = 0x00.toByte()
                // Sectors 0x00060000
                mbr[0x1CA] = 0x00.toByte()
                mbr[0x1CB] = 0x00.toByte()
                mbr[0x1CC] = 0x06.toByte()
                mbr[0x1CD] = 0x00.toByte()

                // MBR Signature
                mbr[0x1FE] = 0x55.toByte()
                mbr[0x1FF] = 0xAA.toByte()

                raf.seek(0)
                raf.write(mbr)

                // 2. Write Partition 1 FAT16 Boot Sector at offset 0x100000 (1 MB)
                val vbr = ByteArray(512)
                vbr[0] = 0xEB.toByte()
                vbr[1] = 0x3C.toByte()
                vbr[2] = 0x90.toByte()
                System.arraycopy("MSDOS5.0".toByteArray(Charsets.US_ASCII), 0, vbr, 3, 8)
                vbr[11] = 0x00.toByte(); vbr[12] = 0x02.toByte() // Bytes per sector: 512
                vbr[13] = 0x08.toByte() // Sectors per cluster: 8 (4KB)
                vbr[14] = 0x04.toByte(); vbr[15] = 0x00.toByte() // Reserved sectors: 4
                vbr[16] = 0x02.toByte() // Number of FATs: 2
                vbr[17] = 0x00.toByte(); vbr[18] = 0x02.toByte() // Root directory entries: 512
                vbr[21] = 0xF8.toByte() // Media descriptor
                vbr[22] = 0x00.toByte(); vbr[23] = 0x01.toByte() // Sectors per FAT: 256
                vbr[24] = 0x20.toByte(); vbr[25] = 0x00.toByte() // Sectors per track: 32
                vbr[26] = 0x40.toByte(); vbr[27] = 0x00.toByte() // Heads: 64
                // Hidden sectors: 0x0800
                vbr[28] = 0x00.toByte(); vbr[29] = 0x08.toByte(); vbr[30] = 0x00.toByte(); vbr[31] = 0x00.toByte()
                // Total sectors (32-bit): 0x00060000
                vbr[32] = 0x00.toByte(); vbr[33] = 0x00.toByte(); vbr[34] = 0x06.toByte(); vbr[35] = 0x00.toByte()
                vbr[38] = 0x29.toByte() // Extended signature
                System.arraycopy("DSi NAND   ".toByteArray(Charsets.US_ASCII), 0, vbr, 43, 11)
                System.arraycopy("FAT16   ".toByteArray(Charsets.US_ASCII), 0, vbr, 54, 8)
                vbr[510] = 0x55.toByte(); vbr[511] = 0xAA.toByte()

                raf.seek(0x100000L)
                raf.write(vbr)

                // Write FAT1 and FAT2 initial headers
                val fatHeader = byteArrayOf(0xF8.toByte(), 0xFF.toByte(), 0xFF.toByte(), 0xFF.toByte())
                raf.seek(0x100800L) // FAT1 (res sectors 4 * 512 = 0x800)
                raf.write(fatHeader)
                raf.seek(0x120800L) // FAT2 (FAT1 + 256 sectors * 512 = 0x20000)
                raf.write(fatHeader)

                // 3. Write NOCASH footer at offset 0x000FF800 AND at end of file (length - 0x40)
                val footer = ByteArray(64)
                val magic = "DSi eMMC CID/CPU".toByteArray(Charsets.US_ASCII)
                System.arraycopy(magic, 0, footer, 0, magic.size)
                // Default eMMC CID (16 bytes)
                val cid = byteArrayOf(
                    0x15.toByte(), 0x00.toByte(), 0x00.toByte(), 0x00.toByte(),
                    0x00.toByte(), 0x00.toByte(), 0x00.toByte(), 0x00.toByte(),
                    0x00.toByte(), 0x00.toByte(), 0x00.toByte(), 0x00.toByte(),
                    0x00.toByte(), 0x00.toByte(), 0x00.toByte(), 0x01.toByte()
                )
                System.arraycopy(cid, 0, footer, 16, 16)
                // Console ID (8 bytes): 0x0000000100000001L
                footer[32] = 0x01.toByte(); footer[36] = 0x01.toByte()

                raf.seek(0x000FF800L)
                raf.write(footer)

                raf.seek(251658240L - 0x40L)
                raf.write(footer)
            }
        } catch (_: Throwable) {}
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
            val files = listOf("bios7.bin", "bios9.bin", "firmware.bin", "TWLFontTable.dat")
            for (name in files) {
                runCatching {
                    context.assets.open("bios/dsi/$name").use { input ->
                        File(targetDir, name).outputStream().use { output ->
                            input.copyTo(output)
                        }
                    }
                }
            }
            true
        } catch (_: Throwable) {
            false
        }
    }

    private fun hasValidDsFiles(dir: File): Boolean {
        val b7 = if (File(dir, "ds_bios7.bin").exists()) File(dir, "ds_bios7.bin") else File(dir, "bios7.bin")
        val b9 = if (File(dir, "ds_bios9.bin").exists()) File(dir, "ds_bios9.bin") else File(dir, "bios9.bin")
        val fw = if (File(dir, "ds_firmware.bin").exists()) File(dir, "ds_firmware.bin") else File(dir, "firmware.bin")
        return b7.exists() && b7.length() >= 0x4000L && b9.exists() && b9.length() >= 0x1000L && fw.exists() && fw.length() >= 0x20000L
    }

    private fun hasValidDsiCoreFiles(dir: File): Boolean {
        val b7 = if (File(dir, "dsi_bios7.bin").exists()) File(dir, "dsi_bios7.bin") else File(dir, "bios7.bin")
        val b9 = if (File(dir, "dsi_bios9.bin").exists()) File(dir, "dsi_bios9.bin") else File(dir, "bios9.bin")
        val fw = if (File(dir, "dsi_firmware.bin").exists()) File(dir, "dsi_firmware.bin") else File(dir, "firmware.bin")
        return b7.exists() && b7.length() >= 0x10000L && b9.exists() && b9.length() >= 0x10000L && fw.exists() && fw.length() >= 0x20000L
    }

    private fun ensureFontTablePresent(dir: File) {
        val font = File(dir, "TWLFontTable.dat")
        if (!font.exists() || font.length() < 100000L) {
            runCatching {
                context.assets.open("bios/dsi/TWLFontTable.dat").use { input ->
                    font.outputStream().use { output -> input.copyTo(output) }
                }
            }
        }
    }

    private fun isValidNandFile(nand: File): Boolean {
        if (!nand.exists() || nand.length() < 1024 * 1024L) {
            return false
        }
        return try {
            RandomAccessFile(nand, "r").use { raf ->
                val len = raf.length()
                if (len >= 0x40) {
                    raf.seek(len - 0x40)
                    val footer = ByteArray(16)
                    raf.readFully(footer)
                    val str = String(footer, Charsets.US_ASCII)
                    if (str.startsWith("DSi eMMC CID/CPU")) {
                        return@use true
                    }
                }
                if (len >= 0x000FF800 + 16) {
                    raf.seek(0x000FF800)
                    val footer = ByteArray(16)
                    raf.readFully(footer)
                    val str = String(footer, Charsets.US_ASCII)
                    if (str.startsWith("DSi eMMC CID/CPU")) {
                        return@use true
                    }
                }
                raf.seek(0)
                val testBuf = ByteArray(512)
                raf.readFully(testBuf)
                testBuf.any { it != 0.toByte() }
            }
        } catch (_: Throwable) {
            false
        }
    }

    private fun hasValidDsiFiles(dir: File): Boolean {
        if (!hasValidDsiCoreFiles(dir)) {
            return false
        }
        val nand = File(dir, "nand.bin")
        if (!isValidNandFile(nand)) {
            return false
        }
        ensureFontTablePresent(dir)
        return true
    }

    private fun downloadFile(urlStr: String, destination: File, onProgress: (Int) -> Unit) {
        val connection = HttpRedirectHelper.openConnectionWithRedirects(urlStr)
        try {
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
        } finally {
            connection.disconnect()
        }
    }

    private fun extractZipDirectly(zipFile: File, outputDir: File) {
        val outCanonical = outputDir.canonicalFile
        outCanonical.mkdirs()
        zipFile.inputStream().use { fileInput ->
            ZipInputStream(fileInput.buffered()).use { zip ->
                while (true) {
                    val entry = zip.nextEntry ?: break
                    if (entry.isDirectory) {
                        zip.closeEntry()
                        continue
                    }
                    val fileName = entry.name.substringAfterLast('/').substringAfterLast('\\')
                    if (fileName.isNotBlank() && fileName != "." && fileName != "..") {
                        val outFile = File(outCanonical, fileName).canonicalFile
                        if (!outFile.path.startsWith(outCanonical.path + File.separator)) {
                            throw IOException("Blocked unsafe zip entry: ${entry.name}")
                        }
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
