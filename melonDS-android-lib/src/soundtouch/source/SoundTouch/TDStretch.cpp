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

#include <string.h>
#include <limits.h>
#include <assert.h>
#include <math.h>
#include <float.h>

#include "../../include/STTypes.h"
#include "cpu_detect.h"
#include "TDStretch.h"

using namespace soundtouch;

#define max(x, y) (((x) > (y)) ? (x) : (y))

TDStretch::TDStretch() : FIFOProcessor(&outputBuffer)
{
    bQuickSeek = false;
    channels = 2;

    pMidBuffer = nullptr;
    pMidBufferUnaligned = nullptr;
    overlapLength = 0;

    bAutoSeqSetting = true;
    bAutoSeekSetting = true;

    tempo = 1.0f;
    setParameters(44100, DEFAULT_SEQUENCE_MS, DEFAULT_SEEKWINDOW_MS, DEFAULT_OVERLAP_MS);
    setTempo(1.0f);

    clear();
}

TDStretch::~TDStretch()
{
    delete[] pMidBufferUnaligned;
}

void TDStretch::setParameters(int aSampleRate, int aSequenceMS,
                              int aSeekWindowMS, int aOverlapMS)
{

    if (aSampleRate > 0)
    {
        if (aSampleRate > 192000) ST_THROW_RT_ERROR("Error: Excessive samplerate");
        this->sampleRate = aSampleRate;
    }

    if (aOverlapMS > 0) this->overlapMs = aOverlapMS;

    if (aSequenceMS > 0)
    {
        this->sequenceMs = aSequenceMS;
        bAutoSeqSetting = false;
    }
    else if (aSequenceMS == 0)
    {

        bAutoSeqSetting = true;
    }

    if (aSeekWindowMS > 0)
    {
        this->seekWindowMs = aSeekWindowMS;
        bAutoSeekSetting = false;
    }
    else if (aSeekWindowMS == 0)
    {

        bAutoSeekSetting = true;
    }

    calcSeqParameters();

    calculateOverlapLength(overlapMs);

    setTempo(tempo);
}

void TDStretch::getParameters(int *pSampleRate, int *pSequenceMs, int *pSeekWindowMs, int *pOverlapMs) const
{
    if (pSampleRate)
    {
        *pSampleRate = sampleRate;
    }

    if (pSequenceMs)
    {
        *pSequenceMs = (bAutoSeqSetting) ? (USE_AUTO_SEQUENCE_LEN) : sequenceMs;
    }

    if (pSeekWindowMs)
    {
        *pSeekWindowMs = (bAutoSeekSetting) ? (USE_AUTO_SEEKWINDOW_LEN) : seekWindowMs;
    }

    if (pOverlapMs)
    {
        *pOverlapMs = overlapMs;
    }
}

void TDStretch::overlapMono(SAMPLETYPE *pOutput, const SAMPLETYPE *pInput) const
{
    int i;
    SAMPLETYPE m1, m2;

    m1 = (SAMPLETYPE)0;
    m2 = (SAMPLETYPE)overlapLength;

    for (i = 0; i < overlapLength ; i ++)
    {
        pOutput[i] = (pInput[i] * m1 + pMidBuffer[i] * m2 ) / overlapLength;
        m1 += 1;
        m2 -= 1;
    }
}

void TDStretch::clearMidBuffer()
{
    memset(pMidBuffer, 0, channels * sizeof(SAMPLETYPE) * overlapLength);
}

void TDStretch::clearInput()
{
    inputBuffer.clear();
    clearMidBuffer();
    isBeginning = true;
    maxnorm = 0;
    maxnormf = 1e8;
    skipFract = 0;
}

void TDStretch::clear()
{
    outputBuffer.clear();
    clearInput();
}

void TDStretch::enableQuickSeek(bool enable)
{
    bQuickSeek = enable;
}

bool TDStretch::isQuickSeekEnabled() const
{
    return bQuickSeek;
}

int TDStretch::seekBestOverlapPosition(const SAMPLETYPE *refPos)
{
    if (bQuickSeek)
    {
        return seekBestOverlapPositionQuick(refPos);
    }
    else
    {
        return seekBestOverlapPositionFull(refPos);
    }
}

inline void TDStretch::overlap(SAMPLETYPE *pOutput, const SAMPLETYPE *pInput, uint ovlPos) const
{
#ifndef USE_MULTICH_ALWAYS
    if (channels == 1)
    {

        overlapMono(pOutput, pInput + ovlPos);
    }
    else if (channels == 2)
    {

        overlapStereo(pOutput, pInput + 2 * ovlPos);
    }
    else
#endif
    {
        assert(channels > 0);
        overlapMulti(pOutput, pInput + channels * ovlPos);
    }
}

