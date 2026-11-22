#ifndef MELONDS_AUDIOOUTPUTTELEMETRY_H
#define MELONDS_AUDIOOUTPUTTELEMETRY_H

#include "AudioOutputAdaptiveTelemetry.h"

#include <cstdint>

namespace MelonDSAndroid
{

using AudioOutputControllerSnapshot =
    melonDS::AudioOutputAdaptiveTelemetrySnapshot;

struct AudioOutputAdaptiveSnapshot
{
    double desiredSkew = 0.0;
    double appliedSkew = 0.0;
    double speedHint = 0.0;
    std::uint32_t underruns = 0;
    std::uint32_t droppedBlocks = 0;
    std::uint64_t primingFrames = 0;
};

}

#endif
