package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceManager
import androidx.preference.SwitchPreference
import com.smp.masterswitchpreference.MasterSwitchPreference
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.extensions.isSustainedPerformanceModeAvailable
import me.magnum.melonds.impl.SettingsBackupManager
import me.magnum.melonds.ui.settings.PreferenceFragmentHelper
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import javax.inject.Inject

@AndroidEntryPoint
class GeneralPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private val helper by lazy { PreferenceFragmentHelper(this, uriPermissionManager, directoryAccessValidator) }
    @Inject lateinit var uriPermissionManager: UriPermissionManager
    @Inject lateinit var directoryAccessValidator: DirectoryAccessValidator
    @Inject lateinit var settingsBackupManager: SettingsBackupManager

    private var rewindPreference: Preference? = null
    private lateinit var frameLimitSpeedPreference: ListPreference

    private val backupLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.backup(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.settings_backup_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(requireContext(), R.string.settings_backup_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    private val restoreLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.restore(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.settings_restore_success)
                                .setPositiveButton(android.R.string.ok) { _, _ ->
                                    activity?.recreate()
                                }
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(requireContext(), R.string.settings_restore_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    private val exportJsonLauncher = registerForActivityResult(ActivityResultContracts.CreateDocument("application/json")) { uri ->
        if (uri != null) {
            exportSettingsToJson(uri)
        }
    }

    private val importJsonLauncher = registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        if (uri != null) {
            importSettingsFromJson(uri)
        }
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        runCatching { setPreferencesFromResource(R.xml.pref_general, rootKey) }
        runCatching { addPreferencesFromResource(R.xml.pref_general_updates) }

        findPreference<Preference>("settings_export_json")?.setOnPreferenceClickListener {
            val dateStr = java.text.SimpleDateFormat("yyyyMMdd_HHmmss", java.util.Locale.US).format(java.util.Date())
            exportJsonLauncher.launch("storm_ds_settings_$dateStr.json")
            true
        }

        findPreference<Preference>("settings_import_json")?.setOnPreferenceClickListener {
            importJsonLauncher.launch(arrayOf("application/json", "text/*"))
            true
        }

        findPreference<Preference>("settings_reset_defaults")?.setOnPreferenceClickListener {
            showResetDefaultsConfirmationDialog()
            true
        }

        findPreference<Preference>("enable_rewind")?.let { pref ->
            rewindPreference = pref
            pref.setOnPreferenceClickListener {
                me.magnum.melonds.ui.settings.dialogs.showSettingsRewindDialog(requireContext()) {
                    updateRewindSummary()
                }
                true
            }
            updateRewindSummary()
        }
        findPreference<ListPreference>("frame_limit_speed_multiplier")?.let { pref ->
            frameLimitSpeedPreference = pref
            helper.bindPreferenceSummaryToValue(pref)
            pref.sharedPreferences?.registerOnSharedPreferenceChangeListener(sharedPreferenceChangeListener)
        }
        findPreference<SwitchPreference>("enable_sustained_performance")?.let { pref ->
            pref.isVisible = requireContext().isSustainedPerformanceModeAvailable()
        }

        val themePreference = findPreference<ListPreference>("theme")
        if (themePreference != null) {
            helper.bindPreferenceSummaryToValue(themePreference)
            themePreference.setOnPreferenceChangeListener { _, newValue ->
                me.magnum.melonds.ui.theme.AppThemeManager.updateTheme(requireContext(), newValue as String)
                activity?.recreate()
                true
            }
        }

        val accentPreference = findPreference<ListPreference>("theme_accent_color")
        if (accentPreference != null) {
            if (accentPreference.value.isNullOrEmpty()) {
                accentPreference.value = "electric_cyan"
            }
            helper.bindPreferenceSummaryToValue(accentPreference)
            accentPreference.setOnPreferenceChangeListener { _, newValue ->
                val newAccent = newValue as String
                me.magnum.melonds.ui.theme.AppThemeManager.accentColorState.value = newAccent
                accentPreference.sharedPreferences?.edit()?.putString("theme_accent_color", newAccent)?.apply()
                view?.post { applyAccentColorToViews() }
                activity?.recreate()
                true
            }
        }

        val cardStylePreference = findPreference<ListPreference>("rom_card_style")
        if (cardStylePreference != null) {
            helper.bindPreferenceSummaryToValue(cardStylePreference)
            cardStylePreference.setOnPreferenceChangeListener { _, newValue ->
                val newStyle = newValue as String
                me.magnum.melonds.ui.theme.AppThemeManager.cardStyleState.value = newStyle
                cardStylePreference.sharedPreferences?.edit()?.putString("rom_card_style", newStyle)?.apply()
                true
            }
        }

        updateFrameLimitSpeedPreferenceState()

        findPreference<Preference>("import_storm_folder_settings")?.setOnPreferenceClickListener {
            lifecycleScope.launch(Dispatchers.IO) {
                val imported = runCatching { settingsBackupManager.syncExternalSettingsIfModified(force = true) }.getOrDefault(false)
                withContext(Dispatchers.Main) {
                    if (imported) {
                        AlertDialog.Builder(requireContext())
                            .setMessage(R.string.settings_restore_success)
                            .setPositiveButton(android.R.string.ok) { _, _ ->
                                activity?.recreate()
                            }
                            .show()
                    } else {
                        Toast.makeText(requireContext(), R.string.settings_restore_error, Toast.LENGTH_SHORT).show()
                    }
                }
            }
            true
        }
        findPreference<Preference>("manage_setting_snapshots")?.setOnPreferenceClickListener {
            showSnapshotsDialog()
            true
        }
        findPreference<Preference>("export_import_stormlayout")?.setOnPreferenceClickListener {
            showStormLayoutDialog()
            true
        }
        findPreference<Preference>("backup_settings")?.setOnPreferenceClickListener {
            backupLauncher.launch(null)
            true
        }
        findPreference<Preference>("restore_settings")?.setOnPreferenceClickListener {
            restoreLauncher.launch(null)
            true
        }
    }

    private fun showSnapshotsDialog() {
        val isRu = java.util.Locale.getDefault().language.startsWith("ru")
        lifecycleScope.launch(Dispatchers.IO) {
            val snapshots = settingsBackupManager.listSnapshots()
            withContext(Dispatchers.Main) {
                val createLabel = if (isRu) "➕ Создать снимок настроек сейчас" else "➕ Create settings snapshot now"
                val items = mutableListOf(createLabel)
                snapshots.forEach { snap ->
                    val reasonLabel = when (snap.reason) {
                        "auto" -> if (isRu) "Авто перед импортом" else "Auto before import"
                        else -> if (isRu) "Вручную" else "Manual"
                    }
                    items.add("📦 ${snap.displayDate} — $reasonLabel")
                }

                AlertDialog.Builder(requireContext())
                    .setTitle(R.string.manage_setting_snapshots)
                    .setItems(items.toTypedArray()) { _, which ->
                        if (which == 0) {
                            lifecycleScope.launch(Dispatchers.IO) {
                                val created = settingsBackupManager.createSnapshot("manual")
                                withContext(Dispatchers.Main) {
                                    val msg = if (created != null) {
                                        if (isRu) "Снимок сохранён: ${created.displayDate}" else "Snapshot saved: ${created.displayDate}"
                                    } else {
                                        getString(R.string.settings_backup_error)
                                    }
                                    Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                                }
                            }
                        } else {
                            val selected = snapshots.getOrNull(which - 1) ?: return@setItems
                            lifecycleScope.launch(Dispatchers.IO) {
                                val ok = settingsBackupManager.restoreSnapshot(selected)
                                withContext(Dispatchers.Main) {
                                    if (ok) {
                                        AlertDialog.Builder(requireContext())
                                            .setMessage(R.string.settings_restore_success)
                                            .setPositiveButton(android.R.string.ok) { _, _ ->
                                                activity?.recreate()
                                            }
                                            .show()
                                    } else {
                                        Toast.makeText(requireContext(), R.string.settings_restore_error, Toast.LENGTH_SHORT).show()
                                    }
                                }
                            }
                        }
                    }
                    .setNegativeButton(android.R.string.cancel, null)
                    .show()
            }
        }
    }

    private fun showStormLayoutDialog() {
        val isRu = java.util.Locale.getDefault().language.startsWith("ru")
        val options = if (isRu) {
            arrayOf(
                "📤 Экспортировать раскладки (layouts_backup.stormlayout)",
                "📥 Импортировать раскладки (.stormlayout / layouts.json)"
            )
        } else {
            arrayOf(
                "📤 Export layouts (layouts_backup.stormlayout)",
                "📥 Import layouts (.stormlayout / layouts.json)"
            )
        }
        AlertDialog.Builder(requireContext())
            .setTitle(R.string.export_import_stormlayout)
            .setItems(options) { _, which ->
                if (which == 0) {
                    lifecycleScope.launch(Dispatchers.IO) {
                        val exported = settingsBackupManager.exportLayoutsToStormFolder()
                        withContext(Dispatchers.Main) {
                            val msg = if (exported != null) {
                                if (isRu) "Раскладки сохранены: ${exported.name}" else "Layouts exported: ${exported.name}"
                            } else {
                                getString(R.string.settings_backup_error)
                            }
                            Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    lifecycleScope.launch(Dispatchers.IO) {
                        val count = settingsBackupManager.importLayoutsFromStormFolder()
                        withContext(Dispatchers.Main) {
                            if (count >= 0) {
                                val msg = if (isRu) "Импортировано раскладок: $count" else "Imported layouts: $count"
                                Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
                                activity?.recreate()
                            } else {
                                Toast.makeText(requireContext(), R.string.settings_restore_error, Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                }
            }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    override fun onResume() {
        super.onResume()
        updateRewindSummary()
        updateFrameLimitSpeedPreferenceState()
    }

    private fun updateRewindSummary() {
        val pref = rewindPreference ?: return
        val sp = androidx.preference.PreferenceManager.getDefaultSharedPreferences(requireContext())
        val isEnabled = sp.getBoolean("enable_rewind", false)
        val period = sp.getInt("rewind_period", 10)
        val window = sp.getInt("rewind_window", 6) * 10
        pref.summary = if (isEnabled) {
            "Включено (Интервал: ${period}с, Буфер: ${window}с)"
        } else {
            "Отключено"
        }
    }

    override fun onDestroy() {
        if (::frameLimitSpeedPreference.isInitialized) {
            frameLimitSpeedPreference.sharedPreferences?.unregisterOnSharedPreferenceChangeListener(sharedPreferenceChangeListener)
        }
        super.onDestroy()
    }

    override fun getTitle() = getString(R.string.category_general)

    private val sharedPreferenceChangeListener = android.content.SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
        if (::frameLimitSpeedPreference.isInitialized && (key == "ra_hardcore_enabled" || key == frameLimitSpeedPreference.key)) {
            updateFrameLimitSpeedPreferenceState()
        }
    }

    private fun updateFrameLimitSpeedPreferenceState() {
        if (!::frameLimitSpeedPreference.isInitialized) return
        val preferences = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val hardcoreEnabled = preferences.getBoolean("ra_hardcore_enabled", false)
        frameLimitSpeedPreference.isVisible = !hardcoreEnabled
        if (!hardcoreEnabled) {
            frameLimitSpeedPreference.summary = frameLimitSpeedPreference.entry ?: getString(R.string.not_set)
        }
    }
    private fun exportSettingsToJson(uri: android.net.Uri) {
        lifecycleScope.launch(Dispatchers.IO) {
            val result = runCatching {
                val prefs = PreferenceManager.getDefaultSharedPreferences(requireContext())
                val all = prefs.all
                val sensitiveKeys = listOf("token", "ra_token", "password", "cookie", "secret", "auth")

                val rootJson = org.json.JSONObject()
                rootJson.put("app", "STORM DS")
                val vName = (runCatching { requireContext().packageManager.getPackageInfo(requireContext().packageName, 0).versionName }.getOrNull() ?: "7.9.1").removePrefix("v").removePrefix("V")
                rootJson.put("version", vName)
                rootJson.put("timestamp", System.currentTimeMillis())

                val itemsJson = org.json.JSONObject()
                for ((key, value) in all) {
                    val lowerKey = key.lowercase()
                    if (sensitiveKeys.any { lowerKey.contains(it) }) continue
                    if (value == null) continue

                    val entryObj = org.json.JSONObject()
                    when (value) {
                        is Boolean -> {
                            entryObj.put("type", "Boolean")
                            entryObj.put("value", value)
                        }
                        is Int -> {
                            entryObj.put("type", "Int")
                            entryObj.put("value", value)
                        }
                        is Long -> {
                            entryObj.put("type", "Long")
                            entryObj.put("value", value)
                        }
                        is Float -> {
                            entryObj.put("type", "Float")
                            entryObj.put("value", value.toDouble())
                        }
                        is String -> {
                            entryObj.put("type", "String")
                            entryObj.put("value", value)
                        }
                        is Set<*> -> {
                            entryObj.put("type", "StringSet")
                            val array = org.json.JSONArray()
                            for (item in value) {
                                if (item is String) array.put(item)
                            }
                            entryObj.put("value", array)
                        }
                        else -> continue
                    }
                    itemsJson.put(key, entryObj)
                }
                rootJson.put("preferences", itemsJson)

                requireContext().contentResolver.openOutputStream(uri)?.use { os ->
                    os.write(rootJson.toString(2).toByteArray(Charsets.UTF_8))
                } ?: throw java.io.IOException("Cannot open output stream")
                itemsJson.length()
            }

            withContext(Dispatchers.Main) {
                result.onSuccess {
                    Toast.makeText(requireContext(), getString(R.string.v780_settings_export_success), Toast.LENGTH_SHORT).show()
                }.onFailure {
                    Toast.makeText(requireContext(), getString(R.string.v780_settings_export_error), Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun importSettingsFromJson(uri: android.net.Uri) {
        lifecycleScope.launch(Dispatchers.IO) {
            val result = runCatching {
                val jsonText = requireContext().contentResolver.openInputStream(uri)?.use { ins ->
                    ins.bufferedReader(Charsets.UTF_8).readText()
                } ?: throw java.io.IOException("Cannot open input stream")

                val rootJson = org.json.JSONObject(jsonText)
                val prefsJson = if (rootJson.has("preferences")) rootJson.getJSONObject("preferences") else rootJson

                val prefs = PreferenceManager.getDefaultSharedPreferences(requireContext())
                val editor = prefs.edit()
                var appliedCount = 0

                val sensitiveKeys = listOf("token", "ra_token", "password", "cookie", "secret", "auth")

                val keys = prefsJson.keys()
                while (keys.hasNext()) {
                    val key = keys.next()
                    val lowerKey = key.lowercase()
                    if (sensitiveKeys.any { lowerKey.contains(it) }) continue
                    if (key == "app" || key == "version" || key == "timestamp") continue

                    val objOrVal = prefsJson.get(key)
                    if (objOrVal is org.json.JSONObject && objOrVal.has("type") && objOrVal.has("value")) {
                        val type = objOrVal.getString("type")
                        when (type) {
                            "Boolean" -> {
                                editor.putBoolean(key, objOrVal.getBoolean("value"))
                                appliedCount++
                            }
                            "Int" -> {
                                editor.putInt(key, objOrVal.getInt("value"))
                                appliedCount++
                            }
                            "Long" -> {
                                editor.putLong(key, objOrVal.getLong("value"))
                                appliedCount++
                            }
                            "Float" -> {
                                editor.putFloat(key, objOrVal.getDouble("value").toFloat())
                                appliedCount++
                            }
                            "String" -> {
                                editor.putString(key, objOrVal.getString("value"))
                                appliedCount++
                            }
                            "StringSet" -> {
                                val arr = objOrVal.getJSONArray("value")
                                val set = mutableSetOf<String>()
                                for (i in 0 until arr.length()) {
                                    set.add(arr.getString(i))
                                }
                                editor.putStringSet(key, set)
                                appliedCount++
                            }
                        }
                    } else {
                        when (objOrVal) {
                            is Boolean -> {
                                editor.putBoolean(key, objOrVal)
                                appliedCount++
                            }
                            is Int -> {
                                editor.putInt(key, objOrVal)
                                appliedCount++
                            }
                            is Long -> {
                                editor.putLong(key, objOrVal)
                                appliedCount++
                            }
                            is Double -> {
                                editor.putFloat(key, objOrVal.toFloat())
                                appliedCount++
                            }
                            is String -> {
                                editor.putString(key, objOrVal)
                                appliedCount++
                            }
                            is org.json.JSONArray -> {
                                val set = mutableSetOf<String>()
                                for (i in 0 until objOrVal.length()) {
                                    set.add(objOrVal.getString(i))
                                }
                                editor.putStringSet(key, set)
                                appliedCount++
                            }
                        }
                    }
                }
                editor.apply()
                appliedCount
            }

            withContext(Dispatchers.Main) {
                result.onSuccess { count ->
                    AlertDialog.Builder(requireContext())
                        .setTitle(R.string.v780_settings_maintenance_title)
                        .setMessage(getString(R.string.v780_settings_import_success, count))
                        .setPositiveButton(android.R.string.ok) { _, _ ->
                            activity?.recreate()
                        }
                        .show()
                }.onFailure {
                    Toast.makeText(requireContext(), getString(R.string.v780_settings_import_error), Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun showResetDefaultsConfirmationDialog() {
        AlertDialog.Builder(requireContext())
            .setTitle(R.string.v780_settings_reset_confirm_title)
            .setMessage(R.string.v780_settings_reset_confirm_message)
            .setPositiveButton(R.string.v780_settings_reset_defaults_title) { _, _ ->
                resetMainSettingsToDefaults()
            }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    private fun resetMainSettingsToDefaults() {
        val prefs = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val preserved = mutableMapOf<String, Any?>()
        val all = prefs.all

        val preservePrefixes = listOf("ra_", "rom_search_dirs", "sram_dir", "save_state_location", "save_state_custom_dir", "bios_dir", "dsi_bios_dir", "dsi_sd_card_dir", "dsi_nand_dir")

        for ((key, value) in all) {
            if (preservePrefixes.any { key.startsWith(it) || key == it }) {
                preserved[key] = value
            }
        }

        val editor = prefs.edit()
        editor.clear()

        for ((key, value) in preserved) {
            when (value) {
                is Boolean -> editor.putBoolean(key, value)
                is Int -> editor.putInt(key, value)
                is Long -> editor.putLong(key, value)
                is Float -> editor.putFloat(key, value)
                is String -> editor.putString(key, value)
                is Set<*> -> {
                    @Suppress("UNCHECKED_CAST")
                    editor.putStringSet(key, value as Set<String>)
                }
            }
        }
        editor.putBoolean("enable_storm_compiler", true)
        editor.apply()

        Toast.makeText(requireContext(), getString(R.string.v780_settings_reset_defaults_title), Toast.LENGTH_SHORT).show()
        activity?.recreate()
    }
}