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

#pragma once

#include <array>
#include <memory>
#include <string>
#include <unordered_map>
#include <vector>
#include <vulkan/vulkan.h>

#include "GPU3D.h"
#include "VulkanPipelineProfile.h"
#include "GPU3D_AcceleratedFrontend.h"
#include "GPU3D_TexcacheVulkan.h"
#include "VulkanPerfStats.h"

namespace melonDS
{
class GPU;

class VulkanRenderer3D : public Renderer3D
{
public:
    enum class BackendMode : u8
    {
        GraphicsHardware = 1,
    };

    using SubmittedRenderIdentity = CaptureSourceIdentity;

    struct SubmittedRenderSource
    {
        VkImage Image = VK_NULL_HANDLE;
        VkImageView ImageView = VK_NULL_HANDLE;
        u32 Width = 0;
        u32 Height = 0;
        SubmittedRenderIdentity Identity{};
    };

    static std::unique_ptr<VulkanRenderer3D> New() noexcept;

    VulkanRenderer3D() noexcept;
    ~VulkanRenderer3D() override;

    void Reset(GPU& gpu) override;
    void VCount144(GPU& gpu) override;
    void RenderFrame(GPU& gpu) override;
    void RestartFrame(GPU& gpu) override;
    u32* GetLine(int line) override;

    void SetupAccelFrame() override;
    void PrepareCaptureFrame() override;
    void BeginCaptureFrame() override;
    void SetCaptureScreenSwapHint(bool screenSwap, u32 captureCnt, u32 displayCnt) override;
    [[nodiscard]] bool GetLastServedCaptureSourceIdentity(
        CaptureSourceIdentity& outIdentity) const noexcept override;
    [[nodiscard]] bool UsesStructured2DMetadata() const noexcept override { return ActiveBackendMode == BackendMode::GraphicsHardware; }
    void Blit(const GPU& gpu) override;
    void Stop(const GPU& gpu) override;

    void SetRenderSettings(
        bool threaded,
        bool betterPolygons,
        int scale,
        bool useSimplePipeline,
        VulkanPipelineProfile pipelineProfile,
        bool conservativeCoverageEnabled,
        float conservativeCoveragePx,
        float conservativeCoverageDepthBias,
        bool conservativeCoverageApplyRepeat,
        bool conservativeCoverageApplyClamp,
        bool debug3dClearMagenta,
        GPU& gpu) noexcept;

    void SetThreaded(bool threaded, GPU& gpu) noexcept;
    [[nodiscard]] bool IsThreaded() const noexcept;

    [[nodiscard]] int GetScaleFactor() const noexcept { return ScaleFactor; }
    [[nodiscard]] bool UsesBetterPolygons() const noexcept { return BetterPolygons; }
    [[nodiscard]] bool UsesSimplePipeline() const noexcept { return UseSimplePipeline; }
    [[nodiscard]] VulkanPipelineProfile GetVulkanPipelineProfile() const noexcept override
    {
        return PipelineProfile;
    }
    [[nodiscard]] bool IsCoverageFixEnabled() const noexcept { return CoverageFixEnabled; }
    [[nodiscard]] float GetCoverageFixPx() const noexcept { return CoverageFixPx; }
    [[nodiscard]] float GetCoverageFixDepthBias() const noexcept { return CoverageFixDepthBias; }
    [[nodiscard]] bool IsCoverageFixRepeatEnabled() const noexcept { return CoverageFixApplyRepeat; }
    [[nodiscard]] bool IsCoverageFixClampEnabled() const noexcept { return CoverageFixApplyClamp; }
    [[nodiscard]] float GetPassiveCoverageFixRepeatPx() const noexcept { return PassiveCoverageFixRepeatPx; }
    [[nodiscard]] bool IsDebug3dClearMagentaEnabled() const noexcept { return Debug3dClearMagenta; }
    [[nodiscard]] size_t GetAsyncRenderContextCount() const noexcept
    {
        return GetVulkanRenderContextPolicy(PipelineProfile).AsyncRenderContextCount;
    }
    [[nodiscard]] bool WaitsForReadbackSourceOnly() const noexcept { return true; }
    [[nodiscard]] bool GetCurrentRenderScreenSwap() const noexcept { return CurrentRenderScreenSwap; }
    [[nodiscard]] bool WasCurrentFrameCadenceRepeated() const noexcept { return GraphicsCadenceRepeatedCurrentFrame; }
    [[nodiscard]] u32 GetLastSubmittedRenderPolygonCount() const noexcept { return LastSubmittedRenderPolygonCount; }
    [[nodiscard]] bool IsPublishedRenderMetadataValid() const noexcept
    {
        return PublishedGraphicsRenderContext != nullptr && PublishedGraphicsRenderContext->SubmittedMetadataValid;
    }
    [[nodiscard]] u32 GetPublishedRenderPolygonCount() const noexcept
    {
        return PublishedGraphicsRenderContext != nullptr ? PublishedGraphicsRenderContext->SubmittedPolygonCount : 0u;
    }
    [[nodiscard]] bool GetPublishedRenderScreenSwap() const noexcept
    {
        return PublishedGraphicsRenderContext != nullptr && PublishedGraphicsRenderContext->SubmittedScreenSwap;
    }
    [[nodiscard]] bool GetPublishedRenderIdentity(SubmittedRenderIdentity& outIdentity) const noexcept;
    [[nodiscard]] bool GetPinnedCaptureRenderIdentity(SubmittedRenderIdentity& outIdentity) const noexcept;
    [[nodiscard]] bool GetNewestSubmittedRenderForParity(
        bool topScreen,
        VkImage& outImage,
        VkImageView& outImageView,
        u32& outWidth,
        u32& outHeight,
        bool& outZeroPolygons,
        SubmittedRenderIdentity* outIdentity = nullptr) const noexcept;
    [[nodiscard]] bool GetPinnedCaptureRender(
        VkImage& outImage,
        VkImageView& outImageView,
        u32& outWidth,
        u32& outHeight,
        bool& outZeroPolygons,
        SubmittedRenderIdentity* outIdentity = nullptr) const noexcept;
    [[nodiscard]] bool GetSubmittedRenderSourceByIdentity(
        const SubmittedRenderIdentity& expectedIdentity,
        SubmittedRenderSource& outSource) const noexcept;
    [[nodiscard]] bool IsParitySubmitFresh(bool topScreen, u64 maxAge) const noexcept;
    [[nodiscard]] bool IsCurrentCaptureScreenSwapHintValid() const noexcept { return HasCurrentCaptureScreenSwapHint; }
    [[nodiscard]] bool GetCurrentCaptureScreenSwapHint() const noexcept { return CurrentCaptureScreenSwapHint; }
    [[nodiscard]] bool IsLastValidExactCaptureAvailable() const noexcept { return HasLastValidExactCapture; }
    [[nodiscard]] bool GetLastValidExactCaptureScreenSwap() const noexcept { return LastValidExactCaptureScreenSwap; }
    [[nodiscard]] bool IsExactCaptureLineCacheFallbackOnly() const noexcept { return ExactCaptureLineCacheFallbackOnly; }
    [[nodiscard]] bool EnsureVulkanReadyForValidation();
    [[nodiscard]] bool HasColorTarget() const noexcept;
    [[nodiscard]] bool IsColorTargetInitialized() const noexcept;
    [[nodiscard]] VkImage GetColorTargetImage() const noexcept;
    [[nodiscard]] VkImageView GetColorTargetImageView() const noexcept;
    [[nodiscard]] u32 GetColorTargetWidth() const noexcept;
    [[nodiscard]] u32 GetColorTargetHeight() const noexcept;
    [[nodiscard]] u64 RetainPublishedColorTargetForPresentation() noexcept;
    void ReleasePresentationColorTarget(u64 token) noexcept;
    [[nodiscard]] std::vector<u32> CaptureColorTargetForDebug();
    [[nodiscard]] std::vector<u32> CaptureTopDepthForDebug();
    [[nodiscard]] std::vector<u32> CaptureTopAttrForDebug();
    [[nodiscard]] std::vector<u32> CaptureTopCoverageForDebug();
    void requestPostFastForwardDrain();
    void SetBackendMode(BackendMode mode) noexcept;
    void InvalidatePresentationState(bool discardColorTarget) noexcept;
    [[nodiscard]] BackendMode GetRequestedBackendMode() const noexcept { return RequestedBackendMode; }
    [[nodiscard]] BackendMode GetResolvedRequestedBackendMode() const noexcept { return resolveRequestedBackendMode(); }
    [[nodiscard]] BackendMode GetActiveBackendMode() const noexcept { return ActiveBackendMode; }
    [[nodiscard]] static const char* backendModeName(BackendMode mode) noexcept;

private:
    class IVulkan3DBackend;
    class CompatibilityGraphicsBackend;
    class FastPathGraphicsBackend;

