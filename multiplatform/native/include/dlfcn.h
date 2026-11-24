#pragma once
#if defined(_WIN32) || defined(_MSC_VER)
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#ifndef NOMINMAX
#define NOMINMAX
#endif
#include <windows.h>
#include <string.h>

#define RTLD_NOW 0
#define RTLD_LOCAL 0
#define RTLD_GLOBAL 0

#ifdef __cplusplus
extern "C" {
#endif

static inline void* dlopen(const char* filename, int flags) {
    (void)flags;
    if (!filename) return (void*)GetModuleHandleA(NULL);
    if (strcmp(filename, "libvulkan.so") == 0 || strcmp(filename, "libvulkan.so.1") == 0) {
        return (void*)LoadLibraryA("vulkan-1.dll");
    }
    return (void*)LoadLibraryA(filename);
}

static inline void* dlsym(void* handle, const char* symbol) {
    return (void*)GetProcAddress((HMODULE)handle, symbol);
}

static inline int dlclose(void* handle) {
    return FreeLibrary((HMODULE)handle) ? 0 : -1;
}

static inline const char* dlerror(void) {
    return "Dynamic linking error";
}

#ifdef __cplusplus
}
#endif

#else
#include_next <dlfcn.h>
#endif
