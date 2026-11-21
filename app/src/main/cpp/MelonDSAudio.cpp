#include "MelonDSAudio.h"
#include "MicInputOboeCallback.h"
#include "mic_blow.h"
#include "OboeCallback.h"
#include <atomic>
#include <oboe/Oboe.h>

#define MIC_BUFFER_SIZE 8192

std::mutex activeInstanceMutex;
std::weak_ptr<MelonDSAndroid::MelonInstance> activeInstance;

std::mutex audioStreamMutex;
std::shared_ptr<oboe::AudioStream> audioStream;
std::shared_ptr<OboeCallback> outputCallback;
std::shared_ptr<oboe::StabilizedCallback> stabilizedOutputCallback;

std::shared_ptr<oboe::AudioStream> micInputStream;
std::shared_ptr<MicInputOboeCallback> micInputCallback;

MelonDSAndroid::AudioSettings currentAudioSettings;
std::mutex micBufferMutex;
std::atomic<int> actualMicSource{0};
std::atomic<bool> isMicInputEnabled{true};
std::atomic<bool> isMicOn{false};
int micBufferReadPos = 0;

namespace MelonDSAndroid
{
    // AUDIO OUTPUT

    void resetAudioOutputStream();

    static int getAudioBufferSizeInFrames(int audioLatency)
    {
        switch (audioLatency) {
            case 0:
                return 512;
            case 1:
                return 1024;
            case 2:
                return 2048;
            default:
                return 1024;
        }
    }

    static void applyOutputDspSettings(const std::shared_ptr<OboeCallback>& callback, const AudioSettings& settings)
    {
        if (!callback)
            return;

        __atomic_store_n(&callback->softLimiterEnabled, settings.softLimiterEnabled, __ATOMIC_RELAXED);
        __atomic_store_n(&callback->bassBoostEnabled, settings.bassBoostEnabled, __ATOMIC_RELAXED);
        __atomic_store_n(&callback->bassBoostStrength, settings.bassBoostStrength, __ATOMIC_RELAXED);
        __atomic_store_n(&callback->spatialAudioEnabled, settings.spatialAudioEnabled, __ATOMIC_RELAXED);
        __atomic_store_n(&callback->reverbEnabled, settings.reverbEnabled, __ATOMIC_RELAXED);
    }

    static void setupAudioOutputStreamLocked(int audioLatency, int volume)
    {
        oboe::PerformanceMode performanceMode;
        switch (audioLatency) {
            case 0:
                performanceMode = oboe::PerformanceMode::LowLatency;
                break;
            case 1:
                performanceMode = oboe::PerformanceMode::None;
                break;
            case 2:
                performanceMode = oboe::PerformanceMode::PowerSaving;
                break;
            default:
                performanceMode = oboe::PerformanceMode::None;
        }

        outputCallback = std::make_shared<OboeCallback>(volume, resetAudioOutputStream);
        applyOutputDspSettings(outputCallback, currentAudioSettings);

        stabilizedOutputCallback = std::make_shared<oboe::StabilizedCallback>(outputCallback.get());

        {
            std::lock_guard<std::mutex> instanceLock(activeInstanceMutex);
            outputCallback->setActiveInstance(activeInstance);
        }

        oboe::AudioStreamBuilder streamBuilder;
        streamBuilder.setChannelCount(2);
        streamBuilder.setSampleRate(48000);
        streamBuilder.setFormat(oboe::AudioFormat::I16);
        streamBuilder.setFormatConversionAllowed(true);
        streamBuilder.setDirection(oboe::Direction::Output);
        streamBuilder.setPerformanceMode(performanceMode);
        streamBuilder.setUsage(oboe::Usage::Media);
        streamBuilder.setDataCallback(stabilizedOutputCallback);
        streamBuilder.setErrorCallback(stabilizedOutputCallback);

        oboe::Result result = oboe::Result::ErrorInternal;
        if (performanceMode == oboe::PerformanceMode::LowLatency) {
            streamBuilder.setSharingMode(oboe::SharingMode::Exclusive);
            result = streamBuilder.openStream(audioStream);
        }
        if (result != oboe::Result::OK || !audioStream) {
            streamBuilder.setSharingMode(oboe::SharingMode::Shared);
            result = streamBuilder.openStream(audioStream);
        }
        if (result != oboe::Result::OK || !audioStream) {
            Log(Error, "Failed to init audio stream");
            outputCallback = nullptr;
            stabilizedOutputCallback = nullptr;
            audioStream = nullptr;
            return;
        }

        audioStream->setPerformanceHintEnabled(true);
        audioStream->setBufferSizeInFrames(std::min(
                audioStream->getBufferCapacityInFrames(),
                getAudioBufferSizeInFrames(audioLatency)));
    }

    static void cleanupAudioOutputStreamLocked()
    {
        if (audioStream) {
            if (audioStream->getState() < oboe::StreamState::Closing) {
                audioStream->requestStop();
                audioStream->close();
            }

            audioStream = nullptr;
            outputCallback = nullptr;
            stabilizedOutputCallback = nullptr;
        }
    }

