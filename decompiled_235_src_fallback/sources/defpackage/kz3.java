package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kz3  reason: default package */
/* loaded from: classes.dex */
public abstract class kz3 extends defpackage.dx4 implements defpackage.z74, defpackage.g34 {
    public defpackage.iz3 Y;
    public defpackage.qn2 Z;
    public defpackage.fx4 d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public final defpackage.lz3 h0;
    public defpackage.z9 i0;
    public defpackage.ja4 j0;

    public kz3() {
            r2 = this;
            r2.<init>()
            lz3 r0 = new lz3
            r1 = 0
            r0.<init>(r2, r1)
            r2.h0 = r0
            return
    }

    public static void K0(defpackage.eg4 r1) {
            eg4 r0 = r1.n0
            sm3 r1 = r1.k0
            if (r0 == 0) goto L9
            sm3 r0 = r0.k0
            goto La
        L9:
            r0 = 0
        La:
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L1a
            wm3 r1 = r1.C0
            d34 r1 = r1.p
            tm3 r1 = r1.t0
            r1.f()
            return
        L1a:
            wm3 r1 = r1.C0
            d34 r1 = r1.p
            nc r1 = r1.j()
            if (r1 == 0) goto L2d
            d34 r1 = (defpackage.d34) r1
            tm3 r1 = r1.t0
            if (r1 == 0) goto L2d
            r1.f()
        L2d:
            return
    }

    public abstract defpackage.jk3 A0();

    public abstract boolean C0();

    public abstract defpackage.sm3 F0();

    public abstract defpackage.f34 G0();

    @Override // defpackage.z74
    public final void H(boolean r5) {
            r4 = this;
            kz3 r0 = r4.H0()
            r1 = 0
            if (r0 == 0) goto Lc
            sm3 r0 = r0.F0()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            sm3 r2 = r4.F0()
            boolean r2 = defpackage.nb3.k(r0, r2)
            if (r2 == 0) goto L1a
            r4.e0 = r5
            return
        L1a:
            if (r0 == 0) goto L21
            wm3 r2 = r0.C0
            om3 r2 = r2.d
            goto L22
        L21:
            r2 = r1
        L22:
            om3 r3 = defpackage.om3.LayingOut
            if (r2 == r3) goto L32
            if (r0 == 0) goto L2c
            wm3 r0 = r0.C0
            om3 r1 = r0.d
        L2c:
            om3 r0 = defpackage.om3.LookaheadLayingOut
            if (r1 != r0) goto L31
            goto L32
        L31:
            return
        L32:
            r4.e0 = r5
            return
    }

    public abstract defpackage.kz3 H0();

    public abstract long I0();

    public final defpackage.iz3 J0() {
            r1 = this;
            iz3 r0 = r1.Y
            if (r0 != 0) goto Lb
            iz3 r0 = new iz3
            r0.<init>(r1)
            r1.Y = r0
        Lb:
            return r0
    }

    public final void L0(defpackage.ka4 r14) {
            r13 = this;
            java.lang.Object[] r0 = r14.b
            long[] r14 = r14.a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L57
            r2 = 0
            r3 = r2
        Lb:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L52
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L50
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L4c
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            ss7 r9 = (defpackage.ss7) r9
            java.lang.Object r9 = r9.get()
            sm3 r9 = (defpackage.sm3) r9
            if (r9 == 0) goto L4c
            boolean r10 = r13.a0()
            if (r10 == 0) goto L49
            r9.S(r2)
            goto L4c
        L49:
            r9.U(r2)
        L4c:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L50:
            if (r6 != r7) goto L57
        L52:
            if (r3 == r1) goto L57
            int r3 = r3 + 1
            goto Lb
        L57:
            return
    }

    public abstract void M0();

    @Override // defpackage.dx4
    public final int X(defpackage.ey2 r5) {
            r4 = this;
            boolean r0 = r4.C0()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L9
            goto Lf
        L9:
            int r5 = r4.u0(r5)
            if (r5 != r1) goto L10
        Lf:
            return r1
        L10:
            long r0 = r4.X
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r4 = (int) r0
            int r5 = r5 + r4
            return r5
    }

