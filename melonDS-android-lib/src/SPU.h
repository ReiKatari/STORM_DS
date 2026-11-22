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

#ifndef SPU_H
#define SPU_H

#include <atomic>
#include <memory>
#include <utility>

#include "AudioOutputAdaptiveTelemetry.h"
#include "AudioOutputProvenance.h"
#include "Savestate.h"
#include "Platform.h"

struct blip_t;

namespace melonDS
{

class NDS;
class SPU;

enum class AudioSampleRate
{
    _32KHz = 0,
    _47KHz
};

enum class AudioBitDepth
{
    Auto,
    _10Bit,
    _16Bit,
};

enum class AudioInterpolation
{
    None,
    Linear,
    Cosine,
    Cubic,
    SNESGaussian
};

class SPUChannel
{
public:
    SPUChannel(u32 num, melonDS::NDS& nds, AudioInterpolation interpolation);
    void Reset();
    void DoSavestate(Savestate* file);

    static const s8 ADPCMIndexTable[8];
    static const u16 ADPCMTable[89];
    static const s16 PSGTable[8][8];

    // audio interpolation is an improvement upon the original hardware
    // (which performs no interpolation)
    AudioInterpolation InterpType = AudioInterpolation::None;

    const u32 Num;

    u32 Cnt = 0;
    u32 SrcAddr = 0;
    u16 TimerReload = 0;
    u32 LoopPos = 0;
    u32 Length = 0;

    u8 Volume = 0;
    u8 VolumeShift = 0;
    u8 Pan = 0;

    bool KeyOn = false;
    bool HoldRestartPending = false;
    u32 Timer = 0;
    s32 Pos = 0;
    s16 PrevSample[3] {};
    s16 CurSample = 0;
    u16 NoiseVal = 0;

    s32 ADPCMVal = 0;
    s32 ADPCMIndex = 0;
    s32 ADPCMValLoop = 0;
    s32 ADPCMIndexLoop = 0;
    u8 ADPCMCurByte = 0;

    u32 FIFO[8] {};
    u32 FIFOReadPos = 0;
    u32 FIFOWritePos = 0;
    u32 FIFOReadOffset = 0;
    u32 FIFOLevel = 0;

    void FIFO_BufferData();
    template<typename T> T FIFO_ReadData();

    void SetCnt(u32 val)
    {
        u32 oldcnt = Cnt;
        Cnt = val & 0xFF7F837F;

        Volume = Cnt & 0x7F;
        if (Volume == 127) Volume++;

        const u8 volshift[4] = {4, 3, 2, 0};
        VolumeShift = volshift[(Cnt >> 8) & 0x3];

        Pan = (Cnt >> 16) & 0x7F;
        if (Pan == 127) Pan++;

        if ((val & (1<<31)) && !(oldcnt & (1<<31)))
        {
            HoldRestartPending = (oldcnt & (1<<15)) != 0;
            KeyOn = true;
        }
    }

    void SetSrcAddr(u32 val) { SrcAddr = val & 0x07FFFFFC; }
    void SetTimerReload(u32 val) { TimerReload = val & 0xFFFF; }
    void SetLoopPos(u32 val) { LoopPos = (val & 0xFFFF) << 2; }
    void SetLength(u32 val) { Length = (val & 0x001FFFFF) << 2; }

    void Start();

    void NextSample_PCM8();
    void NextSample_PCM16();
    void NextSample_ADPCM();
    void NextSample_PSG();
    void NextSample_Noise();

    template<u32 type> s32 Run(u32 cycles);

    s32 DoRun(u32 cycles)
    {
        switch ((Cnt >> 29) & 0x3)
        {
        case 0: return Run<0>(cycles); break;
        case 1: return Run<1>(cycles); break;
        case 2: return Run<2>(cycles); break;
        case 3:
            if (Num >= 14)
            {
                return Run<4>(cycles);
                break;
            }
            else if (Num >= 8)
            {
                return Run<3>(cycles);
                break;
            }
            [[fallthrough]];
        default:
            return 0;
        }
    }

