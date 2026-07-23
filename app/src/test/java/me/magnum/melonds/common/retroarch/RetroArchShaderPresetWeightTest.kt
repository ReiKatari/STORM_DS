package me.magnum.melonds.common.retroarch

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RetroArchShaderPresetWeightTest {

    @Test
    fun followsReferenceChainToFindTheRealPasses() {
        val files = mapOf(
            "bezel/Presets/EASYMODE.slangp" to """
                #reference "Root_Presets/EASYMODE.slangp"
                #reference "../../resource/param_values/base/auto-settings.params"
            """.trimIndent(),
            "bezel/Presets/Root_Presets/EASYMODE.slangp" to """
                shaders = 2
                shader0 = ../../shaders/pass0.slang
                shader1 = ../../shaders/pass1.slang
            """.trimIndent(),
            "bezel/shaders/pass0.slang" to "x".repeat(1000),
            "bezel/shaders/pass1.slang" to "y".repeat(2000),
        )
        val read = { path: String -> files[path] }

        assertEquals(0, RetroArchShaderPreset.passCount(RetroArchShaderPreset.parseAssignments(files.getValue("bezel/Presets/EASYMODE.slangp"))))

        val weight = RetroArchShaderPreset.weigh("bezel/Presets/EASYMODE.slangp", read)
        assertEquals(2, weight.passCount)
        assertEquals(3000L, weight.sourceBytes)
    }

    @Test
    fun countsTheIncludeClosureOnce() {
        val files = mapOf(
            "crt/preset.slangp" to """
                shaders = 1
                shader0 = shaders/main.slang
            """.trimIndent(),
            "crt/shaders/main.slang" to """
                #include "common.inc"
                #include "common.inc"
            """.trimIndent(),
            "crt/shaders/common.inc" to "z".repeat(500),
        )

        val weight = RetroArchShaderPreset.weigh("crt/preset.slangp") { files[it] }
        assertEquals(1, weight.passCount)
        assertEquals(files.getValue("crt/shaders/main.slang").length + 500L, weight.sourceBytes)
    }

    @Test
    fun aDerivedPresetOverridesTheReferencedOne() {
        val files = mapOf(
            "a/derived.slangp" to """
                #reference "base.slangp"
                shader0 = shaders/override.slang
            """.trimIndent(),
            "a/base.slangp" to """
                shaders = 1
                shader0 = shaders/base.slang
            """.trimIndent(),
            "a/shaders/override.slang" to "o".repeat(700),
            "a/shaders/base.slang" to "b".repeat(100),
        )

        val weight = RetroArchShaderPreset.weigh("a/derived.slangp") { files[it] }
        assertEquals(700L, weight.sourceBytes)
    }

    @Test
    fun survivesAReferenceCycle() {
        val files = mapOf(
            "a.slangp" to "#reference \"b.slangp\"",
            "b.slangp" to "#reference \"a.slangp\"",
        )

        val weight = RetroArchShaderPreset.weigh("a.slangp") { files[it] }
        assertEquals(0, weight.passCount)
    }

    @Test
    fun separatesTheMeasuredEndsOfTheLibrary() {
        val cheap = RetroArchShaderPreset.Weight(passCount = 1, sourceBytes = 2_725)
        val heavy = RetroArchShaderPreset.Weight(passCount = 43, sourceBytes = 1_512_519)

        assertTrue("cheap presets must stay well under a second", cheap.estimatedCompileMillis < 1_000)
        assertTrue("Mega Bezel must land in the minutes", heavy.estimatedCompileMillis > 300_000)
        assertTrue("and not overshoot the measured 471 s by much", heavy.estimatedCompileMillis < 600_000)
    }
}
