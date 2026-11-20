#include <vector>
#include <cstring>
#include <cerrno>
#include <cstdint>
#include <atomic>
#include <mutex>
#include <string>
#include <vulkan/vulkan.h>
#include <vulkan/vulkan_android.h>
#include <signal.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/stat.h>
#include <android/log.h>
#include "JniEnvHandler.h"
#include "UriFileHandler.h"
#include "MelonDS.h"
#include "GPU3D_Vulkan.h"
#include "renderer/VulkanSurfacePresenter.h"
#include "OpenGLContext.h"
#include "Platform.h"
#include "renderer/FrameQueue.h"
#include "renderer/VulkanOutput.h"
#include "VulkanContext.h"
#include "VulkanDispatch.h"
#include "retroachievements/RetroAchievementsManager.h"

static struct sigaction old_sa_segv;
static struct sigaction old_sa_bus;
static struct sigaction old_sa_fpe;
static struct sigaction old_sa_ill;
static std::once_flag sCrashTrapOnceFlag;
static std::atomic_flag sCrashHandlerActive = ATOMIC_FLAG_INIT;

static void crashAppendCstr(char* buf, size_t cap, size_t& pos, const char* s)
{
    if (!s)
        return;
    while (*s && pos < cap)
    {
        buf[pos++] = *s++;
    }
}

static void crashAppendSignedDec(char* buf, size_t cap, size_t& pos, long val)
{
    if (val < 0)
    {
        if (pos < cap)
            buf[pos++] = '-';
        unsigned long uval = static_cast<unsigned long>(-(val + 1)) + 1UL;
        char tmp[32];
        size_t n = 0;
        do {
            tmp[n++] = static_cast<char>('0' + (uval % 10UL));
            uval /= 10UL;
        } while (uval > 0 && n < sizeof(tmp));
        while (n > 0 && pos < cap)
            buf[pos++] = tmp[--n];
        return;
    }
    unsigned long uval = static_cast<unsigned long>(val);
    char tmp[32];
    size_t n = 0;
    do {
        tmp[n++] = static_cast<char>('0' + (uval % 10UL));
        uval /= 10UL;
    } while (uval > 0 && n < sizeof(tmp));
    while (n > 0 && pos < cap)
        buf[pos++] = tmp[--n];
}

static void crashAppendHex(char* buf, size_t cap, size_t& pos, uintptr_t val)
{
    static const char kHex[] = "0123456789abcdef";
    crashAppendCstr(buf, cap, pos, "0x");
    char tmp[sizeof(uintptr_t) * 2];
    size_t n = 0;
    do {
        tmp[n++] = kHex[val & 0xFU];
        val >>= 4U;
    } while (val > 0 && n < sizeof(tmp));
    while (n > 0 && pos < cap)
        buf[pos++] = tmp[--n];
}

static void crashWriteAll(int fd, const char* data, size_t len)
{
    size_t offset = 0;
    while (offset < len)
    {
        ssize_t written = write(fd, data + offset, len - offset);
        if (written > 0)
        {
            offset += static_cast<size_t>(written);
            continue;
        }
        if (written < 0 && errno == EINTR)
            continue;
        break;
    }
}

static void resetSignalDefaultAndRaise(int sig)
{
    struct sigaction dfl{};
    sigemptyset(&dfl.sa_mask);
    dfl.sa_handler = SIG_DFL;
    sigaction(sig, &dfl, nullptr);
    raise(sig);
}

