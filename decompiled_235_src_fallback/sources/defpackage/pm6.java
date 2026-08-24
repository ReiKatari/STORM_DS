package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm6  reason: default package */
/* loaded from: classes.dex */
public final class pm6 {
    public final defpackage.qn2 a;
    public java.lang.Object b;
    public defpackage.y94 c;
    public int d;
    public final defpackage.ja4 e;
    public final defpackage.ja4 f;
    public final defpackage.ka4 g;
    public final defpackage.ua4 h;
    public final defpackage.wq2 i;
    public boolean j;
    public int k;
    public final defpackage.ja4 l;
    public final java.util.HashMap m;

    public pm6(defpackage.qn2 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r2 = -1
            r1.d = r2
            ja4 r2 = defpackage.mp2.q()
            r1.e = r2
            ja4 r2 = new ja4
            r2.<init>()
            r1.f = r2
            ka4 r2 = new ka4
            r2.<init>()
            r1.g = r2
            ua4 r2 = new ua4
            r0 = 16
            ii1[] r0 = new defpackage.ii1[r0]
            r2.<init>(r0)
            r1.h = r2
            wq2 r2 = new wq2
            r0 = 1
            r2.<init>(r1, r0)
            r1.i = r2
            ja4 r2 = defpackage.mp2.q()
            r1.l = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.m = r2
            return
    }

