package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.lifecycle.Lifecycle
import androidx.preference.Preference
import androidx.preference.PreferenceManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.SettingsActivity

@AndroidEntryPoint
class MainPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    override fun getTitle() = getString(R.string.settings)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_main, rootKey)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.settings_main_menu, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                if (menuItem.itemId == R.id.action_search_settings) {
                    (activity as? SettingsActivity)?.openSearchDialog()
                    return true
                }
                return false
            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)
    }

    override fun onResume() {
        super.onResume()
        updateDynamicSummaries()
    }

    private fun updateDynamicSummaries() {
        val prefs = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val isRu = me.magnum.melonds.utils.RussianPlurals.isRussian(resources)

        // 1. General
        findPreference<Preference>("settings_home_general")?.let { pref ->
            val theme = prefs.getString("theme", "dark") ?: "dark"
            val accent = prefs.getString("theme_accent_color", "electric_cyan") ?: "electric_cyan"
            val themeValues = runCatching { resources.getStringArray(R.array.theme_values) }.getOrNull()
            val themeOptions = runCatching { resources.getStringArray(R.array.theme_options) }.getOrNull()
            val themeIdx = themeValues?.indexOfFirst { it.equals(theme, ignoreCase = true) } ?: -1
            val formattedTheme = if (themeIdx >= 0 && themeOptions != null && themeIdx < themeOptions.size) {
                themeOptions[themeIdx]
            } else {
                theme.replaceFirstChar { it.uppercase() }
            }
            val formattedAccent = accent.replace('_', ' ').split(' ').joinToString(" ") { it.replaceFirstChar { c -> c.uppercase() } }
            pref.summary = "$formattedTheme, $formattedAccent"
        }

        // 2. ROMs
        findPreference<Preference>("settings_home_roms")?.let { pref ->
            val dirs = prefs.getStringSet("rom_search_dirs", emptySet()) ?: emptySet()
            val viewMode = prefs.getString("rom_view_mode", "grid") ?: "grid"
            val modeStr = if (isRu) (if (viewMode == "grid") "Сетка" else "Список") else (if (viewMode == "grid") "Grid" else "List")
            pref.summary = if (dirs.isNotEmpty()) {
                val count = dirs.size
                val foldersStr = if (isRu) {
                    me.magnum.melonds.utils.RussianPlurals.format(count, "папка", "папки", "папок")
                } else {
                    resources.getQuantityString(R.plurals.v780_rom_folders_count, count, count)
                }
                "$foldersStr, $modeStr"
            } else {
                modeStr
            }
        }

        // 3. Save files
        val savePref = findPreference<Preference>("settings_home_save_files") ?: findPreference("settings_home_saves")
        savePref?.let { pref ->
            val autoSave = prefs.getBoolean("auto_save_state_on_exit", false)
            val autoLoad = prefs.getBoolean("auto_load_state_on_launch", false)
            pref.summary = when {
                autoSave && autoLoad -> if (isRu) "Автосохранение и автозагрузка" else "Auto-save and auto-load"
                autoSave -> if (isRu) "Автосохранение при выходе" else "Auto-save on exit"
                else -> if (isRu) "Стандартное сохранение" else "Standard saving"
            }
        }

        // 4. System
        findPreference<Preference>("settings_home_system")?.let { pref ->
            val compilerEnabled = prefs.getBoolean("enable_storm_compiler", true)
            val overclock = prefs.getString("arm9_overclock", "1") ?: "1"
            pref.summary = "STORM Compiler: ${if (compilerEnabled) (if (isRu) "Вкл" else "On") else (if (isRu) "Выкл" else "Off")}, CPU: ${overclock}x"
        }

        // 5. Video
        findPreference<Preference>("settings_home_video")?.let { pref ->
            val renderer = prefs.getString("video_renderer", "opengl") ?: "opengl"
            val resolution = prefs.getString("video_internal_resolution", "1") ?: "1"
            val rendererName = when (renderer.lowercase()) {
                "vulkan" -> "Vulkan"
                "software" -> "Software"
                else -> "OpenGL"
            }
            pref.summary = "$rendererName, ${resolution}x"
        }

        // 6. Audio
        findPreference<Preference>("settings_home_audio")?.let { pref ->
            val enabled = prefs.getBoolean("sound_enabled", true)
            val volume = prefs.getInt("volume", 100)
            pref.summary = if (!enabled) (if (isRu) "Отключен" else "Disabled") else "${if (isRu) "Громкость" else "Volume"}: $volume%"
        }

        // 7. Input
        findPreference<Preference>("settings_home_input")?.let { pref ->
            val haptic = prefs.getBoolean("input_touch_haptic_feedback_enabled", false)
            val opacity = prefs.getInt("input_opacity", 100)
            pref.summary = "${if (isRu) "Сенсор" else "Touch"}: $opacity%${if (haptic) (if (isRu) ", отклик" else ", haptic") else ""}"
        }

        // 8. RetroAchievements
        findPreference<Preference>("settings_home_retroachievements")?.let { pref ->
            val enabled = prefs.getBoolean("ra_enabled", false)
            val username = prefs.getString("ra_username", "") ?: ""
            val hardcore = prefs.getBoolean("ra_hardcore_enabled", false)
            pref.summary = if (enabled && username.isNotEmpty()) {
                "$username${if (hardcore) (if (isRu) " (Хардкор)" else " (Hardcore)") else ""}"
            } else if (enabled) {
                if (isRu) "Включено" else "Enabled"
            } else {
                if (isRu) "Не подключено" else "Not connected"
            }
        }

        // 9. Translator
        findPreference<Preference>("settings_home_translator")?.let { pref ->
            val enabled = prefs.getBoolean("translator_enabled", false)
            val targetLang = prefs.getString("translator_target_lang", "ru")?.uppercase() ?: "RU"
            pref.summary = if (enabled) "${if (isRu) "Включен" else "Enabled"} (→ $targetLang)" else (if (isRu) "Отключен" else "Disabled")
        }

        // 10. About
        findPreference<Preference>("settings_home_about")?.let { pref ->
            val vName = (runCatching { requireContext().packageManager.getPackageInfo(requireContext().packageName, 0).versionName }.getOrNull() ?: "7.9.1").removePrefix("v").removePrefix("V")
            pref.summary = "STORM DS $vName"
        }
    }

    override fun onCreateRecyclerView(inflater: LayoutInflater, parent: ViewGroup, savedInstanceState: Bundle?): RecyclerView {
        val recyclerView = super.onCreateRecyclerView(inflater, parent, savedInstanceState)
        if (resources.configuration.screenWidthDp >= 600) {
            recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        }
        return recyclerView
    }
}
