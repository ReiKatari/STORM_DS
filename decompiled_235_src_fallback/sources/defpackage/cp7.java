package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp7  reason: default package */
/* loaded from: classes.dex */
public abstract class cp7 extends defpackage.e51 {
    public defpackage.r90 a;

    @Override // defpackage.e51
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
            r0 = this;
            r0.v(r1, r2, r3)
            r90 r1 = r0.a
            if (r1 != 0) goto Le
            r90 r1 = new r90
            r1.<init>(r2)
            r0.a = r1
        Le:
            r90 r1 = r0.a
            java.lang.Object r2 = r1.L
            android.view.View r2 = (android.view.View) r2
            int r3 = r2.getTop()
            r1.A = r3
            int r2 = r2.getLeft()
            r1.B = r2
            r90 r0 = r0.a
            java.lang.Object r1 = r0.L
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getTop()
            int r3 = r0.A
            int r2 = r2 - r3
            int r2 = 0 - r2
            java.util.WeakHashMap r3 = defpackage.ao7.a
            r1.offsetTopAndBottom(r2)
            int r2 = r1.getLeft()
            int r0 = r0.B
            int r2 = r2 - r0
            int r0 = 0 - r2
            r1.offsetLeftAndRight(r0)
            r0 = 1
            return r0
    }

    public void v(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
            r0 = this;
            r1.q(r2, r3)
            return
    }
}
