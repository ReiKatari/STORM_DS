package androidx.recyclerview.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class LinearLayoutManager extends defpackage.gg5 implements defpackage.rg5 {
    public final defpackage.ev3 A;
    public final defpackage.fv3 B;
    public final int C;
    public final int[] D;
    public int p;
    public defpackage.gv3 q;
    public defpackage.ts1 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public defpackage.hv3 z;

    public LinearLayoutManager() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public LinearLayoutManager(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.p = r0
            r1 = 0
            r2.t = r1
            r2.u = r1
            r2.v = r1
            r2.w = r0
            r0 = -1
            r2.x = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.y = r0
            r0 = 0
            r2.z = r0
            ev3 r1 = new ev3
            r1.<init>()
            r2.A = r1
            fv3 r1 = new fv3
            r1.<init>()
            r2.B = r1
            r1 = 2
            r2.C = r1
            int[] r1 = new int[r1]
            r2.D = r1
            r2.c1(r3)
            r2.c(r0)
            boolean r3 = r2.t
            if (r4 != r3) goto L39
            return
        L39:
            r2.t = r4
            r2.o0()
            return
    }

    public LinearLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.p = r0
            r1 = 0
            r2.t = r1
            r2.u = r1
            r2.v = r1
            r2.w = r0
            r0 = -1
            r2.x = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.y = r0
            r0 = 0
            r2.z = r0
            ev3 r1 = new ev3
            r1.<init>()
            r2.A = r1
            fv3 r1 = new fv3
            r1.<init>()
            r2.B = r1
            r1 = 2
            r2.C = r1
            int[] r1 = new int[r1]
            r2.D = r1
            fg5 r3 = defpackage.gg5.H(r3, r4, r5, r6)
            int r4 = r3.a
            r2.c1(r4)
            boolean r4 = r3.c
            r2.c(r0)
            boolean r5 = r2.t
            if (r4 != r5) goto L41
            goto L46
        L41:
            r2.t = r4
            r2.o0()
        L46:
            boolean r3 = r3.d
            r2.d1(r3)
            return
    }

    @Override // defpackage.gg5
    public void A0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            iv3 r0 = new iv3
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r0.a = r3
            r1.B0(r0)
            return
    }

    @Override // defpackage.gg5
    public boolean C0() {
            r1 = this;
            hv3 r0 = r1.z
            if (r0 != 0) goto Lc
            boolean r0 = r1.s
            boolean r1 = r1.v
            if (r0 != r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public void D0(defpackage.sg5 r3, int[] r4) {
            r2 = this;
            int r3 = r3.a
            r0 = 0
            r1 = -1
            if (r3 == r1) goto Ld
            ts1 r3 = r2.r
            int r3 = r3.n()
            goto Le
        Ld:
            r3 = r0
        Le:
            gv3 r2 = r2.q
            int r2 = r2.f
            if (r2 != r1) goto L16
            r2 = r0
            goto L18
        L16:
            r2 = r3
            r3 = r0
        L18:
            r4[r0] = r3
            r3 = 1
            r4[r3] = r2
            return
    }

    public void E0(defpackage.sg5 r1, defpackage.gv3 r2, defpackage.ls0 r3) {
            r0 = this;
            int r0 = r2.d
            if (r0 < 0) goto L14
            int r1 = r1.b()
            if (r0 >= r1) goto L14
            r1 = 0
            int r2 = r2.g
            int r1 = java.lang.Math.max(r1, r2)
            r3.a(r0, r1)
        L14:
            return
    }

    public final int F0(defpackage.sg5 r7) {
            r6 = this;
            int r0 = r6.v()
            if (r0 != 0) goto L8
            r6 = 0
            return r6
        L8:
            r6.J0()
            ts1 r1 = r6.r
            boolean r0 = r6.w
            r0 = r0 ^ 1
            android.view.View r2 = r6.M0(r0)
            android.view.View r3 = r6.L0(r0)
            boolean r5 = r6.w
            r4 = r6
            r0 = r7
            int r6 = defpackage.gi2.w(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final int G0(defpackage.sg5 r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r7.J0()
            ts1 r1 = r7.r
            boolean r0 = r7.w
            r0 = r0 ^ 1
            android.view.View r2 = r7.M0(r0)
            android.view.View r3 = r7.L0(r0)
            boolean r5 = r7.w
            boolean r6 = r7.u
            r4 = r7
            r0 = r8
            int r7 = defpackage.gi2.x(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public final int H0(defpackage.sg5 r7) {
            r6 = this;
            int r0 = r6.v()
            if (r0 != 0) goto L8
            r6 = 0
            return r6
        L8:
            r6.J0()
            ts1 r1 = r6.r
            boolean r0 = r6.w
            r0 = r0 ^ 1
            android.view.View r2 = r6.M0(r0)
            android.view.View r3 = r6.L0(r0)
            boolean r5 = r6.w
            r4 = r6
            r0 = r7
            int r6 = defpackage.gi2.y(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final int I0(int r5) {
            r4 = this;
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L3f
            r2 = 2
            if (r5 == r2) goto L32
            r2 = 17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L2c
            r2 = 33
            if (r5 == r2) goto L26
            r0 = 66
            if (r5 == r0) goto L20
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L1a
            return r3
        L1a:
            int r4 = r4.p
            if (r4 != r1) goto L1f
            return r1
        L1f:
            return r3
        L20:
            int r4 = r4.p
            if (r4 != 0) goto L25
            return r1
        L25:
            return r3
        L26:
            int r4 = r4.p
            if (r4 != r1) goto L2b
            return r0
        L2b:
            return r3
        L2c:
            int r4 = r4.p
            if (r4 != 0) goto L31
            return r0
        L31:
            return r3
        L32:
            int r5 = r4.p
            if (r5 != r1) goto L37
            return r1
        L37:
            boolean r4 = r4.V0()
            if (r4 == 0) goto L3e
            return r0
        L3e:
            return r1
        L3f:
            int r5 = r4.p
            if (r5 != r1) goto L44
            return r0
        L44:
            boolean r4 = r4.V0()
            if (r4 == 0) goto L4b
            return r1
        L4b:
            return r0
    }

    public final void J0() {
            r2 = this;
            gv3 r0 = r2.q
            if (r0 != 0) goto L16
            gv3 r0 = new gv3
            r0.<init>()
            r1 = 1
            r0.a = r1
            r1 = 0
            r0.h = r1
            r0.i = r1
            r1 = 0
            r0.k = r1
            r2.q = r0
        L16:
            return
    }

    @Override // defpackage.gg5
    public final boolean K() {
            r0 = this;
            r0 = 1
            return r0
    }

    public final int K0(defpackage.mg5 r8, defpackage.gv3 r9, defpackage.sg5 r10, boolean r11) {
            r7 = this;
            int r0 = r9.c
            int r1 = r9.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L10
            if (r0 >= 0) goto Ld
            int r1 = r1 + r0
            r9.g = r1
        Ld:
            r7.Y0(r8, r9)
        L10:
            int r1 = r9.c
            int r3 = r9.h
            int r1 = r1 + r3
        L15:
            boolean r3 = r9.l
            if (r3 != 0) goto L1b
            if (r1 <= 0) goto L6b
        L1b:
            int r3 = r9.d
            if (r3 < 0) goto L6b
            int r4 = r10.b()
            if (r3 >= r4) goto L6b
            fv3 r3 = r7.B
            r4 = 0
            r3.a = r4
            r3.b = r4
            r3.c = r4
            r3.d = r4
            r7.W0(r8, r10, r9, r3)
            boolean r4 = r3.b
            if (r4 == 0) goto L38
            goto L6b
        L38:
            int r4 = r9.b
            int r5 = r3.a
            int r6 = r9.f
            int r6 = r6 * r5
            int r6 = r6 + r4
            r9.b = r6
            boolean r4 = r3.c
            if (r4 == 0) goto L4e
            java.util.List r4 = r9.k
            if (r4 != 0) goto L4e
            boolean r4 = r10.g
            if (r4 != 0) goto L54
        L4e:
            int r4 = r9.c
            int r4 = r4 - r5
            r9.c = r4
            int r1 = r1 - r5
        L54:
            int r4 = r9.g
            if (r4 == r2) goto L65
            int r4 = r4 + r5
            r9.g = r4
            int r5 = r9.c
            if (r5 >= 0) goto L62
            int r4 = r4 + r5
            r9.g = r4
        L62:
            r7.Y0(r8, r9)
        L65:
            if (r11 == 0) goto L15
            boolean r3 = r3.d
            if (r3 == 0) goto L15
        L6b:
            int r7 = r9.c
            int r0 = r0 - r7
            return r0
    }

    @Override // defpackage.gg5
    public final boolean L() {
            r0 = this;
            boolean r0 = r0.t
            return r0
    }

    public final android.view.View L0(boolean r3) {
            r2 = this;
            boolean r0 = r2.u
            if (r0 == 0) goto Le
            r0 = 0
            int r1 = r2.v()
            android.view.View r2 = r2.P0(r0, r3, r1)
            return r2
        Le:
            int r0 = r2.v()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r2 = r2.P0(r0, r3, r1)
            return r2
    }

    public final android.view.View M0(boolean r3) {
            r2 = this;
            boolean r0 = r2.u
            if (r0 == 0) goto L10
            int r0 = r2.v()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r2 = r2.P0(r0, r3, r1)
            return r2
        L10:
            r0 = 0
            int r1 = r2.v()
            android.view.View r2 = r2.P0(r0, r3, r1)
            return r2
    }

    public final int N0() {
            r3 = this;
            int r0 = r3.v()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = -1
            android.view.View r3 = r3.P0(r0, r1, r2)
            if (r3 != 0) goto Lf
            return r2
        Lf:
            int r3 = defpackage.gg5.G(r3)
            return r3
    }

    public final android.view.View O0(int r4, int r5) {
            r3 = this;
            r3.J0()
            if (r5 <= r4) goto L6
            goto L8
        L6:
            if (r5 >= r4) goto L35
        L8:
            ts1 r0 = r3.r
            android.view.View r1 = r3.u(r4)
            int r0 = r0.g(r1)
            ts1 r1 = r3.r
            int r1 = r1.m()
            if (r0 >= r1) goto L1f
            r0 = 16644(0x4104, float:2.3323E-41)
            r1 = 16388(0x4004, float:2.2964E-41)
            goto L23
        L1f:
            r0 = 4161(0x1041, float:5.831E-42)
            r1 = 4097(0x1001, float:5.741E-42)
        L23:
            int r2 = r3.p
            if (r2 != 0) goto L2e
            rr6 r3 = r3.c
            android.view.View r3 = r3.h(r4, r5, r0, r1)
            return r3
        L2e:
            rr6 r3 = r3.d
            android.view.View r3 = r3.h(r4, r5, r0, r1)
            return r3
        L35:
            android.view.View r3 = r3.u(r4)
            return r3
    }

    public final android.view.View P0(int r3, boolean r4, int r5) {
            r2 = this;
            r2.J0()
            r0 = 320(0x140, float:4.48E-43)
            if (r4 == 0) goto La
            r4 = 24579(0x6003, float:3.4443E-41)
            goto Lb
        La:
            r4 = r0
        Lb:
            int r1 = r2.p
            if (r1 != 0) goto L16
            rr6 r2 = r2.c
            android.view.View r2 = r2.h(r3, r5, r4, r0)
            return r2
        L16:
            rr6 r2 = r2.d
            android.view.View r2 = r2.h(r3, r5, r4, r0)
            return r2
    }

    public android.view.View Q0(defpackage.mg5 r17, defpackage.sg5 r18, boolean r19, boolean r20) {
            r16 = this;
            r0 = r16
            r0.J0()
            int r1 = r0.v()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.v()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            ts1 r7 = r0.r
            int r7 = r7.m()
            ts1 r8 = r0.r
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.u(r1)
            int r13 = defpackage.gg5.G(r12)
            ts1 r14 = r0.r
            int r14 = r14.g(r12)
            ts1 r15 = r0.r
            int r15 = r15.d(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            hg5 r13 = (defpackage.hg5) r13
            wg5 r13 = r13.a
            boolean r13 = r13.h()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
    }

    public final int R0(int r2, defpackage.mg5 r3, defpackage.sg5 r4, boolean r5) {
            r1 = this;
            ts1 r0 = r1.r
            int r0 = r0.i()
            int r0 = r0 - r2
            if (r0 <= 0) goto L23
            int r0 = -r0
            int r3 = r1.b1(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            ts1 r4 = r1.r
            int r4 = r4.i()
            int r4 = r4 - r2
            if (r4 <= 0) goto L22
            ts1 r1 = r1.r
            r1.q(r4)
            int r4 = r4 + r3
            return r4
        L22:
            return r3
        L23:
            r1 = 0
            return r1
    }

    @Override // defpackage.gg5
    public final void S(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            return
    }

    public final int S0(int r2, defpackage.mg5 r3, defpackage.sg5 r4, boolean r5) {
            r1 = this;
            ts1 r0 = r1.r
            int r0 = r0.m()
            int r0 = r2 - r0
            if (r0 <= 0) goto L23
            int r3 = r1.b1(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            ts1 r4 = r1.r
            int r4 = r4.m()
            int r2 = r2 - r4
            if (r2 <= 0) goto L22
            ts1 r1 = r1.r
            int r4 = -r2
            r1.q(r4)
            int r3 = r3 - r2
        L22:
            return r3
        L23:
            r1 = 0
            return r1
    }

    @Override // defpackage.gg5
    public android.view.View T(android.view.View r3, int r4, defpackage.mg5 r5, defpackage.sg5 r6) {
            r2 = this;
            r2.a1()
            int r3 = r2.v()
            if (r3 != 0) goto La
            goto L71
        La:
            int r3 = r2.I0(r4)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r4) goto L13
            goto L71
        L13:
            r2.J0()
            ts1 r0 = r2.r
            int r0 = r0.n()
            float r0 = (float) r0
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 0
            r2.e1(r3, r0, r1, r6)
            gv3 r0 = r2.q
            r0.g = r4
            r0.a = r1
            r4 = 1
            r2.K0(r5, r0, r6, r4)
            boolean r5 = r2.u
            r6 = -1
            if (r3 != r6) goto L4a
            if (r5 == 0) goto L41
            int r5 = r2.v()
            int r5 = r5 - r4
            android.view.View r4 = r2.O0(r5, r6)
            goto L5e
        L41:
            int r4 = r2.v()
            android.view.View r4 = r2.O0(r1, r4)
            goto L5e
        L4a:
            if (r5 == 0) goto L55
            int r4 = r2.v()
            android.view.View r4 = r2.O0(r1, r4)
            goto L5e
        L55:
            int r5 = r2.v()
            int r5 = r5 - r4
            android.view.View r4 = r2.O0(r5, r6)
        L5e:
            if (r3 != r6) goto L65
            android.view.View r2 = r2.U0()
            goto L69
        L65:
            android.view.View r2 = r2.T0()
        L69:
            boolean r3 = r2.hasFocusable()
            if (r3 == 0) goto L73
            if (r4 != 0) goto L72
        L71:
            r2 = 0
        L72:
            return r2
        L73:
            return r4
    }

    public final android.view.View T0() {
            r1 = this;
            boolean r0 = r1.u
            if (r0 == 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r0 = r1.v()
            int r0 = r0 + (-1)
        Lc:
            android.view.View r1 = r1.u(r0)
            return r1
    }

    @Override // defpackage.gg5
    public final void U(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.U(r3)
            int r0 = r2.v()
            if (r0 <= 0) goto L24
            r0 = 0
            int r1 = r2.v()
            android.view.View r0 = r2.P0(r0, r0, r1)
            if (r0 != 0) goto L16
            r0 = -1
            goto L1a
        L16:
            int r0 = defpackage.gg5.G(r0)
        L1a:
            r3.setFromIndex(r0)
            int r2 = r2.N0()
            r3.setToIndex(r2)
        L24:
            return
    }

    public final android.view.View U0() {
            r1 = this;
            boolean r0 = r1.u
            if (r0 == 0) goto Lb
            int r0 = r1.v()
            int r0 = r0 + (-1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r1 = r1.u(r0)
            return r1
    }

    @Override // defpackage.gg5
    public void V(defpackage.mg5 r1, defpackage.sg5 r2, defpackage.v2 r3) {
            r0 = this;
            super.V(r1, r2, r3)
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            wf5 r0 = r0.l0
            if (r0 == 0) goto L14
            int r0 = r0.a()
            if (r0 <= 0) goto L14
            p2 r0 = defpackage.p2.m
            r3.b(r0)
        L14:
            return
    }

    public final boolean V0() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r1.b
            int r1 = r1.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }

    public void W0(defpackage.mg5 r11, defpackage.sg5 r12, defpackage.gv3 r13, defpackage.fv3 r14) {
            r10 = this;
            android.view.View r11 = r13.b(r11)
            r12 = 1
            if (r11 != 0) goto La
            r14.b = r12
            return
        La:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            hg5 r0 = (defpackage.hg5) r0
            java.util.List r1 = r13.k
            boolean r2 = r10.u
            int r3 = r13.f
            r4 = -1
            r5 = 0
            if (r1 != 0) goto L29
            if (r3 != r4) goto L1e
            r1 = r12
            goto L1f
        L1e:
            r1 = r5
        L1f:
            if (r2 != r1) goto L25
            r10.b(r11, r4, r5)
            goto L37
        L25:
            r10.b(r11, r5, r5)
            goto L37
        L29:
            if (r3 != r4) goto L2d
            r1 = r12
            goto L2e
        L2d:
            r1 = r5
        L2e:
            if (r2 != r1) goto L34
            r10.b(r11, r4, r12)
            goto L37
        L34:
            r10.b(r11, r5, r12)
        L37:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            hg5 r1 = (defpackage.hg5) r1
            androidx.recyclerview.widget.RecyclerView r2 = r10.b
            android.graphics.Rect r2 = r2.O(r11)
            int r3 = r2.left
            int r5 = r2.right
            int r3 = r3 + r5
            int r5 = r2.top
            int r2 = r2.bottom
            int r5 = r5 + r2
            int r2 = r10.n
            int r6 = r10.l
            int r7 = r10.D()
            int r8 = r10.E()
            int r8 = r8 + r7
            int r7 = r1.leftMargin
            int r8 = r8 + r7
            int r7 = r1.rightMargin
            int r8 = r8 + r7
            int r8 = r8 + r3
            int r3 = r1.width
            boolean r7 = r10.d()
            int r2 = defpackage.gg5.w(r7, r2, r6, r8, r3)
            int r3 = r10.o
            int r6 = r10.m
            int r7 = r10.F()
            int r8 = r10.C()
            int r8 = r8 + r7
            int r7 = r1.topMargin
            int r8 = r8 + r7
            int r7 = r1.bottomMargin
            int r8 = r8 + r7
            int r8 = r8 + r5
            int r5 = r1.height
            boolean r7 = r10.e()
            int r3 = defpackage.gg5.w(r7, r3, r6, r8, r5)
            boolean r1 = r10.x0(r11, r2, r3, r1)
            if (r1 == 0) goto L92
            r11.measure(r2, r3)
        L92:
            ts1 r1 = r10.r
            int r1 = r1.e(r11)
            r14.a = r1
            int r1 = r10.p
            if (r1 != r12) goto Ld1
            boolean r1 = r10.V0()
            if (r1 == 0) goto Lb4
            int r1 = r10.n
            int r2 = r10.E()
            int r1 = r1 - r2
            ts1 r10 = r10.r
            int r10 = r10.f(r11)
            int r10 = r1 - r10
            goto Lc2
        Lb4:
            int r1 = r10.D()
            ts1 r10 = r10.r
            int r10 = r10.f(r11)
            int r10 = r10 + r1
            r9 = r1
            r1 = r10
            r10 = r9
        Lc2:
            int r2 = r13.f
            int r13 = r13.b
            int r3 = r14.a
            if (r2 != r4) goto Lcf
            int r2 = r13 - r3
            r3 = r13
            r13 = r2
            goto Lf2
        Lcf:
            int r3 = r3 + r13
            goto Lf2
        Ld1:
            int r1 = r10.F()
            ts1 r10 = r10.r
            int r10 = r10.f(r11)
            int r10 = r10 + r1
            int r2 = r13.f
            int r13 = r13.b
            int r3 = r14.a
            if (r2 != r4) goto Lec
            int r2 = r13 - r3
            r3 = r1
            r1 = r13
            r13 = r3
            r3 = r10
            r10 = r2
            goto Lf2
        Lec:
            int r2 = r13 + r3
            r3 = r10
            r10 = r13
            r13 = r1
            r1 = r2
        Lf2:
            defpackage.gg5.N(r11, r10, r13, r1, r3)
            wg5 r10 = r0.a
            boolean r10 = r10.h()
            if (r10 != 0) goto L105
            wg5 r10 = r0.a
            boolean r10 = r10.k()
            if (r10 == 0) goto L107
        L105:
            r14.c = r12
        L107:
            boolean r10 = r11.hasFocusable()
            r14.d = r10
            return
    }

    public void X0(defpackage.mg5 r1, defpackage.sg5 r2, defpackage.ev3 r3, int r4) {
            r0 = this;
            return
    }

    public final void Y0(defpackage.mg5 r6, defpackage.gv3 r7) {
            r5 = this;
            boolean r0 = r7.a
            if (r0 == 0) goto Lb3
            boolean r0 = r7.l
            if (r0 == 0) goto La
            goto Lb3
        La:
            int r0 = r7.g
            int r1 = r7.i
            int r7 = r7.f
            r2 = 0
            r3 = -1
            if (r7 != r3) goto L68
            int r7 = r5.v()
            if (r0 >= 0) goto L1c
            goto Lb3
        L1c:
            ts1 r3 = r5.r
            int r3 = r3.h()
            int r3 = r3 - r0
            int r3 = r3 + r1
            boolean r0 = r5.u
            if (r0 == 0) goto L47
            r0 = r2
        L29:
            if (r0 >= r7) goto Lb3
            android.view.View r1 = r5.u(r0)
            ts1 r4 = r5.r
            int r4 = r4.g(r1)
            if (r4 < r3) goto L43
            ts1 r4 = r5.r
            int r1 = r4.p(r1)
            if (r1 >= r3) goto L40
            goto L43
        L40:
            int r0 = r0 + 1
            goto L29
        L43:
            r5.Z0(r6, r2, r0)
            return
        L47:
            int r7 = r7 + (-1)
            r0 = r7
        L4a:
            if (r0 < 0) goto Lb3
            android.view.View r1 = r5.u(r0)
            ts1 r2 = r5.r
            int r2 = r2.g(r1)
            if (r2 < r3) goto L64
            ts1 r2 = r5.r
            int r1 = r2.p(r1)
            if (r1 >= r3) goto L61
            goto L64
        L61:
            int r0 = r0 + (-1)
            goto L4a
        L64:
            r5.Z0(r6, r7, r0)
            return
        L68:
            if (r0 >= 0) goto L6b
            goto Lb3
        L6b:
            int r0 = r0 - r1
            int r7 = r5.v()
            boolean r1 = r5.u
            if (r1 == 0) goto L95
            int r7 = r7 + (-1)
            r1 = r7
        L77:
            if (r1 < 0) goto Lb3
            android.view.View r2 = r5.u(r1)
            ts1 r3 = r5.r
            int r3 = r3.d(r2)
            if (r3 > r0) goto L91
            ts1 r3 = r5.r
            int r2 = r3.o(r2)
            if (r2 <= r0) goto L8e
            goto L91
        L8e:
            int r1 = r1 + (-1)
            goto L77
        L91:
            r5.Z0(r6, r7, r1)
            return
        L95:
            r1 = r2
        L96:
            if (r1 >= r7) goto Lb3
            android.view.View r3 = r5.u(r1)
            ts1 r4 = r5.r
            int r4 = r4.d(r3)
            if (r4 > r0) goto Lb0
            ts1 r4 = r5.r
            int r3 = r4.o(r3)
            if (r3 <= r0) goto Lad
            goto Lb0
        Lad:
            int r1 = r1 + 1
            goto L96
        Lb0:
            r5.Z0(r6, r2, r1)
        Lb3:
            return
    }

    public final void Z0(defpackage.mg5 r2, int r3, int r4) {
            r1 = this;
            if (r3 != r4) goto L3
            goto L25
        L3:
            if (r4 <= r3) goto L16
            int r4 = r4 + (-1)
        L7:
            if (r4 < r3) goto L25
            android.view.View r0 = r1.u(r4)
            r1.m0(r4)
            r2.l(r0)
            int r4 = r4 + (-1)
            goto L7
        L16:
            if (r3 <= r4) goto L25
            android.view.View r0 = r1.u(r3)
            r1.m0(r3)
            r2.l(r0)
            int r3 = r3 + (-1)
            goto L16
        L25:
            return
    }

    @Override // defpackage.rg5
    public final android.graphics.PointF a(int r4) {
            r3 = this;
            int r0 = r3.v()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r0 = 0
            android.view.View r1 = r3.u(r0)
            int r1 = defpackage.gg5.G(r1)
            r2 = 1
            if (r4 >= r1) goto L15
            r0 = r2
        L15:
            boolean r4 = r3.u
            if (r0 == r4) goto L1a
            r2 = -1
        L1a:
            int r3 = r3.p
            r4 = 0
            if (r3 != 0) goto L26
            android.graphics.PointF r3 = new android.graphics.PointF
            float r0 = (float) r2
            r3.<init>(r0, r4)
            return r3
        L26:
            android.graphics.PointF r3 = new android.graphics.PointF
            float r0 = (float) r2
            r3.<init>(r4, r0)
            return r3
    }

    public final void a1() {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.V0()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.t
            r0 = r0 ^ r1
            r2.u = r0
            return
        L12:
            boolean r0 = r2.t
            r2.u = r0
            return
    }

    public final int b1(int r6, defpackage.mg5 r7, defpackage.sg5 r8) {
            r5 = this;
            int r0 = r5.v()
            r1 = 0
            if (r0 == 0) goto L39
            if (r6 != 0) goto La
            goto L39
        La:
            r5.J0()
            gv3 r0 = r5.q
            r2 = 1
            r0.a = r2
            if (r6 <= 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = -1
        L17:
            int r3 = java.lang.Math.abs(r6)
            r5.e1(r0, r3, r2, r8)
            gv3 r2 = r5.q
            int r4 = r2.g
            int r7 = r5.K0(r7, r2, r8, r1)
            int r7 = r7 + r4
            if (r7 >= 0) goto L2a
            goto L39
        L2a:
            if (r3 <= r7) goto L2e
            int r6 = r0 * r7
        L2e:
            ts1 r7 = r5.r
            int r8 = -r6
            r7.q(r8)
            gv3 r5 = r5.q
            r5.j = r6
            return r6
        L39:
            return r1
    }

    @Override // defpackage.gg5
    public final void c(java.lang.String r2) {
            r1 = this;
            hv3 r0 = r1.z
            if (r0 != 0) goto L7
            super.c(r2)
        L7:
            return
    }

    public final void c1(int r3) {
            r2 = this;
            if (r3 == 0) goto L10
            r0 = 1
            if (r3 != r0) goto L6
            goto L10
        L6:
            java.lang.String r2 = "invalid orientation:"
            java.lang.String r2 = defpackage.lb1.g(r3, r2)
            defpackage.i.h(r2)
            return
        L10:
            r0 = 0
            r2.c(r0)
            int r0 = r2.p
            if (r3 != r0) goto L1e
            ts1 r0 = r2.r
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            ts1 r0 = defpackage.ts1.b(r2, r3)
            r2.r = r0
            ev3 r1 = r2.A
            r1.a = r0
            r2.p = r3
            r2.o0()
            return
    }

    @Override // defpackage.gg5
    public final boolean d() {
            r0 = this;
            int r0 = r0.p
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.gg5
    public void d0(defpackage.mg5 r18, defpackage.sg5 r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            hv3 r3 = r0.z
            r4 = -1
            if (r3 != 0) goto Lf
            int r3 = r0.x
            if (r3 == r4) goto L19
        Lf:
            int r3 = r2.b()
            if (r3 != 0) goto L19
            r17.j0(r18)
            return
        L19:
            hv3 r3 = r0.z
            if (r3 == 0) goto L23
            int r3 = r3.A
            if (r3 < 0) goto L23
            r0.x = r3
        L23:
            r0.J0()
            gv3 r3 = r0.q
            r5 = 0
            r3.a = r5
            r0.a1()
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 != 0) goto L33
            goto L45
        L33:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L45
            dk0 r7 = r0.a
            java.lang.Object r7 = r7.B
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L46
        L45:
            r3 = 0
        L46:
            ev3 r7 = r0.A
            boolean r8 = r7.e
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 1
            if (r8 == 0) goto L7f
            int r8 = r0.x
            if (r8 != r4) goto L7f
            hv3 r8 = r0.z
            if (r8 == 0) goto L58
            goto L7f
        L58:
            if (r3 == 0) goto L258
            ts1 r8 = r0.r
            int r8 = r8.g(r3)
            ts1 r11 = r0.r
            int r11 = r11.i()
            if (r8 >= r11) goto L76
            ts1 r8 = r0.r
            int r8 = r8.d(r3)
            ts1 r11 = r0.r
            int r11 = r11.m()
            if (r8 > r11) goto L258
        L76:
            int r8 = defpackage.gg5.G(r3)
            r7.b(r3, r8)
            goto L258
        L7f:
            r7.c()
            boolean r3 = r0.u
            boolean r8 = r0.v
            r3 = r3 ^ r8
            r7.d = r3
            boolean r3 = r2.g
            if (r3 != 0) goto L184
            int r3 = r0.x
            if (r3 != r4) goto L93
            goto L184
        L93:
            if (r3 < 0) goto L180
            int r8 = r2.b()
            if (r3 < r8) goto L9d
            goto L180
        L9d:
            int r3 = r0.x
            r7.b = r3
            hv3 r8 = r0.z
            if (r8 == 0) goto Lcb
            int r11 = r8.A
            if (r11 < 0) goto Lcb
            boolean r3 = r8.L
            r7.d = r3
            ts1 r8 = r0.r
            if (r3 == 0) goto Lbe
            int r3 = r8.i()
            hv3 r8 = r0.z
            int r8 = r8.B
            int r3 = r3 - r8
            r7.c = r3
            goto L256
        Lbe:
            int r3 = r8.m()
            hv3 r8 = r0.z
            int r8 = r8.B
            int r3 = r3 + r8
            r7.c = r3
            goto L256
        Lcb:
            int r8 = r0.y
            if (r8 != r9) goto L162
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L13f
            ts1 r8 = r0.r
            int r8 = r8.e(r3)
            ts1 r11 = r0.r
            int r11 = r11.n()
            if (r8 <= r11) goto Le8
            r7.a()
            goto L256
        Le8:
            ts1 r8 = r0.r
            int r8 = r8.g(r3)
            ts1 r11 = r0.r
            int r11 = r11.m()
            int r8 = r8 - r11
            ts1 r11 = r0.r
            if (r8 >= 0) goto L103
            int r3 = r11.m()
            r7.c = r3
            r7.d = r5
            goto L256
        L103:
            int r8 = r11.i()
            ts1 r11 = r0.r
            int r11 = r11.d(r3)
            int r8 = r8 - r11
            if (r8 >= 0) goto L11c
            ts1 r3 = r0.r
            int r3 = r3.i()
            r7.c = r3
            r7.d = r10
            goto L256
        L11c:
            boolean r8 = r7.d
            ts1 r11 = r0.r
            if (r8 == 0) goto L137
            int r3 = r11.d(r3)
            ts1 r8 = r0.r
            int r11 = r8.a
            if (r9 != r11) goto L12e
            r11 = r5
            goto L135
        L12e:
            int r11 = r8.n()
            int r8 = r8.a
            int r11 = r11 - r8
        L135:
            int r11 = r11 + r3
            goto L13b
        L137:
            int r11 = r11.g(r3)
        L13b:
            r7.c = r11
            goto L256
        L13f:
            int r3 = r0.v()
            if (r3 <= 0) goto L15d
            android.view.View r3 = r0.u(r5)
            int r3 = defpackage.gg5.G(r3)
            int r8 = r0.x
            if (r8 >= r3) goto L153
            r3 = r10
            goto L154
        L153:
            r3 = r5
        L154:
            boolean r8 = r0.u
            if (r3 != r8) goto L15a
            r3 = r10
            goto L15b
        L15a:
            r3 = r5
        L15b:
            r7.d = r3
        L15d:
            r7.a()
            goto L256
        L162:
            boolean r3 = r0.u
            r7.d = r3
            ts1 r8 = r0.r
            if (r3 == 0) goto L175
            int r3 = r8.i()
            int r8 = r0.y
            int r3 = r3 - r8
            r7.c = r3
            goto L256
        L175:
            int r3 = r8.m()
            int r8 = r0.y
            int r3 = r3 + r8
            r7.c = r3
            goto L256
        L180:
            r0.x = r4
            r0.y = r9
        L184:
            int r3 = r0.v()
            if (r3 != 0) goto L18c
            goto L246
        L18c:
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 != 0) goto L191
            goto L1a3
        L191:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L1a3
            dk0 r8 = r0.a
            java.lang.Object r8 = r8.B
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r8 = r8.contains(r3)
            if (r8 == 0) goto L1a4
        L1a3:
            r3 = 0
        L1a4:
            if (r3 == 0) goto L1d1
            android.view.ViewGroup$LayoutParams r8 = r3.getLayoutParams()
            hg5 r8 = (defpackage.hg5) r8
            wg5 r11 = r8.a
            boolean r11 = r11.h()
            if (r11 != 0) goto L1d1
            wg5 r11 = r8.a
            int r11 = r11.b()
            if (r11 < 0) goto L1d1
            wg5 r8 = r8.a
            int r8 = r8.b()
            int r11 = r2.b()
            if (r8 >= r11) goto L1d1
            int r8 = defpackage.gg5.G(r3)
            r7.b(r3, r8)
            goto L256
        L1d1:
            boolean r3 = r0.s
            boolean r8 = r0.v
            if (r3 == r8) goto L1d9
            goto L246
        L1d9:
            boolean r3 = r7.d
            android.view.View r3 = r0.Q0(r1, r2, r3, r8)
            if (r3 == 0) goto L246
            int r8 = defpackage.gg5.G(r3)
            boolean r11 = r7.d
            ts1 r12 = r7.a
            if (r11 == 0) goto L202
            int r11 = r12.d(r3)
            ts1 r12 = r7.a
            int r13 = r12.a
            if (r9 != r13) goto L1f7
            r13 = r5
            goto L1fe
        L1f7:
            int r13 = r12.n()
            int r12 = r12.a
            int r13 = r13 - r12
        L1fe:
            int r13 = r13 + r11
            r7.c = r13
            goto L208
        L202:
            int r11 = r12.g(r3)
            r7.c = r11
        L208:
            r7.b = r8
            boolean r8 = r2.g
            if (r8 != 0) goto L256
            boolean r8 = r0.C0()
            if (r8 == 0) goto L256
            ts1 r8 = r0.r
            int r8 = r8.g(r3)
            ts1 r11 = r0.r
            int r3 = r11.d(r3)
            ts1 r11 = r0.r
            int r11 = r11.m()
            ts1 r12 = r0.r
            int r12 = r12.i()
            if (r3 > r11) goto L232
            if (r8 >= r11) goto L232
            r13 = r10
            goto L233
        L232:
            r13 = r5
        L233:
            if (r8 < r12) goto L239
            if (r3 <= r12) goto L239
            r3 = r10
            goto L23a
        L239:
            r3 = r5
        L23a:
            if (r13 != 0) goto L23e
            if (r3 == 0) goto L256
        L23e:
            boolean r3 = r7.d
            if (r3 == 0) goto L243
            r11 = r12
        L243:
            r7.c = r11
            goto L256
        L246:
            r7.a()
            boolean r3 = r0.v
            if (r3 == 0) goto L253
            int r3 = r2.b()
            int r3 = r3 - r10
            goto L254
        L253:
            r3 = r5
        L254:
            r7.b = r3
        L256:
            r7.e = r10
        L258:
            gv3 r3 = r0.q
            int r8 = r3.j
            if (r8 < 0) goto L260
            r8 = r10
            goto L261
        L260:
            r8 = r4
        L261:
            r3.f = r8
            int[] r3 = r0.D
            r3[r5] = r5
            r3[r10] = r5
            r0.D0(r2, r3)
            r8 = r3[r5]
            int r8 = java.lang.Math.max(r5, r8)
            ts1 r11 = r0.r
            int r11 = r11.m()
            int r11 = r11 + r8
            r3 = r3[r10]
            int r3 = java.lang.Math.max(r5, r3)
            ts1 r8 = r0.r
            int r8 = r8.j()
            int r8 = r8 + r3
            boolean r3 = r2.g
            if (r3 == 0) goto L2c0
            int r3 = r0.x
            if (r3 == r4) goto L2c0
            int r12 = r0.y
            if (r12 == r9) goto L2c0
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L2c0
            boolean r9 = r0.u
            ts1 r12 = r0.r
            if (r9 == 0) goto L2ad
            int r9 = r12.i()
            ts1 r12 = r0.r
            int r3 = r12.d(r3)
            int r9 = r9 - r3
            int r3 = r0.y
        L2ab:
            int r9 = r9 - r3
            goto L2bb
        L2ad:
            int r3 = r12.g(r3)
            ts1 r9 = r0.r
            int r9 = r9.m()
            int r3 = r3 - r9
            int r9 = r0.y
            goto L2ab
        L2bb:
            if (r9 <= 0) goto L2bf
            int r11 = r11 + r9
            goto L2c0
        L2bf:
            int r8 = r8 - r9
        L2c0:
            boolean r3 = r7.d
            boolean r9 = r0.u
            if (r3 == 0) goto L2ca
            if (r9 == 0) goto L2cc
        L2c8:
            r4 = r10
            goto L2cc
        L2ca:
            if (r9 == 0) goto L2c8
        L2cc:
            r0.X0(r1, r2, r7, r4)
            r17.p(r18)
            gv3 r3 = r0.q
            ts1 r4 = r0.r
            int r4 = r4.k()
            if (r4 != 0) goto L2e6
            ts1 r4 = r0.r
            int r4 = r4.h()
            if (r4 != 0) goto L2e6
            r4 = r10
            goto L2e7
        L2e6:
            r4 = r5
        L2e7:
            r3.l = r4
            gv3 r3 = r0.q
            r3.getClass()
            gv3 r3 = r0.q
            r3.i = r5
            boolean r3 = r7.d
            int r4 = r7.b
            if (r3 == 0) goto L33b
            int r3 = r7.c
            r0.g1(r4, r3)
            gv3 r3 = r0.q
            r3.h = r11
            r0.K0(r1, r3, r2, r5)
            gv3 r3 = r0.q
            int r4 = r3.b
            int r9 = r3.d
            int r3 = r3.c
            if (r3 <= 0) goto L30f
            int r8 = r8 + r3
        L30f:
            int r3 = r7.b
            int r11 = r7.c
            r0.f1(r3, r11)
            gv3 r3 = r0.q
            r3.h = r8
            int r8 = r3.d
            int r11 = r3.e
            int r8 = r8 + r11
            r3.d = r8
            r0.K0(r1, r3, r2, r5)
            gv3 r3 = r0.q
            int r8 = r3.b
            int r3 = r3.c
            if (r3 <= 0) goto L37e
            r0.g1(r9, r4)
            gv3 r4 = r0.q
            r4.h = r3
            r0.K0(r1, r4, r2, r5)
            gv3 r3 = r0.q
            int r4 = r3.b
            goto L37e
        L33b:
            int r3 = r7.c
            r0.f1(r4, r3)
            gv3 r3 = r0.q
            r3.h = r8
            r0.K0(r1, r3, r2, r5)
            gv3 r3 = r0.q
            int r8 = r3.b
            int r4 = r3.d
            int r3 = r3.c
            if (r3 <= 0) goto L352
            int r11 = r11 + r3
        L352:
            int r3 = r7.b
            int r9 = r7.c
            r0.g1(r3, r9)
            gv3 r3 = r0.q
            r3.h = r11
            int r9 = r3.d
            int r11 = r3.e
            int r9 = r9 + r11
            r3.d = r9
            r0.K0(r1, r3, r2, r5)
            gv3 r3 = r0.q
            int r9 = r3.b
            int r3 = r3.c
            if (r3 <= 0) goto L37d
            r0.f1(r4, r8)
            gv3 r4 = r0.q
            r4.h = r3
            r0.K0(r1, r4, r2, r5)
            gv3 r3 = r0.q
            int r8 = r3.b
        L37d:
            r4 = r9
        L37e:
            int r3 = r0.v()
            if (r3 <= 0) goto L3a3
            boolean r3 = r0.u
            boolean r9 = r0.v
            r3 = r3 ^ r9
            if (r3 == 0) goto L398
            int r3 = r0.R0(r8, r1, r2, r10)
            int r4 = r4 + r3
            int r8 = r8 + r3
            int r3 = r0.S0(r4, r1, r2, r5)
        L395:
            int r4 = r4 + r3
            int r8 = r8 + r3
            goto L3a3
        L398:
            int r3 = r0.S0(r4, r1, r2, r10)
            int r4 = r4 + r3
            int r8 = r8 + r3
            int r3 = r0.R0(r8, r1, r2, r5)
            goto L395
        L3a3:
            boolean r3 = r2.k
            if (r3 == 0) goto L441
            int r3 = r0.v()
            if (r3 == 0) goto L441
            boolean r3 = r2.g
            if (r3 != 0) goto L441
            boolean r3 = r0.C0()
            if (r3 != 0) goto L3b9
            goto L441
        L3b9:
            java.lang.Object r3 = r1.f
            java.util.List r3 = (java.util.List) r3
            int r9 = r3.size()
            android.view.View r11 = r0.u(r5)
            int r11 = defpackage.gg5.G(r11)
            r12 = r5
            r13 = r12
            r14 = r13
        L3cc:
            if (r12 >= r9) goto L3fc
            java.lang.Object r15 = r3.get(r12)
            wg5 r15 = (defpackage.wg5) r15
            boolean r16 = r15.h()
            android.view.View r10 = r15.a
            if (r16 == 0) goto L3dd
            goto L3f7
        L3dd:
            int r15 = r15.b()
            if (r15 >= r11) goto L3e5
            r15 = 1
            goto L3e6
        L3e5:
            r15 = r5
        L3e6:
            boolean r6 = r0.u
            ts1 r5 = r0.r
            if (r15 == r6) goto L3f2
            int r5 = r5.e(r10)
            int r13 = r13 + r5
            goto L3f7
        L3f2:
            int r5 = r5.e(r10)
            int r14 = r14 + r5
        L3f7:
            int r12 = r12 + 1
            r5 = 0
            r10 = 1
            goto L3cc
        L3fc:
            gv3 r5 = r0.q
            r5.k = r3
            if (r13 <= 0) goto L41e
            android.view.View r3 = r0.U0()
            int r3 = defpackage.gg5.G(r3)
            r0.g1(r3, r4)
            gv3 r3 = r0.q
            r3.h = r13
            r4 = 0
            r3.c = r4
            r5 = 0
            r3.a(r5)
            gv3 r3 = r0.q
            r0.K0(r1, r3, r2, r4)
            goto L41f
        L41e:
            r4 = 0
        L41f:
            if (r14 <= 0) goto L43c
            android.view.View r3 = r0.T0()
            int r3 = defpackage.gg5.G(r3)
            r0.f1(r3, r8)
            gv3 r3 = r0.q
            r3.h = r14
            r3.c = r4
            r5 = 0
            r3.a(r5)
            gv3 r3 = r0.q
            r0.K0(r1, r3, r2, r4)
            goto L43d
        L43c:
            r5 = 0
        L43d:
            gv3 r1 = r0.q
            r1.k = r5
        L441:
            boolean r1 = r2.g
            if (r1 != 0) goto L44e
            ts1 r1 = r0.r
            int r2 = r1.n()
            r1.a = r2
            goto L451
        L44e:
            r7.c()
        L451:
            boolean r1 = r0.v
            r0.s = r1
            return
    }

    public void d1(boolean r2) {
            r1 = this;
            r0 = 0
            r1.c(r0)
            boolean r0 = r1.v
            if (r0 != r2) goto L9
            return
        L9:
            r1.v = r2
            r1.o0()
            return
    }

    @Override // defpackage.gg5
    public final boolean e() {
            r1 = this;
            int r1 = r1.p
            r0 = 1
            if (r1 != r0) goto L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    @Override // defpackage.gg5
    public void e0(defpackage.sg5 r1) {
            r0 = this;
            r1 = 0
            r0.z = r1
            r1 = -1
            r0.x = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.y = r1
            ev3 r0 = r0.A
            r0.c()
            return
    }

    public final void e1(int r5, int r6, boolean r7, defpackage.sg5 r8) {
            r4 = this;
            gv3 r0 = r4.q
            ts1 r1 = r4.r
            int r1 = r1.k()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L16
            ts1 r1 = r4.r
            int r1 = r1.h()
            if (r1 != 0) goto L16
            r1 = r3
            goto L17
        L16:
            r1 = r2
        L17:
            r0.l = r1
            gv3 r0 = r4.q
            r0.f = r5
            int[] r0 = r4.D
            r0[r2] = r2
            r0[r3] = r2
            r4.D0(r8, r0)
            r8 = r0[r2]
            int r8 = java.lang.Math.max(r2, r8)
            r0 = r0[r3]
            int r0 = java.lang.Math.max(r2, r0)
            if (r5 != r3) goto L35
            r2 = r3
        L35:
            gv3 r5 = r4.q
            if (r2 == 0) goto L3b
            r1 = r0
            goto L3c
        L3b:
            r1 = r8
        L3c:
            r5.h = r1
            if (r2 == 0) goto L41
            goto L42
        L41:
            r8 = r0
        L42:
            r5.i = r8
            r8 = -1
            if (r2 == 0) goto L7e
            ts1 r0 = r4.r
            int r0 = r0.j()
            int r0 = r0 + r1
            r5.h = r0
            android.view.View r5 = r4.T0()
            gv3 r0 = r4.q
            boolean r1 = r4.u
            if (r1 == 0) goto L5b
            r3 = r8
        L5b:
            r0.e = r3
            int r8 = defpackage.gg5.G(r5)
            gv3 r1 = r4.q
            int r2 = r1.e
            int r8 = r8 + r2
            r0.d = r8
            ts1 r8 = r4.r
            int r8 = r8.d(r5)
            r1.b = r8
            ts1 r8 = r4.r
            int r5 = r8.d(r5)
            ts1 r8 = r4.r
            int r8 = r8.i()
            int r5 = r5 - r8
            goto Lba
        L7e:
            android.view.View r5 = r4.U0()
            gv3 r0 = r4.q
            int r1 = r0.h
            ts1 r2 = r4.r
            int r2 = r2.m()
            int r2 = r2 + r1
            r0.h = r2
            gv3 r0 = r4.q
            boolean r1 = r4.u
            if (r1 == 0) goto L96
            goto L97
        L96:
            r3 = r8
        L97:
            r0.e = r3
            int r8 = defpackage.gg5.G(r5)
            gv3 r1 = r4.q
            int r2 = r1.e
            int r8 = r8 + r2
            r0.d = r8
            ts1 r8 = r4.r
            int r8 = r8.g(r5)
            r1.b = r8
            ts1 r8 = r4.r
            int r5 = r8.g(r5)
            int r5 = -r5
            ts1 r8 = r4.r
            int r8 = r8.m()
            int r5 = r5 + r8
        Lba:
            gv3 r4 = r4.q
            r4.c = r6
            if (r7 == 0) goto Lc3
            int r6 = r6 - r5
            r4.c = r6
        Lc3:
            r4.g = r5
            return
    }

    @Override // defpackage.gg5
    public final void f0(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.hv3
            if (r0 == 0) goto L12
            hv3 r3 = (defpackage.hv3) r3
            r2.z = r3
            int r0 = r2.x
            r1 = -1
            if (r0 == r1) goto Lf
            r3.A = r1
        Lf:
            r2.o0()
        L12:
            return
    }

    public final void f1(int r3, int r4) {
            r2 = this;
            gv3 r0 = r2.q
            ts1 r1 = r2.r
            int r1 = r1.i()
            int r1 = r1 - r4
            r0.c = r1
            gv3 r0 = r2.q
            boolean r2 = r2.u
            r1 = 1
            if (r2 == 0) goto L14
            r2 = -1
            goto L15
        L14:
            r2 = r1
        L15:
            r0.e = r2
            r0.d = r3
            r0.f = r1
            r0.b = r4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.g = r2
            return
    }

    @Override // defpackage.gg5
    public final android.os.Parcelable g0() {
            r3 = this;
            hv3 r0 = r3.z
            if (r0 == 0) goto L16
            hv3 r3 = new hv3
            r3.<init>()
            int r1 = r0.A
            r3.A = r1
            int r1 = r0.B
            r3.B = r1
            boolean r0 = r0.L
            r3.L = r0
            return r3
        L16:
            hv3 r0 = new hv3
            r0.<init>()
            int r1 = r3.v()
            if (r1 <= 0) goto L61
            r3.J0()
            boolean r1 = r3.s
            boolean r2 = r3.u
            r1 = r1 ^ r2
            r0.L = r1
            if (r1 == 0) goto L47
            android.view.View r1 = r3.T0()
            ts1 r2 = r3.r
            int r2 = r2.i()
            ts1 r3 = r3.r
            int r3 = r3.d(r1)
            int r2 = r2 - r3
            r0.B = r2
            int r3 = defpackage.gg5.G(r1)
            r0.A = r3
            return r0
        L47:
            android.view.View r1 = r3.U0()
            int r2 = defpackage.gg5.G(r1)
            r0.A = r2
            ts1 r2 = r3.r
            int r1 = r2.g(r1)
            ts1 r3 = r3.r
            int r3 = r3.m()
            int r1 = r1 - r3
            r0.B = r1
            return r0
        L61:
            r3 = -1
            r0.A = r3
            return r0
    }

    public final void g1(int r3, int r4) {
            r2 = this;
            gv3 r0 = r2.q
            ts1 r1 = r2.r
            int r1 = r1.m()
            int r1 = r4 - r1
            r0.c = r1
            gv3 r0 = r2.q
            r0.d = r3
            boolean r2 = r2.u
            r3 = -1
            if (r2 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = r3
        L18:
            r0.e = r2
            r0.f = r3
            r0.b = r4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.g = r2
            return
    }

    @Override // defpackage.gg5
    public final void h(int r2, int r3, defpackage.sg5 r4, defpackage.ls0 r5) {
            r1 = this;
            int r0 = r1.p
            if (r0 != 0) goto L5
            goto L6
        L5:
            r2 = r3
        L6:
            int r3 = r1.v()
            if (r3 == 0) goto L24
            if (r2 != 0) goto Lf
            goto L24
        Lf:
            r1.J0()
            r3 = 1
            if (r2 <= 0) goto L17
            r0 = r3
            goto L18
        L17:
            r0 = -1
        L18:
            int r2 = java.lang.Math.abs(r2)
            r1.e1(r0, r2, r3, r4)
            gv3 r2 = r1.q
            r1.E0(r4, r2, r5)
        L24:
            return
    }

    @Override // defpackage.gg5
    public final void i(int r6, defpackage.ls0 r7) {
            r5 = this;
            hv3 r0 = r5.z
            r1 = -1
            r2 = 0
            if (r0 == 0) goto Ld
            int r3 = r0.A
            if (r3 < 0) goto Ld
            boolean r0 = r0.L
            goto L1c
        Ld:
            r5.a1()
            boolean r0 = r5.u
            int r3 = r5.x
            if (r3 != r1) goto L1c
            if (r0 == 0) goto L1b
            int r3 = r6 + (-1)
            goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r1 = 1
        L20:
            r0 = r2
        L21:
            int r4 = r5.C
            if (r0 >= r4) goto L30
            if (r3 < 0) goto L30
            if (r3 >= r6) goto L30
            r7.a(r3, r2)
            int r3 = r3 + r1
            int r0 = r0 + 1
            goto L21
        L30:
            return
    }

    @Override // defpackage.gg5
    public boolean i0(int r5, android.os.Bundle r6) {
            r4 = this;
            boolean r0 = super.i0(r5, r6)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 16908343(0x1020037, float:2.3877383E-38)
            r2 = 0
            if (r5 != r0) goto L56
            if (r6 == 0) goto L56
            int r5 = r4.p
            r0 = -1
            if (r5 != r1) goto L2e
            java.lang.String r5 = "android.view.accessibility.action.ARGUMENT_ROW_INT"
            int r5 = r6.getInt(r5, r0)
            if (r5 >= 0) goto L1e
            goto L56
        L1e:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            mg5 r3 = r6.L
            sg5 r6 = r6.d1
            int r6 = r4.I(r3, r6)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
            goto L46
        L2e:
            java.lang.String r5 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT"
            int r5 = r6.getInt(r5, r0)
            if (r5 >= 0) goto L37
            goto L56
        L37:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            mg5 r3 = r6.L
            sg5 r6 = r6.d1
            int r6 = r4.x(r3, r6)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L46:
            if (r5 < 0) goto L56
            r4.x = r5
            r4.y = r2
            hv3 r5 = r4.z
            if (r5 == 0) goto L52
            r5.A = r0
        L52:
            r4.o0()
            return r1
        L56:
            return r2
    }

    @Override // defpackage.gg5
    public final int j(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.F0(r1)
            return r0
    }

    @Override // defpackage.gg5
    public int k(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.G0(r1)
            return r0
    }

    @Override // defpackage.gg5
    public int l(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.H0(r1)
            return r0
    }

    @Override // defpackage.gg5
    public final int m(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.F0(r1)
            return r0
    }

    @Override // defpackage.gg5
    public int n(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.G0(r1)
            return r0
    }

    @Override // defpackage.gg5
    public int o(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.H0(r1)
            return r0
    }

    @Override // defpackage.gg5
    public int p0(int r3, defpackage.mg5 r4, defpackage.sg5 r5) {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L7
            r2 = 0
            return r2
        L7:
            int r2 = r2.b1(r3, r4, r5)
            return r2
    }

    @Override // defpackage.gg5
    public final android.view.View q(int r3) {
            r2 = this;
            int r0 = r2.v()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r1 = 0
            android.view.View r1 = r2.u(r1)
            int r1 = defpackage.gg5.G(r1)
            int r1 = r3 - r1
            if (r1 < 0) goto L22
            if (r1 >= r0) goto L22
            android.view.View r0 = r2.u(r1)
            int r1 = defpackage.gg5.G(r0)
            if (r1 != r3) goto L22
            return r0
        L22:
            android.view.View r2 = super.q(r3)
            return r2
    }

    @Override // defpackage.gg5
    public final void q0(int r2) {
            r1 = this;
            r1.x = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.y = r2
            hv3 r2 = r1.z
            if (r2 == 0) goto Ld
            r0 = -1
            r2.A = r0
        Ld:
            r1.o0()
            return
    }

    @Override // defpackage.gg5
    public defpackage.hg5 r() {
            r1 = this;
            hg5 r1 = new hg5
            r0 = -2
            r1.<init>(r0, r0)
            return r1
    }

    @Override // defpackage.gg5
    public int r0(int r2, defpackage.mg5 r3, defpackage.sg5 r4) {
            r1 = this;
            int r0 = r1.p
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            int r1 = r1.b1(r2, r3, r4)
            return r1
    }

    @Override // defpackage.gg5
    public final boolean y0() {
            r5 = this;
            int r0 = r5.m
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L27
            int r0 = r5.l
            if (r0 == r2) goto L27
            int r0 = r5.v()
            r2 = r1
        L10:
            if (r2 >= r0) goto L27
            android.view.View r3 = r5.u(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            int r4 = r3.width
            if (r4 >= 0) goto L24
            int r3 = r3.height
            if (r3 >= 0) goto L24
            r5 = 1
            return r5
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            return r1
    }
}