    @Override // defpackage.eb3
    public boolean a0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.g34
    public final defpackage.f34 o0(int r10, int r11, java.util.Map r12, defpackage.qn2 r13, defpackage.qn2 r14) {
            r9 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r10 & r0
            if (r1 != 0) goto La
            r0 = r0 & r11
            if (r0 != 0) goto La
            goto L28
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size("
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = " x "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ") is out of range. Each dimension must be between 0 and 16777215."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.p53.c(r0)
        L28:
            tt r1 = new tt
            r8 = 1
            r7 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public final void s0(defpackage.sm3 r32, defpackage.hy2 r33) {
            r31 = this;
            r0 = r31
            r1 = r33
            ja4 r2 = r0.j0
            r7 = 7
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r10 = 8
            if (r2 == 0) goto L108
            java.lang.Object[] r12 = r2.c
            long[] r2 = r2.a
            int r13 = r2.length
            int r13 = r13 + (-2)
            if (r13 < 0) goto L108
            r14 = 0
            r15 = 128(0x80, double:6.3E-322)
        L1c:
            r3 = r2[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r5 = ~r3
            long r5 = r5 << r7
            long r5 = r5 & r3
            long r5 = r5 & r8
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto Lf0
            int r5 = r14 - r13
            int r5 = ~r5
            int r5 = r5 >>> 31
            int r5 = 8 - r5
            r6 = 0
        L30:
            if (r6 >= r5) goto Le4
            long r19 = r3 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto Lc6
            int r19 = r14 << 3
            int r19 = r19 + r6
            r19 = r12[r19]
            r20 = r7
            r7 = r19
            ka4 r7 = (defpackage.ka4) r7
            r21 = r8
            java.lang.Object[] r8 = r7.b
            long[] r9 = r7.a
            int r11 = r9.length
            int r11 = r11 + (-2)
            if (r11 < 0) goto Lbb
            r23 = r15
            r15 = 0
            r16 = r10
        L54:
            r25 = r11
            r10 = r9[r15]
            r26 = r2
            r27 = r3
            long r2 = ~r10
            long r2 = r2 << r20
            long r2 = r2 & r10
            long r2 = r2 & r21
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto Lab
            int r2 = r15 - r25
            int r2 = ~r2
            int r2 = r2 >>> 31
            int r2 = 8 - r2
            r3 = 0
        L6e:
            if (r3 >= r2) goto La2
            long r29 = r10 & r17
            int r4 = (r29 > r23 ? 1 : (r29 == r23 ? 0 : -1))
            if (r4 >= 0) goto L97
            int r4 = r15 << 3
            int r4 = r4 + r3
            r29 = r8[r4]
            ss7 r29 = (defpackage.ss7) r29
            java.lang.Object r29 = r29.get()
            sm3 r29 = (defpackage.sm3) r29
            r30 = r3
            if (r29 == 0) goto L91
            boolean r3 = r29.H()
            r29 = r6
            r6 = 1
            if (r3 != r6) goto L93
            goto L9b
        L91:
            r29 = r6
        L93:
            r7.m(r4)
            goto L9b
        L97:
            r30 = r3
            r29 = r6
        L9b:
            long r10 = r10 >> r16
            int r3 = r30 + 1
            r6 = r29
            goto L6e
        La2:
            r29 = r6
            r3 = r16
            if (r2 != r3) goto Lc3
        La8:
            r11 = r25
            goto Lae
        Lab:
            r29 = r6
            goto La8
        Lae:
            if (r15 == r11) goto Lc3
            int r15 = r15 + 1
            r2 = r26
            r3 = r27
            r6 = r29
            r16 = 8
            goto L54
        Lbb:
            r26 = r2
            r27 = r3
            r29 = r6
            r23 = r15
        Lc3:
            r3 = 8
            goto Ld3
        Lc6:
            r26 = r2
            r27 = r3
            r29 = r6
            r20 = r7
            r21 = r8
            r23 = r15
            r3 = r10
        Ld3:
            long r6 = r27 >> r3
            int r2 = r29 + 1
            r10 = r3
            r3 = r6
            r7 = r20
            r8 = r21
            r15 = r23
            r6 = r2
            r2 = r26
            goto L30
        Le4:
            r26 = r2
            r20 = r7
            r21 = r8
            r3 = r10
            r23 = r15
            if (r5 != r3) goto L110
            goto Lf8
        Lf0:
            r26 = r2
            r20 = r7
            r21 = r8
            r23 = r15
        Lf8:
            if (r14 == r13) goto L110
            int r14 = r14 + 1
            r7 = r20
            r8 = r21
            r15 = r23
            r2 = r26
            r10 = 8
            goto L1c
        L108:
            r20 = r7
            r21 = r8
            r17 = 255(0xff, double:1.26E-321)
            r23 = 128(0x80, double:6.3E-322)
        L110:
            ja4 r2 = r0.j0
            if (r2 == 0) goto L164
            long[] r3 = r2.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L164
            r5 = 0
        L11c:
            r6 = r3[r5]
            long r8 = ~r6
            long r8 = r8 << r20
            long r8 = r8 & r6
            long r8 = r8 & r21
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L15d
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r16 = 8
            int r10 = 8 - r8
            r8 = 0
        L132:
            if (r8 >= r10) goto L158
            long r11 = r6 & r17
            int r9 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r9 >= 0) goto L152
            int r9 = r5 << 3
            int r9 = r9 + r8
            java.lang.Object[] r11 = r2.b
            r11 = r11[r9]
            java.lang.Object[] r12 = r2.c
            r12 = r12[r9]
            ka4 r12 = (defpackage.ka4) r12
            hy2 r11 = (defpackage.hy2) r11
            boolean r11 = r12.g()
            if (r11 == 0) goto L152
            r2.l(r9)
        L152:
            r9 = 8
            long r6 = r6 >> r9
            int r8 = r8 + 1
            goto L132
        L158:
            r9 = 8
            if (r10 != r9) goto L164
            goto L15f
        L15d:
            r9 = 8
        L15f:
            if (r5 == r4) goto L164
            int r5 = r5 + 1
            goto L11c
        L164:
            ja4 r2 = r0.j0
            if (r2 != 0) goto L16f
            ja4 r2 = new ja4
            r2.<init>()
            r0.j0 = r2
        L16f:
            java.lang.Object r0 = r2.g(r1)
            if (r0 != 0) goto L17d
            ka4 r0 = new ka4
            r0.<init>()
            r2.m(r1, r0)
        L17d:
            ka4 r0 = (defpackage.ka4) r0
            ss7 r1 = new ss7
            r2 = r32
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    public abstract int u0(defpackage.ey2 r1);

    public final void w0(defpackage.fx4 r24, long r25, long r27) {
            r23 = this;
            r1 = r23
            ja4 r7 = r1.j0
            z9 r0 = r1.i0
            if (r0 != 0) goto Lf
            z9 r0 = new z9
            r0.<init>()
            r1.i0 = r0
        Lf:
            r8 = r0
            sm3 r0 = r1.F0()
            zp4 r0 = r0.k0
            if (r0 == 0) goto L32
            te r0 = (defpackage.te) r0
            bq4 r9 = r0.getSnapshotObserver()
            if (r9 == 0) goto L32
            hh2 r10 = defpackage.hh2.Z
            jz3 r0 = new jz3
            r6 = r24
            r2 = r25
            r4 = r27
            r0.<init>(r1, r2, r4, r6)
            qm6 r1 = r9.a
            r1.d(r6, r10, r0)
        L32:
            boolean r0 = r23.a0()
            java.lang.Object r1 = r8.e
            ka4 r1 = (defpackage.ka4) r1
            java.lang.Object r2 = r8.f
            ka4 r2 = (defpackage.ka4) r2
            int r3 = r8.a
            r5 = 0
        L41:
            if (r5 >= r3) goto L74
            java.lang.Object r6 = r8.d
            byte[] r6 = (byte[]) r6
            r6 = r6[r5]
            r9 = 3
            if (r6 != r9) goto L59
            java.lang.Object r6 = r8.b
            hy2[] r6 = (defpackage.hy2[]) r6
            r6 = r6[r5]
            r6.getClass()
            r2.k(r6)
            goto L71
        L59:
            if (r6 == 0) goto L71
            if (r7 == 0) goto L71
            java.lang.Object r6 = r8.b
            hy2[] r6 = (defpackage.hy2[]) r6
            r6 = r6[r5]
            r6.getClass()
            java.lang.Object r6 = r7.k(r6)
            ka4 r6 = (defpackage.ka4) r6
            if (r6 == 0) goto L71
            r1.j(r6)
        L71:
            int r5 = r5 + 1
            goto L41
        L74:
            int r3 = r8.a
            r5 = 0
            r6 = 0
        L78:
            r7 = 2
            if (r5 >= r3) goto L97
            java.lang.Object r9 = r8.d
            byte[] r9 = (byte[]) r9
            r10 = r9[r5]
            if (r10 != r7) goto L86
            int r6 = r6 + 1
            goto L92
        L86:
            if (r6 <= 0) goto L92
            int r10 = r5 - r6
            java.lang.Object r11 = r8.b
            hy2[] r11 = (defpackage.hy2[]) r11
            r12 = r11[r5]
            r11[r10] = r12
        L92:
            r9[r5] = r7
            int r5 = r5 + 1
            goto L78
        L97:
            int r3 = r8.a
            int r5 = r3 - r6
        L9b:
            r9 = 0
            if (r5 >= r3) goto La7
            java.lang.Object r10 = r8.b
            hy2[] r10 = (defpackage.hy2[]) r10
            r10[r5] = r9
            int r5 = r5 + 1
            goto L9b
        La7:
            int r3 = r8.a
            int r3 = r3 - r6
            r8.a = r3
            kz3 r3 = r23.H0()
            java.lang.Object[] r5 = r2.b
            long[] r6 = r2.a
            int r8 = r6.length
            int r8 = r8 - r7
            r14 = 7
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r24 = r7
            r7 = 8
            if (r8 < 0) goto L15b
            r26 = 128(0x80, double:6.3E-322)
            r9 = 0
        Lc5:
            r10 = r6[r9]
            r17 = 255(0xff, double:1.26E-321)
            long r12 = ~r10
            long r12 = r12 << r14
            long r12 = r12 & r10
            long r12 = r12 & r15
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 == 0) goto L147
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = 0
        Ld9:
            if (r13 >= r12) goto L13d
            long r19 = r10 & r17
            int r19 = (r19 > r26 ? 1 : (r19 == r26 ? 0 : -1))
            if (r19 >= 0) goto L128
            int r19 = r9 << 3
            int r19 = r19 + r13
            r19 = r5[r19]
            r28 = r14
            r14 = r19
            hy2 r14 = (defpackage.hy2) r14
            r19 = r15
            if (r3 != 0) goto Lf4
            r15 = r23
            goto Lf5
        Lf4:
            r15 = r3
        Lf5:
            r21 = r7
            r4 = r15
        Lf8:
            z9 r7 = r4.i0
            if (r7 == 0) goto L10a
            java.lang.Object r7 = r7.b
            hy2[] r7 = (defpackage.hy2[]) r7
            boolean r7 = defpackage.fv.o0(r7, r14)
            r22 = r0
            r0 = 1
            if (r7 != r0) goto L10c
            goto L112
        L10a:
            r22 = r0
        L10c:
            kz3 r0 = r4.H0()
            if (r0 != 0) goto L124
        L112:
            ja4 r0 = r4.j0
            if (r0 == 0) goto L11d
            java.lang.Object r0 = r0.k(r14)
            ka4 r0 = (defpackage.ka4) r0
            goto L11e
        L11d:
            r0 = 0
        L11e:
            if (r0 == 0) goto L130
            r15.L0(r0)
            goto L130
        L124:
            r4 = r0
            r0 = r22
            goto Lf8
        L128:
            r22 = r0
            r21 = r7
            r28 = r14
            r19 = r15
        L130:
            long r10 = r10 >> r21
            int r13 = r13 + 1
            r14 = r28
            r15 = r19
            r7 = r21
            r0 = r22
            goto Ld9
        L13d:
            r22 = r0
            r0 = r7
            r28 = r14
            r19 = r15
            if (r12 != r0) goto L165
            goto L14d
        L147:
            r22 = r0
            r28 = r14
            r19 = r15
        L14d:
            if (r9 == r8) goto L165
            int r9 = r9 + 1
            r14 = r28
            r15 = r19
            r0 = r22
            r7 = 8
            goto Lc5
        L15b:
            r22 = r0
            r28 = r14
            r19 = r15
            r26 = 128(0x80, double:6.3E-322)
            r17 = 255(0xff, double:1.26E-321)
        L165:
            r2.b()
            java.lang.Object[] r0 = r1.b
            long[] r2 = r1.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L1c1
            r4 = 0
        L172:
            r5 = r2[r4]
            long r7 = ~r5
            long r7 = r7 << r28
            long r7 = r7 & r5
            long r7 = r7 & r19
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 == 0) goto L1b9
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r21 = 8
            int r7 = 8 - r7
            r8 = 0
        L188:
            if (r8 >= r7) goto L1b3
            long r9 = r5 & r17
            int r9 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r9 >= 0) goto L1ad
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            ss7 r9 = (defpackage.ss7) r9
            java.lang.Object r9 = r9.get()
            sm3 r9 = (defpackage.sm3) r9
            if (r9 == 0) goto L1ad
            if (r22 == 0) goto L1a6
            r10 = 0
            r9.S(r10)
            goto L1aa
        L1a6:
            r10 = 0
            r9.U(r10)
        L1aa:
            r9 = 8
            goto L1af
        L1ad:
            r10 = 0
            goto L1aa
        L1af:
            long r5 = r5 >> r9
            int r8 = r8 + 1
            goto L188
        L1b3:
            r9 = 8
            r10 = 0
            if (r7 != r9) goto L1c1
            goto L1bc
        L1b9:
            r9 = 8
            r10 = 0
        L1bc:
            if (r4 == r3) goto L1c1
            int r4 = r4 + 1
            goto L172
        L1c1:
            r1.b()
            return
    }

