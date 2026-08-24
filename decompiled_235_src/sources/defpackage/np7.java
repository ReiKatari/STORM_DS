package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np7  reason: default package */
/* loaded from: classes.dex */
public final class np7 extends qp7 {
    public SparseArray f;
    public float[] g;

    @Override // defpackage.qp7
    public final void b(int i, float f) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // defpackage.qp7
    public final void c(View view, float f) {
        this.a.b0(f, this.g);
        l.M((j11) this.f.valueAt(0), view, this.g);
    }

    @Override // defpackage.qp7
    public final void d(int i) {
        float[] fArr;
        SparseArray sparseArray = this.f;
        int size = sparseArray.size();
        int c = ((j11) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.g = new float[c];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, c);
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = sparseArray.keyAt(i2) * 0.01d;
            ((j11) sparseArray.valueAt(i2)).b(this.g);
            int i3 = 0;
            while (true) {
                if (i3 < this.g.length) {
                    dArr2[i2][i3] = fArr[i3];
                    i3++;
                }
            }
        }
        this.a = ak7.U(i, dArr, dArr2);
    }
}
