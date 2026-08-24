package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg5  reason: default package */
/* loaded from: classes.dex */
public class yg5 extends defpackage.b2 {
    public final androidx.recyclerview.widget.RecyclerView R;
    public final defpackage.xg5 X;

    public yg5(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            r1.<init>()
            r1.R = r2
            b2 r2 = r1.j()
            if (r2 == 0) goto L14
            boolean r0 = r2 instanceof defpackage.xg5
            if (r0 == 0) goto L14
            xg5 r2 = (defpackage.xg5) r2
            r1.X = r2
            return
        L14:
            xg5 r2 = new xg5
            r2.<init>(r1)
            r1.X = r2
            return
    }

    @Override // defpackage.b2
    public final void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            super.c(r2, r3)
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.RecyclerView r1 = r1.R
            boolean r1 = r1.P()
            if (r1 != 0) goto L1e
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            gg5 r1 = r2.getLayoutManager()
            if (r1 == 0) goto L1e
            gg5 r1 = r2.getLayoutManager()
            r1.U(r3)
        L1e:
            return
    }

    @Override // defpackage.b2
    public final void d(android.view.View r3, defpackage.v2 r4) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.A
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.a
            r0.onInitializeAccessibilityNodeInfo(r3, r1)
            androidx.recyclerview.widget.RecyclerView r2 = r2.R
            boolean r3 = r2.P()
            if (r3 != 0) goto L22
            gg5 r3 = r2.getLayoutManager()
            if (r3 == 0) goto L22
            gg5 r2 = r2.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r3 = r2.b
            mg5 r0 = r3.L
            sg5 r3 = r3.d1
            r2.V(r0, r3, r4)
        L22:
            return
    }

    @Override // defpackage.b2
    public final boolean g(android.view.View r1, int r2, android.os.Bundle r3) {
            r0 = this;
            boolean r1 = super.g(r1, r2, r3)
            if (r1 == 0) goto L8
            r0 = 1
            return r0
        L8:
            androidx.recyclerview.widget.RecyclerView r0 = r0.R
            boolean r1 = r0.P()
            if (r1 != 0) goto L1f
            gg5 r1 = r0.getLayoutManager()
            if (r1 == 0) goto L1f
            gg5 r0 = r0.getLayoutManager()
            boolean r0 = r0.i0(r2, r3)
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public defpackage.b2 j() {
            r0 = this;
            xg5 r0 = r0.X
            return r0
    }
}
