package me.magnum.melonds.impl

import me.magnum.melonds.domain.model.LiteRecommendationReason
import me.magnum.melonds.domain.model.PerformanceMode
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
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
}
