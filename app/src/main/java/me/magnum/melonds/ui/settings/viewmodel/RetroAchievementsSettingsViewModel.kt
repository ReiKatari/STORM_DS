package me.magnum.melonds.ui.settings.viewmodel

import android.os.SystemClock
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.retroachievements.RetroAchievementsEndpointProvider
import me.magnum.melonds.common.retroachievements.RetroAchievementsEndpointSnapshot
import me.magnum.melonds.common.retroachievements.RetroAchievementsEndpointStorage
import me.magnum.melonds.domain.model.retroachievements.PendingAchievementsSyncSummary
import me.magnum.melonds.domain.repositories.RetroAchievementsRepository
import me.magnum.melonds.ui.settings.model.RetroAchievementsAccountState
import me.magnum.rcheevosapi.model.RAUserAuth
import okhttp3.OkHttpClient
import okhttp3.Request
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class RetroAchievementsSettingsViewModel @Inject constructor(
    private val retroAchievementsRepository: RetroAchievementsRepository,
    private val endpointProvider: RetroAchievementsEndpointProvider,
    @Named("ra-api-client") private val raOkHttpClient: OkHttpClient,
): ViewModel() {

    sealed class AuthCheckState {
        data class Authenticated(val username: String, val hasToken: Boolean) : AuthCheckState()
        data class Expired(val username: String) : AuthCheckState()
        data object NotSignedIn : AuthCheckState()
    }

    sealed class ProxyCheckState {
        data object Direct : ProxyCheckState()
        data class ProxyActive(val hostUrl: String, val isExternalOverride: Boolean) : ProxyCheckState()
        data object ProxyUnavailable : ProxyCheckState()
    }

    sealed class RetroAchievementsConnectionTestState {
        data object Idle : RetroAchievementsConnectionTestState()
        data object Testing : RetroAchievementsConnectionTestState()
        data class Result(
            val targetUrl: String,
            val isReachable: Boolean,
            val latencyMs: Long?,
            val httpStatusCode: Int?,
            val reachabilityError: String?,
            val authState: AuthCheckState,
            val proxyStatus: ProxyCheckState,
        ) : RetroAchievementsConnectionTestState()
    }

    private val _accountState = MutableStateFlow<RetroAchievementsAccountState>(RetroAchievementsAccountState.Unknown)
    val accountState by lazy {
        viewModelScope.launch {
            updateLoggedInState()
        }
        _accountState.asStateFlow()
    }

    val userProfile = retroAchievementsRepository.observeUserProfile()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    val pendingSubmissionsCount = retroAchievementsRepository.observePendingAchievementSubmissionsCount()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0)

    private val _syncingPending = MutableStateFlow(false)
    val syncingPending = _syncingPending.asStateFlow()

    private val _syncPendingResultEvent = MutableSharedFlow<PendingAchievementsSyncSummary>(
        extraBufferCapacity = 1,
        onBufferOverflow = BufferOverflow.DROP_OLDEST,
    )
    val syncPendingResultEvent = _syncPendingResultEvent.asSharedFlow()

    private val _connectionTestState = MutableStateFlow<RetroAchievementsConnectionTestState>(
        RetroAchievementsConnectionTestState.Idle,
    )
    val connectionTestState = _connectionTestState.asStateFlow()

    private val _loggingIn = MutableStateFlow(false)
    val loggingIn = _loggingIn.asStateFlow()

    private val _loginErrorEvent = MutableSharedFlow<Unit>(extraBufferCapacity = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val loginErrorEvent = _loginErrorEvent.asSharedFlow()

    fun syncPendingSubmissions() {
        if (_syncingPending.value) return
        viewModelScope.launch {
            _syncingPending.value = true
            try {
                val summary = withContext(Dispatchers.IO) {
                    retroAchievementsRepository.syncPendingAchievementsWithReport()
                }
                _syncPendingResultEvent.tryEmit(summary)
            } finally {
                _syncingPending.value = false
            }
        }
    }

    fun testConnection() {
        if (_connectionTestState.value is RetroAchievementsConnectionTestState.Testing) return
        viewModelScope.launch {
            _connectionTestState.value = RetroAchievementsConnectionTestState.Testing
            val result = withContext(Dispatchers.IO) {
                val snapshot = endpointProvider.currentSnapshot()
                val userAuth = retroAchievementsRepository.getUserAuthentication()
                val authCheck = when (userAuth) {
                    is RAUserAuth.Authenticated -> AuthCheckState.Authenticated(
                        username = userAuth.username,
                        hasToken = userAuth.token.isNotBlank(),
                    )
                    is RAUserAuth.AuthenticationExpired -> AuthCheckState.Expired(userAuth.username)
                    null -> AuthCheckState.NotSignedIn
                }

                val proxyCheck = when (snapshot.hostSource) {
                    RetroAchievementsEndpointSnapshot.HostSource.OFFICIAL -> ProxyCheckState.Direct
                    RetroAchievementsEndpointSnapshot.HostSource.RA_OFFLINE_PROXY -> ProxyCheckState.ProxyActive(
                        hostUrl = snapshot.nativeClientHost ?: RetroAchievementsEndpointStorage.OFFICIAL_CLIENT_HOST,
                        isExternalOverride = snapshot.externalActivationActive,
                    )
                    RetroAchievementsEndpointSnapshot.HostSource.RA_OFFLINE_PROXY_UNAVAILABLE -> ProxyCheckState.ProxyUnavailable
                }

                val targetUrl = snapshot.nativeClientHost ?: RetroAchievementsEndpointStorage.OFFICIAL_CLIENT_HOST
                val client = raOkHttpClient.newBuilder()
                    .connectTimeout(8, TimeUnit.SECONDS)
                    .readTimeout(8, TimeUnit.SECONDS)
                    .callTimeout(10, TimeUnit.SECONDS)
                    .followRedirects(true)
                    .build()

                val startMs = SystemClock.elapsedRealtime()
                var reachable = false
                var latencyMs: Long? = null
                var httpStatusCode: Int? = null
                var reachabilityError: String? = null

                try {
                    val headRequest = Request.Builder()
                        .url(targetUrl)
                        .head()
                        .build()
                    val code = client.newCall(headRequest).execute().use { it.code }
                    val finalCode = if (code == 405) {
                        val getRequest = Request.Builder()
                            .url(targetUrl)
                            .get()
                            .build()
                        client.newCall(getRequest).execute().use { it.code }
                    } else {
                        code
                    }
                    latencyMs = (SystemClock.elapsedRealtime() - startMs).coerceAtLeast(1L)
                    httpStatusCode = finalCode
                    if (finalCode in 100..499) {
                        reachable = true
                    } else {
                        reachabilityError = "HTTP $finalCode"
                    }
                } catch (e: Exception) {
                    latencyMs = (SystemClock.elapsedRealtime() - startMs).coerceAtLeast(1L)
                    reachabilityError = e.localizedMessage?.takeIf { it.isNotBlank() } ?: e.javaClass.simpleName
                }

                RetroAchievementsConnectionTestState.Result(
                    targetUrl = targetUrl,
                    isReachable = reachable,
                    latencyMs = latencyMs,
                    httpStatusCode = httpStatusCode,
                    reachabilityError = reachabilityError,
                    authState = authCheck,
                    proxyStatus = proxyCheck,
                )
            }
            _connectionTestState.value = result
        }
    }

    fun resetConnectionTestState() {
        _connectionTestState.value = RetroAchievementsConnectionTestState.Idle
    }

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
