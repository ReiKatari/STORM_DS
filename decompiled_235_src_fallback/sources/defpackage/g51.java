package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g51  reason: default package */
/* loaded from: classes.dex */
public final class g51 implements android.view.ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.view.KeyEvent.Callback b;

    public g51(androidx.coordinatorlayout.widget.CoordinatorLayout r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    public g51(defpackage.do6 r1, me.magnum.melonds.ui.romlist.RomListActivity r2) {
            r0 = this;
            r1 = 1
            r0.a = r1
            r0.<init>()
            r0.b = r2
            return
    }

    private final void a(android.view.View r1, android.view.View r2) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(android.view.View r4, android.view.View r5) {
            r3 = this;
            int r0 = r3.a
            android.view.KeyEvent$Callback r3 = r3.b
            switch(r0) {
                case 0: goto L4b;
                default: goto L7;
            }
        L7:
            boolean r4 = defpackage.ij5.q(r5)
            if (r4 == 0) goto L4a
            android.window.SplashScreenView r4 = defpackage.ij5.l(r5)
            r4.getClass()
            android.view.WindowInsets$Builder r5 = defpackage.r74.m()
            android.view.WindowInsets r5 = defpackage.r74.n(r5)
            r5.getClass()
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r1, r1, r2, r2)
            android.view.View r4 = defpackage.ij5.k(r4)
            android.view.WindowInsets r4 = r4.computeSystemWindowInsets(r5, r0)
            if (r5 != r4) goto L37
            boolean r4 = r0.isEmpty()
        L37:
            me.magnum.melonds.ui.romlist.RomListActivity r3 = (me.magnum.melonds.ui.romlist.RomListActivity) r3
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.getClass()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r4 = 0
            r3.setOnHierarchyChangeListener(r4)
        L4a:
            return
        L4b:
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            android.view.ViewGroup$OnHierarchyChangeListener r3 = r3.p0
            if (r3 == 0) goto L54
            r3.onChildViewAdded(r4, r5)
        L54:
            return
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(android.view.View r2, android.view.View r3) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            android.view.KeyEvent$Callback r1 = r1.b
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r1
            r0 = 2
            r1.p(r0)
            android.view.ViewGroup$OnHierarchyChangeListener r1 = r1.p0
            if (r1 == 0) goto L15
            r1.onChildViewRemoved(r2, r3)
        L15:
            return
    }
}