int TDStretch::seekBestOverlapPositionFull(const SAMPLETYPE *refPos)
{
    int bestOffs;
    double bestCorr;
    int i;
    double norm;

    bestCorr = -FLT_MAX;
    bestOffs = 0;

    bestCorr = calcCrossCorr(refPos, pMidBuffer, norm);
    bestCorr = (bestCorr + 0.1) * 0.75;

    #pragma omp parallel for
    for (i = 1; i < seekLength; i ++)
    {
        double corr;

#if defined(_OPENMP) || defined(ST_SIMD_AVOID_UNALIGNED)

        corr = calcCrossCorr(refPos + channels * i, pMidBuffer, norm);
#else

        corr = calcCrossCorrAccumulate(refPos + channels * i, pMidBuffer, norm);
#endif

        double tmp = (double)(2 * i - seekLength) / (double)seekLength;
        corr = ((corr + 0.1) * (1.0 - 0.25 * tmp * tmp));

        if (corr > bestCorr)
        {

            #pragma omp critical
            if (corr > bestCorr)
            {
                bestCorr = corr;
                bestOffs = i;
            }
        }
    }

#ifdef SOUNDTOUCH_INTEGER_SAMPLES
    adaptNormalizer();
#endif

    clearCrossCorrState();

    return bestOffs;
}

int TDStretch::seekBestOverlapPositionQuick(const SAMPLETYPE *refPos)
{
#define _MIN(a, b)   (((a) < (b)) ? (a) : (b))
#define SCANSTEP    16
#define SCANWIND    8

    int bestOffs;
    int i;
    int bestOffs2;
    float bestCorr, corr;
    float bestCorr2;
    double norm;

    bestCorr =
    bestCorr2 = -FLT_MAX;
    bestOffs =
    bestOffs2 = SCANWIND;

    for (i = SCANSTEP; i < seekLength - SCANWIND - 1; i += SCANSTEP)
    {

        corr = (float)calcCrossCorr(refPos + channels*i, pMidBuffer, norm);

        float tmp = (float)(2 * i - seekLength - 1) / (float)seekLength;
        corr = ((corr + 0.1f) * (1.0f - 0.25f * tmp * tmp));

        if (corr > bestCorr)
        {

            bestCorr2 = bestCorr;
            bestOffs2 = bestOffs;
            bestCorr = corr;
            bestOffs = i;
        }
        else if (corr > bestCorr2)
        {

            bestCorr2 = corr;
            bestOffs2 = i;
        }
    }

    int end = _MIN(bestOffs + SCANWIND + 1, seekLength);
    for (i = bestOffs - SCANWIND; i < end; i++)
    {
        if (i == bestOffs) continue;

        corr = (float)calcCrossCorr(refPos + channels*i, pMidBuffer, norm);

        float tmp = (float)(2 * i - seekLength - 1) / (float)seekLength;
        corr = ((corr + 0.1f) * (1.0f - 0.25f * tmp * tmp));

        if (corr > bestCorr)
        {
            bestCorr = corr;
            bestOffs = i;
        }
    }

    end = _MIN(bestOffs2 + SCANWIND + 1, seekLength);
    for (i = bestOffs2 - SCANWIND; i < end; i++)
    {
        if (i == bestOffs2) continue;

        corr = (float)calcCrossCorr(refPos + channels*i, pMidBuffer, norm);

        float tmp = (float)(2 * i - seekLength - 1) / (float)seekLength;
        corr = ((corr + 0.1f) * (1.0f - 0.25f * tmp * tmp));

        if (corr > bestCorr)
        {
            bestCorr = corr;
            bestOffs = i;
        }
    }

    clearCrossCorrState();

#ifdef SOUNDTOUCH_INTEGER_SAMPLES
    adaptNormalizer();
#endif

    return bestOffs;
}

void TDStretch::adaptNormalizer()
{

    if ((maxnorm > 1000) || (maxnormf > 40000000))
    {

        maxnormf = 0.9f * maxnormf + 0.1f * (float)maxnorm;

        if ((maxnorm > 800000000) && (overlapDividerBitsNorm < 16))
        {

            overlapDividerBitsNorm++;
            if (maxnorm > 1600000000) overlapDividerBitsNorm++;
        }
        else if ((maxnormf < 1000000) && (overlapDividerBitsNorm > 0))
        {

            overlapDividerBitsNorm--;
        }
    }

    maxnorm = 0;
}

