package me.magnum.melonds.translator.grammar

import android.content.Context
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.io.File
import java.util.concurrent.ConcurrentHashMap

/**
 * Persistent Per-ROM Character Gender Memory.
 *
 * Persists learned character genders per game in JSON format:
 * - Primary storage: /storage/emulated/0/STORM DS/translator/dictionaries/character_gender_<gameKey>.json
 * - Fallback storage: <context.filesDir>/translator/dictionaries/character_gender_<gameKey>.json
 */
class CharacterGenderStore(private val context: Context) {

    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private val memory = ConcurrentHashMap<String, Gender>()
    private var currentGameKey: String = "global"

    private val primaryDir = File("/storage/emulated/0/STORM DS/translator/dictionaries")
    private val fallbackDir by lazy { File(context.filesDir, "translator/dictionaries") }

    init {
        ensureDirs()
        loadForGame("global")
    }

    private fun ensureDirs() {
        try { if (!primaryDir.exists()) primaryDir.mkdirs() } catch (_: Throwable) {}
        try { if (!fallbackDir.exists()) fallbackDir.mkdirs() } catch (_: Throwable) {}
    }

    private fun getStorageDir(): File {
        return if (primaryDir.exists() && primaryDir.canWrite()) primaryDir else fallbackDir
    }

    fun loadForGame(gameKey: String) {
        val sanitized = sanitizeKey(gameKey)
        currentGameKey = sanitized
        memory.clear()

        val file = File(getStorageDir(), "character_gender_${sanitized}.json")
        if (!file.exists()) return

        try {
            val jsonStr = file.readText(Charsets.UTF_8)
            val json = JSONObject(jsonStr)
            val keys = json.keys()
            while (keys.hasNext()) {
                val name = keys.next()
                val genderStr = json.optString(name, "NEUTRAL")
                memory[name.lowercase()] = Gender.fromString(genderStr)
            }
        } catch (e: Throwable) {
            Log.w(TAG, "Failed to load character gender store for " + sanitized + ": " + e.message)
        }
    }

    fun getGender(name: String): Gender? {
        val clean = name.trim().lowercase()
        if (clean.isBlank()) return null
        return memory[clean]
    }

    fun setGender(name: String, gender: Gender) {
        val clean = name.trim()
        if (clean.isBlank()) return
        memory[clean.lowercase()] = gender
        saveAsync()
    }

    fun getAllGenders(): Map<String, Gender> {
        return memory.toMap()
    }

    private fun saveAsync() {
        val key = currentGameKey
        val snapshot = memory.toMap()
        scope.launch {
            try {
                val file = File(getStorageDir(), "character_gender_${key}.json")
                val json = JSONObject()
                for ((name, gender) in snapshot) {
                    json.put(name, gender.name)
                }
                file.writeText(json.toString(2), Charsets.UTF_8)
            } catch (e: Throwable) {
                Log.w(TAG, "Failed to save character gender store for " + key + ": " + e.message)
            }
        }
    }

    companion object {
        private const val TAG = "CharacterGenderStore"

        private fun sanitizeKey(key: String): String {
            return key.replace(Regex("[^a-zA-Z0-9_-]"), "_").take(48).ifBlank { "global" }
        }
    }
}
