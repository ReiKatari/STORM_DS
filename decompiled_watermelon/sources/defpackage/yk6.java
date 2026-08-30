package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yk6  reason: default package */
/* loaded from: classes.dex */
public final class yk6 extends Animation {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ SwipeRefreshLayout L;

    public yk6(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.L = swipeRefreshLayout;
        this.A = i;
        this.B = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        mo0 mo0Var = this.L.w0;
        int i = this.A;
        mo0Var.setAlpha((int) (((this.B - i) * f) + i));
    }
}