void TDStretch::clearCrossCorrState()
{

}

void TDStretch::calcSeqParameters()
{

    #define AUTOSEQ_TEMPO_LOW   0.5
    #define AUTOSEQ_TEMPO_TOP   2.0

    #define AUTOSEQ_AT_MIN      90.0
    #define AUTOSEQ_AT_MAX      40.0
    #define AUTOSEQ_K           ((AUTOSEQ_AT_MAX - AUTOSEQ_AT_MIN) / (AUTOSEQ_TEMPO_TOP - AUTOSEQ_TEMPO_LOW))
    #define AUTOSEQ_C           (AUTOSEQ_AT_MIN - (AUTOSEQ_K) * (AUTOSEQ_TEMPO_LOW))

    #define AUTOSEEK_AT_MIN     20.0
    #define AUTOSEEK_AT_MAX     15.0
    #define AUTOSEEK_K          ((AUTOSEEK_AT_MAX - AUTOSEEK_AT_MIN) / (AUTOSEQ_TEMPO_TOP - AUTOSEQ_TEMPO_LOW))
    #define AUTOSEEK_C          (AUTOSEEK_AT_MIN - (AUTOSEEK_K) * (AUTOSEQ_TEMPO_LOW))

    #define CHECK_LIMITS(x, mi, ma) (((x) < (mi)) ? (mi) : (((x) > (ma)) ? (ma) : (x)))

    double seq, seek;

    if (bAutoSeqSetting)
    {
        seq = AUTOSEQ_C + AUTOSEQ_K * tempo;
        seq = CHECK_LIMITS(seq, AUTOSEQ_AT_MAX, AUTOSEQ_AT_MIN);
        sequenceMs = (int)(seq + 0.5);
    }

    if (bAutoSeekSetting)
    {
        seek = AUTOSEEK_C + AUTOSEEK_K * tempo;
        seek = CHECK_LIMITS(seek, AUTOSEEK_AT_MAX, AUTOSEEK_AT_MIN);
        seekWindowMs = (int)(seek + 0.5);
    }

    seekWindowLength = (sampleRate * sequenceMs) / 1000;
    if (seekWindowLength < 2 * overlapLength)
    {
        seekWindowLength = 2 * overlapLength;
    }
    seekLength = (sampleRate * seekWindowMs) / 1000;
}

void TDStretch::setTempo(double newTempo)
{
    int intskip;

    tempo = newTempo;

    calcSeqParameters();

    nominalSkip = tempo * (seekWindowLength - overlapLength);
    intskip = (int)(nominalSkip + 0.5);

    sampleReq = max(intskip + overlapLength, seekWindowLength) + seekLength;
}

void TDStretch::setChannels(int numChannels)
{
    if (!verifyNumberOfChannels(numChannels) ||
        (channels == numChannels)) return;

    channels = numChannels;
    inputBuffer.setChannels(channels);
    outputBuffer.setChannels(channels);

    overlapLength=0;
    setParameters(sampleRate);
}

void TDStretch::processSamples()
{
    int ovlSkip;
    int offset = 0;
    int temp;

    while ((int)inputBuffer.numSamples() >= sampleReq)
    {
        if (isBeginning == false)
        {

            offset = seekBestOverlapPosition(inputBuffer.ptrBegin());

            overlap(outputBuffer.ptrEnd((uint)overlapLength), inputBuffer.ptrBegin(), (uint)offset);
            outputBuffer.putSamples((uint)overlapLength);
            offset += overlapLength;
        }
        else
        {

            isBeginning = false;
            int skip = (int)(tempo * overlapLength + 0.5 * seekLength + 0.5);

            #ifdef ST_SIMD_AVOID_UNALIGNED

            if (channels == 1)
            {
                skip &= -4;
            }
            else if (channels == 2)
            {
                skip &= -2;
            }
            #endif
            skipFract -= skip;
            if (skipFract <= -nominalSkip)
            {
                skipFract = -nominalSkip;
            }
        }

        if ((int)inputBuffer.numSamples() < (offset + seekWindowLength - overlapLength))
        {
            continue;
        }

        temp = (seekWindowLength - 2 * overlapLength);
        outputBuffer.putSamples(inputBuffer.ptrBegin() + channels * offset, (uint)temp);

        assert((offset + temp + overlapLength) <= (int)inputBuffer.numSamples());
        memcpy(pMidBuffer, inputBuffer.ptrBegin() + channels * (offset + temp),
            channels * sizeof(SAMPLETYPE) * overlapLength);

        skipFract += nominalSkip;
        ovlSkip = (int)skipFract;
        skipFract -= ovlSkip;
        inputBuffer.receiveSamples((uint)ovlSkip);
    }
}