    static constexpr u32 TextureDescriptorStorageCapacity = 256;
    static_assert(
        TextureDescriptorStorageCapacity
        >= GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::FastPath).TextureDescriptorCount);
    static constexpr u32 ToonTableEntryCount = 32;

    enum class RasterDispatchPath : u8
    {
        DirectTiles = 0,
        LegacyWorklist = 1,
    };

    enum class RasterExecutionProfile : u8
    {
        AdrenoCpuDense = 0,
        AdrenoCpuSparse = 1,
        MaliDenseScan = 2,
        MaliCpuDense = 3,
        GeneralNonUniform = 4,
        LegacyFallback = 5,
        Count = 6,
    };

    enum class RasterSceneMode : u8
    {
        DenseNoBoundary = 0,
        DenseBoundary = 1,
        SparseActive = 2,
        Count = 3,
    };

    enum class RasterTileLoopMode : u8
    {
        DenseGroupList = 0,
        SparseActive = 1,
        LegacyWorklist = 2,
        Count = 3,
    };

    enum class TextureSamplingPath : u8
    {
        BaseSingleDescriptor = 0,
        CompatDynamicUniform = 1,
        NonUniform = 2,
    };

    enum class CapturePathMode : u8
    {
        Disabled = 0,
        CaptureLineExport = 1,
        FallbackReadback = 2,
        Count = 3,
    };

    struct DescriptorSetCache
    {
        bool Ready = false;
        VkImageView ColorImageView = VK_NULL_HANDLE;
        VkBuffer TriangleBuffer = VK_NULL_HANDLE;
        VkImageView FallbackTextureView = VK_NULL_HANDLE;
        VkSampler FallbackTextureSampler = VK_NULL_HANDLE;
        VkBuffer ResultBuffer = VK_NULL_HANDLE;
        VkBuffer BinMaskBuffer = VK_NULL_HANDLE;
        VkBuffer GroupListBuffer = VK_NULL_HANDLE;
        VkBuffer ToonBuffer = VK_NULL_HANDLE;
        VkBuffer SpanSetupBuffer = VK_NULL_HANDLE;
        VkBuffer WorkOffsetBuffer = VK_NULL_HANDLE;
        VkBuffer CaptureLineBuffer = VK_NULL_HANDLE;
        std::array<VkDescriptorImageInfo, TextureDescriptorStorageCapacity> TextureInfos{};
    };

    struct GraphicsDescriptorSetCache
    {
        bool Ready = false;
        VkBuffer TriangleBuffer = VK_NULL_HANDLE;
        VkBuffer ToonBuffer = VK_NULL_HANDLE;
        VkBuffer ClearBuffer = VK_NULL_HANDLE;
        VkImageView AttrImageView = VK_NULL_HANDLE;
        VkImageView DepthImageView = VK_NULL_HANDLE;
        VkSampler AttachmentSampler = VK_NULL_HANDLE;
        std::array<VkDescriptorImageInfo, TextureDescriptorStorageCapacity> TextureInfos{};
        std::array<VkDescriptorImageInfo, TextureDescriptorStorageCapacity> NormalizedTextureInfos{};
    };

    struct GraphicsRenderTarget
    {
        VkImage RasterColorImage = VK_NULL_HANDLE;
        VkDeviceMemory RasterColorImageMemory = VK_NULL_HANDLE;
        VkImageView RasterColorImageView = VK_NULL_HANDLE;
        VkImage ColorImage = VK_NULL_HANDLE;
        VkDeviceMemory ColorImageMemory = VK_NULL_HANDLE;
        VkImageView ColorImageView = VK_NULL_HANDLE;
        VkImage AttrImage = VK_NULL_HANDLE;
        VkDeviceMemory AttrImageMemory = VK_NULL_HANDLE;
        VkImageView AttrImageView = VK_NULL_HANDLE;
        VkImage DepthStencilImage = VK_NULL_HANDLE;
        VkDeviceMemory DepthStencilImageMemory = VK_NULL_HANDLE;
        VkImageView DepthStencilImageView = VK_NULL_HANDLE;
        VkImageView DepthStencilDepthImageView = VK_NULL_HANDLE;
        VkFramebuffer RasterFramebuffer = VK_NULL_HANDLE;
        VkFramebuffer RasterLoadFramebuffer = VK_NULL_HANDLE;
        VkFramebuffer ColorOnlyFramebuffer = VK_NULL_HANDLE;
        VkFramebuffer FinalFramebuffer = VK_NULL_HANDLE;
        u32 Width = 0;
        u32 Height = 0;
        bool Initialized = false;
    };

    struct GraphicsResolvedTextureCacheEntry
    {
        TexcacheVulkanLoader::TextureHandle Handle = 0;
        u32 Layer = 0;
        VkDescriptorImageInfo DescriptorInfo{};
        VkDescriptorImageInfo NormalizedDescriptorInfo{};
        bool FallbackUsed = false;
        bool LayerOpaque = false;
        u32 Width = 0;
        u32 Height = 0;
    };

