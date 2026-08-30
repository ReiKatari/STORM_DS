package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fc7  reason: default package */
/* loaded from: classes.dex */
public final class fc7 extends ec7 {
    @Override // defpackage.sn2
    public final float C(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.sn2
    public final void O(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.ec7
    public final void W(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.ec7
    public final void X(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.ec7
    public final void Y(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.ec7
    public final void Z(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
