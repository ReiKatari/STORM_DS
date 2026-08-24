package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu3  reason: default package */
/* loaded from: classes.dex */
public final class zu3 extends defpackage.ak7 {
    public double[] l;
    public double[][] m;
    public double[] n;

    public final double L0(double r9) {
            r8 = this;
            double[] r0 = r8.l
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
            double[][] r8 = r8.m
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
    }

    @Override // defpackage.ak7
    public final double Z(double r11) {
            r10 = this;
            double[][] r0 = r10.m
            double[] r1 = r10.l
            int r2 = r1.length
            r3 = 0
            r4 = r1[r3]
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 > 0) goto L18
            r0 = r0[r3]
            r1 = r0[r3]
            double r11 = r11 - r4
            double r3 = r10.L0(r4)
            double r3 = r3 * r11
            double r3 = r3 + r1
            return r3
        L18:
            int r2 = r2 + (-1)
            r4 = r1[r2]
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 < 0) goto L2c
            r0 = r0[r2]
            r1 = r0[r3]
            double r11 = r11 - r4
            double r3 = r10.L0(r4)
            double r3 = r3 * r11
            double r3 = r3 + r1
            return r3
        L2c:
            r10 = r3
        L2d:
            if (r10 >= r2) goto L56
            r4 = r1[r10]
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 != 0) goto L3a
            r10 = r0[r10]
            r11 = r10[r3]
            return r11
        L3a:
            int r6 = r10 + 1
            r7 = r1[r6]
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 >= 0) goto L54
            double r7 = r7 - r4
            double r11 = r11 - r4
            double r11 = r11 / r7
            r10 = r0[r10]
            r1 = r10[r3]
            r10 = r0[r6]
            r3 = r10[r3]
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r5 - r11
            double r5 = r5 * r1
            double r3 = r3 * r11
            double r3 = r3 + r5
            return r3
        L54:
            r10 = r6
            goto L2d
        L56:
            r10 = 0
            return r10
    }

    @Override // defpackage.ak7
    public final void a0(double r14, double[] r16) {
            r13 = this;
            double[] r0 = r13.n
            double[] r1 = r13.l
            int r2 = r1.length
            double[][] r3 = r13.m
            r4 = 0
            r5 = r3[r4]
            int r5 = r5.length
            r6 = r1[r4]
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 > 0) goto L28
            r13.d0(r6, r0)
            r13 = r4
        L15:
            if (r13 >= r5) goto L82
            r2 = r3[r4]
            r6 = r2[r13]
            r8 = r1[r4]
            double r8 = r14 - r8
            r10 = r0[r13]
            double r8 = r8 * r10
            double r8 = r8 + r6
            r16[r13] = r8
            int r13 = r13 + 1
            goto L15
        L28:
            int r6 = r2 + (-1)
            r7 = r1[r6]
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 < 0) goto L46
            r13.d0(r7, r0)
        L33:
            if (r4 >= r5) goto L82
            r13 = r3[r6]
            r7 = r13[r4]
            r9 = r1[r6]
            double r9 = r14 - r9
            r11 = r0[r4]
            double r9 = r9 * r11
            double r9 = r9 + r7
            r16[r4] = r9
            int r4 = r4 + 1
            goto L33
        L46:
            r13 = r4
        L47:
            int r0 = r2 + (-1)
            if (r13 >= r0) goto L82
            r6 = r1[r13]
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 != 0) goto L5d
            r0 = r4
        L52:
            if (r0 >= r5) goto L5d
            r6 = r3[r13]
            r7 = r6[r0]
            r16[r0] = r7
            int r0 = r0 + 1
            goto L52
        L5d:
            int r0 = r13 + 1
            r6 = r1[r0]
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 >= 0) goto L80
            r8 = r1[r13]
            double r6 = r6 - r8
            double r1 = r14 - r8
            double r1 = r1 / r6
        L6b:
            if (r4 >= r5) goto L82
            r6 = r3[r13]
            r7 = r6[r4]
            r6 = r3[r0]
            r9 = r6[r4]
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 - r1
            double r11 = r11 * r7
            double r9 = r9 * r1
            double r9 = r9 + r11
            r16[r4] = r9
            int r4 = r4 + 1
            goto L6b
        L80:
            r13 = r0
            goto L47
        L82:
            return
    }

    @Override // defpackage.ak7
    public final void b0(double r14, float[] r16) {
            r13 = this;
            double[] r0 = r13.n
            double[] r1 = r13.l
            int r2 = r1.length
            double[][] r3 = r13.m
            r4 = 0
            r5 = r3[r4]
            int r5 = r5.length
            r6 = r1[r4]
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 > 0) goto L29
            r13.d0(r6, r0)
            r13 = r4
        L15:
            if (r13 >= r5) goto L86
            r2 = r3[r4]
            r6 = r2[r13]
            r8 = r1[r4]
            double r8 = r14 - r8
            r10 = r0[r13]
            double r8 = r8 * r10
            double r8 = r8 + r6
            float r2 = (float) r8
            r16[r13] = r2
            int r13 = r13 + 1
            goto L15
        L29:
            int r6 = r2 + (-1)
            r7 = r1[r6]
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 < 0) goto L48
            r13.d0(r7, r0)
        L34:
            if (r4 >= r5) goto L86
            r13 = r3[r6]
            r7 = r13[r4]
            r9 = r1[r6]
            double r9 = r14 - r9
            r11 = r0[r4]
            double r9 = r9 * r11
            double r9 = r9 + r7
            float r13 = (float) r9
            r16[r4] = r13
            int r4 = r4 + 1
            goto L34
        L48:
            r13 = r4
        L49:
            int r0 = r2 + (-1)
            if (r13 >= r0) goto L86
            r6 = r1[r13]
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 != 0) goto L60
            r0 = r4
        L54:
            if (r0 >= r5) goto L60
            r6 = r3[r13]
            r7 = r6[r0]
            float r6 = (float) r7
            r16[r0] = r6
            int r0 = r0 + 1
            goto L54
        L60:
            int r0 = r13 + 1
            r6 = r1[r0]
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 >= 0) goto L84
            r8 = r1[r13]
            double r6 = r6 - r8
            double r1 = r14 - r8
            double r1 = r1 / r6
        L6e:
            if (r4 >= r5) goto L86
            r6 = r3[r13]
            r7 = r6[r4]
            r6 = r3[r0]
            r9 = r6[r4]
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 - r1
            double r11 = r11 * r7
            double r9 = r9 * r1
            double r9 = r9 + r11
            float r6 = (float) r9
            r16[r4] = r6
            int r4 = r4 + 1
            goto L6e
        L84:
            r13 = r0
            goto L49
        L86:
            return
    }

    @Override // defpackage.ak7
    public final void d0(double r11, double[] r13) {
            r10 = this;
            double[] r0 = r10.l
            int r1 = r0.length
            double[][] r10 = r10.m
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
    }

    @Override // defpackage.ak7
    public final double[] g0() {
            r0 = this;
            double[] r0 = r0.l
            return r0
    }
}