    s32 DoRunCaptureStep(u32 cycles)
    {
        const u32 type = (Cnt >> 29) & 0x3;
        const u32 nextTimer = Timer + cycles;
        if (InterpType == AudioInterpolation::None && (Cnt & 0x80000000) &&
            !KeyOn && !(nextTimer >> 16) &&
            (type < 3 ? Length + LoopPos >= 16 : Num >= 8))
        {
            Timer = nextTimer;
            s32 val = static_cast<s32>(CurSample);
            val <<= VolumeShift;
            val *= Volume;
            return val;
        }
        return DoRun(cycles);
    }

    void PanOutput(s32 in, s32& left, s32& right);

private:
    melonDS::NDS& NDS;
};

class SPUCaptureUnit
{
public:
    SPUCaptureUnit(u32 num, melonDS::NDS&);
    void Reset();
    void DoSavestate(Savestate* file);

    const u32 Num;

    u8 Cnt = 0;
    u32 DstAddr = 0;
    u16 TimerReload = 0;
    u32 Length = 0;

    u32 Timer = 0;
    s32 Pos = 0;

    u32 FIFO[4] {};
    u32 FIFOReadPos = 0;
    u32 FIFOWritePos = 0;
    u32 FIFOWriteOffset = 0;
    u32 FIFOLevel = 0;

    void FIFO_FlushData();
    template<typename T> void FIFO_WriteData(T val);

    void SetCnt(u8 val)
    {
        if ((val & 0x80) && !(Cnt & 0x80))
            Start();

        val &= 0x8F;
        if (!(val & 0x80)) val &= ~0x01;
        Cnt = val;
    }

    void SetDstAddr(u32 val) { DstAddr = val & 0x07FFFFFC; }
    void SetTimerReload(u32 val) { TimerReload = val & 0xFFFF; }
    void SetLength(u32 val) { Length = val << 2; if (Length == 0) Length = 4; }

    void Start()
    {
        Timer = TimerReload;
        Pos = 0;
        FIFOReadPos = 0;
        FIFOWritePos = 0;
        FIFOWriteOffset = 0;
        FIFOLevel = 0;
    }

    void Run(u32 cycles, s32 sample);

private:
    melonDS::NDS& NDS;
};

class SPU
{
public:
    explicit SPU(melonDS::NDS& nds, AudioBitDepth bitdepth, AudioInterpolation interpolation, double outputSampleRate);
    ~SPU();
    void Reset();
    void DoSavestate(Savestate* file);

    void Stop();

    void SetPowerCnt(u32 val);

    void SetSampleRate(AudioSampleRate rate);

    // 0=none 1=linear 2=cosine 3=cubic
    void SetInterpolation(AudioInterpolation type);

    void SetBias(u16 bias);
    void SetDegrade10Bit(bool enable);
    void SetDegrade10Bit(AudioBitDepth depth);
    void SetApplyBias(bool enable);

    void Mix(u32 spucycles);
    void BufferAudio();

    void TrimOutput();
    void DrainOutput();

    void DrainAndResetOutputAdaptivo();
    void InitOutput();
    int GetOutputSize() const;
    void Sync(bool wait);
    int ReadOutput(s16* data, int samples);
    int ReadOutputAdaptivo(
        s16* data, int samples,
        AudioOutputDrainObservation* observation = nullptr);

    void SetOutputObservationSink(
        std::shared_ptr<AudioOutputObservationSink> sink) noexcept
    {
        OutputObservationSink = std::move(sink);
    }
    double GetAdaptSkew() const
    {
        return AdaptSkewDeseado.load(std::memory_order_relaxed);
    }
    double GetAppliedOutputSkew() const
    {
        return OutputSkewPublicado.load(std::memory_order_relaxed);
    }
    u32 GetAdaptUnderruns() const
    {
        return AdaptUnderruns.load(std::memory_order_relaxed);
    }
    u32 GetAdaptDescartes() const
    {
        return AdaptDescartes.load(std::memory_order_relaxed);
    }
    u64 GetAdaptPrimingFrames() const
    {
        return AdaptPrimingFrames.load(std::memory_order_relaxed);
    }
    double GetOutputSpeedHint() const
    {
        return AdaptSpeedHint.load(std::memory_order_relaxed);
    }
    AudioOutputAdaptiveTelemetrySnapshot GetOutputAdaptiveTelemetry() const noexcept
    {
        return AdaptTelemetryMailbox.Read();
    }

    void SetOutputSpeedHint(double speed);
    void SetOutputLatencyFrames(u32 frames, bool lowLatency = false);
    void EnableOutputTimeStretch();
    void ResetOutputAdaptivo();

