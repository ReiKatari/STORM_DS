package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qp7  reason: default package */
/* loaded from: classes.dex */
public abstract class qp7 {
    public defpackage.ak7 a;
    public int[] b;
    public float[] c;
    public int d;
    public java.lang.String e;

    public qp7() {
            r2 = this;
            r2.<init>()
            r0 = 10
            int[] r1 = new int[r0]
            r2.b = r1
            float[] r0 = new float[r0]
            r2.c = r0
            return
    }

    public final float a(float r3) {
            r2 = this;
            ak7 r2 = r2.a
            double r0 = (double) r3
            double r2 = r2.Z(r0)
            float r2 = (float) r2
            return r2
    }

    public void b(int r4, float r5) {
            r3 = this;
            int[] r0 = r3.b
            int r1 = r0.length
            int r2 = r3.d
            int r2 = r2 + 1
            if (r1 >= r2) goto L1d
            int r1 = r0.length
            int r1 = r1 * 2
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.b = r0
            float[] r0 = r3.c
            int r1 = r0.length
            int r1 = r1 * 2
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.c = r0
        L1d:
            int[] r0 = r3.b
            int r1 = r3.d
            r0[r1] = r4
            float[] r4 = r3.c
            r4[r1] = r5
            int r1 = r1 + 1
            r3.d = r1
            return
    }

    public abstract void c(android.view.View r1, float r2);

    public void d(int r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.d
            if (r1 != 0) goto L7
            return
        L7:
            int[] r2 = r0.b
            float[] r3 = r0.c
            r4 = 1
            int r1 = r1 - r4
            int r5 = r2.length
            int r5 = r5 + 10
            int[] r5 = new int[r5]
            r6 = 0
            r5[r6] = r1
            r5[r4] = r6
            r1 = 2
            r7 = r1
        L19:
            if (r7 <= 0) goto L65
            int r8 = r7 + (-1)
            r9 = r5[r8]
            int r10 = r7 + (-2)
            r11 = r5[r10]
            if (r9 >= r11) goto L63
            r12 = r2[r11]
            r13 = r9
            r14 = r13
        L29:
            if (r13 >= r11) goto L42
            r15 = r2[r13]
            if (r15 > r12) goto L3f
            r16 = r2[r14]
            r2[r14] = r15
            r2[r13] = r16
            r15 = r3[r14]
            r16 = r3[r13]
            r3[r14] = r16
            r3[r13] = r15
            int r14 = r14 + 1
        L3f:
            int r13 = r13 + 1
            goto L29
        L42:
            r12 = r2[r14]
            r13 = r2[r11]
            r2[r14] = r13
            r2[r11] = r12
            r12 = r3[r14]
            r13 = r3[r11]
            r3[r14] = r13
            r3[r11] = r12
            int r12 = r14 + (-1)
            r5[r10] = r12
            r5[r8] = r9
            int r8 = r7 + 1
            r5[r7] = r11
            int r7 = r7 + 2
            int r14 = r14 + 1
            r5[r8] = r14
            goto L19
        L63:
            r7 = r10
            goto L19
        L65:
            r2 = r4
            r3 = r2
        L67:
            int r5 = r0.d
            if (r2 >= r5) goto L7a
            int[] r5 = r0.b
            int r7 = r2 + (-1)
            r7 = r5[r7]
            r5 = r5[r2]
            if (r7 == r5) goto L77
            int r3 = r3 + 1
        L77:
            int r2 = r2 + 1
            goto L67
        L7a:
            double[] r2 = new double[r3]
            int[] r1 = new int[r1]
            r1[r4] = r4
            r1[r6] = r3
            java.lang.Class r3 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r3, r1)
            double[][] r1 = (double[][]) r1
            r3 = r6
            r4 = r3
        L8c:
            int r5 = r0.d
            if (r3 >= r5) goto Lb8
            if (r3 <= 0) goto L9d
            int[] r5 = r0.b
            r7 = r5[r3]
            int r8 = r3 + (-1)
            r5 = r5[r8]
            if (r7 != r5) goto L9d
            goto Lb5
        L9d:
            int[] r5 = r0.b
            r5 = r5[r3]
            double r7 = (double) r5
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r2[r4] = r7
            r5 = r1[r4]
            float[] r7 = r0.c
            r7 = r7[r3]
            double r7 = (double) r7
            r5[r6] = r7
            int r4 = r4 + 1
        Lb5:
            int r3 = r3 + 1
            goto L8c
        Lb8:
            r3 = r18
            ak7 r1 = defpackage.ak7.U(r3, r2, r1)
            r0.a = r1
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.e
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r5.d
            if (r2 >= r3) goto L38
            java.lang.String r3 = "["
            java.lang.StringBuilder r0 = defpackage.i61.r(r0, r3)
            int[] r3 = r5.b
            r3 = r3[r2]
            r0.append(r3)
            java.lang.String r3 = " , "
            r0.append(r3)
            float[] r3 = r5.c
            r3 = r3[r2]
            double r3 = (double) r3
            java.lang.String r3 = r1.format(r3)
            r0.append(r3)
            java.lang.String r3 = "] "
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r2 = r2 + 1
            goto La
        L38:
            return r0
    }
}
