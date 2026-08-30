package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u41  reason: default package */
/* loaded from: classes.dex */
public final class u41 extends jv3 {
    public double p;
    public double[] q;

    @Override // defpackage.jv3
    public final double C(double d) {
        return this.q[0];
    }

    @Override // defpackage.jv3
    public final void D(double d, double[] dArr) {
        double[] dArr2 = this.q;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // defpackage.jv3
    public final void E(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.q;
            if (i < dArr.length) {
                fArr[i] = (float) dArr[i];
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.jv3
    public final void G(double d, double[] dArr) {
        for (int i = 0; i < this.q.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // defpackage.jv3
    public final double[] H() {
        return new double[]{this.p};
    }
}
