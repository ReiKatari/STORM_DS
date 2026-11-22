/*
    Copyright 2016-2025 melonDS team

    This file is part of melonDS.

    melonDS is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.

    melonDS is distributed in the hope that it will be useful, but WITHOUT ANY
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
    FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with melonDS. If not, see http://www.gnu.org/licenses/.
*/

#ifndef AUDIOOUTPUTADAPTIVETELEMETRY_H
#define AUDIOOUTPUTADAPTIVETELEMETRY_H

#include <array>
#include <atomic>
#include <cstddef>
#include <cstdint>
#include <cstring>

namespace melonDS
{

enum AudioOutputAdaptiveDecisionFlag : std::uint32_t
{
    AudioOutputAdaptiveMode = 1u << 0,
    AudioOutputAdaptiveControllerRan = 1u << 1,
    AudioOutputAdaptiveResetRebased = 1u << 2,
    AudioOutputAdaptiveHintConsumed = 1u << 3,
    AudioOutputAdaptiveProbeAtFastGate = 1u << 4,
    AudioOutputAdaptiveProbeAfter = 1u << 5,
    AudioOutputAdaptiveLevelOutside = 1u << 6,
    AudioOutputAdaptiveFastWindow = 1u << 7,
    AudioOutputAdaptiveFastUrgency = 1u << 8,
    AudioOutputAdaptiveEstimatorFast = 1u << 9,
    AudioOutputAdaptiveEstimatorSlow = 1u << 10,
    AudioOutputAdaptiveMeasurementValid = 1u << 11,
    AudioOutputAdaptiveFastAccepted = 1u << 12,
    AudioOutputAdaptiveSlowApplied = 1u << 13,
    AudioOutputAdaptiveRatioCappedByHint = 1u << 14,
    AudioOutputAdaptiveApplyImmediate = 1u << 15,
    AudioOutputAdaptiveSlewBranch = 1u << 16,
    AudioOutputAdaptiveOutputSkewChanged = 1u << 17,
    AudioOutputAdaptiveLevelAtOrAboveSafe = 1u << 18,
    AudioOutputAdaptiveResetBlocked = 1u << 19,
    AudioOutputAdaptiveHintDescendingImmediate = 1u << 20,
    AudioOutputAdaptiveHintProbeOrUpward = 1u << 21,
    AudioOutputAdaptiveGuardApplied = 1u << 22,
    AudioOutputAdaptiveSlewUp = 1u << 23,
    AudioOutputAdaptiveSlewDown = 1u << 24,
    AudioOutputAdaptiveSlewSnap = 1u << 25,
    AudioOutputAdaptiveModeBlocked = 1u << 26,
    AudioOutputAdaptivePrimingHintOnly = 1u << 27,
    AudioOutputAdaptiveContinuityRebased = 1u << 28,
    AudioOutputAdaptiveLowDeferred = 1u << 29,
    AudioOutputAdaptiveLowConfirmed = 1u << 30,
    AudioOutputAdaptiveLowRejectedByLevel = 1u << 31,
};

enum AudioOutputAdaptiveSustainedStateFlag : std::uint32_t
{
    AudioOutputAdaptiveSustainedSegmentOneComplete = 1u << 0,
    AudioOutputAdaptiveSustainedCandidateReplacement = 1u << 1,
    AudioOutputAdaptiveSustainedReplacementVerification = 1u << 2,
    AudioOutputAdaptiveSustainedFastOverride = 1u << 3,
    AudioOutputAdaptiveSustainedParentIsHint = 1u << 4,
    AudioOutputAdaptiveSustainedEffectivePhase = 1u << 5,
    AudioOutputAdaptiveSustainedFastHighWitness = 1u << 6,
    AudioOutputAdaptiveSustainedFastHighGuard = 1u << 7,
    AudioOutputAdaptiveSustainedFastHighCapacity = 1u << 8,
    AudioOutputAdaptiveSustainedFastLowWitness = 1u << 9,
    AudioOutputAdaptiveSustainedFastHighEscrowInitialized = 1u << 10,
    AudioOutputAdaptiveSustainedFastHighEscrowActive = 1u << 11,
};

enum AudioOutputAdaptiveFastHighEscrowClearReason : std::uint32_t
{
    AudioOutputAdaptiveFastHighEscrowClearNone = 0,
    AudioOutputAdaptiveFastHighEscrowClearWitness = 1u << 0,
    AudioOutputAdaptiveFastHighEscrowClearOwnerGeneration = 1u << 1,
    AudioOutputAdaptiveFastHighEscrowClearReference = 1u << 2,
    AudioOutputAdaptiveFastHighEscrowClearRate = 1u << 3,
    AudioOutputAdaptiveFastHighEscrowClearContinuity = 1u << 4,
    AudioOutputAdaptiveFastHighEscrowClearReset = 1u << 5,
    AudioOutputAdaptiveFastHighEscrowClearHintChange = 1u << 6,
    AudioOutputAdaptiveFastHighEscrowClearPriming = 1u << 7,
    AudioOutputAdaptiveFastHighEscrowClearDrop = 1u << 8,
    AudioOutputAdaptiveFastHighEscrowClearCounterRegression = 1u << 9,
    AudioOutputAdaptiveFastHighEscrowClearPcmConservation = 1u << 10,
    AudioOutputAdaptiveFastHighEscrowClearCounterRange = 1u << 11,
    AudioOutputAdaptiveFastHighEscrowClearHostIntervalLost = 1u << 12,
    AudioOutputAdaptiveFastHighEscrowClearEpisodeExhausted = 1u << 13,
};

enum AudioOutputAdaptiveFastLowWitnessBirthKind : std::uint32_t
{
    AudioOutputAdaptiveFastLowWitnessBirthNone = 0,
    AudioOutputAdaptiveFastLowWitnessBirthOneFrameFrontier = 1,
    AudioOutputAdaptiveFastLowWitnessBirthFastObservation = 2,
};

enum AudioOutputAdaptiveFastLowWitnessClearReason : std::uint32_t
{
    AudioOutputAdaptiveFastLowWitnessClearNone = 0,
    AudioOutputAdaptiveFastLowWitnessClearContinuity = 1u << 0,
    AudioOutputAdaptiveFastLowWitnessClearReset = 1u << 1,
    AudioOutputAdaptiveFastLowWitnessClearHintChange = 1u << 2,
    AudioOutputAdaptiveFastLowWitnessClearPriming = 1u << 3,
    AudioOutputAdaptiveFastLowWitnessClearGlobalCounterRegression = 1u << 4,
    AudioOutputAdaptiveFastLowWitnessClearDrop = 1u << 5,
    AudioOutputAdaptiveFastLowWitnessClearRollback = 1u << 6,
    AudioOutputAdaptiveFastLowWitnessClearOwnerInactive = 1u << 7,
    AudioOutputAdaptiveFastLowWitnessClearOwnerGeneration = 1u << 8,
    AudioOutputAdaptiveFastLowWitnessClearWitnessCounterRegression = 1u << 9,
    AudioOutputAdaptiveFastLowWitnessClearObservationNotLow = 1u << 10,
    AudioOutputAdaptiveFastLowWitnessClearPcmConservation = 1u << 11,
    AudioOutputAdaptiveFastLowWitnessClearRecoveredFrontier = 1u << 12,
    AudioOutputAdaptiveFastLowWitnessClearOverrideAccepted = 1u << 13,
    AudioOutputAdaptiveFastLowWitnessClearFastWindowUnavailable = 1u << 14,
    AudioOutputAdaptiveFastLowWitnessClearSustainedTransition = 1u << 15,
};

enum AudioOutputAdaptiveParentCapacityClearReason : std::uint32_t
{
    AudioOutputAdaptiveParentCapacityClearNone = 0,
    AudioOutputAdaptiveParentCapacityClearContinuity = 1u << 0,
    AudioOutputAdaptiveParentCapacityClearReset = 1u << 1,
    AudioOutputAdaptiveParentCapacityClearHintChange = 1u << 2,
    AudioOutputAdaptiveParentCapacityClearPriming = 1u << 3,
    AudioOutputAdaptiveParentCapacityClearCounterRegression = 1u << 4,
    AudioOutputAdaptiveParentCapacityClearPcmConservation = 1u << 5,
    AudioOutputAdaptiveParentCapacityClearRateChange = 1u << 6,
    AudioOutputAdaptiveParentCapacityClearDrop = 1u << 7,
};

enum AudioOutputAdaptiveSustainedObservationType : std::uint32_t
{
    AudioOutputAdaptiveSustainedObservationNone = 0,
    AudioOutputAdaptiveSustainedAcquireSegmentOne = 1,
    AudioOutputAdaptiveSustainedAcquireSegmentTwo = 2,
    AudioOutputAdaptiveSustainedReplacementSegmentOne = 3,
    AudioOutputAdaptiveSustainedReplacementSegmentTwo = 4,
    AudioOutputAdaptiveSustainedParentRecovery = 5,
};

enum AudioOutputAdaptiveSustainedTransitionKind : std::uint32_t
{
    AudioOutputAdaptiveSustainedTransitionNone = 0,
    AudioOutputAdaptiveSustainedAcquire = 1,
    AudioOutputAdaptiveSustainedReplace = 2,
    AudioOutputAdaptiveSustainedFastOverrideTransition = 3,
    AudioOutputAdaptiveSustainedRestoreOwner = 4,
    AudioOutputAdaptiveSustainedReleaseParent = 5,
    AudioOutputAdaptiveSustainedInvalidate = 6,
};

enum AudioOutputAdaptiveProvisionalFastStateFlag : std::uint32_t
{
    AudioOutputAdaptiveProvisionalFastLowPending = 1u << 0,
    AudioOutputAdaptiveProvisionalFastTargetChangePending = 1u << 1,
};

enum AudioOutputAdaptiveProvisionalEventFlag : std::uint32_t
{
    AudioOutputAdaptiveProvisionalFastStateChanged = 1u << 0,
    AudioOutputAdaptiveProvisionalFastAnchorChanged = 1u << 1,
    AudioOutputAdaptiveProvisionalCandidateBorn = 1u << 2,
    AudioOutputAdaptiveProvisionalCandidateCleared = 1u << 3,
    AudioOutputAdaptiveProvisionalCandidateObserved = 1u << 4,
    AudioOutputAdaptiveProvisionalFastAccepted = 1u << 5,
    AudioOutputAdaptiveProvisionalSustainedTransition = 1u << 6,
    AudioOutputAdaptiveProvisionalRateRecovery = 1u << 7,
    AudioOutputAdaptiveProvisionalResetChanged = 1u << 8,
    AudioOutputAdaptiveProvisionalContinuityChanged = 1u << 9,
    AudioOutputAdaptiveProvisionalHintChanged = 1u << 10,
    AudioOutputAdaptiveProvisionalDrop = 1u << 11,
    AudioOutputAdaptiveProvisionalPhaseIntervalInfeasible = 1u << 12,
};

enum AudioOutputAdaptiveFastTargetChangePhaseFrontierOrigin : std::uint32_t
{
    AudioOutputAdaptiveFastTargetChangePhaseFrontierNone = 0,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierOneFrame = 1,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierFastWindow = 2,
};

enum AudioOutputAdaptiveFastTargetChangePhaseFrontierInvalidationReason
    : std::uint32_t
{
    AudioOutputAdaptiveFastTargetChangePhaseFrontierInvalidationNone = 0,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierInvalidationAnchorRebase =
        1u << 0,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierInvalidationHostInterval =
        1u << 1,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierInvalidationDrop =
        1u << 2,
};

enum AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectReason
    : std::uint32_t
{
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectNoPending = 1u << 0,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectInvalid = 1u << 1,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectTargetRateOwned =
        1u << 2,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectPhaseTargetActive =
        1u << 3,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectPhaseEpisodeActive =
        1u << 4,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectLowRateConfirmed =
        1u << 5,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectCandidateActive =
        1u << 6,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectOwnerActive =
        1u << 7,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectAnchorOwnerValid =
        1u << 8,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectAnchorOwnerGeneration =
        1u << 9,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectCandidateGeneration =
        1u << 10,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectContinuity =
        1u << 11,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectResetRequested =
        1u << 12,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectResetConfirmed =
        1u << 13,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectHint = 1u << 14,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectHostInterval =
        1u << 15,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectDrop = 1u << 16,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectCounterRegression =
        1u << 17,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectConsumedPcm =
        1u << 18,
    AudioOutputAdaptiveFastTargetChangePhaseFrontierRejectPublishedPcm =
        1u << 19,
};

enum AudioOutputAdaptiveFastTargetChangePhaseEscrowClearReason
    : std::uint32_t
{
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearNone = 0,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearFastRebase = 1u << 0,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearPending = 1u << 1,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearOwnership = 1u << 2,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearContinuity = 1u << 3,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearReset = 1u << 4,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearHintChange = 1u << 5,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearCandidateGeneration =
        1u << 6,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearRateReference =
        1u << 7,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearCounterRegression =
        1u << 8,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearConsumedPcm = 1u << 9,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearPublishedPcm =
        1u << 10,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearStorage = 1u << 11,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearDrop = 1u << 12,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearUnderrun = 1u << 13,
    AudioOutputAdaptiveFastTargetChangePhaseEscrowClearHorizon = 1u << 14,
};

enum AudioOutputAdaptiveSustainedProvisionalPhaseClearReason
    : std::uint32_t
{
    AudioOutputAdaptiveSustainedProvisionalPhaseClearNone = 0,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearWindowReset = 1u << 0,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearReplacement = 1u << 1,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearCandidateInactive =
        1u << 2,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearCandidateReplacement =
        1u << 3,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearOwnerActive = 1u << 4,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearRateActuator = 1u << 5,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearCandidateGeneration =
        1u << 6,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearOwnerGeneration =
        1u << 7,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearContinuity = 1u << 8,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearReset = 1u << 9,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearHintChange = 1u << 10,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearDrop = 1u << 11,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearUnderrun = 1u << 12,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearSpill = 1u << 13,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearStorage = 1u << 14,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearConsumedPcm = 1u << 15,
    AudioOutputAdaptiveSustainedProvisionalPhaseClearPublishedPcm = 1u << 16,
};

struct AudioOutputAdaptiveTelemetrySnapshot
{
    bool valid = false;
    std::uint64_t publicationId = 0;
    std::uint64_t updateId = 0;

    std::uint64_t hostConsumed = 0;
    std::uint64_t ticksAtConsumption = 0;
    std::uint64_t estimatorDeltaConsumed = 0;
    std::uint64_t estimatorDeltaTicks = 0;
    double estimatorRawRatio = 0.0;
    std::uint64_t primingFrames = 0;

    double controllerRatio = 0.0;
    double desiredSkew = 0.0;
    double appliedSkew = 0.0;
    double speedHint = 0.0;

    std::uint32_t levelPostConsumption = 0;
    std::uint32_t levelBeforeWrite = 0;
    std::uint32_t levelPostWrite = 0;
    std::uint32_t framesProduced = 0;
    std::uint32_t underruns = 0;
    std::uint32_t droppedBlocks = 0;
    std::uint32_t dropsThisWrite = 0;
    std::uint32_t outputBufferSize = 0;

    std::uint32_t resetRequestedEpoch = 0;
    std::uint32_t resetConfirmedEpoch = 0;
    std::uint32_t resetSeenEpoch = 0;
    std::uint32_t hintEpoch = 0;
    std::uint32_t hintSeenEpoch = 0;
    std::uint32_t decisionFlags = 0;

    std::uint64_t lastFastAcceptedUpdateId = 0;
    double lastFastAcceptedRawRatio = 0.0;
    double lastFastAcceptedEffectiveRatio = 0.0;
    std::uint32_t lastFastAcceptedLevelPostConsumption = 0;
    std::uint32_t lastFastAcceptedLevelBeforeWrite = 0;
    std::uint32_t lastFastAcceptedLevelPostWrite = 0;
    std::uint32_t lastFastAcceptedFlags = 0;
    std::uint64_t fastAcceptedCount = 0;

    std::uint64_t lastSlowAppliedUpdateId = 0;
    double lastSlowAppliedRawRatio = 0.0;
    double lastSlowAppliedEffectiveRatio = 0.0;
    std::uint64_t slowAppliedCount = 0;

    std::uint64_t lastDropUpdateId = 0;
    std::uint32_t lastDropLevelBeforeWrite = 0;
    std::uint32_t lastDropLevelPostWrite = 0;
    std::uint32_t lastDropFramesProduced = 0;
    std::uint32_t lastDropDropsThisWrite = 0;

    bool rollbackPending = false;
    bool rollbackVerifying = false;
    double rollbackParentRatio = 0.0;
    std::uint32_t rollbackTargetFrames = 0;
    std::uint64_t rollbackCount = 0;
    std::uint64_t lastRollbackUpdateId = 0;
    double lastRollbackParentRatio = 0.0;
    std::uint32_t lastRollbackTargetFrames = 0;
    std::uint64_t lastRollbackDeltaConsumed = 0;
    std::uint64_t lastRollbackDeltaTicks = 0;

    bool actuatorActive = false;
    std::uint64_t actuatorTransitionCount = 0;
    std::uint64_t lastActuatorTransitionUpdateId = 0;
    double lastActuatorStartSkew = 0.0;
    double lastActuatorTargetRatio = 0.0;
    double lastActuatorFirstAppliedSkew = 0.0;
    double lastActuatorFirstControlFrames = 0.0;
    std::uint64_t lastActuatorDeltaConsumed = 0;
    std::uint64_t lastActuatorDeltaTicks = 0;
    std::uint32_t lastActuatorBackingFrames = 0;
    std::uint32_t lastActuatorLevelPostWrite = 0;
    std::uint32_t lastActuatorStepCount = 0;
    double lastActuatorMaxStepRatio = 0.0;
    std::uint64_t lastActuatorMonotonicViolationCount = 0;
    std::uint64_t lastActuatorConvergedUpdateId = 0;

    bool hintParentCertified = false;
    std::uint64_t hintParentCertificationCount = 0;
    std::uint64_t lastHintParentCertificationUpdateId = 0;
    double lastHintParentCertificationRatio = 0.0;
    std::uint64_t lastHintParentCertificationDeltaConsumed = 0;
    std::uint64_t lastHintParentCertificationDeltaTicks = 0;
    bool rollbackParentIsHint = false;
    bool lastRollbackParentWasHint = false;

    std::uint64_t dominatedAscendingEndpointCount = 0;
    std::uint64_t lastDominatedAscendingEndpointUpdateId = 0;
    std::uint64_t lastDominatedAscendingEndpointTransitionUpdateId = 0;
    double lastDominatedAscendingEndpointStartSkew = 0.0;
    double lastDominatedAscendingEndpointTargetRatio = 0.0;
    double lastDominatedAscendingEndpointAppliedSkew = 0.0;
    std::uint64_t lastDominatedAscendingEndpointDeltaConsumed = 0;
    std::uint64_t lastDominatedAscendingEndpointDeltaTicks = 0;
    std::uint32_t lastDominatedAscendingEndpointBackingFrames = 0;
    std::uint32_t lastDominatedAscendingEndpointLevelPostWrite = 0;
    std::uint32_t lastDominatedAscendingEndpointOutputBufferSize = 0;
    double lastDominatedAscendingEndpointOutputSampleRate = 0.0;

    std::uint64_t fastAnchorRebaseCount = 0;
    std::uint64_t lastFastAnchorRebaseUpdateId = 0;
    std::uint64_t lastFastAnchorRebaseDeltaConsumed = 0;
    std::uint64_t lastFastAnchorRebaseDeltaTicks = 0;
    double lastFastAnchorRebaseRawRatio = 0.0;
    double lastFastAnchorRebaseRatioBeforeEstimators = 0.0;
    double lastFastAnchorRebaseRatioAfter = 0.0;
    std::uint32_t lastFastAnchorRebaseLevelPostConsumption = 0;
    std::uint32_t lastFastAnchorRebaseLevelPostWrite = 0;
    std::uint32_t lastFastAnchorRebaseRecoveryAscendingFrames = 0;
    std::uint32_t lastFastAnchorRebaseDecisionFlags = 0;
    bool lastFastAnchorRebaseTargetRateOwned = false;
    bool lastFastAnchorRebaseEstimatorEvaluated = false;

