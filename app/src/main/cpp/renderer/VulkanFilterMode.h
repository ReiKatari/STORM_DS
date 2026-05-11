#ifndef VULKANFILTERMODE_H
#define VULKANFILTERMODE_H

#include "types.h"

namespace MelonDSAndroid
{

enum class VulkanFilterMode : melonDS::u32
{
    Nearest = 0,
    Linear = 1,
    Sharp2D = 2,
    Xbr2 = 3,
    Hq2x = 4,
    Hq4x = 5,
    Quilez = 6,
    Lcd = 7,
    LcdGridDsLite = 8,
    Scanlines = 9,
    RetroArch = 10,
};

inline bool IsVulkanPostProcessFilter(VulkanFilterMode filter)
{
    return filter == VulkanFilterMode::Xbr2
        || filter == VulkanFilterMode::Hq2x
        || filter == VulkanFilterMode::Hq4x
        || filter == VulkanFilterMode::Quilez
        || filter == VulkanFilterMode::Lcd
        || filter == VulkanFilterMode::LcdGridDsLite
        || filter == VulkanFilterMode::Scanlines
        || filter == VulkanFilterMode::RetroArch;
}

}

#endif
