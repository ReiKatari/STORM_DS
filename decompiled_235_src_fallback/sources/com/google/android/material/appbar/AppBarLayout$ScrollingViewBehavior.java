package com.google.android.material.appbar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends defpackage.cp7 {
    public final int b;

    public AppBarLayout$ScrollingViewBehavior() {
            r0 = this;
            r0.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            return
    }

    public AppBarLayout$ScrollingViewBehavior(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int[] r0 = defpackage.a75.x
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = 0
            int r3 = r2.getDimensionPixelSize(r3, r3)
            r1.b = r3
            r2.recycle()
            return
    }

    public static void w(java.util.ArrayList r3) {
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L10
            java.lang.Object r2 = r3.get(r1)
            android.view.View r2 = (android.view.View) r2
            int r1 = r1 + 1
            goto L5
        L10:
            return
    }

    @Override // defpackage.e51
    public final void f(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // defpackage.e51
    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            h51 r3 = (defpackage.h51) r3
            e51 r3 = r3.a
            boolean r3 = r3 instanceof com.google.android.material.appbar.AppBarLayout$BaseBehavior
            r0 = 0
            if (r3 == 0) goto L2a
            int r3 = r5.getBottom()
            int r5 = r4.getTop()
            int r3 = r3 - r5
            int r2 = r2.b
            if (r2 != 0) goto L1c
            r2 = r0
            goto L24
        L1c:
            r5 = 0
            float r1 = (float) r2
            float r5 = r5 * r1
            int r5 = (int) r5
            int r2 = defpackage.ej2.q(r5, r0, r2)
        L24:
            int r3 = r3 - r2
            java.util.WeakHashMap r2 = defpackage.ao7.a
            r4.offsetTopAndBottom(r3)
        L2a:
            return r0
    }

    @Override // defpackage.e51
    public final boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r0 = r0.height
            r3 = -1
            if (r0 == r3) goto Lc
            r3 = -2
            if (r0 != r3) goto L13
        Lc:
            java.util.ArrayList r0 = r1.j(r2)
            w(r0)
        L13:
            r0 = 0
            return r0
    }

    @Override // defpackage.e51
    public final void p(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2) {
            r0 = this;
            java.util.ArrayList r0 = r1.j(r2)
            w(r0)
            return
    }

    @Override // defpackage.cp7
    public final void v(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
            r0 = this;
            java.util.ArrayList r0 = r1.j(r2)
            w(r0)
            r1.q(r2, r3)
            return
    }
}
