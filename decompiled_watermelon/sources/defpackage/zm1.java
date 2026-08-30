package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zm1  reason: default package */
/* loaded from: classes.dex */
public final class zm1 extends an1 {
    public final double h0;
    public final double i0;
    public final double j0;
    public final double k0;

    public zm1(String str) {
        this.B = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.h0 = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        int indexOf3 = str.indexOf(44, i);
        this.i0 = Double.parseDouble(str.substring(i, indexOf3).trim());
        int i2 = indexOf3 + 1;
        int indexOf4 = str.indexOf(44, i2);
        this.j0 = Double.parseDouble(str.substring(i2, indexOf4).trim());
        int i3 = indexOf4 + 1;
        this.k0 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
    }

    @Override // defpackage.an1
    public final double b(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 0.01d) {
            d2 *= 0.5d;
            if (g(d3) < d) {
                d3 += d2;
            } else {
                d3 -= d2;
            }
        }
        double d4 = d3 - d2;
        double g = g(d4);
        double d5 = d3 + d2;
        double g2 = g(d5);
        double h = h(d4);
        return (((d - g) * (h(d5) - h)) / (g2 - g)) + h;
    }

    @Override // defpackage.an1
    public final double c(double d) {
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 1.0E-4d) {
            d2 *= 0.5d;
            if (g(d3) < d) {
                d3 += d2;
            } else {
                d3 -= d2;
            }
        }
        double d4 = d3 - d2;
        double g = g(d4);
        double d5 = d3 + d2;
        return (h(d5) - h(d4)) / (g(d5) - g);
    }

    public final double g(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.j0 * d5) + (this.h0 * d4) + (d * d * d);
    }

    public final double h(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.k0 * d5) + (this.i0 * d4) + (d * d * d);
    }
}
