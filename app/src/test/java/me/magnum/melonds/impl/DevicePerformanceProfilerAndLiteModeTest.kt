package me.magnum.melonds.impl

import android.content.SharedPreferences
import me.magnum.melonds.domain.model.LiteRecommendationReason
import me.magnum.melonds.domain.model.PerformanceMode
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

class DevicePerformanceProfilerAndLiteModeTest {

    private fun resolveRepoPath(relativePath: String): File {
        var dir: File? = File(System.getProperty("user.dir") ?: ".")
        while (dir != null) {
            val candidate = File(dir, relativePath)
            if (candidate.exists()) return candidate
            dir = dir.parentFile
        }
        error("Could not locate repo file: $relativePath")
    }

    @Test
    fun performanceModePrefParsing_defaultsToAuto() {
        assertEquals(PerformanceMode.AUTO, PerformanceMode.fromPrefValue(null))
        assertEquals(PerformanceMode.AUTO, PerformanceMode.fromPrefValue("auto"))
        assertEquals(PerformanceMode.STANDARD, PerformanceMode.fromPrefValue("standard"))
        assertEquals(PerformanceMode.LITE, PerformanceMode.fromPrefValue("lite"))
        assertEquals(PerformanceMode.AUTO, PerformanceMode.fromPrefValue("unknown"))
    }

    @Test
    fun evaluateDevice_recommendsLiteOnHelioG25AndPowerVr64Bit() {
        val cores = List(8) { CpuCoreSignature(implementer = 0x41, part = 0xd03) }
        val profile = DevicePerformanceProfiler.evaluateDevice(
            DeviceHardwareSnapshot(
                is64BitProcess = true,
                gpuModel = "PowerVR Rogue GE8320",
                socModel = "MT6765V/CB Helio G25",
                glEsMajor = 3,
                glEsMinor = 2,
                totalRamMb = 3072,
                isLowRamDevice = false,
                sdkInt = 31,
                cpuCoreCount = 8,
                cpuCores = cores,
            ),
        )
        assertTrue(profile.recommendsLiteMode)
        assertEquals(LiteRecommendationReason.LEGACY_GPU_POWERVR, profile.reasonCode)
        assertTrue(profile.recommendedSoftThreaded)
    }

    @Test
    fun evaluateDevice_recommendsLiteOn32BitHelioG25DueToNoJit() {
        val profile = DevicePerformanceProfiler.evaluateDevice(
            DeviceHardwareSnapshot(
                is64BitProcess = false,
                gpuModel = "PowerVR Rogue GE8320",
                socModel = "mt6765",
                glEsMajor = 3,
                glEsMinor = 2,
                totalRamMb = 2048,
                isLowRamDevice = false,
                sdkInt = 29,
                cpuCoreCount = 8,
            ),
        )
        assertTrue(profile.recommendsLiteMode)
        assertEquals(LiteRecommendationReason.ABI_32_BIT_NO_JIT, profile.reasonCode)
    }

    @Test
    fun evaluateDevice_recommendsLiteOnMaliT880Gles32AndGles31() {
        val gles32 = DevicePerformanceProfiler.evaluateDevice(
            DeviceHardwareSnapshot(
                is64BitProcess = true,
                gpuModel = "Mali-T880",
                socModel = "exynos8890",
                glEsMajor = 3,
                glEsMinor = 2,
                totalRamMb = 4096,
                isLowRamDevice = false,
                sdkInt = 26,
                cpuCoreCount = 8,
            ),
        )
        assertTrue(gles32.recommendsLiteMode)
        assertEquals(LiteRecommendationReason.LEGACY_GPU_MALI_MIDGARD, gles32.reasonCode)

        val gles31 = DevicePerformanceProfiler.evaluateDevice(
            DeviceHardwareSnapshot(
                is64BitProcess = true,
                gpuModel = "Mali-T880 MP4",
                socModel = "mt6797",
                glEsMajor = 3,
                glEsMinor = 1,
                totalRamMb = 4096,
                isLowRamDevice = false,
                sdkInt = 25,
                cpuCoreCount = 10,
            ),
        )
        assertTrue(gles31.recommendsLiteMode)
        assertEquals(LiteRecommendationReason.LEGACY_GPU_MALI_MIDGARD, gles31.reasonCode)
    }

