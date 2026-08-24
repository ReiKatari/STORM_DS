package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bx6  reason: default package */
/* loaded from: classes.dex */
public abstract class bx6 {
    public static final float a = 14.0f;
    public static final defpackage.sc7 b = null;
    public static final float c = 0.0f;
    public static final float d = 0.0f;
    public static final float e = 0.0f;

    static {
            sc7 r0 = new sc7
            r1 = 0
            r2 = 6
            r3 = 100
            r0.<init>(r3, r1, r2)
            defpackage.bx6.b = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            defpackage.bx6.c = r0
            r0 = 1086324736(0x40c00000, float:6.0)
            defpackage.bx6.d = r0
            r0 = 1123680256(0x42fa0000, float:125.0)
            defpackage.bx6.e = r0
            return
    }

    public static final void a(boolean r30, defpackage.qn2 r31, defpackage.a74 r32, boolean r33, defpackage.rf1 r34, defpackage.px0 r35, int r36, int r37) {
            r1 = r30
            r2 = r31
            r6 = r36
            r12 = r35
            xq2 r12 = (defpackage.xq2) r12
            r0 = 25866825(0x18ab249, float:5.094902E-38)
            r12.d0(r0)
            r0 = r6 & 6
            if (r0 != 0) goto L1f
            boolean r0 = r12.g(r1)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r0 | r6
            goto L20
        L1f:
            r0 = r6
        L20:
            r5 = r6 & 48
            if (r5 != 0) goto L30
            boolean r5 = r12.h(r2)
            if (r5 == 0) goto L2d
            r5 = 32
            goto L2f
        L2d:
            r5 = 16
        L2f:
            r0 = r0 | r5
        L30:
            r5 = r0 | 384(0x180, float:5.38E-43)
            r8 = r37 & 8
            if (r8 == 0) goto L3b
            r5 = r0 | 3456(0xd80, float:4.843E-42)
        L38:
            r0 = r33
            goto L4d
        L3b:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L38
            r0 = r33
            boolean r9 = r12.g(r0)
            if (r9 == 0) goto L4a
            r9 = 2048(0x800, float:2.87E-42)
            goto L4c
        L4a:
            r9 = 1024(0x400, float:1.435E-42)
        L4c:
            r5 = r5 | r9
        L4d:
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r6
            if (r9 != 0) goto L63
            r9 = r34
            boolean r10 = r12.f(r9)
            if (r10 == 0) goto L5f
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L61
        L5f:
            r10 = 65536(0x10000, float:9.1835E-41)
        L61:
            r5 = r5 | r10
            goto L65
        L63:
            r9 = r34
        L65:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r5
            r11 = 74898(0x12492, float:1.04954E-40)
            r13 = 0
            if (r10 == r11) goto L71
            r10 = 1
            goto L72
        L71:
            r10 = r13
        L72:
            r11 = r5 & 1
            boolean r10 = r12.S(r11, r10)
            if (r10 == 0) goto L2f8
            r12.X()
            r10 = r6 & 1
            x64 r11 = defpackage.x64.a
            if (r10 == 0) goto L91
            boolean r10 = r12.B()
            if (r10 == 0) goto L8a
            goto L91
        L8a:
            r12.V()
            r8 = r0
            r0 = r32
            goto L96
        L91:
            if (r8 == 0) goto L94
            r0 = 1
        L94:
            r8 = r0
            r0 = r11
        L96:
            r12.q()
            r10 = 1799771122(0x6b4653f2, float:2.3976373E26)
            r12.b0(r10)
            java.lang.Object r10 = r12.P()
            vs0 r15 = defpackage.ox0.a
            if (r10 != r15) goto Lab
            r94 r10 = defpackage.i61.f(r12)
        Lab:
            r94 r10 = (defpackage.r94) r10
            r12.p(r13)
            nq6 r14 = defpackage.ky0.h
            java.lang.Object r16 = r12.j(r14)
            r13 = r16
            qh1 r13 = (defpackage.qh1) r13
            r4 = 1096810496(0x41600000, float:14.0)
            float r4 = r13.e0(r4)
            java.lang.Object r13 = r12.P()
            if (r13 != r15) goto Lcf
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            vs4 r13 = defpackage.np2.Y(r13)
            r12.l0(r13)
        Lcf:
            r20 = r13
            qa4 r20 = (defpackage.qa4) r20
            java.lang.Object r13 = r12.j(r14)
            qh1 r13 = (defpackage.qh1) r13
            float r14 = defpackage.bx6.e
            float r13 = r13.e0(r14)
            boolean r14 = r12.c(r4)
            boolean r16 = r12.c(r13)
            r14 = r14 | r16
            java.lang.Object r3 = r12.P()
            if (r14 != 0) goto Lf6
            if (r3 != r15) goto Lf2
            goto Lf6
        Lf2:
            r24 = r5
            goto L18c
        Lf6:
            s04 r3 = new s04
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r33 = r4
            r17 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r17)
            r14.put(r7, r4)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Float r7 = java.lang.Float.valueOf(r33)
            r14.put(r4, r7)
            r3.<init>(r14)
            dd r24 = new dd
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r1)
            r76 r4 = new r76
            r7 = 16
            r4.<init>(r7)
            xw6 r7 = new xw6
            r7.<init>(r13)
            k4 r13 = new k4
            r14 = 10
            r13.<init>(r14)
            sc7 r28 = defpackage.bx6.b
            r26 = r4
            r27 = r7
            r29 = r13
            r24.<init>(r25, r26, r27, r28, r29)
            r4 = r24
            r7 = r25
            vs4 r13 = r4.m
            r13.setValue(r3)
            ya3 r3 = r4.e
            hb4 r3 = r3.b
            boolean r13 = r3.g()
            if (r13 == 0) goto L186
            bd r13 = r4.n     // Catch: java.lang.Throwable -> L180
            s04 r14 = r4.d()     // Catch: java.lang.Throwable -> L180
            float r14 = r14.c(r7)     // Catch: java.lang.Throwable -> L180
            boolean r16 = java.lang.Float.isNaN(r14)     // Catch: java.lang.Throwable -> L180
            if (r16 != 0) goto L174
            dd r13 = r13.a     // Catch: java.lang.Throwable -> L180
            r24 = r5
            rs4 r5 = r13.j     // Catch: java.lang.Throwable -> L180
            r5.i(r14)     // Catch: java.lang.Throwable -> L180
            rs4 r5 = r13.k     // Catch: java.lang.Throwable -> L180
            r13 = r17
            r5.i(r13)     // Catch: java.lang.Throwable -> L180
            vs4 r5 = r4.l     // Catch: java.lang.Throwable -> L180
            r13 = 0
            r5.setValue(r13)     // Catch: java.lang.Throwable -> L180
            goto L176
        L174:
            r24 = r5
        L176:
            r4.f(r7)     // Catch: java.lang.Throwable -> L180
            r13 = 0
            r3.h(r13)
            goto L188
        L17e:
            r13 = 0
            goto L182
        L180:
            r0 = move-exception
            goto L17e
        L182:
            r3.h(r13)
            throw r0
        L186:
            r24 = r5
        L188:
            r12.l0(r4)
            r3 = r4
        L18c:
            dd r3 = (defpackage.dd) r3
            int r4 = r24 >> 3
            qa4 r5 = defpackage.np2.b0(r2, r12)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r13 = r24 & 14
            qa4 r7 = defpackage.np2.b0(r7, r12)
            boolean r14 = r12.f(r3)
            boolean r16 = r12.f(r7)
            r14 = r14 | r16
            boolean r16 = r12.f(r5)
            r14 = r14 | r16
            r17 = r3
            java.lang.Object r3 = r12.P()
            if (r14 != 0) goto L1bc
            if (r3 != r15) goto L1b9
            goto L1bc
        L1b9:
            r5 = r17
            goto L1d0
        L1bc:
            kp5 r16 = new kp5
            r21 = 0
            r22 = 6
            r19 = r5
            r18 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r3 = r16
            r5 = r17
            r12.l0(r3)
        L1d0:
            eo2 r3 = (defpackage.eo2) r3
            defpackage.mb3.i(r12, r3, r5)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r7 = r20.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.getClass()
            r14 = 4
            if (r13 != r14) goto L1e7
            r13 = 1
            goto L1e8
        L1e7:
            r13 = 0
        L1e8:
            boolean r14 = r12.f(r5)
            r13 = r13 | r14
            java.lang.Object r14 = r12.P()
            if (r13 != 0) goto L1f5
            if (r14 != r15) goto L1fe
        L1f5:
            ax6 r14 = new ax6
            r13 = 0
            r14.<init>(r1, r5, r13)
            r12.l0(r14)
        L1fe:
            eo2 r14 = (defpackage.eo2) r14
            defpackage.mb3.j(r3, r7, r14, r12)
            nq6 r3 = defpackage.ky0.n
            java.lang.Object r3 = r12.j(r3)
            kk3 r7 = defpackage.kk3.Rtl
            if (r3 != r7) goto L210
            r23 = 1
            goto L212
        L210:
            r23 = 0
        L212:
            if (r2 == 0) goto L21f
            mq5 r3 = new mq5
            r7 = 2
            r3.<init>(r7)
            a74 r3 = defpackage.g04.W(r1, r10, r8, r3, r2)
            goto L220
        L21f:
            r3 = r11
        L220:
            if (r2 == 0) goto L226
            nq6 r7 = defpackage.u93.a
            m64 r11 = defpackage.m64.a
        L226:
            a74 r7 = r0.d(r11)
            a74 r16 = r7.d(r3)
            lo4 r18 = defpackage.lo4.Horizontal
            if (r8 == 0) goto L237
            if (r2 == 0) goto L237
            r19 = 1
            goto L239
        L237:
            r19 = 0
        L239:
            u63 r3 = r5.f
            rc r7 = new rc
            r13 = 0
            r7.<init>(r5, r13)
            r21 = 0
            r17 = r3
            r22 = r7
            r20 = r10
            a74 r3 = defpackage.eo1.a(r16, r17, r18, r19, r20, r21, r22, r23)
            r11 = r20
            e40 r7 = defpackage.d90.Z
            r10 = 2
            a74 r3 = defpackage.dj6.n(r3, r7, r10)
            r7 = 1073741824(0x40000000, float:2.0)
            a74 r3 = defpackage.ge7.O(r3, r7)
            cj6 r16 = new cj6
            r17 = 1107820544(0x42080000, float:34.0)
            r18 = 1101004800(0x41a00000, float:20.0)
            r19 = r17
            r20 = r18
            r16.<init>(r17, r18, r19, r20, r21)
            r7 = r16
            a74 r3 = r3.d(r7)
            e40 r7 = defpackage.d90.L
            r10 = 0
            e34 r7 = defpackage.h70.d(r7, r10)
            int r10 = defpackage.ge7.B(r12)
            xv4 r13 = r12.l()
            a74 r3 = defpackage.l.E(r12, r3)
            ix0 r14 = defpackage.jx0.i
            r14.getClass()
            iy0 r14 = defpackage.ix0.b
            r12.f0()
            r16 = r0
            boolean r0 = r12.S
            if (r0 == 0) goto L296
            r12.k(r14)
            goto L299
        L296:
            r12.o0()
        L299:
            pn r0 = defpackage.ix0.f
            defpackage.yh2.K(r12, r0, r7)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r12, r0, r13)
            pn r0 = defpackage.ix0.g
            boolean r7 = r12.S
            if (r7 != 0) goto L2b7
            java.lang.Object r7 = r12.P()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r7 = defpackage.nb3.k(r7, r13)
            if (r7 != 0) goto L2ba
        L2b7:
            defpackage.i61.v(r10, r12, r10, r0)
        L2ba:
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r12, r0, r3)
            ii1 r0 = r5.h
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            boolean r0 = r12.f(r5)
            java.lang.Object r3 = r12.P()
            if (r0 != 0) goto L2d7
            if (r3 != r15) goto L2e0
        L2d7:
            wc r3 = new wc
            r0 = 5
            r3.<init>(r5, r0)
            r12.l0(r3)
        L2e0:
            r10 = r3
            on2 r10 = (defpackage.on2) r10
            r0 = r4 & 896(0x380, float:1.256E-42)
            r3 = 6
            r0 = r0 | r3
            int r3 = r24 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r13 = r0 | r3
            b(r7, r8, r9, r10, r11, r12, r13)
            r0 = 1
            r12.p(r0)
            r4 = r8
            r3 = r16
            goto L2fe
        L2f8:
            r12.V()
            r3 = r32
            r4 = r0
        L2fe:
            cf5 r9 = r12.t()
            if (r9 == 0) goto L310
            jd5 r0 = new jd5
            r8 = 2
            r5 = r34
            r7 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.d = r0
        L310:
            return
    }

    public static final void b(boolean r26, boolean r27, defpackage.rf1 r28, defpackage.on2 r29, defpackage.r94 r30, defpackage.px0 r31, int r32) {
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r32
            vs0 r0 = defpackage.vs0.Y
            r10 = r31
            xq2 r10 = (defpackage.xq2) r10
            r7 = 70908914(0x439fbf2, float:2.1862333E-36)
            r10.d0(r7)
            r7 = r6 & 6
            r8 = 2
            if (r7 != 0) goto L28
            boolean r7 = r10.f(r0)
            if (r7 == 0) goto L25
            r7 = 4
            goto L26
        L25:
            r7 = r8
        L26:
            r7 = r7 | r6
            goto L29
        L28:
            r7 = r6
        L29:
            r9 = r6 & 48
            if (r9 != 0) goto L39
            boolean r9 = r10.g(r1)
            if (r9 == 0) goto L36
            r9 = 32
            goto L38
        L36:
            r9 = 16
        L38:
            r7 = r7 | r9
        L39:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L49
            boolean r9 = r10.g(r2)
            if (r9 == 0) goto L46
            r9 = 256(0x100, float:3.59E-43)
            goto L48
        L46:
            r9 = 128(0x80, float:1.8E-43)
        L48:
            r7 = r7 | r9
        L49:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L59
            boolean r9 = r10.f(r3)
            if (r9 == 0) goto L56
            r9 = 2048(0x800, float:2.87E-42)
            goto L58
        L56:
            r9 = 1024(0x400, float:1.435E-42)
        L58:
            r7 = r7 | r9
        L59:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L69
            boolean r9 = r10.h(r4)
            if (r9 == 0) goto L66
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L68
        L66:
            r9 = 8192(0x2000, float:1.148E-41)
        L68:
            r7 = r7 | r9
        L69:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r6
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r9 != 0) goto L7b
            boolean r9 = r10.f(r5)
            if (r9 == 0) goto L78
            r9 = r11
            goto L7a
        L78:
            r9 = 65536(0x10000, float:9.1835E-41)
        L7a:
            r7 = r7 | r9
        L7b:
            r15 = r7
            r7 = 74899(0x12493, float:1.04956E-40)
            r7 = r7 & r15
            r9 = 74898(0x12492, float:1.04954E-40)
            r16 = 1
            r12 = 0
            if (r7 == r9) goto L8b
            r7 = r16
            goto L8c
        L8b:
            r7 = r12
        L8c:
            r9 = r15 & 1
            boolean r7 = r10.S(r9, r7)
            if (r7 == 0) goto L1f4
            java.lang.Object r7 = r10.P()
            vs0 r9 = defpackage.ox0.a
            if (r7 != r9) goto La4
            mm6 r7 = new mm6
            r7.<init>()
            r10.l0(r7)
        La4:
            mm6 r7 = (defpackage.mm6) r7
            r17 = 458752(0x70000, float:6.42848E-40)
            r13 = r15 & r17
            if (r13 != r11) goto Laf
            r11 = r16
            goto Lb0
        Laf:
            r11 = r12
        Lb0:
            java.lang.Object r13 = r10.P()
            if (r11 != 0) goto Lb8
            if (r13 != r9) goto Lc1
        Lb8:
            dd1 r13 = new dd1
            r11 = 0
            r13.<init>(r5, r7, r11, r8)
            r10.l0(r13)
        Lc1:
            eo2 r13 = (defpackage.eo2) r13
            defpackage.mb3.i(r10, r13, r5)
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto Ld1
            float r7 = defpackage.bx6.d
        Lce:
            r18 = r7
            goto Ld4
        Ld1:
            float r7 = defpackage.bx6.c
            goto Lce
        Ld4:
            r7 = -1176343362(0xffffffffb9e26cbe, float:-4.3187098E-4)
            r10.b0(r7)
            if (r2 == 0) goto Le4
            if (r1 == 0) goto Le1
            long r7 = r3.b
            goto Leb
        Le1:
            long r7 = r3.d
            goto Leb
        Le4:
            if (r1 == 0) goto Le9
            long r7 = r3.f
            goto Leb
        Le9:
            long r7 = r3.h
        Leb:
            qa4 r7 = defpackage.i61.g(r7, r10, r12)
            e40 r8 = defpackage.d90.Z
            x64 r13 = defpackage.x64.a
            a74 r8 = r0.n(r13, r8)
            lc2 r11 = defpackage.dj6.c
            a74 r8 = r8.d(r11)
            boolean r11 = r10.f(r7)
            java.lang.Object r14 = r10.P()
            if (r11 != 0) goto L109
            if (r14 != r9) goto L113
        L109:
            j4 r14 = new j4
            r11 = 25
            r14.<init>(r7, r11)
            r10.l0(r14)
        L113:
            qn2 r14 = (defpackage.qn2) r14
            defpackage.ak7.j(r8, r14, r10, r12)
            r7 = -66424183(0xfffffffffc0a7289, float:-2.87544E36)
            r10.b0(r7)
            if (r2 == 0) goto L128
            if (r1 == 0) goto L125
            long r7 = r3.a
            goto L12f
        L125:
            long r7 = r3.c
            goto L12f
        L128:
            if (r1 == 0) goto L12d
            long r7 = r3.e
            goto L12f
        L12d:
            long r7 = r3.g
        L12f:
            qa4 r7 = defpackage.i61.g(r7, r10, r12)
            nq6 r8 = defpackage.os1.a
            java.lang.Object r8 = r10.j(r8)
            qd1 r8 = (defpackage.qd1) r8
            py0 r11 = defpackage.os1.b
            java.lang.Object r11 = r10.j(r11)
            om1 r11 = (defpackage.om1) r11
            float r11 = r11.A
            float r11 = r11 + r18
            java.lang.Object r14 = r7.getValue()
            kt0 r14 = (defpackage.kt0) r14
            r20 = r13
            long r12 = r14.a
            nq6 r14 = defpackage.vt0.a
            java.lang.Object r14 = r10.j(r14)
            ut0 r14 = (defpackage.ut0) r14
            long r1 = r14.j()
            boolean r1 = defpackage.kt0.d(r12, r1)
            if (r1 == 0) goto L17c
            if (r8 == 0) goto L17c
            r1 = -674840005(0xffffffffd7c6c23b, float:-4.3707503E14)
            r10.b0(r1)
            java.lang.Object r1 = r7.getValue()
            kt0 r1 = (defpackage.kt0) r1
            long r1 = r1.a
            r8 = 0
            long r1 = defpackage.qd1.a(r1, r11, r10, r8)
            r10.p(r8)
            goto L18e
        L17c:
            r8 = 0
            r1 = -674751066(0xffffffffd7c81da6, float:-4.4005933E14)
            r10.b0(r1)
            r10.p(r8)
            java.lang.Object r1 = r7.getValue()
            kt0 r1 = (defpackage.kt0) r1
            long r1 = r1.a
        L18e:
            r11 = 0
            r12 = 14
            r7 = r9
            r9 = 0
            r24 = r1
            r2 = r7
            r1 = r8
            r7 = r24
            pp6 r7 = defpackage.ti6.a(r7, r9, r10, r11, r12)
            e40 r8 = defpackage.d90.Y
            r9 = r20
            a74 r0 = r0.n(r9, r8)
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r15
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r8 != r9) goto L1ae
            goto L1b0
        L1ae:
            r16 = r1
        L1b0:
            java.lang.Object r8 = r10.P()
            if (r16 != 0) goto L1b8
            if (r8 != r2) goto L1c1
        L1b8:
            mn0 r8 = new mn0
            r2 = 7
            r8.<init>(r2, r4)
            r10.l0(r8)
        L1c1:
            qn2 r8 = (defpackage.qn2) r8
            a74 r0 = defpackage.g04.L(r0, r8)
            r8 = 0
            r2 = 4
            kq5 r1 = defpackage.jq5.a(r2, r8, r1)
            a74 r0 = defpackage.k43.a(r0, r5, r1)
            a74 r17 = defpackage.dj6.g(r0)
            y16 r19 = defpackage.z16.a
            r21 = 0
            r23 = 24
            r20 = 0
            a74 r0 = defpackage.nj2.E(r17, r18, r19, r20, r21, r23)
            r1 = r19
            java.lang.Object r2 = r7.getValue()
            kt0 r2 = (defpackage.kt0) r2
            long r7 = r2.a
            a74 r0 = defpackage.vy7.L(r0, r7, r1)
            defpackage.gi2.h(r10, r0)
            goto L1f7
        L1f4:
            r10.V()
        L1f7:
            cf5 r7 = r10.t()
            if (r7 == 0) goto L208
            yw6 r0 = new yw6
            r1 = r26
            r2 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L208:
            return
    }
}
