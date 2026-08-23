package me.magnum.melonds.ui.dsiwaremanager.model

import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.DSiWareTitle

import me.magnum.melonds.domain.model.rom.Rom

sealed class DSiWareManagerUiState {
    data class DSiSetupInvalid(val status: ConfigurationDirResult.Status) : DSiWareManagerUiState()
    object Loading : DSiWareManagerUiState()
    data class Ready(
        val titles: List<DSiWareTitle>,
        val dsiEnhancedRoms: List<Rom> = emptyList(),
    ) : DSiWareManagerUiState()
    object Error : DSiWareManagerUiState()
}