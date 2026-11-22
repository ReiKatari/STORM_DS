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

#include <memory.h>
#include <assert.h>
#include <math.h>
#include <stdlib.h>
#include "FIRFilter.h"
#include "cpu_detect.h"

using namespace soundtouch;

FIRFilter::FIRFilter()
{
    resultDivFactor = 0;
    length = 0;
    lengthDiv8 = 0;
    filterCoeffs = nullptr;
    filterCoeffsStereo = nullptr;
}

FIRFilter::~FIRFilter()
{
    delete[] filterCoeffs;
    delete[] filterCoeffsStereo;
}

uint FIRFilter::evaluateFilterStereo(SAMPLETYPE *dest, const SAMPLETYPE *src, uint numSamples) const
{
    int j, end;

    uint ilength = length & -8;

    assert((length != 0) && (length == ilength) && (src != nullptr) && (dest != nullptr) && (filterCoeffs != nullptr));
    assert(numSamples >= ilength);

    end = 2 * (numSamples - ilength);

    #pragma omp parallel for
    for (j = 0; j < end; j += 2)
    {
        const SAMPLETYPE *ptr;
        LONG_SAMPLETYPE suml, sumr;

        suml = sumr = 0;
        ptr = src + j;

        for (uint i = 0; i < ilength; i ++)
        {
            suml += ptr[2 * i] * filterCoeffsStereo[2 * i];
            sumr += ptr[2 * i + 1] * filterCoeffsStereo[2 * i + 1];
        }

#ifdef SOUNDTOUCH_INTEGER_SAMPLES
        suml >>= resultDivFactor;
        sumr >>= resultDivFactor;

        suml = (suml < -32768) ? -32768 : (suml > 32767) ? 32767 : suml;

        sumr = (sumr < -32768) ? -32768 : (sumr > 32767) ? 32767 : sumr;
#endif
        dest[j] = (SAMPLETYPE)suml;
        dest[j + 1] = (SAMPLETYPE)sumr;
    }
    return numSamples - ilength;
}

uint FIRFilter::evaluateFilterMono(SAMPLETYPE *dest, const SAMPLETYPE *src, uint numSamples) const
{
    int j, end;

    int ilength = length & -8;

    assert(ilength != 0);

    end = numSamples - ilength;
    #pragma omp parallel for
    for (j = 0; j < end; j ++)
    {
        const SAMPLETYPE *pSrc = src + j;
        LONG_SAMPLETYPE sum;
        int i;

        sum = 0;
        for (i = 0; i < ilength; i ++)
        {
            sum += pSrc[i] * filterCoeffs[i];
        }
#ifdef SOUNDTOUCH_INTEGER_SAMPLES
        sum >>= resultDivFactor;

        sum = (sum < -32768) ? -32768 : (sum > 32767) ? 32767 : sum;
#endif
        dest[j] = (SAMPLETYPE)sum;
    }
    return end;
}

uint FIRFilter::evaluateFilterMulti(SAMPLETYPE *dest, const SAMPLETYPE *src, uint numSamples, uint numChannels)
{
    int j, end;

    assert(length != 0);
    assert(src != nullptr);
    assert(dest != nullptr);
    assert(filterCoeffs != nullptr);
    assert(numChannels <= SOUNDTOUCH_MAX_CHANNELS);

    int ilength = length & -8;

    end = numChannels * (numSamples - ilength);

    #pragma omp parallel for
    for (j = 0; j < end; j += numChannels)
    {
        const SAMPLETYPE *ptr;
        LONG_SAMPLETYPE sums[SOUNDTOUCH_MAX_CHANNELS];
        uint c;
        int i;

        for (c = 0; c < numChannels; c ++)
        {
            sums[c] = 0;
        }

        ptr = src + j;

        for (i = 0; i < ilength; i ++)
        {
            SAMPLETYPE coef=filterCoeffs[i];
            for (c = 0; c < numChannels; c ++)
            {
                sums[c] += ptr[0] * coef;
                ptr ++;
            }
        }

        for (c = 0; c < numChannels; c ++)
        {
#ifdef SOUNDTOUCH_INTEGER_SAMPLES
            sums[c] >>= resultDivFactor;
#endif
            dest[j+c] = (SAMPLETYPE)sums[c];
        }
    }
    return numSamples - ilength;
}

void FIRFilter::setCoefficients(const SAMPLETYPE *coeffs, uint newLength, uint uResultDivFactor)
{
    assert(newLength > 0);
    if (newLength % 8) ST_THROW_RT_ERROR("FIR filter length not divisible by 8");

    lengthDiv8 = newLength / 8;
    length = lengthDiv8 * 8;
    assert(length == newLength);

    resultDivFactor = uResultDivFactor;

    delete[] filterCoeffs;
    filterCoeffs = new SAMPLETYPE[length];
    delete[] filterCoeffsStereo;
    filterCoeffsStereo = new SAMPLETYPE[length*2];

#ifdef SOUNDTOUCH_FLOAT_SAMPLES

    const double scale = ::pow(0.5, (int)resultDivFactor);;
#else
    const short scale = 1;
#endif

    for (uint i = 0; i < length; i ++)
    {
        filterCoeffs[i] = (SAMPLETYPE)(coeffs[i] * scale);

        filterCoeffsStereo[2 * i] = (SAMPLETYPE)(coeffs[i] * scale);
        filterCoeffsStereo[2 * i + 1] = (SAMPLETYPE)(coeffs[i] * scale);
    }
}

uint FIRFilter::getLength() const
{
    return length;
}

uint FIRFilter::evaluate(SAMPLETYPE *dest, const SAMPLETYPE *src, uint numSamples, uint numChannels)
{
    assert(length > 0);
    assert(lengthDiv8 * 8 == length);

    if (numSamples < length) return 0;

#ifndef USE_MULTICH_ALWAYS
    if (numChannels == 1)
    {
        return evaluateFilterMono(dest, src, numSamples);
    }
    else if (numChannels == 2)
    {
        return evaluateFilterStereo(dest, src, numSamples);
    }
    else
#endif
    {
        assert(numChannels > 0);
        return evaluateFilterMulti(dest, src, numSamples, numChannels);
    }
}

void * FIRFilter::operator new(size_t)
{

    ST_THROW_RT_ERROR("Error in FIRFilter::new: Don't use 'new FIRFilter', use 'newInstance' member instead!");
    return newInstance();
}

FIRFilter * FIRFilter::newInstance()
{
    uint uExtensions;

    uExtensions = detectCPUextensions();
    (void)uExtensions;

#ifdef SOUNDTOUCH_ALLOW_MMX

    if (uExtensions & SUPPORT_MMX)
    {
        return ::new FIRFilterMMX;
    }
    else
#endif

#ifdef SOUNDTOUCH_ALLOW_SSE
    if (uExtensions & SUPPORT_SSE)
    {

        return ::new FIRFilterSSE;
    }
    else
#endif

    {

        return ::new FIRFilter;
    }
}
