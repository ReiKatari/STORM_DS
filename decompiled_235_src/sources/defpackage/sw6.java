package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw6  reason: default package */
/* loaded from: classes.dex */
public final class sw6 extends Animation {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ SwipeRefreshLayout L;

    public sw6(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.L = swipeRefreshLayout;
        this.A = i;
        this.B = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        wq0 wq0Var = this.L.x0;
        int i = this.A;
        wq0Var.setAlpha((int) (((this.B - i) * f) + i));
    }
}