void TDStretch::putSamples(const SAMPLETYPE *samples, uint nSamples)
{

    inputBuffer.putSamples(samples, nSamples);

    processSamples();
}

void TDStretch::acceptNewOverlapLength(int newOverlapLength)
{
    int prevOvl;

    assert(newOverlapLength >= 0);
    prevOvl = overlapLength;
    overlapLength = newOverlapLength;

    if (overlapLength > prevOvl)
    {
        delete[] pMidBufferUnaligned;

        pMidBufferUnaligned = new SAMPLETYPE[overlapLength * channels + 16 / sizeof(SAMPLETYPE)];

        pMidBuffer = (SAMPLETYPE *)SOUNDTOUCH_ALIGN_POINTER_16(pMidBufferUnaligned);

        clearMidBuffer();
    }
}

void * TDStretch::operator new(size_t)
{

    ST_THROW_RT_ERROR("Error in TDStretch::new: Don't use 'new TDStretch' directly, use 'newInstance' member instead!");
    return newInstance();
}

TDStretch * TDStretch::newInstance()
{
    uint uExtensions;

    uExtensions = detectCPUextensions();
    (void)uExtensions;

#ifdef SOUNDTOUCH_ALLOW_MMX

    if (uExtensions & SUPPORT_MMX)
    {
        return ::new TDStretchMMX;
    }
    else
#endif

#ifdef SOUNDTOUCH_ALLOW_SSE
    if (uExtensions & SUPPORT_SSE)
    {

        return ::new TDStretchSSE;
    }
    else
#endif

    {

        return ::new TDStretch;
    }
}

#ifdef SOUNDTOUCH_INTEGER_SAMPLES

void TDStretch::overlapStereo(short *poutput, const short *input) const
{
    int i;
    short temp;
    int cnt2;

    for (i = 0; i < overlapLength ; i ++)
    {
        temp = (short)(overlapLength - i);
        cnt2 = 2 * i;
        poutput[cnt2] = (input[cnt2] * i + pMidBuffer[cnt2] * temp )  / overlapLength;
        poutput[cnt2 + 1] = (input[cnt2 + 1] * i + pMidBuffer[cnt2 + 1] * temp ) / overlapLength;
    }
}

void TDStretch::overlapMulti(short *poutput, const short *input) const
{
    short m1;
    int i = 0;

    for (m1 = 0; m1 < overlapLength; m1 ++)
    {
        short m2 = (short)(overlapLength - m1);
        for (int c = 0; c < channels; c ++)
        {
            poutput[i] = (input[i] * m1 + pMidBuffer[i] * m2)  / overlapLength;
            i++;
        }
    }
}

static int _getClosest2Power(double value)
{
    return (int)(log(value) / log(2.0) + 0.5);
}

void TDStretch::calculateOverlapLength(int aoverlapMs)
{
    int newOvl;

    assert(aoverlapMs >= 0);

    overlapDividerBitsPure = _getClosest2Power((sampleRate * aoverlapMs) / 1000.0) - 1;
    if (overlapDividerBitsPure > 9) overlapDividerBitsPure = 9;
    if (overlapDividerBitsPure < 3) overlapDividerBitsPure = 3;
    newOvl = (int)pow(2.0, (int)overlapDividerBitsPure + 1);

    acceptNewOverlapLength(newOvl);

    overlapDividerBitsNorm = overlapDividerBitsPure;

    slopingDivider = (newOvl * newOvl - 1) / 3;
}

double TDStretch::calcCrossCorr(const short *mixingPos, const short *compare, double &norm)
{
    long corr;
    unsigned long lnorm;
    int i;

    #ifdef ST_SIMD_AVOID_UNALIGNED

        if (((ulongptr)mixingPos) & 15) return -1e50;
    #endif

    int ilength = (channels * overlapLength) & -8;

    corr = lnorm = 0;

    for (i = 0; i < ilength; i += 2)
    {
        corr += (mixingPos[i] * compare[i] +
                 mixingPos[i + 1] * compare[i + 1]) >> overlapDividerBitsNorm;
        lnorm += (mixingPos[i] * mixingPos[i] +
                  mixingPos[i + 1] * mixingPos[i + 1]) >> overlapDividerBitsNorm;

    }

    if (lnorm > maxnorm)
    {

        #pragma omp critical
        if (lnorm > maxnorm)
        {
            maxnorm = lnorm;
        }
    }

    norm = (double)lnorm;
    return (double)corr / sqrt((norm < 1e-9) ? 1.0 : norm);
}

