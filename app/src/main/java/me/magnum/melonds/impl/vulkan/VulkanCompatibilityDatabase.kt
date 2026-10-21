package me.magnum.melonds.impl.vulkan

import android.content.Context
import android.util.Log
import me.magnum.melonds.MelonEmulator
import org.json.JSONObject
import java.io.File
import java.util.Locale

object VulkanCompatibilityDatabase {
    private const val TAG = "VulkanCompatDB"
    private const val ASSET_FILE_NAME = "vulkan_compat.json"
    private const val EXTERNAL_OVERRIDE_PATH = "/storage/emulated/0/STORM DS/settings/vulkan_compat.json"

    const val COMPOSITOR_MODE_PRECISE = 0
    const val COMPOSITOR_MODE_LEGACY = 1

    data class GameCompatibilityProfile(
        val id: String,
        val title: String,
        val gameCodes: List<String>,
        val titleKeywords: List<String>,
        val compositorMode: String?,
        val thickEdges: Boolean?,
        val notes: String,
    ) {
        fun compositorModeInt(): Int? {
            return when (compositorMode?.lowercase(Locale.ROOT)) {
                "precise" -> COMPOSITOR_MODE_PRECISE
                "legacy" -> COMPOSITOR_MODE_LEGACY
                else -> null
            }
        }
    }

    @Volatile
    private var cachedProfiles: List<GameCompatibilityProfile>? = null

    fun getProfiles(context: Context): List<GameCompatibilityProfile> {
        cachedProfiles?.let { return it }
        synchronized(this) {
            cachedProfiles?.let { return it }
            val loaded = loadProfiles(context)
            cachedProfiles = loaded
            return loaded
        }
    }

    fun reload(context: Context): List<GameCompatibilityProfile> {
        synchronized(this) {
            val loaded = loadProfiles(context)
            cachedProfiles = loaded
            return loaded
        }
    }

    fun findProfile(
        context: Context,
        gameCode: String?,
        romName: String? = null,
        fileName: String? = null,
    ): GameCompatibilityProfile? {
        val profiles = getProfiles(context)
        val normalizedCode = gameCode?.trim()?.uppercase(Locale.ROOT).orEmpty()
        if (normalizedCode.length >= 3) {
            val codePrefix3 = normalizedCode.take(3)
            val byExactCode = profiles.firstOrNull { profile ->
                profile.gameCodes.any { it.equals(normalizedCode, ignoreCase = true) }
            }
            if (byExactCode != null) {
                return byExactCode
            }
            val byPrefixCode = profiles.firstOrNull { profile ->
                profile.gameCodes.any { code ->
                    val clean = code.trim().uppercase(Locale.ROOT)
                    clean.length == 3 && clean == codePrefix3 ||
                        (clean.length == 4 && normalizedCode.length == 3 && clean.take(3) == codePrefix3)
                }
            }
            if (byPrefixCode != null) {
                return byPrefixCode
            }
        }

        val haystack = buildString {
            if (!romName.isNullOrBlank()) append(romName.lowercase(Locale.ROOT)).append(' ')
            if (!fileName.isNullOrBlank()) append(fileName.lowercase(Locale.ROOT))
        }.trim()

        if (haystack.isNotEmpty()) {
            return profiles.firstOrNull { profile ->
                profile.titleKeywords.any { keyword ->
                    keyword.isNotBlank() && haystack.contains(keyword.lowercase(Locale.ROOT))
                }
            }
        }

        return null
    }

    fun applyRuntimeControlsForRom(
        context: Context,
        gameCode: String?,
        romName: String?,
        fileName: String?,
        autoselectEnabled: Boolean,
        userCompositorMode: Int,
        userThickEdges: Boolean,
    ): GameCompatibilityProfile? {
        val matchedProfile = if (autoselectEnabled) {
            findProfile(context, gameCode, romName, fileName)
        } else {
            null
        }

        val effectiveCompositorMode = matchedProfile?.compositorModeInt() ?: userCompositorMode
        val effectiveThickEdges = (matchedProfile?.thickEdges == true) || userThickEdges

        if (matchedProfile != null) {
            Log.i(
                TAG,
                "Applied Vulkan compatibility profile '${matchedProfile.id}' (${matchedProfile.title}) " +
                    "for gameCode='${gameCode.orEmpty()}' rom='${romName.orEmpty()}': " +
                    "compositorMode=$effectiveCompositorMode, thickEdges=$effectiveThickEdges (${matchedProfile.notes})"
            )
        }

        runCatching {
            MelonEmulator.setVulkanCompositorMode(effectiveCompositorMode)
            MelonEmulator.setVulkanThickHighResEdges(effectiveThickEdges)
        }.onFailure {
            Log.w(TAG, "Failed to apply Vulkan runtime controls via JNI", it)
        }

        return matchedProfile
    }

    private fun loadProfiles(context: Context): List<GameCompatibilityProfile> {
        val rawJson = runCatching {
            val externalFile = File(EXTERNAL_OVERRIDE_PATH)
            if (externalFile.exists() && externalFile.isFile && externalFile.canRead()) {
                externalFile.readText(Charsets.UTF_8)
            } else {
                context.assets.open(ASSET_FILE_NAME).bufferedReader(Charsets.UTF_8).use { it.readText() }
            }
        }.onFailure {
            Log.w(TAG, "Failed to read $ASSET_FILE_NAME", it)
        }.getOrNull() ?: return emptyList()

        return parseProfilesJson(rawJson)
    }

    private fun parseProfilesJson(rawJson: String): List<GameCompatibilityProfile> {
        return runCatching {
            val root = JSONObject(rawJson)
            val profilesArray = root.optJSONArray("profiles") ?: return emptyList()
            buildList(profilesArray.length()) {
                for (i in 0 until profilesArray.length()) {
                    val item = profilesArray.optJSONObject(i) ?: continue
                    val id = item.optString("id", "profile_$i")
                    val title = item.optString("title", id)
                    val codesArray = item.optJSONArray("gameCodes")
                    val gameCodes = buildList {
                        if (codesArray != null) {
                            for (j in 0 until codesArray.length()) {
                                val code = codesArray.optString(j)?.trim()
                                if (!code.isNullOrEmpty()) add(code)
                            }
                        }
                    }
                    val keywordsArray = item.optJSONArray("titleKeywords")
                    val titleKeywords = buildList {
                        if (keywordsArray != null) {
                            for (j in 0 until keywordsArray.length()) {
                                val kw = keywordsArray.optString(j)?.trim()
                                if (!kw.isNullOrEmpty()) add(kw)
                            }
                        }
                    }
                    val compositorMode = item.optString("compositorMode", "").takeIf { it.isNotBlank() }
                    val thickEdges = if (item.has("thickEdges") && !item.isNull("thickEdges")) {
                        item.optBoolean("thickEdges")
                    } else {
                        null
                    }
                    val notes = item.optString("notes", "")
                    add(
                        GameCompatibilityProfile(
                            id = id,
                            title = title,
                            gameCodes = gameCodes,
                            titleKeywords = titleKeywords,
                            compositorMode = compositorMode,
                            thickEdges = thickEdges,
                            notes = notes,
                        )
                    )
                }
            }
        }.onFailure {
            Log.w(TAG, "Failed to parse $ASSET_FILE_NAME", it)
        }.getOrDefault(emptyList())
    }
}
