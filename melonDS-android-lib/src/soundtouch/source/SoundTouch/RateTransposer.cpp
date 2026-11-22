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
#include <stdlib.h>
#include <stdio.h>
#include "RateTransposer.h"
#include "InterpolateLinear.h"
#include "InterpolateCubic.h"
#include "InterpolateShannon.h"
#include "AAFilter.h"

using namespace soundtouch;

TransposerBase::ALGORITHM TransposerBase::algorithm = TransposerBase::CUBIC;

RateTransposer::RateTransposer() : FIFOProcessor(&outputBuffer)
{
    bUseAAFilter =
#ifndef SOUNDTOUCH_PREVENT_CLICK_AT_RATE_CROSSOVER
        true;
#else

        false;
#endif

    pAAFilter = new AAFilter(64);
    pTransposer = TransposerBase::newInstance();
    clear();
}

RateTransposer::~RateTransposer()
{
    delete pAAFilter;
    delete pTransposer;
}

void RateTransposer::enableAAFilter(bool newMode)
{
#ifndef SOUNDTOUCH_PREVENT_CLICK_AT_RATE_CROSSOVER

    bUseAAFilter = newMode;
    clear();
#endif
}

bool RateTransposer::isAAFilterEnabled() const
{
    return bUseAAFilter;
}

AAFilter *RateTransposer::getAAFilter()
{
    return pAAFilter;
}

void RateTransposer::setRate(double newRate)
{
    double fCutoff;

    pTransposer->setRate(newRate);

    if (newRate > 1.0)
    {
        fCutoff = 0.5 / newRate;
    }
    else
    {
        fCutoff = 0.5 * newRate;
    }
    pAAFilter->setCutoffFreq(fCutoff);
}

void RateTransposer::putSamples(const SAMPLETYPE *samples, uint nSamples)
{
    processSamples(samples, nSamples);
}

void RateTransposer::processSamples(const SAMPLETYPE *src, uint nSamples)
{
    if (nSamples == 0) return;

    inputBuffer.putSamples(src, nSamples);

    if (bUseAAFilter == false)
    {
        (void)pTransposer->transpose(outputBuffer, inputBuffer);
        return;
    }

    assert(pAAFilter);

    if (pTransposer->rate < 1.0f)
    {

        pTransposer->transpose(midBuffer, inputBuffer);

        pAAFilter->evaluate(outputBuffer, midBuffer);
    }
    else
    {

        pAAFilter->evaluate(midBuffer, inputBuffer);

        pTransposer->transpose(outputBuffer, midBuffer);
    }
}

void RateTransposer::setChannels(int nChannels)
{
    if (!verifyNumberOfChannels(nChannels) ||
        (pTransposer->numChannels == nChannels)) return;

    pTransposer->setChannels(nChannels);
    inputBuffer.setChannels(nChannels);
    midBuffer.setChannels(nChannels);
    outputBuffer.setChannels(nChannels);
}

void RateTransposer::clear()
{
    outputBuffer.clear();
    midBuffer.clear();
    inputBuffer.clear();
    pTransposer->resetRegisters();

    int prefill = getLatency();
    inputBuffer.addSilent(prefill);
}

int RateTransposer::isEmpty() const
{
    int res;

    res = FIFOProcessor::isEmpty();
    if (res == 0) return 0;
    return inputBuffer.isEmpty();
}

int RateTransposer::getLatency() const
{
    return pTransposer->getLatency() +
        ((bUseAAFilter) ? (pAAFilter->getLength() / 2) : 0);
}

void TransposerBase::setAlgorithm(TransposerBase::ALGORITHM a)
{
    TransposerBase::algorithm = a;
}

int TransposerBase::transpose(FIFOSampleBuffer &dest, FIFOSampleBuffer &src)
{
    int numSrcSamples = src.numSamples();
    int sizeDemand = (int)((double)numSrcSamples / rate) + 8;
    int numOutput;
    SAMPLETYPE *psrc = src.ptrBegin();
    SAMPLETYPE *pdest = dest.ptrEnd(sizeDemand);

#ifndef USE_MULTICH_ALWAYS
    if (numChannels == 1)
    {
        numOutput = transposeMono(pdest, psrc, numSrcSamples);
    }
    else if (numChannels == 2)
    {
        numOutput = transposeStereo(pdest, psrc, numSrcSamples);
    }
    else
#endif
    {
        assert(numChannels > 0);
        numOutput = transposeMulti(pdest, psrc, numSrcSamples);
    }
    dest.putSamples(numOutput);
    src.receiveSamples(numSrcSamples);
    return numOutput;
}

TransposerBase::TransposerBase()
{
    numChannels = 0;
    rate = 1.0f;
}

TransposerBase::~TransposerBase()
{
}

void TransposerBase::setChannels(int channels)
{
    numChannels = channels;
    resetRegisters();
}

void TransposerBase::setRate(double newRate)
{
    rate = newRate;
}

TransposerBase *TransposerBase::newInstance()
{
#ifdef SOUNDTOUCH_INTEGER_SAMPLES

    return ::new InterpolateLinearInteger;
#else
    switch (algorithm)
    {
        case LINEAR:
            return new InterpolateLinearFloat;

        case CUBIC:
            return new InterpolateCubic;

        case SHANNON:
            return new InterpolateShannon;

        default:
            assert(false);
            return nullptr;
    }
#endif
}
