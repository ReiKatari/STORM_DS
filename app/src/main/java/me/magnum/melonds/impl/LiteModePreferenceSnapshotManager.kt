package me.magnum.melonds.impl

import android.content.SharedPreferences
import com.google.gson.JsonElement
import com.google.gson.JsonNull
import com.google.gson.JsonObject
import com.google.gson.JsonParser

/**
 * Losslessly snapshots and restores user preferences when Simplified (Lite) mode activates
 * or deactivates so every Lite-managed preference reflects real persisted values in Settings UI
 * and reverts cleanly when returning to Standard (or Auto on capable hardware).
 */
object LiteModePreferenceSnapshotManager {

    const val KEY_SNAPSHOT_ACTIVE = "lite_mode_snapshot_active"
    const val KEY_SAVED_SNAPSHOT = "lite_mode_saved_standard_snapshot"

    private const val FIELD_TYPE = "t"
    private const val FIELD_VALUE = "v"

    private const val TYPE_STRING = "S"
    private const val TYPE_BOOLEAN = "B"
    private const val TYPE_INT = "I"
    private const val TYPE_FLOAT = "F"
    private const val TYPE_LONG = "L"
    private const val TYPE_ABSENT = "ABSENT"

    private val STATIC_LITE_TARGETS: LinkedHashMap<String, Any> = linkedMapOf(
        // System
        "arm9_overclock" to "1",
        "frameskip_mode" to "auto",
        // Video
        "video_renderer" to "software",
        "video_internal_resolution" to "1",
        "enable_threaded_rendering" to false,
        "video_filtering" to "none",
        "video_ai_upscale_enabled" to false,
        "video_vulkan_fastpath_enabled" to false,
        "video_vulkan_3d_depth_mode" to "off",
        "video_vulkan_ssao" to false,
        "video_vulkan_thick_edges" to false,
        "video_low_latency" to false,
        "video_vulkan_drs" to false,
        "video_widescreen_3d" to false,
        "video_60fps_patch" to false,
        "video_conservative_coverage_enabled" to false,
        "video_frame_gen_enabled" to false,
        // Audio
        "audio_interpolation" to "none",
        "audio_bitrate" to "bit10",
        "audio_latency" to "high",
        "audio_soft_limiter_enabled" to false,
        "audio_bass_boost_enabled" to false,
        "audio_spatial_audio_enabled" to false,
        "audio_reverb_enabled" to false,
        // General
        "enable_rewind" to false,
    )

    val MANAGED_KEYS: Set<String> = STATIC_LITE_TARGETS.keys.toSet()

    fun isSnapshotActive(prefs: SharedPreferences): Boolean {
        return prefs.getBoolean(KEY_SNAPSHOT_ACTIVE, false)
    }

    fun buildLiteTargets(recommendedSoftThreaded: Boolean): Map<String, Any> {
        val result = LinkedHashMap<String, Any>(STATIC_LITE_TARGETS.size)
        result.putAll(STATIC_LITE_TARGETS)
        result["enable_threaded_rendering"] = recommendedSoftThreaded
        return result
    }

    fun activateLiteMode(
        prefs: SharedPreferences,
        recommendedSoftThreaded: Boolean,
    ): Set<String> {
        val targets = buildLiteTargets(recommendedSoftThreaded)
        val snapshotActive = isSnapshotActive(prefs)
        val allValues = prefs.all

        val keysToUpdate = LinkedHashSet<String>()
        for ((key, target) in targets) {
            if (!prefs.contains(key) || allValues[key] != target) {
                keysToUpdate.add(key)
            }
        }

        if (snapshotActive && keysToUpdate.isEmpty()) {
            return emptySet()
        }

        val editor = prefs.edit()
        if (!snapshotActive) {
            val snapshotRoot = JsonObject()
            for (key in MANAGED_KEYS) {
                snapshotRoot.add(key, encodeEntry(prefs.contains(key), allValues[key]))
            }
            editor.putString(KEY_SAVED_SNAPSHOT, snapshotRoot.toString())
            editor.putBoolean(KEY_SNAPSHOT_ACTIVE, true)
        }

        val targetKeysToWrite = if (!snapshotActive) targets.keys else keysToUpdate
        for (key in targetKeysToWrite) {
            val target = targets[key] ?: continue
            putTypedValue(editor, key, target)
        }
        editor.apply()

        return if (!snapshotActive) MANAGED_KEYS else keysToUpdate
    }

