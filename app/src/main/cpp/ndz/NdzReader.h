#ifndef MELONDS_NDZREADER_H
#define MELONDS_NDZREADER_H

#include <cstddef>
#include <cstdint>
#include <memory>
#include <vector>

struct ZSTD_DCtx_s;
struct ZSTD_DDict_s;

namespace MelonDSAndroid::Ndz
{

class Source
{
public:
    virtual ~Source() = default;

    virtual bool readAt(uint64_t off, void* dst, size_t len) = 0;
    virtual uint64_t size() const = 0;
};

enum Result : int
{
    Ok = 0,
    Corrupt = 1,
    LegacyLayout = 2,
    TrainedDict = 3,
    BasePatch = 4,
    PairMulti = 5,
    CompressedDict = 6,
    UnknownMode = 7,
    DictMissing = 8,
    TooLarge = 9,
    IoError = 10,
    DecodeError = 11,
};

const char* resultName(Result r);

struct Info
{
    uint32_t originalSize = 0;
    uint32_t flags = 0;
    uint32_t gameCode = 0;
    uint32_t blockSize = 0;
    uint32_t dictSize = 0;
    uint32_t frameCount = 0;
    bool hasFilters = false;
    bool hasRawDict = false;
};

class Reader
{
public:
    static constexpr uint32_t kFrameSize = 128u * 1024u;
    static constexpr uint32_t kFrontMatterSize = 16384u;
    static constexpr uint32_t kMagic = 0x315A444Eu;
    static constexpr uint32_t kPairMagic = 0x505A444Eu;
    static constexpr uint32_t kTrailerMagic = 0x4C5A3442u;
    static constexpr uint64_t kMaxOriginalSize = 0x40000000ull;

    Reader();
    ~Reader();
    Reader(const Reader&) = delete;
    Reader& operator=(const Reader&) = delete;

    Result open(std::unique_ptr<Source> source);
    const Info& info() const { return info_; }

    size_t readAt(uint64_t offset, void* dst, size_t len);

    Result decompressAll(uint8_t* dst, size_t dstSize);
    Result lastError() const { return lastError_; }

private:
    struct Frame
    {
        uint32_t csize = 0;
        uint32_t dsize = 0;
        uint64_t cOffset = 0;
        uint64_t dOffset = 0;
    };

    Result parseEntry(uint64_t entryOffset, uint64_t entrySize);
    Result decodeFrame(uint32_t frameIndex, uint8_t* dst);
    Result decodeBlock(const uint8_t* src, size_t srcSize, uint8_t* dst, size_t dstSize, uint8_t mode);
    Result ensureDict();

    std::unique_ptr<Source> source_;
    Info info_;
    std::vector<Frame> frames_;
    std::vector<uint8_t> dict_;
    uint64_t dictOffset_ = 0;
    ZSTD_DCtx_s* dctx_ = nullptr;
    ZSTD_DDict_s* ddict_ = nullptr;
    bool windowRaised_ = false;
    std::vector<uint8_t> compressed_;
    std::vector<uint8_t> scratch_;
    std::vector<uint8_t> cache_;
    int64_t cachedFrame_ = -1;
    Result lastError_ = Ok;
};

}

#endif