    void resetAudioOutputStream()
    {
        std::lock_guard<std::mutex> streamLock(audioStreamMutex);
        {
            std::lock_guard<std::mutex> instanceLock(activeInstanceMutex);
            if (activeInstance.expired())
                return;
        }

        cleanupAudioOutputStreamLocked();
        if (currentAudioSettings.soundEnabled && currentAudioSettings.volume > 0) {
            setupAudioOutputStreamLocked(currentAudioSettings.audioLatency, currentAudioSettings.volume);
            if (audioStream) {
                audioStream->requestStart();
            }
        }
    }

    // MICROPHONE

    static void setupMicInputStreamLocked()
    {
        std::shared_ptr<MicInputOboeCallback> callback = std::make_shared<MicInputOboeCallback>(MIC_BUFFER_SIZE, micBufferMutex);
        {
            std::lock_guard<std::mutex> lock(micBufferMutex);
            micInputCallback = callback;
            micBufferReadPos = 0;
        }

        oboe::AudioStreamBuilder micStreamBuilder;
        micStreamBuilder.setChannelCount(1);
        micStreamBuilder.setFramesPerCallback(1024);
        micStreamBuilder.setSampleRate(48000);
        micStreamBuilder.setFormat(oboe::AudioFormat::I16);
        micStreamBuilder.setFormatConversionAllowed(true);
        micStreamBuilder.setDirection(oboe::Direction::Input);
        micStreamBuilder.setInputPreset(oboe::InputPreset::VoiceRecognition);
        micStreamBuilder.setPerformanceMode(oboe::PerformanceMode::None);
        micStreamBuilder.setSharingMode(oboe::SharingMode::Exclusive);
        micStreamBuilder.setUsage(oboe::Usage::Game);
        micStreamBuilder.setDataCallback(callback);

        oboe::Result micResult = micStreamBuilder.openStream(micInputStream);
        if (micResult != oboe::Result::OK)
        {
            actualMicSource.store(1, std::memory_order_relaxed);
            Log(Error, "Failed to init mic audio stream");
            micInputStream = nullptr;
            std::lock_guard<std::mutex> lock(micBufferMutex);
            micInputCallback = nullptr;
        }
    }

    static void cleanupMicInputStreamLocked()
    {
        if (micInputStream)
        {
            micInputStream->requestStop();
            micInputStream->close();
            micInputStream = nullptr;
        }

        std::lock_guard<std::mutex> lock(micBufferMutex);
        micInputCallback = nullptr;
        micBufferReadPos = 0;
    }

    static void startMicStreamIfAllowedLocked()
    {
        if (actualMicSource.load(std::memory_order_relaxed) == 2 &&
            micInputStream &&
            isMicInputEnabled.load(std::memory_order_relaxed) &&
            isMicOn.load(std::memory_order_relaxed))
        {
            const auto micState = micInputStream->getState();
            if (micState != oboe::StreamState::Started && micState != oboe::StreamState::Starting)
                micInputStream->requestStart();
        }
    }

    void userEnableMic()
    {
        std::lock_guard<std::mutex> streamLock(audioStreamMutex);
        isMicInputEnabled.store(true, std::memory_order_relaxed);
        startMicStreamIfAllowedLocked();
    }

    void userDisableMic()
    {
        std::lock_guard<std::mutex> streamLock(audioStreamMutex);
        isMicInputEnabled.store(false, std::memory_order_relaxed);
        if (micInputStream)
            micInputStream->requestStop();
    }

    void enableMic()
    {
        std::lock_guard<std::mutex> streamLock(audioStreamMutex);
        isMicOn.store(true, std::memory_order_relaxed);
        startMicStreamIfAllowedLocked();
    }

    void disableMic()
    {
        std::lock_guard<std::mutex> streamLock(audioStreamMutex);
        isMicOn.store(false, std::memory_order_relaxed);
        if (micInputStream)
            micInputStream->requestStop();
    }