    public final boolean a(java.util.Set r46) {
            r45 = this;
            r1 = r45
            r0 = r46
            xd5 r2 = defpackage.xd5.s0
            boolean r3 = r0 instanceof defpackage.d66
            ua4 r4 = r1.h
            r10 = 2
            r16 = 128(0x80, double:6.3E-322)
            ja4 r5 = r1.l
            java.util.HashMap r6 = r1.m
            r18 = 255(0xff, double:1.26E-321)
            ja4 r7 = r1.e
            ka4 r8 = r1.g
            if (r3 == 0) goto L32c
            d66 r0 = (defpackage.d66) r0
            ka4 r0 = r0.A
            java.lang.Object[] r3 = r0.b
            long[] r0 = r0.a
            r20 = 7
            int r9 = r0.length
            int r9 = r9 - r10
            if (r9 < 0) goto L323
            r11 = 0
            r12 = 0
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L2e:
            r23 = 8
            r13 = r0[r11]
            r46 = r11
            long r10 = ~r13
            long r10 = r10 << r20
            long r10 = r10 & r13
            long r10 = r10 & r21
            int r10 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r10 == 0) goto L309
            int r11 = r46 - r9
            int r10 = ~r11
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = 0
        L46:
            if (r11 >= r10) goto L2f4
            long r26 = r13 & r18
            int r26 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r26 >= 0) goto L2cc
            int r26 = r46 << 3
            int r26 = r26 + r11
            r15 = r3[r26]
            r26 = r0
            boolean r0 = r15 instanceof defpackage.fq6
            if (r0 == 0) goto L68
            r0 = r15
            fq6 r0 = (defpackage.fq6) r0
            r28 = r2
            r2 = 2
            boolean r0 = r0.e(r2)
            if (r0 != 0) goto L6a
            goto L2d0
        L68:
            r28 = r2
        L6a:
            boolean r0 = r1.j
            if (r0 != 0) goto L269
            boolean r0 = r5.c(r15)
            if (r0 == 0) goto L269
            r0 = 1
            r1.j = r0
            java.lang.Object r0 = r5.g(r15)     // Catch: java.lang.Throwable -> L128
            if (r0 == 0) goto L254
            boolean r2 = r0 instanceof defpackage.ka4     // Catch: java.lang.Throwable -> L128
            if (r2 == 0) goto L1d4
            ka4 r0 = (defpackage.ka4) r0     // Catch: java.lang.Throwable -> L128
            java.lang.Object[] r2 = r0.b     // Catch: java.lang.Throwable -> L128
            long[] r0 = r0.a     // Catch: java.lang.Throwable -> L128
            r29 = r2
            int r2 = r0.length     // Catch: java.lang.Throwable -> L128
            r25 = 2
            int r2 = r2 + (-2)
            if (r2 < 0) goto L1c1
            r30 = r0
            r31 = r11
            r32 = r12
            r0 = 0
        L97:
            r11 = r30[r0]     // Catch: java.lang.Throwable -> L128
            r33 = r13
            long r13 = ~r11     // Catch: java.lang.Throwable -> L128
            long r13 = r13 << r20
            long r13 = r13 & r11
            long r13 = r13 & r21
            int r13 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r13 == 0) goto L1a3
            int r13 = r0 - r2
            int r13 = ~r13     // Catch: java.lang.Throwable -> L128
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = 0
        Lad:
            if (r14 >= r13) goto L191
            long r35 = r11 & r18
            int r35 = (r35 > r16 ? 1 : (r35 == r16 ? 0 : -1))
            if (r35 >= 0) goto L170
            int r35 = r0 << 3
            int r35 = r35 + r14
            r35 = r29[r35]     // Catch: java.lang.Throwable -> L128
            r36 = r3
            r3 = r35
            ii1 r3 = (defpackage.ii1) r3     // Catch: java.lang.Throwable -> L128
            r3.getClass()     // Catch: java.lang.Throwable -> L128
            r37 = r11
            java.lang.Object r11 = r6.get(r3)     // Catch: java.lang.Throwable -> L128
            im6 r12 = r3.L     // Catch: java.lang.Throwable -> L128
            if (r12 != 0) goto Ld0
            r12 = r28
        Ld0:
            r35 = r14
            hi1 r14 = r3.i()     // Catch: java.lang.Throwable -> L128
            java.lang.Object r14 = r14.f     // Catch: java.lang.Throwable -> L128
            boolean r11 = r12.i(r14, r11)     // Catch: java.lang.Throwable -> L128
            if (r11 != 0) goto L162
            java.lang.Object r3 = r7.g(r3)     // Catch: java.lang.Throwable -> L128
            if (r3 == 0) goto L14b
            boolean r11 = r3 instanceof defpackage.ka4     // Catch: java.lang.Throwable -> L128
            if (r11 == 0) goto L154
            ka4 r3 = (defpackage.ka4) r3     // Catch: java.lang.Throwable -> L128
            java.lang.Object[] r11 = r3.b     // Catch: java.lang.Throwable -> L128
            long[] r3 = r3.a     // Catch: java.lang.Throwable -> L128
            int r12 = r3.length     // Catch: java.lang.Throwable -> L128
            r25 = 2
            int r12 = r12 + (-2)
            if (r12 < 0) goto L14b
            r39 = r9
            r40 = r10
            r14 = 0
        Lfa:
            r9 = r3[r14]     // Catch: java.lang.Throwable -> L128
            r41 = r5
            r42 = r6
            long r5 = ~r9     // Catch: java.lang.Throwable -> L128
            long r5 = r5 << r20
            long r5 = r5 & r9
            long r5 = r5 & r21
            int r5 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r5 == 0) goto L13c
            int r5 = r14 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L128
            int r5 = r5 >>> 31
            int r5 = 8 - r5
            r6 = 0
        L112:
            if (r6 >= r5) goto L135
            long r43 = r9 & r18
            int r43 = (r43 > r16 ? 1 : (r43 == r16 ? 0 : -1))
            if (r43 >= 0) goto L12c
            int r32 = r14 << 3
            int r32 = r32 + r6
            r43 = r3
            r3 = r11[r32]     // Catch: java.lang.Throwable -> L128
            r8.a(r3)     // Catch: java.lang.Throwable -> L128
            r32 = 1
            goto L12e
        L128:
            r0 = move-exception
            r3 = 0
            goto L266
        L12c:
            r43 = r3
        L12e:
            long r9 = r9 >> r23
            int r6 = r6 + 1
            r3 = r43
            goto L112
        L135:
            r43 = r3
            r3 = r23
            if (r5 != r3) goto L16d
            goto L13e
        L13c:
            r43 = r3
        L13e:
            if (r14 == r12) goto L16d
            int r14 = r14 + 1
            r5 = r41
            r6 = r42
            r3 = r43
            r23 = 8
            goto Lfa
        L14b:
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            goto L16d
        L154:
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r8.a(r3)     // Catch: java.lang.Throwable -> L128
            r32 = 1
            goto L16d
        L162:
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r4.b(r3)     // Catch: java.lang.Throwable -> L128
        L16d:
            r3 = 8
            goto L17f
        L170:
            r36 = r3
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r37 = r11
            r35 = r14
            goto L16d
        L17f:
            long r11 = r37 >> r3
            int r14 = r35 + 1
            r23 = r3
            r3 = r36
            r9 = r39
            r10 = r40
            r5 = r41
            r6 = r42
            goto Lad
        L191:
            r36 = r3
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r3 = r23
            if (r13 != r3) goto L1a0
            goto L1ad
        L1a0:
            r12 = r32
            goto L1cf
        L1a3:
            r36 = r3
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
        L1ad:
            if (r0 == r2) goto L1a0
            int r0 = r0 + 1
            r13 = r33
            r3 = r36
            r9 = r39
            r10 = r40
            r5 = r41
            r6 = r42
            r23 = 8
            goto L97
        L1c1:
            r36 = r3
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r31 = r11
            r33 = r13
        L1cf:
            r2 = r42
        L1d1:
            r3 = 0
            goto L263
        L1d4:
            r36 = r3
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r31 = r11
            r33 = r13
            ii1 r0 = (defpackage.ii1) r0     // Catch: java.lang.Throwable -> L128
            r2 = r42
            java.lang.Object r3 = r2.get(r0)     // Catch: java.lang.Throwable -> L128
            im6 r5 = r0.L     // Catch: java.lang.Throwable -> L128
            if (r5 != 0) goto L1f0
            r5 = r28
        L1f0:
            hi1 r6 = r0.i()     // Catch: java.lang.Throwable -> L128
            java.lang.Object r6 = r6.f     // Catch: java.lang.Throwable -> L128
            boolean r3 = r5.i(r6, r3)     // Catch: java.lang.Throwable -> L128
            if (r3 != 0) goto L24f
            java.lang.Object r0 = r7.g(r0)     // Catch: java.lang.Throwable -> L128
            if (r0 == 0) goto L1d1
            boolean r3 = r0 instanceof defpackage.ka4     // Catch: java.lang.Throwable -> L128
            if (r3 == 0) goto L24a
            ka4 r0 = (defpackage.ka4) r0     // Catch: java.lang.Throwable -> L128
            java.lang.Object[] r3 = r0.b     // Catch: java.lang.Throwable -> L128
            long[] r0 = r0.a     // Catch: java.lang.Throwable -> L128
            int r5 = r0.length     // Catch: java.lang.Throwable -> L128
            r25 = 2
            int r5 = r5 + (-2)
            if (r5 < 0) goto L1d1
            r6 = 0
        L214:
            r9 = r0[r6]     // Catch: java.lang.Throwable -> L128
            long r13 = ~r9     // Catch: java.lang.Throwable -> L128
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r13 = r13 & r21
            int r11 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r11 == 0) goto L245
            int r11 = r6 - r5
            int r11 = ~r11     // Catch: java.lang.Throwable -> L128
            int r11 = r11 >>> 31
            r23 = 8
            int r13 = 8 - r11
            r11 = 0
        L22a:
            if (r11 >= r13) goto L241
            long r29 = r9 & r18
            int r14 = (r29 > r16 ? 1 : (r29 == r16 ? 0 : -1))
            if (r14 >= 0) goto L23b
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]     // Catch: java.lang.Throwable -> L128
            r8.a(r12)     // Catch: java.lang.Throwable -> L128
            r12 = 1
        L23b:
            r14 = 8
            long r9 = r9 >> r14
            int r11 = r11 + 1
            goto L22a
        L241:
            r14 = 8
            if (r13 != r14) goto L1d1
        L245:
            if (r6 == r5) goto L1d1
            int r6 = r6 + 1
            goto L214
        L24a:
            r8.a(r0)     // Catch: java.lang.Throwable -> L128
            r12 = 1
            goto L1d1
        L24f:
            r4.b(r0)     // Catch: java.lang.Throwable -> L128
            goto L1d1
        L254:
            r36 = r3
            r41 = r5
            r2 = r6
            r39 = r9
            r40 = r10
            r31 = r11
            r33 = r13
            goto L1d1
        L263:
            r1.j = r3
            goto L276
        L266:
            r1.j = r3
            throw r0
        L269:
            r36 = r3
            r41 = r5
            r2 = r6
            r39 = r9
            r40 = r10
            r31 = r11
            r33 = r13
        L276:
            java.lang.Object r0 = r7.g(r15)
            if (r0 == 0) goto L2c9
            boolean r3 = r0 instanceof defpackage.ka4
            if (r3 == 0) goto L2c5
            ka4 r0 = (defpackage.ka4) r0
            java.lang.Object[] r3 = r0.b
            long[] r0 = r0.a
            int r5 = r0.length
            r25 = 2
            int r5 = r5 + (-2)
            if (r5 < 0) goto L2c9
            r6 = 0
        L28e:
            r9 = r0[r6]
            long r13 = ~r9
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r13 = r13 & r21
            int r11 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r11 == 0) goto L2c0
            int r11 = r6 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r23 = 8
            int r13 = 8 - r11
            r10 = r9
            r9 = 0
        L2a5:
            if (r9 >= r13) goto L2bc
            long r14 = r10 & r18
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L2b6
            int r12 = r6 << 3
            int r12 = r12 + r9
            r12 = r3[r12]
            r8.a(r12)
            r12 = 1
        L2b6:
            r14 = 8
            long r10 = r10 >> r14
            int r9 = r9 + 1
            goto L2a5
        L2bc:
            r14 = 8
            if (r13 != r14) goto L2c9
        L2c0:
            if (r6 == r5) goto L2c9
            int r6 = r6 + 1
            goto L28e
        L2c5:
            r8.a(r0)
            r12 = 1
        L2c9:
            r14 = 8
            goto L2de
        L2cc:
            r26 = r0
            r28 = r2
        L2d0:
            r36 = r3
            r41 = r5
            r2 = r6
            r39 = r9
            r40 = r10
            r31 = r11
            r33 = r13
            goto L2c9
        L2de:
            long r5 = r33 >> r14
            int r11 = r31 + 1
            r23 = r14
            r0 = r26
            r3 = r36
            r9 = r39
            r10 = r40
            r13 = r5
            r5 = r41
            r6 = r2
            r2 = r28
            goto L46
        L2f4:
            r26 = r0
            r28 = r2
            r36 = r3
            r41 = r5
            r2 = r6
            r39 = r9
            r13 = r10
            r14 = r23
            if (r13 != r14) goto L329
            r9 = r39
        L306:
            r15 = r46
            goto L313
        L309:
            r26 = r0
            r28 = r2
            r36 = r3
            r41 = r5
            r2 = r6
            goto L306
        L313:
            if (r15 == r9) goto L329
            int r11 = r15 + 1
            r6 = r2
            r0 = r26
            r2 = r28
            r3 = r36
            r5 = r41
            r10 = 2
            goto L2e
        L323:
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 0
        L329:
            r5 = 0
            goto L591
        L32c:
            r28 = r2
            r41 = r5
            r2 = r6
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L33f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L58e
            java.lang.Object r5 = r0.next()
            boolean r6 = r5 instanceof defpackage.fq6
            if (r6 == 0) goto L35c
            r6 = r5
            fq6 r6 = (defpackage.fq6) r6
            r9 = 2
            boolean r6 = r6.e(r9)
            if (r6 != 0) goto L35c
            r46 = r0
            r5 = 0
            goto L58a
        L35c:
            boolean r6 = r1.j
            if (r6 != 0) goto L530
            r6 = r41
            boolean r9 = r6.c(r5)
            if (r9 == 0) goto L52e
            r9 = 1
            r1.j = r9
            java.lang.Object r10 = r6.g(r5)     // Catch: java.lang.Throwable -> L41a
            if (r10 == 0) goto L51d
            boolean r11 = r10 instanceof defpackage.ka4     // Catch: java.lang.Throwable -> L41a
            if (r11 == 0) goto L49d
            ka4 r10 = (defpackage.ka4) r10     // Catch: java.lang.Throwable -> L41a
            java.lang.Object[] r11 = r10.b     // Catch: java.lang.Throwable -> L41a
            long[] r10 = r10.a     // Catch: java.lang.Throwable -> L41a
            int r12 = r10.length     // Catch: java.lang.Throwable -> L41a
            r25 = 2
            int r12 = r12 + (-2)
            if (r12 < 0) goto L51d
            r13 = r3
            r3 = 0
        L384:
            r14 = r10[r3]     // Catch: java.lang.Throwable -> L41a
            r26 = r10
            long r9 = ~r14     // Catch: java.lang.Throwable -> L41a
            long r9 = r9 << r20
            long r9 = r9 & r14
            long r9 = r9 & r21
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 == 0) goto L481
            int r9 = r3 - r12
            int r9 = ~r9     // Catch: java.lang.Throwable -> L41a
            int r9 = r9 >>> 31
            r23 = 8
            int r9 = 8 - r9
            r10 = 0
        L39c:
            if (r10 >= r9) goto L472
            long r29 = r14 & r18
            int r29 = (r29 > r16 ? 1 : (r29 == r16 ? 0 : -1))
            if (r29 >= 0) goto L456
            int r29 = r3 << 3
            int r29 = r29 + r10
            r29 = r11[r29]     // Catch: java.lang.Throwable -> L41a
            r46 = r0
            r0 = r29
            ii1 r0 = (defpackage.ii1) r0     // Catch: java.lang.Throwable -> L41a
            r0.getClass()     // Catch: java.lang.Throwable -> L41a
            r41 = r6
            java.lang.Object r6 = r2.get(r0)     // Catch: java.lang.Throwable -> L41a
            r29 = r10
            im6 r10 = r0.L     // Catch: java.lang.Throwable -> L41a
            if (r10 != 0) goto L3c1
            r10 = r28
        L3c1:
            r30 = r11
            hi1 r11 = r0.i()     // Catch: java.lang.Throwable -> L41a
            java.lang.Object r11 = r11.f     // Catch: java.lang.Throwable -> L41a
            boolean r6 = r10.i(r11, r6)     // Catch: java.lang.Throwable -> L41a
            if (r6 != 0) goto L44c
            java.lang.Object r0 = r7.g(r0)     // Catch: java.lang.Throwable -> L41a
            if (r0 == 0) goto L445
            boolean r6 = r0 instanceof defpackage.ka4     // Catch: java.lang.Throwable -> L41a
            if (r6 == 0) goto L43c
            ka4 r0 = (defpackage.ka4) r0     // Catch: java.lang.Throwable -> L41a
            java.lang.Object[] r6 = r0.b     // Catch: java.lang.Throwable -> L41a
            long[] r0 = r0.a     // Catch: java.lang.Throwable -> L41a
            int r10 = r0.length     // Catch: java.lang.Throwable -> L41a
            r25 = 2
            int r10 = r10 + (-2)
            if (r10 < 0) goto L445
            r31 = r14
            r11 = 0
            r15 = r13
        L3ea:
            r13 = r0[r11]     // Catch: java.lang.Throwable -> L41a
            r33 = r5
            r34 = r6
            long r5 = ~r13     // Catch: java.lang.Throwable -> L41a
            long r5 = r5 << r20
            long r5 = r5 & r13
            long r5 = r5 & r21
            int r5 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r5 == 0) goto L42d
            int r5 = r11 - r10
            int r5 = ~r5     // Catch: java.lang.Throwable -> L41a
            int r5 = r5 >>> 31
            r23 = 8
            int r5 = 8 - r5
            r6 = 0
        L404:
            if (r6 >= r5) goto L424
            long r35 = r13 & r18
            int r35 = (r35 > r16 ? 1 : (r35 == r16 ? 0 : -1))
            if (r35 >= 0) goto L415
            int r15 = r11 << 3
            int r15 = r15 + r6
            r15 = r34[r15]     // Catch: java.lang.Throwable -> L41a
            r8.a(r15)     // Catch: java.lang.Throwable -> L41a
            r15 = 1
        L415:
            r35 = r0
            r0 = 8
            goto L41e
        L41a:
            r0 = move-exception
            r5 = 0
            goto L52b
        L41e:
            long r13 = r13 >> r0
            int r6 = r6 + 1
            r0 = r35
            goto L404
        L424:
            r35 = r0
            r0 = 8
            if (r5 != r0) goto L42b
            goto L42f
        L42b:
            r0 = r15
            goto L44a
        L42d:
            r35 = r0
        L42f:
            if (r11 == r10) goto L43a
            int r11 = r11 + 1
            r5 = r33
            r6 = r34
            r0 = r35
            goto L3ea
        L43a:
            r13 = r15
            goto L449
        L43c:
            r33 = r5
            r31 = r14
            r8.a(r0)     // Catch: java.lang.Throwable -> L41a
            r0 = 1
            goto L44a
        L445:
            r33 = r5
            r31 = r14
        L449:
            r0 = r13
        L44a:
            r13 = r0
            goto L453
        L44c:
            r33 = r5
            r31 = r14
            r4.b(r0)     // Catch: java.lang.Throwable -> L41a
        L453:
            r14 = 8
            goto L463
        L456:
            r46 = r0
            r33 = r5
            r41 = r6
            r29 = r10
            r30 = r11
            r31 = r14
            goto L453
        L463:
            long r5 = r31 >> r14
            int r10 = r29 + 1
            r0 = r46
            r14 = r5
            r11 = r30
            r5 = r33
            r6 = r41
            goto L39c
        L472:
            r46 = r0
            r33 = r5
            r41 = r6
            r30 = r11
            r14 = 8
            if (r9 != r14) goto L47f
            goto L489
        L47f:
            r3 = r13
            goto L49a
        L481:
            r46 = r0
            r33 = r5
            r41 = r6
            r30 = r11
        L489:
            if (r3 == r12) goto L47f
            int r3 = r3 + 1
            r0 = r46
            r10 = r26
            r11 = r30
            r5 = r33
            r6 = r41
            r9 = 1
            goto L384
        L49a:
            r5 = 0
            goto L525
        L49d:
            r46 = r0
            r33 = r5
            r41 = r6
            ii1 r10 = (defpackage.ii1) r10     // Catch: java.lang.Throwable -> L41a
            java.lang.Object r0 = r2.get(r10)     // Catch: java.lang.Throwable -> L41a
            im6 r5 = r10.L     // Catch: java.lang.Throwable -> L41a
            if (r5 != 0) goto L4af
            r5 = r28
        L4af:
            hi1 r6 = r10.i()     // Catch: java.lang.Throwable -> L41a
            java.lang.Object r6 = r6.f     // Catch: java.lang.Throwable -> L41a
            boolean r0 = r5.i(r6, r0)     // Catch: java.lang.Throwable -> L41a
            if (r0 != 0) goto L518
            java.lang.Object r0 = r7.g(r10)     // Catch: java.lang.Throwable -> L41a
            if (r0 == 0) goto L515
            boolean r5 = r0 instanceof defpackage.ka4     // Catch: java.lang.Throwable -> L41a
            if (r5 == 0) goto L510
            ka4 r0 = (defpackage.ka4) r0     // Catch: java.lang.Throwable -> L41a
            java.lang.Object[] r5 = r0.b     // Catch: java.lang.Throwable -> L41a
            long[] r0 = r0.a     // Catch: java.lang.Throwable -> L41a
            int r6 = r0.length     // Catch: java.lang.Throwable -> L41a
            r25 = 2
            int r6 = r6 + (-2)
            if (r6 < 0) goto L515
            r9 = r3
            r3 = 0
        L4d4:
            r10 = r0[r3]     // Catch: java.lang.Throwable -> L41a
            long r12 = ~r10     // Catch: java.lang.Throwable -> L41a
            long r12 = r12 << r20
            long r12 = r12 & r10
            long r12 = r12 & r21
            int r12 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r12 == 0) goto L509
            int r12 = r3 - r6
            int r12 = ~r12     // Catch: java.lang.Throwable -> L41a
            int r12 = r12 >>> 31
            r23 = 8
            int r13 = 8 - r12
            r11 = r10
            r10 = 0
        L4eb:
            if (r10 >= r13) goto L502
            long r14 = r11 & r18
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L4fc
            int r9 = r3 << 3
            int r9 = r9 + r10
            r9 = r5[r9]     // Catch: java.lang.Throwable -> L41a
            r8.a(r9)     // Catch: java.lang.Throwable -> L41a
            r9 = 1
        L4fc:
            r14 = 8
            long r11 = r11 >> r14
            int r10 = r10 + 1
            goto L4eb
        L502:
            r14 = 8
            if (r13 != r14) goto L507
            goto L509
        L507:
            r0 = r9
            goto L516
        L509:
            if (r3 == r6) goto L50e
            int r3 = r3 + 1
            goto L4d4
        L50e:
            r3 = r9
            goto L515
        L510:
            r8.a(r0)     // Catch: java.lang.Throwable -> L41a
            r0 = 1
            goto L516
        L515:
            r0 = r3
        L516:
            r3 = r0
            goto L49a
        L518:
            r4.b(r10)     // Catch: java.lang.Throwable -> L41a
            goto L49a
        L51d:
            r46 = r0
            r33 = r5
            r41 = r6
            goto L49a
        L525:
            r1.j = r5
        L527:
            r0 = r3
            r3 = r33
            goto L536
        L52b:
            r1.j = r5
            throw r0
        L52e:
            r41 = r6
        L530:
            r46 = r0
            r33 = r5
            r5 = 0
            goto L527
        L536:
            java.lang.Object r3 = r7.g(r3)
            if (r3 == 0) goto L589
            boolean r6 = r3 instanceof defpackage.ka4
            if (r6 == 0) goto L585
            ka4 r3 = (defpackage.ka4) r3
            java.lang.Object[] r6 = r3.b
            long[] r3 = r3.a
            int r9 = r3.length
            r25 = 2
            int r9 = r9 + (-2)
            if (r9 < 0) goto L589
            r10 = r5
        L54e:
            r11 = r3[r10]
            long r13 = ~r11
            long r13 = r13 << r20
            long r13 = r13 & r11
            long r13 = r13 & r21
            int r13 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r13 == 0) goto L580
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            r23 = 8
            int r13 = 8 - r13
            r14 = r11
            r11 = r5
        L565:
            if (r11 >= r13) goto L57c
            long r26 = r14 & r18
            int r12 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r12 >= 0) goto L576
            int r0 = r10 << 3
            int r0 = r0 + r11
            r0 = r6[r0]
            r8.a(r0)
            r0 = 1
        L576:
            r12 = 8
            long r14 = r14 >> r12
            int r11 = r11 + 1
            goto L565
        L57c:
            r12 = 8
            if (r13 != r12) goto L589
        L580:
            if (r10 == r9) goto L589
            int r10 = r10 + 1
            goto L54e
        L585:
            r8.a(r3)
            r0 = 1
        L589:
            r3 = r0
        L58a:
            r0 = r46
            goto L33f
        L58e:
            r12 = r3
            goto L329
        L591:
            boolean r0 = r1.j
            if (r0 != 0) goto L68d
            int r0 = r4.L
            if (r0 == 0) goto L68d
            java.lang.Object[] r2 = r4.A
            r3 = r5
        L59c:
            if (r3 >= r0) goto L688
            r6 = r2[r3]
            ii1 r6 = (defpackage.ii1) r6
            vl6 r8 = defpackage.bm6.j()
            long r8 = r8.g()
            int r8 = java.lang.Long.hashCode(r8)
            java.lang.Object r9 = r7.g(r6)
            if (r9 == 0) goto L672
            boolean r10 = r9 instanceof defpackage.ka4
            ja4 r11 = r1.f
            if (r10 == 0) goto L652
            ka4 r9 = (defpackage.ka4) r9
            java.lang.Object[] r10 = r9.b
            long[] r9 = r9.a
            int r13 = r9.length
            r25 = 2
            int r13 = r13 + (-2)
            if (r13 < 0) goto L648
            r14 = r5
            r46 = r6
        L5ca:
            r5 = r9[r14]
            r15 = r2
            r24 = r3
            long r2 = ~r5
            long r2 = r2 << r20
            long r2 = r2 & r5
            long r2 = r2 & r21
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto L632
            int r2 = r14 - r13
            int r2 = ~r2
            int r2 = r2 >>> 31
            r23 = 8
            int r2 = 8 - r2
            r3 = 0
        L5e3:
            if (r3 >= r2) goto L627
            long r28 = r5 & r18
            int r26 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r26 >= 0) goto L613
            int r26 = r14 << 3
            int r26 = r26 + r3
            r28 = r0
            r0 = r10[r26]
            java.lang.Object r26 = r11.g(r0)
            y94 r26 = (defpackage.y94) r26
            r29 = r3
            if (r26 != 0) goto L60a
            y94 r3 = new y94
            r3.<init>()
            r11.m(r0, r3)
        L605:
            r26 = r4
            r4 = r46
            goto L60d
        L60a:
            r3 = r26
            goto L605
        L60d:
            r1.b(r4, r8, r0, r3)
        L610:
            r3 = 8
            goto L61c
        L613:
            r28 = r0
            r29 = r3
            r26 = r4
            r4 = r46
            goto L610
        L61c:
            long r5 = r5 >> r3
            int r0 = r29 + 1
            r3 = r0
            r46 = r4
            r4 = r26
            r0 = r28
            goto L5e3
        L627:
            r28 = r0
            r26 = r4
            r3 = 8
            r4 = r46
            if (r2 != r3) goto L67d
            goto L63a
        L632:
            r28 = r0
            r26 = r4
            r3 = 8
            r4 = r46
        L63a:
            if (r14 == r13) goto L67d
            int r14 = r14 + 1
            r46 = r4
            r2 = r15
            r3 = r24
            r4 = r26
            r0 = r28
            goto L5ca
        L648:
            r28 = r0
            r15 = r2
            r24 = r3
            r26 = r4
            r3 = 8
            goto L67d
        L652:
            r28 = r0
            r15 = r2
            r24 = r3
            r26 = r4
            r4 = r6
            r3 = 8
            r25 = 2
            java.lang.Object r0 = r11.g(r9)
            y94 r0 = (defpackage.y94) r0
            if (r0 != 0) goto L66e
            y94 r0 = new y94
            r0.<init>()
            r11.m(r9, r0)
        L66e:
            r1.b(r4, r8, r9, r0)
            goto L67d
        L672:
            r28 = r0
            r15 = r2
            r24 = r3
            r26 = r4
            r3 = 8
            r25 = 2
        L67d:
            int r0 = r24 + 1
            r3 = r0
            r2 = r15
            r4 = r26
            r0 = r28
            r5 = 0
            goto L59c
        L688:
            r26 = r4
            r26.g()
        L68d:
            return r12
    }

    public final void b(java.lang.Object r21, int r22, java.lang.Object r23, defpackage.y94 r24) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.k
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.b
            r7[r4] = r1
            int[] r3 = r3.c
            r3[r4] = r2
            boolean r3 = r1 instanceof defpackage.ii1
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            ii1 r2 = (defpackage.ii1) r2
            hi1 r2 = r2.i()
            java.util.HashMap r3 = r0.m
            java.lang.Object r7 = r2.f
            r3.put(r1, r7)
            y94 r2 = r2.e
            ja4 r3 = r0.l
            defpackage.mp2.W(r3, r1)
            java.lang.Object[] r7 = r2.b
            long[] r2 = r2.a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            eq6 r9 = (defpackage.eq6) r9
            boolean r5 = r9 instanceof defpackage.fq6
            if (r5 == 0) goto L82
            r5 = r9
            fq6 r5 = (defpackage.fq6) r5
            r5.g(r4)
        L82:
            defpackage.mp2.g(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof defpackage.fq6
            if (r2 == 0) goto L9d
            r2 = r1
            fq6 r2 = (defpackage.fq6) r2
            r2.g(r4)
        L9d:
            ja4 r0 = r0.e
            r2 = r23
            defpackage.mp2.g(r0, r1, r2)
        La4:
            return
    }

    public final void c(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            ja4 r0 = r1.e
            defpackage.mp2.U(r0, r3, r2)
            boolean r2 = r3 instanceof defpackage.ii1
            if (r2 == 0) goto L19
            boolean r2 = r0.c(r3)
            if (r2 != 0) goto L19
            ja4 r2 = r1.l
            defpackage.mp2.W(r2, r3)
            java.util.HashMap r1 = r1.m
            r1.remove(r3)
        L19:
            return
    }

    public final void d() {
            r33 = this;
            r0 = r33
            ja4 r1 = r0.f
            long[] r2 = r1.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto Lde
            r5 = 0
        Lc:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto Ld4
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r13 = 0
        L26:
            if (r13 >= r8) goto Lce
            r14 = 255(0xff, double:1.26E-321)
            long r16 = r6 & r14
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto Lb6
            int r16 = r5 << 3
            int r4 = r16 + r13
            r16 = r10
            java.lang.Object[] r10 = r1.b
            r10 = r10[r4]
            r20 = r11
            java.lang.Object[] r11 = r1.c
            r11 = r11[r4]
            y94 r11 = (defpackage.y94) r11
            r10.getClass()
            r12 = r10
            aq4 r12 = (defpackage.aq4) r12
            boolean r12 = r12.r()
            if (r12 != 0) goto La8
            r22 = r14
            java.lang.Object[] r14 = r11.b
            int[] r15 = r11.c
            long[] r11 = r11.a
            r24 = r9
            int r9 = r11.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto La8
            r25 = r2
            r26 = r6
            r2 = 0
        L64:
            r6 = r11[r2]
            r29 = r11
            r28 = r12
            long r11 = ~r6
            long r11 = r11 << r16
            long r11 = r11 & r6
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L9d
            int r11 = r2 - r9
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L7c:
            if (r12 >= r11) goto L99
            long r30 = r6 & r22
            int r30 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r30 >= 0) goto L92
            int r30 = r2 << 3
            int r30 = r30 + r12
            r31 = r6
            r6 = r14[r30]
            r7 = r15[r30]
            r0.c(r10, r6)
            goto L94
        L92:
            r31 = r6
        L94:
            long r6 = r31 >> r24
            int r12 = r12 + 1
            goto L7c
        L99:
            r6 = r24
            if (r11 != r6) goto Lae
        L9d:
            if (r2 == r9) goto Lae
            int r2 = r2 + 1
            r12 = r28
            r11 = r29
            r24 = 8
            goto L64
        La8:
            r25 = r2
            r26 = r6
            r28 = r12
        Lae:
            if (r28 != 0) goto Lb3
            r1.l(r4)
        Lb3:
            r6 = 8
            goto Lbf
        Lb6:
            r25 = r2
            r26 = r6
            r16 = r10
            r20 = r11
            r6 = r9
        Lbf:
            long r9 = r26 >> r6
            int r13 = r13 + 1
            r11 = r9
            r9 = r6
            r6 = r11
            r10 = r16
            r11 = r20
            r2 = r25
            goto L26
        Lce:
            r25 = r2
            r6 = r9
            if (r8 != r6) goto Lde
            goto Ld6
        Ld4:
            r25 = r2
        Ld6:
            if (r5 == r3) goto Lde
            int r5 = r5 + 1
            r2 = r25
            goto Lc
        Lde:
            return
    }
}
