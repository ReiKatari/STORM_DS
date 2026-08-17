package me.magnum.melonds.migrations

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.migrations.legacy.Rom21
import me.magnum.melonds.migrations.legacy.Rom22
import me.magnum.melonds.utils.RomProcessor
import java.io.File
import java.io.FileReader
import java.io.OutputStreamWriter
import java.lang.reflect.Type

class Migration21to22(
    private val context: Context,
    private val gson: Gson,
    private val uriHandler: UriHandler,
) : Migration {

    companion object {
        private const val ROM_DATA_FILE = "rom_data.json"
    }

    override val from = 21

    override val to = 22

    override fun migrate() {
        val originalRoms = getOriginalRoms()
        if (originalRoms.isEmpty()) return

        val newRoms = originalRoms.mapNotNull { rom ->
            val uri = rom.uri ?: return@mapNotNull null
            val fileName = runCatching { uriHandler.getUriDocument(uri)?.name }.getOrNull() ?: rom.name ?: "ROM"
            val romMetadata = runCatching {
                context.contentResolver.openInputStream(uri)?.use {
                    RomProcessor.getRomMetadata(it.buffered())
                }
            }.getOrNull()

            Rom22(
                rom.name ?: fileName,
                fileName,
                uri,
                rom.parentTreeUri,
                rom.config,
                rom.lastPlayed,
                romMetadata?.isDSiWareTitle ?: false,
            )
        }

        if (newRoms.isNotEmpty()) {
            runCatching { saveNewRoms(newRoms) }
        }
    }

    private fun getOriginalRoms(): List<Rom21> {
        val cacheFile = File(context.filesDir, ROM_DATA_FILE)
        if (!cacheFile.isFile) {
            return emptyList()
        }

        val romListType: Type = object : TypeToken<List<Rom21>>(){}.type
        return runCatching {
            gson.fromJson<List<Rom21>>(FileReader(cacheFile), romListType)
        }.getOrElse { emptyList() }
    }

    private fun saveNewRoms(roms: List<Rom22>) {
        val cacheFile = File(context.filesDir, ROM_DATA_FILE)

        OutputStreamWriter(cacheFile.outputStream()).use {
            val romsJson = gson.toJson(roms)
            it.write(romsJson)
        }
    }
}