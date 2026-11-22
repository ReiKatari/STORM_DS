#ifndef MELONDS_AUDIOOUTPUTCAPTURE_H
#define MELONDS_AUDIOOUTPUTCAPTURE_H

#include "AudioOutputTelemetry.h"
#include "AudioOutputProvenance.h"

#include <atomic>
#include <cstddef>
#include <cstdint>
#include <mutex>
#include <string>
#include <vector>

namespace MelonDSAndroid
{

class AudioOutputCapture final : public melonDS::AudioOutputObservationSink
{
public:
    static constexpr std::uint32_t SampleRate = 48000;
    static constexpr std::uint32_t ChannelCount = 2;
    static constexpr std::uint32_t BitsPerSample = 16;
    static constexpr std::uint32_t MaxDurationMs = 60000;
    static constexpr std::size_t MaxCallbackRecords = 131072;
    static constexpr std::size_t MaxProducerPacketRecords = 32768;
    static constexpr std::uint64_t SourceLeadAllowanceFrames =
        static_cast<std::uint64_t>(SampleRate) * 2u;

    AudioOutputCapture() = default;

    std::string start(
        std::uint32_t durationMs,
        std::uint64_t minimumStreamGeneration = 0);
    bool tryBeginCallback(std::uint64_t streamGeneration = 0) noexcept;
    void appendAndEndCallback(
        const std::int16_t* interleavedPcm,
        std::int32_t requestedFrames,
        std::int32_t readFrames,
        std::uint64_t streamGeneration,
        std::int32_t volume,
        bool hasActiveInstance,
        std::int64_t callbackStartNs,
        std::int64_t pcmReadyNs,
        const AudioOutputAdaptiveSnapshot& before,
        const AudioOutputAdaptiveSnapshot& after,
        const AudioOutputControllerSnapshot& controller,
        const melonDS::AudioOutputDrainObservation& drain,
        std::int32_t xrunCount
    ) noexcept;
    void OnAudioOutputProducerPacket(
        const std::int16_t* interleavedPcm,
        std::uint32_t frames,
        const melonDS::AudioOutputProducerPacketObservation& observation
    ) noexcept override;
    void finishForSessionEnd();
    std::string dumpToDirectory(const std::string& finalDirectory);

private:
    struct CallbackRecord
    {
        std::uint64_t callbackIndex = 0;
        std::uint64_t pcmFrameOffset = 0;
        std::uint64_t streamGeneration = 0;
        std::int64_t callbackStartNs = 0;
        std::int64_t pcmReadyNs = 0;
        std::int32_t requestedFrames = 0;
        std::int32_t capturedFrames = 0;
        std::int32_t readFrames = 0;
        std::int32_t volume = 0;
        std::uint32_t hasActiveInstance = 0;

        std::int32_t xrunCount = -1;
        AudioOutputAdaptiveSnapshot before {};
        AudioOutputAdaptiveSnapshot after {};
        AudioOutputControllerSnapshot controller {};
        melonDS::AudioOutputDrainObservation drain {};
    };

    struct ProducerPacketRecord
    {
        std::uint64_t capturePacketIndex = 0;
        std::uint64_t sourcePcmFrameOffset = 0;
        std::uint32_t capturedSourceFrames = 0;
        melonDS::AudioOutputProducerPacketObservation observation {};
    };

    enum State : std::uint32_t
    {
        Idle = 0,
        Preparing = 1,
        Capturing = 2,
        Stopping = 3,
        Complete = 4,
        Consuming = 5,
    };

    enum TerminalReason : std::uint32_t
    {
        NoTerminalReason = 0,
        ManualDump = 1,
        CapacityReached = 2,
        SessionEnded = 3,
    };

    static constexpr std::uint32_t AdmissionClosed = 0x80000000u;
    static constexpr std::uint32_t AdmissionWriterMask = ~AdmissionClosed;
    static constexpr std::uint32_t OverlapCountMask = 0x0000ffffu;
    static constexpr std::uint32_t OverlapEpochMask = 0xffff0000u;

    bool waitForWriterToExit() const;
    std::string buildResultJson(
        bool success,
        const char* operation,
        const std::string& detail,
        const std::string& outputDirectory = {},
        const char* stateOverride = nullptr
    ) const;

    mutable std::mutex controlMutex;
    std::atomic<std::uint32_t> state {Idle};

    std::atomic<std::uint32_t> admission {AdmissionClosed};

    std::atomic<std::uint32_t> producerAdmission {AdmissionClosed};

    std::atomic<std::uint32_t> overlapWord {0};
    std::atomic<std::uint32_t> staleSessionSkipped {0};
    std::atomic<std::uint32_t> staleStreamSkipped {0};
    std::atomic<std::uint32_t> staleProducerSkipped {0};
    std::atomic<std::uint32_t> captureEpoch {0};

    std::vector<std::int16_t> pcm;
    std::vector<CallbackRecord> records;
    std::vector<std::int16_t> sourcePcm;
    std::vector<ProducerPacketRecord> producerRecords;
    std::uint64_t sessionId = 0;
    std::uint64_t minimumStreamGeneration = 0;
    std::uint64_t targetFrames = 0;
    std::uint64_t writtenFrames = 0;
    std::uint64_t callbackCount = 0;
    std::uint64_t storedRecordCount = 0;
    std::uint64_t sourceCapacityFrames = 0;
    std::uint64_t sourceWrittenFrames = 0;
    std::uint64_t sourceOfferedFrames = 0;
    std::uint64_t sourceTruncatedFrames = 0;
    std::uint64_t producerPacketCount = 0;
    std::uint64_t storedProducerRecordCount = 0;
    std::uint64_t drainInactiveZeroFrames = 0;
    std::uint64_t drainPrimingZeroFrames = 0;
    std::uint64_t drainRealRampInFrames = 0;
    std::uint64_t drainRealUnmodifiedFrames = 0;
    std::uint64_t drainUnderrunRampOutFrames = 0;
    std::uint64_t drainUnderrunZeroFrames = 0;
    std::uint64_t drainUnclassifiedFrames = 0;
    std::uint32_t durationMs = 0;
    TerminalReason terminalReason = NoTerminalReason;
    std::int64_t armedAtNs = 0;
    std::int64_t completedAtNs = 0;
};

static_assert(std::atomic<std::uint32_t>::is_always_lock_free,
              "audio capture admission must be lock-free");

}

#endif
