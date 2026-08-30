package d5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public double f3829e;

    /* renamed from: f  reason: collision with root package name */
    public double[] f3830f;

    @Override // ij.a
    public final double Z(double d4) {
        return this.f3830f[0];
    }

    @Override // ij.a
    public final void a0(double d4, double[] dArr) {
        double[] dArr2 = this.f3830f;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // ij.a
    public final void b0(double d4, float[] fArr) {
        int i2 = 0;
        while (true) {
            double[] dArr = this.f3830f;
            if (i2 < dArr.length) {
                fArr[i2] = (float) dArr[i2];
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // ij.a
    public final void e0(double d4, double[] dArr) {
        for (int i2 = 0; i2 < this.f3830f.length; i2++) {
            dArr[i2] = 0.0d;
        }
    }

    @Override // ij.a
    public final double[] h0() {
        return new double[]{this.f3829e};
    }
}