static void stormNativeCrashHandler(int sig, siginfo_t* info, void* context)
{
    if (sCrashHandlerActive.test_and_set(std::memory_order_acq_rel))
    {
        resetSignalDefaultAndRaise(sig);
        _exit(128 + sig);
    }

    const int savedErrno = errno;
    int fd = open("/storage/emulated/0/STORM DS/logs/STORM_INFO.txt", O_WRONLY | O_CREAT | O_APPEND, 0644);
    if (fd < 0)
        fd = open("/sdcard/STORM DS/logs/STORM_INFO.txt", O_WRONLY | O_CREAT | O_APPEND, 0644);
    if (fd >= 0)
    {
        char buf[192];
        size_t pos = 0;
        crashAppendCstr(buf, sizeof(buf), pos, "\n=== STORM DS NATIVE CRASH ===\nsig=");
        crashAppendSignedDec(buf, sizeof(buf), pos, static_cast<long>(sig));
        crashAppendCstr(buf, sizeof(buf), pos, " tid=");
        crashAppendSignedDec(buf, sizeof(buf), pos, static_cast<long>(gettid()));
        crashAppendCstr(buf, sizeof(buf), pos, " addr=");
        crashAppendHex(buf, sizeof(buf), pos, reinterpret_cast<uintptr_t>(info ? info->si_addr : nullptr));
        crashAppendCstr(buf, sizeof(buf), pos, "\n");
        crashWriteAll(fd, buf, pos);
        close(fd);
    }
    errno = savedErrno;

    const struct sigaction* old_sa = nullptr;
    switch (sig)
    {
        case SIGSEGV: old_sa = &old_sa_segv; break;
        case SIGBUS:  old_sa = &old_sa_bus;  break;
        case SIGFPE:  old_sa = &old_sa_fpe;  break;
        case SIGILL:  old_sa = &old_sa_ill;  break;
        default: break;
    }

    if (old_sa != nullptr && (old_sa->sa_flags & SA_SIGINFO) != 0 && old_sa->sa_sigaction != nullptr)
    {
        old_sa->sa_sigaction(sig, info, context);
        sCrashHandlerActive.clear(std::memory_order_release);
        return;
    }
    if (old_sa != nullptr && (old_sa->sa_flags & SA_SIGINFO) == 0 &&
        old_sa->sa_handler != SIG_DFL && old_sa->sa_handler != SIG_IGN && old_sa->sa_handler != nullptr)
    {
        old_sa->sa_handler(sig);
        sCrashHandlerActive.clear(std::memory_order_release);
        return;
    }
    if (old_sa != nullptr && (old_sa->sa_flags & SA_SIGINFO) == 0 && old_sa->sa_handler == SIG_IGN)
    {
        sCrashHandlerActive.clear(std::memory_order_release);
        return;
    }

    sCrashHandlerActive.clear(std::memory_order_release);
    resetSignalDefaultAndRaise(sig);
}

static void installStormNativeCrashTrap()
{
    std::call_once(sCrashTrapOnceFlag, []() {
        struct sigaction sa{};
        sigemptyset(&sa.sa_mask);
        sa.sa_flags = SA_SIGINFO | SA_ONSTACK;
        sa.sa_sigaction = stormNativeCrashHandler;
        sigaction(SIGSEGV, &sa, &old_sa_segv);
        sigaction(SIGBUS, &sa, &old_sa_bus);
        sigaction(SIGFPE, &sa, &old_sa_fpe);
        sigaction(SIGILL, &sa, &old_sa_ill);
    });
}

JniEnvHandler* jniEnvHandler;

JavaVM* vm;
jobject androidUriFileHandler;
UriFileHandler* fileHandler;

