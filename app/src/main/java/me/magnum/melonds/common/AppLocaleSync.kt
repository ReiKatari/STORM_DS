package me.magnum.melonds.common

import android.content.Context
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import androidx.preference.PreferenceManager

object AppLocaleSync {
    const val PREF_APP_LANGUAGE = "app_language"
    const val VALUE_DEFAULT = "default"

    fun syncFromPreferences(context: Context) {
        val langTag = PreferenceManager.getDefaultSharedPreferences(context)
            .getString(PREF_APP_LANGUAGE, VALUE_DEFAULT)
            ?: VALUE_DEFAULT
        applyLanguageTag(langTag)
    }

    fun applyLanguageTag(langTag: String?) {
        val normalized = langTag?.takeIf { it.isNotBlank() } ?: VALUE_DEFAULT
        val locales = if (normalized == VALUE_DEFAULT) {
            LocaleListCompat.getEmptyLocaleList()
        } else {
            LocaleListCompat.forLanguageTags(normalized)
        }
        val applyBlock = {
            if (AppCompatDelegate.getApplicationLocales() != locales) {
                AppCompatDelegate.setApplicationLocales(locales)
            }
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            applyBlock()
        } else {
            Handler(Looper.getMainLooper()).post(applyBlock)
        }
    }
}
