package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e81  reason: default package */
/* loaded from: classes.dex */
public final class e81 extends ak7 {
    public double l;
    public double[] m;

    @Override // defpackage.ak7
    public final double Z(double d) {
        return this.m[0];
    }

    @Override // defpackage.ak7
    public final void a0(double d, double[] dArr) {
        double[] dArr2 = this.m;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // defpackage.ak7
    public final void b0(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.m;
            if (i < dArr.length) {
                fArr[i] = (float) dArr[i];
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ak7
    public final void d0(double d, double[] dArr) {
        for (int i = 0; i < this.m.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // defpackage.ak7
    public final double[] g0() {
        return new double[]{this.l};
    }
}
