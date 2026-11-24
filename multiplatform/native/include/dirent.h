#pragma once
#if defined(_WIN32) || defined(_MSC_VER)
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

struct dirent {
    unsigned long d_ino;
    char d_name[260];
};

typedef struct DIR DIR;

static inline DIR* opendir(const char* name) {
    (void)name;
    return (DIR*)0;
}

static inline struct dirent* readdir(DIR* dirp) {
    (void)dirp;
    return (struct dirent*)0;
}

static inline int closedir(DIR* dirp) {
    (void)dirp;
    return 0;
}

#ifdef __cplusplus
}
#endif

#else
#include_next <dirent.h>
#endif
