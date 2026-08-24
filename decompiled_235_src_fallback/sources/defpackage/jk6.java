package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jk6  reason: default package */
/* loaded from: classes.dex */
public abstract class jk6 {
    public static final defpackage.a74 a = null;
    public static final defpackage.sc7 b = null;

    static {
            r0 = 2
            r1 = 0
            x64 r2 = defpackage.x64.a
            a74 r0 = defpackage.dj6.m(r1, r0, r2)
            r2 = 1
            r3 = 1111490560(0x42400000, float:48.0)
            a74 r0 = defpackage.dj6.f(r0, r1, r3, r2)
            defpackage.jk6.a = r0
            sc7 r0 = new sc7
            r1 = 0
            r2 = 6
            r3 = 100
            r0.<init>(r3, r1, r2)
            defpackage.jk6.b = r0
            return
    }

    public static final void a(defpackage.qn2 r12, defpackage.bs0 r13, defpackage.bs0 r14, defpackage.qa4 r15, float r16, defpackage.px0 r17, int r18) {
            r0 = r17
            xq2 r0 = (defpackage.xq2) r0
            r1 = -743965752(0xffffffffd3a7fbc8, float:-1.4429675E12)
            r0.d0(r1)
            boolean r1 = r0.h(r12)
            r2 = 4
            if (r1 == 0) goto L13
            r1 = r2
            goto L14
        L13:
            r1 = 2
        L14:
            r1 = r18 | r1
            boolean r3 = r0.f(r13)
            r4 = 32
            if (r3 == 0) goto L20
            r3 = r4
            goto L22
        L20:
            r3 = 16
        L22:
            r1 = r1 | r3
            boolean r3 = r0.f(r14)
            r5 = 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L2d
            r3 = r5
            goto L2f
        L2d:
            r3 = 128(0x80, float:1.8E-43)
        L2f:
            r1 = r1 | r3
            r8 = r16
            boolean r3 = r0.c(r8)
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L3c
            r3 = r6
            goto L3e
        L3c:
            r3 = 8192(0x2000, float:1.148E-41)
        L3e:
            r1 = r1 | r3
            r3 = r1 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            r9 = 0
            r11 = 1
            if (r3 == r7) goto L49
            r3 = r11
            goto L4a
        L49:
            r3 = r9
        L4a:
            r7 = r1 & 1
            boolean r3 = r0.S(r7, r3)
            if (r3 == 0) goto L8f
            r3 = r1 & 112(0x70, float:1.57E-43)
            if (r3 != r4) goto L58
            r3 = r11
            goto L59
        L58:
            r3 = r9
        L59:
            r4 = r1 & 14
            if (r4 != r2) goto L5f
            r2 = r11
            goto L60
        L5f:
            r2 = r9
        L60:
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            if (r3 != r6) goto L69
            r3 = r11
            goto L6a
        L69:
            r3 = r9
        L6a:
            r2 = r2 | r3
            r1 = r1 & 896(0x380, float:1.256E-42)
            if (r1 != r5) goto L70
            r9 = r11
        L70:
            r1 = r2 | r9
            java.lang.Object r2 = r0.P()
            if (r1 != 0) goto L7c
            vs0 r1 = defpackage.ox0.a
            if (r2 != r1) goto L89
        L7c:
            vj6 r5 = new vj6
            r7 = r12
            r6 = r13
            r10 = r14
            r9 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r0.l0(r5)
            r2 = r5
        L89:
            on2 r2 = (defpackage.on2) r2
            defpackage.mb3.n(r2, r0)
            goto L92
        L8f:
            r0.V()
        L92:
            cf5 r0 = r0.t()
            if (r0 == 0) goto La7
            wj6 r5 = new wj6
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.d = r5
        La7:
            return
    }

