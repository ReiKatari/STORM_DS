#!/usr/bin/env bash

set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

find_ndk_glslc() {
  local ndk_root=""
  local sdk_root=""
  local shader_tools_dir=""
  local host_tag=""
  local candidate=""

  ndk_root="${ANDROID_NDK_HOME:-${ANDROID_NDK_ROOT:-${ANDROID_NDK:-}}}"
  if [[ -z "$ndk_root" ]]; then
    sdk_root="${ANDROID_SDK_ROOT:-${ANDROID_HOME:-}}"
    if [[ -n "$sdk_root" ]]; then
      if [[ -d "$sdk_root/ndk" ]]; then
        while IFS= read -r candidate; do
          if [[ -d "$candidate/shader-tools" ]]; then
            ndk_root="$candidate"
            break
          fi
        done < <(find "$sdk_root/ndk" -mindepth 1 -maxdepth 1 -type d 2>/dev/null | sort -r)
      fi

      if [[ -z "$ndk_root" && -d "$sdk_root/ndk-bundle/shader-tools" ]]; then
        ndk_root="$sdk_root/ndk-bundle"
      fi
    fi
  fi

  if [[ -z "$ndk_root" ]]; then
    return 1
  fi

  shader_tools_dir="$ndk_root/shader-tools"
  if [[ ! -d "$shader_tools_dir" ]]; then
    return 1
  fi

  case "$(uname -s)" in
    Darwin)
      host_tag="darwin-x86_64"
      ;;
    Linux)
      host_tag="linux-x86_64"
      ;;
    MINGW*|MSYS*|CYGWIN*)
      host_tag="windows-x86_64"
      ;;
  esac

  if [[ -n "$host_tag" ]]; then
    candidate="$shader_tools_dir/$host_tag/glslc"
    if [[ -x "$candidate" ]]; then
      echo "$candidate"
      return 0
    fi

    candidate="$shader_tools_dir/$host_tag/glslc.exe"
    if [[ -x "$candidate" ]]; then
      echo "$candidate"
      return 0
    fi
  fi

  while IFS= read -r candidate; do
    if [[ -x "$candidate" ]]; then
      echo "$candidate"
      return 0
    fi
  done < <(find "$shader_tools_dir" -maxdepth 2 -type f \( -name glslc -o -name glslc.exe \) 2>/dev/null | sort)

  return 1
}

if command -v glslc >/dev/null 2>&1; then
  SHADER_COMPILER=(glslc)
else
  NDK_GLSLC="$(find_ndk_glslc || true)"
  if [[ -n "$NDK_GLSLC" ]]; then
    SHADER_COMPILER=("$NDK_GLSLC")
  elif command -v glslangValidator >/dev/null 2>&1; then
    SHADER_COMPILER=(glslangValidator)
  else
    echo "No shader compiler found. Install 'glslc' or 'glslangValidator'." >&2
    echo "Tip: set ANDROID_NDK_HOME to an NDK containing shader-tools/glslc." >&2
    exit 1
  fi
fi

find_spirv_opt() {
  local candidate=""
  if command -v spirv-opt >/dev/null 2>&1; then
    command -v spirv-opt
    return 0
  fi

  candidate="$(command -v "${SHADER_COMPILER[0]}" 2>/dev/null || true)"
  if [[ -n "$candidate" ]]; then
    candidate="$(dirname "$candidate")/spirv-opt"
    if [[ -x "$candidate" ]]; then
      echo "$candidate"
      return 0
    fi
  fi

  return 1
}

SPIRV_OPT="$(find_spirv_opt || true)"

if ! command -v xxd >/dev/null 2>&1; then
  echo "Missing required tool: xxd" >&2
  exit 1
fi

MODE="write"
if [[ "${1:-}" == "--check" ]]; then
  MODE="check"
fi

compile_shader() {
  local source="$1"
  local stage="$2"
  local output="$3"
  shift 3
  if [[ "${SHADER_COMPILER[0]##*/}" == glslc* ]]; then
    "${SHADER_COMPILER[@]}" -fshader-stage="$stage" "$@" -o "$output" "$source"
  else
    "${SHADER_COMPILER[@]}" -V -S "$stage" "$@" -o "$output" "$source"
  fi
}

declare_dynamic_texture_indexing() {
  local module="$1"
  local byte_count
  byte_count="$(wc -c < "$module")"
  if (( byte_count < 20 || byte_count % 4 != 0 )); then
    echo "Invalid SPIR-V word stream: $module" >&2
    return 1
  fi
  if [[ "$(xxd -p -l 4 "$module")" != "03022307" ]]; then
    echo "Expected little-endian SPIR-V: $module" >&2
    return 1
  fi

  local offset=20
  local capability
  while true; do
    capability="$(xxd -p -s "$offset" -l 8 "$module")"

    if [[ "${capability:0:8}" != "11000200" ]]; then
      break
    fi
    if [[ "${capability:8:8}" == "1d000000" ]]; then
      return 0
    fi
    offset=$((offset + 8))
  done

  local declared_module
  declared_module="$(mktemp)"
  {
    dd if="$module" bs=4 count=5 2>/dev/null
    printf '\021\000\002\000\035\000\000\000'
    dd if="$module" bs=4 skip=5 2>/dev/null
  } > "$declared_module"
  mv "$declared_module" "$module"
}

