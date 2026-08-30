package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mb7  reason: default package */
/* loaded from: classes.dex */
public final class mb7 extends pb7 {
    public SparseArray f;
    public float[] g;

    @Override // defpackage.pb7
    public final void b(int i, float f) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // defpackage.pb7
    public final void c(View view, float f) {
        this.a.E(f, this.g);
        l07.r0((ey0) this.f.valueAt(0), view, this.g);
    }

    @Override // defpackage.pb7
    public final void d(int i) {
        float[] fArr;
        SparseArray sparseArray = this.f;
        int size = sparseArray.size();
        int c = ((ey0) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.g = new float[c];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, c);
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = sparseArray.keyAt(i2) * 0.01d;
            ((ey0) sparseArray.valueAt(i2)).b(this.g);
            int i3 = 0;
            while (true) {
                if (i3 < this.g.length) {
                    dArr2[i2][i3] = fArr[i3];
                    i3++;
                }
            }
        }
        this.a = jv3.v(i, dArr, dArr2);
    }
}
