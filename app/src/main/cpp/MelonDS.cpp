#include <cstring>
#include <cstdlib>
#include <utility>
#include <atomic>
#include <cctype>
#include <vector>
#include <thread>
#include <android/asset_manager.h>
#include <sys/system_properties.h>
#include <oboe/Oboe.h>
#include "EmulatorArgsBuilder.h"
#include "MelonDS.h"
#include "MelonDSAudio.h"
#include "OboeCallback.h"
#include "MicInputOboeCallback.h"
#include "OpenGLContext.h"
#include "mic_blow.h"
#include "NDS.h"
#include "GPU.h"
#include "GPU3D.h"
#include "GBACart.h"
#include "SPU.h"
#include "Platform.h"
#include "Savestate.h"
#include "MelonInstance.h"
#include "RewindManager.h"
#include "ROMManager.h"
#include "MPInterface.h"
#include "AndroidCameraHandler.h"
#include "renderer/ScreenshotRenderer.h"
#include "renderer/FrameQueue.h"
#include "retroachievements/RetroAchievementsManager.h"
#include "net/Net.h"
#include "net/Net_Slirp.h"
#include <fstream>
#include <mutex>
#include <condition_variable>
#include <deque>

#ifndef MELONDS_ANDROID_DEBUG_BUILD
#define MELONDS_ANDROID_DEBUG_BUILD 0
#endif

namespace MelonDSAndroid
{
    namespace
    {
        std::atomic<bool> fastForwardActive{false};
        std::atomic<bool> muteOnFastForwardActive{true};
        std::atomic<bool> rewindActive{false};
        std::atomic_bool rendererDebugToolsEnabled = false;
        std::atomic_bool rendererDebugBgObjEnabled = false;
        std::atomic_bool rendererDebugLatchTraceEnabled = false;
        std::atomic_bool vulkanPerfLoggingEnabled = false;
        std::atomic_bool vulkanGpu2DPerfLoggingEnabled = false;
        std::atomic_bool vulkanLatchPerfLoggingEnabled = false;
        std::atomic_bool vulkanAsyncFrameTailEnabled = false;
        std::atomic_bool vulkanSetupPerfLoggingEnabled = false;
        std::atomic_uint vulkanDiagnosticFlags = 0;
        constexpr int kRenderer2DDebugNativeMode = -1;
        constexpr u32 kRenderer2DDebugAllFeatures =
            Renderer2DDebugFeatureStaticBackground
            | Renderer2DDebugFeatureAffineBackground
            | Renderer2DDebugFeatureAffineExtendedTiledBackground
            | Renderer2DDebugFeatureAffineExtendedBitmap256Background
            | Renderer2DDebugFeatureAffineExtendedDirectColorBackground
            | Renderer2DDebugFeatureLargeScreenBackground
            | Renderer2DDebugFeature3DBackground
            | Renderer2DDebugFeatureObjects
            | Renderer2DDebugFeatureRegularObject
            | Renderer2DDebugFeatureAffineObject
            | Renderer2DDebugFeatureTiled4BppObject
            | Renderer2DDebugFeatureTiled8BppObject
            | Renderer2DDebugFeatureBitmapObject
            | Renderer2DDebugFeatureBlendedObject
            | Renderer2DDebugFeatureWindowObject
            | Renderer2DDebugFeatureMosaicObject
            | Renderer2DDebugFeatureObjectUpperBand
            | Renderer2DDebugFeatureObjectMiddleBand
            | Renderer2DDebugFeatureObjectLowerBand;
        constexpr u32 kRenderer3DDebugAllFeatures =
            Renderer3DDebugFeatureRendererOutput
            | Renderer3DDebugFeatureTrianglePolygons
            | Renderer3DDebugFeatureLinePolygons
            | Renderer3DDebugFeatureOpaquePolygons
            | Renderer3DDebugFeatureTranslucentPolygons
            | Renderer3DDebugFeatureShadowMaskPolygons
            | Renderer3DDebugFeatureShadowPolygons
            | Renderer3DDebugFeatureTexturedPolygons
            | Renderer3DDebugFeatureUntexturedPolygons
            | Renderer3DDebugFeatureModulatePolygons
            | Renderer3DDebugFeatureDecalPolygons
            | Renderer3DDebugFeatureToonHighlightPolygons
            | Renderer3DDebugFeatureWBufferPolygons
            | Renderer3DDebugFeatureZBufferPolygons
            | Renderer3DDebugFeatureDepthWritePolygons
            | Renderer3DDebugFeatureFogWritePolygons
            | Renderer3DDebugFeatureUpperBand
            | Renderer3DDebugFeatureMiddleBand
            | Renderer3DDebugFeatureLowerBand;
        std::atomic_int renderer2dMainForcedMode = kRenderer2DDebugNativeMode;
        std::atomic_int renderer2dSubForcedMode = kRenderer2DDebugNativeMode;
        std::atomic_int renderer2dTopForcedCompMode = kRenderer2DDebugNativeMode;
        std::atomic_int renderer2dBottomForcedCompMode = kRenderer2DDebugNativeMode;
        std::atomic_uint renderer2dDisabledMainBgMask = 0;
        std::atomic_uint renderer2dDisabledSubBgMask = 0;
        std::atomic_uint renderer2dDisabledMainBgPriorityMask = 0;
        std::atomic_uint renderer2dDisabledSubBgPriorityMask = 0;
        std::atomic_uint renderer2dDisabledMainObjPriorityMask = 0;
        std::atomic_uint renderer2dDisabledSubObjPriorityMask = 0;
        std::atomic_uint renderer2dDisabledMainObjOrderMask = 0;
        std::atomic_uint renderer2dDisabledSubObjOrderMask = 0;
        std::atomic_uint renderer2dFeatureMask = kRenderer2DDebugAllFeatures;
        std::atomic_uint renderer3dFeatureMask = kRenderer3DDebugAllFeatures;

        int NormalizeRenderer2DForcedMode(int mode, bool mainEngine)
        {
            if (mode < 0)
                return kRenderer2DDebugNativeMode;

            const int maxMode = mainEngine ? 6 : 5;
            return mode <= maxMode ? mode : kRenderer2DDebugNativeMode;
        }

        int NormalizeRenderer2DForcedCompMode(int compMode)
        {
            if (compMode < 0)
                return kRenderer2DDebugNativeMode;

            return compMode <= 7 ? compMode : kRenderer2DDebugNativeMode;
        }

        void ResetRenderer2DDebugControls()
        {
            renderer2dMainForcedMode.store(kRenderer2DDebugNativeMode, std::memory_order_relaxed);
            renderer2dSubForcedMode.store(kRenderer2DDebugNativeMode, std::memory_order_relaxed);
            renderer2dTopForcedCompMode.store(kRenderer2DDebugNativeMode, std::memory_order_relaxed);
            renderer2dBottomForcedCompMode.store(kRenderer2DDebugNativeMode, std::memory_order_relaxed);
            renderer2dDisabledMainBgMask.store(0, std::memory_order_relaxed);
            renderer2dDisabledSubBgMask.store(0, std::memory_order_relaxed);
            renderer2dDisabledMainBgPriorityMask.store(0, std::memory_order_relaxed);
            renderer2dDisabledSubBgPriorityMask.store(0, std::memory_order_relaxed);
            renderer2dDisabledMainObjPriorityMask.store(0, std::memory_order_relaxed);
            renderer2dDisabledSubObjPriorityMask.store(0, std::memory_order_relaxed);
            renderer2dDisabledMainObjOrderMask.store(0, std::memory_order_relaxed);
            renderer2dDisabledSubObjOrderMask.store(0, std::memory_order_relaxed);
            renderer2dFeatureMask.store(kRenderer2DDebugAllFeatures, std::memory_order_relaxed);
        }

        void ResetRenderer3DDebugControls()
        {
            renderer3dFeatureMask.store(kRenderer3DDebugAllFeatures, std::memory_order_relaxed);
        }

        bool RendererDebugControlsAvailable()
        {
            return true;
        }

