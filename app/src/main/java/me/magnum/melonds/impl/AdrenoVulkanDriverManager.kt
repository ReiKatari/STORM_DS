package me.magnum.melonds.impl

import android.content.Context
import android.net.Uri
import android.os.Build
import android.provider.OpenableColumns
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.MelonDSAndroidInterface
import me.magnum.melonds.MelonEmulator
import me.magnum.melonds.common.network.SharedOkHttpClient
import me.magnum.melonds.domain.model.VulkanDriverConfiguration
import me.magnum.melonds.domain.model.VulkanDriverInfo
import me.magnum.melonds.domain.model.VulkanDriverMode
import me.magnum.melonds.domain.repositories.SettingsRepository
import okhttp3.Request
import org.json.JSONObject
import java.io.File
import java.io.InputStream
import java.util.UUID
import java.util.concurrent.TimeUnit
import java.util.zip.ZipInputStream

class AdrenoVulkanDriverManager(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
) {
    data class ImportResult(val id: String, val displayName: String)

    private data class DriverMetadata(
        val name: String? = null,
        val description: String? = null,
        val author: String? = null,
        val packageVersion: String? = null,
        val vendor: String? = null,
        val driverVersion: String? = null,
        val minApi: Int? = null,
        val libraryName: String? = null,
    )

    class ImportException(val reason: Reason, val detailInt: Int = 0) : Exception(reason.name) {
        enum class Reason {
            UnsupportedBuild,
            NotZip,
            InvalidZip,
            InvalidArchive,
            NoDriver,
            AmbiguousDriver,
            ApiTooLow,
        }
    }

    companion object {
        private const val MAX_META_SIZE_BYTES = 500_000L
        private const val MAX_EXTRACTED_BYTES = 512L * 1024L * 1024L
        private const val MIN_ARCHIVE_BYTES = 1024L
        private const val STREAM_BUFFER_BYTES = 65_536
        private const val USER_AGENT = "Mozilla/5.0 (Linux; Android 14; STORM DS) AppleWebKit/537.36 Chrome/128.0.0.0 Mobile Safari/537.36"

        private val downloadClient by lazy {
            SharedOkHttpClient.instance.newBuilder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .callTimeout(5, TimeUnit.MINUTES)
                .followRedirects(true)
                .followSslRedirects(true)
                .build()
        }
    }

    init {
        updateActiveDriverPipelineCachePath()
    }

    val isSupported: Boolean
        get() = AdrenoVulkanDriverSupport.isSupported(context)

    fun getPipelineCacheFileForActiveDriver(): File {
        val config = settingsRepository.getVulkanDriverConfiguration(context.applicationInfo.nativeLibraryDir)
        return getPipelineCacheFileForConfig(config)
    }

    fun getPipelineCacheFileForConfig(config: VulkanDriverConfiguration): File {
        val cacheDir = File(context.cacheDir, "vulkan_pipeline_cache_v841")
        if (!cacheDir.exists()) {
            cacheDir.mkdirs()
        }
        val driverKey = when {
            config.mode == VulkanDriverMode.CUSTOM && !config.customDriverDisplayName.isNullOrBlank() -> {
                config.customDriverDisplayName.replace(Regex("[^a-zA-Z0-9._-]"), "_")
            }
            config.mode == VulkanDriverMode.CUSTOM && !config.customDriverName.isNullOrBlank() -> {
                config.customDriverName.replace(Regex("[^a-zA-Z0-9._-]"), "_")
            }
            else -> "system"
        }
        return File(cacheDir, "${driverKey}_v841.bin")
    }

    fun updateActiveDriverPipelineCachePath() {
        val config = settingsRepository.getVulkanDriverConfiguration(context.applicationInfo.nativeLibraryDir)
        updatePipelineCachePathForConfig(config)
    }

    fun updatePipelineCachePathForConfig(config: VulkanDriverConfiguration) {
        val file = getPipelineCacheFileForConfig(config)
        runCatching { MelonEmulator.setVulkanPipelineCacheFile(file.absolutePath) }
    }

    private fun syncNativeDriverConfiguration() {
        runCatching {
            val config = settingsRepository.getVulkanDriverConfiguration(context.applicationInfo.nativeLibraryDir)
            MelonDSAndroidInterface.configureVulkanDriver(config)
        }
    }

    fun setSystemDriver() {
        settingsRepository.setVulkanDriverMode(VulkanDriverMode.SYSTEM)
        updateActiveDriverPipelineCachePath()
        syncNativeDriverConfiguration()
    }

    fun selectDriver(id: String) {
        settingsRepository.setSelectedVulkanDriver(id)
        settingsRepository.setVulkanDriverMode(VulkanDriverMode.CUSTOM)
        updateActiveDriverPipelineCachePath()
        syncNativeDriverConfiguration()
    }

    fun clearDriverPipelineCaches(): Int {
        var deletedCount = 0
        listOf(
            File(context.cacheDir, "vulkan_pipeline_cache_v841"),
            File(context.cacheDir, "adrenotools/tmp"),
        ).forEach { dir ->
            if (dir.isDirectory) {
                dir.listFiles()?.forEach { child ->
                    if (child.deleteRecursively()) {
                        deletedCount++
                    }
                }
            }
        }
        return deletedCount
    }

    fun importDriver(uri: Uri): ImportResult {
        if (!isSupported) {
            throw ImportException(ImportException.Reason.UnsupportedBuild)
        }

        val rawName = queryDisplayName(uri)
            ?.takeIf { it.isNotBlank() }
            ?: "Custom Vulkan driver"
        if (!rawName.endsWith(".zip", ignoreCase = true) &&
            !rawName.endsWith(".adpkg.zip", ignoreCase = true) &&
            !rawName.endsWith(".adpkg", ignoreCase = true)
        ) {
            throw ImportException(ImportException.Reason.NotZip)
        }

        val tempZip = File(context.cacheDir, "driver_uri_import_${System.currentTimeMillis()}.zip")
        return try {
            context.contentResolver.openInputStream(uri)?.use { input ->
                tempZip.outputStream().use { output ->
                    input.copyTo(output, bufferSize = STREAM_BUFFER_BYTES)
                }
            } ?: throw ImportException(ImportException.Reason.InvalidZip)

            val fallbackName = rawName
                .removeSuffix(".adpkg.zip")
                .removeSuffix(".zip")
                .removeSuffix(".adpkg")
            importDriverFromFile(
                zipFile = tempZip,
                fallbackDisplayName = fallbackName,
                sourceRepo = "local",
                assetFileName = rawName,
            )
        } finally {
            tempZip.delete()
        }
    }

    fun importDriverFromFile(
        zipFile: File,
        fallbackDisplayName: String,
        sourceRepo: String? = null,
        assetFileName: String? = null,
    ): ImportResult {
        if (!isSupported) {
            throw ImportException(ImportException.Reason.UnsupportedBuild)
        }
        validateArchiveFile(zipFile)

        val importRoot = File(context.filesDir, "adreno-drivers")
        importRoot.mkdirs()

        val tempRunId = UUID.randomUUID().toString()
        val pendingRoot = File(importRoot, "pending-$tempRunId")

        try {
            pendingRoot.mkdirs()
            zipFile.inputStream().use { input ->
                extractZipStream(input, pendingRoot)
            }

            val metadata = readDriverMetadata(pendingRoot)
            if (metadata.minApi != null && metadata.minApi > Build.VERSION.SDK_INT) {
                throw ImportException(ImportException.Reason.ApiTooLow, metadata.minApi)
            }

            val driverFile = selectDriverFile(pendingRoot, metadata)
            val driverDir = driverFile.parentFile ?: throw ImportException(ImportException.Reason.NoDriver)
            copyCompanionConfigsIfNeeded(pendingRoot, driverDir)

            val versionSuffix = metadata.driverVersion
                ?.takeIf { it.isNotBlank() && !it.equals("unknown", ignoreCase = true) }
            val importedDisplayName = when {
                !metadata.name.isNullOrBlank() && versionSuffix != null && !metadata.name.contains(versionSuffix, ignoreCase = true) ->
                    "${metadata.name} ($versionSuffix)"
                !metadata.name.isNullOrBlank() ->
                    metadata.name
                fallbackDisplayName.isNotBlank() ->
                    fallbackDisplayName
                else ->
                    "Custom Vulkan driver"
            }

            // Replace matching duplicate entry if updating the same driver
            val existingDrivers = settingsRepository.getInstalledVulkanDrivers()
            val duplicateDriver = existingDrivers.firstOrNull { existing ->
                (sourceRepo != null && assetFileName != null &&
                    existing.sourceRepo == sourceRepo && existing.assetFileName == assetFileName) ||
                    (existing.displayName.equals(importedDisplayName, ignoreCase = true) &&
                        existing.driverName.equals(driverFile.name, ignoreCase = true))
            }

            val finalDriverId = duplicateDriver?.id ?: UUID.randomUUID().toString()
            val installedRoot = File(importRoot, "driver-$finalDriverId")

            if (duplicateDriver != null) {
                deletePipelineCacheForDriver(duplicateDriver)
                runCatching {
                    val importRootCanonical = importRoot.canonicalFile
                    var oldDir: File? = File(duplicateDriver.driverDir).canonicalFile
                    while (oldDir != null && oldDir.parentFile != importRootCanonical) {
                        oldDir = oldDir.parentFile
                    }
                    if (oldDir != null && oldDir != installedRoot.canonicalFile && oldDir.name.startsWith("driver-")) {
                        oldDir.deleteRecursively()
                    }
                }
            }

            if (installedRoot.exists()) {
                installedRoot.deleteRecursively()
            }
            if (!pendingRoot.renameTo(installedRoot)) {
                throw ImportException(ImportException.Reason.InvalidZip)
            }

            val driverDirRelativePath = driverDir.toRelativeString(pendingRoot)
            val currentDriverDir = if (driverDirRelativePath == "." || driverDirRelativePath.isEmpty()) {
                installedRoot
            } else {
                File(installedRoot, driverDirRelativePath)
            }

            val resolvedDescription = metadata.description?.takeIf { it.isNotBlank() }
                ?: metadata.packageVersion?.takeIf { it.isNotBlank() }

            settingsRepository.setCustomVulkanDriver(
                id = finalDriverId,
                driverDir = currentDriverDir.absolutePath,
                driverName = driverFile.name,
                displayName = importedDisplayName,
                author = metadata.author,
                vendor = metadata.vendor,
                driverVersion = metadata.driverVersion,
                description = resolvedDescription,
                minApi = metadata.minApi,
                sourceRepo = sourceRepo,
                assetFileName = assetFileName,
                installedAtEpochMs = System.currentTimeMillis(),
            )
            settingsRepository.setSelectedVulkanDriver(finalDriverId)
            settingsRepository.setVulkanDriverMode(VulkanDriverMode.CUSTOM)
            updateActiveDriverPipelineCachePath()
            syncNativeDriverConfiguration()
            return ImportResult(finalDriverId, importedDisplayName)
        } catch (e: ImportException) {
            pendingRoot.deleteRecursively()
            throw e
        } catch (e: Exception) {
            pendingRoot.deleteRecursively()
            throw ImportException(ImportException.Reason.InvalidZip)
        }
    }

    fun removeDriver(id: String) {
        val target = settingsRepository.getInstalledVulkanDrivers().firstOrNull { it.id == id }
        val importRoot = File(context.filesDir, "adreno-drivers").canonicalFile
        target?.let { deletePipelineCacheForDriver(it) }
        target?.driverDir?.let { dirPath ->
            runCatching {
                var rootCandidate: File? = File(dirPath).canonicalFile
                while (rootCandidate != null && rootCandidate.parentFile != importRoot) {
                    rootCandidate = rootCandidate.parentFile
                }
                if (rootCandidate != null && rootCandidate != importRoot && rootCandidate.path.startsWith(importRoot.path + File.separator)) {
                    rootCandidate.deleteRecursively()
                }
            }
        }
        settingsRepository.removeCustomVulkanDriver(id)
        updateActiveDriverPipelineCachePath()
        syncNativeDriverConfiguration()
    }

    fun removeAllDrivers() {
        File(context.filesDir, "adreno-drivers").deleteRecursively()
        clearDriverPipelineCaches()
        settingsRepository.clearCustomVulkanDrivers()
        updateActiveDriverPipelineCachePath()
        syncNativeDriverConfiguration()
    }

    private fun deletePipelineCacheForDriver(driver: VulkanDriverInfo) {
        val cacheDir = File(context.cacheDir, "vulkan_pipeline_cache_v841")
        if (!cacheDir.isDirectory) return
        val keys = listOfNotNull(
            driver.displayName.takeIf { it.isNotBlank() },
            driver.driverName.takeIf { it.isNotBlank() },
        ).map { it.replace(Regex("[^a-zA-Z0-9._-]"), "_") }.distinct()
        keys.forEach { key ->
            File(cacheDir, "${key}_v841.bin").takeIf { it.isFile }?.delete()
        }
    }

    suspend fun downloadAndInstallFromUrls(
        urls: List<String>,
        fallbackDisplayName: String,
        sourceRepo: String? = null,
        assetFileName: String? = null,
        onProgress: (bytesRead: Long, totalBytes: Long, percent: Int) -> Unit = { _, _, _ -> },
    ): Result<ImportResult> = withContext(Dispatchers.IO) {
        if (!isSupported) {
            return@withContext Result.failure(ImportException(ImportException.Reason.UnsupportedBuild))
        }
        val cleanUrls = urls.map { it.trim() }.filter { it.isNotEmpty() }.distinct()
        if (cleanUrls.isEmpty()) {
            return@withContext Result.failure(ImportException(ImportException.Reason.InvalidArchive))
        }

        var lastError: Throwable? = null
        for (url in cleanUrls) {
            val tempFile = File(context.cacheDir, "driver_download_${System.currentTimeMillis()}.zip")
            try {
                val request = Request.Builder()
                    .url(url)
                    .header("User-Agent", USER_AGENT)
                    .header("Accept", "application/octet-stream, application/zip, */*")
                    .build()

                downloadClient.newCall(request).execute().use { response ->
                    if (!response.isSuccessful) {
                        throw IllegalStateException("HTTP ${response.code} for $url")
                    }
                    val contentType = response.header("Content-Type").orEmpty().lowercase()
                    if (contentType.contains("text/html") || contentType.contains("application/xhtml")) {
                        throw ImportException(ImportException.Reason.InvalidArchive)
                    }
                    val body = response.body ?: throw IllegalStateException("Empty HTTP body")
                    val totalBytes = body.contentLength()
                    var downloadedBytes = 0L

                    body.byteStream().use { input ->
                        tempFile.outputStream().use { output ->
                            val buffer = ByteArray(STREAM_BUFFER_BYTES)
                            while (true) {
                                val read = input.read(buffer)
                                if (read == -1) break
                                output.write(buffer, 0, read)
                                downloadedBytes += read
                                val percent = if (totalBytes > 0L) {
                                    ((downloadedBytes * 100L) / totalBytes).toInt().coerceIn(0, 100)
                                } else {
                                    -1
                                }
                                onProgress(downloadedBytes, totalBytes, percent)
                            }
                        }
                    }
                }

                val result = importDriverFromFile(
                    zipFile = tempFile,
                    fallbackDisplayName = fallbackDisplayName,
                    sourceRepo = sourceRepo,
                    assetFileName = assetFileName ?: url.substringAfterLast('/'),
                )
                return@withContext Result.success(result)
            } catch (t: Throwable) {
                lastError = t
            } finally {
                tempFile.delete()
            }
        }
        Result.failure(lastError ?: ImportException(ImportException.Reason.InvalidArchive))
    }

    private fun validateArchiveFile(file: File) {
        if (!file.isFile || file.length() < MIN_ARCHIVE_BYTES) {
            throw ImportException(ImportException.Reason.InvalidArchive)
        }
        val magic = ByteArray(4)
        file.inputStream().use { input ->
            if (input.read(magic) < 4) {
                throw ImportException(ImportException.Reason.InvalidArchive)
            }
        }
        val isZipMagic = magic[0] == 0x50.toByte() &&
            magic[1] == 0x4B.toByte() &&
            magic[2] == 0x03.toByte() &&
            magic[3] == 0x04.toByte()
        if (!isZipMagic) {
            throw ImportException(ImportException.Reason.InvalidArchive)
        }
    }

    private fun queryDisplayName(uri: Uri): String? {
        return runCatching {
            context.contentResolver.query(uri, arrayOf(OpenableColumns.DISPLAY_NAME), null, null, null)?.use { cursor ->
                if (cursor.moveToFirst()) {
                    cursor.getString(0)
                } else {
                    null
                }
            }
        }.getOrNull()
    }

    private fun extractZipStream(input: InputStream, destination: File) {
        val destinationCanonical = destination.canonicalFile
        var totalExtractedBytes = 0L
        val buffer = ByteArray(STREAM_BUFFER_BYTES)
        ZipInputStream(input.buffered(STREAM_BUFFER_BYTES)).use { zip ->
            while (true) {
                val entry = zip.nextEntry ?: break
                val outputFile = File(destinationCanonical, entry.name).canonicalFile
                val isInsideDestination = outputFile.path.startsWith(destinationCanonical.path + File.separator) ||
                    (entry.isDirectory && outputFile == destinationCanonical)
                if (!isInsideDestination) {
                    throw ImportException(ImportException.Reason.InvalidZip)
                }

                if (entry.isDirectory) {
                    outputFile.mkdirs()
                } else {
                    outputFile.parentFile?.mkdirs()
                    outputFile.outputStream().use { output ->
                        while (true) {
                            val read = zip.read(buffer)
                            if (read == -1) break
                            totalExtractedBytes += read
                            if (totalExtractedBytes > MAX_EXTRACTED_BYTES) {
                                throw ImportException(ImportException.Reason.InvalidArchive)
                            }
                            output.write(buffer, 0, read)
                        }
                    }
                }
                zip.closeEntry()
            }
        }
    }

    private fun readDriverMetadata(root: File): DriverMetadata {
        val directMeta = File(root, "meta.json")
        val metadataFile = if (directMeta.isFile) {
            directMeta
        } else {
            root.walkTopDown()
                .maxDepth(2)
                .firstOrNull { it.isFile && it.name.equals("meta.json", ignoreCase = true) }
                ?: return DriverMetadata()
        }

        if (metadataFile.length() > MAX_META_SIZE_BYTES) {
            return DriverMetadata()
        }

        return runCatching {
            val json = JSONObject(metadataFile.readText(Charsets.UTF_8))
            DriverMetadata(
                name = json.optString("name").takeIf { it.isNotBlank() },
                description = json.optString("description").takeIf { it.isNotBlank() },
                author = json.optString("author").takeIf { it.isNotBlank() },
                packageVersion = json.optString("packageVersion").takeIf { it.isNotBlank() },
                vendor = json.optString("vendor").takeIf { it.isNotBlank() },
                driverVersion = json.optString("driverVersion").takeIf { it.isNotBlank() },
                minApi = if (json.has("minApi") && !json.isNull("minApi")) {
                    json.optInt("minApi", -1).takeIf { it > 0 }
                } else {
                    null
                },
                libraryName = json.optString("libraryName").takeIf { it.isNotBlank() },
            )
        }.getOrDefault(DriverMetadata())
    }

    private fun selectDriverFile(root: File, metadata: DriverMetadata): File {
        val allSoFiles = root.walkTopDown()
            .filter { it.isFile && it.extension.equals("so", ignoreCase = true) }
            .toList()
        if (allSoFiles.isEmpty()) {
            throw ImportException(ImportException.Reason.NoDriver)
        }

        val arm64Files = allSoFiles.filter { file ->
            val rel = file.relativeTo(root).path.replace('\\', '/').lowercase()
            rel.contains("/arm64-v8a/") || rel.startsWith("arm64-v8a/") ||
                rel.contains("/arm64/") || rel.startsWith("arm64/")
        }
        val nonUnsupportedAbiFiles = allSoFiles.filterNot { file ->
            val rel = file.relativeTo(root).path.replace('\\', '/').lowercase()
            rel.contains("/armeabi-v7a/") || rel.startsWith("armeabi-v7a/") ||
                rel.contains("/armeabi/") || rel.startsWith("armeabi/") ||
                rel.contains("/x86_64/") || rel.startsWith("x86_64/") ||
                rel.contains("/x86/") || rel.startsWith("x86/")
        }
        val soFiles = when {
            arm64Files.isNotEmpty() -> arm64Files
            nonUnsupportedAbiFiles.isNotEmpty() -> nonUnsupportedAbiFiles
            else -> allSoFiles
        }

        // Handle multi-SO bundles (such as STORM DRIVER containing both gen8 and a7xx binaries)
        val gen8File = soFiles.firstOrNull { it.name.equals("vulkan.adreno_gen8.so", ignoreCase = true) }
        val a7xxFile = soFiles.firstOrNull { it.name.equals("vulkan.adreno_a7xx.so", ignoreCase = true) }
        if (gen8File != null && a7xxFile != null) {
            return if (AdrenoVulkanDriverSupport.isAdreno8xx()) gen8File else a7xxFile
        }
        if (gen8File != null && AdrenoVulkanDriverSupport.isAdreno8xx()) {
            return gen8File
        }

        metadata.libraryName?.let { libraryName ->
            val rootCanonical = root.canonicalFile
            val metadataDriver = File(root, libraryName).canonicalFile
            if (!metadataDriver.path.startsWith(rootCanonical.path + File.separator)) {
                throw ImportException(ImportException.Reason.InvalidZip)
            }
            if (metadataDriver.isFile && metadataDriver.extension.equals("so", ignoreCase = true)) {
                return metadataDriver
            }
            soFiles.firstOrNull { it.name.equals(libraryName, ignoreCase = true) }?.let { return it }
        }

        val preferredOrder = buildList {
            if (AdrenoVulkanDriverSupport.isAdreno8xx()) {
                add("vulkan.adreno_gen8.so")
            }
            add("vulkan.adreno_a7xx.so")
            add("vulkan.freedreno.so")
            add("libvulkan_freedreno.so")
            add("vulkan.adreno.so")
        }
        preferredOrder.forEach { preferredName ->
            val matches = soFiles.filter { it.name.equals(preferredName, ignoreCase = true) }
            if (matches.size == 1) {
                return matches.first()
            }
        }

        val genericMatches = soFiles.filter { file ->
            file.name.startsWith("libvulkan", ignoreCase = true) ||
                (file.name.startsWith("vulkan.", ignoreCase = true) && file.name.endsWith(".so", ignoreCase = true))
        }
        return when (genericMatches.size) {
            1 -> genericMatches.first()
            0 -> if (soFiles.size == 1) soFiles.first() else throw ImportException(ImportException.Reason.NoDriver)
            else -> throw ImportException(ImportException.Reason.AmbiguousDriver)
        }
    }

    private fun copyCompanionConfigsIfNeeded(root: File, driverDir: File) {
        root.walkTopDown()
            .filter { file ->
                file.isFile && (
                    file.extension.equals("conf", ignoreCase = true) ||
                        file.extension.equals("xml", ignoreCase = true) ||
                        file.name.startsWith("drirc", ignoreCase = true) ||
                        file.name.equals("meta.json", ignoreCase = true)
                    )
            }
            .forEach { configFile ->
                val target = File(driverDir, configFile.name)
                if (!target.exists() && configFile.parentFile != driverDir) {
                    runCatching { configFile.copyTo(target, overwrite = false) }
                }
            }
    }
}
