#include "AudioOutputCapture.h"

#include <algorithm>
#include <cerrno>
#include <chrono>
#include <cstdio>
#include <cstring>
#include <fcntl.h>
#include <fstream>
#include <iomanip>
#include <limits>
#include <sstream>
#include <sys/stat.h>
#if defined(__APPLE__)
#include <stdio.h>
#elif defined(__linux__) || defined(__ANDROID__)
#include <sys/syscall.h>
#endif
#include <thread>
#include <unistd.h>

namespace MelonDSAndroid
{
namespace
{

std::int64_t monotonicNanoseconds()
{
    return std::chrono::duration_cast<std::chrono::nanoseconds>(
        std::chrono::steady_clock::now().time_since_epoch()).count();
}

std::string jsonEscape(const std::string& value)
{
    std::ostringstream stream;
    for (const unsigned char c : value)
    {
        switch (c)
        {
        case '\\': stream << "\\\\"; break;
        case '"': stream << "\\\""; break;
        case '\n': stream << "\\n"; break;
        case '\r': stream << "\\r"; break;
        case '\t': stream << "\\t"; break;
        default:
            if (c < 0x20)
            {
                stream << "\\u" << std::hex << std::setw(4)
                       << std::setfill('0') << static_cast<unsigned int>(c)
                       << std::dec;
            }
            else
            {
                stream << static_cast<char>(c);
            }
        }
    }
    return stream.str();
}

std::string buildStateOnlyResult(
    const char* operation,
    const char* detail,
    const char* stateName
)
{
    std::ostringstream stream;
    stream << "{\"success\":0,\"operation\":\"" << jsonEscape(operation)
           << "\",\"detail\":\"" << jsonEscape(detail)
           << "\",\"state\":\"" << jsonEscape(stateName) << "\"}";
    return stream.str();
}

const char* terminalReasonName(std::uint32_t reason)
{
    switch (reason)
    {
    case 1: return "manual_dump";
    case 2: return "capacity_reached";
    case 3: return "session_ended";
    default: return "none";
    }
}

void writeLe16(std::ostream& stream, std::uint16_t value)
{
    const char bytes[2] = {
        static_cast<char>(value & 0xffu),
        static_cast<char>((value >> 8u) & 0xffu),
    };
    stream.write(bytes, sizeof(bytes));
}

void writeLe32(std::ostream& stream, std::uint32_t value)
{
    const char bytes[4] = {
        static_cast<char>(value & 0xffu),
        static_cast<char>((value >> 8u) & 0xffu),
        static_cast<char>((value >> 16u) & 0xffu),
        static_cast<char>((value >> 24u) & 0xffu),
    };
    stream.write(bytes, sizeof(bytes));
}

bool fsyncPath(const std::string& path)
{
    const int fd = open(path.c_str(), O_RDONLY | O_CLOEXEC);
    if (fd < 0)
        return false;
    const bool succeeded = fsync(fd) == 0;
    close(fd);
    return succeeded;
}

bool renameDirectoryNoReplace(const std::string& source, const std::string& destination)
{
#if defined(__APPLE__)
    return renamex_np(source.c_str(), destination.c_str(), RENAME_EXCL) == 0;
#elif defined(__linux__) || defined(__ANDROID__)
#if defined(SYS_renameat2)
    return syscall(
        SYS_renameat2,
        AT_FDCWD, source.c_str(),
        AT_FDCWD, destination.c_str(),
        1u                       ) == 0;
#elif defined(__NR_renameat2)
    return syscall(
        __NR_renameat2,
        AT_FDCWD, source.c_str(),
        AT_FDCWD, destination.c_str(),
        1u                       ) == 0;
#else
    errno = ENOTSUP;
    return false;
#endif
#else
    struct stat existing {};
    if (stat(destination.c_str(), &existing) == 0)
    {
        errno = EEXIST;
        return false;
    }
    return rename(source.c_str(), destination.c_str()) == 0;
#endif
}

std::string parentDirectoryOf(const std::string& path)
{
    const std::size_t separator = path.find_last_of('/');
    if (separator == std::string::npos)
        return ".";
    if (separator == 0)
        return "/";
    return path.substr(0, separator);
}

}

std::string AudioOutputCapture::start(
    std::uint32_t requestedDurationMs,
    std::uint64_t requestedMinimumStreamGeneration)
{
    std::lock_guard<std::mutex> lock(controlMutex);

    std::uint32_t expected = Idle;
    if (!state.compare_exchange_strong(
            expected, Preparing,
            std::memory_order_acq_rel,
            std::memory_order_acquire))
    {
        return buildStateOnlyResult("start", "capture_not_idle", "busy");
    }

    if (requestedDurationMs == 0 || requestedDurationMs > MaxDurationMs)
    {
        state.store(Idle, std::memory_order_release);
        return buildResultJson(false, "start", "duration_out_of_range");
    }

    const std::uint64_t requestedFrames =
        (static_cast<std::uint64_t>(requestedDurationMs) * SampleRate + 999u) / 1000u;
    const std::uint64_t requestedSourceCapacity =
        requestedFrames + SourceLeadAllowanceFrames;
    if (requestedFrames == 0 ||
        requestedFrames > std::numeric_limits<std::size_t>::max() / ChannelCount ||
        requestedSourceCapacity < requestedFrames ||
        requestedSourceCapacity >
            std::numeric_limits<std::size_t>::max() / ChannelCount)
    {
        state.store(Idle, std::memory_order_release);
        return buildResultJson(false, "start", "capture_size_overflow");
    }

    admission.store(AdmissionClosed, std::memory_order_relaxed);
    producerAdmission.store(AdmissionClosed, std::memory_order_relaxed);
    try
    {
        pcm.assign(static_cast<std::size_t>(requestedFrames * ChannelCount), 0);
        records.assign(
            static_cast<std::size_t>(std::min<std::uint64_t>(
                requestedFrames, MaxCallbackRecords)),
            CallbackRecord {});
        sourcePcm.assign(
            static_cast<std::size_t>(requestedSourceCapacity * ChannelCount), 0);
        producerRecords.assign(
            static_cast<std::size_t>(std::max<std::uint64_t>(
                1u,
                std::min<std::uint64_t>(
                    requestedDurationMs, MaxProducerPacketRecords))),
            ProducerPacketRecord {});
    }
    catch (...)
    {
        pcm.clear();
        records.clear();
        sourcePcm.clear();
        producerRecords.clear();
        state.store(Idle, std::memory_order_release);
        return buildResultJson(false, "start", "allocation_failed");
    }

    ++sessionId;
    minimumStreamGeneration = requestedMinimumStreamGeneration;
    targetFrames = requestedFrames;
    writtenFrames = 0;
    callbackCount = 0;
    storedRecordCount = 0;
    sourceCapacityFrames = requestedSourceCapacity;
    sourceWrittenFrames = 0;
    sourceOfferedFrames = 0;
    sourceTruncatedFrames = 0;
    producerPacketCount = 0;
    storedProducerRecordCount = 0;
    drainInactiveZeroFrames = 0;
    drainPrimingZeroFrames = 0;
    drainRealRampInFrames = 0;
    drainRealUnmodifiedFrames = 0;
    drainUnderrunRampOutFrames = 0;
    drainUnderrunZeroFrames = 0;
    drainUnclassifiedFrames = 0;
    durationMs = requestedDurationMs;
    terminalReason = NoTerminalReason;
    armedAtNs = monotonicNanoseconds();
    completedAtNs = 0;
    staleSessionSkipped.store(0, std::memory_order_relaxed);
    staleStreamSkipped.store(0, std::memory_order_relaxed);
    staleProducerSkipped.store(0, std::memory_order_relaxed);

    std::uint32_t nextEpoch = captureEpoch.load(std::memory_order_relaxed) + 1u;
    if (nextEpoch == 0)
        nextEpoch = 1;
    captureEpoch.store(nextEpoch, std::memory_order_release);
    overlapWord.store((nextEpoch << 16u) & OverlapEpochMask,
                      std::memory_order_relaxed);

    std::string result;
    try
    {
        result = buildResultJson(true, "start", "armed", {}, "capturing");
    }
    catch (...)
    {
        admission.store(AdmissionClosed, std::memory_order_release);
        producerAdmission.store(AdmissionClosed, std::memory_order_release);
        std::vector<std::int16_t>().swap(pcm);
        std::vector<CallbackRecord>().swap(records);
        std::vector<std::int16_t>().swap(sourcePcm);
        std::vector<ProducerPacketRecord>().swap(producerRecords);
        state.store(Idle, std::memory_order_release);
        throw;
    }
    admission.store(0, std::memory_order_release);
    producerAdmission.store(0, std::memory_order_release);
    state.store(Capturing, std::memory_order_release);
    return result;
}

bool AudioOutputCapture::tryBeginCallback(std::uint64_t streamGeneration) noexcept
{

    const std::uint32_t observedEpoch = captureEpoch.load(std::memory_order_acquire);
    if (state.load(std::memory_order_acquire) != Capturing)
        return false;

    std::uint32_t expectedAdmission = 0;
    if (admission.compare_exchange_strong(
            expectedAdmission, 1,
            std::memory_order_acquire,
            std::memory_order_relaxed))
    {

        if (state.load(std::memory_order_acquire) != Capturing ||
            captureEpoch.load(std::memory_order_acquire) != observedEpoch)
        {
            staleSessionSkipped.fetch_add(1, std::memory_order_relaxed);
            admission.fetch_sub(1, std::memory_order_release);
            return false;
        }
        if (streamGeneration < minimumStreamGeneration)
        {
            staleStreamSkipped.fetch_add(1, std::memory_order_relaxed);
            admission.fetch_sub(1, std::memory_order_release);
            return false;
        }
        return true;
    }
    if ((expectedAdmission & AdmissionClosed) == 0)
    {
        const std::uint32_t expectedOverlapEpoch =
            (observedEpoch << 16u) & OverlapEpochMask;
        std::uint32_t currentOverlap = overlapWord.load(std::memory_order_relaxed);
        while ((currentOverlap & OverlapEpochMask) == expectedOverlapEpoch &&
               (currentOverlap & OverlapCountMask) != OverlapCountMask)
        {
            if (overlapWord.compare_exchange_weak(
                    currentOverlap, currentOverlap + 1u,
                    std::memory_order_relaxed,
                    std::memory_order_relaxed))
            {
                break;
            }
        }
    }
    return false;
}

void AudioOutputCapture::appendAndEndCallback(
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
) noexcept
{
    const bool validPcm = interleavedPcm != nullptr && requestedFrames > 0;
    const std::uint64_t remaining = targetFrames - writtenFrames;
    const std::uint64_t framesToCopy = validPcm
        ? std::min<std::uint64_t>(
              remaining, static_cast<std::uint32_t>(requestedFrames))
        : 0;
    const std::uint64_t frameOffset = writtenFrames;

    if (framesToCopy > 0)
    {
        std::memcpy(
            pcm.data() + frameOffset * ChannelCount,
            interleavedPcm,
            static_cast<std::size_t>(framesToCopy * ChannelCount * sizeof(std::int16_t)));
        writtenFrames += framesToCopy;
    }

    const std::uint64_t callbackIndex = callbackCount++;
    drainInactiveZeroFrames += drain.inactiveZeroFrames;
    drainPrimingZeroFrames += drain.primingZeroFrames;
    drainRealRampInFrames += drain.realRampInFrames;
    drainRealUnmodifiedFrames += drain.realUnmodifiedFrames;
    drainUnderrunRampOutFrames += drain.underrunRampOutFrames;
    drainUnderrunZeroFrames += drain.underrunZeroFrames;
    drainUnclassifiedFrames += drain.valid
        ? drain.unclassifiedFrames
        : static_cast<std::uint64_t>(std::max(0, requestedFrames));
    if (validPcm && storedRecordCount < records.size())
    {
        CallbackRecord& record = records[static_cast<std::size_t>(storedRecordCount++)];
        record.callbackIndex = callbackIndex;
        record.pcmFrameOffset = frameOffset;
        record.streamGeneration = streamGeneration;
        record.callbackStartNs = callbackStartNs;
        record.pcmReadyNs = pcmReadyNs;
        record.requestedFrames = requestedFrames;
        record.capturedFrames = static_cast<std::int32_t>(framesToCopy);
        record.readFrames = readFrames;
        record.volume = volume;
        record.hasActiveInstance = hasActiveInstance ? 1u : 0u;
        record.xrunCount = xrunCount;
        record.before = before;
        record.after = after;
        record.controller = controller;
        record.drain = drain;
    }

    if (validPcm && writtenFrames >= targetFrames)
    {
        admission.fetch_or(AdmissionClosed, std::memory_order_acq_rel);
        producerAdmission.fetch_or(AdmissionClosed, std::memory_order_acq_rel);
        std::uint32_t expectedState = Capturing;
        if (state.compare_exchange_strong(
                expectedState, Stopping,
                std::memory_order_acq_rel,
                std::memory_order_acquire))
        {
            terminalReason = CapacityReached;
            completedAtNs = pcmReadyNs;
        }
    }

    admission.fetch_sub(1, std::memory_order_release);
}

void AudioOutputCapture::OnAudioOutputProducerPacket(
    const std::int16_t* interleavedPcm,
    std::uint32_t frames,
    const melonDS::AudioOutputProducerPacketObservation& observation
) noexcept
{
    const std::uint32_t observedEpoch =
        captureEpoch.load(std::memory_order_acquire);
    if (state.load(std::memory_order_acquire) != Capturing)
        return;

    std::uint32_t expectedAdmission = 0;
    if (!producerAdmission.compare_exchange_strong(
            expectedAdmission, 1,
            std::memory_order_acquire,
            std::memory_order_relaxed))
    {
        if ((expectedAdmission & AdmissionClosed) == 0)
            staleProducerSkipped.fetch_add(1, std::memory_order_relaxed);
        return;
    }

    if (state.load(std::memory_order_acquire) != Capturing ||
        captureEpoch.load(std::memory_order_acquire) != observedEpoch)
    {
        staleProducerSkipped.fetch_add(1, std::memory_order_relaxed);
        producerAdmission.fetch_sub(1, std::memory_order_release);
        return;
    }

    const bool validPcm = interleavedPcm != nullptr && frames > 0;
    const std::uint64_t remaining =
        sourceCapacityFrames - sourceWrittenFrames;
    const std::uint64_t framesToCopy = validPcm
        ? std::min<std::uint64_t>(remaining, frames) : 0;
    const std::uint64_t sourceOffset = sourceWrittenFrames;
    sourceOfferedFrames += frames;
    sourceTruncatedFrames += static_cast<std::uint64_t>(frames) - framesToCopy;

    if (framesToCopy > 0)
    {
        std::memcpy(
            sourcePcm.data() + sourceOffset * ChannelCount,
            interleavedPcm,
            static_cast<std::size_t>(
                framesToCopy * ChannelCount * sizeof(std::int16_t)));
        sourceWrittenFrames += framesToCopy;
    }

    const std::uint64_t capturePacketIndex = producerPacketCount++;
    if (storedProducerRecordCount < producerRecords.size())
    {
        ProducerPacketRecord& record = producerRecords[
            static_cast<std::size_t>(storedProducerRecordCount++)];
        record.capturePacketIndex = capturePacketIndex;
        record.sourcePcmFrameOffset = sourceOffset;
        record.capturedSourceFrames = static_cast<std::uint32_t>(framesToCopy);
        record.observation = observation;
    }

    producerAdmission.fetch_sub(1, std::memory_order_release);
}

bool AudioOutputCapture::waitForWriterToExit() const
{
    const auto deadline = std::chrono::steady_clock::now() + std::chrono::seconds(2);
    while ((admission.load(std::memory_order_acquire) & AdmissionWriterMask) != 0 ||
           (producerAdmission.load(std::memory_order_acquire) &
            AdmissionWriterMask) != 0)
    {
        if (std::chrono::steady_clock::now() >= deadline)
            return false;
        std::this_thread::sleep_for(std::chrono::milliseconds(1));
    }
    return true;
}

void AudioOutputCapture::finishForSessionEnd()
{
    std::lock_guard<std::mutex> lock(controlMutex);
    std::uint32_t currentState = state.load(std::memory_order_acquire);
    if (currentState != Capturing && currentState != Stopping)
        return;

    admission.fetch_or(AdmissionClosed, std::memory_order_acq_rel);
    producerAdmission.fetch_or(AdmissionClosed, std::memory_order_acq_rel);
    if (currentState == Capturing)
    {
        std::uint32_t expected = Capturing;
        if (state.compare_exchange_strong(
                expected, Stopping,
                std::memory_order_acq_rel,
                std::memory_order_acquire))
        {
            terminalReason = SessionEnded;
        }
    }
    if (!waitForWriterToExit())
        return;
    if (state.load(std::memory_order_acquire) == Stopping)
    {
        if (completedAtNs == 0)
            completedAtNs = monotonicNanoseconds();
        state.store(Complete, std::memory_order_release);
    }
}

std::string AudioOutputCapture::dumpToDirectory(const std::string& finalDirectory)
{
    std::lock_guard<std::mutex> lock(controlMutex);
    const std::string stagingDirectory = finalDirectory + ".partial";

    std::uint32_t currentState = state.load(std::memory_order_acquire);
    if (currentState == Idle || currentState == Preparing || currentState == Consuming)
        return buildResultJson(false, "dump", "capture_not_dumpable");

    admission.fetch_or(AdmissionClosed, std::memory_order_acq_rel);
    producerAdmission.fetch_or(AdmissionClosed, std::memory_order_acq_rel);
    if (currentState == Capturing)
    {
        std::uint32_t expected = Capturing;
        if (state.compare_exchange_strong(
                expected, Stopping,
                std::memory_order_acq_rel,
                std::memory_order_acquire))
        {
            terminalReason = ManualDump;
        }
    }

    if (!waitForWriterToExit())
        return buildStateOnlyResult("dump", "writer_timeout", "stopping");

    currentState = state.load(std::memory_order_acquire);
    if (currentState == Stopping)
    {
        if (completedAtNs == 0)
            completedAtNs = monotonicNanoseconds();
        state.store(Complete, std::memory_order_release);
        currentState = Complete;
    }
    if (currentState != Complete)
        return buildResultJson(false, "dump", "capture_state_changed");

    std::uint32_t expected = Complete;
    if (!state.compare_exchange_strong(
            expected, Consuming,
            std::memory_order_acq_rel,
            std::memory_order_acquire))
    {
        return buildResultJson(false, "dump", "capture_consume_race");
    }

    bool outputPublished = false;
    try
    {

    struct stat existing {};
    if (stagingDirectory.empty() || finalDirectory.empty() ||
        stat(stagingDirectory.c_str(), &existing) == 0 ||
        stat(finalDirectory.c_str(), &existing) == 0)
    {
        state.store(Complete, std::memory_order_release);
        return buildResultJson(false, "dump", "output_already_exists");
    }
    if (mkdir(stagingDirectory.c_str(), 0700) != 0)
    {
        const std::string detail = "mkdir_failed_errno_" + std::to_string(errno);
        state.store(Complete, std::memory_order_release);
        return buildResultJson(false, "dump", detail);
    }

    const std::string wavPath = stagingDirectory + "/audio.wav";
    const std::string csvPath = stagingDirectory + "/callbacks.csv";
    const std::string sourceWavPath =
        stagingDirectory + "/spu-pretransport.wav";
    const std::string packetsCsvPath = stagingDirectory + "/packets.csv";
    const std::string drainsCsvPath = stagingDirectory + "/drains.csv";
    const std::string jsonPath = stagingDirectory + "/summary.json";
    bool writesSucceeded = true;

    {
        std::ofstream wav(wavPath, std::ios::binary | std::ios::trunc);
        const std::uint64_t pcmBytes64 = writtenFrames * ChannelCount * sizeof(std::int16_t);
        if (!wav || pcmBytes64 > std::numeric_limits<std::uint32_t>::max())
        {
            writesSucceeded = false;
        }
        else
        {
            const std::uint32_t pcmBytes = static_cast<std::uint32_t>(pcmBytes64);
            wav.write("RIFF", 4);
            writeLe32(wav, 36u + pcmBytes);
            wav.write("WAVEfmt ", 8);
            writeLe32(wav, 16u);
            writeLe16(wav, 1u);
            writeLe16(wav, ChannelCount);
            writeLe32(wav, SampleRate);
            writeLe32(wav, SampleRate * ChannelCount * BitsPerSample / 8u);
            writeLe16(wav, ChannelCount * BitsPerSample / 8u);
            writeLe16(wav, BitsPerSample);
            wav.write("data", 4);
            writeLe32(wav, pcmBytes);
            wav.write(
                reinterpret_cast<const char*>(pcm.data()),
                static_cast<std::streamsize>(pcmBytes));
            wav.flush();
            writesSucceeded = wav.good();
        }
    }

    if (writesSucceeded)
    {
        std::ofstream wav(sourceWavPath, std::ios::binary | std::ios::trunc);
        const std::uint64_t pcmBytes64 =
            sourceWrittenFrames * ChannelCount * sizeof(std::int16_t);
        if (!wav || pcmBytes64 > std::numeric_limits<std::uint32_t>::max())
        {
            writesSucceeded = false;
        }
        else
        {
            const std::uint32_t pcmBytes = static_cast<std::uint32_t>(pcmBytes64);
            wav.write("RIFF", 4);
            writeLe32(wav, 36u + pcmBytes);
            wav.write("WAVEfmt ", 8);
            writeLe32(wav, 16u);
            writeLe16(wav, 1u);
            writeLe16(wav, ChannelCount);
            writeLe32(wav, SampleRate);
            writeLe32(wav, SampleRate * ChannelCount * BitsPerSample / 8u);
            writeLe16(wav, ChannelCount * BitsPerSample / 8u);
            writeLe16(wav, BitsPerSample);
            wav.write("data", 4);
            writeLe32(wav, pcmBytes);
            wav.write(
                reinterpret_cast<const char*>(sourcePcm.data()),
                static_cast<std::streamsize>(pcmBytes));
            wav.flush();
            writesSucceeded = wav.good();
        }
    }

    if (writesSucceeded)
    {
        std::ofstream csv(csvPath, std::ios::trunc);
        csv << "callback_index,pcm_frame_offset,stream_generation,callback_start_ns,pcm_ready_ns,requested_frames,captured_frames,read_frames,volume,has_active_instance,"
            "before_desired_skew,before_applied_skew,before_speed_hint,before_underruns,before_dropped_blocks,before_priming_frames,"
            "after_desired_skew,after_applied_skew,after_speed_hint,after_underruns,after_dropped_blocks,after_priming_frames,"
            "controller_valid,controller_publication_id,controller_update_id,controller_host_consumed,controller_ticks_at_consumption,"
            "controller_estimator_delta_consumed,controller_estimator_delta_ticks,controller_estimator_raw_ratio,controller_priming_frames,"
            "controller_ratio,controller_desired_skew,controller_applied_skew,controller_speed_hint,"
            "controller_level_post_consumption,controller_level_before_write,controller_level_post_write,controller_frames_produced,"
            "controller_underruns,controller_dropped_blocks,controller_drops_this_write,controller_output_buffer_size,"
            "controller_reset_requested_epoch,controller_reset_confirmed_epoch,controller_reset_seen_epoch,"
            "controller_hint_epoch,controller_hint_seen_epoch,controller_decision_flags,"
            "controller_last_fast_accepted_update_id,controller_last_fast_accepted_raw_ratio,controller_last_fast_accepted_effective_ratio,"
            "controller_last_fast_accepted_level_post_consumption,controller_last_fast_accepted_level_before_write,"
            "controller_last_fast_accepted_level_post_write,controller_last_fast_accepted_flags,controller_fast_accepted_count,"
            "controller_last_slow_applied_update_id,controller_last_slow_applied_raw_ratio,"
            "controller_last_slow_applied_effective_ratio,controller_slow_applied_count,"
            "controller_last_drop_update_id,controller_last_drop_level_before_write,controller_last_drop_level_post_write,"
            "controller_last_drop_frames_produced,controller_last_drop_drops_this_write,"
            "controller_rollback_pending,controller_rollback_verifying,controller_rollback_parent_ratio,"
            "controller_rollback_target_frames,controller_rollback_count,controller_last_rollback_update_id,"
            "controller_last_rollback_parent_ratio,controller_last_rollback_target_frames,"
            "controller_last_rollback_delta_consumed,controller_last_rollback_delta_ticks,"
            "controller_actuator_active,controller_actuator_transition_count,controller_actuator_transition_update_id,"
            "controller_actuator_start_skew,controller_actuator_target_ratio,controller_actuator_first_applied_skew,"
            "controller_actuator_window_consumed,controller_actuator_window_ticks,controller_actuator_first_control_frames,"
            "controller_actuator_backing_frames,controller_actuator_level_post_write,controller_actuator_step_count,"
            "controller_actuator_max_step_ratio,controller_actuator_monotonic_violation_count,"
            "controller_actuator_converged_update_id,"
            "controller_hint_parent_certified,controller_hint_parent_certification_count,"
            "controller_last_hint_parent_certification_update_id,"
            "controller_last_hint_parent_certification_ratio,"
            "controller_last_hint_parent_certification_delta_consumed,"
            "controller_last_hint_parent_certification_delta_ticks,"
            "controller_rollback_parent_is_hint,controller_last_rollback_parent_was_hint,"
            "controller_dominated_ascending_endpoint_count,"
            "controller_last_dominated_ascending_endpoint_update_id,"
            "controller_last_dominated_ascending_endpoint_transition_update_id,"
            "controller_last_dominated_ascending_endpoint_start_skew,"
            "controller_last_dominated_ascending_endpoint_target_ratio,"
            "controller_last_dominated_ascending_endpoint_applied_skew,"
            "controller_last_dominated_ascending_endpoint_delta_consumed,"
            "controller_last_dominated_ascending_endpoint_delta_ticks,"
            "controller_last_dominated_ascending_endpoint_backing_frames,"
            "controller_last_dominated_ascending_endpoint_level_post_write,"
            "controller_last_dominated_ascending_endpoint_output_buffer_size,"
            "controller_last_dominated_ascending_endpoint_output_sample_rate,"
            "controller_fast_anchor_rebase_count,"
            "controller_last_fast_anchor_rebase_update_id,"
            "controller_last_fast_anchor_rebase_delta_consumed,"
            "controller_last_fast_anchor_rebase_delta_ticks,"
            "controller_last_fast_anchor_rebase_raw_ratio,"
            "controller_last_fast_anchor_rebase_ratio_before_estimators,"
            "controller_last_fast_anchor_rebase_ratio_after,"
            "controller_last_fast_anchor_rebase_level_post_consumption,"
            "controller_last_fast_anchor_rebase_level_post_write,"
            "controller_last_fast_anchor_rebase_recovery_ascending_frames,"
            "controller_last_fast_anchor_rebase_decision_flags,"
            "controller_last_fast_anchor_rebase_target_rate_owned,"
            "controller_last_fast_anchor_rebase_estimator_evaluated,"
            "controller_rate_recovery_rebase_count,"
            "controller_last_rate_recovery_rebase_update_id,"
            "controller_last_rate_recovery_rebase_delta_consumed,"
            "controller_last_rate_recovery_rebase_delta_ticks,"
            "controller_last_rate_recovery_rebase_level_post_consumption,"
            "controller_last_rate_recovery_rebase_level_post_write,"
            "controller_last_rate_recovery_rebase_target_ratio,"
            "controller_last_rate_recovery_rebase_boundary_frames,"
            "controller_last_rate_recovery_rebase_fast_low_pending,"
            "controller_last_rate_recovery_rebase_fast_target_change_pending,"
            "controller_frames_at_consumption,"
            "controller_sustained_candidate_generation,"
            "controller_sustained_owner_generation,"
            "controller_sustained_owner_candidate_generation,"
            "controller_sustained_candidate_active,"
            "controller_sustained_owner_active,"
            "controller_sustained_owner_ratio,"
            "controller_sustained_observation_count,"
            "controller_last_sustained_observation_update_id,"
            "controller_last_sustained_observation_candidate_generation,"
            "controller_last_sustained_observation_end_consumed,"
            "controller_last_sustained_observation_end_ticks,"
            "controller_last_sustained_observation_end_produced,"
            "controller_last_sustained_observation_delta_consumed,"
            "controller_last_sustained_observation_delta_ticks,"
            "controller_last_sustained_observation_delta_produced,"
            "controller_last_sustained_observation_raw_ratio,"
            "controller_last_sustained_observation_start_level,"
            "controller_last_sustained_observation_end_level,"
            "controller_last_sustained_observation_min_level,"
            "controller_last_sustained_observation_max_level,"
            "controller_sustained_state_flags,"
            "controller_sustained_episode_origin_update_id,"
            "controller_sustained_parent_ratio,"
            "controller_sustained_parent_delta_consumed,"
            "controller_sustained_parent_delta_ticks,"
            "controller_last_sustained_observation_type,"
            "controller_sustained_recovery_boundary_frames,"
            "controller_effective_phase_target_frames,"
            "controller_sustained_transition_count,"
            "controller_last_sustained_transition_update_id,"
            "controller_last_sustained_transition_kind,"
            "controller_last_sustained_transition_owner_generation,"
            "controller_fast_low_witness_owner_generation,"
            "controller_fast_low_witness_end_consumed,"
            "controller_fast_low_witness_end_ticks,"
            "controller_fast_low_witness_end_produced,"
            "controller_fast_low_witness_end_level,"
            "controller_fast_low_witness_birth_count,"
            "controller_last_fast_low_witness_birth_update_id,"
            "controller_last_fast_low_witness_birth_kind,"
            "controller_last_fast_low_witness_birth_owner_generation,"
            "controller_last_fast_low_witness_birth_consumed,"
            "controller_last_fast_low_witness_birth_ticks,"
            "controller_last_fast_low_witness_birth_produced,"
            "controller_last_fast_low_witness_birth_level,"
            "controller_last_fast_low_witness_birth_level_post_write,"
            "controller_fast_low_witness_clear_count,"
            "controller_last_fast_low_witness_clear_update_id,"
            "controller_last_fast_low_witness_clear_reasons,"
            "controller_last_fast_low_witness_clear_owner_generation,"
            "controller_last_fast_low_witness_clear_witness_consumed,"
            "controller_last_fast_low_witness_clear_witness_ticks,"
            "controller_last_fast_low_witness_clear_witness_produced,"
            "controller_last_fast_low_witness_clear_witness_level,"
            "controller_last_fast_low_witness_clear_consumed,"
            "controller_last_fast_low_witness_clear_ticks,"
            "controller_last_fast_low_witness_clear_produced,"
            "controller_last_fast_low_witness_clear_level,"
            "controller_last_fast_low_witness_clear_level_post_write,"
            "controller_frames_published_total,"
            "controller_parent_capacity_active,"
            "controller_parent_capacity_capacity,"
            "controller_parent_capacity_generation,"
            "controller_parent_capacity_source_owner_generation,"
            "controller_parent_capacity_parent_ratio,"
            "controller_parent_capacity_start_continuity_epoch,"
            "controller_parent_capacity_start_reset_epoch,"
            "controller_parent_capacity_start_hint_seen_epoch,"
            "controller_parent_capacity_start_consumed,"
            "controller_parent_capacity_start_ticks,"
            "controller_parent_capacity_start_consumed_produced,"
            "controller_parent_capacity_start_published_produced,"
            "controller_parent_capacity_start_level_post_consumption,"
            "controller_parent_capacity_start_level_post_write,"
            "controller_parent_capacity_birth_count,"
            "controller_last_parent_capacity_birth_update_id,"
            "controller_parent_capacity_first_risk_count,"
            "controller_last_parent_capacity_first_risk_update_id,"
            "controller_last_parent_capacity_first_risk_generation,"
            "controller_last_parent_capacity_first_risk_level_before_write,"
            "controller_last_parent_capacity_first_risk_frames_produced,"
            "controller_last_parent_capacity_first_risk_capacity,"
            "controller_parent_capacity_clear_count,"
            "controller_last_parent_capacity_clear_update_id,"
            "controller_last_parent_capacity_clear_reasons,"
            "controller_last_parent_capacity_clear_generation,"
            "controller_last_parent_capacity_clear_consumed,"
            "controller_last_parent_capacity_clear_ticks,"
            "controller_last_parent_capacity_clear_published_produced,"
            "controller_last_parent_capacity_clear_level_post_write,"
            "controller_logical_level_post_consumption,"
            "controller_logical_level_before_write,"
            "controller_logical_level_post_write,"
            "controller_spill_frames,"
            "controller_spill_peak_frames,"
            "controller_spill_active_nodes,"
            "controller_spill_free_nodes,"
            "controller_spill_generation,"
            "controller_spill_birth_count,"
            "controller_last_spill_birth_update_id,"
            "controller_last_spill_birth_continuity_epoch,"
            "controller_last_spill_birth_reset_epoch,"
            "controller_last_spill_birth_owner_generation,"
            "controller_last_spill_birth_frames,"
            "controller_spill_publication_count,"
            "controller_spill_frames_published_total,"
            "controller_spill_allocation_count,"
            "controller_spill_allocation_failure_count,"
            "controller_spill_dropped_packets_total,"
            "controller_spill_dropped_frames_total,"
            "controller_spill_dropped_packets_this_write,"
            "controller_spill_dropped_frames_this_write,"
            "controller_provisional_fast_state_flags,"
            "controller_provisional_fast_anchor_consumed,"
            "controller_provisional_fast_anchor_ticks,"
            "controller_provisional_fast_anchor_produced,"
            "controller_provisional_fast_anchor_level_post_consumption,"
            "controller_provisional_fast_anchor_level_post_write,"
            "controller_provisional_fast_anchor_continuity_epoch,"
            "controller_provisional_fast_anchor_reset_epoch,"
            "controller_provisional_fast_anchor_hint_seen_epoch,"
            "controller_provisional_fast_anchor_candidate_generation,"
            "controller_provisional_fast_anchor_owner_generation,"
            "controller_provisional_candidate_start_consumed,"
            "controller_provisional_candidate_start_ticks,"
            "controller_provisional_candidate_start_produced,"
            "controller_provisional_candidate_start_level_post_consumption,"
            "controller_provisional_candidate_start_level_post_write,"
            "controller_provisional_candidate_start_continuity_epoch,"
            "controller_provisional_candidate_start_reset_epoch,"
            "controller_provisional_candidate_start_hint_seen_epoch,"
            "controller_provisional_candidate_direction,"
            "controller_provisional_event_count,"
            "controller_last_provisional_event_update_id,"
            "controller_last_provisional_event_flags,"
            "controller_last_provisional_event_fast_state_before,"
            "controller_last_provisional_event_fast_state_after,"
            "controller_last_provisional_event_fast_anchor_consumed,"
            "controller_last_provisional_event_fast_anchor_ticks,"
            "controller_last_provisional_event_fast_anchor_produced,"
            "controller_last_provisional_event_fast_anchor_level_post_consumption,"
            "controller_last_provisional_event_fast_anchor_level_post_write,"
            "controller_last_provisional_event_candidate_generation,"
            "controller_last_provisional_event_candidate_start_consumed,"
            "controller_last_provisional_event_candidate_start_ticks,"
            "controller_last_provisional_event_candidate_start_produced,"
            "controller_last_provisional_event_candidate_start_level_post_consumption,"
            "controller_last_provisional_event_candidate_start_level_post_write,"
            "controller_last_provisional_event_candidate_direction,"
            "controller_last_provisional_event_owner_generation,"
            "controller_last_provisional_event_endpoint_consumed,"
            "controller_last_provisional_event_endpoint_ticks,"
            "controller_last_provisional_event_endpoint_produced,"
            "controller_last_provisional_event_endpoint_level_post_consumption,"
            "controller_last_provisional_event_endpoint_level_post_write,"
            "controller_last_provisional_event_endpoint_continuity_epoch,"
            "controller_last_provisional_event_reset_epoch,"
            "controller_last_provisional_event_hint_seen_epoch,"
            "controller_last_provisional_event_decision_flags,"
            "controller_provisional_fast_anchor_published_produced,"
            "controller_provisional_candidate_start_published_produced,"
            "controller_last_provisional_event_fast_anchor_published_produced,"
            "controller_last_provisional_event_fast_anchor_continuity_epoch,"
            "controller_last_provisional_event_fast_anchor_reset_epoch,"
            "controller_last_provisional_event_fast_anchor_hint_seen_epoch,"
            "controller_last_provisional_event_fast_anchor_candidate_generation,"
            "controller_last_provisional_event_fast_anchor_owner_generation,"
            "controller_last_provisional_event_candidate_start_published_produced,"
            "controller_last_provisional_event_candidate_start_continuity_epoch,"
            "controller_last_provisional_event_candidate_start_reset_epoch,"
            "controller_last_provisional_event_candidate_start_hint_seen_epoch,"
            "controller_last_provisional_event_endpoint_published_produced,"
            "controller_last_provisional_event_previous_candidate_generation,"
            "controller_last_provisional_event_previous_candidate_start_consumed,"
            "controller_last_provisional_event_previous_candidate_start_ticks,"
            "controller_last_provisional_event_previous_candidate_start_produced,"
            "controller_last_provisional_event_previous_candidate_start_published_produced,"
            "controller_last_provisional_event_previous_candidate_start_level_post_consumption,"
            "controller_last_provisional_event_previous_candidate_start_level_post_write,"
            "controller_last_provisional_event_previous_candidate_start_continuity_epoch,"
            "controller_last_provisional_event_previous_candidate_start_reset_epoch,"
            "controller_last_provisional_event_previous_candidate_start_hint_seen_epoch,"
            "controller_last_provisional_event_previous_candidate_direction,"
            "controller_ticks_published_total,"
            "controller_fast_high_escrow_initialized,"
            "controller_fast_high_escrow_active,"
            "controller_fast_high_escrow_reference_is_override,"
            "controller_fast_high_escrow_owner_generation,"
            "controller_fast_high_escrow_reference_ticks,"
            "controller_fast_high_escrow_reference_consumed,"
            "controller_fast_high_escrow_rate,"
            "controller_fast_high_escrow_start_ticks,"
            "controller_fast_high_escrow_start_published_produced,"
            "controller_fast_high_escrow_start_consumed,"
            "controller_fast_high_escrow_start_consumed_produced,"
            "controller_fast_high_escrow_start_level_post_consumption,"
            "controller_fast_high_escrow_start_level_post_write,"
            "controller_fast_high_escrow_start_continuity_epoch,"
            "controller_fast_high_escrow_start_reset_epoch,"
            "controller_fast_high_escrow_start_hint_seen_epoch,"
            "controller_fast_high_escrow_grant_frames,"
            "controller_fast_high_escrow_spent_frames,"
            "controller_fast_high_escrow_remaining_frames,"
            "controller_fast_high_escrow_birth_count,"
            "controller_last_fast_high_escrow_birth_update_id,"
            "controller_last_fast_high_escrow_birth_owner_generation,"
            "controller_last_fast_high_escrow_birth_reference_ticks,"
            "controller_last_fast_high_escrow_birth_reference_consumed,"
            "controller_last_fast_high_escrow_birth_reference_was_override,"
            "controller_last_fast_high_escrow_birth_rate,"
            "controller_last_fast_high_escrow_birth_start_ticks,"
            "controller_last_fast_high_escrow_birth_start_published_produced,"
            "controller_last_fast_high_escrow_birth_start_consumed,"
            "controller_last_fast_high_escrow_birth_start_consumed_produced,"
            "controller_last_fast_high_escrow_birth_start_level_post_consumption,"
            "controller_last_fast_high_escrow_birth_start_level_post_write,"
            "controller_last_fast_high_escrow_birth_start_continuity_epoch,"
            "controller_last_fast_high_escrow_birth_start_reset_epoch,"
            "controller_last_fast_high_escrow_birth_start_hint_seen_epoch,"
            "controller_last_fast_high_escrow_birth_grant_frames,"
            "controller_fast_high_escrow_spend_count,"
            "controller_last_fast_high_escrow_spend_update_id,"
            "controller_last_fast_high_escrow_spent_frames,"
            "controller_last_fast_high_escrow_remaining_frames,"
            "controller_fast_high_escrow_overlay_count,"
            "controller_last_fast_high_escrow_overlay_update_id,"
            "controller_last_fast_high_escrow_overlay_remaining_frames,"
            "controller_last_fast_high_escrow_overlay_skew,"
            "controller_fast_high_escrow_clear_count,"
            "controller_last_fast_high_escrow_clear_update_id,"
            "controller_last_fast_high_escrow_clear_reasons,"
            "controller_last_fast_high_escrow_clear_owner_generation,"
            "controller_last_fast_high_escrow_clear_grant_frames,"
            "controller_last_fast_high_escrow_clear_spent_frames,"
            "controller_fast_high_escrow_guard_skew,"
            "controller_last_fast_high_escrow_birth_guard_skew,"
            "controller_fast_high_escrow_horizon_frames,"
            "controller_last_fast_high_escrow_birth_horizon_frames,"
            "controller_fast_target_change_phase_frontier_origin,"
            "controller_fast_target_change_phase_frontier_valid,"
            "controller_fast_target_change_phase_frontier_invalidation_count,"
            "controller_last_fast_target_change_phase_frontier_invalidation_update_id,"
            "controller_last_fast_target_change_phase_frontier_invalidation_reasons,"
            "controller_fast_target_change_phase_frontier_evaluation_count,"
            "controller_last_fast_target_change_phase_frontier_evaluation_update_id,"
            "controller_last_fast_target_change_phase_frontier_evaluation_origin,"
            "controller_last_fast_target_change_phase_frontier_evaluation_reject_mask,"
            "controller_fast_target_change_phase_escrow_active,"
            "controller_fast_target_change_phase_escrow_grant_frames,"
            "controller_fast_target_change_phase_escrow_guard_skew,"
            "controller_fast_target_change_phase_escrow_overlay_skew,"
            "controller_fast_target_change_phase_escrow_reference_rate,"
            "controller_fast_target_change_phase_escrow_start_ticks,"
            "controller_fast_target_change_phase_escrow_start_consumed,"
            "controller_fast_target_change_phase_escrow_start_consumed_produced,"
            "controller_fast_target_change_phase_escrow_start_published_produced,"
            "controller_fast_target_change_phase_escrow_start_level_post_consumption,"
            "controller_fast_target_change_phase_escrow_start_level_post_write,"
            "controller_fast_target_change_phase_escrow_start_continuity_epoch,"
            "controller_fast_target_change_phase_escrow_start_reset_epoch,"
            "controller_fast_target_change_phase_escrow_start_hint_seen_epoch,"
            "controller_fast_target_change_phase_escrow_start_candidate_generation,"
            "controller_fast_target_change_phase_escrow_elapsed_published_ticks,"
            "controller_fast_target_change_phase_escrow_current_physical_prefix,"
            "controller_fast_target_change_phase_escrow_birth_count,"
            "controller_last_fast_target_change_phase_escrow_birth_update_id,"
            "controller_last_fast_target_change_phase_escrow_birth_grant_frames,"
            "controller_last_fast_target_change_phase_escrow_birth_guard_skew,"
            "controller_fast_target_change_phase_escrow_clear_count,"
            "controller_last_fast_target_change_phase_escrow_clear_update_id,"
            "controller_last_fast_target_change_phase_escrow_clear_reasons,"
            "controller_last_fast_target_change_phase_escrow_clear_grant_frames,"
            "controller_last_fast_target_change_phase_escrow_clear_overlay_skew,"
            "controller_sustained_provisional_phase_active,"
            "controller_sustained_provisional_phase_candidate_generation,"
            "controller_sustained_provisional_phase_owner_generation,"
            "controller_sustained_provisional_phase_parent_ratio,"
            "controller_sustained_provisional_phase_skew,"
            "controller_sustained_provisional_phase_frontier_frames,"
            "controller_sustained_provisional_phase_backing_frames,"
            "controller_sustained_provisional_phase_publication_reserve_frames,"
            "controller_sustained_provisional_phase_reserved_publication_count,"
            "controller_sustained_provisional_phase_birth_count,"
            "controller_last_sustained_provisional_phase_birth_update_id,"
            "controller_last_sustained_provisional_phase_birth_candidate_generation,"
            "controller_last_sustained_provisional_phase_birth_parent_ratio,"
            "controller_last_sustained_provisional_phase_birth_skew,"
            "controller_last_sustained_provisional_phase_birth_frontier_frames,"
            "controller_last_sustained_provisional_phase_birth_backing_frames,"
            "controller_last_sustained_provisional_phase_birth_publication_reserve_frames,"
            "controller_last_sustained_provisional_phase_birth_reserved_publication_count,"
            "controller_sustained_provisional_phase_step_count,"
            "controller_last_sustained_provisional_phase_step_update_id,"
            "controller_last_sustained_provisional_phase_step_candidate_generation,"
            "controller_last_sustained_provisional_phase_step_previous_skew,"
            "controller_last_sustained_provisional_phase_step_skew,"
            "controller_last_sustained_provisional_phase_step_frontier_frames,"
            "controller_last_sustained_provisional_phase_step_backing_frames,"
            "controller_last_sustained_provisional_phase_step_publication_reserve_frames,"
            "controller_last_sustained_provisional_phase_step_reserved_publication_count,"
            "controller_sustained_provisional_phase_clear_count,"
            "controller_last_sustained_provisional_phase_clear_update_id,"
            "controller_last_sustained_provisional_phase_clear_reasons,"
            "controller_last_sustained_provisional_phase_clear_candidate_generation,"
            "controller_last_sustained_provisional_phase_clear_skew,"
            "controller_last_sustained_provisional_phase_clear_reserved_publication_count,"
            "controller_sustained_provisional_phase_application_conflict_count,"
            "controller_last_sustained_provisional_phase_application_conflict_update_id,"
            "xrun_count\n";
        csv << std::setprecision(17);
        for (std::uint64_t i = 0; i < storedRecordCount; ++i)
        {
            const CallbackRecord& record = records[static_cast<std::size_t>(i)];
            csv << record.callbackIndex << ','
                << record.pcmFrameOffset << ','
                << record.streamGeneration << ','
                << record.callbackStartNs << ','
                << record.pcmReadyNs << ','
                << record.requestedFrames << ','
                << record.capturedFrames << ','
                << record.readFrames << ','
                << record.volume << ','
                << record.hasActiveInstance << ','
                << record.before.desiredSkew << ','
                << record.before.appliedSkew << ','
                << record.before.speedHint << ','
                << record.before.underruns << ','
                << record.before.droppedBlocks << ','
                << record.before.primingFrames << ','
                << record.after.desiredSkew << ','
                << record.after.appliedSkew << ','
                << record.after.speedHint << ','
                << record.after.underruns << ','
                << record.after.droppedBlocks << ','
                << record.after.primingFrames << ','
                << (record.controller.valid ? 1 : 0) << ','
                << record.controller.publicationId << ','
                << record.controller.updateId << ','
                << record.controller.hostConsumed << ','
                << record.controller.ticksAtConsumption << ','
                << record.controller.estimatorDeltaConsumed << ','
                << record.controller.estimatorDeltaTicks << ','
                << record.controller.estimatorRawRatio << ','
                << record.controller.primingFrames << ','
                << record.controller.controllerRatio << ','
                << record.controller.desiredSkew << ','
                << record.controller.appliedSkew << ','
                << record.controller.speedHint << ','
                << record.controller.levelPostConsumption << ','
                << record.controller.levelBeforeWrite << ','
                << record.controller.levelPostWrite << ','
                << record.controller.framesProduced << ','
                << record.controller.underruns << ','
                << record.controller.droppedBlocks << ','
                << record.controller.dropsThisWrite << ','
                << record.controller.outputBufferSize << ','
                << record.controller.resetRequestedEpoch << ','
                << record.controller.resetConfirmedEpoch << ','
                << record.controller.resetSeenEpoch << ','
                << record.controller.hintEpoch << ','
                << record.controller.hintSeenEpoch << ','
                << record.controller.decisionFlags << ','
                << record.controller.lastFastAcceptedUpdateId << ','
                << record.controller.lastFastAcceptedRawRatio << ','
                << record.controller.lastFastAcceptedEffectiveRatio << ','
                << record.controller.lastFastAcceptedLevelPostConsumption << ','
                << record.controller.lastFastAcceptedLevelBeforeWrite << ','
                << record.controller.lastFastAcceptedLevelPostWrite << ','
                << record.controller.lastFastAcceptedFlags << ','
                << record.controller.fastAcceptedCount << ','
                << record.controller.lastSlowAppliedUpdateId << ','
                << record.controller.lastSlowAppliedRawRatio << ','
                << record.controller.lastSlowAppliedEffectiveRatio << ','
                << record.controller.slowAppliedCount << ','
                << record.controller.lastDropUpdateId << ','
                << record.controller.lastDropLevelBeforeWrite << ','
                << record.controller.lastDropLevelPostWrite << ','
                << record.controller.lastDropFramesProduced << ','
                << record.controller.lastDropDropsThisWrite << ','
                << (record.controller.rollbackPending ? 1 : 0) << ','
                << (record.controller.rollbackVerifying ? 1 : 0) << ','
                << record.controller.rollbackParentRatio << ','
                << record.controller.rollbackTargetFrames << ','
                << record.controller.rollbackCount << ','
                << record.controller.lastRollbackUpdateId << ','
                << record.controller.lastRollbackParentRatio << ','
                << record.controller.lastRollbackTargetFrames << ','
                << record.controller.lastRollbackDeltaConsumed << ','
                << record.controller.lastRollbackDeltaTicks << ','
                << (record.controller.actuatorActive ? 1 : 0) << ','
                << record.controller.actuatorTransitionCount << ','
                << record.controller.lastActuatorTransitionUpdateId << ','
                << record.controller.lastActuatorStartSkew << ','
                << record.controller.lastActuatorTargetRatio << ','
                << record.controller.lastActuatorFirstAppliedSkew << ','
                << record.controller.lastActuatorDeltaConsumed << ','
                << record.controller.lastActuatorDeltaTicks << ','
                << record.controller.lastActuatorFirstControlFrames << ','
                << record.controller.lastActuatorBackingFrames << ','
                << record.controller.lastActuatorLevelPostWrite << ','
                << record.controller.lastActuatorStepCount << ','
                << record.controller.lastActuatorMaxStepRatio << ','
                << record.controller.lastActuatorMonotonicViolationCount << ','
                << record.controller.lastActuatorConvergedUpdateId << ','
                << (record.controller.hintParentCertified ? 1 : 0) << ','
                << record.controller.hintParentCertificationCount << ','
                << record.controller.lastHintParentCertificationUpdateId << ','
                << record.controller.lastHintParentCertificationRatio << ','
                << record.controller.lastHintParentCertificationDeltaConsumed << ','
                << record.controller.lastHintParentCertificationDeltaTicks << ','
                << (record.controller.rollbackParentIsHint ? 1 : 0) << ','
                << (record.controller.lastRollbackParentWasHint ? 1 : 0) << ','
                << record.controller.dominatedAscendingEndpointCount << ','
                << record.controller.lastDominatedAscendingEndpointUpdateId << ','
                << record.controller.lastDominatedAscendingEndpointTransitionUpdateId << ','
                << record.controller.lastDominatedAscendingEndpointStartSkew << ','
                << record.controller.lastDominatedAscendingEndpointTargetRatio << ','
                << record.controller.lastDominatedAscendingEndpointAppliedSkew << ','
                << record.controller.lastDominatedAscendingEndpointDeltaConsumed << ','
                << record.controller.lastDominatedAscendingEndpointDeltaTicks << ','
                << record.controller.lastDominatedAscendingEndpointBackingFrames << ','
                << record.controller.lastDominatedAscendingEndpointLevelPostWrite << ','
                << record.controller.lastDominatedAscendingEndpointOutputBufferSize << ','
                << record.controller.lastDominatedAscendingEndpointOutputSampleRate << ','
                << record.controller.fastAnchorRebaseCount << ','
                << record.controller.lastFastAnchorRebaseUpdateId << ','
                << record.controller.lastFastAnchorRebaseDeltaConsumed << ','
                << record.controller.lastFastAnchorRebaseDeltaTicks << ','
                << record.controller.lastFastAnchorRebaseRawRatio << ','
                << record.controller.lastFastAnchorRebaseRatioBeforeEstimators << ','
                << record.controller.lastFastAnchorRebaseRatioAfter << ','
                << record.controller.lastFastAnchorRebaseLevelPostConsumption << ','
                << record.controller.lastFastAnchorRebaseLevelPostWrite << ','
                << record.controller.lastFastAnchorRebaseRecoveryAscendingFrames << ','
                << record.controller.lastFastAnchorRebaseDecisionFlags << ','
                << (record.controller.lastFastAnchorRebaseTargetRateOwned ? 1 : 0) << ','
                << (record.controller.lastFastAnchorRebaseEstimatorEvaluated ? 1 : 0) << ','
                << record.controller.rateRecoveryRebaseCount << ','
                << record.controller.lastRateRecoveryRebaseUpdateId << ','
                << record.controller.lastRateRecoveryRebaseDeltaConsumed << ','
                << record.controller.lastRateRecoveryRebaseDeltaTicks << ','
                << record.controller.lastRateRecoveryRebaseLevelPostConsumption << ','
                << record.controller.lastRateRecoveryRebaseLevelPostWrite << ','
                << record.controller.lastRateRecoveryRebaseTargetRatio << ','
                << record.controller.lastRateRecoveryRebaseBoundaryFrames << ','
                << (record.controller.lastRateRecoveryRebaseFastLowPending ? 1 : 0) << ','
                << (record.controller.lastRateRecoveryRebaseFastTargetChangePending ? 1 : 0) << ','
                << record.controller.framesAtConsumption << ','
                << record.controller.sustainedCandidateGeneration << ','
                << record.controller.sustainedOwnerGeneration << ','
                << record.controller.sustainedOwnerCandidateGeneration << ','
                << (record.controller.sustainedCandidateActive ? 1 : 0) << ','
                << (record.controller.sustainedOwnerActive ? 1 : 0) << ','
                << record.controller.sustainedOwnerRatio << ','
                << record.controller.sustainedObservationCount << ','
                << record.controller.lastSustainedObservationUpdateId << ','
                << record.controller.lastSustainedObservationCandidateGeneration << ','
                << record.controller.lastSustainedObservationEndConsumed << ','
                << record.controller.lastSustainedObservationEndTicks << ','
                << record.controller.lastSustainedObservationEndProduced << ','
                << record.controller.lastSustainedObservationDeltaConsumed << ','
                << record.controller.lastSustainedObservationDeltaTicks << ','
                << record.controller.lastSustainedObservationDeltaProduced << ','
                << record.controller.lastSustainedObservationRawRatio << ','
                << record.controller.lastSustainedObservationStartLevel << ','
                << record.controller.lastSustainedObservationEndLevel << ','
                << record.controller.lastSustainedObservationMinLevel << ','
                << record.controller.lastSustainedObservationMaxLevel << ','
                << record.controller.sustainedStateFlags << ','
                << record.controller.sustainedEpisodeOriginUpdateId << ','
                << record.controller.sustainedParentRatio << ','
                << record.controller.sustainedParentDeltaConsumed << ','
                << record.controller.sustainedParentDeltaTicks << ','
                << record.controller.lastSustainedObservationType << ','
                << record.controller.sustainedRecoveryBoundaryFrames << ','
                << record.controller.effectivePhaseTargetFrames << ','
                << record.controller.sustainedTransitionCount << ','
                << record.controller.lastSustainedTransitionUpdateId << ','
                << record.controller.lastSustainedTransitionKind << ','
                << record.controller.lastSustainedTransitionOwnerGeneration << ','
                << record.controller.fastLowWitnessOwnerGeneration << ','
                << record.controller.fastLowWitnessEndConsumed << ','
                << record.controller.fastLowWitnessEndTicks << ','
                << record.controller.fastLowWitnessEndProduced << ','
                << record.controller.fastLowWitnessEndLevel << ','
                << record.controller.fastLowWitnessBirthCount << ','
                << record.controller.lastFastLowWitnessBirthUpdateId << ','
                << record.controller.lastFastLowWitnessBirthKind << ','
                << record.controller.lastFastLowWitnessBirthOwnerGeneration << ','
                << record.controller.lastFastLowWitnessBirthConsumed << ','
                << record.controller.lastFastLowWitnessBirthTicks << ','
                << record.controller.lastFastLowWitnessBirthProduced << ','
                << record.controller.lastFastLowWitnessBirthLevel << ','
                << record.controller.lastFastLowWitnessBirthLevelPostWrite << ','
                << record.controller.fastLowWitnessClearCount << ','
                << record.controller.lastFastLowWitnessClearUpdateId << ','
                << record.controller.lastFastLowWitnessClearReasons << ','
                << record.controller.lastFastLowWitnessClearOwnerGeneration << ','
                << record.controller.lastFastLowWitnessClearWitnessConsumed << ','
                << record.controller.lastFastLowWitnessClearWitnessTicks << ','
                << record.controller.lastFastLowWitnessClearWitnessProduced << ','
                << record.controller.lastFastLowWitnessClearWitnessLevel << ','
                << record.controller.lastFastLowWitnessClearConsumed << ','
                << record.controller.lastFastLowWitnessClearTicks << ','
                << record.controller.lastFastLowWitnessClearProduced << ','
                << record.controller.lastFastLowWitnessClearLevel << ','
                << record.controller.lastFastLowWitnessClearLevelPostWrite << ','
                << record.controller.framesPublishedTotal << ','
                << (record.controller.parentCapacityActive ? 1 : 0) << ','
                << record.controller.parentCapacityCapacity << ','
                << record.controller.parentCapacityGeneration << ','
                << record.controller.parentCapacitySourceOwnerGeneration << ','
                << record.controller.parentCapacityParentRatio << ','
                << record.controller.parentCapacityStartContinuityEpoch << ','
                << record.controller.parentCapacityStartResetEpoch << ','
                << record.controller.parentCapacityStartHintSeenEpoch << ','
                << record.controller.parentCapacityStartConsumed << ','
                << record.controller.parentCapacityStartTicks << ','
                << record.controller.parentCapacityStartConsumedProduced << ','
                << record.controller.parentCapacityStartPublishedProduced << ','
                << record.controller.parentCapacityStartLevelPostConsumption << ','
                << record.controller.parentCapacityStartLevelPostWrite << ','
                << record.controller.parentCapacityBirthCount << ','
                << record.controller.lastParentCapacityBirthUpdateId << ','
                << record.controller.parentCapacityFirstRiskCount << ','
                << record.controller.lastParentCapacityFirstRiskUpdateId << ','
                << record.controller.lastParentCapacityFirstRiskGeneration << ','
                << record.controller.lastParentCapacityFirstRiskLevelBeforeWrite << ','
                << record.controller.lastParentCapacityFirstRiskFramesProduced << ','
                << record.controller.lastParentCapacityFirstRiskCapacity << ','
                << record.controller.parentCapacityClearCount << ','
                << record.controller.lastParentCapacityClearUpdateId << ','
                << record.controller.lastParentCapacityClearReasons << ','
                << record.controller.lastParentCapacityClearGeneration << ','
                << record.controller.lastParentCapacityClearConsumed << ','
                << record.controller.lastParentCapacityClearTicks << ','
                << record.controller.lastParentCapacityClearPublishedProduced << ','
                << record.controller.lastParentCapacityClearLevelPostWrite << ','
                << record.controller.logicalLevelPostConsumption << ','
                << record.controller.logicalLevelBeforeWrite << ','
                << record.controller.logicalLevelPostWrite << ','
                << record.controller.spillFrames << ','
                << record.controller.spillPeakFrames << ','
                << record.controller.spillActiveNodes << ','
                << record.controller.spillFreeNodes << ','
                << record.controller.spillGeneration << ','
                << record.controller.spillBirthCount << ','
                << record.controller.lastSpillBirthUpdateId << ','
                << record.controller.lastSpillBirthContinuityEpoch << ','
                << record.controller.lastSpillBirthResetEpoch << ','
                << record.controller.lastSpillBirthOwnerGeneration << ','
                << record.controller.lastSpillBirthFrames << ','
                << record.controller.spillPublicationCount << ','
                << record.controller.spillFramesPublishedTotal << ','
                << record.controller.spillAllocationCount << ','
                << record.controller.spillAllocationFailureCount << ','
                << record.controller.spillDroppedPacketsTotal << ','
                << record.controller.spillDroppedFramesTotal << ','
                << record.controller.spillDroppedPacketsThisWrite << ','
                << record.controller.spillDroppedFramesThisWrite << ','
                << record.controller.provisionalFastStateFlags << ','
                << record.controller.provisionalFastAnchorConsumed << ','
                << record.controller.provisionalFastAnchorTicks << ','
                << record.controller.provisionalFastAnchorProduced << ','
                << record.controller.provisionalFastAnchorLevelPostConsumption << ','
                << record.controller.provisionalFastAnchorLevelPostWrite << ','
                << record.controller.provisionalFastAnchorContinuityEpoch << ','
                << record.controller.provisionalFastAnchorResetEpoch << ','
                << record.controller.provisionalFastAnchorHintSeenEpoch << ','
                << record.controller.provisionalFastAnchorCandidateGeneration << ','
                << record.controller.provisionalFastAnchorOwnerGeneration << ','
                << record.controller.provisionalCandidateStartConsumed << ','
                << record.controller.provisionalCandidateStartTicks << ','
                << record.controller.provisionalCandidateStartProduced << ','
                << record.controller.provisionalCandidateStartLevelPostConsumption << ','
                << record.controller.provisionalCandidateStartLevelPostWrite << ','
                << record.controller.provisionalCandidateStartContinuityEpoch << ','
                << record.controller.provisionalCandidateStartResetEpoch << ','
                << record.controller.provisionalCandidateStartHintSeenEpoch << ','
                << record.controller.provisionalCandidateDirection << ','
                << record.controller.provisionalEventCount << ','
                << record.controller.lastProvisionalEventUpdateId << ','
                << record.controller.lastProvisionalEventFlags << ','
                << record.controller.lastProvisionalEventFastStateBefore << ','
                << record.controller.lastProvisionalEventFastStateAfter << ','
                << record.controller.lastProvisionalEventFastAnchorConsumed << ','
                << record.controller.lastProvisionalEventFastAnchorTicks << ','
                << record.controller.lastProvisionalEventFastAnchorProduced << ','
                << record.controller.lastProvisionalEventFastAnchorLevelPostConsumption << ','
                << record.controller.lastProvisionalEventFastAnchorLevelPostWrite << ','
                << record.controller.lastProvisionalEventCandidateGeneration << ','
                << record.controller.lastProvisionalEventCandidateStartConsumed << ','
                << record.controller.lastProvisionalEventCandidateStartTicks << ','
                << record.controller.lastProvisionalEventCandidateStartProduced << ','
                << record.controller.lastProvisionalEventCandidateStartLevelPostConsumption << ','
                << record.controller.lastProvisionalEventCandidateStartLevelPostWrite << ','
                << record.controller.lastProvisionalEventCandidateDirection << ','
                << record.controller.lastProvisionalEventOwnerGeneration << ','
                << record.controller.lastProvisionalEventEndpointConsumed << ','
                << record.controller.lastProvisionalEventEndpointTicks << ','
                << record.controller.lastProvisionalEventEndpointProduced << ','
                << record.controller.lastProvisionalEventEndpointLevelPostConsumption << ','
                << record.controller.lastProvisionalEventEndpointLevelPostWrite << ','
                << record.controller.lastProvisionalEventEndpointContinuityEpoch << ','
                << record.controller.lastProvisionalEventResetEpoch << ','
                << record.controller.lastProvisionalEventHintSeenEpoch << ','
                << record.controller.lastProvisionalEventDecisionFlags << ','
                << record.controller.provisionalFastAnchorPublishedProduced << ','
                << record.controller.provisionalCandidateStartPublishedProduced << ','
                << record.controller.lastProvisionalEventFastAnchorPublishedProduced << ','
                << record.controller.lastProvisionalEventFastAnchorContinuityEpoch << ','
                << record.controller.lastProvisionalEventFastAnchorResetEpoch << ','
                << record.controller.lastProvisionalEventFastAnchorHintSeenEpoch << ','
                << record.controller.lastProvisionalEventFastAnchorCandidateGeneration << ','
                << record.controller.lastProvisionalEventFastAnchorOwnerGeneration << ','
                << record.controller.lastProvisionalEventCandidateStartPublishedProduced << ','
                << record.controller.lastProvisionalEventCandidateStartContinuityEpoch << ','
                << record.controller.lastProvisionalEventCandidateStartResetEpoch << ','
                << record.controller.lastProvisionalEventCandidateStartHintSeenEpoch << ','
                << record.controller.lastProvisionalEventEndpointPublishedProduced << ','
                << record.controller.lastProvisionalEventPreviousCandidateGeneration << ','
                << record.controller.lastProvisionalEventPreviousCandidateStartConsumed << ','
                << record.controller.lastProvisionalEventPreviousCandidateStartTicks << ','
                << record.controller.lastProvisionalEventPreviousCandidateStartProduced << ','
                << record.controller.lastProvisionalEventPreviousCandidateStartPublishedProduced << ','
                << record.controller.lastProvisionalEventPreviousCandidateStartLevelPostConsumption << ','
                << record.controller.lastProvisionalEventPreviousCandidateStartLevelPostWrite << ','
                << record.controller.lastProvisionalEventPreviousCandidateStartContinuityEpoch << ','
                << record.controller.lastProvisionalEventPreviousCandidateStartResetEpoch << ','
                << record.controller.lastProvisionalEventPreviousCandidateStartHintSeenEpoch << ','
                << record.controller.lastProvisionalEventPreviousCandidateDirection << ','
                << record.controller.ticksPublishedTotal << ','
                << (record.controller.fastHighEscrowInitialized ? 1 : 0) << ','
                << (record.controller.fastHighEscrowActive ? 1 : 0) << ','
                << (record.controller.fastHighEscrowReferenceIsOverride ? 1 : 0) << ','
                << record.controller.fastHighEscrowOwnerGeneration << ','
                << record.controller.fastHighEscrowReferenceTicks << ','
                << record.controller.fastHighEscrowReferenceConsumed << ','
                << record.controller.fastHighEscrowRate << ','
                << record.controller.fastHighEscrowStartTicks << ','
                << record.controller.fastHighEscrowStartPublishedProduced << ','
                << record.controller.fastHighEscrowStartConsumed << ','
                << record.controller.fastHighEscrowStartConsumedProduced << ','
                << record.controller.fastHighEscrowStartLevelPostConsumption << ','
                << record.controller.fastHighEscrowStartLevelPostWrite << ','
                << record.controller.fastHighEscrowStartContinuityEpoch << ','
                << record.controller.fastHighEscrowStartResetEpoch << ','
                << record.controller.fastHighEscrowStartHintSeenEpoch << ','
                << record.controller.fastHighEscrowGrantFrames << ','
                << record.controller.fastHighEscrowSpentFrames << ','
                << record.controller.fastHighEscrowRemainingFrames << ','
                << record.controller.fastHighEscrowBirthCount << ','
                << record.controller.lastFastHighEscrowBirthUpdateId << ','
                << record.controller.lastFastHighEscrowBirthOwnerGeneration << ','
                << record.controller.lastFastHighEscrowBirthReferenceTicks << ','
                << record.controller.lastFastHighEscrowBirthReferenceConsumed << ','
                << (record.controller.lastFastHighEscrowBirthReferenceWasOverride ? 1 : 0) << ','
                << record.controller.lastFastHighEscrowBirthRate << ','
                << record.controller.lastFastHighEscrowBirthStartTicks << ','
                << record.controller.lastFastHighEscrowBirthStartPublishedProduced << ','
                << record.controller.lastFastHighEscrowBirthStartConsumed << ','
                << record.controller.lastFastHighEscrowBirthStartConsumedProduced << ','
                << record.controller.lastFastHighEscrowBirthStartLevelPostConsumption << ','
                << record.controller.lastFastHighEscrowBirthStartLevelPostWrite << ','
                << record.controller.lastFastHighEscrowBirthStartContinuityEpoch << ','
                << record.controller.lastFastHighEscrowBirthStartResetEpoch << ','
                << record.controller.lastFastHighEscrowBirthStartHintSeenEpoch << ','
                << record.controller.lastFastHighEscrowBirthGrantFrames << ','
                << record.controller.fastHighEscrowSpendCount << ','
                << record.controller.lastFastHighEscrowSpendUpdateId << ','
                << record.controller.lastFastHighEscrowSpentFrames << ','
                << record.controller.lastFastHighEscrowRemainingFrames << ','
                << record.controller.fastHighEscrowOverlayCount << ','
                << record.controller.lastFastHighEscrowOverlayUpdateId << ','
                << record.controller.lastFastHighEscrowOverlayRemainingFrames << ','
                << record.controller.lastFastHighEscrowOverlaySkew << ','
                << record.controller.fastHighEscrowClearCount << ','
                << record.controller.lastFastHighEscrowClearUpdateId << ','
                << record.controller.lastFastHighEscrowClearReasons << ','
                << record.controller.lastFastHighEscrowClearOwnerGeneration << ','
                << record.controller.lastFastHighEscrowClearGrantFrames << ','
                << record.controller.lastFastHighEscrowClearSpentFrames << ','
                << record.controller.fastHighEscrowGuardSkew << ','
                << record.controller.lastFastHighEscrowBirthGuardSkew << ','
                << record.controller.fastHighEscrowHorizonFrames << ','
                << record.controller.lastFastHighEscrowBirthHorizonFrames << ','
                << record.controller.fastTargetChangePhaseFrontierOrigin << ','
                << (record.controller.fastTargetChangePhaseFrontierValid ? 1 : 0) << ','
                << record.controller.fastTargetChangePhaseFrontierInvalidationCount << ','
                << record.controller.lastFastTargetChangePhaseFrontierInvalidationUpdateId << ','
                << record.controller.lastFastTargetChangePhaseFrontierInvalidationReasons << ','
                << record.controller.fastTargetChangePhaseFrontierEvaluationCount << ','
                << record.controller.lastFastTargetChangePhaseFrontierEvaluationUpdateId << ','
                << record.controller.lastFastTargetChangePhaseFrontierEvaluationOrigin << ','
                << record.controller.lastFastTargetChangePhaseFrontierEvaluationRejectMask << ','
                << (record.controller.fastTargetChangePhaseEscrowActive ? 1 : 0) << ','
                << record.controller.fastTargetChangePhaseEscrowGrantFrames << ','
                << record.controller.fastTargetChangePhaseEscrowGuardSkew << ','
                << record.controller.fastTargetChangePhaseEscrowOverlaySkew << ','
                << record.controller.fastTargetChangePhaseEscrowReferenceRate << ','
                << record.controller.fastTargetChangePhaseEscrowStartTicks << ','
                << record.controller.fastTargetChangePhaseEscrowStartConsumed << ','
                << record.controller.fastTargetChangePhaseEscrowStartConsumedProduced << ','
                << record.controller.fastTargetChangePhaseEscrowStartPublishedProduced << ','
                << record.controller.fastTargetChangePhaseEscrowStartLevelPostConsumption << ','
                << record.controller.fastTargetChangePhaseEscrowStartLevelPostWrite << ','
                << record.controller.fastTargetChangePhaseEscrowStartContinuityEpoch << ','
                << record.controller.fastTargetChangePhaseEscrowStartResetEpoch << ','
                << record.controller.fastTargetChangePhaseEscrowStartHintSeenEpoch << ','
                << record.controller.fastTargetChangePhaseEscrowStartCandidateGeneration << ','
                << record.controller.fastTargetChangePhaseEscrowElapsedPublishedTicks << ','
                << record.controller.fastTargetChangePhaseEscrowCurrentPhysicalPrefix << ','
                << record.controller.fastTargetChangePhaseEscrowBirthCount << ','
                << record.controller.lastFastTargetChangePhaseEscrowBirthUpdateId << ','
                << record.controller.lastFastTargetChangePhaseEscrowBirthGrantFrames << ','
                << record.controller.lastFastTargetChangePhaseEscrowBirthGuardSkew << ','
                << record.controller.fastTargetChangePhaseEscrowClearCount << ','
                << record.controller.lastFastTargetChangePhaseEscrowClearUpdateId << ','
                << record.controller.lastFastTargetChangePhaseEscrowClearReasons << ','
                << record.controller.lastFastTargetChangePhaseEscrowClearGrantFrames << ','
                << record.controller.lastFastTargetChangePhaseEscrowClearOverlaySkew << ','
                << (record.controller.sustainedProvisionalPhaseActive ? 1 : 0) << ','
                << record.controller.sustainedProvisionalPhaseCandidateGeneration << ','
                << record.controller.sustainedProvisionalPhaseOwnerGeneration << ','
                << record.controller.sustainedProvisionalPhaseParentRatio << ','
                << record.controller.sustainedProvisionalPhaseSkew << ','
                << record.controller.sustainedProvisionalPhaseFrontierFrames << ','
                << record.controller.sustainedProvisionalPhaseBackingFrames << ','
                << record.controller.sustainedProvisionalPhasePublicationReserveFrames << ','
                << record.controller.sustainedProvisionalPhaseReservedPublicationCount << ','
                << record.controller.sustainedProvisionalPhaseBirthCount << ','
                << record.controller.lastSustainedProvisionalPhaseBirthUpdateId << ','
                << record.controller.lastSustainedProvisionalPhaseBirthCandidateGeneration << ','
                << record.controller.lastSustainedProvisionalPhaseBirthParentRatio << ','
                << record.controller.lastSustainedProvisionalPhaseBirthSkew << ','
                << record.controller.lastSustainedProvisionalPhaseBirthFrontierFrames << ','
                << record.controller.lastSustainedProvisionalPhaseBirthBackingFrames << ','
                << record.controller.lastSustainedProvisionalPhaseBirthPublicationReserveFrames << ','
                << record.controller.lastSustainedProvisionalPhaseBirthReservedPublicationCount << ','
                << record.controller.sustainedProvisionalPhaseStepCount << ','
                << record.controller.lastSustainedProvisionalPhaseStepUpdateId << ','
                << record.controller.lastSustainedProvisionalPhaseStepCandidateGeneration << ','
                << record.controller.lastSustainedProvisionalPhaseStepPreviousSkew << ','
                << record.controller.lastSustainedProvisionalPhaseStepSkew << ','
                << record.controller.lastSustainedProvisionalPhaseStepFrontierFrames << ','
                << record.controller.lastSustainedProvisionalPhaseStepBackingFrames << ','
                << record.controller.lastSustainedProvisionalPhaseStepPublicationReserveFrames << ','
                << record.controller.lastSustainedProvisionalPhaseStepReservedPublicationCount << ','
                << record.controller.sustainedProvisionalPhaseClearCount << ','
                << record.controller.lastSustainedProvisionalPhaseClearUpdateId << ','
                << record.controller.lastSustainedProvisionalPhaseClearReasons << ','
                << record.controller.lastSustainedProvisionalPhaseClearCandidateGeneration << ','
                << record.controller.lastSustainedProvisionalPhaseClearSkew << ','
                << record.controller.lastSustainedProvisionalPhaseClearReservedPublicationCount << ','
                << record.controller.sustainedProvisionalPhaseApplicationConflictCount << ','
                << record.controller.lastSustainedProvisionalPhaseApplicationConflictUpdateId << ','
                << record.xrunCount
                << '\n';
        }
        csv.flush();
        writesSucceeded = csv.good();
    }

    if (writesSucceeded)
    {
        std::ofstream csv(packetsCsvPath, std::ios::trunc);
        csv << "capture_packet_index,source_pcm_frame_offset,captured_source_frames,"
            "packet_id,update_id,ticks_before,ticks_after,"
            "source_produced_before,source_produced_after,source_frames,accepted_source_prefix_frames,dropped_frames,dropped_packets,"
            "transport_accepted_before,transport_accepted_after,transport_removed,transport_real_drained,transport_discarded,transport_lineage_epoch,"
            "host_consumed,ticks_at_consumption,frames_at_consumption,physical_level_before_write,physical_level_post_write,logical_level_before_write,logical_level_post_write,"
            "continuity_epoch,reset_requested_epoch,reset_confirmed_epoch,hint_seen_epoch,candidate_generation,owner_generation,controller_ratio,desired_skew,source_applied_skew,time_stretch_input_frames,time_stretch_output_frames,blip_rate_skew,applied_skew,"
            "sustained_provisional_phase_active,sustained_provisional_phase_candidate_generation,sustained_provisional_phase_owner_generation,"
            "sustained_provisional_phase_parent_ratio,sustained_provisional_phase_skew,sustained_provisional_phase_frontier_frames,sustained_provisional_phase_backing_frames,"
            "sustained_provisional_phase_publication_reserve_frames,sustained_provisional_phase_reserved_publication_count,"
            "sustained_provisional_phase_birth_count,last_sustained_provisional_phase_birth_update_id,"
            "sustained_provisional_phase_step_count,last_sustained_provisional_phase_step_update_id,last_sustained_provisional_phase_step_previous_skew,last_sustained_provisional_phase_step_skew,"
            "sustained_provisional_phase_clear_count,last_sustained_provisional_phase_clear_update_id,last_sustained_provisional_phase_clear_reasons,"
            "sustained_provisional_phase_application_conflict_count,last_sustained_provisional_phase_application_conflict_update_id\n";
        csv << std::setprecision(17);
        for (std::uint64_t i = 0; i < storedProducerRecordCount; ++i)
        {
            const ProducerPacketRecord& record =
                producerRecords[static_cast<std::size_t>(i)];
            const auto& value = record.observation;
            csv << record.capturePacketIndex << ','
                << record.sourcePcmFrameOffset << ','
                << record.capturedSourceFrames << ','
                << value.packetId << ','
                << value.updateId << ','
                << value.ticksBefore << ','
                << value.ticksAfter << ','
                << value.sourceProducedFramesBefore << ','
                << value.sourceProducedFramesAfter << ','
                << value.sourceFrames << ','
                << value.acceptedSourcePrefixFrames << ','
                << value.droppedFrames << ','
                << value.droppedPackets << ','
                << value.transportAcceptedFramesBefore << ','
                << value.transportAcceptedFramesAfter << ','
                << value.transportRemovedFrames << ','
                << value.transportRealDrainedFrames << ','
                << value.transportDiscardedFrames << ','
                << value.transportLineageEpoch << ','
                << value.hostConsumed << ','
                << value.ticksAtConsumption << ','
                << value.framesAtConsumption << ','
                << value.physicalLevelBeforeWrite << ','
                << value.physicalLevelPostWrite << ','
                << value.logicalLevelBeforeWrite << ','
                << value.logicalLevelPostWrite << ','
                << value.continuityEpoch << ','
                << value.resetRequestedEpoch << ','
                << value.resetConfirmedEpoch << ','
                << value.hintSeenEpoch << ','
                << value.sustainedCandidateGeneration << ','
                << value.sustainedOwnerGeneration << ','
                << value.controllerRatio << ','
                << value.desiredSkew << ','
                << value.sourceAppliedSkew << ','
                << value.timeStretchInputFrames << ','
                << value.timeStretchOutputFrames << ','
                << value.blipRateSkew << ','
                << value.appliedSkew << ','
                << (value.sustainedProvisionalPhaseActive ? 1 : 0) << ','
                << value.sustainedProvisionalPhaseCandidateGeneration << ','
                << value.sustainedProvisionalPhaseOwnerGeneration << ','
                << value.sustainedProvisionalPhaseParentRatio << ','
                << value.sustainedProvisionalPhaseSkew << ','
                << value.sustainedProvisionalPhaseFrontierFrames << ','
                << value.sustainedProvisionalPhaseBackingFrames << ','
                << value.sustainedProvisionalPhasePublicationReserveFrames << ','
                << value.sustainedProvisionalPhaseReservedPublicationCount << ','
                << value.sustainedProvisionalPhaseBirthCount << ','
                << value.lastSustainedProvisionalPhaseBirthUpdateId << ','
                << value.sustainedProvisionalPhaseStepCount << ','
                << value.lastSustainedProvisionalPhaseStepUpdateId << ','
                << value.lastSustainedProvisionalPhaseStepPreviousSkew << ','
                << value.lastSustainedProvisionalPhaseStepSkew << ','
                << value.sustainedProvisionalPhaseClearCount << ','
                << value.lastSustainedProvisionalPhaseClearUpdateId << ','
                << value.lastSustainedProvisionalPhaseClearReasons << ','
                << value.sustainedProvisionalPhaseApplicationConflictCount << ','
                << value.lastSustainedProvisionalPhaseApplicationConflictUpdateId
                << '\n';
        }
        csv.flush();
        writesSucceeded = csv.good();
    }

    if (writesSucceeded)
    {
        std::ofstream csv(drainsCsvPath, std::ios::trunc);
        csv << "callback_index,pcm_frame_offset,stream_generation,callback_start_ns,pcm_ready_ns,volume,has_active_instance,valid,"
            "requested_frames,returned_frames,inactive_zero_frames,priming_zero_frames,real_ramp_in_frames,real_unmodified_frames,underrun_ramp_out_frames,underrun_zero_frames,unclassified_frames,"
            "host_consumed_before,host_consumed_after,ticks_at_demand,frames_produced_at_demand,physical_level_before,physical_level_after,logical_level_before,logical_level_after,"
            "transport_accepted_frames,transport_removed_before,transport_removed_after,transport_real_drained_before,transport_real_drained_after,transport_discarded_before,transport_discarded_after,transport_lineage_epoch_before,transport_lineage_epoch_after,"
            "continuity_epoch_before,continuity_epoch_after,reset_requested_epoch_before,reset_requested_epoch_after,reset_seen_epoch_before,reset_seen_epoch_after,reset_confirmed_epoch_before,reset_confirmed_epoch_after,"
            "underruns_before,underruns_after,priming_frames_before,priming_frames_after\n";
        for (std::uint64_t i = 0; i < storedRecordCount; ++i)
        {
            const CallbackRecord& record = records[static_cast<std::size_t>(i)];
            const auto& value = record.drain;
            csv << record.callbackIndex << ','
                << record.pcmFrameOffset << ','
                << record.streamGeneration << ','
                << record.callbackStartNs << ','
                << record.pcmReadyNs << ','
                << record.volume << ','
                << record.hasActiveInstance << ','
                << (value.valid ? 1 : 0) << ','
                << value.requestedFrames << ','
                << value.returnedFrames << ','
                << value.inactiveZeroFrames << ','
                << value.primingZeroFrames << ','
                << value.realRampInFrames << ','
                << value.realUnmodifiedFrames << ','
                << value.underrunRampOutFrames << ','
                << value.underrunZeroFrames << ','
                << value.unclassifiedFrames << ','
                << value.hostConsumedBefore << ','
                << value.hostConsumedAfter << ','
                << value.ticksAtDemand << ','
                << value.framesProducedAtDemand << ','
                << value.physicalLevelBefore << ','
                << value.physicalLevelAfter << ','
                << value.logicalLevelBefore << ','
                << value.logicalLevelAfter << ','
                << value.transportAcceptedFrames << ','
                << value.transportRemovedFramesBefore << ','
                << value.transportRemovedFramesAfter << ','
                << value.transportRealDrainedFramesBefore << ','
                << value.transportRealDrainedFramesAfter << ','
                << value.transportDiscardedFramesBefore << ','
                << value.transportDiscardedFramesAfter << ','
                << value.transportLineageEpochBefore << ','
                << value.transportLineageEpochAfter << ','
                << value.continuityEpochBefore << ','
                << value.continuityEpochAfter << ','
                << value.resetRequestedEpochBefore << ','
                << value.resetRequestedEpochAfter << ','
                << value.resetSeenEpochBefore << ','
                << value.resetSeenEpochAfter << ','
                << value.resetConfirmedEpochBefore << ','
                << value.resetConfirmedEpochAfter << ','
                << value.underrunsBefore << ','
                << value.underrunsAfter << ','
                << value.primingFramesBefore << ','
                << value.primingFramesAfter << '\n';
        }
        csv.flush();
        writesSucceeded = csv.good();
    }

    if (writesSucceeded)
    {
        std::ofstream json(jsonPath, std::ios::trunc);
        json << buildResultJson(
            true, "dump", "captured", finalDirectory, "complete") << '\n';
        json.flush();
        writesSucceeded = json.good();
    }

    if (writesSucceeded)
    {
        writesSucceeded = fsyncPath(wavPath) && fsyncPath(csvPath) &&
            fsyncPath(sourceWavPath) && fsyncPath(packetsCsvPath) &&
            fsyncPath(drainsCsvPath) && fsyncPath(jsonPath) &&
            fsyncPath(stagingDirectory);
    }
    bool parentSyncSucceeded = true;
    int parentSyncErrno = 0;
    if (writesSucceeded)
    {
        writesSucceeded = renameDirectoryNoReplace(stagingDirectory, finalDirectory);
        if (writesSucceeded)
        {
            outputPublished = true;
            parentSyncSucceeded = fsyncPath(parentDirectoryOf(finalDirectory));
            if (!parentSyncSucceeded)
                parentSyncErrno = errno;
        }
    }

    if (!writesSucceeded)
    {
        const std::string detail = "write_or_publish_failed_errno_" + std::to_string(errno);
        state.store(Complete, std::memory_order_release);
        return buildResultJson(false, "dump", detail, stagingDirectory);
    }

    const std::string publishDetail = parentSyncSucceeded
        ? "published"
        : "published_parent_fsync_failed_errno_" + std::to_string(parentSyncErrno);
    const std::string result = buildResultJson(
        true, "dump", publishDetail, finalDirectory, "idle");
    std::vector<std::int16_t>().swap(pcm);
    std::vector<CallbackRecord>().swap(records);
    std::vector<std::int16_t>().swap(sourcePcm);
    std::vector<ProducerPacketRecord>().swap(producerRecords);
    state.store(Idle, std::memory_order_release);
    return result;
    }
    catch (...)
    {
        if (outputPublished)
        {
            std::vector<std::int16_t>().swap(pcm);
            std::vector<CallbackRecord>().swap(records);
            std::vector<std::int16_t>().swap(sourcePcm);
            std::vector<ProducerPacketRecord>().swap(producerRecords);
            state.store(Idle, std::memory_order_release);
        }
        else
        {
            state.store(Complete, std::memory_order_release);
        }
        throw;
    }
}

std::string AudioOutputCapture::buildResultJson(
    bool success,
    const char* operation,
    const std::string& detail,
    const std::string& outputDirectory,
    const char* stateOverride
) const
{
    const std::uint32_t currentState = state.load(std::memory_order_acquire);
    const char* stateName = "unknown";
    switch (currentState)
    {
    case Idle: stateName = "idle"; break;
    case Preparing: stateName = "preparing"; break;
    case Capturing: stateName = "capturing"; break;
    case Stopping: stateName = "stopping"; break;
    case Complete: stateName = "complete"; break;
    case Consuming: stateName = "consuming"; break;
    }
    if (stateOverride != nullptr)
        stateName = stateOverride;

    std::ostringstream stream;
    const std::uint64_t callbackMetadataDropped =
        callbackCount - storedRecordCount;
    const std::uint64_t producerMetadataDropped =
        producerPacketCount - storedProducerRecordCount;
    const std::uint32_t callbackOverlapSkipped =
        overlapWord.load(std::memory_order_relaxed) & OverlapCountMask;
    const std::uint32_t sessionSkipped =
        staleSessionSkipped.load(std::memory_order_relaxed);
    const std::uint32_t streamSkipped =
        staleStreamSkipped.load(std::memory_order_relaxed);
    const std::uint32_t producerSkipped =
        staleProducerSkipped.load(std::memory_order_relaxed);
    const bool provenanceComplete = producerPacketCount > 0
        && sourceOfferedFrames > 0
        && sourceWrittenFrames > 0
        && callbackCount > 0
        && writtenFrames > 0
        && callbackOverlapSkipped == 0
        && sessionSkipped == 0
        && streamSkipped == 0
        && sourceTruncatedFrames == 0
        && producerMetadataDropped == 0
        && producerSkipped == 0
        && callbackMetadataDropped == 0
        && drainUnclassifiedFrames == 0;
    stream << "{\"success\":" << (success ? 1 : 0)
           << ",\"schemaVersion\":4"
           << ",\"operation\":\"" << jsonEscape(operation) << "\""
           << ",\"detail\":\"" << jsonEscape(detail) << "\""
           << ",\"state\":\"" << stateName << "\""
           << ",\"sessionId\":" << sessionId
           << ",\"minimumStreamGeneration\":" << minimumStreamGeneration
           << ",\"durationMs\":" << durationMs
           << ",\"targetFrames\":" << targetFrames
           << ",\"capturedFrames\":" << writtenFrames
           << ",\"pcmBytes\":" << (writtenFrames * ChannelCount * sizeof(std::int16_t))
           << ",\"callbacks\":" << callbackCount
           << ",\"storedRecords\":" << storedRecordCount
           << ",\"metadataDropped\":" << callbackMetadataDropped
           << ",\"overlapSkipped\":" << callbackOverlapSkipped
           << ",\"staleSessionSkipped\":" << sessionSkipped
           << ",\"staleStreamSkipped\":" << streamSkipped
           << ",\"sourceCapacityFrames\":" << sourceCapacityFrames
           << ",\"sourceOfferedFrames\":" << sourceOfferedFrames
           << ",\"sourceCapturedFrames\":" << sourceWrittenFrames
           << ",\"sourcePcmBytes\":"
           << (sourceWrittenFrames * ChannelCount * sizeof(std::int16_t))
           << ",\"sourceTruncatedFrames\":" << sourceTruncatedFrames
           << ",\"producerPackets\":" << producerPacketCount
           << ",\"storedProducerRecords\":" << storedProducerRecordCount
           << ",\"producerMetadataDropped\":" << producerMetadataDropped
           << ",\"staleProducerSkipped\":" << producerSkipped
           << ",\"drainInactiveZeroFrames\":" << drainInactiveZeroFrames
           << ",\"drainPrimingZeroFrames\":" << drainPrimingZeroFrames
           << ",\"drainRealRampInFrames\":" << drainRealRampInFrames
           << ",\"drainRealUnmodifiedFrames\":"
           << drainRealUnmodifiedFrames
           << ",\"drainUnderrunRampOutFrames\":"
           << drainUnderrunRampOutFrames
           << ",\"drainUnderrunZeroFrames\":" << drainUnderrunZeroFrames
           << ",\"drainUnclassifiedFrames\":" << drainUnclassifiedFrames
           << ",\"provenanceComplete\":"
           << (provenanceComplete ? 1 : 0)
           << ",\"terminalReason\":\""
           << terminalReasonName(static_cast<std::uint32_t>(terminalReason)) << "\""
           << ",\"armedAtNs\":" << armedAtNs
           << ",\"completedAtNs\":" << completedAtNs;
    if (!outputDirectory.empty())
        stream << ",\"outputDirectory\":\"" << jsonEscape(outputDirectory) << "\"";
    stream << '}';
    return stream.str();
}

}
