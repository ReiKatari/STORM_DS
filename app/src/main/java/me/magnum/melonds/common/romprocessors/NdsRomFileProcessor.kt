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
import me.magnum.melonds.extensions.nameWithoutExtension
import me.magnum.melonds.utils.RomProcessor

class NdsRomFileProcessor(private val context: Context, private val uriHandler: UriHandler) : RomFileProcessor {

    override fun getRomFromUri(romUri: Uri, parentUri: Uri?): Rom? {
        return try {
            val metadata = getRomMetadata(romUri)
            val romDocument = uriHandler.getUriDocument(romUri)
            val fallbackName = romDocument?.nameWithoutExtension?.takeUnless { it.isBlank() }
                ?: romUri.lastPathSegment?.substringAfterLast('/')?.substringBeforeLast('.')
                ?: "NDS Game"
            val romName = metadata?.romTitle?.takeUnless { it.isBlank() } ?: fallbackName
            val fileName = romDocument?.name ?: "$fallbackName.nds"
            val isDsi = metadata?.isDSiWareTitle ?: false

            Rom(
                name = romName,
                developerName = metadata?.developerName ?: "",
                fileName = fileName,
                uri = romUri,
                parentTreeUri = parentUri,
                config = if (isDsi) RomConfig.forDsiWareTitle() else RomConfig.default(),
                lastPlayed = null,
                isDsiWareTitle = isDsi,
                retroAchievementsHash = metadata?.retroAchievementsHash ?: ""
            )
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override fun getRomIcon(rom: Rom): Bitmap? {
        return try {
            context.contentResolver.openInputStream(rom.uri)?.use { inputStream ->
                RomProcessor.getRomIcon(inputStream)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override fun getRomInfo(rom: Rom): RomInfo? {
        return try {
            context.contentResolver.openInputStream(rom.uri)?.use { inputStream ->
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
        return context.contentResolver.openInputStream(uri)?.use { inputStream ->
            RomProcessor.getRomMetadata(inputStream)
        }
    }
}