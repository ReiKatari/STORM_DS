package me.magnum.melonds.impl.romprocessors

import android.content.Context
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import me.magnum.melonds.common.romprocessors.RomFileProcessor
import me.magnum.melonds.common.romprocessors.RomFileProcessorFactory

abstract class BaseRomFileProcessorFactory(private val context: Context) : RomFileProcessorFactory {

    abstract fun getRomFileProcessorForFileExtension(extension: String): RomFileProcessor?

    override fun getFileRomProcessorForFileName(fileName: String): RomFileProcessor? {
        val lastDotIndex = fileName.lastIndexOf('.')
        if (lastDotIndex < 0) return null

        val extension = fileName.substring(lastDotIndex + 1).lowercase()
        return getRomFileProcessorForFileExtension(extension)
    }

    override fun getFileRomProcessorForDocument(romDocument: DocumentFile): RomFileProcessor? {
        val fileName = romDocument.name ?: romDocument.uri.lastPathSegment ?: return null
        return getFileRomProcessorForFileName(fileName)
    }

    override fun getFileRomProcessorForDocument(romUri: Uri): RomFileProcessor? {
        val romDocument = DocumentFile.fromSingleUri(context, romUri)
        val fileName = romDocument?.name ?: romUri.lastPathSegment ?: return null
        return getFileRomProcessorForFileName(fileName)
    }
}