    fun deactivateLiteMode(prefs: SharedPreferences): Set<String> {
        if (!isSnapshotActive(prefs)) {
            return emptySet()
        }

        val rawJson = prefs.getString(KEY_SAVED_SNAPSHOT, null)
        val snapshotObj = rawJson?.let { json ->
            runCatching { JsonParser.parseString(json).asJsonObject }.getOrNull()
        }

        val editor = prefs.edit()
        if (snapshotObj != null) {
            for (key in MANAGED_KEYS) {
                val entryEl = snapshotObj.get(key)
                if (entryEl == null || !entryEl.isJsonObject) {
                    editor.remove(key)
                    continue
                }
                restoreEntry(editor, key, entryEl.asJsonObject)
            }
        }
        editor.remove(KEY_SNAPSHOT_ACTIVE)
        editor.remove(KEY_SAVED_SNAPSHOT)
        editor.apply()
        return MANAGED_KEYS
    }

    fun clearSnapshot(prefs: SharedPreferences) {
        if (!prefs.contains(KEY_SNAPSHOT_ACTIVE) && !prefs.contains(KEY_SAVED_SNAPSHOT)) {
            return
        }
        prefs.edit()
            .remove(KEY_SNAPSHOT_ACTIVE)
            .remove(KEY_SAVED_SNAPSHOT)
            .apply()
    }

    private fun encodeEntry(present: Boolean, value: Any?): JsonObject {
        val obj = JsonObject()
        if (!present || value == null) {
            obj.addProperty(FIELD_TYPE, TYPE_ABSENT)
            obj.add(FIELD_VALUE, JsonNull.INSTANCE)
            return obj
        }
        when (value) {
            is String -> {
                obj.addProperty(FIELD_TYPE, TYPE_STRING)
                obj.addProperty(FIELD_VALUE, value)
            }
            is Boolean -> {
                obj.addProperty(FIELD_TYPE, TYPE_BOOLEAN)
                obj.addProperty(FIELD_VALUE, value)
            }
            is Int -> {
                obj.addProperty(FIELD_TYPE, TYPE_INT)
                obj.addProperty(FIELD_VALUE, value)
            }
            is Float -> {
                obj.addProperty(FIELD_TYPE, TYPE_FLOAT)
                obj.addProperty(FIELD_VALUE, value)
            }
            is Long -> {
                obj.addProperty(FIELD_TYPE, TYPE_LONG)
                obj.addProperty(FIELD_VALUE, value)
            }
            else -> {
                obj.addProperty(FIELD_TYPE, TYPE_STRING)
                obj.addProperty(FIELD_VALUE, value.toString())
            }
        }
        return obj
    }

    private fun restoreEntry(
        editor: SharedPreferences.Editor,
        key: String,
        obj: JsonObject,
    ) {
        val type = obj.get(FIELD_TYPE)?.takeIf { it.isJsonPrimitive }?.asString ?: TYPE_ABSENT
        val valueEl: JsonElement? = obj.get(FIELD_VALUE)
        if (type == TYPE_ABSENT || valueEl == null || valueEl.isJsonNull || !valueEl.isJsonPrimitive) {
            editor.remove(key)
            return
        }
        when (type) {
            TYPE_STRING -> editor.putString(key, valueEl.asString)
            TYPE_BOOLEAN -> editor.putBoolean(key, valueEl.asBoolean)
            TYPE_INT -> editor.putInt(key, valueEl.asInt)
            TYPE_FLOAT -> editor.putFloat(key, valueEl.asFloat)
            TYPE_LONG -> editor.putLong(key, valueEl.asLong)
            else -> editor.remove(key)
        }
    }

    private fun putTypedValue(
        editor: SharedPreferences.Editor,
        key: String,
        value: Any,
    ) {
        when (value) {
            is String -> editor.putString(key, value)
            is Boolean -> editor.putBoolean(key, value)
            is Int -> editor.putInt(key, value)
            is Float -> editor.putFloat(key, value)
            is Long -> editor.putLong(key, value)
        }
    }
}
