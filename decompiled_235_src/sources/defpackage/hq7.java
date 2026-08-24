package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq7  reason: default package */
/* loaded from: classes.dex */
public final class hq7 extends gq7 {
    @Override // defpackage.mp2
    public final float K(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.mp2
    public final void Y(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.gq7
    public final void b0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.gq7
    public final void c0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.gq7
    public final void d0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.gq7
    public final void e0(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
