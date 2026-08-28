#ifndef MELONDS_OBOECALLBACK_H
#define MELONDS_OBOECALLBACK_H

#include <oboe/Oboe.h>
#include <fstream>
#include "MelonInstance.h"

class OboeCallback : public oboe::AudioStreamCallback {
private:
    int _volume;
    void (*onErrorCallback)(void);
    std::ostream* _recordingStream;
    float audioSampleFrac;

public:
    std::weak_ptr<MelonDSAndroid::MelonInstance> activeInstance;

    bool softLimiterEnabled = true;
    bool bassBoostEnabled = false;
    int bassBoostStrength = 5;
    bool spatialAudioEnabled = false;
    bool reverbEnabled = false;

private:
    float bassFilterStateL = 0.0f;
    float bassFilterStateR = 0.0f;
    float reverbBufferL[1024] = {0.0f};
    float reverbBufferR[1024] = {0.0f};
    int reverbHead = 0;

public:
    OboeCallback(int volume, void (*onErrorCallback)(void)) : OboeCallback(volume, onErrorCallback, nullptr) { };
    OboeCallback(int volume, void (*onErrorCallback)(void), std::ostream* recordingStream);
    oboe::DataCallbackResult onAudioReady(oboe::AudioStream *stream, void *audioData, int32_t numFrames) override;
    void onErrorAfterClose(oboe::AudioStream* stream, oboe::Result result) override;
    
private:
    int getNumSamplesOut(int len);
    inline melonDS::s16 applySoftLimit(melonDS::s32 sample);
};


#endif //MELONDS_OBOECALLBACK_H
