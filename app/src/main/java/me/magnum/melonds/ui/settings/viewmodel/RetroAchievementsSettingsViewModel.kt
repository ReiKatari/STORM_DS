package me.magnum.melonds.ui.settings.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import me.magnum.melonds.domain.repositories.RetroAchievementsRepository
import me.magnum.melonds.ui.settings.model.RetroAchievementsAccountState
import me.magnum.rcheevosapi.model.RAUserAuth
import javax.inject.Inject

@HiltViewModel
class RetroAchievementsSettingsViewModel @Inject constructor(
    private val retroAchievementsRepository: RetroAchievementsRepository,
): ViewModel() {

    private val _accountState = MutableStateFlow<RetroAchievementsAccountState>(RetroAchievementsAccountState.Unknown)
    val accountState by lazy {
        viewModelScope.launch {
            updateLoggedInState()
        }
        _accountState.asStateFlow()
    }

    val userProfile = retroAchievementsRepository.observeUserProfile()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    private val _loggingIn = MutableStateFlow(false)
    val loggingIn = _loggingIn.asStateFlow()

    private val _loginErrorEvent = MutableSharedFlow<Unit>(extraBufferCapacity = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val loginErrorEvent = _loginErrorEvent.asSharedFlow()

    fun logoutFromRetroAchievements() {
        viewModelScope.launch {
            if (retroAchievementsRepository.logout()) {
                _accountState.value = RetroAchievementsAccountState.LoggedOut
            } else {
                updateLoggedInState()
            }
        }
    }

    fun login(username: String, password: String) {
        viewModelScope.launch {
            _loggingIn.value = true
            val result = retroAchievementsRepository.login(username, password)
            if (result.isSuccess) {
                updateLoggedInState()
            } else {
                updateLoggedInState()
                _loginErrorEvent.tryEmit(Unit)
            }
            _loggingIn.value = false
        }
    }

    private suspend fun updateLoggedInState() {
        val userAuth = retroAchievementsRepository.getUserAuthentication()
        _accountState.value = when (userAuth) {
            is RAUserAuth.Authenticated -> {
                viewModelScope.launch { retroAchievementsRepository.refreshUserProfile() }
                RetroAchievementsAccountState.LoggedIn(userAuth.username)
            }
            is RAUserAuth.AuthenticationExpired -> RetroAchievementsAccountState.LoginExpired(userAuth.username)
            null -> RetroAchievementsAccountState.LoggedOut
        }
    }
}
