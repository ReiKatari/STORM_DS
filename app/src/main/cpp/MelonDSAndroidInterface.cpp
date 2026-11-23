#include <vector>
#include <cstring>
#include <atomic>
#include <string>
#include <cerrno>
#include <cstdint>
#include <cstdio>
#include <mutex>
#include <signal.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/stat.h>
#include <android/log.h>
#include <vulkan/vulkan.h>
#include <vulkan/vulkan_android.h>
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

JniEnvHandler* jniEnvHandler;

JavaVM* vm;
static struct sigaction old_sa_segv;
static struct sigaction old_sa_bus;
static struct sigaction old_sa_fpe;
static struct sigaction old_sa_ill;
static std::once_flag sCrashTrapOnceFlag;
static constexpr size_t kMaxConcurrentCrashTids = 16;
static std::atomic<pid_t> sActiveCrashTids[kMaxConcurrentCrashTids]{};

static bool tryEnterCrashHandlerTid(pid_t tid)
{
    for (auto& slot : sActiveCrashTids)
    {
        if (slot.load(std::memory_order_relaxed) == tid)
            return false;
    }
    for (auto& slot : sActiveCrashTids)
    {
        pid_t expected = 0;
        if (slot.compare_exchange_strong(expected, tid, std::memory_order_acq_rel, std::memory_order_relaxed))
            return true;
    }
    return true;
}

static void leaveCrashHandlerTid(pid_t tid)
{
    for (auto& slot : sActiveCrashTids)
    {
        pid_t expected = tid;
        if (slot.compare_exchange_strong(expected, 0, std::memory_order_acq_rel, std::memory_order_relaxed))
            return;
    }
}

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
    const pid_t selfTid = gettid();
    if (!tryEnterCrashHandlerTid(selfTid))
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
        crashAppendSignedDec(buf, sizeof(buf), pos, static_cast<long>(selfTid));
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
        leaveCrashHandlerTid(selfTid);
        return;
    }
    if (old_sa != nullptr && (old_sa->sa_flags & SA_SIGINFO) == 0 &&
        old_sa->sa_handler != SIG_DFL && old_sa->sa_handler != SIG_IGN && old_sa->sa_handler != nullptr)
    {
        old_sa->sa_handler(sig);
        leaveCrashHandlerTid(selfTid);
        return;
    }
    if (old_sa != nullptr && (old_sa->sa_flags & SA_SIGINFO) == 0 && old_sa->sa_handler == SIG_IGN)
    {
        leaveCrashHandlerTid(selfTid);
        return;
    }

    leaveCrashHandlerTid(selfTid);
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
constexpr const char* kOptionalExternalMemoryExtension = VK_KHR_EXTERNAL_MEMORY_EXTENSION_NAME;
constexpr const char* kOptionalAndroidHardwareBufferExtension = VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME;
std::mutex gCachedGpuInfoMutex;
std::string gCachedGpuInfoSummary;
bool gHasCachedGpuInfoSummary = false;
std::atomic<bool> gForceDisableTimelineSemaphores{false};
std::atomic<bool> gForceDisableDynamicTextureIndexing{false};

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

    MelonDSAndroid::VulkanSurfacePresenter::clearPrewarmedRetroArchFilters();

    melonDS::VulkanDispatch::ConfigureDriver(vulkanDriverConfiguration);
    melonDS::VulkanContext::InvalidateCachedDeviceApiVersion();
    {
        std::lock_guard<std::mutex> lock(gCachedGpuInfoMutex);
        gCachedGpuInfoSummary.clear();
        gHasCachedGpuInfoSummary = false;
    }
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
    const auto getPhysicalDeviceProperties = reinterpret_cast<PFN_vkGetPhysicalDeviceProperties>(
        vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceProperties"));
    const auto enumerateDeviceExtensionProperties = reinterpret_cast<PFN_vkEnumerateDeviceExtensionProperties>(
        vkGetInstanceProcAddr(instance, "vkEnumerateDeviceExtensionProperties"));
    const auto getPhysicalDeviceFeatures = reinterpret_cast<PFN_vkGetPhysicalDeviceFeatures>(
        vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceFeatures"));

    VkPhysicalDeviceProperties properties{};
    getPhysicalDeviceProperties(physicalDevice, &properties);

    uint32_t extensionCount = 0;
    if (enumerateDeviceExtensionProperties(physicalDevice, nullptr, &extensionCount, nullptr) != VK_SUCCESS)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: failed to enumerate device extensions for '%s'",
            properties.deviceName
        );
        return false;
    }

    std::vector<VkExtensionProperties> extensions(extensionCount);
    if (enumerateDeviceExtensionProperties(physicalDevice, nullptr, &extensionCount, extensions.data()) != VK_SUCCESS)
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
    if (!timelineExtensionAvailable && !forceDisableTimelineSemaphores)
    {
        static std::atomic_bool loggedMissingTimelineExt{false};
        if (!loggedMissingTimelineExt.exchange(true, std::memory_order_relaxed))
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "MelonDSAndroidInterface: device '%s' missing extension %s; timeline fallback will use fences",
                properties.deviceName,
                kTimelineSemaphoreExtension
            );
        }
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

    VkPhysicalDeviceFeatures2 features2{};
    features2.sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2;
    features2.pNext = &timelineFeatures;
    auto getPhysicalDeviceFeatures2 = reinterpret_cast<PFN_vkGetPhysicalDeviceFeatures2>(
        vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceFeatures2"));
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
        getPhysicalDeviceFeatures(physicalDevice, &features2.features);
    }

    if (timelineFeatures.timelineSemaphore != VK_TRUE)
    {
        static std::atomic_bool loggedMissingTimelineFeat{false};
        if (!loggedMissingTimelineFeat.exchange(true, std::memory_order_relaxed))
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Warn,
                "MelonDSAndroidInterface: device '%s' missing feature timelineSemaphore; timeline fallback will use fences",
                properties.deviceName
            );
        }
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

    return true;
}