    struct RenderContext
    {
        VkCommandPool CommandPool = VK_NULL_HANDLE;
        VkCommandBuffer CommandBuffer = VK_NULL_HANDLE;
        VkFence FrameFence = VK_NULL_HANDLE;
        VkDescriptorSet DescriptorSet = VK_NULL_HANDLE;
        VkDescriptorSet GraphicsDescriptorSet = VK_NULL_HANDLE;
        std::array<VkDescriptorSet, TextureDescriptorStorageCapacity> SingleTextureDescriptorSets{};
        VkBuffer TriangleBuffer = VK_NULL_HANDLE;
        VkDeviceMemory TriangleMemory = VK_NULL_HANDLE;
        VkDeviceSize TriangleBufferSize = 0;
        void* TriangleMapped = nullptr;
        VkBuffer GraphicsVertexBuffer = VK_NULL_HANDLE;
        VkDeviceMemory GraphicsVertexMemory = VK_NULL_HANDLE;
        VkDeviceSize GraphicsVertexBufferSize = 0;
        void* GraphicsVertexMapped = nullptr;
        VkBuffer BinMaskBuffer = VK_NULL_HANDLE;
        VkDeviceMemory BinMaskMemory = VK_NULL_HANDLE;
        VkDeviceSize BinMaskBufferSize = 0;
        void* BinMaskMapped = nullptr;
        VkBuffer GroupListBuffer = VK_NULL_HANDLE;
        VkDeviceMemory GroupListMemory = VK_NULL_HANDLE;
        VkDeviceSize GroupListBufferSize = 0;
        void* GroupListMapped = nullptr;
        VkBuffer SpanSetupBuffer = VK_NULL_HANDLE;
        VkDeviceMemory SpanSetupMemory = VK_NULL_HANDLE;
        VkDeviceSize SpanSetupBufferSize = 0;
        void* SpanSetupMapped = nullptr;
        VkBuffer WorkOffsetBuffer = VK_NULL_HANDLE;
        VkDeviceMemory WorkOffsetMemory = VK_NULL_HANDLE;
        VkDeviceSize WorkOffsetBufferSize = 0;
        void* WorkOffsetMapped = nullptr;
        VkBuffer ToonBuffer = VK_NULL_HANDLE;
        VkDeviceMemory ToonMemory = VK_NULL_HANDLE;
        VkDeviceSize ToonBufferSize = 0;
        void* ToonMapped = nullptr;
        VkBuffer ClearBuffer = VK_NULL_HANDLE;
        VkDeviceMemory ClearMemory = VK_NULL_HANDLE;
        VkDeviceSize ClearBufferSize = 0;
        void* ClearMapped = nullptr;
        VkBuffer CaptureLineBuffer = VK_NULL_HANDLE;
        VkDeviceMemory CaptureLineMemory = VK_NULL_HANDLE;
        VkDeviceSize CaptureLineBufferSize = 0;
        void* CaptureLineMapped = nullptr;
        VkQueryPool TimestampQueryPool = VK_NULL_HANDLE;
        bool TimestampPending = false;
        DescriptorSetCache DescriptorCache{};
        std::array<DescriptorSetCache, TextureDescriptorStorageCapacity> SingleTextureDescriptorCaches{};
        GraphicsDescriptorSetCache GraphicsDescriptorCache{};
        GraphicsRenderTarget GraphicsTarget{};
        u32 PresentationRetainCount = 0;
        u32 SubmittedPolygonCount = 0;
        u32 SubmittedCaptureCnt = 0;
        u64 SubmitSequence = 0;
        bool SubmittedScreenSwap = false;
        bool SubmittedMetadataValid = false;
    };

    struct RasterPushConstants
    {
        u32 width;
        u32 height;
        u32 clearColor;
        u32 clearDepth;
        u32 triangleCount;
        u32 dispCnt;
        u32 alphaRef;
        u32 fogColor;
        u32 fogOffset;
        u32 fogShift;
        u32 clearAttr;
        u32 fogDensityPacked[9];
        u32 edgeColorPacked[8];
        u32 variantKey;
        u32 passIndex;
        u32 triangleBase;
        u32 depthBlendMode;
    };
    static_assert(sizeof(RasterPushConstants) == 128u, "RasterPushConstants must fit maxPushConstantsSize=128");

    struct TriangleGpu
    {
        float x0;
        float y0;
        float z0;
        float w0;
        float x1;
        float y1;
        float z1;
        float w1;
        float x2;
        float y2;
        float z2;
        float w2;
        float u0;
        float v0;
        float u1;
        float v1;
        float u2;
        float v2;
        u32 yBounds;
        u32 texLayer;
        u32 color0Rgba8;
        u32 color1Rgba8;
        u32 color2Rgba8;
        u32 flags;
        u32 texArrayIndex;
        u32 texWidth;
        u32 texHeight;
        u32 texParam;
        u32 polyAttr;
        u32 variantKey;
    };

    struct GraphicsVertexGpu
    {
        float x;
        float y;
        float z;
        float reciprocalW;
        float u;
        float v;
        u32 colorRgba8;
        u32 flags;
        u32 texLayer;
        u32 texArrayIndex;
        u32 texWidth;
        u32 texHeight;
        u32 texParam;
        u32 polyAttr;
    };

    struct SpanSetupGpu
    {
        float minX;
        float minY;
        float maxX;
        float maxY;
        u32 yMin;
        u32 yMax;
        u32 variantKey;
        u32 valid;
        float edgeInv0;
        float edgeInv1;
        float edgeInv2;
    };

    struct GraphicsPolygonDraw
    {
        u32 firstTriangle = 0;
        u32 triangleCount = 0;
        u32 polyAttr = 0;
        u32 flags = 0;
        u32 firstVertex = 0;
        u32 vertexCount = 0;
        u32 firstEdgeIndex = 0;
        u32 edgeIndexCount = 0;
        u32 edgeColorOverrideMask = 0;
        u32 edgeColorOverridePacked = 0;
    };

    bool ensureInitialized();
    void destroyVulkan();

    bool createCommandObjects();
    bool createCommandObjects(VkCommandPool& commandPool, VkCommandBuffer& commandBuffer);
    bool createSyncObjects();
    bool createFence(VkFence& fence);
    bool createTimestampQueryPool(VkQueryPool& queryPool);
    bool createDescriptorObjects();
    bool createGraphicsDescriptorObjects();
    bool createComputePipeline();
    bool createGraphicsPipelines();
    bool createPipelineCache(TextureSamplingPath samplingPath);
    void savePipelineCache();
    std::string buildPipelineCacheFileName(TextureSamplingPath samplingPath) const;
    bool selectGraphicsRasterColorFormat();

    bool ensureRenderTarget(u32 width, u32 height);
    void destroyRenderTarget();
    bool ensureGraphicsRenderTarget(GraphicsRenderTarget& target, u32 width, u32 height);
    void destroyGraphicsRenderTarget(GraphicsRenderTarget& target);
    [[nodiscard]] const GraphicsRenderTarget* getPublishedGraphicsRenderTarget() const noexcept;
    [[nodiscard]] GraphicsRenderTarget* getContextGraphicsRenderTarget(RenderContext* context) noexcept;
    [[nodiscard]] CaptureSourceIdentity captureSourceIdentityForContext(
        const RenderContext* context) const noexcept;
    bool ensureTriangleBuffer(RenderContext* context, size_t triangleCount);
    void destroyTriangleBuffer(RenderContext* context);
    bool ensureGraphicsVertexBuffer(RenderContext* context, size_t vertexCount);
    void destroyGraphicsVertexBuffer(RenderContext* context);
    bool ensureGraphicsSceneVertexBuffer(size_t vertexCount);
    void destroyGraphicsSceneVertexBuffer();
    bool ensureGraphicsEdgeIndexBuffer(size_t indexCount);
    void destroyGraphicsEdgeIndexBuffer();
    bool ensureCpuSpanSetupBuffer(RenderContext& context, size_t triangleCount);
    void destroyCpuSpanSetupBuffer(RenderContext& context);
    bool ensureCpuBinBuffers(RenderContext& context, size_t triangleCount, u32 width, u32 height);
    void destroyCpuBinBuffers(RenderContext& context);
    bool ensureCpuWorkOffsetBuffer(RenderContext& context, u32 width, u32 height, size_t triangleCount);
    void destroyCpuWorkOffsetBuffer(RenderContext& context);
    bool ensureResultBuffer(u32 width, u32 height);
    void destroyResultBuffer();
    bool ensureBinMaskBuffer(size_t triangleCount, u32 width, u32 height);
    void destroyBinMaskBuffer();
    bool ensureGroupListBuffer(size_t triangleCount, u32 width, u32 height);
    void destroyGroupListBuffer();
    bool ensureSpanSetupBuffer(size_t triangleCount);
    void destroySpanSetupBuffer();
    bool ensureWorkOffsetBuffer(u32 width, u32 height, size_t triangleCount);
    void destroyWorkOffsetBuffer();
    bool ensureToonBuffer(RenderContext* context);
    void destroyToonBuffer(RenderContext* context);
    bool updateToonBuffer(RenderContext* context, const u16* toonTable);
    bool ensureGraphicsClearBuffer(RenderContext* context);
    void destroyGraphicsClearBuffer(RenderContext* context);
    bool updateGraphicsClearBuffer(RenderContext* context, const GPU& gpu);
    bool ensureCaptureLineBuffer(RenderContext* context);
    void destroyCaptureLineBuffer(RenderContext* context);
    void destroyAllCaptureLineBuffers();
    void resetCaptureLineState();
    void selectActiveCaptureLineBufferSlot(u32 slot);
    void syncActiveCaptureLineBufferSlot();
    void storeActiveCaptureLineBufferSlot();
    void clearRawReadbackState();
    bool finalizeCaptureLineFrame(bool blocking = true);
    bool finalizeCaptureReadback(bool blocking = true);
    bool createFallbackTexture();
    void destroyFallbackTexture();