    @Test
    fun evaluateDevice_recommendsLiteOnLegacyAdrenoAndAllLittleFallback() {
        val adreno506 = DevicePerformanceProfiler.evaluateDevice(
            DeviceHardwareSnapshot(
                is64BitProcess = true,
                gpuModel = "Adreno (TM) 506",
                socModel = "msm8953",
                glEsMajor = 3,
                glEsMinor = 2,
                totalRamMb = 3072,
                isLowRamDevice = false,
                sdkInt = 28,
                cpuCoreCount = 8,
            ),
        )
        assertTrue(adreno506.recommendsLiteMode)
        assertEquals(LiteRecommendationReason.LEGACY_GPU_ADRENO, adreno506.reasonCode)

        val unknownAllA53 = DevicePerformanceProfiler.evaluateDevice(
            DeviceHardwareSnapshot(
                is64BitProcess = true,
                gpuModel = "Unknown Vendor",
                socModel = "custom-board",
                glEsMajor = 3,
                glEsMinor = 2,
                totalRamMb = 4096,
                isLowRamDevice = false,
                sdkInt = 30,
                cpuCoreCount = 4,
                cpuCores = List(4) { CpuCoreSignature(implementer = 0x41, part = 0xd03) },
            ),
        )
        assertTrue(unknownAllA53.recommendsLiteMode)
        assertEquals(LiteRecommendationReason.WEAK_CPU_ALL_LITTLE, unknownAllA53.reasonCode)
    }

    @Test
    fun evaluateDevice_keepsStandardModeForRealmeAdreno619FlagshipsAndModernMali() {
        val realme619 = DevicePerformanceProfiler.evaluateDevice(
            DeviceHardwareSnapshot(
                is64BitProcess = true,
                gpuModel = "Adreno (TM) 619",
                socModel = "sm6375 RMX3472",
                glEsMajor = 3,
                glEsMinor = 2,
                totalRamMb = 6144,
                isLowRamDevice = false,
                sdkInt = 33,
                cpuCoreCount = 8,
                cpuCores = listOf(
                    CpuCoreSignature(0x51, 0x805),
                    CpuCoreSignature(0x51, 0x804),
                ),
            ),
        )
        assertFalse(realme619.recommendsLiteMode)
        assertEquals(LiteRecommendationReason.NONE, realme619.reasonCode)

        val s25Ultra = DevicePerformanceProfiler.evaluateDevice(
            DeviceHardwareSnapshot(
                is64BitProcess = true,
                gpuModel = "Adreno (TM) 830",
                socModel = "SM8750",
                glEsMajor = 3,
                glEsMinor = 2,
                totalRamMb = 12288,
                isLowRamDevice = false,
                sdkInt = 35,
                cpuCoreCount = 8,
            ),
        )
        assertFalse(s25Ultra.recommendsLiteMode)
        assertEquals(LiteRecommendationReason.NONE, s25Ultra.reasonCode)

        val modernMali = DevicePerformanceProfiler.evaluateDevice(
            DeviceHardwareSnapshot(
                is64BitProcess = true,
                gpuModel = "Mali-G710 MC10",
                socModel = "mt6895",
                glEsMajor = 3,
                glEsMinor = 2,
                totalRamMb = 8192,
                isLowRamDevice = false,
                sdkInt = 34,
                cpuCoreCount = 8,
                cpuCores = listOf(
                    CpuCoreSignature(0x41, 0xd05),
                    CpuCoreSignature(0x41, 0xd47),
                ),
            ),
        )
        assertFalse(modernMali.recommendsLiteMode)
        assertEquals(LiteRecommendationReason.NONE, modernMali.reasonCode)
    }

