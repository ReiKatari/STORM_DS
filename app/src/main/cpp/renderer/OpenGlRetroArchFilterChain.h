#ifndef OPENGLRETROARCHFILTERCHAIN_H
#define OPENGLRETROARCHFILTERCHAIN_H

#include <string>
#include <utility>
#include <vector>

#include MELONDS_GL_HEADER

#include "renderer/LibrashaderApi.h"
#include "types.h"

namespace MelonDSAndroid
{

class OpenGlRetroArchFilterChain
{
public:
    OpenGlRetroArchFilterChain() = default;
    ~OpenGlRetroArchFilterChain();

    OpenGlRetroArchFilterChain(const OpenGlRetroArchFilterChain&) = delete;
    OpenGlRetroArchFilterChain& operator=(const OpenGlRetroArchFilterChain&) = delete;
    OpenGlRetroArchFilterChain(OpenGlRetroArchFilterChain&& other) noexcept;
    OpenGlRetroArchFilterChain& operator=(OpenGlRetroArchFilterChain&& other) noexcept;

    void shutdown();
    bool configure(
        const std::string& presetPath,
        melonDS::u32 sourceWidth,
        melonDS::u32 sourceHeight,
        melonDS::u32 outputWidth,
        melonDS::u32 outputHeight,
        const std::vector<std::pair<std::string, float>>& parameterOverrides);
    bool renderFrame(
        GLuint sourceTexture,
        GLuint outputTexture,
        melonDS::u64 frameCount,
        bool clearHistory,
        melonDS::u32 frametimeDeltaMs);

    bool isConfigured() const { return chain != nullptr; }
    const std::string& getPresetPath() const { return currentPresetPath; }
    melonDS::u32 getSourceWidth() const { return currentSourceWidth; }
    melonDS::u32 getSourceHeight() const { return currentSourceHeight; }
    melonDS::u32 getOutputWidth() const { return currentOutputWidth; }
    melonDS::u32 getOutputHeight() const { return currentOutputHeight; }

private:
    bool createChain(
        const std::string& presetPath,
        melonDS::u32 sourceWidth,
        melonDS::u32 sourceHeight,
        melonDS::u32 outputWidth,
        melonDS::u32 outputHeight,
        const std::vector<std::pair<std::string, float>>& parameterOverrides);
    static void logError(const char* context, libra_error_t error);
    static std::string describeError(const char* context, libra_error_t error);

private:
    libra_gl_filter_chain_t chain = nullptr;
    std::string currentPresetPath;
    melonDS::u32 currentSourceWidth = 0;
    melonDS::u32 currentSourceHeight = 0;
    melonDS::u32 currentOutputWidth = 0;
    melonDS::u32 currentOutputHeight = 0;
    std::vector<std::pair<std::string, float>> currentParameterOverrides;
};

}

#endif
