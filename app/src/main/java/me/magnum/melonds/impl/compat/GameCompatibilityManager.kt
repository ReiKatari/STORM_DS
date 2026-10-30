package me.magnum.melonds.impl.compat

import android.app.ActivityManager
import android.content.Context
import android.os.Build
import androidx.core.content.edit
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import me.magnum.melonds.MelonDSAndroidInterface
import me.magnum.melonds.domain.model.VideoRenderer
import org.json.JSONObject
import java.util.concurrent.ConcurrentHashMap

object GameCompatibilityManager {
    private const val PREFS_NAME = "storm_game_compat_guard_v4"
    private const val KEY_LAST_MARKER_GAME_KEY = "last_launch_marker_key"
    private const val KEY_MARKER_PREFIX = "launch_marker_"
    private const val KEY_PROFILE_PREFIX = "safe_profile_"
    private const val KEY_VULKAN_UNAVAILABLE_FINGERPRINT = "device_vulkan_unavailable_fp"
    private const val KEY_CAP_NOTICE_PREFIX = "cap_fallback_notified_"
    private const val GLES_3_0 = 0x30000
    private const val GLES_3_2 = 0x30002

    const val STABLE_EMULATION_SECONDS = 4

    data class LaunchMarker(
        val gameKey: String,
        val gameCode: String,
        val romName: String,
        val fileName: String,
        val renderer: VideoRenderer,
        val jitEnabled: Boolean,
        val resolutionScaling: Int,
        val timestampMs: Long,
        val crashCount: Int = 1,
    )

    data class SafeCompatibilityProfile(
        val forcedRenderer: VideoRenderer?,
        val safeVisuals: Boolean,
        val disableJit: Boolean,
        val level: Int,
    )

    private val _profileVersionFlow = MutableStateFlow(0L)
    val profileVersionFlow: StateFlow<Long> = _profileVersionFlow.asStateFlow()

    private val profileCache = ConcurrentHashMap<String, SafeCompatibilityProfile>()
    private val emptyProfileKeys = ConcurrentHashMap.newKeySet<String>()
    private val notifiedCapabilityFallbacks = ConcurrentHashMap.newKeySet<String>()
    @Volatile
    private var cachedOpenGlEsVersion: Int = -1
    @Volatile
    private var cachedVulkanUnavailableFp: String? = null
    @Volatile
    private var vulkanUnavailableLoaded: Boolean = false
    @Volatile
    private var pendingCapabilityFallback: Pair<VideoRenderer, VideoRenderer>? = null

    fun resolveGameKey(
        gameCode: String?,
        romName: String?,
        fileName: String?,
    ): String? {
        val cleanedCode = gameCode?.trim()?.uppercase().orEmpty()
        if (cleanedCode.length in 3..8 &&
            cleanedCode != "####" &&
            cleanedCode != "0000" &&
            cleanedCode != "----" &&
            cleanedCode.all { it.isLetterOrDigit() }
        ) {
            return "gc_$cleanedCode"
        }

        val cleanedFile = fileName?.trim()?.lowercase().orEmpty()
        if (cleanedFile.isNotEmpty()) {
            return "fn_${cleanedFile.hashCode().toUInt().toString(16)}"
        }

        val cleanedName = romName?.trim()?.lowercase().orEmpty()
        if (cleanedName.isNotEmpty()) {
            return "rn_${cleanedName.hashCode().toUInt().toString(16)}"
        }

        return null
    }

    private fun getDeviceGlEsVersion(context: Context): Int {
        val cached = cachedOpenGlEsVersion
        if (cached >= 0) return cached
        val activityManager = context.applicationContext.getSystemService(ActivityManager::class.java)
        val reqGlEsVersion = activityManager?.deviceConfigurationInfo?.reqGlEsVersion ?: GLES_3_2
        cachedOpenGlEsVersion = reqGlEsVersion
        return reqGlEsVersion
    }

    fun isOpenGlEs32Supported(context: Context): Boolean {
        return getDeviceGlEsVersion(context) >= GLES_3_2
    }

    fun isOpenGlEs30Supported(context: Context): Boolean {
        return getDeviceGlEsVersion(context) >= GLES_3_0
    }

