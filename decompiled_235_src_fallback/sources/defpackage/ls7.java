package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ls7  reason: default package */
/* loaded from: classes.dex */
public abstract class ls7 {
    public static final defpackage.y16 a = null;

    static {
            y16 r0 = defpackage.z16.a
            defpackage.ls7.a = r0
            return
    }

    public static final void a(defpackage.a74 r42, java.lang.String r43, defpackage.ke6 r44, defpackage.e33 r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, int r49, long r50, defpackage.px0 r52, int r53, int r54) {
            r1 = r42
            r2 = r43
            r11 = r53
            r12 = r54
            r46.getClass()
            r47.getClass()
            r8 = r52
            xq2 r8 = (defpackage.xq2) r8
            r0 = -1625939988(0xffffffff9f161fec, float:-3.179014E-20)
            r8.d0(r0)
            boolean r0 = r8.f(r1)
            if (r0 == 0) goto L20
            r0 = 4
            goto L21
        L20:
            r0 = 2
        L21:
            r0 = r0 | r11
            boolean r3 = r8.f(r2)
            if (r3 == 0) goto L2b
            r3 = 32
            goto L2d
        L2b:
            r3 = 16
        L2d:
            r0 = r0 | r3
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L49
            r3 = r12 & 4
            if (r3 != 0) goto L41
            r3 = r44
            boolean r4 = r8.f(r3)
            if (r4 == 0) goto L43
            r4 = 256(0x100, float:3.59E-43)
            goto L45
        L41:
            r3 = r44
        L43:
            r4 = 128(0x80, float:1.8E-43)
        L45:
            r0 = r0 | r4
        L46:
            r13 = r45
            goto L4c
        L49:
            r3 = r44
            goto L46
        L4c:
            boolean r4 = r8.f(r13)
            if (r4 == 0) goto L55
            r4 = 2048(0x800, float:2.87E-42)
            goto L57
        L55:
            r4 = 1024(0x400, float:1.435E-42)
        L57:
            r0 = r0 | r4
            r14 = r46
            boolean r4 = r8.f(r14)
            if (r4 == 0) goto L63
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L65
        L63:
            r4 = 8192(0x2000, float:1.148E-41)
        L65:
            r0 = r0 | r4
            r15 = r47
            boolean r4 = r8.f(r15)
            if (r4 == 0) goto L71
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L73
        L71:
            r4 = 65536(0x10000, float:9.1835E-41)
        L73:
            r0 = r0 | r4
            r4 = r48
            boolean r5 = r8.f(r4)
            if (r5 == 0) goto L7f
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L81
        L7f:
            r5 = 524288(0x80000, float:7.34684E-40)
        L81:
            r0 = r0 | r5
            r5 = r12 & 128(0x80, float:1.8E-43)
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L8c
            r0 = r0 | r6
        L89:
            r6 = r49
            goto L9d
        L8c:
            r6 = r6 & r11
            if (r6 != 0) goto L89
            r6 = r49
            boolean r7 = r8.d(r6)
            if (r7 == 0) goto L9a
            r7 = 8388608(0x800000, float:1.1754944E-38)
            goto L9c
        L9a:
            r7 = 4194304(0x400000, float:5.877472E-39)
        L9c:
            r0 = r0 | r7
        L9d:
            r7 = r12 & 256(0x100, float:3.59E-43)
            r9 = 100663296(0x6000000, float:2.4074124E-35)
            if (r7 == 0) goto La7
            r0 = r0 | r9
        La4:
            r9 = r50
            goto Lb9
        La7:
            r9 = r9 & r11
            if (r9 != 0) goto La4
            r9 = r50
            boolean r16 = r8.e(r9)
            if (r16 == 0) goto Lb5
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lb7
        Lb5:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        Lb7:
            r0 = r0 | r16
        Lb9:
            r16 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r0 & r16
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            r16 = r7
            r7 = 1
            if (r3 == r4) goto Lc8
            r3 = r7
            goto Lc9
        Lc8:
            r3 = 0
        Lc9:
            r4 = r0 & 1
            boolean r3 = r8.S(r4, r3)
            if (r3 == 0) goto L44b
            r8.X()
            r3 = r11 & 1
            if (r3 == 0) goto Lf0
            boolean r3 = r8.B()
            if (r3 == 0) goto Ldf
            goto Lf0
        Ldf:
            r8.V()
            r3 = r12 & 4
            if (r3 == 0) goto Le8
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
        Le8:
            r36 = r49
            r16 = r0
            r3 = r9
            r0 = r44
            goto L10f
        Lf0:
            r3 = r12 & 4
            if (r3 == 0) goto Lfd
            r3 = 1092616192(0x41200000, float:10.0)
            y16 r3 = defpackage.z16.b(r3)
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
            goto Lff
        Lfd:
            r3 = r44
        Lff:
            if (r5 == 0) goto L103
            r4 = r7
            goto L105
        L103:
            r4 = r49
        L105:
            if (r16 == 0) goto L109
            long r9 = defpackage.es7.p
        L109:
            r16 = r0
            r0 = r3
            r36 = r4
            r3 = r9
        L10f:
            r8.q()
            es7 r5 = defpackage.fs7.a
            r9 = 1097859072(0x41700000, float:15.0)
            y16 r19 = defpackage.z16.b(r9)
            r9 = 1094713344(0x41400000, float:12.0)
            a74 r10 = defpackage.ge7.O(r1, r9)
            r9 = 1137180672(0x43c80000, float:400.0)
            a74 r17 = defpackage.dj6.m(r9, r7, r10)
            r21 = 0
            r23 = 28
            r18 = 1092616192(0x41200000, float:10.0)
            r20 = 0
            a74 r9 = defpackage.nj2.E(r17, r18, r19, r20, r21, r23)
            r10 = r19
            a74 r9 = defpackage.u24.g(r9, r10)
            r32 = r8
            long r7 = r5.d
            jy2 r6 = defpackage.u24.m
            a74 r7 = defpackage.vy7.L(r9, r7, r6)
            r8 = 1051931443(0x3eb33333, float:0.35)
            long r8 = defpackage.kt0.c(r8, r3)
            r1 = 1065353216(0x3f800000, float:1.0)
            a74 r1 = defpackage.ak7.I(r7, r1, r8, r10)
            e40 r7 = defpackage.d90.L
            r8 = 0
            e34 r7 = defpackage.h70.d(r7, r8)
            r8 = r32
            long r9 = r8.T
            int r9 = java.lang.Long.hashCode(r9)
            xv4 r10 = r8.l()
            a74 r1 = defpackage.l.E(r8, r1)
            ix0 r18 = defpackage.jx0.i
            r18.getClass()
            r18 = r3
            iy0 r4 = defpackage.ix0.b
            r8.f0()
            boolean r3 = r8.S
            if (r3 == 0) goto L17a
            r8.k(r4)
            goto L17d
        L17a:
            r8.o0()
        L17d:
            pn r3 = defpackage.ix0.f
            defpackage.yh2.K(r8, r3, r7)
            pn r7 = defpackage.ix0.e
            defpackage.yh2.K(r8, r7, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            pn r10 = defpackage.ix0.g
            defpackage.yh2.K(r8, r10, r9)
            ne r9 = defpackage.ix0.h
            defpackage.yh2.F(r8, r9)
            r49 = r6
            pn r6 = defpackage.ix0.d
            defpackage.yh2.K(r8, r6, r1)
            x64 r1 = defpackage.x64.a
            r50 = r5
            r5 = 1094713344(0x41400000, float:12.0)
            a74 r11 = defpackage.ge7.O(r1, r5)
            d40 r12 = defpackage.d90.i0
            du r13 = defpackage.ju.a
            r14 = 48
            l26 r5 = defpackage.k26.a(r13, r12, r8, r14)
            long r14 = r8.T
            int r14 = java.lang.Long.hashCode(r14)
            xv4 r15 = r8.l()
            a74 r11 = defpackage.l.E(r8, r11)
            r8.f0()
            r26 = r12
            boolean r12 = r8.S
            if (r12 == 0) goto L1cb
            r8.k(r4)
            goto L1ce
        L1cb:
            r8.o0()
        L1ce:
            defpackage.yh2.K(r8, r3, r5)
            defpackage.yh2.K(r8, r7, r15)
            defpackage.i61.w(r14, r8, r10, r8, r9)
            defpackage.yh2.K(r8, r6, r11)
            r5 = 1111490560(0x42400000, float:48.0)
            if (r2 == 0) goto L1e4
            boolean r11 = defpackage.qs6.v0(r2)
            if (r11 == 0) goto L1f5
        L1e4:
            r2 = r3
            r15 = r4
            r38 = r6
            r14 = r7
            r37 = r9
            r17 = r10
            r44 = r13
            r11 = r18
            r13 = 0
            r21 = 1094713344(0x41400000, float:12.0)
            goto L24e
        L1f5:
            r11 = -147074699(0xfffffffff73bd175, float:-3.8094055E33)
            r8.b0(r11)
            x23 r11 = new x23
            nq6 r12 = defpackage.kf.b
            java.lang.Object r12 = r8.j(r12)
            android.content.Context r12 = (android.content.Context) r12
            r11.<init>(r12)
            r11.c = r2
            r12 = 0
            r11.b(r12)
            z23 r11 = r11.a()
            a74 r5 = defpackage.dj6.i(r1, r5)
            a74 r5 = defpackage.u24.g(r5, r0)
            r14 = r9
            r9 = 48
            r15 = r10
            r10 = 4088(0xff8, float:5.729E-42)
            r17 = r4
            r4 = 0
            r20 = r6
            r6 = 0
            r21 = r7
            r7 = 0
            r44 = r17
            r17 = r15
            r15 = r44
            r2 = r3
            r3 = r11
            r44 = r13
            r37 = r14
            r38 = r20
            r14 = r21
            r21 = 1094713344(0x41400000, float:12.0)
            r13 = r12
            r11 = r18
            defpackage.gi2.b(r3, r4, r5, r6, r7, r8, r9, r10)
            r8.p(r13)
            r6 = r11
            r11 = r17
            r12 = r37
            r39 = r38
            r3 = 1
            goto L2c6
        L24e:
            r3 = -147409995(0xfffffffff736b3b5, float:-3.7056364E33)
            r8.b0(r3)
            a74 r3 = defpackage.dj6.i(r1, r5)
            a74 r3 = defpackage.u24.g(r3, r0)
            r4 = 1043878380(0x3e3851ec, float:0.18)
            long r4 = defpackage.kt0.c(r4, r11)
            r6 = r49
            a74 r3 = defpackage.vy7.L(r3, r4, r6)
            e40 r4 = defpackage.d90.Z
            e34 r4 = defpackage.h70.d(r4, r13)
            long r5 = r8.T
            int r5 = java.lang.Long.hashCode(r5)
            xv4 r6 = r8.l()
            a74 r3 = defpackage.l.E(r8, r3)
            r8.f0()
            boolean r7 = r8.S
            if (r7 == 0) goto L288
            r8.k(r15)
            goto L28b
        L288:
            r8.o0()
        L28b:
            defpackage.yh2.K(r8, r2, r4)
            defpackage.yh2.K(r8, r14, r6)
            r4 = r17
            r6 = r37
            defpackage.i61.w(r5, r8, r4, r8, r6)
            r5 = r38
            defpackage.yh2.K(r8, r5, r3)
            r3 = 1104150528(0x41d00000, float:26.0)
            a74 r3 = defpackage.dj6.i(r1, r3)
            int r7 = r16 >> 9
            r7 = r7 & 14
            r7 = r7 | 432(0x1b0, float:6.05E-43)
            int r9 = r16 >> 15
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r7
            r10 = 0
            r4 = 0
            r40 = r11
            r12 = r6
            r6 = r40
            r39 = r5
            r11 = r17
            r5 = r3
            r3 = r45
            defpackage.i13.a(r3, r4, r5, r6, r8, r9, r10)
            r3 = 1
            r8.p(r3)
            r8.p(r13)
        L2c6:
            r24 = 0
            r25 = 14
            r22 = 0
            r23 = 0
            r20 = r1
            a74 r1 = defpackage.ge7.S(r20, r21, r22, r23, r24, r25)
            r4 = r20
            r5 = r21
            eu r9 = defpackage.ju.c
            c40 r10 = defpackage.d90.k0
            yt0 r9 = defpackage.wt0.a(r9, r10, r8, r13)
            r18 = r6
            long r5 = r8.T
            int r5 = java.lang.Long.hashCode(r5)
            xv4 r6 = r8.l()
            a74 r1 = defpackage.l.E(r8, r1)
            r8.f0()
            boolean r7 = r8.S
            if (r7 == 0) goto L2fb
            r8.k(r15)
            goto L2fe
        L2fb:
            r8.o0()
        L2fe:
            defpackage.yh2.K(r8, r2, r9)
            defpackage.yh2.K(r8, r14, r6)
            defpackage.i61.w(r5, r8, r11, r8, r12)
            r5 = r39
            defpackage.yh2.K(r8, r5, r1)
            r7 = r44
            r1 = r26
            r6 = 48
            l26 r1 = defpackage.k26.a(r7, r1, r8, r6)
            long r6 = r8.T
            int r6 = java.lang.Long.hashCode(r6)
            xv4 r7 = r8.l()
            a74 r9 = defpackage.l.E(r8, r4)
            r8.f0()
            boolean r10 = r8.S
            if (r10 == 0) goto L32f
            r8.k(r15)
            goto L332
        L32f:
            r8.o0()
        L332:
            defpackage.yh2.K(r8, r2, r1)
            defpackage.yh2.K(r8, r14, r7)
            defpackage.i61.w(r6, r8, r11, r8, r12)
            defpackage.yh2.K(r8, r5, r9)
            r5 = 1094713344(0x41400000, float:12.0)
            a74 r5 = defpackage.dj6.i(r4, r5)
            int r1 = r16 >> 9
            r1 = r1 & 14
            r1 = r1 | 432(0x1b0, float:6.05E-43)
            int r2 = r16 >> 15
            r6 = r2 & 7168(0x1c00, float:1.0045E-41)
            r9 = r1 | r6
            r10 = 0
            r20 = r4
            r4 = 0
            r1 = r3
            r6 = r18
            r3 = r45
            defpackage.i13.a(r3, r4, r5, r6, r8, r9, r10)
            sr2 r3 = defpackage.qs7.c
            r4 = 9
            long r17 = defpackage.hi2.E(r4)
            oj2 r19 = defpackage.oj2.e0
            r4 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            long r4 = defpackage.hi2.D(r4)
            r24 = 0
            r25 = 14
            r21 = 1084227584(0x40a00000, float:5.0)
            r22 = 0
            r23 = 0
            a74 r14 = defpackage.ge7.S(r20, r21, r22, r23, r24, r25)
            r9 = r20
            int r10 = r16 >> 12
            r11 = r10 & 14
            r12 = 14355504(0xdb0c30, float:2.0116346E-38)
            r11 = r11 | r12
            int r12 = r16 >> 18
            r15 = r12 & 896(0x380, float:1.256E-42)
            r33 = r11 | r15
            r34 = 0
            r35 = 130832(0x1ff10, float:1.83335E-40)
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r20 = r3
            r21 = r4
            r15 = r6
            r32 = r8
            r8 = r13
            r13 = r46
            r3 = r50
            defpackage.x37.b(r13, r14, r15, r17, r19, r20, r21, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r4 = r32
            r4.p(r1)
            long r13 = r3.g
            pi2 r5 = defpackage.qs7.a
            r11 = 15
            long r17 = defpackage.hi2.E(r11)
            oj2 r19 = defpackage.oj2.d0
            r24 = 0
            r25 = 13
            r21 = 0
            r22 = 1073741824(0x40000000, float:2.0)
            r23 = 0
            r20 = r9
            a74 r9 = defpackage.ge7.S(r20, r21, r22, r23, r24, r25)
            r15 = 1772976(0x1b0db0, float:2.484469E-39)
            r2 = r2 & 14
            r33 = r2 | r15
            r34 = 3120(0xc30, float:4.372E-42)
            r35 = 120720(0x1d790, float:1.69165E-40)
            r21 = 0
            r23 = 0
            r24 = 0
            r26 = 2
            r28 = 1
            r20 = r5
            r15 = r13
            r13 = r47
            r14 = r9
            defpackage.x37.b(r13, r14, r15, r17, r19, r20, r21, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r2 = defpackage.qs6.v0(r48)
            if (r2 != 0) goto L438
            r2 = 1457584335(0x56e0f8cf, float:1.23679615E14)
            r4.b0(r2)
            long r2 = r3.h
            pi2 r20 = defpackage.qs7.b
            r13 = 4622663542519103488(0x4027000000000000, double:11.5)
            long r17 = defpackage.hi2.D(r13)
            long r24 = defpackage.hi2.E(r11)
            r5 = 1576320(0x180d80, float:2.208895E-39)
            r9 = r12 & 14
            r33 = r9 | r5
            r5 = r10 & 7168(0x1c00, float:1.0045E-41)
            r34 = r5 | 54
            r35 = 119730(0x1d3b2, float:1.67777E-40)
            r14 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 2
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r13 = r48
            r15 = r2
            r32 = r4
            r28 = r36
            defpackage.x37.b(r13, r14, r15, r17, r19, r20, r21, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r4.p(r8)
            goto L443
        L438:
            r28 = r36
            r2 = 1457947190(0x56e68236, float:1.2672346E14)
            r4.b0(r2)
            r4.p(r8)
        L443:
            defpackage.i61.y(r4, r1, r1, r1)
            r3 = r0
            r9 = r6
            r8 = r28
            goto L453
        L44b:
            r4 = r8
            r4.V()
            r3 = r44
            r8 = r49
        L453:
            cf5 r13 = r4.t()
            if (r13 == 0) goto L470
            ks7 r0 = new ks7
            r1 = r42
            r2 = r43
            r4 = r45
            r5 = r46
            r6 = r47
            r7 = r48
            r11 = r53
            r12 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12)
            r13.d = r0
        L470:
            return
    }
}
