#pragma once

#include <limits>

#include "types.h"

namespace melonDS
{

struct FaithfulVramCaptureTagAddressResolver
{
    const u32* Mapping = nullptr;
    u32 MappingIndexMask = 0u;
    u32 AddressMask = 0u;
    u32 AllowedBankMask = 0u;
    u32 CachedSegment = std::numeric_limits<u32>::max();
    u32 CachedPhysicalBankMask = 0u;
    u64 ProductEpoch = 0u;
    u8 CachedUniqueBank = 0xFFu;
};

}