        bool RendererDebugControlsEnabled()
        {
            return RendererDebugControlsAvailable()
                && rendererDebugToolsEnabled.load(std::memory_order_relaxed);
        }

        bool EqualsIgnoreCase(const char* lhs, const char* rhs)
        {
            if (lhs == nullptr || rhs == nullptr)
                return false;

            while (*lhs != '\0' && *rhs != '\0')
            {
                if (std::tolower(static_cast<unsigned char>(*lhs)) != std::tolower(static_cast<unsigned char>(*rhs)))
                    return false;
                lhs++;
                rhs++;
            }

            return *lhs == '\0' && *rhs == '\0';
        }

        bool ReadBooleanSystemProperty(const char* key, bool defaultValue = false)
        {
            char value[PROP_VALUE_MAX]{};
            const int length = __system_property_get(key, value);
            if (length <= 0)
                return defaultValue;

            if (EqualsIgnoreCase(value, "1")
                || EqualsIgnoreCase(value, "true")
                || EqualsIgnoreCase(value, "y")
                || EqualsIgnoreCase(value, "yes")
                || EqualsIgnoreCase(value, "on"))
            {
                return true;
            }

            if (EqualsIgnoreCase(value, "0")
                || EqualsIgnoreCase(value, "false")
                || EqualsIgnoreCase(value, "n")
                || EqualsIgnoreCase(value, "no")
                || EqualsIgnoreCase(value, "off"))
            {
                return false;
            }

            return defaultValue;
        }

        u32 ResolveVulkanDiagnosticFlags()
        {
            u32 flags = 0;

            if (ReadBooleanSystemProperty("debug.melonds.vulkan.disable_passive_repeat_expand"))
                flags |= VulkanDiagnosticDisablePassiveRepeatCoverageExpand;
            if (ReadBooleanSystemProperty("debug.melonds.vulkan.legacy_compat_fill_depth"))
                flags |= VulkanDiagnosticLegacyCompatFillDepth;
            if (ReadBooleanSystemProperty("debug.melonds.vulkan.legacy_final_aa_mask"))
                flags |= VulkanDiagnosticLegacyFinalAaMask;

            return flags;
        }

        bool ResolveVulkanGpu2DPerfLoggingEnabled()
        {
            return ReadBooleanSystemProperty("debug.melonds.vulkan.gpu2d_perf");
        }

        bool ResolveVulkanLatchPerfLoggingEnabled()
        {
            return ReadBooleanSystemProperty("debug.melonds.vulkan.latch_perf");
        }

        bool ResolveVulkanAsyncFrameTailEnabled()
        {
            return ReadBooleanSystemProperty("debug.melonds.vulkan.async_latch");
        }

        bool ResolveVulkanSetupPerfLoggingEnabled()
        {
            return ReadBooleanSystemProperty("debug.melonds.vulkan.setup_perf");
        }

        bool ResolveVulkanPerfLoggingEnabled()
        {
            return ReadBooleanSystemProperty("debug.melonds.vulkan.perf")
                || ReadBooleanSystemProperty("debug.melonds.vulkan.gpu2d_perf")
                || ReadBooleanSystemProperty("debug.melonds.vulkan.latch_perf")
                || ReadBooleanSystemProperty("debug.melonds.vulkan.setup_perf");
        }

        bool ResolveRendererDebugToolsEnabled(const EmulatorConfiguration& configuration)
        {
            if (!configuration.renderSettings)
                return false;

            switch (configuration.renderer)
            {
                case Renderer::Software:
                    return static_cast<const SoftwareRenderSettings&>(*configuration.renderSettings).rendererDebugToolsEnabled;
                case Renderer::OpenGl:
                    return static_cast<const OpenGlRenderSettings&>(*configuration.renderSettings).rendererDebugToolsEnabled;
                case Renderer::Vulkan:
                    return static_cast<const VulkanRenderSettings&>(*configuration.renderSettings).rendererDebugToolsEnabled;
                case Renderer::Compute:
                    return false;
            }

            return false;
        }

        bool ResolveRendererDebugBgObjEnabled(const EmulatorConfiguration& configuration)
        {
            if (!configuration.renderSettings)
                return false;

            switch (configuration.renderer)
            {
                case Renderer::Software:
                    return static_cast<const SoftwareRenderSettings&>(*configuration.renderSettings).rendererDebugBgObjEnabled;
                case Renderer::OpenGl:
                    return static_cast<const OpenGlRenderSettings&>(*configuration.renderSettings).rendererDebugBgObjEnabled;
                case Renderer::Vulkan:
                    return static_cast<const VulkanRenderSettings&>(*configuration.renderSettings).rendererDebugBgObjEnabled;
                case Renderer::Compute:
                    return false;
            }

            return false;
        }

        bool ResolveRendererDebugLatchTraceEnabled(const EmulatorConfiguration& configuration)
        {
            if (!configuration.renderSettings)
                return false;

            switch (configuration.renderer)
            {
                case Renderer::Software:
                    return static_cast<const SoftwareRenderSettings&>(*configuration.renderSettings).rendererDebugLatchTraceEnabled;
                case Renderer::OpenGl:
                    return static_cast<const OpenGlRenderSettings&>(*configuration.renderSettings).rendererDebugLatchTraceEnabled;
                case Renderer::Vulkan:
                    return static_cast<const VulkanRenderSettings&>(*configuration.renderSettings).rendererDebugLatchTraceEnabled;
                case Renderer::Compute:
                    return false;
            }

            return false;
        }

        void LogEffectiveJitConfiguration(const EmulatorConfiguration& configuration, const NDSArgs& args)
        {
            if (configuration.renderer != Renderer::Vulkan)
                return;

#ifdef JIT_ENABLED
            JITArgs effectiveJit{};
            effectiveJit.MaxBlockSize = 32;
            effectiveJit.LiteralOptimizations = true;
            effectiveJit.BranchOptimizations = true;
            effectiveJit.FastMemory = true;
            effectiveJit.HgEngineFix = configuration.hgEngineFixEnabled;

            const bool jitEnabled = args.JIT.has_value();
            if (jitEnabled)
                effectiveJit = *args.JIT;

            Platform::Log(
                Platform::LogLevel::Warn,
                "VulkanRuntime[JIT]: enabled=%d maxBlockSize=%u literalOpt=%d branchOpt=%d fastMemory=%d hgEngineFix=%d",
                jitEnabled ? 1 : 0,
                effectiveJit.MaxBlockSize,
                effectiveJit.LiteralOptimizations ? 1 : 0,
                effectiveJit.BranchOptimizations ? 1 : 0,
                effectiveJit.FastMemory ? 1 : 0,
                effectiveJit.HgEngineFix ? 1 : 0
            );
#else
            Platform::Log(
                Platform::LogLevel::Warn,
                "VulkanRuntime[JIT]: enabled=0 compiled=0 maxBlockSize=32 literalOpt=1 branchOpt=1 fastMemory=1 hgEngineFix=%d",
                configuration.hgEngineFixEnabled ? 1 : 0
            );
#endif
        }

        void ReleaseConfigurationPath(char*& path)
        {
            if (path != nullptr)
            {
                std::free(path);
                path = nullptr;
            }
        }

        char* DuplicateConfigurationPath(const char* path)
        {
            if (path == nullptr)
                return nullptr;

            const size_t len = std::strlen(path);
            char* copy = static_cast<char*>(std::malloc(len + 1));
            if (copy != nullptr)
                std::memcpy(copy, path, len + 1);
            return copy;
        }

