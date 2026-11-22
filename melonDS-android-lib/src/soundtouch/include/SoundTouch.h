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

#ifndef SoundTouch_H
#define SoundTouch_H

#include "FIFOSamplePipe.h"
#include "STTypes.h"

namespace soundtouch
{

#define SOUNDTOUCH_VERSION          "2.4.1"

#define SOUNDTOUCH_VERSION_ID       (20401)

#define SETTING_USE_AA_FILTER       0

#define SETTING_AA_FILTER_LENGTH    1

#define SETTING_USE_QUICKSEEK       2

#define SETTING_SEQUENCE_MS         3

#define SETTING_SEEKWINDOW_MS       4

#define SETTING_OVERLAP_MS          5

#define SETTING_NOMINAL_INPUT_SEQUENCE      6

#define SETTING_NOMINAL_OUTPUT_SEQUENCE     7

#define SETTING_INITIAL_LATENCY             8

class SoundTouch : public FIFOProcessor
{
private:

    class RateTransposer *pRateTransposer;

    class TDStretch *pTDStretch;

    double virtualRate;

    double virtualTempo;

    double virtualPitch;

    bool  bSrateSet;

    double samplesExpectedOut;

    long   samplesOutput;

    void calcEffectiveRateAndTempo();

protected :

    uint  channels;

    double rate;

    double tempo;

public:
    SoundTouch();
    virtual ~SoundTouch() override;

    static const char *getVersionString();

    static uint getVersionId();

    void setRate(double newRate);

    void setTempo(double newTempo);

    void setRateChange(double newRate);

    void setTempoChange(double newTempo);

    void setPitch(double newPitch);

    void setPitchOctaves(double newPitch);

    void setPitchSemiTones(int newPitch);
    void setPitchSemiTones(double newPitch);

    void setChannels(uint numChannels);

    void setSampleRate(uint srate);

    double getInputOutputSampleRatio();

    void flush();

    virtual void putSamples(
            const SAMPLETYPE *samples,
            uint numSamples

            ) override;

    virtual uint receiveSamples(SAMPLETYPE *output,
        uint maxSamples
        ) override;

    virtual uint receiveSamples(uint maxSamples
        ) override;

    virtual void clear() override;

    bool setSetting(int settingId,
                    int value
                    );

    int getSetting(int settingId
                   ) const;

    virtual uint numUnprocessedSamples() const;

    uint numChannels() const
    {
        return channels;
    }

};

}
#endif