    public final void x0(defpackage.f34 r15) {
            r14 = this;
            ja4 r0 = r14.j0
            boolean r1 = r14.g0
            if (r1 == 0) goto L8
            goto Lbd
        L8:
            qn2 r1 = r15.c()
            r2 = 0
            if (r1 != 0) goto L59
            if (r0 == 0) goto Lbd
            java.lang.Object[] r15 = r0.c
            long[] r1 = r0.a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L55
            r4 = r2
        L1b:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L50
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L35:
            if (r9 >= r7) goto L4e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            ka4 r10 = (defpackage.ka4) r10
            r14.L0(r10)
        L4a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4e:
            if (r7 != r8) goto L55
        L50:
            if (r4 == r3) goto L55
            int r4 = r4 + 1
            goto L1b
        L55:
            r0.a()
            return
        L59:
            qn2 r0 = r14.Z
            r3 = 1
            if (r0 == r1) goto L60
            r0 = r3
            goto L61
        L60:
            r0 = r2
        L61:
            r4 = 0
            if (r0 != 0) goto L9a
            iz3 r1 = r14.J0()
            boolean r1 = r1.A
            if (r1 == 0) goto L9a
            jk3 r0 = r14.A0()
            long r4 = r0.w(r4)
            long r4 = defpackage.kn2.a0(r4)
            long r0 = r0.m()
            iz3 r6 = r14.J0()
            long r6 = r6.B
            boolean r6 = defpackage.i93.a(r4, r6)
            if (r6 == 0) goto L95
            iz3 r6 = r14.J0()
            long r6 = r6.L
            boolean r6 = defpackage.q93.b(r0, r6)
            if (r6 != 0) goto L96
        L95:
            r2 = r3
        L96:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La1
        L9a:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La1:
            if (r0 == 0) goto Lbd
            fx4 r0 = r14.d0
            if (r0 == 0) goto Lac
            r0.A = r15
        La9:
            r1 = r14
            r2 = r0
            goto Lb4
        Lac:
            fx4 r0 = new fx4
            r0.<init>(r15, r14)
            r14.d0 = r0
            goto La9
        Lb4:
            r1.w0(r2, r3, r5)
            qn2 r14 = r15.c()
            r1.Z = r14
        Lbd:
            return
    }

    public abstract defpackage.kz3 z0();
}
