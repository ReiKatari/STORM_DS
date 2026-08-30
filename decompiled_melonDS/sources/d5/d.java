package d5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: e  reason: collision with root package name */
    public final double f3831e;

    /* renamed from: f  reason: collision with root package name */
    public final double f3832f;

    /* renamed from: g  reason: collision with root package name */
    public final double f3833g;

    /* renamed from: h  reason: collision with root package name */
    public final double f3834h;

    public d(String str) {
        super(0);
        this.f3838b = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f3831e = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i2 = indexOf2 + 1;
        int indexOf3 = str.indexOf(44, i2);
        this.f3832f = Double.parseDouble(str.substring(i2, indexOf3).trim());
        int i10 = indexOf3 + 1;
        int indexOf4 = str.indexOf(44, i10);
        this.f3833g = Double.parseDouble(str.substring(i10, indexOf4).trim());
        int i11 = indexOf4 + 1;
        this.f3834h = Double.parseDouble(str.substring(i11, str.indexOf(41, i11)).trim());
    }

    @Override // d5.e
    public final double a(double d4) {
        if (d4 <= 0.0d) {
            return 0.0d;
        }
        if (d4 >= 1.0d) {
            return 1.0d;
        }
        double d10 = 0.5d;
        double d11 = 0.5d;
        while (d10 > 0.01d) {
            d10 *= 0.5d;
            if (e(d11) < d4) {
                d11 += d10;
            } else {
                d11 -= d10;
            }
        }
        double d12 = d11 - d10;
        double e6 = e(d12);
        double d13 = d11 + d10;
        double e10 = e(d13);
        double f8 = f(d12);
        return (((d4 - e6) * (f(d13) - f8)) / (e10 - e6)) + f8;
    }

    @Override // d5.e
    public final double b(double d4) {
        double d10 = 0.5d;
        double d11 = 0.5d;
        while (d10 > 1.0E-4d) {
            d10 *= 0.5d;
            if (e(d11) < d4) {
                d11 += d10;
            } else {
                d11 -= d10;
            }
        }
        double d12 = d11 - d10;
        double e6 = e(d12);
        double d13 = d11 + d10;
        return (f(d13) - f(d12)) / (e(d13) - e6);
    }

    public final double e(double d4) {
        double d10 = 1.0d - d4;
        double d11 = 3.0d * d10;
        double d12 = d10 * d11 * d4;
        double d13 = d11 * d4 * d4;
        return (this.f3833g * d13) + (this.f3831e * d12) + (d4 * d4 * d4);
    }

    public final double f(double d4) {
        double d10 = 1.0d - d4;
        double d11 = 3.0d * d10;
        double d12 = d10 * d11 * d4;
        double d13 = d11 * d4 * d4;
        return (this.f3834h * d13) + (this.f3832f * d12) + (d4 * d4 * d4);
    }
}