generate_header() {
  local source="$1"
  local stage="$2"
  local symbol_name="$3"
  local output_header="$4"
  shift 4

  local requires_dynamic_indexing=0
  if [[ "${1:-}" == "--requires-dynamic-texture-indexing" ]]; then
    requires_dynamic_indexing=1
    shift
  fi

  local tmp_spv
  local tmp_header
  tmp_spv="$(mktemp)"
  tmp_header="$(mktemp)"

  compile_shader "$source" "$stage" "$tmp_spv" "$@"

  if [[ "${OPTIMIZE_SPIRV:-0}" == "1" ]]; then
    if [[ -z "$SPIRV_OPT" ]]; then
      echo "Missing required tool for optimized shader: spirv-opt" >&2
      exit 1
    fi
    local optimized_spv
    optimized_spv="$(mktemp)"
    "$SPIRV_OPT" -O --preserve-spec-constants "$tmp_spv" -o "$optimized_spv"
    mv "$optimized_spv" "$tmp_spv"
  fi

  if [[ "$requires_dynamic_indexing" == "1" ]]; then
    declare_dynamic_texture_indexing "$tmp_spv"
  fi

  {
    echo "#pragma once"
    echo "#include <cstddef>"
    xxd -i -n "$symbol_name" "$tmp_spv"
  } > "$tmp_header"

  if [[ "$MODE" == "check" ]]; then
    if ! cmp -s "$tmp_header" "$output_header"; then
      echo "Outdated shader header: $output_header" >&2
      rm -f "$tmp_spv" "$tmp_header"
      return 1
    fi
  else
    if [[ -f "$output_header" ]] && cmp -s "$tmp_header" "$output_header"; then
      echo "Unchanged $output_header"
    else
      mv "$tmp_header" "$output_header"
      echo "Updated $output_header"
    fi
  fi

  rm -f "$tmp_spv" "$tmp_header"
}

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_CaptureLineExportShader.comp" \
  "comp" \
  "melonDS_gpu3d_vulkan_capture_line_export_comp_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_CaptureLineExportShaderData.h"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.vert" \
  "vert" \
  "melonDS_gpu3d_vulkan_graphics_raster_vert_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShaderVertexData.h"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShaderFragmentData.h"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_direct_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterDirectShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthShaderFragmentData.h" \
  "-DMELONDS_NO_FRAG_DEPTH=1"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_NO_FRAG_DEPTH=1" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_NO_FRAG_DEPTH=1" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1" \
  "-DMELONDS_FAST_OPAQUE_MODULATE=1" \
  "-DMELONDS_FAST_TEXTURE_PUSH_CONSTANTS=1"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_toon_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateToonShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_NO_FRAG_DEPTH=1" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1" \
  "-DMELONDS_FAST_OPAQUE_MODULATE=1" \
  "-DMELONDS_FAST_TOON_MODE=1" \
  "-DMELONDS_FAST_TEXTURE_PUSH_CONSTANTS=1"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_plain_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulatePlainShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_NO_FRAG_DEPTH=1" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1" \
  "-DMELONDS_FAST_OPAQUE_MODULATE=1" \
  "-DMELONDS_FAST_TOON_MODE=2" \
  "-DMELONDS_FAST_TEXTURE_PUSH_CONSTANTS=1"

OPTIMIZE_SPIRV=1 generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_toon_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaToonShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_NO_FRAG_DEPTH=1" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1" \
  "-DMELONDS_FAST_OPAQUE_MODULATE=1" \
  "-DMELONDS_FAST_TOON_MODE=1" \
  "-DMELONDS_FAST_TEXTURE_PUSH_CONSTANTS=1" \
  "-DMELONDS_FAST_OPAQUE_FULL_ALPHA=1"

OPTIMIZE_SPIRV=1 generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_plain_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaPlainShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_NO_FRAG_DEPTH=1" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1" \
  "-DMELONDS_FAST_OPAQUE_MODULATE=1" \
  "-DMELONDS_FAST_TOON_MODE=2" \
  "-DMELONDS_FAST_TEXTURE_PUSH_CONSTANTS=1" \
  "-DMELONDS_FAST_OPAQUE_FULL_ALPHA=1" \
  "-DMELONDS_FAST_FLOAT_MODULATE=1"