    std::uint64_t rateRecoveryRebaseCount = 0;
    std::uint64_t lastRateRecoveryRebaseUpdateId = 0;
    std::uint64_t lastRateRecoveryRebaseDeltaConsumed = 0;
    std::uint64_t lastRateRecoveryRebaseDeltaTicks = 0;
    std::uint32_t lastRateRecoveryRebaseLevelPostConsumption = 0;
    std::uint32_t lastRateRecoveryRebaseLevelPostWrite = 0;
    double lastRateRecoveryRebaseTargetRatio = 0.0;
    std::uint32_t lastRateRecoveryRebaseBoundaryFrames = 0;
    bool lastRateRecoveryRebaseFastLowPending = false;
    bool lastRateRecoveryRebaseFastTargetChangePending = false;

    std::uint64_t framesAtConsumption = 0;
    std::uint64_t sustainedCandidateGeneration = 0;
    std::uint64_t sustainedOwnerGeneration = 0;
    std::uint64_t sustainedOwnerCandidateGeneration = 0;
    bool sustainedCandidateActive = false;
    bool sustainedOwnerActive = false;
    double sustainedOwnerRatio = 0.0;
    std::uint64_t sustainedObservationCount = 0;
    std::uint64_t lastSustainedObservationUpdateId = 0;
    std::uint64_t lastSustainedObservationCandidateGeneration = 0;
    std::uint64_t lastSustainedObservationEndConsumed = 0;
    std::uint64_t lastSustainedObservationEndTicks = 0;
    std::uint64_t lastSustainedObservationEndProduced = 0;
    std::uint64_t lastSustainedObservationDeltaConsumed = 0;
    std::uint64_t lastSustainedObservationDeltaTicks = 0;
    std::uint64_t lastSustainedObservationDeltaProduced = 0;
    double lastSustainedObservationRawRatio = 0.0;
    std::uint32_t lastSustainedObservationStartLevel = 0;
    std::uint32_t lastSustainedObservationEndLevel = 0;
    std::uint32_t lastSustainedObservationMinLevel = 0;
    std::uint32_t lastSustainedObservationMaxLevel = 0;

    std::uint32_t sustainedStateFlags = 0;
    std::uint64_t sustainedEpisodeOriginUpdateId = 0;
    double sustainedParentRatio = 0.0;
    std::uint64_t sustainedParentDeltaConsumed = 0;
    std::uint64_t sustainedParentDeltaTicks = 0;
    std::uint32_t lastSustainedObservationType = 0;
    std::uint32_t sustainedRecoveryBoundaryFrames = 0;
    std::uint32_t effectivePhaseTargetFrames = 0;
    std::uint64_t sustainedTransitionCount = 0;
    std::uint64_t lastSustainedTransitionUpdateId = 0;
    std::uint32_t lastSustainedTransitionKind = 0;
    std::uint64_t lastSustainedTransitionOwnerGeneration = 0;

    std::uint64_t fastLowWitnessOwnerGeneration = 0;
    std::uint64_t fastLowWitnessEndConsumed = 0;
    std::uint64_t fastLowWitnessEndTicks = 0;
    std::uint64_t fastLowWitnessEndProduced = 0;
    std::uint32_t fastLowWitnessEndLevel = 0;

    std::uint64_t fastLowWitnessBirthCount = 0;
    std::uint64_t lastFastLowWitnessBirthUpdateId = 0;
    std::uint32_t lastFastLowWitnessBirthKind = 0;
    std::uint64_t lastFastLowWitnessBirthOwnerGeneration = 0;
    std::uint64_t lastFastLowWitnessBirthConsumed = 0;
    std::uint64_t lastFastLowWitnessBirthTicks = 0;
    std::uint64_t lastFastLowWitnessBirthProduced = 0;
    std::uint32_t lastFastLowWitnessBirthLevel = 0;
    std::uint32_t lastFastLowWitnessBirthLevelPostWrite = 0;

    std::uint64_t fastLowWitnessClearCount = 0;
    std::uint64_t lastFastLowWitnessClearUpdateId = 0;
    std::uint32_t lastFastLowWitnessClearReasons = 0;
    std::uint64_t lastFastLowWitnessClearOwnerGeneration = 0;
    std::uint64_t lastFastLowWitnessClearWitnessConsumed = 0;
    std::uint64_t lastFastLowWitnessClearWitnessTicks = 0;
    std::uint64_t lastFastLowWitnessClearWitnessProduced = 0;
    std::uint32_t lastFastLowWitnessClearWitnessLevel = 0;
    std::uint64_t lastFastLowWitnessClearConsumed = 0;
    std::uint64_t lastFastLowWitnessClearTicks = 0;
    std::uint64_t lastFastLowWitnessClearProduced = 0;
    std::uint32_t lastFastLowWitnessClearLevel = 0;
    std::uint32_t lastFastLowWitnessClearLevelPostWrite = 0;

    std::uint64_t framesPublishedTotal = 0;
    bool parentCapacityActive = false;
    std::uint32_t parentCapacityCapacity = 0;
    std::uint64_t parentCapacityGeneration = 0;
    std::uint64_t parentCapacitySourceOwnerGeneration = 0;
    double parentCapacityParentRatio = 0.0;
    std::uint64_t parentCapacityStartContinuityEpoch = 0;
    std::uint32_t parentCapacityStartResetEpoch = 0;
    std::uint32_t parentCapacityStartHintSeenEpoch = 0;
    std::uint64_t parentCapacityStartConsumed = 0;
    std::uint64_t parentCapacityStartTicks = 0;
    std::uint64_t parentCapacityStartConsumedProduced = 0;
    std::uint64_t parentCapacityStartPublishedProduced = 0;
    std::uint32_t parentCapacityStartLevelPostConsumption = 0;
    std::uint32_t parentCapacityStartLevelPostWrite = 0;
    std::uint64_t parentCapacityBirthCount = 0;
    std::uint64_t lastParentCapacityBirthUpdateId = 0;
    std::uint64_t parentCapacityFirstRiskCount = 0;
    std::uint64_t lastParentCapacityFirstRiskUpdateId = 0;
    std::uint64_t lastParentCapacityFirstRiskGeneration = 0;
    std::uint32_t lastParentCapacityFirstRiskLevelBeforeWrite = 0;
    std::uint32_t lastParentCapacityFirstRiskFramesProduced = 0;
    std::uint32_t lastParentCapacityFirstRiskCapacity = 0;
    std::uint64_t parentCapacityClearCount = 0;
    std::uint64_t lastParentCapacityClearUpdateId = 0;
    std::uint32_t lastParentCapacityClearReasons = 0;
    std::uint64_t lastParentCapacityClearGeneration = 0;
    std::uint64_t lastParentCapacityClearConsumed = 0;
    std::uint64_t lastParentCapacityClearTicks = 0;
    std::uint64_t lastParentCapacityClearPublishedProduced = 0;
    std::uint32_t lastParentCapacityClearLevelPostWrite = 0;

    std::uint64_t logicalLevelPostConsumption = 0;
    std::uint64_t logicalLevelBeforeWrite = 0;
    std::uint64_t logicalLevelPostWrite = 0;
    std::uint64_t spillFrames = 0;
    std::uint64_t spillPeakFrames = 0;
    std::uint32_t spillActiveNodes = 0;
    std::uint32_t spillFreeNodes = 0;
    std::uint64_t spillGeneration = 0;
    std::uint64_t spillBirthCount = 0;
    std::uint64_t lastSpillBirthUpdateId = 0;
    std::uint64_t lastSpillBirthContinuityEpoch = 0;
    std::uint32_t lastSpillBirthResetEpoch = 0;
    std::uint64_t lastSpillBirthOwnerGeneration = 0;
    std::uint32_t lastSpillBirthFrames = 0;
    std::uint64_t spillPublicationCount = 0;
    std::uint64_t spillFramesPublishedTotal = 0;
    std::uint64_t spillAllocationCount = 0;
    std::uint64_t spillAllocationFailureCount = 0;
    std::uint64_t spillDroppedPacketsTotal = 0;
    std::uint64_t spillDroppedFramesTotal = 0;
    std::uint32_t spillDroppedPacketsThisWrite = 0;
    std::uint32_t spillDroppedFramesThisWrite = 0;

    std::uint32_t provisionalFastStateFlags = 0;
    std::uint64_t provisionalFastAnchorConsumed = 0;
    std::uint64_t provisionalFastAnchorTicks = 0;
    std::uint64_t provisionalFastAnchorProduced = 0;
    std::uint64_t provisionalFastAnchorLevelPostConsumption = 0;
    std::uint64_t provisionalFastAnchorLevelPostWrite = 0;
    std::uint64_t provisionalFastAnchorContinuityEpoch = 0;
    std::uint32_t provisionalFastAnchorResetEpoch = 0;
    std::uint32_t provisionalFastAnchorHintSeenEpoch = 0;
    std::uint64_t provisionalFastAnchorCandidateGeneration = 0;
    std::uint64_t provisionalFastAnchorOwnerGeneration = 0;
    std::uint64_t provisionalCandidateStartConsumed = 0;
    std::uint64_t provisionalCandidateStartTicks = 0;
    std::uint64_t provisionalCandidateStartProduced = 0;
    std::uint64_t provisionalCandidateStartLevelPostConsumption = 0;
    std::uint64_t provisionalCandidateStartLevelPostWrite = 0;
    std::uint64_t provisionalCandidateStartContinuityEpoch = 0;
    std::uint32_t provisionalCandidateStartResetEpoch = 0;
    std::uint32_t provisionalCandidateStartHintSeenEpoch = 0;
    std::int32_t provisionalCandidateDirection = 0;

    std::uint64_t provisionalEventCount = 0;
    std::uint64_t lastProvisionalEventUpdateId = 0;
    std::uint32_t lastProvisionalEventFlags = 0;
    std::uint32_t lastProvisionalEventFastStateBefore = 0;
    std::uint32_t lastProvisionalEventFastStateAfter = 0;
    std::uint64_t lastProvisionalEventFastAnchorConsumed = 0;
    std::uint64_t lastProvisionalEventFastAnchorTicks = 0;
    std::uint64_t lastProvisionalEventFastAnchorProduced = 0;
    std::uint64_t lastProvisionalEventFastAnchorLevelPostConsumption = 0;
    std::uint64_t lastProvisionalEventFastAnchorLevelPostWrite = 0;
    std::uint64_t lastProvisionalEventCandidateGeneration = 0;
    std::uint64_t lastProvisionalEventCandidateStartConsumed = 0;
    std::uint64_t lastProvisionalEventCandidateStartTicks = 0;
    std::uint64_t lastProvisionalEventCandidateStartProduced = 0;
    std::uint64_t lastProvisionalEventCandidateStartLevelPostConsumption = 0;
    std::uint64_t lastProvisionalEventCandidateStartLevelPostWrite = 0;
    std::int32_t lastProvisionalEventCandidateDirection = 0;
    std::uint64_t lastProvisionalEventOwnerGeneration = 0;
    std::uint64_t lastProvisionalEventEndpointConsumed = 0;
    std::uint64_t lastProvisionalEventEndpointTicks = 0;
    std::uint64_t lastProvisionalEventEndpointProduced = 0;
    std::uint64_t lastProvisionalEventEndpointLevelPostConsumption = 0;
    std::uint64_t lastProvisionalEventEndpointLevelPostWrite = 0;
    std::uint64_t lastProvisionalEventEndpointContinuityEpoch = 0;
    std::uint32_t lastProvisionalEventResetEpoch = 0;
    std::uint32_t lastProvisionalEventHintSeenEpoch = 0;
    std::uint32_t lastProvisionalEventDecisionFlags = 0;

    std::uint64_t provisionalFastAnchorPublishedProduced = 0;
    std::uint64_t provisionalCandidateStartPublishedProduced = 0;
    std::uint64_t lastProvisionalEventFastAnchorPublishedProduced = 0;
    std::uint64_t lastProvisionalEventFastAnchorContinuityEpoch = 0;
    std::uint32_t lastProvisionalEventFastAnchorResetEpoch = 0;
    std::uint32_t lastProvisionalEventFastAnchorHintSeenEpoch = 0;
    std::uint64_t lastProvisionalEventFastAnchorCandidateGeneration = 0;
    std::uint64_t lastProvisionalEventFastAnchorOwnerGeneration = 0;
    std::uint64_t lastProvisionalEventCandidateStartPublishedProduced = 0;
    std::uint64_t lastProvisionalEventCandidateStartContinuityEpoch = 0;
    std::uint32_t lastProvisionalEventCandidateStartResetEpoch = 0;
    std::uint32_t lastProvisionalEventCandidateStartHintSeenEpoch = 0;
    std::uint64_t lastProvisionalEventEndpointPublishedProduced = 0;
    std::uint64_t lastProvisionalEventPreviousCandidateGeneration = 0;
    std::uint64_t lastProvisionalEventPreviousCandidateStartConsumed = 0;
    std::uint64_t lastProvisionalEventPreviousCandidateStartTicks = 0;
    std::uint64_t lastProvisionalEventPreviousCandidateStartProduced = 0;
    std::uint64_t lastProvisionalEventPreviousCandidateStartPublishedProduced = 0;
    std::uint64_t lastProvisionalEventPreviousCandidateStartLevelPostConsumption = 0;
    std::uint64_t lastProvisionalEventPreviousCandidateStartLevelPostWrite = 0;
    std::uint64_t lastProvisionalEventPreviousCandidateStartContinuityEpoch = 0;
    std::uint32_t lastProvisionalEventPreviousCandidateStartResetEpoch = 0;
    std::uint32_t lastProvisionalEventPreviousCandidateStartHintSeenEpoch = 0;
    std::int32_t lastProvisionalEventPreviousCandidateDirection = 0;

    std::uint64_t ticksPublishedTotal = 0;
    bool fastHighEscrowInitialized = false;
    bool fastHighEscrowActive = false;
    bool fastHighEscrowReferenceIsOverride = false;
    std::uint64_t fastHighEscrowOwnerGeneration = 0;
    std::uint64_t fastHighEscrowReferenceTicks = 0;
    std::uint64_t fastHighEscrowReferenceConsumed = 0;
    double fastHighEscrowRate = 0.0;
    std::uint64_t fastHighEscrowStartTicks = 0;
    std::uint64_t fastHighEscrowStartPublishedProduced = 0;
    std::uint64_t fastHighEscrowStartConsumed = 0;
    std::uint64_t fastHighEscrowStartConsumedProduced = 0;
    std::uint64_t fastHighEscrowStartLevelPostConsumption = 0;
    std::uint64_t fastHighEscrowStartLevelPostWrite = 0;
    std::uint64_t fastHighEscrowStartContinuityEpoch = 0;
    std::uint32_t fastHighEscrowStartResetEpoch = 0;
    std::uint32_t fastHighEscrowStartHintSeenEpoch = 0;
    std::uint64_t fastHighEscrowGrantFrames = 0;
    std::uint64_t fastHighEscrowSpentFrames = 0;
    std::uint64_t fastHighEscrowRemainingFrames = 0;

    std::uint64_t fastHighEscrowBirthCount = 0;
    std::uint64_t lastFastHighEscrowBirthUpdateId = 0;
    std::uint64_t lastFastHighEscrowBirthOwnerGeneration = 0;
    std::uint64_t lastFastHighEscrowBirthReferenceTicks = 0;
    std::uint64_t lastFastHighEscrowBirthReferenceConsumed = 0;
    bool lastFastHighEscrowBirthReferenceWasOverride = false;
    double lastFastHighEscrowBirthRate = 0.0;
    std::uint64_t lastFastHighEscrowBirthStartTicks = 0;
    std::uint64_t lastFastHighEscrowBirthStartPublishedProduced = 0;
    std::uint64_t lastFastHighEscrowBirthStartConsumed = 0;
    std::uint64_t lastFastHighEscrowBirthStartConsumedProduced = 0;
    std::uint64_t lastFastHighEscrowBirthStartLevelPostConsumption = 0;
    std::uint64_t lastFastHighEscrowBirthStartLevelPostWrite = 0;
    std::uint64_t lastFastHighEscrowBirthStartContinuityEpoch = 0;
    std::uint32_t lastFastHighEscrowBirthStartResetEpoch = 0;
    std::uint32_t lastFastHighEscrowBirthStartHintSeenEpoch = 0;
    std::uint64_t lastFastHighEscrowBirthGrantFrames = 0;

    std::uint64_t fastHighEscrowSpendCount = 0;
    std::uint64_t lastFastHighEscrowSpendUpdateId = 0;
    std::uint64_t lastFastHighEscrowSpentFrames = 0;
    std::uint64_t lastFastHighEscrowRemainingFrames = 0;

    std::uint64_t fastHighEscrowOverlayCount = 0;
    std::uint64_t lastFastHighEscrowOverlayUpdateId = 0;
    std::uint64_t lastFastHighEscrowOverlayRemainingFrames = 0;
    double lastFastHighEscrowOverlaySkew = 0.0;

    std::uint64_t fastHighEscrowClearCount = 0;
    std::uint64_t lastFastHighEscrowClearUpdateId = 0;
    std::uint32_t lastFastHighEscrowClearReasons = 0;
    std::uint64_t lastFastHighEscrowClearOwnerGeneration = 0;
    std::uint64_t lastFastHighEscrowClearGrantFrames = 0;
    std::uint64_t lastFastHighEscrowClearSpentFrames = 0;
    double fastHighEscrowGuardSkew = 0.0;
    double lastFastHighEscrowBirthGuardSkew = 0.0;
    std::uint64_t fastHighEscrowHorizonFrames = 0;
    std::uint64_t lastFastHighEscrowBirthHorizonFrames = 0;

    std::uint32_t fastTargetChangePhaseFrontierOrigin = 0;
    bool fastTargetChangePhaseFrontierValid = false;
    std::uint64_t fastTargetChangePhaseFrontierInvalidationCount = 0;
    std::uint64_t lastFastTargetChangePhaseFrontierInvalidationUpdateId = 0;
    std::uint32_t lastFastTargetChangePhaseFrontierInvalidationReasons = 0;
    std::uint64_t fastTargetChangePhaseFrontierEvaluationCount = 0;
    std::uint64_t lastFastTargetChangePhaseFrontierEvaluationUpdateId = 0;
    std::uint32_t lastFastTargetChangePhaseFrontierEvaluationOrigin = 0;
    std::uint32_t lastFastTargetChangePhaseFrontierEvaluationRejectMask = 0;

    bool fastTargetChangePhaseEscrowActive = false;
    std::uint64_t fastTargetChangePhaseEscrowGrantFrames = 0;
    double fastTargetChangePhaseEscrowGuardSkew = 0.0;
    double fastTargetChangePhaseEscrowOverlaySkew = 0.0;
    double fastTargetChangePhaseEscrowReferenceRate = 0.0;
    std::uint64_t fastTargetChangePhaseEscrowStartTicks = 0;
    std::uint64_t fastTargetChangePhaseEscrowStartConsumed = 0;
    std::uint64_t fastTargetChangePhaseEscrowStartConsumedProduced = 0;
    std::uint64_t fastTargetChangePhaseEscrowStartPublishedProduced = 0;
    std::uint64_t fastTargetChangePhaseEscrowStartLevelPostConsumption = 0;
    std::uint64_t fastTargetChangePhaseEscrowStartLevelPostWrite = 0;
    std::uint64_t fastTargetChangePhaseEscrowStartContinuityEpoch = 0;
    std::uint32_t fastTargetChangePhaseEscrowStartResetEpoch = 0;
    std::uint32_t fastTargetChangePhaseEscrowStartHintSeenEpoch = 0;
    std::uint64_t fastTargetChangePhaseEscrowStartCandidateGeneration = 0;
    std::uint64_t fastTargetChangePhaseEscrowElapsedPublishedTicks = 0;
    std::uint64_t fastTargetChangePhaseEscrowCurrentPhysicalPrefix = 0;

    std::uint64_t fastTargetChangePhaseEscrowBirthCount = 0;
    std::uint64_t lastFastTargetChangePhaseEscrowBirthUpdateId = 0;
    std::uint64_t lastFastTargetChangePhaseEscrowBirthGrantFrames = 0;
    double lastFastTargetChangePhaseEscrowBirthGuardSkew = 0.0;

    std::uint64_t fastTargetChangePhaseEscrowClearCount = 0;
    std::uint64_t lastFastTargetChangePhaseEscrowClearUpdateId = 0;
    std::uint32_t lastFastTargetChangePhaseEscrowClearReasons = 0;
    std::uint64_t lastFastTargetChangePhaseEscrowClearGrantFrames = 0;
    double lastFastTargetChangePhaseEscrowClearOverlaySkew = 0.0;

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
    std::uint64_t lastSustainedProvisionalPhaseBirthCandidateGeneration = 0;
    double lastSustainedProvisionalPhaseBirthParentRatio = 0.0;
    double lastSustainedProvisionalPhaseBirthSkew = 0.0;
    std::uint64_t lastSustainedProvisionalPhaseBirthFrontierFrames = 0;
    std::uint64_t lastSustainedProvisionalPhaseBirthBackingFrames = 0;
    std::uint64_t lastSustainedProvisionalPhaseBirthPublicationReserveFrames = 0;
    std::uint32_t lastSustainedProvisionalPhaseBirthReservedPublicationCount = 0;