    bool createReadbackBuffer(u32 width, u32 height);
    void destroyReadbackBuffer();
    bool ensureCaptureReadbackImage();
    void destroyCaptureReadbackImage();
    bool createResultReadbackBuffer();
    void destroyResultReadbackBuffer();
    bool readbackGraphicsAttrImageToCpu(std::vector<u32>& outAttrPixels);
    bool readbackGraphicsDepthImageToCpu(std::vector<u32>& outDepthPixels);

    void updateDescriptorSet(RenderContext* context);
    void updateDescriptorSet(RenderContext* context, u32 singleTextureDescriptorIndex);
    bool updateCaptureExportDescriptorSet(RenderContext* context);
    void updateGraphicsDescriptorSet(RenderContext* context);
    static bool descriptorImageInfoEquals(const VkDescriptorImageInfo& lhs, const VkDescriptorImageInfo& rhs);
    VkDescriptorSet getDescriptorSet(RenderContext* context, u32 singleTextureDescriptorIndex) const;
    DescriptorSetCache& getDescriptorSetCache(RenderContext* context, u32 singleTextureDescriptorIndex);
    GraphicsDescriptorSetCache& getGraphicsDescriptorSetCache(RenderContext* context);
    void invalidateDescriptorSetCache(RenderContext* context);
    void invalidateAllDescriptorSetCaches();
    void invalidateGraphicsDescriptorSetCache(RenderContext* context);
    void invalidateAllGraphicsDescriptorSetCaches();
    [[nodiscard]] bool usesSingleDescriptorTexturePath() const noexcept;
    [[nodiscard]] VulkanTextureDescriptorPolicy getTextureDescriptorPolicy() const noexcept;
    [[nodiscard]] u32 getTextureBindingDescriptorCount() const noexcept;
    [[nodiscard]] bool getGraphicsTextureDescriptors(
        TexcacheVulkanLoader::TextureHandle textureHandle,
        VkDescriptorImageInfo* textureDescriptorInfo,
        VkDescriptorImageInfo* normalizedTextureDescriptorInfo) const;
    [[nodiscard]] TextureSamplingPath resolveTextureSamplingPath() const noexcept;
    [[nodiscard]] static const char* textureSamplingPathName(TextureSamplingPath path) noexcept;
    [[nodiscard]] BackendMode resolveRequestedBackendMode() const noexcept;
    void refreshActiveBackendMode() noexcept;
    [[nodiscard]] static const char* rasterExecutionProfileName(RasterExecutionProfile profile) noexcept;
    [[nodiscard]] static const char* rasterSceneModeName(RasterSceneMode mode) noexcept;
    [[nodiscard]] static const char* rasterTileLoopModeName(RasterTileLoopMode mode) noexcept;
    [[nodiscard]] static const char* capturePathModeName(CapturePathMode mode) noexcept;
    u32 findMemoryType(u32 typeBits, VkMemoryPropertyFlags properties) const;
    bool tryAcquireRenderContext(RenderContext& context, bool countMisses = true);
    bool waitForRenderContext(RenderContext& context);
    RenderContext* tryAcquireReadyRenderContext() noexcept;
    bool waitForAllRenderContexts();
    bool waitForReadbackSource();
    bool waitForTextureCacheMutationSafePoint();
    bool waitForDeviceIdle(const char* reason);
    RenderContext& acquireNextRenderContext() noexcept;
    [[nodiscard]] bool isNewestOfItsParity(const RenderContext& context) const noexcept;
    void consumeGpuTiming(RenderContext* context);
    void logPerformanceIfNeeded();
    bool useCpuTileBinning() const noexcept;
    bool prepareCpuTileBins(RenderContext& context, const RasterPushConstants& pushConstants);

    void WarmTextureCache(GPU& gpu);
    void buildGraphicsTriangleListCompatibility(GPU& gpu);
    void buildGraphicsTriangleList(GPU& gpu);
    void buildTriangleList(GPU& gpu);

    bool selectGraphicsDepthStencilFormat();
    bool dispatchRasterAndReadback(
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
        bool readbackToCpu,
        bool captureReadbackPath = false);
    bool dispatchGraphicsRasterAndReadback(
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
        bool readbackToCpu,
        bool captureReadbackPath = false);
    bool submitGraphicsCaptureExportForCurrentFrame();
    bool readbackColorTargetToCpu(bool capturePath = false);
    bool readbackResultBufferToCpu();
    bool copyReadyCaptureLineToLineCache();
    [[nodiscard]] bool lineCacheHasUsefulColor(u32 minPixels) const noexcept;
    bool restoreLastValidExactCaptureToLineCache();
    void convertReadbackToLineCache();
    void fillLineCacheWithCaptureFallbackColor();
    u32 buildClearColorRgba8(const GPU& gpu) const;
    void clearLineCache();
    void ResetActiveBackend(GPU& gpu);
    void VCount144ActiveBackend(GPU& gpu);
    void VCount144CompatibilityBackend(GPU& gpu);
    void RenderFrameActiveBackend(GPU& gpu);
    void RenderFrameCompatibilityBackend(GPU& gpu);
    void RestartFrameActiveBackend(GPU& gpu);
    u32* GetLineActiveBackend(int line);
    u32* GetLineCompatibilityBackend(int line);
    void SetupAccelFrameActiveBackend();
    void PrepareCaptureFrameActiveBackend();
    void PrepareCaptureFrameCompatibilityBackend();
    void BeginCaptureFrameActiveBackend();
    void BlitActiveBackend(const GPU& gpu);
    void BlitCompatibilityBackend(const GPU& gpu);
    void StopActiveBackend(const GPU& gpu);
    IVulkan3DBackend& activeBackend() noexcept;
    void activateBackendMode(BackendMode mode) noexcept;

private:
    TexcacheVulkan Texcache;

    int ScaleFactor = 1;
    bool BetterPolygons = true;
    bool CoverageFixEnabled = false;
    float CoverageFixPx = 0.0f;
    float CoverageFixDepthBias = 0.0f;
    bool CoverageFixApplyRepeat = true;
    bool CoverageFixApplyClamp = false;
    float PassiveCoverageFixRepeatPx = 0.2f;
    bool Debug3dClearMagenta = false;
    bool Threaded = false;

