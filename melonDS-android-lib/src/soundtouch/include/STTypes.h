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

#ifndef STTypes_H
#define STTypes_H

typedef unsigned int    uint;
typedef unsigned long   ulong;

#ifdef _WIN64
    typedef unsigned long long ulongptr;
#else
    typedef ulong ulongptr;
#endif

#define SOUNDTOUCH_ALIGN_POINTER_16(x)      ( ( (ulongptr)(x) + 15 ) & ~(ulongptr)15 )

#if (defined(__GNUC__) && !defined(ANDROID))

    #include "soundtouch_config.h"
#endif

namespace soundtouch
{

    #define SOUNDTOUCH_MAX_CHANNELS     32

    #if (defined(__SOFTFP__) && defined(ANDROID))

        #undef  SOUNDTOUCH_FLOAT_SAMPLES
        #define SOUNDTOUCH_INTEGER_SAMPLES      1
    #endif

    #if !(SOUNDTOUCH_INTEGER_SAMPLES || SOUNDTOUCH_FLOAT_SAMPLES)

        #define SOUNDTOUCH_FLOAT_SAMPLES       1

    #endif

    #if (_M_IX86 || __i386__ || __x86_64__ || _M_X64)

        #define SOUNDTOUCH_ALLOW_X86_OPTIMIZATIONS     1

        #ifdef SOUNDTOUCH_DISABLE_X86_OPTIMIZATIONS
            #undef SOUNDTOUCH_ALLOW_X86_OPTIMIZATIONS
        #endif
    #else

        #undef SOUNDTOUCH_ALLOW_X86_OPTIMIZATIONS

    #endif

    #ifdef SOUNDTOUCH_INTEGER_SAMPLES

        typedef short SAMPLETYPE;

        typedef long  LONG_SAMPLETYPE;

        #ifdef SOUNDTOUCH_FLOAT_SAMPLES

            #error "conflicting sample types defined"
        #endif

        #ifdef SOUNDTOUCH_ALLOW_X86_OPTIMIZATIONS

            #if (!_M_X64)
                #define SOUNDTOUCH_ALLOW_MMX   1
            #endif
        #endif

    #else

        typedef float  SAMPLETYPE;

        typedef float LONG_SAMPLETYPE;

        #ifdef SOUNDTOUCH_ALLOW_X86_OPTIMIZATIONS

            #define SOUNDTOUCH_ALLOW_SSE       1
        #endif

    #endif

    #if ((SOUNDTOUCH_ALLOW_SSE) || (__SSE__) || (SOUNDTOUCH_USE_NEON))
        #if SOUNDTOUCH_ALLOW_NONEXACT_SIMD_OPTIMIZATION
            #define ST_SIMD_AVOID_UNALIGNED
        #endif
    #endif

}

#ifdef ST_NO_EXCEPTION_HANDLING

    #include <assert.h>
    #define ST_THROW_RT_ERROR(x)    {assert((const char *)x);}
#else

    #include <stdexcept>
    #include <string>
    #define ST_THROW_RT_ERROR(x)    {throw std::runtime_error(x);}
#endif

#endif
