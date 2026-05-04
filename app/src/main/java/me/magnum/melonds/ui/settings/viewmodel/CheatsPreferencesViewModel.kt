package me.magnum.melonds.ui.settings.viewmodel

import android.net.Uri
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import me.magnum.melonds.domain.model.CheatImportProgress
import me.magnum.melonds.domain.repositories.CheatsRepository
import javax.inject.Inject

@HiltViewModel
class CheatsPreferencesViewModel @Inject constructor(
    private val cheatsRepository: CheatsRepository,
) : ViewModel() {

    fun importCheatsDatabase(databaseUri: Uri) {
        cheatsRepository.importCheats(databaseUri)
    }

    fun areCheatsBeingImported(): Boolean {
        return cheatsRepository.isCheatImportOngoing()
    }

    fun observeCheatsImportProgress(): Flow<CheatImportProgress> {
        return cheatsRepository.getCheatImportProgress()
    }
}