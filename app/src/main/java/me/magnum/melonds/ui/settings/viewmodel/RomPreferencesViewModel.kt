package me.magnum.melonds.ui.settings.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import me.magnum.melonds.impl.NdsRomCache
import javax.inject.Inject

@HiltViewModel
class RomPreferencesViewModel @Inject constructor(
    private val romCache: NdsRomCache,
) : ViewModel() {

    val romCacheSize get() = romCache.getCacheSizeFlow()

    fun clearRomCache(): Boolean {
        return romCache.clearCache()
    }
}