package me.magnum.melonds.domain.model;

import android.net.Uri;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.RangeCoder;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class EmulatorConfiguration {
    public static final int $stable = 8;
    private final AudioBitrate audioBitrate;
    private final AudioInterpolation audioInterpolation;
    private final AudioLatency audioLatency;
    private final ConsoleType consoleType;
    private final DldiSdCardConfiguration dldiSdCardConfiguration;
    private final Uri dsBios7Uri;
    private final Uri dsBios9Uri;
    private final Uri dsFirmwareUri;
    private final Uri dsiBios7Uri;
    private final Uri dsiBios9Uri;
    private final Uri dsiFirmwareUri;
    private final Uri dsiNandUri;
    private final long dsiWareAutoloadTitleId;
    private final float fastForwardSpeedMultiplier;
    private final FirmwareConfiguration firmwareConfiguration;
    private final float frameLimitSpeedMultiplier;
    private final boolean hgEngineFixEnabled;
    private final String internalDirectory;
    private final MicSource micSource;
    private final RendererConfiguration rendererConfiguration;
    private final boolean rewindEnabled;
    private final int rewindPeriodSeconds;
    private final int rewindWindowSeconds;
    private final boolean showBootScreen;
    private final boolean soundEnabled;
    private final boolean useCustomBios;
    private final boolean useJit;
    private final int volume;

    public EmulatorConfiguration(boolean z, boolean z2, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, String str, float f, float f2, boolean z3, int i, int i2, boolean z4, boolean z5, ConsoleType consoleType, boolean z6, AudioInterpolation audioInterpolation, AudioBitrate audioBitrate, int i3, AudioLatency audioLatency, MicSource micSource, FirmwareConfiguration firmwareConfiguration, RendererConfiguration rendererConfiguration, DldiSdCardConfiguration dldiSdCardConfiguration, long j) {
        str.getClass();
        consoleType.getClass();
        audioInterpolation.getClass();
        audioBitrate.getClass();
        audioLatency.getClass();
        micSource.getClass();
        firmwareConfiguration.getClass();
        rendererConfiguration.getClass();
        dldiSdCardConfiguration.getClass();
        this.useCustomBios = z;
        this.showBootScreen = z2;
        this.dsBios7Uri = uri;
        this.dsBios9Uri = uri2;
        this.dsFirmwareUri = uri3;
        this.dsiBios7Uri = uri4;
        this.dsiBios9Uri = uri5;
        this.dsiFirmwareUri = uri6;
        this.dsiNandUri = uri7;
        this.internalDirectory = str;
        this.fastForwardSpeedMultiplier = f;
        this.frameLimitSpeedMultiplier = f2;
        this.rewindEnabled = z3;
        this.rewindPeriodSeconds = i;
        this.rewindWindowSeconds = i2;
        this.useJit = z4;
        this.hgEngineFixEnabled = z5;
        this.consoleType = consoleType;
        this.soundEnabled = z6;
        this.audioInterpolation = audioInterpolation;
        this.audioBitrate = audioBitrate;
        this.volume = i3;
        this.audioLatency = audioLatency;
        this.micSource = micSource;
        this.firmwareConfiguration = firmwareConfiguration;
        this.rendererConfiguration = rendererConfiguration;
        this.dldiSdCardConfiguration = dldiSdCardConfiguration;
        this.dsiWareAutoloadTitleId = j;
    }

    public static /* synthetic */ EmulatorConfiguration copy$default(EmulatorConfiguration emulatorConfiguration, boolean z, boolean z2, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, String str, float f, float f2, boolean z3, int i, int i2, boolean z4, boolean z5, ConsoleType consoleType, boolean z6, AudioInterpolation audioInterpolation, AudioBitrate audioBitrate, int i3, AudioLatency audioLatency, MicSource micSource, FirmwareConfiguration firmwareConfiguration, RendererConfiguration rendererConfiguration, DldiSdCardConfiguration dldiSdCardConfiguration, long j, int i4, Object obj) {
        long j2;
        DldiSdCardConfiguration dldiSdCardConfiguration2;
        int i5;
        boolean z7 = (i4 & 1) != 0 ? emulatorConfiguration.useCustomBios : z;
        boolean z8 = (i4 & 2) != 0 ? emulatorConfiguration.showBootScreen : z2;
        Uri uri8 = (i4 & 4) != 0 ? emulatorConfiguration.dsBios7Uri : uri;
        Uri uri9 = (i4 & 8) != 0 ? emulatorConfiguration.dsBios9Uri : uri2;
        Uri uri10 = (i4 & 16) != 0 ? emulatorConfiguration.dsFirmwareUri : uri3;
        Uri uri11 = (i4 & 32) != 0 ? emulatorConfiguration.dsiBios7Uri : uri4;
        Uri uri12 = (i4 & 64) != 0 ? emulatorConfiguration.dsiBios9Uri : uri5;
        Uri uri13 = (i4 & 128) != 0 ? emulatorConfiguration.dsiFirmwareUri : uri6;
        Uri uri14 = (i4 & 256) != 0 ? emulatorConfiguration.dsiNandUri : uri7;
        String str2 = (i4 & 512) != 0 ? emulatorConfiguration.internalDirectory : str;
        float f3 = (i4 & 1024) != 0 ? emulatorConfiguration.fastForwardSpeedMultiplier : f;
        float f4 = (i4 & 2048) != 0 ? emulatorConfiguration.frameLimitSpeedMultiplier : f2;
        boolean z9 = (i4 & 4096) != 0 ? emulatorConfiguration.rewindEnabled : z3;
        int i6 = (i4 & 8192) != 0 ? emulatorConfiguration.rewindPeriodSeconds : i;
        boolean z10 = z7;
        int i7 = (i4 & 16384) != 0 ? emulatorConfiguration.rewindWindowSeconds : i2;
        boolean z11 = (i4 & 32768) != 0 ? emulatorConfiguration.useJit : z4;
        boolean z12 = (i4 & 65536) != 0 ? emulatorConfiguration.hgEngineFixEnabled : z5;
        ConsoleType consoleType2 = (i4 & 131072) != 0 ? emulatorConfiguration.consoleType : consoleType;
        boolean z13 = (i4 & 262144) != 0 ? emulatorConfiguration.soundEnabled : z6;
        AudioInterpolation audioInterpolation2 = (i4 & 524288) != 0 ? emulatorConfiguration.audioInterpolation : audioInterpolation;
        AudioBitrate audioBitrate2 = (i4 & 1048576) != 0 ? emulatorConfiguration.audioBitrate : audioBitrate;
        int i8 = (i4 & 2097152) != 0 ? emulatorConfiguration.volume : i3;
        AudioLatency audioLatency2 = (i4 & Compress.MAXWINSIZE) != 0 ? emulatorConfiguration.audioLatency : audioLatency;
        MicSource micSource2 = (i4 & 8388608) != 0 ? emulatorConfiguration.micSource : micSource;
        FirmwareConfiguration firmwareConfiguration2 = (i4 & RangeCoder.TOP) != 0 ? emulatorConfiguration.firmwareConfiguration : firmwareConfiguration;
        RendererConfiguration rendererConfiguration2 = (i4 & 33554432) != 0 ? emulatorConfiguration.rendererConfiguration : rendererConfiguration;
        DldiSdCardConfiguration dldiSdCardConfiguration3 = (i4 & 67108864) != 0 ? emulatorConfiguration.dldiSdCardConfiguration : dldiSdCardConfiguration;
        if ((i4 & 134217728) != 0) {
            i5 = i7;
            dldiSdCardConfiguration2 = dldiSdCardConfiguration3;
            j2 = emulatorConfiguration.dsiWareAutoloadTitleId;
        } else {
            j2 = j;
            dldiSdCardConfiguration2 = dldiSdCardConfiguration3;
            i5 = i7;
        }
        return emulatorConfiguration.copy(z10, z8, uri8, uri9, uri10, uri11, uri12, uri13, uri14, str2, f3, f4, z9, i6, i5, z11, z12, consoleType2, z13, audioInterpolation2, audioBitrate2, i8, audioLatency2, micSource2, firmwareConfiguration2, rendererConfiguration2, dldiSdCardConfiguration2, j2);
    }

    public final boolean component1() {
        return this.useCustomBios;
    }

    public final String component10() {
        return this.internalDirectory;
    }

    public final float component11() {
        return this.fastForwardSpeedMultiplier;
    }

    public final float component12() {
        return this.frameLimitSpeedMultiplier;
    }

    public final boolean component13() {
        return this.rewindEnabled;
    }

    public final int component14() {
        return this.rewindPeriodSeconds;
    }

    public final int component15() {
        return this.rewindWindowSeconds;
    }

    public final boolean component16() {
        return this.useJit;
    }

    public final boolean component17() {
        return this.hgEngineFixEnabled;
    }

    public final ConsoleType component18() {
        return this.consoleType;
    }

    public final boolean component19() {
        return this.soundEnabled;
    }

    public final boolean component2() {
        return this.showBootScreen;
    }

    public final AudioInterpolation component20() {
        return this.audioInterpolation;
    }

    public final AudioBitrate component21() {
        return this.audioBitrate;
    }

    public final int component22() {
        return this.volume;
    }

    public final AudioLatency component23() {
        return this.audioLatency;
    }

    public final MicSource component24() {
        return this.micSource;
    }

    public final FirmwareConfiguration component25() {
        return this.firmwareConfiguration;
    }

    public final RendererConfiguration component26() {
        return this.rendererConfiguration;
    }

    public final DldiSdCardConfiguration component27() {
        return this.dldiSdCardConfiguration;
    }

    public final long component28() {
        return this.dsiWareAutoloadTitleId;
    }

    public final Uri component3() {
        return this.dsBios7Uri;
    }

    public final Uri component4() {
        return this.dsBios9Uri;
    }

    public final Uri component5() {
        return this.dsFirmwareUri;
    }

    public final Uri component6() {
        return this.dsiBios7Uri;
    }

    public final Uri component7() {
        return this.dsiBios9Uri;
    }

    public final Uri component8() {
        return this.dsiFirmwareUri;
    }

    public final Uri component9() {
        return this.dsiNandUri;
    }

    public final EmulatorConfiguration copy(boolean z, boolean z2, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, String str, float f, float f2, boolean z3, int i, int i2, boolean z4, boolean z5, ConsoleType consoleType, boolean z6, AudioInterpolation audioInterpolation, AudioBitrate audioBitrate, int i3, AudioLatency audioLatency, MicSource micSource, FirmwareConfiguration firmwareConfiguration, RendererConfiguration rendererConfiguration, DldiSdCardConfiguration dldiSdCardConfiguration, long j) {
        str.getClass();
        consoleType.getClass();
        audioInterpolation.getClass();
        audioBitrate.getClass();
        audioLatency.getClass();
        micSource.getClass();
        firmwareConfiguration.getClass();
        rendererConfiguration.getClass();
        dldiSdCardConfiguration.getClass();
        return new EmulatorConfiguration(z, z2, uri, uri2, uri3, uri4, uri5, uri6, uri7, str, f, f2, z3, i, i2, z4, z5, consoleType, z6, audioInterpolation, audioBitrate, i3, audioLatency, micSource, firmwareConfiguration, rendererConfiguration, dldiSdCardConfiguration, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmulatorConfiguration)) {
            return false;
        }
        EmulatorConfiguration emulatorConfiguration = (EmulatorConfiguration) obj;
        if (this.useCustomBios == emulatorConfiguration.useCustomBios && this.showBootScreen == emulatorConfiguration.showBootScreen && nb3.k(this.dsBios7Uri, emulatorConfiguration.dsBios7Uri) && nb3.k(this.dsBios9Uri, emulatorConfiguration.dsBios9Uri) && nb3.k(this.dsFirmwareUri, emulatorConfiguration.dsFirmwareUri) && nb3.k(this.dsiBios7Uri, emulatorConfiguration.dsiBios7Uri) && nb3.k(this.dsiBios9Uri, emulatorConfiguration.dsiBios9Uri) && nb3.k(this.dsiFirmwareUri, emulatorConfiguration.dsiFirmwareUri) && nb3.k(this.dsiNandUri, emulatorConfiguration.dsiNandUri) && nb3.k(this.internalDirectory, emulatorConfiguration.internalDirectory) && Float.compare(this.fastForwardSpeedMultiplier, emulatorConfiguration.fastForwardSpeedMultiplier) == 0 && Float.compare(this.frameLimitSpeedMultiplier, emulatorConfiguration.frameLimitSpeedMultiplier) == 0 && this.rewindEnabled == emulatorConfiguration.rewindEnabled && this.rewindPeriodSeconds == emulatorConfiguration.rewindPeriodSeconds && this.rewindWindowSeconds == emulatorConfiguration.rewindWindowSeconds && this.useJit == emulatorConfiguration.useJit && this.hgEngineFixEnabled == emulatorConfiguration.hgEngineFixEnabled && this.consoleType == emulatorConfiguration.consoleType && this.soundEnabled == emulatorConfiguration.soundEnabled && this.audioInterpolation == emulatorConfiguration.audioInterpolation && this.audioBitrate == emulatorConfiguration.audioBitrate && this.volume == emulatorConfiguration.volume && this.audioLatency == emulatorConfiguration.audioLatency && this.micSource == emulatorConfiguration.micSource && nb3.k(this.firmwareConfiguration, emulatorConfiguration.firmwareConfiguration) && nb3.k(this.rendererConfiguration, emulatorConfiguration.rendererConfiguration) && nb3.k(this.dldiSdCardConfiguration, emulatorConfiguration.dldiSdCardConfiguration) && this.dsiWareAutoloadTitleId == emulatorConfiguration.dsiWareAutoloadTitleId) {
            return true;
        }
        return false;
    }

    public final AudioBitrate getAudioBitrate() {
        return this.audioBitrate;
    }

    public final AudioInterpolation getAudioInterpolation() {
        return this.audioInterpolation;
    }

    public final AudioLatency getAudioLatency() {
        return this.audioLatency;
    }

    public final ConsoleType getConsoleType() {
        return this.consoleType;
    }

    public final DldiSdCardConfiguration getDldiSdCardConfiguration() {
        return this.dldiSdCardConfiguration;
    }

    public final Uri getDsBios7Uri() {
        return this.dsBios7Uri;
    }

    public final Uri getDsBios9Uri() {
        return this.dsBios9Uri;
    }

    public final Uri getDsFirmwareUri() {
        return this.dsFirmwareUri;
    }

    public final Uri getDsiBios7Uri() {
        return this.dsiBios7Uri;
    }

    public final Uri getDsiBios9Uri() {
        return this.dsiBios9Uri;
    }

    public final Uri getDsiFirmwareUri() {
        return this.dsiFirmwareUri;
    }

    public final Uri getDsiNandUri() {
        return this.dsiNandUri;
    }

    public final long getDsiWareAutoloadTitleId() {
        return this.dsiWareAutoloadTitleId;
    }

    public final float getFastForwardSpeedMultiplier() {
        return this.fastForwardSpeedMultiplier;
    }

    public final FirmwareConfiguration getFirmwareConfiguration() {
        return this.firmwareConfiguration;
    }

    public final float getFrameLimitSpeedMultiplier() {
        return this.frameLimitSpeedMultiplier;
    }

    public final boolean getHgEngineFixEnabled() {
        return this.hgEngineFixEnabled;
    }

    public final String getInternalDirectory() {
        return this.internalDirectory;
    }

    public final MicSource getMicSource() {
        return this.micSource;
    }

    public final RendererConfiguration getRendererConfiguration() {
        return this.rendererConfiguration;
    }

    public final boolean getRewindEnabled() {
        return this.rewindEnabled;
    }

    public final int getRewindPeriodSeconds() {
        return this.rewindPeriodSeconds;
    }

    public final int getRewindWindowSeconds() {
        return this.rewindWindowSeconds;
    }

    public final boolean getShowBootScreen() {
        return this.showBootScreen;
    }

    public final boolean getSoundEnabled() {
        return this.soundEnabled;
    }

    public final boolean getUseCustomBios() {
        return this.useCustomBios;
    }

    public final boolean getUseJit() {
        return this.useJit;
    }

    public final int getVolume() {
        return this.volume;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int e = xg6.e(Boolean.hashCode(this.useCustomBios) * 31, this.showBootScreen, 31);
        Uri uri = this.dsBios7Uri;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        Uri uri2 = this.dsBios9Uri;
        if (uri2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Uri uri3 = this.dsFirmwareUri;
        if (uri3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uri3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Uri uri4 = this.dsiBios7Uri;
        if (uri4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = uri4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Uri uri5 = this.dsiBios9Uri;
        if (uri5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = uri5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Uri uri6 = this.dsiFirmwareUri;
        if (uri6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = uri6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Uri uri7 = this.dsiNandUri;
        if (uri7 != null) {
            i = uri7.hashCode();
        }
        int e2 = xg6.e((this.consoleType.hashCode() + xg6.e(xg6.e(lb1.a(this.rewindWindowSeconds, lb1.a(this.rewindPeriodSeconds, xg6.e(xg6.a(this.frameLimitSpeedMultiplier, xg6.a(this.fastForwardSpeedMultiplier, xg6.d((i7 + i) * 31, 31, this.internalDirectory), 31), 31), this.rewindEnabled, 31), 31), 31), this.useJit, 31), this.hgEngineFixEnabled, 31)) * 31, this.soundEnabled, 31);
        int a = lb1.a(this.volume, (this.audioBitrate.hashCode() + ((this.audioInterpolation.hashCode() + e2) * 31)) * 31, 31);
        int hashCode7 = this.micSource.hashCode();
        int hashCode8 = this.firmwareConfiguration.hashCode();
        int hashCode9 = this.rendererConfiguration.hashCode();
        return Long.hashCode(this.dsiWareAutoloadTitleId) + ((this.dldiSdCardConfiguration.hashCode() + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((this.audioLatency.hashCode() + a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        boolean z = this.useCustomBios;
        boolean z2 = this.showBootScreen;
        Uri uri = this.dsBios7Uri;
        Uri uri2 = this.dsBios9Uri;
        Uri uri3 = this.dsFirmwareUri;
        Uri uri4 = this.dsiBios7Uri;
        Uri uri5 = this.dsiBios9Uri;
        Uri uri6 = this.dsiFirmwareUri;
        Uri uri7 = this.dsiNandUri;
        String str = this.internalDirectory;
        float f = this.fastForwardSpeedMultiplier;
        float f2 = this.frameLimitSpeedMultiplier;
        boolean z3 = this.rewindEnabled;
        int i = this.rewindPeriodSeconds;
        int i2 = this.rewindWindowSeconds;
        boolean z4 = this.useJit;
        boolean z5 = this.hgEngineFixEnabled;
        ConsoleType consoleType = this.consoleType;
        boolean z6 = this.soundEnabled;
        AudioInterpolation audioInterpolation = this.audioInterpolation;
        AudioBitrate audioBitrate = this.audioBitrate;
        int i3 = this.volume;
        AudioLatency audioLatency = this.audioLatency;
        MicSource micSource = this.micSource;
        FirmwareConfiguration firmwareConfiguration = this.firmwareConfiguration;
        RendererConfiguration rendererConfiguration = this.rendererConfiguration;
        DldiSdCardConfiguration dldiSdCardConfiguration = this.dldiSdCardConfiguration;
        long j = this.dsiWareAutoloadTitleId;
        return "EmulatorConfiguration(useCustomBios=" + z + ", showBootScreen=" + z2 + ", dsBios7Uri=" + uri + ", dsBios9Uri=" + uri2 + ", dsFirmwareUri=" + uri3 + ", dsiBios7Uri=" + uri4 + ", dsiBios9Uri=" + uri5 + ", dsiFirmwareUri=" + uri6 + ", dsiNandUri=" + uri7 + ", internalDirectory=" + str + ", fastForwardSpeedMultiplier=" + f + ", frameLimitSpeedMultiplier=" + f2 + ", rewindEnabled=" + z3 + ", rewindPeriodSeconds=" + i + ", rewindWindowSeconds=" + i2 + ", useJit=" + z4 + ", hgEngineFixEnabled=" + z5 + ", consoleType=" + consoleType + ", soundEnabled=" + z6 + ", audioInterpolation=" + audioInterpolation + ", audioBitrate=" + audioBitrate + ", volume=" + i3 + ", audioLatency=" + audioLatency + ", micSource=" + micSource + ", firmwareConfiguration=" + firmwareConfiguration + ", rendererConfiguration=" + rendererConfiguration + ", dldiSdCardConfiguration=" + dldiSdCardConfiguration + ", dsiWareAutoloadTitleId=" + j + ")";
    }

    public /* synthetic */ EmulatorConfiguration(boolean z, boolean z2, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, String str, float f, float f2, boolean z3, int i, int i2, boolean z4, boolean z5, ConsoleType consoleType, boolean z6, AudioInterpolation audioInterpolation, AudioBitrate audioBitrate, int i3, AudioLatency audioLatency, MicSource micSource, FirmwareConfiguration firmwareConfiguration, RendererConfiguration rendererConfiguration, DldiSdCardConfiguration dldiSdCardConfiguration, long j, int i4, id1 id1Var) {
        this(z, z2, uri, uri2, uri3, uri4, uri5, uri6, uri7, str, f, f2, z3, i, i2, z4, z5, consoleType, z6, audioInterpolation, audioBitrate, i3, audioLatency, micSource, firmwareConfiguration, rendererConfiguration, dldiSdCardConfiguration, (i4 & 134217728) != 0 ? 0L : j);
    }
}
