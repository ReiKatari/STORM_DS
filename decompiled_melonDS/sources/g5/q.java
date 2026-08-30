package g5;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public ij.a f5589a;

    /* renamed from: e  reason: collision with root package name */
    public int f5593e;

    /* renamed from: f  reason: collision with root package name */
    public String f5594f;

    /* renamed from: i  reason: collision with root package name */
    public long f5597i;

    /* renamed from: b  reason: collision with root package name */
    public int f5590b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int[] f5591c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    public float[][] f5592d = (float[][]) Array.newInstance(Float.TYPE, 10, 3);

    /* renamed from: g  reason: collision with root package name */
    public float[] f5595g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    public boolean f5596h = false;

    /* renamed from: j  reason: collision with root package name */
    public float f5598j = Float.NaN;

    public final float a(float f8) {
        float abs;
        switch (this.f5590b) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return Math.signum(f8 * 6.2831855f);
            case 2:
                abs = Math.abs(f8);
                break;
            case 3:
                return (((f8 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f8 * 2.0f) + 1.0f) % 2.0f;
                break;
            case l1.c.f8511g /* 5 */:
                return (float) Math.cos(f8 * 6.2831855f);
            case l1.c.f8509e /* 6 */:
                float abs2 = 1.0f - Math.abs(((f8 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f8 * 6.2831855f);
        }
        return 1.0f - abs;
    }

    public final float b(float f8, long j2, View view, d5.e eVar) {
        this.f5589a.b0(f8, this.f5595g);
        float[] fArr = this.f5595g;
        boolean z10 = true;
        float f10 = fArr[1];
        int i2 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            this.f5596h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f5598j)) {
            float c4 = eVar.c(view, this.f5594f);
            this.f5598j = c4;
            if (Float.isNaN(c4)) {
                this.f5598j = 0.0f;
            }
        }
        float f11 = (float) (((((j2 - this.f5597i) * 1.0E-9d) * f10) + this.f5598j) % 1.0d);
        this.f5598j = f11;
        String str = this.f5594f;
        HashMap hashMap = (HashMap) eVar.f3838b;
        if (!hashMap.containsKey(view)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, new float[]{f11});
            hashMap.put(view, hashMap2);
        } else {
            HashMap hashMap3 = (HashMap) hashMap.get(view);
            if (hashMap3 == null) {
                hashMap3 = new HashMap();
            }
            if (!hashMap3.containsKey(str)) {
                hashMap3.put(str, new float[]{f11});
                hashMap.put(view, hashMap3);
            } else {
                float[] fArr2 = (float[]) hashMap3.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f11;
                hashMap3.put(str, fArr2);
            }
        }
        this.f5597i = j2;
        float f12 = this.f5595g[0];
        float a10 = (a(this.f5598j) * f12) + this.f5595g[2];
        if (f12 == 0.0f && i2 == 0) {
            z10 = false;
        }
        this.f5596h = z10;
        return a10;
    }

    public void c(int i2, float f8, float f10, int i10, float f11) {
        int[] iArr = this.f5591c;
        int i11 = this.f5593e;
        iArr[i11] = i2;
        float[] fArr = this.f5592d[i11];
        fArr[0] = f8;
        fArr[1] = f10;
        fArr[2] = f11;
        this.f5590b = Math.max(this.f5590b, i10);
        this.f5593e++;
    }

    public abstract boolean d(float f8, long j2, View view, d5.e eVar);

    public void e(int i2) {
        float[][] fArr = this.f5592d;
        int[] iArr = this.f5591c;
        int i10 = this.f5593e;
        if (i10 == 0) {
            System.err.println("Error no points added to " + this.f5594f);
            return;
        }
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
                        float[] fArr2 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = fArr2;
                        i18++;
                    }
                    i17++;
                }
                int i21 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i21;
                float[] fArr3 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = fArr3;
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
        int i23 = 0;
        for (int i24 = 1; i24 < iArr.length; i24++) {
            if (iArr[i24] != iArr[i24 - 1]) {
                i23++;
            }
        }
        if (i23 == 0) {
            i23 = 1;
        }
        double[] dArr = new double[i23];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i23, 3);
        int i25 = 0;
        for (int i26 = 0; i26 < this.f5593e; i26++) {
            if (i26 <= 0 || iArr[i26] != iArr[i26 - 1]) {
                dArr[i25] = iArr[i26] * 0.01d;
                double[] dArr3 = dArr2[i25];
                float[] fArr4 = fArr[i26];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i25++;
            }
        }
        this.f5589a = ij.a.O(i2, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f5594f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.f5593e; i2++) {
            str = str + "[" + this.f5591c[i2] + " , " + decimalFormat.format(this.f5592d[i2]) + "] ";
        }
        return str;
    }
}
