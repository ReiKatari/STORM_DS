#ifndef MELONDS_NDZROMLOADER_H
#define MELONDS_NDZROMLOADER_H

#include <memory>
#include "Platform.h"
#include "types.h"

namespace MelonDSAndroid::Ndz
{

bool IsNdzFile(melonDS::Platform::FileHandle* file, melonDS::u64 fileLength);

std::unique_ptr<melonDS::u8[]> LoadNdzRom(melonDS::Platform::FileHandle* file, melonDS::u64 fileLength, melonDS::u32* outLength);

}

#endif