    std::uint64_t sustainedProvisionalPhaseStepCount = 0;
    std::uint64_t lastSustainedProvisionalPhaseStepUpdateId = 0;
    std::uint64_t lastSustainedProvisionalPhaseStepCandidateGeneration = 0;
    double lastSustainedProvisionalPhaseStepPreviousSkew = 0.0;
    double lastSustainedProvisionalPhaseStepSkew = 0.0;
    std::uint64_t lastSustainedProvisionalPhaseStepFrontierFrames = 0;
    std::uint64_t lastSustainedProvisionalPhaseStepBackingFrames = 0;
    std::uint64_t lastSustainedProvisionalPhaseStepPublicationReserveFrames = 0;
    std::uint32_t lastSustainedProvisionalPhaseStepReservedPublicationCount = 0;

    std::uint64_t sustainedProvisionalPhaseClearCount = 0;
    std::uint64_t lastSustainedProvisionalPhaseClearUpdateId = 0;
    std::uint32_t lastSustainedProvisionalPhaseClearReasons = 0;
    std::uint64_t lastSustainedProvisionalPhaseClearCandidateGeneration = 0;
    double lastSustainedProvisionalPhaseClearSkew = 0.0;
    std::uint32_t lastSustainedProvisionalPhaseClearReservedPublicationCount = 0;

    std::uint64_t sustainedProvisionalPhaseApplicationConflictCount = 0;
    std::uint64_t lastSustainedProvisionalPhaseApplicationConflictUpdateId = 0;
};

class alignas(64) AudioOutputAdaptiveTelemetryMailbox
{
public:
    static constexpr int MaxReadAttempts = 3;

    AudioOutputAdaptiveTelemetryMailbox() noexcept
    {
        for (auto& word : Words)
            word.store(0, std::memory_order_relaxed);
    }

    AudioOutputAdaptiveTelemetryMailbox(
        const AudioOutputAdaptiveTelemetryMailbox&) = delete;
    AudioOutputAdaptiveTelemetryMailbox& operator=(
        const AudioOutputAdaptiveTelemetryMailbox&) = delete;

