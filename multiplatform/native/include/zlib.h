#pragma once
#if defined(_WIN32) || defined(_MSC_VER)
#include "../src/miniz/miniz.h"
typedef mz_ulong uLongf;
#else
#include_next <zlib.h>
#endif
