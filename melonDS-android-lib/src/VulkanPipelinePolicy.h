#ifndef VULKANPIPELINEPOLICY_H
#define VULKANPIPELINEPOLICY_H

#include <cstddef>
#include <cstdint>

namespace melonDS
{

[[nodiscard]] constexpr const char* VulkanProductionPipelineName() noexcept
{
    return "simple_graphics";
}

[[nodiscard]] constexpr const char* VulkanProductionProfileName() noexcept
{
    return "faithful";
}

[[nodiscard]] constexpr const char* VulkanGraphicsRasterName() noexcept
{
    return "graphics";
}

struct VulkanRenderContextPolicy
{
    std::size_t AsyncRenderContextCount;

    [[nodiscard]] constexpr std::size_t DescriptorSetCount() const noexcept
    {
        return AsyncRenderContextCount + 1u;
    }
};

inline constexpr VulkanRenderContextPolicy VulkanProductionRenderContextPolicy{3u};

[[nodiscard]] constexpr VulkanRenderContextPolicy GetVulkanRenderContextPolicy() noexcept
{
    return VulkanProductionRenderContextPolicy;
}

static_assert(
    GetVulkanRenderContextPolicy().AsyncRenderContextCount == 3u);
static_assert(
    GetVulkanRenderContextPolicy().DescriptorSetCount() == 4u);

[[nodiscard]] constexpr bool CanUseVulkanDynamicTextureIndexing(
    bool featureAvailable, bool forceDisable) noexcept
{
    return featureAvailable && !forceDisable;
}

struct VulkanGraphicsDescriptorLimits
{
    std::uint32_t PerStageSamplers;
    std::uint32_t SetSamplers;
    std::uint32_t PerStageSampledImages;
    std::uint32_t SetSampledImages;
    std::uint32_t PerStageStorageBuffers;
    std::uint32_t SetStorageBuffers;
    std::uint32_t PerStageResources;
};

struct VulkanTextureDescriptorPolicy
{

    std::uint32_t TextureDescriptorCount;
    bool UsesNormalizedTextureDescriptors;

    static constexpr std::uint32_t TextureDescriptorPageSize = 7u;

    [[nodiscard]] constexpr std::uint32_t TextureDescriptorPageCount() const noexcept
    {
        return (TextureDescriptorCount + TextureDescriptorPageSize - 1u)
            / TextureDescriptorPageSize;
    }

    [[nodiscard]] constexpr std::uint32_t TextureDescriptorPageStorageCapacity() const noexcept
    {
        return TextureDescriptorPageCount() * TextureDescriptorPageSize;
    }

    [[nodiscard]] constexpr std::uint32_t MaxActiveTextureDescriptors() const noexcept
    {
        return TextureDescriptorCount - 1u;
    }

    [[nodiscard]] constexpr std::uint32_t FallbackTextureDescriptorIndex() const noexcept
    {
        return TextureDescriptorCount - 1u;
    }

    [[nodiscard]] constexpr std::uint32_t ResolveDescriptorIndex(
        std::uint32_t descriptorIndex) const noexcept
    {
        return descriptorIndex < MaxActiveTextureDescriptors()
            ? descriptorIndex
            : FallbackTextureDescriptorIndex();
    }

    [[nodiscard]] constexpr std::uint32_t TextureDescriptorPageIndex(
        std::uint32_t descriptorIndex) const noexcept
    {
        return ResolveDescriptorIndex(descriptorIndex) / TextureDescriptorPageSize;
    }

    [[nodiscard]] constexpr std::uint32_t TextureDescriptorPageOffset(
        std::uint32_t descriptorIndex) const noexcept
    {
        return ResolveDescriptorIndex(descriptorIndex) % TextureDescriptorPageSize;
    }

    [[nodiscard]] constexpr std::uint32_t GraphicsDescriptorBindingCount() const noexcept
    {
        return UsesNormalizedTextureDescriptors ? 7u : 6u;
    }

    [[nodiscard]] constexpr bool HasGraphicsBinding(
        std::uint32_t binding) const noexcept
    {
        return binding < GraphicsDescriptorBindingCount();
    }

