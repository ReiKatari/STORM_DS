package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg5  reason: default package */
/* loaded from: classes.dex */
public final class xg5 extends defpackage.b2 {
    public final defpackage.yg5 R;
    public final java.util.WeakHashMap X;

    public xg5(defpackage.yg5 r2) {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.X = r0
            r1.R = r2
            return
    }

    @Override // defpackage.b2
    public final boolean a(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.X
            java.lang.Object r0 = r0.get(r2)
            b2 r0 = (defpackage.b2) r0
            if (r0 == 0) goto Lf
            boolean r1 = r0.a(r2, r3)
            return r1
        Lf:
            android.view.View$AccessibilityDelegate r1 = r1.A
            boolean r1 = r1.dispatchPopulateAccessibilityEvent(r2, r3)
            return r1
    }

    @Override // defpackage.b2
    public final defpackage.os0 b(android.view.View r2) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.X
            java.lang.Object r0 = r0.get(r2)
            b2 r0 = (defpackage.b2) r0
            if (r0 == 0) goto Lf
            os0 r1 = r0.b(r2)
            return r1
        Lf:
            os0 r1 = super.b(r2)
            return r1
    }

    @Override // defpackage.b2
    public final void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.X
            java.lang.Object r0 = r0.get(r2)
            b2 r0 = (defpackage.b2) r0
            if (r0 == 0) goto Le
            r0.c(r2, r3)
            return
        Le:
            super.c(r2, r3)
            return
    }

    @Override // defpackage.b2
    public final void d(android.view.View r5, defpackage.v2 r6) {
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.a
            yg5 r1 = r4.R
            androidx.recyclerview.widget.RecyclerView r2 = r1.R
            androidx.recyclerview.widget.RecyclerView r1 = r1.R
            boolean r2 = r2.P()
            android.view.View$AccessibilityDelegate r3 = r4.A
            if (r2 != 0) goto L2f
            gg5 r2 = r1.getLayoutManager()
            if (r2 == 0) goto L2f
            gg5 r1 = r1.getLayoutManager()
            r1.X(r5, r6)
            java.util.WeakHashMap r4 = r4.X
            java.lang.Object r4 = r4.get(r5)
            b2 r4 = (defpackage.b2) r4
            if (r4 == 0) goto L2b
            r4.d(r5, r6)
            return
        L2b:
            r3.onInitializeAccessibilityNodeInfo(r5, r0)
            return
        L2f:
            r3.onInitializeAccessibilityNodeInfo(r5, r0)
            return
    }

    @Override // defpackage.b2
    public final void e(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.X
            java.lang.Object r0 = r0.get(r2)
            b2 r0 = (defpackage.b2) r0
            if (r0 == 0) goto Le
            r0.e(r2, r3)
            return
        Le:
            super.e(r2, r3)
            return
    }

    @Override // defpackage.b2
    public final boolean f(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.X
            java.lang.Object r0 = r0.get(r2)
            b2 r0 = (defpackage.b2) r0
            if (r0 == 0) goto Lf
            boolean r1 = r0.f(r2, r3, r4)
            return r1
        Lf:
            android.view.View$AccessibilityDelegate r1 = r1.A
            boolean r1 = r1.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r1
    }

    @Override // defpackage.b2
    public final boolean g(android.view.View r3, int r4, android.os.Bundle r5) {
            r2 = this;
            yg5 r0 = r2.R
            androidx.recyclerview.widget.RecyclerView r1 = r0.R
            androidx.recyclerview.widget.RecyclerView r0 = r0.R
            boolean r1 = r1.P()
            if (r1 != 0) goto L35
            gg5 r1 = r0.getLayoutManager()
            if (r1 == 0) goto L35
            java.util.WeakHashMap r1 = r2.X
            java.lang.Object r1 = r1.get(r3)
            b2 r1 = (defpackage.b2) r1
            if (r1 == 0) goto L23
            boolean r2 = r1.g(r3, r4, r5)
            if (r2 == 0) goto L2b
            goto L29
        L23:
            boolean r2 = super.g(r3, r4, r5)
            if (r2 == 0) goto L2b
        L29:
            r2 = 1
            return r2
        L2b:
            gg5 r2 = r0.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r2 = r2.b
            mg5 r2 = r2.L
            r2 = 0
            return r2
        L35:
            boolean r2 = super.g(r3, r4, r5)
            return r2
    }

    @Override // defpackage.b2
    public final void h(android.view.View r2, int r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.X
            java.lang.Object r0 = r0.get(r2)
            b2 r0 = (defpackage.b2) r0
            if (r0 == 0) goto Le
            r0.h(r2, r3)
            return
        Le:
            super.h(r2, r3)
            return
    }

    @Override // defpackage.b2
    public final void i(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.X
            java.lang.Object r0 = r0.get(r2)
            b2 r0 = (defpackage.b2) r0
            if (r0 == 0) goto Le
            r0.i(r2, r3)
            return
        Le:
            super.i(r2, r3)
            return
    }
}
