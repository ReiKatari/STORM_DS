#ifndef FAITHFUL_ATLAS_STAGING_H
#define FAITHFUL_ATLAS_STAGING_H

#include <array>
#include <cassert>
#include <cstddef>
#include <cstdint>
#include <cstring>
#include <memory>
#include <new>

namespace MelonDSAndroid
{

template <size_t Bytes>
class FaithfulAtlasStaging
{
    static constexpr size_t PageBytes = 512u;
    static_assert(Bytes != 0u && Bytes % PageBytes == 0u);
    static constexpr size_t Pages = Bytes / PageBytes;
    std::unique_ptr<uint8_t[]> bytes;
    std::array<uint64_t, (Pages + 63u) / 64u> dirty{};

public:
    [[nodiscard]] bool allocate()
    {
        if (!bytes)
            bytes.reset(new (std::nothrow) uint8_t[Bytes]);
        return bytes != nullptr;
    }

    void reset()
    {
        bytes.reset();
        dirty.fill(0u);
    }

    uint8_t* data() { return bytes.get(); }

    void copy(size_t offset, const void* source, size_t count)
    {
        assert(bytes && offset <= Bytes && count <= Bytes - offset);
        assert(offset % PageBytes == 0u && count % PageBytes == 0u);
        std::memcpy(bytes.get() + offset, source, count);
        const size_t end = (offset + count) / PageBytes;
        for (size_t page = offset / PageBytes; page < end;)
        {
            const size_t word = page / 64u;
            const size_t first = page % 64u;
            const size_t last = end - word * 64u < 64u
                ? end - word * 64u : 64u;
            const uint64_t throughLast = last == 64u
                ? UINT64_MAX : (uint64_t{1} << last) - 1u;
            dirty[word] |= throughLast & (UINT64_MAX << first);
            page = word * 64u + last;
        }
    }

    size_t publishTo(void* destination)
    {
        assert(bytes && destination != nullptr);
        size_t first = 0u, end = 0u, copied = 0u;
        const auto publish = [&] {
            const size_t count = (end - first) * PageBytes;
            std::memcpy(static_cast<uint8_t*>(destination) + first * PageBytes,
                        bytes.get() + first * PageBytes, count);
            copied += count;
        };
        for (size_t word = 0u; word < dirty.size(); word++)
        {
            uint64_t bits = dirty[word];
            dirty[word] = 0u;
            while (bits != 0u)
            {
                const size_t page = word * 64u + __builtin_ctzll(bits);
                bits &= bits - 1u;
                if (end != page)
                {
                    if (first != end)
                        publish();
                    first = page;
                }
                end = page + 1u;
            }
        }
        if (first != end)
            publish();
        return copied;
    }
};

}
#endif
