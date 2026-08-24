package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vt  reason: default package */
/* loaded from: classes.dex */
public final class vt {
    public static final double[] s = null;
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

    static {
            r0 = 91
            double[] r0 = new double[r0]
            defpackage.vt.s = r0
            return
    }

    public final double a() {
            r6 = this;
            double r0 = r6.j
            double r2 = r6.p
            double r0 = r0 * r2
            double r2 = r6.k
            double r2 = -r2
            double r4 = r6.o
            double r2 = r2 * r4
            double r4 = r6.n
            double r2 = java.lang.Math.hypot(r0, r2)
            double r4 = r4 / r2
            boolean r6 = r6.q
            if (r6 == 0) goto L19
            double r0 = -r0
            double r0 = r0 * r4
            return r0
        L19:
            double r0 = r0 * r4
            return r0
    }

    public final double b() {
            r6 = this;
            double r0 = r6.j
            double r2 = r6.p
            double r0 = r0 * r2
            double r2 = r6.k
            double r2 = -r2
            double r4 = r6.o
            double r2 = r2 * r4
            double r4 = r6.n
            double r0 = java.lang.Math.hypot(r0, r2)
            double r4 = r4 / r0
            boolean r6 = r6.q
            if (r6 == 0) goto L19
            double r0 = -r2
            double r0 = r0 * r4
            return r0
        L19:
            double r2 = r2 * r4
            return r2
    }

    public final double c(double r5) {
            r4 = this;
            double r0 = r4.c
            double r5 = r5 - r0
            double r0 = r4.i
            double r5 = r5 * r0
            double r0 = r4.e
            double r2 = r4.f
            double r2 = r2 - r0
            double r2 = r2 * r5
            double r2 = r2 + r0
            return r2
    }

    public final double d(double r5) {
            r4 = this;
            double r0 = r4.c
            double r5 = r5 - r0
            double r0 = r4.i
            double r5 = r5 * r0
            double r0 = r4.g
            double r2 = r4.h
            double r2 = r2 - r0
            double r2 = r2 * r5
            double r2 = r2 + r0
            return r2
    }

    public final double e() {
            r6 = this;
            double r0 = r6.l
            double r2 = r6.j
            double r4 = r6.o
            double r2 = r2 * r4
            double r2 = r2 + r0
            return r2
    }

    public final double f() {
            r6 = this;
            double r0 = r6.m
            double r2 = r6.k
            double r4 = r6.p
            double r2 = r2 * r4
            double r2 = r2 + r0
            return r2
    }

    public final void g(double r7) {
            r6 = this;
            boolean r0 = r6.q
            if (r0 == 0) goto L8
            double r0 = r6.d
            double r0 = r0 - r7
            goto Lc
        L8:
            double r0 = r6.c
            double r0 = r7 - r0
        Lc:
            double r7 = r6.i
            double r0 = r0 * r7
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L16
            goto L31
        L16:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L1d
            goto L31
        L1d:
            double[] r7 = r6.a
            int r8 = r7.length
            int r8 = r8 + (-1)
            double r2 = (double) r8
            double r0 = r0 * r2
            int r8 = (int) r0
            double r2 = (double) r8
            double r0 = r0 - r2
            r2 = r7[r8]
            int r8 = r8 + 1
            r4 = r7[r8]
            double r4 = r4 - r2
            double r4 = r4 * r0
            double r7 = r4 + r2
        L31:
            r0 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r7 = r7 * r0
            double r0 = java.lang.Math.sin(r7)
            r6.o = r0
            double r7 = java.lang.Math.cos(r7)
            r6.p = r7
            return
    }
}