    [[nodiscard]] constexpr bool RequiresNormalizedTextureDescriptor() const noexcept
    {
        return UsesNormalizedTextureDescriptors;
    }

    [[nodiscard]] constexpr bool DescriptorViewsValid(
        bool hasIntegerView,
        bool hasNormalizedView) const noexcept
    {
        return hasIntegerView
            && (!RequiresNormalizedTextureDescriptor() || hasNormalizedView);
    }

    [[nodiscard]] constexpr std::uint32_t GraphicsCombinedImageSamplerCountFor(
        std::uint32_t textureDescriptorCount) const noexcept
    {
        const std::uint32_t textureArrayCount =
            UsesNormalizedTextureDescriptors ? 2u : 1u;
        return (textureDescriptorCount * textureArrayCount) + 2u;
    }

    [[nodiscard]] constexpr std::uint32_t GraphicsCombinedImageSamplerCount() const noexcept
    {
        return GraphicsCombinedImageSamplerCountFor(TextureDescriptorPageSize);
    }

    [[nodiscard]] constexpr bool GraphicsLimitsSatisfied(
        const VulkanGraphicsDescriptorLimits& limits) const noexcept
    {
        const std::uint32_t imagesAndSamplers = GraphicsCombinedImageSamplerCount();
        constexpr std::uint32_t storageBuffers = 3u;
        return limits.PerStageSamplers >= imagesAndSamplers
            && limits.SetSamplers >= imagesAndSamplers
            && limits.PerStageSampledImages >= imagesAndSamplers
            && limits.SetSampledImages >= imagesAndSamplers
            && limits.PerStageStorageBuffers >= storageBuffers
            && limits.SetStorageBuffers >= storageBuffers
            && limits.PerStageResources >= imagesAndSamplers + storageBuffers;
    }
};

inline constexpr VulkanTextureDescriptorPolicy VulkanProductionTextureDescriptorPolicy{
    2049u,
    true,
};

[[nodiscard]] constexpr VulkanTextureDescriptorPolicy GetVulkanTextureDescriptorPolicy() noexcept
{
    return VulkanProductionTextureDescriptorPolicy;
}

static_assert(
    GetVulkanTextureDescriptorPolicy().TextureDescriptorCount == 2049u);
static_assert(
    GetVulkanTextureDescriptorPolicy().MaxActiveTextureDescriptors() == 2048u);
static_assert(
    GetVulkanTextureDescriptorPolicy().FallbackTextureDescriptorIndex() == 2048u);
static_assert(
    GetVulkanTextureDescriptorPolicy().ResolveDescriptorIndex(128u) == 128u);
static_assert(
    GetVulkanTextureDescriptorPolicy().ResolveDescriptorIndex(2047u) == 2047u);
static_assert(
    GetVulkanTextureDescriptorPolicy().ResolveDescriptorIndex(2048u) == 2048u);
static_assert(
    GetVulkanTextureDescriptorPolicy().ResolveDescriptorIndex(4096u) == 2048u);
static_assert(
    GetVulkanTextureDescriptorPolicy().UsesNormalizedTextureDescriptors);
static_assert(
    GetVulkanTextureDescriptorPolicy().GraphicsDescriptorBindingCount() == 7u);
static_assert(
    GetVulkanTextureDescriptorPolicy().GraphicsCombinedImageSamplerCount() == 16u);
static_assert(
    GetVulkanTextureDescriptorPolicy().TextureDescriptorPageCount() == 293u);
static_assert(
    GetVulkanTextureDescriptorPolicy().TextureDescriptorPageIndex(2048u) == 292u);
static_assert(
    GetVulkanTextureDescriptorPolicy().TextureDescriptorPageOffset(2048u) == 4u);
static_assert(
    GetVulkanTextureDescriptorPolicy().GraphicsCombinedImageSamplerCountFor(7u) == 16u);
static_assert(
    GetVulkanTextureDescriptorPolicy().DescriptorViewsValid(true, true));
static_assert(
    !GetVulkanTextureDescriptorPolicy().DescriptorViewsValid(true, false));


}

#endif
