package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o22  reason: default package */
/* loaded from: classes.dex */
public final class o22 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.zg5 X;
    public defpackage.zg5 Y;
    public defpackage.zg5 Z;
    public java.lang.Object d0;
    public java.lang.Object e0;
    public defpackage.zg5 f0;
    public int g0;
    public int h0;
    public int i0;
    public final /* synthetic */ defpackage.sz1 j0;

    public o22(defpackage.sz1 r1, defpackage.r41 r2) {
            r0 = this;
            r0.j0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            o22 r0 = (defpackage.o22) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            o22 r2 = new o22
            sz1 r0 = r0.j0
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r37) {
            r36 = this;
            r1 = r36
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r1.i0
            r5 = 6
            r6 = 2
            r7 = 5
            r8 = 1
            r9 = 0
            r14 = 0
            switch(r0) {
                case 0: goto Ld2;
                case 1: goto Lb6;
                case 2: goto L92;
                case 3: goto L74;
                case 4: goto L61;
                case 5: goto L4e;
                case 6: goto L49;
                case 7: goto L32;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L16:
            java.lang.Object r0 = r1.d0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.oi2.Y(r37)
            goto L540
        L1f:
            int r0 = r1.g0
            java.lang.Object r3 = r1.e0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r3 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r3
            java.lang.Object r3 = r1.d0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            zg5 r4 = r1.Z
            zg5 r5 = r1.X
            defpackage.oi2.Y(r37)
            goto L505
        L32:
            int r0 = r1.g0
            java.lang.Object r3 = r1.e0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r3 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r3
            java.lang.Object r4 = r1.d0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            zg5 r5 = r1.Z
            zg5 r6 = r1.X
            defpackage.oi2.Y(r37)
            r11 = r5
            r5 = r4
            r4 = r37
            goto L49e
        L49:
            defpackage.oi2.Y(r37)
            goto L440
        L4e:
            int r0 = r1.g0
            java.lang.Object r3 = r1.e0
            hb5 r3 = (defpackage.hb5) r3
            java.lang.Object r3 = r1.d0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r3 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r3
            zg5 r3 = r1.Z
            zg5 r4 = r1.X
            defpackage.oi2.Y(r37)
            goto L40a
        L61:
            int r0 = r1.g0
            java.lang.Object r3 = r1.d0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r3 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r3
            zg5 r4 = r1.Z
            zg5 r6 = r1.X
            defpackage.oi2.Y(r37)
            r11 = r4
            r4 = r3
            r3 = r37
            goto L3a4
        L74:
            zg5 r0 = r1.f0
            java.lang.Object r6 = r1.e0
            sz1 r6 = (defpackage.sz1) r6
            java.lang.Object r10 = r1.d0
            fb4 r10 = (defpackage.fb4) r10
            zg5 r11 = r1.Z
            zg5 r12 = r1.Y
            zg5 r13 = r1.X
            defpackage.oi2.Y(r37)     // Catch: java.lang.Throwable -> L8f
            r7 = r11
            r11 = r6
            r6 = r8
            r8 = r0
            r0 = r37
            goto L201
        L8f:
            r0 = move-exception
            goto L44f
        L92:
            int r0 = r1.h0
            int r10 = r1.g0
            java.lang.Object r11 = r1.e0
            sz1 r11 = (defpackage.sz1) r11
            java.lang.Object r12 = r1.d0
            fb4 r12 = (defpackage.fb4) r12
            zg5 r13 = r1.Z
            zg5 r15 = r1.Y
            zg5 r3 = r1.X
            defpackage.oi2.Y(r37)     // Catch: java.lang.Throwable -> Laf
            r35 = r15
            r15 = r3
            r3 = r12
            r12 = r35
            goto L127
        Laf:
            r0 = move-exception
            r10 = r12
            r11 = r13
            r12 = r15
            r13 = r3
            goto L44f
        Lb6:
            int r0 = r1.g0
            java.lang.Object r3 = r1.e0
            sz1 r3 = (defpackage.sz1) r3
            java.lang.Object r10 = r1.d0
            fb4 r10 = (defpackage.fb4) r10
            zg5 r11 = r1.Z
            zg5 r12 = r1.Y
            zg5 r13 = r1.X
            defpackage.oi2.Y(r37)     // Catch: java.lang.Throwable -> Lcf
            r35 = r11
            r11 = r3
            r3 = r35
            goto L104
        Lcf:
            r0 = move-exception
            goto L453
        Ld2:
            defpackage.oi2.Y(r37)
            zg5 r13 = new zg5
            r13.<init>()
            r13.A = r8
            zg5 r12 = new zg5
            r12.<init>()
            zg5 r11 = new zg5
            r11.<init>()
            sz1 r0 = r1.j0     // Catch: java.lang.Throwable -> Lcf
            hb4 r3 = r0.k0     // Catch: java.lang.Throwable -> Lcf
            r1.X = r13     // Catch: java.lang.Throwable -> Lcf
            r1.Y = r12     // Catch: java.lang.Throwable -> Lcf
            r1.Z = r11     // Catch: java.lang.Throwable -> Lcf
            r1.d0 = r3     // Catch: java.lang.Throwable -> Lcf
            r1.e0 = r0     // Catch: java.lang.Throwable -> Lcf
            r1.g0 = r9     // Catch: java.lang.Throwable -> Lcf
            r1.i0 = r8     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r10 = r3.e(r1)     // Catch: java.lang.Throwable -> Lcf
            if (r10 != r2) goto L100
            goto L53f
        L100:
            r10 = r3
            r3 = r11
            r11 = r0
            r0 = r9
        L104:
            jh r15 = r11.v     // Catch: java.lang.Throwable -> L44d
            r1.X = r13     // Catch: java.lang.Throwable -> L44d
            r1.Y = r12     // Catch: java.lang.Throwable -> L44d
            r1.Z = r3     // Catch: java.lang.Throwable -> L44d
            r1.d0 = r10     // Catch: java.lang.Throwable -> L44d
            r1.e0 = r11     // Catch: java.lang.Throwable -> L44d
            r1.g0 = r0     // Catch: java.lang.Throwable -> L44d
            r1.h0 = r9     // Catch: java.lang.Throwable -> L44d
            r1.i0 = r6     // Catch: java.lang.Throwable -> L44d
            r15.getClass()     // Catch: java.lang.Throwable -> L44d
            defpackage.jh.i()     // Catch: java.lang.Throwable -> L44d
            jg7 r15 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L44d
            if (r15 != r2) goto L122
            goto L53f
        L122:
            r15 = r13
            r13 = r3
            r3 = r10
            r10 = r0
            r0 = r9
        L127:
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r9 = r11.N     // Catch: java.lang.Throwable -> L31a
            if (r9 == 0) goto L13a
            java.lang.String r16 = r9.getUsername()     // Catch: java.lang.Throwable -> L13d
            if (r16 == 0) goto L13a
            boolean r17 = defpackage.qs6.v0(r16)     // Catch: java.lang.Throwable -> L13d
            if (r17 != 0) goto L13a
            r19 = r16
            goto L143
        L13a:
            r19 = r14
            goto L143
        L13d:
            r0 = move-exception
            r10 = r3
            r11 = r13
            r13 = r15
            goto L44f
        L143:
            if (r9 == 0) goto L154
            java.lang.String r16 = r9.getApiToken()     // Catch: java.lang.Throwable -> L13d
            if (r16 == 0) goto L154
            boolean r17 = defpackage.qs6.v0(r16)     // Catch: java.lang.Throwable -> L13d
            if (r17 != 0) goto L154
            r20 = r16
            goto L156
        L154:
            r20 = r14
        L156:
            nv4 r8 = r11.b0     // Catch: java.lang.Throwable -> L31a
            java.lang.Object r4 = r11.P     // Catch: java.lang.Throwable -> L31a
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L31a
            java.lang.String r6 = r11.Q     // Catch: java.lang.Throwable -> L443
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31a
            if (r9 == 0) goto L16e
            if (r19 == 0) goto L16e
            if (r20 == 0) goto L16e
            if (r8 == 0) goto L16e
            if (r6 == 0) goto L16e
            boolean r4 = r11.v0()     // Catch: java.lang.Throwable -> L31a
            if (r4 != 0) goto L173
        L16e:
            r9 = r12
            r7 = r13
            r4 = r15
            goto L322
        L173:
            zg5 r18 = new zg5     // Catch: java.lang.Throwable -> L31a
            r18.<init>()     // Catch: java.lang.Throwable -> L31a
            zp3 r24 = new zp3     // Catch: java.lang.Throwable -> L31a
            yc r4 = new yc     // Catch: java.lang.Throwable -> L31a
            r4.<init>(r11, r12, r14, r7)     // Catch: java.lang.Throwable -> L31a
            m22 r26 = new m22     // Catch: java.lang.Throwable -> L31a
            r22 = 0
            r23 = 0
            r21 = r8
            r17 = r11
            r16 = r26
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L31a
            r8 = r18
            ad r27 = new ad     // Catch: java.lang.Throwable -> L31a
            r11 = r15
            r15 = 1
            r7 = r12
            r12 = r9
            r9 = r7
            r25 = r4
            r34 = r10
            r4 = r11
            r7 = r13
            r11 = r17
            r13 = r21
            r10 = r27
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L313
            u6 r10 = new u6     // Catch: java.lang.Throwable -> L313
            r10.<init>(r7, r4, r11, r5)     // Catch: java.lang.Throwable -> L313
            u12 r12 = new u12     // Catch: java.lang.Throwable -> L313
            r15 = 5
            r12.<init>(r11, r13, r14, r15)     // Catch: java.lang.Throwable -> L313
            wc0 r13 = new wc0     // Catch: java.lang.Throwable -> L313
            r15 = 2
            r13.<init>(r11, r14, r15)     // Catch: java.lang.Throwable -> L313
            u6 r15 = new u6     // Catch: java.lang.Throwable -> L313
            r5 = 7
            r15.<init>(r11, r6, r9, r5)     // Catch: java.lang.Throwable -> L313
            n22 r16 = new n22     // Catch: java.lang.Throwable -> L313
            r21 = 0
            r22 = 0
            r18 = r6
            r17 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L313
            dz1 r5 = new dz1     // Catch: java.lang.Throwable -> L313
            r6 = 1
            r5.<init>(r11, r6)     // Catch: java.lang.Throwable -> L313
            r33 = r5
            r28 = r10
            r29 = r12
            r30 = r13
            r31 = r15
            r32 = r16
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L313
            r5 = r24
            r1.X = r4     // Catch: java.lang.Throwable -> L313
            r1.Y = r9     // Catch: java.lang.Throwable -> L313
            r1.Z = r7     // Catch: java.lang.Throwable -> L313
            r1.d0 = r3     // Catch: java.lang.Throwable -> L313
            r1.e0 = r11     // Catch: java.lang.Throwable -> L313
            r1.f0 = r8     // Catch: java.lang.Throwable -> L313
            r10 = r34
            r1.g0 = r10     // Catch: java.lang.Throwable -> L313
            r1.h0 = r0     // Catch: java.lang.Throwable -> L313
            r0 = 3
            r1.i0 = r0     // Catch: java.lang.Throwable -> L313
            java.lang.Object r0 = r5.a(r1)     // Catch: java.lang.Throwable -> L313
            if (r0 != r2) goto L1fe
            goto L53f
        L1fe:
            r10 = r3
            r13 = r4
            r12 = r9
        L201:
            bc5 r0 = (defpackage.bc5) r0     // Catch: java.lang.Throwable -> L27f
            boolean r3 = r0 instanceof defpackage.zb5     // Catch: java.lang.Throwable -> L27f
            if (r3 == 0) goto L2b9
            java.lang.String r3 = "ra_logout_completed"
            java.lang.String r4 = "identity_match"
            boolean r5 = r8.A     // Catch: java.lang.Throwable -> L27f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L27f
            vr4 r8 = new vr4     // Catch: java.lang.Throwable -> L27f
            r8.<init>(r4, r5)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r4 = "native_expected"
            r5 = r0
            zb5 r5 = (defpackage.zb5) r5     // Catch: java.lang.Throwable -> L27f
            xb5 r5 = r5.a     // Catch: java.lang.Throwable -> L27f
            int r5 = r5.a     // Catch: java.lang.Throwable -> L27f
            java.lang.Integer r9 = new java.lang.Integer     // Catch: java.lang.Throwable -> L27f
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L27f
            vr4 r5 = new vr4     // Catch: java.lang.Throwable -> L27f
            r5.<init>(r4, r9)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r4 = "native_confirmed"
            r9 = r0
            zb5 r9 = (defpackage.zb5) r9     // Catch: java.lang.Throwable -> L27f
            xb5 r9 = r9.a     // Catch: java.lang.Throwable -> L27f
            java.lang.Integer r9 = r9.b     // Catch: java.lang.Throwable -> L27f
            vr4 r15 = new vr4     // Catch: java.lang.Throwable -> L27f
            r15.<init>(r4, r9)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r4 = "kotlin_achievements_discarded"
            r9 = r0
            zb5 r9 = (defpackage.zb5) r9     // Catch: java.lang.Throwable -> L27f
            xb5 r9 = r9.a     // Catch: java.lang.Throwable -> L27f
            java.lang.Integer r9 = r9.c     // Catch: java.lang.Throwable -> L27f
            vr4 r6 = new vr4     // Catch: java.lang.Throwable -> L27f
            r6.<init>(r4, r9)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r4 = "authentication_cleared"
            r9 = r0
            zb5 r9 = (defpackage.zb5) r9     // Catch: java.lang.Throwable -> L27f
            boolean r9 = r9.b     // Catch: java.lang.Throwable -> L27f
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L27f
            vr4 r14 = new vr4     // Catch: java.lang.Throwable -> L27f
            r14.<init>(r4, r9)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r4 = "failure_stages"
            r9 = r0
            zb5 r9 = (defpackage.zb5) r9     // Catch: java.lang.Throwable -> L27f
            java.util.ArrayList r9 = r9.c     // Catch: java.lang.Throwable -> L27f
            java.lang.String r17 = ","
            r37 = r5
            bz1 r5 = new bz1     // Catch: java.lang.Throwable -> L27f
            r22 = r6
            r6 = 3
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27f
            r21 = 30
            r18 = 0
            r19 = 0
            r20 = r5
            r16 = r9
            java.lang.String r5 = defpackage.gt0.P0(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L27f
            boolean r6 = defpackage.qs6.v0(r5)     // Catch: java.lang.Throwable -> L27f
            if (r6 == 0) goto L284
            java.lang.String r5 = "none"
            goto L284
        L27f:
            r0 = move-exception
        L280:
            r11 = r7
        L281:
            r14 = 0
            goto L44f
        L284:
            vr4 r6 = new vr4     // Catch: java.lang.Throwable -> L27f
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r4 = "runtime_unloaded_before_auth_clear"
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L27f
            vr4 r9 = new vr4     // Catch: java.lang.Throwable -> L27f
            r9.<init>(r4, r5)     // Catch: java.lang.Throwable -> L27f
            r17 = r37
            r21 = r6
            r16 = r8
            r20 = r14
            r18 = r15
            r19 = r22
            r22 = r9
            vr4[] r4 = new defpackage.vr4[]{r16, r17, r18, r19, r20, r21, r22}     // Catch: java.lang.Throwable -> L27f
            r11.G0(r3, r4)     // Catch: java.lang.Throwable -> L27f
            zb5 r0 = (defpackage.zb5) r0     // Catch: java.lang.Throwable -> L27f
            java.util.ArrayList r0 = r0.c     // Catch: java.lang.Throwable -> L27f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L27f
            if (r0 != 0) goto L309
            of6 r0 = r11.J0     // Catch: java.lang.Throwable -> L27f
            o77 r3 = defpackage.o77.a     // Catch: java.lang.Throwable -> L27f
            r0.k(r3)     // Catch: java.lang.Throwable -> L27f
            goto L309
        L2b9:
            boolean r3 = r0 instanceof defpackage.ac5     // Catch: java.lang.Throwable -> L27f
            if (r3 == 0) goto L30d
            java.lang.String r3 = "ra_logout_failed"
            java.lang.String r4 = "stage"
            r5 = r0
            ac5 r5 = (defpackage.ac5) r5     // Catch: java.lang.Throwable -> L27f
            yb5 r5 = r5.a     // Catch: java.lang.Throwable -> L27f
            java.lang.String r5 = r5.name()     // Catch: java.lang.Throwable -> L27f
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L27f
            java.lang.String r5 = r5.toLowerCase(r6)     // Catch: java.lang.Throwable -> L27f
            r5.getClass()     // Catch: java.lang.Throwable -> L27f
            vr4 r6 = new vr4     // Catch: java.lang.Throwable -> L27f
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r4 = "error"
            r5 = r0
            ac5 r5 = (defpackage.ac5) r5     // Catch: java.lang.Throwable -> L27f
            java.lang.String r5 = r5.b     // Catch: java.lang.Throwable -> L27f
            vr4 r8 = new vr4     // Catch: java.lang.Throwable -> L27f
            r8.<init>(r4, r5)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r4 = "terminal_commit_started"
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L27f
            vr4 r9 = new vr4     // Catch: java.lang.Throwable -> L27f
            r9.<init>(r4, r5)     // Catch: java.lang.Throwable -> L27f
            vr4[] r4 = new defpackage.vr4[]{r6, r8, r9}     // Catch: java.lang.Throwable -> L27f
            r11.G0(r3, r4)     // Catch: java.lang.Throwable -> L27f
            ac5 r0 = (defpackage.ac5) r0     // Catch: java.lang.Throwable -> L27f
            yb5 r0 = r0.a     // Catch: java.lang.Throwable -> L27f
            yb5 r3 = defpackage.yb5.IDENTITY_VERIFICATION     // Catch: java.lang.Throwable -> L27f
            of6 r4 = r11.J0
            if (r0 != r3) goto L304
            n77 r0 = defpackage.n77.a     // Catch: java.lang.Throwable -> L27f
            r4.k(r0)     // Catch: java.lang.Throwable -> L27f
            goto L309
        L304:
            g77 r0 = defpackage.g77.a     // Catch: java.lang.Throwable -> L27f
            r4.k(r0)     // Catch: java.lang.Throwable -> L27f
        L309:
            r3 = r10
        L30a:
            r11 = r7
            r14 = 0
            goto L35a
        L30d:
            ug r0 = new ug     // Catch: java.lang.Throwable -> L27f
            r0.<init>()     // Catch: java.lang.Throwable -> L27f
            throw r0     // Catch: java.lang.Throwable -> L27f
        L313:
            r0 = move-exception
            r10 = r3
            r13 = r4
            r11 = r7
            r12 = r9
            goto L281
        L31a:
            r0 = move-exception
            r9 = r12
            r7 = r13
            r4 = r15
            r10 = r3
            r13 = r4
            goto L280
        L322:
            java.lang.String r0 = "ra_logout_rejected"
            java.lang.String r5 = "reason"
            java.lang.String r6 = "unsupported_runtime_context"
            vr4 r8 = new vr4     // Catch: java.lang.Throwable -> L313
            r8.<init>(r5, r6)     // Catch: java.lang.Throwable -> L313
            java.lang.String r5 = "runtime_path"
            sz1$c r6 = r11.O     // Catch: java.lang.Throwable -> L313
            java.lang.String r6 = r6.getTraceValue()     // Catch: java.lang.Throwable -> L313
            vr4 r10 = new vr4     // Catch: java.lang.Throwable -> L313
            r10.<init>(r5, r6)     // Catch: java.lang.Throwable -> L313
            java.lang.String r5 = "hardcore"
            sx1 r6 = r11.w     // Catch: java.lang.Throwable -> L313
            boolean r6 = r6.a     // Catch: java.lang.Throwable -> L313
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L313
            vr4 r12 = new vr4     // Catch: java.lang.Throwable -> L313
            r12.<init>(r5, r6)     // Catch: java.lang.Throwable -> L313
            vr4[] r5 = new defpackage.vr4[]{r8, r10, r12}     // Catch: java.lang.Throwable -> L313
            r11.G0(r0, r5)     // Catch: java.lang.Throwable -> L313
            of6 r0 = r11.J0     // Catch: java.lang.Throwable -> L313
            s67 r5 = defpackage.s67.a     // Catch: java.lang.Throwable -> L313
            r0.k(r5)     // Catch: java.lang.Throwable -> L313
            r13 = r4
            r12 = r9
            goto L30a
        L35a:
            r3.h(r14)     // Catch: java.lang.Throwable -> Lcf
            sz1 r0 = r1.j0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.j0
            int r0 = r0.decrementAndGet()
            if (r0 != 0) goto L369
            r0 = 1
            goto L36a
        L369:
            r0 = 0
        L36a:
            boolean r3 = r12.A
            if (r3 == 0) goto L40e
            boolean r3 = r11.A
            if (r3 != 0) goto L40e
            if (r0 == 0) goto L40e
            l61 r3 = r1.B
            r3.getClass()
            boolean r3 = defpackage.yh2.z(r3)
            if (r3 == 0) goto L40e
            sz1 r3 = r1.j0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r4 = r3.N
            pn5 r3 = r3.g
            r1.X = r13
            r14 = 0
            r1.Y = r14
            r1.Z = r11
            r1.d0 = r4
            r1.e0 = r14
            r1.f0 = r14
            r1.g0 = r0
            r5 = 4
            r1.i0 = r5
            pl r3 = (defpackage.pl) r3
            hk r3 = r3.c
            java.lang.Object r3 = r3.b(r1)
            if (r3 != r2) goto L3a3
            goto L53f
        L3a3:
            r6 = r13
        L3a4:
            boolean r5 = r3 instanceof defpackage.hb5
            if (r5 == 0) goto L3ac
            r14 = r3
            hb5 r14 = (defpackage.hb5) r14
            goto L3ad
        L3ac:
            r14 = 0
        L3ad:
            if (r4 == 0) goto L3e3
            java.lang.String r3 = r4.getUsername()
            java.lang.String r4 = r4.getApiToken()
            if (r14 == 0) goto L3bc
            java.lang.String r5 = r14.a
            goto L3bd
        L3bc:
            r5 = 0
        L3bd:
            if (r14 == 0) goto L3c2
            java.lang.String r14 = r14.b
            goto L3c3
        L3c2:
            r14 = 0
        L3c3:
            if (r3 == 0) goto L3e3
            boolean r7 = defpackage.qs6.v0(r3)
            if (r7 == 0) goto L3cc
            goto L3e3
        L3cc:
            if (r4 == 0) goto L3e3
            boolean r7 = defpackage.qs6.v0(r4)
            if (r7 == 0) goto L3d5
            goto L3e3
        L3d5:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L3e3
            boolean r3 = r4.equals(r14)
            if (r3 == 0) goto L3e3
            r8 = 1
            goto L3e4
        L3e3:
            r8 = 0
        L3e4:
            if (r8 == 0) goto L40d
            sz1 r3 = r1.j0
            jh r3 = r3.v
            r1.X = r6
            r14 = 0
            r1.Y = r14
            r1.Z = r11
            r1.d0 = r14
            r1.e0 = r14
            r1.g0 = r0
            r1.h0 = r8
            r15 = 5
            r1.i0 = r15
            r3.getClass()
            r3 = 0
            java.lang.Object r3 = defpackage.jh.j(r3, r1)
            if (r3 != r2) goto L408
            goto L53f
        L408:
            r4 = r6
            r3 = r11
        L40a:
            r11 = r3
            r13 = r4
            goto L40e
        L40d:
            r13 = r6
        L40e:
            boolean r3 = r13.A
            if (r3 == 0) goto L440
            boolean r3 = r11.A
            if (r3 != 0) goto L440
            if (r0 == 0) goto L440
            l61 r3 = r1.B
            r3.getClass()
            boolean r3 = defpackage.yh2.z(r3)
            if (r3 == 0) goto L440
            sz1 r3 = r1.j0
            r14 = 0
            r1.X = r14
            r1.Y = r14
            r1.Z = r14
            r1.d0 = r14
            r1.e0 = r14
            r1.f0 = r14
            r1.g0 = r0
            r0 = 6
            r1.i0 = r0
            r3.U0()
            jg7 r0 = defpackage.jg7.a
            if (r0 != r2) goto L440
            goto L53f
        L440:
            jg7 r0 = defpackage.jg7.a
            return r0
        L443:
            r0 = move-exception
            r5 = r4
            r9 = r12
            r7 = r13
            r4 = r15
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L313
            throw r0     // Catch: java.lang.Throwable -> L313
        L44a:
            r11 = r3
            goto L281
        L44d:
            r0 = move-exception
            goto L44a
        L44f:
            r10.h(r14)     // Catch: java.lang.Throwable -> Lcf
            throw r0     // Catch: java.lang.Throwable -> Lcf
        L453:
            sz1 r3 = r1.j0
            java.util.concurrent.atomic.AtomicInteger r3 = r3.j0
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L45f
            r3 = 1
            goto L460
        L45f:
            r3 = 0
        L460:
            boolean r4 = r12.A
            if (r4 == 0) goto L50e
            boolean r4 = r11.A
            if (r4 != 0) goto L50e
            if (r3 == 0) goto L50e
            l61 r4 = r1.B
            r4.getClass()
            boolean r4 = defpackage.yh2.z(r4)
            if (r4 == 0) goto L50e
            sz1 r4 = r1.j0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r5 = r4.N
            pn5 r4 = r4.g
            r1.X = r13
            r14 = 0
            r1.Y = r14
            r1.Z = r11
            r1.d0 = r0
            r1.e0 = r5
            r1.f0 = r14
            r1.g0 = r3
            r6 = 7
            r1.i0 = r6
            pl r4 = (defpackage.pl) r4
            hk r4 = r4.c
            java.lang.Object r4 = r4.b(r1)
            if (r4 != r2) goto L499
            goto L53f
        L499:
            r6 = r5
            r5 = r0
            r0 = r3
            r3 = r6
            r6 = r13
        L49e:
            boolean r7 = r4 instanceof defpackage.hb5
            if (r7 == 0) goto L4a6
            r14 = r4
            hb5 r14 = (defpackage.hb5) r14
            goto L4a7
        L4a6:
            r14 = 0
        L4a7:
            if (r3 == 0) goto L4dd
            java.lang.String r4 = r3.getUsername()
            java.lang.String r3 = r3.getApiToken()
            if (r14 == 0) goto L4b6
            java.lang.String r7 = r14.a
            goto L4b7
        L4b6:
            r7 = 0
        L4b7:
            if (r14 == 0) goto L4bc
            java.lang.String r14 = r14.b
            goto L4bd
        L4bc:
            r14 = 0
        L4bd:
            if (r4 == 0) goto L4dd
            boolean r8 = defpackage.qs6.v0(r4)
            if (r8 == 0) goto L4c6
            goto L4dd
        L4c6:
            if (r3 == 0) goto L4dd
            boolean r8 = defpackage.qs6.v0(r3)
            if (r8 == 0) goto L4cf
            goto L4dd
        L4cf:
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L4dd
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L4dd
            r8 = 1
            goto L4de
        L4dd:
            r8 = 0
        L4de:
            if (r8 == 0) goto L50b
            sz1 r3 = r1.j0
            jh r3 = r3.v
            r1.X = r6
            r14 = 0
            r1.Y = r14
            r1.Z = r11
            r1.d0 = r5
            r1.e0 = r14
            r1.g0 = r0
            r1.h0 = r8
            r4 = 8
            r1.i0 = r4
            r3.getClass()
            r3 = 0
            java.lang.Object r3 = defpackage.jh.j(r3, r1)
            if (r3 != r2) goto L502
            goto L53f
        L502:
            r3 = r5
            r5 = r6
            r4 = r11
        L505:
            r11 = r3
            r3 = r0
            r0 = r11
            r11 = r4
            r13 = r5
            goto L50e
        L50b:
            r3 = r0
            r0 = r5
            r13 = r6
        L50e:
            boolean r4 = r13.A
            if (r4 == 0) goto L540
            boolean r4 = r11.A
            if (r4 != 0) goto L540
            if (r3 == 0) goto L540
            l61 r4 = r1.B
            r4.getClass()
            boolean r4 = defpackage.yh2.z(r4)
            if (r4 == 0) goto L540
            sz1 r4 = r1.j0
            r14 = 0
            r1.X = r14
            r1.Y = r14
            r1.Z = r14
            r1.d0 = r0
            r1.e0 = r14
            r1.f0 = r14
            r1.g0 = r3
            r3 = 9
            r1.i0 = r3
            r4.U0()
            jg7 r1 = defpackage.jg7.a
            if (r1 != r2) goto L540
        L53f:
            return r2
        L540:
            throw r0
    }
}
