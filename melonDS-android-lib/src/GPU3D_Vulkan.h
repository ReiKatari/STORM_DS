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
#include "VulkanPipelinePolicy.h"
#include "GPU3D_AcceleratedFrontend.h"
#include "GPU3D_TexcacheVulkan.h"
#include "VulkanPerfStats.h"
#include "ThreadLifecycleScope.h"

namespace melonDS
{
class GPU;

class VulkanRenderer3D : public Renderer3D
{
public:
    using SubmittedRenderIdentity = CaptureSourceIdentity;

    struct SubmittedRenderSource
    {
        VkImage Image = VK_NULL_HANDLE;
        VkImageView ImageView = VK_NULL_HANDLE;
        u32 Width = 0;
        u32 Height = 0;
        SubmittedRenderIdentity Identity{};
    };

    static std::unique_ptr<VulkanRenderer3D> New(
        ThreadLifecycleScope::Callback workerLifecycle = nullptr,
        ThreadLifecycleScope::Callback workerCreationLifecycle = nullptr) noexcept;

    explicit VulkanRenderer3D(
        ThreadLifecycleScope::Callback workerLifecycle = nullptr,
        ThreadLifecycleScope::Callback workerCreationLifecycle = nullptr) noexcept;
    ~VulkanRenderer3D() override;

    void Reset(GPU& gpu) override;
    void VCount144(GPU& gpu) override;
    void RenderFrame(GPU& gpu) override;
    void PrepareFrameGeometry(const GPU3D& gpu) noexcept override;
    void SetFramePreparationDeferred(bool enabled) noexcept override;
    void FinishFramePreparation() const noexcept override;
    bool SetFrameSubmissionDeferred(bool enabled, VkSemaphore dependency = VK_NULL_HANDLE, u64 value = 0);
    using SubmissionDependency = bool (*)(void*);
    bool SetSubmissionDependency(SubmissionDependency callback, void* context = nullptr);
    bool HasDeferredFrameSubmission() const { return DeferredRenderContext != nullptr; }
    void RestartFrame(GPU& gpu) override;
    u32* GetLine(int line) override;

    void SetupAccelFrame() override;
    void PrepareCaptureFrame() override;
    void BeginCaptureFrame() override;
    void SetCaptureScreenSwapHint(bool screenSwap, u32 captureCnt, u32 displayCnt) override;
    void SetFaithfulComposeActiveHint(bool active) override
    {
        ComposeFielPreciso3D = active;
    }
    void InvalidateRenderProductIdentities() noexcept override;
    [[nodiscard]] bool GetLiveRenderProductIdentity(
        LiveRenderProductIdentity& outIdentity) const noexcept override;
    [[nodiscard]] bool GetLastServedCaptureSourceIdentity(
        CaptureSourceIdentity& outIdentity) const noexcept override;
    [[nodiscard]] bool UsesStructured2DMetadata() const noexcept override { return true; }
    void Blit(const GPU& gpu) override;
    void Stop(const GPU& gpu) override;

