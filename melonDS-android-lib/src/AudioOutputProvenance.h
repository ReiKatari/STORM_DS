/*
    Copyright 2016-2025 melonDS team

    This file is part of melonDS.

    melonDS is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.
*/

#ifndef AUDIOOUTPUTPROVENANCE_H
#define AUDIOOUTPUTPROVENANCE_H

#include <cstdint>

namespace melonDS
{

struct AudioOutputProducerPacketObservation
{
    std::uint64_t packetId = 0;
    std::uint64_t updateId = 0;
    std::uint64_t ticksBefore = 0;
    std::uint64_t ticksAfter = 0;
    std::uint64_t sourceProducedFramesBefore = 0;
    std::uint64_t sourceProducedFramesAfter = 0;
    std::uint32_t sourceFrames = 0;
    std::uint32_t acceptedSourcePrefixFrames = 0;
    std::uint32_t droppedFrames = 0;
    std::uint32_t droppedPackets = 0;

    std::uint64_t transportAcceptedFramesBefore = 0;
    std::uint64_t transportAcceptedFramesAfter = 0;
    std::uint64_t transportRemovedFrames = 0;
    std::uint64_t transportRealDrainedFrames = 0;
    std::uint64_t transportDiscardedFrames = 0;
    std::uint64_t transportLineageEpoch = 0;

    std::uint64_t hostConsumed = 0;
    std::uint64_t ticksAtConsumption = 0;
    std::uint64_t framesAtConsumption = 0;
    std::uint64_t physicalLevelBeforeWrite = 0;
    std::uint64_t physicalLevelPostWrite = 0;
    std::uint64_t logicalLevelBeforeWrite = 0;
    std::uint64_t logicalLevelPostWrite = 0;

    std::uint64_t continuityEpoch = 0;
    std::uint32_t resetRequestedEpoch = 0;
    std::uint32_t resetConfirmedEpoch = 0;
    std::uint32_t hintSeenEpoch = 0;
    std::uint64_t sustainedCandidateGeneration = 0;
    std::uint64_t sustainedOwnerGeneration = 0;

    double controllerRatio = 0.0;
    double desiredSkew = 0.0;

    double sourceAppliedSkew = 0.0;
    std::uint32_t timeStretchInputFrames = 0;
    std::uint32_t timeStretchOutputFrames = 0;
    double blipRateSkew = 1.0;
    double appliedSkew = 0.0;

    bool sustainedProvisionalPhaseActive = false;
    std::uint64_t sustainedProvisionalPhaseCandidateGeneration = 0;
    std::uint64_t sustainedProvisionalPhaseOwnerGeneration = 0;
    double sustainedProvisionalPhaseParentRatio = 0.0;
    double sustainedProvisionalPhaseSkew = 0.0;
    std::uint64_t sustainedProvisionalPhaseFrontierFrames = 0;
    std::uint64_t sustainedProvisionalPhaseBackingFrames = 0;
    std::uint64_t sustainedProvisionalPhasePublicationReserveFrames = 0;
    std::uint32_t sustainedProvisionalPhaseReservedPublicationCount = 0;
    std::uint64_t sustainedProvisionalPhaseBirthCount = 0;
    std::uint64_t lastSustainedProvisionalPhaseBirthUpdateId = 0;
    std::uint64_t sustainedProvisionalPhaseStepCount = 0;
    std::uint64_t lastSustainedProvisionalPhaseStepUpdateId = 0;
    double lastSustainedProvisionalPhaseStepPreviousSkew = 0.0;
    double lastSustainedProvisionalPhaseStepSkew = 0.0;
    std::uint64_t sustainedProvisionalPhaseClearCount = 0;
    std::uint64_t lastSustainedProvisionalPhaseClearUpdateId = 0;
    std::uint32_t lastSustainedProvisionalPhaseClearReasons = 0;
    std::uint64_t sustainedProvisionalPhaseApplicationConflictCount = 0;
    std::uint64_t lastSustainedProvisionalPhaseApplicationConflictUpdateId = 0;
};

struct AudioOutputDrainObservation
{
    bool valid = false;
    std::uint32_t requestedFrames = 0;
    std::uint32_t returnedFrames = 0;
    std::uint32_t inactiveZeroFrames = 0;
    std::uint32_t primingZeroFrames = 0;
    std::uint32_t realRampInFrames = 0;
    std::uint32_t realUnmodifiedFrames = 0;
    std::uint32_t underrunRampOutFrames = 0;
    std::uint32_t underrunZeroFrames = 0;
    std::uint32_t unclassifiedFrames = 0;

    std::uint64_t hostConsumedBefore = 0;
    std::uint64_t hostConsumedAfter = 0;
    std::uint64_t ticksAtDemand = 0;
    std::uint64_t framesProducedAtDemand = 0;
    std::uint64_t physicalLevelBefore = 0;
    std::uint64_t physicalLevelAfter = 0;
    std::uint64_t logicalLevelBefore = 0;
    std::uint64_t logicalLevelAfter = 0;

    std::uint64_t transportAcceptedFrames = 0;
    std::uint64_t transportRemovedFramesBefore = 0;
    std::uint64_t transportRemovedFramesAfter = 0;
    std::uint64_t transportRealDrainedFramesBefore = 0;
    std::uint64_t transportRealDrainedFramesAfter = 0;
    std::uint64_t transportDiscardedFramesBefore = 0;
    std::uint64_t transportDiscardedFramesAfter = 0;
    std::uint64_t transportLineageEpochBefore = 0;
    std::uint64_t transportLineageEpochAfter = 0;

    std::uint64_t continuityEpochBefore = 0;
    std::uint64_t continuityEpochAfter = 0;
    std::uint32_t resetRequestedEpochBefore = 0;
    std::uint32_t resetRequestedEpochAfter = 0;
    std::uint32_t resetSeenEpochBefore = 0;
    std::uint32_t resetSeenEpochAfter = 0;
    std::uint32_t resetConfirmedEpochBefore = 0;
    std::uint32_t resetConfirmedEpochAfter = 0;
    std::uint32_t underrunsBefore = 0;
    std::uint32_t underrunsAfter = 0;
    std::uint64_t primingFramesBefore = 0;
    std::uint64_t primingFramesAfter = 0;
};

inline std::uint32_t AudioOutputDrainClassifiedFrames(
    const AudioOutputDrainObservation& observation) noexcept
{
    return observation.inactiveZeroFrames
        + observation.primingZeroFrames
        + observation.realRampInFrames
        + observation.realUnmodifiedFrames
        + observation.underrunRampOutFrames
        + observation.underrunZeroFrames
        + observation.unclassifiedFrames;
}

class AudioOutputObservationSink
{
public:
    virtual ~AudioOutputObservationSink() = default;
    virtual void OnAudioOutputProducerPacket(
        const std::int16_t* interleavedPcm,
        std::uint32_t frames,
        const AudioOutputProducerPacketObservation& observation) noexcept = 0;
};

}

#endif
