package g5;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: f  reason: collision with root package name */
    public SparseArray f5576f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f5577g;

    @Override // g5.l
    public final void b(int i2, float f8) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // g5.l
    public final void c(View view, float f8) {
        this.f5579a.b0(f8, this.f5577g);
        r.T((i5.b) this.f5576f.valueAt(0), view, this.f5577g);
    }

    @Override // g5.l
    public final void d(int i2) {
        float[] fArr;
        SparseArray sparseArray = this.f5576f;
        int size = sparseArray.size();
        int c4 = ((i5.b) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.f5577g = new float[c4];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, c4);
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = sparseArray.keyAt(i10) * 0.01d;
            ((i5.b) sparseArray.valueAt(i10)).b(this.f5577g);
            int i11 = 0;
            while (true) {
                if (i11 < this.f5577g.length) {
                    dArr2[i10][i11] = fArr[i11];
                    i11++;
                }
            }
        }
        this.f5579a = ij.a.O(i2, dArr, dArr2);
    }
}
