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

#ifndef FIFOSampleBuffer_H
#define FIFOSampleBuffer_H

#include "FIFOSamplePipe.h"

namespace soundtouch
{

class FIFOSampleBuffer : public FIFOSamplePipe
{
private:

    SAMPLETYPE *buffer;

    SAMPLETYPE *bufferUnaligned;

    uint sizeInBytes;

    uint samplesInBuffer;

    uint channels;

    uint bufferPos;

    void rewind();

    void ensureCapacity(uint capacityRequirement);

    uint getCapacity() const;

public:

    FIFOSampleBuffer(int numChannels = 2

                     );

    ~FIFOSampleBuffer() override;

    virtual SAMPLETYPE *ptrBegin() override;

    SAMPLETYPE *ptrEnd(
                uint slackCapacity

                );

    virtual void putSamples(const SAMPLETYPE *samples,
                            uint numSamples
                            ) override;

    virtual void putSamples(uint numSamples
                            );

    virtual uint receiveSamples(SAMPLETYPE *output,
                                uint maxSamples
                                ) override;

    virtual uint receiveSamples(uint maxSamples
                                ) override;

    virtual uint numSamples() const override;

    void setChannels(int numChannels);

    int getChannels()
    {
        return channels;
    }

    virtual int isEmpty() const override;

    virtual void clear() override;

    uint adjustAmountOfSamples(uint numSamples) override;

    void addSilent(uint nSamples);
};

}

#endif
