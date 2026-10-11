package me.magnum.melonds.common.providers

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import java.io.File

class UpdateContentProvider : FileProvider() {
    companion object {
        fun getUpdateFileUri(context: Context, file: File): Uri {
            return getUriForFile(context, "${context.packageName}.provider", file)
        }
    }
}