    void SetRenderSettings(
        bool threaded,
        bool betterPolygons,
        int scale,
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
    void SetLecturaStashNoBloqueante(bool v) noexcept { LecturaStashNoBloqueante = v; }
    [[nodiscard]] bool UsesBetterPolygons() const noexcept { return BetterPolygons; }
    [[nodiscard]] bool IsCoverageFixEnabled() const noexcept { return CoverageFixEnabled; }
    [[nodiscard]] float GetCoverageFixPx() const noexcept { return CoverageFixPx; }
    [[nodiscard]] float GetCoverageFixDepthBias() const noexcept { return CoverageFixDepthBias; }
    [[nodiscard]] bool IsCoverageFixRepeatEnabled() const noexcept { return CoverageFixApplyRepeat; }
    [[nodiscard]] bool IsCoverageFixClampEnabled() const noexcept { return CoverageFixApplyClamp; }
    [[nodiscard]] float GetPassiveCoverageFixRepeatPx() const noexcept { return PassiveCoverageFixRepeatPx; }
    [[nodiscard]] bool IsDebug3dClearMagentaEnabled() const noexcept { return Debug3dClearMagenta; }
    [[nodiscard]] size_t GetAsyncRenderContextCount() const noexcept
    {
        return GetVulkanRenderContextPolicy().AsyncRenderContextCount;
    }
    [[nodiscard]] bool WaitsForReadbackSourceOnly() const noexcept { return true; }
    [[nodiscard]] bool GetCurrentRenderScreenSwap() const noexcept { return CurrentRenderScreenSwap; }
    [[nodiscard]] u32 GetLastSubmittedRenderPolygonCount() const noexcept { return LastSubmittedRenderPolygonCount; }

    [[nodiscard]] bool IsRingRenderProductPublished() const noexcept
    {
        return getPublishedFaithfulRasterProductSlot() != nullptr;
    }
    [[nodiscard]] bool IsPublishedRenderMetadataValid() const noexcept
    {
        return (PublishedGraphicsRenderContext != nullptr
                && PublishedGraphicsRenderContext->SubmittedMetadataValid)
            || (PublishedGlobalRenderIdentity.Valid
                && ColorImageInitialized
                && ColorImage != VK_NULL_HANDLE
                && ColorImageView != VK_NULL_HANDLE
                && ColorImageWidth != 0u
                && ColorImageHeight != 0u);
    }
    [[nodiscard]] u32 GetPublishedRenderPolygonCount() const noexcept
    {
        return PublishedGraphicsRenderContext != nullptr
            ? PublishedGraphicsRenderContext->SubmittedPolygonCount
            : (IsPublishedRenderMetadataValid()
                ? PublishedGlobalRenderIdentity.PolygonCount : 0u);
    }
    [[nodiscard]] bool GetPublishedRenderScreenSwap() const noexcept
    {
        return PublishedGraphicsRenderContext != nullptr
            ? PublishedGraphicsRenderContext->SubmittedScreenSwap
            : (IsPublishedRenderMetadataValid()
                && PublishedGlobalRenderIdentity.ScreenSwap);
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

    [[nodiscard]] bool EsFotogramaIdentico() const noexcept { return FrameIdentical; }
    [[nodiscard]] bool FueCapturaEsteFotograma() const noexcept { return CapturaExactaEsteFotograma; }

    void SolicitarSaltoFrameskip() noexcept
    {
        FrameskipSaltoPendiente = true;
        FrameskipSaltoEsteFotograma = false;
    }
    void LimpiarSaltoFrameskip() noexcept
    {
        FrameskipSaltoPendiente = false;
        FrameskipSaltoEsteFotograma = false;
    }
    [[nodiscard]] bool FueSaltoFrameskipEsteFotograma() const noexcept { return FrameskipSaltoEsteFotograma; }
    [[nodiscard]] bool FrameskipPlaceholderServido() const noexcept override { return FrameskipPlaceholder3D; }
    [[nodiscard]] u64 GetFrameskipSaltos() const noexcept { return FrameskipSaltos; }

    [[nodiscard]] bool ComposeFielPreciso3DPendiente() const noexcept { return ComposeFielPreciso3D; }
    [[nodiscard]] bool IsLastValidExactCaptureAvailable() const noexcept
    { return HasLastValidExactCaptureParidad[0] || HasLastValidExactCaptureParidad[1]; }
    [[nodiscard]] bool GetLastValidExactCaptureScreenSwap() const noexcept { return LastValidExactCaptureUltimaParidad; }
    [[nodiscard]] bool IsExactCaptureLineCacheFallbackOnly() const noexcept { return ExactCaptureLineCacheFallbackOnly; }
    [[nodiscard]] bool EnsureVulkanReadyForValidation();

    [[nodiscard]] bool PrepareRenderTargetsForStart();
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
    void InvalidatePresentationState(bool discardColorTarget) noexcept;

private:
    static constexpr u32 TextureDescriptorStorageCapacity =
        GetVulkanTextureDescriptorPolicy().TextureDescriptorCount;
    static_assert(
        GetVulkanTextureDescriptorPolicy().MaxActiveTextureDescriptors()
            == std::tuple_size<decltype(GPU3D::RenderPolygonRAM)>::value);
    static constexpr u32 GraphicsTextureDescriptorPageCount =
        GetVulkanTextureDescriptorPolicy().TextureDescriptorPageCount();
    static constexpr u32 TextureDescriptorPageStorageCapacity =
        GetVulkanTextureDescriptorPolicy().TextureDescriptorPageStorageCapacity();
    using GraphicsDescriptorPageSets =
        std::array<VkDescriptorSet, GraphicsTextureDescriptorPageCount>;
    static constexpr u32 ToonTableEntryCount = 32;


    enum class TextureSamplingPath : u8
    {
        BaseSingleDescriptor = 0,
        DynamicUniform = 1,
    };

    enum class CapturePathMode : u8
    {
        Disabled = 0,
        CaptureLineExport = 1,
        FallbackReadback = 2,
        Count = 3,
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
        std::array<VkDescriptorImageInfo, TextureDescriptorPageStorageCapacity> TextureInfos{};
        std::array<VkDescriptorImageInfo, TextureDescriptorPageStorageCapacity> NormalizedTextureInfos{};
    };

    struct FaithfulRasterProductSlot
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
        VkDescriptorSet CaptureExportDescriptorSet = VK_NULL_HANDLE;
        GraphicsDescriptorPageSets GraphicsDescriptorSets{};
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
        GraphicsDescriptorSetCache GraphicsDescriptorCache{};
        FaithfulRasterProductSlot RasterProductSlot{};
        u32 PresentationRetainCount = 0;
        u32 SubmittedPolygonCount = 0;
        u32 SubmittedCaptureCnt = 0;
        u64 SubmittedRenderProductEpoch = 0;
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
        std::array<s16, 4> texcoordBounds;
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
        u32 boundedEqualDepth = 0xFFFFFFFFu;
    };

    bool ensureInitialized();
    void destroyVulkan();

    bool createCommandObjects();
    bool createCommandObjects(VkCommandPool& commandPool, VkCommandBuffer& commandBuffer);
    bool createSyncObjects();
    bool createFence(VkFence& fence);
    bool createTimestampQueryPool(VkQueryPool& queryPool);
    bool createTextureResources();
    bool createGraphicsDescriptorObjects();
    bool createCaptureExportResources();
    bool createGraphicsPipelines();
    bool createPipelineCache(TextureSamplingPath samplingPath);
    void savePipelineCache();
    std::string buildPipelineCacheFileName(TextureSamplingPath samplingPath) const;
    bool selectGraphicsRasterColorFormat();

    bool ensureRenderTarget(u32 width, u32 height);
    void destroyRenderTarget();
    bool ensureFaithfulRasterProductSlot(FaithfulRasterProductSlot& target, u32 width, u32 height);
    void destroyFaithfulRasterProductSlot(FaithfulRasterProductSlot& target);
    [[nodiscard]] const FaithfulRasterProductSlot* getPublishedFaithfulRasterProductSlot() const noexcept;
    [[nodiscard]] FaithfulRasterProductSlot* getContextFaithfulRasterProductSlot(RenderContext* context) noexcept;
    [[nodiscard]] CaptureSourceIdentity captureSourceIdentityForContext(
        const RenderContext* context) const noexcept;
    [[nodiscard]] LiveRenderProductIdentity liveRenderIdentityForContext(
        const RenderContext* context) const noexcept;
    void latchCurrentFramePublishedIdentities() noexcept;
    void beginRenderProductEpoch() noexcept;
    [[nodiscard]] bool isRenderContextRetained(
        const RenderContext& context) const noexcept;
    [[nodiscard]] bool isRenderContextReusable(
        const RenderContext& context) const noexcept;
    [[nodiscard]] bool hasRetainedRenderProducts() const noexcept;
    bool ensureTriangleBuffer(RenderContext* context, size_t triangleCount);
    void destroyTriangleBuffer(RenderContext* context);
    bool ensureGraphicsVertexBuffer(RenderContext* context, size_t vertexCount);
    void destroyGraphicsVertexBuffer(RenderContext* context);
    bool ensureGraphicsSceneVertexBuffer(size_t vertexCount, RenderContext* context = nullptr);
    void destroyGraphicsSceneVertexBuffer(RenderContext* context = nullptr);
    bool ensureGraphicsEdgeIndexBuffer(size_t indexCount, RenderContext* context = nullptr);
    void destroyGraphicsEdgeIndexBuffer(RenderContext* context = nullptr);
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
    bool createFallbackTexture();
    void destroyFallbackTexture();

    bool createReadbackBuffer(u32 width, u32 height);
    void destroyReadbackBuffer();
    bool readbackGraphicsAttrImageToCpu(std::vector<u32>& outAttrPixels);
    bool readbackGraphicsDepthImageToCpu(std::vector<u32>& outDepthPixels);

    bool updateCaptureExportDescriptorSet(
        RenderContext* context,
        const FaithfulRasterProductSlot* sourceTarget = nullptr,
        VkBuffer destinationBuffer = VK_NULL_HANDLE,
        int faithfulDescriptorSlot = -1,
        VkDescriptorSet* outDescriptorSet = nullptr);
    void updateGraphicsDescriptorSet(
        RenderContext* context,
        int faithfulDescriptorSlot = -1);
    static bool descriptorImageInfoEquals(const VkDescriptorImageInfo& lhs, const VkDescriptorImageInfo& rhs);
    [[nodiscard]] VkDescriptorSet getGraphicsDescriptorSet(
        RenderContext* context,
        int faithfulDescriptorSlot = -1,
        u32 textureDescriptorIndex = 0u) const;
    GraphicsDescriptorSetCache& getGraphicsDescriptorSetCache(
        RenderContext* context,
        int faithfulDescriptorSlot = -1);
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
    [[nodiscard]] static const char* capturePathModeName(CapturePathMode mode) noexcept;
    u32 findMemoryType(u32 typeBits, VkMemoryPropertyFlags properties) const;
    bool tryAcquireRenderContext(RenderContext& context, bool countMisses = true);
    bool waitForRenderContext(RenderContext& context);
    RenderContext* tryAcquireReadyRenderContext() noexcept;
    bool waitForAllRenderContexts();
    bool waitForReadbackSource();
    bool waitForTextureCacheMutationSafePoint();
    bool waitForDeviceIdle(const char* reason);
    RenderContext* acquireNextRenderContext() noexcept;
    [[nodiscard]] bool isNewestOfItsParity(const RenderContext& context) const noexcept;
    void consumeGpuTiming(RenderContext* context);
    void logPerformanceIfNeeded();

    void WarmTextureCache(GPU& gpu);
    AcceleratedSceneBuildConfig sceneBuildConfigForScale(int scale) const;
    void buildGraphicsTriangleList(GPU& gpu, bool usePreparedGeometry);
    void buildTriangleList(GPU& gpu, bool usePreparedGeometry = false);

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
        bool captureReadbackPath = false,
        bool nativeProjectionOnly = false);
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
        bool captureReadbackPath = false,
        bool nativeProjectionOnly = false);
    bool dispatchPlainRearPlaneOnly(RenderContext* context, u32 rgbaColor);
    bool submitGraphicsCaptureExportForCurrentFrame();
    bool submitFaithfulNativeProjection(GPU& gpu, bool usePreparedGeometry = false);
    bool submitFaithfulNativeProjectionForCurrentFrame();
    [[nodiscard]] bool captureIdentityMatchesCurrentFrameKey(
        const CaptureSourceIdentity& identity) const noexcept;
    void traceFaithfulCaptureDecision(
        const char* stage,
        const char* reason,
        const CaptureSourceIdentity& candidate = {}) const noexcept;
    bool prepareFaithfulExactCaptureLineCache();
    bool readbackColorTargetToCpu();
    bool copyReadyCaptureLineToLineCache();
    void convertReadbackToLineCache();
    u32 buildClearColorRgba8(const GPU& gpu) const;
    void clearLineCache();

private:
    TexcacheVulkan Texcache;
    const ThreadLifecycleScope::Callback WorkerLifecycle;
    const ThreadLifecycleScope::Callback WorkerCreationLifecycle;
    struct FramePreparation;
    std::unique_ptr<FramePreparation> Preparation;
    bool FramePreparationDeferred = false;
    bool FramePreparationUnavailable = false;
    bool ensureFramePreparation() noexcept;
    void renderPreparedFrame(GPU& gpu, bool textureCacheChanged,
        bool prefetchNativeForCompose, u32 captureCnt, u32 displayCnt, u64 renderStartNs,
        bool usePreparedGeometry = false);

