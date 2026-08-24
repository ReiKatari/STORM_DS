package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e81  reason: default package */
/* loaded from: classes.dex */
public final class e81 extends defpackage.ak7 {
    public double l;
    public double[] m;

    @Override // defpackage.ak7
    public final double Z(double r1) {
            r0 = this;
            r1 = 0
            double[] r0 = r0.m
            r1 = r0[r1]
            return r1
    }

    @Override // defpackage.ak7
    public final void a0(double r1, double[] r3) {
            r0 = this;
            double[] r0 = r0.m
            r1 = 0
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r1, r3, r1, r2)
            return
    }

    @Override // defpackage.ak7
    public final void b0(double r3, float[] r5) {
            r2 = this;
            r3 = 0
        L1:
            double[] r4 = r2.m
            int r0 = r4.length
            if (r3 >= r0) goto Le
            r0 = r4[r3]
            float r4 = (float) r0
            r5[r3] = r4
            int r3 = r3 + 1
            goto L1
        Le:
            return
    }

    @Override // defpackage.ak7
    public final void d0(double r3, double[] r5) {
            r2 = this;
            r3 = 0
        L1:
            double[] r4 = r2.m
            int r4 = r4.length
            if (r3 >= r4) goto Ld
            r0 = 0
            r5[r3] = r0
            int r3 = r3 + 1
            goto L1
        Ld:
            return
    }

    @Override // defpackage.ak7
    public final double[] g0() {
            r3 = this;
            double r0 = r3.l
            r3 = 1
            double[] r3 = new double[r3]
            r2 = 0
            r3[r2] = r0
            return r3
    }
}
