package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t80  reason: default package */
/* loaded from: classes.dex */
public final class t80 implements s80 {
    public final int[] a;
    public final float[] b;

    public t80(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.s80
    public void a(View view, float[] fArr) {
        kv3.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.b;
        if (z) {
            b((View) parent, fArr);
            kv3.d(fArr2);
            kv3.f(fArr2, -view.getScrollX(), -view.getScrollY());
            se.P(fArr, fArr2);
            kv3.d(fArr2);
            kv3.f(fArr2, view.getLeft(), view.getTop());
            se.P(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            kv3.d(fArr2);
            kv3.f(fArr2, -view.getScrollX(), -view.getScrollY());
            se.P(fArr, fArr2);
            kv3.d(fArr2);
            kv3.f(fArr2, iArr[0], iArr[1]);
            se.P(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            l07.q0(matrix, fArr2);
            se.P(fArr, fArr2);
        }
    }

    public t80(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{RecyclerView.A1, 1.0f};
    }

    public t80(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{RecyclerView.A1, 0.5f, 1.0f};
    }

    public t80(float[] fArr) {
        this.b = fArr;
        this.a = new int[2];
    }
}