    int ScaleFactor = 1;

    int EscalaEfectiva = 1;

    VkCommandBuffer CbFiel[2] = {VK_NULL_HANDLE, VK_NULL_HANDLE};
    VkFence VallaFiel[2] = {VK_NULL_HANDLE, VK_NULL_HANDLE};
    unsigned IndiceCbFiel = 0;
    VkCommandBuffer CbExport = VK_NULL_HANDLE;

    bool LecturaStashNoBloqueante = false;
    VkFence VallaExport = VK_NULL_HANDLE;
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
    u64 LiveRenderProductEpoch = 0;

    VkInstance Instance = VK_NULL_HANDLE;
    VkPhysicalDevice PhysicalDevice = VK_NULL_HANDLE;
    bool flushDeferredRenderSubmission(VkSemaphore dependency = VK_NULL_HANDLE, u64 value = 0);
    bool FrameSubmissionDeferred = false;
    SubmissionDependency BeforeSubmission = nullptr;
    void* BeforeSubmissionContext = nullptr;
    bool SubmissionDependencyFailed = false;
    bool flushSubmissionDependency();
    VkResult submitQueue(const VkSubmitInfo& submit, VkFence fence);
    RenderContext* DeferredRenderContext = nullptr;
    VkResult DeferredRenderSubmitResult = VK_SUCCESS;