bool createVulkanInstance(VkInstance* instance)
{
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
            "MelonDSAndroidInterface: Vulkan support check failed (missing required instance extension)"
        );
        return false;
    }

    VkApplicationInfo appInfo{};
    appInfo.sType = VK_STRUCTURE_TYPE_APPLICATION_INFO;
    appInfo.pApplicationName = "melonDS-android";
    appInfo.applicationVersion = VK_MAKE_VERSION(1, 0, 0);
    appInfo.pEngineName = "melonDS";
    appInfo.engineVersion = VK_MAKE_VERSION(1, 0, 0);
    appInfo.apiVersion = VK_API_VERSION_1_1;

    VkInstanceCreateInfo createInfo{};
    createInfo.sType = VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO;
    createInfo.pApplicationInfo = &appInfo;
    createInfo.enabledExtensionCount = sizeof(kRequiredInstanceExtensions) / sizeof(kRequiredInstanceExtensions[0]);
    createInfo.ppEnabledExtensionNames = kRequiredInstanceExtensions;

    const VkResult createResult = vkCreateInstance(&createInfo, nullptr, instance);
    if (createResult != VK_SUCCESS)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "MelonDSAndroidInterface: vkCreateInstance failed during support check (%d)",
            static_cast<int>(createResult)
        );
        return false;
    }

    return true;
}

