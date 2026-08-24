package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RARuntimeBridgeConfig {
    public static final int $stable = 0;
    private final java.lang.String apiHost;
    private final java.lang.String apiToken;
    private final boolean encoreEnabled;
    private final long endpointGeneration;
    private final java.lang.String gameHash;
    private final java.lang.Long gameId;
    private final boolean hardcoreEnabled;
    private final me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode runtimeMode;
    private final long submissionSessionId;
    private final boolean unofficialEnabled;
    private final java.lang.String userAgent;
    private final java.lang.String username;
    private final boolean usesProxyHost;

    public RARuntimeBridgeConfig(me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Long r6, long r7, boolean r9, boolean r10, boolean r11, java.lang.String r12, boolean r13, long r14) {
            r0 = this;
            r1.getClass()
            r12.getClass()
            r0.<init>()
            r0.runtimeMode = r1
            r0.userAgent = r2
            r0.username = r3
            r0.apiToken = r4
            r0.gameHash = r5
            r0.gameId = r6
            r0.submissionSessionId = r7
            r0.hardcoreEnabled = r9
            r0.unofficialEnabled = r10
            r0.encoreEnabled = r11
            r0.apiHost = r12
            r0.usesProxyHost = r13
            r0.endpointGeneration = r14
            return
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig copy$default(me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r15, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Long r21, long r22, boolean r24, boolean r25, boolean r26, java.lang.String r27, boolean r28, long r29, int r31, java.lang.Object r32) {
            r1 = r31
            r2 = r1 & 1
            if (r2 == 0) goto L9
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r2 = r15.runtimeMode
            goto Lb
        L9:
            r2 = r16
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            java.lang.String r3 = r15.userAgent
            goto L14
        L12:
            r3 = r17
        L14:
            r4 = r1 & 4
            if (r4 == 0) goto L1b
            java.lang.String r4 = r15.username
            goto L1d
        L1b:
            r4 = r18
        L1d:
            r5 = r1 & 8
            if (r5 == 0) goto L24
            java.lang.String r5 = r15.apiToken
            goto L26
        L24:
            r5 = r19
        L26:
            r6 = r1 & 16
            if (r6 == 0) goto L2d
            java.lang.String r6 = r15.gameHash
            goto L2f
        L2d:
            r6 = r20
        L2f:
            r7 = r1 & 32
            if (r7 == 0) goto L36
            java.lang.Long r7 = r15.gameId
            goto L38
        L36:
            r7 = r21
        L38:
            r8 = r1 & 64
            if (r8 == 0) goto L3f
            long r8 = r15.submissionSessionId
            goto L41
        L3f:
            r8 = r22
        L41:
            r10 = r1 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L48
            boolean r10 = r15.hardcoreEnabled
            goto L4a
        L48:
            r10 = r24
        L4a:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L51
            boolean r11 = r15.unofficialEnabled
            goto L53
        L51:
            r11 = r25
        L53:
            r12 = r1 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L5a
            boolean r12 = r15.encoreEnabled
            goto L5c
        L5a:
            r12 = r26
        L5c:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L63
            java.lang.String r13 = r15.apiHost
            goto L65
        L63:
            r13 = r27
        L65:
            r14 = r1 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L6c
            boolean r14 = r15.usesProxyHost
            goto L6e
        L6c:
            r14 = r28
        L6e:
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L93
            r16 = r2
            long r1 = r15.endpointGeneration
            r17 = r16
            r30 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r16 = r15
            goto Laf
        L93:
            r30 = r29
            r17 = r2
            r16 = r15
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
        Laf:
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = r16.copy(r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30)
            return r0
    }

    public final me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode component1() {
            r0 = this;
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r0 = r0.runtimeMode
            return r0
    }

    public final boolean component10() {
            r0 = this;
            boolean r0 = r0.encoreEnabled
            return r0
    }

    public final java.lang.String component11() {
            r0 = this;
            java.lang.String r0 = r0.apiHost
            return r0
    }

    public final boolean component12() {
            r0 = this;
            boolean r0 = r0.usesProxyHost
            return r0
    }

    public final long component13() {
            r2 = this;
            long r0 = r2.endpointGeneration
            return r0
    }

    public final java.lang.String component2() {
            r0 = this;
            java.lang.String r0 = r0.userAgent
            return r0
    }

    public final java.lang.String component3() {
            r0 = this;
            java.lang.String r0 = r0.username
            return r0
    }

    public final java.lang.String component4() {
            r0 = this;
            java.lang.String r0 = r0.apiToken
            return r0
    }

    public final java.lang.String component5() {
            r0 = this;
            java.lang.String r0 = r0.gameHash
            return r0
    }

    public final java.lang.Long component6() {
            r0 = this;
            java.lang.Long r0 = r0.gameId
            return r0
    }

    public final long component7() {
            r2 = this;
            long r0 = r2.submissionSessionId
            return r0
    }

    public final boolean component8() {
            r0 = this;
            boolean r0 = r0.hardcoreEnabled
            return r0
    }

    public final boolean component9() {
            r0 = this;
            boolean r0 = r0.unofficialEnabled
            return r0
    }

    public final me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig copy(me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Long r22, long r23, boolean r25, boolean r26, boolean r27, java.lang.String r28, boolean r29, long r30) {
            r16 = this;
            r17.getClass()
            r28.getClass()
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = new me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r8 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r8
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r1 = r7.runtimeMode
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r3 = r8.runtimeMode
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r7.userAgent
            java.lang.String r3 = r8.userAgent
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r7.username
            java.lang.String r3 = r8.username
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r7.apiToken
            java.lang.String r3 = r8.apiToken
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r7.gameHash
            java.lang.String r3 = r8.gameHash
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.Long r1 = r7.gameId
            java.lang.Long r3 = r8.gameId
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            long r3 = r7.submissionSessionId
            long r5 = r8.submissionSessionId
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L53
            return r2
        L53:
            boolean r1 = r7.hardcoreEnabled
            boolean r3 = r8.hardcoreEnabled
            if (r1 == r3) goto L5a
            return r2
        L5a:
            boolean r1 = r7.unofficialEnabled
            boolean r3 = r8.unofficialEnabled
            if (r1 == r3) goto L61
            return r2
        L61:
            boolean r1 = r7.encoreEnabled
            boolean r3 = r8.encoreEnabled
            if (r1 == r3) goto L68
            return r2
        L68:
            java.lang.String r1 = r7.apiHost
            java.lang.String r3 = r8.apiHost
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L73
            return r2
        L73:
            boolean r1 = r7.usesProxyHost
            boolean r3 = r8.usesProxyHost
            if (r1 == r3) goto L7a
            return r2
        L7a:
            long r3 = r7.endpointGeneration
            long r7 = r8.endpointGeneration
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L83
            return r2
        L83:
            return r0
    }

    public final java.lang.String getApiHost() {
            r0 = this;
            java.lang.String r0 = r0.apiHost
            return r0
    }

    public final java.lang.String getApiToken() {
            r0 = this;
            java.lang.String r0 = r0.apiToken
            return r0
    }

    public final boolean getEncoreEnabled() {
            r0 = this;
            boolean r0 = r0.encoreEnabled
            return r0
    }

    public final long getEndpointGeneration() {
            r2 = this;
            long r0 = r2.endpointGeneration
            return r0
    }

    public final java.lang.String getGameHash() {
            r0 = this;
            java.lang.String r0 = r0.gameHash
            return r0
    }

    public final java.lang.Long getGameId() {
            r0 = this;
            java.lang.Long r0 = r0.gameId
            return r0
    }

    public final boolean getHardcoreEnabled() {
            r0 = this;
            boolean r0 = r0.hardcoreEnabled
            return r0
    }

    public final me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode getRuntimeMode() {
            r0 = this;
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r0 = r0.runtimeMode
            return r0
    }

    public final long getSubmissionSessionId() {
            r2 = this;
            long r0 = r2.submissionSessionId
            return r0
    }

    public final boolean getUnofficialEnabled() {
            r0 = this;
            boolean r0 = r0.unofficialEnabled
            return r0
    }

    public final java.lang.String getUserAgent() {
            r0 = this;
            java.lang.String r0 = r0.userAgent
            return r0
    }

    public final java.lang.String getUsername() {
            r0 = this;
            java.lang.String r0 = r0.username
            return r0
    }

    public final boolean getUsesProxyHost() {
            r0 = this;
            boolean r0 = r0.usesProxyHost
            return r0
    }

    public int hashCode() {
            r4 = this;
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r0 = r4.runtimeMode
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.userAgent
            r3 = 0
            if (r2 != 0) goto L10
            r2 = r3
            goto L14
        L10:
            int r2 = r2.hashCode()
        L14:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.username
            if (r2 != 0) goto L1c
            r2 = r3
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.apiToken
            if (r2 != 0) goto L28
            r2 = r3
            goto L2c
        L28:
            int r2 = r2.hashCode()
        L2c:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.gameHash
            if (r2 != 0) goto L34
            r2 = r3
            goto L38
        L34:
            int r2 = r2.hashCode()
        L38:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.Long r2 = r4.gameId
            if (r2 != 0) goto L3f
            goto L43
        L3f:
            int r3 = r2.hashCode()
        L43:
            int r0 = r0 + r3
            int r0 = r0 * r1
            long r2 = r4.submissionSessionId
            int r0 = defpackage.i61.c(r2, r0, r1)
            boolean r2 = r4.hardcoreEnabled
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.unofficialEnabled
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.encoreEnabled
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r2 = r4.apiHost
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r4.usesProxyHost
            int r0 = defpackage.xg6.e(r0, r2, r1)
            long r1 = r4.endpointGeneration
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public java.lang.String toString() {
            r18 = this;
            r0 = r18
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r1 = r0.runtimeMode
            java.lang.String r2 = r0.userAgent
            java.lang.String r3 = r0.username
            java.lang.String r4 = r0.apiToken
            java.lang.String r5 = r0.gameHash
            java.lang.Long r6 = r0.gameId
            long r7 = r0.submissionSessionId
            boolean r9 = r0.hardcoreEnabled
            boolean r10 = r0.unofficialEnabled
            boolean r11 = r0.encoreEnabled
            java.lang.String r12 = r0.apiHost
            boolean r13 = r0.usesProxyHost
            long r14 = r0.endpointGeneration
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r16 = r14
            java.lang.String r14 = "RARuntimeBridgeConfig(runtimeMode="
            r0.<init>(r14)
            r0.append(r1)
            java.lang.String r1 = ", userAgent="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", username="
            r0.append(r1)
            java.lang.String r1 = ", apiToken="
            java.lang.String r2 = ", gameHash="
            defpackage.i61.B(r0, r3, r1, r4, r2)
            r0.append(r5)
            java.lang.String r1 = ", gameId="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", submissionSessionId="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", hardcoreEnabled="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", unofficialEnabled="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", encoreEnabled="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", apiHost="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", usesProxyHost="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", endpointGeneration="
            java.lang.String r2 = ")"
            r3 = r16
            java.lang.String r0 = defpackage.lb1.r(r0, r1, r3, r2)
            return r0
    }
}