    VkDevice Device = VK_NULL_HANDLE;
    VkQueue Queue = VK_NULL_HANDLE;
    u32 QueueFamilyIndex = 0;

    VkCommandPool CommandPool = VK_NULL_HANDLE;
    VkCommandBuffer CommandBuffer = VK_NULL_HANDLE;
    VkFence FrameFence = VK_NULL_HANDLE;
    VkQueryPool TimestampQueryPool = VK_NULL_HANDLE;
    bool TimestampPending = false;

    VkDescriptorSetLayout CaptureExportDescriptorSetLayout = VK_NULL_HANDLE;
    VkDescriptorPool CaptureExportDescriptorPool = VK_NULL_HANDLE;
    VkDescriptorSet CaptureExportDescriptorSet = VK_NULL_HANDLE;
    VkPipelineLayout CaptureExportPipelineLayout = VK_NULL_HANDLE;
    static constexpr u32 FaithfulCaptureExportDescriptorSlotCount = 2u;
    std::array<VkDescriptorSet, FaithfulCaptureExportDescriptorSlotCount>
        FaithfulCaptureExportDescriptorSets{};
    VkDescriptorSetLayout GraphicsDescriptorSetLayout = VK_NULL_HANDLE;
    VkDescriptorPool GraphicsDescriptorPool = VK_NULL_HANDLE;
    GraphicsDescriptorPageSets GraphicsDescriptorSets{};
    GraphicsDescriptorSetCache GraphicsDescriptorCache{};

