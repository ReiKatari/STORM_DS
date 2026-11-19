package me.magnum.melonds.ui.settings.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.impl.NdsRomCache
import javax.inject.Inject

@HiltViewModel
class RomPreferencesViewModel @Inject constructor(
    private val romCache: NdsRomCache,
) : ViewModel() {

    val romCacheSize get() = romCache.getCacheSizeFlow()

    suspend fun clearRomCache(): Boolean = withContext(Dispatchers.IO) {
        romCache.clearCache()
    }
}