    void SetOutputSampleRate(double rate);
    void SetOutputSkew(double skew);

    u8 Read8(u32 addr);
    u16 Read16(u32 addr);
    u32 Read32(u32 addr);
    void Write8(u32 addr, u8 val);
    void Write16(u32 addr, u16 val);
    void Write32(u32 addr, u32 val);

private:
    struct OutputSpillNode;
    struct OutputTempoState;

    u32 OutputRingLevelLocked() const;
    u64 OutputLogicalLevelLocked() const;
    void PromoteOutputSpillLocked(u32 maxFrames);
    int ReadOutputQueueLocked(s16* data, int samples);
    void DiscardOutputQueueLocked(u64 frames);
    void ClearOutputQueueLocked();
    std::unique_ptr<OutputSpillNode> TakeOutputSpillFreeLocked();
    void ReturnOutputSpillFreeLocked(
        std::unique_ptr<OutputSpillNode> node);

    u32 OutputBufferSize = 0;
    double OutputSampleRate;
    double OutputSkew = 1.0;
    melonDS::NDS& NDS;

    blip_t* BlipLeft;
    std::atomic<u32> OutputControlCapacity {0};
    std::unique_ptr<OutputTempoState> OutputTempo;
    std::atomic<bool> OutputTempoRequested {false};
    std::atomic<u32> OutputTempoResetEpoch {0};
    u32 OutputTempoResetSeen = 0;
    blip_t* BlipRight;
    int BlipTimer = 0;

    s16* OutputBuffer;
    u32 OutputBufferWritePos = 0;
    u32 OutputBufferReadPos = 0;
    std::unique_ptr<OutputSpillNode> OutputSpillActive;
    OutputSpillNode* OutputSpillTail = nullptr;
    std::unique_ptr<OutputSpillNode> OutputSpillFree;
    u64 OutputSpillFrames = 0;
    u64 OutputSpillPeakFrames = 0;
    u64 OutputSpillActiveNodes = 0;
    u64 OutputSpillFreeNodes = 0;
    u64 OutputSpillGeneration = 0;
    u64 OutputSpillBirthCount = 0;
    u64 OutputSpillPublicationCount = 0;
    u64 OutputSpillFramesPublishedTotal = 0;
    u64 OutputSpillAllocationCount = 0;
    u64 OutputSpillAllocationFailureCount = 0;
    u64 OutputSpillDroppedPacketsTotal = 0;
    u64 OutputSpillDroppedFramesTotal = 0;
    u64 OutputSpillLastBirthContinuityEpoch = 0;
    u32 OutputSpillLastBirthResetEpoch = 0;
    u64 OutputSpillLastBirthOwnerGeneration = 0;
    u32 OutputSpillLastBirthFrames = 0;
    bool OutputSpillBirthThisWrite = false;
    s16 OutputLastSamples[2];

    u64 OutputProvenancePacketId = 0;
    u64 OutputProvenanceAcceptedFrames = 0;
    u64 OutputProvenanceRemovedFrames = 0;
    u64 OutputProvenanceRealDrainedFrames = 0;
    u64 OutputProvenanceDiscardedFrames = 0;
    u64 OutputProvenanceLineageEpoch = 0;
    std::shared_ptr<AudioOutputObservationSink> OutputObservationSink;

    s16 AdaptUltima[2] {};
    bool AdaptEnHueco = false;
    bool AdaptPriming = true;
    u32 AdaptResetVistoConsumidor = 0;
    u64 AdaptContinuidadEpoch = 0;
    u64 AdaptHostConsumedTotal = 0;
    u64 AdaptTicksAlConsumo = 0;
    u64 AdaptFramesAlConsumo = 0;
    int AdaptNivelPostConsumo = 0;
    u64 AdaptNivelPostConsumoLogico = 0;

    double AdaptSkew = 1.0;
    double AdaptRatio = 1.0;
    double AdaptHint = 0.0;
    bool AdaptProbe = false;
    bool AdaptTempoRecuperandoExceso = false;

    bool AdaptFastLowPendiente = false;

    bool AdaptFastCambioTargetPendiente = false;

    bool AdaptFastCambioTargetFronteraPhaseValida = false;

    bool AdaptFastCambioTargetCruzoIntervaloHost = false;

