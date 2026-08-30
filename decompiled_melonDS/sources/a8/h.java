package a8;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends Animation {
    public final /* synthetic */ int A;
    public final /* synthetic */ SwipeRefreshLayout B;

    public /* synthetic */ h(SwipeRefreshLayout swipeRefreshLayout, int i2) {
        this.A = i2;
        this.B = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f8, Transformation transformation) {
        switch (this.A) {
            case 0:
                this.B.setAnimationProgress(f8);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.setAnimationProgress(1.0f - f8);
                return;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.B;
                int abs = swipeRefreshLayout.f1695u0 - Math.abs(swipeRefreshLayout.f1694t0);
                int i2 = swipeRefreshLayout.f1693s0;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i2 + ((int) ((abs - i2) * f8))) - swipeRefreshLayout.f1691q0.getTop());
                e eVar = swipeRefreshLayout.f1697w0;
                float f10 = 1.0f - f8;
                d dVar = eVar.A;
                if (f10 != dVar.f656p) {
                    dVar.f656p = f10;
                }
                eVar.invalidateSelf();
                return;
            default:
                this.B.k(f8);
                return;
        }
    }
}