    fun isVulkanSupportedOnDevice(context: Context): Boolean {
        return MelonDSAndroidInterface.isVulkanRendererSupported()
    }

    fun markDeviceVulkanUnavailable(context: Context) {
        cachedVulkanUnavailableFp = null
        vulkanUnavailableLoaded = true
    }

    fun clearDeviceVulkanUnavailable(context: Context) {
        cachedVulkanUnavailableFp = null
        vulkanUnavailableLoaded = true
        clearAllSafeProfiles(context)
    }

    fun clearAllSafeProfiles(context: Context) {
        profileCache.clear()
        emptyProfileKeys.clear()
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val keysToRemove = prefs.all.keys.filter {
            it == KEY_VULKAN_UNAVAILABLE_FINGERPRINT ||
                it == KEY_LAST_MARKER_GAME_KEY ||
                it.startsWith(KEY_PROFILE_PREFIX) ||
                it.startsWith(KEY_MARKER_PREFIX)
        }
        if (keysToRemove.isNotEmpty()) {
            prefs.edit {
                for (k in keysToRemove) {
                    remove(k)
                }
            }
        }
        bumpVersion()
    }

    fun isDeviceVulkanMarkedUnavailable(context: Context): Boolean {
        if (!vulkanUnavailableLoaded) {
            val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            if (prefs.contains(KEY_VULKAN_UNAVAILABLE_FINGERPRINT)) {
                prefs.edit {
                    remove(KEY_VULKAN_UNAVAILABLE_FINGERPRINT)
                }
            }
            vulkanUnavailableLoaded = true
        }
        val savedFp = cachedVulkanUnavailableFp ?: return false
        return savedFp == Build.FINGERPRINT
    }

    fun resolveSupportedFallbackRenderer(
        context: Context,
        openGlSupported: Boolean = isOpenGlEs32Supported(context) && isOpenGlEs30Supported(context),
    ): VideoRenderer {
        return if (openGlSupported) VideoRenderer.OPENGL else VideoRenderer.SOFTWARE
    }

    fun getNextSaferRenderer(
        current: VideoRenderer,
        openGlSupported: Boolean,
    ): VideoRenderer? {
        return when (current) {
            VideoRenderer.COMPUTE,
            VideoRenderer.VULKAN -> if (openGlSupported) VideoRenderer.OPENGL else VideoRenderer.SOFTWARE
            VideoRenderer.OPENGL -> VideoRenderer.SOFTWARE
            VideoRenderer.SOFTWARE -> null
        }
    }

    fun pickSaferRenderer(a: VideoRenderer, b: VideoRenderer): VideoRenderer {
        return if (rendererSafetyRank(a) <= rendererSafetyRank(b)) a else b
    }

    private fun rendererSafetyRank(renderer: VideoRenderer): Int {
        return when (renderer) {
            VideoRenderer.SOFTWARE -> 0
            VideoRenderer.OPENGL -> 1
            VideoRenderer.VULKAN -> 2
            VideoRenderer.COMPUTE -> 3
        }
    }

    fun recordCapabilityFallbackNotice(
        context: Context,
        requested: VideoRenderer,
        fallback: VideoRenderer,
    ) {
        if (requested == fallback) return
        val noticeKey = "$KEY_CAP_NOTICE_PREFIX${Build.FINGERPRINT}_${requested.name}_${fallback.name}"
        if (notifiedCapabilityFallbacks.contains(noticeKey)) {
            return
        }
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        if (prefs.getBoolean(noticeKey, false)) {
            notifiedCapabilityFallbacks.add(noticeKey)
            return
        }
        pendingCapabilityFallback = requested to fallback
    }

    fun consumePendingCapabilityFallbackNotice(context: Context): Pair<VideoRenderer, VideoRenderer>? {
        val pending = pendingCapabilityFallback ?: return null
        pendingCapabilityFallback = null
        val noticeKey = "$KEY_CAP_NOTICE_PREFIX${Build.FINGERPRINT}_${pending.first.name}_${pending.second.name}"
        if (!notifiedCapabilityFallbacks.add(noticeKey)) {
            return null
        }
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        if (prefs.getBoolean(noticeKey, false)) {
            return null
        }
        prefs.edit {
            putBoolean(noticeKey, true)
        }
        return pending
    }

