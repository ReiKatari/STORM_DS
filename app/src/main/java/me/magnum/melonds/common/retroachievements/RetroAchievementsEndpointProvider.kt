package me.magnum.melonds.common.retroachievements

import android.content.SharedPreferences
import android.util.Log
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import me.magnum.melonds.domain.model.retroachievements.RetroAchievementsOfflineBackend
import me.magnum.rcheevosapi.RAHostUrlProvider
import java.net.URI

data class ValidatedRetroAchievementsHost(
    val clientHost: String,
    val apiUrl: String,
)

object RetroAchievementsHostValidator {
    fun validate(rawHost: String?): Result<ValidatedRetroAchievementsHost> = runCatching {
        val raw = rawHost?.trim().orEmpty()
        require(raw.isNotEmpty()) { "Missing host" }

        val uri = URI(raw)
        require(uri.scheme == "http") { "Only HTTP loopback is supported" }
        require(uri.rawUserInfo == null) { "User info is not allowed" }
        require(uri.rawQuery == null) { "Query is not allowed" }
        require(uri.rawFragment == null) { "Fragment is not allowed" }
        require(uri.host == "127.0.0.1" || uri.host.equals("localhost", ignoreCase = true)) {
            "Only localhost or 127.0.0.1 is allowed"
        }
        require(uri.port in 1..65535) { "A valid explicit port is required" }
        require(uri.rawPath.isNullOrEmpty() || uri.rawPath == "/" || uri.rawPath == "/dorequest.php") {
            "Only /dorequest.php is allowed"
        }

        val normalizedHost = uri.host.lowercase()
        val clientHost = "http://$normalizedHost:${uri.port}"
        ValidatedRetroAchievementsHost(
            clientHost = clientHost,
            apiUrl = "$clientHost/dorequest.php",
        )
    }
}

data class RetroAchievementsEndpointSnapshot(
    val backendSelected: RetroAchievementsOfflineBackend,
    val backendEffective: RetroAchievementsOfflineBackend,
    val hostSource: HostSource,
    val apiUrl: String?,
    val nativeClientHost: String?,
    val generation: Long,
    val externalActivationActive: Boolean,
    val builtInLedgerEnabled: Boolean,
    val builtInSyncEnabled: Boolean,
) {
    enum class HostSource {
        OFFICIAL,
        RA_OFFLINE_PROXY,
        RA_OFFLINE_PROXY_UNAVAILABLE,
    }
}

class RetroAchievementsProxyUnavailableException :
    IllegalStateException("RAOfflineProxy is selected but no active loopback host is available")

class RetroAchievementsEndpointProvider(
    private val preferences: SharedPreferences,
) : RAHostUrlProvider, SharedPreferences.OnSharedPreferenceChangeListener {

    private val mutableSnapshot = MutableStateFlow(RetroAchievementsEndpointStorage.snapshot(preferences))
    @Volatile
    private var sessionSnapshot: RetroAchievementsEndpointSnapshot? = null
    val snapshot: StateFlow<RetroAchievementsEndpointSnapshot> = mutableSnapshot.asStateFlow()

    init {
        RetroAchievementsEndpointStorage.migrate(preferences)
        mutableSnapshot.value = RetroAchievementsEndpointStorage.snapshot(preferences)
        preferences.registerOnSharedPreferenceChangeListener(this)
    }

    override fun getApiUrl(): String {
        return routingSnapshot().apiUrl ?: throw RetroAchievementsProxyUnavailableException()
    }

    fun currentSnapshot(): RetroAchievementsEndpointSnapshot {
        return RetroAchievementsEndpointStorage.snapshot(preferences)
    }

    @Synchronized
    fun beginSession(): RetroAchievementsEndpointSnapshot {
        return currentSnapshot().also { sessionSnapshot = it }
    }

    @Synchronized
    fun endSession() {
        sessionSnapshot = null
    }

    fun routingSnapshot(): RetroAchievementsEndpointSnapshot {
        return sessionSnapshot ?: currentSnapshot()
    }

    fun setSelectedBackend(backend: RetroAchievementsOfflineBackend) {
        RetroAchievementsEndpointStorage.setSelectedBackend(preferences, backend)
    }

    fun allowHardcoreUserChoice(enabled: Boolean): Boolean {
        val effective = currentSnapshot().backendEffective
        if (effective == RetroAchievementsOfflineBackend.RA_OFFLINE_PROXY && enabled) {
            return false
        }
        return true
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        if (key in RetroAchievementsEndpointStorage.OBSERVED_KEYS) {
            mutableSnapshot.value = RetroAchievementsEndpointStorage.snapshot(sharedPreferences)
        }
    }
}

