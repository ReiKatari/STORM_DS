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

#ifndef TDStretch_H
#define TDStretch_H

#include <stddef.h>
#include "../../include/STTypes.h"
#include "RateTransposer.h"
#include "../../include/FIFOSamplePipe.h"

namespace soundtouch
{

#define DEFAULT_SEQUENCE_MS         USE_AUTO_SEQUENCE_LEN

#define USE_AUTO_SEQUENCE_LEN       0

#define DEFAULT_SEEKWINDOW_MS       USE_AUTO_SEEKWINDOW_LEN

#define USE_AUTO_SEEKWINDOW_LEN     0

#define DEFAULT_OVERLAP_MS      8

class TDStretch : public FIFOProcessor
{
protected:
    int channels;
    int sampleReq;

    int overlapLength;
    int seekLength;
    int seekWindowLength;
    int overlapDividerBitsNorm;
    int overlapDividerBitsPure;
    int slopingDivider;
    int sampleRate;
    int sequenceMs;
    int seekWindowMs;
    int overlapMs;

    unsigned long maxnorm;
    float maxnormf;

    double tempo;
    double nominalSkip;
    double skipFract;

    bool bQuickSeek;
    bool bAutoSeqSetting;
    bool bAutoSeekSetting;
    bool isBeginning;

    SAMPLETYPE *pMidBuffer;
    SAMPLETYPE *pMidBufferUnaligned;

    FIFOSampleBuffer outputBuffer;
    FIFOSampleBuffer inputBuffer;

    void acceptNewOverlapLength(int newOverlapLength);

    virtual void clearCrossCorrState();
    void calculateOverlapLength(int overlapMs);

    virtual double calcCrossCorr(const SAMPLETYPE *mixingPos, const SAMPLETYPE *compare, double &norm);
    virtual double calcCrossCorrAccumulate(const SAMPLETYPE *mixingPos, const SAMPLETYPE *compare, double &norm);

    virtual int seekBestOverlapPositionFull(const SAMPLETYPE *refPos);
    virtual int seekBestOverlapPositionQuick(const SAMPLETYPE *refPos);
    virtual int seekBestOverlapPosition(const SAMPLETYPE *refPos);

    virtual void overlapStereo(SAMPLETYPE *output, const SAMPLETYPE *input) const;
    virtual void overlapMono(SAMPLETYPE *output, const SAMPLETYPE *input) const;
    virtual void overlapMulti(SAMPLETYPE *output, const SAMPLETYPE *input) const;

    void clearMidBuffer();
    void overlap(SAMPLETYPE *output, const SAMPLETYPE *input, uint ovlPos) const;

    void calcSeqParameters();
    void adaptNormalizer();

    void processSamples();

public:
    TDStretch();
    virtual ~TDStretch() override;

    static void *operator new(size_t s);

    static TDStretch *newInstance();

    FIFOSamplePipe *getOutput() { return &outputBuffer; };

    FIFOSamplePipe *getInput() { return &inputBuffer; };

    void setTempo(double newTempo);

    virtual void clear() override;

    void clearInput();

    void setChannels(int numChannels);

    void enableQuickSeek(bool enable);

    bool isQuickSeekEnabled() const;

    void setParameters(int sampleRate,
                       int sequenceMS = -1,
                       int seekwindowMS = -1,
                       int overlapMS = -1
                       );

    void getParameters(int *pSampleRate, int *pSequenceMs, int *pSeekWindowMs, int *pOverlapMs) const;

    virtual void putSamples(
            const SAMPLETYPE *samples,
            uint numSamples

            ) override;

    int getInputSampleReq() const
    {
        return (int)(nominalSkip + 0.5);
    }

    int getOutputBatchSize() const
    {
        return seekWindowLength - overlapLength;
    }

	int getLatency() const
	{
		return sampleReq;
	}
};

#ifdef SOUNDTOUCH_ALLOW_MMX

    class TDStretchMMX : public TDStretch
    {
    protected:
        double calcCrossCorr(const short *mixingPos, const short *compare, double &norm) override;
        double calcCrossCorrAccumulate(const short *mixingPos, const short *compare, double &norm) override;
        virtual void overlapStereo(short *output, const short *input) const override;
        virtual void clearCrossCorrState() override;
    };
#endif

#ifdef SOUNDTOUCH_ALLOW_SSE

    class TDStretchSSE : public TDStretch
    {
    protected:
        double calcCrossCorr(const float *mixingPos, const float *compare, double &norm) override;
        double calcCrossCorrAccumulate(const float *mixingPos, const float *compare, double &norm) override;
    };

#endif

}
#endif