        std::unique_ptr<MelonDSAndroid::RenderSettings> CloneRenderSettings(
            MelonDSAndroid::Renderer renderer,
            const MelonDSAndroid::RenderSettings* source)
        {
            if (source == nullptr)
                return nullptr;

            switch (renderer)
            {
                case MelonDSAndroid::Renderer::Software:
                    return std::make_unique<MelonDSAndroid::SoftwareRenderSettings>(
                        *static_cast<const MelonDSAndroid::SoftwareRenderSettings*>(source));
                case MelonDSAndroid::Renderer::OpenGl:
                    return std::make_unique<MelonDSAndroid::OpenGlRenderSettings>(
                        *static_cast<const MelonDSAndroid::OpenGlRenderSettings*>(source));
                case MelonDSAndroid::Renderer::Compute:
                    return std::make_unique<MelonDSAndroid::ComputeRenderSettings>(
                        *static_cast<const MelonDSAndroid::ComputeRenderSettings*>(source));
                case MelonDSAndroid::Renderer::Vulkan:
                    return std::make_unique<MelonDSAndroid::VulkanRenderSettings>(
                        *static_cast<const MelonDSAndroid::VulkanRenderSettings*>(source));
                default:
                    return nullptr;
            }
        }

        void DestroyEmulatorConfiguration(MelonDSAndroid::EmulatorConfiguration* configuration)
        {
            if (configuration == nullptr)
                return;

            ReleaseConfigurationPath(configuration->dsBios7Path);
            ReleaseConfigurationPath(configuration->dsBios9Path);
            ReleaseConfigurationPath(configuration->dsFirmwarePath);
            ReleaseConfigurationPath(configuration->dsiBios7Path);
            ReleaseConfigurationPath(configuration->dsiBios9Path);
            ReleaseConfigurationPath(configuration->dsiFirmwarePath);
            ReleaseConfigurationPath(configuration->dsiNandPath);
            ReleaseConfigurationPath(configuration->internalFilesDir);
            ReleaseConfigurationPath(configuration->dsiSdCardSettings.imagePath);
            ReleaseConfigurationPath(configuration->dsiSdCardSettings.folderPath);
            ReleaseConfigurationPath(configuration->dldiSdCardSettings.imagePath);
            ReleaseConfigurationPath(configuration->dldiSdCardSettings.folderPath);
            delete configuration;
        }

        std::shared_ptr<MelonDSAndroid::EmulatorConfiguration> ShareConfiguration(MelonDSAndroid::EmulatorConfiguration configuration)
        {
            return std::shared_ptr<MelonDSAndroid::EmulatorConfiguration>(
                new MelonDSAndroid::EmulatorConfiguration(std::move(configuration)),
                [](MelonDSAndroid::EmulatorConfiguration* config) {
                    DestroyEmulatorConfiguration(config);
                }
            );
        }

        std::shared_ptr<MelonDSAndroid::EmulatorConfiguration> ShareConfiguration(std::unique_ptr<MelonDSAndroid::EmulatorConfiguration> configuration)
        {
            MelonDSAndroid::EmulatorConfiguration* rawConfiguration = configuration.release();
            return std::shared_ptr<MelonDSAndroid::EmulatorConfiguration>(
                rawConfiguration,
                [](MelonDSAndroid::EmulatorConfiguration* config) {
                    DestroyEmulatorConfiguration(config);
                }
            );
        }
    }
    OpenGLContext *openGlContext;
    AndroidFileHandler* fileHandler;
    AndroidCameraHandler* cameraHandler = nullptr;
    std::string internalFilesDir;
    std::shared_ptr<MelonEventMessenger> eventMessenger;
    std::shared_ptr<EmulatorConfiguration> currentConfiguration;
    std::shared_ptr<Net> net;

    std::shared_ptr<MelonInstance> instance;
    std::mutex currentConfigurationMutex;
    std::mutex instanceLifetimeMutex;
    std::mutex openGlContextMutex;
    std::mutex mpInterfaceMutex;

    std::shared_ptr<EmulatorConfiguration> GetConfigurationSnapshot()
    {
        std::lock_guard lock(currentConfigurationMutex);
        return currentConfiguration;
    }

    std::shared_ptr<MelonInstance> GetInstanceSnapshot()
    {
        std::lock_guard lock(instanceLifetimeMutex);
        return instance;
    }

    void ReplaceInstance(std::shared_ptr<MelonInstance> replacement)
    {
        std::lock_guard lock(instanceLifetimeMutex);
        instance = std::move(replacement);
    }

    bool ensureOpenGlContext()
    {
        std::lock_guard lock(openGlContextMutex);
        if (openGlContext != nullptr)
            return true;

        auto* context = new OpenGLContext();
        if (!context->InitContext(0))
        {
            delete context;
            Platform::Log(Platform::LogLevel::Error, "Failed to initialize OpenGL context");
            return false;
        }

        openGlContext = context;
        return true;
    }

    bool setupOpenGlContext();
    void cleanupOpenGlContext();

    std::shared_ptr<EmulatorConfiguration> cloneEmulatorConfiguration(const EmulatorConfiguration& source)
    {
        EmulatorConfiguration copy{};
        copy.userInternalFirmwareAndBios = source.userInternalFirmwareAndBios;
        copy.dsBios7Path = DuplicateConfigurationPath(source.dsBios7Path);
        copy.dsBios9Path = DuplicateConfigurationPath(source.dsBios9Path);
        copy.dsFirmwarePath = DuplicateConfigurationPath(source.dsFirmwarePath);
        copy.dsiBios7Path = DuplicateConfigurationPath(source.dsiBios7Path);
        copy.dsiBios9Path = DuplicateConfigurationPath(source.dsiBios9Path);
        copy.dsiFirmwarePath = DuplicateConfigurationPath(source.dsiFirmwarePath);
        copy.dsiNandPath = DuplicateConfigurationPath(source.dsiNandPath);
        copy.internalFilesDir = DuplicateConfigurationPath(source.internalFilesDir);
        copy.fastForwardSpeedMultiplier = source.fastForwardSpeedMultiplier;
        copy.frameLimitSpeedMultiplier = source.frameLimitSpeedMultiplier;
        copy.showBootScreen = source.showBootScreen;
        copy.useJit = source.useJit;
        copy.hgEngineFixEnabled = source.hgEngineFixEnabled;
        copy.consoleType = source.consoleType;
        copy.audioSettings = source.audioSettings;
        copy.rewindEnabled = source.rewindEnabled;
        copy.rewindCaptureSpacingSeconds = source.rewindCaptureSpacingSeconds;
        copy.rewindLengthSeconds = source.rewindLengthSeconds;
        copy.firmwareConfiguration = source.firmwareConfiguration;
        copy.renderSettings = CloneRenderSettings(source.renderer, source.renderSettings.get());
        copy.dsiSdCardSettings = source.dsiSdCardSettings;
        copy.dsiSdCardSettings.imagePath = DuplicateConfigurationPath(source.dsiSdCardSettings.imagePath);
        copy.dsiSdCardSettings.folderPath = DuplicateConfigurationPath(source.dsiSdCardSettings.folderPath);
        copy.dldiSdCardSettings = source.dldiSdCardSettings;
        copy.dldiSdCardSettings.imagePath = DuplicateConfigurationPath(source.dldiSdCardSettings.imagePath);
        copy.dldiSdCardSettings.folderPath = DuplicateConfigurationPath(source.dldiSdCardSettings.folderPath);
        copy.renderer = source.renderer;
        copy.dsiWareAutoloadTitleId = source.dsiWareAutoloadTitleId;
        copy.arm9OverclockMultiplier = source.arm9OverclockMultiplier;
        copy.enable3dWidescreen = source.enable3dWidescreen;
        copy.enable60FpsPatch = source.enable60FpsPatch;
        copy.wfcDnsIp = source.wfcDnsIp;
        return ShareConfiguration(std::move(copy));
    }

