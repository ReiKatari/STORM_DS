package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bg2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bg2 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ bg2(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    public /* synthetic */ bg2(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r29) {
            r28 = this;
            r0 = r28
            r1 = r29
            int r2 = r0.A
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            switch(r2) {
                case 0: goto L568;
                case 1: goto L54b;
                case 2: goto L530;
                case 3: goto L51d;
                case 4: goto L47c;
                case 5: goto L46e;
                case 6: goto L460;
                case 7: goto L44f;
                case 8: goto L3aa;
                case 9: goto L399;
                case 10: goto L390;
                case 11: goto L381;
                case 12: goto L2ae;
                case 13: goto L2a2;
                case 14: goto L26b;
                case 15: goto L258;
                case 16: goto L1ce;
                case 17: goto L1a0;
                case 18: goto L175;
                case 19: goto L138;
                case 20: goto L12a;
                case 21: goto L11c;
                case 22: goto L102;
                case 23: goto Lf4;
                case 24: goto Ld4;
                case 25: goto Lca;
                case 26: goto L8b;
                case 27: goto L7f;
                case 28: goto L4e;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r0 = r0.B
            java.util.Map r0 = (java.util.Map) r0
            uh r1 = (defpackage.uh) r1
            r1.getClass()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            android.hardware.camera2.CaptureResult$Key r3 = (android.hardware.camera2.CaptureResult.Key) r3
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            r3.getClass()
            android.hardware.camera2.CaptureResult r4 = r1.A
            java.lang.Object r3 = r4.get(r3)
            boolean r2 = defpackage.gt0.C0(r2, r3)
            if (r2 != 0) goto L20
            goto L49
        L48:
            r5 = r6
        L49:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L4e:
            java.lang.Object r0 = r0.B
            j56 r0 = (defpackage.j56) r0
            qa4 r1 = (defpackage.qa4) r1
            boolean r2 = r1 instanceof defpackage.gm6
            if (r2 == 0) goto L79
            gm6 r1 = (defpackage.gm6) r1
            java.lang.Object r2 = r1.getValue()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r1.getValue()
            r2.getClass()
            java.lang.Object r7 = r0.c(r2)
        L6b:
            im6 r0 = r1.d()
            r0.getClass()
            vs4 r1 = new vs4
            r1.<init>(r7, r0)
            r7 = r1
            goto L7e
        L79:
            java.lang.String r0 = "Failed requirement."
            defpackage.i.h(r0)
        L7e:
            return r7
        L7f:
            java.lang.Object r0 = r0.B
            lf5 r0 = (defpackage.lf5) r0
            ds1 r1 = (defpackage.ds1) r1
            r0.a(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L8b:
            java.lang.Object r0 = r0.B
            if5 r0 = (defpackage.if5) r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r2 = "Recomposer effect job completed"
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            r3.<init>(r2)
            r3.initCause(r1)
            java.lang.Object r2 = r0.c
            monitor-enter(r2)
            rc3 r4 = r0.d     // Catch: java.lang.Throwable -> Lb9
            if (r4 == 0) goto Lbb
            tp6 r5 = r0.u     // Catch: java.lang.Throwable -> Lb9
            ff5 r6 = defpackage.ff5.ShuttingDown     // Catch: java.lang.Throwable -> Lb9
            r5.l(r6)     // Catch: java.lang.Throwable -> Lb9
            r4.h(r3)     // Catch: java.lang.Throwable -> Lb9
            r0.r = r7     // Catch: java.lang.Throwable -> Lb9
            qk4 r3 = new qk4     // Catch: java.lang.Throwable -> Lb9
            r5 = 9
            r3.<init>(r5, r0, r1)     // Catch: java.lang.Throwable -> Lb9
            r4.a0(r3)     // Catch: java.lang.Throwable -> Lb9
            goto Lc4
        Lb9:
            r0 = move-exception
            goto Lc8
        Lbb:
            r0.e = r3     // Catch: java.lang.Throwable -> Lb9
            tp6 r0 = r0.u     // Catch: java.lang.Throwable -> Lb9
            ff5 r1 = defpackage.ff5.ShutDown     // Catch: java.lang.Throwable -> Lb9
            r0.l(r1)     // Catch: java.lang.Throwable -> Lb9
        Lc4:
            monitor-exit(r2)
            jg7 r0 = defpackage.jg7.a
            return r0
        Lc8:
            monitor-exit(r2)
            throw r0
        Lca:
            java.lang.Object r0 = r0.B
            ey0 r0 = (defpackage.ey0) r0
            r0.y(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        Ld4:
            java.lang.Object r0 = r0.B
            n65 r0 = (defpackage.n65) r0
            op5 r1 = (defpackage.op5) r1
            rs4 r0 = r0.e
            float r0 = r0.h()
            long r2 = r1.k0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r0 = r0 - r2
            r1.t(r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        Lf4:
            java.lang.Object r0 = r0.B
            pa r0 = (defpackage.pa) r0
            java.lang.Object r0 = r0.Z
            pu r0 = (defpackage.pu) r0
            r0.addLast(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L102:
            java.lang.Object r0 = r0.B
            e65 r0 = (defpackage.e65) r0
            n8 r1 = (defpackage.n8) r1
            r1.getClass()
            pa r0 = r0.e
            pk5 r2 = new pk5
            r2.<init>(r1)
            java.lang.Object r0 = r0.Y
            v80 r0 = (defpackage.v80) r0
            r0.c(r2)
            jg7 r0 = defpackage.jg7.a
            return r0
        L11c:
            java.lang.Object r0 = r0.B
            rk5 r0 = (defpackage.rk5) r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            tu0 r0 = r0.b
            jg7 r1 = defpackage.jg7.a
            r0.b0(r1)
            return r1
        L12a:
            java.lang.Object r0 = r0.B
            s9 r0 = (defpackage.s9) r0
            java.lang.Object r0 = r0.e
            pu r0 = (defpackage.pu) r0
            r0.addLast(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L138:
            java.lang.Object r0 = r0.B
            fz4 r0 = (defpackage.fz4) r0
            br0 r1 = (defpackage.br0) r1
            r1.getClass()
            java.lang.String r2 = "type"
            x25 r3 = defpackage.ps6.b
            defpackage.br0.a(r1, r2, r3)
            java.lang.String r2 = "value"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "kotlinx.serialization.Polymorphic<"
            r3.<init>(r4)
            ar0 r0 = r0.a
            java.lang.String r0 = r0.c()
            r3.append(r0)
            r0 = 62
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            ac6 r3 = defpackage.ac6.e
            wb6[] r4 = new defpackage.wb6[r5]
            yb6 r0 = defpackage.mp2.m(r0, r3, r4)
            defpackage.br0.a(r1, r2, r0)
            yt1 r0 = defpackage.yt1.A
            r1.b = r0
            jg7 r0 = defpackage.jg7.a
            return r0
        L175:
            java.lang.Object r0 = r0.B
            wb6 r0 = (defpackage.wb6) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.g(r1)
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            wb6 r0 = r0.j(r1)
            java.lang.String r0 = r0.a()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L1a0:
            java.lang.Object r0 = r0.B
            rr4 r0 = (defpackage.rr4) r0
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            ue1 r0 = r0.b
            int r2 = r0.p()
            if (r2 == 0) goto L1b9
            int r2 = r0.p()
            float r2 = (float) r2
            float r4 = r1 / r2
        L1b9:
            int r1 = defpackage.u24.E(r4)
            int r2 = r0.k()
            int r2 = r2 + r1
            int r1 = r0.j(r2)
            ss4 r0 = r0.q
            r0.i(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L1ce:
            java.lang.Object r0 = r0.B
            oj4 r0 = (defpackage.oj4) r0
            bj4 r1 = (defpackage.bj4) r1
            r1.getClass()
            yi4 r1 = r1.a
            r0.getClass()
            gk4 r0 = r1.o
            ik4 r2 = r1.p
            int[] r3 = defpackage.fj4.b
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 3
            r4 = 2
            if (r0 == r6) goto L1fe
            if (r0 == r4) goto L1fe
            if (r0 != r3) goto L1fa
            boolean r0 = r1.g
            if (r0 == 0) goto L1f7
            gk4 r0 = defpackage.gk4.HARDCORE
            goto L200
        L1f7:
            gk4 r0 = defpackage.gk4.SOFTCORE
            goto L200
        L1fa:
            defpackage.i.d()
            goto L257
        L1fe:
            gk4 r0 = r1.o
        L200:
            int[] r8 = defpackage.fj4.c
            int r9 = r2.ordinal()
            r8 = r8[r9]
            if (r8 == r6) goto L210
            if (r8 == r4) goto L210
            if (r8 != r3) goto L213
            ik4 r2 = defpackage.ik4.OFFLINE_AFTER_START
        L210:
            r26 = r2
            goto L217
        L213:
            defpackage.i.d()
            goto L257
        L217:
            ek4 r8 = new ek4
            long r9 = r1.b
            java.lang.String r11 = r1.c
            java.lang.String r12 = r1.d
            long r13 = r1.e
            long r2 = r1.f
            gk4 r4 = defpackage.gk4.HARDCORE
            if (r0 != r4) goto L22a
            r17 = r6
            goto L22c
        L22a:
            r17 = r5
        L22c:
            java.lang.String r4 = r1.h
            long r5 = r1.i
            r18 = r2
            long r2 = r1.j
            r21 = r2
            long r2 = r1.k
            boolean r7 = r1.q
            if (r7 != 0) goto L250
            dj4 r1 = r1.a
            dj4 r7 = defpackage.dj4.ACHIEVEMENT_UNLOCK
            if (r1 != r7) goto L243
            goto L250
        L243:
            r27 = 0
        L245:
            r25 = r0
            r23 = r2
            r15 = r18
            r18 = r4
            r19 = r5
            goto L253
        L250:
            r27 = 1
            goto L245
        L253:
            r8.<init>(r9, r11, r12, r13, r15, r17, r18, r19, r21, r23, r25, r26, r27)
            r7 = r8
        L257:
            return r7
        L258:
            java.lang.Object r0 = r0.B
            wh4 r0 = (defpackage.wh4) r0
            br0 r1 = (defpackage.br0) r1
            r1.getClass()
            java.util.List r0 = r0.b
            r0.getClass()
            r1.b = r0
            jg7 r0 = defpackage.jg7.a
            return r0
        L26b:
            java.lang.Object r0 = r0.B
            qd4 r0 = (defpackage.qd4) r0
            sb4 r1 = (defpackage.sb4) r1
            r1.getClass()
            uk1 r2 = r1.d0
            ic4 r3 = r1.B
            if (r3 == 0) goto L27b
            goto L27c
        L27b:
            r3 = r7
        L27c:
            if (r3 != 0) goto L27f
            goto L2a1
        L27f:
            r2.c()
            ic4 r4 = r0.c(r3)
            if (r4 != 0) goto L289
            goto L2a1
        L289:
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L291
            r7 = r1
            goto L2a1
        L291:
            vb4 r0 = r0.b()
            android.os.Bundle r1 = r2.c()
            android.os.Bundle r1 = r4.a(r1)
            sb4 r7 = r0.b(r4, r1)
        L2a1:
            return r7
        L2a2:
            java.lang.Object r0 = r0.B
            hb4 r0 = (defpackage.hb4) r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.h(r7)
            jg7 r0 = defpackage.jg7.a
            return r0
        L2ae:
            java.lang.Object r0 = r0.B
            b64 r0 = (defpackage.b64) r0
            oq5 r1 = (defpackage.oq5) r1
            r1.getClass()
            android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L2e1
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L2e1
            android.net.Uri r2 = r1.o()     // Catch: java.lang.Throwable -> L2e1
            java.io.InputStream r2 = r0.openInputStream(r2)     // Catch: java.lang.Throwable -> L2e1
            if (r2 == 0) goto L2e9
            boolean r0 = r2 instanceof java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2cf
            if (r0 == 0) goto L2d2
            r0 = r2
            java.io.BufferedInputStream r0 = (java.io.BufferedInputStream) r0     // Catch: java.lang.Throwable -> L2cf
            goto L2d9
        L2cf:
            r0 = move-exception
            r3 = r0
            goto L2e3
        L2d2:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2cf
            r3 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2cf
        L2d9:
            uz5 r0 = defpackage.kn2.K(r0)     // Catch: java.lang.Throwable -> L2cf
            r2.close()     // Catch: java.lang.Throwable -> L2e1
            goto L2f1
        L2e1:
            r0 = move-exception
            goto L2eb
        L2e3:
            throw r3     // Catch: java.lang.Throwable -> L2e4
        L2e4:
            r0 = move-exception
            defpackage.ge7.t(r2, r3)     // Catch: java.lang.Throwable -> L2e1
            throw r0     // Catch: java.lang.Throwable -> L2e1
        L2e9:
            r0 = r7
            goto L2f1
        L2eb:
            em5 r2 = new em5
            r2.<init>(r0)
            r0 = r2
        L2f1:
            boolean r2 = r0 instanceof defpackage.em5
            if (r2 == 0) goto L2f7
            r0 = r7
        L2f7:
            uz5 r0 = (defpackage.uz5) r0
            if (r0 == 0) goto L380
            nw5 r8 = new nw5
            java.lang.String r9 = r1.m()
            java.lang.String r10 = r0.b
            java.lang.String r11 = r1.k()
            android.net.Uri r2 = r1.o()
            java.lang.String r12 = r2.toString()
            r12.getClass()
            android.net.Uri r2 = r1.n()
            java.lang.String r13 = r2.toString()
            r13.getClass()
            nt5 r14 = new nt5
            it5 r2 = r1.j()
            u26 r15 = r2.m()
            it5 r2 = r1.j()
            a36 r16 = r2.n()
            it5 r2 = r1.j()
            java.util.UUID r2 = r2.k()
            if (r2 == 0) goto L340
            java.lang.String r2 = r2.toString()
            r17 = r2
            goto L342
        L340:
            r17 = r7
        L342:
            it5 r2 = r1.j()
            boolean r18 = r2.l()
            it5 r2 = r1.j()
            android.net.Uri r2 = r2.i()
            if (r2 == 0) goto L35b
            java.lang.String r2 = r2.toString()
            r19 = r2
            goto L35d
        L35b:
            r19 = r7
        L35d:
            it5 r2 = r1.j()
            android.net.Uri r2 = r2.j()
            if (r2 == 0) goto L36b
            java.lang.String r7 = r2.toString()
        L36b:
            r20 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.util.Date r15 = r1.l()
            boolean r1 = r0.c
            java.lang.String r0 = r0.d
            r17 = r0
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r7 = r8
        L380:
            return r7
        L381:
            java.lang.Object r0 = r0.B
            m14 r0 = (defpackage.m14) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            k14 r0 = r0.b(r1)
            return r0
        L390:
            java.lang.Object r0 = r0.B
            gj0 r0 = (defpackage.gj0) r0
            java.lang.Void r1 = (java.lang.Void) r1
            tb0 r0 = r0.m
            return r0
        L399:
            java.lang.Object r0 = r0.B
            q46 r0 = (defpackage.q46) r0
            if (r0 == 0) goto L3a4
            boolean r6 = r0.c(r1)
            goto L3a5
        L3a4:
            r6 = 1
        L3a5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L3aa:
            java.lang.Object r0 = r0.B
            pr3 r0 = (defpackage.pr3) r0
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = -r1
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L3bf
            boolean r2 = r0.c()
            if (r2 == 0) goto L449
        L3bf:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 <= 0) goto L3cb
            boolean r2 = r0.b()
            if (r2 != 0) goto L3cb
            goto L449
        L3cb:
            float r2 = r0.h
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L3d7
        L3d5:
            r15 = 1
            goto L3dd
        L3d7:
            java.lang.String r2 = "entered drag with non-zero pending scroll"
            defpackage.s53.c(r2)
            goto L3d5
        L3dd:
            r0.d = r15
            float r2 = r0.h
            float r2 = r2 + r1
            r0.h = r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L437
            float r2 = r0.h
            int r5 = java.lang.Math.round(r2)
            vs4 r6 = r0.f
            java.lang.Object r6 = r6.getValue()
            jr3 r6 = (defpackage.jr3) r6
            boolean r8 = r0.b
            r15 = 1
            r8 = r8 ^ r15
            jr3 r6 = r6.d(r5, r8)
            if (r6 == 0) goto L410
            jr3 r8 = r0.c
            if (r8 == 0) goto L410
            jr3 r5 = r8.d(r5, r15)
            if (r5 == 0) goto L411
            r0.c = r5
        L410:
            r7 = r6
        L411:
            if (r7 == 0) goto L426
            boolean r5 = r0.b
            r0.g(r7, r5, r15)
            qa4 r5 = r0.w
            jg7 r6 = defpackage.jg7.a
            r5.setValue(r6)
            float r5 = r0.h
            float r2 = r2 - r5
            r0.k(r2, r7)
            goto L437
        L426:
            sm3 r5 = r0.l
            if (r5 == 0) goto L42d
            r5.k()
        L42d:
            float r5 = r0.h
            float r2 = r2 - r5
            jr3 r5 = r0.j()
            r0.k(r2, r5)
        L437:
            float r2 = r0.h
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L443
        L441:
            r4 = r1
            goto L449
        L443:
            float r2 = r0.h
            float r1 = r1 - r2
            r0.h = r4
            goto L441
        L449:
            float r0 = -r4
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L44f:
            java.lang.Object r0 = r0.B
            hr3 r0 = (defpackage.hr3) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r2 = r0.d
            kr3 r0 = r0.o(r1, r2)
            return r0
        L460:
            java.lang.Object r0 = r0.B
            lq3 r0 = (defpackage.lq3) r0
            gl1 r1 = (defpackage.gl1) r1
            z3 r1 = new z3
            r2 = 12
            r1.<init>(r0, r2)
            return r1
        L46e:
            java.lang.Object r0 = r0.B
            aq3 r0 = (defpackage.aq3) r0
            gl1 r1 = (defpackage.gl1) r1
            z3 r1 = new z3
            r2 = 10
            r1.<init>(r0, r2)
            return r1
        L47c:
            java.lang.Object r0 = r0.B
            ip3 r0 = (defpackage.ip3) r0
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = -r1
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L491
            boolean r2 = r0.c()
            if (r2 == 0) goto L517
        L491:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 <= 0) goto L49d
            boolean r2 = r0.b()
            if (r2 != 0) goto L49d
            goto L517
        L49d:
            float r2 = r0.g
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L4a8
            goto L4ad
        L4a8:
            java.lang.String r2 = "entered drag with non-zero pending scroll"
            defpackage.s53.c(r2)
        L4ad:
            float r2 = r0.g
            float r2 = r2 + r1
            r0.g = r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L505
            float r2 = r0.g
            int r5 = defpackage.u24.E(r2)
            vs4 r6 = r0.e
            java.lang.Object r6 = r6.getValue()
            wo3 r6 = (defpackage.wo3) r6
            boolean r8 = r0.b
            r15 = 1
            r8 = r8 ^ r15
            wo3 r6 = r6.d(r5, r8)
            if (r6 == 0) goto L4de
            wo3 r8 = r0.c
            if (r8 == 0) goto L4de
            wo3 r5 = r8.d(r5, r15)
            if (r5 == 0) goto L4df
            r0.c = r5
        L4de:
            r7 = r6
        L4df:
            if (r7 == 0) goto L4f4
            boolean r5 = r0.b
            r0.f(r7, r5, r15)
            qa4 r5 = r0.r
            jg7 r6 = defpackage.jg7.a
            r5.setValue(r6)
            float r5 = r0.g
            float r2 = r2 - r5
            r0.i(r2, r7)
            goto L505
        L4f4:
            sm3 r5 = r0.j
            if (r5 == 0) goto L4fb
            r5.k()
        L4fb:
            float r5 = r0.g
            float r2 = r2 - r5
            wo3 r5 = r0.h()
            r0.i(r2, r5)
        L505:
            float r2 = r0.g
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L511
        L50f:
            r4 = r1
            goto L517
        L511:
            float r2 = r0.g
            float r1 = r1 - r2
            r0.g = r4
            goto L50f
        L517:
            float r0 = -r4
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L51d:
            java.lang.Object r0 = r0.B
            dp3 r0 = (defpackage.dp3) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r0 = r0.d(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L530:
            r15 = r6
            java.lang.Object r0 = r0.B
            fs2 r0 = (defpackage.fs2) r0
            ki5 r1 = (defpackage.ki5) r1
            r1.getClass()
            fs2 r2 = defpackage.fs2.STABLE_AND_PRERELEASE
            if (r0 == r2) goto L545
            boolean r0 = r1.h
            if (r0 != 0) goto L543
            goto L545
        L543:
            r5 = 0
            goto L546
        L545:
            r5 = r15
        L546:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L54b:
            java.lang.Object r0 = r0.B
            mi2 r0 = (defpackage.mi2) r0
            te7 r1 = (defpackage.te7) r1
            oj2 r4 = r1.b
            int r5 = r1.c
            int r6 = r1.d
            java.lang.Object r7 = r1.e
            te7 r2 = new te7
            r3 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            we7 r0 = r0.a(r2)
            java.lang.Object r0 = r0.getValue()
            return r0
        L568:
            java.lang.Object r0 = r0.B
            ua4 r0 = (defpackage.ua4) r0
            cx4 r1 = (defpackage.cx4) r1
            java.lang.Object[] r1 = r0.A
            int r0 = r0.L
            r5 = 0
        L573:
            if (r5 >= r0) goto L57f
            r2 = r1[r5]
            f34 r2 = (defpackage.f34) r2
            r2.a()
            int r5 = r5 + 1
            goto L573
        L57f:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
