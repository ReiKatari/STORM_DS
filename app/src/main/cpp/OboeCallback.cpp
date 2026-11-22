#include "OboeCallback.h"
#include "MelonDS.h"
#include "types.h"
#include <algorithm>
#include <chrono>
#include <cmath>
#include <utility>

using namespace melonDS;

OboeCallback::OboeCallback(
    int volume,
    void (*onErrorCallback)(oboe::AudioStream*, std::uint64_t),
    std::uint64_t streamGeneration,
    std::shared_ptr<MelonDSAndroid::AudioOutputCapture> capture
) : _volume(std::clamp(volume, 0, 256)),
    onErrorCallback(onErrorCallback),
    streamGeneration(streamGeneration),
    audioOutputCapture(std::move(capture)) {
}

oboe::DataCallbackResult
OboeCallback::onAudioReady(oboe::AudioStream *stream, void *audioData, int32_t numFrames) {
    if (audioData == nullptr || numFrames <= 0)
        return oboe::DataCallbackResult::Continue;

    const bool captureRequested =
        audioOutputCapture && audioOutputCapture->tryBeginCallback(streamGeneration);
    const auto callbackStartNs = captureRequested
        ? std::chrono::duration_cast<std::chrono::nanoseconds>(
              std::chrono::steady_clock::now().time_since_epoch()).count()
        : 0;
    auto currentInstance = activeInstance.lock();
    MelonDSAndroid::AudioOutputAdaptiveSnapshot before {};
    MelonDSAndroid::AudioOutputAdaptiveSnapshot after {};
    MelonDSAndroid::AudioOutputControllerSnapshot controller {};
    melonDS::AudioOutputDrainObservation drain {};
    int readFrames = 0;

    if (!currentInstance)
    {
        std::fill_n(static_cast<s16*>(audioData), numFrames * 2, 0);
        drain.valid = true;
        drain.requestedFrames = static_cast<std::uint32_t>(numFrames);
        drain.returnedFrames = static_cast<std::uint32_t>(numFrames);
        drain.inactiveZeroFrames = static_cast<std::uint32_t>(numFrames);
    }
    else
    {
        if (captureRequested)
            before = currentInstance->getAudioOutputAdaptiveSnapshot();
        readFrames = currentInstance->readAudioOutputAdaptivo(
            (s16*) audioData, numFrames, captureRequested ? &drain : nullptr);
        if (captureRequested)
        {
            after = currentInstance->getAudioOutputAdaptiveSnapshot();
            controller = currentInstance->getAudioOutputControllerSnapshot();
        }
    }

    if (MelonDSAndroid::isRewindActive() ||
        (MelonDSAndroid::isFastForwardActive() && MelonDSAndroid::isMuteOnFastForward()))
    {
        std::fill_n(static_cast<s16*>(audioData), numFrames * 2, 0);
    }
    else if (currentInstance)
    {
        const bool useSoftLimit = softLimiterEnabled.load(std::memory_order_relaxed);
        const bool useBassBoost = bassBoostEnabled.load(std::memory_order_relaxed);
        const int bassStrength = bassBoostStrength.load(std::memory_order_relaxed);
        const bool useSpatialAudio = spatialAudioEnabled.load(std::memory_order_relaxed);
        const bool useReverb = reverbEnabled.load(std::memory_order_relaxed);
        const bool needsDsp = (_volume < 256) || useSoftLimit || useBassBoost || useSpatialAudio || useReverb;

        if (needsDsp)
        {
            s16* samples = static_cast<s16*>(audioData);
            for (int i = 0; i < numFrames; ++i)
            {
                s32 sampleL = static_cast<s32>(samples[i * 2]);
                s32 sampleR = static_cast<s32>(samples[i * 2 + 1]);

                if (_volume != 256)
                {
                    sampleL = (sampleL * _volume) >> 8;
                    sampleR = (sampleR * _volume) >> 8;
                }

                if (useBassBoost)
                {
                    constexpr float alpha = 0.08f;
                    bassFilterStateL += alpha * (static_cast<float>(sampleL) - bassFilterStateL);
                    bassFilterStateR += alpha * (static_cast<float>(sampleR) - bassFilterStateR);
                    const float boostFactor = static_cast<float>(bassStrength) * 0.25f;
                    sampleL += static_cast<s32>(bassFilterStateL * boostFactor);
                    sampleR += static_cast<s32>(bassFilterStateR * boostFactor);
                }

                if (useSpatialAudio)
                {
                    const s32 mid = (sampleL + sampleR) / 2;
                    const s32 side = ((sampleL - sampleR) / 2 * 14) / 10;
                    sampleL = mid + side;
                    sampleR = mid - side;
                }

                if (useReverb)
                {
                    const int delayTap = (reverbHead - 800 + 1024) % 1024;
                    const float delayedL = reverbBufferL[delayTap];
                    const float delayedR = reverbBufferR[delayTap];
                    reverbBufferL[reverbHead] = static_cast<float>(sampleL) + delayedL * 0.35f;
                    reverbBufferR[reverbHead] = static_cast<float>(sampleR) + delayedR * 0.35f;
                    reverbHead = (reverbHead + 1) % 1024;
                    sampleL += static_cast<s32>(delayedL * 0.25f);
                    sampleR += static_cast<s32>(delayedR * 0.25f);
                }

                samples[i * 2] = applySoftLimit(sampleL, useSoftLimit);
                samples[i * 2 + 1] = applySoftLimit(sampleR, useSoftLimit);
            }
        }
    }

    if (captureRequested) [[unlikely]]
    {
        const auto pcmReadyNs = std::chrono::duration_cast<std::chrono::nanoseconds>(
            std::chrono::steady_clock::now().time_since_epoch()).count();

        const oboe::ResultWithValue<int32_t> xruns = stream->getXRunCount();
        const std::int32_t xrunCount = xruns ? xruns.value() : -1;
        audioOutputCapture->appendAndEndCallback(
            static_cast<const std::int16_t*>(audioData),
            numFrames,
            readFrames,
            streamGeneration,
            _volume,
            currentInstance != nullptr,
            callbackStartNs,
            pcmReadyNs,
            before,
            after,
            controller,
            drain,
            xrunCount);
    }

    return oboe::DataCallbackResult::Continue;
}

inline melonDS::s16 OboeCallback::applySoftLimit(melonDS::s32 sample, bool softLimiter)
{
    if (!softLimiter)
        return static_cast<melonDS::s16>(std::clamp<melonDS::s32>(sample, -32768, 32767));
    if (sample > 24576) {
        float x = static_cast<float>(sample - 24576) / 8191.0f;
        float y = x / (1.0f + x);
        melonDS::s32 out = static_cast<melonDS::s32>(24576.0f + y * 8191.0f);
        return static_cast<melonDS::s16>(std::clamp<melonDS::s32>(out, -32768, 32767));
    } else if (sample < -24576) {
        float x = static_cast<float>(-sample - 24576) / 8192.0f;
        float y = x / (1.0f + x);
        melonDS::s32 out = static_cast<melonDS::s32>(-24576.0f - y * 8192.0f);
        return static_cast<melonDS::s16>(std::clamp<melonDS::s32>(out, -32768, 32767));
    }
    return static_cast<melonDS::s16>(std::clamp<melonDS::s32>(sample, -32768, 32767));
}

void OboeCallback::onErrorAfterClose(oboe::AudioStream* stream, oboe::Result result)
{
    if (result == oboe::Result::ErrorDisconnected && onErrorCallback != nullptr) {
        onErrorCallback(stream, streamGeneration);
    }
}