    u32 AdaptFastCambioTargetFronteraPhaseOrigen =
        AudioOutputAdaptiveFastTargetChangePhaseFrontierNone;

    bool AdaptFastCambioTargetPhaseEscrowActivo = false;
    u64 AdaptFastCambioTargetPhaseEscrowGrantFrames = 0;
    double AdaptFastCambioTargetPhaseEscrowGuardSkew = 0.0;
    double AdaptFastCambioTargetPhaseEscrowOverlaySkew = 0.0;
    double AdaptFastCambioTargetPhaseEscrowRateReferencia = 0.0;
    u64 AdaptFastCambioTargetPhaseEscrowTicksInicio = 0;
    u64 AdaptFastCambioTargetPhaseEscrowConsInicio = 0;
    u64 AdaptFastCambioTargetPhaseEscrowFramesConsumoInicio = 0;
    u64 AdaptFastCambioTargetPhaseEscrowFramesPublicadosInicio = 0;
    u64 AdaptFastCambioTargetPhaseEscrowNivelConsumoInicio = 0;
    u64 AdaptFastCambioTargetPhaseEscrowNivelEscrituraInicio = 0;
    u64 AdaptFastCambioTargetPhaseEscrowContinuidadEpoch = 0;
    u32 AdaptFastCambioTargetPhaseEscrowResetEpoch = 0;
    u32 AdaptFastCambioTargetPhaseEscrowHintSeenEpoch = 0;
    u64 AdaptFastCambioTargetPhaseEscrowCandidatoGeneracion = 0;
    u32 AdaptFastCambioTargetPhaseEscrowUnderrunsInicio = 0;
    u64 AdaptFastCambioTargetPhaseEscrowSpillDropsInicio = 0;
    u64 AdaptFastCambioTargetPhaseEscrowSpillAllocationFailuresInicio = 0;
    u32 AdaptResetVistoProductor = 0;
    u32 AdaptHintVistoProductor = 0;
    u64 AdaptContinuidadVistoProductor = 0;
    u64 AdaptTicksTotal = 0;
    u64 AdaptFramesProducidosTotal = 0;
    u64 AdaptFastTicksInicio = 0;
    u64 AdaptFastConsInicio = 0;

    bool AdaptFastAnchorOwnerValido = false;
    u64 AdaptFastAnchorOwnerGeneracion = 0;
    u64 AdaptFastFramesInicio = 0;
    u64 AdaptFastFramesPublicadosInicio = 0;
    int AdaptFastNivelInicio = 0;
    u64 AdaptFastNivelInicioLogico = 0;

    u64 AdaptFastNivelEscrituraInicioLogico = 0;
    u64 AdaptFastContinuidadEpochInicio = 0;
    u32 AdaptFastResetEpochInicio = 0;
    u32 AdaptFastHintSeenEpochInicio = 0;
    u64 AdaptFastCandidatoGeneracionInicio = 0;
    u64 AdaptSlowTicksInicio = 0;
    u64 AdaptSlowConsInicio = 0;

    bool AdaptSostenidoCandidatoActivo = false;
    bool AdaptSostenidoOwnerActivo = false;
    double AdaptSostenidoOwnerRatio = 0.0;
    u64 AdaptSostenidoCandidatoGeneracion = 0;
    u64 AdaptSostenidoOwnerGeneracion = 0;
    u64 AdaptSostenidoOwnerCandidatoGeneracion = 0;
    u64 AdaptSostenidoEpisodioOrigenUpdateId = 0;
    u64 AdaptSostenidoTicksInicio = 0;
    u64 AdaptSostenidoConsInicio = 0;
    u64 AdaptSostenidoFramesInicio = 0;
    u64 AdaptSostenidoFramesPublicadosInicio = 0;
    u64 AdaptSostenidoUltimaPublicacionCons = 0;
    int AdaptSostenidoNivelInicio = 0;
    u64 AdaptSostenidoNivelInicioLogico = 0;

    u64 AdaptSostenidoNivelEscrituraInicioLogico = 0;
    u64 AdaptSostenidoContinuidadEpochInicio = 0;
    u32 AdaptSostenidoResetEpochInicio = 0;
    u32 AdaptSostenidoHintSeenEpochInicio = 0;
    int AdaptSostenidoNivelMinimo = 0;
    int AdaptSostenidoNivelMaximo = 0;