    @Test
    fun parseProcCpuInfoSignatures_readsHexPairs() {
        val sample = """
            processor	: 0
            CPU implementer	: 0x41
            CPU part	: 0xd03

            processor	: 1
            CPU implementer	: 0x41
            CPU part	: 0xd08
        """.trimIndent()
        val parsed = DevicePerformanceProfiler.parseProcCpuInfoSignatures(sample)
        assertEquals(
            listOf(
                CpuCoreSignature(0x41, 0xd03),
                CpuCoreSignature(0x41, 0xd08),
            ),
            parsed,
        )
    }

    @Test
    fun nativeLiteModeHooks_areIsolatedAndDefaultOff() {
        val gpuH = resolveRepoPath("melonDS-android-lib/src/GPU.h").readText(Charsets.UTF_8)
        assertTrue(gpuH.contains("bool LiteSkip2DRender = false;"))
        assertTrue(gpuH.contains("bool LiteSkipNext3DRender = false;"))
        assertTrue(gpuH.contains("bool LiteSkipped3DForNextFrame = false;"))

        val gpuCpp = resolveRepoPath("melonDS-android-lib/src/GPU.cpp").readText(Charsets.UTF_8)
        assertTrue(gpuCpp.contains("const bool skipLite2D =\n            LiteSkip2DRender && ((GPU2D_A.CaptureCnt & (1u << 31u)) == 0u);") ||
            gpuCpp.contains("LiteSkip2DRender && ((GPU2D_A.CaptureCnt & (1u << 31u)) == 0u)"))
        assertTrue(gpuCpp.contains("if (!LiteSkip2DRender)"))
        assertTrue(gpuCpp.contains("GPU2D_Renderer->DrawSprites(0, &GPU2D_A);"))

        val softH = resolveRepoPath("melonDS-android-lib/src/GPU3D_Soft.h").readText(Charsets.UTF_8)
        assertTrue(softH.contains("bool LiteFastMode = false;"))
        assertTrue(softH.contains("bool SkippedFrameRender = false;"))

        val softCpp = resolveRepoPath("melonDS-android-lib/src/GPU3D_Soft.cpp").readText(Charsets.UTF_8)
        assertTrue(softCpp.contains("if (LiteFastMode)\n        return;") || softCpp.contains("if (LiteFastMode)"))
        assertTrue(softCpp.contains("gpu.MarkLiteSkipped3DForNextFrame();"))

        val configH = resolveRepoPath("app/src/main/cpp/Configuration.h").readText(Charsets.UTF_8)
        assertTrue(configH.contains("bool liteModeEnabled = false;"))

        val configCpp = resolveRepoPath("app/src/main/cpp/MelonDSAndroidConfiguration.cpp").readText(Charsets.UTF_8)
        assertTrue(configCpp.contains("\"liteModeEnabled\""))

        val melonInstanceH = resolveRepoPath("app/src/main/cpp/MelonInstance.h").readText(Charsets.UTF_8)
        assertTrue(melonInstanceH.contains("bool liteFrameSkipped = false;"))
        assertTrue(melonInstanceH.contains("decidirFrameskipLite"))

        val melonInstanceCpp = resolveRepoPath("app/src/main/cpp/MelonInstance.cpp").readText(Charsets.UTF_8)
        assertTrue(melonInstanceCpp.contains("decidirFrameskipLite(frameskipSolicitado, fastForwardActive)"))
        assertTrue(melonInstanceCpp.contains("softRenderer.SetLiteFastMode("))
    }

