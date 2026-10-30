#ifndef MELONDS_ANDROID_MICINPUTOBOECALLBACK_H
#define MELONDS_ANDROID_MICINPUTOBOECALLBACK_H

#include <oboe/Oboe.h>
#include <atomic>
#include "types.h"

using namespace melonDS;

class MicInputOboeCallback : public oboe::AudioStreamCallback {

public:
    static std::atomic<bool> agcEnabled;

    s16* buffer;
    int bufferSize;
    int bufferOffset = 0;
    int bufferCount = 0;
    float micSampleFrac = 0;

    MicInputOboeCallback(int bufferSize, std::mutex& micBufferMutex) : MicInputOboeCallback(bufferSize, micBufferMutex, nullptr) { };
    MicInputOboeCallback(int bufferSize, std::mutex& micBufferMutex, std::ostream* recordingStream);
    ~MicInputOboeCallback();
    oboe::DataCallbackResult onAudioReady(oboe::AudioStream *stream, void *audioData, int32_t numFrames) override;

private:
    std::mutex& micBufferMutex;
    std::ostream* _recordingStream;

    float prevX = 0.0f;
    float prevHp = 0.0f;
    float envelope = 0.0f;
    float currentGain = 1.0f;
};

#endif //MELONDS_ANDROID_MICINPUTOBOECALLBACK_H
