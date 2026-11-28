package me.magnum.melonds.ui.settings.viewmodel

import android.content.Context
import android.net.Uri
import android.os.Environment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.preference.PreferenceManager
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.cheats.EmbeddedActionReplayCheats
import me.magnum.melonds.common.network.SharedOkHttpClient
import me.magnum.melonds.database.MelonDatabase
import me.magnum.melonds.domain.model.CheatGameSearchResult
import me.magnum.melonds.domain.model.CheatImportProgress
import me.magnum.melonds.domain.repositories.CheatsRepository
import okhttp3.Request
import java.io.File
import java.io.FileOutputStream
import java.util.concurrent.TimeUnit
import javax.inject.Inject

sealed class OnlineCheatsDownloadResult {
    data object OnlineUsrCheatImportStarted : OnlineCheatsDownloadResult()
    data class EmbeddedFallbackLoaded(val gamesCount: Int) : OnlineCheatsDownloadResult()
    data object Failed : OnlineCheatsDownloadResult()
}

@HiltViewModel
class CheatsPreferencesViewModel @Inject constructor(
    @ApplicationContext private val appContext: Context,
    private val cheatsRepository: CheatsRepository,
    private val database: MelonDatabase,
) : ViewModel() {

    companion object {
        const val PREF_CHEATS_DOWNLOAD_MIRROR = "cheats_download_mirror"
        const val PREF_CHEATS_DB_LAST_UPDATED_MS = "cheats_db_last_updated_ms"

        const val MIRROR_AUTO = "auto"
        const val MIRROR_GITHUB_RAW = "github_raw"
        const val MIRROR_JSDELIVR = "jsdelivr"
        const val MIRROR_GHPROXY = "ghproxy"
        private const val PREFS_AUTO_IMPORT = "storm_cheats_auto_import"
        private const val KEY_AUTO_IMPORT_SIG = "usrcheat_auto_import_sig"
    }

    private val _isDownloadingOnline = MutableStateFlow(false)
    val isDownloadingOnline: StateFlow<Boolean> = _isDownloadingOnline.asStateFlow()

    private val _onlineDownloadResult = MutableSharedFlow<OnlineCheatsDownloadResult>(extraBufferCapacity = 1)
    val onlineDownloadResult: SharedFlow<OnlineCheatsDownloadResult> = _onlineDownloadResult.asSharedFlow()

    @Volatile
    private var pendingAutoImportSig: String? = null

    init {
        viewModelScope.launch {
            var sawActiveImport = false
            cheatsRepository.getCheatImportProgress().collect { progress ->
                when (progress.status) {
                    CheatImportProgress.CheatImportStatus.STARTING,
                    CheatImportProgress.CheatImportStatus.ONGOING -> {
                        sawActiveImport = true
                    }
                    CheatImportProgress.CheatImportStatus.FINISHED -> {
                        if (sawActiveImport) {
                            sawActiveImport = false
                            val sig = pendingAutoImportSig
                            if (sig != null) {
                                appContext.getSharedPreferences(PREFS_AUTO_IMPORT, Context.MODE_PRIVATE)
                                    .edit()
                                    .putString(KEY_AUTO_IMPORT_SIG, sig)
                                    .apply()
                                pendingAutoImportSig = null
                            }
                        }
                    }
                    CheatImportProgress.CheatImportStatus.FAILED -> {
                        if (sawActiveImport) {
                            sawActiveImport = false
                            pendingAutoImportSig = null
                        }
                    }
                    CheatImportProgress.CheatImportStatus.NOT_IMPORTING -> {
                        sawActiveImport = false
                    }
                }
            }
        }
    }

    fun startOnlineCheatsDownload(mirrorKey: String? = null) {
        if (_isDownloadingOnline.value) return
        _isDownloadingOnline.value = true
        viewModelScope.launch {
            try {
                val result = downloadAndImportOnlineCheats(mirrorKey)
                _onlineDownloadResult.tryEmit(result)
            } finally {
                _isDownloadingOnline.value = false
            }
        }
    }

    fun importCheatsDatabase(databaseUri: Uri) {
        pendingAutoImportSig = null
        cheatsRepository.importCheats(databaseUri)
    }

    suspend fun getDatabaseStats(): Pair<Int, Int> = withContext(Dispatchers.IO) {
        runCatching {
            val games = database.gameDao().getGameCount()
            val cheats = database.cheatDao().getCheatCount()
            games to cheats
        }.getOrDefault(0 to 0)
    }

    suspend fun clearCheatDatabase() = withContext(Dispatchers.IO) {
        pendingAutoImportSig = null
        cheatsRepository.clearAllCheatDatabases()
        PreferenceManager.getDefaultSharedPreferences(appContext)
            .edit()
            .remove(PREF_CHEATS_DB_LAST_UPDATED_MS)
            .apply()
        appContext.getSharedPreferences(PREFS_AUTO_IMPORT, Context.MODE_PRIVATE)
            .edit()
            .remove(KEY_AUTO_IMPORT_SIG)
            .apply()
    }

    suspend fun searchGames(query: String, limit: Int = 50): List<CheatGameSearchResult> = withContext(Dispatchers.IO) {
        runCatching {
            cheatsRepository.searchGames(query.trim(), limit)
        }.getOrDefault(emptyList())
    }

    fun getDatabaseLastUpdatedMs(): Long {
        return PreferenceManager.getDefaultSharedPreferences(appContext)
            .getLong(PREF_CHEATS_DB_LAST_UPDATED_MS, 0L)
    }

    fun saveDatabaseUpdatedNow() {
        PreferenceManager.getDefaultSharedPreferences(appContext)
            .edit()
            .putLong(PREF_CHEATS_DB_LAST_UPDATED_MS, System.currentTimeMillis())
            .apply()
    }

    private fun resolveCandidateUrls(mirror: String): List<String> {
        val rawPrimary = "https://raw.githubusercontent.com/3song/Hacking-DeadSkullzJr-s-NDS-i--Cheat-Databases/main/Cheat%20Databases/usrcheat.dat"
        val githubRawUrls = listOf(
            rawPrimary,
            "https://github.com/3song/Hacking-DeadSkullzJr-s-NDS-i--Cheat-Databases/raw/main/Cheat%20Databases/usrcheat.dat",
        )
        val jsdelivrUrls = listOf(
            "https://cdn.jsdelivr.net/gh/3song/Hacking-DeadSkullzJr-s-NDS-i--Cheat-Databases@main/Cheat%20Databases/usrcheat.dat",
            rawPrimary,
        )
        val ghproxyUrls = listOf(
            "https://ghfast.top/$rawPrimary",
            "https://gh-proxy.com/$rawPrimary",
            "https://ghproxy.net/$rawPrimary",
        )
        return when (mirror) {
            MIRROR_GITHUB_RAW -> githubRawUrls
            MIRROR_JSDELIVR -> jsdelivrUrls
            MIRROR_GHPROXY -> ghproxyUrls
            else -> (githubRawUrls + jsdelivrUrls + ghproxyUrls).distinct()
        }
    }

    suspend fun downloadAndImportOnlineCheats(mirrorKey: String? = null): OnlineCheatsDownloadResult = withContext(Dispatchers.IO) {
        val selectedMirror = mirrorKey
            ?: PreferenceManager.getDefaultSharedPreferences(appContext).getString(PREF_CHEATS_DOWNLOAD_MIRROR, MIRROR_AUTO)
            ?: MIRROR_AUTO
        val candidateUrls = resolveCandidateUrls(selectedMirror)

        val client = SharedOkHttpClient.instance.newBuilder()
            .followRedirects(true)
            .followSslRedirects(true)
            .connectTimeout(12, TimeUnit.SECONDS)
            .readTimeout(40, TimeUnit.SECONDS)
            .build()

        val targetDir = resolveWritableCheatsDir(appContext)
        val targetFile = File(targetDir, "usrcheat.dat")
        val tempFile = File(targetDir, "usrcheat.dat.tmp")

        var downloadedValidDat = false
        for (url in candidateUrls) {
            try {
                val request = Request.Builder()
                    .url(url)
                    .header("User-Agent", "STORM-DS/8.9.4")
                    .build()
                client.newCall(request).execute().use { response ->
                    if (!response.isSuccessful) return@use
                    val body = response.body ?: return@use
                    body.byteStream().use { input ->
                        val header = ByteArray(16)
                        val headerRead = input.read(header)
                        // Verify authentic R4 CheatCode header so we never import an HTML 404/error page
                        if (headerRead >= 12 && String(header, 0, 12, Charsets.US_ASCII).startsWith("R4 CheatCode")) {
                            FileOutputStream(tempFile).use { fos ->
                                fos.write(header, 0, headerRead)
                                input.copyTo(fos, 32 * 1024)
                            }
                            if (tempFile.length() > 1024L) {
                                if (targetFile.exists()) targetFile.delete()
                                if (!tempFile.renameTo(targetFile)) {
                                    tempFile.copyTo(targetFile, overwrite = true)
                                    tempFile.delete()
                                }
                                downloadedValidDat = true
                            }
                        }
                    }
                }
                if (downloadedValidDat) break
            } catch (_: Throwable) {
                runCatching { if (tempFile.exists()) tempFile.delete() }
            }
        }

        if (downloadedValidDat) {
            pendingAutoImportSig = "${targetFile.length()}_${targetFile.lastModified()}"
            cheatsRepository.importCheats(Uri.fromFile(targetFile))
            return@withContext OnlineCheatsDownloadResult.OnlineUsrCheatImportStarted
        }

        // Offline / mirror fallback: populate built-in Action Replay standard games
        val count = runCatching {
            EmbeddedActionReplayCheats.populateAllStandardGames(database)
        }.getOrDefault(0)
        if (count > 0) {
            saveDatabaseUpdatedNow()
            OnlineCheatsDownloadResult.EmbeddedFallbackLoaded(count)
        } else {
            OnlineCheatsDownloadResult.Failed
        }
    }

    private fun resolveWritableCheatsDir(context: Context): File {
        val extDir = runCatching {
            File(Environment.getExternalStorageDirectory(), "STORM DS/cheats")
        }.getOrNull()
        if (extDir != null && isDirectoryWritable(extDir)) {
            return extDir
        }
        return File(context.filesDir, "cheats").apply { mkdirs() }
    }

    private fun isDirectoryWritable(dir: File): Boolean {
        if (!dir.exists() && !dir.mkdirs()) return false
        if (!dir.isDirectory) return false
        return runCatching {
            val probe = File(dir, ".write_test_${System.nanoTime()}")
            FileOutputStream(probe).use { it.write(0) }
            probe.delete()
            true
        }.getOrDefault(false)
    }

    fun areCheatsBeingImported(): Boolean {
        return cheatsRepository.isCheatImportOngoing()
    }

    fun observeCheatsImportProgress(): Flow<CheatImportProgress> {
        return cheatsRepository.getCheatImportProgress()
    }
}
