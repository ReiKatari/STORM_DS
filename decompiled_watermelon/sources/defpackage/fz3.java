package defpackage;

import java.lang.reflect.Array;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fz3  reason: default package */
/* loaded from: classes.dex */
public final class fz3 extends jv3 {
    public final double[] p;
    public final double[][] q;
    public final double[][] r;
    public final double[] s;

    public fz3(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.s = new double[length2];
        int i = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance(cls, i, length2);
        double[][] dArr4 = (double[][]) Array.newInstance(cls, length, length2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                double d = dArr[i4] - dArr[i3];
                double[] dArr5 = dArr3[i3];
                double d2 = (dArr2[i4][i2] - dArr2[i3][i2]) / d;
                dArr5[i2] = d2;
                if (i3 == 0) {
                    dArr4[i3][i2] = d2;
                } else {
                    dArr4[i3][i2] = (dArr3[i3 - 1][i2] + d2) * 0.5d;
                }
                i3 = i4;
            }
            dArr4[i][i2] = dArr3[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                double d3 = dArr3[i5][i6];
                if (d3 == 0.0d) {
                    dArr4[i5][i6] = 0.0d;
                    dArr4[i5 + 1][i6] = 0.0d;
                } else {
                    double d4 = dArr4[i5][i6] / d3;
                    int i7 = i5 + 1;
                    double d5 = dArr4[i7][i6] / d3;
                    double hypot = Math.hypot(d4, d5);
                    if (hypot > 9.0d) {
                        double d6 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i5];
                        double[] dArr7 = dArr3[i5];
                        dArr6[i6] = d4 * d6 * dArr7[i6];
                        dArr4[i7][i6] = d6 * d5 * dArr7[i6];
                    }
                }
            }
        }
        this.p = dArr;
        this.q = dArr2;
        this.r = dArr4;
    }

    public static double j0(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 6.0d * d7 * d3;
        double d10 = 3.0d * d;
        double d11 = d10 * d6 * d7;
        return (d * d5) + (((((d10 * d5) * d7) + (d11 + ((d9 + ((d8 * d4) + (((-6.0d) * d7) * d4))) - (d8 * d3)))) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2));
    }

    public static double l0(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d9 * d4;
        double d11 = d * d6;
        double d12 = d11 * d8;
        double d13 = d * d5;
        return (d13 * d2) + ((((d8 * d13) + (d12 + (((((d8 * 2.0d) * d3) + (d10 + (((-2.0d) * d8) * d4))) - (d9 * d3)) + d3))) - (d11 * d7)) - (((d * 2.0d) * d5) * d7));
    }

    @Override // defpackage.jv3
    public final double C(double d) {
        double[] dArr = this.p;
        int length = dArr.length;
        double d2 = dArr[0];
        int i = (d > d2 ? 1 : (d == d2 ? 0 : -1));
        double[][] dArr2 = this.q;
        if (i <= 0) {
            return (k0(d2) * (d - d2)) + dArr2[0][0];
        }
        int i2 = length - 1;
        double d3 = dArr[i2];
        if (d >= d3) {
            return (k0(d3) * (d - d3)) + dArr2[i2][0];
        }
        int i3 = 0;
        while (i3 < i2) {
            double d4 = dArr[i3];
            if (d == d4) {
                return dArr2[i3][0];
            }
            int i4 = i3 + 1;
            double d5 = dArr[i4];
            if (d < d5) {
                double d6 = d5 - d4;
                double d7 = (d - d4) / d6;
                double d8 = dArr2[i3][0];
                double d9 = dArr2[i4][0];
                double[][] dArr3 = this.r;
                return l0(d6, d7, d8, d9, dArr3[i3][0], dArr3[i4][0]);
            }
            i3 = i4;
        }
        return 0.0d;
    }

    @Override // defpackage.jv3
    public final void D(double d, double[] dArr) {
        double[] dArr2 = this.p;
        int length = dArr2.length;
        double[][] dArr3 = this.q;
        int i = 0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        int i2 = (d > d2 ? 1 : (d == d2 ? 0 : -1));
        double[] dArr4 = this.s;
        if (i2 <= 0) {
            G(d2, dArr4);
            for (int i3 = 0; i3 < length2; i3++) {
                dArr[i3] = ((d - dArr2[0]) * dArr4[i3]) + dArr3[0][i3];
            }
            return;
        }
        int i4 = length - 1;
        double d3 = dArr2[i4];
        if (d >= d3) {
            G(d3, dArr4);
            while (i < length2) {
                dArr[i] = ((d - dArr2[i4]) * dArr4[i]) + dArr3[i4][i];
                i++;
            }
            return;
        }
        int i5 = 0;
        while (i5 < i4) {
            if (d == dArr2[i5]) {
                for (int i6 = 0; i6 < length2; i6++) {
                    dArr[i6] = dArr3[i5][i6];
                }
            }
            int i7 = i5 + 1;
            double d4 = dArr2[i7];
            if (d < d4) {
                double d5 = dArr2[i5];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double d8 = dArr3[i5][i];
                    double d9 = dArr3[i7][i];
                    double[][] dArr5 = this.r;
                    dArr[i] = l0(d6, d7, d8, d9, dArr5[i5][i], dArr5[i7][i]);
                    i++;
                }
                return;
            }
            i5 = i7;
        }
    }

    @Override // defpackage.jv3
    public final void E(double d, float[] fArr) {
        double[] dArr = this.p;
        int length = dArr.length;
        double[][] dArr2 = this.q;
        int i = 0;
        int length2 = dArr2[0].length;
        double d2 = dArr[0];
        int i2 = (d > d2 ? 1 : (d == d2 ? 0 : -1));
        double[] dArr3 = this.s;
        if (i2 <= 0) {
            G(d2, dArr3);
            for (int i3 = 0; i3 < length2; i3++) {
                fArr[i3] = (float) (((d - dArr[0]) * dArr3[i3]) + dArr2[0][i3]);
            }
            return;
        }
        int i4 = length - 1;
        double d3 = dArr[i4];
        if (d >= d3) {
            G(d3, dArr3);
            while (i < length2) {
                fArr[i] = (float) (((d - dArr[i4]) * dArr3[i]) + dArr2[i4][i]);
                i++;
            }
            return;
        }
        int i5 = 0;
        while (i5 < i4) {
            if (d == dArr[i5]) {
                for (int i6 = 0; i6 < length2; i6++) {
                    fArr[i6] = (float) dArr2[i5][i6];
                }
            }
            int i7 = i5 + 1;
            double d4 = dArr[i7];
            if (d < d4) {
                double d5 = dArr[i5];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double d8 = dArr2[i5][i];
                    double d9 = dArr2[i7][i];
                    double[][] dArr4 = this.r;
                    fArr[i] = (float) l0(d6, d7, d8, d9, dArr4[i5][i], dArr4[i7][i]);
                    i++;
                }
                return;
            }
            i5 = i7;
        }
    }

    @Override // defpackage.jv3
    public final void G(double d, double[] dArr) {
        double[] dArr2 = this.p;
        int length = dArr2.length;
        double[][] dArr3 = this.q;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d2 <= d3) {
                double d4 = dArr2[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i3 = 0; i3 < length2; i3++) {
                    double d7 = dArr3[i][i3];
                    double d8 = dArr3[i2][i3];
                    double[][] dArr4 = this.r;
                    dArr[i3] = j0(d5, d6, d7, d8, dArr4[i][i3], dArr4[i2][i3]) / d5;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // defpackage.jv3
    public final double[] H() {
        return this.p;
    }

    public final double k0(double d) {
        double[] dArr = this.p;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr[i2];
            if (d2 <= d3) {
                double d4 = dArr[i];
                double d5 = d3 - d4;
                double[][] dArr2 = this.q;
                double d6 = dArr2[i][0];
                double d7 = dArr2[i2][0];
                double[][] dArr3 = this.r;
                return j0(d5, (d2 - d4) / d5, d6, d7, dArr3[i][0], dArr3[i2][0]) / d5;
            }
            i = i2;
        }
        return 0.0d;
    }
}
