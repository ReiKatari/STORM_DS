package me.magnum.melonds.ui.layouts.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import me.magnum.melonds.domain.model.layout.LayoutConfiguration
import me.magnum.melonds.domain.repositories.LayoutsRepository
import me.magnum.melonds.ui.layouts.model.SelectedLayout
import java.util.UUID

abstract class BaseLayoutsViewModel(protected val layoutsRepository: LayoutsRepository) : ViewModel() {

    protected val _layouts = MutableStateFlow<List<LayoutConfiguration>?>(null)
    val layouts = _layouts.asStateFlow()

    abstract val selectedLayoutId: StateFlow<SelectedLayout>

    fun addLayout(layout: LayoutConfiguration) {
        viewModelScope.launch {
            layoutsRepository.saveLayout(layout)
        }
    }

    fun deleteLayout(layout: LayoutConfiguration) {
        viewModelScope.launch {
            if (layout.id == selectedLayoutId.value) {
                applyFallbackLayout()
            }
            layoutsRepository.deleteLayout(layout)
        }
    }

    fun exportLayout(context: android.content.Context, layout: LayoutConfiguration, uri: android.net.Uri, onComplete: ((Boolean) -> Unit)? = null) {
        viewModelScope.launch(kotlinx.coroutines.Dispatchers.IO) {
            try {
                val dto = me.magnum.melonds.impl.dtos.layout.LayoutConfigurationDto.fromModel(layout)
                val json = com.google.gson.Gson().toJson(dto)
                context.contentResolver.openOutputStream(uri)?.use { out ->
                    out.write(json.toByteArray(Charsets.UTF_8))
                }
                kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                    onComplete?.invoke(true)
                }
            } catch (e: Exception) {
                e.printStackTrace()
                kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                    onComplete?.invoke(false)
                }
            }
        }
    }

    fun importLayout(context: android.content.Context, uri: android.net.Uri, onComplete: ((Boolean) -> Unit)? = null) {
        viewModelScope.launch(kotlinx.coroutines.Dispatchers.IO) {
            try {
                val json = context.contentResolver.openInputStream(uri)?.use { input ->
                    input.bufferedReader(Charsets.UTF_8).readText()
                } ?: run {
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                        onComplete?.invoke(false)
                    }
                    return@launch
                }

                val dto = com.google.gson.Gson().fromJson(json, me.magnum.melonds.impl.dtos.layout.LayoutConfigurationDto::class.java)
                val model = dto.toModel()
                val importedLayout = model.copy(
                    id = UUID.randomUUID(),
                    name = model.name?.let { if (it.endsWith(")")) it else "$it (Imported)" } ?: "Imported Layout",
                    type = LayoutConfiguration.LayoutType.CUSTOM
                )
                layoutsRepository.saveLayout(importedLayout)
                kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                    onComplete?.invoke(true)
                }
            } catch (e: Exception) {
                e.printStackTrace()
                kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                    onComplete?.invoke(false)
                }
            }
        }
    }

    abstract fun setSelectedLayoutId(id: UUID?)

    protected abstract fun applyFallbackLayout()
}