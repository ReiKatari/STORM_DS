package me.magnum.melonds.github.repositories

import android.content.Context
import android.content.SharedPreferences
import me.magnum.melonds.github.GitHubApi

class GitHubProdUpdatesRepository(
    context: Context,
    api: GitHubApi,
    settingsPreferences: SharedPreferences,
    statePreferences: SharedPreferences,
    nowMillis: () -> Long = System::currentTimeMillis,
) : BaseMirrorUpdatesRepository(
    context = context,
    settingsPreferences = settingsPreferences,
    statePreferences = statePreferences,
    defaultAdrenotoolsEnabled = true,
    primaryFetcher = { api.getReleases() },
    nowMillis = nowMillis,
)
