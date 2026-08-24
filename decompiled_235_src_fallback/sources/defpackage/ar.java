package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar  reason: default package */
/* loaded from: classes.dex */
public final class ar implements android.view.Window.Callback {
    public final android.view.Window.Callback A;
    public defpackage.h87 B;
    public boolean L;
    public boolean R;
    public boolean X;
    public final /* synthetic */ defpackage.fr Y;

    public ar(defpackage.fr r1, android.view.Window.Callback r2) {
            r0 = this;
            r0.<init>()
            r0.Y = r1
            if (r2 == 0) goto La
            r0.A = r2
            return
        La:
            java.lang.String r0 = "Window callback may not be null"
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    public final void a(android.view.Window.Callback r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.L = r0     // Catch: java.lang.Throwable -> La
            r3.onContentChanged()     // Catch: java.lang.Throwable -> La
            r2.L = r1
            return
        La:
            r3 = move-exception
            r2.L = r1
            throw r3
    }

    public final boolean b(int r1, android.view.Menu r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            boolean r0 = r0.onMenuOpened(r1, r2)
            return r0
    }

    public final void c(int r1, android.view.Menu r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            r0.onPanelClosed(r1, r2)
            return
    }

    public final void d(java.util.List r1, android.view.Menu r2, int r3) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            defpackage.it7.a(r0, r1, r2, r3)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            boolean r0 = r0.dispatchGenericMotionEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            boolean r0 = r2.R
            android.view.Window$Callback r1 = r2.A
            if (r0 == 0) goto Lb
            boolean r2 = r1.dispatchKeyEvent(r3)
            return r2
        Lb:
            fr r2 = r2.Y
            boolean r2 = r2.x(r3)
            if (r2 != 0) goto L1c
            boolean r2 = r1.dispatchKeyEvent(r3)
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = 0
            return r2
        L1c:
            r2 = 1
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r5) {
            r4 = this;
            android.view.Window$Callback r0 = r4.A
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            r1 = 1
            if (r0 != 0) goto L4c
            int r0 = r5.getKeyCode()
            fr r4 = r4.Y
            r4.D()
            ak7 r2 = r4.j0
            if (r2 == 0) goto L1d
            boolean r0 = r2.r0(r0, r5)
            if (r0 == 0) goto L1d
            goto L4c
        L1d:
            er r0 = r4.H0
            if (r0 == 0) goto L32
            int r2 = r5.getKeyCode()
            boolean r0 = r4.J(r0, r2, r5)
            if (r0 == 0) goto L32
            er r4 = r4.H0
            if (r4 == 0) goto L4c
            r4.l = r1
            return r1
        L32:
            er r0 = r4.H0
            r2 = 0
            if (r0 != 0) goto L4b
            er r0 = r4.C(r2)
            r4.K(r0, r5)
            int r3 = r5.getKeyCode()
            boolean r4 = r4.J(r0, r3, r5)
            r0.k = r2
            if (r4 == 0) goto L4b
            goto L4c
        L4b:
            return r2
        L4c:
            return r1
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            boolean r0 = r0.dispatchPopulateAccessibilityEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            boolean r0 = r0.dispatchTouchEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            boolean r0 = r0.dispatchTrackballEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(android.view.ActionMode r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            r0.onActionModeFinished(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(android.view.ActionMode r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            r0.onActionModeStarted(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
            r1 = this;
            boolean r0 = r1.L
            if (r0 == 0) goto L9
            android.view.Window$Callback r1 = r1.A
            r1.onContentChanged()
        L9:
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            if (r2 != 0) goto L8
            boolean r0 = r3 instanceof defpackage.i44
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            android.view.Window$Callback r1 = r1.A
            boolean r1 = r1.onCreatePanelMenu(r2, r3)
            return r1
    }

    @Override // android.view.Window.Callback
    public final android.view.View onCreatePanelView(int r3) {
            r2 = this;
            h87 r0 = r2.B
            if (r0 == 0) goto L1a
            if (r3 != 0) goto L16
            android.view.View r1 = new android.view.View
            i87 r0 = r0.A
            l87 r0 = r0.l
            androidx.appcompat.widget.Toolbar r0 = r0.a
            android.content.Context r0 = r0.getContext()
            r1.<init>(r0)
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1a
            return r1
        L1a:
            android.view.Window$Callback r2 = r2.A
            android.view.View r2 = r2.onCreatePanelView(r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r1, android.view.MenuItem r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            boolean r0 = r0.onMenuItemSelected(r1, r2)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            r1.b(r2, r3)
            r3 = 108(0x6c, float:1.51E-43)
            r0 = 1
            if (r2 != r3) goto L14
            fr r1 = r1.Y
            r1.D()
            ak7 r1 = r1.j0
            if (r1 == 0) goto L14
            r1.P(r0)
        L14:
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            boolean r0 = r1.X
            if (r0 == 0) goto La
            android.view.Window$Callback r1 = r1.A
            r1.onPanelClosed(r2, r3)
            return
        La:
            r1.c(r2, r3)
            r3 = 108(0x6c, float:1.51E-43)
            fr r1 = r1.Y
            r0 = 0
            if (r2 != r3) goto L1f
            r1.D()
            ak7 r1 = r1.j0
            if (r1 == 0) goto L2c
            r1.P(r0)
            return
        L1f:
            if (r2 != 0) goto L2c
            er r2 = r1.C(r2)
            boolean r3 = r2.m
            if (r3 == 0) goto L2c
            r1.v(r2, r0)
        L2c:
            return
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            defpackage.jt7.a(r0, r1)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r6, android.view.View r7, android.view.Menu r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.i44
            if (r0 == 0) goto L8
            r0 = r8
            i44 r0 = (defpackage.i44) r0
            goto L9
        L8:
            r0 = 0
        L9:
            r1 = 0
            if (r6 != 0) goto Lf
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r2 = 1
            if (r0 == 0) goto L14
            r0.x = r2
        L14:
            h87 r3 = r5.B
            if (r3 == 0) goto L26
            if (r6 != 0) goto L26
            i87 r3 = r3.A
            boolean r4 = r3.o
            if (r4 != 0) goto L26
            l87 r4 = r3.l
            r4.l = r2
            r3.o = r2
        L26:
            android.view.Window$Callback r5 = r5.A
            boolean r5 = r5.onPreparePanel(r6, r7, r8)
            if (r0 == 0) goto L30
            r0.x = r1
        L30:
            return r5
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(java.util.List r3, android.view.Menu r4, int r5) {
            r2 = this;
            fr r0 = r2.Y
            r1 = 0
            er r0 = r0.C(r1)
            i44 r0 = r0.h
            if (r0 == 0) goto Lf
            r2.d(r3, r0, r5)
            return
        Lf:
            r2.d(r3, r4, r5)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(android.view.SearchEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            boolean r0 = defpackage.ht7.a(r0, r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            r0.onWindowAttributesChanged(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.A
            r0.onWindowFocusChanged(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r8, int r9) {
            r7 = this;
            fr r0 = r7.Y
            android.content.Context r1 = r0.g0
            if (r9 == 0) goto Ld
            android.view.Window$Callback r7 = r7.A
            android.view.ActionMode r7 = defpackage.ht7.b(r7, r8, r9)
            return r7
        Ld:
            eb r7 = new eb
            r7.<init>(r1, r8)
            k8 r8 = r0.p0
            if (r8 == 0) goto L19
            r8.a()
        L19:
            u63 r8 = new u63
            r9 = 8
            r2 = 0
            r8.<init>(r9, r0, r7, r2)
            r0.D()
            ak7 r9 = r0.j0
            if (r9 == 0) goto L2e
            k8 r9 = r9.G0(r8)
            r0.p0 = r9
        L2e:
            k8 r9 = r0.p0
            r3 = 0
            if (r9 != 0) goto L1a1
            ip7 r9 = r0.t0
            if (r9 == 0) goto L3a
            r9.b()
        L3a:
            k8 r9 = r0.p0
            if (r9 == 0) goto L41
            r9.a()
        L41:
            androidx.appcompat.widget.ActionBarContextView r9 = r0.q0
            r4 = 1
            if (r9 != 0) goto Lf4
            boolean r9 = r0.D0
            if (r9 == 0) goto Lc7
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.res.Resources$Theme r5 = r1.getTheme()
            r6 = 2130968588(0x7f04000c, float:1.7545834E38)
            r5.resolveAttribute(r6, r9, r4)
            int r6 = r9.resourceId
            if (r6 == 0) goto L7a
            android.content.res.Resources r6 = r1.getResources()
            android.content.res.Resources$Theme r6 = r6.newTheme()
            r6.setTo(r5)
            int r5 = r9.resourceId
            r6.applyStyle(r5, r4)
            p41 r5 = new p41
            r5.<init>(r1, r2)
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r1.setTo(r6)
            r1 = r5
        L7a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r1, r3)
            r0.q0 = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            r6 = 2130968603(0x7f04001b, float:1.7545864E38)
            r5.<init>(r1, r3, r6)
            r0.r0 = r5
            r6 = 2
            r5.setWindowLayoutType(r6)
            android.widget.PopupWindow r5 = r0.r0
            androidx.appcompat.widget.ActionBarContextView r6 = r0.q0
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r0.r0
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r1.getTheme()
            r6 = 2130968582(0x7f040006, float:1.7545822E38)
            r5.resolveAttribute(r6, r9, r4)
            int r9 = r9.data
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r9 = android.util.TypedValue.complexToDimensionPixelSize(r9, r1)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.q0
            r1.setContentHeight(r9)
            android.widget.PopupWindow r9 = r0.r0
            r1 = -2
            r9.setHeight(r1)
            uq r9 = new uq
            r9.<init>(r0, r4)
            r0.s0 = r9
            goto Lf4
        Lc7:
            android.view.ViewGroup r9 = r0.v0
            r5 = 2131427398(0x7f0b0046, float:1.8476411E38)
            android.view.View r9 = r9.findViewById(r5)
            androidx.appcompat.widget.ViewStubCompat r9 = (androidx.appcompat.widget.ViewStubCompat) r9
            if (r9 == 0) goto Lf4
            r0.D()
            ak7 r5 = r0.j0
            if (r5 == 0) goto Le0
            android.content.Context r5 = r5.f0()
            goto Le1
        Le0:
            r5 = r3
        Le1:
            if (r5 != 0) goto Le4
            goto Le5
        Le4:
            r1 = r5
        Le5:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r9.setLayoutInflater(r1)
            android.view.View r9 = r9.a()
            androidx.appcompat.widget.ActionBarContextView r9 = (androidx.appcompat.widget.ActionBarContextView) r9
            r0.q0 = r9
        Lf4:
            androidx.appcompat.widget.ActionBarContextView r9 = r0.q0
            if (r9 == 0) goto L19a
            ip7 r9 = r0.t0
            if (r9 == 0) goto Lff
            r9.b()
        Lff:
            androidx.appcompat.widget.ActionBarContextView r9 = r0.q0
            r9.e()
            zo6 r9 = new zo6
            androidx.appcompat.widget.ActionBarContextView r1 = r0.q0
            android.content.Context r1 = r1.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r0.q0
            r9.<init>()
            r9.L = r1
            r9.R = r5
            r9.X = r8
            i44 r1 = new i44
            android.content.Context r5 = r5.getContext()
            r1.<init>(r5)
            r1.l = r4
            r9.d0 = r1
            r1.e = r9
            java.lang.Object r8 = r8.B
            eb r8 = (defpackage.eb) r8
            boolean r8 = r8.K(r9, r1)
            if (r8 == 0) goto L198
            r9.g()
            androidx.appcompat.widget.ActionBarContextView r8 = r0.q0
            r8.c(r9)
            r0.p0 = r9
            boolean r8 = r0.u0
            if (r8 == 0) goto L14a
            android.view.ViewGroup r8 = r0.v0
            if (r8 == 0) goto L14a
            boolean r8 = r8.isLaidOut()
            if (r8 == 0) goto L14a
            r8 = r4
            goto L14b
        L14a:
            r8 = r2
        L14b:
            androidx.appcompat.widget.ActionBarContextView r9 = r0.q0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L169
            r8 = 0
            r9.setAlpha(r8)
            androidx.appcompat.widget.ActionBarContextView r8 = r0.q0
            ip7 r8 = defpackage.ao7.b(r8)
            r8.a(r1)
            r0.t0 = r8
            wq r9 = new wq
            r9.<init>(r0, r4)
            r8.d(r9)
            goto L188
        L169:
            r9.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r0.q0
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r0.q0
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L188
            androidx.appcompat.widget.ActionBarContextView r8 = r0.q0
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r9 = defpackage.ao7.a
            r8.requestApplyInsets()
        L188:
            android.widget.PopupWindow r8 = r0.r0
            if (r8 == 0) goto L19a
            android.view.Window r8 = r0.h0
            android.view.View r8 = r8.getDecorView()
            uq r9 = r0.s0
            r8.post(r9)
            goto L19a
        L198:
            r0.p0 = r3
        L19a:
            r0.M()
            k8 r8 = r0.p0
            r0.p0 = r8
        L1a1:
            r0.M()
            k8 r8 = r0.p0
            if (r8 == 0) goto L1ac
            hu6 r3 = r7.C(r8)
        L1ac:
            return r3
    }
}
