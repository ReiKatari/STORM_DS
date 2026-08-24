package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bb0  reason: default package */
/* loaded from: classes.dex */
public final class bb0 implements ab0 {
    public final int[] a;
    public final float[] b;

    public bb0(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.ab0
    public void a(View view, float[] fArr) {
        v24.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.b;
        if (z) {
            b((View) parent, fArr);
            v24.d(fArr2);
            v24.f(fArr2, -view.getScrollX(), -view.getScrollY());
            hf.g0(fArr, fArr2);
            v24.d(fArr2);
            v24.f(fArr2, view.getLeft(), view.getTop());
            hf.g0(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            v24.d(fArr2);
            v24.f(fArr2, -view.getScrollX(), -view.getScrollY());
            hf.g0(fArr, fArr2);
            v24.d(fArr2);
            v24.f(fArr2, iArr[0], iArr[1]);
            hf.g0(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            hv.Y(matrix, fArr2);
            hf.g0(fArr, fArr2);
        }
    }

    public bb0(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{RecyclerView.B1, 1.0f};
    }

    public bb0(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{RecyclerView.B1, 0.5f, 1.0f};
    }

    public bb0(float[] fArr) {
        this.b = fArr;
        this.a = new int[2];
    }
}
