package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ps7  reason: default package */
/* loaded from: classes.dex */
public abstract class ps7 {
    public static final void a(java.lang.String r36, defpackage.on2 r37, defpackage.a74 r38, java.util.List r39, defpackage.eo2 r40, defpackage.x56 r41, defpackage.zv0 r42, defpackage.px0 r43, int r44, int r45) {
            r8 = r44
            r36.getClass()
            r37.getClass()
            r0 = r43
            xq2 r0 = (defpackage.xq2) r0
            r1 = -724428556(0xffffffffd4d218f4, float:-7.218894E12)
            r0.d0(r1)
            r1 = r8 & 6
            if (r1 != 0) goto L23
            r1 = r36
            boolean r2 = r0.f(r1)
            if (r2 == 0) goto L20
            r2 = 4
            goto L21
        L20:
            r2 = 2
        L21:
            r2 = r2 | r8
            goto L26
        L23:
            r1 = r36
            r2 = r8
        L26:
            r3 = r8 & 48
            r4 = r37
            if (r3 != 0) goto L38
            boolean r3 = r0.h(r4)
            if (r3 == 0) goto L35
            r3 = 32
            goto L37
        L35:
            r3 = 16
        L37:
            r2 = r2 | r3
        L38:
            r3 = r2 | 384(0x180, float:5.38E-43)
            r5 = r8 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L40
            r3 = r2 | 1408(0x580, float:1.973E-42)
        L40:
            r2 = r45 & 16
            if (r2 == 0) goto L49
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L46:
            r5 = r40
            goto L5b
        L49:
            r5 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L46
            r5 = r40
            boolean r6 = r0.h(r5)
            if (r6 == 0) goto L58
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L5a
        L58:
            r6 = 8192(0x2000, float:1.148E-41)
        L5a:
            r3 = r3 | r6
        L5b:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 & r8
            if (r6 != 0) goto L75
            r6 = r45 & 32
            if (r6 != 0) goto L6f
            r6 = r41
            boolean r7 = r0.f(r6)
            if (r7 == 0) goto L71
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L73
        L6f:
            r6 = r41
        L71:
            r7 = 65536(0x10000, float:9.1835E-41)
        L73:
            r3 = r3 | r7
            goto L77
        L75:
            r6 = r41
        L77:
            r7 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 & r8
            r9 = r42
            if (r7 != 0) goto L8a
            boolean r7 = r0.h(r9)
            if (r7 == 0) goto L87
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L89
        L87:
            r7 = 524288(0x80000, float:7.34684E-40)
        L89:
            r3 = r3 | r7
        L8a:
            r7 = 599187(0x92493, float:8.3964E-40)
            r7 = r7 & r3
            r10 = 599186(0x92492, float:8.39638E-40)
            if (r7 == r10) goto L95
            r7 = 1
            goto L96
        L95:
            r7 = 0
        L96:
            r10 = r3 & 1
            boolean r7 = r0.S(r10, r7)
            if (r7 == 0) goto L17c
            r0.X()
            r7 = r8 & 1
            r10 = -465921(0xfffffffffff8e3ff, float:NaN)
            if (r7 == 0) goto Lc2
            boolean r7 = r0.B()
            if (r7 == 0) goto Laf
            goto Lc2
        Laf:
            r0.V()
            r2 = r3 & (-7169(0xffffffffffffe3ff, float:NaN))
            r7 = r45 & 32
            if (r7 == 0) goto Lba
            r2 = r3 & r10
        Lba:
            r10 = r38
            r11 = r39
            r13 = r2
            r12 = r6
            r6 = r5
            goto L10f
        Lc2:
            rq2 r7 = new rq2
            r11 = 2131952373(0x7f1302f5, float:1.9541187E38)
            java.lang.String r11 = defpackage.yh2.O(r0, r11)
            r12 = 0
            r7.<init>(r12, r11)
            rq2 r11 = new rq2
            r13 = 2131952371(0x7f1302f3, float:1.9541183E38)
            java.lang.String r13 = defpackage.yh2.O(r0, r13)
            java.lang.String r14 = "A"
            r11.<init>(r14, r13)
            rq2 r13 = new rq2
            r14 = 2131952372(0x7f1302f4, float:1.9541185E38)
            java.lang.String r14 = defpackage.yh2.O(r0, r14)
            java.lang.String r15 = "B"
            r13.<init>(r15, r14)
            rq2[] r7 = new defpackage.rq2[]{r7, r11, r13}
            java.util.List r7 = defpackage.hf.c0(r7)
            r11 = r3 & (-7169(0xffffffffffffe3ff, float:NaN))
            if (r2 == 0) goto Lf8
            r5 = r12
        Lf8:
            r2 = r45 & 32
            x64 r13 = defpackage.x64.a
            if (r2 == 0) goto L10a
            r2 = 3
            x56 r2 = defpackage.v56.d(r12, r0, r2)
            r3 = r3 & r10
            r12 = r2
            r6 = r5
            r11 = r7
            r10 = r13
            r13 = r3
            goto L10f
        L10a:
            r12 = r6
            r10 = r13
            r6 = r5
            r13 = r11
            r11 = r7
        L10f:
            r0.q()
            es7 r3 = defpackage.bl2.F(r0)
            long r14 = r3.b
            java.util.WeakHashMap r2 = defpackage.dv7.w
            dv7 r2 = defpackage.th7.d(r0)
            ig7 r2 = r2.l
            r5 = r2
            p4 r2 = new p4
            r7 = 13
            r35 = r5
            r5 = r1
            r1 = r35
            r2.<init>(r3, r4, r5, r6, r7)
            r4 = -235669190(0xfffffffff1f3f93a, float:-2.4161969E30)
            zv0 r2 = defpackage.n16.I(r4, r2, r0)
            sa5 r4 = new sa5
            r5 = 15
            r4.<init>(r5, r3, r11)
            r3 = 2053807227(0x7a6a9c7b, float:3.0454282E35)
            zv0 r3 = defpackage.n16.I(r3, r4, r0)
            int r4 = r13 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | 27648(0x6c00, float:3.8743E-41)
            int r5 = r13 >> 9
            r5 = r5 & 896(0x380, float:1.256E-42)
            r32 = r4 | r5
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            int r5 = r13 << 6
            r33 = r5 & r4
            r34 = 196576(0x2ffe0, float:2.75462E-40)
            r26 = r14
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r28 = 0
            r31 = r0
            r13 = r3
            r30 = r9
            r7 = r11
            r11 = r12
            r9 = r1
            r12 = r2
            defpackage.v56.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r26, r28, r30, r31, r32, r33, r34)
            r5 = r6
            r4 = r7
            r3 = r10
            r6 = r11
            goto L185
        L17c:
            r31 = r0
            r31.V()
            r3 = r38
            r4 = r39
        L185:
            cf5 r10 = r31.t()
            if (r10 == 0) goto L19a
            os7 r0 = new os7
            r1 = r36
            r2 = r37
            r7 = r42
            r9 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.d = r0
        L19a:
            return
    }

    public static final java.lang.Object b(defpackage.s41 r6) {
            l61 r0 = r6.b()
            defpackage.yh2.o(r0)
            r41 r6 = defpackage.np2.V(r6)
            boolean r1 = r6 instanceof defpackage.nk1
            if (r1 == 0) goto L12
            nk1 r6 = (defpackage.nk1) r6
            goto L13
        L12:
            r6 = 0
        L13:
            jg7 r1 = defpackage.jg7.a
            if (r6 != 0) goto L19
            r6 = r1
            goto L3e
        L19:
            n61 r2 = r6.R
            boolean r3 = defpackage.ok1.c(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2a
            r6.Y = r1
            r6.L = r4
            r2.k0(r0, r6)
            goto L3c
        L2a:
            iy7 r3 = new iy7
            th7 r5 = defpackage.iy7.B
            r3.<init>(r5)
            l61 r0 = r0.N(r3)
            r6.Y = r1
            r6.L = r4
            r2.k0(r0, r6)
        L3c:
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
        L3e:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            if (r6 != r0) goto L43
            return r6
        L43:
            return r1
    }
}
