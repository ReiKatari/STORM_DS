package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xk6  reason: default package */
/* loaded from: classes.dex */
public final class xk6 extends Animation {
    public final /* synthetic */ int A;
    public final /* synthetic */ SwipeRefreshLayout B;

    public /* synthetic */ xk6(SwipeRefreshLayout swipeRefreshLayout, int i) {
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
                int abs = swipeRefreshLayout.u0 - Math.abs(swipeRefreshLayout.t0);
                int i2 = swipeRefreshLayout.s0;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i2 + ((int) ((abs - i2) * f))) - swipeRefreshLayout.q0.getTop());
                mo0 mo0Var = swipeRefreshLayout.w0;
                float f2 = 1.0f - f;
                lo0 lo0Var = mo0Var.A;
                if (f2 != lo0Var.p) {
                    lo0Var.p = f2;
                }
                mo0Var.invalidateSelf();
                return;
            default:
                swipeRefreshLayout.k(f);
                return;
        }
    }
}
