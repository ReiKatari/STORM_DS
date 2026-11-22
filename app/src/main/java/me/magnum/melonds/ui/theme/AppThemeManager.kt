package me.magnum.melonds.ui.theme

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Configuration
import android.graphics.Color
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.toArgb
import androidx.preference.PreferenceManager
import me.magnum.melonds.ui.Theme

object AppThemeManager {
    const val DEFAULT_ACCENT_KEY = "theme_default"
    private const val PREF_MIGRATED_ACCENT_V811 = "pref_migrated_theme_default_accent_v811"

    val themeState = mutableStateOf(Theme.DARK)
    val accentColorState = mutableStateOf(DEFAULT_ACCENT_KEY)
    val cardStyleState = mutableStateOf("glassmorphism")

    private var prefChangeListener: SharedPreferences.OnSharedPreferenceChangeListener? = null
    private val accentChangeListeners = mutableListOf<(String) -> Unit>()

    val currentTheme: Theme
        get() = themeState.value

    fun applyNightMode(theme: Theme) {
        val update = Runnable {
            if (AppCompatDelegate.getDefaultNightMode() != theme.nightMode) {
                AppCompatDelegate.setDefaultNightMode(theme.nightMode)
            }
        }
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            update.run()
        } else {
            android.os.Handler(android.os.Looper.getMainLooper()).post(update)
        }
    }

    fun init(context: Context) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        if (!prefs.getBoolean(PREF_MIGRATED_ACCENT_V811, false)) {
            val savedAccent = prefs.getString("theme_accent_color", null)
            val editor = prefs.edit().putBoolean(PREF_MIGRATED_ACCENT_V811, true)
            if (savedAccent.isNullOrBlank() || savedAccent == "electric_cyan") {
                editor.putString("theme_accent_color", DEFAULT_ACCENT_KEY)
            }
            editor.apply()
        }

        val themeKey = prefs.getString("theme", "dark") ?: "dark"
        val resolvedTheme = Theme.fromPreference(themeKey)
        themeState.value = resolvedTheme
        applyNightMode(resolvedTheme)
        accentColorState.value = prefs.getString("theme_accent_color", DEFAULT_ACCENT_KEY) ?: DEFAULT_ACCENT_KEY
        cardStyleState.value = prefs.getString("rom_card_style", "glassmorphism") ?: "glassmorphism"

        if (prefChangeListener == null) {
            val listener = SharedPreferences.OnSharedPreferenceChangeListener { sp: SharedPreferences, key: String? ->
                when (key) {
                    "theme" -> {
                        val newKey = sp.getString("theme", "dark") ?: "dark"
                        val newTheme = Theme.fromPreference(newKey)
                        themeState.value = newTheme
                        applyNightMode(newTheme)
                        accentChangeListeners.toList().forEach { it.invoke(accentColorState.value) }
                    }
                    "theme_accent_color" -> {
                        val newAccent = sp.getString("theme_accent_color", DEFAULT_ACCENT_KEY) ?: DEFAULT_ACCENT_KEY
                        accentColorState.value = newAccent
                        accentChangeListeners.toList().forEach { it.invoke(newAccent) }
                    }
                    "rom_card_style" -> {
                        cardStyleState.value = sp.getString("rom_card_style", "glassmorphism") ?: "glassmorphism"
                    }
                }
            }
            prefChangeListener = listener
            prefs.registerOnSharedPreferenceChangeListener(listener)
        }
    }

    fun addAccentChangeListener(listener: (String) -> Unit) {
        if (!accentChangeListeners.contains(listener)) {
            accentChangeListeners.add(listener)
        }
    }

    fun removeAccentChangeListener(listener: (String) -> Unit) {
        accentChangeListeners.remove(listener)
    }

    fun isDarkTheme(context: Context? = null): Boolean {
        val theme = themeState.value
        return when (theme) {
            Theme.LIGHT, Theme.SAKURA -> false
            Theme.DARK, Theme.MIDNIGHT, Theme.CYBERPUNK, Theme.GOTHIC, Theme.MATRIX, Theme.SOLAR -> true
            Theme.SYSTEM -> {
                if (context != null) {
                    (context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
                } else {
                    true
                }
            }
        }
    }

    fun getCurrentWatermelonColors(context: Context? = null): WatermelonColors {
        val systemDark = if (context != null) {
            (context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
        } else {
            true
        }
        val base = baseWatermelonColorsFor(themeState.value, systemDark)
        return getCustomizedAccentColors(base, accentColorState.value)
    }

    fun getAccentColor(accentKey: String = accentColorState.value, isDark: Boolean = isDarkTheme()): Int {
        val custom = resolveCustomAccentColor(accentKey, isDark)
        if (custom != null) {
            return custom.toArgb()
        }
        return baseWatermelonColorsFor(themeState.value, isDark).green.toArgb()
    }

    fun getAccentColor(context: Context, accentKey: String = accentColorState.value): Int {
        return getAccentColor(accentKey, isDarkTheme(context))
    }

    fun applyEdgeToEdgeTheme(activity: ComponentActivity) {
        init(activity)
        activity.setTheme(currentTheme.getThemeResId())
        val isLight = !isDarkTheme(activity)
        if (isLight) {
            activity.enableEdgeToEdge(
                statusBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT),
                navigationBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT),
            )
        } else {
            activity.enableEdgeToEdge(
                statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT),
                navigationBarStyle = SystemBarStyle.dark(Color.TRANSPARENT),
            )
        }
    }

    fun updateTheme(context: Context, themeKey: String) {
        val theme = Theme.fromPreference(themeKey)
        themeState.value = theme
        accentColorState.value = DEFAULT_ACCENT_KEY
        applyNightMode(theme)
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit()
            .putString("theme", themeKey)
            .putString("theme_accent_color", DEFAULT_ACCENT_KEY)
            .apply()
        accentChangeListeners.toList().forEach { it.invoke(DEFAULT_ACCENT_KEY) }
    }
}
