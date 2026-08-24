package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ep6  reason: default package */
/* loaded from: classes.dex */
public final class ep6 extends defpackage.t44 implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {
    public final android.content.Context B;
    public final defpackage.i44 L;
    public final defpackage.f44 R;
    public final boolean X;
    public final int Y;
    public final int Z;
    public final defpackage.z44 d0;
    public final defpackage.wr e0;
    public final defpackage.wh f0;
    public android.widget.PopupWindow.OnDismissListener g0;
    public android.view.View h0;
    public android.view.View i0;
    public defpackage.a54 j0;
    public android.view.ViewTreeObserver k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public int o0;
    public boolean p0;

    public ep6(android.content.Context r5, defpackage.i44 r6, android.view.View r7, int r8, boolean r9) {
            r4 = this;
            r4.<init>()
            wr r0 = new wr
            r1 = 3
            r0.<init>(r4, r1)
            r4.e0 = r0
            wh r0 = new wh
            r1 = 6
            r0.<init>(r4, r1)
            r4.f0 = r0
            r0 = 0
            r4.o0 = r0
            r4.B = r5
            r4.L = r6
            r4.X = r9
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            f44 r2 = new f44
            r3 = 2131623955(0x7f0e0013, float:1.8875076E38)
            r2.<init>(r6, r1, r9, r3)
            r4.R = r2
            r4.Z = r8
            android.content.res.Resources r9 = r5.getResources()
            android.util.DisplayMetrics r1 = r9.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r1 = r1 / 2
            r2 = 2131165207(0x7f070017, float:1.7944625E38)
            int r9 = r9.getDimensionPixelSize(r2)
            int r9 = java.lang.Math.max(r1, r9)
            r4.Y = r9
            r4.h0 = r7
            z44 r7 = new z44
            r9 = 0
            r7.<init>(r5, r9, r8, r0)
            r4.d0 = r7
            r6.b(r4, r5)
            return
    }

    @Override // defpackage.lh6
    public final boolean a() {
            r1 = this;
            boolean r0 = r1.l0
            if (r0 != 0) goto L10
            z44 r1 = r1.d0
            pr r1 = r1.v0
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // defpackage.b54
    public final boolean b(defpackage.it6 r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L8d
            v44 r2 = new v44
            android.view.View r5 = r9.i0
            int r7 = r9.Z
            r8 = 0
            android.content.Context r3 = r9.B
            boolean r6 = r9.X
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            a54 r10 = r9.j0
            r2.h = r10
            t44 r0 = r2.i
            if (r0 == 0) goto L21
            r0.g(r10)
        L21:
            java.util.ArrayList r10 = r4.f
            int r10 = r10.size()
            r0 = r1
        L28:
            r3 = 1
            if (r0 >= r10) goto L40
            android.view.MenuItem r5 = r4.getItem(r0)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L3d
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L3d
            r10 = r3
            goto L41
        L3d:
            int r0 = r0 + 1
            goto L28
        L40:
            r10 = r1
        L41:
            r2.g = r10
            t44 r0 = r2.i
            if (r0 == 0) goto L4a
            r0.o(r10)
        L4a:
            android.widget.PopupWindow$OnDismissListener r10 = r9.g0
            r2.j = r10
            r10 = 0
            r9.g0 = r10
            i44 r10 = r9.L
            r10.c(r1)
            z44 r10 = r9.d0
            int r0 = r10.Y
            int r10 = r10.m()
            int r5 = r9.o0
            android.view.View r6 = r9.h0
            int r6 = r6.getLayoutDirection()
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r5 = r5 & 7
            r6 = 5
            if (r5 != r6) goto L76
            android.view.View r5 = r9.h0
            int r5 = r5.getWidth()
            int r0 = r0 + r5
        L76:
            boolean r5 = r2.b()
            if (r5 == 0) goto L7d
            goto L85
        L7d:
            android.view.View r5 = r2.e
            if (r5 != 0) goto L82
            goto L8d
        L82:
            r2.d(r0, r10, r3, r3)
        L85:
            a54 r9 = r9.j0
            if (r9 == 0) goto L8c
            r9.M(r4)
        L8c:
            return r3
        L8d:
            return r1
    }

    @Override // defpackage.b54
    public final boolean c() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.b54
    public final void d(defpackage.i44 r2, boolean r3) {
            r1 = this;
            i44 r0 = r1.L
            if (r2 == r0) goto L5
            goto Lf
        L5:
            r1.dismiss()
            a54 r1 = r1.j0
            if (r1 == 0) goto Lf
            r1.d(r2, r3)
        Lf:
            return
    }

    @Override // defpackage.lh6
    public final void dismiss() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            z44 r1 = r1.d0
            r1.dismiss()
        Lb:
            return
    }