namespace
{
constexpr jint kRendererCapOpenGl = 1 << 0;
constexpr jint kRendererCapVulkan = 1 << 1;

constexpr const char* kRequiredInstanceExtensions[] = {
    VK_KHR_SURFACE_EXTENSION_NAME,
    "VK_KHR_android_surface",
};

constexpr const char* kRequiredDeviceExtensions[] = {
    VK_KHR_SWAPCHAIN_EXTENSION_NAME,
};

constexpr const char* kTimelineSemaphoreExtension = VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME;
constexpr const char* kDescriptorIndexingExtension = VK_EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME;
constexpr const char* kOptionalExternalMemoryExtension = VK_KHR_EXTERNAL_MEMORY_EXTENSION_NAME;
constexpr const char* kOptionalAndroidHardwareBufferExtension = VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME;
std::atomic<bool> gForceDisableTimelineSemaphores{false};
std::atomic<bool> gForceDisableDynamicTextureIndexing{false};
std::atomic<int> gCachedVulkanSupported{-1};
std::atomic<int> gCachedCanInitFastPath{-1};
std::atomic<int> gCachedCanInitCompatibility{-1};

void invalidateVulkanValidationCache()
{
    gCachedVulkanSupported.store(-1, std::memory_order_relaxed);
    gCachedCanInitFastPath.store(-1, std::memory_order_relaxed);
    gCachedCanInitCompatibility.store(-1, std::memory_order_relaxed);
}

std::string jStringToString(JNIEnv* env, jstring value)
{
    if (value == nullptr)
        return {};

    const char* chars = env->GetStringUTFChars(value, nullptr);
    if (chars == nullptr)
        return {};

    std::string result(chars);
    env->ReleaseStringUTFChars(value, chars);
    return result;
}

void configureVulkanDriver(
    JNIEnv* env,
    jboolean useCustomVulkanDriver,
    jstring vulkanTmpLibDir,
    jstring vulkanHookLibDir,
    jstring customVulkanDriverDir,
    jstring customVulkanDriverName,
    jstring customVulkanDriverDisplayName)
{
    melonDS::VulkanDispatch::DriverConfiguration vulkanDriverConfiguration{};
    vulkanDriverConfiguration.UseCustomDriver = useCustomVulkanDriver == JNI_TRUE;
    vulkanDriverConfiguration.TmpLibDir = jStringToString(env, vulkanTmpLibDir);
    vulkanDriverConfiguration.HookLibDir = jStringToString(env, vulkanHookLibDir);
    vulkanDriverConfiguration.CustomDriverDir = jStringToString(env, customVulkanDriverDir);
    vulkanDriverConfiguration.CustomDriverName = jStringToString(env, customVulkanDriverName);
    vulkanDriverConfiguration.DisplayName = jStringToString(env, customVulkanDriverDisplayName);

    static std::mutex sDriverConfigMutex;
    static melonDS::VulkanDispatch::DriverConfiguration sLastDriverConfiguration{};
    static bool sHasDriverConfiguration = false;
    {
        std::lock_guard<std::mutex> lock(sDriverConfigMutex);
        if (sHasDriverConfiguration &&
            sLastDriverConfiguration.UseCustomDriver == vulkanDriverConfiguration.UseCustomDriver &&
            sLastDriverConfiguration.TmpLibDir == vulkanDriverConfiguration.TmpLibDir &&
            sLastDriverConfiguration.HookLibDir == vulkanDriverConfiguration.HookLibDir &&
            sLastDriverConfiguration.CustomDriverDir == vulkanDriverConfiguration.CustomDriverDir &&
            sLastDriverConfiguration.CustomDriverName == vulkanDriverConfiguration.CustomDriverName &&
            sLastDriverConfiguration.DisplayName == vulkanDriverConfiguration.DisplayName)
        {
            if (gCachedVulkanSupported.load(std::memory_order_relaxed) <= 0)
            {
                invalidateVulkanValidationCache();
            }
            return;
        }
        sLastDriverConfiguration = vulkanDriverConfiguration;
        sHasDriverConfiguration = true;
    }

    MelonDSAndroid::VulkanSurfacePresenter::clearPrewarmedRetroArchFilters();
    invalidateVulkanValidationCache();

    melonDS::VulkanDispatch::ConfigureDriver(vulkanDriverConfiguration);
}

bool hasExtension(const char* extensionName, const std::vector<VkExtensionProperties>& extensions)
{
    for (const VkExtensionProperties& extension : extensions)
    {
        if (std::strcmp(extension.extensionName, extensionName) == 0)
            return true;
    }

    return false;
}

bool isApiAtLeast(uint32_t apiVersion, uint32_t major, uint32_t minor)
{
    const uint32_t versionMajor = VK_API_VERSION_MAJOR(apiVersion);
    const uint32_t versionMinor = VK_API_VERSION_MINOR(apiVersion);
    return (versionMajor > major) || (versionMajor == major && versionMinor >= minor);
}

bool hasRequiredInstanceExtensions()
{
    uint32_t extensionCount = 0;
    if (vkEnumerateInstanceExtensionProperties(nullptr, &extensionCount, nullptr) != VK_SUCCESS)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Error,
            "MelonDSAndroidInterface: failed to enumerate Vulkan instance extensions"
        );
        return false;
    }

    std::vector<VkExtensionProperties> extensions(extensionCount);
    if (vkEnumerateInstanceExtensionProperties(nullptr, &extensionCount, extensions.data()) != VK_SUCCESS)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Error,
            "MelonDSAndroidInterface: failed to read Vulkan instance extensions"
        );
        return false;
    }

    for (const char* requiredExtension : kRequiredInstanceExtensions)
    {
        if (!hasExtension(requiredExtension, extensions))
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "MelonDSAndroidInterface: missing required Vulkan instance extension %s",
                requiredExtension
            );
            return false;
        }
    }

    return true;
}