    static constexpr u32 FaithfulGraphicsDescriptorSlotCount = 2u;
    std::array<GraphicsDescriptorPageSets, FaithfulGraphicsDescriptorSlotCount>
        FaithfulGraphicsDescriptorSets{};
    std::array<GraphicsDescriptorSetCache, FaithfulGraphicsDescriptorSlotCount>
        FaithfulGraphicsDescriptorCaches{};
    TextureSamplingPath ActiveTextureSamplingPath = TextureSamplingPath::DynamicUniform;
    CapturePathMode ActiveCapturePathMode = CapturePathMode::Disabled;
    VkPipelineLayout GraphicsPipelineLayout = VK_NULL_HANDLE;
    VkPipelineCache ComputePipelineCache = VK_NULL_HANDLE;
    std::string ComputePipelineCacheFile;
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
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulatePlainFragmentDepthPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainFragmentDepthPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFragmentDepthPrepassPipelines{};

    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaquePrepassHwDepthPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueAlphaPrepassHwDepthPipelines{};
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
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainColorOnlyPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainOcclusionNoAttrPipelines{};
    std::array<VkPipeline, GraphicsOpaquePipelineCount> GraphicsOpaqueFastModulateOpaqueAlphaPlainNoDepthOcclusionNoAttrPipelines{};
    std::array<VkPipeline, GraphicsTranslucentPipelineCount> GraphicsTranslucentPipelines{};
    std::array<VkPipeline, GraphicsTranslucentPipelineCount> GraphicsBoundedDepthTranslucentPipelines{};
    std::array<VkPipeline, GraphicsTranslucentPipelineCount> GraphicsTranslucentFastModulatePlainFragmentDepthPipelines{};
    std::array<VkPipeline, GraphicsBgZeroTranslucentPipelineCount> GraphicsBgZeroTranslucentPipelines{};
    std::array<VkPipeline, GraphicsBgZeroTranslucentPipelineCount> GraphicsBoundedDepthBgZeroTranslucentPipelines{};
    std::array<VkPipeline, GraphicsBgZeroTranslucentPipelineCount> GraphicsBgZeroFastModulatePlainPipelines{};
    std::array<VkPipeline, GraphicsShadowMaskPipelineCount> GraphicsShadowMaskPipelines{};
    std::array<VkPipeline, GraphicsShadowMaskBgZeroPipelineCount> GraphicsShadowMaskBgZeroPipelines{};
    std::array<VkPipeline, GraphicsShadowClearPipelineCount> GraphicsShadowClearPipelines{};
    std::array<VkPipeline, GraphicsShadowBlendBgZeroPipelineCount> GraphicsShadowBlendBgZeroPipelines{};
    std::array<VkPipeline, GraphicsShadowBlendPipelineCount> GraphicsShadowBlendPipelines{};
    std::array<VkPipeline, GraphicsEdgeMarkPipelineCount> GraphicsEdgeMarkPipelines{};
    std::array<VkPipeline, GraphicsEdgeMarkPipelineCount> GraphicsEdgeMarkAlphaPipelines{};
    std::array<VkPipeline, GraphicsWModeCount> GraphicsOpaqueUiOverlayPipelines{};
    VkPipeline GraphicsClearPipeline = VK_NULL_HANDLE;
    VkPipeline GraphicsStencilBitClearPipeline = VK_NULL_HANDLE;
    std::array<VkPipeline, GraphicsWModeCount> GraphicsShadowMaskDepthComplementPipelines{};
    VkPipeline GraphicsFinalEdgePipeline = VK_NULL_HANDLE;
    VkPipeline GraphicsFinalEdgeFogPipeline = VK_NULL_HANDLE;
    VkPipeline GraphicsFinalFogPipeline = VK_NULL_HANDLE;
    VkRenderPass GraphicsRasterRenderPass = VK_NULL_HANDLE;
    VkRenderPass GraphicsRasterLoadRenderPass = VK_NULL_HANDLE;

