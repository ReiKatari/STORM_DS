package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u80  reason: default package */
/* loaded from: classes.dex */
public final class u80 implements s80 {
    public final Matrix a = new Matrix();
    public final int[] b = new int[2];

    @Override // defpackage.s80
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
        l07.q0(matrix, fArr);
    }
}
