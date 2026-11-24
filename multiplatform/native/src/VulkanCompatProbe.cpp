#include "VulkanCompatProbe.h"

#include <cstring>
#include <string>
#include <vector>

#if defined(_WIN32) || defined(_MSC_VER)
  #ifndef WIN32_LEAN_AND_MEAN
  #define WIN32_LEAN_AND_MEAN
  #endif
  #ifndef NOMINMAX
  #define NOMINMAX
  #endif
  #include <windows.h>
#else
  #include <dlfcn.h>
#endif

#define VK_NO_PROTOTYPES
#include <vulkan/vulkan.h>

namespace StormDS
{

static void* LoadVulkanLibrary()
{
#if defined(_WIN32) || defined(_MSC_VER)
    return (void*)LoadLibraryA("vulkan-1.dll");
#elif defined(__ANDROID__)
    return dlopen("libvulkan.so", RTLD_NOW | RTLD_LOCAL);
#else
    void* lib = dlopen("libvulkan.so.1", RTLD_NOW | RTLD_LOCAL);
    if (!lib) {
        lib = dlopen("libvulkan.so", RTLD_NOW | RTLD_LOCAL);
    }
    return lib;
#endif
}

static void FreeVulkanLibrary(void* lib)
{
    if (!lib) return;
#if defined(_WIN32) || defined(_MSC_VER)
    FreeLibrary((HMODULE)lib);
#else
    dlclose(lib);
#endif
}

static void* GetLibrarySymbol(void* lib, const char* name)
{
    if (!lib) return nullptr;
#if defined(_WIN32) || defined(_MSC_VER)
    return (void*)GetProcAddress((HMODULE)lib, name);
#else
    return dlsym(lib, name);
#endif
}

int32_t ProbeVulkanCapabilities(StormDsVulkanCaps* out_caps)
{
    if (!out_caps) return 0;
    std::memset(out_caps, 0, sizeof(StormDsVulkanCaps));

    void* lib = LoadVulkanLibrary();
    if (!lib) {
        out_caps->vulkan_available = 0;
        out_caps->recommended_tier = 0;
        return 0;
    }

    auto pfnGetInstanceProcAddr = (PFN_vkGetInstanceProcAddr)GetLibrarySymbol(lib, "vkGetInstanceProcAddr");
    if (!pfnGetInstanceProcAddr) {
        FreeVulkanLibrary(lib);
        out_caps->vulkan_available = 0;
        out_caps->recommended_tier = 0;
        return 0;
    }

    auto pfnEnumerateInstanceVersion = (PFN_vkEnumerateInstanceVersion)pfnGetInstanceProcAddr(VK_NULL_HANDLE, "vkEnumerateInstanceVersion");
    auto pfnCreateInstance = (PFN_vkCreateInstance)pfnGetInstanceProcAddr(VK_NULL_HANDLE, "vkCreateInstance");

    if (!pfnCreateInstance) {
        FreeVulkanLibrary(lib);
        out_caps->vulkan_available = 0;
        out_caps->recommended_tier = 0;
        return 0;
    }

    uint32_t instanceVersion = VK_API_VERSION_1_0;
    if (pfnEnumerateInstanceVersion) {
        uint32_t ver = 0;
        if (pfnEnumerateInstanceVersion(&ver) == VK_SUCCESS && ver >= VK_API_VERSION_1_0) {
            instanceVersion = ver;
        }
    }

    uint32_t major = VK_API_VERSION_MAJOR(instanceVersion);
    uint32_t minor = VK_API_VERSION_MINOR(instanceVersion);
    uint32_t patch = VK_API_VERSION_PATCH(instanceVersion);

    out_caps->vulkan_available = 1;
    out_caps->api_version_major = major;
    out_caps->api_version_minor = minor;
    out_caps->api_version_patch = patch;

    // Try creating instance with discovered version, then cascade down if failed
    VkApplicationInfo appInfo {};
    appInfo.sType = VK_STRUCTURE_TYPE_APPLICATION_INFO;
    appInfo.pApplicationName = "STORM DS Probe";
    appInfo.applicationVersion = VK_MAKE_VERSION(1, 0, 0);
    appInfo.pEngineName = "STORM Core";
    appInfo.engineVersion = VK_MAKE_VERSION(1, 0, 0);
    appInfo.apiVersion = instanceVersion;

    VkInstanceCreateInfo createInfo {};
    createInfo.sType = VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO;
    createInfo.pApplicationInfo = &appInfo;
    createInfo.pNext = nullptr;

    VkInstance instance = VK_NULL_HANDLE;
    VkResult res = pfnCreateInstance(&createInfo, nullptr, &instance);
    if (res != VK_SUCCESS) {
        // Cascade to Vulkan 1.0 baseline
        appInfo.apiVersion = VK_API_VERSION_1_0;
        res = pfnCreateInstance(&createInfo, nullptr, &instance);
        if (res == VK_SUCCESS) {
            out_caps->api_version_major = 1;
            out_caps->api_version_minor = 0;
            out_caps->api_version_patch = 0;
        }
    }

    if (res != VK_SUCCESS || instance == VK_NULL_HANDLE) {
        FreeVulkanLibrary(lib);
        out_caps->recommended_tier = 0; // OpenGL or Software cascade
        return 1;
    }

    auto pfnDestroyInstance = (PFN_vkDestroyInstance)pfnGetInstanceProcAddr(instance, "vkDestroyInstance");
    auto pfnEnumeratePhysicalDevices = (PFN_vkEnumeratePhysicalDevices)pfnGetInstanceProcAddr(instance, "vkEnumeratePhysicalDevices");
    auto pfnGetPhysicalDeviceProperties = (PFN_vkGetPhysicalDeviceProperties)pfnGetInstanceProcAddr(instance, "vkGetPhysicalDeviceProperties");
    auto pfnEnumerateDeviceExtensionProperties = (PFN_vkEnumerateDeviceExtensionProperties)pfnGetInstanceProcAddr(instance, "vkEnumerateDeviceExtensionProperties");

    if (pfnEnumeratePhysicalDevices && pfnGetPhysicalDeviceProperties) {
        uint32_t deviceCount = 0;
        pfnEnumeratePhysicalDevices(instance, &deviceCount, nullptr);
        if (deviceCount > 0) {
            std::vector<VkPhysicalDevice> devices(deviceCount);
            pfnEnumeratePhysicalDevices(instance, &deviceCount, devices.data());

            // Prefer discrete GPU if present, otherwise device 0
            VkPhysicalDevice chosenDev = devices[0];
            VkPhysicalDeviceProperties chosenProps {};
            pfnGetPhysicalDeviceProperties(chosenDev, &chosenProps);

            for (uint32_t i = 1; i < deviceCount; ++i) {
                VkPhysicalDeviceProperties testProps {};
                pfnGetPhysicalDeviceProperties(devices[i], &testProps);
                if (testProps.deviceType == VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU &&
                    chosenProps.deviceType != VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU) {
                    chosenDev = devices[i];
                    chosenProps = testProps;
                }
            }

            out_caps->vendor_id = chosenProps.vendorID;
            out_caps->device_id = chosenProps.deviceID;
            std::strncpy(out_caps->device_name, chosenProps.deviceName, sizeof(out_caps->device_name) - 1);
            out_caps->device_name[sizeof(out_caps->device_name) - 1] = '\0';

            // Check device extensions
            if (pfnEnumerateDeviceExtensionProperties) {
                uint32_t extCount = 0;
                pfnEnumerateDeviceExtensionProperties(chosenDev, nullptr, &extCount, nullptr);
                if (extCount > 0) {
                    std::vector<VkExtensionProperties> extensions(extCount);
                    pfnEnumerateDeviceExtensionProperties(chosenDev, nullptr, &extCount, extensions.data());

                    for (const auto& ext : extensions) {
                        if (std::strcmp(ext.extensionName, "VK_KHR_timeline_semaphore") == 0) {
                            out_caps->has_timeline_semaphore = 1;
                        }
                        if (std::strcmp(ext.extensionName, "VK_EXT_descriptor_indexing") == 0) {
                            out_caps->has_descriptor_indexing = 1;
                        }
#if defined(_WIN32)
                        if (std::strcmp(ext.extensionName, "VK_KHR_external_memory_win32") == 0) {
                            out_caps->has_zero_copy_export = 1;
                        }
#elif defined(__ANDROID__)
                        if (std::strcmp(ext.extensionName, "VK_ANDROID_external_memory_android_hardware_buffer") == 0) {
                            out_caps->has_zero_copy_export = 1;
                        }
#else
                        if (std::strcmp(ext.extensionName, "VK_KHR_external_memory_fd") == 0) {
                            out_caps->has_zero_copy_export = 1;
                        }
#endif
                    }
                }
            }
        }
    }

    // Determine recommended tier
    if (out_caps->api_version_major >= 1 && (out_caps->api_version_minor >= 3 ||
        (out_caps->has_timeline_semaphore && out_caps->has_descriptor_indexing && out_caps->has_zero_copy_export))) {
        out_caps->recommended_tier = 4; // VK1.3+ ZeroCopy
    } else if (out_caps->api_version_major >= 1) {
        out_caps->recommended_tier = 2; // VK1.0/1.1 Compat
    } else {
        out_caps->recommended_tier = 0; // Software / OpenGL
    }

    if (pfnDestroyInstance) {
        pfnDestroyInstance(instance, nullptr);
    }
    FreeVulkanLibrary(lib);

    return 1;
}

}
