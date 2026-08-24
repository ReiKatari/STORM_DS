package com.google.android.material.carousel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends defpackage.gg5 implements defpackage.rg5 {
    public final defpackage.gv p;
    public defpackage.dl0 q;
    public final android.view.View.OnLayoutChangeListener r;

    public CarouselLayoutManager() {
            r3 = this;
            gv r0 = new gv
            r0.<init>()
            r3.<init>()
            cl0 r1 = new cl0
            r1.<init>()
            al0 r1 = new al0
            r2 = 0
            r1.<init>(r3, r2)
            r3.r = r1
            r3.p = r0
            r3.o0()
            r0 = 0
            r3.G0(r0)
            return
    }

    public CarouselLayoutManager(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            cl0 r3 = new cl0
            r3.<init>()
            al0 r3 = new al0
            r4 = 0
            r3.<init>(r0, r4)
            r0.r = r3
            gv r3 = new gv
            r3.<init>()
            r0.p = r3
            r0.o0()
            if (r2 == 0) goto L32
            int[] r3 = defpackage.a75.b
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3)
            r1.getInt(r4, r4)
            r0.o0()
            int r2 = r1.getInt(r4, r4)
            r0.G0(r2)
            r1.recycle()
        L32:
            return
    }

    @Override // defpackage.gg5
    public final void A0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            bl0 r0 = new bl0
            android.content.Context r2 = r2.getContext()
            r0.<init>(r1, r2)
            r0.a = r3
            r1.B0(r0)
            return
    }

    public final float D0(float r1, float r2) {
            r0 = this;
            boolean r0 = r0.F0()
            if (r0 == 0) goto L8
            float r1 = r1 - r2
            return r1
        L8:
            float r1 = r1 + r2
            return r1
    }

    public final boolean E0() {
            r0 = this;
            dl0 r0 = r0.q
            int r0 = r0.a
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean F0() {
            r1 = this;
            boolean r0 = r1.E0()
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView r1 = r1.b
            int r1 = r1.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L10
            return r0
        L10:
            r1 = 0
            return r1
    }

    public final void G0(int r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L10
            if (r3 != r0) goto L6
            goto L10
        L6:
            java.lang.String r2 = "invalid orientation:"
            java.lang.String r2 = defpackage.lb1.g(r3, r2)
            defpackage.i.h(r2)
            return
        L10:
            r1 = 0
            r2.c(r1)
            dl0 r1 = r2.q
            if (r1 == 0) goto L1e
            int r1 = r1.a
            if (r3 == r1) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            if (r3 == 0) goto L2f
            if (r3 != r0) goto L29
            dl0 r3 = new dl0
            r0 = 0
            r3.<init>(r2, r0)
            goto L34
        L29:
            java.lang.String r2 = "invalid orientation"
            defpackage.i.h(r2)
            return
        L2f:
            dl0 r3 = new dl0
            r3.<init>(r2, r0)
        L34:
            r2.q = r3
            r2.o0()
            return
    }

    @Override // defpackage.gg5
    public final boolean K() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.gg5
    public final void R(androidx.recyclerview.widget.RecyclerView r6) {
            r5 = this;
            android.content.Context r0 = r6.getContext()
            gv r1 = r5.p
            float r2 = r1.a
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto Le
            goto L19
        Le:
            android.content.res.Resources r2 = r0.getResources()
            r4 = 2131165432(0x7f0700f8, float:1.794508E38)
            float r2 = r2.getDimension(r4)
        L19:
            r1.a = r2
            float r2 = r1.b
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L22
            goto L2d
        L22:
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131165431(0x7f0700f7, float:1.7945079E38)
            float r2 = r0.getDimension(r2)
        L2d:
            r1.b = r2
            r5.o0()
            android.view.View$OnLayoutChangeListener r5 = r5.r
            r6.addOnLayoutChangeListener(r5)
            return
    }

    @Override // defpackage.gg5
    public final void S(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            android.view.View$OnLayoutChangeListener r0 = r0.r
            r1.removeOnLayoutChangeListener(r0)
            return
    }

    @Override // defpackage.gg5
    public final android.view.View T(android.view.View r5, int r6, defpackage.mg5 r7, defpackage.sg5 r8) {
            r4 = this;
            int r7 = r4.v()
            r8 = 0
            if (r7 != 0) goto L9
            goto L96
        L9:
            dl0 r7 = r4.q
            int r7 = r7.a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L47
            r3 = 2
            if (r6 == r3) goto L3d
            r3 = 17
            if (r6 == r3) goto L4c
            r3 = 33
            if (r6 == r3) goto L49
            r3 = 66
            if (r6 == r3) goto L3f
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L39:
            r6 = r0
            goto L55
        L3b:
            if (r7 != r2) goto L39
        L3d:
            r6 = r2
            goto L55
        L3f:
            if (r7 != 0) goto L39
            boolean r6 = r4.F0()
            if (r6 == 0) goto L3d
        L47:
            r6 = r1
            goto L55
        L49:
            if (r7 != r2) goto L39
            goto L47
        L4c:
            if (r7 != 0) goto L39
            boolean r6 = r4.F0()
            if (r6 == 0) goto L47
            goto L3d
        L55:
            if (r6 != r0) goto L58
            goto L96
        L58:
            r7 = 0
            if (r6 != r1) goto L8b
            int r5 = defpackage.gg5.G(r5)
            if (r5 != 0) goto L62
            goto L96
        L62:
            android.view.View r5 = r4.u(r7)
            int r5 = defpackage.gg5.G(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L7a
            int r6 = r4.B()
            if (r5 < r6) goto L74
            goto L7a
        L74:
            dl0 r4 = r4.q
            r4.a()
            throw r8
        L7a:
            boolean r5 = r4.F0()
            if (r5 == 0) goto L86
            int r5 = r4.v()
            int r7 = r5 + (-1)
        L86:
            android.view.View r4 = r4.u(r7)
            return r4
        L8b:
            int r5 = defpackage.gg5.G(r5)
            int r6 = r4.B()
            int r6 = r6 - r2
            if (r5 != r6) goto L97
        L96:
            return r8
        L97:
            int r5 = r4.v()
            int r5 = r5 - r2
            android.view.View r5 = r4.u(r5)
            int r5 = defpackage.gg5.G(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb4
            int r6 = r4.B()
            if (r5 < r6) goto Lae
            goto Lb4
        Lae:
            dl0 r4 = r4.q
            r4.a()
            throw r8
        Lb4:
            boolean r5 = r4.F0()
            if (r5 == 0) goto Lbb
            goto Lc1
        Lbb:
            int r5 = r4.v()
            int r7 = r5 + (-1)
        Lc1:
            android.view.View r4 = r4.u(r7)
            return r4
    }

    @Override // defpackage.gg5
    public final void U(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.U(r2)
            int r0 = r1.v()
            if (r0 <= 0) goto L26
            r0 = 0
            android.view.View r0 = r1.u(r0)
            int r0 = defpackage.gg5.G(r0)
            r2.setFromIndex(r0)
            int r0 = r1.v()
            int r0 = r0 + (-1)
            android.view.View r1 = r1.u(r0)
            int r1 = defpackage.gg5.G(r1)
            r2.setToIndex(r1)
        L26:
            return
    }

    @Override // defpackage.gg5
    public final void Y(int r1, int r2) {
            r0 = this;
            r0.B()
            return
    }

    @Override // defpackage.gg5
    public final void Z() {
            r0 = this;
            r0.B()
            return
    }

    @Override // defpackage.rg5
    public final android.graphics.PointF a(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.gg5
    public final void b0(int r1, int r2) {
            r0 = this;
            r0.B()
            return
    }

    @Override // defpackage.gg5
    public final boolean d() {
            r0 = this;
            boolean r0 = r0.E0()
            return r0
    }

    @Override // defpackage.gg5
    public final void d0(defpackage.mg5 r2, defpackage.sg5 r3) {
            r1 = this;
            int r3 = r3.b()
            if (r3 <= 0) goto L25
            boolean r3 = r1.E0()
            if (r3 == 0) goto Lf
            int r3 = r1.n
            goto L11
        Lf:
            int r3 = r1.o
        L11:
            float r3 = (float) r3
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L18
            goto L25
        L18:
            r1.F0()
            r1 = 0
            r2.e(r1)
            java.lang.String r1 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            defpackage.i.m(r1)
            return
        L25:
            r1.j0(r2)
            return
    }

    @Override // defpackage.gg5
    public final boolean e() {
            r0 = this;
            boolean r0 = r0.E0()
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.gg5
    public final void e0(defpackage.sg5 r1) {
            r0 = this;
            int r1 = r0.v()
            if (r1 != 0) goto L7
            return
        L7:
            r1 = 0
            android.view.View r0 = r0.u(r1)
            defpackage.gg5.G(r0)
            return
    }

    @Override // defpackage.gg5
    public final int j(defpackage.sg5 r1) {
            r0 = this;
            r0.v()
            r0 = 0
            return r0
    }

    @Override // defpackage.gg5
    public final int k(defpackage.sg5 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.gg5
    public final int l(defpackage.sg5 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.gg5
    public final int m(defpackage.sg5 r1) {
            r0 = this;
            r0.v()
            r0 = 0
            return r0
    }

    @Override // defpackage.gg5
    public final int n(defpackage.sg5 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.gg5
    public final boolean n0(androidx.recyclerview.widget.RecyclerView r1, android.view.View r2, android.graphics.Rect r3, boolean r4, boolean r5) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.gg5
    public final int o(defpackage.sg5 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.gg5
    public final int p0(int r2, defpackage.mg5 r3, defpackage.sg5 r4) {
            r1 = this;
            boolean r4 = r1.E0()
            r0 = 0
            if (r4 == 0) goto L1a
            int r1 = r1.v()
            if (r1 == 0) goto L1a
            if (r2 != 0) goto L10
            goto L1a
        L10:
            r3.e(r0)
            java.lang.String r1 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            defpackage.i.m(r1)
            r1 = 0
            return r1
        L1a:
            return r0
    }

    @Override // defpackage.gg5
    public final void q0(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.gg5
    public final defpackage.hg5 r() {
            r1 = this;
            hg5 r1 = new hg5
            r0 = -2
            r1.<init>(r0, r0)
            return r1
    }

    @Override // defpackage.gg5
    public final int r0(int r2, defpackage.mg5 r3, defpackage.sg5 r4) {
            r1 = this;
            boolean r4 = r1.e()
            r0 = 0
            if (r4 == 0) goto L1a
            int r1 = r1.v()
            if (r1 == 0) goto L1a
            if (r2 != 0) goto L10
            goto L1a
        L10:
            r3.e(r0)
            java.lang.String r1 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            defpackage.i.m(r1)
            r1 = 0
            return r1
        L1a:
            return r0
    }

    @Override // defpackage.gg5
    public final void y(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            super.y(r1, r2)
            r2.centerY()
            boolean r0 = r0.E0()
            if (r0 == 0) goto Lf
            r2.centerX()
        Lf:
            r0 = 0
            throw r0
    }
}
