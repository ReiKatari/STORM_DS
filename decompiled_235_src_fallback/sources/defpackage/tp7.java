package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tp7  reason: default package */
/* loaded from: classes.dex */
public final class tp7 extends defpackage.wp7 {
    public java.lang.String k;
    public android.util.SparseArray l;
    public android.util.SparseArray m;
    public float[] n;

    @Override // defpackage.wp7
    public final void c(int r1, float r2, float r3, int r4, float r5) {
            r0 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Wrong call for custom attribute"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.wp7
    public final boolean d(float r11, long r12, defpackage.ng3 r14, android.view.View r15) {
            r10 = this;
            ak7 r0 = r10.a
            double r1 = (double) r11
            float[] r11 = r10.n
            r0.b0(r1, r11)
            float[] r11 = r10.n
            int r0 = r11.length
            int r0 = r0 + (-2)
            r0 = r11[r0]
            int r1 = r11.length
            r2 = 1
            int r1 = r1 - r2
            r11 = r11[r1]
            long r3 = r10.i
            long r3 = r12 - r3
            float r1 = r10.j
            boolean r1 = java.lang.Float.isNaN(r1)
            r5 = 0
            if (r1 == 0) goto L31
            java.lang.String r1 = r10.k
            float r14 = r14.a(r15, r1)
            r10.j = r14
            boolean r14 = java.lang.Float.isNaN(r14)
            if (r14 == 0) goto L31
            r10.j = r5
        L31:
            float r14 = r10.j
            double r6 = (double) r14
            double r3 = (double) r3
            r8 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r3 = r3 * r8
            double r8 = (double) r0
            double r3 = r3 * r8
            double r3 = r3 + r6
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 % r6
            float r14 = (float) r3
            r10.j = r14
            r10.i = r12
            float r12 = r10.a(r14)
            r13 = 0
            r10.h = r13
            r14 = r13
        L4e:
            float[] r1 = r10.g
            int r3 = r1.length
            if (r14 >= r3) goto L6d
            boolean r3 = r10.h
            float[] r4 = r10.n
            r4 = r4[r14]
            double r6 = (double) r4
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L62
            r6 = r2
            goto L63
        L62:
            r6 = r13
        L63:
            r3 = r3 | r6
            r10.h = r3
            float r4 = r4 * r12
            float r4 = r4 + r11
            r1[r14] = r4
            int r14 = r14 + 1
            goto L4e
        L6d:
            android.util.SparseArray r11 = r10.l
            java.lang.Object r11 = r11.valueAt(r13)
            j11 r11 = (defpackage.j11) r11
            float[] r12 = r10.g
            defpackage.l.M(r11, r15, r12)
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 == 0) goto L80
            r10.h = r2
        L80:
            boolean r10 = r10.h
            return r10
    }

    @Override // defpackage.wp7
    public final void e(int r17) {
            r16 = this;
            r0 = r16
            android.util.SparseArray r1 = r0.l
            int r2 = r1.size()
            r3 = 0
            java.lang.Object r4 = r1.valueAt(r3)
            j11 r4 = (defpackage.j11) r4
            int r4 = r4.c()
            double[] r5 = new double[r2]
            int r6 = r4 + 2
            float[] r7 = new float[r6]
            r0.n = r7
            float[] r7 = new float[r4]
            r0.g = r7
            r7 = 2
            int[] r7 = new int[r7]
            r8 = 1
            r7[r8] = r6
            r7[r3] = r2
            java.lang.Class r6 = java.lang.Double.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r7)
            double[][] r6 = (double[][]) r6
            r7 = r3
        L30:
            if (r7 >= r2) goto L73
            int r9 = r1.keyAt(r7)
            java.lang.Object r10 = r1.valueAt(r7)
            j11 r10 = (defpackage.j11) r10
            android.util.SparseArray r11 = r0.m
            java.lang.Object r11 = r11.valueAt(r7)
            float[] r11 = (float[]) r11
            double r12 = (double) r9
            r14 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r12 = r12 * r14
            r5[r7] = r12
            float[] r9 = r0.n
            r10.b(r9)
            r9 = r3
        L53:
            float[] r10 = r0.n
            int r12 = r10.length
            if (r9 >= r12) goto L62
            r12 = r6[r7]
            r10 = r10[r9]
            double r13 = (double) r10
            r12[r9] = r13
            int r9 = r9 + 1
            goto L53
        L62:
            r9 = r6[r7]
            r10 = r11[r3]
            double r12 = (double) r10
            r9[r4] = r12
            int r10 = r4 + 1
            r11 = r11[r8]
            double r11 = (double) r11
            r9[r10] = r11
            int r7 = r7 + 1
            goto L30
        L73:
            r7 = r17
            ak7 r1 = defpackage.ak7.U(r7, r5, r6)
            r0.a = r1
            return
    }
}
