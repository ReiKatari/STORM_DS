package me.magnum.melonds.impl

import android.content.SharedPreferences
import android.net.Uri
import me.magnum.melonds.domain.model.AudioBitrate
import me.magnum.melonds.domain.model.AudioInterpolation
import me.magnum.melonds.domain.model.AudioLatency
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.DldiSdCardConfiguration
import me.magnum.melonds.domain.model.EmulatorConfiguration
import me.magnum.melonds.domain.model.FirmwareConfiguration
import me.magnum.melonds.domain.model.FrameskipConfiguration
import me.magnum.melonds.domain.model.FrameskipMode
import me.magnum.melonds.domain.model.MicSource
import me.magnum.melonds.domain.model.RendererConfiguration
import me.magnum.melonds.domain.model.RetroArchShaderConfiguration
import me.magnum.melonds.domain.model.RetroArchShaderSourceResolution
import me.magnum.melonds.domain.model.VideoFiltering
import me.magnum.melonds.domain.model.VideoRenderer
import me.magnum.melonds.domain.model.VulkanPipelineProfile
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

class FrameskipAndVulkanPerfFixTest {

    private class LocalSharedPreferences : SharedPreferences {
        private val data = LinkedHashMap<String, Any?>()

        override fun getAll(): MutableMap<String, *> = LinkedHashMap(data)
        override fun getString(key: String?, defValue: String?): String? =
            if (key != null && data.containsKey(key)) data[key] as String? else defValue
        @Suppress("UNCHECKED_CAST")
        override fun getStringSet(key: String?, defValues: MutableSet<String>?): MutableSet<String>? =
            if (key != null && data.containsKey(key)) data[key] as MutableSet<String>? else defValues
        override fun getInt(key: String?, defValue: Int): Int =
            if (key != null && data.containsKey(key)) data[key] as Int else defValue
        override fun getLong(key: String?, defValue: Long): Long =
            if (key != null && data.containsKey(key)) data[key] as Long else defValue
        override fun getFloat(key: String?, defValue: Float): Float =
            if (key != null && data.containsKey(key)) data[key] as Float else defValue
        override fun getBoolean(key: String?, defValue: Boolean): Boolean =
            if (key != null && data.containsKey(key)) data[key] as Boolean else defValue
        override fun contains(key: String?): Boolean = key != null && data.containsKey(key)

        override fun edit(): SharedPreferences.Editor = object : SharedPreferences.Editor {
            private val pending = LinkedHashMap<String, Any?>()
            private val removals = LinkedHashSet<String>()
            private var clearAll = false

            override fun putString(key: String?, value: String?): SharedPreferences.Editor = apply {
                if (key != null) { removals.remove(key); pending[key] = value }
            }
            override fun putStringSet(key: String?, values: MutableSet<String>?): SharedPreferences.Editor = apply {
                if (key != null) { removals.remove(key); pending[key] = values?.toMutableSet() }
            }
            override fun putInt(key: String?, value: Int): SharedPreferences.Editor = apply {
                if (key != null) { removals.remove(key); pending[key] = value }
            }
            override fun putLong(key: String?, value: Long): SharedPreferences.Editor = apply {
                if (key != null) { removals.remove(key); pending[key] = value }
            }
            override fun putFloat(key: String?, value: Float): SharedPreferences.Editor = apply {
                if (key != null) { removals.remove(key); pending[key] = value }
            }
            override fun putBoolean(key: String?, value: Boolean): SharedPreferences.Editor = apply {
                if (key != null) { removals.remove(key); pending[key] = value }
            }
            override fun remove(key: String?): SharedPreferences.Editor = apply {
                if (key != null) { pending.remove(key); removals.add(key) }
            }
            override fun clear(): SharedPreferences.Editor = apply {
                clearAll = true; pending.clear(); removals.clear()
            }
            override fun commit(): Boolean {
                if (clearAll) data.clear()
                removals.forEach { data.remove(it) }
                pending.forEach { (k, v) -> data[k] = v }
                return true
            }
            override fun apply() { commit() }
        }

