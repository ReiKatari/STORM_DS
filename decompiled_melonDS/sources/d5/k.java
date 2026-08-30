package d5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends e {

    /* renamed from: e  reason: collision with root package name */
    public double f3865e;

    /* renamed from: f  reason: collision with root package name */
    public double f3866f;

    @Override // d5.e
    public final double a(double d4) {
        double d10 = this.f3866f;
        int i2 = (d4 > d10 ? 1 : (d4 == d10 ? 0 : -1));
        double d11 = this.f3865e;
        if (i2 < 0) {
            return (d10 * d4) / (((d10 - d4) * d11) + d4);
        }
        return ((d4 - 1.0d) * (1.0d - d10)) / ((1.0d - d4) - ((d10 - d4) * d11));
    }

    @Override // d5.e
    public final double b(double d4) {
        double d10 = this.f3866f;
        int i2 = (d4 > d10 ? 1 : (d4 == d10 ? 0 : -1));
        double d11 = this.f3865e;
        if (i2 < 0) {
            double d12 = d11 * d10 * d10;
            double d13 = ((d10 - d4) * d11) + d4;
            return d12 / (d13 * d13);
        }
        double d14 = d10 - 1.0d;
        double d15 = (((d10 - d4) * (-d11)) - d4) + 1.0d;
        return ((d14 * d11) * d14) / (d15 * d15);
    }
}
