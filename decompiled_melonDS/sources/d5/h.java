package d5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public double[] f3852e;

    /* renamed from: f  reason: collision with root package name */
    public double[][] f3853f;

    /* renamed from: g  reason: collision with root package name */
    public double[] f3854g;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r9 >= r3) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double B0(double r9) {
        /*
            r8 = this;
            double[] r0 = r8.f3852e
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r9 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L15
            goto La
        L15:
            r3 = r2
        L16:
            int r4 = r1 + (-1)
            if (r3 >= r4) goto L34
            int r4 = r3 + 1
            r5 = r0[r4]
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L32
            r9 = r0[r3]
            double r5 = r5 - r9
            double[][] r9 = r8.f3853f
            r10 = r9[r3]
            r0 = r10[r2]
            r9 = r9[r4]
            r2 = r9[r2]
            double r2 = r2 - r0
            double r2 = r2 / r5
            return r2
        L32:
            r3 = r4
            goto L16
        L34:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.h.B0(double):double");
    }

    @Override // ij.a
    public final double Z(double d4) {
        double d10;
        double d11;
        double B0;
        double[][] dArr = this.f3853f;
        double[] dArr2 = this.f3852e;
        int length = dArr2.length;
        double d12 = dArr2[0];
        if (d4 <= d12) {
            d10 = dArr[0][0];
            d11 = d4 - d12;
            B0 = B0(d12);
        } else {
            int i2 = length - 1;
            double d13 = dArr2[i2];
            if (d4 >= d13) {
                d10 = dArr[i2][0];
                d11 = d4 - d13;
                B0 = B0(d13);
            } else {
                int i10 = 0;
                while (i10 < i2) {
                    double d14 = dArr2[i10];
                    if (d4 == d14) {
                        return dArr[i10][0];
                    }
                    int i11 = i10 + 1;
                    double d15 = dArr2[i11];
                    if (d4 < d15) {
                        double d16 = (d4 - d14) / (d15 - d14);
                        return (dArr[i11][0] * d16) + ((1.0d - d16) * dArr[i10][0]);
                    }
                    i10 = i11;
                }
                return 0.0d;
            }
        }
        return (B0 * d11) + d10;
    }

    @Override // ij.a
    public final void a0(double d4, double[] dArr) {
        double[] dArr2 = this.f3854g;
        double[] dArr3 = this.f3852e;
        int length = dArr3.length;
        double[][] dArr4 = this.f3853f;
        int i2 = 0;
        int length2 = dArr4[0].length;
        double d10 = dArr3[0];
        if (d4 <= d10) {
            e0(d10, dArr2);
            for (int i10 = 0; i10 < length2; i10++) {
                dArr[i10] = ((d4 - dArr3[0]) * dArr2[i10]) + dArr4[0][i10];
            }
            return;
        }
        int i11 = length - 1;
        double d11 = dArr3[i11];
        if (d4 >= d11) {
            e0(d11, dArr2);
            while (i2 < length2) {
                dArr[i2] = ((d4 - dArr3[i11]) * dArr2[i2]) + dArr4[i11][i2];
                i2++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d4 == dArr3[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = dArr4[i12][i13];
                }
            }
            int i14 = i12 + 1;
            double d12 = dArr3[i14];
            if (d4 < d12) {
                double d13 = dArr3[i12];
                double d14 = (d4 - d13) / (d12 - d13);
                while (i2 < length2) {
                    dArr[i2] = (dArr4[i14][i2] * d14) + ((1.0d - d14) * dArr4[i12][i2]);
                    i2++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // ij.a
    public final void b0(double d4, float[] fArr) {
        double[] dArr = this.f3854g;
        double[] dArr2 = this.f3852e;
        int length = dArr2.length;
        double[][] dArr3 = this.f3853f;
        int i2 = 0;
        int length2 = dArr3[0].length;
        double d10 = dArr2[0];
        if (d4 <= d10) {
            e0(d10, dArr);
            for (int i10 = 0; i10 < length2; i10++) {
                fArr[i10] = (float) (((d4 - dArr2[0]) * dArr[i10]) + dArr3[0][i10]);
            }
            return;
        }
        int i11 = length - 1;
        double d11 = dArr2[i11];
        if (d4 >= d11) {
            e0(d11, dArr);
            while (i2 < length2) {
                fArr[i2] = (float) (((d4 - dArr2[i11]) * dArr[i2]) + dArr3[i11][i2]);
                i2++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d4 == dArr2[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) dArr3[i12][i13];
                }
            }
            int i14 = i12 + 1;
            double d12 = dArr2[i14];
            if (d4 < d12) {
                double d13 = dArr2[i12];
                double d14 = (d4 - d13) / (d12 - d13);
                while (i2 < length2) {
                    fArr[i2] = (float) ((dArr3[i14][i2] * d14) + ((1.0d - d14) * dArr3[i12][i2]));
                    i2++;
                }
                return;
            }
            i12 = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r12 >= r5) goto L3;
     */
    @Override // ij.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(double r12, double[] r14) {
        /*
            r11 = this;
            double[] r0 = r11.f3852e
            int r1 = r0.length
            double[][] r2 = r11.f3853f
            r3 = 0
            r4 = r2[r3]
            int r4 = r4.length
            r5 = r0[r3]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 > 0) goto L11
        Lf:
            r12 = r5
            goto L1a
        L11:
            int r5 = r1 + (-1)
            r5 = r0[r5]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 < 0) goto L1a
            goto Lf
        L1a:
            r5 = r3
        L1b:
            int r6 = r1 + (-1)
            if (r5 >= r6) goto L3d
            int r6 = r5 + 1
            r7 = r0[r6]
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 > 0) goto L3b
            r12 = r0[r5]
            double r7 = r7 - r12
        L2a:
            if (r3 >= r4) goto L3d
            r12 = r2[r5]
            r0 = r12[r3]
            r12 = r2[r6]
            r9 = r12[r3]
            double r9 = r9 - r0
            double r9 = r9 / r7
            r14[r3] = r9
            int r3 = r3 + 1
            goto L2a
        L3b:
            r5 = r6
            goto L1b
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.h.e0(double, double[]):void");
    }

    @Override // ij.a
    public final double[] h0() {
        return this.f3852e;
    }
}
