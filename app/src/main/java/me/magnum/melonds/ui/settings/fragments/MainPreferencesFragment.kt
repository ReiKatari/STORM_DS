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

    private fun getLocalizedEntry(value: String, valuesArrayRes: Int, optionsArrayRes: Int): String {
        val values = runCatching { resources.getStringArray(valuesArrayRes) }.getOrNull()
        val options = runCatching { resources.getStringArray(optionsArrayRes) }.getOrNull()
        if (values != null && options != null) {
            val idx = values.indexOfFirst { it.equals(value, ignoreCase = true) }
            if (idx in options.indices) {
                return options[idx]
            }
        }
        return value.replaceFirstChar { it.uppercase() }
    }

    private fun updateDynamicSummaries() {
        val context = requireContext()
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)

        // 1. General (active theme, language, ROM folders, autosave and submenu customizer status)
        findPreference<Preference>("settings_home_general")?.let { pref ->
            val theme = prefs.getString("theme", "dark") ?: "dark"
            val accent = prefs.getString("theme_accent_color", "electric_cyan") ?: "electric_cyan"
            val formattedTheme = getLocalizedEntry(theme, R.array.theme_values, R.array.theme_options)
            val formattedAccent = getLocalizedEntry(accent, R.array.theme_accent_color_values, R.array.theme_accent_color_options)

            val store = me.magnum.melonds.ui.emulator.rom.PauseMenuCustomizationStore(context)
            val customOrderActive = store.getCustomOrder().isNotEmpty()
            val hiddenCount = store.getHiddenItems().size
            val pauseStatus = getString(
                if (customOrderActive || hiddenCount > 0) R.string.v793_summary_submenu_custom
                else R.string.v793_summary_submenu_default
            )

            pref.summary = "$formattedTheme • $formattedAccent • $pauseStatus"
        }

        // 2. ROMs
        findPreference<Preference>("settings_home_roms")?.let { pref ->
            val dirs = prefs.getStringSet("rom_search_dirs", emptySet()) ?: emptySet()
            val viewMode = prefs.getString("rom_view_mode", "grid") ?: "grid"
            val modeStr = getString(if (viewMode == "grid") R.string.v793_view_mode_grid else R.string.v793_view_mode_list)
            val cardStyle = prefs.getString("rom_card_style", "glassmorphism") ?: "glassmorphism"
            val styleStr = getLocalizedEntry(cardStyle, R.array.rom_card_style_values, R.array.rom_card_style_options)
            pref.summary = if (dirs.isNotEmpty()) {
                val count = dirs.size
                val foldersStr = resources.getQuantityString(R.plurals.v780_rom_folders_count, count, count)
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
                if (autoSave) add(getString(R.string.v793_summary_autosave))
                if (autoLoad) add(getString(R.string.v793_summary_autoload))
                if (periodic) add(getString(R.string.v793_summary_interval_save))
                if (isEmpty()) add(getString(R.string.v793_summary_standard_mode))
            }.joinToString(" • ")
            pref.summary = saveSummary
        }

        // 4. System (console type NDS/DSi, JIT status, custom BIOS status, overclock)
        findPreference<Preference>("settings_home_system")?.let { pref ->
            val compilerEnabled = prefs.getBoolean("enable_storm_compiler", true)
            val overclock = prefs.getString("arm9_overclock", "1") ?: "1"
            val customBios = prefs.getBoolean("enable_custom_bios_firmware", false)
            val jitStr = "JIT: ${getString(if (compilerEnabled) R.string.on else R.string.off)}"
            val biosStr = getString(if (customBios) R.string.v793_summary_custom_bios else R.string.v793_summary_builtin_drastic_bios)
            pref.summary = "NDS/DSi • $jitStr • ${overclock}x • $biosStr"
        }

        // 5. Video (renderer, resolution scale, filtering, console skin)
        findPreference<Preference>("settings_home_video")?.let { pref ->
            val renderer = prefs.getString("video_renderer", "opengl") ?: "opengl"
            val resolution = prefs.getString("video_internal_resolution", "1") ?: "1"
            val rendererName = getLocalizedEntry(renderer, R.array.video_renderer_values, R.array.video_renderer_options)
            val filter = prefs.getString("video_filtering", "linear") ?: "linear"
            val filterLocalized = getLocalizedEntry(filter, R.array.video_filtering_values, R.array.video_filtering_options)
            val filterName = if (filter.equals("none", ignoreCase = true)) {
                "${getString(R.string.filter)}: $filterLocalized"
            } else {
                filterLocalized
            }
            val skinEnabled = prefs.getBoolean("video_console_skin_enabled", false)
            val skinStr = "${getString(R.string.v793_summary_skin)}: ${getString(if (skinEnabled) R.string.on else R.string.off)}"
            pref.summary = "$rendererName • ${resolution}x • $filterName • $skinStr"
        }

        // 6. Audio (volume, interpolation, latency, mic mode)
        findPreference<Preference>("settings_home_audio")?.let { pref ->
            val enabled = prefs.getBoolean("sound_enabled", true)
            if (!enabled) {
                pref.summary = getString(R.string.retro_achievements_disabled)
            } else {
                val volume = prefs.getInt("volume", 256).coerceIn(0, 512)
                val volumePercentage = kotlin.math.round(volume / 256f * 100f).toInt()
                val interpolation = prefs.getString("audio_interpolation", "none") ?: "none"
                val interpLocalized = getLocalizedEntry(interpolation, R.array.audio_interpolation_values, R.array.audio_interpolation_options)
                val interpStr = "${getString(R.string.audio_interpolation)}: $interpLocalized"
                val micSource = prefs.getString("mic_source", "device") ?: "device"
                val micLocalized = getLocalizedEntry(micSource, R.array.mic_source_values, R.array.mic_source_options)
                val micStr = if (micSource.equals("none", ignoreCase = true)) {
                    "${getString(R.string.microphone_source)}: $micLocalized"
                } else {
                    micLocalized
                }
                pref.summary = "${getString(R.string.volume)}: $volumePercentage% • $interpStr • $micStr"
            }
        }

        // 7. Input (active layout, vibration, controller mapping)
        findPreference<Preference>("settings_home_input")?.let { pref ->
            val haptic = prefs.getBoolean("input_touch_haptic_feedback_enabled", false)
            val opacity = prefs.getInt("input_opacity", 100)
            val gyro = prefs.getBoolean("input_gyro_aiming_enabled", false)
            val hapticStr = "${getString(R.string.v793_summary_vibration)}: ${getString(if (haptic) R.string.on else R.string.off)}"
            val gyroStr = if (gyro) "${getString(R.string.v793_summary_gyro)}: ${getString(R.string.on)}" else null
            val inputParts = listOfNotNull(
                "${getString(R.string.v793_summary_touch)}: $opacity%",
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
                val mode = getString(if (hardcore) R.string.ra_mode_hardcore else R.string.ra_mode_softcore)
                "$username • $mode • RA Online"
            } else if (enabled) {
                getString(R.string.v793_ra_login_required)
            } else {
                getString(R.string.v793_ra_not_connected)
            }
        }

        // 9. Cheats (cheat engine status + Jusrcheat: 4 079 игр)
        findPreference<Preference>("settings_home_cheats")?.let { pref ->
            val enabled = prefs.getBoolean("cheats_enabled", true)
            val statusStr = "${getString(R.string.v793_summary_cheat_engine)}: ${getString(if (enabled) R.string.on else R.string.off)}"
            val dbStr = getString(R.string.v793_summary_cheat_db)
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
            val ttsStr = "${getString(R.string.v793_summary_tts)}: ${getString(if (tts) R.string.on else R.string.off)}"
            pref.summary = if (enabled) {
                "${getString(R.string.v793_status_enabled)} (→ $targetLang) • $engineName • $ttsStr"
            } else {
                getString(R.string.retro_achievements_disabled)
            }
        }

        // 11. About (STORM DS 7.9.3 • Android version • CPU ABI • Device model • RAM)
        findPreference<Preference>("settings_home_about")?.let { pref ->
            val vName = (runCatching { context.packageManager.getPackageInfo(context.packageName, 0).versionName }.getOrNull() ?: "7.9.3")
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
