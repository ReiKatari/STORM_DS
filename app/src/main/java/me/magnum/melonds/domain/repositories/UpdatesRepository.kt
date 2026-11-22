package me.magnum.melonds.domain.repositories

import me.magnum.melonds.domain.model.appupdate.AppUpdate

interface UpdatesRepository {
    suspend fun checkNewUpdate(ignorePreferences: Boolean = false): Result<AppUpdate?>
    suspend fun checkNewUpdateManually(): Result<AppUpdate?> = checkNewUpdate(ignorePreferences = true)
    fun skipUpdate(update: AppUpdate)
    fun notifyUpdateDownloaded(update: AppUpdate)
}
