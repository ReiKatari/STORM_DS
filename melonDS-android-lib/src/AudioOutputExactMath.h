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

#ifndef AUDIOOUTPUTEXACTMATH_H
#define AUDIOOUTPUTEXACTMATH_H

#include <limits>

#include "types.h"

namespace melonDS
{
namespace AudioOutputExactMath
{

struct UInt128Product
{
    u64 high;
    u64 low;
};

struct UInt192Product
{
    u64 high;
    u64 middle;
    u64 low;
};

constexpr UInt128Product MultiplyU64(u64 lhs, u64 rhs) noexcept
{
    const u64 lowLow =
        static_cast<u64>(static_cast<u32>(lhs)) * static_cast<u32>(rhs);
    const u64 highLow =
        (lhs >> 32) * static_cast<u32>(rhs);
    const u64 lowHigh =
        static_cast<u32>(lhs) * (rhs >> 32);
    const u64 highHigh = (lhs >> 32) * (rhs >> 32);

    const u64 cross =
        (lowLow >> 32) + static_cast<u32>(highLow) + lowHigh;
    const u64 high =
        (highLow >> 32) + (cross >> 32) + highHigh;
    const u64 low =
        (cross << 32) | static_cast<u32>(lowLow);
    return {high, low};
}

constexpr int Compare(UInt128Product lhs, UInt128Product rhs) noexcept
{
    if (lhs.high != rhs.high)
        return lhs.high < rhs.high ? -1 : 1;
    if (lhs.low != rhs.low)
        return lhs.low < rhs.low ? -1 : 1;
    return 0;
}

constexpr int CompareProducts(u64 lhsA, u64 lhsB,
                              u64 rhsA, u64 rhsB) noexcept
{
    return Compare(MultiplyU64(lhsA, lhsB), MultiplyU64(rhsA, rhsB));
}

constexpr UInt192Product MultiplyU64x3(u64 first, u64 second,
                                       u64 third) noexcept
{
    const UInt128Product firstTwo = MultiplyU64(first, second);
    const UInt128Product lower = MultiplyU64(firstTwo.low, third);
    const UInt128Product upper = MultiplyU64(firstTwo.high, third);
    const u64 middle = lower.high + upper.low;
    const u64 carry = middle < lower.high ? 1 : 0;
    return {upper.high + carry, middle, lower.low};
}

constexpr int Compare(UInt192Product lhs, UInt192Product rhs) noexcept
{
    if (lhs.high != rhs.high)
        return lhs.high < rhs.high ? -1 : 1;
    if (lhs.middle != rhs.middle)
        return lhs.middle < rhs.middle ? -1 : 1;
    if (lhs.low != rhs.low)
        return lhs.low < rhs.low ? -1 : 1;
    return 0;
}

constexpr int CompareProducts3(u64 lhsA, u64 lhsB, u64 lhsC,
                               u64 rhsA, u64 rhsB, u64 rhsC) noexcept
{
    return Compare(MultiplyU64x3(lhsA, lhsB, lhsC),
                   MultiplyU64x3(rhsA, rhsB, rhsC));
}

constexpr bool FitsPhasePostcondition(
    u64 levelPostWrite, u64 requiredBacking,
    u64 publicationReserve, u64 capacity) noexcept
{
    if (levelPostWrite > capacity
        || requiredBacking > capacity
        || publicationReserve > capacity)
    {
        return false;
    }
    const u64 minimumLevel = requiredBacking > publicationReserve
        ? requiredBacking : publicationReserve;
    return levelPostWrite >= minimumLevel
        && levelPostWrite <= capacity - publicationReserve;
}

constexpr u64 SpendablePhaseHeadroom(
    u64 levelPostWrite, u64 publicationReserve,
    u64 reservedPublicationCount, u64 capacity) noexcept
{
    if (levelPostWrite > capacity)
        return 0;
    const u64 headroom = capacity - levelPostWrite;
    if (reservedPublicationCount != 0
        && publicationReserve > headroom / reservedPublicationCount)
    {
        return 0;
    }
    return headroom - publicationReserve * reservedPublicationCount;
}

constexpr bool ExhaustsHeadroomOverConsumptionHorizon(
    u64 deltaTicks, u64 deltaConsumed, u64 headroom,
    u64 horizonConsumed, u64 referenceTicks,
    u64 referenceConsumed) noexcept
{
    if (deltaTicks == 0 || deltaConsumed == 0
        || horizonConsumed == 0 || referenceTicks == 0
        || referenceConsumed == 0
        || headroom == std::numeric_limits<u64>::max()
        || horizonConsumed
            > std::numeric_limits<u64>::max() - headroom - 1)
    {
        return false;
    }
    return CompareProducts3(
        deltaTicks, referenceConsumed, horizonConsumed,
        horizonConsumed + headroom + 1, referenceTicks,
        deltaConsumed) >= 0;
}

constexpr u64 UInt64Max = std::numeric_limits<u64>::max();
static_assert(MultiplyU64(0, UInt64Max).high == 0);
static_assert(MultiplyU64(0, UInt64Max).low == 0);
static_assert(MultiplyU64(UInt64Max, UInt64Max).high == UInt64Max - 1);
static_assert(MultiplyU64(UInt64Max, UInt64Max).low == 1);
static_assert(MultiplyU64(u64{1} << 63, 2).high == 1);
static_assert(MultiplyU64(u64{1} << 63, 2).low == 0);
static_assert(CompareProducts(UInt64Max, UInt64Max,
                              UInt64Max, UInt64Max) == 0);
static_assert(CompareProducts(UInt64Max, UInt64Max,
                              UInt64Max, UInt64Max - 1) > 0);
static_assert(MultiplyU64x3(UInt64Max, UInt64Max, UInt64Max).high
              == UInt64Max - 2);
static_assert(MultiplyU64x3(UInt64Max, UInt64Max, UInt64Max).middle == 2);
static_assert(MultiplyU64x3(UInt64Max, UInt64Max, UInt64Max).low
              == UInt64Max);
static_assert(CompareProducts3(UInt64Max, UInt64Max, UInt64Max,
                               UInt64Max, UInt64Max, UInt64Max) == 0);
static_assert(CompareProducts3(UInt64Max, UInt64Max, UInt64Max,
                               UInt64Max, UInt64Max, UInt64Max - 1) > 0);
static_assert(!ExhaustsHeadroomOverConsumptionHorizon(1, 1, 0, 1, 1, 1));
static_assert(ExhaustsHeadroomOverConsumptionHorizon(2, 1, 0, 1, 1, 1));
static_assert(!ExhaustsHeadroomOverConsumptionHorizon(
    UInt64Max, 1, UInt64Max, 1, 1, 1));
static_assert(FitsPhasePostcondition(2806, 2048, 404, 16383));
static_assert(!FitsPhasePostcondition(2047, 2048, 404, 16383));
static_assert(!FitsPhasePostcondition(15980, 2048, 404, 16383));
static_assert(!FitsPhasePostcondition(0, 0, UInt64Max, 16383));
static_assert(SpendablePhaseHeadroom(7731, 404, 1, 16383) == 8248);
static_assert(SpendablePhaseHeadroom(7731, 404, 2, 16383) == 7844);
static_assert(SpendablePhaseHeadroom(16212, 247, 2, 16383) == 0);
static_assert(SpendablePhaseHeadroom(0, UInt64Max, 2, 16383) == 0);

static_assert(CompareProducts(11, 6, 10, 7) < 0);
static_assert(CompareProducts(12, 6, 10, 7) >= 0);

static_assert(CompareProducts(10, 7, 11, 6) >= 0);
static_assert(CompareProducts(10, 7, 12, 6) < 0);

}
}

#endif
