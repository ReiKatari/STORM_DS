#ifndef OPENGLRETROARCHFILTER_H
#define OPENGLRETROARCHFILTER_H

#include <mutex>
#include <string>
#include <utility>
#include <vector>

#include MELONDS_GL_HEADER

#include "renderer/OpenGlRetroArchFilterChain.h"
#include "types.h"

namespace MelonDSAndroid
{

class OpenGlRetroArchFilter
{
public:
    struct Config
    {
        bool enabled = false;
        std::string presetPath;
        std::vector<std::pair<std::string, float>> parameterOverrides;
        bool clearHistory = false;
        bool nativeSourceResolution = false;
        melonDS::u32 maxLayoutWidth = 0;
        melonDS::u32 maxLayoutHeight = 0;
        melonDS::u32 passCount = 0;
    };

    struct Sizing
    {
        melonDS::u32 inputScale = 1;
        melonDS::u32 inputScreenWidth = 0;
        melonDS::u32 inputScreenHeight = 0;
        melonDS::u32 inputBottomOffsetY = 0;
        melonDS::u32 sourceScreenWidth = 0;
        melonDS::u32 sourceScreenHeight = 0;
        melonDS::u32 requestedOutputWidth = 0;
        melonDS::u32 requestedOutputHeight = 0;
        melonDS::u32 outputScreenWidth = 0;
        melonDS::u32 outputScreenHeight = 0;
        melonDS::u32 outputAtlasWidth = 0;
        melonDS::u32 outputAtlasHeight = 0;
        melonDS::u32 outputBottomOffsetY = 0;
        bool nativeDisplayMode = false;
        bool clamped = false;
    };

    static OpenGlRetroArchFilter& get();

    void setConfig(const Config& config);

    GLuint runFilter(GLuint sourceTexture, melonDS::u32 atlasWidth, melonDS::u32 atlasHeight);

    bool prewarm(melonDS::u32 atlasWidth, melonDS::u32 atlasHeight);

    void release();

private:
    struct ImageResource
    {
        GLuint texture = 0;
        melonDS::u32 width = 0;
        melonDS::u32 height = 0;
    };

    OpenGlRetroArchFilter() = default;

    Sizing calculateSizing(melonDS::u32 atlasWidth, melonDS::u32 atlasHeight) const;
    bool ensureChains(const Sizing& sizing, const std::string& configKey, melonDS::u32 atlasWidth, melonDS::u32 atlasHeight);
    bool ensureResources(const Sizing& sizing);
    void logSizingIfNeeded(const Sizing& sizing, melonDS::u32 atlasWidth, melonDS::u32 atlasHeight);
    bool ensureImage(ImageResource& image, melonDS::u32 width, melonDS::u32 height, bool swapRedAndBlue);
    bool drawScreenInput(
        GLuint sourceTexture,
        melonDS::u32 srcX0, melonDS::u32 srcY0, melonDS::u32 srcX1, melonDS::u32 srcY1,
        melonDS::u32 sourceWidth, melonDS::u32 sourceHeight,
        const ImageResource& destination,
        bool linear);
    bool ensureChannelSwapProgram();
    void destroyImage(ImageResource& image);
    void blitRegion(
        GLuint sourceTexture,
        melonDS::u32 srcX0, melonDS::u32 srcY0, melonDS::u32 srcX1, melonDS::u32 srcY1,
        GLuint destinationTexture,
        melonDS::u32 dstX0, melonDS::u32 dstY0, melonDS::u32 dstX1, melonDS::u32 dstY1,
        bool linear);
    std::string makeConfigKey(melonDS::u32 atlasWidth, melonDS::u32 atlasHeight) const;

private:
    std::mutex mutex;
    Config config;
    bool configDirty = false;

    OpenGlRetroArchFilterChain topChain;
    OpenGlRetroArchFilterChain bottomChain;
    ImageResource topInput;
    ImageResource topOutput;
    ImageResource bottomInput;
    ImageResource bottomOutput;
    ImageResource atlasOutput;
    GLuint readFbo = 0;
    GLuint drawFbo = 0;
    GLuint channelSwapProgram = 0;
    GLint channelSwapUvRect = -1;
    GLuint channelSwapVao = 0;

    melonDS::u64 frameCount = 0;
    bool pendingClearHistory = false;
    std::string failedConfigKey;
    std::string lastResourceFailureKey;
    std::string lastSizingLogKey;
};

}

#endif