    int readMic(s16* data, int maxlength)
    {
        int micSource = actualMicSource.load(std::memory_order_relaxed);
        if (!isMicInputEnabled.load(std::memory_order_relaxed))
        {
            micSource = 0;
        }

        if (micSource == 0)
        {
            memset(data, 0, maxlength * sizeof(s16));
            return maxlength;
        }

        int micBufferLength;
        s16* micBuffer;
        std::unique_lock<std::mutex> micLock(micBufferMutex, std::defer_lock);

        if (micSource == 2)
        {
            micLock.lock();
            if (!micInputCallback)
            {
                micLock.unlock();
                memset(data, 0, maxlength * sizeof(s16));
                return maxlength;
            }
            micBufferLength = MIC_BUFFER_SIZE / sizeof(s16);
            micBuffer = micInputCallback->buffer;
        }
        else
        {
            micBufferLength = sizeof(mic_blow) / sizeof(s16);
            micBuffer = (s16*) &mic_blow[0];
        }

        int readlength = 0;
        while (readlength < maxlength)
        {
            int thislen = maxlength - readlength;
            if ((micBufferReadPos + thislen) > micBufferLength)
                thislen = micBufferLength - micBufferReadPos;

            if (micSource == 2)
            {
                if (thislen > micInputCallback->bufferCount)
                    thislen = micInputCallback->bufferCount;

                micInputCallback->bufferCount -= thislen;
            }

            if (!thislen)
                break;

            memcpy(data, &micBuffer[micBufferReadPos], thislen * sizeof(s16));
            data += thislen;
            micBufferReadPos += thislen;
            if (micBufferReadPos >= micBufferLength)
                micBufferReadPos -= micBufferLength;

            readlength += thislen;
        }

        return readlength;
    }

    // GENERAL

    void setupAudio(AudioSettings audioSettings)
    {
        std::lock_guard<std::mutex> streamLock(audioStreamMutex);
        isMicOn.store(false, std::memory_order_relaxed);
        actualMicSource.store(audioSettings.micSource, std::memory_order_relaxed);
        currentAudioSettings = audioSettings;

        if (audioSettings.soundEnabled)
            setupAudioOutputStreamLocked(audioSettings.audioLatency, audioSettings.volume);

        if (audioSettings.micSource == 2)
            setupMicInputStreamLocked();
    }

    void updateAudioSettings(AudioSettings audioSettings)
    {
        std::lock_guard<std::mutex> streamLock(audioStreamMutex);
        applyOutputDspSettings(outputCallback, audioSettings);

        const int previousLatency = currentAudioSettings.audioLatency;
        const int previousVolume = currentAudioSettings.volume;
        currentAudioSettings = audioSettings;

        if (audioSettings.soundEnabled && audioSettings.volume > 0) {
            if (!audioStream) {
                setupAudioOutputStreamLocked(audioSettings.audioLatency, audioSettings.volume);
            } else if (previousLatency != audioSettings.audioLatency || previousVolume != audioSettings.volume) {
                // Recreate audio stream with new settings
                cleanupAudioOutputStreamLocked();
                setupAudioOutputStreamLocked(audioSettings.audioLatency, audioSettings.volume);
            }
        } else if (audioStream) {
            cleanupAudioOutputStreamLocked();
        }

        int oldMicSource = actualMicSource.load(std::memory_order_relaxed);
        actualMicSource.store(audioSettings.micSource, std::memory_order_relaxed);

        if (oldMicSource == 2 && audioSettings.micSource != 2) {
            // No longer using device mic. Destroy stream
            cleanupMicInputStreamLocked();
        } else if (oldMicSource != 2 && audioSettings.micSource == 2) {
            // Now using device mic. Setup stream
            setupMicInputStreamLocked();
        }
    }

    void setAudioActiveInstance(std::shared_ptr<MelonInstance> instance)
    {
        std::lock_guard<std::mutex> streamLock(audioStreamMutex);
        {
            std::lock_guard<std::mutex> instanceLock(activeInstanceMutex);
            activeInstance = instance;
        }
        if (outputCallback)
            outputCallback->setActiveInstance(instance);
    }

    void cleanupAudio()
    {
        {
            std::lock_guard<std::mutex> instanceLock(activeInstanceMutex);
            activeInstance.reset();
        }
        std::shared_ptr<oboe::AudioStream> streamToClose;
        std::shared_ptr<oboe::AudioStream> micToClose;
        {
            std::lock_guard<std::mutex> streamLock(audioStreamMutex);
            streamToClose = std::move(audioStream);
            audioStream = nullptr;
            outputCallback = nullptr;
            stabilizedOutputCallback = nullptr;

            micToClose = std::move(micInputStream);
            micInputStream = nullptr;
            std::lock_guard<std::mutex> micLock(micBufferMutex);
            micInputCallback = nullptr;
            micBufferReadPos = 0;
        }
        if (streamToClose && streamToClose->getState() < oboe::StreamState::Closing) {
            streamToClose->requestStop();
            streamToClose->close();
        }
        if (micToClose && micToClose->getState() < oboe::StreamState::Closing) {
            micToClose->requestStop();
            micToClose->close();
        }
    }

    void startAudio()
    {
        std::lock_guard<std::mutex> streamLock(audioStreamMutex);
        if (audioStream)
        {
            const auto outState = audioStream->getState();
            if (outState != oboe::StreamState::Started && outState != oboe::StreamState::Starting)
                audioStream->requestStart();
        }

        startMicStreamIfAllowedLocked();
    }

    void pauseAudio()
    {
        std::lock_guard<std::mutex> streamLock(audioStreamMutex);
        if (audioStream)
            audioStream->requestPause();

        if (micInputStream)
            micInputStream->requestStop();
    }
}
