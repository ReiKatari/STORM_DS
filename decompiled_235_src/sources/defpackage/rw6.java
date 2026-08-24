package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rw6  reason: default package */
/* loaded from: classes.dex */
public final class rw6 extends Animation {
    public final /* synthetic */ int A;
    public final /* synthetic */ SwipeRefreshLayout B;

    public /* synthetic */ rw6(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.A = i;
        this.B = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.A;
        SwipeRefreshLayout swipeRefreshLayout = this.B;
        switch (i) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f);
                return;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f);
                return;
            case 2:
                int abs = swipeRefreshLayout.v0 - Math.abs(swipeRefreshLayout.u0);
                int i2 = swipeRefreshLayout.t0;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i2 + ((int) ((abs - i2) * f))) - swipeRefreshLayout.r0.getTop());
                wq0 wq0Var = swipeRefreshLayout.x0;
                float f2 = 1.0f - f;
                vq0 vq0Var = wq0Var.A;
                if (f2 != vq0Var.p) {
                    vq0Var.p = f2;
                }
                wq0Var.invalidateSelf();
                return;
            default:
                swipeRefreshLayout.k(f);
                return;
        }
    }
}
