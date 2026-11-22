#ifndef FAITHFULDIAGNOSTICPAYLOAD_H
#define FAITHFULDIAGNOSTICPAYLOAD_H

#include <algorithm>
#include <array>
#include <cstdint>
#include <limits>
#include <vector>

namespace MelonDSAndroid
{

class FaithfulDiagnosticPayload
{
public:
    static constexpr std::uint32_t Magic = 0x31444657u;
    static constexpr std::uint32_t Version = 1u;
    static constexpr std::uint32_t HeaderWords = 64u;
    using Header = std::array<std::uint32_t, HeaderWords>;

    void publish(std::uint32_t slot, const Header& header) noexcept
    {
        header_ = header;
        slot_ = slot;
        valid_ = header[0] == Magic && header[1] == Version
            && header[2] == HeaderWords && read64(header, 4) != 0u;
    }

    void invalidate() noexcept { valid_ = false; }
    void invalidateSlot(std::uint32_t slot) noexcept
    {
        if (slot == slot_)
            invalidate();
    }

    [[nodiscard]] bool matches(std::uint64_t expectedFrameId) const noexcept
    {
        return valid_ && expectedFrameId != 0u
            && read64(header_, 4) == expectedFrameId;
    }

    [[nodiscard]] std::uint32_t slot() const noexcept { return slot_; }

    [[nodiscard]] std::vector<std::uint32_t> copy(
        std::uint64_t expectedFrameId,
        const std::uint32_t* regs, std::size_t regsWords,
        const std::uint32_t* causal, std::size_t causalWords) const
    {
        if (!matches(expectedFrameId) || regs == nullptr || causal == nullptr
            || regsWords == 0u || causalWords == 0u
            || regsWords > std::numeric_limits<std::uint32_t>::max() - HeaderWords
            || causalWords > std::numeric_limits<std::uint32_t>::max()
                - HeaderWords - regsWords
            || header_[10] != HeaderWords || header_[11] != regsWords
            || header_[12] != HeaderWords + regsWords
            || header_[13] != causalWords
            || header_[3] != HeaderWords + regsWords + causalWords)
            return {};

        std::vector<std::uint32_t> result(header_[3]);
        std::copy(header_.begin(), header_.end(), result.begin());
        std::copy_n(regs, regsWords, result.begin() + header_[10]);
        std::copy_n(causal, causalWords, result.begin() + header_[12]);
        return result;
    }

    static void write64(Header& header, std::size_t offset,
                        std::uint64_t value) noexcept
    {
        header[offset] = static_cast<std::uint32_t>(value);
        header[offset + 1u] = static_cast<std::uint32_t>(value >> 32u);
    }

private:
    static std::uint64_t read64(const Header& header, std::size_t offset) noexcept
    {
        return header[offset]
            | (static_cast<std::uint64_t>(header[offset + 1u]) << 32u);
    }
    Header header_{};
    std::uint32_t slot_{};
    bool valid_{};
};

}

#endif
