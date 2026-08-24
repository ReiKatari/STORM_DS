package androidx.recyclerview.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends defpackage.gg5 implements defpackage.rg5 {
    public int A;
    public final defpackage.ap3 B;
    public final int C;
    public boolean D;
    public boolean E;
    public defpackage.yo6 F;
    public final android.graphics.Rect G;
    public final defpackage.vo6 H;
    public final boolean I;
    public int[] J;
    public final defpackage.g15 K;
    public final int p;
    public final defpackage.yz3[] q;
    public final defpackage.ts1 r;
    public final defpackage.ts1 s;
    public final int t;
    public int u;
    public final defpackage.rn3 v;
    public boolean w;
    public boolean x;
    public final java.util.BitSet y;
    public int z;

    public StaggeredGridLayoutManager(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9) {
            r5 = this;
            r5.<init>()
            r0 = -1
            r5.p = r0
            r1 = 0
            r5.w = r1
            r5.x = r1
            r5.z = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.A = r0
            ap3 r0 = new ap3
            r2 = 29
            r0.<init>(r2, r1)
            r5.B = r0
            r2 = 2
            r5.C = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r5.G = r2
            vo6 r2 = new vo6
            r2.<init>(r5)
            r5.H = r2
            r2 = 1
            r5.I = r2
            g15 r3 = new g15
            r4 = 21
            r3.<init>(r5, r4)
            r5.K = r3
            fg5 r6 = defpackage.gg5.H(r6, r7, r8, r9)
            int r7 = r6.a
            r8 = 0
            if (r7 == 0) goto L49
            if (r7 != r2) goto L43
            goto L49
        L43:
            java.lang.String r5 = "invalid orientation."
            defpackage.i.h(r5)
            throw r8
        L49:
            r5.c(r8)
            int r9 = r5.t
            if (r7 != r9) goto L51
            goto L5e
        L51:
            r5.t = r7
            ts1 r7 = r5.r
            ts1 r9 = r5.s
            r5.r = r9
            r5.s = r7
            r5.o0()
        L5e:
            int r7 = r6.b
            r5.c(r8)
            int r9 = r5.p
            if (r7 == r9) goto L92
            r0.n()
            r5.o0()
            r5.p = r7
            java.util.BitSet r7 = new java.util.BitSet
            int r9 = r5.p
            r7.<init>(r9)
            r5.y = r7
            int r7 = r5.p
            yz3[] r7 = new defpackage.yz3[r7]
            r5.q = r7
            r7 = r1
        L7f:
            int r9 = r5.p
            if (r7 >= r9) goto L8f
            yz3[] r9 = r5.q
            yz3 r0 = new yz3
            r0.<init>(r5, r7)
            r9[r7] = r0
            int r7 = r7 + 1
            goto L7f
        L8f:
            r5.o0()
        L92:
            boolean r6 = r6.c
            r5.c(r8)
            yo6 r7 = r5.F
            if (r7 == 0) goto La1
            boolean r8 = r7.d0
            if (r8 == r6) goto La1
            r7.d0 = r6
        La1:
            r5.w = r6
            r5.o0()
            rn3 r6 = new rn3
            r6.<init>()
            r6.a = r2
            r6.f = r1
            r6.g = r1
            r5.v = r6
            int r6 = r5.t
            ts1 r6 = defpackage.ts1.b(r5, r6)
            r5.r = r6
            int r6 = r5.t
            int r2 = r2 - r6
            ts1 r6 = defpackage.ts1.b(r5, r2)
            r5.s = r6
            return
    }

    public static int d1(int r2, int r3, int r4) {
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            goto L12
        L5:
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L13
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L12
            goto L13
        L12:
            return r2
        L13:
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = r2 - r3
            int r2 = r2 - r4
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            return r2
    }

    @Override // defpackage.gg5
    public final void A0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            iv3 r0 = new iv3
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r0.a = r3
            r1.B0(r0)
            return
    }

    @Override // defpackage.gg5
    public final boolean C0() {
            r0 = this;
            yo6 r0 = r0.F
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean D0() {
            r2 = this;
            int r0 = r2.v()
            r1 = 0
            if (r0 == 0) goto L37
            int r0 = r2.C
            if (r0 == 0) goto L37
            boolean r0 = r2.g
            if (r0 != 0) goto L10
            goto L37
        L10:
            boolean r0 = r2.x
            if (r0 == 0) goto L1c
            int r0 = r2.L0()
            r2.K0()
            goto L23
        L1c:
            int r0 = r2.K0()
            r2.L0()
        L23:
            if (r0 != 0) goto L37
            android.view.View r0 = r2.P0()
            if (r0 == 0) goto L37
            ap3 r0 = r2.B
            r0.n()
            r0 = 1
            r2.f = r0
            r2.o0()
            return r0
        L37:
            return r1
    }

    public final int E0(defpackage.sg5 r9) {
            r8 = this;
            int r0 = r8.v()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            boolean r0 = r8.I
            r0 = r0 ^ 1
            android.view.View r3 = r8.H0(r0)
            android.view.View r4 = r8.G0(r0)
            boolean r6 = r8.I
            boolean r7 = r8.x
            ts1 r2 = r8.r
            r5 = r8
            r1 = r9
            int r8 = defpackage.gi2.x(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public final int F0(defpackage.mg5 r25, defpackage.rn3 r26, defpackage.sg5 r27) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.util.BitSet r3 = r0.y
            r4 = 0
            int r5 = r0.p
            r6 = 1
            r3.set(r4, r5, r6)
            rn3 r7 = r0.v
            boolean r8 = r7.i
            if (r8 == 0) goto L20
            int r8 = r2.e
            if (r8 != r6) goto L1d
            r8 = 2147483647(0x7fffffff, float:NaN)
            goto L2f
        L1d:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L2f
        L20:
            int r8 = r2.e
            if (r8 != r6) goto L2a
            int r8 = r2.g
            int r11 = r2.b
            int r8 = r8 + r11
            goto L2f
        L2a:
            int r8 = r2.f
            int r11 = r2.b
            int r8 = r8 - r11
        L2f:
            int r11 = r2.e
            r12 = r4
        L32:
            yz3[] r13 = r0.q
            if (r12 >= r5) goto L4b
            r14 = r13[r12]
            java.lang.Object r14 = r14.f
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L43
            goto L48
        L43:
            r13 = r13[r12]
            r0.c1(r13, r11, r8)
        L48:
            int r12 = r12 + 1
            goto L32
        L4b:
            boolean r11 = r0.x
            ts1 r12 = r0.r
            if (r11 == 0) goto L56
            int r11 = r12.i()
            goto L5a
        L56:
            int r11 = r12.m()
        L5a:
            r14 = r4
        L5b:
            int r15 = r2.c
            if (r15 < 0) goto L26e
            int r9 = r27.b()
            if (r15 >= r9) goto L26e
            boolean r9 = r7.i
            if (r9 != 0) goto L6f
            boolean r9 = r3.isEmpty()
            if (r9 != 0) goto L26e
        L6f:
            int r9 = r2.c
            android.view.View r9 = r1.e(r9)
            int r14 = r2.c
            int r15 = r2.d
            int r14 = r14 + r15
            r2.c = r14
            android.view.ViewGroup$LayoutParams r14 = r9.getLayoutParams()
            wo6 r14 = (defpackage.wo6) r14
            wg5 r15 = r14.a
            int r15 = r15.b()
            ap3 r4 = r0.B
            java.lang.Object r6 = r4.B
            int[] r6 = (int[]) r6
            if (r6 == 0) goto L98
            int r10 = r6.length
            if (r15 < r10) goto L94
            goto L98
        L94:
            r6 = r6[r15]
        L96:
            r10 = -1
            goto L9a
        L98:
            r6 = -1
            goto L96
        L9a:
            if (r6 != r10) goto L10d
            int r6 = r2.e
            boolean r6 = r0.T0(r6)
            if (r6 == 0) goto Lad
            int r6 = r5 + (-1)
            r18 = r5
            r19 = r6
            r5 = -1
            r10 = -1
            goto Lb2
        Lad:
            r18 = r5
            r10 = 1
            r19 = 0
        Lb2:
            int r6 = r2.e
            r20 = 0
            r21 = r10
            r10 = 1
            if (r6 != r10) goto Le1
            int r6 = r12.m()
            r22 = r13
            r10 = r19
            r13 = 2147483647(0x7fffffff, float:NaN)
        Lc6:
            if (r10 == r5) goto Ldc
            r19 = r10
            r10 = r22[r19]
            r23 = r3
            int r3 = r10.i(r6)
            if (r3 >= r13) goto Ld7
            r13 = r3
            r20 = r10
        Ld7:
            int r10 = r19 + r21
            r3 = r23
            goto Lc6
        Ldc:
            r23 = r3
        Lde:
            r3 = r20
            goto L101
        Le1:
            r23 = r3
            r22 = r13
            int r3 = r12.i()
            r6 = r19
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        Led:
            if (r6 == r5) goto Lde
            r13 = r22[r6]
            r19 = r5
            int r5 = r13.k(r3)
            if (r5 <= r10) goto Lfc
            r10 = r5
            r20 = r13
        Lfc:
            int r6 = r6 + r21
            r5 = r19
            goto Led
        L101:
            r4.q(r15)
            java.lang.Object r4 = r4.B
            int[] r4 = (int[]) r4
            int r5 = r3.e
            r4[r15] = r5
            goto L115
        L10d:
            r23 = r3
            r18 = r5
            r22 = r13
            r3 = r22[r6]
        L115:
            r14.e = r3
            int r4 = r2.e
            r10 = 1
            if (r4 != r10) goto L122
            r4 = -1
            r5 = 0
            r0.b(r9, r4, r5)
            goto L126
        L122:
            r5 = 0
            r0.b(r9, r5, r5)
        L126:
            int r4 = r0.t
            if (r4 != r10) goto L14c
            int r6 = r0.u
            int r13 = r0.l
            int r15 = r14.width
            int r6 = defpackage.gg5.w(r5, r6, r13, r5, r15)
            int r5 = r0.o
            int r13 = r0.m
            int r15 = r0.F()
            int r17 = r0.C()
            int r15 = r17 + r15
            int r1 = r14.height
            int r1 = defpackage.gg5.w(r10, r5, r13, r15, r1)
            r0.R0(r9, r6, r1)
            goto L16d
        L14c:
            int r1 = r0.n
            int r5 = r0.l
            int r6 = r0.D()
            int r13 = r0.E()
            int r13 = r13 + r6
            int r6 = r14.width
            int r1 = defpackage.gg5.w(r10, r1, r5, r13, r6)
            int r5 = r0.u
            int r6 = r0.m
            int r13 = r14.height
            r15 = 0
            int r5 = defpackage.gg5.w(r15, r5, r6, r15, r13)
            r0.R0(r9, r1, r5)
        L16d:
            int r1 = r2.e
            if (r1 != r10) goto L17b
            int r1 = r3.i(r11)
            int r5 = r12.e(r9)
            int r5 = r5 + r1
            goto L185
        L17b:
            int r5 = r3.k(r11)
            int r1 = r12.e(r9)
            int r1 = r5 - r1
        L185:
            int r6 = r2.e
            yz3 r13 = r14.e
            if (r6 != r10) goto L1cb
            r13.getClass()
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            wo6 r6 = (defpackage.wo6) r6
            r6.e = r13
            java.lang.Object r14 = r13.f
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            r14.add(r9)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r13.c = r15
            int r14 = r14.size()
            if (r14 != r10) goto L1a9
            r13.b = r15
        L1a9:
            wg5 r10 = r6.a
            boolean r10 = r10.h()
            if (r10 != 0) goto L1b9
            wg5 r6 = r6.a
            boolean r6 = r6.k()
            if (r6 == 0) goto L1c8
        L1b9:
            int r6 = r13.d
            java.lang.Object r10 = r13.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r10
            ts1 r10 = r10.r
            int r10 = r10.e(r9)
            int r10 = r10 + r6
            r13.d = r10
        L1c8:
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L20a
        L1cb:
            r13.getClass()
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            wo6 r6 = (defpackage.wo6) r6
            r6.e = r13
            java.lang.Object r10 = r13.f
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r15 = 0
            r10.add(r15, r9)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r13.b = r15
            int r10 = r10.size()
            r14 = 1
            if (r10 != r14) goto L1eb
            r13.c = r15
        L1eb:
            wg5 r10 = r6.a
            boolean r10 = r10.h()
            if (r10 != 0) goto L1fb
            wg5 r6 = r6.a
            boolean r6 = r6.k()
            if (r6 == 0) goto L20a
        L1fb:
            int r6 = r13.d
            java.lang.Object r10 = r13.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r10
            ts1 r10 = r10.r
            int r10 = r10.e(r9)
            int r10 = r10 + r6
            r13.d = r10
        L20a:
            boolean r6 = r0.Q0()
            ts1 r10 = r0.s
            if (r6 == 0) goto L22a
            r14 = 1
            if (r4 != r14) goto L22a
            int r6 = r10.i()
            int r13 = r18 + (-1)
            int r14 = r3.e
            int r13 = r13 - r14
            int r14 = r0.u
            int r13 = r13 * r14
            int r6 = r6 - r13
            int r10 = r10.e(r9)
            int r10 = r6 - r10
        L228:
            r14 = 1
            goto L23d
        L22a:
            int r6 = r3.e
            int r13 = r0.u
            int r6 = r6 * r13
            int r13 = r10.m()
            int r6 = r6 + r13
            int r10 = r10.e(r9)
            int r10 = r10 + r6
            r14 = r10
            r10 = r6
            r6 = r14
            goto L228
        L23d:
            if (r4 != r14) goto L243
            defpackage.gg5.N(r9, r10, r1, r6, r5)
            goto L246
        L243:
            defpackage.gg5.N(r9, r1, r10, r5, r6)
        L246:
            int r1 = r7.e
            r0.c1(r3, r1, r8)
            r1 = r25
            r0.V0(r1, r7)
            boolean r4 = r7.h
            if (r4 == 0) goto L263
            boolean r4 = r9.hasFocusable()
            if (r4 == 0) goto L263
            int r3 = r3.e
            r4 = r23
            r5 = 0
            r4.set(r3, r5)
            goto L265
        L263:
            r4 = r23
        L265:
            r3 = r4
            r6 = r14
            r5 = r18
            r13 = r22
            r4 = 0
            goto L5b
        L26e:
            if (r14 != 0) goto L273
            r0.V0(r1, r7)
        L273:
            int r1 = r7.e
            r4 = -1
            if (r1 != r4) goto L286
            int r1 = r12.m()
            int r0 = r0.N0(r1)
            int r1 = r12.m()
            int r1 = r1 - r0
            goto L294
        L286:
            int r1 = r12.i()
            int r0 = r0.M0(r1)
            int r1 = r12.i()
            int r1 = r0 - r1
        L294:
            if (r1 <= 0) goto L29d
            int r0 = r2.b
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L29d:
            r16 = 0
            return r16
    }

    public final android.view.View G0(boolean r9) {
            r8 = this;
            ts1 r0 = r8.r
            int r1 = r0.m()
            int r2 = r0.i()
            int r3 = r8.v()
            int r3 = r3 + (-1)
            r4 = 0
        L11:
            if (r3 < 0) goto L31
            android.view.View r5 = r8.u(r3)
            int r6 = r0.g(r5)
            int r7 = r0.d(r5)
            if (r7 <= r1) goto L2e
            if (r6 < r2) goto L24
            goto L2e
        L24:
            if (r7 <= r2) goto L2d
            if (r9 != 0) goto L29
            goto L2d
        L29:
            if (r4 != 0) goto L2e
            r4 = r5
            goto L2e
        L2d:
            return r5
        L2e:
            int r3 = r3 + (-1)
            goto L11
        L31:
            return r4
    }

    public final android.view.View H0(boolean r10) {
            r9 = this;
            ts1 r0 = r9.r
            int r1 = r0.m()
            int r2 = r0.i()
            int r3 = r9.v()
            r4 = 0
            r5 = 0
        L10:
            if (r5 >= r3) goto L30
            android.view.View r6 = r9.u(r5)
            int r7 = r0.g(r6)
            int r8 = r0.d(r6)
            if (r8 <= r1) goto L2d
            if (r7 < r2) goto L23
            goto L2d
        L23:
            if (r7 >= r1) goto L2c
            if (r10 != 0) goto L28
            goto L2c
        L28:
            if (r4 != 0) goto L2d
            r4 = r6
            goto L2d
        L2c:
            return r6
        L2d:
            int r5 = r5 + 1
            goto L10
        L30:
            return r4
    }

    @Override // defpackage.gg5
    public final int I(defpackage.mg5 r1, defpackage.sg5 r2) {
            r0 = this;
            int r1 = r0.t
            if (r1 != 0) goto Lf
            int r0 = r0.p
            int r1 = r2.b()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        Lf:
            r0 = -1
            return r0
    }

    public final void I0(defpackage.mg5 r3, defpackage.sg5 r4, boolean r5) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.M0(r0)
            if (r1 != r0) goto L9
            goto L22
        L9:
            ts1 r0 = r2.r
            int r0 = r0.i()
            int r0 = r0 - r1
            if (r0 <= 0) goto L22
            int r1 = -r0
            int r3 = r2.Z0(r1, r3, r4)
            int r3 = -r3
            int r0 = r0 - r3
            if (r5 == 0) goto L22
            if (r0 <= 0) goto L22
            ts1 r2 = r2.r
            r2.q(r0)
        L22:
            return
    }

    public final void J0(defpackage.mg5 r3, defpackage.sg5 r4, boolean r5) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r2.N0(r0)
            if (r1 != r0) goto La
            goto L22
        La:
            ts1 r0 = r2.r
            int r0 = r0.m()
            int r1 = r1 - r0
            if (r1 <= 0) goto L22
            int r3 = r2.Z0(r1, r3, r4)
            int r1 = r1 - r3
            if (r5 == 0) goto L22
            if (r1 <= 0) goto L22
            ts1 r2 = r2.r
            int r3 = -r1
            r2.q(r3)
        L22:
            return
    }

    @Override // defpackage.gg5
    public final boolean K() {
            r0 = this;
            int r0 = r0.C
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int K0() {
            r2 = this;
            int r0 = r2.v()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r2 = r2.u(r1)
            int r2 = defpackage.gg5.G(r2)
            return r2
    }

    @Override // defpackage.gg5
    public final boolean L() {
            r0 = this;
            boolean r0 = r0.w
            return r0
    }

    public final int L0() {
            r1 = this;
            int r0 = r1.v()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r0 + (-1)
            android.view.View r1 = r1.u(r0)
            int r1 = defpackage.gg5.G(r1)
            return r1
    }

    public final int M0(int r4) {
            r3 = this;
            yz3[] r0 = r3.q
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.i(r4)
            r1 = 1
        La:
            int r2 = r3.p
            if (r1 >= r2) goto L1c
            yz3[] r2 = r3.q
            r2 = r2[r1]
            int r2 = r2.i(r4)
            if (r2 <= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    public final int N0(int r4) {
            r3 = this;
            yz3[] r0 = r3.q
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.k(r4)
            r1 = 1
        La:
            int r2 = r3.p
            if (r1 >= r2) goto L1c
            yz3[] r2 = r3.q
            r2 = r2[r1]
            int r2 = r2.k(r4)
            if (r2 >= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    @Override // defpackage.gg5
    public final void O(int r5) {
            r4 = this;
            super.O(r5)
            r0 = 0
        L4:
            int r1 = r4.p
            if (r0 >= r1) goto L1f
            yz3[] r1 = r4.q
            r1 = r1[r0]
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.b = r2
        L15:
            int r2 = r1.c
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.c = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    public final void O0(int r11, int r12, int r13) {
            r10 = this;
            boolean r0 = r10.x
            if (r0 == 0) goto L9
            int r0 = r10.L0()
            goto Ld
        L9:
            int r0 = r10.K0()
        Ld:
            r1 = 8
            if (r13 != r1) goto L1b
            if (r11 >= r12) goto L17
            int r2 = r12 + 1
        L15:
            r3 = r11
            goto L1e
        L17:
            int r2 = r11 + 1
            r3 = r12
            goto L1e
        L1b:
            int r2 = r11 + r12
            goto L15
        L1e:
            ap3 r4 = r10.B
            java.lang.Object r5 = r4.B
            int[] r5 = (int[]) r5
            r6 = 1
            if (r5 != 0) goto L29
            goto Lad
        L29:
            int r5 = r5.length
            if (r3 < r5) goto L2e
            goto Lad
        L2e:
            java.lang.Object r5 = r4.L
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r7 = -1
            if (r5 != 0) goto L37
        L35:
            r5 = r7
            goto L90
        L37:
            if (r5 != 0) goto L3a
            goto L53
        L3a:
            int r5 = r5.size()
            int r5 = r5 - r6
        L3f:
            if (r5 < 0) goto L53
            java.lang.Object r8 = r4.L
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r5)
            xo6 r8 = (defpackage.xo6) r8
            int r9 = r8.A
            if (r9 != r3) goto L50
            goto L54
        L50:
            int r5 = r5 + (-1)
            goto L3f
        L53:
            r8 = 0
        L54:
            if (r8 == 0) goto L5d
            java.lang.Object r5 = r4.L
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.remove(r8)
        L5d:
            java.lang.Object r5 = r4.L
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r8 = 0
        L66:
            if (r8 >= r5) goto L7a
            java.lang.Object r9 = r4.L
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r8)
            xo6 r9 = (defpackage.xo6) r9
            int r9 = r9.A
            if (r9 < r3) goto L77
            goto L7b
        L77:
            int r8 = r8 + 1
            goto L66
        L7a:
            r8 = r7
        L7b:
            if (r8 == r7) goto L35
            java.lang.Object r5 = r4.L
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r8)
            xo6 r5 = (defpackage.xo6) r5
            java.lang.Object r9 = r4.L
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.remove(r8)
            int r5 = r5.A
        L90:
            java.lang.Object r8 = r4.B
            int[] r8 = (int[]) r8
            if (r5 != r7) goto La0
            int r5 = r8.length
            java.util.Arrays.fill(r8, r3, r5, r7)
            java.lang.Object r5 = r4.B
            int[] r5 = (int[]) r5
            int r5 = r5.length
            goto Lad
        La0:
            int r5 = r5 + r6
            int r8 = r8.length
            int r5 = java.lang.Math.min(r5, r8)
            java.lang.Object r8 = r4.B
            int[] r8 = (int[]) r8
            java.util.Arrays.fill(r8, r3, r5, r7)
        Lad:
            if (r13 == r6) goto Lc0
            r5 = 2
            if (r13 == r5) goto Lbc
            if (r13 == r1) goto Lb5
            goto Lc3
        Lb5:
            r4.u(r11, r6)
            r4.t(r12, r6)
            goto Lc3
        Lbc:
            r4.u(r11, r12)
            goto Lc3
        Lc0:
            r4.t(r11, r12)
        Lc3:
            if (r2 > r0) goto Lc6
            goto Ld8
        Lc6:
            boolean r11 = r10.x
            if (r11 == 0) goto Lcf
            int r11 = r10.K0()
            goto Ld3
        Lcf:
            int r11 = r10.L0()
        Ld3:
            if (r3 > r11) goto Ld8
            r10.o0()
        Ld8:
            return
    }

    @Override // defpackage.gg5
    public final void P(int r5) {
            r4 = this;
            super.P(r5)
            r0 = 0
        L4:
            int r1 = r4.p
            if (r0 >= r1) goto L1f
            yz3[] r1 = r4.q
            r1 = r1[r0]
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.b = r2
        L15:
            int r2 = r1.c
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.c = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    public final android.view.View P0() {
            r15 = this;
            int r0 = r15.v()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r15.p
            r2.<init>(r3)
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r15.t
            r6 = -1
            if (r3 != r5) goto L1f
            boolean r3 = r15.Q0()
            if (r3 == 0) goto L1f
            r3 = r5
            goto L20
        L1f:
            r3 = r6
        L20:
            boolean r7 = r15.x
            if (r7 == 0) goto L26
            r0 = r6
            goto L27
        L26:
            r1 = r4
        L27:
            if (r1 >= r0) goto L2a
            r6 = r5
        L2a:
            if (r1 == r0) goto Lf8
            android.view.View r7 = r15.u(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            wo6 r8 = (defpackage.wo6) r8
            yz3 r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            ts1 r10 = r15.r
            if (r9 == 0) goto Lb6
            yz3 r9 = r8.e
            boolean r11 = r15.x
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L73
            int r11 = r9.c
            if (r11 == r12) goto L4f
            goto L54
        L4f:
            r9.a()
            int r11 = r9.c
        L54:
            int r12 = r10.i()
            if (r11 >= r12) goto Laf
            java.lang.Object r15 = r9.f
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            int r0 = r15.size()
            int r0 = r0 - r5
            java.lang.Object r15 = r15.get(r0)
            android.view.View r15 = (android.view.View) r15
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            wo6 r15 = (defpackage.wo6) r15
            r15.getClass()
            return r7
        L73:
            int r11 = r9.b
            java.lang.Object r13 = r9.f
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            if (r11 == r12) goto L7c
            goto L99
        L7c:
            java.lang.Object r11 = r13.get(r4)
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            wo6 r12 = (defpackage.wo6) r12
            java.lang.Object r14 = r9.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r14
            ts1 r14 = r14.r
            int r11 = r14.g(r11)
            r9.b = r11
            r12.getClass()
            int r11 = r9.b
        L99:
            int r9 = r10.m()
            if (r11 <= r9) goto Laf
            java.lang.Object r15 = r13.get(r4)
            android.view.View r15 = (android.view.View) r15
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            wo6 r15 = (defpackage.wo6) r15
            r15.getClass()
            return r7
        Laf:
            yz3 r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        Lb6:
            int r1 = r1 + r6
            if (r1 == r0) goto L2a
            android.view.View r9 = r15.u(r1)
            boolean r11 = r15.x
            if (r11 == 0) goto Lcf
            int r11 = r10.d(r7)
            int r10 = r10.d(r9)
            if (r11 >= r10) goto Lcc
            goto Lf7
        Lcc:
            if (r11 != r10) goto L2a
            goto Ldc
        Lcf:
            int r11 = r10.g(r7)
            int r10 = r10.g(r9)
            if (r11 <= r10) goto Lda
            goto Lf7
        Lda:
            if (r11 != r10) goto L2a
        Ldc:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            wo6 r9 = (defpackage.wo6) r9
            yz3 r8 = r8.e
            int r8 = r8.e
            yz3 r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto Lef
            r8 = r5
            goto Lf0
        Lef:
            r8 = r4
        Lf0:
            if (r3 >= 0) goto Lf4
            r9 = r5
            goto Lf5
        Lf4:
            r9 = r4
        Lf5:
            if (r8 == r9) goto L2a
        Lf7:
            return r7
        Lf8:
            r15 = 0
            return r15
    }

    @Override // defpackage.gg5
    public final void Q() {
            r2 = this;
            ap3 r0 = r2.B
            r0.n()
            r0 = 0
        L6:
            int r1 = r2.p
            if (r0 >= r1) goto L14
            yz3[] r1 = r2.q
            r1 = r1[r0]
            r1.b()
            int r0 = r0 + 1
            goto L6
        L14:
            return
    }

    public final boolean Q0() {
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

    public final void R0(android.view.View r6, int r7, int r8) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            android.graphics.Rect r1 = r5.G
            if (r0 != 0) goto Lb
            r0 = 0
            r1.set(r0, r0, r0, r0)
            goto L12
        Lb:
            android.graphics.Rect r0 = r0.O(r6)
            r1.set(r0)
        L12:
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            wo6 r0 = (defpackage.wo6) r0
            int r2 = r0.leftMargin
            int r3 = r1.left
            int r2 = r2 + r3
            int r3 = r0.rightMargin
            int r4 = r1.right
            int r3 = r3 + r4
            int r7 = d1(r7, r2, r3)
            int r2 = r0.topMargin
            int r3 = r1.top
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r1 = r1.bottom
            int r3 = r3 + r1
            int r8 = d1(r8, r2, r3)
            boolean r5 = r5.x0(r6, r7, r8, r0)
            if (r5 == 0) goto L3d
            r6.measure(r7, r8)
        L3d:
            return
    }

    @Override // defpackage.gg5
    public final void S(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.b
            if (r0 == 0) goto L9
            g15 r1 = r2.K
            r0.removeCallbacks(r1)
        L9:
            r0 = 0
        La:
            int r1 = r2.p
            if (r0 >= r1) goto L18
            yz3[] r1 = r2.q
            r1 = r1[r0]
            r1.b()
            int r0 = r0 + 1
            goto La
        L18:
            r3.requestLayout()
            return
    }

    public final void S0(defpackage.mg5 r18, defpackage.sg5 r19, boolean r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            yo6 r3 = r0.F
            r4 = -1
            vo6 r5 = r0.H
            if (r3 != 0) goto L11
            int r3 = r0.z
            if (r3 == r4) goto L1e
        L11:
            int r3 = r2.b()
            if (r3 != 0) goto L1e
            r17.j0(r18)
            r5.a()
            return
        L1e:
            boolean r3 = r5.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r5.g
            r7 = 0
            if (r3 == 0) goto L30
            int r3 = r0.z
            if (r3 != r4) goto L30
            yo6 r3 = r0.F
            if (r3 == 0) goto L2e
            goto L30
        L2e:
            r3 = r7
            goto L31
        L30:
            r3 = 1
        L31:
            yz3[] r9 = r0.q
            int r10 = r0.p
            ap3 r11 = r0.B
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L204
            r5.a()
            yo6 r13 = r0.F
            ts1 r14 = r0.r
            if (r13 == 0) goto Lbf
            int r15 = r13.L
            r8 = 0
            if (r15 <= 0) goto L82
            if (r15 != r10) goto L74
            r13 = r7
        L4c:
            if (r13 >= r10) goto L82
            r15 = r9[r13]
            r15.b()
            yo6 r15 = r0.F
            int[] r4 = r15.R
            r4 = r4[r13]
            if (r4 == r12) goto L6a
            boolean r15 = r15.e0
            if (r15 == 0) goto L65
            int r15 = r14.i()
        L63:
            int r4 = r4 + r15
            goto L6a
        L65:
            int r15 = r14.m()
            goto L63
        L6a:
            r15 = r9[r13]
            r15.b = r4
            r15.c = r4
            int r13 = r13 + 1
            r4 = -1
            goto L4c
        L74:
            r13.R = r8
            r13.L = r7
            r13.X = r7
            r13.Y = r8
            r13.Z = r8
            int r4 = r13.B
            r13.A = r4
        L82:
            yo6 r4 = r0.F
            boolean r13 = r4.f0
            r0.E = r13
            boolean r4 = r4.d0
            r0.c(r8)
            yo6 r8 = r0.F
            if (r8 == 0) goto L97
            boolean r13 = r8.d0
            if (r13 == r4) goto L97
            r8.d0 = r4
        L97:
            r0.w = r4
            r0.o0()
            r0.Y0()
            yo6 r4 = r0.F
            int r8 = r4.A
            r13 = -1
            if (r8 == r13) goto Lad
            r0.z = r8
            boolean r8 = r4.e0
            r5.c = r8
            goto Lb1
        Lad:
            boolean r8 = r0.x
            r5.c = r8
        Lb1:
            int r8 = r4.X
            r13 = 1
            if (r8 <= r13) goto Lc6
            int[] r8 = r4.Y
            r11.B = r8
            java.util.ArrayList r4 = r4.Z
            r11.L = r4
            goto Lc6
        Lbf:
            r0.Y0()
            boolean r4 = r0.x
            r5.c = r4
        Lc6:
            boolean r4 = r2.g
            if (r4 != 0) goto L1bc
            int r4 = r0.z
            r13 = -1
            if (r4 != r13) goto Ld1
            goto L1bc
        Ld1:
            if (r4 < 0) goto L1b8
            int r8 = r2.b()
            if (r4 < r8) goto Ldb
            goto L1b8
        Ldb:
            yo6 r4 = r0.F
            if (r4 == 0) goto Lf2
            int r8 = r4.A
            if (r8 == r13) goto Lf2
            int r4 = r4.L
            r13 = 1
            if (r4 >= r13) goto Le9
            goto Lf2
        Le9:
            r5.b = r12
            int r4 = r0.z
            r5.a = r4
        Lef:
            r13 = 1
            goto L202
        Lf2:
            int r4 = r0.z
            android.view.View r4 = r0.q(r4)
            if (r4 == 0) goto L169
            boolean r8 = r0.x
            if (r8 == 0) goto L103
            int r8 = r0.L0()
            goto L107
        L103:
            int r8 = r0.K0()
        L107:
            r5.a = r8
            int r8 = r0.A
            if (r8 == r12) goto L12f
            boolean r8 = r5.c
            if (r8 == 0) goto L120
            int r8 = r14.i()
            int r13 = r0.A
            int r8 = r8 - r13
            int r4 = r14.d(r4)
            int r8 = r8 - r4
            r5.b = r8
            goto Lef
        L120:
            int r8 = r14.m()
            int r13 = r0.A
            int r8 = r8 + r13
            int r4 = r14.g(r4)
            int r8 = r8 - r4
            r5.b = r8
            goto Lef
        L12f:
            int r8 = r14.e(r4)
            int r13 = r14.n()
            if (r8 <= r13) goto L149
            boolean r4 = r5.c
            if (r4 == 0) goto L142
            int r4 = r14.i()
            goto L146
        L142:
            int r4 = r14.m()
        L146:
            r5.b = r4
            goto Lef
        L149:
            int r8 = r14.g(r4)
            int r13 = r14.m()
            int r8 = r8 - r13
            if (r8 >= 0) goto L158
            int r4 = -r8
            r5.b = r4
            goto Lef
        L158:
            int r8 = r14.i()
            int r4 = r14.d(r4)
            int r8 = r8 - r4
            if (r8 >= 0) goto L166
            r5.b = r8
            goto Lef
        L166:
            r5.b = r12
            goto Lef
        L169:
            int r4 = r0.z
            r5.a = r4
            int r8 = r0.A
            if (r8 != r12) goto L19f
            int r8 = r0.v()
            if (r8 != 0) goto L17c
            boolean r4 = r0.x
            if (r4 == 0) goto L189
            goto L18b
        L17c:
            int r8 = r0.K0()
            if (r4 >= r8) goto L184
            r4 = 1
            goto L185
        L184:
            r4 = r7
        L185:
            boolean r8 = r0.x
            if (r4 == r8) goto L18b
        L189:
            r4 = r7
            goto L18c
        L18b:
            r4 = 1
        L18c:
            r5.c = r4
            ts1 r8 = r6.r
            if (r4 == 0) goto L197
            int r4 = r8.i()
            goto L19b
        L197:
            int r4 = r8.m()
        L19b:
            r5.b = r4
        L19d:
            r13 = 1
            goto L1b5
        L19f:
            boolean r4 = r5.c
            ts1 r13 = r6.r
            if (r4 == 0) goto L1ad
            int r4 = r13.i()
            int r4 = r4 - r8
            r5.b = r4
            goto L19d
        L1ad:
            int r4 = r13.m()
            int r4 = r4 + r8
            r5.b = r4
            goto L19d
        L1b5:
            r5.d = r13
            goto L202
        L1b8:
            r0.z = r13
            r0.A = r12
        L1bc:
            boolean r4 = r0.D
            if (r4 == 0) goto L1e0
            int r4 = r2.b()
            int r8 = r0.v()
            r16 = 1
            int r8 = r8 + (-1)
        L1cc:
            if (r8 < 0) goto L1de
            android.view.View r13 = r0.u(r8)
            int r13 = defpackage.gg5.G(r13)
            if (r13 < 0) goto L1db
            if (r13 >= r4) goto L1db
            goto L1fc
        L1db:
            int r8 = r8 + (-1)
            goto L1cc
        L1de:
            r13 = r7
            goto L1fc
        L1e0:
            int r4 = r2.b()
            int r8 = r0.v()
            r13 = r7
        L1e9:
            if (r13 >= r8) goto L1de
            android.view.View r14 = r0.u(r13)
            int r14 = defpackage.gg5.G(r14)
            if (r14 < 0) goto L1f9
            if (r14 >= r4) goto L1f9
            r13 = r14
            goto L1fc
        L1f9:
            int r13 = r13 + 1
            goto L1e9
        L1fc:
            r5.a = r13
            r5.b = r12
            goto Lef
        L202:
            r5.e = r13
        L204:
            yo6 r4 = r0.F
            if (r4 != 0) goto L21c
            int r4 = r0.z
            r13 = -1
            if (r4 != r13) goto L21c
            boolean r4 = r5.c
            boolean r8 = r0.D
            if (r4 != r8) goto L21e
            boolean r4 = r0.Q0()
            boolean r8 = r0.E
            if (r4 == r8) goto L21c
            goto L21e
        L21c:
            r13 = 1
            goto L224
        L21e:
            r11.n()
            r13 = 1
            r5.d = r13
        L224:
            int r4 = r0.v()
            if (r4 <= 0) goto L2c1
            yo6 r4 = r0.F
            if (r4 == 0) goto L232
            int r4 = r4.L
            if (r4 >= r13) goto L2c1
        L232:
            boolean r4 = r5.d
            if (r4 == 0) goto L24b
            r3 = r7
        L237:
            if (r3 >= r10) goto L2c1
            r4 = r9[r3]
            r4.b()
            int r4 = r5.b
            if (r4 == r12) goto L248
            r6 = r9[r3]
            r6.b = r4
            r6.c = r4
        L248:
            int r3 = r3 + 1
            goto L237
        L24b:
            if (r3 != 0) goto L265
            int[] r3 = r5.f
            if (r3 != 0) goto L252
            goto L265
        L252:
            r3 = r7
        L253:
            if (r3 >= r10) goto L2c1
            r4 = r9[r3]
            r4.b()
            int[] r6 = r5.f
            r6 = r6[r3]
            r4.b = r6
            r4.c = r6
            int r3 = r3 + 1
            goto L253
        L265:
            r3 = r7
        L266:
            if (r3 >= r10) goto L2a2
            r4 = r9[r3]
            boolean r8 = r0.x
            int r11 = r5.b
            java.lang.Object r13 = r4.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r13
            if (r8 == 0) goto L279
            int r14 = r4.i(r12)
            goto L27d
        L279:
            int r14 = r4.k(r12)
        L27d:
            r4.b()
            if (r14 != r12) goto L283
            goto L29f
        L283:
            if (r8 == 0) goto L28d
            ts1 r15 = r13.r
            int r15 = r15.i()
            if (r14 < r15) goto L29f
        L28d:
            if (r8 != 0) goto L298
            ts1 r8 = r13.r
            int r8 = r8.m()
            if (r14 <= r8) goto L298
            goto L29f
        L298:
            if (r11 == r12) goto L29b
            int r14 = r14 + r11
        L29b:
            r4.c = r14
            r4.b = r14
        L29f:
            int r3 = r3 + 1
            goto L266
        L2a2:
            int r3 = r9.length
            int[] r4 = r5.f
            if (r4 == 0) goto L2aa
            int r4 = r4.length
            if (r4 >= r3) goto L2b1
        L2aa:
            yz3[] r4 = r6.q
            int r4 = r4.length
            int[] r4 = new int[r4]
            r5.f = r4
        L2b1:
            r4 = r7
        L2b2:
            if (r4 >= r3) goto L2c1
            int[] r6 = r5.f
            r8 = r9[r4]
            int r8 = r8.k(r12)
            r6[r4] = r8
            int r4 = r4 + 1
            goto L2b2
        L2c1:
            r17.p(r18)
            rn3 r3 = r0.v
            r3.a = r7
            ts1 r4 = r0.s
            int r6 = r4.n()
            int r8 = r6 / r10
            r0.u = r8
            int r8 = r4.k()
            android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            int r6 = r5.a
            r0.b1(r6, r2)
            boolean r6 = r5.c
            if (r6 == 0) goto L2f8
            r13 = -1
            r0.a1(r13)
            r0.F0(r1, r3, r2)
            r6 = 1
            r0.a1(r6)
            int r8 = r5.a
            int r9 = r3.d
            int r8 = r8 + r9
            r3.c = r8
            r0.F0(r1, r3, r2)
            goto L30d
        L2f8:
            r6 = 1
            r13 = -1
            r0.a1(r6)
            r0.F0(r1, r3, r2)
            r0.a1(r13)
            int r6 = r5.a
            int r8 = r3.d
            int r6 = r6 + r8
            r3.c = r6
            r0.F0(r1, r3, r2)
        L30d:
            int r3 = r4.k()
            r6 = 1073741824(0x40000000, float:2.0)
            if (r3 != r6) goto L317
            goto L3a6
        L317:
            int r3 = r0.v()
            r6 = 0
            r8 = r7
        L31d:
            if (r8 >= r3) goto L33d
            android.view.View r9 = r0.u(r8)
            int r11 = r4.e(r9)
            float r11 = (float) r11
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 >= 0) goto L32d
            goto L33a
        L32d:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            wo6 r9 = (defpackage.wo6) r9
            r9.getClass()
            float r6 = java.lang.Math.max(r6, r11)
        L33a:
            int r8 = r8 + 1
            goto L31d
        L33d:
            int r8 = r0.u
            float r9 = (float) r10
            float r6 = r6 * r9
            int r6 = java.lang.Math.round(r6)
            int r9 = r4.k()
            if (r9 != r12) goto L353
            int r9 = r4.n()
            int r6 = java.lang.Math.min(r6, r9)
        L353:
            int r9 = r6 / r10
            r0.u = r9
            int r4 = r4.k()
            android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            int r4 = r0.u
            if (r4 != r8) goto L363
            goto L3a6
        L363:
            r4 = r7
        L364:
            if (r4 >= r3) goto L3a6
            android.view.View r6 = r0.u(r4)
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            wo6 r9 = (defpackage.wo6) r9
            r9.getClass()
            boolean r11 = r0.Q0()
            int r12 = r0.t
            if (r11 == 0) goto L38f
            r13 = 1
            if (r12 != r13) goto L38f
            int r11 = r10 + (-1)
            yz3 r9 = r9.e
            int r9 = r9.e
            int r11 = r11 - r9
            int r9 = -r11
            int r11 = r0.u
            int r11 = r11 * r9
            int r9 = r9 * r8
            int r11 = r11 - r9
            r6.offsetLeftAndRight(r11)
            goto L3a3
        L38f:
            yz3 r9 = r9.e
            int r9 = r9.e
            int r11 = r0.u
            int r11 = r11 * r9
            int r9 = r9 * r8
            r13 = 1
            if (r12 != r13) goto L39f
            int r11 = r11 - r9
            r6.offsetLeftAndRight(r11)
            goto L3a3
        L39f:
            int r11 = r11 - r9
            r6.offsetTopAndBottom(r11)
        L3a3:
            int r4 = r4 + 1
            goto L364
        L3a6:
            int r3 = r0.v()
            if (r3 <= 0) goto L3c0
            boolean r3 = r0.x
            if (r3 == 0) goto L3b8
            r13 = 1
            r0.I0(r1, r2, r13)
            r0.J0(r1, r2, r7)
            goto L3c1
        L3b8:
            r13 = 1
            r0.J0(r1, r2, r13)
            r0.I0(r1, r2, r7)
            goto L3c1
        L3c0:
            r13 = 1
        L3c1:
            if (r20 == 0) goto L3e8
            boolean r3 = r2.g
            if (r3 != 0) goto L3e8
            int r3 = r0.C
            if (r3 == 0) goto L3e8
            int r3 = r0.v()
            if (r3 <= 0) goto L3e8
            android.view.View r3 = r0.P0()
            if (r3 == 0) goto L3e8
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 == 0) goto L3e0
            g15 r4 = r0.K
            r3.removeCallbacks(r4)
        L3e0:
            boolean r3 = r0.D0()
            if (r3 == 0) goto L3e8
            r8 = r13
            goto L3e9
        L3e8:
            r8 = r7
        L3e9:
            boolean r3 = r2.g
            if (r3 == 0) goto L3f0
            r5.a()
        L3f0:
            boolean r3 = r5.c
            r0.D = r3
            boolean r3 = r0.Q0()
            r0.E = r3
            if (r8 == 0) goto L402
            r5.a()
            r0.S0(r1, r2, r7)
        L402:
            return
    }

    @Override // defpackage.gg5
    public final android.view.View T(android.view.View r9, int r10, defpackage.mg5 r11, defpackage.sg5 r12) {
            r8 = this;
            int r0 = r8.v()
            r1 = 0
            if (r0 != 0) goto L9
            goto L146
        L9:
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            if (r0 != 0) goto Le
            goto L21
        Le:
            android.view.View r9 = r0.E(r9)
            if (r9 != 0) goto L15
            goto L21
        L15:
            dk0 r0 = r8.a
            java.lang.Object r0 = r0.B
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L22
        L21:
            r9 = r1
        L22:
            if (r9 != 0) goto L26
            goto L146
        L26:
            r8.Y0()
            int r0 = r8.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -1
            r4 = 1
            if (r10 == r4) goto L5e
            r5 = 2
            if (r10 == r5) goto L54
            r5 = 17
            if (r10 == r5) goto L51
            r5 = 33
            if (r10 == r5) goto L4d
            r5 = 66
            if (r10 == r5) goto L4a
            r5 = 130(0x82, float:1.82E-43)
            if (r10 == r5) goto L46
        L44:
            r10 = r2
            goto L68
        L46:
            if (r0 != r4) goto L44
        L48:
            r10 = r4
            goto L68
        L4a:
            if (r0 != 0) goto L44
            goto L48
        L4d:
            if (r0 != r4) goto L44
        L4f:
            r10 = r3
            goto L68
        L51:
            if (r0 != 0) goto L44
        L53:
            goto L4f
        L54:
            if (r0 != r4) goto L57
            goto L48
        L57:
            boolean r10 = r8.Q0()
            if (r10 == 0) goto L48
            goto L4f
        L5e:
            if (r0 != r4) goto L61
            goto L53
        L61:
            boolean r10 = r8.Q0()
            if (r10 == 0) goto L4f
            goto L48
        L68:
            if (r10 != r2) goto L6c
            goto L146
        L6c:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            wo6 r0 = (defpackage.wo6) r0
            r0.getClass()
            yz3 r0 = r0.e
            if (r10 != r4) goto L7e
            int r2 = r8.L0()
            goto L82
        L7e:
            int r2 = r8.K0()
        L82:
            r8.b1(r2, r12)
            r8.a1(r10)
            rn3 r5 = r8.v
            int r6 = r5.d
            int r6 = r6 + r2
            r5.c = r6
            ts1 r6 = r8.r
            int r6 = r6.n()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.b = r6
            r5.h = r4
            r6 = 0
            r5.a = r6
            r8.F0(r11, r5, r12)
            boolean r11 = r8.x
            r8.D = r11
            android.view.View r11 = r0.j(r2, r10)
            if (r11 == 0) goto Lb2
            if (r11 == r9) goto Lb2
            return r11
        Lb2:
            boolean r11 = r8.T0(r10)
            yz3[] r12 = r8.q
            int r5 = r8.p
            if (r11 == 0) goto Lce
            int r11 = r5 + (-1)
        Lbe:
            if (r11 < 0) goto Ldf
            r7 = r12[r11]
            android.view.View r7 = r7.j(r2, r10)
            if (r7 == 0) goto Lcb
            if (r7 == r9) goto Lcb
            return r7
        Lcb:
            int r11 = r11 + (-1)
            goto Lbe
        Lce:
            r11 = r6
        Lcf:
            if (r11 >= r5) goto Ldf
            r7 = r12[r11]
            android.view.View r7 = r7.j(r2, r10)
            if (r7 == 0) goto Ldc
            if (r7 == r9) goto Ldc
            return r7
        Ldc:
            int r11 = r11 + 1
            goto Lcf
        Ldf:
            boolean r11 = r8.w
            r11 = r11 ^ r4
            if (r10 != r3) goto Le6
            r2 = r4
            goto Le7
        Le6:
            r2 = r6
        Le7:
            if (r11 != r2) goto Leb
            r11 = r4
            goto Lec
        Leb:
            r11 = r6
        Lec:
            if (r11 == 0) goto Lf3
            int r2 = r0.e()
            goto Lf7
        Lf3:
            int r2 = r0.f()
        Lf7:
            android.view.View r2 = r8.q(r2)
            if (r2 == 0) goto L100
            if (r2 == r9) goto L100
            return r2
        L100:
            boolean r10 = r8.T0(r10)
            if (r10 == 0) goto L129
            int r5 = r5 - r4
        L107:
            if (r5 < 0) goto L146
            int r10 = r0.e
            if (r5 != r10) goto L10e
            goto L126
        L10e:
            if (r11 == 0) goto L117
            r10 = r12[r5]
            int r10 = r10.e()
            goto L11d
        L117:
            r10 = r12[r5]
            int r10 = r10.f()
        L11d:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L126
            if (r10 == r9) goto L126
            return r10
        L126:
            int r5 = r5 + (-1)
            goto L107
        L129:
            if (r6 >= r5) goto L146
            if (r11 == 0) goto L134
            r10 = r12[r6]
            int r10 = r10.e()
            goto L13a
        L134:
            r10 = r12[r6]
            int r10 = r10.f()
        L13a:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L143
            if (r10 == r9) goto L143
            return r10
        L143:
            int r6 = r6 + 1
            goto L129
        L146:
            return r1
    }

    public final boolean T0(int r5) {
            r4 = this;
            int r0 = r4.t
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L12
            if (r5 != r1) goto Lb
            r5 = r3
            goto Lc
        Lb:
            r5 = r2
        Lc:
            boolean r4 = r4.x
            if (r5 == r4) goto L11
            return r3
        L11:
            return r2
        L12:
            if (r5 != r1) goto L16
            r5 = r3
            goto L17
        L16:
            r5 = r2
        L17:
            boolean r0 = r4.x
            if (r5 != r0) goto L1d
            r5 = r3
            goto L1e
        L1d:
            r5 = r2
        L1e:
            boolean r4 = r4.Q0()
            if (r5 != r4) goto L25
            return r3
        L25:
            return r2
    }

    @Override // defpackage.gg5
    public final void U(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.U(r3)
            int r0 = r2.v()
            if (r0 <= 0) goto L2e
            r0 = 0
            android.view.View r1 = r2.H0(r0)
            android.view.View r2 = r2.G0(r0)
            if (r1 == 0) goto L2e
            if (r2 != 0) goto L17
            goto L2e
        L17:
            int r0 = defpackage.gg5.G(r1)
            int r2 = defpackage.gg5.G(r2)
            if (r0 >= r2) goto L28
            r3.setFromIndex(r0)
            r3.setToIndex(r2)
            return
        L28:
            r3.setFromIndex(r2)
            r3.setToIndex(r0)
        L2e:
            return
    }

    public final void U0(int r5, defpackage.sg5 r6) {
            r4 = this;
            r0 = 1
            if (r5 <= 0) goto L9
            int r1 = r4.L0()
            r2 = r0
            goto Le
        L9:
            int r1 = r4.K0()
            r2 = -1
        Le:
            rn3 r3 = r4.v
            r3.a = r0
            r4.b1(r1, r6)
            r4.a1(r2)
            int r4 = r3.d
            int r1 = r1 + r4
            r3.c = r1
            int r4 = java.lang.Math.abs(r5)
            r3.b = r4
            return
    }

    @Override // defpackage.gg5
    public final void V(defpackage.mg5 r1, defpackage.sg5 r2, defpackage.v2 r3) {
            r0 = this;
            super.V(r1, r2, r3)
            java.lang.String r0 = "androidx.recyclerview.widget.StaggeredGridLayoutManager"
            r3.i(r0)
            return
    }

    public final void V0(defpackage.mg5 r7, defpackage.rn3 r8) {
            r6 = this;
            boolean r0 = r8.a
            if (r0 == 0) goto L76
            boolean r0 = r8.i
            if (r0 == 0) goto La
            goto L76
        La:
            int r0 = r8.b
            int r1 = r8.e
            r2 = -1
            if (r0 != 0) goto L1f
            if (r1 != r2) goto L19
            int r8 = r8.g
            r6.W0(r7, r8)
            return
        L19:
            int r8 = r8.f
            r6.X0(r7, r8)
            return
        L1f:
            int r0 = r6.p
            yz3[] r3 = r6.q
            r4 = 1
            r5 = 0
            if (r1 != r2) goto L4e
            int r1 = r8.f
            r2 = r3[r5]
            int r2 = r2.k(r1)
        L2f:
            if (r4 >= r0) goto L3d
            r5 = r3[r4]
            int r5 = r5.k(r1)
            if (r5 <= r2) goto L3a
            r2 = r5
        L3a:
            int r4 = r4 + 1
            goto L2f
        L3d:
            int r1 = r1 - r2
            int r0 = r8.g
            if (r1 >= 0) goto L43
            goto L4a
        L43:
            int r8 = r8.b
            int r8 = java.lang.Math.min(r1, r8)
            int r0 = r0 - r8
        L4a:
            r6.W0(r7, r0)
            return
        L4e:
            int r1 = r8.g
            r2 = r3[r5]
            int r2 = r2.i(r1)
        L56:
            if (r4 >= r0) goto L64
            r5 = r3[r4]
            int r5 = r5.i(r1)
            if (r5 >= r2) goto L61
            r2 = r5
        L61:
            int r4 = r4 + 1
            goto L56
        L64:
            int r0 = r8.g
            int r2 = r2 - r0
            int r0 = r8.f
            if (r2 >= 0) goto L6c
            goto L73
        L6c:
            int r8 = r8.b
            int r8 = java.lang.Math.min(r2, r8)
            int r0 = r0 + r8
        L73:
            r6.X0(r7, r0)
        L76:
            return
    }

    @Override // defpackage.gg5
    public final void W(defpackage.mg5 r2, defpackage.sg5 r3, android.view.View r4, defpackage.v2 r5) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            boolean r3 = r2 instanceof defpackage.wo6
            if (r3 != 0) goto Lc
            r1.X(r4, r5)
            return
        Lc:
            wo6 r2 = (defpackage.wo6) r2
            yz3 r2 = r2.e
            r3 = 0
            r4 = 1
            r0 = -1
            int r1 = r1.t
            if (r1 != 0) goto L25
            if (r2 != 0) goto L1b
            r1 = r0
            goto L1d
        L1b:
            int r1 = r2.e
        L1d:
            u2 r1 = defpackage.u2.b(r3, r1, r4, r0, r0)
            r5.k(r1)
            return
        L25:
            if (r2 != 0) goto L29
            r1 = r0
            goto L2b
        L29:
            int r1 = r2.e
        L2b:
            u2 r1 = defpackage.u2.b(r3, r0, r0, r1, r4)
            r5.k(r1)
            return
    }

    public final void W0(defpackage.mg5 r9, int r10) {
            r8 = this;
            int r0 = r8.v()
            r1 = 1
            int r0 = r0 - r1
        L6:
            if (r0 < 0) goto L78
            android.view.View r2 = r8.u(r0)
            ts1 r3 = r8.r
            int r4 = r3.g(r2)
            if (r4 < r10) goto L78
            int r3 = r3.p(r2)
            if (r3 < r10) goto L78
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            wo6 r3 = (defpackage.wo6) r3
            r3.getClass()
            yz3 r4 = r3.e
            java.lang.Object r4 = r4.f
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r4 != r1) goto L30
            goto L78
        L30:
            yz3 r3 = r3.e
            java.lang.Object r4 = r3.f
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r6 = r5 + (-1)
            java.lang.Object r4 = r4.remove(r6)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            wo6 r6 = (defpackage.wo6) r6
            r7 = 0
            r6.e = r7
            wg5 r7 = r6.a
            boolean r7 = r7.h()
            if (r7 != 0) goto L5b
            wg5 r6 = r6.a
            boolean r6 = r6.k()
            if (r6 == 0) goto L6a
        L5b:
            int r6 = r3.d
            java.lang.Object r7 = r3.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r7
            ts1 r7 = r7.r
            int r4 = r7.e(r4)
            int r6 = r6 - r4
            r3.d = r6
        L6a:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r1) goto L70
            r3.b = r4
        L70:
            r3.c = r4
            r8.l0(r2, r9)
            int r0 = r0 + (-1)
            goto L6
        L78:
            return
    }

    public final void X0(defpackage.mg5 r7, int r8) {
            r6 = this;
        L0:
            int r0 = r6.v()
            if (r0 <= 0) goto L74
            r0 = 0
            android.view.View r1 = r6.u(r0)
            ts1 r2 = r6.r
            int r3 = r2.d(r1)
            if (r3 > r8) goto L74
            int r2 = r2.o(r1)
            if (r2 > r8) goto L74
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            wo6 r2 = (defpackage.wo6) r2
            r2.getClass()
            yz3 r3 = r2.e
            java.lang.Object r3 = r3.f
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L30
            goto L74
        L30:
            yz3 r2 = r2.e
            java.lang.Object r3 = r2.f
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r0 = r3.remove(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            wo6 r4 = (defpackage.wo6) r4
            r5 = 0
            r4.e = r5
            int r3 = r3.size()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L4f
            r2.c = r5
        L4f:
            wg5 r3 = r4.a
            boolean r3 = r3.h()
            if (r3 != 0) goto L5f
            wg5 r3 = r4.a
            boolean r3 = r3.k()
            if (r3 == 0) goto L6e
        L5f:
            int r3 = r2.d
            java.lang.Object r4 = r2.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r4
            ts1 r4 = r4.r
            int r0 = r4.e(r0)
            int r3 = r3 - r0
            r2.d = r3
        L6e:
            r2.b = r5
            r6.l0(r1, r7)
            goto L0
        L74:
            return
    }

    @Override // defpackage.gg5
    public final void Y(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.O0(r2, r3, r0)
            return
    }

    public final void Y0() {
            r2 = this;
            int r0 = r2.t
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.Q0()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.w
            r0 = r0 ^ r1
            r2.x = r0
            return
        L12:
            boolean r0 = r2.w
            r2.x = r0
            return
    }

    @Override // defpackage.gg5
    public final void Z() {
            r1 = this;
            ap3 r0 = r1.B
            r0.n()
            r1.o0()
            return
    }

    public final int Z0(int r4, defpackage.mg5 r5, defpackage.sg5 r6) {
            r3 = this;
            int r0 = r3.v()
            r1 = 0
            if (r0 == 0) goto L2d
            if (r4 != 0) goto La
            goto L2d
        La:
            r3.U0(r4, r6)
            rn3 r0 = r3.v
            int r6 = r3.F0(r5, r0, r6)
            int r2 = r0.b
            if (r2 >= r6) goto L18
            goto L1d
        L18:
            if (r4 >= 0) goto L1c
            int r4 = -r6
            goto L1d
        L1c:
            r4 = r6
        L1d:
            ts1 r6 = r3.r
            int r2 = -r4
            r6.q(r2)
            boolean r6 = r3.x
            r3.D = r6
            r0.b = r1
            r3.V0(r5, r0)
            return r4
        L2d:
            return r1
    }

    @Override // defpackage.rg5
    public final android.graphics.PointF a(int r4) {
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.K0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.t
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
    }

    @Override // defpackage.gg5
    public final void a0(int r2, int r3) {
            r1 = this;
            r0 = 8
            r1.O0(r2, r3, r0)
            return
    }

    public final void a1(int r4) {
            r3 = this;
            rn3 r0 = r3.v
            r0.e = r4
            boolean r3 = r3.x
            r1 = 1
            r2 = -1
            if (r4 != r2) goto Lc
            r4 = r1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            if (r3 != r4) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r0.d = r1
            return
    }

    @Override // defpackage.gg5
    public final void b0(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.O0(r2, r3, r0)
            return
    }

    public final void b1(int r6, defpackage.sg5 r7) {
            r5 = this;
            rn3 r0 = r5.v
            r1 = 0
            r0.b = r1
            r0.c = r6
            iv3 r2 = r5.e
            ts1 r3 = r5.r
            r4 = 1
            if (r2 == 0) goto L2d
            boolean r2 = r2.e
            if (r2 == 0) goto L2d
            int r7 = r7.a
            r2 = -1
            if (r7 == r2) goto L2d
            boolean r2 = r5.x
            if (r7 >= r6) goto L1d
            r6 = r4
            goto L1e
        L1d:
            r6 = r1
        L1e:
            if (r2 != r6) goto L26
            int r6 = r3.n()
            r7 = r1
            goto L2f
        L26:
            int r6 = r3.n()
            r7 = r6
            r6 = r1
            goto L2f
        L2d:
            r6 = r1
            r7 = r6
        L2f:
            androidx.recyclerview.widget.RecyclerView r5 = r5.b
            if (r5 == 0) goto L46
            boolean r5 = r5.g0
            if (r5 == 0) goto L46
            int r5 = r3.m()
            int r5 = r5 - r7
            r0.f = r5
            int r5 = r3.i()
            int r5 = r5 + r6
            r0.g = r5
            goto L50
        L46:
            int r5 = r3.h()
            int r5 = r5 + r6
            r0.g = r5
            int r5 = -r7
            r0.f = r5
        L50:
            r0.h = r1
            r0.a = r4
            int r5 = r3.k()
            if (r5 != 0) goto L61
            int r5 = r3.h()
            if (r5 != 0) goto L61
            r1 = r4
        L61:
            r0.i = r1
            return
    }

    @Override // defpackage.gg5
    public final void c(java.lang.String r2) {
            r1 = this;
            yo6 r0 = r1.F
            if (r0 != 0) goto L7
            super.c(r2)
        L7:
            return
    }

    @Override // defpackage.gg5
    public final void c0(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.O0(r2, r3, r0)
            return
    }

    public final void c1(defpackage.yz3 r6, int r7, int r8) {
            r5 = this;
            int r0 = r6.d
            int r1 = r6.e
            r2 = -1
            java.util.BitSet r5 = r5.y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r7 != r2) goto L39
            int r7 = r6.b
            if (r7 == r3) goto L11
            goto L32
        L11:
            java.lang.Object r7 = r6.f
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r4)
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            wo6 r2 = (defpackage.wo6) r2
            java.lang.Object r3 = r6.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r3
            ts1 r3 = r3.r
            int r7 = r3.g(r7)
            r6.b = r7
            r2.getClass()
            int r7 = r6.b
        L32:
            int r7 = r7 + r0
            if (r7 > r8) goto L49
            r5.set(r1, r4)
            return
        L39:
            int r7 = r6.c
            if (r7 == r3) goto L3e
            goto L43
        L3e:
            r6.a()
            int r7 = r6.c
        L43:
            int r7 = r7 - r0
            if (r7 < r8) goto L49
            r5.set(r1, r4)
        L49:
            return
    }

    @Override // defpackage.gg5
    public final boolean d() {
            r0 = this;
            int r0 = r0.t
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.gg5
    public final void d0(defpackage.mg5 r2, defpackage.sg5 r3) {
            r1 = this;
            r0 = 1
            r1.S0(r2, r3, r0)
            return
    }

    @Override // defpackage.gg5
    public final boolean e() {
            r1 = this;
            int r1 = r1.t
            r0 = 1
            if (r1 != r0) goto L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    @Override // defpackage.gg5
    public final void e0(defpackage.sg5 r1) {
            r0 = this;
            r1 = -1
            r0.z = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.A = r1
            r1 = 0
            r0.F = r1
            vo6 r0 = r0.H
            r0.a()
            return
    }

    @Override // defpackage.gg5
    public final boolean f(defpackage.hg5 r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.wo6
            return r0
    }

    @Override // defpackage.gg5
    public final void f0(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.yo6
            if (r0 == 0) goto L20
            yo6 r3 = (defpackage.yo6) r3
            r2.F = r3
            int r0 = r2.z
            r1 = -1
            if (r0 == r1) goto L1d
            r3.A = r1
            r3.B = r1
            r0 = 0
            r3.R = r0
            r1 = 0
            r3.L = r1
            r3.X = r1
            r3.Y = r0
            r3.Z = r0
        L1d:
            r2.o0()
        L20:
            return
    }

    @Override // defpackage.gg5
    public final android.os.Parcelable g0() {
            r7 = this;
            yo6 r0 = r7.F
            if (r0 == 0) goto L32
            yo6 r7 = new yo6
            r7.<init>()
            int r1 = r0.L
            r7.L = r1
            int r1 = r0.A
            r7.A = r1
            int r1 = r0.B
            r7.B = r1
            int[] r1 = r0.R
            r7.R = r1
            int r1 = r0.X
            r7.X = r1
            int[] r1 = r0.Y
            r7.Y = r1
            boolean r1 = r0.d0
            r7.d0 = r1
            boolean r1 = r0.e0
            r7.e0 = r1
            boolean r1 = r0.f0
            r7.f0 = r1
            java.util.ArrayList r0 = r0.Z
            r7.Z = r0
            return r7
        L32:
            yo6 r0 = new yo6
            r0.<init>()
            boolean r1 = r7.w
            r0.d0 = r1
            boolean r1 = r7.D
            r0.e0 = r1
            boolean r1 = r7.E
            r0.f0 = r1
            r1 = 0
            ap3 r2 = r7.B
            if (r2 == 0) goto L5a
            java.lang.Object r3 = r2.B
            int[] r3 = (int[]) r3
            if (r3 == 0) goto L5a
            r0.Y = r3
            int r3 = r3.length
            r0.X = r3
            java.lang.Object r2 = r2.L
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r0.Z = r2
            goto L5c
        L5a:
            r0.X = r1
        L5c:
            int r2 = r7.v()
            r3 = -1
            if (r2 <= 0) goto Lc0
            boolean r2 = r7.D
            if (r2 == 0) goto L6c
            int r2 = r7.L0()
            goto L70
        L6c:
            int r2 = r7.K0()
        L70:
            r0.A = r2
            boolean r2 = r7.x
            r4 = 1
            if (r2 == 0) goto L7c
            android.view.View r2 = r7.G0(r4)
            goto L80
        L7c:
            android.view.View r2 = r7.H0(r4)
        L80:
            if (r2 != 0) goto L83
            goto L87
        L83:
            int r3 = defpackage.gg5.G(r2)
        L87:
            r0.B = r3
            int r2 = r7.p
            r0.L = r2
            int[] r3 = new int[r2]
            r0.R = r3
        L91:
            if (r1 >= r2) goto Lbf
            boolean r3 = r7.D
            ts1 r4 = r7.r
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            yz3[] r6 = r7.q
            if (r3 == 0) goto Lab
            r3 = r6[r1]
            int r3 = r3.i(r5)
            if (r3 == r5) goto Lb8
            int r4 = r4.i()
        La9:
            int r3 = r3 - r4
            goto Lb8
        Lab:
            r3 = r6[r1]
            int r3 = r3.k(r5)
            if (r3 == r5) goto Lb8
            int r4 = r4.m()
            goto La9
        Lb8:
            int[] r4 = r0.R
            r4[r1] = r3
            int r1 = r1 + 1
            goto L91
        Lbf:
            return r0
        Lc0:
            r0.A = r3
            r0.B = r3
            r0.L = r1
            return r0
    }

    @Override // defpackage.gg5
    public final void h(int r7, int r8, defpackage.sg5 r9, defpackage.ls0 r10) {
            r6 = this;
            int r0 = r6.t
            if (r0 != 0) goto L5
            goto L6
        L5:
            r7 = r8
        L6:
            int r8 = r6.v()
            if (r8 == 0) goto L72
            if (r7 != 0) goto Lf
            goto L72
        Lf:
            r6.U0(r7, r9)
            int[] r7 = r6.J
            int r8 = r6.p
            if (r7 == 0) goto L1b
            int r7 = r7.length
            if (r7 >= r8) goto L1f
        L1b:
            int[] r7 = new int[r8]
            r6.J = r7
        L1f:
            r7 = 0
            r0 = r7
            r1 = r0
        L22:
            rn3 r2 = r6.v
            if (r0 >= r8) goto L4e
            int r3 = r2.d
            r4 = -1
            yz3[] r5 = r6.q
            if (r3 != r4) goto L37
            int r2 = r2.f
            r3 = r5[r0]
            int r3 = r3.k(r2)
            int r2 = r2 - r3
            goto L43
        L37:
            r3 = r5[r0]
            int r4 = r2.g
            int r3 = r3.i(r4)
            int r2 = r2.g
            int r2 = r3 - r2
        L43:
            if (r2 < 0) goto L4b
            int[] r3 = r6.J
            r3[r1] = r2
            int r1 = r1 + 1
        L4b:
            int r0 = r0 + 1
            goto L22
        L4e:
            int[] r8 = r6.J
            java.util.Arrays.sort(r8, r7, r1)
        L53:
            if (r7 >= r1) goto L72
            int r8 = r2.c
            if (r8 < 0) goto L72
            int r0 = r9.b()
            if (r8 >= r0) goto L72
            int r8 = r2.c
            int[] r0 = r6.J
            r0 = r0[r7]
            r10.a(r8, r0)
            int r8 = r2.c
            int r0 = r2.d
            int r8 = r8 + r0
            r2.c = r8
            int r7 = r7 + 1
            goto L53
        L72:
            return
    }

    @Override // defpackage.gg5
    public final void h0(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r0.D0()
        L5:
            return
    }

    @Override // defpackage.gg5
    public final int j(defpackage.sg5 r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.I
            r0 = r0 ^ 1
            android.view.View r3 = r7.H0(r0)
            android.view.View r4 = r7.G0(r0)
            boolean r6 = r7.I
            ts1 r2 = r7.r
            r5 = r7
            r1 = r8
            int r7 = defpackage.gi2.w(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // defpackage.gg5
    public final int k(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.E0(r1)
            return r0
    }

    @Override // defpackage.gg5
    public final int l(defpackage.sg5 r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.I
            r0 = r0 ^ 1
            android.view.View r3 = r7.H0(r0)
            android.view.View r4 = r7.G0(r0)
            boolean r6 = r7.I
            ts1 r2 = r7.r
            r5 = r7
            r1 = r8
            int r7 = defpackage.gi2.y(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // defpackage.gg5
    public final int m(defpackage.sg5 r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.I
            r0 = r0 ^ 1
            android.view.View r3 = r7.H0(r0)
            android.view.View r4 = r7.G0(r0)
            boolean r6 = r7.I
            ts1 r2 = r7.r
            r5 = r7
            r1 = r8
            int r7 = defpackage.gi2.w(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // defpackage.gg5
    public final int n(defpackage.sg5 r1) {
            r0 = this;
            int r0 = r0.E0(r1)
            return r0
    }

    @Override // defpackage.gg5
    public final int o(defpackage.sg5 r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.I
            r0 = r0 ^ 1
            android.view.View r3 = r7.H0(r0)
            android.view.View r4 = r7.G0(r0)
            boolean r6 = r7.I
            ts1 r2 = r7.r
            r5 = r7
            r1 = r8
            int r7 = defpackage.gi2.y(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // defpackage.gg5
    public final int p0(int r1, defpackage.mg5 r2, defpackage.sg5 r3) {
            r0 = this;
            int r0 = r0.Z0(r1, r2, r3)
            return r0
    }

    @Override // defpackage.gg5
    public final void q0(int r3) {
            r2 = this;
            yo6 r0 = r2.F
            if (r0 == 0) goto L13
            int r1 = r0.A
            if (r1 == r3) goto L13
            r1 = 0
            r0.R = r1
            r1 = 0
            r0.L = r1
            r1 = -1
            r0.A = r1
            r0.B = r1
        L13:
            r2.z = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.A = r3
            r2.o0()
            return
    }

    @Override // defpackage.gg5
    public final defpackage.hg5 r() {
            r2 = this;
            int r2 = r2.t
            r0 = -1
            r1 = -2
            if (r2 != 0) goto Lc
            wo6 r2 = new wo6
            r2.<init>(r1, r0)
            return r2
        Lc:
            wo6 r2 = new wo6
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.gg5
    public final int r0(int r1, defpackage.mg5 r2, defpackage.sg5 r3) {
            r0 = this;
            int r0 = r0.Z0(r1, r2, r3)
            return r0
    }

    @Override // defpackage.gg5
    public final defpackage.hg5 s(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            wo6 r0 = new wo6
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.gg5
    public final defpackage.hg5 t(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            wo6 r0 = new wo6
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        Lc:
            wo6 r0 = new wo6
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.gg5
    public final void u0(android.graphics.Rect r6, int r7, int r8) {
            r5 = this;
            int r0 = r5.D()
            int r1 = r5.E()
            int r1 = r1 + r0
            int r0 = r5.F()
            int r2 = r5.C()
            int r2 = r2 + r0
            int r0 = r5.t
            r3 = 1
            int r4 = r5.p
            if (r0 != r3) goto L39
            int r6 = r6.height()
            int r6 = r6 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            java.util.WeakHashMap r2 = defpackage.ao7.a
            int r0 = r0.getMinimumHeight()
            int r6 = defpackage.gg5.g(r8, r6, r0)
            int r8 = r5.u
            int r8 = r8 * r4
            int r8 = r8 + r1
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            int r0 = r0.getMinimumWidth()
            int r7 = defpackage.gg5.g(r7, r8, r0)
            goto L58
        L39:
            int r6 = r6.width()
            int r6 = r6 + r1
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            java.util.WeakHashMap r1 = defpackage.ao7.a
            int r0 = r0.getMinimumWidth()
            int r7 = defpackage.gg5.g(r7, r6, r0)
            int r6 = r5.u
            int r6 = r6 * r4
            int r6 = r6 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            int r0 = r0.getMinimumHeight()
            int r6 = defpackage.gg5.g(r8, r6, r0)
        L58:
            androidx.recyclerview.widget.RecyclerView r5 = r5.b
            androidx.recyclerview.widget.RecyclerView.g(r5, r7, r6)
            return
    }

    @Override // defpackage.gg5
    public final int x(defpackage.mg5 r2, defpackage.sg5 r3) {
            r1 = this;
            int r2 = r1.t
            r0 = 1
            if (r2 != r0) goto L10
            int r1 = r1.p
            int r2 = r3.b()
            int r1 = java.lang.Math.min(r1, r2)
            return r1
        L10:
            r1 = -1
            return r1
    }
}