        override fun registerOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener?) = Unit
        override fun unregisterOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener?) = Unit
    }

    private fun resolveRepoPath(relativePath: String): File {
        val cwd = File(System.getProperty("user.dir") ?: ".")
        val direct = File(cwd, relativePath)
        if (direct.exists()) return direct
        val parent = cwd.parentFile
        if (parent != null) {
            val fromParent = File(parent, relativePath)
            if (fromParent.exists()) return fromParent
        }
        error("Unable to locate $relativePath from ${cwd.absolutePath}")
    }

    @Test
    fun frameskipDefaults_areOffEverywhere() {
        assertEquals(FrameskipMode.OFF, FrameskipMode.fromPreferenceValue(null))
        assertEquals(FrameskipMode.OFF, FrameskipMode.fromPreferenceValue("unknown"))
        assertEquals(FrameskipMode.OFF, FrameskipConfiguration.DEFAULT.mode)

        val defaultConfig = EmulatorConfiguration(
            useCustomBios = false,
            showBootScreen = false,
            dsBios7Uri = null,
            dsBios9Uri = null,
            dsFirmwareUri = null,
            dsiBios7Uri = null,
            dsiBios9Uri = null,
            dsiFirmwareUri = null,
            dsiNandUri = null,
            internalDirectory = "",
            fastForwardSpeedMultiplier = 2.0f,
            frameLimitSpeedMultiplier = 1.0f,
            rewindEnabled = false,
            rewindPeriodSeconds = 10,
            rewindWindowSeconds = 60,
            useJit = true,
            hgEngineFixEnabled = false,
            consoleType = ConsoleType.DS,
            soundEnabled = true,
            audioInterpolation = AudioInterpolation.NONE,
            audioBitrate = AudioBitrate.AUTO,
            volume = 256,
            audioLatency = AudioLatency.MEDIUM,
            micSource = MicSource.NONE,
            firmwareConfiguration = FirmwareConfiguration(
                nickname = "Player",
                message = "",
                language = 1,
                favouriteColour = 0,
                birthdayMonth = 1,
                birthdayDay = 1,
                randomizeMacAddress = false,
                internalMacAddress = null,
            ),
            rendererConfiguration = RendererConfiguration(
                renderer = VideoRenderer.VULKAN,
                videoFiltering = VideoFiltering.NONE,
                threadedRendering = true,
                vulkanPipelineProfile = VulkanPipelineProfile.COMPATIBILITY,
                internalResolutionScaling = 1,
                rendererDebugToolsEnabled = false,
                rendererDebugBgObjEnabled = false,
                rendererDebugLatchTraceEnabled = false,
                conservativeCoverageEnabled = false,
                conservativeCoveragePx = 0f,
                conservativeCoverageDepthBias = 0f,
                conservativeCoverageApplyRepeat = false,
                conservativeCoverageApplyClamp = false,
                debug3dClearMagenta = false,
                retroArchShader = RetroArchShaderConfiguration(
                    presetPath = null,
                    sourceResolution = RetroArchShaderSourceResolution.VULKAN_IR,
                    passCount = 0,
                    sourceBytes = 0L,
                    parameterOverrides = emptyMap(),
                    clearHistory = false,
                ),
            ),
            dldiSdCardConfiguration = DldiSdCardConfiguration(
                enabled = false,
                imagePath = null,
                imageSize = 0,
                folderSync = false,
                folderPath = null,
            ),
        )
        assertEquals(0, defaultConfig.frameskipMode)
    }

    @Test
    fun migrateFrameskipDefaultToOffIfNeeded_resetsLegacyAutoOnceAndPreservesManualOrUserRechoice() {
        val autoPrefs = LocalSharedPreferences()
        autoPrefs.edit().putString("frameskip_mode", "auto").apply()
        SharedPreferencesSettingsRepository.migrateFrameskipDefaultToOffIfNeeded(autoPrefs)
        assertEquals("off", autoPrefs.getString("frameskip_mode", null))

        // If user explicitly re-enables Auto after upgrading to 8.8.6, subsequent launches must keep it
        autoPrefs.edit().putString("frameskip_mode", "auto").apply()
        SharedPreferencesSettingsRepository.migrateFrameskipDefaultToOffIfNeeded(autoPrefs)
        assertEquals("auto", autoPrefs.getString("frameskip_mode", null))

        val manualPrefs = LocalSharedPreferences()
        manualPrefs.edit().putString("frameskip_mode", "manual").apply()
        SharedPreferencesSettingsRepository.migrateFrameskipDefaultToOffIfNeeded(manualPrefs)
        assertEquals("manual", manualPrefs.getString("frameskip_mode", null))
    }

    @Test
    fun xmlAndRussianStrings_disableDefaultFrameskipAndUseFullVyklucheno() {
        val prefSystem = resolveRepoPath("app/src/main/res/xml/pref_system.xml").readText(Charsets.UTF_8)
        val frameskipBlockRegex = Regex("""<ListPreference\b[^>]*android:key="frameskip_mode"[^>]*/>""", RegexOption.DOT_MATCHES_ALL)
        val match = frameskipBlockRegex.find(prefSystem)
        assertTrue("frameskip_mode ListPreference block must exist in pref_system.xml", match != null)
        assertTrue(
            "frameskip_mode must default to 'off' in pref_system.xml",
            match!!.value.contains("""android:defaultValue="off""""),
        )

        val ruDir = resolveRepoPath("app/src/main/res/values-b+ru")
        val standaloneVykl = Regex("""(?<![А-Яа-яЁё])выкл\.?(?![А-Яа-яЁё])""", RegexOption.IGNORE_CASE)
        val ruXmlFiles = ruDir.listFiles { f -> f.isFile && f.extension == "xml" }?.sortedBy { it.name }.orEmpty()
        assertTrue("Expected Russian XML string files in values-b+ru", ruXmlFiles.isNotEmpty())
        for (file in ruXmlFiles) {
            val content = file.readText(Charsets.UTF_8)
            val hit = standaloneVykl.find(content)
            assertFalse(
                "Found standalone 'Выкл' in ${file.name}: '${hit?.value}'",
                hit != null,
            )
        }
    }

    @Test
    fun settingsDialogsAndNativePerfGuards_match887Contract() {
        val dialogsKt = resolveRepoPath(
            "app/src/main/java/me/magnum/melonds/ui/settings/dialogs/SettingsComposeDialogs.kt",
        ).readText(Charsets.UTF_8)
        val headerStart = dialogsKt.indexOf("// Header Bar")
        val headerEnd = dialogsKt.indexOf("// Divider", headerStart)
        assertTrue("Could not locate SettingsDialogScaffold header block", headerStart >= 0 && headerEnd > headerStart)
        val headerBlock = dialogsKt.substring(headerStart, headerEnd)
        assertFalse("Dialog header must not truncate title/subtitle to 1 line", headerBlock.contains("maxLines = 1"))

        val melonInstance = resolveRepoPath("app/src/main/cpp/MelonInstance.cpp").readText(Charsets.UTF_8)
        val miPerfStart = melonInstance.indexOf("static bool perfForzadoPorPropiedadMI()")
        val miPerfEnd = melonInstance.indexOf("FrameQueuePolicy makeLegacyFrameQueuePolicy()", miPerfStart)
        assertTrue("Could not locate perfForzadoPorPropiedadMI()", miPerfStart >= 0 && miPerfEnd > miPerfStart)
        val miPerfBlock = melonInstance.substring(miPerfStart, miPerfEnd)
        assertTrue("perfForzadoPorPropiedadMI must require debug.melonds.perf == '1'", miPerfBlock.contains("v[0] == '1'"))
        assertTrue(
            "Presenter high-res realtime budget floor must be 6ms",
            melonInstance.contains("kVulkanHighResolutionRealtimePresenterBudgetFloorNs = 6'000'000ull"),
        )
        assertTrue(
            "Realtime not-ready wait cap must be 12ms",
            melonInstance.contains("kVulkanRealtimeNotReadyWaitCapNs = 12'000'000ull"),
        )
        assertTrue(
            "Not-ready presenter timeout branch must cap waits at kVulkanRealtimeNotReadyWaitCapNs",
            melonInstance.contains("return std::min(candidateBudgetNs, kVulkanRealtimeNotReadyWaitCapNs);"),
        )

        val gpu3d = resolveRepoPath("melonDS-android-lib/src/GPU3D_Vulkan.cpp").readText(Charsets.UTF_8)
        val r3dPerfStart = gpu3d.indexOf("static bool perfForzadoPorPropiedadR3D()")
        val r3dPerfEnd = gpu3d.indexOf("void VulkanRenderer3D::logPerformanceIfNeeded()", r3dPerfStart)
        assertTrue("Could not locate perfForzadoPorPropiedadR3D()", r3dPerfStart >= 0 && r3dPerfEnd > r3dPerfStart)
        val r3dPerfBlock = gpu3d.substring(r3dPerfStart, r3dPerfEnd)
        assertTrue("perfForzadoPorPropiedadR3D must require debug.melonds.perf == '1'", r3dPerfBlock.contains("v[0] == '1'"))

        val eagerStart = gpu3d.indexOf("const bool eagerNativeProjectionSubmitted =")
        val eagerEnd = gpu3d.indexOf("if (eagerNativeProjectionSubmitted && prefetchNativeForCompose)", eagerStart)
        assertTrue("Could not locate eagerNativeProjectionSubmitted", eagerStart >= 0 && eagerEnd > eagerStart)
        val eagerBlock = gpu3d.substring(eagerStart, eagerEnd)
        assertFalse(
            "eagerNativeProjectionSubmitted must not trigger extra 1x 3D projection for every 3D polygon frame",
            eagerBlock.contains("RenderNumPolygons"),
        )

        val g1Idx = gpu3d.indexOf("\"VulkanG1: sinEscritura=")
        assertTrue("Could not locate VulkanG1 log", g1Idx > 200)
        val g1Context = gpu3d.substring((g1Idx - 420).coerceAtLeast(0), g1Idx)
        assertTrue("VulkanG1 log must be gated by areRendererDebugToolsEnabled()", g1Context.contains("areRendererDebugToolsEnabled()"))

        val outputHeader = resolveRepoPath("app/src/main/cpp/renderer/VulkanOutput.h").readText(Charsets.UTF_8)
        val outputCpp = resolveRepoPath("app/src/main/cpp/renderer/VulkanOutput.cpp").readText(Charsets.UTF_8)
        assertTrue(
            "VulkanOutput.h must track whether timestamps were actually recorded in command buffer",
            outputHeader.contains("bool timestampRecordedInCommandBuffer{false};"),
        )
        assertTrue(
            "VulkanOutput.cpp must gate query pool resets via shouldRecordOutputGpuTimestamps",
            outputCpp.contains("shouldRecordOutputGpuTimestamps(faithfulPassTimingSessionEnabled)"),
        )
        assertTrue(
            "VulkanOutput.cpp submitFrameCommand must require timestampRecordedInCommandBuffer",
            outputCpp.contains("resource.timestampRecordedInCommandBuffer"),
        )

        val cpuPolicyCpp = resolveRepoPath("app/src/main/cpp/EmulationThreadCpuPolicy.cpp").readText(Charsets.UTF_8)
        assertTrue(
            "CPU policy must fall back to cpufreq/cpuinfo_max_freq when cpu_capacity is missing",
            cpuPolicyCpp.contains("/cpufreq/cpuinfo_max_freq"),
        )
        assertTrue(
            "CPU policy must fall back to cpufreq/scaling_max_freq when cpu_capacity is missing",
            cpuPolicyCpp.contains("/cpufreq/scaling_max_freq"),
        )

        val coordinatorKt = resolveRepoPath(
            "app/src/main/java/me/magnum/melonds/ui/emulator/render/VulkanFrameRenderCoordinator.kt",
        ).readText(Charsets.UTF_8)
        assertTrue(
            "VulkanFrameRenderCoordinator must perform a short park retry on not-ready",
            coordinatorKt.contains("LockSupport.parkNanos(NOT_READY_RETRY_PARK_NS)"),
        )
        assertTrue(
            "VulkanFrameRenderCoordinator must schedule a coalesced catchup retry instead of dropping the VSync",
            coordinatorKt.contains("schedulePresentationCatchupRetry(permit)"),
        )
    }
}
