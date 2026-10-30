#include "MicInputOboeCallback.h"
#include "types.h"
#include <algorithm>
#include <cmath>

#define MIC_GAIN 10

std::atomic<bool> MicInputOboeCallback::agcEnabled{true};

MicInputOboeCallback::MicInputOboeCallback(int bufferSize, std::mutex& micBufferMutex, std::ostream* recordingStream) : bufferSize(bufferSize), micBufferMutex(micBufferMutex), _recordingStream(recordingStream) {
    this->buffer = new s16[bufferSize];
}

oboe::DataCallbackResult
MicInputOboeCallback::onAudioReady(oboe::AudioStream *stream, void *audioData, int32_t numFrames) {
    s16* input = (s16*) audioData;

    float f_len_out = (numFrames * 47743.4659091 * (60.0/60.0)) / (float)stream->getSampleRate();
    f_len_out += micSampleFrac;
    int len_out = (int)floor(f_len_out);
    micSampleFrac = f_len_out - len_out;

    std::unique_lock bufferLock(micBufferMutex);
    int maxlen = bufferSize / sizeof(s16);
    int outlen = len_out;

    // alter output length slightly to keep the buffer happy
    if (bufferCount < (maxlen >> 2))
        outlen += 6;
    else if (bufferCount > (3 * (maxlen >> 2)))
        outlen -= 6;

    float res_incr = numFrames / (float)outlen;
    float res_timer = -0.5;
    int res_pos = 0;

    int startBufferOffset = bufferOffset;
    for (int i = 0; i < outlen; i++)
    {
        if (bufferCount >= maxlen)
            break;

        s16 s1 = input[res_pos];
        s16 s2 = input[res_pos + 1];

        float s = (float)s1 + ((s2 - s1) * res_timer);

        if (agcEnabled.load(std::memory_order_relaxed))
        {
            // 1st order High Pass Filter (DC offset & low rumble removal)
            float x = s;
            float hp = x - prevX + 0.992f * prevHp;
            prevX = x;
            prevHp = hp;

            // Smooth envelope detector
            float absSample = std::abs(hp);
            if (absSample > envelope)
            {
                envelope = envelope * 0.90f + absSample * 0.10f;
            }
            else
            {
                envelope = envelope * 0.998f + absSample * 0.002f;
            }

            // Noise gate: suppress ambient room noise below threshold
            constexpr float NOISE_GATE_THRESHOLD = 350.0f;
            float gate = 1.0f;
            if (envelope < NOISE_GATE_THRESHOLD)
            {
                gate = std::max(0.0f, (envelope - 100.0f) / (NOISE_GATE_THRESHOLD - 100.0f));
            }

            // Adaptive Gain Control (AGC): normalize voice & blow towards ~22000
            float targetGain = (envelope > 120.0f) ? (22000.0f / envelope) : 1.0f;
            targetGain = std::clamp(targetGain, 0.5f, 16.0f);
            currentGain = currentGain * 0.995f + targetGain * 0.005f;

            float processed = hp * currentGain * gate;

            // Soft limiter to prevent digital clipping when exceeding ~28000
            constexpr float LIMIT_THRESHOLD = 28000.0f;
            if (processed > LIMIT_THRESHOLD)
            {
                processed = LIMIT_THRESHOLD + (32767.0f - LIMIT_THRESHOLD) * std::tanh((processed - LIMIT_THRESHOLD) / (32767.0f - LIMIT_THRESHOLD));
            }
            else if (processed < -LIMIT_THRESHOLD)
            {
                processed = -LIMIT_THRESHOLD + (-32768.0f - (-LIMIT_THRESHOLD)) * std::tanh((-processed - LIMIT_THRESHOLD) / (32768.0f - LIMIT_THRESHOLD));
            }

            buffer[bufferOffset] = static_cast<s16>(std::clamp<float>(std::round(processed), -32768.0f, 32767.0f));
        }
        else
        {
            buffer[bufferOffset] = static_cast<s16>(std::clamp<double>(static_cast<double>(std::round(s)) * MIC_GAIN, -32768.0, 32767.0));
        }

        bufferOffset++;
        if (bufferOffset >= maxlen)
            bufferOffset = 0;

        bufferCount++;

        res_timer += res_incr;
        while (res_timer >= 1.0)
        {
            res_timer -= 1.0;
            res_pos++;
        }
    }

    if (_recordingStream)
    {
        if (bufferOffset > startBufferOffset)
        {
            int writeLen = outlen > maxlen ? maxlen : outlen;
            _recordingStream->write((char*)&buffer[startBufferOffset], writeLen * sizeof(s16));
        }
        else
        {
            _recordingStream->write((char*)&buffer[startBufferOffset], (maxlen - startBufferOffset) * sizeof(s16));
            _recordingStream->write((char*)buffer, bufferOffset * sizeof(s16));
        }
    }

    return oboe::DataCallbackResult::Continue;
}

MicInputOboeCallback::~MicInputOboeCallback() {
    delete[] this->buffer;
}
