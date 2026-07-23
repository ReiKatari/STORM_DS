package me.magnum.melonds.domain.model

import me.magnum.melonds.common.retroarch.RetroArchShaderPreset

data class RetroArchShaderConfiguration(
    val presetPath: String?,
    val sourceResolution: RetroArchShaderSourceResolution,
    val passCount: Int,
    val sourceBytes: Long,
    val parameterOverrides: Map<String, Float>,
    val clearHistory: Boolean,
) {
    val estimatedCompileMillis: Long
        get() = RetroArchShaderPreset.Weight(passCount, sourceBytes).estimatedCompileMillis
}
