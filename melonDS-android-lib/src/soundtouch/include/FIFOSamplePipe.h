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

#ifndef FIFOSamplePipe_H
#define FIFOSamplePipe_H

#include <assert.h>
#include <stdlib.h>
#include "STTypes.h"

namespace soundtouch
{

class FIFOSamplePipe
{
protected:

    bool verifyNumberOfChannels(int nChannels) const
    {
        if ((nChannels > 0) && (nChannels <= SOUNDTOUCH_MAX_CHANNELS))
        {
            return true;
        }
        ST_THROW_RT_ERROR("Error: Illegal number of channels");
        return false;
    }

public:

    virtual ~FIFOSamplePipe() {}

    virtual SAMPLETYPE *ptrBegin() = 0;

    virtual void putSamples(const SAMPLETYPE *samples,
                            uint numSamples
                            ) = 0;

    void moveSamples(FIFOSamplePipe &other
         )
    {
        const uint oNumSamples = other.numSamples();

        putSamples(other.ptrBegin(), oNumSamples);
        other.receiveSamples(oNumSamples);
    }

    virtual uint receiveSamples(SAMPLETYPE *output,
                                uint maxSamples
                                ) = 0;

    virtual uint receiveSamples(uint maxSamples
                                ) = 0;

    virtual uint numSamples() const = 0;

    virtual int isEmpty() const = 0;

    virtual void clear() = 0;

    virtual uint adjustAmountOfSamples(uint numSamples) = 0;

};

class FIFOProcessor :public FIFOSamplePipe
{
protected:

    FIFOSamplePipe *output;

    void setOutPipe(FIFOSamplePipe *pOutput)
    {
        assert(output == nullptr);
        assert(pOutput != nullptr);
        output = pOutput;
    }

    FIFOProcessor()
    {
        output = nullptr;
    }

    FIFOProcessor(FIFOSamplePipe *pOutput
                 )
    {
        output = pOutput;
    }

    virtual ~FIFOProcessor() override
    {
    }

    virtual SAMPLETYPE *ptrBegin() override
    {
        return output->ptrBegin();
    }

public:

    virtual uint receiveSamples(SAMPLETYPE *outBuffer,
                                uint maxSamples
                                ) override
    {
        return output->receiveSamples(outBuffer, maxSamples);
    }

    virtual uint receiveSamples(uint maxSamples
                                ) override
    {
        return output->receiveSamples(maxSamples);
    }

    virtual uint numSamples() const override
    {
        return output->numSamples();
    }

    virtual int isEmpty() const override
    {
        return output->isEmpty();
    }

    virtual uint adjustAmountOfSamples(uint numSamples) override
    {
        return output->adjustAmountOfSamples(numSamples);
    }
};

}

#endif