    @Override // defpackage.lh6
    public final void e() {
            r7 = this;
            boolean r0 = r7.a()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.l0
            if (r0 != 0) goto La9
            android.view.View r0 = r7.h0
            if (r0 == 0) goto La9
            r7.i0 = r0
            z44 r0 = r7.d0
            pr r1 = r0.v0
            pr r2 = r0.v0
            r1.setOnDismissListener(r7)
            r0.l0 = r7
            r1 = 1
            r0.u0 = r1
            r2.setFocusable(r1)
            android.view.View r3 = r7.i0
            android.view.ViewTreeObserver r4 = r7.k0
            r5 = 0
            if (r4 != 0) goto L2b
            r4 = r1
            goto L2c
        L2b:
            r4 = r5
        L2c:
            android.view.ViewTreeObserver r6 = r3.getViewTreeObserver()
            r7.k0 = r6
            if (r4 == 0) goto L39
            wr r4 = r7.e0
            r6.addOnGlobalLayoutListener(r4)
        L39:
            wh r4 = r7.f0
            r3.addOnAttachStateChangeListener(r4)
            r0.k0 = r3
            int r3 = r7.o0
            r0.h0 = r3
            boolean r3 = r7.m0
            android.content.Context r4 = r7.B
            f44 r6 = r7.R
            if (r3 != 0) goto L56
            int r3 = r7.Y
            int r3 = defpackage.t44.m(r6, r4, r3)
            r7.n0 = r3
            r7.m0 = r1
        L56:
            int r1 = r7.n0
            r0.q(r1)
            r1 = 2
            r2.setInputMethodMode(r1)
            android.graphics.Rect r1 = r7.A
            r2 = 0
            if (r1 == 0) goto L6a
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1)
            goto L6b
        L6a:
            r3 = r2
        L6b:
            r0.t0 = r3
            r0.e()
            mp1 r1 = r0.L
            r1.setOnKeyListener(r7)
            boolean r3 = r7.p0
            if (r3 == 0) goto La2
            i44 r7 = r7.L
            java.lang.CharSequence r3 = r7.m
            if (r3 == 0) goto La2
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r4)
            r4 = 2131623954(0x7f0e0012, float:1.8875074E38)
            android.view.View r3 = r3.inflate(r4, r1, r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L9c
            java.lang.CharSequence r7 = r7.m
            r4.setText(r7)
        L9c:
            r3.setEnabled(r5)
            r1.addHeaderView(r3, r2, r5)
        La2:
            r0.n(r6)
            r0.e()
            return
        La9:
            java.lang.String r7 = "StandardMenuPopup cannot be used without an anchor"
            defpackage.i.m(r7)
            return
    }

    @Override // defpackage.b54
    public final void g(defpackage.a54 r1) {
            r0 = this;
            r0.j0 = r1
            return
    }

    @Override // defpackage.b54
    public final void i() {
            r1 = this;
            r0 = 0
            r1.m0 = r0
            f44 r1 = r1.R
            if (r1 == 0) goto La
            r1.notifyDataSetChanged()
        La:
            return
    }

    @Override // defpackage.lh6
    public final defpackage.mp1 j() {
            r0 = this;
            z44 r0 = r0.d0
            mp1 r0 = r0.L
            return r0
    }

    @Override // defpackage.t44
    public final void l(defpackage.i44 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.t44
    public final void n(android.view.View r1) {
            r0 = this;
            r0.h0 = r1
            return
    }

    @Override // defpackage.t44
    public final void o(boolean r1) {
            r0 = this;
            f44 r0 = r0.R
            r0.L = r1
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r2 = this;
            r0 = 1
            r2.l0 = r0
            i44 r1 = r2.L
            r1.c(r0)
            android.view.ViewTreeObserver r0 = r2.k0
            if (r0 == 0) goto L24
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1a
            android.view.View r0 = r2.i0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.k0 = r0
        L1a:
            android.view.ViewTreeObserver r0 = r2.k0
            wr r1 = r2.e0
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.k0 = r0
        L24:
            android.view.View r0 = r2.i0
            wh r1 = r2.f0
            r0.removeOnAttachStateChangeListener(r1)
            android.widget.PopupWindow$OnDismissListener r2 = r2.g0
            if (r2 == 0) goto L32
            r2.onDismiss()
        L32:
            return
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r0 = 0
            return r0
    }

    @Override // defpackage.t44
    public final void p(int r1) {
            r0 = this;
            r0.o0 = r1
            return
    }

    @Override // defpackage.t44
    public final void q(int r1) {
            r0 = this;
            z44 r0 = r0.d0
            r0.Y = r1
            return
    }

    @Override // defpackage.t44
    public final void r(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.g0 = r1
            return
    }

    @Override // defpackage.t44
    public final void s(boolean r1) {
            r0 = this;
            r0.p0 = r1
            return
    }

    @Override // defpackage.t44
    public final void t(int r1) {
            r0 = this;
            z44 r0 = r0.d0
            r0.i(r1)
            return
    }
}
