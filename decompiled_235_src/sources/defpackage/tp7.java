package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tp7  reason: default package */
/* loaded from: classes.dex */
public final class tp7 extends wp7 {
    public String k;
    public SparseArray l;
    public SparseArray m;
    public float[] n;

    @Override // defpackage.wp7
    public final void c(int i, float f, float f2, int i2, float f3) {
        throw new RuntimeException("Wrong call for custom attribute");
    }

    @Override // defpackage.wp7
    public final boolean d(float f, long j, ng3 ng3Var, View view) {
        boolean z;
        this.a.b0(f, this.n);
        float[] fArr = this.n;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.i;
        if (Float.isNaN(this.j)) {
            float a = ng3Var.a(view, this.k);
            this.j = a;
            if (Float.isNaN(a)) {
                this.j = RecyclerView.B1;
            }
        }
        float f4 = (float) ((((j2 * 1.0E-9d) * f2) + this.j) % 1.0d);
        this.j = f4;
        this.i = j;
        float a2 = a(f4);
        this.h = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.g;
            if (i >= fArr2.length) {
                break;
            }
            boolean z2 = this.h;
            float f5 = this.n[i];
            if (f5 != 0.0d) {
                z = true;
            } else {
                z = false;
            }
            this.h = z2 | z;
            fArr2[i] = (f5 * a2) + f3;
            i++;
        }
        l.M((j11) this.l.valueAt(0), view, this.g);
        if (f2 != RecyclerView.B1) {
            this.h = true;
        }
        return this.h;
    }

    @Override // defpackage.wp7
    public final void e(int i) {
        float[] fArr;
        SparseArray sparseArray = this.l;
        int size = sparseArray.size();
        int c = ((j11) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        int i2 = c + 2;
        this.n = new float[i2];
        this.g = new float[c];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            float[] fArr2 = (float[]) this.m.valueAt(i3);
            dArr[i3] = keyAt * 0.01d;
            ((j11) sparseArray.valueAt(i3)).b(this.n);
            int i4 = 0;
            while (true) {
                if (i4 < this.n.length) {
                    dArr2[i3][i4] = fArr[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[c] = fArr2[0];
            dArr3[c + 1] = fArr2[1];
        }
        this.a = ak7.U(i, dArr, dArr2);
    }
}
