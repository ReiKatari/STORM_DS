package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e97  reason: default package */
/* loaded from: classes.dex */
public final class e97 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public e97(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (!Double.isNaN(d2) && !Double.isNaN(d3) && !Double.isNaN(d4) && !Double.isNaN(d5) && !Double.isNaN(d6) && !Double.isNaN(d7) && !Double.isNaN(d)) {
            if (d == -2.0d || d == -3.0d) {
                return;
            }
            if (d5 >= 0.0d && d5 <= 1.0d) {
                if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
                    i.h("Parameter a or g is zero, the transfer function is constant");
                    throw null;
                } else if (d5 >= 1.0d && d4 == 0.0d) {
                    i.h("Parameter c is zero, the transfer function is constant");
                    throw null;
                } else if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
                    i.h("Parameter a or g is zero, and c is zero, the transfer function is constant");
                    throw null;
                } else if (d4 >= 0.0d) {
                    if (d2 >= 0.0d && d >= 0.0d) {
                        return;
                    }
                    i.h("The transfer function must be positive or increasing");
                    throw null;
                } else {
                    i.h("The transfer function must be increasing");
                    throw null;
                }
            }
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        i.h("Parameters cannot be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e97)) {
            return false;
        }
        e97 e97Var = (e97) obj;
        if (Double.compare(this.a, e97Var.a) == 0 && Double.compare(this.b, e97Var.b) == 0 && Double.compare(this.c, e97Var.c) == 0 && Double.compare(this.d, e97Var.d) == 0 && Double.compare(this.e, e97Var.e) == 0 && Double.compare(this.f, e97Var.f) == 0 && Double.compare(this.g, e97Var.g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.b);
        int hashCode2 = Double.hashCode(this.c);
        int hashCode3 = Double.hashCode(this.d);
        int hashCode4 = Double.hashCode(this.e);
        int hashCode5 = Double.hashCode(this.f);
        return Double.hashCode(this.g) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }

    public /* synthetic */ e97(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
