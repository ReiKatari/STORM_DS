package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cb0  reason: default package */
/* loaded from: classes.dex */
public final class cb0 implements ab0 {
    public final Matrix a = new Matrix();
    public final int[] b = new int[2];

    @Override // defpackage.ab0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        int[] iArr = this.b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        hv.Y(matrix, fArr);
    }
}