    u64 AdaptSostenidoNivelMinimoLogico = 0;
    u64 AdaptSostenidoNivelMaximoLogico = 0;
    bool AdaptSostenidoSegmentoUnoCompleto = false;
    bool AdaptSostenidoCandidatoReemplazo = false;
    u64 AdaptSostenidoSegmentoUnoTicks = 0;
    u64 AdaptSostenidoSegmentoUnoCons = 0;
    u64 AdaptSostenidoSegmentoUnoFrames = 0;
    u64 AdaptSostenidoSegmentoUnoFramesPublicados = 0;
    int AdaptSostenidoSegmentoUnoNivel = 0;
    u64 AdaptSostenidoSegmentoUnoNivelLogico = 0;
    u64 AdaptSostenidoSegmentoUnoNivelEscrituraLogico = 0;
    u64 AdaptSostenidoSegmentoUnoContinuidadEpoch = 0;
    u32 AdaptSostenidoSegmentoUnoResetEpoch = 0;
    u32 AdaptSostenidoSegmentoUnoHintSeenEpoch = 0;
    double AdaptSostenidoReferenciaRatio = 0.0;
    int AdaptSostenidoDireccion = 0;
    u64 AdaptSostenidoOwnerTicks = 0;
    u64 AdaptSostenidoOwnerCons = 0;
    int AdaptSostenidoPhaseObjetivoFrames = 0;
    bool AdaptSostenidoParentValido = false;
    bool AdaptSostenidoParentEsHint = false;
    double AdaptSostenidoParentRatio = 0.0;
    u64 AdaptSostenidoParentTicks = 0;
    u64 AdaptSostenidoParentCons = 0;

    bool AdaptSostenidoPhaseProvisionalActivo = false;
    u64 AdaptSostenidoPhaseProvisionalCandidatoGeneracion = 0;
    u64 AdaptSostenidoPhaseProvisionalOwnerGeneracion = 0;
    double AdaptSostenidoPhaseProvisionalParentRatio = 0.0;
    double AdaptSostenidoPhaseProvisionalSkew = 0.0;
    int AdaptSostenidoPhaseProvisionalNivelInicio = 0;
    u64 AdaptSostenidoPhaseProvisionalFronteraFrames = 0;
    u64 AdaptSostenidoPhaseProvisionalBackingFrames = 0;
    u64 AdaptSostenidoPhaseProvisionalReservaPublicacionFrames = 0;
    u32 AdaptSostenidoPhaseProvisionalPublicacionesReservadas = 0;
    u64 AdaptSostenidoPhaseProvisionalContinuidadEpoch = 0;
    u32 AdaptSostenidoPhaseProvisionalResetEpoch = 0;
    u32 AdaptSostenidoPhaseProvisionalHintSeenEpoch = 0;
    u32 AdaptSostenidoPhaseProvisionalUnderrunsInicio = 0;
    u64 AdaptSostenidoPhaseProvisionalSpillDropsInicio = 0;
    u64 AdaptSostenidoPhaseProvisionalSpillAllocationFailuresInicio = 0;
    bool AdaptSostenidoOverrideActivo = false;
    int AdaptSostenidoOverrideDireccion = 0;
    u64 AdaptSostenidoOverrideTicks = 0;
    u64 AdaptSostenidoOverrideCons = 0;

    bool AdaptSostenidoFastLowWitnessActivo = false;
    u64 AdaptSostenidoFastLowWitnessOwnerGeneracion = 0;
    u64 AdaptSostenidoFastLowWitnessTicksNacimiento = 0;
    u64 AdaptSostenidoFastLowWitnessConsNacimiento = 0;
    u64 AdaptSostenidoFastLowWitnessFramesNacimiento = 0;
    int AdaptSostenidoFastLowWitnessNivelNacimiento = 0;
    u64 AdaptSostenidoFastLowWitnessNivelNacimientoLogico = 0;
    u64 AdaptSostenidoFastLowWitnessTicksFin = 0;
    u64 AdaptSostenidoFastLowWitnessConsFin = 0;
    u64 AdaptSostenidoFastLowWitnessFramesFin = 0;
    int AdaptSostenidoFastLowWitnessNivelFin = 0;
    u64 AdaptSostenidoFastLowWitnessNivelFinLogico = 0;

