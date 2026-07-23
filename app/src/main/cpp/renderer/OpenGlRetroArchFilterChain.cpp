#include "renderer/OpenGlRetroArchFilterChain.h"

#include <dlfcn.h>
#include <EGL/egl.h>
#include <utility>

#include "Platform.h"
#include "renderer/ShaderDiagnostics.h"

namespace MelonDSAndroid
{

namespace
{

const void* glLoader(const char* name)
{
    static void* glesV3 = dlopen("libGLESv3.so", RTLD_NOW | RTLD_LOCAL);
    static void* glesV2 = dlopen("libGLESv2.so", RTLD_NOW | RTLD_LOCAL);

    if (name == nullptr)
        return nullptr;

    if (glesV3 != nullptr)
    {
        if (void* symbol = dlsym(glesV3, name))
            return symbol;
    }
    if (glesV2 != nullptr)
    {
        if (void* symbol = dlsym(glesV2, name))
            return symbol;
    }
    if (void* symbol = dlsym(RTLD_DEFAULT, name))
        return symbol;

    return reinterpret_cast<const void*>(eglGetProcAddress(name));
}

}

OpenGlRetroArchFilterChain::~OpenGlRetroArchFilterChain()
{
    shutdown();
}

OpenGlRetroArchFilterChain::OpenGlRetroArchFilterChain(OpenGlRetroArchFilterChain&& other) noexcept
{
    chain = other.chain;
    currentPresetPath = std::move(other.currentPresetPath);
    currentSourceWidth = other.currentSourceWidth;
    currentSourceHeight = other.currentSourceHeight;
    currentOutputWidth = other.currentOutputWidth;
    currentOutputHeight = other.currentOutputHeight;
    currentParameterOverrides = std::move(other.currentParameterOverrides);

    other.chain = nullptr;
    other.currentSourceWidth = 0;
    other.currentSourceHeight = 0;
    other.currentOutputWidth = 0;
    other.currentOutputHeight = 0;
}

OpenGlRetroArchFilterChain& OpenGlRetroArchFilterChain::operator=(OpenGlRetroArchFilterChain&& other) noexcept
{
    if (this == &other)
        return *this;

    shutdown();
    chain = other.chain;
    currentPresetPath = std::move(other.currentPresetPath);
    currentSourceWidth = other.currentSourceWidth;
    currentSourceHeight = other.currentSourceHeight;
    currentOutputWidth = other.currentOutputWidth;
    currentOutputHeight = other.currentOutputHeight;
    currentParameterOverrides = std::move(other.currentParameterOverrides);

    other.chain = nullptr;
    other.currentSourceWidth = 0;
    other.currentSourceHeight = 0;
    other.currentOutputWidth = 0;
    other.currentOutputHeight = 0;
    return *this;
}

void OpenGlRetroArchFilterChain::shutdown()
{
    if (chain != nullptr)
    {
        libra_error_t error = libra_gl_filter_chain_free(&chain);
        if (error != nullptr)
            logError("libra_gl_filter_chain_free", error);
        chain = nullptr;
    }

    currentPresetPath.clear();
    currentSourceWidth = 0;
    currentSourceHeight = 0;
    currentOutputWidth = 0;
    currentOutputHeight = 0;
    currentParameterOverrides.clear();
}

bool OpenGlRetroArchFilterChain::configure(
    const std::string& presetPath,
    melonDS::u32 sourceWidth,
    melonDS::u32 sourceHeight,
    melonDS::u32 outputWidth,
    melonDS::u32 outputHeight,
    const std::vector<std::pair<std::string, float>>& parameterOverrides)
{
    if (presetPath.empty() || sourceWidth == 0 || sourceHeight == 0 || outputWidth == 0 || outputHeight == 0)
    {
        shutdown();
        return false;
    }

    if (chain != nullptr
        && currentPresetPath == presetPath
        && currentParameterOverrides == parameterOverrides)
    {
        currentSourceWidth = sourceWidth;
        currentSourceHeight = sourceHeight;
        currentOutputWidth = outputWidth;
        currentOutputHeight = outputHeight;
        return true;
    }

    shutdown();
    return createChain(presetPath, sourceWidth, sourceHeight, outputWidth, outputHeight, parameterOverrides);
}

bool OpenGlRetroArchFilterChain::createChain(
    const std::string& presetPath,
    melonDS::u32 sourceWidth,
    melonDS::u32 sourceHeight,
    melonDS::u32 outputWidth,
    melonDS::u32 outputHeight,
    const std::vector<std::pair<std::string, float>>& parameterOverrides)
{
    libra_preset_ctx_t presetContext = nullptr;
    libra_error_t error = libra_preset_ctx_create(&presetContext);
    if (error != nullptr)
    {
        logError("libra_preset_ctx_create", error);
        return false;
    }
    (void)libra_preset_ctx_set_runtime(&presetContext, LIBRA_PRESET_CTX_RUNTIME_GL_CORE);
    (void)libra_preset_ctx_set_core_name(&presetContext, "melonDS Android");
    (void)libra_preset_ctx_set_core_aspect_orientation(&presetContext, LIBRA_PRESET_CTX_ORIENTATION_HORIZONTAL);
    (void)libra_preset_ctx_set_view_aspect_orientation(&presetContext, LIBRA_PRESET_CTX_ORIENTATION_HORIZONTAL);
    (void)libra_preset_ctx_set_allow_rotation(&presetContext, false);

    libra_preset_opt_t presetOptions{};
    presetOptions.version = LIBRASHADER_CURRENT_ABI;
    presetOptions.original_aspect_uniforms = true;
    presetOptions.frametime_uniforms = true;

    auto reportFailure = [&](const char* context, libra_error_t failure) {
        ShaderDiagnostics::Entry entry;
        entry.backend = "OpenGL";
        entry.presetPath = presetPath;
        entry.succeeded = false;
        entry.sourceWidth = sourceWidth;
        entry.sourceHeight = sourceHeight;
        entry.outputWidth = outputWidth;
        entry.outputHeight = outputHeight;
        entry.reason = describeError(context, failure);
        ShaderDiagnostics::get().record(entry);
    };

    libra_shader_preset_t preset = nullptr;
    error = libra_preset_create_with_options(presetPath.c_str(), &presetContext, &presetOptions, &preset);
    if (error != nullptr)
    {
        reportFailure("libra_preset_create_with_options", error);
        if (presetContext != nullptr)
            (void)libra_preset_ctx_free(&presetContext);
        return false;
    }

    filter_chain_gl_opt_t options{};
    options.version = LIBRASHADER_CURRENT_ABI;
    options.glsl_version = 0;
    options.use_dsa = false;
    options.force_no_mipmaps = false;
    options.disable_cache = false;

    error = libra_gl_filter_chain_create(&preset, glLoader, &options, &chain);
    if (error != nullptr)
    {
        reportFailure("libra_gl_filter_chain_create", error);
        if (preset != nullptr)
            (void)libra_preset_free(&preset);
        return false;
    }

    for (const auto& [name, value] : parameterOverrides)
    {
        if (name.empty())
            continue;
        libra_error_t paramError = libra_gl_filter_chain_set_param(&chain, name.c_str(), value);
        if (paramError != nullptr)
            logError("libra_gl_filter_chain_set_param", paramError);
    }

    currentPresetPath = presetPath;
    currentSourceWidth = sourceWidth;
    currentSourceHeight = sourceHeight;
    currentOutputWidth = outputWidth;
    currentOutputHeight = outputHeight;
    currentParameterOverrides = parameterOverrides;

    ShaderDiagnostics::Entry successEntry;
    successEntry.backend = "OpenGL";
    successEntry.presetPath = presetPath;
    successEntry.succeeded = true;
    successEntry.sourceWidth = sourceWidth;
    successEntry.sourceHeight = sourceHeight;
    successEntry.outputWidth = outputWidth;
    successEntry.outputHeight = outputHeight;
    ShaderDiagnostics::get().record(successEntry);

    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "OpenGlPresenter[RetroArch]: preset=%s source=%ux%u output=%ux%u params=%zu",
        presetPath.c_str(),
        sourceWidth,
        sourceHeight,
        outputWidth,
        outputHeight,
        parameterOverrides.size());
    return true;
}

