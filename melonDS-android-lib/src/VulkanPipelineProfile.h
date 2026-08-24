#ifndef VULKANPIPELINEPROFILE_H
#define VULKANPIPELINEPROFILE_H

#include <cstddef>
#include <cstdint>

namespace melonDS
{

enum class VulkanPipelineProfile : std::uint8_t
{
    Compatibility = 0,
    FastPath = 1,
};

struct VulkanRenderContextPolicy
{
    std::size_t AsyncRenderContextCount;

    [[nodiscard]] constexpr std::size_t DescriptorSetCount() const noexcept
    {
        return AsyncRenderContextCount + 1u;
    }
};

[[nodiscard]] constexpr VulkanRenderContextPolicy GetVulkanRenderContextPolicy(
    VulkanPipelineProfile profile) noexcept
{
    switch (profile)
    {
        case VulkanPipelineProfile::Compatibility:
            return {6u};
        case VulkanPipelineProfile::FastPath:
            return {8u};
    }

    return {6u};
}

static_assert(
    GetVulkanRenderContextPolicy(VulkanPipelineProfile::Compatibility).AsyncRenderContextCount == 6u);
static_assert(
    GetVulkanRenderContextPolicy(VulkanPipelineProfile::Compatibility).DescriptorSetCount() == 7u);
static_assert(
    GetVulkanRenderContextPolicy(VulkanPipelineProfile::FastPath).AsyncRenderContextCount == 8u);
static_assert(
    GetVulkanRenderContextPolicy(VulkanPipelineProfile::FastPath).DescriptorSetCount() == 9u);

struct VulkanTextureDescriptorPolicy
{
    std::uint32_t TextureDescriptorCount;
    bool UsesNormalizedTextureDescriptors;

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
        return GraphicsCombinedImageSamplerCountFor(TextureDescriptorCount);
    }
};

[[nodiscard]] constexpr VulkanTextureDescriptorPolicy GetVulkanTextureDescriptorPolicy(
    VulkanPipelineProfile profile) noexcept
{
    switch (profile)
    {
        case VulkanPipelineProfile::Compatibility:
            return {128u, false};
        case VulkanPipelineProfile::FastPath:
            return {256u, true};
    }

    return {128u, false};
}

static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::Compatibility).MaxActiveTextureDescriptors() == 127u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::Compatibility).FallbackTextureDescriptorIndex() == 127u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::Compatibility).ResolveDescriptorIndex(126u) == 126u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::Compatibility).ResolveDescriptorIndex(128u) == 127u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::Compatibility).ResolveDescriptorIndex(255u) == 127u);
static_assert(
    !GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::Compatibility).UsesNormalizedTextureDescriptors);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::Compatibility).GraphicsDescriptorBindingCount() == 6u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::Compatibility).GraphicsCombinedImageSamplerCount() == 130u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::Compatibility).GraphicsCombinedImageSamplerCountFor(7u) == 9u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::Compatibility).DescriptorViewsValid(true, false));
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::FastPath).MaxActiveTextureDescriptors() == 255u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::FastPath).FallbackTextureDescriptorIndex() == 255u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::FastPath).ResolveDescriptorIndex(128u) == 128u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::FastPath).ResolveDescriptorIndex(254u) == 254u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::FastPath).UsesNormalizedTextureDescriptors);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::FastPath).GraphicsDescriptorBindingCount() == 7u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::FastPath).GraphicsCombinedImageSamplerCount() == 514u);
static_assert(
    GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::FastPath).GraphicsCombinedImageSamplerCountFor(7u) == 16u);
static_assert(
    !GetVulkanTextureDescriptorPolicy(VulkanPipelineProfile::FastPath).DescriptorViewsValid(true, false));

[[nodiscard]] constexpr bool UsesVulkanFastPath(
    VulkanPipelineProfile profile) noexcept
{
    return profile == VulkanPipelineProfile::FastPath;
}

[[nodiscard]] constexpr const char* VulkanPipelineProfileName(
    VulkanPipelineProfile profile) noexcept
{
    switch (profile)
    {
        case VulkanPipelineProfile::Compatibility:
            return "compatibility";
        case VulkanPipelineProfile::FastPath:
            return "fastpath";
    }

    return "unknown";
}

}

#endif