    bool Initialized = false;
    bool InitFailed = false;
    bool HasCpuFrame = false;
    bool FrameIdentical = false;
    bool ContextAcquired = false;
    u32 LastSubmittedRenderPolygonCount = 0;
    u32 PendingSubmitPolygonCount = 0;
    u32 PendingSubmitCaptureCnt = 0;
    u64 GraphicsSubmitSequence = 0;

    VkInstance Instance = VK_NULL_HANDLE;
    VkPhysicalDevice PhysicalDevice = VK_NULL_HANDLE;
    VkDevice Device = VK_NULL_HANDLE;
    VkQueue Queue = VK_NULL_HANDLE;
    u32 QueueFamilyIndex = 0;

    VkCommandPool CommandPool = VK_NULL_HANDLE;
    VkCommandBuffer CommandBuffer = VK_NULL_HANDLE;
    VkFence FrameFence = VK_NULL_HANDLE;
    VkQueryPool TimestampQueryPool = VK_NULL_HANDLE;
    bool TimestampPending = false;

    VkDescriptorSetLayout DescriptorSetLayout = VK_NULL_HANDLE;
    VkDescriptorPool DescriptorPool = VK_NULL_HANDLE;
    VkDescriptorSet DescriptorSet = VK_NULL_HANDLE;
    std::array<VkDescriptorSet, TextureDescriptorStorageCapacity> SingleTextureDescriptorSets{};
    DescriptorSetCache DescriptorCache{};
    std::array<DescriptorSetCache, TextureDescriptorStorageCapacity> SingleTextureDescriptorCaches{};
    VkDescriptorSetLayout GraphicsDescriptorSetLayout = VK_NULL_HANDLE;
    VkDescriptorPool GraphicsDescriptorPool = VK_NULL_HANDLE;
    VkDescriptorSet GraphicsDescriptorSet = VK_NULL_HANDLE;
    GraphicsDescriptorSetCache GraphicsDescriptorCache{};
    TextureSamplingPath ActiveTextureSamplingPath = TextureSamplingPath::CompatDynamicUniform;
    BackendMode RequestedBackendMode = BackendMode::GraphicsHardware;
    BackendMode ActiveBackendMode = BackendMode::GraphicsHardware;
    bool UseSimplePipeline = true;
    VulkanPipelineProfile PipelineProfile =
        VulkanPipelineProfile::Compatibility;
    std::unique_ptr<IVulkan3DBackend> CompatibilityGraphicsBackendInstance;
    std::unique_ptr<IVulkan3DBackend> FastPathGraphicsBackendInstance;
    RasterExecutionProfile ActiveRasterExecutionProfile = RasterExecutionProfile::LegacyFallback;
    RasterTileLoopMode ActiveRasterTileLoopMode = RasterTileLoopMode::DenseGroupList;
    CapturePathMode ActiveCapturePathMode = CapturePathMode::Disabled;
    VkPipelineLayout PipelineLayout = VK_NULL_HANDLE;
    VkPipelineLayout GraphicsPipelineLayout = VK_NULL_HANDLE;
    VkPipelineCache ComputePipelineCache = VK_NULL_HANDLE;
    std::string ComputePipelineCacheFile;
    VkPipeline InterpPipeline = VK_NULL_HANDLE;
    VkPipeline BinPipeline = VK_NULL_HANDLE;
    VkPipeline WorkOffsetsPipeline = VK_NULL_HANDLE;
    VkPipeline SortPipeline = VK_NULL_HANDLE;
    VkPipeline DepthBlendPipeline = VK_NULL_HANDLE;
    static constexpr u32 RasterSceneModeCount = static_cast<u32>(RasterSceneMode::Count);
    static constexpr u32 RasterWModeCount = 3;
    static constexpr u32 RasterShadeModeCount = 6;
    static constexpr u32 RasterTextureModeCount = 3;
    static constexpr u32 RasterTranslucencyModeCount = 3;
    static constexpr u32 RasterPipelineVariantCount =
        RasterSceneModeCount * RasterWModeCount * RasterShadeModeCount * RasterTextureModeCount * RasterTranslucencyModeCount;
    std::array<VkPipeline, RasterPipelineVariantCount> RasterPipelines{};
    static constexpr u32 FinalPipelineVariantCount = 8;
    std::array<VkPipeline, FinalPipelineVariantCount> FinalPipelines{};
    VkPipeline CaptureLineExportPipeline = VK_NULL_HANDLE;
    static constexpr u32 GraphicsWModeCount = 2;
    static constexpr u32 GraphicsDepthCompareModeCount = 2;
    static constexpr u32 GraphicsDepthWriteModeCount = 2;
    static constexpr u32 GraphicsFogWriteModeCount = 2;
    static constexpr u32 GraphicsAlphaBlendModeCount = 2;
    static constexpr u32 GraphicsOpaquePipelineCount = GraphicsWModeCount * GraphicsDepthCompareModeCount;
    static constexpr u32 GraphicsTranslucentPipelineCount =
        GraphicsWModeCount * GraphicsDepthCompareModeCount * GraphicsDepthWriteModeCount * GraphicsFogWriteModeCount * GraphicsAlphaBlendModeCount;
    static constexpr u32 GraphicsBgZeroTranslucentPipelineCount =
        GraphicsWModeCount * GraphicsDepthCompareModeCount * GraphicsDepthWriteModeCount * GraphicsFogWriteModeCount;
    static constexpr u32 GraphicsShadowMaskPipelineCount = GraphicsWModeCount;
    static constexpr u32 GraphicsShadowMaskBgZeroPipelineCount = GraphicsWModeCount;
    static constexpr u32 GraphicsShadowClearPipelineCount = GraphicsWModeCount * GraphicsDepthCompareModeCount;
    static constexpr u32 GraphicsShadowBlendBgZeroPipelineCount =
        GraphicsWModeCount * GraphicsDepthCompareModeCount * GraphicsDepthWriteModeCount * GraphicsFogWriteModeCount * GraphicsAlphaBlendModeCount;
    static constexpr u32 GraphicsShadowBlendPipelineCount =
        GraphicsWModeCount * GraphicsDepthCompareModeCount * GraphicsDepthWriteModeCount * GraphicsFogWriteModeCount * GraphicsAlphaBlendModeCount;
    static constexpr u32 GraphicsEdgeMarkPipelineCount = GraphicsWModeCount;
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaquePipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueOcclusionNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFragmentDepthPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainFragmentDepthPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFragmentDepthPrepassPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueAlphaFragmentDepthPrepassPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueStencilResolvePipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulatePipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOcclusionNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateToonPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateToonNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateToonOcclusionNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulatePlainPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulatePlainNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulatePlainOcclusionNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaToonPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaToonNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaToonOcclusionNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainNoDepthNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainColorOnlyPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainOcclusionNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainNoDepthOcclusionNoAttrPipelines{};
    std::array<VkPipeline, GraphicsTranslucentPipelineCount> GraphicsTranslucentPipelines{};
    std::array<VkPipeline, GraphicsBgZeroTranslucentPipelineCount> GraphicsBgZeroTranslucentPipelines{};
    std::array<VkPipeline, GraphicsShadowMaskPipelineCount> GraphicsShadowMaskPipelines{};
    std::array<VkPipeline, GraphicsShadowMaskBgZeroPipelineCount> GraphicsShadowMaskBgZeroPipelines{};
    std::array<VkPipeline, GraphicsShadowClearPipelineCount> GraphicsShadowClearPipelines{};
    std::array<VkPipeline, GraphicsShadowBlendBgZeroPipelineCount> GraphicsShadowBlendBgZeroPipelines{};
    std::array<VkPipeline, GraphicsShadowBlendPipelineCount> GraphicsShadowBlendPipelines{};
    std::array<VkPipeline, GraphicsEdgeMarkPipelineCount> GraphicsEdgeMarkPipelines{};
    std::array<VkPipeline, GraphicsWModeCount> GraphicsOpaqueUiOverlayPipelines{};
    VkPipeline GraphicsClearPipeline = VK_NULL_HANDLE;
    VkPipeline GraphicsStencilBitClearPipeline = VK_NULL_HANDLE;
    std::array<VkPipeline, GraphicsWModeCount> GraphicsShadowMaskDepthComplementPipelines{};
    VkPipeline GraphicsFinalEdgePipeline = VK_NULL_HANDLE;
    VkPipeline GraphicsFinalEdgeFogPipeline = VK_NULL_HANDLE;
    VkPipeline GraphicsFinalFogPipeline = VK_NULL_HANDLE;
    VkRenderPass GraphicsRasterRenderPass = VK_NULL_HANDLE;
    VkRenderPass GraphicsRasterLoadRenderPass = VK_NULL_HANDLE;
    VkRenderPass GraphicsColorOnlyRenderPass = VK_NULL_HANDLE;
    VkRenderPass GraphicsFinalRenderPass = VK_NULL_HANDLE;
    VkFramebuffer GraphicsRasterFramebuffer = VK_NULL_HANDLE;
    VkFramebuffer GraphicsRasterLoadFramebuffer = VK_NULL_HANDLE;
    VkFramebuffer GraphicsColorOnlyFramebuffer = VK_NULL_HANDLE;
    VkFramebuffer GraphicsFinalFramebuffer = VK_NULL_HANDLE;
    VkSampler GraphicsAttachmentSampler = VK_NULL_HANDLE;
    VkFormat GraphicsDepthStencilFormat = VK_FORMAT_UNDEFINED;
    VkFormat GraphicsRasterColorFormat = VK_FORMAT_R8G8B8A8_UNORM;
    bool GraphicsReady = false;
    static constexpr u32 ResultLayerCount = 8;
    static constexpr size_t MaxAsyncRenderContextCount =
        GetVulkanRenderContextPolicy(VulkanPipelineProfile::FastPath).AsyncRenderContextCount;
    static constexpr u32 TimestampQueryCount = 9;
    std::array<RenderContext, MaxAsyncRenderContextCount> RenderContexts{};

