package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g74  reason: default package */
/* loaded from: classes.dex */
public final class g74 extends defpackage.ak7 {
    public final double[] l;
    public final double[][] m;
    public final double[][] n;
    public final double[] o;

    public g74(double[] r22, double[][] r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r0.<init>()
            int r3 = r1.length
            r4 = 0
            r5 = r2[r4]
            int r5 = r5.length
            double[] r6 = new double[r5]
            r0.o = r6
            int r6 = r3 + (-1)
            r7 = 2
            int[] r8 = new int[r7]
            r9 = 1
            r8[r9] = r5
            r8[r4] = r6
            java.lang.Class r10 = java.lang.Double.TYPE
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r10, r8)
            double[][] r8 = (double[][]) r8
            int[] r11 = new int[r7]
            r11[r9] = r5
            r11[r4] = r3
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r10, r11)
            double[][] r9 = (double[][]) r9
            r10 = r4
        L31:
            if (r10 >= r5) goto L73
            r11 = r4
        L34:
            if (r11 >= r6) goto L66
            int r12 = r11 + 1
            r13 = r1[r12]
            r15 = r1[r11]
            double r13 = r13 - r15
            r15 = r8[r11]
            r16 = r2[r12]
            r17 = r16[r10]
            r16 = r2[r11]
            r19 = r16[r10]
            double r17 = r17 - r19
            double r17 = r17 / r13
            r15[r10] = r17
            if (r11 != 0) goto L54
            r11 = r9[r11]
            r11[r10] = r17
            goto L64
        L54:
            r13 = r9[r11]
            int r11 = r11 + (-1)
            r11 = r8[r11]
            r14 = r11[r10]
            double r14 = r14 + r17
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r14 = r14 * r16
            r13[r10] = r14
        L64:
            r11 = r12
            goto L34
        L66:
            r11 = r9[r6]
            int r12 = r3 + (-2)
            r12 = r8[r12]
            r13 = r12[r10]
            r11[r10] = r13
            int r10 = r10 + 1
            goto L31
        L73:
            r3 = r4
        L74:
            if (r3 >= r6) goto Lc5
            r7 = r4
        L77:
            if (r7 >= r5) goto Lc2
            r10 = r8[r3]
            r11 = r10[r7]
            r13 = 0
            int r10 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r10 != 0) goto L8e
            r10 = r9[r3]
            r10[r7] = r13
            int r10 = r3 + 1
            r10 = r9[r10]
            r10[r7] = r13
            goto Lbf
        L8e:
            r10 = r9[r3]
            r13 = r10[r7]
            double r13 = r13 / r11
            int r10 = r3 + 1
            r15 = r9[r10]
            r16 = r15[r7]
            double r11 = r16 / r11
            double r15 = java.lang.Math.hypot(r13, r11)
            r17 = 4621256167635550208(0x4022000000000000, double:9.0)
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 <= 0) goto Lbf
            r17 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r17 = r17 / r15
            r15 = r9[r3]
            double r13 = r13 * r17
            r16 = r8[r3]
            r19 = r16[r7]
            double r13 = r13 * r19
            r15[r7] = r13
            r10 = r9[r10]
            double r17 = r17 * r11
            r11 = r16[r7]
            double r17 = r17 * r11
            r10[r7] = r17
        Lbf:
            int r7 = r7 + 1
            goto L77
        Lc2:
            int r3 = r3 + 1
            goto L74
        Lc5:
            r0.l = r1
            r0.m = r2
            r0.n = r9
            return
    }

    public static double L0(double r10, double r12, double r14, double r16, double r18, double r20) {
            double r0 = r12 * r12
            r2 = -4604930618986332160(0xc018000000000000, double:-6.0)
            double r2 = r2 * r0
            double r2 = r2 * r16
            r4 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r6 = r12 * r4
            double r8 = r6 * r16
            double r8 = r8 + r2
            double r4 = r4 * r0
            double r4 = r4 * r14
            double r4 = r4 + r8
            double r6 = r6 * r14
            double r4 = r4 - r6
            r14 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r14 = r14 * r10
            double r2 = r14 * r20
            double r2 = r2 * r0
            double r2 = r2 + r4
            double r14 = r14 * r18
            double r14 = r14 * r0
            double r14 = r14 + r2
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r10
            double r0 = r0 * r20
            double r0 = r0 * r12
            double r14 = r14 - r0
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = r0 * r10
            double r0 = r0 * r18
            double r0 = r0 * r12
            double r14 = r14 - r0
            double r10 = r10 * r18
            double r10 = r10 + r14
            return r10
    }

    public static double N0(double r12, double r14, double r16, double r18, double r20, double r22) {
            double r0 = r14 * r14
            double r2 = r0 * r14
            r4 = -4611686018427387904(0xc000000000000000, double:-2.0)
            double r4 = r4 * r2
            double r4 = r4 * r18
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = r6 * r0
            double r8 = r6 * r18
            double r8 = r8 + r4
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r2 * r4
            double r10 = r10 * r16
            double r10 = r10 + r8
            double r6 = r6 * r16
            double r10 = r10 - r6
            double r10 = r10 + r16
            double r6 = r12 * r22
            double r8 = r6 * r2
            double r8 = r8 + r10
            double r10 = r12 * r20
            double r2 = r2 * r10
            double r2 = r2 + r8
            double r6 = r6 * r0
            double r2 = r2 - r6
            double r12 = r12 * r4
            double r12 = r12 * r20
            double r12 = r12 * r0
            double r2 = r2 - r12
            double r10 = r10 * r14
            double r10 = r10 + r2
            return r10
    }

    public final double M0(double r25) {
            r24 = this;
            r0 = r24
            double[] r1 = r0.l
            int r2 = r1.length
            r3 = 0
            r4 = r1[r3]
            int r6 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld
            goto L18
        Ld:
            int r4 = r2 + (-1)
            r4 = r1[r4]
            int r6 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r6 < 0) goto L16
            goto L18
        L16:
            r4 = r25
        L18:
            r6 = r3
        L19:
            int r7 = r2 + (-1)
            if (r6 >= r7) goto L48
            int r7 = r6 + 1
            r8 = r1[r7]
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 > 0) goto L46
            r10 = r1[r6]
            double r12 = r8 - r10
            double r4 = r4 - r10
            double r14 = r4 / r12
            double[][] r1 = r0.m
            r2 = r1[r6]
            r16 = r2[r3]
            r1 = r1[r7]
            r18 = r1[r3]
            double[][] r0 = r0.n
            r1 = r0[r6]
            r20 = r1[r3]
            r0 = r0[r7]
            r22 = r0[r3]
            double r0 = L0(r12, r14, r16, r18, r20, r22)
            double r0 = r0 / r12
            return r0
        L46:
            r6 = r7
            goto L19
        L48:
            r0 = 0
            return r0
    }

    @Override // defpackage.ak7
    public final double Z(double r25) {
            r24 = this;
            r0 = r24
            double[] r1 = r0.l
            int r2 = r1.length
            r3 = 0
            r4 = r1[r3]
            int r6 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            double[][] r7 = r0.m
            if (r6 > 0) goto L1b
            r1 = r7[r3]
            r2 = r1[r3]
            double r6 = r25 - r4
            double r0 = r0.M0(r4)
            double r0 = r0 * r6
            double r0 = r0 + r2
            return r0
        L1b:
            int r2 = r2 + (-1)
            r4 = r1[r2]
            int r6 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r6 < 0) goto L30
            r1 = r7[r2]
            r2 = r1[r3]
            double r6 = r25 - r4
            double r0 = r0.M0(r4)
            double r0 = r0 * r6
            double r0 = r0 + r2
            return r0
        L30:
            r4 = r3
        L31:
            if (r4 >= r2) goto L65
            r5 = r1[r4]
            int r8 = (r25 > r5 ? 1 : (r25 == r5 ? 0 : -1))
            if (r8 != 0) goto L3e
            r0 = r7[r4]
            r1 = r0[r3]
            return r1
        L3e:
            int r8 = r4 + 1
            r9 = r1[r8]
            int r11 = (r25 > r9 ? 1 : (r25 == r9 ? 0 : -1))
            if (r11 >= 0) goto L63
            double r12 = r9 - r5
            double r1 = r25 - r5
            double r14 = r1 / r12
            r1 = r7[r4]
            r16 = r1[r3]
            r1 = r7[r8]
            r18 = r1[r3]
            double[][] r0 = r0.n
            r1 = r0[r4]
            r20 = r1[r3]
            r0 = r0[r8]
            r22 = r0[r3]
            double r0 = N0(r12, r14, r16, r18, r20, r22)
            return r0
        L63:
            r4 = r8
            goto L31
        L65:
            r0 = 0
            return r0
    }

    @Override // defpackage.ak7
    public final void a0(double r25, double[] r27) {
            r24 = this;
            r0 = r24
            double[] r1 = r0.l
            int r2 = r1.length
            double[][] r3 = r0.m
            r4 = 0
            r5 = r3[r4]
            int r5 = r5.length
            r6 = r1[r4]
            int r8 = (r25 > r6 ? 1 : (r25 == r6 ? 0 : -1))
            double[] r9 = r0.o
            if (r8 > 0) goto L2a
            r0.d0(r6, r9)
            r0 = r4
        L17:
            if (r0 >= r5) goto L8c
            r2 = r3[r4]
            r6 = r2[r0]
            r10 = r1[r4]
            double r10 = r25 - r10
            r12 = r9[r0]
            double r10 = r10 * r12
            double r10 = r10 + r6
            r27[r0] = r10
            int r0 = r0 + 1
            goto L17
        L2a:
            int r2 = r2 + (-1)
            r6 = r1[r2]
            int r8 = (r25 > r6 ? 1 : (r25 == r6 ? 0 : -1))
            if (r8 < 0) goto L48
            r0.d0(r6, r9)
        L35:
            if (r4 >= r5) goto L8c
            r0 = r3[r2]
            r6 = r0[r4]
            r10 = r1[r2]
            double r10 = r25 - r10
            r12 = r9[r4]
            double r10 = r10 * r12
            double r10 = r10 + r6
            r27[r4] = r10
            int r4 = r4 + 1
            goto L35
        L48:
            r6 = r4
        L49:
            if (r6 >= r2) goto L8c
            r7 = r1[r6]
            int r7 = (r25 > r7 ? 1 : (r25 == r7 ? 0 : -1))
            if (r7 != 0) goto L5d
            r7 = r4
        L52:
            if (r7 >= r5) goto L5d
            r8 = r3[r6]
            r9 = r8[r7]
            r27[r7] = r9
            int r7 = r7 + 1
            goto L52
        L5d:
            int r7 = r6 + 1
            r8 = r1[r7]
            int r10 = (r25 > r8 ? 1 : (r25 == r8 ? 0 : -1))
            if (r10 >= 0) goto L8a
            r10 = r1[r6]
            double r12 = r8 - r10
            double r1 = r25 - r10
            double r14 = r1 / r12
        L6d:
            if (r4 >= r5) goto L8c
            r1 = r3[r6]
            r16 = r1[r4]
            r1 = r3[r7]
            r18 = r1[r4]
            double[][] r1 = r0.n
            r2 = r1[r6]
            r20 = r2[r4]
            r1 = r1[r7]
            r22 = r1[r4]
            double r1 = N0(r12, r14, r16, r18, r20, r22)
            r27[r4] = r1
            int r4 = r4 + 1
            goto L6d
        L8a:
            r6 = r7
            goto L49
        L8c:
            return
    }

    @Override // defpackage.ak7
    public final void b0(double r25, float[] r27) {
            r24 = this;
            r0 = r24
            double[] r1 = r0.l
            int r2 = r1.length
            double[][] r3 = r0.m
            r4 = 0
            r5 = r3[r4]
            int r5 = r5.length
            r6 = r1[r4]
            int r8 = (r25 > r6 ? 1 : (r25 == r6 ? 0 : -1))
            double[] r9 = r0.o
            if (r8 > 0) goto L2b
            r0.d0(r6, r9)
            r0 = r4
        L17:
            if (r0 >= r5) goto L90
            r2 = r3[r4]
            r6 = r2[r0]
            r10 = r1[r4]
            double r10 = r25 - r10
            r12 = r9[r0]
            double r10 = r10 * r12
            double r10 = r10 + r6
            float r2 = (float) r10
            r27[r0] = r2
            int r0 = r0 + 1
            goto L17
        L2b:
            int r2 = r2 + (-1)
            r6 = r1[r2]
            int r8 = (r25 > r6 ? 1 : (r25 == r6 ? 0 : -1))
            if (r8 < 0) goto L4a
            r0.d0(r6, r9)
        L36:
            if (r4 >= r5) goto L90
            r0 = r3[r2]
            r6 = r0[r4]
            r10 = r1[r2]
            double r10 = r25 - r10
            r12 = r9[r4]
            double r10 = r10 * r12
            double r10 = r10 + r6
            float r0 = (float) r10
            r27[r4] = r0
            int r4 = r4 + 1
            goto L36
        L4a:
            r6 = r4
        L4b:
            if (r6 >= r2) goto L90
            r7 = r1[r6]
            int r7 = (r25 > r7 ? 1 : (r25 == r7 ? 0 : -1))
            if (r7 != 0) goto L60
            r7 = r4
        L54:
            if (r7 >= r5) goto L60
            r8 = r3[r6]
            r9 = r8[r7]
            float r8 = (float) r9
            r27[r7] = r8
            int r7 = r7 + 1
            goto L54
        L60:
            int r7 = r6 + 1
            r8 = r1[r7]
            int r10 = (r25 > r8 ? 1 : (r25 == r8 ? 0 : -1))
            if (r10 >= 0) goto L8e
            r10 = r1[r6]
            double r12 = r8 - r10
            double r1 = r25 - r10
            double r14 = r1 / r12
        L70:
            if (r4 >= r5) goto L90
            r1 = r3[r6]
            r16 = r1[r4]
            r1 = r3[r7]
            r18 = r1[r4]
            double[][] r1 = r0.n
            r2 = r1[r6]
            r20 = r2[r4]
            r1 = r1[r7]
            r22 = r1[r4]
            double r1 = N0(r12, r14, r16, r18, r20, r22)
            float r1 = (float) r1
            r27[r4] = r1
            int r4 = r4 + 1
            goto L70
        L8e:
            r6 = r7
            goto L4b
        L90:
            return
    }

    @Override // defpackage.ak7
    public final void d0(double r27, double[] r29) {
            r26 = this;
            r0 = r26
            double[] r1 = r0.l
            int r2 = r1.length
            double[][] r3 = r0.m
            r4 = 0
            r5 = r3[r4]
            int r5 = r5.length
            r6 = r1[r4]
            int r8 = (r27 > r6 ? 1 : (r27 == r6 ? 0 : -1))
            if (r8 > 0) goto L12
            goto L1d
        L12:
            int r6 = r2 + (-1)
            r6 = r1[r6]
            int r8 = (r27 > r6 ? 1 : (r27 == r6 ? 0 : -1))
            if (r8 < 0) goto L1b
            goto L1d
        L1b:
            r6 = r27
        L1d:
            r8 = r4
        L1e:
            int r9 = r2 + (-1)
            if (r8 >= r9) goto L51
            int r9 = r8 + 1
            r10 = r1[r9]
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 > 0) goto L4f
            r12 = r1[r8]
            double r14 = r10 - r12
            double r6 = r6 - r12
            double r16 = r6 / r14
        L31:
            if (r4 >= r5) goto L51
            r1 = r3[r8]
            r18 = r1[r4]
            r1 = r3[r9]
            r20 = r1[r4]
            double[][] r1 = r0.n
            r2 = r1[r8]
            r22 = r2[r4]
            r1 = r1[r9]
            r24 = r1[r4]
            double r1 = L0(r14, r16, r18, r20, r22, r24)
            double r1 = r1 / r14
            r29[r4] = r1
            int r4 = r4 + 1
            goto L31
        L4f:
            r8 = r9
            goto L1e
        L51:
            return
    }

    @Override // defpackage.ak7
    public final double[] g0() {
            r0 = this;
            double[] r0 = r0.l
            return r0
    }
}