object RetroAchievementsEndpointStorage {
    const val OFFICIAL_CLIENT_HOST = "https://retroachievements.org"
    const val OFFICIAL_API_URL = "$OFFICIAL_CLIENT_HOST/dorequest.php"

    const val KEY_BACKEND = "ra_offline_backend"
    const val KEY_EXTERNAL_ACTIVE = "ra_offline_proxy_external_active"
    const val KEY_PROXY_CLIENT_HOST = "ra_offline_proxy_client_host"
    const val KEY_GENERATION = "ra_endpoint_generation"
    const val KEY_HARDCORE = "ra_hardcore_enabled"
    const val KEY_OFFLINE_SOFTCORE_ENABLED = "ra_offline_softcore_enabled"

    private const val KEY_HARDCORE_RESTORE_PENDING = "ra_proxy_hardcore_restore_pending"

    val OBSERVED_KEYS = setOf(
        KEY_BACKEND,
        KEY_EXTERNAL_ACTIVE,
        KEY_PROXY_CLIENT_HOST,
        KEY_GENERATION,
        KEY_HARDCORE,
        KEY_OFFLINE_SOFTCORE_ENABLED,
    )

    fun migrate(preferences: SharedPreferences) {
        if (!preferences.contains(KEY_BACKEND)) {
            preferences.edit()
                .putString(KEY_BACKEND, RetroAchievementsOfflineBackend.BUILT_IN.preferenceValue)
                .commit()
        }
    }

    fun snapshot(preferences: SharedPreferences): RetroAchievementsEndpointSnapshot {
        val selected = RetroAchievementsOfflineBackend.fromPreference(
            preferences.getString(KEY_BACKEND, RetroAchievementsOfflineBackend.BUILT_IN.preferenceValue),
        )
        val externalActive = preferences.getBoolean(KEY_EXTERNAL_ACTIVE, false)
        val effective = if (externalActive) {
            RetroAchievementsOfflineBackend.RA_OFFLINE_PROXY
        } else {
            selected
        }
        val proxyHost = preferences.getString(KEY_PROXY_CLIENT_HOST, null)
            ?.let { RetroAchievementsHostValidator.validate(it).getOrNull() }
        val proxyAvailable = effective == RetroAchievementsOfflineBackend.RA_OFFLINE_PROXY && proxyHost != null
        val builtInEnabled =
            effective == RetroAchievementsOfflineBackend.BUILT_IN &&
                preferences.getBoolean(KEY_OFFLINE_SOFTCORE_ENABLED, true)

        return RetroAchievementsEndpointSnapshot(
            backendSelected = selected,
            backendEffective = effective,
            hostSource = when {
                effective == RetroAchievementsOfflineBackend.BUILT_IN ->
                    RetroAchievementsEndpointSnapshot.HostSource.OFFICIAL
                proxyAvailable -> RetroAchievementsEndpointSnapshot.HostSource.RA_OFFLINE_PROXY
                else -> RetroAchievementsEndpointSnapshot.HostSource.RA_OFFLINE_PROXY_UNAVAILABLE
            },
            apiUrl = if (effective == RetroAchievementsOfflineBackend.BUILT_IN) {
                OFFICIAL_API_URL
            } else {
                proxyHost?.apiUrl
            },
            nativeClientHost = if (effective == RetroAchievementsOfflineBackend.BUILT_IN) {
                OFFICIAL_CLIENT_HOST
            } else {
                proxyHost?.clientHost
            },
            generation = preferences.getLong(KEY_GENERATION, 0L),
            externalActivationActive = externalActive,
            builtInLedgerEnabled = builtInEnabled,
            builtInSyncEnabled = builtInEnabled,
        )
    }