    template <typename ContextType>
    struct RenderContextPrefix
    {
        ContextType* Data;
        size_t Size;

        [[nodiscard]] ContextType* begin() const noexcept { return Data; }
        [[nodiscard]] ContextType* end() const noexcept { return Data + Size; }
    };

    [[nodiscard]] RenderContextPrefix<RenderContext> activeRenderContexts() noexcept
    {
        return {RenderContexts.data(), GetAsyncRenderContextCount()};
    }

    [[nodiscard]] RenderContextPrefix<const RenderContext> activeRenderContexts() const noexcept
    {
        return {RenderContexts.data(), GetAsyncRenderContextCount()};
    }

    static_assert(
        GetVulkanRenderContextPolicy(VulkanPipelineProfile::Compatibility).AsyncRenderContextCount > 0u);
    static_assert(
        GetVulkanRenderContextPolicy(VulkanPipelineProfile::Compatibility).AsyncRenderContextCount
        <= MaxAsyncRenderContextCount);
    static_assert(
        GetVulkanRenderContextPolicy(VulkanPipelineProfile::FastPath).AsyncRenderContextCount
        <= MaxAsyncRenderContextCount);
    size_t NextRenderContextIndex = 0;
    RenderContext* LastSubmittedRenderContext = nullptr;
    RenderContext* PublishedGraphicsRenderContext = nullptr;
    RenderContext* PinnedCaptureExportContext = nullptr;
    u64 PinnedCaptureExportSequence = 0;
    RasterDispatchPath ActiveRasterDispatchPath = RasterDispatchPath::DirectTiles;
    bool CpuTileBinningEnabled = false;

    VkImage ColorImage = VK_NULL_HANDLE;
    VkDeviceMemory ColorImageMemory = VK_NULL_HANDLE;
    VkImageView ColorImageView = VK_NULL_HANDLE;
    VkImage RasterColorImage = VK_NULL_HANDLE;
    VkDeviceMemory RasterColorImageMemory = VK_NULL_HANDLE;
    VkImageView RasterColorImageView = VK_NULL_HANDLE;
    VkImage AttrImage = VK_NULL_HANDLE;
    VkDeviceMemory AttrImageMemory = VK_NULL_HANDLE;
    VkImageView AttrImageView = VK_NULL_HANDLE;
    VkImage CompatibilityDepthImage = VK_NULL_HANDLE;
    VkDeviceMemory CompatibilityDepthImageMemory = VK_NULL_HANDLE;
    VkImageView CompatibilityDepthImageView = VK_NULL_HANDLE;
    VkImage DepthStencilImage = VK_NULL_HANDLE;
    VkDeviceMemory DepthStencilImageMemory = VK_NULL_HANDLE;
    VkImageView DepthStencilImageView = VK_NULL_HANDLE;
    VkImageView DepthStencilDepthImageView = VK_NULL_HANDLE;
    u32 ColorImageWidth = 0;
    u32 ColorImageHeight = 0;
    bool ColorImageInitialized = false;

    VkBuffer ReadbackBuffer = VK_NULL_HANDLE;
    VkDeviceMemory ReadbackMemory = VK_NULL_HANDLE;
    VkDeviceSize ReadbackSize = 0;
    void* ReadbackMapped = nullptr;
    u32 RawReadbackWidth = 0;
    u32 RawReadbackHeight = 0;
    VkImage CaptureReadbackImage = VK_NULL_HANDLE;
    VkDeviceMemory CaptureReadbackMemory = VK_NULL_HANDLE;
    bool CaptureReadbackImageInitialized = false;
    VkBuffer ResultReadbackBuffer = VK_NULL_HANDLE;
    VkDeviceMemory ResultReadbackMemory = VK_NULL_HANDLE;
    VkDeviceSize ResultReadbackSize = 0;
    void* ResultReadbackMapped = nullptr;

    VkBuffer TriangleBuffer = VK_NULL_HANDLE;
    VkDeviceMemory TriangleMemory = VK_NULL_HANDLE;
    VkDeviceSize TriangleBufferSize = 0;
    void* TriangleMapped = nullptr;
    VkBuffer GraphicsVertexBuffer = VK_NULL_HANDLE;
    VkDeviceMemory GraphicsVertexMemory = VK_NULL_HANDLE;
    VkDeviceSize GraphicsVertexBufferSize = 0;
    void* GraphicsVertexMapped = nullptr;
    VkBuffer GraphicsSceneVertexBuffer = VK_NULL_HANDLE;
    VkDeviceMemory GraphicsSceneVertexMemory = VK_NULL_HANDLE;
    VkDeviceSize GraphicsSceneVertexBufferSize = 0;
    void* GraphicsSceneVertexMapped = nullptr;
    VkBuffer GraphicsEdgeIndexBuffer = VK_NULL_HANDLE;
    VkDeviceMemory GraphicsEdgeIndexMemory = VK_NULL_HANDLE;
    VkDeviceSize GraphicsEdgeIndexBufferSize = 0;
    void* GraphicsEdgeIndexMapped = nullptr;

