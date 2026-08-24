package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zf4  reason: default package */
/* loaded from: classes.dex */
public final class zf4 extends defpackage.jg4 {
    public final defpackage.z64 c;
    public final defpackage.zb d;
    public final defpackage.hz3 e;
    public defpackage.eg4 f;
    public defpackage.oy4 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public zf4(defpackage.z64 r3) {
            r2 = this;
            r2.<init>()
            r2.c = r3
            zb r3 = new zb
            r0 = 10
            r1 = 0
            r3.<init>(r1, r0)
            r0 = 2
            long[] r1 = new long[r0]
            r3.L = r1
            r2.d = r3
            hz3 r3 = new hz3
            r3.<init>(r0)
            r2.e = r3
            r3 = 1
            r2.i = r3
            r2.j = r3
            return
    }

    @Override // defpackage.jg4
    public final boolean a(defpackage.hz3 r57, defpackage.jk3 r58, defpackage.yc1 r59, boolean r60) {
            r56 = this;
            r0 = r56
            r1 = r57
            r2 = r58
            r3 = r59
            boolean r4 = super.a(r57, r58, r59, r60)
            z64 r5 = r0.c
            boolean r6 = r5.j0
            r7 = 1
            if (r6 != 0) goto L14
            goto L63
        L14:
            r8 = 0
        L15:
            if (r5 == 0) goto L5f
            boolean r10 = r5 instanceof defpackage.yy4
            r11 = 16
            if (r10 == 0) goto L26
            yy4 r5 = (defpackage.yy4) r5
            eg4 r5 = defpackage.nc1.d0(r5, r11)
            r0.f = r5
            goto L5a
        L26:
            int r10 = r5.L
            r10 = r10 & r11
            if (r10 == 0) goto L5a
            boolean r10 = r5 instanceof defpackage.zg1
            if (r10 == 0) goto L5a
            r10 = r5
            zg1 r10 = (defpackage.zg1) r10
            z64 r10 = r10.l0
            r9 = 0
        L35:
            if (r10 == 0) goto L57
            int r12 = r10.L
            r12 = r12 & r11
            if (r12 == 0) goto L54
            int r9 = r9 + 1
            if (r9 != r7) goto L42
            r5 = r10
            goto L54
        L42:
            if (r8 != 0) goto L4b
            ua4 r8 = new ua4
            z64[] r12 = new defpackage.z64[r11]
            r8.<init>(r12)
        L4b:
            if (r5 == 0) goto L51
            r8.b(r5)
            r5 = 0
        L51:
            r8.b(r10)
        L54:
            z64 r10 = r10.Y
            goto L35
        L57:
            if (r9 != r7) goto L5a
            goto L15
        L5a:
            z64 r5 = defpackage.nc1.A(r8)
            goto L15
        L5f:
            eg4 r5 = r0.f
            if (r5 != 0) goto L64
        L63:
            return r7
        L64:
            int r5 = r1.i()
            r8 = 0
        L69:
            zb r10 = r0.d
            hz3 r11 = r0.e
            if (r8 >= r5) goto L194
            long r12 = r1.e(r8)
            java.lang.Object r14 = r1.j(r8)
            vy4 r14 = (defpackage.vy4) r14
            boolean r10 = r10.k(r12)
            if (r10 == 0) goto L183
            long r9 = r14.g
            long r6 = r14.c
            r17 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r19 = r9 & r17
            r21 = 36028792732385279(0x7fffff007fffff, double:2.848093183464406E-306)
            long r19 = r19 + r21
            r23 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r19 = r19 & r23
            r25 = 0
            int r19 = (r19 > r25 ? 1 : (r19 == r25 ? 0 : -1))
            if (r19 != 0) goto L183
            long r19 = r6 & r17
            long r19 = r19 + r21
            long r19 = r19 & r23
            int r19 = (r19 > r25 ? 1 : (r19 == r25 ? 0 : -1))
            if (r19 != 0) goto L183
            java.util.ArrayList r15 = new java.util.ArrayList
            java.util.List r20 = r14.b()
            r50 = r4
            int r4 = r20.size()
            r15.<init>(r4)
            java.util.List r4 = r14.b()
            r20 = r5
            int r5 = r4.size()
            r51 = r8
            r8 = 0
        Lc4:
            if (r8 >= r5) goto L11e
            java.lang.Object r27 = r4.get(r8)
            r28 = r4
            r4 = r27
            vx2 r4 = (defpackage.vx2) r4
            r52 = r11
            r53 = r12
            long r11 = r4.b
            long r29 = r11 & r17
            long r29 = r29 + r21
            long r29 = r29 & r23
            int r13 = (r29 > r25 ? 1 : (r29 == r25 ? 0 : -1))
            if (r13 != 0) goto L10b
            vx2 r29 = new vx2
            r55 = r14
            long r13 = r4.a
            r27 = r5
            eg4 r5 = r0.f
            r5.getClass()
            r39 = r8
            r8 = 1
            long r32 = r5.R(r2, r11, r8)
            float r5 = r4.c
            long r11 = r4.d
            r34 = r5
            long r4 = r4.e
            r37 = r4
            r35 = r11
            r30 = r13
            r29.<init>(r30, r32, r34, r35, r37)
            r4 = r29
            r15.add(r4)
            goto L111
        L10b:
            r27 = r5
            r39 = r8
            r55 = r14
        L111:
            int r8 = r39 + 1
            r5 = r27
            r4 = r28
            r11 = r52
            r12 = r53
            r14 = r55
            goto Lc4
        L11e:
            r52 = r11
            r53 = r12
            r55 = r14
            eg4 r4 = r0.f
            r4.getClass()
            r8 = 1
            long r38 = r4.R(r2, r9, r8)
            eg4 r4 = r0.f
            r4.getClass()
            long r32 = r4.R(r2, r6, r8)
            long r4 = r14.a
            long r6 = r14.b
            boolean r8 = r14.d
            long r9 = r14.f
            boolean r11 = r14.h
            int r12 = r14.i
            r28 = r4
            long r4 = r14.j
            float r13 = r14.e
            vy4 r27 = new vy4
            float r2 = r14.k
            r43 = r4
            long r4 = r14.l
            r46 = r4
            long r4 = r14.n
            r45 = r2
            r48 = r4
            r30 = r6
            r34 = r8
            r36 = r9
            r40 = r11
            r41 = r12
            r35 = r13
            r42 = r15
            r27.<init>(r28, r30, r32, r34, r35, r36, r38, r40, r41, r42, r43, r45, r46, r48)
            r2 = r27
            vy4 r4 = r14.q
            if (r4 != 0) goto L171
            r4 = r14
        L171:
            r2.q = r4
            vy4 r4 = r14.q
            if (r4 != 0) goto L178
            goto L179
        L178:
            r14 = r4
        L179:
            r2.q = r14
            r6 = r52
            r4 = r53
            r6.f(r4, r2)
            goto L189
        L183:
            r50 = r4
            r20 = r5
            r51 = r8
        L189:
            int r8 = r51 + 1
            r2 = r58
            r5 = r20
            r4 = r50
            r7 = 1
            goto L69
        L194:
            r50 = r4
            r6 = r11
            boolean r2 = r6.d()
            if (r2 == 0) goto L1a8
            r15 = 0
            r10.B = r15
            ua4 r0 = r0.a
            r0.g()
            r16 = 1
            return r16
        L1a8:
            r16 = 1
            int r2 = r10.B
            int r2 = r2 + (-1)
        L1ae:
            r4 = -1
            if (r4 >= r2) goto L1db
            java.lang.Object r5 = r10.L
            long[] r5 = (long[]) r5
            r7 = r5[r2]
            int r5 = r1.c(r7)
            if (r5 < 0) goto L1be
            goto L1d8
        L1be:
            int r5 = r10.B
            if (r2 >= r5) goto L1d8
            int r5 = r5 + (-1)
            r7 = r2
        L1c5:
            if (r7 >= r5) goto L1d3
            java.lang.Object r8 = r10.L
            long[] r8 = (long[]) r8
            int r9 = r7 + 1
            r11 = r8[r9]
            r8[r7] = r11
            r7 = r9
            goto L1c5
        L1d3:
            int r5 = r10.B
            int r5 = r5 + r4
            r10.B = r5
        L1d8:
            int r2 = r2 + (-1)
            goto L1ae
        L1db:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.i()
            r1.<init>(r2)
            int r2 = r6.i()
            r4 = 0
        L1e9:
            if (r4 >= r2) goto L1f5
            java.lang.Object r5 = r6.j(r4)
            r1.add(r5)
            int r4 = r4 + 1
            goto L1e9
        L1f5:
            oy4 r2 = new oy4
            r2.<init>(r1, r3)
            int r4 = r1.size()
            r5 = 0
        L1ff:
            if (r5 >= r4) goto L214
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            vy4 r7 = (defpackage.vy4) r7
            long r7 = r7.a
            boolean r7 = r3.l(r7)
            if (r7 == 0) goto L211
            goto L215
        L211:
            int r5 = r5 + 1
            goto L1ff
        L214:
            r6 = 0
        L215:
            vy4 r6 = (defpackage.vy4) r6
            r1 = 3
            if (r6 == 0) goto L2b0
            boolean r3 = r6.d
            if (r60 != 0) goto L224
            r15 = 0
            r0.i = r15
        L221:
            r16 = 1
            goto L282
        L224:
            r15 = 0
            boolean r4 = r0.i
            if (r4 != 0) goto L221
            if (r3 != 0) goto L22f
            boolean r4 = r6.h
            if (r4 == 0) goto L221
        L22f:
            eg4 r4 = r0.f
            r4.getClass()
            long r4 = r4.L
            long r6 = r6.c
            r8 = 32
            long r9 = r6 >> r8
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r10
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r4 >> r8
            int r7 = (int) r7
            long r4 = r4 & r10
            int r4 = (int) r4
            r5 = 0
            int r8 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r8 >= 0) goto L259
            r19 = 1
            goto L25b
        L259:
            r19 = r15
        L25b:
            float r7 = (float) r7
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 <= 0) goto L262
            r7 = 1
            goto L263
        L262:
            r7 = r15
        L263:
            r7 = r19 | r7
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto L26c
            r19 = 1
            goto L26e
        L26c:
            r19 = r15
        L26e:
            r5 = r7 | r19
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L278
            r19 = 1
            goto L27a
        L278:
            r19 = r15
        L27a:
            r4 = r5 | r19
            r16 = 1
            r4 = r4 ^ 1
            r0.i = r4
        L282:
            boolean r4 = r0.i
            boolean r5 = r0.h
            r6 = 5
            r7 = 4
            if (r4 == r5) goto L29a
            int r8 = r2.f
            if (r8 != r1) goto L28f
            goto L294
        L28f:
            if (r8 != r7) goto L292
            goto L294
        L292:
            if (r8 != r6) goto L29a
        L294:
            if (r4 == 0) goto L297
            r6 = r7
        L297:
            r2.f = r6
            goto L2b3
        L29a:
            int r8 = r2.f
            if (r8 != r7) goto L2a7
            if (r5 == 0) goto L2a7
            boolean r5 = r0.j
            if (r5 != 0) goto L2a7
            r2.f = r1
            goto L2b3
        L2a7:
            if (r8 != r6) goto L2b3
            if (r4 == 0) goto L2b3
            if (r3 == 0) goto L2b3
            r2.f = r1
            goto L2b3
        L2b0:
            r15 = 0
            r16 = 1
        L2b3:
            if (r50 != 0) goto L2ef
            int r3 = r2.f
            if (r3 != r1) goto L2ef
            oy4 r1 = r0.g
            if (r1 == 0) goto L2ef
            java.util.List r1 = r1.a
            int r3 = r1.size()
            java.util.List r4 = r2.a
            int r5 = r4.size()
            if (r3 == r5) goto L2cc
            goto L2ef
        L2cc:
            int r3 = r4.size()
            r5 = r15
        L2d1:
            if (r5 >= r3) goto L2ed
            java.lang.Object r6 = r1.get(r5)
            vy4 r6 = (defpackage.vy4) r6
            java.lang.Object r7 = r4.get(r5)
            vy4 r7 = (defpackage.vy4) r7
            long r8 = r6.c
            long r6 = r7.c
            boolean r6 = defpackage.jk4.c(r8, r6)
            if (r6 != 0) goto L2ea
            goto L2ef
        L2ea:
            int r5 = r5 + 1
            goto L2d1
        L2ed:
            r7 = r15
            goto L2f1
        L2ef:
            r7 = r16
        L2f1:
            r0.g = r2
            return r7
    }

    @Override // defpackage.jg4
    public final void b(defpackage.yc1 r11) {
            r10 = this;
            super.b(r11)
            oy4 r0 = r10.g
            if (r0 != 0) goto L8
            return
        L8:
            boolean r1 = r10.i
            r10.h = r1
            java.util.List r1 = r0.a
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L14:
            if (r4 >= r2) goto L36
            java.lang.Object r5 = r1.get(r4)
            vy4 r5 = (defpackage.vy4) r5
            boolean r6 = r5.d
            long r7 = r5.a
            boolean r5 = r11.l(r7)
            boolean r9 = r10.i
            if (r6 != 0) goto L2a
            if (r5 == 0) goto L2e
        L2a:
            if (r6 != 0) goto L33
            if (r9 != 0) goto L33
        L2e:
            zb r5 = r10.d
            r5.t(r7)
        L33:
            int r4 = r4 + 1
            goto L14
        L36:
            r10.i = r3
            int r11 = r0.f
            r0 = 5
            if (r11 != r0) goto L3e
            r3 = 1
        L3e:
            r10.j = r3
            return
    }

    public final void c() {
            r8 = this;
            ua4 r0 = r8.a
            java.lang.Object[] r1 = r0.A
            int r0 = r0.L
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r0) goto L14
            r4 = r1[r3]
            zf4 r4 = (defpackage.zf4) r4
            r4.c()
            int r3 = r3 + 1
            goto L8
        L14:
            r0 = 0
            z64 r8 = r8.c
            r1 = r0
        L18:
            if (r8 == 0) goto L60
            boolean r3 = r8 instanceof defpackage.yy4
            if (r3 == 0) goto L24
            yy4 r8 = (defpackage.yy4) r8
            r8.I()
            goto L5b
        L24:
            int r3 = r8.L
            r4 = 16
            r3 = r3 & r4
            if (r3 == 0) goto L5b
            boolean r3 = r8 instanceof defpackage.zg1
            if (r3 == 0) goto L5b
            r3 = r8
            zg1 r3 = (defpackage.zg1) r3
            z64 r3 = r3.l0
            r5 = r2
        L35:
            r6 = 1
            if (r3 == 0) goto L58
            int r7 = r3.L
            r7 = r7 & r4
            if (r7 == 0) goto L55
            int r5 = r5 + 1
            if (r5 != r6) goto L43
            r8 = r3
            goto L55
        L43:
            if (r1 != 0) goto L4c
            ua4 r1 = new ua4
            z64[] r6 = new defpackage.z64[r4]
            r1.<init>(r6)
        L4c:
            if (r8 == 0) goto L52
            r1.b(r8)
            r8 = r0
        L52:
            r1.b(r3)
        L55:
            z64 r3 = r3.Y
            goto L35
        L58:
            if (r5 != r6) goto L5b
            goto L18
        L5b:
            z64 r8 = defpackage.nc1.A(r1)
            goto L18
        L60:
            return
    }

    public final boolean d(defpackage.yc1 r15) {
            r14 = this;
            hz3 r0 = r14.e
            boolean r1 = r0.d()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto Lc
            goto L95
        Lc:
            z64 r1 = r14.c
            boolean r4 = r1.j0
            if (r4 != 0) goto L14
            goto L95
        L14:
            eg4 r4 = r1.d0
            if (r4 == 0) goto L21
            sm3 r4 = r4.k0
            if (r4 == 0) goto L21
            boolean r4 = r4.I()
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 != 0) goto L26
            goto L95
        L26:
            oy4 r4 = r14.g
            r4.getClass()
            eg4 r5 = r14.f
            r5.getClass()
            long r5 = r5.L
            r7 = r1
            r8 = r2
        L34:
            r9 = 1
            if (r7 == 0) goto L7e
            boolean r10 = r7 instanceof defpackage.yy4
            if (r10 == 0) goto L43
            yy4 r7 = (defpackage.yy4) r7
            py4 r9 = defpackage.py4.Final
            r7.w(r4, r9, r5)
            goto L79
        L43:
            int r10 = r7.L
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L79
            boolean r10 = r7 instanceof defpackage.zg1
            if (r10 == 0) goto L79
            r10 = r7
            zg1 r10 = (defpackage.zg1) r10
            z64 r10 = r10.l0
            r12 = r3
        L54:
            if (r10 == 0) goto L76
            int r13 = r10.L
            r13 = r13 & r11
            if (r13 == 0) goto L73
            int r12 = r12 + 1
            if (r12 != r9) goto L61
            r7 = r10
            goto L73
        L61:
            if (r8 != 0) goto L6a
            ua4 r8 = new ua4
            z64[] r13 = new defpackage.z64[r11]
            r8.<init>(r13)
        L6a:
            if (r7 == 0) goto L70
            r8.b(r7)
            r7 = r2
        L70:
            r8.b(r10)
        L73:
            z64 r10 = r10.Y
            goto L54
        L76:
            if (r12 != r9) goto L79
            goto L34
        L79:
            z64 r7 = defpackage.nc1.A(r8)
            goto L34
        L7e:
            boolean r1 = r1.j0
            if (r1 == 0) goto L94
            ua4 r1 = r14.a
            java.lang.Object[] r4 = r1.A
            int r1 = r1.L
        L88:
            if (r3 >= r1) goto L94
            r5 = r4[r3]
            zf4 r5 = (defpackage.zf4) r5
            r5.d(r15)
            int r3 = r3 + 1
            goto L88
        L94:
            r3 = r9
        L95:
            r14.b(r15)
            r0.a()
            r14.f = r2
            return r3
    }

    public final boolean e(defpackage.yc1 r14, boolean r15) {
            r13 = this;
            hz3 r0 = r13.e
            boolean r0 = r0.d()
            r1 = 0
            if (r0 == 0) goto La
            goto L21
        La:
            z64 r0 = r13.c
            boolean r2 = r0.j0
            if (r2 != 0) goto L11
            goto L21
        L11:
            eg4 r2 = r0.d0
            if (r2 == 0) goto L1e
            sm3 r2 = r2.k0
            if (r2 == 0) goto L1e
            boolean r2 = r2.I()
            goto L1f
        L1e:
            r2 = r1
        L1f:
            if (r2 != 0) goto L22
        L21:
            return r1
        L22:
            oy4 r2 = r13.g
            r2.getClass()
            eg4 r3 = r13.f
            r3.getClass()
            long r3 = r3.L
            r5 = 0
            r6 = r0
            r7 = r5
        L31:
            r8 = 16
            r9 = 1
            if (r6 == 0) goto L7b
            boolean r10 = r6 instanceof defpackage.yy4
            if (r10 == 0) goto L42
            yy4 r6 = (defpackage.yy4) r6
            py4 r8 = defpackage.py4.Initial
            r6.w(r2, r8, r3)
            goto L76
        L42:
            int r10 = r6.L
            r10 = r10 & r8
            if (r10 == 0) goto L76
            boolean r10 = r6 instanceof defpackage.zg1
            if (r10 == 0) goto L76
            r10 = r6
            zg1 r10 = (defpackage.zg1) r10
            z64 r10 = r10.l0
            r11 = r1
        L51:
            if (r10 == 0) goto L73
            int r12 = r10.L
            r12 = r12 & r8
            if (r12 == 0) goto L70
            int r11 = r11 + 1
            if (r11 != r9) goto L5e
            r6 = r10
            goto L70
        L5e:
            if (r7 != 0) goto L67
            ua4 r7 = new ua4
            z64[] r12 = new defpackage.z64[r8]
            r7.<init>(r12)
        L67:
            if (r6 == 0) goto L6d
            r7.b(r6)
            r6 = r5
        L6d:
            r7.b(r10)
        L70:
            z64 r10 = r10.Y
            goto L51
        L73:
            if (r11 != r9) goto L76
            goto L31
        L76:
            z64 r6 = defpackage.nc1.A(r7)
            goto L31
        L7b:
            boolean r6 = r0.j0
            if (r6 == 0) goto L97
            ua4 r6 = r13.a
            java.lang.Object[] r7 = r6.A
            int r6 = r6.L
            r10 = r1
        L86:
            if (r10 >= r6) goto L97
            r11 = r7[r10]
            zf4 r11 = (defpackage.zf4) r11
            eg4 r12 = r13.f
            r12.getClass()
            r11.e(r14, r15)
            int r10 = r10 + 1
            goto L86
        L97:
            boolean r13 = r0.j0
            if (r13 == 0) goto Le3
            r13 = r5
        L9c:
            if (r0 == 0) goto Le3
            boolean r14 = r0 instanceof defpackage.yy4
            if (r14 == 0) goto Laa
            yy4 r0 = (defpackage.yy4) r0
            py4 r14 = defpackage.py4.Main
            r0.w(r2, r14, r3)
            goto Lde
        Laa:
            int r14 = r0.L
            r14 = r14 & r8
            if (r14 == 0) goto Lde
            boolean r14 = r0 instanceof defpackage.zg1
            if (r14 == 0) goto Lde
            r14 = r0
            zg1 r14 = (defpackage.zg1) r14
            z64 r14 = r14.l0
            r15 = r1
        Lb9:
            if (r14 == 0) goto Ldb
            int r6 = r14.L
            r6 = r6 & r8
            if (r6 == 0) goto Ld8
            int r15 = r15 + 1
            if (r15 != r9) goto Lc6
            r0 = r14
            goto Ld8
        Lc6:
            if (r13 != 0) goto Lcf
            ua4 r13 = new ua4
            z64[] r6 = new defpackage.z64[r8]
            r13.<init>(r6)
        Lcf:
            if (r0 == 0) goto Ld5
            r13.b(r0)
            r0 = r5
        Ld5:
            r13.b(r14)
        Ld8:
            z64 r14 = r14.Y
            goto Lb9
        Ldb:
            if (r15 != r9) goto Lde
            goto L9c
        Lde:
            z64 r0 = defpackage.nc1.A(r13)
            goto L9c
        Le3:
            return r9
    }

    public final void f(long r4, defpackage.ca4 r6) {
            r3 = this;
            zb r0 = r3.d
            boolean r1 = r0.k(r4)
            if (r1 == 0) goto L17
            int r1 = r6.g(r3)
            if (r1 < 0) goto Lf
            goto L17
        Lf:
            r0.t(r4)
            hz3 r0 = r3.e
            r0.g(r4)
        L17:
            ua4 r3 = r3.a
            java.lang.Object[] r0 = r3.A
            int r3 = r3.L
            r1 = 0
        L1e:
            if (r1 >= r3) goto L2a
            r2 = r0[r1]
            zf4 r2 = (defpackage.zf4) r2
            r2.f(r4, r6)
            int r1 = r1 + 1
            goto L1e
        L2a:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Node(modifierNode="
            r0.<init>(r1)
            z64 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", children="
            r0.append(r1)
            ua4 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", pointerIds="
            r0.append(r1)
            zb r2 = r2.d
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
