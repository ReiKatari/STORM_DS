package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm6  reason: default package */
/* loaded from: classes.dex */
public final class qm6 {
    public final defpackage.qn2 a;
    public final java.util.concurrent.atomic.AtomicReference b;
    public boolean c;
    public final defpackage.y36 d;
    public final defpackage.ro5 e;
    public final defpackage.ua4 f;
    public final java.lang.Object g;
    public defpackage.h61 h;
    public defpackage.pm6 i;
    public long j;

    public qm6(defpackage.qn2 r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r3.<init>(r0)
            r2.b = r3
            y36 r3 = new y36
            r0 = 6
            r3.<init>(r2, r0)
            r2.d = r3
            ro5 r3 = new ro5
            r0 = 14
            r3.<init>(r2, r0)
            r2.e = r3
            ua4 r3 = new ua4
            r0 = 16
            pm6[] r0 = new defpackage.pm6[r0]
            r3.<init>(r0)
            r2.f = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.g = r3
            r0 = -1
            r2.j = r0
            return
    }

    public final void a() {
            r5 = this;
            java.lang.Object r0 = r5.g
            monitor-enter(r0)
            ua4 r5 = r5.f     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r1 = r5.A     // Catch: java.lang.Throwable -> L27
            int r5 = r5.L     // Catch: java.lang.Throwable -> L27
            r2 = 0
        La:
            if (r2 >= r5) goto L29
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L27
            pm6 r3 = (defpackage.pm6) r3     // Catch: java.lang.Throwable -> L27
            ja4 r4 = r3.e     // Catch: java.lang.Throwable -> L27
            r4.a()     // Catch: java.lang.Throwable -> L27
            ja4 r4 = r3.f     // Catch: java.lang.Throwable -> L27
            r4.a()     // Catch: java.lang.Throwable -> L27
            ja4 r4 = r3.l     // Catch: java.lang.Throwable -> L27
            r4.a()     // Catch: java.lang.Throwable -> L27
            java.util.HashMap r3 = r3.m     // Catch: java.lang.Throwable -> L27
            r3.clear()     // Catch: java.lang.Throwable -> L27
            int r2 = r2 + 1
            goto La
        L27:
            r5 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)
            return
        L2b:
            monitor-exit(r0)
            throw r5
    }

    public final void b(defpackage.n96 r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.Object r2 = r0.g
            monitor-enter(r2)
            ua4 r0 = r0.f     // Catch: java.lang.Throwable -> L8e
            int r3 = r0.L     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            r6 = 0
        Ld:
            java.lang.Object[] r7 = r0.A
            if (r5 >= r3) goto L94
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L8e
            pm6 r7 = (defpackage.pm6) r7     // Catch: java.lang.Throwable -> L8e
            ja4 r8 = r7.f     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = r8.k(r1)     // Catch: java.lang.Throwable -> L8e
            y94 r8 = (defpackage.y94) r8     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L21
        L1f:
            r15 = r5
            goto L78
        L21:
            java.lang.Object[] r9 = r8.b     // Catch: java.lang.Throwable -> L8e
            int[] r10 = r8.c     // Catch: java.lang.Throwable -> L8e
            long[] r8 = r8.a     // Catch: java.lang.Throwable -> L8e
            int r11 = r8.length     // Catch: java.lang.Throwable -> L8e
            int r11 = r11 + (-2)
            if (r11 < 0) goto L1f
            r12 = 0
        L2d:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L8e
            r15 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L8e
            r16 = 7
            long r4 = r4 << r16
            long r4 = r4 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r16
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L72
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r16 = r5
            r5 = 0
        L4d:
            if (r5 >= r4) goto L6e
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r13 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L67
            int r17 = r12 << 3
            int r17 = r17 + r5
            r18 = r5
            r5 = r9[r17]     // Catch: java.lang.Throwable -> L8e
            r17 = r10[r17]     // Catch: java.lang.Throwable -> L8e
            r7.c(r1, r5)     // Catch: java.lang.Throwable -> L8e
            goto L69
        L67:
            r18 = r5
        L69:
            long r13 = r13 >> r16
            int r5 = r18 + 1
            goto L4d
        L6e:
            r5 = r16
            if (r4 != r5) goto L78
        L72:
            if (r12 == r11) goto L78
            int r12 = r12 + 1
            r5 = r15
            goto L2d
        L78:
            ja4 r4 = r7.f     // Catch: java.lang.Throwable -> L8e
            boolean r4 = r4.j()     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L83
            int r6 = r6 + 1
            goto L90
        L83:
            if (r6 <= 0) goto L90
            java.lang.Object[] r4 = r0.A     // Catch: java.lang.Throwable -> L8e
            int r5 = r15 - r6
            r7 = r4[r15]     // Catch: java.lang.Throwable -> L8e
            r4[r5] = r7     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r0 = move-exception
            goto L9e
        L90:
            int r5 = r15 + 1
            goto Ld
        L94:
            int r1 = r3 - r6
            r4 = 0
            java.util.Arrays.fill(r7, r1, r3, r4)     // Catch: java.lang.Throwable -> L8e
            r0.L = r1     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r2)
            return
        L9e:
            monitor-exit(r2)
            throw r0
    }

    public final boolean c() {
            r10 = this;
            java.lang.Object r0 = r10.g
            monitor-enter(r0)
            boolean r1 = r10.c     // Catch: java.lang.Throwable -> L85
            monitor-exit(r0)
            r0 = 0
            if (r1 == 0) goto La
            return r0
        La:
            r1 = r0
        Lb:
            java.util.concurrent.atomic.AtomicReference r2 = r10.b
        Ld:
            java.lang.Object r3 = r2.get()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L16
            goto L4d
        L16:
            boolean r6 = r3 instanceof java.util.Set
            if (r6 == 0) goto L1e
            r6 = r3
            java.util.Set r6 = (java.util.Set) r6
            goto L46
        L1e:
            boolean r6 = r3 instanceof java.util.List
            if (r6 == 0) goto L7c
            r6 = r3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r6.get(r0)
            java.util.Set r7 = (java.util.Set) r7
            int r8 = r6.size()
            r9 = 2
            if (r8 != r9) goto L37
            java.lang.Object r4 = r6.get(r5)
            goto L45
        L37:
            int r8 = r6.size()
            if (r8 <= r9) goto L45
            int r4 = r6.size()
            java.util.List r4 = r6.subList(r5, r4)
        L45:
            r6 = r7
        L46:
            boolean r7 = r2.compareAndSet(r3, r4)
            if (r7 == 0) goto L75
            r4 = r6
        L4d:
            if (r4 != 0) goto L50
            return r1
        L50:
            java.lang.Object r2 = r10.g
            monitor-enter(r2)
            ua4 r3 = r10.f     // Catch: java.lang.Throwable -> L6f
            java.lang.Object[] r6 = r3.A     // Catch: java.lang.Throwable -> L6f
            int r3 = r3.L     // Catch: java.lang.Throwable -> L6f
            r7 = r0
        L5a:
            if (r7 >= r3) goto L71
            r8 = r6[r7]     // Catch: java.lang.Throwable -> L6f
            pm6 r8 = (defpackage.pm6) r8     // Catch: java.lang.Throwable -> L6f
            boolean r8 = r8.a(r4)     // Catch: java.lang.Throwable -> L6f
            if (r8 != 0) goto L6b
            if (r1 == 0) goto L69
            goto L6b
        L69:
            r1 = r0
            goto L6c
        L6b:
            r1 = r5
        L6c:
            int r7 = r7 + 1
            goto L5a
        L6f:
            r10 = move-exception
            goto L73
        L71:
            monitor-exit(r2)
            goto Lb
        L73:
            monitor-exit(r2)
            throw r10
        L75:
            java.lang.Object r7 = r2.get()
            if (r7 == r3) goto L46
            goto Ld
        L7c:
            java.lang.String r10 = "Unexpected notification"
            defpackage.tx0.b(r10)
            defpackage.e41.c()
            return r0
        L85:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
    }

    public final void d(java.lang.Object r27, defpackage.qn2 r28, defpackage.on2 r29) {
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r28
            long r3 = defpackage.kj2.s()
            java.lang.Object r5 = r1.g
            monitor-enter(r5)
            ua4 r6 = r1.f     // Catch: java.lang.Throwable -> L224
            java.lang.Object[] r7 = r6.A     // Catch: java.lang.Throwable -> L224
            int r8 = r6.L     // Catch: java.lang.Throwable -> L224
            r10 = 0
        L14:
            if (r10 >= r8) goto L23
            r12 = r7[r10]     // Catch: java.lang.Throwable -> L224
            r13 = r12
            pm6 r13 = (defpackage.pm6) r13     // Catch: java.lang.Throwable -> L224
            qn2 r13 = r13.a     // Catch: java.lang.Throwable -> L224
            if (r13 != r2) goto L20
            goto L24
        L20:
            int r10 = r10 + 1
            goto L14
        L23:
            r12 = 0
        L24:
            pm6 r12 = (defpackage.pm6) r12     // Catch: java.lang.Throwable -> L224
            r7 = 1
            if (r12 != 0) goto L37
            pm6 r12 = new pm6     // Catch: java.lang.Throwable -> L224
            r2.getClass()     // Catch: java.lang.Throwable -> L224
            defpackage.ge7.p(r7, r2)     // Catch: java.lang.Throwable -> L224
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L224
            r6.b(r12)     // Catch: java.lang.Throwable -> L224
        L37:
            pm6 r2 = r1.i     // Catch: java.lang.Throwable -> L224
            long r13 = r1.j     // Catch: java.lang.Throwable -> L224
            monitor-exit(r5)
            r5 = -1
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 == 0) goto L6e
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 != 0) goto L47
            goto L6e
        L47:
            java.lang.String r5 = "Detected multithreaded access to SnapshotStateObserver: previousThreadId="
            java.lang.String r6 = "), currentThread={id="
            java.lang.StringBuilder r5 = defpackage.xg6.s(r13, r5, r6)
            r5.append(r3)
            java.lang.String r6 = ", name="
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            defpackage.r05.a(r5)
        L6e:
            java.lang.Object r5 = r1.g     // Catch: java.lang.Throwable -> L9e
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L9e
            r1.i = r12     // Catch: java.lang.Throwable -> L214
            r1.j = r3     // Catch: java.lang.Throwable -> L214
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9e
            ro5 r3 = r1.e     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r4 = r12.b     // Catch: java.lang.Throwable -> L9e
            y94 r5 = r12.c     // Catch: java.lang.Throwable -> L9e
            int r6 = r12.d     // Catch: java.lang.Throwable -> L9e
            r12.b = r0     // Catch: java.lang.Throwable -> L9e
            ja4 r8 = r12.f     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r8.g(r0)     // Catch: java.lang.Throwable -> L9e
            y94 r0 = (defpackage.y94) r0     // Catch: java.lang.Throwable -> L9e
            r12.c = r0     // Catch: java.lang.Throwable -> L9e
            int r0 = r12.d     // Catch: java.lang.Throwable -> L9e
            r8 = -1
            if (r0 != r8) goto La2
            vl6 r0 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L9e
            long r15 = r0.g()     // Catch: java.lang.Throwable -> L9e
            int r0 = java.lang.Long.hashCode(r15)     // Catch: java.lang.Throwable -> L9e
            r12.d = r0     // Catch: java.lang.Throwable -> L9e
            goto La2
        L9e:
            r0 = move-exception
            r6 = r13
            goto L218
        La2:
            wq2 r0 = r12.i     // Catch: java.lang.Throwable -> L9e
            ua4 r8 = defpackage.np2.H()     // Catch: java.lang.Throwable -> L9e
            r8.b(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r3 != 0) goto Lba
            r29.c()     // Catch: java.lang.Throwable -> Lb4
            r28 = r12
            goto L13c
        Lb4:
            r0 = move-exception
            r18 = r7
            r6 = r13
            goto L20a
        Lba:
            m44 r0 = defpackage.bm6.b     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r0.f()     // Catch: java.lang.Throwable -> Lb4
            r10 = r0
            vl6 r10 = (defpackage.vl6) r10     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r10 instanceof defpackage.nb7     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L106
            r0 = r10
            nb7 r0 = (defpackage.nb7) r0     // Catch: java.lang.Throwable -> Lb4
            r28 = r12
            long r11 = r0.t     // Catch: java.lang.Throwable -> Lb4
            long r16 = defpackage.kj2.s()     // Catch: java.lang.Throwable -> Lb4
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 != 0) goto L108
            r0 = r10
            nb7 r0 = (defpackage.nb7) r0     // Catch: java.lang.Throwable -> Lb4
            qn2 r11 = r0.r     // Catch: java.lang.Throwable -> Lb4
            r0 = r10
            nb7 r0 = (defpackage.nb7) r0     // Catch: java.lang.Throwable -> Lb4
            qn2 r12 = r0.s     // Catch: java.lang.Throwable -> Lb4
            r0 = r10
            nb7 r0 = (defpackage.nb7) r0     // Catch: java.lang.Throwable -> Lfb
            qn2 r3 = defpackage.bm6.k(r3, r11, r7)     // Catch: java.lang.Throwable -> Lfb
            r0.r = r3     // Catch: java.lang.Throwable -> Lfb
            r0 = r10
            nb7 r0 = (defpackage.nb7) r0     // Catch: java.lang.Throwable -> Lfb
            r0.s = r12     // Catch: java.lang.Throwable -> Lfb
            r29.c()     // Catch: java.lang.Throwable -> Lfb
            r0 = r10
            nb7 r0 = (defpackage.nb7) r0     // Catch: java.lang.Throwable -> Lb4
            r0.r = r11     // Catch: java.lang.Throwable -> Lb4
            nb7 r10 = (defpackage.nb7) r10     // Catch: java.lang.Throwable -> Lb4
            r10.s = r12     // Catch: java.lang.Throwable -> Lb4
            goto L13c
        Lfb:
            r0 = move-exception
            r3 = r10
            nb7 r3 = (defpackage.nb7) r3     // Catch: java.lang.Throwable -> Lb4
            r3.r = r11     // Catch: java.lang.Throwable -> Lb4
            nb7 r10 = (defpackage.nb7) r10     // Catch: java.lang.Throwable -> Lb4
            r10.s = r12     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        L106:
            r28 = r12
        L108:
            if (r10 == 0) goto L10e
            boolean r0 = r10 instanceof defpackage.oa4     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L110
        L10e:
            r0 = 0
            goto L116
        L110:
            vl6 r0 = r10.u(r3)     // Catch: java.lang.Throwable -> Lb4
            r15 = r0
            goto L12f
        L116:
            nb7 r15 = new nb7     // Catch: java.lang.Throwable -> Lb4
            boolean r11 = r10 instanceof defpackage.oa4     // Catch: java.lang.Throwable -> Lb4
            if (r11 == 0) goto L122
            r11 = r10
            oa4 r11 = (defpackage.oa4) r11     // Catch: java.lang.Throwable -> Lb4
            r16 = r11
            goto L124
        L122:
            r16 = r0
        L124:
            r19 = 1
            r20 = 0
            r18 = 0
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> Lb4
        L12f:
            vl6 r3 = r15.j()     // Catch: java.lang.Throwable -> L1f7
            r29.c()     // Catch: java.lang.Throwable -> L1fc
            defpackage.vl6.q(r3)     // Catch: java.lang.Throwable -> L1f7
            r15.c()     // Catch: java.lang.Throwable -> Lb4
        L13c:
            int r0 = r8.L     // Catch: java.lang.Throwable -> L9e
            int r0 = r0 - r7
            r8.l(r0)     // Catch: java.lang.Throwable -> L9e
            r12 = r28
            java.lang.Object r0 = r12.b     // Catch: java.lang.Throwable -> L9e
            r0.getClass()     // Catch: java.lang.Throwable -> L9e
            int r3 = r12.d     // Catch: java.lang.Throwable -> L9e
            y94 r8 = r12.c     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L1d8
            long[] r10 = r8.a     // Catch: java.lang.Throwable -> L1db
            int r11 = r10.length     // Catch: java.lang.Throwable -> L1db
            int r11 = r11 + (-2)
            if (r11 < 0) goto L1d8
            r17 = r10
            r15 = 0
        L159:
            r9 = r17[r15]     // Catch: java.lang.Throwable -> L1db
            r18 = r7
            r19 = r8
            long r7 = ~r9     // Catch: java.lang.Throwable -> L1db
            r20 = 7
            long r7 = r7 << r20
            long r7 = r7 & r9
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto L1ca
            int r7 = r15 - r11
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1db
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r27 = r8
            r8 = 0
        L17c:
            if (r8 >= r7) goto L1c1
            r20 = 255(0xff, double:1.26E-321)
            long r20 = r9 & r20
            r22 = 128(0x80, double:6.3E-322)
            int r20 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r20 >= 0) goto L1ad
            int r20 = r15 << 3
            r21 = r8
            int r8 = r20 + r21
            r28 = r9
            r9 = r19
            java.lang.Object[] r10 = r9.b     // Catch: java.lang.Throwable -> L1db
            r10 = r10[r8]     // Catch: java.lang.Throwable -> L1db
            r19 = r13
            int[] r13 = r9.c     // Catch: java.lang.Throwable -> L1f3
            r13 = r13[r8]     // Catch: java.lang.Throwable -> L1f3
            if (r13 == r3) goto L1a1
            r13 = r18
            goto L1a2
        L1a1:
            r13 = 0
        L1a2:
            if (r13 == 0) goto L1a7
            r12.c(r0, r10)     // Catch: java.lang.Throwable -> L1f3
        L1a7:
            if (r13 == 0) goto L1b5
            r9.f(r8)     // Catch: java.lang.Throwable -> L1f3
            goto L1b5
        L1ad:
            r21 = r8
            r28 = r9
            r9 = r19
            r19 = r13
        L1b5:
            long r13 = r28 >> r27
            int r8 = r21 + 1
            r24 = r19
            r19 = r9
            r9 = r13
            r13 = r24
            goto L17c
        L1c1:
            r8 = r27
            r9 = r19
            r19 = r13
            if (r7 != r8) goto L1df
            goto L1ce
        L1ca:
            r9 = r19
            r19 = r13
        L1ce:
            if (r15 == r11) goto L1df
            int r15 = r15 + 1
            r8 = r9
            r7 = r18
            r13 = r19
            goto L159
        L1d8:
            r19 = r13
            goto L1df
        L1db:
            r0 = move-exception
            r19 = r13
            goto L1f4
        L1df:
            r12.b = r4     // Catch: java.lang.Throwable -> L1f3
            r12.c = r5     // Catch: java.lang.Throwable -> L1f3
            r12.d = r6     // Catch: java.lang.Throwable -> L1f3
            java.lang.Object r3 = r1.g
            monitor-enter(r3)
            r1.i = r2     // Catch: java.lang.Throwable -> L1f0
            r6 = r19
            r1.j = r6     // Catch: java.lang.Throwable -> L1f0
            monitor-exit(r3)
            return
        L1f0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L1f3:
            r0 = move-exception
        L1f4:
            r6 = r19
            goto L218
        L1f7:
            r0 = move-exception
            r18 = r7
            r6 = r13
            goto L205
        L1fc:
            r0 = move-exception
            r18 = r7
            r6 = r13
            defpackage.vl6.q(r3)     // Catch: java.lang.Throwable -> L204
            throw r0     // Catch: java.lang.Throwable -> L204
        L204:
            r0 = move-exception
        L205:
            r15.c()     // Catch: java.lang.Throwable -> L209
            throw r0     // Catch: java.lang.Throwable -> L209
        L209:
            r0 = move-exception
        L20a:
            int r3 = r8.L     // Catch: java.lang.Throwable -> L212
            int r3 = r3 + (-1)
            r8.l(r3)     // Catch: java.lang.Throwable -> L212
            throw r0     // Catch: java.lang.Throwable -> L212
        L212:
            r0 = move-exception
            goto L218
        L214:
            r0 = move-exception
            r6 = r13
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L212
            throw r0     // Catch: java.lang.Throwable -> L212
        L218:
            java.lang.Object r3 = r1.g
            monitor-enter(r3)
            r1.i = r2     // Catch: java.lang.Throwable -> L221
            r1.j = r6     // Catch: java.lang.Throwable -> L221
            monitor-exit(r3)
            throw r0
        L221:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L224:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final void e() {
            r3 = this;
            y36 r0 = r3.d
            r76 r1 = defpackage.bm6.a
            defpackage.bm6.e(r1)
            java.lang.Object r1 = defpackage.bm6.c
            monitor-enter(r1)
            java.util.List r2 = defpackage.bm6.h     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList r2 = defpackage.gt0.U0(r0, r2)     // Catch: java.lang.Throwable -> L1d
            defpackage.bm6.h = r2     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            h61 r1 = new h61
            r2 = 20
            r1.<init>(r0, r2)
            r3.h = r1
            return
        L1d:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
    }
}
