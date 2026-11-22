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

#include <assert.h>
#include <stdlib.h>
#include "InterpolateLinear.h"

using namespace soundtouch;

#define SCALE    65536

InterpolateLinearInteger::InterpolateLinearInteger() : TransposerBase()
{

    resetRegisters();
    setRate(1.0f);
}

void InterpolateLinearInteger::resetRegisters()
{
    iFract = 0;
}

int InterpolateLinearInteger::transposeMono(SAMPLETYPE *dest, const SAMPLETYPE *src, int &srcSamples)
{
    int i;
    int srcSampleEnd = srcSamples - 1;
    int srcCount = 0;

    i = 0;
    while (srcCount < srcSampleEnd)
    {
        LONG_SAMPLETYPE temp;

        assert(iFract < SCALE);

        temp = (SCALE - iFract) * src[0] + iFract * src[1];
        dest[i] = (SAMPLETYPE)(temp / SCALE);
        i++;

        iFract += iRate;

        int iWhole = iFract / SCALE;
        iFract -= iWhole * SCALE;
        srcCount += iWhole;
        src += iWhole;
    }
    srcSamples = srcCount;

    return i;
}

int InterpolateLinearInteger::transposeStereo(SAMPLETYPE *dest, const SAMPLETYPE *src, int &srcSamples)
{
    int i;
    int srcSampleEnd = srcSamples - 1;
    int srcCount = 0;

    i = 0;
    while (srcCount < srcSampleEnd)
    {
        LONG_SAMPLETYPE temp0;
        LONG_SAMPLETYPE temp1;

        assert(iFract < SCALE);

        temp0 = (SCALE - iFract) * src[0] + iFract * src[2];
        temp1 = (SCALE - iFract) * src[1] + iFract * src[3];
        dest[0] = (SAMPLETYPE)(temp0 / SCALE);
        dest[1] = (SAMPLETYPE)(temp1 / SCALE);
        dest += 2;
        i++;

        iFract += iRate;

        int iWhole = iFract / SCALE;
        iFract -= iWhole * SCALE;
        srcCount += iWhole;
        src += 2*iWhole;
    }
    srcSamples = srcCount;

    return i;
}

int InterpolateLinearInteger::transposeMulti(SAMPLETYPE *dest, const SAMPLETYPE *src, int &srcSamples)
{
    int i;
    int srcSampleEnd = srcSamples - 1;
    int srcCount = 0;

    i = 0;
    while (srcCount < srcSampleEnd)
    {
        LONG_SAMPLETYPE temp, vol1;

        assert(iFract < SCALE);
        vol1 = (LONG_SAMPLETYPE)(SCALE - iFract);
        for (int c = 0; c < numChannels; c ++)
        {
            temp = vol1 * src[c] + iFract * src[c + numChannels];
            dest[0] = (SAMPLETYPE)(temp / SCALE);
            dest ++;
        }
        i++;

        iFract += iRate;

        int iWhole = iFract / SCALE;
        iFract -= iWhole * SCALE;
        srcCount += iWhole;
        src += iWhole * numChannels;
    }
    srcSamples = srcCount;

    return i;
}

void InterpolateLinearInteger::setRate(double newRate)
{
    iRate = (int)(newRate * SCALE + 0.5);
    TransposerBase::setRate(newRate);
}

InterpolateLinearFloat::InterpolateLinearFloat() : TransposerBase()
{

    resetRegisters();
    setRate(1.0);
}

void InterpolateLinearFloat::resetRegisters()
{
    fract = 0;
}

int InterpolateLinearFloat::transposeMono(SAMPLETYPE *dest, const SAMPLETYPE *src, int &srcSamples)
{
    int i;
    int srcSampleEnd = srcSamples - 1;
    int srcCount = 0;

    i = 0;
    while (srcCount < srcSampleEnd)
    {
        double out;
        assert(fract < 1.0);

        out = (1.0 - fract) * src[0] + fract * src[1];
        dest[i] = (SAMPLETYPE)out;
        i ++;

        fract += rate;

        int whole = (int)fract;
        fract -= whole;
        src += whole;
        srcCount += whole;
    }
    srcSamples = srcCount;
    return i;
}

int InterpolateLinearFloat::transposeStereo(SAMPLETYPE *dest, const SAMPLETYPE *src, int &srcSamples)
{
    int i;
    int srcSampleEnd = srcSamples - 1;
    int srcCount = 0;

    i = 0;
    while (srcCount < srcSampleEnd)
    {
        double out0, out1;
        assert(fract < 1.0);

        out0 = (1.0 - fract) * src[0] + fract * src[2];
        out1 = (1.0 - fract) * src[1] + fract * src[3];
        dest[2*i]   = (SAMPLETYPE)out0;
        dest[2*i+1] = (SAMPLETYPE)out1;
        i ++;

        fract += rate;

        int whole = (int)fract;
        fract -= whole;
        src += 2*whole;
        srcCount += whole;
    }
    srcSamples = srcCount;
    return i;
}

int InterpolateLinearFloat::transposeMulti(SAMPLETYPE *dest, const SAMPLETYPE *src, int &srcSamples)
{
    int i;
    int srcSampleEnd = srcSamples - 1;
    int srcCount = 0;

    i = 0;
    while (srcCount < srcSampleEnd)
    {
        float temp, vol1, fract_float;

        vol1 = (float)(1.0 - fract);
		fract_float = (float)fract;
        for (int c = 0; c < numChannels; c ++)
        {
			temp = vol1 * src[c] + fract_float * src[c + numChannels];
            *dest = (SAMPLETYPE)temp;
            dest ++;
        }
        i++;

        fract += rate;

        int iWhole = (int)fract;
        fract -= iWhole;
        srcCount += iWhole;
        src += iWhole * numChannels;
    }
    srcSamples = srcCount;

    return i;
}