    /**
     * Used to set the emulator's initial configuration, before boot. To update the configuration during runtime, use @updateEmulatorConfiguration.
     *
     * @param emulatorConfiguration The emulator configuration during the next emulator run
     */
    void setConfiguration(EmulatorConfiguration emulatorConfiguration) {
        auto sharedConfig = ShareConfiguration(std::move(emulatorConfiguration));
        {
            std::lock_guard lock(currentConfigurationMutex);
            currentConfiguration = sharedConfig;
        }
        internalFilesDir = sharedConfig->internalFilesDir ? sharedConfig->internalFilesDir : "";
        rendererDebugToolsEnabled.store(ResolveRendererDebugToolsEnabled(*sharedConfig), std::memory_order_relaxed);
        rendererDebugBgObjEnabled.store(ResolveRendererDebugBgObjEnabled(*sharedConfig), std::memory_order_relaxed);
        rendererDebugLatchTraceEnabled.store(ResolveRendererDebugLatchTraceEnabled(*sharedConfig), std::memory_order_relaxed);
        vulkanPerfLoggingEnabled.store(ResolveVulkanPerfLoggingEnabled(), std::memory_order_relaxed);
        vulkanGpu2DPerfLoggingEnabled.store(ResolveVulkanGpu2DPerfLoggingEnabled(), std::memory_order_relaxed);
        vulkanLatchPerfLoggingEnabled.store(ResolveVulkanLatchPerfLoggingEnabled(), std::memory_order_relaxed);
        vulkanAsyncFrameTailEnabled.store(ResolveVulkanAsyncFrameTailEnabled(), std::memory_order_relaxed);
        vulkanSetupPerfLoggingEnabled.store(ResolveVulkanSetupPerfLoggingEnabled(), std::memory_order_relaxed);
        vulkanDiagnosticFlags.store(ResolveVulkanDiagnosticFlags(), std::memory_order_relaxed);
        ResetRenderer2DDebugControls();
        ResetRenderer3DDebugControls();

        net = std::make_shared<Net>();
        net->SetDriver(std::make_unique<Net_Slirp>([](const u8* data, int len) {
            net->RXEnqueue(data, len);
        }));
    }

    void setup(AndroidCameraHandler* androidCameraHandler, std::shared_ptr<MelonEventMessenger> androidEventMessenger, u32* screenshotBufferPointer, int instanceId)
    {
        cameraHandler = androidCameraHandler;
        eventMessenger = androidEventMessenger;
        RetroAchievements::RetroAchievementsManager::EventMessenger = androidEventMessenger;
        auto configSnapshot = GetConfigurationSnapshot();
        if (!configSnapshot)
        {
            ReplaceInstance(nullptr);
            return;
        }
        auto instanceArgs = BuildArgsFromConfiguration(*configSnapshot, instanceId);
        if (!instanceArgs.has_value())
        {
            // TODO: Handle this somehow?
            ReplaceInstance(nullptr);
            return;
        }

        auto args = std::move(instanceArgs.value());
        LogEffectiveJitConfiguration(*configSnapshot, *args);
        auto newInstance = std::make_shared<MelonInstance>(
            instanceId,
            configSnapshot,
            std::move(args),
            net,
            std::make_unique<ScreenshotRenderer>(screenshotBufferPointer),
            configSnapshot->consoleType
        );
        ReplaceInstance(newInstance);

        setupAudio(configSnapshot->audioSettings);
        setAudioActiveInstance(newInstance);
    }