    fun writeLaunchMarker(
        context: Context,
        gameCode: String?,
        romName: String?,
        fileName: String?,
        renderer: VideoRenderer,
        jitEnabled: Boolean,
        resolutionScaling: Int,
    ) {
        val key = resolveGameKey(gameCode, romName, fileName) ?: return
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val prevCrashCount = prefs.getString("$KEY_MARKER_PREFIX$key", null)
            ?.let { parseLaunchMarker(it)?.crashCount } ?: 0
        val json = JSONObject().apply {
            put("gameKey", key)
            put("gameCode", gameCode.orEmpty())
            put("romName", romName.orEmpty())
            put("fileName", fileName.orEmpty())
            put("renderer", renderer.name)
            put("jitEnabled", jitEnabled)
            put("resolutionScaling", resolutionScaling)
            put("timestampMs", System.currentTimeMillis())
            put("crashCount", prevCrashCount + 1)
        }
        prefs.edit {
            putString("$KEY_MARKER_PREFIX$key", json.toString())
            putString(KEY_LAST_MARKER_GAME_KEY, key)
        }
    }

    fun updateLaunchMarkerRenderer(
        context: Context,
        gameCode: String?,
        romName: String?,
        fileName: String?,
        renderer: VideoRenderer,
    ) {
        val key = resolveGameKey(gameCode, romName, fileName) ?: return
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val existingRaw = prefs.getString("$KEY_MARKER_PREFIX$key", null) ?: return
        val updatedJson = runCatching {
            JSONObject(existingRaw).apply {
                put("renderer", renderer.name)
                put("timestampMs", System.currentTimeMillis())
            }.toString()
        }.getOrNull() ?: return
        prefs.edit {
            putString("$KEY_MARKER_PREFIX$key", updatedJson)
        }
    }

    fun clearLaunchMarker(
        context: Context,
        gameCode: String?,
        romName: String?,
        fileName: String?,
    ) {
        val key = resolveGameKey(gameCode, romName, fileName) ?: return
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val lastKey = prefs.getString(KEY_LAST_MARKER_GAME_KEY, null)
        prefs.edit {
            remove("$KEY_MARKER_PREFIX$key")
            if (lastKey == key) {
                remove(KEY_LAST_MARKER_GAME_KEY)
            }
        }
    }

    fun clearAllActiveLaunchMarkers(context: Context) {
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val lastKey = prefs.getString(KEY_LAST_MARKER_GAME_KEY, null)
        prefs.edit {
            if (!lastKey.isNullOrBlank()) {
                remove("$KEY_MARKER_PREFIX$lastKey")
            }
            remove(KEY_LAST_MARKER_GAME_KEY)
        }
    }

    fun consumeStaleMarkerAndEscalateIfNeeded(
        context: Context,
        gameCode: String?,
        romName: String?,
        fileName: String?,
        openGlSupported: Boolean = isOpenGlEs32Supported(context),
    ): SafeCompatibilityProfile? {
        val key = resolveGameKey(gameCode, romName, fileName) ?: return null
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        // If another game crashed previously, clear its stale marker without blindly penalizing unrelated games.
        val lastMarkerKey = prefs.getString(KEY_LAST_MARKER_GAME_KEY, null)
        if (!lastMarkerKey.isNullOrBlank() && lastMarkerKey != key) {
            prefs.edit {
                remove("$KEY_MARKER_PREFIX$lastMarkerKey")
            }
        }

        return escalateMarkerForKey(prefs, key, openGlSupported)
    }