    public static final void b(float r26, defpackage.qn2 r27, defpackage.a74 r28, boolean r29, defpackage.bs0 r30, int r31, defpackage.on2 r32, defpackage.cf1 r33, defpackage.px0 r34, int r35, int r36) {
            r5 = r26
            r11 = r27
            r8 = r30
            r13 = r35
            r14 = r34
            xq2 r14 = (defpackage.xq2) r14
            r0 = -1962335196(0xffffffff8b092424, float:-2.641243E-32)
            r14.d0(r0)
            r0 = r13 & 6
            if (r0 != 0) goto L21
            boolean r0 = r14.c(r5)
            if (r0 == 0) goto L1e
            r0 = 4
            goto L1f
        L1e:
            r0 = 2
        L1f:
            r0 = r0 | r13
            goto L22
        L21:
            r0 = r13
        L22:
            r1 = r13 & 48
            if (r1 != 0) goto L32
            boolean r1 = r14.h(r11)
            if (r1 == 0) goto L2f
            r1 = 32
            goto L31
        L2f:
            r1 = 16
        L31:
            r0 = r0 | r1
        L32:
            r1 = r36 & 4
            if (r1 == 0) goto L3b
            r0 = r0 | 384(0x180, float:5.38E-43)
        L38:
            r2 = r28
            goto L4d
        L3b:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L38
            r2 = r28
            boolean r3 = r14.f(r2)
            if (r3 == 0) goto L4a
            r3 = 256(0x100, float:3.59E-43)
            goto L4c
        L4a:
            r3 = 128(0x80, float:1.8E-43)
        L4c:
            r0 = r0 | r3
        L4d:
            r3 = r36 & 8
            if (r3 == 0) goto L56
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L53:
            r4 = r29
            goto L68
        L56:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L53
            r4 = r29
            boolean r6 = r14.g(r4)
            if (r6 == 0) goto L65
            r6 = 2048(0x800, float:2.87E-42)
            goto L67
        L65:
            r6 = 1024(0x400, float:1.435E-42)
        L67:
            r0 = r0 | r6
        L68:
            r6 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L78
            boolean r6 = r14.f(r8)
            if (r6 == 0) goto L75
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L77
        L75:
            r6 = 8192(0x2000, float:1.148E-41)
        L77:
            r0 = r0 | r6
        L78:
            r6 = r36 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L82
            r0 = r0 | r9
        L7f:
            r9 = r31
            goto L93
        L82:
            r9 = r9 & r13
            if (r9 != 0) goto L7f
            r9 = r31
            boolean r10 = r14.d(r9)
            if (r10 == 0) goto L90
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L92
        L90:
            r10 = 65536(0x10000, float:9.1835E-41)
        L92:
            r0 = r0 | r10
        L93:
            r10 = r36 & 64
            r12 = 1572864(0x180000, float:2.204052E-39)
            if (r10 == 0) goto L9d
            r0 = r0 | r12
        L9a:
            r12 = r32
            goto Lae
        L9d:
            r12 = r12 & r13
            if (r12 != 0) goto L9a
            r12 = r32
            boolean r15 = r14.h(r12)
            if (r15 == 0) goto Lab
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto Lad
        Lab:
            r15 = 524288(0x80000, float:7.34684E-40)
        Lad:
            r0 = r0 | r15
        Lae:
            r15 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r15
            r15 = 100663296(0x6000000, float:2.4074124E-35)
            r15 = r15 & r13
            if (r15 != 0) goto Lc6
            r15 = r33
            boolean r16 = r14.f(r15)
            if (r16 == 0) goto Lc1
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lc3
        Lc1:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        Lc3:
            r0 = r0 | r16
            goto Lc8
        Lc6:
            r15 = r33
        Lc8:
            r16 = 38347923(0x2492493, float:1.4777644E-37)
            r7 = r0 & r16
            r16 = r0
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            r17 = r1
            if (r7 == r0) goto Ld8
            r0 = 1
            goto Ld9
        Ld8:
            r0 = 0
        Ld9:
            r7 = r16 & 1
            boolean r0 = r14.S(r7, r0)
            if (r0 == 0) goto L1f5
            r14.X()
            r0 = r13 & 1
            if (r0 == 0) goto Lf5
            boolean r0 = r14.B()
            if (r0 == 0) goto Lef
            goto Lf5
        Lef:
            r14.V()
            r0 = r2
        Lf3:
            r6 = r4
            goto L105
        Lf5:
            if (r17 == 0) goto Lfa
            x64 r0 = defpackage.x64.a
            goto Lfb
        Lfa:
            r0 = r2
        Lfb:
            if (r3 == 0) goto Lfe
            r4 = 1
        Lfe:
            if (r6 == 0) goto L101
            r9 = 0
        L101:
            if (r10 == 0) goto Lf3
            r12 = 0
            goto Lf3
        L105:
            r14.q()
            r2 = -1127489737(0xffffffffbccbdf37, float:-0.02488671)
            r14.b0(r2)
            java.lang.Object r2 = r14.P()
            vs0 r3 = defpackage.ox0.a
            if (r2 != r3) goto L11a
            r94 r2 = defpackage.i61.f(r14)
        L11a:
            r94 r2 = (defpackage.r94) r2
            r4 = 0
            r14.p(r4)
            java.lang.String r4 = "steps should be >= 0"
            r17 = r4
            if (r9 < 0) goto L1f1
            qa4 r4 = defpackage.np2.b0(r11, r14)
            qa4 r18 = defpackage.np2.b0(r12, r14)
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r16 & r10
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r10 != r7) goto L138
            r7 = 1
            goto L139
        L138:
            r7 = 0
        L139:
            java.lang.Object r10 = r14.P()
            if (r7 != 0) goto L141
            if (r10 != r3) goto L167
        L141:
            if (r9 != 0) goto L147
            yt1 r3 = defpackage.yt1.A
            r10 = r3
            goto L164
        L147:
            int r3 = r9 + 2
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
            r10 = 0
        L14f:
            if (r10 >= r3) goto L163
            float r1 = (float) r10
            r28 = r1
            int r1 = r9 + 1
            float r1 = (float) r1
            float r1 = r28 / r1
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r7.add(r1)
            int r10 = r10 + 1
            goto L14f
        L163:
            r10 = r7
        L164:
            r14.l0(r10)
        L167:
            r19 = r10
            java.util.List r19 = (java.util.List) r19
            nq6 r1 = defpackage.u93.a
            m64 r1 = defpackage.m64.a
            a74 r20 = r0.d(r1)
            r24 = 0
            r25 = 12
            r21 = 1101004800(0x41a00000, float:20.0)
            r23 = 0
            r22 = r21
            a74 r1 = defpackage.dj6.h(r20, r21, r22, r23, r24, r25)
            float r3 = r8.a
            float r7 = r8.b
            float r10 = defpackage.gi2.p(r5, r3, r7)
            r7 = r6
            uj6 r6 = new uj6
            r16 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3 = 0
            a74 r1 = defpackage.ua6.a(r1, r3, r6)
            f45 r6 = new f45
            r6.<init>(r5, r8, r9)
            r10 = 1
            a74 r1 = defpackage.ua6.a(r1, r10, r6)
            a74 r11 = defpackage.nw7.d0(r1, r7, r2)
            nq6 r1 = defpackage.ky0.n
            java.lang.Object r1 = r14.j(r1)
            kk3 r6 = defpackage.kk3.Rtl
            if (r1 != r6) goto L1b0
            r6 = r10
            goto L1b1
        L1b0:
            r6 = r3
        L1b1:
            if (r9 < 0) goto L1ed
            r1 = r0
            gk6 r0 = new gk6
            r3 = r8
            r8 = r2
            r2 = r3
            r3 = r9
            r10 = r16
            r9 = r1
            r1 = r7
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            r16 = r3
            a74 r11 = defpackage.u24.A(r11, r0)
            sj6 r0 = new sj6
            r2 = r26
            r1 = r30
            r6 = r7
            r5 = r8
            r7 = r15
            r3 = r19
            r8 = r4
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r7 = r6
            r1 = 2085116814(0x7c485b8e, float:4.1612653E36)
            zv0 r0 = defpackage.n16.I(r1, r0, r14)
            r1 = 3072(0xc00, float:4.305E-42)
            defpackage.nw7.j(r11, r10, r0, r14, r1)
            r4 = r7
            r3 = r9
            r6 = r16
        L1eb:
            r7 = r12
            goto L1fb
        L1ed:
            defpackage.i.h(r17)
            return
        L1f1:
            defpackage.i.h(r17)
            return
        L1f5:
            r14.V()
            r3 = r2
            r6 = r9
            goto L1eb
        L1fb:
            cf5 r11 = r14.t()
            if (r11 == 0) goto L213
            tj6 r0 = new tj6
            r1 = r26
            r2 = r27
            r5 = r30
            r8 = r33
            r10 = r36
            r9 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.d = r0
        L213:
            return
    }

    public static final void c(boolean r19, float r20, java.util.List r21, defpackage.cf1 r22, float r23, defpackage.r94 r24, defpackage.a74 r25, defpackage.px0 r26, int r27) {
            r2 = r20
            r9 = r23
            r10 = r25
            r7 = r26
            xq2 r7 = (defpackage.xq2) r7
            r0 = 1679682785(0x641dece1, float:1.1652831E22)
            r7.d0(r0)
            r1 = r19
            boolean r0 = r7.g(r1)
            if (r0 == 0) goto L1a
            r0 = 4
            goto L1b
        L1a:
            r0 = 2
        L1b:
            r0 = r27 | r0
            boolean r3 = r7.c(r2)
            if (r3 == 0) goto L26
            r3 = 32
            goto L28
        L26:
            r3 = 16
        L28:
            r0 = r0 | r3
            r3 = r21
            boolean r4 = r7.h(r3)
            if (r4 == 0) goto L34
            r4 = 256(0x100, float:3.59E-43)
            goto L36
        L34:
            r4 = 128(0x80, float:1.8E-43)
        L36:
            r0 = r0 | r4
            r4 = r22
            boolean r5 = r7.f(r4)
            if (r5 == 0) goto L42
            r5 = 2048(0x800, float:2.87E-42)
            goto L44
        L42:
            r5 = 1024(0x400, float:1.435E-42)
        L44:
            r0 = r0 | r5
            boolean r5 = r7.c(r9)
            if (r5 == 0) goto L4e
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L50
        L4e:
            r5 = 8192(0x2000, float:1.148E-41)
        L50:
            r0 = r0 | r5
            r11 = r24
            boolean r5 = r7.f(r11)
            if (r5 == 0) goto L5c
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L5e
        L5c:
            r5 = 65536(0x10000, float:9.1835E-41)
        L5e:
            r0 = r0 | r5
            boolean r5 = r7.f(r10)
            if (r5 == 0) goto L68
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L6a
        L68:
            r5 = 524288(0x80000, float:7.34684E-40)
        L6a:
            r12 = r0 | r5
            r0 = 599187(0x92493, float:8.3964E-40)
            r0 = r0 & r12
            r5 = 599186(0x92492, float:8.39638E-40)
            r6 = 0
            if (r0 == r5) goto L78
            r0 = 1
            goto L79
        L78:
            r0 = r6
        L79:
            r5 = r12 & 1
            boolean r0 = r7.S(r5, r0)
            if (r0 == 0) goto L133
            a74 r0 = defpackage.jk6.a
            a74 r0 = r10.d(r0)
            e40 r5 = defpackage.d90.L
            e34 r5 = defpackage.h70.d(r5, r6)
            int r6 = defpackage.ge7.B(r7)
            xv4 r8 = r7.l()
            a74 r0 = defpackage.l.E(r7, r0)
            ix0 r14 = defpackage.jx0.i
            r14.getClass()
            iy0 r14 = defpackage.ix0.b
            r7.f0()
            boolean r15 = r7.S
            if (r15 == 0) goto Lab
            r7.k(r14)
            goto Lae
        Lab:
            r7.o0()
        Lae:
            pn r14 = defpackage.ix0.f
            defpackage.yh2.K(r7, r14, r5)
            pn r5 = defpackage.ix0.e
            defpackage.yh2.K(r7, r5, r8)
            pn r5 = defpackage.ix0.g
            boolean r8 = r7.S
            if (r8 != 0) goto Lcc
            java.lang.Object r8 = r7.P()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            boolean r8 = defpackage.nb3.k(r8, r14)
            if (r8 != 0) goto Lcf
        Lcc:
            defpackage.i61.v(r6, r7, r6, r5)
        Lcf:
            pn r5 = defpackage.ix0.d
            defpackage.yh2.K(r7, r5, r0)
            nq6 r0 = defpackage.ky0.h
            java.lang.Object r0 = r7.j(r0)
            qh1 r0 = (defpackage.qh1) r0
            r5 = 1082130432(0x40800000, float:4.0)
            float r6 = r0.e0(r5)
            r5 = 1092616192(0x41200000, float:10.0)
            float r5 = r0.e0(r5)
            float r0 = r0.T(r9)
            float r14 = r0 * r2
            lc2 r0 = defpackage.dj6.c
            int r15 = r12 >> 6
            r8 = r15 & 112(0x70, float:1.57E-43)
            r8 = r8 | 3078(0xc06, float:4.313E-42)
            int r13 = r12 << 6
            r13 = r13 & 896(0x380, float:1.256E-42)
            r8 = r8 | r13
            int r13 = r12 << 9
            r16 = 57344(0xe000, float:8.0356E-41)
            r17 = r13 & r16
            r8 = r8 | r17
            r17 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r17
            r8 = r8 | r13
            r18 = r2
            r2 = r1
            r1 = r4
            r4 = r3
            r3 = r18
            e(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r15 & 7168(0x1c00, float:1.0045E-41)
            r1 = 1572918(0x180036, float:2.204128E-39)
            r0 = r0 | r1
            int r1 = r12 << 3
            r1 = r1 & r16
            r0 = r0 | r1
            int r1 = r12 << 15
            r1 = r1 & r17
            r5 = r0 | r1
            r3 = r19
            r2 = r22
            r4 = r7
            r1 = r11
            r0 = r14
            d(r0, r1, r2, r3, r4, r5)
            r0 = 1
            r7.p(r0)
            goto L136
        L133:
            r7.V()
        L136:
            cf5 r11 = r7.t()
            if (r11 == 0) goto L151
            zj6 r0 = new zj6
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r6 = r24
            r8 = r27
            r5 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.d = r0
        L151:
            return
    }

    public static final void d(float r18, defpackage.r94 r19, defpackage.cf1 r20, boolean r21, defpackage.px0 r22, int r23) {
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r23
            vs0 r0 = defpackage.vs0.Y
            r1 = r22
            xq2 r1 = (defpackage.xq2) r1
            r6 = 428907178(0x19909aaa, float:1.495172E-23)
            r1.d0(r6)
            r6 = r5 & 6
            if (r6 != 0) goto L23
            boolean r6 = r1.f(r0)
            if (r6 == 0) goto L20
            r6 = 4
            goto L21
        L20:
            r6 = 2
        L21:
            r6 = r6 | r5
            goto L24
        L23:
            r6 = r5
        L24:
            r8 = r5 & 48
            x64 r9 = defpackage.x64.a
            if (r8 != 0) goto L36
            boolean r8 = r1.f(r9)
            if (r8 == 0) goto L33
            r8 = 32
            goto L35
        L33:
            r8 = 16
        L35:
            r6 = r6 | r8
        L36:
            r8 = r5 & 384(0x180, float:5.38E-43)
            r10 = r18
            if (r8 != 0) goto L48
            boolean r8 = r1.c(r10)
            if (r8 == 0) goto L45
            r8 = 256(0x100, float:3.59E-43)
            goto L47
        L45:
            r8 = 128(0x80, float:1.8E-43)
        L47:
            r6 = r6 | r8
        L48:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            if (r8 != 0) goto L59
            boolean r8 = r1.f(r2)
            if (r8 == 0) goto L56
            r8 = r15
            goto L58
        L56:
            r8 = 1024(0x400, float:1.435E-42)
        L58:
            r6 = r6 | r8
        L59:
            r8 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L69
            boolean r8 = r1.f(r3)
            if (r8 == 0) goto L66
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L68
        L66:
            r8 = 8192(0x2000, float:1.148E-41)
        L68:
            r6 = r6 | r8
        L69:
            r8 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 & r5
            if (r8 != 0) goto L7a
            boolean r8 = r1.g(r4)
            if (r8 == 0) goto L77
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L79
        L77:
            r8 = 65536(0x10000, float:9.1835E-41)
        L79:
            r6 = r6 | r8
        L7a:
            r8 = 1572864(0x180000, float:2.204052E-39)
            r8 = r8 & r5
            r11 = 1101004800(0x41a00000, float:20.0)
            if (r8 != 0) goto L8d
            boolean r8 = r1.c(r11)
            if (r8 == 0) goto L8a
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L8c
        L8a:
            r8 = 524288(0x80000, float:7.34684E-40)
        L8c:
            r6 = r6 | r8
        L8d:
            r8 = 599187(0x92493, float:8.3964E-40)
            r8 = r8 & r6
            r12 = 599186(0x92492, float:8.39638E-40)
            r13 = 1
            r14 = 0
            if (r8 == r12) goto L9a
            r8 = r13
            goto L9b
        L9a:
            r8 = r14
        L9b:
            r12 = r6 & 1
            boolean r8 = r1.S(r12, r8)
            if (r8 == 0) goto L194
            r8 = r13
            r13 = 0
            r12 = r14
            r14 = 14
            r16 = r11
            r11 = 0
            r17 = r12
            r12 = 0
            r7 = r17
            a74 r11 = defpackage.ge7.S(r9, r10, r11, r12, r13, r14)
            e40 r10 = defpackage.d90.Y
            a74 r0 = r0.n(r11, r10)
            e40 r10 = defpackage.d90.L
            e34 r10 = defpackage.h70.d(r10, r7)
            int r11 = defpackage.ge7.B(r1)
            xv4 r12 = r1.l()
            a74 r0 = defpackage.l.E(r1, r0)
            ix0 r13 = defpackage.jx0.i
            r13.getClass()
            iy0 r13 = defpackage.ix0.b
            r1.f0()
            boolean r14 = r1.S
            if (r14 == 0) goto Lde
            r1.k(r13)
            goto Le1
        Lde:
            r1.o0()
        Le1:
            pn r13 = defpackage.ix0.f
            defpackage.yh2.K(r1, r13, r10)
            pn r10 = defpackage.ix0.e
            defpackage.yh2.K(r1, r10, r12)
            pn r10 = defpackage.ix0.g
            boolean r12 = r1.S
            if (r12 != 0) goto Lff
            java.lang.Object r12 = r1.P()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            boolean r12 = defpackage.nb3.k(r12, r13)
            if (r12 != 0) goto L102
        Lff:
            defpackage.i61.v(r11, r1, r11, r10)
        L102:
            pn r10 = defpackage.ix0.d
            defpackage.yh2.K(r1, r10, r0)
            java.lang.Object r0 = r1.P()
            vs0 r10 = defpackage.ox0.a
            if (r0 != r10) goto L117
            mm6 r0 = new mm6
            r0.<init>()
            r1.l0(r0)
        L117:
            mm6 r0 = (defpackage.mm6) r0
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != r15) goto L11f
            r13 = r8
            goto L120
        L11f:
            r13 = r7
        L120:
            java.lang.Object r6 = r1.P()
            if (r13 != 0) goto L128
            if (r6 != r10) goto L131
        L128:
            dd1 r6 = new dd1
            r10 = 0
            r6.<init>(r2, r0, r10, r8)
            r1.l0(r6)
        L131:
            eo2 r6 = (defpackage.eo2) r6
            defpackage.mb3.i(r1, r6, r2)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L141
            r0 = 1086324736(0x40c00000, float:6.0)
        L13e:
            r6 = 1101004800(0x41a00000, float:20.0)
            goto L144
        L141:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L13e
        L144:
            a74 r6 = defpackage.dj6.j(r9, r6, r6)
            r9 = 0
            r11 = 4
            kq5 r9 = defpackage.jq5.a(r11, r9, r7)
            a74 r6 = defpackage.k43.a(r6, r2, r9)
            a74 r9 = defpackage.nc1.S(r6, r2)
            if (r4 == 0) goto L15b
        L159:
            r10 = r0
            goto L15d
        L15b:
            r0 = 0
            goto L159
        L15d:
            y16 r11 = defpackage.z16.a
            r13 = 0
            r15 = 24
            r12 = 0
            a74 r0 = defpackage.nj2.E(r9, r10, r11, r12, r13, r15)
            r6 = -1733795637(0xffffffff98a860cb, float:-4.352472E-24)
            r1.b0(r6)
            if (r4 == 0) goto L173
            long r9 = r3.a
            goto L175
        L173:
            long r9 = r3.b
        L175:
            kt0 r6 = new kt0
            r6.<init>(r9)
            qa4 r6 = defpackage.np2.b0(r6, r1)
            r1.p(r7)
            java.lang.Object r6 = r6.getValue()
            kt0 r6 = (defpackage.kt0) r6
            long r6 = r6.a
            a74 r0 = defpackage.vy7.L(r0, r6, r11)
            defpackage.gi2.h(r1, r0)
            r1.p(r8)
            goto L197
        L194:
            r1.V()
        L197:
            cf5 r6 = r1.t()
            if (r6 == 0) goto L1a6
            ak6 r0 = new ak6
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L1a6:
            return
    }

    public static final void e(defpackage.a74 r18, defpackage.cf1 r19, boolean r20, float r21, java.util.List r22, float r23, float r24, defpackage.px0 r25, int r26) {
            r1 = r18
            r2 = r19
            r3 = r20
            r10 = r22
            r0 = r26
            r13 = r25
            xq2 r13 = (defpackage.xq2) r13
            r4 = 1833126050(0x6d4348a2, float:3.7773365E27)
            r13.d0(r4)
            r4 = r0 & 6
            if (r4 != 0) goto L23
            boolean r4 = r13.f(r1)
            if (r4 == 0) goto L20
            r4 = 4
            goto L21
        L20:
            r4 = 2
        L21:
            r4 = r4 | r0
            goto L24
        L23:
            r4 = r0
        L24:
            r5 = r0 & 48
            if (r5 != 0) goto L34
            boolean r5 = r13.f(r2)
            if (r5 == 0) goto L31
            r5 = 32
            goto L33
        L31:
            r5 = 16
        L33:
            r4 = r4 | r5
        L34:
            r5 = r0 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L44
            boolean r5 = r13.g(r3)
            if (r5 == 0) goto L41
            r5 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r5 = 128(0x80, float:1.8E-43)
        L43:
            r4 = r4 | r5
        L44:
            r5 = r0 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L55
            r5 = 0
            boolean r5 = r13.c(r5)
            if (r5 == 0) goto L52
            r5 = 2048(0x800, float:2.87E-42)
            goto L54
        L52:
            r5 = 1024(0x400, float:1.435E-42)
        L54:
            r4 = r4 | r5
        L55:
            r5 = r0 & 24576(0x6000, float:3.4438E-41)
            r8 = r21
            if (r5 != 0) goto L67
            boolean r5 = r13.c(r8)
            if (r5 == 0) goto L64
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L66
        L64:
            r5 = 8192(0x2000, float:1.148E-41)
        L66:
            r4 = r4 | r5
        L67:
            r5 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 & r0
            if (r5 != 0) goto L78
            boolean r5 = r13.h(r10)
            if (r5 == 0) goto L75
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L77
        L75:
            r5 = 65536(0x10000, float:9.1835E-41)
        L77:
            r4 = r4 | r5
        L78:
            r5 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 & r0
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r5 != 0) goto L8d
            r5 = r23
            boolean r11 = r13.c(r5)
            if (r11 == 0) goto L89
            r11 = r9
            goto L8b
        L89:
            r11 = 524288(0x80000, float:7.34684E-40)
        L8b:
            r4 = r4 | r11
            goto L8f
        L8d:
            r5 = r23
        L8f:
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r11 = r11 & r0
            r12 = 8388608(0x800000, float:1.1754944E-38)
            if (r11 != 0) goto La5
            r11 = r24
            boolean r14 = r13.c(r11)
            if (r14 == 0) goto La0
            r14 = r12
            goto La2
        La0:
            r14 = 4194304(0x400000, float:5.877472E-39)
        La2:
            r4 = r4 | r14
        La3:
            r14 = r4
            goto La8
        La5:
            r11 = r24
            goto La3
        La8:
            r4 = 4793491(0x492493, float:6.717112E-39)
            r4 = r4 & r14
            r15 = 4793490(0x492492, float:6.71711E-39)
            r6 = 0
            r7 = 1
            if (r4 == r15) goto Lb5
            r4 = r7
            goto Lb6
        Lb5:
            r4 = r6
        Lb6:
            r15 = r14 & 1
            boolean r4 = r13.S(r15, r4)
            if (r4 == 0) goto L132
            qa4 r4 = r2.b(r3, r6, r13)
            qa4 r15 = r2.b(r3, r7, r13)
            qa4 r11 = r2.a(r3, r6, r13)
            qa4 r6 = r2.a(r3, r7, r13)
            r17 = 3670016(0x380000, float:5.142788E-39)
            r7 = r14 & r17
            if (r7 != r9) goto Ld6
            r7 = 1
            goto Ld7
        Ld6:
            r7 = 0
        Ld7:
            boolean r9 = r13.f(r4)
            r7 = r7 | r9
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r14
            if (r9 != r12) goto Le3
            r9 = 1
            goto Le4
        Le3:
            r9 = 0
        Le4:
            r7 = r7 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r14
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r9 != r12) goto Lef
            r9 = 1
            goto Lf0
        Lef:
            r9 = 0
        Lf0:
            r7 = r7 | r9
            r9 = r14 & 7168(0x1c00, float:1.0045E-41)
            r12 = 2048(0x800, float:2.87E-42)
            if (r9 != r12) goto Lfa
            r16 = 1
            goto Lfc
        Lfa:
            r16 = 0
        Lfc:
            r7 = r7 | r16
            boolean r9 = r13.f(r15)
            r7 = r7 | r9
            boolean r9 = r13.h(r10)
            r7 = r7 | r9
            boolean r9 = r13.f(r11)
            r7 = r7 | r9
            boolean r9 = r13.f(r6)
            r7 = r7 | r9
            java.lang.Object r9 = r13.P()
            if (r7 != 0) goto L11c
            vs0 r7 = defpackage.ox0.a
            if (r9 != r7) goto L12a
        L11c:
            r12 = r6
            r6 = r4
            bk6 r4 = new bk6
            r7 = r24
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.l0(r4)
            r9 = r4
        L12a:
            qn2 r9 = (defpackage.qn2) r9
            r4 = r14 & 14
            defpackage.ak7.j(r1, r9, r13, r4)
            goto L135
        L132:
            r13.V()
        L135:
            cf5 r9 = r13.t()
            if (r9 == 0) goto L14c
            rj6 r0 = new rj6
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.d = r0
        L14c:
            return
    }
}