bool pickGraphicsDevice(VkInstance instance, VkPhysicalDevice* physicalDevice, uint32_t* queueFamilyIndex)
{
    const auto enumeratePhysicalDevices = reinterpret_cast<PFN_vkEnumeratePhysicalDevices>(
        vkGetInstanceProcAddr(instance, "vkEnumeratePhysicalDevices"));
    const auto getPhysicalDeviceQueueFamilyProperties = reinterpret_cast<PFN_vkGetPhysicalDeviceQueueFamilyProperties>(
        vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceQueueFamilyProperties"));

    uint32_t physicalDeviceCount = 0;
    const VkResult enumerateResult = enumeratePhysicalDevices(instance, &physicalDeviceCount, nullptr);
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
    enumeratePhysicalDevices(instance, &physicalDeviceCount, physicalDevices.data());

    bool hasGraphicsQueue = false;
    for (const VkPhysicalDevice currentPhysicalDevice : physicalDevices)
    {
        if (!hasRequiredDeviceExtensions(instance, currentPhysicalDevice))
            continue;

        uint32_t queueFamilyCount = 0;
        getPhysicalDeviceQueueFamilyProperties(currentPhysicalDevice, &queueFamilyCount, nullptr);
        if (queueFamilyCount == 0)
            continue;

        std::vector<VkQueueFamilyProperties> queueFamilies(queueFamilyCount);
        getPhysicalDeviceQueueFamilyProperties(currentPhysicalDevice, &queueFamilyCount, queueFamilies.data());
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

bool isVulkanRendererSupported()
{
    VkInstance instance = VK_NULL_HANDLE;
    if (!createVulkanInstance(&instance))
        return false;

    const auto destroyInstance = reinterpret_cast<PFN_vkDestroyInstance>(
        vkGetInstanceProcAddr(instance, "vkDestroyInstance"));
    VkPhysicalDevice physicalDevice = VK_NULL_HANDLE;
    uint32_t queueFamilyIndex = 0;
    const bool result = pickGraphicsDevice(instance, &physicalDevice, &queueFamilyIndex);
    destroyInstance(instance, nullptr);
    return result;
}

bool canInitializeVulkanRenderer()
{
    constexpr u64 kQuickValidationWaitTimeoutNs = 1'000'000'000ull;
    if (!isVulkanRendererSupported())
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Error,
            "canInitializeVulkanRenderer: support check failed before VulkanOutput init"
        );
        return false;
    }

    MelonDSAndroid::VulkanOutput vulkanOutput;
    if (!vulkanOutput.init())
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "canInitializeVulkanRenderer: VulkanOutput::init failed");
        return false;
    }

    Frame validationFrame{};
    constexpr uint32_t validationWidth = 64;
    constexpr uint32_t validationHeight = 64;

    if (!vulkanOutput.ensureFrameResources(&validationFrame, validationWidth, validationHeight))
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "canInitializeVulkanRenderer: ensureFrameResources failed");
        return false;
    }

    if (!vulkanOutput.validateFrameSubmission(&validationFrame, kQuickValidationWaitTimeoutNs))
    {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "canInitializeVulkanRenderer: validateFrameSubmission failed");
        return false;
    }

    return true;
}

void setVulkanCapabilityOverrides(bool disableTimelineSemaphores, bool disableDynamicTextureIndexing)
{
    gForceDisableTimelineSemaphores.store(disableTimelineSemaphores, std::memory_order_relaxed);
    gForceDisableDynamicTextureIndexing.store(disableDynamicTextureIndexing, std::memory_order_relaxed);
    melonDS::VulkanContext::SetCapabilityOverrides(disableTimelineSemaphores, disableDynamicTextureIndexing);
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Warn,
        "MelonDSAndroidInterface: Vulkan capability overrides updated (timelineOff=%d dynamicIndexingOff=%d)",
        disableTimelineSemaphores ? 1 : 0,
        disableDynamicTextureIndexing ? 1 : 0
    );
}

std::string jsonEscape(const char* input, size_t maxLen)
{
    if (input == nullptr)
        return {};

    std::string out;
    size_t len = 0;
    while (len < maxLen && input[len] != '\0')
        ++len;

    out.reserve(len + 8);
    for (size_t i = 0; i < len; ++i)
    {
        const unsigned char c = static_cast<unsigned char>(input[i]);
        switch (c)
        {
            case '\\': out += "\\\\"; break;
            case '"': out += "\\\""; break;
            case '\n': out += "\\n"; break;
            case '\r': out += "\\r"; break;
            case '\t': out += "\\t"; break;
            default:
                if (c >= 0x20 && c < 0x7F)
                    out.push_back(static_cast<char>(c));
                break;
        }
    }
    return out;
}

