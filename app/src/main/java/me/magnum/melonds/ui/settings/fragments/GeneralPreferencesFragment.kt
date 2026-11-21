package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.History
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
import me.magnum.melonds.extensions.addOnPreferenceChangeListener
import me.magnum.melonds.extensions.isSustainedPerformanceModeAvailable
import me.magnum.melonds.impl.SettingsBackupManager
import me.magnum.melonds.ui.settings.PreferenceFragmentHelper
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.dialogs.SettingsChoiceDialogContent
import me.magnum.melonds.ui.settings.dialogs.SettingsConfirmDialogContent
import me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog
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
                            if (!isAdded) return@withContext
                            val ctx = context ?: return@withContext
                            AlertDialog.Builder(ctx)
                                .setMessage(R.string.settings_backup_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            val ctx = context ?: return@withContext
                            Toast.makeText(ctx, R.string.settings_backup_error, Toast.LENGTH_SHORT).show()
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
                            if (!isAdded) return@withContext
                            val ctx = context ?: return@withContext
                            AlertDialog.Builder(ctx)
                                .setMessage(R.string.settings_restore_success)
                                .setPositiveButton(android.R.string.ok) { _, _ ->
                                    activity?.recreate()
                                }
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            val ctx = context ?: return@withContext
                            Toast.makeText(ctx, R.string.settings_restore_error, Toast.LENGTH_SHORT).show()
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
        hideDependentsWhenInactive("github_check_for_updates", "github_update_channel")

        findPreference<Preference>("manual_check_updates")?.setOnPreferenceClickListener {
            me.magnum.melonds.ui.settings.ManualUpdateChecker.checkNow(requireContext())
            true
        }

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

        val accentPreference = findPreference<ListPreference>("theme_accent_color")
        if (accentPreference != null) {
            if (accentPreference.value.isNullOrEmpty()) {
                accentPreference.value = me.magnum.melonds.ui.theme.AppThemeManager.DEFAULT_ACCENT_KEY
            }
            helper.bindPreferenceSummaryToValue(accentPreference)
            accentPreference.setOnPreferenceChangeListener { _, newValue ->
                val newAccent = newValue as String
                me.magnum.melonds.ui.theme.AppThemeManager.accentColorState.value = newAccent
                accentPreference.sharedPreferences?.edit()?.putString("theme_accent_color", newAccent)?.apply()
                val idx = accentPreference.findIndexOfValue(newAccent)
                if (idx >= 0) {
                    accentPreference.summary = accentPreference.entries?.getOrNull(idx)
                }
                view?.post { applyAccentColorToViews() }
                activity?.recreate()
                true
            }
        }

        val themePreference = findPreference<ListPreference>("theme")
        if (themePreference != null) {
            helper.bindPreferenceSummaryToValue(themePreference)
            themePreference.setOnPreferenceChangeListener { _, newValue ->
                val newThemeKey = newValue as String
                me.magnum.melonds.ui.theme.AppThemeManager.updateTheme(requireContext(), newThemeKey)
                val themeIdx = themePreference.findIndexOfValue(newThemeKey)
                if (themeIdx >= 0) {
                    themePreference.summary = themePreference.entries?.getOrNull(themeIdx)
                }
                accentPreference?.let { accPref ->
                    accPref.value = me.magnum.melonds.ui.theme.AppThemeManager.DEFAULT_ACCENT_KEY
                    val accIdx = accPref.findIndexOfValue(me.magnum.melonds.ui.theme.AppThemeManager.DEFAULT_ACCENT_KEY)
                    if (accIdx >= 0) {
                        accPref.summary = accPref.entries?.getOrNull(accIdx)
                    }
                }
                activity?.recreate()
                true
            }
        }

        val cardStylePreference = findPreference<ListPreference>("rom_card_style")
        if (cardStylePreference != null) {
            helper.bindPreferenceSummaryToValue(cardStylePreference)
            cardStylePreference.addOnPreferenceChangeListener { _, newValue ->
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
                    if (!isAdded) return@withContext
                    val ctx = context ?: return@withContext
                    if (imported) {
                        AlertDialog.Builder(ctx)
                            .setMessage(R.string.settings_restore_success)
                            .setPositiveButton(android.R.string.ok) { _, _ ->
                                activity?.recreate()
                            }
                            .show()
                    } else {
                        Toast.makeText(ctx, R.string.settings_restore_error, Toast.LENGTH_SHORT).show()
                    }
                }
            }
            true
        }
        // Manage pause submenu
        updateManagePauseMenuSummary()
        findPreference<Preference>("manage_pause_menu")?.setOnPreferenceClickListener {
            val store = me.magnum.melonds.ui.emulator.rom.PauseMenuCustomizationStore(requireContext())
            val message = "${getString(R.string.v792_general_pause_menu_reset_confirm)}\n\n${getString(R.string.v820_general_pause_menu_customize_hint)}"
            AlertDialog.Builder(requireContext())
                .setTitle(R.string.v792_general_pause_menu_title)
                .setMessage(message)
                .setPositiveButton(R.string.v792_pause_reset_defaults) { _, _ ->
                    store.resetToDefaults()
                    updateManagePauseMenuSummary()
                    Toast.makeText(requireContext(), R.string.v792_general_pause_menu_reset_done, Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton(android.R.string.cancel, null)
                .show()
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

    private fun updateManagePauseMenuSummary() {
        val pref = findPreference<Preference>("manage_pause_menu") ?: return
        val ctx = context ?: return
        val store = me.magnum.melonds.ui.emulator.rom.PauseMenuCustomizationStore(ctx)
        val hiddenCount = store.getHiddenItems().size
        val hasCustom = store.getCustomOrder().isNotEmpty()
        val orderStr = getString(if (hasCustom) R.string.v793_general_order_custom else R.string.v793_general_order_default)
        pref.summary = getString(R.string.v793_general_pause_summary_fmt, hiddenCount, orderStr)
    }

    private fun showSnapshotsDialog() {
        lifecycleScope.launch(Dispatchers.IO) {
            val snapshots = settingsBackupManager.listSnapshots()
            withContext(Dispatchers.Main) {
                if (!isAdded) return@withContext
                val ctx = context ?: return@withContext
                val createLabel = getString(R.string.v793_general_snapshot_create_now)
                val options = mutableListOf<CharSequence>(createLabel)
                val values = mutableListOf<CharSequence>("__create__")
                snapshots.forEachIndexed { index, snap ->
                    val reasonLabel = when (snap.reason) {
                        "auto" -> getString(R.string.v793_general_snapshot_auto_before_import)
                        else -> getString(R.string.v793_general_snapshot_manual)
                    }
                    options.add("📦 ${snap.displayDate} - $reasonLabel")
                    values.add(index.toString())
                }

                showSettingsComposeDialog(ctx) { dismiss ->
                    SettingsChoiceDialogContent(
                        title = getString(R.string.manage_setting_snapshots),
                        subtitle = getString(R.string.manage_setting_snapshots_summary),
                        icon = Icons.Filled.History,
                        options = options,
                        values = values,
                        selectedValue = null,
                        onSelect = { chosen ->
                            if (chosen == "__create__") {
                                lifecycleScope.launch(Dispatchers.IO) {
                                    val created = settingsBackupManager.createSnapshot("manual")
                                    withContext(Dispatchers.Main) {
                                        val safeCtx = context ?: return@withContext
                                        val msg = if (created != null) {
                                            getString(R.string.v793_general_snapshot_saved_fmt, created.displayDate)
                                        } else {
                                            getString(R.string.settings_backup_error)
                                        }
                                        Toast.makeText(safeCtx, msg, Toast.LENGTH_SHORT).show()
                                    }
                                }
                            } else {
                                val index = chosen.toIntOrNull() ?: return@SettingsChoiceDialogContent
                                val selected = snapshots.getOrNull(index) ?: return@SettingsChoiceDialogContent
                                lifecycleScope.launch(Dispatchers.IO) {
                                    val ok = settingsBackupManager.restoreSnapshot(selected)
                                    withContext(Dispatchers.Main) {
                                        val safeCtx = context ?: return@withContext
                                        if (ok) {
                                            showSettingsComposeDialog(safeCtx) { confirmDismiss ->
                                                SettingsConfirmDialogContent(
                                                    title = getString(R.string.manage_setting_snapshots),
                                                    message = getString(R.string.settings_restore_success),
                                                    confirmText = getString(android.R.string.ok),
                                                    icon = Icons.Filled.CheckCircle,
                                                    onConfirm = { activity?.recreate() },
                                                    onDismiss = confirmDismiss,
                                                )
                                            }
                                        } else {
                                            Toast.makeText(safeCtx, R.string.settings_restore_error, Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                }
                            }
                        },
                        onDismiss = dismiss,
                    )
                }
            }
        }
    }

    private fun showStormLayoutDialog() {
        val options = arrayOf(
            getString(R.string.v793_general_export_layouts_opt),
            getString(R.string.v793_general_import_layouts_opt)
        )
        AlertDialog.Builder(requireContext())
            .setTitle(R.string.export_import_stormlayout)
            .setItems(options) { _, which ->
                if (which == 0) {
                    lifecycleScope.launch(Dispatchers.IO) {
                        val exported = settingsBackupManager.exportLayoutsToStormFolder()
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            val ctx = context ?: return@withContext
                            val msg = if (exported != null) {
                                getString(R.string.v793_general_layouts_saved_fmt, exported.name)
                            } else {
                                getString(R.string.settings_backup_error)
                            }
                            Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    lifecycleScope.launch(Dispatchers.IO) {
                        val count = settingsBackupManager.importLayoutsFromStormFolder()
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            val ctx = context ?: return@withContext
                            if (count >= 0) {
                                val msg = getString(R.string.v793_general_layouts_imported_fmt, count)
                                Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show()
                                activity?.recreate()
                            } else {
                                Toast.makeText(ctx, R.string.settings_restore_error, Toast.LENGTH_SHORT).show()
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
        updateManagePauseMenuSummary()
        findPreference<Preference>("github_update_channel")?.isVisible =
            findPreference<SwitchPreference>("github_check_for_updates")?.isChecked ?: true
    }

    private fun updateRewindSummary() {
        val pref = rewindPreference ?: return
        val sp = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val isEnabled = sp.getBoolean("enable_rewind", false)
        val period = sp.getInt("rewind_period", 10)
        val window = sp.getInt("rewind_window", 6) * 10
        pref.summary = if (isEnabled) {
            val periodStr = getString(R.string.seconds_short, period)
            val windowStr = getString(R.string.seconds_short, window)
            getString(R.string.v820_rewind_summary_enabled_fmt, periodStr, windowStr)
        } else {
            getString(R.string.v820_rewind_summary_disabled)
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
        val appContext = context?.applicationContext ?: return
        lifecycleScope.launch(Dispatchers.IO) {
            val result = runCatching {
                val prefs = PreferenceManager.getDefaultSharedPreferences(appContext)
                val all = prefs.all
                val sensitiveKeys = listOf("token", "ra_token", "password", "cookie", "secret", "auth", "_key", "api_key")

                val rootJson = org.json.JSONObject()
                rootJson.put("app", "STORM DS")
                val vName = (runCatching { appContext.packageManager.getPackageInfo(appContext.packageName, 0).versionName }.getOrNull() ?: "8.6.0").removePrefix("v").removePrefix("V")
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

                appContext.contentResolver.openOutputStream(uri)?.use { os ->
                    os.write(rootJson.toString(2).toByteArray(Charsets.UTF_8))
                } ?: throw java.io.IOException("Cannot open output stream")
                itemsJson.length()
            }

            withContext(Dispatchers.Main) {
                if (!isAdded) return@withContext
                val ctx = context ?: return@withContext
                result.onSuccess {
                    Toast.makeText(ctx, getString(R.string.v780_settings_export_success), Toast.LENGTH_SHORT).show()
                }.onFailure {
                    Toast.makeText(ctx, getString(R.string.v780_settings_export_error), Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun importSettingsFromJson(uri: android.net.Uri) {
        val appContext = context?.applicationContext ?: return
        lifecycleScope.launch(Dispatchers.IO) {
            val result = runCatching {
                val jsonText = appContext.contentResolver.openInputStream(uri)?.use { ins ->
                    ins.bufferedReader(Charsets.UTF_8).readText()
                } ?: throw java.io.IOException("Cannot open input stream")

                val rootJson = org.json.JSONObject(jsonText)
                val prefsJson = if (rootJson.has("preferences")) rootJson.getJSONObject("preferences") else rootJson

                val prefs = PreferenceManager.getDefaultSharedPreferences(appContext)
                val editor = prefs.edit()
                var appliedCount = 0

                val sensitiveKeys = listOf("token", "ra_token", "password", "cookie", "secret", "auth", "_key", "api_key")

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
                if (!isAdded) return@withContext
                val ctx = context ?: return@withContext
                result.onSuccess { count ->
                    AlertDialog.Builder(ctx)
                        .setTitle(R.string.v780_settings_maintenance_title)
                        .setMessage(getString(R.string.v780_settings_import_success, count))
                        .setPositiveButton(android.R.string.ok) { _, _ ->
                            activity?.recreate()
                        }
                        .show()
                }.onFailure {
                    Toast.makeText(ctx, getString(R.string.v780_settings_import_error), Toast.LENGTH_SHORT).show()
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

        val preservePrefixes = listOf(
            "ra_",
            "rom_search_dirs",
            "sram_dir",
            "save_state_location",
            "save_state_custom_dir",
            "bios_dir",
            "dsi_bios_dir",
            "dsi_sd_card_dir",
            "dsi_nand_dir",
            "system_dsi_sd_card_dir",
            "system_dldi_sd_card_dir",
        )

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