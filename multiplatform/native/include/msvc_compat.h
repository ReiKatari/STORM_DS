#pragma once
#if defined(_MSC_VER)

#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#ifndef NOMINMAX
#define NOMINMAX
#endif

#include <intrin.h>
#include <stdint.h>
#include <stdlib.h>
#include <basetsd.h>
#include <malloc.h>

typedef SSIZE_T ssize_t;

#define __attribute(x)
#define __attribute__(x)

#define __builtin_unreachable() __assume(0)
#define __builtin_expect(exp, c) (exp)
#define __builtin_trap() __debugbreak()

static inline int __builtin_popcount(unsigned int val)
{
    return (int)__popcnt(val);
}

static inline int __builtin_popcountll(unsigned __int64 val)
{
    return (int)__popcnt64(val);
}

static inline int __builtin_ctzll(unsigned __int64 val)
{
    unsigned long idx = 0;
    if (_BitScanForward64(&idx, val))
        return (int)idx;
    return 64;
}

static inline int __builtin_ctz(unsigned int val)
{
    unsigned long idx = 0;
    if (_BitScanForward(&idx, val))
        return (int)idx;
    return 32;
}

static inline int __builtin_clz(unsigned int val)
{
    unsigned long idx = 0;
    if (_BitScanReverse(&idx, val))
        return (int)(31 - idx);
    return 32;
}

static inline int __builtin_clzll(unsigned __int64 val)
{
    unsigned long idx = 0;
    if (_BitScanReverse64(&idx, val))
        return (int)(63 - idx);
    return 64;
}

static inline int setenv(const char* name, const char* value, int overwrite)
{
    if (!name || !value) return -1;
    if (!overwrite)
    {
        char* existing = NULL;
        size_t len = 0;
        if (_dupenv_s(&existing, &len, name) == 0 && existing != NULL)
        {
            free(existing);
            return 0;
        }
    }
    return _putenv_s(name, value) == 0 ? 0 : -1;
}

static inline unsigned short __builtin_bswap16(unsigned short val)
{
    return _byteswap_ushort(val);
}

static inline unsigned int __builtin_bswap32(unsigned int val)
{
    return _byteswap_ulong(val);
}

static inline unsigned __int64 __builtin_bswap64(unsigned __int64 val)
{
    return _byteswap_uint64(val);
}

#endif