    void setCodeList(std::list<Cheat> cheats)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return;
        currentInstance->loadCheats(std::move(cheats));
    }

    bool setupAchievements(
        std::list<RetroAchievements::RAAchievement> achievements,
        std::list<RetroAchievements::RALeaderboard> leaderboards,
        std::optional<std::string> richPresenceScript,
        std::optional<RetroAchievements::RARuntimeBridgeConfig> runtimeBridgeConfig
    )
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "[RAClient] setupAchievements failed reason=no_instance\n"
            );
            return false;
        }
        return currentInstance->setupAchievements(
            std::move(achievements),
            std::move(leaderboards),
            std::move(richPresenceScript),
            std::move(runtimeBridgeConfig)
        );
    }

    void unloadRetroAchievementsData()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return;
        currentInstance->unloadRetroAchievementsData();
    }

    std::string getRichPresenceStatus()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return "";
        return currentInstance->getRichPresenceStatus();
    }

    std::vector<RetroAchievements::RARuntimeAchievement> getRuntimeAchievements()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return { };
        return currentInstance->getRuntimeAchievements();
    }

    std::vector<RetroAchievements::RARuntimeAchievementBucketEntry> getRuntimeAchievementBuckets()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return { };
        return currentInstance->getRuntimeAchievementBuckets();
    }

    std::vector<long> getRuntimeSubsetIds()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return { };
        return currentInstance->getRuntimeSubsetIds();
    }

    RetroAchievements::RANativePendingRetryResult retryPendingRetroAchievementsSubmissions(
        const std::vector<uint64_t>& expectedSubmissionIds)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
        {
            RetroAchievements::RANativePendingRetryResult result;
            result.transportFailure = true;
            return result;
        }
        return currentInstance->retryPendingRetroAchievementsSubmissions(
            expectedSubmissionIds
        );
    }

    uint64_t refreshPendingRetroAchievementsSubmissions()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return 0;
        return currentInstance->refreshPendingRetroAchievementsSubmissions();
    }

    int32_t discardPendingRetroAchievementsSubmissions(
        const std::vector<uint64_t>& expectedSubmissionIds)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return -1;
        return currentInstance->discardPendingRetroAchievementsSubmissions(
            expectedSubmissionIds
        );
    }

    void setRetroAchievementsSubmissionTransportSuspended(bool suspended)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (currentInstance)
        {
            currentInstance->setRetroAchievementsSubmissionTransportSuspended(
                suspended
            );
        }
    }

    void setRetroAchievementsHardcoreEnabled(bool enabled)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (currentInstance)
        {
            currentInstance->setRetroAchievementsHardcoreEnabled(enabled);
        }
    }

    Renderer getCurrentRenderer()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (currentInstance)
            return currentInstance->getCurrentRenderer();

        if (auto configSnapshot = GetConfigurationSnapshot())
            return configSnapshot->renderer;

        return Renderer::Software;
    }

    /**
     * Used to update the emulator's configuration during runtime. Will only update the configurations that can actually change during runtime without causing issues,
     *
     * @param emulatorConfiguration The new emulator configuration
     */
    void updateEmulatorConfiguration(std::unique_ptr<EmulatorConfiguration> emulatorConfiguration) {
        auto currentInstance = GetInstanceSnapshot();
        if (currentInstance)
        {
            currentInstance->normalizeVulkanPipelineProfileForSession(
                *emulatorConfiguration);
        }
        std::shared_ptr<EmulatorConfiguration> sharedConfig = ShareConfiguration(std::move(emulatorConfiguration));
        {
            std::lock_guard lock(currentConfigurationMutex);
            currentConfiguration = sharedConfig;
        }
        rendererDebugToolsEnabled.store(ResolveRendererDebugToolsEnabled(*sharedConfig), std::memory_order_relaxed);
        rendererDebugBgObjEnabled.store(ResolveRendererDebugBgObjEnabled(*sharedConfig), std::memory_order_relaxed);
        rendererDebugLatchTraceEnabled.store(ResolveRendererDebugLatchTraceEnabled(*sharedConfig), std::memory_order_relaxed);
        vulkanPerfLoggingEnabled.store(ResolveVulkanPerfLoggingEnabled(), std::memory_order_relaxed);
        vulkanGpu2DPerfLoggingEnabled.store(ResolveVulkanGpu2DPerfLoggingEnabled(), std::memory_order_relaxed);
        vulkanLatchPerfLoggingEnabled.store(ResolveVulkanLatchPerfLoggingEnabled(), std::memory_order_relaxed);
        vulkanAsyncFrameTailEnabled.store(ResolveVulkanAsyncFrameTailEnabled(), std::memory_order_relaxed);
        vulkanSetupPerfLoggingEnabled.store(ResolveVulkanSetupPerfLoggingEnabled(), std::memory_order_relaxed);
        vulkanDiagnosticFlags.store(ResolveVulkanDiagnosticFlags(), std::memory_order_relaxed);

        if (!currentInstance)
            return;

        currentInstance->updateConfiguration(sharedConfig);
        updateAudioSettings(sharedConfig->audioSettings);
    }

    int loadRom(std::string romPath, std::string sramPath, RomGbaSlotConfig* gbaSlotConfig)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return 2;

        if (!currentInstance->loadRom(std::move(romPath), std::move(sramPath)))
            return 2;

        if (gbaSlotConfig != nullptr)
        {
            if (gbaSlotConfig->type == GBA_ROM)
            {
                RomGbaSlotConfigGbaRom* gbaRomConfig = (RomGbaSlotConfigGbaRom*) gbaSlotConfig;
                if (!currentInstance->loadGbaRom(gbaRomConfig->romPath, gbaRomConfig->savePath))
                    return 1;
            }
            else if (gbaSlotConfig->type == RUMBLE_PAK)
            {
                currentInstance->loadRumblePak();
            }
            else if (gbaSlotConfig->type == MEMORY_EXPANSION)
            {
                currentInstance->loadGbaMemoryExpansion();
            }
            else if (gbaSlotConfig->type == ANALOG_INPUT)
            {
                Platform::Log(Platform::LogLevel::Warn, "MelonDSAndroid: enabling Slot-2 analog input addon\n");
                currentInstance->loadGbaAnalogInput();
            }
        }

        return 0;
    }

    int bootFirmware()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return ROMManager::FIRMWARE_BAD;

        if (currentInstance->bootFirmware())
            return ROMManager::SUCCESS;
        else
            return ROMManager::FIRMWARE_NOT_BOOTABLE;
    }

    bool precompileVulkanPipelines(const VulkanSurfaceConfig& retroArchConfig)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return false;

        return currentInstance->precompileVulkanPipelines(retroArchConfig);
    }

    void touchScreen(u16 x, u16 y)
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->touchScreen(x, y);
    }

    void releaseScreen()
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->releaseScreen();
    }

    void pressKey(u32 key)
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->pressKey(key);
    }

    void releaseKey(u32 key)
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->releaseKey(key);
    }

    void setSlot2AnalogInput(float x, float y)
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->setSlot2AnalogInput(x, y);
    }

    void setSlot2AddonType(int addonType)
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->setSlot2AddonType(addonType);
    }

    void start()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return;

        startAudio();
        if (currentInstance->getCurrentRenderer() != Renderer::Vulkan)
            setupOpenGlContext();

        currentInstance->start();
    }

    u32 loop()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return 0;

        {
            std::lock_guard lock(mpInterfaceMutex);
            MPInterface::Get().Process();
        }
        if (currentInstance->getCurrentRenderer() != Renderer::Vulkan)
            setupOpenGlContext();
        return currentInstance->runFrame();
    }

    Frame* getPresentationFrame(std::optional<std::chrono::time_point<std::chrono::steady_clock>> deadline)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return nullptr;

        return currentInstance->getPresentationFrame(deadline);
    }

    bool waitForPresentationFrame(Frame* frame, u64 timeoutNs)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return false;

        return currentInstance->waitForPresentationFrame(frame, timeoutNs);
    }

    int attachVulkanSurface(ANativeWindow* window, u32 width, u32 height)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
        {
            if (window != nullptr)
                ANativeWindow_release(window);
            return 0;
        }

        return currentInstance->attachVulkanSurface(window, width, height);
    }

    bool resizeVulkanSurface(int surfaceId, u32 width, u32 height)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return false;

        return currentInstance->resizeVulkanSurface(surfaceId, width, height);
    }

    bool configureVulkanSurface(int surfaceId, const VulkanSurfaceConfig& config, const VulkanBackgroundImage& backgroundImage)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return false;

        return currentInstance->configureVulkanSurface(surfaceId, config, backgroundImage);
    }

    void detachVulkanSurface(int surfaceId)
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->detachVulkanSurface(surfaceId);
    }

    bool presentVulkanFrame(
        std::optional<std::chrono::time_point<std::chrono::steady_clock>> deadline,
        std::optional<std::chrono::time_point<std::chrono::steady_clock>> budgetDeadline)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return false;

        return currentInstance->presentVulkanFrame(deadline, budgetDeadline);
    }

    void requestVulkanPresentationResync()
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->requestVulkanPresentationResync();
    }

    void requestVulkanFastForwardPresentationTransition()
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->requestVulkanFastForwardPresentationTransition();
    }

    bool areRendererDebugToolsEnabled()
    {
        return rendererDebugToolsEnabled.load(std::memory_order_relaxed);
    }

    bool areRendererDebugBgObjLogsEnabled()
    {
        return rendererDebugToolsEnabled.load(std::memory_order_relaxed)
            && rendererDebugBgObjEnabled.load(std::memory_order_relaxed);
    }

    bool areRendererDebugLatchTraceLogsEnabled()
    {
        return rendererDebugToolsEnabled.load(std::memory_order_relaxed)
            && rendererDebugLatchTraceEnabled.load(std::memory_order_relaxed);
    }

    bool isVulkanGpu2DPerfLoggingEnabled()
    {
        return rendererDebugToolsEnabled.load(std::memory_order_relaxed)
            && vulkanGpu2DPerfLoggingEnabled.load(std::memory_order_relaxed);
    }

    bool isVulkanPerfLoggingEnabled()
    {
        return rendererDebugToolsEnabled.load(std::memory_order_relaxed)
            && vulkanPerfLoggingEnabled.load(std::memory_order_relaxed);
    }

    bool isVulkanLatchPerfLoggingEnabled()
    {
        return rendererDebugToolsEnabled.load(std::memory_order_relaxed)
            && vulkanLatchPerfLoggingEnabled.load(std::memory_order_relaxed);
    }

    bool isVulkanAsyncFrameTailEnabled()
    {
        return vulkanAsyncFrameTailEnabled.load(std::memory_order_relaxed);
    }

    bool isVulkanSetupPerfLoggingEnabled()
    {
        return rendererDebugToolsEnabled.load(std::memory_order_relaxed)
            && vulkanSetupPerfLoggingEnabled.load(std::memory_order_relaxed);
    }

    Renderer2DDebugControlState getRenderer2DDebugControls()
    {
        return Renderer2DDebugControlState{
            .mainForcedMode = renderer2dMainForcedMode.load(std::memory_order_relaxed),
            .subForcedMode = renderer2dSubForcedMode.load(std::memory_order_relaxed),
            .topForcedCompMode = renderer2dTopForcedCompMode.load(std::memory_order_relaxed),
            .bottomForcedCompMode = renderer2dBottomForcedCompMode.load(std::memory_order_relaxed),
            .disabledMainBgMask = renderer2dDisabledMainBgMask.load(std::memory_order_relaxed),
            .disabledSubBgMask = renderer2dDisabledSubBgMask.load(std::memory_order_relaxed),
            .disabledMainBgPriorityMask = renderer2dDisabledMainBgPriorityMask.load(std::memory_order_relaxed),
            .disabledSubBgPriorityMask = renderer2dDisabledSubBgPriorityMask.load(std::memory_order_relaxed),
            .disabledMainObjPriorityMask = renderer2dDisabledMainObjPriorityMask.load(std::memory_order_relaxed),
            .disabledSubObjPriorityMask = renderer2dDisabledSubObjPriorityMask.load(std::memory_order_relaxed),
            .disabledMainObjOrderMask = renderer2dDisabledMainObjOrderMask.load(std::memory_order_relaxed),
            .disabledSubObjOrderMask = renderer2dDisabledSubObjOrderMask.load(std::memory_order_relaxed),
            .featureMask = renderer2dFeatureMask.load(std::memory_order_relaxed) & kRenderer2DDebugAllFeatures,
        };
    }

    void setRenderer2DDebugControls(
        int mainForcedMode,
        int subForcedMode,
        int topForcedCompMode,
        int bottomForcedCompMode,
        u32 disabledMainBgMask,
        u32 disabledSubBgMask,
        u32 disabledMainBgPriorityMask,
        u32 disabledSubBgPriorityMask,
        u32 disabledMainObjPriorityMask,
        u32 disabledSubObjPriorityMask,
        u32 disabledMainObjOrderMask,
        u32 disabledSubObjOrderMask,
        u32 featureMask)
    {
        if (!RendererDebugControlsAvailable())
        {
            ResetRenderer2DDebugControls();
            return;
        }

        renderer2dMainForcedMode.store(NormalizeRenderer2DForcedMode(mainForcedMode, true), std::memory_order_relaxed);
        renderer2dSubForcedMode.store(NormalizeRenderer2DForcedMode(subForcedMode, false), std::memory_order_relaxed);
        renderer2dTopForcedCompMode.store(NormalizeRenderer2DForcedCompMode(topForcedCompMode), std::memory_order_relaxed);
        renderer2dBottomForcedCompMode.store(NormalizeRenderer2DForcedCompMode(bottomForcedCompMode), std::memory_order_relaxed);
        renderer2dDisabledMainBgMask.store(disabledMainBgMask & 0xFu, std::memory_order_relaxed);
        renderer2dDisabledSubBgMask.store(disabledSubBgMask & 0xFu, std::memory_order_relaxed);
        renderer2dDisabledMainBgPriorityMask.store(disabledMainBgPriorityMask & 0xFu, std::memory_order_relaxed);
        renderer2dDisabledSubBgPriorityMask.store(disabledSubBgPriorityMask & 0xFu, std::memory_order_relaxed);
        renderer2dDisabledMainObjPriorityMask.store(disabledMainObjPriorityMask & 0xFu, std::memory_order_relaxed);
        renderer2dDisabledSubObjPriorityMask.store(disabledSubObjPriorityMask & 0xFu, std::memory_order_relaxed);
        renderer2dDisabledMainObjOrderMask.store(disabledMainObjOrderMask & 0xFu, std::memory_order_relaxed);
        renderer2dDisabledSubObjOrderMask.store(disabledSubObjOrderMask & 0xFu, std::memory_order_relaxed);
        renderer2dFeatureMask.store(featureMask & kRenderer2DDebugAllFeatures, std::memory_order_relaxed);
        requestVulkanPresentationResync();
    }

    Renderer3DDebugControlState getRenderer3DDebugControls()
    {
        return Renderer3DDebugControlState{
            .featureMask = renderer3dFeatureMask.load(std::memory_order_relaxed) & kRenderer3DDebugAllFeatures,
        };
    }

    void setRenderer3DDebugControls(u32 featureMask)
    {
        if (!RendererDebugControlsAvailable())
        {
            ResetRenderer3DDebugControls();
            return;
        }

        renderer3dFeatureMask.store(featureMask & kRenderer3DDebugAllFeatures, std::memory_order_relaxed);
        requestVulkanPresentationResync();
    }

    int getRenderer2DDebugForcedMode(u32 unit)
    {
        if (!RendererDebugControlsEnabled())
            return kRenderer2DDebugNativeMode;

        return unit == 0
            ? renderer2dMainForcedMode.load(std::memory_order_relaxed)
            : renderer2dSubForcedMode.load(std::memory_order_relaxed);
    }

    int getRenderer2DDebugForcedCompMode(bool topScreen)
    {
        if (!RendererDebugControlsEnabled())
            return kRenderer2DDebugNativeMode;

        return topScreen
            ? renderer2dTopForcedCompMode.load(std::memory_order_relaxed)
            : renderer2dBottomForcedCompMode.load(std::memory_order_relaxed);
    }

    bool isRenderer2DDebugBgLayerEnabled(u32 unit, u32 bgnum)
    {
        if (!RendererDebugControlsEnabled() || bgnum >= 4)
            return true;

        const u32 disabledMask = unit == 0
            ? renderer2dDisabledMainBgMask.load(std::memory_order_relaxed)
            : renderer2dDisabledSubBgMask.load(std::memory_order_relaxed);
        return (disabledMask & (1u << bgnum)) == 0u;
    }

    bool isRenderer2DDebugBgPriorityEnabled(u32 unit, u32 priority)
    {
        if (!RendererDebugControlsEnabled() || priority >= 4)
            return true;

        const u32 disabledMask = unit == 0
            ? renderer2dDisabledMainBgPriorityMask.load(std::memory_order_relaxed)
            : renderer2dDisabledSubBgPriorityMask.load(std::memory_order_relaxed);
        return (disabledMask & (1u << priority)) == 0u;
    }

    bool isRenderer2DDebugBackgroundKindEnabled(u32 featureFlag)
    {
        if (!RendererDebugControlsEnabled())
            return true;

        return (renderer2dFeatureMask.load(std::memory_order_relaxed) & featureFlag) != 0u;
    }

    bool areRenderer2DDebugObjectsEnabled(u32 unit)
    {
        (void)unit;
        if (!RendererDebugControlsEnabled())
            return true;

        return (renderer2dFeatureMask.load(std::memory_order_relaxed) & Renderer2DDebugFeatureObjects) != 0u;
    }

    bool isRenderer2DDebugObjectPriorityEnabled(u32 unit, u32 priority)
    {
        if (!RendererDebugControlsEnabled() || priority >= 4)
            return true;

        const u32 disabledMask = unit == 0
            ? renderer2dDisabledMainObjPriorityMask.load(std::memory_order_relaxed)
            : renderer2dDisabledSubObjPriorityMask.load(std::memory_order_relaxed);
        return (disabledMask & (1u << priority)) == 0u;
    }

    bool isRenderer2DDebugObjectOrderEnabled(u32 unit, u32 orderBucket)
    {
        if (!RendererDebugControlsEnabled() || orderBucket >= 4)
            return true;

        const u32 disabledMask = unit == 0
            ? renderer2dDisabledMainObjOrderMask.load(std::memory_order_relaxed)
            : renderer2dDisabledSubObjOrderMask.load(std::memory_order_relaxed);
        return (disabledMask & (1u << orderBucket)) == 0u;
    }

    bool isRenderer2DDebugObjectFeatureEnabled(u32 featureFlag)
    {
        if (!RendererDebugControlsEnabled())
            return true;

        return (renderer2dFeatureMask.load(std::memory_order_relaxed) & featureFlag) != 0u;
    }

    bool areRenderer2DDebugControlsActive()
    {
        if (!RendererDebugControlsEnabled())
            return false;

        return renderer2dMainForcedMode.load(std::memory_order_relaxed) != kRenderer2DDebugNativeMode
            || renderer2dSubForcedMode.load(std::memory_order_relaxed) != kRenderer2DDebugNativeMode
            || renderer2dTopForcedCompMode.load(std::memory_order_relaxed) != kRenderer2DDebugNativeMode
            || renderer2dBottomForcedCompMode.load(std::memory_order_relaxed) != kRenderer2DDebugNativeMode
            || renderer2dDisabledMainBgMask.load(std::memory_order_relaxed) != 0u
            || renderer2dDisabledSubBgMask.load(std::memory_order_relaxed) != 0u
            || renderer2dDisabledMainBgPriorityMask.load(std::memory_order_relaxed) != 0u
            || renderer2dDisabledSubBgPriorityMask.load(std::memory_order_relaxed) != 0u
            || renderer2dDisabledMainObjPriorityMask.load(std::memory_order_relaxed) != 0u
            || renderer2dDisabledSubObjPriorityMask.load(std::memory_order_relaxed) != 0u
            || renderer2dDisabledMainObjOrderMask.load(std::memory_order_relaxed) != 0u
            || renderer2dDisabledSubObjOrderMask.load(std::memory_order_relaxed) != 0u
            || (renderer2dFeatureMask.load(std::memory_order_relaxed) & kRenderer2DDebugAllFeatures) != kRenderer2DDebugAllFeatures;
    }

    bool isRenderer3DDebugFeatureEnabled(u32 featureFlag)
    {
        if (!RendererDebugControlsEnabled())
            return true;

        return (renderer3dFeatureMask.load(std::memory_order_relaxed) & featureFlag) != 0u;
    }

    bool areRenderer3DDebugControlsActive()
    {
        if (!RendererDebugControlsEnabled())
            return false;

        return (renderer3dFeatureMask.load(std::memory_order_relaxed) & kRenderer3DDebugAllFeatures) != kRenderer3DDebugAllFeatures;
    }

    u32 getVulkanDiagnosticFlags()
    {
        return vulkanDiagnosticFlags.load(std::memory_order_relaxed);
    }

    bool hasVulkanDiagnosticFlag(VulkanDiagnosticFlag flag)
    {
        return (getVulkanDiagnosticFlags() & static_cast<u32>(flag)) != 0u;
    }

    std::vector<u32> captureCurrentFrameForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentFrameForDebug();
    }

    std::vector<u32> captureCurrentPackedTopPrimaryForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentPackedTopPrimaryForDebug();
    }

    std::vector<u32> captureCurrentPackedBottomPrimaryForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentPackedBottomPrimaryForDebug();
    }

    std::vector<u32> captureCurrentPackedPlaneForDebug(int screenIndex, int planeIndex)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentPackedPlaneForDebug(screenIndex, planeIndex);
    }

    std::vector<u32> captureCurrentCapture3dSourceForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentCapture3dSourceForDebug();
    }

    std::vector<u32> captureCurrentCaptureLineUses3dMaskForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentCaptureLineUses3dMaskForDebug();
    }

    std::vector<u32> captureCurrentComp4TopPlaceholderForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentComp4TopPlaceholderForDebug();
    }

    std::vector<u32> captureCurrentComp4BottomPlaceholderForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentComp4BottomPlaceholderForDebug();
    }

    std::vector<u32> captureCurrentCaptureFallbackMaskForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentCaptureFallbackMaskForDebug();
    }

    std::string captureCurrentSoftPackedFrameMetaJsonForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentSoftPackedFrameMetaJsonForDebug();
    }

    std::vector<u32> captureCurrentCompositedDimensionsForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentCompositedDimensionsForDebug();
    }

    std::vector<u32> captureCurrentCompositedFrameForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrentCompositedFrameForDebug();
    }

    std::vector<u32> captureCurrent3dDimensionsForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrent3dDimensionsForDebug();
    }

    std::vector<u32> captureCurrent3dFrameForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrent3dFrameForDebug();
    }

    std::vector<u32> captureCurrent3dCaptureFrameForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrent3dCaptureFrameForDebug();
    }

    std::vector<u32> captureCurrent3dDepthForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrent3dDepthForDebug();
    }

    std::vector<u32> captureCurrent3dAttrForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrent3dAttrForDebug();
    }

    std::vector<u32> captureCurrent3dCoverageForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->captureCurrent3dCoverageForDebug();
    }

    bool isCurrentFrameReadyForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return false;

        return currentInstance->isCurrentFrameReadyForDebug();
    }

    int getCurrentFrameIndexForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return -1;

        return currentInstance->getCurrentFrameIndexForDebug();
    }

    void requestPreparedRendererDebugSnapshot()
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->requestPreparedRendererDebugSnapshotForDebug();
    }

    void clearPreparedRendererDebugSnapshot()
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->clearPreparedRendererDebugSnapshotForDebug();
    }

    void startDenseScreenBurstCaptureForDebug(int frameCount, int stepFrames, int warmupFrames, u32 captureKindsMask)
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->startDenseScreenBurstCaptureForDebug(frameCount, stepFrames, warmupFrames, captureKindsMask);
    }

    bool isDenseScreenBurstCaptureCompleteForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return false;

        return currentInstance->isDenseScreenBurstCaptureCompleteForDebug();
    }

    std::vector<u32> getDenseScreenBurstScheduleStatsForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->getDenseScreenBurstScheduleStatsForDebug();
    }

    int getDenseScreenBurstCaptureFrameCountForDebug()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return 0;

        return currentInstance->getDenseScreenBurstCaptureFrameCountForDebug();
    }

    int getDenseScreenBurstCaptureFrameIdForDebug(int index)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return -1;

        return currentInstance->getDenseScreenBurstCaptureFrameIdForDebug(index);
    }

    std::vector<u32> getDenseScreenBurstCaptureFrameForDebug(int index)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->getDenseScreenBurstCaptureFrameForDebug(index);
    }

    std::vector<u32> getDenseScreenBurstPackedTopFrameForDebug(int index)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->getDenseScreenBurstPackedTopFrameForDebug(index);
    }

    std::vector<u32> getDenseScreenBurstPackedBottomFrameForDebug(int index)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->getDenseScreenBurstPackedBottomFrameForDebug(index);
    }

    std::vector<u32> getDenseScreenBurstPackedPlaneFrameForDebug(int index, int screenIndex, int planeIndex)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->getDenseScreenBurstPackedPlaneFrameForDebug(index, screenIndex, planeIndex);
    }

    std::vector<u32> getDenseScreenBurstCapture3dSourceFrameForDebug(int index)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->getDenseScreenBurstCapture3dSourceFrameForDebug(index);
    }

    std::vector<u32> getDenseScreenBurstCaptureLineUses3dMaskFrameForDebug(int index)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->getDenseScreenBurstCaptureLineUses3dMaskFrameForDebug(index);
    }

    std::string getDenseScreenBurstSoftPackedFrameMetaJsonForDebug(int index)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->getDenseScreenBurstSoftPackedFrameMetaJsonForDebug(index);
    }

    std::vector<u32> getDenseScreenBurstRenderer3dFrameForDebug(int index)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->getDenseScreenBurstRenderer3dFrameForDebug(index);
    }

    std::vector<u32> getDenseScreenBurstRenderer3dCaptureFrameForDebug(int index)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return {};

        return currentInstance->getDenseScreenBurstRenderer3dCaptureFrameForDebug(index);
    }

    void clearDenseScreenBurstCaptureForDebug()
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->clearDenseScreenBurstCaptureForDebug();
    }

    void dumpCurrentRendererDebugSnapshot()
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->dumpDebugSnapshot();
    }

    void setFastForwardActive(bool enabled)
    {
        fastForwardActive.store(enabled, std::memory_order_relaxed);
    }

    bool isFastForwardActive()
    {
        return fastForwardActive.load(std::memory_order_relaxed);
    }

    void setMuteOnFastForwardActive(bool enabled)
    {
        muteOnFastForwardActive.store(enabled, std::memory_order_relaxed);
    }

    bool isMuteOnFastForwardActive()
    {
        return muteOnFastForwardActive.load(std::memory_order_relaxed);
    }

    void setRewindActive(bool enabled)
    {
        rewindActive.store(enabled, std::memory_order_relaxed);
    }

    bool isRewindActive()
    {
        return rewindActive.load(std::memory_order_relaxed);
    }

    void pause()
    {
        pauseAudio();
    }

    void resume()
    {
        startAudio();
    }

    void reset()
    {
        if (auto currentInstance = GetInstanceSnapshot())
            currentInstance->reset();
    }

    namespace
    {
        struct SaveStateWriteTask
        {
            std::string targetPath;
            std::vector<u8> buffer;
        };

        std::mutex saveStateWriteMutex;
        std::condition_variable saveStateWriteCv;
        std::condition_variable saveStateWriteIdleCv;
        std::deque<SaveStateWriteTask> saveStateWriteQueue;
        bool saveStateWriteInProgress = false;
        bool saveStateWorkerRunning = false;
        bool saveStateWorkerStop = false;
        std::thread saveStateWorkerThread;

        void saveStateWorkerLoop()
        {
            while (true)
            {
                SaveStateWriteTask task;
                {
                    std::unique_lock<std::mutex> lock(saveStateWriteMutex);
                    saveStateWriteCv.wait(lock, []() {
                        return saveStateWorkerStop || !saveStateWriteQueue.empty();
                    });
                    if (saveStateWriteQueue.empty())
                    {
                        if (saveStateWorkerStop)
                        {
                            saveStateWorkerRunning = false;
                            saveStateWriteIdleCv.notify_all();
                            return;
                        }
                        continue;
                    }
                    task = std::move(saveStateWriteQueue.front());
                    saveStateWriteQueue.pop_front();
                    saveStateWriteInProgress = true;
                }

                Platform::FileHandle* saveStateFile = Platform::OpenFile(task.targetPath.c_str(), Platform::FileMode::Write);
                if (saveStateFile)
                {
                    Platform::FileWrite(task.buffer.data(), task.buffer.size(), 1, saveStateFile);
                    Platform::FileFlush(saveStateFile);
                    Platform::CloseFile(saveStateFile);
                }

                {
                    std::lock_guard<std::mutex> lock(saveStateWriteMutex);
                    saveStateWriteInProgress = false;
                    if (saveStateWriteQueue.empty())
                        saveStateWriteIdleCv.notify_all();
                }
            }
        }
    }

    void flushPendingSaveStateWrites()
    {
        std::thread threadToJoin;
        {
            std::unique_lock<std::mutex> lock(saveStateWriteMutex);
            saveStateWriteIdleCv.wait(lock, []() {
                return saveStateWriteQueue.empty() && !saveStateWriteInProgress;
            });
            if (saveStateWorkerRunning)
            {
                saveStateWorkerStop = true;
                saveStateWriteCv.notify_all();
            }
            if (saveStateWorkerThread.joinable())
                threadToJoin = std::move(saveStateWorkerThread);
        }
        if (threadToJoin.joinable())
            threadToJoin.join();
    }

    bool saveState(const char* path)
    {
        if (path == nullptr)
            return false;

        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
        {
            Platform::Log(Platform::LogLevel::Warn, "Savestate save denied: emulator instance unavailable\n");
            return false;
        }

        Savestate state;
        if (state.Error)
        {
            return false;
        }

        const bool saved = currentInstance->saveState(&state, true);
        if (!saved || state.Error)
        {
            Platform::Log(Platform::Error, "Failed to serialize savestate to %s\n", path);
            return false;
        }

        const u8* stateBytes = static_cast<const u8*>(state.Buffer());
        std::vector<u8> bufferCopy(stateBytes, stateBytes + state.Length());
        std::string targetPath(path);

        {
            std::lock_guard<std::mutex> lock(saveStateWriteMutex);
            if (!saveStateWorkerRunning)
            {
                if (saveStateWorkerThread.joinable())
                    saveStateWorkerThread.join();
                saveStateWorkerStop = false;
                saveStateWorkerRunning = true;
                saveStateWorkerThread = std::thread(saveStateWorkerLoop);
            }
            saveStateWriteQueue.push_back(SaveStateWriteTask{std::move(targetPath), std::move(bufferCopy)});
        }
        saveStateWriteCv.notify_one();

        return true;
    }

    bool loadState(const char* path)
    {
        if (path == nullptr)
            return false;

        flushPendingSaveStateWrites();

        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
        {
            Platform::Log(Platform::LogLevel::Warn, "Savestate load denied: emulator instance unavailable\n");
            return false;
        }

        if (!currentInstance->areSaveStatesAllowed())
        {
            Platform::Log(Platform::LogLevel::Warn, "Savestate load denied: RetroAchievements hardcore session active\n");
            return false;
        }

        auto saveStateFile = Platform::OpenFile(path, Platform::FileMode::Read);
        if (!saveStateFile)
        {
            Platform::Log(Platform::LogLevel::Error, "Failed to open state file \"%s\"\n", path);
            return false;
        }

        std::unique_ptr<Savestate> backup = std::make_unique<Savestate>(Savestate::DEFAULT_SIZE);
        if (backup->Error)
        {
            Platform::Log(Platform::LogLevel::Error, "Failed to allocate memory for state backup\n");
            Platform::CloseFile(saveStateFile);
            return false;
        }

        if (!currentInstance->saveState(backup.get(), false) || backup->Error)
        {
            Platform::Log(Platform::LogLevel::Error, "Failed to back up state, aborting load (from \"%s\")\n", path);
            Platform::CloseFile(saveStateFile);
            return false;
        }

        size_t size = Platform::FileLength(saveStateFile);
        if (size == 0)
        {
            Platform::Log(Platform::LogLevel::Error, "State file \"%s\" is empty\n", path);
            Platform::CloseFile(saveStateFile);
            return false;
        }

        // Allocate exactly as much memory as we need for the savestate
        std::vector<u8> buffer(size);
        if (Platform::FileRead(buffer.data(), size, 1, saveStateFile) == 0)
        {
            Platform::Log(Platform::LogLevel::Error, "Failed to read %u-byte state file \"%s\"\n", size, path);
            Platform::CloseFile(saveStateFile);
            return false;
        }
        Platform::CloseFile(saveStateFile);

        std::unique_ptr<Savestate> state = std::make_unique<Savestate>(buffer.data(), size, false);

        if (!currentInstance->loadState(state.get()) || state->Error)
        {
            Platform::Log(Platform::LogLevel::Error, "Failed to load state file \"%s\" into emulator\n", path);
            // Restore backup
            if (!currentInstance->loadState(backup.get()) || backup->Error)
                Platform::Log(Platform::LogLevel::Error, "Failed to load backup state\n");
            else
                Platform::Log(Platform::LogLevel::Info, "Backup state loaded\n");

            return false;
        }
        requestVulkanPresentationResync();
        return true;
    }

    bool loadRewindState(melonDS::RewindSaveState rewindSaveState)
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
        {
            Platform::Log(Platform::LogLevel::Warn, "Rewind load denied: emulator instance unavailable\n");
            return false;
        }

        if (!currentInstance->areSaveStatesAllowed())
        {
            Platform::Log(Platform::LogLevel::Warn, "Rewind load denied: RetroAchievements hardcore session active\n");
            return false;
        }

        std::unique_ptr<Savestate> backup = std::make_unique<Savestate>(Savestate::DEFAULT_SIZE);
        if (backup->Error)
        {
            Platform::Log(Platform::LogLevel::Error, "Failed to allocate memory for state backup");
            return false;
        }

        if (!currentInstance->saveState(backup.get(), false) || backup->Error)
        {
            Platform::Log(Platform::LogLevel::Error, "Failed to back up state, aborting rewind state load");
            return false;
        }

        bool result = currentInstance->loadRewindState(rewindSaveState);
        if (!result)
        {
            Platform::Log(Platform::LogLevel::Error, "Failed to load rewind state");
            // Restore backup
            if (!currentInstance->loadState(backup.get()) || backup->Error)
                Platform::Log(Platform::LogLevel::Error, "Failed to load backup state");
            else
                Platform::Log(Platform::LogLevel::Info, "Backup state loaded");
        }

        return result;
    }

    RewindWindow getRewindWindow()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return RewindWindow{};

        return currentInstance->getRewindWindow();
    }

    bool takeScreenshot()
    {
        if (auto currentInstance = GetInstanceSnapshot())
            return currentInstance->takeScreenshot();

        return false;
    }

    void stop()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (!currentInstance)
            return;

        currentInstance->stop();
        cleanupOpenGlContext();
    }

    std::string getDetailedEmulationDiagnostic()
    {
        auto currentInstance = GetInstanceSnapshot();
        if (currentInstance) {
            return currentInstance->getDetailedEmulationDiagnostic();
        }
        return "Emulation instance is not running";
    }

    void cleanup()
    {
        flushPendingSaveStateWrites();
        cleanupAudio();

        ReplaceInstance(nullptr);
        cameraHandler = nullptr;
        eventMessenger = nullptr;
        RetroAchievements::RetroAchievementsManager::EventMessenger.reset();
    }

    bool setupOpenGlContext()
    {
        if (!ensureOpenGlContext())
            return false;

        if (!openGlContext->Use())
        {
            Platform::Log(Platform::LogLevel::Error, "Failed to use OpenGL context");
            return false;
        }

        return true;
    }

    void cleanupOpenGlContext()
    {
        if (openGlContext == nullptr)
            return;

        openGlContext->Release();
    }
}