    VkRenderPass GraphicsRasterSinEscrituraRenderPass = VK_NULL_HANDLE;
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
        GetVulkanRenderContextPolicy().AsyncRenderContextCount;
    static constexpr u32 TimestampQueryCount = 9;
    std::array<RenderContext, MaxAsyncRenderContextCount> RenderContexts{};

    RenderContext NativeProjectionContext{};
    bool NativeProjectionSubmitInFlight = false;

    GPU* FaithfulNativeProjectionSourceGpu = nullptr;
    CaptureSourceIdentity FaithfulNativeProjectionSourceIdentity{};

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

    static_assert(MaxAsyncRenderContextCount == 3u);
    static_assert(MaxAsyncRenderContextCount > 0u);
    size_t NextRenderContextIndex = 0;
    RenderContext* LastSubmittedRenderContext = nullptr;
    RenderContext* PublishedGraphicsRenderContext = nullptr;

    SubmittedRenderIdentity PublishedGlobalRenderIdentity{};
    LiveRenderProductIdentity PublishedGlobalLiveRenderIdentity{};

    VkFence PublishedGlobalRenderFence = VK_NULL_HANDLE;

    SubmittedRenderIdentity CurrentFrameServedIdentity{};
    LiveRenderProductIdentity CurrentFrameLiveRenderIdentity{};
    RenderContext* PinnedCaptureExportContext = nullptr;
    u64 PinnedCaptureExportSequence = 0;

