#ifndef MELONDS_ANDROID_RETROARCH_OUTPUT_SCALE_H
#define MELONDS_ANDROID_RETROARCH_OUTPUT_SCALE_H

#include <algorithm>
#include <cmath>

#include "types.h"

namespace MelonDSAndroid
{

struct RetroArchOutputSize
{
    melonDS::u32 screenWidth = 0;
    melonDS::u32 screenHeight = 0;
    melonDS::u32 atlasWidth = 0;
    melonDS::u32 atlasHeight = 0;
    melonDS::u32 bottomOffsetY = 0;
    melonDS::u32 requestedWidth = 0;
    melonDS::u32 requestedHeight = 0;
    bool clamped = false;
};

constexpr melonDS::u64 kMaxRetroArchOutputPixels = 2048ull * 1536ull;
constexpr melonDS::u64 kRetroArchOutputPixelBudget = 20ull * 1000ull * 1000ull;

inline RetroArchOutputSize computeRetroArchOutputSize(
    melonDS::u32 layoutWidth,
    melonDS::u32 layoutHeight,
    melonDS::u32 floorWidth,
    melonDS::u32 floorHeight,
    melonDS::u32 passCount)
{
    RetroArchOutputSize size{};

    const bool haveLayout = layoutWidth > 0 && layoutHeight > 0;
    const melonDS::u32 minWidth = haveLayout ? 1u : std::max(1u, floorWidth);
    const melonDS::u32 minHeight = haveLayout ? 1u : std::max(1u, floorHeight);
    melonDS::u32 width = std::max(minWidth, layoutWidth);
    melonDS::u32 height = std::max(minHeight, layoutHeight);

    size.requestedWidth = width;
    size.requestedHeight = height;

    const melonDS::u64 passes = std::max(1u, passCount);
    const melonDS::u64 allowedPixels = std::min(kMaxRetroArchOutputPixels, kRetroArchOutputPixelBudget / passes);
    const melonDS::u64 requestedPixels = static_cast<melonDS::u64>(width) * static_cast<melonDS::u64>(height);
    if (requestedPixels > allowedPixels)
    {
        const double factor = std::sqrt(static_cast<double>(allowedPixels) / static_cast<double>(requestedPixels));
        width = std::max(minWidth, static_cast<melonDS::u32>(width * factor));
        height = std::max(minHeight, static_cast<melonDS::u32>(height * factor));
        size.clamped = true;
    }

    size.screenWidth = width;
    size.screenHeight = height;
    const melonDS::u32 gap = std::max(1u, (height + 48u) / 96u);
    size.atlasWidth = width;
    size.atlasHeight = height * 2u + gap;
    size.bottomOffsetY = height + gap;
    return size;
}

}

#endif
