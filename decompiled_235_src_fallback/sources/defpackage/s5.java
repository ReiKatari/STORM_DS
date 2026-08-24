package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s5  reason: default package */
/* loaded from: classes.dex */
public final class s5 implements defpackage.go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.List B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ s5(java.util.List r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r42, java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) {
            r41 = this;
            r0 = r41
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            x64 r3 = defpackage.x64.a
            java.util.List r4 = r0.B
            r5 = 146(0x92, float:2.05E-43)
            r7 = 32
            r8 = 4
            java.lang.Object r0 = r0.L
            r9 = 2
            r10 = 48
            r11 = 1065353216(0x3f800000, float:1.0)
            r13 = 1
            switch(r1) {
                case 0: goto L2a3;
                default: goto L1a;
            }
        L1a:
            r1 = r42
            lp3 r1 = (defpackage.lp3) r1
            r14 = r43
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r15 = r44
            px0 r15 = (defpackage.px0) r15
            r16 = r45
            java.lang.Number r16 = (java.lang.Number) r16
            int r16 = r16.intValue()
            es7 r0 = (defpackage.es7) r0
            r17 = r16 & 6
            if (r17 != 0) goto L46
            r6 = r15
            xq2 r6 = (defpackage.xq2) r6
            boolean r1 = r6.f(r1)
            if (r1 == 0) goto L42
            goto L43
        L42:
            r8 = r9
        L43:
            r1 = r16 | r8
            goto L48
        L46:
            r1 = r16
        L48:
            r6 = r16 & 48
            if (r6 != 0) goto L5a
            r6 = r15
            xq2 r6 = (defpackage.xq2) r6
            boolean r6 = r6.d(r14)
            if (r6 == 0) goto L57
            r6 = r7
            goto L59
        L57:
            r6 = 16
        L59:
            r1 = r1 | r6
        L5a:
            r6 = r1 & 147(0x93, float:2.06E-43)
            if (r6 == r5) goto L60
            r5 = r13
            goto L61
        L60:
            r5 = 0
        L61:
            r1 = r1 & r13
            xq2 r15 = (defpackage.xq2) r15
            boolean r1 = r15.S(r1, r5)
            if (r1 == 0) goto L29f
            java.lang.Object r1 = r4.get(r14)
            java.io.File r1 = (java.io.File) r1
            r4 = -1998629223(0xffffffff88df5699, float:-1.3441683E-33)
            r15.b0(r4)
            d40 r4 = defpackage.d90.i0
            a74 r5 = defpackage.dj6.c(r3, r11)
            r6 = 1090519040(0x41000000, float:8.0)
            y16 r7 = defpackage.z16.b(r6)
            a74 r5 = defpackage.u24.g(r5, r7)
            long r7 = r0.d
            jy2 r9 = defpackage.u24.m
            a74 r5 = defpackage.vy7.L(r5, r7, r9)
            r7 = 1094713344(0x41400000, float:12.0)
            a74 r5 = defpackage.ge7.O(r5, r7)
            du r8 = defpackage.ju.a
            l26 r4 = defpackage.k26.a(r8, r4, r15, r10)
            long r8 = r15.T
            int r8 = java.lang.Long.hashCode(r8)
            xv4 r9 = r15.l()
            a74 r5 = defpackage.l.E(r15, r5)
            ix0 r10 = defpackage.jx0.i
            r10.getClass()
            iy0 r10 = defpackage.ix0.b
            r15.f0()
            boolean r14 = r15.S
            if (r14 == 0) goto Lba
            r15.k(r10)
            goto Lbd
        Lba:
            r15.o0()
        Lbd:
            pn r14 = defpackage.ix0.f
            defpackage.yh2.K(r15, r14, r4)
            pn r4 = defpackage.ix0.e
            defpackage.yh2.K(r15, r4, r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            pn r9 = defpackage.ix0.g
            defpackage.yh2.K(r15, r9, r8)
            ne r8 = defpackage.ix0.h
            defpackage.yh2.F(r15, r8)
            pn r11 = defpackage.ix0.d
            defpackage.yh2.K(r15, r11, r5)
            boolean r5 = r1.isDirectory()
            if (r5 == 0) goto Lea
            e33 r5 = defpackage.hi2.A()
        Le4:
            r40 = r1
        Le6:
            r16 = r5
            goto L1d3
        Lea:
            e33 r5 = defpackage.g04.n
            if (r5 == 0) goto Lef
            goto Le4
        Lef:
            d33 r16 = new d33
            r24 = 0
            r26 = 96
            java.lang.String r17 = "Filled.Description"
            r18 = 1103101952(0x41c00000, float:24.0)
            r19 = 1103101952(0x41c00000, float:24.0)
            r20 = 1103101952(0x41c00000, float:24.0)
            r21 = 1103101952(0x41c00000, float:24.0)
            r22 = 0
            r25 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22, r24, r25, r26)
            r5 = r16
            int r16 = defpackage.el7.a
            cn6 r7 = new cn6
            long r12 = defpackage.kt0.b
            r7.<init>(r12)
            ww2 r12 = new ww2
            r6 = 1
            r13 = 0
            r12.<init>(r6, r13)
            r6 = 1096810496(0x41600000, float:14.0)
            r13 = 1073741824(0x40000000, float:2.0)
            r12.o(r6, r13)
            r6 = 1086324736(0x40c00000, float:6.0)
            r12.m(r6, r13)
            r21 = -1073825710(0xffffffffbffeb852, float:-1.99)
            r22 = 1073741824(0x40000000, float:2.0)
            r17 = -1081291571(0xffffffffbf8ccccd, float:-1.1)
            r18 = 0
            r19 = -1073825710(0xffffffffbffeb852, float:-1.99)
            r20 = 1063675494(0x3f666666, float:0.9)
            r16 = r12
            r16.i(r17, r18, r19, r20, r21, r22)
            r6 = r16
            r12 = 1082130432(0x40800000, float:4.0)
            r13 = 1101004800(0x41a00000, float:20.0)
            r6.m(r12, r13)
            r21 = 1073657938(0x3ffeb852, float:1.99)
            r17 = 0
            r18 = 1066192077(0x3f8ccccd, float:1.1)
            r19 = 1063507722(0x3f63d70a, float:0.89)
            r20 = 1073741824(0x40000000, float:2.0)
            r16.i(r17, r18, r19, r20, r21, r22)
            r12 = 1102053376(0x41b00000, float:22.0)
            r13 = 1099956224(0x41900000, float:18.0)
            r6.m(r13, r12)
            r21 = 1073741824(0x40000000, float:2.0)
            r22 = -1073741824(0xffffffffc0000000, float:-2.0)
            r17 = 1066192077(0x3f8ccccd, float:1.1)
            r18 = 0
            r19 = 1073741824(0x40000000, float:2.0)
            r20 = -1083808154(0xffffffffbf666666, float:-0.9)
            r16.i(r17, r18, r19, r20, r21, r22)
            r12 = 1090519040(0x41000000, float:8.0)
            r13 = 1101004800(0x41a00000, float:20.0)
            r6.m(r13, r12)
            r13 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r6.n(r13, r13)
            r6.g()
            r13 = 1098907648(0x41800000, float:16.0)
            r40 = r1
            r1 = 1099956224(0x41900000, float:18.0)
            r6.o(r13, r1)
            r6.m(r12, r1)
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6.u(r1)
            r6.l(r12)
            r1 = 1073741824(0x40000000, float:2.0)
            r6.u(r1)
            r6.g()
            r1 = 1096810496(0x41600000, float:14.0)
            r6.o(r13, r1)
            r6.m(r12, r1)
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6.u(r1)
            r6.l(r12)
            r1 = 1073741824(0x40000000, float:2.0)
            r6.u(r1)
            r6.g()
            r1 = 1095761920(0x41500000, float:13.0)
            r12 = 1091567616(0x41100000, float:9.0)
            r6.o(r1, r12)
            r13 = 1080033280(0x40600000, float:3.5)
            r6.m(r1, r13)
            r13 = 1100218368(0x41940000, float:18.5)
            r6.m(r13, r12)
            r6.m(r1, r12)
            r6.g()
            java.util.ArrayList r1 = r6.b
            r13 = 0
            defpackage.d33.a(r5, r1, r13, r7)
            e33 r1 = r5.b()
            defpackage.g04.n = r1
            r5 = r1
            goto Le6
        L1d3:
            boolean r1 = r40.isDirectory()
            if (r1 == 0) goto L1de
            long r5 = r0.j
        L1db:
            r19 = r5
            goto L1e1
        L1de:
            long r5 = r0.h
            goto L1db
        L1e1:
            r1 = 1103101952(0x41c00000, float:24.0)
            a74 r18 = defpackage.dj6.i(r3, r1)
            r22 = 432(0x1b0, float:6.05E-43)
            r23 = 0
            r17 = 0
            r21 = r15
            defpackage.i13.a(r16, r17, r18, r19, r21, r22, r23)
            r1 = 1094713344(0x41400000, float:12.0)
            a74 r1 = defpackage.dj6.l(r3, r1)
            defpackage.gi2.h(r15, r1)
            vn3 r1 = new vn3
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 1
            r1.<init>(r3, r6)
            eu r3 = defpackage.ju.c
            c40 r5 = defpackage.d90.k0
            r13 = 0
            yt0 r3 = defpackage.wt0.a(r3, r5, r15, r13)
            long r5 = r15.T
            int r5 = java.lang.Long.hashCode(r5)
            xv4 r6 = r15.l()
            a74 r1 = defpackage.l.E(r15, r1)
            r15.f0()
            boolean r7 = r15.S
            if (r7 == 0) goto L225
            r15.k(r10)
            goto L228
        L225:
            r15.o0()
        L228:
            defpackage.yh2.K(r15, r14, r3)
            defpackage.yh2.K(r15, r4, r6)
            defpackage.i61.w(r5, r15, r9, r15, r8)
            defpackage.yh2.K(r15, r11, r1)
            java.lang.String r16 = r40.getName()
            r16.getClass()
            long r3 = r0.g
            pi2 r23 = defpackage.qs7.a
            r1 = 13
            long r20 = defpackage.hi2.E(r1)
            oj2 r22 = defpackage.oj2.Z
            r37 = 0
            r38 = 130962(0x1ff92, float:1.83517E-40)
            r17 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r36 = 1772544(0x1b0c00, float:2.483863E-39)
            r18 = r3
            r35 = r15
            defpackage.x37.b(r16, r17, r18, r20, r22, r23, r24, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            long r3 = r40.length()
            r5 = 1024(0x400, double:5.06E-321)
            long r3 = r3 / r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " KB"
            r1.append(r3)
            java.lang.String r16 = r1.toString()
            long r0 = r0.i
            sr2 r23 = defpackage.qs7.c
            r3 = 10
            long r20 = defpackage.hi2.E(r3)
            r38 = 130994(0x1ffb2, float:1.83562E-40)
            r22 = 0
            r36 = 1575936(0x180c00, float:2.208357E-39)
            r18 = r0
            defpackage.x37.b(r16, r17, r18, r20, r22, r23, r24, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r6 = 1
            r13 = 0
            defpackage.i61.y(r15, r6, r6, r13)
            goto L2a2
        L29f:
            r15.V()
        L2a2:
            return r2
        L2a3:
            r1 = r42
            lp3 r1 = (defpackage.lp3) r1
            r6 = r43
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r11 = r44
            px0 r11 = (defpackage.px0) r11
            r12 = r45
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r13 = r12 & 6
            if (r13 != 0) goto L2cd
            r13 = r11
            xq2 r13 = (defpackage.xq2) r13
            boolean r1 = r13.f(r1)
            if (r1 == 0) goto L2c9
            goto L2ca
        L2c9:
            r8 = r9
        L2ca:
            r1 = r12 | r8
            goto L2ce
        L2cd:
            r1 = r12
        L2ce:
            r8 = r12 & 48
            if (r8 != 0) goto L2e2
            r8 = r11
            xq2 r8 = (defpackage.xq2) r8
            boolean r8 = r8.d(r6)
            if (r8 == 0) goto L2de
            r17 = r7
            goto L2e0
        L2de:
            r17 = 16
        L2e0:
            r1 = r1 | r17
        L2e2:
            r7 = r1 & 147(0x93, float:2.06E-43)
            if (r7 == r5) goto L2ea
            r13 = 1
        L2e7:
            r39 = 1
            goto L2ec
        L2ea:
            r13 = 0
            goto L2e7
        L2ec:
            r1 = r1 & 1
            xq2 r11 = (defpackage.xq2) r11
            boolean r1 = r11.S(r1, r13)
            if (r1 == 0) goto L32c
            java.lang.Object r1 = r4.get(r6)
            ta5 r1 = (defpackage.ta5) r1
            r4 = -822009669(0xffffffffcf0120bb, float:-2.166406E9)
            r11.b0(r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            a74 r3 = defpackage.dj6.c(r3, r4)
            boolean r4 = r11.h(r1)
            java.lang.Object r5 = r11.P()
            if (r4 != 0) goto L316
            vs0 r4 = defpackage.ox0.a
            if (r5 != r4) goto L321
        L316:
            i5 r5 = new i5
            qa4 r0 = (defpackage.qa4) r0
            r6 = 1
            r5.<init>(r6, r1, r0)
            r11.l0(r5)
        L321:
            on2 r5 = (defpackage.on2) r5
            r0 = 6
            defpackage.nc1.p(r3, r1, r5, r11, r0)
            r13 = 0
            r11.p(r13)
            goto L32f
        L32c:
            r11.V()
        L32f:
            return r2
    }
}
