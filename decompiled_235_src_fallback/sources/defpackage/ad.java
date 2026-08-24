package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ad  reason: default package */
/* loaded from: classes.dex */
public final class ad extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;

    public /* synthetic */ ad(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r1 = 1
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.X
            java.lang.Object r1 = r11.d0
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r3 = r11.e0
            java.lang.Object r4 = r11.Z
            switch(r0) {
                case 0: goto L80;
                case 1: goto L69;
                case 2: goto L52;
                case 3: goto L3b;
                case 4: goto L24;
                default: goto Ld;
            }
        Ld:
            r9 = r12
            r41 r9 = (defpackage.r41) r9
            ad r5 = new ad
            r6 = r4
            ri7 r6 = (defpackage.ri7) r6
            r7 = r1
            kd0 r7 = (defpackage.kd0) r7
            r8 = r3
            java.util.Map r8 = (java.util.Map) r8
            r10 = 5
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r11 = r5.s(r2)
            return r11
        L24:
            r7 = r12
            r41 r7 = (defpackage.r41) r7
            r0 = r3
            ad r3 = new ad
            ri7 r4 = (defpackage.ri7) r4
            r5 = r1
            ki7 r5 = (defpackage.ki7) r5
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            r8 = 4
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r3.s(r2)
            return r11
        L3b:
            r0 = r3
            r7 = r12
            r41 r7 = (defpackage.r41) r7
            ad r3 = new ad
            me.magnum.melonds.debug.ReleaseStateCommandReceiver r4 = (me.magnum.melonds.debug.ReleaseStateCommandReceiver) r4
            r5 = r1
            android.content.Context r5 = (android.content.Context) r5
            r6 = r0
            android.content.Intent r6 = (android.content.Intent) r6
            r8 = 3
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r3.s(r2)
            return r11
        L52:
            r0 = r3
            r7 = r12
            r41 r7 = (defpackage.r41) r7
            ad r3 = new ad
            ft4 r4 = (defpackage.ft4) r4
            r5 = r1
            c97 r5 = (defpackage.c97) r5
            r6 = r0
            eo2 r6 = (defpackage.eo2) r6
            r8 = 2
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r3.s(r2)
            return r11
        L69:
            r0 = r3
            r7 = r12
            r41 r7 = (defpackage.r41) r7
            ad r3 = new ad
            sz1 r4 = (defpackage.sz1) r4
            r5 = r1
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r5 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r5
            r6 = r0
            nv4 r6 = (defpackage.nv4) r6
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r3.s(r2)
            return r11
        L80:
            r0 = r3
            r7 = r12
            r41 r7 = (defpackage.r41) r7
            ad r3 = new ad
            dd r4 = (defpackage.dd) r4
            r6 = r0
            go2 r6 = (defpackage.go2) r6
            r8 = 0
            java.lang.Object r5 = r11.d0
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r3.s(r2)
            return r11
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r51) {
            r50 = this;
            r1 = r50
            int r0 = r1.X
            jg7 r3 = defpackage.jg7.a
            r4 = 12
            java.lang.String r5 = "CXCP"
            r7 = 0
            java.lang.Object r8 = r1.e0
            java.lang.Object r9 = r1.d0
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r11 = 1
            java.lang.Object r12 = r1.Z
            r13 = 0
            switch(r0) {
                case 0: goto Lc43;
                case 1: goto Lc1b;
                case 2: goto Lbf3;
                case 3: goto L10a;
                case 4: goto L6b;
                default: goto L18;
            }
        L18:
            ri7 r12 = (defpackage.ri7) r12
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L2d
            if (r2 != r11) goto L28
            defpackage.oi2.Y(r51)
            r0 = r51
            goto L6a
        L28:
            defpackage.i.m(r10)
            r0 = r13
            goto L6a
        L2d:
            defpackage.oi2.Y(r51)
            boolean r2 = defpackage.kj2.F(r5)
            if (r2 == 0) goto L3b
            java.lang.String r2 = "UseCaseCameraRequestControlImpl#updateCamera2ConfigAsync"
            android.util.Log.d(r5, r2)
        L3b:
            java.util.LinkedHashMap r2 = r12.k
            ki7 r3 = defpackage.ki7.CAMERA2_CAMERA_CONTROL
            ni7 r5 = new ni7
            tu0 r6 = defpackage.ri7.l
            kd0 r9 = (defpackage.kd0) r9
            jd0 r6 = new jd0
            r6.<init>(r7)
            r6.b(r9)
            java.util.Map r8 = (java.util.Map) r8
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r8)
            r5.<init>(r6, r7, r13, r4)
            r2.put(r3, r5)
            java.util.LinkedHashMap r2 = r12.k
            ni7 r2 = defpackage.ri7.l(r2)
            r1.Y = r11
            java.lang.Object r1 = r12.n(r2, r13, r1)
            if (r1 != r0) goto L69
            goto L6a
        L69:
            r0 = r1
        L6a:
            return r0
        L6b:
            ri7 r12 = (defpackage.ri7) r12
            java.util.LinkedHashMap r0 = r12.k
            java.util.List r8 = (java.util.List) r8
            ki7 r9 = (defpackage.ki7) r9
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L88
            if (r3 != r11) goto L82
            defpackage.oi2.Y(r51)
            r0 = r51
            goto L109
        L82:
            defpackage.i.m(r10)
            r0 = r13
            goto L109
        L88:
            defpackage.oi2.Y(r51)
            boolean r3 = defpackage.kj2.F(r5)
            if (r3 == 0) goto Laa
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "UseCaseCameraRequestControlImpl#removeParametersAsync: ["
            r3.<init>(r4)
            r3.append(r9)
            java.lang.String r4 = "] keys = "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        Laa:
            java.lang.Object r3 = r0.get(r9)
            if (r3 != 0) goto Lba
            ni7 r3 = new ni7
            r4 = 15
            r3.<init>(r13, r13, r13, r4)
            r0.put(r9, r3)
        Lba:
            ni7 r3 = (defpackage.ni7) r3
            jd0 r4 = new jd0
            r4.<init>(r7)
            jd0 r5 = r3.a
            da4 r5 = r5.B
            r4.b(r5)
            java.util.Iterator r5 = r8.iterator()
        Lcc:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Le2
            java.lang.Object r6 = r5.next()
            android.hardware.camera2.CaptureRequest$Key r6 = (android.hardware.camera2.CaptureRequest.Key) r6
            xx r6 = defpackage.nw7.T(r6)
            da4 r7 = r4.B
            r7.n(r6)
            goto Lcc
        Le2:
            java.util.Map r5 = r3.b
            java.util.LinkedHashMap r5 = defpackage.c14.t0(r5)
            java.util.Set r6 = r3.c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r6 = defpackage.gt0.o1(r6)
            bl5 r3 = r3.d
            ni7 r7 = new ni7
            r7.<init>(r4, r5, r6, r3)
            r0.put(r9, r7)
            java.util.LinkedHashMap r0 = r12.k
            ni7 r0 = defpackage.ri7.l(r0)
            r1.Y = r11
            java.lang.Object r0 = r12.n(r0, r13, r1)
            if (r0 != r2) goto L109
            r0 = r2
        L109:
            return r0
        L10a:
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r1.Y
            if (r0 == 0) goto L11d
            if (r0 != r11) goto L117
            defpackage.oi2.Y(r51)
            goto Lbf2
        L117:
            defpackage.i.m(r10)
            r3 = r13
            goto Lbf2
        L11d:
            defpackage.oi2.Y(r51)
            me.magnum.melonds.debug.ReleaseStateCommandReceiver r12 = (me.magnum.melonds.debug.ReleaseStateCommandReceiver) r12
            android.content.Context r9 = (android.content.Context) r9
            android.content.Context r9 = r9.getApplicationContext()
            r9.getClass()
            android.content.Intent r8 = (android.content.Intent) r8
            r1.Y = r11
            o41 r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a
            java.lang.String r10 = "enabled"
            java.lang.String r14 = "DebugCommand"
            android.content.Context r0 = r9.getApplicationContext()
            if (r0 == 0) goto Lbed
            java.lang.Class<gc1> r15 = defpackage.gc1.class
            java.lang.Object r0 = defpackage.hv.D(r0, r15)
            gc1 r0 = (defpackage.gc1) r0
            r15 = r0
            sb1 r15 = (defpackage.sb1) r15
            android.content.SharedPreferences r0 = r15.a()
            r16 = r4
            java.lang.String r4 = "video_renderer_debug_tools_enabled"
            r17 = 5
            boolean r2 = r0.getBoolean(r4, r7)
            java.lang.String r0 = "debug.melonds.release_state_commands"
            r18 = r7
            java.lang.ProcessBuilder r7 = new java.lang.ProcessBuilder     // Catch: java.lang.Exception -> L1f5
            java.lang.String r13 = "/system/bin/getprop"
            java.lang.String[] r0 = new java.lang.String[]{r13, r0}     // Catch: java.lang.Exception -> L1f5
            r7.<init>(r0)     // Catch: java.lang.Exception -> L1f5
            java.lang.ProcessBuilder r0 = r7.redirectErrorStream(r11)     // Catch: java.lang.Exception -> L1f5
            java.lang.Process r0 = r0.start()     // Catch: java.lang.Exception -> L1f5
            java.io.InputStream r7 = r0.getInputStream()     // Catch: java.lang.Exception -> L1f5
            r7.getClass()     // Catch: java.lang.Exception -> L1f5
            java.nio.charset.Charset r13 = defpackage.qm0.a     // Catch: java.lang.Exception -> L1f5
            r19 = 4
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L1c5
            r6.<init>(r7, r13)     // Catch: java.lang.Exception -> L1c5
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L1c5
            r13 = 8192(0x2000, float:1.148E-41)
            r7.<init>(r6, r13)     // Catch: java.lang.Exception -> L1c5
            java.lang.String r6 = defpackage.yh2.E(r7)     // Catch: java.lang.Throwable -> L1ed
            java.lang.CharSequence r6 = defpackage.qs6.T0(r6)     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1ed
            r7.close()     // Catch: java.lang.Exception -> L1c5
            r0.waitFor()     // Catch: java.lang.Exception -> L1c5
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Exception -> L1c5
            r0.getClass()     // Catch: java.lang.Exception -> L1c5
            java.lang.String r0 = r6.toLowerCase(r0)     // Catch: java.lang.Exception -> L1c5
            r0.getClass()     // Catch: java.lang.Exception -> L1c5
            int r6 = r0.hashCode()     // Catch: java.lang.Exception -> L1c5
            r7 = -1609594047(0xffffffffa00f8b41, float:-1.2158646E-19)
            if (r6 == r7) goto L1e2
            r7 = 49
            if (r6 == r7) goto L1d9
            r7 = 3551(0xddf, float:4.976E-42)
            if (r6 == r7) goto L1d0
            r7 = 119527(0x1d2e7, float:1.67493E-40)
            if (r6 == r7) goto L1c7
            r7 = 3569038(0x36758e, float:5.001287E-39)
            if (r6 == r7) goto L1bc
            goto L1e8
        L1bc:
            java.lang.String r6 = "true"
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Exception -> L1c5
            if (r0 != 0) goto L1eb
            goto L1e8
        L1c5:
            r0 = move-exception
            goto L1f8
        L1c7:
            java.lang.String r6 = "yes"
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Exception -> L1c5
            if (r0 != 0) goto L1eb
            goto L1e8
        L1d0:
            java.lang.String r6 = "on"
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Exception -> L1c5
            if (r0 == 0) goto L1e8
            goto L1eb
        L1d9:
            java.lang.String r6 = "1"
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Exception -> L1c5
            if (r0 != 0) goto L1eb
            goto L1e8
        L1e2:
            boolean r0 = r0.equals(r10)     // Catch: java.lang.Exception -> L1c5
            if (r0 != 0) goto L1eb
        L1e8:
            r0 = r18
            goto L1fe
        L1eb:
            r0 = r11
            goto L1fe
        L1ed:
            r0 = move-exception
            r6 = r0
            throw r6     // Catch: java.lang.Throwable -> L1f0
        L1f0:
            r0 = move-exception
            defpackage.ge7.t(r7, r6)     // Catch: java.lang.Exception -> L1c5
            throw r0     // Catch: java.lang.Exception -> L1c5
        L1f5:
            r0 = move-exception
            r19 = 4
        L1f8:
            java.lang.String r6 = "Failed to read system property key=debug.melonds.release_state_commands"
            android.util.Log.w(r14, r6, r0)
            goto L1e8
        L1fe:
            if (r0 == 0) goto Lbb1
            java.lang.String r6 = "DUMP_RENDERER_CAPTURE"
            java.lang.String r7 = "STEP_FRAMES"
            java.lang.String r13 = "STEP_FRAME"
            java.lang.String r11 = "SET_DEBUG_PAUSE"
            r21 = r3
            java.lang.String r3 = "WAIT_ROM_READY"
            r22 = r5
            java.lang.String r5 = "LAUNCH_ROM"
            r51 = r0
            java.lang.String r0 = "SET_RENDERER_3D_DEBUG_CONTROLS"
            r23 = r2
            java.lang.String r2 = "SET_RENDERER_2D_DEBUG_CONTROLS"
            java.lang.String r1 = "SET_BGOBJ_LOG"
            r24 = r12
            java.lang.String r12 = "GET_FPS"
            r25 = r15
            java.lang.String r15 = "SET_JIT"
            r26 = r4
            java.lang.String r4 = "SET_FRAME_LIMIT_SPEED"
            r27 = r10
            java.lang.String r10 = "SET_FAST_FORWARD"
            r28 = r14
            java.lang.String r14 = "SET_RETROACHIEVEMENTS"
            r29 = r8
            java.lang.String r8 = "SET_ROM_RUNTIME_CONSOLE"
            r30 = r6
            java.lang.String r6 = "SET_IR"
            r31 = r7
            java.lang.String r7 = "SET_RENDERER_DEBUG_TOOLS"
            r32 = r13
            java.lang.String r13 = "SET_RENDERER"
            if (r23 != 0) goto L348
            r33 = r11
            java.lang.String r11 = r29.getAction()
            r34 = r3
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r13)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r7)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r6)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r8)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r14)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r10)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r4)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r15)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r12)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r1)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r2)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r5)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L33b
            r3 = r34
            r34 = r5
            java.lang.String r5 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r3)
            boolean r5 = defpackage.nb3.k(r11, r5)
            if (r5 != 0) goto L32e
            r5 = r33
            r33 = r3
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r5)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L325
            r3 = r32
            r32 = r5
            java.lang.String r5 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r3)
            boolean r5 = defpackage.nb3.k(r11, r5)
            if (r5 != 0) goto L31c
            r5 = r31
            r31 = r3
            java.lang.String r3 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r5)
            boolean r3 = defpackage.nb3.k(r11, r3)
            if (r3 != 0) goto L317
            r3 = r30
            r30 = r5
            java.lang.String r5 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r3)
            boolean r5 = defpackage.nb3.k(r11, r5)
            if (r5 == 0) goto L311
            goto L354
        L311:
            r3 = r28
            r13 = r29
            goto Lbbb
        L317:
            r3 = r30
            r30 = r5
            goto L354
        L31c:
            r49 = r31
            r31 = r3
            r3 = r30
            r30 = r49
            goto L354
        L325:
            r3 = r30
            r30 = r31
            r31 = r32
            r32 = r5
            goto L354
        L32e:
            r49 = r33
            r33 = r3
            r3 = r30
            r30 = r31
            r31 = r32
            r32 = r49
            goto L354
        L33b:
            r3 = r30
            r30 = r31
            r31 = r32
            r32 = r33
            r33 = r34
            r34 = r5
            goto L354
        L348:
            r33 = r3
            r34 = r5
            r3 = r30
            r30 = r31
            r31 = r32
            r32 = r11
        L354:
            java.lang.String r5 = r29.getAction()
            java.lang.String r11 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r13)
            boolean r11 = defpackage.nb3.k(r5, r11)
            java.lang.String r13 = "unchanged"
            r51 = r11
            java.lang.String r11 = "value"
            if (r51 == 0) goto L46a
            java.lang.String r0 = "renderer"
            java.lang.String[] r0 = new java.lang.String[]{r0, r11}
            r1 = r29
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.d(r1, r0)
            if (r0 == 0) goto L464
            java.lang.CharSequence r2 = defpackage.qs6.T0(r0)
            java.lang.String r2 = r2.toString()
            java.util.Locale r3 = java.util.Locale.US
            r3.getClass()
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            int r4 = r2.hashCode()
            switch(r4) {
                case -1010579281: goto L3d0;
                case -805352149: goto L3c4;
                case 3301: goto L3bb;
                case 3765: goto L3b2;
                case 3535914: goto L3a7;
                case 950503479: goto L39b;
                case 1319330215: goto L392;
                default: goto L391;
            }
        L391:
            goto L3d8
        L392:
            java.lang.String r4 = "software"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L3af
            goto L3d8
        L39b:
            java.lang.String r4 = "compute"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L3a4
            goto L3d8
        L3a4:
            me.magnum.melonds.domain.model.VideoRenderer r2 = me.magnum.melonds.domain.model.VideoRenderer.COMPUTE
            goto L3dc
        L3a7:
            java.lang.String r4 = "soft"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L3d8
        L3af:
            me.magnum.melonds.domain.model.VideoRenderer r2 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE
            goto L3dc
        L3b2:
            java.lang.String r4 = "vk"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L3cd
            goto L3d8
        L3bb:
            java.lang.String r4 = "gl"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L3da
            goto L3d8
        L3c4:
            java.lang.String r4 = "vulkan"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L3cd
            goto L3d8
        L3cd:
            me.magnum.melonds.domain.model.VideoRenderer r2 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            goto L3dc
        L3d0:
            java.lang.String r4 = "opengl"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L3da
        L3d8:
            r2 = 0
            goto L3dc
        L3da:
            me.magnum.melonds.domain.model.VideoRenderer r2 = me.magnum.melonds.domain.model.VideoRenderer.OPENGL
        L3dc:
            if (r2 == 0) goto L458
            java.lang.String r0 = "fastpath_enabled"
            java.lang.String r4 = "fastpath"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            java.lang.Boolean r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(r1, r0)
            android.content.SharedPreferences r1 = r25.a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r5 = r2.name()
            java.lang.String r5 = r5.toLowerCase(r3)
            r5.getClass()
            java.lang.String r6 = "video_renderer"
            r1.putString(r6, r5)
            if (r0 == 0) goto L40d
            boolean r5 = r0.booleanValue()
            java.lang.String r6 = "video_vulkan_fastpath_enabled"
            r1.putBoolean(r6, r5)
        L40d:
            r1.commit()
            lc1 r1 = defpackage.lc1.a
            boolean r1 = defpackage.lc1.c()
            if (r0 == 0) goto L422
            boolean r5 = r0.booleanValue()
            if (r5 == 0) goto L41f
            goto L423
        L41f:
            java.lang.String r4 = "compatibility"
            goto L423
        L422:
            r4 = r13
        L423:
            java.lang.String r2 = r2.name()
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            if (r0 == 0) goto L438
            boolean r0 = r0.booleanValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L438:
            java.lang.String r0 = " profile="
            java.lang.String r3 = " fastPath="
            java.lang.String r5 = "action=set_renderer mode=release renderer="
            java.lang.StringBuilder r0 = defpackage.i61.u(r5, r2, r0, r4, r3)
            r0.append(r13)
            java.lang.String r2 = " applies=next_session refreshed="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r28
            android.util.Log.w(r1, r0)
            goto L57b
        L458:
            java.lang.String r1 = "Unsupported renderer="
            java.lang.String r0 = r1.concat(r0)
            defpackage.i.h(r0)
        L461:
            r3 = 0
            goto Lbf2
        L464:
            java.lang.String r0 = "Missing renderer extra"
            defpackage.i.h(r0)
            goto L461
        L46a:
            r51 = r28
            r28 = r3
            r3 = r51
            r51 = r13
            r13 = r29
            java.lang.String r7 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r7)
            boolean r7 = defpackage.nb3.k(r5, r7)
            java.lang.String r23 = "Missing enabled extra"
            r29 = r7
            java.lang.String r7 = " refreshed="
            if (r29 == 0) goto L4f2
            r2 = r27
            java.lang.String[] r0 = new java.lang.String[]{r2, r11}
            java.lang.Boolean r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(r13, r0)
            if (r0 == 0) goto L4ed
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "latch_trace_enabled"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.Boolean r1 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(r13, r1)
            android.content.SharedPreferences r2 = r25.a()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r4 = r26
            r2.putBoolean(r4, r0)
            if (r1 == 0) goto L4b6
            boolean r4 = r1.booleanValue()
            java.lang.String r5 = "video_renderer_debug_latch_trace_enabled"
            r2.putBoolean(r5, r4)
        L4b6:
            r2.commit()
            lc1 r2 = defpackage.lc1.a
            boolean r2 = defpackage.lc1.c()
            if (r1 == 0) goto L4ca
            boolean r1 = r1.booleanValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            goto L4cc
        L4ca:
            r13 = r51
        L4cc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "action=set_renderer_debug_tools mode=release enabled="
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = " latchTrace="
            r1.append(r0)
            r1.append(r13)
            r1.append(r7)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        L4ed:
            defpackage.i.h(r23)
            goto L461
        L4f2:
            r29 = r2
            r2 = r27
            java.lang.String r6 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r6)
            boolean r6 = defpackage.nb3.k(r5, r6)
            r26 = r6
            r6 = 9
            if (r26 == 0) goto L55f
            java.lang.String r0 = "scale"
            java.lang.String r1 = "ir"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r11}
            java.lang.Integer r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r0)
            if (r0 == 0) goto L558
            int r0 = r0.intValue()
            r1 = 1
            if (r1 > r0) goto L54d
            if (r0 >= r6) goto L54d
            android.content.SharedPreferences r1 = r25.a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "video_internal_resolution"
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r1.putString(r2, r4)
            r1.commit()
            lc1 r1 = defpackage.lc1.a
            boolean r1 = defpackage.lc1.c()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "action=set_ir mode=release scale="
            r2.<init>(r4)
            r2.append(r0)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        L54d:
            java.lang.String r1 = "Unsupported internal resolution="
            java.lang.String r0 = defpackage.lb1.g(r0, r1)
            defpackage.i.f(r0)
            goto L461
        L558:
            java.lang.String r0 = "Missing internal resolution extra"
            defpackage.i.h(r0)
            goto L461
        L55f:
            java.lang.String r8 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r8)
            boolean r8 = defpackage.nb3.k(r5, r8)
            if (r8 == 0) goto L57e
            r8 = r50
            r6 = r24
            r1 = r25
            java.lang.Object r0 = r6.k(r1, r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
        L577:
            r1 = r22
            goto Lbe6
        L57b:
            r0 = r21
            goto L577
        L57e:
            r8 = r25
            r25 = r1
            r1 = r8
            r8 = r24
            r24 = r6
            r6 = r8
            r8 = r50
            java.lang.String r14 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r14)
            boolean r14 = defpackage.nb3.k(r5, r14)
            if (r14 == 0) goto L616
            java.lang.String r0 = "ra_enabled"
            java.lang.String[] r2 = new java.lang.String[]{r0, r2}
            java.lang.Boolean r2 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(r13, r2)
            java.lang.String r4 = "hardcore_enabled"
            java.lang.String r5 = "hardcore"
            java.lang.String r6 = "ra_hardcore_enabled"
            java.lang.String[] r4 = new java.lang.String[]{r6, r4, r5}
            java.lang.Boolean r4 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(r13, r4)
            if (r2 != 0) goto L5b8
            if (r4 == 0) goto L5b1
            goto L5b8
        L5b1:
            java.lang.String r0 = "Missing RetroAchievements setting extra"
            defpackage.i.h(r0)
            goto L461
        L5b8:
            android.content.SharedPreferences r1 = r1.a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r2 == 0) goto L5c9
            boolean r5 = r2.booleanValue()
            r1.putBoolean(r0, r5)
        L5c9:
            if (r4 == 0) goto L5d2
            boolean r0 = r4.booleanValue()
            r1.putBoolean(r6, r0)
        L5d2:
            r1.commit()
            lc1 r0 = defpackage.lc1.a
            boolean r0 = defpackage.lc1.c()
            if (r2 == 0) goto L5e6
            boolean r1 = r2.booleanValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L5e8
        L5e6:
            r1 = r51
        L5e8:
            if (r4 == 0) goto L5f3
            boolean r2 = r4.booleanValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            goto L5f5
        L5f3:
            r13 = r51
        L5f5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "action=set_retroachievements mode=release enabled="
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = " hardcore="
            r2.append(r1)
            r2.append(r13)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        L616:
            java.lang.String r10 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r10)
            boolean r10 = defpackage.nb3.k(r5, r10)
            me.magnum.melonds.MelonEmulator r14 = me.magnum.melonds.MelonEmulator.a
            if (r10 == 0) goto L64b
            java.lang.String[] r0 = new java.lang.String[]{r2, r11}
            java.lang.Boolean r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(r13, r0)
            if (r0 == 0) goto L646
            boolean r0 = r0.booleanValue()
            r14.setFastForwardEnabled(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "action=set_fast_forward mode=release enabled="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        L646:
            defpackage.i.h(r23)
            goto L461
        L64b:
            java.lang.String r4 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r4)
            boolean r4 = defpackage.nb3.k(r5, r4)
            r10 = 3
            if (r4 == 0) goto L71e
            java.lang.String r0 = "multiplier"
            java.lang.String r2 = "speed"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2, r11}
            r2 = r18
        L660:
            if (r2 >= r10) goto L6b6
            r4 = r0[r2]
            boolean r5 = r13.hasExtra(r4)
            if (r5 != 0) goto L66b
            goto L6b3
        L66b:
            android.os.Bundle r5 = r13.getExtras()
            if (r5 == 0) goto L676
            java.lang.Object r4 = r5.get(r4)
            goto L677
        L676:
            r4 = 0
        L677:
            boolean r5 = r4 instanceof java.lang.Float
            if (r5 == 0) goto L67e
            java.lang.Float r4 = (java.lang.Float) r4
            goto L6b7
        L67e:
            boolean r5 = r4 instanceof java.lang.Double
            if (r5 == 0) goto L68e
            java.lang.Number r4 = (java.lang.Number) r4
            double r4 = r4.doubleValue()
            float r0 = (float) r4
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            goto L6b7
        L68e:
            boolean r5 = r4 instanceof java.lang.Integer
            if (r5 == 0) goto L69e
            java.lang.Number r4 = (java.lang.Number) r4
            int r0 = r4.intValue()
            float r0 = (float) r0
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            goto L6b7
        L69e:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L6b3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Float r4 = defpackage.ws6.U(r4)
            if (r4 == 0) goto L6b3
            float r0 = r4.floatValue()
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            goto L6b7
        L6b3:
            int r2 = r2 + 1
            goto L660
        L6b6:
            r4 = 0
        L6b7:
            if (r4 == 0) goto L717
            float r0 = r4.floatValue()
            r2 = 1048576000(0x3e800000, float:0.25)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L6ff
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L6ff
            android.content.SharedPreferences r1 = r1.a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "frame_limit_speed_multiplier"
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r1.putString(r2, r4)
            r1.commit()
            r14.setFrameLimitSpeedMultiplier(r0)
            lc1 r1 = defpackage.lc1.a
            boolean r1 = defpackage.lc1.c()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "action=set_frame_limit_speed mode=release multiplier="
            r2.<init>(r4)
            r2.append(r0)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        L6ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported frame limit speed="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L717:
            java.lang.String r0 = "Missing frame limit speed extra"
            defpackage.i.h(r0)
            goto L461
        L71e:
            java.lang.String r4 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r15)
            boolean r4 = defpackage.nb3.k(r5, r4)
            if (r4 == 0) goto L76a
            java.lang.String[] r0 = new java.lang.String[]{r2, r11}
            java.lang.Boolean r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(r13, r0)
            if (r0 == 0) goto L765
            boolean r0 = r0.booleanValue()
            android.content.SharedPreferences r1 = r1.a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "enable_jit"
            r1.putBoolean(r2, r0)
            r1.commit()
            lc1 r1 = defpackage.lc1.a
            boolean r1 = defpackage.lc1.c()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "action=set_jit mode=release enabled="
            r2.<init>(r4)
            r2.append(r0)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        L765:
            defpackage.i.h(r23)
            goto L461
        L76a:
            java.lang.String r4 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r12)
            boolean r4 = defpackage.nb3.k(r5, r4)
            if (r4 == 0) goto L78b
            float r0 = r14.getFPS()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "action=get_fps mode=release fps="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        L78b:
            r4 = r25
            java.lang.String r4 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r4)
            boolean r4 = defpackage.nb3.k(r5, r4)
            if (r4 == 0) goto L7d9
            java.lang.String[] r0 = new java.lang.String[]{r2, r11}
            java.lang.Boolean r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(r13, r0)
            if (r0 == 0) goto L7d4
            boolean r0 = r0.booleanValue()
            android.content.SharedPreferences r1 = r1.a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "video_renderer_debug_bgobj_enabled"
            r1.putBoolean(r2, r0)
            r1.commit()
            lc1 r1 = defpackage.lc1.a
            boolean r1 = defpackage.lc1.c()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "action=set_bgobj_log mode=release enabled="
            r2.<init>(r4)
            r2.append(r0)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        L7d4:
            defpackage.i.h(r23)
            goto L461
        L7d9:
            r4 = r29
            java.lang.String r4 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r4)
            boolean r4 = defpackage.nb3.k(r5, r4)
            r7 = 6
            java.lang.String r12 = "feature_mask"
            r15 = 524287(0x7ffff, float:7.34683E-40)
            if (r4 == 0) goto L978
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r35 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r0 = r35.getRenderer2DDebugControls()
            r1 = 11
            r2 = 10
            r4 = 8
            r5 = 7
            r6 = 2
            r8 = 13
            if (r0 == 0) goto L801
            int r9 = r0.length
            if (r9 < r8) goto L801
            goto L820
        L801:
            int[] r0 = new int[r8]
            r8 = -1
            r0[r18] = r8
            r20 = 1
            r0[r20] = r8
            r0[r6] = r8
            r0[r10] = r8
            r0[r19] = r18
            r0[r17] = r18
            r0[r7] = r18
            r0[r5] = r18
            r0[r4] = r18
            r0[r24] = r18
            r0[r2] = r18
            r0[r1] = r18
            r0[r16] = r15
        L820:
            java.lang.String[] r8 = new java.lang.String[]{r12}
            java.lang.Integer r8 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r8)
            if (r8 == 0) goto L831
            int r8 = r8.intValue()
        L82e:
            r48 = r8
            goto L834
        L831:
            r8 = r0[r16]
            goto L82e
        L834:
            java.lang.String r8 = "main_forced_mode"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.lang.Integer r8 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r8)
            if (r8 == 0) goto L847
            int r8 = r8.intValue()
        L844:
            r36 = r8
            goto L84a
        L847:
            r8 = r0[r18]
            goto L844
        L84a:
            java.lang.String r8 = "sub_forced_mode"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.lang.Integer r8 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r8)
            if (r8 == 0) goto L85d
            int r8 = r8.intValue()
        L85a:
            r37 = r8
            goto L862
        L85d:
            r20 = 1
            r8 = r0[r20]
            goto L85a
        L862:
            java.lang.String r8 = "top_forced_comp_mode"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.lang.Integer r8 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r8)
            if (r8 == 0) goto L875
            int r6 = r8.intValue()
        L872:
            r38 = r6
            goto L878
        L875:
            r6 = r0[r6]
            goto L872
        L878:
            java.lang.String r6 = "bottom_forced_comp_mode"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.Integer r6 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r6)
            if (r6 == 0) goto L88b
            int r6 = r6.intValue()
        L888:
            r39 = r6
            goto L88e
        L88b:
            r6 = r0[r10]
            goto L888
        L88e:
            java.lang.String r6 = "disabled_main_bg_mask"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.Integer r6 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r6)
            if (r6 == 0) goto L8a1
            int r6 = r6.intValue()
        L89e:
            r40 = r6
            goto L8a4
        L8a1:
            r6 = r0[r19]
            goto L89e
        L8a4:
            java.lang.String r6 = "disabled_sub_bg_mask"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.Integer r6 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r6)
            if (r6 == 0) goto L8b7
            int r6 = r6.intValue()
        L8b4:
            r41 = r6
            goto L8ba
        L8b7:
            r6 = r0[r17]
            goto L8b4
        L8ba:
            java.lang.String r6 = "disabled_main_bg_priority_mask"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.Integer r6 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r6)
            if (r6 == 0) goto L8cd
            int r6 = r6.intValue()
        L8ca:
            r42 = r6
            goto L8d0
        L8cd:
            r6 = r0[r7]
            goto L8ca
        L8d0:
            java.lang.String r6 = "disabled_sub_bg_priority_mask"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.Integer r6 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r6)
            if (r6 == 0) goto L8e3
            int r5 = r6.intValue()
        L8e0:
            r43 = r5
            goto L8e6
        L8e3:
            r5 = r0[r5]
            goto L8e0
        L8e6:
            java.lang.String r5 = "disabled_main_obj_priority_mask"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.Integer r5 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r5)
            if (r5 == 0) goto L8f9
            int r4 = r5.intValue()
        L8f6:
            r44 = r4
            goto L8fc
        L8f9:
            r4 = r0[r4]
            goto L8f6
        L8fc:
            java.lang.String r4 = "disabled_sub_obj_priority_mask"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.Integer r4 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r4)
            if (r4 == 0) goto L90f
            int r4 = r4.intValue()
        L90c:
            r45 = r4
            goto L912
        L90f:
            r4 = r0[r24]
            goto L90c
        L912:
            java.lang.String r4 = "disabled_main_obj_order_mask"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.Integer r4 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r4)
            if (r4 == 0) goto L925
            int r2 = r4.intValue()
        L922:
            r46 = r2
            goto L928
        L925:
            r2 = r0[r2]
            goto L922
        L928:
            java.lang.String r2 = "disabled_sub_obj_order_mask"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.Integer r2 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r2)
            if (r2 == 0) goto L93b
            int r0 = r2.intValue()
        L938:
            r47 = r0
            goto L93e
        L93b:
            r0 = r0[r1]
            goto L938
        L93e:
            r35.setRenderer2DDebugControls(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r0 = r36
            r1 = r37
            r6 = r38
            r2 = r39
            r4 = r40
            r5 = r41
            r8 = r48
            java.lang.String r7 = " mainForcedMode="
            java.lang.String r9 = " subForcedMode="
            java.lang.String r10 = "action=set_renderer_2d_debug_controls mode=release featureMask="
            java.lang.StringBuilder r0 = defpackage.i61.q(r8, r0, r10, r7, r9)
            java.lang.String r7 = " topComp="
            java.lang.String r8 = " bottomComp="
            defpackage.lb1.x(r0, r1, r7, r6, r8)
            java.lang.String r1 = " disabledMainBg="
            java.lang.String r6 = " disabledSubBg="
            defpackage.lb1.x(r0, r2, r1, r4, r6)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            java.lang.String r0 = "renderer_2d_debug_controls"
            me.magnum.melonds.debug.ReleaseStateCommandReceiver.r(r0)
            goto L57b
        L978:
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto L9b9
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r0 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r1 = r0.getRenderer3DDebugControls()
            if (r1 == 0) goto L990
            int r2 = r1.length
            if (r2 != 0) goto L98e
            goto L990
        L98e:
            r15 = r1[r18]
        L990:
            java.lang.String[] r1 = new java.lang.String[]{r12}
            java.lang.Integer r1 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.c(r13, r1)
            if (r1 == 0) goto L99e
            int r15 = r1.intValue()
        L99e:
            r0.setRenderer3DDebugControls(r15)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "action=set_renderer_3d_debug_controls mode=release featureMask="
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            java.lang.String r0 = "renderer_3d_debug_controls"
            me.magnum.melonds.debug.ReleaseStateCommandReceiver.r(r0)
            goto L57b
        L9b9:
            r0 = r34
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto L9cf
            java.lang.Object r0 = r6.g(r9, r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
            goto L577
        L9cf:
            r0 = r33
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto L9e5
            java.lang.Object r0 = r6.n(r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
            goto L577
        L9e5:
            r0 = r32
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto La29
            java.lang.String r0 = "paused"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2, r11}
            java.lang.Boolean r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(r13, r0)
            if (r0 == 0) goto La22
            boolean r0 = r0.booleanValue()
            lc1 r1 = defpackage.lc1.a
            defpackage.lc1.e(r0)
            if (r0 == 0) goto La0c
            r14.pauseEmulation()
            goto La0f
        La0c:
            r14.resumeEmulation()
        La0f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "action=set_debug_pause mode=release paused="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        La22:
            java.lang.String r0 = "Missing paused/enabled extra"
            defpackage.i.h(r0)
            goto L461
        La29:
            r0 = r31
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto La3f
            java.lang.Object r0 = r6.l(r1, r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
            goto L577
        La3f:
            r0 = r30
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto La55
            java.lang.Object r0 = r6.l(r1, r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
            goto L577
        La55:
            r0 = r28
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto La6b
            java.lang.Object r0 = r6.e(r9, r1, r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
            goto L577
        La6b:
            java.lang.String r0 = "TOUCH_SCREEN"
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto La81
            java.lang.Object r0 = r6.m(r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
            goto L577
        La81:
            java.lang.String r0 = "PRESS_INPUT"
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto La97
            java.lang.Object r0 = r6.i(r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
            goto L577
        La97:
            java.lang.String r0 = "SET_INPUT_HELD"
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto Lb54
            java.lang.String r0 = "inputs"
            java.lang.String r1 = "input"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r11}
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.d(r13, r0)
            if (r0 == 0) goto Lb4d
            java.lang.String r1 = "down"
            java.lang.String r4 = "pressed"
            java.lang.String r5 = "held"
            java.lang.String[] r1 = new java.lang.String[]{r5, r1, r4, r2, r11}
            java.lang.Boolean r1 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(r13, r1)
            if (r1 == 0) goto Lb46
            boolean r1 = r1.booleanValue()
            r2 = r19
            char[] r2 = new char[r2]
            r2 = {x0cae: FILL_ARRAY_DATA  , data: [44, 43, 32, 59} // fill-array
            java.util.List r2 = defpackage.qs6.J0(r0, r2, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lad9:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Laef
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            b63 r5 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.o(r5)
            if (r5 == 0) goto Lad9
            r4.add(r5)
            goto Lad9
        Laef:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto Lb3b
            int r0 = r4.size()
            r7 = r18
        Lafb:
            if (r7 >= r0) goto Lb0f
            java.lang.Object r2 = r4.get(r7)
            int r7 = r7 + 1
            b63 r2 = (defpackage.b63) r2
            if (r1 == 0) goto Lb0b
            r14.d(r2)
            goto Lafb
        Lb0b:
            r14.e(r2)
            goto Lafb
        Lb0f:
            dv4 r8 = new dv4
            r0 = 18
            r8.<init>(r0)
            r9 = 30
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            java.lang.String r0 = defpackage.gt0.P0(r4, r5, r6, r7, r8, r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "action=set_input_held mode=release inputs="
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = " held="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        Lb3b:
            java.lang.String r1 = "No supported inputs in "
            java.lang.String r0 = r1.concat(r0)
            defpackage.i.f(r0)
            goto L461
        Lb46:
            java.lang.String r0 = "Missing held/down/enabled extra"
            defpackage.i.h(r0)
            goto L461
        Lb4d:
            java.lang.String r0 = "Missing input extra"
            defpackage.i.h(r0)
            goto L461
        Lb54:
            java.lang.String r0 = "SAVE_STATE"
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto Lb6a
            java.lang.Object r0 = r6.j(r9, r1, r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
            goto L577
        Lb6a:
            java.lang.String r0 = "LOAD_STATE"
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto Lb80
            java.lang.Object r0 = r6.h(r9, r1, r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
            goto L577
        Lb80:
            java.lang.String r0 = "DUMP_ROM_SEARCH_STATE"
            java.lang.String r0 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a(r9, r0)
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto Lb96
            java.lang.Object r0 = r6.f(r1, r13, r8)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L57b
            goto L577
        Lb96:
            java.lang.String r0 = r13.getAction()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Ignored unknown action="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r0 = android.util.Log.w(r3, r0)
            defpackage.vy7.P(r0)
            goto L57b
        Lbb1:
            r51 = r0
            r23 = r2
            r21 = r3
            r22 = r5
            r13 = r8
            r3 = r14
        Lbbb:
            java.lang.String r0 = r13.getAction()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "action=ignored_release_state_command actionName="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " toolsEnabled="
            r1.append(r0)
            r2 = r23
            r1.append(r2)
            java.lang.String r0 = " propertyEnabled="
            r1.append(r0)
            r11 = r51
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            goto L57b
        Lbe6:
            if (r0 != r1) goto Lbea
            r3 = r1
            goto Lbf2
        Lbea:
            r3 = r21
            goto Lbf2
        Lbed:
            defpackage.e41.m()
            goto L461
        Lbf2:
            return r3
        Lbf3:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            r3 = 1
            if (r2 == 0) goto Lc07
            if (r2 != r3) goto Lc02
            defpackage.oi2.Y(r51)
            r0 = r51
            goto Lc1a
        Lc02:
            defpackage.i.m(r10)
            r0 = 0
            goto Lc1a
        Lc07:
            defpackage.oi2.Y(r51)
            ft4 r12 = (defpackage.ft4) r12
            c97 r9 = (defpackage.c97) r9
            eo2 r8 = (defpackage.eo2) r8
            r1.Y = r3
            java.lang.Object r1 = r12.e(r9, r8, r1)
            if (r1 != r0) goto Lc19
            goto Lc1a
        Lc19:
            r0 = r1
        Lc1a:
            return r0
        Lc1b:
            r3 = r11
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto Lc2f
            if (r2 != r3) goto Lc2a
            defpackage.oi2.Y(r51)
            r0 = r51
            goto Lc42
        Lc2a:
            defpackage.i.m(r10)
            r0 = 0
            goto Lc42
        Lc2f:
            defpackage.oi2.Y(r51)
            sz1 r12 = (defpackage.sz1) r12
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r9 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig) r9
            nv4 r8 = (defpackage.nv4) r8
            r1.Y = r3
            java.io.Serializable r1 = defpackage.sz1.O(r12, r9, r8, r1)
            if (r1 != r0) goto Lc41
            goto Lc42
        Lc41:
            r0 = r1
        Lc42:
            return r0
        Lc43:
            r21 = r3
            r3 = r11
            r17 = 5
            dd r12 = (defpackage.dd) r12
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto Lc5b
            if (r2 != r3) goto Lc56
            defpackage.oi2.Y(r51)
            goto Lc7e
        Lc56:
            defpackage.i.m(r10)
            r3 = 0
            goto Lc80
        Lc5b:
            defpackage.oi2.Y(r51)
            vs4 r2 = r12.l
            r2.setValue(r9)
            wc r2 = new wc
            r3 = 4
            r2.<init>(r12, r3)
            b0 r3 = new b0
            go2 r8 = (defpackage.go2) r8
            r4 = r17
            r5 = 0
            r3.<init>(r8, r12, r5, r4)
            r4 = 1
            r1.Y = r4
            java.lang.Object r1 = defpackage.mb3.p(r2, r3, r1)
            if (r1 != r0) goto Lc7e
            r3 = r0
            goto Lc80
        Lc7e:
            r3 = r21
        Lc80:
            return r3
    }
}
