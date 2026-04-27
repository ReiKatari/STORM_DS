package me.magnum.melonds.ui.romlist

import me.magnum.melonds.domain.model.RomFilter
import me.magnum.melonds.domain.model.RomViewMode
import me.magnum.melonds.domain.model.SortingMode
import me.magnum.melonds.domain.model.SortingOrder
import me.magnum.melonds.domain.model.rom.Rom

sealed class RomBrowserEntry {
    data class Folder(
        val docId: String,
        val name: String,
        val relativePath: String,
        val isRoot: Boolean
    ) : RomBrowserEntry()

    data class RomItem(
        val rom: Rom
    ) : RomBrowserEntry()
}

data class RomBrowserUiState(
    val entries: List<RomBrowserEntry>,
    val breadcrumbs: List<String>,
    val canNavigateUp: Boolean,
    val isSearchActive: Boolean,
    val isAtVirtualRoot: Boolean,
    val viewMode: RomViewMode = RomViewMode.GRID,
    val filter: RomFilter = RomFilter.ALL,
    val sortingMode: SortingMode = SortingMode.ALPHABETICALLY,
    val sortingOrder: SortingOrder = SortingOrder.ASCENDING,
    val continuePlaying: List<Rom> = emptyList(),
    val alphabetIndex: Map<Char, Int> = emptyMap(),
)
