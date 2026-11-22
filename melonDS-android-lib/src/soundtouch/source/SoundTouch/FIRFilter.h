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

#ifndef FIRFilter_H
#define FIRFilter_H

#include <stddef.h>
#include "../../include/STTypes.h"

namespace soundtouch
{

class FIRFilter
{
protected:

    uint length;

    uint lengthDiv8;

    uint resultDivFactor;

    SAMPLETYPE *filterCoeffs;
    SAMPLETYPE *filterCoeffsStereo;

    virtual uint evaluateFilterStereo(SAMPLETYPE *dest,
                                      const SAMPLETYPE *src,
                                      uint numSamples) const;
    virtual uint evaluateFilterMono(SAMPLETYPE *dest,
                                    const SAMPLETYPE *src,
                                    uint numSamples) const;
    virtual uint evaluateFilterMulti(SAMPLETYPE *dest, const SAMPLETYPE *src, uint numSamples, uint numChannels);

public:
    FIRFilter();
    virtual ~FIRFilter();

    static void * operator new(size_t s);

    static FIRFilter *newInstance();

    uint evaluate(SAMPLETYPE *dest,
                  const SAMPLETYPE *src,
                  uint numSamples,
                  uint numChannels);

    uint getLength() const;

    virtual void setCoefficients(const SAMPLETYPE *coeffs,
                                 uint newLength,
                                 uint uResultDivFactor);
};

#ifdef SOUNDTOUCH_ALLOW_MMX

    class FIRFilterMMX : public FIRFilter
    {
    protected:
        short *filterCoeffsUnalign;
        short *filterCoeffsAlign;

        virtual uint evaluateFilterStereo(short *dest, const short *src, uint numSamples) const override;
    public:
        FIRFilterMMX();
        ~FIRFilterMMX();

        virtual void setCoefficients(const short *coeffs, uint newLength, uint uResultDivFactor) override;
    };

#endif

#ifdef SOUNDTOUCH_ALLOW_SSE

    class FIRFilterSSE : public FIRFilter
    {
    protected:
        float *filterCoeffsUnalign;
        float *filterCoeffsAlign;

        virtual uint evaluateFilterStereo(float *dest, const float *src, uint numSamples) const override;
    public:
        FIRFilterSSE();
        ~FIRFilterSSE();

        virtual void setCoefficients(const float *coeffs, uint newLength, uint uResultDivFactor) override;
    };

#endif

}

#endif
