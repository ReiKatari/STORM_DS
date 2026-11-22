#pragma once

#include <algorithm>
#include <array>
#include <bitset>
#include <cstddef>
#include <type_traits>

namespace melonDS::GPU2D
{

template <typename T, std::size_t Rows, std::size_t Columns>
class FaithfulFrameBuffer
{
    static_assert(Rows != 0 && Columns != 0);
    static_assert(std::is_trivially_copyable_v<T>);

public:
    using Storage = std::array<T, Rows * Columns>;

    const Storage& Current() const noexcept
    {
        CompleteCurrent();
        return Banks[CurrentBank];
    }

    const Storage& Published() const noexcept
    {
        return Banks[PublishedBank];
    }

    const T* CurrentRow(std::size_t row) const noexcept
    {
        const auto bank = MissingRows[row] ? PublishedBank : CurrentBank;
        return Banks[bank].data() + row * Columns;
    }

    T* WriteRow(std::size_t row) noexcept
    {
        PrepareWrite();
        T* const destination = Banks[CurrentBank].data() + row * Columns;
        if (MissingRows[row])
        {
            std::copy_n(Banks[PublishedBank].data() + row * Columns,
                        Columns, destination);
            MissingRows.reset(row);
        }
        return destination;
    }

    T* OverwriteRow(std::size_t row) noexcept
    {
        PrepareWrite();
        MissingRows.reset(row);
        return Banks[CurrentBank].data() + row * Columns;
    }

    void Fill(const T& value) noexcept
    {
        PrepareWrite();
        Banks[CurrentBank].fill(value);
        MissingRows.reset();
    }

    void Reset(const T& value = T{}) noexcept
    {
        Banks[0].fill(value);
        Banks[1].fill(value);
        CurrentBank = 0;
        PublishedBank = 1;
        MissingRows.reset();
    }

    void Publish() noexcept
    {
        CompleteCurrent();
        PublishedBank = CurrentBank;
    }

private:
    void PrepareWrite() noexcept
    {
        if (CurrentBank == PublishedBank)
        {
            CurrentBank ^= 1u;
            MissingRows.set();
        }
    }

    void CompleteCurrent() const noexcept
    {
        if (MissingRows.none())
            return;
        for (std::size_t row = 0; row < Rows;)
        {
            if (!MissingRows[row])
            {
                row++;
                continue;
            }
            const auto begin = row;
            while (row < Rows && MissingRows[row])
                row++;
            std::copy_n(Banks[PublishedBank].data() + begin * Columns,
                        (row - begin) * Columns,
                        Banks[CurrentBank].data() + begin * Columns);
        }
        MissingRows.reset();
    }

    mutable std::array<Storage, 2> Banks {};
    mutable std::bitset<Rows> MissingRows {};
    unsigned CurrentBank = 0;
    unsigned PublishedBank = 1;
};

}
