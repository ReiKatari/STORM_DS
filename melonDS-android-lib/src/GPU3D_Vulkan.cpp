/*
    Copyright 2016-2025 melonDS team

    This file is part of melonDS.

    melonDS is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.

    melonDS is distributed in the hope that it will be useful, but WITHOUT ANY
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
    FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with melonDS. If not, see http://www.gnu.org/licenses/.
*/

#include "GPU3D_Vulkan.h"
#include <atomic>
#include <cstdlib>
#ifdef __ANDROID__
#include <sys/system_properties.h>
#endif

#include "VulkanDispatch.h"

#include <algorithm>
#include <cmath>
#include <condition_variable>
#include <cstdio>
#include <cstring>
#include <functional>
#include <limits>
#include <optional>
#include <system_error>
#include <thread>
#if defined(__ANDROID__) || defined(__linux__)
#include <pthread.h>
#endif
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <vector>

#include "GPU.h"
#include "GPU3D_AcceleratedFrontend.h"
#include "GPU3D_Vulkan_CaptureLineExportShaderData.h"
#include "GPU3D_Vulkan_GraphicsEdgeFogShaderData.h"
#include "GPU3D_Vulkan_GraphicsEdgeMarkAlphaShaderData.h"
#include "GPU3D_Vulkan_GraphicsEdgeShaderData.h"
#include "GPU3D_Vulkan_GraphicsFinalShaderVertexData.h"
#include "GPU3D_Vulkan_GraphicsFogShaderData.h"
#include "GPU3D_Vulkan_GraphicsClearShaderData.h"
#include "GPU3D_Vulkan_GraphicsNoColorShaderData.h"
#include "GPU3D_Vulkan_GraphicsRasterFragmentDepthDirectFastModulatePlainShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterFragmentDepthDirectFastModulateOpaqueAlphaPlainShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterDirectShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaPlainShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaPlainColorOnlyShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateOpaqueAlphaToonShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulatePlainShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectFastModulateToonShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterNoFragDepthDirectShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterNoFragDepthShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterShaderFragmentData.h"
#include "GPU3D_Vulkan_GraphicsRasterShaderVertexData.h"
#include "Platform.h"
#include "VulkanContext.h"
#include "VulkanRuntimeControls.h"
#include "version.h"

namespace MelonDSAndroid
{
bool isFastForwardActive();
bool areRendererDebugToolsEnabled();
bool areRendererDebugBgObjLogsEnabled();
bool isRenderer3DDebugFeatureEnabled(melonDS::u32 featureFlag);
bool areRenderer3DDebugControlsActive();
melonDS::u32 getVulkanDiagnosticFlags();
}

namespace melonDS
{

namespace
{
u64 AllocateRenderProductEpoch() noexcept
{
    static std::atomic<u64> nextEpoch{1u};
    u64 epoch = nextEpoch.fetch_add(1u, std::memory_order_relaxed);

    while (epoch == 0u)
        epoch = nextEpoch.fetch_add(1u, std::memory_order_relaxed);
    return epoch;
}
}

constexpr uint64_t kFenceWaitTimeoutNs = 2'000'000'000ull;
using Platform::Log;
using Platform::LogLevel;

namespace
{
constexpr u32 kPipelineCacheFileVersion = 4;
constexpr u32 kVulkanDiagnosticDisablePassiveRepeatCoverageExpand = 1u << 0u;
constexpr float kTriangleAreaEpsilon = 0.000001f;
constexpr float kTileOverlapEpsilon = 0.00001f;
constexpr u32 kWorkSortDispatchX = 0u;
constexpr u32 kWorkSortDispatchY = 1u;
constexpr u32 kWorkSortDispatchZ = 2u;
constexpr u32 kWorkRasterDispatchX = 3u;
constexpr u32 kWorkRasterDispatchY = 4u;
constexpr u32 kWorkRasterDispatchZ = 5u;
constexpr u32 kWorkActiveTileCount = 6u;
constexpr u32 kWorkActiveGroupCount = 7u;
constexpr u32 kWorkTileOffsetsBase = 8u;
constexpr u32 kCpuActiveTileDispatchMaxCoveragePercent = 90u;
constexpr VkFormat kGraphicsColorTargetFormat = VK_FORMAT_R8G8B8A8_UNORM;
constexpr VkFormat kGraphicsAttrTargetFormat = VK_FORMAT_R8G8B8A8_UNORM;
constexpr u32 kRenderer3DDebugFeatureRendererOutput = 1u << 0u;

struct PlainRearPlaneMaterial
{
    u32 Packed6A5 = 0u;
    u32 Rgba8 = 0u;
};

[[nodiscard]] u32 ExpandRenderColor5To6(u32 color5) noexcept
{
    u32 color6 = (color5 & 0x1Fu) << 1u;
    if (color6 != 0u)
        color6++;
    return color6;
}

[[nodiscard]] u32 CalculateRenderFogDensity(
    const GPU3D& gpu3d,
    u32 depth) noexcept
{
    u32 densityId = 0u;
    u32 densityFraction = 0u;
    if (depth >= gpu3d.RenderFogOffset)
    {

        depth -= gpu3d.RenderFogOffset;
        depth = (depth >> 2u) << gpu3d.RenderFogShift;
        densityId = depth >> 17u;
        if (densityId >= 32u)
        {
            densityId = 32u;
            densityFraction = 0u;
        }
        else
        {
            densityFraction = depth & 0x1FFFFu;
        }
    }

    u32 density =
        ((static_cast<u32>(gpu3d.RenderFogDensityTable[densityId])
              * (0x20000u - densityFraction))
            + (static_cast<u32>(gpu3d.RenderFogDensityTable[densityId + 1u])
                * densityFraction))
        >> 17u;
    if (density >= 127u)
        density = 128u;
    return density;
}

[[nodiscard]] PlainRearPlaneMaterial BuildPlainRearPlaneMaterial(
    const GPU3D& gpu3d) noexcept
{
    const u32 clearAttr1 = gpu3d.RenderClearAttr1;
    u32 r = ExpandRenderColor5To6(clearAttr1);
    u32 g = ExpandRenderColor5To6(clearAttr1 >> 5u);
    u32 b = ExpandRenderColor5To6(clearAttr1 >> 10u);
    u32 a = (clearAttr1 >> 16u) & 0x1Fu;

    const bool rearPlaneFogEnabled =
        (gpu3d.RenderDispCnt & (1u << 7u)) != 0u
        && (clearAttr1 & (1u << 15u)) != 0u;
    if (rearPlaneFogEnabled)
    {
        const u32 clearDepth =
            ((gpu3d.RenderClearAttr2 & 0x7FFFu) * 0x200u) + 0x1FFu;
        const u32 density = CalculateRenderFogDensity(gpu3d, clearDepth);
        const u32 inverseDensity = 128u - density;
        const u32 fogColor = gpu3d.RenderFogColor;
        const u32 fogR = ExpandRenderColor5To6(fogColor);
        const u32 fogG = ExpandRenderColor5To6(fogColor >> 5u);
        const u32 fogB = ExpandRenderColor5To6(fogColor >> 10u);
        const u32 fogA = (fogColor >> 16u) & 0x1Fu;

        if ((gpu3d.RenderDispCnt & (1u << 6u)) == 0u)
        {
            r = ((fogR * density) + (r * inverseDensity)) >> 7u;
            g = ((fogG * density) + (g * inverseDensity)) >> 7u;
            b = ((fogB * density) + (b * inverseDensity)) >> 7u;
        }
        a = ((fogA * density) + (a * inverseDensity)) >> 7u;
    }

    PlainRearPlaneMaterial material{};
    material.Packed6A5 = r | (g << 8u) | (b << 16u) | (a << 24u);

    const u32 r8 = (r << 2u) | (r >> 4u);
    const u32 g8 = (g << 2u) | (g >> 4u);
    const u32 b8 = (b << 2u) | (b >> 4u);
    const u32 a8 = (a << 3u) | (a >> 2u);
    material.Rgba8 = r8 | (g8 << 8u) | (b8 << 16u) | (a8 << 24u);
    return material;
}

struct EmbeddedShader
{
    const unsigned char* bytes = nullptr;
    size_t length = 0;
};

constexpr u32 kRenderer3DDebugFeatureTrianglePolygons = 1u << 1u;
constexpr u32 kRenderer3DDebugFeatureLinePolygons = 1u << 2u;
constexpr u32 kRenderer3DDebugFeatureOpaquePolygons = 1u << 3u;
constexpr u32 kRenderer3DDebugFeatureTranslucentPolygons = 1u << 4u;
constexpr u32 kRenderer3DDebugFeatureShadowMaskPolygons = 1u << 5u;
constexpr u32 kRenderer3DDebugFeatureShadowPolygons = 1u << 6u;
constexpr u32 kRenderer3DDebugFeatureTexturedPolygons = 1u << 7u;
constexpr u32 kRenderer3DDebugFeatureUntexturedPolygons = 1u << 8u;
constexpr u32 kRenderer3DDebugFeatureModulatePolygons = 1u << 9u;
constexpr u32 kRenderer3DDebugFeatureDecalPolygons = 1u << 10u;
constexpr u32 kRenderer3DDebugFeatureToonHighlightPolygons = 1u << 11u;
constexpr u32 kRenderer3DDebugFeatureWBufferPolygons = 1u << 12u;
constexpr u32 kRenderer3DDebugFeatureZBufferPolygons = 1u << 13u;
constexpr u32 kRenderer3DDebugFeatureDepthWritePolygons = 1u << 14u;
constexpr u32 kRenderer3DDebugFeatureFogWritePolygons = 1u << 15u;
constexpr u32 kRenderer3DDebugFeatureUpperBand = 1u << 16u;
constexpr u32 kRenderer3DDebugFeatureMiddleBand = 1u << 17u;
constexpr u32 kRenderer3DDebugFeatureLowerBand = 1u << 18u;

bool Renderer3DDebugShouldDrawPolygon(
    const AcceleratedPolygonMeta& polygonMeta,
    bool isLine,
    bool polygonTextured,
    bool highlightEnabled)
{
    if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureRendererOutput))
        return false;

    if (isLine)
    {
        if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureLinePolygons))
            return false;
    }
    else if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureTrianglePolygons))
    {
        return false;
    }

    if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagShadowMask))
    {
        if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureShadowMaskPolygons))
            return false;
    }
    else if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagShadow))
    {
        if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureShadowPolygons))
            return false;
    }
    else
    {
        const u32 alpha5 = polygonMeta.Alpha5;
        const bool translucent = HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagTranslucent)
            || (alpha5 != 0u && alpha5 < 0x1Fu);
        if (translucent)
        {
            if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureTranslucentPolygons))
                return false;
        }
        else if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureOpaquePolygons))
        {
            return false;
        }
    }

    if (polygonTextured)
    {
        if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureTexturedPolygons))
            return false;
    }
    else if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureUntexturedPolygons))
    {
        return false;
    }

    const u32 blendMode = (polygonMeta.PolyAttr >> 4u) & 0x3u;
    if (blendMode == 2u)
    {
        (void)highlightEnabled;
        if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureToonHighlightPolygons))
            return false;
    }
    else if (polygonTextured && (blendMode & 0x1u) != 0u)
    {
        if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureDecalPolygons))
            return false;
    }
    else if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureModulatePolygons))
    {
        return false;
    }

    if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagWBuffer))
    {
        if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureWBufferPolygons))
            return false;
    }
    else if (!MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureZBufferPolygons))
    {
        return false;
    }

    if ((polygonMeta.PolyAttr & (1u << 11u)) != 0u
        && !MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureDepthWritePolygons))
    {
        return false;
    }

    if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagFogWrite)
        && !MelonDSAndroid::isRenderer3DDebugFeatureEnabled(kRenderer3DDebugFeatureFogWritePolygons))
    {
        return false;
    }

    return true;
}

bool Renderer3DDebugYBoundsEnabled(u32 packedYBounds, u32 targetHeight)
{
    if (!MelonDSAndroid::areRenderer3DDebugControlsActive())
        return true;

    u32 yTop = packedYBounds & 0xFFFFu;
    u32 yBottom = (packedYBounds >> 16u) & 0xFFFFu;
    yTop = std::min(yTop, targetHeight);
    yBottom = std::min(yBottom, targetHeight);
    if (yBottom <= yTop)
        yBottom = std::min(targetHeight, yTop + 1u);

    const u32 upperEnd = targetHeight / 3u;
    const u32 middleEnd = (targetHeight * 2u) / 3u;
    bool touchesAnyBand = false;
    const auto allowsBand = [&](u32 bandTop, u32 bandBottom, u32 featureFlag) -> bool {
        if (yTop >= bandBottom || yBottom <= bandTop)
            return false;
        touchesAnyBand = true;
        return MelonDSAndroid::isRenderer3DDebugFeatureEnabled(featureFlag);
    };

    if (allowsBand(0u, upperEnd, kRenderer3DDebugFeatureUpperBand))
        return true;
    if (allowsBand(upperEnd, middleEnd, kRenderer3DDebugFeatureMiddleBand))
        return true;
    if (allowsBand(middleEnd, targetHeight, kRenderer3DDebugFeatureLowerBand))
        return true;

    return !touchesAnyBand;
}

void logCaptureDebugState(
    const char* stage,
    bool exactCaptureOnly,
    bool captureLinePending,
    bool captureLineReady,
    bool hasCpuFrame,
    bool exactLineFresh,
    bool usedPreviousValidFill,
    bool usedFallbackFill,
    const std::array<u32, 256 * 192>& lineCache,
    u32& remainingLogs)
{
    if (!MelonDSAndroid::areRendererDebugToolsEnabled() || remainingLogs == 0)
        return;

    const u32 topLeft = lineCache[0];
    const u32 topMid = lineCache[128];
    const u32 center = lineCache[(96u * 256u) + 128u];
    Platform::Log(
        Platform::LogLevel::Warn,
        "VulkanCapture[%s]: exact=%u pending=%u ready=%u hasCpu=%u fresh=%u fallback=%u topLeft=%08X topMid=%08X center=%08X remaining=%u",
        stage,
        exactCaptureOnly ? 1u : 0u,
        captureLinePending ? 1u : 0u,
        captureLineReady ? 1u : 0u,
        hasCpuFrame ? 1u : 0u,
        exactLineFresh ? 1u : 0u,
        usedPreviousValidFill ? 2u : (usedFallbackFill ? 1u : 0u),
        topLeft,
        topMid,
        center,
        remainingLogs
    );
    remainingLogs--;
}

u64 fnv1a64(const char* value)
{
    constexpr u64 kOffsetBasis = 14695981039346656037ull;
    constexpr u64 kPrime = 1099511628211ull;

    u64 hash = kOffsetBasis;
    if (value == nullptr)
        return hash;

    for (const unsigned char* cursor = reinterpret_cast<const unsigned char*>(value); *cursor != 0; cursor++)
    {
        hash ^= static_cast<u64>(*cursor);
        hash *= kPrime;
    }

    return hash;
}

inline float edgeFunction2D(float ax, float ay, float bx, float by, float px, float py)
{
    return (px - ax) * (by - ay) - (py - ay) * (bx - ax);
}

struct EdgeEquation2D
{
    float a;
    float b;
    float c;
};

inline EdgeEquation2D makeEdgeEquation2D(float ax, float ay, float bx, float by)
{
    return {
        by - ay,
        ax - bx,
        (bx * ay) - (ax * by),
    };
}

inline float evaluateEdge2D(const EdgeEquation2D& edge, float px, float py)
{
    return edge.a * px + edge.b * py + edge.c;
}

inline bool edgeSeparatesTile(float e0, float e1, float e2, float e3, bool positiveArea)
{
    if (positiveArea)
        return e0 < -kTileOverlapEpsilon && e1 < -kTileOverlapEpsilon && e2 < -kTileOverlapEpsilon && e3 < -kTileOverlapEpsilon;
    return e0 > kTileOverlapEpsilon && e1 > kTileOverlapEpsilon && e2 > kTileOverlapEpsilon && e3 > kTileOverlapEpsilon;
}

VkBufferCreateInfo makeBufferCreateInfo(VkDeviceSize size, VkBufferUsageFlags usage)
{
    VkBufferCreateInfo createInfo{};
    createInfo.sType = VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO;
    createInfo.size = size;
    createInfo.usage = usage;
    createInfo.sharingMode = VK_SHARING_MODE_EXCLUSIVE;
    return createInfo;
}

VkMemoryAllocateInfo makeMemoryAllocateInfo(VkDeviceSize allocationSize, u32 memoryTypeIndex)
{
    VkMemoryAllocateInfo allocateInfo{};
    allocateInfo.sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
    allocateInfo.allocationSize = allocationSize;
    allocateInfo.memoryTypeIndex = memoryTypeIndex;
    return allocateInfo;
}

VkWriteDescriptorSet makeImageDescriptorWrite(
    VkDescriptorSet descriptorSet,
    u32 binding,
    const VkDescriptorImageInfo* imageInfo,
    u32 descriptorCount,
    VkDescriptorType descriptorType)
{
    VkWriteDescriptorSet write{};
    write.sType = VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET;
    write.dstSet = descriptorSet;
    write.dstBinding = binding;
    write.descriptorCount = descriptorCount;
    write.descriptorType = descriptorType;
    write.pImageInfo = imageInfo;
    return write;
}

VkWriteDescriptorSet makeBufferDescriptorWrite(
    VkDescriptorSet descriptorSet,
    u32 binding,
    const VkDescriptorBufferInfo* bufferInfo,
    VkDescriptorType descriptorType = VK_DESCRIPTOR_TYPE_STORAGE_BUFFER)
{
    VkWriteDescriptorSet write{};
    write.sType = VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET;
    write.dstSet = descriptorSet;
    write.dstBinding = binding;
    write.descriptorCount = 1;
    write.descriptorType = descriptorType;
    write.pBufferInfo = bufferInfo;
    return write;
}

template <typename FindMemoryTypeFn>
bool createBufferAllocation(
    VkDevice device,
    FindMemoryTypeFn&& findMemoryType,
    VkDeviceSize size,
    VkBufferUsageFlags usage,
    VkMemoryPropertyFlags preferredProperties,
    VkMemoryPropertyFlags fallbackProperties,
    VkBuffer& buffer,
    VkDeviceMemory& memory,
    void** mappedMemory = nullptr)
{
    VkBufferCreateInfo bufferCreateInfo = makeBufferCreateInfo(size, usage);
    if (vkCreateBuffer(device, &bufferCreateInfo, nullptr, &buffer) != VK_SUCCESS)
        return false;

    VkMemoryRequirements memoryRequirements{};
    vkGetBufferMemoryRequirements(device, buffer, &memoryRequirements);

    u32 memoryTypeIndex = findMemoryType(memoryRequirements.memoryTypeBits, preferredProperties);
    if (memoryTypeIndex == UINT32_MAX && fallbackProperties != preferredProperties)
        memoryTypeIndex = findMemoryType(memoryRequirements.memoryTypeBits, fallbackProperties);
    if (memoryTypeIndex == UINT32_MAX)
    {
        vkDestroyBuffer(device, buffer, nullptr);
        buffer = VK_NULL_HANDLE;
        return false;
    }

    VkMemoryAllocateInfo memoryAllocateInfo = makeMemoryAllocateInfo(memoryRequirements.size, memoryTypeIndex);
    if (vkAllocateMemory(device, &memoryAllocateInfo, nullptr, &memory) != VK_SUCCESS)
    {
        vkDestroyBuffer(device, buffer, nullptr);
        buffer = VK_NULL_HANDLE;
        return false;
    }

    if (vkBindBufferMemory(device, buffer, memory, 0) != VK_SUCCESS)
    {
        vkFreeMemory(device, memory, nullptr);
        vkDestroyBuffer(device, buffer, nullptr);
        memory = VK_NULL_HANDLE;
        buffer = VK_NULL_HANDLE;
        return false;
    }

    if (mappedMemory != nullptr && vkMapMemory(device, memory, 0, size, 0, mappedMemory) != VK_SUCCESS)
    {
        vkFreeMemory(device, memory, nullptr);
        vkDestroyBuffer(device, buffer, nullptr);
        memory = VK_NULL_HANDLE;
        buffer = VK_NULL_HANDLE;
        *mappedMemory = nullptr;
        return false;
    }

    return true;
}

VkShaderModule createShaderModule(VkDevice device, const unsigned char* spirvBytes, size_t spirvLength)
{
    if (device == VK_NULL_HANDLE || spirvBytes == nullptr || spirvLength == 0)
        return VK_NULL_HANDLE;

    std::vector<u32> shaderWords((spirvLength + sizeof(u32) - 1u) / sizeof(u32));
    std::memcpy(shaderWords.data(), spirvBytes, spirvLength);

    VkShaderModuleCreateInfo shaderCreateInfo{};
    shaderCreateInfo.sType = VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO;
    shaderCreateInfo.codeSize = spirvLength;
    shaderCreateInfo.pCode = shaderWords.data();

    VkShaderModule shaderModule = VK_NULL_HANDLE;
    if (vkCreateShaderModule(device, &shaderCreateInfo, nullptr, &shaderModule) != VK_SUCCESS)
        return VK_NULL_HANDLE;

    return shaderModule;
}

u32 ConvertBgraToRgba8(u32 packedColor)
{
    const u32 rb = packedColor & 0x00FF00FFu;
    const u32 g = packedColor & 0x0000FF00u;
    const u32 a = packedColor & 0xFF000000u;
    return ((rb & 0x000000FFu) << 16) | g | ((rb & 0x00FF0000u) >> 16) | a;
}

u32 PackGraphicsAttrToLogical(u32 packedColor)
{
    const u32 polyIdByte = packedColor & 0xFFu;
    const u32 fogByte = (packedColor >> 8u) & 0xFFu;
    const u32 edgeByte = (packedColor >> 16u) & 0xFFu;

    const u32 polyId = ((polyIdByte * 63u) + 127u) / 255u;
    u32 attr = (polyId & 0x3Fu) << 24u;
    if (fogByte >= 0x80u)
        attr |= 1u << 15u;
    if (edgeByte >= 0x80u)
    {
        attr |= 0xFu;
        attr |= 0x10u << 8u;
    }
    return attr;
}

u32 BitCastFloatToU32(float value)
{
    static_assert(sizeof(float) == sizeof(u32));
    u32 bits = 0;
    std::memcpy(&bits, &value, sizeof(bits));
    return bits;
}

struct GraphicsRasterDispatchPolicy
{
    bool allowLinearFastOpaqueModulate;
    bool allowFastOpaqueFragmentDepthPipeline;
    bool enableOpaqueFragmentDepthPrepass;
    bool enableFastOpaqueBatching;
    bool forceShadowBlendLessOrEqual;
    bool replaceSoleTranslucentOverTransparentClear;
};

constexpr GraphicsRasterDispatchPolicy kGraphicsRasterDispatchPolicy{
    true,
    true,
    true,
    true,
    true,
    true,
};

}

std::unique_ptr<VulkanRenderer3D> VulkanRenderer3D::New(
    ThreadLifecycleScope::Callback workerLifecycle,
    ThreadLifecycleScope::Callback workerCreationLifecycle) noexcept
{
    return std::make_unique<VulkanRenderer3D>(workerLifecycle, workerCreationLifecycle);
}

VulkanRenderer3D::VulkanRenderer3D(
    ThreadLifecycleScope::Callback workerLifecycle,
    ThreadLifecycleScope::Callback workerCreationLifecycle) noexcept
    : Renderer3D(true)
    , Texcache(TexcacheVulkanLoader())
    , WorkerLifecycle(workerLifecycle)
    , WorkerCreationLifecycle(workerCreationLifecycle)
{
    beginRenderProductEpoch();
    clearLineCache();
}

void VulkanRenderer3D::beginRenderProductEpoch() noexcept
{
    LiveRenderProductEpoch = AllocateRenderProductEpoch();
    PublishedGlobalLiveRenderIdentity = {};
    PublishedGlobalRenderFence = VK_NULL_HANDLE;
    CurrentFrameLiveRenderIdentity = {};
    FaithfulNativeProjectionSourceGpu = nullptr;
    FaithfulNativeProjectionSourceIdentity = {};
}

bool VulkanRenderer3D::isRenderContextRetained(
    const RenderContext& context) const noexcept
{
    return context.PresentationRetainCount != 0u;
}

bool VulkanRenderer3D::isRenderContextReusable(
    const RenderContext& context) const noexcept
{

    return !isRenderContextRetained(context)
        && PendingCaptureLineContext != &context
        && DeferredRenderContext != &context;
}

bool VulkanRenderer3D::hasRetainedRenderProducts() const noexcept
{
    for (const RenderContext& context : activeRenderContexts())
    {
        if (isRenderContextRetained(context))
            return true;
    }
    return false;
}

struct VulkanRenderer3D::FramePreparation
{
    struct Inputs
    {
        GPU* Gpu = nullptr;
        bool TextureCacheChanged = false;
        bool PrefetchNativeForCompose = false;
        u32 CaptureCnt = 0;
        u32 DisplayCnt = 0;
        u64 RenderStartNs = 0;
        const GPU3D* Geometry = nullptr;
        std::array<AcceleratedSceneBuildConfig, 2> SceneConfigs{};
        u32 SceneCount = 0;
    };

    std::mutex Mutex;
    std::condition_variable WorkAvailable;
    std::condition_variable WorkComplete;
    Inputs Pending;
    bool Stopping = false;
    const GPU3D* PreparedGpu = nullptr;
    u32 PreparedPolygonCount = 0;
    u32 PreparedMask = 0;
    std::array<AcceleratedSceneBuildConfig, 2> PreparedConfigs{};
    std::array<AcceleratedScene, 2> PreparedScenes;
    std::thread Worker;

    bool HasPending() const
    {
        return Pending.Gpu != nullptr || Pending.Geometry != nullptr;
    }

    explicit FramePreparation(VulkanRenderer3D& renderer)
        : Worker([this, &renderer, lifecycle = renderer.WorkerLifecycle]() {
#if defined(__ANDROID__) || defined(__linux__)
            pthread_setname_np(pthread_self(), "VulkanPrepare");
#endif
            ThreadLifecycleScope hints(lifecycle);
            std::unique_lock lock(Mutex);
            for (;;)
            {
                WorkAvailable.wait(lock, [this]() { return Stopping || HasPending(); });
                if (Stopping)
                    return;
                const Inputs inputs = Pending;
                lock.unlock();
                if (inputs.Geometry != nullptr)
                {
                    PreparedGpu = inputs.Geometry;
                    PreparedPolygonCount = inputs.Geometry->RenderNumPolygons;
                    PreparedConfigs = inputs.SceneConfigs;
                    PreparedMask = 0;
                    for (u32 i = 0; i < inputs.SceneCount; ++i)
                    {
                        const u64 startNs = PerfNowNs();
                        BuildAcceleratedScene(*inputs.Geometry, inputs.SceneConfigs[i], PreparedScenes[i]);
                        renderer.GraphicsSceneBuildCpuWindow.Add(PerfNowNs() - startNs);
                        PreparedMask |= 1u << i;
                    }
                }
                else
                {
                    renderer.renderPreparedFrame(*inputs.Gpu, inputs.TextureCacheChanged,
                        inputs.PrefetchNativeForCompose, inputs.CaptureCnt,
                        inputs.DisplayCnt, inputs.RenderStartNs, true);
                }
                lock.lock();
                Pending = {};
                WorkComplete.notify_all();
            }
        })
    {
    }

    ~FramePreparation()
    {
        {
            std::unique_lock lock(Mutex);
            WorkComplete.wait(lock, [this]() { return !HasPending(); });
            Stopping = true;
        }
        WorkAvailable.notify_one();
        Worker.join();
    }

    void Finish()
    {
        std::unique_lock lock(Mutex);
        WorkComplete.wait(lock, [this]() { return !HasPending(); });
    }

    void DiscardGeometry()
    {
        PreparedGpu = nullptr;
        PreparedMask = 0;
    }

    bool TakeScene(const GPU3D& gpu, const AcceleratedSceneBuildConfig& config,
        AcceleratedScene& scene)
    {
        if (PreparedGpu != &gpu || PreparedPolygonCount != gpu.RenderNumPolygons)
            return false;
        for (u32 i = 0; i < PreparedScenes.size(); ++i)
        {
            if ((PreparedMask & (1u << i)) == 0)
                continue;
            const auto& previous = PreparedConfigs[i];
            const auto& a = previous.CoverageFix;
            const auto& b = config.CoverageFix;
            if (previous.Scale != config.Scale
                || previous.BetterPolygons != config.BetterPolygons
                || previous.UseHiresCoordinates != config.UseHiresCoordinates
                || previous.MaxFixedX != config.MaxFixedX || previous.MaxFixedY != config.MaxFixedY
                || a.Enabled != b.Enabled || a.UserPx != b.UserPx
                || a.ApplyRepeat != b.ApplyRepeat || a.ApplyClamp != b.ApplyClamp
                || a.PassiveRepeatPx != b.PassiveRepeatPx
                || a.DisablePassiveRepeat != b.DisablePassiveRepeat
                || a.PaletteUiClampEnabled != b.PaletteUiClampEnabled
                || a.PaletteUiClampPx != b.PaletteUiClampPx)
                continue;
            std::swap(scene, PreparedScenes[i]);
            PreparedMask &= ~(1u << i);
            return true;
        }
        return false;
    }

    void Submit(const Inputs& inputs)
    {
        {
            std::lock_guard lock(Mutex);
            Pending = inputs;
        }
        WorkAvailable.notify_one();
    }
};

void VulkanRenderer3D::SetFramePreparationDeferred(bool enabled) noexcept
{
    if (!enabled)
    {
        FinishFramePreparation();
        if (Preparation != nullptr)
            Preparation->DiscardGeometry();
    }
    FramePreparationDeferred = enabled;
}

bool VulkanRenderer3D::ensureFramePreparation() noexcept
{
    if (FramePreparationUnavailable)
        return false;
    if (Preparation == nullptr)
    {
        try
        {
            ThreadLifecycleScope creation(WorkerCreationLifecycle);
            Preparation = std::make_unique<FramePreparation>(*this);
        }
        catch (const std::system_error& error)
        {
            FramePreparationUnavailable = true;
            Log(LogLevel::Error, "VulkanRenderer3D: preparation worker unavailable (%s)", error.what());
        }
    }
    return Preparation != nullptr;
}

void VulkanRenderer3D::PrepareFrameGeometry(const GPU3D& gpu) noexcept
{
    if (!Threaded || !FramePreparationDeferred || !Initialized
        || FrameskipSaltoPendiente || gpu.RenderFrameIdentical || gpu.RenderNumPolygons == 0u
        || gpu.RenderNumPolygons > gpu.RenderPolygonRAM.size())
        return;
    const Vertex* vertexBegin = gpu.VertexRAM + (gpu.CurRAMBank ? 0u : 6144u);
    const Polygon* polygonBegin = gpu.PolygonRAM + (gpu.CurRAMBank ? 0u : 2048u);
    const std::less<const Vertex*> vertexBefore;
    const std::less<const Polygon*> polygonBefore;
    for (u32 i = 0; i < gpu.RenderNumPolygons; ++i)
    {
        const Polygon* polygon = gpu.RenderPolygonRAM[i];
        if (polygon == nullptr
            || polygonBefore(polygon, polygonBegin) || !polygonBefore(polygon, polygonBegin + 2048u)
            || polygon->NumVertices > std::size(polygon->Vertices))
            return;
        for (u32 j = 0; j < polygon->NumVertices; ++j)
        {
            const Vertex* vertex = polygon->Vertices[j];
            if (vertex == nullptr
                || vertexBefore(vertex, vertexBegin) || !vertexBefore(vertex, vertexBegin + 6144u))
                return;
        }
    }
    if (!ensureFramePreparation())
        return;
    FramePreparation::Inputs inputs{};
    inputs.Geometry = &gpu;
    inputs.SceneConfigs[0] = sceneBuildConfigForScale(1);
    inputs.SceneCount = 1;
    if (ScaleFactor > 1)
    {
        inputs.SceneConfigs[1] = sceneBuildConfigForScale(ScaleFactor);
        inputs.SceneCount = 2;
    }
    Preparation->Submit(inputs);
}

void VulkanRenderer3D::FinishFramePreparation() const noexcept
{
    if (Preparation != nullptr)
        Preparation->Finish();
}

VulkanRenderer3D::~VulkanRenderer3D()
{
    Preparation.reset();
    destroyVulkan();
}

void VulkanRenderer3D::Reset(GPU& gpu)
{
    FinishFramePreparation();
    if (Preparation != nullptr)
        Preparation->DiscardGeometry();
    (void)SetFrameSubmissionDeferred(false);
    (void)gpu;
    beginRenderProductEpoch();

    if (Initialized && Device != VK_NULL_HANDLE)
        (void)waitForDeviceIdle("renderer reset before texture cache reset");
    Texcache.Reset();
    GraphicsResolvedTextureCache.clear();
    HasCpuFrame = false;
    FrameIdentical = false;
    ComposeFielPreciso3D = false;
    LastSubmittedRenderPolygonCount = 0;
    LastSubmittedRenderContext = nullptr;
    PublishedGraphicsRenderContext = nullptr;
    PublishedGlobalRenderIdentity = {};
    CurrentFrameServedIdentity = {};
    PinnedCaptureExportContext = nullptr;
    PinnedCaptureExportSequence = 0u;
    SkipRenderAtVCount215 = false;
    FrameskipSaltoPendiente = false;
    FrameskipSaltoEsteFotograma = false;
    FrameskipPlaceholder3D = false;
    InEarlySubmitAttempt = false;
    CurrentEarlySubmitContextWaitNs = 0;
    resetCaptureLineState();
    clearLineCache();
    LastValidExactCaptureLineCache[0].fill(0);
    LastValidExactCaptureLineCache[1].fill(0);
    SweepLineCacheIdentity = {};
    LastValidExactCaptureIdentity[0] = {};
    LastValidExactCaptureIdentity[1] = {};
    LastServedCaptureSourceIdentity = {};
    HasLastValidExactCaptureParidad = {false, false};
    LastValidExactCaptureUltimaParidad = false;
    ExactCaptureLineCacheFallbackOnly = false;
    CurrentCaptureScreenSwapHint = false;
    HasCurrentCaptureScreenSwapHint = false;
    CurrentCaptureCntHint = 0;
    CurrentCaptureDisplayCntHint = 0;
    CurrentRenderScreenSwap = false;
    CaptureLineExportCount = 0;
    EarlySubmitAttemptCount = 0;
    EarlySubmitHitCount = 0;
    EarlySubmitMissCount = 0;
    EarlySubmitSkipVCount215Count = 0;
}

void VulkanRenderer3D::VCount144(GPU& gpu)
{
    FinishFramePreparation();
    if (Preparation != nullptr)
        Preparation->DiscardGeometry();
    (void)gpu;
    SkipRenderAtVCount215 = false;
}

bool VulkanRenderer3D::SetSubmissionDependency(SubmissionDependency callback, void* context)
{
    FinishFramePreparation();
    if (!flushSubmissionDependency())
        return false;
    BeforeSubmission = callback;
    BeforeSubmissionContext = context;
    return true;
}

bool VulkanRenderer3D::flushSubmissionDependency()
{
    const auto callback = std::exchange(BeforeSubmission, nullptr);
    void* const context = std::exchange(BeforeSubmissionContext, nullptr);
    if (callback != nullptr && !callback(context))
        SubmissionDependencyFailed = true;
    return !SubmissionDependencyFailed;
}

VkResult VulkanRenderer3D::submitQueue(const VkSubmitInfo& submit, VkFence fence)
{
    if (!flushSubmissionDependency())
        return VK_ERROR_UNKNOWN;
    std::scoped_lock queueLock(VulkanContext::Get().GetQueueLock());
    return vkQueueSubmit(Queue, 1, &submit, fence);
}

bool VulkanRenderer3D::SetFrameSubmissionDeferred(bool enabled, VkSemaphore dependency, u64 value)
{
    FinishFramePreparation();
    if (enabled)
    {
        if (FrameSubmissionDeferred || DeferredRenderContext != nullptr
            || DeferredRenderSubmitResult != VK_SUCCESS)
            return false;
        FrameSubmissionDeferred = true;
        return true;
    }
    FrameSubmissionDeferred = false;
    return flushDeferredRenderSubmission(dependency, value);
}

bool VulkanRenderer3D::flushDeferredRenderSubmission(VkSemaphore dependency, u64 value)
{
    if (DeferredRenderContext == nullptr)
        return DeferredRenderSubmitResult == VK_SUCCESS;
    RenderContext* context = std::exchange(DeferredRenderContext, nullptr);
    VkSubmitInfo submit{};
    submit.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO;
    submit.commandBufferCount = 1;
    submit.pCommandBuffers = &context->CommandBuffer;
    VkTimelineSemaphoreSubmitInfo timeline{};
    VkPipelineStageFlags waitStage = VK_PIPELINE_STAGE_ALL_COMMANDS_BIT;
    if (dependency != VK_NULL_HANDLE && value != 0u)
    {
        timeline.sType = VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO;
        timeline.waitSemaphoreValueCount = 1;
        timeline.pWaitSemaphoreValues = &value;
        submit.pNext = &timeline;
        submit.waitSemaphoreCount = 1;
        submit.pWaitSemaphores = &dependency;
        submit.pWaitDstStageMask = &waitStage;
    }
    {
        DeferredRenderSubmitResult = submitQueue(submit, context->FrameFence);
    }
    if (DeferredRenderSubmitResult != VK_SUCCESS)
    {
        context->SubmittedMetadataValid = false;
        Log(LogLevel::Error, "VulkanRenderer3D: deferred vkQueueSubmit failed (%d)",
            static_cast<int>(DeferredRenderSubmitResult));
    }
    return DeferredRenderSubmitResult == VK_SUCCESS;
}

void VulkanRenderer3D::RenderFrame(GPU& gpu)
{
    FinishFramePreparation();
    if (!flushDeferredRenderSubmission())
        return;
    CapturaExactaEsteFotograma = false;

    const bool prefetchNativeForCompose = ComposeFielPreciso3D
        && (gpu.GPU2D_A.DispCnt & 0x0108u) == 0x0108u;
    ComposeFielPreciso3D = false;
    {
        static bool sondaRf = getenv("MELON_SONDA_POLY") != nullptr;
        static int sondaRfRestantes = 2000;
        if (sondaRf && sondaRfRestantes > 0)
        {
            sondaRfRestantes--;
            fprintf(stderr, "[rf] np=%u ident=%d raster=%s ca1=%08X disp=%08X\n",
                gpu.GPU3D.RenderNumPolygons, gpu.GPU3D.RenderFrameIdentical ? 1 : 0,
                VulkanGraphicsRasterName(), gpu.GPU3D.RenderClearAttr1,
                gpu.GPU3D.RenderDispCnt);
        }
    }

    CurrentRenderScreenSwap = gpu.GPU3D.RenderScreenSwapAt3D;
    PendingSubmitPolygonCount = gpu.GPU3D.RenderNumPolygons;

    if (SkipRenderAtVCount215 && gpu.VCount == 215u)
    {
        SkipRenderAtVCount215 = false;
        EarlySubmitSkipVCount215Count++;
        return;
    }

    if (FrameskipSaltoPendiente || FrameskipSaltoEsteFotograma)
    {
        if (FrameskipSaltoPendiente)
        {
            FrameskipSaltoPendiente = false;
            FrameskipSaltoEsteFotograma = true;
            FrameskipSaltos++;
        }

        FrameskipPlaceholder3D = true;
        return;
    }

    FrameskipPlaceholder3D = false;

    CurrentFrameServedIdentity = {};
    CurrentFrameLiveRenderIdentity = {};

    PendingSubmitCaptureCnt = gpu.GPU2D_A.CaptureCnt;

    const u64 renderStartNs = PerfNowNs();
    const u64 textureUpdateStartNs = PerfNowNs();
    bool textureCacheInvalidated = false;
    const auto eraseResolvedTextureCacheKey = [&](u64 invalidatedTexcacheKey) {
        for (auto it = GraphicsResolvedTextureCache.begin(); it != GraphicsResolvedTextureCache.end();)
        {
            const u64 resolvedTexcacheKey = it->first & ~static_cast<u64>(0xC00F0000u);
            if (resolvedTexcacheKey == invalidatedTexcacheKey)
                it = GraphicsResolvedTextureCache.erase(it);
            else
                ++it;
        }
    };
    const bool textureCacheChanged = Texcache.UpdateWithInvalidationCallback(gpu, [&]() {
        // simple_graphics uploads texture layers through the same Vulkan queue
        // that consumes them. The upload command buffer carries shader->transfer
        // and transfer->shader barriers, so CPU-side draining here only
        // serializes frames. Texture destruction still waits in the Vulkan
        // texcache loader before freeing images.
    }, &textureCacheInvalidated, eraseResolvedTextureCacheKey);
    TextureUpdateCpuWindow.Add(PerfNowNs() - textureUpdateStartNs);
    {
        WarmTextureCpuWindow.Add(0);
    }

    if (Threaded && FramePreparationDeferred && gpu.VCount == 215u
        && ensureFramePreparation())
    {
        Preparation->Submit({&gpu, textureCacheChanged, prefetchNativeForCompose,
            gpu.GPU2D_A.CaptureCnt, gpu.GPU2D_A.DispCnt, renderStartNs});
        return;
    }
    renderPreparedFrame(gpu, textureCacheChanged, prefetchNativeForCompose,
        gpu.GPU2D_A.CaptureCnt, gpu.GPU2D_A.DispCnt, renderStartNs);
}

void VulkanRenderer3D::renderPreparedFrame(GPU& gpu, bool textureCacheChanged,
    bool prefetchNativeForCompose, u32 captureCnt, u32 displayCnt, u64 renderStartNs,
    bool usePreparedGeometry)
{
    auto renderPerfScope = MakeScopeExit([&]() {
        RenderCpuWindow.Add(PerfNowNs() - renderStartNs);
        logPerformanceIfNeeded();
    });
    const u32 scale = static_cast<u32>(std::max(1, ScaleFactor));
    const u32 targetWidth = 256u * scale;
    const u32 targetHeight = 192u * scale;
    const bool captureEnabled = (captureCnt & (1u << 31u)) != 0u;
    const u32 captureMode = (captureCnt >> 29u) & 0x3u;
    const u32 captureSizeMode = (captureCnt >> 20u) & 0x3u;
    const bool captureSource3d = (captureCnt & (1u << 24u)) != 0u;
    const bool sourceAContributes = captureMode == 0u
        || ((captureMode >= 2u) && ((captureCnt & 0x1Fu) != 0u));
    const bool bg0Uses3d = (displayCnt & 0x0108u) == 0x0108u;

    if (!captureEnabled)
    {
        HasCurrentCaptureScreenSwapHint = false;
        PinnedCaptureExportContext = nullptr;
    }

    EscalaEfectiva = static_cast<int>(scale);
    const bool captureNeedsGpuCaptureLineBase =
        captureEnabled
        && sourceAContributes
        && (captureSource3d || bg0Uses3d);
    const auto updateExactCaptureFallbackColor = [&]() {
        const u32 clearColor = Debug3dClearMagenta ? 0xFFFF00FFu : buildClearColorRgba8(gpu);
        const u32 r = clearColor & 0xFFu;
        const u32 g = (clearColor >> 8u) & 0xFFu;
        const u32 b = (clearColor >> 16u) & 0xFFu;
        const u32 a = (clearColor >> 24u) & 0xFFu;
        ExactCaptureFallbackPackedColor =
            (r >> 2u)
            | ((g >> 2u) << 8u)
            | ((b >> 2u) << 16u)
            | ((a >> 3u) << 24u);
        ExactCaptureFallbackValid = true;
    };
    FrameIdentical = !textureCacheChanged && gpu.GPU3D.RenderFrameIdentical;
    const bool canReuseIdenticalFrame = FrameIdentical
        && Initialized
        && ColorImageInitialized
        && HasColorTarget()
        && ColorImageWidth == targetWidth
        && ColorImageHeight == targetHeight;
    if (canReuseIdenticalFrame)
    {
        latchCurrentFramePublishedIdentities();
        const bool publicationPreservesExactKey =
            (CurrentFrameServedIdentity.Valid
                && CurrentFrameServedIdentity.RenderProductEpoch != 0u
                && CurrentFrameServedIdentity.RenderProductEpoch
                    == LiveRenderProductEpoch
                && CurrentFrameServedIdentity.Sequence != 0u);
        const bool faithfulNativeMaterializationPreserved =

            (FaithfulNativeProjectionSourceGpu != nullptr
                && captureIdentityMatchesCurrentFrameKey(
                    FaithfulNativeProjectionSourceIdentity))
            || captureIdentityMatchesCurrentFrameKey(PendingCaptureLineIdentity)
            || captureIdentityMatchesCurrentFrameKey(ReadyCaptureLineIdentity)
            || captureIdentityMatchesCurrentFrameKey(LineCacheIdentity)
            || captureIdentityMatchesCurrentFrameKey(SweepLineCacheIdentity);
        if (publicationPreservesExactKey
            && faithfulNativeMaterializationPreserved)
            return;

        FrameIdentical = false;
        CurrentFrameServedIdentity = {};
        CurrentFrameLiveRenderIdentity = {};
    }
    else
    {

        FrameIdentical = false;
    }


    {
        ExactCaptureLineCachePrepared = false;
        ExactCaptureLineCacheFresh = false;
        HasCpuFrame = false;
    }

    if (!ensureInitialized())
    {
        HasCpuFrame = false;
        return;
    }

    const bool hadCpuFrame = HasCpuFrame;
    bool deferGpuCaptureLineExport = false;
    if (captureNeedsGpuCaptureLineBase)
    {
        const auto captureLineSlotBusy = [&](u32 slot) {
            return (CaptureLinePending
                    && PendingCaptureLineContext == nullptr
                    && PendingCaptureLineBufferSlot == static_cast<int>(slot))
                || (CaptureLineReady
                    && ReadyCaptureLineBufferSlot == static_cast<int>(slot));
        };

        u32 desiredSlot = ActiveCaptureLineBufferSlot;
        if (captureLineSlotBusy(desiredSlot))
        {
            bool foundFreeSlot = false;
            for (u32 slotOffset = 1u; slotOffset < CaptureLineBufferSlotCount; slotOffset++)
            {
                const u32 candidateSlot = (desiredSlot + slotOffset) % CaptureLineBufferSlotCount;
                if (captureLineSlotBusy(candidateSlot))
                    continue;

                desiredSlot = candidateSlot;
                foundFreeSlot = true;
                break;
            }
            if (!foundFreeSlot)
                deferGpuCaptureLineExport = true;
        }

        if (!deferGpuCaptureLineExport)
            selectActiveCaptureLineBufferSlot(desiredSlot);
    }
    const bool captureNeedsGpuCaptureLine =
        captureNeedsGpuCaptureLineBase
        && !deferGpuCaptureLineExport;
    if (!captureNeedsGpuCaptureLineBase)
    {
        ActiveCapturePathMode = CapturePathMode::Disabled;
        CapturePathModeCounts[static_cast<size_t>(CapturePathMode::Disabled)]++;
    }

    if (!ensureRenderTarget(targetWidth, targetHeight))
    {
        HasCpuFrame = false;
        return;
    }


    const bool useThreadedRenderContexts = Threaded;
    RenderContext* renderContext = nullptr;
    if (useThreadedRenderContexts)
    {
        renderContext = tryAcquireReadyRenderContext();
        bool renderContextReady = renderContext != nullptr;
        if (!renderContextReady)
        {
            const bool useNonBlockingAcquire = MelonDSAndroid::isFastForwardActive() || PostFastForwardDrainFrames > 0;
            if (useNonBlockingAcquire)
            {
                renderContext = acquireNextRenderContext();
                renderContextReady = renderContext != nullptr && tryAcquireRenderContext(*renderContext);
            }
            else
            {
                const u64 contextWaitStartNs = PerfNowNs();
                renderContext = acquireNextRenderContext();
                renderContextReady = renderContext != nullptr && waitForRenderContext(*renderContext);
                if (InEarlySubmitAttempt)
                    CurrentEarlySubmitContextWaitNs += (PerfNowNs() - contextWaitStartNs);
            }
        }
        if (PostFastForwardDrainFrames > 0)
            PostFastForwardDrainFrames--;
        if (!renderContextReady)
        {
            if (renderContext == nullptr)
            {
                ContextMissCount++;
                DroppedFrameCount++;
            }
            HasCpuFrame = false;
            return;
        }
    }

    if (renderContext != nullptr)
    {
        if (!ensureFaithfulRasterProductSlot(renderContext->RasterProductSlot, targetWidth, targetHeight))
        {
            HasCpuFrame = false;
            return;
        }
    }

    const u32 clearColor = Debug3dClearMagenta ? 0xFFFF00FFu : buildClearColorRgba8(gpu);
    updateExactCaptureFallbackColor();
    const u32 clearDepth = ((gpu.GPU3D.RenderClearAttr2 & 0x7FFFu) * 0x200u) + 0x1FFu;

    if (NativeProjectionCapturePending
        && PendingCaptureLineContext == &NativeProjectionContext)
        resetCaptureLineState();

    const bool eagerNativeProjectionSubmitted =
        scale > 1u
        && (captureNeedsGpuCaptureLine || prefetchNativeForCompose
            || gpu.GPU3D.RenderNumPolygons != 0u)
        && submitFaithfulNativeProjection(gpu, usePreparedGeometry);
    if (eagerNativeProjectionSubmitted && prefetchNativeForCompose)
        NativeComposePrefetchCount++;

    const u64 triangleBuildStartNs = PerfNowNs();
    buildTriangleList(gpu, usePreparedGeometry);
    TriangleBuildCpuWindow.Add(PerfNowNs() - triangleBuildStartNs);

    const bool hasExecutableRasterWork =
        !GraphicsOpaqueDrawIndices.empty()
        || !GraphicsNeedOpaqueDrawIndices.empty()
        || !GraphicsAlphaDrawIndices.empty()
        || !GraphicsShadowMaskDrawIndices.empty()
        || !GraphicsShadowDrawIndices.empty();
    FaithfulRasterProductSlot* selectedGraphicsTarget =
        getContextFaithfulRasterProductSlot(renderContext);
    const bool selectedColorTargetInitialized = selectedGraphicsTarget != nullptr
        ? selectedGraphicsTarget->Initialized
        : ColorImageInitialized;
    const bool plainRearPlaneOnly =
        GraphicsPolygons.empty()
        && Triangles.empty()
        && !hasExecutableRasterWork
        && GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride >= 64u
        && (gpu.GPU3D.RenderDispCnt & (1u << 14u)) == 0u
        && selectedColorTargetInitialized
        && !Debug3dClearMagenta
        && !MelonDSAndroid::areRenderer3DDebugControlsActive()
        && (!CaptureLinePending || NativeProjectionCapturePending)
        && !CaptureLineReady;
    if (plainRearPlaneOnly)
    {
        const PlainRearPlaneMaterial material =
            BuildPlainRearPlaneMaterial(gpu.GPU3D);
        const u64 dispatchCpuStartNs = PerfNowNs();
        const bool dispatchOk =
            dispatchPlainRearPlaneOnly(renderContext, material.Rgba8);
        DispatchCpuWindow.Add(PerfNowNs() - dispatchCpuStartNs);
        TriangleCountWindow.Add(0u);
        PassCountWindow.Add(0u);
        if (!dispatchOk)
        {
            HasCpuFrame = false;
            return;
        }

        latchCurrentFramePublishedIdentities();
        if (!CurrentFrameServedIdentity.Valid
            || CurrentFrameServedIdentity.RenderProductEpoch == 0u
            || CurrentFrameServedIdentity.RenderProductEpoch
                != LiveRenderProductEpoch
            || CurrentFrameServedIdentity.Sequence == 0u)
        {
            HasCpuFrame = false;
            clearLineCache();
            return;
        }

        LineCache.fill(material.Packed6A5);
        LineCacheIdentity = CurrentFrameServedIdentity;
        SweepLineCache = LineCache;
        SweepLineCacheIdentity = LineCacheIdentity;
        ExactCaptureLineCachePrepared = true;
        ExactCaptureLineCacheFresh = true;
        ExactCaptureLineCacheFallbackOnly = false;

        HasCpuFrame = captureNeedsGpuCaptureLineBase;

        if (captureNeedsGpuCaptureLineBase)
        {
            ActiveCapturePathMode = CapturePathMode::Disabled;
            CapturePathModeCounts[static_cast<size_t>(CapturePathMode::Disabled)]++;
        }
        if (captureEnabled)
        {
            CaptureEnabledCount++;
            CaptureModeCounts[captureMode]++;
            CaptureSizeModeCounts[captureSizeMode]++;
            if (captureSource3d)
                CaptureSource3dCount++;
        }

        LastSubmittedRenderPolygonCount = gpu.GPU3D.RenderNumPolygons;
        return;
    }

    const u64 bufferPrepStartNs = PerfNowNs();
    if (!ensureTriangleBuffer(renderContext, Triangles.size()))
    {
        HasCpuFrame = false;
        return;
    }

    if (!ensureToonBuffer(renderContext))
    {
        HasCpuFrame = false;
        return;
    }

    if (!ensureGraphicsVertexBuffer(renderContext, GraphicsVertices.size()))
    {
        HasCpuFrame = false;
        return;
    }

    if ((!ensureGraphicsSceneVertexBuffer(
                GraphicsSceneVertices.size(), renderContext)
            || !ensureGraphicsEdgeIndexBuffer(
                SharedGraphicsScene.EdgeIndices.size(), renderContext)))
    {
        HasCpuFrame = false;
        return;
    }

    {
        if (!ensureGraphicsClearBuffer(renderContext) || !updateGraphicsClearBuffer(renderContext, gpu))
        {
            HasCpuFrame = false;
            return;
        }
    }

    if (!ensureCaptureLineBuffer(renderContext))
    {
        HasCpuFrame = false;
        return;
    }
    BufferPrepCpuWindow.Add(PerfNowNs() - bufferPrepStartNs);

    {
        const u64 descriptorUpdateStartNs = PerfNowNs();
        updateGraphicsDescriptorSet(renderContext);
        DescriptorUpdateCpuWindow.Add(PerfNowNs() - descriptorUpdateStartNs);
    }

    if (captureEnabled)
    {
        CaptureEnabledCount++;
        CaptureModeCounts[captureMode]++;
        CaptureSizeModeCounts[captureSizeMode]++;
        if (captureSource3d)
            CaptureSource3dCount++;
    }

    const bool inlineCaptureReadback =
        captureNeedsGpuCaptureLine
        && scale == 1u;
    const u64 dispatchCpuStartNs = PerfNowNs();
    const bool dispatchOk = dispatchRasterAndReadback(
            renderContext,
            clearColor,
            clearDepth,
            gpu.GPU3D.RenderDispCnt,
            gpu.GPU3D.RenderAlphaRef,
            gpu.GPU3D.RenderFogColor,
            gpu.GPU3D.RenderFogOffset,
            gpu.GPU3D.RenderFogShift,
            gpu.GPU3D.RenderClearAttr1 & 0x3F008000u,
            gpu.GPU3D.RenderFogDensityTable,
            gpu.GPU3D.RenderEdgeTable,
            gpu.GPU3D.RenderToonTable,
            inlineCaptureReadback);
    DispatchCpuWindow.Add(PerfNowNs() - dispatchCpuStartNs);
    if (!dispatchOk)
    {
        HasCpuFrame = false;
        return;
    }
    latchCurrentFramePublishedIdentities();

    if (CurrentFrameServedIdentity.Valid)
    {

        FaithfulNativeProjectionSourceGpu = &gpu;
        FaithfulNativeProjectionSourceIdentity = CurrentFrameServedIdentity;

        const bool pendingBelongsToThisSubmit =
            inlineCaptureReadback
            || (eagerNativeProjectionSubmitted
                && NativeProjectionCapturePending
                && PendingCaptureLineContext == &NativeProjectionContext);
        if (pendingBelongsToThisSubmit && CaptureLinePending)
            PendingCaptureLineIdentity = CurrentFrameServedIdentity;
    }
    else
    {
        FaithfulNativeProjectionSourceGpu = nullptr;
        FaithfulNativeProjectionSourceIdentity = {};
    }

    if ((captureNeedsGpuCaptureLineBase || deferGpuCaptureLineExport))
    {
        // graphics_hw must let PrepareCaptureFrame() latch the exact DS-sized
        // export for the current frame. Reusing a previous CPU buffer here is
        // fine temporarily, but it must be cleared before the exact capture is
        // consumed so that GPU2D_Soft never mixes old and new lines.
        HasCpuFrame = hadCpuFrame;
    }
    else
        HasCpuFrame = false;

    if (!captureNeedsGpuCaptureLineBase && !eagerNativeProjectionSubmitted)
    {
        clearRawReadbackState();
        resetCaptureLineState();
    }

    LastSubmittedRenderPolygonCount = gpu.GPU3D.RenderNumPolygons;
}

void VulkanRenderer3D::RestartFrame(GPU& gpu)
{
    (void)gpu;
}

u32* VulkanRenderer3D::GetLine(int line)
{
    FinishFramePreparation();

    static const bool logGetLine = getenv("MELON_LOG_TAIL") != nullptr;
    if (logGetLine && line == 0)
    {
        static u32 nGL = 0;
        CaptureSourceIdentity publishedIdentity{};
        (void)GetPublishedRenderIdentity(publishedIdentity);
        fprintf(stderr,
                "[getline] n=%u profile=%s pipeline=%s raster=%s exact=%d ready=%d pend=%d "
                "ident=%d pub=%d:%llu/%u/%08X/%d\n",
                nGL++, VulkanProductionProfileName(),
                VulkanProductionPipelineName(), VulkanGraphicsRasterName(),
                1,
                CaptureLineReady ? 1 : 0, CaptureLinePending ? 1 : 0,
                FrameIdentical ? 1 : 0,
                publishedIdentity.Valid ? 1 : 0,
                static_cast<unsigned long long>(publishedIdentity.Sequence),
                publishedIdentity.PolygonCount,
                publishedIdentity.CaptureCnt,
                publishedIdentity.ScreenSwap ? 1 : 0);
    }

    if (line < 0)
        line = 0;
    else if (line > 191)
        line = 191;

    if (!captureIdentityMatchesCurrentFrameKey(SweepLineCacheIdentity))
    {
        if (prepareFaithfulExactCaptureLineCache()
            && captureIdentityMatchesCurrentFrameKey(LineCacheIdentity))
        {
            SweepLineCache = LineCache;
            SweepLineCacheIdentity = LineCacheIdentity;
        }
        else
        {

            SweepLineCache.fill(0u);
            SweepLineCacheIdentity = {};
        }
    }

    LastServedCaptureSourceIdentity =
        captureIdentityMatchesCurrentFrameKey(SweepLineCacheIdentity)
            ? SweepLineCacheIdentity
            : CaptureSourceIdentity{};
    return &SweepLineCache[static_cast<size_t>(line) * 256u];
}

bool VulkanRenderer3D::captureIdentityMatchesCurrentFrameKey(
    const CaptureSourceIdentity& identity) const noexcept
{

    return CurrentFrameServedIdentity.Valid
        && CurrentFrameServedIdentity.RenderProductEpoch != 0u
        && CurrentFrameServedIdentity.RenderProductEpoch
            == LiveRenderProductEpoch
        && CurrentFrameServedIdentity.Sequence != 0u
        && identity.Valid
        && identity.RenderProductEpoch
            == CurrentFrameServedIdentity.RenderProductEpoch
        && identity.Sequence == CurrentFrameServedIdentity.Sequence;
}

void VulkanRenderer3D::traceFaithfulCaptureDecision(
    const char* stage,
    const char* reason,
    const CaptureSourceIdentity& candidate) const noexcept
{
    static const bool enabled = std::getenv("MELON_SONDA_CAPID") != nullptr;
    static std::atomic<u32> remaining {4096u};
    if (!enabled)
        return;

    u32 available = remaining.load(std::memory_order_relaxed);
    while (available != 0u
        && !remaining.compare_exchange_weak(
            available, available - 1u, std::memory_order_relaxed))
    {
    }
    if (available == 0u)
        return;

    std::fprintf(
        stderr,
        "[capid-faithful] stage=%s reason=%s "
        "current=%d:%llu:%llu/%u/%08X/%d "
        "candidate=%d:%llu:%llu/%u/%08X/%d pending=%d ready=%d\n",
        stage != nullptr ? stage : "?",
        reason != nullptr ? reason : "?",
        CurrentFrameServedIdentity.Valid ? 1 : 0,
        static_cast<unsigned long long>(
            CurrentFrameServedIdentity.RenderProductEpoch),
        static_cast<unsigned long long>(CurrentFrameServedIdentity.Sequence),
        CurrentFrameServedIdentity.PolygonCount,
        CurrentFrameServedIdentity.CaptureCnt,
        CurrentFrameServedIdentity.ScreenSwap ? 1 : 0,
        candidate.Valid ? 1 : 0,
        static_cast<unsigned long long>(candidate.RenderProductEpoch),
        static_cast<unsigned long long>(candidate.Sequence),
        candidate.PolygonCount,
        candidate.CaptureCnt,
        candidate.ScreenSwap ? 1 : 0,
        CaptureLinePending ? 1 : 0,
        CaptureLineReady ? 1 : 0);
}

bool VulkanRenderer3D::submitFaithfulNativeProjection(GPU& gpu, bool usePreparedGeometry)
{
    if (ScaleFactor <= 1
        || CaptureLinePending
        || CaptureLineReady)
    {
        return false;
    }
    RenderContext* nativeContext = &NativeProjectionContext;
    if (NativeProjectionSubmitInFlight)
    {
        if (Device == VK_NULL_HANDLE
            || nativeContext->FrameFence == VK_NULL_HANDLE
            || vkWaitForFences(
                Device, 1, &nativeContext->FrameFence, VK_TRUE,
                kFenceWaitTimeoutNs) != VK_SUCCESS)
        {
            traceFaithfulCaptureDecision(
                "native-lazy", "previous-fence-not-ready",
                FaithfulNativeProjectionSourceIdentity);
            return false;
        }
        NativeProjectionSubmitInFlight = false;
    }

    const int previousEffectiveScale = EscalaEfectiva;
    EscalaEfectiva = 1;
    auto restoreRequestedScale = MakeScopeExit([&]() {
        EscalaEfectiva = previousEffectiveScale;
    });

    const u64 nativeBuildStartNs = PerfNowNs();
    buildTriangleList(gpu, usePreparedGeometry);
    TriangleBuildCpuWindow.Add(PerfNowNs() - nativeBuildStartNs);

    const bool nativeResourcesReady =
        ensureTriangleBuffer(nativeContext, Triangles.size())
        && ensureToonBuffer(nativeContext)
        && ensureGraphicsVertexBuffer(nativeContext, GraphicsVertices.size())
        && ensureGraphicsSceneVertexBuffer(
            GraphicsSceneVertices.size(), nativeContext)
        && ensureGraphicsEdgeIndexBuffer(
            SharedGraphicsScene.EdgeIndices.size(), nativeContext)
        && ensureGraphicsClearBuffer(nativeContext)
        && updateGraphicsClearBuffer(nativeContext, gpu)
        && ensureCaptureLineBuffer(nativeContext)
        && ensureFaithfulRasterProductSlot(
            nativeContext->RasterProductSlot, 256u, 192u);
    if (!nativeResourcesReady)
    {
        traceFaithfulCaptureDecision(
            "native-lazy", "resources-unavailable",
            FaithfulNativeProjectionSourceIdentity);
        return false;
    }
    updateGraphicsDescriptorSet(nativeContext);

    const u32 clearColor = Debug3dClearMagenta
        ? 0xFFFF00FFu
        : buildClearColorRgba8(gpu);
    const u32 clearDepth =
        ((gpu.GPU3D.RenderClearAttr2 & 0x7FFFu) * 0x200u) + 0x1FFu;
    const bool submitted = dispatchRasterAndReadback(
        nativeContext,
        clearColor,
        clearDepth,
        gpu.GPU3D.RenderDispCnt,
        gpu.GPU3D.RenderAlphaRef,
        gpu.GPU3D.RenderFogColor,
        gpu.GPU3D.RenderFogOffset,
        gpu.GPU3D.RenderFogShift,
        gpu.GPU3D.RenderClearAttr1 & 0x3F008000u,
        gpu.GPU3D.RenderFogDensityTable,
        gpu.GPU3D.RenderEdgeTable,
        gpu.GPU3D.RenderToonTable,
        true,
        true);
    NativeProjectionSubmitInFlight = submitted;
    if (!submitted)
    {
        traceFaithfulCaptureDecision(
            "native-lazy", "submit-failed",
            FaithfulNativeProjectionSourceIdentity);
        return false;
    }

    return true;
}

bool VulkanRenderer3D::submitFaithfulNativeProjectionForCurrentFrame()
{

    if (ScaleFactor <= 1)
        return submitGraphicsCaptureExportForCurrentFrame();

    if (FaithfulNativeProjectionSourceGpu == nullptr
        || !captureIdentityMatchesCurrentFrameKey(
            FaithfulNativeProjectionSourceIdentity)
        || CaptureLinePending
        || CaptureLineReady)
    {
        traceFaithfulCaptureDecision(
            "native-lazy",
            FaithfulNativeProjectionSourceGpu == nullptr
                ? "no-frozen-source"
                : "source-key-or-slot-unavailable",
            FaithfulNativeProjectionSourceIdentity);
        return false;
    }

    if (!submitFaithfulNativeProjection(*FaithfulNativeProjectionSourceGpu))
        return false;

    PendingCaptureLineIdentity = CurrentFrameServedIdentity;
    NativeLazyProjectionCount++;
    traceFaithfulCaptureDecision(
        "native-lazy", "queued-current-key",
        PendingCaptureLineIdentity);
    return true;
}

bool VulkanRenderer3D::prepareFaithfulExactCaptureLineCache()
{
    if (!flushDeferredRenderSubmission())
        return false;

    if (!CurrentFrameServedIdentity.Valid
        || CurrentFrameServedIdentity.RenderProductEpoch == 0u
        || CurrentFrameServedIdentity.RenderProductEpoch
            != LiveRenderProductEpoch
        || CurrentFrameServedIdentity.Sequence == 0u)
    {
        traceFaithfulCaptureDecision("prepare", "no-current-key");
        HasCpuFrame = false;
        clearLineCache();
        return false;
    }

    if (ExactCaptureLineCachePrepared
        && captureIdentityMatchesCurrentFrameKey(LineCacheIdentity))
    {
        HasCpuFrame = true;
        traceFaithfulCaptureDecision("prepare", "cache-hit", LineCacheIdentity);
        return true;
    }

    if (LineCacheIdentity.Valid || ExactCaptureLineCachePrepared)
        traceFaithfulCaptureDecision("prepare", "retire-line-cache", LineCacheIdentity);
    HasCpuFrame = false;
    clearLineCache();

    const auto consumeReadyExact = [&]() -> bool {
        if (!CaptureLineReady)
            return false;
        if (ReadyCaptureLineData == nullptr)
        {
            traceFaithfulCaptureDecision(
                "prepare", "retire-ready-null", ReadyCaptureLineIdentity);
            resetCaptureLineState();
            return false;
        }
        if (!captureIdentityMatchesCurrentFrameKey(ReadyCaptureLineIdentity))
        {

            traceFaithfulCaptureDecision(
                "prepare", "retire-ready-other-key", ReadyCaptureLineIdentity);
            resetCaptureLineState();
            return false;
        }
        if (!copyReadyCaptureLineToLineCache()
            || !ExactCaptureLineCachePrepared
            || !captureIdentityMatchesCurrentFrameKey(LineCacheIdentity))
        {
            traceFaithfulCaptureDecision(
                "prepare", "copy-current-key-failed", LineCacheIdentity);
            HasCpuFrame = false;
            clearLineCache();
            return false;
        }

        HasCpuFrame = true;
        traceFaithfulCaptureDecision(
            "prepare", "ready-current-key", LineCacheIdentity);
        return true;
    };

    if (CaptureLinePending)
    {
        traceFaithfulCaptureDecision(
            "prepare",
            captureIdentityMatchesCurrentFrameKey(PendingCaptureLineIdentity)
                ? "wait-pending-current-key"
                : "wait-pending-other-key",
            PendingCaptureLineIdentity);
        if (!finalizeCaptureLineFrame(true) && CaptureLinePending)
        {
            traceFaithfulCaptureDecision(
                "prepare", "pending-wait-incomplete", PendingCaptureLineIdentity);
            return false;
        }
    }
    if (consumeReadyExact())
        return true;
    if (CaptureLinePending)
        return false;

    if (!submitFaithfulNativeProjectionForCurrentFrame())
    {
        traceFaithfulCaptureDecision("prepare", "submit-current-key-failed");
        return false;
    }
    traceFaithfulCaptureDecision(
        "prepare", "submitted-current-key", PendingCaptureLineIdentity);

    if (!captureIdentityMatchesCurrentFrameKey(PendingCaptureLineIdentity))
    {

        traceFaithfulCaptureDecision(
            "prepare", "submitted-unexpected-key", PendingCaptureLineIdentity);
        if (!finalizeCaptureLineFrame(true) && CaptureLinePending)
            return false;
        if (CaptureLineReady)
            resetCaptureLineState();
        return false;
    }

    if (!finalizeCaptureLineFrame(true))
    {
        traceFaithfulCaptureDecision(
            "prepare", "current-key-wait-incomplete", PendingCaptureLineIdentity);
        return false;
    }
    return consumeReadyExact();
}

void VulkanRenderer3D::SetupAccelFrame()
{
}

void VulkanRenderer3D::PrepareCaptureFrame()
{
    FinishFramePreparation();
    CapturePrepareRequestCount++;

    HasCpuFrame = ExactCaptureLineCachePrepared
        && captureIdentityMatchesCurrentFrameKey(LineCacheIdentity);
}

void VulkanRenderer3D::SetCaptureScreenSwapHint(bool screenSwap, u32 captureCnt, u32 displayCnt)
{
    FinishFramePreparation();

    CapturaExactaEsteFotograma = true;
    CurrentCaptureScreenSwapHint = screenSwap;
    HasCurrentCaptureScreenSwapHint = true;
    CurrentCaptureCntHint = captureCnt;
    CurrentCaptureDisplayCntHint = displayCnt;
    PinnedCaptureExportContext = nullptr;
    PinnedCaptureExportSequence = 0;
    const auto matchesCurrentFrame = [&](const RenderContext& candidate) {
        const CaptureSourceIdentity identity =
            captureSourceIdentityForContext(&candidate);
        return captureIdentityMatchesCurrentFrameKey(identity);
    };
    RenderContext* best = nullptr;
    for (RenderContext& candidate : activeRenderContexts())
    {
        if (!candidate.SubmittedMetadataValid
            || candidate.SubmittedRenderProductEpoch != LiveRenderProductEpoch
            || candidate.RasterProductSlot.ColorImage == VK_NULL_HANDLE
            || !candidate.RasterProductSlot.Initialized
            || !matchesCurrentFrame(candidate))
        {
            continue;
        }
        if (best == nullptr || candidate.SubmitSequence > best->SubmitSequence)
            best = &candidate;
    }
    if (best != nullptr)
    {
        PinnedCaptureExportContext = best;
        PinnedCaptureExportSequence = best->SubmitSequence;
        {
            traceFaithfulCaptureDecision(
                "hint", "pin-current-key", captureSourceIdentityForContext(best));
        }
    }
    else
    {
        traceFaithfulCaptureDecision("hint", "no-current-key-context");
    }
}

void VulkanRenderer3D::BeginCaptureFrame()
{
    FinishFramePreparation();

    if (!ExactCaptureLineCachePrepared)
        HasCpuFrame = false;
    ExactCaptureLineCacheFresh = false;

    if (MelonDSAndroid::areRendererDebugToolsEnabled() && CaptureDebugLogsRemaining > 0u)
    {
        Log(
            LogLevel::Warn,
            "VulkanCapture[FrameStart]: pending=%u ready=%u hasCpu=%u fresh=%u fallbackValid=%u raster=%s",
            CaptureLinePending ? 1u : 0u,
            CaptureLineReady ? 1u : 0u,
            HasCpuFrame ? 1u : 0u,
            ExactCaptureLineCacheFresh ? 1u : 0u,
            ExactCaptureFallbackValid ? 1u : 0u,
            VulkanGraphicsRasterName());
        CaptureDebugLogsRemaining--;
    }
}

void VulkanRenderer3D::Blit(const GPU& gpu)
{
    FinishFramePreparation();
    CurrentRenderScreenSwap = gpu.GPU3D.RenderScreenSwapAt3D;

    if (!Initialized
        || !ColorImageInitialized
        || Device == VK_NULL_HANDLE
        || Queue == VK_NULL_HANDLE
        || CommandBuffer == VK_NULL_HANDLE
        || FrameFence == VK_NULL_HANDLE)
    {
        return;
    }

    const u32 captureCnt = gpu.GPU2D_A.CaptureCnt;
    const bool captureEnabled = (captureCnt & (1u << 31u)) != 0u;
    const u32 captureMode = (captureCnt >> 29u) & 0x3u;
    const bool captureSource3d = (captureCnt & (1u << 24u)) != 0u;
    const bool sourceAContributes = captureMode == 0u
        || ((captureMode >= 2u) && ((captureCnt & 0x1Fu) != 0u));
    const bool bg0Uses3d = (gpu.GPU2D_A.DispCnt & 0x0108u) == 0x0108u;
    const bool captureNeedsGpuCaptureLine =
        captureEnabled
        && sourceAContributes
        && (captureSource3d || bg0Uses3d);
    if (!captureNeedsGpuCaptureLine)
        return;

    // Match the OpenGL timing contract more closely: prime the DS-sized export
    // during VBlank, before GPU2D_Soft starts the next frame's capture path.
    // This avoids relying on a later GetLine() consumer to resurrect the
    // correct frame after packed buffers have already been composed.
    //
    // If the main render submission already left an exact capture export
    // pending/ready for this frame, keep that state intact. Resetting it here
    // can discard the same-frame DS-sized source and force software 2D to
    // consume a stale/empty replacement on the next capture pass.
    if (CaptureLinePending || CaptureLineReady)
        return;
}

void VulkanRenderer3D::Stop(const GPU& gpu)
{
    Preparation.reset();
    (void)gpu;

    destroyVulkan();
    Texcache.Reset();
    InitFailed = false;
    HasCpuFrame = false;
    SkipRenderAtVCount215 = false;
    FrameskipSaltoPendiente = false;
    FrameskipSaltoEsteFotograma = false;
    FrameskipPlaceholder3D = false;
    InEarlySubmitAttempt = false;
    CurrentEarlySubmitContextWaitNs = 0;
    LastSubmittedRenderPolygonCount = 0;
    ExactCaptureFallbackPackedColor = 0;
    ExactCaptureFallbackValid = false;
    ExactCaptureLineCacheFallbackOnly = false;
    resetCaptureLineState();
    clearLineCache();
    LastValidExactCaptureLineCache[0].fill(0);
    LastValidExactCaptureLineCache[1].fill(0);
    SweepLineCacheIdentity = {};
    LastValidExactCaptureIdentity[0] = {};
    LastValidExactCaptureIdentity[1] = {};
    LastServedCaptureSourceIdentity = {};
    PublishedGlobalRenderIdentity = {};
    CurrentFrameServedIdentity = {};
    PublishedGlobalLiveRenderIdentity = {};
    PublishedGlobalRenderFence = VK_NULL_HANDLE;
    CurrentFrameLiveRenderIdentity = {};
    FaithfulNativeProjectionSourceGpu = nullptr;
    FaithfulNativeProjectionSourceIdentity = {};
    HasLastValidExactCaptureParidad = {false, false};
    LastValidExactCaptureUltimaParidad = false;
    CurrentCaptureScreenSwapHint = false;
    HasCurrentCaptureScreenSwapHint = false;
    CurrentCaptureCntHint = 0;
    CurrentCaptureDisplayCntHint = 0;
    PendingCaptureLineRequiresPrimaryFence = false;
    CurrentRenderScreenSwap = false;
    CaptureLineExportCount = 0;
    EarlySubmitAttemptCount = 0;
    EarlySubmitHitCount = 0;
    EarlySubmitMissCount = 0;
    EarlySubmitSkipVCount215Count = 0;
}

void VulkanRenderer3D::SetRenderSettings(
    bool threaded,
    bool betterPolygons,
    int scale,
    bool conservativeCoverageEnabled,
    float conservativeCoveragePx,
    float conservativeCoverageDepthBias,
    bool conservativeCoverageApplyRepeat,
    bool conservativeCoverageApplyClamp,
    bool debug3dClearMagenta,
    GPU& gpu) noexcept
{

    const bool ringDisabled = std::getenv("MELON_FIEL_SIN_HILO") != nullptr;
    const bool threadedEfectivo = threaded && !ringDisabled;
    SetThreaded(threadedEfectivo, gpu);

    const int oldScale = ScaleFactor;
    const int requestedScale = std::max(1, scale);
    const bool deferScaleChange = Initialized
        && oldScale != requestedScale
        && hasRetainedRenderProducts();
    if (deferScaleChange)
    {
        Log(
            LogLevel::Warn,
            "VulkanRenderer3D: refusing scale change while a render product is retained");
    }
    BetterPolygons = betterPolygons;
    ScaleFactor = deferScaleChange ? oldScale : requestedScale;
    EscalaEfectiva = ScaleFactor;
    CoverageFixEnabled = conservativeCoverageEnabled;
    CoverageFixPx = std::clamp(conservativeCoveragePx, 0.0f, 2.0f);
    CoverageFixDepthBias = std::clamp(conservativeCoverageDepthBias, 0.0f, 0.01f);
    CoverageFixApplyRepeat = conservativeCoverageApplyRepeat;
    CoverageFixApplyClamp = conservativeCoverageApplyClamp;
    Debug3dClearMagenta = debug3dClearMagenta;

    if (Initialized && oldScale != ScaleFactor)
    {

        const CaptureSourceIdentity keyServida = CurrentFrameServedIdentity;
        bool export1xServido = false;
        if (keyServida.Valid)
        {
            for (int intento = 0; intento < 2; intento++)
            {
                if (ExactCaptureLineCachePrepared
                    && captureIdentityMatchesCurrentFrameKey(LineCacheIdentity))
                    break;
                (void)prepareFaithfulExactCaptureLineCache();
            }
            export1xServido = ExactCaptureLineCachePrepared
                && captureIdentityMatchesCurrentFrameKey(LineCacheIdentity);
            traceFaithfulCaptureDecision(
                "scale-change",
                export1xServido ? "export-1x-materializado" : "export-1x-no-disponible",
                LineCacheIdentity);
        }
        (void)waitForDeviceIdle("scale change");
        destroyTriangleBuffer(nullptr);
        for (RenderContext& renderContext : activeRenderContexts())
        {
            destroyTriangleBuffer(&renderContext);
            destroyCaptureLineBuffer(&renderContext);
            destroyFaithfulRasterProductSlot(renderContext.RasterProductSlot);
        }
        destroyTriangleBuffer(&NativeProjectionContext);
        destroyGraphicsVertexBuffer(&NativeProjectionContext);
        destroyGraphicsSceneVertexBuffer(&NativeProjectionContext);
        destroyGraphicsEdgeIndexBuffer(&NativeProjectionContext);
        destroyToonBuffer(&NativeProjectionContext);
        destroyGraphicsClearBuffer(&NativeProjectionContext);
        destroyCaptureLineBuffer(&NativeProjectionContext);
        destroyFaithfulRasterProductSlot(NativeProjectionContext.RasterProductSlot);
        NativeProjectionSubmitInFlight = false;
        destroyToonBuffer(nullptr);
        destroyGraphicsClearBuffer(nullptr);
        for (RenderContext& renderContext : activeRenderContexts())
        {
            destroyToonBuffer(&renderContext);
            destroyGraphicsClearBuffer(&renderContext);
        }
        destroyRenderTarget();
        destroyReadbackBuffer();
        destroyAllCaptureLineBuffers();

        if (export1xServido)
            CurrentFrameServedIdentity = keyServida;
        InvalidatePresentationState(true);
    }
}

void VulkanRenderer3D::SetThreaded(bool threaded, GPU& gpu) noexcept
{
    FinishFramePreparation();
    (void)gpu;
    const bool enableThreaded = threaded;
    if (Threaded == enableThreaded)
        return;

    if (hasRetainedRenderProducts())
    {
        Log(
            LogLevel::Error,
            "VulkanRenderer3D: refusing threaded mode change while a render product is retained");
        return;
    }

    if (Initialized)
        (void)waitForDeviceIdle("threaded mode change");

    Threaded = enableThreaded;
    if (!Threaded)
        Preparation.reset();
    NextRenderContextIndex = 0;
    PublishedGraphicsRenderContext = nullptr;
    InvalidatePresentationState(false);
    if (MelonDSAndroid::areRendererDebugToolsEnabled())
        Log(LogLevel::Warn, "VulkanRenderer3D: threaded rendering %s", Threaded ? "enabled" : "disabled");
}

bool VulkanRenderer3D::IsThreaded() const noexcept
{
    return Threaded;
}

const VulkanRenderer3D::FaithfulRasterProductSlot* VulkanRenderer3D::getPublishedFaithfulRasterProductSlot() const noexcept
{
    if (PublishedGraphicsRenderContext != nullptr
        && PublishedGraphicsRenderContext->SubmittedMetadataValid
        && PublishedGraphicsRenderContext->SubmittedRenderProductEpoch
            == LiveRenderProductEpoch
        && PublishedGraphicsRenderContext->RasterProductSlot.ColorImage != VK_NULL_HANDLE
        && PublishedGraphicsRenderContext->RasterProductSlot.ColorImageView != VK_NULL_HANDLE)
    {
        return &PublishedGraphicsRenderContext->RasterProductSlot;
    }

    return nullptr;
}

VulkanRenderer3D::FaithfulRasterProductSlot* VulkanRenderer3D::getContextFaithfulRasterProductSlot(RenderContext* context) noexcept
{
    if (context != nullptr)
        return &context->RasterProductSlot;
    return nullptr;
}

bool VulkanRenderer3D::HasColorTarget() const noexcept
{
    if (const FaithfulRasterProductSlot* target = getPublishedFaithfulRasterProductSlot())
        return target->ColorImage != VK_NULL_HANDLE && target->ColorImageView != VK_NULL_HANDLE;
    return ColorImage != VK_NULL_HANDLE && ColorImageView != VK_NULL_HANDLE;
}

bool VulkanRenderer3D::IsColorTargetInitialized() const noexcept
{
    if (const FaithfulRasterProductSlot* target = getPublishedFaithfulRasterProductSlot())
        return target->Initialized;
    return ColorImageInitialized;
}

VkImage VulkanRenderer3D::GetColorTargetImage() const noexcept
{
    if (const FaithfulRasterProductSlot* target = getPublishedFaithfulRasterProductSlot())
        return target->ColorImage;
    return ColorImage;
}

VkImageView VulkanRenderer3D::GetColorTargetImageView() const noexcept
{
    if (const FaithfulRasterProductSlot* target = getPublishedFaithfulRasterProductSlot())
        return target->ColorImageView;
    return ColorImageView;
}

u32 VulkanRenderer3D::GetColorTargetWidth() const noexcept
{
    if (const FaithfulRasterProductSlot* target = getPublishedFaithfulRasterProductSlot())
        return target->Width;
    return ColorImageWidth;
}

u32 VulkanRenderer3D::GetColorTargetHeight() const noexcept
{
    if (const FaithfulRasterProductSlot* target = getPublishedFaithfulRasterProductSlot())
        return target->Height;
    return ColorImageHeight;
}

u64 VulkanRenderer3D::RetainPublishedColorTargetForPresentation() noexcept
{
    if (PublishedGraphicsRenderContext == nullptr)
        return 0;

    for (size_t i = 0; i < GetAsyncRenderContextCount(); i++)
    {
        RenderContext& context = RenderContexts[i];
        if (&context != PublishedGraphicsRenderContext)
            continue;

        if (!context.SubmittedMetadataValid
            || context.SubmittedRenderProductEpoch != LiveRenderProductEpoch
            || context.RasterProductSlot.ColorImage == VK_NULL_HANDLE
            || context.RasterProductSlot.ColorImageView == VK_NULL_HANDLE)
        {
            return 0;
        }
        if (context.FrameFence == VK_NULL_HANDLE)
            return 0;

        const VkResult fenceStatus = vkGetFenceStatus(Device, context.FrameFence);
        if (fenceStatus != VK_SUCCESS && fenceStatus != VK_NOT_READY)
            return 0;

        context.PresentationRetainCount++;
        return static_cast<u64>(i + 1u);
    }

    return 0;
}

bool VulkanRenderer3D::GetNewestSubmittedRenderForParity(
    bool topScreen,
    VkImage& outImage,
    VkImageView& outImageView,
    u32& outWidth,
    u32& outHeight,
    bool& outZeroPolygons,
    SubmittedRenderIdentity* outIdentity) const noexcept
{
    if (outIdentity != nullptr)
        *outIdentity = {};

    return false;
}

bool VulkanRenderer3D::GetPinnedCaptureRender(
    VkImage& outImage,
    VkImageView& outImageView,
    u32& outWidth,
    u32& outHeight,
    bool& outZeroPolygons,
    SubmittedRenderIdentity* outIdentity) const noexcept
{
    if (outIdentity != nullptr)
        *outIdentity = {};

    const CaptureSourceIdentity pinnedIdentity =
        captureSourceIdentityForContext(PinnedCaptureExportContext);
    if (Device == VK_NULL_HANDLE
        || PinnedCaptureExportContext == nullptr
        || !PinnedCaptureExportContext->SubmittedMetadataValid
        || PinnedCaptureExportContext->SubmittedRenderProductEpoch
            != LiveRenderProductEpoch
        || PinnedCaptureExportContext->SubmitSequence != PinnedCaptureExportSequence
        || !captureIdentityMatchesCurrentFrameKey(pinnedIdentity)
        || !PinnedCaptureExportContext->RasterProductSlot.Initialized
        || PinnedCaptureExportContext->RasterProductSlot.ColorImage == VK_NULL_HANDLE
        || PinnedCaptureExportContext->RasterProductSlot.ColorImageView == VK_NULL_HANDLE
        || PinnedCaptureExportContext->FrameFence == VK_NULL_HANDLE
        || vkGetFenceStatus(Device, PinnedCaptureExportContext->FrameFence) != VK_SUCCESS)
    {
        return false;
    }

    outImage = PinnedCaptureExportContext->RasterProductSlot.ColorImage;
    outImageView = PinnedCaptureExportContext->RasterProductSlot.ColorImageView;
    outWidth = PinnedCaptureExportContext->RasterProductSlot.Width;
    outHeight = PinnedCaptureExportContext->RasterProductSlot.Height;
    outZeroPolygons = PinnedCaptureExportContext->SubmittedPolygonCount == 0u;
    if (outIdentity != nullptr)
        *outIdentity = pinnedIdentity;
    return outWidth != 0u && outHeight != 0u;
}

bool VulkanRenderer3D::GetSubmittedRenderSourceByIdentity(
    const SubmittedRenderIdentity& expectedIdentity,
    SubmittedRenderSource& outSource) const noexcept
{
    outSource = {};
    if (Device == VK_NULL_HANDLE
        || !expectedIdentity.Valid
        || expectedIdentity.RenderProductEpoch == 0u
        || expectedIdentity.RenderProductEpoch != LiveRenderProductEpoch)
    {
        return false;
    }

    const auto metadataMatches = [&](const CaptureSourceIdentity& candidate) {
        return candidate.Valid
            && candidate.RenderProductEpoch
                == expectedIdentity.RenderProductEpoch
            && candidate.Sequence == expectedIdentity.Sequence;
    };
    const bool globalIdentityMatches = PublishedGraphicsRenderContext == nullptr
        && metadataMatches(PublishedGlobalRenderIdentity);
    if (globalIdentityMatches
        && ColorImageInitialized
        && ColorImage != VK_NULL_HANDLE
        && ColorImageView != VK_NULL_HANDLE
        && ColorImageWidth != 0u
        && ColorImageHeight != 0u
        && PublishedGlobalRenderFence != VK_NULL_HANDLE
        && vkGetFenceStatus(Device, PublishedGlobalRenderFence) == VK_SUCCESS)
    {
        outSource.Image = ColorImage;
        outSource.ImageView = ColorImageView;
        outSource.Width = ColorImageWidth;
        outSource.Height = ColorImageHeight;
        outSource.Identity = PublishedGlobalRenderIdentity;
        return true;
    }

    for (const RenderContext& context : activeRenderContexts())
    {
        const CaptureSourceIdentity candidateIdentity =
            captureSourceIdentityForContext(&context);
        if (!metadataMatches(candidateIdentity)
            || !context.RasterProductSlot.Initialized
            || context.RasterProductSlot.ColorImage == VK_NULL_HANDLE
            || context.RasterProductSlot.ColorImageView == VK_NULL_HANDLE
            || context.RasterProductSlot.Width == 0u
            || context.RasterProductSlot.Height == 0u
            || context.FrameFence == VK_NULL_HANDLE
            || vkGetFenceStatus(Device, context.FrameFence) != VK_SUCCESS)
        {
            continue;
        }

        outSource.Image = context.RasterProductSlot.ColorImage;
        outSource.ImageView = context.RasterProductSlot.ColorImageView;
        outSource.Width = context.RasterProductSlot.Width;
        outSource.Height = context.RasterProductSlot.Height;
        outSource.Identity = candidateIdentity;
        return outSource.Identity.Valid;
    }

    return false;
}

bool VulkanRenderer3D::GetPublishedRenderIdentity(
    SubmittedRenderIdentity& outIdentity) const noexcept
{
    if (PublishedGraphicsRenderContext != nullptr)
    {
        outIdentity = captureSourceIdentityForContext(PublishedGraphicsRenderContext);
    }
    else if (ColorImageInitialized
        && ColorImage != VK_NULL_HANDLE
        && ColorImageView != VK_NULL_HANDLE
        && ColorImageWidth != 0u
        && ColorImageHeight != 0u)
    {
        outIdentity = PublishedGlobalRenderIdentity;
    }
    else
    {
        outIdentity = {};
    }
    return outIdentity.Valid;
}

bool VulkanRenderer3D::GetPinnedCaptureRenderIdentity(
    SubmittedRenderIdentity& outIdentity) const noexcept
{
    outIdentity = {};
    VkImage ignoredImage = VK_NULL_HANDLE;
    VkImageView ignoredView = VK_NULL_HANDLE;
    u32 ignoredWidth = 0u;
    u32 ignoredHeight = 0u;
    bool zeroPolygons = false;
    if (!GetPinnedCaptureRender(
            ignoredImage,
            ignoredView,
            ignoredWidth,
            ignoredHeight,
            zeroPolygons))
    {
        return false;
    }

    outIdentity = captureSourceIdentityForContext(PinnedCaptureExportContext);
    return outIdentity.Valid;
}

bool VulkanRenderer3D::GetLastServedCaptureSourceIdentity(
    CaptureSourceIdentity& outIdentity) const noexcept
{
    outIdentity = LastServedCaptureSourceIdentity;
    return outIdentity.Valid;
}

bool VulkanRenderer3D::GetLiveRenderProductIdentity(
    LiveRenderProductIdentity& outIdentity) const noexcept
{
    outIdentity = CurrentFrameLiveRenderIdentity;
    return outIdentity.Valid;
}

void VulkanRenderer3D::InvalidateRenderProductIdentities() noexcept
{
    beginRenderProductEpoch();
    InvalidatePresentationState(false);
}

LiveRenderProductIdentity VulkanRenderer3D::liveRenderIdentityForContext(
    const RenderContext* context) const noexcept
{
    LiveRenderProductIdentity identity{};
    if (context == nullptr
        || !context->SubmittedMetadataValid
        || context->SubmittedRenderProductEpoch != LiveRenderProductEpoch
        || context->SubmitSequence == 0u)
    {
        return identity;
    }

    identity.Valid = true;
    identity.Epoch = context->SubmittedRenderProductEpoch;
    identity.Sequence = context->SubmitSequence;
    return identity;
}

void VulkanRenderer3D::latchCurrentFramePublishedIdentities() noexcept
{
    if (PublishedGraphicsRenderContext != nullptr)
    {
        CurrentFrameLiveRenderIdentity =
            liveRenderIdentityForContext(PublishedGraphicsRenderContext);
        CurrentFrameServedIdentity =
            captureSourceIdentityForContext(PublishedGraphicsRenderContext);
    }
    else
    {
        CurrentFrameLiveRenderIdentity = PublishedGlobalLiveRenderIdentity;
        CurrentFrameServedIdentity = PublishedGlobalRenderIdentity;
    }

    if (!CurrentFrameLiveRenderIdentity.Valid)
        CurrentFrameServedIdentity = {};
}

CaptureSourceIdentity VulkanRenderer3D::captureSourceIdentityForContext(
    const RenderContext* context) const noexcept
{
    CaptureSourceIdentity identity{};
    if (context == nullptr
        || !context->SubmittedMetadataValid
        || context->SubmittedRenderProductEpoch != LiveRenderProductEpoch
        || context->SubmitSequence == 0u)
        return identity;

    identity.Valid = true;
    identity.RenderProductEpoch = context->SubmittedRenderProductEpoch;
    identity.Sequence = context->SubmitSequence;
    identity.PolygonCount = context->SubmittedPolygonCount;
    identity.CaptureCnt = context->SubmittedCaptureCnt;
    identity.ScreenSwap = context->SubmittedScreenSwap;
    return identity;
}

bool VulkanRenderer3D::IsParitySubmitFresh(bool topScreen, u64 maxAge) const noexcept
{

    return false;
}

void VulkanRenderer3D::ReleasePresentationColorTarget(u64 token) noexcept
{
    if (token == 0)
        return;

    const u64 index = token - 1u;
    if (index >= GetAsyncRenderContextCount())
        return;

    RenderContext& context = RenderContexts[static_cast<size_t>(index)];
    if (context.PresentationRetainCount > 0u)
        context.PresentationRetainCount--;
}

std::vector<u32> VulkanRenderer3D::CaptureColorTargetForDebug()
{
    if (!ensureInitialized() || ColorImage == VK_NULL_HANDLE || ColorImageWidth == 0 || ColorImageHeight == 0)
        return {};

    if (!readbackColorTargetToCpu())
        return {};

    return RawReadbackRgba;
}

std::vector<u32> VulkanRenderer3D::CaptureTopDepthForDebug()
{
    if (!ensureInitialized() || ColorImageWidth == 0 || ColorImageHeight == 0)
        return {};

    std::vector<u32> depthPixels;
    if (!readbackGraphicsDepthImageToCpu(depthPixels))
        return {};
    return depthPixels;
}

std::vector<u32> VulkanRenderer3D::CaptureTopAttrForDebug()
{
    if (!ensureInitialized() || ColorImageWidth == 0 || ColorImageHeight == 0)
        return {};

    std::vector<u32> attrPixels;
    if (!readbackGraphicsAttrImageToCpu(attrPixels))
        return {};
    return attrPixels;
}

std::vector<u32> VulkanRenderer3D::CaptureTopCoverageForDebug()
{
    const std::vector<u32> topAttr = CaptureTopAttrForDebug();
    if (topAttr.empty())
        return {};

    std::vector<u32> coverage(topAttr.size(), 0u);
    for (size_t i = 0; i < topAttr.size(); i++)
        coverage[i] = (topAttr[i] >> 8u) & 0x1Fu;
    return coverage;
}

bool VulkanRenderer3D::EnsureVulkanReadyForValidation()
{
    if (!ensureInitialized())
        return false;

    constexpr u32 kValidationWidth = 256;
    constexpr u32 kValidationHeight = 192;

    if (!ensureRenderTarget(kValidationWidth, kValidationHeight))
        return false;
    if (!ensureTriangleBuffer(nullptr, 1))
        return false;
    if (!ensureGraphicsVertexBuffer(nullptr, 1))
        return false;
    if (!ensureGraphicsSceneVertexBuffer(1))
        return false;
    if (!ensureGraphicsEdgeIndexBuffer(1))
        return false;
    if (!ensureToonBuffer(nullptr))
        return false;
    if (!ensureCaptureLineBuffer(nullptr))
        return false;

    Triangles.clear();
    GraphicsVertices.clear();
    ActiveTextureDescriptorCount = 0;
    ActiveTextureDescriptors.fill(VkDescriptorImageInfo{});
    if (getTextureDescriptorPolicy().RequiresNormalizedTextureDescriptor())
        ActiveNormalizedTextureDescriptors.fill(VkDescriptorImageInfo{});

    std::array<u8, 34> fogDensity{};
    std::array<u16, 8> edgeColors{};
    std::array<u16, 32> toonTable{};

    return dispatchRasterAndReadback(
        nullptr,
        0xFF000000u,
        0x00FFFFFFu,
        0u,
        0u,
        0u,
        0u,
        0u,
        0u,
        fogDensity.data(),
        edgeColors.data(),
        toonTable.data()
    );
}

bool VulkanRenderer3D::PrepareRenderTargetsForStart()
{

    if (!Initialized || !GraphicsReady || hasRetainedRenderProducts()
        || PendingCaptureLineContext != nullptr)
        return false;
    for (const RenderContext& context : activeRenderContexts())
    {
        if (context.SubmittedMetadataValid || context.SubmitSequence != 0u
            || context.FrameFence == VK_NULL_HANDLE
            || vkGetFenceStatus(Device, context.FrameFence) != VK_SUCCESS)
            return false;
    }

    const u32 scale = static_cast<u32>(std::max(1, ScaleFactor));
    const u32 width = 256u * scale;
    const u32 height = 192u * scale;
    const u64 startNs = PerfNowNs();
    if (!ensureRenderTarget(width, height))
        return false;
    if (Threaded)
    {
        for (RenderContext& context : activeRenderContexts())
        {
            if (!ensureFaithfulRasterProductSlot(context.RasterProductSlot, width, height))
                return false;
        }
    }
    Log(LogLevel::Warn, "Vulkan prewarm targets: width=%u height=%u contexts=%zu elapsed=%.3fms",
        width, height, Threaded ? GetAsyncRenderContextCount() : 0u,
        static_cast<double>(PerfNowNs() - startNs) / 1000000.0);
    return true;
}

bool VulkanRenderer3D::ensureInitialized()
{
    if (Initialized)
        return true;

    if (InitFailed)
        return false;

    if (!VulkanContext::Get().Acquire())
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to acquire shared Vulkan context");
        InitFailed = true;
        return false;
    }

    ContextAcquired = true;
    Instance = VulkanContext::Get().GetInstance();
    PhysicalDevice = VulkanContext::Get().GetPhysicalDevice();
    Device = VulkanContext::Get().GetDevice();
    Queue = VulkanContext::Get().GetQueue();
    QueueFamilyIndex = VulkanContext::Get().GetQueueFamilyIndex();
    ResetQueryPool = VulkanContext::Get().GetResetQueryPool();
    TimestampPeriodNs = VulkanContext::Get().GetTimestampPeriod();
    TimestampQueriesSupported = VulkanContext::Get().SupportsTimestamps();
    ActiveTextureSamplingPath = resolveTextureSamplingPath();

    if (!createCommandObjects() || !createSyncObjects() || !createTextureResources())
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to initialize Vulkan resources");
        destroyVulkan();
        InitFailed = true;
        return false;
    }

    if (!createPipelineCache(ActiveTextureSamplingPath))
    {
        Log(
            LogLevel::Warn,
            "VulkanRenderer3D: pipeline cache unavailable, continuing without persistent cache"
        );
    }

    if (!createCaptureExportResources())
    {
        Log(LogLevel::Error, "VulkanRenderer3D: capture export initialization failed");
        destroyVulkan();
        InitFailed = true;
        return false;
    }

    if (!createGraphicsDescriptorObjects())
    {
        Log(LogLevel::Error, "VulkanRenderer3D: graphics descriptor initialization failed");
        destroyVulkan();
        InitFailed = true;
        return false;
    }
    else if (!createGraphicsPipelines())
    {
        Log(LogLevel::Error, "VulkanRenderer3D: graphics pipeline initialization failed");
        destroyVulkan();
        InitFailed = true;
        return false;
    }

    Initialized = true;
    return true;
}

void VulkanRenderer3D::destroyVulkan()
{
    FrameSubmissionDeferred = false;
    (void)flushDeferredRenderSubmission();
    if (Device != VK_NULL_HANDLE)
        (void)waitForDeviceIdle("renderer destruction");

    for (RenderContext& context : activeRenderContexts())
    {
        context.PresentationRetainCount = 0u;
    }

    resetCaptureLineState();
    destroyReadbackBuffer();
    destroyTriangleBuffer(nullptr);
    destroyGraphicsVertexBuffer(nullptr);
    destroyGraphicsSceneVertexBuffer();
    destroyGraphicsEdgeIndexBuffer();
    destroyToonBuffer(nullptr);
    destroyGraphicsClearBuffer(nullptr);
    destroyAllCaptureLineBuffers();
    destroyFallbackTexture();
    destroyRenderTarget();
    destroyTriangleBuffer(&NativeProjectionContext);
    destroyGraphicsVertexBuffer(&NativeProjectionContext);
    destroyGraphicsSceneVertexBuffer(&NativeProjectionContext);
    destroyGraphicsEdgeIndexBuffer(&NativeProjectionContext);
    destroyToonBuffer(&NativeProjectionContext);
    destroyGraphicsClearBuffer(&NativeProjectionContext);
    destroyCaptureLineBuffer(&NativeProjectionContext);
    destroyFaithfulRasterProductSlot(NativeProjectionContext.RasterProductSlot);








    if (CaptureLineExportPipeline != VK_NULL_HANDLE)
    {
        vkDestroyPipeline(Device, CaptureLineExportPipeline, nullptr);
        CaptureLineExportPipeline = VK_NULL_HANDLE;
    }

    if (GraphicsFinalFogPipeline != VK_NULL_HANDLE)
    {
        vkDestroyPipeline(Device, GraphicsFinalFogPipeline, nullptr);
        GraphicsFinalFogPipeline = VK_NULL_HANDLE;
    }

    if (GraphicsFinalEdgePipeline != VK_NULL_HANDLE)
    {
        vkDestroyPipeline(Device, GraphicsFinalEdgePipeline, nullptr);
        GraphicsFinalEdgePipeline = VK_NULL_HANDLE;
    }
    if (GraphicsFinalEdgeFogPipeline != VK_NULL_HANDLE)
    {
        vkDestroyPipeline(Device, GraphicsFinalEdgeFogPipeline, nullptr);
        GraphicsFinalEdgeFogPipeline = VK_NULL_HANDLE;
    }

    if (GraphicsClearPipeline != VK_NULL_HANDLE)
    {
        vkDestroyPipeline(Device, GraphicsClearPipeline, nullptr);
        GraphicsClearPipeline = VK_NULL_HANDLE;
    }

    if (GraphicsStencilBitClearPipeline != VK_NULL_HANDLE)
    {
        vkDestroyPipeline(Device, GraphicsStencilBitClearPipeline, nullptr);
        GraphicsStencilBitClearPipeline = VK_NULL_HANDLE;
    }

    for (VkPipeline& pipeline : GraphicsShadowBlendBgZeroPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsShadowBlendPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsEdgeMarkPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsEdgeMarkAlphaPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsShadowClearPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsShadowMaskBgZeroPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsShadowMaskPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsShadowMaskDepthComplementPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsTranslucentPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsBoundedDepthTranslucentPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsTranslucentFastModulatePlainFragmentDepthPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsBgZeroTranslucentPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsBoundedDepthBgZeroTranslucentPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsBgZeroFastModulatePlainPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaquePipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueOcclusionNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFragmentDepthPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulatePlainFragmentDepthPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateOpaqueAlphaPlainFragmentDepthPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaquePrepassHwDepthPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueAlphaPrepassHwDepthPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueFragmentDepthPrepassPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueAlphaFragmentDepthPrepassPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueStencilResolvePipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueUiOverlayPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulatePipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateOcclusionNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateToonPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateToonNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateToonOcclusionNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulatePlainPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulatePlainNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueFastModulatePlainOcclusionNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateOpaqueAlphaToonPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateOpaqueAlphaToonNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateOpaqueAlphaToonOcclusionNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateOpaqueAlphaPlainPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateOpaqueAlphaPlainNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateOpaqueAlphaPlainColorOnlyPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateOpaqueAlphaPlainOcclusionNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }
    for (VkPipeline& pipeline : GraphicsOpaqueFastModulateOpaqueAlphaPlainNoDepthOcclusionNoAttrPipelines)
    {
        if (pipeline != VK_NULL_HANDLE)
        {
            vkDestroyPipeline(Device, pipeline, nullptr);
            pipeline = VK_NULL_HANDLE;
        }
    }

    savePipelineCache();
    if (ComputePipelineCache != VK_NULL_HANDLE)
    {
        vkDestroyPipelineCache(Device, ComputePipelineCache, nullptr);
        ComputePipelineCache = VK_NULL_HANDLE;
    }
    ComputePipelineCacheFile.clear();

    if (CaptureExportPipelineLayout != VK_NULL_HANDLE)
    {
        vkDestroyPipelineLayout(Device, CaptureExportPipelineLayout, nullptr);
        CaptureExportPipelineLayout = VK_NULL_HANDLE;
    }


    if (GraphicsPipelineLayout != VK_NULL_HANDLE)
    {
        vkDestroyPipelineLayout(Device, GraphicsPipelineLayout, nullptr);
        GraphicsPipelineLayout = VK_NULL_HANDLE;
    }

    if (GraphicsAttachmentSampler != VK_NULL_HANDLE)
    {
        vkDestroySampler(Device, GraphicsAttachmentSampler, nullptr);
        GraphicsAttachmentSampler = VK_NULL_HANDLE;
    }

    if (GraphicsFinalRenderPass != VK_NULL_HANDLE)
    {
        vkDestroyRenderPass(Device, GraphicsFinalRenderPass, nullptr);
        GraphicsFinalRenderPass = VK_NULL_HANDLE;
    }

    if (GraphicsColorOnlyRenderPass != VK_NULL_HANDLE)
    {
        vkDestroyRenderPass(Device, GraphicsColorOnlyRenderPass, nullptr);
        GraphicsColorOnlyRenderPass = VK_NULL_HANDLE;
    }

    if (GraphicsRasterLoadRenderPass != VK_NULL_HANDLE)
    {
        vkDestroyRenderPass(Device, GraphicsRasterLoadRenderPass, nullptr);
        GraphicsRasterLoadRenderPass = VK_NULL_HANDLE;
    }

    if (GraphicsRasterRenderPass != VK_NULL_HANDLE)
    {
        vkDestroyRenderPass(Device, GraphicsRasterRenderPass, nullptr);
        GraphicsRasterRenderPass = VK_NULL_HANDLE;
    }

    if (GraphicsRasterSinEscrituraRenderPass != VK_NULL_HANDLE)
    {
        vkDestroyRenderPass(Device, GraphicsRasterSinEscrituraRenderPass, nullptr);
        GraphicsRasterSinEscrituraRenderPass = VK_NULL_HANDLE;
    }

    if (CaptureExportDescriptorPool != VK_NULL_HANDLE)
    {
        vkDestroyDescriptorPool(Device, CaptureExportDescriptorPool, nullptr);
        CaptureExportDescriptorPool = VK_NULL_HANDLE;
    }


    if (GraphicsDescriptorPool != VK_NULL_HANDLE)
    {
        vkDestroyDescriptorPool(Device, GraphicsDescriptorPool, nullptr);
        GraphicsDescriptorPool = VK_NULL_HANDLE;
    }

    CaptureExportDescriptorSet = VK_NULL_HANDLE;
    FaithfulCaptureExportDescriptorSets.fill(VK_NULL_HANDLE);
    GraphicsDescriptorSets.fill(VK_NULL_HANDLE);
    for (auto& pageSets : FaithfulGraphicsDescriptorSets)
        pageSets.fill(VK_NULL_HANDLE);
    invalidateAllGraphicsDescriptorSetCaches();
    for (RenderContext& renderContext : activeRenderContexts())
    {
        renderContext.CaptureExportDescriptorSet = VK_NULL_HANDLE;
        renderContext.GraphicsDescriptorSets.fill(VK_NULL_HANDLE);
    }
    NativeProjectionContext.CaptureExportDescriptorSet = VK_NULL_HANDLE;
    NativeProjectionContext.GraphicsDescriptorSets.fill(VK_NULL_HANDLE);

    if (CaptureExportDescriptorSetLayout != VK_NULL_HANDLE)
    {
        vkDestroyDescriptorSetLayout(Device, CaptureExportDescriptorSetLayout, nullptr);
        CaptureExportDescriptorSetLayout = VK_NULL_HANDLE;
    }


    if (GraphicsDescriptorSetLayout != VK_NULL_HANDLE)
    {
        vkDestroyDescriptorSetLayout(Device, GraphicsDescriptorSetLayout, nullptr);
        GraphicsDescriptorSetLayout = VK_NULL_HANDLE;
    }

    for (RenderContext& renderContext : activeRenderContexts())
    {
        destroyTriangleBuffer(&renderContext);
        destroyGraphicsVertexBuffer(&renderContext);
        destroyGraphicsSceneVertexBuffer(&renderContext);
        destroyGraphicsEdgeIndexBuffer(&renderContext);
        destroyToonBuffer(&renderContext);
        destroyGraphicsClearBuffer(&renderContext);
        destroyCaptureLineBuffer(&renderContext);
        destroyFaithfulRasterProductSlot(renderContext.RasterProductSlot);
        if (renderContext.TimestampQueryPool != VK_NULL_HANDLE)
        {
            vkDestroyQueryPool(Device, renderContext.TimestampQueryPool, nullptr);
            renderContext.TimestampQueryPool = VK_NULL_HANDLE;
        }
        if (renderContext.FrameFence != VK_NULL_HANDLE)
        {
            vkDestroyFence(Device, renderContext.FrameFence, nullptr);
            renderContext.FrameFence = VK_NULL_HANDLE;
        }
        if (renderContext.CommandPool != VK_NULL_HANDLE)
        {
            vkDestroyCommandPool(Device, renderContext.CommandPool, nullptr);
            renderContext.CommandPool = VK_NULL_HANDLE;
        }
        renderContext.CommandBuffer = VK_NULL_HANDLE;
    }
    if (FrameFence != VK_NULL_HANDLE)
    {
        vkDestroyFence(Device, FrameFence, nullptr);
        FrameFence = VK_NULL_HANDLE;
    }
    for (VkFence& faithfulFence : VallaFiel)
    {
        if (faithfulFence != VK_NULL_HANDLE)
        {
            vkDestroyFence(Device, faithfulFence, nullptr);
            faithfulFence = VK_NULL_HANDLE;
        }
    }
    if (VallaExport != VK_NULL_HANDLE)
    {
        vkDestroyFence(Device, VallaExport, nullptr);
        VallaExport = VK_NULL_HANDLE;
    }
    NativeProjectionContext.FrameFence = VK_NULL_HANDLE;
    if (TimestampQueryPool != VK_NULL_HANDLE)
    {
        vkDestroyQueryPool(Device, TimestampQueryPool, nullptr);
        TimestampQueryPool = VK_NULL_HANDLE;
    }

    if (CommandPool != VK_NULL_HANDLE)
    {
        vkDestroyCommandPool(Device, CommandPool, nullptr);
        CommandPool = VK_NULL_HANDLE;
    }

    CommandBuffer = VK_NULL_HANDLE;
    CbFiel[0] = VK_NULL_HANDLE;
    CbFiel[1] = VK_NULL_HANDLE;
    CbExport = VK_NULL_HANDLE;
    NativeProjectionContext.CommandBuffer = VK_NULL_HANDLE;
    NativeProjectionSubmitInFlight = false;
    NextRenderContextIndex = 0;
    PublishedGraphicsRenderContext = nullptr;

    if (ContextAcquired)
    {
        VulkanContext::Get().Release();
        ContextAcquired = false;
    }

    Instance = VK_NULL_HANDLE;
    PhysicalDevice = VK_NULL_HANDLE;
    Device = VK_NULL_HANDLE;
    DeferredRenderSubmitResult = VK_SUCCESS;
    Queue = VK_NULL_HANDLE;
    QueueFamilyIndex = 0;
    ResetQueryPool = nullptr;
    TimestampPeriodNs = 0.0f;
    TimestampQueriesSupported = false;
    Initialized = false;
    ColorImageInitialized = false;
    GraphicsReady = false;
    ActiveTextureDescriptorCount = 0;
    ActiveTextureDescriptors.fill(VkDescriptorImageInfo{});
    ActiveNormalizedTextureDescriptors.fill(VkDescriptorImageInfo{});
    GraphicsResolvedTextureCache.clear();
    ActiveTextureSamplingPath = TextureSamplingPath::DynamicUniform;
}

bool VulkanRenderer3D::createCommandObjects()
{
    if (!createCommandObjects(CommandPool, CommandBuffer))
        return false;

    {
        VkCommandBufferAllocateInfo extraInfo{};
        extraInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO;
        extraInfo.commandPool = CommandPool;
        extraInfo.level = VK_COMMAND_BUFFER_LEVEL_PRIMARY;
        extraInfo.commandBufferCount = 1;
        if (vkAllocateCommandBuffers(Device, &extraInfo, &CbFiel[0]) != VK_SUCCESS
            || vkAllocateCommandBuffers(Device, &extraInfo, &CbFiel[1]) != VK_SUCCESS
            || vkAllocateCommandBuffers(Device, &extraInfo, &CbExport) != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: fallo alocando CBs del ping-pong fiel");
            return false;
        }
        NativeProjectionContext.CommandBuffer = CbExport;
    }

    for (RenderContext& renderContext : activeRenderContexts())
    {
        if (!createCommandObjects(renderContext.CommandPool, renderContext.CommandBuffer))
            return false;
    }

    return true;
}

bool VulkanRenderer3D::createCommandObjects(VkCommandPool& commandPool, VkCommandBuffer& commandBuffer)
{
    VkCommandPoolCreateInfo poolInfo{};
    poolInfo.sType = VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO;
    poolInfo.flags = VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT;
    poolInfo.queueFamilyIndex = QueueFamilyIndex;

    if (vkCreateCommandPool(Device, &poolInfo, nullptr, &commandPool) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create command pool");
        return false;
    }

    VkCommandBufferAllocateInfo cmdAllocInfo{};
    cmdAllocInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO;
    cmdAllocInfo.commandPool = commandPool;
    cmdAllocInfo.level = VK_COMMAND_BUFFER_LEVEL_PRIMARY;
    cmdAllocInfo.commandBufferCount = 1;

    if (vkAllocateCommandBuffers(Device, &cmdAllocInfo, &commandBuffer) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate command buffer");
        return false;
    }

    return true;
}

bool VulkanRenderer3D::createSyncObjects()
{
    if (!createFence(FrameFence))
        return false;

    if (!createFence(VallaFiel[0]) || !createFence(VallaFiel[1]) || !createFence(VallaExport))
        return false;
    NativeProjectionContext.FrameFence = VallaExport;
    if (!createTimestampQueryPool(TimestampQueryPool))
        return false;

    for (RenderContext& renderContext : activeRenderContexts())
    {
        if (!createFence(renderContext.FrameFence))
            return false;
        if (!createTimestampQueryPool(renderContext.TimestampQueryPool))
            return false;
    }

    return true;
}

bool VulkanRenderer3D::createFence(VkFence& fence)
{
    VkFenceCreateInfo fenceCreateInfo{};
    fenceCreateInfo.sType = VK_STRUCTURE_TYPE_FENCE_CREATE_INFO;
    fenceCreateInfo.flags = VK_FENCE_CREATE_SIGNALED_BIT;

    if (vkCreateFence(Device, &fenceCreateInfo, nullptr, &fence) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create frame fence");
        return false;
    }

    return true;
}

bool VulkanRenderer3D::createTimestampQueryPool(VkQueryPool& queryPool)
{
    if (!TimestampQueriesSupported)
        return true;

    VkQueryPoolCreateInfo queryPoolCreateInfo{};
    queryPoolCreateInfo.sType = VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO;
    queryPoolCreateInfo.queryType = VK_QUERY_TYPE_TIMESTAMP;
    queryPoolCreateInfo.queryCount = TimestampQueryCount;

    if (vkCreateQueryPool(Device, &queryPoolCreateInfo, nullptr, &queryPool) != VK_SUCCESS)
    {
        Log(LogLevel::Warn, "VulkanRenderer3D: failed to create timestamp query pool");
        queryPool = VK_NULL_HANDLE;
    }

    return true;
}

bool VulkanRenderer3D::waitForRenderContext(RenderContext& context)
{
    if (!flushDeferredRenderSubmission())
        return false;
    if (Device == VK_NULL_HANDLE || context.FrameFence == VK_NULL_HANDLE)
        return false;
    if (isRenderContextRetained(context))
        return false;

    const VkResult fenceStatus = vkGetFenceStatus(Device, context.FrameFence);
    if (fenceStatus == VK_NOT_READY)
        ContextMissCount++;

    const u64 waitStartNs = PerfNowNs();
    const VkResult waitResult = vkWaitForFences(Device, 1, &context.FrameFence, VK_TRUE, kFenceWaitTimeoutNs);
    if (waitResult != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: render context fence wait failed (%d)", static_cast<int>(waitResult));
        return false;
    }

    const u64 waitDurationNs = PerfNowNs() - waitStartNs;
    FenceWaitCpuWindow.Add(waitDurationNs);
    if (waitDurationNs >= 1000000ull)
        LateFrameCount++;
    consumeGpuTiming(&context);

    return true;
}

bool VulkanRenderer3D::tryAcquireRenderContext(RenderContext& context, bool countMisses)
{
    if (Device == VK_NULL_HANDLE || context.FrameFence == VK_NULL_HANDLE)
        return false;
    if (!isRenderContextReusable(context))
        return false;

    const VkResult fenceStatus = vkGetFenceStatus(Device, context.FrameFence);
    if (fenceStatus == VK_SUCCESS)
    {
        FenceWaitCpuWindow.Add(0);
        consumeGpuTiming(&context);
        return true;
    }

    if (fenceStatus == VK_NOT_READY)
    {
        if (countMisses)
        {
            ContextMissCount++;
            DroppedFrameCount++;
        }
        return false;
    }

    Log(LogLevel::Error, "VulkanRenderer3D: render context fence status failed (%d)", static_cast<int>(fenceStatus));
    return false;
}

bool VulkanRenderer3D::isNewestOfItsParity(const RenderContext& context) const noexcept
{
    if (!context.SubmittedMetadataValid
        || context.SubmittedRenderProductEpoch != LiveRenderProductEpoch)
        return false;
    for (const RenderContext& other : activeRenderContexts())
    {
        if (&other == &context
            || !other.SubmittedMetadataValid
            || other.SubmittedRenderProductEpoch != LiveRenderProductEpoch)
            continue;
        if (other.SubmittedScreenSwap == context.SubmittedScreenSwap
            && other.SubmitSequence > context.SubmitSequence)
        {
            return false;
        }
    }
    return true;
}

VulkanRenderer3D::RenderContext* VulkanRenderer3D::tryAcquireReadyRenderContext() noexcept
{
    if (!Threaded || Device == VK_NULL_HANDLE)
        return nullptr;

    const size_t contextCount = GetAsyncRenderContextCount();
    for (size_t i = 0; i < contextCount; i++)
    {
        const size_t contextIndex = (NextRenderContextIndex + i) % contextCount;
        RenderContext& context = RenderContexts[contextIndex];
        if (isNewestOfItsParity(context))
            continue;
        if (!tryAcquireRenderContext(context, false))
            continue;

        NextRenderContextIndex = (contextIndex + 1) % contextCount;
        return &context;
    }

    return nullptr;
}

bool VulkanRenderer3D::waitForAllRenderContexts()
{
    for (RenderContext& renderContext : activeRenderContexts())
    {
        if (!waitForRenderContext(renderContext))
            return false;
    }

    return true;
}

bool VulkanRenderer3D::waitForReadbackSource()
{
    if (!flushDeferredRenderSubmission())
        return false;
    if (Device == VK_NULL_HANDLE)
        return false;

    const bool usePrimaryFrameFence =
        !Threaded
        || LastSubmittedRenderContext == nullptr;
    if (usePrimaryFrameFence)
    {
        if (FrameFence == VK_NULL_HANDLE)
            return false;

        const VkResult fenceStatus = vkGetFenceStatus(Device, FrameFence);
        if (fenceStatus == VK_SUCCESS)
        {
            FenceWaitCpuWindow.Add(0);
            consumeGpuTiming(nullptr);
            return true;
        }
        if (fenceStatus != VK_NOT_READY)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: frame fence status failed (%d)", static_cast<int>(fenceStatus));
            return false;
        }

        const u64 waitStartNs = PerfNowNs();
        const VkResult waitResult = vkWaitForFences(Device, 1, &FrameFence, VK_TRUE, kFenceWaitTimeoutNs);
        if (waitResult != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: frame fence wait failed (%d)", static_cast<int>(waitResult));
            return false;
        }

        const u64 waitDurationNs = PerfNowNs() - waitStartNs;
        FenceWaitCpuWindow.Add(waitDurationNs);
        if (waitDurationNs >= 1000000ull)
            LateFrameCount++;
        consumeGpuTiming(nullptr);
        return true;
    }

    // Render and presentation share one queue. Waiting for the newest submitted
    // render context fence guarantees all older submissions are finished too.
    if (LastSubmittedRenderContext != nullptr)
        return waitForRenderContext(*LastSubmittedRenderContext);

    return waitForAllRenderContexts();
}

bool VulkanRenderer3D::waitForTextureCacheMutationSafePoint()
{
    if (Device == VK_NULL_HANDLE)
        return false;

    bool ok = true;
    if (FrameFence != VK_NULL_HANDLE)
    {
        const VkResult fenceStatus = vkGetFenceStatus(Device, FrameFence);
        if (fenceStatus == VK_SUCCESS)
        {
            FenceWaitCpuWindow.Add(0);
            consumeGpuTiming(nullptr);
        }
        else if (fenceStatus == VK_NOT_READY)
        {
            const u64 waitStartNs = PerfNowNs();
            const VkResult waitResult = vkWaitForFences(Device, 1, &FrameFence, VK_TRUE, kFenceWaitTimeoutNs);
            if (waitResult == VK_SUCCESS)
            {
                const u64 waitDurationNs = PerfNowNs() - waitStartNs;
                FenceWaitCpuWindow.Add(waitDurationNs);
                if (waitDurationNs >= 1000000ull)
                    LateFrameCount++;
                consumeGpuTiming(nullptr);
            }
            else
            {
                Log(LogLevel::Error, "VulkanRenderer3D: texture cache frame fence wait failed (%d)", static_cast<int>(waitResult));
                ok = false;
            }
        }
        else
        {
            Log(LogLevel::Error, "VulkanRenderer3D: texture cache frame fence status failed (%d)", static_cast<int>(fenceStatus));
            ok = false;
        }
    }

    if (Threaded)
    {
        for (RenderContext& renderContext : activeRenderContexts())
            ok = waitForRenderContext(renderContext) && ok;
    }

    return ok;
}


void VulkanRenderer3D::syncActiveCaptureLineBufferSlot()
{
    CaptureLineBuffer = CaptureLineBuffers[ActiveCaptureLineBufferSlot];
    CaptureLineMemory = CaptureLineMemories[ActiveCaptureLineBufferSlot];
    CaptureLineBufferSize = CaptureLineBufferSizes[ActiveCaptureLineBufferSlot];
    CaptureLineMapped = CaptureLineMappedSlots[ActiveCaptureLineBufferSlot];
}

void VulkanRenderer3D::storeActiveCaptureLineBufferSlot()
{
    CaptureLineBuffers[ActiveCaptureLineBufferSlot] = CaptureLineBuffer;
    CaptureLineMemories[ActiveCaptureLineBufferSlot] = CaptureLineMemory;
    CaptureLineBufferSizes[ActiveCaptureLineBufferSlot] = CaptureLineBufferSize;
    CaptureLineMappedSlots[ActiveCaptureLineBufferSlot] = CaptureLineMapped;
}

void VulkanRenderer3D::selectActiveCaptureLineBufferSlot(u32 slot)
{
    slot %= CaptureLineBufferSlotCount;
    if (ActiveCaptureLineBufferSlot == slot)
        return;

    storeActiveCaptureLineBufferSlot();
    ActiveCaptureLineBufferSlot = slot;
    syncActiveCaptureLineBufferSlot();
}

void VulkanRenderer3D::resetCaptureLineState()
{
    CaptureLinePending = false;
    CaptureLineReady = false;
    CaptureLineDataIsRgba8 = false;
    PendingCaptureLineContext = nullptr;
    ReadyCaptureLineData = nullptr;
    PendingCaptureLineBufferSlot = -1;
    ReadyCaptureLineBufferSlot = -1;
    PendingCaptureLineScreenSwap = false;
    ReadyCaptureLineScreenSwap = false;
    NativeProjectionCapturePending = false;
    PendingCaptureLineFence = VK_NULL_HANDLE;
    PendingCaptureLineIdentity = {};
    ReadyCaptureLineIdentity = {};
    CaptureFinalizeTimeoutStreak = 0;
    PendingCaptureLineRequiresPrimaryFence = false;
}

void VulkanRenderer3D::clearRawReadbackState()
{
    RawReadbackWidth = 0;
    RawReadbackHeight = 0;
    RawReadbackRgba.clear();
}

bool VulkanRenderer3D::finalizeCaptureLineFrame(bool blocking)
{

    {

        static const char* vallaTardeEnv = getenv("MELON_SONDA_VALLA_TARDE");
        static const int vallaTardeN = vallaTardeEnv ? atoi(vallaTardeEnv) : 0;
        static const bool vallaTardeDura =
            getenv("MELON_VALLA_TARDE_DURA") != nullptr;
        static u32 vallaTardeCuenta = 0;
        if (vallaTardeN > 0 && CaptureLinePending
            && (vallaTardeDura || !blocking)
            && (++vallaTardeCuenta % (u32)vallaTardeN) == 0u)
            return false;
    }
    if (!CaptureLinePending)
        return CaptureLineReady;

    bool waitOk = false;
    if (PendingCaptureLineContext != nullptr)
    {
        if (blocking)
        {
            constexpr u64 kCaptureFinalizeWaitBudgetNs = 200'000'000ull;
            constexpr u32 kMaxCaptureFinalizeTimeoutStreak = 8u;
            RenderContext& pendingContext = *PendingCaptureLineContext;
            if (Device == VK_NULL_HANDLE
                || pendingContext.FrameFence == VK_NULL_HANDLE)
            {
                waitOk = false;
            }
            else
            {
                const u64 waitStartNs = PerfNowNs();

                const u64 waitBudgetNs = NativeProjectionCapturePending
                    ? kFenceWaitTimeoutNs
                    : kCaptureFinalizeWaitBudgetNs;
                const VkResult waitResult = vkWaitForFences(
                    Device, 1, &pendingContext.FrameFence, VK_TRUE, waitBudgetNs);
                FenceWaitCpuWindow.Add(PerfNowNs() - waitStartNs);
                if (waitResult == VK_SUCCESS)
                {
                    consumeGpuTiming(&pendingContext);
                    CaptureFinalizeTimeoutStreak = 0;
                    waitOk = true;
                }
                else if (waitResult == VK_TIMEOUT
                    && ++CaptureFinalizeTimeoutStreak <= kMaxCaptureFinalizeTimeoutStreak)
                {
                    Log(LogLevel::Warn,
                        "VulkanRenderer3D: capture line finalize wait timed out (streak %u), keeping pending",
                        CaptureFinalizeTimeoutStreak);
                    return false;
                }
                else
                {
                    Log(LogLevel::Warn,
                        "VulkanRenderer3D: capture line finalize wait failed (%d), resetting",
                        static_cast<int>(waitResult));
                    CaptureFinalizeTimeoutStreak = 0;
                    waitOk = false;
                }
            }
        }
        else if (Device != VK_NULL_HANDLE && PendingCaptureLineContext->FrameFence != VK_NULL_HANDLE)
        {
            const VkResult fenceStatus = vkGetFenceStatus(Device, PendingCaptureLineContext->FrameFence);
            if (fenceStatus == VK_SUCCESS)
            {
                FenceWaitCpuWindow.Add(0);
                consumeGpuTiming(PendingCaptureLineContext);
                CaptureFinalizeTimeoutStreak = 0;
                waitOk = true;
            }
            else if (fenceStatus == VK_NOT_READY)
            {
                return false;
            }
            else
            {
                resetCaptureLineState();
                return false;
            }
        }
        else
        {
            resetCaptureLineState();
            return false;
        }
    }
    else
    {
        const VkFence captureFence = PendingCaptureLineFence != VK_NULL_HANDLE
            ? PendingCaptureLineFence
            : FrameFence;
        if (blocking)
        {
            constexpr u64 kCaptureFinalizeWaitBudgetNs = 200'000'000ull;
            constexpr u32 kMaxCaptureFinalizeTimeoutStreak = 8u;
            if (Device == VK_NULL_HANDLE || captureFence == VK_NULL_HANDLE)
            {
                waitOk = false;
            }
            else
            {
                const u64 waitStartNs = PerfNowNs();
                const u64 waitBudgetNs = NativeProjectionCapturePending
                    ? kFenceWaitTimeoutNs
                    : kCaptureFinalizeWaitBudgetNs;
                const VkResult waitResult = vkWaitForFences(
                    Device, 1, &captureFence, VK_TRUE,
                    waitBudgetNs);
                FenceWaitCpuWindow.Add(PerfNowNs() - waitStartNs);
                if (waitResult == VK_SUCCESS)
                {
                    consumeGpuTiming(nullptr);
                    CaptureFinalizeTimeoutStreak = 0;
                    waitOk = true;
                }
                else if (waitResult == VK_TIMEOUT
                    && ++CaptureFinalizeTimeoutStreak <= kMaxCaptureFinalizeTimeoutStreak)
                {
                    Log(LogLevel::Warn,
                        "VulkanRenderer3D: capture line finalize wait timed out (streak %u), keeping pending",
                        CaptureFinalizeTimeoutStreak);
                    return false;
                }
                else
                {
                    Log(LogLevel::Warn,
                        "VulkanRenderer3D: capture line finalize wait failed (%d), resetting",
                        static_cast<int>(waitResult));
                    CaptureFinalizeTimeoutStreak = 0;
                    waitOk = false;
                }
            }
        }
        else if (Device != VK_NULL_HANDLE && captureFence != VK_NULL_HANDLE)
        {
            const VkResult fenceStatus = vkGetFenceStatus(Device, captureFence);
            if (fenceStatus == VK_SUCCESS)
            {
                FenceWaitCpuWindow.Add(0);
                consumeGpuTiming(nullptr);
                CaptureFinalizeTimeoutStreak = 0;
                waitOk = true;
            }
            else if (fenceStatus == VK_NOT_READY)
            {
                return false;
            }
            else
            {
                resetCaptureLineState();
                return false;
            }
        }
        else
            return false;
    }

    if (!waitOk)
    {
        resetCaptureLineState();
        return false;
    }

    if (PendingCaptureLineContext != nullptr)
    {
        ReadyCaptureLineData = reinterpret_cast<const u32*>(PendingCaptureLineContext->CaptureLineMapped);
        ReadyCaptureLineBufferSlot = -1;
    }
    else if (PendingCaptureLineBufferSlot >= 0)
    {
        ReadyCaptureLineData = reinterpret_cast<const u32*>(
            CaptureLineMappedSlots[static_cast<size_t>(PendingCaptureLineBufferSlot)]);
        ReadyCaptureLineBufferSlot = PendingCaptureLineBufferSlot;
    }
    else
    {
        ReadyCaptureLineData = reinterpret_cast<const u32*>(CaptureLineMapped);
        ReadyCaptureLineBufferSlot = static_cast<int>(ActiveCaptureLineBufferSlot);
    }

    if (PendingCaptureLineContext == &NativeProjectionContext)
        NativeProjectionSubmitInFlight = false;
    CaptureLinePending = false;
    NativeProjectionCapturePending = false;
    PendingCaptureLineContext = nullptr;
    PendingCaptureLineBufferSlot = -1;
    PendingCaptureLineFence = VK_NULL_HANDLE;
    PendingCaptureLineRequiresPrimaryFence = false;
    ReadyCaptureLineScreenSwap = PendingCaptureLineScreenSwap;
    PendingCaptureLineScreenSwap = false;
    ReadyCaptureLineIdentity = PendingCaptureLineIdentity;
    PendingCaptureLineIdentity = {};
    CaptureLineReady = ReadyCaptureLineData != nullptr;
    if (!CaptureLineReady)
        ReadyCaptureLineIdentity = {};
    return CaptureLineReady;
}

bool VulkanRenderer3D::waitForDeviceIdle(const char* reason)
{
    if (!flushDeferredRenderSubmission())
        return false;
    if (!flushSubmissionDependency())
        return false;
    if (Device == VK_NULL_HANDLE)
        return false;

    auto& vulkanContext = VulkanContext::Get();
    VkResult waitResult = VK_SUCCESS;

    if (vulkanContext.IsPresentQueueDedicated())
    {
        std::scoped_lock queueLocks(
            vulkanContext.GetQueueLock(),
            vulkanContext.GetPresentQueueLock());
        waitResult = vkDeviceWaitIdle(Device);
    }
    else
    {
        std::scoped_lock queueLock(vulkanContext.GetQueueLock());
        waitResult = vkDeviceWaitIdle(Device);
    }
    if (waitResult != VK_SUCCESS)
    {
        Log(
            LogLevel::Error,
            "VulkanRenderer3D: vkDeviceWaitIdle failed while waiting for %s (%d)",
            reason != nullptr ? reason : "device idle",
            static_cast<int>(waitResult)
        );
        return false;
    }

    return true;
}

VulkanRenderer3D::RenderContext* VulkanRenderer3D::acquireNextRenderContext() noexcept
{
    const size_t contextCount = GetAsyncRenderContextCount();
    for (size_t i = 0; i < contextCount; i++)
    {
        const size_t contextIndex = (NextRenderContextIndex + i) % contextCount;
        RenderContext& renderContext = RenderContexts[contextIndex];
        if (!isRenderContextReusable(renderContext))
            continue;
        if (isNewestOfItsParity(renderContext))
            continue;

        NextRenderContextIndex = (contextIndex + 1) % contextCount;
        return &renderContext;
    }

    return nullptr;
}

void VulkanRenderer3D::requestPostFastForwardDrain()
{
    if (!Threaded)
        return;

    PostFastForwardDrainFrames = static_cast<u32>(GetAsyncRenderContextCount() * 3u);
}

void VulkanRenderer3D::consumeGpuTiming(RenderContext* context)
{
    VkQueryPool queryPool = context != nullptr ? context->TimestampQueryPool : TimestampQueryPool;
    bool& timestampPending = context != nullptr ? context->TimestampPending : TimestampPending;

    if (!timestampPending || queryPool == VK_NULL_HANDLE || TimestampPeriodNs <= 0.0f)
        return;

    u64 timestamps[TimestampQueryCount]{};
    const VkResult queryResult = vkGetQueryPoolResults(
        Device,
        queryPool,
        0,
        TimestampQueryCount,
        sizeof(timestamps),
        timestamps,
        sizeof(u64),
        VK_QUERY_RESULT_64_BIT
    );
    if (queryResult == VK_SUCCESS && timestamps[TimestampQueryCount - 1] >= timestamps[0])
    {
        auto toGpuNs = [&](u32 startIndex, u32 endIndex) -> u64 {
            if (endIndex >= TimestampQueryCount || timestamps[endIndex] < timestamps[startIndex])
                return 0;
            return static_cast<u64>(static_cast<double>(timestamps[endIndex] - timestamps[startIndex]) * static_cast<double>(TimestampPeriodNs));
        };

        const u64 gpuTimeNs = toGpuNs(0, TimestampQueryCount - 1);
        GpuWindow.Add(gpuTimeNs);
        {
            InterpGpuWindow.Add(toGpuNs(0, 3));
            BinGpuWindow.Add(toGpuNs(3, 4));
            RasterGpuWindow.Add(toGpuNs(0, 4));
            DepthBlendGpuWindow.Add(toGpuNs(4, 6));
            FinalGpuWindow.Add(toGpuNs(6, 7));
            CaptureLineExportGpuWindow.Add(toGpuNs(7, 8));
        }
    }

    timestampPending = false;
}

static bool perfForzadoPorPropiedadR3D()
{
#ifdef __ANDROID__

    static const bool forzado = [] {
        char v[92] = {};
        const bool leido = __system_property_get("debug.melonds.perf", v) > 0;
        return !(leido && v[0] == '0');
    }();
    return forzado;
#else
    return false;
#endif
}

void VulkanRenderer3D::logPerformanceIfNeeded()
{

    static const bool perfFuerza = std::getenv("MELON_PERF_FUERZA") != nullptr;
    if (!perfFuerza && !perfForzadoPorPropiedadR3D()
        && !MelonDSAndroid::areRendererDebugToolsEnabled())
        return;

    if (!RenderCpuWindow.Ready())
        return;

    Log(LogLevel::Warn,
        "VulkanPerf[NativeProjection]: composePrefetch=%llu lazy=%llu",
        static_cast<unsigned long long>(NativeComposePrefetchCount),
        static_cast<unsigned long long>(NativeLazyProjectionCount));
    NativeComposePrefetchCount = 0;
    NativeLazyProjectionCount = 0;

    const PerfSampleWindow<120>::Summary renderSummary = RenderCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary textureUpdateCpuSummary = TextureUpdateCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary warmTextureCpuSummary = WarmTextureCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary triangleBuildCpuSummary = TriangleBuildCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary bufferPrepCpuSummary = BufferPrepCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary descriptorUpdateCpuSummary = DescriptorUpdateCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary dispatchCpuSummary = DispatchCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary waitSummary = FenceWaitCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary gpuSummary = GpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary triangleSummary = TriangleCountWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary passSummary = PassCountWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsSceneBuildCpuSummary = GraphicsSceneBuildCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsTextureLookupCpuSummary = GraphicsTextureLookupCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsTexturePersistentCpuSummary = GraphicsTexturePersistentCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsTexcacheResolveCpuSummary = GraphicsTexcacheResolveCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsTextureDescriptorCpuSummary = GraphicsTextureDescriptorCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsTextureSlotCpuSummary = GraphicsTextureSlotCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsConstantTextureCpuSummary = GraphicsConstantTextureCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsVertexEmitCpuSummary = GraphicsVertexEmitCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsStatsCpuSummary = GraphicsStatsCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsMainCpuSummary = GraphicsMainCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary graphicsAlphaCpuSummary = GraphicsAlphaCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary finalCpuSummary = FinalCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary captureLineExportCpuSummary = CaptureLineExportCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary interpGpuSummary = InterpGpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary binGpuSummary = BinGpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary rasterGpuSummary = RasterGpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary depthBlendGpuSummary = DepthBlendGpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary finalGpuSummary = FinalGpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary captureLineExportGpuSummary = CaptureLineExportGpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary earlySubmitCpuSummary = EarlySubmitCpuWindow.SummarizeAndReset();
    const PerfSampleWindow<120>::Summary earlySubmitWaitSummary = EarlySubmitContextWaitCpuWindow.SummarizeAndReset();
    const auto pickDominantEnumIndex = [](const auto& counts, size_t fallbackIndex) -> size_t {
        size_t dominantIndex = fallbackIndex;
        u64 dominantCount = 0;
        for (size_t i = 0; i < counts.size(); i++)
        {
            if (counts[i] >= dominantCount)
            {
                dominantCount = counts[i];
                dominantIndex = i;
            }
        }
        return dominantIndex;
    };
    const CapturePathMode dominantCapturePathMode = static_cast<CapturePathMode>(pickDominantEnumIndex(
        CapturePathModeCounts,
        static_cast<size_t>(ActiveCapturePathMode)
    ));
    const bool captureSatisfiedByStructuredHistory =
        CaptureEnabledCount > 0
        && CapturePrepareRequestCount == 0
        && CaptureLineExportCount == 0;
    const char* capturePathNameForLog = captureSatisfiedByStructuredHistory
        ? "structured_history"
        : capturePathModeName(dominantCapturePathMode);
    const char* activeRasterName = VulkanGraphicsRasterName();

    {
        Log(
            LogLevel::Warn,
            "VulkanPerf[GPU3D]: profile=%s pipeline=%s raster=%s descriptorPath=%s captureSource=%s scale=%d render cpu avg=%.3fms p95=%.3fms max=%.3fms wait avg=%.3fms p95=%.3fms max=%.3fms gpu avg=%.3fms p95=%.3fms max=%.3fms triangles avg=%llu passes avg=%llu p95=%llu opaqueDraws=%u needOpaqueDraws=%u alphaShadowDraws=%u contextMisses=%llu late=%llu dropped=%llu readbackColor=%llu readbackResult=%llu capturePrepare=%llu captureEnabled=%llu captureSrc3d=%llu capMode=%llu/%llu/%llu/%llu capSize=%llu/%llu/%llu/%llu capExport=%llu capExportCpu avg=%.3fms p95=%.3fms capExportGpu avg=%.3fms p95=%.3fms earlySubmit hit=%llu/%llu miss=%llu skip215=%llu cpu avg=%.3fms p95=%.3fms wait avg=%.3fms p95=%.3fms",
            VulkanProductionProfileName(),
            VulkanProductionPipelineName(),
            activeRasterName,
            textureSamplingPathName(ActiveTextureSamplingPath),
            capturePathNameForLog,
            std::max(1, ScaleFactor),
            PerfNsToMs(renderSummary.MeanNs),
            PerfNsToMs(renderSummary.P95Ns),
            PerfNsToMs(renderSummary.MaxNs),
            PerfNsToMs(waitSummary.MeanNs),
            PerfNsToMs(waitSummary.P95Ns),
            PerfNsToMs(waitSummary.MaxNs),
            PerfNsToMs(gpuSummary.MeanNs),
            PerfNsToMs(gpuSummary.P95Ns),
            PerfNsToMs(gpuSummary.MaxNs),
            static_cast<unsigned long long>(triangleSummary.MeanNs),
            static_cast<unsigned long long>(passSummary.MeanNs),
            static_cast<unsigned long long>(passSummary.P95Ns),
            LastGraphicsOpaqueDrawCount,
            LastGraphicsNeedOpaqueDrawCount,
            LastGraphicsAlphaDrawCount,
            static_cast<unsigned long long>(ContextMissCount),
            static_cast<unsigned long long>(LateFrameCount),
            static_cast<unsigned long long>(DroppedFrameCount),
            static_cast<unsigned long long>(ReadbackColorRequestCount),
            static_cast<unsigned long long>(ReadbackResultRequestCount),
            static_cast<unsigned long long>(CapturePrepareRequestCount),
            static_cast<unsigned long long>(CaptureEnabledCount),
            static_cast<unsigned long long>(CaptureSource3dCount),
            static_cast<unsigned long long>(CaptureModeCounts[0]),
            static_cast<unsigned long long>(CaptureModeCounts[1]),
            static_cast<unsigned long long>(CaptureModeCounts[2]),
            static_cast<unsigned long long>(CaptureModeCounts[3]),
            static_cast<unsigned long long>(CaptureSizeModeCounts[0]),
            static_cast<unsigned long long>(CaptureSizeModeCounts[1]),
            static_cast<unsigned long long>(CaptureSizeModeCounts[2]),
            static_cast<unsigned long long>(CaptureSizeModeCounts[3]),
            static_cast<unsigned long long>(CaptureLineExportCount),
            PerfNsToMs(captureLineExportCpuSummary.MeanNs),
            PerfNsToMs(captureLineExportCpuSummary.P95Ns),
            PerfNsToMs(captureLineExportGpuSummary.MeanNs),
            PerfNsToMs(captureLineExportGpuSummary.P95Ns),
            static_cast<unsigned long long>(EarlySubmitHitCount),
            static_cast<unsigned long long>(EarlySubmitAttemptCount),
            static_cast<unsigned long long>(EarlySubmitMissCount),
            static_cast<unsigned long long>(EarlySubmitSkipVCount215Count),
            PerfNsToMs(earlySubmitCpuSummary.MeanNs),
            PerfNsToMs(earlySubmitCpuSummary.P95Ns),
            PerfNsToMs(earlySubmitWaitSummary.MeanNs),
            PerfNsToMs(earlySubmitWaitSummary.P95Ns)
        );
        Log(
            LogLevel::Warn,
            "VulkanPerf[GPU3DPasses]: sceneBuild cpu avg=%.3fms p95=%.3fms opaque cpu avg=%.3fms p95=%.3fms opaque gpu avg=%.3fms p95=%.3fms opaqueDraw gpu avg=%.3fms p95=%.3fms edge gpu avg=%.3fms p95=%.3fms alphaShadow cpu avg=%.3fms p95=%.3fms alphaShadow gpu avg=%.3fms p95=%.3fms final cpu avg=%.3fms p95=%.3fms final gpu avg=%.3fms p95=%.3fms captureExport cpu avg=%.3fms p95=%.3fms captureExport gpu avg=%.3fms p95=%.3fms opaqueDraws=%u needOpaqueDraws=%u alphaShadowDraws=%u opaqueW=%u opaqueZ=%u opaqueTex=%u opaqueNoTex=%u opaqueMod=%u opaqueDecal=%u opaqueToon=%u opaqueHighlight=%u opaqueLinear=%u opaqueRepeat=%u opaqueMirror=%u opaqueRepeatS=%u opaqueRepeatT=%u opaqueMirrorS=%u opaqueMirrorT=%u opaqueClampS=%u opaqueClampT=%u opaqueFullAlpha=%u highresRepeatModel=%u passNoAttr=%u passReverse=%u passNoDepthNoAttr=%u noAttrMissPolyId=%u noAttrMissDepth=%u noAttrMissFog=%u fogWriteOpaque=%u fogWriteAlpha=%u activeTextures=%u triangles=%zu pipelines=%u",
            PerfNsToMs(graphicsSceneBuildCpuSummary.MeanNs),
            PerfNsToMs(graphicsSceneBuildCpuSummary.P95Ns),
            PerfNsToMs(graphicsMainCpuSummary.MeanNs),
            PerfNsToMs(graphicsMainCpuSummary.P95Ns),
            PerfNsToMs(rasterGpuSummary.MeanNs),
            PerfNsToMs(rasterGpuSummary.P95Ns),
            PerfNsToMs(interpGpuSummary.MeanNs),
            PerfNsToMs(interpGpuSummary.P95Ns),
            PerfNsToMs(binGpuSummary.MeanNs),
            PerfNsToMs(binGpuSummary.P95Ns),
            PerfNsToMs(graphicsAlphaCpuSummary.MeanNs),
            PerfNsToMs(graphicsAlphaCpuSummary.P95Ns),
            PerfNsToMs(depthBlendGpuSummary.MeanNs),
            PerfNsToMs(depthBlendGpuSummary.P95Ns),
            PerfNsToMs(finalCpuSummary.MeanNs),
            PerfNsToMs(finalCpuSummary.P95Ns),
            PerfNsToMs(finalGpuSummary.MeanNs),
            PerfNsToMs(finalGpuSummary.P95Ns),
            PerfNsToMs(captureLineExportCpuSummary.MeanNs),
            PerfNsToMs(captureLineExportCpuSummary.P95Ns),
            PerfNsToMs(captureLineExportGpuSummary.MeanNs),
            PerfNsToMs(captureLineExportGpuSummary.P95Ns),
            LastGraphicsOpaqueDrawCount,
            LastGraphicsNeedOpaqueDrawCount,
            LastGraphicsAlphaDrawCount,
            LastGraphicsOpaqueWDrawCount,
            LastGraphicsOpaqueZDrawCount,
            LastGraphicsOpaqueTexturedDrawCount,
            LastGraphicsOpaqueUntexturedDrawCount,
            LastGraphicsOpaqueModulateDrawCount,
            LastGraphicsOpaqueDecalDrawCount,
            LastGraphicsOpaqueToonDrawCount,
            LastGraphicsOpaqueHighlightDrawCount,
            LastGraphicsOpaqueLinearDrawCount,
            LastGraphicsOpaqueRepeatDrawCount,
            LastGraphicsOpaqueMirrorDrawCount,
            LastGraphicsOpaqueRepeatSDrawCount,
            LastGraphicsOpaqueRepeatTDrawCount,
            LastGraphicsOpaqueMirrorSDrawCount,
            LastGraphicsOpaqueMirrorTDrawCount,
            LastGraphicsOpaqueClampSDrawCount,
            LastGraphicsOpaqueClampTDrawCount,
            LastGraphicsOpaqueFullAlphaDrawCount,
            LastGraphicsOpaqueHighresRepeatModelDrawCount,
            LastGraphicsOpaqueNoAttrPassCount,
            LastGraphicsOpaqueReverseOcclusionPassCount,
            LastGraphicsOpaqueNoDepthNoAttrPassCount,
            LastGraphicsOpaqueNoAttrPolyIdMissCount,
            LastGraphicsOpaqueNoAttrDepthMissCount,
            LastGraphicsOpaqueNoAttrFogMissCount,
            LastGraphicsFogWriteOpaquePassCount,
            LastGraphicsFogWriteAlphaPassCount,
            ActiveTextureDescriptorCount,
            Triangles.size(),
            static_cast<u32>(
                GraphicsOpaquePipelineCount
                + GraphicsOpaquePipelineCount
                + GraphicsOpaquePipelineCount
                + GraphicsOpaquePipelineCount
                + GraphicsOpaquePipelineCount
                + GraphicsOpaquePipelineCount
                + GraphicsTranslucentPipelineCount
                + GraphicsBgZeroTranslucentPipelineCount
                + GraphicsShadowMaskPipelineCount
                + GraphicsShadowMaskBgZeroPipelineCount
                + GraphicsShadowClearPipelineCount
                + GraphicsShadowBlendBgZeroPipelineCount
                + GraphicsShadowBlendPipelineCount)
        );
        Log(
            LogLevel::Warn,
            "VulkanPerf[GPU3DCpu]: texUpdate avg=%.3fms p95=%.3fms warmTexture avg=%.3fms p95=%.3fms buildTriangles avg=%.3fms p95=%.3fms perPolygonTiming=%u gfxTexLookup avg=%.3fms p95=%.3fms texPersistent avg=%.3fms p95=%.3fms texcacheResolve avg=%.3fms p95=%.3fms texDescriptor avg=%.3fms p95=%.3fms texSlot avg=%.3fms p95=%.3fms constTex avg=%.3fms p95=%.3fms gfxVertexEmit avg=%.3fms p95=%.3fms gfxStats avg=%.3fms p95=%.3fms bufferPrep avg=%.3fms p95=%.3fms descriptor avg=%.3fms p95=%.3fms dispatch avg=%.3fms p95=%.3fms texLookupHit=%u texLookupMiss=%u persistentHit=%u persistentMiss=%u texcacheResolveLast=%.3fms",
            PerfNsToMs(textureUpdateCpuSummary.MeanNs),
            PerfNsToMs(textureUpdateCpuSummary.P95Ns),
            PerfNsToMs(warmTextureCpuSummary.MeanNs),
            PerfNsToMs(warmTextureCpuSummary.P95Ns),
            PerfNsToMs(triangleBuildCpuSummary.MeanNs),
            PerfNsToMs(triangleBuildCpuSummary.P95Ns),
            MelonDSAndroid::areRendererDebugToolsEnabled() ? 1u : 0u,
            PerfNsToMs(graphicsTextureLookupCpuSummary.MeanNs),
            PerfNsToMs(graphicsTextureLookupCpuSummary.P95Ns),
            PerfNsToMs(graphicsTexturePersistentCpuSummary.MeanNs),
            PerfNsToMs(graphicsTexturePersistentCpuSummary.P95Ns),
            PerfNsToMs(graphicsTexcacheResolveCpuSummary.MeanNs),
            PerfNsToMs(graphicsTexcacheResolveCpuSummary.P95Ns),
            PerfNsToMs(graphicsTextureDescriptorCpuSummary.MeanNs),
            PerfNsToMs(graphicsTextureDescriptorCpuSummary.P95Ns),
            PerfNsToMs(graphicsTextureSlotCpuSummary.MeanNs),
            PerfNsToMs(graphicsTextureSlotCpuSummary.P95Ns),
            PerfNsToMs(graphicsConstantTextureCpuSummary.MeanNs),
            PerfNsToMs(graphicsConstantTextureCpuSummary.P95Ns),
            PerfNsToMs(graphicsVertexEmitCpuSummary.MeanNs),
            PerfNsToMs(graphicsVertexEmitCpuSummary.P95Ns),
            PerfNsToMs(graphicsStatsCpuSummary.MeanNs),
            PerfNsToMs(graphicsStatsCpuSummary.P95Ns),
            PerfNsToMs(bufferPrepCpuSummary.MeanNs),
            PerfNsToMs(bufferPrepCpuSummary.P95Ns),
            PerfNsToMs(descriptorUpdateCpuSummary.MeanNs),
            PerfNsToMs(descriptorUpdateCpuSummary.P95Ns),
            PerfNsToMs(dispatchCpuSummary.MeanNs),
            PerfNsToMs(dispatchCpuSummary.P95Ns),
            LastGraphicsTextureLookupHitCount,
            LastGraphicsTextureLookupMissCount,
            LastGraphicsPersistentTextureHitCount,
            LastGraphicsPersistentTextureMissCount,
            PerfNsToMs(LastGraphicsTexcacheResolveCpuNs)
        );
    }
    ContextMissCount = 0;
    LateFrameCount = 0;
    DroppedFrameCount = 0;
    ReadbackColorRequestCount = 0;
    ReadbackResultRequestCount = 0;
    CapturePrepareRequestCount = 0;
    CaptureEnabledCount = 0;
    CaptureSource3dCount = 0;
    CaptureModeCounts.fill(0);
    CaptureSizeModeCounts.fill(0);
    CapturePathModeCounts.fill(0);
    CaptureLineExportCount = 0;
    EarlySubmitAttemptCount = 0;
    EarlySubmitHitCount = 0;
    EarlySubmitMissCount = 0;
    EarlySubmitSkipVCount215Count = 0;
}

bool VulkanRenderer3D::createTextureResources()
{
    VkPhysicalDeviceProperties deviceProperties{};
    vkGetPhysicalDeviceProperties(PhysicalDevice, &deviceProperties);
    const VulkanTextureDescriptorPolicy texturePolicy = getTextureDescriptorPolicy();
    const u32 textureDescriptorBindingCount = texturePolicy.TextureDescriptorPageSize;
    const VulkanRenderContextPolicy renderContextPolicy =
        GetVulkanRenderContextPolicy();
    const auto& limits = deviceProperties.limits;
    const VulkanGraphicsDescriptorLimits descriptorLimits{
        limits.maxPerStageDescriptorSamplers,
        limits.maxDescriptorSetSamplers,
        limits.maxPerStageDescriptorSampledImages,
        limits.maxDescriptorSetSampledImages,
        limits.maxPerStageDescriptorStorageBuffers,
        limits.maxDescriptorSetStorageBuffers,
        limits.maxPerStageResources,
    };
    if (!texturePolicy.GraphicsLimitsSatisfied(descriptorLimits))
    {
        Log(
            LogLevel::Error,
            "VulkanRenderer3D: descriptor limits too low (samplers=%u/%u images=%u/%u buffers=%u/%u resources=%u requiredImagesSamplers=%u requiredBuffers=3 profile=%s path=%s)",
            descriptorLimits.PerStageSamplers, descriptorLimits.SetSamplers,
            descriptorLimits.PerStageSampledImages, descriptorLimits.SetSampledImages,
            descriptorLimits.PerStageStorageBuffers, descriptorLimits.SetStorageBuffers,
            descriptorLimits.PerStageResources,
            texturePolicy.GraphicsCombinedImageSamplerCount(),
            VulkanProductionProfileName(),
            textureSamplingPathName(ActiveTextureSamplingPath)
        );
        return false;
    }

    if (MelonDSAndroid::areRendererDebugToolsEnabled())
    {
        Log(
            LogLevel::Warn,
            "VulkanDescriptorGraph[TexturePolicy]: profile=%s logicalTextures=%u textureBindingCount=%u pagesPerOwner=%u maxActive=%u fallback=%u graphicsBindings=%u graphicsCombinedSamplers=%u normalized=%u asyncContexts=%llu descriptorOwners=%llu contextStorageCapacity=%llu",
            VulkanProductionProfileName(),
            texturePolicy.TextureDescriptorCount,
            textureDescriptorBindingCount,
            texturePolicy.TextureDescriptorPageCount(),
            texturePolicy.MaxActiveTextureDescriptors(),
            texturePolicy.FallbackTextureDescriptorIndex(),
            texturePolicy.GraphicsDescriptorBindingCount(),
            texturePolicy.GraphicsCombinedImageSamplerCount(),
            texturePolicy.UsesNormalizedTextureDescriptors ? 1u : 0u,
            static_cast<unsigned long long>(renderContextPolicy.AsyncRenderContextCount),
            static_cast<unsigned long long>(renderContextPolicy.DescriptorSetCount()),
            static_cast<unsigned long long>(MaxAsyncRenderContextCount)
        );
    }

    const TextureSamplingPath samplingPath = ActiveTextureSamplingPath;
    const VulkanContext& context = VulkanContext::Get();
    Log(
        LogLevel::Warn,
        "VulkanRuntime[Capabilities]: swapchain=1 timeline=%d dynamicIndexing=%d nonUniform=0 path=%s forceTimelineOff=%d forceDynamicOff=%d",
        context.SupportsTimelineSemaphores() ? 1 : 0,
        context.SupportsDynamicTextureIndexing() ? 1 : 0,
        textureSamplingPathName(samplingPath),
        context.IsTimelineSemaphoreForcedOff() ? 1 : 0,
        context.IsDynamicTextureIndexingForcedOff() ? 1 : 0
    );
    Log(
        LogLevel::Warn,
        "VulkanRenderer3D: using %s texture sampling path",
        samplingPath == TextureSamplingPath::DynamicUniform
            ? "dynamically-uniform descriptor indexing"
            : "constant switch-descriptor indexing"
    );
    if (!createFallbackTexture())
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create fallback texture");
        return false;
    }

    return true;
}

bool VulkanRenderer3D::createGraphicsDescriptorObjects()
{
    const VulkanTextureDescriptorPolicy texturePolicy = getTextureDescriptorPolicy();
    const u32 textureDescriptorBindingCount = texturePolicy.TextureDescriptorPageSize;

    VkDescriptorSetLayoutBinding triangleBinding{};
    triangleBinding.binding = 0;
    triangleBinding.descriptorType = VK_DESCRIPTOR_TYPE_STORAGE_BUFFER;
    triangleBinding.descriptorCount = 1;
    triangleBinding.stageFlags = VK_SHADER_STAGE_VERTEX_BIT;
    if (texturePolicy.UsesNormalizedTextureDescriptors)
        triangleBinding.stageFlags |= VK_SHADER_STAGE_FRAGMENT_BIT;

    VkDescriptorSetLayoutBinding textureBinding{};
    textureBinding.binding = 1;
    textureBinding.descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    textureBinding.descriptorCount = textureDescriptorBindingCount;
    textureBinding.stageFlags = VK_SHADER_STAGE_FRAGMENT_BIT;

    VkDescriptorSetLayoutBinding toonBinding{};
    toonBinding.binding = 2;
    toonBinding.descriptorType = VK_DESCRIPTOR_TYPE_STORAGE_BUFFER;
    toonBinding.descriptorCount = 1;
    toonBinding.stageFlags = VK_SHADER_STAGE_FRAGMENT_BIT;

    VkDescriptorSetLayoutBinding attrBinding{};
    attrBinding.binding = 3;
    attrBinding.descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    attrBinding.descriptorCount = 1;
    attrBinding.stageFlags = VK_SHADER_STAGE_FRAGMENT_BIT;

    VkDescriptorSetLayoutBinding depthBinding{};
    depthBinding.binding = 4;
    depthBinding.descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    depthBinding.descriptorCount = 1;
    depthBinding.stageFlags = VK_SHADER_STAGE_FRAGMENT_BIT;

    VkDescriptorSetLayoutBinding clearBinding{};
    clearBinding.binding = 5;
    clearBinding.descriptorType = VK_DESCRIPTOR_TYPE_STORAGE_BUFFER;
    clearBinding.descriptorCount = 1;
    clearBinding.stageFlags = VK_SHADER_STAGE_FRAGMENT_BIT;

    VkDescriptorSetLayoutBinding normalizedTextureBinding{};
    normalizedTextureBinding.binding = 6;
    normalizedTextureBinding.descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    normalizedTextureBinding.descriptorCount = textureDescriptorBindingCount;
    normalizedTextureBinding.stageFlags = VK_SHADER_STAGE_FRAGMENT_BIT;

    std::array<VkDescriptorSetLayoutBinding, 7> bindings = {
        triangleBinding,
        textureBinding,
        toonBinding,
        attrBinding,
        depthBinding,
        clearBinding,
        normalizedTextureBinding,
    };

    VkDescriptorSetLayoutCreateInfo layoutCreateInfo{};
    layoutCreateInfo.sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO;
    layoutCreateInfo.bindingCount = texturePolicy.GraphicsDescriptorBindingCount();
    layoutCreateInfo.pBindings = bindings.data();

    if (vkCreateDescriptorSetLayout(Device, &layoutCreateInfo, nullptr, &GraphicsDescriptorSetLayout) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics descriptor set layout");
        return false;
    }

    const bool allocateNativeProjection = true;
    const u32 faithfulDescriptorSetCount = FaithfulGraphicsDescriptorSlotCount;
    const u32 descriptorOwnerCount = static_cast<u32>(
        GetVulkanRenderContextPolicy().DescriptorSetCount())
        + (allocateNativeProjection ? 1u : 0u)
        + faithfulDescriptorSetCount;

    const u32 descriptorSetCount = descriptorOwnerCount
        * texturePolicy.TextureDescriptorPageCount();
    std::array<VkDescriptorPoolSize, 2> poolSizes{};
    poolSizes[0].type = VK_DESCRIPTOR_TYPE_STORAGE_BUFFER;
    poolSizes[0].descriptorCount = 3u * descriptorSetCount;
    poolSizes[1].type = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    poolSizes[1].descriptorCount =
        texturePolicy.GraphicsCombinedImageSamplerCount() * descriptorSetCount;

    VkDescriptorPoolCreateInfo poolCreateInfo{};
    poolCreateInfo.sType = VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO;
    poolCreateInfo.maxSets = descriptorSetCount;
    poolCreateInfo.poolSizeCount = static_cast<u32>(poolSizes.size());
    poolCreateInfo.pPoolSizes = poolSizes.data();

    if (vkCreateDescriptorPool(Device, &poolCreateInfo, nullptr, &GraphicsDescriptorPool) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics descriptor pool");
        return false;
    }

    std::vector<VkDescriptorSetLayout> setLayouts(descriptorSetCount, GraphicsDescriptorSetLayout);
    std::vector<VkDescriptorSet> descriptorSets(descriptorSetCount, VK_NULL_HANDLE);

    VkDescriptorSetAllocateInfo descriptorAllocInfo{};
    descriptorAllocInfo.sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO;
    descriptorAllocInfo.descriptorPool = GraphicsDescriptorPool;
    descriptorAllocInfo.descriptorSetCount = descriptorSetCount;
    descriptorAllocInfo.pSetLayouts = setLayouts.data();

    if (vkAllocateDescriptorSets(Device, &descriptorAllocInfo, descriptorSets.data()) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate graphics descriptor sets");
        return false;
    }

    size_t cursor = 0;
    const auto assignPageSets = [&](GraphicsDescriptorPageSets& pageSets) {
        for (VkDescriptorSet& set : pageSets)
            set = descriptorSets[cursor++];
    };
    for (auto& pageSets : FaithfulGraphicsDescriptorSets)
        pageSets.fill(VK_NULL_HANDLE);
    assignPageSets(GraphicsDescriptorSets);
    for (RenderContext& renderContext : activeRenderContexts())
        assignPageSets(renderContext.GraphicsDescriptorSets);
    NativeProjectionContext.GraphicsDescriptorSets.fill(VK_NULL_HANDLE);
    if (allocateNativeProjection)
        assignPageSets(NativeProjectionContext.GraphicsDescriptorSets);
    for (u32 slot = 0u; slot < faithfulDescriptorSetCount; slot++)
        assignPageSets(FaithfulGraphicsDescriptorSets[slot]);

    if (cursor != descriptorSets.size())
    {
        Log(LogLevel::Error, "VulkanRenderer3D: graphics descriptor set allocation mismatch");
        return false;
    }

    invalidateAllGraphicsDescriptorSetCaches();
    return true;
}

bool VulkanRenderer3D::selectGraphicsDepthStencilFormat()
{
    const std::array<VkFormat, 3> candidates = {
        VK_FORMAT_D24_UNORM_S8_UINT,
        VK_FORMAT_D32_SFLOAT_S8_UINT,
        VK_FORMAT_D16_UNORM_S8_UINT,
    };

    for (const VkFormat candidate : candidates)
    {
        VkFormatProperties formatProperties{};
        vkGetPhysicalDeviceFormatProperties(PhysicalDevice, candidate, &formatProperties);
        if ((formatProperties.optimalTilingFeatures & VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT) != 0)
        {
            GraphicsDepthStencilFormat = candidate;
            return true;
        }
    }

    GraphicsDepthStencilFormat = VK_FORMAT_UNDEFINED;
    return false;
}

bool VulkanRenderer3D::selectGraphicsRasterColorFormat()
{
    GraphicsRasterColorFormat = kGraphicsColorTargetFormat;
    return true;
}

std::string VulkanRenderer3D::buildPipelineCacheFileName(TextureSamplingPath samplingPath) const
{
    VkPhysicalDeviceProperties deviceProperties{};
    vkGetPhysicalDeviceProperties(PhysicalDevice, &deviceProperties);

    const u64 versionHash = fnv1a64(MELONDS_VERSION);
    const char* samplingPathSuffix = textureSamplingPathName(samplingPath);
    char cacheFileName[256]{};
    std::snprintf(
        cacheFileName,
        sizeof(cacheFileName),
        "vulkan_pipeline_cache_v%u_%08x_%08x_%08x_%016llx_%s.bin",
        kPipelineCacheFileVersion,
        deviceProperties.vendorID,
        deviceProperties.deviceID,
        deviceProperties.driverVersion,
        static_cast<unsigned long long>(versionHash),
        samplingPathSuffix
    );
    return cacheFileName;
}

bool VulkanRenderer3D::createPipelineCache(TextureSamplingPath samplingPath)
{
    if (ComputePipelineCache != VK_NULL_HANDLE)
        return true;

    ComputePipelineCacheFile = buildPipelineCacheFileName(samplingPath);

    std::vector<u8> cacheData;
    if (Platform::FileHandle* cacheFile = Platform::OpenLocalFile(ComputePipelineCacheFile, Platform::FileMode::Read))
    {
        const u64 cacheSize = Platform::FileLength(cacheFile);
        if (cacheSize > 0 && cacheSize <= (256ull * 1024ull * 1024ull))
        {
            cacheData.resize(static_cast<size_t>(cacheSize));
            if (Platform::FileRead(cacheData.data(), 1, cacheSize, cacheFile) != cacheSize)
            {
                Log(LogLevel::Warn, "VulkanRenderer3D: failed to read pipeline cache %s", ComputePipelineCacheFile.c_str());
                cacheData.clear();
            }
            else
            {
                Log(
                    LogLevel::Info,
                    "VulkanRenderer3D: loaded pipeline cache (%s, %llu bytes)",
                    ComputePipelineCacheFile.c_str(),
                    static_cast<unsigned long long>(cacheSize)
                );
            }
        }

        Platform::CloseFile(cacheFile);
    }

    VkPipelineCacheCreateInfo cacheCreateInfo{};
    cacheCreateInfo.sType = VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO;
    cacheCreateInfo.initialDataSize = cacheData.size();
    cacheCreateInfo.pInitialData = cacheData.empty() ? nullptr : cacheData.data();

    VkResult cacheResult = vkCreatePipelineCache(Device, &cacheCreateInfo, nullptr, &ComputePipelineCache);
    if (cacheResult != VK_SUCCESS && !cacheData.empty())
    {
        Log(
            LogLevel::Warn,
            "VulkanRenderer3D: pipeline cache data rejected, recreating empty cache (%d)",
            static_cast<int>(cacheResult)
        );
        cacheCreateInfo.initialDataSize = 0;
        cacheCreateInfo.pInitialData = nullptr;
        cacheResult = vkCreatePipelineCache(Device, &cacheCreateInfo, nullptr, &ComputePipelineCache);
    }

    if (cacheResult != VK_SUCCESS)
    {
        Log(LogLevel::Warn, "VulkanRenderer3D: failed to create pipeline cache (%d)", static_cast<int>(cacheResult));
        ComputePipelineCache = VK_NULL_HANDLE;
        return false;
    }

    return true;
}

void VulkanRenderer3D::savePipelineCache()
{
    if (Device == VK_NULL_HANDLE || ComputePipelineCache == VK_NULL_HANDLE || ComputePipelineCacheFile.empty())
        return;

    size_t cacheSize = 0;
    if (vkGetPipelineCacheData(Device, ComputePipelineCache, &cacheSize, nullptr) != VK_SUCCESS || cacheSize == 0)
        return;

    std::vector<u8> cacheData(cacheSize);
    if (vkGetPipelineCacheData(Device, ComputePipelineCache, &cacheSize, cacheData.data()) != VK_SUCCESS || cacheSize == 0)
        return;

    Platform::FileHandle* cacheFile = Platform::OpenLocalFile(ComputePipelineCacheFile, Platform::FileMode::ReadWrite);
    if (cacheFile == nullptr)
    {
        Log(LogLevel::Warn, "VulkanRenderer3D: failed to open pipeline cache for writing (%s)", ComputePipelineCacheFile.c_str());
        return;
    }

    const u64 written = Platform::FileWrite(cacheData.data(), 1, cacheSize, cacheFile);
    Platform::FileFlush(cacheFile);
    Platform::CloseFile(cacheFile);

    if (written != cacheSize)
    {
        Log(
            LogLevel::Warn,
            "VulkanRenderer3D: incomplete pipeline cache write (%s %llu/%llu)",
            ComputePipelineCacheFile.c_str(),
            static_cast<unsigned long long>(written),
            static_cast<unsigned long long>(cacheSize)
        );
        return;
    }

    Log(
        LogLevel::Info,
        "VulkanRenderer3D: saved pipeline cache (%s, %llu bytes)",
        ComputePipelineCacheFile.c_str(),
        static_cast<unsigned long long>(cacheSize)
    );
}


bool VulkanRenderer3D::createCaptureExportResources()
{

    std::array<VkDescriptorSetLayoutBinding, 2> bindings{};
    bindings[0].binding = 2;
    bindings[0].descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    bindings[0].descriptorCount = 1;
    bindings[0].stageFlags = VK_SHADER_STAGE_COMPUTE_BIT;
    bindings[1].binding = 9;
    bindings[1].descriptorType = VK_DESCRIPTOR_TYPE_STORAGE_BUFFER;
    bindings[1].descriptorCount = 1;
    bindings[1].stageFlags = VK_SHADER_STAGE_COMPUTE_BIT;

    VkDescriptorSetLayoutCreateInfo layoutInfo{};
    layoutInfo.sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO;
    layoutInfo.bindingCount = static_cast<u32>(bindings.size());
    layoutInfo.pBindings = bindings.data();
    if (vkCreateDescriptorSetLayout(Device, &layoutInfo, nullptr, &CaptureExportDescriptorSetLayout) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create capture export descriptor layout");
        return false;
    }

    const u32 descriptorSetCount = static_cast<u32>(
        GetVulkanRenderContextPolicy().DescriptorSetCount())
        + 1u + FaithfulCaptureExportDescriptorSlotCount;
    std::array<VkDescriptorPoolSize, 2> poolSizes{};
    poolSizes[0].type = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    poolSizes[0].descriptorCount = descriptorSetCount;
    poolSizes[1].type = VK_DESCRIPTOR_TYPE_STORAGE_BUFFER;
    poolSizes[1].descriptorCount = descriptorSetCount;
    VkDescriptorPoolCreateInfo poolInfo{};
    poolInfo.sType = VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO;
    poolInfo.maxSets = descriptorSetCount;
    poolInfo.poolSizeCount = static_cast<u32>(poolSizes.size());
    poolInfo.pPoolSizes = poolSizes.data();
    if (vkCreateDescriptorPool(Device, &poolInfo, nullptr, &CaptureExportDescriptorPool) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create capture export descriptor pool");
        return false;
    }

    std::vector<VkDescriptorSetLayout> layouts(descriptorSetCount, CaptureExportDescriptorSetLayout);
    std::vector<VkDescriptorSet> sets(descriptorSetCount, VK_NULL_HANDLE);
    VkDescriptorSetAllocateInfo allocateInfo{};
    allocateInfo.sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO;
    allocateInfo.descriptorPool = CaptureExportDescriptorPool;
    allocateInfo.descriptorSetCount = descriptorSetCount;
    allocateInfo.pSetLayouts = layouts.data();
    if (vkAllocateDescriptorSets(Device, &allocateInfo, sets.data()) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate capture export descriptor sets");
        return false;
    }
    size_t cursor = 0;
    CaptureExportDescriptorSet = sets[cursor++];
    for (RenderContext& context : activeRenderContexts())
        context.CaptureExportDescriptorSet = sets[cursor++];
    NativeProjectionContext.CaptureExportDescriptorSet = sets[cursor++];
    for (VkDescriptorSet& set : FaithfulCaptureExportDescriptorSets)
        set = sets[cursor++];

    VkPushConstantRange pushRange{};
    pushRange.stageFlags = VK_SHADER_STAGE_COMPUTE_BIT;
    pushRange.size = sizeof(RasterPushConstants);
    VkPipelineLayoutCreateInfo pipelineLayoutInfo{};
    pipelineLayoutInfo.sType = VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO;
    pipelineLayoutInfo.setLayoutCount = 1;
    pipelineLayoutInfo.pSetLayouts = &CaptureExportDescriptorSetLayout;
    pipelineLayoutInfo.pushConstantRangeCount = 1;
    pipelineLayoutInfo.pPushConstantRanges = &pushRange;
    if (vkCreatePipelineLayout(Device, &pipelineLayoutInfo, nullptr, &CaptureExportPipelineLayout) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create capture export pipeline layout");
        return false;
    }

    const size_t spirvLength = melonDS_gpu3d_vulkan_capture_line_export_comp_spv_len;
    if (spirvLength == 0u)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: empty capture export SPIR-V blob");
        return false;
    }
    std::vector<u32> shaderWords((spirvLength + sizeof(u32) - 1u) / sizeof(u32));
    std::memcpy(shaderWords.data(), melonDS_gpu3d_vulkan_capture_line_export_comp_spv, spirvLength);
    VkShaderModuleCreateInfo shaderInfo{};
    shaderInfo.sType = VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO;
    shaderInfo.codeSize = spirvLength;
    shaderInfo.pCode = shaderWords.data();
    VkShaderModule shaderModule = VK_NULL_HANDLE;
    if (vkCreateShaderModule(Device, &shaderInfo, nullptr, &shaderModule) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create capture export shader module");
        return false;
    }
    VkComputePipelineCreateInfo pipelineInfo{};
    pipelineInfo.sType = VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO;
    pipelineInfo.stage.sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
    pipelineInfo.stage.stage = VK_SHADER_STAGE_COMPUTE_BIT;
    pipelineInfo.stage.module = shaderModule;
    pipelineInfo.stage.pName = "main";
    pipelineInfo.layout = CaptureExportPipelineLayout;
    const VkResult result = vkCreateComputePipelines(
        Device, ComputePipelineCache, 1, &pipelineInfo, nullptr, &CaptureLineExportPipeline);
    vkDestroyShaderModule(Device, shaderModule, nullptr);
    if (result != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create capture export pipeline (%d)", static_cast<int>(result));
        return false;
    }
    return true;
}

bool VulkanRenderer3D::createGraphicsPipelines()
{
    GraphicsReady = false;

    if (GraphicsDescriptorSetLayout == VK_NULL_HANDLE)
        return false;

    const EmbeddedShader rasterShader{
        melonDS_gpu3d_vulkan_graphics_raster_frag_spv,
        melonDS_gpu3d_vulkan_graphics_raster_frag_spv_len,
    };
    const EmbeddedShader rasterNoFragDepthShader{
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_frag_spv,
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_frag_spv_len,
    };
    const EmbeddedShader rasterNoFragDepthDirectShader{
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_frag_spv,
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_frag_spv_len,
    };
    const EmbeddedShader rasterFastModulateShader{
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_frag_spv,
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_frag_spv_len,
    };
    const EmbeddedShader rasterFastModulateToonShader{
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_toon_frag_spv,
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_toon_frag_spv_len,
    };
    const EmbeddedShader rasterFastModulatePlainShader{
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_plain_frag_spv,
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_plain_frag_spv_len,
    };
    const EmbeddedShader rasterFastModulateOpaqueAlphaToonShader{
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_toon_frag_spv,
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_toon_frag_spv_len,
    };
    const EmbeddedShader rasterFastModulateOpaqueAlphaPlainShader{
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_plain_frag_spv,
        melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_plain_frag_spv_len,
    };
    const EmbeddedShader noColorShader{
        melonDS_gpu3d_vulkan_graphics_no_color_frag_spv,
        melonDS_gpu3d_vulkan_graphics_no_color_frag_spv_len,
    };
    const EmbeddedShader edgeShader{
        melonDS_gpu3d_vulkan_graphics_edge_frag_spv,
        melonDS_gpu3d_vulkan_graphics_edge_frag_spv_len,
    };
    const EmbeddedShader edgeFogShader{
        melonDS_gpu3d_vulkan_graphics_edge_fog_frag_spv,
        melonDS_gpu3d_vulkan_graphics_edge_fog_frag_spv_len,
    };
    const EmbeddedShader fogShader{
        melonDS_gpu3d_vulkan_graphics_fog_frag_spv,
        melonDS_gpu3d_vulkan_graphics_fog_frag_spv_len,
    };

    if (melonDS_gpu3d_vulkan_graphics_raster_vert_spv_len == 0
        || rasterShader.length == 0
        || melonDS_gpu3d_vulkan_graphics_raster_direct_frag_spv_len == 0
        || rasterNoFragDepthShader.length == 0
        || rasterNoFragDepthDirectShader.length == 0
        || rasterFastModulateShader.length == 0
        || rasterFastModulateToonShader.length == 0
        || rasterFastModulatePlainShader.length == 0
        || rasterFastModulateOpaqueAlphaToonShader.length == 0
        || rasterFastModulateOpaqueAlphaPlainShader.length == 0
        || noColorShader.length == 0
        || melonDS_gpu3d_vulkan_graphics_clear_frag_spv_len == 0
        || melonDS_gpu3d_vulkan_graphics_final_vert_spv_len == 0
        || edgeShader.length == 0
        || edgeFogShader.length == 0
        || fogShader.length == 0)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: empty graphics SPIR-V blob(s)");
        return false;
    }

    if (!selectGraphicsDepthStencilFormat())
    {
        Log(LogLevel::Error, "VulkanRenderer3D: no supported graphics depth/stencil format");
        return false;
    }
    if (!selectGraphicsRasterColorFormat())
    {
        Log(LogLevel::Error, "VulkanRenderer3D: no supported graphics raster color format");
        return false;
    }

    VkPushConstantRange pushConstantRange{};
    pushConstantRange.stageFlags = VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT;
    pushConstantRange.offset = 0;
    pushConstantRange.size = sizeof(RasterPushConstants);

    VkPipelineLayoutCreateInfo pipelineLayoutCreateInfo{};
    pipelineLayoutCreateInfo.sType = VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO;
    pipelineLayoutCreateInfo.setLayoutCount = 1;
    pipelineLayoutCreateInfo.pSetLayouts = &GraphicsDescriptorSetLayout;
    pipelineLayoutCreateInfo.pushConstantRangeCount = 1;
    pipelineLayoutCreateInfo.pPushConstantRanges = &pushConstantRange;

    if (vkCreatePipelineLayout(Device, &pipelineLayoutCreateInfo, nullptr, &GraphicsPipelineLayout) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics pipeline layout");
        return false;
    }

    VkSamplerCreateInfo samplerCreateInfo{};
    samplerCreateInfo.sType = VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO;
    samplerCreateInfo.magFilter = VK_FILTER_NEAREST;
    samplerCreateInfo.minFilter = VK_FILTER_NEAREST;
    samplerCreateInfo.mipmapMode = VK_SAMPLER_MIPMAP_MODE_NEAREST;
    samplerCreateInfo.addressModeU = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
    samplerCreateInfo.addressModeV = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
    samplerCreateInfo.addressModeW = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
    samplerCreateInfo.maxLod = 0.0f;
    if (vkCreateSampler(Device, &samplerCreateInfo, nullptr, &GraphicsAttachmentSampler) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics attachment sampler");
        return false;
    }

    VkAttachmentDescription colorAttachment{};
    colorAttachment.format = GraphicsRasterColorFormat;
    colorAttachment.samples = VK_SAMPLE_COUNT_1_BIT;
    colorAttachment.loadOp = VK_ATTACHMENT_LOAD_OP_CLEAR;
    colorAttachment.storeOp = VK_ATTACHMENT_STORE_OP_STORE;
    colorAttachment.stencilLoadOp = VK_ATTACHMENT_LOAD_OP_DONT_CARE;
    colorAttachment.stencilStoreOp = VK_ATTACHMENT_STORE_OP_DONT_CARE;
    colorAttachment.initialLayout = VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
    colorAttachment.finalLayout = VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;

    VkAttachmentDescription attrAttachment = colorAttachment;
    attrAttachment.format = kGraphicsAttrTargetFormat;
    attrAttachment.finalLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;

    const bool usesGraphicsProductResources = true;
    const GraphicsRasterDispatchPolicy& rasterPipelinePolicy =
        kGraphicsRasterDispatchPolicy;

    VkAttachmentDescription depthStencilAttachment{};
    depthStencilAttachment.format = GraphicsDepthStencilFormat;
    depthStencilAttachment.samples = VK_SAMPLE_COUNT_1_BIT;
    depthStencilAttachment.loadOp = VK_ATTACHMENT_LOAD_OP_CLEAR;
    depthStencilAttachment.storeOp = VK_ATTACHMENT_STORE_OP_STORE;
    depthStencilAttachment.stencilLoadOp = VK_ATTACHMENT_LOAD_OP_CLEAR;
    depthStencilAttachment.stencilStoreOp = VK_ATTACHMENT_STORE_OP_DONT_CARE;
    depthStencilAttachment.initialLayout = VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL;
    depthStencilAttachment.finalLayout = VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL;

    std::array<VkAttachmentReference, 2> colorRefs{};
    colorRefs[0] = {0u, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL};
    colorRefs[1] = {1u, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL};
    VkAttachmentReference depthStencilRef{
        2u,
        VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL};

    VkSubpassDescription rasterSubpass{};
    rasterSubpass.pipelineBindPoint = VK_PIPELINE_BIND_POINT_GRAPHICS;
    rasterSubpass.colorAttachmentCount = static_cast<u32>(colorRefs.size());
    rasterSubpass.pColorAttachments = colorRefs.data();
    rasterSubpass.pDepthStencilAttachment = &depthStencilRef;

    const std::array<VkAttachmentDescription, 3> graphicsRasterAttachments = {
        colorAttachment,
        attrAttachment,
        depthStencilAttachment,
    };
    std::array<VkSubpassDependency, 2> rasterDependencies{};
    rasterDependencies[0].srcSubpass = VK_SUBPASS_EXTERNAL;
    rasterDependencies[0].dstSubpass = 0;
    rasterDependencies[0].srcStageMask = VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT;
    rasterDependencies[0].dstStageMask = VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT;
    rasterDependencies[0].dstAccessMask =
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT |
        VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
    rasterDependencies[1].srcSubpass = 0;
    rasterDependencies[1].dstSubpass = VK_SUBPASS_EXTERNAL;
    rasterDependencies[1].srcStageMask = VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT;
    rasterDependencies[1].dstStageMask = VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT;
    rasterDependencies[1].srcAccessMask =
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT |
        VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
    rasterDependencies[1].dstAccessMask = VK_ACCESS_SHADER_READ_BIT;

    VkRenderPassCreateInfo rasterRenderPassCreateInfo{};
    rasterRenderPassCreateInfo.sType = VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO;
    rasterRenderPassCreateInfo.attachmentCount = static_cast<u32>(graphicsRasterAttachments.size());
    rasterRenderPassCreateInfo.pAttachments = graphicsRasterAttachments.data();
    rasterRenderPassCreateInfo.subpassCount = 1;
    rasterRenderPassCreateInfo.pSubpasses = &rasterSubpass;
    rasterRenderPassCreateInfo.dependencyCount = static_cast<u32>(rasterDependencies.size());
    rasterRenderPassCreateInfo.pDependencies = rasterDependencies.data();

    if (vkCreateRenderPass(Device, &rasterRenderPassCreateInfo, nullptr, &GraphicsRasterRenderPass) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics raster render pass");
        return false;
    }

    if (usesGraphicsProductResources)
    {

        VkAttachmentDescription attrSinEscritura = attrAttachment;
        attrSinEscritura.storeOp = VK_ATTACHMENT_STORE_OP_DONT_CARE;
        VkAttachmentDescription depthSinEscritura = depthStencilAttachment;
        depthSinEscritura.storeOp = VK_ATTACHMENT_STORE_OP_DONT_CARE;
        const std::array<VkAttachmentDescription, 3> rasterSinEscrituraAttachments = {
            colorAttachment,
            attrSinEscritura,
            depthSinEscritura,
        };
        VkRenderPassCreateInfo sinEscrituraCreateInfo = rasterRenderPassCreateInfo;
        sinEscrituraCreateInfo.pAttachments = rasterSinEscrituraAttachments.data();
        if (vkCreateRenderPass(Device, &sinEscrituraCreateInfo, nullptr, &GraphicsRasterSinEscrituraRenderPass) != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics raster sin-escritura render pass");
            return false;
        }

        VkAttachmentDescription rasterLoadColorAttachment = colorAttachment;
        rasterLoadColorAttachment.loadOp = VK_ATTACHMENT_LOAD_OP_LOAD;
        const std::array<VkAttachmentDescription, 3> rasterLoadAttachments = {
            rasterLoadColorAttachment,
            attrAttachment,
            depthStencilAttachment,
        };

        VkRenderPassCreateInfo rasterLoadRenderPassCreateInfo = rasterRenderPassCreateInfo;
        rasterLoadRenderPassCreateInfo.pAttachments = rasterLoadAttachments.data();
        if (vkCreateRenderPass(Device, &rasterLoadRenderPassCreateInfo, nullptr, &GraphicsRasterLoadRenderPass) != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics raster-load render pass");
            return false;
        }

        VkAttachmentDescription colorOnlyAttachment = colorAttachment;
        colorOnlyAttachment.loadOp = VK_ATTACHMENT_LOAD_OP_LOAD;
        VkAttachmentReference colorOnlyRef{0u, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL};
        VkSubpassDescription colorOnlySubpass{};
        colorOnlySubpass.pipelineBindPoint = VK_PIPELINE_BIND_POINT_GRAPHICS;
        colorOnlySubpass.colorAttachmentCount = 1;
        colorOnlySubpass.pColorAttachments = &colorOnlyRef;

        std::array<VkSubpassDependency, 2> colorOnlyDependencies{};
        colorOnlyDependencies[0].srcSubpass = VK_SUBPASS_EXTERNAL;
        colorOnlyDependencies[0].dstSubpass = 0;
        colorOnlyDependencies[0].srcStageMask = VK_PIPELINE_STAGE_TRANSFER_BIT | VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT;
        colorOnlyDependencies[0].dstStageMask = VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT;
        colorOnlyDependencies[0].srcAccessMask = VK_ACCESS_TRANSFER_WRITE_BIT | VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
        colorOnlyDependencies[0].dstAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
        colorOnlyDependencies[1].srcSubpass = 0;
        colorOnlyDependencies[1].dstSubpass = VK_SUBPASS_EXTERNAL;
        colorOnlyDependencies[1].srcStageMask = VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT;
        colorOnlyDependencies[1].dstStageMask = VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT;
        colorOnlyDependencies[1].srcAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
        colorOnlyDependencies[1].dstAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;

        VkRenderPassCreateInfo colorOnlyRenderPassCreateInfo{};
        colorOnlyRenderPassCreateInfo.sType = VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO;
        colorOnlyRenderPassCreateInfo.attachmentCount = 1;
        colorOnlyRenderPassCreateInfo.pAttachments = &colorOnlyAttachment;
        colorOnlyRenderPassCreateInfo.subpassCount = 1;
        colorOnlyRenderPassCreateInfo.pSubpasses = &colorOnlySubpass;
        colorOnlyRenderPassCreateInfo.dependencyCount = static_cast<u32>(colorOnlyDependencies.size());
        colorOnlyRenderPassCreateInfo.pDependencies = colorOnlyDependencies.data();
        if (vkCreateRenderPass(Device, &colorOnlyRenderPassCreateInfo, nullptr, &GraphicsColorOnlyRenderPass) != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics color-only render pass");
            return false;
        }
    }

    VkAttachmentDescription finalColorAttachment{};
    finalColorAttachment.format = GraphicsRasterColorFormat;
    finalColorAttachment.samples = VK_SAMPLE_COUNT_1_BIT;
    finalColorAttachment.loadOp = VK_ATTACHMENT_LOAD_OP_LOAD;
    finalColorAttachment.storeOp = VK_ATTACHMENT_STORE_OP_STORE;
    finalColorAttachment.stencilLoadOp = VK_ATTACHMENT_LOAD_OP_DONT_CARE;
    finalColorAttachment.stencilStoreOp = VK_ATTACHMENT_STORE_OP_DONT_CARE;
    finalColorAttachment.initialLayout = VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
    finalColorAttachment.finalLayout = VK_IMAGE_LAYOUT_GENERAL;

    VkAttachmentReference finalColorRef{0u, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL};
    VkSubpassDescription finalSubpass{};
    finalSubpass.pipelineBindPoint = VK_PIPELINE_BIND_POINT_GRAPHICS;
    finalSubpass.colorAttachmentCount = 1;
    finalSubpass.pColorAttachments = &finalColorRef;

    std::array<VkSubpassDependency, 2> finalDependencies{};
    finalDependencies[0].srcSubpass = VK_SUBPASS_EXTERNAL;
    finalDependencies[0].dstSubpass = 0;
    finalDependencies[0].srcStageMask = VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT;
    finalDependencies[0].dstStageMask = VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT;
    finalDependencies[0].srcAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT | VK_ACCESS_SHADER_READ_BIT;
    finalDependencies[0].dstAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
    finalDependencies[1].srcSubpass = 0;
    finalDependencies[1].dstSubpass = VK_SUBPASS_EXTERNAL;
    finalDependencies[1].srcStageMask = VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT;
    finalDependencies[1].dstStageMask = VK_PIPELINE_STAGE_TRANSFER_BIT | VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT;
    finalDependencies[1].srcAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
    finalDependencies[1].dstAccessMask = VK_ACCESS_SHADER_READ_BIT | VK_ACCESS_TRANSFER_READ_BIT;

    VkRenderPassCreateInfo finalRenderPassCreateInfo{};
    finalRenderPassCreateInfo.sType = VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO;
    finalRenderPassCreateInfo.attachmentCount = 1;
    finalRenderPassCreateInfo.pAttachments = &finalColorAttachment;
    finalRenderPassCreateInfo.subpassCount = 1;
    finalRenderPassCreateInfo.pSubpasses = &finalSubpass;
    finalRenderPassCreateInfo.dependencyCount = static_cast<u32>(finalDependencies.size());
    finalRenderPassCreateInfo.pDependencies = finalDependencies.data();

    if (vkCreateRenderPass(Device, &finalRenderPassCreateInfo, nullptr, &GraphicsFinalRenderPass) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics final render pass");
        return false;
    }

    VkShaderModule rasterVertModule = createShaderModule(Device, melonDS_gpu3d_vulkan_graphics_raster_vert_spv, melonDS_gpu3d_vulkan_graphics_raster_vert_spv_len);
    VkShaderModule rasterFragModule = createShaderModule(Device, rasterShader.bytes, rasterShader.length);

    const bool dynamicTextureIndexingEnabled =
        VulkanContext::Get().SupportsDynamicTextureIndexing();
    const bool useDirectWBufferTextureIndexing =
        usesGraphicsProductResources && dynamicTextureIndexingEnabled;
    VkShaderModule rasterDirectFragModule = useDirectWBufferTextureIndexing
        ? createShaderModule(
            Device,
            melonDS_gpu3d_vulkan_graphics_raster_direct_frag_spv,
            melonDS_gpu3d_vulkan_graphics_raster_direct_frag_spv_len)
        : VK_NULL_HANDLE;
    VkShaderModule rasterNoFragDepthFragModule = createShaderModule(Device, rasterNoFragDepthShader.bytes, rasterNoFragDepthShader.length);
    VkShaderModule rasterNoFragDepthDirectFragModule = dynamicTextureIndexingEnabled
        ? createShaderModule(Device, rasterNoFragDepthDirectShader.bytes, rasterNoFragDepthDirectShader.length)
        : VK_NULL_HANDLE;
    VkShaderModule rasterNoFragDepthDirectFastModulateFragModule = dynamicTextureIndexingEnabled
        ? createShaderModule(Device, rasterFastModulateShader.bytes, rasterFastModulateShader.length)
        : VK_NULL_HANDLE;
    VkShaderModule rasterNoFragDepthDirectFastModulateToonFragModule = dynamicTextureIndexingEnabled
        ? createShaderModule(Device, rasterFastModulateToonShader.bytes, rasterFastModulateToonShader.length)
        : VK_NULL_HANDLE;
    VkShaderModule rasterNoFragDepthDirectFastModulatePlainFragModule = dynamicTextureIndexingEnabled
        ? createShaderModule(Device, rasterFastModulatePlainShader.bytes, rasterFastModulatePlainShader.length)
        : VK_NULL_HANDLE;
    VkShaderModule rasterNoFragDepthDirectFastModulateOpaqueAlphaToonFragModule = dynamicTextureIndexingEnabled
        ? createShaderModule(Device, rasterFastModulateOpaqueAlphaToonShader.bytes, rasterFastModulateOpaqueAlphaToonShader.length)
        : VK_NULL_HANDLE;
    VkShaderModule rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainFragModule = dynamicTextureIndexingEnabled
        ? createShaderModule(Device, rasterFastModulateOpaqueAlphaPlainShader.bytes, rasterFastModulateOpaqueAlphaPlainShader.length)
        : VK_NULL_HANDLE;
    const bool useFastModulatePlainFragmentDepth =
        usesGraphicsProductResources && VulkanContext::Get().SupportsDynamicTextureIndexing();
    VkShaderModule rasterFragmentDepthDirectFastModulatePlainFragModule = useFastModulatePlainFragmentDepth
        ? createShaderModule(Device, melonDS_gpu3d_vulkan_graphics_raster_fragment_depth_direct_fast_modulate_plain_frag_spv, melonDS_gpu3d_vulkan_graphics_raster_fragment_depth_direct_fast_modulate_plain_frag_spv_len)
        : VK_NULL_HANDLE;
    VkShaderModule rasterFragmentDepthDirectFastModulateOpaqueAlphaPlainFragModule = usesGraphicsProductResources && dynamicTextureIndexingEnabled
        ? createShaderModule(Device, melonDS_gpu3d_vulkan_graphics_raster_fragment_depth_direct_fast_modulate_opaque_alpha_plain_frag_spv, melonDS_gpu3d_vulkan_graphics_raster_fragment_depth_direct_fast_modulate_opaque_alpha_plain_frag_spv_len)
        : VK_NULL_HANDLE;
    VkShaderModule rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrFragModule = usesGraphicsProductResources && dynamicTextureIndexingEnabled
        ? createShaderModule(Device, melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_plain_no_attr_frag_spv, melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_plain_no_attr_frag_spv_len)
        : VK_NULL_HANDLE;
    VkShaderModule rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainColorOnlyFragModule = usesGraphicsProductResources && dynamicTextureIndexingEnabled
        ? createShaderModule(Device, melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_plain_color_only_frag_spv, melonDS_gpu3d_vulkan_graphics_raster_no_frag_depth_direct_fast_modulate_opaque_alpha_plain_color_only_frag_spv_len)
        : VK_NULL_HANDLE;
    const bool useGraphicsEdgeMarkAlphaShader =
        usesGraphicsProductResources && VulkanContext::Get().SupportsDynamicTextureIndexing();
    VkShaderModule edgeMarkAlphaFragModule = useGraphicsEdgeMarkAlphaShader
        ? createShaderModule(
            Device,
            melonDS_gpu3d_vulkan_graphics_edge_mark_alpha_frag_spv,
            melonDS_gpu3d_vulkan_graphics_edge_mark_alpha_frag_spv_len)
        : VK_NULL_HANDLE;
    VkShaderModule noColorFragModule = createShaderModule(Device, noColorShader.bytes, noColorShader.length);
    VkShaderModule clearFragModule = createShaderModule(Device, melonDS_gpu3d_vulkan_graphics_clear_frag_spv, melonDS_gpu3d_vulkan_graphics_clear_frag_spv_len);
    VkShaderModule finalVertModule = createShaderModule(Device, melonDS_gpu3d_vulkan_graphics_final_vert_spv, melonDS_gpu3d_vulkan_graphics_final_vert_spv_len);
    VkShaderModule edgeFragModule = createShaderModule(Device, edgeShader.bytes, edgeShader.length);
    VkShaderModule edgeFogFragModule = createShaderModule(Device, edgeFogShader.bytes, edgeFogShader.length);
    VkShaderModule fogFragModule = createShaderModule(Device, fogShader.bytes, fogShader.length);

    if (rasterVertModule == VK_NULL_HANDLE
        || rasterFragModule == VK_NULL_HANDLE
        || (useDirectWBufferTextureIndexing && rasterDirectFragModule == VK_NULL_HANDLE)
        || rasterNoFragDepthFragModule == VK_NULL_HANDLE
        || (dynamicTextureIndexingEnabled
            && (rasterNoFragDepthDirectFragModule == VK_NULL_HANDLE
                || rasterNoFragDepthDirectFastModulateFragModule == VK_NULL_HANDLE
                || rasterNoFragDepthDirectFastModulateToonFragModule == VK_NULL_HANDLE
                || rasterNoFragDepthDirectFastModulatePlainFragModule == VK_NULL_HANDLE
                || rasterNoFragDepthDirectFastModulateOpaqueAlphaToonFragModule == VK_NULL_HANDLE
                || rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainFragModule == VK_NULL_HANDLE))
        || (useFastModulatePlainFragmentDepth
            && rasterFragmentDepthDirectFastModulatePlainFragModule == VK_NULL_HANDLE)
        || (usesGraphicsProductResources && dynamicTextureIndexingEnabled
            && (rasterFragmentDepthDirectFastModulateOpaqueAlphaPlainFragModule == VK_NULL_HANDLE
                || rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrFragModule == VK_NULL_HANDLE
                || rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainColorOnlyFragModule == VK_NULL_HANDLE))
        || (useGraphicsEdgeMarkAlphaShader && edgeMarkAlphaFragModule == VK_NULL_HANDLE)
        || noColorFragModule == VK_NULL_HANDLE
        || clearFragModule == VK_NULL_HANDLE
        || finalVertModule == VK_NULL_HANDLE
        || edgeFragModule == VK_NULL_HANDLE
        || edgeFogFragModule == VK_NULL_HANDLE
        || fogFragModule == VK_NULL_HANDLE)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics shader modules");
        if (rasterVertModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterVertModule, nullptr);
        if (rasterFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterFragModule, nullptr);
        if (rasterDirectFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterDirectFragModule, nullptr);
        if (rasterNoFragDepthFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterNoFragDepthFragModule, nullptr);
        if (rasterNoFragDepthDirectFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterNoFragDepthDirectFragModule, nullptr);
        if (rasterNoFragDepthDirectFastModulateFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateFragModule, nullptr);
        if (rasterNoFragDepthDirectFastModulateToonFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateToonFragModule, nullptr);
        if (rasterNoFragDepthDirectFastModulatePlainFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulatePlainFragModule, nullptr);
        if (rasterNoFragDepthDirectFastModulateOpaqueAlphaToonFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateOpaqueAlphaToonFragModule, nullptr);
        if (rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainFragModule, nullptr);
        if (rasterFragmentDepthDirectFastModulatePlainFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterFragmentDepthDirectFastModulatePlainFragModule, nullptr);
        if (rasterFragmentDepthDirectFastModulateOpaqueAlphaPlainFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterFragmentDepthDirectFastModulateOpaqueAlphaPlainFragModule, nullptr);
        if (rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrFragModule, nullptr);
        if (rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainColorOnlyFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainColorOnlyFragModule, nullptr);
        if (edgeMarkAlphaFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, edgeMarkAlphaFragModule, nullptr);
        if (noColorFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, noColorFragModule, nullptr);
        if (clearFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, clearFragModule, nullptr);
        if (finalVertModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, finalVertModule, nullptr);
        if (edgeFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, edgeFragModule, nullptr);
        if (edgeFogFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, edgeFogFragModule, nullptr);
        if (fogFragModule != VK_NULL_HANDLE) vkDestroyShaderModule(Device, fogFragModule, nullptr);
        return false;
    }

    auto makeBlendAttachment = [](
                                   VkColorComponentFlags writeMask,
                                   bool blendEnable,
                                   VkBlendFactor srcColor,
                                   VkBlendFactor dstColor,
                                   VkBlendOp colorOp,
                                   VkBlendFactor srcAlpha,
                                   VkBlendFactor dstAlpha,
                                   VkBlendOp alphaOp) {
        VkPipelineColorBlendAttachmentState state{};
        state.colorWriteMask = writeMask;
        state.blendEnable = blendEnable ? VK_TRUE : VK_FALSE;
        state.srcColorBlendFactor = srcColor;
        state.dstColorBlendFactor = dstColor;
        state.colorBlendOp = colorOp;
        state.srcAlphaBlendFactor = srcAlpha;
        state.dstAlphaBlendFactor = dstAlpha;
        state.alphaBlendOp = alphaOp;
        return state;
    };

    auto createRasterPipeline = [&](VkShaderModule fragmentModule,
                                    const VkSpecializationInfo* fragmentSpecializationInfo,
                                    const std::array<VkPipelineColorBlendAttachmentState, 3>& blendAttachments,
                                    bool depthWriteEnable,
                                    VkCompareOp depthCompareOp,
                                    bool stencilTestEnable,
                                    VkStencilOp stencilFailOp,
                                    VkStencilOp stencilDepthFailOp,
                                    VkStencilOp stencilPassOp,
                                    VkCompareOp stencilCompareOp,
                                    VkPipeline* outPipeline,
                                    VkPrimitiveTopology topology = VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST,
                                    bool depthTestEnable = true,
                                    bool depthBoundsTestEnable = false) -> bool {
        VkPipelineShaderStageCreateInfo shaderStages[2]{};
        shaderStages[0].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
        shaderStages[0].stage = VK_SHADER_STAGE_VERTEX_BIT;
        shaderStages[0].module = rasterVertModule;
        shaderStages[0].pName = "main";
        shaderStages[1].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
        shaderStages[1].stage = VK_SHADER_STAGE_FRAGMENT_BIT;
        shaderStages[1].module = fragmentModule;
        shaderStages[1].pName = "main";
        shaderStages[1].pSpecializationInfo = fragmentSpecializationInfo;

        const VkVertexInputBindingDescription vertexBindingDescription = {
            0u,
            static_cast<u32>(sizeof(GraphicsVertexGpu)),
            VK_VERTEX_INPUT_RATE_VERTEX,
        };
        const std::array<VkVertexInputAttributeDescription, 6> vertexAttributeDescriptions = {{
            {0u, 0u, VK_FORMAT_R32G32B32A32_SFLOAT, 0u},
            {1u, 0u, VK_FORMAT_R32G32_SFLOAT, 16u},
            {2u, 0u, VK_FORMAT_R8G8B8A8_UINT, 24u},
            {3u, 0u, VK_FORMAT_R32G32B32A32_UINT, 28u},
            {4u, 0u, VK_FORMAT_R32G32B32_UINT, 44u},
            {5u, 0u, VK_FORMAT_R16G16B16A16_SINT, 56u},
        }};
        VkPipelineVertexInputStateCreateInfo vertexInputState{};
        vertexInputState.sType = VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO;
        vertexInputState.vertexBindingDescriptionCount = 1;
        vertexInputState.pVertexBindingDescriptions = &vertexBindingDescription;
        vertexInputState.vertexAttributeDescriptionCount = static_cast<u32>(vertexAttributeDescriptions.size());
        vertexInputState.pVertexAttributeDescriptions = vertexAttributeDescriptions.data();

        VkPipelineInputAssemblyStateCreateInfo inputAssemblyState{};
        inputAssemblyState.sType = VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO;
        inputAssemblyState.topology = topology;

        VkPipelineViewportStateCreateInfo viewportState{};
        viewportState.sType = VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO;
        viewportState.viewportCount = 1;
        viewportState.scissorCount = 1;

        VkPipelineRasterizationStateCreateInfo rasterizationState{};
        rasterizationState.sType = VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO;
        rasterizationState.polygonMode = VK_POLYGON_MODE_FILL;
        rasterizationState.cullMode = VK_CULL_MODE_NONE;
        rasterizationState.frontFace = VK_FRONT_FACE_COUNTER_CLOCKWISE;
        rasterizationState.lineWidth = 1.0f;

        VkPipelineMultisampleStateCreateInfo multisampleState{};
        multisampleState.sType = VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO;
        multisampleState.rasterizationSamples = VK_SAMPLE_COUNT_1_BIT;

        VkStencilOpState stencilState{};
        stencilState.failOp = stencilFailOp;
        stencilState.passOp = stencilPassOp;
        stencilState.depthFailOp = stencilDepthFailOp;
        stencilState.compareOp = stencilCompareOp;
        stencilState.compareMask = 0xFFu;
        stencilState.writeMask = 0xFFu;
        stencilState.reference = 0u;

        VkPipelineDepthStencilStateCreateInfo depthStencilState{};
        depthStencilState.sType = VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO;
        depthStencilState.depthTestEnable = depthTestEnable ? VK_TRUE : VK_FALSE;
        depthStencilState.depthBoundsTestEnable = depthBoundsTestEnable ? VK_TRUE : VK_FALSE;
        depthStencilState.depthWriteEnable = depthWriteEnable ? VK_TRUE : VK_FALSE;
        depthStencilState.depthCompareOp = depthCompareOp;
        depthStencilState.stencilTestEnable = stencilTestEnable ? VK_TRUE : VK_FALSE;
        depthStencilState.front = stencilState;
        depthStencilState.back = stencilState;

        VkPipelineColorBlendStateCreateInfo colorBlendState{};
        colorBlendState.sType = VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO;
        colorBlendState.attachmentCount = usesGraphicsProductResources
            ? 2u
            : static_cast<u32>(blendAttachments.size());
        colorBlendState.pAttachments = blendAttachments.data();

        const std::array<VkDynamicState, 6> dynamicStates = {
            VK_DYNAMIC_STATE_VIEWPORT,
            VK_DYNAMIC_STATE_SCISSOR,
            VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK,
            VK_DYNAMIC_STATE_STENCIL_WRITE_MASK,
            VK_DYNAMIC_STATE_STENCIL_REFERENCE,
            VK_DYNAMIC_STATE_DEPTH_BOUNDS,
        };

        VkPipelineDynamicStateCreateInfo dynamicState{};
        dynamicState.sType = VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO;
        dynamicState.dynamicStateCount = depthBoundsTestEnable ? 6u : 5u;
        dynamicState.pDynamicStates = dynamicStates.data();

        VkGraphicsPipelineCreateInfo pipelineCreateInfo{};
        pipelineCreateInfo.sType = VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO;
        pipelineCreateInfo.stageCount = 2;
        pipelineCreateInfo.pStages = shaderStages;
        pipelineCreateInfo.pVertexInputState = &vertexInputState;
        pipelineCreateInfo.pInputAssemblyState = &inputAssemblyState;
        pipelineCreateInfo.pViewportState = &viewportState;
        pipelineCreateInfo.pRasterizationState = &rasterizationState;
        pipelineCreateInfo.pMultisampleState = &multisampleState;
        pipelineCreateInfo.pDepthStencilState = &depthStencilState;
        pipelineCreateInfo.pColorBlendState = &colorBlendState;
        pipelineCreateInfo.pDynamicState = &dynamicState;
        pipelineCreateInfo.layout = GraphicsPipelineLayout;
        pipelineCreateInfo.renderPass = GraphicsRasterRenderPass;
        pipelineCreateInfo.subpass = 0;

        return vkCreateGraphicsPipelines(Device, ComputePipelineCache, 1, &pipelineCreateInfo, nullptr, outPipeline) == VK_SUCCESS;
    };

    auto createColorOnlyRasterPipeline = [&](VkShaderModule fragmentModule,
                                             const VkSpecializationInfo* fragmentSpecializationInfo,
                                             VkPipelineColorBlendAttachmentState blendAttachment,
                                             VkPipeline* outPipeline) -> bool {
        VkPipelineShaderStageCreateInfo shaderStages[2]{};
        shaderStages[0].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
        shaderStages[0].stage = VK_SHADER_STAGE_VERTEX_BIT;
        shaderStages[0].module = rasterVertModule;
        shaderStages[0].pName = "main";
        shaderStages[1].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
        shaderStages[1].stage = VK_SHADER_STAGE_FRAGMENT_BIT;
        shaderStages[1].module = fragmentModule;
        shaderStages[1].pName = "main";
        shaderStages[1].pSpecializationInfo = fragmentSpecializationInfo;

        const VkVertexInputBindingDescription vertexBindingDescription = {
            0u,
            static_cast<u32>(sizeof(GraphicsVertexGpu)),
            VK_VERTEX_INPUT_RATE_VERTEX,
        };
        const std::array<VkVertexInputAttributeDescription, 6> vertexAttributeDescriptions = {{
            {0u, 0u, VK_FORMAT_R32G32B32A32_SFLOAT, 0u},
            {1u, 0u, VK_FORMAT_R32G32_SFLOAT, 16u},
            {2u, 0u, VK_FORMAT_R8G8B8A8_UINT, 24u},
            {3u, 0u, VK_FORMAT_R32G32B32A32_UINT, 28u},
            {4u, 0u, VK_FORMAT_R32G32B32_UINT, 44u},
            {5u, 0u, VK_FORMAT_R16G16B16A16_SINT, 56u},
        }};
        VkPipelineVertexInputStateCreateInfo vertexInputState{};
        vertexInputState.sType = VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO;
        vertexInputState.vertexBindingDescriptionCount = 1;
        vertexInputState.pVertexBindingDescriptions = &vertexBindingDescription;
        vertexInputState.vertexAttributeDescriptionCount = static_cast<u32>(vertexAttributeDescriptions.size());
        vertexInputState.pVertexAttributeDescriptions = vertexAttributeDescriptions.data();

        VkPipelineInputAssemblyStateCreateInfo inputAssemblyState{};
        inputAssemblyState.sType = VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO;
        inputAssemblyState.topology = VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST;

        VkPipelineViewportStateCreateInfo viewportState{};
        viewportState.sType = VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO;
        viewportState.viewportCount = 1;
        viewportState.scissorCount = 1;

        VkPipelineRasterizationStateCreateInfo rasterizationState{};
        rasterizationState.sType = VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO;
        rasterizationState.polygonMode = VK_POLYGON_MODE_FILL;
        rasterizationState.cullMode = VK_CULL_MODE_NONE;
        rasterizationState.frontFace = VK_FRONT_FACE_COUNTER_CLOCKWISE;
        rasterizationState.lineWidth = 1.0f;

        VkPipelineMultisampleStateCreateInfo multisampleState{};
        multisampleState.sType = VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO;
        multisampleState.rasterizationSamples = VK_SAMPLE_COUNT_1_BIT;

        VkPipelineDepthStencilStateCreateInfo depthStencilState{};
        depthStencilState.sType = VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO;
        depthStencilState.depthTestEnable = VK_FALSE;
        depthStencilState.depthWriteEnable = VK_FALSE;
        depthStencilState.stencilTestEnable = VK_FALSE;

        VkPipelineColorBlendStateCreateInfo colorBlendState{};
        colorBlendState.sType = VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO;
        colorBlendState.attachmentCount = 1;
        colorBlendState.pAttachments = &blendAttachment;

        const std::array<VkDynamicState, 5> dynamicStates = {
            VK_DYNAMIC_STATE_VIEWPORT,
            VK_DYNAMIC_STATE_SCISSOR,
            VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK,
            VK_DYNAMIC_STATE_STENCIL_WRITE_MASK,
            VK_DYNAMIC_STATE_STENCIL_REFERENCE,
        };

        VkPipelineDynamicStateCreateInfo dynamicState{};
        dynamicState.sType = VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO;
        dynamicState.dynamicStateCount = static_cast<u32>(dynamicStates.size());
        dynamicState.pDynamicStates = dynamicStates.data();

        VkGraphicsPipelineCreateInfo pipelineCreateInfo{};
        pipelineCreateInfo.sType = VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO;
        pipelineCreateInfo.stageCount = 2;
        pipelineCreateInfo.pStages = shaderStages;
        pipelineCreateInfo.pVertexInputState = &vertexInputState;
        pipelineCreateInfo.pInputAssemblyState = &inputAssemblyState;
        pipelineCreateInfo.pViewportState = &viewportState;
        pipelineCreateInfo.pRasterizationState = &rasterizationState;
        pipelineCreateInfo.pMultisampleState = &multisampleState;
        pipelineCreateInfo.pDepthStencilState = &depthStencilState;
        pipelineCreateInfo.pColorBlendState = &colorBlendState;
        pipelineCreateInfo.pDynamicState = &dynamicState;
        pipelineCreateInfo.layout = GraphicsPipelineLayout;
        pipelineCreateInfo.renderPass = GraphicsColorOnlyRenderPass;
        pipelineCreateInfo.subpass = 0;

        return vkCreateGraphicsPipelines(Device, ComputePipelineCache, 1, &pipelineCreateInfo, nullptr, outPipeline) == VK_SUCCESS;
    };

    auto createColorOnlyFullscreenPipeline = [&](VkShaderModule fragmentModule,
                                                 VkPipelineColorBlendAttachmentState blendAttachment,
                                                 VkPipeline* outPipeline) -> bool {
        VkPipelineShaderStageCreateInfo shaderStages[2]{};
        shaderStages[0].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
        shaderStages[0].stage = VK_SHADER_STAGE_VERTEX_BIT;
        shaderStages[0].module = finalVertModule;
        shaderStages[0].pName = "main";
        shaderStages[1].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
        shaderStages[1].stage = VK_SHADER_STAGE_FRAGMENT_BIT;
        shaderStages[1].module = fragmentModule;
        shaderStages[1].pName = "main";

        VkPipelineVertexInputStateCreateInfo vertexInputState{};
        vertexInputState.sType = VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO;

        VkPipelineInputAssemblyStateCreateInfo inputAssemblyState{};
        inputAssemblyState.sType = VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO;
        inputAssemblyState.topology = VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST;

        VkPipelineViewportStateCreateInfo viewportState{};
        viewportState.sType = VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO;
        viewportState.viewportCount = 1;
        viewportState.scissorCount = 1;

        VkPipelineRasterizationStateCreateInfo rasterizationState{};
        rasterizationState.sType = VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO;
        rasterizationState.polygonMode = VK_POLYGON_MODE_FILL;
        rasterizationState.cullMode = VK_CULL_MODE_NONE;
        rasterizationState.frontFace = VK_FRONT_FACE_COUNTER_CLOCKWISE;
        rasterizationState.lineWidth = 1.0f;

        VkPipelineMultisampleStateCreateInfo multisampleState{};
        multisampleState.sType = VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO;
        multisampleState.rasterizationSamples = VK_SAMPLE_COUNT_1_BIT;

        VkPipelineDepthStencilStateCreateInfo depthStencilState{};
        depthStencilState.sType = VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO;
        depthStencilState.depthTestEnable = VK_FALSE;
        depthStencilState.depthWriteEnable = VK_FALSE;
        depthStencilState.stencilTestEnable = VK_FALSE;

        VkPipelineColorBlendStateCreateInfo colorBlendState{};
        colorBlendState.sType = VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO;
        colorBlendState.attachmentCount = 1;
        colorBlendState.pAttachments = &blendAttachment;

        const std::array<VkDynamicState, 2> dynamicStates = {
            VK_DYNAMIC_STATE_VIEWPORT,
            VK_DYNAMIC_STATE_SCISSOR,
        };
        VkPipelineDynamicStateCreateInfo dynamicState{};
        dynamicState.sType = VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO;
        dynamicState.dynamicStateCount = static_cast<u32>(dynamicStates.size());
        dynamicState.pDynamicStates = dynamicStates.data();

        VkGraphicsPipelineCreateInfo pipelineCreateInfo{};
        pipelineCreateInfo.sType = VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO;
        pipelineCreateInfo.stageCount = 2;
        pipelineCreateInfo.pStages = shaderStages;
        pipelineCreateInfo.pVertexInputState = &vertexInputState;
        pipelineCreateInfo.pInputAssemblyState = &inputAssemblyState;
        pipelineCreateInfo.pViewportState = &viewportState;
        pipelineCreateInfo.pRasterizationState = &rasterizationState;
        pipelineCreateInfo.pMultisampleState = &multisampleState;
        pipelineCreateInfo.pDepthStencilState = &depthStencilState;
        pipelineCreateInfo.pColorBlendState = &colorBlendState;
        pipelineCreateInfo.pDynamicState = &dynamicState;
        pipelineCreateInfo.layout = GraphicsPipelineLayout;
        pipelineCreateInfo.renderPass = GraphicsColorOnlyRenderPass;
        pipelineCreateInfo.subpass = 0;

        return vkCreateGraphicsPipelines(Device, ComputePipelineCache, 1, &pipelineCreateInfo, nullptr, outPipeline) == VK_SUCCESS;
    };

    auto createFullscreenRasterPipeline = [&](VkShaderModule fragmentModule,
                                              const std::array<VkPipelineColorBlendAttachmentState, 3>& blendAttachments,
                                              bool depthWriteEnable,
                                              VkCompareOp depthCompareOp,
                                              bool stencilTestEnable,
                                              VkStencilOp stencilFailOp,
                                              VkStencilOp stencilDepthFailOp,
                                              VkStencilOp stencilPassOp,
                                              VkCompareOp stencilCompareOp,
                                              VkPipeline* outPipeline) -> bool {
        VkPipelineShaderStageCreateInfo shaderStages[2]{};
        shaderStages[0].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
        shaderStages[0].stage = VK_SHADER_STAGE_VERTEX_BIT;
        shaderStages[0].module = finalVertModule;
        shaderStages[0].pName = "main";
        shaderStages[1].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
        shaderStages[1].stage = VK_SHADER_STAGE_FRAGMENT_BIT;
        shaderStages[1].module = fragmentModule;
        shaderStages[1].pName = "main";

        VkPipelineVertexInputStateCreateInfo vertexInputState{};
        vertexInputState.sType = VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO;

        VkPipelineInputAssemblyStateCreateInfo inputAssemblyState{};
        inputAssemblyState.sType = VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO;
        inputAssemblyState.topology = VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST;

        VkPipelineViewportStateCreateInfo viewportState{};
        viewportState.sType = VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO;
        viewportState.viewportCount = 1;
        viewportState.scissorCount = 1;

        VkPipelineRasterizationStateCreateInfo rasterizationState{};
        rasterizationState.sType = VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO;
        rasterizationState.polygonMode = VK_POLYGON_MODE_FILL;
        rasterizationState.cullMode = VK_CULL_MODE_NONE;
        rasterizationState.frontFace = VK_FRONT_FACE_COUNTER_CLOCKWISE;
        rasterizationState.lineWidth = 1.0f;

        VkPipelineMultisampleStateCreateInfo multisampleState{};
        multisampleState.sType = VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO;
        multisampleState.rasterizationSamples = VK_SAMPLE_COUNT_1_BIT;

        VkStencilOpState stencilState{};
        stencilState.failOp = stencilFailOp;
        stencilState.passOp = stencilPassOp;
        stencilState.depthFailOp = stencilDepthFailOp;
        stencilState.compareOp = stencilCompareOp;
        stencilState.compareMask = 0xFFu;
        stencilState.writeMask = 0xFFu;
        stencilState.reference = 0u;

        VkPipelineDepthStencilStateCreateInfo depthStencilState{};
        depthStencilState.sType = VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO;
        depthStencilState.depthTestEnable = VK_TRUE;
        depthStencilState.depthWriteEnable = depthWriteEnable ? VK_TRUE : VK_FALSE;
        depthStencilState.depthCompareOp = depthCompareOp;
        depthStencilState.stencilTestEnable = stencilTestEnable ? VK_TRUE : VK_FALSE;
        depthStencilState.front = stencilState;
        depthStencilState.back = stencilState;

        VkPipelineColorBlendStateCreateInfo colorBlendState{};
        colorBlendState.sType = VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO;
        colorBlendState.attachmentCount = usesGraphicsProductResources
            ? 2u
            : static_cast<u32>(blendAttachments.size());
        colorBlendState.pAttachments = blendAttachments.data();

        const std::array<VkDynamicState, 5> dynamicStates = {
            VK_DYNAMIC_STATE_VIEWPORT,
            VK_DYNAMIC_STATE_SCISSOR,
            VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK,
            VK_DYNAMIC_STATE_STENCIL_WRITE_MASK,
            VK_DYNAMIC_STATE_STENCIL_REFERENCE,
        };

        VkPipelineDynamicStateCreateInfo dynamicState{};
        dynamicState.sType = VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO;
        dynamicState.dynamicStateCount = static_cast<u32>(dynamicStates.size());
        dynamicState.pDynamicStates = dynamicStates.data();

        VkGraphicsPipelineCreateInfo pipelineCreateInfo{};
        pipelineCreateInfo.sType = VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO;
        pipelineCreateInfo.stageCount = 2;
        pipelineCreateInfo.pStages = shaderStages;
        pipelineCreateInfo.pVertexInputState = &vertexInputState;
        pipelineCreateInfo.pInputAssemblyState = &inputAssemblyState;
        pipelineCreateInfo.pViewportState = &viewportState;
        pipelineCreateInfo.pRasterizationState = &rasterizationState;
        pipelineCreateInfo.pMultisampleState = &multisampleState;
        pipelineCreateInfo.pDepthStencilState = &depthStencilState;
        pipelineCreateInfo.pColorBlendState = &colorBlendState;
        pipelineCreateInfo.pDynamicState = &dynamicState;
        pipelineCreateInfo.layout = GraphicsPipelineLayout;
        pipelineCreateInfo.renderPass = GraphicsRasterRenderPass;
        pipelineCreateInfo.subpass = 0;

        return vkCreateGraphicsPipelines(Device, ComputePipelineCache, 1, &pipelineCreateInfo, nullptr, outPipeline) == VK_SUCCESS;
    };

    auto createFinalPipeline = [&](VkShaderModule fragmentModule,
                                   VkPipelineColorBlendAttachmentState blendAttachment,
                                   VkPipeline* outPipeline) -> bool {
        VkPipelineShaderStageCreateInfo shaderStages[2]{};
        shaderStages[0].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
        shaderStages[0].stage = VK_SHADER_STAGE_VERTEX_BIT;
        shaderStages[0].module = finalVertModule;
        shaderStages[0].pName = "main";
        shaderStages[1].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
        shaderStages[1].stage = VK_SHADER_STAGE_FRAGMENT_BIT;
        shaderStages[1].module = fragmentModule;
        shaderStages[1].pName = "main";

        VkPipelineVertexInputStateCreateInfo vertexInputState{};
        vertexInputState.sType = VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO;

        VkPipelineInputAssemblyStateCreateInfo inputAssemblyState{};
        inputAssemblyState.sType = VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO;
        inputAssemblyState.topology = VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST;

        VkPipelineViewportStateCreateInfo viewportState{};
        viewportState.sType = VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO;
        viewportState.viewportCount = 1;
        viewportState.scissorCount = 1;

        VkPipelineRasterizationStateCreateInfo rasterizationState{};
        rasterizationState.sType = VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO;
        rasterizationState.polygonMode = VK_POLYGON_MODE_FILL;
        rasterizationState.cullMode = VK_CULL_MODE_NONE;
        rasterizationState.frontFace = VK_FRONT_FACE_COUNTER_CLOCKWISE;
        rasterizationState.lineWidth = 1.0f;

        VkPipelineMultisampleStateCreateInfo multisampleState{};
        multisampleState.sType = VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO;
        multisampleState.rasterizationSamples = VK_SAMPLE_COUNT_1_BIT;

        VkPipelineColorBlendStateCreateInfo colorBlendState{};
        colorBlendState.sType = VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO;
        colorBlendState.attachmentCount = 1;
        colorBlendState.pAttachments = &blendAttachment;

        const std::array<VkDynamicState, 3> dynamicStates = {
            VK_DYNAMIC_STATE_VIEWPORT,
            VK_DYNAMIC_STATE_SCISSOR,
            VK_DYNAMIC_STATE_BLEND_CONSTANTS,
        };
        VkPipelineDynamicStateCreateInfo dynamicState{};
        dynamicState.sType = VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO;
        dynamicState.dynamicStateCount = static_cast<u32>(dynamicStates.size());
        dynamicState.pDynamicStates = dynamicStates.data();

        VkGraphicsPipelineCreateInfo pipelineCreateInfo{};
        pipelineCreateInfo.sType = VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO;
        pipelineCreateInfo.stageCount = 2;
        pipelineCreateInfo.pStages = shaderStages;
        pipelineCreateInfo.pVertexInputState = &vertexInputState;
        pipelineCreateInfo.pInputAssemblyState = &inputAssemblyState;
        pipelineCreateInfo.pViewportState = &viewportState;
        pipelineCreateInfo.pRasterizationState = &rasterizationState;
        pipelineCreateInfo.pMultisampleState = &multisampleState;
        pipelineCreateInfo.pColorBlendState = &colorBlendState;
        pipelineCreateInfo.pDynamicState = &dynamicState;
        pipelineCreateInfo.layout = GraphicsPipelineLayout;
        pipelineCreateInfo.renderPass = GraphicsFinalRenderPass;
        pipelineCreateInfo.subpass = 0;

        return vkCreateGraphicsPipelines(Device, ComputePipelineCache, 1, &pipelineCreateInfo, nullptr, outPipeline) == VK_SUCCESS;
    };

    struct RasterFragmentSpecialization
    {
        u32 depthInterpolationMode;
        u32 translucentPass;
        u32 edgeMarkPass;
    };

    std::array<VkSpecializationMapEntry, 3> rasterSpecializationEntries{};
    rasterSpecializationEntries[0] = {0u, offsetof(RasterFragmentSpecialization, depthInterpolationMode), sizeof(u32)};
    rasterSpecializationEntries[1] = {1u, offsetof(RasterFragmentSpecialization, translucentPass), sizeof(u32)};
    rasterSpecializationEntries[2] = {2u, offsetof(RasterFragmentSpecialization, edgeMarkPass), sizeof(u32)};

    struct NoColorFragmentSpecialization
    {
        u32 writeFragDepth;
        u32 edgeMarkPass;
    };

    std::array<VkSpecializationMapEntry, 2> noColorSpecializationEntries{};
    noColorSpecializationEntries[0] = {0u, offsetof(NoColorFragmentSpecialization, writeFragDepth), sizeof(u32)};
    noColorSpecializationEntries[1] = {1u, offsetof(NoColorFragmentSpecialization, edgeMarkPass), sizeof(u32)};

    const auto makeOpaqueIndex = [](u32 wMode, u32 depthCompareMode) {
        return (wMode * GraphicsDepthCompareModeCount) + depthCompareMode;
    };
    const auto makeBgZeroTranslucentIndex = [](u32 wMode, u32 depthCompareMode, u32 depthWriteMode, u32 fogWriteMode) {
        return (((wMode * GraphicsDepthCompareModeCount) + depthCompareMode) * GraphicsDepthWriteModeCount + depthWriteMode)
            * GraphicsFogWriteModeCount
            + fogWriteMode;
    };
    const auto makeTranslucentIndex = [](u32 wMode, u32 depthCompareMode, u32 depthWriteMode, u32 fogWriteMode, u32 alphaBlendMode) {
        return ((((wMode * GraphicsDepthCompareModeCount) + depthCompareMode) * GraphicsDepthWriteModeCount + depthWriteMode)
            * GraphicsFogWriteModeCount
            + fogWriteMode)
            * GraphicsAlphaBlendModeCount
            + alphaBlendMode;
    };

    const auto colorWriteAll = VK_COLOR_COMPONENT_R_BIT | VK_COLOR_COMPONENT_G_BIT | VK_COLOR_COMPONENT_B_BIT | VK_COLOR_COMPONENT_A_BIT;
    const auto colorWriteRgbOnly = VK_COLOR_COMPONENT_R_BIT | VK_COLOR_COMPONENT_G_BIT | VK_COLOR_COMPONENT_B_BIT;
    const auto colorWriteB = VK_COLOR_COMPONENT_B_BIT;
    const auto colorWriteR = VK_COLOR_COMPONENT_R_BIT;
    const auto colorWriteG = VK_COLOR_COMPONENT_G_BIT;
    const auto colorWriteNone = 0u;

    const std::array<VkPipelineColorBlendAttachmentState, 3> clearBlendAttachments = {
        makeBlendAttachment(colorWriteAll, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
        makeBlendAttachment(colorWriteAll, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
        makeBlendAttachment(colorWriteR, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
    };
    if (!createFullscreenRasterPipeline(
            clearFragModule,
            clearBlendAttachments,
            true,
            VK_COMPARE_OP_ALWAYS,
            true,
            VK_STENCIL_OP_REPLACE,
            VK_STENCIL_OP_REPLACE,
            VK_STENCIL_OP_REPLACE,
            VK_COMPARE_OP_ALWAYS,
            &GraphicsClearPipeline))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics clear pipeline");
        return false;
    }

    for (u32 wMode = 0; wMode < GraphicsWModeCount; wMode++)
    {
        for (u32 depthCompareMode = 0; depthCompareMode < GraphicsDepthCompareModeCount; depthCompareMode++)
        {
            RasterFragmentSpecialization opaqueSpecializationData{};
            opaqueSpecializationData.depthInterpolationMode = wMode;
            opaqueSpecializationData.translucentPass = 0u;
            opaqueSpecializationData.edgeMarkPass = 0u;
            VkSpecializationInfo opaqueSpecializationInfo{};
            opaqueSpecializationInfo.mapEntryCount = static_cast<u32>(rasterSpecializationEntries.size());
            opaqueSpecializationInfo.pMapEntries = rasterSpecializationEntries.data();
            opaqueSpecializationInfo.dataSize = sizeof(opaqueSpecializationData);
            opaqueSpecializationInfo.pData = &opaqueSpecializationData;

            const std::array<VkPipelineColorBlendAttachmentState, 3> opaqueBlendAttachments = {
                makeBlendAttachment(colorWriteAll, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                makeBlendAttachment(colorWriteAll, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                makeBlendAttachment(colorWriteR, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
            };
            const std::array<VkPipelineColorBlendAttachmentState, 3> opaqueNoAttrBlendAttachments = {
                makeBlendAttachment(colorWriteAll, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
            };
            const std::array<VkPipelineColorBlendAttachmentState, 3> opaqueRgbNoAttrBlendAttachments = {
                makeBlendAttachment(colorWriteRgbOnly, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
            };
            const bool useDirectWBufferOpaqueTextureIndexing =
                wMode != 0u && VulkanContext::Get().SupportsDynamicTextureIndexing();

            static const bool g2FragDepthViejo = [] {
                if (std::getenv("MELON_G2_FRAGDEPTH_Z") != nullptr)
                    return true;
#ifdef __ANDROID__
                char v[92] = {};
                if (__system_property_get("debug.melonds.g2_fragdepth_z", v) > 0)
                    return v[0] == '1';
#endif
                return false;
            }();
            VkShaderModule opaqueFragModule;
            if (wMode != 0u)
                opaqueFragModule = useDirectWBufferOpaqueTextureIndexing ? rasterNoFragDepthDirectFragModule : rasterNoFragDepthFragModule;
            else
                opaqueFragModule = g2FragDepthViejo ? rasterFragModule : rasterNoFragDepthFragModule;

            if (!createRasterPipeline(
                    opaqueFragModule,
                    &opaqueSpecializationInfo,
                    opaqueBlendAttachments,
                    true,
                    depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_REPLACE,
                    VK_COMPARE_OP_ALWAYS,
                    &GraphicsOpaquePipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque pipeline");
                return false;
            }
            if (usesGraphicsProductResources
                && !createRasterPipeline(
                    opaqueFragModule,
                    &opaqueSpecializationInfo,
                    opaqueNoAttrBlendAttachments,
                    true,
                    depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_REPLACE,
                    VK_COMPARE_OP_ALWAYS,
                    &GraphicsOpaqueNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque no-attr pipeline");
                return false;
            }
            if (usesGraphicsProductResources
                && !createRasterPipeline(
                    opaqueFragModule,
                    &opaqueSpecializationInfo,
                    opaqueNoAttrBlendAttachments,
                    false,
                    depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_REPLACE,
                    VK_COMPARE_OP_NOT_EQUAL,
                    &GraphicsOpaqueOcclusionNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque occlusion no-attr pipeline");
                return false;
            }
            if (wMode != 0u
                && !createRasterPipeline(
                    rasterFragModule,
                    &opaqueSpecializationInfo,
                    opaqueBlendAttachments,
                    true,
                    depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_REPLACE,
                    VK_COMPARE_OP_ALWAYS,
                    &GraphicsOpaqueFragmentDepthPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fragment-depth pipeline");
                return false;
            }
            if (wMode != 0u
                && useFastModulatePlainFragmentDepth
                && !createRasterPipeline(
                    rasterFragmentDepthDirectFastModulatePlainFragModule,
                    &opaqueSpecializationInfo,
                    opaqueBlendAttachments,
                    true,
                    depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_REPLACE,
                    VK_COMPARE_OP_ALWAYS,
                    &GraphicsOpaqueFastModulatePlainFragmentDepthPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-plain fragment-depth pipeline");
                return false;
            }
            NoColorFragmentSpecialization opaquePrepassSpecializationData{};
            opaquePrepassSpecializationData.writeFragDepth = wMode;
            opaquePrepassSpecializationData.edgeMarkPass = 0u;

            VkSpecializationInfo opaquePrepassSpecializationInfo{};
            opaquePrepassSpecializationInfo.mapEntryCount = static_cast<u32>(noColorSpecializationEntries.size());
            opaquePrepassSpecializationInfo.pMapEntries = noColorSpecializationEntries.data();
            opaquePrepassSpecializationInfo.dataSize = sizeof(opaquePrepassSpecializationData);
            opaquePrepassSpecializationInfo.pData = &opaquePrepassSpecializationData;

            const std::array<VkPipelineColorBlendAttachmentState, 3> opaquePrepassBlendAttachments = {
                makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
            };
            if (usesGraphicsProductResources
                && !createRasterPipeline(
                    noColorFragModule,
                    &opaquePrepassSpecializationInfo,
                    opaquePrepassBlendAttachments,
                    true,
                    depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_REPLACE,
                    VK_COMPARE_OP_ALWAYS,
                    &GraphicsOpaqueFragmentDepthPrepassPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fragment-depth prepass pipeline");
                return false;
            }
            if (usesGraphicsProductResources
                && !createRasterPipeline(
                    rasterFragModule,
                    &opaqueSpecializationInfo,
                    opaquePrepassBlendAttachments,
                    true,
                    depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_REPLACE,
                    VK_COMPARE_OP_ALWAYS,
                    &GraphicsOpaqueAlphaFragmentDepthPrepassPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque alpha fragment-depth prepass pipeline");
                return false;
            }

            NoColorFragmentSpecialization prepassHwSpecializationData{};
            prepassHwSpecializationData.writeFragDepth = 0u;
            prepassHwSpecializationData.edgeMarkPass = 0u;
            VkSpecializationInfo prepassHwSpecializationInfo{};
            prepassHwSpecializationInfo.mapEntryCount = static_cast<u32>(noColorSpecializationEntries.size());
            prepassHwSpecializationInfo.pMapEntries = noColorSpecializationEntries.data();
            prepassHwSpecializationInfo.dataSize = sizeof(prepassHwSpecializationData);
            prepassHwSpecializationInfo.pData = &prepassHwSpecializationData;
            if (usesGraphicsProductResources
                && !createRasterPipeline(
                    noColorFragModule,
                    &prepassHwSpecializationInfo,
                    opaquePrepassBlendAttachments,
                    true,
                    depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_REPLACE,
                    VK_COMPARE_OP_ALWAYS,
                    &GraphicsOpaquePrepassHwDepthPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque hw-depth prepass pipeline");
                return false;
            }
            {
                const VkShaderModule alphaPrepassHwModule =
                    (wMode != 0u && useDirectWBufferOpaqueTextureIndexing)
                        ? rasterNoFragDepthDirectFragModule
                        : rasterNoFragDepthFragModule;
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        alphaPrepassHwModule,
                        &opaqueSpecializationInfo,
                        opaquePrepassBlendAttachments,
                        true,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueAlphaPrepassHwDepthPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque alpha hw-depth prepass pipeline");
                    return false;
                }
            }
            if (usesGraphicsProductResources
                && !createRasterPipeline(
                    opaqueFragModule,
                    &opaqueSpecializationInfo,
                    opaqueBlendAttachments,
                    false,
                    VK_COMPARE_OP_ALWAYS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_ZERO,
                    VK_COMPARE_OP_EQUAL,
                    &GraphicsOpaqueStencilResolvePipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque stencil resolve pipeline");
                return false;
            }
            if (depthCompareMode == 0u
                && !createRasterPipeline(
                    opaqueFragModule,
                    &opaqueSpecializationInfo,
                    opaqueBlendAttachments,
                    false,
                    VK_COMPARE_OP_ALWAYS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_REPLACE,
                    VK_COMPARE_OP_ALWAYS,
                    &GraphicsOpaqueUiOverlayPipelines[wMode]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque UI overlay pipeline");
                return false;
            }
            if (useDirectWBufferOpaqueTextureIndexing)
            {
                if (!createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateFragModule,
                        &opaqueSpecializationInfo,
                        opaqueBlendAttachments,
                        true,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulatePipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        false,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulateNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate no-attr pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        false,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_NOT_EQUAL,
                        &GraphicsOpaqueFastModulateOcclusionNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate occlusion no-attr pipeline");
                    return false;
                }
                if (!createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateToonFragModule,
                        &opaqueSpecializationInfo,
                        opaqueBlendAttachments,
                        true,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulateToonPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-toon pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateToonFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        false,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulateToonNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-toon no-attr pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateToonFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        false,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_NOT_EQUAL,
                        &GraphicsOpaqueFastModulateToonOcclusionNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-toon occlusion no-attr pipeline");
                    return false;
                }
                if (!createRasterPipeline(
                        rasterNoFragDepthDirectFastModulatePlainFragModule,
                        &opaqueSpecializationInfo,
                        opaqueBlendAttachments,
                        true,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulatePlainPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-plain pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulatePlainFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        true,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulatePlainNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-plain no-attr pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulatePlainFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        false,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_NOT_EQUAL,
                        &GraphicsOpaqueFastModulatePlainOcclusionNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-plain occlusion no-attr pipeline");
                    return false;
                }
                if (!createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateOpaqueAlphaToonFragModule,
                        &opaqueSpecializationInfo,
                        opaqueBlendAttachments,
                        true,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulateOpaqueAlphaToonPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-opaque-alpha-toon pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateOpaqueAlphaToonFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        false,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulateOpaqueAlphaToonNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-opaque-alpha-toon no-attr pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateOpaqueAlphaToonFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        false,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_NOT_EQUAL,
                        &GraphicsOpaqueFastModulateOpaqueAlphaToonOcclusionNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-opaque-alpha-toon occlusion no-attr pipeline");
                    return false;
                }
                if (!createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainFragModule,
                        &opaqueSpecializationInfo,
                        opaqueBlendAttachments,
                        true,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulateOpaqueAlphaPlainPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-opaque-alpha-plain pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterFragmentDepthDirectFastModulateOpaqueAlphaPlainFragModule,
                        &opaqueSpecializationInfo,
                        opaqueBlendAttachments,
                        true,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulateOpaqueAlphaPlainFragmentDepthPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-opaque-alpha-plain fragment-depth pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        true,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_ALWAYS,
                        &GraphicsOpaqueFastModulateOpaqueAlphaPlainNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-opaque-alpha-plain no-attr pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createColorOnlyRasterPipeline(
                        rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainColorOnlyFragModule,
                        &opaqueSpecializationInfo,
                        opaqueBlendAttachments[0],
                        &GraphicsOpaqueFastModulateOpaqueAlphaPlainColorOnlyPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-opaque-alpha-plain color-only pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        false,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_NOT_EQUAL,
                        &GraphicsOpaqueFastModulateOpaqueAlphaPlainOcclusionNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-opaque-alpha-plain occlusion no-attr pipeline");
                    return false;
                }
                if (usesGraphicsProductResources
                    && !createRasterPipeline(
                        rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrFragModule,
                        &opaqueSpecializationInfo,
                        opaqueNoAttrBlendAttachments,
                        false,
                        depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                        true,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_KEEP,
                        VK_STENCIL_OP_REPLACE,
                        VK_COMPARE_OP_NOT_EQUAL,
                        &GraphicsOpaqueFastModulateOpaqueAlphaPlainNoDepthOcclusionNoAttrPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics opaque fast-modulate-opaque-alpha-plain no-depth occlusion no-attr pipeline");
                    return false;
                }
            }

            for (u32 depthWriteMode = 0; depthWriteMode < GraphicsDepthWriteModeCount; depthWriteMode++)
            {
                for (u32 fogWriteMode = 0; fogWriteMode < GraphicsFogWriteModeCount; fogWriteMode++)
                {
                    RasterFragmentSpecialization translucentSpecializationData{};
                    translucentSpecializationData.depthInterpolationMode = wMode;
                    translucentSpecializationData.translucentPass = 1u;
                    translucentSpecializationData.edgeMarkPass = 0u;

                    VkSpecializationInfo translucentSpecializationInfo{};
                    translucentSpecializationInfo.mapEntryCount = static_cast<u32>(rasterSpecializationEntries.size());
                    translucentSpecializationInfo.pMapEntries = rasterSpecializationEntries.data();
                    translucentSpecializationInfo.dataSize = sizeof(translucentSpecializationData);
                    translucentSpecializationInfo.pData = &translucentSpecializationData;

                    static const bool sinR1a = std::getenv("MELON_SIN_R1A") != nullptr;

                    const VkShaderModule translucentFragModule =
                        (wMode == 0u && !sinR1a)
                            ? rasterNoFragDepthFragModule
                            : ((wMode != 0u && useDirectWBufferTextureIndexing)
                                ? rasterDirectFragModule
                                : rasterFragModule);

                    const std::array<VkPipelineColorBlendAttachmentState, 3> translucentBlendAttachments = {
                        makeBlendAttachment(colorWriteAll, true, VK_BLEND_FACTOR_SRC_ALPHA, VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ONE, VK_BLEND_OP_MAX),
                        makeBlendAttachment(colorWriteG, true, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_MIN, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_MIN),
                        makeBlendAttachment(depthWriteMode != 0u ? colorWriteR : colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                    };
                    const std::array<VkPipelineColorBlendAttachmentState, 3> translucentReplaceBlendAttachments = {
                        makeBlendAttachment(colorWriteAll, true, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ONE, VK_BLEND_OP_MAX),
                        makeBlendAttachment(colorWriteG, true, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_MIN, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_MIN),
                        makeBlendAttachment(depthWriteMode != 0u ? colorWriteR : colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                    };
                    const std::array<VkPipelineColorBlendAttachmentState, 3> bgZeroTranslucentBlendAttachments = {
                        makeBlendAttachment(colorWriteAll, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                        makeBlendAttachment(colorWriteG, true, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_MIN, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_MIN),
                        makeBlendAttachment(depthWriteMode != 0u ? colorWriteR : colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
                    };

                    if (!createRasterPipeline(
                            translucentFragModule,
                            &translucentSpecializationInfo,
                            translucentBlendAttachments,
                            depthWriteMode != 0u,
                            depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_REPLACE,
                            VK_COMPARE_OP_NOT_EQUAL,
                            &GraphicsTranslucentPipelines[makeTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode, 1u)]))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics translucent pipeline");
                        return false;
                    }

                    if (wMode == 0u && depthCompareMode != 0u
                        && VulkanContext::Get().SupportsDepthBounds()
                        && !createRasterPipeline(
                            translucentFragModule,
                            &translucentSpecializationInfo,
                            translucentBlendAttachments,
                            depthWriteMode != 0u,
                            VK_COMPARE_OP_ALWAYS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_REPLACE,
                            VK_COMPARE_OP_NOT_EQUAL,
                            &GraphicsBoundedDepthTranslucentPipelines[makeTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode, 1u)],
                            VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST, true, true))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create bounded-depth graphics translucent pipeline");
                        return false;
                    }

                    if (wMode != 0u
                        && useFastModulatePlainFragmentDepth
                        && !createRasterPipeline(
                            rasterFragmentDepthDirectFastModulatePlainFragModule,
                            &translucentSpecializationInfo,
                            translucentBlendAttachments,
                            depthWriteMode != 0u,
                            depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_REPLACE,
                            VK_COMPARE_OP_NOT_EQUAL,
                            &GraphicsTranslucentFastModulatePlainFragmentDepthPipelines[makeTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode, 1u)]))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics translucent fast-modulate-plain fragment-depth pipeline");
                        return false;
                    }

                    if (!createRasterPipeline(
                            translucentFragModule,
                            &translucentSpecializationInfo,
                            translucentReplaceBlendAttachments,
                            depthWriteMode != 0u,
                            depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_REPLACE,
                            VK_COMPARE_OP_NOT_EQUAL,
                            &GraphicsTranslucentPipelines[makeTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode, 0u)]))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics translucent-replace pipeline");
                        return false;
                    }

                    if (wMode == 0u && depthCompareMode != 0u
                        && VulkanContext::Get().SupportsDepthBounds()
                        && !createRasterPipeline(
                            translucentFragModule,
                            &translucentSpecializationInfo,
                            translucentReplaceBlendAttachments,
                            depthWriteMode != 0u,
                            VK_COMPARE_OP_ALWAYS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_REPLACE,
                            VK_COMPARE_OP_NOT_EQUAL,
                            &GraphicsBoundedDepthTranslucentPipelines[makeTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode, 0u)],
                            VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST, true, true))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create bounded-depth graphics translucent-replace pipeline");
                        return false;
                    }

                    if (!createRasterPipeline(
                            translucentFragModule,
                            &translucentSpecializationInfo,
                            bgZeroTranslucentBlendAttachments,
                            depthWriteMode != 0u,
                            depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_INVERT,
                            VK_COMPARE_OP_EQUAL,
                            &GraphicsBgZeroTranslucentPipelines[makeBgZeroTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode)]))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics bg-zero translucent pipeline");
                        return false;
                    }

                    if (wMode == 0u && depthCompareMode != 0u
                        && VulkanContext::Get().SupportsDepthBounds()
                        && !createRasterPipeline(
                            translucentFragModule,
                            &translucentSpecializationInfo,
                            bgZeroTranslucentBlendAttachments,
                            depthWriteMode != 0u,
                            VK_COMPARE_OP_ALWAYS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_INVERT,
                            VK_COMPARE_OP_EQUAL,
                            &GraphicsBoundedDepthBgZeroTranslucentPipelines[makeBgZeroTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode)],
                            VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST, true, true))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create bounded-depth graphics bg-zero translucent pipeline");
                        return false;
                    }

                    if (wMode != 0u
                        && useFastModulatePlainFragmentDepth
                        && !createRasterPipeline(
                            rasterFragmentDepthDirectFastModulatePlainFragModule,
                            &translucentSpecializationInfo,
                            bgZeroTranslucentBlendAttachments,
                            depthWriteMode != 0u,
                            depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_INVERT,
                            VK_COMPARE_OP_EQUAL,
                            &GraphicsBgZeroFastModulatePlainPipelines[makeBgZeroTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode)]))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics bg-zero fast-modulate-plain pipeline");
                        return false;
                    }

                    if (!createRasterPipeline(
                            translucentFragModule,
                            &translucentSpecializationInfo,
                            translucentBlendAttachments,
                            depthWriteMode != 0u,
                            rasterPipelinePolicy.forceShadowBlendLessOrEqual || depthCompareMode != 0u
                                ? VK_COMPARE_OP_LESS_OR_EQUAL
                                : VK_COMPARE_OP_LESS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_INVERT,
                            VK_COMPARE_OP_EQUAL,
                            &GraphicsShadowBlendBgZeroPipelines[makeTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode, 1u)]))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics bg-zero shadow-blend pipeline");
                        return false;
                    }

                    if (!createRasterPipeline(
                            translucentFragModule,
                            &translucentSpecializationInfo,
                            translucentReplaceBlendAttachments,
                            depthWriteMode != 0u,
                            rasterPipelinePolicy.forceShadowBlendLessOrEqual || depthCompareMode != 0u
                                ? VK_COMPARE_OP_LESS_OR_EQUAL
                                : VK_COMPARE_OP_LESS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_INVERT,
                            VK_COMPARE_OP_EQUAL,
                            &GraphicsShadowBlendBgZeroPipelines[makeTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode, 0u)]))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics bg-zero shadow-blend-replace pipeline");
                        return false;
                    }

                    if (!createRasterPipeline(
                            translucentFragModule,
                            &translucentSpecializationInfo,
                            translucentBlendAttachments,
                            depthWriteMode != 0u,
                            rasterPipelinePolicy.forceShadowBlendLessOrEqual || depthCompareMode != 0u
                                ? VK_COMPARE_OP_LESS_OR_EQUAL
                                : VK_COMPARE_OP_LESS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_REPLACE,
                            VK_COMPARE_OP_EQUAL,
                            &GraphicsShadowBlendPipelines[makeTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode, 1u)]))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics shadow-blend pipeline");
                        return false;
                    }

                    if (!createRasterPipeline(
                            translucentFragModule,
                            &translucentSpecializationInfo,
                            translucentReplaceBlendAttachments,
                            depthWriteMode != 0u,
                            rasterPipelinePolicy.forceShadowBlendLessOrEqual || depthCompareMode != 0u
                                ? VK_COMPARE_OP_LESS_OR_EQUAL
                                : VK_COMPARE_OP_LESS,
                            true,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_KEEP,
                            VK_STENCIL_OP_REPLACE,
                            VK_COMPARE_OP_EQUAL,
                            &GraphicsShadowBlendPipelines[makeTranslucentIndex(wMode, depthCompareMode, depthWriteMode, fogWriteMode, 0u)]))
                    {
                        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics shadow-blend-replace pipeline");
                        return false;
                    }
                }
            }
        }

        RasterFragmentSpecialization edgeMarkSpecializationData{};
        edgeMarkSpecializationData.depthInterpolationMode = wMode;
        edgeMarkSpecializationData.translucentPass = 0u;
        edgeMarkSpecializationData.edgeMarkPass = 1u;

        VkSpecializationInfo edgeMarkSpecializationInfo{};
        edgeMarkSpecializationInfo.mapEntryCount = static_cast<u32>(rasterSpecializationEntries.size());
        edgeMarkSpecializationInfo.pMapEntries = rasterSpecializationEntries.data();
        edgeMarkSpecializationInfo.dataSize = sizeof(edgeMarkSpecializationData);
        edgeMarkSpecializationInfo.pData = &edgeMarkSpecializationData;

        const std::array<VkPipelineColorBlendAttachmentState, 3> edgeMarkBlendAttachments = {
            makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
            makeBlendAttachment(colorWriteB, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
            makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
        };
        VkShaderModule edgeMarkFragModule = rasterFragModule;
        if (usesGraphicsProductResources)
        {
            edgeMarkFragModule =
                wMode != 0u && VulkanContext::Get().SupportsDynamicTextureIndexing()
                    ? rasterNoFragDepthDirectFragModule
                    : rasterNoFragDepthFragModule;
        }
        if (!createRasterPipeline(
                edgeMarkFragModule,
                &edgeMarkSpecializationInfo,
                edgeMarkBlendAttachments,
                false,
                VK_COMPARE_OP_ALWAYS,
                false,
                VK_STENCIL_OP_KEEP,
                VK_STENCIL_OP_KEEP,
                VK_STENCIL_OP_KEEP,
                VK_COMPARE_OP_ALWAYS,
                &GraphicsEdgeMarkPipelines[wMode],
                VK_PRIMITIVE_TOPOLOGY_LINE_LIST))
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics edge-mark pipeline");
            return false;
        }
        if (wMode != 0u && edgeMarkAlphaFragModule != VK_NULL_HANDLE
            && !createRasterPipeline(
                edgeMarkAlphaFragModule,
                nullptr,
                edgeMarkBlendAttachments,
                false,
                VK_COMPARE_OP_ALWAYS,
                false,
                VK_STENCIL_OP_KEEP,
                VK_STENCIL_OP_KEEP,
                VK_STENCIL_OP_KEEP,
                VK_COMPARE_OP_ALWAYS,
                &GraphicsEdgeMarkAlphaPipelines[wMode],
                VK_PRIMITIVE_TOPOLOGY_LINE_LIST))
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics alpha-only edge-mark pipeline");
            return false;
        }

        NoColorFragmentSpecialization noColorSpecializationData{};
        noColorSpecializationData.writeFragDepth = wMode;
        noColorSpecializationData.edgeMarkPass = 0u;

        VkSpecializationInfo noColorSpecializationInfo{};
        noColorSpecializationInfo.mapEntryCount = static_cast<u32>(noColorSpecializationEntries.size());
        noColorSpecializationInfo.pMapEntries = noColorSpecializationEntries.data();
        noColorSpecializationInfo.dataSize = sizeof(noColorSpecializationData);
        noColorSpecializationInfo.pData = &noColorSpecializationData;

        const std::array<VkPipelineColorBlendAttachmentState, 3> noColorBlendAttachments = {
            makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
            makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
            makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
        };

        if (!createRasterPipeline(
                noColorFragModule,
                &noColorSpecializationInfo,
                noColorBlendAttachments,
                false,
                VK_COMPARE_OP_LESS,
                true,
                VK_STENCIL_OP_KEEP,
                VK_STENCIL_OP_INVERT,
                VK_STENCIL_OP_KEEP,
                VK_COMPARE_OP_EQUAL,
                &GraphicsShadowMaskBgZeroPipelines[wMode]))
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics shadow-mask-bgzero pipeline");
            return false;
        }

        if (!createRasterPipeline(
                noColorFragModule,
                &noColorSpecializationInfo,
                noColorBlendAttachments,
                false,
                VK_COMPARE_OP_LESS,
                true,
                VK_STENCIL_OP_KEEP,
                VK_STENCIL_OP_REPLACE,
                VK_STENCIL_OP_KEEP,
                VK_COMPARE_OP_ALWAYS,
                &GraphicsShadowMaskPipelines[wMode]))
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics shadow-mask pipeline");
            return false;
        }

        if (usesGraphicsProductResources
            && !createRasterPipeline(
                noColorFragModule,
                &noColorSpecializationInfo,
                noColorBlendAttachments,
                false,
                VK_COMPARE_OP_GREATER_OR_EQUAL,
                true,
                VK_STENCIL_OP_KEEP,
                VK_STENCIL_OP_REPLACE,
                VK_STENCIL_OP_KEEP,
                VK_COMPARE_OP_ALWAYS,
                &GraphicsShadowMaskDepthComplementPipelines[wMode]))
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics shadow-mask depth-complement pipeline");
            return false;
        }

        for (u32 depthCompareMode = 0; depthCompareMode < GraphicsDepthCompareModeCount; depthCompareMode++)
        {
            if (!createRasterPipeline(
                    noColorFragModule,
                    &noColorSpecializationInfo,
                    noColorBlendAttachments,
                    false,
                    depthCompareMode != 0u ? VK_COMPARE_OP_LESS_OR_EQUAL : VK_COMPARE_OP_LESS,
                    true,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_KEEP,
                    VK_STENCIL_OP_ZERO,
                    VK_COMPARE_OP_EQUAL,
                    &GraphicsShadowClearPipelines[makeOpaqueIndex(wMode, depthCompareMode)]))
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics shadow-clear pipeline");
                return false;
            }
        }
    }

    NoColorFragmentSpecialization stencilClearSpecializationData{};
    stencilClearSpecializationData.writeFragDepth = 0u;
    stencilClearSpecializationData.edgeMarkPass = 0u;
    VkSpecializationInfo stencilClearSpecializationInfo{};
    stencilClearSpecializationInfo.mapEntryCount = static_cast<u32>(noColorSpecializationEntries.size());
    stencilClearSpecializationInfo.pMapEntries = noColorSpecializationEntries.data();
    stencilClearSpecializationInfo.dataSize = sizeof(stencilClearSpecializationData);
    stencilClearSpecializationInfo.pData = &stencilClearSpecializationData;
    const std::array<VkPipelineColorBlendAttachmentState, 3> stencilClearBlendAttachments = {
        makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
        makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
        makeBlendAttachment(colorWriteNone, false, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD, VK_BLEND_FACTOR_ONE, VK_BLEND_FACTOR_ZERO, VK_BLEND_OP_ADD),
    };
    if (!createRasterPipeline(
            noColorFragModule,
            &stencilClearSpecializationInfo,
            stencilClearBlendAttachments,
            false,
            VK_COMPARE_OP_ALWAYS,
            true,
            VK_STENCIL_OP_KEEP,
            VK_STENCIL_OP_KEEP,
            VK_STENCIL_OP_REPLACE,
            VK_COMPARE_OP_ALWAYS,
            &GraphicsStencilBitClearPipeline))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics stencil-clear pipeline");
        return false;
    }

    constexpr VkColorComponentFlags colorWriteRgb =
        VK_COLOR_COMPONENT_R_BIT |
        VK_COLOR_COMPONENT_G_BIT |
        VK_COLOR_COMPONENT_B_BIT;

    const VkPipelineColorBlendAttachmentState finalEdgeBlendAttachment = makeBlendAttachment(
        colorWriteRgb,
        true,
        VK_BLEND_FACTOR_SRC_ALPHA,
        VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA,
        VK_BLEND_OP_ADD,
        VK_BLEND_FACTOR_ONE,
        VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA,
        VK_BLEND_OP_ADD);
    if (!createFinalPipeline(edgeFragModule, finalEdgeBlendAttachment, &GraphicsFinalEdgePipeline))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics final-edge pipeline");
        return false;
    }

    const VkPipelineColorBlendAttachmentState finalEdgeFogBlendAttachment = makeBlendAttachment(
        colorWriteRgb,
        true,
        VK_BLEND_FACTOR_ONE,
        VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA,
        VK_BLEND_OP_ADD,
        VK_BLEND_FACTOR_ONE,
        VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA,
        VK_BLEND_OP_ADD);
    if (!createFinalPipeline(edgeFogFragModule, finalEdgeFogBlendAttachment, &GraphicsFinalEdgeFogPipeline))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics final-edge-fog pipeline");
        return false;
    }

    const VkPipelineColorBlendAttachmentState finalFogBlendAttachment = makeBlendAttachment(
        colorWriteRgb,
        true,
        VK_BLEND_FACTOR_CONSTANT_COLOR,
        VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA,
        VK_BLEND_OP_ADD,
        VK_BLEND_FACTOR_CONSTANT_COLOR,
        VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA,
        VK_BLEND_OP_ADD);
    if (!createFinalPipeline(fogFragModule, finalFogBlendAttachment, &GraphicsFinalFogPipeline))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics final-fog pipeline");
        return false;
    }

    vkDestroyShaderModule(Device, rasterVertModule, nullptr);
    vkDestroyShaderModule(Device, rasterFragModule, nullptr);
    if (rasterDirectFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterDirectFragModule, nullptr);
    vkDestroyShaderModule(Device, rasterNoFragDepthFragModule, nullptr);
    if (rasterNoFragDepthDirectFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterNoFragDepthDirectFragModule, nullptr);
    if (rasterNoFragDepthDirectFastModulateFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateFragModule, nullptr);
    if (rasterNoFragDepthDirectFastModulateToonFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateToonFragModule, nullptr);
    if (rasterNoFragDepthDirectFastModulatePlainFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulatePlainFragModule, nullptr);
    if (rasterNoFragDepthDirectFastModulateOpaqueAlphaToonFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateOpaqueAlphaToonFragModule, nullptr);
    if (rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainFragModule, nullptr);
    if (rasterFragmentDepthDirectFastModulatePlainFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterFragmentDepthDirectFastModulatePlainFragModule, nullptr);
    if (rasterFragmentDepthDirectFastModulateOpaqueAlphaPlainFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterFragmentDepthDirectFastModulateOpaqueAlphaPlainFragModule, nullptr);
    if (rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainNoAttrFragModule, nullptr);
    if (rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainColorOnlyFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, rasterNoFragDepthDirectFastModulateOpaqueAlphaPlainColorOnlyFragModule, nullptr);
    if (edgeMarkAlphaFragModule != VK_NULL_HANDLE)
        vkDestroyShaderModule(Device, edgeMarkAlphaFragModule, nullptr);
    vkDestroyShaderModule(Device, noColorFragModule, nullptr);
    vkDestroyShaderModule(Device, clearFragModule, nullptr);
    vkDestroyShaderModule(Device, finalVertModule, nullptr);
    vkDestroyShaderModule(Device, edgeFragModule, nullptr);
    vkDestroyShaderModule(Device, edgeFogFragModule, nullptr);
    vkDestroyShaderModule(Device, fogFragModule, nullptr);

    GraphicsReady = true;
    savePipelineCache();
    return true;
}

bool VulkanRenderer3D::ensureRenderTarget(u32 width, u32 height)
{
    if (width == 0 || height == 0)
        return false;

    const bool graphicsAuxiliaryPassesReady = (GraphicsRasterLoadRenderPass != VK_NULL_HANDLE
            && GraphicsColorOnlyRenderPass != VK_NULL_HANDLE
            && GraphicsRasterLoadFramebuffer != VK_NULL_HANDLE
            && GraphicsColorOnlyFramebuffer != VK_NULL_HANDLE);
    const bool graphicsAttachmentsReady = !GraphicsReady
        || (AttrImage != VK_NULL_HANDLE
            && DepthStencilDepthImageView != VK_NULL_HANDLE
            && DepthStencilImage != VK_NULL_HANDLE
            && GraphicsRasterFramebuffer != VK_NULL_HANDLE
            && GraphicsFinalFramebuffer != VK_NULL_HANDLE
            && graphicsAuxiliaryPassesReady);
    if (ColorImage != VK_NULL_HANDLE && ColorImageWidth == width && ColorImageHeight == height && graphicsAttachmentsReady)
        return true;

    if ((ColorImage != VK_NULL_HANDLE
            || ReadbackBuffer != VK_NULL_HANDLE)
        && !waitForDeviceIdle("recreate render target"))
    {
        return false;
    }

    destroyReadbackBuffer();
    destroyRenderTarget();

    const auto createImage = [&](VkFormat format,
                                 VkImageUsageFlags usage,
                                 VkImageAspectFlags aspectMask,
                                 VkImage& image,
                                 VkDeviceMemory& memory,
                                 VkImageView& view) -> bool {
        VkImageCreateInfo imageCreateInfo{};
        imageCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO;
        imageCreateInfo.imageType = VK_IMAGE_TYPE_2D;
        imageCreateInfo.format = format;
        imageCreateInfo.extent.width = width;
        imageCreateInfo.extent.height = height;
        imageCreateInfo.extent.depth = 1;
        imageCreateInfo.mipLevels = 1;
        imageCreateInfo.arrayLayers = 1;
        imageCreateInfo.samples = VK_SAMPLE_COUNT_1_BIT;
        imageCreateInfo.tiling = VK_IMAGE_TILING_OPTIMAL;
        imageCreateInfo.usage = usage;
        imageCreateInfo.sharingMode = VK_SHARING_MODE_EXCLUSIVE;
        imageCreateInfo.initialLayout = VK_IMAGE_LAYOUT_UNDEFINED;

        if (vkCreateImage(Device, &imageCreateInfo, nullptr, &image) != VK_SUCCESS)
            return false;

        VkMemoryRequirements memoryRequirements{};
        vkGetImageMemoryRequirements(Device, image, &memoryRequirements);

        VkMemoryAllocateInfo memoryAllocateInfo{};
        memoryAllocateInfo.sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
        memoryAllocateInfo.allocationSize = memoryRequirements.size;
        memoryAllocateInfo.memoryTypeIndex = findMemoryType(memoryRequirements.memoryTypeBits, VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT);
        if (memoryAllocateInfo.memoryTypeIndex == UINT32_MAX)
            memoryAllocateInfo.memoryTypeIndex = findMemoryType(memoryRequirements.memoryTypeBits, 0);
        if (memoryAllocateInfo.memoryTypeIndex == UINT32_MAX)
            return false;

        if (vkAllocateMemory(Device, &memoryAllocateInfo, nullptr, &memory) != VK_SUCCESS)
            return false;

        if (vkBindImageMemory(Device, image, memory, 0) != VK_SUCCESS)
            return false;

        VkImageViewCreateInfo imageViewCreateInfo{};
        imageViewCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO;
        imageViewCreateInfo.image = image;
        imageViewCreateInfo.viewType = VK_IMAGE_VIEW_TYPE_2D;
        imageViewCreateInfo.format = format;
        imageViewCreateInfo.subresourceRange.aspectMask = aspectMask;
        imageViewCreateInfo.subresourceRange.baseMipLevel = 0;
        imageViewCreateInfo.subresourceRange.levelCount = 1;
        imageViewCreateInfo.subresourceRange.baseArrayLayer = 0;
        imageViewCreateInfo.subresourceRange.layerCount = 1;

        return vkCreateImageView(Device, &imageViewCreateInfo, nullptr, &view) == VK_SUCCESS;
    };
    const auto createImageView = [&](VkImage image,
                                     VkFormat format,
                                     VkImageAspectFlags aspectMask,
                                     VkImageView& view) -> bool {
        VkImageViewCreateInfo imageViewCreateInfo{};
        imageViewCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO;
        imageViewCreateInfo.image = image;
        imageViewCreateInfo.viewType = VK_IMAGE_VIEW_TYPE_2D;
        imageViewCreateInfo.format = format;
        imageViewCreateInfo.subresourceRange.aspectMask = aspectMask;
        imageViewCreateInfo.subresourceRange.baseMipLevel = 0;
        imageViewCreateInfo.subresourceRange.levelCount = 1;
        imageViewCreateInfo.subresourceRange.baseArrayLayer = 0;
        imageViewCreateInfo.subresourceRange.layerCount = 1;
        return vkCreateImageView(Device, &imageViewCreateInfo, nullptr, &view) == VK_SUCCESS;
    };

    if (!createImage(
            GraphicsReady ? GraphicsRasterColorFormat : kGraphicsColorTargetFormat,
            (!GraphicsReady ? VK_IMAGE_USAGE_STORAGE_BIT : 0u)
                | VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT
                | VK_IMAGE_USAGE_SAMPLED_BIT
                | VK_IMAGE_USAGE_TRANSFER_SRC_BIT
                | VK_IMAGE_USAGE_TRANSFER_DST_BIT,
            VK_IMAGE_ASPECT_COLOR_BIT,
            ColorImage,
            ColorImageMemory,
            ColorImageView))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create color target");
        destroyRenderTarget();
        return false;
    }

    if (GraphicsReady)
    {
        if (!createImage(
                kGraphicsAttrTargetFormat,
                VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT | VK_IMAGE_USAGE_SAMPLED_BIT | VK_IMAGE_USAGE_TRANSFER_SRC_BIT,
                VK_IMAGE_ASPECT_COLOR_BIT,
                AttrImage,
                AttrImageMemory,
                AttrImageView))
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create attr target");
            destroyRenderTarget();
            return false;
        }


        if (!createImage(
                GraphicsDepthStencilFormat,
                VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT
                    | VK_IMAGE_USAGE_SAMPLED_BIT | VK_IMAGE_USAGE_TRANSFER_SRC_BIT,
                VK_IMAGE_ASPECT_DEPTH_BIT | VK_IMAGE_ASPECT_STENCIL_BIT,
                DepthStencilImage,
                DepthStencilImageMemory,
                DepthStencilImageView))
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create depth-stencil target");
            destroyRenderTarget();
            return false;
        }
        if (!createImageView(
                DepthStencilImage,
                GraphicsDepthStencilFormat,
                VK_IMAGE_ASPECT_DEPTH_BIT,
                DepthStencilDepthImageView))
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create depth-sample view");
            destroyRenderTarget();
            return false;
        }

        const std::array<VkImageView, 3> graphicsRasterAttachments = {
            ColorImageView,
            AttrImageView,
            DepthStencilImageView,
        };
        VkFramebufferCreateInfo rasterFramebufferCreateInfo{};
        rasterFramebufferCreateInfo.sType = VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO;
        rasterFramebufferCreateInfo.renderPass = GraphicsRasterRenderPass;
        rasterFramebufferCreateInfo.attachmentCount = static_cast<u32>(graphicsRasterAttachments.size());
        rasterFramebufferCreateInfo.pAttachments = graphicsRasterAttachments.data();
        rasterFramebufferCreateInfo.width = width;
        rasterFramebufferCreateInfo.height = height;
        rasterFramebufferCreateInfo.layers = 1;
        if (vkCreateFramebuffer(Device, &rasterFramebufferCreateInfo, nullptr, &GraphicsRasterFramebuffer) != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics raster framebuffer");
            destroyRenderTarget();
            return false;
        }
        {
            rasterFramebufferCreateInfo.renderPass = GraphicsRasterLoadRenderPass;
            if (vkCreateFramebuffer(Device, &rasterFramebufferCreateInfo, nullptr, &GraphicsRasterLoadFramebuffer) != VK_SUCCESS)
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics raster-load framebuffer");
                destroyRenderTarget();
                return false;
            }
            VkFramebufferCreateInfo colorOnlyFramebufferCreateInfo{};
            colorOnlyFramebufferCreateInfo.sType = VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO;
            colorOnlyFramebufferCreateInfo.renderPass = GraphicsColorOnlyRenderPass;
            colorOnlyFramebufferCreateInfo.attachmentCount = 1;
            colorOnlyFramebufferCreateInfo.pAttachments = &ColorImageView;
            colorOnlyFramebufferCreateInfo.width = width;
            colorOnlyFramebufferCreateInfo.height = height;
            colorOnlyFramebufferCreateInfo.layers = 1;
            if (vkCreateFramebuffer(Device, &colorOnlyFramebufferCreateInfo, nullptr, &GraphicsColorOnlyFramebuffer) != VK_SUCCESS)
            {
                Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics color-only framebuffer");
                destroyRenderTarget();
                return false;
            }
        }

        VkFramebufferCreateInfo finalFramebufferCreateInfo{};
        finalFramebufferCreateInfo.sType = VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO;
        finalFramebufferCreateInfo.renderPass = GraphicsFinalRenderPass;
        finalFramebufferCreateInfo.attachmentCount = 1;
        finalFramebufferCreateInfo.pAttachments = &ColorImageView;
        finalFramebufferCreateInfo.width = width;
        finalFramebufferCreateInfo.height = height;
        finalFramebufferCreateInfo.layers = 1;
        if (vkCreateFramebuffer(Device, &finalFramebufferCreateInfo, nullptr, &GraphicsFinalFramebuffer) != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create graphics final framebuffer");
            destroyRenderTarget();
            return false;
        }
    }

    ColorImageWidth = width;
    ColorImageHeight = height;
    ColorImageInitialized = false;

    invalidateAllGraphicsDescriptorSetCaches();
    updateGraphicsDescriptorSet(nullptr);

    return true;
}

void VulkanRenderer3D::destroyRenderTarget()
{
    PublishedGlobalRenderIdentity = {};
    CurrentFrameServedIdentity = {};
    PublishedGlobalLiveRenderIdentity = {};
    PublishedGlobalRenderFence = VK_NULL_HANDLE;
    CurrentFrameLiveRenderIdentity = {};
    invalidateAllGraphicsDescriptorSetCaches();

    if (GraphicsFinalFramebuffer != VK_NULL_HANDLE)
    {
        vkDestroyFramebuffer(Device, GraphicsFinalFramebuffer, nullptr);
        GraphicsFinalFramebuffer = VK_NULL_HANDLE;
    }

    if (GraphicsColorOnlyFramebuffer != VK_NULL_HANDLE)
    {
        vkDestroyFramebuffer(Device, GraphicsColorOnlyFramebuffer, nullptr);
        GraphicsColorOnlyFramebuffer = VK_NULL_HANDLE;
    }

    if (GraphicsRasterLoadFramebuffer != VK_NULL_HANDLE)
    {
        vkDestroyFramebuffer(Device, GraphicsRasterLoadFramebuffer, nullptr);
        GraphicsRasterLoadFramebuffer = VK_NULL_HANDLE;
    }

    if (GraphicsRasterFramebuffer != VK_NULL_HANDLE)
    {
        vkDestroyFramebuffer(Device, GraphicsRasterFramebuffer, nullptr);
        GraphicsRasterFramebuffer = VK_NULL_HANDLE;
    }

    if (DepthStencilDepthImageView != VK_NULL_HANDLE)
    {
        vkDestroyImageView(Device, DepthStencilDepthImageView, nullptr);
        DepthStencilDepthImageView = VK_NULL_HANDLE;
    }

    if (DepthStencilImageView != VK_NULL_HANDLE)
    {
        vkDestroyImageView(Device, DepthStencilImageView, nullptr);
        DepthStencilImageView = VK_NULL_HANDLE;
    }

    if (DepthStencilImage != VK_NULL_HANDLE)
    {
        vkDestroyImage(Device, DepthStencilImage, nullptr);
        DepthStencilImage = VK_NULL_HANDLE;
    }

    if (DepthStencilImageMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, DepthStencilImageMemory, nullptr);
        DepthStencilImageMemory = VK_NULL_HANDLE;
    }




    if (AttrImageView != VK_NULL_HANDLE)
    {
        vkDestroyImageView(Device, AttrImageView, nullptr);
        AttrImageView = VK_NULL_HANDLE;
    }

    if (AttrImage != VK_NULL_HANDLE)
    {
        vkDestroyImage(Device, AttrImage, nullptr);
        AttrImage = VK_NULL_HANDLE;
    }

    if (AttrImageMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, AttrImageMemory, nullptr);
        AttrImageMemory = VK_NULL_HANDLE;
    }

    if (ColorImageView != VK_NULL_HANDLE)
    {
        vkDestroyImageView(Device, ColorImageView, nullptr);
        ColorImageView = VK_NULL_HANDLE;
    }

    if (ColorImage != VK_NULL_HANDLE)
    {
        vkDestroyImage(Device, ColorImage, nullptr);
        ColorImage = VK_NULL_HANDLE;
    }

    if (ColorImageMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, ColorImageMemory, nullptr);
        ColorImageMemory = VK_NULL_HANDLE;
    }

    if (RasterColorImageView != VK_NULL_HANDLE)
    {
        vkDestroyImageView(Device, RasterColorImageView, nullptr);
        RasterColorImageView = VK_NULL_HANDLE;
    }

    if (RasterColorImage != VK_NULL_HANDLE)
    {
        vkDestroyImage(Device, RasterColorImage, nullptr);
        RasterColorImage = VK_NULL_HANDLE;
    }

    if (RasterColorImageMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, RasterColorImageMemory, nullptr);
        RasterColorImageMemory = VK_NULL_HANDLE;
    }

    ColorImageWidth = 0;
    ColorImageHeight = 0;
    ColorImageInitialized = false;
}

bool VulkanRenderer3D::ensureFaithfulRasterProductSlot(FaithfulRasterProductSlot& target, u32 width, u32 height)
{
    if (!GraphicsReady)
        return false;
    if (width == 0 || height == 0)
        return false;
    if (target.ColorImage != VK_NULL_HANDLE
        && target.ColorImageView != VK_NULL_HANDLE
        && target.AttrImage != VK_NULL_HANDLE
        && target.AttrImageView != VK_NULL_HANDLE
        && target.DepthStencilImage != VK_NULL_HANDLE
        && target.DepthStencilImageView != VK_NULL_HANDLE
        && target.DepthStencilDepthImageView != VK_NULL_HANDLE
        && target.RasterFramebuffer != VK_NULL_HANDLE
        && target.RasterLoadFramebuffer != VK_NULL_HANDLE
        && target.ColorOnlyFramebuffer != VK_NULL_HANDLE
        && target.FinalFramebuffer != VK_NULL_HANDLE
        && target.Width == width
        && target.Height == height)
    {
        return true;
    }

    destroyFaithfulRasterProductSlot(target);

    const auto createImage = [&](VkFormat format,
                                 VkImageUsageFlags usage,
                                 VkImageAspectFlags aspectMask,
                                 VkImage& image,
                                 VkDeviceMemory& memory,
                                 VkImageView& view) -> bool {
        VkImageCreateInfo imageCreateInfo{};
        imageCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO;
        imageCreateInfo.imageType = VK_IMAGE_TYPE_2D;
        imageCreateInfo.format = format;
        imageCreateInfo.extent.width = width;
        imageCreateInfo.extent.height = height;
        imageCreateInfo.extent.depth = 1;
        imageCreateInfo.mipLevels = 1;
        imageCreateInfo.arrayLayers = 1;
        imageCreateInfo.samples = VK_SAMPLE_COUNT_1_BIT;
        imageCreateInfo.tiling = VK_IMAGE_TILING_OPTIMAL;
        imageCreateInfo.usage = usage;
        imageCreateInfo.sharingMode = VK_SHARING_MODE_EXCLUSIVE;
        imageCreateInfo.initialLayout = VK_IMAGE_LAYOUT_UNDEFINED;

        if (vkCreateImage(Device, &imageCreateInfo, nullptr, &image) != VK_SUCCESS)
            return false;

        VkMemoryRequirements memoryRequirements{};
        vkGetImageMemoryRequirements(Device, image, &memoryRequirements);

        VkMemoryAllocateInfo memoryAllocateInfo{};
        memoryAllocateInfo.sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
        memoryAllocateInfo.allocationSize = memoryRequirements.size;
        memoryAllocateInfo.memoryTypeIndex = findMemoryType(memoryRequirements.memoryTypeBits, VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT);
        if (memoryAllocateInfo.memoryTypeIndex == UINT32_MAX)
            memoryAllocateInfo.memoryTypeIndex = findMemoryType(memoryRequirements.memoryTypeBits, 0);
        if (memoryAllocateInfo.memoryTypeIndex == UINT32_MAX)
            return false;

        if (vkAllocateMemory(Device, &memoryAllocateInfo, nullptr, &memory) != VK_SUCCESS)
            return false;

        if (vkBindImageMemory(Device, image, memory, 0) != VK_SUCCESS)
            return false;

        VkImageViewCreateInfo imageViewCreateInfo{};
        imageViewCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO;
        imageViewCreateInfo.image = image;
        imageViewCreateInfo.viewType = VK_IMAGE_VIEW_TYPE_2D;
        imageViewCreateInfo.format = format;
        imageViewCreateInfo.subresourceRange.aspectMask = aspectMask;
        imageViewCreateInfo.subresourceRange.baseMipLevel = 0;
        imageViewCreateInfo.subresourceRange.levelCount = 1;
        imageViewCreateInfo.subresourceRange.baseArrayLayer = 0;
        imageViewCreateInfo.subresourceRange.layerCount = 1;

        return vkCreateImageView(Device, &imageViewCreateInfo, nullptr, &view) == VK_SUCCESS;
    };
    const auto createImageView = [&](VkImage image,
                                     VkFormat format,
                                     VkImageAspectFlags aspectMask,
                                     VkImageView& view) -> bool {
        VkImageViewCreateInfo imageViewCreateInfo{};
        imageViewCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO;
        imageViewCreateInfo.image = image;
        imageViewCreateInfo.viewType = VK_IMAGE_VIEW_TYPE_2D;
        imageViewCreateInfo.format = format;
        imageViewCreateInfo.subresourceRange.aspectMask = aspectMask;
        imageViewCreateInfo.subresourceRange.baseMipLevel = 0;
        imageViewCreateInfo.subresourceRange.levelCount = 1;
        imageViewCreateInfo.subresourceRange.baseArrayLayer = 0;
        imageViewCreateInfo.subresourceRange.layerCount = 1;
        return vkCreateImageView(Device, &imageViewCreateInfo, nullptr, &view) == VK_SUCCESS;
    };

    if (!createImage(
            GraphicsRasterColorFormat,
            VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT | VK_IMAGE_USAGE_SAMPLED_BIT | VK_IMAGE_USAGE_TRANSFER_SRC_BIT | VK_IMAGE_USAGE_TRANSFER_DST_BIT,
            VK_IMAGE_ASPECT_COLOR_BIT,
            target.ColorImage,
            target.ColorImageMemory,
            target.ColorImageView))
    {
        destroyFaithfulRasterProductSlot(target);
        return false;
    }

    if (!createImage(
            kGraphicsAttrTargetFormat,
            VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT | VK_IMAGE_USAGE_SAMPLED_BIT | VK_IMAGE_USAGE_TRANSFER_SRC_BIT,
            VK_IMAGE_ASPECT_COLOR_BIT,
            target.AttrImage,
            target.AttrImageMemory,
            target.AttrImageView))
    {
        destroyFaithfulRasterProductSlot(target);
        return false;
    }

    if (!createImage(
            GraphicsDepthStencilFormat,
            VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT | VK_IMAGE_USAGE_SAMPLED_BIT | VK_IMAGE_USAGE_TRANSFER_SRC_BIT,
            VK_IMAGE_ASPECT_DEPTH_BIT | VK_IMAGE_ASPECT_STENCIL_BIT,
            target.DepthStencilImage,
            target.DepthStencilImageMemory,
            target.DepthStencilImageView))
    {
        destroyFaithfulRasterProductSlot(target);
        return false;
    }
    if (!createImageView(
            target.DepthStencilImage,
            GraphicsDepthStencilFormat,
            VK_IMAGE_ASPECT_DEPTH_BIT,
            target.DepthStencilDepthImageView))
    {
        destroyFaithfulRasterProductSlot(target);
        return false;
    }

    std::array<VkImageView, 3> rasterAttachments = {
        target.ColorImageView,
        target.AttrImageView,
        target.DepthStencilImageView,
    };
    VkFramebufferCreateInfo rasterFramebufferCreateInfo{};
    rasterFramebufferCreateInfo.sType = VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO;
    rasterFramebufferCreateInfo.renderPass = GraphicsRasterRenderPass;
    rasterFramebufferCreateInfo.attachmentCount = static_cast<u32>(rasterAttachments.size());
    rasterFramebufferCreateInfo.pAttachments = rasterAttachments.data();
    rasterFramebufferCreateInfo.width = width;
    rasterFramebufferCreateInfo.height = height;
    rasterFramebufferCreateInfo.layers = 1;
    if (vkCreateFramebuffer(Device, &rasterFramebufferCreateInfo, nullptr, &target.RasterFramebuffer) != VK_SUCCESS)
    {
        destroyFaithfulRasterProductSlot(target);
        return false;
    }
    rasterFramebufferCreateInfo.renderPass = GraphicsRasterLoadRenderPass;
    if (vkCreateFramebuffer(Device, &rasterFramebufferCreateInfo, nullptr, &target.RasterLoadFramebuffer) != VK_SUCCESS)
    {
        destroyFaithfulRasterProductSlot(target);
        return false;
    }

    VkFramebufferCreateInfo colorOnlyFramebufferCreateInfo{};
    colorOnlyFramebufferCreateInfo.sType = VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO;
    colorOnlyFramebufferCreateInfo.renderPass = GraphicsColorOnlyRenderPass;
    colorOnlyFramebufferCreateInfo.attachmentCount = 1;
    colorOnlyFramebufferCreateInfo.pAttachments = &target.ColorImageView;
    colorOnlyFramebufferCreateInfo.width = width;
    colorOnlyFramebufferCreateInfo.height = height;
    colorOnlyFramebufferCreateInfo.layers = 1;
    if (vkCreateFramebuffer(Device, &colorOnlyFramebufferCreateInfo, nullptr, &target.ColorOnlyFramebuffer) != VK_SUCCESS)
    {
        destroyFaithfulRasterProductSlot(target);
        return false;
    }

    VkFramebufferCreateInfo finalFramebufferCreateInfo{};
    finalFramebufferCreateInfo.sType = VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO;
    finalFramebufferCreateInfo.renderPass = GraphicsFinalRenderPass;
    finalFramebufferCreateInfo.attachmentCount = 1;
    finalFramebufferCreateInfo.pAttachments = &target.ColorImageView;
    finalFramebufferCreateInfo.width = width;
    finalFramebufferCreateInfo.height = height;
    finalFramebufferCreateInfo.layers = 1;
    if (vkCreateFramebuffer(Device, &finalFramebufferCreateInfo, nullptr, &target.FinalFramebuffer) != VK_SUCCESS)
    {
        destroyFaithfulRasterProductSlot(target);
        return false;
    }

    target.Width = width;
    target.Height = height;
    target.Initialized = false;
    return true;
}

void VulkanRenderer3D::destroyFaithfulRasterProductSlot(FaithfulRasterProductSlot& target)
{
    if (Device == VK_NULL_HANDLE)
    {
        target = FaithfulRasterProductSlot{};
        return;
    }

    if (target.FinalFramebuffer != VK_NULL_HANDLE)
        vkDestroyFramebuffer(Device, target.FinalFramebuffer, nullptr);
    if (target.ColorOnlyFramebuffer != VK_NULL_HANDLE)
        vkDestroyFramebuffer(Device, target.ColorOnlyFramebuffer, nullptr);
    if (target.RasterLoadFramebuffer != VK_NULL_HANDLE)
        vkDestroyFramebuffer(Device, target.RasterLoadFramebuffer, nullptr);
    if (target.RasterFramebuffer != VK_NULL_HANDLE)
        vkDestroyFramebuffer(Device, target.RasterFramebuffer, nullptr);
    if (target.DepthStencilDepthImageView != VK_NULL_HANDLE)
        vkDestroyImageView(Device, target.DepthStencilDepthImageView, nullptr);
    if (target.DepthStencilImageView != VK_NULL_HANDLE)
        vkDestroyImageView(Device, target.DepthStencilImageView, nullptr);
    if (target.DepthStencilImage != VK_NULL_HANDLE)
        vkDestroyImage(Device, target.DepthStencilImage, nullptr);
    if (target.DepthStencilImageMemory != VK_NULL_HANDLE)
        vkFreeMemory(Device, target.DepthStencilImageMemory, nullptr);
    if (target.AttrImageView != VK_NULL_HANDLE)
        vkDestroyImageView(Device, target.AttrImageView, nullptr);
    if (target.AttrImage != VK_NULL_HANDLE)
        vkDestroyImage(Device, target.AttrImage, nullptr);
    if (target.AttrImageMemory != VK_NULL_HANDLE)
        vkFreeMemory(Device, target.AttrImageMemory, nullptr);
    if (target.ColorImageView != VK_NULL_HANDLE)
        vkDestroyImageView(Device, target.ColorImageView, nullptr);
    if (target.ColorImage != VK_NULL_HANDLE)
        vkDestroyImage(Device, target.ColorImage, nullptr);
    if (target.ColorImageMemory != VK_NULL_HANDLE)
        vkFreeMemory(Device, target.ColorImageMemory, nullptr);
    if (target.RasterColorImageView != VK_NULL_HANDLE)
        vkDestroyImageView(Device, target.RasterColorImageView, nullptr);
    if (target.RasterColorImage != VK_NULL_HANDLE)
        vkDestroyImage(Device, target.RasterColorImage, nullptr);
    if (target.RasterColorImageMemory != VK_NULL_HANDLE)
        vkFreeMemory(Device, target.RasterColorImageMemory, nullptr);

    target = FaithfulRasterProductSlot{};
}

bool VulkanRenderer3D::ensureTriangleBuffer(RenderContext* context, size_t triangleCount)
{
    static_assert(sizeof(TriangleGpu) == 120, "TriangleGpu layout must match std430 shader struct");
    VkBuffer& triangleBuffer = context != nullptr ? context->TriangleBuffer : TriangleBuffer;
    VkDeviceMemory& triangleMemory = context != nullptr ? context->TriangleMemory : TriangleMemory;
    VkDeviceSize& triangleBufferSize = context != nullptr ? context->TriangleBufferSize : TriangleBufferSize;
    void*& triangleMapped = context != nullptr ? context->TriangleMapped : TriangleMapped;
    const size_t requiredTriangleCount = std::max<size_t>(1, triangleCount);
    const VkDeviceSize requiredSize = static_cast<VkDeviceSize>(requiredTriangleCount * sizeof(TriangleGpu));
    if (triangleBuffer != VK_NULL_HANDLE && triangleBufferSize >= requiredSize)
    {
        return true;
    }

    destroyTriangleBuffer(context);

    if (!createBufferAllocation(
            Device,
            [&](u32 typeBits, VkMemoryPropertyFlags properties) { return findMemoryType(typeBits, properties); },
            requiredSize,
            VK_BUFFER_USAGE_STORAGE_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_SRC_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT,
            VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT | VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            triangleBuffer,
            triangleMemory,
            &triangleMapped))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate triangle buffer");
        destroyTriangleBuffer(context);
        return false;
    }

    triangleBufferSize = requiredSize;
    return true;
}

void VulkanRenderer3D::destroyTriangleBuffer(RenderContext* context)
{

    VkBuffer& triangleBuffer = context != nullptr ? context->TriangleBuffer : TriangleBuffer;
    VkDeviceMemory& triangleMemory = context != nullptr ? context->TriangleMemory : TriangleMemory;
    VkDeviceSize& triangleBufferSize = context != nullptr ? context->TriangleBufferSize : TriangleBufferSize;
    void*& triangleMapped = context != nullptr ? context->TriangleMapped : TriangleMapped;

    if (triangleMapped != nullptr)
    {
        vkUnmapMemory(Device, triangleMemory);
        triangleMapped = nullptr;
    }

    if (triangleBuffer != VK_NULL_HANDLE)
    {
        vkDestroyBuffer(Device, triangleBuffer, nullptr);
        triangleBuffer = VK_NULL_HANDLE;
    }

    if (triangleMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, triangleMemory, nullptr);
        triangleMemory = VK_NULL_HANDLE;
    }

    triangleBufferSize = 0;
}

bool VulkanRenderer3D::ensureGraphicsVertexBuffer(RenderContext* context, size_t vertexCount)
{
    static_assert(sizeof(GraphicsVertexGpu) == 64u, "GraphicsVertexGpu layout must match vertex shader inputs");
    static_assert(offsetof(GraphicsVertexGpu, x) == 0u, "GraphicsVertexGpu.x offset mismatch");
    static_assert(offsetof(GraphicsVertexGpu, u) == 16u, "GraphicsVertexGpu.u offset mismatch");
    static_assert(offsetof(GraphicsVertexGpu, colorRgba8) == 24u, "GraphicsVertexGpu.colorRgba8 offset mismatch");
    static_assert(offsetof(GraphicsVertexGpu, flags) == 28u, "GraphicsVertexGpu.flags offset mismatch");
    static_assert(offsetof(GraphicsVertexGpu, texHeight) == 44u, "GraphicsVertexGpu.texHeight offset mismatch");
    static_assert(offsetof(GraphicsVertexGpu, texcoordBounds) == 56u, "GraphicsVertexGpu.texcoordBounds offset mismatch");
    VkBuffer& graphicsVertexBuffer = context != nullptr ? context->GraphicsVertexBuffer : GraphicsVertexBuffer;
    VkDeviceMemory& graphicsVertexMemory = context != nullptr ? context->GraphicsVertexMemory : GraphicsVertexMemory;
    VkDeviceSize& graphicsVertexBufferSize = context != nullptr ? context->GraphicsVertexBufferSize : GraphicsVertexBufferSize;
    void*& graphicsVertexMapped = context != nullptr ? context->GraphicsVertexMapped : GraphicsVertexMapped;
    const size_t requiredVertexCount = std::max<size_t>(1, vertexCount);

    const VkDeviceSize requiredSize = static_cast<VkDeviceSize>(requiredVertexCount * sizeof(GraphicsVertexGpu))
        * (context == nullptr ? 2u : 1u);
    if (graphicsVertexBuffer != VK_NULL_HANDLE && graphicsVertexBufferSize >= requiredSize)
        return true;

    destroyGraphicsVertexBuffer(context);

    if (!createBufferAllocation(
            Device,
            [&](u32 typeBits, VkMemoryPropertyFlags properties) { return findMemoryType(typeBits, properties); },
            requiredSize,
            VK_BUFFER_USAGE_VERTEX_BUFFER_BIT,
            VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT | VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            graphicsVertexBuffer,
            graphicsVertexMemory,
            &graphicsVertexMapped))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate graphics vertex buffer");
        destroyGraphicsVertexBuffer(context);
        return false;
    }

    graphicsVertexBufferSize = requiredSize;
    return true;
}

void VulkanRenderer3D::destroyGraphicsVertexBuffer(RenderContext* context)
{
    VkBuffer& graphicsVertexBuffer = context != nullptr ? context->GraphicsVertexBuffer : GraphicsVertexBuffer;
    VkDeviceMemory& graphicsVertexMemory = context != nullptr ? context->GraphicsVertexMemory : GraphicsVertexMemory;
    VkDeviceSize& graphicsVertexBufferSize = context != nullptr ? context->GraphicsVertexBufferSize : GraphicsVertexBufferSize;
    void*& graphicsVertexMapped = context != nullptr ? context->GraphicsVertexMapped : GraphicsVertexMapped;

    if (graphicsVertexMapped != nullptr)
    {
        vkUnmapMemory(Device, graphicsVertexMemory);
        graphicsVertexMapped = nullptr;
    }

    if (graphicsVertexBuffer != VK_NULL_HANDLE)
    {
        vkDestroyBuffer(Device, graphicsVertexBuffer, nullptr);
        graphicsVertexBuffer = VK_NULL_HANDLE;
    }

    if (graphicsVertexMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, graphicsVertexMemory, nullptr);
        graphicsVertexMemory = VK_NULL_HANDLE;
    }

    graphicsVertexBufferSize = 0;
}

bool VulkanRenderer3D::ensureGraphicsSceneVertexBuffer(size_t vertexCount, RenderContext* context)
{
    static_assert(sizeof(GraphicsVertexGpu) == 64u, "GraphicsVertexGpu layout must match vertex shader inputs");
    VkBuffer& graphicsSceneVertexBuffer = context != nullptr
        ? context->GraphicsSceneVertexBuffer : GraphicsSceneVertexBuffer;
    VkDeviceMemory& graphicsSceneVertexMemory = context != nullptr
        ? context->GraphicsSceneVertexMemory : GraphicsSceneVertexMemory;
    VkDeviceSize& graphicsSceneVertexBufferSize = context != nullptr
        ? context->GraphicsSceneVertexBufferSize : GraphicsSceneVertexBufferSize;
    void*& graphicsSceneVertexMapped = context != nullptr
        ? context->GraphicsSceneVertexMapped : GraphicsSceneVertexMapped;
    const size_t requiredVertexCount = std::max<size_t>(1, vertexCount);

    const VkDeviceSize requiredSize = static_cast<VkDeviceSize>(requiredVertexCount * sizeof(GraphicsVertexGpu))
        * (context == nullptr ? 2u : 1u);
    if (graphicsSceneVertexBuffer != VK_NULL_HANDLE && graphicsSceneVertexBufferSize >= requiredSize)
        return true;

    destroyGraphicsSceneVertexBuffer(context);

    if (!createBufferAllocation(
            Device,
            [&](u32 typeBits, VkMemoryPropertyFlags properties) { return findMemoryType(typeBits, properties); },
            requiredSize,
            VK_BUFFER_USAGE_VERTEX_BUFFER_BIT,
            VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT | VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            graphicsSceneVertexBuffer,
            graphicsSceneVertexMemory,
            &graphicsSceneVertexMapped))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate graphics scene vertex buffer");
        destroyGraphicsSceneVertexBuffer(context);
        return false;
    }

    graphicsSceneVertexBufferSize = requiredSize;
    return true;
}

void VulkanRenderer3D::destroyGraphicsSceneVertexBuffer(RenderContext* context)
{
    VkBuffer& graphicsSceneVertexBuffer = context != nullptr
        ? context->GraphicsSceneVertexBuffer : GraphicsSceneVertexBuffer;
    VkDeviceMemory& graphicsSceneVertexMemory = context != nullptr
        ? context->GraphicsSceneVertexMemory : GraphicsSceneVertexMemory;
    VkDeviceSize& graphicsSceneVertexBufferSize = context != nullptr
        ? context->GraphicsSceneVertexBufferSize : GraphicsSceneVertexBufferSize;
    void*& graphicsSceneVertexMapped = context != nullptr
        ? context->GraphicsSceneVertexMapped : GraphicsSceneVertexMapped;
    if (graphicsSceneVertexMapped != nullptr)
    {
        vkUnmapMemory(Device, graphicsSceneVertexMemory);
        graphicsSceneVertexMapped = nullptr;
    }

    if (graphicsSceneVertexBuffer != VK_NULL_HANDLE)
    {
        vkDestroyBuffer(Device, graphicsSceneVertexBuffer, nullptr);
        graphicsSceneVertexBuffer = VK_NULL_HANDLE;
    }

    if (graphicsSceneVertexMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, graphicsSceneVertexMemory, nullptr);
        graphicsSceneVertexMemory = VK_NULL_HANDLE;
    }

    graphicsSceneVertexBufferSize = 0;
}

bool VulkanRenderer3D::ensureGraphicsEdgeIndexBuffer(size_t indexCount, RenderContext* context)
{
    VkBuffer& graphicsEdgeIndexBuffer = context != nullptr
        ? context->GraphicsEdgeIndexBuffer : GraphicsEdgeIndexBuffer;
    VkDeviceMemory& graphicsEdgeIndexMemory = context != nullptr
        ? context->GraphicsEdgeIndexMemory : GraphicsEdgeIndexMemory;
    VkDeviceSize& graphicsEdgeIndexBufferSize = context != nullptr
        ? context->GraphicsEdgeIndexBufferSize : GraphicsEdgeIndexBufferSize;
    void*& graphicsEdgeIndexMapped = context != nullptr
        ? context->GraphicsEdgeIndexMapped : GraphicsEdgeIndexMapped;
    const size_t requiredIndexCount = std::max<size_t>(1, indexCount);

    const VkDeviceSize requiredSize = static_cast<VkDeviceSize>(requiredIndexCount * sizeof(u16))
        * (context == nullptr ? 2u : 1u);
    if (graphicsEdgeIndexBuffer != VK_NULL_HANDLE && graphicsEdgeIndexBufferSize >= requiredSize)
        return true;

    destroyGraphicsEdgeIndexBuffer(context);

    if (!createBufferAllocation(
            Device,
            [&](u32 typeBits, VkMemoryPropertyFlags properties) { return findMemoryType(typeBits, properties); },
            requiredSize,
            VK_BUFFER_USAGE_INDEX_BUFFER_BIT,
            VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT | VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            graphicsEdgeIndexBuffer,
            graphicsEdgeIndexMemory,
            &graphicsEdgeIndexMapped))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate graphics edge index buffer");
        destroyGraphicsEdgeIndexBuffer(context);
        return false;
    }

    graphicsEdgeIndexBufferSize = requiredSize;
    return true;
}

void VulkanRenderer3D::destroyGraphicsEdgeIndexBuffer(RenderContext* context)
{
    VkBuffer& graphicsEdgeIndexBuffer = context != nullptr
        ? context->GraphicsEdgeIndexBuffer : GraphicsEdgeIndexBuffer;
    VkDeviceMemory& graphicsEdgeIndexMemory = context != nullptr
        ? context->GraphicsEdgeIndexMemory : GraphicsEdgeIndexMemory;
    VkDeviceSize& graphicsEdgeIndexBufferSize = context != nullptr
        ? context->GraphicsEdgeIndexBufferSize : GraphicsEdgeIndexBufferSize;
    void*& graphicsEdgeIndexMapped = context != nullptr
        ? context->GraphicsEdgeIndexMapped : GraphicsEdgeIndexMapped;
    if (graphicsEdgeIndexMapped != nullptr)
    {
        vkUnmapMemory(Device, graphicsEdgeIndexMemory);
        graphicsEdgeIndexMapped = nullptr;
    }

    if (graphicsEdgeIndexBuffer != VK_NULL_HANDLE)
    {
        vkDestroyBuffer(Device, graphicsEdgeIndexBuffer, nullptr);
        graphicsEdgeIndexBuffer = VK_NULL_HANDLE;
    }

    if (graphicsEdgeIndexMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, graphicsEdgeIndexMemory, nullptr);
        graphicsEdgeIndexMemory = VK_NULL_HANDLE;
    }

    graphicsEdgeIndexBufferSize = 0;
}

bool VulkanRenderer3D::ensureToonBuffer(RenderContext* context)
{
    VkBuffer& toonBuffer = context != nullptr ? context->ToonBuffer : ToonBuffer;
    VkDeviceMemory& toonMemory = context != nullptr ? context->ToonMemory : ToonMemory;
    VkDeviceSize& toonBufferSize = context != nullptr ? context->ToonBufferSize : ToonBufferSize;
    void*& toonMapped = context != nullptr ? context->ToonMapped : ToonMapped;
    const VkDeviceSize requiredSize = static_cast<VkDeviceSize>(ToonTableEntryCount) * sizeof(u32);
    if (toonBuffer != VK_NULL_HANDLE && toonBufferSize >= requiredSize)
    {
        return true;
    }

    destroyToonBuffer(context);

    if (!createBufferAllocation(
            Device,
            [&](u32 typeBits, VkMemoryPropertyFlags properties) { return findMemoryType(typeBits, properties); },
            requiredSize,
            VK_BUFFER_USAGE_STORAGE_BUFFER_BIT,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            toonBuffer,
            toonMemory,
            &toonMapped))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate toon buffer");
        destroyToonBuffer(context);
        return false;
    }

    toonBufferSize = requiredSize;
    return true;
}

void VulkanRenderer3D::destroyToonBuffer(RenderContext* context)
{

    VkBuffer& toonBuffer = context != nullptr ? context->ToonBuffer : ToonBuffer;
    VkDeviceMemory& toonMemory = context != nullptr ? context->ToonMemory : ToonMemory;
    VkDeviceSize& toonBufferSize = context != nullptr ? context->ToonBufferSize : ToonBufferSize;
    void*& toonMapped = context != nullptr ? context->ToonMapped : ToonMapped;

    if (toonMapped != nullptr)
    {
        vkUnmapMemory(Device, toonMemory);
        toonMapped = nullptr;
    }

    if (toonBuffer != VK_NULL_HANDLE)
    {
        vkDestroyBuffer(Device, toonBuffer, nullptr);
        toonBuffer = VK_NULL_HANDLE;
    }

    if (toonMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, toonMemory, nullptr);
        toonMemory = VK_NULL_HANDLE;
    }

    toonBufferSize = 0;
}

bool VulkanRenderer3D::updateToonBuffer(RenderContext* context, const u16* toonTable)
{
    const VkBuffer toonBuffer = context != nullptr ? context->ToonBuffer : ToonBuffer;
    const VkDeviceMemory toonMemory = context != nullptr ? context->ToonMemory : ToonMemory;
    const void* toonMapped = context != nullptr ? context->ToonMapped : ToonMapped;

    if (toonBuffer == VK_NULL_HANDLE || toonMemory == VK_NULL_HANDLE || toonMapped == nullptr)
        return false;

    u32* packedToon = reinterpret_cast<u32*>(const_cast<void*>(toonMapped));
    for (u32 i = 0; i < ToonTableEntryCount; i++)
    {
        const u32 toonColor = toonTable != nullptr ? static_cast<u32>(toonTable[i]) : 0u;
        u32 r = (toonColor << 1u) & 0x3Eu;
        u32 g = (toonColor >> 4u) & 0x3Eu;
        u32 b = (toonColor >> 9u) & 0x3Eu;
        if (r) r++;
        if (g) g++;
        if (b) b++;
        packedToon[i] = (r & 0x3Fu) | ((g & 0x3Fu) << 8u) | ((b & 0x3Fu) << 16u);
    }

    return true;
}

bool VulkanRenderer3D::ensureGraphicsClearBuffer(RenderContext* context)
{
    VkBuffer& clearBuffer = context != nullptr ? context->ClearBuffer : ClearBuffer;
    VkDeviceMemory& clearMemory = context != nullptr ? context->ClearMemory : ClearMemory;
    VkDeviceSize& clearBufferSize = context != nullptr ? context->ClearBufferSize : ClearBufferSize;
    void*& clearMapped = context != nullptr ? context->ClearMapped : ClearMapped;
    constexpr VkDeviceSize requiredSize = static_cast<VkDeviceSize>(256u * 192u * 3u) * sizeof(u32);

    if (clearBuffer != VK_NULL_HANDLE && clearBufferSize >= requiredSize && clearMapped != nullptr)
    {
        updateGraphicsDescriptorSet(context);
        return true;
    }

    destroyGraphicsClearBuffer(context);

    if (!createBufferAllocation(
            Device,
            [&](u32 typeBits, VkMemoryPropertyFlags properties) { return findMemoryType(typeBits, properties); },
            requiredSize,
            VK_BUFFER_USAGE_STORAGE_BUFFER_BIT,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            clearBuffer,
            clearMemory,
            &clearMapped))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate graphics clear buffer");
        destroyGraphicsClearBuffer(context);
        return false;
    }

    clearBufferSize = requiredSize;
    updateGraphicsDescriptorSet(context);
    return true;
}

void VulkanRenderer3D::destroyGraphicsClearBuffer(RenderContext* context)
{
    if (context != nullptr)
        invalidateGraphicsDescriptorSetCache(context);
    else
        invalidateAllGraphicsDescriptorSetCaches();

    VkBuffer& clearBuffer = context != nullptr ? context->ClearBuffer : ClearBuffer;
    VkDeviceMemory& clearMemory = context != nullptr ? context->ClearMemory : ClearMemory;
    VkDeviceSize& clearBufferSize = context != nullptr ? context->ClearBufferSize : ClearBufferSize;
    void*& clearMapped = context != nullptr ? context->ClearMapped : ClearMapped;

    if (clearMapped != nullptr && clearMemory != VK_NULL_HANDLE)
    {
        vkUnmapMemory(Device, clearMemory);
        clearMapped = nullptr;
    }

    if (clearBuffer != VK_NULL_HANDLE)
    {
        vkDestroyBuffer(Device, clearBuffer, nullptr);
        clearBuffer = VK_NULL_HANDLE;
    }

    if (clearMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, clearMemory, nullptr);
        clearMemory = VK_NULL_HANDLE;
    }

    clearBufferSize = 0;
}

bool VulkanRenderer3D::updateGraphicsClearBuffer(RenderContext* context, const GPU& gpu)
{
    const void* clearMapped = context != nullptr ? context->ClearMapped : ClearMapped;
    const VkBuffer clearBuffer = context != nullptr ? context->ClearBuffer : ClearBuffer;
    const VkDeviceMemory clearMemory = context != nullptr ? context->ClearMemory : ClearMemory;

    if (clearBuffer == VK_NULL_HANDLE || clearMemory == VK_NULL_HANDLE || clearMapped == nullptr)
        return false;

    u32* clearWords = reinterpret_cast<u32*>(const_cast<void*>(clearMapped));
    constexpr size_t clearPixelCount = 256u * 192u;
    u32* clearColorWords = clearWords;
    u32* clearAttrWords = clearWords + clearPixelCount;
    u32* clearDepthWords = clearWords + (clearPixelCount * 2u);

    const u32 clearAttr1 = gpu.GPU3D.RenderClearAttr1;
    const u32 clearAttr2 = gpu.GPU3D.RenderClearAttr2;
    const u32 clearPolyId = (clearAttr1 >> 24u) & 0x3Fu;
    const u32 clearFogFlag = (clearAttr1 >> 15u) & 0x1u;
    const u32 clearColor = Debug3dClearMagenta ? 0xFFFF00FFu : buildClearColorRgba8(gpu);
    const u32 clearDepth = ((clearAttr2 & 0x7FFFu) * 0x200u) + 0x1FFu;
    const u32 clearPolyIdByte = ((clearPolyId * 255u) + 31u) / 63u;

    const u32 clearFogByte = clearFogFlag != 0u ? 0x80u : 0u;
    const u32 plainAttr = clearPolyIdByte | (clearFogByte << 8u) | 0xFF000000u;
    const u32 clearDepthBits = BitCastFloatToU32(static_cast<float>(clearDepth) * (1.0f / 16777215.0f));

    if ((gpu.GPU3D.RenderDispCnt & (1u << 14u)) == 0u)
    {
        std::fill_n(clearColorWords, clearPixelCount, clearColor);
        std::fill_n(clearAttrWords, clearPixelCount, plainAttr);
        std::fill_n(clearDepthWords, clearPixelCount, clearDepthBits);
        return true;
    }

    u8 baseXOff = (clearAttr2 >> 16u) & 0xFFu;
    u8 yOff = (clearAttr2 >> 24u) & 0xFFu;

    for (u32 y = 0; y < 192u; y++)
    {
        u8 xOff = baseXOff;
        for (u32 x = 0; x < 256u; x++)
        {
            const size_t offset = static_cast<size_t>(y) * 256u + x;
            const u16 colorSource = gpu.ReadVRAMFlat_Texture<u16>(0x40000u + (static_cast<u32>(yOff) << 9u) + (static_cast<u32>(xOff) << 1u));
            const u16 depthSource = gpu.ReadVRAMFlat_Texture<u16>(0x60000u + (static_cast<u32>(yOff) << 9u) + (static_cast<u32>(xOff) << 1u));

            u32 r = (static_cast<u32>(colorSource) << 1u) & 0x3Eu;
            u32 g = (static_cast<u32>(colorSource) >> 4u) & 0x3Eu;
            u32 b = (static_cast<u32>(colorSource) >> 9u) & 0x3Eu;
            if (r) r++;
            if (g) g++;
            if (b) b++;
            const u32 a = (colorSource & 0x8000u) != 0u ? 0x1Fu : 0u;

            const u32 r8 = (r << 2u) | (r >> 4u);
            const u32 g8 = (g << 2u) | (g >> 4u);
            const u32 b8 = (b << 2u) | (b >> 4u);
            const u32 a8 = (a << 3u) | (a >> 2u);
            clearColorWords[offset] = Debug3dClearMagenta ? 0xFFFF00FFu : (r8 | (g8 << 8u) | (b8 << 16u) | (a8 << 24u));

            const u32 fogByte = (depthSource & 0x8000u) != 0u ? 0x80u : 0u;
            clearAttrWords[offset] = clearPolyIdByte | (fogByte << 8u) | 0xFF000000u;

            const u32 pixelDepth = ((static_cast<u32>(depthSource & 0x7FFFu)) * 0x200u) + 0x1FFu;
            clearDepthWords[offset] = BitCastFloatToU32(static_cast<float>(pixelDepth) * (1.0f / 16777215.0f));

            xOff++;
        }

        yOff++;
    }

    return true;
}

bool VulkanRenderer3D::ensureCaptureLineBuffer(RenderContext* context)
{
    if (context == nullptr)
        syncActiveCaptureLineBufferSlot();

    VkBuffer& captureLineBuffer = context != nullptr ? context->CaptureLineBuffer : CaptureLineBuffer;
    VkDeviceMemory& captureLineMemory = context != nullptr ? context->CaptureLineMemory : CaptureLineMemory;
    VkDeviceSize& captureLineBufferSize = context != nullptr ? context->CaptureLineBufferSize : CaptureLineBufferSize;
    void*& captureLineMapped = context != nullptr ? context->CaptureLineMapped : CaptureLineMapped;
    constexpr VkDeviceSize requiredSize = static_cast<VkDeviceSize>(256u * 192u) * sizeof(u32);

    if (captureLineBuffer != VK_NULL_HANDLE && captureLineBufferSize >= requiredSize && captureLineMapped != nullptr)
    {
        return true;
    }

    destroyCaptureLineBuffer(context);

    if (!createBufferAllocation(
            Device,
            [&](u32 typeBits, VkMemoryPropertyFlags properties) { return findMemoryType(typeBits, properties); },
            requiredSize,
            VK_BUFFER_USAGE_STORAGE_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT,
            captureLineBuffer,
            captureLineMemory,
            &captureLineMapped))
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate capture line buffer");
        destroyCaptureLineBuffer(context);
        return false;
    }

    std::memset(captureLineMapped, 0, static_cast<size_t>(requiredSize));
    captureLineBufferSize = requiredSize;
    if (context == nullptr)
        storeActiveCaptureLineBufferSlot();
    return true;
}

void VulkanRenderer3D::destroyCaptureLineBuffer(RenderContext* context)
{

    VkBuffer& captureLineBuffer = context != nullptr ? context->CaptureLineBuffer : CaptureLineBuffer;
    VkDeviceMemory& captureLineMemory = context != nullptr ? context->CaptureLineMemory : CaptureLineMemory;
    VkDeviceSize& captureLineBufferSize = context != nullptr ? context->CaptureLineBufferSize : CaptureLineBufferSize;
    void*& captureLineMapped = context != nullptr ? context->CaptureLineMapped : CaptureLineMapped;

    if (captureLineMapped != nullptr && captureLineMemory != VK_NULL_HANDLE)
    {
        vkUnmapMemory(Device, captureLineMemory);
        captureLineMapped = nullptr;
    }

    if (captureLineBuffer != VK_NULL_HANDLE)
    {
        vkDestroyBuffer(Device, captureLineBuffer, nullptr);
        captureLineBuffer = VK_NULL_HANDLE;
    }

    if (captureLineMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, captureLineMemory, nullptr);
        captureLineMemory = VK_NULL_HANDLE;
    }

    captureLineBufferSize = 0;

    if (context == nullptr)
    {
        storeActiveCaptureLineBufferSlot();
        resetCaptureLineState();
    }
}

void VulkanRenderer3D::destroyAllCaptureLineBuffers()
{
    const u32 previousSlot = ActiveCaptureLineBufferSlot;
    for (u32 slot = 0; slot < CaptureLineBufferSlotCount; slot++)
    {
        selectActiveCaptureLineBufferSlot(slot);
        destroyCaptureLineBuffer(nullptr);
    }
    ActiveCaptureLineBufferSlot = std::min<u32>(previousSlot, CaptureLineBufferSlotCount - 1u);
    syncActiveCaptureLineBufferSlot();
    resetCaptureLineState();
}

bool VulkanRenderer3D::createFallbackTexture()
{
    destroyFallbackTexture();
    const bool usesNormalizedTextureDescriptors =
        getTextureDescriptorPolicy().UsesNormalizedTextureDescriptors;

    VkImageCreateInfo imageCreateInfo{};
    imageCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO;
    imageCreateInfo.flags = usesNormalizedTextureDescriptors
        ? VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT
        : 0u;
    imageCreateInfo.imageType = VK_IMAGE_TYPE_2D;
    imageCreateInfo.format = VK_FORMAT_R8G8B8A8_UINT;
    imageCreateInfo.extent.width = 1;
    imageCreateInfo.extent.height = 1;
    imageCreateInfo.extent.depth = 1;
    imageCreateInfo.mipLevels = 1;
    imageCreateInfo.arrayLayers = 1;
    imageCreateInfo.samples = VK_SAMPLE_COUNT_1_BIT;
    imageCreateInfo.tiling = VK_IMAGE_TILING_OPTIMAL;
    imageCreateInfo.usage = VK_IMAGE_USAGE_TRANSFER_DST_BIT | VK_IMAGE_USAGE_SAMPLED_BIT;
    imageCreateInfo.sharingMode = VK_SHARING_MODE_EXCLUSIVE;
    imageCreateInfo.initialLayout = VK_IMAGE_LAYOUT_UNDEFINED;
    if (vkCreateImage(Device, &imageCreateInfo, nullptr, &FallbackTextureImage) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create fallback texture image");
        return false;
    }

    VkMemoryRequirements imageRequirements{};
    vkGetImageMemoryRequirements(Device, FallbackTextureImage, &imageRequirements);

    VkMemoryAllocateInfo imageMemoryAllocateInfo{};
    imageMemoryAllocateInfo.sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
    imageMemoryAllocateInfo.allocationSize = imageRequirements.size;
    imageMemoryAllocateInfo.memoryTypeIndex = findMemoryType(imageRequirements.memoryTypeBits, VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT);
    if (imageMemoryAllocateInfo.memoryTypeIndex == UINT32_MAX)
        imageMemoryAllocateInfo.memoryTypeIndex = findMemoryType(imageRequirements.memoryTypeBits, 0);
    if (imageMemoryAllocateInfo.memoryTypeIndex == UINT32_MAX
        || vkAllocateMemory(Device, &imageMemoryAllocateInfo, nullptr, &FallbackTextureMemory) != VK_SUCCESS
        || vkBindImageMemory(Device, FallbackTextureImage, FallbackTextureMemory, 0) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate fallback texture memory");
        destroyFallbackTexture();
        return false;
    }

    VkImageViewCreateInfo imageViewCreateInfo{};
    imageViewCreateInfo.sType = VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO;
    imageViewCreateInfo.image = FallbackTextureImage;
    imageViewCreateInfo.viewType = VK_IMAGE_VIEW_TYPE_2D_ARRAY;
    imageViewCreateInfo.format = VK_FORMAT_R8G8B8A8_UINT;
    imageViewCreateInfo.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    imageViewCreateInfo.subresourceRange.baseMipLevel = 0;
    imageViewCreateInfo.subresourceRange.levelCount = 1;
    imageViewCreateInfo.subresourceRange.baseArrayLayer = 0;
    imageViewCreateInfo.subresourceRange.layerCount = 1;
    if (vkCreateImageView(Device, &imageViewCreateInfo, nullptr, &FallbackTextureView) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create fallback texture view");
        destroyFallbackTexture();
        return false;
    }
    if (usesNormalizedTextureDescriptors)
    {
        imageViewCreateInfo.format = VK_FORMAT_R8G8B8A8_UNORM;
        if (vkCreateImageView(
                Device,
                &imageViewCreateInfo,
                nullptr,
                &FallbackTextureNormalizedView) != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: failed to create fallback normalized texture view");
            destroyFallbackTexture();
            return false;
        }
    }

    VkSamplerCreateInfo samplerCreateInfo{};
    samplerCreateInfo.sType = VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO;
    samplerCreateInfo.magFilter = VK_FILTER_NEAREST;
    samplerCreateInfo.minFilter = VK_FILTER_NEAREST;
    samplerCreateInfo.mipmapMode = VK_SAMPLER_MIPMAP_MODE_NEAREST;
    samplerCreateInfo.addressModeU = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
    samplerCreateInfo.addressModeV = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
    samplerCreateInfo.addressModeW = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
    samplerCreateInfo.anisotropyEnable = VK_FALSE;
    samplerCreateInfo.maxAnisotropy = 1.0f;
    samplerCreateInfo.compareEnable = VK_FALSE;
    samplerCreateInfo.minLod = 0.0f;
    samplerCreateInfo.maxLod = 0.0f;
    samplerCreateInfo.borderColor = VK_BORDER_COLOR_INT_OPAQUE_BLACK;
    samplerCreateInfo.unnormalizedCoordinates = VK_FALSE;
    if (vkCreateSampler(Device, &samplerCreateInfo, nullptr, &FallbackTextureSampler) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create fallback texture sampler");
        destroyFallbackTexture();
        return false;
    }

    if (usesNormalizedTextureDescriptors)
    {
        const std::array<VkSamplerAddressMode, 3> wrapAddressModes = {
            VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE,
            VK_SAMPLER_ADDRESS_MODE_REPEAT,
            VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT,
        };
        for (u32 tMode = 0; tMode < 3u; tMode++)
        {
            for (u32 sMode = 0; sMode < 3u; sMode++)
            {
                samplerCreateInfo.addressModeU = wrapAddressModes[sMode];
                samplerCreateInfo.addressModeV = wrapAddressModes[tMode];
                samplerCreateInfo.addressModeW = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
                VkSampler& sampler = TextureWrapSamplers[sMode + (tMode * 3u)];
                if (vkCreateSampler(Device, &samplerCreateInfo, nullptr, &sampler) != VK_SUCCESS)
                {
                    Log(LogLevel::Error, "VulkanRenderer3D: failed to create texture wrap sampler");
                    destroyFallbackTexture();
                    return false;
                }
            }
        }
    }

    VkBufferCreateInfo stagingCreateInfo{};
    stagingCreateInfo.sType = VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO;
    stagingCreateInfo.size = sizeof(u32);
    stagingCreateInfo.usage = VK_BUFFER_USAGE_TRANSFER_SRC_BIT;
    stagingCreateInfo.sharingMode = VK_SHARING_MODE_EXCLUSIVE;
    if (vkCreateBuffer(Device, &stagingCreateInfo, nullptr, &FallbackTextureStagingBuffer) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create fallback staging buffer");
        destroyFallbackTexture();
        return false;
    }

    VkMemoryRequirements stagingRequirements{};
    vkGetBufferMemoryRequirements(Device, FallbackTextureStagingBuffer, &stagingRequirements);

    VkMemoryAllocateInfo stagingMemoryAllocateInfo{};
    stagingMemoryAllocateInfo.sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
    stagingMemoryAllocateInfo.allocationSize = stagingRequirements.size;
    stagingMemoryAllocateInfo.memoryTypeIndex = findMemoryType(
        stagingRequirements.memoryTypeBits,
        VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT
    );
    if (stagingMemoryAllocateInfo.memoryTypeIndex == UINT32_MAX
        || vkAllocateMemory(Device, &stagingMemoryAllocateInfo, nullptr, &FallbackTextureStagingMemory) != VK_SUCCESS
        || vkBindBufferMemory(Device, FallbackTextureStagingBuffer, FallbackTextureStagingMemory, 0) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate fallback staging memory");
        destroyFallbackTexture();
        return false;
    }

    void* mappedMemory = nullptr;
    if (vkMapMemory(Device, FallbackTextureStagingMemory, 0, sizeof(u32), 0, &mappedMemory) != VK_SUCCESS)
    {
        destroyFallbackTexture();
        return false;
    }

    *reinterpret_cast<u32*>(mappedMemory) = 0x1F3F3F3Fu;
    vkUnmapMemory(Device, FallbackTextureStagingMemory);

    if (vkWaitForFences(Device, 1, &FrameFence, VK_TRUE, kFenceWaitTimeoutNs) != VK_SUCCESS
        || vkResetFences(Device, 1, &FrameFence) != VK_SUCCESS
        || vkResetCommandBuffer(CommandBuffer, 0) != VK_SUCCESS)
    {
        destroyFallbackTexture();
        return false;
    }

    VkCommandBufferBeginInfo beginInfo{};
    beginInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO;
    beginInfo.flags = VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    if (vkBeginCommandBuffer(CommandBuffer, &beginInfo) != VK_SUCCESS)
    {
        destroyFallbackTexture();
        return false;
    }

    VkImageMemoryBarrier toTransferBarrier{};
    toTransferBarrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    toTransferBarrier.srcAccessMask = 0;
    toTransferBarrier.dstAccessMask = VK_ACCESS_TRANSFER_WRITE_BIT;
    toTransferBarrier.oldLayout = VK_IMAGE_LAYOUT_UNDEFINED;
    toTransferBarrier.newLayout = VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL;
    toTransferBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toTransferBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toTransferBarrier.image = FallbackTextureImage;
    toTransferBarrier.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    toTransferBarrier.subresourceRange.baseMipLevel = 0;
    toTransferBarrier.subresourceRange.levelCount = 1;
    toTransferBarrier.subresourceRange.baseArrayLayer = 0;
    toTransferBarrier.subresourceRange.layerCount = 1;
    vkCmdPipelineBarrier(
        CommandBuffer,
        VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        0,
        0,
        nullptr,
        0,
        nullptr,
        1,
        &toTransferBarrier
    );

    VkBufferImageCopy copyRegion{};
    copyRegion.bufferOffset = 0;
    copyRegion.bufferRowLength = 0;
    copyRegion.bufferImageHeight = 0;
    copyRegion.imageSubresource.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    copyRegion.imageSubresource.mipLevel = 0;
    copyRegion.imageSubresource.baseArrayLayer = 0;
    copyRegion.imageSubresource.layerCount = 1;
    copyRegion.imageOffset = {0, 0, 0};
    copyRegion.imageExtent.width = 1;
    copyRegion.imageExtent.height = 1;
    copyRegion.imageExtent.depth = 1;
    vkCmdCopyBufferToImage(
        CommandBuffer,
        FallbackTextureStagingBuffer,
        FallbackTextureImage,
        VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
        1,
        &copyRegion
    );

    VkImageMemoryBarrier toGeneralBarrier{};
    toGeneralBarrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    toGeneralBarrier.srcAccessMask = VK_ACCESS_TRANSFER_WRITE_BIT;
    toGeneralBarrier.dstAccessMask = VK_ACCESS_SHADER_READ_BIT;
    toGeneralBarrier.oldLayout = VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL;
    toGeneralBarrier.newLayout = VK_IMAGE_LAYOUT_GENERAL;
    toGeneralBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toGeneralBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toGeneralBarrier.image = FallbackTextureImage;
    toGeneralBarrier.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    toGeneralBarrier.subresourceRange.baseMipLevel = 0;
    toGeneralBarrier.subresourceRange.levelCount = 1;
    toGeneralBarrier.subresourceRange.baseArrayLayer = 0;
    toGeneralBarrier.subresourceRange.layerCount = 1;
    vkCmdPipelineBarrier(
        CommandBuffer,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT,
        0,
        0,
        nullptr,
        0,
        nullptr,
        1,
        &toGeneralBarrier
    );

    if (vkEndCommandBuffer(CommandBuffer) != VK_SUCCESS)
    {
        destroyFallbackTexture();
        return false;
    }

    VkSubmitInfo submitInfo{};
    submitInfo.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO;
    submitInfo.commandBufferCount = 1;
    submitInfo.pCommandBuffers = &CommandBuffer;
    {
        const VkResult submitResult = submitQueue(submitInfo, FrameFence);
        if (submitResult != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: fallback texture vkQueueSubmit failed (%d)", static_cast<int>(submitResult));
            destroyFallbackTexture();
            return false;
        }
    }

    if (vkWaitForFences(Device, 1, &FrameFence, VK_TRUE, kFenceWaitTimeoutNs) != VK_SUCCESS)
    {
        destroyFallbackTexture();
        return false;
    }

    return true;
}

void VulkanRenderer3D::destroyFallbackTexture()
{
    invalidateAllGraphicsDescriptorSetCaches();

    if (FallbackTextureSampler != VK_NULL_HANDLE)
    {
        vkDestroySampler(Device, FallbackTextureSampler, nullptr);
        FallbackTextureSampler = VK_NULL_HANDLE;
    }
    for (VkSampler& sampler : TextureWrapSamplers)
    {
        if (sampler != VK_NULL_HANDLE)
        {
            vkDestroySampler(Device, sampler, nullptr);
            sampler = VK_NULL_HANDLE;
        }
    }

    if (FallbackTextureView != VK_NULL_HANDLE)
    {
        vkDestroyImageView(Device, FallbackTextureView, nullptr);
        FallbackTextureView = VK_NULL_HANDLE;
    }

    if (FallbackTextureNormalizedView != VK_NULL_HANDLE)
    {
        vkDestroyImageView(Device, FallbackTextureNormalizedView, nullptr);
        FallbackTextureNormalizedView = VK_NULL_HANDLE;
    }

    if (FallbackTextureImage != VK_NULL_HANDLE)
    {
        vkDestroyImage(Device, FallbackTextureImage, nullptr);
        FallbackTextureImage = VK_NULL_HANDLE;
    }

    if (FallbackTextureMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, FallbackTextureMemory, nullptr);
        FallbackTextureMemory = VK_NULL_HANDLE;
    }

    if (FallbackTextureStagingBuffer != VK_NULL_HANDLE)
    {
        vkDestroyBuffer(Device, FallbackTextureStagingBuffer, nullptr);
        FallbackTextureStagingBuffer = VK_NULL_HANDLE;
    }

    if (FallbackTextureStagingMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, FallbackTextureStagingMemory, nullptr);
        FallbackTextureStagingMemory = VK_NULL_HANDLE;
    }
}

bool VulkanRenderer3D::createReadbackBuffer(u32 width, u32 height)
{
    ReadbackSize = static_cast<VkDeviceSize>(width) * static_cast<VkDeviceSize>(height) * sizeof(u32);

    VkBufferCreateInfo bufferCreateInfo{};
    bufferCreateInfo.sType = VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO;
    bufferCreateInfo.size = ReadbackSize;
    bufferCreateInfo.usage = VK_BUFFER_USAGE_TRANSFER_DST_BIT;
    bufferCreateInfo.sharingMode = VK_SHARING_MODE_EXCLUSIVE;

    if (vkCreateBuffer(Device, &bufferCreateInfo, nullptr, &ReadbackBuffer) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to create readback buffer");
        return false;
    }

    VkMemoryRequirements bufferMemoryRequirements{};
    vkGetBufferMemoryRequirements(Device, ReadbackBuffer, &bufferMemoryRequirements);

    VkMemoryAllocateInfo memoryAllocateInfo{};
    memoryAllocateInfo.sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
    memoryAllocateInfo.allocationSize = bufferMemoryRequirements.size;

    memoryAllocateInfo.memoryTypeIndex = findMemoryType(
        bufferMemoryRequirements.memoryTypeBits,
        VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT
            | VK_MEMORY_PROPERTY_HOST_CACHED_BIT
    );
    if (memoryAllocateInfo.memoryTypeIndex == UINT32_MAX)
        memoryAllocateInfo.memoryTypeIndex = findMemoryType(
            bufferMemoryRequirements.memoryTypeBits,
            VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT
        );

    if (memoryAllocateInfo.memoryTypeIndex == UINT32_MAX)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: unable to find memory type for readback buffer");
        destroyReadbackBuffer();
        return false;
    }

    if (vkAllocateMemory(Device, &memoryAllocateInfo, nullptr, &ReadbackMemory) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to allocate readback memory");
        destroyReadbackBuffer();
        return false;
    }

    if (vkBindBufferMemory(Device, ReadbackBuffer, ReadbackMemory, 0) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to bind readback memory");
        destroyReadbackBuffer();
        return false;
    }

    if (vkMapMemory(Device, ReadbackMemory, 0, ReadbackSize, 0, &ReadbackMapped) != VK_SUCCESS)
    {
        Log(LogLevel::Error, "VulkanRenderer3D: failed to map readback memory");
        destroyReadbackBuffer();
        return false;
    }

    RawReadbackRgba.assign(static_cast<size_t>(width) * static_cast<size_t>(height), 0);
    RawReadbackWidth = width;
    RawReadbackHeight = height;
    return true;
}

void VulkanRenderer3D::destroyReadbackBuffer()
{
    if (ReadbackMapped != nullptr && ReadbackMemory != VK_NULL_HANDLE)
    {
        vkUnmapMemory(Device, ReadbackMemory);
        ReadbackMapped = nullptr;
    }

    if (ReadbackBuffer != VK_NULL_HANDLE)
    {
        vkDestroyBuffer(Device, ReadbackBuffer, nullptr);
        ReadbackBuffer = VK_NULL_HANDLE;
    }

    if (ReadbackMemory != VK_NULL_HANDLE)
    {
        vkFreeMemory(Device, ReadbackMemory, nullptr);
        ReadbackMemory = VK_NULL_HANDLE;
    }

    ReadbackSize = 0;
    RawReadbackWidth = 0;
    RawReadbackHeight = 0;
    RawReadbackRgba.clear();
}

bool VulkanRenderer3D::descriptorImageInfoEquals(const VkDescriptorImageInfo& lhs, const VkDescriptorImageInfo& rhs)
{
    return lhs.sampler == rhs.sampler
        && lhs.imageView == rhs.imageView
        && lhs.imageLayout == rhs.imageLayout;
}

bool VulkanRenderer3D::usesSingleDescriptorTexturePath() const noexcept
{
    // Base fallback now uses a switch-selected descriptor array in a single raster pass.
    return false;
}

VulkanTextureDescriptorPolicy VulkanRenderer3D::getTextureDescriptorPolicy() const noexcept
{
    return GetVulkanTextureDescriptorPolicy();
}

u32 VulkanRenderer3D::getTextureBindingDescriptorCount() const noexcept
{
    return getTextureDescriptorPolicy().TextureDescriptorPageSize;
}

bool VulkanRenderer3D::getGraphicsTextureDescriptors(
    TexcacheVulkanLoader::TextureHandle textureHandle,
    VkDescriptorImageInfo* textureDescriptorInfo,
    VkDescriptorImageInfo* normalizedTextureDescriptorInfo) const
{
    if (textureDescriptorInfo == nullptr
        || !Texcache.GetLoader().GetTextureDescriptor(
            textureHandle,
            textureDescriptorInfo))
    {
        return false;
    }

    if (!getTextureDescriptorPolicy().RequiresNormalizedTextureDescriptor())
        return true;

    return normalizedTextureDescriptorInfo != nullptr
        && Texcache.GetLoader().GetTextureNormalizedDescriptor(
            textureHandle,
            normalizedTextureDescriptorInfo);
}

void VulkanRenderer3D::InvalidatePresentationState(bool discardColorTarget) noexcept
{

    if (CurrentFrameServedIdentity.Valid
        && !(ExactCaptureLineCachePrepared
             && captureIdentityMatchesCurrentFrameKey(LineCacheIdentity))
        && ((CaptureLinePending
             && captureIdentityMatchesCurrentFrameKey(PendingCaptureLineIdentity))
            || (CaptureLineReady
                && captureIdentityMatchesCurrentFrameKey(ReadyCaptureLineIdentity))))
    {
        (void)prepareFaithfulExactCaptureLineCache();
        traceFaithfulCaptureDecision(
            "invalidate",
            (ExactCaptureLineCachePrepared
                && captureIdentityMatchesCurrentFrameKey(LineCacheIdentity))
                ? "export-1x-consumido" : "export-1x-no-consumido",
            LineCacheIdentity);
    }
    const bool conservarExport1x = ExactCaptureLineCachePrepared
        && captureIdentityMatchesCurrentFrameKey(LineCacheIdentity);
    const CaptureSourceIdentity keyServida = CurrentFrameServedIdentity;
    FrameIdentical = false;
    HasCpuFrame = false;
    ComposeFielPreciso3D = false;
    LastSubmittedRenderPolygonCount = 0;
    CaptureDebugLogsRemaining = MelonDSAndroid::areRendererDebugToolsEnabled() ? 48u : 0u;
    ShadowMaskDepthComplementLogsRemaining = MelonDSAndroid::areRendererDebugToolsEnabled() ? 12u : 0u;
    RawReadbackWidth = 0;
    RawReadbackHeight = 0;
    RawReadbackRgba.clear();
    resetCaptureLineState();
    if (!conservarExport1x)
        clearLineCache();
    SweepLineCacheIdentity = {};
    LastValidExactCaptureIdentity[0] = {};
    LastValidExactCaptureIdentity[1] = {};
    LastValidExactCaptureLineCache[0].fill(0u);
    LastValidExactCaptureLineCache[1].fill(0u);
    HasLastValidExactCaptureParidad = {false, false};
    LastValidExactCaptureUltimaParidad = false;
    LastServedCaptureSourceIdentity = {};
    LastSubmittedRenderContext = nullptr;
    PublishedGraphicsRenderContext = nullptr;
    PublishedGlobalRenderIdentity = {};
    CurrentFrameServedIdentity = {};
    PublishedGlobalLiveRenderIdentity = {};
    PublishedGlobalRenderFence = VK_NULL_HANDLE;
    CurrentFrameLiveRenderIdentity = {};
    FaithfulNativeProjectionSourceGpu = nullptr;
    FaithfulNativeProjectionSourceIdentity = {};
    PinnedCaptureExportContext = nullptr;
    PinnedCaptureExportSequence = 0u;
    if (discardColorTarget)
    {
        ColorImageInitialized = false;
    }
    if (conservarExport1x)
    {
        CurrentFrameServedIdentity = keyServida;
        SweepLineCache = LineCache;
        SweepLineCacheIdentity = LineCacheIdentity;
        HasCpuFrame = true;
        traceFaithfulCaptureDecision(
            "invalidate", "conserva-export-1x-key-servida", LineCacheIdentity);
    }
    SparseOpaqueDetailLogsRemaining = MelonDSAndroid::areRendererDebugBgObjLogsEnabled() ? 4096u : 0u;
    DenseOpaquePassLogsRemaining = MelonDSAndroid::areRendererDebugBgObjLogsEnabled() ? 64u : 0u;
}

VulkanRenderer3D::TextureSamplingPath VulkanRenderer3D::resolveTextureSamplingPath() const noexcept
{
    if (!VulkanContext::Get().SupportsDynamicTextureIndexing())
        return TextureSamplingPath::BaseSingleDescriptor;
    return TextureSamplingPath::DynamicUniform;
}

const char* VulkanRenderer3D::textureSamplingPathName(TextureSamplingPath path) noexcept
{
    switch (path)
    {
        case TextureSamplingPath::BaseSingleDescriptor:
            return "base-switch-descriptor";
        case TextureSamplingPath::DynamicUniform:
            return "dynamic-uniform";
    }
    return "unknown";
}

const char* VulkanRenderer3D::capturePathModeName(CapturePathMode mode) noexcept
{
    switch (mode)
    {
        case CapturePathMode::Disabled:
            return "disabled";
        case CapturePathMode::CaptureLineExport:
            return "capture_line";
        case CapturePathMode::FallbackReadback:
            return "fallback_readback";
        case CapturePathMode::Count:
            break;
    }
    return "unknown";
}

VkDescriptorSet VulkanRenderer3D::getGraphicsDescriptorSet(
    RenderContext* context,
    int faithfulDescriptorSlot,
    u32 textureDescriptorIndex) const
{
    const u32 page = getTextureDescriptorPolicy()
        .TextureDescriptorPageIndex(textureDescriptorIndex);
    if (context != nullptr)
        return context->GraphicsDescriptorSets[page];

    if (faithfulDescriptorSlot >= 0
        && faithfulDescriptorSlot
            < static_cast<int>(FaithfulGraphicsDescriptorSlotCount))
    {
        return FaithfulGraphicsDescriptorSets[
            static_cast<size_t>(faithfulDescriptorSlot)][page];
    }

    return GraphicsDescriptorSets[page];
}

VulkanRenderer3D::GraphicsDescriptorSetCache& VulkanRenderer3D::getGraphicsDescriptorSetCache(
    RenderContext* context,
    int faithfulDescriptorSlot)
{
    if (context != nullptr)
        return context->GraphicsDescriptorCache;

    if (faithfulDescriptorSlot >= 0
        && faithfulDescriptorSlot
            < static_cast<int>(FaithfulGraphicsDescriptorSlotCount))
    {
        return FaithfulGraphicsDescriptorCaches[
            static_cast<size_t>(faithfulDescriptorSlot)];
    }

    return GraphicsDescriptorCache;
}

void VulkanRenderer3D::invalidateGraphicsDescriptorSetCache(RenderContext* context)
{
    getGraphicsDescriptorSetCache(context).Ready = false;
}

void VulkanRenderer3D::invalidateAllGraphicsDescriptorSetCaches()
{
    GraphicsDescriptorCache.Ready = false;
    for (GraphicsDescriptorSetCache& cache : FaithfulGraphicsDescriptorCaches)
        cache.Ready = false;
    for (RenderContext& renderContext : activeRenderContexts())
        renderContext.GraphicsDescriptorCache.Ready = false;
    NativeProjectionContext.GraphicsDescriptorCache.Ready = false;
}

bool VulkanRenderer3D::updateCaptureExportDescriptorSet(
    RenderContext* context,
    const FaithfulRasterProductSlot* sourceTarget,
    VkBuffer destinationBuffer,
    int faithfulDescriptorSlot,
    VkDescriptorSet* outDescriptorSet)
{
    VkDescriptorSet descriptorSet = context != nullptr
        ? context->CaptureExportDescriptorSet
        : CaptureExportDescriptorSet;
    if (context == nullptr
        && faithfulDescriptorSlot >= 0
        && faithfulDescriptorSlot < static_cast<int>(FaithfulCaptureExportDescriptorSlotCount))
    {
        descriptorSet = FaithfulCaptureExportDescriptorSets[static_cast<size_t>(faithfulDescriptorSlot)];
    }
    if (outDescriptorSet != nullptr)
        *outDescriptorSet = descriptorSet;
    const VkBuffer captureLineBuffer = destinationBuffer != VK_NULL_HANDLE
        ? destinationBuffer
        : (context != nullptr ? context->CaptureLineBuffer : this->CaptureLineBuffer);
    const FaithfulRasterProductSlot* target = sourceTarget != nullptr
        ? sourceTarget
        : getContextFaithfulRasterProductSlot(context);
    const VkImageView colorImageView = target != nullptr ? target->ColorImageView : ColorImageView;
    if (descriptorSet == VK_NULL_HANDLE
        || colorImageView == VK_NULL_HANDLE
        || FallbackTextureSampler == VK_NULL_HANDLE
        || captureLineBuffer == VK_NULL_HANDLE)
    {
        return false;
    }

    VkDescriptorImageInfo imageInfo{};
    imageInfo.imageView = colorImageView;
    imageInfo.imageLayout = VK_IMAGE_LAYOUT_GENERAL;
    imageInfo.sampler = FallbackTextureSampler;

    VkDescriptorBufferInfo captureLineInfo{};
    captureLineInfo.buffer = captureLineBuffer;
    captureLineInfo.offset = 0;
    captureLineInfo.range = VK_WHOLE_SIZE;

    const std::array<VkWriteDescriptorSet, 2> writes = {
        makeImageDescriptorWrite(descriptorSet, 2, &imageInfo, 1, VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER),
        makeBufferDescriptorWrite(descriptorSet, 9, &captureLineInfo)};
    vkUpdateDescriptorSets(Device, static_cast<u32>(writes.size()), writes.data(), 0, nullptr);

    return true;
}

void VulkanRenderer3D::updateGraphicsDescriptorSet(
    RenderContext* context,
    int faithfulDescriptorSlot)
{
    const VkDescriptorSet descriptorSet =
        getGraphicsDescriptorSet(context, faithfulDescriptorSlot);
    const VkBuffer triangleBuffer = context != nullptr ? context->TriangleBuffer : TriangleBuffer;
    const VkBuffer toonBuffer = context != nullptr ? context->ToonBuffer : ToonBuffer;
    const VkBuffer clearBuffer = context != nullptr ? context->ClearBuffer : ClearBuffer;
    const FaithfulRasterProductSlot* target = getContextFaithfulRasterProductSlot(context);
    const VkImageView attrImageView = target != nullptr ? target->AttrImageView : AttrImageView;
    const VulkanTextureDescriptorPolicy texturePolicy = getTextureDescriptorPolicy();
    const bool normalizedTextureDescriptors =
        texturePolicy.RequiresNormalizedTextureDescriptor();
    const VkImageView depthImageView =
        target != nullptr ? target->DepthStencilDepthImageView : DepthStencilDepthImageView;

    if (descriptorSet == VK_NULL_HANDLE
        || triangleBuffer == VK_NULL_HANDLE
        || toonBuffer == VK_NULL_HANDLE
        || clearBuffer == VK_NULL_HANDLE
        || attrImageView == VK_NULL_HANDLE
        || depthImageView == VK_NULL_HANDLE
        || GraphicsAttachmentSampler == VK_NULL_HANDLE
        || !texturePolicy.DescriptorViewsValid(
            FallbackTextureView != VK_NULL_HANDLE,
            FallbackTextureNormalizedView != VK_NULL_HANDLE))
    {
        return;
    }

    GraphicsDescriptorSetCache& descriptorCache =
        getGraphicsDescriptorSetCache(context, faithfulDescriptorSlot);

    VkDescriptorBufferInfo triangleInfo{};
    triangleInfo.buffer = triangleBuffer;
    triangleInfo.offset = 0;
    triangleInfo.range = VK_WHOLE_SIZE;

    VkDescriptorBufferInfo toonInfo{};
    toonInfo.buffer = toonBuffer;
    toonInfo.offset = 0;
    toonInfo.range = VK_WHOLE_SIZE;

    VkDescriptorBufferInfo clearInfo{};
    clearInfo.buffer = clearBuffer;
    clearInfo.offset = 0;
    clearInfo.range = VK_WHOLE_SIZE;

    std::array<VkDescriptorImageInfo, TextureDescriptorPageStorageCapacity> textureInfos{};
    std::array<VkDescriptorImageInfo, TextureDescriptorPageStorageCapacity> normalizedTextureInfos{};
    VkDescriptorImageInfo fallbackInfo{};
    fallbackInfo.sampler = FallbackTextureSampler;
    fallbackInfo.imageView = FallbackTextureView;
    fallbackInfo.imageLayout = VK_IMAGE_LAYOUT_GENERAL;
    textureInfos.fill(fallbackInfo);
    if (normalizedTextureDescriptors)
    {
        VkDescriptorImageInfo normalizedFallbackInfo{};
        normalizedFallbackInfo.sampler = FallbackTextureSampler;
        normalizedFallbackInfo.imageView = FallbackTextureNormalizedView;
        normalizedFallbackInfo.imageLayout = VK_IMAGE_LAYOUT_GENERAL;
        normalizedTextureInfos.fill(normalizedFallbackInfo);
    }
    for (u32 i = 0;
         i < ActiveTextureDescriptorCount && i < texturePolicy.MaxActiveTextureDescriptors();
         i++)
    {
        textureInfos[i] = ActiveTextureDescriptors[i];
        if (normalizedTextureDescriptors)
            normalizedTextureInfos[i] = ActiveNormalizedTextureDescriptors[i];
    }

    VkDescriptorImageInfo attrInfo{};
    attrInfo.sampler = GraphicsAttachmentSampler;
    attrInfo.imageView = attrImageView;
    attrInfo.imageLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;

    VkDescriptorImageInfo depthInfo{};
    depthInfo.sampler = GraphicsAttachmentSampler;
    depthInfo.imageView = depthImageView;
    depthInfo.imageLayout = VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL;

    std::array<VkWriteDescriptorSet, 7u * GraphicsTextureDescriptorPageCount> writes{};
    u32 writeCount = 0;

    for (u32 page = 0u; page < GraphicsTextureDescriptorPageCount; page++)
    {
        const u32 first = page * texturePolicy.TextureDescriptorPageSize;
        const u32 end = first + texturePolicy.TextureDescriptorPageSize;
        const VkDescriptorSet pageDescriptorSet =
            getGraphicsDescriptorSet(context, faithfulDescriptorSlot, first);

        if (!descriptorCache.Ready || descriptorCache.TriangleBuffer != triangleBuffer)
            writes[writeCount++] = makeBufferDescriptorWrite(pageDescriptorSet, 0, &triangleInfo);

        bool texturesChanged = !descriptorCache.Ready;
        if (!texturesChanged)
        {
            for (u32 i = first; i < end; i++)
            {
                if (!descriptorImageInfoEquals(descriptorCache.TextureInfos[i], textureInfos[i]))
                {
                    texturesChanged = true;
                    break;
                }
            }
        }
        if (texturesChanged)
        {
            writes[writeCount++] = makeImageDescriptorWrite(
                pageDescriptorSet,
                1,
                textureInfos.data() + first,
                texturePolicy.TextureDescriptorPageSize,
                VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER);
        }

        bool normalizedTexturesChanged = normalizedTextureDescriptors && !descriptorCache.Ready;
        if (normalizedTextureDescriptors && !normalizedTexturesChanged)
        {
            for (u32 i = first; i < end; i++)
            {
                if (!descriptorImageInfoEquals(descriptorCache.NormalizedTextureInfos[i], normalizedTextureInfos[i]))
                {
                    normalizedTexturesChanged = true;
                    break;
                }
            }
        }
        if (normalizedTextureDescriptors && normalizedTexturesChanged)
        {
            writes[writeCount++] = makeImageDescriptorWrite(
                pageDescriptorSet,
                6,
                normalizedTextureInfos.data() + first,
                texturePolicy.TextureDescriptorPageSize,
                VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER);
        }

        if (!descriptorCache.Ready || descriptorCache.ToonBuffer != toonBuffer)
            writes[writeCount++] = makeBufferDescriptorWrite(pageDescriptorSet, 2, &toonInfo);

        if (!descriptorCache.Ready || descriptorCache.AttrImageView != attrImageView || descriptorCache.AttachmentSampler != GraphicsAttachmentSampler)
            writes[writeCount++] = makeImageDescriptorWrite(pageDescriptorSet, 3, &attrInfo, 1, VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER);

        if (!descriptorCache.Ready || descriptorCache.DepthImageView != depthImageView || descriptorCache.AttachmentSampler != GraphicsAttachmentSampler)
            writes[writeCount++] = makeImageDescriptorWrite(pageDescriptorSet, 4, &depthInfo, 1, VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER);

        if (!descriptorCache.Ready || descriptorCache.ClearBuffer != clearBuffer)
            writes[writeCount++] = makeBufferDescriptorWrite(pageDescriptorSet, 5, &clearInfo);
    }

    if (writeCount > 0)
        vkUpdateDescriptorSets(Device, writeCount, writes.data(), 0, nullptr);

    descriptorCache.Ready = true;
    descriptorCache.TriangleBuffer = triangleBuffer;
    descriptorCache.ToonBuffer = toonBuffer;
    descriptorCache.ClearBuffer = clearBuffer;
    descriptorCache.AttrImageView = attrImageView;
    descriptorCache.DepthImageView = depthImageView;
    descriptorCache.AttachmentSampler = GraphicsAttachmentSampler;
    descriptorCache.TextureInfos = textureInfos;
    if (normalizedTextureDescriptors)
        descriptorCache.NormalizedTextureInfos = normalizedTextureInfos;
}

u32 VulkanRenderer3D::findMemoryType(u32 typeBits, VkMemoryPropertyFlags properties) const
{
    return VulkanContext::Get().FindMemoryType(typeBits, properties);
}

bool VulkanRenderer3D::dispatchRasterAndReadback(
    RenderContext* context,
    u32 rgbaColor,
    u32 clearDepth,
    u32 dispCnt,
    u32 alphaRef,
    u32 fogColor,
    u32 fogOffset,
    u32 fogShift,
    u32 clearAttr,
    const u8* fogDensityTable,
    const u16* edgeColorTable,
    const u16* toonTable,
    bool captureReadbackPath,
    bool nativeProjectionOnly)
{
    return dispatchGraphicsRasterAndReadback(
        context,
        rgbaColor,
        clearDepth,
        dispCnt,
        alphaRef,
        fogColor,
        fogOffset,
        fogShift,
        clearAttr,
        fogDensityTable,
        edgeColorTable,
        toonTable,
        captureReadbackPath,
        nativeProjectionOnly);
}

bool VulkanRenderer3D::dispatchPlainRearPlaneOnly(
    RenderContext* context,
    u32 rgbaColor)
{
    FaithfulRasterProductSlot* graphicsTarget = getContextFaithfulRasterProductSlot(context);
    const VkImage colorImage = graphicsTarget != nullptr
        ? graphicsTarget->ColorImage
        : ColorImage;
    bool& colorInitialized = graphicsTarget != nullptr
        ? graphicsTarget->Initialized
        : ColorImageInitialized;
    if (Device == VK_NULL_HANDLE
        || Queue == VK_NULL_HANDLE
        || colorImage == VK_NULL_HANDLE
        || !colorInitialized)
    {
        return false;
    }

    const bool useSynchronousContext = context == nullptr;
    static const bool disableFaithfulPingPong =
        std::getenv("MELON_SIN_PINGPONG") != nullptr;
    const bool faithfulPingPong = useSynchronousContext
        && !disableFaithfulPingPong
        && CbFiel[0] != VK_NULL_HANDLE
        && VallaFiel[0] != VK_NULL_HANDLE;
    if (faithfulPingPong)
        IndiceCbFiel ^= 1u;

    const VkCommandBuffer commandBuffer = context != nullptr
        ? context->CommandBuffer
        : (faithfulPingPong ? CbFiel[IndiceCbFiel] : CommandBuffer);
    const VkFence frameFence = context != nullptr
        ? context->FrameFence
        : (faithfulPingPong ? VallaFiel[IndiceCbFiel] : FrameFence);
    VkQueryPool timestampQueryPool = context != nullptr
        ? context->TimestampQueryPool
        : TimestampQueryPool;
    bool& timestampPending = context != nullptr
        ? context->TimestampPending
        : TimestampPending;
    if (commandBuffer == VK_NULL_HANDLE || frameFence == VK_NULL_HANDLE)
        return false;
    if (context != nullptr && !isRenderContextReusable(*context))
        return false;

    {
        const u64 waitStartNs = PerfNowNs();
        const VkResult waitResult = vkWaitForFences(
            Device, 1, &frameFence, VK_TRUE, kFenceWaitTimeoutNs);
        if (waitResult != VK_SUCCESS)
        {
            Log(
                LogLevel::Error,
                "VulkanRenderer3D: plain rear-plane fence wait failed (%d)",
                static_cast<int>(waitResult));
            return false;
        }
        FenceWaitCpuWindow.Add(PerfNowNs() - waitStartNs);
        if (useSynchronousContext)
            consumeGpuTiming(nullptr);
    }

    if (vkResetCommandBuffer(commandBuffer, 0) != VK_SUCCESS)
        return false;

    VkCommandBufferBeginInfo beginInfo{};
    beginInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO;
    beginInfo.flags = VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    if (vkBeginCommandBuffer(commandBuffer, &beginInfo) != VK_SUCCESS)
        return false;

    const bool recordTimestamps =
        timestampQueryPool != VK_NULL_HANDLE && ResetQueryPool != nullptr;
    if (recordTimestamps)
    {
        ResetQueryPool(Device, timestampQueryPool, 0, TimestampQueryCount);
        for (u32 query = 0u; query < 4u; query++)
        {
            vkCmdWriteTimestamp(
                commandBuffer,
                VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT,
                timestampQueryPool,
                query);
        }
    }

    VkImageMemoryBarrier toTransferDestination{};
    toTransferDestination.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    toTransferDestination.srcAccessMask =
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT
        | VK_ACCESS_SHADER_READ_BIT
        | VK_ACCESS_SHADER_WRITE_BIT
        | VK_ACCESS_TRANSFER_READ_BIT
        | VK_ACCESS_TRANSFER_WRITE_BIT;
    toTransferDestination.dstAccessMask = VK_ACCESS_TRANSFER_WRITE_BIT;
    toTransferDestination.oldLayout = VK_IMAGE_LAYOUT_GENERAL;
    toTransferDestination.newLayout = VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL;
    toTransferDestination.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toTransferDestination.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toTransferDestination.image = colorImage;
    toTransferDestination.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    toTransferDestination.subresourceRange.levelCount = 1u;
    toTransferDestination.subresourceRange.layerCount = 1u;
    vkCmdPipelineBarrier(
        commandBuffer,
        VK_PIPELINE_STAGE_ALL_COMMANDS_BIT,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        0,
        0,
        nullptr,
        0,
        nullptr,
        1,
        &toTransferDestination);

    VkClearColorValue clearValue{};
    clearValue.float32[0] =
        static_cast<float>(rgbaColor & 0xFFu) * (1.0f / 255.0f);
    clearValue.float32[1] =
        static_cast<float>((rgbaColor >> 8u) & 0xFFu) * (1.0f / 255.0f);
    clearValue.float32[2] =
        static_cast<float>((rgbaColor >> 16u) & 0xFFu) * (1.0f / 255.0f);
    clearValue.float32[3] =
        static_cast<float>((rgbaColor >> 24u) & 0xFFu) * (1.0f / 255.0f);
    const VkImageSubresourceRange colorRange =
        toTransferDestination.subresourceRange;
    vkCmdClearColorImage(
        commandBuffer,
        colorImage,
        VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
        &clearValue,
        1,
        &colorRange);

    VkImageMemoryBarrier toGeneral = toTransferDestination;
    toGeneral.srcAccessMask = VK_ACCESS_TRANSFER_WRITE_BIT;
    toGeneral.dstAccessMask =
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT
        | VK_ACCESS_SHADER_READ_BIT
        | VK_ACCESS_SHADER_WRITE_BIT
        | VK_ACCESS_TRANSFER_READ_BIT;
    toGeneral.oldLayout = VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL;
    toGeneral.newLayout = VK_IMAGE_LAYOUT_GENERAL;
    vkCmdPipelineBarrier(
        commandBuffer,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        VK_PIPELINE_STAGE_ALL_COMMANDS_BIT,
        0,
        0,
        nullptr,
        0,
        nullptr,
        1,
        &toGeneral);

    if (recordTimestamps)
    {
        for (u32 query = 4u; query < TimestampQueryCount; query++)
        {
            vkCmdWriteTimestamp(
                commandBuffer,
                VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT,
                timestampQueryPool,
                query);
        }
    }

    if (vkEndCommandBuffer(commandBuffer) != VK_SUCCESS)
        return false;

    VkSubmitInfo submitInfo{};
    submitInfo.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO;
    submitInfo.commandBufferCount = 1u;
    submitInfo.pCommandBuffers = &commandBuffer;

    if (context != nullptr)
    {

        if (!isRenderContextReusable(*context))
            return false;

        const bool hadPublishedMetadata = context->SubmittedMetadataValid;
        const u64 recycledEpoch = context->SubmittedRenderProductEpoch;
        const u64 recycledSequence = context->SubmitSequence;
        const auto matchesRecycledProduct = [&](u64 epoch, u64 sequence) {
            return hadPublishedMetadata
                && recycledEpoch != 0u
                && recycledSequence != 0u
                && epoch == recycledEpoch
                && sequence == recycledSequence;
        };

        if (PublishedGraphicsRenderContext == context)
            PublishedGraphicsRenderContext = nullptr;
        if (LastSubmittedRenderContext == context)
            LastSubmittedRenderContext = nullptr;
        if (PinnedCaptureExportContext == context)
        {
            PinnedCaptureExportContext = nullptr;
            PinnedCaptureExportSequence = 0u;
        }
        if (CurrentFrameLiveRenderIdentity.Valid
            && matchesRecycledProduct(
                CurrentFrameLiveRenderIdentity.Epoch,
                CurrentFrameLiveRenderIdentity.Sequence))
        {
            CurrentFrameLiveRenderIdentity = {};
        }
        if (CurrentFrameServedIdentity.Valid
            && matchesRecycledProduct(
                CurrentFrameServedIdentity.RenderProductEpoch,
                CurrentFrameServedIdentity.Sequence))
        {
            CurrentFrameServedIdentity = {};
        }

        context->SubmittedMetadataValid = false;
        context->SubmittedRenderProductEpoch = 0u;
        context->SubmitSequence = 0u;
        context->SubmittedPolygonCount = 0u;
        context->SubmittedCaptureCnt = 0u;
        context->SubmittedScreenSwap = false;
    }
    else
    {
        const LiveRenderProductIdentity recycledIdentity =
            PublishedGlobalLiveRenderIdentity;
        if (CurrentFrameLiveRenderIdentity.Valid
            && recycledIdentity.Valid
            && CurrentFrameLiveRenderIdentity.Epoch == recycledIdentity.Epoch
            && CurrentFrameLiveRenderIdentity.Sequence == recycledIdentity.Sequence)
        {
            CurrentFrameLiveRenderIdentity = {};
        }
        if (CurrentFrameServedIdentity.Valid
            && recycledIdentity.Valid
            && CurrentFrameServedIdentity.RenderProductEpoch == recycledIdentity.Epoch
            && CurrentFrameServedIdentity.Sequence == recycledIdentity.Sequence)
        {
            CurrentFrameServedIdentity = {};
        }

        PublishedGlobalRenderIdentity = {};
        PublishedGlobalLiveRenderIdentity = {};
        PublishedGlobalRenderFence = VK_NULL_HANDLE;
        colorInitialized = false;
    }

    if (vkResetFences(Device, 1, &frameFence) != VK_SUCCESS)
        return false;
    {
        const VkResult submitResult = submitQueue(submitInfo, frameFence);
        if (submitResult != VK_SUCCESS)
        {
            Log(
                LogLevel::Error,
                "VulkanRenderer3D: plain rear-plane submit failed (%d)",
                static_cast<int>(submitResult));
            return false;
        }
    }

    if (context != nullptr && Threaded)
        LastSubmittedRenderContext = context;
    timestampPending = recordTimestamps;
    resetCaptureLineState();
    clearRawReadbackState();
    colorInitialized = true;

    if (graphicsTarget != nullptr)
    {
        context->SubmittedPolygonCount = PendingSubmitPolygonCount;
        context->SubmittedCaptureCnt = PendingSubmitCaptureCnt;
        context->SubmittedRenderProductEpoch = LiveRenderProductEpoch;
        context->SubmitSequence = ++GraphicsSubmitSequence;
        context->SubmittedScreenSwap = CurrentRenderScreenSwap;
        context->SubmittedMetadataValid = true;
        PublishedGraphicsRenderContext = context;
        PublishedGlobalRenderIdentity = {};
        PublishedGlobalLiveRenderIdentity = {};
        PublishedGlobalRenderFence = VK_NULL_HANDLE;
    }
    else
    {
        PublishedGraphicsRenderContext = nullptr;
        PublishedGlobalRenderIdentity.Valid = true;
        PublishedGlobalRenderIdentity.RenderProductEpoch = LiveRenderProductEpoch;
        PublishedGlobalRenderIdentity.Sequence = ++GraphicsSubmitSequence;
        PublishedGlobalRenderIdentity.PolygonCount = PendingSubmitPolygonCount;
        PublishedGlobalRenderIdentity.CaptureCnt = PendingSubmitCaptureCnt;
        PublishedGlobalRenderIdentity.ScreenSwap = CurrentRenderScreenSwap;
        PublishedGlobalLiveRenderIdentity.Valid = true;
        PublishedGlobalLiveRenderIdentity.Epoch = LiveRenderProductEpoch;
        PublishedGlobalLiveRenderIdentity.Sequence =
            PublishedGlobalRenderIdentity.Sequence;
        PublishedGlobalRenderFence = frameFence;
    }

    HasCpuFrame = false;
    return true;
}

bool VulkanRenderer3D::dispatchGraphicsRasterAndReadback(
    RenderContext* context,
    u32 rgbaColor,
    u32 clearDepth,
    u32 dispCnt,
    u32 alphaRef,
    u32 fogColor,
    u32 fogOffset,
    u32 fogShift,
    u32 clearAttr,
    const u8* fogDensityTable,
    const u16* edgeColorTable,
    const u16* toonTable,
    bool captureReadbackPath,
    bool nativeProjectionOnly)
{
    constexpr u32 kTriangleFlagTextured = 1u << 1u;
    constexpr u32 kTriangleFlagDecal = 1u << 2u;
    constexpr u32 kTriangleFlagWBuffer = 1u << 4u;
    constexpr u32 kTriangleFlagLinear = 1u << 6u;
    constexpr u32 kTriangleFlagTextureOpaque = 1u << 14u;
    if (nativeProjectionOnly
        && (context == nullptr
            || !captureReadbackPath))
    {
        return false;
    }

    FaithfulRasterProductSlot* graphicsTarget = getContextFaithfulRasterProductSlot(context);
    VkImage ColorImage = graphicsTarget != nullptr ? graphicsTarget->ColorImage : this->ColorImage;
    VkImageView ColorImageView = graphicsTarget != nullptr ? graphicsTarget->ColorImageView : this->ColorImageView;
    VkImage RasterColorImage = ColorImage;
    VkImageView RasterColorImageView = ColorImageView;
    VkImage AttrImage = graphicsTarget != nullptr ? graphicsTarget->AttrImage : this->AttrImage;
    VkImageView AttrImageView = graphicsTarget != nullptr ? graphicsTarget->AttrImageView : this->AttrImageView;
    VkImage DepthStencilImage = graphicsTarget != nullptr ? graphicsTarget->DepthStencilImage : this->DepthStencilImage;
    VkImageView DepthStencilImageView = graphicsTarget != nullptr ? graphicsTarget->DepthStencilImageView : this->DepthStencilImageView;
    VkImageView DepthStencilDepthImageView = graphicsTarget != nullptr ? graphicsTarget->DepthStencilDepthImageView : this->DepthStencilDepthImageView;
    const bool usesGraphicsProductResources = true;
    const GraphicsRasterDispatchPolicy& rasterDispatchPolicy =
        kGraphicsRasterDispatchPolicy;
    VkImage logicalDepthImage = DepthStencilImage;
    VkImageView logicalDepthImageView = DepthStencilDepthImageView;
    VkFramebuffer GraphicsRasterFramebuffer = graphicsTarget != nullptr ? graphicsTarget->RasterFramebuffer : this->GraphicsRasterFramebuffer;
    VkFramebuffer GraphicsRasterLoadFramebuffer = graphicsTarget != nullptr ? graphicsTarget->RasterLoadFramebuffer : this->GraphicsRasterLoadFramebuffer;
    VkFramebuffer GraphicsColorOnlyFramebuffer = graphicsTarget != nullptr ? graphicsTarget->ColorOnlyFramebuffer : this->GraphicsColorOnlyFramebuffer;
    VkFramebuffer GraphicsFinalFramebuffer = graphicsTarget != nullptr ? graphicsTarget->FinalFramebuffer : this->GraphicsFinalFramebuffer;
    const u32 ColorImageWidth = graphicsTarget != nullptr ? graphicsTarget->Width : this->ColorImageWidth;
    const u32 ColorImageHeight = graphicsTarget != nullptr ? graphicsTarget->Height : this->ColorImageHeight;
    bool& ColorImageInitialized = graphicsTarget != nullptr ? graphicsTarget->Initialized : this->ColorImageInitialized;
    const u32 effectiveRasterScale =
        static_cast<u32>(std::max(1, EscalaEfectiva));

    u32 renderWidth = std::min<u32>(ColorImageWidth,
        256u * effectiveRasterScale);
    u32 renderHeight = std::min<u32>(ColorImageHeight,
        192u * effectiveRasterScale);

    static const bool sonda3dMini = [] {
        if (std::getenv("MELON_SONDA_3D_MINI") != nullptr)
            return true;
#ifdef __ANDROID__
        char v[92] = {};
        if (__system_property_get("debug.melonds.sonda_3d_mini", v) > 0)
            return v[0] == '1';
#endif
        return false;
    }();
    if (sonda3dMini)
    {
        renderWidth = std::min(renderWidth, 8u);
        renderHeight = std::min(renderHeight, 8u);
    }

    if (Device == VK_NULL_HANDLE
        || Queue == VK_NULL_HANDLE
        || !GraphicsReady
        || ColorImage == VK_NULL_HANDLE
        || ColorImageView == VK_NULL_HANDLE
        || AttrImage == VK_NULL_HANDLE
        || AttrImageView == VK_NULL_HANDLE
        || DepthStencilImage == VK_NULL_HANDLE
        || DepthStencilImageView == VK_NULL_HANDLE
        || logicalDepthImage == VK_NULL_HANDLE
        || logicalDepthImageView == VK_NULL_HANDLE
        || GraphicsRasterRenderPass == VK_NULL_HANDLE
        || GraphicsFinalRenderPass == VK_NULL_HANDLE
        || GraphicsRasterFramebuffer == VK_NULL_HANDLE
        || GraphicsFinalFramebuffer == VK_NULL_HANDLE
        || (usesGraphicsProductResources
            && (GraphicsRasterLoadRenderPass == VK_NULL_HANDLE
                || GraphicsColorOnlyRenderPass == VK_NULL_HANDLE
                || GraphicsRasterLoadFramebuffer == VK_NULL_HANDLE
                || GraphicsColorOnlyFramebuffer == VK_NULL_HANDLE))
        || GraphicsPipelineLayout == VK_NULL_HANDLE)
    {
        return false;
    }

    const bool useSynchronousContext = context == nullptr;

    static const bool sinPingPong = std::getenv("MELON_SIN_PINGPONG") != nullptr;
    const bool pingPongFiel = useSynchronousContext
        && !sinPingPong
        && CbFiel[0] != VK_NULL_HANDLE
        && VallaFiel[0] != VK_NULL_HANDLE;
    if (pingPongFiel)
        IndiceCbFiel ^= 1u;
    const VkCommandBuffer commandBuffer = context != nullptr ? context->CommandBuffer
        : (pingPongFiel ? CbFiel[IndiceCbFiel] : CommandBuffer);
    const VkFence frameFence = context != nullptr ? context->FrameFence
        : (pingPongFiel ? VallaFiel[IndiceCbFiel] : FrameFence);
    const VkBuffer triangleBuffer = context != nullptr ? context->TriangleBuffer : TriangleBuffer;
    const VkBuffer graphicsVertexBuffer = context != nullptr ? context->GraphicsVertexBuffer : GraphicsVertexBuffer;

    const bool useContextSceneBuffers = context != nullptr;
    const VkBuffer graphicsSceneVertexBuffer = useContextSceneBuffers
        ? context->GraphicsSceneVertexBuffer : GraphicsSceneVertexBuffer;
    const VkBuffer graphicsEdgeIndexBuffer = useContextSceneBuffers
        ? context->GraphicsEdgeIndexBuffer : GraphicsEdgeIndexBuffer;
    const VkBuffer toonBuffer = context != nullptr ? context->ToonBuffer : ToonBuffer;
    const VkBuffer clearBuffer = context != nullptr ? context->ClearBuffer : ClearBuffer;
    void* triangleMapped = context != nullptr ? context->TriangleMapped : TriangleMapped;

    MitadEscenaActiva = pingPongFiel
        ? (GraphicsSceneVertexBufferSize / 2u) * IndiceCbFiel : 0u;
    MitadVerticesActiva = (pingPongFiel && context == nullptr)
        ? (GraphicsVertexBufferSize / 2u) * IndiceCbFiel : 0u;
    MitadAristasActiva = pingPongFiel
        ? (GraphicsEdgeIndexBufferSize / 2u) * IndiceCbFiel : 0u;
    void* graphicsVertexMapped = context != nullptr ? context->GraphicsVertexMapped
        : (GraphicsVertexMapped != nullptr
            ? static_cast<void*>(static_cast<u8*>(GraphicsVertexMapped) + MitadVerticesActiva)
            : nullptr);
    void* graphicsSceneVertexBase = useContextSceneBuffers
        ? context->GraphicsSceneVertexMapped : GraphicsSceneVertexMapped;
    void* graphicsEdgeIndexBase = useContextSceneBuffers
        ? context->GraphicsEdgeIndexMapped : GraphicsEdgeIndexMapped;
    void* graphicsSceneVertexMapped = graphicsSceneVertexBase != nullptr
        ? static_cast<void*>(static_cast<u8*>(graphicsSceneVertexBase) + MitadEscenaActiva)
        : nullptr;
    void* graphicsEdgeIndexMapped = graphicsEdgeIndexBase != nullptr
        ? static_cast<void*>(static_cast<u8*>(graphicsEdgeIndexBase) + MitadAristasActiva)
        : nullptr;
    const VkBuffer captureLineBuffer = context != nullptr ? context->CaptureLineBuffer : CaptureLineBuffer;
    void* captureLineMapped = context != nullptr ? context->CaptureLineMapped : CaptureLineMapped;
    VkQueryPool timestampQueryPool = context != nullptr ? context->TimestampQueryPool : TimestampQueryPool;
    bool& timestampPending = context != nullptr ? context->TimestampPending : TimestampPending;
    const GraphicsPolygonDraw* depthComplementShadowMaskDraw = nullptr;

    if (triangleBuffer == VK_NULL_HANDLE || triangleMapped == nullptr
        || graphicsVertexBuffer == VK_NULL_HANDLE || graphicsVertexMapped == nullptr)
        return false;
    if (graphicsSceneVertexBuffer == VK_NULL_HANDLE || graphicsSceneVertexMapped == nullptr
        || graphicsEdgeIndexBuffer == VK_NULL_HANDLE || graphicsEdgeIndexMapped == nullptr)
        return false;
    if (captureReadbackPath && (captureLineBuffer == VK_NULL_HANDLE || captureLineMapped == nullptr))
        return false;

    {
        const u64 waitStartNs = PerfNowNs();
        const VkResult waitResult = vkWaitForFences(Device, 1, &frameFence, VK_TRUE, kFenceWaitTimeoutNs);
        if (waitResult != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: graphics vkWaitForFences failed (%d)", static_cast<int>(waitResult));
            return false;
        }

        FenceWaitCpuWindow.Add(PerfNowNs() - waitStartNs);
        if (useSynchronousContext)
            consumeGpuTiming(nullptr);
    }

    const bool depthComplementClearState =
        ((clearAttr >> 16u) & 0x1Fu) == 0u
        && ((clearAttr >> 24u) & 0x3Fu) == 63u
        && (dispCnt & (1u << 3u)) != 0u;
    const size_t shadowProtocolDrawCount = GraphicsShadowDrawIndices.size();
    const bool supportedShadowProtocolPhase =
        shadowProtocolDrawCount == 3u
        || shadowProtocolDrawCount == 4u
        || shadowProtocolDrawCount == 7u;
    if (usesGraphicsProductResources
        && depthComplementClearState
        && GraphicsShadowMaskDrawIndices.size() == 1u
        && supportedShadowProtocolPhase)
    {
        const auto trianglesMatchProtocol = [&](const GraphicsPolygonDraw& draw,
                                                bool textured,
                                                u32 texParam,
                                                u32 texWidth,
                                                u32 texHeight,
                                                u32 colorRgba8) -> bool {
            if (draw.firstTriangle > Triangles.size()
                || draw.triangleCount > Triangles.size() - draw.firstTriangle)
            {
                return false;
            }

            for (u32 triangleOffset = 0u; triangleOffset < draw.triangleCount; triangleOffset++)
            {
                const TriangleGpu& triangle = Triangles[draw.firstTriangle + triangleOffset];
                if (((triangle.flags & kTriangleFlagTextured) != 0u) != textured
                    || (triangle.flags & kTriangleFlagWBuffer) != 0u
                    || triangle.texParam != texParam
                    || triangle.texWidth != texWidth
                    || triangle.texHeight != texHeight
                    || triangle.polyAttr != draw.polyAttr
                    || triangle.color0Rgba8 != colorRgba8
                    || triangle.color1Rgba8 != colorRgba8
                    || triangle.color2Rgba8 != colorRgba8
                    || triangle.w0 != 4096.0f
                    || triangle.w1 != 4096.0f
                    || triangle.w2 != 4096.0f)
                {
                    return false;
                }
            }
            return true;
        };

        const u32 maskDrawIndex = GraphicsShadowMaskDrawIndices.front();
        if (maskDrawIndex < GraphicsPolygons.size())
        {
            const GraphicsPolygonDraw& maskDraw = GraphicsPolygons[maskDrawIndex];
            const u32 maskPolyId = (maskDraw.polyAttr >> 24u) & 0x3Fu;
            const u32 maskAlpha5 = (maskDraw.polyAttr >> 16u) & 0x1Fu;
            const u32 maskBlendMode = (maskDraw.polyAttr >> 4u) & 0x3u;
            const u32 expectedMaskFlags = AcceleratedPolygonFlagTranslucent
                | AcceleratedPolygonFlagShadowMask
                | AcceleratedPolygonFlagFacingView
                | AcceleratedPolygonFlagFogWrite;
            const bool maskMatches =
                maskDraw.flags == expectedMaskFlags
                && maskPolyId == 0u
                && maskAlpha5 == 8u
                && maskBlendMode == 3u
                && (maskDraw.polyAttr & (1u << 11u)) == 0u
                && maskDraw.triangleCount == 4u
                && trianglesMatchProtocol(maskDraw, true, 0x06500000u, 256u, 128u, 0x42FFFFFFu);
            if (maskMatches)
                depthComplementShadowMaskDraw = &maskDraw;
        }

        bool allShadowsMatch = depthComplementShadowMaskDraw != nullptr;
        if (allShadowsMatch)
        {
            const u32 expectedShadowFlags = AcceleratedPolygonFlagTranslucent
                | AcceleratedPolygonFlagShadow
                | AcceleratedPolygonFlagFacingView
                | AcceleratedPolygonFlagFogWrite;
            constexpr std::array<u32, 7> fullAlphaRamp = {5u, 13u, 24u, 30u, 24u, 13u, 5u};
            const u32 alphaRampOffset = shadowProtocolDrawCount == 3u
                ? 4u
                : (shadowProtocolDrawCount == 4u ? 3u : 0u);
            for (u32 shadowIndex = 0u; shadowIndex < GraphicsShadowDrawIndices.size(); shadowIndex++)
            {
                const u32 drawIndex = GraphicsShadowDrawIndices[shadowIndex];
                if (drawIndex >= GraphicsPolygons.size()
                    || drawIndex != maskDrawIndex + 1u + shadowIndex)
                {
                    allShadowsMatch = false;
                    break;
                }

                const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
                const u32 polyId = (draw.polyAttr >> 24u) & 0x3Fu;
                const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
                const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
                const u32 expectedAlpha5 = fullAlphaRamp[alphaRampOffset + shadowIndex];
                const u32 expectedAlpha8 = (expectedAlpha5 << 3u) | (expectedAlpha5 >> 2u);
                const u32 expectedColor = 0x00FFFFFFu | (expectedAlpha8 << 24u);
                const bool triangleCountMatches = shadowProtocolDrawCount == 7u
                    ? (draw.triangleCount == 4u || (shadowIndex == 3u && draw.triangleCount == 5u))
                    : (draw.triangleCount == (shadowIndex == 0u ? 1u : 4u));
                const bool shadowMatches =
                    draw.flags == expectedShadowFlags
                    && polyId == 6u
                    && alpha5 == expectedAlpha5
                    && triangleCountMatches
                    && blendMode == 3u
                    && (draw.polyAttr & (1u << 11u)) == 0u
                    && trianglesMatchProtocol(draw, false, 0u, 0u, 0u, expectedColor);
                if (!shadowMatches)
                {
                    allShadowsMatch = false;
                    break;
                }
            }
        }

        if (!allShadowsMatch)
            depthComplementShadowMaskDraw = nullptr;
    }

    if (!updateToonBuffer(context, toonTable))
        return false;

    if (!Triangles.empty())
        std::memcpy(triangleMapped, Triangles.data(), Triangles.size() * sizeof(TriangleGpu));
    if (!GraphicsVertices.empty())
        std::memcpy(graphicsVertexMapped, GraphicsVertices.data(), GraphicsVertices.size() * sizeof(GraphicsVertexGpu));
    if (!GraphicsSceneVertices.empty())
        std::memcpy(graphicsSceneVertexMapped, GraphicsSceneVertices.data(), GraphicsSceneVertices.size() * sizeof(GraphicsVertexGpu));
    if (!SharedGraphicsScene.EdgeIndices.empty())
        std::memcpy(graphicsEdgeIndexMapped, SharedGraphicsScene.EdgeIndices.data(), SharedGraphicsScene.EdgeIndices.size() * sizeof(u16));

    const int faithfulGraphicsDescriptorSlot = pingPongFiel
        ? static_cast<int>(IndiceCbFiel)
        : -1;
    updateGraphicsDescriptorSet(context, faithfulGraphicsDescriptorSlot);
    const VkDescriptorSet descriptorSet =
        getGraphicsDescriptorSet(context, faithfulGraphicsDescriptorSlot);
    if (descriptorSet == VK_NULL_HANDLE)
        return false;

    if (vkResetCommandBuffer(commandBuffer, 0) != VK_SUCCESS)
        return false;

    VkDescriptorSet boundGraphicsDescriptorSet = VK_NULL_HANDLE;
    const auto bindGraphicsDescriptorSetCached = [&](u32 textureDescriptorIndex = 0u) {
        const VkDescriptorSet nextSet = getGraphicsDescriptorSet(
            context, faithfulGraphicsDescriptorSlot, textureDescriptorIndex);
        if (boundGraphicsDescriptorSet == nextSet)
            return;
        vkCmdBindDescriptorSets(commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS,
            GraphicsPipelineLayout, 0, 1, &nextSet, 0, nullptr);
        boundGraphicsDescriptorSet = nextSet;
    };

    RasterPushConstants pushConstants{};
    pushConstants.width = renderWidth;
    pushConstants.height = renderHeight;
    pushConstants.clearColor = rgbaColor;
    pushConstants.clearDepth = clearDepth;
    pushConstants.triangleCount = static_cast<u32>(Triangles.size());
    const bool stormSsaoEnabled = MelonDSAndroid::VulkanRuntime::GetSsaoEnabled();
    const bool stormThickEdges = MelonDSAndroid::VulkanRuntime::GetThickHighResEdges() && ScaleFactor > 1;
    pushConstants.dispCnt = (dispCnt & 0xFFFFu)
        | (stormThickEdges ? (1u << 16u) : 0u)
        | (stormSsaoEnabled ? (1u << 17u) : 0u);
    pushConstants.alphaRef = alphaRef;
    pushConstants.fogColor = fogColor;
    pushConstants.fogOffset = fogOffset;
    pushConstants.fogShift = fogShift;
    pushConstants.clearAttr = clearAttr;
    for (u32 i = 0; i < 34; i++)
    {
        const u32 density = fogDensityTable != nullptr ? static_cast<u32>(fogDensityTable[i]) : 0u;
        pushConstants.fogDensityPacked[i / 4u] |= (density & 0xFFu) << ((i % 4u) * 8u);
    }
    for (u32 i = 0; i < 8; i++)
    {
        const u16 edgeColor = edgeColorTable != nullptr ? edgeColorTable[i] : 0u;
        u32 r = (edgeColor << 1u) & 0x3Eu;
        u32 g = (edgeColor >> 4u) & 0x3Eu;
        u32 b = (edgeColor >> 9u) & 0x3Eu;
        if (r) r++;
        if (g) g++;
        if (b) b++;
        pushConstants.edgeColorPacked[i] =
            ((r << 2u) | (r >> 4u)) |
            ((((g << 2u) | (g >> 4u)) & 0xFFu) << 8u) |
            ((((b << 2u) | (b >> 4u)) & 0xFFu) << 16u);
    }

    VkCommandBufferBeginInfo beginInfo{};
    beginInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO;
    beginInfo.flags = VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    if (vkBeginCommandBuffer(commandBuffer, &beginInfo) != VK_SUCCESS)
        return false;

    if (timestampQueryPool != VK_NULL_HANDLE && ResetQueryPool != nullptr)
    {
        ResetQueryPool(Device, timestampQueryPool, 0, TimestampQueryCount);
        timestampPending = true;
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT, timestampQueryPool, 0);
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT, timestampQueryPool, 1);
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT, timestampQueryPool, 2);
    }

    static const bool perfSecciones = [] {
        if (std::getenv("MELON_PERF_SECCIONES") != nullptr)
            return true;
#ifdef __ANDROID__
        char v[92] = {};
        if (__system_property_get("debug.melonds.perf_secciones", v) > 0)
            return v[0] == '1';
#endif
        return false;
    }();

    std::array<VkBufferMemoryBarrier, 6> graphicsReadBarriers{};
    u32 graphicsReadBarrierCount = 0;

    VkBufferMemoryBarrier triangleBufferBarrier{};
    triangleBufferBarrier.sType = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
    triangleBufferBarrier.srcAccessMask = VK_ACCESS_HOST_WRITE_BIT;
    triangleBufferBarrier.dstAccessMask = VK_ACCESS_SHADER_READ_BIT;
    triangleBufferBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    triangleBufferBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    triangleBufferBarrier.buffer = triangleBuffer;
    triangleBufferBarrier.offset = 0;
    triangleBufferBarrier.size = VK_WHOLE_SIZE;
    graphicsReadBarriers[graphicsReadBarrierCount++] = triangleBufferBarrier;

    VkBufferMemoryBarrier graphicsVertexBufferBarrier{};
    graphicsVertexBufferBarrier.sType = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
    graphicsVertexBufferBarrier.srcAccessMask = VK_ACCESS_HOST_WRITE_BIT;
    graphicsVertexBufferBarrier.dstAccessMask = VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT;
    graphicsVertexBufferBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    graphicsVertexBufferBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    graphicsVertexBufferBarrier.buffer = graphicsVertexBuffer;
    graphicsVertexBufferBarrier.offset = 0;
    graphicsVertexBufferBarrier.size = VK_WHOLE_SIZE;
    graphicsReadBarriers[graphicsReadBarrierCount++] = graphicsVertexBufferBarrier;

    VkBufferMemoryBarrier graphicsSceneVertexBufferBarrier{};
    graphicsSceneVertexBufferBarrier.sType = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
    graphicsSceneVertexBufferBarrier.srcAccessMask = VK_ACCESS_HOST_WRITE_BIT;
    graphicsSceneVertexBufferBarrier.dstAccessMask = VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT;
    graphicsSceneVertexBufferBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    graphicsSceneVertexBufferBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    graphicsSceneVertexBufferBarrier.buffer = graphicsSceneVertexBuffer;
    graphicsSceneVertexBufferBarrier.offset = 0;
    graphicsSceneVertexBufferBarrier.size = VK_WHOLE_SIZE;
    graphicsReadBarriers[graphicsReadBarrierCount++] = graphicsSceneVertexBufferBarrier;

    VkBufferMemoryBarrier graphicsEdgeIndexBufferBarrier{};
    graphicsEdgeIndexBufferBarrier.sType = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
    graphicsEdgeIndexBufferBarrier.srcAccessMask = VK_ACCESS_HOST_WRITE_BIT;
    graphicsEdgeIndexBufferBarrier.dstAccessMask = VK_ACCESS_INDEX_READ_BIT;
    graphicsEdgeIndexBufferBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    graphicsEdgeIndexBufferBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    graphicsEdgeIndexBufferBarrier.buffer = graphicsEdgeIndexBuffer;
    graphicsEdgeIndexBufferBarrier.offset = 0;
    graphicsEdgeIndexBufferBarrier.size = VK_WHOLE_SIZE;
    graphicsReadBarriers[graphicsReadBarrierCount++] = graphicsEdgeIndexBufferBarrier;

    if (toonBuffer != VK_NULL_HANDLE)
    {
        VkBufferMemoryBarrier toonBufferBarrier{};
        toonBufferBarrier.sType = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
        toonBufferBarrier.srcAccessMask = VK_ACCESS_HOST_WRITE_BIT;
        toonBufferBarrier.dstAccessMask = VK_ACCESS_SHADER_READ_BIT;
        toonBufferBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        toonBufferBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        toonBufferBarrier.buffer = toonBuffer;
        toonBufferBarrier.offset = 0;
        toonBufferBarrier.size = VK_WHOLE_SIZE;
        graphicsReadBarriers[graphicsReadBarrierCount++] = toonBufferBarrier;
    }

    if (clearBuffer != VK_NULL_HANDLE)
    {
        VkBufferMemoryBarrier clearBufferBarrier{};
        clearBufferBarrier.sType = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
        clearBufferBarrier.srcAccessMask = VK_ACCESS_HOST_WRITE_BIT;
        clearBufferBarrier.dstAccessMask = VK_ACCESS_SHADER_READ_BIT;
        clearBufferBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        clearBufferBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        clearBufferBarrier.buffer = clearBuffer;
        clearBufferBarrier.offset = 0;
        clearBufferBarrier.size = VK_WHOLE_SIZE;
        graphicsReadBarriers[graphicsReadBarrierCount++] = clearBufferBarrier;
    }

    vkCmdPipelineBarrier(
        commandBuffer,
        VK_PIPELINE_STAGE_HOST_BIT,
        VK_PIPELINE_STAGE_VERTEX_INPUT_BIT | VK_PIPELINE_STAGE_VERTEX_SHADER_BIT | VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT,
        0,
        0,
        nullptr,
        graphicsReadBarrierCount,
        graphicsReadBarriers.data(),
        0,
        nullptr
    );

    std::array<VkImageMemoryBarrier, 4> rasterAttachmentBarriers{};
    for (VkImageMemoryBarrier& barrier : rasterAttachmentBarriers)
    {
        barrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
        barrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        barrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        barrier.subresourceRange.baseMipLevel = 0;
        barrier.subresourceRange.levelCount = 1;
        barrier.subresourceRange.baseArrayLayer = 0;
        barrier.subresourceRange.layerCount = 1;
    }

    rasterAttachmentBarriers[0].image = RasterColorImage;
    rasterAttachmentBarriers[0].srcAccessMask = ColorImageInitialized
        ? (VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT | VK_ACCESS_SHADER_READ_BIT | VK_ACCESS_TRANSFER_READ_BIT)
        : 0u;
    rasterAttachmentBarriers[0].dstAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
    rasterAttachmentBarriers[0].oldLayout = ColorImageInitialized
        ? VK_IMAGE_LAYOUT_GENERAL
        : VK_IMAGE_LAYOUT_UNDEFINED;
    rasterAttachmentBarriers[0].newLayout = VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
    rasterAttachmentBarriers[0].subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;

    rasterAttachmentBarriers[1].image = AttrImage;
    rasterAttachmentBarriers[1].srcAccessMask = ColorImageInitialized
        ? (VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT | VK_ACCESS_SHADER_READ_BIT)
        : 0u;
    rasterAttachmentBarriers[1].dstAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
    rasterAttachmentBarriers[1].oldLayout = ColorImageInitialized
        ? VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL
        : VK_IMAGE_LAYOUT_UNDEFINED;
    rasterAttachmentBarriers[1].newLayout = VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
    rasterAttachmentBarriers[1].subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;

    u32 rasterAttachmentBarrierCount = 0u;
    if (usesGraphicsProductResources)
    {
        rasterAttachmentBarriers[2].image = DepthStencilImage;
        rasterAttachmentBarriers[2].srcAccessMask = ColorImageInitialized
            ? (VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT | VK_ACCESS_SHADER_READ_BIT)
            : 0u;
        rasterAttachmentBarriers[2].dstAccessMask =
            VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT | VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
        rasterAttachmentBarriers[2].oldLayout = ColorImageInitialized
            ? VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL
            : VK_IMAGE_LAYOUT_UNDEFINED;
        rasterAttachmentBarriers[2].newLayout = VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL;
        rasterAttachmentBarriers[2].subresourceRange.aspectMask = VK_IMAGE_ASPECT_DEPTH_BIT | VK_IMAGE_ASPECT_STENCIL_BIT;
        rasterAttachmentBarrierCount = 3u;
    }
    else
    {
        rasterAttachmentBarriers[2].image = logicalDepthImage;
        rasterAttachmentBarriers[2].srcAccessMask = ColorImageInitialized
            ? (VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT | VK_ACCESS_SHADER_READ_BIT)
            : 0u;
        rasterAttachmentBarriers[2].dstAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
        rasterAttachmentBarriers[2].oldLayout = ColorImageInitialized
            ? VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL
            : VK_IMAGE_LAYOUT_UNDEFINED;
        rasterAttachmentBarriers[2].newLayout = VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
        rasterAttachmentBarriers[2].subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;

        rasterAttachmentBarriers[3].image = DepthStencilImage;
        rasterAttachmentBarriers[3].srcAccessMask = ColorImageInitialized
            ? VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT
            : 0u;
        rasterAttachmentBarriers[3].dstAccessMask =
            VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT | VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
        rasterAttachmentBarriers[3].oldLayout = ColorImageInitialized
            ? VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL
            : VK_IMAGE_LAYOUT_UNDEFINED;
        rasterAttachmentBarriers[3].newLayout = VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL;
        rasterAttachmentBarriers[3].subresourceRange.aspectMask = VK_IMAGE_ASPECT_DEPTH_BIT | VK_IMAGE_ASPECT_STENCIL_BIT;
        rasterAttachmentBarrierCount = 4u;
    }

    const VkPipelineStageFlags rasterAttachmentSrcStage = ColorImageInitialized
        ? VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT | VK_PIPELINE_STAGE_TRANSFER_BIT | VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT
        : VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT;
    vkCmdPipelineBarrier(
        commandBuffer,
        rasterAttachmentSrcStage,
        VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT,
        0,
        0,
        nullptr,
        0,
        nullptr,
        rasterAttachmentBarrierCount,
        rasterAttachmentBarriers.data()
    );

    VkViewport viewport{};
    viewport.x = 0.0f;
    viewport.y = 0.0f;
    viewport.width = static_cast<float>(renderWidth);
    viewport.height = static_cast<float>(renderHeight);
    viewport.minDepth = 0.0f;
    viewport.maxDepth = 1.0f;
    VkRect2D scissor{};
    scissor.extent.width = renderWidth;
    scissor.extent.height = renderHeight;
    const VkRect2D fullGraphicsScissor = scissor;

    auto unpackNormalizedByte = [](u32 value) -> float {
        return static_cast<float>(value & 0xFFu) * (1.0f / 255.0f);
    };
    const float clearDepthNormalized = static_cast<float>(clearDepth) * (1.0f / 16777215.0f);
    const float clearFog = ((clearAttr >> 15u) & 0x1u) != 0u ? 1.0f : 0.0f;
    const float clearPolyId = static_cast<float>((clearAttr >> 24u) & 0x3Fu) * (1.0f / 63.0f);

    std::array<VkClearValue, 4> clearValues{};
    clearValues[0].color.float32[0] = unpackNormalizedByte(rgbaColor);
    clearValues[0].color.float32[1] = unpackNormalizedByte(rgbaColor >> 8u);
    clearValues[0].color.float32[2] = unpackNormalizedByte(rgbaColor >> 16u);
    clearValues[0].color.float32[3] = unpackNormalizedByte(rgbaColor >> 24u);
    clearValues[1].color.float32[0] = clearPolyId;

    clearValues[1].color.float32[1] = clearFog != 0.0f ? 0.5f : 0.0f;
    clearValues[1].color.float32[2] = 0.0f;
    clearValues[1].color.float32[3] = 1.0f;
    clearValues[2].color.float32[0] = clearDepthNormalized;
    clearValues[3].depthStencil.depth = clearDepthNormalized;
    clearValues[3].depthStencil.stencil = 0xFFu;

    const bool useBitmapClear = (dispCnt & (1u << 14u)) != 0u;
    const auto preCanSkipOpaqueAttrWrite = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (!usesGraphicsProductResources)
            return false;
        if (useBitmapClear)
            return false;

        const u32 drawPolyId = (draw.polyAttr >> 24u) & 0x3Fu;
        const u32 clearPolyIdForDraw = (clearAttr >> 24u) & 0x3Fu;
        if (drawPolyId != clearPolyIdForDraw)
            return false;
        if ((draw.polyAttr & (1u << 11u)) != 0u)
            return false;

        const bool clearFogFlag = (clearAttr & (1u << 15u)) != 0u;
        const bool drawFogFlag = (draw.polyAttr & (1u << 15u)) != 0u;
        return !clearFogFlag && !drawFogFlag;
    };
    std::vector<u8> colorOnlyOpaqueDrawSelected(GraphicsPolygons.size(), 0u);
    u32 colorOnlyOpaqueDrawCount = 0u;
    bool colorOnlyDepthWriteSeen = false;
    constexpr bool kEnableColorOnlyOpaquePrepass = false;
    if (usesGraphicsProductResources && kEnableColorOnlyOpaquePrepass && !useBitmapClear)
    {
        for (u32 drawIndex : GraphicsOpaqueDrawIndices)
        {
            if (drawIndex >= GraphicsPolygons.size())
                continue;

            const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
            const bool drawDepthWriteEnabled = (draw.polyAttr & (1u << 11u)) != 0u;
            const TriangleGpu* firstTriangle = draw.firstTriangle < Triangles.size() ? &Triangles[draw.firstTriangle] : nullptr;
            const u32 firstTriangleFlags = firstTriangle != nullptr ? firstTriangle->flags : 0u;
            const bool colorOnlyCandidate =
                preCanSkipOpaqueAttrWrite(draw)
                && !colorOnlyDepthWriteSeen
                && !drawDepthWriteEnabled
                && firstTriangle != nullptr
                && (firstTriangleFlags & kTriangleFlagWBuffer) != 0u
                && (firstTriangleFlags & kTriangleFlagTextured) != 0u
                && (firstTriangleFlags & kTriangleFlagDecal) == 0u
                && (firstTriangleFlags & kTriangleFlagLinear) == 0u
                && ((draw.polyAttr >> 16u) & 0x1Fu) == 0x1Fu
                && ((draw.polyAttr >> 4u) & 0x3u) == 0u;
            if (colorOnlyCandidate)
            {
                const bool wBuffer = (firstTriangleFlags & kTriangleFlagWBuffer) != 0u;
                const u32 wMode = wBuffer ? 1u : 0u;
                const u32 depthCompareMode = (draw.polyAttr & (1u << 14u)) != 0u ? 1u : 0u;
                const u32 pipelineIndex = (wMode * GraphicsDepthCompareModeCount) + depthCompareMode;
                if (pipelineIndex < GraphicsOpaqueFastModulateOpaqueAlphaPlainColorOnlyPipelines.size()
                    && GraphicsOpaqueFastModulateOpaqueAlphaPlainColorOnlyPipelines[pipelineIndex] != VK_NULL_HANDLE)
                {
                    colorOnlyOpaqueDrawSelected[drawIndex] = 1u;
                    colorOnlyOpaqueDrawCount++;
                }
            }
            if (drawDepthWriteEnabled)
                colorOnlyDepthWriteSeen = true;
        }
    }

    const bool fotogramaNecesitaEdgeR3b =
        stormSsaoEnabled || ((dispCnt & (1u << 5u)) != 0u
        && (GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride < 64u
            || std::any_of(
                GraphicsPolygons.begin(),
                GraphicsPolygons.end(),
                [](const GraphicsPolygonDraw& d) {
                    return (d.flags & AcceleratedPolygonFlagShadowMask) == 0u
                        && d.edgeIndexCount != 0u;
                })));

    const bool nieblaDensidadNoCero =
        fogDensityTable != nullptr
        && std::any_of(fogDensityTable, fogDensityTable + 34,
                       [](u8 density) { return density != 0u; });
    const bool fotogramaNecesitaNieblaR3b =
        (dispCnt & (1u << 7u)) != 0u
        && nieblaDensidadNoCero
        && (((clearAttr & (1u << 15u)) != 0u)
            || std::any_of(
                GraphicsPolygons.begin(),
                GraphicsPolygons.end(),
                [&](const GraphicsPolygonDraw& d) {
                    return (d.polyAttr & (1u << 15u)) != 0u;
                }));
    static const bool sinR3b = std::getenv("MELON_SIN_R3B") != nullptr;
    const bool usarPassSinEscritura =
        usesGraphicsProductResources
        && !sinR3b
        && GraphicsRasterSinEscrituraRenderPass != VK_NULL_HANDLE
        && !fotogramaNecesitaEdgeR3b
        && !fotogramaNecesitaNieblaR3b

        && !captureReadbackPath;

    {
        static int g1UltimoSinEscritura = -1;
        if (static_cast<int>(usarPassSinEscritura) != g1UltimoSinEscritura)
        {
            g1UltimoSinEscritura = static_cast<int>(usarPassSinEscritura);
            Log(LogLevel::Warn,
                "VulkanG1: sinEscritura=%d (edgeR3b=%d nieblaR3b=%d densidad=%d clear15=%d)\n",
                g1UltimoSinEscritura,
                fotogramaNecesitaEdgeR3b ? 1 : 0,
                fotogramaNecesitaNieblaR3b ? 1 : 0,
                nieblaDensidadNoCero ? 1 : 0,
                (clearAttr & (1u << 15u)) != 0u ? 1 : 0);
        }
    }

    VkRenderPassBeginInfo rasterBeginInfo{};
    rasterBeginInfo.sType = VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO;
    rasterBeginInfo.renderPass = usarPassSinEscritura
        ? GraphicsRasterSinEscrituraRenderPass
        : GraphicsRasterRenderPass;
    rasterBeginInfo.framebuffer = GraphicsRasterFramebuffer;
    rasterBeginInfo.renderArea.extent.width = renderWidth;
    rasterBeginInfo.renderArea.extent.height = renderHeight;
    rasterBeginInfo.clearValueCount = static_cast<u32>(clearValues.size());
    rasterBeginInfo.pClearValues = clearValues.data();

    if (usesGraphicsProductResources && colorOnlyOpaqueDrawCount > 0u)
    {
        vkCmdBeginRenderPass(commandBuffer, &rasterBeginInfo, VK_SUBPASS_CONTENTS_INLINE);
        vkCmdSetViewport(commandBuffer, 0, 1, &viewport);
        vkCmdSetScissor(commandBuffer, 0, 1, &scissor);
        vkCmdEndRenderPass(commandBuffer);

        VkRenderPassBeginInfo colorOnlyBeginInfo{};
        colorOnlyBeginInfo.sType = VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO;
        colorOnlyBeginInfo.renderPass = GraphicsColorOnlyRenderPass;
        colorOnlyBeginInfo.framebuffer = GraphicsColorOnlyFramebuffer;
        colorOnlyBeginInfo.renderArea.extent.width = renderWidth;
        colorOnlyBeginInfo.renderArea.extent.height = renderHeight;
        vkCmdBeginRenderPass(commandBuffer, &colorOnlyBeginInfo, VK_SUBPASS_CONTENTS_INLINE);
        vkCmdSetViewport(commandBuffer, 0, 1, &viewport);
        vkCmdSetScissor(commandBuffer, 0, 1, &scissor);
        bindGraphicsDescriptorSetCached();
        const VkDeviceSize colorOnlyVertexOffset = MitadVerticesActiva;
        vkCmdBindVertexBuffers(commandBuffer, 0, 1, &graphicsVertexBuffer, &colorOnlyVertexOffset);
        for (u32 drawIndex : GraphicsOpaqueDrawIndices)
        {
            if (drawIndex >= GraphicsPolygons.size() || colorOnlyOpaqueDrawSelected[drawIndex] == 0u)
                continue;

            const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
            if (draw.firstTriangle >= Triangles.size())
                continue;

            const TriangleGpu& firstTriangle = Triangles[draw.firstTriangle];
            const bool wBuffer = (firstTriangle.flags & kTriangleFlagWBuffer) != 0u;
            const u32 wMode = wBuffer ? 1u : 0u;
            const u32 depthCompareMode = (draw.polyAttr & (1u << 14u)) != 0u ? 1u : 0u;
            const u32 pipelineIndex = (wMode * GraphicsDepthCompareModeCount) + depthCompareMode;
            if (pipelineIndex >= GraphicsOpaqueFastModulateOpaqueAlphaPlainColorOnlyPipelines.size())
                continue;
            const VkPipeline colorOnlyPipeline = GraphicsOpaqueFastModulateOpaqueAlphaPlainColorOnlyPipelines[pipelineIndex];
            if (colorOnlyPipeline == VK_NULL_HANDLE)
                continue;

            vkCmdBindPipeline(commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, colorOnlyPipeline);
            bindGraphicsDescriptorSetCached(firstTriangle.texArrayIndex);
            pushConstants.depthBlendMode = draw.polyAttr;
            pushConstants.variantKey = ((firstTriangle.texLayer & 0xFFFFu) << 16u) | (firstTriangle.texArrayIndex & 0xFFFFu);
            pushConstants.passIndex = ((firstTriangle.texHeight & 0xFFFFu) << 16u) | (firstTriangle.texWidth & 0xFFFFu);
            pushConstants.triangleBase = firstTriangle.texParam;
            pushConstants.triangleCount = draw.triangleCount;
            vkCmdPushConstants(commandBuffer, GraphicsPipelineLayout, VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(pushConstants), &pushConstants);
            vkCmdSetScissor(commandBuffer, 0, 1, &scissor);
            vkCmdDraw(commandBuffer, draw.triangleCount * 3u, 1u, draw.firstTriangle * 3u, 0u);
        }
        vkCmdEndRenderPass(commandBuffer);

        std::array<VkImageMemoryBarrier, 2> rasterLoadAttachmentBarriers{};
        rasterLoadAttachmentBarriers[0].sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
        rasterLoadAttachmentBarriers[0].srcAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
        rasterLoadAttachmentBarriers[0].dstAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
        rasterLoadAttachmentBarriers[0].oldLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
        rasterLoadAttachmentBarriers[0].newLayout = VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
        rasterLoadAttachmentBarriers[0].srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        rasterLoadAttachmentBarriers[0].dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        rasterLoadAttachmentBarriers[0].image = AttrImage;
        rasterLoadAttachmentBarriers[0].subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
        rasterLoadAttachmentBarriers[0].subresourceRange.levelCount = 1;
        rasterLoadAttachmentBarriers[0].subresourceRange.layerCount = 1;
        rasterLoadAttachmentBarriers[1].sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
        rasterLoadAttachmentBarriers[1].srcAccessMask = VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
        rasterLoadAttachmentBarriers[1].dstAccessMask = VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT | VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
        rasterLoadAttachmentBarriers[1].oldLayout = VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL;
        rasterLoadAttachmentBarriers[1].newLayout = VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL;
        rasterLoadAttachmentBarriers[1].srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        rasterLoadAttachmentBarriers[1].dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        rasterLoadAttachmentBarriers[1].image = DepthStencilImage;
        rasterLoadAttachmentBarriers[1].subresourceRange.aspectMask = VK_IMAGE_ASPECT_DEPTH_BIT | VK_IMAGE_ASPECT_STENCIL_BIT;
        rasterLoadAttachmentBarriers[1].subresourceRange.levelCount = 1;
        rasterLoadAttachmentBarriers[1].subresourceRange.layerCount = 1;
        vkCmdPipelineBarrier(
            commandBuffer,
            VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT,
            VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT,
            0,
            0,
            nullptr,
            0,
            nullptr,
            static_cast<u32>(rasterLoadAttachmentBarriers.size()),
            rasterLoadAttachmentBarriers.data()
        );

        rasterBeginInfo.renderPass = GraphicsRasterLoadRenderPass;
        rasterBeginInfo.framebuffer = GraphicsRasterLoadFramebuffer;
    }

    vkCmdBeginRenderPass(commandBuffer, &rasterBeginInfo, VK_SUBPASS_CONTENTS_INLINE);
    vkCmdSetViewport(commandBuffer, 0, 1, &viewport);
    vkCmdSetScissor(commandBuffer, 0, 1, &scissor);

    if (useBitmapClear && GraphicsClearPipeline != VK_NULL_HANDLE)
    {
        vkCmdBindPipeline(commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, GraphicsClearPipeline);
        bindGraphicsDescriptorSetCached();
        vkCmdPushConstants(commandBuffer, GraphicsPipelineLayout, VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(pushConstants), &pushConstants);
        vkCmdSetStencilCompareMask(commandBuffer, VK_STENCIL_FACE_FRONT_AND_BACK, 0xFFu);
        vkCmdSetStencilWriteMask(commandBuffer, VK_STENCIL_FACE_FRONT_AND_BACK, 0xFFu);
        vkCmdSetStencilReference(commandBuffer, VK_STENCIL_FACE_FRONT_AND_BACK, 0xFFu);
        vkCmdDraw(commandBuffer, 3u, 1u, 0u, 0u);
    }

    const VkDeviceSize graphicsVertexOffset = MitadVerticesActiva;
    vkCmdBindVertexBuffers(commandBuffer, 0, 1, &graphicsVertexBuffer, &graphicsVertexOffset);

    const u64 graphicsMainCpuStartNs = PerfNowNs();
    u32 drawCount = 0;
    struct GraphicsPassDebugStats
    {
        u32 opaque = 0;
        u32 edge = 0;
        u32 bgZeroShadowMask = 0;
        u32 bgZeroNeedOpaque = 0;
        u32 bgZeroShadowBlend = 0;
        u32 bgZeroTranslucent = 0;
        u32 bgZeroShadowSkippedPolyId = 0;
        u32 mainShadowMask = 0;
        u32 mainNeedOpaque = 0;
        u32 mainShadowClear = 0;
        u32 mainShadowBlend = 0;
        u32 mainTranslucent = 0;
        u32 paletteUiOpaqueReplay = 0;
        u32 wBufferFragmentDepth = 0;
        u32 opaqueNoAttr = 0;
        u32 opaqueReverseOcclusion = 0;
        u32 opaqueNoDepthNoAttr = 0;
        u32 opaqueOverwriteCulled = 0;
        u32 stencilBitClears = 0;
        u32 fastOpaqueBatchCommands = 0;
        u32 fastOpaqueBatchSavedDraws = 0;
        u32 denseOpaqueFastCandidates = 0;
        u32 denseOpaqueFastPipelineMisses = 0;
        u32 denseOpaqueNoAttrPolyIdMisses = 0;
        u32 denseOpaqueNoAttrDepthMisses = 0;
        u32 denseOpaqueNoAttrFogMisses = 0;
        u32 denseOpaqueBatchBreakNonContiguous = 0;
        u32 denseOpaqueBatchBreakPolyAttr = 0;
        u32 denseOpaqueBatchBreakPipeline = 0;
        u32 denseOpaqueBatchBreakTexture = 0;
        u32 denseOpaqueBatchBreakOther = 0;
        u32 denseOpaqueBatchBreakPolyIdOnly = 0;
        u32 denseOpaqueBatchBreakPolyDepthOnly = 0;
        u32 denseOpaqueBatchBreakPolyFogOnly = 0;
        u32 denseOpaqueBatchBreakPolyAlphaOnly = 0;
        u32 denseOpaqueBatchBreakPolyMiscOnly = 0;
        u32 fogWriteOpaque = 0;
        u32 fogWriteAlpha = 0;
    } graphicsPassDebugStats{};

    enum class GraphicsDebugPassKind : u32
    {
        Other = 0,
        Opaque = 1,
        Alpha = 2,
    };
    GraphicsDebugPassKind currentGraphicsDebugPassKind = GraphicsDebugPassKind::Other;
    VkPipeline boundGraphicsPipeline =
        (useBitmapClear && GraphicsClearPipeline != VK_NULL_HANDLE)
            ? GraphicsClearPipeline
            : VK_NULL_HANDLE;
    u32 boundStencilCompareMask = std::numeric_limits<u32>::max();
    u32 boundStencilWriteMask = std::numeric_limits<u32>::max();
    u32 boundStencilReference = std::numeric_limits<u32>::max();
    VkRect2D boundGraphicsScissor = fullGraphicsScissor;
    const auto bindGraphicsPipelineCached = [&](VkPipeline pipeline) {
        if (boundGraphicsPipeline == pipeline)
            return;
        vkCmdBindPipeline(commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, pipeline);
        boundGraphicsPipeline = pipeline;
    };
    const auto setStencilStateCached = [&](u32 compareMask, u32 writeMask, u32 reference) {
        if (boundStencilCompareMask != compareMask)
        {
            vkCmdSetStencilCompareMask(commandBuffer, VK_STENCIL_FACE_FRONT_AND_BACK, compareMask);
            boundStencilCompareMask = compareMask;
        }
        if (boundStencilWriteMask != writeMask)
        {
            vkCmdSetStencilWriteMask(commandBuffer, VK_STENCIL_FACE_FRONT_AND_BACK, writeMask);
            boundStencilWriteMask = writeMask;
        }
        if (boundStencilReference != reference)
        {
            vkCmdSetStencilReference(commandBuffer, VK_STENCIL_FACE_FRONT_AND_BACK, reference);
            boundStencilReference = reference;
        }
    };
    const auto setGraphicsScissorCached = [&](const VkRect2D& nextScissor) {
        if (boundGraphicsScissor.offset.x == nextScissor.offset.x
            && boundGraphicsScissor.offset.y == nextScissor.offset.y
            && boundGraphicsScissor.extent.width == nextScissor.extent.width
            && boundGraphicsScissor.extent.height == nextScissor.extent.height)
        {
            return;
        }

        vkCmdSetScissor(commandBuffer, 0, 1, &nextScissor);
        boundGraphicsScissor = nextScissor;
    };
    const auto fullGraphicsScissorCached = [&]() {
        setGraphicsScissorCached(fullGraphicsScissor);
    };
    const auto unionGraphicsScissor = [](const VkRect2D& a, const VkRect2D& b) -> VkRect2D {
        const int32_t left = std::min(a.offset.x, b.offset.x);
        const int32_t top = std::min(a.offset.y, b.offset.y);
        const int32_t right = std::max(
            a.offset.x + static_cast<int32_t>(a.extent.width),
            b.offset.x + static_cast<int32_t>(b.extent.width));
        const int32_t bottom = std::max(
            a.offset.y + static_cast<int32_t>(a.extent.height),
            b.offset.y + static_cast<int32_t>(b.extent.height));

        VkRect2D merged{};
        merged.offset.x = left;
        merged.offset.y = top;
        merged.extent.width = static_cast<u32>(std::max(0, right - left));
        merged.extent.height = static_cast<u32>(std::max(0, bottom - top));
        return merged;
    };
    bool hasFinalActiveScissor = false;
    VkRect2D finalActiveScissor = fullGraphicsScissor;
    const auto includeFinalActiveScissor = [&](const VkRect2D& nextScissor) {
        if (nextScissor.extent.width == 0u || nextScissor.extent.height == 0u)
            return;
        finalActiveScissor = hasFinalActiveScissor
            ? unionGraphicsScissor(finalActiveScissor, nextScissor)
            : nextScissor;
        hasFinalActiveScissor = true;
    };
    const auto drawGraphicsScissor = [&](const GraphicsPolygonDraw& draw) -> VkRect2D {
        VkRect2D drawScissor = fullGraphicsScissor;
        if (draw.triangleCount == 0u || draw.firstTriangle >= Triangles.size())
            return drawScissor;

        const u32 triangleEnd = std::min<u32>(
            static_cast<u32>(Triangles.size()),
            draw.firstTriangle + draw.triangleCount);
        u32 yTop = ColorImageHeight;
        u32 yBottom = 0u;
        float minX = static_cast<float>(ColorImageWidth);
        float maxX = 0.0f;
        bool hasFiniteX = false;
        for (u32 triangleIndex = draw.firstTriangle; triangleIndex < triangleEnd; triangleIndex++)
        {
            const TriangleGpu& triangle = Triangles[triangleIndex];
            const u32 triangleYBounds = triangle.yBounds;
            const u32 triangleYTop = triangleYBounds & 0xFFFFu;
            const u32 triangleYBottom = (triangleYBounds >> 16u) & 0xFFFFu;
            if (triangleYBottom > triangleYTop)
            {
                yTop = std::min(yTop, triangleYTop);
                yBottom = std::max(yBottom, triangleYBottom);
            }

            const float triangleMinX = std::min({triangle.x0, triangle.x1, triangle.x2});
            const float triangleMaxX = std::max({triangle.x0, triangle.x1, triangle.x2});
            if (std::isfinite(triangleMinX) && std::isfinite(triangleMaxX))
            {
                minX = hasFiniteX ? std::min(minX, triangleMinX) : triangleMinX;
                maxX = hasFiniteX ? std::max(maxX, triangleMaxX) : triangleMaxX;
                hasFiniteX = true;
            }
        }

        if (yBottom <= yTop || yTop >= ColorImageHeight)
            return drawScissor;

        const u32 yPadding = std::max<u32>(2u, effectiveRasterScale);
        const u32 clippedTop = yTop > yPadding ? yTop - yPadding : 0u;
        const u32 clippedBottom = std::min<u32>(ColorImageHeight, yBottom + yPadding);
        if (clippedBottom <= clippedTop)
            return drawScissor;

        if (hasFiniteX && maxX > minX)
        {
            const int32_t xPadding = static_cast<int32_t>(
                std::max<u32>(4u, effectiveRasterScale * 2u));
            const int32_t clippedLeft = std::max<int32_t>(
                0,
                static_cast<int32_t>(std::floor(minX)) - xPadding);
            const int32_t clippedRight = std::min<int32_t>(
                static_cast<int32_t>(ColorImageWidth),
                static_cast<int32_t>(std::ceil(maxX)) + xPadding);
            if (clippedRight > clippedLeft)
            {
                drawScissor.offset.x = clippedLeft;
                drawScissor.extent.width = static_cast<u32>(clippedRight - clippedLeft);
            }
        }

        drawScissor.offset.y = static_cast<int32_t>(clippedTop);
        drawScissor.extent.height = clippedBottom - clippedTop;
        return drawScissor;
    };

    const auto opaquePipelineIndexFor = [&](const GraphicsPolygonDraw& draw) -> u32 {
        const bool wBuffer = draw.triangleCount > 0u
            && draw.firstTriangle < Triangles.size()
            && ((Triangles[draw.firstTriangle].flags & kTriangleFlagWBuffer) != 0u);
        const u32 wMode = wBuffer ? 1u : 0u;
        const u32 depthCompareMode = (draw.polyAttr & (1u << 14u)) != 0u ? 1u : 0u;
        return (wMode * GraphicsDepthCompareModeCount) + depthCompareMode;
    };
    const auto requiresWBufferFragmentDepth = [&](const GraphicsPolygonDraw& draw) -> bool {

        static const bool sondaSinWDepth = [] {
            if (std::getenv("MELON_SONDA_SIN_WDEPTH") != nullptr)
                return true;
#ifdef __ANDROID__
            char v[92] = {};
            if (__system_property_get("debug.melonds.sonda_sin_wdepth", v) > 0)
                return v[0] == '1';
#endif
            return false;
        }();
        if (sondaSinWDepth)
            return false;
        if (draw.triangleCount == 0u || draw.firstTriangle >= Triangles.size())
            return false;

        const TriangleGpu& firstTriangle = Triangles[draw.firstTriangle];
        const u32 flags = firstTriangle.flags;
        if ((flags & kTriangleFlagWBuffer) == 0u
            || (flags & kTriangleFlagTextured) == 0u
            || (flags & kTriangleFlagDecal) != 0u
            || (flags & kTriangleFlagLinear) != 0u)
        {
            return false;
        }

        const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
        const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
        const bool repeatOrMirror =
            (firstTriangle.texParam & ((1u << 16u) | (1u << 17u) | (1u << 18u) | (1u << 19u))) != 0u;
        if (alpha5 != 0x1Fu || blendMode != 0u || !repeatOrMirror)
            return false;

        if (draw.firstVertex >= GraphicsSceneVertices.size())
            return false;

        const u32 vertexEnd = std::min<u32>(
            static_cast<u32>(GraphicsSceneVertices.size()),
            draw.firstVertex + draw.vertexCount);
        if (vertexEnd <= draw.firstVertex + 1u)
            return false;

        const u32 triangleEnd = std::min<u32>(
            static_cast<u32>(Triangles.size()),
            draw.firstTriangle + draw.triangleCount);
        const float firstRawW = firstTriangle.w0;
        for (u32 triangleIndex = draw.firstTriangle; triangleIndex < triangleEnd; triangleIndex++)
        {
            const TriangleGpu& triangle = Triangles[triangleIndex];
            if (triangle.w0 != firstRawW
                || triangle.w1 != firstRawW
                || triangle.w2 != firstRawW)
            {
                return true;
            }
        }
        return false;
    };

    static const bool sondaFsBarato = [] {
        if (std::getenv("MELON_SONDA_FS_BARATO") != nullptr)
            return true;
#ifdef __ANDROID__
        char v[92] = {};
        if (__system_property_get("debug.melonds.sonda_fs_barato", v) > 0)
            return v[0] == '1';
#endif
        return false;
    }();
    const auto sondaPipelineBarato = [&](const GraphicsPolygonDraw& draw, u32 pipelineIndex) -> VkPipeline {
        const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
        const auto& arreglo = (alpha5 == 0x1Fu)
            ? GraphicsOpaqueFragmentDepthPrepassPipelines
            : GraphicsOpaqueAlphaFragmentDepthPrepassPipelines;
        if (pipelineIndex < arreglo.size())
            return arreglo[pipelineIndex];
        return VK_NULL_HANDLE;
    };
    const auto opaquePipelineFor = [&](const GraphicsPolygonDraw& draw, u32 pipelineIndex, bool noAttr) -> VkPipeline {
        if (sondaFsBarato)
        {
            const VkPipeline barato = sondaPipelineBarato(draw, pipelineIndex);
            if (barato != VK_NULL_HANDLE)
                return barato;
        }
        if (requiresWBufferFragmentDepth(draw))
        {
            graphicsPassDebugStats.wBufferFragmentDepth++;
            if (pipelineIndex < GraphicsOpaqueFragmentDepthPipelines.size()
                && GraphicsOpaqueFragmentDepthPipelines[pipelineIndex] != VK_NULL_HANDLE)
            {
                return GraphicsOpaqueFragmentDepthPipelines[pipelineIndex];
            }
        }
        if (noAttr
            && pipelineIndex < GraphicsOpaqueNoAttrPipelines.size()
            && GraphicsOpaqueNoAttrPipelines[pipelineIndex] != VK_NULL_HANDLE)
        {
            return GraphicsOpaqueNoAttrPipelines[pipelineIndex];
        }
        return pipelineIndex < GraphicsOpaquePipelines.size()
            ? GraphicsOpaquePipelines[pipelineIndex]
            : VK_NULL_HANDLE;
    };
    const auto bgZeroTranslucentPipelineIndexFor = [&](const GraphicsPolygonDraw& draw, bool fogWrite) -> u32 {
        const bool wBuffer = draw.triangleCount > 0u
            && draw.firstTriangle < Triangles.size()
            && ((Triangles[draw.firstTriangle].flags & kTriangleFlagWBuffer) != 0u);
        const u32 wMode = wBuffer ? 1u : 0u;
        const u32 depthCompareMode = (draw.polyAttr & (1u << 14u)) != 0u ? 1u : 0u;
        const u32 depthWriteMode = (draw.polyAttr & (1u << 11u)) != 0u ? 1u : 0u;
        const u32 fogWriteMode = fogWrite ? 1u : 0u;
        return (((wMode * GraphicsDepthCompareModeCount) + depthCompareMode) * GraphicsDepthWriteModeCount + depthWriteMode)
            * GraphicsFogWriteModeCount
            + fogWriteMode;
    };
    const auto translucentPipelineIndexFor = [&](const GraphicsPolygonDraw& draw, bool fogWrite, bool alphaBlendEnabled) -> u32 {
        const bool wBuffer = draw.triangleCount > 0u
            && draw.firstTriangle < Triangles.size()
            && ((Triangles[draw.firstTriangle].flags & kTriangleFlagWBuffer) != 0u);
        const u32 wMode = wBuffer ? 1u : 0u;
        const u32 depthCompareMode = (draw.polyAttr & (1u << 14u)) != 0u ? 1u : 0u;
        const u32 depthWriteMode = (draw.polyAttr & (1u << 11u)) != 0u ? 1u : 0u;
        const u32 fogWriteMode = fogWrite ? 1u : 0u;
        const u32 alphaBlendMode = alphaBlendEnabled ? 1u : 0u;
        return ((((wMode * GraphicsDepthCompareModeCount) + depthCompareMode) * GraphicsDepthWriteModeCount + depthWriteMode)
            * GraphicsFogWriteModeCount
            + fogWriteMode)
            * GraphicsAlphaBlendModeCount
            + alphaBlendMode;
    };
    const auto fogWriteEnabledFor = [&](const GraphicsPolygonDraw& draw) -> bool {
        return ((dispCnt & (1u << 7u)) != 0u) && ((draw.polyAttr & (1u << 15u)) == 0u);
    };
    const auto fogFlagEnabledFor = [&](const GraphicsPolygonDraw& draw) -> bool {
        return ((dispCnt & (1u << 7u)) != 0u) && ((draw.polyAttr & (1u << 15u)) != 0u);
    };
    const bool frameNeedsEdgeAttr =
        (dispCnt & (1u << 5u)) != 0u
        && (GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride < 64u
            || std::any_of(
                GraphicsPolygons.begin(),
                GraphicsPolygons.end(),
                [](const GraphicsPolygonDraw& draw) {
                    return (draw.flags & AcceleratedPolygonFlagShadowMask) == 0u
                        && draw.edgeIndexCount != 0u;
                }));
    const bool frameHasAttrDependentPostPasses =
        !GraphicsAlphaDrawIndices.empty()
        || !GraphicsNeedOpaqueDrawIndices.empty()
        || !GraphicsShadowMaskDrawIndices.empty()
        || !GraphicsShadowDrawIndices.empty();
    const bool frameHasFogWriteCandidates =
        (dispCnt & (1u << 7u)) != 0u
        && (((clearAttr & (1u << 15u)) != 0u)
            || std::any_of(
                GraphicsPolygons.begin(),
                GraphicsPolygons.end(),
                [&](const GraphicsPolygonDraw& draw) {
                    return fogFlagEnabledFor(draw);
                }));
    const auto canSkipOpaqueAttrWrite = [&](const GraphicsPolygonDraw& draw) -> bool {
        constexpr bool kEnableOpaqueNoAttrFastPath = true;
        if (!usesGraphicsProductResources || !kEnableOpaqueNoAttrFastPath)
            return false;

        if (captureReadbackPath)
            return false;

        if (fogFlagEnabledFor(draw)
            || (fogWriteEnabledFor(draw) && frameHasFogWriteCandidates))
            return false;

        if (useBitmapClear || frameNeedsEdgeAttr)
            return false;

        if (frameHasAttrDependentPostPasses)
            return false;

        const bool clearFogFlag = (clearAttr & (1u << 15u)) != 0u;
        const bool drawFogFlag = (draw.polyAttr & (1u << 15u)) != 0u;
        if (!frameHasFogWriteCandidates)
            return true;
        return !clearFogFlag && !drawFogFlag;
    };
    const auto countOpaqueNoAttrMiss = [&](const GraphicsPolygonDraw& draw) {
        if (useBitmapClear || frameNeedsEdgeAttr || frameHasAttrDependentPostPasses)
        {
            graphicsPassDebugStats.denseOpaqueNoAttrFogMisses++;
            return;
        }

        const bool clearFogFlag = (clearAttr & (1u << 15u)) != 0u;
        const bool drawFogFlag = (draw.polyAttr & (1u << 15u)) != 0u;
        if ((frameHasAttrDependentPostPasses || frameHasFogWriteCandidates)
            && (clearFogFlag || drawFogFlag))
        {
            graphicsPassDebugStats.denseOpaqueNoAttrFogMisses++;
        }
    };
    bool graphicsFogWriteObserved = false;
    const auto fastOpaqueModulatePipelineFor = [&](const GraphicsPolygonDraw& draw, u32 pipelineIndex, bool noAttr) -> VkPipeline {
        if (sondaFsBarato)
        {
            const VkPipeline barato = sondaPipelineBarato(draw, pipelineIndex);
            if (barato != VK_NULL_HANDLE)
                return barato;
        }
        if ((dispCnt & (1u << 0u)) == 0u
            || draw.firstTriangle >= Triangles.size()
            || pipelineIndex >= GraphicsOpaqueFastModulatePipelines.size())
        {
            return VK_NULL_HANDLE;
        }

        const u32 flags = Triangles[draw.firstTriangle].flags;
        const u32 texParam = Triangles[draw.firstTriangle].texParam;
        const bool requiresFragmentDepth = requiresWBufferFragmentDepth(draw);
        const u32 requiredFlags = kTriangleFlagWBuffer | kTriangleFlagTextured;
        const u32 disallowedFlags = rasterDispatchPolicy.allowLinearFastOpaqueModulate
            ? kTriangleFlagDecal
            : (kTriangleFlagDecal | kTriangleFlagLinear);
        if ((flags & requiredFlags) != requiredFlags || (flags & disallowedFlags) != 0u)
            return VK_NULL_HANDLE;
        const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
        const bool fullAlpha =
            (flags & kTriangleFlagTextureOpaque) != 0u
            && ((draw.polyAttr >> 16u) & 0x1Fu) == 0x1Fu
            && alphaRef < 0x1Fu;
        if (requiresFragmentDepth)
        {
            if (rasterDispatchPolicy.allowFastOpaqueFragmentDepthPipeline
                && fullAlpha
                && blendMode != 2u
                && pipelineIndex < GraphicsOpaqueFastModulateOpaqueAlphaPlainFragmentDepthPipelines.size())
            {
                VkPipeline pipeline = GraphicsOpaqueFastModulateOpaqueAlphaPlainFragmentDepthPipelines[pipelineIndex];
                if (pipeline != VK_NULL_HANDLE)
                    return pipeline;
            }
            constexpr u32 requiredNeedOpaqueFlags =
                AcceleratedPolygonFlagTranslucent | AcceleratedPolygonFlagNeedOpaquePass;
            if (rasterDispatchPolicy.allowFastOpaqueFragmentDepthPipeline
                && usesGraphicsProductResources
                && VulkanContext::Get().SupportsDynamicTextureIndexing()
                && !fullAlpha
                && blendMode == 0u
                && (flags & kTriangleFlagLinear) == 0u
                && (draw.flags & requiredNeedOpaqueFlags) == requiredNeedOpaqueFlags
                && (draw.flags & (AcceleratedPolygonFlagShadow | AcceleratedPolygonFlagShadowMask)) == 0u
                && pipelineIndex < GraphicsOpaqueFastModulatePlainFragmentDepthPipelines.size())
            {
                VkPipeline pipeline = GraphicsOpaqueFastModulatePlainFragmentDepthPipelines[pipelineIndex];
                if (pipeline != VK_NULL_HANDLE)
                    return pipeline;
            }
            return VK_NULL_HANDLE;
        }
        if (blendMode == 2u && (dispCnt & (1u << 1u)) == 0u)
        {
            if (fullAlpha)
            {
                VkPipeline pipeline = noAttr
                    ? GraphicsOpaqueFastModulateOpaqueAlphaToonNoAttrPipelines[pipelineIndex]
                    : GraphicsOpaqueFastModulateOpaqueAlphaToonPipelines[pipelineIndex];
                if (pipeline != VK_NULL_HANDLE)
                    return pipeline;
            }
            VkPipeline pipeline = noAttr
                ? GraphicsOpaqueFastModulateToonNoAttrPipelines[pipelineIndex]
                : GraphicsOpaqueFastModulateToonPipelines[pipelineIndex];
            if (pipeline != VK_NULL_HANDLE)
                return pipeline;
        }
        else if (blendMode != 2u)
        {
            if (fullAlpha)
            {
                VkPipeline pipeline = noAttr
                    ? GraphicsOpaqueFastModulateOpaqueAlphaPlainNoAttrPipelines[pipelineIndex]
                    : GraphicsOpaqueFastModulateOpaqueAlphaPlainPipelines[pipelineIndex];
                if (pipeline != VK_NULL_HANDLE)
                    return pipeline;
            }
            VkPipeline pipeline = noAttr
                ? GraphicsOpaqueFastModulatePlainNoAttrPipelines[pipelineIndex]
                : GraphicsOpaqueFastModulatePlainPipelines[pipelineIndex];
            if (pipeline != VK_NULL_HANDLE)
                return pipeline;
        }

        return noAttr
            ? GraphicsOpaqueFastModulateNoAttrPipelines[pipelineIndex]
            : GraphicsOpaqueFastModulatePipelines[pipelineIndex];
    };
    const auto fastOpaqueModulateOcclusionNoAttrPipelineFor = [&](const GraphicsPolygonDraw& draw, u32 pipelineIndex, bool noDepth = false) -> VkPipeline {
        if ((dispCnt & (1u << 0u)) == 0u
            || draw.firstTriangle >= Triangles.size()
            || pipelineIndex >= GraphicsOpaqueFastModulateOcclusionNoAttrPipelines.size())
        {
            return VK_NULL_HANDLE;
        }

        const u32 flags = Triangles[draw.firstTriangle].flags;
        const u32 texParam = Triangles[draw.firstTriangle].texParam;
        const bool requiresFragmentDepth = requiresWBufferFragmentDepth(draw);

        const u32 requiredFlags = kTriangleFlagWBuffer | kTriangleFlagTextured;
        const u32 disallowedFlags = kTriangleFlagDecal;
        if ((flags & requiredFlags) != requiredFlags || (flags & disallowedFlags) != 0u || requiresFragmentDepth)
            return VK_NULL_HANDLE;
        const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
        const bool fullAlpha =
            (flags & kTriangleFlagTextureOpaque) != 0u
            && ((draw.polyAttr >> 16u) & 0x1Fu) == 0x1Fu
            && alphaRef < 0x1Fu;
        if (blendMode == 2u && (dispCnt & (1u << 1u)) == 0u)
        {
            if (fullAlpha)
            {
                VkPipeline pipeline = GraphicsOpaqueFastModulateOpaqueAlphaToonOcclusionNoAttrPipelines[pipelineIndex];
                if (pipeline != VK_NULL_HANDLE)
                    return pipeline;
            }
            VkPipeline pipeline = GraphicsOpaqueFastModulateToonOcclusionNoAttrPipelines[pipelineIndex];
            if (pipeline != VK_NULL_HANDLE)
                return pipeline;
        }
        else if (blendMode != 2u)
        {
            if (fullAlpha)
            {
                if (noDepth)
                {
                    VkPipeline pipeline = GraphicsOpaqueFastModulateOpaqueAlphaPlainNoDepthOcclusionNoAttrPipelines[pipelineIndex];
                    if (pipeline != VK_NULL_HANDLE)
                        return pipeline;
                }
                VkPipeline pipeline = GraphicsOpaqueFastModulateOpaqueAlphaPlainOcclusionNoAttrPipelines[pipelineIndex];
                if (pipeline != VK_NULL_HANDLE)
                    return pipeline;
            }
            VkPipeline pipeline = GraphicsOpaqueFastModulatePlainOcclusionNoAttrPipelines[pipelineIndex];
            if (pipeline != VK_NULL_HANDLE)
                return pipeline;
        }

        return GraphicsOpaqueFastModulateOcclusionNoAttrPipelines[pipelineIndex];
    };
    const auto bindAndDrawGraphics = [&](const GraphicsPolygonDraw& draw,
                                         VkPipeline pipeline,
                                         u32 stencilCompareMask,
                                         u32 stencilWriteMask,
                                         u32 stencilReference) -> bool {

        {
            static const bool sondaSinAlfa =
                std::getenv("MELON_SONDA_SIN_ALFA") != nullptr;
            if (sondaSinAlfa
                && currentGraphicsDebugPassKind == GraphicsDebugPassKind::Alpha)
                return false;
        }
        if (pipeline == VK_NULL_HANDLE || draw.triangleCount == 0u || draw.firstTriangle >= Triangles.size())
            return false;
        if (vkCmdPushConstants == nullptr
            || vkCmdDraw == nullptr
            || vkCmdBindPipeline == nullptr
            || vkCmdBindDescriptorSets == nullptr
            || vkCmdSetStencilCompareMask == nullptr
            || vkCmdSetStencilWriteMask == nullptr
            || vkCmdSetStencilReference == nullptr)
        {
            if (MelonDSAndroid::areRendererDebugToolsEnabled())
            {
                if (GraphicsDrawDispatchMissingLogCooldown == 0u)
                {
                    Log(
                        LogLevel::Warn,
                        "VulkanGraphics[DispatchMissing]: draw=%u push=%u bindPipeline=%u bindDescriptors=%u stencilCompare=%u stencilWrite=%u stencilReference=%u",
                        vkCmdDraw != nullptr ? 1u : 0u,
                        vkCmdPushConstants != nullptr ? 1u : 0u,
                        vkCmdBindPipeline != nullptr ? 1u : 0u,
                        vkCmdBindDescriptorSets != nullptr ? 1u : 0u,
                        vkCmdSetStencilCompareMask != nullptr ? 1u : 0u,
                        vkCmdSetStencilWriteMask != nullptr ? 1u : 0u,
                        vkCmdSetStencilReference != nullptr ? 1u : 0u);
                    GraphicsDrawDispatchMissingLogCooldown = 180u;
                }
                else
                {
                    GraphicsDrawDispatchMissingLogCooldown--;
                }
            }
            return false;
        }

        bindGraphicsPipelineCached(pipeline);
        if (draw.boundedEqualDepth != 0xFFFFFFFFu)
        {
            const u32 depth = draw.boundedEqualDepth;
            const float lower = static_cast<float>(depth > 512u ? depth - 512u : 0u) / 16777216.0f;
            const float upper = static_cast<float>(std::min(depth + 512u, 0xFFFFFFu)) / 16777216.0f;
            vkCmdSetDepthBounds(commandBuffer, lower, upper);
        }
        const TriangleGpu& firstTriangle = Triangles[draw.firstTriangle];
        bindGraphicsDescriptorSetCached(firstTriangle.texArrayIndex);
        pushConstants.depthBlendMode = draw.polyAttr;
        pushConstants.variantKey = ((firstTriangle.texLayer & 0xFFFFu) << 16u) | (firstTriangle.texArrayIndex & 0xFFFFu);
        pushConstants.passIndex = ((firstTriangle.texHeight & 0xFFFFu) << 16u) | (firstTriangle.texWidth & 0xFFFFu);
        pushConstants.triangleBase = firstTriangle.texParam;
        pushConstants.triangleCount = draw.triangleCount;
        vkCmdPushConstants(commandBuffer, GraphicsPipelineLayout, VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(pushConstants), &pushConstants);
        setStencilStateCached(stencilCompareMask, stencilWriteMask, stencilReference);
        const VkRect2D drawScissor = drawGraphicsScissor(draw);
        setGraphicsScissorCached(drawScissor);
        vkCmdDraw(commandBuffer, draw.triangleCount * 3u, 1u, draw.firstTriangle * 3u, 0u);
        includeFinalActiveScissor(drawScissor);
        if (fogFlagEnabledFor(draw))
        {
            graphicsFogWriteObserved = true;
            if (currentGraphicsDebugPassKind == GraphicsDebugPassKind::Opaque)
                graphicsPassDebugStats.fogWriteOpaque++;
            else if (currentGraphicsDebugPassKind == GraphicsDebugPassKind::Alpha)
                graphicsPassDebugStats.fogWriteAlpha++;
        }
        drawCount++;
        return true;
    };
    const auto fastOpaqueDrawsCanBatch = [&](const GraphicsPolygonDraw& firstDraw,
                                             VkPipeline firstPipeline,
                                             u32 firstPipelineIndex,
                                             const GraphicsPolygonDraw& nextDraw) -> bool {
        if (firstPipeline == VK_NULL_HANDLE
            || firstDraw.triangleCount == 0u
            || nextDraw.triangleCount == 0u
            || firstDraw.firstTriangle >= Triangles.size()
            || nextDraw.firstTriangle >= Triangles.size())
        {
            return false;
        }
        if (firstDraw.firstTriangle + firstDraw.triangleCount != nextDraw.firstTriangle)
            return false;
        const bool firstNoAttr = canSkipOpaqueAttrWrite(firstDraw);
        const bool nextNoAttr = canSkipOpaqueAttrWrite(nextDraw);
        const u32 ignoredAttrMask = (firstNoAttr && nextNoAttr) ? (0x3Fu << 24u) : 0u;
        if ((firstDraw.polyAttr & ~ignoredAttrMask) != (nextDraw.polyAttr & ~ignoredAttrMask))
            return false;

        const u32 nextPipelineIndex = opaquePipelineIndexFor(nextDraw);
        if (nextPipelineIndex != firstPipelineIndex)
            return false;
        if (fastOpaqueModulatePipelineFor(nextDraw, nextPipelineIndex, canSkipOpaqueAttrWrite(nextDraw)) != firstPipeline)
            return false;

        const TriangleGpu& firstTriangle = Triangles[firstDraw.firstTriangle];
        const TriangleGpu& nextTriangle = Triangles[nextDraw.firstTriangle];
        return firstTriangle.texLayer == nextTriangle.texLayer
            && firstTriangle.texArrayIndex == nextTriangle.texArrayIndex
            && firstTriangle.texWidth == nextTriangle.texWidth
            && firstTriangle.texHeight == nextTriangle.texHeight
            && firstTriangle.texParam == nextTriangle.texParam;
    };
    const auto countFastOpaqueBatchBreak = [&](const GraphicsPolygonDraw& firstDraw,
                                               VkPipeline firstPipeline,
                                               u32 firstPipelineIndex,
                                               const GraphicsPolygonDraw& nextDraw) {
        if (firstPipeline == VK_NULL_HANDLE
            || firstDraw.triangleCount == 0u
            || nextDraw.triangleCount == 0u
            || firstDraw.firstTriangle >= Triangles.size()
            || nextDraw.firstTriangle >= Triangles.size())
        {
            graphicsPassDebugStats.denseOpaqueBatchBreakOther++;
            return;
        }
        if (firstDraw.firstTriangle + firstDraw.triangleCount != nextDraw.firstTriangle)
        {
            graphicsPassDebugStats.denseOpaqueBatchBreakNonContiguous++;
            return;
        }
        const bool firstNoAttr = canSkipOpaqueAttrWrite(firstDraw);
        const bool nextNoAttr = canSkipOpaqueAttrWrite(nextDraw);
        const u32 ignoredAttrMask = (firstNoAttr && nextNoAttr) ? (0x3Fu << 24u) : 0u;
        if ((firstDraw.polyAttr & ~ignoredAttrMask) != (nextDraw.polyAttr & ~ignoredAttrMask))
        {
            graphicsPassDebugStats.denseOpaqueBatchBreakPolyAttr++;
            const u32 attrDiff = firstDraw.polyAttr ^ nextDraw.polyAttr;
            const u32 polyIdMask = 0x3Fu << 24u;
            const u32 alphaMask = 0x1Fu << 16u;
            const u32 fogMask = 1u << 15u;
            const u32 depthMask = (1u << 11u) | (1u << 14u);
            if ((attrDiff & ~polyIdMask) == 0u)
                graphicsPassDebugStats.denseOpaqueBatchBreakPolyIdOnly++;
            else if ((attrDiff & ~depthMask) == 0u)
                graphicsPassDebugStats.denseOpaqueBatchBreakPolyDepthOnly++;
            else if ((attrDiff & ~fogMask) == 0u)
                graphicsPassDebugStats.denseOpaqueBatchBreakPolyFogOnly++;
            else if ((attrDiff & ~alphaMask) == 0u)
                graphicsPassDebugStats.denseOpaqueBatchBreakPolyAlphaOnly++;
            else if ((attrDiff & ~(polyIdMask | alphaMask | fogMask | depthMask)) == 0u)
                graphicsPassDebugStats.denseOpaqueBatchBreakPolyMiscOnly++;
            return;
        }

        const u32 nextPipelineIndex = opaquePipelineIndexFor(nextDraw);
        if (nextPipelineIndex != firstPipelineIndex
            || fastOpaqueModulatePipelineFor(nextDraw, nextPipelineIndex, canSkipOpaqueAttrWrite(nextDraw)) != firstPipeline)
        {
            graphicsPassDebugStats.denseOpaqueBatchBreakPipeline++;
            return;
        }

        const TriangleGpu& firstTriangle = Triangles[firstDraw.firstTriangle];
        const TriangleGpu& nextTriangle = Triangles[nextDraw.firstTriangle];
        if (firstTriangle.texLayer != nextTriangle.texLayer
            || firstTriangle.texArrayIndex != nextTriangle.texArrayIndex
            || firstTriangle.texWidth != nextTriangle.texWidth
            || firstTriangle.texHeight != nextTriangle.texHeight
            || firstTriangle.texParam != nextTriangle.texParam)
        {
            graphicsPassDebugStats.denseOpaqueBatchBreakTexture++;
            return;
        }

        graphicsPassDebugStats.denseOpaqueBatchBreakOther++;
    };

    const auto genericOpaqueScissorContainsCoverage = [&](const GraphicsPolygonDraw& draw,
                                                          const VkRect2D& scissor) {
        const u64 first = static_cast<u64>(draw.firstTriangle) * 3u;
        const u64 end = first + static_cast<u64>(draw.triangleCount) * 3u;
        if (draw.triangleCount == 0u || end > GraphicsVertices.size())
            return false;
        const float left = static_cast<float>(scissor.offset.x);
        const float top = static_cast<float>(scissor.offset.y);
        const float right = left + scissor.extent.width;
        const float bottom = top + scissor.extent.height;
        for (u64 i = first; i < end; ++i)
        {
            const GraphicsVertexGpu& vertex = GraphicsVertices[i];
            if (!std::isfinite(vertex.x) || !std::isfinite(vertex.y)
                || !std::isfinite(vertex.reciprocalW) || vertex.reciprocalW <= 0.0f
                || (left > 0.0f && vertex.x < left + 1.0f)
                || (top > 0.0f && vertex.y < top + 1.0f)
                || (right < fullGraphicsScissor.extent.width && vertex.x > right - 1.0f)
                || (bottom < fullGraphicsScissor.extent.height && vertex.y > bottom - 1.0f))
                return false;
        }
        return true;
    };
    const auto genericOpaqueDrawsCanBatch = [&](const GraphicsPolygonDraw& firstDraw,
                                              VkPipeline firstPipeline,
                                              u32 firstPipelineIndex,
                                              const GraphicsPolygonDraw& nextDraw,
                                              bool nextNoAttr) -> bool {
        if (firstPipeline == VK_NULL_HANDLE
            || firstDraw.triangleCount == 0u
            || nextDraw.triangleCount == 0u
            || firstDraw.firstTriangle >= Triangles.size()
            || nextDraw.firstTriangle >= Triangles.size())
        {
            return false;
        }
        if (firstDraw.firstTriangle + firstDraw.triangleCount != nextDraw.firstTriangle)
            return false;
        if (firstDraw.polyAttr != nextDraw.polyAttr)
            return false;
        const u32 nextPipelineIndex = opaquePipelineIndexFor(nextDraw);
        if (nextPipelineIndex != firstPipelineIndex)
            return false;
        if (opaquePipelineFor(nextDraw, nextPipelineIndex, nextNoAttr) != firstPipeline)
            return false;

        if (fastOpaqueModulatePipelineFor(nextDraw, nextPipelineIndex, nextNoAttr) != VK_NULL_HANDLE)
            return false;
        const TriangleGpu& firstTriangle = Triangles[firstDraw.firstTriangle];
        const TriangleGpu& nextTriangle = Triangles[nextDraw.firstTriangle];
        return firstTriangle.texLayer == nextTriangle.texLayer
            && firstTriangle.texArrayIndex == nextTriangle.texArrayIndex
            && firstTriangle.texWidth == nextTriangle.texWidth
            && firstTriangle.texHeight == nextTriangle.texHeight
            && firstTriangle.texParam == nextTriangle.texParam;
    };

    const auto bindAndDrawFastOpaqueBatch = [&](const GraphicsPolygonDraw& firstDraw,
                                                u32 mergedTriangleCount,
                                                VkPipeline pipeline,
                                                VkRect2D scissor) -> bool {
        if (pipeline == VK_NULL_HANDLE
            || mergedTriangleCount == 0u
            || firstDraw.firstTriangle >= Triangles.size())
        {
            return false;
        }
        if (vkCmdPushConstants == nullptr
            || vkCmdDraw == nullptr
            || vkCmdBindPipeline == nullptr
            || vkCmdBindDescriptorSets == nullptr
            || vkCmdSetStencilCompareMask == nullptr
            || vkCmdSetStencilWriteMask == nullptr
            || vkCmdSetStencilReference == nullptr)
        {
            return false;
        }

        bindGraphicsPipelineCached(pipeline);
        const TriangleGpu& firstTriangle = Triangles[firstDraw.firstTriangle];
        bindGraphicsDescriptorSetCached(firstTriangle.texArrayIndex);
        pushConstants.depthBlendMode = firstDraw.polyAttr;
        pushConstants.variantKey = ((firstTriangle.texLayer & 0xFFFFu) << 16u) | (firstTriangle.texArrayIndex & 0xFFFFu);
        pushConstants.passIndex = ((firstTriangle.texHeight & 0xFFFFu) << 16u) | (firstTriangle.texWidth & 0xFFFFu);
        pushConstants.triangleBase = firstTriangle.texParam;
        pushConstants.triangleCount = mergedTriangleCount;
        vkCmdPushConstants(commandBuffer, GraphicsPipelineLayout, VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(pushConstants), &pushConstants);
        setStencilStateCached(0xFFu, 0xFFu, (firstDraw.polyAttr >> 24u) & 0x3Fu);
        setGraphicsScissorCached(scissor);
        vkCmdDraw(commandBuffer, mergedTriangleCount * 3u, 1u, firstDraw.firstTriangle * 3u, 0u);
        includeFinalActiveScissor(scissor);
        drawCount++;
        return true;
    };
    const auto drawNeedOpaquePass = [&](const GraphicsPolygonDraw& draw) {
        const u32 pipelineIndex = opaquePipelineIndexFor(draw);
        VkPipeline pipeline = fastOpaqueModulatePipelineFor(draw, pipelineIndex, false);
        if (pipeline == VK_NULL_HANDLE)
        {
            pipeline = opaquePipelineFor(draw, pipelineIndex, false);
        }
        bindAndDrawGraphics(draw, pipeline, 0xFFu, 0xFFu, (draw.polyAttr >> 24u) & 0x3Fu);
    };
    const auto bindAndDrawGraphicsEdges = [&](const GraphicsPolygonDraw& draw,
                                              u32 mergedIndexCount = 0u,
                                              const VkRect2D* mergedScissor = nullptr) -> bool {
        if (draw.edgeIndexCount == 0u || draw.firstTriangle >= Triangles.size())
            return false;

        const u32 polyAlpha = (draw.polyAttr >> 16u) & 0x1Fu;
        if (alphaRef >= 31u || (polyAlpha != 0u && polyAlpha != 31u))
            return false;

        const u32 wMode = (draw.flags & AcceleratedPolygonFlagWBuffer) != 0u ? 1u : 0u;
        VkPipeline pipeline = wMode < GraphicsEdgeMarkPipelines.size()
            ? GraphicsEdgeMarkPipelines[wMode]
            : VK_NULL_HANDLE;
        if (polyAlpha == 31u
            && wMode < GraphicsEdgeMarkAlphaPipelines.size()
            && GraphicsEdgeMarkAlphaPipelines[wMode] != VK_NULL_HANDLE)
        {
            pipeline = GraphicsEdgeMarkAlphaPipelines[wMode];
        }
        if (pipeline == VK_NULL_HANDLE)
            return false;
        if (vkCmdDrawIndexed == nullptr
            || vkCmdPushConstants == nullptr
            || vkCmdBindPipeline == nullptr
            || vkCmdBindDescriptorSets == nullptr)
        {
            if (MelonDSAndroid::areRendererDebugToolsEnabled())
            {
                if (GraphicsDrawDispatchMissingLogCooldown == 0u)
                {
                    Log(
                        LogLevel::Warn,
                        "VulkanGraphics[EdgeDispatchMissing]: drawIndexed=%u push=%u bindPipeline=%u bindDescriptors=%u",
                        vkCmdDrawIndexed != nullptr ? 1u : 0u,
                        vkCmdPushConstants != nullptr ? 1u : 0u,
                        vkCmdBindPipeline != nullptr ? 1u : 0u,
                        vkCmdBindDescriptorSets != nullptr ? 1u : 0u);
                    GraphicsDrawDispatchMissingLogCooldown = 120u;
                }
                else
                {
                    GraphicsDrawDispatchMissingLogCooldown--;
                }
            }
            return false;
        }

        bindGraphicsPipelineCached(pipeline);
        bindGraphicsDescriptorSetCached(Triangles[draw.firstTriangle].texArrayIndex);
        pushConstants.depthBlendMode = wMode;
        pushConstants.triangleBase = draw.firstTriangle;
        pushConstants.triangleCount = draw.triangleCount;
        u32 savedEdgeColorPacked[8]{};
        if (draw.edgeColorOverrideMask != 0u)
        {
            for (u32 i = 0; i < 8u; i++)
            {
                if ((draw.edgeColorOverrideMask & (1u << i)) == 0u)
                    continue;
                savedEdgeColorPacked[i] = pushConstants.edgeColorPacked[i];
                pushConstants.edgeColorPacked[i] = draw.edgeColorOverridePacked;
            }
        }
        vkCmdPushConstants(commandBuffer, GraphicsPipelineLayout, VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(pushConstants), &pushConstants);
        if (draw.edgeColorOverrideMask != 0u)
        {
            for (u32 i = 0; i < 8u; i++)
            {
                if ((draw.edgeColorOverrideMask & (1u << i)) != 0u)
                    pushConstants.edgeColorPacked[i] = savedEdgeColorPacked[i];
            }
        }
        const VkRect2D edgeScissor = mergedScissor != nullptr
            ? *mergedScissor : drawGraphicsScissor(draw);
        setGraphicsScissorCached(edgeScissor);
        vkCmdDrawIndexed(commandBuffer,
            mergedIndexCount != 0u ? mergedIndexCount : draw.edgeIndexCount,
            1u, draw.firstEdgeIndex, 0, 0u);
        includeFinalActiveScissor(edgeScissor);
        drawCount++;
        return true;
    };
    const auto clearShadowStencilBit = [&](const VkRect2D* clearScissor = nullptr) {
        if (GraphicsStencilBitClearPipeline == VK_NULL_HANDLE)
            return;

        bindGraphicsPipelineCached(GraphicsStencilBitClearPipeline);
        bindGraphicsDescriptorSetCached();
        vkCmdPushConstants(commandBuffer, GraphicsPipelineLayout, VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(pushConstants), &pushConstants);
        setStencilStateCached(0x80u, 0x80u, 0x00u);
        if (clearScissor != nullptr)
            setGraphicsScissorCached(*clearScissor);
        else
            fullGraphicsScissorCached();
        vkCmdDraw(commandBuffer, 3u, 1u, 0u, 0u);
        graphicsPassDebugStats.stencilBitClears++;
        drawCount++;
    };
    const bool clearPlaneAlphaZero = ((clearAttr >> 16u) & 0x1Fu) == 0u;
    const u32 clearPlanePolyId = (clearAttr >> 24u) & 0x3Fu;
    const bool alphaBlendEnabled = (dispCnt & (1u << 3u)) != 0u;
    const auto drawYBounds = [&](const GraphicsPolygonDraw& draw) -> std::pair<u32, u32> {
        if (draw.firstTriangle >= Triangles.size())
            return {0u, 0u};

        const u32 yBounds = Triangles[draw.firstTriangle].yBounds;
        return {yBounds & 0xFFFFu, (yBounds >> 16u) & 0xFFFFu};
    };
    const auto drawTopDs = [&](const GraphicsPolygonDraw& draw) -> float {
        const auto [top, bottom] = drawYBounds(draw);
        (void)bottom;
        const float scale = static_cast<float>(effectiveRasterScale);
        return static_cast<float>(top) / scale;
    };
    const auto drawXBounds = [&](const GraphicsPolygonDraw& draw) -> std::pair<float, float> {
        if (draw.firstTriangle >= Triangles.size() || draw.triangleCount == 0u)
            return {0.0f, 0.0f};

        float minX = std::numeric_limits<float>::max();
        float maxX = std::numeric_limits<float>::lowest();
        const u32 endTriangle = std::min<u32>(draw.firstTriangle + draw.triangleCount, static_cast<u32>(Triangles.size()));
        for (u32 triangleIndex = draw.firstTriangle; triangleIndex < endTriangle; triangleIndex++)
        {
            const TriangleGpu& tri = Triangles[triangleIndex];
            minX = std::min(minX, std::min(tri.x0, std::min(tri.x1, tri.x2)));
            maxX = std::max(maxX, std::max(tri.x0, std::max(tri.x1, tri.x2)));
        }
        return {minX, maxX};
    };
    const auto isClampPaletteUiTriangle = [&](const TriangleGpu& tri) -> bool {
        const u32 texParam = tri.texParam;
        const u32 textureFormat = (texParam >> 26u) & 0x7u;
        const bool color0Transparent = (texParam & (1u << 29u)) != 0u;
        const bool repeatS = (texParam & (1u << 16u)) != 0u;
        const bool repeatT = (texParam & (1u << 17u)) != 0u;
        const bool mirrorS = (texParam & (1u << 18u)) != 0u;
        const bool mirrorT = (texParam & (1u << 19u)) != 0u;
        return (tri.flags & kTriangleFlagTextured) != 0u
            && (textureFormat == 2u || textureFormat == 3u)
            && color0Transparent
            && !repeatS
            && !repeatT
            && !mirrorS
            && !mirrorT;
    };
    const auto isCompactPaletteUiReplayTriangle = [&](const TriangleGpu& tri) -> bool {
        if (!isClampPaletteUiTriangle(tri))
            return false;

        const u32 texturePage = tri.texParam & 0xFFFFu;
        return texturePage == 0x05C0u
            || texturePage == 0x85C0u;
    };
    const auto isFlatDsUiPlaneTriangle = [&](const TriangleGpu& tri) -> bool {
        constexpr float kUiPlaneW = 25600.0f;
        constexpr float kUiPlaneTolerance = 0.5f;
        return std::abs(tri.w0 - kUiPlaneW) <= kUiPlaneTolerance
            && std::abs(tri.w1 - kUiPlaneW) <= kUiPlaneTolerance
            && std::abs(tri.w2 - kUiPlaneW) <= kUiPlaneTolerance;
    };
    const auto isCompactTopStatusGlyphTriangle = [&](const TriangleGpu& tri) -> bool {
        const u32 texParam = tri.texParam;
        const u32 textureFormat = (texParam >> 26u) & 0x7u;
        const bool color0Transparent = (texParam & (1u << 29u)) != 0u;
        const bool repeatS = (texParam & (1u << 16u)) != 0u;
        const bool repeatT = (texParam & (1u << 17u)) != 0u;
        const bool mirrorS = (texParam & (1u << 18u)) != 0u;
        const bool mirrorT = (texParam & (1u << 19u)) != 0u;
        return (tri.flags & kTriangleFlagTextured) != 0u
            && textureFormat == 3u
            && color0Transparent
            && (texParam & 0xFFFFu) == 0x05C0u
            && !repeatS
            && !repeatT
            && !mirrorS
            && !mirrorT;
    };
    const auto isCompactTopStatusGlyphDraw = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (draw.firstTriangle >= Triangles.size())
            return false;

        const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
        const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
        if (alpha5 != 31u
            || blendMode != 0u
            || (draw.polyAttr & (1u << 11u)) == 0u
            || !isCompactTopStatusGlyphTriangle(Triangles[draw.firstTriangle]))
        {
            return false;
        }

        const float scale = static_cast<float>(effectiveRasterScale);
        const auto [xMin, xMax] = drawXBounds(draw);
        const auto [yTop, yBottom] = drawYBounds(draw);
        const float xMinDs = xMin / scale;
        const float xMaxDs = xMax / scale;
        const float yTopDs = static_cast<float>(yTop) / scale;
        const float yBottomDs = static_cast<float>(yBottom) / scale;
        return xMinDs >= 38.0f
            && xMaxDs <= 46.0f
            && yTopDs >= 6.0f
            && yBottomDs <= 16.0f;
    };
    const auto isCompactTopStatusGlyphOverlay = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (!clearPlaneAlphaZero
            || !alphaBlendEnabled
            || draw.firstTriangle >= Triangles.size()
            || (draw.flags & AcceleratedPolygonFlagTranslucent) == 0u)
        {
            return false;
        }

        const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
        const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
        return alpha5 == 9u
            && blendMode == 0u
            && (draw.polyAttr & (1u << 11u)) != 0u
            && isCompactTopStatusGlyphTriangle(Triangles[draw.firstTriangle]);
    };
    const auto isTranslucentPaletteUiOverlay = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (!clearPlaneAlphaZero
            || !alphaBlendEnabled
            || draw.firstTriangle >= Triangles.size()
            || (draw.flags & AcceleratedPolygonFlagTranslucent) == 0u)
        {
            return false;
        }

        const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
        const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
        const u32 polyId = (draw.polyAttr >> 24u) & 0x3Fu;
        return alpha5 > 0u
            && alpha5 < 31u
            && blendMode == 0u
            && polyId >= 3u
            && (draw.polyAttr & (1u << 11u)) == 0u
            && isClampPaletteUiTriangle(Triangles[draw.firstTriangle]);
    };
    const auto isPaletteUiHelpPanelOverlay = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (!isTranslucentPaletteUiOverlay(draw))
            return false;

        const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
        const u32 polyId = (draw.polyAttr >> 24u) & 0x3Fu;
        const u32 texParam = Triangles[draw.firstTriangle].texParam;
        return alpha5 == 24u
            && polyId == 11u
            && texParam == 0x6DC00200u;
    };
    const bool hasLowAlphaPaletteUiOverlay = [&]() -> bool {
        for (u32 alphaDrawIndex : GraphicsAlphaDrawIndices)
        {
            if (alphaDrawIndex >= GraphicsPolygons.size())
                continue;

            const GraphicsPolygonDraw& alphaDraw = GraphicsPolygons[alphaDrawIndex];
            if (!isTranslucentPaletteUiOverlay(alphaDraw))
                continue;

            const u32 alpha5 = (alphaDraw.polyAttr >> 16u) & 0x1Fu;
            if (alpha5 < 27u)
                return true;
        }
        return false;
    }();
    struct ReplayBounds
    {
        float left, right, nearest, farthest;
        u32 top, bottom;
    };
    const auto replayBounds = [&](const GraphicsPolygonDraw& draw) {
        const auto first = Triangles.begin() + draw.firstTriangle;
        const auto end = first + draw.triangleCount;
        ReplayBounds bounds{first->x0, first->x0, first->z0, first->z0,
                            first->yBounds & 0xFFFFu, first->yBounds >> 16u};
        for (auto tri = first; tri != end; ++tri)
        {
            bounds.left = std::min({bounds.left, tri->x0, tri->x1, tri->x2});
            bounds.right = std::max({bounds.right, tri->x0, tri->x1, tri->x2});
            bounds.nearest = std::min({bounds.nearest, tri->z0, tri->z1, tri->z2});
            bounds.farthest = std::max({bounds.farthest, tri->z0, tri->z1, tri->z2});
            bounds.top = std::min(bounds.top, tri->yBounds & 0xFFFFu);
            bounds.bottom = std::max(bounds.bottom, tri->yBounds >> 16u);
        }
        return bounds;
    };
    const auto shouldReplayOpaquePaletteUiDraw = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (!clearPlaneAlphaZero
            || !alphaBlendEnabled
            || draw.firstTriangle >= Triangles.size()
            || (draw.flags & AcceleratedPolygonFlagTranslucent) != 0u)
        {
            return false;
        }

        const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
        const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
        const u32 texParam = draw.firstTriangle < Triangles.size() ? Triangles[draw.firstTriangle].texParam : 0u;
        const bool compactStatusGlyph = isCompactTopStatusGlyphDraw(draw);
        const bool paletteUiReplay =
            alpha5 == 31u
            && blendMode == 0u
            && (draw.polyAttr & (1u << 11u)) == 0u
            && texParam != 0x68C01B10u
            && texParam != 0x6A5016D0u
            && isClampPaletteUiTriangle(Triangles[draw.firstTriangle])
            && isFlatDsUiPlaneTriangle(Triangles[draw.firstTriangle]);
        if (!compactStatusGlyph && !paletteUiReplay)
        {
            return false;
        }
        if (paletteUiReplay
            && !hasLowAlphaPaletteUiOverlay
            && ((draw.polyAttr >> 24u) & 0x3Fu) != 0u)
        {
            return false;
        }

        const auto opaque = replayBounds(draw);
        bool matchesPaletteUiOverlay = false;
        for (u32 alphaDrawIndex : GraphicsAlphaDrawIndices)
        {
            if (alphaDrawIndex >= GraphicsPolygons.size())
                continue;

            const GraphicsPolygonDraw& alphaDraw = GraphicsPolygons[alphaDrawIndex];
            const auto overlay = replayBounds(alphaDraw);
            if (overlay.bottom <= opaque.top || opaque.bottom <= overlay.top)
                continue;

            const bool overlapsX = overlay.right > opaque.left && opaque.right > overlay.left;
            if (overlapsX && overlay.nearest < opaque.farthest)
                return false;

            if (compactStatusGlyph)
            {
                if (isCompactTopStatusGlyphOverlay(alphaDraw))
                    matchesPaletteUiOverlay = true;
                continue;
            }

            if (!isTranslucentPaletteUiOverlay(alphaDraw))
                continue;

            if (overlapsX && isPaletteUiHelpPanelOverlay(alphaDraw))
                return false;
            const u32 alpha5 = (alphaDraw.polyAttr >> 16u) & 0x1Fu;
            if (!hasLowAlphaPaletteUiOverlay && alpha5 >= 27u && drawTopDs(draw) >= 18.0f)
            {
                return false;
            }
            matchesPaletteUiOverlay = true;
        }
        return matchesPaletteUiOverlay;
    };

    const auto isOpaqueFullAlpha = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (draw.firstTriangle >= Triangles.size())
            return false;

        const TriangleGpu& firstTriangle = Triangles[draw.firstTriangle];
        return (firstTriangle.flags & kTriangleFlagTextureOpaque) != 0u
            && ((draw.polyAttr >> 16u) & 0x1Fu) == 0x1Fu
            && alphaRef < 0x1Fu;
    };
    const auto fragmentDepthPrepassPipelineFor = [&](const GraphicsPolygonDraw& draw, u32 pipelineIndex) -> VkPipeline {
        const bool fullAlpha = isOpaqueFullAlpha(draw);
        if (!fullAlpha)
        {
            return pipelineIndex < GraphicsOpaqueAlphaFragmentDepthPrepassPipelines.size()
                ? GraphicsOpaqueAlphaFragmentDepthPrepassPipelines[pipelineIndex]
                : VK_NULL_HANDLE;
        }

        return pipelineIndex < GraphicsOpaqueFragmentDepthPrepassPipelines.size()
            ? GraphicsOpaqueFragmentDepthPrepassPipelines[pipelineIndex]
            : VK_NULL_HANDLE;
    };
    const auto isLargeFragmentDepthOpaqueCandidate = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (draw.firstTriangle >= Triangles.size() || draw.triangleCount == 0u)
            return false;

        const TriangleGpu& firstTriangle = Triangles[draw.firstTriangle];
        const u32 flags = firstTriangle.flags;

        static const bool sinR4b = std::getenv("MELON_SIN_R4B") != nullptr;
        const bool zPuro = (flags & kTriangleFlagWBuffer) == 0u;
        if (!requiresWBufferFragmentDepth(draw) && (sinR4b || !zPuro))
            return false;
        const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
        if ((flags & kTriangleFlagLinear) != 0u)
            return false;
        if (blendMode != 0u && blendMode != 2u)
            return false;

        const auto [xMin, xMax] = drawXBounds(draw);
        const auto [yTop, yBottom] = drawYBounds(draw);
        const float clippedLeft = std::clamp(xMin, 0.0f, static_cast<float>(ColorImageWidth));
        const float clippedRight = std::clamp(xMax, 0.0f, static_cast<float>(ColorImageWidth));
        const u32 clippedTop = std::min<u32>(yTop, ColorImageHeight);
        const u32 clippedBottom = std::min<u32>(yBottom, ColorImageHeight);
        if (clippedRight <= clippedLeft || clippedBottom <= clippedTop)
            return false;

        const float coveragePixels =
            (clippedRight - clippedLeft) * static_cast<float>(clippedBottom - clippedTop);
        const float screenPixels =
            static_cast<float>(ColorImageWidth) * static_cast<float>(ColorImageHeight);

        static const float umbralR4 = [] {
            if (const char* e = std::getenv("MELON_R4_UMBRAL"))
                return static_cast<float>(std::atoi(e)) / 100.0f;
#ifdef __ANDROID__

            char v[92] = {};
            if (__system_property_get("debug.melonds.r4_umbral", v) > 0)
                return static_cast<float>(std::atoi(v)) / 100.0f;
#endif
            return 0.25f;
        }();
        return screenPixels > 0.0f && coveragePixels >= (screenPixels * umbralR4);
    };

    static const bool cullSobreescritura = [] {
        if (std::getenv("MELON_CULL_SOBREESCRITURA") != nullptr)
            return true;
#ifdef __ANDROID__
        char v[92] = {};
        if (__system_property_get("debug.melonds.cull_sobreescritura", v) > 0)
            return v[0] == '1';
#endif
        return false;
    }();
    const bool kEnableOpaqueOverwriteCull = cullSobreescritura;
    const bool opaqueOverwriteCullAllowed =
        kEnableOpaqueOverwriteCull
        && effectiveRasterScale >= 8u
        && !useBitmapClear;
    const auto isOpaqueOverwriteCullCandidate = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (!opaqueOverwriteCullAllowed)
            return false;
        if (draw.firstTriangle >= Triangles.size() || draw.triangleCount == 0u)
            return false;
        if ((draw.flags & (AcceleratedPolygonFlagTranslucent
                | AcceleratedPolygonFlagShadowMask
                | AcceleratedPolygonFlagShadow
                | AcceleratedPolygonFlagNeedOpaquePass)) != 0u)
        {
            return false;
        }

        const TriangleGpu& firstTriangle = Triangles[draw.firstTriangle];
        const u32 flags = firstTriangle.flags;
        const bool fullAlpha =
            (flags & kTriangleFlagTextureOpaque) != 0u
            && ((draw.polyAttr >> 16u) & 0x1Fu) == 0x1Fu
            && alphaRef < 0x1Fu;
        if (!fullAlpha)
            return false;
        if ((flags & kTriangleFlagTextured) == 0u || (flags & kTriangleFlagDecal) != 0u)
            return false;
        if ((draw.polyAttr & (1u << 11u)) != 0u)
            return false;
        if (((draw.polyAttr >> 4u) & 0x3u) != 0u)
            return false;
        if (requiresWBufferFragmentDepth(draw))
            return false;
        return true;
    };
    const auto opaqueOverwriteDrawsCompatible = [&](const GraphicsPolygonDraw& earlier, const GraphicsPolygonDraw& later) -> bool {
        if (!isOpaqueOverwriteCullCandidate(earlier) || !isOpaqueOverwriteCullCandidate(later))
            return false;
        if (earlier.polyAttr != later.polyAttr || opaquePipelineIndexFor(earlier) != opaquePipelineIndexFor(later))
            return false;
        const TriangleGpu& earlierTriangle = Triangles[earlier.firstTriangle];
        const TriangleGpu& laterTriangle = Triangles[later.firstTriangle];
        return earlierTriangle.texLayer == laterTriangle.texLayer
            && earlierTriangle.texArrayIndex == laterTriangle.texArrayIndex
            && earlierTriangle.texWidth == laterTriangle.texWidth
            && earlierTriangle.texHeight == laterTriangle.texHeight
            && earlierTriangle.texParam == laterTriangle.texParam;
    };
    const auto isOpaqueOverwriteCoverCandidate = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (!isOpaqueOverwriteCullCandidate(draw))
            return false;

        const VkRect2D scissor = drawGraphicsScissor(draw);
        const u64 area = static_cast<u64>(scissor.extent.width) * static_cast<u64>(scissor.extent.height);
        const u64 screenArea = static_cast<u64>(ColorImageWidth) * static_cast<u64>(ColorImageHeight);
        return screenArea > 0u && area >= ((screenArea * 85u) / 100u);
    };
    const auto scissorContains = [](const VkRect2D& outer, const VkRect2D& inner) {
        const int32_t outerLeft = outer.offset.x;
        const int32_t outerTop = outer.offset.y;
        const int32_t outerRight = outer.offset.x + static_cast<int32_t>(outer.extent.width);
        const int32_t outerBottom = outer.offset.y + static_cast<int32_t>(outer.extent.height);
        const int32_t innerLeft = inner.offset.x;
        const int32_t innerTop = inner.offset.y;
        const int32_t innerRight = inner.offset.x + static_cast<int32_t>(inner.extent.width);
        const int32_t innerBottom = inner.offset.y + static_cast<int32_t>(inner.extent.height);
        return outerLeft <= innerLeft
            && outerTop <= innerTop
            && outerRight >= innerRight
            && outerBottom >= innerBottom;
    };
    std::vector<u8> opaqueOverwriteCulledDraws(GraphicsPolygons.size(), 0u);

    {
        static const bool sondaSinCapas =
            std::getenv("MELON_SONDA_SIN_CAPAS") != nullptr;
        if (sondaSinCapas && GraphicsOpaqueDrawIndices.size() >= 2u)
            for (size_t i = 0; i + 1u < GraphicsOpaqueDrawIndices.size(); i++)
                if (GraphicsOpaqueDrawIndices[i] < opaqueOverwriteCulledDraws.size())
                    opaqueOverwriteCulledDraws[GraphicsOpaqueDrawIndices[i]] = 1u;
    }
    if (opaqueOverwriteCullAllowed && GraphicsOpaqueDrawIndices.size() >= 2u)
    {
        for (size_t opaqueListIndex = 0; opaqueListIndex + 1u < GraphicsOpaqueDrawIndices.size(); opaqueListIndex++)
        {
            const u32 drawIndex = GraphicsOpaqueDrawIndices[opaqueListIndex];
            if (drawIndex >= GraphicsPolygons.size() || !isOpaqueOverwriteCullCandidate(GraphicsPolygons[drawIndex]))
                continue;

            const VkRect2D drawScissor = drawGraphicsScissor(GraphicsPolygons[drawIndex]);
            for (size_t laterListIndex = opaqueListIndex + 1u; laterListIndex < GraphicsOpaqueDrawIndices.size(); laterListIndex++)
            {
                const u32 laterDrawIndex = GraphicsOpaqueDrawIndices[laterListIndex];
                if (laterDrawIndex >= GraphicsPolygons.size()
                    || !isOpaqueOverwriteCoverCandidate(GraphicsPolygons[laterDrawIndex])
                    || !opaqueOverwriteDrawsCompatible(GraphicsPolygons[drawIndex], GraphicsPolygons[laterDrawIndex]))
                {
                    continue;
                }

                if (scissorContains(drawGraphicsScissor(GraphicsPolygons[laterDrawIndex]), drawScissor))
                {
                    opaqueOverwriteCulledDraws[drawIndex] = 1u;
                    break;
                }
            }
        }
    }

    std::vector<u8> opaqueFragmentDepthPrepassSelected(GraphicsPolygons.size(), 0u);
    std::array<u32, 64> opaqueFragmentDepthCandidatePolyIdCounts{};
    u32 opaqueFragmentDepthCandidateCount = 0;
    if (rasterDispatchPolicy.enableOpaqueFragmentDepthPrepass)
    {
        for (u32 drawIndex : GraphicsOpaqueDrawIndices)
        {
            if (drawIndex >= GraphicsPolygons.size())
                continue;
            if (drawIndex < opaqueOverwriteCulledDraws.size() && opaqueOverwriteCulledDraws[drawIndex] != 0u)
                continue;
            if (drawIndex < colorOnlyOpaqueDrawSelected.size() && colorOnlyOpaqueDrawSelected[drawIndex] != 0u)
                continue;

            const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
            if (!isLargeFragmentDepthOpaqueCandidate(draw))
                continue;

            const u32 pipelineIndex = opaquePipelineIndexFor(draw);
            const bool hasPrepassPipeline = fragmentDepthPrepassPipelineFor(draw, pipelineIndex) != VK_NULL_HANDLE;
            const bool hasResolvePipeline =
                pipelineIndex < GraphicsOpaqueStencilResolvePipelines.size()
                && GraphicsOpaqueStencilResolvePipelines[pipelineIndex] != VK_NULL_HANDLE;
            if (!hasPrepassPipeline || !hasResolvePipeline)
                continue;

            const u32 polyId = (draw.polyAttr >> 24u) & 0x3Fu;
            opaqueFragmentDepthCandidatePolyIdCounts[polyId]++;
            opaqueFragmentDepthCandidateCount++;
        }
    }
    u32 opaqueFragmentDepthPrepassSelectedCount = 0;
    if (opaqueFragmentDepthCandidateCount >= 2u)
    {
        for (u32 drawIndex : GraphicsOpaqueDrawIndices)
        {
            if (drawIndex >= GraphicsPolygons.size()
                || (drawIndex < opaqueOverwriteCulledDraws.size() && opaqueOverwriteCulledDraws[drawIndex] != 0u)
                || (drawIndex < colorOnlyOpaqueDrawSelected.size() && colorOnlyOpaqueDrawSelected[drawIndex] != 0u))
            {
                continue;
            }

            const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
            const u32 polyId = (draw.polyAttr >> 24u) & 0x3Fu;
            if (opaqueFragmentDepthCandidatePolyIdCounts[polyId] != 1u
                || !isLargeFragmentDepthOpaqueCandidate(draw))
            {
                continue;
            }

            opaqueFragmentDepthPrepassSelected[drawIndex] = 1u;
            opaqueFragmentDepthPrepassSelectedCount++;
        }
    }

    u32 paletteUiOpaqueReplayFirstDraw = 0xFFFFFFFFu;
    u32 paletteUiOpaqueReplayFirstPolyId = 0xFFFFFFFFu;
    u32 paletteUiOpaqueReplayFirstTexParam = 0u;
    const bool enableReverseOpaqueOcclusion =
        usesGraphicsProductResources
        && !useBitmapClear
        && !alphaBlendEnabled;
    const auto reverseOpaqueOcclusionPipelineFor = [&](const GraphicsPolygonDraw& draw, u32 pipelineIndex) -> VkPipeline {
        const bool noDepth = (draw.polyAttr & (1u << 11u)) == 0u;
        VkPipeline pipeline = fastOpaqueModulateOcclusionNoAttrPipelineFor(draw, pipelineIndex, noDepth);
        if (pipeline != VK_NULL_HANDLE)
            return pipeline;
        return VK_NULL_HANDLE;
    };
    const auto isReverseOpaqueOcclusionEligible = [&](u32 drawIndex) -> bool {
        if (drawIndex >= GraphicsPolygons.size()
            || (drawIndex < opaqueOverwriteCulledDraws.size() && opaqueOverwriteCulledDraws[drawIndex] != 0u)
            || opaqueFragmentDepthPrepassSelected[drawIndex] != 0u)
        {
            return false;
        }
        if (!GraphicsShadowMaskDrawIndices.empty()
            || !GraphicsShadowDrawIndices.empty())
        {
            return false;
        }

        const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
        if (!canSkipOpaqueAttrWrite(draw) || requiresWBufferFragmentDepth(draw))
            return false;

        const u32 pipelineIndex = opaquePipelineIndexFor(draw);
        return reverseOpaqueOcclusionPipelineFor(draw, pipelineIndex) != VK_NULL_HANDLE;
    };
    const auto triangleContainsPoint = [](const TriangleGpu& tri, float px, float py) -> bool {
        const auto edge = [](float ax, float ay, float bx, float by, float cx, float cy) {
            return ((cx - ax) * (by - ay)) - ((cy - ay) * (bx - ax));
        };

        const float e0 = edge(tri.x0, tri.y0, tri.x1, tri.y1, px, py);
        const float e1 = edge(tri.x1, tri.y1, tri.x2, tri.y2, px, py);
        const float e2 = edge(tri.x2, tri.y2, tri.x0, tri.y0, px, py);
        constexpr float kCoverageEpsilon = 0.5f;
        const bool hasNegative = e0 < -kCoverageEpsilon || e1 < -kCoverageEpsilon || e2 < -kCoverageEpsilon;
        const bool hasPositive = e0 > kCoverageEpsilon || e1 > kCoverageEpsilon || e2 > kCoverageEpsilon;
        return !(hasNegative && hasPositive);
    };
    const auto reverseOpaqueDrawFullyCoversScreen = [&](const GraphicsPolygonDraw& draw) -> bool {
        if (draw.firstTriangle >= Triangles.size() || draw.triangleCount == 0u)
            return false;

        const TriangleGpu& firstTriangle = Triangles[draw.firstTriangle];
        const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
        const bool fullAlpha =
            (firstTriangle.flags & kTriangleFlagTextureOpaque) != 0u
            && ((draw.polyAttr >> 16u) & 0x1Fu) == 0x1Fu
            && alphaRef < 0x1Fu;
        if (!fullAlpha
            || blendMode != 0u
            || (firstTriangle.flags & (kTriangleFlagTextured | kTriangleFlagDecal)) != kTriangleFlagTextured)
        {
            return false;
        }

        const VkRect2D scissor = drawGraphicsScissor(draw);
        if (scissor.offset.x > 0
            || scissor.offset.y > 0
            || scissor.extent.width < renderWidth
            || scissor.extent.height < renderHeight)
        {
            return false;
        }

        const std::array<std::pair<float, float>, 5> coveragePoints{{
            {0.5f, 0.5f},
            {static_cast<float>(ColorImageWidth) - 0.5f, 0.5f},
            {0.5f, static_cast<float>(ColorImageHeight) - 0.5f},
            {static_cast<float>(ColorImageWidth) - 0.5f, static_cast<float>(ColorImageHeight) - 0.5f},
            {static_cast<float>(ColorImageWidth) * 0.5f, static_cast<float>(ColorImageHeight) * 0.5f},
        }};

        for (const auto& [px, py] : coveragePoints)
        {
            bool pointCovered = false;
            const u32 triangleEnd = std::min<u32>(
                static_cast<u32>(Triangles.size()),
                draw.firstTriangle + draw.triangleCount);
            for (u32 triangleIndex = draw.firstTriangle; triangleIndex < triangleEnd; triangleIndex++)
            {
                if (triangleContainsPoint(Triangles[triangleIndex], px, py))
                {
                    pointCovered = true;
                    break;
                }
            }
            if (!pointCovered)
                return false;
        }

        return true;
    };

    currentGraphicsDebugPassKind = GraphicsDebugPassKind::Opaque;

    static const bool prepassGlobal = [] {
        if (std::getenv("MELON_PREPASS_GLOBAL") != nullptr)
            return true;
#ifdef __ANDROID__
        char v[92] = {};
        if (__system_property_get("debug.melonds.prepass_global", v) > 0)
            return v[0] == '1';
#endif
        return false;
    }();
    if (prepassGlobal && usesGraphicsProductResources)
    {
        for (size_t i = 0; i < GraphicsOpaqueDrawIndices.size(); i++)
        {
            const u32 drawIndex = GraphicsOpaqueDrawIndices[i];
            if (drawIndex >= GraphicsPolygons.size())
                continue;
            const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
            if ((draw.polyAttr & (1u << 11u)) == 0u)
                continue;
            const u32 pipelineIndex = opaquePipelineIndexFor(draw);
            VkPipeline prePipeline = VK_NULL_HANDLE;
            if (requiresWBufferFragmentDepth(draw))
                prePipeline = fragmentDepthPrepassPipelineFor(draw, pipelineIndex);
            else
            {
                const auto& arreglo = isOpaqueFullAlpha(draw)
                    ? GraphicsOpaquePrepassHwDepthPipelines
                    : GraphicsOpaqueAlphaPrepassHwDepthPipelines;
                if (pipelineIndex < arreglo.size())
                    prePipeline = arreglo[pipelineIndex];
            }
            if (prePipeline != VK_NULL_HANDLE)
                bindAndDrawGraphics(draw, prePipeline, 0xFFu, 0x00u, 0u);
        }
        for (size_t i = GraphicsOpaqueDrawIndices.size(); i > 0u; i--)
        {
            const u32 drawIndex = GraphicsOpaqueDrawIndices[i - 1u];
            if (drawIndex >= GraphicsPolygons.size())
                continue;
            const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
            const u32 pipelineIndex = opaquePipelineIndexFor(draw) | 1u;
            const bool noAttr = canSkipOpaqueAttrWrite(draw);
            if (!noAttr)
                countOpaqueNoAttrMiss(draw);
            VkPipeline pipeline = fastOpaqueModulatePipelineFor(draw, pipelineIndex, noAttr);
            if (pipeline == VK_NULL_HANDLE)
                pipeline = opaquePipelineFor(draw, pipelineIndex, noAttr);
            if (pipeline == VK_NULL_HANDLE)
                continue;
            if (bindAndDrawGraphics(draw, pipeline, 0xFFu, 0xFFu, (draw.polyAttr >> 24u) & 0x3Fu))
            {
                graphicsPassDebugStats.opaque++;
                if (noAttr)
                    graphicsPassDebugStats.opaqueNoAttr++;
            }
        }
    }
    else
    for (size_t opaqueListIndex = 0; opaqueListIndex < GraphicsOpaqueDrawIndices.size(); opaqueListIndex++)
    {
        if (enableReverseOpaqueOcclusion && isReverseOpaqueOcclusionEligible(GraphicsOpaqueDrawIndices[opaqueListIndex]))
        {
            size_t runEnd = opaqueListIndex + 1u;
            while (runEnd < GraphicsOpaqueDrawIndices.size()
                && isReverseOpaqueOcclusionEligible(GraphicsOpaqueDrawIndices[runEnd]))
            {
                runEnd++;
            }

            if (runEnd - opaqueListIndex >= 2u)
            {
                size_t visibleRunStart = opaqueListIndex;
                for (size_t candidateIndex = runEnd; candidateIndex > opaqueListIndex; candidateIndex--)
                {
                    const u32 candidateDrawIndex = GraphicsOpaqueDrawIndices[candidateIndex - 1u];
                    if (candidateDrawIndex < GraphicsPolygons.size()
                        && reverseOpaqueDrawFullyCoversScreen(GraphicsPolygons[candidateDrawIndex]))
                    {
                        visibleRunStart = candidateIndex - 1u;
                        break;
                    }
                }

                VkRect2D reverseRunScissor = drawGraphicsScissor(GraphicsPolygons[GraphicsOpaqueDrawIndices[visibleRunStart]]);
                for (size_t scissorIndex = visibleRunStart + 1u; scissorIndex < runEnd; scissorIndex++)
                {
                    const u32 scissorDrawIndex = GraphicsOpaqueDrawIndices[scissorIndex];
                    if (scissorDrawIndex < GraphicsPolygons.size())
                        reverseRunScissor = unionGraphicsScissor(reverseRunScissor, drawGraphicsScissor(GraphicsPolygons[scissorDrawIndex]));
                }
                clearShadowStencilBit(&reverseRunScissor);
                for (size_t reverseIndex = runEnd; reverseIndex > visibleRunStart; reverseIndex--)
                {
                    const u32 reverseDrawIndex = GraphicsOpaqueDrawIndices[reverseIndex - 1u];
                    const GraphicsPolygonDraw& reverseDraw = GraphicsPolygons[reverseDrawIndex];
                    const u32 reversePipelineIndex = opaquePipelineIndexFor(reverseDraw);
                    const VkPipeline reversePipeline = reverseOpaqueOcclusionPipelineFor(reverseDraw, reversePipelineIndex);
                    if (bindAndDrawGraphics(reverseDraw, reversePipeline, 0x80u, 0x80u, 0x80u))
                    {
                        graphicsPassDebugStats.opaque++;
                        graphicsPassDebugStats.opaqueNoAttr++;
                        graphicsPassDebugStats.opaqueReverseOcclusion++;
                        if (reversePipelineIndex < GraphicsOpaqueFastModulateOpaqueAlphaPlainNoDepthOcclusionNoAttrPipelines.size()
                            && reversePipeline == GraphicsOpaqueFastModulateOpaqueAlphaPlainNoDepthOcclusionNoAttrPipelines[reversePipelineIndex])
                        {
                            graphicsPassDebugStats.opaqueNoDepthNoAttr++;
                        }
                    }
                }
                graphicsPassDebugStats.opaqueOverwriteCulled += static_cast<u32>(visibleRunStart - opaqueListIndex);
                clearShadowStencilBit(&reverseRunScissor);
                opaqueListIndex = runEnd - 1u;
                continue;
            }
        }

        const u32 drawIndex = GraphicsOpaqueDrawIndices[opaqueListIndex];
        if (drawIndex >= GraphicsPolygons.size())
            continue;
        if (drawIndex < opaqueOverwriteCulledDraws.size() && opaqueOverwriteCulledDraws[drawIndex] != 0u)
        {
            graphicsPassDebugStats.opaqueOverwriteCulled++;
            continue;
        }
        if (drawIndex < colorOnlyOpaqueDrawSelected.size() && colorOnlyOpaqueDrawSelected[drawIndex] != 0u)
            continue;
        const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
        const u32 pipelineIndex = opaquePipelineIndexFor(draw);
        if (opaqueFragmentDepthPrepassSelected[drawIndex] != 0u)
        {
            const u32 prepassStencilRef = 0x80u | ((draw.polyAttr >> 24u) & 0x3Fu);
            const VkPipeline prepassPipeline = fragmentDepthPrepassPipelineFor(draw, pipelineIndex);
            const VkPipeline resolvePipeline = pipelineIndex < GraphicsOpaqueStencilResolvePipelines.size()
                ? GraphicsOpaqueStencilResolvePipelines[pipelineIndex]
                : VK_NULL_HANDLE;
            bindAndDrawGraphics(draw, prepassPipeline, 0xFFu, 0xFFu, prepassStencilRef);
            if (bindAndDrawGraphics(draw, resolvePipeline, 0xFFu, 0x80u, prepassStencilRef))
                graphicsPassDebugStats.opaque++;
            continue;
        }

        const bool noAttr = canSkipOpaqueAttrWrite(draw);
        if (!noAttr)
            countOpaqueNoAttrMiss(draw);
        const VkPipeline fastPipeline = fastOpaqueModulatePipelineFor(draw, pipelineIndex, noAttr);
        VkPipeline pipeline = fastPipeline;
        if (pipeline == VK_NULL_HANDLE)
        {
            graphicsPassDebugStats.denseOpaqueFastPipelineMisses++;
            pipeline = opaquePipelineFor(draw, pipelineIndex, noAttr);
        }
        else
            graphicsPassDebugStats.denseOpaqueFastCandidates++;

        if (pipeline == VK_NULL_HANDLE)
            continue;
        if (rasterDispatchPolicy.enableFastOpaqueBatching
            && pipeline == fastPipeline
            && fastPipeline != VK_NULL_HANDLE)
        {
            u32 mergedTriangleCount = draw.triangleCount;
            u32 mergedSourceDraws = 1u;
            VkRect2D mergedScissor = drawGraphicsScissor(draw);
            while (opaqueListIndex + 1u < GraphicsOpaqueDrawIndices.size())
            {
                const u32 nextDrawIndex = GraphicsOpaqueDrawIndices[opaqueListIndex + 1u];
                if (nextDrawIndex >= GraphicsPolygons.size()
                    || opaqueFragmentDepthPrepassSelected[nextDrawIndex] != 0u)
                {
                    break;
                }

                const GraphicsPolygonDraw& nextDraw = GraphicsPolygons[nextDrawIndex];
                GraphicsPolygonDraw mergedDraw = draw;
                mergedDraw.triangleCount = mergedTriangleCount;
                if (!fastOpaqueDrawsCanBatch(mergedDraw, pipeline, pipelineIndex, nextDraw))
                {
                    countFastOpaqueBatchBreak(mergedDraw, pipeline, pipelineIndex, nextDraw);
                    break;
                }

                mergedTriangleCount += nextDraw.triangleCount;
                mergedSourceDraws++;
                mergedScissor = unionGraphicsScissor(mergedScissor, drawGraphicsScissor(nextDraw));
                opaqueListIndex++;
            }

            if (bindAndDrawFastOpaqueBatch(draw, mergedTriangleCount, pipeline, mergedScissor))
            {
                graphicsPassDebugStats.opaque += mergedSourceDraws;
                if (noAttr)
                    graphicsPassDebugStats.opaqueNoAttr += mergedSourceDraws;
                graphicsPassDebugStats.fastOpaqueBatchCommands++;
                graphicsPassDebugStats.fastOpaqueBatchSavedDraws += mergedSourceDraws - 1u;
                continue;
            }
        }

        if (usesGraphicsProductResources
            && fastPipeline == VK_NULL_HANDLE
            && rasterDispatchPolicy.enableFastOpaqueBatching
            && genericOpaqueScissorContainsCoverage(draw, drawGraphicsScissor(draw)))
        {
            u32 mergedTriangleCount = draw.triangleCount;
            u32 mergedSourceDraws = 1u;
            VkRect2D mergedScissor = drawGraphicsScissor(draw);
            size_t last = opaqueListIndex;
            while (last + 1u < GraphicsOpaqueDrawIndices.size())
            {
                const u32 nextDrawIndex = GraphicsOpaqueDrawIndices[last + 1u];
                if (nextDrawIndex >= GraphicsPolygons.size()
                    || opaqueFragmentDepthPrepassSelected[nextDrawIndex] != 0u)
                    break;
                const GraphicsPolygonDraw& nextDraw = GraphicsPolygons[nextDrawIndex];
                GraphicsPolygonDraw mergedDraw = draw;
                mergedDraw.triangleCount = mergedTriangleCount;
                const bool nextNoAttr = canSkipOpaqueAttrWrite(nextDraw);
                if (!genericOpaqueDrawsCanBatch(mergedDraw, pipeline, pipelineIndex, nextDraw, nextNoAttr))
                    break;
                const VkRect2D nextScissor = drawGraphicsScissor(nextDraw);
                if (!genericOpaqueScissorContainsCoverage(nextDraw, nextScissor))
                    break;
                mergedTriangleCount += nextDraw.triangleCount;
                mergedSourceDraws++;
                mergedScissor = unionGraphicsScissor(mergedScissor, nextScissor);
                ++last;
            }
            if (mergedSourceDraws > 1u
                && bindAndDrawFastOpaqueBatch(draw, mergedTriangleCount, pipeline, mergedScissor))
            {
                graphicsPassDebugStats.opaque += mergedSourceDraws;
                if (noAttr)
                    graphicsPassDebugStats.opaqueNoAttr += mergedSourceDraws;
                if (fogFlagEnabledFor(draw))
                {
                    graphicsFogWriteObserved = true;
                    graphicsPassDebugStats.fogWriteOpaque += mergedSourceDraws;
                }
                graphicsPassDebugStats.fastOpaqueBatchCommands++;
                graphicsPassDebugStats.fastOpaqueBatchSavedDraws += mergedSourceDraws - 1u;
                pushConstants.triangleCount = GraphicsPolygons[GraphicsOpaqueDrawIndices[last]].triangleCount;
                opaqueListIndex = last;
                if (MelonDSAndroid::areRendererDebugToolsEnabled())
                {
                    static std::atomic<unsigned> loggedBatches{0u};
                    if (loggedBatches.fetch_add(1u, std::memory_order_relaxed) < 8u)
                        Log(LogLevel::Warn, "VulkanGraphics[GenericOpaqueBatch]: scale=%u sourceDraws=%u triangles=%u",
                            effectiveRasterScale, mergedSourceDraws, mergedTriangleCount);
                }
                continue;
            }
        }
        if (bindAndDrawGraphics(draw, pipeline, 0xFFu, 0xFFu, (draw.polyAttr >> 24u) & 0x3Fu))
        {
            graphicsPassDebugStats.opaque++;
            if (noAttr)
                graphicsPassDebugStats.opaqueNoAttr++;
        }
    }
    currentGraphicsDebugPassKind = GraphicsDebugPassKind::Other;
    if ((timestampQueryPool != VK_NULL_HANDLE) && timestampPending && perfSecciones)
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT, timestampQueryPool, 3);

    if ((dispCnt & (1u << 5u)) != 0u)
    {
        const VkDeviceSize graphicsSceneVertexOffset = MitadEscenaActiva;
        vkCmdBindVertexBuffers(commandBuffer, 0, 1, &graphicsSceneVertexBuffer, &graphicsSceneVertexOffset);
        vkCmdBindIndexBuffer(commandBuffer, graphicsEdgeIndexBuffer, MitadAristasActiva, VK_INDEX_TYPE_UINT16);

        const auto canBatchAlphaEdges = [&](const GraphicsPolygonDraw& draw,
                                            const VkRect2D& scissor) {
            if (!usesGraphicsProductResources
                || GraphicsEdgeMarkAlphaPipelines[1] == VK_NULL_HANDLE
                || alphaRef >= 31u
                || ((draw.polyAttr >> 16u) & 0x1Fu) != 31u
                || (draw.flags & AcceleratedPolygonFlagWBuffer) == 0u
                || (draw.flags & AcceleratedPolygonFlagShadowMask) != 0u
                || draw.edgeColorOverrideMask != 0u
                || draw.triangleCount == 0u || draw.firstTriangle >= Triangles.size()
                || draw.edgeIndexCount == 0u || (draw.edgeIndexCount & 1u) != 0u
                || static_cast<u64>(draw.firstEdgeIndex) + draw.edgeIndexCount
                    > SharedGraphicsScene.EdgeIndices.size())
                return false;

            const float left = static_cast<float>(scissor.offset.x);
            const float top = static_cast<float>(scissor.offset.y);
            const float right = left + scissor.extent.width;
            const float bottom = top + scissor.extent.height;
            for (u32 i = 0u; i < draw.edgeIndexCount; ++i)
            {
                const u32 index = SharedGraphicsScene.EdgeIndices[draw.firstEdgeIndex + i];
                if (index >= GraphicsSceneVertices.size()
                    || index < draw.firstVertex || index - draw.firstVertex >= draw.vertexCount)
                    return false;
                const GraphicsVertexGpu& vertex = GraphicsSceneVertices[index];
                if (!std::isfinite(vertex.x) || !std::isfinite(vertex.y)
                    || !std::isfinite(vertex.reciprocalW) || vertex.reciprocalW <= 0.0f
                    || (left > 0.0f && vertex.x < left + 1.0f)
                    || (top > 0.0f && vertex.y < top + 1.0f)
                    || (right < fullGraphicsScissor.extent.width && vertex.x > right - 1.0f)
                    || (bottom < fullGraphicsScissor.extent.height && vertex.y > bottom - 1.0f))
                    return false;
            }
            return true;
        };
        u32 edgeBatchCommands = 0u;
        u32 edgeBatchSaved = 0u;
        for (size_t edgeDrawIndex = 0u; edgeDrawIndex < GraphicsPolygons.size(); ++edgeDrawIndex)
        {
            const GraphicsPolygonDraw& draw = GraphicsPolygons[edgeDrawIndex];
            if ((draw.flags & AcceleratedPolygonFlagShadowMask) != 0u)
                continue;

            VkRect2D scissor = drawGraphicsScissor(draw);
            if (canBatchAlphaEdges(draw, scissor))
            {
                u32 indexCount = draw.edgeIndexCount;
                size_t last = edgeDrawIndex;
                const u32 textureIndex = Triangles[draw.firstTriangle].texArrayIndex;
                while (last + 1u < GraphicsPolygons.size())
                {
                    const GraphicsPolygonDraw& next = GraphicsPolygons[last + 1u];
                    const VkRect2D nextScissor = drawGraphicsScissor(next);
                    if (!canBatchAlphaEdges(next, nextScissor)
                        || static_cast<u64>(draw.firstEdgeIndex) + indexCount != next.firstEdgeIndex
                        || Triangles[next.firstTriangle].texArrayIndex != textureIndex)
                        break;
                    indexCount += next.edgeIndexCount;
                    scissor = unionGraphicsScissor(scissor, nextScissor);
                    ++last;
                }
                if (last > edgeDrawIndex
                    && bindAndDrawGraphicsEdges(draw, indexCount, &scissor))
                {
                    graphicsPassDebugStats.edge += static_cast<u32>(last - edgeDrawIndex + 1u);
                    ++edgeBatchCommands;
                    edgeBatchSaved += static_cast<u32>(last - edgeDrawIndex);

                    pushConstants.triangleBase = GraphicsPolygons[last].firstTriangle;
                    pushConstants.triangleCount = GraphicsPolygons[last].triangleCount;
                    edgeDrawIndex = last;
                    continue;
                }
            }
            if (bindAndDrawGraphicsEdges(draw))
                graphicsPassDebugStats.edge++;
        }
        if (edgeBatchSaved != 0u && MelonDSAndroid::areRendererDebugToolsEnabled())
        {
            static std::atomic<unsigned> loggedBatches{0u};
            if (loggedBatches.fetch_add(1u, std::memory_order_relaxed) < 8u)
                Log(LogLevel::Warn, "VulkanGraphics[EdgeAlphaBatch]: scale=%u commands=%u saved=%u",
                    effectiveRasterScale, edgeBatchCommands, edgeBatchSaved);
        }

        vkCmdBindVertexBuffers(commandBuffer, 0, 1, &graphicsVertexBuffer, &graphicsVertexOffset);
    }

    if ((timestampQueryPool != VK_NULL_HANDLE) && timestampPending && perfSecciones)
    {
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT, timestampQueryPool, 4);
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT, timestampQueryPool, 5);
    }
    GraphicsMainCpuWindow.Add(PerfNowNs() - graphicsMainCpuStartNs);

    const u64 graphicsAlphaCpuStartNs = PerfNowNs();
    currentGraphicsDebugPassKind = GraphicsDebugPassKind::Alpha;
    const auto canUseFastTranslucentTextureSampling = [&](const GraphicsPolygonDraw& draw) {
        const TriangleGpu& triangle = Triangles[draw.firstTriangle];
        if ((triangle.flags & kTriangleFlagLinear) == 0u)
            return true;
        const u32 wrapFlags = (1u << 16u) | (1u << 17u) | (1u << 18u) | (1u << 19u);
        const u32 textureFormat = (triangle.texParam >> 26u) & 0x7u;
        return (triangle.texParam & wrapFlags) == 0u && textureFormat != 3u;
    };
    const bool useFastBgZeroModulatePlain = usesGraphicsProductResources
        && VulkanContext::Get().SupportsDynamicTextureIndexing()
        && (dispCnt & (1u << 0u)) != 0u;
    const auto fastBgZeroModulatePlainPipelineFor = [&](
        const GraphicsPolygonDraw& draw, u32 pipelineIndex) -> VkPipeline {
        if (!useFastBgZeroModulatePlain
            || draw.firstTriangle >= Triangles.size()
            || pipelineIndex >= GraphicsBgZeroFastModulatePlainPipelines.size()
            || (draw.flags & (AcceleratedPolygonFlagShadow | AcceleratedPolygonFlagShadowMask)) != 0u
            || ((draw.polyAttr >> 4u) & 0x3u) != 0u)
        {
            return VK_NULL_HANDLE;
        }
        const u32 flags = Triangles[draw.firstTriangle].flags;
        const u32 requiredFlags = kTriangleFlagWBuffer | kTriangleFlagTextured;
        const u32 disallowedFlags = kTriangleFlagDecal;
        if ((flags & requiredFlags) != requiredFlags || (flags & disallowedFlags) != 0u
            || !canUseFastTranslucentTextureSampling(draw))
            return VK_NULL_HANDLE;
        return GraphicsBgZeroFastModulatePlainPipelines[pipelineIndex];
    };
    if (clearPlaneAlphaZero)
    {
        for (const GraphicsPolygonDraw& draw : GraphicsPolygons)
        {
            if (draw.triangleCount == 0u)
                continue;

            const bool isShadowMask = (draw.flags & AcceleratedPolygonFlagShadowMask) != 0u;
            const bool isTranslucent = (draw.flags & AcceleratedPolygonFlagTranslucent) != 0u;
            const bool isShadow = (draw.flags & AcceleratedPolygonFlagShadow) != 0u;
            const bool needOpaque = (draw.flags & AcceleratedPolygonFlagNeedOpaquePass) != 0u;
            const u32 polyId = (draw.polyAttr >> 24u) & 0x3Fu;

            if (isShadowMask)
            {
                const bool wBuffer = (Triangles[draw.firstTriangle].flags & kTriangleFlagWBuffer) != 0u;
                const u32 wMode = wBuffer ? 1u : 0u;
                const VkPipeline pipeline = wMode < GraphicsShadowMaskBgZeroPipelines.size()
                    ? GraphicsShadowMaskBgZeroPipelines[wMode]
                    : VK_NULL_HANDLE;
                if (bindAndDrawGraphics(draw, pipeline, 0xFFu, 0x01u, 0xFFu))
                    graphicsPassDebugStats.bgZeroShadowMask++;
                continue;
            }

            if (!isTranslucent)
                continue;

            if (needOpaque)
            {
                drawNeedOpaquePass(draw);
                graphicsPassDebugStats.bgZeroNeedOpaque++;
            }

            if (needOpaque && !isShadow && isOpaqueFullAlpha(draw))
                continue;

            const bool fogWrite = fogWriteEnabledFor(draw);
            const u32 writeMask = static_cast<u32>(~(0x40u | polyId)) & 0xFFu;
            if (isShadow)
            {
                if (polyId != clearPlanePolyId)
                {
                    graphicsPassDebugStats.bgZeroShadowSkippedPolyId++;
                    continue;
                }

                const u32 pipelineIndex = translucentPipelineIndexFor(draw, fogWrite, alphaBlendEnabled);
                const VkPipeline pipeline = pipelineIndex < GraphicsShadowBlendBgZeroPipelines.size()
                    ? GraphicsShadowBlendBgZeroPipelines[pipelineIndex]
                    : VK_NULL_HANDLE;
                if (bindAndDrawGraphics(draw, pipeline, 0xFFu, writeMask, 0xFEu))
                    graphicsPassDebugStats.bgZeroShadowBlend++;
            }
            else
            {
                const u32 pipelineIndex = bgZeroTranslucentPipelineIndexFor(draw, fogWrite);
                const bool boundedDepth = draw.boundedEqualDepth != 0xFFFFFFFFu;
                VkPipeline pipeline = boundedDepth
                    ? GraphicsBoundedDepthBgZeroTranslucentPipelines[pipelineIndex]
                    : fastBgZeroModulatePlainPipelineFor(draw, pipelineIndex);
                const bool specialized = !boundedDepth && pipeline != VK_NULL_HANDLE;
                if (!boundedDepth && !specialized)
                {
                    pipeline = pipelineIndex < GraphicsBgZeroTranslucentPipelines.size()
                        ? GraphicsBgZeroTranslucentPipelines[pipelineIndex]
                        : VK_NULL_HANDLE;
                }
                if (bindAndDrawGraphics(draw, pipeline, 0xFEu, writeMask, 0xFFu))
                {
                    graphicsPassDebugStats.bgZeroTranslucent++;
                    if (specialized && MelonDSAndroid::areRendererDebugToolsEnabled())
                    {
                        static u32 logged[2] {};
                        const u32 scaleClass = effectiveRasterScale > 1u ? 1u : 0u;
                        if (logged[scaleClass] < 4u)
                        {
                            Log(LogLevel::Warn,
                                "VulkanGraphics[BgZeroFastPlain]: scale=%u triangles=%u polyAttr=%#x",
                                effectiveRasterScale, draw.triangleCount, draw.polyAttr);
                            logged[scaleClass]++;
                        }
                    }
                }
            }
        }
    }

    const GraphicsPolygonDraw* soleTranslucentOverTransparentClear = nullptr;
    if (rasterDispatchPolicy.replaceSoleTranslucentOverTransparentClear
        && !useBitmapClear
        && clearPlaneAlphaZero
        && alphaBlendEnabled
        && GraphicsPolygons.size() == 1u
        && GraphicsAlphaDrawIndices.size() == 1u
        && GraphicsAlphaDrawIndices.front() < GraphicsPolygons.size()
        && GraphicsNeedOpaqueDrawIndices.empty())
    {
        soleTranslucentOverTransparentClear =
            &GraphicsPolygons[GraphicsAlphaDrawIndices.front()];
    }

    const bool useFastModulatePlainFragmentDepth =
        usesGraphicsProductResources && VulkanContext::Get().SupportsDynamicTextureIndexing();
    const auto fastTranslucentModulatePlainPipelineFor = [&](
        const GraphicsPolygonDraw& draw,
        u32 pipelineIndex,
        bool replaceTransparentDestination) -> VkPipeline {
        if (!useFastModulatePlainFragmentDepth
            || !alphaBlendEnabled
            || replaceTransparentDestination
            || (dispCnt & (1u << 0u)) == 0u
            || draw.firstTriangle >= Triangles.size()
            || pipelineIndex >= GraphicsTranslucentFastModulatePlainFragmentDepthPipelines.size()
            || (draw.flags & (AcceleratedPolygonFlagShadow | AcceleratedPolygonFlagShadowMask)) != 0u
            || ((draw.polyAttr >> 4u) & 0x3u) != 0u)
        {
            return VK_NULL_HANDLE;
        }

        const u32 flags = Triangles[draw.firstTriangle].flags;
        const u32 requiredFlags = kTriangleFlagWBuffer | kTriangleFlagTextured;
        const u32 disallowedFlags = kTriangleFlagDecal;
        if ((flags & requiredFlags) != requiredFlags || (flags & disallowedFlags) != 0u
            || !canUseFastTranslucentTextureSampling(draw))
            return VK_NULL_HANDLE;

        return GraphicsTranslucentFastModulatePlainFragmentDepthPipelines[pipelineIndex];
    };

    bool stencilMascaraSucio = false;
    VkRect2D stencilMascaraRect{};
    for (const GraphicsPolygonDraw& draw : GraphicsPolygons)
    {
        if (draw.triangleCount == 0u)
            continue;

        const bool isShadowMask = (draw.flags & AcceleratedPolygonFlagShadowMask) != 0u;
        const bool isTranslucent = (draw.flags & AcceleratedPolygonFlagTranslucent) != 0u;
        const bool isShadow = (draw.flags & AcceleratedPolygonFlagShadow) != 0u;
        const bool needOpaque = (draw.flags & AcceleratedPolygonFlagNeedOpaquePass) != 0u;
        const u32 polyId = (draw.polyAttr >> 24u) & 0x3Fu;

        if (isShadowMask)
        {
            if (stencilMascaraSucio)
            {
                clearShadowStencilBit(&stencilMascaraRect);
                stencilMascaraSucio = false;
            }

            const bool wBuffer = (Triangles[draw.firstTriangle].flags & kTriangleFlagWBuffer) != 0u;
            const u32 wMode = wBuffer ? 1u : 0u;
            const bool useDepthComplement = &draw == depthComplementShadowMaskDraw;
            const auto& shadowMaskPipelines = useDepthComplement
                ? GraphicsShadowMaskDepthComplementPipelines
                : GraphicsShadowMaskPipelines;
            const VkPipeline pipeline = wMode < shadowMaskPipelines.size()
                ? shadowMaskPipelines[wMode]
                : VK_NULL_HANDLE;
            if (useDepthComplement
                && MelonDSAndroid::areRendererDebugToolsEnabled()
                && ShadowMaskDepthComplementLogsRemaining > 0u)
            {
                Log(
                    LogLevel::Warn,
                    "VulkanGraphics[ShadowMaskDepthComplement]: maskPolyAttr=%#x shadows=%zu clearAttr=%#x",
                    draw.polyAttr,
                    shadowProtocolDrawCount,
                    clearAttr);
                ShadowMaskDepthComplementLogsRemaining--;
            }
            if (bindAndDrawGraphics(draw, pipeline, 0x80u, 0x80u, 0x80u))
            {
                graphicsPassDebugStats.mainShadowMask++;
                const VkRect2D rectMascara = drawGraphicsScissor(draw);
                stencilMascaraRect = stencilMascaraSucio
                    ? unionGraphicsScissor(stencilMascaraRect, rectMascara)
                    : rectMascara;
                stencilMascaraSucio = true;
            }
            continue;
        }

        if (!isTranslucent)
            continue;

        if (needOpaque
            && (!clearPlaneAlphaZero
                || !GraphicsShadowMaskDrawIndices.empty()
                || !GraphicsShadowDrawIndices.empty()))
        {
            drawNeedOpaquePass(draw);
            graphicsPassDebugStats.mainNeedOpaque++;
        }

        if (needOpaque && !isShadow && isOpaqueFullAlpha(draw))
            continue;

        const bool fogWrite = fogWriteEnabledFor(draw);
        if (isShadow)
        {
            const u32 clearPipelineIndex = opaquePipelineIndexFor(draw);
            const VkPipeline clearPipeline = clearPipelineIndex < GraphicsShadowClearPipelines.size()
                ? GraphicsShadowClearPipelines[clearPipelineIndex]
                : VK_NULL_HANDLE;
            if (bindAndDrawGraphics(draw, clearPipeline, 0x3Fu, 0x80u, polyId))
                graphicsPassDebugStats.mainShadowClear++;

            const u32 blendPipelineIndex = translucentPipelineIndexFor(draw, fogWrite, alphaBlendEnabled);
            const VkPipeline blendPipeline = blendPipelineIndex < GraphicsShadowBlendPipelines.size()
                ? GraphicsShadowBlendPipelines[blendPipelineIndex]
                : VK_NULL_HANDLE;
            if (bindAndDrawGraphics(draw, blendPipeline, 0x80u, 0x7Fu, 0xC0u | polyId))
                graphicsPassDebugStats.mainShadowBlend++;
        }
        else
        {
            const bool replaceTransparentDestination =
                &draw == soleTranslucentOverTransparentClear;
            const u32 pipelineIndex = translucentPipelineIndexFor(
                draw,
                fogWrite,
                alphaBlendEnabled && !replaceTransparentDestination);
            const bool boundedDepth = draw.boundedEqualDepth != 0xFFFFFFFFu;
            VkPipeline pipeline = boundedDepth
                ? GraphicsBoundedDepthTranslucentPipelines[pipelineIndex]
                : fastTranslucentModulatePlainPipelineFor(draw, pipelineIndex, replaceTransparentDestination);
            if (!boundedDepth && pipeline == VK_NULL_HANDLE)
            {
                pipeline = pipelineIndex < GraphicsTranslucentPipelines.size()
                    ? GraphicsTranslucentPipelines[pipelineIndex]
                    : VK_NULL_HANDLE;
            }
            if (bindAndDrawGraphics(draw, pipeline, 0x7Fu, 0x7Fu, 0x40u | polyId))
                graphicsPassDebugStats.mainTranslucent++;
        }
    }
    currentGraphicsDebugPassKind = GraphicsDebugPassKind::Other;

    for (u32 drawIndex : GraphicsOpaqueDrawIndices)
    {
        if (drawIndex >= GraphicsPolygons.size())
            continue;

        const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
        if (!shouldReplayOpaquePaletteUiDraw(draw))
            continue;

        GraphicsPolygonDraw replayDraw = draw;
        replayDraw.polyAttr |= 1u << 14u;
        VkPipeline pipeline = VK_NULL_HANDLE;
        if (isCompactTopStatusGlyphDraw(draw))
        {
            const bool wBuffer = replayDraw.triangleCount > 0u
                && replayDraw.firstTriangle < Triangles.size()
                && ((Triangles[replayDraw.firstTriangle].flags & kTriangleFlagWBuffer) != 0u);
            const u32 wMode = wBuffer ? 1u : 0u;
            pipeline = wMode < GraphicsOpaqueUiOverlayPipelines.size()
                ? GraphicsOpaqueUiOverlayPipelines[wMode]
                : VK_NULL_HANDLE;
        }
        else
        {
            const u32 pipelineIndex = opaquePipelineIndexFor(replayDraw);
            pipeline = fastOpaqueModulatePipelineFor(replayDraw, pipelineIndex, false);
            if (pipeline == VK_NULL_HANDLE)
            {
                pipeline = opaquePipelineFor(replayDraw, pipelineIndex, false);
            }
        }
        if (bindAndDrawGraphics(replayDraw, pipeline, 0xFFu, 0xFFu, (replayDraw.polyAttr >> 24u) & 0x3Fu))
        {
            if (graphicsPassDebugStats.paletteUiOpaqueReplay == 0u)
            {
                paletteUiOpaqueReplayFirstDraw = drawIndex;
                paletteUiOpaqueReplayFirstPolyId = (replayDraw.polyAttr >> 24u) & 0x3Fu;
                paletteUiOpaqueReplayFirstTexParam = Triangles[replayDraw.firstTriangle].texParam;
            }
            graphicsPassDebugStats.paletteUiOpaqueReplay++;
        }
    }
    GraphicsAlphaCpuWindow.Add(PerfNowNs() - graphicsAlphaCpuStartNs);
    if ((timestampQueryPool != VK_NULL_HANDLE) && timestampPending && perfSecciones)
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT, timestampQueryPool, 6);

    if (MelonDSAndroid::areRendererDebugToolsEnabled())
    {
        const bool paletteUiOpaqueReplayActive = graphicsPassDebugStats.paletteUiOpaqueReplay > 0u;
        if (PaletteUiOpaqueReplayLogCooldown == 0u || paletteUiOpaqueReplayActive != PaletteUiOpaqueReplayLastActive)
        {
            Log(
                LogLevel::Warn,
                "VulkanGraphics[PaletteUiOpaqueReplay]: active=%u replayed=%u firstDraw=%u firstPolyId=%u firstTexParam=%08X clearAlphaZero=%u alphaBlend=%u",
                paletteUiOpaqueReplayActive ? 1u : 0u,
                graphicsPassDebugStats.paletteUiOpaqueReplay,
                paletteUiOpaqueReplayFirstDraw,
                paletteUiOpaqueReplayFirstPolyId,
                paletteUiOpaqueReplayFirstTexParam,
                clearPlaneAlphaZero ? 1u : 0u,
                alphaBlendEnabled ? 1u : 0u);
            PaletteUiOpaqueReplayLogCooldown = paletteUiOpaqueReplayActive ? 60u : 180u;
            PaletteUiOpaqueReplayLastActive = paletteUiOpaqueReplayActive;
        }
        else
        {
            PaletteUiOpaqueReplayLogCooldown--;
        }
    }

    if (MelonDSAndroid::areRendererDebugToolsEnabled())
    {
        u32 paletteUiGateCandidates = 0u;
        u32 paletteUiGateFirstDraw = 0xFFFFFFFFu;
        u32 paletteUiGateFirstPolyId = 0xFFFFFFFFu;
        u32 paletteUiGateFirstAlpha5 = 0xFFFFFFFFu;
        for (u32 drawIndex : GraphicsAlphaDrawIndices)
        {
            if (drawIndex >= GraphicsPolygons.size())
                continue;

            const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
            if (draw.firstTriangle >= Triangles.size())
                continue;

            const TriangleGpu& tri = Triangles[draw.firstTriangle];
            const u32 texParam = tri.texParam;
            const u32 textureFormat = (texParam >> 26u) & 0x7u;
            const bool color0Transparent = (texParam & (1u << 29u)) != 0u;
            const bool repeatS = (texParam & (1u << 16u)) != 0u;
            const bool repeatT = (texParam & (1u << 17u)) != 0u;
            const bool mirrorS = (texParam & (1u << 18u)) != 0u;
            const bool mirrorT = (texParam & (1u << 19u)) != 0u;
            const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
            const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
            const bool depthWriteDisabled = (draw.polyAttr & (1u << 11u)) == 0u;
            const bool matchesPaletteUiGate =
                (tri.flags & kTriangleFlagTextured) != 0u
                && (tri.flags & kTriangleFlagLinear) != 0u
                && textureFormat == 3u
                && color0Transparent
                && depthWriteDisabled
                && clearPlaneAlphaZero
                && alphaBlendEnabled
                && blendMode == 0u
                && alpha5 > 0u
                && alpha5 < 31u
                && !repeatS
                && !repeatT
                && !mirrorS
                && !mirrorT;
            if (!matchesPaletteUiGate)
                continue;

            if (paletteUiGateCandidates == 0u)
            {
                paletteUiGateFirstDraw = drawIndex;
                paletteUiGateFirstPolyId = (draw.polyAttr >> 24u) & 0x3Fu;
                paletteUiGateFirstAlpha5 = alpha5;
            }
            paletteUiGateCandidates++;
        }
        const bool paletteUiGateActive = paletteUiGateCandidates > 0u;
        if (PaletteUiGateLogCooldown == 0u || paletteUiGateActive != PaletteUiGateLastActive)
        {
            Log(
                LogLevel::Warn,
                "VulkanGraphics[PaletteUiGate]: candidates=%u firstDraw=%u firstPolyId=%u firstAlpha5=%u clearAlphaZero=%u alphaBlend=%u",
                paletteUiGateCandidates,
                paletteUiGateFirstDraw,
                paletteUiGateFirstPolyId,
                paletteUiGateFirstAlpha5,
                clearPlaneAlphaZero ? 1u : 0u,
                alphaBlendEnabled ? 1u : 0u);
            PaletteUiGateLogCooldown = paletteUiGateActive ? 60u : 180u;
            PaletteUiGateLastActive = paletteUiGateActive;
        }
        else
        {
            PaletteUiGateLogCooldown--;
        }
    }

    if (MelonDSAndroid::areRendererDebugToolsEnabled() && CaptureDebugLogsRemaining > 0u)
    {
        Log(
            LogLevel::Warn,
                "VulkanGraphics[Passes]: clearAlphaZero=%u clearPolyId=%u alphaBlend=%u opaque=%u edge=%u bgZeroShadowMask=%u bgZeroNeedOpaque=%u bgZeroShadowBlend=%u bgZeroTrans=%u bgZeroShadowSkipPolyId=%u mainShadowMask=%u mainNeedOpaque=%u mainShadowClear=%u mainShadowBlend=%u mainTrans=%u paletteUiOpaqueReplay=%u wBufferFragmentDepth=%u opaqueNoAttr=%u reverseOcclusion=%u noDepthNoAttr=%u overwriteCull=%u stencilClears=%u fastOpaqueBatchCommands=%u fastOpaqueBatchSavedDraws=%u fogWriteOpaque=%u fogWriteAlpha=%u",
            clearPlaneAlphaZero ? 1u : 0u,
            clearPlanePolyId,
            alphaBlendEnabled ? 1u : 0u,
            graphicsPassDebugStats.opaque,
            graphicsPassDebugStats.edge,
            graphicsPassDebugStats.bgZeroShadowMask,
            graphicsPassDebugStats.bgZeroNeedOpaque,
            graphicsPassDebugStats.bgZeroShadowBlend,
            graphicsPassDebugStats.bgZeroTranslucent,
            graphicsPassDebugStats.bgZeroShadowSkippedPolyId,
            graphicsPassDebugStats.mainShadowMask,
            graphicsPassDebugStats.mainNeedOpaque,
            graphicsPassDebugStats.mainShadowClear,
            graphicsPassDebugStats.mainShadowBlend,
            graphicsPassDebugStats.mainTranslucent,
            graphicsPassDebugStats.paletteUiOpaqueReplay,
            graphicsPassDebugStats.wBufferFragmentDepth,
            graphicsPassDebugStats.opaqueNoAttr,
            graphicsPassDebugStats.opaqueReverseOcclusion,
            graphicsPassDebugStats.opaqueNoDepthNoAttr,
            graphicsPassDebugStats.opaqueOverwriteCulled,
            graphicsPassDebugStats.stencilBitClears,
            graphicsPassDebugStats.fastOpaqueBatchCommands,
            graphicsPassDebugStats.fastOpaqueBatchSavedDraws,
            graphicsPassDebugStats.fogWriteOpaque,
            graphicsPassDebugStats.fogWriteAlpha);
        CaptureDebugLogsRemaining--;
    }

    LastGraphicsOpaqueNoAttrPassCount = graphicsPassDebugStats.opaqueNoAttr;
    LastGraphicsOpaqueReverseOcclusionPassCount = graphicsPassDebugStats.opaqueReverseOcclusion;
    LastGraphicsOpaqueNoDepthNoAttrPassCount = graphicsPassDebugStats.opaqueNoDepthNoAttr;
    LastGraphicsOpaqueNoAttrPolyIdMissCount = graphicsPassDebugStats.denseOpaqueNoAttrPolyIdMisses;
    LastGraphicsOpaqueNoAttrDepthMissCount = graphicsPassDebugStats.denseOpaqueNoAttrDepthMisses;
    LastGraphicsOpaqueNoAttrFogMissCount = graphicsPassDebugStats.denseOpaqueNoAttrFogMisses;
    LastGraphicsFogWriteOpaquePassCount = graphicsPassDebugStats.fogWriteOpaque;
    LastGraphicsFogWriteAlphaPassCount = graphicsPassDebugStats.fogWriteAlpha;

    if (MelonDSAndroid::areRendererDebugBgObjLogsEnabled()
        && DenseOpaquePassLogsRemaining > 0u
        && graphicsPassDebugStats.opaque >= 120u
        && graphicsPassDebugStats.opaque <= 240u)
    {
        Log(
            LogLevel::Warn,
            "VulkanGraphics[DenseOpaquePass]: opaque=%u noAttr=%u fast=%u fastMiss=%u batchCmds=%u batchSaved=%u noAttrMiss polyId=%u depth=%u fog=%u batchBreak nonContig=%u polyAttr=%u pipeline=%u texture=%u other=%u polyAttrOnly polyId=%u depth=%u fog=%u alpha=%u mix=%u",
            graphicsPassDebugStats.opaque,
            graphicsPassDebugStats.opaqueNoAttr,
            graphicsPassDebugStats.denseOpaqueFastCandidates,
            graphicsPassDebugStats.denseOpaqueFastPipelineMisses,
            graphicsPassDebugStats.fastOpaqueBatchCommands,
            graphicsPassDebugStats.fastOpaqueBatchSavedDraws,
            graphicsPassDebugStats.denseOpaqueNoAttrPolyIdMisses,
            graphicsPassDebugStats.denseOpaqueNoAttrDepthMisses,
            graphicsPassDebugStats.denseOpaqueNoAttrFogMisses,
            graphicsPassDebugStats.denseOpaqueBatchBreakNonContiguous,
            graphicsPassDebugStats.denseOpaqueBatchBreakPolyAttr,
            graphicsPassDebugStats.denseOpaqueBatchBreakPipeline,
            graphicsPassDebugStats.denseOpaqueBatchBreakTexture,
            graphicsPassDebugStats.denseOpaqueBatchBreakOther,
            graphicsPassDebugStats.denseOpaqueBatchBreakPolyIdOnly,
            graphicsPassDebugStats.denseOpaqueBatchBreakPolyDepthOnly,
            graphicsPassDebugStats.denseOpaqueBatchBreakPolyFogOnly,
            graphicsPassDebugStats.denseOpaqueBatchBreakPolyAlphaOnly,
            graphicsPassDebugStats.denseOpaqueBatchBreakPolyMiscOnly);
        DenseOpaquePassLogsRemaining--;
    }

    if (MelonDSAndroid::areRendererDebugBgObjLogsEnabled()
        && SparseOpaqueDetailLogsRemaining > 0u
        && ScaleFactor >= 8
        && graphicsPassDebugStats.opaque > 0u
        && graphicsPassDebugStats.opaque <= 32u)
    {
        u64 sparseOpaqueBboxPixels = 0;
        u32 sparseOpaqueUnionLeft = ColorImageWidth;
        u32 sparseOpaqueUnionTop = ColorImageHeight;
        u32 sparseOpaqueUnionRight = 0;
        u32 sparseOpaqueUnionBottom = 0;
        u32 sparseOpaqueValidBounds = 0;
        for (u32 drawIndex : GraphicsOpaqueDrawIndices)
        {
            if (drawIndex >= GraphicsPolygons.size())
                continue;

            const VkRect2D scissor = drawGraphicsScissor(GraphicsPolygons[drawIndex]);
            if (scissor.extent.width == 0u || scissor.extent.height == 0u)
                continue;

            const u32 left = static_cast<u32>(std::max<int32_t>(0, scissor.offset.x));
            const u32 top = static_cast<u32>(std::max<int32_t>(0, scissor.offset.y));
            const u32 right = std::min<u32>(ColorImageWidth, left + scissor.extent.width);
            const u32 bottom = std::min<u32>(ColorImageHeight, top + scissor.extent.height);
            if (right <= left || bottom <= top)
                continue;

            sparseOpaqueBboxPixels += static_cast<u64>(right - left) * static_cast<u64>(bottom - top);
            sparseOpaqueUnionLeft = std::min(sparseOpaqueUnionLeft, left);
            sparseOpaqueUnionTop = std::min(sparseOpaqueUnionTop, top);
            sparseOpaqueUnionRight = std::max(sparseOpaqueUnionRight, right);
            sparseOpaqueUnionBottom = std::max(sparseOpaqueUnionBottom, bottom);
            sparseOpaqueValidBounds++;
        }

        const u64 sparseOpaqueScreenPixels = static_cast<u64>(ColorImageWidth) * static_cast<u64>(ColorImageHeight);
        const u64 sparseOpaqueUnionPixels =
            sparseOpaqueUnionRight > sparseOpaqueUnionLeft && sparseOpaqueUnionBottom > sparseOpaqueUnionTop
                ? static_cast<u64>(sparseOpaqueUnionRight - sparseOpaqueUnionLeft)
                    * static_cast<u64>(sparseOpaqueUnionBottom - sparseOpaqueUnionTop)
                : 0u;
        const float sparseOpaqueCoveragePct = sparseOpaqueScreenPixels > 0u
            ? (static_cast<float>(sparseOpaqueUnionPixels) * 100.0f) / static_cast<float>(sparseOpaqueScreenPixels)
            : 0.0f;
        const float sparseOpaqueOverdrawX = sparseOpaqueUnionPixels > 0u
            ? static_cast<float>(sparseOpaqueBboxPixels) / static_cast<float>(sparseOpaqueUnionPixels)
            : 0.0f;
        Log(
            LogLevel::Warn,
            "VulkanGraphics[SparseOpaquePass]: opaque=%u list=%zu noAttr=%u fast=%u batchCmds=%u batchSaved=%u bounds=%u bboxPx=%llu unionPx=%llu coverage=%.1f%% bboxOverUnion=%.2fx union=(%u,%u)..(%u,%u)",
            graphicsPassDebugStats.opaque,
            GraphicsOpaqueDrawIndices.size(),
            graphicsPassDebugStats.opaqueNoAttr,
            graphicsPassDebugStats.denseOpaqueFastCandidates,
            graphicsPassDebugStats.fastOpaqueBatchCommands,
            graphicsPassDebugStats.fastOpaqueBatchSavedDraws,
            sparseOpaqueValidBounds,
            static_cast<unsigned long long>(sparseOpaqueBboxPixels),
            static_cast<unsigned long long>(sparseOpaqueUnionPixels),
            sparseOpaqueCoveragePct,
            sparseOpaqueOverdrawX,
            sparseOpaqueUnionLeft,
            sparseOpaqueUnionTop,
            sparseOpaqueUnionRight,
            sparseOpaqueUnionBottom);
        SparseOpaqueDetailLogsRemaining--;

        for (u32 drawIndex : GraphicsOpaqueDrawIndices)
        {
            if (SparseOpaqueDetailLogsRemaining == 0u || drawIndex >= GraphicsPolygons.size())
                break;

            const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
            const VkRect2D scissor = drawGraphicsScissor(draw);
            const TriangleGpu* tri = draw.firstTriangle < Triangles.size() ? &Triangles[draw.firstTriangle] : nullptr;
            const u64 pixels = static_cast<u64>(scissor.extent.width) * static_cast<u64>(scissor.extent.height);
            const float coveragePct = sparseOpaqueScreenPixels > 0u
                ? (static_cast<float>(pixels) * 100.0f) / static_cast<float>(sparseOpaqueScreenPixels)
                : 0.0f;
            Log(
                LogLevel::Warn,
                "VulkanGraphics[SparseOpaquePassDraw]: draw=%u triBase=%u triCount=%u polyAttr=%#x flags=%#x triFlags=%#x texDesc=%u texLayer=%u texSize=%ux%u texParam=%#x clip=(%d,%d)..(%d,%d) pixels=%llu screen=%.1f%% yBounds=%#x",
                drawIndex,
                draw.firstTriangle,
                draw.triangleCount,
                draw.polyAttr,
                draw.flags,
                tri != nullptr ? tri->flags : 0u,
                tri != nullptr ? tri->texArrayIndex : 0u,
                tri != nullptr ? tri->texLayer : 0u,
                tri != nullptr ? tri->texWidth : 0u,
                tri != nullptr ? tri->texHeight : 0u,
                tri != nullptr ? tri->texParam : 0u,
                scissor.offset.x,
                scissor.offset.y,
                scissor.offset.x + static_cast<int32_t>(scissor.extent.width),
                scissor.offset.y + static_cast<int32_t>(scissor.extent.height),
                static_cast<unsigned long long>(pixels),
                coveragePct,
                tri != nullptr ? tri->yBounds : 0u);
            SparseOpaqueDetailLogsRemaining--;
        }
    }

    TriangleCountWindow.Add(static_cast<u64>(Triangles.size()));
    PassCountWindow.Add(drawCount > 0u ? 1u : 0u);

    if (captureReadbackPath && boundGraphicsPipeline == VK_NULL_HANDLE)
    {

        bindGraphicsPipelineCached(GraphicsClearPipeline);

        static std::atomic<u64> captureGraphicsBootstrapCount{0u};
        const u64 bootstrapCount = captureGraphicsBootstrapCount.fetch_add(
            1u, std::memory_order_relaxed) + 1u;
        if (bootstrapCount == 1u)
        {
            Log(LogLevel::Warn,
                "VulkanH9: capture graphics state bootstrap count=%llu triangles=%zu polygons=%zu draws=%u\n",
                static_cast<unsigned long long>(bootstrapCount),
                Triangles.size(),
                GraphicsPolygons.size(),
                drawCount);
        }
    }

    vkCmdEndRenderPass(commandBuffer);

    if ((timestampQueryPool != VK_NULL_HANDLE) && timestampPending && !perfSecciones)
    {
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, timestampQueryPool, 3);
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, timestampQueryPool, 4);
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, timestampQueryPool, 5);
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, timestampQueryPool, 6);
    }

    const bool useSeparateRasterColor = RasterColorImage != ColorImage;
    VkImageMemoryBarrier samplingBarriers[3]{};
    for (VkImageMemoryBarrier& barrier : samplingBarriers)
    {
        barrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
        barrier.srcAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
        barrier.dstAccessMask = VK_ACCESS_SHADER_READ_BIT;
        barrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        barrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        barrier.subresourceRange.baseMipLevel = 0;
        barrier.subresourceRange.levelCount = 1;
        barrier.subresourceRange.baseArrayLayer = 0;
        barrier.subresourceRange.layerCount = 1;
    }
    samplingBarriers[0].image = RasterColorImage;
    samplingBarriers[0].dstAccessMask = useSeparateRasterColor
        ? VK_ACCESS_TRANSFER_READ_BIT
        : VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
    samplingBarriers[0].oldLayout = VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
    samplingBarriers[0].newLayout = useSeparateRasterColor
        ? VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL
        : VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
    samplingBarriers[0].subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    samplingBarriers[1].image = AttrImage;
    samplingBarriers[1].oldLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
    samplingBarriers[1].newLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
    samplingBarriers[1].subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    if (usesGraphicsProductResources)
    {
        samplingBarriers[2].image = DepthStencilImage;
        samplingBarriers[2].srcAccessMask = VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
        samplingBarriers[2].oldLayout = VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL;
        samplingBarriers[2].newLayout = VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL;
        samplingBarriers[2].subresourceRange.aspectMask = VK_IMAGE_ASPECT_DEPTH_BIT;
    }
    else
    {
        samplingBarriers[2].image = logicalDepthImage;
        samplingBarriers[2].oldLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
        samplingBarriers[2].newLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
        samplingBarriers[2].subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    }
    vkCmdPipelineBarrier(
        commandBuffer,
        usesGraphicsProductResources
            ? (VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT)
            : VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT,
        (useSeparateRasterColor ? VK_PIPELINE_STAGE_TRANSFER_BIT : VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT) |
            VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT,
        0,
        0,
        nullptr,
        0,
        nullptr,
        3,
        samplingBarriers
    );

    if (useSeparateRasterColor)
    {
    VkImageMemoryBarrier publishedColorToTransferDstBarrier{};
    publishedColorToTransferDstBarrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    publishedColorToTransferDstBarrier.srcAccessMask = ColorImageInitialized
        ? (VK_ACCESS_SHADER_READ_BIT | VK_ACCESS_TRANSFER_READ_BIT | VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT)
        : 0u;
    publishedColorToTransferDstBarrier.dstAccessMask = VK_ACCESS_TRANSFER_WRITE_BIT;
    publishedColorToTransferDstBarrier.oldLayout = ColorImageInitialized
        ? VK_IMAGE_LAYOUT_GENERAL
        : VK_IMAGE_LAYOUT_UNDEFINED;
    publishedColorToTransferDstBarrier.newLayout = VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL;
    publishedColorToTransferDstBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    publishedColorToTransferDstBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    publishedColorToTransferDstBarrier.image = ColorImage;
    publishedColorToTransferDstBarrier.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    publishedColorToTransferDstBarrier.subresourceRange.baseMipLevel = 0;
    publishedColorToTransferDstBarrier.subresourceRange.levelCount = 1;
    publishedColorToTransferDstBarrier.subresourceRange.baseArrayLayer = 0;
    publishedColorToTransferDstBarrier.subresourceRange.layerCount = 1;
    vkCmdPipelineBarrier(
        commandBuffer,
        ColorImageInitialized
            ? (VK_PIPELINE_STAGE_ALL_COMMANDS_BIT | VK_PIPELINE_STAGE_TRANSFER_BIT)
            : VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        0,
        0,
        nullptr,
        0,
        nullptr,
        1,
        &publishedColorToTransferDstBarrier);

    VkImageBlit publishBlit{};
    publishBlit.srcSubresource.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    publishBlit.srcSubresource.layerCount = 1;
    publishBlit.srcOffsets[1] = {
        static_cast<int32_t>(ColorImageWidth),
        static_cast<int32_t>(ColorImageHeight),
        1};
    publishBlit.dstSubresource.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    publishBlit.dstSubresource.layerCount = 1;
    publishBlit.dstOffsets[1] = {
        static_cast<int32_t>(ColorImageWidth),
        static_cast<int32_t>(ColorImageHeight),
        1};
    vkCmdBlitImage(
        commandBuffer,
        RasterColorImage,
        VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL,
        ColorImage,
        VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
        1,
        &publishBlit,
        VK_FILTER_NEAREST);

    std::array<VkImageMemoryBarrier, 2> postPublishBarriers{};
    postPublishBarriers[0].sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    postPublishBarriers[0].srcAccessMask = VK_ACCESS_TRANSFER_READ_BIT;
    postPublishBarriers[0].dstAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
    postPublishBarriers[0].oldLayout = VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL;
    postPublishBarriers[0].newLayout = VK_IMAGE_LAYOUT_GENERAL;
    postPublishBarriers[0].srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    postPublishBarriers[0].dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    postPublishBarriers[0].image = RasterColorImage;
    postPublishBarriers[0].subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    postPublishBarriers[0].subresourceRange.levelCount = 1;
    postPublishBarriers[0].subresourceRange.layerCount = 1;

    postPublishBarriers[1].sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    postPublishBarriers[1].srcAccessMask = VK_ACCESS_TRANSFER_WRITE_BIT;
    postPublishBarriers[1].dstAccessMask =
        VK_ACCESS_SHADER_READ_BIT |
        VK_ACCESS_TRANSFER_READ_BIT |
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
    postPublishBarriers[1].oldLayout = VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL;
    postPublishBarriers[1].newLayout = VK_IMAGE_LAYOUT_GENERAL;
    postPublishBarriers[1].srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    postPublishBarriers[1].dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    postPublishBarriers[1].image = ColorImage;
    postPublishBarriers[1].subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    postPublishBarriers[1].subresourceRange.levelCount = 1;
    postPublishBarriers[1].subresourceRange.layerCount = 1;
    vkCmdPipelineBarrier(
        commandBuffer,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT,
        0,
        0,
        nullptr,
        0,
        nullptr,
        static_cast<u32>(postPublishBarriers.size()),
        postPublishBarriers.data());
    }

    const bool runEdgePass = stormSsaoEnabled || ((dispCnt & (1u << 5u)) != 0u
        && (graphicsPassDebugStats.edge > 0u || GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride < 64u));

    const bool runFogPass = usesGraphicsProductResources
        ? ((dispCnt & (1u << 7u)) != 0u
            && nieblaDensidadNoCero
            && ((((clearAttr) & (1u << 15u)) != 0u)
                || graphicsFogWriteObserved))
        : ((dispCnt & (1u << 7u)) != 0u);
    const u64 finalCpuStartNs = PerfNowNs();

    static const bool sondaSinNiebla = [] {
        if (std::getenv("MELON_SONDA_SIN_NIEBLA") != nullptr)
            return true;
#ifdef __ANDROID__
        char v[92] = {};
        if (__system_property_get("debug.melonds.sonda_sin_niebla", v) > 0)
            return v[0] == '1';
#endif
        return false;
    }();
    if ((runEdgePass || runFogPass) && !sondaSinNiebla)
    {
        const u32 savedFinalVariantKey = pushConstants.variantKey;
        const u32 savedFinalTriangleBase = pushConstants.triangleBase;
        if (GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride < 64u)
        {
            pushConstants.variantKey = 0x80000000u | GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride;
            pushConstants.triangleBase = GraphicsHiddenAlphaZeroFinalEdgeColorOverride;
        }
        else
        {
            pushConstants.variantKey = 0u;
            pushConstants.triangleBase = 0u;
        }

        const VkRect2D finalScissor = usesGraphicsProductResources && hasFinalActiveScissor
            ? finalActiveScissor
            : fullGraphicsScissor;
        VkRenderPassBeginInfo finalBeginInfo{};
        finalBeginInfo.sType = VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO;
        finalBeginInfo.renderPass = GraphicsFinalRenderPass;
        finalBeginInfo.framebuffer = GraphicsFinalFramebuffer;
        finalBeginInfo.renderArea = finalScissor;
        vkCmdBeginRenderPass(commandBuffer, &finalBeginInfo, VK_SUBPASS_CONTENTS_INLINE);
        vkCmdSetViewport(commandBuffer, 0, 1, &viewport);
        vkCmdSetScissor(commandBuffer, 0, 1, &finalScissor);

        if (runEdgePass && runFogPass && GraphicsFinalEdgeFogPipeline != VK_NULL_HANDLE)
        {
            bindGraphicsPipelineCached(GraphicsFinalEdgeFogPipeline);
            bindGraphicsDescriptorSetCached();
            vkCmdPushConstants(commandBuffer, GraphicsPipelineLayout, VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(pushConstants), &pushConstants);
            vkCmdDraw(commandBuffer, 3u, 1u, 0u, 0u);
        }
        else if (runEdgePass && GraphicsFinalEdgePipeline != VK_NULL_HANDLE)
        {
            bindGraphicsPipelineCached(GraphicsFinalEdgePipeline);
            bindGraphicsDescriptorSetCached();
            vkCmdPushConstants(commandBuffer, GraphicsPipelineLayout, VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(pushConstants), &pushConstants);
            const float edgeBlendConstants[4] = {0.0f, 0.0f, 0.0f, 0.0f};
            vkCmdSetBlendConstants(commandBuffer, edgeBlendConstants);
            vkCmdDraw(commandBuffer, 3u, 1u, 0u, 0u);
        }

        if (!(runEdgePass && runFogPass && GraphicsFinalEdgeFogPipeline != VK_NULL_HANDLE)
            && runFogPass && GraphicsFinalFogPipeline != VK_NULL_HANDLE)
        {
            bindGraphicsPipelineCached(GraphicsFinalFogPipeline);
            bindGraphicsDescriptorSetCached();
            vkCmdPushConstants(commandBuffer, GraphicsPipelineLayout, VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(pushConstants), &pushConstants);

            const float fogBlendConstants[4] = {
                static_cast<float>((fogColor & 0x1Fu) << 1u) * (1.0f / 63.0f),
                static_cast<float>(((fogColor >> 5u) & 0x1Fu) << 1u) * (1.0f / 63.0f),
                static_cast<float>(((fogColor >> 10u) & 0x1Fu) << 1u) * (1.0f / 63.0f),
                static_cast<float>((fogColor >> 16u) & 0x1Fu) * (1.0f / 31.0f),
            };
            vkCmdSetBlendConstants(commandBuffer, fogBlendConstants);
            vkCmdDraw(commandBuffer, 3u, 1u, 0u, 0u);
        }

        vkCmdEndRenderPass(commandBuffer);

        pushConstants.variantKey = savedFinalVariantKey;
        pushConstants.triangleBase = savedFinalTriangleBase;
    }
    else
    {
        VkImageMemoryBarrier colorToGeneralBarrier{};
        colorToGeneralBarrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
        colorToGeneralBarrier.srcAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
        colorToGeneralBarrier.dstAccessMask =
            VK_ACCESS_SHADER_READ_BIT |
            VK_ACCESS_TRANSFER_READ_BIT |
            VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
        colorToGeneralBarrier.oldLayout = VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
        colorToGeneralBarrier.newLayout = VK_IMAGE_LAYOUT_GENERAL;
        colorToGeneralBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        colorToGeneralBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        colorToGeneralBarrier.image = ColorImage;
        colorToGeneralBarrier.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
        colorToGeneralBarrier.subresourceRange.baseMipLevel = 0;
        colorToGeneralBarrier.subresourceRange.levelCount = 1;
        colorToGeneralBarrier.subresourceRange.baseArrayLayer = 0;
        colorToGeneralBarrier.subresourceRange.layerCount = 1;
        vkCmdPipelineBarrier(
            commandBuffer,
            VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT,
            VK_PIPELINE_STAGE_ALL_COMMANDS_BIT,
            0,
            0,
            nullptr,
            0,
            nullptr,
            1,
            &colorToGeneralBarrier);
    }
    FinalCpuWindow.Add(PerfNowNs() - finalCpuStartNs);

    if ((timestampQueryPool != VK_NULL_HANDLE) && timestampPending)
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT, timestampQueryPool, 7);

    if (captureReadbackPath)
    {
        if (captureReadbackPath)
        {
            VkDescriptorSet captureExportDescriptorSet = VK_NULL_HANDLE;
            const int faithfulDescriptorSlot = pingPongFiel
                ? static_cast<int>(IndiceCbFiel)
                : -1;
            if (CaptureLineExportPipeline == VK_NULL_HANDLE
                || !updateCaptureExportDescriptorSet(
                    context,
                    nullptr,
                    captureLineBuffer,
                    faithfulDescriptorSlot,
                    &captureExportDescriptorSet)
                || captureExportDescriptorSet == VK_NULL_HANDLE)
            {
                return false;
            }

            VkImageMemoryBarrier colorToCaptureReadBarrier{};
            colorToCaptureReadBarrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
            colorToCaptureReadBarrier.srcAccessMask = VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
            colorToCaptureReadBarrier.dstAccessMask = VK_ACCESS_SHADER_READ_BIT;
            colorToCaptureReadBarrier.oldLayout = VK_IMAGE_LAYOUT_GENERAL;
            colorToCaptureReadBarrier.newLayout = VK_IMAGE_LAYOUT_GENERAL;
            colorToCaptureReadBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
            colorToCaptureReadBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
            colorToCaptureReadBarrier.image = ColorImage;
            colorToCaptureReadBarrier.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
            colorToCaptureReadBarrier.subresourceRange.baseMipLevel = 0;
            colorToCaptureReadBarrier.subresourceRange.levelCount = 1;
            colorToCaptureReadBarrier.subresourceRange.baseArrayLayer = 0;
            colorToCaptureReadBarrier.subresourceRange.layerCount = 1;
            vkCmdPipelineBarrier(
                commandBuffer,
                VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT,
                VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT,
                0,
                0,
                nullptr,
                0,
                nullptr,
                1,
                &colorToCaptureReadBarrier
            );

            vkCmdBindPipeline(commandBuffer, VK_PIPELINE_BIND_POINT_COMPUTE, CaptureLineExportPipeline);
            vkCmdBindDescriptorSets(
                commandBuffer,
                VK_PIPELINE_BIND_POINT_COMPUTE,
                CaptureExportPipelineLayout,
                0,
                1,
                &captureExportDescriptorSet,
                0,
                nullptr
            );
            vkCmdPushConstants(commandBuffer, CaptureExportPipelineLayout, VK_SHADER_STAGE_COMPUTE_BIT, 0, sizeof(pushConstants), &pushConstants);
            vkCmdDispatch(
                commandBuffer,
                8u,
                24u,
                1u);

            VkBufferMemoryBarrier captureToHostBarrier{};
            captureToHostBarrier.sType = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
            captureToHostBarrier.srcAccessMask = VK_ACCESS_SHADER_WRITE_BIT;
            captureToHostBarrier.dstAccessMask = VK_ACCESS_HOST_READ_BIT;
            captureToHostBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
            captureToHostBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
            captureToHostBarrier.buffer = captureLineBuffer;
            captureToHostBarrier.offset = 0;
            captureToHostBarrier.size = VK_WHOLE_SIZE;
            vkCmdPipelineBarrier(
                commandBuffer,
                VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT,
                VK_PIPELINE_STAGE_HOST_BIT,
                0,
                0,
                nullptr,
                1,
                &captureToHostBarrier,
                0,
                nullptr
            );
            CaptureLineExportCount++;
            CaptureLineExportCpuWindow.Add(0);
        }




    }

    if ((timestampQueryPool != VK_NULL_HANDLE) && timestampPending)
        vkCmdWriteTimestamp(commandBuffer, VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, timestampQueryPool, 8);

    if (vkEndCommandBuffer(commandBuffer) != VK_SUCCESS)
        return false;

    VkSubmitInfo submitInfo{};
    submitInfo.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO;
    submitInfo.commandBufferCount = 1;
    submitInfo.pCommandBuffers = &commandBuffer;

    if (context != nullptr)
    {
        if (!isRenderContextReusable(*context))
            return false;

        const bool hadPublishedMetadata = context->SubmittedMetadataValid;
        const u64 recycledEpoch = context->SubmittedRenderProductEpoch;
        const u64 recycledSequence = context->SubmitSequence;
        const auto matchesRecycledProduct = [&](u64 epoch, u64 sequence) {
            return hadPublishedMetadata
                && recycledEpoch != 0u
                && recycledSequence != 0u
                && epoch == recycledEpoch
                && sequence == recycledSequence;
        };

        if (PublishedGraphicsRenderContext == context)
            PublishedGraphicsRenderContext = nullptr;
        if (LastSubmittedRenderContext == context)
            LastSubmittedRenderContext = nullptr;
        if (PinnedCaptureExportContext == context)
        {
            PinnedCaptureExportContext = nullptr;
            PinnedCaptureExportSequence = 0u;
        }
        if (CurrentFrameLiveRenderIdentity.Valid
            && matchesRecycledProduct(
                CurrentFrameLiveRenderIdentity.Epoch,
                CurrentFrameLiveRenderIdentity.Sequence))
        {
            CurrentFrameLiveRenderIdentity = {};
        }
        if (CurrentFrameServedIdentity.Valid
            && matchesRecycledProduct(
                CurrentFrameServedIdentity.RenderProductEpoch,
                CurrentFrameServedIdentity.Sequence))
        {
            CurrentFrameServedIdentity = {};
        }

        context->SubmittedMetadataValid = false;
        context->SubmittedRenderProductEpoch = 0u;
        context->SubmitSequence = 0u;
        context->SubmittedPolygonCount = 0u;
        context->SubmittedCaptureCnt = 0u;
        context->SubmittedScreenSwap = false;
    }
    else
    {
        const LiveRenderProductIdentity recycledIdentity =
            PublishedGlobalLiveRenderIdentity;
        if (CurrentFrameLiveRenderIdentity.Valid
            && recycledIdentity.Valid
            && CurrentFrameLiveRenderIdentity.Epoch == recycledIdentity.Epoch
            && CurrentFrameLiveRenderIdentity.Sequence == recycledIdentity.Sequence)
        {
            CurrentFrameLiveRenderIdentity = {};
        }
        if (CurrentFrameServedIdentity.Valid
            && recycledIdentity.Valid
            && CurrentFrameServedIdentity.RenderProductEpoch == recycledIdentity.Epoch
            && CurrentFrameServedIdentity.Sequence == recycledIdentity.Sequence)
        {
            CurrentFrameServedIdentity = {};
        }

        PublishedGlobalRenderIdentity = {};
        PublishedGlobalLiveRenderIdentity = {};
        PublishedGlobalRenderFence = VK_NULL_HANDLE;
        ColorImageInitialized = false;
    }

    if (vkResetFences(Device, 1, &frameFence) != VK_SUCCESS)
        return false;

    if (FrameSubmissionDeferred && context != nullptr && !nativeProjectionOnly
        && !captureReadbackPath && graphicsTarget != nullptr)
    {
        DeferredRenderContext = context;
    }
    else
    {
        const VkResult submitResult = submitQueue(submitInfo, frameFence);
        if (submitResult != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: graphics vkQueueSubmit failed (%d)", static_cast<int>(submitResult));
            return false;
        }
    }

    if (context != nullptr && Threaded && !nativeProjectionOnly)
        LastSubmittedRenderContext = context;

    if (timestampQueryPool != VK_NULL_HANDLE)
    {
        if (context != nullptr)
            context->TimestampPending = true;
        else
            TimestampPending = true;
    }

    if (captureReadbackPath)
    {
        PendingCaptureLineContext = context;
        CaptureLinePending = true;
        CaptureLineDataIsRgba8 = false;
        PendingCaptureLineBufferSlot = context == nullptr
            ? static_cast<int>(ActiveCaptureLineBufferSlot)
            : -1;
        PendingCaptureLineFence = frameFence;
        PendingCaptureLineRequiresPrimaryFence = false;
        PendingCaptureLineScreenSwap = CurrentRenderScreenSwap;
        PendingCaptureLineIdentity = {};
        CaptureLineReady = false;
        ReadyCaptureLineBufferSlot = -1;
        ReadyCaptureLineData = nullptr;
        ReadyCaptureLineScreenSwap = false;
        ReadyCaptureLineIdentity = {};
        ActiveCapturePathMode = CapturePathMode::CaptureLineExport;
        CapturePathModeCounts[static_cast<size_t>(CapturePathMode::CaptureLineExport)]++;
        NativeProjectionCapturePending = nativeProjectionOnly;
    }
    else if (!NativeProjectionCapturePending)
    {
        resetCaptureLineState();
    }

    ColorImageInitialized = true;
    if (nativeProjectionOnly)
    {
        context->SubmittedMetadataValid = false;
        context->SubmittedRenderProductEpoch = 0u;
        context->SubmitSequence = 0u;
        context->SubmittedPolygonCount = 0u;
        context->SubmittedCaptureCnt = 0u;
        context->SubmittedScreenSwap = false;
    }
    else if (graphicsTarget != nullptr)
    {
        context->SubmittedPolygonCount = PendingSubmitPolygonCount;
        context->SubmittedCaptureCnt = PendingSubmitCaptureCnt;
        context->SubmittedRenderProductEpoch = LiveRenderProductEpoch;
        context->SubmitSequence = ++GraphicsSubmitSequence;
        context->SubmittedScreenSwap = CurrentRenderScreenSwap;
        context->SubmittedMetadataValid = true;
        PublishedGraphicsRenderContext = context;
        PublishedGlobalRenderIdentity = {};
        PublishedGlobalLiveRenderIdentity = {};
        PublishedGlobalRenderFence = VK_NULL_HANDLE;
    }
    else
    {
        PublishedGraphicsRenderContext = nullptr;
        PublishedGlobalRenderIdentity.Valid = true;
        PublishedGlobalRenderIdentity.RenderProductEpoch = LiveRenderProductEpoch;
        PublishedGlobalRenderIdentity.Sequence = ++GraphicsSubmitSequence;
        PublishedGlobalRenderIdentity.PolygonCount = PendingSubmitPolygonCount;
        PublishedGlobalRenderIdentity.CaptureCnt = PendingSubmitCaptureCnt;
        PublishedGlobalRenderIdentity.ScreenSwap = CurrentRenderScreenSwap;
        PublishedGlobalLiveRenderIdentity.Valid = true;
        PublishedGlobalLiveRenderIdentity.Epoch = LiveRenderProductEpoch;
        PublishedGlobalLiveRenderIdentity.Sequence =
            PublishedGlobalRenderIdentity.Sequence;
        PublishedGlobalRenderFence = frameFence;
    }
    if (captureReadbackPath)
        PendingCaptureLineIdentity = nativeProjectionOnly
            ? CaptureSourceIdentity{}
            : (context != nullptr
                ? captureSourceIdentityForContext(context)
                : PublishedGlobalRenderIdentity);
    HasCpuFrame = false;
    return true;
}

bool VulkanRenderer3D::submitGraphicsCaptureExportForCurrentFrame()
{
    const auto identityMatchesCurrentFrame = [&](const CaptureSourceIdentity& identity) {
        return captureIdentityMatchesCurrentFrameKey(identity);
    };
    const bool useGlobalPublishedSource =
        PublishedGraphicsRenderContext == nullptr
        && PublishedGlobalRenderIdentity.Valid
        && identityMatchesCurrentFrame(PublishedGlobalRenderIdentity)
        && ColorImageInitialized
        && ColorImage != VK_NULL_HANDLE
        && ColorImageView != VK_NULL_HANDLE
        && ColorImageWidth != 0u
        && ColorImageHeight != 0u
        && PublishedGlobalRenderFence != VK_NULL_HANDLE;
    RenderContext* sourceContext = nullptr;
    if (!useGlobalPublishedSource)
    {
        sourceContext =
            PublishedGraphicsRenderContext != nullptr
            && PublishedGraphicsRenderContext->SubmittedMetadataValid
            && PublishedGraphicsRenderContext->SubmittedRenderProductEpoch
                == LiveRenderProductEpoch
            && identityMatchesCurrentFrame(
                captureSourceIdentityForContext(PublishedGraphicsRenderContext))
            ? PublishedGraphicsRenderContext
            : nullptr;
    }
    if (!useGlobalPublishedSource
        && PinnedCaptureExportContext != nullptr
        && PinnedCaptureExportContext->SubmittedMetadataValid
        && PinnedCaptureExportContext->SubmittedRenderProductEpoch
            == LiveRenderProductEpoch
        && PinnedCaptureExportContext->SubmitSequence == PinnedCaptureExportSequence
        && identityMatchesCurrentFrame(
            captureSourceIdentityForContext(PinnedCaptureExportContext))
        && PinnedCaptureExportContext->RasterProductSlot.ColorImage != VK_NULL_HANDLE
        && PinnedCaptureExportContext->RasterProductSlot.Initialized)
    {
        sourceContext = PinnedCaptureExportContext;
    }
    if (!useGlobalPublishedSource
        && sourceContext == nullptr)
    {
        traceFaithfulCaptureDecision("submit", "no-current-key-source");
        return false;
    }
    const FaithfulRasterProductSlot* sourceTarget = sourceContext != nullptr
        ? &sourceContext->RasterProductSlot
        : getPublishedFaithfulRasterProductSlot();
    const CaptureSourceIdentity sourceIdentity = sourceContext != nullptr
        ? captureSourceIdentityForContext(sourceContext)
        : PublishedGlobalRenderIdentity;
    traceFaithfulCaptureDecision(
        "submit",
        useGlobalPublishedSource ? "select-current-global" : "select-current-context",
        sourceIdentity);
    if (std::getenv("MELON_SONDA_CAPID") != nullptr)
    {
        CaptureSourceIdentity publishedIdentity{};
        (void)GetPublishedRenderIdentity(publishedIdentity);
        std::fprintf(stderr,
            "[capid-export] srcctx=%d pinned=%d pubctx=%d "
            "src=%d:%llu/%u/%08X/%d pub=%d:%llu/%u/%08X/%d\n",
            sourceContext != nullptr ? 1 : 0,
            PinnedCaptureExportContext != nullptr ? 1 : 0,
            PublishedGraphicsRenderContext != nullptr ? 1 : 0,
            sourceIdentity.Valid ? 1 : 0,
            static_cast<unsigned long long>(sourceIdentity.Sequence),
            sourceIdentity.PolygonCount,
            sourceIdentity.CaptureCnt,
            sourceIdentity.ScreenSwap ? 1 : 0,
            publishedIdentity.Valid ? 1 : 0,
            static_cast<unsigned long long>(publishedIdentity.Sequence),
            publishedIdentity.PolygonCount,
            publishedIdentity.CaptureCnt,
            publishedIdentity.ScreenSwap ? 1 : 0);
    }
    const VkImage sourceColorImage = sourceTarget != nullptr ? sourceTarget->ColorImage : ColorImage;
    const u32 sourceColorWidth = sourceTarget != nullptr ? sourceTarget->Width : ColorImageWidth;
    const u32 sourceColorHeight = sourceTarget != nullptr ? sourceTarget->Height : ColorImageHeight;
    const bool sourceColorInitialized = sourceTarget != nullptr ? sourceTarget->Initialized : ColorImageInitialized;
    if (!ensureInitialized()
        || Device == VK_NULL_HANDLE
        || Queue == VK_NULL_HANDLE
        || CommandBuffer == VK_NULL_HANDLE
        || FrameFence == VK_NULL_HANDLE
        || sourceColorImage == VK_NULL_HANDLE
        || sourceColorWidth == 0
        || sourceColorHeight == 0
        || !sourceColorInitialized)
    {
        return false;
    }

    if (!ensureCaptureLineBuffer(nullptr))
    {
        return false;
    }

    if (CaptureLineMapped == nullptr)
    {
        return false;
    }

    const VkFence sourceProducerFence = sourceContext != nullptr
        ? sourceContext->FrameFence
        : PublishedGlobalRenderFence;
    if (sourceProducerFence != VK_NULL_HANDLE)
    {
        VkResult sourceFenceStatus = vkGetFenceStatus(Device, sourceProducerFence);
        if (sourceFenceStatus == VK_NOT_READY)
        {
            sourceFenceStatus = vkWaitForFences(
                Device,
                1,
                &sourceProducerFence,
                VK_TRUE,
                kFenceWaitTimeoutNs);
        }
        if (sourceFenceStatus != VK_SUCCESS)
        {
            traceFaithfulCaptureDecision(
                "submit", "source-fence-not-ready", sourceIdentity);
            return false;
        }
        if (sourceContext != nullptr)
            consumeGpuTiming(sourceContext);
    }

    VkResult fenceStatus = vkGetFenceStatus(Device, FrameFence);
    if (fenceStatus == VK_NOT_READY)
    {
        fenceStatus = vkWaitForFences(
            Device,
            1,
            &FrameFence,
            VK_TRUE,
            kFenceWaitTimeoutNs);
    }
    if (fenceStatus != VK_SUCCESS)
    {
        traceFaithfulCaptureDecision(
            "submit", "export-fence-not-ready", sourceIdentity);
        return false;
    }

    if (sourceContext == nullptr)
        consumeGpuTiming(nullptr);

    VkDescriptorSet captureExportDescriptorSet = VK_NULL_HANDLE;
    if (CaptureLineExportPipeline == VK_NULL_HANDLE
        || !updateCaptureExportDescriptorSet(
            nullptr,
            sourceTarget,
            CaptureLineBuffer,
            -1,
            &captureExportDescriptorSet))
    {
        traceFaithfulCaptureDecision(
            "submit", "capture-export-descriptor-unavailable", sourceIdentity);
        return false;
    }
    if (captureExportDescriptorSet == VK_NULL_HANDLE)
    {
        traceFaithfulCaptureDecision(
            "submit", "capture-export-descriptor-null", sourceIdentity);
        return false;
    }
    if (vkResetCommandBuffer(CommandBuffer, 0) != VK_SUCCESS)
        return false;

    VkCommandBufferBeginInfo beginInfo{};
    beginInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO;
    beginInfo.flags = VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    if (vkBeginCommandBuffer(CommandBuffer, &beginInfo) != VK_SUCCESS)
        return false;

    {

        VkImageMemoryBarrier colorToCaptureReadBarrier{};
        colorToCaptureReadBarrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
        colorToCaptureReadBarrier.srcAccessMask =
            VK_ACCESS_SHADER_READ_BIT |
            VK_ACCESS_SHADER_WRITE_BIT |
            VK_ACCESS_TRANSFER_READ_BIT |
            VK_ACCESS_TRANSFER_WRITE_BIT |
            VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
        colorToCaptureReadBarrier.dstAccessMask = VK_ACCESS_SHADER_READ_BIT;
        colorToCaptureReadBarrier.oldLayout = VK_IMAGE_LAYOUT_GENERAL;
        colorToCaptureReadBarrier.newLayout = VK_IMAGE_LAYOUT_GENERAL;
        colorToCaptureReadBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        colorToCaptureReadBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        colorToCaptureReadBarrier.image = sourceColorImage;
        colorToCaptureReadBarrier.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
        colorToCaptureReadBarrier.subresourceRange.levelCount = 1;
        colorToCaptureReadBarrier.subresourceRange.layerCount = 1;
        vkCmdPipelineBarrier(
            CommandBuffer,
            VK_PIPELINE_STAGE_ALL_COMMANDS_BIT,
            VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT,
            0,
            0,
            nullptr,
            0,
            nullptr,
            1,
            &colorToCaptureReadBarrier);

        RasterPushConstants capturePushConstants{};
        capturePushConstants.width = sourceColorWidth;
        capturePushConstants.height = sourceColorHeight;
        vkCmdBindPipeline(
            CommandBuffer,
            VK_PIPELINE_BIND_POINT_COMPUTE,
            CaptureLineExportPipeline);
        vkCmdBindDescriptorSets(
            CommandBuffer,
            VK_PIPELINE_BIND_POINT_COMPUTE,
            CaptureExportPipelineLayout,
            0,
            1,
            &captureExportDescriptorSet,
            0,
            nullptr);
        vkCmdPushConstants(
            CommandBuffer,
            CaptureExportPipelineLayout,
            VK_SHADER_STAGE_COMPUTE_BIT,
            0,
            sizeof(capturePushConstants),
            &capturePushConstants);
        vkCmdDispatch(CommandBuffer, 8u, 24u, 1u);

        VkBufferMemoryBarrier captureToHostBarrier{};
        captureToHostBarrier.sType = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
        captureToHostBarrier.srcAccessMask = VK_ACCESS_SHADER_WRITE_BIT;
        captureToHostBarrier.dstAccessMask = VK_ACCESS_HOST_READ_BIT;
        captureToHostBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        captureToHostBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
        captureToHostBarrier.buffer = CaptureLineBuffer;
        captureToHostBarrier.offset = 0;
        captureToHostBarrier.size = VK_WHOLE_SIZE;
        vkCmdPipelineBarrier(
            CommandBuffer,
            VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT,
            VK_PIPELINE_STAGE_HOST_BIT,
            0,
            0,
            nullptr,
            1,
            &captureToHostBarrier,
            0,
            nullptr);
    }

    if (vkEndCommandBuffer(CommandBuffer) != VK_SUCCESS)
        return false;

    VkSubmitInfo submitInfo{};
    submitInfo.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO;
    submitInfo.commandBufferCount = 1;
    submitInfo.pCommandBuffers = &CommandBuffer;

    if (vkResetFences(Device, 1, &FrameFence) != VK_SUCCESS)
    {
        traceFaithfulCaptureDecision("submit", "export-fence-reset-failed", sourceIdentity);
        return false;
    }
    {
        const VkResult submitResult = submitQueue(submitInfo, FrameFence);
        if (submitResult != VK_SUCCESS)
        {
            traceFaithfulCaptureDecision(
                "submit", "queue-submit-failed", sourceIdentity);

            const bool publishedGlobalUsesPrimaryFence =
                PublishedGraphicsRenderContext == nullptr
                && PublishedGlobalRenderFence == FrameFence;
            if (publishedGlobalUsesPrimaryFence)
            {

                PublishedGlobalRenderFence = VK_NULL_HANDLE;
                PublishedGlobalRenderIdentity = {};
                PublishedGlobalLiveRenderIdentity = {};
                CurrentFrameServedIdentity = {};
                CurrentFrameLiveRenderIdentity = {};
            }
            vkDestroyFence(Device, FrameFence, nullptr);
            FrameFence = VK_NULL_HANDLE;
            if (!createFence(FrameFence))
            {
                Log(
                    LogLevel::Error,
                    "VulkanRenderer3D: failed to restore capture export fence");
            }
            return false;
        }
    }

    CaptureLineExportCount++;
    CaptureLineExportCpuWindow.Add(0);
    PendingCaptureLineContext = nullptr;
    CaptureLinePending = true;
    CaptureLineDataIsRgba8 = false;
    PendingCaptureLineBufferSlot = static_cast<int>(ActiveCaptureLineBufferSlot);
    PendingCaptureLineFence = FrameFence;

    PendingCaptureLineRequiresPrimaryFence = true;
    PendingCaptureLineScreenSwap = CurrentRenderScreenSwap;
    PendingCaptureLineIdentity = sourceIdentity;
    CaptureLineReady = false;
    ReadyCaptureLineBufferSlot = -1;
    ReadyCaptureLineData = nullptr;
    ReadyCaptureLineScreenSwap = false;
    ReadyCaptureLineIdentity = {};
    ActiveCapturePathMode = CapturePathMode::CaptureLineExport;
    CapturePathModeCounts[static_cast<size_t>(CapturePathMode::CaptureLineExport)]++;
    traceFaithfulCaptureDecision("submit", "queued-current-key", sourceIdentity);
    return true;
}

bool VulkanRenderer3D::readbackGraphicsAttrImageToCpu(std::vector<u32>& outAttrPixels)
{
    if (!ensureInitialized() || AttrImage == VK_NULL_HANDLE || ColorImageWidth == 0 || ColorImageHeight == 0)
        return false;
    if (!waitForReadbackSource())
        return false;

    const VkDeviceSize requiredReadbackSize = static_cast<VkDeviceSize>(ColorImageWidth) * static_cast<VkDeviceSize>(ColorImageHeight) * sizeof(u32);
    if (ReadbackBuffer == VK_NULL_HANDLE || ReadbackMemory == VK_NULL_HANDLE || ReadbackSize != requiredReadbackSize)
    {
        destroyReadbackBuffer();
        if (!createReadbackBuffer(ColorImageWidth, ColorImageHeight))
            return false;
    }

    if (vkWaitForFences(Device, 1, &FrameFence, VK_TRUE, kFenceWaitTimeoutNs) != VK_SUCCESS)
        return false;
    if (vkResetFences(Device, 1, &FrameFence) != VK_SUCCESS)
        return false;
    if (vkResetCommandBuffer(CommandBuffer, 0) != VK_SUCCESS)
        return false;

    VkCommandBufferBeginInfo beginInfo{};
    beginInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO;
    beginInfo.flags = VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    if (vkBeginCommandBuffer(CommandBuffer, &beginInfo) != VK_SUCCESS)
        return false;

    VkImageMemoryBarrier toTransferBarrier{};
    toTransferBarrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    toTransferBarrier.srcAccessMask = VK_ACCESS_SHADER_READ_BIT | VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT;
    toTransferBarrier.dstAccessMask = VK_ACCESS_TRANSFER_READ_BIT;
    toTransferBarrier.oldLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
    toTransferBarrier.newLayout = VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL;
    toTransferBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toTransferBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toTransferBarrier.image = AttrImage;
    toTransferBarrier.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    toTransferBarrier.subresourceRange.levelCount = 1;
    toTransferBarrier.subresourceRange.layerCount = 1;
    vkCmdPipelineBarrier(CommandBuffer, VK_PIPELINE_STAGE_ALL_COMMANDS_BIT, VK_PIPELINE_STAGE_TRANSFER_BIT, 0, 0, nullptr, 0, nullptr, 1, &toTransferBarrier);

    VkBufferImageCopy copyRegion{};
    copyRegion.imageSubresource.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    copyRegion.imageSubresource.layerCount = 1;
    copyRegion.imageExtent.width = ColorImageWidth;
    copyRegion.imageExtent.height = ColorImageHeight;
    copyRegion.imageExtent.depth = 1;
    vkCmdCopyImageToBuffer(CommandBuffer, AttrImage, VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL, ReadbackBuffer, 1, &copyRegion);

    VkBufferMemoryBarrier toHostBarrier{};
    toHostBarrier.sType = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
    toHostBarrier.srcAccessMask = VK_ACCESS_TRANSFER_WRITE_BIT;
    toHostBarrier.dstAccessMask = VK_ACCESS_HOST_READ_BIT;
    toHostBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toHostBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toHostBarrier.buffer = ReadbackBuffer;
    toHostBarrier.size = ReadbackSize;
    vkCmdPipelineBarrier(CommandBuffer, VK_PIPELINE_STAGE_TRANSFER_BIT, VK_PIPELINE_STAGE_HOST_BIT, 0, 0, nullptr, 1, &toHostBarrier, 0, nullptr);

    VkImageMemoryBarrier backToShaderBarrier = toTransferBarrier;
    backToShaderBarrier.srcAccessMask = VK_ACCESS_TRANSFER_READ_BIT;
    backToShaderBarrier.dstAccessMask = VK_ACCESS_SHADER_READ_BIT;
    backToShaderBarrier.oldLayout = VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL;
    backToShaderBarrier.newLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
    vkCmdPipelineBarrier(CommandBuffer, VK_PIPELINE_STAGE_TRANSFER_BIT, VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT, 0, 0, nullptr, 0, nullptr, 1, &backToShaderBarrier);

    if (vkEndCommandBuffer(CommandBuffer) != VK_SUCCESS)
        return false;

    VkSubmitInfo submitInfo{};
    submitInfo.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO;
    submitInfo.commandBufferCount = 1;
    submitInfo.pCommandBuffers = &CommandBuffer;
    {
        if (submitQueue(submitInfo, FrameFence) != VK_SUCCESS)
            return false;
    }
    if (vkWaitForFences(Device, 1, &FrameFence, VK_TRUE, kFenceWaitTimeoutNs) != VK_SUCCESS)
        return false;
    if (ReadbackMapped == nullptr)
        return false;

    const size_t pixelCount = static_cast<size_t>(ColorImageWidth) * static_cast<size_t>(ColorImageHeight);
    std::vector<u32> rawPixels(pixelCount);
    std::memcpy(rawPixels.data(), ReadbackMapped, pixelCount * sizeof(u32));
    outAttrPixels.resize(pixelCount);
    for (size_t i = 0; i < pixelCount; i++)
        outAttrPixels[i] = PackGraphicsAttrToLogical(rawPixels[i]);
    return true;
}

bool VulkanRenderer3D::readbackGraphicsDepthImageToCpu(std::vector<u32>& outDepthPixels)
{

    outDepthPixels.clear();
    return false;
}

bool VulkanRenderer3D::readbackColorTargetToCpu()
{
    ReadbackColorRequestCount++;

    if (!ensureInitialized() || ColorImage == VK_NULL_HANDLE || ColorImageWidth == 0 || ColorImageHeight == 0)
        return false;

    const u32 readbackWidth = ColorImageWidth;
    const u32 readbackHeight = ColorImageHeight;
    const VkDeviceSize requiredReadbackSize = static_cast<VkDeviceSize>(readbackWidth) * static_cast<VkDeviceSize>(readbackHeight) * sizeof(u32);

    if (ReadbackBuffer == VK_NULL_HANDLE || ReadbackMemory == VK_NULL_HANDLE || ReadbackSize != requiredReadbackSize)
    {
        destroyReadbackBuffer();
        if (!createReadbackBuffer(readbackWidth, readbackHeight))
            return false;
    }

    if (vkWaitForFences(Device, 1, &FrameFence, VK_TRUE, kFenceWaitTimeoutNs) != VK_SUCCESS)
        return false;

    if (vkResetFences(Device, 1, &FrameFence) != VK_SUCCESS)
        return false;

    if (vkResetCommandBuffer(CommandBuffer, 0) != VK_SUCCESS)
        return false;

    VkCommandBufferBeginInfo beginInfo{};
    beginInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO;
    beginInfo.flags = VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    if (vkBeginCommandBuffer(CommandBuffer, &beginInfo) != VK_SUCCESS)
        return false;

    VkImageMemoryBarrier colorToTransferSrcBarrier{};
    colorToTransferSrcBarrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    colorToTransferSrcBarrier.srcAccessMask =
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT |
        VK_ACCESS_SHADER_READ_BIT |
        VK_ACCESS_SHADER_WRITE_BIT |
        VK_ACCESS_TRANSFER_WRITE_BIT |
        VK_ACCESS_TRANSFER_READ_BIT;
    colorToTransferSrcBarrier.dstAccessMask = VK_ACCESS_TRANSFER_READ_BIT;
    colorToTransferSrcBarrier.oldLayout = VK_IMAGE_LAYOUT_GENERAL;
    colorToTransferSrcBarrier.newLayout = VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL;
    colorToTransferSrcBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    colorToTransferSrcBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    colorToTransferSrcBarrier.image = ColorImage;
    colorToTransferSrcBarrier.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    colorToTransferSrcBarrier.subresourceRange.baseMipLevel = 0;
    colorToTransferSrcBarrier.subresourceRange.levelCount = 1;
    colorToTransferSrcBarrier.subresourceRange.baseArrayLayer = 0;
    colorToTransferSrcBarrier.subresourceRange.layerCount = 1;
    vkCmdPipelineBarrier(
        CommandBuffer,
        VK_PIPELINE_STAGE_ALL_COMMANDS_BIT,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        0,
        0,
        nullptr,
        0,
        nullptr,
        1,
        &colorToTransferSrcBarrier
    );

    {
        VkBufferImageCopy copyRegion{};
        copyRegion.bufferOffset = 0;
        copyRegion.bufferRowLength = 0;
        copyRegion.bufferImageHeight = 0;
        copyRegion.imageSubresource.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
        copyRegion.imageSubresource.mipLevel = 0;
        copyRegion.imageSubresource.baseArrayLayer = 0;
        copyRegion.imageSubresource.layerCount = 1;
        copyRegion.imageOffset = {0, 0, 0};
        copyRegion.imageExtent.width = ColorImageWidth;
        copyRegion.imageExtent.height = ColorImageHeight;
        copyRegion.imageExtent.depth = 1;
        vkCmdCopyImageToBuffer(
            CommandBuffer,
            ColorImage,
            VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL,
            ReadbackBuffer,
            1,
            &copyRegion
        );
    }

    VkBufferMemoryBarrier toHostBarrier{};
    toHostBarrier.sType = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER;
    toHostBarrier.srcAccessMask = VK_ACCESS_TRANSFER_WRITE_BIT;
    toHostBarrier.dstAccessMask = VK_ACCESS_HOST_READ_BIT;
    toHostBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toHostBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    toHostBarrier.buffer = ReadbackBuffer;
    toHostBarrier.offset = 0;
    toHostBarrier.size = ReadbackSize;
    vkCmdPipelineBarrier(
        CommandBuffer,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        VK_PIPELINE_STAGE_HOST_BIT,
        0,
        0,
        nullptr,
        1,
        &toHostBarrier,
        0,
        nullptr
    );

    VkImageMemoryBarrier colorBackToGeneralBarrier{};
    colorBackToGeneralBarrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    colorBackToGeneralBarrier.srcAccessMask = VK_ACCESS_TRANSFER_READ_BIT;
    colorBackToGeneralBarrier.dstAccessMask =
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT |
        VK_ACCESS_SHADER_READ_BIT |
        VK_ACCESS_SHADER_WRITE_BIT |
        VK_ACCESS_TRANSFER_READ_BIT;
    colorBackToGeneralBarrier.oldLayout = VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL;
    colorBackToGeneralBarrier.newLayout = VK_IMAGE_LAYOUT_GENERAL;
    colorBackToGeneralBarrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    colorBackToGeneralBarrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    colorBackToGeneralBarrier.image = ColorImage;
    colorBackToGeneralBarrier.subresourceRange.aspectMask = VK_IMAGE_ASPECT_COLOR_BIT;
    colorBackToGeneralBarrier.subresourceRange.baseMipLevel = 0;
    colorBackToGeneralBarrier.subresourceRange.levelCount = 1;
    colorBackToGeneralBarrier.subresourceRange.baseArrayLayer = 0;
    colorBackToGeneralBarrier.subresourceRange.layerCount = 1;
    vkCmdPipelineBarrier(
        CommandBuffer,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT | VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT,
        0,
        0,
        nullptr,
        0,
        nullptr,
        1,
        &colorBackToGeneralBarrier
    );

    if (vkEndCommandBuffer(CommandBuffer) != VK_SUCCESS)
        return false;

    VkSubmitInfo submitInfo{};
    submitInfo.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO;
    submitInfo.commandBufferCount = 1;
    submitInfo.pCommandBuffers = &CommandBuffer;
    {
        const VkResult submitResult = submitQueue(submitInfo, FrameFence);
        if (submitResult != VK_SUCCESS)
        {
            Log(LogLevel::Error, "VulkanRenderer3D: readback vkQueueSubmit failed (%d)", static_cast<int>(submitResult));
            return false;
        }
    }

    if (vkWaitForFences(Device, 1, &FrameFence, VK_TRUE, kFenceWaitTimeoutNs) != VK_SUCCESS)
        return false;

    if (ReadbackMapped == nullptr)
        return false;

    const size_t pixelCount = static_cast<size_t>(readbackWidth) * static_cast<size_t>(readbackHeight);
    if (RawReadbackRgba.size() != pixelCount)
        RawReadbackRgba.resize(pixelCount);
    std::memcpy(RawReadbackRgba.data(), ReadbackMapped, pixelCount * sizeof(u32));

    HasCpuFrame = true;
    ColorImageInitialized = true;

    return true;
}


AcceleratedSceneBuildConfig VulkanRenderer3D::sceneBuildConfigForScale(int scale) const
{
    const u32 scaleFactor = static_cast<u32>(std::max(1, scale));
    AcceleratedSceneBuildConfig config{};
    config.Scale = static_cast<int>(scaleFactor);
    config.BetterPolygons = BetterPolygons;
    config.UseHiresCoordinates = true;
    config.MaxFixedX = static_cast<s32>((256u * scaleFactor * 16u) - 1u);
    config.MaxFixedY = static_cast<s32>((192u * scaleFactor * 16u) - 1u);
    config.CoverageFix.Enabled = CoverageFixEnabled;
    config.CoverageFix.UserPx = CoverageFixPx;
    config.CoverageFix.ApplyRepeat = CoverageFixApplyRepeat;
    config.CoverageFix.ApplyClamp = CoverageFixApplyClamp;
    config.CoverageFix.PassiveRepeatPx = PassiveCoverageFixRepeatPx;
    config.CoverageFix.DisablePassiveRepeat =
        (MelonDSAndroid::getVulkanDiagnosticFlags() & kVulkanDiagnosticDisablePassiveRepeatCoverageExpand) != 0u;
    config.CoverageFix.PaletteUiClampEnabled = false;
    config.CoverageFix.PaletteUiClampPx = 0.5f;
    return config;
}

void VulkanRenderer3D::buildGraphicsTriangleList(GPU& gpu, bool usePreparedGeometry)
{
    const VulkanTextureDescriptorPolicy texturePolicy = getTextureDescriptorPolicy();
    const u32 maxActiveTextureDescriptors = texturePolicy.MaxActiveTextureDescriptors();
    const u32 fallbackTextureDescriptorIndex =
        texturePolicy.FallbackTextureDescriptorIndex();

    struct TextureFrameData
    {
        TexcacheVulkanLoader::TextureHandle Handle = 0;
        u32 Layer = 0;
        u32 DescriptorIndex = 0;
        bool FallbackUsed = false;
        bool LayerOpaque = false;
        u32 Width = 0;
        u32 Height = 0;
    };

    struct TextureLookupKey
    {
        u64 Key = 0;

        bool operator==(const TextureLookupKey& other) const noexcept
        {
            return Key == other.Key;
        }
    };

    struct TextureLookupHasher
    {
        size_t operator()(const TextureLookupKey& key) const noexcept
        {
            return std::hash<u64>{}(key.Key);
        }
    };

    const u32 scaleFactor = static_cast<u32>(std::max(1, EscalaEfectiva));
    const u32 targetHeight = 192u * scaleFactor;
    const float scale = static_cast<float>(scaleFactor);
    const float maxTargetX = 256.0f * scale;
    const float maxTargetY = 192.0f * scale;
    const bool textureMapsEnabled = (gpu.GPU3D.RenderDispCnt & (1u << 0u)) != 0u;
    const bool highlightEnabled = (gpu.GPU3D.RenderDispCnt & (1u << 1u)) != 0u;
    const float coverageDepthBias = CoverageFixDepthBias * 16777215.0f;

    const AcceleratedSceneBuildConfig sceneBuildConfig = sceneBuildConfigForScale(EscalaEfectiva);

    const bool perPolygonTiming = MelonDSAndroid::areRendererDebugToolsEnabled();
    if (!usePreparedGeometry || Preparation == nullptr
        || !Preparation->TakeScene(gpu.GPU3D, sceneBuildConfig, SharedGraphicsScene))
    {
        const u64 sceneBuildCpuStartNs = PerfNowNs();
        BuildAcceleratedScene(gpu.GPU3D, sceneBuildConfig, SharedGraphicsScene);
        GraphicsSceneBuildCpuWindow.Add(PerfNowNs() - sceneBuildCpuStartNs);
    }

    const size_t estimatedTriangleCount =
        SharedGraphicsScene.Triangles.size() + (SharedGraphicsScene.Draws.size() * 2u);
    Triangles.reserve(std::max(Triangles.capacity(), estimatedTriangleCount));
    GraphicsVertices.reserve(std::max(GraphicsVertices.capacity(), estimatedTriangleCount * 3u));
    GraphicsSceneVertices.resize(SharedGraphicsScene.Vertices.size());
    GraphicsPolygons.reserve(std::max(GraphicsPolygons.capacity(), SharedGraphicsScene.Draws.size()));
    GraphicsOpaqueDrawIndices.reserve(std::max(GraphicsOpaqueDrawIndices.capacity(), SharedGraphicsScene.Draws.size()));
    GraphicsNeedOpaqueDrawIndices.reserve(std::max(GraphicsNeedOpaqueDrawIndices.capacity(), SharedGraphicsScene.Draws.size()));
    GraphicsAlphaDrawIndices.reserve(std::max(GraphicsAlphaDrawIndices.capacity(), SharedGraphicsScene.Draws.size()));
    GraphicsShadowMaskDrawIndices.reserve(std::max(GraphicsShadowMaskDrawIndices.capacity(), SharedGraphicsScene.Draws.size()));
    GraphicsShadowDrawIndices.reserve(std::max(GraphicsShadowDrawIndices.capacity(), SharedGraphicsScene.Draws.size()));
    GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride = 0xFFFFFFFFu;
    GraphicsHiddenAlphaZeroFinalEdgeColorOverride = 0u;

    std::unordered_map<TextureLookupKey, TextureFrameData, TextureLookupHasher> textureLookup{};
    textureLookup.reserve(SharedGraphicsScene.Draws.size());
    u32 textureLookupHitCount = 0;
    u32 textureLookupMissCount = 0;
    u32 persistentTextureHitCount = 0;
    u32 persistentTextureMissCount = 0;
    u32 constantTextureCollapseCount = 0;
    u64 graphicsTextureLookupCpuNs = 0;
    u64 graphicsTexturePersistentCpuNs = 0;
    u64 graphicsTexcacheResolveCpuNs = 0;
    u64 graphicsTextureDescriptorCpuNs = 0;
    u64 graphicsTextureSlotCpuNs = 0;
    u64 graphicsConstantTextureCpuNs = 0;
    u64 graphicsVertexEmitCpuNs = 0;

    const auto makeTextureLookupKey = [](u32 texParam, u32 texPalette) -> TextureLookupKey {
        u32 normalizedTexParam = texParam & ~0xC0000000u;
        const u32 textureFormat = (normalizedTexParam >> 26u) & 0x7u;
        u64 key = normalizedTexParam;
        if (textureFormat != 7u)
        {
            key |= static_cast<u64>(texPalette) << 32u;
            if (textureFormat == 5u)
                key &= ~(static_cast<u64>(1u) << 29u);
        }
        return TextureLookupKey{key};
    };
    const auto textureSamplerForTexParam = [&](u32 texParam) -> VkSampler {
        const bool repeatS = (texParam & (1u << 16u)) != 0u;
        const bool repeatT = (texParam & (1u << 17u)) != 0u;
        const bool mirrorS = (texParam & (1u << 18u)) != 0u;
        const bool mirrorT = (texParam & (1u << 19u)) != 0u;
        const u32 sMode = repeatS ? (mirrorS ? 2u : 1u) : 0u;
        const u32 tMode = repeatT ? (mirrorT ? 2u : 1u) : 0u;
        const u32 samplerIndex = sMode + (tMode * 3u);
        if (samplerIndex < TextureWrapSamplers.size()
            && TextureWrapSamplers[samplerIndex] != VK_NULL_HANDLE)
        {
            return TextureWrapSamplers[samplerIndex];
        }
        return FallbackTextureSampler;
    };

    const auto to8From6 = [](u32 c6) -> u32 {
        c6 &= 0x3Fu;
        return (c6 << 2u) | (c6 >> 4u);
    };

    const auto to8From5 = [](u32 c5) -> u32 {
        c5 &= 0x1Fu;
        return (c5 << 3u) | (c5 >> 2u);
    };

    const auto packRgba8 = [](u32 r, u32 g, u32 b, u32 a) -> u32 {
        return (r & 0xFFu) | ((g & 0xFFu) << 8u) | ((b & 0xFFu) << 16u) | ((a & 0xFFu) << 24u);
    };

    const auto wrapTextureCoord = [](int coord, int size, bool repeat, bool mirror) -> int {
        if (size <= 0)
            return 0;

        if (repeat)
        {
            if (mirror)
            {
                if ((coord & size) != 0)
                    return (size - 1) - (coord & (size - 1));
                return coord & (size - 1);
            }
            return coord & (size - 1);
        }

        return std::clamp(coord, 0, size - 1);
    };

    const auto modulate6 = [](u32 texel6, u32 color6) -> u32 {
        return std::min<u32>(63u, ((((texel6 & 0x3Fu) + 1u) * ((color6 & 0x3Fu) + 1u)) - 1u) >> 6u);
    };

    const auto modulate5 = [](u32 texel5, u32 color5) -> u32 {
        return std::min<u32>(31u, ((((texel5 & 0x1Fu) + 1u) * ((color5 & 0x1Fu) + 1u)) - 1u) >> 5u);
    };

    struct TriangleVertexData
    {
        float x = 0.0f;
        float y = 0.0f;
        float z = 0.0f;
        float w = 1.0f;
        float u = 0.0f;
        float v = 0.0f;
        u32 colorRgba8 = 0;
        u32 wRaw = 1u;
    };

    constexpr u32 kTriangleFlagTranslucent = 1u << 0u;
    constexpr u32 kTriangleFlagTextured = 1u << 1u;
    constexpr u32 kTriangleFlagDecal = 1u << 2u;
    constexpr u32 kTriangleFlagCoverageFix = 1u << 3u;
    constexpr u32 kTriangleFlagWBuffer = 1u << 4u;
    constexpr u32 kTriangleFlagShadowMask = 1u << 5u;
    constexpr u32 kTriangleFlagLinear = 1u << 6u;
    constexpr u32 kTriangleFlagBoundaryEdge0 = 1u << 7u;
    constexpr u32 kTriangleFlagBoundaryEdge1 = 1u << 8u;
    constexpr u32 kTriangleFlagBoundaryEdge2 = 1u << 9u;
    constexpr u32 kTriangleFlagFrontFacing = 1u << 10u;
    constexpr u32 kTriangleFlagTopLeftEdge0 = 1u << 11u;
    constexpr u32 kTriangleFlagTopLeftEdge1 = 1u << 12u;
    constexpr u32 kTriangleFlagTopLeftEdge2 = 1u << 13u;
    constexpr u32 kTriangleFlagTextureOpaque = 1u << 14u;
    constexpr u32 kTriangleFlagTexcoordBounds = 1u << 15u;
    constexpr u32 kTriangleFlagIntegralTexcoordS = 1u << 16u;
    constexpr u32 kTriangleFlagBoundedDepthEqual = 1u << 17u;
    constexpr u32 kTriangleFlagIntegralTexcoordT = 1u << 18u;
    constexpr u32 kVariantFlagTextured = 1u << 0u;
    constexpr u32 kVariantFlagDecal = 1u << 1u;
    constexpr u32 kVariantFlagModulate = 1u << 2u;
    constexpr u32 kVariantFlagToon = 1u << 3u;
    constexpr u32 kVariantFlagHighlight = 1u << 4u;
    constexpr u32 kVariantFlagShadowMask = 1u << 5u;
    constexpr u32 kVariantFlagWBuffer = 1u << 6u;
    constexpr u32 kVariantFlagTranslucent = 1u << 7u;
    constexpr u32 kVariantFlagCoverageFix = 1u << 8u;

    const auto packYBounds = [&](const float* yValues, size_t yValueCount) -> std::optional<u32> {
        u32 polygonYTop = targetHeight;
        u32 polygonYBot = 0u;
        bool hasPolygonYBounds = false;
        for (size_t yIndex = 0; yIndex < yValueCount; yIndex++)
        {
            const float clampedY = std::clamp(yValues[yIndex], 0.0f, static_cast<float>(targetHeight));
            const u32 yTopLine = static_cast<u32>(std::floor(clampedY));
            const u32 yBottomLine = std::min<u32>(targetHeight, static_cast<u32>(std::ceil(clampedY)));
            polygonYTop = std::min(polygonYTop, yTopLine);
            polygonYBot = std::max(polygonYBot, yBottomLine);
            hasPolygonYBounds = true;
        }

        if (!hasPolygonYBounds)
            return std::nullopt;

        if (polygonYBot <= polygonYTop)
            polygonYBot = std::min<u32>(targetHeight, polygonYTop + 1u);

        return (polygonYTop & 0xFFFFu) | ((polygonYBot & 0xFFFFu) << 16u);
    };

    const auto packSceneDrawYBounds = [&](const AcceleratedSceneDraw& sceneDraw) -> std::optional<u32> {
        u32 polygonYTop = targetHeight;
        u32 polygonYBot = 0u;
        bool hasPolygonYBounds = false;
        for (u32 vertexOffset = 0; vertexOffset < sceneDraw.VertexCount; vertexOffset++)
        {
            const u32 sceneVertexIndex = sceneDraw.FirstVertex + vertexOffset;
            if (sceneVertexIndex >= SharedGraphicsScene.Vertices.size())
                break;

            const float clampedY = std::clamp(SharedGraphicsScene.Vertices[sceneVertexIndex].Y, 0.0f, static_cast<float>(targetHeight));
            const u32 yTopLine = static_cast<u32>(std::floor(clampedY));
            const u32 yBottomLine = std::min<u32>(targetHeight, static_cast<u32>(std::ceil(clampedY)));
            polygonYTop = std::min(polygonYTop, yTopLine);
            polygonYBot = std::max(polygonYBot, yBottomLine);
            hasPolygonYBounds = true;
        }

        if (!hasPolygonYBounds)
            return std::nullopt;

        if (polygonYBot <= polygonYTop)
            polygonYBot = std::min<u32>(targetHeight, polygonYTop + 1u);

        return (polygonYTop & 0xFFFFu) | ((polygonYBot & 0xFFFFu) << 16u);
    };

    struct LinearTexcoordPlane
    {
        std::array<double, 2> origin;
        std::array<double, 2> base;
        std::array<double, 2> dx;
        std::array<double, 2> dy;
        std::array<s16, 4> bounds;
        u32 integralTexcoordFlags;
    };

    const auto polygonTexcoordBoundsFor = [&](const AcceleratedSceneDraw& draw)
        -> std::optional<std::array<s16, 4>> {
        if (draw.PrimitiveType != AcceleratedPrimitiveType::Triangles
            || draw.VertexCount < 3u || draw.FirstVertex >= SharedGraphicsScene.Vertices.size()
            || draw.VertexCount > SharedGraphicsScene.Vertices.size() - draw.FirstVertex)
        {
            return std::nullopt;
        }

        std::array<s16, 4> bounds{
            std::numeric_limits<s16>::max(), std::numeric_limits<s16>::max(),
            std::numeric_limits<s16>::min(), std::numeric_limits<s16>::min(),
        };
        for (u32 i = 0u; i < draw.VertexCount; i++)
        {
            const auto& vertex = SharedGraphicsScene.Vertices[draw.FirstVertex + i];
            bounds[0] = std::min(bounds[0], vertex.TexCoordS);
            bounds[1] = std::min(bounds[1], vertex.TexCoordT);
            bounds[2] = std::max(bounds[2], vertex.TexCoordS);
            bounds[3] = std::max(bounds[3], vertex.TexCoordT);
        }
        return bounds;
    };

    const auto linearTexcoordPlaneFor = [&](const AcceleratedSceneDraw& draw) -> std::optional<LinearTexcoordPlane> {
        const Polygon* polygon = draw.SourcePolygon;
        if (polygon == nullptr
            || polygon->NumVertices < 3u || polygon->NumVertices > std::size(polygon->Vertices)
            || draw.VertexCount < 3u || draw.FirstVertex >= SharedGraphicsScene.Vertices.size()
            || draw.VertexCount > SharedGraphicsScene.Vertices.size() - draw.FirstVertex
            || polygon->FinalW[0] <= 0 || (polygon->FinalW[0] & 0x7F) != 0)
        {
            return std::nullopt;
        }

        for (u32 i = 0u; i < draw.VertexCount; i++)
        {
            if (SharedGraphicsScene.Vertices[draw.FirstVertex + i].W != static_cast<u32>(polygon->FinalW[0]))
                return std::nullopt;
        }

        std::array<s16, 4> bounds{
            std::numeric_limits<s16>::max(), std::numeric_limits<s16>::max(),
            std::numeric_limits<s16>::min(), std::numeric_limits<s16>::min(),
        };
        std::array<s32, 2> subpixelOffset{};
        for (u32 i = 0u; i < polygon->NumVertices; i++)
        {
            const Vertex* vertex = polygon->Vertices[i];
            if (vertex == nullptr || polygon->FinalW[i] != polygon->FinalW[0]
                || vertex->FinalPosition[0] < 0 || vertex->FinalPosition[0] > 256
                || vertex->FinalPosition[1] < 0 || vertex->FinalPosition[1] > 192)
            {
                return std::nullopt;
            }
            const std::array<s32, 2> offset{
                vertex->HiresPosition[0] - vertex->FinalPosition[0] * 16,
                vertex->HiresPosition[1] - vertex->FinalPosition[1] * 16,
            };
            if (offset[0] < 0 || offset[0] >= 16 || offset[1] < 0 || offset[1] >= 16)
                return std::nullopt;
            if (i == 0u)
                subpixelOffset = offset;
            else if (offset != subpixelOffset)
                return std::nullopt;
            bounds[0] = std::min(bounds[0], vertex->TexCoords[0]);
            bounds[1] = std::min(bounds[1], vertex->TexCoords[1]);
            bounds[2] = std::max(bounds[2], vertex->TexCoords[0]);
            bounds[3] = std::max(bounds[3], vertex->TexCoords[1]);
        }

        const Vertex& origin = *polygon->Vertices[0];
        const auto delta = [&](const Vertex& vertex) {
            return std::array<s64, 4>{
                static_cast<s64>(vertex.FinalPosition[0]) - origin.FinalPosition[0],
                static_cast<s64>(vertex.FinalPosition[1]) - origin.FinalPosition[1],
                static_cast<s64>(vertex.TexCoords[0]) - origin.TexCoords[0],
                static_cast<s64>(vertex.TexCoords[1]) - origin.TexCoords[1],
            };
        };

        for (u32 i = 1u; i + 1u < polygon->NumVertices; i++)
        {
            const auto a = delta(*polygon->Vertices[i]);
            const auto b = delta(*polygon->Vertices[i + 1u]);
            const s64 determinant = a[0] * b[1] - b[0] * a[1];
            if (determinant == 0)
                continue;

            const s64 sx = a[2] * b[1] - b[2] * a[1];
            const s64 sy = a[0] * b[2] - b[0] * a[2];
            const s64 tx = a[3] * b[1] - b[3] * a[1];
            const s64 ty = a[0] * b[3] - b[0] * a[3];
            for (u32 j = 1u; j < polygon->NumVertices; j++)
            {
                const auto v = delta(*polygon->Vertices[j]);
                if (v[2] * determinant != sx * v[0] + sy * v[1]
                    || v[3] * determinant != tx * v[0] + ty * v[1])
                {
                    return std::nullopt;
                }
            }

            const bool integralS = sx % determinant == 0 && sy % determinant == 0;
            const bool integralT = tx % determinant == 0 && ty % determinant == 0;
            const bool integralGradients = integralS && integralT;
            const bool hasSubpixelOffset = subpixelOffset[0] != 0 || subpixelOffset[1] != 0;
            const bool requiresRectangle = draw.CoverageFixState.Apply || hasSubpixelOffset;
            const bool separableTexcoords = (sx == 0 || sy == 0) && (tx == 0 || ty == 0);
            if (hasSubpixelOffset && !integralGradients)
                return std::nullopt;
            bool boundedRectangle = false;
            if (polygon->NumVertices == 4u && (integralGradients || separableTexcoords))
            {
                s32 left = 256, top = 192, right = 0, bottom = 0;
                for (u32 j = 0u; j < polygon->NumVertices; j++)
                {
                    const Vertex& vertex = *polygon->Vertices[j];
                    left = std::min(left, vertex.FinalPosition[0]);
                    top = std::min(top, vertex.FinalPosition[1]);
                    right = std::max(right, vertex.FinalPosition[0]);
                    bottom = std::max(bottom, vertex.FinalPosition[1]);
                }
                u32 corners = 0u;
                for (u32 j = 0u; j < polygon->NumVertices; j++)
                {
                    const Vertex& vertex = *polygon->Vertices[j];
                    const bool atRight = vertex.FinalPosition[0] == right;
                    const bool atBottom = vertex.FinalPosition[1] == bottom;
                    if ((!atRight && vertex.FinalPosition[0] != left)
                        || (!atBottom && vertex.FinalPosition[1] != top))
                        break;
                    corners |= 1u << (static_cast<u32>(atRight) | (static_cast<u32>(atBottom) << 1u));
                }
                if (corners == 0xFu)
                {
                    const auto positiveCeiling = [&](s64 numerator) -> s64 {
                        if (numerator == 0 || (numerator < 0) != (determinant < 0))
                            return 0;
                        return numerator / determinant + (numerator % determinant != 0);
                    };
                    bounds[0] += std::max<s64>(0, -sx / determinant) + std::max<s64>(0, -sy / determinant);
                    bounds[1] += std::max<s64>(0, -tx / determinant) + std::max<s64>(0, -ty / determinant);
                    bounds[2] -= positiveCeiling(sx) + positiveCeiling(sy);
                    bounds[3] -= positiveCeiling(tx) + positiveCeiling(ty);
                    boundedRectangle = true;
                }
            }
            if (requiresRectangle && !boundedRectangle)
                return std::nullopt;
            const double divisor = static_cast<double>(determinant) * scale;
            return LinearTexcoordPlane{
                {(origin.FinalPosition[0] + 0.5) * scale, (origin.FinalPosition[1] + 0.5) * scale},
                {static_cast<double>(origin.TexCoords[0]), static_cast<double>(origin.TexCoords[1])},
                {static_cast<double>(sx) / divisor, static_cast<double>(tx) / divisor},
                {static_cast<double>(sy) / divisor, static_cast<double>(ty) / divisor},
                bounds,
                (integralS ? kTriangleFlagIntegralTexcoordS : 0u) | (integralT ? kTriangleFlagIntegralTexcoordT : 0u),
            };
        }
        return std::nullopt;
    };

    std::unordered_set<TextureLookupKey, TextureLookupHasher> reservedAlphaTextureKeys{};
    reservedAlphaTextureKeys.reserve(
        std::min<size_t>(SharedGraphicsScene.Draws.size(), maxActiveTextureDescriptors));
    for (const AcceleratedSceneDraw& sceneDraw : SharedGraphicsScene.Draws)
    {
        const Polygon* polygon = sceneDraw.SourcePolygon;
        if (polygon == nullptr)
            continue;

        const AcceleratedPolygonMeta& polygonMeta = sceneDraw.Meta;
        const bool polygonTexturedByRegs = textureMapsEnabled && (((polygon->TexParam >> 26u) & 0x7u) != 0u);
        if (!polygonTexturedByRegs)
            continue;
        if (!Renderer3DDebugShouldDrawPolygon(
                polygonMeta,
                sceneDraw.PrimitiveType == AcceleratedPrimitiveType::Lines,
                true,
                highlightEnabled))
        {
            continue;
        }

        const std::optional<u32> debugYBounds = packSceneDrawYBounds(sceneDraw);
        if (debugYBounds.has_value() && !Renderer3DDebugYBoundsEnabled(*debugYBounds, targetHeight))
            continue;

        const u32 alpha5 = polygonMeta.Alpha5;
        const bool polygonUsesGlTranslucentPass =
            HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagTranslucent);
        const bool isTranslucent = polygonUsesGlTranslucentPass || (alpha5 != 0u && alpha5 < 0x1Fu);
        if (isTranslucent)
            reservedAlphaTextureKeys.insert(makeTextureLookupKey(polygon->TexParam, polygon->TexPalette));
    }

    for (const AcceleratedSceneDraw& sceneDraw : SharedGraphicsScene.Draws)
    {
        const Polygon* polygon = sceneDraw.SourcePolygon;
        if (polygon == nullptr)
            continue;

        const size_t polygonTriangleBase = Triangles.size();
        const AcceleratedPolygonMeta& polygonMeta = sceneDraw.Meta;
        const u32 alpha5 = polygonMeta.Alpha5;
        const bool polygonUsesGlTranslucentPass =
            HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagTranslucent);
        const bool isTranslucent = polygonUsesGlTranslucentPass || (alpha5 != 0u && alpha5 < 0x1Fu);
        const u32 blendMode = (polygonMeta.PolyAttr >> 4u) & 0x3u;
        const float effectiveCoverageDepthBias =
            sceneDraw.CoverageFixState.ApplyUserFix ? coverageDepthBias : 0.0f;
        const bool polygonTexturedByRegs = textureMapsEnabled && (((polygon->TexParam >> 26u) & 0x7u) != 0u);

        if (!Renderer3DDebugShouldDrawPolygon(
                polygonMeta,
                sceneDraw.PrimitiveType == AcceleratedPrimitiveType::Lines,
                polygonTexturedByRegs,
                highlightEnabled))
        {
            continue;
        }

        const std::optional<u32> debugYBounds = packSceneDrawYBounds(sceneDraw);
        if (debugYBounds.has_value() && !Renderer3DDebugYBoundsEnabled(*debugYBounds, targetHeight))
            continue;

        bool polygonTextured = polygonTexturedByRegs;
        TexcacheVulkanLoader::TextureHandle textureHandle = 0;
        u32 textureLayer = 0;
        u32* helper = nullptr;
        u32 textureDescriptorIndex = fallbackTextureDescriptorIndex;
        bool textureFallbackUsed = false;
        bool textureLayerOpaque = false;
        u32 texWidth = 0u;
        u32 texHeight = 0u;
        const u64 graphicsTextureLookupStartNs = perPolygonTiming ? PerfNowNs() : 0u;
        if (polygonTextured)
        {
            texWidth = TextureWidth(polygon->TexParam);
            texHeight = TextureHeight(polygon->TexParam);
            if (texWidth == 0u || texHeight == 0u)
            {
                polygonTextured = false;
            }
            else
            {
                const TextureLookupKey textureKey = makeTextureLookupKey(
                    polygon->TexParam,
                    polygon->TexPalette);
                const u32 textureFormat = (polygon->TexParam >> 26u) & 0x7u;
                const bool persistentTextureCacheAllowed = textureFormat != 0u;
                auto textureIt = textureLookup.find(textureKey);
                if (textureIt == textureLookup.end())
                {
                    textureLookupMissCount++;
                    GraphicsResolvedTextureCacheEntry resolvedTexture{};
                    bool resolvedTextureValid = false;
                    const u64 persistentTextureLookupStartNs = perPolygonTiming ? PerfNowNs() : 0u;
                    const auto persistentTextureIt = persistentTextureCacheAllowed
                        ? GraphicsResolvedTextureCache.find(textureKey.Key)
                        : GraphicsResolvedTextureCache.end();
                    if (perPolygonTiming) graphicsTexturePersistentCpuNs += PerfNowNs() - persistentTextureLookupStartNs;
                    if (persistentTextureIt != GraphicsResolvedTextureCache.end())
                    {
                        persistentTextureHitCount++;
                        resolvedTexture = persistentTextureIt->second;
                        resolvedTextureValid = true;
                    }
                    else
                    {
                        persistentTextureMissCount++;
                        const u64 texcacheResolveStartNs = perPolygonTiming ? PerfNowNs() : 0u;
                        Texcache.GetTexture(
                            gpu,
                            polygon->TexParam,
                            polygon->TexPalette,
                            textureHandle,
                            textureLayer,
                            helper
                        );
                        if (perPolygonTiming) graphicsTexcacheResolveCpuNs += PerfNowNs() - texcacheResolveStartNs;

                        VkDescriptorImageInfo textureDescriptorInfo{};
                        VkDescriptorImageInfo normalizedTextureDescriptorInfo{};
                        const u64 textureDescriptorStartNs = perPolygonTiming ? PerfNowNs() : 0u;
                        const bool descriptorValid = getGraphicsTextureDescriptors(
                            textureHandle,
                            &textureDescriptorInfo,
                            &normalizedTextureDescriptorInfo);
                        bool layerOpaque = false;
                        if (descriptorValid)
                            layerOpaque = Texcache.GetLoader().IsTextureLayerOpaque(textureHandle, textureLayer);
                        if (perPolygonTiming) graphicsTextureDescriptorCpuNs += PerfNowNs() - textureDescriptorStartNs;
                        if (descriptorValid)
                        {
                            textureDescriptorInfo.sampler = textureSamplerForTexParam(polygon->TexParam);
                            normalizedTextureDescriptorInfo.sampler = textureDescriptorInfo.sampler;
                            resolvedTexture.Handle = textureHandle;
                            resolvedTexture.Layer = textureLayer;
                            resolvedTexture.DescriptorInfo = textureDescriptorInfo;
                            resolvedTexture.NormalizedDescriptorInfo = normalizedTextureDescriptorInfo;
                            resolvedTexture.FallbackUsed = false;
                            resolvedTexture.LayerOpaque = layerOpaque;
                            resolvedTexture.Width = texWidth;
                            resolvedTexture.Height = texHeight;
                            resolvedTextureValid = true;
                            if (persistentTextureCacheAllowed)
                                GraphicsResolvedTextureCache.emplace(textureKey.Key, resolvedTexture);
                        }
                    }

                    const u64 textureSlotStartNs = perPolygonTiming ? PerfNowNs() : 0u;
                    const auto reservedAlphaTextureIt = reservedAlphaTextureKeys.find(textureKey);
                    const bool reservedAlphaTexture = reservedAlphaTextureIt != reservedAlphaTextureKeys.end();
                    const u32 reservedAlphaTextureCount =
                        std::min<u32>(
                            static_cast<u32>(reservedAlphaTextureKeys.size()),
                            maxActiveTextureDescriptors);
                    const bool descriptorSlotAvailable =
                        ActiveTextureDescriptorCount < maxActiveTextureDescriptors
                        && (reservedAlphaTexture
                            || (ActiveTextureDescriptorCount + reservedAlphaTextureCount) < maxActiveTextureDescriptors);
                    if (resolvedTextureValid && descriptorSlotAvailable)
                    {
                        textureDescriptorIndex = ActiveTextureDescriptorCount;
                        ActiveTextureDescriptors[textureDescriptorIndex] = resolvedTexture.DescriptorInfo;
                        ActiveNormalizedTextureDescriptors[textureDescriptorIndex] = resolvedTexture.NormalizedDescriptorInfo;
                        ActiveTextureDescriptorCount++;
                        textureHandle = resolvedTexture.Handle;
                        textureLayer = resolvedTexture.Layer;
                        textureLayerOpaque = resolvedTexture.LayerOpaque;
                        texWidth = resolvedTexture.Width;
                        texHeight = resolvedTexture.Height;
                        textureLookup.emplace(
                            textureKey,
                            TextureFrameData{
                                textureHandle,
                                textureLayer,
                                textureDescriptorIndex,
                                resolvedTexture.FallbackUsed,
                                textureLayerOpaque,
                                texWidth,
                                texHeight,
                            });
                        if (reservedAlphaTexture)
                            reservedAlphaTextureKeys.erase(reservedAlphaTextureIt);
                    }
                    else
                    {
                        textureDescriptorIndex = fallbackTextureDescriptorIndex;
                        textureLayer = 0u;
                        texWidth = 1u;
                        texHeight = 1u;
                        textureFallbackUsed = true;
                        textureLayerOpaque = true;
                        textureLookup.emplace(
                            textureKey,
                            TextureFrameData{
                                0,
                                textureLayer,
                                textureDescriptorIndex,
                                true,
                                textureLayerOpaque,
                                texWidth,
                                texHeight,
                            });
                    }
                    if (perPolygonTiming) graphicsTextureSlotCpuNs += PerfNowNs() - textureSlotStartNs;
                }
                else
                {
                    textureLookupHitCount++;
                    const TextureFrameData& textureData = textureIt->second;
                    textureHandle = textureData.Handle;
                    textureLayer = textureData.Layer;
                    textureDescriptorIndex = textureData.DescriptorIndex;
                    textureFallbackUsed = textureData.FallbackUsed;
                    textureLayerOpaque = textureData.LayerOpaque;
                    texWidth = textureData.Width;
                    texHeight = textureData.Height;
                }
            }
        }

        bool hasTexture = polygonTextured && texWidth > 0u && texHeight > 0u;
        bool constantTextureCollapsed = false;
        u32 constantTextureTexel = 0u;
        constexpr bool kEnableConstantTextureCollapse = false;
        const u64 constantTextureStartNs = perPolygonTiming ? PerfNowNs() : 0u;
        if (kEnableConstantTextureCollapse
            && hasTexture
            && textureHandle != 0
            && textureLayerOpaque
            && !textureFallbackUsed
            && !isTranslucent
            && blendMode == 0u
            && alpha5 == 31u
            && (polygonMeta.Flags & (AcceleratedPolygonFlagShadowMask | AcceleratedPolygonFlagShadow)) == 0u)
        {
            const bool linear = (polygon->TexParam & (1u << 30u)) != 0u;
            const bool repeatS = (polygon->TexParam & (1u << 16u)) != 0u;
            const bool repeatT = (polygon->TexParam & (1u << 17u)) != 0u;
            const bool mirrorS = (polygon->TexParam & (1u << 18u)) != 0u;
            const bool mirrorT = (polygon->TexParam & (1u << 19u)) != 0u;
            bool hasReferenceTexel = false;
            int referenceS = 0;
            int referenceT = 0;
            bool allVerticesUseSameTexel = !linear;

            for (u32 triangleIndex = sceneDraw.FirstTriangle;
                 allVerticesUseSameTexel && triangleIndex < sceneDraw.FirstTriangle + sceneDraw.TriangleCount;
                 triangleIndex++)
            {
                if (triangleIndex >= SharedGraphicsScene.Triangles.size())
                    break;

                const AcceleratedSceneTriangle& sceneTriangle = SharedGraphicsScene.Triangles[triangleIndex];
                for (u32 corner = 0; corner < 3u; corner++)
                {
                    const u16 vertexIndex = sceneTriangle.Indices[corner];
                    if (vertexIndex >= SharedGraphicsScene.Vertices.size())
                    {
                        allVerticesUseSameTexel = false;
                        break;
                    }

                    const AcceleratedSceneVertex& vertex = SharedGraphicsScene.Vertices[vertexIndex];
                    const int sampleS = wrapTextureCoord(
                        static_cast<int>(std::floor(static_cast<float>(vertex.TexCoordS))),
                        static_cast<int>(texWidth),
                        repeatS,
                        mirrorS);
                    const int sampleT = wrapTextureCoord(
                        static_cast<int>(std::floor(static_cast<float>(vertex.TexCoordT))),
                        static_cast<int>(texHeight),
                        repeatT,
                        mirrorT);
                    if (!hasReferenceTexel)
                    {
                        referenceS = sampleS;
                        referenceT = sampleT;
                        hasReferenceTexel = true;
                    }
                    else if (sampleS != referenceS || sampleT != referenceT)
                    {
                        allVerticesUseSameTexel = false;
                        break;
                    }
                }
            }

            if (allVerticesUseSameTexel
                && hasReferenceTexel
                && Texcache.GetLoader().ReadTextureLayerTexel(
                    textureHandle,
                    textureLayer,
                    static_cast<u32>(referenceS),
                    static_cast<u32>(referenceT),
                    &constantTextureTexel)
                && ((constantTextureTexel >> 24u) & 0x1Fu) == 31u)
            {
                constantTextureCollapsed = true;
                hasTexture = false;
                constantTextureCollapseCount++;
            }
        }
        if (perPolygonTiming) graphicsConstantTextureCpuNs += PerfNowNs() - constantTextureStartNs;
        if (perPolygonTiming) graphicsTextureLookupCpuNs += PerfNowNs() - graphicsTextureLookupStartNs;

        const u64 graphicsVertexEmitStartNs = perPolygonTiming ? PerfNowNs() : 0u;
        u32 boundedEqualDepth = 0xFFFFFFFFu;
        const u32 boundedRequiredFlags = AcceleratedPolygonFlagTranslucent | AcceleratedPolygonFlagDepthEqual;
        const u32 boundedDisallowedFlags = AcceleratedPolygonFlagWBuffer | AcceleratedPolygonFlagNeedOpaquePass
            | AcceleratedPolygonFlagShadow | AcceleratedPolygonFlagShadowMask;
        if (VulkanContext::Get().SupportsDepthBounds()
            && (polygonMeta.Flags & boundedRequiredFlags) == boundedRequiredFlags
            && (polygonMeta.Flags & boundedDisallowedFlags) == 0u
            && !sceneDraw.CoverageFixState.Apply
            && sceneDraw.VertexCount >= 3u
            && static_cast<size_t>(sceneDraw.FirstVertex) + sceneDraw.VertexCount <= SharedGraphicsScene.Vertices.size())
        {
            const auto first = SharedGraphicsScene.Vertices.begin() + sceneDraw.FirstVertex;
            const u32 depth = first->Z;
            if (depth <= 0xFFFFFFu
                && std::all_of(first, first + sceneDraw.VertexCount,
                    [depth](const AcceleratedSceneVertex& vertex) { return vertex.Z == depth; }))
            {
                boundedEqualDepth = depth;
            }
        }
        u32 sceneVertexFlags = boundedEqualDepth != 0xFFFFFFFFu ? kTriangleFlagBoundedDepthEqual : 0u;
        if (hasTexture)
        {
            sceneVertexFlags |= kTriangleFlagTextured;
            if (textureLayerOpaque)
                sceneVertexFlags |= kTriangleFlagTextureOpaque;
            if ((blendMode & 0x1u) != 0u && !textureFallbackUsed)
                sceneVertexFlags |= kTriangleFlagDecal;
        }
        if (sceneDraw.CoverageFixState.Apply)
            sceneVertexFlags |= kTriangleFlagCoverageFix;
        if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagWBuffer))
            sceneVertexFlags |= kTriangleFlagWBuffer;
        if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagShadowMask))
            sceneVertexFlags |= kTriangleFlagShadowMask;
        if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagFacingView))
            sceneVertexFlags |= kTriangleFlagFrontFacing;

        const auto makeColor = [&](const AcceleratedSceneVertex& vertex) -> u32 {
            u32 vr = static_cast<u32>(vertex.FinalColorR) >> 3u;
            u32 vg = static_cast<u32>(vertex.FinalColorG) >> 3u;
            u32 vb = static_cast<u32>(vertex.FinalColorB) >> 3u;
            u32 va = std::min<u32>(31u, vertex.Alpha5);
            if (constantTextureCollapsed)
            {
                vr = modulate6(constantTextureTexel, vr);
                vg = modulate6(constantTextureTexel >> 8u, vg);
                vb = modulate6(constantTextureTexel >> 16u, vb);
                va = modulate5(constantTextureTexel >> 24u, va);
            }
            return packRgba8(
                to8From6(vr),
                to8From6(vg),
                to8From6(vb),
                to8From5(va));
        };

        const std::optional<LinearTexcoordPlane> texcoordPlane = hasTexture
            ? linearTexcoordPlaneFor(sceneDraw)
            : std::nullopt;
        const auto boundedTexcoords = texcoordPlane ? std::make_optional(texcoordPlane->bounds)
            : hasTexture ? polygonTexcoordBoundsFor(sceneDraw) : std::nullopt;
        const u32 texcoordFlags = boundedTexcoords
            ? kTriangleFlagTexcoordBounds
                | (texcoordPlane ? texcoordPlane->integralTexcoordFlags : 0u)
            : 0u;
        const std::array<s16, 4> texcoordBounds = boundedTexcoords.value_or(std::array<s16, 4>{});
        const auto texcoordFor = [&](float x, float y, float u, float v) -> std::array<float, 2> {
            if (!texcoordPlane)
                return {u, v};
            const double dx = static_cast<double>(x) - texcoordPlane->origin[0];
            const double dy = static_cast<double>(y) - texcoordPlane->origin[1];
            return {
                static_cast<float>(texcoordPlane->base[0] + texcoordPlane->dx[0] * dx + texcoordPlane->dy[0] * dy),
                static_cast<float>(texcoordPlane->base[1] + texcoordPlane->dx[1] * dx + texcoordPlane->dy[1] * dy),
            };
        };
        const auto makeSceneGraphicsVertex = [&](const AcceleratedSceneVertex& vertex) -> GraphicsVertexGpu {
            GraphicsVertexGpu graphicsVertex{};
            graphicsVertex.x = vertex.X;
            graphicsVertex.y = vertex.Y;
            graphicsVertex.z = static_cast<float>(vertex.Z);
            graphicsVertex.reciprocalW = 1.0f / static_cast<float>(std::max<u32>(1u, vertex.W));
            const auto texcoord = texcoordFor(vertex.X, vertex.Y, vertex.TexCoordS, vertex.TexCoordT);
            graphicsVertex.u = texcoord[0];
            graphicsVertex.v = texcoord[1];
            graphicsVertex.colorRgba8 = makeColor(vertex);
            graphicsVertex.flags = sceneVertexFlags | texcoordFlags;
            graphicsVertex.texLayer = textureLayer;
            graphicsVertex.texArrayIndex = hasTexture ? textureDescriptorIndex : 0u;
            graphicsVertex.texWidth = hasTexture ? texWidth : 0u;
            graphicsVertex.texHeight = hasTexture ? texHeight : 0u;
            graphicsVertex.texParam = hasTexture ? polygon->TexParam : 0u;
            graphicsVertex.polyAttr = polygonMeta.PolyAttr;
            graphicsVertex.texcoordBounds = texcoordBounds;
            return graphicsVertex;
        };

        for (u32 vertexOffset = 0; vertexOffset < sceneDraw.VertexCount; vertexOffset++)
        {
            const u32 sceneVertexIndex = sceneDraw.FirstVertex + vertexOffset;
            if (sceneVertexIndex >= SharedGraphicsScene.Vertices.size() || sceneVertexIndex >= GraphicsSceneVertices.size())
                break;
            GraphicsSceneVertices[sceneVertexIndex] = makeSceneGraphicsVertex(SharedGraphicsScene.Vertices[sceneVertexIndex]);
        }
        const auto makeTriangleVertex = [&](const AcceleratedSceneVertex& vertex,
                                            float x,
                                            float y,
                                            std::optional<u32> colorOverride = std::nullopt) -> TriangleVertexData {
            TriangleVertexData triangleVertex{};
            triangleVertex.x = x;
            triangleVertex.y = y;
            triangleVertex.z = static_cast<float>(vertex.Z);
            triangleVertex.wRaw = std::max<u32>(1u, vertex.W);
            triangleVertex.w = static_cast<float>(triangleVertex.wRaw);
            if (sceneDraw.CoverageFixState.Apply && effectiveCoverageDepthBias > 0.0f)
                triangleVertex.z = std::max(0.0f, triangleVertex.z - effectiveCoverageDepthBias);
            triangleVertex.u = static_cast<float>(vertex.TexCoordS);
            triangleVertex.v = static_cast<float>(vertex.TexCoordT);
            triangleVertex.colorRgba8 = colorOverride.value_or(makeColor(vertex));
            return triangleVertex;
        };

        const auto appendTriangle = [&](const TriangleVertexData& vertex0,
                                        const TriangleVertexData& vertex1,
                                        const TriangleVertexData& vertex2,
                                        u32 boundaryFlags,
                                        u32 packedYBounds) {
            TriangleGpu triangle{};
            triangle.x0 = vertex0.x;
            triangle.y0 = vertex0.y;
            triangle.z0 = vertex0.z;
            triangle.w0 = vertex0.w;
            triangle.x1 = vertex1.x;
            triangle.y1 = vertex1.y;
            triangle.z1 = vertex1.z;
            triangle.w1 = vertex1.w;
            triangle.x2 = vertex2.x;
            triangle.y2 = vertex2.y;
            triangle.z2 = vertex2.z;
            triangle.w2 = vertex2.w;
            triangle.u0 = vertex0.u;
            triangle.v0 = vertex0.v;
            triangle.u1 = vertex1.u;
            triangle.v1 = vertex1.v;
            triangle.u2 = vertex2.u;
            triangle.v2 = vertex2.v;
            {
                const float boundsYMin = std::min({vertex0.y, vertex1.y, vertex2.y});
                const float boundsYMax = std::max({vertex0.y, vertex1.y, vertex2.y});
                const float boundsLimit = static_cast<float>(targetHeight);
                const float clampedMin = std::clamp(boundsYMin, 0.0f, boundsLimit);
                const float clampedMax = std::clamp(boundsYMax, 0.0f, boundsLimit);
                const u32 yTopLine = static_cast<u32>(std::floor(clampedMin));
                u32 yBottomLine = std::min<u32>(targetHeight, static_cast<u32>(std::ceil(clampedMax)));
                if (yBottomLine <= yTopLine)
                    yBottomLine = std::min<u32>(targetHeight, yTopLine + 1u);
                triangle.yBounds = (yTopLine & 0xFFFFu) | ((yBottomLine & 0xFFFFu) << 16u);
            }
            (void)packedYBounds;
            triangle.texLayer = textureLayer;
            triangle.color0Rgba8 = vertex0.colorRgba8;
            triangle.color1Rgba8 = vertex1.colorRgba8;
            triangle.color2Rgba8 = vertex2.colorRgba8;

            const u32 a0 = (triangle.color0Rgba8 >> 24u) & 0xFFu;
            const u32 a1 = (triangle.color1Rgba8 >> 24u) & 0xFFu;
            const u32 a2 = (triangle.color2Rgba8 >> 24u) & 0xFFu;
            const bool alphaTranslucent = (a0 < 255u) || (a1 < 255u) || (a2 < 255u);

            triangle.flags = boundaryFlags;
            if (isTranslucent || alphaTranslucent)
                triangle.flags |= kTriangleFlagTranslucent;
            if (hasTexture)
            {
                triangle.flags |= kTriangleFlagTextured;
                if (textureLayerOpaque)
                    triangle.flags |= kTriangleFlagTextureOpaque;
                if ((blendMode & 0x1u) != 0u && !textureFallbackUsed)
                    triangle.flags |= kTriangleFlagDecal;
                triangle.texArrayIndex = textureDescriptorIndex;
                triangle.texWidth = texWidth;
                triangle.texHeight = texHeight;
                triangle.texParam = polygon->TexParam;
            }
            if (sceneDraw.CoverageFixState.Apply)
                triangle.flags |= kTriangleFlagCoverageFix;
            if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagWBuffer))
                triangle.flags |= kTriangleFlagWBuffer;
            if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagShadowMask))
                triangle.flags |= kTriangleFlagShadowMask;
            if (vertex0.wRaw == vertex1.wRaw && vertex1.wRaw == vertex2.wRaw && (vertex0.wRaw & 0x7Fu) == 0u)
                triangle.flags |= kTriangleFlagLinear;
            if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagFacingView))
                triangle.flags |= kTriangleFlagFrontFacing;

            const auto isTopLeftEdge = [](const TriangleVertexData& start, const TriangleVertexData& end) -> bool {
                const float deltaY = end.y - start.y;
                if (std::fabs(deltaY) < 0.000001f)
                    return (end.x - start.x) > 0.0f;
                return deltaY < 0.0f;
            };
            const float signedArea = (vertex2.x - vertex0.x) * (vertex1.y - vertex0.y)
                - (vertex2.y - vertex0.y) * (vertex1.x - vertex0.x);
            const bool positiveArea = signedArea > 0.0f;
            if ((triangle.flags & kTriangleFlagBoundaryEdge0) == 0u
                && (positiveArea ? isTopLeftEdge(vertex1, vertex2) : isTopLeftEdge(vertex2, vertex1)))
            {
                triangle.flags |= kTriangleFlagTopLeftEdge0;
            }
            if ((triangle.flags & kTriangleFlagBoundaryEdge1) == 0u
                && (positiveArea ? isTopLeftEdge(vertex2, vertex0) : isTopLeftEdge(vertex0, vertex2)))
            {
                triangle.flags |= kTriangleFlagTopLeftEdge1;
            }
            if ((triangle.flags & kTriangleFlagBoundaryEdge2) == 0u
                && (positiveArea ? isTopLeftEdge(vertex0, vertex1) : isTopLeftEdge(vertex1, vertex0)))
            {
                triangle.flags |= kTriangleFlagTopLeftEdge2;
            }

            if (boundedEqualDepth != 0xFFFFFFFFu)
                triangle.flags |= kTriangleFlagBoundedDepthEqual;
            triangle.polyAttr = polygonMeta.PolyAttr;
            triangle.variantKey = 0u;
            if (hasTexture)
                triangle.variantKey |= kVariantFlagTextured;
            if (blendMode == 2u)
            {
                triangle.variantKey |= highlightEnabled ? kVariantFlagHighlight : kVariantFlagToon;
            }
            else if (hasTexture && (blendMode & 0x1u) != 0u && !textureFallbackUsed)
            {
                triangle.variantKey |= kVariantFlagDecal;
            }
            else
            {
                triangle.variantKey |= kVariantFlagModulate;
            }
            if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagShadowMask))
                triangle.variantKey |= kVariantFlagShadowMask;
            if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagWBuffer))
                triangle.variantKey |= kVariantFlagWBuffer;
            if (isTranslucent || alphaTranslucent)
                triangle.variantKey |= kVariantFlagTranslucent;
            if (sceneDraw.CoverageFixState.Apply)
                triangle.variantKey |= kVariantFlagCoverageFix;

            Triangles.push_back(triangle);

            const auto reciprocalW = [](float w) {
                return 1.0f / std::max(w, 1.0f);
            };
            const auto appendGraphicsVertex = [&](const TriangleVertexData& vertexData) {
                GraphicsVertexGpu graphicsVertex{};
                graphicsVertex.x = vertexData.x;
                graphicsVertex.y = vertexData.y;
                graphicsVertex.z = vertexData.z;
                graphicsVertex.reciprocalW = reciprocalW(vertexData.w);
                const auto texcoord = texcoordFor(vertexData.x, vertexData.y, vertexData.u, vertexData.v);
                graphicsVertex.u = texcoord[0];
                graphicsVertex.v = texcoord[1];
                graphicsVertex.colorRgba8 = vertexData.colorRgba8;
                graphicsVertex.flags = triangle.flags | texcoordFlags;
                graphicsVertex.texLayer = triangle.texLayer;
                graphicsVertex.texArrayIndex = triangle.texArrayIndex;
                graphicsVertex.texWidth = triangle.texWidth;
                graphicsVertex.texHeight = triangle.texHeight;
                graphicsVertex.texParam = triangle.texParam;
                graphicsVertex.polyAttr = triangle.polyAttr;
                graphicsVertex.texcoordBounds = texcoordBounds;
                GraphicsVertices.push_back(graphicsVertex);
            };

            appendGraphicsVertex(vertex0);
            appendGraphicsVertex(vertex1);
            appendGraphicsVertex(vertex2);
        };

        const auto appendLineSegment = [&](u16 vertexIndex0,
                                           u16 vertexIndex1,
                                           std::optional<u32> colorOverride = std::nullopt,
                                           float endpointExtend = 0.0f) {
            if (vertexIndex0 >= SharedGraphicsScene.Vertices.size() || vertexIndex1 >= SharedGraphicsScene.Vertices.size())
                return;

            const AcceleratedSceneVertex& lineVertex0 = SharedGraphicsScene.Vertices[vertexIndex0];
            const AcceleratedSceneVertex& lineVertex1 = SharedGraphicsScene.Vertices[vertexIndex1];
            const float lineX0 = lineVertex0.X;
            const float lineY0 = lineVertex0.Y;
            const float lineX1 = lineVertex1.X;
            const float lineY1 = lineVertex1.Y;

            const float deltaX = lineX1 - lineX0;
            const float deltaY = lineY1 - lineY0;
            const float lineLengthSquared = (deltaX * deltaX) + (deltaY * deltaY);
            if (lineLengthSquared <= 0.000001f)
                return;

            const float inverseLineLength = 1.0f / std::sqrt(lineLengthSquared);
            const float lineDirX = deltaX * inverseLineLength;
            const float lineDirY = deltaY * inverseLineLength;
            const float halfLineWidth = 0.5f;
            const float perpX = -deltaY * inverseLineLength * halfLineWidth;
            const float perpY = deltaX * inverseLineLength * halfLineWidth;
            const float startX = lineX0 - (lineDirX * endpointExtend);
            const float startY = lineY0 - (lineDirY * endpointExtend);
            const float endX = lineX1 + (lineDirX * endpointExtend);
            const float endY = lineY1 + (lineDirY * endpointExtend);

            const float quadPositionsX[4] = {
                startX + perpX,
                startX - perpX,
                endX - perpX,
                endX + perpX,
            };
            const float quadPositionsY[4] = {
                startY + perpY,
                startY - perpY,
                endY - perpY,
                endY + perpY,
            };

            const std::optional<u32> packedLineYBounds = packYBounds(quadPositionsY, 4u);
            if (!packedLineYBounds.has_value())
                return;

            appendTriangle(
                makeTriangleVertex(lineVertex0, quadPositionsX[0], quadPositionsY[0], colorOverride),
                makeTriangleVertex(lineVertex0, quadPositionsX[1], quadPositionsY[1], colorOverride),
                makeTriangleVertex(lineVertex1, quadPositionsX[2], quadPositionsY[2], colorOverride),
                kTriangleFlagBoundaryEdge0 | kTriangleFlagBoundaryEdge2,
                *packedLineYBounds);
            appendTriangle(
                makeTriangleVertex(lineVertex0, quadPositionsX[0], quadPositionsY[0], colorOverride),
                makeTriangleVertex(lineVertex1, quadPositionsX[2], quadPositionsY[2], colorOverride),
                makeTriangleVertex(lineVertex1, quadPositionsX[3], quadPositionsY[3], colorOverride),
                kTriangleFlagBoundaryEdge0 | kTriangleFlagBoundaryEdge1,
                *packedLineYBounds);
        };

        const auto enqueueGraphicsDraw = [&](size_t polygonTriangleCount,
                                             bool suppressEdgeMarkIndices = false,
                                             u32 edgeColorOverrideMask = 0u,
                                             u32 edgeColorOverridePacked = 0u) {
            if (polygonTriangleCount == 0u)
                return;

            GraphicsPolygonDraw draw{};
            draw.firstTriangle = static_cast<u32>(polygonTriangleBase);
            draw.triangleCount = static_cast<u32>(polygonTriangleCount);
            draw.polyAttr = polygonMeta.PolyAttr;
            draw.flags = polygonMeta.Flags;
            draw.firstVertex = sceneDraw.FirstVertex;
            draw.vertexCount = sceneDraw.VertexCount;
            draw.firstEdgeIndex = sceneDraw.FirstEdgeIndex;
            draw.edgeIndexCount = suppressEdgeMarkIndices ? 0u : sceneDraw.EdgeIndexCount;
            draw.edgeColorOverrideMask = edgeColorOverrideMask;
            draw.edgeColorOverridePacked = edgeColorOverridePacked;
            draw.boundedEqualDepth = boundedEqualDepth;

            const u32 drawIndex = static_cast<u32>(GraphicsPolygons.size());
            GraphicsPolygons.push_back(draw);

            if (!polygonUsesGlTranslucentPass
                && !HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagShadowMask)
                && !HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagShadow))
            {
                GraphicsOpaqueDrawIndices.push_back(drawIndex);
            }

            if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagNeedOpaquePass))
                GraphicsNeedOpaqueDrawIndices.push_back(drawIndex);

            if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagShadowMask))
            {
                GraphicsShadowMaskDrawIndices.push_back(drawIndex);
            }
            else if (HasAcceleratedPolygonFlag(polygonMeta, AcceleratedPolygonFlagShadow))
            {
                GraphicsShadowDrawIndices.push_back(drawIndex);
            }
            else if (polygonUsesGlTranslucentPass)
            {
                GraphicsAlphaDrawIndices.push_back(drawIndex);
            }
        };

        if (sceneDraw.PrimitiveType == AcceleratedPrimitiveType::Lines)
        {
            if (sceneDraw.IndexCount < 2u || (sceneDraw.FirstIndex + 1u) >= SharedGraphicsScene.Indices.size())
                continue;

            const u16 vertexIndex0 = SharedGraphicsScene.Indices[sceneDraw.FirstIndex];
            const u16 vertexIndex1 = SharedGraphicsScene.Indices[sceneDraw.FirstIndex + 1u];
            if (vertexIndex0 >= SharedGraphicsScene.Vertices.size() || vertexIndex1 >= SharedGraphicsScene.Vertices.size())
                continue;

            appendLineSegment(vertexIndex0, vertexIndex1);
            enqueueGraphicsDraw(Triangles.size() - polygonTriangleBase);
            if (perPolygonTiming) graphicsVertexEmitCpuNs += PerfNowNs() - graphicsVertexEmitStartNs;
            continue;
        }

        if (alpha5 == 0u)
        {
            const bool hiddenLayerAlphaZero =
                !hasTexture
                && blendMode == 0u
                && polygonMeta.Flags == 0u;
            const std::optional<u32> wireframeLineColor =
                hiddenLayerAlphaZero ? std::optional<u32>(0xFFFFFFFFu) : std::nullopt;
            const float wireframeEndpointExtend = 0.0f;
            const u32 wireframeEdgeColorOverrideMask = hiddenLayerAlphaZero
                ? (1u << ((polygonMeta.PolyId >> 3u) & 0x7u))
                : 0u;
            const u32 wireframeEdgeColorOverridePacked = hiddenLayerAlphaZero ? 0x00FFFFFFu : 0u;
            if (hiddenLayerAlphaZero && polygonMeta.PolyId == 56u)
            {
                GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride = 56u;
                GraphicsHiddenAlphaZeroFinalEdgeColorOverride = 0x00FFFFFFu;
            }

            u32 emittedBoundaryEdgeCount = 0u;
            for (u32 triangleIndex = sceneDraw.FirstTriangle;
                 triangleIndex < sceneDraw.FirstTriangle + sceneDraw.TriangleCount;
                 triangleIndex++)
            {
                if (triangleIndex >= SharedGraphicsScene.Triangles.size())
                    break;

                const AcceleratedSceneTriangle& sceneTriangle = SharedGraphicsScene.Triangles[triangleIndex];
                const u16 vertexIndex0 = sceneTriangle.Indices[0];
                const u16 vertexIndex1 = sceneTriangle.Indices[1];
                const u16 vertexIndex2 = sceneTriangle.Indices[2];
                if (vertexIndex0 >= SharedGraphicsScene.Vertices.size()
                    || vertexIndex1 >= SharedGraphicsScene.Vertices.size()
                    || vertexIndex2 >= SharedGraphicsScene.Vertices.size())
                {
                    continue;
                }

                if ((sceneTriangle.BoundaryFlags & AcceleratedTriangleBoundaryEdge0) != 0u)
                {
                    appendLineSegment(vertexIndex1, vertexIndex2, wireframeLineColor, wireframeEndpointExtend);
                    emittedBoundaryEdgeCount++;
                }
                if ((sceneTriangle.BoundaryFlags & AcceleratedTriangleBoundaryEdge1) != 0u)
                {
                    appendLineSegment(vertexIndex2, vertexIndex0, wireframeLineColor, wireframeEndpointExtend);
                    emittedBoundaryEdgeCount++;
                }
                if ((sceneTriangle.BoundaryFlags & AcceleratedTriangleBoundaryEdge2) != 0u)
                {
                    appendLineSegment(vertexIndex0, vertexIndex1, wireframeLineColor, wireframeEndpointExtend);
                    emittedBoundaryEdgeCount++;
                }
            }

            static u32 loggedWireframePolygonCount = 0u;
            if (loggedWireframePolygonCount < 24u && MelonDSAndroid::areRendererDebugToolsEnabled())
            {
                const u32 yBounds = debugYBounds.value_or(0u);
                Log(
                    LogLevel::Warn,
                    "VulkanGraphics[AlphaZeroWireframe]: sample=%u polyId=%u blend=%u flags=%#x hasTexture=%u texParam=%#x vertexCount=%u edgeIndexCount=%u originalTriCount=%u emittedBoundaryEdgeCount=%u hiddenLayerAlphaZero=%u lineColor=%#x edgeColorOverrideMask=%#x finalEdgePolyIdOverride=%u y=%u..%u",
                    loggedWireframePolygonCount,
                    polygonMeta.PolyId,
                    (polygonMeta.PolyAttr >> 4u) & 0x3u,
                    polygonMeta.Flags,
                    hasTexture ? 1u : 0u,
                    polygon->TexParam,
                    sceneDraw.VertexCount,
                    sceneDraw.EdgeIndexCount,
                    sceneDraw.TriangleCount,
                    emittedBoundaryEdgeCount,
                    hiddenLayerAlphaZero ? 1u : 0u,
                    wireframeLineColor.value_or(0u),
                    wireframeEdgeColorOverrideMask,
                    GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride < 64u ? GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride : 0xFFFFFFFFu,
                    yBounds & 0xFFFFu,
                    (yBounds >> 16u) & 0xFFFFu);
                loggedWireframePolygonCount++;
            }

            enqueueGraphicsDraw(
                Triangles.size() - polygonTriangleBase,
                false,
                wireframeEdgeColorOverrideMask,
                wireframeEdgeColorOverridePacked);
            if (perPolygonTiming) graphicsVertexEmitCpuNs += PerfNowNs() - graphicsVertexEmitStartNs;
            continue;
        }

        for (u32 triangleIndex = sceneDraw.FirstTriangle;
             triangleIndex < sceneDraw.FirstTriangle + sceneDraw.TriangleCount;
             triangleIndex++)
        {
            if (triangleIndex >= SharedGraphicsScene.Triangles.size())
                break;

            const AcceleratedSceneTriangle& sceneTriangle = SharedGraphicsScene.Triangles[triangleIndex];
            const u16 vertexIndex0 = sceneTriangle.Indices[0];
            const u16 vertexIndex1 = sceneTriangle.Indices[1];
            const u16 vertexIndex2 = sceneTriangle.Indices[2];
            if (vertexIndex0 >= SharedGraphicsScene.Vertices.size()
                || vertexIndex1 >= SharedGraphicsScene.Vertices.size()
                || vertexIndex2 >= SharedGraphicsScene.Vertices.size())
            {
                continue;
            }

            u32 boundaryFlags = 0u;
            if ((sceneTriangle.BoundaryFlags & AcceleratedTriangleBoundaryEdge0) != 0u)
                boundaryFlags |= kTriangleFlagBoundaryEdge0;
            if ((sceneTriangle.BoundaryFlags & AcceleratedTriangleBoundaryEdge1) != 0u)
                boundaryFlags |= kTriangleFlagBoundaryEdge1;
            if ((sceneTriangle.BoundaryFlags & AcceleratedTriangleBoundaryEdge2) != 0u)
                boundaryFlags |= kTriangleFlagBoundaryEdge2;

            const AcceleratedSceneVertex& vertex0 = SharedGraphicsScene.Vertices[vertexIndex0];
            const AcceleratedSceneVertex& vertex1 = SharedGraphicsScene.Vertices[vertexIndex1];
            const AcceleratedSceneVertex& vertex2 = SharedGraphicsScene.Vertices[vertexIndex2];
            appendTriangle(
                makeTriangleVertex(vertex0, vertex0.X, vertex0.Y),
                makeTriangleVertex(vertex1, vertex1.X, vertex1.Y),
                makeTriangleVertex(vertex2, vertex2.X, vertex2.Y),
                boundaryFlags,
                sceneTriangle.PackedYBounds);
        }

        enqueueGraphicsDraw(Triangles.size() - polygonTriangleBase);
        if (perPolygonTiming) graphicsVertexEmitCpuNs += PerfNowNs() - graphicsVertexEmitStartNs;
    }

    const u64 graphicsStatsStartNs = PerfNowNs();
    LastGraphicsTextureLookupHitCount = textureLookupHitCount;
    LastGraphicsTextureLookupMissCount = textureLookupMissCount;
    LastGraphicsPersistentTextureHitCount = persistentTextureHitCount;
    LastGraphicsPersistentTextureMissCount = persistentTextureMissCount;
    LastGraphicsTexcacheResolveCpuNs = graphicsTexcacheResolveCpuNs;
    if (constantTextureCollapseCount > 0u
        && MelonDSAndroid::areRendererDebugToolsEnabled())
    {
        Log(LogLevel::Warn, "VulkanGraphics[ConstantTextureCollapse]: collapsed=%u", constantTextureCollapseCount);
    }
    LastGraphicsOpaqueDrawCount = static_cast<u32>(GraphicsOpaqueDrawIndices.size());
    LastGraphicsNeedOpaqueDrawCount = static_cast<u32>(GraphicsNeedOpaqueDrawIndices.size());
    LastGraphicsAlphaDrawCount = static_cast<u32>(
        GraphicsAlphaDrawIndices.size() + GraphicsShadowMaskDrawIndices.size() + GraphicsShadowDrawIndices.size());
    LastGraphicsOpaqueWDrawCount = 0;
    LastGraphicsOpaqueZDrawCount = 0;
    LastGraphicsOpaqueTexturedDrawCount = 0;
    LastGraphicsOpaqueUntexturedDrawCount = 0;
    LastGraphicsOpaqueModulateDrawCount = 0;
    LastGraphicsOpaqueDecalDrawCount = 0;
    LastGraphicsOpaqueToonDrawCount = 0;
    LastGraphicsOpaqueHighlightDrawCount = 0;
    LastGraphicsOpaqueLinearDrawCount = 0;
    LastGraphicsOpaqueRepeatDrawCount = 0;
    LastGraphicsOpaqueMirrorDrawCount = 0;
    LastGraphicsOpaqueRepeatSDrawCount = 0;
    LastGraphicsOpaqueRepeatTDrawCount = 0;
    LastGraphicsOpaqueMirrorSDrawCount = 0;
    LastGraphicsOpaqueMirrorTDrawCount = 0;
    LastGraphicsOpaqueClampSDrawCount = 0;
    LastGraphicsOpaqueClampTDrawCount = 0;
    LastGraphicsOpaqueFullAlphaDrawCount = 0;
    LastGraphicsOpaqueHighresRepeatModelDrawCount = 0;
    for (u32 drawIndex : GraphicsOpaqueDrawIndices)
    {
        if (drawIndex >= GraphicsPolygons.size())
            continue;

        const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
        const u32 firstTriangleFlags = draw.firstTriangle < Triangles.size() ? Triangles[draw.firstTriangle].flags : 0u;
        if ((draw.flags & AcceleratedPolygonFlagWBuffer) != 0u)
            LastGraphicsOpaqueWDrawCount++;
        else
            LastGraphicsOpaqueZDrawCount++;

        const bool textured = (firstTriangleFlags & kTriangleFlagTextured) != 0u;
        if (textured)
        {
            LastGraphicsOpaqueTexturedDrawCount++;
            if ((firstTriangleFlags & kTriangleFlagTextureOpaque) != 0u
                && ((draw.polyAttr >> 16u) & 0x1Fu) == 0x1Fu
                && gpu.GPU3D.RenderAlphaRef < 0x1Fu)
            {
                LastGraphicsOpaqueFullAlphaDrawCount++;
            }
            if ((firstTriangleFlags & kTriangleFlagDecal) != 0u)
                LastGraphicsOpaqueDecalDrawCount++;
            else
                LastGraphicsOpaqueModulateDrawCount++;

            const u32 texParam = Triangles[draw.firstTriangle].texParam;
            const u32 textureFormat = (texParam >> 26u) & 0x7u;
            const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
            const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
            const bool color0Transparent = (texParam & (1u << 29u)) != 0u;
            const bool repeatS = (texParam & (1u << 16u)) != 0u;
            const bool repeatT = (texParam & (1u << 17u)) != 0u;
            const bool mirrorS = (texParam & (1u << 18u)) != 0u;
            const bool mirrorT = (texParam & (1u << 19u)) != 0u;
            if (repeatS || repeatT)
                LastGraphicsOpaqueRepeatDrawCount++;
            if (mirrorS || mirrorT)
                LastGraphicsOpaqueMirrorDrawCount++;
            if (repeatS)
                LastGraphicsOpaqueRepeatSDrawCount++;
            else
                LastGraphicsOpaqueClampSDrawCount++;
            if (repeatT)
                LastGraphicsOpaqueRepeatTDrawCount++;
            else
                LastGraphicsOpaqueClampTDrawCount++;
            if (mirrorS)
                LastGraphicsOpaqueMirrorSDrawCount++;
            if (mirrorT)
                LastGraphicsOpaqueMirrorTDrawCount++;
            if ((firstTriangleFlags & kTriangleFlagLinear) != 0u
                && (textureFormat == 4u || textureFormat == 5u)
                && !color0Transparent
                && alpha5 == 31u
                && blendMode == 0u
                && (repeatS || repeatT || mirrorS || mirrorT))
            {
                LastGraphicsOpaqueHighresRepeatModelDrawCount++;
            }
        }
        else
            LastGraphicsOpaqueUntexturedDrawCount++;

        const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
        if (blendMode == 2u)
        {
            if (highlightEnabled)
                LastGraphicsOpaqueHighlightDrawCount++;
            else
                LastGraphicsOpaqueToonDrawCount++;
        }
        if ((firstTriangleFlags & kTriangleFlagLinear) != 0u)
            LastGraphicsOpaqueLinearDrawCount++;
    }

    if (MelonDSAndroid::areRendererDebugBgObjLogsEnabled()
        && SparseOpaqueDetailLogsRemaining > 0u
        && ScaleFactor >= 8
        && LastGraphicsOpaqueDrawCount > 0u
        && LastGraphicsOpaqueDrawCount <= 32u)
    {
        struct SparseOpaqueBounds
        {
            bool valid = false;
            float minX = 0.0f;
            float minY = 0.0f;
            float maxX = 0.0f;
            float maxY = 0.0f;
            u32 clippedLeft = 0;
            u32 clippedTop = 0;
            u32 clippedRight = 0;
            u32 clippedBottom = 0;
            u64 pixels = 0;
        };
        const auto sparseOpaqueBoundsFor = [&](const GraphicsPolygonDraw& draw) -> SparseOpaqueBounds {
            SparseOpaqueBounds bounds{};
            if (draw.triangleCount == 0u || draw.firstTriangle >= Triangles.size())
                return bounds;

            const u32 triangleEnd = std::min<u32>(
                static_cast<u32>(Triangles.size()),
                draw.firstTriangle + draw.triangleCount);
            float minX = std::numeric_limits<float>::max();
            float minY = std::numeric_limits<float>::max();
            float maxX = std::numeric_limits<float>::lowest();
            float maxY = std::numeric_limits<float>::lowest();
            bool hasFiniteBounds = false;
            for (u32 triangleIndex = draw.firstTriangle; triangleIndex < triangleEnd; triangleIndex++)
            {
                const TriangleGpu& tri = Triangles[triangleIndex];
                const float triMinX = std::min({tri.x0, tri.x1, tri.x2});
                const float triMinY = std::min({tri.y0, tri.y1, tri.y2});
                const float triMaxX = std::max({tri.x0, tri.x1, tri.x2});
                const float triMaxY = std::max({tri.y0, tri.y1, tri.y2});
                if (!std::isfinite(triMinX)
                    || !std::isfinite(triMinY)
                    || !std::isfinite(triMaxX)
                    || !std::isfinite(triMaxY))
                {
                    continue;
                }

                minX = hasFiniteBounds ? std::min(minX, triMinX) : triMinX;
                minY = hasFiniteBounds ? std::min(minY, triMinY) : triMinY;
                maxX = hasFiniteBounds ? std::max(maxX, triMaxX) : triMaxX;
                maxY = hasFiniteBounds ? std::max(maxY, triMaxY) : triMaxY;
                hasFiniteBounds = true;
            }
            if (!hasFiniteBounds || maxX <= minX || maxY <= minY)
                return bounds;

            const int32_t left = std::max<int32_t>(0, static_cast<int32_t>(std::floor(minX)));
            const int32_t top = std::max<int32_t>(0, static_cast<int32_t>(std::floor(minY)));
            const int32_t right = std::min<int32_t>(
                static_cast<int32_t>(ColorImageWidth),
                static_cast<int32_t>(std::ceil(maxX)));
            const int32_t bottom = std::min<int32_t>(
                static_cast<int32_t>(ColorImageHeight),
                static_cast<int32_t>(std::ceil(maxY)));
            if (right <= left || bottom <= top)
                return bounds;

            bounds.valid = true;
            bounds.minX = minX;
            bounds.minY = minY;
            bounds.maxX = maxX;
            bounds.maxY = maxY;
            bounds.clippedLeft = static_cast<u32>(left);
            bounds.clippedTop = static_cast<u32>(top);
            bounds.clippedRight = static_cast<u32>(right);
            bounds.clippedBottom = static_cast<u32>(bottom);
            bounds.pixels = static_cast<u64>(bounds.clippedRight - bounds.clippedLeft)
                * static_cast<u64>(bounds.clippedBottom - bounds.clippedTop);
            return bounds;
        };

        u64 sparseOpaqueBboxPixels = 0;
        u32 sparseOpaqueUnionLeft = ColorImageWidth;
        u32 sparseOpaqueUnionTop = ColorImageHeight;
        u32 sparseOpaqueUnionRight = 0;
        u32 sparseOpaqueUnionBottom = 0;
        u32 sparseOpaqueValidBounds = 0;
        for (u32 drawIndex : GraphicsOpaqueDrawIndices)
        {
            if (drawIndex >= GraphicsPolygons.size())
                continue;

            const SparseOpaqueBounds bounds = sparseOpaqueBoundsFor(GraphicsPolygons[drawIndex]);
            if (!bounds.valid)
                continue;

            sparseOpaqueBboxPixels += bounds.pixels;
            sparseOpaqueUnionLeft = std::min(sparseOpaqueUnionLeft, bounds.clippedLeft);
            sparseOpaqueUnionTop = std::min(sparseOpaqueUnionTop, bounds.clippedTop);
            sparseOpaqueUnionRight = std::max(sparseOpaqueUnionRight, bounds.clippedRight);
            sparseOpaqueUnionBottom = std::max(sparseOpaqueUnionBottom, bounds.clippedBottom);
            sparseOpaqueValidBounds++;
        }
        const u64 sparseOpaqueScreenPixels = static_cast<u64>(ColorImageWidth) * static_cast<u64>(ColorImageHeight);
        const u64 sparseOpaqueUnionPixels =
            sparseOpaqueUnionRight > sparseOpaqueUnionLeft && sparseOpaqueUnionBottom > sparseOpaqueUnionTop
                ? static_cast<u64>(sparseOpaqueUnionRight - sparseOpaqueUnionLeft)
                    * static_cast<u64>(sparseOpaqueUnionBottom - sparseOpaqueUnionTop)
                : 0u;
        const float sparseOpaqueCoveragePct = sparseOpaqueScreenPixels > 0u
            ? (static_cast<float>(sparseOpaqueUnionPixels) * 100.0f) / static_cast<float>(sparseOpaqueScreenPixels)
            : 0.0f;
        const float sparseOpaqueOverdrawX = sparseOpaqueUnionPixels > 0u
            ? static_cast<float>(sparseOpaqueBboxPixels) / static_cast<float>(sparseOpaqueUnionPixels)
            : 0.0f;
        Log(
            LogLevel::Warn,
            "VulkanGraphics[SparseOpaqueScene]: scale=%d opaque=%u needOpaque=%u alpha=%u textures=%u triangles=%zu repeat=%u mirror=%u clampT=%u fullAlpha=%u bounds=%u bboxPx=%llu unionPx=%llu coverage=%.1f%% bboxOverUnion=%.2fx union=(%u,%u)..(%u,%u)",
            ScaleFactor,
            LastGraphicsOpaqueDrawCount,
            LastGraphicsNeedOpaqueDrawCount,
            LastGraphicsAlphaDrawCount,
            ActiveTextureDescriptorCount,
            Triangles.size(),
            LastGraphicsOpaqueRepeatDrawCount,
            LastGraphicsOpaqueMirrorDrawCount,
            LastGraphicsOpaqueClampTDrawCount,
            LastGraphicsOpaqueFullAlphaDrawCount,
            sparseOpaqueValidBounds,
            static_cast<unsigned long long>(sparseOpaqueBboxPixels),
            static_cast<unsigned long long>(sparseOpaqueUnionPixels),
            sparseOpaqueCoveragePct,
            sparseOpaqueOverdrawX,
            sparseOpaqueUnionLeft,
            sparseOpaqueUnionTop,
            sparseOpaqueUnionRight,
            sparseOpaqueUnionBottom);
        SparseOpaqueDetailLogsRemaining--;

        for (u32 drawIndex : GraphicsOpaqueDrawIndices)
        {
            if (SparseOpaqueDetailLogsRemaining == 0u || drawIndex >= GraphicsPolygons.size())
                break;

            const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
            const u32 triangleEnd = std::min<u32>(
                static_cast<u32>(Triangles.size()),
                draw.firstTriangle + draw.triangleCount);
            float minX = std::numeric_limits<float>::max();
            float minY = std::numeric_limits<float>::max();
            float maxX = std::numeric_limits<float>::lowest();
            float maxY = std::numeric_limits<float>::lowest();
            float minU = std::numeric_limits<float>::max();
            float minV = std::numeric_limits<float>::max();
            float maxU = std::numeric_limits<float>::lowest();
            float maxV = std::numeric_limits<float>::lowest();
            bool hasBounds = false;
            for (u32 triangleIndex = draw.firstTriangle; triangleIndex < triangleEnd; triangleIndex++)
            {
                const TriangleGpu& tri = Triangles[triangleIndex];
                minX = std::min({minX, tri.x0, tri.x1, tri.x2});
                minY = std::min({minY, tri.y0, tri.y1, tri.y2});
                maxX = std::max({maxX, tri.x0, tri.x1, tri.x2});
                maxY = std::max({maxY, tri.y0, tri.y1, tri.y2});
                minU = std::min({minU, tri.u0, tri.u1, tri.u2});
                minV = std::min({minV, tri.v0, tri.v1, tri.v2});
                maxU = std::max({maxU, tri.u0, tri.u1, tri.u2});
                maxV = std::max({maxV, tri.v0, tri.v1, tri.v2});
                hasBounds = true;
            }

            if (!hasBounds || draw.firstTriangle >= Triangles.size())
                continue;

            const TriangleGpu& tri = Triangles[draw.firstTriangle];
            const SparseOpaqueBounds drawBounds = sparseOpaqueBoundsFor(draw);
            const float drawCoveragePct = sparseOpaqueScreenPixels > 0u
                ? (static_cast<float>(drawBounds.pixels) * 100.0f) / static_cast<float>(sparseOpaqueScreenPixels)
                : 0.0f;
            Log(
                LogLevel::Warn,
                "VulkanGraphics[SparseOpaqueDraw]: draw=%u triBase=%u triCount=%u polyAttr=%#x flags=%#x triFlags=%#x texDesc=%u texLayer=%u texSize=%ux%u texParam=%#x xy=(%.1f,%.1f)..(%.1f,%.1f) clip=(%u,%u)..(%u,%u) pixels=%llu screen=%.1f%% uv=(%.1f,%.1f)..(%.1f,%.1f) yBounds=%#x",
                drawIndex,
                draw.firstTriangle,
                draw.triangleCount,
                draw.polyAttr,
                draw.flags,
                tri.flags,
                tri.texArrayIndex,
                tri.texLayer,
                tri.texWidth,
                tri.texHeight,
                tri.texParam,
                minX,
                minY,
                maxX,
                maxY,
                drawBounds.clippedLeft,
                drawBounds.clippedTop,
                drawBounds.clippedRight,
                drawBounds.clippedBottom,
                static_cast<unsigned long long>(drawBounds.pixels),
                drawCoveragePct,
                minU,
                minV,
                maxU,
                maxV,
                tri.yBounds);
            SparseOpaqueDetailLogsRemaining--;
        }
    }

    if (MelonDSAndroid::areRendererDebugToolsEnabled() && CaptureDebugLogsRemaining > 0u)
    {
        const u32 firstTranslucentDraw = SharedGraphicsScene.FirstTranslucentDraw == std::numeric_limits<u32>::max()
            ? 0xFFFFFFFFu
            : SharedGraphicsScene.FirstTranslucentDraw;
        Log(
            LogLevel::Warn,
            "VulkanGraphics[Scene]: draws=%zu triangles=%zu vertices=%zu indices=%zu firstTranslucent=%u opaque=%u needOpaque=%u alpha=%zu shadowMask=%zu shadow=%zu",
            GraphicsPolygons.size(),
            Triangles.size(),
            SharedGraphicsScene.Vertices.size(),
            SharedGraphicsScene.Indices.size(),
            firstTranslucentDraw,
            LastGraphicsOpaqueDrawCount,
            LastGraphicsNeedOpaqueDrawCount,
            GraphicsAlphaDrawIndices.size(),
            GraphicsShadowMaskDrawIndices.size(),
            GraphicsShadowDrawIndices.size());
        CaptureDebugLogsRemaining--;

        const auto logGraphicsBucket = [&](const char* label, const std::vector<u32>& drawIndices) {
            if (CaptureDebugLogsRemaining == 0u)
                return;

            Log(LogLevel::Warn, "VulkanGraphics[%s]: count=%zu", label, drawIndices.size());
            CaptureDebugLogsRemaining--;

            const size_t maxSampleCount = std::strcmp(label, "AlphaBucket") == 0 ? 24u : 3u;
            const size_t sampleCount = std::min<size_t>(drawIndices.size(), maxSampleCount);
            for (size_t sampleIndex = 0; sampleIndex < sampleCount && CaptureDebugLogsRemaining > 0u; sampleIndex++)
            {
                const u32 drawIndex = drawIndices[sampleIndex];
                if (drawIndex >= GraphicsPolygons.size())
                    continue;

                const GraphicsPolygonDraw& draw = GraphicsPolygons[drawIndex];
                const u32 polyId = (draw.polyAttr >> 24u) & 0x3Fu;
                const u32 alpha5 = (draw.polyAttr >> 16u) & 0x1Fu;
                const u32 blendMode = (draw.polyAttr >> 4u) & 0x3u;
                const u32 yBounds = draw.firstTriangle < Triangles.size()
                    ? Triangles[draw.firstTriangle].yBounds
                    : 0u;
                Log(
                    LogLevel::Warn,
                    "VulkanGraphics[%s]: sample=%zu draw=%u triBase=%u triCount=%u polyId=%u alpha5=%u blend=%u flags=%#x depthEq=%u depthWrite=%u fogWrite=%u y=%u..%u",
                    label,
                    sampleIndex,
                    drawIndex,
                    draw.firstTriangle,
                    draw.triangleCount,
                    polyId,
                    alpha5,
                    blendMode,
                    draw.flags,
                    (draw.flags & AcceleratedPolygonFlagDepthEqual) != 0u ? 1u : 0u,
                    (draw.polyAttr & (1u << 11u)) != 0u ? 1u : 0u,
                    (draw.flags & AcceleratedPolygonFlagFogWrite) != 0u ? 1u : 0u,
                    yBounds & 0xFFFFu,
                    (yBounds >> 16u) & 0xFFFFu);
                CaptureDebugLogsRemaining--;

                if (draw.firstTriangle < Triangles.size() && CaptureDebugLogsRemaining > 0u)
                {
                    const TriangleGpu& tri = Triangles[draw.firstTriangle];
                    Log(
                        LogLevel::Warn,
                        "VulkanGraphics[%sDetail]: draw=%u triFlags=%#x texDesc=%u texLayer=%u texSize=%ux%u texParam=%#x color=%#x,%#x,%#x pos=(%.3f,%.3f)->(%.3f,%.3f)->(%.3f,%.3f) uv=(%.3f,%.3f)->(%.3f,%.3f)->(%.3f,%.3f) w=(%.3f,%.3f,%.3f) yBounds=%#x",
                        label,
                        drawIndex,
                        tri.flags,
                        tri.texArrayIndex,
                        tri.texLayer,
                        tri.texWidth,
                        tri.texHeight,
                        tri.texParam,
                        tri.color0Rgba8,
                        tri.color1Rgba8,
                        tri.color2Rgba8,
                        tri.x0, tri.y0,
                        tri.x1, tri.y1,
                        tri.x2, tri.y2,
                        tri.u0, tri.v0,
                        tri.u1, tri.v1,
                        tri.u2, tri.v2,
                        tri.w0, tri.w1, tri.w2,
                        tri.yBounds);
                    CaptureDebugLogsRemaining--;
                }
            }
        };

        logGraphicsBucket("OpaqueBucket", GraphicsOpaqueDrawIndices);
        logGraphicsBucket("NeedOpaqueBucket", GraphicsNeedOpaqueDrawIndices);
        logGraphicsBucket("AlphaBucket", GraphicsAlphaDrawIndices);
        logGraphicsBucket("ShadowMaskBucket", GraphicsShadowMaskDrawIndices);
        logGraphicsBucket("ShadowBucket", GraphicsShadowDrawIndices);
    }

    static bool loggedGraphicsTriangleSummary = false;
    if (!loggedGraphicsTriangleSummary && !Triangles.empty())
    {
        size_t viewportIntersectingCount = 0u;
        size_t nonDegenerateCount = 0u;
        for (const TriangleGpu& triangle : Triangles)
        {
            const float minX = std::min({triangle.x0, triangle.x1, triangle.x2});
            const float maxX = std::max({triangle.x0, triangle.x1, triangle.x2});
            const float minY = std::min({triangle.y0, triangle.y1, triangle.y2});
            const float maxY = std::max({triangle.y0, triangle.y1, triangle.y2});
            if (maxX > 0.0f && maxY > 0.0f && minX < maxTargetX && minY < maxTargetY)
                viewportIntersectingCount++;

            const float signedArea =
                ((triangle.x1 - triangle.x0) * (triangle.y2 - triangle.y0))
                - ((triangle.y1 - triangle.y0) * (triangle.x2 - triangle.x0));
            if (std::fabs(signedArea) > 0.001f)
                nonDegenerateCount++;
        }

        const TriangleGpu& triangle = Triangles.front();
        const float rawW0 = triangle.w0 > 0.000001f ? (1.0f / triangle.w0) : 0.0f;
        const float rawW1 = triangle.w1 > 0.000001f ? (1.0f / triangle.w1) : 0.0f;
        const float rawW2 = triangle.w2 > 0.000001f ? (1.0f / triangle.w2) : 0.0f;
        Log(
            LogLevel::Warn,
            "VulkanGraphics[Triangles]: scale=%d count=%zu viewportIntersect=%zu nonDegenerate=%zu textures=%u first tri pos=(%.3f,%.3f,%.3f,w=%.3f)->(%.3f,%.3f,%.3f,w=%.3f)->(%.3f,%.3f,%.3f,w=%.3f) flags=%#x texDesc=%u texLayer=%u texSize=%ux%u texParam=%#x polyAttr=%#x yBounds=%#x",
            ScaleFactor,
            Triangles.size(),
            viewportIntersectingCount,
            nonDegenerateCount,
            ActiveTextureDescriptorCount,
            triangle.x0, triangle.y0, triangle.z0, rawW0,
            triangle.x1, triangle.y1, triangle.z1, rawW1,
            triangle.x2, triangle.y2, triangle.z2, rawW2,
            triangle.flags,
            triangle.texArrayIndex,
            triangle.texLayer,
            triangle.texWidth,
            triangle.texHeight,
            triangle.texParam,
            triangle.polyAttr,
            triangle.yBounds);
        if (!GraphicsPolygons.empty())
        {
            const GraphicsPolygonDraw& draw = GraphicsPolygons.front();
            Log(
                LogLevel::Warn,
                "VulkanGraphics[Draws]: polygons=%zu opaque=%u needOpaque=%u alphaShadow=%u shadowMask=%zu shadow=%zu first firstTriangle=%u triangleCount=%u polyAttr=%#x flags=%#x dispCnt=%#x alphaRef=%u",
                GraphicsPolygons.size(),
                LastGraphicsOpaqueDrawCount,
                LastGraphicsNeedOpaqueDrawCount,
                LastGraphicsAlphaDrawCount,
                GraphicsShadowMaskDrawIndices.size(),
                GraphicsShadowDrawIndices.size(),
                draw.firstTriangle,
                draw.triangleCount,
                draw.polyAttr,
                draw.flags,
                gpu.GPU3D.RenderDispCnt,
                gpu.GPU3D.RenderAlphaRef);
        }
        loggedGraphicsTriangleSummary = true;
    }
    GraphicsTextureLookupCpuWindow.Add(graphicsTextureLookupCpuNs);
    GraphicsTexturePersistentCpuWindow.Add(graphicsTexturePersistentCpuNs);
    GraphicsTexcacheResolveCpuWindow.Add(graphicsTexcacheResolveCpuNs);
    GraphicsTextureDescriptorCpuWindow.Add(graphicsTextureDescriptorCpuNs);
    GraphicsTextureSlotCpuWindow.Add(graphicsTextureSlotCpuNs);
    GraphicsConstantTextureCpuWindow.Add(graphicsConstantTextureCpuNs);
    GraphicsVertexEmitCpuWindow.Add(graphicsVertexEmitCpuNs);
    GraphicsStatsCpuWindow.Add(PerfNowNs() - graphicsStatsStartNs);
}

void VulkanRenderer3D::buildTriangleList(GPU& gpu, bool usePreparedGeometry)
{
    Triangles.clear();
    GraphicsVertices.clear();
    GraphicsSceneVertices.clear();
    GraphicsPolygons.clear();
    GraphicsOpaqueDrawIndices.clear();
    GraphicsNeedOpaqueDrawIndices.clear();
    GraphicsAlphaDrawIndices.clear();
    GraphicsShadowMaskDrawIndices.clear();
    GraphicsShadowDrawIndices.clear();
    ActiveTextureDescriptorCount = 0;
    ActiveTextureDescriptors.fill(VkDescriptorImageInfo{});
    ActiveNormalizedTextureDescriptors.fill(VkDescriptorImageInfo{});
    Triangles.reserve(static_cast<size_t>(gpu.GPU3D.RenderNumPolygons) * 3u);
    GraphicsVertices.reserve(static_cast<size_t>(gpu.GPU3D.RenderNumPolygons) * 9u);
    GraphicsPolygons.reserve(static_cast<size_t>(gpu.GPU3D.RenderNumPolygons));
    GraphicsOpaqueDrawIndices.reserve(static_cast<size_t>(gpu.GPU3D.RenderNumPolygons));
    GraphicsNeedOpaqueDrawIndices.reserve(static_cast<size_t>(gpu.GPU3D.RenderNumPolygons));
    GraphicsAlphaDrawIndices.reserve(static_cast<size_t>(gpu.GPU3D.RenderNumPolygons));
    GraphicsShadowMaskDrawIndices.reserve(static_cast<size_t>(gpu.GPU3D.RenderNumPolygons));
    GraphicsShadowDrawIndices.reserve(static_cast<size_t>(gpu.GPU3D.RenderNumPolygons));

    buildGraphicsTriangleList(gpu, usePreparedGeometry);
}

bool VulkanRenderer3D::copyReadyCaptureLineToLineCache()
{
    // compute paths write DS-packed 6A5 values directly, but graphics_hw
    // The ready capture source may belong to the threaded render context that
    // produced the frame. Using the global CaptureLineMapped pointer in
    // graphics_hw can read a different context's stale/zero buffer and causes
    // top/bottom flicker even though the exact export finished correctly.
    const u32* captureSource = ReadyCaptureLineData;

    if (captureSource == nullptr)
    {
        resetCaptureLineState();
        return false;
    }

    if (!captureIdentityMatchesCurrentFrameKey(ReadyCaptureLineIdentity))
    {
        traceFaithfulCaptureDecision(
            "copy", "reject-ready-other-key", ReadyCaptureLineIdentity);
        resetCaptureLineState();
        return false;
    }

    LineCacheIdentity = {};
    if (CaptureLineDataIsRgba8)
    {
        const size_t pixelCount = LineCache.size();
        for (size_t i = 0; i < pixelCount; i++)
        {
            const u32 sourcePixel = captureSource[i];
            const u32 r = sourcePixel & 0xFFu;
            const u32 g = (sourcePixel >> 8u) & 0xFFu;
            const u32 b = (sourcePixel >> 16u) & 0xFFu;
            const u32 a = (sourcePixel >> 24u) & 0xFFu;

            LineCache[i] =
                (r >> 2u)
                | ((g >> 2u) << 8u)
                | ((b >> 2u) << 16u)
                | ((a >> 3u) << 24u);
        }
    }
    else
    {
        std::memcpy(LineCache.data(), captureSource, LineCache.size() * sizeof(u32));
    }

    ExactCaptureLineCachePrepared = true;
    ExactCaptureLineCacheFresh = true;
    ExactCaptureLineCacheFallbackOnly = false;
    {
        LineCacheIdentity = ReadyCaptureLineIdentity;
    }
    CaptureLineReady = false;
    ReadyCaptureLineData = nullptr;
    ReadyCaptureLineBufferSlot = -1;
    ReadyCaptureLineScreenSwap = false;
    CaptureLineDataIsRgba8 = false;
    ReadyCaptureLineIdentity = {};

    ActiveCapturePathMode = CapturePathMode::CaptureLineExport;
    CapturePathModeCounts[static_cast<size_t>(CapturePathMode::CaptureLineExport)]++;
    traceFaithfulCaptureDecision("copy", "accept-current-key", LineCacheIdentity);
    clearRawReadbackState();
    return true;
}

void VulkanRenderer3D::convertReadbackToLineCache()
{
    if (!HasCpuFrame || RawReadbackWidth == 0 || RawReadbackHeight == 0 || RawReadbackRgba.empty())
    {
        clearLineCache();
        return;
    }

    LineCacheIdentity = {};
    const bool readbackIsNativeDs = RawReadbackWidth == 256u && RawReadbackHeight == 192u;

    if (readbackIsNativeDs)
    {
        const size_t pixelCount = 256u * 192u;
        for (size_t i = 0; i < pixelCount; i++)
        {
            const u32 sourcePixel = RawReadbackRgba[i];

            const u32 r = sourcePixel & 0xFF;
            const u32 g = (sourcePixel >> 8) & 0xFF;
            const u32 b = (sourcePixel >> 16) & 0xFF;
            const u32 a = (sourcePixel >> 24) & 0xFF;

            LineCache[i] =
                (r >> 2)
                | ((g >> 2) << 8)
                | ((b >> 2) << 16)
                | ((a >> 3) << 24);
        }

        ExactCaptureLineCachePrepared = false;
        ExactCaptureLineCacheFallbackOnly = false;
        return;
    }

    const u32 sampleScale = static_cast<u32>(std::max(1, ScaleFactor));
    const u32 sampleOffset = sampleScale > 1u ? (sampleScale / 2u) : 0u;
    for (u32 y = 0; y < 192; y++)
    {
        const u32 sourceY = std::min(RawReadbackHeight - 1, y * sampleScale + sampleOffset);
        for (u32 x = 0; x < 256; x++)
        {
            const u32 sourceX = std::min(RawReadbackWidth - 1, x * sampleScale + sampleOffset);
            const u32 sourcePixel = RawReadbackRgba[static_cast<size_t>(sourceY) * static_cast<size_t>(RawReadbackWidth) + sourceX];

            const u32 r = sourcePixel & 0xFF;
            const u32 g = (sourcePixel >> 8) & 0xFF;
            const u32 b = (sourcePixel >> 16) & 0xFF;
            const u32 a = (sourcePixel >> 24) & 0xFF;

            LineCache[static_cast<size_t>(y) * 256u + x] =
                (r >> 2)
                | ((g >> 2) << 8)
                | ((b >> 2) << 16)
                | ((a >> 3) << 24);
        }
    }
    ExactCaptureLineCachePrepared = false;
    ExactCaptureLineCacheFallbackOnly = false;
}

u32 VulkanRenderer3D::buildClearColorRgba8(const GPU& gpu) const
{
    const u32 clearAttr1 = gpu.GPU3D.RenderClearAttr1;

    u32 r = (clearAttr1 << 1) & 0x3E;
    if (r)
        r++;

    u32 g = (clearAttr1 >> 4) & 0x3E;
    if (g)
        g++;

    u32 b = (clearAttr1 >> 9) & 0x3E;
    if (b)
        b++;

    const u32 a = (clearAttr1 >> 16) & 0x1F;

    const u32 r8 = (r << 2) | (r >> 4);
    const u32 g8 = (g << 2) | (g >> 4);
    const u32 b8 = (b << 2) | (b >> 4);
    const u32 a8 = (a << 3) | (a >> 2);

    return r8 | (g8 << 8) | (b8 << 16) | (a8 << 24);
}

void VulkanRenderer3D::clearLineCache()
{
    std::fill(LineCache.begin(), LineCache.end(), 0);
    LineCacheIdentity = {};
    ExactCaptureLineCachePrepared = false;
    ExactCaptureLineCacheFresh = false;
    ExactCaptureLineCacheFallbackOnly = true;
}

void VulkanRenderer3D::WarmTextureCache(GPU& gpu)
{
    const bool enableTextureMaps = gpu.GPU3D.RenderDispCnt & (1 << 0);
    if (!enableTextureMaps)
        return;

    TexcacheVulkanLoader::TextureHandle textureHandle = 0;
    u32 textureLayer = 0;
    u32* helper = nullptr;

    for (u32 i = 0; i < gpu.GPU3D.RenderNumPolygons; i++)
    {
        Polygon* polygon = gpu.GPU3D.RenderPolygonRAM[i];
        if (polygon == nullptr)
            continue;

        if (((polygon->TexParam >> 26) & 0x7) == 0)
            continue;

        Texcache.GetTexture(
            gpu,
            polygon->TexParam,
            polygon->TexPalette,
            textureHandle,
            textureLayer,
            helper
        );
    }
}

}
