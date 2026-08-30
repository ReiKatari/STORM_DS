package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ft  reason: default package */
/* loaded from: classes.dex */
public final class ft {
    public static final double[] s = new double[91];
    public double[] a;
    public double b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public double k;
    public double l;
    public double m;
    public double n;
    public double o;
    public double p;
    public boolean q;
    public boolean r;

    public final double a() {
        double d = this.j * this.p;
        double hypot = this.n / Math.hypot(d, (-this.k) * this.o);
        if (this.q) {
            return (-d) * hypot;
        }
        return d * hypot;
    }

    public final double b() {
        double d = this.j * this.p;
        double d2 = (-this.k) * this.o;
        double hypot = this.n / Math.hypot(d, d2);
        if (this.q) {
            return (-d2) * hypot;
        }
        return d2 * hypot;
    }

    public final double c(double d) {
        double d2 = (d - this.c) * this.i;
        double d3 = this.e;
        return ((this.f - d3) * d2) + d3;
    }

    public final double d(double d) {
        double d2 = (d - this.c) * this.i;
        double d3 = this.g;
        return ((this.h - d3) * d2) + d3;
    }

    public final double e() {
        return (this.j * this.o) + this.l;
    }

    public final double f() {
        return (this.k * this.p) + this.m;
    }

    public final void g(double d) {
        double d2;
        if (this.q) {
            d2 = this.d - d;
        } else {
            d2 = d - this.c;
        }
        double d3 = d2 * this.i;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            d4 = 1.0d;
            if (d3 < 1.0d) {
                double[] dArr = this.a;
                double length = d3 * (dArr.length - 1);
                int i = (int) length;
                double d5 = dArr[i];
                d4 = ((dArr[i + 1] - d5) * (length - i)) + d5;
            }
        }
        double d6 = d4 * 1.5707963267948966d;
        this.o = Math.sin(d6);
        this.p = Math.cos(d6);
    }
}
