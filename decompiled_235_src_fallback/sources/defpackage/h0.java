package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h0  reason: default package */
/* loaded from: classes.dex */
public abstract class h0 extends defpackage.zg1 implements defpackage.yy4, defpackage.bh3, defpackage.va6, defpackage.ub7, defpackage.fy0, defpackage.gi4, defpackage.a53, defpackage.ur2 {
    public static final defpackage.cs1 G0 = null;
    public long A0;
    public defpackage.l25 B0;
    public defpackage.r94 C0;
    public boolean D0;
    public defpackage.ap6 E0;
    public final defpackage.cs1 F0;
    public defpackage.r94 m0;
    public defpackage.n43 n0;
    public boolean o0;
    public java.lang.String p0;
    public defpackage.mq5 q0;
    public boolean r0;
    public defpackage.on2 s0;
    public final defpackage.di2 t0;
    public defpackage.n43 u0;
    public defpackage.vr2 v0;
    public defpackage.xg1 w0;
    public defpackage.l25 x0;
    public defpackage.oy2 y0;
    public final defpackage.u94 z0;

    static {
            cs1 r0 = new cs1
            r1 = 21
            r0.<init>(r1)
            defpackage.h0.G0 = r0
            return
    }

    public h0(defpackage.r94 r10, defpackage.n43 r11, boolean r12, boolean r13, java.lang.String r14, defpackage.mq5 r15, defpackage.on2 r16) {
            r9 = this;
            r9.<init>()
            r9.m0 = r10
            r9.n0 = r11
            r9.o0 = r12
            r9.p0 = r14
            r9.q0 = r15
            r9.r0 = r13
            r11 = r16
            r9.s0 = r11
            di2 r11 = new di2
            a0 r0 = new a0
            r7 = 0
            r8 = 0
            r1 = 1
            java.lang.Class<h0> r3 = defpackage.h0.class
            java.lang.String r4 = "onFocusChange"
            java.lang.String r5 = "onFocusChange(Z)V"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = 0
            r11.<init>(r10, r12, r0)
            r9.t0 = r11
            int r10 = defpackage.wy3.a
            u94 r10 = new u94
            r11 = 6
            r10.<init>(r11)
            r9.z0 = r10
            r10 = 0
            r9.A0 = r10
            r94 r10 = r9.m0
            r9.C0 = r10
            if (r10 != 0) goto L40
            r12 = 1
        L40:
            r9.D0 = r12
            cs1 r10 = defpackage.h0.G0
            r9.F0 = r10
            return
    }

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r5) {
            r4 = this;
            mq5 r0 = r4.q0
            if (r0 == 0) goto L9
            int r0 = r0.a
            defpackage.eb6.d(r5, r0)
        L9:
            java.lang.String r0 = r4.p0
            x r1 = new x
            r2 = 1
            r1.<init>(r4, r2)
            fg3[] r2 = defpackage.eb6.a
            fb6 r2 = defpackage.sa6.b
            y1 r3 = new y1
            r3.<init>(r0, r1)
            r5.a(r2, r3)
            boolean r0 = r4.r0
            if (r0 == 0) goto L27
            di2 r0 = r4.t0
            r0.A0(r5)
            goto L2e
        L27:
            fb6 r0 = defpackage.bb6.j
            jg7 r1 = defpackage.jg7.a
            r5.a(r0, r1)
        L2e:
            r4.U0(r5)
            return
    }

    @Override // defpackage.bh3
    public final boolean B(android.view.KeyEvent r12) {
            r11 = this;
            r11.b1()
            long r0 = defpackage.xk2.m(r12)
            boolean r2 = r11.r0
            r3 = 3
            r4 = 0
            u94 r5 = r11.z0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = defpackage.xk2.u(r12)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = defpackage.mb3.G(r12)
            if (r2 == 0) goto L4a
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L40
            l25 r2 = new l25
            long r9 = r11.A0
            r2.<init>(r9)
            r5.g(r0, r2)
            r94 r0 = r11.m0
            if (r0 == 0) goto L3e
            w61 r0 = r11.F0()
            f0 r1 = new f0
            r1.<init>(r11, r2, r4, r8)
            defpackage.hv.L(r0, r4, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r11 = r11.d1(r12)
            if (r11 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r11.r0
            if (r2 == 0) goto L78
            int r2 = defpackage.xk2.u(r12)
            if (r2 != r6) goto L78
            boolean r2 = defpackage.mb3.G(r12)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.f(r0)
            l25 r0 = (defpackage.l25) r0
            if (r0 == 0) goto L75
            r94 r1 = r11.m0
            if (r1 == 0) goto L72
            w61 r1 = r11.F0()
            f0 r2 = new f0
            r2.<init>(r11, r0, r4, r3)
            defpackage.hv.L(r1, r4, r4, r2, r3)
        L72:
            r11.e1(r12)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
    }

    @Override // defpackage.va6
    public final boolean C0() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    public void I() {
            r3 = this;
            r94 r0 = r3.m0
            if (r0 == 0) goto L10
            oy2 r1 = r3.y0
            if (r1 == 0) goto L10
            py2 r2 = new py2
            r2.<init>(r1)
            r0.b(r2)
        L10:
            r0 = 0
            r3.y0 = r0
            return
    }

    @Override // defpackage.z64
    public final void J0() {
            r1 = this;
            r1.l0()
            boolean r0 = r1.D0
            if (r0 != 0) goto La
            r1.b1()
        La:
            boolean r0 = r1.r0
            if (r0 == 0) goto L13
            di2 r0 = r1.t0
            r1.R0(r0)
        L13:
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r2 = this;
            r2.V0()
            r94 r0 = r2.C0
            r1 = 0
            if (r0 != 0) goto La
            r2.m0 = r1
        La:
            xg1 r0 = r2.w0
            if (r0 == 0) goto L11
            r2.S0(r0)
        L11:
            r2.w0 = r1
            vr2 r0 = r2.v0
            if (r0 == 0) goto L1a
            r2.S0(r0)
        L1a:
            r2.v0 = r1
            return
    }

    public void U0(defpackage.gb6 r1) {
            r0 = this;
            return
    }

    public final void V0() {
            r17 = this;
            r0 = r17
            r94 r1 = r0.m0
            u94 r2 = r0.z0
            if (r1 == 0) goto L76
            l25 r3 = r0.x0
            if (r3 == 0) goto L14
            k25 r4 = new k25
            r4.<init>(r3)
            r1.b(r4)
        L14:
            l25 r3 = r0.B0
            if (r3 == 0) goto L20
            k25 r4 = new k25
            r4.<init>(r3)
            r1.b(r4)
        L20:
            oy2 r3 = r0.y0
            if (r3 == 0) goto L2c
            py2 r4 = new py2
            r4.<init>(r3)
            r1.b(r4)
        L2c:
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
        L37:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L51:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            l25 r13 = (defpackage.l25) r13
            k25 r14 = new k25
            r14.<init>(r13)
            r1.b(r14)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L51
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L37
        L76:
            r1 = 0
            r0.x0 = r1
            r0.B0 = r1
            r0.y0 = r1
            r2.a()
            return
    }

    public final long W0(long r8) {
            r7 = this;
            nq6 r0 = defpackage.ky0.t
            java.lang.Object r0 = defpackage.hf.K(r7, r0)
            fo7 r0 = (defpackage.fo7) r0
            long r0 = r0.d()
            sm3 r7 = defpackage.nc1.f0(r7)
            qh1 r7 = r7.u0
            long r0 = r7.v0(r0)
            r7 = 32
            long r2 = r0 >> r7
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r3 = r8 >> r7
            int r3 = (int) r3
            float r3 = (float) r3
            float r2 = r2 - r3
            r3 = 0
            float r2 = java.lang.Math.max(r3, r2)
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r8 = r8 & r5
            int r8 = (int) r8
            float r8 = (float) r8
            float r0 = r0 - r8
            float r8 = java.lang.Math.max(r3, r0)
            float r8 = r8 / r4
            int r9 = java.lang.Float.floatToRawIntBits(r2)
            long r0 = (long) r9
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r8 = (long) r8
            long r0 = r0 << r7
            long r7 = r8 & r5
            long r7 = r7 | r0
            return r7
    }

    public final void X0(boolean r8) {
            r7 = this;
            r94 r1 = r7.m0
            if (r1 == 0) goto L5a
            ap6 r0 = r7.E0
            r4 = 0
            if (r0 == 0) goto L18
            boolean r0 = r0.e()
            r2 = 1
            if (r0 != r2) goto L18
            ap6 r0 = r7.E0
            if (r0 == 0) goto L53
            r0.h(r4)
            goto L53
        L18:
            if (r8 == 0) goto L1d
            l25 r0 = r7.B0
            goto L1f
        L1d:
            l25 r0 = r7.x0
        L1f:
            if (r0 == 0) goto L53
            k25 r2 = new k25
            r2.<init>(r0)
            w61 r0 = r7.F0()
            o41 r0 = (defpackage.o41) r0
            l61 r0 = r0.B
            vs0 r3 = defpackage.vs0.h0
            j61 r0 = r0.Z(r3)
            rc3 r0 = (defpackage.rc3) r0
            if (r0 == 0) goto L44
            y r3 = new y
            r5 = 0
            r3.<init>(r5, r1, r2)
            il1 r0 = r0.a0(r3)
            r3 = r0
            goto L45
        L44:
            r3 = r4
        L45:
            w61 r6 = r7.F0()
            b0 r0 = new b0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 3
            defpackage.hv.L(r6, r4, r4, r0, r1)
        L53:
            if (r8 == 0) goto L58
            r7.B0 = r4
            return
        L58:
            r7.x0 = r4
        L5a:
            return
    }

    public final void Y0(long r11, boolean r13) {
            r10 = this;
            r94 r6 = r10.m0
            if (r6 == 0) goto L40
            ap6 r5 = r10.E0
            r7 = 3
            r8 = 0
            if (r5 == 0) goto L24
            boolean r0 = r5.e()
            r1 = 1
            if (r0 != r1) goto L24
            r5.h(r8)
            w61 r9 = r10.F0()
            c0 r0 = new c0
            r4 = 0
            r1 = 0
            r2 = r11
            r0.<init>(r1, r2, r4, r5, r6)
            defpackage.hv.L(r9, r8, r8, r0, r7)
            goto L39
        L24:
            if (r13 == 0) goto L29
            l25 r11 = r10.B0
            goto L2b
        L29:
            l25 r11 = r10.x0
        L2b:
            if (r11 == 0) goto L39
            w61 r12 = r10.F0()
            d0 r0 = new d0
            r0.<init>(r11, r6, r8)
            defpackage.hv.L(r12, r8, r8, r0, r7)
        L39:
            if (r13 == 0) goto L3e
            r10.B0 = r8
            return
        L3e:
            r10.x0 = r8
        L40:
            return
    }

    public final void Z0(defpackage.s43 r8) {
            r7 = this;
            r94 r1 = r7.m0
            if (r1 == 0) goto L4f
            l25 r2 = new l25
            long r3 = r8.c
            r2.<init>(r3)
            zg5 r0 = new zg5
            r0.<init>()
            y r3 = new y
            r4 = 14
            r3.<init>(r4, r8, r0)
            y00 r8 = new y00
            r6 = 3
            r8.<init>(r6, r3)
            q61 r3 = defpackage.vr2.l0
            defpackage.ii2.V(r7, r3, r8)
            boolean r8 = r0.A
            r4 = 0
            if (r8 != 0) goto L3e
            boolean r8 = defpackage.pr0.a(r7)
            if (r8 == 0) goto L2e
            goto L3e
        L2e:
            r7.B0 = r2
            w61 r7 = r7.F0()
            d0 r8 = new d0
            r0 = 1
            r8.<init>(r1, r2, r4, r0)
            defpackage.hv.L(r7, r4, r4, r8, r6)
            return
        L3e:
            w61 r8 = r7.F0()
            e0 r0 = new e0
            r5 = 0
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            ap6 r7 = defpackage.hv.L(r8, r4, r4, r0, r6)
            r3.E0 = r7
        L4f:
            return
    }

    public final void a1(defpackage.vy4 r8) {
            r7 = this;
            r94 r1 = r7.m0
            if (r1 == 0) goto L4f
            l25 r2 = new l25
            long r3 = r8.c
            r2.<init>(r3)
            zg5 r0 = new zg5
            r0.<init>()
            y r3 = new y
            r4 = 15
            r3.<init>(r4, r8, r0)
            y00 r8 = new y00
            r6 = 3
            r8.<init>(r6, r3)
            q61 r3 = defpackage.vr2.l0
            defpackage.ii2.V(r7, r3, r8)
            boolean r8 = r0.A
            r4 = 0
            if (r8 != 0) goto L3e
            boolean r8 = defpackage.pr0.a(r7)
            if (r8 == 0) goto L2e
            goto L3e
        L2e:
            r7.x0 = r2
            w61 r7 = r7.F0()
            d0 r8 = new d0
            r0 = 2
            r8.<init>(r1, r2, r4, r0)
            defpackage.hv.L(r7, r4, r4, r8, r6)
            return
        L3e:
            w61 r8 = r7.F0()
            e0 r0 = new e0
            r5 = 1
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            ap6 r7 = defpackage.hv.L(r8, r4, r4, r0, r6)
            r3.E0 = r7
        L4f:
            return
    }

    public final void b1() {
            r3 = this;
            xg1 r0 = r3.w0
            if (r0 == 0) goto L5
            goto L30
        L5:
            boolean r0 = r3.o0
            if (r0 == 0) goto Lc
            n43 r0 = r3.u0
            goto Le
        Lc:
            n43 r0 = r3.n0
        Le:
            if (r0 == 0) goto L30
            r94 r1 = r3.m0
            if (r1 != 0) goto L1b
            r94 r1 = new r94
            r1.<init>()
            r3.m0 = r1
        L1b:
            di2 r1 = r3.t0
            r94 r2 = r3.m0
            r1.V0(r2)
            r94 r1 = r3.m0
            r1.getClass()
            xg1 r0 = r0.a(r1)
            r3.R0(r0)
            r3.w0 = r0
        L30:
            return
    }

    public void c1() {
            r0 = this;
            return
    }

    public abstract boolean d1(android.view.KeyEvent r1);

    public abstract void e1(android.view.KeyEvent r1);

    public final void f1(defpackage.r94 r4, defpackage.n43 r5, boolean r6, boolean r7, java.lang.String r8, defpackage.mq5 r9, defpackage.on2 r10) {
            r3 = this;
            r94 r0 = r3.C0
            boolean r0 = defpackage.nb3.k(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.V0()
            r3.C0 = r4
            r3.m0 = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            n43 r0 = r3.n0
            boolean r0 = defpackage.nb3.k(r0, r5)
            if (r0 != 0) goto L1f
            r3.n0 = r5
            r4 = r1
        L1f:
            boolean r5 = r3.o0
            if (r5 == r6) goto L2b
            r3.o0 = r6
            if (r6 == 0) goto L2a
            r3.l0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.r0
            di2 r6 = r3.t0
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.R0(r6)
            goto L3d
        L37:
            r3.S0(r6)
            r3.V0()
        L3d:
            defpackage.bl2.G(r3)
            r3.r0 = r7
        L42:
            java.lang.String r5 = r3.p0
            boolean r5 = defpackage.nb3.k(r5, r8)
            if (r5 != 0) goto L4f
            r3.p0 = r8
            defpackage.bl2.G(r3)
        L4f:
            mq5 r5 = r3.q0
            boolean r5 = defpackage.nb3.k(r5, r9)
            if (r5 != 0) goto L5c
            r3.q0 = r9
            defpackage.bl2.G(r3)
        L5c:
            r3.s0 = r10
            boolean r5 = r3.D0
            r94 r7 = r3.C0
            if (r7 != 0) goto L66
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r2 = r1
        L6c:
            r3.D0 = r2
            if (r2 != 0) goto L75
            xg1 r5 = r3.w0
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            xg1 r4 = r3.w0
            if (r4 != 0) goto L80
            boolean r5 = r3.D0
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.S0(r4)
        L85:
            r4 = 0
            r3.w0 = r4
            r3.b1()
        L8b:
            r94 r3 = r3.m0
            r6.V0(r3)
            return
    }

    @Override // defpackage.bh3
    public final boolean k(android.view.KeyEvent r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.gi4
    public final void l0() {
            r2 = this;
            boolean r0 = r2.o0
            if (r0 == 0) goto Ld
            x r0 = new x
            r1 = 0
            r0.<init>(r2, r1)
            defpackage.jx2.B(r2, r0)
        Ld:
            return
    }

    @Override // defpackage.ub7
    public final java.lang.Object n() {
            r0 = this;
            cs1 r0 = r0.F0
            return r0
    }

    public void w(defpackage.oy4 r7, defpackage.py4 r8, long r9) {
            r6 = this;
            r0 = 33
            long r1 = r9 >> r0
            r3 = 32
            long r1 = r1 << r3
            long r9 = r9 << r3
            long r9 = r9 >> r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r4
            long r9 = r9 | r1
            long r0 = r9 >> r3
            int r0 = (int) r0
            float r0 = (float) r0
            long r9 = r9 & r4
            int r9 = (int) r9
            float r9 = (float) r9
            int r10 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            long r0 = r0 << r3
            long r9 = r9 & r4
            long r9 = r9 | r0
            r6.A0 = r9
            r6.b1()
            boolean r9 = r6.r0
            if (r9 == 0) goto L64
            vr2 r9 = r6.v0
            if (r9 != 0) goto L3b
            vr2 r9 = new vr2
            r9.<init>(r6)
            r6.R0(r9)
            r6.v0 = r9
        L3b:
            py4 r9 = defpackage.py4.Main
            if (r8 != r9) goto L64
            int r7 = r7.f
            r8 = 4
            r9 = 3
            r10 = 0
            if (r7 != r8) goto L54
            w61 r7 = r6.F0()
            g0 r8 = new g0
            r0 = 0
            r8.<init>(r6, r10, r0)
            defpackage.hv.L(r7, r10, r10, r8, r9)
            goto L64
        L54:
            r8 = 5
            if (r7 != r8) goto L64
            w61 r7 = r6.F0()
            g0 r8 = new g0
            r0 = 1
            r8.<init>(r6, r10, r0)
            defpackage.hv.L(r7, r10, r10, r8, r9)
        L64:
            return
    }
}