    @Test
    fun performanceModeLocales_existInAll10LanguagesAndRespectTypographyRules() {
        val locales = listOf(
            "values",
            "values-b+ru",
            "values-de",
            "values-b+fr",
            "values-b+es",
            "values-b+it",
            "values-b+pt+BR",
            "values-b+id",
            "values-b+zh+Hans",
            "values-ja",
        )
        val requiredKeys = listOf(
            "performance_mode_title",
            "performance_mode_summary",
            "performance_mode_auto",
            "performance_mode_standard",
            "performance_mode_lite",
            "performance_mode_active_standard",
            "performance_mode_active_lite",
            "performance_mode_locked_by_lite",
        )
        val forbiddenDashes = listOf('\u2014', '\u2013', '\u2015', '\u2012')

        for (locale in locales) {
            val xml = resolveRepoPath("app/src/main/res/$locale/strings.xml").readText(Charsets.UTF_8)
            for (key in requiredKeys) {
                val match = Regex("<string name=\"$key\">(.*?)</string>").find(xml)
                assertTrue("Missing $key in $locale/strings.xml", match != null)
                val value = match!!.groupValues[1]
                assertFalse("Forbidden '&' in $locale:$key", value.contains('&'))
                for (dash in forbiddenDashes) {
                    assertFalse("Forbidden dash U+${dash.code.toString(16)} in $locale:$key", value.contains(dash))
                }
                if (locale == "values-b+ru") {
                    assertFalse("Standalone 'Выкл' forbidden in $locale:$key", Regex("\\bВыкл\\b").containsMatchIn(value))
                }
            }
        }
    }

    @Test
    fun liteSnapshot_standardToLiteToStandard_losslesslyRestoresValuesAndRemovesOriginallyAbsentKeys() {
        val prefs = InMemorySharedPreferences(
            linkedMapOf(
                "video_renderer" to "vulkan",
                "video_internal_resolution" to "4",
                "enable_threaded_rendering" to true,
                "video_filtering" to "quilez",
                "video_vulkan_fastpath_enabled" to true,
                "video_vulkan_drs" to true,
                "arm9_overclock" to "2",
                "frameskip_mode" to "off",
                "audio_interpolation" to "cubic",
                "audio_bitrate" to "bit16",
                "audio_latency" to "low",
                "audio_soft_limiter_enabled" to true,
                "audio_bass_boost_enabled" to true,
                "enable_rewind" to true,
                "unrelated_theme" to "dark",
            ),
        )
        // Intentionally leave some managed keys absent (e.g. audio_reverb_enabled, video_vulkan_ssao).
        assertFalse(prefs.contains("audio_reverb_enabled"))
        assertFalse(prefs.contains("video_vulkan_ssao"))

        val changedOnActivate = LiteModePreferenceSnapshotManager.activateLiteMode(
            prefs = prefs,
            recommendedSoftThreaded = true,
        )
        assertEquals(LiteModePreferenceSnapshotManager.MANAGED_KEYS, changedOnActivate)
        assertTrue(LiteModePreferenceSnapshotManager.isSnapshotActive(prefs))

        // Verify all managed keys switched to real Lite values in SharedPreferences.
        assertEquals("software", prefs.getString("video_renderer", null))
        assertEquals("1", prefs.getString("video_internal_resolution", null))
        assertEquals(true, prefs.getBoolean("enable_threaded_rendering", false))
        assertEquals("none", prefs.getString("video_filtering", null))
        assertEquals(false, prefs.getBoolean("video_vulkan_fastpath_enabled", true))
        assertEquals(false, prefs.getBoolean("video_vulkan_drs", true))
        assertEquals("1", prefs.getString("arm9_overclock", null))
        assertEquals("auto", prefs.getString("frameskip_mode", null))
        assertEquals("none", prefs.getString("audio_interpolation", null))
        assertEquals("bit10", prefs.getString("audio_bitrate", null))
        assertEquals("high", prefs.getString("audio_latency", null))
        assertEquals(false, prefs.getBoolean("audio_soft_limiter_enabled", true))
        assertEquals(false, prefs.getBoolean("audio_bass_boost_enabled", true))
        assertEquals(false, prefs.getBoolean("enable_rewind", true))
        assertEquals("dark", prefs.getString("unrelated_theme", null))

        // Deactivate (returning to Standard or Auto on capable hardware) and assert exact restore.
        val changedOnDeactivate = LiteModePreferenceSnapshotManager.deactivateLiteMode(prefs)
        assertEquals(LiteModePreferenceSnapshotManager.MANAGED_KEYS, changedOnDeactivate)
        assertFalse(LiteModePreferenceSnapshotManager.isSnapshotActive(prefs))
        assertFalse(prefs.contains(LiteModePreferenceSnapshotManager.KEY_SAVED_SNAPSHOT))

        assertEquals("vulkan", prefs.getString("video_renderer", null))
        assertEquals("4", prefs.getString("video_internal_resolution", null))
        assertEquals(true, prefs.getBoolean("enable_threaded_rendering", false))
        assertEquals("quilez", prefs.getString("video_filtering", null))
        assertEquals(true, prefs.getBoolean("video_vulkan_fastpath_enabled", false))
        assertEquals(true, prefs.getBoolean("video_vulkan_drs", false))
        assertEquals("2", prefs.getString("arm9_overclock", null))
        assertEquals("off", prefs.getString("frameskip_mode", null))
        assertEquals("cubic", prefs.getString("audio_interpolation", null))
        assertEquals("bit16", prefs.getString("audio_bitrate", null))
        assertEquals("low", prefs.getString("audio_latency", null))
        assertEquals(true, prefs.getBoolean("audio_soft_limiter_enabled", false))
        assertEquals(true, prefs.getBoolean("audio_bass_boost_enabled", false))
        assertEquals(true, prefs.getBoolean("enable_rewind", false))
        assertEquals("dark", prefs.getString("unrelated_theme", null))

        // Keys that were originally ABSENT must be removed rather than left as false/default.
        assertFalse(prefs.contains("audio_reverb_enabled"))
        assertFalse(prefs.contains("video_vulkan_ssao"))
        assertNull(prefs.all["audio_reverb_enabled"])
    }

