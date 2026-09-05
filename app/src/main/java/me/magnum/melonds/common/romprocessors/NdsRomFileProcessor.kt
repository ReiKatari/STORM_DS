package me.magnum.melonds.common.romprocessors

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.domain.model.RomInfo
import me.magnum.melonds.domain.model.RomMetadata
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.rom.config.RomConfig
import me.magnum.melonds.extensions.isBlank
import me.magnum.melonds.utils.RomProcessor
import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream

class NdsRomFileProcessor(private val context: Context, private val uriHandler: UriHandler) : RomFileProcessor {

    override fun getRomFromUri(romUri: Uri, parentUri: Uri?): Rom? {
        return try {
            val metadata = getRomMetadata(romUri)
            val uriLastSegment = romUri.lastPathSegment?.substringAfterLast('/')
            val fallbackName = uriLastSegment?.substringBeforeLast('.')?.takeUnless { it.isBlank() } ?: "NDS Game"
            val romName = metadata?.romTitle?.takeUnless { it.isBlank() } ?: fallbackName
            val fileName = uriLastSegment?.takeUnless { it.isBlank() } ?: "$fallbackName.nds"
            val isDsi = (metadata?.isDSiWareTitle ?: false) ||
                fileName.endsWith(".dsi", ignoreCase = true) ||
                romUri.path?.endsWith(".dsi", ignoreCase = true) == true ||
                uriLastSegment?.endsWith(".dsi", ignoreCase = true) == true

            val isDsiEnhanced = metadata?.isDSiEnhanced ?: false

            val gameCode = metadata?.gameCode ?: RomProcessor.readGameCode(context, romUri)
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
        if (rom.uri.scheme == android.content.ContentResolver.SCHEME_FILE) {
            val file = rom.uri.path?.let(::File)
            if (file != null && file.exists() && file.canRead()) {
                try {
                    java.io.FileInputStream(file).channel.use { channel ->
                        val icon = RomProcessor.getRomIcon(channel)
                        if (icon != null) return icon
                    }
                } catch (_: Throwable) {}
            }
        }

        try {
            context.contentResolver.openFileDescriptor(rom.uri, "r")?.use { pfd ->
                java.io.FileInputStream(pfd.fileDescriptor).channel.use { channel ->
                    val icon = RomProcessor.getRomIcon(channel)
                    if (icon != null) return icon
                }
            }
        } catch (_: Throwable) {}

        return try {
            context.contentResolver.openInputStream(rom.uri)?.let { BufferedInputStream(it, 131072) }?.use { inputStream ->
                RomProcessor.getRomIcon(inputStream)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override fun getRomInfo(rom: Rom): RomInfo? {
        if (rom.uri.scheme == android.content.ContentResolver.SCHEME_FILE) {
            val file = rom.uri.path?.let(::File)
            if (file != null && file.exists() && file.canRead()) {
                try {
                    java.io.FileInputStream(file).channel.use { channel ->
                        val info = RomProcessor.getRomInfo(rom, channel)
                        if (info != null) return info
                    }
                } catch (_: Throwable) {}
            }
        }

        try {
            context.contentResolver.openFileDescriptor(rom.uri, "r")?.use { pfd ->
                java.io.FileInputStream(pfd.fileDescriptor).channel.use { channel ->
                    val info = RomProcessor.getRomInfo(rom, channel)
                    if (info != null) return info
                }
            }
        } catch (_: Throwable) {}

        return try {
            context.contentResolver.openInputStream(rom.uri)?.let { BufferedInputStream(it, 131072) }?.use { inputStream ->
                RomProcessor.getRomInfo(rom, inputStream)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun getRealRomUri(rom: Rom): Uri {
        return rom.uri
    }

    private fun getRomMetadata(uri: Uri): RomMetadata? {
        if (uri.scheme == android.content.ContentResolver.SCHEME_FILE) {
            val file = uri.path?.let(::File)
            if (file != null && file.exists() && file.canRead()) {
                try {
                    java.io.FileInputStream(file).channel.use { channel ->
                        val metadata = RomProcessor.getRomMetadata(channel)
                        if (metadata != null) return metadata
                    }
                } catch (_: Throwable) {}
            }
        }

        try {
            context.contentResolver.openFileDescriptor(uri, "r")?.use { pfd ->
                java.io.FileInputStream(pfd.fileDescriptor).channel.use { channel ->
                    val metadata = RomProcessor.getRomMetadata(channel)
                    if (metadata != null) return metadata
                }
            }
        } catch (_: Throwable) {}

        return context.contentResolver.openInputStream(uri)?.let { BufferedInputStream(it, 131072) }?.use { inputStream ->
            RomProcessor.getRomMetadata(inputStream)
        }
    }
}