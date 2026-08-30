package defpackage;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pb7  reason: default package */
/* loaded from: classes.dex */
public abstract class pb7 {
    public jv3 a;
    public int[] b = new int[10];
    public float[] c = new float[10];
    public int d;
    public String e;

    public final float a(float f) {
        return (float) this.a.C(f);
    }

    public void b(int i, float f) {
        int[] iArr = this.b;
        if (iArr.length < this.d + 1) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.c;
            this.c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.d;
        iArr2[i2] = i;
        this.c[i2] = f;
        this.d = i2 + 1;
    }

    public abstract void c(View view, float f);

    public void d(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.b;
        float[] fArr = this.c;
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
                        float f = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = f;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float f2 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = f2;
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
        int i15 = 1;
        for (int i16 = 1; i16 < this.d; i16++) {
            int[] iArr3 = this.b;
            if (iArr3[i16 - 1] != iArr3[i16]) {
                i15++;
            }
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i15, 1);
        int i17 = 0;
        for (int i18 = 0; i18 < this.d; i18++) {
            if (i18 > 0) {
                int[] iArr4 = this.b;
                if (iArr4[i18] == iArr4[i18 - 1]) {
                }
            }
            dArr[i17] = this.b[i18] * 0.01d;
            dArr2[i17][0] = this.c[i18];
            i17++;
        }
        this.a = jv3.v(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.d; i++) {
            StringBuilder t = b31.t(str, "[");
            t.append(this.b[i]);
            t.append(" , ");
            t.append(decimalFormat.format(this.c[i]));
            t.append("] ");
            str = t.toString();
        }
        return str;
    }
}
