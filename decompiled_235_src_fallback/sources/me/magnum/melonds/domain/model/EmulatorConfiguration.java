package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class EmulatorConfiguration {
    public static final int $stable = 8;
    private final me.magnum.melonds.domain.model.AudioBitrate audioBitrate;
    private final me.magnum.melonds.domain.model.AudioInterpolation audioInterpolation;
    private final me.magnum.melonds.domain.model.AudioLatency audioLatency;
    private final me.magnum.melonds.domain.model.ConsoleType consoleType;
    private final me.magnum.melonds.domain.model.DldiSdCardConfiguration dldiSdCardConfiguration;
    private final android.net.Uri dsBios7Uri;
    private final android.net.Uri dsBios9Uri;
    private final android.net.Uri dsFirmwareUri;
    private final android.net.Uri dsiBios7Uri;
    private final android.net.Uri dsiBios9Uri;
    private final android.net.Uri dsiFirmwareUri;
    private final android.net.Uri dsiNandUri;
    private final long dsiWareAutoloadTitleId;
    private final float fastForwardSpeedMultiplier;
    private final me.magnum.melonds.domain.model.FirmwareConfiguration firmwareConfiguration;
    private final float frameLimitSpeedMultiplier;
    private final boolean hgEngineFixEnabled;
    private final java.lang.String internalDirectory;
    private final me.magnum.melonds.domain.model.MicSource micSource;
    private final me.magnum.melonds.domain.model.RendererConfiguration rendererConfiguration;
    private final boolean rewindEnabled;
    private final int rewindPeriodSeconds;
    private final int rewindWindowSeconds;
    private final boolean showBootScreen;
    private final boolean soundEnabled;
    private final boolean useCustomBios;
    private final boolean useJit;
    private final int volume;

    public EmulatorConfiguration(boolean r1, boolean r2, android.net.Uri r3, android.net.Uri r4, android.net.Uri r5, android.net.Uri r6, android.net.Uri r7, android.net.Uri r8, android.net.Uri r9, java.lang.String r10, float r11, float r12, boolean r13, int r14, int r15, boolean r16, boolean r17, me.magnum.melonds.domain.model.ConsoleType r18, boolean r19, me.magnum.melonds.domain.model.AudioInterpolation r20, me.magnum.melonds.domain.model.AudioBitrate r21, int r22, me.magnum.melonds.domain.model.AudioLatency r23, me.magnum.melonds.domain.model.MicSource r24, me.magnum.melonds.domain.model.FirmwareConfiguration r25, me.magnum.melonds.domain.model.RendererConfiguration r26, me.magnum.melonds.domain.model.DldiSdCardConfiguration r27, long r28) {
            r0 = this;
            r10.getClass()
            r18.getClass()
            r20.getClass()
            r21.getClass()
            r23.getClass()
            r24.getClass()
            r25.getClass()
            r26.getClass()
            r27.getClass()
            r0.<init>()
            r0.useCustomBios = r1
            r0.showBootScreen = r2
            r0.dsBios7Uri = r3
            r0.dsBios9Uri = r4
            r0.dsFirmwareUri = r5
            r0.dsiBios7Uri = r6
            r0.dsiBios9Uri = r7
            r0.dsiFirmwareUri = r8
            r0.dsiNandUri = r9
            r0.internalDirectory = r10
            r0.fastForwardSpeedMultiplier = r11
            r0.frameLimitSpeedMultiplier = r12
            r0.rewindEnabled = r13
            r0.rewindPeriodSeconds = r14
            r0.rewindWindowSeconds = r15
            r1 = r16
            r0.useJit = r1
            r1 = r17
            r0.hgEngineFixEnabled = r1
            r1 = r18
            r0.consoleType = r1
            r1 = r19
            r0.soundEnabled = r1
            r1 = r20
            r0.audioInterpolation = r1
            r1 = r21
            r0.audioBitrate = r1
            r1 = r22
            r0.volume = r1
            r1 = r23
            r0.audioLatency = r1
            r1 = r24
            r0.micSource = r1
            r1 = r25
            r0.firmwareConfiguration = r1
            r1 = r26
            r0.rendererConfiguration = r1
            r1 = r27
            r0.dldiSdCardConfiguration = r1
            r1 = r28
            r0.dsiWareAutoloadTitleId = r1
            return
    }

    public /* synthetic */ EmulatorConfiguration(boolean r33, boolean r34, android.net.Uri r35, android.net.Uri r36, android.net.Uri r37, android.net.Uri r38, android.net.Uri r39, android.net.Uri r40, android.net.Uri r41, java.lang.String r42, float r43, float r44, boolean r45, int r46, int r47, boolean r48, boolean r49, me.magnum.melonds.domain.model.ConsoleType r50, boolean r51, me.magnum.melonds.domain.model.AudioInterpolation r52, me.magnum.melonds.domain.model.AudioBitrate r53, int r54, me.magnum.melonds.domain.model.AudioLatency r55, me.magnum.melonds.domain.model.MicSource r56, me.magnum.melonds.domain.model.FirmwareConfiguration r57, me.magnum.melonds.domain.model.RendererConfiguration r58, me.magnum.melonds.domain.model.DldiSdCardConfiguration r59, long r60, int r62, defpackage.id1 r63) {
            r32 = this;
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r62 & r0
            if (r0 == 0) goto L43
            r0 = 0
            r30 = r0
        La:
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r12 = r42
            r13 = r43
            r14 = r44
            r15 = r45
            r16 = r46
            r17 = r47
            r18 = r48
            r19 = r49
            r20 = r50
            r21 = r51
            r22 = r52
            r23 = r53
            r24 = r54
            r25 = r55
            r26 = r56
            r27 = r57
            r28 = r58
            r29 = r59
            goto L46
        L43:
            r30 = r60
            goto La
        L46:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.EmulatorConfiguration copy$default(me.magnum.melonds.domain.model.EmulatorConfiguration r17, boolean r18, boolean r19, android.net.Uri r20, android.net.Uri r21, android.net.Uri r22, android.net.Uri r23, android.net.Uri r24, android.net.Uri r25, android.net.Uri r26, java.lang.String r27, float r28, float r29, boolean r30, int r31, int r32, boolean r33, boolean r34, me.magnum.melonds.domain.model.ConsoleType r35, boolean r36, me.magnum.melonds.domain.model.AudioInterpolation r37, me.magnum.melonds.domain.model.AudioBitrate r38, int r39, me.magnum.melonds.domain.model.AudioLatency r40, me.magnum.melonds.domain.model.MicSource r41, me.magnum.melonds.domain.model.FirmwareConfiguration r42, me.magnum.melonds.domain.model.RendererConfiguration r43, me.magnum.melonds.domain.model.DldiSdCardConfiguration r44, long r45, int r47, java.lang.Object r48) {
            r0 = r17
            r1 = r47
            r2 = r1 & 1
            if (r2 == 0) goto Lb
            boolean r2 = r0.useCustomBios
            goto Ld
        Lb:
            r2 = r18
        Ld:
            r3 = r1 & 2
            if (r3 == 0) goto L14
            boolean r3 = r0.showBootScreen
            goto L16
        L14:
            r3 = r19
        L16:
            r4 = r1 & 4
            if (r4 == 0) goto L1d
            android.net.Uri r4 = r0.dsBios7Uri
            goto L1f
        L1d:
            r4 = r20
        L1f:
            r5 = r1 & 8
            if (r5 == 0) goto L26
            android.net.Uri r5 = r0.dsBios9Uri
            goto L28
        L26:
            r5 = r21
        L28:
            r6 = r1 & 16
            if (r6 == 0) goto L2f
            android.net.Uri r6 = r0.dsFirmwareUri
            goto L31
        L2f:
            r6 = r22
        L31:
            r7 = r1 & 32
            if (r7 == 0) goto L38
            android.net.Uri r7 = r0.dsiBios7Uri
            goto L3a
        L38:
            r7 = r23
        L3a:
            r8 = r1 & 64
            if (r8 == 0) goto L41
            android.net.Uri r8 = r0.dsiBios9Uri
            goto L43
        L41:
            r8 = r24
        L43:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4a
            android.net.Uri r9 = r0.dsiFirmwareUri
            goto L4c
        L4a:
            r9 = r25
        L4c:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L53
            android.net.Uri r10 = r0.dsiNandUri
            goto L55
        L53:
            r10 = r26
        L55:
            r11 = r1 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L5c
            java.lang.String r11 = r0.internalDirectory
            goto L5e
        L5c:
            r11 = r27
        L5e:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L65
            float r12 = r0.fastForwardSpeedMultiplier
            goto L67
        L65:
            r12 = r28
        L67:
            r13 = r1 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L6e
            float r13 = r0.frameLimitSpeedMultiplier
            goto L70
        L6e:
            r13 = r29
        L70:
            r14 = r1 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L77
            boolean r14 = r0.rewindEnabled
            goto L79
        L77:
            r14 = r30
        L79:
            r15 = r1 & 8192(0x2000, float:1.148E-41)
            if (r15 == 0) goto L80
            int r15 = r0.rewindPeriodSeconds
            goto L82
        L80:
            r15 = r31
        L82:
            r18 = r2
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L8b
            int r2 = r0.rewindWindowSeconds
            goto L8d
        L8b:
            r2 = r32
        L8d:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r1 & r16
            if (r16 == 0) goto L97
            boolean r1 = r0.useJit
            goto L99
        L97:
            r1 = r33
        L99:
            r16 = 65536(0x10000, float:9.1835E-41)
            r16 = r47 & r16
            r19 = r1
            if (r16 == 0) goto La4
            boolean r1 = r0.hgEngineFixEnabled
            goto La6
        La4:
            r1 = r34
        La6:
            r16 = 131072(0x20000, float:1.83671E-40)
            r16 = r47 & r16
            r20 = r1
            if (r16 == 0) goto Lb1
            me.magnum.melonds.domain.model.ConsoleType r1 = r0.consoleType
            goto Lb3
        Lb1:
            r1 = r35
        Lb3:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r47 & r16
            r21 = r1
            if (r16 == 0) goto Lbe
            boolean r1 = r0.soundEnabled
            goto Lc0
        Lbe:
            r1 = r36
        Lc0:
            r16 = 524288(0x80000, float:7.34684E-40)
            r16 = r47 & r16
            r22 = r1
            if (r16 == 0) goto Lcb
            me.magnum.melonds.domain.model.AudioInterpolation r1 = r0.audioInterpolation
            goto Lcd
        Lcb:
            r1 = r37
        Lcd:
            r16 = 1048576(0x100000, float:1.469368E-39)
            r16 = r47 & r16
            r23 = r1
            if (r16 == 0) goto Ld8
            me.magnum.melonds.domain.model.AudioBitrate r1 = r0.audioBitrate
            goto Lda
        Ld8:
            r1 = r38
        Lda:
            r16 = 2097152(0x200000, float:2.938736E-39)
            r16 = r47 & r16
            r24 = r1
            if (r16 == 0) goto Le5
            int r1 = r0.volume
            goto Le7
        Le5:
            r1 = r39
        Le7:
            r16 = 4194304(0x400000, float:5.877472E-39)
            r16 = r47 & r16
            r25 = r1
            if (r16 == 0) goto Lf2
            me.magnum.melonds.domain.model.AudioLatency r1 = r0.audioLatency
            goto Lf4
        Lf2:
            r1 = r40
        Lf4:
            r16 = 8388608(0x800000, float:1.1754944E-38)
            r16 = r47 & r16
            r26 = r1
            if (r16 == 0) goto Lff
            me.magnum.melonds.domain.model.MicSource r1 = r0.micSource
            goto L101
        Lff:
            r1 = r41
        L101:
            r16 = 16777216(0x1000000, float:2.3509887E-38)
            r16 = r47 & r16
            r27 = r1
            if (r16 == 0) goto L10c
            me.magnum.melonds.domain.model.FirmwareConfiguration r1 = r0.firmwareConfiguration
            goto L10e
        L10c:
            r1 = r42
        L10e:
            r16 = 33554432(0x2000000, float:9.403955E-38)
            r16 = r47 & r16
            r28 = r1
            if (r16 == 0) goto L119
            me.magnum.melonds.domain.model.RendererConfiguration r1 = r0.rendererConfiguration
            goto L11b
        L119:
            r1 = r43
        L11b:
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            r16 = r47 & r16
            r29 = r1
            if (r16 == 0) goto L126
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r1 = r0.dldiSdCardConfiguration
            goto L128
        L126:
            r1 = r44
        L128:
            r16 = 134217728(0x8000000, float:3.85186E-34)
            r16 = r47 & r16
            if (r16 == 0) goto L16f
            r31 = r1
            r30 = r2
            long r1 = r0.dsiWareAutoloadTitleId
            r33 = r30
            r45 = r31
            r46 = r1
        L13a:
            r34 = r19
            r35 = r20
            r36 = r21
            r37 = r22
            r38 = r23
            r39 = r24
            r40 = r25
            r41 = r26
            r42 = r27
            r43 = r28
            r44 = r29
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r19 = r18
            r18 = r0
            goto L176
        L16f:
            r46 = r45
            r45 = r1
            r33 = r2
            goto L13a
        L176:
            me.magnum.melonds.domain.model.EmulatorConfiguration r0 = r18.copy(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return r0
    }

    public final boolean component1() {
            r0 = this;
            boolean r0 = r0.useCustomBios
            return r0
    }

    public final java.lang.String component10() {
            r0 = this;
            java.lang.String r0 = r0.internalDirectory
            return r0
    }

    public final float component11() {
            r0 = this;
            float r0 = r0.fastForwardSpeedMultiplier
            return r0
    }

    public final float component12() {
            r0 = this;
            float r0 = r0.frameLimitSpeedMultiplier
            return r0
    }

    public final boolean component13() {
            r0 = this;
            boolean r0 = r0.rewindEnabled
            return r0
    }

    public final int component14() {
            r0 = this;
            int r0 = r0.rewindPeriodSeconds
            return r0
    }

    public final int component15() {
            r0 = this;
            int r0 = r0.rewindWindowSeconds
            return r0
    }

    public final boolean component16() {
            r0 = this;
            boolean r0 = r0.useJit
            return r0
    }

    public final boolean component17() {
            r0 = this;
            boolean r0 = r0.hgEngineFixEnabled
            return r0
    }

    public final me.magnum.melonds.domain.model.ConsoleType component18() {
            r0 = this;
            me.magnum.melonds.domain.model.ConsoleType r0 = r0.consoleType
            return r0
    }

    public final boolean component19() {
            r0 = this;
            boolean r0 = r0.soundEnabled
            return r0
    }

    public final boolean component2() {
            r0 = this;
            boolean r0 = r0.showBootScreen
            return r0
    }

    public final me.magnum.melonds.domain.model.AudioInterpolation component20() {
            r0 = this;
            me.magnum.melonds.domain.model.AudioInterpolation r0 = r0.audioInterpolation
            return r0
    }

    public final me.magnum.melonds.domain.model.AudioBitrate component21() {
            r0 = this;
            me.magnum.melonds.domain.model.AudioBitrate r0 = r0.audioBitrate
            return r0
    }

    public final int component22() {
            r0 = this;
            int r0 = r0.volume
            return r0
    }

    public final me.magnum.melonds.domain.model.AudioLatency component23() {
            r0 = this;
            me.magnum.melonds.domain.model.AudioLatency r0 = r0.audioLatency
            return r0
    }

    public final me.magnum.melonds.domain.model.MicSource component24() {
            r0 = this;
            me.magnum.melonds.domain.model.MicSource r0 = r0.micSource
            return r0
    }

    public final me.magnum.melonds.domain.model.FirmwareConfiguration component25() {
            r0 = this;
            me.magnum.melonds.domain.model.FirmwareConfiguration r0 = r0.firmwareConfiguration
            return r0
    }

    public final me.magnum.melonds.domain.model.RendererConfiguration component26() {
            r0 = this;
            me.magnum.melonds.domain.model.RendererConfiguration r0 = r0.rendererConfiguration
            return r0
    }

    public final me.magnum.melonds.domain.model.DldiSdCardConfiguration component27() {
            r0 = this;
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r0 = r0.dldiSdCardConfiguration
            return r0
    }

    public final long component28() {
            r2 = this;
            long r0 = r2.dsiWareAutoloadTitleId
            return r0
    }

    public final android.net.Uri component3() {
            r0 = this;
            android.net.Uri r0 = r0.dsBios7Uri
            return r0
    }

    public final android.net.Uri component4() {
            r0 = this;
            android.net.Uri r0 = r0.dsBios9Uri
            return r0
    }

    public final android.net.Uri component5() {
            r0 = this;
            android.net.Uri r0 = r0.dsFirmwareUri
            return r0
    }

    public final android.net.Uri component6() {
            r0 = this;
            android.net.Uri r0 = r0.dsiBios7Uri
            return r0
    }

    public final android.net.Uri component7() {
            r0 = this;
            android.net.Uri r0 = r0.dsiBios9Uri
            return r0
    }

    public final android.net.Uri component8() {
            r0 = this;
            android.net.Uri r0 = r0.dsiFirmwareUri
            return r0
    }

    public final android.net.Uri component9() {
            r0 = this;
            android.net.Uri r0 = r0.dsiNandUri
            return r0
    }

    public final me.magnum.melonds.domain.model.EmulatorConfiguration copy(boolean r31, boolean r32, android.net.Uri r33, android.net.Uri r34, android.net.Uri r35, android.net.Uri r36, android.net.Uri r37, android.net.Uri r38, android.net.Uri r39, java.lang.String r40, float r41, float r42, boolean r43, int r44, int r45, boolean r46, boolean r47, me.magnum.melonds.domain.model.ConsoleType r48, boolean r49, me.magnum.melonds.domain.model.AudioInterpolation r50, me.magnum.melonds.domain.model.AudioBitrate r51, int r52, me.magnum.melonds.domain.model.AudioLatency r53, me.magnum.melonds.domain.model.MicSource r54, me.magnum.melonds.domain.model.FirmwareConfiguration r55, me.magnum.melonds.domain.model.RendererConfiguration r56, me.magnum.melonds.domain.model.DldiSdCardConfiguration r57, long r58) {
            r30 = this;
            r40.getClass()
            r48.getClass()
            r50.getClass()
            r51.getClass()
            r53.getClass()
            r54.getClass()
            r55.getClass()
            r56.getClass()
            r57.getClass()
            me.magnum.melonds.domain.model.EmulatorConfiguration r0 = new me.magnum.melonds.domain.model.EmulatorConfiguration
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r12 = r42
            r13 = r43
            r14 = r44
            r15 = r45
            r16 = r46
            r17 = r47
            r18 = r48
            r19 = r49
            r20 = r50
            r21 = r51
            r22 = r52
            r23 = r53
            r24 = r54
            r25 = r55
            r26 = r56
            r27 = r57
            r28 = r58
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof me.magnum.melonds.domain.model.EmulatorConfiguration
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.EmulatorConfiguration r6 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r6
            boolean r1 = r5.useCustomBios
            boolean r3 = r6.useCustomBios
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r5.showBootScreen
            boolean r3 = r6.showBootScreen
            if (r1 == r3) goto L1a
            return r2
        L1a:
            android.net.Uri r1 = r5.dsBios7Uri
            android.net.Uri r3 = r6.dsBios7Uri
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L25
            return r2
        L25:
            android.net.Uri r1 = r5.dsBios9Uri
            android.net.Uri r3 = r6.dsBios9Uri
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            android.net.Uri r1 = r5.dsFirmwareUri
            android.net.Uri r3 = r6.dsFirmwareUri
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L3b
            return r2
        L3b:
            android.net.Uri r1 = r5.dsiBios7Uri
            android.net.Uri r3 = r6.dsiBios7Uri
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L46
            return r2
        L46:
            android.net.Uri r1 = r5.dsiBios9Uri
            android.net.Uri r3 = r6.dsiBios9Uri
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            android.net.Uri r1 = r5.dsiFirmwareUri
            android.net.Uri r3 = r6.dsiFirmwareUri
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            android.net.Uri r1 = r5.dsiNandUri
            android.net.Uri r3 = r6.dsiNandUri
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L67
            return r2
        L67:
            java.lang.String r1 = r5.internalDirectory
            java.lang.String r3 = r6.internalDirectory
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L72
            return r2
        L72:
            float r1 = r5.fastForwardSpeedMultiplier
            float r3 = r6.fastForwardSpeedMultiplier
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L7d
            return r2
        L7d:
            float r1 = r5.frameLimitSpeedMultiplier
            float r3 = r6.frameLimitSpeedMultiplier
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L88
            return r2
        L88:
            boolean r1 = r5.rewindEnabled
            boolean r3 = r6.rewindEnabled
            if (r1 == r3) goto L8f
            return r2
        L8f:
            int r1 = r5.rewindPeriodSeconds
            int r3 = r6.rewindPeriodSeconds
            if (r1 == r3) goto L96
            return r2
        L96:
            int r1 = r5.rewindWindowSeconds
            int r3 = r6.rewindWindowSeconds
            if (r1 == r3) goto L9d
            return r2
        L9d:
            boolean r1 = r5.useJit
            boolean r3 = r6.useJit
            if (r1 == r3) goto La4
            return r2
        La4:
            boolean r1 = r5.hgEngineFixEnabled
            boolean r3 = r6.hgEngineFixEnabled
            if (r1 == r3) goto Lab
            return r2
        Lab:
            me.magnum.melonds.domain.model.ConsoleType r1 = r5.consoleType
            me.magnum.melonds.domain.model.ConsoleType r3 = r6.consoleType
            if (r1 == r3) goto Lb2
            return r2
        Lb2:
            boolean r1 = r5.soundEnabled
            boolean r3 = r6.soundEnabled
            if (r1 == r3) goto Lb9
            return r2
        Lb9:
            me.magnum.melonds.domain.model.AudioInterpolation r1 = r5.audioInterpolation
            me.magnum.melonds.domain.model.AudioInterpolation r3 = r6.audioInterpolation
            if (r1 == r3) goto Lc0
            return r2
        Lc0:
            me.magnum.melonds.domain.model.AudioBitrate r1 = r5.audioBitrate
            me.magnum.melonds.domain.model.AudioBitrate r3 = r6.audioBitrate
            if (r1 == r3) goto Lc7
            return r2
        Lc7:
            int r1 = r5.volume
            int r3 = r6.volume
            if (r1 == r3) goto Lce
            return r2
        Lce:
            me.magnum.melonds.domain.model.AudioLatency r1 = r5.audioLatency
            me.magnum.melonds.domain.model.AudioLatency r3 = r6.audioLatency
            if (r1 == r3) goto Ld5
            return r2
        Ld5:
            me.magnum.melonds.domain.model.MicSource r1 = r5.micSource
            me.magnum.melonds.domain.model.MicSource r3 = r6.micSource
            if (r1 == r3) goto Ldc
            return r2
        Ldc:
            me.magnum.melonds.domain.model.FirmwareConfiguration r1 = r5.firmwareConfiguration
            me.magnum.melonds.domain.model.FirmwareConfiguration r3 = r6.firmwareConfiguration
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto Le7
            return r2
        Le7:
            me.magnum.melonds.domain.model.RendererConfiguration r1 = r5.rendererConfiguration
            me.magnum.melonds.domain.model.RendererConfiguration r3 = r6.rendererConfiguration
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto Lf2
            return r2
        Lf2:
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r1 = r5.dldiSdCardConfiguration
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r3 = r6.dldiSdCardConfiguration
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto Lfd
            return r2
        Lfd:
            long r3 = r5.dsiWareAutoloadTitleId
            long r5 = r6.dsiWareAutoloadTitleId
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L106
            return r2
        L106:
            return r0
    }

    public final me.magnum.melonds.domain.model.AudioBitrate getAudioBitrate() {
            r0 = this;
            me.magnum.melonds.domain.model.AudioBitrate r0 = r0.audioBitrate
            return r0
    }

    public final me.magnum.melonds.domain.model.AudioInterpolation getAudioInterpolation() {
            r0 = this;
            me.magnum.melonds.domain.model.AudioInterpolation r0 = r0.audioInterpolation
            return r0
    }

    public final me.magnum.melonds.domain.model.AudioLatency getAudioLatency() {
            r0 = this;
            me.magnum.melonds.domain.model.AudioLatency r0 = r0.audioLatency
            return r0
    }

    public final me.magnum.melonds.domain.model.ConsoleType getConsoleType() {
            r0 = this;
            me.magnum.melonds.domain.model.ConsoleType r0 = r0.consoleType
            return r0
    }

    public final me.magnum.melonds.domain.model.DldiSdCardConfiguration getDldiSdCardConfiguration() {
            r0 = this;
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r0 = r0.dldiSdCardConfiguration
            return r0
    }

    public final android.net.Uri getDsBios7Uri() {
            r0 = this;
            android.net.Uri r0 = r0.dsBios7Uri
            return r0
    }

    public final android.net.Uri getDsBios9Uri() {
            r0 = this;
            android.net.Uri r0 = r0.dsBios9Uri
            return r0
    }

    public final android.net.Uri getDsFirmwareUri() {
            r0 = this;
            android.net.Uri r0 = r0.dsFirmwareUri
            return r0
    }

    public final android.net.Uri getDsiBios7Uri() {
            r0 = this;
            android.net.Uri r0 = r0.dsiBios7Uri
            return r0
    }

    public final android.net.Uri getDsiBios9Uri() {
            r0 = this;
            android.net.Uri r0 = r0.dsiBios9Uri
            return r0
    }

    public final android.net.Uri getDsiFirmwareUri() {
            r0 = this;
            android.net.Uri r0 = r0.dsiFirmwareUri
            return r0
    }

    public final android.net.Uri getDsiNandUri() {
            r0 = this;
            android.net.Uri r0 = r0.dsiNandUri
            return r0
    }

    public final long getDsiWareAutoloadTitleId() {
            r2 = this;
            long r0 = r2.dsiWareAutoloadTitleId
            return r0
    }

    public final float getFastForwardSpeedMultiplier() {
            r0 = this;
            float r0 = r0.fastForwardSpeedMultiplier
            return r0
    }

    public final me.magnum.melonds.domain.model.FirmwareConfiguration getFirmwareConfiguration() {
            r0 = this;
            me.magnum.melonds.domain.model.FirmwareConfiguration r0 = r0.firmwareConfiguration
            return r0
    }

    public final float getFrameLimitSpeedMultiplier() {
            r0 = this;
            float r0 = r0.frameLimitSpeedMultiplier
            return r0
    }

    public final boolean getHgEngineFixEnabled() {
            r0 = this;
            boolean r0 = r0.hgEngineFixEnabled
            return r0
    }

    public final java.lang.String getInternalDirectory() {
            r0 = this;
            java.lang.String r0 = r0.internalDirectory
            return r0
    }

    public final me.magnum.melonds.domain.model.MicSource getMicSource() {
            r0 = this;
            me.magnum.melonds.domain.model.MicSource r0 = r0.micSource
            return r0
    }

    public final me.magnum.melonds.domain.model.RendererConfiguration getRendererConfiguration() {
            r0 = this;
            me.magnum.melonds.domain.model.RendererConfiguration r0 = r0.rendererConfiguration
            return r0
    }

    public final boolean getRewindEnabled() {
            r0 = this;
            boolean r0 = r0.rewindEnabled
            return r0
    }

    public final int getRewindPeriodSeconds() {
            r0 = this;
            int r0 = r0.rewindPeriodSeconds
            return r0
    }

    public final int getRewindWindowSeconds() {
            r0 = this;
            int r0 = r0.rewindWindowSeconds
            return r0
    }

    public final boolean getShowBootScreen() {
            r0 = this;
            boolean r0 = r0.showBootScreen
            return r0
    }

    public final boolean getSoundEnabled() {
            r0 = this;
            boolean r0 = r0.soundEnabled
            return r0
    }

    public final boolean getUseCustomBios() {
            r0 = this;
            boolean r0 = r0.useCustomBios
            return r0
    }

    public final boolean getUseJit() {
            r0 = this;
            boolean r0 = r0.useJit
            return r0
    }

    public final int getVolume() {
            r0 = this;
            int r0 = r0.volume
            return r0
    }

    public int hashCode() {
            r4 = this;
            boolean r0 = r4.useCustomBios
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r4.showBootScreen
            int r0 = defpackage.xg6.e(r0, r2, r1)
            android.net.Uri r2 = r4.dsBios7Uri
            r3 = 0
            if (r2 != 0) goto L16
            r2 = r3
            goto L1a
        L16:
            int r2 = r2.hashCode()
        L1a:
            int r0 = r0 + r2
            int r0 = r0 * r1
            android.net.Uri r2 = r4.dsBios9Uri
            if (r2 != 0) goto L22
            r2 = r3
            goto L26
        L22:
            int r2 = r2.hashCode()
        L26:
            int r0 = r0 + r2
            int r0 = r0 * r1
            android.net.Uri r2 = r4.dsFirmwareUri
            if (r2 != 0) goto L2e
            r2 = r3
            goto L32
        L2e:
            int r2 = r2.hashCode()
        L32:
            int r0 = r0 + r2
            int r0 = r0 * r1
            android.net.Uri r2 = r4.dsiBios7Uri
            if (r2 != 0) goto L3a
            r2 = r3
            goto L3e
        L3a:
            int r2 = r2.hashCode()
        L3e:
            int r0 = r0 + r2
            int r0 = r0 * r1
            android.net.Uri r2 = r4.dsiBios9Uri
            if (r2 != 0) goto L46
            r2 = r3
            goto L4a
        L46:
            int r2 = r2.hashCode()
        L4a:
            int r0 = r0 + r2
            int r0 = r0 * r1
            android.net.Uri r2 = r4.dsiFirmwareUri
            if (r2 != 0) goto L52
            r2 = r3
            goto L56
        L52:
            int r2 = r2.hashCode()
        L56:
            int r0 = r0 + r2
            int r0 = r0 * r1
            android.net.Uri r2 = r4.dsiNandUri
            if (r2 != 0) goto L5d
            goto L61
        L5d:
            int r3 = r2.hashCode()
        L61:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r2 = r4.internalDirectory
            int r0 = defpackage.xg6.d(r0, r1, r2)
            float r2 = r4.fastForwardSpeedMultiplier
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r4.frameLimitSpeedMultiplier
            int r0 = defpackage.xg6.a(r2, r0, r1)
            boolean r2 = r4.rewindEnabled
            int r0 = defpackage.xg6.e(r0, r2, r1)
            int r2 = r4.rewindPeriodSeconds
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r4.rewindWindowSeconds
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r2 = r4.useJit
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.hgEngineFixEnabled
            int r0 = defpackage.xg6.e(r0, r2, r1)
            me.magnum.melonds.domain.model.ConsoleType r2 = r4.consoleType
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.soundEnabled
            int r0 = defpackage.xg6.e(r2, r0, r1)
            me.magnum.melonds.domain.model.AudioInterpolation r2 = r4.audioInterpolation
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            me.magnum.melonds.domain.model.AudioBitrate r0 = r4.audioBitrate
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r4.volume
            int r0 = defpackage.lb1.a(r2, r0, r1)
            me.magnum.melonds.domain.model.AudioLatency r2 = r4.audioLatency
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            me.magnum.melonds.domain.model.MicSource r0 = r4.micSource
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            me.magnum.melonds.domain.model.FirmwareConfiguration r2 = r4.firmwareConfiguration
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            me.magnum.melonds.domain.model.RendererConfiguration r0 = r4.rendererConfiguration
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r2 = r4.dldiSdCardConfiguration
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r0 = r4.dsiWareAutoloadTitleId
            int r4 = java.lang.Long.hashCode(r0)
            int r4 = r4 + r2
            return r4
    }

    public java.lang.String toString() {
            r32 = this;
            r0 = r32
            boolean r1 = r0.useCustomBios
            boolean r2 = r0.showBootScreen
            android.net.Uri r3 = r0.dsBios7Uri
            android.net.Uri r4 = r0.dsBios9Uri
            android.net.Uri r5 = r0.dsFirmwareUri
            android.net.Uri r6 = r0.dsiBios7Uri
            android.net.Uri r7 = r0.dsiBios9Uri
            android.net.Uri r8 = r0.dsiFirmwareUri
            android.net.Uri r9 = r0.dsiNandUri
            java.lang.String r10 = r0.internalDirectory
            float r11 = r0.fastForwardSpeedMultiplier
            float r12 = r0.frameLimitSpeedMultiplier
            boolean r13 = r0.rewindEnabled
            int r14 = r0.rewindPeriodSeconds
            int r15 = r0.rewindWindowSeconds
            r16 = r15
            boolean r15 = r0.useJit
            r17 = r15
            boolean r15 = r0.hgEngineFixEnabled
            r18 = r15
            me.magnum.melonds.domain.model.ConsoleType r15 = r0.consoleType
            r19 = r15
            boolean r15 = r0.soundEnabled
            r20 = r15
            me.magnum.melonds.domain.model.AudioInterpolation r15 = r0.audioInterpolation
            r21 = r15
            me.magnum.melonds.domain.model.AudioBitrate r15 = r0.audioBitrate
            r22 = r15
            int r15 = r0.volume
            r23 = r15
            me.magnum.melonds.domain.model.AudioLatency r15 = r0.audioLatency
            r24 = r15
            me.magnum.melonds.domain.model.MicSource r15 = r0.micSource
            r25 = r15
            me.magnum.melonds.domain.model.FirmwareConfiguration r15 = r0.firmwareConfiguration
            r26 = r15
            me.magnum.melonds.domain.model.RendererConfiguration r15 = r0.rendererConfiguration
            r27 = r15
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r15 = r0.dldiSdCardConfiguration
            r28 = r14
            r29 = r15
            long r14 = r0.dsiWareAutoloadTitleId
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r30 = r14
            java.lang.String r14 = "EmulatorConfiguration(useCustomBios="
            r0.<init>(r14)
            r0.append(r1)
            java.lang.String r1 = ", showBootScreen="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", dsBios7Uri="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", dsBios9Uri="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", dsFirmwareUri="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", dsiBios7Uri="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", dsiBios9Uri="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", dsiFirmwareUri="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", dsiNandUri="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", internalDirectory="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", fastForwardSpeedMultiplier="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", frameLimitSpeedMultiplier="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", rewindEnabled="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", rewindPeriodSeconds="
            r0.append(r1)
            r1 = r28
            r0.append(r1)
            java.lang.String r1 = ", rewindWindowSeconds="
            r0.append(r1)
            r1 = r16
            r0.append(r1)
            java.lang.String r1 = ", useJit="
            r0.append(r1)
            r1 = r17
            r0.append(r1)
            java.lang.String r1 = ", hgEngineFixEnabled="
            r0.append(r1)
            r1 = r18
            r0.append(r1)
            java.lang.String r1 = ", consoleType="
            r0.append(r1)
            r1 = r19
            r0.append(r1)
            java.lang.String r1 = ", soundEnabled="
            r0.append(r1)
            r1 = r20
            r0.append(r1)
            java.lang.String r1 = ", audioInterpolation="
            r0.append(r1)
            r1 = r21
            r0.append(r1)
            java.lang.String r1 = ", audioBitrate="
            r0.append(r1)
            r1 = r22
            r0.append(r1)
            java.lang.String r1 = ", volume="
            r0.append(r1)
            r1 = r23
            r0.append(r1)
            java.lang.String r1 = ", audioLatency="
            r0.append(r1)
            r1 = r24
            r0.append(r1)
            java.lang.String r1 = ", micSource="
            r0.append(r1)
            r1 = r25
            r0.append(r1)
            java.lang.String r1 = ", firmwareConfiguration="
            r0.append(r1)
            r1 = r26
            r0.append(r1)
            java.lang.String r1 = ", rendererConfiguration="
            r0.append(r1)
            r1 = r27
            r0.append(r1)
            java.lang.String r1 = ", dldiSdCardConfiguration="
            r0.append(r1)
            r1 = r29
            r0.append(r1)
            java.lang.String r1 = ", dsiWareAutoloadTitleId="
            r0.append(r1)
            r1 = r30
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
