package me.magnum.melonds.common.uridelegates

import android.content.Context
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import me.magnum.melonds.utils.FileUtils

class ContentUriHandler(private val context: Context) : UriHandler {
    override fun fileExists(uri: Uri): Boolean {
        return getUriDocument(uri)?.exists() == true
    }

    override fun createFileDocument(uri: Uri): DocumentFile? {
        val directFile = FileUtils.resolveDirectFileFromExternalStorageUri(uri)
        if (directFile != null) {
            runCatching {
                directFile.parentFile?.mkdirs()
                if (!directFile.exists()) directFile.createNewFile()
            }
            if (directFile.exists()) return DocumentFile.fromFile(directFile)
        }
        return null
    }

    override fun getUriDocument(uri: Uri): DocumentFile? {
        val doc = DocumentFile.fromSingleUri(context, uri)
        if (doc != null && doc.exists() && doc.canRead()) return doc
        val directFile = FileUtils.resolveDirectFileFromExternalStorageUri(uri)
        if (directFile != null && directFile.exists()) return DocumentFile.fromFile(directFile)
        return doc
    }

    override fun getUriTreeDocument(uri: Uri): DocumentFile? {
        val doc = DocumentFile.fromTreeUri(context, uri)
        if (doc != null && doc.exists() && doc.canRead()) return doc
        val directFile = FileUtils.resolveDirectFileFromExternalStorageUri(uri)
        if (directFile != null && directFile.exists()) return DocumentFile.fromFile(directFile)
        return doc
    }
}