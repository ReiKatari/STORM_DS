#include "Configuration.h"
#include "FATStorage.h"
#include "SDCardArgsBuilder.h"

using namespace melonDS;

namespace MelonDSAndroid
{

constexpr u64 MB(u64 i)
{
    return i * 1024 * 1024;
}

constexpr u64 imgSizes[] = {0, MB(256), MB(512), MB(1024), MB(2048), MB(4096)};

std::optional<FATStorageArgs> getSDCardArgs(SdCardSettings settings) noexcept
{
    if (!settings.enabled)
        return std::nullopt;

    if (!settings.imagePath || settings.imagePath[0] == '\0')
        return std::nullopt;

    FILE* f = fopen(settings.imagePath, "rb");
    if (f)
    {
        fclose(f);
    }
    u64 targetSize = (settings.imageSize >= 0 && settings.imageSize < 6) ? imgSizes[settings.imageSize] : 0;
    if (!f && targetSize == 0 && !settings.folderSync)
    {
        targetSize = MB(512); // Default 512MB for newly created image
    }

    return FATStorageArgs {
        .Filename = settings.imagePath,
        .Size = targetSize,
        .ReadOnly = settings.readOnly,
        .SourceDir = settings.folderSync ? std::make_optional(settings.folderPath) : std::nullopt
    };
}
}