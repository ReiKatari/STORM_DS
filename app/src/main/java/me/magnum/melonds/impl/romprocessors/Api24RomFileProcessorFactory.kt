package me.magnum.melonds.impl.romprocessors

import android.content.Context
import me.magnum.melonds.common.romprocessors.NdsRomFileProcessor
import me.magnum.melonds.common.romprocessors.RarRomFileProcessor
import me.magnum.melonds.common.romprocessors.RomFileProcessor
import me.magnum.melonds.common.romprocessors.SevenZRomFileProcessor
import me.magnum.melonds.common.romprocessors.ZipRomFileProcessor
import me.magnum.melonds.common.uridelegates.UriHandler
import me.magnum.melonds.impl.NdsRomCache

class Api24RomFileProcessorFactory(context: Context, uriHandler: UriHandler, ndsRomCache: NdsRomCache) : BaseRomFileProcessorFactory(context) {

    private val prefixProcessorMap: Map<String, RomFileProcessor>

    init {
        val ndsRomFileProcessor = NdsRomFileProcessor(context, uriHandler)
        val zipRomFileProcessor = ZipRomFileProcessor(context, uriHandler, ndsRomCache)
        prefixProcessorMap = mapOf(
            "nds" to ndsRomFileProcessor,
            "dsi" to ndsRomFileProcessor,
            "ids" to ndsRomFileProcessor,
            "app" to ndsRomFileProcessor,
            "zip" to zipRomFileProcessor,
            "7z" to SevenZRomFileProcessor(context, uriHandler, ndsRomCache),
            "rar" to RarRomFileProcessor(context, uriHandler, ndsRomCache),
            "ndz" to zipRomFileProcessor
        )
    }

    override fun getRomFileProcessorForFileExtension(extension: String): RomFileProcessor? {
        return prefixProcessorMap[extension]
    }
}