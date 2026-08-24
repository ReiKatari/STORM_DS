package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gu0  reason: default package */
/* loaded from: classes.dex */
public final class gu0 extends defpackage.h0 {
    public defpackage.on2 H0;
    public boolean I0;
    public final defpackage.u94 J0;
    public final defpackage.u94 K0;
    public defpackage.vy4 L0;
    public defpackage.ap6 M0;
    public defpackage.ap6 N0;
    public boolean O0;
    public boolean P0;
    public long Q0;
    public boolean R0;
    public defpackage.s43 S0;
    public defpackage.ap6 T0;
    public defpackage.ap6 U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public boolean Y0;

    public gu0(defpackage.on2 r9, defpackage.on2 r10, defpackage.r94 r11, boolean r12) {
            r8 = this;
            r5 = 0
            r6 = 0
            r2 = 0
            r3 = 0
            r0 = r8
            r7 = r9
            r1 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.H0 = r10
            r8 = 1
            r0.I0 = r8
            int r8 = defpackage.wy3.a
            u94 r8 = new u94
            r9 = 6
            r8.<init>(r9)
            r0.J0 = r8
            u94 r8 = new u94
            r8.<init>(r9)
            r0.K0 = r8
            r8 = -1
            r0.Q0 = r8
            r0.X0 = r8
            return
    }

    @Override // defpackage.h0, defpackage.yy4
    public final void I() {
            r1 = this;
            super.I()
            r0 = 0
            r1.g1(r0)
            return
    }

    @Override // defpackage.z64
    public final void L0() {
            r0 = this;
            r0.j1()
            return
    }

    @Override // defpackage.h0
    public final void U0(defpackage.gb6 r4) {
            r3 = this;
            on2 r0 = r3.H0
            if (r0 == 0) goto L18
            a5 r0 = new a5
            r1 = 17
            r0.<init>(r3, r1)
            fg3[] r3 = defpackage.eb6.a
            fb6 r3 = defpackage.sa6.c
            y1 r1 = new y1
            r2 = 0
            r1.<init>(r2, r0)
            r4.a(r3, r1)
        L18:
            return
    }

    @Override // defpackage.h0
    public final void c1() {
            r0 = this;
            r0.j1()
            return
    }

    @Override // defpackage.h0
    public final boolean d1(android.view.KeyEvent r7) {
            r6 = this;
            long r0 = defpackage.xk2.m(r7)
            on2 r7 = r6.H0
            r2 = 0
            if (r7 == 0) goto L25
            u94 r7 = r6.J0
            java.lang.Object r3 = r7.d(r0)
            if (r3 != 0) goto L25
            w61 r3 = r6.F0()
            fu0 r4 = new fu0
            r5 = 2
            r4.<init>(r6, r2, r5)
            r5 = 3
            ap6 r2 = defpackage.hv.L(r3, r2, r2, r4, r5)
            r7.g(r0, r2)
            r7 = 1
            goto L26
        L25:
            r7 = 0
        L26:
            u94 r6 = r6.K0
            java.lang.Object r6 = r6.d(r0)
            eu0 r6 = (defpackage.eu0) r6
            return r7
    }

    @Override // defpackage.h0
    public final void e1(android.view.KeyEvent r6) {
            r5 = this;
            long r0 = defpackage.xk2.m(r6)
            u94 r6 = r5.J0
            java.lang.Object r2 = r6.d(r0)
            r3 = 0
            if (r2 == 0) goto L24
            java.lang.Object r2 = r6.d(r0)
            rc3 r2 = (defpackage.rc3) r2
            if (r2 == 0) goto L21
            boolean r4 = r2.e()
            if (r4 == 0) goto L20
            r4 = 0
            r2.h(r4)
            goto L21
        L20:
            r3 = 1
        L21:
            r6.f(r0)
        L24:
            if (r3 != 0) goto L2b
            on2 r5 = r5.s0
            r5.c()
        L2b:
            return
    }

    @Override // defpackage.a53
    public final void f0() {
            r1 = this;
            r0 = 1
            r1.g1(r0)
            return
    }

