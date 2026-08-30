package c8;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends f0 {
    @Override // l0.f
    public final void E(View view, float f8) {
        view.setTransitionAlpha(f8);
    }

    @Override // c8.f0
    public final void L(View view, int i2, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i2, i10, i11, i12);
    }

    @Override // c8.f0
    public final void M(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // c8.f0
    public final void N(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // c8.f0
    public final void O(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // l0.f
    public final float p(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