bool hasRequiredDeviceExtensions(VkInstance instance, VkPhysicalDevice physicalDevice)
{
    VkPhysicalDeviceProperties properties{};
    vkGetPhysicalDeviceProperties(physicalDevice, &properties);

    uint32_t extensionCount = 0;
    if (vkEnumerateDeviceExtensionProperties(physicalDevice, nullptr, &extensionCount, nullptr) != VK_SUCCESS)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: failed to enumerate device extensions for '%s'",
            properties.deviceName
        );
        return false;
    }

    std::vector<VkExtensionProperties> extensions(extensionCount);
    if (vkEnumerateDeviceExtensionProperties(physicalDevice, nullptr, &extensionCount, extensions.data()) != VK_SUCCESS)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: failed to read device extensions for '%s'",
            properties.deviceName
        );
        return false;
    }

    const bool apiAtLeast12 = isApiAtLeast(properties.apiVersion, 1, 2);

    for (const char* requiredExtension : kRequiredDeviceExtensions)
    {
        if (!hasExtension(requiredExtension, extensions))
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "MelonDSAndroidInterface: device '%s' missing extension %s",
                properties.deviceName,
                requiredExtension
            );
            return false;
        }
    }

    const bool forceDisableTimelineSemaphores = gForceDisableTimelineSemaphores.load(std::memory_order_relaxed);
    const bool forceDisableDynamicTextureIndexing = gForceDisableDynamicTextureIndexing.load(std::memory_order_relaxed);

    const bool timelineExtensionAvailable = apiAtLeast12 || hasExtension(kTimelineSemaphoreExtension, extensions);
    const bool descriptorIndexingExtensionAvailable = apiAtLeast12 || hasExtension(kDescriptorIndexingExtension, extensions);
    if (!timelineExtensionAvailable && !forceDisableTimelineSemaphores)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: device '%s' missing extension %s; timeline fallback will use fences",
            properties.deviceName,
            kTimelineSemaphoreExtension
        );
    }

    const bool hasExternalMemoryExtension = hasExtension(kOptionalExternalMemoryExtension, extensions);
    const bool hasAndroidHardwareBufferExtension = hasExtension(kOptionalAndroidHardwareBufferExtension, extensions);
    if (hasAndroidHardwareBufferExtension && !hasExternalMemoryExtension)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: device '%s' reports %s without %s; AndroidHardwareBuffer interop disabled for preflight",
            properties.deviceName,
            kOptionalAndroidHardwareBufferExtension,
            kOptionalExternalMemoryExtension
        );
    }
    else if (!hasAndroidHardwareBufferExtension)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: device '%s' missing optional extension %s; continuing with generic Vulkan path",
            properties.deviceName,
            kOptionalAndroidHardwareBufferExtension
        );
    }

    VkPhysicalDeviceTimelineSemaphoreFeatures timelineFeatures{};
    timelineFeatures.sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES;

    VkPhysicalDeviceDescriptorIndexingFeatures descriptorFeatures{};
    descriptorFeatures.sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES;

    VkPhysicalDeviceFeatures2 features2{};
    features2.sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2;
    void** nextFeatureChain = &features2.pNext;
    if (descriptorIndexingExtensionAvailable)
    {
        *nextFeatureChain = &descriptorFeatures;
        nextFeatureChain = &descriptorFeatures.pNext;
    }
    if (timelineExtensionAvailable)
    {
        *nextFeatureChain = &timelineFeatures;
        nextFeatureChain = &timelineFeatures.pNext;
    }

    PFN_vkGetPhysicalDeviceFeatures2 getPhysicalDeviceFeatures2 = nullptr;
    if (isApiAtLeast(properties.apiVersion, 1, 1))
    {
        getPhysicalDeviceFeatures2 = reinterpret_cast<PFN_vkGetPhysicalDeviceFeatures2>(
            vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceFeatures2"));
    }
    if (getPhysicalDeviceFeatures2 == nullptr)
    {
        getPhysicalDeviceFeatures2 = reinterpret_cast<PFN_vkGetPhysicalDeviceFeatures2>(
            vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceFeatures2KHR"));
    }

    if (getPhysicalDeviceFeatures2 != nullptr)
    {
        getPhysicalDeviceFeatures2(physicalDevice, &features2);
    }
    else
    {
        vkGetPhysicalDeviceFeatures(physicalDevice, &features2.features);
    }

    if (timelineFeatures.timelineSemaphore != VK_TRUE)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: device '%s' missing feature timelineSemaphore; timeline fallback will use fences",
            properties.deviceName
        );
    }

    const bool dynamicTextureIndexingAvailable =
        !forceDisableDynamicTextureIndexing
        && features2.features.shaderSampledImageArrayDynamicIndexing == VK_TRUE;
    if (!dynamicTextureIndexingAvailable)
    {
        if (forceDisableDynamicTextureIndexing) {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "MelonDSAndroidInterface: forcing dynamic-indexing fallback on '%s'",
                properties.deviceName
            );
        } else {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "MelonDSAndroidInterface: device '%s' missing feature shaderSampledImageArrayDynamicIndexing; single-descriptor texture fallback will be used",
                properties.deviceName
            );
        }
    }

    if (dynamicTextureIndexingAvailable
        && descriptorFeatures.shaderSampledImageArrayNonUniformIndexing != VK_TRUE)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: device '%s' missing feature shaderSampledImageArrayNonUniformIndexing; compatibility texture path will be used",
            properties.deviceName
        );
    }
    else if (dynamicTextureIndexingAvailable
        && !descriptorIndexingExtensionAvailable)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: device '%s' missing extension %s; compatibility texture path will be used",
            properties.deviceName,
            kDescriptorIndexingExtension
        );
    }

    return true;
}

