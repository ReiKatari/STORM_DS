package me.magnum.melonds.common

import android.content.Context
import android.content.ContentResolver
import android.net.Uri
import android.os.ParcelFileDescriptor
import android.system.ErrnoException
import android.system.Os
import android.system.OsConstants
import androidx.core.net.toUri
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.utils.FileUtils
import java.io.File

class UriFileHandler(private val context: Context, private val uriHandler: UriHandler) {
    companion object {
        private const val FILE_NOT_FOUND = -1
        private val writeModeChars = listOf("w", "a")

        internal fun resolveWriteModes(mode: String): List<String> {
            return when (mode) {
                "wt" -> listOf("wt", "rwt", "rw")
                "rwt" -> listOf("rwt", "rw")
                else -> if ('t' in mode) {
                    listOf(mode, "rwt", "rw").distinct()
                } else {
                    listOf(mode)
                }
            }
        }

        internal fun <T> openSafFileDescriptorWithFallback(
            requestedMode: String,
            openDescriptor: (candidateMode: String) -> T?,
            truncateDescriptor: (descriptor: T) -> Unit,
            closeDescriptor: (descriptor: T) -> Unit,
            detachDescriptor: (descriptor: T) -> Int,
        ): Int? {
            val requiresManualTruncate = 't' in requestedMode
            for (candidateMode in resolveWriteModes(requestedMode)) {
                val descriptor = try {
                    openDescriptor(candidateMode)
                } catch (_: Exception) {
                    null
                } ?: continue

                if (requiresManualTruncate && 't' !in candidateMode) {
                    try {
                        truncateDescriptor(descriptor)
                    } catch (_: Exception) {
                        runCatching { closeDescriptor(descriptor) }
                        continue
                    }
                }

                return try {
                    detachDescriptor(descriptor)
                } catch (_: Exception) {
                    runCatching { closeDescriptor(descriptor) }
                    null
                }
            }
            return null
        }
    }

    private fun openSafFileDescriptor(uri: Uri, mode: String): Int? {
        return openSafFileDescriptorWithFallback(
            requestedMode = mode,
            openDescriptor = { candidateMode ->
                context.contentResolver.openFileDescriptor(uri, candidateMode)
            },
            truncateDescriptor = { pfd ->
                try {
                    Os.ftruncate(pfd.fileDescriptor, 0L)
                } catch (e: ErrnoException) {
                    if (e.errno != OsConstants.EINVAL && e.errno != OsConstants.ESPIPE) {
                        throw e
                    }
                }
            },
            closeDescriptor = { pfd -> pfd.close() },
            detachDescriptor = { pfd -> pfd.detachFd() },
        )
    }

    fun open(uriString: String, mode: String): Int {
        val uri = uriString.toUri()

        var isWriteMode = false
        if (mode.findAnyOf(writeModeChars) != null) {
            isWriteMode = true
        }

        if (uri.scheme == ContentResolver.SCHEME_FILE || uri.scheme == null || uriString.startsWith("/")) {
            val filePath = uri.path ?: uriString.removePrefix("file://")
            val file = if (filePath.isNotEmpty()) File(filePath) else return FILE_NOT_FOUND
            return try {
                if (isWriteMode) {
                    file.parentFile?.mkdirs()
                }
                ParcelFileDescriptor.open(file, ParcelFileDescriptor.parseMode(mode))?.detachFd()
            } catch (_: Exception) {
                null
            } ?: FILE_NOT_FOUND
        }

        val safFd = if (isWriteMode) {
            if (uriHandler.fileExists(uri)) {
                openSafFileDescriptor(uri, mode)
            } else {
                uriHandler.createFileDocument(uri)?.let { document ->
                    openSafFileDescriptor(document.uri, mode)
                }
            }
        } else {
            openSafFileDescriptor(uri, mode)
        }
        if (safFd != null) return safFd

        val directFile = FileUtils.resolveDirectFileFromExternalStorageUri(uri)
        if (directFile != null) {
            return try {
                if (isWriteMode) {
                    directFile.parentFile?.mkdirs()
                }
                ParcelFileDescriptor.open(directFile, ParcelFileDescriptor.parseMode(mode))?.detachFd()
            } catch (_: Exception) {
                null
            } ?: FILE_NOT_FOUND
        }

        return FILE_NOT_FOUND
    }
}
