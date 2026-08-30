package b4;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k1 implements i1 {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f1872a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f1873b = new int[2];

    @Override // b4.i1
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f1872a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        int[] iArr = this.f1873b;
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i10 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i2, iArr[1] - i10);
        i3.z.t(matrix, fArr);
    }
}
