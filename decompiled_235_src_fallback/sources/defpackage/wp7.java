package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp7  reason: default package */
/* loaded from: classes.dex */
public abstract class wp7 {
    public defpackage.ak7 a;
    public int b;
    public int[] c;
    public float[][] d;
    public int e;
    public java.lang.String f;
    public float[] g;
    public boolean h;
    public long i;
    public float j;

    public wp7() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.b = r0
            r1 = 10
            int[] r2 = new int[r1]
            r5.c = r2
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 1
            r4 = 3
            r2[r3] = r4
            r2[r0] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            float[][] r1 = (float[][]) r1
            r5.d = r1
            float[] r1 = new float[r4]
            r5.g = r1
            r5.h = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r5.j = r0
            return
    }

    public final float a(float r4) {
            r3 = this;
            int r3 = r3.b
            r0 = 1086918619(0x40c90fdb, float:6.2831855)
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            switch(r3) {
                case 1: goto L3a;
                case 2: goto L34;
                case 3: goto L2f;
                case 4: goto L2a;
                case 5: goto L22;
                case 6: goto L14;
                default: goto Lc;
            }
        Lc:
            float r4 = r4 * r0
            double r3 = (double) r4
            double r3 = java.lang.Math.sin(r3)
            float r3 = (float) r3
            return r3
        L14:
            r3 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r3
            float r4 = r4 % r3
            float r4 = r4 - r1
            float r3 = java.lang.Math.abs(r4)
            float r3 = r2 - r3
            float r3 = r3 * r3
            float r2 = r2 - r3
            return r2
        L22:
            float r4 = r4 * r0
            double r3 = (double) r4
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            return r3
        L2a:
            float r4 = r4 * r1
            float r4 = r4 + r2
            float r4 = r4 % r1
            float r2 = r2 - r4
            return r2
        L2f:
            float r4 = r4 * r1
            float r4 = r4 + r2
            float r4 = r4 % r1
            float r4 = r4 - r2
            return r4
        L34:
            float r3 = java.lang.Math.abs(r4)
            float r2 = r2 - r3
            return r2
        L3a:
            float r4 = r4 * r0
            float r3 = java.lang.Math.signum(r4)
            return r3
    }

    public final float b(float r19, long r20, defpackage.ng3 r22, android.view.View r23) {
            r18 = this;
            r0 = r18
            r1 = r20
            r3 = r22
            r4 = r23
            ak7 r5 = r0.a
            r6 = r19
            double r6 = (double) r6
            float[] r8 = r0.g
            r5.b0(r6, r8)
            float[] r5 = r0.g
            r6 = 1
            r7 = r5[r6]
            r8 = 0
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            r10 = 2
            r11 = 0
            if (r9 != 0) goto L23
            r0.h = r11
            r0 = r5[r10]
            return r0
        L23:
            float r5 = r0.j
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3b
            java.lang.String r5 = r0.f
            float r5 = r3.a(r4, r5)
            r0.j = r5
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3b
            r0.j = r8
        L3b:
            long r12 = r0.i
            long r12 = r1 - r12
            float r5 = r0.j
            double r14 = (double) r5
            double r12 = (double) r12
            r16 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r12 = r12 * r16
            r19 = r8
            r5 = r9
            double r8 = (double) r7
            double r12 = r12 * r8
            double r12 = r12 + r14
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 % r7
            float r7 = (float) r12
            r0.j = r7
            java.lang.String r8 = r0.f
            java.util.HashMap r3 = r3.A
            boolean r9 = r3.containsKey(r4)
            if (r9 != 0) goto L70
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            float[] r12 = new float[r6]
            r12[r11] = r7
            r9.put(r8, r12)
            r3.put(r4, r9)
            goto La4
        L70:
            java.lang.Object r9 = r3.get(r4)
            java.util.HashMap r9 = (java.util.HashMap) r9
            if (r9 != 0) goto L7d
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L7d:
            boolean r12 = r9.containsKey(r8)
            if (r12 != 0) goto L8e
            float[] r12 = new float[r6]
            r12[r11] = r7
            r9.put(r8, r12)
            r3.put(r4, r9)
            goto La4
        L8e:
            java.lang.Object r3 = r9.get(r8)
            float[] r3 = (float[]) r3
            if (r3 != 0) goto L98
            float[] r3 = new float[r11]
        L98:
            int r4 = r3.length
            if (r4 > 0) goto L9f
            float[] r3 = java.util.Arrays.copyOf(r3, r6)
        L9f:
            r3[r11] = r7
            r9.put(r8, r3)
        La4:
            r0.i = r1
            float[] r1 = r0.g
            r1 = r1[r11]
            float r2 = r0.j
            float r2 = r0.a(r2)
            float[] r3 = r0.g
            r3 = r3[r10]
            float r2 = r2 * r1
            float r2 = r2 + r3
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 != 0) goto Lbe
            if (r5 == 0) goto Lbd
            goto Lbe
        Lbd:
            r6 = r11
        Lbe:
            r0.h = r6
            return r2
    }

    public void c(int r3, float r4, float r5, int r6, float r7) {
            r2 = this;
            int[] r0 = r2.c
            int r1 = r2.e
            r0[r1] = r3
            float[][] r3 = r2.d
            r3 = r3[r1]
            r0 = 0
            r3[r0] = r4
            r4 = 1
            r3[r4] = r5
            r5 = 2
            r3[r5] = r7
            int r3 = r2.b
            int r3 = java.lang.Math.max(r3, r6)
            r2.b = r3
            int r3 = r2.e
            int r3 = r3 + r4
            r2.e = r3
            return
    }

    public abstract boolean d(float r1, long r2, defpackage.ng3 r4, android.view.View r5);

    public void e(int r18) {
            r17 = this;
            r0 = r17
            float[][] r1 = r0.d
            int[] r2 = r0.c
            int r3 = r0.e
            if (r3 != 0) goto L20
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error no points added to "
            r2.<init>(r3)
            java.lang.String r0 = r0.f
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            return
        L20:
            r4 = 1
            int r3 = r3 - r4
            int r5 = r2.length
            int r5 = r5 + 10
            int[] r5 = new int[r5]
            r6 = 0
            r5[r6] = r3
            r5[r4] = r6
            r3 = 2
            r7 = r3
        L2e:
            if (r7 <= 0) goto L7a
            int r8 = r7 + (-1)
            r9 = r5[r8]
            int r10 = r7 + (-2)
            r11 = r5[r10]
            if (r9 >= r11) goto L78
            r12 = r2[r11]
            r13 = r9
            r14 = r13
        L3e:
            if (r13 >= r11) goto L57
            r15 = r2[r13]
            if (r15 > r12) goto L54
            r16 = r2[r14]
            r2[r14] = r15
            r2[r13] = r16
            r15 = r1[r14]
            r16 = r1[r13]
            r1[r14] = r16
            r1[r13] = r15
            int r14 = r14 + 1
        L54:
            int r13 = r13 + 1
            goto L3e
        L57:
            r12 = r2[r14]
            r13 = r2[r11]
            r2[r14] = r13
            r2[r11] = r12
            r12 = r1[r14]
            r13 = r1[r11]
            r1[r14] = r13
            r1[r11] = r12
            int r12 = r14 + (-1)
            r5[r10] = r12
            r5[r8] = r9
            int r8 = r7 + 1
            r5[r7] = r11
            int r7 = r7 + 2
            int r14 = r14 + 1
            r5[r8] = r14
            goto L2e
        L78:
            r7 = r10
            goto L2e
        L7a:
            r5 = r4
            r7 = r6
        L7c:
            int r8 = r2.length
            if (r5 >= r8) goto L8c
            r8 = r2[r5]
            int r9 = r5 + (-1)
            r9 = r2[r9]
            if (r8 == r9) goto L89
            int r7 = r7 + 1
        L89:
            int r5 = r5 + 1
            goto L7c
        L8c:
            if (r7 != 0) goto L8f
            r7 = r4
        L8f:
            double[] r5 = new double[r7]
            int[] r8 = new int[r3]
            r9 = 3
            r8[r4] = r9
            r8[r6] = r7
            java.lang.Class r7 = java.lang.Double.TYPE
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r8)
            double[][] r7 = (double[][]) r7
            r8 = r6
            r9 = r8
        La2:
            int r10 = r0.e
            if (r8 >= r10) goto Ld4
            if (r8 <= 0) goto Lb1
            r10 = r2[r8]
            int r11 = r8 + (-1)
            r11 = r2[r11]
            if (r10 != r11) goto Lb1
            goto Ld1
        Lb1:
            r10 = r2[r8]
            double r10 = (double) r10
            r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r10 = r10 * r12
            r5[r9] = r10
            r10 = r7[r9]
            r11 = r1[r8]
            r12 = r11[r6]
            double r12 = (double) r12
            r10[r6] = r12
            r12 = r11[r4]
            double r12 = (double) r12
            r10[r4] = r12
            r11 = r11[r3]
            double r11 = (double) r11
            r10[r3] = r11
            int r9 = r9 + 1
        Ld1:
            int r8 = r8 + 1
            goto La2
        Ld4:
            r8 = r18
            ak7 r1 = defpackage.ak7.U(r8, r5, r7)
            r0.a = r1
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.f
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r4.e
            if (r2 >= r3) goto L37
            java.lang.String r3 = "["
            java.lang.StringBuilder r0 = defpackage.i61.r(r0, r3)
            int[] r3 = r4.c
            r3 = r3[r2]
            r0.append(r3)
            java.lang.String r3 = " , "
            r0.append(r3)
            float[][] r3 = r4.d
            r3 = r3[r2]
            java.lang.String r3 = r1.format(r3)
            r0.append(r3)
            java.lang.String r3 = "] "
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r2 = r2 + 1
            goto La
        L37:
            return r0
    }
}
