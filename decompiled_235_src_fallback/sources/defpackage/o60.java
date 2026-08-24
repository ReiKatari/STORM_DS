package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o60  reason: default package */
/* loaded from: classes.dex */
public final class o60 extends defpackage.hr {
    public com.google.android.material.bottomsheet.BottomSheetBehavior Z;
    public android.widget.FrameLayout d0;
    public androidx.coordinatorlayout.widget.CoordinatorLayout e0;
    public android.widget.FrameLayout f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public defpackage.n60 j0;
    public boolean k0;
    public defpackage.bt l0;
    public defpackage.m60 m0;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.Z
            if (r0 != 0) goto L7
            r1.h()
        L7:
            super.cancel()
            return
    }

    public final void h() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.d0
            if (r0 != 0) goto L51
            android.content.Context r0 = r3.getContext()
            r1 = 2131623970(0x7f0e0022, float:1.8875107E38)
            r2 = 0
            android.view.View r0 = android.view.View.inflate(r0, r1, r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.d0 = r0
            r1 = 2131427518(0x7f0b00be, float:1.8476655E38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r3.e0 = r0
            android.widget.FrameLayout r0 = r3.d0
            r1 = 2131427534(0x7f0b00ce, float:1.8476687E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.f0 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.A(r0)
            r3.Z = r0
            m60 r1 = r3.m0
            java.util.ArrayList r0 = r0.Y
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L3f
            r0.add(r1)
        L3f:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.Z
            boolean r1 = r3.g0
            r0.G(r1)
            bt r0 = new bt
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.Z
            android.widget.FrameLayout r2 = r3.f0
            r0.<init>(r1, r2)
            r3.l0 = r0
        L51:
            return
    }

    public final android.widget.FrameLayout i(android.view.View r5, int r6, android.view.ViewGroup.LayoutParams r7) {
            r4 = this;
            r4.h()
            android.widget.FrameLayout r0 = r4.d0
            r1 = 2131427518(0x7f0b00be, float:1.8476655E38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = 0
            if (r6 == 0) goto L1b
            if (r5 != 0) goto L1b
            android.view.LayoutInflater r5 = r4.getLayoutInflater()
            android.view.View r5 = r5.inflate(r6, r0, r1)
        L1b:
            boolean r6 = r4.k0
            if (r6 == 0) goto L2d
            android.widget.FrameLayout r6 = r4.d0
            os0 r2 = new os0
            r3 = 16
            r2.<init>(r4, r3)
            java.util.WeakHashMap r3 = defpackage.ao7.a
            defpackage.sn7.c(r6, r2)
        L2d:
            android.widget.FrameLayout r6 = r4.f0
            r6.removeAllViews()
            android.widget.FrameLayout r6 = r4.f0
            if (r7 != 0) goto L3a
            r6.addView(r5)
            goto L3d
        L3a:
            r6.addView(r5, r7)
        L3d:
            r5 = 2131428021(0x7f0b02b5, float:1.8477675E38)
            android.view.View r5 = r0.findViewById(r5)
            r7 r6 = new r7
            r7 = 2
            r6.<init>(r4, r7)
            r5.setOnClickListener(r6)
            android.widget.FrameLayout r5 = r4.f0
            l60 r6 = new l60
            r6.<init>(r4, r1)
            defpackage.ao7.n(r5, r6)
            android.widget.FrameLayout r5 = r4.f0
            t20 r6 = new t20
            r7 = 1
            r6.<init>(r7)
            r5.setOnTouchListener(r6)
            android.widget.FrameLayout r4 = r4.d0
            return r4
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
            r6 = this;
            super.onAttachedToWindow()
            android.view.Window r0 = r6.getWindow()
            r1 = 0
            if (r0 == 0) goto L3b
            boolean r2 = r6.k0
            r3 = 1
            if (r2 == 0) goto L1d
            int r2 = r0.getNavigationBarColor()
            int r2 = android.graphics.Color.alpha(r2)
            r4 = 255(0xff, float:3.57E-43)
            if (r2 >= r4) goto L1d
            r2 = r3
            goto L1e
        L1d:
            r2 = r1
        L1e:
            android.widget.FrameLayout r4 = r6.d0
            if (r4 == 0) goto L27
            r5 = r2 ^ 1
            r4.setFitsSystemWindows(r5)
        L27:
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = r6.e0
            if (r4 == 0) goto L30
            r5 = r2 ^ 1
            r4.setFitsSystemWindows(r5)
        L30:
            r2 = r2 ^ r3
            defpackage.kt7.a(r0, r2)
            n60 r2 = r6.j0
            if (r2 == 0) goto L3b
            r2.e(r0)
        L3b:
            bt r0 = r6.l0
            if (r0 != 0) goto L40
            goto L5b
        L40:
            java.lang.Object r2 = r0.R
            android.view.View r2 = (android.view.View) r2
            boolean r6 = r6.g0
            java.lang.Object r3 = r0.B
            s14 r3 = (defpackage.s14) r3
            if (r6 == 0) goto L56
            if (r3 == 0) goto L5b
            java.lang.Object r6 = r0.L
            r14 r6 = (defpackage.r14) r6
            r3.b(r6, r2, r1)
            return
        L56:
            if (r3 == 0) goto L5b
            r3.c(r2)
        L5b:
            return
    }

    @Override // defpackage.hr, defpackage.qv0, android.app.Dialog
    public final void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L16
            r1 = 0
            r0.setStatusBarColor(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            r1 = -1
            r0.setLayout(r1, r1)
        L16:
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
            r2 = this;
            n60 r0 = r2.j0
            if (r0 == 0) goto L8
            r1 = 0
            r0.e(r1)
        L8:
            bt r2 = r2.l0
            if (r2 == 0) goto L19
            java.lang.Object r0 = r2.B
            s14 r0 = (defpackage.s14) r0
            if (r0 == 0) goto L19
            java.lang.Object r2 = r2.R
            android.view.View r2 = (android.view.View) r2
            r0.c(r2)
        L19:
            return
    }

    @Override // defpackage.qv0, android.app.Dialog
    public final void onStart() {
            r2 = this;
            super.onStart()
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r2.Z
            if (r2 == 0) goto L10
            int r0 = r2.N
            r1 = 5
            if (r0 != r1) goto L10
            r0 = 4
            r2.I(r0)
        L10:
            return
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean r3) {
            r2 = this;
            super.setCancelable(r3)
            boolean r0 = r2.g0
            if (r0 == r3) goto L37
            r2.g0 = r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.Z
            if (r0 == 0) goto L10
            r0.G(r3)
        L10:
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto L37
            bt r3 = r2.l0
            if (r3 != 0) goto L1b
            goto L37
        L1b:
            java.lang.Object r0 = r3.R
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r2.g0
            java.lang.Object r1 = r3.B
            s14 r1 = (defpackage.s14) r1
            if (r2 == 0) goto L32
            if (r1 == 0) goto L37
            java.lang.Object r2 = r3.L
            r14 r2 = (defpackage.r14) r2
            r3 = 0
            r1.b(r2, r0, r3)
            return
        L32:
            if (r1 == 0) goto L37
            r1.c(r0)
        L37:
            return
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean r3) {
            r2 = this;
            super.setCanceledOnTouchOutside(r3)
            r0 = 1
            if (r3 == 0) goto Lc
            boolean r1 = r2.g0
            if (r1 != 0) goto Lc
            r2.g0 = r0
        Lc:
            r2.h0 = r3
            r2.i0 = r0
            return
    }

    @Override // defpackage.hr, defpackage.qv0, android.app.Dialog
    public final void setContentView(int r2) {
            r1 = this;
            r0 = 0
            android.widget.FrameLayout r2 = r1.i(r0, r2, r0)
            super.setContentView(r2)
            return
    }

    @Override // defpackage.hr, defpackage.qv0, android.app.Dialog
    public final void setContentView(android.view.View r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            android.widget.FrameLayout r3 = r2.i(r3, r0, r1)
            super.setContentView(r3)
            return
    }

    @Override // defpackage.hr, defpackage.qv0, android.app.Dialog
    public final void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r0 = 0
            android.widget.FrameLayout r2 = r1.i(r2, r0, r3)
            super.setContentView(r2)
            return
    }
}