    fun activateExternal(preferences: SharedPreferences, rawHost: String?): Result<RetroAchievementsEndpointSnapshot> {
        val host = RetroAchievementsHostValidator.validate(rawHost).getOrElse {
            return Result.failure(it)
        }
        val wasProxyEffective =
            snapshot(preferences).backendEffective == RetroAchievementsOfflineBackend.RA_OFFLINE_PROXY
        val editor = preferences.edit()
            .putBoolean(KEY_EXTERNAL_ACTIVE, true)
            .putString(KEY_PROXY_CLIENT_HOST, host.clientHost)
            .putLong(KEY_GENERATION, nextGeneration(preferences))

        if (!wasProxyEffective && preferences.getBoolean(KEY_HARDCORE, false)) {
            editor
                .putBoolean(KEY_HARDCORE_RESTORE_PENDING, true)
                .putBoolean(KEY_HARDCORE, false)
        }

        check(editor.commit()) { "Could not persist RAOfflineProxy activation" }
        return Result.success(snapshot(preferences))
    }

    fun clearExternal(preferences: SharedPreferences): RetroAchievementsEndpointSnapshot {
        if (
            !preferences.getBoolean(KEY_EXTERNAL_ACTIVE, false) &&
            !preferences.contains(KEY_PROXY_CLIENT_HOST)
        ) {
            return snapshot(preferences)
        }
        val selected = selectedBackend(preferences)
        val editor = preferences.edit()
            .putBoolean(KEY_EXTERNAL_ACTIVE, false)
            .remove(KEY_PROXY_CLIENT_HOST)
            .putLong(KEY_GENERATION, nextGeneration(preferences))

        if (selected == RetroAchievementsOfflineBackend.BUILT_IN) {
            applyHardcoreRestoreIfSafe(preferences, editor)
        }
        check(editor.commit()) { "Could not persist RAOfflineProxy clear" }
        return snapshot(preferences)
    }

    fun setSelectedBackend(
        preferences: SharedPreferences,
        backend: RetroAchievementsOfflineBackend,
    ): RetroAchievementsEndpointSnapshot {
        val before = snapshot(preferences)
        val editor = preferences.edit()
            .putString(KEY_BACKEND, backend.preferenceValue)
            .putLong(KEY_GENERATION, nextGeneration(preferences))

        if (
            backend == RetroAchievementsOfflineBackend.RA_OFFLINE_PROXY &&
            before.backendEffective == RetroAchievementsOfflineBackend.BUILT_IN &&
            preferences.getBoolean(KEY_HARDCORE, false)
        ) {
            editor
                .putBoolean(KEY_HARDCORE_RESTORE_PENDING, true)
                .putBoolean(KEY_HARDCORE, false)
        } else if (
            backend == RetroAchievementsOfflineBackend.BUILT_IN &&
            !preferences.getBoolean(KEY_EXTERNAL_ACTIVE, false)
        ) {
            applyHardcoreRestoreIfSafe(preferences, editor)
        }

        check(editor.commit()) { "Could not persist RA offline backend" }
        return snapshot(preferences)
    }

    private fun applyHardcoreRestoreIfSafe(
        preferences: SharedPreferences,
        editor: SharedPreferences.Editor,
    ) {
        val shouldRestore =
            preferences.getBoolean(KEY_HARDCORE_RESTORE_PENDING, false) &&
                !preferences.getBoolean(KEY_HARDCORE, false)
        if (shouldRestore) {
            editor.putBoolean(KEY_HARDCORE, true)
        }
        editor
            .remove(KEY_HARDCORE_RESTORE_PENDING)
    }

    private fun selectedBackend(preferences: SharedPreferences): RetroAchievementsOfflineBackend {
        return RetroAchievementsOfflineBackend.fromPreference(
            preferences.getString(KEY_BACKEND, RetroAchievementsOfflineBackend.BUILT_IN.preferenceValue),
        )
    }

    private fun nextGeneration(preferences: SharedPreferences): Long {
        return preferences.getLong(KEY_GENERATION, 0L).let {
            if (it == Long.MAX_VALUE) 1L else it + 1L
        }
    }

    fun logSnapshot(snapshot: RetroAchievementsEndpointSnapshot, reason: String) {
        Log.i(
            "RAEndpoint",
            "reason=$reason backendSelected=${snapshot.backendSelected.name} " +
                "backendEffective=${snapshot.backendEffective.name} " +
                "hostSource=${snapshot.hostSource.name.lowercase()} " +
                "host=${if (snapshot.hostSource == RetroAchievementsEndpointSnapshot.HostSource.OFFICIAL) "official" else "loopback-redacted"} " +
                "builtInLedgerEnabled=${snapshot.builtInLedgerEnabled} " +
                "builtInSyncEnabled=${snapshot.builtInSyncEnabled} " +
                "nativeClientHostConfigured=${snapshot.nativeClientHost != null}",
        )
    }
}