    public final void g1(boolean r6) {
            r5 = this;
            r0 = -1
            r2 = 0
            r3 = 0
            if (r6 == 0) goto L23
            r5.S0 = r3
            ap6 r4 = r5.T0
            if (r4 == 0) goto Lf
            r4.h(r3)
        Lf:
            r5.T0 = r3
            ap6 r4 = r5.U0
            if (r4 == 0) goto L18
            r4.h(r3)
        L18:
            r5.U0 = r3
            r5.V0 = r2
            r5.W0 = r2
            r5.X0 = r0
            r5.Y0 = r2
            goto L3f
        L23:
            r5.L0 = r3
            ap6 r4 = r5.M0
            if (r4 == 0) goto L2c
            r4.h(r3)
        L2c:
            r5.M0 = r3
            ap6 r4 = r5.N0
            if (r4 == 0) goto L35
            r4.h(r3)
        L35:
            r5.N0 = r3
            r5.O0 = r2
            r5.P0 = r2
            r5.Q0 = r0
            r5.R0 = r2
        L3f:
            r5.X0(r6)
            return
    }

    public final void h1(long r3, defpackage.s43 r5) {
            r2 = this;
            boolean r0 = r2.r0
            if (r0 == 0) goto L1e
            boolean r0 = r2.Y0
            if (r0 != 0) goto L1e
            long r0 = r5.c
            r5 = 1
            r2.Y0(r0, r5)
            r2.X0 = r3
            boolean r3 = r2.W0
            if (r3 != 0) goto L1e
            boolean r3 = r2.V0
            if (r3 == 0) goto L19
            goto L1e
        L19:
            on2 r3 = r2.s0
            r3.c()
        L1e:
            r3 = 0
            r2.S0 = r3
            r4 = 0
            r2.Y0 = r4
            r2.V0 = r4
            ap6 r5 = r2.T0
            if (r5 == 0) goto L2d
            r5.h(r3)
        L2d:
            r2.T0 = r3
            r2.W0 = r4
            return
    }

    public final void i1(long r5, defpackage.vy4 r7) {
            r4 = this;
            boolean r0 = r4.r0
            r1 = 0
            if (r0 == 0) goto L1e
            boolean r0 = r4.R0
            if (r0 != 0) goto L1e
            long r2 = r7.c
            r4.Y0(r2, r1)
            r4.Q0 = r5
            boolean r5 = r4.P0
            if (r5 != 0) goto L1e
            boolean r5 = r4.O0
            if (r5 == 0) goto L19
            goto L1e
        L19:
            on2 r5 = r4.s0
            r5.c()
        L1e:
            r5 = 0
            r4.L0 = r5
            r4.R0 = r1
            r4.O0 = r1
            ap6 r6 = r4.M0
            if (r6 == 0) goto L2c
            r6.h(r5)
        L2c:
            r4.M0 = r5
            r4.P0 = r1
            return
    }

    public final void j1() {
            r24 = this;
            r0 = r24
            u94 r1 = r0.J0
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            r14 = 0
            if (r4 < 0) goto L5c
            r15 = r14
            r16 = 128(0x80, double:6.3E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L2e:
            if (r9 >= r8) goto L4e
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = r10
            r10 = r20
            rc3 r10 = (defpackage.rc3) r10
            r10.h(r5)
            goto L48
        L46:
            r21 = r10
        L48:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = r21
            goto L2e
        L4e:
            r21 = r10
            if (r8 != r13) goto L62
            goto L55
        L53:
            r21 = r10
        L55:
            if (r15 == r4) goto L62
            int r15 = r15 + 1
            r10 = r21
            goto L1a
        L5c:
            r21 = r10
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L62:
            r1.a()
            u94 r0 = r0.K0
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto La2
            r4 = r14
        L71:
            r6 = r2[r4]
            long r8 = ~r6
            long r8 = r8 << r21
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L9d
            int r8 = r4 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L84:
            if (r9 >= r8) goto L9b
            long r22 = r6 & r18
            int r10 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r10 < 0) goto L90
            long r6 = r6 >> r13
            int r9 = r9 + 1
            goto L84
        L90:
            int r0 = r4 << 3
            int r0 = r0 + r9
            r0 = r1[r0]
            eu0 r0 = (defpackage.eu0) r0
            r0.getClass()
            throw r5
        L9b:
            if (r8 != r13) goto La2
        L9d:
            if (r4 == r3) goto La2
            int r4 = r4 + 1
            goto L71
        La2:
            r0.a()
            return
    }