    private fun escalateMarkerForKey(
        prefs: android.content.SharedPreferences,
        key: String,
        openGlSupported: Boolean,
    ): SafeCompatibilityProfile? {
        val rawMarker = prefs.getString("$KEY_MARKER_PREFIX$key", null) ?: return null
        val marker = parseLaunchMarker(rawMarker)
        val lastKey = prefs.getString(KEY_LAST_MARKER_GAME_KEY, null)
        prefs.edit {
            remove("$KEY_MARKER_PREFIX$key")
            if (lastKey == key) {
                remove(KEY_LAST_MARKER_GAME_KEY)
            }
        }
        if (marker == null || marker.crashCount < 2) {
            return null
        }

        val existing = readProfileFromPrefs(prefs, key)
        val crashedRenderer = existing?.forcedRenderer?.let { pickSaferRenderer(it, marker.renderer) } ?: marker.renderer
        val escalated = when (crashedRenderer) {
            VideoRenderer.COMPUTE -> {
                val nextRenderer = if (openGlSupported) VideoRenderer.OPENGL else VideoRenderer.SOFTWARE
                SafeCompatibilityProfile(
                    forcedRenderer = nextRenderer,
                    safeVisuals = true,
                    disableJit = existing?.disableJit ?: false,
                    level = if (nextRenderer == VideoRenderer.OPENGL) 1 else 2,
                )
            }
            VideoRenderer.VULKAN -> {
                // First Vulkan crash: retry Vulkan with safe visuals. A repeated crash on the
                // same title steps that title (only) down so every game still launches.
                val alreadyRetriedVulkanSafe = existing != null && existing.forcedRenderer == null && existing.safeVisuals
                if (MelonDSAndroidInterface.isVulkanRendererSupported() && !alreadyRetriedVulkanSafe) {
                    SafeCompatibilityProfile(
                        forcedRenderer = null,
                        safeVisuals = true,
                        disableJit = existing?.disableJit ?: false,
                        level = 1,
                    )
                } else {
                    val nextRenderer = if (openGlSupported) VideoRenderer.OPENGL else VideoRenderer.SOFTWARE
                    SafeCompatibilityProfile(
                        forcedRenderer = nextRenderer,
                        safeVisuals = true,
                        disableJit = existing?.disableJit ?: false,
                        level = if (nextRenderer == VideoRenderer.OPENGL) 1 else 2,
                    )
                }
            }
            VideoRenderer.OPENGL -> {
                SafeCompatibilityProfile(
                    forcedRenderer = VideoRenderer.SOFTWARE,
                    safeVisuals = true,
                    disableJit = existing?.disableJit ?: false,
                    level = 2,
                )
            }
            VideoRenderer.SOFTWARE -> {
                SafeCompatibilityProfile(
                    forcedRenderer = VideoRenderer.SOFTWARE,
                    safeVisuals = true,
                    disableJit = true,
                    level = 3,
                )
            }
        }

        saveProfileToPrefs(prefs, key, escalated)
        return escalated
    }

    fun stepDownForLoadFailure(
        context: Context,
        gameCode: String?,
        romName: String?,
        fileName: String?,
        failedRenderer: VideoRenderer,
        openGlSupported: Boolean = isOpenGlEs32Supported(context),
    ): VideoRenderer? {
        val nextRenderer = getNextSaferRenderer(failedRenderer, openGlSupported) ?: return null
        val key = resolveGameKey(gameCode, romName, fileName) ?: return nextRenderer
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val existing = readProfileFromPrefs(prefs, key)
        val mergedRenderer = existing?.forcedRenderer?.let { pickSaferRenderer(it, nextRenderer) } ?: nextRenderer
        val newLevel = when {
            existing?.disableJit == true -> 3
            mergedRenderer == VideoRenderer.SOFTWARE -> 2
            else -> 1
        }
        val updated = SafeCompatibilityProfile(
            forcedRenderer = mergedRenderer,
            safeVisuals = true,
            disableJit = existing?.disableJit ?: false,
            level = newLevel,
        )
        saveProfileToPrefs(prefs, key, updated)
        updateLaunchMarkerRenderer(context, gameCode, romName, fileName, mergedRenderer)
        return mergedRenderer
    }

    fun getEffectiveProfile(
        context: Context,
        gameCode: String?,
        romName: String?,
        fileName: String?,
    ): SafeCompatibilityProfile? {
        val key = resolveGameKey(gameCode, romName, fileName) ?: return null
        if (emptyProfileKeys.contains(key)) {
            return null
        }
        profileCache[key]?.let { return it }

        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val loaded = readProfileFromPrefs(prefs, key)
        if (loaded != null) {
            profileCache[key] = loaded
        } else {
            emptyProfileKeys.add(key)
        }
        return loaded
    }