std::string queryVulkanGpuInfoSummary()
{
    {
        std::lock_guard<std::mutex> lock(gCachedGpuInfoMutex);
        if (gHasCachedGpuInfoSummary)
            return gCachedGpuInfoSummary;
    }

    VkInstance instance = VK_NULL_HANDLE;
    VkPhysicalDevice physicalDevice = VK_NULL_HANDLE;
    bool ownsInstance = false;

    if (melonDS::VulkanContext::Get().IsReady())
    {
        instance = melonDS::VulkanContext::Get().GetInstance();
        physicalDevice = melonDS::VulkanContext::Get().GetPhysicalDevice();
    }
    else if (createVulkanInstance(&instance))
    {
        ownsInstance = true;
        uint32_t queueFamilyIndex = 0;
        if (!pickGraphicsDevice(instance, &physicalDevice, &queueFamilyIndex))
        {
            uint32_t deviceCount = 0;
            if (vkEnumeratePhysicalDevices(instance, &deviceCount, nullptr) == VK_SUCCESS && deviceCount > 0)
            {
                std::vector<VkPhysicalDevice> devices(deviceCount);
                if (vkEnumeratePhysicalDevices(instance, &deviceCount, devices.data()) == VK_SUCCESS && !devices.empty())
                {
                    physicalDevice = devices[0];
                }
            }
        }
    }

    std::string resultJson;
    if (physicalDevice != VK_NULL_HANDLE)
    {
        VkPhysicalDeviceProperties props{};
        vkGetPhysicalDeviceProperties(physicalDevice, &props);

        std::string driverName;
        std::string driverInfo;

#ifdef VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES
        auto getProps2 = reinterpret_cast<PFN_vkGetPhysicalDeviceProperties2>(
            vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceProperties2")
        );
        if (getProps2 == nullptr)
        {
            getProps2 = reinterpret_cast<PFN_vkGetPhysicalDeviceProperties2>(
                vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceProperties2KHR")
            );
        }

        if (getProps2 != nullptr)
        {
            bool supportsDriverProps = props.apiVersion >= VK_API_VERSION_1_2;
            if (!supportsDriverProps && vkEnumerateDeviceExtensionProperties != nullptr)
            {
                uint32_t extCount = 0;
                if (vkEnumerateDeviceExtensionProperties(physicalDevice, nullptr, &extCount, nullptr) == VK_SUCCESS && extCount > 0)
                {
                    std::vector<VkExtensionProperties> deviceExts(extCount);
                    if (vkEnumerateDeviceExtensionProperties(physicalDevice, nullptr, &extCount, deviceExts.data()) == VK_SUCCESS)
                    {
                        supportsDriverProps = hasExtension(VK_KHR_DRIVER_PROPERTIES_EXTENSION_NAME, deviceExts);
                    }
                }
            }

            if (supportsDriverProps)
            {
                VkPhysicalDeviceProperties2 props2{};
                props2.sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2;
                VkPhysicalDeviceDriverProperties driverProps{};
                driverProps.sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES;
                props2.pNext = &driverProps;
                getProps2(physicalDevice, &props2);

                driverName = jsonEscape(driverProps.driverName, VK_MAX_DRIVER_NAME_SIZE);
                driverInfo = jsonEscape(driverProps.driverInfo, VK_MAX_DRIVER_INFO_SIZE);
            }
        }
#endif

        const uint32_t major = VK_API_VERSION_MAJOR(props.apiVersion);
        const uint32_t minor = VK_API_VERSION_MINOR(props.apiVersion);
        const uint32_t patch = VK_API_VERSION_PATCH(props.apiVersion);
        char apiVerBuf[32];
        std::snprintf(apiVerBuf, sizeof(apiVerBuf), "%u.%u.%u", major, minor, patch);

        const std::string escapedDeviceName = jsonEscape(props.deviceName, VK_MAX_PHYSICAL_DEVICE_NAME_SIZE);
        const bool usingCustom = melonDS::VulkanDispatch::IsUsingCustomDriver();

        char headerBuf[512];
        std::snprintf(
            headerBuf,
            sizeof(headerBuf),
            "{\"deviceName\":\"%s\",\"vendorId\":%u,\"deviceId\":%u,\"apiVersion\":\"%s\",\"driverVersion\":%u,\"isCustomDriver\":%s,",
            escapedDeviceName.c_str(),
            props.vendorID,
            props.deviceID,
            apiVerBuf,
            props.driverVersion,
            usingCustom ? "true" : "false"
        );
        resultJson = headerBuf;
        resultJson += "\"driverName\":\"" + driverName + "\",\"driverInfo\":\"" + driverInfo + "\"}";
    }

    if (ownsInstance && instance != VK_NULL_HANDLE)
    {
        vkDestroyInstance(instance, nullptr);
    }

    if (!resultJson.empty())
    {
        std::lock_guard<std::mutex> lock(gCachedGpuInfoMutex);
        gCachedGpuInfoSummary = resultJson;
        gHasCachedGpuInfoSummary = true;
    }

    return resultJson;
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
    JNIEnv*,
    jobject,
    jboolean)
{
    return canInitializeVulkanRenderer() ? JNI_TRUE : JNI_FALSE;
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_setVulkanCompatibilityOverridesNative(
    JNIEnv*,
    jobject,
    jboolean disableTimelineSemaphores,
    jboolean disableDynamicTextureIndexing)
{
    setVulkanCapabilityOverrides(
        disableTimelineSemaphores == JNI_TRUE,
        disableDynamicTextureIndexing == JNI_TRUE
    );
}

JNIEXPORT jstring JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_getVulkanGpuInfoNative(JNIEnv* env, jobject)
{
    const std::string info = queryVulkanGpuInfoSummary();
    if (info.empty())
        return nullptr;
    return env->NewStringUTF(info.c_str());
}

JNIEXPORT jboolean JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_canInitializeVulkanRendererNative(
    JNIEnv* env,
    jobject thiz)
{
    return canInitializeVulkanRenderer()
        ? JNI_TRUE
        : JNI_FALSE;
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_setVulkanCapabilityOverridesNative(
    JNIEnv* env,
    jobject thiz,
    jboolean disableTimelineSemaphores,
    jboolean disableDynamicTextureIndexing)
{
    setVulkanCapabilityOverrides(
        disableTimelineSemaphores == JNI_TRUE,
        disableDynamicTextureIndexing == JNI_TRUE
    );
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_MelonDSAndroidInterface_cleanup(JNIEnv* env, jobject thiz)
{
    MelonDSAndroid::flushPendingSaveStateWrites();
    MelonDSAndroid::RetroAchievements::RetroAchievementsManager::SetJavaVm(nullptr);
    env->DeleteGlobalRef(androidUriFileHandler);
    androidUriFileHandler = nullptr;
    vm = nullptr;

    {
        std::lock_guard<std::mutex> lock(MelonDSAndroid::openGlContextMutex);
        if (MelonDSAndroid::openGlContext != nullptr)
        {
            MelonDSAndroid::openGlContext->DeInit();
            delete MelonDSAndroid::openGlContext;
            MelonDSAndroid::openGlContext = nullptr;
        }
    }
    delete fileHandler;
    fileHandler = nullptr;
    MelonDSAndroid::fileHandler = nullptr;
    delete jniEnvHandler;
    jniEnvHandler = nullptr;
}
}