    @Override // defpackage.a53
    public final void u(defpackage.ei r10, defpackage.py4 r11) {
            r9 = this;
            java.lang.Object r10 = r10.L
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r9.b1()
            boolean r0 = r9.r0
            if (r0 == 0) goto L19
            vr2 r0 = r9.v0
            if (r0 != 0) goto L19
            vr2 r0 = new vr2
            r0.<init>(r9)
            r9.R0(r0)
            r9.v0 = r0
        L19:
            py4 r0 = defpackage.py4.Main
            r1 = 1
            r2 = 0
            if (r11 != r0) goto L142
            s43 r11 = r9.S0
            if (r11 != 0) goto L90
            int r11 = r10.size()
            r0 = r2
        L28:
            if (r0 >= r11) goto L169
            java.lang.Object r3 = r10.get(r0)
            s43 r3 = (defpackage.s43) r3
            boolean r3 = defpackage.jx2.k(r3)
            if (r3 == 0) goto L8d
            java.lang.Object r10 = r10.get(r2)
            s43 r10 = (defpackage.s43) r10
            r10.i = r1
            r9.S0 = r10
            boolean r11 = r9.r0
            if (r11 == 0) goto L169
            ap6 r11 = r9.U0
            r0 = 0
            if (r11 == 0) goto L73
            boolean r11 = r11.e()
            if (r11 != r1) goto L73
            nq6 r11 = defpackage.ky0.t
            java.lang.Object r11 = defpackage.hf.K(r9, r11)
            fo7 r11 = (defpackage.fo7) r11
            r11.getClass()
            long r3 = r10.b
            long r5 = r9.X0
            long r3 = r3 - r5
            r5 = 40
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L68
            r9.Y0 = r1
            return
        L68:
            r9.V0 = r1
            ap6 r11 = r9.U0
            if (r11 == 0) goto L71
            r11.h(r0)
        L71:
            r9.U0 = r0
        L73:
            r9.W0 = r2
            r9.Z0(r10)
            on2 r10 = r9.H0
            if (r10 == 0) goto L169
            w61 r10 = r9.F0()
            fu0 r11 = new fu0
            r11.<init>(r9, r0, r1)
            r1 = 3
            ap6 r10 = defpackage.hv.L(r10, r0, r0, r11, r1)
            r9.T0 = r10
            return
        L8d:
            int r0 = r0 + 1
            goto L28
        L90:
            boolean r11 = r9.W0
            if (r11 == 0) goto Ld0
            int r11 = r10.size()
            r0 = r2
        L99:
            if (r0 >= r11) goto Lbd
            java.lang.Object r3 = r10.get(r0)
            s43 r3 = (defpackage.s43) r3
            boolean r4 = r3.h
            if (r4 == 0) goto Lac
            boolean r3 = r3.d
            if (r3 != 0) goto Lac
            int r0 = r0 + 1
            goto L99
        Lac:
            int r9 = r10.size()
        Lb0:
            if (r2 >= r9) goto L169
            java.lang.Object r11 = r10.get(r2)
            s43 r11 = (defpackage.s43) r11
            r11.i = r1
            int r2 = r2 + 1
            goto Lb0
        Lbd:
            java.lang.Object r10 = r10.get(r2)
            s43 r10 = (defpackage.s43) r10
            r10.i = r1
            long r10 = r10.b
            s43 r0 = r9.S0
            r0.getClass()
            r9.h1(r10, r0)
            return
        Ld0:
            int r11 = r10.size()
            r0 = r2
        Ld5:
            if (r0 >= r11) goto L12f
            java.lang.Object r3 = r10.get(r0)
            s43 r3 = (defpackage.s43) r3
            boolean r4 = r3.i
            if (r4 != 0) goto Lec
            boolean r4 = r3.h
            if (r4 == 0) goto Lec
            boolean r3 = r3.d
            if (r3 != 0) goto Lec
            int r0 = r0 + 1
            goto Ld5
        Lec:
            nq6 r11 = defpackage.ky0.t
            java.lang.Object r11 = defpackage.hf.K(r9, r11)
            fo7 r11 = (defpackage.fo7) r11
            float r11 = r11.f()
            int r0 = r10.size()
            r3 = r2
        Lfd:
            if (r3 >= r0) goto L169
            java.lang.Object r4 = r10.get(r3)
            s43 r4 = (defpackage.s43) r4
            long r5 = r4.c
            s43 r7 = r9.S0
            r7.getClass()
            long r7 = r7.c
            long r5 = defpackage.jk4.e(r5, r7)
            float r5 = defpackage.jk4.d(r5)
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L120
            r5 = r1
            goto L121
        L120:
            r5 = r2
        L121:
            boolean r4 = r4.i
            if (r4 != 0) goto L12b
            if (r5 == 0) goto L128
            goto L12b
        L128:
            int r3 = r3 + 1
            goto Lfd
        L12b:
            r9.g1(r1)
            return
        L12f:
            java.lang.Object r10 = r10.get(r2)
            s43 r10 = (defpackage.s43) r10
            r10.i = r1
            long r10 = r10.b
            s43 r0 = r9.S0
            r0.getClass()
            r9.h1(r10, r0)
            return
        L142:
            py4 r0 = defpackage.py4.Final
            if (r11 != r0) goto L169
            s43 r11 = r9.S0
            if (r11 == 0) goto L169
            boolean r11 = r9.W0
            if (r11 != 0) goto L169
            int r11 = r10.size()
        L152:
            if (r2 >= r11) goto L169
            java.lang.Object r0 = r10.get(r2)
            s43 r0 = (defpackage.s43) r0
            boolean r3 = r0.i
            if (r3 == 0) goto L166
            s43 r3 = r9.S0
            if (r0 == r3) goto L166
            r9.g1(r1)
            return
        L166:
            int r2 = r2 + 1
            goto L152
        L169:
            return
    }