    void Publish(const AudioOutputAdaptiveTelemetrySnapshot& snapshot) noexcept
    {

        const std::uint64_t oddSequence =
            Sequence.fetch_add(1, std::memory_order_acq_rel) + 1;

        Store(UpdateId, snapshot.updateId);
        Store(HostConsumed, snapshot.hostConsumed);
        Store(TicksAtConsumption, snapshot.ticksAtConsumption);
        Store(EstimatorDeltaConsumed, snapshot.estimatorDeltaConsumed);
        Store(EstimatorDeltaTicks, snapshot.estimatorDeltaTicks);
        Store(EstimatorRawRatio, DoubleToBits(snapshot.estimatorRawRatio));
        Store(PrimingFrames, snapshot.primingFrames);
        Store(ControllerRatio, DoubleToBits(snapshot.controllerRatio));
        Store(DesiredSkew, DoubleToBits(snapshot.desiredSkew));
        Store(AppliedSkew, DoubleToBits(snapshot.appliedSkew));
        Store(SpeedHint, DoubleToBits(snapshot.speedHint));
        Store(LevelsBeforeWrite,
              Pack32(snapshot.levelPostConsumption,
                     snapshot.levelBeforeWrite));
        Store(LevelAfterWriteAndProduced,
              Pack32(snapshot.levelPostWrite, snapshot.framesProduced));
        Store(TransportCounters,
              Pack32(snapshot.underruns, snapshot.droppedBlocks));
        Store(WriteDropsAndCapacity,
              Pack32(snapshot.dropsThisWrite, snapshot.outputBufferSize));
        Store(ResetRequestedAndConfirmed,
              Pack32(snapshot.resetRequestedEpoch,
                     snapshot.resetConfirmedEpoch));
        Store(ResetSeenAndHintEpoch,
              Pack32(snapshot.resetSeenEpoch, snapshot.hintEpoch));
        Store(HintSeenAndDecisionFlags,
              Pack32(snapshot.hintSeenEpoch, snapshot.decisionFlags));
        Store(LastFastAcceptedUpdateId,
              snapshot.lastFastAcceptedUpdateId);
        Store(LastFastAcceptedRawRatio,
              DoubleToBits(snapshot.lastFastAcceptedRawRatio));
        Store(LastFastAcceptedEffectiveRatio,
              DoubleToBits(snapshot.lastFastAcceptedEffectiveRatio));
        Store(LastFastLevelsBeforeWrite,
              Pack32(snapshot.lastFastAcceptedLevelPostConsumption,
                     snapshot.lastFastAcceptedLevelBeforeWrite));
        Store(LastFastLevelAfterWriteAndFlags,
              Pack32(snapshot.lastFastAcceptedLevelPostWrite,
                     snapshot.lastFastAcceptedFlags));
        Store(FastAcceptedCount, snapshot.fastAcceptedCount);
        Store(LastSlowAppliedUpdateId, snapshot.lastSlowAppliedUpdateId);
        Store(LastSlowAppliedRawRatio,
              DoubleToBits(snapshot.lastSlowAppliedRawRatio));
        Store(LastSlowAppliedEffectiveRatio,
              DoubleToBits(snapshot.lastSlowAppliedEffectiveRatio));
        Store(SlowAppliedCount, snapshot.slowAppliedCount);
        Store(LastDropUpdateId, snapshot.lastDropUpdateId);
        Store(LastDropLevels,
              Pack32(snapshot.lastDropLevelBeforeWrite,
                     snapshot.lastDropLevelPostWrite));
        Store(LastDropProducedAndCount,
              Pack32(snapshot.lastDropFramesProduced,
                     snapshot.lastDropDropsThisWrite));
        const std::uint32_t rollbackState =
            (snapshot.rollbackPending ? 1u : 0u)
            | (snapshot.rollbackVerifying ? 2u : 0u);
        Store(RollbackStateAndTarget,
              Pack32(rollbackState, snapshot.rollbackTargetFrames));
        Store(RollbackParentRatio,
              DoubleToBits(snapshot.rollbackParentRatio));
        Store(RollbackCount, snapshot.rollbackCount);
        Store(LastRollbackUpdateId, snapshot.lastRollbackUpdateId);
        Store(LastRollbackParentRatio,
              DoubleToBits(snapshot.lastRollbackParentRatio));
        Store(LastRollbackTargetFrames,
              snapshot.lastRollbackTargetFrames);
        Store(LastRollbackDeltaConsumed,
              snapshot.lastRollbackDeltaConsumed);
        Store(LastRollbackDeltaTicks, snapshot.lastRollbackDeltaTicks);
        Store(ActuatorStateAndBacking,
              Pack32(snapshot.actuatorActive ? 1u : 0u,
                     snapshot.lastActuatorBackingFrames));
        Store(ActuatorTransitionCount,
              snapshot.actuatorTransitionCount);
        Store(LastActuatorTransitionUpdateId,
              snapshot.lastActuatorTransitionUpdateId);
        Store(LastActuatorStartSkew,
              DoubleToBits(snapshot.lastActuatorStartSkew));
        Store(LastActuatorTargetRatio,
              DoubleToBits(snapshot.lastActuatorTargetRatio));
        Store(LastActuatorFirstAppliedSkew,
              DoubleToBits(snapshot.lastActuatorFirstAppliedSkew));
        Store(LastActuatorFirstControlFrames,
              DoubleToBits(snapshot.lastActuatorFirstControlFrames));
        Store(LastActuatorDeltaConsumed,
              snapshot.lastActuatorDeltaConsumed);
        Store(LastActuatorDeltaTicks,
              snapshot.lastActuatorDeltaTicks);
        Store(LastActuatorLevelPostWriteAndStepCount,
              Pack32(snapshot.lastActuatorLevelPostWrite,
                     snapshot.lastActuatorStepCount));
        Store(LastActuatorMaxStepRatio,
              DoubleToBits(snapshot.lastActuatorMaxStepRatio));
        Store(LastActuatorMonotonicViolationCount,
              snapshot.lastActuatorMonotonicViolationCount);
        Store(LastActuatorConvergedUpdateId,
              snapshot.lastActuatorConvergedUpdateId);
        const std::uint32_t hintParentState =
            (snapshot.hintParentCertified ? 1u : 0u)
            | (snapshot.rollbackParentIsHint ? 2u : 0u)
            | (snapshot.lastRollbackParentWasHint ? 4u : 0u);
        Store(HintParentState, hintParentState);
        Store(HintParentCertificationCount,
              snapshot.hintParentCertificationCount);
        Store(LastHintParentCertificationUpdateId,
              snapshot.lastHintParentCertificationUpdateId);
        Store(LastHintParentCertificationRatio,
              DoubleToBits(snapshot.lastHintParentCertificationRatio));
        Store(LastHintParentCertificationDeltaConsumed,
              snapshot.lastHintParentCertificationDeltaConsumed);
        Store(LastHintParentCertificationDeltaTicks,
              snapshot.lastHintParentCertificationDeltaTicks);
        Store(DominatedAscendingEndpointCount,
              snapshot.dominatedAscendingEndpointCount);
        Store(LastDominatedAscendingEndpointUpdateId,
              snapshot.lastDominatedAscendingEndpointUpdateId);
        Store(LastDominatedAscendingEndpointTransitionUpdateId,
              snapshot.lastDominatedAscendingEndpointTransitionUpdateId);
        Store(LastDominatedAscendingEndpointStartSkew,
              DoubleToBits(snapshot.lastDominatedAscendingEndpointStartSkew));
        Store(LastDominatedAscendingEndpointTargetRatio,
              DoubleToBits(snapshot.lastDominatedAscendingEndpointTargetRatio));
        Store(LastDominatedAscendingEndpointAppliedSkew,
              DoubleToBits(snapshot.lastDominatedAscendingEndpointAppliedSkew));
        Store(LastDominatedAscendingEndpointDeltaConsumed,
              snapshot.lastDominatedAscendingEndpointDeltaConsumed);
        Store(LastDominatedAscendingEndpointDeltaTicks,
              snapshot.lastDominatedAscendingEndpointDeltaTicks);
        Store(LastDominatedAscendingEndpointBackingAndLevel,
              Pack32(snapshot.lastDominatedAscendingEndpointBackingFrames,
                     snapshot.lastDominatedAscendingEndpointLevelPostWrite));
        Store(LastDominatedAscendingEndpointOutputBufferSize,
              snapshot.lastDominatedAscendingEndpointOutputBufferSize);
        Store(LastDominatedAscendingEndpointOutputSampleRate,
              DoubleToBits(
                  snapshot.lastDominatedAscendingEndpointOutputSampleRate));
        Store(FastAnchorRebaseCount,
              snapshot.fastAnchorRebaseCount);
        Store(LastFastAnchorRebaseUpdateId,
              snapshot.lastFastAnchorRebaseUpdateId);
        Store(LastFastAnchorRebaseDeltaConsumed,
              snapshot.lastFastAnchorRebaseDeltaConsumed);
        Store(LastFastAnchorRebaseDeltaTicks,
              snapshot.lastFastAnchorRebaseDeltaTicks);
        Store(LastFastAnchorRebaseRawRatio,
              DoubleToBits(snapshot.lastFastAnchorRebaseRawRatio));
        Store(LastFastAnchorRebaseRatioBeforeEstimators,
              DoubleToBits(
                  snapshot.lastFastAnchorRebaseRatioBeforeEstimators));
        Store(LastFastAnchorRebaseRatioAfter,
              DoubleToBits(snapshot.lastFastAnchorRebaseRatioAfter));
        Store(LastFastAnchorRebaseLevels,
              Pack32(snapshot.lastFastAnchorRebaseLevelPostConsumption,
                     snapshot.lastFastAnchorRebaseLevelPostWrite));
        Store(LastFastAnchorRebaseRecoveryAndDecisionFlags,
              Pack32(snapshot.lastFastAnchorRebaseRecoveryAscendingFrames,
                     snapshot.lastFastAnchorRebaseDecisionFlags));
        const std::uint32_t fastAnchorRebaseState =
            (snapshot.lastFastAnchorRebaseTargetRateOwned ? 1u : 0u)
            | (snapshot.lastFastAnchorRebaseEstimatorEvaluated ? 2u : 0u);
        Store(LastFastAnchorRebaseState, fastAnchorRebaseState);
        Store(RateRecoveryRebaseCount,
              snapshot.rateRecoveryRebaseCount);
        Store(LastRateRecoveryRebaseUpdateId,
              snapshot.lastRateRecoveryRebaseUpdateId);
        Store(LastRateRecoveryRebaseDeltaConsumed,
              snapshot.lastRateRecoveryRebaseDeltaConsumed);
        Store(LastRateRecoveryRebaseDeltaTicks,
              snapshot.lastRateRecoveryRebaseDeltaTicks);
        Store(LastRateRecoveryRebaseLevels,
              Pack32(snapshot.lastRateRecoveryRebaseLevelPostConsumption,
                     snapshot.lastRateRecoveryRebaseLevelPostWrite));
        Store(LastRateRecoveryRebaseTargetRatio,
              DoubleToBits(snapshot.lastRateRecoveryRebaseTargetRatio));
        const std::uint32_t rateRecoveryRebaseState =
            (snapshot.lastRateRecoveryRebaseFastLowPending ? 1u : 0u)
            | (snapshot.lastRateRecoveryRebaseFastTargetChangePending
               ? 2u : 0u);
        Store(LastRateRecoveryRebaseBoundaryAndState,
              Pack32(snapshot.lastRateRecoveryRebaseBoundaryFrames,
                     rateRecoveryRebaseState));
        Store(FramesAtConsumption, snapshot.framesAtConsumption);
        Store(SustainedCandidateGeneration,
              snapshot.sustainedCandidateGeneration);
        Store(SustainedOwnerGeneration,
              snapshot.sustainedOwnerGeneration);
        Store(SustainedOwnerCandidateGeneration,
              snapshot.sustainedOwnerCandidateGeneration);
        const std::uint32_t sustainedState =
            (snapshot.sustainedCandidateActive ? 1u : 0u)
            | (snapshot.sustainedOwnerActive ? 2u : 0u);
        Store(SustainedState, sustainedState);
        Store(SustainedOwnerRatio,
              DoubleToBits(snapshot.sustainedOwnerRatio));
        Store(SustainedObservationCount,
              snapshot.sustainedObservationCount);
        Store(LastSustainedObservationUpdateId,
              snapshot.lastSustainedObservationUpdateId);
        Store(LastSustainedObservationCandidateGeneration,
              snapshot.lastSustainedObservationCandidateGeneration);
        Store(LastSustainedObservationEndConsumed,
              snapshot.lastSustainedObservationEndConsumed);
        Store(LastSustainedObservationEndTicks,
              snapshot.lastSustainedObservationEndTicks);
        Store(LastSustainedObservationEndProduced,
              snapshot.lastSustainedObservationEndProduced);
        Store(LastSustainedObservationDeltaConsumed,
              snapshot.lastSustainedObservationDeltaConsumed);
        Store(LastSustainedObservationDeltaTicks,
              snapshot.lastSustainedObservationDeltaTicks);
        Store(LastSustainedObservationDeltaProduced,
              snapshot.lastSustainedObservationDeltaProduced);
        Store(LastSustainedObservationRawRatio,
              DoubleToBits(snapshot.lastSustainedObservationRawRatio));
        Store(LastSustainedObservationLevels,
              Pack32(snapshot.lastSustainedObservationStartLevel,
                     snapshot.lastSustainedObservationEndLevel));
        Store(LastSustainedObservationRange,
              Pack32(snapshot.lastSustainedObservationMinLevel,
                     snapshot.lastSustainedObservationMaxLevel));
        Store(SustainedStateFlagsAndObservationType,
              Pack32(snapshot.sustainedStateFlags,
                     snapshot.lastSustainedObservationType));
        Store(SustainedEpisodeOriginUpdateId,
              snapshot.sustainedEpisodeOriginUpdateId);
        Store(SustainedParentRatio,
              DoubleToBits(snapshot.sustainedParentRatio));
        Store(SustainedParentDeltaConsumed,
              snapshot.sustainedParentDeltaConsumed);
        Store(SustainedParentDeltaTicks,
              snapshot.sustainedParentDeltaTicks);
        Store(SustainedRecoveryAndEffectivePhase,
              Pack32(snapshot.sustainedRecoveryBoundaryFrames,
                     snapshot.effectivePhaseTargetFrames));
        Store(SustainedTransitionCount,
              snapshot.sustainedTransitionCount);
        Store(LastSustainedTransitionUpdateId,
              snapshot.lastSustainedTransitionUpdateId);
        Store(LastSustainedTransitionKind,
              snapshot.lastSustainedTransitionKind);
        Store(LastSustainedTransitionOwnerGeneration,
              snapshot.lastSustainedTransitionOwnerGeneration);
        Store(FastLowWitnessOwnerGeneration,
              snapshot.fastLowWitnessOwnerGeneration);
        Store(FastLowWitnessEndConsumed,
              snapshot.fastLowWitnessEndConsumed);
        Store(FastLowWitnessEndTicks,
              snapshot.fastLowWitnessEndTicks);
        Store(FastLowWitnessEndProduced,
              snapshot.fastLowWitnessEndProduced);
        Store(FastLowWitnessEndLevel,
              snapshot.fastLowWitnessEndLevel);
        Store(FastLowWitnessBirthCount,
              snapshot.fastLowWitnessBirthCount);
        Store(LastFastLowWitnessBirthUpdateId,
              snapshot.lastFastLowWitnessBirthUpdateId);
        Store(LastFastLowWitnessBirthKindAndLevel,
              Pack32(snapshot.lastFastLowWitnessBirthKind,
                     snapshot.lastFastLowWitnessBirthLevel));
        Store(LastFastLowWitnessBirthOwnerGeneration,
              snapshot.lastFastLowWitnessBirthOwnerGeneration);
        Store(LastFastLowWitnessBirthConsumed,
              snapshot.lastFastLowWitnessBirthConsumed);
        Store(LastFastLowWitnessBirthTicks,
              snapshot.lastFastLowWitnessBirthTicks);
        Store(LastFastLowWitnessBirthProduced,
              snapshot.lastFastLowWitnessBirthProduced);
        Store(LastFastLowWitnessBirthLevelPostWrite,
              snapshot.lastFastLowWitnessBirthLevelPostWrite);
        Store(FastLowWitnessClearCount,
              snapshot.fastLowWitnessClearCount);
        Store(LastFastLowWitnessClearUpdateId,
              snapshot.lastFastLowWitnessClearUpdateId);
        Store(LastFastLowWitnessClearReasonsAndWitnessLevel,
              Pack32(snapshot.lastFastLowWitnessClearReasons,
                     snapshot.lastFastLowWitnessClearWitnessLevel));
        Store(LastFastLowWitnessClearOwnerGeneration,
              snapshot.lastFastLowWitnessClearOwnerGeneration);
        Store(LastFastLowWitnessClearWitnessConsumed,
              snapshot.lastFastLowWitnessClearWitnessConsumed);
        Store(LastFastLowWitnessClearWitnessTicks,
              snapshot.lastFastLowWitnessClearWitnessTicks);
        Store(LastFastLowWitnessClearWitnessProduced,
              snapshot.lastFastLowWitnessClearWitnessProduced);
        Store(LastFastLowWitnessClearConsumed,
              snapshot.lastFastLowWitnessClearConsumed);
        Store(LastFastLowWitnessClearTicks,
              snapshot.lastFastLowWitnessClearTicks);
        Store(LastFastLowWitnessClearProduced,
              snapshot.lastFastLowWitnessClearProduced);
        Store(LastFastLowWitnessClearLevels,
              Pack32(snapshot.lastFastLowWitnessClearLevel,
                     snapshot.lastFastLowWitnessClearLevelPostWrite));
        Store(FramesPublishedTotal,
              snapshot.framesPublishedTotal);
        Store(ParentCapacityState,
              Pack32(snapshot.parentCapacityActive ? 1u : 0u,
                     snapshot.parentCapacityCapacity));
        Store(ParentCapacityGeneration,
              snapshot.parentCapacityGeneration);
        Store(ParentCapacitySourceOwnerGeneration,
              snapshot.parentCapacitySourceOwnerGeneration);
        Store(ParentCapacityParentRatio,
              DoubleToBits(snapshot.parentCapacityParentRatio));
        Store(ParentCapacityStartContinuityEpoch,
              snapshot.parentCapacityStartContinuityEpoch);
        Store(ParentCapacityStartResetEpoch,
              Pack32(snapshot.parentCapacityStartResetEpoch,
                     snapshot.parentCapacityStartHintSeenEpoch));
        Store(ParentCapacityStartConsumed,
              snapshot.parentCapacityStartConsumed);
        Store(ParentCapacityStartTicks,
              snapshot.parentCapacityStartTicks);
        Store(ParentCapacityStartConsumedProduced,
              snapshot.parentCapacityStartConsumedProduced);
        Store(ParentCapacityStartPublishedProduced,
              snapshot.parentCapacityStartPublishedProduced);
        Store(ParentCapacityStartLevels,
              Pack32(snapshot.parentCapacityStartLevelPostConsumption,
                     snapshot.parentCapacityStartLevelPostWrite));
        Store(ParentCapacityBirthCount,
              snapshot.parentCapacityBirthCount);
        Store(LastParentCapacityBirthUpdateId,
              snapshot.lastParentCapacityBirthUpdateId);
        Store(ParentCapacityFirstRiskCount,
              snapshot.parentCapacityFirstRiskCount);
        Store(LastParentCapacityFirstRiskUpdateId,
              snapshot.lastParentCapacityFirstRiskUpdateId);
        Store(LastParentCapacityFirstRiskGeneration,
              snapshot.lastParentCapacityFirstRiskGeneration);
        Store(LastParentCapacityFirstRiskLevels,
              Pack32(snapshot.lastParentCapacityFirstRiskLevelBeforeWrite,
                     snapshot.lastParentCapacityFirstRiskFramesProduced));
        Store(LastParentCapacityFirstRiskCapacity,
              snapshot.lastParentCapacityFirstRiskCapacity);
        Store(ParentCapacityClearCount,
              snapshot.parentCapacityClearCount);
        Store(LastParentCapacityClearUpdateId,
              snapshot.lastParentCapacityClearUpdateId);
        Store(LastParentCapacityClearReasons,
              snapshot.lastParentCapacityClearReasons);
        Store(LastParentCapacityClearGeneration,
              snapshot.lastParentCapacityClearGeneration);
        Store(LastParentCapacityClearConsumed,
              snapshot.lastParentCapacityClearConsumed);
        Store(LastParentCapacityClearTicks,
              snapshot.lastParentCapacityClearTicks);
        Store(LastParentCapacityClearPublishedProduced,
              snapshot.lastParentCapacityClearPublishedProduced);
        Store(LastParentCapacityClearLevelPostWrite,
              snapshot.lastParentCapacityClearLevelPostWrite);
        Store(LogicalLevelPostConsumption,
              snapshot.logicalLevelPostConsumption);
        Store(LogicalLevelBeforeWrite,
              snapshot.logicalLevelBeforeWrite);
        Store(LogicalLevelPostWrite,
              snapshot.logicalLevelPostWrite);
        Store(SpillFrames,
              snapshot.spillFrames);
        Store(SpillPeakFrames,
              snapshot.spillPeakFrames);
        Store(SpillNodeCounts,
              Pack32(snapshot.spillActiveNodes,
                     snapshot.spillFreeNodes));
        Store(SpillGeneration,
              snapshot.spillGeneration);
        Store(SpillBirthCount,
              snapshot.spillBirthCount);
        Store(LastSpillBirthUpdateId,
              snapshot.lastSpillBirthUpdateId);
        Store(LastSpillBirthContinuityEpoch,
              snapshot.lastSpillBirthContinuityEpoch);
        Store(LastSpillBirthResetAndFrames,
              Pack32(snapshot.lastSpillBirthResetEpoch,
                     snapshot.lastSpillBirthFrames));
        Store(LastSpillBirthOwnerGeneration,
              snapshot.lastSpillBirthOwnerGeneration);
        Store(SpillPublicationCount,
              snapshot.spillPublicationCount);
        Store(SpillFramesPublishedTotal,
              snapshot.spillFramesPublishedTotal);
        Store(SpillAllocationCount,
              snapshot.spillAllocationCount);
        Store(SpillAllocationFailureCount,
              snapshot.spillAllocationFailureCount);
        Store(SpillDroppedPacketsTotal,
              snapshot.spillDroppedPacketsTotal);
        Store(SpillDroppedFramesTotal,
              snapshot.spillDroppedFramesTotal);
        Store(SpillDroppedThisWrite,
              Pack32(snapshot.spillDroppedPacketsThisWrite,
                     snapshot.spillDroppedFramesThisWrite));
        Store(ProvisionalFastStateFlags,
              snapshot.provisionalFastStateFlags);
        Store(ProvisionalFastAnchorConsumed,
              snapshot.provisionalFastAnchorConsumed);
        Store(ProvisionalFastAnchorTicks,
              snapshot.provisionalFastAnchorTicks);
        Store(ProvisionalFastAnchorProduced,
              snapshot.provisionalFastAnchorProduced);
        Store(ProvisionalFastAnchorLevelPostConsumption,
              snapshot.provisionalFastAnchorLevelPostConsumption);
        Store(ProvisionalFastAnchorLevelPostWrite,
              snapshot.provisionalFastAnchorLevelPostWrite);
        Store(ProvisionalFastAnchorContinuityEpoch,
              snapshot.provisionalFastAnchorContinuityEpoch);
        Store(ProvisionalFastAnchorResetAndHintSeenEpoch,
              Pack32(snapshot.provisionalFastAnchorResetEpoch,
                     snapshot.provisionalFastAnchorHintSeenEpoch));
        Store(ProvisionalFastAnchorCandidateGeneration,
              snapshot.provisionalFastAnchorCandidateGeneration);
        Store(ProvisionalFastAnchorOwnerGeneration,
              snapshot.provisionalFastAnchorOwnerGeneration);
        Store(ProvisionalCandidateStartConsumed,
              snapshot.provisionalCandidateStartConsumed);
        Store(ProvisionalCandidateStartTicks,
              snapshot.provisionalCandidateStartTicks);
        Store(ProvisionalCandidateStartProduced,
              snapshot.provisionalCandidateStartProduced);
        Store(ProvisionalCandidateStartLevelPostConsumption,
              snapshot.provisionalCandidateStartLevelPostConsumption);
        Store(ProvisionalCandidateStartLevelPostWrite,
              snapshot.provisionalCandidateStartLevelPostWrite);
        Store(ProvisionalCandidateStartContinuityEpoch,
              snapshot.provisionalCandidateStartContinuityEpoch);
        Store(ProvisionalCandidateStartResetAndHintSeenEpoch,
              Pack32(snapshot.provisionalCandidateStartResetEpoch,
                     snapshot.provisionalCandidateStartHintSeenEpoch));
        Store(ProvisionalCandidateDirection,
              static_cast<std::uint32_t>(
                  snapshot.provisionalCandidateDirection));
        Store(ProvisionalEventCount, snapshot.provisionalEventCount);
        Store(LastProvisionalEventUpdateId,
              snapshot.lastProvisionalEventUpdateId);
        Store(LastProvisionalEventFlagsAndFastStateBefore,
              Pack32(snapshot.lastProvisionalEventFlags,
                     snapshot.lastProvisionalEventFastStateBefore));
        Store(LastProvisionalEventFastStateAfter,
              snapshot.lastProvisionalEventFastStateAfter);
        Store(LastProvisionalEventFastAnchorConsumed,
              snapshot.lastProvisionalEventFastAnchorConsumed);
        Store(LastProvisionalEventFastAnchorTicks,
              snapshot.lastProvisionalEventFastAnchorTicks);
        Store(LastProvisionalEventFastAnchorProduced,
              snapshot.lastProvisionalEventFastAnchorProduced);
        Store(LastProvisionalEventFastAnchorLevelPostConsumption,
              snapshot.lastProvisionalEventFastAnchorLevelPostConsumption);
        Store(LastProvisionalEventFastAnchorLevelPostWrite,
              snapshot.lastProvisionalEventFastAnchorLevelPostWrite);
        Store(LastProvisionalEventCandidateGeneration,
              snapshot.lastProvisionalEventCandidateGeneration);
        Store(LastProvisionalEventCandidateStartConsumed,
              snapshot.lastProvisionalEventCandidateStartConsumed);
        Store(LastProvisionalEventCandidateStartTicks,
              snapshot.lastProvisionalEventCandidateStartTicks);
        Store(LastProvisionalEventCandidateStartProduced,
              snapshot.lastProvisionalEventCandidateStartProduced);
        Store(LastProvisionalEventCandidateStartLevelPostConsumption,
              snapshot.lastProvisionalEventCandidateStartLevelPostConsumption);
        Store(LastProvisionalEventCandidateStartLevelPostWrite,
              snapshot.lastProvisionalEventCandidateStartLevelPostWrite);
        Store(LastProvisionalEventCandidateDirection,
              static_cast<std::uint32_t>(
                  snapshot.lastProvisionalEventCandidateDirection));
        Store(LastProvisionalEventOwnerGeneration,
              snapshot.lastProvisionalEventOwnerGeneration);
        Store(LastProvisionalEventEndpointConsumed,
              snapshot.lastProvisionalEventEndpointConsumed);
        Store(LastProvisionalEventEndpointTicks,
              snapshot.lastProvisionalEventEndpointTicks);
        Store(LastProvisionalEventEndpointProduced,
              snapshot.lastProvisionalEventEndpointProduced);
        Store(LastProvisionalEventEndpointLevelPostConsumption,
              snapshot.lastProvisionalEventEndpointLevelPostConsumption);
        Store(LastProvisionalEventEndpointLevelPostWrite,
              snapshot.lastProvisionalEventEndpointLevelPostWrite);
        Store(LastProvisionalEventEndpointContinuityEpoch,
              snapshot.lastProvisionalEventEndpointContinuityEpoch);
        Store(LastProvisionalEventResetAndHintSeenEpoch,
              Pack32(snapshot.lastProvisionalEventResetEpoch,
                     snapshot.lastProvisionalEventHintSeenEpoch));
        Store(LastProvisionalEventDecisionFlags,
              snapshot.lastProvisionalEventDecisionFlags);
        Store(ProvisionalFastAnchorPublishedProduced,
              snapshot.provisionalFastAnchorPublishedProduced);
        Store(ProvisionalCandidateStartPublishedProduced,
              snapshot.provisionalCandidateStartPublishedProduced);
        Store(LastProvisionalEventFastAnchorPublishedProduced,
              snapshot.lastProvisionalEventFastAnchorPublishedProduced);
        Store(LastProvisionalEventFastAnchorContinuityEpoch,
              snapshot.lastProvisionalEventFastAnchorContinuityEpoch);
        Store(LastProvisionalEventFastAnchorResetAndHintSeenEpoch,
              Pack32(snapshot.lastProvisionalEventFastAnchorResetEpoch,
                     snapshot.lastProvisionalEventFastAnchorHintSeenEpoch));
        Store(LastProvisionalEventFastAnchorCandidateGeneration,
              snapshot.lastProvisionalEventFastAnchorCandidateGeneration);
        Store(LastProvisionalEventFastAnchorOwnerGeneration,
              snapshot.lastProvisionalEventFastAnchorOwnerGeneration);
        Store(LastProvisionalEventCandidateStartPublishedProduced,
              snapshot.lastProvisionalEventCandidateStartPublishedProduced);
        Store(LastProvisionalEventCandidateStartContinuityEpoch,
              snapshot.lastProvisionalEventCandidateStartContinuityEpoch);
        Store(LastProvisionalEventCandidateStartResetAndHintSeenEpoch,
              Pack32(snapshot.lastProvisionalEventCandidateStartResetEpoch,
                     snapshot.lastProvisionalEventCandidateStartHintSeenEpoch));
        Store(LastProvisionalEventEndpointPublishedProduced,
              snapshot.lastProvisionalEventEndpointPublishedProduced);
        Store(LastProvisionalEventPreviousCandidateGeneration,
              snapshot.lastProvisionalEventPreviousCandidateGeneration);
        Store(LastProvisionalEventPreviousCandidateStartConsumed,
              snapshot.lastProvisionalEventPreviousCandidateStartConsumed);
        Store(LastProvisionalEventPreviousCandidateStartTicks,
              snapshot.lastProvisionalEventPreviousCandidateStartTicks);
        Store(LastProvisionalEventPreviousCandidateStartProduced,
              snapshot.lastProvisionalEventPreviousCandidateStartProduced);
        Store(LastProvisionalEventPreviousCandidateStartPublishedProduced,
              snapshot.lastProvisionalEventPreviousCandidateStartPublishedProduced);
        Store(LastProvisionalEventPreviousCandidateStartLevelPostConsumption,
              snapshot.lastProvisionalEventPreviousCandidateStartLevelPostConsumption);
        Store(LastProvisionalEventPreviousCandidateStartLevelPostWrite,
              snapshot.lastProvisionalEventPreviousCandidateStartLevelPostWrite);
        Store(LastProvisionalEventPreviousCandidateStartContinuityEpoch,
              snapshot.lastProvisionalEventPreviousCandidateStartContinuityEpoch);
        Store(LastProvisionalEventPreviousCandidateStartResetAndHintSeenEpoch,
              Pack32(
                  snapshot.lastProvisionalEventPreviousCandidateStartResetEpoch,
                  snapshot.lastProvisionalEventPreviousCandidateStartHintSeenEpoch));
        Store(LastProvisionalEventPreviousCandidateDirection,
              static_cast<std::uint32_t>(
                  snapshot.lastProvisionalEventPreviousCandidateDirection));
        Store(TicksPublishedTotal, snapshot.ticksPublishedTotal);
        const std::uint32_t fastHighEscrowState =
            (snapshot.fastHighEscrowInitialized ? 1u : 0u)
            | (snapshot.fastHighEscrowActive ? 2u : 0u)
            | (snapshot.fastHighEscrowReferenceIsOverride ? 4u : 0u);
        Store(FastHighEscrowState, fastHighEscrowState);
        Store(FastHighEscrowOwnerGeneration,
              snapshot.fastHighEscrowOwnerGeneration);
        Store(FastHighEscrowReferenceTicks,
              snapshot.fastHighEscrowReferenceTicks);
        Store(FastHighEscrowReferenceConsumed,
              snapshot.fastHighEscrowReferenceConsumed);
        Store(FastHighEscrowRate,
              DoubleToBits(snapshot.fastHighEscrowRate));
        Store(FastHighEscrowStartTicks,
              snapshot.fastHighEscrowStartTicks);
        Store(FastHighEscrowStartPublishedProduced,
              snapshot.fastHighEscrowStartPublishedProduced);
        Store(FastHighEscrowStartConsumed,
              snapshot.fastHighEscrowStartConsumed);
        Store(FastHighEscrowStartConsumedProduced,
              snapshot.fastHighEscrowStartConsumedProduced);
        Store(FastHighEscrowStartLevelPostConsumption,
              snapshot.fastHighEscrowStartLevelPostConsumption);
        Store(FastHighEscrowStartLevelPostWrite,
              snapshot.fastHighEscrowStartLevelPostWrite);
        Store(FastHighEscrowStartContinuityEpoch,
              snapshot.fastHighEscrowStartContinuityEpoch);
        Store(FastHighEscrowStartResetAndHintSeenEpoch,
              Pack32(snapshot.fastHighEscrowStartResetEpoch,
                     snapshot.fastHighEscrowStartHintSeenEpoch));
        Store(FastHighEscrowGrantFrames,
              snapshot.fastHighEscrowGrantFrames);
        Store(FastHighEscrowSpentFrames,
              snapshot.fastHighEscrowSpentFrames);
        Store(FastHighEscrowRemainingFrames,
              snapshot.fastHighEscrowRemainingFrames);
        Store(FastHighEscrowBirthCount,
              snapshot.fastHighEscrowBirthCount);
        Store(LastFastHighEscrowBirthUpdateId,
              snapshot.lastFastHighEscrowBirthUpdateId);
        Store(LastFastHighEscrowBirthOwnerGeneration,
              snapshot.lastFastHighEscrowBirthOwnerGeneration);
        Store(LastFastHighEscrowBirthState,
              snapshot.lastFastHighEscrowBirthReferenceWasOverride ? 1u : 0u);
        Store(LastFastHighEscrowBirthReferenceTicks,
              snapshot.lastFastHighEscrowBirthReferenceTicks);
        Store(LastFastHighEscrowBirthReferenceConsumed,
              snapshot.lastFastHighEscrowBirthReferenceConsumed);
        Store(LastFastHighEscrowBirthRate,
              DoubleToBits(snapshot.lastFastHighEscrowBirthRate));
        Store(LastFastHighEscrowBirthStartTicks,
              snapshot.lastFastHighEscrowBirthStartTicks);
        Store(LastFastHighEscrowBirthStartPublishedProduced,
              snapshot.lastFastHighEscrowBirthStartPublishedProduced);
        Store(LastFastHighEscrowBirthStartConsumed,
              snapshot.lastFastHighEscrowBirthStartConsumed);
        Store(LastFastHighEscrowBirthStartConsumedProduced,
              snapshot.lastFastHighEscrowBirthStartConsumedProduced);
        Store(LastFastHighEscrowBirthStartLevelPostConsumption,
              snapshot.lastFastHighEscrowBirthStartLevelPostConsumption);
        Store(LastFastHighEscrowBirthStartLevelPostWrite,
              snapshot.lastFastHighEscrowBirthStartLevelPostWrite);
        Store(LastFastHighEscrowBirthStartContinuityEpoch,
              snapshot.lastFastHighEscrowBirthStartContinuityEpoch);
        Store(LastFastHighEscrowBirthStartResetAndHintSeenEpoch,
              Pack32(snapshot.lastFastHighEscrowBirthStartResetEpoch,
                     snapshot.lastFastHighEscrowBirthStartHintSeenEpoch));
        Store(LastFastHighEscrowBirthGrantFrames,
              snapshot.lastFastHighEscrowBirthGrantFrames);
        Store(FastHighEscrowSpendCount,
              snapshot.fastHighEscrowSpendCount);
        Store(LastFastHighEscrowSpendUpdateId,
              snapshot.lastFastHighEscrowSpendUpdateId);
        Store(LastFastHighEscrowSpentFrames,
              snapshot.lastFastHighEscrowSpentFrames);
        Store(LastFastHighEscrowRemainingFrames,
              snapshot.lastFastHighEscrowRemainingFrames);
        Store(FastHighEscrowOverlayCount,
              snapshot.fastHighEscrowOverlayCount);
        Store(LastFastHighEscrowOverlayUpdateId,
              snapshot.lastFastHighEscrowOverlayUpdateId);
        Store(LastFastHighEscrowOverlayRemainingFrames,
              snapshot.lastFastHighEscrowOverlayRemainingFrames);
        Store(LastFastHighEscrowOverlaySkew,
              DoubleToBits(snapshot.lastFastHighEscrowOverlaySkew));
        Store(FastHighEscrowClearCount,
              snapshot.fastHighEscrowClearCount);
        Store(LastFastHighEscrowClearUpdateId,
              snapshot.lastFastHighEscrowClearUpdateId);
        Store(LastFastHighEscrowClearReasons,
              snapshot.lastFastHighEscrowClearReasons);
        Store(LastFastHighEscrowClearOwnerGeneration,
              snapshot.lastFastHighEscrowClearOwnerGeneration);
        Store(LastFastHighEscrowClearGrantFrames,
              snapshot.lastFastHighEscrowClearGrantFrames);
        Store(LastFastHighEscrowClearSpentFrames,
              snapshot.lastFastHighEscrowClearSpentFrames);
        Store(FastHighEscrowGuardSkew,
              DoubleToBits(snapshot.fastHighEscrowGuardSkew));
        Store(LastFastHighEscrowBirthGuardSkew,
              DoubleToBits(snapshot.lastFastHighEscrowBirthGuardSkew));
        Store(FastHighEscrowHorizonFrames,
              snapshot.fastHighEscrowHorizonFrames);
        Store(LastFastHighEscrowBirthHorizonFrames,
              snapshot.lastFastHighEscrowBirthHorizonFrames);
        Store(FastTargetChangePhaseFrontierState,
              Pack32(snapshot.fastTargetChangePhaseFrontierOrigin,
                     snapshot.fastTargetChangePhaseFrontierValid ? 1u : 0u));
        Store(FastTargetChangePhaseFrontierInvalidationCount,
              snapshot.fastTargetChangePhaseFrontierInvalidationCount);
        Store(LastFastTargetChangePhaseFrontierInvalidationUpdateId,
              snapshot.lastFastTargetChangePhaseFrontierInvalidationUpdateId);
        Store(LastFastTargetChangePhaseFrontierInvalidationReasons,
              snapshot.lastFastTargetChangePhaseFrontierInvalidationReasons);
        Store(FastTargetChangePhaseFrontierEvaluationCount,
              snapshot.fastTargetChangePhaseFrontierEvaluationCount);
        Store(LastFastTargetChangePhaseFrontierEvaluationUpdateId,
              snapshot.lastFastTargetChangePhaseFrontierEvaluationUpdateId);
        Store(LastFastTargetChangePhaseFrontierEvaluation,
              Pack32(snapshot.lastFastTargetChangePhaseFrontierEvaluationOrigin,
                     snapshot.lastFastTargetChangePhaseFrontierEvaluationRejectMask));
        Store(FastTargetChangePhaseEscrowState,
              snapshot.fastTargetChangePhaseEscrowActive ? 1u : 0u);
        Store(FastTargetChangePhaseEscrowGrantFrames,
              snapshot.fastTargetChangePhaseEscrowGrantFrames);
        Store(FastTargetChangePhaseEscrowGuardSkew,
              DoubleToBits(snapshot.fastTargetChangePhaseEscrowGuardSkew));
        Store(FastTargetChangePhaseEscrowOverlaySkew,
              DoubleToBits(snapshot.fastTargetChangePhaseEscrowOverlaySkew));
        Store(FastTargetChangePhaseEscrowReferenceRate,
              DoubleToBits(snapshot.fastTargetChangePhaseEscrowReferenceRate));
        Store(FastTargetChangePhaseEscrowStartTicks,
              snapshot.fastTargetChangePhaseEscrowStartTicks);
        Store(FastTargetChangePhaseEscrowStartConsumed,
              snapshot.fastTargetChangePhaseEscrowStartConsumed);
        Store(FastTargetChangePhaseEscrowStartConsumedProduced,
              snapshot.fastTargetChangePhaseEscrowStartConsumedProduced);
        Store(FastTargetChangePhaseEscrowStartPublishedProduced,
              snapshot.fastTargetChangePhaseEscrowStartPublishedProduced);
        Store(FastTargetChangePhaseEscrowStartLevelPostConsumption,
              snapshot.fastTargetChangePhaseEscrowStartLevelPostConsumption);
        Store(FastTargetChangePhaseEscrowStartLevelPostWrite,
              snapshot.fastTargetChangePhaseEscrowStartLevelPostWrite);
        Store(FastTargetChangePhaseEscrowStartContinuityEpoch,
              snapshot.fastTargetChangePhaseEscrowStartContinuityEpoch);
        Store(FastTargetChangePhaseEscrowStartResetAndHintSeenEpoch,
              Pack32(snapshot.fastTargetChangePhaseEscrowStartResetEpoch,
                     snapshot.fastTargetChangePhaseEscrowStartHintSeenEpoch));
        Store(FastTargetChangePhaseEscrowStartCandidateGeneration,
              snapshot.fastTargetChangePhaseEscrowStartCandidateGeneration);
        Store(FastTargetChangePhaseEscrowElapsedPublishedTicks,
              snapshot.fastTargetChangePhaseEscrowElapsedPublishedTicks);
        Store(FastTargetChangePhaseEscrowCurrentPhysicalPrefix,
              snapshot.fastTargetChangePhaseEscrowCurrentPhysicalPrefix);
        Store(FastTargetChangePhaseEscrowBirthCount,
              snapshot.fastTargetChangePhaseEscrowBirthCount);
        Store(LastFastTargetChangePhaseEscrowBirthUpdateId,
              snapshot.lastFastTargetChangePhaseEscrowBirthUpdateId);
        Store(LastFastTargetChangePhaseEscrowBirthGrantFrames,
              snapshot.lastFastTargetChangePhaseEscrowBirthGrantFrames);
        Store(LastFastTargetChangePhaseEscrowBirthGuardSkew,
              DoubleToBits(
                  snapshot.lastFastTargetChangePhaseEscrowBirthGuardSkew));
        Store(FastTargetChangePhaseEscrowClearCount,
              snapshot.fastTargetChangePhaseEscrowClearCount);
        Store(LastFastTargetChangePhaseEscrowClearUpdateId,
              snapshot.lastFastTargetChangePhaseEscrowClearUpdateId);
        Store(LastFastTargetChangePhaseEscrowClearReasons,
              snapshot.lastFastTargetChangePhaseEscrowClearReasons);
        Store(LastFastTargetChangePhaseEscrowClearGrantFrames,
              snapshot.lastFastTargetChangePhaseEscrowClearGrantFrames);
        Store(LastFastTargetChangePhaseEscrowClearOverlaySkew,
              DoubleToBits(
                  snapshot.lastFastTargetChangePhaseEscrowClearOverlaySkew));
        Store(SustainedProvisionalPhaseState,
              Pack32(snapshot.sustainedProvisionalPhaseActive ? 1u : 0u,
                     snapshot.sustainedProvisionalPhaseReservedPublicationCount));
        Store(SustainedProvisionalPhaseCandidateGeneration,
              snapshot.sustainedProvisionalPhaseCandidateGeneration);
        Store(SustainedProvisionalPhaseOwnerGeneration,
              snapshot.sustainedProvisionalPhaseOwnerGeneration);
        Store(SustainedProvisionalPhaseParentRatio,
              DoubleToBits(snapshot.sustainedProvisionalPhaseParentRatio));
        Store(SustainedProvisionalPhaseSkew,
              DoubleToBits(snapshot.sustainedProvisionalPhaseSkew));
        Store(SustainedProvisionalPhaseFrontierFrames,
              snapshot.sustainedProvisionalPhaseFrontierFrames);
        Store(SustainedProvisionalPhaseBackingFrames,
              snapshot.sustainedProvisionalPhaseBackingFrames);
        Store(SustainedProvisionalPhasePublicationReserveFrames,
              snapshot.sustainedProvisionalPhasePublicationReserveFrames);
        Store(SustainedProvisionalPhaseBirthCount,
              snapshot.sustainedProvisionalPhaseBirthCount);
        Store(LastSustainedProvisionalPhaseBirthUpdateId,
              snapshot.lastSustainedProvisionalPhaseBirthUpdateId);
        Store(LastSustainedProvisionalPhaseBirthCandidateGeneration,
              snapshot.lastSustainedProvisionalPhaseBirthCandidateGeneration);
        Store(LastSustainedProvisionalPhaseBirthParentRatio,
              DoubleToBits(
                  snapshot.lastSustainedProvisionalPhaseBirthParentRatio));
        Store(LastSustainedProvisionalPhaseBirthSkew,
              DoubleToBits(snapshot.lastSustainedProvisionalPhaseBirthSkew));
        Store(LastSustainedProvisionalPhaseBirthFrontierFrames,
              snapshot.lastSustainedProvisionalPhaseBirthFrontierFrames);
        Store(LastSustainedProvisionalPhaseBirthBackingFrames,
              snapshot.lastSustainedProvisionalPhaseBirthBackingFrames);
        Store(LastSustainedProvisionalPhaseBirthPublicationReserveFrames,
              snapshot.lastSustainedProvisionalPhaseBirthPublicationReserveFrames);
        Store(LastSustainedProvisionalPhaseBirthReservedPublicationCount,
              snapshot.lastSustainedProvisionalPhaseBirthReservedPublicationCount);
        Store(SustainedProvisionalPhaseStepCount,
              snapshot.sustainedProvisionalPhaseStepCount);
        Store(LastSustainedProvisionalPhaseStepUpdateId,
              snapshot.lastSustainedProvisionalPhaseStepUpdateId);
        Store(LastSustainedProvisionalPhaseStepCandidateGeneration,
              snapshot.lastSustainedProvisionalPhaseStepCandidateGeneration);
        Store(LastSustainedProvisionalPhaseStepPreviousSkew,
              DoubleToBits(
                  snapshot.lastSustainedProvisionalPhaseStepPreviousSkew));
        Store(LastSustainedProvisionalPhaseStepSkew,
              DoubleToBits(snapshot.lastSustainedProvisionalPhaseStepSkew));
        Store(LastSustainedProvisionalPhaseStepFrontierFrames,
              snapshot.lastSustainedProvisionalPhaseStepFrontierFrames);
        Store(LastSustainedProvisionalPhaseStepBackingFrames,
              snapshot.lastSustainedProvisionalPhaseStepBackingFrames);
        Store(LastSustainedProvisionalPhaseStepPublicationReserveFrames,
              snapshot.lastSustainedProvisionalPhaseStepPublicationReserveFrames);
        Store(LastSustainedProvisionalPhaseStepReservedPublicationCount,
              snapshot.lastSustainedProvisionalPhaseStepReservedPublicationCount);
        Store(SustainedProvisionalPhaseClearCount,
              snapshot.sustainedProvisionalPhaseClearCount);
        Store(LastSustainedProvisionalPhaseClearUpdateId,
              snapshot.lastSustainedProvisionalPhaseClearUpdateId);
        Store(LastSustainedProvisionalPhaseClearReasons,
              snapshot.lastSustainedProvisionalPhaseClearReasons);
        Store(LastSustainedProvisionalPhaseClearCandidateGeneration,
              snapshot.lastSustainedProvisionalPhaseClearCandidateGeneration);
        Store(LastSustainedProvisionalPhaseClearSkew,
              DoubleToBits(snapshot.lastSustainedProvisionalPhaseClearSkew));
        Store(LastSustainedProvisionalPhaseClearReservedPublicationCount,
              snapshot.lastSustainedProvisionalPhaseClearReservedPublicationCount);
        Store(SustainedProvisionalPhaseApplicationConflictCount,
              snapshot.sustainedProvisionalPhaseApplicationConflictCount);
        Store(LastSustainedProvisionalPhaseApplicationConflictUpdateId,
              snapshot.lastSustainedProvisionalPhaseApplicationConflictUpdateId);

        Sequence.store(oddSequence + 1, std::memory_order_release);
    }

