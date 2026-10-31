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
        val context = requireContext()
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val isRu = me.magnum.melonds.utils.RussianPlurals.isRussian(resources)

        // 1. General (active theme, language, ROM folders, autosave and submenu customizer status)
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

            val store = me.magnum.melonds.ui.emulator.rom.PauseMenuCustomizationStore(context)
            val customOrderActive = store.getCustomOrder().isNotEmpty()
            val hiddenCount = store.getHiddenItems().size
            val pauseStatus = if (isRu) {
                if (customOrderActive || hiddenCount > 0) "Подменю: настроено" else "Подменю: стандарт"
            } else {
                if (customOrderActive || hiddenCount > 0) "Submenu: custom" else "Submenu: default"
            }

            pref.summary = "$formattedTheme • $formattedAccent • $pauseStatus"
        }

        // 2. ROMs
        findPreference<Preference>("settings_home_roms")?.let { pref ->
            val dirs = prefs.getStringSet("rom_search_dirs", emptySet()) ?: emptySet()
            val viewMode = prefs.getString("rom_view_mode", "grid") ?: "grid"
            val modeStr = if (isRu) (if (viewMode == "grid") "Сетка" else "Список") else (if (viewMode == "grid") "Grid" else "List")
            val cardStyle = prefs.getString("rom_card_style", "glassmorphism") ?: "glassmorphism"
            val styleStr = cardStyle.replaceFirstChar { it.uppercase() }
            pref.summary = if (dirs.isNotEmpty()) {
                val count = dirs.size
                val foldersStr = if (isRu) {
                    me.magnum.melonds.utils.RussianPlurals.format(count, "папка", "папки", "папок")
                } else {
                    resources.getQuantityString(R.plurals.v780_rom_folders_count, count, count)
                }
                "$foldersStr • $modeStr • $styleStr"
            } else {
                "$modeStr • $styleStr"
            }
        }

        // 3. Save files
        val savePref = findPreference<Preference>("settings_home_save_files") ?: findPreference("settings_home_saves")
        savePref?.let { pref ->
            val autoSave = prefs.getBoolean("auto_save_state_on_exit", false)
            val autoLoad = prefs.getBoolean("auto_load_state_on_launch", false)
            val periodic = prefs.getBoolean("periodic_auto_save_enabled", false)
            val saveSummary = buildList {
                if (autoSave) add(if (isRu) "Автосохранение" else "Auto-save")
                if (autoLoad) add(if (isRu) "Автозагрузка" else "Auto-load")
                if (periodic) add(if (isRu) "Интервальное" else "Interval")
                if (isEmpty()) add(if (isRu) "Стандартный режим" else "Standard mode")
            }.joinToString(" • ")
            pref.summary = saveSummary
        }

        // 4. System (console type NDS/DSi, JIT status, custom BIOS status, overclock)
        findPreference<Preference>("settings_home_system")?.let { pref ->
            val compilerEnabled = prefs.getBoolean("enable_storm_compiler", true)
            val overclock = prefs.getString("arm9_overclock", "1") ?: "1"
            val customBios = prefs.getBoolean("enable_custom_bios_firmware", false)
            val jitStr = if (compilerEnabled) (if (isRu) "JIT: Вкл" else "JIT: On") else (if (isRu) "JIT: Выкл" else "JIT: Off")
            val biosStr = if (isRu) {
                if (customBios) "Пользовательский BIOS" else "Встроенный DraStic BIOS"
            } else {
                if (customBios) "Custom BIOS" else "Built-in DraStic BIOS"
            }
            pref.summary = "NDS/DSi • $jitStr • ${overclock}x • $biosStr"
        }

        // 5. Video (renderer, resolution scale, filtering, console skin)
        findPreference<Preference>("settings_home_video")?.let { pref ->
            val renderer = prefs.getString("video_renderer", "opengl") ?: "opengl"
            val resolution = prefs.getString("video_internal_resolution", "1") ?: "1"
            val rendererName = when (renderer.lowercase()) {
                "vulkan" -> "Vulkan"
                "software" -> "Software"
                else -> "OpenGL"
            }
            val filter = prefs.getString("video_filtering", "linear") ?: "linear"
            val filterName = filter.replaceFirstChar { it.uppercase() }
            val skinEnabled = prefs.getBoolean("video_console_skin_enabled", false)
            val skinStr = if (isRu) {
                if (skinEnabled) "Скин: Вкл" else "Скин: Выкл"
            } else {
                if (skinEnabled) "Skin: On" else "Skin: Off"
            }
            pref.summary = "$rendererName • ${resolution}x • $filterName • $skinStr"
        }

        // 6. Audio (volume, interpolation, latency, mic mode)
        findPreference<Preference>("settings_home_audio")?.let { pref ->
            val enabled = prefs.getBoolean("sound_enabled", true)
            val volume = prefs.getInt("volume", 100)
            val interpolation = prefs.getString("audio_interpolation", "linear") ?: "linear"
            val interpStr = interpolation.replaceFirstChar { it.uppercase() }
            val micSource = prefs.getString("mic_source", "connected_mic") ?: "connected_mic"
            val micStr = if (micSource == "blow_noise") (if (isRu) "Шум дуновения" else "Blow noise") else (if (isRu) "Микрофон" else "Microphone")
            pref.summary = if (!enabled) {
                if (isRu) "Отключен" else "Disabled"
            } else {
                "${if (isRu) "Громкость" else "Volume"}: $volume% • $interpStr • $micStr"
            }
        }

        // 7. Input (active layout, vibration, controller mapping)
        findPreference<Preference>("settings_home_input")?.let { pref ->
            val haptic = prefs.getBoolean("input_touch_haptic_feedback_enabled", false)
            val opacity = prefs.getInt("input_opacity", 100)
            val gyro = prefs.getBoolean("input_gyro_aiming_enabled", false)
            val hapticStr = if (isRu) {
                if (haptic) "Вибрация: Вкл" else "Вибрация: Выкл"
            } else {
                if (haptic) "Vibration: On" else "Vibration: Off"
            }
            val gyroStr = if (gyro) (if (isRu) "Гироскоп: Вкл" else "Gyro: On") else null
            val inputParts = listOfNotNull(
                "${if (isRu) "Сенсор" else "Touch"}: $opacity%",
                hapticStr,
                gyroStr
            )
            pref.summary = inputParts.joinToString(" • ")
        }

        // 8. RetroAchievements (account and Hardcore/Softcore status)
        findPreference<Preference>("settings_home_retroachievements")?.let { pref ->
            val enabled = prefs.getBoolean("ra_enabled", false)
            val username = prefs.getString("ra_username", "") ?: ""
            val hardcore = prefs.getBoolean("ra_hardcore_enabled", false)
            pref.summary = if (enabled && username.isNotEmpty()) {
                val mode = if (hardcore) (if (isRu) "Хардкор" else "Hardcore") else (if (isRu) "Софткор" else "Softcore")
                "$username • $mode • RA Online"
            } else if (enabled) {
                if (isRu) "Включено • Требуется вход" else "Enabled • Login required"
            } else {
                if (isRu) "Не подключено" else "Not connected"
            }
        }

        // 9. Cheats (cheat engine status + Jusrcheat: 4 079 игр)
        findPreference<Preference>("settings_home_cheats")?.let { pref ->
            val enabled = prefs.getBoolean("cheats_enabled", true)
            val statusStr = if (isRu) (if (enabled) "Чит-движок: Вкл" else "Чит-движок: Выкл") else (if (enabled) "Cheats: On" else "Cheats: Off")
            val dbStr = if (isRu) "Jusrcheat: 4 079 игр" else "Jusrcheat: 4,079 games"
            pref.summary = "$statusStr • $dbStr"
        }

        // 10. Translator (active OCR, LLM/Offline translator and TTS voice engine)
        findPreference<Preference>("settings_home_translator")?.let { pref ->
            val enabled = prefs.getBoolean("translator_enabled", false)
            val targetLang = prefs.getString("translator_target_lang", "ru")?.uppercase() ?: "RU"
            val engine = prefs.getString("translator_engine", "mlkit") ?: "mlkit"
            val engineName = when (engine.lowercase()) {
                "deepl" -> "DeepL"
                "custom_ai", "llm" -> "LLM / AI"
                else -> "ML Kit"
            }
            val tts = prefs.getBoolean("translator_tts_enabled", false)
            val ttsStr = if (tts) (if (isRu) "Озвучка: Вкл" else "TTS: On") else (if (isRu) "Озвучка: Выкл" else "TTS: Off")
            pref.summary = if (enabled) {
                "${if (isRu) "Включен" else "Enabled"} (→ $targetLang) • $engineName • $ttsStr"
            } else {
                if (isRu) "Отключен" else "Disabled"
            }
        }

        // 11. About (STORM DS 7.9.2 • Android version • CPU ABI • Device model • RAM)
        findPreference<Preference>("settings_home_about")?.let { pref ->
            val vName = (runCatching { context.packageManager.getPackageInfo(context.packageName, 0).versionName }.getOrNull() ?: "7.9.2")
                .removePrefix("v").removePrefix("V")
            val abi = android.os.Build.SUPPORTED_ABIS.firstOrNull() ?: "arm64-v8a"
            val model = "${android.os.Build.MANUFACTURER} ${android.os.Build.MODEL}".trim()

            val actManager = context.getSystemService(android.content.Context.ACTIVITY_SERVICE) as? android.app.ActivityManager
            val memInfo = android.app.ActivityManager.MemoryInfo()
            actManager?.getMemoryInfo(memInfo)
            val totalRamGb = memInfo.totalMem / (1024 * 1024 * 1024.0)
            val ramStr = String.format(java.util.Locale.US, "%.1f GB", totalRamGb)

            pref.summary = "STORM DS $vName • Android ${android.os.Build.VERSION.RELEASE} • $abi • $model • $ramStr"
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