bool createVulkanInstance(VkInstance* instance)
{
    auto tryCreateInstance = [&]() -> bool {
        if (!melonDS::VulkanDispatch::Initialize())
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "MelonDSAndroidInterface: Vulkan support check failed (driver dispatch unavailable)"
            );
            return false;
        }

        if (!hasRequiredInstanceExtensions())
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "MelonDSAndroidInterface: required instance extension missing in enumeration; attempting direct vkCreateInstance"
            );
        }

        uint32_t loaderApiVersion = VK_API_VERSION_1_0;
        auto enumInstanceVer = reinterpret_cast<PFN_vkEnumerateInstanceVersion>(vkGetInstanceProcAddr(VK_NULL_HANDLE, "vkEnumerateInstanceVersion"));
        if (enumInstanceVer != nullptr)
        {
            if (enumInstanceVer(&loaderApiVersion) != VK_SUCCESS)
            {
                loaderApiVersion = VK_API_VERSION_1_0;
            }
        }

        VkApplicationInfo appInfo{};
        appInfo.sType = VK_STRUCTURE_TYPE_APPLICATION_INFO;
        appInfo.pApplicationName = "STORM_DS-android";
        appInfo.applicationVersion = VK_MAKE_VERSION(1, 0, 0);
        appInfo.pEngineName = "STORM_DS";
        appInfo.engineVersion = VK_MAKE_VERSION(1, 0, 0);
        appInfo.apiVersion = isApiAtLeast(loaderApiVersion, 1, 1) ? VK_API_VERSION_1_1 : VK_API_VERSION_1_0;

        VkInstanceCreateInfo createInfo{};
        createInfo.sType = VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO;
        createInfo.pApplicationInfo = &appInfo;
        createInfo.enabledExtensionCount = sizeof(kRequiredInstanceExtensions) / sizeof(kRequiredInstanceExtensions[0]);
        createInfo.ppEnabledExtensionNames = kRequiredInstanceExtensions;

        VkResult createResult = vkCreateInstance(&createInfo, nullptr, instance);
        if (createResult != VK_SUCCESS)
        {
            appInfo.apiVersion = VK_API_VERSION_1_0;
            createResult = vkCreateInstance(&createInfo, nullptr, instance);
        }
        if (createResult != VK_SUCCESS)
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "MelonDSAndroidInterface: vkCreateInstance failed during support check (%d)",
                static_cast<int>(createResult)
            );
            return false;
        }

        melonDS::VulkanDispatch::LoadInstance(*instance);
        return true;
    };

    if (tryCreateInstance())
        return true;

    if (melonDS::VulkanDispatch::IsUsingCustomDriver() && melonDS::VulkanDispatch::FallbackToSystemDriver())
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: custom Vulkan driver failed instance creation; retrying with system Vulkan driver"
        );
        return tryCreateInstance();
    }

    return false;
}

