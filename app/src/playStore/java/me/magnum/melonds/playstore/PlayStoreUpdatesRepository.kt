package me.magnum.melonds.playstore

import android.content.Context
import android.content.SharedPreferences
import me.magnum.melonds.github.repositories.BaseMirrorUpdatesRepository

class PlayStoreUpdatesRepository(
    context: Context,
    settingsPreferences: SharedPreferences,
    statePreferences: SharedPreferences,
    nowMillis: () -> Long = System::currentTimeMillis,
) : BaseMirrorUpdatesRepository(
    context = context,
    settingsPreferences = settingsPreferences,
    statePreferences = statePreferences,
    defaultAdrenotoolsEnabled = false,
    primaryFetcher = null,
    nowMillis = nowMillis,
)
