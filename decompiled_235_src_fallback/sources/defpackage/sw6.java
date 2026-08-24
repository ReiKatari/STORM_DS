package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw6  reason: default package */
/* loaded from: classes.dex */
public final class sw6 extends android.view.animation.Animation {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout L;

    public sw6(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1, int r2, int r3) {
            r0 = this;
            r0.L = r1
            r0.A = r2
            r0.B = r3
            r0.<init>()
            return
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float r3, android.view.animation.Transformation r4) {
            r2 = this;
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r2.L
            wq0 r4 = r4.x0
            int r0 = r2.A
            float r1 = (float) r0
            int r2 = r2.B
            int r2 = r2 - r0
            float r2 = (float) r2
            float r2 = r2 * r3
            float r2 = r2 + r1
            int r2 = (int) r2
            r4.setAlpha(r2)
            return
    }
}
