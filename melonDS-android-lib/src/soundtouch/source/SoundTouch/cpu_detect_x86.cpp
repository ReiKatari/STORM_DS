/// Author        : Copyright (c) Olli Parviainen

// License :
//
//  SoundTouch audio processing library
//  Copyright (c) Olli Parviainen
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//

#include "cpu_detect.h"
#include "../../include/STTypes.h"

#if defined(SOUNDTOUCH_ALLOW_X86_OPTIMIZATIONS)

   #if defined(__GNUC__) && defined(__i386__)

       #include "cpuid.h"
   #elif defined(_M_IX86)

       #include <intrin.h>
   #endif

   #define bit_MMX     (1 << 23)
   #define bit_SSE     (1 << 25)
   #define bit_SSE2    (1 << 26)
#endif

static uint _dwDisabledISA = 0x00;

void disableExtensions(uint dwDisableMask)
{
    _dwDisabledISA = dwDisableMask;
}

uint detectCPUextensions(void)
{

#if ((defined(__GNUC__) && defined(__x86_64__)) \
    || defined(_M_X64))  \
    && defined(SOUNDTOUCH_ALLOW_X86_OPTIMIZATIONS)
    return 0x19 & ~_dwDisabledISA;

#elif ((defined(__GNUC__) && defined(__i386__)) \
    || defined(_M_IX86))  \
    && defined(SOUNDTOUCH_ALLOW_X86_OPTIMIZATIONS)

    if (_dwDisabledISA == 0xffffffff) return 0;

    uint res = 0;

#if defined(__GNUC__)

    uint eax, ebx, ecx, edx;

    if (!__get_cpuid (1, &eax, &ebx, &ecx, &edx)) return 0;

    if (edx & bit_MMX)  res = res | SUPPORT_MMX;
    if (edx & bit_SSE)  res = res | SUPPORT_SSE;
    if (edx & bit_SSE2) res = res | SUPPORT_SSE2;

#else

    int reg[4] = {-1};

    __cpuid(reg,0);
    if ((unsigned int)reg[0] == 0) return 0;

    __cpuid(reg,1);
    if ((unsigned int)reg[3] & bit_MMX)  res = res | SUPPORT_MMX;
    if ((unsigned int)reg[3] & bit_SSE)  res = res | SUPPORT_SSE;
    if ((unsigned int)reg[3] & bit_SSE2) res = res | SUPPORT_SSE2;

#endif

    return res & ~_dwDisabledISA;

#else

    return 0;

#endif
}
