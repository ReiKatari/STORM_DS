package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xn3  reason: default package */
/* loaded from: classes.dex */
public final class xn3 extends jv3 {
    public double[] p;
    public double[][] q;
    public double[] r;

    @Override // defpackage.jv3
    public final double C(double d) {
        double[][] dArr = this.q;
        double[] dArr2 = this.p;
        int length = dArr2.length;
        double d2 = dArr2[0];
        if (d <= d2) {
            return (j0(d2) * (d - d2)) + dArr[0][0];
        }
        int i = length - 1;
        double d3 = dArr2[i];
        if (d >= d3) {
            return (j0(d3) * (d - d3)) + dArr[i][0];
        }
        int i2 = 0;
        while (i2 < i) {
            double d4 = dArr2[i2];
            if (d == d4) {
                return dArr[i2][0];
            }
            int i3 = i2 + 1;
            double d5 = dArr2[i3];
            if (d < d5) {
                double d6 = (d - d4) / (d5 - d4);
                return (dArr[i3][0] * d6) + ((1.0d - d6) * dArr[i2][0]);
            }
            i2 = i3;
        }
        return 0.0d;
    }

    @Override // defpackage.jv3
    public final void D(double d, double[] dArr) {
        double[] dArr2 = this.r;
        double[] dArr3 = this.p;
        int length = dArr3.length;
        double[][] dArr4 = this.q;
        int i = 0;
        int length2 = dArr4[0].length;
        double d2 = dArr3[0];
        if (d <= d2) {
            G(d2, dArr2);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d - dArr3[0]) * dArr2[i2]) + dArr4[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr3[i3];
        if (d >= d3) {
            G(d3, dArr2);
            while (i < length2) {
                dArr[i] = ((d - dArr3[i3]) * dArr2[i]) + dArr4[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr3[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = dArr4[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr3[i6];
            if (d < d4) {
                double d5 = dArr3[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    dArr[i] = (dArr4[i6][i] * d6) + ((1.0d - d6) * dArr4[i4][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // defpackage.jv3
    public final void E(double d, float[] fArr) {
        double[] dArr = this.r;
        double[] dArr2 = this.p;
        int length = dArr2.length;
        double[][] dArr3 = this.q;
        int i = 0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            G(d2, dArr);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d - dArr2[0]) * dArr[i2]) + dArr3[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr2[i3];
        if (d >= d3) {
            G(d3, dArr);
            while (i < length2) {
                fArr[i] = (float) (((d - dArr2[i3]) * dArr[i]) + dArr3[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr2[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) dArr3[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr2[i6];
            if (d < d4) {
                double d5 = dArr2[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    fArr[i] = (float) ((dArr3[i6][i] * d6) + ((1.0d - d6) * dArr3[i4][i]));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r11 >= r4) goto L3;
     */
    @Override // defpackage.jv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(double r11, double[] r13) {
        /*
            r10 = this;
            double[] r0 = r10.p
            int r1 = r0.length
            double[][] r10 = r10.q
            r2 = 0
            r3 = r10[r2]
            int r3 = r3.length
            r4 = r0[r2]
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r11 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 < 0) goto L1a
            goto Lf
        L1a:
            r4 = r2
        L1b:
            int r5 = r1 + (-1)
            if (r4 >= r5) goto L3d
            int r5 = r4 + 1
            r6 = r0[r5]
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 > 0) goto L3b
            r11 = r0[r4]
            double r6 = r6 - r11
        L2a:
            if (r2 >= r3) goto L3d
            r11 = r10[r4]
            r0 = r11[r2]
            r11 = r10[r5]
            r8 = r11[r2]
            double r8 = r8 - r0
            double r8 = r8 / r6
            r13[r2] = r8
            int r2 = r2 + 1
            goto L2a
        L3b:
            r4 = r5
            goto L1b
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn3.G(double, double[]):void");
    }

    @Override // defpackage.jv3
    public final double[] H() {
        return this.p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r9 >= r3) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double j0(double r9) {
        /*
            r8 = this;
            double[] r0 = r8.p
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
            double[][] r8 = r8.q
            r9 = r8[r3]
            r0 = r9[r2]
            r8 = r8[r4]
            r9 = r8[r2]
            double r9 = r9 - r0
            double r9 = r9 / r5
            return r9
        L32:
            r3 = r4
            goto L16
        L34:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn3.j0(double):double");
    }
}
