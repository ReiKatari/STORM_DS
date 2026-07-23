package me.magnum.melonds.impl

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ShaderCompileTimeStore @Inject constructor(@ApplicationContext context: Context) {

    enum class Backend { OPEN_GL, VULKAN }

    private val preferences: SharedPreferences =
        context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

    fun record(presetPath: String, backend: Backend, millis: Long) {
        if (presetPath.isBlank() || millis <= 0) {
            return
        }
        preferences.edit().putLong(key(presetPath, backend), millis).apply()
    }

    fun measured(presetPath: String?, backend: Backend): Long? {
        if (presetPath.isNullOrBlank()) {
            return null
        }
        return preferences.getLong(key(presetPath, backend), 0L).takeIf { it > 0 }
    }

    fun clear() {
        preferences.edit().clear().apply()
    }

    private fun key(presetPath: String, backend: Backend) = "${backend.name}|$presetPath"

    private companion object {
        const val PREFERENCES_NAME = "shader_compile_times"
    }
}