    AudioOutputAdaptiveTelemetrySnapshot Read() const noexcept
    {
        std::array<std::uint64_t, WordCount> values {};

        for (int attempt = 0; attempt < MaxReadAttempts; ++attempt)
        {
            const std::uint64_t sequenceBefore =
                Sequence.load(std::memory_order_acquire);
            if (sequenceBefore == 0 || (sequenceBefore & 1u) != 0)
                continue;

            for (std::size_t index = 0; index < WordCount; ++index)
                values[index] = Words[index].load(std::memory_order_relaxed);

            std::atomic_thread_fence(std::memory_order_acq_rel);
            const std::uint64_t sequenceAfter =
                Sequence.load(std::memory_order_acquire);
            if (sequenceBefore != sequenceAfter ||
                (sequenceAfter & 1u) != 0)
            {
                continue;
            }

            return Decode(values, sequenceAfter >> 1);
        }

        return {};
    }

private:
    enum Word : std::size_t
    {
        UpdateId,
        HostConsumed,
        TicksAtConsumption,
        EstimatorDeltaConsumed,
        EstimatorDeltaTicks,
        EstimatorRawRatio,
        PrimingFrames,
        ControllerRatio,
        DesiredSkew,
        AppliedSkew,
        SpeedHint,
        LevelsBeforeWrite,
        LevelAfterWriteAndProduced,
        TransportCounters,
        WriteDropsAndCapacity,
        ResetRequestedAndConfirmed,
        ResetSeenAndHintEpoch,
        HintSeenAndDecisionFlags,
        LastFastAcceptedUpdateId,
        LastFastAcceptedRawRatio,
        LastFastAcceptedEffectiveRatio,
        LastFastLevelsBeforeWrite,
        LastFastLevelAfterWriteAndFlags,
        FastAcceptedCount,
        LastSlowAppliedUpdateId,
        LastSlowAppliedRawRatio,
        LastSlowAppliedEffectiveRatio,
        SlowAppliedCount,
        LastDropUpdateId,
        LastDropLevels,
        LastDropProducedAndCount,
        RollbackStateAndTarget,
        RollbackParentRatio,
        RollbackCount,
        LastRollbackUpdateId,
        LastRollbackParentRatio,
        LastRollbackTargetFrames,
        LastRollbackDeltaConsumed,
        LastRollbackDeltaTicks,
        ActuatorStateAndBacking,
        ActuatorTransitionCount,
        LastActuatorTransitionUpdateId,
        LastActuatorStartSkew,
        LastActuatorTargetRatio,
        LastActuatorFirstAppliedSkew,
        LastActuatorFirstControlFrames,
        LastActuatorDeltaConsumed,
        LastActuatorDeltaTicks,
        LastActuatorLevelPostWriteAndStepCount,
        LastActuatorMaxStepRatio,
        LastActuatorMonotonicViolationCount,
        LastActuatorConvergedUpdateId,
        HintParentState,
        HintParentCertificationCount,
        LastHintParentCertificationUpdateId,
        LastHintParentCertificationRatio,
        LastHintParentCertificationDeltaConsumed,
        LastHintParentCertificationDeltaTicks,
        DominatedAscendingEndpointCount,
        LastDominatedAscendingEndpointUpdateId,
        LastDominatedAscendingEndpointTransitionUpdateId,
        LastDominatedAscendingEndpointStartSkew,
        LastDominatedAscendingEndpointTargetRatio,
        LastDominatedAscendingEndpointAppliedSkew,
        LastDominatedAscendingEndpointDeltaConsumed,
        LastDominatedAscendingEndpointDeltaTicks,
        LastDominatedAscendingEndpointBackingAndLevel,
        LastDominatedAscendingEndpointOutputBufferSize,
        LastDominatedAscendingEndpointOutputSampleRate,
        FastAnchorRebaseCount,
        LastFastAnchorRebaseUpdateId,
        LastFastAnchorRebaseDeltaConsumed,
        LastFastAnchorRebaseDeltaTicks,
        LastFastAnchorRebaseRawRatio,
        LastFastAnchorRebaseRatioBeforeEstimators,
        LastFastAnchorRebaseRatioAfter,
        LastFastAnchorRebaseLevels,
        LastFastAnchorRebaseRecoveryAndDecisionFlags,
        LastFastAnchorRebaseState,
        RateRecoveryRebaseCount,
        LastRateRecoveryRebaseUpdateId,
        LastRateRecoveryRebaseDeltaConsumed,
        LastRateRecoveryRebaseDeltaTicks,
        LastRateRecoveryRebaseLevels,
        LastRateRecoveryRebaseTargetRatio,
        LastRateRecoveryRebaseBoundaryAndState,
        FramesAtConsumption,
        SustainedCandidateGeneration,
        SustainedOwnerGeneration,
        SustainedOwnerCandidateGeneration,
        SustainedState,
        SustainedOwnerRatio,
        SustainedObservationCount,
        LastSustainedObservationUpdateId,
        LastSustainedObservationCandidateGeneration,
        LastSustainedObservationEndConsumed,
        LastSustainedObservationEndTicks,
        LastSustainedObservationEndProduced,
        LastSustainedObservationDeltaConsumed,
        LastSustainedObservationDeltaTicks,
        LastSustainedObservationDeltaProduced,
        LastSustainedObservationRawRatio,
        LastSustainedObservationLevels,
        LastSustainedObservationRange,
        SustainedStateFlagsAndObservationType,
        SustainedEpisodeOriginUpdateId,
        SustainedParentRatio,
        SustainedParentDeltaConsumed,
        SustainedParentDeltaTicks,
        SustainedRecoveryAndEffectivePhase,
        SustainedTransitionCount,
        LastSustainedTransitionUpdateId,
        LastSustainedTransitionKind,
        LastSustainedTransitionOwnerGeneration,
        FastLowWitnessOwnerGeneration,
        FastLowWitnessEndConsumed,
        FastLowWitnessEndTicks,
        FastLowWitnessEndProduced,
        FastLowWitnessEndLevel,
        FastLowWitnessBirthCount,
        LastFastLowWitnessBirthUpdateId,
        LastFastLowWitnessBirthKindAndLevel,
        LastFastLowWitnessBirthOwnerGeneration,
        LastFastLowWitnessBirthConsumed,
        LastFastLowWitnessBirthTicks,
        LastFastLowWitnessBirthProduced,
        LastFastLowWitnessBirthLevelPostWrite,
        FastLowWitnessClearCount,
        LastFastLowWitnessClearUpdateId,
        LastFastLowWitnessClearReasonsAndWitnessLevel,
        LastFastLowWitnessClearOwnerGeneration,
        LastFastLowWitnessClearWitnessConsumed,
        LastFastLowWitnessClearWitnessTicks,
        LastFastLowWitnessClearWitnessProduced,
        LastFastLowWitnessClearConsumed,
        LastFastLowWitnessClearTicks,
        LastFastLowWitnessClearProduced,
        LastFastLowWitnessClearLevels,
        FramesPublishedTotal,
        ParentCapacityState,
        ParentCapacityGeneration,
        ParentCapacitySourceOwnerGeneration,
        ParentCapacityParentRatio,
        ParentCapacityStartContinuityEpoch,
        ParentCapacityStartResetEpoch,
        ParentCapacityStartConsumed,
        ParentCapacityStartTicks,
        ParentCapacityStartConsumedProduced,
        ParentCapacityStartPublishedProduced,
        ParentCapacityStartLevels,
        ParentCapacityBirthCount,
        LastParentCapacityBirthUpdateId,
        ParentCapacityFirstRiskCount,
        LastParentCapacityFirstRiskUpdateId,
        LastParentCapacityFirstRiskGeneration,
        LastParentCapacityFirstRiskLevels,
        LastParentCapacityFirstRiskCapacity,
        ParentCapacityClearCount,
        LastParentCapacityClearUpdateId,
        LastParentCapacityClearReasons,
        LastParentCapacityClearGeneration,
        LastParentCapacityClearConsumed,
        LastParentCapacityClearTicks,
        LastParentCapacityClearPublishedProduced,
        LastParentCapacityClearLevelPostWrite,
        LogicalLevelPostConsumption,
        LogicalLevelBeforeWrite,
        LogicalLevelPostWrite,
        SpillFrames,
        SpillPeakFrames,
        SpillNodeCounts,
        SpillGeneration,
        SpillBirthCount,
        LastSpillBirthUpdateId,
        LastSpillBirthContinuityEpoch,
        LastSpillBirthResetAndFrames,
        LastSpillBirthOwnerGeneration,
        SpillPublicationCount,
        SpillFramesPublishedTotal,
        SpillAllocationCount,
        SpillAllocationFailureCount,
        SpillDroppedPacketsTotal,
        SpillDroppedFramesTotal,
        SpillDroppedThisWrite,
        ProvisionalFastStateFlags,
        ProvisionalFastAnchorConsumed,
        ProvisionalFastAnchorTicks,
        ProvisionalFastAnchorProduced,
        ProvisionalFastAnchorLevelPostConsumption,
        ProvisionalFastAnchorLevelPostWrite,
        ProvisionalFastAnchorContinuityEpoch,
        ProvisionalFastAnchorResetAndHintSeenEpoch,
        ProvisionalFastAnchorCandidateGeneration,
        ProvisionalFastAnchorOwnerGeneration,
        ProvisionalCandidateStartConsumed,
        ProvisionalCandidateStartTicks,
        ProvisionalCandidateStartProduced,
        ProvisionalCandidateStartLevelPostConsumption,
        ProvisionalCandidateStartLevelPostWrite,
        ProvisionalCandidateStartContinuityEpoch,
        ProvisionalCandidateStartResetAndHintSeenEpoch,
        ProvisionalCandidateDirection,
        ProvisionalEventCount,
        LastProvisionalEventUpdateId,
        LastProvisionalEventFlagsAndFastStateBefore,
        LastProvisionalEventFastStateAfter,
        LastProvisionalEventFastAnchorConsumed,
        LastProvisionalEventFastAnchorTicks,
        LastProvisionalEventFastAnchorProduced,
        LastProvisionalEventFastAnchorLevelPostConsumption,
        LastProvisionalEventFastAnchorLevelPostWrite,
        LastProvisionalEventCandidateGeneration,
        LastProvisionalEventCandidateStartConsumed,
        LastProvisionalEventCandidateStartTicks,
        LastProvisionalEventCandidateStartProduced,
        LastProvisionalEventCandidateStartLevelPostConsumption,
        LastProvisionalEventCandidateStartLevelPostWrite,
        LastProvisionalEventCandidateDirection,
        LastProvisionalEventOwnerGeneration,
        LastProvisionalEventEndpointConsumed,
        LastProvisionalEventEndpointTicks,
        LastProvisionalEventEndpointProduced,
        LastProvisionalEventEndpointLevelPostConsumption,
        LastProvisionalEventEndpointLevelPostWrite,
        LastProvisionalEventEndpointContinuityEpoch,
        LastProvisionalEventResetAndHintSeenEpoch,
        LastProvisionalEventDecisionFlags,
        ProvisionalFastAnchorPublishedProduced,
        ProvisionalCandidateStartPublishedProduced,
        LastProvisionalEventFastAnchorPublishedProduced,
        LastProvisionalEventFastAnchorContinuityEpoch,
        LastProvisionalEventFastAnchorResetAndHintSeenEpoch,
        LastProvisionalEventFastAnchorCandidateGeneration,
        LastProvisionalEventFastAnchorOwnerGeneration,
        LastProvisionalEventCandidateStartPublishedProduced,
        LastProvisionalEventCandidateStartContinuityEpoch,
        LastProvisionalEventCandidateStartResetAndHintSeenEpoch,
        LastProvisionalEventEndpointPublishedProduced,
        LastProvisionalEventPreviousCandidateGeneration,
        LastProvisionalEventPreviousCandidateStartConsumed,
        LastProvisionalEventPreviousCandidateStartTicks,
        LastProvisionalEventPreviousCandidateStartProduced,
        LastProvisionalEventPreviousCandidateStartPublishedProduced,
        LastProvisionalEventPreviousCandidateStartLevelPostConsumption,
        LastProvisionalEventPreviousCandidateStartLevelPostWrite,
        LastProvisionalEventPreviousCandidateStartContinuityEpoch,
        LastProvisionalEventPreviousCandidateStartResetAndHintSeenEpoch,
        LastProvisionalEventPreviousCandidateDirection,
        TicksPublishedTotal,
        FastHighEscrowState,
        FastHighEscrowOwnerGeneration,
        FastHighEscrowReferenceTicks,
        FastHighEscrowReferenceConsumed,
        FastHighEscrowRate,
        FastHighEscrowStartTicks,
        FastHighEscrowStartPublishedProduced,
        FastHighEscrowStartConsumed,
        FastHighEscrowStartConsumedProduced,
        FastHighEscrowStartLevelPostConsumption,
        FastHighEscrowStartLevelPostWrite,
        FastHighEscrowStartContinuityEpoch,
        FastHighEscrowStartResetAndHintSeenEpoch,
        FastHighEscrowGrantFrames,
        FastHighEscrowSpentFrames,
        FastHighEscrowRemainingFrames,
        FastHighEscrowBirthCount,
        LastFastHighEscrowBirthUpdateId,
        LastFastHighEscrowBirthOwnerGeneration,
        LastFastHighEscrowBirthState,
        LastFastHighEscrowBirthReferenceTicks,
        LastFastHighEscrowBirthReferenceConsumed,
        LastFastHighEscrowBirthRate,
        LastFastHighEscrowBirthStartTicks,
        LastFastHighEscrowBirthStartPublishedProduced,
        LastFastHighEscrowBirthStartConsumed,
        LastFastHighEscrowBirthStartConsumedProduced,
        LastFastHighEscrowBirthStartLevelPostConsumption,
        LastFastHighEscrowBirthStartLevelPostWrite,
        LastFastHighEscrowBirthStartContinuityEpoch,
        LastFastHighEscrowBirthStartResetAndHintSeenEpoch,
        LastFastHighEscrowBirthGrantFrames,
        FastHighEscrowSpendCount,
        LastFastHighEscrowSpendUpdateId,
        LastFastHighEscrowSpentFrames,
        LastFastHighEscrowRemainingFrames,
        FastHighEscrowOverlayCount,
        LastFastHighEscrowOverlayUpdateId,
        LastFastHighEscrowOverlayRemainingFrames,
        LastFastHighEscrowOverlaySkew,
        FastHighEscrowClearCount,
        LastFastHighEscrowClearUpdateId,
        LastFastHighEscrowClearReasons,
        LastFastHighEscrowClearOwnerGeneration,
        LastFastHighEscrowClearGrantFrames,
        LastFastHighEscrowClearSpentFrames,
        FastHighEscrowGuardSkew,
        LastFastHighEscrowBirthGuardSkew,
        FastHighEscrowHorizonFrames,
        LastFastHighEscrowBirthHorizonFrames,
        FastTargetChangePhaseFrontierState,
        FastTargetChangePhaseFrontierInvalidationCount,
        LastFastTargetChangePhaseFrontierInvalidationUpdateId,
        LastFastTargetChangePhaseFrontierInvalidationReasons,
        FastTargetChangePhaseFrontierEvaluationCount,
        LastFastTargetChangePhaseFrontierEvaluationUpdateId,
        LastFastTargetChangePhaseFrontierEvaluation,
        FastTargetChangePhaseEscrowState,
        FastTargetChangePhaseEscrowGrantFrames,
        FastTargetChangePhaseEscrowGuardSkew,
        FastTargetChangePhaseEscrowOverlaySkew,
        FastTargetChangePhaseEscrowReferenceRate,
        FastTargetChangePhaseEscrowStartTicks,
        FastTargetChangePhaseEscrowStartConsumed,
        FastTargetChangePhaseEscrowStartConsumedProduced,
        FastTargetChangePhaseEscrowStartPublishedProduced,
        FastTargetChangePhaseEscrowStartLevelPostConsumption,
        FastTargetChangePhaseEscrowStartLevelPostWrite,
        FastTargetChangePhaseEscrowStartContinuityEpoch,
        FastTargetChangePhaseEscrowStartResetAndHintSeenEpoch,
        FastTargetChangePhaseEscrowStartCandidateGeneration,
        FastTargetChangePhaseEscrowElapsedPublishedTicks,
        FastTargetChangePhaseEscrowCurrentPhysicalPrefix,
        FastTargetChangePhaseEscrowBirthCount,
        LastFastTargetChangePhaseEscrowBirthUpdateId,
        LastFastTargetChangePhaseEscrowBirthGrantFrames,
        LastFastTargetChangePhaseEscrowBirthGuardSkew,
        FastTargetChangePhaseEscrowClearCount,
        LastFastTargetChangePhaseEscrowClearUpdateId,
        LastFastTargetChangePhaseEscrowClearReasons,
        LastFastTargetChangePhaseEscrowClearGrantFrames,
        LastFastTargetChangePhaseEscrowClearOverlaySkew,
        SustainedProvisionalPhaseState,
        SustainedProvisionalPhaseCandidateGeneration,
        SustainedProvisionalPhaseOwnerGeneration,
        SustainedProvisionalPhaseParentRatio,
        SustainedProvisionalPhaseSkew,
        SustainedProvisionalPhaseFrontierFrames,
        SustainedProvisionalPhaseBackingFrames,
        SustainedProvisionalPhasePublicationReserveFrames,
        SustainedProvisionalPhaseBirthCount,
        LastSustainedProvisionalPhaseBirthUpdateId,
        LastSustainedProvisionalPhaseBirthCandidateGeneration,
        LastSustainedProvisionalPhaseBirthParentRatio,
        LastSustainedProvisionalPhaseBirthSkew,
        LastSustainedProvisionalPhaseBirthFrontierFrames,
        LastSustainedProvisionalPhaseBirthBackingFrames,
        LastSustainedProvisionalPhaseBirthPublicationReserveFrames,
        LastSustainedProvisionalPhaseBirthReservedPublicationCount,
        SustainedProvisionalPhaseStepCount,
        LastSustainedProvisionalPhaseStepUpdateId,
        LastSustainedProvisionalPhaseStepCandidateGeneration,
        LastSustainedProvisionalPhaseStepPreviousSkew,
        LastSustainedProvisionalPhaseStepSkew,
        LastSustainedProvisionalPhaseStepFrontierFrames,
        LastSustainedProvisionalPhaseStepBackingFrames,
        LastSustainedProvisionalPhaseStepPublicationReserveFrames,
        LastSustainedProvisionalPhaseStepReservedPublicationCount,
        SustainedProvisionalPhaseClearCount,
        LastSustainedProvisionalPhaseClearUpdateId,
        LastSustainedProvisionalPhaseClearReasons,
        LastSustainedProvisionalPhaseClearCandidateGeneration,
        LastSustainedProvisionalPhaseClearSkew,
        LastSustainedProvisionalPhaseClearReservedPublicationCount,
        SustainedProvisionalPhaseApplicationConflictCount,
        LastSustainedProvisionalPhaseApplicationConflictUpdateId,
        WordCount,
    };

