#pragma once

#include <array>
#include "types.h"

#if defined(__aarch64__)
#include <arm_neon.h>
#endif

namespace melonDS::GPU2D
{

class SpritePriorityOrder
{
public:
    static constexpr u8 End = 128;
    static constexpr std::array<u8, 16> Widths {
        8, 16, 8, 8, 16, 32, 8, 8, 32, 32, 16, 8, 64, 64, 32, 8
    };
    static constexpr std::array<u8, 16> Heights {
        8, 8, 16, 8, 16, 8, 32, 8, 32, 16, 32, 8, 64, 32, 64, 8
    };

    SpritePriorityOrder(const u16* oam, u32 line) noexcept
    {
#if defined(__aarch64__)
        const uint8x16_t widths = vld1q_u8(Widths.data());
        const uint8x16_t heights = vld1q_u8(Heights.data());
        const u16 weights[8] = {1, 2, 4, 8, 16, 32, 64, 128};
        const uint16x8_t laneBits = vld1q_u16(weights);
        for (u32 sprite = 0; sprite < End; sprite += 8)
        {
            const uint16x8x4_t attributes = vld4q_u16(oam + sprite * 4);
            const uint16x8_t attr0 = attributes.val[0];
            const uint16x8_t attr1 = attributes.val[1];
            const uint16x8_t mode = vandq_u16(attr0, vdupq_n_u16(0x0300));
            const uint16x8_t doubled = vceqq_u16(mode, vdupq_n_u16(0x0300));
            const uint8x8_t size = vmovn_u16(vorrq_u16(
                vshrq_n_u16(attr0, 14),
                vandq_u16(vshrq_n_u16(attr1, 12), vdupq_n_u16(12))));
            uint16x8_t width = vmovl_u8(vqtbl1_u8(widths, size));
            uint16x8_t height = vmovl_u8(vqtbl1_u8(heights, size));
            width = vaddq_u16(width, vandq_u16(width, doubled));
            height = vaddq_u16(height, vandq_u16(height, doubled));
            const uint16x8_t y = vandq_u16(
                vsubq_u16(vdupq_n_u16(static_cast<u16>(line)), attr0),
                vdupq_n_u16(0x00FF));
            const int16x8_t x = vshrq_n_s16(
                vshlq_n_s16(vreinterpretq_s16_u16(attr1), 7), 7);
            const uint16x8_t eligible = vandq_u16(
                vmvnq_u16(vceqq_u16(mode, vdupq_n_u16(0x0200))),
                vandq_u16(vcltq_u16(y, height),
                    vcgtq_s16(x, vnegq_s16(vreinterpretq_s16_u16(width)))));
            const uint16x8_t priorities = vandq_u16(
                vshrq_n_u16(attributes.val[2], 10), vdupq_n_u16(3));
            for (u32 priority = 0; priority < 4; priority++)
            {
                const uint16x8_t selected = vandq_u16(eligible,
                    vceqq_u16(priorities, vdupq_n_u16(priority)));
                const u64 bits = vaddvq_u16(vandq_u16(selected, laneBits));
                Masks[priority][sprite / 64] |= bits << (sprite % 64);
            }
        }
#else
        for (u32 sprite = 0; sprite < End; sprite++)
        {
            const u16* const attributes = oam + sprite * 4;
            if ((attributes[0] & 0x0300) == 0x0200)
                continue;
            const u32 size = (attributes[0] >> 14) | ((attributes[1] & 0xC000) >> 12);
            const u32 factor = (attributes[0] & 0x0300) == 0x0300 ? 2 : 1;
            const u32 height = Heights[size] * factor;
            if (((line - attributes[0]) & 0xFF) >= height)
                continue;
            s32 x = attributes[1] & 0x01FF;
            if (x >= 256) x -= 512;
            if (x <= -static_cast<s32>(Widths[size] * factor))
                continue;
            const u32 priority = (attributes[2] >> 10) & 3u;
            Masks[priority][sprite / 64] |= u64{1} << (sprite % 64);
        }
#endif
    }

    u32 First(u32 priority) const noexcept
    {
        return Masks[priority][1] ? Highest(Masks[priority][1]) + 64
                                  : Highest(Masks[priority][0]);
    }

    u32 Next(u32 priority, u32 sprite) const noexcept
    {
        const u32 bank = sprite / 64;
        const u64 remaining = Masks[priority][bank]
            & ((u64{1} << (sprite % 64)) - 1);
        if (remaining) return Highest(remaining) + bank * 64;
        return bank ? Highest(Masks[priority][0]) : End;
    }

private:
    static u32 Highest(u64 mask) noexcept
    {
        return mask ? 63u - static_cast<u32>(__builtin_clzll(mask)) : End;
    }

    std::array<std::array<u64, 2>, 4> Masks {};
};

}