    VkImage ColorImage = VK_NULL_HANDLE;
    VkDeviceMemory ColorImageMemory = VK_NULL_HANDLE;
    VkImageView ColorImageView = VK_NULL_HANDLE;
    VkImage RasterColorImage = VK_NULL_HANDLE;
    VkDeviceMemory RasterColorImageMemory = VK_NULL_HANDLE;
    VkImageView RasterColorImageView = VK_NULL_HANDLE;
    VkImage AttrImage = VK_NULL_HANDLE;
    VkDeviceMemory AttrImageMemory = VK_NULL_HANDLE;
    VkImageView AttrImageView = VK_NULL_HANDLE;
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

    VkDeviceSize MitadEscenaActiva = 0;
    VkDeviceSize MitadVerticesActiva = 0;
    VkDeviceSize MitadAristasActiva = 0;
    VkBuffer GraphicsEdgeIndexBuffer = VK_NULL_HANDLE;
    VkDeviceMemory GraphicsEdgeIndexMemory = VK_NULL_HANDLE;
    VkDeviceSize GraphicsEdgeIndexBufferSize = 0;
    void* GraphicsEdgeIndexMapped = nullptr;

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
    bool NativeProjectionCapturePending = false;
    VkFence PendingCaptureLineFence = VK_NULL_HANDLE;
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
    std::array<u32, 256 * 192> LineCache{};
    std::array<u32, 256 * 192> SweepLineCache{};

    std::array<std::array<u32, 256 * 192>, 2> LastValidExactCaptureLineCache{};
    CaptureSourceIdentity LineCacheIdentity{};
    CaptureSourceIdentity SweepLineCacheIdentity{};
    std::array<CaptureSourceIdentity, 2> LastValidExactCaptureIdentity{};
    CaptureSourceIdentity LastServedCaptureSourceIdentity{};
    u32 ExactCaptureFallbackPackedColor = 0;
    bool ExactCaptureFallbackValid = false;
    bool ExactCaptureLineCacheFallbackOnly = false;
    std::array<bool, 2> HasLastValidExactCaptureParidad{false, false};
    bool LastValidExactCaptureUltimaParidad = false;

    bool CapturaExactaEsteFotograma = false;

    bool ComposeFielPreciso3D = false;
    u64 NativeComposePrefetchCount = 0;
    u64 NativeLazyProjectionCount = 0;
    bool CurrentCaptureScreenSwapHint = false;
    bool HasCurrentCaptureScreenSwapHint = false;
    u32 CurrentCaptureCntHint = 0;
    u32 CurrentCaptureDisplayCntHint = 0;
    bool PendingCaptureLineRequiresPrimaryFence = false;
    bool CurrentRenderScreenSwap = false;
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
    PerfSampleWindow<120> FinalCpuWindow;
    PerfSampleWindow<120> CaptureLineExportCpuWindow;
    PerfSampleWindow<120> InterpGpuWindow;
    PerfSampleWindow<120> BinGpuWindow;
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
    u32 LastGraphicsTextureLookupHitCount = 0;
    u32 LastGraphicsTextureLookupMissCount = 0;
    u32 LastGraphicsPersistentTextureHitCount = 0;
    u32 LastGraphicsPersistentTextureMissCount = 0;
    u64 LastGraphicsTexcacheResolveCpuNs = 0;
    u64 ContextMissCount = 0;
    u64 LateFrameCount = 0;
    u64 DroppedFrameCount = 0;
    u64 ReadbackColorRequestCount = 0;
    u64 ReadbackResultRequestCount = 0;
    u64 CapturePrepareRequestCount = 0;
    std::array<u64, 4> CaptureModeCounts{};
    std::array<u64, 4> CaptureSizeModeCounts{};
    std::array<u64, static_cast<size_t>(CapturePathMode::Count)> CapturePathModeCounts{};
    u64 CaptureSource3dCount = 0;
    u64 CaptureEnabledCount = 0;
    u64 CaptureLineExportCount = 0;
    u32 CaptureFinalizeTimeoutStreak = 0;
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
    bool FrameskipSaltoPendiente = false;
    bool FrameskipSaltoEsteFotograma = false;
    bool FrameskipPlaceholder3D = false;
    u64 FrameskipSaltos = 0;
    bool InEarlySubmitAttempt = false;
    u64 CurrentEarlySubmitContextWaitNs = 0;
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