    static_assert(std::atomic<std::uint64_t>::is_always_lock_free,
                  "adaptive telemetry words must be lock-free");
    static_assert(sizeof(double) == sizeof(std::uint64_t),
                  "adaptive telemetry requires 64-bit IEEE storage");

    static std::uint64_t Pack32(std::uint32_t low,
                                std::uint32_t high) noexcept
    {
        return static_cast<std::uint64_t>(low)
             | (static_cast<std::uint64_t>(high) << 32);
    }

    static std::uint32_t Low32(std::uint64_t value) noexcept
    {
        return static_cast<std::uint32_t>(value);
    }

    static std::uint32_t High32(std::uint64_t value) noexcept
    {
        return static_cast<std::uint32_t>(value >> 32);
    }

    static std::uint64_t DoubleToBits(double value) noexcept
    {
        std::uint64_t bits;
        std::memcpy(&bits, &value, sizeof(bits));
        return bits;
    }

    static double BitsToDouble(std::uint64_t bits) noexcept
    {
        double value;
        std::memcpy(&value, &bits, sizeof(value));
        return value;
    }

    static std::int32_t BitsToInt32(std::uint32_t bits) noexcept
    {
        std::int32_t value;
        std::memcpy(&value, &bits, sizeof(value));
        return value;
    }

    void Store(Word word, std::uint64_t value) noexcept
    {
        Words[word].store(value, std::memory_order_relaxed);
    }

