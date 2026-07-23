#include "renderer/ShaderDiagnostics.h"

#include <algorithm>

namespace MelonDSAndroid
{

namespace
{
constexpr size_t kMaxPendingEntries = 32;
constexpr size_t kMaxRecentKeys = 32;
}

ShaderDiagnostics& ShaderDiagnostics::get()
{
    static ShaderDiagnostics instance;
    return instance;
}

std::string ShaderDiagnostics::makeKey(const Entry& entry)
{
    return entry.backend + "|" + entry.presetPath + "|"
        + std::to_string(entry.sourceWidth) + "x" + std::to_string(entry.sourceHeight) + ">"
        + std::to_string(entry.outputWidth) + "x" + std::to_string(entry.outputHeight) + "|"
        + (entry.succeeded ? "ok" : "fail");
}

void ShaderDiagnostics::record(const Entry& entry)
{
    if (entry.presetPath.empty())
        return;

    std::lock_guard<std::mutex> lock(mutex);

    const std::string key = makeKey(entry);
    if (std::find(recentKeys.begin(), recentKeys.end(), key) != recentKeys.end())
        return;

    recentKeys.push_back(key);
    if (recentKeys.size() > kMaxRecentKeys)
        recentKeys.pop_front();

    entries.push_back(entry);
    if (entries.size() > kMaxPendingEntries)
        entries.pop_front();
}

std::vector<ShaderDiagnostics::Entry> ShaderDiagnostics::consume()
{
    std::lock_guard<std::mutex> lock(mutex);
    std::vector<Entry> result(entries.begin(), entries.end());
    entries.clear();
    return result;
}

}
