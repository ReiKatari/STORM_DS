#ifndef SHADERDIAGNOSTICS_H
#define SHADERDIAGNOSTICS_H

#include <deque>
#include <mutex>
#include <string>
#include <vector>

#include "types.h"

namespace MelonDSAndroid
{

class ShaderDiagnostics
{
public:
    struct Entry
    {
        std::string backend;
        std::string presetPath;
        bool succeeded = false;
        melonDS::u32 sourceWidth = 0;
        melonDS::u32 sourceHeight = 0;
        melonDS::u32 outputWidth = 0;
        melonDS::u32 outputHeight = 0;
        std::string reason;
    };

    static ShaderDiagnostics& get();

    void record(const Entry& entry);

    std::vector<Entry> consume();

private:
    ShaderDiagnostics() = default;
    static std::string makeKey(const Entry& entry);

private:
    std::mutex mutex;
    std::deque<Entry> entries;
    std::deque<std::string> recentKeys;
};

}

#endif