    @Test
    fun liteSnapshot_repeatedActivate_doesNotOverwriteSavedStandardSnapshot() {
        val prefs = InMemorySharedPreferences(
            linkedMapOf(
                "video_renderer" to "opengl",
                "video_internal_resolution" to "3",
                "arm9_overclock" to "4",
                "frameskip_mode" to "manual",
            ),
        )

        LiteModePreferenceSnapshotManager.activateLiteMode(prefs, recommendedSoftThreaded = false)
        assertEquals("software", prefs.getString("video_renderer", null))
        assertEquals(false, prefs.getBoolean("enable_threaded_rendering", true))

        // Second activate call while already in Lite must not clobber the original Standard snapshot.
        val secondPass = LiteModePreferenceSnapshotManager.activateLiteMode(prefs, recommendedSoftThreaded = false)
        assertTrue(secondPass.isEmpty())

        LiteModePreferenceSnapshotManager.deactivateLiteMode(prefs)
        assertEquals("opengl", prefs.getString("video_renderer", null))
        assertEquals("3", prefs.getString("video_internal_resolution", null))
        assertEquals("4", prefs.getString("arm9_overclock", null))
        assertEquals("manual", prefs.getString("frameskip_mode", null))
    }

    @Test
    fun liteSnapshot_autoLiteToStandardAndBackAndZeroWritesOnCapableDevices() {
        val prefs = InMemorySharedPreferences(
            linkedMapOf(
                "video_renderer" to "opengl",
                "video_internal_resolution" to "2",
                "audio_latency" to "medium",
            ),
        )

        // Capable device starting in Auto/Standard with no snapshot -> deactivate is a strict zero-write no-op.
        val writesBefore = prefs.editCommits
        val deactivated = LiteModePreferenceSnapshotManager.deactivateLiteMode(prefs)
        assertTrue(deactivated.isEmpty())
        assertEquals(writesBefore, prefs.editCommits)
        assertFalse(LiteModePreferenceSnapshotManager.isSnapshotActive(prefs))

        // Simulate weak device (Auto -> Lite) -> switch to Standard -> switch back to Auto -> Standard again.
        LiteModePreferenceSnapshotManager.activateLiteMode(prefs, recommendedSoftThreaded = true)
        assertEquals("software", prefs.getString("video_renderer", null))

        LiteModePreferenceSnapshotManager.deactivateLiteMode(prefs)
        assertEquals("opengl", prefs.getString("video_renderer", null))
        assertEquals("2", prefs.getString("video_internal_resolution", null))
        assertEquals("medium", prefs.getString("audio_latency", null))

        LiteModePreferenceSnapshotManager.activateLiteMode(prefs, recommendedSoftThreaded = true)
        assertEquals("software", prefs.getString("video_renderer", null))
        assertEquals("auto", prefs.getString("frameskip_mode", null))
    }

