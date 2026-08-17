package me.magnum.melonds.common.uridelegates

import android.content.Context
import android.net.Uri
import androidx.documentfile.provider.DocumentFile

class CompositeUriHandler(context: Context) : UriHandler {
    private val delegates = mapOf(
            "content" to ContentUriHandler(context),
            "file" to StandardFileUriHandler()
    )

    override fun fileExists(uri: Uri): Boolean {
        val scheme = uri.scheme ?: "file"
        return delegates[scheme]?.fileExists(uri) ?: delegates["file"]?.fileExists(uri) == true
    }

    override fun createFileDocument(uri: Uri): DocumentFile? {
        val scheme = uri.scheme ?: "file"
        return delegates[scheme]?.createFileDocument(uri) ?: delegates["file"]?.createFileDocument(uri)
    }

    override fun getUriDocument(uri: Uri): DocumentFile? {
        val scheme = uri.scheme ?: "file"
        return delegates[scheme]?.getUriDocument(uri) ?: delegates["file"]?.getUriDocument(uri)
    }

    override fun getUriTreeDocument(uri: Uri): DocumentFile? {
        val scheme = uri.scheme ?: "file"
        return delegates[scheme]?.getUriTreeDocument(uri) ?: delegates["file"]?.getUriTreeDocument(uri)
    }
}