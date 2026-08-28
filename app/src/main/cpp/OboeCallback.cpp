#include "OboeCallback.h"
#include "types.h"
#include "Platform.h"
#include "SPU.h"
#include "MelonDS.h"

using namespace melonDS;

#define INTERNAL_FRAME_RATE 59.8260982880808f

OboeCallback::OboeCallback(int volume, void (*onErrorCallback)(void), std::ostream* recordingStream) : _volume(volume), onErrorCallback(onErrorCallback), _recordingStream(recordingStream) {
    audioSampleFrac = 0;
}

oboe::DataCallbackResult
OboeCallback::onAudioReady(oboe::AudioStream *stream, void *audioData, int32_t numFrames) {
    auto currentInstance = activeInstance.lock();

    if (!currentInstance || MelonDSAndroid::isFastForwardActive() || MelonDSAndroid::isRewindActive())
    {
        if (currentInstance)
        {
            s16 dummy[4096];
            int framesToRead = std::min<int>(numFrames, 2048);
            if (framesToRead > 0)
                currentInstance->readAudioOutput(dummy, framesToRead);
        }
        memset(audioData, 0, numFrames * sizeof(s16) * 2);
        return oboe::DataCallbackResult::Continue;
    }

    int len = numFrames;

    double skew = std::clamp(60.0 / INTERNAL_FRAME_RATE, 0.985, 1.015);
    currentInstance->setAudioOutputSkew(skew);

    int len_in = getNumSamplesOut(len);
    if (len_in > numFrames) len_in = numFrames;

    int num_in = currentInstance->readAudioOutput((s16*) audioData, len_in);

    if (num_in < 1)
    {
        memset(audioData, 0, len * sizeof(s16) * 2);
        return oboe::DataCallbackResult::Continue;
    }

    if (num_in < len_in)
    {
        s16* samples = (s16*) audioData;
        s16 lastL = samples[(num_in - 1) * 2];
        s16 lastR = samples[(num_in - 1) * 2 + 1];
        s16 prevL = num_in > 1 ? samples[(num_in - 2) * 2] : lastL;
        s16 prevR = num_in > 1 ? samples[(num_in - 2) * 2 + 1] : lastR;
        s16 diffL = (lastL - prevL) / 2;
        s16 diffR = (lastR - prevR) / 2;
        int missingFrames = len_in - num_in;
        for (int i = 0; i < missingFrames; i++)
        {
            float decay = 1.0f - (float)(i + 1) / (float)(missingFrames + 32);
            samples[(num_in + i) * 2] = (s16)((lastL + diffL * (i % 2 == 0 ? 1 : -1)) * decay);
            samples[(num_in + i) * 2 + 1] = (s16)((lastR + diffR * (i % 2 == 0 ? 1 : -1)) * decay);
        }
    }

    // DSP Audio Processing Pipeline (Soft Limiter, Bass Boost, 3D Spatial, Reverb)
    s16* samples = (s16*) audioData;
    for (int i = 0; i < len_in; i++)
    {
        s32 sampleL = (s32)samples[i * 2];
        s32 sampleR = (s32)samples[i * 2 + 1];

        if (_volume < 256)
        {
            sampleL = (sampleL * _volume) >> 8;
            sampleR = (sampleR * _volume) >> 8;
        }

        // 1. Dynamic Bass Boost
        if (bassBoostEnabled)
        {
            float alpha = 0.08f;
            bassFilterStateL += alpha * ((float)sampleL - bassFilterStateL);
            bassFilterStateR += alpha * ((float)sampleR - bassFilterStateR);
            float boostFactor = (float)bassBoostStrength * 0.25f;
            sampleL += (s32)(bassFilterStateL * boostFactor);
            sampleR += (s32)(bassFilterStateR * boostFactor);
        }

        // 2. 3D Spatial Stereo Width Expansion
        if (spatialAudioEnabled)
        {
            s32 mid = (sampleL + sampleR) / 2;
            s32 side = (sampleL - sampleR) / 2;
            side = (side * 14) / 10;
            sampleL = mid + side;
            sampleR = mid - side;
        }

        // 3. Acoustic Room Reverb
        if (reverbEnabled)
        {
            int delayTap = (reverbHead - 800 + 1024) % 1024;
            float delayedL = reverbBufferL[delayTap];
            float delayedR = reverbBufferR[delayTap];
            reverbBufferL[reverbHead] = (float)sampleL + delayedL * 0.35f;
            reverbBufferR[reverbHead] = (float)sampleR + delayedR * 0.35f;
            reverbHead = (reverbHead + 1) % 1024;
            sampleL += (s32)(delayedL * 0.25f);
            sampleR += (s32)(delayedR * 0.25f);
        }

        // 4. Soft-Clipping Peak Limiter
        samples[i * 2] = applySoftLimit(sampleL);
        samples[i * 2 + 1] = applySoftLimit(sampleR);
    }

    if (_recordingStream) [[unlikely]]
        _recordingStream->write((char*) audioData, numFrames * sizeof(s16) * 2);

    return oboe::DataCallbackResult::Continue;
}

inline melonDS::s16 OboeCallback::applySoftLimit(melonDS::s32 sample)
{
    if (!softLimiterEnabled) {
        return (s16)std::clamp<s32>(sample, -32768, 32767);
    }
    if (sample > 24576) {
        float x = (float)(sample - 24576) / 8191.0f;
        float y = x / (1.0f + x * 0.8f);
        return (s16)(24576.0f + y * 8191.0f);
    } else if (sample < -24576) {
        float x = (float)(-sample - 24576) / 8192.0f;
        float y = x / (1.0f + x * 0.8f);
        return (s16)(-24576.0f - y * 8192.0f);
    }
    return (s16)sample;
}

void OboeCallback::onErrorAfterClose(oboe::AudioStream* stream, oboe::Result result)
{
    if (result == oboe::Result::ErrorDisconnected && onErrorCallback != nullptr) {
        onErrorCallback();
    }
}

int OboeCallback::getNumSamplesOut(int len)
{
    // TODO: adjust to game speed
    float f_len_in = len /* * (curFPS/60.0)*/;
    f_len_in += audioSampleFrac;
    int len_in = (int) floor(f_len_in);
    audioSampleFrac = f_len_in - len_in;

    return len_in;
}