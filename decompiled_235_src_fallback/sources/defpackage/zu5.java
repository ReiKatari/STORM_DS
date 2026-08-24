package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu5  reason: default package */
/* loaded from: classes.dex */
public abstract class zu5 {
    public static final void a(defpackage.e33 r32, long r33, java.lang.String r35, boolean r36, defpackage.on2 r37, defpackage.px0 r38, int r39, int r40) {
            r6 = r37
            r7 = r39
            r13 = r38
            xq2 r13 = (defpackage.xq2) r13
            r0 = -64805549(0xfffffffffc232553, float:-3.3884057E36)
            r13.d0(r0)
            r8 = r32
            boolean r0 = r13.f(r8)
            if (r0 == 0) goto L18
            r0 = 4
            goto L19
        L18:
            r0 = 2
        L19:
            r0 = r0 | r7
            r2 = r33
            boolean r1 = r13.e(r2)
            if (r1 == 0) goto L25
            r1 = 32
            goto L27
        L25:
            r1 = 16
        L27:
            r0 = r0 | r1
            r4 = r35
            boolean r1 = r13.f(r4)
            if (r1 == 0) goto L33
            r1 = 256(0x100, float:3.59E-43)
            goto L35
        L33:
            r1 = 128(0x80, float:1.8E-43)
        L35:
            r0 = r0 | r1
            r1 = r40 & 8
            if (r1 == 0) goto L3f
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L3c:
            r5 = r36
            goto L51
        L3f:
            r5 = r7 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L3c
            r5 = r36
            boolean r9 = r13.g(r5)
            if (r9 == 0) goto L4e
            r9 = 2048(0x800, float:2.87E-42)
            goto L50
        L4e:
            r9 = 1024(0x400, float:1.435E-42)
        L50:
            r0 = r0 | r9
        L51:
            r9 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L61
            boolean r9 = r13.h(r6)
            if (r9 == 0) goto L5e
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L60
        L5e:
            r9 = 8192(0x2000, float:1.148E-41)
        L60:
            r0 = r0 | r9
        L61:
            r9 = r0 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            r11 = 0
            if (r9 == r10) goto L6a
            r9 = 1
            goto L6b
        L6a:
            r9 = r11
        L6b:
            r10 = r0 & 1
            boolean r9 = r13.S(r10, r9)
            if (r9 == 0) goto L14e
            if (r1 == 0) goto L76
            r5 = 1
        L76:
            es7 r1 = defpackage.bl2.F(r13)
            d40 r9 = defpackage.d90.i0
            r10 = 1065353216(0x3f800000, float:1.0)
            x64 r14 = defpackage.x64.a
            a74 r10 = defpackage.dj6.c(r14, r10)
            if (r5 == 0) goto L8e
            r15 = 0
            r12 = 15
            a74 r11 = defpackage.mb3.u(r14, r11, r15, r6, r12)
            goto L8f
        L8e:
            r11 = r14
        L8f:
            a74 r10 = r10.d(r11)
            r11 = 1099956224(0x41900000, float:18.0)
            r12 = 1094713344(0x41400000, float:12.0)
            a74 r10 = defpackage.ge7.P(r10, r11, r12)
            du r11 = defpackage.ju.a
            r12 = 48
            l26 r9 = defpackage.k26.a(r11, r9, r13, r12)
            long r11 = r13.T
            int r11 = java.lang.Long.hashCode(r11)
            xv4 r12 = r13.l()
            a74 r10 = defpackage.l.E(r13, r10)
            ix0 r15 = defpackage.jx0.i
            r15.getClass()
            iy0 r15 = defpackage.ix0.b
            r13.f0()
            r16 = r0
            boolean r0 = r13.S
            if (r0 == 0) goto Lc5
            r13.k(r15)
            goto Lc8
        Lc5:
            r13.o0()
        Lc8:
            pn r0 = defpackage.ix0.f
            defpackage.yh2.K(r13, r0, r9)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r13, r0, r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            pn r9 = defpackage.ix0.g
            defpackage.yh2.K(r13, r9, r0)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r13, r0)
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r13, r0, r10)
            if (r5 == 0) goto Le9
            r11 = r2
            goto Lec
        Le9:
            long r9 = r1.l
            r11 = r9
        Lec:
            r0 = 1101004800(0x41a00000, float:20.0)
            a74 r10 = defpackage.dj6.i(r14, r0)
            r0 = r16 & 14
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            r15 = 0
            r9 = 0
            r31 = r14
            r14 = r0
            r0 = r31
            defpackage.i13.a(r8, r9, r10, r11, r13, r14, r15)
            r8 = 1096810496(0x41600000, float:14.0)
            a74 r0 = defpackage.dj6.l(r0, r8)
            defpackage.gi2.h(r13, r0)
            if (r5 == 0) goto L10f
            long r0 = r1.g
        L10d:
            r10 = r0
            goto L112
        L10f:
            long r0 = r1.l
            goto L10d
        L112:
            r0 = 14
            r27 = r13
            long r12 = defpackage.hi2.E(r0)
            if (r5 == 0) goto L120
            oj2 r1 = defpackage.oj2.Z
        L11e:
            r14 = r1
            goto L123
        L120:
            oj2 r1 = defpackage.oj2.d0
            goto L11e
        L123:
            int r1 = r16 >> 6
            r0 = r0 & r1
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r29 = 0
            r30 = 131026(0x1ffd2, float:1.83607E-40)
            r9 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = r0
            r8 = r4
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            r0 = 1
            r13.p(r0)
            goto L151
        L14e:
            r13.V()
        L151:
            cf5 r9 = r13.t()
            if (r9 == 0) goto L164
            wu5 r0 = new wu5
            r1 = r32
            r4 = r35
            r8 = r40
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r9.d = r0
        L164:
            return
    }

    public static final void b(defpackage.pq5 r13, defpackage.on2 r14, defpackage.qn2 r15, defpackage.qn2 r16, defpackage.qn2 r17, defpackage.qn2 r18, defpackage.qn2 r19, defpackage.qn2 r20, defpackage.px0 r21, int r22) {
            r14.getClass()
            r15.getClass()
            r16.getClass()
            r17.getClass()
            r18.getClass()
            r12 = r21
            xq2 r12 = (defpackage.xq2) r12
            r0 = -152537623(0xfffffffff6e875e9, float:-2.3574304E33)
            r12.d0(r0)
            boolean r0 = r12.h(r13)
            if (r0 == 0) goto L21
            r0 = 4
            goto L22
        L21:
            r0 = 2
        L22:
            r0 = r22 | r0
            boolean r2 = r12.h(r15)
            if (r2 == 0) goto L2d
            r2 = 256(0x100, float:3.59E-43)
            goto L2f
        L2d:
            r2 = 128(0x80, float:1.8E-43)
        L2f:
            r0 = r0 | r2
            r4 = r16
            boolean r2 = r12.h(r4)
            if (r2 == 0) goto L3b
            r2 = 2048(0x800, float:2.87E-42)
            goto L3d
        L3b:
            r2 = 1024(0x400, float:1.435E-42)
        L3d:
            r0 = r0 | r2
            r5 = r17
            boolean r2 = r12.h(r5)
            if (r2 == 0) goto L49
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L4b
        L49:
            r2 = 8192(0x2000, float:1.148E-41)
        L4b:
            r0 = r0 | r2
            r6 = r18
            boolean r2 = r12.h(r6)
            if (r2 == 0) goto L57
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L59
        L57:
            r2 = 65536(0x10000, float:9.1835E-41)
        L59:
            r0 = r0 | r2
            r7 = r19
            boolean r2 = r12.h(r7)
            if (r2 == 0) goto L65
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L67
        L65:
            r2 = 524288(0x80000, float:7.34684E-40)
        L67:
            r0 = r0 | r2
            r2 = 4793491(0x492493, float:6.717112E-39)
            r2 = r2 & r0
            r8 = 4793490(0x492492, float:6.71711E-39)
            r9 = 1
            r10 = 0
            if (r2 == r8) goto L75
            r2 = r9
            goto L76
        L75:
            r2 = r10
        L76:
            r0 = r0 & r9
            boolean r0 = r12.S(r0, r2)
            if (r0 == 0) goto Lf9
            if (r13 != 0) goto L95
            cf5 r11 = r12.t()
            if (r11 == 0) goto L11a
            uu5 r0 = new uu5
            r10 = 0
            r1 = r13
            r2 = r14
            r3 = r15
            r8 = r20
            r9 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L92:
            r11.d = r0
            return
        L95:
            es7 r0 = defpackage.bl2.F(r12)
            nq6 r2 = defpackage.kf.b
            java.lang.Object r2 = r12.j(r2)
            android.content.Context r2 = (android.content.Context) r2
            boolean r3 = r12.f(r13)
            java.lang.Object r4 = r12.P()
            if (r3 != 0) goto Laf
            vs0 r3 = defpackage.ox0.a
            if (r4 != r3) goto Lce
        Laf:
            boolean r3 = r13.c()
            if (r3 == 0) goto Lb7
        Lb5:
            r9 = r10
            goto Lc7
        Lb7:
            boolean r3 = r13.h
            if (r3 == 0) goto Lb5
            me.magnum.melonds.MelonRomDecryptor r3 = me.magnum.melonds.MelonRomDecryptor.a
            android.net.Uri r4 = r13.d
            me.magnum.melonds.MelonRomDecryptor$b r2 = r3.a(r2, r4)
            me.magnum.melonds.MelonRomDecryptor$b r3 = me.magnum.melonds.MelonRomDecryptor.b.MODCRYPT_ENCRYPTED
            if (r2 != r3) goto Lb5
        Lc7:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            r12.l0(r4)
        Lce:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r5 = r4.booleanValue()
            r1 = r0
            xu5 r0 = new xu5
            r11 = 0
            r3 = r13
            r4 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r2 = r19
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 621242752(0x25076980, float:1.1745128E-16)
            zv0 r2 = defpackage.n16.I(r1, r0, r12)
            r4 = 390(0x186, float:5.47E-43)
            r5 = 2
            r1 = 0
            r0 = r14
            r3 = r12
            defpackage.nw7.o(r0, r1, r2, r3, r4, r5)
            goto Lfd
        Lf9:
            r3 = r12
            r3.V()
        Lfd:
            cf5 r11 = r3.t()
            if (r11 == 0) goto L11a
            uu5 r0 = new uu5
            r10 = 1
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L92
        L11a:
            return
    }
}
