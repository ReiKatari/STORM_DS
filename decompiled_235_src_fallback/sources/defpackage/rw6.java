package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rw6  reason: default package */
/* loaded from: classes.dex */
public final class rw6 extends android.view.animation.Animation {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout B;

    public /* synthetic */ rw6(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float r3, android.view.animation.Transformation r4) {
            r2 = this;
            int r4 = r2.A
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r2.B
            switch(r4) {
                case 0: goto L3d;
                case 1: goto L38;
                case 2: goto Ld;
                default: goto L9;
            }
        L9:
            r2.k(r3)
            return
        Ld:
            int r4 = r2.v0
            int r1 = r2.u0
            int r1 = java.lang.Math.abs(r1)
            int r4 = r4 - r1
            int r1 = r2.t0
            int r4 = r4 - r1
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = (int) r4
            int r1 = r1 + r4
            sq0 r4 = r2.r0
            int r4 = r4.getTop()
            int r1 = r1 - r4
            r2.setTargetOffsetTopAndBottom(r1)
            wq0 r2 = r2.x0
            float r0 = r0 - r3
            vq0 r3 = r2.A
            float r4 = r3.p
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L34
            r3.p = r0
        L34:
            r2.invalidateSelf()
            return
        L38:
            float r0 = r0 - r3
            r2.setAnimationProgress(r0)
            return
        L3d:
            r2.setAnimationProgress(r3)
            return
    }
}
