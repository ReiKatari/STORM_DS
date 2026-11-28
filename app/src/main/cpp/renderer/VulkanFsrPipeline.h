#ifndef MELONDS_VULKAN_FSR_PIPELINE_H
#define MELONDS_VULKAN_FSR_PIPELINE_H

#include <array>
#include <cstdint>
#include "VulkanDispatch.h"
#include "renderer/VulkanFilterMode.h"
#include "types.h"

namespace MelonDSAndroid
{
using melonDS::u32;
using melonDS::u64;

class VulkanFsrPipeline
{
public:
    struct ImageResource
    {
        VkImage image = VK_NULL_HANDLE;
        VkDeviceMemory memory = VK_NULL_HANDLE;
        VkImageView imageView = VK_NULL_HANDLE;
        VkFramebuffer framebuffer = VK_NULL_HANDLE;
        VkImageLayout layout = VK_IMAGE_LAYOUT_UNDEFINED;
        u32 width = 0;
        u32 height = 0;
    };

    struct SurfaceResources
    {
        ImageResource upscaleTemp;
        ImageResource rcasOutput;
        std::array<ImageResource, 2> fsr3History{};
        u32 fsr3HistoryIndex = 0;
        bool fsr3HistoryValid = false;
        u32 fsr3JitterPhase = 0;
        int lastQualityMode = -1;
        VulkanFilterMode lastMode = VulkanFilterMode::Nearest;

        std::array<ImageResource, 2> frameGenHistory{};
        std::array<bool, 2> frameGenHistoryIsBgr{false, false};
        ImageResource frameGenOutput;
        u32 frameGenWriteIndex = 0;
        u32 frameGenValidCount = 0;
        u64 lastCapturedFrameId = 0;

        VkCommandPool commandPool = VK_NULL_HANDLE;
        VkCommandBuffer commandBuffer = VK_NULL_HANDLE;
        VkFence fence = VK_NULL_HANDLE;
        VkDescriptorPool descriptorPool = VK_NULL_HANDLE;
        VkDescriptorSet easuDescriptorSet = VK_NULL_HANDLE;
        VkDescriptorSet rcasDescriptorSet = VK_NULL_HANDLE;
        std::array<VkDescriptorSet, 2> temporalDescriptorSets{VK_NULL_HANDLE, VK_NULL_HANDLE};
        std::array<VkDescriptorSet, 2> frameGenDescriptorSets{VK_NULL_HANDLE, VK_NULL_HANDLE};

        bool initialized = false;

        bool canInterpolate() const noexcept
        {
            return initialized
                && frameGenValidCount >= 2u
                && frameGenHistory[0].imageView != VK_NULL_HANDLE
                && frameGenHistory[1].imageView != VK_NULL_HANDLE
                && frameGenHistory[0].width == frameGenHistory[1].width
                && frameGenHistory[0].height == frameGenHistory[1].height;
        }
    };

    bool init(VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, u32 queueFamilyIndex, VkPipelineCache pipelineCache);
    void destroy();
    void destroySurfaceResources(SurfaceResources& res);
    void resetFsrHistory(SurfaceResources& res);
    void resetFrameGenHistory(SurfaceResources& res);

    bool runFsr(
        SurfaceResources& res,
        VulkanFilterMode mode,
        VkImage sourceImage,
        VkImageView sourceImageView,
        u32 sourceWidth,
        u32 sourceHeight,
        bool sourceIsBgr,
        int qualityMode,
        int sharpnessPercent,
        VkSemaphore waitSemaphore,
        VkSemaphore signalSemaphore,
        VkImage& outImage,
        VkImageView& outImageView);

    bool captureFrameGenHistory(
        SurfaceResources& res,
        u64 frameId,
        VkImage sourceImage,
        VkImageView sourceImageView,
        u32 sourceWidth,
        u32 sourceHeight,
        bool sourceIsBgr,
        VkSemaphore waitSemaphore,
        VkSemaphore signalSemaphore);

    bool runFrameGen(
        SurfaceResources& res,
        VkSemaphore signalSemaphore,
        VkImage& outImage,
        VkImageView& outImageView);

private:
    struct PushConstantsData
    {
        float vec0[4];
        float vec1[4];
        float vec2[4];
        float vec3[4];
    };

    bool ensureSurfaceSyncAndPool(SurfaceResources& res);
    bool ensureRenderImage(ImageResource& img, u32 width, u32 height, bool withFramebuffer);
    void destroyRenderImage(ImageResource& img);
    u32 findMemoryType(u32 typeBits, VkMemoryPropertyFlags properties) const;
    bool createShaderModule(const unsigned char* data, size_t len, VkShaderModule* outModule);
    bool createGraphicsPipeline(VkShaderModule fragModule, VkPipelineLayout layout, VkPipeline* outPipeline);
    void computeTargetSize(u32 srcW, u32 srcH, int qualityMode, u32& dstW, u32& dstH) const;
    void recordImageBarrier(
        VkCommandBuffer cmd,
        VkImage image,
        VkImageLayout oldLayout,
        VkImageLayout newLayout,
        VkAccessFlags srcAccess,
        VkAccessFlags dstAccess,
        VkPipelineStageFlags srcStage,
        VkPipelineStageFlags dstStage) const;
    void updateSingleInputDescriptor(VkDescriptorSet set, VkSampler sampler, VkImageView view);
    void updateDualInputDescriptor(VkDescriptorSet set, VkSampler sampler0, VkImageView view0, VkSampler sampler1, VkImageView view1);

    bool initialized = false;
    VkPhysicalDevice physicalDevice = VK_NULL_HANDLE;
    VkDevice device = VK_NULL_HANDLE;
    VkQueue queue = VK_NULL_HANDLE;
    u32 queueFamilyIndex = 0;
    VkPipelineCache pipelineCache = VK_NULL_HANDLE;
    u32 maxImageDim = 4096u;

    VkRenderPass offscreenRenderPass = VK_NULL_HANDLE;
    VkDescriptorSetLayout singleInputSetLayout = VK_NULL_HANDLE;
    VkDescriptorSetLayout dualInputSetLayout = VK_NULL_HANDLE;
    VkPipelineLayout singleInputPipelineLayout = VK_NULL_HANDLE;
    VkPipelineLayout dualInputPipelineLayout = VK_NULL_HANDLE;

    VkShaderModule quadVertModule = VK_NULL_HANDLE;
    VkShaderModule easuFragModule = VK_NULL_HANDLE;
    VkShaderModule temporalFragModule = VK_NULL_HANDLE;
    VkShaderModule rcasFragModule = VK_NULL_HANDLE;
    VkShaderModule frameGenFragModule = VK_NULL_HANDLE;

    VkPipeline easuPipeline = VK_NULL_HANDLE;
    VkPipeline temporalPipeline = VK_NULL_HANDLE;
    VkPipeline rcasPipeline = VK_NULL_HANDLE;
    VkPipeline frameGenPipeline = VK_NULL_HANDLE;

    VkSampler nearestSampler = VK_NULL_HANDLE;
    VkSampler linearSampler = VK_NULL_HANDLE;
};

} // namespace MelonDSAndroid

#endif // MELONDS_VULKAN_FSR_PIPELINE_H
