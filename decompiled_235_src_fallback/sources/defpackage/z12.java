package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z12  reason: default package */
/* loaded from: classes.dex */
public final class z12 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.en5 X;
    public defpackage.uz1 Y;
    public java.util.List Z;
    public boolean d0;
    public int e0;
    public /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ defpackage.sz1 g0;
    public final /* synthetic */ defpackage.pq5 h0;

    public z12(defpackage.sz1 r1, defpackage.pq5 r2, defpackage.r41 r3) {
            r0 = this;
            r0.g0 = r1
            r0.h0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            z12 r0 = (defpackage.z12) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            z12 r0 = new z12
            sz1 r1 = r2.g0
            pq5 r2 = r2.h0
            r0.<init>(r1, r2, r3)
            r0.f0 = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r20) {
            r19 = this;
            r1 = r19
            java.lang.String r2 = "RetroAchievements launch decision failed for '"
            java.lang.Object r0 = r1.f0
            w61 r0 = (defpackage.w61) r0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r1.e0
            r5 = 3
            r6 = 1
            r7 = 0
            r8 = 0
            switch(r4) {
                case 0: goto L68;
                case 1: goto L62;
                case 2: goto L50;
                case 3: goto L47;
                case 4: goto L40;
                case 5: goto L33;
                case 6: goto L2a;
                case 7: goto L21;
                case 8: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L19:
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L1e
            goto L309
        L1e:
            r0 = move-exception
            goto L34c
        L21:
            boolean r0 = r1.d0
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L1e
            r2 = r20
            goto L2b9
        L2a:
            boolean r0 = r1.d0
            java.util.List r2 = r1.Z
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L1e
            goto L293
        L33:
            boolean r0 = r1.d0
            java.util.List r2 = r1.Z
            lx5 r2 = (defpackage.lx5) r2
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L1e
            r2 = r20
            goto L272
        L40:
            boolean r0 = r1.d0
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L1e
            goto L245
        L47:
            boolean r0 = r1.d0
            uz1 r2 = r1.Y
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L1e
            goto L1b5
        L50:
            boolean r4 = r1.d0
            uz1 r0 = r1.Y
            w61 r0 = (defpackage.w61) r0
            en5 r9 = r1.X
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L5f
            r0 = r20
            goto L10a
        L5f:
            r0 = move-exception
            goto L10d
        L62:
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L1e
            r0 = r20
            goto Lcb
        L68:
            defpackage.oi2.Y(r20)
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            tp6 r4 = r4.p0     // Catch: java.lang.Throwable -> L1e
            zx1 r9 = new zx1     // Catch: java.lang.Throwable -> L1e
            r9.<init>(r8, r8)     // Catch: java.lang.Throwable -> L1e
            r4.getClass()     // Catch: java.lang.Throwable -> L1e
            r4.m(r8, r9)     // Catch: java.lang.Throwable -> L1e
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            pq5 r9 = r1.h0     // Catch: java.lang.Throwable -> L1e
            r4.n1 = r9     // Catch: java.lang.Throwable -> L1e
            tp6 r4 = r4.v0     // Catch: java.lang.Throwable -> L1e
            r4.l(r9)     // Catch: java.lang.Throwable -> L1e
            pq5 r4 = r1.h0     // Catch: java.lang.Throwable -> L1e
            jt5 r4 = r4.f     // Catch: java.lang.Throwable -> L1e
            jq1 r4 = r4.p     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L97
            sz1 r9 = r1.g0     // Catch: java.lang.Throwable -> L1e
            tp6 r9 = r9.X0     // Catch: java.lang.Throwable -> L1e
            r9.getClass()     // Catch: java.lang.Throwable -> L1e
            r9.m(r8, r4)     // Catch: java.lang.Throwable -> L1e
        L97:
            pq5 r4 = r1.h0     // Catch: java.lang.Throwable -> L1e
            jt5 r4 = r4.f     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r4 = r4.q     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto La9
            sz1 r9 = r1.g0     // Catch: java.lang.Throwable -> L1e
            tp6 r9 = r9.V0     // Catch: java.lang.Throwable -> L1e
            r9.getClass()     // Catch: java.lang.Throwable -> L1e
            r9.m(r8, r4)     // Catch: java.lang.Throwable -> L1e
        La9:
            pq5 r4 = r1.h0     // Catch: java.lang.Throwable -> L1e
            jt5 r4 = r4.f     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r4 = r4.r     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto Lbb
            sz1 r9 = r1.g0     // Catch: java.lang.Throwable -> L1e
            tp6 r9 = r9.Z0     // Catch: java.lang.Throwable -> L1e
            r9.getClass()     // Catch: java.lang.Throwable -> L1e
            r9.m(r8, r4)     // Catch: java.lang.Throwable -> L1e
        Lbb:
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            pq5 r9 = r1.h0     // Catch: java.lang.Throwable -> L1e
            r1.f0 = r0     // Catch: java.lang.Throwable -> L1e
            r1.e0 = r6     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r4.w0(r9, r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 != r3) goto Lcb
            goto L308
        Lcb:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L1e
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Throwable -> L1e
            sz1 r0 = r1.g0
            cn5 r9 = r0.d
            if (r4 == 0) goto Le4
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L1e
            en5 r0 = r9.a()     // Catch: java.lang.Throwable -> Le1
            r9.c = r0     // Catch: java.lang.Throwable -> Le1
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L1e
        Ldf:
            r9 = r0
            goto Lf1
        Le1:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le1
            throw r0     // Catch: java.lang.Throwable -> L1e
        Le4:
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L1e
            r9.c = r8     // Catch: java.lang.Throwable -> L349
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L1e
            sz1 r0 = r1.g0     // Catch: java.lang.Throwable -> L1e
            cn5 r0 = r0.d     // Catch: java.lang.Throwable -> L1e
            en5 r0 = r0.a()     // Catch: java.lang.Throwable -> L1e
            goto Ldf
        Lf1:
            if (r4 == 0) goto L149
            sz1 r0 = r1.g0     // Catch: java.lang.Throwable -> L1e
            pq5 r10 = r1.h0     // Catch: java.lang.Throwable -> L1e
            r1.f0 = r8     // Catch: java.lang.Throwable -> L5f
            r1.X = r9     // Catch: java.lang.Throwable -> L5f
            r1.Y = r8     // Catch: java.lang.Throwable -> L5f
            r1.d0 = r4     // Catch: java.lang.Throwable -> L5f
            r11 = 2
            r1.e0 = r11     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = defpackage.sz1.j(r0, r10, r9, r1)     // Catch: java.lang.Throwable -> L5f
            if (r0 != r3) goto L10a
            goto L308
        L10a:
            uz1 r0 = (defpackage.uz1) r0     // Catch: java.lang.Throwable -> L5f
            goto L113
        L10d:
            em5 r10 = new em5     // Catch: java.lang.Throwable -> L1e
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            r0 = r10
        L113:
            pq5 r10 = r1.h0     // Catch: java.lang.Throwable -> L1e
            java.lang.Throwable r11 = defpackage.hm5.a(r0)     // Catch: java.lang.Throwable -> L1e
            if (r11 != 0) goto L11c
            goto L145
        L11c:
            java.lang.String r0 = "EmulatorViewModel"
            java.lang.String r10 = r10.a     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            r12.append(r10)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "'"
            r12.append(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r12.toString()     // Catch: java.lang.Throwable -> L1e
            android.util.Log.e(r0, r2, r11)     // Catch: java.lang.Throwable -> L1e
            uz1 r12 = new uz1     // Catch: java.lang.Throwable -> L1e
            sz1$b r13 = defpackage.sz1.b.ONLINE_LIVE     // Catch: java.lang.Throwable -> L1e
            sz1$d r14 = defpackage.sz1.d.SOFTCORE     // Catch: java.lang.Throwable -> L1e
            r17 = 0
            r18 = 0
            r15 = 0
            r16 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L1e
            r0 = r12
        L145:
            uz1 r0 = (defpackage.uz1) r0     // Catch: java.lang.Throwable -> L1e
            r11 = r0
            goto L158
        L149:
            uz1 r10 = new uz1     // Catch: java.lang.Throwable -> L1e
            sz1$b r11 = defpackage.sz1.b.ONLINE_LIVE     // Catch: java.lang.Throwable -> L1e
            sz1$d r12 = defpackage.sz1.d.SOFTCORE     // Catch: java.lang.Throwable -> L1e
            r15 = 0
            r16 = 0
            r13 = 0
            r14 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L1e
            r11 = r10
        L158:
            java.lang.String r0 = r9.e     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L15e
            java.lang.String r0 = ""
        L15e:
            r15 = r0
            long r9 = r9.f     // Catch: java.lang.Throwable -> L1e
            r18 = 127(0x7f, float:1.78E-43)
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = r9
            uz1 r2 = defpackage.uz1.a(r11, r12, r13, r14, r15, r16, r18)     // Catch: java.lang.Throwable -> L1e
            sz1 r0 = r1.g0     // Catch: java.lang.Throwable -> L1e
            sz1$b r9 = r2.a     // Catch: java.lang.Throwable -> L1e
            r0.G = r9     // Catch: java.lang.Throwable -> L1e
            sz1$d r10 = r2.b     // Catch: java.lang.Throwable -> L1e
            r0.H = r10     // Catch: java.lang.Throwable -> L1e
            boolean r10 = r2.d     // Catch: java.lang.Throwable -> L1e
            r0.I = r10     // Catch: java.lang.Throwable -> L1e
            sz1$b r10 = defpackage.sz1.b.ONLINE_LIVE     // Catch: java.lang.Throwable -> L1e
            if (r9 != r10) goto L180
            r9 = r6
            goto L181
        L180:
            r9 = r7
        L181:
            r0.J = r9     // Catch: java.lang.Throwable -> L1e
            rx1 r9 = new rx1     // Catch: java.lang.Throwable -> L1e
            pq5 r10 = r1.h0     // Catch: java.lang.Throwable -> L1e
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L1e
            sz1$d r10 = r2.b     // Catch: java.lang.Throwable -> L1e
            sz1$d r11 = defpackage.sz1.d.HARDCORE     // Catch: java.lang.Throwable -> L1e
            if (r10 != r11) goto L192
            r10 = r6
            goto L193
        L192:
            r10 = r7
        L193:
            r1.f0 = r8     // Catch: java.lang.Throwable -> L1e
            r1.X = r8     // Catch: java.lang.Throwable -> L1e
            r1.Y = r2     // Catch: java.lang.Throwable -> L1e
            r1.d0 = r4     // Catch: java.lang.Throwable -> L1e
            r1.e0 = r5     // Catch: java.lang.Throwable -> L1e
            sx1 r0 = r0.w     // Catch: java.lang.Throwable -> L1e
            r0.b = r4     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L1a7
            if (r10 == 0) goto L1a7
            r10 = r6
            goto L1a8
        L1a7:
            r10 = r7
        L1a8:
            r0.a = r10     // Catch: java.lang.Throwable -> L1e
            r0.d = r7     // Catch: java.lang.Throwable -> L1e
            r0.e = r9     // Catch: java.lang.Throwable -> L1e
            jg7 r0 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L1e
            if (r0 != r3) goto L1b4
            goto L308
        L1b4:
            r0 = r4
        L1b5:
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            o41 r9 = r4.z     // Catch: java.lang.Throwable -> L1e
            hz1 r10 = new hz1     // Catch: java.lang.Throwable -> L1e
            r11 = 22
            r10.<init>(r11, r8, r4)     // Catch: java.lang.Throwable -> L1e
            defpackage.hv.L(r9, r8, r8, r10, r5)     // Catch: java.lang.Throwable -> L1e
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            o41 r9 = r4.z     // Catch: java.lang.Throwable -> L1e
            hz1 r10 = new hz1     // Catch: java.lang.Throwable -> L1e
            r11 = 25
            r10.<init>(r11, r8, r4)     // Catch: java.lang.Throwable -> L1e
            defpackage.hv.L(r9, r8, r8, r10, r5)     // Catch: java.lang.Throwable -> L1e
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            o41 r9 = r4.z     // Catch: java.lang.Throwable -> L1e
            hz1 r10 = new hz1     // Catch: java.lang.Throwable -> L1e
            r11 = 24
            r10.<init>(r11, r8, r4)     // Catch: java.lang.Throwable -> L1e
            defpackage.hv.L(r9, r8, r8, r10, r5)     // Catch: java.lang.Throwable -> L1e
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            o41 r9 = r4.z     // Catch: java.lang.Throwable -> L1e
            hz1 r10 = new hz1     // Catch: java.lang.Throwable -> L1e
            r11 = 23
            r10.<init>(r11, r8, r4)     // Catch: java.lang.Throwable -> L1e
            defpackage.hv.L(r9, r8, r8, r10, r5)     // Catch: java.lang.Throwable -> L1e
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            o41 r9 = r4.z     // Catch: java.lang.Throwable -> L1e
            hz1 r10 = new hz1     // Catch: java.lang.Throwable -> L1e
            r11 = 19
            r10.<init>(r11, r8, r4)     // Catch: java.lang.Throwable -> L1e
            defpackage.hv.L(r9, r8, r8, r10, r5)     // Catch: java.lang.Throwable -> L1e
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            o41 r9 = r4.z     // Catch: java.lang.Throwable -> L1e
            hz1 r10 = new hz1     // Catch: java.lang.Throwable -> L1e
            r11 = 18
            r10.<init>(r11, r8, r4)     // Catch: java.lang.Throwable -> L1e
            defpackage.hv.L(r9, r8, r8, r10, r5)     // Catch: java.lang.Throwable -> L1e
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            o41 r9 = r4.z     // Catch: java.lang.Throwable -> L1e
            hz1 r10 = new hz1     // Catch: java.lang.Throwable -> L1e
            r11 = 21
            r10.<init>(r11, r8, r4)     // Catch: java.lang.Throwable -> L1e
            defpackage.hv.L(r9, r8, r8, r10, r5)     // Catch: java.lang.Throwable -> L1e
            sz1 r4 = r1.g0
            if (r0 == 0) goto L236
            pq5 r7 = r1.h0     // Catch: java.lang.Throwable -> L1e
            tu0 r2 = r4.Z0(r7, r2)     // Catch: java.lang.Throwable -> L1e
            r1.f0 = r8     // Catch: java.lang.Throwable -> L1e
            r1.X = r8     // Catch: java.lang.Throwable -> L1e
            r1.Y = r8     // Catch: java.lang.Throwable -> L1e
            r1.d0 = r0     // Catch: java.lang.Throwable -> L1e
            r4 = 4
            r1.e0 = r4     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.q(r1)     // Catch: java.lang.Throwable -> L1e
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> L1e
            if (r2 != r3) goto L245
            goto L308
        L236:
            r4.N = r8     // Catch: java.lang.Throwable -> L1e
            sz1$c r2 = defpackage.sz1.c.DISABLED     // Catch: java.lang.Throwable -> L1e
            r4.O = r2     // Catch: java.lang.Throwable -> L1e
            sx1 r2 = r4.w     // Catch: java.lang.Throwable -> L1e
            r2.d = r7     // Catch: java.lang.Throwable -> L1e
            dp2 r4 = defpackage.dp2.DISABLED_BY_SETTING     // Catch: java.lang.Throwable -> L1e
            r2.d(r4)     // Catch: java.lang.Throwable -> L1e
        L245:
            sz1 r2 = r1.g0     // Catch: java.lang.Throwable -> L1e
            pq5 r4 = r1.h0     // Catch: java.lang.Throwable -> L1e
            mp r2 = r2.p     // Catch: java.lang.Throwable -> L1e
            android.net.Uri r7 = r4.d     // Catch: java.lang.Throwable -> L1e
            pw5 r2 = r2.b(r7)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L258
            lx5 r2 = r2.a(r4)     // Catch: java.lang.Throwable -> L1e
            goto L259
        L258:
            r2 = r8
        L259:
            if (r2 == 0) goto L276
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            r1.f0 = r8     // Catch: java.lang.Throwable -> L1e
            r1.X = r8     // Catch: java.lang.Throwable -> L1e
            r1.Y = r8     // Catch: java.lang.Throwable -> L1e
            r1.Z = r8     // Catch: java.lang.Throwable -> L1e
            r1.d0 = r0     // Catch: java.lang.Throwable -> L1e
            r7 = 5
            r1.e0 = r7     // Catch: java.lang.Throwable -> L1e
            java.io.Serializable r2 = defpackage.sz1.w(r4, r2, r1)     // Catch: java.lang.Throwable -> L1e
            if (r2 != r3) goto L272
            goto L308
        L272:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L278
        L276:
            yt1 r2 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L1e
        L278:
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            pq5 r7 = r1.h0     // Catch: java.lang.Throwable -> L1e
            jt5 r7 = r7.f     // Catch: java.lang.Throwable -> L1e
            r1.f0 = r8     // Catch: java.lang.Throwable -> L1e
            r1.X = r8     // Catch: java.lang.Throwable -> L1e
            r1.Y = r8     // Catch: java.lang.Throwable -> L1e
            r1.Z = r2     // Catch: java.lang.Throwable -> L1e
            r1.d0 = r0     // Catch: java.lang.Throwable -> L1e
            r9 = 6
            r1.e0 = r9     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r4 = defpackage.sz1.i(r4, r7, r1)     // Catch: java.lang.Throwable -> L1e
            if (r4 != r3) goto L293
            goto L308
        L293:
            sz1 r4 = r1.g0     // Catch: java.lang.Throwable -> L1e
            jh r4 = r4.v     // Catch: java.lang.Throwable -> L1e
            pq5 r7 = r1.h0     // Catch: java.lang.Throwable -> L1e
            r1.f0 = r8     // Catch: java.lang.Throwable -> L1e
            r1.X = r8     // Catch: java.lang.Throwable -> L1e
            r1.Y = r8     // Catch: java.lang.Throwable -> L1e
            r1.Z = r8     // Catch: java.lang.Throwable -> L1e
            r1.d0 = r0     // Catch: java.lang.Throwable -> L1e
            r9 = 7
            r1.e0 = r9     // Catch: java.lang.Throwable -> L1e
            r4.getClass()     // Catch: java.lang.Throwable -> L1e
            xe1 r9 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L1e
            de1 r9 = defpackage.de1.L     // Catch: java.lang.Throwable -> L1e
            dh r10 = new dh     // Catch: java.lang.Throwable -> L1e
            r10.<init>(r7, r4, r2, r8)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = defpackage.hv.d0(r9, r10, r1)     // Catch: java.lang.Throwable -> L1e
            if (r2 != r3) goto L2b9
            goto L308
        L2b9:
            cy5 r2 = (defpackage.cy5) r2     // Catch: java.lang.Throwable -> L1e
            boolean r4 = r2 instanceof defpackage.yx5     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L335
            boolean r4 = r2 instanceof defpackage.zx5     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L335
            boolean r4 = r2 instanceof defpackage.ay5     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L335
            boolean r4 = r2 instanceof defpackage.xx5     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L2cc
            goto L335
        L2cc:
            boolean r4 = r2 instanceof defpackage.by5     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L32f
            by5 r2 = (defpackage.by5) r2     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.a     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L2df
            sz1 r2 = r1.g0     // Catch: java.lang.Throwable -> L1e
            of6 r2 = r2.J0     // Catch: java.lang.Throwable -> L1e
            u67 r4 = defpackage.u67.a     // Catch: java.lang.Throwable -> L1e
            r2.k(r4)     // Catch: java.lang.Throwable -> L1e
        L2df:
            sz1 r2 = r1.g0     // Catch: java.lang.Throwable -> L1e
            tp6 r2 = r2.p0     // Catch: java.lang.Throwable -> L1e
            dy1 r4 = new dy1     // Catch: java.lang.Throwable -> L1e
            pq5 r7 = r1.h0     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L1e
            r2.getClass()     // Catch: java.lang.Throwable -> L1e
            r2.m(r8, r4)     // Catch: java.lang.Throwable -> L1e
            sz1 r2 = r1.g0     // Catch: java.lang.Throwable -> L1e
            pq5 r4 = r1.h0     // Catch: java.lang.Throwable -> L1e
            r1.f0 = r8     // Catch: java.lang.Throwable -> L1e
            r1.X = r8     // Catch: java.lang.Throwable -> L1e
            r1.Y = r8     // Catch: java.lang.Throwable -> L1e
            r1.Z = r8     // Catch: java.lang.Throwable -> L1e
            r1.d0 = r0     // Catch: java.lang.Throwable -> L1e
            r0 = 8
            r1.e0 = r0     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = defpackage.sz1.H(r2, r4, r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 != r3) goto L309
        L308:
            return r3
        L309:
            lc1 r0 = defpackage.lc1.a     // Catch: java.lang.Throwable -> L1e
            pq5 r0 = r1.h0     // Catch: java.lang.Throwable -> L1e
            android.net.Uri r2 = r0.d     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> L1e
            defpackage.lc1.b(r2, r0)     // Catch: java.lang.Throwable -> L1e
            sz1 r0 = r1.g0     // Catch: java.lang.Throwable -> L1e
            o41 r2 = r0.z     // Catch: java.lang.Throwable -> L1e
            p12 r3 = new p12     // Catch: java.lang.Throwable -> L1e
            r3.<init>(r6, r8, r0)     // Catch: java.lang.Throwable -> L1e
            defpackage.hv.L(r2, r8, r8, r3, r5)     // Catch: java.lang.Throwable -> L1e
            sz1 r0 = r1.g0     // Catch: java.lang.Throwable -> L1e
            pq5 r2 = r1.h0     // Catch: java.lang.Throwable -> L1e
            o41 r3 = r0.z     // Catch: java.lang.Throwable -> L1e
            c0 r4 = new c0     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r0, r2, r8)     // Catch: java.lang.Throwable -> L1e
            defpackage.hv.L(r3, r8, r8, r4, r5)     // Catch: java.lang.Throwable -> L1e
            goto L37f
        L32f:
            ug r0 = new ug     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L335:
            sz1 r0 = r1.g0     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "rom_load_failed"
            r0.k0(r2)     // Catch: java.lang.Throwable -> L1e
            sz1 r0 = r1.g0     // Catch: java.lang.Throwable -> L1e
            tp6 r0 = r0.p0     // Catch: java.lang.Throwable -> L1e
            ay1 r2 = defpackage.ay1.a     // Catch: java.lang.Throwable -> L1e
            r0.getClass()     // Catch: java.lang.Throwable -> L1e
            r0.m(r8, r2)     // Catch: java.lang.Throwable -> L1e
            goto L37f
        L349:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L349
            throw r0     // Catch: java.lang.Throwable -> L1e
        L34c:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L382
            java.lang.String r2 = "EmulatorViewModel"
            pq5 r3 = r1.h0
            java.lang.String r3 = r3.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to launch ROM '"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = "'"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.e(r2, r3, r0)
            sz1 r0 = r1.g0
            java.lang.String r2 = "rom_launch_exception"
            r0.k0(r2)
            sz1 r0 = r1.g0
            tp6 r0 = r0.p0
            ay1 r1 = defpackage.ay1.a
            r0.getClass()
            r0.m(r8, r1)
        L37f:
            jg7 r0 = defpackage.jg7.a
            return r0
        L382:
            throw r0
    }
}