    @Override // defpackage.h0, defpackage.yy4
    public final void w(defpackage.oy4 r7, defpackage.py4 r8, long r9) {
            r6 = this;
            super.w(r7, r8, r9)
            py4 r0 = defpackage.py4.Main
            r1 = 0
            if (r8 != r0) goto L137
            vy4 r8 = r6.L0
            r0 = 0
            r2 = 1
            if (r8 != 0) goto L6d
            boolean r8 = defpackage.hz6.e(r7, r2)
            if (r8 == 0) goto L163
            java.util.List r7 = r7.a
            java.lang.Object r7 = r7.get(r1)
            vy4 r7 = (defpackage.vy4) r7
            r7.a()
            r6.L0 = r7
            boolean r8 = r6.r0
            if (r8 == 0) goto L163
            ap6 r8 = r6.N0
            if (r8 == 0) goto L53
            boolean r8 = r8.e()
            if (r8 != r2) goto L53
            nq6 r8 = defpackage.ky0.t
            java.lang.Object r8 = defpackage.hf.K(r6, r8)
            fo7 r8 = (defpackage.fo7) r8
            r8.getClass()
            long r8 = r7.b
            long r3 = r6.Q0
            long r8 = r8 - r3
            r3 = 40
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 >= 0) goto L48
            r6.R0 = r2
            return
        L48:
            r6.O0 = r2
            ap6 r8 = r6.N0
            if (r8 == 0) goto L51
            r8.h(r0)
        L51:
            r6.N0 = r0
        L53:
            r6.P0 = r1
            r6.a1(r7)
            on2 r7 = r6.H0
            if (r7 == 0) goto L163
            w61 r7 = r6.F0()
            fu0 r8 = new fu0
            r8.<init>(r6, r0, r1)
            r9 = 3
            ap6 r7 = defpackage.hv.L(r7, r0, r0, r8, r9)
            r6.M0 = r7
            return
        L6d:
            int r8 = r7.c
            r3 = 2
            if (r8 != r3) goto L74
            r8 = r2
            goto L75
        L74:
            r8 = r1
        L75:
            java.util.List r7 = r7.a
            if (r8 == 0) goto La8
            boolean r8 = r6.P0
            if (r8 != 0) goto La8
            boolean r8 = r6.r0
            if (r8 == 0) goto La8
            on2 r8 = r6.H0
            if (r8 == 0) goto La8
            ap6 r8 = r6.M0
            if (r8 == 0) goto L8c
            r8.h(r0)
        L8c:
            r6.M0 = r0
            on2 r8 = r6.H0
            if (r8 == 0) goto L95
            r8.c()
        L95:
            boolean r8 = r6.I0
            if (r8 == 0) goto La6
            nq6 r8 = defpackage.ky0.l
            java.lang.Object r8 = defpackage.hf.K(r6, r8)
            tv2 r8 = (defpackage.tv2) r8
            lx4 r8 = (defpackage.lx4) r8
            r8.a(r1)
        La6:
            r6.P0 = r2
        La8:
            boolean r8 = r6.P0
            if (r8 == 0) goto Le8
            int r8 = r7.size()
            r9 = r1
        Lb1:
            if (r9 >= r8) goto Ld4
            java.lang.Object r10 = r7.get(r9)
            vy4 r10 = (defpackage.vy4) r10
            boolean r10 = defpackage.ej2.p(r10)
            if (r10 != 0) goto Ld1
            int r6 = r7.size()
        Lc3:
            if (r1 >= r6) goto L163
            java.lang.Object r8 = r7.get(r1)
            vy4 r8 = (defpackage.vy4) r8
            r8.a()
            int r1 = r1 + 1
            goto Lc3
        Ld1:
            int r9 = r9 + 1
            goto Lb1
        Ld4:
            java.lang.Object r7 = r7.get(r1)
            vy4 r7 = (defpackage.vy4) r7
            r7.a()
            long r7 = r7.b
            vy4 r9 = r6.L0
            r9.getClass()
            r6.i1(r7, r9)
            return
        Le8:
            int r8 = r7.size()
            r0 = r1
        Led:
            if (r0 >= r8) goto L123
            java.lang.Object r2 = r7.get(r0)
            vy4 r2 = (defpackage.vy4) r2
            boolean r2 = defpackage.ej2.o(r2)
            if (r2 != 0) goto L120
            long r2 = r6.W0(r9)
            int r8 = r7.size()
            r0 = r1
        L104:
            if (r0 >= r8) goto L163
            java.lang.Object r4 = r7.get(r0)
            vy4 r4 = (defpackage.vy4) r4
            boolean r5 = r4.c()
            if (r5 != 0) goto L11c
            boolean r4 = defpackage.ej2.K(r4, r9, r2)
            if (r4 == 0) goto L119
            goto L11c
        L119:
            int r0 = r0 + 1
            goto L104
        L11c:
            r6.g1(r1)
            return
        L120:
            int r0 = r0 + 1
            goto Led
        L123:
            java.lang.Object r7 = r7.get(r1)
            vy4 r7 = (defpackage.vy4) r7
            r7.a()
            long r7 = r7.b
            vy4 r9 = r6.L0
            r9.getClass()
            r6.i1(r7, r9)
            return
        L137:
            py4 r9 = defpackage.py4.Final
            if (r8 != r9) goto L163
            vy4 r8 = r6.L0
            if (r8 == 0) goto L163
            boolean r8 = r6.P0
            if (r8 != 0) goto L163
            java.util.List r7 = r7.a
            int r8 = r7.size()
            r9 = r1
        L14a:
            if (r9 >= r8) goto L163
            java.lang.Object r10 = r7.get(r9)
            vy4 r10 = (defpackage.vy4) r10
            boolean r0 = r10.c()
            if (r0 == 0) goto L160
            vy4 r0 = r6.L0
            if (r10 == r0) goto L160
            r6.g1(r1)
            return
        L160:
            int r9 = r9 + 1
            goto L14a
        L163:
            return
    }
}
