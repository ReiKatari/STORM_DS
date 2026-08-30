package g5;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: k  reason: collision with root package name */
    public String f5585k;

    /* renamed from: l  reason: collision with root package name */
    public SparseArray f5586l;
    public SparseArray m;

    /* renamed from: n  reason: collision with root package name */
    public float[] f5587n;

    @Override // g5.q
    public final void c(int i2, float f8, float f10, int i10, float f11) {
        throw new RuntimeException("Wrong call for custom attribute");
    }

    @Override // g5.q
    public final boolean d(float f8, long j2, View view, d5.e eVar) {
        boolean z10;
        this.f5589a.b0(f8, this.f5587n);
        float[] fArr = this.f5587n;
        float f10 = fArr[fArr.length - 2];
        float f11 = fArr[fArr.length - 1];
        long j10 = j2 - this.f5597i;
        if (Float.isNaN(this.f5598j)) {
            float c4 = eVar.c(view, this.f5585k);
            this.f5598j = c4;
            if (Float.isNaN(c4)) {
                this.f5598j = 0.0f;
            }
        }
        float f12 = (float) ((((j10 * 1.0E-9d) * f10) + this.f5598j) % 1.0d);
        this.f5598j = f12;
        this.f5597i = j2;
        float a10 = a(f12);
        this.f5596h = false;
        int i2 = 0;
        while (true) {
            float[] fArr2 = this.f5595g;
            if (i2 >= fArr2.length) {
                break;
            }
            boolean z11 = this.f5596h;
            float f13 = this.f5587n[i2];
            if (f13 != 0.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f5596h = z11 | z10;
            fArr2[i2] = (f13 * a10) + f11;
            i2++;
        }
        r.T((i5.b) this.f5586l.valueAt(0), view, this.f5595g);
        if (f10 != 0.0f) {
            this.f5596h = true;
        }
        return this.f5596h;
    }

    @Override // g5.q
    public final void e(int i2) {
        float[] fArr;
        SparseArray sparseArray = this.f5586l;
        int size = sparseArray.size();
        int c4 = ((i5.b) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        int i10 = c4 + 2;
        this.f5587n = new float[i10];
        this.f5595g = new float[c4];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i10);
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = sparseArray.keyAt(i11);
            float[] fArr2 = (float[]) this.m.valueAt(i11);
            dArr[i11] = keyAt * 0.01d;
            ((i5.b) sparseArray.valueAt(i11)).b(this.f5587n);
            int i12 = 0;
            while (true) {
                if (i12 < this.f5587n.length) {
                    dArr2[i11][i12] = fArr[i12];
                    i12++;
                }
            }
            double[] dArr3 = dArr2[i11];
            dArr3[c4] = fArr2[0];
            dArr3[c4 + 1] = fArr2[1];
        }
        this.f5589a = ij.a.O(i2, dArr, dArr2);
    }
}
