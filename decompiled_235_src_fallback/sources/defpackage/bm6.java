package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm6  reason: default package */
/* loaded from: classes.dex */
public abstract class bm6 {
    public static final defpackage.r76 a = null;
    public static final defpackage.m44 b = null;
    public static final java.lang.Object c = null;
    public static defpackage.zl6 d;
    public static long e;
    public static final defpackage.s11 f = null;
    public static final defpackage.ei g = null;
    public static java.util.List h;
    public static java.util.List i;
    public static final defpackage.os2 j = null;
    public static final defpackage.vw k = null;

    static {
            r76 r0 = new r76
            r1 = 12
            r0.<init>(r1)
            defpackage.bm6.a = r0
            m44 r0 = new m44
            r1 = 19
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.bm6.b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.bm6.c = r0
            zl6 r6 = defpackage.zl6.X
            defpackage.bm6.d = r6
            r0 = 2
            defpackage.bm6.e = r0
            s11 r0 = new s11
            r0.<init>()
            r1 = 16
            long[] r3 = new long[r1]
            r0.c = r3
            int[] r3 = new int[r1]
            r0.d = r3
            int[] r3 = new int[r1]
            r4 = r2
        L34:
            if (r4 >= r1) goto L3c
            int r5 = r4 + 1
            r3[r4] = r5
            r4 = r5
            goto L34
        L3c:
            r0.e = r3
            defpackage.bm6.f = r0
            ei r0 = new ei
            r3 = 7
            r0.<init>(r3)
            int[] r3 = new int[r1]
            r0.L = r3
            ts7[] r1 = new defpackage.ts7[r1]
            r0.R = r1
            defpackage.bm6.g = r0
            yt1 r0 = defpackage.yt1.A
            defpackage.bm6.h = r0
            defpackage.bm6.i = r0
            long r4 = defpackage.bm6.e
            r0 = 1
            long r0 = r0 + r4
            defpackage.bm6.e = r0
            os2 r3 = new os2
            bz1 r8 = new bz1
            r0 = 21
            r8.<init>(r0)
            r7 = 0
            r3.<init>(r4, r6, r7, r8)
            zl6 r0 = defpackage.bm6.d
            long r4 = r3.b
            zl6 r0 = r0.f(r4)
            defpackage.bm6.d = r0
            defpackage.bm6.j = r3
            vw r0 = new vw
            r0.<init>(r2)
            defpackage.bm6.k = r0
            return
    }

    public static final void a() {
            r76 r0 = defpackage.bm6.a
            e(r0)
            return
    }

