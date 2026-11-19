# Vulkan SPIR-V Regeneration

This project keeps Vulkan shaders precompiled in-repo as C headers (targeting `--target-env=vulkan1.0 -O`):

### 3D Engine Shaders (`melonDS-android-lib/src/`)
- `melonDS-android-lib/src/GPU3D_Vulkan_InterpSpansShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_BinCombinedShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_CalculateWorkOffsetsShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_SortWorkShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_TriRasterShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_TriRasterBaseShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_TriRasterCompatShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_DepthBlendShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_FinalPassShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_CaptureLineExportShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShaderVertexData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShaderFragmentData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthShaderFragmentData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectShaderFragmentData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateShaderFragmentData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateToonShaderFragmentData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulatePlainShaderFragmentData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaToonShaderFragmentData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaPlainShaderFragmentData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrShaderFragmentData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaPlainColorOnlyShaderFragmentData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsNoColorShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsClearShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsFinalShaderVertexData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsEdgeShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsEdgeFogShaderData.h`
- `melonDS-android-lib/src/GPU3D_Vulkan_GraphicsFogShaderData.h`

### Compatibility Profile 3D Shaders (`melonDS-android-lib/src/compatibility/`)
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_TriRasterBaseShaderData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_CaptureLineExportShaderData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsRasterShaderFragmentData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsRasterNoFragDepthShaderFragmentData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectShaderFragmentData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateShaderFragmentData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateToonShaderFragmentData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulatePlainShaderFragmentData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaToonShaderFragmentData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaPlainShaderFragmentData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsNoColorShaderData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsEdgeShaderData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsEdgeFogShaderData.h`
- `melonDS-android-lib/src/compatibility/GPU3D_Vulkan_GraphicsFogShaderData.h`

### Android Compositor & Presenter Shaders (`app/src/main/cpp/renderer/`)
- `app/src/main/cpp/renderer/VulkanCompositorShaderData.h`
- `app/src/main/cpp/renderer/VulkanCompositorCompatibilityShaderData.h`
- `app/src/main/cpp/renderer/VulkanAccumulate3dShaderData.h`
- `app/src/main/cpp/renderer/VulkanAccumulate3dCompatibilityShaderData.h`
- `app/src/main/cpp/renderer/VulkanAccumulate3dScale8ShaderData.h`
- `app/src/main/cpp/renderer/VulkanSurfacePresenterVertexShaderData.h`
- `app/src/main/cpp/renderer/VulkanSurfacePresenterFragmentShaderData.h`
- `app/src/main/cpp/renderer/VulkanSurfacePresenterCompatibilityFragmentShaderData.h`

## Automatic Flow (recommended)

Vulkan shader headers are regenerated automatically during native/app builds:

- CMake target: `regenerate_vulkan_spirv_headers`
- Gradle task: `:app:regenerateVulkanSpirv`
- `preBuild` depends on `:app:regenerateVulkanSpirv`

This means a normal app build updates out-of-date `*ShaderData.h` automatically.

## Manual Commands

To force regeneration of Vulkan shader headers from `.comp`, `.vert`, and `.frag` sources:

```bash
./gradlew :app:regenerateVulkanSpirv
```

To verify that committed headers are in sync (without writing files), run:

```bash
./gradlew :app:checkVulkanSpirv
```

Requirements:

- `glslc` (preferred), or `glslangValidator`
- `xxd`

Compiler detection order in `scripts/regenerate_vulkan_spirv.sh`:

1. `glslc` in `PATH`
2. `$ANDROID_NDK_HOME/shader-tools/*/glslc` (or `$ANDROID_NDK_ROOT/...`)
3. `glslangValidator` in `PATH`


### Updated: Shader headers for Vulkan compatibility fixes.
