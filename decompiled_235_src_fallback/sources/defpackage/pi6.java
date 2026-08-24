package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pi6  reason: default package */
/* loaded from: classes.dex */
public final class pi6 implements defpackage.go2 {
    public final /* synthetic */ java.util.List A;
    public final /* synthetic */ defpackage.qn2 B;
    public final /* synthetic */ defpackage.on2 L;
    public final /* synthetic */ int R;

    public pi6(java.util.List r1, defpackage.qn2 r2, defpackage.on2 r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
            r34 = this;
            r0 = r34
            r1 = r35
            lp3 r1 = (defpackage.lp3) r1
            r2 = r36
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r37
            px0 r3 = (defpackage.px0) r3
            r4 = r38
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r4 & 6
            r6 = 2
            if (r5 != 0) goto L2d
            r5 = r3
            xq2 r5 = (defpackage.xq2) r5
            boolean r1 = r5.f(r1)
            if (r1 == 0) goto L2a
            r1 = 4
            goto L2b
        L2a:
            r1 = r6
        L2b:
            r1 = r1 | r4
            goto L2e
        L2d:
            r1 = r4
        L2e:
            r5 = 48
            r4 = r4 & r5
            r7 = 32
            if (r4 != 0) goto L43
            r4 = r3
            xq2 r4 = (defpackage.xq2) r4
            boolean r4 = r4.d(r2)
            if (r4 == 0) goto L40
            r4 = r7
            goto L42
        L40:
            r4 = 16
        L42:
            r1 = r1 | r4
        L43:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            r9 = 0
            r10 = 1
            if (r4 == r8) goto L4d
            r4 = r10
            goto L4e
        L4d:
            r4 = r9
        L4e:
            r8 = r1 & 1
            xq2 r3 = (defpackage.xq2) r3
            boolean r4 = r3.S(r8, r4)
            if (r4 == 0) goto L150
            java.util.List r4 = r0.A
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r8 = 1374552944(0x51ee0370, float:1.2778249E11)
            r3.b0(r8)
            r8 = 1065353216(0x3f800000, float:1.0)
            x64 r11 = defpackage.x64.a
            a74 r8 = defpackage.dj6.c(r11, r8)
            qn2 r12 = r0.B
            boolean r13 = r3.f(r12)
            r14 = r1 & 112(0x70, float:1.57E-43)
            r14 = r14 ^ r5
            if (r14 <= r7) goto L7f
            boolean r14 = r3.d(r2)
            if (r14 != 0) goto L82
        L7f:
            r1 = r1 & r5
            if (r1 != r7) goto L84
        L82:
            r1 = r10
            goto L85
        L84:
            r1 = r9
        L85:
            r1 = r1 | r13
            on2 r7 = r0.L
            boolean r13 = r3.f(r7)
            r1 = r1 | r13
            java.lang.Object r13 = r3.P()
            if (r1 != 0) goto L97
            vs0 r1 = defpackage.ox0.a
            if (r13 != r1) goto L9f
        L97:
            oi6 r13 = new oi6
            r13.<init>(r12, r2, r7)
            r3.l0(r13)
        L9f:
            on2 r13 = (defpackage.on2) r13
            r1 = 15
            r7 = 0
            a74 r1 = defpackage.mb3.u(r8, r9, r7, r13, r1)
            r7 = 1111490560(0x42400000, float:48.0)
            r8 = 0
            a74 r12 = defpackage.dj6.f(r1, r7, r8, r6)
            r16 = 0
            r17 = 14
            r13 = 1103101952(0x41c00000, float:24.0)
            r14 = 0
            r15 = 0
            a74 r1 = defpackage.ge7.S(r12, r13, r14, r15, r16, r17)
            d40 r6 = defpackage.d90.i0
            du r7 = defpackage.ju.a
            l26 r5 = defpackage.k26.a(r7, r6, r3, r5)
            long r6 = r3.T
            int r6 = java.lang.Long.hashCode(r6)
            xv4 r7 = r3.l()
            a74 r1 = defpackage.l.E(r3, r1)
            ix0 r8 = defpackage.jx0.i
            r8.getClass()
            iy0 r8 = defpackage.ix0.b
            r3.f0()
            boolean r12 = r3.S
            if (r12 == 0) goto Le3
            r3.k(r8)
            goto Le6
        Le3:
            r3.o0()
        Le6:
            pn r8 = defpackage.ix0.f
            defpackage.yh2.K(r3, r8, r5)
            pn r5 = defpackage.ix0.e
            defpackage.yh2.K(r3, r5, r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            pn r6 = defpackage.ix0.g
            defpackage.yh2.K(r3, r6, r5)
            ne r5 = defpackage.ix0.h
            defpackage.yh2.F(r3, r5)
            pn r5 = defpackage.ix0.d
            defpackage.yh2.K(r3, r5, r1)
            int r0 = r0.R
            if (r2 != r0) goto L10a
            r0 = r11
            r11 = r10
            goto L10c
        L10a:
            r0 = r11
            r11 = r9
        L10c:
            r17 = 48
            r18 = 60
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = r3
            defpackage.kd5.a(r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = 1107296256(0x42000000, float:32.0)
            a74 r0 = defpackage.dj6.l(r0, r1)
            defpackage.gi2.h(r3, r0)
            r32 = 0
            r33 = 131070(0x1fffe, float:1.83668E-40)
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r30 = r3
            r11 = r4
            defpackage.x37.b(r11, r12, r13, r15, r17, r18, r19, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r3.p(r10)
            r3.p(r9)
            goto L153
        L150:
            r3.V()
        L153:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
