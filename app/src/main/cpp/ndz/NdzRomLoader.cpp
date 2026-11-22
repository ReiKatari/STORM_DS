#include "NdzRomLoader.h"
#include "NdzReader.h"

#include <chrono>
#include <cstring>

using namespace melonDS;

namespace MelonDSAndroid::Ndz
{

namespace
{

class FileHandleSource final : public Source
{
public:
    FileHandleSource(Platform::FileHandle* file, u64 length) : file(file), length(length) {}
    bool readAt(uint64_t off, void* dst, size_t len) override
    {
        if (!Platform::FileSeek(file, static_cast<s64>(off), Platform::FileSeekOrigin::Start))
            return false;
        return len == 0 || Platform::FileRead(dst, len, 1, file) == 1;
    }
    uint64_t size() const override { return length; }
private:
    Platform::FileHandle* file;
    u64 length;
};

}

bool IsNdzFile(Platform::FileHandle* file, u64 fileLength)
{
    u8 magic[4] = {};
    Platform::FileRewind(file);
    const bool isNdz = fileLength >= 16
        && Platform::FileRead(magic, 4, 1, file) == 1
        && (std::memcmp(magic, "NDZ1", 4) == 0 || std::memcmp(magic, "NDZP", 4) == 0);
    Platform::FileRewind(file);
    return isNdz;
}

std::unique_ptr<u8[]> LoadNdzRom(Platform::FileHandle* file, u64 fileLength, u32* outLength)
{
    const auto startedAt = std::chrono::steady_clock::now();
    Reader reader;
    const Result opened = reader.open(std::make_unique<FileHandleSource>(file, fileLength));
    if (opened != Ok)
    {
        Platform::Log(Platform::LogLevel::Warn, "NdzLoader: rechazado (%s)\n", resultName(opened));
        return nullptr;
    }
    const Info& info = reader.info();
    auto romData = std::make_unique<u8[]>(info.originalSize);
    const Result decoded = reader.decompressAll(romData.get(), info.originalSize);
    const double ms = std::chrono::duration<double, std::milli>(std::chrono::steady_clock::now() - startedAt).count();
    if (decoded != Ok)
    {
        Platform::Log(Platform::LogLevel::Warn, "NdzLoader: fallo al descodificar (%s) tras %.0f ms\n", resultName(decoded), ms);
        return nullptr;
    }
    Platform::Log(Platform::LogLevel::Warn,
        "NdzLoader: originalSize=%u frames=%u blockSize=%u dict=%u filters=%d compressed=%llu ms=%.0f\n",
        info.originalSize, info.frameCount, info.blockSize, info.dictSize, info.hasFilters ? 1 : 0,
        static_cast<unsigned long long>(fileLength), ms);
    *outLength = info.originalSize;
    return romData;
}

}
