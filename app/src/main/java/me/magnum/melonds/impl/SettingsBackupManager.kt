package me.magnum.melonds.impl

import android.content.Context
import android.content.ContentValues
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.database.sqlite.SQLiteDatabase
import android.net.Uri
import android.util.Log
import androidx.core.net.toUri
import androidx.documentfile.provider.DocumentFile
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import me.magnum.melonds.database.MelonDatabase
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.util.concurrent.atomic.AtomicBoolean
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsBackupManager @Inject constructor(
    @param:ApplicationContext private val context: Context,
    private val preferences: SharedPreferences,
    private val database: MelonDatabase,
) : OnSharedPreferenceChangeListener {
    companion object {
        private const val TAG = "SettingsBackupManager"
        private const val STORM_DS_OPTIONS_FILE = "STORM_DS.opts"
        private const val STORM_DS_SPACE_OPTIONS_FILE = "STORM DS.opts"
        private const val LEGACY_OPTIONS_FILE = "melonDualDS.opts"
        private const val SETTINGS_FILE = "settings.json"
        private const val CONTROLLER_FILE = "controller_config.json"
        private const val LAYOUTS_FILE = "layouts.json"
        private const val BACKGROUNDS_FILE = "backgrounds.json"
        private const val INTERNAL_LAYOUT_FILE = "internal_layout.json"
        private const val EXTERNAL_LAYOUT_FILE = "external_layout.json"
        private const val ROM_DATA_FILE = "rom_data.json"
        private const val ROM_METADATA_MIRROR_FILE = "rom_metadata_mirror.json"
        private const val SETTINGS_MIRROR_FALLBACK_URI = "settings_mirror_fallback_uri"
        private const val SETTINGS_MIRROR_ENABLED = "save_internal_config_as_file"
        private val EXCLUDED_PREF_KEYS = setOf(
            "ra_token",
            "rom_search_dirs",
            "bios_dir",
            "dsi_bios_dir",
            SETTINGS_MIRROR_FALLBACK_URI,
        )
        private val CHEAT_TABLES = listOf(
            "cheat_database" to listOf("id", "name"),
            "game" to listOf("id", "name", "game_code", "game_checksum"),
            "cheat_folder" to listOf("id", "game_id", "name"),
            "cheat" to listOf("id", "cheat_folder_id", "cheat_database_id", "name", "description", "code", "enabled"),
        )
        private val CHEAT_RESTORE_DELETE_ORDER = listOf("cheat", "cheat_folder", "game", "cheat_database")
        private val LONG_PREF_KEYS = setOf(
            "ra_hash_library_last_updated",
            "github_updates_nightly_next_check_date",
            "github_updates_nightly_last_release_date",
            "github_updates_last_check",
            "last_version",
        )
    }

    private val mirrorScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val mirrorWriteQueued = AtomicBoolean(false)
    private val isRestoringMirror = AtomicBoolean(false)

    init {
        preferences.registerOnSharedPreferenceChangeListener(this)
    }

    private fun hasStorageReadAccess(): Boolean {
        return if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            android.os.Environment.isExternalStorageManager()
        } else {
            androidx.core.content.ContextCompat.checkSelfPermission(
                context,
                android.Manifest.permission.READ_EXTERNAL_STORAGE
            ) == android.content.pm.PackageManager.PERMISSION_GRANTED
        }
    }

    private fun getStorageSettingsDir(): File {
        val extRoot = runCatching { android.os.Environment.getExternalStorageDirectory() }.getOrNull()
        return if (extRoot != null) {
            val stormRoot = File(extRoot, "STORM DS")
            val existingSettingsDir = runCatching {
                stormRoot.listFiles()?.firstOrNull { it.isDirectory && it.name.equals("settings", ignoreCase = true) }
            }.getOrNull()
            (existingSettingsDir ?: File(stormRoot, "settings")).apply { runCatching { mkdirs() } }
        } else {
            context.filesDir
        }
    }

    private fun getCandidateExternalDirs(): List<File> {
        val extRoot = runCatching { android.os.Environment.getExternalStorageDirectory() }.getOrNull() ?: return emptyList()
        val stormRoot = File(extRoot, "STORM DS")
        val dirs = mutableListOf<File>()
        runCatching {
            stormRoot.listFiles()?.filter { it.isDirectory && it.name.equals("settings", ignoreCase = true) }?.let {
                dirs.addAll(it)
            }
        }
        val defaultSettingsDir = File(stormRoot, "settings")
        if (dirs.none { it.absolutePath == defaultSettingsDir.absolutePath }) {
            dirs.add(defaultSettingsDir)
        }
        val upperSettingsDir = File(stormRoot, "SETTINGS")
        if (dirs.none { it.absolutePath == upperSettingsDir.absolutePath }) {
            dirs.add(upperSettingsDir)
        }
        if (stormRoot.exists()) {
            dirs.add(stormRoot)
        }
        return dirs
    }

    private fun findExternalFile(vararg fileNames: String): File? {
        for (dir in getCandidateExternalDirs()) {
            if (!dir.exists() || !dir.isDirectory) continue
            for (targetName in fileNames) {
                val direct = File(dir, targetName)
                if (direct.isFile && direct.length() > 0L) return direct
            }
            val children = runCatching { dir.listFiles() }.getOrNull() ?: continue
            for (targetName in fileNames) {
                val matched = children.firstOrNull { it.isFile && it.length() > 0L && it.name.equals(targetName, ignoreCase = true) }
                if (matched != null) return matched
            }
        }
        return null
    }

    private fun sha256Hex(file: File?): String? {
        if (file == null || !file.isFile || file.length() <= 0L) return null
        return runCatching {
            val digest = java.security.MessageDigest.getInstance("SHA-256")
            file.inputStream().use { input ->
                val buffer = ByteArray(8192)
                var read: Int
                while (input.read(buffer).also { read = it } > 0) {
                    digest.update(buffer, 0, read)
                }
            }
            digest.digest().joinToString("") { "%02x".format(it) }
        }.getOrNull()
    }

    private fun getSignatureFile(): File = File(context.filesDir, ".mirror_signature.json")

    private fun readRecordedSignatures(): Pair<String?, String?> {
        val sigFile = getSignatureFile()
        if (!sigFile.isFile || sigFile.length() <= 0L) return null to null
        return runCatching {
            val json = JSONObject(sigFile.readText())
            val optsHash = json.optString("optsSha256", "").takeIf { it.isNotBlank() }
            val settingsHash = json.optString("settingsSha256", "").takeIf { it.isNotBlank() }
            optsHash to settingsHash
        }.getOrDefault(null to null)
    }

    private fun recordMirrorSignatures(optsFile: File?, settingsFile: File?) {
        runCatching {
            val json = JSONObject().apply {
                sha256Hex(optsFile)?.let { put("optsSha256", it) }
                sha256Hex(settingsFile)?.let { put("settingsSha256", it) }
                put("updatedAt", System.currentTimeMillis())
            }
            writeTextAtomically(getSignatureFile(), json.toString())
        }
    }

    fun initializeMirror() {
        val imported = syncExternalSettingsIfModified(force = false)
        if (!imported && hasStorageReadAccess()) {
            requestMirrorWrite()
        }
    }

    @Synchronized
    fun syncExternalSettingsIfModified(force: Boolean = false): Boolean {
        if (!hasStorageReadAccess()) return false
        return runCatching {
            val storageOptions = findExternalFile(STORM_DS_OPTIONS_FILE, STORM_DS_SPACE_OPTIONS_FILE, LEGACY_OPTIONS_FILE)
            val storageSettings = findExternalFile(SETTINGS_FILE)
            if (storageOptions == null && storageSettings == null) {
                return@runCatching false
            }

            val currentOptsHash = sha256Hex(storageOptions)
            val currentSettingsHash = sha256Hex(storageSettings)
            val (recordedOptsHash, recordedSettingsHash) = readRecordedSignatures()
            val hasCoreUserPrefs = preferences.contains("theme") || preferences.contains("rom_search_dirs")

            val optsChangedExternally = currentOptsHash != null && currentOptsHash != recordedOptsHash
            val settingsChangedExternally = currentSettingsHash != null && currentSettingsHash != recordedSettingsHash
            val shouldImport = force || !hasCoreUserPrefs || optsChangedExternally || settingsChangedExternally

            if (!shouldImport) {
                return@runCatching false
            }

            if (hasCoreUserPrefs) {
                runCatching { createSnapshot("auto") }
            }

            isRestoringMirror.set(true)
            try {
                val canonicalDir = getStorageSettingsDir()
                for (auxName in listOf(CONTROLLER_FILE, LAYOUTS_FILE, BACKGROUNDS_FILE, ROM_DATA_FILE, "rom_directory_state.json")) {
                    val extAux = findExternalFile(auxName)
                    val destAux = File(canonicalDir, auxName)
                    if (extAux != null && extAux.canonicalPath != destAux.canonicalPath) {
                        runCatching { extAux.copyTo(destAux, overwrite = true) }
                    }
                }

                if (storageOptions != null && (force || !hasCoreUserPrefs || optsChangedExternally)) {
                    runCatching {
                        val optsJson = JSONObject(storageOptions.readText())
                        restoreBackupJsonInternal(optsJson, includeLocalKeys = true)
                    }.onFailure {
                        Log.w(TAG, "Failed to parse external options file ${storageOptions.absolutePath}", it)
                    }
                }

                if (storageSettings != null && (force || !hasCoreUserPrefs || settingsChangedExternally)) {
                    runCatching {
                        val rawJson = JSONObject(storageSettings.readText())
                        if (rawJson.has("settings") && rawJson.optJSONObject("settings") != null && rawJson.has("version")) {
                            restoreBackupJsonInternal(rawJson, includeLocalKeys = true)
                        } else {
                            restoreSettingsJson(rawJson, includeLocalKeys = true)
                        }
                    }.onFailure {
                        Log.w(TAG, "Failed to parse external settings file ${storageSettings.absolutePath}", it)
                    }
                }

                if (preferences.getStringSet("rom_search_dirs", null).isNullOrEmpty()) {
                    val dirStateFile = findExternalFile("rom_directory_state.json") ?: File(canonicalDir, "rom_directory_state.json")
                    if (dirStateFile.exists() && dirStateFile.length() > 0L) {
                        runCatching {
                            val stateArray = JSONArray(dirStateFile.readText())
                            val recoveredDirs = mutableSetOf<String>()
                            for (i in 0 until stateArray.length()) {
                                val dirUri = stateArray.optJSONObject(i)?.optString("directoryUri")?.takeIf { it.isNotBlank() }
                                if (dirUri != null) {
                                    recoveredDirs.add(dirUri)
                                }
                            }
                            if (recoveredDirs.isNotEmpty()) {
                                preferences.edit().putStringSet("rom_search_dirs", recoveredDirs).apply()
                            }
                        }
                    }
                }

                runCatching { me.magnum.melonds.ui.theme.AppThemeManager.init(context) }
                runCatching { me.magnum.melonds.ui.common.views.ButtonThemeManager.init(context) }
                runCatching { me.magnum.melonds.ui.romlist.RomDisplayNameManager.init(context) }
            } finally {
                isRestoringMirror.set(false)
            }

            writeInternalMirror(skipExternalCheck = true)
            true
        }.onFailure {
            Log.w(TAG, "Failed to sync external settings", it)
        }.getOrDefault(false)
    }

    fun isMirrorEnabled(): Boolean {
        return preferences.getBoolean(SETTINGS_MIRROR_ENABLED, true)
    }

    fun requestMirrorWrite() {
        if (isRestoringMirror.get()) {
            return
        }
        if (!mirrorWriteQueued.compareAndSet(false, true)) {
            return
        }

        mirrorScope.launch {
            try {
                writeInternalMirror()
            } catch (e: Exception) {
                Log.w(TAG, "Failed to write settings mirror", e)
            } finally {
                mirrorWriteQueued.set(false)
            }
        }
    }

    fun backup(treeUri: Uri) {
        runCatching { createSnapshot("manual") }
        val root = DocumentFile.fromTreeUri(context, treeUri) ?: return

        val backupDoc = getMirrorDocument(treeUri)
            ?: root.createFile("*/*", STORM_DS_OPTIONS_FILE)
            ?: return
        context.contentResolver.openOutputStream(backupDoc.uri, "wt")?.use { outStream ->
            outStream.writer().use { it.write(createBackupJson(includeLocalKeys = true).toString()) }
        }
        val settingsDoc = root.findFile(SETTINGS_FILE)
            ?: root.createFile("*/*", SETTINGS_FILE)
        settingsDoc?.uri?.let { uri ->
            context.contentResolver.openOutputStream(uri, "wt")?.use { outStream ->
                outStream.writer().use { it.write(createSettingsJson(includeLocalKeys = true).toString()) }
            }
        }
    }

    fun hasMirrorAt(treeUri: Uri): Boolean {
        val mirrorDocument = getMirrorDocument(treeUri)?.takeIf { it.isFile } ?: return false
        return runCatching {
            context.contentResolver.openInputStream(mirrorDocument.uri)?.use { input ->
                JSONObject(input.reader().readText())
            } != null
        }.onFailure {
            Log.w(TAG, "Ignoring invalid settings mirror at $treeUri", it)
        }.getOrDefault(false)
    }

    fun restoreMirrorFrom(treeUri: Uri) {
        runCatching {
            val mirrorDocument = getMirrorDocument(treeUri) ?: return
            context.contentResolver.openInputStream(mirrorDocument.uri)?.use { input ->
                restoreBackupJson(JSONObject(input.reader().readText()))
            }
        }.onFailure {
            Log.w(TAG, "Failed to restore settings mirror from $treeUri", it)
        }
    }

    fun overwriteMirrorAt(treeUri: Uri) {
        writeMirrorToTree(treeUri, createBackupJson().toString())
    }

    fun rememberMirrorFallback(treeUri: Uri) {
        preferences.edit().putString(SETTINGS_MIRROR_FALLBACK_URI, treeUri.toString()).apply()
    }

    fun getActiveMirrorDirectory(): Uri? {
        return getConfiguredMirrorDirectory()
    }

    private fun writeInternalMirror(skipExternalCheck: Boolean = false) {
        if (!hasStorageReadAccess()) {
            return
        }
        if (!skipExternalCheck) {
            val storageOptions = findExternalFile(STORM_DS_OPTIONS_FILE, STORM_DS_SPACE_OPTIONS_FILE, LEGACY_OPTIONS_FILE)
            val storageSettings = findExternalFile(SETTINGS_FILE)
            val (recordedOptsHash, recordedSettingsHash) = readRecordedSignatures()
            val currentOptsHash = sha256Hex(storageOptions)
            val currentSettingsHash = sha256Hex(storageSettings)
            if ((currentOptsHash != null && recordedOptsHash == null) ||
                (currentSettingsHash != null && recordedSettingsHash == null)
            ) {
                if (syncExternalSettingsIfModified(force = false)) {
                    return
                }
            }
        }
        val mirrorJson = createBackupJson(includeLocalKeys = true).toString()
        runCatching {
            val storageSettingsDir = getStorageSettingsDir()
            val optsFile = File(storageSettingsDir, STORM_DS_OPTIONS_FILE)
            val settingsFile = File(storageSettingsDir, SETTINGS_FILE)
            writeTextAtomically(optsFile, mirrorJson)
            writeTextAtomically(settingsFile, createSettingsJson(includeLocalKeys = true).toString())
            recordMirrorSignatures(optsFile, settingsFile)
        }
        if (isMirrorEnabled()) {
            val mirrorDirectory = getConfiguredMirrorDirectory()
            if (mirrorDirectory != null) {
                writeMirrorToTree(mirrorDirectory, mirrorJson)
            }
            pruneStaleMirrors(mirrorDirectory)
        }
    }

    private fun getConfiguredMirrorDirectory(): Uri? {
        if (!preferences.getBoolean("use_rom_dir", true)) {
            preferences.getStringSet("sram_dir", null)?.firstOrNull()?.let { return it.toUri() }
        }
        preferences.getString(SETTINGS_MIRROR_FALLBACK_URI, null)?.let { return it.toUri() }
        return preferences.getStringSet("rom_search_dirs", null)?.firstOrNull()?.toUri()
    }

    private fun writeMirrorToTree(treeUri: Uri, mirrorJson: String) {
        val root = DocumentFile.fromTreeUri(context, treeUri) ?: return
        val mirrorDocument = getMirrorDocument(treeUri)
            ?: root.createFile("application/octet-stream", STORM_DS_OPTIONS_FILE)
            ?: return
        context.contentResolver.openOutputStream(mirrorDocument.uri, "wt")?.use { output ->
            output.writer().use { it.write(mirrorJson) }
        }
    }

    private fun getMirrorDocument(treeUri: Uri): DocumentFile? {
        val root = DocumentFile.fromTreeUri(context, treeUri) ?: return null
        return root.findFile(STORM_DS_OPTIONS_FILE)
            ?: root.findFile(STORM_DS_SPACE_OPTIONS_FILE)
            ?: root.findFile(LEGACY_OPTIONS_FILE)
    }

    private fun pruneStaleMirrors(currentMirrorDirectory: Uri?) {
        val candidates = mutableSetOf<Uri>()
        preferences.getStringSet("sram_dir", null)?.forEach { candidates.add(it.toUri()) }
        preferences.getStringSet("rom_search_dirs", null)?.forEach { candidates.add(it.toUri()) }
        preferences.getString(SETTINGS_MIRROR_FALLBACK_URI, null)?.let { candidates.add(it.toUri()) }
        candidates
            .filter { it != currentMirrorDirectory }
            .forEach { uri ->
                runCatching { getMirrorDocument(uri)?.delete() }.onFailure {
                    Log.w(TAG, "Failed to delete stale settings mirror from $uri", it)
                }
            }
    }

    private fun createBackupJson(includeLocalKeys: Boolean = false): JSONObject {
        return JSONObject().apply {
            put("version", 1)
            put("settings", createSettingsJson(includeLocalKeys = includeLocalKeys))
            putFileJson("controllerConfig", CONTROLLER_FILE)
            putFileJson("layouts", LAYOUTS_FILE)
            putFileJson("backgrounds", BACKGROUNDS_FILE)
            createSanitizedRomsJson()?.let { put("roms", it) }
            put("cheats", createCheatsJson())
        }
    }

    private fun createSettingsJson(includeLocalKeys: Boolean = false): JSONObject {
        val json = JSONObject()
        for ((key, value) in preferences.all) {
            if (!includeLocalKeys && key in EXCLUDED_PREF_KEYS) continue
            when (value) {
                is Boolean, is Int, is Long, is Float, is String -> json.put(key, value)
                is Set<*> -> {
                    val array = JSONArray()
                    value.forEach { array.put(it) }
                    json.put(key, array)
                }
            }
        }
        return json
    }

    private fun JSONObject.putFileJson(key: String, fileName: String) {
        readJsonFile(fileName)?.let { put(key, it) }
    }

    private fun readJsonFile(fileName: String): Any? {
        val storageFile = findExternalFile(fileName) ?: File(getStorageSettingsDir(), fileName)
        val file = if (storageFile.exists() && storageFile.length() > 0L) storageFile else File(context.filesDir, fileName)
        if (!file.exists()) {
            return null
        }
        val text = file.readText()
        return when (text.trim().firstOrNull()) {
            '[' -> JSONArray(text)
            '{' -> JSONObject(text)
            else -> null
        }
    }

    private fun createSanitizedRomsJson(): JSONArray? {
        val roms = readJsonFile(ROM_DATA_FILE) as? JSONArray ?: return null
        val sanitized = JSONArray()
        for (i in 0 until roms.length()) {
            val rom = roms.optJSONObject(i) ?: continue
            sanitized.put(JSONObject(rom.toString()).apply {
                remove("uri")
                remove("parentTreeUri")
            })
        }
        return sanitized
    }

    private fun findDocCaseInsensitive(dir: DocumentFile, vararg names: String): DocumentFile? {
        for (name in names) {
            dir.findFile(name)?.let { return it }
        }
        val files = runCatching { dir.listFiles() }.getOrNull() ?: return null
        for (name in names) {
            val matched = files.firstOrNull { it.name?.equals(name, ignoreCase = true) == true }
            if (matched != null) return matched
        }
        return null
    }

    fun restore(treeUri: Uri) {
        val root = DocumentFile.fromTreeUri(context, treeUri) ?: return
        val subSettingsDir = findDocCaseInsensitive(root, "settings")
        val searchRoots = listOfNotNull(root, subSettingsDir)

        isRestoringMirror.set(true)
        try {
            for (candidateRoot in searchRoots) {
                val backupDoc = findDocCaseInsensitive(
                    candidateRoot,
                    STORM_DS_OPTIONS_FILE,
                    STORM_DS_SPACE_OPTIONS_FILE,
                    LEGACY_OPTIONS_FILE
                )?.takeIf { it.isFile }
                if (backupDoc != null) {
                    context.contentResolver.openInputStream(backupDoc.uri)?.use { input ->
                        restoreBackupJsonInternal(JSONObject(input.reader().readText()), includeLocalKeys = true)
                    }
                }

                val settingsDoc = findDocCaseInsensitive(candidateRoot, SETTINGS_FILE)?.takeIf { it.isFile }
                settingsDoc?.uri?.let { uri ->
                    context.contentResolver.openInputStream(uri)?.use { input ->
                        val json = JSONObject(input.reader().readText())
                        if (json.has("settings") && json.optJSONObject("settings") != null && json.has("version")) {
                            restoreBackupJsonInternal(json, includeLocalKeys = true)
                        } else {
                            restoreSettingsJson(json, includeLocalKeys = true)
                        }
                    }
                }

                val storageSettingsDir = getStorageSettingsDir()
                for (auxFile in listOf(CONTROLLER_FILE, LAYOUTS_FILE, BACKGROUNDS_FILE)) {
                    findDocCaseInsensitive(candidateRoot, auxFile)?.takeIf { it.isFile }?.uri?.let { uri ->
                        val dest = File(storageSettingsDir, auxFile)
                        context.contentResolver.openInputStream(uri)?.use { input ->
                            writeBytesAtomically(dest, input.readBytes())
                        }
                    }
                }

                findDocCaseInsensitive(candidateRoot, ROM_DATA_FILE)?.takeIf { it.isFile }?.uri?.let { uri ->
                    context.contentResolver.openInputStream(uri)?.use { input ->
                        val text = input.reader().readText()
                        JSONArray(text)
                        writeTextAtomically(File(storageSettingsDir, ROM_DATA_FILE), text)
                    }
                }
            }

            runCatching { me.magnum.melonds.ui.theme.AppThemeManager.init(context) }
            runCatching { me.magnum.melonds.ui.common.views.ButtonThemeManager.init(context) }
            runCatching { me.magnum.melonds.ui.romlist.RomDisplayNameManager.init(context) }
        } finally {
            isRestoringMirror.set(false)
        }
        writeInternalMirror(skipExternalCheck = true)
    }

    private fun restoreBackupJson(json: JSONObject) {
        isRestoringMirror.set(true)
        try {
            restoreBackupJsonInternal(json, includeLocalKeys = true)
            runCatching { me.magnum.melonds.ui.theme.AppThemeManager.init(context) }
            runCatching { me.magnum.melonds.ui.common.views.ButtonThemeManager.init(context) }
            runCatching { me.magnum.melonds.ui.romlist.RomDisplayNameManager.init(context) }
        } finally {
            isRestoringMirror.set(false)
        }
        requestMirrorWrite()
    }

    private fun restoreBackupJsonInternal(json: JSONObject, includeLocalKeys: Boolean = false) {
        json.optJSONObject("settings")?.let { restoreSettingsJson(it, includeLocalKeys = includeLocalKeys) }
        restoreJsonFile(json, "controllerConfig", CONTROLLER_FILE)
        restoreJsonFile(json, "layouts", LAYOUTS_FILE)
        restoreJsonFile(json, "backgrounds", BACKGROUNDS_FILE)
        restoreRomsJson(json)
        json.optJSONObject("cheats")?.let { restoreCheatsJson(it) }
    }

    private fun restoreSettingsJson(json: JSONObject, includeLocalKeys: Boolean = false) {
        val editor = preferences.edit()
        for (key in json.keys()) {
            if (!includeLocalKeys && key in EXCLUDED_PREF_KEYS) continue
            val value = json.get(key)
            when (value) {
                is Boolean -> editor.putBoolean(key, value)
                is Int -> {
                    if (key in LONG_PREF_KEYS) {
                        editor.putLong(key, value.toLong())
                    } else {
                        editor.putInt(key, value)
                    }
                }
                is Long -> editor.putLong(key, value)
                is Double -> editor.putFloat(key, value.toFloat())
                is String -> editor.putString(key, value)
                is JSONArray -> {
                    val set = mutableSetOf<String>()
                    for (i in 0 until value.length()) {
                        set.add(value.getString(i))
                    }
                    editor.putStringSet(key, set)
                }
                is Number -> {
                    val current = preferences.all[key]
                    when {
                        current is Long || key in LONG_PREF_KEYS -> editor.putLong(key, value.toLong())
                        current is Int -> editor.putInt(key, value.toInt())
                        current is Float -> editor.putFloat(key, value.toFloat())
                        value is Double -> editor.putFloat(key, value.toFloat())
                        else -> editor.putLong(key, value.toLong())
                    }
                }
            }
        }
        editor.apply()
    }

    private fun restoreJsonFile(root: JSONObject, key: String, fileName: String) {
        val value = root.opt(key) ?: return
        if (value !is JSONObject && value !is JSONArray) {
            Log.w(TAG, "Skipping invalid backup value for $key")
            return
        }
        val text = value.toString()
        runCatching {
            writeTextAtomically(File(getStorageSettingsDir(), fileName), text)
        }
    }

    private fun restoreRomsJson(root: JSONObject) {
        val roms = root.optJSONArray("roms") ?: return
        val storageSettingsDir = getStorageSettingsDir()
        for (i in 0 until roms.length()) {
            val rom = roms.optJSONObject(i) ?: return
            if (!rom.has("uri")) {
                writeTextAtomically(File(storageSettingsDir, ROM_METADATA_MIRROR_FILE), roms.toString())
                return
            }
        }
        writeTextAtomically(File(storageSettingsDir, ROM_DATA_FILE), roms.toString())
    }

    private fun createCheatsJson(): JSONObject {
        val readableDb = database.openHelper.readableDatabase
        return JSONObject().apply {
            for ((tableName, columns) in CHEAT_TABLES) {
                val rows = JSONArray()
                val cursor = readableDb.query("SELECT ${columns.joinToString(", ")} FROM $tableName ORDER BY id")
                cursor.use {
                    while (it.moveToNext()) {
                        val row = JSONObject()
                        for (column in columns) {
                            val columnIndex = it.getColumnIndexOrThrow(column)
                            when (it.getType(columnIndex)) {
                                android.database.Cursor.FIELD_TYPE_NULL -> row.put(column, JSONObject.NULL)
                                android.database.Cursor.FIELD_TYPE_INTEGER -> row.put(column, it.getLong(columnIndex))
                                android.database.Cursor.FIELD_TYPE_FLOAT -> row.put(column, it.getDouble(columnIndex))
                                android.database.Cursor.FIELD_TYPE_STRING -> row.put(column, it.getString(columnIndex))
                                android.database.Cursor.FIELD_TYPE_BLOB -> row.put(column, JSONObject.NULL)
                            }
                        }
                        rows.put(row)
                    }
                }
                put(tableName, rows)
            }
        }
    }

    private fun restoreCheatsJson(json: JSONObject) {
        val writableDb = database.openHelper.writableDatabase
        writableDb.beginTransaction()
        try {
            for (tableName in CHEAT_RESTORE_DELETE_ORDER) {
                writableDb.delete(tableName, null, emptyArray())
            }

            for ((tableName, columns) in CHEAT_TABLES) {
                val rows = json.optJSONArray(tableName) ?: continue
                for (i in 0 until rows.length()) {
                    val row = rows.optJSONObject(i) ?: continue
                    val values = ContentValues()
                    for (column in columns) {
                        if (!row.has(column) || row.isNull(column)) {
                            values.putNull(column)
                            continue
                        }

                        when (val value = row.get(column)) {
                            is Boolean -> values.put(column, if (value) 1 else 0)
                            is Int -> values.put(column, value)
                            is Long -> values.put(column, value)
                            is Double -> values.put(column, value)
                            is String -> values.put(column, value)
                            is Number -> values.put(column, value.toLong())
                            else -> values.put(column, value.toString())
                        }
                    }
                    writableDb.insert(tableName, SQLiteDatabase.CONFLICT_REPLACE, values)
                }
            }
            writableDb.setTransactionSuccessful()
        } finally {
            writableDb.endTransaction()
        }
        if (!isRestoringMirror.get()) {
            requestMirrorWrite()
        }
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        if (isRestoringMirror.get()) {
            return
        }
        if (key == SETTINGS_MIRROR_ENABLED && isMirrorEnabled()) {
            return
        }
        requestMirrorWrite()
    }

    fun backupInternalLayout(treeUri: Uri) {
        backupUnifiedLayout(treeUri, INTERNAL_LAYOUT_FILE)
    }

    fun backupExternalLayout(treeUri: Uri) {
        backupUnifiedLayout(treeUri, EXTERNAL_LAYOUT_FILE)
    }

    fun restoreInternalLayout(treeUri: Uri) {
        restoreUnifiedLayout(treeUri, INTERNAL_LAYOUT_FILE)
    }

    fun restoreExternalLayout(treeUri: Uri) {
        restoreUnifiedLayout(treeUri, EXTERNAL_LAYOUT_FILE)
    }

    private fun backupUnifiedLayout(treeUri: Uri, fileName: String) {
        val root = DocumentFile.fromTreeUri(context, treeUri) ?: return

        val storageLayoutsFile = File(getStorageSettingsDir(), LAYOUTS_FILE)
        val layoutsText = storageLayoutsFile
            .takeIf { it.exists() }
            ?.let { runCatching { it.readText() }.getOrNull() }
            ?: "[]"
        val layouts = runCatching { JSONArray(layoutsText) }.getOrNull() ?: return

        val dest = root.findFile(fileName) ?: root.createFile("*/*", fileName) ?: return
        context.contentResolver.openOutputStream(dest.uri)?.use { out ->
            out.writer().use { it.write(layouts.toString()) }
        }
    }

    private fun restoreUnifiedLayout(treeUri: Uri, fileName: String) {
        val root = DocumentFile.fromTreeUri(context, treeUri) ?: return
        val src = root.findFile(fileName) ?: return

        val layouts = context.contentResolver.openInputStream(src.uri)?.use { input ->
            runCatching { JSONArray(input.reader().readText()) }.getOrNull()
        } ?: return
        writeTextAtomically(File(getStorageSettingsDir(), LAYOUTS_FILE), layouts.toString())
    }

    data class SettingSnapshot(
        val id: String,
        val displayDate: String,
        val reason: String,
        val timestampMs: Long,
        val directory: File,
    )

    private fun getBackupsRootDir(): File {
        val dir = File(getStorageSettingsDir(), "backups")
        if (!dir.exists()) dir.mkdirs()
        return dir
    }

    fun createSnapshot(reason: String = "manual"): SettingSnapshot? {
        return runCatching {
            val now = System.currentTimeMillis()
            val idFormat = java.text.SimpleDateFormat("yyyyMMdd_HHmmss", java.util.Locale.US)
            val displayFormat = java.text.SimpleDateFormat("dd.MM.yyyy HH:mm", java.util.Locale.getDefault())
            val dateObj = java.util.Date(now)
            val snapshotId = "snapshot_${idFormat.format(dateObj)}"
            val displayDate = displayFormat.format(dateObj)

            val snapDir = File(getBackupsRootDir(), snapshotId)
            if (!snapDir.exists()) snapDir.mkdirs()

            writeTextAtomically(File(snapDir, STORM_DS_OPTIONS_FILE), createBackupJson(includeLocalKeys = true).toString())
            writeTextAtomically(File(snapDir, SETTINGS_FILE), createSettingsJson(includeLocalKeys = true).toString())

            val canonicalDir = getStorageSettingsDir()
            for (auxName in listOf(CONTROLLER_FILE, LAYOUTS_FILE, BACKGROUNDS_FILE, ROM_DATA_FILE)) {
                val src = File(canonicalDir, auxName).takeIf { it.exists() && it.length() > 0L }
                    ?: findExternalFile(auxName)
                if (src != null && src.exists()) {
                    runCatching { src.copyTo(File(snapDir, auxName), overwrite = true) }
                }
            }

            val meta = JSONObject().apply {
                put("id", snapshotId)
                put("displayDate", displayDate)
                put("reason", reason)
                put("timestampMs", now)
            }
            writeTextAtomically(File(snapDir, "meta.json"), meta.toString())

            pruneOldSnapshots(maxSnapshots = 10)
            SettingSnapshot(snapshotId, displayDate, reason, now, snapDir)
        }.onFailure {
            Log.w(TAG, "Failed to create settings snapshot", it)
        }.getOrNull()
    }

    private fun pruneOldSnapshots(maxSnapshots: Int) {
        val all = listSnapshots()
        if (all.size <= maxSnapshots) return
        all.drop(maxSnapshots).forEach { old ->
            runCatching { old.directory.deleteRecursively() }
        }
    }

    fun listSnapshots(): List<SettingSnapshot> {
        val root = getBackupsRootDir()
        val dirs = root.listFiles { f -> f.isDirectory && f.name.startsWith("snapshot_") } ?: return emptyList()
        val displayFormat = java.text.SimpleDateFormat("dd.MM.yyyy HH:mm", java.util.Locale.getDefault())
        return dirs.mapNotNull { dir ->
            runCatching {
                val metaFile = File(dir, "meta.json")
                if (metaFile.exists()) {
                    val meta = JSONObject(metaFile.readText())
                    val ts = meta.optLong("timestampMs", dir.lastModified())
                    SettingSnapshot(
                        id = meta.optString("id", dir.name),
                        displayDate = meta.optString("displayDate", displayFormat.format(java.util.Date(ts))),
                        reason = meta.optString("reason", "manual"),
                        timestampMs = ts,
                        directory = dir,
                    )
                } else {
                    val ts = dir.lastModified()
                    SettingSnapshot(
                        id = dir.name,
                        displayDate = displayFormat.format(java.util.Date(ts)),
                        reason = "manual",
                        timestampMs = ts,
                        directory = dir,
                    )
                }
            }.getOrNull()
        }.sortedByDescending { it.timestampMs }
    }

    @Synchronized
    fun restoreSnapshot(snapshot: SettingSnapshot): Boolean {
        return runCatching {
            val dir = snapshot.directory
            if (!dir.exists() || !dir.isDirectory) return@runCatching false

            isRestoringMirror.set(true)
            try {
                val canonicalDir = getStorageSettingsDir()
                for (auxName in listOf(CONTROLLER_FILE, LAYOUTS_FILE, BACKGROUNDS_FILE, ROM_DATA_FILE)) {
                    val snapAux = File(dir, auxName)
                    if (snapAux.exists() && snapAux.length() > 0L) {
                        runCatching { snapAux.copyTo(File(canonicalDir, auxName), overwrite = true) }
                        runCatching { snapAux.copyTo(File(context.filesDir, auxName), overwrite = true) }
                    }
                }

                val optsFile = File(dir, STORM_DS_OPTIONS_FILE)
                if (optsFile.exists() && optsFile.length() > 0L) {
                    val optsJson = JSONObject(optsFile.readText())
                    restoreBackupJsonInternal(optsJson, includeLocalKeys = true)
                }

                val settingsFile = File(dir, SETTINGS_FILE)
                if (settingsFile.exists() && settingsFile.length() > 0L) {
                    val rawJson = JSONObject(settingsFile.readText())
                    if (rawJson.has("settings") && rawJson.optJSONObject("settings") != null && rawJson.has("version")) {
                        restoreBackupJsonInternal(rawJson, includeLocalKeys = true)
                    } else {
                        restoreSettingsJson(rawJson, includeLocalKeys = true)
                    }
                }

                runCatching { me.magnum.melonds.ui.theme.AppThemeManager.init(context) }
                runCatching { me.magnum.melonds.ui.common.views.ButtonThemeManager.init(context) }
                runCatching { me.magnum.melonds.ui.romlist.RomDisplayNameManager.init(context) }
            } finally {
                isRestoringMirror.set(false)
            }

            writeInternalMirror(skipExternalCheck = true)
            true
        }.onFailure {
            Log.w(TAG, "Failed to restore snapshot ${snapshot.id}", it)
        }.getOrDefault(false)
    }

    fun exportLayoutsToStormFolder(): File? {
        return runCatching {
            val canonicalDir = getStorageSettingsDir()
            val internalLayouts = File(context.filesDir, LAYOUTS_FILE)
            val externalLayouts = File(canonicalDir, LAYOUTS_FILE)
            val sourceFile = when {
                internalLayouts.exists() && internalLayouts.length() > 2L -> internalLayouts
                externalLayouts.exists() && externalLayouts.length() > 2L -> externalLayouts
                else -> findExternalFile(LAYOUTS_FILE)
            } ?: return@runCatching null

            val jsonText = sourceFile.readText()
            val parsed = JSONArray(jsonText)
            val targetFile = File(canonicalDir, "layouts_backup.stormlayout")
            writeTextAtomically(targetFile, parsed.toString(2))
            if (externalLayouts.canonicalPath != sourceFile.canonicalPath) {
                writeTextAtomically(externalLayouts, parsed.toString())
            }
            targetFile
        }.onFailure {
            Log.w(TAG, "Failed to export .stormlayout", it)
        }.getOrNull()
    }

    fun importLayoutsFromStormFolder(): Int {
        return runCatching {
            val candidateFile = findExternalFile("layouts_backup.stormlayout", "layouts.stormlayout", LAYOUTS_FILE)
                ?: getCandidateExternalDirs()
                    .flatMap { dir -> dir.listFiles { f -> f.isFile && f.name.endsWith(".stormlayout", ignoreCase = true) }?.toList().orEmpty() }
                    .maxByOrNull { it.lastModified() }
                ?: return@runCatching -1

            val rawText = candidateFile.readText()
            val layoutsArray = JSONArray(rawText)
            val canonicalLayouts = File(getStorageSettingsDir(), LAYOUTS_FILE)
            val internalLayouts = File(context.filesDir, LAYOUTS_FILE)
            writeTextAtomically(canonicalLayouts, layoutsArray.toString())
            writeTextAtomically(internalLayouts, layoutsArray.toString())
            layoutsArray.length()
        }.onFailure {
            Log.w(TAG, "Failed to import .stormlayout", it)
        }.getOrDefault(-1)
    }

    private fun writeTextAtomically(file: File, text: String) {
        writeBytesAtomically(file, text.toByteArray())
    }

    private fun writeBytesAtomically(file: File, bytes: ByteArray) {
        val tempFile = File(file.parentFile, "${file.name}.tmp")
        FileOutputStream(tempFile).use { stream ->
            stream.write(bytes)
            stream.flush()
            runCatching { stream.fd.sync() }
        }

        if (!tempFile.renameTo(file)) {
            if (file.exists() && !file.delete()) {
                throw IllegalStateException("Could not replace ${file.absolutePath}")
            }
            if (!tempFile.renameTo(file)) {
                throw IllegalStateException("Could not move ${tempFile.absolutePath} to ${file.absolutePath}")
            }
        }
    }
}