    fun isSafeModeActive(
        context: Context,
        gameCode: String?,
        romName: String?,
        fileName: String?,
    ): Boolean {
        return getEffectiveProfile(context, gameCode, romName, fileName) != null
    }

    fun resetProfile(
        context: Context,
        gameCode: String?,
        romName: String?,
        fileName: String?,
    ) {
        val key = resolveGameKey(gameCode, romName, fileName) ?: return
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val lastKey = prefs.getString(KEY_LAST_MARKER_GAME_KEY, null)
        cachedVulkanUnavailableFp = null
        vulkanUnavailableLoaded = true
        prefs.edit {
            remove("$KEY_PROFILE_PREFIX$key")
            remove("$KEY_MARKER_PREFIX$key")
            if (lastKey == key) {
                remove(KEY_LAST_MARKER_GAME_KEY)
            }
            remove(KEY_VULKAN_UNAVAILABLE_FINGERPRINT)
        }
        profileCache.remove(key)
        emptyProfileKeys.add(key)
        bumpVersion()
    }

    fun formatRendererLabel(renderer: VideoRenderer): String {
        return when (renderer) {
            VideoRenderer.SOFTWARE -> "Software"
            VideoRenderer.OPENGL -> "OpenGL"
            VideoRenderer.VULKAN -> "Vulkan"
            VideoRenderer.COMPUTE -> "Compute"
        }
    }

    private fun saveProfileToPrefs(
        prefs: android.content.SharedPreferences,
        key: String,
        profile: SafeCompatibilityProfile,
    ) {
        val json = JSONObject().apply {
            put("forcedRenderer", profile.forcedRenderer?.name.orEmpty())
            put("safeVisuals", profile.safeVisuals)
            put("disableJit", profile.disableJit)
            put("level", profile.level)
        }
        prefs.edit {
            putString("$KEY_PROFILE_PREFIX$key", json.toString())
        }
        emptyProfileKeys.remove(key)
        profileCache[key] = profile
        bumpVersion()
    }

    private fun readProfileFromPrefs(
        prefs: android.content.SharedPreferences,
        key: String,
    ): SafeCompatibilityProfile? {
        val raw = prefs.getString("$KEY_PROFILE_PREFIX$key", null) ?: return null
        return runCatching {
            val json = JSONObject(raw)
            val rendererStr = json.optString("forcedRenderer", "")
            val forcedRenderer = rendererStr.takeIf { it.isNotBlank() }?.let {
                runCatching { VideoRenderer.valueOf(it.uppercase()) }.getOrNull()
            }
            val safeVisuals = json.optBoolean("safeVisuals", true)
            val disableJit = json.optBoolean("disableJit", false)
            val level = json.optInt("level", 1)
            SafeCompatibilityProfile(
                forcedRenderer = forcedRenderer,
                safeVisuals = safeVisuals,
                disableJit = disableJit,
                level = level,
            )
        }.getOrNull()
    }

    private fun parseLaunchMarker(raw: String): LaunchMarker? {
        return runCatching {
            val json = JSONObject(raw)
            val rendererName = json.optString("renderer", VideoRenderer.OPENGL.name)
            val renderer = runCatching { VideoRenderer.valueOf(rendererName.uppercase()) }
                .getOrDefault(VideoRenderer.OPENGL)
            LaunchMarker(
                gameKey = json.optString("gameKey", ""),
                gameCode = json.optString("gameCode", ""),
                romName = json.optString("romName", ""),
                fileName = json.optString("fileName", ""),
                renderer = renderer,
                jitEnabled = json.optBoolean("jitEnabled", true),
                resolutionScaling = json.optInt("resolutionScaling", 1),
                timestampMs = json.optLong("timestampMs", 0L),
                crashCount = json.optInt("crashCount", 1),
            )
        }.getOrNull()
    }

    private fun bumpVersion() {
        _profileVersionFlow.value = _profileVersionFlow.value + 1L
    }
}