bool pickGraphicsDevice(VkInstance instance, VkPhysicalDevice* physicalDevice, uint32_t* queueFamilyIndex)
{
    uint32_t physicalDeviceCount = 0;
    const VkResult enumerateResult = vkEnumeratePhysicalDevices(instance, &physicalDeviceCount, nullptr);
    if (enumerateResult != VK_SUCCESS || physicalDeviceCount == 0)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: failed to enumerate physical devices (%d, count=%u)",
            static_cast<int>(enumerateResult),
            physicalDeviceCount
        );
        return false;
    }

    std::vector<VkPhysicalDevice> physicalDevices(physicalDeviceCount);
    vkEnumeratePhysicalDevices(instance, &physicalDeviceCount, physicalDevices.data());

    bool hasGraphicsQueue = false;
    for (const VkPhysicalDevice currentPhysicalDevice : physicalDevices)
    {
        if (!hasRequiredDeviceExtensions(instance, currentPhysicalDevice))
            continue;

        uint32_t queueFamilyCount = 0;
        vkGetPhysicalDeviceQueueFamilyProperties(currentPhysicalDevice, &queueFamilyCount, nullptr);
        if (queueFamilyCount == 0)
            continue;

        std::vector<VkQueueFamilyProperties> queueFamilies(queueFamilyCount);
        vkGetPhysicalDeviceQueueFamilyProperties(currentPhysicalDevice, &queueFamilyCount, queueFamilies.data());
        for (uint32_t i = 0; i < queueFamilyCount; i++)
        {
            const VkQueueFamilyProperties& queueFamily = queueFamilies[i];
            if ((queueFamily.queueFlags & VK_QUEUE_GRAPHICS_BIT) != 0)
            {
                *physicalDevice = currentPhysicalDevice;
                *queueFamilyIndex = i;
                hasGraphicsQueue = true;
                break;
            }
        }

        if (hasGraphicsQueue)
            break;
    }

    if (!hasGraphicsQueue)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: no Vulkan device satisfied required renderer capabilities"
        );
    }

    return hasGraphicsQueue;
}

void setVulkanCompatibilityOverrides(bool disableTimelineSemaphores, bool disableDynamicTextureIndexing);

bool isVulkanRendererSupported()
{
    if (melonDS::VulkanContext::Get().IsReady())
    {
        gCachedVulkanSupported.store(1, std::memory_order_relaxed);
        return true;
    }

    const int cached = gCachedVulkanSupported.load(std::memory_order_relaxed);
    if (cached > 0)
        return true;

    VkInstance instance = VK_NULL_HANDLE;
    bool result = false;
    if (createVulkanInstance(&instance))
    {
        VkPhysicalDevice physicalDevice = VK_NULL_HANDLE;
        uint32_t queueFamilyIndex = 0;
        result = pickGraphicsDevice(instance, &physicalDevice, &queueFamilyIndex);
        vkDestroyInstance(instance, nullptr);
    }

    if (!result && melonDS::VulkanDispatch::IsUsingCustomDriver() && melonDS::VulkanDispatch::FallbackToSystemDriver())
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: custom Vulkan driver failed device selection; retrying with system Vulkan driver"
        );
        instance = VK_NULL_HANDLE;
        if (createVulkanInstance(&instance))
        {
            VkPhysicalDevice physicalDevice = VK_NULL_HANDLE;
            uint32_t queueFamilyIndex = 0;
            result = pickGraphicsDevice(instance, &physicalDevice, &queueFamilyIndex);
            vkDestroyInstance(instance, nullptr);
        }
    }

    if (!result)
    {
        if (melonDS::VulkanContext::Get().Acquire())
        {
            result = true;
            melonDS::VulkanContext::Get().Release();
        }
    }

    if (result)
    {
        gCachedVulkanSupported.store(1, std::memory_order_relaxed);
    }
    return result;
}

