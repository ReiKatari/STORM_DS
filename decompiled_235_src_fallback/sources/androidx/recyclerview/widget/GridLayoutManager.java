package androidx.recyclerview.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public static final java.util.Set P = null;
    public boolean E;
    public int F;
    public int[] G;
    public android.view.View[] H;
    public final android.util.SparseIntArray I;
    public final android.util.SparseIntArray J;
    public final defpackage.yc1 K;
    public final android.graphics.Rect L;
    public int M;
    public int N;
    public int O;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 66
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 33
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 130(0x82, float:1.82E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer[] r1 = new java.lang.Integer[]{r1, r2, r3, r4}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.recyclerview.widget.GridLayoutManager.P = r0
            return
    }

    public GridLayoutManager() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.E = r0
            r0 = -1
            r3.F = r0
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r3.I = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r3.J = r1
            yc1 r1 = new yc1
            r2 = 22
            r1.<init>(r2)
            r3.K = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.L = r1
            r3.M = r0
            r3.N = r0
            r3.O = r0
            r0 = 2
            r3.s1(r0)
            return
    }

    public GridLayoutManager(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            r3.<init>(r0, r1)
            r3.E = r1
            r0 = -1
            r3.F = r0
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r3.I = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r3.J = r1
            yc1 r1 = new yc1
            r2 = 22
            r1.<init>(r2)
            r3.K = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.L = r1
            r3.M = r0
            r3.N = r0
            r3.O = r0
            r3.s1(r4)
            return
    }

    public GridLayoutManager(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>(r4, r5, r6, r7)
            r0 = 0
            r3.E = r0
            r0 = -1
            r3.F = r0
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r3.I = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r3.J = r1
            yc1 r1 = new yc1
            r2 = 22
            r1.<init>(r2)
            r3.K = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.L = r1
            r3.M = r0
            r3.N = r0
            r3.O = r0
            fg5 r4 = defpackage.gg5.H(r4, r5, r6, r7)
            int r4 = r4.b
            r3.s1(r4)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final boolean C0() {
            r1 = this;
            hv3 r0 = r1.z
            if (r0 != 0) goto La
            boolean r1 = r1.E
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void E0(defpackage.sg5 r6, defpackage.gv3 r7, defpackage.ls0 r8) {
            r5 = this;
            int r0 = r5.F
            r1 = 0
            r2 = r1
        L4:
            int r3 = r5.F
            if (r2 >= r3) goto L30
            int r3 = r7.d
            if (r3 < 0) goto L30
            int r4 = r6.b()
            if (r3 >= r4) goto L30
            if (r0 <= 0) goto L30
            int r3 = r7.d
            int r4 = r7.g
            int r4 = java.lang.Math.max(r1, r4)
            r8.a(r3, r4)
            yc1 r3 = r5.K
            r3.getClass()
            int r0 = r0 + (-1)
            int r3 = r7.d
            int r4 = r7.e
            int r3 = r3 + r4
            r7.d = r3
            int r2 = r2 + 1
            goto L4
        L30:
            return
    }

    @Override // defpackage.gg5
    public final int I(defpackage.mg5 r3, defpackage.sg5 r4) {
            r2 = this;
            int r0 = r2.p
            if (r0 != 0) goto Lf
            int r3 = r2.F
            int r2 = r2.B()
            int r2 = java.lang.Math.min(r3, r2)
            return r2
        Lf:
            int r0 = r4.b()
            r1 = 1
            if (r0 >= r1) goto L18
            r2 = 0
            return r2
        L18:
            int r0 = r4.b()
            int r0 = r0 - r1
            int r2 = r2.o1(r0, r3, r4)
            int r2 = r2 + r1
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final android.view.View Q0(defpackage.mg5 r10, defpackage.sg5 r11, boolean r12, boolean r13) {
            r9 = this;
            int r12 = r9.v()
            r0 = 1
            if (r13 == 0) goto Lf
            int r12 = r9.v()
            int r12 = r12 - r0
            r13 = -1
            r0 = r13
            goto L13
        Lf:
            r13 = 0
            r8 = r13
            r13 = r12
            r12 = r8
        L13:
            int r1 = r11.b()
            r9.J0()
            ts1 r2 = r9.r
            int r2 = r2.m()
            ts1 r3 = r9.r
            int r3 = r3.i()
            r4 = 0
            r5 = r4
        L28:
            if (r12 == r13) goto L66
            android.view.View r6 = r9.u(r12)
            int r7 = defpackage.gg5.G(r6)
            if (r7 < 0) goto L64
            if (r7 >= r1) goto L64
            int r7 = r9.p1(r7, r10, r11)
            if (r7 == 0) goto L3d
            goto L64
        L3d:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            hg5 r7 = (defpackage.hg5) r7
            wg5 r7 = r7.a
            boolean r7 = r7.h()
            if (r7 == 0) goto L4f
            if (r5 != 0) goto L64
            r5 = r6
            goto L64
        L4f:
            ts1 r7 = r9.r
            int r7 = r7.g(r6)
            if (r7 >= r3) goto L61
            ts1 r7 = r9.r
            int r7 = r7.d(r6)
            if (r7 >= r2) goto L60
            goto L61
        L60:
            return r6
        L61:
            if (r4 != 0) goto L64
            r4 = r6
        L64:
            int r12 = r12 + r0
            goto L28
        L66:
            if (r4 == 0) goto L69
            return r4
        L69:
            return r5
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final android.view.View T(android.view.View r23, int r24, defpackage.mg5 r25, defpackage.sg5 r26) {
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            r4 = 0
            if (r3 != 0) goto Le
            r5 = r23
            goto L23
        Le:
            r5 = r23
            android.view.View r3 = r3.E(r5)
            if (r3 != 0) goto L17
            goto L23
        L17:
            dk0 r6 = r0.a
            java.lang.Object r6 = r6.B
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L24
        L23:
            r3 = r4
        L24:
            if (r3 != 0) goto L27
            goto L38
        L27:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            ku2 r6 = (defpackage.ku2) r6
            int r7 = r6.e
            int r6 = r6.f
            int r6 = r6 + r7
            android.view.View r5 = super.T(r23, r24, r25, r26)
            if (r5 != 0) goto L39
        L38:
            return r4
        L39:
            r5 = r24
            int r5 = r0.I0(r5)
            r9 = 1
            if (r5 != r9) goto L44
            r5 = r9
            goto L45
        L44:
            r5 = 0
        L45:
            boolean r10 = r0.u
            r11 = -1
            if (r5 == r10) goto L52
            int r5 = r0.v()
            int r5 = r5 - r9
            r10 = r11
            r12 = r10
            goto L59
        L52:
            int r5 = r0.v()
            r10 = r5
            r12 = r9
            r5 = 0
        L59:
            int r13 = r0.p
            if (r13 != r9) goto L65
            boolean r13 = r0.V0()
            if (r13 == 0) goto L65
            r13 = r9
            goto L66
        L65:
            r13 = 0
        L66:
            int r14 = r0.o1(r5, r1, r2)
            r16 = r4
            r8 = r11
            r15 = r8
            r9 = 0
            r11 = r5
            r4 = 0
            r5 = r16
        L73:
            r17 = r5
            if (r11 == r10) goto L13f
            int r5 = r0.o1(r11, r1, r2)
            android.view.View r1 = r0.u(r11)
            if (r1 != r3) goto L83
            goto L13f
        L83:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L97
            if (r5 == r14) goto L97
            if (r16 == 0) goto L8f
            goto L13f
        L8f:
            r18 = r3
            r19 = r9
            r21 = r10
            goto L130
        L97:
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            ku2 r5 = (defpackage.ku2) r5
            int r2 = r5.e
            r18 = r3
            int r3 = r5.f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Laf
            if (r2 != r7) goto Laf
            if (r3 != r6) goto Laf
            return r1
        Laf:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Lb7
            if (r16 == 0) goto Lbf
        Lb7:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto Lc4
            if (r17 != 0) goto Lc4
        Lbf:
            r19 = r9
            r21 = r10
            goto L109
        Lc4:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Le8
            if (r10 <= r9) goto Ldb
        Ld8:
            r19 = r9
            goto L109
        Ldb:
            if (r10 != r9) goto Le5
            if (r2 <= r15) goto Le1
            r10 = 1
            goto Le2
        Le1:
            r10 = 0
        Le2:
            if (r13 != r10) goto Le5
            goto Ld8
        Le5:
            r19 = r9
            goto L130
        Le8:
            if (r16 != 0) goto Le5
            r19 = r9
            rr6 r9 = r0.c
            boolean r9 = r9.j(r1)
            if (r9 == 0) goto Lfd
            rr6 r9 = r0.d
            boolean r9 = r9.j(r1)
            if (r9 == 0) goto Lfd
            goto L130
        Lfd:
            if (r10 <= r4) goto L100
            goto L109
        L100:
            if (r10 != r4) goto L130
            if (r2 <= r8) goto L106
            r9 = 1
            goto L107
        L106:
            r9 = 0
        L107:
            if (r13 != r9) goto L130
        L109:
            boolean r9 = r1.hasFocusable()
            int r5 = r5.e
            if (r9 == 0) goto L121
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r9 = r3 - r2
            r16 = r1
            r15 = r5
            r5 = r17
            goto L134
        L121:
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r4 = r3 - r2
            r8 = r5
            r9 = r19
            r5 = r1
            goto L134
        L130:
            r5 = r17
            r9 = r19
        L134:
            int r11 = r11 + r12
            r1 = r25
            r2 = r26
            r3 = r18
            r10 = r21
            goto L73
        L13f:
            if (r16 == 0) goto L142
            return r16
        L142:
            return r17
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final void V(defpackage.mg5 r1, defpackage.sg5 r2, defpackage.v2 r3) {
            r0 = this;
            super.V(r1, r2, r3)
            java.lang.Class<android.widget.GridView> r1 = android.widget.GridView.class
            java.lang.String r1 = r1.getName()
            r3.i(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            wf5 r0 = r0.l0
            if (r0 == 0) goto L1e
            int r0 = r0.a()
            r1 = 1
            if (r0 <= r1) goto L1e
            p2 r0 = defpackage.p2.r
            r3.b(r0)
        L1e:
            return
    }

    @Override // defpackage.gg5
    public final void W(defpackage.mg5 r3, defpackage.sg5 r4, android.view.View r5, defpackage.v2 r6) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            boolean r1 = r0 instanceof defpackage.ku2
            if (r1 != 0) goto Lc
            r2.X(r5, r6)
            return
        Lc:
            ku2 r0 = (defpackage.ku2) r0
            wg5 r5 = r0.a
            int r5 = r5.b()
            int r3 = r2.o1(r5, r3, r4)
            int r2 = r2.p
            int r4 = r0.e
            int r5 = r0.f
            r0 = 0
            r1 = 1
            if (r2 != 0) goto L2a
            u2 r2 = defpackage.u2.b(r0, r4, r5, r3, r1)
            r6.k(r2)
            return
        L2a:
            u2 r2 = defpackage.u2.b(r0, r3, r1, r4, r5)
            r6.k(r2)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(defpackage.mg5 r19, defpackage.sg5 r20, defpackage.gv3 r21, defpackage.fv3 r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            ts1 r5 = r0.r
            int r5 = r5.l()
            r6 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r8) goto L17
            r9 = r6
            goto L18
        L17:
            r9 = 0
        L18:
            int r10 = r0.v()
            if (r10 <= 0) goto L25
            int[] r10 = r0.G
            int r11 = r0.F
            r10 = r10[r11]
            goto L26
        L25:
            r10 = 0
        L26:
            if (r9 == 0) goto L2b
            r0.t1()
        L2b:
            int r11 = r3.e
            if (r11 != r6) goto L31
            r11 = r6
            goto L32
        L31:
            r11 = 0
        L32:
            int r12 = r0.F
            if (r11 != 0) goto L43
            int r12 = r3.d
            int r12 = r0.p1(r12, r1, r2)
            int r13 = r3.d
            int r13 = r0.q1(r13, r1, r2)
            int r12 = r12 + r13
        L43:
            r13 = 0
        L44:
            int r14 = r0.F
            if (r13 >= r14) goto L88
            int r14 = r3.d
            if (r14 < 0) goto L88
            int r15 = r2.b()
            if (r14 >= r15) goto L88
            if (r12 <= 0) goto L88
            int r14 = r3.d
            int r15 = r0.q1(r14, r1, r2)
            int r8 = r0.F
            if (r15 > r8) goto L72
            int r12 = r12 - r15
            if (r12 >= 0) goto L62
            goto L88
        L62:
            android.view.View r8 = r3.b(r1)
            if (r8 != 0) goto L69
            goto L88
        L69:
            android.view.View[] r14 = r0.H
            r14[r13] = r8
            int r13 = r13 + 1
            r8 = 1073741824(0x40000000, float:2.0)
            goto L44
        L72:
            java.lang.String r1 = " requires "
            java.lang.String r2 = " spans but GridLayoutManager has only "
            java.lang.String r3 = "Item at position "
            java.lang.StringBuilder r1 = defpackage.i61.q(r14, r15, r3, r1, r2)
            int r0 = r0.F
            java.lang.String r2 = " spans."
            java.lang.String r0 = defpackage.lb1.o(r1, r0, r2)
            defpackage.i.h(r0)
            return
        L88:
            if (r13 != 0) goto L8d
            r4.b = r6
            return
        L8d:
            if (r11 == 0) goto L93
            r15 = r6
            r14 = r13
            r12 = 0
            goto L97
        L93:
            int r12 = r13 + (-1)
            r14 = -1
            r15 = -1
        L97:
            r6 = 0
        L98:
            if (r12 == r14) goto Lb5
            android.view.View[] r7 = r0.H
            r7 = r7[r12]
            android.view.ViewGroup$LayoutParams r16 = r7.getLayoutParams()
            r8 = r16
            ku2 r8 = (defpackage.ku2) r8
            int r7 = defpackage.gg5.G(r7)
            int r7 = r0.q1(r7, r1, r2)
            r8.f = r7
            r8.e = r6
            int r6 = r6 + r7
            int r12 = r12 + r15
            goto L98
        Lb5:
            r1 = 0
            r2 = 0
            r6 = 0
        Lb8:
            if (r2 >= r13) goto L116
            android.view.View[] r7 = r0.H
            r7 = r7[r2]
            java.util.List r8 = r3.k
            if (r8 != 0) goto Ld0
            if (r11 == 0) goto Lca
            r8 = -1
            r12 = 0
            r0.b(r7, r8, r12)
            goto Ldd
        Lca:
            r8 = -1
            r12 = 0
            r0.b(r7, r12, r12)
            goto Ldd
        Ld0:
            r8 = -1
            r12 = 0
            if (r11 == 0) goto Ld9
            r14 = 1
            r0.b(r7, r8, r14)
            goto Ldd
        Ld9:
            r14 = 1
            r0.b(r7, r12, r14)
        Ldd:
            androidx.recyclerview.widget.RecyclerView r8 = r0.b
            android.graphics.Rect r14 = r0.L
            if (r8 != 0) goto Le7
            r14.set(r12, r12, r12, r12)
            goto Lee
        Le7:
            android.graphics.Rect r8 = r8.O(r7)
            r14.set(r8)
        Lee:
            r0.r1(r7, r5, r12)
            ts1 r8 = r0.r
            int r8 = r8.e(r7)
            if (r8 <= r6) goto Lfa
            r6 = r8
        Lfa:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            ku2 r8 = (defpackage.ku2) r8
            ts1 r12 = r0.r
            int r7 = r12.f(r7)
            float r7 = (float) r7
            r12 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r12
            int r8 = r8.f
            float r8 = (float) r8
            float r7 = r7 / r8
            int r8 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r8 <= 0) goto L113
            r1 = r7
        L113:
            int r2 = r2 + 1
            goto Lb8
        L116:
            if (r9 == 0) goto L141
            int r2 = r0.F
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            int r1 = java.lang.Math.max(r1, r10)
            r0.h1(r1)
            r6 = 0
            r12 = 0
        L129:
            if (r12 >= r13) goto L141
            android.view.View[] r1 = r0.H
            r1 = r1[r12]
            r2 = 1073741824(0x40000000, float:2.0)
            r14 = 1
            r0.r1(r1, r2, r14)
            ts1 r2 = r0.r
            int r1 = r2.e(r1)
            if (r1 <= r6) goto L13e
            r6 = r1
        L13e:
            int r12 = r12 + 1
            goto L129
        L141:
            r12 = 0
        L142:
            if (r12 >= r13) goto L1b1
            android.view.View[] r1 = r0.H
            r1 = r1[r12]
            ts1 r2 = r0.r
            int r2 = r2.e(r1)
            if (r2 == r6) goto L1ab
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            ku2 r2 = (defpackage.ku2) r2
            android.graphics.Rect r5 = r2.b
            int r7 = r5.top
            int r8 = r5.bottom
            int r7 = r7 + r8
            int r8 = r2.topMargin
            int r7 = r7 + r8
            int r8 = r2.bottomMargin
            int r7 = r7 + r8
            int r8 = r5.left
            int r5 = r5.right
            int r8 = r8 + r5
            int r5 = r2.leftMargin
            int r8 = r8 + r5
            int r5 = r2.rightMargin
            int r8 = r8 + r5
            int r5 = r2.e
            int r9 = r2.f
            int r5 = r0.n1(r5, r9)
            int r9 = r0.p
            r14 = 1
            if (r9 != r14) goto L18b
            int r2 = r2.width
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            int r2 = defpackage.gg5.w(r9, r5, r10, r8, r2)
            int r5 = r6 - r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L19b
        L18b:
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            int r8 = r6 - r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            int r2 = r2.height
            int r5 = defpackage.gg5.w(r9, r5, r10, r7, r2)
            r2 = r8
        L19b:
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            hg5 r7 = (defpackage.hg5) r7
            boolean r7 = r0.z0(r1, r2, r5, r7)
            if (r7 == 0) goto L1ae
            r1.measure(r2, r5)
            goto L1ae
        L1ab:
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
        L1ae:
            int r12 = r12 + 1
            goto L142
        L1b1:
            r9 = 0
            r4.a = r6
            int r1 = r0.p
            int r2 = r3.f
            int r12 = r3.b
            r14 = 1
            if (r1 != r14) goto L1cd
            r8 = -1
            if (r2 != r8) goto L1c6
            int r1 = r12 - r6
            r3 = r1
            r1 = r9
            r2 = r1
            goto L1dc
        L1c6:
            int r1 = r12 + r6
            r2 = r9
            r3 = r12
            r12 = r1
            r1 = r2
            goto L1dc
        L1cd:
            r8 = -1
            if (r2 != r8) goto L1d6
            int r1 = r12 - r6
            r3 = r9
            r2 = r12
        L1d4:
            r12 = r3
            goto L1dc
        L1d6:
            int r1 = r12 + r6
            r2 = r1
            r3 = r9
            r1 = r12
            goto L1d4
        L1dc:
            r7 = r9
        L1dd:
            android.view.View[] r5 = r0.H
            if (r7 >= r13) goto L25b
            r5 = r5[r7]
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            ku2 r6 = (defpackage.ku2) r6
            int r8 = r0.p
            r14 = 1
            if (r8 != r14) goto L223
            boolean r1 = r0.V0()
            if (r1 == 0) goto L210
            int r1 = r0.D()
            int[] r2 = r0.G
            int r8 = r0.F
            int r9 = r6.e
            int r8 = r8 - r9
            r2 = r2[r8]
            int r1 = r1 + r2
            ts1 r2 = r0.r
            int r2 = r2.f(r5)
            int r2 = r1 - r2
            r17 = r2
            r2 = r1
            r1 = r17
            goto L236
        L210:
            int r1 = r0.D()
            int[] r2 = r0.G
            int r8 = r6.e
            r2 = r2[r8]
            int r1 = r1 + r2
            ts1 r2 = r0.r
            int r2 = r2.f(r5)
            int r2 = r2 + r1
            goto L236
        L223:
            int r3 = r0.F()
            int[] r8 = r0.G
            int r9 = r6.e
            r8 = r8[r9]
            int r3 = r3 + r8
            ts1 r8 = r0.r
            int r8 = r8.f(r5)
            int r8 = r8 + r3
            r12 = r8
        L236:
            defpackage.gg5.N(r5, r1, r3, r2, r12)
            wg5 r8 = r6.a
            boolean r8 = r8.h()
            if (r8 != 0) goto L249
            wg5 r6 = r6.a
            boolean r6 = r6.k()
            if (r6 == 0) goto L24b
        L249:
            r14 = 1
            goto L24d
        L24b:
            r14 = 1
            goto L24f
        L24d:
            r4.c = r14
        L24f:
            boolean r6 = r4.d
            boolean r5 = r5.hasFocusable()
            r5 = r5 | r6
            r4.d = r5
            int r7 = r7 + 1
            goto L1dd
        L25b:
            r0 = 0
            java.util.Arrays.fill(r5, r0)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(defpackage.mg5 r5, defpackage.sg5 r6, defpackage.ev3 r7, int r8) {
            r4 = this;
            r4.t1()
            int r0 = r6.b()
            if (r0 <= 0) goto L40
            boolean r0 = r6.g
            if (r0 != 0) goto L40
            r0 = 1
            if (r8 != r0) goto L12
            r8 = r0
            goto L13
        L12:
            r8 = 0
        L13:
            int r1 = r7.b
            int r1 = r4.p1(r1, r5, r6)
            if (r8 == 0) goto L2a
        L1b:
            if (r1 <= 0) goto L40
            int r8 = r7.b
            if (r8 <= 0) goto L40
            int r8 = r8 + (-1)
            r7.b = r8
            int r1 = r4.p1(r8, r5, r6)
            goto L1b
        L2a:
            int r8 = r6.b()
            int r8 = r8 - r0
            int r0 = r7.b
        L31:
            if (r0 >= r8) goto L3e
            int r2 = r0 + 1
            int r3 = r4.p1(r2, r5, r6)
            if (r3 <= r1) goto L3e
            r0 = r2
            r1 = r3
            goto L31
        L3e:
            r7.b = r0
        L40:
            r4.i1()
            return
    }

    @Override // defpackage.gg5
    public final void Y(int r1, int r2) {
            r0 = this;
            yc1 r0 = r0.K
            r0.F()
            java.lang.Object r0 = r0.B
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // defpackage.gg5
    public final void Z() {
            r0 = this;
            yc1 r0 = r0.K
            r0.F()
            java.lang.Object r0 = r0.B
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // defpackage.gg5
    public final void a0(int r1, int r2) {
            r0 = this;
            yc1 r0 = r0.K
            r0.F()
            java.lang.Object r0 = r0.B
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // defpackage.gg5
    public final void b0(int r1, int r2) {
            r0 = this;
            yc1 r0 = r0.K
            r0.F()
            java.lang.Object r0 = r0.B
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // defpackage.gg5
    public final void c0(int r1, int r2) {
            r0 = this;
            yc1 r0 = r0.K
            r0.F()
            java.lang.Object r0 = r0.B
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final void d0(defpackage.mg5 r8, defpackage.sg5 r9) {
            r7 = this;
            boolean r0 = r9.g
            android.util.SparseIntArray r1 = r7.J
            android.util.SparseIntArray r2 = r7.I
            if (r0 == 0) goto L2c
            int r0 = r7.v()
            r3 = 0
        Ld:
            if (r3 >= r0) goto L2c
            android.view.View r4 = r7.u(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            ku2 r4 = (defpackage.ku2) r4
            wg5 r5 = r4.a
            int r5 = r5.b()
            int r6 = r4.f
            r2.put(r5, r6)
            int r4 = r4.e
            r1.put(r5, r4)
            int r3 = r3 + 1
            goto Ld
        L2c:
            super.d0(r8, r9)
            r2.clear()
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L7
            r1 = 0
            super.d1(r1)
            return
        L7:
            java.lang.String r0 = "GridLayoutManager does not support stack from end. Consider using reverse layout"
            defpackage.fa6.h(r0)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final void e0(defpackage.sg5 r3) {
            r2 = this;
            super.e0(r3)
            r3 = 0
            r2.E = r3
            int r3 = r2.M
            r0 = -1
            if (r3 == r0) goto L18
            android.view.View r3 = r2.q(r3)
            if (r3 == 0) goto L18
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r3.sendAccessibilityEvent(r1)
            r2.M = r0
        L18:
            return
    }

    @Override // defpackage.gg5
    public final boolean f(defpackage.hg5 r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.ku2
            return r0
    }

    public final void h1(int r8) {
            r7 = this;
            int[] r0 = r7.G
            int r1 = r7.F
            r2 = 1
            if (r0 == 0) goto L12
            int r3 = r0.length
            int r4 = r1 + 1
            if (r3 != r4) goto L12
            int r3 = r0.length
            int r3 = r3 - r2
            r3 = r0[r3]
            if (r3 == r8) goto L16
        L12:
            int r0 = r1 + 1
            int[] r0 = new int[r0]
        L16:
            r3 = 0
            r0[r3] = r3
            int r4 = r8 / r1
            int r8 = r8 % r1
            r5 = r3
        L1d:
            if (r2 > r1) goto L31
            int r3 = r3 + r8
            if (r3 <= 0) goto L2a
            int r6 = r1 - r3
            if (r6 >= r8) goto L2a
            int r6 = r4 + 1
            int r3 = r3 - r1
            goto L2b
        L2a:
            r6 = r4
        L2b:
            int r5 = r5 + r6
            r0[r2] = r5
            int r2 = r2 + 1
            goto L1d
        L31:
            r7.G = r0
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final boolean i0(int r12, android.os.Bundle r13) {
            r11 = this;
            p2 r0 = defpackage.p2.r
            int r0 = r0.a()
            r1 = 1
            r2 = 0
            r3 = -1
            if (r12 != r0) goto L28a
            if (r12 == r3) goto L28a
            r12 = r2
        Le:
            int r0 = r11.v()
            if (r12 >= r0) goto L29
            android.view.View r0 = r11.u(r12)
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.isAccessibilityFocused()
            if (r0 == 0) goto L26
            android.view.View r12 = r11.u(r12)
            goto L2a
        L26:
            int r12 = r12 + 1
            goto Le
        L29:
            r12 = 0
        L2a:
            if (r12 != 0) goto L2e
            goto L2e3
        L2e:
            if (r13 != 0) goto L32
            goto L2e3
        L32:
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_DIRECTION_INT"
            int r13 = r13.getInt(r0, r3)
            java.util.Set r0 = androidx.recyclerview.widget.GridLayoutManager.P
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L46
            goto L2e3
        L46:
            androidx.recyclerview.widget.RecyclerView r0 = r11.b
            wg5 r12 = r0.M(r12)
            if (r12 != 0) goto L50
            goto L2e3
        L50:
            androidx.recyclerview.widget.RecyclerView r0 = r12.r
            if (r0 != 0) goto L56
            r12 = r3
            goto L5a
        L56:
            int r12 = r0.K(r12)
        L5a:
            int r0 = r11.k1(r12)
            int r4 = r11.j1(r12)
            if (r0 < 0) goto L2e3
            if (r4 >= 0) goto L68
            goto L2e3
        L68:
            java.util.HashSet r5 = r11.l1(r12)
            int r6 = r11.N
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L8c
            int r5 = r11.j1(r12)
            java.util.HashSet r5 = r11.m1(r5, r12)
            int r6 = r11.O
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L90
        L8c:
            r11.N = r0
            r11.O = r4
        L90:
            int r5 = r11.N
            if (r5 != r3) goto L95
            r5 = r0
        L95:
            int r6 = r11.O
            if (r6 != r3) goto L9a
            goto L9b
        L9a:
            r4 = r6
        L9b:
            r6 = 66
            r7 = 17
            if (r13 == r7) goto L16f
            r8 = 33
            if (r13 == r8) goto L12c
            if (r13 == r6) goto Lf1
            r8 = 130(0x82, float:1.82E-43)
            if (r13 == r8) goto Lad
            goto L2e3
        Lad:
            int r12 = r12 + r1
        Lae:
            int r8 = r11.B()
            if (r12 >= r8) goto Lee
            int r8 = r11.k1(r12)
            int r9 = r11.j1(r12)
            if (r8 < 0) goto Lee
            if (r9 >= 0) goto Lc1
            goto Lee
        Lc1:
            int r10 = r11.p
            if (r10 != r1) goto Ldf
            if (r8 <= r5) goto Leb
            if (r9 == r4) goto Ldb
            int r9 = r11.j1(r12)
            java.util.HashSet r9 = r11.m1(r9, r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto Leb
        Ldb:
            r11.N = r8
            goto L1a5
        Ldf:
            if (r8 <= r5) goto Leb
            if (r9 != r4) goto Leb
            int r4 = r11.k1(r12)
            r11.N = r4
            goto L1a5
        Leb:
            int r12 = r12 + 1
            goto Lae
        Lee:
            r12 = r3
            goto L1a5
        Lf1:
            int r12 = r12 + r1
        Lf2:
            int r8 = r11.B()
            if (r12 >= r8) goto Lee
            int r8 = r11.k1(r12)
            int r9 = r11.j1(r12)
            if (r8 < 0) goto Lee
            if (r9 >= 0) goto L105
            goto Lee
        L105:
            int r10 = r11.p
            if (r10 != r1) goto L115
            if (r8 != r5) goto L10d
            if (r9 > r4) goto L10f
        L10d:
            if (r8 <= r5) goto L129
        L10f:
            r11.N = r8
            r11.O = r9
            goto L1a5
        L115:
            if (r9 <= r4) goto L129
            java.util.HashSet r8 = r11.l1(r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L129
            r11.O = r9
            goto L1a5
        L129:
            int r12 = r12 + 1
            goto Lf2
        L12c:
            int r12 = r12 - r1
        L12d:
            if (r12 < 0) goto Lee
            int r8 = r11.k1(r12)
            int r9 = r11.j1(r12)
            if (r8 < 0) goto Lee
            if (r9 >= 0) goto L13c
            goto Lee
        L13c:
            int r10 = r11.p
            if (r10 != r1) goto L157
            if (r8 >= r5) goto L16c
            int r9 = r11.j1(r12)
            java.util.HashSet r9 = r11.m1(r9, r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L16c
            r11.N = r8
            goto L1a5
        L157:
            if (r8 >= r5) goto L16c
            if (r9 != r4) goto L16c
            java.util.HashSet r4 = r11.l1(r12)
            java.lang.Object r4 = java.util.Collections.max(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r11.N = r4
            goto L1a5
        L16c:
            int r12 = r12 + (-1)
            goto L12d
        L16f:
            int r12 = r12 - r1
        L170:
            if (r12 < 0) goto Lee
            int r8 = r11.k1(r12)
            int r9 = r11.j1(r12)
            if (r8 < 0) goto Lee
            if (r9 >= 0) goto L180
            goto Lee
        L180:
            int r10 = r11.p
            if (r10 != r1) goto L18f
            if (r8 != r5) goto L188
            if (r9 < r4) goto L18a
        L188:
            if (r8 >= r5) goto L1a2
        L18a:
            r11.N = r8
            r11.O = r9
            goto L1a5
        L18f:
            java.util.HashSet r8 = r11.l1(r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L1a2
            if (r9 >= r4) goto L1a2
            r11.O = r9
            goto L1a5
        L1a2:
            int r12 = r12 + (-1)
            goto L170
        L1a5:
            if (r12 != r3) goto L282
            int r4 = r11.p
            if (r4 != 0) goto L282
            if (r13 != r7) goto L219
            if (r0 >= 0) goto L1b2
        L1af:
            r12 = r3
            goto L282
        L1b2:
            if (r4 != r1) goto L1b5
            goto L1af
        L1b5:
            java.util.TreeMap r12 = new java.util.TreeMap
            java.util.Comparator r13 = java.util.Collections.reverseOrder()
            r12.<init>(r13)
            r13 = r2
        L1bf:
            int r4 = r11.B()
            if (r13 >= r4) goto L1eb
            java.util.HashSet r4 = r11.l1(r13)
            java.util.Iterator r4 = r4.iterator()
        L1cd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1e8
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            if (r6 >= 0) goto L1e0
            goto L1af
        L1e0:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r12.put(r5, r6)
            goto L1cd
        L1e8:
            int r13 = r13 + 1
            goto L1bf
        L1eb:
            java.util.Set r13 = r12.keySet()
            java.util.Iterator r13 = r13.iterator()
        L1f3:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L1af
            java.lang.Object r4 = r13.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            if (r5 >= r0) goto L1f3
            java.lang.Object r12 = r12.get(r4)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.N = r5
            int r13 = r11.j1(r12)
            r11.O = r13
            goto L282
        L219:
            if (r13 != r6) goto L282
            if (r0 >= 0) goto L21e
            goto L1af
        L21e:
            if (r4 != r1) goto L221
            goto L1af
        L221:
            java.util.TreeMap r12 = new java.util.TreeMap
            r12.<init>()
            r13 = r2
        L227:
            int r4 = r11.B()
            if (r13 >= r4) goto L25a
            java.util.HashSet r4 = r11.l1(r13)
            java.util.Iterator r4 = r4.iterator()
        L235:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L257
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            if (r6 >= 0) goto L249
            goto L1af
        L249:
            boolean r6 = r12.containsKey(r5)
            if (r6 != 0) goto L235
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r12.put(r5, r6)
            goto L235
        L257:
            int r13 = r13 + 1
            goto L227
        L25a:
            java.util.Set r13 = r12.keySet()
            java.util.Iterator r13 = r13.iterator()
        L262:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L1af
            java.lang.Object r4 = r13.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            if (r5 <= r0) goto L262
            java.lang.Object r12 = r12.get(r4)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.N = r5
            r11.O = r2
        L282:
            if (r12 == r3) goto L2e3
            r11.q0(r12)
            r11.M = r12
            return r1
        L28a:
            r0 = 16908343(0x1020037, float:2.3877383E-38)
            if (r12 != r0) goto L2e4
            if (r13 == 0) goto L2e4
            java.lang.String r12 = "android.view.accessibility.action.ARGUMENT_ROW_INT"
            int r12 = r13.getInt(r12, r3)
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT"
            int r13 = r13.getInt(r0, r3)
            if (r12 == r3) goto L2e3
            if (r13 != r3) goto L2a2
            goto L2e3
        L2a2:
            androidx.recyclerview.widget.RecyclerView r0 = r11.b
            wf5 r0 = r0.l0
            int r0 = r0.a()
            r4 = r2
        L2ab:
            if (r4 >= r0) goto L2d2
            androidx.recyclerview.widget.RecyclerView r5 = r11.b
            mg5 r6 = r5.L
            sg5 r5 = r5.d1
            int r5 = r11.p1(r4, r6, r5)
            androidx.recyclerview.widget.RecyclerView r6 = r11.b
            mg5 r7 = r6.L
            sg5 r6 = r6.d1
            int r6 = r11.o1(r4, r7, r6)
            int r7 = r11.p
            if (r7 != r1) goto L2ca
            if (r5 != r13) goto L2cf
            if (r6 != r12) goto L2cf
            goto L2d3
        L2ca:
            if (r5 != r12) goto L2cf
            if (r6 != r13) goto L2cf
            goto L2d3
        L2cf:
            int r4 = r4 + 1
            goto L2ab
        L2d2:
            r4 = r3
        L2d3:
            if (r4 <= r3) goto L2e3
            r11.x = r4
            r11.y = r2
            hv3 r12 = r11.z
            if (r12 == 0) goto L2df
            r12.A = r3
        L2df:
            r11.o0()
            return r1
        L2e3:
            return r2
        L2e4:
            boolean r11 = super.i0(r12, r13)
            return r11
    }

    public final void i1() {
            r2 = this;
            android.view.View[] r0 = r2.H
            if (r0 == 0) goto Lb
            int r0 = r0.length
            int r1 = r2.F
            if (r0 == r1) goto La
            goto Lb
        La:
            return
        Lb:
            int r0 = r2.F
            android.view.View[] r0 = new android.view.View[r0]
            r2.H = r0
            return
    }

    public final int j1(int r3) {
            r2 = this;
            int r0 = r2.p
            androidx.recyclerview.widget.RecyclerView r1 = r2.b
            if (r0 != 0) goto Lf
            mg5 r0 = r1.L
            sg5 r1 = r1.d1
            int r2 = r2.o1(r3, r0, r1)
            return r2
        Lf:
            mg5 r0 = r1.L
            sg5 r1 = r1.d1
            int r2 = r2.p1(r3, r0, r1)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int k(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.G0(r1)
            return r0
    }

    public final int k1(int r4) {
            r3 = this;
            int r0 = r3.p
            androidx.recyclerview.widget.RecyclerView r1 = r3.b
            r2 = 1
            if (r0 != r2) goto L10
            mg5 r0 = r1.L
            sg5 r1 = r1.d1
            int r3 = r3.o1(r4, r0, r1)
            return r3
        L10:
            mg5 r0 = r1.L
            sg5 r1 = r1.d1
            int r3 = r3.p1(r4, r0, r1)
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int l(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.H0(r1)
            return r0
    }

    public final java.util.HashSet l1(int r2) {
            r1 = this;
            int r0 = r1.k1(r2)
            java.util.HashSet r1 = r1.m1(r0, r2)
            return r1
    }

    public final java.util.HashSet m1(int r4, int r5) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r3.b
            mg5 r2 = r1.L
            sg5 r1 = r1.d1
            int r3 = r3.q1(r5, r2, r1)
            r5 = r4
        L10:
            int r1 = r4 + r3
            if (r5 >= r1) goto L1e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.add(r1)
            int r5 = r5 + 1
            goto L10
        L1e:
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int n(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.G0(r1)
            return r0
    }

    public final int n1(int r3, int r4) {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L19
            boolean r0 = r2.V0()
            if (r0 == 0) goto L19
            int[] r0 = r2.G
            int r2 = r2.F
            int r1 = r2 - r3
            r1 = r0[r1]
            int r2 = r2 - r3
            int r2 = r2 - r4
            r2 = r0[r2]
            int r1 = r1 - r2
            return r1
        L19:
            int[] r2 = r2.G
            int r4 = r4 + r3
            r4 = r2[r4]
            r2 = r2[r3]
            int r4 = r4 - r2
            return r4
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int o(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.H0(r1)
            return r0
    }

    public final int o1(int r2, defpackage.mg5 r3, defpackage.sg5 r4) {
            r1 = this;
            boolean r4 = r4.g
            yc1 r0 = r1.K
            if (r4 != 0) goto L10
            int r1 = r1.F
            r0.getClass()
            int r1 = defpackage.yc1.E(r2, r1)
            return r1
        L10:
            int r3 = r3.b(r2)
            r4 = -1
            if (r3 != r4) goto L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot find span size for pre layout position. "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GridLayoutManager"
            android.util.Log.w(r2, r1)
            r1 = 0
            return r1
        L2c:
            int r1 = r1.F
            r0.getClass()
            int r1 = defpackage.yc1.E(r3, r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int p0(int r1, defpackage.mg5 r2, defpackage.sg5 r3) {
            r0 = this;
            r0.t1()
            r0.i1()
            int r0 = super.p0(r1, r2, r3)
            return r0
    }

    public final int p1(int r3, defpackage.mg5 r4, defpackage.sg5 r5) {
            r2 = this;
            boolean r5 = r5.g
            yc1 r0 = r2.K
            if (r5 != 0) goto Ld
            int r2 = r2.F
            r0.getClass()
            int r3 = r3 % r2
            return r3
        Ld:
            android.util.SparseIntArray r5 = r2.J
            r1 = -1
            int r5 = r5.get(r3, r1)
            if (r5 == r1) goto L17
            return r5
        L17:
            int r4 = r4.b(r3)
            if (r4 != r1) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
        L32:
            int r2 = r2.F
            r0.getClass()
            int r4 = r4 % r2
            return r4
    }

    public final int q1(int r3, defpackage.mg5 r4, defpackage.sg5 r5) {
            r2 = this;
            boolean r5 = r5.g
            yc1 r0 = r2.K
            r1 = 1
            if (r5 != 0) goto Lb
            r0.getClass()
            return r1
        Lb:
            android.util.SparseIntArray r2 = r2.I
            r5 = -1
            int r2 = r2.get(r3, r5)
            if (r2 == r5) goto L15
            return r2
        L15:
            int r2 = r4.b(r3)
            if (r2 != r5) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            return r1
        L2f:
            r0.getClass()
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final defpackage.hg5 r() {
            r2 = this;
            int r2 = r2.p
            r0 = -1
            r1 = -2
            if (r2 != 0) goto Lc
            ku2 r2 = new ku2
            r2.<init>(r1, r0)
            return r2
        Lc:
            ku2 r2 = new ku2
            r2.<init>(r0, r1)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int r0(int r1, defpackage.mg5 r2, defpackage.sg5 r3) {
            r0 = this;
            r0.t1()
            r0.i1()
            int r0 = super.r0(r1, r2, r3)
            return r0
    }

    public final void r1(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            ku2 r0 = (defpackage.ku2) r0
            android.graphics.Rect r1 = r0.b
            int r2 = r1.top
            int r3 = r1.bottom
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r3 = r1.left
            int r1 = r1.right
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r1 = r0.e
            int r4 = r0.f
            int r1 = r8.n1(r1, r4)
            int r4 = r8.p
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L41
            int r4 = r0.width
            int r10 = defpackage.gg5.w(r5, r1, r10, r3, r4)
            ts1 r1 = r8.r
            int r1 = r1.n()
            int r3 = r8.m
            int r0 = r0.height
            int r0 = defpackage.gg5.w(r6, r1, r3, r2, r0)
            goto L58
        L41:
            int r4 = r0.height
            int r10 = defpackage.gg5.w(r5, r1, r10, r2, r4)
            ts1 r1 = r8.r
            int r1 = r1.n()
            int r2 = r8.l
            int r0 = r0.width
            int r0 = defpackage.gg5.w(r6, r1, r2, r3, r0)
            r7 = r0
            r0 = r10
            r10 = r7
        L58:
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            hg5 r1 = (defpackage.hg5) r1
            if (r11 == 0) goto L65
            boolean r8 = r8.z0(r9, r10, r0, r1)
            goto L69
        L65:
            boolean r8 = r8.x0(r9, r10, r0, r1)
        L69:
            if (r8 == 0) goto L6e
            r9.measure(r10, r0)
        L6e:
            return
    }

    @Override // defpackage.gg5
    public final defpackage.hg5 s(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            ku2 r0 = new ku2
            r0.<init>(r1, r2)
            r1 = -1
            r0.e = r1
            r1 = 0
            r0.f = r1
            return r0
    }

    public final void s1(int r2) {
            r1 = this;
            int r0 = r1.F
            if (r2 != r0) goto L5
            return
        L5:
            r0 = 1
            r1.E = r0
            if (r2 < r0) goto L15
            r1.F = r2
            yc1 r2 = r1.K
            r2.F()
            r1.o0()
            return
        L15:
            java.lang.String r1 = "Span count should be at least 1. Provided "
            java.lang.String r1 = defpackage.lb1.g(r2, r1)
            defpackage.i.h(r1)
            return
    }

    @Override // defpackage.gg5
    public final defpackage.hg5 t(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            r0 = 0
            r1 = -1
            if (r2 == 0) goto L12
            ku2 r2 = new ku2
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r2.<init>(r3)
            r2.e = r1
            r2.f = r0
            return r2
        L12:
            ku2 r2 = new ku2
            r2.<init>(r3)
            r2.e = r1
            r2.f = r0
            return r2
    }

    public final void t1() {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L12
            int r0 = r2.n
            int r1 = r2.E()
            int r0 = r0 - r1
            int r1 = r2.D()
        L10:
            int r0 = r0 - r1
            goto L1e
        L12:
            int r0 = r2.o
            int r1 = r2.C()
            int r0 = r0 - r1
            int r1 = r2.F()
            goto L10
        L1e:
            r2.h1(r0)
            return
    }

    @Override // defpackage.gg5
    public final void u0(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.G
            if (r0 != 0) goto L7
            super.u0(r5, r6, r7)
        L7:
            int r0 = r4.D()
            int r1 = r4.E()
            int r1 = r1 + r0
            int r0 = r4.F()
            int r2 = r4.C()
            int r2 = r2 + r0
            int r0 = r4.p
            r3 = 1
            if (r0 != r3) goto L41
            int r5 = r5.height()
            int r5 = r5 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            java.util.WeakHashMap r2 = defpackage.ao7.a
            int r0 = r0.getMinimumHeight()
            int r5 = defpackage.gg5.g(r7, r5, r0)
            int[] r7 = r4.G
            int r0 = r7.length
            int r0 = r0 - r3
            r7 = r7[r0]
            int r7 = r7 + r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            int r0 = r0.getMinimumWidth()
            int r6 = defpackage.gg5.g(r6, r7, r0)
            goto L63
        L41:
            int r5 = r5.width()
            int r5 = r5 + r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            java.util.WeakHashMap r1 = defpackage.ao7.a
            int r0 = r0.getMinimumWidth()
            int r6 = defpackage.gg5.g(r6, r5, r0)
            int[] r5 = r4.G
            int r0 = r5.length
            int r0 = r0 - r3
            r5 = r5[r0]
            int r5 = r5 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            int r0 = r0.getMinimumHeight()
            int r5 = defpackage.gg5.g(r7, r5, r0)
        L63:
            androidx.recyclerview.widget.RecyclerView r4 = r4.b
            androidx.recyclerview.widget.RecyclerView.g(r4, r6, r5)
            return
    }

    @Override // defpackage.gg5
    public final int x(defpackage.mg5 r3, defpackage.sg5 r4) {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L10
            int r3 = r2.F
            int r2 = r2.B()
            int r2 = java.lang.Math.min(r3, r2)
            return r2
        L10:
            int r0 = r4.b()
            if (r0 >= r1) goto L18
            r2 = 0
            return r2
        L18:
            int r0 = r4.b()
            int r0 = r0 - r1
            int r2 = r2.o1(r0, r3, r4)
            int r2 = r2 + r1
            return r2
    }
}