    bool AdaptSostenidoFastHighWitnessActivo = false;
    bool AdaptSostenidoFastHighWitnessReferenciaEsOverride = false;
    u64 AdaptSostenidoFastHighWitnessOwnerGeneracion = 0;
    u64 AdaptSostenidoFastHighWitnessReferenciaTicks = 0;
    u64 AdaptSostenidoFastHighWitnessReferenciaCons = 0;
    u64 AdaptSostenidoFastHighWitnessTicksInicio = 0;
    u64 AdaptSostenidoFastHighWitnessConsInicio = 0;
    u64 AdaptSostenidoFastHighWitnessFramesInicio = 0;
    int AdaptSostenidoFastHighWitnessNivelInicio = 0;
    u64 AdaptSostenidoFastHighWitnessNivelInicioLogico = 0;
    int AdaptSostenidoFastHighWitnessUltimoNivelConsumo = 0;
    int AdaptSostenidoFastHighWitnessUltimoNivelEscritura = 0;
    bool AdaptSostenidoFastHighWitnessCapacidad = false;

    double AdaptSostenidoFastHighGuardSkew = 0.0;

    bool AdaptSostenidoFastHighEscrowInicializado = false;
    bool AdaptSostenidoFastHighEscrowActivo = false;
    bool AdaptSostenidoFastHighEscrowReferenciaEsOverride = false;
    u64 AdaptSostenidoFastHighEscrowOwnerGeneracion = 0;
    u64 AdaptSostenidoFastHighEscrowReferenciaTicks = 0;
    u64 AdaptSostenidoFastHighEscrowReferenciaCons = 0;
    double AdaptSostenidoFastHighEscrowRate = 0.0;
    double AdaptSostenidoFastHighEscrowGuardSkew = 0.0;
    u64 AdaptSostenidoFastHighEscrowHorizonteNacimientoFrames = 0;
    u64 AdaptSostenidoFastHighEscrowHorizonteRestanteFrames = 0;
    u64 AdaptSostenidoFastHighEscrowTicksInicio = 0;
    u64 AdaptSostenidoFastHighEscrowFramesPublicadosInicio = 0;
    u64 AdaptSostenidoFastHighEscrowConsInicio = 0;
    u64 AdaptSostenidoFastHighEscrowFramesConsumoInicio = 0;
    u64 AdaptSostenidoFastHighEscrowNivelConsumoInicioLogico = 0;
    u64 AdaptSostenidoFastHighEscrowNivelEscrituraInicioLogico = 0;
    u64 AdaptSostenidoFastHighEscrowContinuidadEpoch = 0;
    u32 AdaptSostenidoFastHighEscrowResetEpoch = 0;
    u32 AdaptSostenidoFastHighEscrowHintSeenEpoch = 0;
    u64 AdaptSostenidoFastHighEscrowGrantFrames = 0;
    u64 AdaptSostenidoFastHighEscrowSpentFrames = 0;

    bool AdaptParentCapacityActivo = false;
    bool AdaptParentCapacityPrimerRiesgoVisto = false;
    u64 AdaptParentCapacityGeneracion = 0;
    u64 AdaptParentCapacitySourceOwnerGeneracion = 0;
    double AdaptParentCapacityParentRatio = 0.0;
    u64 AdaptParentCapacityContinuidadEpoch = 0;
    u32 AdaptParentCapacityResetEpoch = 0;
    u32 AdaptParentCapacityHintSeenEpoch = 0;
    u32 AdaptParentCapacityCapacidad = 0;
    u64 AdaptParentCapacityConsInicio = 0;
    u64 AdaptParentCapacityTicksInicio = 0;
    u64 AdaptParentCapacityFramesConsumoInicio = 0;
    u64 AdaptParentCapacityFramesPublicadosInicio = 0;
    int AdaptParentCapacityNivelConsumoInicio = 0;
    int AdaptParentCapacityNivelEscrituraInicio = 0;
    u64 AdaptParentCapacityNivelConsumoInicioLogico = 0;
    u64 AdaptParentCapacityNivelEscrituraInicioLogico = 0;
    bool AdaptSostenidoRecoveryVerificando = false;
    u64 AdaptSostenidoRecoveryTicksInicio = 0;
    u64 AdaptSostenidoRecoveryConsInicio = 0;
    u64 AdaptSostenidoRecoveryFramesInicio = 0;
    int AdaptSostenidoRecoveryNivelInicio = 0;
    int AdaptSostenidoRecoveryFrontera = 0;
    u64 AdaptActConsAnterior = 0;
    u64 AdaptActTicksAnterior = 0;
    u64 AdaptActFramesAnterior = 0;
    double AdaptActCreditoFrames = 0.0;
    double AdaptRateCreditoFrames = 0.0;