OPTIMIZE_SPIRV=1 generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_fragment_depth_direct_fast_modulate_plain_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterFragmentDepthDirectFastModulatePlainShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1" \
  "-DMELONDS_FAST_OPAQUE_MODULATE=1" \
  "-DMELONDS_FAST_TOON_MODE=2" \
  "-DMELONDS_FAST_TEXTURE_PUSH_CONSTANTS=1"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_fragment_depth_direct_fast_modulate_opaque_alpha_plain_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterFragmentDepthDirectFastModulateOpaqueAlphaPlainShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1" \
  "-DMELONDS_FAST_OPAQUE_MODULATE=1" \
  "-DMELONDS_FAST_TOON_MODE=2" \
  "-DMELONDS_FAST_TEXTURE_PUSH_CONSTANTS=1" \
  "-DMELONDS_FAST_OPAQUE_FULL_ALPHA=1" \
  "-DMELONDS_FAST_FLOAT_MODULATE=1"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_plain_no_attr_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_NO_FRAG_DEPTH=1" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1" \
  "-DMELONDS_FAST_OPAQUE_MODULATE=1" \
  "-DMELONDS_FAST_TOON_MODE=2" \
  "-DMELONDS_FAST_TEXTURE_PUSH_CONSTANTS=1" \
  "-DMELONDS_FAST_OPAQUE_FULL_ALPHA=1" \
  "-DMELONDS_FAST_FLOAT_MODULATE=1" \
  "-DMELONDS_COLOR_ONLY=1"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_plain_color_only_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaPlainColorOnlyShaderFragmentData.h" \
  "--requires-dynamic-texture-indexing" \
  "-DMELONDS_NO_FRAG_DEPTH=1" \
  "-DMELONDS_DIRECT_TEXTURE_INDEXING=1" \
  "-DMELONDS_FAST_OPAQUE_MODULATE=1" \
  "-DMELONDS_FAST_TOON_MODE=2" \
  "-DMELONDS_FAST_TEXTURE_PUSH_CONSTANTS=1" \
  "-DMELONDS_FAST_OPAQUE_FULL_ALPHA=1" \
  "-DMELONDS_COLOR_ONLY=1"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsNoColorShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_no_color_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsNoColorShaderData.h"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsClearShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_clear_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsClearShaderData.h"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsFinalShader.vert" \
  "vert" \
  "melonDS_gpu3d_vulkan_graphics_final_vert_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsFinalShaderVertexData.h"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsEdgeShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_edge_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsEdgeShaderData.h"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsEdgeMarkAlphaShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_edge_mark_alpha_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsEdgeMarkAlphaShaderData.h" \
  "--requires-dynamic-texture-indexing"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsEdgeFogShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_edge_fog_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsEdgeFogShaderData.h"

generate_header \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsFogShader.frag" \
  "frag" \
  "melonDS_gpu3d_vulkan_graphics_fog_frag_spv" \
  "$ROOT_DIR/melonDS-android-lib/src/GPU3D_Vulkan_GraphicsFogShaderData.h"

generate_header \
  "$ROOT_DIR/app/src/main/cpp/renderer/VulkanFaithfulShader.comp" \
  "comp" \
  "melonDS_android_vulkan_faithful_comp_spv" \
  "$ROOT_DIR/app/src/main/cpp/renderer/VulkanFaithfulShaderData.h"

generate_header \
  "$ROOT_DIR/app/src/main/cpp/renderer/VulkanFaithfulObjScanlineShader.comp" \
  "comp" \
  "melonDS_android_vulkan_faithful_obj_scanline_comp_spv" \
  "$ROOT_DIR/app/src/main/cpp/renderer/VulkanFaithfulObjScanlineShaderData.h"

generate_header \
  "$ROOT_DIR/app/src/main/cpp/renderer/VulkanRenderer3dNativeProjectionShader.comp" \
  "comp" \
  "melonDS_android_vulkan_renderer3d_native_projection_comp_spv" \
  "$ROOT_DIR/app/src/main/cpp/renderer/VulkanRenderer3dNativeProjectionShaderData.h"

generate_header \
  "$ROOT_DIR/app/src/main/cpp/renderer/VulkanSurfacePresenter.vert" \
  "vert" \
  "melonDS_android_vulkan_surface_presenter_vert_spv" \
  "$ROOT_DIR/app/src/main/cpp/renderer/VulkanSurfacePresenterVertexShaderData.h"

generate_header \
  "$ROOT_DIR/app/src/main/cpp/renderer/VulkanSurfacePresenter.frag" \
  "frag" \
  "melonDS_android_vulkan_surface_presenter_frag_spv" \
  "$ROOT_DIR/app/src/main/cpp/renderer/VulkanSurfacePresenterFragmentShaderData.h"

if [[ "$MODE" == "check" ]]; then
  echo "Vulkan SPIR-V headers are up to date."
fi
