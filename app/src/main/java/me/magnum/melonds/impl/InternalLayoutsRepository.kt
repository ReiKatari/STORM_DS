package me.magnum.melonds.impl

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.Deletable
import me.magnum.melonds.common.filterNotDeleted
import me.magnum.melonds.domain.model.layout.LayoutConfiguration
import me.magnum.melonds.domain.repositories.LayoutsRepository
import me.magnum.melonds.impl.dtos.layout.LayoutConfigurationDto
import java.io.File
import java.io.FileReader
import java.io.OutputStreamWriter
import java.lang.reflect.Type
import java.util.UUID

class InternalLayoutsRepository(
    private val context: Context,
    private val gson: Gson,
    private val settingsBackupManager: SettingsBackupManager,
) : LayoutsRepository {
    companion object {
        private const val DATA_FILE = "layouts.json"
        private val layoutListType: Type = object : TypeToken<List<LayoutConfigurationDto>>(){}.type
    }

    private val layoutsLoadLock = Mutex()
    private var areLayoutsLoaded = false
    private val layouts = MutableStateFlow<List<Deletable<LayoutConfiguration>>>(emptyList())

    private val mGlobalLayoutPlaceholder by lazy {
        LayoutConfiguration(
            null,
            context.getString(R.string.use_global_layout),
            LayoutConfiguration.LayoutType.DEFAULT,
            LayoutConfiguration.LayoutOrientation.FOLLOW_SYSTEM,
            false,
            0,
            emptyMap(),
        )
    }

    override fun getLayouts(): Flow<List<LayoutConfiguration>> {
        return layouts
            .onStart { ensureLayoutsAreLoaded() }
            .filter { areLayoutsLoaded }
            .map { it.filterNotDeleted() }
            .distinctUntilChanged()
    }

    override suspend fun getLayout(id: UUID): LayoutConfiguration? {
        ensureLayoutsAreLoaded()
        return layouts.value.firstOrNull { !it.isDeleted && it.data.id == id }?.data
    }

    override suspend fun deleteLayout(layout: LayoutConfiguration) {
        ensureLayoutsAreLoaded()
        val layoutToDelete = layouts.value.find { !it.isDeleted && it.data.id == layout.id }
        if (layoutToDelete != null) {
            layouts.update {
                val layoutIndex = it.indexOf(layoutToDelete)
                it.toMutableList().apply {
                    set(layoutIndex, layoutToDelete.copy(isDeleted = true))
                }
            }
            saveLayouts()
        }
    }

    override fun getGlobalLayoutPlaceholder(): LayoutConfiguration {
        return mGlobalLayoutPlaceholder
    }

    override fun observeLayout(id: UUID): Flow<LayoutConfiguration> {
        return layouts
            .onStart { ensureLayoutsAreLoaded() }
            .filter { areLayoutsLoaded }
            .map { layouts -> layouts.firstOrNull { !it.isDeleted && it.data.id == id }?.data }
            .takeWhile { it != null }
            .filterNotNull()
            .distinctUntilChanged()
    }

    override suspend fun saveLayout(layout: LayoutConfiguration) {
        ensureLayoutsAreLoaded()
        if (layout.id == null) {
            val newLayout = layout.copy(
                id = UUID.randomUUID()
            )
            layouts.update {
                it.toMutableList().apply {
                    add(Deletable(newLayout, false))
                }
            }
        } else {
            val index = layouts.value.indexOfFirst { it.data.id == layout.id }
            layouts.update {
                it.toMutableList().apply {
                    if (index >= 0) {
                        // Replace existing
                        set(index, Deletable(layout, false))
                    } else {
                        // Add new one
                        add(Deletable(layout, false))
                    }
                }
            }
        }
        saveLayouts()
    }

    private suspend fun ensureLayoutsAreLoaded() = withContext(Dispatchers.IO) {
        layoutsLoadLock.withLock {
            if (areLayoutsLoaded) {
                return@withLock
            } else {
                val deletableLayouts = loadLayouts().map { Deletable(it, false) }
                layouts.value = buildList {
                    add(Deletable(buildDefaultLayout(), false))
                    add(Deletable(buildUnevenLandscapeLayout(), false))
                    add(Deletable(buildEvenPortraitLayout(), false))
                    add(Deletable(buildProportionalLandscapeLayout(), false))
                    add(Deletable(buildFullscreenLandscapeLayout(), false))
                    addAll(deletableLayouts)
                }
                areLayoutsLoaded = true
            }
        }
    }

    private fun getExternalSettingsDir(): File {
        return File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/settings").apply {
            runCatching { mkdirs() }
        }
    }

    private fun sanitizeFileName(name: String): String {
        val sanitized = name.replace(Regex("[\\\\/:*?\"<>|]"), "_").trim()
        return sanitized.ifEmpty { "layout" }
    }

    private fun loadLayouts(): List<LayoutConfiguration> {
        val externalSettingsDir = getExternalSettingsDir()
        val externalDataFile = File(externalSettingsDir, DATA_FILE)
        val internalDataFile = File(context.filesDir, DATA_FILE)

        val candidateFile = when {
            externalDataFile.isFile && externalDataFile.length() > 0 -> externalDataFile
            internalDataFile.isFile && internalDataFile.length() > 0 -> internalDataFile
            else -> null
        } ?: return emptyList()

        return try {
            val layouts = gson.fromJson<List<LayoutConfigurationDto>>(FileReader(candidateFile), layoutListType)?.map {
                it.toModel()
            } ?: emptyList()

            // If loaded from internal but external is missing, mirror to external immediately
            if (candidateFile == internalDataFile && externalSettingsDir.exists()) {
                runCatching {
                    OutputStreamWriter(externalDataFile.outputStream()).use { writer ->
                        writer.write(candidateFile.readText())
                    }
                }
            }

            layouts
        } catch (_: Exception) {
            emptyList()
        }
    }

    private suspend fun saveLayouts() = withContext(Dispatchers.IO) {
        val internalDataFile = File(context.filesDir, DATA_FILE)
        val externalSettingsDir = getExternalSettingsDir()
        val externalDataFile = File(externalSettingsDir, DATA_FILE)

        try {
            val customLayoutsDtos = layouts.value.mapNotNull {
                // Exclude deleted and default layouts. They shouldn't be saved
                if (it.isDeleted || it.data.type == LayoutConfiguration.LayoutType.DEFAULT) {
                    null
                } else {
                    LayoutConfigurationDto.fromModel(it.data)
                }
            }
            val layoutsJson = gson.toJson(customLayoutsDtos)

            // Save internally
            runCatching {
                OutputStreamWriter(internalDataFile.outputStream()).use {
                    it.write(layoutsJson)
                }
            }

            // Save directly to [Корневая папка]/STORM DS/settings/layouts.json
            runCatching {
                if (externalSettingsDir.exists() || externalSettingsDir.mkdirs()) {
                    OutputStreamWriter(externalDataFile.outputStream()).use {
                        it.write(layoutsJson)
                    }

                    // Also save individual custom layouts into STORM DS/settings/
                    for (dto in customLayoutsDtos) {
                        val singleLayoutFile = File(externalSettingsDir, "${sanitizeFileName(dto.name.orEmpty())}.layout.json")
                        OutputStreamWriter(singleLayoutFile.outputStream()).use { writer ->
                            writer.write(gson.toJson(dto))
                        }
                    }
                }
            }

            settingsBackupManager.requestMirrorWrite()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun buildDefaultLayout(): LayoutConfiguration {
        return LayoutConfiguration(
            id = LayoutConfiguration.DEFAULT_ID,
            name = context.getString(R.string.layout_even_landscape),
            type = LayoutConfiguration.LayoutType.DEFAULT,
            orientation = LayoutConfiguration.LayoutOrientation.FOLLOW_SYSTEM,
            useCustomOpacity = false,
            opacity = 50,
            layoutVariants = emptyMap(),
        )
    }

    private fun buildUnevenLandscapeLayout(): LayoutConfiguration {
        return LayoutConfiguration(
            id = LayoutConfiguration.UNEVEN_LANDSCAPE_ID,
            name = context.getString(R.string.layout_uneven_landscape),
            type = LayoutConfiguration.LayoutType.DEFAULT,
            orientation = LayoutConfiguration.LayoutOrientation.LANDSCAPE,
            useCustomOpacity = false,
            opacity = 50,
            layoutVariants = emptyMap(),
        )
    }

    private fun buildEvenPortraitLayout(): LayoutConfiguration {
        return LayoutConfiguration(
            id = LayoutConfiguration.EVEN_PORTRAIT_ID,
            name = context.getString(R.string.layout_even_portrait_locked),
            type = LayoutConfiguration.LayoutType.DEFAULT,
            orientation = LayoutConfiguration.LayoutOrientation.PORTRAIT,
            useCustomOpacity = false,
            opacity = 50,
            layoutVariants = emptyMap(),
        )
    }

    private fun buildProportionalLandscapeLayout(): LayoutConfiguration {
        return LayoutConfiguration(
            id = LayoutConfiguration.PROPORTIONAL_LANDSCAPE_ID,
            name = context.getString(R.string.layout_proportional_landscape),
            type = LayoutConfiguration.LayoutType.DEFAULT,
            orientation = LayoutConfiguration.LayoutOrientation.LANDSCAPE,
            useCustomOpacity = false,
            opacity = 50,
            layoutVariants = emptyMap(),
        )
    }

    private fun buildFullscreenLandscapeLayout(): LayoutConfiguration {
        return LayoutConfiguration(
            id = LayoutConfiguration.FULLSCREEN_LANDSCAPE_ID,
            name = context.getString(R.string.layout_fullscreen_landscape),
            type = LayoutConfiguration.LayoutType.DEFAULT,
            orientation = LayoutConfiguration.LayoutOrientation.LANDSCAPE,
            useCustomOpacity = false,
            opacity = 50,
            layoutVariants = emptyMap(),
        )
    }
}
