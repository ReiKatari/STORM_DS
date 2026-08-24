package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l5  reason: default package */
/* loaded from: classes.dex */
public final class l5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public java.lang.Object Z;
    public java.lang.Object d0;
    public /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ java.lang.Object f0;

    public l5(defpackage.dh5 r2, defpackage.ne2 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 12
            r1.X = r0
            r1.e0 = r2
            r1.f0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public l5(defpackage.eo2 r2, defpackage.ta5 r3, defpackage.qa4 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.e0 = r2
            r1.f0 = r3
            r1.d0 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public /* synthetic */ l5(java.lang.Object r1, defpackage.eo2 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.f0 = r1
            r0.e0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public l5(java.lang.Object r2, defpackage.gn r3, defpackage.qa4 r4, defpackage.qa4 r5, defpackage.r41 r6) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.e0 = r2
            r1.f0 = r3
            r1.Z = r4
            r1.d0 = r5
            r1.<init>(r0, r6)
            return
    }

    public /* synthetic */ l5(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, defpackage.r41 r5, int r6) {
            r0 = this;
            r0.X = r6
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    public /* synthetic */ l5(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.d0 = r1
            r0.e0 = r2
            r0.f0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public l5(java.util.UUID r2, defpackage.qa4 r3, defpackage.qa4 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 19
            r1.X = r0
            r1.e0 = r2
            r1.d0 = r3
            r1.f0 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public l5(defpackage.qa4 r2, defpackage.g53 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 18
            r1.X = r0
            r1.Z = r2
            r1.f0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public l5(defpackage.ut3 r2, defpackage.tt3 r3, defpackage.eo2 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 29
            r1.X = r0
            r1.d0 = r2
            r1.f0 = r3
            r1.e0 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    private final java.lang.Object A(java.lang.Object r8) {
            r7 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.Y
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L17
            java.lang.Object r7 = r7.Z
            fb4 r7 = (defpackage.fb4) r7
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L15
            goto L5c
        L15:
            r8 = move-exception
            goto L66
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r4
        L1d:
            java.lang.Object r1 = r7.d0
            hw6 r1 = (defpackage.hw6) r1
            eo2 r1 = (defpackage.eo2) r1
            java.lang.Object r3 = r7.Z
            fb4 r3 = (defpackage.fb4) r3
            defpackage.oi2.Y(r8)
            r8 = r3
            goto L47
        L2c:
            defpackage.oi2.Y(r8)
            java.lang.Object r8 = r7.f0
            hb4 r8 = (defpackage.hb4) r8
            java.lang.Object r1 = r7.e0
            eo2 r1 = (defpackage.eo2) r1
            r7.Z = r8
            r5 = r1
            hw6 r5 = (defpackage.hw6) r5
            r7.d0 = r5
            r7.Y = r3
            java.lang.Object r3 = r8.e(r7)
            if (r3 != r0) goto L47
            goto L5a
        L47:
            bf4 r3 = new bf4     // Catch: java.lang.Throwable -> L62
            r5 = 10
            r3.<init>(r1, r4, r5)     // Catch: java.lang.Throwable -> L62
            r7.Z = r8     // Catch: java.lang.Throwable -> L62
            r7.d0 = r4     // Catch: java.lang.Throwable -> L62
            r7.Y = r2     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = defpackage.g04.C(r3, r7)     // Catch: java.lang.Throwable -> L62
            if (r7 != r0) goto L5b
        L5a:
            return r0
        L5b:
            r7 = r8
        L5c:
            r7.h(r4)
            jg7 r7 = defpackage.jg7.a
            return r7
        L62:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L66:
            r7.h(r4)
            throw r8
    }

    private final java.lang.Object v(java.lang.Object r14) {
            r13 = this;
            l61 r1 = r13.B
            java.lang.Object r0 = r13.d0
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r13.Z
            l85 r2 = (defpackage.l85) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r13.Y
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L23
            if (r4 != r6) goto L1d
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L19
            goto Ld0
        L19:
            r0 = move-exception
            r14 = r0
            goto Ld3
        L1d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r5
        L23:
            defpackage.oi2.Y(r14)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r14 = r0.size()
            r7.<init>(r14)
            java.util.Set r14 = r0.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L37:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r14.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r8 = r4.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "utf-8"
            java.lang.String r8 = java.net.URLEncoder.encode(r8, r9)
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "="
            r9.append(r8)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r7.add(r4)
            goto L37
        L71:
            r11 = 0
            r12 = 62
            java.lang.String r8 = "&"
            r9 = 0
            r10 = 0
            java.lang.String r14 = defpackage.gt0.P0(r7, r8, r9, r10, r11, r12)
            s9 r4 = new s9
            r7 = 13
            r4.<init>(r7)
            int r7 = defpackage.mk5.a
            xh5 r7 = defpackage.n34.d
            java.lang.String r7 = "application/x-www-form-urlencoded"
            n34 r7 = defpackage.xk2.k(r7)
            lk5 r14 = defpackage.jx2.q(r14, r7)
            java.lang.String r7 = "POST"
            r4.D(r7, r14)
            cn5 r14 = r2.e
            en5 r7 = r14.c
            if (r7 != 0) goto La0
            en5 r7 = r14.a()
        La0:
            java.lang.String r14 = r7.d
            if (r14 == 0) goto L122
            r4.I(r14)
            pa r14 = new pa
            r14.<init>(r4)
            java.lang.String r4 = "u"
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto Lb7
            goto Lc7
        Lb7:
            java.lang.String r7 = "t"
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto Lc2
            goto Lc7
        Lc2:
            hb5 r5 = new hb5
            r5.<init>(r4, r0)
        Lc7:
            r13.Y = r6     // Catch: java.lang.Throwable -> L19
            java.lang.Object r14 = r2.f(r14, r5, r6, r13)     // Catch: java.lang.Throwable -> L19
            if (r14 != r3) goto Ld0
            return r3
        Ld0:
            wl5 r14 = (defpackage.wl5) r14     // Catch: java.lang.Throwable -> L19
            goto Ldf
        Ld3:
            r1.getClass()
            defpackage.yh2.o(r1)
            em5 r0 = new em5
            r0.<init>(r14)
            r14 = r0
        Ldf:
            java.lang.Object r0 = r13.e0
            ar0 r0 = (defpackage.ar0) r0
            java.lang.Object r13 = r13.f0
            qn2 r13 = (defpackage.qn2) r13
            boolean r3 = r14 instanceof defpackage.em5
            if (r3 != 0) goto L10f
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> Lf8
            wl5 r14 = (defpackage.wl5) r14     // Catch: java.lang.Throwable -> Lf8
            java.lang.Object r13 = defpackage.l85.b(r2, r0, r14, r13)     // Catch: java.lang.Throwable -> Lfb
            r14.close()     // Catch: java.lang.Throwable -> Lf8
            goto L11c
        Lf8:
            r0 = move-exception
            r13 = r0
            goto L103
        Lfb:
            r0 = move-exception
            r13 = r0
            throw r13     // Catch: java.lang.Throwable -> Lfe
        Lfe:
            r0 = move-exception
            defpackage.ge7.t(r14, r13)     // Catch: java.lang.Throwable -> Lf8
            throw r0     // Catch: java.lang.Throwable -> Lf8
        L103:
            r1.getClass()
            defpackage.yh2.o(r1)
            em5 r14 = new em5
            r14.<init>(r13)
            goto L11b
        L10f:
            java.lang.Throwable r13 = defpackage.hm5.a(r14)
            r13.getClass()
            em5 r14 = new em5
            r14.<init>(r13)
        L11b:
            r13 = r14
        L11c:
            hm5 r14 = new hm5
            r14.<init>(r13)
            return r14
        L122:
            fs0 r13 = new fs0
            java.lang.String r14 = "RAOfflineProxy is selected but no active loopback host is available"
            r13.<init>(r14)
            throw r13
    }

    private final java.lang.Object x(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.d0
            tu0 r0 = (defpackage.tu0) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r4.Y
            r3 = 1
            if (r2 == 0) goto L20
            if (r2 != r3) goto L19
            java.lang.Object r4 = r4.Z
            tu0 r4 = (defpackage.tu0) r4
            defpackage.oi2.Y(r5)     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
            goto L37
        L15:
            r4 = move-exception
            goto L3b
        L17:
            r4 = move-exception
            goto L41
        L19:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L20:
            defpackage.oi2.Y(r5)
            java.lang.Object r5 = r4.e0     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
            ad5 r5 = (defpackage.ad5) r5     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
            java.lang.Object r2 = r4.f0     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
            fd5 r2 = (defpackage.fd5) r2     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
            r4.Z = r0     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
            r4.Y = r3     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
            java.lang.Object r5 = defpackage.ad5.a(r5, r2, r4)     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
            if (r5 != r1) goto L36
            return r1
        L36:
            r4 = r0
        L37:
            r4.b0(r5)     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
            goto L3e
        L3b:
            r0.v0(r4)
        L3e:
            jg7 r4 = defpackage.jg7.a
            return r4
        L41:
            r0.s(r4)
            throw r4
    }

    private final java.lang.Object z(java.lang.Object r11) {
            r10 = this;
            java.lang.Object r0 = r10.Z
            r4 = r0
            android.content.Intent r4 = (android.content.Intent) r4
            java.lang.Object r0 = r10.d0
            r7 = r0
            android.content.BroadcastReceiver$PendingResult r7 = (android.content.BroadcastReceiver.PendingResult) r7
            java.lang.String r8 = "Release state command failed: action="
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r10.Y
            r9 = 1
            if (r1 == 0) goto L26
            if (r1 != r9) goto L1f
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            goto L43
        L19:
            r0 = move-exception
            r10 = r0
            goto L60
        L1c:
            r0 = move-exception
            r10 = r0
            goto L47
        L1f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L26:
            defpackage.oi2.Y(r11)
            ic1 r11 = defpackage.ic1.a     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            ad r1 = new ad     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            java.lang.Object r2 = r10.e0     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            me.magnum.melonds.debug.ReleaseStateCommandReceiver r2 = (me.magnum.melonds.debug.ReleaseStateCommandReceiver) r2     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            java.lang.Object r3 = r10.f0     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            r5 = 0
            r6 = 3
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            r10.Y = r9     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            java.lang.Object r10 = r11.a(r1, r10)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            if (r10 != r0) goto L43
            return r0
        L43:
            r7.finish()
            goto L5d
        L47:
            java.lang.String r11 = "DebugCommand"
            java.lang.String r0 = r4.getAction()     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L19
            r1.append(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L19
            android.util.Log.w(r11, r0, r10)     // Catch: java.lang.Throwable -> L19
            goto L43
        L5d:
            jg7 r10 = defpackage.jg7.a
            return r10
        L60:
            r7.finish()
            throw r10
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L1c1;
                case 1: goto L1b2;
                case 2: goto L1a3;
                case 3: goto L194;
                case 4: goto L185;
                case 5: goto L176;
                case 6: goto L167;
                case 7: goto L158;
                case 8: goto L149;
                case 9: goto L13a;
                case 10: goto L12b;
                case 11: goto L11c;
                case 12: goto L106;
                case 13: goto Lf7;
                case 14: goto Le8;
                case 15: goto Ld9;
                case 16: goto Lca;
                case 17: goto Lbb;
                case 18: goto Lac;
                case 19: goto L9d;
                case 20: goto L8e;
                case 21: goto L7f;
                case 22: goto L70;
                case 23: goto L61;
                case 24: goto L52;
                case 25: goto L43;
                case 26: goto L34;
                case 27: goto L25;
                case 28: goto L16;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L43:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L52:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L61:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L70:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L7f:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L8e:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L9d:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lac:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lbb:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lca:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Ld9:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Le8:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lf7:
            ch6 r3 = (defpackage.ch6) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L106:
            gm0 r3 = (defpackage.gm0) r3
            java.lang.Object r3 = r3.a
            r41 r4 = (defpackage.r41) r4
            gm0 r0 = new gm0
            r0.<init>(r3)
            r41 r2 = r2.q(r4, r0)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L11c:
            q35 r3 = (defpackage.q35) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L12b:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L13a:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L149:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L158:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L167:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L176:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L185:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L194:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L1a3:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L1b2:
            rj r3 = (defpackage.rj) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L1c1:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            l5 r2 = (defpackage.l5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.X
            java.lang.Object r1 = r10.f0
            switch(r0) {
                case 0: goto L2ab;
                case 1: goto L293;
                case 2: goto L27d;
                case 3: goto L263;
                case 4: goto L24d;
                case 5: goto L233;
                case 6: goto L219;
                case 7: goto L1ff;
                case 8: goto L1e4;
                case 9: goto L1c9;
                case 10: goto L1ae;
                case 11: goto L195;
                case 12: goto L186;
                case 13: goto L16e;
                case 14: goto L154;
                case 15: goto L139;
                case 16: goto L11e;
                case 17: goto L103;
                case 18: goto Lf4;
                case 19: goto Le3;
                case 20: goto Lc8;
                case 21: goto Lb7;
                case 22: goto L9e;
                case 23: goto L83;
                case 24: goto L74;
                case 25: goto L59;
                case 26: goto L42;
                case 27: goto L27;
                case 28: goto L19;
                default: goto L7;
            }
        L7:
            l5 r0 = new l5
            java.lang.Object r2 = r10.d0
            ut3 r2 = (defpackage.ut3) r2
            tt3 r1 = (defpackage.tt3) r1
            java.lang.Object r10 = r10.e0
            eo2 r10 = (defpackage.eo2) r10
            r0.<init>(r2, r1, r10, r11)
            r0.Z = r12
            return r0
        L19:
            l5 r12 = new l5
            hb4 r1 = (defpackage.hb4) r1
            java.lang.Object r10 = r10.e0
            eo2 r10 = (defpackage.eo2) r10
            r0 = 28
            r12.<init>(r1, r10, r11, r0)
            return r12
        L27:
            l5 r2 = new l5
            java.lang.Object r12 = r10.Z
            r3 = r12
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.Object r12 = r10.d0
            r4 = r12
            android.content.BroadcastReceiver$PendingResult r4 = (android.content.BroadcastReceiver.PendingResult) r4
            java.lang.Object r10 = r10.e0
            r5 = r10
            me.magnum.melonds.debug.ReleaseStateCommandReceiver r5 = (me.magnum.melonds.debug.ReleaseStateCommandReceiver) r5
            r6 = r1
            android.content.Context r6 = (android.content.Context) r6
            r8 = 27
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L42:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.d0
            r4 = r11
            tu0 r4 = (defpackage.tu0) r4
            java.lang.Object r10 = r10.e0
            r5 = r10
            ad5 r5 = (defpackage.ad5) r5
            r6 = r1
            fd5 r6 = (defpackage.fd5) r6
            r7 = r8
            r8 = 26
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L59:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            l85 r4 = (defpackage.l85) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            ar0 r6 = (defpackage.ar0) r6
            r7 = r1
            qn2 r7 = (defpackage.qn2) r7
            r9 = 25
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L74:
            r8 = r11
            l5 r11 = new l5
            zx4 r1 = (defpackage.zx4) r1
            java.lang.Object r10 = r10.e0
            eo2 r10 = (defpackage.eo2) r10
            r12 = 24
            r11.<init>(r1, r10, r8, r12)
            return r11
        L83:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            oj4 r4 = (defpackage.oj4) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            yi4 r7 = (defpackage.yi4) r7
            r9 = 23
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L9e:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.d0
            r4 = r11
            n96 r4 = (defpackage.n96) r4
            java.lang.Object r10 = r10.e0
            r5 = r10
            sb4 r5 = (defpackage.sb4) r5
            r6 = r1
            ga7 r6 = (defpackage.ga7) r6
            r7 = r8
            r8 = 22
            r3.<init>(r4, r5, r6, r7, r8)
            r3.Z = r12
            return r3
        Lb7:
            r8 = r11
            l5 r11 = new l5
            d51 r1 = (defpackage.d51) r1
            java.lang.Object r10 = r10.e0
            eo2 r10 = (defpackage.eo2) r10
            r0 = 21
            r11.<init>(r1, r10, r8, r0)
            r11.d0 = r12
            return r11
        Lc8:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            na4 r4 = (defpackage.na4) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            gl6 r5 = (defpackage.gl6) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            android.content.res.Resources r6 = (android.content.res.Resources) r6
            r7 = r1
            qn2 r7 = (defpackage.qn2) r7
            r9 = 20
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        Le3:
            r8 = r11
            l5 r11 = new l5
            java.lang.Object r12 = r10.e0
            java.util.UUID r12 = (java.util.UUID) r12
            java.lang.Object r10 = r10.d0
            qa4 r10 = (defpackage.qa4) r10
            qa4 r1 = (defpackage.qa4) r1
            r11.<init>(r12, r10, r1, r8)
            return r11
        Lf4:
            r8 = r11
            l5 r11 = new l5
            java.lang.Object r10 = r10.Z
            qa4 r10 = (defpackage.qa4) r10
            g53 r1 = (defpackage.g53) r1
            r11.<init>(r10, r1, r8)
            r11.e0 = r12
            return r11
        L103:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r9 = 17
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L11e:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            hq2 r4 = (defpackage.hq2) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            r9 = 16
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L139:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            f13 r4 = (defpackage.f13) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r9 = 15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L154:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            eh6 r4 = (defpackage.eh6) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            le2 r5 = (defpackage.le2) r5
            java.lang.Object r11 = r10.e0
            r6 = r11
            na4 r6 = (defpackage.na4) r6
            java.lang.Object r7 = r10.f0
            r9 = 14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L16e:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.d0
            r4 = r11
            le2 r4 = (defpackage.le2) r4
            java.lang.Object r11 = r10.e0
            r5 = r11
            na4 r5 = (defpackage.na4) r5
            java.lang.Object r6 = r10.f0
            r7 = r8
            r8 = 13
            r3.<init>(r4, r5, r6, r7, r8)
            r3.Z = r12
            return r3
        L186:
            r8 = r11
            l5 r11 = new l5
            java.lang.Object r10 = r10.e0
            dh5 r10 = (defpackage.dh5) r10
            ne2 r1 = (defpackage.ne2) r1
            r11.<init>(r10, r1, r8)
            r11.d0 = r12
            return r11
        L195:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.d0
            r4 = r11
            ut3 r4 = (defpackage.ut3) r4
            java.lang.Object r10 = r10.e0
            r5 = r10
            tt3 r5 = (defpackage.tt3) r5
            r6 = r1
            le2 r6 = (defpackage.le2) r6
            r7 = r8
            r8 = 11
            r3.<init>(r4, r5, r6, r7, r8)
            r3.Z = r12
            return r3
        L1ae:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            sz1 r4 = (defpackage.sz1) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            vj4 r7 = (defpackage.vj4) r7
            r9 = 10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L1c9:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            nv4 r4 = (defpackage.nv4) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            sz1 r5 = (defpackage.sz1) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            pq5 r6 = (defpackage.pq5) r6
            r7 = r1
            v80 r7 = (defpackage.v80) r7
            r9 = 9
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L1e4:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            hu1 r4 = (defpackage.hu1) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            sz1 r5 = (defpackage.sz1) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            dy1 r6 = (defpackage.dy1) r6
            r7 = r1
            c46 r7 = (defpackage.c46) r7
            r9 = 8
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L1ff:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            androidx.work.impl.workers.ConstraintTrackingWorker r4 = (androidx.work.impl.workers.ConstraintTrackingWorker) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            nx3 r5 = (defpackage.nx3) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            ww2 r6 = (defpackage.ww2) r6
            r7 = r1
            yw7 r7 = (defpackage.yw7) r7
            r9 = 7
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L219:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            ww2 r4 = (defpackage.ww2) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            yw7 r5 = (defpackage.yw7) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            java.util.concurrent.atomic.AtomicInteger r6 = (java.util.concurrent.atomic.AtomicInteger) r6
            r7 = r1
            gx3 r7 = (defpackage.gx3) r7
            r9 = 6
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L233:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            dx0 r4 = (defpackage.dx0) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            android.view.ScrollCaptureSession r5 = (android.view.ScrollCaptureSession) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            r7 = r1
            java.util.function.Consumer r7 = (java.util.function.Consumer) r7
            r9 = 5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L24d:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.d0
            r4 = r11
            cp2 r4 = (defpackage.cp2) r4
            java.lang.Object r10 = r10.e0
            r5 = r10
            aq0 r5 = (defpackage.aq0) r5
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            r7 = r8
            r8 = 4
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L263:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.Z
            r4 = r11
            gl6 r4 = (defpackage.gl6) r4
            java.lang.Object r11 = r10.d0
            r5 = r11
            android.content.res.Resources r5 = (android.content.res.Resources) r5
            java.lang.Object r10 = r10.e0
            r6 = r10
            me.magnum.melonds.domain.model.Cheat r6 = (me.magnum.melonds.domain.model.Cheat) r6
            r7 = r1
            aq0 r7 = (defpackage.aq0) r7
            r9 = 3
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L27d:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r4 = r10.e0
            r5 = r1
            gn r5 = (defpackage.gn) r5
            java.lang.Object r11 = r10.Z
            r6 = r11
            qa4 r6 = (defpackage.qa4) r6
            java.lang.Object r10 = r10.d0
            r7 = r10
            qa4 r7 = (defpackage.qa4) r7
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L293:
            r8 = r11
            l5 r3 = new l5
            java.lang.Object r11 = r10.d0
            r4 = r11
            qn2 r4 = (defpackage.qn2) r4
            java.lang.Object r10 = r10.e0
            r5 = r10
            ki r5 = (defpackage.ki) r5
            r6 = r1
            et3 r6 = (defpackage.et3) r6
            r7 = r8
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8)
            r3.Z = r12
            return r3
        L2ab:
            r8 = r11
            l5 r11 = new l5
            java.lang.Object r12 = r10.e0
            eo2 r12 = (defpackage.eo2) r12
            ta5 r1 = (defpackage.ta5) r1
            java.lang.Object r10 = r10.d0
            qa4 r10 = (defpackage.qa4) r10
            r11.<init>(r12, r1, r10, r8)
            return r11
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r27) {
            r26 = this;
            r4 = r26
            int r0 = r4.X
            r1 = 4
            r2 = 6
            r3 = 0
            r5 = 3
            r6 = 2
            jg7 r7 = defpackage.jg7.a
            java.lang.Object r8 = r4.f0
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r10 = 1
            r11 = 0
            switch(r0) {
                case 0: goto L9f7;
                case 1: goto L9b3;
                case 2: goto L957;
                case 3: goto L8b6;
                case 4: goto L803;
                case 5: goto L7ba;
                case 6: goto L77c;
                case 7: goto L74b;
                case 8: goto L704;
                case 9: goto L6c0;
                case 10: goto L68a;
                case 11: goto L653;
                case 12: goto L5f1;
                case 13: goto L5a3;
                case 14: goto L513;
                case 15: goto L4dd;
                case 16: goto L49c;
                case 17: goto L466;
                case 18: goto L3bd;
                case 19: goto L378;
                case 20: goto L342;
                case 21: goto L2ce;
                case 22: goto L247;
                case 23: goto Lf8;
                case 24: goto L67;
                case 25: goto L62;
                case 26: goto L5d;
                case 27: goto L58;
                case 28: goto L53;
                default: goto L14;
            }
        L14:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L25
            if (r1 != r10) goto L20
            defpackage.oi2.Y(r27)
            goto L52
        L20:
            defpackage.i.m(r9)
            r7 = r11
            goto L52
        L25:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.Z
            r14 = r1
            w61 r14 = (defpackage.w61) r14
            xe1 r1 = defpackage.xk1.a
            jv2 r1 = defpackage.e04.a
            jv2 r1 = r1.Y
            hn r11 = new hn
            java.lang.Object r2 = r4.d0
            r12 = r2
            ut3 r12 = (defpackage.ut3) r12
            r13 = r8
            tt3 r13 = (defpackage.tt3) r13
            java.lang.Object r2 = r4.e0
            r15 = r2
            eo2 r15 = (defpackage.eo2) r15
            r16 = 0
            r17 = 8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r4.Y = r10
            java.lang.Object r1 = defpackage.hv.d0(r1, r11, r4)
            if (r1 != r0) goto L52
            r7 = r0
        L52:
            return r7
        L53:
            java.lang.Object r0 = r26.A(r27)
            return r0
        L58:
            java.lang.Object r0 = r26.z(r27)
            return r0
        L5d:
            java.lang.Object r0 = r26.x(r27)
            return r0
        L62:
            java.lang.Object r0 = r26.v(r27)
            return r0
        L67:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L99
            if (r1 == r10) goto L8d
            if (r1 == r6) goto L80
            if (r1 != r5) goto L7a
            defpackage.oi2.Y(r27)
            r0 = r27
            goto Lf3
        L7a:
            defpackage.i.m(r9)
            r0 = r11
            goto Lf3
        L80:
            java.lang.Object r1 = r4.Z
            fb4 r1 = (defpackage.fb4) r1
            defpackage.oi2.Y(r27)     // Catch: java.lang.Throwable -> L8b
            r2 = r1
            r1 = r27
            goto Ld2
        L8b:
            r0 = move-exception
            goto Lf4
        L8d:
            java.lang.Object r1 = r4.d0
            zx4 r1 = (defpackage.zx4) r1
            java.lang.Object r2 = r4.Z
            fb4 r2 = (defpackage.fb4) r2
            defpackage.oi2.Y(r27)
            goto Lae
        L99:
            defpackage.oi2.Y(r27)
            r1 = r8
            zx4 r1 = (defpackage.zx4) r1
            hb4 r2 = r1.e
            r4.Z = r2
            r4.d0 = r1
            r4.Y = r10
            java.lang.Object r3 = r2.e(r4)
            if (r3 != r0) goto Lae
            goto Lf3
        Lae:
            android.view.textclassifier.TextClassifier r3 = r1.f     // Catch: java.lang.Throwable -> Lb9
            if (r3 == 0) goto Lbc
            boolean r7 = defpackage.yr1.y(r3)     // Catch: java.lang.Throwable -> Lb9
            if (r7 == 0) goto Ld6
            goto Lbc
        Lb9:
            r0 = move-exception
            r1 = r2
            goto Lf4
        Lbc:
            y3 r3 = new y3     // Catch: java.lang.Throwable -> Lb9
            r7 = 12
            r3.<init>(r1, r11, r7)     // Catch: java.lang.Throwable -> Lb9
            r4.Z = r2     // Catch: java.lang.Throwable -> Lb9
            r4.d0 = r11     // Catch: java.lang.Throwable -> Lb9
            r4.Y = r6     // Catch: java.lang.Throwable -> Lb9
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r1 = defpackage.xk2.N(r6, r3, r4)     // Catch: java.lang.Throwable -> Lb9
            if (r1 != r0) goto Ld2
            goto Lf3
        Ld2:
            android.view.textclassifier.TextClassifier r3 = defpackage.oc3.d(r1)     // Catch: java.lang.Throwable -> Lb9
        Ld6:
            r2.h(r11)
            bf4 r1 = new bf4
            java.lang.Object r2 = r4.e0
            eo2 r2 = (defpackage.eo2) r2
            r6 = 5
            r1.<init>(r3, r2, r11, r6)
            r4.Z = r11
            r4.d0 = r11
            r4.Y = r5
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Object r1 = defpackage.xk2.N(r2, r1, r4)
            if (r1 != r0) goto Lf2
            goto Lf3
        Lf2:
            r0 = r1
        Lf3:
            return r0
        Lf4:
            r1.h(r11)
            throw r0
        Lf8:
            java.lang.Object r0 = r4.e0
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.d0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.Z
            oj4 r2 = (defpackage.oj4) r2
            vi r5 = r2.a
            java.lang.String r12 = "Offline ledger integrity is "
            x61 r13 = defpackage.x61.COROUTINE_SUSPENDED
            int r14 = r4.Y
            r15 = 0
            if (r14 == 0) goto L124
            if (r14 == r10) goto L11e
            if (r14 != r6) goto L119
            defpackage.oi2.Y(r27)     // Catch: java.lang.Exception -> L23b
            r10 = r7
            goto L239
        L119:
            defpackage.i.m(r9)
            goto L246
        L11e:
            defpackage.oi2.Y(r27)     // Catch: java.lang.Exception -> L23b
            r6 = r27
            goto L143
        L124:
            defpackage.oi2.Y(r27)
            r4.Y = r10     // Catch: java.lang.Exception -> L23b
            kh r9 = r5.a     // Catch: java.lang.Exception -> L23b
            java.io.File r11 = r5.a(r1, r0)     // Catch: java.lang.Exception -> L23b
            r9.getClass()     // Catch: java.lang.Exception -> L23b
            xe1 r14 = defpackage.xk1.a     // Catch: java.lang.Exception -> L23b
            de1 r14 = defpackage.de1.L     // Catch: java.lang.Exception -> L23b
            m5 r6 = new m5     // Catch: java.lang.Exception -> L23b
            r6.<init>(r11, r9, r15, r10)     // Catch: java.lang.Exception -> L23b
            java.lang.Object r6 = defpackage.hv.d0(r14, r6, r4)     // Catch: java.lang.Exception -> L23b
            if (r6 != r13) goto L143
            goto L237
        L143:
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Exception -> L23b
            if (r6 == 0) goto L159
            p45 r9 = defpackage.pi4.a     // Catch: java.lang.Exception -> L23b
            si4 r11 = defpackage.ti4.Companion     // Catch: java.lang.Exception -> L23b
            gg3 r11 = r11.serializer()     // Catch: java.lang.Exception -> L23b
            gg3 r11 = (defpackage.gg3) r11     // Catch: java.lang.Exception -> L23b
            java.lang.Object r9 = r9.a(r11, r6)     // Catch: java.lang.Exception -> L23b
            ti4 r9 = (defpackage.ti4) r9     // Catch: java.lang.Exception -> L23b
            if (r9 != 0) goto L160
        L159:
            ti4 r9 = new ti4     // Catch: java.lang.Exception -> L23b
            yt1 r11 = defpackage.yt1.A     // Catch: java.lang.Exception -> L23b
            r9.<init>(r3, r11)     // Catch: java.lang.Exception -> L23b
        L160:
            java.util.List r11 = r9.a     // Catch: java.lang.Exception -> L23b
            ej4 r14 = r2.j(r11)     // Catch: java.lang.Exception -> L23b
            ui4 r15 = r14.a     // Catch: java.lang.Exception -> L23b
            int[] r17 = defpackage.jj4.a     // Catch: java.lang.Exception -> L23b
            int r18 = r15.ordinal()     // Catch: java.lang.Exception -> L23b
            r3 = r17[r18]     // Catch: java.lang.Exception -> L23b
            if (r3 == r10) goto L192
            r10 = 2
            if (r3 == r10) goto L192
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L23b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23b
            r1.<init>(r12)     // Catch: java.lang.Exception -> L23b
            r1.append(r15)     // Catch: java.lang.Exception -> L23b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L23b
            r0.<init>(r1)     // Catch: java.lang.Exception -> L23b
            em5 r1 = new em5     // Catch: java.lang.Exception -> L23b
            r1.<init>(r0)     // Catch: java.lang.Exception -> L23b
            hm5 r11 = new hm5     // Catch: java.lang.Exception -> L23b
            r11.<init>(r1)     // Catch: java.lang.Exception -> L23b
            goto L246
        L192:
            java.lang.Long r3 = r14.b     // Catch: java.lang.Exception -> L23b
            if (r3 == 0) goto L19b
            long r21 = r3.longValue()     // Catch: java.lang.Exception -> L23b
            goto L19d
        L19b:
            r21 = 0
        L19d:
            r23 = 1
            r27 = r6
            r10 = r7
            long r6 = r21 + r23
            byte[] r3 = r14.c     // Catch: java.lang.Exception -> L23b
            if (r3 != 0) goto L1ab
            r12 = 0
            byte[] r3 = new byte[r12]     // Catch: java.lang.Exception -> L23b
        L1ab:
            yi4 r8 = (defpackage.yi4) r8     // Catch: java.lang.Exception -> L23b
            yi4 r3 = defpackage.yi4.a(r8, r6, r3)     // Catch: java.lang.Exception -> L23b
            p45 r6 = defpackage.pi4.a     // Catch: java.lang.Exception -> L23b
            xi4 r7 = defpackage.yi4.Companion     // Catch: java.lang.Exception -> L23b
            gg3 r7 = r7.serializer()     // Catch: java.lang.Exception -> L23b
            gg3 r7 = (defpackage.gg3) r7     // Catch: java.lang.Exception -> L23b
            byte[] r7 = r6.b(r7, r3)     // Catch: java.lang.Exception -> L23b
            java.lang.String r8 = "SHA-256"
            java.security.MessageDigest r8 = java.security.MessageDigest.getInstance(r8)     // Catch: java.lang.Exception -> L23b
            byte[] r7 = r8.digest(r7)     // Catch: java.lang.Exception -> L23b
            r7.getClass()     // Catch: java.lang.Exception -> L23b
            fi r2 = r2.b     // Catch: java.lang.Exception -> L23b
            java.security.KeyPair r2 = r2.a()     // Catch: java.lang.Exception -> L23b
            java.security.PrivateKey r2 = r2.getPrivate()     // Catch: java.lang.Exception -> L23b
            java.lang.String r8 = "SHA256withECDSA"
            java.security.Signature r8 = java.security.Signature.getInstance(r8)     // Catch: java.lang.Exception -> L23b
            r8.initSign(r2)     // Catch: java.lang.Exception -> L23b
            r8.update(r7)     // Catch: java.lang.Exception -> L23b
            byte[] r2 = r8.sign()     // Catch: java.lang.Exception -> L23b
            r2.getClass()     // Catch: java.lang.Exception -> L23b
            bj4 r8 = new bj4     // Catch: java.lang.Exception -> L23b
            r8.<init>(r3, r7, r2)     // Catch: java.lang.Exception -> L23b
            if (r27 != 0) goto L1f2
            r3 = 1
            goto L1f9
        L1f2:
            int r2 = r9.b     // Catch: java.lang.Exception -> L23b
            if (r2 <= 0) goto L1f8
            r3 = r2
            goto L1f9
        L1f8:
            r3 = 0
        L1f9:
            java.util.ArrayList r2 = defpackage.gt0.U0(r8, r11)     // Catch: java.lang.Exception -> L23b
            ti4 r7 = new ti4     // Catch: java.lang.Exception -> L23b
            r7.<init>(r3, r2)     // Catch: java.lang.Exception -> L23b
            si4 r2 = defpackage.ti4.Companion     // Catch: java.lang.Exception -> L23b
            gg3 r2 = r2.serializer()     // Catch: java.lang.Exception -> L23b
            gg3 r2 = (defpackage.gg3) r2     // Catch: java.lang.Exception -> L23b
            byte[] r18 = r6.b(r2, r7)     // Catch: java.lang.Exception -> L23b
            r2 = 2
            r4.Y = r2     // Catch: java.lang.Exception -> L23b
            kh r2 = r5.a     // Catch: java.lang.Exception -> L23b
            java.io.File r16 = r5.a(r1, r0)     // Catch: java.lang.Exception -> L23b
            r2.getClass()     // Catch: java.lang.Exception -> L23b
            xe1 r0 = defpackage.xk1.a     // Catch: java.lang.Exception -> L23b
            de1 r0 = defpackage.de1.L     // Catch: java.lang.Exception -> L23b
            ag r15 = new ag     // Catch: java.lang.Exception -> L23b
            r20 = 2
            r17 = r2
            r19 = 0
            r15.<init>(r16, r17, r18, r19, r20)     // Catch: java.lang.Exception -> L23b
            java.lang.Object r0 = defpackage.hv.d0(r0, r15, r4)     // Catch: java.lang.Exception -> L23b
            if (r0 != r13) goto L230
            goto L231
        L230:
            r0 = r10
        L231:
            if (r0 != r13) goto L234
            goto L235
        L234:
            r0 = r10
        L235:
            if (r0 != r13) goto L239
        L237:
            r11 = r13
            goto L246
        L239:
            r7 = r10
            goto L241
        L23b:
            r0 = move-exception
            em5 r7 = new em5
            r7.<init>(r0)
        L241:
            hm5 r11 = new hm5
            r11.<init>(r7)
        L246:
            return r11
        L247:
            r10 = r7
            java.lang.Object r0 = r4.e0
            sb4 r0 = (defpackage.sb4) r0
            java.lang.Object r1 = r4.d0
            n96 r1 = (defpackage.n96) r1
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r4.Y
            if (r3 == 0) goto L267
            r5 = 1
            if (r3 == r5) goto L25c
            r2 = 2
            if (r3 != r2) goto L262
        L25c:
            defpackage.oi2.Y(r27)
        L25f:
            r7 = r10
            goto L2cd
        L262:
            defpackage.i.m(r9)
            r7 = r11
            goto L2cd
        L267:
            defpackage.oi2.Y(r27)
            java.lang.Object r3 = r4.Z
            w61 r3 = (defpackage.w61) r3
            vs4 r5 = r1.c
            rs4 r7 = r1.i
            java.lang.Object r5 = r5.getValue()
            boolean r5 = defpackage.nb3.k(r5, r0)
            if (r5 != 0) goto L296
            r5 = 1
            r4.Y = r5
            ga7 r2 = r1.e
            if (r2 != 0) goto L284
            goto L292
        L284:
            eb4 r3 = r1.l
            h96 r5 = new h96
            r5.<init>(r2, r1, r0, r11)
            java.lang.Object r0 = defpackage.eb4.a(r3, r5, r4)
            if (r0 != r6) goto L292
            goto L293
        L292:
            r0 = r10
        L293:
            if (r0 != r6) goto L25f
            goto L2cc
        L296:
            ga7 r8 = (defpackage.ga7) r8
            ii1 r5 = r8.l
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            long r8 = r5.longValue()
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 / r12
            float r5 = r7.h()
            float r7 = r7.h()
            float r8 = (float) r8
            float r7 = r7 * r8
            int r7 = (int) r7
            r12 = 0
            sc7 r2 = defpackage.ge7.Y(r7, r12, r11, r2)
            x3 r7 = new x3
            r8 = 24
            r7.<init>(r3, r1, r0, r8)
            r0 = 2
            r4.Y = r0
            r1 = 0
            r0 = r5
            r5 = 4
            r3 = r7
            java.lang.Object r0 = defpackage.kj2.l(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L25f
        L2cc:
            r7 = r6
        L2cd:
            return r7
        L2ce:
            r10 = r7
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L2f9
            r5 = 1
            if (r1 == r5) goto L2eb
            r2 = 2
            if (r1 != r2) goto L2e6
            java.lang.Object r0 = r4.d0
            r1 = r0
            fb4 r1 = (defpackage.fb4) r1
            defpackage.oi2.Y(r27)     // Catch: java.lang.Throwable -> L2e4
            goto L337
        L2e4:
            r0 = move-exception
            goto L33e
        L2e6:
            defpackage.i.m(r9)
            r7 = r11
            goto L33b
        L2eb:
            java.lang.Object r1 = r4.Z
            hw6 r1 = (defpackage.hw6) r1
            eo2 r1 = (defpackage.eo2) r1
            java.lang.Object r2 = r4.d0
            fb4 r2 = (defpackage.fb4) r2
            defpackage.oi2.Y(r27)
            goto L327
        L2f9:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.d0
            w61 r1 = (defpackage.w61) r1
            l61 r1 = r1.A()
            defpackage.yh2.o(r1)
            d51 r8 = (defpackage.d51) r8
            java.lang.Object r1 = r8.B
            hb4 r1 = (defpackage.hb4) r1
            java.lang.Object r2 = r4.e0
            eo2 r2 = (defpackage.eo2) r2
            r4.d0 = r1
            r3 = r2
            hw6 r3 = (defpackage.hw6) r3
            r4.Z = r3
            r5 = 1
            r4.Y = r5
            x61 r3 = defpackage.lb4.k(r1, r4)
            if (r3 != r0) goto L322
            goto L334
        L322:
            r25 = r2
            r2 = r1
            r1 = r25
        L327:
            r4.d0 = r2     // Catch: java.lang.Throwable -> L33c
            r4.Z = r11     // Catch: java.lang.Throwable -> L33c
            r3 = 2
            r4.Y = r3     // Catch: java.lang.Throwable -> L33c
            java.lang.Object r1 = defpackage.g04.C(r1, r4)     // Catch: java.lang.Throwable -> L33c
            if (r1 != r0) goto L336
        L334:
            r7 = r0
            goto L33b
        L336:
            r1 = r2
        L337:
            r1.h(r11)
            r7 = r10
        L33b:
            return r7
        L33c:
            r0 = move-exception
            r1 = r2
        L33e:
            r1.h(r11)
            throw r0
        L342:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L353
            r5 = 1
            if (r1 == r5) goto L34f
            defpackage.i.m(r9)
            goto L377
        L34f:
            defpackage.oi2.Y(r27)
            goto L374
        L353:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.Z
            na4 r1 = (defpackage.na4) r1
            vc r3 = new vc
            java.lang.Object r5 = r4.d0
            gl6 r5 = (defpackage.gl6) r5
            java.lang.Object r6 = r4.e0
            android.content.res.Resources r6 = (android.content.res.Resources) r6
            qn2 r8 = (defpackage.qn2) r8
            r3.<init>(r5, r6, r8, r2)
            r5 = 1
            r4.Y = r5
            java.lang.Object r1 = r1.b(r3, r4)
            if (r1 != r0) goto L374
            r11 = r0
            goto L377
        L374:
            defpackage.e41.c()
        L377:
            return r11
        L378:
            r10 = r7
            java.lang.Object r0 = r4.e0
            java.util.UUID r0 = (java.util.UUID) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r4.Y
            if (r2 == 0) goto L396
            r5 = 1
            if (r2 != r5) goto L391
            java.lang.Object r0 = r4.Z
            qa4 r0 = (defpackage.qa4) r0
            defpackage.oi2.Y(r27)
            r2 = r0
            r0 = r27
            goto L3b5
        L391:
            defpackage.i.m(r9)
            r7 = r11
            goto L3bc
        L396:
            defpackage.oi2.Y(r27)
            r2 = r8
            qa4 r2 = (defpackage.qa4) r2
            if (r0 == 0) goto L3b8
            java.lang.Object r3 = r4.d0
            qa4 r3 = (defpackage.qa4) r3
            java.lang.Object r3 = r3.getValue()
            eo2 r3 = (defpackage.eo2) r3
            r4.Z = r2
            r5 = 1
            r4.Y = r5
            java.lang.Object r0 = r3.o(r0, r4)
            if (r0 != r1) goto L3b5
            r7 = r1
            goto L3bc
        L3b5:
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
        L3b8:
            r2.setValue(r11)
            r7 = r10
        L3bc:
            return r7
        L3bd:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L3e7
            r2 = 1
            if (r1 == r2) goto L3db
            r2 = 2
            if (r1 != r2) goto L3d6
            java.lang.Object r1 = r4.d0
            ah5 r1 = (defpackage.ah5) r1
            java.lang.Object r2 = r4.e0
            w61 r2 = (defpackage.w61) r2
            defpackage.oi2.Y(r27)
            goto L45d
        L3d6:
            defpackage.i.m(r9)
            goto L465
        L3db:
            java.lang.Object r1 = r4.d0
            ah5 r1 = (defpackage.ah5) r1
            java.lang.Object r2 = r4.e0
            w61 r2 = (defpackage.w61) r2
            defpackage.oi2.Y(r27)
            goto L439
        L3e7:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.e0
            w61 r1 = (defpackage.w61) r1
            ah5 r2 = new ah5
            r2.<init>()
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.A = r3
            r22 = r1
            r21 = r2
        L3fb:
            java.lang.Object r1 = r4.Z
            r19 = r1
            qa4 r19 = (defpackage.qa4) r19
            r20 = r8
            g53 r20 = (defpackage.g53) r20
            cn r18 = new cn
            r23 = 5
            r18.<init>(r19, r20, r21, r22, r23)
            r3 = r18
            r2 = r21
            r1 = r22
            r4.e0 = r1
            r4.d0 = r2
            r6 = 1
            r4.Y = r6
            l61 r6 = r4.b()
            d90 r7 = defpackage.d90.u0
            j61 r6 = r6.Z(r7)
            if (r6 != 0) goto L462
            l61 r6 = r4.b()
            um r6 = defpackage.ii2.x(r6)
            java.lang.Object r3 = r6.a(r3, r4)
            if (r3 != r0) goto L434
            goto L45b
        L434:
            r25 = r2
            r2 = r1
            r1 = r25
        L439:
            float r3 = r1.A
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L45d
            er2 r3 = new er2
            r3.<init>(r2, r5)
            g21 r3 = defpackage.np2.f0(r3)
            f53 r6 = new f53
            r10 = 2
            r6.<init>(r10, r11)
            r4.e0 = r2
            r4.d0 = r1
            r4.Y = r10
            java.lang.Object r3 = defpackage.f04.C(r3, r6, r4)
            if (r3 != r0) goto L45d
        L45b:
            r11 = r0
            goto L465
        L45d:
            r21 = r1
            r22 = r2
            goto L3fb
        L462:
            defpackage.u34.a()
        L465:
            return r11
        L466:
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r4.Y
            if (r0 == 0) goto L47a
            r5 = 1
            if (r0 != r5) goto L475
            defpackage.oi2.Y(r27)
            r0 = r27
            goto L49b
        L475:
            defpackage.i.m(r9)
            r0 = r11
            goto L49b
        L47a:
            defpackage.oi2.Y(r27)
            qr1 r0 = defpackage.qr1.a
            java.lang.Object r1 = r4.Z
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.d0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.e0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r8 = (java.lang.String) r8
            r5 = 1
            r4.Y = r5
            java.lang.String r5 = "default"
            r6 = r4
            r4 = r8
            java.io.Serializable r0 = r0.a(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L49b
            r0 = r7
        L49b:
            return r0
        L49c:
            r5 = r10
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L4b0
            if (r1 != r5) goto L4ab
            defpackage.oi2.Y(r27)
            r0 = r27
            goto L4dc
        L4ab:
            defpackage.i.m(r9)
            r0 = r11
            goto L4dc
        L4b0:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.Z
            hq2 r1 = (defpackage.hq2) r1
            wp2 r10 = r1.h
            java.lang.Object r1 = r4.d0
            r11 = r1
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Object r1 = r4.e0
            r13 = r1
            java.lang.String r13 = (java.lang.String) r13
            r12 = r8
            java.util.List r12 = (java.util.List) r12
            r5 = 1
            r4.Y = r5
            r10.getClass()
            xe1 r1 = defpackage.xk1.a
            up2 r9 = new up2
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.Object r1 = defpackage.hv.d0(r1, r9, r4)
            if (r1 != r0) goto L4db
            goto L4dc
        L4db:
            r0 = r1
        L4dc:
            return r0
        L4dd:
            java.lang.String r8 = (java.lang.String) r8
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L4f2
            r5 = 1
            if (r1 != r5) goto L4ee
            defpackage.oi2.Y(r27)
            r1 = r27
            goto L50c
        L4ee:
            defpackage.i.m(r9)
            goto L512
        L4f2:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.Z
            f13 r1 = (defpackage.f13) r1
            java.lang.Object r2 = r4.d0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.e0
            java.lang.String r3 = (java.lang.String) r3
            r5 = 1
            r4.Y = r5
            java.lang.Object r1 = r1.j(r2, r3, r8, r4)
            if (r1 != r0) goto L50c
            r11 = r0
            goto L512
        L50c:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r11 = defpackage.qp2.a(r1, r8)
        L512:
            return r11
        L513:
            r10 = r7
            java.lang.Object r0 = r4.d0
            le2 r0 = (defpackage.le2) r0
            java.lang.Object r2 = r4.e0
            na4 r2 = (defpackage.na4) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r4.Y
            if (r6 == 0) goto L53b
            r7 = 1
            if (r6 == r7) goto L537
            r7 = 2
            if (r6 == r7) goto L533
            if (r6 == r5) goto L537
            if (r6 != r1) goto L52d
            goto L537
        L52d:
            defpackage.i.m(r9)
            r7 = r11
            goto L5a2
        L533:
            defpackage.oi2.Y(r27)
            goto L56c
        L537:
            defpackage.oi2.Y(r27)
            goto L5a1
        L53b:
            defpackage.oi2.Y(r27)
            java.lang.Object r6 = r4.Z
            eh6 r6 = (defpackage.eh6) r6
            w31 r7 = defpackage.dh6.a
            if (r6 != r7) goto L550
            r7 = 1
            r4.Y = r7
            java.lang.Object r0 = r0.b(r2, r4)
            if (r0 != r3) goto L5a1
            goto L59f
        L550:
            x31 r7 = defpackage.dh6.b
            r8 = 0
            if (r6 != r7) goto L575
            r1 = r2
            t1 r1 = (defpackage.t1) r1
            yt6 r1 = r1.i()
            ai0 r6 = new ai0
            r7 = 2
            r9 = 1
            r6.<init>(r7, r8, r9)
            r4.Y = r7
            java.lang.Object r1 = defpackage.f04.C(r1, r6, r4)
            if (r1 != r3) goto L56c
            goto L59f
        L56c:
            r4.Y = r5
            java.lang.Object r0 = r0.b(r2, r4)
            if (r0 != r3) goto L5a1
            goto L59f
        L575:
            r5 = r2
            t1 r5 = (defpackage.t1) r5
            yt6 r5 = r5.i()
            le2 r5 = r6.d(r5)
            le2 r5 = defpackage.f04.z(r5)
            l5 r18 = new l5
            java.lang.Object r6 = r4.f0
            r23 = 13
            r19 = r0
            r20 = r2
            r21 = r6
            r22 = r8
            r18.<init>(r19, r20, r21, r22, r23)
            r0 = r18
            r4.Y = r1
            java.lang.Object r0 = defpackage.f04.v(r5, r0, r4)
            if (r0 != r3) goto L5a1
        L59f:
            r7 = r3
            goto L5a2
        L5a1:
            r7 = r10
        L5a2:
            return r7
        L5a3:
            r10 = r7
            java.lang.Object r0 = r4.e0
            na4 r0 = (defpackage.na4) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r4.Y
            r7 = 1
            if (r2 == 0) goto L5ba
            if (r2 != r7) goto L5b5
            defpackage.oi2.Y(r27)
            goto L5ef
        L5b5:
            defpackage.i.m(r9)
        L5b8:
            r7 = r11
            goto L5f0
        L5ba:
            defpackage.oi2.Y(r27)
            java.lang.Object r2 = r4.Z
            ch6 r2 = (defpackage.ch6) r2
            int[] r3 = defpackage.uf2.a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r7) goto L5e0
            r7 = 2
            if (r2 == r7) goto L5ef
            if (r2 != r5) goto L5dc
            gr1 r1 = defpackage.pf6.a
            if (r8 != r1) goto L5d8
            r0.h()
            goto L5ef
        L5d8:
            r0.k(r8)
            goto L5ef
        L5dc:
            defpackage.i.d()
            goto L5b8
        L5e0:
            java.lang.Object r2 = r4.d0
            le2 r2 = (defpackage.le2) r2
            r5 = 1
            r4.Y = r5
            java.lang.Object r0 = r2.b(r0, r4)
            if (r0 != r1) goto L5ef
            r7 = r1
            goto L5f0
        L5ef:
            r7 = r10
        L5f0:
            return r7
        L5f1:
            r5 = r10
            r10 = r7
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L608
            if (r1 != r5) goto L603
            java.lang.Object r0 = r4.Z
            dh5 r0 = (defpackage.dh5) r0
            defpackage.oi2.Y(r27)
            goto L64a
        L603:
            defpackage.i.m(r9)
            r7 = r11
            goto L652
        L608:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.d0
            gm0 r1 = (defpackage.gm0) r1
            java.lang.Object r1 = r1.a
            java.lang.Object r2 = r4.e0
            dh5 r2 = (defpackage.dh5) r2
            boolean r3 = r1 instanceof defpackage.fm0
            if (r3 != 0) goto L61b
            r2.A = r1
        L61b:
            ne2 r8 = (defpackage.ne2) r8
            if (r3 == 0) goto L651
            boolean r3 = r1 instanceof defpackage.em0
            if (r3 == 0) goto L627
            r3 = r1
            em0 r3 = (defpackage.em0) r3
            goto L628
        L627:
            r3 = r11
        L628:
            if (r3 == 0) goto L62d
            java.lang.Throwable r3 = r3.a
            goto L62e
        L62d:
            r3 = r11
        L62e:
            if (r3 != 0) goto L650
            java.lang.Object r3 = r2.A
            if (r3 == 0) goto L64b
            gr1 r5 = defpackage.fh4.a
            if (r3 != r5) goto L639
            goto L63a
        L639:
            r11 = r3
        L63a:
            r4.d0 = r1
            r4.Z = r2
            r5 = 1
            r4.Y = r5
            java.lang.Object r1 = r8.a(r11, r4)
            if (r1 != r0) goto L649
            r7 = r0
            goto L652
        L649:
            r0 = r2
        L64a:
            r2 = r0
        L64b:
            gr1 r0 = defpackage.fh4.c
            r2.A = r0
            goto L651
        L650:
            throw r3
        L651:
            r7 = r10
        L652:
            return r7
        L653:
            r10 = r7
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L666
            r5 = 1
            if (r1 != r5) goto L661
            defpackage.oi2.Y(r27)
            goto L688
        L661:
            defpackage.i.m(r9)
            r7 = r11
            goto L689
        L666:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.Z
            q35 r1 = (defpackage.q35) r1
            java.lang.Object r2 = r4.d0
            ut3 r2 = (defpackage.ut3) r2
            java.lang.Object r3 = r4.e0
            tt3 r3 = (defpackage.tt3) r3
            re2 r5 = new re2
            le2 r8 = (defpackage.le2) r8
            r12 = 0
            r5.<init>(r8, r1, r11, r12)
            r7 = 1
            r4.Y = r7
            java.lang.Object r1 = defpackage.np2.c0(r2, r3, r5, r4)
            if (r1 != r0) goto L688
            r7 = r0
            goto L689
        L688:
            r7 = r10
        L689:
            return r7
        L68a:
            r25 = r10
            r10 = r7
            r7 = r25
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L6a0
            if (r1 != r7) goto L69b
            defpackage.oi2.Y(r27)
            goto L6be
        L69b:
            defpackage.i.m(r9)
            r7 = r11
            goto L6bf
        L6a0:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.Z
            sz1 r1 = (defpackage.sz1) r1
            ck4 r1 = r1.j
            java.lang.Object r2 = r4.d0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.e0
            java.lang.String r3 = (java.lang.String) r3
            vj4 r8 = (defpackage.vj4) r8
            r5 = 1
            r4.Y = r5
            java.lang.Object r1 = r1.c(r2, r3, r8, r4)
            if (r1 != r0) goto L6be
            r7 = r0
            goto L6bf
        L6be:
            r7 = r10
        L6bf:
            return r7
        L6c0:
            r5 = r10
            r10 = r7
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L6d3
            if (r1 != r5) goto L6ce
            defpackage.oi2.Y(r27)
            goto L702
        L6ce:
            defpackage.i.m(r9)
            r7 = r11
            goto L703
        L6d3:
            defpackage.oi2.Y(r27)
            v70 r18 = new v70
            java.lang.Object r1 = r4.Z
            r19 = r1
            nv4 r19 = (defpackage.nv4) r19
            java.lang.Object r1 = r4.d0
            r20 = r1
            sz1 r20 = (defpackage.sz1) r20
            java.lang.Object r1 = r4.e0
            r21 = r1
            pq5 r21 = (defpackage.pq5) r21
            r22 = r8
            v80 r22 = (defpackage.v80) r22
            r23 = 0
            r24 = 1
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r1 = r18
            r5 = 1
            r4.Y = r5
            java.lang.Object r1 = defpackage.g04.C(r1, r4)
            if (r1 != r0) goto L702
            r7 = r0
            goto L703
        L702:
            r7 = r10
        L703:
            return r7
        L704:
            r5 = r10
            r10 = r7
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L719
            if (r1 != r5) goto L714
            defpackage.oi2.Y(r27)
            r1 = r27
            goto L740
        L714:
            defpackage.i.m(r9)
            r7 = r11
            goto L74a
        L719:
            defpackage.oi2.Y(r27)
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            ag r11 = new ag
            java.lang.Object r2 = r4.d0
            r12 = r2
            sz1 r12 = (defpackage.sz1) r12
            java.lang.Object r2 = r4.e0
            r13 = r2
            dy1 r13 = (defpackage.dy1) r13
            r14 = r8
            c46 r14 = (defpackage.c46) r14
            r15 = 0
            r16 = 6
            r11.<init>(r12, r13, r14, r15, r16)
            r5 = 1
            r4.Y = r5
            java.lang.Object r1 = defpackage.hv.d0(r1, r11, r4)
            if (r1 != r0) goto L740
            r7 = r0
            goto L74a
        L740:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r4.Z
            hu1 r0 = (defpackage.hu1) r0
            r0.g(r1)
            r7 = r10
        L74a:
            return r7
        L74b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L75f
            r5 = 1
            if (r1 != r5) goto L75a
            defpackage.oi2.Y(r27)
            r0 = r27
            goto L77b
        L75a:
            defpackage.i.m(r9)
            r0 = r11
            goto L77b
        L75f:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.Z
            androidx.work.impl.workers.ConstraintTrackingWorker r1 = (androidx.work.impl.workers.ConstraintTrackingWorker) r1
            java.lang.Object r2 = r4.d0
            nx3 r2 = (defpackage.nx3) r2
            java.lang.Object r3 = r4.e0
            ww2 r3 = (defpackage.ww2) r3
            yw7 r8 = (defpackage.yw7) r8
            r5 = 1
            r4.Y = r5
            java.lang.Object r1 = androidx.work.impl.workers.ConstraintTrackingWorker.g(r1, r2, r3, r8, r4)
            if (r1 != r0) goto L77a
            goto L77b
        L77a:
            r0 = r1
        L77b:
            return r0
        L77c:
            r5 = r10
            r10 = r7
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L791
            if (r1 != r5) goto L78c
            defpackage.oi2.Y(r27)
            r1 = r27
            goto L7a6
        L78c:
            defpackage.i.m(r9)
            r7 = r11
            goto L7b9
        L791:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.Z
            ww2 r1 = (defpackage.ww2) r1
            java.lang.Object r2 = r4.d0
            yw7 r2 = (defpackage.yw7) r2
            r4.Y = r5
            java.lang.Object r1 = defpackage.i21.a(r1, r2, r4)
            if (r1 != r0) goto L7a6
            r7 = r0
            goto L7b9
        L7a6:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            java.lang.Object r1 = r4.e0
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            r1.set(r0)
            gx3 r8 = (defpackage.gx3) r8
            r8.cancel(r5)
            r7 = r10
        L7b9:
            return r7
        L7ba:
            r5 = r10
            r10 = r7
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L7cf
            if (r1 != r5) goto L7ca
            defpackage.oi2.Y(r27)
            r1 = r27
            goto L7f6
        L7ca:
            defpackage.i.m(r9)
            r7 = r11
            goto L802
        L7cf:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.Z
            dx0 r1 = (defpackage.dx0) r1
            java.lang.Object r2 = r4.d0
            android.view.ScrollCaptureSession r2 = (android.view.ScrollCaptureSession) r2
            java.lang.Object r3 = r4.e0
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            m93 r5 = new m93
            int r6 = r3.left
            int r7 = r3.top
            int r9 = r3.right
            int r3 = r3.bottom
            r5.<init>(r6, r7, r9, r3)
            r7 = 1
            r4.Y = r7
            java.lang.Object r1 = defpackage.dx0.a(r1, r2, r5, r4)
            if (r1 != r0) goto L7f6
            r7 = r0
            goto L802
        L7f6:
            m93 r1 = (defpackage.m93) r1
            java.util.function.Consumer r8 = (java.util.function.Consumer) r8
            android.graphics.Rect r0 = defpackage.ej2.Z(r1)
            r8.accept(r0)
            r7 = r10
        L802:
            return r7
        L803:
            r10 = r7
            java.lang.Object r0 = r4.d0
            cp2 r0 = (defpackage.cp2) r0
            java.lang.Object r1 = r4.e0
            aq0 r1 = (defpackage.aq0) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r4.Y
            if (r3 == 0) goto L82c
            r5 = 1
            if (r3 == r5) goto L826
            r7 = 2
            if (r3 != r7) goto L820
            java.lang.Object r2 = r4.Z
            cp2 r2 = (defpackage.cp2) r2
            defpackage.oi2.Y(r27)
            goto L876
        L820:
            defpackage.i.m(r9)
            r7 = r11
            goto L8b5
        L826:
            defpackage.oi2.Y(r27)
            r3 = r27
            goto L860
        L82c:
            defpackage.oi2.Y(r27)
            if (r0 == 0) goto L833
            r3 = r0
            goto L862
        L833:
            lx5 r3 = r1.d
            if (r3 != 0) goto L839
            goto L8b4
        L839:
            cp2 r18 = new cp2
            java.lang.String r5 = r3.d
            java.lang.String r6 = r3.a
            java.lang.String r22 = r3.b()
            yt1 r23 = defpackage.yt1.A
            r19 = 0
            r20 = r5
            r21 = r6
            r18.<init>(r19, r20, r21, r22, r23)
            r3 = r18
            hp0 r5 = r1.b
            r4.Z = r11
            r7 = 1
            r4.Y = r7
            h16 r5 = (defpackage.h16) r5
            java.lang.Object r3 = r5.e(r3, r4)
            if (r3 != r2) goto L860
            goto L873
        L860:
            cp2 r3 = (defpackage.cp2) r3
        L862:
            hp0 r5 = r1.b
            java.lang.String r8 = (java.lang.String) r8
            r4.Z = r3
            r7 = 2
            r4.Y = r7
            h16 r5 = (defpackage.h16) r5
            java.lang.Object r4 = r5.c(r8, r3, r4)
            if (r4 != r2) goto L875
        L873:
            r7 = r2
            goto L8b5
        L875:
            r2 = r3
        L876:
            if (r0 != 0) goto L8b4
            v46 r0 = r1.c
            r2.getClass()
            java.lang.Long r4 = r2.a
            java.lang.String r5 = r2.b
            java.lang.String r6 = r2.c
            java.lang.String r7 = r2.d
            java.util.List r1 = r2.e
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r1, r2)
            r8.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L896:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8aa
            java.lang.Object r2 = r1.next()
            an0 r2 = (defpackage.an0) r2
            dn0 r2 = defpackage.u24.m(r2)
            r8.add(r2)
            goto L896
        L8aa:
            pp2 r3 = new pp2
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r1 = "selected_game"
            r0.c(r3, r1)
        L8b4:
            r7 = r10
        L8b5:
            return r7
        L8b6:
            r12 = r3
            r10 = r7
            java.lang.Object r0 = r4.e0
            me.magnum.melonds.domain.model.Cheat r0 = (me.magnum.melonds.domain.model.Cheat) r0
            java.lang.Object r2 = r4.d0
            android.content.res.Resources r2 = (android.content.res.Resources) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r4.Y
            if (r6 == 0) goto L8d5
            r7 = 1
            if (r6 != r7) goto L8cf
            defpackage.oi2.Y(r27)
            r1 = r27
            goto L900
        L8cf:
            defpackage.i.m(r9)
            r7 = r11
            goto L956
        L8d5:
            defpackage.oi2.Y(r27)
            java.lang.Object r6 = r4.Z
            gl6 r6 = (defpackage.gl6) r6
            java.lang.String r7 = r0.getName()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r9 = 2131951777(0x7f1300a1, float:1.9539978E38)
            java.lang.String r7 = r2.getString(r9, r7)
            r7.getClass()
            r9 = 2131952778(0x7f13048a, float:1.9542008E38)
            java.lang.String r2 = r2.getString(r9)
            r9 = 1
            r4.Y = r9
            java.lang.Object r1 = defpackage.gl6.b(r6, r7, r2, r4, r1)
            if (r1 != r3) goto L900
            r7 = r3
            goto L956
        L900:
            ll6 r1 = (defpackage.ll6) r1
            ll6 r2 = defpackage.ll6.ActionPerformed
            if (r1 != r2) goto L955
            aq0 r8 = (defpackage.aq0) r8
            r8.getClass()
            r0.getClass()
            java.util.ArrayList r1 = r8.f
            r1.getClass()
            int r2 = r1.size()
            r3 = r12
        L918:
            if (r12 >= r2) goto L939
            java.lang.Object r4 = r1.get(r12)
            int r12 = r12 + 1
            jh1 r4 = (defpackage.jh1) r4
            r4.getClass()
            me.magnum.melonds.domain.model.Cheat r4 = r4.a
            java.lang.Long r4 = r4.getId()
            java.lang.Long r6 = r0.getId()
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 == 0) goto L936
            goto L93a
        L936:
            int r3 = r3 + 1
            goto L918
        L939:
            r3 = -1
        L93a:
            if (r3 < 0) goto L941
            java.lang.Object r0 = r1.remove(r3)
            goto L942
        L941:
            r0 = r11
        L942:
            jh1 r0 = (defpackage.jh1) r0
            if (r0 != 0) goto L947
            goto L955
        L947:
            as0 r1 = defpackage.to7.a(r8)
            z r2 = new z
            r3 = 20
            r2.<init>(r8, r0, r11, r3)
            defpackage.hv.L(r1, r11, r11, r2, r5)
        L955:
            r7 = r10
        L956:
            return r7
        L957:
            r10 = r7
            r6 = r8
            gn r6 = (defpackage.gn) r6
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r4.Y
            if (r0 == 0) goto L96d
            r5 = 1
            if (r0 != r5) goto L968
            defpackage.oi2.Y(r27)
            goto L99c
        L968:
            defpackage.i.m(r9)
            r7 = r11
            goto L9b2
        L96d:
            defpackage.oi2.Y(r27)
            java.lang.Object r0 = r4.e0
            vs4 r1 = r6.e
            java.lang.Object r1 = r1.getValue()
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L9b1
            r0 = r8
            gn r0 = (defpackage.gn) r0
            java.lang.Object r1 = r4.e0
            java.lang.Object r2 = r4.Z
            qa4 r2 = (defpackage.qa4) r2
            io6 r3 = defpackage.in.a
            java.lang.Object r2 = r2.getValue()
            to r2 = (defpackage.to) r2
            r5 = 1
            r4.Y = r5
            r3 = 0
            r5 = 12
            java.lang.Object r0 = defpackage.gn.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L99c
            goto L9b2
        L99c:
            java.lang.Object r0 = r4.d0
            qa4 r0 = (defpackage.qa4) r0
            io6 r1 = defpackage.in.a
            java.lang.Object r0 = r0.getValue()
            qn2 r0 = (defpackage.qn2) r0
            if (r0 == 0) goto L9b1
            java.lang.Object r1 = r6.d()
            r0.g(r1)
        L9b1:
            r7 = r10
        L9b2:
            return r7
        L9b3:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            if (r1 == 0) goto L9c4
            r5 = 1
            if (r1 == r5) goto L9c0
            defpackage.i.m(r9)
            goto L9f6
        L9c0:
            defpackage.oi2.Y(r27)
            goto L9f3
        L9c4:
            defpackage.oi2.Y(r27)
            java.lang.Object r1 = r4.Z
            r19 = r1
            rj r19 = (defpackage.rj) r19
            ji r18 = new ji
            java.lang.Object r1 = r4.d0
            r20 = r1
            qn2 r20 = (defpackage.qn2) r20
            java.lang.Object r1 = r4.e0
            r21 = r1
            ki r21 = (defpackage.ki) r21
            r22 = r8
            et3 r22 = (defpackage.et3) r22
            r23 = 0
            r24 = 0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r1 = r18
            r5 = 1
            r4.Y = r5
            java.lang.Object r1 = defpackage.g04.C(r1, r4)
            if (r1 != r0) goto L9f3
            r11 = r0
            goto L9f6
        L9f3:
            defpackage.e41.c()
        L9f6:
            return r11
        L9f7:
            r10 = r7
            java.lang.Object r0 = r4.d0
            qa4 r0 = (defpackage.qa4) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r4.Y
            if (r2 == 0) goto La14
            r5 = 1
            if (r2 != r5) goto La0f
            java.lang.Object r0 = r4.Z
            qa4 r0 = (defpackage.qa4) r0
            defpackage.oi2.Y(r27)
            r2 = r27
            goto La2f
        La0f:
            defpackage.i.m(r9)
            r7 = r11
            goto La47
        La14:
            defpackage.oi2.Y(r27)
            qs3 r2 = defpackage.qs3.b
            r0.setValue(r2)
            java.lang.Object r2 = r4.e0
            eo2 r2 = (defpackage.eo2) r2
            ta5 r8 = (defpackage.ta5) r8
            r4.Z = r0
            r5 = 1
            r4.Y = r5
            java.lang.Object r2 = r2.o(r8, r4)
            if (r2 != r1) goto La2f
            r7 = r1
            goto La47
        La2f:
            hm5 r2 = (defpackage.hm5) r2
            java.lang.Object r1 = r2.A
            java.lang.Throwable r2 = defpackage.hm5.a(r1)
            if (r2 != 0) goto La41
            ya5 r1 = (defpackage.ya5) r1
            rs3 r2 = new rs3
            r2.<init>(r1)
            goto La43
        La41:
            qs3 r2 = defpackage.qs3.a
        La43:
            r0.setValue(r2)
            r7 = r10
        La47:
            return r7
    }
}