bool canInitializeVulkanRenderer(
    melonDS::VulkanPipelineProfile pipelineProfile)
{
    if (melonDS::VulkanContext::Get().IsReady())
        return true;

    std::atomic<int>& profileCache =
        (pipelineProfile == melonDS::VulkanPipelineProfile::FastPath)
        ? gCachedCanInitFastPath
        : gCachedCanInitCompatibility;
    const int cachedProfileResult = profileCache.load(std::memory_order_relaxed);
    if (cachedProfileResult >= 0)
        return cachedProfileResult != 0;

    constexpr u64 kQuickValidationWaitTimeoutNs = 5'000'000'000ull;
    if (!isVulkanRendererSupported())
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Error,
            "canInitializeVulkanRenderer: support check failed before VulkanOutput init"
        );
        profileCache.store(0, std::memory_order_relaxed);
        return false;
    }

    auto tryInitializeWithProfile = [&](melonDS::VulkanPipelineProfile profile) -> bool {
        MelonDSAndroid::VulkanOutput vulkanOutput(profile);
        if (!vulkanOutput.init())
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "canInitializeVulkanRenderer: VulkanOutput::init failed for profile=%s",
                melonDS::VulkanPipelineProfileName(profile)
            );
            return false;
        }

        Frame validationFrame{};
        validationFrame.backend = FrameBackend::VulkanImage;
        constexpr uint32_t validationWidth = 64;
        constexpr uint32_t validationHeight = 64;

        if (!vulkanOutput.ensureFrameResources(&validationFrame, validationWidth, validationHeight))
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "canInitializeVulkanRenderer: ensureFrameResources failed for profile=%s",
                melonDS::VulkanPipelineProfileName(profile)
            );
            return false;
        }

        if (!vulkanOutput.validateFrameSubmission(&validationFrame, kQuickValidationWaitTimeoutNs))
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "canInitializeVulkanRenderer: validateFrameSubmission failed for profile=%s",
                melonDS::VulkanPipelineProfileName(profile)
            );
            return false;
        }

        return true;
    };

    if (tryInitializeWithProfile(pipelineProfile))
    {
        profileCache.store(1, std::memory_order_relaxed);
        return true;
    }

    if (pipelineProfile != melonDS::VulkanPipelineProfile::Compatibility)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "canInitializeVulkanRenderer: FastPath failed; falling back to Compatibility profile"
        );
        if (tryInitializeWithProfile(melonDS::VulkanPipelineProfile::Compatibility))
        {
            profileCache.store(1, std::memory_order_relaxed);
            gCachedCanInitCompatibility.store(1, std::memory_order_relaxed);
            return true;
        }
    }

    const bool initialDisableTimeline = gForceDisableTimelineSemaphores.load(std::memory_order_relaxed);
    const bool initialDisableIndexing = gForceDisableDynamicTextureIndexing.load(std::memory_order_relaxed);
    if (!initialDisableTimeline)
    {
        setVulkanCompatibilityOverrides(true, initialDisableIndexing);
        if (tryInitializeWithProfile(melonDS::VulkanPipelineProfile::Compatibility))
        {
            profileCache.store(1, std::memory_order_relaxed);
            gCachedCanInitCompatibility.store(1, std::memory_order_relaxed);
            return true;
        }
    }
    if (!initialDisableIndexing)
    {
        setVulkanCompatibilityOverrides(true, true);
        if (tryInitializeWithProfile(melonDS::VulkanPipelineProfile::Compatibility))
        {
            profileCache.store(1, std::memory_order_relaxed);
            gCachedCanInitCompatibility.store(1, std::memory_order_relaxed);
            return true;
        }
    }

    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Error,
        "canInitializeVulkanRenderer: all initialization profiles and compatibility fallbacks failed"
    );
    profileCache.store(0, std::memory_order_relaxed);
    return false;
}

void setVulkanCompatibilityOverrides(bool disableTimelineSemaphores, bool disableDynamicTextureIndexing)
{
    const bool prevTimeline = gForceDisableTimelineSemaphores.exchange(disableTimelineSemaphores, std::memory_order_relaxed);
    const bool prevIndexing = gForceDisableDynamicTextureIndexing.exchange(disableDynamicTextureIndexing, std::memory_order_relaxed);
    if (prevTimeline != disableTimelineSemaphores || prevIndexing != disableDynamicTextureIndexing)
    {
        invalidateVulkanValidationCache();
    }
    melonDS::VulkanContext::SetCompatibilityOverrides(disableTimelineSemaphores, disableDynamicTextureIndexing);
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Warn,
        "MelonDSAndroidInterface: Vulkan compatibility overrides updated (timelineOff=%d dynamicIndexingOff=%d)",
        disableTimelineSemaphores ? 1 : 0,
        disableDynamicTextureIndexing ? 1 : 0
    );
}

}

