#include <algorithm>
#include <cmath>
#include "MicInputOboeCallback.h"

using namespace melonDS;

std::atomic<bool> MicInputOboeCallback::agcEnabled{true};
std::atomic<float> MicInputOboeCallback::noiseGateThreshold{350.0f};

MicInputOboeCallback::MicInputOboeCallback(int bufferSize, std::mutex& micBufferMutex, int gain, std::ostream* recordingStream)
    : bufferSize(bufferSize), micBufferMutex(micBufferMutex), gain(std::clamp(gain, 1, 10)), _recordingStream(recordingStream) {
    this->buffer = new s16[bufferSize];
}

void MicInputOboeCallback::setGain(int newGain) {
    this->gain.store(std::clamp(newGain, 1, 10), std::memory_order_relaxed);
}

oboe::DataCallbackResult MicInputOboeCallback::onAudioReady(oboe::AudioStream *stream, void *audioData, int32_t numFrames) {
    if (numFrames <= 0 || audioData == nullptr)
        return oboe::DataCallbackResult::Continue;

    s16* input = static_cast<s16*>(audioData);
    std::lock_guard<std::mutex> lock(micBufferMutex);
    int maxlen = bufferSize;
    int outlen = static_cast<int>(std::round((numFrames * 44100.0) / 48000.0));

    if ((bufferCount + outlen) > maxlen)
    {
        outlen = maxlen - bufferCount;
    }

    if (outlen <= 0)
        return oboe::DataCallbackResult::Continue;

    float res_incr = numFrames / static_cast<float>(outlen);
    float res_timer = -0.5f;
    int res_pos = 0;

    const int userGain = gain.load(std::memory_order_relaxed);
    const bool useAgc = agcEnabled.load(std::memory_order_relaxed);
    const float gateThreshold = std::clamp(noiseGateThreshold.load(std::memory_order_relaxed), 0.0f, 1600.0f);

    for (int i = 0; i < outlen; i++)
    {
        int idx1 = std::clamp(res_pos, 0, numFrames - 1);
        int idx2 = std::min(idx1 + 1, numFrames - 1);
        s16 s1 = input[idx1];
        s16 s2 = input[idx2];

        const float interpFrac = std::max(0.0f, res_timer);
        float s = static_cast<float>(s1) + ((s2 - s1) * interpFrac);

        if (useAgc)
        {
            float hp = s - prevX + 0.992f * prevHp;
            prevX = s;
            prevHp = hp;

            float absSample = std::abs(hp);
            if (absSample > envelope)
                envelope = envelope * 0.90f + absSample * 0.10f;
            else
                envelope = envelope * 0.998f + absSample * 0.002f;

            float gate = 1.0f;
            if (gateThreshold > 1.0f && envelope < gateThreshold)
            {
                const float kneeFloor = gateThreshold * 0.28f;
                gate = std::clamp((envelope - kneeFloor) / std::max(gateThreshold - kneeFloor, 1.0f), 0.0f, 1.0f);
            }

            float targetGain = (envelope > 120.0f) ? (22000.0f / envelope) : 1.0f;
            targetGain = std::clamp(targetGain, 0.5f, 16.0f);
            currentGain = currentGain * 0.995f + targetGain * 0.005f;

            float gainBoost = 1.0f + (static_cast<float>(userGain - 1) * 0.15f);
            float processed = hp * currentGain * gate * gainBoost;

            constexpr float LIMIT_THRESHOLD = 28000.0f;
            if (processed > LIMIT_THRESHOLD)
                processed = LIMIT_THRESHOLD + (32767.0f - LIMIT_THRESHOLD) * std::tanh((processed - LIMIT_THRESHOLD) / (32767.0f - LIMIT_THRESHOLD));
            else if (processed < -LIMIT_THRESHOLD)
                processed = -LIMIT_THRESHOLD + (-32768.0f - (-LIMIT_THRESHOLD)) * std::tanh((-processed - LIMIT_THRESHOLD) / (32768.0f - LIMIT_THRESHOLD));

            buffer[bufferOffset] = static_cast<s16>(std::clamp<float>(std::round(processed), -32768.0f, 32767.0f));
        }
        else
        {
            const float manualScale = static_cast<float>(userGain);
            buffer[bufferOffset] = static_cast<s16>(std::clamp<double>(static_cast<double>(std::round(s)) * manualScale, -32768.0, 32767.0));
        }

        bufferOffset++;
        if (bufferOffset >= maxlen)
            bufferOffset = 0;

        res_timer += res_incr;
        while (res_timer >= 1.0f)
        {
            res_timer -= 1.0f;
            res_pos++;
        }
    }

    (void)_recordingStream;
    bufferCount += outlen;
    return oboe::DataCallbackResult::Continue;
}

MicInputOboeCallback::~MicInputOboeCallback() {
    delete[] buffer;
}
