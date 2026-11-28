#include "renderer/VulkanFsrPipeline.h"

#include <algorithm>
#include <cmath>
#include <cstring>
#include <vector>

#include "Platform.h"
#include "VulkanContext.h"
#include "renderer/VulkanFullscreenQuadVertexShaderData.h"
#include "renderer/VulkanFsr1EasuFragmentShaderData.h"
#include "renderer/VulkanFsr3TemporalFragmentShaderData.h"
#include "renderer/VulkanFsrRcasFragmentShaderData.h"
#include "renderer/VulkanFrameGenInterpFragmentShaderData.h"

namespace MelonDSAndroid
{

namespace
{

constexpr VkFormat kOffscreenFormat = VK_FORMAT_R8G8B8A8_UNORM;

// 16-phase Halton (2, 3) sequence centered in [-0.5, 0.5]
constexpr float kHaltonX[16] = {
    0.0f, -0.25f, 0.25f, -0.375f, 0.125f, -0.125f, 0.375f, -0.4375f,
    0.0625f, -0.1875f, 0.3125f, -0.3125f, 0.1875f, -0.0625f, 0.4375f, -0.46875f,
};
constexpr float kHaltonY[16] = {
    -0.166667f, 0.166667f, -0.388889f, -0.055556f, 0.277778f, -0.277778f, 0.055556f, 0.388889f,
    -0.462963f, -0.129630f, 0.203704f, -0.351852f, -0.018519f, 0.314815f, -0.240741f, 0.092593f,
};

} // namespace

bool VulkanFsrPipeline::init(
    VkPhysicalDevice physicalDeviceIn,
    VkDevice deviceIn,
    VkQueue queueIn,
    u32 queueFamilyIndexIn,
    VkPipelineCache pipelineCacheIn)
{
    if (initialized)
        return true;

    physicalDevice = physicalDeviceIn;
    device = deviceIn;
    queue = queueIn;
    queueFamilyIndex = queueFamilyIndexIn;
    pipelineCache = pipelineCacheIn;
    if (device == VK_NULL_HANDLE || physicalDevice == VK_NULL_HANDLE || queue == VK_NULL_HANDLE)
        return false;

    const auto& limits = melonDS::VulkanContext::Get().GetDeviceLimits();
    maxImageDim = std::min(limits.maxImageDimension2D > 0 ? limits.maxImageDimension2D : 4096u, 4096u);

    auto createSampler = [&](VkFilter filter, VkSampler* outSampler) -> bool {
        VkSamplerCreateInfo samplerInfo{};
        samplerInfo.sType = VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO;
        samplerInfo.magFilter = filter;
        samplerInfo.minFilter = filter;
        samplerInfo.mipmapMode = VK_SAMPLER_MIPMAP_MODE_NEAREST;
        samplerInfo.addressModeU = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
        samplerInfo.addressModeV = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
        samplerInfo.addressModeW = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
        samplerInfo.maxLod = 1.0f;
        return vkCreateSampler(device, &samplerInfo, nullptr, outSampler) == VK_SUCCESS;
    };
    if (!createSampler(VK_FILTER_NEAREST, &nearestSampler) || !createSampler(VK_FILTER_LINEAR, &linearSampler))
    {
        destroy();
        return false;
    }

    VkAttachmentDescription attachment{};
    attachment.format = kOffscreenFormat;
    attachment.samples = VK_SAMPLE_COUNT_1_BIT;
    attachment.loadOp = VK_ATTACHMENT_LOAD_OP_DONT_CARE;
    attachment.storeOp = VK_ATTACHMENT_STORE_OP_STORE;
    attachment.stencilLoadOp = VK_ATTACHMENT_LOAD_OP_DONT_CARE;
    attachment.stencilStoreOp = VK_ATTACHMENT_STORE_OP_DONT_CARE;
    attachment.initialLayout = VK_IMAGE_LAYOUT_UNDEFINED;
    attachment.finalLayout = VK_IMAGE_LAYOUT_GENERAL;

    VkAttachmentReference colorRef{};
    colorRef.attachment = 0;
    colorRef.layout = VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;

    VkSubpassDescription subpass{};
    subpass.pipelineBindPoint = VK_PIPELINE_BIND_POINT_GRAPHICS;
    subpass.colorAttachmentCount = 1;
    subpass.pColorAttachments = &colorRef;

    VkRenderPassCreateInfo rpInfo{};
    rpInfo.sType = VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO;
    rpInfo.attachmentCount = 1;
    rpInfo.pAttachments = &attachment;
    rpInfo.subpassCount = 1;
    rpInfo.pSubpasses = &subpass;
    if (vkCreateRenderPass(device, &rpInfo, nullptr, &offscreenRenderPass) != VK_SUCCESS)
    {
        destroy();
        return false;
    }

    VkDescriptorSetLayoutBinding bindings[2]{};
    bindings[0].binding = 0;
    bindings[0].descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    bindings[0].descriptorCount = 1;
    bindings[0].stageFlags = VK_SHADER_STAGE_FRAGMENT_BIT;
    bindings[1].binding = 1;
    bindings[1].descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    bindings[1].descriptorCount = 1;
    bindings[1].stageFlags = VK_SHADER_STAGE_FRAGMENT_BIT;

    VkDescriptorSetLayoutCreateInfo set1Info{};
    set1Info.sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO;
    set1Info.bindingCount = 1;
    set1Info.pBindings = bindings;
    if (vkCreateDescriptorSetLayout(device, &set1Info, nullptr, &singleInputSetLayout) != VK_SUCCESS)
    {
        destroy();
        return false;
    }

    VkDescriptorSetLayoutCreateInfo set2Info{};
    set2Info.sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO;
    set2Info.bindingCount = 2;
    set2Info.pBindings = bindings;
    if (vkCreateDescriptorSetLayout(device, &set2Info, nullptr, &dualInputSetLayout) != VK_SUCCESS)
    {
        destroy();
        return false;
    }

    VkPushConstantRange pushRange{};
    pushRange.stageFlags = VK_SHADER_STAGE_FRAGMENT_BIT;
    pushRange.offset = 0;
    pushRange.size = sizeof(PushConstantsData);

    VkPipelineLayoutCreateInfo pl1Info{};
    pl1Info.sType = VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO;
    pl1Info.setLayoutCount = 1;
    pl1Info.pSetLayouts = &singleInputSetLayout;
    pl1Info.pushConstantRangeCount = 1;
    pl1Info.pPushConstantRanges = &pushRange;
    if (vkCreatePipelineLayout(device, &pl1Info, nullptr, &singleInputPipelineLayout) != VK_SUCCESS)
    {
        destroy();
        return false;
    }

    VkPipelineLayoutCreateInfo pl2Info{};
    pl2Info.sType = VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO;
    pl2Info.setLayoutCount = 1;
    pl2Info.pSetLayouts = &dualInputSetLayout;
    pl2Info.pushConstantRangeCount = 1;
    pl2Info.pPushConstantRanges = &pushRange;
    if (vkCreatePipelineLayout(device, &pl2Info, nullptr, &dualInputPipelineLayout) != VK_SUCCESS)
    {
        destroy();
        return false;
    }

    if (!createShaderModule(melonDS_android_vulkan_fullscreen_quad_vert_spv, melonDS_android_vulkan_fullscreen_quad_vert_spv_len, &quadVertModule)
        || !createShaderModule(melonDS_android_vulkan_fsr1_easu_frag_spv, melonDS_android_vulkan_fsr1_easu_frag_spv_len, &easuFragModule)
        || !createShaderModule(melonDS_android_vulkan_fsr3_temporal_frag_spv, melonDS_android_vulkan_fsr3_temporal_frag_spv_len, &temporalFragModule)
        || !createShaderModule(melonDS_android_vulkan_fsr_rcas_frag_spv, melonDS_android_vulkan_fsr_rcas_frag_spv_len, &rcasFragModule)
        || !createShaderModule(melonDS_android_vulkan_frame_gen_interp_frag_spv, melonDS_android_vulkan_frame_gen_interp_frag_spv_len, &frameGenFragModule))
    {
        destroy();
        return false;
    }

    if (!createGraphicsPipeline(easuFragModule, singleInputPipelineLayout, &easuPipeline)
        || !createGraphicsPipeline(temporalFragModule, dualInputPipelineLayout, &temporalPipeline)
        || !createGraphicsPipeline(rcasFragModule, singleInputPipelineLayout, &rcasPipeline)
        || !createGraphicsPipeline(frameGenFragModule, dualInputPipelineLayout, &frameGenPipeline))
    {
        destroy();
        return false;
    }

    initialized = true;
    return true;
}

void VulkanFsrPipeline::destroy()
{
    if (device != VK_NULL_HANDLE)
    {
        auto destroyPipelineSafe = [&](VkPipeline& p) {
            if (p != VK_NULL_HANDLE)
            {
                vkDestroyPipeline(device, p, nullptr);
                p = VK_NULL_HANDLE;
            }
        };
        auto destroyModuleSafe = [&](VkShaderModule& m) {
            if (m != VK_NULL_HANDLE)
            {
                vkDestroyShaderModule(device, m, nullptr);
                m = VK_NULL_HANDLE;
            }
        };
        destroyPipelineSafe(easuPipeline);
        destroyPipelineSafe(temporalPipeline);
        destroyPipelineSafe(rcasPipeline);
        destroyPipelineSafe(frameGenPipeline);
        destroyModuleSafe(quadVertModule);
        destroyModuleSafe(easuFragModule);
        destroyModuleSafe(temporalFragModule);
        destroyModuleSafe(rcasFragModule);
        destroyModuleSafe(frameGenFragModule);

        if (singleInputPipelineLayout != VK_NULL_HANDLE)
        {
            vkDestroyPipelineLayout(device, singleInputPipelineLayout, nullptr);
            singleInputPipelineLayout = VK_NULL_HANDLE;
        }
        if (dualInputPipelineLayout != VK_NULL_HANDLE)
        {
            vkDestroyPipelineLayout(device, dualInputPipelineLayout, nullptr);
            dualInputPipelineLayout = VK_NULL_HANDLE;
        }
        if (singleInputSetLayout != VK_NULL_HANDLE)
        {
            vkDestroyDescriptorSetLayout(device, singleInputSetLayout, nullptr);
            singleInputSetLayout = VK_NULL_HANDLE;
        }
        if (dualInputSetLayout != VK_NULL_HANDLE)
        {
            vkDestroyDescriptorSetLayout(device, dualInputSetLayout, nullptr);
            dualInputSetLayout = VK_NULL_HANDLE;
        }
        if (offscreenRenderPass != VK_NULL_HANDLE)
        {
            vkDestroyRenderPass(device, offscreenRenderPass, nullptr);
            offscreenRenderPass = VK_NULL_HANDLE;
        }
        if (nearestSampler != VK_NULL_HANDLE)
        {
            vkDestroySampler(device, nearestSampler, nullptr);
            nearestSampler = VK_NULL_HANDLE;
        }
        if (linearSampler != VK_NULL_HANDLE)
        {
            vkDestroySampler(device, linearSampler, nullptr);
            linearSampler = VK_NULL_HANDLE;
        }
    }

    initialized = false;
    device = VK_NULL_HANDLE;
    physicalDevice = VK_NULL_HANDLE;
    queue = VK_NULL_HANDLE;
    pipelineCache = VK_NULL_HANDLE;
}

void VulkanFsrPipeline::destroySurfaceResources(SurfaceResources& res)
{
    if (device != VK_NULL_HANDLE)
    {
        if (res.fence != VK_NULL_HANDLE)
        {
            (void)vkWaitForFences(device, 1, &res.fence, VK_TRUE, UINT64_MAX);
            vkDestroyFence(device, res.fence, nullptr);
            res.fence = VK_NULL_HANDLE;
        }
        if (res.descriptorPool != VK_NULL_HANDLE)
        {
            vkDestroyDescriptorPool(device, res.descriptorPool, nullptr);
            res.descriptorPool = VK_NULL_HANDLE;
        }
        if (res.commandPool != VK_NULL_HANDLE)
        {
            vkDestroyCommandPool(device, res.commandPool, nullptr);
            res.commandPool = VK_NULL_HANDLE;
        }
    }
    res.commandBuffer = VK_NULL_HANDLE;
    res.easuDescriptorSet = VK_NULL_HANDLE;
    res.rcasDescriptorSet = VK_NULL_HANDLE;
    res.temporalDescriptorSets.fill(VK_NULL_HANDLE);
    res.frameGenDescriptorSets.fill(VK_NULL_HANDLE);

    destroyRenderImage(res.upscaleTemp);
    destroyRenderImage(res.rcasOutput);
    destroyRenderImage(res.fsr3History[0]);
    destroyRenderImage(res.fsr3History[1]);
    destroyRenderImage(res.frameGenHistory[0]);
    destroyRenderImage(res.frameGenHistory[1]);
    destroyRenderImage(res.frameGenOutput);

    res.fsr3HistoryIndex = 0;
    res.fsr3HistoryValid = false;
    res.fsr3JitterPhase = 0;
    res.lastQualityMode = -1;
    res.lastMode = VulkanFilterMode::Nearest;
    res.frameGenHistoryIsBgr = {false, false};
    res.frameGenWriteIndex = 0;
    res.frameGenValidCount = 0;
    res.lastCapturedFrameId = 0;
    res.initialized = false;
}

void VulkanFsrPipeline::resetFsrHistory(SurfaceResources& res)
{
    res.fsr3HistoryValid = false;
    res.fsr3JitterPhase = 0;
}

void VulkanFsrPipeline::resetFrameGenHistory(SurfaceResources& res)
{
    res.frameGenValidCount = 0;
    res.frameGenWriteIndex = 0;
    res.lastCapturedFrameId = 0;
}

bool VulkanFsrPipeline::ensureSurfaceSyncAndPool(SurfaceResources& res)
{
    if (res.initialized)
        return true;

    VkCommandPoolCreateInfo poolInfo{};
    poolInfo.sType = VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO;
    poolInfo.flags = VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT;
    poolInfo.queueFamilyIndex = queueFamilyIndex;
    if (vkCreateCommandPool(device, &poolInfo, nullptr, &res.commandPool) != VK_SUCCESS)
    {
        destroySurfaceResources(res);
        return false;
    }

    VkCommandBufferAllocateInfo cmdInfo{};
    cmdInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO;
    cmdInfo.commandPool = res.commandPool;
    cmdInfo.level = VK_COMMAND_BUFFER_LEVEL_PRIMARY;
    cmdInfo.commandBufferCount = 1;
    if (vkAllocateCommandBuffers(device, &cmdInfo, &res.commandBuffer) != VK_SUCCESS)
    {
        destroySurfaceResources(res);
        return false;
    }

    VkFenceCreateInfo fenceInfo{};
    fenceInfo.sType = VK_STRUCTURE_TYPE_FENCE_CREATE_INFO;
    fenceInfo.flags = VK_FENCE_CREATE_SIGNALED_BIT;
    if (vkCreateFence(device, &fenceInfo, nullptr, &res.fence) != VK_SUCCESS)
    {
        destroySurfaceResources(res);
        return false;
    }

    VkDescriptorPoolSize poolSize{};
    poolSize.type = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    poolSize.descriptorCount = 16;

    VkDescriptorPoolCreateInfo dpInfo{};
    dpInfo.sType = VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO;
    dpInfo.maxSets = 8;
    dpInfo.poolSizeCount = 1;
    dpInfo.pPoolSizes = &poolSize;
    if (vkCreateDescriptorPool(device, &dpInfo, nullptr, &res.descriptorPool) != VK_SUCCESS)
    {
        destroySurfaceResources(res);
        return false;
    }

    std::array<VkDescriptorSetLayout, 6> layouts = {
        singleInputSetLayout,
        singleInputSetLayout,
        dualInputSetLayout,
        dualInputSetLayout,
        dualInputSetLayout,
        dualInputSetLayout,
    };
    std::array<VkDescriptorSet, 6> sets{};
    VkDescriptorSetAllocateInfo allocInfo{};
    allocInfo.sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO;
    allocInfo.descriptorPool = res.descriptorPool;
    allocInfo.descriptorSetCount = static_cast<u32>(sets.size());
    allocInfo.pSetLayouts = layouts.data();
    if (vkAllocateDescriptorSets(device, &allocInfo, sets.data()) != VK_SUCCESS)
    {
        destroySurfaceResources(res);
        return false;
    }

    res.easuDescriptorSet = sets[0];
    res.rcasDescriptorSet = sets[1];
    res.temporalDescriptorSets[0] = sets[2];
    res.temporalDescriptorSets[1] = sets[3];
    res.frameGenDescriptorSets[0] = sets[4];
    res.frameGenDescriptorSets[1] = sets[5];
    res.initialized = true;
    return true;
}

bool VulkanFsrPipeline::ensureRenderImage(ImageResource& img, u32 width, u32 height, bool withFramebuffer)
{
    if (width == 0 || height == 0)
        return false;

    const bool hasFb = !withFramebuffer || img.framebuffer != VK_NULL_HANDLE;
    if (img.image != VK_NULL_HANDLE && img.imageView != VK_NULL_HANDLE && hasFb
        && img.width == width && img.height == height)
    {
        return true;
    }

    destroyRenderImage(img);

    VkImageCreateInfo imgInfo{};
    imgInfo.sType = VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO;
    imgInfo.imageType = VK_IMAGE_TYPE_2D;
    imgInfo.format = kOffscreenFormat;
    imgInfo.extent = {width, height, 1u};
    imgInfo.mipLevels = 1;
    imgInfo.arrayLayers = 1;
    imgInfo.samples = VK_SAMPLE_COUNT_1_BIT;
    imgInfo.tiling = VK_IMAGE_TILING_OPTIMAL;
    imgInfo.usage = VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT
        | VK_IMAGE_USAGE_SAMPLED_BIT
        | VK_IMAGE_USAGE_TRANSFER_SRC_BIT
        | VK_IMAGE_USAGE_TRANSFER_DST_BIT;
    imgInfo.sharingMode = VK_SHARING_MODE_EXCLUSIVE;
    imgInfo.initialLayout = VK_IMAGE_LAYOUT_UNDEFINED;
    if (vkCreateImage(device, &imgInfo, nullptr, &img.image) != VK_SUCCESS)
    {
        destroyRenderImage(img);
        return false;
    }

    VkMemoryRequirements memReq{};
    vkGetImageMemoryRequirements(device, img.image, &memReq);

    VkMemoryAllocateInfo allocInfo{};
    allocInfo.sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO;
    allocInfo.allocationSize = memReq.size;
    allocInfo.memoryTypeIndex = findMemoryType(memReq.memoryTypeBits, VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT);
    if (allocInfo.memoryTypeIndex == UINT32_MAX
        || vkAllocateMemory(device, &allocInfo, nullptr, &img.memory) != VK_SUCCESS
        || vkBindImageMemory(device, img.image, img.memory, 0) != VK_SUCCESS)
    {
        destroyRenderImage(img);
        return false;
    }

    VkImageViewCreateInfo viewInfo{};
    viewInfo.sType = VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO;
    viewInfo.image = img.image;
    viewInfo.viewType = VK_IMAGE_VIEW_TYPE_2D;
    viewInfo.format = kOffscreenFormat;
    viewInfo.subresourceRange = {VK_IMAGE_ASPECT_COLOR_BIT, 0, 1, 0, 1};
    if (vkCreateImageView(device, &viewInfo, nullptr, &img.imageView) != VK_SUCCESS)
    {
        destroyRenderImage(img);
        return false;
    }

    if (withFramebuffer)
    {
        VkFramebufferCreateInfo fbInfo{};
        fbInfo.sType = VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO;
        fbInfo.renderPass = offscreenRenderPass;
        fbInfo.attachmentCount = 1;
        fbInfo.pAttachments = &img.imageView;
        fbInfo.width = width;
        fbInfo.height = height;
        fbInfo.layers = 1;
        if (vkCreateFramebuffer(device, &fbInfo, nullptr, &img.framebuffer) != VK_SUCCESS)
        {
            destroyRenderImage(img);
            return false;
        }
    }

    img.width = width;
    img.height = height;
    img.layout = VK_IMAGE_LAYOUT_UNDEFINED;
    return true;
}

void VulkanFsrPipeline::destroyRenderImage(ImageResource& img)
{
    if (device != VK_NULL_HANDLE)
    {
        if (img.framebuffer != VK_NULL_HANDLE)
            vkDestroyFramebuffer(device, img.framebuffer, nullptr);
        if (img.imageView != VK_NULL_HANDLE)
            vkDestroyImageView(device, img.imageView, nullptr);
        if (img.image != VK_NULL_HANDLE)
            vkDestroyImage(device, img.image, nullptr);
        if (img.memory != VK_NULL_HANDLE)
            vkFreeMemory(device, img.memory, nullptr);
    }
    img = {};
}

u32 VulkanFsrPipeline::findMemoryType(u32 typeBits, VkMemoryPropertyFlags properties) const
{
    VkPhysicalDeviceMemoryProperties memProps{};
    vkGetPhysicalDeviceMemoryProperties(physicalDevice, &memProps);
    for (u32 i = 0; i < memProps.memoryTypeCount; ++i)
    {
        if ((typeBits & (1u << i)) != 0 && (memProps.memoryTypes[i].propertyFlags & properties) == properties)
            return i;
    }
    return UINT32_MAX;
}

bool VulkanFsrPipeline::createShaderModule(const unsigned char* data, size_t len, VkShaderModule* outModule)
{
    std::vector<u32> words((len + sizeof(u32) - 1u) / sizeof(u32));
    std::memcpy(words.data(), data, len);

    VkShaderModuleCreateInfo info{};
    info.sType = VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO;
    info.codeSize = len;
    info.pCode = words.data();
    return vkCreateShaderModule(device, &info, nullptr, outModule) == VK_SUCCESS;
}

bool VulkanFsrPipeline::createGraphicsPipeline(VkShaderModule fragModule, VkPipelineLayout layout, VkPipeline* outPipeline)
{
    VkPipelineShaderStageCreateInfo stages[2]{};
    stages[0].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
    stages[0].stage = VK_SHADER_STAGE_VERTEX_BIT;
    stages[0].module = quadVertModule;
    stages[0].pName = "main";
    stages[1].sType = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO;
    stages[1].stage = VK_SHADER_STAGE_FRAGMENT_BIT;
    stages[1].module = fragModule;
    stages[1].pName = "main";

    VkPipelineVertexInputStateCreateInfo vertexInput{};
    vertexInput.sType = VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO;

    VkPipelineInputAssemblyStateCreateInfo inputAssembly{};
    inputAssembly.sType = VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO;
    inputAssembly.topology = VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST;

    VkPipelineViewportStateCreateInfo viewportState{};
    viewportState.sType = VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO;
    viewportState.viewportCount = 1;
    viewportState.scissorCount = 1;

    VkPipelineRasterizationStateCreateInfo raster{};
    raster.sType = VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO;
    raster.polygonMode = VK_POLYGON_MODE_FILL;
    raster.cullMode = VK_CULL_MODE_NONE;
    raster.frontFace = VK_FRONT_FACE_COUNTER_CLOCKWISE;
    raster.lineWidth = 1.0f;

    VkPipelineMultisampleStateCreateInfo multisample{};
    multisample.sType = VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO;
    multisample.rasterizationSamples = VK_SAMPLE_COUNT_1_BIT;

    VkPipelineColorBlendAttachmentState blendAttachment{};
    blendAttachment.colorWriteMask = VK_COLOR_COMPONENT_R_BIT
        | VK_COLOR_COMPONENT_G_BIT
        | VK_COLOR_COMPONENT_B_BIT
        | VK_COLOR_COMPONENT_A_BIT;

    VkPipelineColorBlendStateCreateInfo blend{};
    blend.sType = VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO;
    blend.attachmentCount = 1;
    blend.pAttachments = &blendAttachment;

    const VkDynamicState dynStates[2] = {VK_DYNAMIC_STATE_VIEWPORT, VK_DYNAMIC_STATE_SCISSOR};
    VkPipelineDynamicStateCreateInfo dyn{};
    dyn.sType = VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO;
    dyn.dynamicStateCount = 2;
    dyn.pDynamicStates = dynStates;

    VkGraphicsPipelineCreateInfo info{};
    info.sType = VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO;
    info.stageCount = 2;
    info.pStages = stages;
    info.pVertexInputState = &vertexInput;
    info.pInputAssemblyState = &inputAssembly;
    info.pViewportState = &viewportState;
    info.pRasterizationState = &raster;
    info.pMultisampleState = &multisample;
    info.pColorBlendState = &blend;
    info.pDynamicState = &dyn;
    info.layout = layout;
    info.renderPass = offscreenRenderPass;
    info.subpass = 0;

    return vkCreateGraphicsPipelines(device, pipelineCache, 1, &info, nullptr, outPipeline) == VK_SUCCESS;
}

void VulkanFsrPipeline::computeTargetSize(u32 srcW, u32 srcH, int qualityMode, u32& dstW, u32& dstH) const
{
    float scale = 2.0f;
    u32 maxW = 1536u;
    u32 maxH = 2304u;
    switch (std::clamp(qualityMode, 0, 3))
    {
        case 0: // Ultra Quality
            scale = 3.0f;
            maxW = 1536u;
            maxH = 2304u;
            break;
        case 1: // Quality
            scale = 2.5f;
            maxW = 1280u;
            maxH = 1920u;
            break;
        case 2: // Balanced
            scale = 2.0f;
            maxW = 1024u;
            maxH = 1536u;
            break;
        case 3: // Performance
        default:
            scale = 1.5f;
            maxW = 768u;
            maxH = 1152u;
            break;
    }

    maxW = std::min(maxW, maxImageDim);
    maxH = std::min(maxH, maxImageDim);

    const u32 scaledW = static_cast<u32>(std::lround(static_cast<double>(srcW) * scale));
    const u32 scaledH = static_cast<u32>(std::lround(static_cast<double>(srcH) * scale));
    dstW = std::max(srcW, std::min(scaledW, std::max(srcW, maxW)));
    dstH = std::max(srcH, std::min(scaledH, std::max(srcH, maxH)));
    if ((dstH & 1u) != 0u)
        dstH += 1u;
    dstW = std::min(dstW, maxImageDim);
    dstH = std::min(dstH, maxImageDim);
}

void VulkanFsrPipeline::recordImageBarrier(
    VkCommandBuffer cmd,
    VkImage image,
    VkImageLayout oldLayout,
    VkImageLayout newLayout,
    VkAccessFlags srcAccess,
    VkAccessFlags dstAccess,
    VkPipelineStageFlags srcStage,
    VkPipelineStageFlags dstStage) const
{
    VkImageMemoryBarrier barrier{};
    barrier.sType = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER;
    barrier.oldLayout = oldLayout;
    barrier.newLayout = newLayout;
    barrier.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    barrier.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED;
    barrier.image = image;
    barrier.subresourceRange = {VK_IMAGE_ASPECT_COLOR_BIT, 0, 1, 0, 1};
    barrier.srcAccessMask = srcAccess;
    barrier.dstAccessMask = dstAccess;
    vkCmdPipelineBarrier(cmd, srcStage, dstStage, 0, 0, nullptr, 0, nullptr, 1, &barrier);
}

void VulkanFsrPipeline::updateSingleInputDescriptor(VkDescriptorSet set, VkSampler sampler, VkImageView view)
{
    VkDescriptorImageInfo imgInfo{};
    imgInfo.sampler = sampler;
    imgInfo.imageView = view;
    imgInfo.imageLayout = VK_IMAGE_LAYOUT_GENERAL;

    VkWriteDescriptorSet write{};
    write.sType = VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET;
    write.dstSet = set;
    write.dstBinding = 0;
    write.descriptorCount = 1;
    write.descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    write.pImageInfo = &imgInfo;
    vkUpdateDescriptorSets(device, 1, &write, 0, nullptr);
}

void VulkanFsrPipeline::updateDualInputDescriptor(
    VkDescriptorSet set,
    VkSampler sampler0,
    VkImageView view0,
    VkSampler sampler1,
    VkImageView view1)
{
    VkDescriptorImageInfo imgInfos[2]{};
    imgInfos[0].sampler = sampler0;
    imgInfos[0].imageView = view0;
    imgInfos[0].imageLayout = VK_IMAGE_LAYOUT_GENERAL;
    imgInfos[1].sampler = sampler1;
    imgInfos[1].imageView = view1;
    imgInfos[1].imageLayout = VK_IMAGE_LAYOUT_GENERAL;

    VkWriteDescriptorSet writes[2]{};
    writes[0].sType = VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET;
    writes[0].dstSet = set;
    writes[0].dstBinding = 0;
    writes[0].descriptorCount = 1;
    writes[0].descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    writes[0].pImageInfo = &imgInfos[0];

    writes[1].sType = VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET;
    writes[1].dstSet = set;
    writes[1].dstBinding = 1;
    writes[1].descriptorCount = 1;
    writes[1].descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    writes[1].pImageInfo = &imgInfos[1];

    vkUpdateDescriptorSets(device, 2, writes, 0, nullptr);
}

bool VulkanFsrPipeline::runFsr(
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
    VkImageView& outImageView)
{
    outImage = VK_NULL_HANDLE;
    outImageView = VK_NULL_HANDLE;
    if (!initialized || sourceImage == VK_NULL_HANDLE || sourceImageView == VK_NULL_HANDLE
        || sourceWidth < 2u || sourceHeight < 2u)
    {
        return false;
    }

    if (mode != VulkanFilterMode::Fsr1 && mode != VulkanFilterMode::Fsr3)
        return false;

    if (!ensureSurfaceSyncAndPool(res))
        return false;

    if (vkWaitForFences(device, 1, &res.fence, VK_TRUE, UINT64_MAX) != VK_SUCCESS)
        return false;

    u32 dstW = 0;
    u32 dstH = 0;
    computeTargetSize(sourceWidth, sourceHeight, qualityMode, dstW, dstH);

    const bool modeOrQualityChanged = (res.lastMode != mode || res.lastQualityMode != qualityMode);
    if (modeOrQualityChanged)
    {
        res.fsr3HistoryValid = false;
        res.fsr3JitterPhase = 0;
        res.lastMode = mode;
        res.lastQualityMode = qualityMode;
    }

    if (!ensureRenderImage(res.rcasOutput, dstW, dstH, true))
        return false;

    const u32 writeIdx = res.fsr3HistoryIndex & 1u;
    const u32 prevIdx = 1u - writeIdx;
    ImageResource* pass1Target = nullptr;
    if (mode == VulkanFilterMode::Fsr1)
    {
        if (!ensureRenderImage(res.upscaleTemp, dstW, dstH, true))
            return false;
        pass1Target = &res.upscaleTemp;
    }
    else
    {
        const bool histSizeChanged =
            res.fsr3History[0].width != dstW || res.fsr3History[0].height != dstH;
        if (!ensureRenderImage(res.fsr3History[0], dstW, dstH, true)
            || !ensureRenderImage(res.fsr3History[1], dstW, dstH, true))
        {
            return false;
        }
        if (histSizeChanged)
        {
            res.fsr3HistoryValid = false;
            res.fsr3JitterPhase = 0;
        }
        pass1Target = &res.fsr3History[writeIdx];
    }

    // Update descriptors while fence guarantees no GPU execution is touching them
    if (mode == VulkanFilterMode::Fsr1)
    {
        updateSingleInputDescriptor(res.easuDescriptorSet, nearestSampler, sourceImageView);
    }
    else
    {
        updateDualInputDescriptor(
            res.temporalDescriptorSets[writeIdx],
            linearSampler,
            sourceImageView,
            linearSampler,
            res.fsr3History[prevIdx].imageView);
    }
    updateSingleInputDescriptor(res.rcasDescriptorSet, nearestSampler, pass1Target->imageView);

    if (vkResetFences(device, 1, &res.fence) != VK_SUCCESS
        || vkResetCommandBuffer(res.commandBuffer, 0) != VK_SUCCESS)
    {
        return false;
    }

    VkCommandBufferBeginInfo beginInfo{};
    beginInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO;
    beginInfo.flags = VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    if (vkBeginCommandBuffer(res.commandBuffer, &beginInfo) != VK_SUCCESS)
        return false;

    const float sharpness = static_cast<float>(std::clamp(sharpnessPercent, 0, 100)) / 100.0f;
    const VkViewport viewport{0.0f, 0.0f, static_cast<float>(dstW), static_cast<float>(dstH), 0.0f, 1.0f};
    const VkRect2D scissor{{0, 0}, {dstW, dstH}};

    if (mode == VulkanFilterMode::Fsr3 && res.fsr3History[prevIdx].layout != VK_IMAGE_LAYOUT_GENERAL)
    {
        recordImageBarrier(
            res.commandBuffer,
            res.fsr3History[prevIdx].image,
            res.fsr3History[prevIdx].layout,
            VK_IMAGE_LAYOUT_GENERAL,
            0,
            VK_ACCESS_SHADER_READ_BIT,
            VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT,
            VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT);
        res.fsr3History[prevIdx].layout = VK_IMAGE_LAYOUT_GENERAL;
    }

    // Pass 1: EASU (FSR 1) or Temporal Accumulation (FSR 3) -> pass1Target (GENERAL)
    VkRenderPassBeginInfo rp1Info{};
    rp1Info.sType = VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO;
    rp1Info.renderPass = offscreenRenderPass;
    rp1Info.framebuffer = pass1Target->framebuffer;
    rp1Info.renderArea = scissor;
    vkCmdBeginRenderPass(res.commandBuffer, &rp1Info, VK_SUBPASS_CONTENTS_INLINE);
    vkCmdSetViewport(res.commandBuffer, 0, 1, &viewport);
    vkCmdSetScissor(res.commandBuffer, 0, 1, &scissor);

    PushConstantsData push1{};
    push1.vec0[0] = static_cast<float>(sourceWidth);
    push1.vec0[1] = static_cast<float>(sourceHeight);
    push1.vec0[2] = 1.0f / static_cast<float>(sourceWidth);
    push1.vec0[3] = 1.0f / static_cast<float>(sourceHeight);
    push1.vec1[0] = static_cast<float>(dstW);
    push1.vec1[1] = static_cast<float>(dstH);
    push1.vec1[2] = 1.0f / static_cast<float>(dstW);
    push1.vec1[3] = 1.0f / static_cast<float>(dstH);

    if (mode == VulkanFilterMode::Fsr1)
    {
        push1.vec2[0] = sharpness;
        push1.vec2[1] = sourceIsBgr ? 1.0f : 0.0f;
        vkCmdBindPipeline(res.commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, easuPipeline);
        vkCmdBindDescriptorSets(res.commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, singleInputPipelineLayout, 0, 1, &res.easuDescriptorSet, 0, nullptr);
        vkCmdPushConstants(res.commandBuffer, singleInputPipelineLayout, VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(push1), &push1);
    }
    else
    {
        const u32 phase = res.fsr3JitterPhase % 16u;
        const float jitterScale = 0.35f;
        const float alphaByPreset[4] = {0.90f, 0.88f, 0.85f, 0.80f};
        const float alpha = res.fsr3HistoryValid ? alphaByPreset[std::clamp(qualityMode, 0, 3)] : 0.0f;
        push1.vec2[0] = (kHaltonX[phase] * jitterScale) / static_cast<float>(sourceWidth);
        push1.vec2[1] = (kHaltonY[phase] * jitterScale) / static_cast<float>(sourceHeight);
        push1.vec2[2] = alpha;
        push1.vec2[3] = 1.25f;
        push1.vec3[0] = sourceIsBgr ? 1.0f : 0.0f;
        vkCmdBindPipeline(res.commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, temporalPipeline);
        vkCmdBindDescriptorSets(res.commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, dualInputPipelineLayout, 0, 1, &res.temporalDescriptorSets[writeIdx], 0, nullptr);
        vkCmdPushConstants(res.commandBuffer, dualInputPipelineLayout, VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(push1), &push1);

        res.fsr3HistoryValid = true;
        res.fsr3HistoryIndex = prevIdx;
        res.fsr3JitterPhase = (res.fsr3JitterPhase + 1u) % 16u;
    }
    vkCmdDraw(res.commandBuffer, 3, 1, 0, 0);
    vkCmdEndRenderPass(res.commandBuffer);
    pass1Target->layout = VK_IMAGE_LAYOUT_GENERAL;

    // Barrier between Pass 1 color write and Pass 2 RCAS shader read
    recordImageBarrier(
        res.commandBuffer,
        pass1Target->image,
        VK_IMAGE_LAYOUT_GENERAL,
        VK_IMAGE_LAYOUT_GENERAL,
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT,
        VK_ACCESS_SHADER_READ_BIT,
        VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT,
        VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT);

    // Pass 2: RCAS sharpening -> rcasOutput (GENERAL)
    VkRenderPassBeginInfo rp2Info{};
    rp2Info.sType = VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO;
    rp2Info.renderPass = offscreenRenderPass;
    rp2Info.framebuffer = res.rcasOutput.framebuffer;
    rp2Info.renderArea = scissor;
    vkCmdBeginRenderPass(res.commandBuffer, &rp2Info, VK_SUBPASS_CONTENTS_INLINE);
    vkCmdSetViewport(res.commandBuffer, 0, 1, &viewport);
    vkCmdSetScissor(res.commandBuffer, 0, 1, &scissor);
    vkCmdBindPipeline(res.commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, rcasPipeline);
    vkCmdBindDescriptorSets(res.commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, singleInputPipelineLayout, 0, 1, &res.rcasDescriptorSet, 0, nullptr);

    PushConstantsData push2{};
    push2.vec0[0] = static_cast<float>(dstW);
    push2.vec0[1] = static_cast<float>(dstH);
    push2.vec0[2] = 1.0f / static_cast<float>(dstW);
    push2.vec0[3] = 1.0f / static_cast<float>(dstH);
    push2.vec1[0] = sharpness;
    vkCmdPushConstants(res.commandBuffer, singleInputPipelineLayout, VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(push2), &push2);
    vkCmdDraw(res.commandBuffer, 3, 1, 0, 0);
    vkCmdEndRenderPass(res.commandBuffer);
    res.rcasOutput.layout = VK_IMAGE_LAYOUT_GENERAL;

    recordImageBarrier(
        res.commandBuffer,
        res.rcasOutput.image,
        VK_IMAGE_LAYOUT_GENERAL,
        VK_IMAGE_LAYOUT_GENERAL,
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT,
        VK_ACCESS_SHADER_READ_BIT | VK_ACCESS_TRANSFER_READ_BIT,
        VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT,
        VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT | VK_PIPELINE_STAGE_TRANSFER_BIT);

    if (vkEndCommandBuffer(res.commandBuffer) != VK_SUCCESS)
        return false;

    const VkPipelineStageFlags waitStage = VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT;
    VkSubmitInfo submitInfo{};
    submitInfo.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO;
    if (waitSemaphore != VK_NULL_HANDLE)
    {
        submitInfo.waitSemaphoreCount = 1;
        submitInfo.pWaitSemaphores = &waitSemaphore;
        submitInfo.pWaitDstStageMask = &waitStage;
    }
    submitInfo.commandBufferCount = 1;
    submitInfo.pCommandBuffers = &res.commandBuffer;
    if (signalSemaphore != VK_NULL_HANDLE)
    {
        submitInfo.signalSemaphoreCount = 1;
        submitInfo.pSignalSemaphores = &signalSemaphore;
    }

    {
        std::scoped_lock queueLock(melonDS::VulkanContext::Get().GetPresentQueueLock());
        if (vkQueueSubmit(queue, 1, &submitInfo, res.fence) != VK_SUCCESS)
            return false;
    }

    outImage = res.rcasOutput.image;
    outImageView = res.rcasOutput.imageView;
    return true;
}

bool VulkanFsrPipeline::captureFrameGenHistory(
    SurfaceResources& res,
    u64 frameId,
    VkImage sourceImage,
    VkImageView sourceImageView,
    u32 sourceWidth,
    u32 sourceHeight,
    bool sourceIsBgr,
    VkSemaphore waitSemaphore,
    VkSemaphore signalSemaphore)
{
    (void)sourceImageView;
    if (!initialized || sourceImage == VK_NULL_HANDLE || sourceWidth < 2u || sourceHeight < 2u)
        return false;

    if (res.frameGenValidCount >= 2u && res.lastCapturedFrameId == frameId)
        return false;

    if (!ensureSurfaceSyncAndPool(res))
        return false;

    if (vkWaitForFences(device, 1, &res.fence, VK_TRUE, UINT64_MAX) != VK_SUCCESS)
        return false;

    const bool dimsChanged =
        res.frameGenHistory[0].width != sourceWidth || res.frameGenHistory[0].height != sourceHeight;
    if (!ensureRenderImage(res.frameGenHistory[0], sourceWidth, sourceHeight, false)
        || !ensureRenderImage(res.frameGenHistory[1], sourceWidth, sourceHeight, false)
        || !ensureRenderImage(res.frameGenOutput, sourceWidth, sourceHeight, true))
    {
        return false;
    }
    if (dimsChanged)
    {
        res.frameGenValidCount = 0;
        res.frameGenWriteIndex = 0;
    }

    const u32 slot = res.frameGenWriteIndex & 1u;
    ImageResource& dst = res.frameGenHistory[slot];

    if (vkResetFences(device, 1, &res.fence) != VK_SUCCESS
        || vkResetCommandBuffer(res.commandBuffer, 0) != VK_SUCCESS)
    {
        return false;
    }

    VkCommandBufferBeginInfo beginInfo{};
    beginInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO;
    beginInfo.flags = VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    if (vkBeginCommandBuffer(res.commandBuffer, &beginInfo) != VK_SUCCESS)
        return false;

    recordImageBarrier(
        res.commandBuffer,
        sourceImage,
        VK_IMAGE_LAYOUT_GENERAL,
        VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL,
        VK_ACCESS_SHADER_READ_BIT | VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT,
        VK_ACCESS_TRANSFER_READ_BIT,
        VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT | VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT,
        VK_PIPELINE_STAGE_TRANSFER_BIT);

    recordImageBarrier(
        res.commandBuffer,
        dst.image,
        dst.layout,
        VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
        0,
        VK_ACCESS_TRANSFER_WRITE_BIT,
        VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT,
        VK_PIPELINE_STAGE_TRANSFER_BIT);

    VkImageCopy copyRegion{};
    copyRegion.srcSubresource = {VK_IMAGE_ASPECT_COLOR_BIT, 0, 0, 1};
    copyRegion.dstSubresource = {VK_IMAGE_ASPECT_COLOR_BIT, 0, 0, 1};
    copyRegion.extent = {sourceWidth, sourceHeight, 1u};
    vkCmdCopyImage(
        res.commandBuffer,
        sourceImage,
        VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL,
        dst.image,
        VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
        1,
        &copyRegion);

    recordImageBarrier(
        res.commandBuffer,
        sourceImage,
        VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL,
        VK_IMAGE_LAYOUT_GENERAL,
        VK_ACCESS_TRANSFER_READ_BIT,
        VK_ACCESS_SHADER_READ_BIT,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT);

    recordImageBarrier(
        res.commandBuffer,
        dst.image,
        VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
        VK_IMAGE_LAYOUT_GENERAL,
        VK_ACCESS_TRANSFER_WRITE_BIT,
        VK_ACCESS_SHADER_READ_BIT,
        VK_PIPELINE_STAGE_TRANSFER_BIT,
        VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT);
    dst.layout = VK_IMAGE_LAYOUT_GENERAL;

    if (vkEndCommandBuffer(res.commandBuffer) != VK_SUCCESS)
        return false;

    const VkPipelineStageFlags waitStage = VK_PIPELINE_STAGE_TRANSFER_BIT;
    VkSubmitInfo submitInfo{};
    submitInfo.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO;
    if (waitSemaphore != VK_NULL_HANDLE)
    {
        submitInfo.waitSemaphoreCount = 1;
        submitInfo.pWaitSemaphores = &waitSemaphore;
        submitInfo.pWaitDstStageMask = &waitStage;
    }
    submitInfo.commandBufferCount = 1;
    submitInfo.pCommandBuffers = &res.commandBuffer;
    if (signalSemaphore != VK_NULL_HANDLE)
    {
        submitInfo.signalSemaphoreCount = 1;
        submitInfo.pSignalSemaphores = &signalSemaphore;
    }

    {
        std::scoped_lock queueLock(melonDS::VulkanContext::Get().GetPresentQueueLock());
        if (vkQueueSubmit(queue, 1, &submitInfo, res.fence) != VK_SUCCESS)
            return false;
    }

    res.frameGenHistoryIsBgr[slot] = sourceIsBgr;
    res.frameGenWriteIndex = 1u - slot;
    res.frameGenValidCount = std::min(res.frameGenValidCount + 1u, 2u);
    res.lastCapturedFrameId = frameId;
    return true;
}

bool VulkanFsrPipeline::runFrameGen(
    SurfaceResources& res,
    VkSemaphore signalSemaphore,
    VkImage& outImage,
    VkImageView& outImageView)
{
    outImage = VK_NULL_HANDLE;
    outImageView = VK_NULL_HANDLE;
    if (!initialized || !res.canInterpolate())
        return false;

    if (vkWaitForFences(device, 1, &res.fence, VK_TRUE, UINT64_MAX) != VK_SUCCESS)
        return false;

    // frameGenWriteIndex points to oldest (prev = N-1), other slot is newest (curr = N)
    const u32 prevIdx = res.frameGenWriteIndex & 1u;
    const u32 currIdx = 1u - prevIdx;
    const u32 w = res.frameGenHistory[currIdx].width;
    const u32 h = res.frameGenHistory[currIdx].height;
    if (res.frameGenOutput.width != w || res.frameGenOutput.height != h)
    {
        if (!ensureRenderImage(res.frameGenOutput, w, h, true))
            return false;
    }

    updateDualInputDescriptor(
        res.frameGenDescriptorSets[currIdx],
        linearSampler,
        res.frameGenHistory[prevIdx].imageView,
        linearSampler,
        res.frameGenHistory[currIdx].imageView);

    if (vkResetFences(device, 1, &res.fence) != VK_SUCCESS
        || vkResetCommandBuffer(res.commandBuffer, 0) != VK_SUCCESS)
    {
        return false;
    }

    VkCommandBufferBeginInfo beginInfo{};
    beginInfo.sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO;
    beginInfo.flags = VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    if (vkBeginCommandBuffer(res.commandBuffer, &beginInfo) != VK_SUCCESS)
        return false;

    const VkViewport viewport{0.0f, 0.0f, static_cast<float>(w), static_cast<float>(h), 0.0f, 1.0f};
    const VkRect2D scissor{{0, 0}, {w, h}};

    VkRenderPassBeginInfo rpInfo{};
    rpInfo.sType = VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO;
    rpInfo.renderPass = offscreenRenderPass;
    rpInfo.framebuffer = res.frameGenOutput.framebuffer;
    rpInfo.renderArea = scissor;
    vkCmdBeginRenderPass(res.commandBuffer, &rpInfo, VK_SUBPASS_CONTENTS_INLINE);
    vkCmdSetViewport(res.commandBuffer, 0, 1, &viewport);
    vkCmdSetScissor(res.commandBuffer, 0, 1, &scissor);
    vkCmdBindPipeline(res.commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, frameGenPipeline);
    vkCmdBindDescriptorSets(res.commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, dualInputPipelineLayout, 0, 1, &res.frameGenDescriptorSets[currIdx], 0, nullptr);

    PushConstantsData push{};
    push.vec0[0] = static_cast<float>(w);
    push.vec0[1] = static_cast<float>(h);
    push.vec0[2] = 1.0f / static_cast<float>(w);
    push.vec0[3] = 1.0f / static_cast<float>(h);
    push.vec1[0] = 0.5f;
    push.vec1[1] = res.frameGenHistoryIsBgr[prevIdx] ? 1.0f : 0.0f;
    push.vec1[2] = 6.0f;
    push.vec1[3] = res.frameGenHistoryIsBgr[currIdx] ? 1.0f : 0.0f;
    vkCmdPushConstants(res.commandBuffer, dualInputPipelineLayout, VK_SHADER_STAGE_FRAGMENT_BIT, 0, sizeof(push), &push);
    vkCmdDraw(res.commandBuffer, 3, 1, 0, 0);
    vkCmdEndRenderPass(res.commandBuffer);
    res.frameGenOutput.layout = VK_IMAGE_LAYOUT_GENERAL;

    recordImageBarrier(
        res.commandBuffer,
        res.frameGenOutput.image,
        VK_IMAGE_LAYOUT_GENERAL,
        VK_IMAGE_LAYOUT_GENERAL,
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT,
        VK_ACCESS_SHADER_READ_BIT,
        VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT,
        VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT);

    if (vkEndCommandBuffer(res.commandBuffer) != VK_SUCCESS)
        return false;

    VkSubmitInfo submitInfo{};
    submitInfo.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO;
    submitInfo.commandBufferCount = 1;
    submitInfo.pCommandBuffers = &res.commandBuffer;
    if (signalSemaphore != VK_NULL_HANDLE)
    {
        submitInfo.signalSemaphoreCount = 1;
        submitInfo.pSignalSemaphores = &signalSemaphore;
    }

    {
        std::scoped_lock queueLock(melonDS::VulkanContext::Get().GetPresentQueueLock());
        if (vkQueueSubmit(queue, 1, &submitInfo, res.fence) != VK_SUCCESS)
            return false;
    }

    outImage = res.frameGenOutput.image;
    outImageView = res.frameGenOutput.imageView;
    return true;
}

} // namespace MelonDSAndroid