    private class InMemorySharedPreferences(
        initial: Map<String, Any?> = emptyMap(),
    ) : SharedPreferences {
        private val data = LinkedHashMap<String, Any?>(initial)
        private val listeners = linkedSetOf<SharedPreferences.OnSharedPreferenceChangeListener>()
        var editCommits = 0
            private set

        override fun getAll(): MutableMap<String, *> = LinkedHashMap(data)

        override fun getString(key: String, defValue: String?): String? = data[key] as? String ?: defValue

        @Suppress("UNCHECKED_CAST")
        override fun getStringSet(key: String, defValues: MutableSet<String>?): MutableSet<String>? =
            (data[key] as? Set<String>)?.toMutableSet() ?: defValues

        override fun getInt(key: String, defValue: Int): Int = data[key] as? Int ?: defValue

        override fun getLong(key: String, defValue: Long): Long = data[key] as? Long ?: defValue

        override fun getFloat(key: String, defValue: Float): Float = data[key] as? Float ?: defValue

        override fun getBoolean(key: String, defValue: Boolean): Boolean = data[key] as? Boolean ?: defValue

        override fun contains(key: String): Boolean = data.containsKey(key)

        override fun edit(): SharedPreferences.Editor = object : SharedPreferences.Editor {
            private val pending = LinkedHashMap<String, Any?>()
            private val removals = LinkedHashSet<String>()
            private var clearAll = false

            override fun putString(key: String, value: String?) = apply {
                if (value == null) removals.add(key) else pending[key] = value
            }

            override fun putStringSet(key: String, values: MutableSet<String>?) = apply {
                if (values == null) removals.add(key) else pending[key] = LinkedHashSet(values)
            }

            override fun putInt(key: String, value: Int) = apply { pending[key] = value }

            override fun putLong(key: String, value: Long) = apply { pending[key] = value }

            override fun putFloat(key: String, value: Float) = apply { pending[key] = value }

            override fun putBoolean(key: String, value: Boolean) = apply { pending[key] = value }

            override fun remove(key: String) = apply { removals.add(key) }

            override fun clear() = apply { clearAll = true }

            override fun commit(): Boolean {
                val changed = LinkedHashSet<String>()
                if (clearAll) {
                    changed.addAll(data.keys)
                    data.clear()
                }
                for (k in removals) {
                    if (data.remove(k) != null || k in data) {
                        changed.add(k)
                    }
                }
                for ((k, v) in pending) {
                    data[k] = v
                    changed.add(k)
                }
                editCommits++
                changed.forEach { key ->
                    listeners.forEach { it.onSharedPreferenceChanged(this@InMemorySharedPreferences, key) }
                }
                return true
            }

            override fun apply() {
                commit()
            }
        }

        override fun registerOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener) {
            listeners.add(listener)
        }

        override fun unregisterOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener) {
            listeners.remove(listener)
        }
    }
}
