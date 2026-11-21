package me.magnum.melonds.ui.settings.viewmodel

import android.content.Context
import android.net.Uri
import android.os.Environment
import androidx.lifecycle.ViewModel
import androidx.preference.PreferenceManager
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
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
    }

    fun importCheatsDatabase(databaseUri: Uri) {
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
        cheatsRepository.clearAllCheatDatabases()
        PreferenceManager.getDefaultSharedPreferences(appContext)
            .edit()
            .remove(PREF_CHEATS_DB_LAST_UPDATED_MS)
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
            "https://ghfast.top/$rawPrimary",
            "https://ghproxy.net/$rawPrimary",
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
            else -> (githubRawUrls + ghproxyUrls).distinct()
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

        val targetDir = runCatching {
            val extDir = File(Environment.getExternalStorageDirectory(), "STORM DS/cheats")
            if (extDir.exists() || extDir.mkdirs()) extDir else File(appContext.filesDir, "cheats").apply { mkdirs() }
        }.getOrElse {
            File(appContext.filesDir, "cheats").apply { mkdirs() }
        }
        val targetFile = File(targetDir, "usrcheat.dat")
        val tempFile = File(targetDir, "usrcheat.dat.tmp")

        var downloadedValidDat = false
        for (url in candidateUrls) {
            try {
                val request = Request.Builder()
                    .url(url)
                    .header("User-Agent", "STORM-DS/8.4.1")
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
            saveDatabaseUpdatedNow()
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

    fun areCheatsBeingImported(): Boolean {
        return cheatsRepository.isCheatImportOngoing()
    }

    fun observeCheatsImportProgress(): Flow<CheatImportProgress> {
        return cheatsRepository.getCheatImportProgress()
    }
}