double TDStretch::calcCrossCorrAccumulate(const short *mixingPos, const short *compare, double &norm)
{
    long corr;
    long lnorm;
    int i;

    int ilength = (channels * overlapLength) & -8;

    lnorm = 0;
    for (i = 1; i <= channels; i ++)
    {
        lnorm -= (mixingPos[-i] * mixingPos[-i]) >> overlapDividerBitsNorm;
    }

    corr = 0;

    for (i = 0; i < ilength; i += 2)
    {
        corr += (mixingPos[i] * compare[i] +
                 mixingPos[i + 1] * compare[i + 1]) >> overlapDividerBitsNorm;
    }

    for (int j = 0; j < channels; j ++)
    {
        i --;
        lnorm += (mixingPos[i] * mixingPos[i]) >> overlapDividerBitsNorm;
    }

    norm += (double)lnorm;
    if (norm > maxnorm)
    {
        maxnorm = (unsigned long)norm;
    }

    return (double)corr / sqrt((norm < 1e-9) ? 1.0 : norm);
}

#endif

#ifdef SOUNDTOUCH_FLOAT_SAMPLES

void TDStretch::overlapStereo(float *pOutput, const float *pInput) const
{
    int i;
    float fScale;
    float f1;
    float f2;

    fScale = 1.0f / (float)overlapLength;

    f1 = 0;
    f2 = 1.0f;

    for (i = 0; i < 2 * (int)overlapLength ; i += 2)
    {
        pOutput[i + 0] = pInput[i + 0] * f1 + pMidBuffer[i + 0] * f2;
        pOutput[i + 1] = pInput[i + 1] * f1 + pMidBuffer[i + 1] * f2;

        f1 += fScale;
        f2 -= fScale;
    }
}

void TDStretch::overlapMulti(float *pOutput, const float *pInput) const
{
    int i;
    float fScale;
    float f1;
    float f2;

    fScale = 1.0f / (float)overlapLength;

    f1 = 0;
    f2 = 1.0f;

    i=0;
    for (int i2 = 0; i2 < overlapLength; i2 ++)
    {

        for (int c = 0; c < channels; c ++)
        {
            pOutput[i] = pInput[i] * f1 + pMidBuffer[i] * f2;
            i++;
        }
        f1 += fScale;
        f2 -= fScale;
    }
}

void TDStretch::calculateOverlapLength(int overlapInMsec)
{
    int newOvl;

    assert(overlapInMsec >= 0);
    newOvl = (sampleRate * overlapInMsec) / 1000;
    if (newOvl < 16) newOvl = 16;

    newOvl -= newOvl % 8;

    acceptNewOverlapLength(newOvl);
}

double TDStretch::calcCrossCorr(const float *mixingPos, const float *compare, double &anorm)
{
    float corr;
    float norm;
    int i;

    #ifdef ST_SIMD_AVOID_UNALIGNED

        if (((ulongptr)mixingPos) & 15) return -1e50;
    #endif

    int ilength = (channels * overlapLength) & -8;

    corr = norm = 0;

    for (i = 0; i < ilength; i ++)
    {
        corr += mixingPos[i] * compare[i];
        norm += mixingPos[i] * mixingPos[i];
    }

    anorm = norm;
    return corr / sqrt((norm < 1e-9 ? 1.0 : norm));
}

double TDStretch::calcCrossCorrAccumulate(const float *mixingPos, const float *compare, double &norm)
{
    float corr;
    int i;

    corr = 0;

    for (i = 1; i <= channels; i ++)
    {
        norm -= mixingPos[-i] * mixingPos[-i];
    }

    int ilength = (channels * overlapLength) & -8;

    for (i = 0; i < ilength; i ++)
    {
        corr += mixingPos[i] * compare[i];
    }

    for (int j = 0; j < channels; j ++)
    {
        i --;
        norm += mixingPos[i] * mixingPos[i];
    }

    return corr / sqrt((norm < 1e-9 ? 1.0 : norm));
}

#endif