bool OpenGlRetroArchFilterChain::renderFrame(
    GLuint sourceTexture,
    GLuint outputTexture,
    melonDS::u64 frameCount,
    bool clearHistory,
    melonDS::u32 frametimeDeltaMs)
{
    if (chain == nullptr
        || sourceTexture == 0
        || outputTexture == 0
        || currentSourceWidth == 0
        || currentSourceHeight == 0
        || currentOutputWidth == 0
        || currentOutputHeight == 0)
    {
        return false;
    }

    libra_image_gl_t source{};
    source.handle = sourceTexture;
    source.format = GL_RGBA8;
    source.width = currentSourceWidth;
    source.height = currentSourceHeight;

    libra_image_gl_t output{};
    output.handle = outputTexture;
    output.format = GL_RGBA8;
    output.width = currentOutputWidth;
    output.height = currentOutputHeight;

    libra_viewport_t viewport{};
    viewport.x = 0.0f;
    viewport.y = 0.0f;
    viewport.width = currentOutputWidth;
    viewport.height = currentOutputHeight;

    frame_gl_opt_t options{};
    options.version = LIBRASHADER_CURRENT_ABI;
    options.clear_history = clearHistory;
    options.frame_direction = 1;
    options.rotation = 0;
    options.total_subframes = 1;
    options.current_subframe = 1;
    options.aspect_ratio = 4.0f / 3.0f;
    options.frames_per_second = 60.0f;
    options.frametime_delta = frametimeDeltaMs;

    libra_error_t error = libra_gl_filter_chain_frame(
        &chain,
        static_cast<size_t>(frameCount),
        source,
        output,
        &viewport,
        nullptr,
        &options);
    if (error != nullptr)
    {
        logError("libra_gl_filter_chain_frame", error);
        return false;
    }

    return true;
}

void OpenGlRetroArchFilterChain::logError(const char* context, libra_error_t error)
{
    (void)describeError(context, error);
}

std::string OpenGlRetroArchFilterChain::describeError(const char* context, libra_error_t error)
{
    std::string description;
    char* message = nullptr;
    if (libra_error_write(error, &message) == 0 && message != nullptr)
    {
        description = message;
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "%s failed: %s", context, message);
        (void)libra_error_free_string(&message);
    }
    else
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "%s failed", context);
    }
    (void)libra_error_free(&error);

    if (description.empty())
        description = std::string(context) + " failed";
    return description;
}

}
