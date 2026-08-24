package com.google.android.material.transformation;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends defpackage.e51 {
    public ExpandableBehavior() {
            r0 = this;
            r0.<init>()
            return
    }

    public ExpandableBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.e51
    public abstract void f(android.view.View r1);

    @Override // defpackage.e51
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
            r0 = this;
            r3.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // defpackage.e51
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, int r6) {
            r3 = this;
            boolean r6 = r5.isLaidOut()
            r0 = 0
            if (r6 != 0) goto L1e
            java.util.ArrayList r4 = r4.j(r5)
            int r6 = r4.size()
            r1 = r0
        L10:
            if (r1 >= r6) goto L1e
            java.lang.Object r2 = r4.get(r1)
            android.view.View r2 = (android.view.View) r2
            r3.f(r5)
            int r1 = r1 + 1
            goto L10
        L1e:
            return r0
    }
}
