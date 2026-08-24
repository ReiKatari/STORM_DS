package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e45  reason: default package */
/* loaded from: classes.dex */
public abstract class e45 {
    public static final defpackage.v71 a = null;
    public static final defpackage.v71 b = null;
    public static final defpackage.v71 c = null;
    public static final defpackage.v71 d = null;
    public static final defpackage.v71 e = null;

    static {
            v71 r0 = new v71
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r0.<init>(r1, r2)
            defpackage.e45.a = r0
            v71 r0 = new v71
            r2 = 1053609165(0x3ecccccd, float:0.4)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r3)
            defpackage.e45.b = r0
            v71 r0 = new v71
            r3 = 1059481190(0x3f266666, float:0.65)
            r4 = 0
            r0.<init>(r4, r3)
            defpackage.e45.c = r0
            v71 r0 = new v71
            r3 = 1036831949(0x3dcccccd, float:0.1)
            r4 = 1055286886(0x3ee66666, float:0.45)
            r0.<init>(r3, r4)
            defpackage.e45.d = r0
            v71 r0 = new v71
            r0.<init>(r2, r1)
            defpackage.e45.e = r0
            return
    }

    public static final void a(defpackage.a74 r30, long r31, float r33, long r34, int r36, defpackage.px0 r37, int r38, int r39) {
            r8 = r38
            r15 = r37
            xq2 r15 = (defpackage.xq2) r15
            r0 = -1119119072(0xffffffffbd4b9920, float:-0.04970658)
            r15.d0(r0)
            r0 = r39 & 1
            r1 = 2
            if (r0 == 0) goto L17
            r2 = r8 | 6
            r3 = r2
            r2 = r30
            goto L2b
        L17:
            r2 = r8 & 6
            if (r2 != 0) goto L28
            r2 = r30
            boolean r3 = r15.f(r2)
            if (r3 == 0) goto L25
            r3 = 4
            goto L26
        L25:
            r3 = r1
        L26:
            r3 = r3 | r8
            goto L2b
        L28:
            r2 = r30
            r3 = r8
        L2b:
            r4 = r8 & 48
            if (r4 != 0) goto L42
            r4 = r39 & 2
            r6 = r31
            if (r4 != 0) goto L3e
            boolean r4 = r15.e(r6)
            if (r4 == 0) goto L3e
            r4 = 32
            goto L40
        L3e:
            r4 = 16
        L40:
            r3 = r3 | r4
            goto L44
        L42:
            r6 = r31
        L44:
            r4 = r39 & 4
            r9 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L4f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L4c:
            r10 = r33
            goto L60
        L4f:
            r10 = r8 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L4c
            r10 = r33
            boolean r11 = r15.c(r10)
            if (r11 == 0) goto L5d
            r11 = r9
            goto L5f
        L5d:
            r11 = 128(0x80, float:1.8E-43)
        L5f:
            r3 = r3 | r11
        L60:
            r3 = r3 | 11264(0x2c00, float:1.5784E-41)
            r11 = r3 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            r13 = 0
            r14 = 1
            if (r11 == r12) goto L6c
            r11 = r14
            goto L6d
        L6c:
            r11 = r13
        L6d:
            r12 = r3 & 1
            boolean r11 = r15.S(r12, r11)
            if (r11 == 0) goto L253
            r15.X()
            r11 = r8 & 1
            r12 = -57345(0xffffffffffff1fff, float:NaN)
            if (r11 == 0) goto L99
            boolean r11 = r15.B()
            if (r11 == 0) goto L86
            goto L99
        L86:
            r15.V()
            r0 = r39 & 2
            if (r0 == 0) goto L8f
            r3 = r3 & (-113(0xffffffffffffff8f, float:NaN))
        L8f:
            r0 = r3 & r12
            r3 = r34
            r11 = r0
            r0 = r2
            r2 = r10
            r10 = r36
            goto Lbf
        L99:
            if (r0 == 0) goto L9e
            x64 r0 = defpackage.x64.a
            goto L9f
        L9e:
            r0 = r2
        L9f:
            r2 = r39 & 2
            if (r2 == 0) goto Lb1
            nq6 r2 = defpackage.vt0.a
            java.lang.Object r2 = r15.j(r2)
            ut0 r2 = (defpackage.ut0) r2
            long r6 = r2.g()
            r3 = r3 & (-113(0xffffffffffffff8f, float:NaN))
        Lb1:
            if (r4 == 0) goto Lb6
            r2 = 1082130432(0x40800000, float:4.0)
            r10 = r2
        Lb6:
            long r16 = defpackage.kt0.g
            r2 = r3 & r12
            r11 = r2
            r2 = r10
            r3 = r16
            r10 = r1
        Lbf:
            r15.q()
            nq6 r12 = defpackage.ky0.h
            java.lang.Object r12 = r15.j(r12)
            qh1 r12 = (defpackage.qh1) r12
            ys6 r19 = new ys6
            float r12 = r12.e0(r2)
            r16 = 0
            r17 = 26
            r18 = 0
            r20 = 0
            r33 = r10
            r31 = r12
            r35 = r16
            r36 = r17
            r32 = r18
            r30 = r19
            r34 = r20
            r30.<init>(r31, r32, r33, r34, r35, r36)
            r27 = r33
            r10 = 0
            r12 = r9
            g53 r9 = defpackage.yh2.H(r10, r15, r14)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            r17 = 5
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r18 = r12
            wc7 r12 = defpackage.nw7.f0
            e41 r5 = defpackage.ir1.c
            r14 = 6660(0x1a04, float:9.333E-42)
            sc7 r14 = defpackage.ge7.Y(r14, r13, r5, r1)
            r1 = 6
            d53 r14 = defpackage.ge7.G(r14, r10, r1)
            r22 = r10
            r10 = r16
            r16 = 33208(0x81b8, float:4.6534E-41)
            r23 = r11
            r11 = r17
            r17 = 16
            r24 = r13
            r13 = r14
            r14 = 0
            r29 = r19
            r28 = r23
            r1 = r24
            e53 r10 = defpackage.yh2.j(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r11 = 1332(0x534, float:1.867E-42)
            r12 = 2
            sc7 r5 = defpackage.ge7.Y(r11, r1, r5, r12)
            r11 = 0
            r12 = 6
            d53 r5 = defpackage.ge7.G(r5, r11, r12)
            r13 = 8
            r14 = 0
            r16 = 1133445120(0x438f0000, float:286.0)
            r17 = 0
            r18 = 4536(0x11b8, float:6.356E-42)
            r33 = r5
            r30 = r9
            r37 = r13
            r31 = r14
            r35 = r15
            r32 = r16
            r34 = r17
            r36 = r18
            e53 r5 = defpackage.yh2.h(r30, r31, r32, r33, r34, r35, r36, r37)
            r13 = r36
            java.lang.Object r14 = r15.P()
            vs0 r13 = defpackage.ox0.a
            if (r14 != r13) goto L163
            dv4 r14 = new dv4
            r14.<init>(r12)
            r15.l0(r14)
        L163:
            qn2 r14 = (defpackage.qn2) r14
            ci3 r14 = defpackage.ge7.K(r14)
            d53 r14 = defpackage.ge7.G(r14, r11, r12)
            r12 = 0
            r16 = 8
            r17 = 0
            r18 = 1133576192(0x43910000, float:290.0)
            r30 = r9
            r34 = r12
            r33 = r14
            r35 = r15
            r37 = r16
            r31 = r17
            r32 = r18
            r36 = 4536(0x11b8, float:6.356E-42)
            e53 r9 = defpackage.yh2.h(r30, r31, r32, r33, r34, r35, r36, r37)
            r12 = r30
            java.lang.Object r14 = r15.P()
            if (r14 != r13) goto L19a
            dv4 r14 = new dv4
            r1 = 8
            r14.<init>(r1)
            r15.l0(r14)
        L19a:
            qn2 r14 = (defpackage.qn2) r14
            ci3 r1 = defpackage.ge7.K(r14)
            r14 = 6
            d53 r1 = defpackage.ge7.G(r1, r11, r14)
            r11 = 0
            r14 = 8
            r16 = 0
            r17 = 1133576192(0x43910000, float:290.0)
            r33 = r1
            r34 = r11
            r30 = r12
            r37 = r14
            r35 = r15
            r31 = r16
            r32 = r17
            r36 = 4536(0x11b8, float:6.356E-42)
            e53 r1 = defpackage.yh2.h(r30, r31, r32, r33, r34, r35, r36, r37)
            dv4 r11 = new dv4
            r12 = 13
            r11.<init>(r12)
            r12 = 1
            a74 r11 = defpackage.ua6.a(r0, r12, r11)
            r14 = 1109393408(0x42200000, float:40.0)
            a74 r11 = defpackage.dj6.i(r11, r14)
            r14 = r29
            boolean r16 = r15.h(r14)
            boolean r17 = r15.f(r10)
            r16 = r16 | r17
            boolean r17 = r15.f(r9)
            r16 = r16 | r17
            boolean r17 = r15.f(r1)
            r16 = r16 | r17
            boolean r17 = r15.f(r5)
            r16 = r16 | r17
            r12 = r28
            r28 = r0
            r0 = r12 & 896(0x380, float:1.256E-42)
            r25 = r1
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L1fe
            r0 = 1
            goto L1ff
        L1fe:
            r0 = 0
        L1ff:
            r0 = r16 | r0
            r1 = r12 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r30 = r0
            r0 = 32
            if (r1 <= r0) goto L211
            boolean r1 = r15.e(r6)
            if (r1 != 0) goto L215
        L211:
            r1 = r12 & 48
            if (r1 != r0) goto L217
        L215:
            r0 = 1
            goto L218
        L217:
            r0 = 0
        L218:
            r0 = r30 | r0
            java.lang.Object r1 = r15.P()
            if (r0 != 0) goto L22a
            if (r1 != r13) goto L223
            goto L22a
        L223:
            r20 = r2
            r17 = r3
            r21 = r6
            goto L242
        L22a:
            a45 r16 = new a45
            r20 = r2
            r17 = r3
            r26 = r5
            r21 = r6
            r24 = r9
            r23 = r10
            r19 = r14
            r16.<init>(r17, r19, r20, r21, r23, r24, r25, r26)
            r1 = r16
            r15.l0(r1)
        L242:
            qn2 r1 = (defpackage.qn2) r1
            r0 = 0
            defpackage.ak7.j(r11, r1, r15, r0)
            r5 = r17
            r4 = r20
            r2 = r21
            r7 = r27
            r1 = r28
            goto L25d
        L253:
            r15.V()
            r1 = r2
            r2 = r6
            r4 = r10
            r5 = r34
            r7 = r36
        L25d:
            cf5 r10 = r15.t()
            if (r10 == 0) goto L26c
            b45 r0 = new b45
            r9 = r39
            r0.<init>(r1, r2, r4, r5, r7, r8, r9)
            r10.d = r0
        L26c:
            return
    }

    public static final void b(defpackage.a74 r23, long r24, long r26, defpackage.px0 r28, int r29, int r30) {
            r2 = r24
            r9 = r28
            xq2 r9 = (defpackage.xq2) r9
            r0 = 1501635280(0x598122d0, float:4.5435686E15)
            r9.d0(r0)
            r0 = r29 & 48
            if (r0 != 0) goto L1e
            boolean r0 = r9.e(r2)
            if (r0 == 0) goto L19
            r0 = 32
            goto L1b
        L19:
            r0 = 16
        L1b:
            r0 = r29 | r0
            goto L20
        L1e:
            r0 = r29
        L20:
            r4 = r30 & 4
            r12 = 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L30
            r4 = r26
            boolean r6 = r9.e(r4)
            if (r6 == 0) goto L32
            r6 = r12
            goto L34
        L30:
            r4 = r26
        L32:
            r6 = 128(0x80, float:1.8E-43)
        L34:
            r0 = r0 | r6
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r6 = r0 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r14 = 1
            if (r6 == r7) goto L40
            r6 = r14
            goto L41
        L40:
            r6 = 0
        L41:
            r7 = r0 & 1
            boolean r6 = r9.S(r7, r6)
            if (r6 == 0) goto L1bc
            r9.X()
            r6 = r29 & 1
            if (r6 == 0) goto L63
            boolean r6 = r9.B()
            if (r6 == 0) goto L57
            goto L63
        L57:
            r9.V()
            r6 = r30 & 4
            if (r6 == 0) goto L60
        L5e:
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
        L60:
            r0 = r0 & (-7169(0xffffffffffffe3ff, float:NaN))
            goto L6f
        L63:
            r6 = r30 & 4
            if (r6 == 0) goto L60
            r4 = 1047904911(0x3e75c28f, float:0.24)
            long r4 = defpackage.kt0.c(r4, r2)
            goto L5e
        L6f:
            r9.q()
            r15 = 0
            r5 = r4
            g53 r4 = defpackage.yh2.H(r15, r9, r14)
            java.lang.Object r7 = r9.P()
            vs0 r8 = defpackage.ox0.a
            if (r7 != r8) goto L8a
            dv4 r7 = new dv4
            r10 = 9
            r7.<init>(r10)
            r9.l0(r7)
        L8a:
            qn2 r7 = (defpackage.qn2) r7
            ci3 r7 = defpackage.ge7.K(r7)
            r10 = 6
            d53 r7 = defpackage.ge7.G(r7, r15, r10)
            r11 = 8
            r16 = r5
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r18 = r8
            r8 = 0
            r19 = r10
            r10 = 4536(0x11b8, float:6.356E-42)
            r1 = r16
            r13 = r18
            r3 = r19
            e53 r5 = defpackage.yh2.h(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r6 = r9.P()
            if (r6 != r13) goto Lbd
            dv4 r6 = new dv4
            r7 = 10
            r6.<init>(r7)
            r9.l0(r6)
        Lbd:
            qn2 r6 = (defpackage.qn2) r6
            ci3 r6 = defpackage.ge7.K(r6)
            d53 r7 = defpackage.ge7.G(r6, r15, r3)
            r8 = 0
            r11 = 8
            r6 = r5
            r5 = 0
            r17 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r20 = r17
            e53 r6 = defpackage.yh2.h(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r5 = r9.P()
            if (r5 != r13) goto Le6
            dv4 r5 = new dv4
            r7 = 11
            r5.<init>(r7)
            r9.l0(r5)
        Le6:
            qn2 r5 = (defpackage.qn2) r5
            ci3 r5 = defpackage.ge7.K(r5)
            d53 r7 = defpackage.ge7.G(r5, r15, r3)
            r8 = 0
            r11 = 8
            r5 = 0
            r17 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r21 = r17
            e53 r7 = defpackage.yh2.h(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r5 = r9.P()
            if (r5 != r13) goto L10e
            dv4 r5 = new dv4
            r6 = 12
            r5.<init>(r6)
            r9.l0(r5)
        L10e:
            qn2 r5 = (defpackage.qn2) r5
            ci3 r5 = defpackage.ge7.K(r5)
            d53 r3 = defpackage.ge7.G(r5, r15, r3)
            r8 = 0
            r11 = 8
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r22 = r7
            r7 = r3
            r3 = r22
            e53 r8 = defpackage.yh2.h(r4, r5, r6, r7, r8, r9, r10, r11)
            nw0 r4 = new nw0
            r5 = 2
            r4.<init>(r5)
            r10 = r23
            a74 r4 = defpackage.ge7.L(r10, r4)
            dv4 r5 = new dv4
            r6 = 7
            r5.<init>(r6)
            a74 r4 = defpackage.ua6.a(r4, r14, r5)
            r5 = 0
            r6 = 1092616192(0x41200000, float:10.0)
            a74 r4 = defpackage.ge7.Q(r4, r5, r6, r14)
            dv4 r5 = new dv4
            r6 = 13
            r5.<init>(r6)
            a74 r4 = defpackage.ua6.a(r4, r14, r5)
            r5 = 1131413504(0x43700000, float:240.0)
            r6 = 1082130432(0x40800000, float:4.0)
            a74 r11 = defpackage.dj6.j(r4, r5, r6)
            r4 = r0 & 896(0x380, float:1.256E-42)
            r4 = r4 ^ 384(0x180, float:5.38E-43)
            if (r4 <= r12) goto L163
            boolean r4 = r9.e(r1)
            if (r4 != 0) goto L167
        L163:
            r4 = r0 & 384(0x180, float:5.38E-43)
            if (r4 != r12) goto L16a
        L167:
            r4 = r14
        L168:
            r5 = 0
            goto L16c
        L16a:
            r4 = 0
            goto L168
        L16c:
            boolean r6 = r9.d(r5)
            r4 = r4 | r6
            r5 = r20
            boolean r6 = r9.f(r5)
            r4 = r4 | r6
            r6 = r21
            boolean r7 = r9.f(r6)
            r4 = r4 | r7
            r7 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 ^ 48
            r12 = 32
            r14 = r24
            if (r7 <= r12) goto L18f
            boolean r7 = r9.e(r14)
            if (r7 != 0) goto L193
        L18f:
            r0 = r0 & 48
            if (r0 != r12) goto L195
        L193:
            r0 = 1
            goto L196
        L195:
            r0 = 0
        L196:
            r0 = r0 | r4
            boolean r4 = r9.f(r3)
            r0 = r0 | r4
            boolean r4 = r9.f(r8)
            r0 = r0 | r4
            java.lang.Object r4 = r9.P()
            if (r0 != 0) goto L1a9
            if (r4 != r13) goto L1b4
        L1a9:
            c45 r0 = new c45
            r7 = r3
            r3 = r14
            r0.<init>(r1, r3, r5, r6, r7, r8)
            r9.l0(r0)
            r4 = r0
        L1b4:
            qn2 r4 = (defpackage.qn2) r4
            r5 = 0
            defpackage.ak7.j(r11, r4, r9, r5)
            r4 = r1
            goto L1c1
        L1bc:
            r10 = r23
            r9.V()
        L1c1:
            cf5 r8 = r9.t()
            if (r8 == 0) goto L1d5
            d45 r0 = new d45
            r2 = r24
            r6 = r29
            r7 = r30
            r1 = r10
            r0.<init>(r1, r2, r4, r6, r7)
            r8.d = r0
        L1d5:
            return
    }

    public static final void c(float r17, defpackage.a74 r18, long r19, long r21, defpackage.px0 r23, int r24, int r25) {
            r1 = r17
            r2 = r18
            r7 = r19
            r0 = r23
            xq2 r0 = (defpackage.xq2) r0
            r3 = -531984864(0xffffffffe04a8e20, float:-5.8382555E19)
            r0.d0(r3)
            boolean r3 = r0.c(r1)
            r4 = 2
            if (r3 == 0) goto L19
            r3 = 4
            goto L1a
        L19:
            r3 = r4
        L1a:
            r3 = r24 | r3
            r5 = r24 & 48
            if (r5 != 0) goto L2c
            boolean r5 = r0.f(r2)
            if (r5 == 0) goto L29
            r5 = 32
            goto L2b
        L29:
            r5 = 16
        L2b:
            r3 = r3 | r5
        L2c:
            boolean r5 = r0.e(r7)
            if (r5 == 0) goto L35
            r5 = 256(0x100, float:3.59E-43)
            goto L37
        L35:
            r5 = 128(0x80, float:1.8E-43)
        L37:
            r3 = r3 | r5
            r5 = r25 & 8
            r10 = r21
            if (r5 != 0) goto L47
            boolean r5 = r0.e(r10)
            if (r5 == 0) goto L47
            r5 = 2048(0x800, float:2.87E-42)
            goto L49
        L47:
            r5 = 1024(0x400, float:1.435E-42)
        L49:
            r3 = r3 | r5
            r3 = r3 | 8192(0x2000, float:1.148E-41)
            r5 = r3 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            r13 = 1
            r14 = 0
            if (r5 == r12) goto L56
            r5 = r13
            goto L57
        L56:
            r5 = r14
        L57:
            r12 = r3 & 1
            boolean r5 = r0.S(r12, r5)
            if (r5 == 0) goto L12f
            r0.X()
            r5 = r24 & 1
            r12 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L7b
            boolean r5 = r0.B()
            if (r5 == 0) goto L70
            goto L7b
        L70:
            r0.V()
            r5 = r25 & 8
            if (r5 == 0) goto L79
        L77:
            r3 = r3 & (-7169(0xffffffffffffe3ff, float:NaN))
        L79:
            r3 = r3 & r12
            goto L87
        L7b:
            r5 = r25 & 8
            if (r5 == 0) goto L79
            r5 = 1047904911(0x3e75c28f, float:0.24)
            long r10 = defpackage.kt0.c(r5, r7)
            goto L77
        L87:
            r0.q()
            r5 = 0
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 >= 0) goto L91
            r12 = r5
            goto L92
        L91:
            r12 = r1
        L92:
            r15 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r16 <= 0) goto L99
            r12 = r15
        L99:
            nw0 r6 = new nw0
            r6.<init>(r4)
            a74 r4 = defpackage.ge7.L(r2, r6)
            dv4 r6 = new dv4
            r9 = 7
            r6.<init>(r9)
            a74 r4 = defpackage.ua6.a(r4, r13, r6)
            r6 = 1092616192(0x41200000, float:10.0)
            a74 r4 = defpackage.ge7.Q(r4, r5, r6, r13)
            java.lang.Float r6 = java.lang.Float.valueOf(r12)
            boolean r9 = java.lang.Float.isNaN(r12)
            if (r9 != 0) goto Lbd
            goto Lbe
        Lbd:
            r6 = 0
        Lbe:
            if (r6 == 0) goto Lc5
            float r6 = r6.floatValue()
            goto Lc6
        Lc5:
            r6 = r5
        Lc6:
            bs0 r9 = new bs0
            r9.<init>(r5, r15)
            f45 r5 = new f45
            r5.<init>(r6, r9, r14)
            a74 r4 = defpackage.ua6.a(r4, r13, r5)
            r5 = 1131413504(0x43700000, float:240.0)
            r6 = 1082130432(0x40800000, float:4.0)
            a74 r9 = defpackage.dj6.j(r4, r5, r6)
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 ^ 3072(0xc00, float:4.305E-42)
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 <= r5) goto Lea
            boolean r4 = r0.e(r10)
            if (r4 != 0) goto Lee
        Lea:
            r4 = r3 & 3072(0xc00, float:4.305E-42)
            if (r4 != r5) goto Lf0
        Lee:
            r4 = r13
            goto Lf1
        Lf0:
            r4 = r14
        Lf1:
            boolean r5 = r0.d(r14)
            r4 = r4 | r5
            boolean r5 = r0.c(r12)
            r4 = r4 | r5
            r5 = r3 & 896(0x380, float:1.256E-42)
            r5 = r5 ^ 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 <= r6) goto L109
            boolean r5 = r0.e(r7)
            if (r5 != 0) goto L10f
        L109:
            r3 = r3 & 384(0x180, float:5.38E-43)
            if (r3 != r6) goto L10e
            goto L10f
        L10e:
            r13 = r14
        L10f:
            r3 = r4 | r13
            java.lang.Object r4 = r0.P()
            if (r3 != 0) goto L11e
            vs0 r3 = defpackage.ox0.a
            if (r4 != r3) goto L11c
            goto L11e
        L11c:
            r5 = r10
            goto L129
        L11e:
            y35 r3 = new y35
            r5 = r10
            r4 = r12
            r3.<init>(r4, r5, r7)
            r0.l0(r3)
            r4 = r3
        L129:
            qn2 r4 = (defpackage.qn2) r4
            defpackage.ak7.j(r9, r4, r0, r14)
            goto L133
        L12f:
            r0.V()
            r5 = r10
        L133:
            cf5 r9 = r0.t()
            if (r9 == 0) goto L146
            z35 r0 = new z35
            r3 = r19
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r5, r7, r8)
            r9.d = r0
        L146:
            return
    }

    public static final void d(defpackage.no1 r12, float r13, float r14, long r15, defpackage.ys6 r17) {
            r10 = r17
            float r0 = r10.a
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            long r2 = r12.e()
            r4 = 32
            long r2 = r2 >> r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r1 = r1 * r0
            float r2 = r2 - r1
            int r1 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            long r5 = r5 << r4
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r7
            long r5 = r5 | r0
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r2
            long r0 = r0 << r4
            long r2 = r2 & r7
            long r7 = r0 | r2
            r9 = 0
            r11 = 832(0x340, float:1.166E-42)
            r0 = r12
            r3 = r13
            r4 = r14
            r1 = r15
            defpackage.no1.E(r0, r1, r3, r4, r5, r7, r9, r10, r11)
            return
    }

    public static final void e(defpackage.no1 r21, float r22, float r23, long r24, float r26) {
            long r0 = r21.e()
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r3 = r21.e()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r1 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            kk3 r3 = r21.getLayoutDirection()
            kk3 r4 = defpackage.kk3.Ltr
            if (r3 != r4) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L30
            r7 = r22
            goto L32
        L30:
            float r7 = r4 - r23
        L32:
            float r7 = r7 * r0
            if (r3 == 0) goto L38
            r3 = r23
            goto L3a
        L38:
            float r3 = r4 - r22
        L3a:
            float r3 = r3 * r0
            int r0 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r9 = (long) r0
            long r7 = r7 << r2
            long r9 = r9 & r5
            long r14 = r7 | r9
            int r0 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r3 << r2
            long r0 = r0 & r5
            long r16 = r2 | r0
            r19 = 0
            r20 = 496(0x1f0, float:6.95E-43)
            r11 = r21
            r12 = r24
            r18 = r26
            defpackage.no1.p0(r11, r12, r14, r16, r18, r19, r20)
            return
    }
}
