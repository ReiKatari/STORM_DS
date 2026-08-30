package d5;

import java.lang.reflect.Array;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public final double[] f3855e;

    /* renamed from: f  reason: collision with root package name */
    public final double[][] f3856f;

    /* renamed from: g  reason: collision with root package name */
    public final double[][] f3857g;

    /* renamed from: h  reason: collision with root package name */
    public final double[] f3858h;

    public i(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f3858h = new double[length2];
        int i2 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance(cls, i2, length2);
        double[][] dArr4 = (double[][]) Array.newInstance(cls, length, length2);
        for (int i10 = 0; i10 < length2; i10++) {
            int i11 = 0;
            while (i11 < i2) {
                int i12 = i11 + 1;
                double d4 = dArr[i12] - dArr[i11];
                double[] dArr5 = dArr3[i11];
                double d10 = (dArr2[i12][i10] - dArr2[i11][i10]) / d4;
                dArr5[i10] = d10;
                if (i11 == 0) {
                    dArr4[i11][i10] = d10;
                } else {
                    dArr4[i11][i10] = (dArr3[i11 - 1][i10] + d10) * 0.5d;
                }
                i11 = i12;
            }
            dArr4[i2][i10] = dArr3[length - 2][i10];
        }
        for (int i13 = 0; i13 < i2; i13++) {
            for (int i14 = 0; i14 < length2; i14++) {
                double d11 = dArr3[i13][i14];
                if (d11 == 0.0d) {
                    dArr4[i13][i14] = 0.0d;
                    dArr4[i13 + 1][i14] = 0.0d;
                } else {
                    double d12 = dArr4[i13][i14] / d11;
                    int i15 = i13 + 1;
                    double d13 = dArr4[i15][i14] / d11;
                    double hypot = Math.hypot(d12, d13);
                    if (hypot > 9.0d) {
                        double d14 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i13];
                        double[] dArr7 = dArr3[i13];
                        dArr6[i14] = d12 * d14 * dArr7[i14];
                        dArr4[i15][i14] = d14 * d13 * dArr7[i14];
                    }
                }
            }
        }
        this.f3855e = dArr;
        this.f3856f = dArr2;
        this.f3857g = dArr4;
    }

    public static double B0(double d4, double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 * d10;
        double d16 = d10 * 6.0d;
        double d17 = 6.0d * d15 * d11;
        double d18 = 3.0d * d4;
        double d19 = d18 * d14 * d15;
        return (d4 * d13) + (((((d18 * d13) * d15) + (d19 + ((d17 + ((d16 * d12) + (((-6.0d) * d15) * d12))) - (d16 * d11)))) - (((2.0d * d4) * d14) * d10)) - (((4.0d * d4) * d13) * d10));
    }

    public static double D0(double d4, double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 * d10;
        double d16 = d15 * d10;
        double d17 = 3.0d * d15;
        double d18 = d17 * d12;
        double d19 = d4 * d14;
        double d20 = d19 * d16;
        double d21 = d4 * d13;
        return (d21 * d10) + ((((d16 * d21) + (d20 + (((((d16 * 2.0d) * d11) + (d18 + (((-2.0d) * d16) * d12))) - (d17 * d11)) + d11))) - (d19 * d15)) - (((d4 * 2.0d) * d13) * d15));
    }

    public final double C0(double d4) {
        double[] dArr = this.f3855e;
        int length = dArr.length;
        double d10 = dArr[0];
        if (d4 >= d10) {
            d10 = dArr[length - 1];
            if (d4 < d10) {
                d10 = d4;
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            int i10 = i2 + 1;
            double d11 = dArr[i10];
            if (d10 <= d11) {
                double d12 = dArr[i2];
                double d13 = d11 - d12;
                double[][] dArr2 = this.f3856f;
                double d14 = dArr2[i2][0];
                double d15 = dArr2[i10][0];
                double[][] dArr3 = this.f3857g;
                return B0(d13, (d10 - d12) / d13, d14, d15, dArr3[i2][0], dArr3[i10][0]) / d13;
            }
            i2 = i10;
        }
        return 0.0d;
    }

    @Override // ij.a
    public final double Z(double d4) {
        double d10;
        double d11;
        double C0;
        double[] dArr = this.f3855e;
        int length = dArr.length;
        double d12 = dArr[0];
        int i2 = (d4 > d12 ? 1 : (d4 == d12 ? 0 : -1));
        double[][] dArr2 = this.f3856f;
        if (i2 <= 0) {
            d10 = dArr2[0][0];
            d11 = d4 - d12;
            C0 = C0(d12);
        } else {
            int i10 = length - 1;
            double d13 = dArr[i10];
            if (d4 >= d13) {
                d10 = dArr2[i10][0];
                d11 = d4 - d13;
                C0 = C0(d13);
            } else {
                int i11 = 0;
                while (i11 < i10) {
                    double d14 = dArr[i11];
                    if (d4 == d14) {
                        return dArr2[i11][0];
                    }
                    int i12 = i11 + 1;
                    double d15 = dArr[i12];
                    if (d4 < d15) {
                        double d16 = d15 - d14;
                        double d17 = (d4 - d14) / d16;
                        double d18 = dArr2[i11][0];
                        double d19 = dArr2[i12][0];
                        double[][] dArr3 = this.f3857g;
                        return D0(d16, d17, d18, d19, dArr3[i11][0], dArr3[i12][0]);
                    }
                    i11 = i12;
                }
                return 0.0d;
            }
        }
        return (C0 * d11) + d10;
    }

    @Override // ij.a
    public final void a0(double d4, double[] dArr) {
        double[] dArr2 = this.f3855e;
        int length = dArr2.length;
        double[][] dArr3 = this.f3856f;
        int i2 = 0;
        int length2 = dArr3[0].length;
        double d10 = dArr2[0];
        int i10 = (d4 > d10 ? 1 : (d4 == d10 ? 0 : -1));
        double[] dArr4 = this.f3858h;
        if (i10 <= 0) {
            e0(d10, dArr4);
            for (int i11 = 0; i11 < length2; i11++) {
                dArr[i11] = ((d4 - dArr2[0]) * dArr4[i11]) + dArr3[0][i11];
            }
            return;
        }
        int i12 = length - 1;
        double d11 = dArr2[i12];
        if (d4 >= d11) {
            e0(d11, dArr4);
            while (i2 < length2) {
                dArr[i2] = ((d4 - dArr2[i12]) * dArr4[i2]) + dArr3[i12][i2];
                i2++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            if (d4 == dArr2[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = dArr3[i13][i14];
                }
            }
            int i15 = i13 + 1;
            double d12 = dArr2[i15];
            if (d4 < d12) {
                double d13 = dArr2[i13];
                double d14 = d12 - d13;
                double d15 = (d4 - d13) / d14;
                while (i2 < length2) {
                    double d16 = dArr3[i13][i2];
                    double d17 = dArr3[i15][i2];
                    double[][] dArr5 = this.f3857g;
                    dArr[i2] = D0(d14, d15, d16, d17, dArr5[i13][i2], dArr5[i15][i2]);
                    i2++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // ij.a
    public final void b0(double d4, float[] fArr) {
        double[] dArr = this.f3855e;
        int length = dArr.length;
        double[][] dArr2 = this.f3856f;
        int i2 = 0;
        int length2 = dArr2[0].length;
        double d10 = dArr[0];
        int i10 = (d4 > d10 ? 1 : (d4 == d10 ? 0 : -1));
        double[] dArr3 = this.f3858h;
        if (i10 <= 0) {
            e0(d10, dArr3);
            for (int i11 = 0; i11 < length2; i11++) {
                fArr[i11] = (float) (((d4 - dArr[0]) * dArr3[i11]) + dArr2[0][i11]);
            }
            return;
        }
        int i12 = length - 1;
        double d11 = dArr[i12];
        if (d4 >= d11) {
            e0(d11, dArr3);
            while (i2 < length2) {
                fArr[i2] = (float) (((d4 - dArr[i12]) * dArr3[i2]) + dArr2[i12][i2]);
                i2++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            if (d4 == dArr[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) dArr2[i13][i14];
                }
            }
            int i15 = i13 + 1;
            double d12 = dArr[i15];
            if (d4 < d12) {
                double d13 = dArr[i13];
                double d14 = d12 - d13;
                double d15 = (d4 - d13) / d14;
                while (i2 < length2) {
                    double d16 = dArr2[i13][i2];
                    double d17 = dArr2[i15][i2];
                    double[][] dArr4 = this.f3857g;
                    fArr[i2] = (float) D0(d14, d15, d16, d17, dArr4[i13][i2], dArr4[i15][i2]);
                    i2++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // ij.a
    public final void e0(double d4, double[] dArr) {
        double[] dArr2 = this.f3855e;
        int length = dArr2.length;
        double[][] dArr3 = this.f3856f;
        int length2 = dArr3[0].length;
        double d10 = dArr2[0];
        if (d4 > d10) {
            d10 = dArr2[length - 1];
            if (d4 < d10) {
                d10 = d4;
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            int i10 = i2 + 1;
            double d11 = dArr2[i10];
            if (d10 <= d11) {
                double d12 = dArr2[i2];
                double d13 = d11 - d12;
                double d14 = (d10 - d12) / d13;
                for (int i11 = 0; i11 < length2; i11++) {
                    double d15 = dArr3[i2][i11];
                    double d16 = dArr3[i10][i11];
                    double[][] dArr4 = this.f3857g;
                    dArr[i11] = B0(d13, d14, d15, d16, dArr4[i2][i11], dArr4[i10][i11]) / d13;
                }
                return;
            }
            i2 = i10;
        }
    }

    @Override // ij.a
    public final double[] h0() {
        return this.f3855e;
    }
}
