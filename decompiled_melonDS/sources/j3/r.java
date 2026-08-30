package j3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final double f7405a;

    /* renamed from: b  reason: collision with root package name */
    public final double f7406b;

    /* renamed from: c  reason: collision with root package name */
    public final double f7407c;

    /* renamed from: d  reason: collision with root package name */
    public final double f7408d;

    /* renamed from: e  reason: collision with root package name */
    public final double f7409e;

    /* renamed from: f  reason: collision with root package name */
    public final double f7410f;

    /* renamed from: g  reason: collision with root package name */
    public final double f7411g;

    public r(double d4, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f7405a = d4;
        this.f7406b = d10;
        this.f7407c = d11;
        this.f7408d = d12;
        this.f7409e = d13;
        this.f7410f = d14;
        this.f7411g = d15;
        if (!Double.isNaN(d10) && !Double.isNaN(d11) && !Double.isNaN(d12) && !Double.isNaN(d13) && !Double.isNaN(d14) && !Double.isNaN(d15) && !Double.isNaN(d4)) {
            if (d4 == -2.0d || d4 == -3.0d) {
                return;
            }
            if (d13 >= 0.0d && d13 <= 1.0d) {
                if (d13 == 0.0d && (d10 == 0.0d || d4 == 0.0d)) {
                    a0.j.h("Parameter a or g is zero, the transfer function is constant");
                    throw null;
                } else if (d13 >= 1.0d && d12 == 0.0d) {
                    a0.j.h("Parameter c is zero, the transfer function is constant");
                    throw null;
                } else if ((d10 == 0.0d || d4 == 0.0d) && d12 == 0.0d) {
                    a0.j.h("Parameter a or g is zero, and c is zero, the transfer function is constant");
                    throw null;
                } else if (d12 >= 0.0d) {
                    if (d10 >= 0.0d && d4 >= 0.0d) {
                        return;
                    }
                    a0.j.h("The transfer function must be positive or increasing");
                    throw null;
                } else {
                    a0.j.h("The transfer function must be increasing");
                    throw null;
                }
            }
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d13);
        }
        a0.j.h("Parameters cannot be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Double.compare(this.f7405a, rVar.f7405a) == 0 && Double.compare(this.f7406b, rVar.f7406b) == 0 && Double.compare(this.f7407c, rVar.f7407c) == 0 && Double.compare(this.f7408d, rVar.f7408d) == 0 && Double.compare(this.f7409e, rVar.f7409e) == 0 && Double.compare(this.f7410f, rVar.f7410f) == 0 && Double.compare(this.f7411g, rVar.f7411g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.f7406b);
        int hashCode2 = Double.hashCode(this.f7407c);
        int hashCode3 = Double.hashCode(this.f7408d);
        int hashCode4 = Double.hashCode(this.f7409e);
        int hashCode5 = Double.hashCode(this.f7410f);
        return Double.hashCode(this.f7411g) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Double.hashCode(this.f7405a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f7405a + ", a=" + this.f7406b + ", b=" + this.f7407c + ", c=" + this.f7408d + ", d=" + this.f7409e + ", e=" + this.f7410f + ", f=" + this.f7411g + ')';
    }

    public /* synthetic */ r(double d4, double d10, double d11, double d12, double d13) {
        this(d4, d10, d11, d12, d13, 0.0d, 0.0d);
    }
}
