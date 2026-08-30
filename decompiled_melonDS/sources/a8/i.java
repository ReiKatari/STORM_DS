package a8;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends Animation {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ SwipeRefreshLayout L;

    public i(SwipeRefreshLayout swipeRefreshLayout, int i2, int i10) {
        this.L = swipeRefreshLayout;
        this.A = i2;
        this.B = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f8, Transformation transformation) {
        e eVar = this.L.f1697w0;
        int i2 = this.A;
        eVar.setAlpha((int) (((this.B - i2) * f8) + i2));
    }
}
