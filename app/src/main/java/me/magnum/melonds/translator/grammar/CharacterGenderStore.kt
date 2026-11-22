package me.magnum.melonds.translator.grammar

import android.content.Context
import android.util.Log
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
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
    private val ioMutex = Mutex()
    private val memory = ConcurrentHashMap<String, Gender>()
    @Volatile
    private var currentGameKey: String = "global"
    @Volatile
    private var loadGeneration: Long = 0L
    @Volatile
    private var activeLoadGate: CompletableDeferred<Unit> = CompletableDeferred()

    private val primaryDir = File("/storage/emulated/0/STORM DS/translator/dictionaries")
    private val fallbackDir by lazy { File(context.filesDir, "translator/dictionaries") }

    init {
        val gate = activeLoadGate
        val gen = loadGeneration
        scope.launch {
            try {
                ioMutex.withLock {
                    ensureDirs()
                    loadFromDisk("global", gen)
                }
            } finally {
                gate.complete(Unit)
            }
        }
    }

    private fun ensureDirs() {
        try { if (!primaryDir.exists()) primaryDir.mkdirs() } catch (_: Throwable) {}
        try { if (!fallbackDir.exists()) fallbackDir.mkdirs() } catch (_: Throwable) {}
    }

    private fun getStorageDir(): File {
        return if (primaryDir.exists() && primaryDir.canWrite()) primaryDir else fallbackDir
    }

    @Synchronized
    fun loadForGame(gameKey: String) {
        val sanitized = sanitizeKey(gameKey)
        currentGameKey = sanitized
        val gen = ++loadGeneration
        val gate = CompletableDeferred<Unit>()
        activeLoadGate = gate
        memory.clear()
        scope.launch {
            try {
                ioMutex.withLock {
                    ensureDirs()
                    loadFromDisk(sanitized, gen)
                }
            } finally {
                gate.complete(Unit)
            }
        }
    }

    private fun loadFromDisk(sanitized: String, expectedGen: Long) {
        val file = File(getStorageDir(), "character_gender_${sanitized}.json")
        if (!file.exists()) return

        try {
            val jsonStr = file.readText(Charsets.UTF_8)
            val json = JSONObject(jsonStr)
            val loaded = HashMap<String, Gender>()
            val keys = json.keys()
            while (keys.hasNext()) {
                val name = keys.next()
                val genderStr = json.optString(name, "NEUTRAL")
                loaded[name.lowercase()] = Gender.fromString(genderStr)
            }
            if (loadGeneration == expectedGen && currentGameKey == sanitized) {
                for ((k, v) in loaded) {
                    memory.putIfAbsent(k, v)
                }
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
        val gen = loadGeneration
        val gate = activeLoadGate
        scope.launch {
            gate.await()
            ioMutex.withLock {
                if (loadGeneration != gen || currentGameKey != key) return@withLock
                val snapshot = memory.toMap()
                try {
                    ensureDirs()
                    val file = File(getStorageDir(), "character_gender_${key}.json")
                    val json = JSONObject()
                    for ((name, gender) in snapshot) {
                        json.put(name, gender.name)
                    }
                    writeTextAtomically(file, json.toString(2))
                } catch (e: Throwable) {
                    Log.w(TAG, "Failed to save character gender store for " + key + ": " + e.message)
                }
            }
        }
    }

    private fun writeTextAtomically(file: File, text: String) {
        val parent = file.parentFile ?: return
        if (!parent.exists()) parent.mkdirs()
        val tempFile = File(parent, "${file.name}.${System.nanoTime()}.tmp")
        FileOutputStream(tempFile).use { stream ->
            stream.write(text.toByteArray(Charsets.UTF_8))
            stream.flush()
            runCatching { stream.fd.sync() }
        }
        if (!tempFile.renameTo(file)) {
            tempFile.copyTo(file, overwrite = true)
            tempFile.delete()
        }
    }

    companion object {
        private const val TAG = "CharacterGenderStore"

        private fun sanitizeKey(key: String): String {
            return key.replace(Regex("[^a-zA-Z0-9_-]"), "_").take(48).ifBlank { "global" }
        }
    }
}
