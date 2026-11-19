package me.magnum.melonds.common.romprocessors

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.isActive
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.domain.model.RomInfo
import me.magnum.melonds.domain.model.RomMetadata
import me.magnum.melonds.domain.model.SizeUnit
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.rom.config.RomConfig
import me.magnum.melonds.extensions.isBlank
import me.magnum.melonds.extensions.nameWithoutExtension
import me.magnum.melonds.impl.NdsRomCache
import me.magnum.melonds.utils.FileUtils
import me.magnum.melonds.utils.RomProcessor
import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.FilterInputStream
import java.io.IOException
import java.io.InputStream

abstract class CompressedRomFileProcessor(private val context: Context, private val uriHandler: UriHandler, private val ndsRomCache: NdsRomCache) : RomFileProcessor {

    private sealed class RomExtractionException(message: String) : Exception(message)
    private class CouldNotOpenCompressedFileException : RomExtractionException("Failed to open compressed file for extraction")
    private class CouldNotFindNdsRomException : RomExtractionException("Failed to find an NDS ROM to extract")
    private class CouldNotFindExtractedFileException : RomExtractionException("Failed to find extracted NDS ROM file")

    private companion object {
        val SUPPORTED_ROM_EXTENSIONS = listOf("nds", "dsi", "ids", "ndz")
    }

    protected open fun openRomUriInputStream(uri: Uri): InputStream? {
        val directFile = FileUtils.resolveDirectFileFromExternalStorageUri(uri)
        if (directFile != null && directFile.exists() && directFile.canRead()) {
            runCatching { return BufferedInputStream(FileInputStream(directFile), 131072) }
        }
        return runCatching { context.contentResolver.openInputStream(uri) }.getOrNull()
    }

    override fun getRomFromUri(romUri: Uri, parentUri: Uri?): Rom? {
        return try {
            val romDocument = uriHandler.getUriDocument(romUri)
            val fallbackName = romDocument?.nameWithoutExtension?.takeUnless { it.isBlank() }
                ?: romUri.lastPathSegment?.substringAfterLast('/')?.substringBeforeLast('.')
                ?: "Compressed Game"
            val fileName = romDocument?.name ?: fallbackName
            val metadata = openRomUriInputStream(romUri)?.use { stream ->
                getNdsEntryStreamInFileStream(stream)?.use { romFileStream ->
                    getRomMetadataInZipEntry(romFileStream)
                }
            }
            val romName = metadata?.romTitle?.takeUnless { it.isBlank() } ?: fallbackName
            val isDsi = metadata?.isDSiWareTitle ?: false
            val isDsiEnhanced = metadata?.isDSiEnhanced ?: false

            val gameCode = metadata?.gameCode ?: ""
            val dsiTitleId = metadata?.titleId?.takeIf { it != 0L }

            Rom(
                name = romName,
                developerName = metadata?.developerName ?: "",
                fileName = fileName,
                uri = romUri,
                parentTreeUri = parentUri,
                config = if (isDsi) RomConfig.forDsiWareTitle() else RomConfig.default(),
                lastPlayed = null,
                isDsiWareTitle = isDsi,
                isDsiEnhanced = isDsiEnhanced,
                retroAchievementsHash = metadata?.retroAchievementsHash ?: "",
                gameCode = gameCode,
                installedDsiWareTitleId = if (isDsi) dsiTitleId else null,
            )
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override fun getRomIcon(rom: Rom): Bitmap? {
        return try {
            getBestRomInputStream(rom)?.use {
                RomProcessor.getRomIcon(it)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override fun getRomInfo(rom: Rom): RomInfo? {
        return try {
            getBestRomInputStream(rom)?.use {
                RomProcessor.getRomInfo(rom, it)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun getRealRomUri(rom: Rom): Uri? {
        val cachedRomUri = ndsRomCache.getCachedRomFile(rom, true)
        return if (cachedRomUri != null) {
            cachedRomUri
        } else {
            try {
                extractRomFile(rom)
            } catch (_: RomExtractionException) {
                null
            }
        }
    }

    protected fun isSupportedRomFile(fileName: String): Boolean {
        val extension = fileName.substringAfterLast('.').lowercase()
        return SUPPORTED_ROM_EXTENSIONS.contains(extension)
    }

    private fun getBestRomInputStream(rom: Rom): InputStream? {
        val cachedRomUri = ndsRomCache.getCachedRomFile(rom)
        return if (cachedRomUri != null) {
            openRomUriInputStream(cachedRomUri)
        } else {
            val baseStream = openRomUriInputStream(rom.uri) ?: return null
            val entryStream = try {
                getNdsEntryStreamInFileStream(baseStream)
            } catch (t: Throwable) {
                runCatching { baseStream.close() }
                throw t
            }
            if (entryStream == null) {
                runCatching { baseStream.close() }
            }
            entryStream
        }
    }

    private fun getRomMetadataInZipEntry(inputStream: InputStream): RomMetadata? {
        return RomProcessor.getRomMetadata(inputStream)
    }

    private suspend fun extractRomFile(rom: Rom): Uri? = withContext(Dispatchers.IO) {
        val baseStream = openRomUriInputStream(rom.uri)
            ?: throw CouldNotOpenCompressedFileException()
        baseStream.use { stream ->
            val romFileStream = getNdsEntryStreamInFileStream(stream)
                ?: throw CouldNotFindNdsRomException()
            romFileStream.use { entryStream ->
                try {
                    ndsRomCache.cacheRom(rom, object : NdsRomCache.RomExtractor {
                        override fun getExtractedRomFileSize(): SizeUnit {
                            return entryStream.romFileSize
                        }

                        override fun saveRomFile(fileStream: FileOutputStream): Boolean {
                            val buffer = ByteArray(8192)
                            return try {
                                while (coroutineContext.isActive) {
                                    val read = entryStream.read(buffer)
                                    if (read <= 0) {
                                        break
                                    }
                                    fileStream.write(buffer, 0, read)
                                }
                                coroutineContext.isActive
                            } catch (_: IOException) {
                                false
                            }
                        }
                    })
                } catch (e: CancellationException) {
                    throw e
                } catch (_: Exception) {
                    throw CouldNotFindExtractedFileException()
                }

                if (!coroutineContext.isActive) {
                    throw CancellationException("ROM extraction cancelled")
                }

                ndsRomCache.getCachedRomFile(rom) ?: throw CouldNotFindExtractedFileException()
            }
        }
    }

    /**
     * Retrieves the [RomFileStream] that points to the ROM in the compressed file. May return null if a ROM entry was not found in the compressed archive.
     */
    abstract fun getNdsEntryStreamInFileStream(fileStream: InputStream): RomFileStream?

    class RomFileStream(stream: InputStream, val romFileSize: SizeUnit) : FilterInputStream(stream)
}
