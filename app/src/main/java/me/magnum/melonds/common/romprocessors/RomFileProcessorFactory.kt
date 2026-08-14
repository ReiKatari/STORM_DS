package me.magnum.melonds.common.romprocessors

import android.net.Uri
import androidx.documentfile.provider.DocumentFile

interface RomFileProcessorFactory {
    fun getFileRomProcessorForFileName(fileName: String): RomFileProcessor?
    fun getFileRomProcessorForDocument(romDocument: DocumentFile): RomFileProcessor?
    fun getFileRomProcessorForDocument(romUri: Uri): RomFileProcessor?
}