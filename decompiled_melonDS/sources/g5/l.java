package g5;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public ij.a f5579a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5580b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    public float[] f5581c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    public int f5582d;

    /* renamed from: e  reason: collision with root package name */
    public String f5583e;

    public final float a(float f8) {
        return (float) this.f5579a.Z(f8);
    }

    public void b(int i2, float f8) {
        int[] iArr = this.f5580b;
        if (iArr.length < this.f5582d + 1) {
            this.f5580b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f5581c;
            this.f5581c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f5580b;
        int i10 = this.f5582d;
        iArr2[i10] = i2;
        this.f5581c[i10] = f8;
        this.f5582d = i10 + 1;
    }

    public abstract void c(View view, float f8);

    public void d(int i2) {
        int i10 = this.f5582d;
        if (i10 == 0) {
            return;
        }
        int[] iArr = this.f5580b;
        float[] fArr = this.f5581c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i10 - 1;
        iArr2[1] = 0;
        int i11 = 2;
        while (i11 > 0) {
            int i12 = i11 - 1;
            int i13 = iArr2[i12];
            int i14 = i11 - 2;
            int i15 = iArr2[i14];
            if (i13 < i15) {
                int i16 = iArr[i15];
                int i17 = i13;
                int i18 = i17;
                while (i17 < i15) {
                    int i19 = iArr[i17];
                    if (i19 <= i16) {
                        int i20 = iArr[i18];
                        iArr[i18] = i19;
                        iArr[i17] = i20;
                        float f8 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = f8;
                        i18++;
                    }
                    i17++;
                }
                int i21 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i21;
                float f10 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = f10;
                iArr2[i14] = i18 - 1;
                iArr2[i12] = i13;
                int i22 = i11 + 1;
                iArr2[i11] = i15;
                i11 += 2;
                iArr2[i22] = i18 + 1;
            } else {
                i11 = i14;
            }
        }
        int i23 = 1;
        for (int i24 = 1; i24 < this.f5582d; i24++) {
            int[] iArr3 = this.f5580b;
            if (iArr3[i24 - 1] != iArr3[i24]) {
                i23++;
            }
        }
        double[] dArr = new double[i23];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i23, 1);
        int i25 = 0;
        for (int i26 = 0; i26 < this.f5582d; i26++) {
            if (i26 > 0) {
                int[] iArr4 = this.f5580b;
                if (iArr4[i26] == iArr4[i26 - 1]) {
                }
            }
            dArr[i25] = this.f5580b[i26] * 0.01d;
            dArr2[i25][0] = this.f5581c[i26];
            i25++;
        }
        this.f5579a = ij.a.O(i2, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f5583e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.f5582d; i2++) {
            str = str + "[" + this.f5580b[i2] + " , " + decimalFormat.format(this.f5581c[i2]) + "] ";
        }
        return str;
    }
}
