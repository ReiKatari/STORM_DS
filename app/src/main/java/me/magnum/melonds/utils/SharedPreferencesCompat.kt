package me.magnum.melonds.utils

import android.content.SharedPreferences

/**
 * Safely reads a Float preference even when an earlier backup restore or JSON import
 * persisted a whole-number Float (such as `1`) as an Int, Long, or numeric String.
 */
fun SharedPreferences.getFloatCompat(
    key: String,
    defaultValue: Float,
    healOnTypeMismatch: Boolean = true,
): Float {
    return try {
        getFloat(key, defaultValue)
    } catch (_: ClassCastException) {
        val raw = all[key]
        val resolved = when (raw) {
            is Float -> raw
            is Number -> raw.toFloat()
            is String -> raw.toFloatOrNull() ?: defaultValue
            else -> defaultValue
        }
        if (healOnTypeMismatch && raw != null && raw !is Float) {
            runCatching { edit().putFloat(key, resolved).apply() }
        }
        resolved
    }
}

/**
 * Safely reads a Long preference even when an earlier backup restore or JSON import
 * persisted a small Long value as an Int, Number, or numeric String.
 */
fun SharedPreferences.getLongCompat(
    key: String,
    defaultValue: Long,
    healOnTypeMismatch: Boolean = true,
): Long {
    return try {
        getLong(key, defaultValue)
    } catch (_: ClassCastException) {
        val raw = all[key]
        val resolved = when (raw) {
            is Long -> raw
            is Number -> raw.toLong()
            is String -> raw.toLongOrNull() ?: defaultValue
            else -> defaultValue
        }
        if (healOnTypeMismatch && raw != null && raw !is Long) {
            runCatching { edit().putLong(key, resolved).apply() }
        }
        resolved
    }
}
