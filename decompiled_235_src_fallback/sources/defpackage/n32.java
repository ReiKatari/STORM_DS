package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n32  reason: default package */
/* loaded from: classes.dex */
public final class n32 extends defpackage.hw6 implements defpackage.eo2 {
    public java.lang.Object X;
    public java.lang.Throwable Y;
    public me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig Z;
    public int d0;
    public long e0;
    public int f0;
    public /* synthetic */ java.lang.Object g0;
    public final /* synthetic */ defpackage.dh5 h0;
    public final /* synthetic */ defpackage.sz1 i0;
    public final /* synthetic */ defpackage.ep2 j0;
    public final /* synthetic */ defpackage.pq5 k0;
    public final /* synthetic */ defpackage.dh5 l0;
    public final /* synthetic */ java.lang.String m0;
    public final /* synthetic */ defpackage.dh5 n0;

    public n32(defpackage.dh5 r1, defpackage.sz1 r2, defpackage.ep2 r3, defpackage.pq5 r4, defpackage.dh5 r5, java.lang.String r6, defpackage.dh5 r7, defpackage.r41 r8) {
            r0 = this;
            r0.h0 = r1
            r0.i0 = r2
            r0.j0 = r3
            r0.k0 = r4
            r0.l0 = r5
            r0.m0 = r6
            r0.n0 = r7
            r1 = 2
            r0.<init>(r1, r8)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            n32 r0 = (defpackage.n32) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r10, java.lang.Object r11) {
            r9 = this;
            n32 r0 = new n32
            java.lang.String r6 = r9.m0
            dh5 r7 = r9.n0
            dh5 r1 = r9.h0
            sz1 r2 = r9.i0
            ep2 r3 = r9.j0
            pq5 r4 = r9.k0
            dh5 r5 = r9.l0
            r8 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.g0 = r11
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r61) {
            r60 = this;
            r1 = r60
            ep2 r5 = r1.j0
            java.net.URL r8 = r5.f
            sz1 r2 = r1.i0
            of6 r9 = r2.J0
            jh r0 = r2.v
            of6 r10 = r2.N0
            sx1 r11 = r2.w
            kd6 r12 = r2.c
            java.lang.Object r3 = r1.g0
            r13 = r3
            w61 r13 = (defpackage.w61) r13
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.f0
            r18 = 0
            java.lang.String r4 = "ra_encore_enabled"
            java.lang.String r6 = "ra_unofficial_enabled"
            dh5 r15 = r1.h0
            r17 = r6
            java.lang.String r6 = "error"
            r20 = r6
            java.lang.String r6 = "ra_setup_failed"
            r21 = r6
            java.lang.String r6 = r1.m0
            r22 = r6
            r23 = r11
            pq5 r11 = r1.k0
            java.lang.String r6 = "runtime_path"
            r25 = r6
            jg7 r6 = defpackage.jg7.a
            r26 = r6
            dh5 r6 = r1.l0
            r27 = r6
            r6 = 1
            r7 = 0
            switch(r3) {
                case 0: goto L230;
                case 1: goto L21b;
                case 2: goto L1f8;
                case 3: goto L1de;
                case 4: goto L1b9;
                case 5: goto L1a6;
                case 6: goto L194;
                case 7: goto L181;
                case 8: goto L16c;
                case 9: goto L15b;
                case 10: goto L142;
                case 11: goto L139;
                case 12: goto L124;
                case 13: goto L10f;
                case 14: goto Lf8;
                case 15: goto Le0;
                case 16: goto Lc5;
                case 17: goto La2;
                case 18: goto L6a;
                case 19: goto L59;
                case 20: goto L4c;
                default: goto L46;
            }
        L46:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r18
        L4c:
            java.lang.Throwable r0 = r1.Y
            hb5 r0 = (defpackage.hb5) r0
            java.lang.Object r0 = r1.X
            pz1 r0 = (defpackage.pz1) r0
            defpackage.oi2.Y(r61)
            goto L49f
        L59:
            long r2 = r1.e0
            java.lang.Throwable r0 = r1.Y
            hb5 r0 = (defpackage.hb5) r0
            java.lang.Object r0 = r1.X
            pz1 r0 = (defpackage.pz1) r0
            defpackage.oi2.Y(r61)
            r11 = r7
            r8 = r14
            goto L489
        L6a:
            long r3 = r1.e0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r8 = r1.Z
            java.lang.Throwable r0 = r1.Y
            hb5 r0 = (defpackage.hb5) r0
            java.lang.Object r0 = r1.X
            pz1 r0 = (defpackage.pz1) r0
            defpackage.oi2.Y(r61)     // Catch: java.lang.Throwable -> L8d
            r11 = r7
            r6 = r8
            r55 = r10
            r8 = r14
            r34 = r20
            r35 = r21
            r36 = r22
            r56 = r23
            r37 = r25
            r10 = r9
            r9 = r27
            goto L3c8
        L8d:
            r0 = move-exception
            r11 = r7
            r6 = r8
            r55 = r10
            r8 = r14
            r34 = r20
            r35 = r21
            r36 = r22
            r56 = r23
            r37 = r25
            r10 = r9
            r9 = r27
            goto L3d7
        La2:
            long r3 = r1.e0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r8 = r1.Z
            java.lang.Throwable r11 = r1.Y
            hb5 r11 = (defpackage.hb5) r11
            java.lang.Object r11 = r1.X
            pz1 r11 = (defpackage.pz1) r11
            defpackage.oi2.Y(r61)
            r11 = r7
            r6 = r8
            r7 = r9
            r55 = r10
            r8 = r14
            r34 = r20
            r35 = r21
            r36 = r22
            r56 = r23
            r37 = r25
            r10 = r2
            r13 = r3
            goto L39e
        Lc5:
            java.lang.Object r3 = r1.X
            pz1 r3 = (defpackage.pz1) r3
            defpackage.oi2.Y(r61)
            r32 = r4
            r8 = r6
            r33 = r17
            r34 = r20
            r35 = r21
            r36 = r22
            r37 = r25
            r38 = r27
            r4 = r61
        Ldd:
            r15 = r3
            goto L2c1
        Le0:
            java.lang.Throwable r0 = r1.Y
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r0
            defpackage.oi2.Y(r61)
            r6 = r7
            r7 = r10
            r5 = r11
            r0 = r13
            r15 = r27
            r4 = 15
        Lf3:
            r11 = r2
            r2 = r8
            r8 = r14
            goto L7cf
        Lf8:
            int r0 = r1.d0
            java.lang.Object r3 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r3 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r3
            defpackage.oi2.Y(r61)
            r6 = r7
            r9 = r10
            r5 = r11
            r15 = r27
            r3 = 2
            r4 = 15
            r7 = 0
            r10 = r2
            r2 = r8
            r8 = r14
            goto L785
        L10f:
            java.lang.Object r0 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r0
            defpackage.oi2.Y(r61)
            r6 = r7
            r9 = r10
            r5 = r11
            r15 = r27
            r3 = 2
            r4 = 15
            r7 = 0
            r10 = r2
            r2 = r8
            r8 = r14
            goto L748
        L124:
            java.lang.Object r0 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r0
            defpackage.oi2.Y(r61)
            r6 = r7
            r9 = r10
            r5 = r11
            r15 = r27
            r4 = 15
            r7 = 0
            r10 = r2
            r2 = r8
            r8 = r14
        L136:
            r0 = r13
            goto L717
        L139:
            java.lang.Object r0 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r0
            defpackage.oi2.Y(r61)
            goto L6f5
        L142:
            int r0 = r1.d0
            java.lang.Object r3 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r3 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r3
            defpackage.oi2.Y(r61)
            r3 = r61
            r6 = r7
            r58 = r10
            r5 = r11
            r15 = r27
            r4 = 15
            r7 = 0
            r10 = r2
            r2 = r8
            r8 = r14
            goto L6c7
        L15b:
            java.lang.Object r0 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r0
            defpackage.oi2.Y(r61)
            r6 = r7
            r7 = r10
            r5 = r11
            r0 = r13
            r15 = r27
            r4 = 15
            r9 = 5
            goto Lf3
        L16c:
            java.lang.Object r0 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r0
            defpackage.oi2.Y(r61)
            r31 = r8
            r58 = r10
            r0 = r13
            r8 = r14
            r15 = r27
            r4 = 15
            r13 = r7
            r7 = 0
            goto L641
        L181:
            java.lang.Object r0 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r0
            defpackage.oi2.Y(r61)
            r31 = r8
            r58 = r10
            r0 = r13
            r8 = r14
            r15 = r27
            r13 = r7
            r7 = 0
            goto L661
        L194:
            java.lang.Object r0 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r0 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r0
            defpackage.oi2.Y(r61)
            r31 = r8
            r58 = r10
            r12 = r13
            r8 = r14
            r15 = r27
            r7 = 0
            goto L640
        L1a6:
            java.lang.Throwable r0 = r1.Y
            java.lang.Object r1 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r1 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r1
            defpackage.oi2.Y(r61)
            r11 = r2
            r2 = r8
            r7 = r10
            r35 = r21
            r10 = r25
        L1b6:
            r6 = r0
            goto L829
        L1b9:
            java.lang.Object r0 = r1.X
            r3 = r0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r3 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r3
            defpackage.oi2.Y(r61)     // Catch: java.lang.Throwable -> L1d0
            r6 = r3
            r31 = r8
            r21 = r9
            r58 = r10
            r12 = r13
            r8 = r14
            r10 = r25
            r15 = r27
            goto L5d5
        L1d0:
            r0 = move-exception
            r11 = r2
            r6 = r3
            r13 = r7
            r2 = r8
            r7 = r10
            r8 = r14
            r35 = r21
            r10 = r25
            r9 = 5
            goto L800
        L1de:
            java.lang.Object r3 = r1.X
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r3 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r3
            defpackage.oi2.Y(r61)
            r6 = r3
            r17 = r5
            r31 = r8
            r58 = r10
            r12 = r13
            r8 = r14
            r35 = r21
            r10 = r25
            r15 = r27
            r21 = r9
            goto L5bb
        L1f8:
            defpackage.oi2.Y(r61)
            r3 = r17
            r17 = r5
            r5 = r10
            r10 = r9
            r9 = r3
            r31 = r8
            r19 = r12
            r8 = r14
            r6 = r20
            r57 = r21
            r14 = r22
            r7 = r23
            r3 = r25
            r15 = r27
            r20 = r13
            r13 = r4
            r4 = r2
            r2 = r61
            goto L4d3
        L21b:
            defpackage.oi2.Y(r61)
            r32 = r4
            r31 = r8
            r33 = r17
            r34 = r20
            r35 = r21
            r36 = r22
            r37 = r25
            r38 = r27
            r8 = r6
            goto L283
        L230:
            defpackage.oi2.Y(r61)
            java.lang.Object r3 = r15.A
            sz1$b r3 = (defpackage.sz1.b) r3
            int[] r28 = defpackage.m32.a
            int r3 = r3.ordinal()
            r3 = r28[r3]
            if (r3 == r6) goto L250
            r6 = 2
            if (r3 == r6) goto L250
            r6 = 3
            if (r3 != r6) goto L24c
            sz1$c r3 = defpackage.sz1.c.RC_CLIENT_OFFLINE
        L249:
            r24 = r6
            goto L254
        L24c:
            defpackage.i.d()
            return r18
        L250:
            r6 = 3
            sz1$c r3 = defpackage.sz1.c.RC_CLIENT
            goto L249
        L254:
            r6 = 0
            r29 = r7
            r7 = 24
            r30 = r4
            r4 = r3
            java.lang.String r3 = "waiting_for_running"
            r31 = r8
            r33 = r17
            r34 = r20
            r35 = r21
            r36 = r22
            r37 = r25
            r38 = r27
            r32 = r30
            r8 = 1
            defpackage.sz1.F0(r2, r3, r4, r5, r6, r7)
            g21 r3 = defpackage.sz1.o(r2)
            r1.g0 = r13
            r1.f0 = r8
            java.lang.Object r3 = defpackage.f04.D(r3, r1)
            if (r3 != r14) goto L283
        L280:
            r8 = r14
            goto L825
        L283:
            java.lang.Object r3 = r15.A
            sz1$b r3 = (defpackage.sz1.b) r3
            int[] r4 = defpackage.m32.a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            if (r3 == r8) goto L4a7
            r15 = 2
            if (r3 == r15) goto L4a7
            r4 = 3
            if (r3 != r4) goto L4a3
            dh5 r3 = r1.n0
            java.lang.Object r3 = r3.A
            pz1 r3 = (defpackage.pz1) r3
            if (r3 != 0) goto L2a1
            goto L814
        L2a1:
            vj4 r4 = r3.c
            long r6 = r4.b
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r6)
            r2.L = r4
            pn5 r4 = r2.g
            r1.g0 = r13
            r1.X = r3
            r6 = 16
            r1.f0 = r6
            pl r4 = (defpackage.pl) r4
            hk r4 = r4.c
            java.lang.Object r4 = r4.b(r1)
            if (r4 != r14) goto Ldd
            goto L280
        L2c1:
            boolean r3 = r4 instanceof defpackage.hb5
            if (r3 == 0) goto L2c9
            r7 = r4
            hb5 r7 = (defpackage.hb5) r7
            goto L2ca
        L2c9:
            r7 = 0
        L2ca:
            if (r7 == 0) goto L31f
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r39 = new me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r40 = me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.RC_CLIENT_OFFLINE
            java.lang.String r3 = r2.M0
            java.lang.String r4 = r7.a
            java.lang.String r6 = r7.b
            java.lang.String r7 = r11.i
            vj4 r11 = r15.c
            r17 = r9
            long r8 = r11.b
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r8)
            r8 = r12
            ng6 r8 = (defpackage.ng6) r8
            android.content.SharedPreferences r8 = r8.b
            r44 = r7
            r9 = r33
            r7 = 0
            boolean r49 = r8.getBoolean(r9, r7)
            ng6 r12 = (defpackage.ng6) r12
            android.content.SharedPreferences r8 = r12.b
            r9 = r32
            boolean r50 = r8.getBoolean(r9, r7)
            r8 = r38
            java.lang.Object r9 = r8.A
            uz1 r9 = (defpackage.uz1) r9
            java.lang.String r12 = r9.h
            r52 = 0
            r27 = r8
            long r7 = r9.i
            r46 = 0
            r48 = 0
            r41 = r3
            r42 = r4
            r43 = r6
            r53 = r7
            r45 = r11
            r51 = r12
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53)
            r6 = r39
            goto L324
        L31f:
            r17 = r9
            r27 = r38
            r6 = 0
        L324:
            r2.N = r6
            sz1$c r4 = defpackage.sz1.c.RC_CLIENT_OFFLINE
            r2.O = r4
            java.lang.String r3 = "running_state_ready"
            r7 = 16
            r8 = 0
            defpackage.sz1.F0(r2, r3, r4, r5, r6, r7)
            long r46 = java.lang.System.currentTimeMillis()
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r45 = r3.toString()
            r45.getClass()
            gk4 r43 = defpackage.gk4.SOFTCORE
            r3 = r27
            java.lang.Object r4 = r3.A
            uz1 r4 = (defpackage.uz1) r4
            ik4 r4 = r4.c
            if (r4 != 0) goto L34f
            ik4 r4 = defpackage.ik4.OFFLINE_FROM_START
        L34f:
            r44 = r4
            qz1 r38 = new qz1
            java.lang.String r4 = r15.a
            java.lang.String r7 = r15.b
            vj4 r9 = r15.c
            long r11 = r9.b
            r39 = r4
            r40 = r7
            r41 = r11
            r38.<init>(r39, r40, r41, r43, r44, r45, r46)
            r4 = r38
            r2.M = r4
            xe1 r4 = defpackage.xk1.a
            de1 r4 = defpackage.de1.L
            n31 r9 = new n31
            r7 = r17
            r17 = 0
            r55 = r10
            r8 = r14
            r11 = r15
            r56 = r23
            r15 = r43
            r16 = r44
            r12 = r45
            r10 = r2
            r2 = r13
            r13 = r46
            r9.<init>(r10, r11, r12, r13, r15, r16, r17)
            r1.g0 = r2
            r11 = 0
            r1.X = r11
            r1.Y = r11
            r1.Z = r6
            r1.e0 = r13
            r2 = 17
            r1.f0 = r2
            java.lang.Object r2 = defpackage.hv.d0(r4, r9, r1)
            if (r2 != r8) goto L39c
            goto L825
        L39c:
            r27 = r3
        L39e:
            java.lang.String r3 = "native_setup_start"
            sz1$c r4 = r10.O     // Catch: java.lang.Throwable -> L3d1
            r17 = r7
            r7 = 16
            r2 = r10
            r10 = r17
            r9 = r27
            defpackage.sz1.F0(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3ce
            r1.g0 = r11     // Catch: java.lang.Throwable -> L3ce
            r1.X = r11     // Catch: java.lang.Throwable -> L3ce
            r1.Y = r11     // Catch: java.lang.Throwable -> L3ce
            r1.Z = r6     // Catch: java.lang.Throwable -> L3ce
            r1.e0 = r13     // Catch: java.lang.Throwable -> L3ce
            r7 = 0
            r1.d0 = r7     // Catch: java.lang.Throwable -> L3ce
            r3 = 18
            r1.f0 = r3     // Catch: java.lang.Throwable -> L3ce
            java.lang.Object r0 = r0.k(r5, r6, r1)     // Catch: java.lang.Throwable -> L3ce
            if (r0 != r8) goto L3c7
            goto L825
        L3c7:
            r3 = r13
        L3c8:
            r12 = r3
            r4 = r5
            r5 = r6
            r6 = r26
            goto L3e0
        L3ce:
            r0 = move-exception
        L3cf:
            r3 = r13
            goto L3d7
        L3d1:
            r0 = move-exception
            r2 = r10
            r9 = r27
            r10 = r7
            goto L3cf
        L3d7:
            em5 r7 = new em5
            r7.<init>(r0)
            r12 = r3
            r4 = r5
            r5 = r6
            r6 = r7
        L3e0:
            java.lang.Throwable r6 = defpackage.hm5.a(r6)
            if (r6 == 0) goto L44c
            dz1 r0 = new dz1
            r13 = 4
            r0.<init>(r2, r13)
            java.lang.String r1 = "offline_native_setup_failed"
            r14 = r36
            boolean r0 = r2.h1(r14, r1, r0)
            if (r0 != 0) goto L3fd
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L3fc
            goto L814
        L3fc:
            throw r6
        L3fd:
            r2.r0()
            r7 = r56
            r8 = 0
            r7.d = r8
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L44b
            java.lang.String r0 = "native_setup_failed"
            sz1$c r3 = r2.O
            r1 = r2
            r2 = r0
            r1.E0(r2, r3, r4, r5, r6)
            r2 = r1
            r5 = r4
            sz1$c r0 = r2.O
            java.lang.String r0 = r0.name()
            vr4 r1 = new vr4
            r3 = r37
            r1.<init>(r3, r0)
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getSimpleName()
            vr4 r3 = new vr4
            r6 = r34
            r3.<init>(r6, r0)
            vr4[] r0 = new defpackage.vr4[]{r1, r3}
            r1 = r35
            r2.H0(r1, r0)
            dp2 r0 = defpackage.dp2.DISABLED_LOAD_ERROR
            r7.d(r0)
            la5 r0 = new la5
            java.net.URL r1 = r5.f
            r0.<init>(r1)
            r5 = r55
            r5.k(r0)
            return r26
        L44b:
            throw r6
        L44c:
            r6 = r5
            r7 = r56
            r3 = 1
            r5 = r4
            r7.e(r3)
            sz1$c r4 = r2.O
            r7 = 16
            java.lang.String r3 = "native_setup_completed"
            defpackage.sz1.F0(r2, r3, r4, r5, r6, r7)
            r3 = r2
            r2 = r5
            q77 r0 = defpackage.q77.SOFTCORE_OFFLINE
            java.lang.Object r4 = r9.A
            uz1 r4 = (defpackage.uz1) r4
            boolean r5 = r4.e
            boolean r4 = r4.f
            p77 r6 = new p77
            r6.<init>(r0, r5, r4)
            r10.k(r6)
            r1.g0 = r11
            r1.X = r11
            r1.Y = r11
            r1.Z = r11
            r1.e0 = r12
            r0 = 19
            r1.f0 = r0
            r7 = 0
            java.lang.Object r0 = defpackage.sz1.m(r3, r2, r7, r1)
            if (r0 != r8) goto L488
            goto L825
        L488:
            r2 = r12
        L489:
            r1.g0 = r11
            r1.X = r11
            r1.Y = r11
            r1.Z = r11
            r1.e0 = r2
            r0 = 20
            r1.f0 = r0
            x61 r0 = defpackage.q60.j(r1)
            if (r0 != r8) goto L49f
            goto L825
        L49f:
            defpackage.e41.c()
            return r18
        L4a3:
            defpackage.i.d()
            return r18
        L4a7:
            r4 = r2
            r17 = r5
            r5 = r10
            r19 = r12
            r2 = r13
            r8 = r14
            r7 = r23
            r13 = r32
            r6 = r34
            r57 = r35
            r14 = r36
            r3 = r37
            r15 = r38
            r10 = r9
            r9 = r33
            java.lang.Object r12 = r15.A
            uz1 r12 = (defpackage.uz1) r12
            r1.g0 = r2
            r20 = r2
            r2 = 2
            r1.f0 = r2
            java.lang.Object r2 = defpackage.sz1.h(r4, r11, r12, r1)
            if (r2 != r8) goto L4d3
            goto L825
        L4d3:
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r2 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r2
            if (r2 == 0) goto L4de
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r12 = r2.getRuntimeMode()
        L4db:
            r21 = r10
            goto L4e0
        L4de:
            r12 = 0
            goto L4db
        L4e0:
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r10 = me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.RC_CLIENT_ONLINE
            if (r12 == r10) goto L51b
            r12 = 0
            r4.N = r12
            sz1$c r0 = defpackage.sz1.c.DISABLED
            r4.O = r0
            java.lang.String r0 = "missing_runtime_config"
            defpackage.sz1.R(r4, r14, r0)
            sz1$c r0 = r4.O
            java.lang.String r0 = r0.name()
            vr4 r1 = new vr4
            r1.<init>(r3, r0)
            vr4 r0 = new vr4
            java.lang.String r2 = "missing_rc_client_config"
            r0.<init>(r6, r2)
            vr4[] r0 = new defpackage.vr4[]{r1, r0}
            r10 = r57
            r4.H0(r10, r0)
            dp2 r0 = defpackage.dp2.DISABLED_LOAD_ERROR
            r7.d(r0)
            la5 r0 = new la5
            r12 = r31
            r0.<init>(r12)
            r5.k(r0)
            return r26
        L51b:
            r12 = r31
            r10 = r57
            r4.N = r2
            r61 = r2
            sz1$c r2 = defpackage.sz1.c.RC_CLIENT
            r4.O = r2
            r37 = r3
            java.lang.String r3 = "running_state_ready"
            r56 = r7
            r7 = 16
            r23 = r4
            r4 = r2
            r2 = r23
            r58 = r5
            r35 = r10
            r5 = r17
            r12 = r20
            r10 = r37
            r23 = r56
            r20 = r6
            r6 = r61
            defpackage.sz1.F0(r2, r3, r4, r5, r6, r7)
            sz1$c r3 = r2.O
            java.lang.String r3 = r3.name()
            vr4 r4 = new vr4
            r4.<init>(r10, r3)
            r3 = r19
            ng6 r3 = (defpackage.ng6) r3
            android.content.SharedPreferences r3 = r3.b
            r7 = 0
            boolean r3 = r3.getBoolean(r13, r7)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            vr4 r7 = new vr4
            java.lang.String r13 = "encore"
            r7.<init>(r13, r3)
            java.lang.Object r3 = r15.A
            uz1 r3 = (defpackage.uz1) r3
            sz1$d r3 = r3.b
            sz1$d r13 = defpackage.sz1.d.HARDCORE
            if (r3 != r13) goto L574
            r3 = 1
            goto L575
        L574:
            r3 = 0
        L575:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            vr4 r13 = new vr4
            r17 = r5
            java.lang.String r5 = "hardcore"
            r13.<init>(r5, r3)
            r3 = r19
            ng6 r3 = (defpackage.ng6) r3
            android.content.SharedPreferences r3 = r3.b
            r5 = 0
            boolean r3 = r3.getBoolean(r9, r5)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            vr4 r5 = new vr4
            java.lang.String r9 = "unofficial"
            r5.<init>(r9, r3)
            java.lang.Long r3 = r2.L
            vr4 r9 = new vr4
            r22 = r14
            java.lang.String r14 = "game_id"
            r9.<init>(r14, r3)
            vr4[] r3 = new defpackage.vr4[]{r4, r7, r13, r5, r9}
            java.lang.String r4 = "ra_setup_started"
            r2.H0(r4, r3)
            r1.g0 = r12
            r1.X = r6
            r4 = 3
            r1.f0 = r4
            java.lang.Object r3 = defpackage.sz1.E(r2, r6, r11, r1)
            if (r3 != r8) goto L5bb
            goto L825
        L5bb:
            java.lang.String r3 = "native_setup_start"
            sz1$c r4 = r2.O     // Catch: java.lang.Throwable -> L7fb
            r7 = 16
            r5 = r17
            defpackage.sz1.F0(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7f2
            r1.g0 = r12     // Catch: java.lang.Throwable -> L7f2
            r1.X = r6     // Catch: java.lang.Throwable -> L7f2
            r13 = 4
            r1.f0 = r13     // Catch: java.lang.Throwable -> L7f2
            java.lang.Object r0 = r0.k(r5, r6, r1)     // Catch: java.lang.Throwable -> L7f2
            if (r0 != r8) goto L5d5
            goto L825
        L5d5:
            sx1 r0 = r2.w
            r7 = 0
            r0.d = r7
            sz1$c r4 = r2.O
            r7 = 16
            java.lang.String r3 = "native_setup_completed"
            defpackage.sz1.F0(r2, r3, r4, r5, r6, r7)
            sz1$c r0 = r2.O
            java.lang.String r0 = r0.name()
            vr4 r3 = new vr4
            r3.<init>(r10, r0)
            vr4[] r0 = new defpackage.vr4[]{r3}
            java.lang.String r3 = "ra_setup_completed"
            r2.H0(r3, r0)
            sz1$c r0 = r2.O
            sz1$c r3 = defpackage.sz1.c.LEGACY
            if (r0 != r3) goto L609
            hz1 r0 = new hz1
            r3 = 26
            r13 = 0
            r0.<init>(r3, r13, r2)
            r4 = 3
            defpackage.hv.L(r12, r13, r13, r0, r4)
        L609:
            r7 = 0
            r2.K = r7
            java.lang.Object r0 = r15.A
            uz1 r0 = (defpackage.uz1) r0
            sz1$d r0 = r0.b
            sz1$d r3 = defpackage.sz1.d.HARDCORE
            if (r0 != r3) goto L619
            q77 r0 = defpackage.q77.HARDCORE
            goto L61b
        L619:
            q77 r0 = defpackage.q77.SOFTCORE
        L61b:
            p77 r4 = new p77
            r4.<init>(r0, r7, r7)
            r10 = r21
            r10.k(r4)
            java.lang.Object r0 = r15.A
            uz1 r0 = (defpackage.uz1) r0
            sz1$d r0 = r0.b
            if (r0 != r3) goto L62f
            r6 = 1
            goto L630
        L62f:
            r6 = r7
        L630:
            r1.g0 = r12
            r13 = 0
            r1.X = r13
            r0 = 6
            r1.f0 = r0
            java.lang.Object r0 = defpackage.sz1.m(r2, r5, r6, r1)
            if (r0 != r8) goto L640
            goto L825
        L640:
            r0 = r12
        L641:
            boolean r3 = defpackage.g04.H(r0)
            if (r3 == 0) goto L814
            jf4 r3 = r2.o
            boolean r3 = r3.a()
            if (r3 != 0) goto L67b
            r1.g0 = r0
            r13 = 0
            r1.X = r13
            r1.Y = r13
            r3 = 7
            r1.f0 = r3
            java.lang.Object r3 = r2.f1(r1)
            if (r3 != r8) goto L661
            goto L825
        L661:
            jd1 r3 = defpackage.oq1.B
            uq1 r3 = defpackage.uq1.SECONDS
            r4 = 15
            long r5 = defpackage.n16.L(r4, r3)
            r1.g0 = r0
            r1.X = r13
            r3 = 8
            r1.f0 = r3
            java.lang.Object r3 = defpackage.q60.u(r5, r1)
            if (r3 != r8) goto L641
            goto L825
        L67b:
            r4 = 15
            r13 = 0
            sz1$b r3 = r2.G
            sz1$b r5 = defpackage.sz1.b.OFFLINE_ACCUMULATING
            if (r3 == r5) goto L688
            sz1$b r5 = defpackage.sz1.b.RECONCILING_RA_SUBMISSIONS
            if (r3 != r5) goto L691
        L688:
            r5 = r11
            r6 = r13
            r7 = r58
            r11 = r2
            r2 = r31
            goto L7d8
        L691:
            boolean r3 = r2.K
            if (r3 != 0) goto L725
            java.lang.Object r3 = r15.A
            uz1 r3 = (defpackage.uz1) r3
            sz1$d r3 = r3.b
            sz1$d r5 = defpackage.sz1.d.HARDCORE
            if (r3 != r5) goto L6a1
            r12 = 1
            goto L6a2
        L6a1:
            r12 = r7
        L6a2:
            xe1 r3 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            e12 r9 = new e12
            r14 = 2
            r10 = r2
            r2 = r31
            r9.<init>(r10, r11, r12, r13, r14)
            r5 = r11
            r6 = r13
            r1.g0 = r0
            r1.X = r6
            r1.Y = r6
            r1.d0 = r12
            r11 = 10
            r1.f0 = r11
            java.lang.Object r3 = defpackage.hv.d0(r3, r9, r1)
            if (r3 != r8) goto L6c5
            goto L825
        L6c5:
            r13 = r0
            r0 = r12
        L6c7:
            hm5 r3 = (defpackage.hm5) r3
            java.lang.Object r3 = r3.A
            boolean r9 = r3 instanceof defpackage.em5
            if (r9 == 0) goto L71f
            java.lang.Throwable r3 = defpackage.hm5.a(r3)
            boolean r3 = r3 instanceof defpackage.sj7
            if (r3 == 0) goto L6f9
            oa5 r3 = new oa5
            r3.<init>(r2)
            r9 = r58
            r9.k(r3)
            r1.g0 = r6
            r1.X = r6
            r1.Y = r6
            r1.d0 = r0
            r0 = 11
            r1.f0 = r0
            x61 r0 = defpackage.q60.j(r1)
            if (r0 != r8) goto L6f5
            goto L825
        L6f5:
            defpackage.e41.c()
            return r18
        L6f9:
            r9 = r58
            jd1 r3 = defpackage.oq1.B
            uq1 r3 = defpackage.uq1.SECONDS
            long r11 = defpackage.n16.L(r4, r3)
            r1.g0 = r13
            r1.X = r6
            r1.Y = r6
            r1.d0 = r0
            r0 = 12
            r1.f0 = r0
            java.lang.Object r0 = defpackage.q60.u(r11, r1)
            if (r0 != r8) goto L136
            goto L825
        L717:
            r31 = r2
            r11 = r5
            r58 = r9
            r2 = r10
            goto L641
        L71f:
            r9 = r58
            r3 = 1
            r10.K = r3
            goto L72d
        L725:
            r10 = r2
            r5 = r11
            r6 = r13
            r2 = r31
            r9 = r58
            r13 = r0
        L72d:
            jd1 r0 = defpackage.oq1.B
            uq1 r0 = defpackage.uq1.MINUTES
            r3 = 2
            long r11 = defpackage.n16.L(r3, r0)
            r1.g0 = r13
            r1.X = r6
            r1.Y = r6
            r0 = 13
            r1.f0 = r0
            java.lang.Object r0 = defpackage.q60.u(r11, r1)
            if (r0 != r8) goto L748
            goto L825
        L748:
            java.lang.Object r0 = r15.A
            uz1 r0 = (defpackage.uz1) r0
            sz1$d r0 = r0.b
            sz1$d r11 = defpackage.sz1.d.HARDCORE
            if (r0 != r11) goto L754
            r0 = 1
            goto L755
        L754:
            r0 = r7
        L755:
            if (r0 == 0) goto L788
            nv4 r11 = r10.b0
            if (r11 == 0) goto L76e
            de5 r11 = r11.i
            if (r11 == 0) goto L76e
            rp6 r11 = r11.A
            java.lang.Object r11 = r11.getValue()
            bv4 r11 = (defpackage.bv4) r11
            if (r11 == 0) goto L76e
            lc5 r11 = r11.c
            int r11 = r11.a
            goto L76f
        L76e:
            r11 = r7
        L76f:
            if (r11 <= 0) goto L785
            fd5 r11 = defpackage.fd5.BEFORE_ONLINE_SUBMISSION
            r1.g0 = r13
            r1.X = r6
            r1.d0 = r0
            r12 = 14
            r1.f0 = r12
            java.lang.Object r11 = r10.d1(r11, r1)
            if (r11 != r8) goto L785
            goto L825
        L785:
            r12 = r26
            goto L793
        L788:
            ci0 r11 = r10.x
            java.lang.Object r11 = r11.h
            v80 r11 = (defpackage.v80) r11
            r12 = r26
            r11.c(r12)
        L793:
            me.magnum.melonds.MelonEmulator r11 = me.magnum.melonds.MelonEmulator.a
            java.lang.String r11 = r11.getRichPresenceStatus()
            xe1 r14 = defpackage.xk1.a
            de1 r14 = defpackage.de1.L
            r55 = r9
            f12 r9 = new f12
            r26 = r12
            if (r0 == 0) goto L7a9
            r12 = 1
        L7a6:
            r16 = r14
            goto L7ab
        L7a9:
            r12 = r7
            goto L7a6
        L7ab:
            r14 = 0
            r17 = r13
            r13 = r11
            pq5 r11 = r1.k0
            r59 = r16
            r3 = r17
            r7 = r55
            r9.<init>(r10, r11, r12, r13, r14)
            r11 = r10
            r1.g0 = r3
            r1.X = r6
            r1.Y = r6
            r1.d0 = r0
            r1.f0 = r4
            r0 = r59
            java.lang.Object r0 = defpackage.hv.d0(r0, r9, r1)
            if (r0 != r8) goto L7ce
            goto L825
        L7ce:
            r0 = r3
        L7cf:
            r31 = r2
            r58 = r7
            r2 = r11
            r7 = 0
            r11 = r5
            goto L641
        L7d8:
            jd1 r3 = defpackage.oq1.B
            uq1 r3 = defpackage.uq1.SECONDS
            r9 = 5
            long r12 = defpackage.n16.L(r9, r3)
            r1.g0 = r0
            r1.X = r6
            r1.Y = r6
            r3 = 9
            r1.f0 = r3
            java.lang.Object r3 = defpackage.q60.u(r12, r1)
            if (r3 != r8) goto L7cf
            goto L825
        L7f2:
            r0 = move-exception
            r11 = r2
        L7f4:
            r2 = r31
            r7 = r58
            r9 = 5
            r13 = 0
            goto L800
        L7fb:
            r0 = move-exception
            r11 = r2
            r5 = r17
            goto L7f4
        L800:
            dz1 r3 = new dz1
            r4 = 3
            r3.<init>(r11, r4)
            java.lang.String r4 = "native_setup_failed"
            r14 = r22
            boolean r3 = r11.h1(r14, r4, r3)
            if (r3 != 0) goto L816
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L815
        L814:
            return r26
        L815:
            throw r0
        L816:
            r1.g0 = r13
            r1.X = r6
            r1.Y = r0
            r1.f0 = r9
            r3 = 1
            java.lang.Object r1 = r11.g0(r4, r3, r1)
            if (r1 != r8) goto L826
        L825:
            return r8
        L826:
            r1 = r6
            goto L1b6
        L829:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L86f
            r31 = r2
            java.lang.String r2 = "native_setup_failed"
            sz1$c r3 = r11.O
            r4 = r5
            r12 = r31
            r5 = r1
            r1 = r11
            r1.E0(r2, r3, r4, r5, r6)
            r2 = r1
            sz1$c r0 = r2.O
            java.lang.String r0 = r0.name()
            vr4 r1 = new vr4
            r1.<init>(r10, r0)
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getSimpleName()
            vr4 r3 = new vr4
            r6 = r20
            r3.<init>(r6, r0)
            vr4[] r0 = new defpackage.vr4[]{r1, r3}
            r1 = r35
            r2.H0(r1, r0)
            dp2 r0 = defpackage.dp2.DISABLED_LOAD_ERROR
            r1 = r23
            r1.d(r0)
            la5 r0 = new la5
            r0.<init>(r12)
            r7.k(r0)
            return r26
        L86f:
            throw r6
    }
}
