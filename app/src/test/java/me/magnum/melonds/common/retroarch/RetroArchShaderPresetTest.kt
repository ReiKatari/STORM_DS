package me.magnum.melonds.common.retroarch

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class RetroArchShaderPresetTest {
    @Test
    fun detectsRetroTilesStylePresetAsNativeDsSource() {
        val files = mapOf(
            "handheld/retro-tiles.slangp" to """
                shaders = 1
                shader0 = shaders/retro-tiles.slang
                scale_type0 = viewport
            """.trimIndent(),
            "handheld/shaders/retro-tiles.slang" to """
                #version 450
                layout(push_constant) uniform Push {
                    vec4 SourceSize;
                    vec4 OutputSize;
                } params;

                void main() {
                    vec2 tile = fract(params.SourceSize.xy * params.OutputSize.zw);
                }
            """.trimIndent(),
        )

        assertTrue(
            RetroArchShaderPreset.requiresNativeDsSource("handheld/retro-tiles.slangp") { path ->
                files[path]
            },
        )
    }

    @Test
    fun keepsGenericViewportPresetOnVulkanIrSource() {
        val files = mapOf(
            "crt/generic.slangp" to """
                shaders = 1
                shader0 = shaders/generic.slang
                scale_type0 = viewport
            """.trimIndent(),
            "crt/shaders/generic.slang" to """
                #version 450
                layout(location = 0) out vec4 FragColor;

                void main() {
                    FragColor = vec4(1.0);
                }
            """.trimIndent(),
        )

        assertFalse(
            RetroArchShaderPreset.requiresNativeDsSource("crt/generic.slangp") { path ->
                files[path]
            },
        )
    }
}
