package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt5  reason: default package */
/* loaded from: classes.dex */
public abstract class lt5 {
    public static final defpackage.py0 a = null;

    static {
            kt5 r0 = new kt5
            r1 = 0
            r0.<init>(r1)
            py0 r1 = new py0
            r1.<init>(r0)
            defpackage.lt5.a = r1
            return
    }

    public static final void a(java.lang.String r38, java.lang.String r39, boolean r40, boolean r41, defpackage.on2 r42, defpackage.px0 r43, int r44, int r45) {
            r6 = r44
            r38.getClass()
            r39.getClass()
            r42.getClass()
            r12 = r43
            xq2 r12 = (defpackage.xq2) r12
            r0 = -101028403(0xfffffffff9fa6dcd, float:-1.6253765E35)
            r12.d0(r0)
            r15 = r38
            boolean r0 = r12.f(r15)
            r1 = 4
            if (r0 == 0) goto L20
            r0 = r1
            goto L21
        L20:
            r0 = 2
        L21:
            r0 = r0 | r6
            r7 = r39
            boolean r3 = r12.f(r7)
            if (r3 == 0) goto L2d
            r3 = 32
            goto L2f
        L2d:
            r3 = 16
        L2f:
            r0 = r0 | r3
            r3 = r45 & 4
            if (r3 == 0) goto L39
            r0 = r0 | 384(0x180, float:5.38E-43)
            r5 = r40
            goto L47
        L39:
            r5 = r40
            boolean r8 = r12.g(r5)
            if (r8 == 0) goto L44
            r8 = 256(0x100, float:3.59E-43)
            goto L46
        L44:
            r8 = 128(0x80, float:1.8E-43)
        L46:
            r0 = r0 | r8
        L47:
            r8 = r45 & 8
            if (r8 == 0) goto L52
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L4d:
            r9 = r41
        L4f:
            r10 = r42
            goto L65
        L52:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L4d
            r9 = r41
            boolean r10 = r12.g(r9)
            if (r10 == 0) goto L61
            r10 = 2048(0x800, float:2.87E-42)
            goto L63
        L61:
            r10 = 1024(0x400, float:1.435E-42)
        L63:
            r0 = r0 | r10
            goto L4f
        L65:
            boolean r11 = r12.h(r10)
            if (r11 == 0) goto L6e
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L70
        L6e:
            r11 = 8192(0x2000, float:1.148E-41)
        L70:
            r0 = r0 | r11
            r11 = r0 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r11 == r13) goto L79
            r11 = 1
            goto L7a
        L79:
            r11 = 0
        L7a:
            r13 = r0 & 1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L2e0
            if (r3 == 0) goto L85
            r5 = 1
        L85:
            if (r8 == 0) goto L89
            r3 = 0
            goto L8a
        L89:
            r3 = r9
        L8a:
            es7 r8 = defpackage.bl2.F(r12)
            java.lang.Object r9 = r12.P()
            vs0 r11 = defpackage.ox0.a
            if (r9 != r11) goto L9a
            r94 r9 = defpackage.i61.f(r12)
        L9a:
            r94 r9 = (defpackage.r94) r9
            r13 = 6
            qa4 r14 = defpackage.bw7.a(r9, r12, r13)
            py0 r13 = defpackage.lt5.a
            java.lang.Object r13 = r12.j(r13)
            eo2 r13 = (defpackage.eo2) r13
            java.lang.Object r17 = r14.getValue()
            r2 = r17
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.getClass()
            boolean r17 = r12.f(r14)
            boolean r18 = r12.f(r13)
            r17 = r17 | r18
            r4 = r0 & 14
            if (r4 != r1) goto Lc4
            r1 = 1
            goto Lc5
        Lc4:
            r1 = 0
        Lc5:
            r1 = r17 | r1
            r30 = r0
            r0 = r30 & 112(0x70, float:1.57E-43)
            r41 = r1
            r1 = 32
            if (r0 != r1) goto Ld3
            r0 = 1
            goto Ld4
        Ld3:
            r0 = 0
        Ld4:
            r0 = r41 | r0
            java.lang.Object r1 = r12.P()
            if (r0 != 0) goto Lde
            if (r1 != r11) goto Le2
        Lde:
            r17 = r14
            r14 = r13
            goto Le8
        Le2:
            r13 = r1
            r17 = r14
            r0 = 0
            r1 = 6
            goto Lf8
        Le8:
            la r13 = new la
            r18 = 0
            r19 = 8
            r16 = r7
            r0 = 0
            r1 = 6
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r12.l0(r13)
        Lf8:
            eo2 r13 = (defpackage.eo2) r13
            defpackage.mb3.i(r12, r13, r2)
            if (r3 == 0) goto L10c
            r2 = 1035455661(0x3db7ccad, float:0.08974586)
            r12.b0(r2)
            defpackage.is7.d(r12, r0)
            r12.p(r0)
            goto L115
        L10c:
            r2 = 1035494101(0x3db862d5, float:0.09003226)
            r12.b0(r2)
            r12.p(r0)
        L115:
            r0 = 1090519040(0x41000000, float:8.0)
            y16 r0 = defpackage.z16.b(r0)
            x64 r2 = defpackage.x64.a
            r7 = 1065353216(0x3f800000, float:1.0)
            a74 r11 = defpackage.dj6.c(r2, r7)
            a74 r11 = defpackage.u24.g(r11, r0)
            java.lang.Object r13 = r17.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L146
            long r13 = r8.e
            jy2 r15 = defpackage.u24.m
            a74 r13 = defpackage.vy7.L(r2, r13, r15)
            r14 = 1073741824(0x40000000, float:2.0)
            r41 = r2
            long r1 = r8.j
            a74 r0 = defpackage.ak7.I(r13, r14, r1, r0)
            goto L14a
        L146:
            r41 = r2
            r0 = r41
        L14a:
            a74 r13 = r11.d(r0)
            if (r5 == 0) goto L15e
            r17 = 0
            r19 = 28
            r15 = 0
            r16 = 0
            r14 = r9
            r18 = r10
            a74 r13 = defpackage.mb3.t(r13, r14, r15, r16, r17, r18, r19)
        L15e:
            if (r5 == 0) goto L162
            r0 = r7
            goto L165
        L162:
            r0 = 1055286886(0x3ee66666, float:0.45)
        L165:
            a74 r0 = defpackage.jw2.j(r13, r0)
            r1 = 1111490560(0x42400000, float:48.0)
            r2 = 0
            r9 = 2
            a74 r0 = defpackage.dj6.f(r0, r1, r2, r9)
            r1 = 1097859072(0x41700000, float:15.0)
            r2 = 1095761920(0x41500000, float:13.0)
            a74 r0 = defpackage.ge7.P(r0, r1, r2)
            d40 r1 = defpackage.d90.i0
            du r2 = defpackage.ju.a
            r9 = 48
            l26 r10 = defpackage.k26.a(r2, r1, r12, r9)
            long r13 = r12.T
            int r11 = java.lang.Long.hashCode(r13)
            xv4 r13 = r12.l()
            a74 r0 = defpackage.l.E(r12, r0)
            ix0 r14 = defpackage.jx0.i
            r14.getClass()
            iy0 r14 = defpackage.ix0.b
            r12.f0()
            boolean r15 = r12.S
            if (r15 == 0) goto L1a3
            r12.k(r14)
            goto L1a6
        L1a3:
            r12.o0()
        L1a6:
            pn r15 = defpackage.ix0.f
            defpackage.yh2.K(r12, r15, r10)
            pn r10 = defpackage.ix0.e
            defpackage.yh2.K(r12, r10, r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            pn r13 = defpackage.ix0.g
            defpackage.yh2.K(r12, r13, r11)
            ne r11 = defpackage.ix0.h
            defpackage.yh2.F(r12, r11)
            r43 = r14
            pn r14 = defpackage.ix0.d
            defpackage.yh2.K(r12, r14, r0)
            r16 = r9
            r0 = r10
            long r9 = r8.g
            r17 = 4623789442425946112(0x402b000000000000, double:13.5)
            long r17 = defpackage.hi2.D(r17)
            r19 = 17
            long r19 = defpackage.hi2.E(r19)
            r21 = r13
            oj2 r13 = defpackage.oj2.Z
            r22 = r8
            vn3 r8 = new vn3
            r23 = r0
            r0 = 1
            r8.<init>(r7, r0)
            r0 = 199680(0x30c00, float:2.79811E-40)
            r27 = r4 | r0
            r28 = 3126(0xc36, float:4.38E-42)
            r29 = 119760(0x1d3d0, float:1.6782E-40)
            r0 = r14
            r14 = 0
            r4 = r15
            r7 = r16
            r15 = 0
            r26 = r12
            r36 = r17
            r18 = r11
            r11 = r36
            r17 = 0
            r24 = r18
            r18 = r19
            r20 = 2
            r25 = r21
            r21 = 0
            r31 = r22
            r22 = 2
            r32 = r23
            r23 = 0
            r33 = r24
            r24 = 0
            r34 = r25
            r25 = 0
            r6 = r4
            r4 = r43
            r43 = r3
            r3 = r6
            r6 = r31
            r31 = r5
            r5 = r32
            r32 = r6
            r35 = r0
            r0 = r7
            r6 = r34
            r7 = r38
            defpackage.x37.b(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r12 = r26
            r7 = 1094713344(0x41400000, float:12.0)
            r8 = r41
            a74 r7 = defpackage.dj6.l(r8, r7)
            defpackage.gi2.h(r12, r7)
            r7 = 1128792064(0x43480000, float:200.0)
            r9 = 1
            a74 r7 = defpackage.dj6.m(r7, r9, r8)
            l26 r0 = defpackage.k26.a(r2, r1, r12, r0)
            long r1 = r12.T
            int r1 = java.lang.Long.hashCode(r1)
            xv4 r2 = r12.l()
            a74 r7 = defpackage.l.E(r12, r7)
            r12.f0()
            boolean r9 = r12.S
            if (r9 == 0) goto L262
            r12.k(r4)
            goto L265
        L262:
            r12.o0()
        L265:
            defpackage.yh2.K(r12, r3, r0)
            defpackage.yh2.K(r12, r5, r2)
            r0 = r33
            defpackage.i61.w(r1, r12, r6, r12, r0)
            r0 = r35
            defpackage.yh2.K(r12, r0, r7)
            r0 = r32
            long r9 = r0.h
            r1 = 4623226492472524800(0x4029000000000000, double:12.5)
            long r1 = defpackage.hi2.D(r1)
            r3 = 15
            long r18 = defpackage.hi2.E(r3)
            wz6 r3 = new wz6
            r4 = 6
            r3.<init>(r4)
            int r4 = r30 >> 3
            r4 = r4 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r28 = 3126(0xc36, float:4.38E-42)
            r29 = 119282(0x1d1f2, float:1.6715E-40)
            r5 = r8
            r8 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r20 = 2
            r21 = 0
            r22 = 2
            r23 = 0
            r24 = 0
            r25 = 0
            r7 = r39
            r17 = r3
            r27 = r4
            r26 = r12
            r11 = r1
            defpackage.x37.b(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            e33 r7 = defpackage.mp2.J()
            long r10 = r0.i
            r0 = 1099431936(0x41880000, float:17.0)
            a74 r12 = defpackage.dj6.i(r5, r0)
            r16 = 0
            r17 = 14
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r15 = 0
            a74 r9 = defpackage.ge7.S(r12, r13, r14, r15, r16, r17)
            r13 = 432(0x1b0, float:6.05E-43)
            r14 = 0
            r12 = r26
            defpackage.i13.a(r7, r8, r9, r10, r12, r13, r14)
            r9 = 1
            r12.p(r9)
            r12.p(r9)
            r4 = r43
            r3 = r31
            goto L2e5
        L2e0:
            r12.V()
            r3 = r5
            r4 = r9
        L2e5:
            cf5 r8 = r12.t()
            if (r8 == 0) goto L2fc
            jd5 r0 = new jd5
            r1 = r38
            r2 = r39
            r5 = r42
            r6 = r44
            r7 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.d = r0
        L2fc:
            return
    }

    public static final void b(java.lang.String r13, defpackage.a74 r14, defpackage.zv0 r15, defpackage.px0 r16, int r17) {
            r0 = r16
            xq2 r0 = (defpackage.xq2) r0
            r2 = -1065174758(0xffffffffc082b91a, float:-4.0850954)
            r0.d0(r2)
            boolean r2 = r0.f(r13)
            r3 = 2
            if (r2 == 0) goto L13
            r2 = 4
            goto L14
        L13:
            r2 = r3
        L14:
            r2 = r17 | r2
            r4 = 48
            r2 = r2 | r4
            r5 = r2 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            r7 = 0
            r8 = 1
            if (r5 == r6) goto L23
            r5 = r8
            goto L24
        L23:
            r5 = r7
        L24:
            r6 = r2 & 1
            boolean r5 = r0.S(r6, r5)
            if (r5 == 0) goto Lae
            r5 = 1065353216(0x3f800000, float:1.0)
            x64 r6 = defpackage.x64.a
            a74 r5 = defpackage.dj6.c(r6, r5)
            r9 = 1098907648(0x41800000, float:16.0)
            r10 = 0
            a74 r3 = defpackage.ge7.Q(r5, r9, r10, r3)
            eu r5 = defpackage.ju.c
            c40 r9 = defpackage.d90.k0
            yt0 r5 = defpackage.wt0.a(r5, r9, r0, r7)
            long r9 = r0.T
            int r9 = java.lang.Long.hashCode(r9)
            xv4 r10 = r0.l()
            a74 r3 = defpackage.l.E(r0, r3)
            ix0 r11 = defpackage.jx0.i
            r11.getClass()
            iy0 r11 = defpackage.ix0.b
            r0.f0()
            boolean r12 = r0.S
            if (r12 == 0) goto L63
            r0.k(r11)
            goto L66
        L63:
            r0.o0()
        L66:
            pn r11 = defpackage.ix0.f
            defpackage.yh2.K(r0, r11, r5)
            pn r5 = defpackage.ix0.e
            defpackage.yh2.K(r0, r5, r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            pn r9 = defpackage.ix0.g
            defpackage.yh2.K(r0, r9, r5)
            ne r5 = defpackage.ix0.h
            defpackage.yh2.F(r0, r5)
            pn r5 = defpackage.ix0.d
            defpackage.yh2.K(r0, r5, r3)
            r3 = 0
            if (r13 == 0) goto L95
            r5 = -762688195(0xffffffffd28a4d3d, float:-2.9700067E11)
            r0.b0(r5)
            r2 = r2 & 14
            defpackage.is7.e(r13, r3, r0, r2)
            r0.p(r7)
            goto La7
        L95:
            r2 = -762629698(0xffffffffd28b31be, float:-2.989175E11)
            r0.b0(r2)
            r2 = 1094713344(0x41400000, float:12.0)
            a74 r2 = defpackage.dj6.i(r6, r2)
            defpackage.gi2.h(r0, r2)
            r0.p(r7)
        La7:
            defpackage.is7.c(r3, r15, r0, r4)
            r0.p(r8)
            goto Lb2
        Lae:
            r0.V()
            r6 = r14
        Lb2:
            cf5 r7 = r0.t()
            if (r7 == 0) goto Lc6
            x3 r0 = new x3
            r5 = 28
            r1 = r13
            r3 = r15
            r4 = r17
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r7.d = r0
        Lc6:
            return
    }

    public static final void c(java.lang.String r29, boolean r30, boolean r31, defpackage.qn2 r32, defpackage.px0 r33, int r34) {
            r0 = r30
            r1 = r32
            r29.getClass()
            r1.getClass()
            r4 = r33
            xq2 r4 = (defpackage.xq2) r4
            r2 = 1706892854(0x65bd1e36, float:1.1163557E23)
            r4.d0(r2)
            r2 = r29
            boolean r3 = r4.f(r2)
            r5 = 2
            if (r3 == 0) goto L1f
            r3 = 4
            goto L20
        L1f:
            r3 = r5
        L20:
            r3 = r34 | r3
            r6 = 48
            r3 = r3 | r6
            boolean r7 = r4.g(r0)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L2f
            r7 = r8
            goto L31
        L2f:
            r7 = 128(0x80, float:1.8E-43)
        L31:
            r3 = r3 | r7
            r3 = r3 | 27648(0x6c00, float:3.8743E-41)
            boolean r7 = r4.h(r1)
            r9 = 131072(0x20000, float:1.83671E-40)
            if (r7 == 0) goto L3e
            r7 = r9
            goto L40
        L3e:
            r7 = 65536(0x10000, float:9.1835E-41)
        L40:
            r3 = r3 | r7
            r7 = 74899(0x12493, float:1.04956E-40)
            r7 = r7 & r3
            r10 = 74898(0x12492, float:1.04954E-40)
            r11 = 1
            r12 = 0
            if (r7 == r10) goto L4e
            r7 = r11
            goto L4f
        L4e:
            r7 = r12
        L4f:
            r10 = r3 & 1
            boolean r7 = r4.S(r10, r7)
            if (r7 == 0) goto L1b4
            es7 r7 = defpackage.bl2.F(r4)
            r10 = 1927471948(0x72e2e34c, float:8.987955E30)
            r4.b0(r10)
            r4.p(r12)
            r10 = -353462893(0xffffffffeaee9593, float:-1.44215345E26)
            r4.b0(r10)
            x64 r10 = defpackage.x64.a
            r13 = 1065353216(0x3f800000, float:1.0)
            a74 r14 = defpackage.dj6.c(r10, r13)
            r15 = 17548395(0x10bc46b, float:2.567119E-38)
            r4.b0(r15)
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r3
            if (r15 != r9) goto L7f
            r9 = r11
            goto L80
        L7f:
            r9 = r12
        L80:
            r15 = r3 & 896(0x380, float:1.256E-42)
            if (r15 != r8) goto L86
            r8 = r11
            goto L87
        L86:
            r8 = r12
        L87:
            r8 = r8 | r9
            java.lang.Object r9 = r4.P()
            if (r8 != 0) goto L92
            vs0 r8 = defpackage.ox0.a
            if (r9 != r8) goto L9a
        L92:
            q01 r9 = new q01
            r9.<init>(r1, r0, r11)
            r4.l0(r9)
        L9a:
            on2 r9 = (defpackage.on2) r9
            r8 = 15
            r15 = 0
            a74 r8 = defpackage.mb3.u(r14, r12, r15, r9, r8)
            r4.p(r12)
            r4.p(r12)
            a74 r8 = defpackage.jw2.j(r8, r13)
            r9 = 1111490560(0x42400000, float:48.0)
            r14 = 0
            a74 r5 = defpackage.dj6.f(r8, r9, r14, r5)
            r8 = 1097859072(0x41700000, float:15.0)
            r9 = 1095761920(0x41500000, float:13.0)
            a74 r5 = defpackage.ge7.P(r5, r8, r9)
            d40 r8 = defpackage.d90.i0
            du r9 = defpackage.ju.a
            l26 r6 = defpackage.k26.a(r9, r8, r4, r6)
            long r8 = r4.T
            int r8 = java.lang.Long.hashCode(r8)
            xv4 r9 = r4.l()
            a74 r5 = defpackage.l.E(r4, r5)
            ix0 r14 = defpackage.jx0.i
            r14.getClass()
            iy0 r14 = defpackage.ix0.b
            r4.f0()
            boolean r15 = r4.S
            if (r15 == 0) goto Le4
            r4.k(r14)
            goto Le7
        Le4:
            r4.o0()
        Le7:
            pn r15 = defpackage.ix0.f
            defpackage.yh2.K(r4, r15, r6)
            pn r6 = defpackage.ix0.e
            defpackage.yh2.K(r4, r6, r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            pn r9 = defpackage.ix0.g
            defpackage.yh2.K(r4, r9, r8)
            ne r8 = defpackage.ix0.h
            defpackage.yh2.F(r4, r8)
            pn r12 = defpackage.ix0.d
            defpackage.yh2.K(r4, r12, r5)
            vn3 r5 = new vn3
            r5.<init>(r13, r11)
            d90 r13 = defpackage.ju.d
            c40 r11 = defpackage.d90.k0
            r17 = r3
            r3 = 6
            yt0 r11 = defpackage.wt0.a(r13, r11, r4, r3)
            long r0 = r4.T
            int r0 = java.lang.Long.hashCode(r0)
            xv4 r1 = r4.l()
            a74 r5 = defpackage.l.E(r4, r5)
            r4.f0()
            boolean r13 = r4.S
            if (r13 == 0) goto L12d
            r4.k(r14)
            goto L130
        L12d:
            r4.o0()
        L130:
            defpackage.yh2.K(r4, r15, r11)
            defpackage.yh2.K(r4, r6, r1)
            defpackage.i61.w(r0, r4, r9, r4, r8)
            defpackage.yh2.K(r4, r12, r5)
            long r0 = r7.g
            r5 = 4623789442425946112(0x402b000000000000, double:13.5)
            long r6 = defpackage.hi2.D(r5)
            r5 = 17
            long r13 = defpackage.hi2.E(r5)
            oj2 r8 = defpackage.oj2.Z
            r5 = r17 & 14
            r9 = 199680(0x30c00, float:2.79811E-40)
            r22 = r5 | r9
            r23 = 3126(0xc36, float:4.38E-42)
            r24 = 119762(0x1d3d2, float:1.67822E-40)
            r5 = r3
            r3 = 0
            r9 = 0
            r12 = r10
            r10 = 0
            r15 = r12
            r12 = 0
            r18 = r15
            r15 = 2
            r19 = 1
            r16 = 0
            r20 = r17
            r17 = 2
            r21 = r18
            r18 = 0
            r25 = r19
            r19 = 0
            r26 = r20
            r20 = 0
            r27 = r21
            r21 = r4
            r28 = r25
            r25 = r5
            r4 = r0
            r0 = r28
            r1 = 0
            defpackage.x37.b(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4 = r21
            r2 = 1548234674(0x5c482fb2, float:2.2538975E17)
            r4.b0(r2)
            r4.p(r1)
            r4.p(r0)
            r1 = 1098907648(0x41800000, float:16.0)
            r12 = r27
            a74 r1 = defpackage.dj6.l(r12, r1)
            defpackage.gi2.h(r4, r1)
            int r1 = r26 >> 6
            r1 = r1 & 14
            r5 = r1 | 3072(0xc00, float:4.305E-42)
            r6 = 4
            r2 = 0
            r3 = 1
            r1 = r32
            r7 = r0
            r0 = r30
            defpackage.is7.f(r0, r1, r2, r3, r4, r5, r6)
            r4.p(r7)
            goto L1b9
        L1b4:
            r4.V()
            r3 = r31
        L1b9:
            cf5 r6 = r4.t()
            if (r6 == 0) goto L1ce
            xf4 r0 = new xf4
            r1 = r29
            r2 = r30
            r4 = r32
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L1ce:
            return
    }
}
