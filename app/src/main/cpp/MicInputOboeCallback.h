#ifndef MELONDS_MICINPUTOBOECALLBACK_H
#define MELONDS_MICINPUTOBOECALLBACK_H

#include <oboe/Oboe.h>
#include <atomic>
#include <mutex>
#include "types.h"

class MicInputOboeCallback : public oboe::AudioStreamCallback {
public:
    static std::atomic<bool> agcEnabled;
    static std::atomic<float> noiseGateThreshold;

    melonDS::s16* buffer;
    int bufferSize;
    int bufferOffset = 0;
    int bufferCount = 0;

    MicInputOboeCallback(int bufferSize, std::mutex& micBufferMutex, int gain = 1, std::ostream* recordingStream = nullptr);
    ~MicInputOboeCallback();
    void setGain(int gain);
    oboe::DataCallbackResult onAudioReady(oboe::AudioStream *stream, void *audioData, int32_t numFrames) override;

private:
    std::mutex& micBufferMutex;
    std::atomic<int> gain{1};
    std::ostream* _recordingStream;

    float prevX = 0.0f;
    float prevHp = 0.0f;
    float envelope = 0.0f;
    float currentGain = 1.0f;
};

#endif //MELONDS_MICINPUTOBOECALLBACK_H
