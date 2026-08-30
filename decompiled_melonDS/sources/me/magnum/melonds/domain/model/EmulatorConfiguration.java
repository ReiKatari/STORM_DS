package me.magnum.melonds.domain.model;

import android.net.Uri;
import nc.k;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class EmulatorConfiguration {
    public static final int $stable = 8;
    private final AudioBitrate audioBitrate;
    private final AudioInterpolation audioInterpolation;
    private final AudioLatency audioLatency;
    private final ConsoleType consoleType;
    private final Uri dsBios7Uri;
    private final Uri dsBios9Uri;
    private final Uri dsFirmwareUri;
    private final Uri dsiBios7Uri;
    private final Uri dsiBios9Uri;
    private final Uri dsiFirmwareUri;
    private final Uri dsiNandUri;
    private final float fastForwardSpeedMultiplier;
    private final FirmwareConfiguration firmwareConfiguration;
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

    public EmulatorConfiguration(boolean z10, boolean z11, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, String str, float f8, boolean z12, int i2, int i10, boolean z13, ConsoleType consoleType, boolean z14, AudioInterpolation audioInterpolation, AudioBitrate audioBitrate, int i11, AudioLatency audioLatency, MicSource micSource, FirmwareConfiguration firmwareConfiguration, RendererConfiguration rendererConfiguration) {
        str.getClass();
        consoleType.getClass();
        audioInterpolation.getClass();
        audioBitrate.getClass();
        audioLatency.getClass();
        micSource.getClass();
        firmwareConfiguration.getClass();
        rendererConfiguration.getClass();
        this.useCustomBios = z10;
        this.showBootScreen = z11;
        this.dsBios7Uri = uri;
        this.dsBios9Uri = uri2;
        this.dsFirmwareUri = uri3;
        this.dsiBios7Uri = uri4;
        this.dsiBios9Uri = uri5;
        this.dsiFirmwareUri = uri6;
        this.dsiNandUri = uri7;
        this.internalDirectory = str;
        this.fastForwardSpeedMultiplier = f8;
        this.rewindEnabled = z12;
        this.rewindPeriodSeconds = i2;
        this.rewindWindowSeconds = i10;
        this.useJit = z13;
        this.consoleType = consoleType;
        this.soundEnabled = z14;
        this.audioInterpolation = audioInterpolation;
        this.audioBitrate = audioBitrate;
        this.volume = i11;
        this.audioLatency = audioLatency;
        this.micSource = micSource;
        this.firmwareConfiguration = firmwareConfiguration;
        this.rendererConfiguration = rendererConfiguration;
    }

    public static /* synthetic */ EmulatorConfiguration copy$default(EmulatorConfiguration emulatorConfiguration, boolean z10, boolean z11, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, String str, float f8, boolean z12, int i2, int i10, boolean z13, ConsoleType consoleType, boolean z14, AudioInterpolation audioInterpolation, AudioBitrate audioBitrate, int i11, AudioLatency audioLatency, MicSource micSource, FirmwareConfiguration firmwareConfiguration, RendererConfiguration rendererConfiguration, int i12, Object obj) {
        RendererConfiguration rendererConfiguration2;
        FirmwareConfiguration firmwareConfiguration2;
        boolean z15 = (i12 & 1) != 0 ? emulatorConfiguration.useCustomBios : z10;
        boolean z16 = (i12 & 2) != 0 ? emulatorConfiguration.showBootScreen : z11;
        Uri uri8 = (i12 & 4) != 0 ? emulatorConfiguration.dsBios7Uri : uri;
        Uri uri9 = (i12 & 8) != 0 ? emulatorConfiguration.dsBios9Uri : uri2;
        Uri uri10 = (i12 & 16) != 0 ? emulatorConfiguration.dsFirmwareUri : uri3;
        Uri uri11 = (i12 & 32) != 0 ? emulatorConfiguration.dsiBios7Uri : uri4;
        Uri uri12 = (i12 & 64) != 0 ? emulatorConfiguration.dsiBios9Uri : uri5;
        Uri uri13 = (i12 & 128) != 0 ? emulatorConfiguration.dsiFirmwareUri : uri6;
        Uri uri14 = (i12 & 256) != 0 ? emulatorConfiguration.dsiNandUri : uri7;
        String str2 = (i12 & 512) != 0 ? emulatorConfiguration.internalDirectory : str;
        float f10 = (i12 & 1024) != 0 ? emulatorConfiguration.fastForwardSpeedMultiplier : f8;
        boolean z17 = (i12 & 2048) != 0 ? emulatorConfiguration.rewindEnabled : z12;
        int i13 = (i12 & 4096) != 0 ? emulatorConfiguration.rewindPeriodSeconds : i2;
        int i14 = (i12 & 8192) != 0 ? emulatorConfiguration.rewindWindowSeconds : i10;
        boolean z18 = z15;
        boolean z19 = (i12 & 16384) != 0 ? emulatorConfiguration.useJit : z13;
        ConsoleType consoleType2 = (i12 & 32768) != 0 ? emulatorConfiguration.consoleType : consoleType;
        boolean z20 = (i12 & 65536) != 0 ? emulatorConfiguration.soundEnabled : z14;
        AudioInterpolation audioInterpolation2 = (i12 & 131072) != 0 ? emulatorConfiguration.audioInterpolation : audioInterpolation;
        AudioBitrate audioBitrate2 = (i12 & 262144) != 0 ? emulatorConfiguration.audioBitrate : audioBitrate;
        int i15 = (i12 & 524288) != 0 ? emulatorConfiguration.volume : i11;
        AudioLatency audioLatency2 = (i12 & 1048576) != 0 ? emulatorConfiguration.audioLatency : audioLatency;
        MicSource micSource2 = (i12 & 2097152) != 0 ? emulatorConfiguration.micSource : micSource;
        FirmwareConfiguration firmwareConfiguration3 = (i12 & 4194304) != 0 ? emulatorConfiguration.firmwareConfiguration : firmwareConfiguration;
        if ((i12 & 8388608) != 0) {
            firmwareConfiguration2 = firmwareConfiguration3;
            rendererConfiguration2 = emulatorConfiguration.rendererConfiguration;
        } else {
            rendererConfiguration2 = rendererConfiguration;
            firmwareConfiguration2 = firmwareConfiguration3;
        }
        return emulatorConfiguration.copy(z18, z16, uri8, uri9, uri10, uri11, uri12, uri13, uri14, str2, f10, z17, i13, i14, z19, consoleType2, z20, audioInterpolation2, audioBitrate2, i15, audioLatency2, micSource2, firmwareConfiguration2, rendererConfiguration2);
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

    public final boolean component12() {
        return this.rewindEnabled;
    }

    public final int component13() {
        return this.rewindPeriodSeconds;
    }

    public final int component14() {
        return this.rewindWindowSeconds;
    }

    public final boolean component15() {
        return this.useJit;
    }

    public final ConsoleType component16() {
        return this.consoleType;
    }

    public final boolean component17() {
        return this.soundEnabled;
    }

    public final AudioInterpolation component18() {
        return this.audioInterpolation;
    }

    public final AudioBitrate component19() {
        return this.audioBitrate;
    }

    public final boolean component2() {
        return this.showBootScreen;
    }

    public final int component20() {
        return this.volume;
    }

    public final AudioLatency component21() {
        return this.audioLatency;
    }

    public final MicSource component22() {
        return this.micSource;
    }

    public final FirmwareConfiguration component23() {
        return this.firmwareConfiguration;
    }

    public final RendererConfiguration component24() {
        return this.rendererConfiguration;
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

    public final EmulatorConfiguration copy(boolean z10, boolean z11, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, String str, float f8, boolean z12, int i2, int i10, boolean z13, ConsoleType consoleType, boolean z14, AudioInterpolation audioInterpolation, AudioBitrate audioBitrate, int i11, AudioLatency audioLatency, MicSource micSource, FirmwareConfiguration firmwareConfiguration, RendererConfiguration rendererConfiguration) {
        str.getClass();
        consoleType.getClass();
        audioInterpolation.getClass();
        audioBitrate.getClass();
        audioLatency.getClass();
        micSource.getClass();
        firmwareConfiguration.getClass();
        rendererConfiguration.getClass();
        return new EmulatorConfiguration(z10, z11, uri, uri2, uri3, uri4, uri5, uri6, uri7, str, f8, z12, i2, i10, z13, consoleType, z14, audioInterpolation, audioBitrate, i11, audioLatency, micSource, firmwareConfiguration, rendererConfiguration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmulatorConfiguration)) {
            return false;
        }
        EmulatorConfiguration emulatorConfiguration = (EmulatorConfiguration) obj;
        if (this.useCustomBios == emulatorConfiguration.useCustomBios && this.showBootScreen == emulatorConfiguration.showBootScreen && k.a(this.dsBios7Uri, emulatorConfiguration.dsBios7Uri) && k.a(this.dsBios9Uri, emulatorConfiguration.dsBios9Uri) && k.a(this.dsFirmwareUri, emulatorConfiguration.dsFirmwareUri) && k.a(this.dsiBios7Uri, emulatorConfiguration.dsiBios7Uri) && k.a(this.dsiBios9Uri, emulatorConfiguration.dsiBios9Uri) && k.a(this.dsiFirmwareUri, emulatorConfiguration.dsiFirmwareUri) && k.a(this.dsiNandUri, emulatorConfiguration.dsiNandUri) && k.a(this.internalDirectory, emulatorConfiguration.internalDirectory) && Float.compare(this.fastForwardSpeedMultiplier, emulatorConfiguration.fastForwardSpeedMultiplier) == 0 && this.rewindEnabled == emulatorConfiguration.rewindEnabled && this.rewindPeriodSeconds == emulatorConfiguration.rewindPeriodSeconds && this.rewindWindowSeconds == emulatorConfiguration.rewindWindowSeconds && this.useJit == emulatorConfiguration.useJit && this.consoleType == emulatorConfiguration.consoleType && this.soundEnabled == emulatorConfiguration.soundEnabled && this.audioInterpolation == emulatorConfiguration.audioInterpolation && this.audioBitrate == emulatorConfiguration.audioBitrate && this.volume == emulatorConfiguration.volume && this.audioLatency == emulatorConfiguration.audioLatency && this.micSource == emulatorConfiguration.micSource && k.a(this.firmwareConfiguration, emulatorConfiguration.firmwareConfiguration) && k.a(this.rendererConfiguration, emulatorConfiguration.rendererConfiguration)) {
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

    public final float getFastForwardSpeedMultiplier() {
        return this.fastForwardSpeedMultiplier;
    }

    public final FirmwareConfiguration getFirmwareConfiguration() {
        return this.firmwareConfiguration;
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
        int e6 = d.e(Boolean.hashCode(this.useCustomBios) * 31, this.showBootScreen, 31);
        Uri uri = this.dsBios7Uri;
        int i2 = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = (e6 + hashCode) * 31;
        Uri uri2 = this.dsBios9Uri;
        if (uri2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Uri uri3 = this.dsFirmwareUri;
        if (uri3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uri3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Uri uri4 = this.dsiBios7Uri;
        if (uri4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = uri4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Uri uri5 = this.dsiBios9Uri;
        if (uri5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = uri5.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Uri uri6 = this.dsiFirmwareUri;
        if (uri6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = uri6.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Uri uri7 = this.dsiNandUri;
        if (uri7 != null) {
            i2 = uri7.hashCode();
        }
        int e10 = d.e((this.consoleType.hashCode() + d.e(d.c(this.rewindWindowSeconds, d.c(this.rewindPeriodSeconds, d.e(d.b(this.fastForwardSpeedMultiplier, d.d((i15 + i2) * 31, 31, this.internalDirectory), 31), this.rewindEnabled, 31), 31), 31), this.useJit, 31)) * 31, this.soundEnabled, 31);
        int c4 = d.c(this.volume, (this.audioBitrate.hashCode() + ((this.audioInterpolation.hashCode() + e10) * 31)) * 31, 31);
        int hashCode7 = this.micSource.hashCode();
        return this.rendererConfiguration.hashCode() + ((this.firmwareConfiguration.hashCode() + ((hashCode7 + ((this.audioLatency.hashCode() + c4) * 31)) * 31)) * 31);
    }

    public String toString() {
        boolean z10 = this.useCustomBios;
        boolean z11 = this.showBootScreen;
        Uri uri = this.dsBios7Uri;
        Uri uri2 = this.dsBios9Uri;
        Uri uri3 = this.dsFirmwareUri;
        Uri uri4 = this.dsiBios7Uri;
        Uri uri5 = this.dsiBios9Uri;
        Uri uri6 = this.dsiFirmwareUri;
        Uri uri7 = this.dsiNandUri;
        String str = this.internalDirectory;
        float f8 = this.fastForwardSpeedMultiplier;
        boolean z12 = this.rewindEnabled;
        int i2 = this.rewindPeriodSeconds;
        int i10 = this.rewindWindowSeconds;
        boolean z13 = this.useJit;
        ConsoleType consoleType = this.consoleType;
        boolean z14 = this.soundEnabled;
        AudioInterpolation audioInterpolation = this.audioInterpolation;
        AudioBitrate audioBitrate = this.audioBitrate;
        int i11 = this.volume;
        AudioLatency audioLatency = this.audioLatency;
        MicSource micSource = this.micSource;
        FirmwareConfiguration firmwareConfiguration = this.firmwareConfiguration;
        RendererConfiguration rendererConfiguration = this.rendererConfiguration;
        return "EmulatorConfiguration(useCustomBios=" + z10 + ", showBootScreen=" + z11 + ", dsBios7Uri=" + uri + ", dsBios9Uri=" + uri2 + ", dsFirmwareUri=" + uri3 + ", dsiBios7Uri=" + uri4 + ", dsiBios9Uri=" + uri5 + ", dsiFirmwareUri=" + uri6 + ", dsiNandUri=" + uri7 + ", internalDirectory=" + str + ", fastForwardSpeedMultiplier=" + f8 + ", rewindEnabled=" + z12 + ", rewindPeriodSeconds=" + i2 + ", rewindWindowSeconds=" + i10 + ", useJit=" + z13 + ", consoleType=" + consoleType + ", soundEnabled=" + z14 + ", audioInterpolation=" + audioInterpolation + ", audioBitrate=" + audioBitrate + ", volume=" + i11 + ", audioLatency=" + audioLatency + ", micSource=" + micSource + ", firmwareConfiguration=" + firmwareConfiguration + ", rendererConfiguration=" + rendererConfiguration + ")";
    }
}
