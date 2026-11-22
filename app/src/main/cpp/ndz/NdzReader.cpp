#include "NdzReader.h"

#define ZSTD_STATIC_LINKING_ONLY
#include <zstd.h>
#include <zstd_errors.h>

#include <algorithm>
#include <cstring>

namespace MelonDSAndroid::Ndz
{

namespace
{

constexpr uint32_t kFlagV2 = 1u << 0;
constexpr uint32_t kFlagZstd = 1u << 1;
constexpr uint32_t kFlagTrainedDict = 1u << 2;
constexpr uint32_t kFlagFilters = 1u << 3;
constexpr uint32_t kFlagBasePatch = 1u << 4;
constexpr uint32_t kFlagRawDict = 1u << 5;

constexpr uint32_t kOffGameCode = 0x2410;
constexpr uint32_t kOffDictStoredSize = 0x2414;
constexpr uint32_t kOffDictDecompressedSize = 0x2428;
constexpr uint32_t kFrontMatterReadBytes = 0x2430;

constexpr uint8_t kModeDict = 0;
constexpr uint8_t kModePlain = 1;
constexpr uint8_t kModeDelta1 = 2;
constexpr uint8_t kModeDelta2 = 3;
constexpr uint8_t kModeDelta4 = 4;
constexpr uint8_t kModeShuffle2 = 5;
constexpr uint8_t kModeShuffle4 = 6;

uint32_t le32(const uint8_t* p)
{
    return static_cast<uint32_t>(p[0]) | (static_cast<uint32_t>(p[1]) << 8)
        | (static_cast<uint32_t>(p[2]) << 16) | (static_cast<uint32_t>(p[3]) << 24);
}

void deltaInverse(uint8_t* b, size_t n, size_t stride)
{
    for (size_t i = stride; i < n; i++)
        b[i] = static_cast<uint8_t>(b[i] + b[i - stride]);
}

void shuffleInverse(uint8_t* b, size_t n, size_t planes, std::vector<uint8_t>& scratch)
{
    const size_t plane = n / planes;
    scratch.assign(b, b + n);
    for (size_t k = 0; k < planes; k++)
    {
        const uint8_t* src = scratch.data() + k * plane;
        for (size_t i = 0; i < plane; i++)
            b[i * planes + k] = src[i];
    }

}

}

const char* resultName(Result r)
{
    switch (r)
    {
        case Ok: return "ok";
        case Corrupt: return "corrupt";
        case LegacyLayout: return "legacy_layout";
        case TrainedDict: return "trained_dict";
        case BasePatch: return "base_patch";
        case PairMulti: return "pair_multi";
        case CompressedDict: return "compressed_dict";
        case UnknownMode: return "unknown_mode";
        case DictMissing: return "dict_missing";
        case TooLarge: return "too_large";
        case IoError: return "io_error";
        case DecodeError: return "decode_error";
    }
    return "unknown";
}

Reader::Reader() = default;

Reader::~Reader()
{
    if (ddict_ != nullptr)
        ZSTD_freeDDict(ddict_);
    if (dctx_ != nullptr)
        ZSTD_freeDCtx(dctx_);
}

Result Reader::open(std::unique_ptr<Source> source)
{
    source_ = std::move(source);
    if (!source_)
        return lastError_ = IoError;
    const uint64_t total = source_->size();
    if (total < 16)
        return lastError_ = Corrupt;

    uint8_t head[0x30];
    if (!source_->readAt(0, head, sizeof(head)))
        return lastError_ = IoError;
    const uint32_t magic = le32(head);
    if (magic == kPairMagic)
    {

        const uint32_t hdrSize = le32(head + 4);
        const uint32_t nRoms = le32(head + 8);
        if (hdrSize != kFrontMatterSize || nRoms == 0)
            return lastError_ = Corrupt;
        if (nRoms > 1)
            return lastError_ = PairMulti;
        const uint64_t entryOffset = le32(head + 0x10);
        const uint64_t entrySize = le32(head + 0x14);
        if (entryOffset < hdrSize || entryOffset + entrySize > total)
            return lastError_ = Corrupt;
        return parseEntry(entryOffset, entrySize);
    }
    if (magic != kMagic)
        return lastError_ = Corrupt;
    return parseEntry(0, total);
}

Result Reader::parseEntry(uint64_t entryOffset, uint64_t entrySize)
{
    if (entrySize < kFrontMatterSize + 8)
        return lastError_ = Corrupt;
    uint8_t fm[kFrontMatterReadBytes];
    if (!source_->readAt(entryOffset, fm, sizeof(fm)))
        return lastError_ = IoError;
    if (le32(fm) != kMagic || le32(fm + 4) != kFrontMatterSize)
        return lastError_ = Corrupt;

    info_ = {};
    info_.originalSize = le32(fm + 8);
    info_.flags = le32(fm + 12);
    info_.gameCode = le32(fm + kOffGameCode);
    const uint32_t flags = info_.flags;
    if (info_.originalSize == 0)
        return lastError_ = Corrupt;
    if (info_.originalSize > kMaxOriginalSize)
        return lastError_ = TooLarge;
    if ((flags & kFlagV2) == 0 || (flags & kFlagZstd) == 0)
        return lastError_ = LegacyLayout;
    if (flags & kFlagTrainedDict)
        return lastError_ = TrainedDict;
    if (flags & kFlagBasePatch)
        return lastError_ = BasePatch;
    const uint32_t blockLog2 = (flags >> 8) & 0xFFu;
    info_.blockSize = blockLog2 == 0 ? 4096u : (1u << blockLog2);
    if (blockLog2 > 16 || info_.blockSize > kFrameSize)
        return lastError_ = Corrupt;
    info_.hasFilters = (flags & kFlagFilters) != 0;
    info_.hasRawDict = (flags & kFlagRawDict) != 0;

    uint32_t dictStored = 0;
    if (info_.hasRawDict)
    {
        dictStored = le32(fm + kOffDictStoredSize);
        const uint32_t dictDecompressed = le32(fm + kOffDictDecompressedSize);
        if (dictStored == 0 || dictStored != dictDecompressed)
            return lastError_ = CompressedDict;
        info_.dictSize = dictStored;
    }
    dictOffset_ = entryOffset + kFrontMatterSize;

    uint8_t trailer[8];
    if (!source_->readAt(entryOffset + entrySize - 8, trailer, sizeof(trailer)))
        return lastError_ = IoError;
    const uint32_t nframes = le32(trailer);
    if (le32(trailer + 4) != kTrailerMagic)
        return lastError_ = Corrupt;
    const uint64_t expectedFrames = (static_cast<uint64_t>(info_.originalSize) + kFrameSize - 1) / kFrameSize;
    if (nframes != expectedFrames)
        return lastError_ = Corrupt;
    const uint64_t payloadStart = dictOffset_ + dictStored;
    const uint64_t tableStart = entryOffset + entrySize - 8 - static_cast<uint64_t>(nframes) * 8u;
    if (tableStart < payloadStart)
        return lastError_ = Corrupt;

    std::vector<uint8_t> table(static_cast<size_t>(nframes) * 8u);
    if (!table.empty() && !source_->readAt(tableStart, table.data(), table.size()))
        return lastError_ = IoError;
    frames_.assign(nframes, Frame{});
    uint64_t cOffset = payloadStart;
    uint64_t dOffset = 0;
    for (uint32_t i = 0; i < nframes; i++)
    {
        Frame& f = frames_[i];
        f.csize = le32(table.data() + i * 8u);
        f.dsize = le32(table.data() + i * 8u + 4u);
        f.cOffset = cOffset;
        f.dOffset = dOffset;
        const uint32_t expectedDsize = (i + 1 == nframes)
            ? static_cast<uint32_t>(info_.originalSize - dOffset)
            : kFrameSize;
        if (f.dsize != expectedDsize || f.csize == 0)
            return lastError_ = Corrupt;
        cOffset += f.csize;
        dOffset += f.dsize;
    }
    if (cOffset != tableStart || dOffset != info_.originalSize)
        return lastError_ = Corrupt;
    info_.frameCount = nframes;

    dctx_ = ZSTD_createDCtx();
    if (dctx_ == nullptr)
        return lastError_ = DecodeError;
    cache_.assign(kFrameSize, 0);
    cachedFrame_ = -1;
    return lastError_ = Ok;
}

Result Reader::ensureDict()
{
    if (ddict_ != nullptr)
        return Ok;
    if (!info_.hasRawDict)
        return DictMissing;
    dict_.resize(info_.dictSize);
    if (!source_->readAt(dictOffset_, dict_.data(), dict_.size()))
        return IoError;

    ddict_ = ZSTD_createDDict_advanced(
        dict_.data(), dict_.size(), ZSTD_dlm_byRef, ZSTD_dct_rawContent, ZSTD_defaultCMem);
    return ddict_ != nullptr ? Ok : DecodeError;
}

Result Reader::decodeBlock(const uint8_t* src, size_t srcSize, uint8_t* dst, size_t dstSize, uint8_t mode)
{
    if (mode > kModeShuffle4)
        return UnknownMode;
    for (int attempt = 0; attempt < 2; attempt++)
    {
        size_t got;
        if (mode == kModeDict)
        {
            const Result dictResult = ensureDict();
            if (dictResult != Ok)
                return dictResult;
            got = ZSTD_decompress_usingDDict(dctx_, dst, dstSize, src, srcSize, ddict_);
        }
        else
        {
            got = ZSTD_decompressDCtx(dctx_, dst, dstSize, src, srcSize);
        }
        if (!ZSTD_isError(got))
        {
            if (got != dstSize)
                return DecodeError;
            break;
        }

        if (attempt == 0 && !windowRaised_
            && ZSTD_getErrorCode(got) == ZSTD_error_frameParameter_windowTooLarge)
        {
            windowRaised_ = true;
            ZSTD_DCtx_setParameter(dctx_, ZSTD_d_windowLogMax, 31);
            continue;
        }
        return DecodeError;
    }
    switch (mode)
    {
        case kModeDelta1: deltaInverse(dst, dstSize, 1); break;
        case kModeDelta2: deltaInverse(dst, dstSize, 2); break;
        case kModeDelta4: deltaInverse(dst, dstSize, 4); break;
        case kModeShuffle2: shuffleInverse(dst, dstSize, 2, scratch_); break;
        case kModeShuffle4: shuffleInverse(dst, dstSize, 4, scratch_); break;
        default: break;
    }
    return Ok;
}

Result Reader::decodeFrame(uint32_t frameIndex, uint8_t* dst)
{
    const Frame& f = frames_[frameIndex];
    compressed_.resize(f.csize);
    if (!source_->readAt(f.cOffset, compressed_.data(), f.csize))
        return IoError;
    const uint32_t blockSize = info_.blockSize;
    const uint32_t nblocks = (f.dsize + blockSize - 1) / blockSize;
    const size_t hdrSize = static_cast<size_t>(nblocks) * 4u + (info_.hasFilters ? nblocks : 0u);
    if (hdrSize > f.csize)
        return Corrupt;
    const uint8_t* csizes = compressed_.data();
    const uint8_t* modes = info_.hasFilters ? compressed_.data() + static_cast<size_t>(nblocks) * 4u : nullptr;
    const uint8_t uniformMode = info_.hasRawDict ? kModeDict : kModePlain;

    uint64_t sum = hdrSize;
    for (uint32_t b = 0; b < nblocks; b++)
        sum += le32(csizes + b * 4u);
    if (sum != f.csize)
        return Corrupt;

    size_t bpos = hdrSize;
    uint32_t remaining = f.dsize;
    uint8_t* out = dst;
    for (uint32_t b = 0; b < nblocks; b++)
    {
        const uint32_t bcsize = le32(csizes + b * 4u);
        const uint32_t bdsize = remaining >= blockSize ? blockSize : remaining;
        const uint8_t mode = modes != nullptr ? modes[b] : uniformMode;
        const Result r = decodeBlock(compressed_.data() + bpos, bcsize, out, bdsize, mode);
        if (r != Ok)
            return r;
        bpos += bcsize;
        out += bdsize;
        remaining -= bdsize;
    }
    return Ok;
}

size_t Reader::readAt(uint64_t offset, void* dstVoid, size_t len)
{
    uint8_t* dst = static_cast<uint8_t*>(dstVoid);
    if (dctx_ == nullptr || offset >= info_.originalSize)
        return 0;
    len = static_cast<size_t>(std::min<uint64_t>(len, info_.originalSize - offset));
    size_t done = 0;
    while (done < len)
    {
        const uint64_t pos = offset + done;
        const uint32_t frameIndex = static_cast<uint32_t>(pos / kFrameSize);
        if (cachedFrame_ != static_cast<int64_t>(frameIndex))
        {
            const Result r = decodeFrame(frameIndex, cache_.data());
            if (r != Ok)
            {
                lastError_ = r;
                cachedFrame_ = -1;
                return done;
            }
            cachedFrame_ = frameIndex;
        }
        const size_t inFrame = static_cast<size_t>(pos - frames_[frameIndex].dOffset);
        const size_t chunk = std::min(len - done, static_cast<size_t>(frames_[frameIndex].dsize) - inFrame);
        std::memcpy(dst + done, cache_.data() + inFrame, chunk);
        done += chunk;
    }
    lastError_ = Ok;
    return done;
}

Result Reader::decompressAll(uint8_t* dst, size_t dstSize)
{
    if (dctx_ == nullptr)
        return lastError_ = Corrupt;
    if (dstSize < info_.originalSize)
        return lastError_ = TooLarge;
    for (uint32_t i = 0; i < info_.frameCount; i++)
    {
        const Result r = decodeFrame(i, dst + frames_[i].dOffset);
        if (r != Ok)
            return lastError_ = r;
    }
    cachedFrame_ = -1;
    return lastError_ = Ok;
}

}
