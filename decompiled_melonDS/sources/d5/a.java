package d5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: s  reason: collision with root package name */
    public static final double[] f3809s = new double[91];

    /* renamed from: a  reason: collision with root package name */
    public double[] f3810a;

    /* renamed from: b  reason: collision with root package name */
    public double f3811b;

    /* renamed from: c  reason: collision with root package name */
    public double f3812c;

    /* renamed from: d  reason: collision with root package name */
    public double f3813d;

    /* renamed from: e  reason: collision with root package name */
    public double f3814e;

    /* renamed from: f  reason: collision with root package name */
    public double f3815f;

    /* renamed from: g  reason: collision with root package name */
    public double f3816g;

    /* renamed from: h  reason: collision with root package name */
    public double f3817h;

    /* renamed from: i  reason: collision with root package name */
    public double f3818i;

    /* renamed from: j  reason: collision with root package name */
    public double f3819j;

    /* renamed from: k  reason: collision with root package name */
    public double f3820k;

    /* renamed from: l  reason: collision with root package name */
    public double f3821l;
    public double m;

    /* renamed from: n  reason: collision with root package name */
    public double f3822n;

    /* renamed from: o  reason: collision with root package name */
    public double f3823o;

    /* renamed from: p  reason: collision with root package name */
    public double f3824p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3825q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3826r;

    public final double a() {
        double d4 = this.f3819j * this.f3824p;
        double hypot = this.f3822n / Math.hypot(d4, (-this.f3820k) * this.f3823o);
        if (this.f3825q) {
            return (-d4) * hypot;
        }
        return d4 * hypot;
    }

    public final double b() {
        double d4 = this.f3819j * this.f3824p;
        double d10 = (-this.f3820k) * this.f3823o;
        double hypot = this.f3822n / Math.hypot(d4, d10);
        if (this.f3825q) {
            return (-d10) * hypot;
        }
        return d10 * hypot;
    }

    public final double c(double d4) {
        double d10 = (d4 - this.f3812c) * this.f3818i;
        double d11 = this.f3814e;
        return ((this.f3815f - d11) * d10) + d11;
    }

    public final double d(double d4) {
        double d10 = (d4 - this.f3812c) * this.f3818i;
        double d11 = this.f3816g;
        return ((this.f3817h - d11) * d10) + d11;
    }

    public final double e() {
        return (this.f3819j * this.f3823o) + this.f3821l;
    }

    public final double f() {
        return (this.f3820k * this.f3824p) + this.m;
    }

    public final void g(double d4) {
        double d10;
        if (this.f3825q) {
            d10 = this.f3813d - d4;
        } else {
            d10 = d4 - this.f3812c;
        }
        double d11 = d10 * this.f3818i;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            d12 = 1.0d;
            if (d11 < 1.0d) {
                double[] dArr = this.f3810a;
                double length = d11 * (dArr.length - 1);
                int i2 = (int) length;
                double d13 = dArr[i2];
                d12 = ((dArr[i2 + 1] - d13) * (length - i2)) + d13;
            }
        }
        double d14 = d12 * 1.5707963267948966d;
        this.f3823o = Math.sin(d14);
        this.f3824p = Math.cos(d14);
    }
}
