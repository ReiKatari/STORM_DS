package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rf5  reason: default package */
/* loaded from: classes.dex */
public final class rf5 {
    public final defpackage.te a;
    public final defpackage.ei b;
    public final defpackage.v57 c;
    public final defpackage.ca4 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public defpackage.fe h;
    public long i;
    public final defpackage.pj j;
    public final defpackage.ia4 k;

    public rf5(defpackage.te r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            ei r3 = new ei
            r0 = 6
            r3.<init>(r0)
            r0 = 192(0xc0, float:2.69E-43)
            long[] r1 = new long[r0]
            r3.L = r1
            long[] r0 = new long[r0]
            r3.R = r0
            r2.b = r3
            v57 r3 = new v57
            r3.<init>()
            r2.c = r3
            ca4 r3 = new ca4
            r3.<init>()
            r2.d = r3
            r0 = -1
            r2.i = r0
            pj r3 = new pj
            r0 = 16
            r3.<init>(r2, r0)
            r2.j = r3
            ia4 r3 = new ia4
            r3.<init>()
            r2.k = r3
            return
    }

    public static boolean c(defpackage.eg4 r0) {
            yp4 r0 = r0.J0
            if (r0 == 0) goto L12
            xt2 r0 = (defpackage.xt2) r0
            float[] r0 = r0.b()
            boolean r0 = defpackage.nj2.w(r0)
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static long e(defpackage.sm3 r5) {
            if0 r5 = r5.B0
            java.lang.Object r0 = r5.e
            eg4 r0 = (defpackage.eg4) r0
            java.lang.Object r5 = r5.d
            y53 r5 = (defpackage.y53) r5
            r1 = 0
        Lc:
            if (r5 == 0) goto L25
            if (r5 == r0) goto L25
            boolean r3 = c(r5)
            if (r3 == 0) goto L1c
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            return r0
        L1c:
            long r3 = r5.x0
            long r1 = defpackage.i93.c(r1, r3)
            eg4 r5 = r5.o0
            goto Lc
        L25:
            return r1
    }

    public static void h(defpackage.sm3 r5) {
            boolean r0 = r5.L
            if (r0 == 0) goto L40
            if0 r0 = r5.B0
            java.lang.Object r0 = r0.e
            eg4 r0 = (defpackage.eg4) r0
            boolean r0 = c(r0)
            if (r0 != 0) goto L40
            r0 = 0
            r5.L = r0
            boolean r1 = r5.X
            if (r1 == 0) goto L1f
            long r1 = e(r5)
            r5.R = r1
            r5.X = r0
        L1f:
            long r1 = r5.R
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r1 = defpackage.i93.a(r1, r3)
            if (r1 != 0) goto L40
            ua4 r5 = r5.z()
            java.lang.Object[] r1 = r5.A
            int r5 = r5.L
        L34:
            if (r0 >= r5) goto L40
            r2 = r1[r0]
            sm3 r2 = (defpackage.sm3) r2
            h(r2)
            int r0 = r0 + 1
            goto L34
        L40:
            return
    }

    public final void a() {
            r32 = this;
            r0 = r32
            fe r1 = r0.h
            if (r1 == 0) goto Le
            te r2 = r0.a
            r2.removeCallbacks(r1)
            r1 = 0
            r0.h = r1
        Le:
            long r9 = java.lang.System.currentTimeMillis()
            boolean r1 = r0.e
            r2 = 1
            r11 = 0
            if (r1 != 0) goto L1f
            boolean r3 = r0.f
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r12 = r11
            goto L20
        L1f:
            r12 = r2
        L20:
            ei r15 = r0.b
            r3 = r2
            v57 r2 = r0.c
            if (r1 == 0) goto Le6
            r0.e = r11
            ca4 r1 = r0.d
            java.lang.Object[] r4 = r1.a
            int r1 = r1.b
            r5 = r11
        L30:
            if (r5 >= r1) goto L3c
            r6 = r4[r5]
            on2 r6 = (defpackage.on2) r6
            r6.c()
            int r5 = r5 + 1
            goto L30
        L3c:
            java.lang.Object r1 = r15.L
            long[] r1 = (long[]) r1
            int r4 = r15.B
            r5 = r11
        L43:
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r5 >= r6) goto Lc5
            if (r5 >= r4) goto Lc5
            int r6 = r5 + 2
            r6 = r1[r6]
            r8 = 60
            r16 = r3
            r17 = r4
            long r3 = r6 >> r8
            int r3 = (int) r3
            r3 = r3 & 1
            if (r3 == 0) goto Lb7
            r3 = r1[r5]
            int r8 = r5 + 1
            r28 = 0
            r13 = r1[r8]
            int r6 = (int) r6
            r7 = 33554431(0x1ffffff, float:9.403954E-38)
            r6 = r6 & r7
            p94 r7 = r2.a
            java.lang.Object r6 = r7.b(r6)
            u57 r6 = (defpackage.u57) r6
        L70:
            if (r6 == 0) goto Lb4
            u57 r7 = r6.d
            r30 = r12
            long r11 = r6.g
            long r18 = r9 - r11
            int r8 = (r18 > r28 ? 1 : (r18 == r28 ? 0 : -1))
            if (r8 >= 0) goto L87
            r18 = -9223372036854775808
            int r8 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r8 != 0) goto L85
            goto L87
        L85:
            r8 = 0
            goto L89
        L87:
            r8 = r16
        L89:
            r6.e = r3
            r6.f = r13
            if (r8 == 0) goto La7
            r6.g = r9
            long r11 = r2.d
            r19 = r3
            long r3 = r2.e
            float[] r8 = r2.g
            r25 = r3
            r18 = r6
            r27 = r8
            r23 = r11
            r21 = r13
            r18.a(r19, r21, r23, r25, r27)
            goto Lab
        La7:
            r19 = r3
            r21 = r13
        Lab:
            r6 = r7
            r3 = r19
            r13 = r21
            r12 = r30
            r11 = 0
            goto L70
        Lb4:
            r30 = r12
            goto Lba
        Lb7:
            r28 = 0
            goto Lb4
        Lba:
            int r5 = r5 + 3
            r3 = r16
            r4 = r17
            r12 = r30
            r11 = 0
            goto L43
        Lc5:
            r30 = r12
            r28 = 0
            java.lang.Object r1 = r15.L
            long[] r1 = (long[]) r1
            int r3 = r15.B
            r4 = 0
        Ld0:
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r4 >= r5) goto Lea
            if (r4 >= r3) goto Lea
            int r5 = r4 + 2
            r6 = r1[r5]
            r11 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r6 = r6 & r11
            r1[r5] = r6
            int r4 = r4 + 3
            goto Ld0
        Le6:
            r30 = r12
            r28 = 0
        Lea:
            boolean r1 = r0.f
            r16 = 7
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r1 == 0) goto L175
            r1 = 0
            r0.f = r1
            long r4 = r2.d
            long r6 = r2.e
            float[] r8 = r2.g
            p94 r1 = r2.a
            r19 = 128(0x80, double:6.3E-322)
            java.lang.Object[] r11 = r1.c
            long[] r1 = r1.a
            int r12 = r1.length
            int r12 = r12 + (-2)
            if (r12 < 0) goto L170
            r13 = 0
            r14 = 8
            r21 = 255(0xff, double:1.26E-321)
        L110:
            r23 = r4
            r3 = r1[r13]
            r5 = r14
            r25 = r15
            long r14 = ~r3
            long r14 = r14 << r16
            long r14 = r14 & r3
            long r14 = r14 & r17
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 == 0) goto L161
            int r14 = r13 - r12
            int r14 = ~r14
            int r14 = r14 >>> 31
            int r14 = 8 - r14
            r26 = r3
            r15 = 0
        L12b:
            if (r15 >= r14) goto L159
            long r3 = r26 & r21
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 >= 0) goto L14a
            int r3 = r13 << 3
            int r3 = r3 + r15
            r3 = r11[r3]
            u57 r3 = (defpackage.u57) r3
        L13a:
            if (r3 == 0) goto L14a
            r31 = r1
            r1 = r5
            r4 = r23
            r2.a(r3, r4, r6, r8, r9)
            u57 r3 = r3.d
            r5 = r1
            r1 = r31
            goto L13a
        L14a:
            r31 = r1
            r1 = r5
            r4 = r23
            long r26 = r26 >> r1
            int r15 = r15 + 1
            r23 = r4
            r5 = r1
            r1 = r31
            goto L12b
        L159:
            r31 = r1
            r1 = r5
            r4 = r23
            if (r14 != r1) goto L17d
            goto L166
        L161:
            r31 = r1
            r1 = r5
            r4 = r23
        L166:
            if (r13 == r12) goto L17d
            int r13 = r13 + 1
            r14 = r1
            r15 = r25
            r1 = r31
            goto L110
        L170:
            r25 = r15
            r1 = 8
            goto L17b
        L175:
            r25 = r15
            r1 = 8
            r19 = 128(0x80, double:6.3E-322)
        L17b:
            r21 = 255(0xff, double:1.26E-321)
        L17d:
            if (r30 == 0) goto L1c8
            long r4 = r2.d
            long r6 = r2.e
            float[] r8 = r2.g
            u57 r3 = r2.b
            if (r3 == 0) goto L1c8
        L189:
            if (r3 == 0) goto L1c8
            rz r11 = r3.b
            sm3 r11 = defpackage.nc1.f0(r11)
            zp4 r12 = defpackage.vm3.a(r11)
            te r12 = (defpackage.te) r12
            rf5 r12 = r12.getRectManager()
            long r12 = r12.b(r11)
            r3.e = r12
            r23 = 32
            long r14 = r12 >> r23
            int r14 = (int) r14
            wm3 r11 = r11.C0
            d34 r11 = r11.p
            int r15 = r11.A
            int r15 = r15 + r14
            r26 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r26
            int r12 = (int) r12
            int r11 = r11.B
            int r11 = r11 + r12
            long r12 = (long) r15
            long r12 = r12 << r23
            long r14 = (long) r11
            long r14 = r14 & r26
            long r11 = r12 | r14
            r3.f = r11
            r2.a(r3, r4, r6, r8, r9)
            u57 r3 = r3.d
            goto L189
        L1c8:
            boolean r3 = r0.g
            if (r3 == 0) goto L211
            r3 = 0
            r0.g = r3
            r4 = r25
            java.lang.Object r5 = r4.L
            long[] r5 = (long[]) r5
            int r6 = r4.B
            java.lang.Object r7 = r4.R
            long[] r7 = (long[]) r7
            r8 = r3
            r11 = r8
        L1dd:
            int r12 = r5.length
            int r12 = r12 + (-2)
            if (r8 >= r12) goto L20a
            int r12 = r7.length
            int r12 = r12 + (-2)
            if (r11 >= r12) goto L20a
            if (r8 >= r6) goto L20a
            int r12 = r8 + 2
            r13 = r5[r12]
            long r23 = defpackage.qf5.a
            int r13 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r13 == 0) goto L207
            r13 = r5[r8]
            r7[r11] = r13
            int r13 = r11 + 1
            int r14 = r8 + 1
            r14 = r5[r14]
            r7[r13] = r14
            int r13 = r11 + 2
            r14 = r5[r12]
            r7[r13] = r14
            int r11 = r11 + 3
        L207:
            int r8 = r8 + 3
            goto L1dd
        L20a:
            r4.B = r11
            r4.L = r7
            r4.R = r5
            goto L212
        L211:
            r3 = 0
        L212:
            long r4 = r2.c
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L219
            goto L266
        L219:
            p94 r4 = r2.a
            java.lang.Object[] r5 = r4.c
            long[] r4 = r4.a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L259
            r7 = r3
        L225:
            r8 = r4[r7]
            long r10 = ~r8
            long r10 = r10 << r16
            long r10 = r10 & r8
            long r10 = r10 & r17
            int r10 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r10 == 0) goto L254
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = r8
            r8 = r3
        L23a:
            if (r8 >= r10) goto L252
            long r13 = r11 & r21
            int r9 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r9 >= 0) goto L24e
            int r9 = r7 << 3
            int r9 = r9 + r8
            r9 = r5[r9]
            u57 r9 = (defpackage.u57) r9
        L249:
            if (r9 == 0) goto L24e
            u57 r9 = r9.d
            goto L249
        L24e:
            long r11 = r11 >> r1
            int r8 = r8 + 1
            goto L23a
        L252:
            if (r10 != r1) goto L259
        L254:
            if (r7 == r6) goto L259
            int r7 = r7 + 1
            goto L225
        L259:
            u57 r1 = r2.b
            if (r1 == 0) goto L262
        L25d:
            if (r1 == 0) goto L262
            u57 r1 = r1.d
            goto L25d
        L262:
            r3 = -1
            r2.c = r3
        L266:
            long r1 = r2.c
            int r1 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r1 <= 0) goto L26f
            r0.i()
        L26f:
            return
    }

    public final long b(defpackage.sm3 r9) {
            r8 = this;
            int r9 = r9.B
            r0 = 33554431(0x1ffffff, float:9.403954E-38)
            r9 = r9 & r0
            ei r8 = r8.b
            java.lang.Object r1 = r8.L
            long[] r1 = (long[]) r1
            int r8 = r8.B
            r2 = 0
        Lf:
            int r3 = r1.length
            int r3 = r3 + (-2)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 >= r3) goto L29
            if (r2 >= r8) goto L29
            int r3 = r2 + 2
            r6 = r1[r3]
            int r3 = (int) r6
            r3 = r3 & r0
            if (r3 != r9) goto L26
            r8 = r1[r2]
            goto L2a
        L26:
            int r2 = r2 + 3
            goto Lf
        L29:
            r8 = r4
        L2a:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L34
            r8 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            return r8
        L34:
            r0 = 32
            long r1 = r8 >> r0
            int r1 = (int) r1
            int r8 = (int) r8
            long r1 = (long) r1
            long r0 = r1 << r0
            long r8 = (long) r8
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r2
            long r8 = r8 | r0
            return r8
    }

    public final void d(defpackage.sm3 r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = 1
            r1.L = r2
            if0 r3 = r1.B0
            java.lang.Object r4 = r3.e
            eg4 r4 = (defpackage.eg4) r4
            wm3 r5 = r1.C0
            d34 r5 = r5.p
            int r6 = r5.d0()
            int r5 = r5.Z()
            float r6 = (float) r6
            float r5 = (float) r5
            ia4 r7 = r0.k
            r8 = 0
            r7.a = r8
            r7.b = r8
            r7.c = r6
            r7.d = r5
        L26:
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 32
            if (r4 == 0) goto L96
            sm3 r9 = r4.k0
            if0 r10 = r9.B0
            java.lang.Object r10 = r10.e
            eg4 r10 = (defpackage.eg4) r10
            if (r4 != r10) goto L66
            boolean r10 = r9.L
            if (r10 != 0) goto L66
            long r9 = r0.b(r9)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r11 = defpackage.i93.a(r9, r11)
            if (r11 != 0) goto L66
            long r11 = r9 >> r8
            int r4 = (int) r11
            float r4 = (float) r4
            long r9 = r9 & r5
            int r9 = (int) r9
            float r9 = (float) r9
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r10 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r9)
            long r12 = (long) r4
            long r9 = r10 << r8
            long r11 = r12 & r5
            long r9 = r9 | r11
            r7.c(r9)
            goto L96
        L66:
            yp4 r9 = r4.J0
            if (r9 == 0) goto L79
            xt2 r9 = (defpackage.xt2) r9
            float[] r9 = r9.b()
            boolean r10 = defpackage.nj2.w(r9)
            if (r10 != 0) goto L79
            defpackage.v24.c(r9, r7)
        L79:
            long r9 = r4.x0
            long r11 = r9 >> r8
            int r11 = (int) r11
            float r11 = (float) r11
            long r9 = r9 & r5
            int r9 = (int) r9
            float r9 = (float) r9
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r12 = (long) r9
            long r8 = r10 << r8
            long r5 = r5 & r12
            long r5 = r5 | r8
            r7.c(r5)
            eg4 r4 = r4.o0
            goto L26
        L96:
            float r4 = r7.a
            int r11 = (int) r4
            float r4 = r7.b
            int r12 = (int) r4
            float r4 = r7.c
            int r13 = (int) r4
            float r4 = r7.d
            int r14 = (int) r4
            int r10 = r1.B
            boolean r4 = r1.Z
            r1.Z = r2
            ei r9 = r0.b
            if (r4 == 0) goto Lfa
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            r15 = r10 & r4
            r16 = r4
            java.lang.Object r4 = r9.L
            long[] r4 = (long[]) r4
            r17 = r5
            int r5 = r9.B
            r19 = r8
            r6 = 0
        Lbe:
            int r8 = r4.length
            int r8 = r8 + (-2)
            if (r6 >= r8) goto Lfa
            if (r6 >= r5) goto Lfa
            int r8 = r6 + 2
            r20 = r8
            r7 = r4[r20]
            r21 = r2
            int r2 = (int) r7
            r2 = r2 & r16
            if (r2 != r15) goto Lf5
            long r2 = (long) r11
            long r2 = r2 << r19
            long r9 = (long) r12
            long r9 = r9 & r17
            long r2 = r2 | r9
            r4[r6] = r2
            int r6 = r6 + 1
            long r2 = (long) r13
            long r2 = r2 << r19
            long r9 = (long) r14
            long r9 = r9 & r17
            long r2 = r2 | r9
            r4[r6] = r2
            r2 = 63
            long r2 = r7 >> r2
            r5 = 1
            long r2 = r2 & r5
            r5 = 60
            long r2 = r2 << r5
            long r2 = r2 | r7
            r4[r20] = r2
        Lf3:
            r2 = 0
            goto L122
        Lf5:
            int r6 = r6 + 3
            r2 = r21
            goto Lbe
        Lfa:
            r21 = r2
            sm3 r2 = r1.v()
            if (r2 == 0) goto L106
            int r2 = r2.B
        L104:
            r15 = r2
            goto L108
        L106:
            r2 = -1
            goto L104
        L108:
            r2 = 1024(0x400, float:1.435E-42)
            boolean r16 = r3.g(r2)
            r2 = 16
            boolean r17 = r3.g(r2)
            v57 r2 = r0.c
            p94 r2 = r2.a
            boolean r18 = r2.a(r10)
            r19 = 512(0x200, float:7.17E-43)
            defpackage.ei.h(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto Lf3
        L122:
            r1.Y = r2
            r3 = r21
            r0.e = r3
            ua4 r1 = r1.z()
            java.lang.Object[] r3 = r1.A
            int r1 = r1.L
            r7 = r2
        L131:
            if (r7 >= r1) goto L143
            r2 = r3[r7]
            sm3 r2 = (defpackage.sm3) r2
            boolean r4 = r2.I()
            if (r4 == 0) goto L140
            r0.d(r2)
        L140:
            int r7 = r7 + 1
            goto L131
        L143:
            return
    }

    public final void f(defpackage.sm3 r34) {
            r33 = this;
            r0 = r33
            r1 = r34
            boolean r2 = r1.I()
            if0 r3 = r1.B0
            if (r2 == 0) goto L236
            boolean r2 = r1.Y
            if (r2 != 0) goto L12
            goto L236
        L12:
            sm3 r2 = r1.v()
            r4 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r6 = 0
            if (r2 == 0) goto L31
            boolean r7 = r2.L
            if (r7 != 0) goto L31
            boolean r7 = r2.X
            if (r7 == 0) goto L2e
            r2.X = r6
            long r7 = e(r2)
            r2.R = r7
        L2e:
            long r7 = r2.R
            goto L37
        L31:
            if (r2 != 0) goto L36
            r7 = 0
            goto L37
        L36:
            r7 = r4
        L37:
            java.lang.Object r9 = r3.e
            eg4 r9 = (defpackage.eg4) r9
            boolean r4 = defpackage.i93.a(r7, r4)
            if (r4 != 0) goto L229
            boolean r4 = c(r9)
            if (r4 != 0) goto L229
            boolean r4 = r1.L
            if (r4 != 0) goto L221
            long r9 = r9.x0
            long r7 = defpackage.i93.c(r7, r9)
            wm3 r4 = r1.C0
            d34 r4 = r4.p
            int r9 = r4.d0()
            int r4 = r4.Z()
            int r11 = r1.B
            boolean r10 = r1.Z
            ei r12 = r0.b
            r13 = 33554431(0x1ffffff, float:9.403954E-38)
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r16 = 32
            if (r10 == 0) goto L1ae
            r17 = -1125899873288193(0xfffc000001ffffff, double:NaN)
            r19 = 1
            r21 = 63
            if (r2 == 0) goto L129
            int r2 = r2.B
            r22 = r4
            r23 = 25
            long r3 = r7 >> r16
            int r3 = (int) r3
            long r7 = r7 & r14
            int r4 = (int) r7
            r7 = r11 & r13
            java.lang.Object r8 = r12.L
            long[] r8 = (long[]) r8
            int r11 = r12.B
            r10 = r6
            r25 = r13
            r24 = 60
        L92:
            int r13 = r8.length
            int r13 = r13 + (-2)
            if (r10 >= r13) goto L126
            if (r10 >= r11) goto L126
            int r13 = r10 + 2
            r26 = r14
            r14 = r8[r13]
            int r13 = (int) r14
            r13 = r13 & r25
            if (r13 != r2) goto L111
            r13 = r8[r10]
            long r5 = r13 >> r16
            int r5 = (int) r5
            int r6 = (int) r13
            int r5 = r5 + r3
            int r6 = r6 + r4
            int r13 = r5 + r9
            int r14 = r6 + r22
            int r10 = r10 + 3
        Lb2:
            int r15 = r8.length
            int r15 = r15 + (-2)
            if (r10 >= r15) goto L111
            if (r10 >= r11) goto L111
            int r15 = r10 + 2
            r28 = r2
            r29 = r3
            r2 = r8[r15]
            r30 = r4
            int r4 = (int) r2
            r4 = r4 & r25
            if (r4 != r7) goto L107
            r31 = r2
            r2 = r8[r10]
            r4 = r8
            long r7 = r2 >> r16
            int r7 = (int) r7
            int r2 = (int) r2
            int r3 = r5 - r7
            int r2 = r6 - r2
            long r7 = (long) r5
            long r7 = r7 << r16
            long r5 = (long) r6
            long r5 = r5 & r26
            long r5 = r5 | r7
            r4[r10] = r5
            int r5 = r10 + 1
            long r6 = (long) r13
            long r6 = r6 << r16
            long r8 = (long) r14
            long r8 = r8 & r26
            long r6 = r6 | r8
            r4[r5] = r6
            long r5 = r31 >> r21
            long r5 = r5 & r19
            long r5 = r5 << r24
            long r5 = r31 | r5
            r4[r15] = r5
            if (r3 != 0) goto Lf7
            if (r2 == 0) goto L126
        Lf7:
            int r10 = r10 + 3
            int r4 = defpackage.qf5.b
            long r4 = r31 & r17
            r6 = r10 & r25
            long r6 = (long) r6
            long r6 = r6 << r23
            long r4 = r4 | r6
            r12.l(r4, r3, r2)
            goto L126
        L107:
            r4 = r8
            int r10 = r10 + 3
            r2 = r28
            r3 = r29
            r4 = r30
            goto Lb2
        L111:
            r28 = r2
            r29 = r3
            r30 = r4
            r4 = r8
            int r10 = r10 + 3
            r8 = r4
            r14 = r26
            r2 = r28
            r3 = r29
            r4 = r30
            r6 = 0
            goto L92
        L126:
            r2 = 0
            goto L22e
        L129:
            r22 = r4
            r25 = r13
            r26 = r14
            r23 = 25
            r24 = 60
            long r2 = r7 >> r16
            int r2 = (int) r2
            long r3 = r7 & r26
            int r3 = (int) r3
            int r9 = r9 + r2
            int r4 = r3 + r22
            r5 = r11 & r25
            java.lang.Object r6 = r12.L
            long[] r6 = (long[]) r6
            int r7 = r12.B
            r8 = 0
        L145:
            int r10 = r6.length
            int r10 = r10 + (-2)
            if (r8 >= r10) goto L126
            if (r8 >= r7) goto L126
            int r10 = r8 + 2
            r13 = r6[r10]
            int r11 = (int) r13
            r11 = r11 & r25
            if (r11 != r5) goto L1a5
            r11 = r6
            r5 = r11[r8]
            r15 = r8
            long r7 = (long) r2
            long r7 = r7 << r16
            r28 = r7
            long r7 = (long) r3
            long r7 = r7 & r26
            long r7 = r28 | r7
            r11[r15] = r7
            int r8 = r15 + 1
            r28 = r2
            r29 = r3
            long r2 = (long) r9
            long r2 = r2 << r16
            r30 = r2
            long r2 = (long) r4
            long r2 = r2 & r26
            long r2 = r30 | r2
            r11[r8] = r2
            long r2 = r13 >> r21
            long r2 = r2 & r19
            long r2 = r2 << r24
            long r2 = r2 | r13
            r11[r10] = r2
            long r2 = r5 >> r16
            int r2 = (int) r2
            int r2 = r28 - r2
            int r3 = (int) r5
            int r3 = r29 - r3
            if (r2 == 0) goto L18c
            r4 = 1
            goto L18d
        L18c:
            r4 = 0
        L18d:
            if (r3 == 0) goto L191
            r5 = 1
            goto L192
        L191:
            r5 = 0
        L192:
            r4 = r4 | r5
            if (r4 == 0) goto L126
            int r8 = r15 + 3
            int r4 = defpackage.qf5.b
            long r4 = r13 & r17
            r6 = r8 & r25
            long r6 = (long) r6
            long r6 = r6 << r23
            long r4 = r4 | r6
            r12.l(r4, r2, r3)
            goto L126
        L1a5:
            r28 = r2
            r29 = r3
            r11 = r6
            r15 = r8
            int r8 = r15 + 3
            goto L145
        L1ae:
            r22 = r4
            r25 = r13
            r26 = r14
            r4 = 1
            r1.Z = r4
            r4 = 1024(0x400, float:1.435E-42)
            boolean r17 = r3.g(r4)
            r4 = 16
            boolean r18 = r3.g(r4)
            v57 r3 = r0.c
            p94 r3 = r3.a
            boolean r19 = r3.a(r11)
            if (r2 == 0) goto L20d
            int r2 = r2.B
            long r3 = r7 >> r16
            int r3 = (int) r3
            long r4 = r7 & r26
            int r4 = (int) r4
            r13 = r11 & r25
            java.lang.Object r5 = r12.L
            long[] r5 = (long[]) r5
            int r6 = r12.B
            int r6 = r6 + (-3)
        L1df:
            if (r6 < 0) goto L126
            int r7 = r6 + 2
            r7 = r5[r7]
            int r7 = (int) r7
            r7 = r7 & r25
            if (r7 != r2) goto L209
            r7 = r5[r6]
            long r10 = r7 >> r16
            int r5 = (int) r10
            int r7 = (int) r7
            int r14 = r5 + r3
            int r15 = r7 + r4
            int r16 = r14 + r9
            int r4 = r15 + r22
            r22 = r6
            r20 = r18
            r21 = r19
            r18 = r2
            r19 = r17
            r17 = r4
            r12.g(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L126
        L209:
            r10 = r12
            int r6 = r6 + (-3)
            goto L1df
        L20d:
            r10 = r12
            long r2 = r7 >> r16
            int r12 = (int) r2
            long r2 = r7 & r26
            int r13 = (int) r2
            int r14 = r12 + r9
            int r15 = r13 + r22
            r16 = 0
            r20 = 544(0x220, float:7.62E-43)
            defpackage.ei.h(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L126
        L221:
            r33.d(r34)
            h(r1)
            goto L126
        L229:
            r33.d(r34)
            goto L126
        L22e:
            r1.Y = r2
            r4 = 1
            r0.e = r4
            r0.i()
        L236:
            return
    }

    public final void g(defpackage.sm3 r11) {
            r10 = this;
            boolean r0 = r11.Z
            if (r0 == 0) goto L3b
            int r0 = r11.B
            r1 = 33554431(0x1ffffff, float:9.403954E-38)
            r0 = r0 & r1
            ei r2 = r10.b
            java.lang.Object r3 = r2.L
            long[] r3 = (long[]) r3
            int r2 = r2.B
            r4 = 0
            r5 = r4
        L14:
            int r6 = r3.length
            int r6 = r6 + (-2)
            r7 = 1
            if (r5 >= r6) goto L33
            if (r5 >= r2) goto L33
            int r6 = r5 + 2
            r8 = r3[r6]
            int r8 = (int) r8
            r8 = r8 & r1
            if (r8 != r0) goto L30
            r0 = -1
            r3[r5] = r0
            int r5 = r5 + r7
            r3[r5] = r0
            long r0 = defpackage.qf5.a
            r3[r6] = r0
            goto L33
        L30:
            int r5 = r5 + 3
            goto L14
        L33:
            r11.Z = r4
            r11.Y = r7
            r10.e = r7
            r10.g = r7
        L3b:
            return
    }

    public final void i() {
            r9 = this;
            fe r0 = r9.h
            r1 = 0
            if (r0 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = r1
        L8:
            v57 r3 = r9.c
            long r3 = r3.c
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L15
            if (r2 == 0) goto L15
            goto L1d
        L15:
            long r5 = r9.i
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L1e
            if (r2 == 0) goto L1e
        L1d:
            return
        L1e:
            te r2 = r9.a
            if (r0 == 0) goto L25
            r2.removeCallbacks(r0)
        L25:
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 16
            long r7 = r7 + r5
            long r3 = java.lang.Math.max(r3, r7)
            r9.i = r3
            long r3 = r3 - r5
            fe r0 = new fe
            pj r5 = r9.j
            r0.<init>(r1, r5)
            r2.postDelayed(r0, r3)
            r9.h = r0
            return
    }
}
