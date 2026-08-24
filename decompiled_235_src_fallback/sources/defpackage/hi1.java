package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hi1  reason: default package */
/* loaded from: classes.dex */
public final class hi1 extends defpackage.hq6 {
    public static final java.lang.Object h = null;
    public long c;
    public int d;
    public defpackage.y94 e;
    public java.lang.Object f;
    public int g;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.hi1.h = r0
            return
    }

    public hi1(long r1) {
            r0 = this;
            r0.<init>(r1)
            y94 r1 = defpackage.th4.a
            r1.getClass()
            r0.e = r1
            java.lang.Object r1 = defpackage.hi1.h
            r0.f = r1
            return
    }

    @Override // defpackage.hq6
    public final void a(defpackage.hq6 r2) {
            r1 = this;
            r2.getClass()
            hi1 r2 = (defpackage.hi1) r2
            y94 r0 = r2.e
            r1.e = r0
            java.lang.Object r0 = r2.f
            r1.f = r0
            int r2 = r2.g
            r1.g = r2
            return
    }

    @Override // defpackage.hq6
    public final defpackage.hq6 b(long r1) {
            r0 = this;
            hi1 r0 = new hi1
            r0.<init>(r1)
            return r0
    }

    public final boolean c(defpackage.ii1 r7, defpackage.vl6 r8) {
            r6 = this;
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            long r1 = r6.c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r6 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f
            java.lang.Object r5 = defpackage.hi1.h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.g
            int r7 = r6.d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L43
            r6.c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r6
    }

    public final int d(defpackage.ii1 r31, defpackage.vl6 r32) {
            r30 = this;
            r0 = r32
            java.lang.Object r1 = defpackage.bm6.c
            monitor-enter(r1)
            r2 = r30
            y94 r2 = r2.e     // Catch: java.lang.Throwable -> L16c
            monitor-exit(r1)
            int r1 = r2.e
            r3 = 7
            if (r1 == 0) goto L169
            ua4 r1 = defpackage.np2.H()
            java.lang.Object[] r4 = r1.A
            int r5 = r1.L
            r6 = 0
            r7 = r6
        L19:
            if (r7 >= r5) goto L25
            r8 = r4[r7]
            wq2 r8 = (defpackage.wq2) r8
            r8.b()
            int r7 = r7 + 1
            goto L19
        L25:
            java.lang.Object[] r4 = r2.b     // Catch: java.lang.Throwable -> Lcc
            int[] r5 = r2.c     // Catch: java.lang.Throwable -> Lcc
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> Lcc
            int r7 = r2.length     // Catch: java.lang.Throwable -> Lcc
            int r7 = r7 + (-2)
            if (r7 < 0) goto L142
            r9 = r3
            r8 = r6
        L32:
            r10 = r2[r8]     // Catch: java.lang.Throwable -> Lcc
            long r12 = ~r10     // Catch: java.lang.Throwable -> Lcc
            long r12 = r12 << r3
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L12d
            int r12 = r8 - r7
            int r12 = ~r12     // Catch: java.lang.Throwable -> Lcc
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r30 = r3
            r3 = r6
        L4d:
            if (r3 >= r12) goto L125
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r10 & r16
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L10b
            int r18 = r8 << 3
            int r18 = r18 + r3
            r19 = r4[r18]     // Catch: java.lang.Throwable -> Lcc
            r22 = r14
            r14 = r5[r18]     // Catch: java.lang.Throwable -> Lcc
            r15 = r19
            eq6 r15 = (defpackage.eq6) r15     // Catch: java.lang.Throwable -> Lcc
            r31 = r13
            r13 = 1
            if (r14 == r13) goto L76
            r19 = r2
            r25 = r3
            r24 = r4
            r26 = r10
            goto L108
        L76:
            boolean r13 = r15 instanceof defpackage.ii1     // Catch: java.lang.Throwable -> Lcc
            if (r13 == 0) goto Le8
            ii1 r15 = (defpackage.ii1) r15     // Catch: java.lang.Throwable -> Lcc
            hi1 r13 = r15.R     // Catch: java.lang.Throwable -> Lcc
            hq6 r13 = defpackage.bm6.i(r13, r0)     // Catch: java.lang.Throwable -> Lcc
            hi1 r13 = (defpackage.hi1) r13     // Catch: java.lang.Throwable -> Lcc
            on2 r14 = r15.B     // Catch: java.lang.Throwable -> Lcc
            hi1 r13 = r15.h(r13, r0, r6, r14)     // Catch: java.lang.Throwable -> Lcc
            y94 r14 = r13.e     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object[] r15 = r14.b     // Catch: java.lang.Throwable -> Lcc
            long[] r14 = r14.a     // Catch: java.lang.Throwable -> Lcc
            int r6 = r14.length     // Catch: java.lang.Throwable -> Lcc
            int r6 = r6 + (-2)
            r19 = r2
            r25 = r3
            r24 = r4
            if (r6 < 0) goto Le5
            r2 = 0
        L9c:
            r3 = r14[r2]     // Catch: java.lang.Throwable -> Lcc
            r26 = r10
            r11 = r9
            long r9 = ~r3     // Catch: java.lang.Throwable -> Lcc
            long r9 = r9 << r30
            long r9 = r9 & r3
            long r9 = r9 & r22
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto Ld8
            int r9 = r2 - r6
            int r9 = ~r9     // Catch: java.lang.Throwable -> Lcc
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        Lb3:
            if (r10 >= r9) goto Ld4
            long r28 = r3 & r16
            int r28 = (r28 > r20 ? 1 : (r28 == r20 ? 0 : -1))
            if (r28 >= 0) goto Lcf
            int r28 = r2 << 3
            int r28 = r28 + r10
            r28 = r15[r28]     // Catch: java.lang.Throwable -> Lcc
            eq6 r28 = (defpackage.eq6) r28     // Catch: java.lang.Throwable -> Lcc
            int r11 = r11 * 31
            int r28 = java.lang.System.identityHashCode(r28)     // Catch: java.lang.Throwable -> Lcc
            int r11 = r11 + r28
            goto Lcf
        Lcc:
            r0 = move-exception
            goto L157
        Lcf:
            long r3 = r3 >> r31
            int r10 = r10 + 1
            goto Lb3
        Ld4:
            r3 = r31
            if (r9 != r3) goto Lda
        Ld8:
            r9 = r11
            goto Ldc
        Lda:
            r9 = r11
            goto Lf8
        Ldc:
            if (r2 == r6) goto Lf8
            int r2 = r2 + 1
            r10 = r26
            r31 = 8
            goto L9c
        Le5:
            r26 = r10
            goto Lf8
        Le8:
            r19 = r2
            r25 = r3
            r24 = r4
            r26 = r10
            hq6 r2 = r15.a()     // Catch: java.lang.Throwable -> Lcc
            hq6 r13 = defpackage.bm6.i(r2, r0)     // Catch: java.lang.Throwable -> Lcc
        Lf8:
            int r9 = r9 * 31
            int r2 = java.lang.System.identityHashCode(r13)     // Catch: java.lang.Throwable -> Lcc
            int r9 = r9 + r2
            int r9 = r9 * 31
            long r2 = r13.a     // Catch: java.lang.Throwable -> Lcc
            int r2 = java.lang.Long.hashCode(r2)     // Catch: java.lang.Throwable -> Lcc
            int r9 = r9 + r2
        L108:
            r3 = 8
            goto L116
        L10b:
            r19 = r2
            r25 = r3
            r24 = r4
            r26 = r10
            r22 = r14
            r3 = r13
        L116:
            long r10 = r26 >> r3
            int r2 = r25 + 1
            r13 = r3
            r14 = r22
            r4 = r24
            r6 = 0
            r3 = r2
            r2 = r19
            goto L4d
        L125:
            r19 = r2
            r24 = r4
            r3 = r13
            if (r12 != r3) goto L145
            goto L133
        L12d:
            r19 = r2
            r30 = r3
            r24 = r4
        L133:
            if (r8 == r7) goto L140
            int r8 = r8 + 1
            r3 = r30
            r2 = r19
            r4 = r24
            r6 = 0
            goto L32
        L140:
            r3 = r9
            goto L144
        L142:
            r30 = r3
        L144:
            r9 = r3
        L145:
            java.lang.Object[] r0 = r1.A
            int r1 = r1.L
            r6 = 0
        L14a:
            if (r6 >= r1) goto L156
            r2 = r0[r6]
            wq2 r2 = (defpackage.wq2) r2
            r2.a()
            int r6 = r6 + 1
            goto L14a
        L156:
            return r9
        L157:
            java.lang.Object[] r2 = r1.A
            int r1 = r1.L
            r6 = 0
        L15c:
            if (r6 >= r1) goto L168
            r3 = r2[r6]
            wq2 r3 = (defpackage.wq2) r3
            r3.a()
            int r6 = r6 + 1
            goto L15c
        L168:
            throw r0
        L169:
            r30 = r3
            return r30
        L16c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
