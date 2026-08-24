package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k65  reason: default package */
/* loaded from: classes.dex */
public abstract class k65 {
    public static final defpackage.y16 a = null;
    public static final float b = 0.0f;
    public static final float c = 0.0f;
    public static final float d = 0.0f;
    public static final float e = 0.0f;
    public static final float f = 0.0f;
    public static final defpackage.sc7 g = null;

    static {
            y16 r0 = defpackage.z16.a
            defpackage.k65.a = r0
            r0 = 1089470464(0x40f00000, float:7.5)
            defpackage.k65.b = r0
            r0 = 1075838976(0x40200000, float:2.5)
            defpackage.k65.c = r0
            r0 = 1092616192(0x41200000, float:10.0)
            defpackage.k65.d = r0
            r0 = 1084227584(0x40a00000, float:5.0)
            defpackage.k65.e = r0
            r0 = 1086324736(0x40c00000, float:6.0)
            defpackage.k65.f = r0
            e41 r0 = defpackage.ir1.c
            r1 = 2
            r2 = 300(0x12c, float:4.2E-43)
            r3 = 0
            sc7 r0 = defpackage.ge7.Y(r2, r3, r0, r1)
            defpackage.k65.g = r0
            return
    }

    public static final void a(defpackage.n65 r18, long r19, defpackage.a74 r21, defpackage.px0 r22, int r23) {
            r1 = r18
            r5 = r22
            xq2 r5 = (defpackage.xq2) r5
            r0 = -486016981(0xffffffffe307f82b, float:-2.5081928E21)
            r5.d0(r0)
            boolean r0 = r5.h(r1)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r23 | r0
            r8 = r19
            boolean r2 = r5.e(r8)
            r10 = 32
            if (r2 == 0) goto L23
            r2 = r10
            goto L25
        L23:
            r2 = 16
        L25:
            r0 = r0 | r2
            r2 = r0 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r11 = 0
            r12 = 1
            if (r2 == r3) goto L30
            r2 = r12
            goto L31
        L30:
            r2 = r11
        L31:
            r3 = r0 & 1
            boolean r2 = r5.S(r3, r2)
            if (r2 == 0) goto Lcd
            java.lang.Object r2 = r5.P()
            vs0 r13 = defpackage.ox0.a
            if (r2 != r13) goto L4b
            hj r2 = defpackage.lj.a()
            r2.h(r12)
            r5.l0(r2)
        L4b:
            r14 = r2
            hj r14 = (defpackage.hj) r14
            boolean r2 = r5.f(r1)
            java.lang.Object r3 = r5.P()
            if (r2 != 0) goto L5a
            if (r3 != r13) goto L66
        L5a:
            j65 r2 = new j65
            r2.<init>(r1, r11)
            ii1 r3 = defpackage.np2.I(r2)
            r5.l0(r3)
        L66:
            pp6 r3 = (defpackage.pp6) r3
            java.lang.Object r2 = r3.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r6 = 48
            r7 = 28
            sc7 r3 = defpackage.k65.g
            r4 = 0
            pp6 r2 = defpackage.in.b(r2, r3, r4, r5, r6, r7)
            r7 = r5
            java.lang.Object r3 = r7.P()
            if (r3 != r13) goto L8e
            dv4 r3 = new dv4
            r4 = 15
            r3.<init>(r4)
            r7.l0(r3)
        L8e:
            qn2 r3 = (defpackage.qn2) r3
            r15 = r21
            a74 r3 = defpackage.ua6.a(r15, r11, r3)
            boolean r4 = r7.h(r1)
            boolean r5 = r7.f(r2)
            r4 = r4 | r5
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r10) goto La4
            goto La5
        La4:
            r12 = r11
        La5:
            r0 = r4 | r12
            boolean r4 = r7.h(r14)
            r0 = r0 | r4
            java.lang.Object r4 = r7.P()
            if (r0 != 0) goto Lb7
            if (r4 != r13) goto Lb5
            goto Lb7
        Lb5:
            r8 = r3
            goto Lc7
        Lb7:
            z50 r0 = new z50
            r6 = 2
            r16 = r8
            r8 = r3
            r3 = r16
            r5 = r14
            r0.<init>(r1, r2, r3, r5, r6)
            r7.l0(r0)
            r4 = r0
        Lc7:
            qn2 r4 = (defpackage.qn2) r4
            defpackage.ak7.j(r8, r4, r7, r11)
            goto Ld3
        Lcd:
            r15 = r21
            r7 = r5
            r7.V()
        Ld3:
            cf5 r7 = r7.t()
            if (r7 == 0) goto Le8
            i7 r0 = new i7
            r6 = 2
            r1 = r18
            r2 = r19
            r5 = r23
            r4 = r15
            r0.<init>(r1, r2, r4, r5, r6)
            r7.d = r0
        Le8:
            return
    }

    public static final void b(boolean r24, defpackage.n65 r25, defpackage.a74 r26, long r27, long r29, defpackage.px0 r31, int r32) {
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r6 = r29
            r13 = r31
            xq2 r13 = (defpackage.xq2) r13
            r0 = 308716636(0x1266a45c, float:7.277779E-28)
            r13.d0(r0)
            boolean r0 = r13.g(r1)
            r8 = 4
            if (r0 == 0) goto L1d
            r0 = r8
            goto L1e
        L1d:
            r0 = 2
        L1e:
            r0 = r32 | r0
            boolean r9 = r13.h(r2)
            if (r9 == 0) goto L29
            r9 = 32
            goto L2b
        L29:
            r9 = 16
        L2b:
            r0 = r0 | r9
            boolean r9 = r13.f(r3)
            if (r9 == 0) goto L35
            r9 = 256(0x100, float:3.59E-43)
            goto L37
        L35:
            r9 = 128(0x80, float:1.8E-43)
        L37:
            r0 = r0 | r9
            boolean r9 = r13.e(r4)
            if (r9 == 0) goto L41
            r9 = 2048(0x800, float:2.87E-42)
            goto L43
        L41:
            r9 = 1024(0x400, float:1.435E-42)
        L43:
            r0 = r0 | r9
            boolean r9 = r13.e(r6)
            if (r9 == 0) goto L4d
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L4f
        L4d:
            r9 = 8192(0x2000, float:1.148E-41)
        L4f:
            r0 = r0 | r9
            r9 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r9
            r9 = 74899(0x12493, float:1.04956E-40)
            r9 = r9 & r0
            r11 = 74898(0x12492, float:1.04954E-40)
            r14 = 0
            if (r9 == r11) goto L5f
            r9 = 1
            goto L60
        L5f:
            r9 = r14
        L60:
            r11 = r0 & 1
            boolean r9 = r13.S(r11, r9)
            if (r9 == 0) goto L18c
            r13.X()
            r9 = r32 & 1
            if (r9 == 0) goto L79
            boolean r9 = r13.B()
            if (r9 == 0) goto L76
            goto L79
        L76:
            r13.V()
        L79:
            r13.q()
            r9 = r0 & 14
            if (r9 != r8) goto L82
            r8 = 1
            goto L83
        L82:
            r8 = r14
        L83:
            boolean r11 = r13.f(r2)
            r8 = r8 | r11
            java.lang.Object r11 = r13.P()
            if (r8 != 0) goto L92
            vs0 r8 = defpackage.ox0.a
            if (r11 != r8) goto L9f
        L92:
            sz0 r8 = new sz0
            r11 = 3
            r8.<init>(r1, r2, r11)
            ii1 r11 = defpackage.np2.I(r8)
            r13.l0(r11)
        L9f:
            pp6 r11 = (defpackage.pp6) r11
            nq6 r8 = defpackage.os1.a
            java.lang.Object r8 = r13.j(r8)
            qd1 r8 = (defpackage.qd1) r8
            float r15 = defpackage.k65.f
            if (r8 != 0) goto Lba
            r0 = 1453038224(0x569b9a90, float:8.554407E13)
            r13.b0(r0)
            r13.p(r14)
            r16 = r11
            r0 = 0
            goto Ld4
        Lba:
            r8 = 323966865(0x134f5791, float:2.6170247E-27)
            r13.b0(r8)
            int r0 = r0 >> 9
            r0 = r0 & 14
            r0 = r0 | 48
            r16 = r11
            long r10 = defpackage.qd1.a(r4, r15, r13, r0)
            r13.p(r14)
            kt0 r0 = new kt0
            r0.<init>(r10)
        Ld4:
            if (r0 == 0) goto Ld9
            long r10 = r0.a
            goto Lda
        Ld9:
            r10 = r4
        Lda:
            r0 = 1109393408(0x42200000, float:40.0)
            a74 r0 = defpackage.dj6.i(r3, r0)
            dv4 r8 = new dv4
            r12 = 16
            r8.<init>(r12)
            a74 r0 = defpackage.q60.y(r0, r8)
            bg2 r8 = new bg2
            r12 = 24
            r8.<init>(r2, r12)
            a74 r17 = defpackage.hv.G(r0, r8)
            java.lang.Object r0 = r16.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L105
        L102:
            r18 = r15
            goto L107
        L105:
            r15 = 0
            goto L102
        L107:
            r21 = 0
            r23 = 24
            y16 r19 = defpackage.k65.a
            r20 = 1
            a74 r0 = defpackage.nj2.E(r17, r18, r19, r20, r21, r23)
            r8 = r19
            a74 r0 = defpackage.vy7.L(r0, r10, r8)
            e40 r8 = defpackage.d90.L
            e34 r8 = defpackage.h70.d(r8, r14)
            int r10 = defpackage.ge7.B(r13)
            xv4 r11 = r13.l()
            a74 r0 = defpackage.l.E(r13, r0)
            ix0 r12 = defpackage.jx0.i
            r12.getClass()
            iy0 r12 = defpackage.ix0.b
            r13.f0()
            boolean r15 = r13.S
            if (r15 == 0) goto L13d
            r13.k(r12)
            goto L140
        L13d:
            r13.o0()
        L140:
            pn r12 = defpackage.ix0.f
            defpackage.yh2.K(r13, r12, r8)
            pn r8 = defpackage.ix0.e
            defpackage.yh2.K(r13, r8, r11)
            pn r8 = defpackage.ix0.g
            boolean r11 = r13.S
            if (r11 != 0) goto L15e
            java.lang.Object r11 = r13.P()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r11 = defpackage.nb3.k(r11, r12)
            if (r11 != 0) goto L161
        L15e:
            defpackage.i61.v(r10, r13, r10, r8)
        L161:
            pn r8 = defpackage.ix0.d
            defpackage.yh2.K(r13, r8, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r0 = 100
            r10 = 6
            r11 = 0
            sc7 r10 = defpackage.ge7.Y(r0, r14, r11, r10)
            h65 r0 = new h65
            r0.<init>(r6, r2)
            r11 = 1853731063(0x6e7db0f7, float:1.9628411E28)
            zv0 r12 = defpackage.n16.I(r11, r0, r13)
            r14 = r9 | 24960(0x6180, float:3.4976E-41)
            r15 = 10
            r9 = 0
            r11 = 0
            r0 = 1
            defpackage.n16.d(r8, r9, r10, r11, r12, r13, r14, r15)
            r13.p(r0)
            goto L18f
        L18c:
            r13.V()
        L18f:
            cf5 r9 = r13.t()
            if (r9 == 0) goto L19e
            i65 r0 = new i65
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r6, r8)
            r9.d = r0
        L19e:
            return
    }

    public static final void c(defpackage.no1 r13, defpackage.hj r14, defpackage.of5 r15, long r16, float r18, defpackage.gv r19) {
            r0 = r19
            r14.g()
            android.graphics.Path r1 = r14.a
            r2 = 0
            r1.moveTo(r2, r2)
            float r3 = defpackage.k65.d
            float r4 = r13.e0(r3)
            float r5 = r0.b
            float r4 = r4 * r5
            r14.e(r4, r2)
            float r2 = r13.e0(r3)
            float r2 = r2 * r5
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            float r6 = defpackage.k65.e
            float r6 = r13.e0(r6)
            float r6 = r6 * r5
            r14.e(r2, r6)
            float r2 = r15.c
            float r6 = r15.a
            float r2 = r2 - r6
            float r6 = r15.d
            float r7 = r15.b
            float r6 = r6 - r7
            float r2 = java.lang.Math.min(r2, r6)
            float r2 = r2 / r4
            float r3 = r13.e0(r3)
            float r3 = r3 * r5
            float r3 = r3 / r4
            long r5 = r15.b()
            r7 = 32
            long r5 = r5 >> r7
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 + r2
            float r5 = r5 - r3
            long r2 = r15.b()
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r8
            int r15 = (int) r2
            float r15 = java.lang.Float.intBitsToFloat(r15)
            float r2 = defpackage.k65.c
            float r2 = r13.e0(r2)
            float r2 = r2 / r4
            float r2 = r2 + r15
            int r15 = java.lang.Float.floatToRawIntBits(r5)
            long r3 = (long) r15
            int r15 = java.lang.Float.floatToRawIntBits(r2)
            long r5 = (long) r15
            long r2 = r3 << r7
            long r4 = r5 & r8
            long r2 = r2 | r4
            r14.i(r2)
            r1.close()
            float r15 = r0.a
            long r0 = r13.t0()
            bt r2 = r13.i0()
            long r3 = r2.L()
            xj0 r5 = r2.G()
            r5.h()
            java.lang.Object r5 = r2.B     // Catch: java.lang.Throwable -> La4
            os0 r5 = (defpackage.os0) r5     // Catch: java.lang.Throwable -> La4
            r5.e0(r15, r0)     // Catch: java.lang.Throwable -> La4
            r11 = 0
            r12 = 56
            r6 = r13
            r7 = r14
            r8 = r16
            r10 = r18
            defpackage.no1.B0(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> La4
            defpackage.xg6.v(r2, r3)
            return
        La4:
            r0 = move-exception
            r13 = r0
            defpackage.xg6.v(r2, r3)
            throw r13
    }
}
