package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oj4  reason: default package */
/* loaded from: classes.dex */
public final class oj4 {
    public final defpackage.vi a;
    public final defpackage.fi b;
    public final defpackage.vr0 c;
    public final defpackage.on2 d;
    public final defpackage.hb4 e;

    public oj4(defpackage.vi r2, defpackage.fi r3, defpackage.v34 r4) {
            r1 = this;
            vs0 r0 = defpackage.vs0.d0
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r0
            r1.d = r4
            hb4 r2 = new hb4
            r2.<init>()
            r1.e = r2
            return
    }

    public static java.util.LinkedHashMap f(java.util.List r13) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L9:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r13.next()
            bj4 r1 = (defpackage.bj4) r1
            yi4 r1 = r1.a
            java.lang.String r5 = r1.h
            long r2 = r1.i
            boolean r4 = defpackage.qs6.v0(r5)
            if (r4 != 0) goto L9
            dj4 r4 = r1.a
            int[] r6 = defpackage.fj4.a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            r6 = 1
            r7 = 0
            if (r4 == r6) goto L6f
            r6 = 2
            if (r4 == r6) goto L33
            goto L9
        L33:
            java.lang.Object r4 = r0.get(r5)
            dk4 r4 = (defpackage.dk4) r4
            if (r4 == 0) goto L3e
            long r8 = r4.a
            goto L40
        L3e:
            long r8 = r1.b
        L40:
            if (r4 == 0) goto L46
            java.lang.Long r6 = r4.c
            r10 = r7
            goto L48
        L46:
            r6 = r7
            r10 = r6
        L48:
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            long r1 = r1.m
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r11 = 0
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 <= 0) goto L59
            goto L5a
        L59:
            r3 = r10
        L5a:
            if (r3 != 0) goto L63
            if (r4 == 0) goto L61
            java.lang.Long r1 = r4.e
            goto L64
        L61:
            r1 = r10
            goto L64
        L63:
            r1 = r3
        L64:
            dk4 r2 = new dk4
            r3 = r8
            r8 = r1
            r2.<init>(r3, r5, r6, r7, r8)
            r0.put(r5, r2)
            goto L9
        L6f:
            r10 = r7
            java.lang.Object r4 = r0.get(r5)
            dk4 r4 = (defpackage.dk4) r4
            r6 = r2
            dk4 r2 = new dk4
            long r8 = r1.b
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            if (r4 == 0) goto L85
            java.lang.Long r1 = r4.d
            r7 = r1
            goto L86
        L85:
            r7 = r10
        L86:
            if (r4 == 0) goto L8d
            java.lang.Long r1 = r4.e
            r3 = r8
            r8 = r1
            goto L8f
        L8d:
            r3 = r8
            r8 = r10
        L8f:
            r2.<init>(r3, r5, r6, r7, r8)
            r0.put(r5, r2)
            goto L9
        L97:
            return r0
    }

    public static java.lang.Long h(defpackage.ti4 r4, java.util.ArrayList r5) {
            int r4 = r4.b
            r0 = 0
            if (r4 > 0) goto L6
            goto L5d
        L6:
            ev r4 = new ev
            r1 = 1
            r4.<init>(r5, r1)
            x84 r5 = new x84
            r2 = 21
            r5.<init>(r2)
            qd2 r2 = new qd2
            r3 = 2
            r2.<init>(r4, r5, r3)
            x84 r4 = new x84
            r5 = 22
            r4.<init>(r5)
            pc2 r5 = new pc2
            r5.<init>(r2, r1, r4)
            oc2 r4 = new oc2
            r4.<init>(r5)
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L32
            r5 = r0
            goto L4c
        L32:
            java.lang.Object r5 = r4.next()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
        L38:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r4.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r5.compareTo(r1)
            if (r2 <= 0) goto L38
            r5 = r1
            goto L38
        L4c:
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L5d
            long r4 = r5.longValue()
            r0 = 1209600000(0x48190800, double:5.97621805E-315)
            long r4 = r4 + r0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L5d:
            return r0
    }

    public final java.lang.Object a(java.lang.String r31, java.lang.String r32, long r33, long r35, boolean r37, long r38, defpackage.gk4 r40, defpackage.ik4 r41, defpackage.s41 r42) {
            r30 = this;
            r0 = r30
            r1 = r42
            boolean r2 = r1 instanceof defpackage.gj4
            if (r2 == 0) goto L17
            r2 = r1
            gj4 r2 = (defpackage.gj4) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            gj4 r2 = new gj4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r0 = r1.A
            return r0
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L36:
            defpackage.oi2.Y(r1)
            yi4 r6 = new yi4
            dj4 r7 = defpackage.dj4.ACHIEVEMENT_ACK
            vr0 r1 = r0.c
            s83 r1 = r1.b()
            long r16 = r1.b()
            r28 = 0
            r29 = 13954(0x3682, float:1.9554E-41)
            r15 = 0
            r18 = 0
            r20 = 0
            r24 = 0
            r8 = r31
            r9 = r32
            r10 = r33
            r12 = r35
            r14 = r37
            r22 = r38
            r26 = r40
            r27 = r41
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)
            r2.Y = r5
            java.lang.Object r0 = r0.c(r8, r9, r6, r2)
            if (r0 != r3) goto L6e
            return r3
        L6e:
            return r0
    }

    public final java.lang.Object b(java.lang.String r31, java.lang.String r32, long r33, long r35, java.lang.String r37, long r38, long r40, long r42, defpackage.gk4 r44, defpackage.ik4 r45, defpackage.s41 r46) {
            r30 = this;
            r0 = r30
            r1 = r46
            boolean r2 = r1 instanceof defpackage.hj4
            if (r2 == 0) goto L17
            r2 = r1
            hj4 r2 = (defpackage.hj4) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            hj4 r2 = new hj4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r0 = r1.A
            return r0
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L36:
            defpackage.oi2.Y(r1)
            yi4 r6 = new yi4
            dj4 r7 = defpackage.dj4.ACHIEVEMENT_UNLOCK
            r28 = 1
            r29 = 14338(0x3802, float:2.0092E-41)
            r14 = 0
            r22 = 0
            r24 = 0
            r8 = r31
            r9 = r32
            r10 = r33
            r12 = r35
            r15 = r37
            r16 = r38
            r18 = r40
            r20 = r42
            r26 = r44
            r27 = r45
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)
            r2.Y = r5
            java.lang.Object r0 = r0.c(r8, r9, r6, r2)
            if (r0 != r3) goto L66
            return r3
        L66:
            return r0
    }

    public final java.lang.Object c(java.lang.String r15, java.lang.String r16, defpackage.yi4 r17, defpackage.s41 r18) {
            r14 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.ij4
            if (r1 == 0) goto L15
            r1 = r0
            ij4 r1 = (defpackage.ij4) r1
            int r2 = r1.g0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g0 = r2
            goto L1a
        L15:
            ij4 r1 = new ij4
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.e0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.g0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L4b
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L34
            fb4 r14 = r1.Z
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L30
            goto La9
        L30:
            r0 = move-exception
            r15 = r0
            goto Lb9
        L34:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r14)
            return r6
        L3a:
            int r15 = r1.d0
            fb4 r3 = r1.Z
            yi4 r5 = r1.Y
            java.lang.String r7 = r1.X
            java.lang.String r8 = r1.R
            defpackage.oi2.Y(r0)
            r11 = r5
            r10 = r7
            r9 = r8
            goto L88
        L4b:
            defpackage.oi2.Y(r0)
            on2 r0 = r14.d
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L69
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Built-in offline ledger is disabled for the effective RA backend"
            r14.<init>(r15)
            em5 r15 = new em5
            r15.<init>(r14)
            return r15
        L69:
            r1.R = r15
            r0 = r16
            r1.X = r0
            r3 = r17
            r1.Y = r3
            hb4 r7 = r14.e
            r1.Z = r7
            r8 = 0
            r1.d0 = r8
            r1.g0 = r5
            java.lang.Object r5 = r7.e(r1)
            if (r5 != r2) goto L83
            goto La7
        L83:
            r9 = r15
            r10 = r0
            r11 = r3
            r3 = r7
            r15 = r8
        L88:
            xe1 r0 = defpackage.xk1.a     // Catch: java.lang.Throwable -> Lb5
            de1 r0 = defpackage.de1.L     // Catch: java.lang.Throwable -> Lb5
            l5 r7 = new l5     // Catch: java.lang.Throwable -> Lb1
            r12 = 0
            r13 = 23
            r8 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lb1
            r1.R = r6     // Catch: java.lang.Throwable -> Lb1
            r1.X = r6     // Catch: java.lang.Throwable -> Lb1
            r1.Y = r6     // Catch: java.lang.Throwable -> Lb1
            r1.Z = r3     // Catch: java.lang.Throwable -> Lb1
            r1.d0 = r15     // Catch: java.lang.Throwable -> Lb1
            r1.g0 = r4     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r0 = defpackage.hv.d0(r0, r7, r1)     // Catch: java.lang.Throwable -> Lb1
            if (r0 != r2) goto La8
        La7:
            return r2
        La8:
            r14 = r3
        La9:
            hm5 r0 = (defpackage.hm5) r0     // Catch: java.lang.Throwable -> L30
            java.lang.Object r15 = r0.A     // Catch: java.lang.Throwable -> L30
            r14.h(r6)
            return r15
        Lb1:
            r0 = move-exception
            r15 = r0
        Lb3:
            r14 = r3
            goto Lb9
        Lb5:
            r0 = move-exception
            r14 = r0
            r15 = r14
            goto Lb3
        Lb9:
            r14.h(r6)
            throw r15
    }

    public final java.lang.Object d(java.lang.String r31, java.lang.String r32, long r33, java.lang.String r35, long r36, long r38, boolean r40, defpackage.gk4 r41, defpackage.ik4 r42, defpackage.s41 r43) {
            r30 = this;
            r0 = r30
            r1 = r43
            boolean r2 = r1 instanceof defpackage.kj4
            if (r2 == 0) goto L17
            r2 = r1
            kj4 r2 = (defpackage.kj4) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            kj4 r2 = new kj4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r0 = r1.A
            return r0
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L36:
            defpackage.oi2.Y(r1)
            yi4 r6 = new yi4
            dj4 r7 = defpackage.dj4.SESSION_END
            r28 = 0
            r29 = 11810(0x2e22, float:1.655E-41)
            r12 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r8 = r31
            r9 = r32
            r10 = r33
            r15 = r35
            r16 = r36
            r24 = r38
            r14 = r40
            r26 = r41
            r27 = r42
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)
            r2.Y = r5
            java.lang.Object r0 = r0.c(r8, r9, r6, r2)
            if (r0 != r3) goto L67
            return r3
        L67:
            return r0
    }

    public final java.lang.Object e(java.lang.String r31, java.lang.String r32, long r33, java.lang.String r35, long r36, boolean r38, defpackage.gk4 r39, defpackage.ik4 r40, defpackage.s41 r41) {
            r30 = this;
            r0 = r30
            r1 = r41
            boolean r2 = r1 instanceof defpackage.lj4
            if (r2 == 0) goto L17
            r2 = r1
            lj4 r2 = (defpackage.lj4) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            lj4 r2 = new lj4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r0 = r1.A
            return r0
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L36:
            defpackage.oi2.Y(r1)
            yi4 r6 = new yi4
            dj4 r7 = defpackage.dj4.SESSION_START
            r28 = 0
            r29 = 15906(0x3e22, float:2.2289E-41)
            r12 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r8 = r31
            r9 = r32
            r10 = r33
            r15 = r35
            r16 = r36
            r14 = r38
            r26 = r39
            r27 = r40
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)
            r2.Y = r5
            java.lang.Object r0 = r0.c(r8, r9, r6, r2)
            if (r0 != r3) goto L67
            return r3
        L67:
            return r0
    }

    public final java.lang.Object g(java.lang.String r14, java.lang.String r15, defpackage.s41 r16) {
            r13 = this;
            r0 = r16
            boolean r1 = r0 instanceof defpackage.mj4
            if (r1 == 0) goto L15
            r1 = r0
            mj4 r1 = (defpackage.mj4) r1
            int r2 = r1.f0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f0 = r2
            goto L1a
        L15:
            mj4 r1 = new mj4
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.d0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.f0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L48
            if (r3 == r5) goto L39
            if (r3 != r4) goto L33
            fb4 r14 = r1.Y
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L193
            goto L86
        L2f:
            r0 = move-exception
            r13 = r0
            goto L19e
        L33:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r6
        L39:
            int r14 = r1.Z
            fb4 r3 = r1.Y
            java.lang.String r7 = r1.X
            java.lang.String r8 = r1.R
            defpackage.oi2.Y(r0)
            r0 = r7
            r7 = r14
            r14 = r8
            goto L60
        L48:
            defpackage.oi2.Y(r0)
            r1.R = r14
            r1.X = r15
            hb4 r3 = r13.e
            r1.Y = r3
            r7 = 0
            r1.Z = r7
            r1.f0 = r5
            java.lang.Object r8 = r3.e(r1)
            if (r8 != r2) goto L5f
            goto L84
        L5f:
            r0 = r15
        L60:
            vi r8 = r13.a     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            r1.R = r6     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            r1.X = r6     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            r1.Y = r3     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            r1.Z = r7     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            r1.f0 = r4     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            kh r7 = r8.a     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            java.io.File r14 = r8.a(r14, r0)     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            r7.getClass()     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            xe1 r0 = defpackage.xk1.a     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            de1 r0 = defpackage.de1.L     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            m5 r8 = new m5     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            r8.<init>(r14, r7, r6, r5)     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            java.lang.Object r0 = defpackage.hv.d0(r0, r8, r1)     // Catch: java.lang.Exception -> L18e java.lang.Throwable -> L190
            if (r0 != r2) goto L85
        L84:
            return r2
        L85:
            r14 = r3
        L86:
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L193
            if (r0 != 0) goto L93
            pj4 r13 = new pj4     // Catch: java.lang.Throwable -> L2f
            ui4 r0 = defpackage.ui4.EMPTY     // Catch: java.lang.Throwable -> L2f
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            goto L19a
        L93:
            p45 r1 = defpackage.pi4.a     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L184
            si4 r2 = defpackage.ti4.Companion     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L184
            gg3 r2 = r2.serializer()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L184
            gg3 r2 = (defpackage.gg3) r2     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L184
            java.lang.Object r0 = r1.a(r2, r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L184
            ti4 r0 = (defpackage.ti4) r0     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L184
            java.util.List r1 = r0.a     // Catch: java.lang.Throwable -> L2f
            ej4 r2 = r13.j(r1)     // Catch: java.lang.Throwable -> L2f
            ui4 r2 = r2.a     // Catch: java.lang.Throwable -> L2f
            ui4 r3 = defpackage.ui4.OK     // Catch: java.lang.Throwable -> L2f
            if (r2 == r3) goto Lb6
            pj4 r13 = new pj4     // Catch: java.lang.Throwable -> L2f
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            goto L19a
        Lb6:
            ev r2 = defpackage.gt0.B0(r1)     // Catch: java.lang.Throwable -> L2f
            x84 r3 = new x84     // Catch: java.lang.Throwable -> L2f
            r7 = 17
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            pc2 r7 = new pc2     // Catch: java.lang.Throwable -> L2f
            r7.<init>(r2, r5, r3)     // Catch: java.lang.Throwable -> L2f
            bg2 r2 = new bg2     // Catch: java.lang.Throwable -> L2f
            r3 = 16
            r2.<init>(r13, r3)     // Catch: java.lang.Throwable -> L2f
            qd2 r3 = new qd2     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r7, r2, r4)     // Catch: java.lang.Throwable -> L2f
            java.util.List r2 = defpackage.sb6.c0(r3)     // Catch: java.lang.Throwable -> L2f
            ev r3 = new ev     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r1, r5)     // Catch: java.lang.Throwable -> L2f
            x84 r7 = new x84     // Catch: java.lang.Throwable -> L2f
            r8 = 18
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            pc2 r8 = new pc2     // Catch: java.lang.Throwable -> L2f
            r8.<init>(r3, r5, r7)     // Catch: java.lang.Throwable -> L2f
            x84 r3 = new x84     // Catch: java.lang.Throwable -> L2f
            r7 = 19
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            qd2 r7 = new qd2     // Catch: java.lang.Throwable -> L2f
            r7.<init>(r8, r3, r4)     // Catch: java.lang.Throwable -> L2f
            x84 r3 = new x84     // Catch: java.lang.Throwable -> L2f
            r4 = 20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            pc2 r4 = new pc2     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r7, r5, r3)     // Catch: java.lang.Throwable -> L2f
            oc2 r3 = new oc2     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L10d
            du1 r3 = defpackage.du1.A     // Catch: java.lang.Throwable -> L2f
            goto L133
        L10d:
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2f
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r5 != 0) goto L11c
            java.util.Set r3 = defpackage.ii2.R(r4)     // Catch: java.lang.Throwable -> L2f
            goto L133
        L11c:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L2f
            r5.<init>()     // Catch: java.lang.Throwable -> L2f
            r5.add(r4)     // Catch: java.lang.Throwable -> L2f
        L124:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L132
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2f
            r5.add(r4)     // Catch: java.lang.Throwable -> L2f
            goto L124
        L132:
            r3 = r5
        L133:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2f
        L13c:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L15a
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L2f
            r5 = r4
            ek4 r5 = (defpackage.ek4) r5     // Catch: java.lang.Throwable -> L2f
            long r7 = r5.a     // Catch: java.lang.Throwable -> L2f
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            boolean r5 = r3.contains(r5)     // Catch: java.lang.Throwable -> L2f
            if (r5 != 0) goto L13c
            r9.add(r4)     // Catch: java.lang.Throwable -> L2f
            goto L13c
        L15a:
            java.util.LinkedHashMap r10 = f(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Long r11 = h(r0, r9)     // Catch: java.lang.Throwable -> L2f
            vr0 r13 = r13.c     // Catch: java.lang.Throwable -> L2f
            s83 r13 = r13.b()     // Catch: java.lang.Throwable -> L2f
            long r0 = r13.b()     // Catch: java.lang.Throwable -> L2f
            ui4 r8 = defpackage.ui4.OK     // Catch: java.lang.Throwable -> L2f
            if (r11 == 0) goto L17c
            long r2 = r11.longValue()     // Catch: java.lang.Throwable -> L2f
            long r2 = r2 - r0
            java.lang.Long r13 = new java.lang.Long     // Catch: java.lang.Throwable -> L2f
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            r12 = r13
            goto L17d
        L17c:
            r12 = r6
        L17d:
            pj4 r7 = new pj4     // Catch: java.lang.Throwable -> L2f
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L2f
            r13 = r7
            goto L19a
        L184:
            pj4 r13 = new pj4     // Catch: java.lang.Throwable -> L2f
            ui4 r0 = defpackage.ui4.TAMPERED     // Catch: java.lang.Throwable -> L2f
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            goto L19a
        L18c:
            r14 = r3
            goto L19e
        L18e:
            r14 = r3
            goto L193
        L190:
            r0 = move-exception
            r13 = r0
            goto L18c
        L193:
            pj4 r13 = new pj4     // Catch: java.lang.Throwable -> L2f
            ui4 r0 = defpackage.ui4.IO_ERROR     // Catch: java.lang.Throwable -> L2f
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L2f
        L19a:
            r14.h(r6)
            return r13
        L19e:
            r14.h(r6)
            throw r13
    }

    public final java.lang.Object i(java.lang.String r12, java.lang.String r13, defpackage.s41 r14) {
            r11 = this;
            boolean r0 = r14 instanceof defpackage.nj4
            if (r0 == 0) goto L13
            r0 = r14
            nj4 r0 = (defpackage.nj4) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            nj4 r0 = new nj4
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.d0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.f0
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            fb4 r11 = r0.Y
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L2d
            goto L7f
        L2d:
            r0 = move-exception
            r12 = r0
            goto L8f
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            r11 = 0
            return r11
        L38:
            int r12 = r0.Z
            fb4 r13 = r0.Y
            java.lang.String r2 = r0.X
            java.lang.String r4 = r0.R
            defpackage.oi2.Y(r14)
            r8 = r2
            r7 = r4
            goto L61
        L46:
            defpackage.oi2.Y(r14)
            r0.R = r12
            r0.X = r13
            hb4 r14 = r11.e
            r0.Y = r14
            r2 = 0
            r0.Z = r2
            r0.f0 = r4
            java.lang.Object r4 = r14.e(r0)
            if (r4 != r1) goto L5d
            goto L7d
        L5d:
            r7 = r12
            r8 = r13
            r13 = r14
            r12 = r2
        L61:
            xe1 r14 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L8b
            de1 r14 = defpackage.de1.L     // Catch: java.lang.Throwable -> L8b
            u12 r5 = new u12     // Catch: java.lang.Throwable -> L87
            r10 = 19
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L87
            r0.R = r9     // Catch: java.lang.Throwable -> L87
            r0.X = r9     // Catch: java.lang.Throwable -> L87
            r0.Y = r13     // Catch: java.lang.Throwable -> L87
            r0.Z = r12     // Catch: java.lang.Throwable -> L87
            r0.f0 = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r14 = defpackage.hv.d0(r14, r5, r0)     // Catch: java.lang.Throwable -> L87
            if (r14 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r11 = r13
        L7f:
            hm5 r14 = (defpackage.hm5) r14     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r12 = r14.A     // Catch: java.lang.Throwable -> L2d
            r11.h(r9)
            return r12
        L87:
            r0 = move-exception
            r12 = r0
        L89:
            r11 = r13
            goto L8f
        L8b:
            r0 = move-exception
            r11 = r0
            r12 = r11
            goto L89
        L8f:
            r11.h(r9)
            throw r12
    }

    public final defpackage.ej4 j(java.util.List r16) {
            r15 = this;
            boolean r0 = r16.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lf
            ej4 r15 = new ej4
            ui4 r0 = defpackage.ui4.EMPTY
            r15.<init>(r0, r1, r1)
            return r15
        Lf:
            r0 = 0
            byte[] r2 = new byte[r0]
            java.lang.Object r3 = defpackage.gt0.H0(r16)
            bj4 r3 = (defpackage.bj4) r3
            yi4 r3 = r3.a
            long r3 = r3.b
            java.util.Iterator r5 = r16.iterator()
            r6 = r0
        L21:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lbd
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            if (r6 < 0) goto Lb9
            bj4 r7 = (defpackage.bj4) r7
            yi4 r9 = r7.a
            byte[] r10 = r7.b
            p45 r11 = defpackage.pi4.a
            r9.getClass()
            p45 r11 = defpackage.pi4.a
            xi4 r12 = defpackage.yi4.Companion
            gg3 r12 = r12.serializer()
            gg3 r12 = (defpackage.gg3) r12
            byte[] r11 = r11.b(r12, r9)
            long r12 = r9.b
            java.lang.String r14 = "SHA-256"
            java.security.MessageDigest r14 = java.security.MessageDigest.getInstance(r14)
            byte[] r11 = r14.digest(r11)
            r11.getClass()
            boolean r11 = java.util.Arrays.equals(r11, r10)
            if (r11 != 0) goto L65
            ej4 r15 = new ej4
            ui4 r0 = defpackage.ui4.TAMPERED
            r15.<init>(r0, r1, r1)
            return r15
        L65:
            byte[] r9 = r9.n
            boolean r2 = java.util.Arrays.equals(r9, r2)
            if (r2 != 0) goto L75
            ej4 r15 = new ej4
            ui4 r0 = defpackage.ui4.TAMPERED
            r15.<init>(r0, r1, r1)
            return r15
        L75:
            if (r6 <= 0) goto L83
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 == 0) goto L83
            ej4 r15 = new ej4
            ui4 r0 = defpackage.ui4.TAMPERED
            r15.<init>(r0, r1, r1)
            return r15
        L83:
            fi r2 = r15.b     // Catch: java.lang.Exception -> La6
            byte[] r3 = r7.c     // Catch: java.lang.Exception -> La6
            r10.getClass()     // Catch: java.lang.Exception -> La6
            r3.getClass()     // Catch: java.lang.Exception -> La6
            java.security.KeyPair r2 = r2.a()     // Catch: java.lang.Exception -> La6
            java.security.PublicKey r2 = r2.getPublic()     // Catch: java.lang.Exception -> La6
            java.lang.String r4 = "SHA256withECDSA"
            java.security.Signature r4 = java.security.Signature.getInstance(r4)     // Catch: java.lang.Exception -> La6
            r4.initVerify(r2)     // Catch: java.lang.Exception -> La6
            r4.update(r10)     // Catch: java.lang.Exception -> La6
            boolean r2 = r4.verify(r3)     // Catch: java.lang.Exception -> La6
            goto La7
        La6:
            r2 = r0
        La7:
            if (r2 != 0) goto Lb1
            ej4 r15 = new ej4
            ui4 r0 = defpackage.ui4.SIGNING_KEY_INVALID
            r15.<init>(r0, r1, r1)
            return r15
        Lb1:
            r2 = 1
            long r3 = r12 + r2
            r6 = r8
            r2 = r10
            goto L21
        Lb9:
            defpackage.hf.q0()
            throw r1
        Lbd:
            java.lang.Object r15 = defpackage.gt0.Q0(r16)
            bj4 r15 = (defpackage.bj4) r15
            ej4 r0 = new ej4
            ui4 r1 = defpackage.ui4.OK
            yi4 r2 = r15.a
            long r2 = r2.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            byte[] r15 = r15.b
            r0.<init>(r1, r2, r15)
            return r0
    }
}