    VkBuffer ResultBuffer = VK_NULL_HANDLE;
    VkDeviceMemory ResultMemory = VK_NULL_HANDLE;
    VkDeviceSize ResultBufferSize = 0;

    VkBuffer BinMaskBuffer = VK_NULL_HANDLE;
    VkDeviceMemory BinMaskMemory = VK_NULL_HANDLE;
    VkDeviceSize BinMaskBufferSize = 0;

    VkBuffer GroupListBuffer = VK_NULL_HANDLE;
    VkDeviceMemory GroupListMemory = VK_NULL_HANDLE;
    VkDeviceSize GroupListBufferSize = 0;

    VkBuffer SpanSetupBuffer = VK_NULL_HANDLE;
    VkDeviceMemory SpanSetupMemory = VK_NULL_HANDLE;
    VkDeviceSize SpanSetupBufferSize = 0;

    VkBuffer WorkOffsetBuffer = VK_NULL_HANDLE;
    VkDeviceMemory WorkOffsetMemory = VK_NULL_HANDLE;
    VkDeviceSize WorkOffsetBufferSize = 0;

    VkBuffer ToonBuffer = VK_NULL_HANDLE;
    VkDeviceMemory ToonMemory = VK_NULL_HANDLE;
    VkDeviceSize ToonBufferSize = 0;
    void* ToonMapped = nullptr;
    VkBuffer ClearBuffer = VK_NULL_HANDLE;
    VkDeviceMemory ClearMemory = VK_NULL_HANDLE;
    VkDeviceSize ClearBufferSize = 0;
    void* ClearMapped = nullptr;
    VkBuffer CaptureLineBuffer = VK_NULL_HANDLE;
    VkDeviceMemory CaptureLineMemory = VK_NULL_HANDLE;
    VkDeviceSize CaptureLineBufferSize = 0;
    void* CaptureLineMapped = nullptr;
    static constexpr u32 CaptureLineBufferSlotCount = 6;
    std::array<VkBuffer, CaptureLineBufferSlotCount> CaptureLineBuffers{};
    std::array<VkDeviceMemory, CaptureLineBufferSlotCount> CaptureLineMemories{};
    std::array<VkDeviceSize, CaptureLineBufferSlotCount> CaptureLineBufferSizes{};
    std::array<void*, CaptureLineBufferSlotCount> CaptureLineMappedSlots{};
    u32 ActiveCaptureLineBufferSlot = 0;
    int PendingCaptureLineBufferSlot = -1;
    int ReadyCaptureLineBufferSlot = -1;
    bool PendingCaptureLineScreenSwap = false;
    bool ReadyCaptureLineScreenSwap = false;
    CaptureSourceIdentity PendingCaptureLineIdentity{};
    CaptureSourceIdentity ReadyCaptureLineIdentity{};

    VkImage FallbackTextureImage = VK_NULL_HANDLE;
    VkDeviceMemory FallbackTextureMemory = VK_NULL_HANDLE;
    VkImageView FallbackTextureView = VK_NULL_HANDLE;
    VkImageView FallbackTextureNormalizedView = VK_NULL_HANDLE;
    VkSampler FallbackTextureSampler = VK_NULL_HANDLE;
    std::array<VkSampler, 9> TextureWrapSamplers{};
    VkBuffer FallbackTextureStagingBuffer = VK_NULL_HANDLE;
    VkDeviceMemory FallbackTextureStagingMemory = VK_NULL_HANDLE;

    std::array<VkDescriptorImageInfo, TextureDescriptorStorageCapacity> ActiveTextureDescriptors{};
    std::array<VkDescriptorImageInfo, TextureDescriptorStorageCapacity> ActiveNormalizedTextureDescriptors{};
    u32 ActiveTextureDescriptorCount = 0;
    std::unordered_map<u64, GraphicsResolvedTextureCacheEntry> GraphicsResolvedTextureCache;