    bool AdaptRateActuadorPendiente = false;
    bool AdaptRateActuadorPreferirRapido = false;
    u64 AdaptRateActuadorCons = 0;
    u64 AdaptRateActuadorTicks = 0;
    double AdaptPhaseBalanceFrames = 0.0;
    bool AdaptPhaseEpisodioActivo = false;
    int AdaptPhaseObjetivoFrames = 0;
    bool AdaptPhaseObjetivoActivo = false;
    bool AdaptPhaseRebasePendiente = false;
    bool AdaptPhaseRebaseBandViolada = false;
    int AdaptPhaseRebaseMinFrames = -1;
    bool AdaptPhaseOrigenRecuperacionRate = false;
    bool AdaptRateBajoConfirmado = false;

    bool AdaptRatePadreCertificado = false;
    u64 AdaptRatePadreTicks = 0;
    u64 AdaptRatePadreCons = 0;

    bool AdaptHintPadreCertificado = false;

    u64 AdaptHintCertTicksInicio = 0;
    u64 AdaptHintCertConsInicio = 0;
    bool AdaptHintCertRebasePostDropPendiente = false;

    bool AdaptRateRollbackPendiente = false;
    bool AdaptRateRollbackVerificando = false;

    bool AdaptRateRollbackPadreEsHint = false;
    double AdaptRateRollbackRatio = 1.0;
    int AdaptRateRollbackObjetivoFrames = 0;
    int AdaptRateRollbackFronteraFrames = 0;
    u64 AdaptRateRollbackPadreTicks = 0;
    u64 AdaptRateRollbackPadreCons = 0;
    u64 AdaptRateRollbackTicksInicio = 0;
    u64 AdaptRateRollbackConsInicio = 0;

    bool AdaptReingresoRatePendiente = false;
    void UpdateOutputAdaptivo(u64 hostConsumed, u64 ticksAlConsumo,
                              u64 framesAlConsumo,
                              int nivelPostConsumo, int nivelPostEscritura,
                              u64 nivelPostConsumoLogico,
                              u64 nivelPostEscrituraLogico,
                              u32 resetSolicitado, u32 resetConfirmado,
                              bool priming, u64 continuidadEpoch,
                              u32 dropsEstaEscritura,
                              u32 underrunsActuales,
                              AudioOutputAdaptiveTelemetrySnapshot& telemetry);

    static_assert(std::atomic<double>::is_always_lock_free,
                  "adaptive audio mailbox must be lock-free");
    static_assert(std::atomic<u32>::is_always_lock_free,
                  "adaptive audio counters must be lock-free");
    static_assert(std::atomic<u64>::is_always_lock_free,
                  "adaptive audio clock must be lock-free");
    std::atomic<double> AdaptSkewDeseado {1.0};

    std::atomic<double> OutputSkewPublicado {1.0};
    std::atomic<double> AdaptSpeedHint {0.0};

    std::atomic<u32> AdaptModoDrenado {0};
    std::atomic<u32> AdaptResetEpoch {0};
    std::atomic<u32> AdaptHintEpoch {0};

    std::atomic<u64> AdaptReingresoPrimingReserva {0};

    u32 AdaptResetConfirmado = 0;

    std::atomic<u32> AdaptDescartes {0};
    std::atomic<u32> AdaptUnderruns {0};
    std::atomic<u64> AdaptPrimingFrames {0};

    std::atomic<u64> AdaptTicksPublicados {0};

    AudioOutputAdaptiveTelemetrySnapshot AdaptTelemetryState {};
    AudioOutputAdaptiveTelemetryMailbox AdaptTelemetryMailbox;

    u32 MixInterval;

    Platform::Mutex* AudioLock;

    u16 Cnt = 0;
    u8 MasterVolume = 0;
    u16 Bias = 0;
    bool ApplyBias = true;
    bool Degrade10Bit = false;
    bool Mute;

    std::array<SPUChannel, 16> Channels;
    std::array<SPUCaptureUnit, 2> Capture;
};

}
#endif // SPU_H
