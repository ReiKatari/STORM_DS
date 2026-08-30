package b4;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j1 implements i1 {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f1866a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f1867b;

    public j1(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f1866a = new int[size];
        this.f1867b = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            this.f1866a[i2] = ((Integer) arrayList.get(i2)).intValue();
            this.f1867b[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    @Override // b4.i1
    public void a(View view, float[] fArr) {
        i3.e0.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        boolean z10 = parent instanceof View;
        float[] fArr2 = this.f1867b;
        if (z10) {
            b((View) parent, fArr);
            i3.e0.d(fArr2);
            i3.e0.f(fArr2, -view.getScrollX(), -view.getScrollY());
            l0.p(fArr, fArr2);
            i3.e0.d(fArr2);
            i3.e0.f(fArr2, view.getLeft(), view.getTop());
            l0.p(fArr, fArr2);
        } else {
            int[] iArr = this.f1866a;
            view.getLocationInWindow(iArr);
            i3.e0.d(fArr2);
            i3.e0.f(fArr2, -view.getScrollX(), -view.getScrollY());
            l0.p(fArr, fArr2);
            i3.e0.d(fArr2);
            i3.e0.f(fArr2, iArr[0], iArr[1]);
            l0.p(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            i3.z.t(matrix, fArr2);
            l0.p(fArr, fArr2);
        }
    }

    public j1(int i2, int i10) {
        this.f1866a = new int[]{i2, i10};
        this.f1867b = new float[]{0.0f, 1.0f};
    }

    public j1(int i2, int i10, int i11) {
        this.f1866a = new int[]{i2, i10, i11};
        this.f1867b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public j1(float[] fArr) {
        this.f1867b = fArr;
        this.f1866a = new int[2];
    }
}
