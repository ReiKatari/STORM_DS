#ifndef MELONDS_OBOECALLBACK_H
#define MELONDS_OBOECALLBACK_H

#include "AudioOutputCapture.h"
#include "MelonInstance.h"

#include <oboe/Oboe.h>
#include <atomic>
#include <cstdint>
#include <memory>

class OboeCallback : public oboe::AudioStreamCallback {
private:
    int _volume;
    void (*onErrorCallback)(oboe::AudioStream*, std::uint64_t);
    std::uint64_t streamGeneration;
    std::shared_ptr<MelonDSAndroid::AudioOutputCapture> audioOutputCapture;

    float bassFilterStateL = 0.0f;
    float bassFilterStateR = 0.0f;
    float reverbBufferL[1024]{};
    float reverbBufferR[1024]{};
    int reverbHead = 0;

    static inline melonDS::s16 applySoftLimit(melonDS::s32 sample, bool softLimiter);

public:
    std::weak_ptr<MelonDSAndroid::MelonInstance> activeInstance;

    std::atomic<bool> softLimiterEnabled{true};
    std::atomic<bool> bassBoostEnabled{false};
    std::atomic<int> bassBoostStrength{5};
    std::atomic<bool> spatialAudioEnabled{false};
    std::atomic<bool> reverbEnabled{false};

    OboeCallback(
        int volume,
        void (*onErrorCallback)(oboe::AudioStream*, std::uint64_t),
        std::uint64_t streamGeneration,
        std::shared_ptr<MelonDSAndroid::AudioOutputCapture> audioOutputCapture
    );
    oboe::DataCallbackResult onAudioReady(oboe::AudioStream *stream, void *audioData, int32_t numFrames) override;
    void onErrorAfterClose(oboe::AudioStream* stream, oboe::Result result) override;
};

#endif //MELONDS_OBOECALLBACK_H
