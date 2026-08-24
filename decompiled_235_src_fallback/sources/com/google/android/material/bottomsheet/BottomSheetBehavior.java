package com.google.android.material.bottomsheet;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends defpackage.e51 implements defpackage.r14 {
    public final defpackage.k60 A;
    public final android.animation.ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public defpackage.ho7 O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public java.lang.ref.WeakReference W;
    public java.lang.ref.WeakReference X;
    public final java.util.ArrayList Y;
    public android.view.VelocityTracker Z;
    public final int a;
    public defpackage.v14 a0;
    public boolean b;
    public int b0;
    public final float c;
    public int c0;
    public final int d;
    public boolean d0;
    public int e;
    public java.util.HashMap e0;
    public boolean f;
    public final android.util.SparseIntArray f0;
    public int g;
    public final defpackage.h60 g0;
    public final int h;
    public final defpackage.p24 i;
    public final android.content.res.ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final defpackage.me6 y;
    public boolean z;

    public BottomSheetBehavior() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r0 = 1
            r3.b = r0
            r1 = -1
            r3.k = r1
            r3.l = r1
            k60 r2 = new k60
            r2.<init>(r3)
            r3.A = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r3.F = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.H = r2
            r3.K = r0
            r3.L = r0
            r0 = 4
            r3.N = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r3.S = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.Y = r0
            r3.c0 = r1
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r3.f0 = r0
            h60 r0 = new h60
            r1 = 0
            r0.<init>(r3, r1)
            r3.g0 = r0
            return
    }

    public BottomSheetBehavior(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            r12.<init>()
            r0 = 0
            r12.a = r0
            r1 = 1
            r12.b = r1
            r2 = -1
            r12.k = r2
            r12.l = r2
            k60 r3 = new k60
            r3.<init>(r12)
            r12.A = r3
            r3 = 1056964608(0x3f000000, float:0.5)
            r12.F = r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12.H = r4
            r12.K = r1
            r12.L = r1
            r5 = 4
            r12.N = r5
            r6 = 1036831949(0x3dcccccd, float:0.1)
            r12.S = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r12.Y = r6
            r12.c0 = r2
            android.util.SparseIntArray r6 = new android.util.SparseIntArray
            r6.<init>()
            r12.f0 = r6
            h60 r6 = new h60
            r6.<init>(r12, r0)
            r12.g0 = r6
            android.content.res.Resources r6 = r13.getResources()
            r7 = 2131166119(0x7f0703a7, float:1.7946474E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r12.h = r6
            int[] r6 = defpackage.a75.a
            android.content.res.TypedArray r6 = r13.obtainStyledAttributes(r14, r6)
            r7 = 3
            boolean r8 = r6.hasValue(r7)
            if (r8 == 0) goto L60
            android.content.res.ColorStateList r8 = defpackage.np2.S(r13, r6, r7)
            r12.j = r8
        L60:
            r8 = 22
            boolean r8 = r6.hasValue(r8)
            if (r8 == 0) goto L78
            r8 = 2130968713(0x7f040089, float:1.7546087E38)
            r9 = 2132018130(0x7f1403d2, float:1.9674558E38)
            le6 r14 = defpackage.me6.b(r13, r14, r8, r9)
            me6 r14 = r14.a()
            r12.y = r14
        L78:
            me6 r14 = r12.y
            if (r14 != 0) goto L7d
            goto La7
        L7d:
            p24 r8 = new p24
            r8.<init>(r14)
            r12.i = r8
            r8.k(r13)
            android.content.res.ColorStateList r14 = r12.j
            if (r14 == 0) goto L91
            p24 r8 = r12.i
            r8.n(r14)
            goto La7
        L91:
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            android.content.res.Resources$Theme r8 = r13.getTheme()
            r9 = 16842801(0x1010031, float:2.3693695E-38)
            r8.resolveAttribute(r9, r14, r1)
            p24 r8 = r12.i
            int r14 = r14.data
            r8.setTint(r14)
        La7:
            float r14 = r12.w()
            r8 = 2
            float[] r9 = new float[r8]
            r9[r0] = r14
            r14 = 1065353216(0x3f800000, float:1.0)
            r9[r1] = r14
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            r12.B = r9
            r10 = 500(0x1f4, double:2.47E-321)
            r9.setDuration(r10)
            android.animation.ValueAnimator r9 = r12.B
            f60 r10 = new f60
            r10.<init>(r12, r0)
            r9.addUpdateListener(r10)
            float r4 = r6.getDimension(r8, r4)
            r12.H = r4
            boolean r4 = r6.hasValue(r0)
            if (r4 == 0) goto Ldb
            int r4 = r6.getDimensionPixelSize(r0, r2)
            r12.k = r4
        Ldb:
            boolean r4 = r6.hasValue(r1)
            if (r4 == 0) goto Le7
            int r4 = r6.getDimensionPixelSize(r1, r2)
            r12.l = r4
        Le7:
            r4 = 10
            android.util.TypedValue r8 = r6.peekValue(r4)
            if (r8 == 0) goto Lf7
            int r8 = r8.data
            if (r8 != r2) goto Lf7
            r12.H(r8)
            goto Lfe
        Lf7:
            int r2 = r6.getDimensionPixelSize(r4, r2)
            r12.H(r2)
        Lfe:
            r2 = 9
            boolean r2 = r6.getBoolean(r2, r0)
            r12.G(r2)
            r2 = 14
            boolean r2 = r6.getBoolean(r2, r0)
            r12.n = r2
            r2 = 7
            boolean r2 = r6.getBoolean(r2, r1)
            boolean r4 = r12.b
            r8 = 6
            if (r4 != r2) goto L11a
            goto L139
        L11a:
            r12.b = r2
            java.lang.ref.WeakReference r2 = r12.W
            if (r2 == 0) goto L123
            r12.v()
        L123:
            boolean r2 = r12.b
            if (r2 == 0) goto L12c
            int r2 = r12.N
            if (r2 != r8) goto L12c
            goto L12e
        L12c:
            int r7 = r12.N
        L12e:
            r12.J(r7)
            int r2 = r12.N
            r12.N(r2, r1)
            r12.M()
        L139:
            r2 = 13
            boolean r2 = r6.getBoolean(r2, r0)
            r12.J = r2
            boolean r2 = r6.getBoolean(r5, r1)
            r12.K = r2
            r2 = 5
            boolean r2 = r6.getBoolean(r2, r1)
            r12.L = r2
            r2 = 11
            int r2 = r6.getInt(r2, r0)
            r12.a = r2
            r2 = 8
            float r2 = r6.getFloat(r2, r3)
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 0
            if (r3 <= 0) goto L1fa
            int r3 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r3 >= 0) goto L1fa
            r12.F = r2
            java.lang.ref.WeakReference r3 = r12.W
            if (r3 == 0) goto L174
            int r3 = r12.V
            float r3 = (float) r3
            float r14 = r14 - r2
            float r14 = r14 * r3
            int r14 = (int) r14
            r12.E = r14
        L174:
            android.util.TypedValue r14 = r6.peekValue(r8)
            java.lang.String r2 = "offset must be greater than or equal to 0"
            r3 = 16
            if (r14 == 0) goto L192
            int r5 = r14.type
            if (r5 != r3) goto L192
            int r14 = r14.data
            if (r14 < 0) goto L18e
            r12.C = r14
            int r14 = r12.N
            r12.N(r14, r1)
            goto L19f
        L18e:
            defpackage.i.h(r2)
            throw r4
        L192:
            int r14 = r6.getDimensionPixelOffset(r8, r0)
            if (r14 < 0) goto L1f6
            r12.C = r14
            int r14 = r12.N
            r12.N(r14, r1)
        L19f:
            r14 = 12
            r2 = 500(0x1f4, float:7.0E-43)
            int r14 = r6.getInt(r14, r2)
            r12.d = r14
            r14 = 18
            boolean r14 = r6.getBoolean(r14, r0)
            r12.o = r14
            r14 = 19
            boolean r14 = r6.getBoolean(r14, r0)
            r12.p = r14
            r14 = 20
            boolean r14 = r6.getBoolean(r14, r0)
            r12.q = r14
            r14 = 21
            boolean r14 = r6.getBoolean(r14, r1)
            r12.r = r14
            r14 = 15
            boolean r14 = r6.getBoolean(r14, r0)
            r12.s = r14
            boolean r14 = r6.getBoolean(r3, r0)
            r12.t = r14
            r14 = 17
            boolean r14 = r6.getBoolean(r14, r0)
            r12.u = r14
            r14 = 24
            boolean r14 = r6.getBoolean(r14, r1)
            r12.x = r14
            r6.recycle()
            android.view.ViewConfiguration r13 = android.view.ViewConfiguration.get(r13)
            int r13 = r13.getScaledMaximumFlingVelocity()
            float r13 = (float) r13
            r12.c = r13
            return
        L1f6:
            defpackage.i.h(r2)
            throw r4
        L1fa:
            java.lang.String r12 = "ratio must be a float value between 0 and 1"
            defpackage.i.h(r12)
            throw r4
    }

    public static com.google.android.material.bottomsheet.BottomSheetBehavior A(android.view.View r2) {
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r0 = r2 instanceof defpackage.h51
            r1 = 0
            if (r0 == 0) goto L1a
            h51 r2 = (defpackage.h51) r2
            e51 r2 = r2.a
            boolean r0 = r2 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L14
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            return r2
        L14:
            java.lang.String r2 = "The view is not associated with BottomSheetBehavior"
            defpackage.i.h(r2)
            return r1
        L1a:
            java.lang.String r2 = "The view is not a child of CoordinatorLayout"
            defpackage.i.h(r2)
            return r1
    }

    public static int B(int r0, int r1, int r2, int r3) {
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r0, r1, r3)
            r1 = -1
            if (r2 != r1) goto L8
            return r0
        L8:
            int r1 = android.view.View.MeasureSpec.getMode(r0)
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L22
            if (r0 != 0) goto L17
            goto L1b
        L17:
            int r2 = java.lang.Math.min(r0, r2)
        L1b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            return r0
        L22:
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            return r0
    }

    public static android.view.View z(android.view.View r3) {
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L7
            goto L29
        L7:
            boolean r0 = r3.isNestedScrollingEnabled()
            if (r0 == 0) goto Le
            return r3
        Le:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L29
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L19:
            if (r1 >= r0) goto L29
            android.view.View r2 = r3.getChildAt(r1)
            android.view.View r2 = z(r2)
            if (r2 == 0) goto L26
            return r2
        L26:
            int r1 = r1 + 1
            goto L19
        L29:
            r3 = 0
            return r3
    }

    public final int C() {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto L7
            int r1 = r1.D
            return r1
        L7:
            boolean r0 = r1.r
            if (r0 == 0) goto Ld
            r0 = 0
            goto Lf
        Ld:
            int r0 = r1.w
        Lf:
            int r1 = r1.C
            int r1 = java.lang.Math.max(r1, r0)
            return r1
    }

    public final int D(int r2) {
            r1 = this;
            r0 = 3
            if (r2 == r0) goto L20
            r0 = 4
            if (r2 == r0) goto L1d
            r0 = 5
            if (r2 == r0) goto L1a
            r0 = 6
            if (r2 != r0) goto Lf
            int r1 = r1.E
            return r1
        Lf:
            java.lang.String r1 = "Invalid state to get top offset: "
            java.lang.String r1 = defpackage.lb1.g(r2, r1)
            defpackage.i.h(r1)
            r1 = 0
            return r1
        L1a:
            int r1 = r1.V
            return r1
        L1d:
            int r1 = r1.G
            return r1
        L20:
            int r1 = r1.C()
            return r1
    }

    public final boolean E() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.W
            r1 = 0
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lc
            goto L20
        Lc:
            r0 = 2
            int[] r0 = new int[r0]
            java.lang.ref.WeakReference r2 = r2.W
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            r2.getLocationOnScreen(r0)
            r2 = 1
            r0 = r0[r2]
            if (r0 != 0) goto L20
            return r2
        L20:
            return r1
    }

    public final void F() {
            r1 = this;
            r0 = -1
            r1.b0 = r0
            r1.c0 = r0
            android.view.VelocityTracker r0 = r1.Z
            if (r0 == 0) goto Lf
            r0.recycle()
            r0 = 0
            r1.Z = r0
        Lf:
            return
    }

    public final void G(boolean r2) {
            r1 = this;
            boolean r0 = r1.I
            if (r0 == r2) goto L14
            r1.I = r2
            if (r2 != 0) goto L11
            int r2 = r1.N
            r0 = 5
            if (r2 != r0) goto L11
            r2 = 4
            r1.I(r2)
        L11:
            r1.M()
        L14:
            return
    }

    public final void H(int r3) {
            r2 = this;
            boolean r0 = r2.f
            r1 = -1
            if (r3 != r1) goto Lb
            if (r0 != 0) goto L12
            r3 = 1
            r2.f = r3
            goto L1c
        Lb:
            if (r0 != 0) goto L13
            int r0 = r2.e
            if (r0 == r3) goto L12
            goto L13
        L12:
            return
        L13:
            r0 = 0
            r2.f = r0
            int r3 = java.lang.Math.max(r0, r3)
            r2.e = r3
        L1c:
            r2.P()
            return
    }

    public final void I(int r4) {
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L6a
            r1 = 2
            if (r4 != r1) goto L7
            goto L6a
        L7:
            boolean r0 = r3.I
            if (r0 != 0) goto L22
            r0 = 5
            if (r4 != r0) goto L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot set state: "
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "BottomSheetBehavior"
            android.util.Log.w(r4, r3)
            return
        L22:
            r0 = 6
            if (r4 != r0) goto L33
            boolean r0 = r3.b
            if (r0 == 0) goto L33
            int r0 = r3.D(r4)
            int r1 = r3.D
            if (r0 > r1) goto L33
            r0 = 3
            goto L34
        L33:
            r0 = r4
        L34:
            java.lang.ref.WeakReference r1 = r3.W
            if (r1 == 0) goto L66
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L3f
            goto L66
        L3f:
            java.lang.ref.WeakReference r4 = r3.W
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            is r1 = new is
            r1.<init>(r3, r4, r0)
            android.view.ViewParent r3 = r4.getParent()
            if (r3 == 0) goto L62
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L62
            boolean r3 = r4.isAttachedToWindow()
            if (r3 == 0) goto L62
            r4.post(r1)
            return
        L62:
            r1.run()
            return
        L66:
            r3.J(r4)
            return
        L6a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "STATE_"
            r1.<init>(r2)
            if (r4 != r0) goto L78
            java.lang.String r4 = "DRAGGING"
            goto L7a
        L78:
            java.lang.String r4 = "SETTLING"
        L7a:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = defpackage.i61.n(r1, r4, r0)
            r3.<init>(r4)
            throw r3
    }

    public final void J(int r8) {
            r7 = this;
            int r0 = r7.N
            if (r0 != r8) goto L5
            goto L20
        L5:
            r7.N = r8
            r0 = 5
            r1 = 6
            r2 = 3
            r3 = 4
            if (r8 == r3) goto L13
            if (r8 == r2) goto L13
            if (r8 == r1) goto L13
            boolean r4 = r7.I
        L13:
            java.lang.ref.WeakReference r4 = r7.W
            if (r4 != 0) goto L18
            goto L20
        L18:
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L21
        L20:
            return
        L21:
            r5 = 0
            r6 = 1
            if (r8 != r2) goto L29
            r7.O(r6)
            goto L32
        L29:
            if (r8 == r1) goto L2f
            if (r8 == r0) goto L2f
            if (r8 != r3) goto L32
        L2f:
            r7.O(r5)
        L32:
            r7.N(r8, r6)
        L35:
            java.util.ArrayList r0 = r7.Y
            int r1 = r0.size()
            if (r5 >= r1) goto L49
            java.lang.Object r0 = r0.get(r5)
            i60 r0 = (defpackage.i60) r0
            r0.c(r4, r8)
            int r5 = r5 + 1
            goto L35
        L49:
            r7.M()
            return
    }

    public final boolean K(android.view.View r5, float r6) {
            r4 = this;
            boolean r0 = r4.J
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r5.getTop()
            int r2 = r4.G
            r3 = 0
            if (r0 >= r2) goto L10
            return r3
        L10:
            int r0 = r4.x()
            int r5 = r5.getTop()
            float r5 = (float) r5
            float r2 = r4.S
            float r6 = r6 * r2
            float r6 = r6 + r5
            int r4 = r4.G
            float r4 = (float) r4
            float r6 = r6 - r4
            float r4 = java.lang.Math.abs(r6)
            float r5 = (float) r0
            float r4 = r4 / r5
            r5 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L2e
            return r1
        L2e:
            return r3
    }

    public final void L(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            int r0 = r2.D(r4)
            ho7 r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.J(r3)
            r3 = 1
            r2.N(r4, r3)
            k60 r2 = r2.A
            r2.a(r4)
            return
        L40:
            r2.J(r4)
            return
    }

    public final void M() {
            r16 = this;
            r0 = r16
            java.lang.ref.WeakReference r1 = r0.W
            if (r1 == 0) goto L141
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L10
            goto L141
        L10:
            r2 = 524288(0x80000, float:7.34684E-40)
            defpackage.ao7.k(r1, r2)
            r2 = 0
            defpackage.ao7.i(r1, r2)
            r3 = 262144(0x40000, float:3.67342E-40)
            defpackage.ao7.k(r1, r3)
            defpackage.ao7.i(r1, r2)
            r3 = 1048576(0x100000, float:1.469368E-39)
            defpackage.ao7.k(r1, r3)
            defpackage.ao7.i(r1, r2)
            android.util.SparseIntArray r3 = r0.f0
            r4 = -1
            int r5 = r3.get(r2, r4)
            if (r5 == r4) goto L3b
            defpackage.ao7.k(r1, r5)
            defpackage.ao7.i(r1, r2)
            r3.delete(r2)
        L3b:
            boolean r5 = r0.b
            r6 = 2
            r7 = 6
            if (r5 != 0) goto Lef
            int r5 = r0.N
            if (r5 == r7) goto Lef
            r5 = 2131951737(0x7f130079, float:1.9539897E38)
            android.content.res.Resources r8 = r1.getResources()
            java.lang.String r12 = r8.getString(r5)
            zb r13 = new zb
            r13.<init>(r0, r7, r6)
            java.util.ArrayList r5 = defpackage.ao7.g(r1)
            r8 = r2
        L5a:
            int r9 = r5.size()
            if (r8 >= r9) goto L83
            java.lang.Object r9 = r5.get(r8)
            p2 r9 = (defpackage.p2) r9
            java.lang.Object r9 = r9.a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r9 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r9
            java.lang.CharSequence r9 = r9.getLabel()
            boolean r9 = android.text.TextUtils.equals(r12, r9)
            if (r9 == 0) goto L80
            java.lang.Object r5 = r5.get(r8)
            p2 r5 = (defpackage.p2) r5
            int r5 = r5.a()
            r11 = r5
            goto Lb1
        L80:
            int r8 = r8 + 1
            goto L5a
        L83:
            r9 = r2
            r8 = r4
        L85:
            int[] r10 = defpackage.ao7.d
            r11 = 32
            if (r9 >= r11) goto Lb0
            if (r8 != r4) goto Lb0
            r10 = r10[r9]
            r14 = r2
            r15 = 1
        L91:
            int r11 = r5.size()
            if (r14 >= r11) goto Laa
            java.lang.Object r11 = r5.get(r14)
            p2 r11 = (defpackage.p2) r11
            int r11 = r11.a()
            if (r11 == r10) goto La5
            r11 = 1
            goto La6
        La5:
            r11 = r2
        La6:
            r15 = r15 & r11
            int r14 = r14 + 1
            goto L91
        Laa:
            if (r15 == 0) goto Lad
            r8 = r10
        Lad:
            int r9 = r9 + 1
            goto L85
        Lb0:
            r11 = r8
        Lb1:
            if (r11 == r4) goto Lec
            p2 r9 = new p2
            r10 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            android.view.View$AccessibilityDelegate r4 = defpackage.ao7.e(r1)
            if (r4 != 0) goto Lc2
            r4 = 0
            goto Ld1
        Lc2:
            boolean r5 = r4 instanceof defpackage.a2
            if (r5 == 0) goto Lcb
            a2 r4 = (defpackage.a2) r4
            b2 r4 = r4.a
            goto Ld1
        Lcb:
            b2 r5 = new b2
            r5.<init>(r4)
            r4 = r5
        Ld1:
            if (r4 != 0) goto Ld8
            b2 r4 = new b2
            r4.<init>()
        Ld8:
            defpackage.ao7.n(r1, r4)
            int r4 = r9.a()
            defpackage.ao7.k(r1, r4)
            java.util.ArrayList r4 = defpackage.ao7.g(r1)
            r4.add(r9)
            defpackage.ao7.i(r1, r2)
        Lec:
            r3.put(r2, r11)
        Lef:
            boolean r2 = r0.I
            if (r2 == 0) goto L102
            int r2 = r0.N
            r3 = 5
            if (r2 == r3) goto L102
            p2 r2 = defpackage.p2.l
            zb r4 = new zb
            r4.<init>(r0, r3, r6)
            defpackage.ao7.l(r1, r2, r4)
        L102:
            int r2 = r0.N
            r3 = 4
            r4 = 3
            if (r2 == r4) goto L132
            if (r2 == r3) goto L122
            if (r2 == r7) goto L10d
            goto L141
        L10d:
            p2 r2 = defpackage.p2.k
            zb r5 = new zb
            r5.<init>(r0, r3, r6)
            defpackage.ao7.l(r1, r2, r5)
            p2 r2 = defpackage.p2.j
            zb r3 = new zb
            r3.<init>(r0, r4, r6)
            defpackage.ao7.l(r1, r2, r3)
            return
        L122:
            boolean r2 = r0.b
            if (r2 == 0) goto L127
            r7 = r4
        L127:
            p2 r2 = defpackage.p2.j
            zb r3 = new zb
            r3.<init>(r0, r7, r6)
            defpackage.ao7.l(r1, r2, r3)
            return
        L132:
            boolean r2 = r0.b
            if (r2 == 0) goto L137
            r7 = r3
        L137:
            p2 r2 = defpackage.p2.k
            zb r3 = new zb
            r3.<init>(r0, r7, r6)
            defpackage.ao7.l(r1, r2, r3)
        L141:
            return
    }

    public final void N(int r7, boolean r8) {
            r6 = this;
            r0 = 2
            if (r7 != r0) goto L5
            goto L71
        L5:
            int r7 = r6.N
            r1 = 3
            r2 = 0
            r3 = 1
            if (r7 != r1) goto L18
            boolean r7 = r6.x
            if (r7 != 0) goto L16
            boolean r7 = r6.E()
            if (r7 == 0) goto L18
        L16:
            r7 = r3
            goto L19
        L18:
            r7 = r2
        L19:
            boolean r1 = r6.z
            if (r1 == r7) goto L71
            p24 r1 = r6.i
            if (r1 != 0) goto L22
            goto L71
        L22:
            r6.z = r7
            android.animation.ValueAnimator r4 = r6.B
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L4d
            if (r4 == 0) goto L4d
            boolean r8 = r4.isRunning()
            if (r8 == 0) goto L36
            r4.reverse()
            return
        L36:
            n24 r8 = r1.B
            float r8 = r8.j
            if (r7 == 0) goto L40
            float r5 = r6.w()
        L40:
            float[] r6 = new float[r0]
            r6[r2] = r8
            r6[r3] = r5
            r4.setFloatValues(r6)
            r4.start()
            return
        L4d:
            if (r4 == 0) goto L58
            boolean r7 = r4.isRunning()
            if (r7 == 0) goto L58
            r4.cancel()
        L58:
            boolean r7 = r6.z
            if (r7 == 0) goto L60
            float r5 = r6.w()
        L60:
            n24 r6 = r1.B
            float r7 = r6.j
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L71
            r6.j = r5
            r1.Y = r3
            r1.Z = r3
            r1.invalidateSelf()
        L71:
            return
    }

    public final void O(boolean r7) {
            r6 = this;
            java.lang.ref.WeakReference r0 = r6.W
            if (r0 != 0) goto L5
            goto L4e
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r1 != 0) goto L14
            goto L4e
        L14:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            int r1 = r0.getChildCount()
            if (r7 == 0) goto L27
            java.util.HashMap r2 = r6.e0
            if (r2 != 0) goto L4e
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r6.e0 = r2
        L27:
            r2 = 0
        L28:
            if (r2 >= r1) goto L49
            android.view.View r3 = r0.getChildAt(r2)
            java.lang.ref.WeakReference r4 = r6.W
            java.lang.Object r4 = r4.get()
            if (r3 != r4) goto L37
            goto L46
        L37:
            if (r7 == 0) goto L46
            java.util.HashMap r4 = r6.e0
            int r5 = r3.getImportantForAccessibility()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r3, r5)
        L46:
            int r2 = r2 + 1
            goto L28
        L49:
            if (r7 != 0) goto L4e
            r7 = 0
            r6.e0 = r7
        L4e:
            return
    }

    public final void P() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.W
            if (r0 == 0) goto L19
            r2.v()
            int r0 = r2.N
            r1 = 4
            if (r0 != r1) goto L19
            java.lang.ref.WeakReference r2 = r2.W
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L19
            r2.requestLayout()
        L19:
            return
    }

    @Override // defpackage.r14
    public final void a() {
            r10 = this;
            v14 r0 = r10.a0
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r0.d
            int r2 = r0.c
            b00 r3 = r0.f
            r4 = 0
            r0.f = r4
            r4 = 4
            if (r3 == 0) goto L6f
            float r3 = r3.c
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 34
            if (r5 >= r6) goto L1a
            goto L6f
        L1a:
            boolean r5 = r10.I
            if (r5 == 0) goto L5c
            s7 r4 = new s7
            r5 = 2
            r4.<init>(r10, r5)
            android.view.View r10 = r0.b
            int r5 = r10.getHeight()
            float r5 = (float) r5
            float r6 = r10.getScaleY()
            float r6 = r6 * r5
            android.util.Property r5 = android.view.View.TRANSLATION_Y
            r7 = 1
            float[] r8 = new float[r7]
            r9 = 0
            r8[r9] = r6
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r5, r8)
            q92 r5 = new q92
            r5.<init>(r7)
            r10.setInterpolator(r5)
            int r1 = defpackage.vo.c(r3, r2, r1)
            long r1 = (long) r1
            r10.setDuration(r1)
            s7 r1 = new s7
            r2 = 6
            r1.<init>(r0, r2)
            r10.addListener(r1)
            r10.addListener(r4)
            r10.start()
            return
        L5c:
            android.animation.AnimatorSet r0 = r0.a()
            int r1 = defpackage.vo.c(r3, r2, r1)
            long r1 = (long) r1
            r0.setDuration(r1)
            r0.start()
            r10.I(r4)
            return
        L6f:
            boolean r0 = r10.I
            if (r0 == 0) goto L74
            r4 = 5
        L74:
            r10.I(r4)
            return
    }

    @Override // defpackage.r14
    public final void b(defpackage.b00 r3) {
            r2 = this;
            v14 r2 = r2.a0
            if (r2 != 0) goto L5
            goto L16
        L5:
            b00 r0 = r2.f
            if (r0 != 0) goto L10
            java.lang.String r0 = "MaterialBackHelper"
            java.lang.String r1 = "Must call startBackProgress() before updateBackProgress()"
            android.util.Log.w(r0, r1)
        L10:
            b00 r0 = r2.f
            r2.f = r3
            if (r0 != 0) goto L17
        L16:
            return
        L17:
            float r3 = r3.c
            r2.b(r3)
            return
    }

    @Override // defpackage.r14
    public final void c(defpackage.b00 r1) {
            r0 = this;
            v14 r0 = r0.a0
            if (r0 != 0) goto L5
            return
        L5:
            r0.f = r1
            return
    }

    @Override // defpackage.r14
    public final void d() {
            r3 = this;
            v14 r3 = r3.a0
            if (r3 != 0) goto L5
            goto L17
        L5:
            b00 r0 = r3.f
            if (r0 != 0) goto L10
            java.lang.String r0 = "MaterialBackHelper"
            java.lang.String r1 = "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()"
            android.util.Log.w(r0, r1)
        L10:
            b00 r0 = r3.f
            r1 = 0
            r3.f = r1
            if (r0 != 0) goto L18
        L17:
            return
        L18:
            android.animation.AnimatorSet r0 = r3.a()
            int r3 = r3.e
            long r1 = (long) r3
            r0.setDuration(r1)
            r0.start()
            return
    }

    @Override // defpackage.e51
    public final void g(defpackage.h51 r1) {
            r0 = this;
            r1 = 0
            r0.W = r1
            r0.O = r1
            r0.a0 = r1
            return
    }

    @Override // defpackage.e51
    public final void i() {
            r1 = this;
            r0 = 0
            r1.W = r0
            r1.O = r0
            r1.a0 = r0
            return
    }

    @Override // defpackage.e51
    public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld0
            boolean r0 = r9.K
            if (r0 != 0) goto Le
            goto Ld0
        Le:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L17
            r9.F()
        L17:
            android.view.VelocityTracker r3 = r9.Z
            if (r3 != 0) goto L21
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.Z = r3
        L21:
            android.view.VelocityTracker r3 = r9.Z
            r3.addMovement(r12)
            r3 = 0
            r4 = 2
            r5 = -1
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L31
            r11 = 3
            if (r0 == r11) goto L31
            goto L7d
        L31:
            r9.d0 = r1
            r9.b0 = r5
            boolean r11 = r9.P
            if (r11 == 0) goto L7d
            r9.P = r1
            return r1
        L3c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.c0 = r7
            int r8 = r9.N
            if (r8 == r4) goto L6c
            java.lang.ref.WeakReference r8 = r9.X
            if (r8 == 0) goto L57
            java.lang.Object r8 = r8.get()
            android.view.View r8 = (android.view.View) r8
            goto L58
        L57:
            r8 = r3
        L58:
            if (r8 == 0) goto L6c
            boolean r7 = r10.o(r8, r6, r7)
            if (r7 == 0) goto L6c
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.b0 = r7
            r9.d0 = r2
        L6c:
            int r7 = r9.b0
            if (r7 != r5) goto L7a
            int r7 = r9.c0
            boolean r11 = r10.o(r11, r6, r7)
            if (r11 != 0) goto L7a
            r11 = r2
            goto L7b
        L7a:
            r11 = r1
        L7b:
            r9.P = r11
        L7d:
            boolean r11 = r9.P
            if (r11 != 0) goto L8c
            ho7 r11 = r9.O
            if (r11 == 0) goto L8c
            boolean r11 = r11.p(r12)
            if (r11 == 0) goto L8c
            goto Lce
        L8c:
            java.lang.ref.WeakReference r11 = r9.X
            if (r11 == 0) goto L97
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L97:
            if (r0 != r4) goto Lcf
            if (r3 == 0) goto Lcf
            boolean r11 = r9.P
            if (r11 != 0) goto Lcf
            int r11 = r9.N
            if (r11 == r2) goto Lcf
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.o(r3, r11, r0)
            if (r10 != 0) goto Lcf
            ho7 r10 = r9.O
            if (r10 == 0) goto Lcf
            int r10 = r9.c0
            if (r10 == r5) goto Lcf
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            ho7 r9 = r9.O
            int r9 = r9.b
            float r9 = (float) r9
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 <= 0) goto Lcf
        Lce:
            return r2
        Lcf:
            return r1
        Ld0:
            r9.P = r2
            return r1
    }

    @Override // defpackage.e51
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10) {
            r7 = this;
            boolean r0 = r8.getFitsSystemWindows()
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r9.getFitsSystemWindows()
            if (r0 != 0) goto L10
            r9.setFitsSystemWindows(r1)
        L10:
            java.lang.ref.WeakReference r0 = r7.W
            r2 = 0
            if (r0 != 0) goto Lcb
            android.content.res.Resources r0 = r8.getResources()
            r3 = 2131165295(0x7f07006f, float:1.7944803E38)
            int r0 = r0.getDimensionPixelSize(r3)
            r7.g = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L32
            boolean r0 = r7.n
            if (r0 != 0) goto L32
            boolean r0 = r7.f
            if (r0 != 0) goto L32
            r0 = r1
            goto L33
        L32:
            r0 = r2
        L33:
            boolean r3 = r7.o
            if (r3 != 0) goto L4e
            boolean r3 = r7.p
            if (r3 != 0) goto L4e
            boolean r3 = r7.q
            if (r3 != 0) goto L4e
            boolean r3 = r7.s
            if (r3 != 0) goto L4e
            boolean r3 = r7.t
            if (r3 != 0) goto L4e
            boolean r3 = r7.u
            if (r3 != 0) goto L4e
            if (r0 != 0) goto L4e
            goto L8b
        L4e:
            g60 r3 = new g60
            r3.<init>(r0, r7)
            cq7 r0 = new cq7
            int r4 = r9.getPaddingStart()
            r9.getPaddingTop()
            int r5 = r9.getPaddingEnd()
            int r6 = r9.getPaddingBottom()
            r0.<init>()
            r0.a = r4
            r0.b = r5
            r0.c = r6
            rr6 r4 = new rr6
            r5 = 12
            r4.<init>(r5, r3, r0)
            java.util.WeakHashMap r0 = defpackage.ao7.a
            defpackage.sn7.c(r9, r4)
            boolean r0 = r9.isAttachedToWindow()
            if (r0 == 0) goto L83
            r9.requestApplyInsets()
            goto L8b
        L83:
            aq7 r0 = new aq7
            r0.<init>()
            r9.addOnAttachStateChangeListener(r0)
        L8b:
            f83 r0 = new f83
            r0.<init>(r9)
            defpackage.ao7.p(r9, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r9)
            r7.W = r0
            v14 r0 = new v14
            r0.<init>(r9)
            r7.a0 = r0
            p24 r0 = r7.i
            if (r0 == 0) goto Lb8
            r9.setBackground(r0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r7.H
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto Lb4
            float r4 = r9.getElevation()
        Lb4:
            r0.m(r4)
            goto Lbf
        Lb8:
            android.content.res.ColorStateList r0 = r7.j
            if (r0 == 0) goto Lbf
            r9.setBackgroundTintList(r0)
        Lbf:
            r7.M()
            int r0 = r9.getImportantForAccessibility()
            if (r0 != 0) goto Lcb
            r9.setImportantForAccessibility(r1)
        Lcb:
            ho7 r0 = r7.O
            if (r0 != 0) goto Ldc
            ho7 r0 = new ho7
            android.content.Context r3 = r8.getContext()
            h60 r4 = r7.g0
            r0.<init>(r3, r8, r4)
            r7.O = r0
        Ldc:
            int r0 = r9.getTop()
            r8.q(r9, r10)
            int r10 = r8.getWidth()
            r7.U = r10
            int r8 = r8.getHeight()
            r7.V = r8
            int r8 = r9.getHeight()
            r7.T = r8
            int r10 = r7.V
            int r8 = r10 - r8
            int r3 = r7.w
            if (r8 >= r3) goto L118
            r8 = -1
            boolean r4 = r7.r
            int r5 = r7.l
            if (r4 == 0) goto L10e
            if (r5 != r8) goto L107
            goto L10b
        L107:
            int r10 = java.lang.Math.min(r10, r5)
        L10b:
            r7.T = r10
            goto L118
        L10e:
            int r10 = r10 - r3
            if (r5 != r8) goto L112
            goto L116
        L112:
            int r10 = java.lang.Math.min(r10, r5)
        L116:
            r7.T = r10
        L118:
            int r8 = r7.V
            int r10 = r7.T
            int r8 = r8 - r10
            int r8 = java.lang.Math.max(r2, r8)
            r7.D = r8
            int r8 = r7.V
            float r8 = (float) r8
            r10 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7.F
            float r10 = r10 - r3
            float r10 = r10 * r8
            int r8 = (int) r10
            r7.E = r8
            r7.v()
            int r8 = r7.N
            r10 = 3
            if (r8 != r10) goto L141
            int r8 = r7.C()
            java.util.WeakHashMap r10 = defpackage.ao7.a
            r9.offsetTopAndBottom(r8)
            goto L175
        L141:
            r10 = 6
            if (r8 != r10) goto L14c
            int r8 = r7.E
            java.util.WeakHashMap r10 = defpackage.ao7.a
            r9.offsetTopAndBottom(r8)
            goto L175
        L14c:
            boolean r10 = r7.I
            if (r10 == 0) goto L15b
            r10 = 5
            if (r8 != r10) goto L15b
            int r8 = r7.V
            java.util.WeakHashMap r10 = defpackage.ao7.a
            r9.offsetTopAndBottom(r8)
            goto L175
        L15b:
            r10 = 4
            if (r8 != r10) goto L166
            int r8 = r7.G
            java.util.WeakHashMap r10 = defpackage.ao7.a
            r9.offsetTopAndBottom(r8)
            goto L175
        L166:
            if (r8 == r1) goto L16b
            r10 = 2
            if (r8 != r10) goto L175
        L16b:
            int r8 = r9.getTop()
            int r0 = r0 - r8
            java.util.WeakHashMap r8 = defpackage.ao7.a
            r9.offsetTopAndBottom(r0)
        L175:
            int r8 = r7.N
            r7.N(r8, r2)
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            android.view.View r10 = z(r9)
            r8.<init>(r10)
            r7.X = r8
        L185:
            java.util.ArrayList r8 = r7.Y
            int r10 = r8.size()
            if (r2 >= r10) goto L199
            java.lang.Object r8 = r8.get(r2)
            i60 r8 = (defpackage.i60) r8
            r8.a(r9)
            int r2 = r2 + 1
            goto L185
        L199:
            return r1
    }

    @Override // defpackage.e51
    public final boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            int r2 = r2 + r1
            int r1 = r0.leftMargin
            int r2 = r2 + r1
            int r1 = r0.rightMargin
            int r2 = r2 + r1
            int r2 = r2 + r7
            int r7 = r3.k
            int r1 = r0.width
            int r6 = B(r6, r2, r7, r1)
            int r7 = r4.getPaddingTop()
            int r4 = r4.getPaddingBottom()
            int r4 = r4 + r7
            int r7 = r0.topMargin
            int r4 = r4 + r7
            int r7 = r0.bottomMargin
            int r4 = r4 + r7
            int r3 = r3.l
            int r7 = r0.height
            int r3 = B(r8, r4, r3, r7)
            r5.measure(r6, r3)
            r3 = 1
            return r3
    }

    @Override // defpackage.e51
    public final boolean m(android.view.View r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.X
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.get()
            if (r2 != r0) goto L16
            int r2 = r1.N
            r0 = 3
            if (r2 == r0) goto L16
            boolean r1 = r1.M
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    @Override // defpackage.e51
    public final void n(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, android.view.View r8, int r9, int r10, int[] r11, int r12) {
            r5 = this;
            r6 = 1
            if (r12 != r6) goto L5
            goto L88
        L5:
            java.lang.ref.WeakReference r9 = r5.X
            if (r9 == 0) goto L10
            java.lang.Object r9 = r9.get()
            android.view.View r9 = (android.view.View) r9
            goto L11
        L10:
            r9 = 0
        L11:
            if (r8 == r9) goto L15
            goto L88
        L15:
            int r12 = r7.getTop()
            int r0 = r12 - r10
            boolean r1 = r5.K
            boolean r2 = r5.L
            if (r10 <= 0) goto L59
            boolean r3 = r5.R
            if (r3 != 0) goto L32
            if (r2 != 0) goto L32
            if (r8 != r9) goto L32
            boolean r8 = r8.canScrollVertically(r6)
            if (r8 == 0) goto L32
            r5.M = r6
            return
        L32:
            int r8 = r5.C()
            if (r0 >= r8) goto L4a
            int r8 = r5.C()
            int r12 = r12 - r8
            r11[r6] = r12
            int r8 = -r12
            java.util.WeakHashMap r9 = defpackage.ao7.a
            r7.offsetTopAndBottom(r8)
            r8 = 3
            r5.J(r8)
            goto L94
        L4a:
            if (r1 != 0) goto L4d
            goto L88
        L4d:
            r11[r6] = r10
            int r8 = -r10
            java.util.WeakHashMap r9 = defpackage.ao7.a
            r7.offsetTopAndBottom(r8)
            r5.J(r6)
            goto L94
        L59:
            if (r10 >= 0) goto L94
            r3 = -1
            boolean r3 = r8.canScrollVertically(r3)
            boolean r4 = r5.R
            if (r4 != 0) goto L6d
            if (r2 != 0) goto L6d
            if (r8 != r9) goto L6d
            if (r3 == 0) goto L6d
            r5.M = r6
            return
        L6d:
            if (r3 != 0) goto L94
            int r8 = r5.G
            if (r0 <= r8) goto L86
            boolean r9 = r5.I
            if (r9 == 0) goto L78
            goto L86
        L78:
            int r12 = r12 - r8
            r11[r6] = r12
            int r8 = -r12
            java.util.WeakHashMap r9 = defpackage.ao7.a
            r7.offsetTopAndBottom(r8)
            r8 = 4
            r5.J(r8)
            goto L94
        L86:
            if (r1 != 0) goto L89
        L88:
            return
        L89:
            r11[r6] = r10
            int r8 = -r10
            java.util.WeakHashMap r9 = defpackage.ao7.a
            r7.offsetTopAndBottom(r8)
            r5.J(r6)
        L94:
            int r7 = r7.getTop()
            r5.y(r7)
            r5.Q = r10
            r5.R = r6
            r6 = 0
            r5.M = r6
            return
    }

    @Override // defpackage.e51
    public final void o(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int[] r6) {
            r0 = this;
            return
    }

    @Override // defpackage.e51
    public final void q(android.view.View r6, android.os.Parcelable r7) {
            r5 = this;
            j60 r7 = (defpackage.j60) r7
            r6 = 4
            r0 = 2
            r1 = 1
            int r2 = r5.a
            if (r2 != 0) goto La
            goto L34
        La:
            r3 = -1
            if (r2 == r3) goto L11
            r4 = r2 & 1
            if (r4 != r1) goto L15
        L11:
            int r4 = r7.R
            r5.e = r4
        L15:
            if (r2 == r3) goto L1b
            r4 = r2 & 2
            if (r4 != r0) goto L1f
        L1b:
            boolean r4 = r7.X
            r5.b = r4
        L1f:
            if (r2 == r3) goto L25
            r4 = r2 & 4
            if (r4 != r6) goto L29
        L25:
            boolean r4 = r7.Y
            r5.I = r4
        L29:
            if (r2 == r3) goto L30
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto L34
        L30:
            boolean r2 = r7.Z
            r5.J = r2
        L34:
            int r7 = r7.L
            if (r7 == r1) goto L3e
            if (r7 != r0) goto L3b
            goto L3e
        L3b:
            r5.N = r7
            return
        L3e:
            r5.N = r6
            return
    }

    @Override // defpackage.e51
    public final android.os.Parcelable r(android.view.View r2) {
            r1 = this;
            j60 r2 = new j60
            android.view.AbsSavedState r0 = android.view.View.BaseSavedState.EMPTY_STATE
            r2.<init>(r1)
            return r2
    }

    @Override // defpackage.e51
    public final boolean s(android.view.View r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            r0.Q = r1
            r0.R = r1
            r0 = r2 & 2
            if (r0 == 0) goto Lb
            r0 = 1
            return r0
        Lb:
            return r1
    }

    @Override // defpackage.e51
    public final void t(android.view.View r4, android.view.View r5, int r6) {
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.C()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.J(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.X
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.R
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.Q
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.Z
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.Z
            int r0 = r3.b0
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.K(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.Q
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.b
            if (r2 == 0) goto L74
            int r6 = r3.D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.E
            if (r5 >= r2) goto L83
            int r0 = r3.G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.L(r4, r1, r5)
            r3.R = r5
        Lb5:
            return
    }

    @Override // defpackage.e51
    public final boolean u(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            boolean r0 = r6.isShown()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            int r0 = r7.getActionMasked()
            int r1 = r5.N
            r2 = 1
            if (r1 != r2) goto L14
            if (r0 != 0) goto L14
            return r2
        L14:
            ho7 r3 = r5.O
            boolean r4 = r5.K
            if (r3 == 0) goto L21
            if (r4 != 0) goto L1e
            if (r1 != r2) goto L21
        L1e:
            r3.j(r7)
        L21:
            if (r0 != 0) goto L26
            r5.F()
        L26:
            android.view.VelocityTracker r1 = r5.Z
            if (r1 != 0) goto L30
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r5.Z = r1
        L30:
            android.view.VelocityTracker r1 = r5.Z
            r1.addMovement(r7)
            ho7 r1 = r5.O
            if (r1 == 0) goto L66
            if (r4 != 0) goto L3f
            int r1 = r5.N
            if (r1 != r2) goto L66
        L3f:
            r1 = 2
            if (r0 != r1) goto L66
            boolean r0 = r5.P
            if (r0 != 0) goto L66
            int r0 = r5.c0
            float r0 = (float) r0
            float r1 = r7.getY()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            ho7 r1 = r5.O
            int r3 = r1.b
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L66
            int r0 = r7.getActionIndex()
            int r7 = r7.getPointerId(r0)
            r1.b(r6, r7)
        L66:
            boolean r5 = r5.P
            r5 = r5 ^ r2
            return r5
    }

    public final void v() {
            r3 = this;
            int r0 = r3.x()
            boolean r1 = r3.b
            int r2 = r3.V
            if (r1 == 0) goto L14
            int r2 = r2 - r0
            int r0 = r3.D
            int r0 = java.lang.Math.max(r2, r0)
            r3.G = r0
            return
        L14:
            int r2 = r2 - r0
            r3.G = r2
            return
    }

    public final float w() {
            r5 = this;
            r0 = 0
            p24 r1 = r5.i
            if (r1 == 0) goto L85
            java.lang.ref.WeakReference r2 = r5.W
            if (r2 == 0) goto L85
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L85
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L85
            java.lang.ref.WeakReference r2 = r5.W
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            boolean r5 = r5.E()
            if (r5 == 0) goto L85
            android.view.WindowInsets r5 = r2.getRootWindowInsets()
            if (r5 == 0) goto L85
            float[] r2 = r1.x0
            if (r2 == 0) goto L31
            r3 = 3
            r2 = r2[r3]
            goto L3f
        L31:
            n24 r2 = r1.B
            me6 r2 = r2.a
            f61 r2 = r2.e
            android.graphics.RectF r3 = r1.g()
            float r2 = r2.a(r3)
        L3f:
            android.view.RoundedCorner r3 = defpackage.ma.i(r5)
            if (r3 == 0) goto L54
            int r3 = defpackage.ma.b(r3)
            float r3 = (float) r3
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 <= 0) goto L54
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L54
            float r3 = r3 / r2
            goto L55
        L54:
            r3 = r0
        L55:
            float[] r2 = r1.x0
            if (r2 == 0) goto L5d
            r1 = 0
            r1 = r2[r1]
            goto L6b
        L5d:
            n24 r2 = r1.B
            me6 r2 = r2.a
            f61 r2 = r2.f
            android.graphics.RectF r1 = r1.g()
            float r1 = r2.a(r1)
        L6b:
            android.view.RoundedCorner r5 = defpackage.ma.A(r5)
            if (r5 == 0) goto L80
            int r5 = defpackage.ma.b(r5)
            float r5 = (float) r5
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L80
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L80
            float r0 = r5 / r1
        L80:
            float r5 = java.lang.Math.max(r3, r0)
            return r5
        L85:
            return r0
    }

    public final int x() {
            r3 = this;
            boolean r0 = r3.f
            if (r0 == 0) goto L1d
            int r0 = r3.g
            int r1 = r3.V
            int r2 = r3.U
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.T
            int r0 = java.lang.Math.min(r0, r1)
            int r3 = r3.v
        L1b:
            int r0 = r0 + r3
            return r0
        L1d:
            boolean r0 = r3.n
            if (r0 != 0) goto L33
            boolean r0 = r3.o
            if (r0 != 0) goto L33
            int r0 = r3.m
            if (r0 <= 0) goto L33
            int r1 = r3.e
            int r3 = r3.h
            int r0 = r0 + r3
            int r3 = java.lang.Math.max(r1, r0)
            return r3
        L33:
            int r0 = r3.e
            int r3 = r3.v
            goto L1b
    }

    public final void y(int r4) {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L33
            java.util.ArrayList r1 = r3.Y
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L33
            int r2 = r3.G
            if (r4 > r2) goto L20
            int r4 = r3.C()
            if (r2 != r4) goto L1d
            goto L20
        L1d:
            r3.C()
        L20:
            r3 = 0
        L21:
            int r4 = r1.size()
            if (r3 >= r4) goto L33
            java.lang.Object r4 = r1.get(r3)
            i60 r4 = (defpackage.i60) r4
            r4.b(r0)
            int r3 = r3 + 1
            goto L21
        L33:
            return
    }
}