    static AudioOutputAdaptiveTelemetrySnapshot Decode(
        const std::array<std::uint64_t, WordCount>& values,
        std::uint64_t publicationId) noexcept
    {
        AudioOutputAdaptiveTelemetrySnapshot snapshot;
        snapshot.valid = true;
        snapshot.publicationId = publicationId;
        snapshot.updateId = values[UpdateId];
        snapshot.hostConsumed = values[HostConsumed];
        snapshot.ticksAtConsumption = values[TicksAtConsumption];
        snapshot.estimatorDeltaConsumed = values[EstimatorDeltaConsumed];
        snapshot.estimatorDeltaTicks = values[EstimatorDeltaTicks];
        snapshot.estimatorRawRatio = BitsToDouble(values[EstimatorRawRatio]);
        snapshot.primingFrames = values[PrimingFrames];
        snapshot.controllerRatio = BitsToDouble(values[ControllerRatio]);
        snapshot.desiredSkew = BitsToDouble(values[DesiredSkew]);
        snapshot.appliedSkew = BitsToDouble(values[AppliedSkew]);
        snapshot.speedHint = BitsToDouble(values[SpeedHint]);
        snapshot.levelPostConsumption = Low32(values[LevelsBeforeWrite]);
        snapshot.levelBeforeWrite = High32(values[LevelsBeforeWrite]);
        snapshot.levelPostWrite = Low32(values[LevelAfterWriteAndProduced]);
        snapshot.framesProduced = High32(values[LevelAfterWriteAndProduced]);
        snapshot.underruns = Low32(values[TransportCounters]);
        snapshot.droppedBlocks = High32(values[TransportCounters]);
        snapshot.dropsThisWrite = Low32(values[WriteDropsAndCapacity]);
        snapshot.outputBufferSize = High32(values[WriteDropsAndCapacity]);
        snapshot.resetRequestedEpoch =
            Low32(values[ResetRequestedAndConfirmed]);
        snapshot.resetConfirmedEpoch =
            High32(values[ResetRequestedAndConfirmed]);
        snapshot.resetSeenEpoch = Low32(values[ResetSeenAndHintEpoch]);
        snapshot.hintEpoch = High32(values[ResetSeenAndHintEpoch]);
        snapshot.hintSeenEpoch = Low32(values[HintSeenAndDecisionFlags]);
        snapshot.decisionFlags = High32(values[HintSeenAndDecisionFlags]);
        snapshot.lastFastAcceptedUpdateId =
            values[LastFastAcceptedUpdateId];
        snapshot.lastFastAcceptedRawRatio =
            BitsToDouble(values[LastFastAcceptedRawRatio]);
        snapshot.lastFastAcceptedEffectiveRatio =
            BitsToDouble(values[LastFastAcceptedEffectiveRatio]);
        snapshot.lastFastAcceptedLevelPostConsumption =
            Low32(values[LastFastLevelsBeforeWrite]);
        snapshot.lastFastAcceptedLevelBeforeWrite =
            High32(values[LastFastLevelsBeforeWrite]);
        snapshot.lastFastAcceptedLevelPostWrite =
            Low32(values[LastFastLevelAfterWriteAndFlags]);
        snapshot.lastFastAcceptedFlags =
            High32(values[LastFastLevelAfterWriteAndFlags]);
        snapshot.fastAcceptedCount = values[FastAcceptedCount];
        snapshot.lastSlowAppliedUpdateId = values[LastSlowAppliedUpdateId];
        snapshot.lastSlowAppliedRawRatio =
            BitsToDouble(values[LastSlowAppliedRawRatio]);
        snapshot.lastSlowAppliedEffectiveRatio =
            BitsToDouble(values[LastSlowAppliedEffectiveRatio]);
        snapshot.slowAppliedCount = values[SlowAppliedCount];
        snapshot.lastDropUpdateId = values[LastDropUpdateId];
        snapshot.lastDropLevelBeforeWrite = Low32(values[LastDropLevels]);
        snapshot.lastDropLevelPostWrite = High32(values[LastDropLevels]);
        snapshot.lastDropFramesProduced =
            Low32(values[LastDropProducedAndCount]);
        snapshot.lastDropDropsThisWrite =
            High32(values[LastDropProducedAndCount]);
        const std::uint32_t rollbackState =
            Low32(values[RollbackStateAndTarget]);
        snapshot.rollbackPending = (rollbackState & 1u) != 0;
        snapshot.rollbackVerifying = (rollbackState & 2u) != 0;
        snapshot.rollbackTargetFrames =
            High32(values[RollbackStateAndTarget]);
        snapshot.rollbackParentRatio =
            BitsToDouble(values[RollbackParentRatio]);
        snapshot.rollbackCount = values[RollbackCount];
        snapshot.lastRollbackUpdateId = values[LastRollbackUpdateId];
        snapshot.lastRollbackParentRatio =
            BitsToDouble(values[LastRollbackParentRatio]);
        snapshot.lastRollbackTargetFrames =
            Low32(values[LastRollbackTargetFrames]);
        snapshot.lastRollbackDeltaConsumed =
            values[LastRollbackDeltaConsumed];
        snapshot.lastRollbackDeltaTicks = values[LastRollbackDeltaTicks];
        snapshot.actuatorActive =
            (Low32(values[ActuatorStateAndBacking]) & 1u) != 0;
        snapshot.lastActuatorBackingFrames =
            High32(values[ActuatorStateAndBacking]);
        snapshot.actuatorTransitionCount = values[ActuatorTransitionCount];
        snapshot.lastActuatorTransitionUpdateId =
            values[LastActuatorTransitionUpdateId];
        snapshot.lastActuatorStartSkew =
            BitsToDouble(values[LastActuatorStartSkew]);
        snapshot.lastActuatorTargetRatio =
            BitsToDouble(values[LastActuatorTargetRatio]);
        snapshot.lastActuatorFirstAppliedSkew =
            BitsToDouble(values[LastActuatorFirstAppliedSkew]);
        snapshot.lastActuatorFirstControlFrames =
            BitsToDouble(values[LastActuatorFirstControlFrames]);
        snapshot.lastActuatorDeltaConsumed =
            values[LastActuatorDeltaConsumed];
        snapshot.lastActuatorDeltaTicks = values[LastActuatorDeltaTicks];
        snapshot.lastActuatorLevelPostWrite =
            Low32(values[LastActuatorLevelPostWriteAndStepCount]);
        snapshot.lastActuatorStepCount =
            High32(values[LastActuatorLevelPostWriteAndStepCount]);
        snapshot.lastActuatorMaxStepRatio =
            BitsToDouble(values[LastActuatorMaxStepRatio]);
        snapshot.lastActuatorMonotonicViolationCount =
            values[LastActuatorMonotonicViolationCount];
        snapshot.lastActuatorConvergedUpdateId =
            values[LastActuatorConvergedUpdateId];
        const std::uint32_t hintParentState =
            Low32(values[HintParentState]);
        snapshot.hintParentCertified = (hintParentState & 1u) != 0;
        snapshot.rollbackParentIsHint = (hintParentState & 2u) != 0;
        snapshot.lastRollbackParentWasHint = (hintParentState & 4u) != 0;
        snapshot.hintParentCertificationCount =
            values[HintParentCertificationCount];
        snapshot.lastHintParentCertificationUpdateId =
            values[LastHintParentCertificationUpdateId];
        snapshot.lastHintParentCertificationRatio =
            BitsToDouble(values[LastHintParentCertificationRatio]);
        snapshot.lastHintParentCertificationDeltaConsumed =
            values[LastHintParentCertificationDeltaConsumed];
        snapshot.lastHintParentCertificationDeltaTicks =
            values[LastHintParentCertificationDeltaTicks];
        snapshot.dominatedAscendingEndpointCount =
            values[DominatedAscendingEndpointCount];
        snapshot.lastDominatedAscendingEndpointUpdateId =
            values[LastDominatedAscendingEndpointUpdateId];
        snapshot.lastDominatedAscendingEndpointTransitionUpdateId =
            values[LastDominatedAscendingEndpointTransitionUpdateId];
        snapshot.lastDominatedAscendingEndpointStartSkew = BitsToDouble(
            values[LastDominatedAscendingEndpointStartSkew]);
        snapshot.lastDominatedAscendingEndpointTargetRatio = BitsToDouble(
            values[LastDominatedAscendingEndpointTargetRatio]);
        snapshot.lastDominatedAscendingEndpointAppliedSkew = BitsToDouble(
            values[LastDominatedAscendingEndpointAppliedSkew]);
        snapshot.lastDominatedAscendingEndpointDeltaConsumed =
            values[LastDominatedAscendingEndpointDeltaConsumed];
        snapshot.lastDominatedAscendingEndpointDeltaTicks =
            values[LastDominatedAscendingEndpointDeltaTicks];
        snapshot.lastDominatedAscendingEndpointBackingFrames = Low32(
            values[LastDominatedAscendingEndpointBackingAndLevel]);
        snapshot.lastDominatedAscendingEndpointLevelPostWrite = High32(
            values[LastDominatedAscendingEndpointBackingAndLevel]);
        snapshot.lastDominatedAscendingEndpointOutputBufferSize = Low32(
            values[LastDominatedAscendingEndpointOutputBufferSize]);
        snapshot.lastDominatedAscendingEndpointOutputSampleRate = BitsToDouble(
            values[LastDominatedAscendingEndpointOutputSampleRate]);
        snapshot.fastAnchorRebaseCount = values[FastAnchorRebaseCount];
        snapshot.lastFastAnchorRebaseUpdateId =
            values[LastFastAnchorRebaseUpdateId];
        snapshot.lastFastAnchorRebaseDeltaConsumed =
            values[LastFastAnchorRebaseDeltaConsumed];
        snapshot.lastFastAnchorRebaseDeltaTicks =
            values[LastFastAnchorRebaseDeltaTicks];
        snapshot.lastFastAnchorRebaseRawRatio =
            BitsToDouble(values[LastFastAnchorRebaseRawRatio]);
        snapshot.lastFastAnchorRebaseRatioBeforeEstimators = BitsToDouble(
            values[LastFastAnchorRebaseRatioBeforeEstimators]);
        snapshot.lastFastAnchorRebaseRatioAfter =
            BitsToDouble(values[LastFastAnchorRebaseRatioAfter]);
        snapshot.lastFastAnchorRebaseLevelPostConsumption = Low32(
            values[LastFastAnchorRebaseLevels]);
        snapshot.lastFastAnchorRebaseLevelPostWrite = High32(
            values[LastFastAnchorRebaseLevels]);
        snapshot.lastFastAnchorRebaseRecoveryAscendingFrames = Low32(
            values[LastFastAnchorRebaseRecoveryAndDecisionFlags]);
        snapshot.lastFastAnchorRebaseDecisionFlags = High32(
            values[LastFastAnchorRebaseRecoveryAndDecisionFlags]);
        const std::uint32_t fastAnchorRebaseState =
            Low32(values[LastFastAnchorRebaseState]);
        snapshot.lastFastAnchorRebaseTargetRateOwned =
            (fastAnchorRebaseState & 1u) != 0;
        snapshot.lastFastAnchorRebaseEstimatorEvaluated =
            (fastAnchorRebaseState & 2u) != 0;
        snapshot.rateRecoveryRebaseCount = values[RateRecoveryRebaseCount];
        snapshot.lastRateRecoveryRebaseUpdateId =
            values[LastRateRecoveryRebaseUpdateId];
        snapshot.lastRateRecoveryRebaseDeltaConsumed =
            values[LastRateRecoveryRebaseDeltaConsumed];
        snapshot.lastRateRecoveryRebaseDeltaTicks =
            values[LastRateRecoveryRebaseDeltaTicks];
        snapshot.lastRateRecoveryRebaseLevelPostConsumption = Low32(
            values[LastRateRecoveryRebaseLevels]);
        snapshot.lastRateRecoveryRebaseLevelPostWrite = High32(
            values[LastRateRecoveryRebaseLevels]);
        snapshot.lastRateRecoveryRebaseTargetRatio = BitsToDouble(
            values[LastRateRecoveryRebaseTargetRatio]);
        snapshot.lastRateRecoveryRebaseBoundaryFrames = Low32(
            values[LastRateRecoveryRebaseBoundaryAndState]);
        const std::uint32_t rateRecoveryRebaseState = High32(
            values[LastRateRecoveryRebaseBoundaryAndState]);
        snapshot.lastRateRecoveryRebaseFastLowPending =
            (rateRecoveryRebaseState & 1u) != 0;
        snapshot.lastRateRecoveryRebaseFastTargetChangePending =
            (rateRecoveryRebaseState & 2u) != 0;
        snapshot.framesAtConsumption = values[FramesAtConsumption];
        snapshot.sustainedCandidateGeneration =
            values[SustainedCandidateGeneration];
        snapshot.sustainedOwnerGeneration =
            values[SustainedOwnerGeneration];
        snapshot.sustainedOwnerCandidateGeneration =
            values[SustainedOwnerCandidateGeneration];
        const std::uint32_t sustainedState = Low32(values[SustainedState]);
        snapshot.sustainedCandidateActive = (sustainedState & 1u) != 0;
        snapshot.sustainedOwnerActive = (sustainedState & 2u) != 0;
        snapshot.sustainedOwnerRatio =
            BitsToDouble(values[SustainedOwnerRatio]);
        snapshot.sustainedObservationCount =
            values[SustainedObservationCount];
        snapshot.lastSustainedObservationUpdateId =
            values[LastSustainedObservationUpdateId];
        snapshot.lastSustainedObservationCandidateGeneration =
            values[LastSustainedObservationCandidateGeneration];
        snapshot.lastSustainedObservationEndConsumed =
            values[LastSustainedObservationEndConsumed];
        snapshot.lastSustainedObservationEndTicks =
            values[LastSustainedObservationEndTicks];
        snapshot.lastSustainedObservationEndProduced =
            values[LastSustainedObservationEndProduced];
        snapshot.lastSustainedObservationDeltaConsumed =
            values[LastSustainedObservationDeltaConsumed];
        snapshot.lastSustainedObservationDeltaTicks =
            values[LastSustainedObservationDeltaTicks];
        snapshot.lastSustainedObservationDeltaProduced =
            values[LastSustainedObservationDeltaProduced];
        snapshot.lastSustainedObservationRawRatio = BitsToDouble(
            values[LastSustainedObservationRawRatio]);
        snapshot.lastSustainedObservationStartLevel = Low32(
            values[LastSustainedObservationLevels]);
        snapshot.lastSustainedObservationEndLevel = High32(
            values[LastSustainedObservationLevels]);
        snapshot.lastSustainedObservationMinLevel = Low32(
            values[LastSustainedObservationRange]);
        snapshot.lastSustainedObservationMaxLevel = High32(
            values[LastSustainedObservationRange]);
        snapshot.sustainedStateFlags = Low32(
            values[SustainedStateFlagsAndObservationType]);
        snapshot.lastSustainedObservationType = High32(
            values[SustainedStateFlagsAndObservationType]);
        snapshot.sustainedEpisodeOriginUpdateId =
            values[SustainedEpisodeOriginUpdateId];
        snapshot.sustainedParentRatio =
            BitsToDouble(values[SustainedParentRatio]);
        snapshot.sustainedParentDeltaConsumed =
            values[SustainedParentDeltaConsumed];
        snapshot.sustainedParentDeltaTicks =
            values[SustainedParentDeltaTicks];
        snapshot.sustainedRecoveryBoundaryFrames = Low32(
            values[SustainedRecoveryAndEffectivePhase]);
        snapshot.effectivePhaseTargetFrames = High32(
            values[SustainedRecoveryAndEffectivePhase]);
        snapshot.sustainedTransitionCount =
            values[SustainedTransitionCount];
        snapshot.lastSustainedTransitionUpdateId =
            values[LastSustainedTransitionUpdateId];
        snapshot.lastSustainedTransitionKind = Low32(
            values[LastSustainedTransitionKind]);
        snapshot.lastSustainedTransitionOwnerGeneration =
            values[LastSustainedTransitionOwnerGeneration];
        snapshot.fastLowWitnessOwnerGeneration =
            values[FastLowWitnessOwnerGeneration];
        snapshot.fastLowWitnessEndConsumed =
            values[FastLowWitnessEndConsumed];
        snapshot.fastLowWitnessEndTicks = values[FastLowWitnessEndTicks];
        snapshot.fastLowWitnessEndProduced =
            values[FastLowWitnessEndProduced];
        snapshot.fastLowWitnessEndLevel =
            Low32(values[FastLowWitnessEndLevel]);
        snapshot.fastLowWitnessBirthCount =
            values[FastLowWitnessBirthCount];
        snapshot.lastFastLowWitnessBirthUpdateId =
            values[LastFastLowWitnessBirthUpdateId];
        snapshot.lastFastLowWitnessBirthKind = Low32(
            values[LastFastLowWitnessBirthKindAndLevel]);
        snapshot.lastFastLowWitnessBirthLevel = High32(
            values[LastFastLowWitnessBirthKindAndLevel]);
        snapshot.lastFastLowWitnessBirthOwnerGeneration =
            values[LastFastLowWitnessBirthOwnerGeneration];
        snapshot.lastFastLowWitnessBirthConsumed =
            values[LastFastLowWitnessBirthConsumed];
        snapshot.lastFastLowWitnessBirthTicks =
            values[LastFastLowWitnessBirthTicks];
        snapshot.lastFastLowWitnessBirthProduced =
            values[LastFastLowWitnessBirthProduced];
        snapshot.lastFastLowWitnessBirthLevelPostWrite = Low32(
            values[LastFastLowWitnessBirthLevelPostWrite]);
        snapshot.fastLowWitnessClearCount =
            values[FastLowWitnessClearCount];
        snapshot.lastFastLowWitnessClearUpdateId =
            values[LastFastLowWitnessClearUpdateId];
        snapshot.lastFastLowWitnessClearReasons = Low32(
            values[LastFastLowWitnessClearReasonsAndWitnessLevel]);
        snapshot.lastFastLowWitnessClearWitnessLevel = High32(
            values[LastFastLowWitnessClearReasonsAndWitnessLevel]);
        snapshot.lastFastLowWitnessClearOwnerGeneration =
            values[LastFastLowWitnessClearOwnerGeneration];
        snapshot.lastFastLowWitnessClearWitnessConsumed =
            values[LastFastLowWitnessClearWitnessConsumed];
        snapshot.lastFastLowWitnessClearWitnessTicks =
            values[LastFastLowWitnessClearWitnessTicks];
        snapshot.lastFastLowWitnessClearWitnessProduced =
            values[LastFastLowWitnessClearWitnessProduced];
        snapshot.lastFastLowWitnessClearConsumed =
            values[LastFastLowWitnessClearConsumed];
        snapshot.lastFastLowWitnessClearTicks =
            values[LastFastLowWitnessClearTicks];
        snapshot.lastFastLowWitnessClearProduced =
            values[LastFastLowWitnessClearProduced];
        snapshot.lastFastLowWitnessClearLevel = Low32(
            values[LastFastLowWitnessClearLevels]);
        snapshot.lastFastLowWitnessClearLevelPostWrite = High32(
            values[LastFastLowWitnessClearLevels]);
        snapshot.framesPublishedTotal = values[FramesPublishedTotal];
        snapshot.parentCapacityActive =
            (Low32(values[ParentCapacityState]) & 1u) != 0;
        snapshot.parentCapacityCapacity = High32(
            values[ParentCapacityState]);
        snapshot.parentCapacityGeneration =
            values[ParentCapacityGeneration];
        snapshot.parentCapacitySourceOwnerGeneration =
            values[ParentCapacitySourceOwnerGeneration];
        snapshot.parentCapacityParentRatio =
            BitsToDouble(values[ParentCapacityParentRatio]);
        snapshot.parentCapacityStartContinuityEpoch =
            values[ParentCapacityStartContinuityEpoch];
        snapshot.parentCapacityStartResetEpoch = Low32(
            values[ParentCapacityStartResetEpoch]);
        snapshot.parentCapacityStartHintSeenEpoch = High32(
            values[ParentCapacityStartResetEpoch]);
        snapshot.parentCapacityStartConsumed =
            values[ParentCapacityStartConsumed];
        snapshot.parentCapacityStartTicks =
            values[ParentCapacityStartTicks];
        snapshot.parentCapacityStartConsumedProduced =
            values[ParentCapacityStartConsumedProduced];
        snapshot.parentCapacityStartPublishedProduced =
            values[ParentCapacityStartPublishedProduced];
        snapshot.parentCapacityStartLevelPostConsumption = Low32(
            values[ParentCapacityStartLevels]);
        snapshot.parentCapacityStartLevelPostWrite = High32(
            values[ParentCapacityStartLevels]);
        snapshot.parentCapacityBirthCount =
            values[ParentCapacityBirthCount];
        snapshot.lastParentCapacityBirthUpdateId =
            values[LastParentCapacityBirthUpdateId];
        snapshot.parentCapacityFirstRiskCount =
            values[ParentCapacityFirstRiskCount];
        snapshot.lastParentCapacityFirstRiskUpdateId =
            values[LastParentCapacityFirstRiskUpdateId];
        snapshot.lastParentCapacityFirstRiskGeneration =
            values[LastParentCapacityFirstRiskGeneration];
        snapshot.lastParentCapacityFirstRiskLevelBeforeWrite = Low32(
            values[LastParentCapacityFirstRiskLevels]);
        snapshot.lastParentCapacityFirstRiskFramesProduced = High32(
            values[LastParentCapacityFirstRiskLevels]);
        snapshot.lastParentCapacityFirstRiskCapacity = Low32(
            values[LastParentCapacityFirstRiskCapacity]);
        snapshot.parentCapacityClearCount =
            values[ParentCapacityClearCount];
        snapshot.lastParentCapacityClearUpdateId =
            values[LastParentCapacityClearUpdateId];
        snapshot.lastParentCapacityClearReasons = Low32(
            values[LastParentCapacityClearReasons]);
        snapshot.lastParentCapacityClearGeneration =
            values[LastParentCapacityClearGeneration];
        snapshot.lastParentCapacityClearConsumed =
            values[LastParentCapacityClearConsumed];
        snapshot.lastParentCapacityClearTicks =
            values[LastParentCapacityClearTicks];
        snapshot.lastParentCapacityClearPublishedProduced =
            values[LastParentCapacityClearPublishedProduced];
        snapshot.lastParentCapacityClearLevelPostWrite = Low32(
            values[LastParentCapacityClearLevelPostWrite]);
        snapshot.logicalLevelPostConsumption =
            values[LogicalLevelPostConsumption];
        snapshot.logicalLevelBeforeWrite =
            values[LogicalLevelBeforeWrite];
        snapshot.logicalLevelPostWrite =
            values[LogicalLevelPostWrite];
        snapshot.spillFrames = values[SpillFrames];
        snapshot.spillPeakFrames = values[SpillPeakFrames];
        snapshot.spillActiveNodes = Low32(values[SpillNodeCounts]);
        snapshot.spillFreeNodes = High32(values[SpillNodeCounts]);
        snapshot.spillGeneration = values[SpillGeneration];
        snapshot.spillBirthCount = values[SpillBirthCount];
        snapshot.lastSpillBirthUpdateId = values[LastSpillBirthUpdateId];
        snapshot.lastSpillBirthContinuityEpoch =
            values[LastSpillBirthContinuityEpoch];
        snapshot.lastSpillBirthResetEpoch = Low32(
            values[LastSpillBirthResetAndFrames]);
        snapshot.lastSpillBirthFrames = High32(
            values[LastSpillBirthResetAndFrames]);
        snapshot.lastSpillBirthOwnerGeneration =
            values[LastSpillBirthOwnerGeneration];
        snapshot.spillPublicationCount = values[SpillPublicationCount];
        snapshot.spillFramesPublishedTotal =
            values[SpillFramesPublishedTotal];
        snapshot.spillAllocationCount = values[SpillAllocationCount];
        snapshot.spillAllocationFailureCount =
            values[SpillAllocationFailureCount];
        snapshot.spillDroppedPacketsTotal =
            values[SpillDroppedPacketsTotal];
        snapshot.spillDroppedFramesTotal =
            values[SpillDroppedFramesTotal];
        snapshot.spillDroppedPacketsThisWrite = Low32(
            values[SpillDroppedThisWrite]);
        snapshot.spillDroppedFramesThisWrite = High32(
            values[SpillDroppedThisWrite]);
        snapshot.provisionalFastStateFlags = Low32(
            values[ProvisionalFastStateFlags]);
        snapshot.provisionalFastAnchorConsumed =
            values[ProvisionalFastAnchorConsumed];
        snapshot.provisionalFastAnchorTicks =
            values[ProvisionalFastAnchorTicks];
        snapshot.provisionalFastAnchorProduced =
            values[ProvisionalFastAnchorProduced];
        snapshot.provisionalFastAnchorLevelPostConsumption =
            values[ProvisionalFastAnchorLevelPostConsumption];
        snapshot.provisionalFastAnchorLevelPostWrite =
            values[ProvisionalFastAnchorLevelPostWrite];
        snapshot.provisionalFastAnchorContinuityEpoch =
            values[ProvisionalFastAnchorContinuityEpoch];
        snapshot.provisionalFastAnchorResetEpoch = Low32(
            values[ProvisionalFastAnchorResetAndHintSeenEpoch]);
        snapshot.provisionalFastAnchorHintSeenEpoch = High32(
            values[ProvisionalFastAnchorResetAndHintSeenEpoch]);
        snapshot.provisionalFastAnchorCandidateGeneration =
            values[ProvisionalFastAnchorCandidateGeneration];
        snapshot.provisionalFastAnchorOwnerGeneration =
            values[ProvisionalFastAnchorOwnerGeneration];
        snapshot.provisionalCandidateStartConsumed =
            values[ProvisionalCandidateStartConsumed];
        snapshot.provisionalCandidateStartTicks =
            values[ProvisionalCandidateStartTicks];
        snapshot.provisionalCandidateStartProduced =
            values[ProvisionalCandidateStartProduced];
        snapshot.provisionalCandidateStartLevelPostConsumption =
            values[ProvisionalCandidateStartLevelPostConsumption];
        snapshot.provisionalCandidateStartLevelPostWrite =
            values[ProvisionalCandidateStartLevelPostWrite];
        snapshot.provisionalCandidateStartContinuityEpoch =
            values[ProvisionalCandidateStartContinuityEpoch];
        snapshot.provisionalCandidateStartResetEpoch = Low32(
            values[ProvisionalCandidateStartResetAndHintSeenEpoch]);
        snapshot.provisionalCandidateStartHintSeenEpoch = High32(
            values[ProvisionalCandidateStartResetAndHintSeenEpoch]);
        snapshot.provisionalCandidateDirection = BitsToInt32(
            Low32(values[ProvisionalCandidateDirection]));
        snapshot.provisionalEventCount = values[ProvisionalEventCount];
        snapshot.lastProvisionalEventUpdateId =
            values[LastProvisionalEventUpdateId];
        snapshot.lastProvisionalEventFlags = Low32(
            values[LastProvisionalEventFlagsAndFastStateBefore]);
        snapshot.lastProvisionalEventFastStateBefore = High32(
            values[LastProvisionalEventFlagsAndFastStateBefore]);
        snapshot.lastProvisionalEventFastStateAfter = Low32(
            values[LastProvisionalEventFastStateAfter]);
        snapshot.lastProvisionalEventFastAnchorConsumed =
            values[LastProvisionalEventFastAnchorConsumed];
        snapshot.lastProvisionalEventFastAnchorTicks =
            values[LastProvisionalEventFastAnchorTicks];
        snapshot.lastProvisionalEventFastAnchorProduced =
            values[LastProvisionalEventFastAnchorProduced];
        snapshot.lastProvisionalEventFastAnchorLevelPostConsumption =
            values[LastProvisionalEventFastAnchorLevelPostConsumption];
        snapshot.lastProvisionalEventFastAnchorLevelPostWrite =
            values[LastProvisionalEventFastAnchorLevelPostWrite];
        snapshot.lastProvisionalEventCandidateGeneration =
            values[LastProvisionalEventCandidateGeneration];
        snapshot.lastProvisionalEventCandidateStartConsumed =
            values[LastProvisionalEventCandidateStartConsumed];
        snapshot.lastProvisionalEventCandidateStartTicks =
            values[LastProvisionalEventCandidateStartTicks];
        snapshot.lastProvisionalEventCandidateStartProduced =
            values[LastProvisionalEventCandidateStartProduced];
        snapshot.lastProvisionalEventCandidateStartLevelPostConsumption =
            values[LastProvisionalEventCandidateStartLevelPostConsumption];
        snapshot.lastProvisionalEventCandidateStartLevelPostWrite =
            values[LastProvisionalEventCandidateStartLevelPostWrite];
        snapshot.lastProvisionalEventCandidateDirection = BitsToInt32(
            Low32(values[LastProvisionalEventCandidateDirection]));
        snapshot.lastProvisionalEventOwnerGeneration =
            values[LastProvisionalEventOwnerGeneration];
        snapshot.lastProvisionalEventEndpointConsumed =
            values[LastProvisionalEventEndpointConsumed];
        snapshot.lastProvisionalEventEndpointTicks =
            values[LastProvisionalEventEndpointTicks];
        snapshot.lastProvisionalEventEndpointProduced =
            values[LastProvisionalEventEndpointProduced];
        snapshot.lastProvisionalEventEndpointLevelPostConsumption =
            values[LastProvisionalEventEndpointLevelPostConsumption];
        snapshot.lastProvisionalEventEndpointLevelPostWrite =
            values[LastProvisionalEventEndpointLevelPostWrite];
        snapshot.lastProvisionalEventEndpointContinuityEpoch =
            values[LastProvisionalEventEndpointContinuityEpoch];
        snapshot.lastProvisionalEventResetEpoch = Low32(
            values[LastProvisionalEventResetAndHintSeenEpoch]);
        snapshot.lastProvisionalEventHintSeenEpoch = High32(
            values[LastProvisionalEventResetAndHintSeenEpoch]);
        snapshot.lastProvisionalEventDecisionFlags = Low32(
            values[LastProvisionalEventDecisionFlags]);
        snapshot.provisionalFastAnchorPublishedProduced =
            values[ProvisionalFastAnchorPublishedProduced];
        snapshot.provisionalCandidateStartPublishedProduced =
            values[ProvisionalCandidateStartPublishedProduced];
        snapshot.lastProvisionalEventFastAnchorPublishedProduced =
            values[LastProvisionalEventFastAnchorPublishedProduced];
        snapshot.lastProvisionalEventFastAnchorContinuityEpoch =
            values[LastProvisionalEventFastAnchorContinuityEpoch];
        snapshot.lastProvisionalEventFastAnchorResetEpoch = Low32(
            values[LastProvisionalEventFastAnchorResetAndHintSeenEpoch]);
        snapshot.lastProvisionalEventFastAnchorHintSeenEpoch = High32(
            values[LastProvisionalEventFastAnchorResetAndHintSeenEpoch]);
        snapshot.lastProvisionalEventFastAnchorCandidateGeneration =
            values[LastProvisionalEventFastAnchorCandidateGeneration];
        snapshot.lastProvisionalEventFastAnchorOwnerGeneration =
            values[LastProvisionalEventFastAnchorOwnerGeneration];
        snapshot.lastProvisionalEventCandidateStartPublishedProduced =
            values[LastProvisionalEventCandidateStartPublishedProduced];
        snapshot.lastProvisionalEventCandidateStartContinuityEpoch =
            values[LastProvisionalEventCandidateStartContinuityEpoch];
        snapshot.lastProvisionalEventCandidateStartResetEpoch = Low32(
            values[LastProvisionalEventCandidateStartResetAndHintSeenEpoch]);
        snapshot.lastProvisionalEventCandidateStartHintSeenEpoch = High32(
            values[LastProvisionalEventCandidateStartResetAndHintSeenEpoch]);
        snapshot.lastProvisionalEventEndpointPublishedProduced =
            values[LastProvisionalEventEndpointPublishedProduced];
        snapshot.lastProvisionalEventPreviousCandidateGeneration =
            values[LastProvisionalEventPreviousCandidateGeneration];
        snapshot.lastProvisionalEventPreviousCandidateStartConsumed =
            values[LastProvisionalEventPreviousCandidateStartConsumed];
        snapshot.lastProvisionalEventPreviousCandidateStartTicks =
            values[LastProvisionalEventPreviousCandidateStartTicks];
        snapshot.lastProvisionalEventPreviousCandidateStartProduced =
            values[LastProvisionalEventPreviousCandidateStartProduced];
        snapshot.lastProvisionalEventPreviousCandidateStartPublishedProduced =
            values[LastProvisionalEventPreviousCandidateStartPublishedProduced];
        snapshot.lastProvisionalEventPreviousCandidateStartLevelPostConsumption =
            values[LastProvisionalEventPreviousCandidateStartLevelPostConsumption];
        snapshot.lastProvisionalEventPreviousCandidateStartLevelPostWrite =
            values[LastProvisionalEventPreviousCandidateStartLevelPostWrite];
        snapshot.lastProvisionalEventPreviousCandidateStartContinuityEpoch =
            values[LastProvisionalEventPreviousCandidateStartContinuityEpoch];
        snapshot.lastProvisionalEventPreviousCandidateStartResetEpoch = Low32(
            values[
                LastProvisionalEventPreviousCandidateStartResetAndHintSeenEpoch]);
        snapshot.lastProvisionalEventPreviousCandidateStartHintSeenEpoch = High32(
            values[
                LastProvisionalEventPreviousCandidateStartResetAndHintSeenEpoch]);
        snapshot.lastProvisionalEventPreviousCandidateDirection = BitsToInt32(
            Low32(values[LastProvisionalEventPreviousCandidateDirection]));
        snapshot.ticksPublishedTotal = values[TicksPublishedTotal];
        const std::uint32_t fastHighEscrowState =
            Low32(values[FastHighEscrowState]);
        snapshot.fastHighEscrowInitialized = (fastHighEscrowState & 1u) != 0;
        snapshot.fastHighEscrowActive = (fastHighEscrowState & 2u) != 0;
        snapshot.fastHighEscrowReferenceIsOverride =
            (fastHighEscrowState & 4u) != 0;
        snapshot.fastHighEscrowOwnerGeneration =
            values[FastHighEscrowOwnerGeneration];
        snapshot.fastHighEscrowReferenceTicks =
            values[FastHighEscrowReferenceTicks];
        snapshot.fastHighEscrowReferenceConsumed =
            values[FastHighEscrowReferenceConsumed];
        snapshot.fastHighEscrowRate =
            BitsToDouble(values[FastHighEscrowRate]);
        snapshot.fastHighEscrowStartTicks = values[FastHighEscrowStartTicks];
        snapshot.fastHighEscrowStartPublishedProduced =
            values[FastHighEscrowStartPublishedProduced];
        snapshot.fastHighEscrowStartConsumed =
            values[FastHighEscrowStartConsumed];
        snapshot.fastHighEscrowStartConsumedProduced =
            values[FastHighEscrowStartConsumedProduced];
        snapshot.fastHighEscrowStartLevelPostConsumption =
            values[FastHighEscrowStartLevelPostConsumption];
        snapshot.fastHighEscrowStartLevelPostWrite =
            values[FastHighEscrowStartLevelPostWrite];
        snapshot.fastHighEscrowStartContinuityEpoch =
            values[FastHighEscrowStartContinuityEpoch];
        snapshot.fastHighEscrowStartResetEpoch =
            Low32(values[FastHighEscrowStartResetAndHintSeenEpoch]);
        snapshot.fastHighEscrowStartHintSeenEpoch =
            High32(values[FastHighEscrowStartResetAndHintSeenEpoch]);
        snapshot.fastHighEscrowGrantFrames =
            values[FastHighEscrowGrantFrames];
        snapshot.fastHighEscrowSpentFrames =
            values[FastHighEscrowSpentFrames];
        snapshot.fastHighEscrowRemainingFrames =
            values[FastHighEscrowRemainingFrames];
        snapshot.fastHighEscrowBirthCount =
            values[FastHighEscrowBirthCount];
        snapshot.lastFastHighEscrowBirthUpdateId =
            values[LastFastHighEscrowBirthUpdateId];
        snapshot.lastFastHighEscrowBirthOwnerGeneration =
            values[LastFastHighEscrowBirthOwnerGeneration];
        snapshot.lastFastHighEscrowBirthReferenceWasOverride =
            (Low32(values[LastFastHighEscrowBirthState]) & 1u) != 0;
        snapshot.lastFastHighEscrowBirthReferenceTicks =
            values[LastFastHighEscrowBirthReferenceTicks];
        snapshot.lastFastHighEscrowBirthReferenceConsumed =
            values[LastFastHighEscrowBirthReferenceConsumed];
        snapshot.lastFastHighEscrowBirthRate =
            BitsToDouble(values[LastFastHighEscrowBirthRate]);
        snapshot.lastFastHighEscrowBirthStartTicks =
            values[LastFastHighEscrowBirthStartTicks];
        snapshot.lastFastHighEscrowBirthStartPublishedProduced =
            values[LastFastHighEscrowBirthStartPublishedProduced];
        snapshot.lastFastHighEscrowBirthStartConsumed =
            values[LastFastHighEscrowBirthStartConsumed];
        snapshot.lastFastHighEscrowBirthStartConsumedProduced =
            values[LastFastHighEscrowBirthStartConsumedProduced];
        snapshot.lastFastHighEscrowBirthStartLevelPostConsumption =
            values[LastFastHighEscrowBirthStartLevelPostConsumption];
        snapshot.lastFastHighEscrowBirthStartLevelPostWrite =
            values[LastFastHighEscrowBirthStartLevelPostWrite];
        snapshot.lastFastHighEscrowBirthStartContinuityEpoch =
            values[LastFastHighEscrowBirthStartContinuityEpoch];
        snapshot.lastFastHighEscrowBirthStartResetEpoch = Low32(
            values[LastFastHighEscrowBirthStartResetAndHintSeenEpoch]);
        snapshot.lastFastHighEscrowBirthStartHintSeenEpoch = High32(
            values[LastFastHighEscrowBirthStartResetAndHintSeenEpoch]);
        snapshot.lastFastHighEscrowBirthGrantFrames =
            values[LastFastHighEscrowBirthGrantFrames];
        snapshot.fastHighEscrowSpendCount =
            values[FastHighEscrowSpendCount];
        snapshot.lastFastHighEscrowSpendUpdateId =
            values[LastFastHighEscrowSpendUpdateId];
        snapshot.lastFastHighEscrowSpentFrames =
            values[LastFastHighEscrowSpentFrames];
        snapshot.lastFastHighEscrowRemainingFrames =
            values[LastFastHighEscrowRemainingFrames];
        snapshot.fastHighEscrowOverlayCount =
            values[FastHighEscrowOverlayCount];
        snapshot.lastFastHighEscrowOverlayUpdateId =
            values[LastFastHighEscrowOverlayUpdateId];
        snapshot.lastFastHighEscrowOverlayRemainingFrames =
            values[LastFastHighEscrowOverlayRemainingFrames];
        snapshot.lastFastHighEscrowOverlaySkew =
            BitsToDouble(values[LastFastHighEscrowOverlaySkew]);
        snapshot.fastHighEscrowClearCount =
            values[FastHighEscrowClearCount];
        snapshot.lastFastHighEscrowClearUpdateId =
            values[LastFastHighEscrowClearUpdateId];
        snapshot.lastFastHighEscrowClearReasons =
            Low32(values[LastFastHighEscrowClearReasons]);
        snapshot.lastFastHighEscrowClearOwnerGeneration =
            values[LastFastHighEscrowClearOwnerGeneration];
        snapshot.lastFastHighEscrowClearGrantFrames =
            values[LastFastHighEscrowClearGrantFrames];
        snapshot.lastFastHighEscrowClearSpentFrames =
            values[LastFastHighEscrowClearSpentFrames];
        snapshot.fastHighEscrowGuardSkew =
            BitsToDouble(values[FastHighEscrowGuardSkew]);
        snapshot.lastFastHighEscrowBirthGuardSkew =
            BitsToDouble(values[LastFastHighEscrowBirthGuardSkew]);
        snapshot.fastHighEscrowHorizonFrames =
            values[FastHighEscrowHorizonFrames];
        snapshot.lastFastHighEscrowBirthHorizonFrames =
            values[LastFastHighEscrowBirthHorizonFrames];
        snapshot.fastTargetChangePhaseFrontierOrigin = Low32(
            values[FastTargetChangePhaseFrontierState]);
        snapshot.fastTargetChangePhaseFrontierValid =
            High32(values[FastTargetChangePhaseFrontierState]) != 0;
        snapshot.fastTargetChangePhaseFrontierInvalidationCount =
            values[FastTargetChangePhaseFrontierInvalidationCount];
        snapshot.lastFastTargetChangePhaseFrontierInvalidationUpdateId =
            values[LastFastTargetChangePhaseFrontierInvalidationUpdateId];
        snapshot.lastFastTargetChangePhaseFrontierInvalidationReasons = Low32(
            values[LastFastTargetChangePhaseFrontierInvalidationReasons]);
        snapshot.fastTargetChangePhaseFrontierEvaluationCount =
            values[FastTargetChangePhaseFrontierEvaluationCount];
        snapshot.lastFastTargetChangePhaseFrontierEvaluationUpdateId =
            values[LastFastTargetChangePhaseFrontierEvaluationUpdateId];
        snapshot.lastFastTargetChangePhaseFrontierEvaluationOrigin = Low32(
            values[LastFastTargetChangePhaseFrontierEvaluation]);
        snapshot.lastFastTargetChangePhaseFrontierEvaluationRejectMask = High32(
            values[LastFastTargetChangePhaseFrontierEvaluation]);
        snapshot.fastTargetChangePhaseEscrowActive =
            (Low32(values[FastTargetChangePhaseEscrowState]) & 1u) != 0;
        snapshot.fastTargetChangePhaseEscrowGrantFrames =
            values[FastTargetChangePhaseEscrowGrantFrames];
        snapshot.fastTargetChangePhaseEscrowGuardSkew = BitsToDouble(
            values[FastTargetChangePhaseEscrowGuardSkew]);
        snapshot.fastTargetChangePhaseEscrowOverlaySkew = BitsToDouble(
            values[FastTargetChangePhaseEscrowOverlaySkew]);
        snapshot.fastTargetChangePhaseEscrowReferenceRate = BitsToDouble(
            values[FastTargetChangePhaseEscrowReferenceRate]);
        snapshot.fastTargetChangePhaseEscrowStartTicks =
            values[FastTargetChangePhaseEscrowStartTicks];
        snapshot.fastTargetChangePhaseEscrowStartConsumed =
            values[FastTargetChangePhaseEscrowStartConsumed];
        snapshot.fastTargetChangePhaseEscrowStartConsumedProduced =
            values[FastTargetChangePhaseEscrowStartConsumedProduced];
        snapshot.fastTargetChangePhaseEscrowStartPublishedProduced =
            values[FastTargetChangePhaseEscrowStartPublishedProduced];
        snapshot.fastTargetChangePhaseEscrowStartLevelPostConsumption =
            values[FastTargetChangePhaseEscrowStartLevelPostConsumption];
        snapshot.fastTargetChangePhaseEscrowStartLevelPostWrite =
            values[FastTargetChangePhaseEscrowStartLevelPostWrite];
        snapshot.fastTargetChangePhaseEscrowStartContinuityEpoch =
            values[FastTargetChangePhaseEscrowStartContinuityEpoch];
        snapshot.fastTargetChangePhaseEscrowStartResetEpoch = Low32(
            values[FastTargetChangePhaseEscrowStartResetAndHintSeenEpoch]);
        snapshot.fastTargetChangePhaseEscrowStartHintSeenEpoch = High32(
            values[FastTargetChangePhaseEscrowStartResetAndHintSeenEpoch]);
        snapshot.fastTargetChangePhaseEscrowStartCandidateGeneration =
            values[FastTargetChangePhaseEscrowStartCandidateGeneration];
        snapshot.fastTargetChangePhaseEscrowElapsedPublishedTicks =
            values[FastTargetChangePhaseEscrowElapsedPublishedTicks];
        snapshot.fastTargetChangePhaseEscrowCurrentPhysicalPrefix =
            values[FastTargetChangePhaseEscrowCurrentPhysicalPrefix];
        snapshot.fastTargetChangePhaseEscrowBirthCount =
            values[FastTargetChangePhaseEscrowBirthCount];
        snapshot.lastFastTargetChangePhaseEscrowBirthUpdateId =
            values[LastFastTargetChangePhaseEscrowBirthUpdateId];
        snapshot.lastFastTargetChangePhaseEscrowBirthGrantFrames =
            values[LastFastTargetChangePhaseEscrowBirthGrantFrames];
        snapshot.lastFastTargetChangePhaseEscrowBirthGuardSkew = BitsToDouble(
            values[LastFastTargetChangePhaseEscrowBirthGuardSkew]);
        snapshot.fastTargetChangePhaseEscrowClearCount =
            values[FastTargetChangePhaseEscrowClearCount];
        snapshot.lastFastTargetChangePhaseEscrowClearUpdateId =
            values[LastFastTargetChangePhaseEscrowClearUpdateId];
        snapshot.lastFastTargetChangePhaseEscrowClearReasons = Low32(
            values[LastFastTargetChangePhaseEscrowClearReasons]);
        snapshot.lastFastTargetChangePhaseEscrowClearGrantFrames =
            values[LastFastTargetChangePhaseEscrowClearGrantFrames];
        snapshot.lastFastTargetChangePhaseEscrowClearOverlaySkew = BitsToDouble(
            values[LastFastTargetChangePhaseEscrowClearOverlaySkew]);
        snapshot.sustainedProvisionalPhaseActive =
            Low32(values[SustainedProvisionalPhaseState]) != 0;
        snapshot.sustainedProvisionalPhaseReservedPublicationCount = High32(
            values[SustainedProvisionalPhaseState]);
        snapshot.sustainedProvisionalPhaseCandidateGeneration =
            values[SustainedProvisionalPhaseCandidateGeneration];
        snapshot.sustainedProvisionalPhaseOwnerGeneration =
            values[SustainedProvisionalPhaseOwnerGeneration];
        snapshot.sustainedProvisionalPhaseParentRatio = BitsToDouble(
            values[SustainedProvisionalPhaseParentRatio]);
        snapshot.sustainedProvisionalPhaseSkew = BitsToDouble(
            values[SustainedProvisionalPhaseSkew]);
        snapshot.sustainedProvisionalPhaseFrontierFrames =
            values[SustainedProvisionalPhaseFrontierFrames];
        snapshot.sustainedProvisionalPhaseBackingFrames =
            values[SustainedProvisionalPhaseBackingFrames];
        snapshot.sustainedProvisionalPhasePublicationReserveFrames =
            values[SustainedProvisionalPhasePublicationReserveFrames];
        snapshot.sustainedProvisionalPhaseBirthCount =
            values[SustainedProvisionalPhaseBirthCount];
        snapshot.lastSustainedProvisionalPhaseBirthUpdateId =
            values[LastSustainedProvisionalPhaseBirthUpdateId];
        snapshot.lastSustainedProvisionalPhaseBirthCandidateGeneration =
            values[LastSustainedProvisionalPhaseBirthCandidateGeneration];
        snapshot.lastSustainedProvisionalPhaseBirthParentRatio = BitsToDouble(
            values[LastSustainedProvisionalPhaseBirthParentRatio]);
        snapshot.lastSustainedProvisionalPhaseBirthSkew = BitsToDouble(
            values[LastSustainedProvisionalPhaseBirthSkew]);
        snapshot.lastSustainedProvisionalPhaseBirthFrontierFrames =
            values[LastSustainedProvisionalPhaseBirthFrontierFrames];
        snapshot.lastSustainedProvisionalPhaseBirthBackingFrames =
            values[LastSustainedProvisionalPhaseBirthBackingFrames];
        snapshot.lastSustainedProvisionalPhaseBirthPublicationReserveFrames =
            values[LastSustainedProvisionalPhaseBirthPublicationReserveFrames];
        snapshot.lastSustainedProvisionalPhaseBirthReservedPublicationCount =
            Low32(values[
                LastSustainedProvisionalPhaseBirthReservedPublicationCount]);
        snapshot.sustainedProvisionalPhaseStepCount =
            values[SustainedProvisionalPhaseStepCount];
        snapshot.lastSustainedProvisionalPhaseStepUpdateId =
            values[LastSustainedProvisionalPhaseStepUpdateId];
        snapshot.lastSustainedProvisionalPhaseStepCandidateGeneration =
            values[LastSustainedProvisionalPhaseStepCandidateGeneration];
        snapshot.lastSustainedProvisionalPhaseStepPreviousSkew = BitsToDouble(
            values[LastSustainedProvisionalPhaseStepPreviousSkew]);
        snapshot.lastSustainedProvisionalPhaseStepSkew = BitsToDouble(
            values[LastSustainedProvisionalPhaseStepSkew]);
        snapshot.lastSustainedProvisionalPhaseStepFrontierFrames =
            values[LastSustainedProvisionalPhaseStepFrontierFrames];
        snapshot.lastSustainedProvisionalPhaseStepBackingFrames =
            values[LastSustainedProvisionalPhaseStepBackingFrames];
        snapshot.lastSustainedProvisionalPhaseStepPublicationReserveFrames =
            values[LastSustainedProvisionalPhaseStepPublicationReserveFrames];
        snapshot.lastSustainedProvisionalPhaseStepReservedPublicationCount =
            Low32(values[
                LastSustainedProvisionalPhaseStepReservedPublicationCount]);
        snapshot.sustainedProvisionalPhaseClearCount =
            values[SustainedProvisionalPhaseClearCount];
        snapshot.lastSustainedProvisionalPhaseClearUpdateId =
            values[LastSustainedProvisionalPhaseClearUpdateId];
        snapshot.lastSustainedProvisionalPhaseClearReasons = Low32(
            values[LastSustainedProvisionalPhaseClearReasons]);
        snapshot.lastSustainedProvisionalPhaseClearCandidateGeneration =
            values[LastSustainedProvisionalPhaseClearCandidateGeneration];
        snapshot.lastSustainedProvisionalPhaseClearSkew = BitsToDouble(
            values[LastSustainedProvisionalPhaseClearSkew]);
        snapshot.lastSustainedProvisionalPhaseClearReservedPublicationCount =
            Low32(values[
                LastSustainedProvisionalPhaseClearReservedPublicationCount]);
        snapshot.sustainedProvisionalPhaseApplicationConflictCount =
            values[SustainedProvisionalPhaseApplicationConflictCount];
        snapshot.lastSustainedProvisionalPhaseApplicationConflictUpdateId =
            values[LastSustainedProvisionalPhaseApplicationConflictUpdateId];
        return snapshot;
    }

    std::atomic<std::uint64_t> Sequence {0};
    std::array<std::atomic<std::uint64_t>, WordCount> Words;
};

static_assert(alignof(AudioOutputAdaptiveTelemetryMailbox) >= 64,
              "adaptive telemetry mailbox must avoid hot-state false sharing");

}

#endif
