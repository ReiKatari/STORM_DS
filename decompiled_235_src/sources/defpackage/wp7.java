package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp7  reason: default package */
/* loaded from: classes.dex */
public abstract class wp7 {
    public ak7 a;
    public int e;
    public String f;
    public long i;
    public int b = 0;
    public int[] c = new int[10];
    public float[][] d = (float[][]) Array.newInstance(Float.TYPE, 10, 3);
    public float[] g = new float[3];
    public boolean h = false;
    public float j = Float.NaN;

    public final float a(float f) {
        switch (this.b) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                return 1.0f - Math.abs(f);
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                return 1.0f - (((f * 2.0f) + 1.0f) % 2.0f);
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float abs = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                return 1.0f - (abs * abs);
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
    }

    public final float b(float f, long j, ng3 ng3Var, View view) {
        this.a.b0(f, this.g);
        float[] fArr = this.g;
        boolean z = true;
        float f2 = fArr[1];
        int i = (f2 > RecyclerView.B1 ? 1 : (f2 == RecyclerView.B1 ? 0 : -1));
        if (i == 0) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float a = ng3Var.a(view, this.f);
            this.j = a;
            if (Float.isNaN(a)) {
                this.j = RecyclerView.B1;
            }
        }
        float f3 = (float) (((((j - this.i) * 1.0E-9d) * f2) + this.j) % 1.0d);
        this.j = f3;
        String str = this.f;
        HashMap hashMap = ng3Var.A;
        if (!hashMap.containsKey(view)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, new float[]{f3});
            hashMap.put(view, hashMap2);
        } else {
            HashMap hashMap3 = (HashMap) hashMap.get(view);
            if (hashMap3 == null) {
                hashMap3 = new HashMap();
            }
            if (!hashMap3.containsKey(str)) {
                hashMap3.put(str, new float[]{f3});
                hashMap.put(view, hashMap3);
            } else {
                float[] fArr2 = (float[]) hashMap3.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f3;
                hashMap3.put(str, fArr2);
            }
        }
        this.i = j;
        float f4 = this.g[0];
        float a2 = (a(this.j) * f4) + this.g[2];
        if (f4 == RecyclerView.B1 && i == 0) {
            z = false;
        }
        this.h = z;
        return a2;
    }

    public void c(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.c;
        int i3 = this.e;
        iArr[i3] = i;
        float[] fArr = this.d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.b = Math.max(this.b, i2);
        this.e++;
    }

    public abstract boolean d(float f, long j, ng3 ng3Var, View view);

    public void e(int i) {
        float[][] fArr = this.d;
        int[] iArr = this.c;
        int i2 = this.e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f);
            return;
        }
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            int i6 = i3 - 2;
            int i7 = iArr2[i6];
            if (i5 < i7) {
                int i8 = iArr[i7];
                int i9 = i5;
                int i10 = i9;
                while (i9 < i7) {
                    int i11 = iArr[i9];
                    if (i11 <= i8) {
                        int i12 = iArr[i10];
                        iArr[i10] = i11;
                        iArr[i9] = i12;
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
                iArr2[i6] = i10 - 1;
                iArr2[i4] = i5;
                int i14 = i3 + 1;
                iArr2[i3] = i7;
                i3 += 2;
                iArr2[i14] = i10 + 1;
            } else {
                i3 = i6;
            }
        }
        int i15 = 0;
        for (int i16 = 1; i16 < iArr.length; i16++) {
            if (iArr[i16] != iArr[i16 - 1]) {
                i15++;
            }
        }
        if (i15 == 0) {
            i15 = 1;
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i15, 3);
        int i17 = 0;
        for (int i18 = 0; i18 < this.e; i18++) {
            if (i18 <= 0 || iArr[i18] != iArr[i18 - 1]) {
                dArr[i17] = iArr[i18] * 0.01d;
                double[] dArr3 = dArr2[i17];
                float[] fArr4 = fArr[i18];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i17++;
            }
        }
        this.a = ak7.U(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.e; i++) {
            StringBuilder r = i61.r(str, "[");
            r.append(this.c[i]);
            r.append(" , ");
            r.append(decimalFormat.format(this.d[i]));
            r.append("] ");
            str = r.toString();
        }
        return str;
    }
}
