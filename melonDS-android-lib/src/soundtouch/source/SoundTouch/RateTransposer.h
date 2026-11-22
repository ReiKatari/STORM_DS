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

#ifndef RateTransposer_H
#define RateTransposer_H

#include <stddef.h>
#include "AAFilter.h"
#include "../../include/FIFOSamplePipe.h"
#include "../../include/FIFOSampleBuffer.h"

#include "../../include/STTypes.h"

namespace soundtouch
{

class TransposerBase
{
public:
        enum ALGORITHM {
        LINEAR = 0,
        CUBIC,
        SHANNON
    };

protected:
    virtual int transposeMono(SAMPLETYPE *dest,
                        const SAMPLETYPE *src,
                        int &srcSamples)  = 0;
    virtual int transposeStereo(SAMPLETYPE *dest,
                        const SAMPLETYPE *src,
                        int &srcSamples) = 0;
    virtual int transposeMulti(SAMPLETYPE *dest,
                        const SAMPLETYPE *src,
                        int &srcSamples) = 0;

    static ALGORITHM algorithm;

public:
    double rate;
    int numChannels;

    TransposerBase();
    virtual ~TransposerBase();

    virtual int transpose(FIFOSampleBuffer &dest, FIFOSampleBuffer &src);
    virtual void setRate(double newRate);
    virtual void setChannels(int channels);
    virtual int getLatency() const = 0;

    virtual void resetRegisters() = 0;

    static TransposerBase *newInstance();

    static void setAlgorithm(ALGORITHM a);
};

class RateTransposer : public FIFOProcessor
{
protected:

    AAFilter *pAAFilter;
    TransposerBase *pTransposer;

    FIFOSampleBuffer inputBuffer;

    FIFOSampleBuffer midBuffer;

    FIFOSampleBuffer outputBuffer;

    bool bUseAAFilter;

    void processSamples(const SAMPLETYPE *src,
                        uint numSamples);

public:
    RateTransposer();
    virtual ~RateTransposer() override;

    FIFOSamplePipe *getOutput() { return &outputBuffer; };

    AAFilter *getAAFilter();

    void enableAAFilter(bool newMode);

    bool isAAFilterEnabled() const;

    virtual void setRate(double newRate);

    void setChannels(int channels);

    void putSamples(const SAMPLETYPE *samples, uint numSamples) override;

    void clear() override;

    int isEmpty() const override;

    int getLatency() const;
};

}

#endif
