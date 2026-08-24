package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np7  reason: default package */
/* loaded from: classes.dex */
public final class np7 extends defpackage.qp7 {
    public android.util.SparseArray f;
    public float[] g;

    @Override // defpackage.qp7
    public final void b(int r1, float r2) {
            r0 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "call of custom attribute setPoint"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.qp7
    public final void c(android.view.View r4, float r5) {
            r3 = this;
            ak7 r0 = r3.a
            double r1 = (double) r5
            float[] r5 = r3.g
            r0.b0(r1, r5)
            android.util.SparseArray r5 = r3.f
            r0 = 0
            java.lang.Object r5 = r5.valueAt(r0)
            j11 r5 = (defpackage.j11) r5
            float[] r3 = r3.g
            defpackage.l.M(r5, r4, r3)
            return
    }

    @Override // defpackage.qp7
    public final void d(int r13) {
            r12 = this;
            android.util.SparseArray r0 = r12.f
            int r1 = r0.size()
            r2 = 0
            java.lang.Object r3 = r0.valueAt(r2)
            j11 r3 = (defpackage.j11) r3
            int r3 = r3.c()
            double[] r4 = new double[r1]
            float[] r5 = new float[r3]
            r12.g = r5
            r5 = 2
            int[] r5 = new int[r5]
            r6 = 1
            r5[r6] = r3
            r5[r2] = r1
            java.lang.Class r3 = java.lang.Double.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r5)
            double[][] r3 = (double[][]) r3
            r5 = r2
        L28:
            if (r5 >= r1) goto L55
            int r6 = r0.keyAt(r5)
            java.lang.Object r7 = r0.valueAt(r5)
            j11 r7 = (defpackage.j11) r7
            double r8 = (double) r6
            r10 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r8 = r8 * r10
            r4[r5] = r8
            float[] r6 = r12.g
            r7.b(r6)
            r6 = r2
        L43:
            float[] r7 = r12.g
            int r8 = r7.length
            if (r6 >= r8) goto L52
            r8 = r3[r5]
            r7 = r7[r6]
            double r9 = (double) r7
            r8[r6] = r9
            int r6 = r6 + 1
            goto L43
        L52:
            int r5 = r5 + 1
            goto L28
        L55:
            ak7 r13 = defpackage.ak7.U(r13, r4, r3)
            r12.a = r13
            return
    }
}