    std::vector<TriangleGpu> Triangles;
    std::vector<GraphicsVertexGpu> GraphicsVertices;
    std::vector<GraphicsVertexGpu> GraphicsSceneVertices;
    std::vector<GraphicsPolygonDraw> GraphicsPolygons;
    AcceleratedScene SharedGraphicsScene{};
    std::vector<u32> GraphicsOpaqueDrawIndices;
    std::vector<u32> GraphicsNeedOpaqueDrawIndices;
    std::vector<u32> GraphicsAlphaDrawIndices;
    std::vector<u32> GraphicsShadowMaskDrawIndices;
    std::vector<u32> GraphicsShadowDrawIndices;
    u32 GraphicsHiddenAlphaZeroFinalEdgePolyIdOverride = 0xFFFFFFFFu;
    u32 GraphicsHiddenAlphaZeroFinalEdgeColorOverride = 0;
    std::vector<u32> RawReadbackRgba;
    std::vector<u32> RawResultReadback;
    std::array<u32, 256 * 192> LineCache{};
    std::array<u32, 256 * 192> SweepLineCache{};
    std::array<u32, 256 * 192> LastValidExactCaptureLineCache{};
    CaptureSourceIdentity LineCacheIdentity{};
    CaptureSourceIdentity SweepLineCacheIdentity{};
    CaptureSourceIdentity LastValidExactCaptureIdentity{};
    CaptureSourceIdentity LastServedCaptureSourceIdentity{};
    u32 ExactCaptureFallbackPackedColor = 0;
    bool ExactCaptureFallbackValid = false;
    bool ExactCaptureLineCacheFallbackOnly = false;
    bool HasLastValidExactCapture = false;
    bool LastValidExactCaptureScreenSwap = false;
    bool CurrentCaptureScreenSwapHint = false;
    bool HasCurrentCaptureScreenSwapHint = false;
    u32 CurrentCaptureCntHint = 0;
    u32 CurrentCaptureDisplayCntHint = 0;
    bool PendingCaptureLineRequiresPrimaryFence = false;
    bool CurrentRenderScreenSwap = false;
    bool GraphicsCadenceTopSourceValid = false;
    bool GraphicsCadenceBottomSourceValid = false;
    bool GraphicsCadenceLastSourceScreenSwap = false;
    bool GraphicsCadenceRepeatedCurrentFrame = false;
    u32 GraphicsCadenceConsecutiveRepeats = 0;
    u32 GraphicsCadenceLogCooldown = 0;
    PFN_vkResetQueryPoolEXT ResetQueryPool = nullptr;
    float TimestampPeriodNs = 0.0f;
    bool TimestampQueriesSupported = false;
    PerfSampleWindow<120> RenderCpuWindow;
    PerfSampleWindow<120> TextureUpdateCpuWindow;
    PerfSampleWindow<120> WarmTextureCpuWindow;
    PerfSampleWindow<120> TriangleBuildCpuWindow;
    PerfSampleWindow<120> BufferPrepCpuWindow;
    PerfSampleWindow<120> DescriptorUpdateCpuWindow;
    PerfSampleWindow<120> DispatchCpuWindow;
    PerfSampleWindow<120> FenceWaitCpuWindow;
    PerfSampleWindow<120> GpuWindow;
    PerfSampleWindow<120> TriangleCountWindow;
    PerfSampleWindow<120> PassCountWindow;
    PerfSampleWindow<120> InterpCpuWindow;
    PerfSampleWindow<120> BinCpuWindow;
    PerfSampleWindow<120> WorkOffsetsCpuWindow;
    PerfSampleWindow<120> SortCpuWindow;
    PerfSampleWindow<120> RasterCpuWindow;
    PerfSampleWindow<120> GraphicsSceneBuildCpuWindow;
    PerfSampleWindow<120> GraphicsTextureLookupCpuWindow;
    PerfSampleWindow<120> GraphicsTexturePersistentCpuWindow;
    PerfSampleWindow<120> GraphicsTexcacheResolveCpuWindow;
    PerfSampleWindow<120> GraphicsTextureDescriptorCpuWindow;
    PerfSampleWindow<120> GraphicsTextureSlotCpuWindow;
    PerfSampleWindow<120> GraphicsConstantTextureCpuWindow;
    PerfSampleWindow<120> GraphicsVertexEmitCpuWindow;
    PerfSampleWindow<120> GraphicsStatsCpuWindow;
    PerfSampleWindow<120> GraphicsMainCpuWindow;
    PerfSampleWindow<120> GraphicsAlphaCpuWindow;
    PerfSampleWindow<120> DepthBlendCpuWindow;
    PerfSampleWindow<120> FinalCpuWindow;
    PerfSampleWindow<120> CaptureLineExportCpuWindow;
    PerfSampleWindow<120> CpuActiveTileCountWindow;
    PerfSampleWindow<120> CpuTileCountWindow;
    PerfSampleWindow<120> CpuActiveGroupCountWindow;
    PerfSampleWindow<120> CpuActiveDispatchWindow;
    PerfSampleWindow<120> InterpGpuWindow;
    PerfSampleWindow<120> BinGpuWindow;
    PerfSampleWindow<120> WorkOffsetsGpuWindow;
    PerfSampleWindow<120> SortGpuWindow;
    PerfSampleWindow<120> RasterGpuWindow;
    PerfSampleWindow<120> DepthBlendGpuWindow;
    PerfSampleWindow<120> FinalGpuWindow;
    PerfSampleWindow<120> CaptureLineExportGpuWindow;
    PerfSampleWindow<120> EarlySubmitCpuWindow;
    PerfSampleWindow<120> EarlySubmitContextWaitCpuWindow;
    u32 LastGraphicsOpaqueDrawCount = 0;
    u32 LastGraphicsNeedOpaqueDrawCount = 0;
    u32 LastGraphicsAlphaDrawCount = 0;
    u32 LastGraphicsOpaqueWDrawCount = 0;
    u32 LastGraphicsOpaqueZDrawCount = 0;
    u32 LastGraphicsOpaqueTexturedDrawCount = 0;
    u32 LastGraphicsOpaqueUntexturedDrawCount = 0;
    u32 LastGraphicsOpaqueModulateDrawCount = 0;
    u32 LastGraphicsOpaqueDecalDrawCount = 0;
    u32 LastGraphicsOpaqueToonDrawCount = 0;
    u32 LastGraphicsOpaqueHighlightDrawCount = 0;
    u32 LastGraphicsOpaqueLinearDrawCount = 0;
    u32 LastGraphicsOpaqueRepeatDrawCount = 0;
    u32 LastGraphicsOpaqueMirrorDrawCount = 0;
    u32 LastGraphicsOpaqueRepeatSDrawCount = 0;
    u32 LastGraphicsOpaqueRepeatTDrawCount = 0;
    u32 LastGraphicsOpaqueMirrorSDrawCount = 0;
    u32 LastGraphicsOpaqueMirrorTDrawCount = 0;
    u32 LastGraphicsOpaqueClampSDrawCount = 0;
    u32 LastGraphicsOpaqueClampTDrawCount = 0;
    u32 LastGraphicsOpaqueFullAlphaDrawCount = 0;
    u32 LastGraphicsOpaqueHighresRepeatModelDrawCount = 0;
    u32 LastGraphicsOpaqueNoAttrPassCount = 0;
    u32 LastGraphicsOpaqueReverseOcclusionPassCount = 0;
    u32 LastGraphicsOpaqueNoDepthNoAttrPassCount = 0;
    u32 LastGraphicsOpaqueNoAttrPolyIdMissCount = 0;
    u32 LastGraphicsOpaqueNoAttrDepthMissCount = 0;
    u32 LastGraphicsOpaqueNoAttrFogMissCount = 0;
    u32 LastGraphicsFogWriteOpaquePassCount = 0;
    u32 LastGraphicsFogWriteAlphaPassCount = 0;
    u64 LastGraphicsSceneSignature = 0;
    bool HasLastGraphicsSceneSignature = false;
    u64 GraphicsSceneReuseCount = 0;
    u32 LastGraphicsTextureLookupHitCount = 0;
    u32 LastGraphicsTextureLookupMissCount = 0;
    u32 LastGraphicsPersistentTextureHitCount = 0;
    u32 LastGraphicsPersistentTextureMissCount = 0;
    u64 LastGraphicsTexcacheResolveCpuNs = 0;
    u64 ContextMissCount = 0;
    u64 LateFrameCount = 0;
    u64 DroppedFrameCount = 0;
    u64 CpuDirectTilesPathCount = 0;
    u64 DirectTilesPathCount = 0;
    u64 LegacyWorklistPathCount = 0;
    u64 ReadbackColorRequestCount = 0;
    u64 ReadbackResultRequestCount = 0;
    u64 CapturePrepareRequestCount = 0;
    std::array<u64, 4> CaptureModeCounts{};
    std::array<u64, 4> CaptureSizeModeCounts{};
    std::array<u64, static_cast<size_t>(RasterExecutionProfile::Count)> RasterExecutionProfileCounts{};
    std::array<u64, static_cast<size_t>(RasterTileLoopMode::Count)> RasterTileLoopModeCounts{};
    std::array<u64, static_cast<size_t>(CapturePathMode::Count)> CapturePathModeCounts{};
    u64 CaptureSource3dCount = 0;
    u64 CaptureEnabledCount = 0;
    u64 CaptureLineExportCount = 0;
    u32 CaptureFinalizeTimeoutStreak = 0;
    u64 RasterSpecializedShadeModeCount = 0;
    u64 RasterSpecializedTextureModeCount = 0;
    u64 RasterSpecializedTranslucencyModeCount = 0;
    u64 RasterSpecializedAllModesCount = 0;
    u64 EarlySubmitAttemptCount = 0;
    u64 EarlySubmitHitCount = 0;
    u64 EarlySubmitMissCount = 0;
    u64 EarlySubmitSkipVCount215Count = 0;
    u32 CaptureDebugLogsRemaining = 0;
    u32 ShadowMaskDepthComplementLogsRemaining = 0;
    u32 SparseOpaqueDetailLogsRemaining = 0;
    u32 DenseOpaquePassLogsRemaining = 0;
    u32 PaletteUiGateLogCooldown = 0;
    bool PaletteUiGateLastActive = false;
    u32 PaletteUiOpaqueReplayLogCooldown = 0;
    bool PaletteUiOpaqueReplayLastActive = false;
    u32 GraphicsDrawDispatchMissingLogCooldown = 0;
    bool SkipRenderAtVCount215 = false;
    bool InEarlySubmitAttempt = false;
    u64 CurrentEarlySubmitContextWaitNs = 0;
    bool CaptureReadbackPending = false;
    RenderContext* PendingCaptureReadbackContext = nullptr;
    bool CaptureLinePending = false;
    bool CaptureLineReady = false;
    bool ExactCaptureLineCachePrepared = false;
    bool ExactCaptureLineCacheFresh = false;
    bool CaptureLineDataIsRgba8 = false;
    RenderContext* PendingCaptureLineContext = nullptr;
    const u32* ReadyCaptureLineData = nullptr;
    u32 PostFastForwardDrainFrames = 0;
};
}