    public static final java.util.HashMap b(long r22, defpackage.oa4 r24, defpackage.zl6 r25) {
            ka4 r0 = r24.x()
            if (r0 != 0) goto La
        L6:
            r17 = 0
            goto Ldf
        La:
            long r2 = r24.g()
            zl6 r4 = r24.d()
            zl6 r4 = r4.f(r2)
            r5 = r24
            zl6 r6 = r5.j
            zl6 r4 = r4.d(r6)
            java.lang.Object[] r6 = r0.b
            long[] r0 = r0.a
            int r7 = r0.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L6
            r9 = 0
            r10 = 0
        L29:
            r11 = r0[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto Lca
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L43:
            if (r15 >= r13) goto Lbd
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto La3
            int r16 = r9 << 3
            int r16 = r16 + r15
            r16 = r6[r16]
            r17 = 0
            r1 = r16
            eq6 r1 = (defpackage.eq6) r1
            hq6 r8 = r1.a()
            r20 = r0
            r18 = r14
            r19 = r15
            r14 = r22
            r0 = r25
            hq6 r5 = s(r8, r14, r0)
            if (r5 != 0) goto L70
            goto L76
        L70:
            hq6 r0 = s(r8, r2, r4)
            if (r0 != 0) goto L77
        L76:
            goto La0
        L77:
            boolean r21 = r5.equals(r0)
            if (r21 != 0) goto La0
            r21 = r4
            zl6 r4 = r24.d()
            hq6 r4 = s(r8, r2, r4)
            if (r4 == 0) goto L9c
            hq6 r0 = r1.b(r0, r5, r4)
            if (r0 == 0) goto Ldf
            if (r10 != 0) goto L96
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L96:
            r1 = r10
            r10.put(r5, r0)
            r10 = r1
            goto Laf
        L9c:
            r()
            throw r17
        La0:
            r21 = r4
            goto Laf
        La3:
            r20 = r0
            r21 = r4
            r18 = r14
            r19 = r15
            r17 = 0
            r14 = r22
        Laf:
            long r11 = r11 >> r18
            int r0 = r19 + 1
            r5 = r24
            r15 = r0
            r14 = r18
            r0 = r20
            r4 = r21
            goto L43
        Lbd:
            r20 = r0
            r21 = r4
            r0 = r14
            r17 = 0
            r14 = r22
            if (r13 != r0) goto Lc9
            goto Ld2
        Lc9:
            return r10
        Lca:
            r14 = r22
            r20 = r0
            r21 = r4
            r17 = 0
        Ld2:
            if (r9 == r7) goto Lde
            int r9 = r9 + 1
            r5 = r24
            r0 = r20
            r4 = r21
            goto L29
        Lde:
            return r10
        Ldf:
            return r17
    }

    public static final void c(defpackage.vl6 r4) {
            zl6 r0 = defpackage.bm6.d
            long r1 = r4.g()
            boolean r0 = r0.c(r1)
            if (r0 != 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Snapshot is not open: snapshotId="
            r0.<init>(r1)
            long r1 = r4.g()
            r0.append(r1)
            java.lang.String r1 = ", disposed="
            r0.append(r1)
            boolean r1 = r4.c
            r0.append(r1)
            java.lang.String r1 = ", applied="
            r0.append(r1)
            boolean r1 = r4 instanceof defpackage.oa4
            if (r1 == 0) goto L30
            oa4 r4 = (defpackage.oa4) r4
            goto L31
        L30:
            r4 = 0
        L31:
            if (r4 == 0) goto L3a
            boolean r4 = r4.m
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L3c
        L3a:
            java.lang.String r4 = "read-only"
        L3c:
            r0.append(r4)
            java.lang.String r4 = ", lowestPin="
            r0.append(r4)
            java.lang.Object r4 = defpackage.bm6.c
            monitor-enter(r4)
            s11 r1 = defpackage.bm6.f     // Catch: java.lang.Throwable -> L69
            int r2 = r1.a     // Catch: java.lang.Throwable -> L69
            if (r2 <= 0) goto L55
            java.lang.Object r1 = r1.c     // Catch: java.lang.Throwable -> L69
            long[] r1 = (long[]) r1     // Catch: java.lang.Throwable -> L69
            r2 = 0
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L69
            goto L57
        L55:
            r2 = -1
        L57:
            monitor-exit(r4)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L69:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L6c:
            return
    }

    public static final defpackage.zl6 d(defpackage.zl6 r2, long r3, long r5) {
        L0:
            int r0 = defpackage.nb3.q(r3, r5)
            if (r0 >= 0) goto Le
            zl6 r2 = r2.f(r3)
            r0 = 1
            long r3 = r3 + r0
            goto L0
        Le:
            return r2
    }

    public static final java.lang.Object e(defpackage.qn2 r15) {
            os2 r0 = defpackage.bm6.j
            java.lang.Object r1 = defpackage.bm6.c
            monitor-enter(r1)
            ka4 r2 = r0.h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            vw r3 = defpackage.bm6.k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.util.List r4 = defpackage.bm6.h     // Catch: java.lang.Throwable -> L36
            d66 r5 = new d66     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L36
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L36
            r7 = r1
        L28:
            if (r7 >= r6) goto L38
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L36
            eo2 r8 = (defpackage.eo2) r8     // Catch: java.lang.Throwable -> L36
            r8.o(r5, r0)     // Catch: java.lang.Throwable -> L36
            int r7 = r7 + 1
            goto L28
        L36:
            r15 = move-exception
            goto L3e
        L38:
            vw r0 = defpackage.bm6.k
            r0.addAndGet(r3)
            goto L44
        L3e:
            vw r0 = defpackage.bm6.k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            f()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            eq6 r11 = (defpackage.eq6) r11     // Catch: java.lang.Throwable -> L86
            q(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
    }

    public static final void f() {
            ei r0 = defpackage.bm6.g
            int r1 = r0.B
            r2 = 0
            r3 = r2
            r4 = r3
        L7:
            r5 = 0
            if (r3 >= r1) goto L35
            java.lang.Object r6 = r0.R
            ts7[] r6 = (defpackage.ts7[]) r6
            r6 = r6[r3]
            if (r6 == 0) goto L16
            java.lang.Object r5 = r6.get()
        L16:
            if (r5 == 0) goto L32
            eq6 r5 = (defpackage.eq6) r5
            boolean r5 = p(r5)
            if (r5 == 0) goto L32
            if (r4 == r3) goto L30
            java.lang.Object r5 = r0.R
            ts7[] r5 = (defpackage.ts7[]) r5
            r5[r4] = r6
            java.lang.Object r5 = r0.L
            int[] r5 = (int[]) r5
            r6 = r5[r3]
            r5[r4] = r6
        L30:
            int r4 = r4 + 1
        L32:
            int r3 = r3 + 1
            goto L7
        L35:
            r3 = r4
        L36:
            if (r3 >= r1) goto L47
            java.lang.Object r6 = r0.R
            ts7[] r6 = (defpackage.ts7[]) r6
            r6[r3] = r5
            java.lang.Object r6 = r0.L
            int[] r6 = (int[]) r6
            r6[r3] = r2
            int r3 = r3 + 1
            goto L36
        L47:
            if (r4 == r1) goto L4b
            r0.B = r4
        L4b:
            return
    }

    public static final defpackage.vl6 g(defpackage.vl6 r8, defpackage.qn2 r9, boolean r10) {
            boolean r0 = r8 instanceof defpackage.oa4
            if (r0 != 0) goto Le
            if (r8 != 0) goto L7
            goto Le
        L7:
            ob7 r0 = new ob7
            r1 = 0
            r0.<init>(r8, r9, r1, r10)
            return r0
        Le:
            nb7 r2 = new nb7
            if (r0 == 0) goto L16
            oa4 r8 = (defpackage.oa4) r8
        L14:
            r3 = r8
            goto L18
        L16:
            r8 = 0
            goto L14
        L18:
            r5 = 0
            r6 = 0
            r4 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    public static final defpackage.hq6 h(defpackage.hq6 r4) {
            vl6 r0 = j()
            long r1 = r0.g()
            zl6 r0 = r0.d()
            hq6 r0 = s(r4, r1, r0)
            if (r0 != 0) goto L31
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            vl6 r1 = j()     // Catch: java.lang.Throwable -> L2e
            long r2 = r1.g()     // Catch: java.lang.Throwable -> L2e
            zl6 r1 = r1.d()     // Catch: java.lang.Throwable -> L2e
            hq6 r4 = s(r4, r2, r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)
            if (r4 == 0) goto L29
            return r4
        L29:
            r()
            r4 = 0
            throw r4
        L2e:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L31:
            return r0
    }

    public static final defpackage.hq6 i(defpackage.hq6 r3, defpackage.vl6 r4) {
            long r0 = r4.g()
            zl6 r2 = r4.d()
            hq6 r0 = s(r3, r0, r2)
            if (r0 != 0) goto L29
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            long r1 = r4.g()     // Catch: java.lang.Throwable -> L26
            zl6 r4 = r4.d()     // Catch: java.lang.Throwable -> L26
            hq6 r3 = s(r3, r1, r4)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            if (r3 == 0) goto L21
            return r3
        L21:
            r()
            r3 = 0
            throw r3
        L26:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L29:
            return r0
    }

    public static final defpackage.vl6 j() {
            m44 r0 = defpackage.bm6.b
            java.lang.Object r0 = r0.f()
            vl6 r0 = (defpackage.vl6) r0
            if (r0 != 0) goto Lc
            os2 r0 = defpackage.bm6.j
        Lc:
            return r0
    }

    public static final defpackage.qn2 k(defpackage.qn2 r1, defpackage.qn2 r2, boolean r3) {
            if (r3 == 0) goto L3
            goto L4
        L3:
            r2 = 0
        L4:
            if (r1 == 0) goto L11
            if (r2 == 0) goto L11
            if (r1 == r2) goto L11
            am6 r3 = new am6
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
        L11:
            if (r1 != 0) goto L14
            return r2
        L14:
            return r1
    }

    public static final defpackage.qn2 l(defpackage.qn2 r2, defpackage.qn2 r3) {
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            if (r2 == r3) goto Ld
            am6 r0 = new am6
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
        Ld:
            if (r2 != 0) goto L10
            return r3
        L10:
            return r2
    }

    public static final defpackage.hq6 m(defpackage.hq6 r10, defpackage.eq6 r11) {
            hq6 r0 = r11.a()
            long r1 = defpackage.bm6.e
            s11 r3 = defpackage.bm6.f
            int r4 = r3.a
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.c
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = defpackage.nb3.q(r5, r1)
            if (r7 > 0) goto L48
            zl6 r7 = defpackage.zl6.X
            boolean r5 = r7.c(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = defpackage.nb3.q(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            hq6 r0 = r0.b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.a = r0
            return r3
        L55:
            hq6 r10 = r10.b(r0)
            hq6 r0 = r11.a()
            r10.b = r0
            r11.f(r10)
            return r10
    }

    public static final void n(defpackage.vl6 r1, defpackage.eq6 r2) {
            int r0 = r1.h()
            int r0 = r0 + 1
            r1.t(r0)
            qn2 r1 = r1.i()
            if (r1 == 0) goto L12
            r1.g(r2)
        L12:
            return
    }

    public static final defpackage.hq6 o(defpackage.hq6 r4, defpackage.fq6 r5, defpackage.vl6 r6, defpackage.hq6 r7) {
            boolean r0 = r6.f()
            if (r0 == 0) goto L9
            r6.n(r5)
        L9:
            long r0 = r6.g()
            long r2 = r7.a
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L14
            return r7
        L14:
            java.lang.Object r2 = defpackage.bm6.c
            monitor-enter(r2)
            hq6 r4 = m(r4, r5)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)
            r4.a = r0
            long r0 = r7.a
            r2 = 1
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L29
            r6.n(r5)
        L29:
            return r4
        L2a:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    public static final boolean p(defpackage.eq6 r15) {
            hq6 r0 = r15.a()
            long r1 = defpackage.bm6.e
            s11 r3 = defpackage.bm6.f
            int r4 = r3.a
            r5 = 0
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.c
            long[] r1 = (long[]) r1
            r2 = r1[r5]
            r1 = r2
        L14:
            r3 = 0
            r4 = r3
            r6 = r5
        L17:
            if (r0 == 0) goto L68
            long r7 = r0.a
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L65
            int r7 = defpackage.nb3.q(r7, r1)
            if (r7 >= 0) goto L63
            if (r3 != 0) goto L2d
            int r6 = r6 + 1
            r3 = r0
            goto L65
        L2d:
            long r7 = r0.a
            long r11 = r3.a
            int r7 = defpackage.nb3.q(r7, r11)
            if (r7 >= 0) goto L3a
            r7 = r3
            r3 = r0
            goto L3b
        L3a:
            r7 = r0
        L3b:
            if (r4 != 0) goto L5c
            hq6 r4 = r15.a()
            r8 = r4
        L42:
            if (r4 == 0) goto L5b
            long r11 = r4.a
            int r11 = defpackage.nb3.q(r11, r1)
            if (r11 < 0) goto L4d
            goto L5c
        L4d:
            long r11 = r8.a
            long r13 = r4.a
            int r11 = defpackage.nb3.q(r11, r13)
            if (r11 >= 0) goto L58
            r8 = r4
        L58:
            hq6 r4 = r4.b
            goto L42
        L5b:
            r4 = r8
        L5c:
            r3.a = r9
            r3.a(r4)
            r3 = r7
            goto L65
        L63:
            int r6 = r6 + 1
        L65:
            hq6 r0 = r0.b
            goto L17
        L68:
            r15 = 1
            if (r6 <= r15) goto L6c
            return r15
        L6c:
            return r5
    }

    public static final void q(defpackage.eq6 r10) {
            boolean r0 = p(r10)
            if (r0 == 0) goto Leb
            ei r0 = defpackage.bm6.g
            int r1 = r0.B
            int r2 = java.lang.System.identityHashCode(r10)
            r3 = 0
            r4 = -1
            if (r1 <= 0) goto L94
            int r5 = r0.B
            int r5 = r5 + (-1)
            r6 = r3
        L17:
            if (r6 > r5) goto L8e
            int r7 = r6 + r5
            int r7 = r7 >>> 1
            java.lang.Object r8 = r0.L
            int[] r8 = (int[]) r8
            r8 = r8[r7]
            if (r8 >= r2) goto L28
            int r6 = r7 + 1
            goto L17
        L28:
            if (r8 <= r2) goto L2d
            int r5 = r7 + (-1)
            goto L17
        L2d:
            java.lang.Object r5 = r0.R
            ts7[] r5 = (defpackage.ts7[]) r5
            r5 = r5[r7]
            r6 = 0
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r5.get()
            goto L3c
        L3b:
            r5 = r6
        L3c:
            if (r10 != r5) goto L40
        L3e:
            r4 = r7
            goto L91
        L40:
            int r5 = r7 + (-1)
        L42:
            if (r4 >= r5) goto L62
            java.lang.Object r8 = r0.L
            int[] r8 = (int[]) r8
            r8 = r8[r5]
            if (r8 == r2) goto L4d
            goto L62
        L4d:
            java.lang.Object r8 = r0.R
            ts7[] r8 = (defpackage.ts7[]) r8
            r8 = r8[r5]
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r8.get()
            goto L5b
        L5a:
            r8 = r6
        L5b:
            if (r8 != r10) goto L5f
            r4 = r5
            goto L91
        L5f:
            int r5 = r5 + (-1)
            goto L42
        L62:
            int r7 = r7 + 1
            int r4 = r0.B
        L66:
            if (r7 >= r4) goto L88
            java.lang.Object r5 = r0.L
            int[] r5 = (int[]) r5
            r5 = r5[r7]
            if (r5 == r2) goto L74
            int r7 = r7 + 1
            int r4 = -r7
            goto L91
        L74:
            java.lang.Object r5 = r0.R
            ts7[] r5 = (defpackage.ts7[]) r5
            r5 = r5[r7]
            if (r5 == 0) goto L81
            java.lang.Object r5 = r5.get()
            goto L82
        L81:
            r5 = r6
        L82:
            if (r5 != r10) goto L85
            goto L3e
        L85:
            int r7 = r7 + 1
            goto L66
        L88:
            int r4 = r0.B
            int r4 = r4 + 1
            int r4 = -r4
            goto L91
        L8e:
            int r6 = r6 + 1
            int r4 = -r6
        L91:
            if (r4 < 0) goto L94
            goto Leb
        L94:
            int r4 = r4 + 1
            int r4 = -r4
            java.lang.Object r5 = r0.R
            ts7[] r5 = (defpackage.ts7[]) r5
            int r6 = r5.length
            if (r1 != r6) goto Lc6
            int r6 = r6 * 2
            ts7[] r7 = new defpackage.ts7[r6]
            int[] r6 = new int[r6]
            int r8 = r4 + 1
            int r9 = r1 - r4
            java.lang.System.arraycopy(r5, r4, r7, r8, r9)
            java.lang.Object r5 = r0.R
            ts7[] r5 = (defpackage.ts7[]) r5
            java.lang.System.arraycopy(r5, r3, r7, r3, r4)
            java.lang.Object r5 = r0.L
            int[] r5 = (int[]) r5
            defpackage.fv.r0(r8, r4, r1, r5, r6)
            java.lang.Object r1 = r0.L
            int[] r1 = (int[]) r1
            r5 = 6
            defpackage.fv.v0(r3, r4, r5, r1, r6)
            r0.R = r7
            r0.L = r6
            goto Ld4
        Lc6:
            int r3 = r4 + 1
            int r6 = r1 - r4
            java.lang.System.arraycopy(r5, r4, r5, r3, r6)
            java.lang.Object r5 = r0.L
            int[] r5 = (int[]) r5
            defpackage.fv.r0(r3, r4, r1, r5, r5)
        Ld4:
            java.lang.Object r1 = r0.R
            ts7[] r1 = (defpackage.ts7[]) r1
            ts7 r3 = new ts7
            r3.<init>(r10)
            r1[r4] = r3
            java.lang.Object r10 = r0.L
            int[] r10 = (int[]) r10
            r10[r4] = r2
            int r10 = r0.B
            int r10 = r10 + 1
            r0.B = r10
        Leb:
            return
    }

    public static final void r() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied"
            r0.<init>(r1)
            throw r0
    }

    public static final defpackage.hq6 s(defpackage.hq6 r6, long r7, defpackage.zl6 r9) {
            r0 = 0
            r1 = r0
        L2:
            if (r6 == 0) goto L29
            long r2 = r6.a
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L26
            int r4 = defpackage.nb3.q(r2, r7)
            if (r4 > 0) goto L26
            boolean r2 = r9.c(r2)
            if (r2 != 0) goto L26
            if (r1 != 0) goto L1b
            goto L25
        L1b:
            long r2 = r1.a
            long r4 = r6.a
            int r2 = defpackage.nb3.q(r2, r4)
            if (r2 >= 0) goto L26
        L25:
            r1 = r6
        L26:
            hq6 r6 = r6.b
            goto L2
        L29:
            if (r1 == 0) goto L2c
            return r1
        L2c:
            return r0
    }

    public static final defpackage.hq6 t(defpackage.hq6 r3, defpackage.eq6 r4) {
            vl6 r0 = j()
            qn2 r1 = r0.e()
            if (r1 == 0) goto Ld
            r1.g(r4)
        Ld:
            long r1 = r0.g()
            zl6 r0 = r0.d()
            hq6 r3 = s(r3, r1, r0)
            if (r3 != 0) goto L41
            java.lang.Object r3 = defpackage.bm6.c
            monitor-enter(r3)
            vl6 r0 = j()     // Catch: java.lang.Throwable -> L3e
            hq6 r4 = r4.a()     // Catch: java.lang.Throwable -> L3e
            r4.getClass()     // Catch: java.lang.Throwable -> L3e
            long r1 = r0.g()     // Catch: java.lang.Throwable -> L3e
            zl6 r0 = r0.d()     // Catch: java.lang.Throwable -> L3e
            hq6 r4 = s(r4, r1, r0)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L39
            monitor-exit(r3)
            return r4
        L39:
            r()     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L3e
        L3e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L41:
            return r3
    }

    public static final void u(int r10) {
            s11 r0 = defpackage.bm6.f
            java.lang.Cloneable r1 = r0.e
            int[] r1 = (int[]) r1
            r1 = r1[r10]
            int r2 = r0.a
            int r2 = r2 + (-1)
            r0.c(r1, r2)
            int r2 = r0.a
            int r2 = r2 + (-1)
            r0.a = r2
            java.lang.Object r2 = r0.c
            long[] r2 = (long[]) r2
            r3 = r2[r1]
            r5 = r1
        L1c:
            if (r5 <= 0) goto L31
            int r6 = r5 + 1
            int r6 = r6 >> 1
            int r6 = r6 + (-1)
            r7 = r2[r6]
            int r7 = defpackage.nb3.q(r7, r3)
            if (r7 <= 0) goto L31
            r0.c(r6, r5)
            r5 = r6
            goto L1c
        L31:
            java.lang.Object r2 = r0.c
            long[] r2 = (long[]) r2
            int r3 = r0.a
            int r3 = r3 >> 1
        L39:
            if (r1 >= r3) goto L6d
            int r4 = r1 + 1
            int r4 = r4 << 1
            int r5 = r4 + (-1)
            int r6 = r0.a
            if (r4 >= r6) goto L5e
            r6 = r2[r4]
            r8 = r2[r5]
            int r6 = defpackage.nb3.q(r6, r8)
            if (r6 >= 0) goto L5e
            r5 = r2[r4]
            r7 = r2[r1]
            int r5 = defpackage.nb3.q(r5, r7)
            if (r5 >= 0) goto L6d
            r0.c(r4, r1)
            r1 = r4
            goto L39
        L5e:
            r6 = r2[r5]
            r8 = r2[r1]
            int r4 = defpackage.nb3.q(r6, r8)
            if (r4 >= 0) goto L6d
            r0.c(r5, r1)
            r1 = r5
            goto L39
        L6d:
            java.lang.Cloneable r1 = r0.e
            int[] r1 = (int[]) r1
            int r2 = r0.b
            r1[r10] = r2
            r0.b = r10
            return
    }

    public static final java.lang.Object v(defpackage.os2 r6, defpackage.qn2 r7) {
            long r0 = r6.b
            zl6 r2 = defpackage.bm6.d
            zl6 r2 = r2.b(r0)
            java.lang.Object r7 = r7.g(r2)
            long r2 = defpackage.bm6.e
            r4 = 1
            long r4 = r4 + r2
            defpackage.bm6.e = r4
            zl6 r4 = defpackage.bm6.d
            zl6 r0 = r4.b(r0)
            defpackage.bm6.d = r0
            r6.b = r2
            r6.a = r0
            r0 = 0
            r6.g = r0
            r0 = 0
            r6.h = r0
            r6.o()
            zl6 r6 = defpackage.bm6.d
            zl6 r6 = r6.f(r2)
            defpackage.bm6.d = r6
            return r7
    }

    public static final defpackage.hq6 w(defpackage.hq6 r7, defpackage.eq6 r8, defpackage.vl6 r9) {
            boolean r0 = r9.f()
            if (r0 == 0) goto L9
            r9.n(r8)
        L9:
            long r0 = r9.g()
            zl6 r2 = r9.d()
            hq6 r7 = s(r7, r0, r2)
            r2 = 0
            if (r7 == 0) goto L5e
            long r3 = r7.a
            long r5 = r9.g()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L23
            return r7
        L23:
            java.lang.Object r3 = defpackage.bm6.c
            monitor-enter(r3)
            hq6 r4 = r8.a()     // Catch: java.lang.Throwable -> L56
            zl6 r5 = r9.d()     // Catch: java.lang.Throwable -> L56
            hq6 r4 = s(r4, r0, r5)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L58
            long r5 = r4.a     // Catch: java.lang.Throwable -> L56
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L3b
            goto L49
        L3b:
            hq6 r0 = m(r4, r8)     // Catch: java.lang.Throwable -> L56
            r0.a(r4)     // Catch: java.lang.Throwable -> L56
            long r1 = r9.g()     // Catch: java.lang.Throwable -> L56
            r0.a = r1     // Catch: java.lang.Throwable -> L56
            r4 = r0
        L49:
            monitor-exit(r3)
            long r0 = r7.a
            r2 = 1
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L55
            r9.n(r8)
        L55:
            return r4
        L56:
            r7 = move-exception
            goto L5c
        L58:
            r()     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L56
        L5c:
            monitor-exit(r3)
            throw r7
        L5e:
            r()
            throw r2
    }
}