extern "C"
{
JNIEXPORT void JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_setupNative(
    JNIEnv* env,
    jobject thiz,
    jobject uriFileHandler,
    jboolean useCustomVulkanDriver,
    jstring vulkanTmpLibDir,
    jstring vulkanHookLibDir,
    jstring customVulkanDriverDir,
    jstring customVulkanDriverName,
    jstring customVulkanDriverDisplayName)
{
    installStormNativeCrashTrap();
    env->GetJavaVM(&vm);
    MelonDSAndroid::RetroAchievements::RetroAchievementsManager::SetJavaVm(vm);
    jniEnvHandler = new JniEnvHandler(vm);
    androidUriFileHandler = env->NewGlobalRef(uriFileHandler);
    fileHandler = new UriFileHandler(jniEnvHandler, androidUriFileHandler);

    MelonDSAndroid::fileHandler = fileHandler;

    configureVulkanDriver(
        env,
        useCustomVulkanDriver,
        vulkanTmpLibDir,
        vulkanHookLibDir,
        customVulkanDriverDir,
        customVulkanDriverName,
        customVulkanDriverDisplayName
    );
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_configureVulkanDriverNative(
    JNIEnv* env,
    jobject thiz,
    jboolean useCustomVulkanDriver,
    jstring vulkanTmpLibDir,
    jstring vulkanHookLibDir,
    jstring customVulkanDriverDir,
    jstring customVulkanDriverName,
    jstring customVulkanDriverDisplayName)
{
    configureVulkanDriver(
        env,
        useCustomVulkanDriver,
        vulkanTmpLibDir,
        vulkanHookLibDir,
        customVulkanDriverDir,
        customVulkanDriverName,
        customVulkanDriverDisplayName
    );
}

JNIEXPORT jlong JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_getEmulatorGlContext(JNIEnv* env, jobject thiz)
{
    if (!MelonDSAndroid::ensureOpenGlContext() || MelonDSAndroid::openGlContext == nullptr)
        return 0;

    return (jlong) MelonDSAndroid::openGlContext->GetContext();
}

JNIEXPORT jint JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_getRendererCapabilities(JNIEnv* env, jobject thiz)
{
    jint caps = kRendererCapOpenGl;
    if (isVulkanRendererSupported())
        caps |= kRendererCapVulkan;
    return caps;
}

JNIEXPORT jboolean JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_canInitializeVulkanRendererForProfileNative(
    JNIEnv* env,
    jobject thiz,
    jboolean fastPathEnabled)
{
    const melonDS::VulkanPipelineProfile pipelineProfile =
        fastPathEnabled == JNI_TRUE
        ? melonDS::VulkanPipelineProfile::FastPath
        : melonDS::VulkanPipelineProfile::Compatibility;
    return canInitializeVulkanRenderer(pipelineProfile)
        ? JNI_TRUE
        : JNI_FALSE;
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_setVulkanCompatibilityOverridesNative(
    JNIEnv* env,
    jobject thiz,
    jboolean disableTimelineSemaphores,
    jboolean disableDynamicTextureIndexing)
{
    setVulkanCompatibilityOverrides(
        disableTimelineSemaphores == JNI_TRUE,
        disableDynamicTextureIndexing == JNI_TRUE
    );
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_cleanup(JNIEnv* env, jobject thiz)
{
    MelonDSAndroid::RetroAchievements::RetroAchievementsManager::SetJavaVm(nullptr);
    if (androidUriFileHandler != nullptr)
    {
        env->DeleteGlobalRef(androidUriFileHandler);
        androidUriFileHandler = nullptr;
    }
    vm = nullptr;

    if (MelonDSAndroid::openGlContext != nullptr)
    {
        MelonDSAndroid::openGlContext->DeInit();
        delete MelonDSAndroid::openGlContext;
        MelonDSAndroid::openGlContext = nullptr;
    }
    delete fileHandler;
    fileHandler = nullptr;
    MelonDSAndroid::fileHandler = nullptr;
    delete jniEnvHandler;
    jniEnvHandler = nullptr;
}
}
