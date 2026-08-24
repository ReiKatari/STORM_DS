package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n66  reason: default package */
/* loaded from: classes.dex */
public final class n66 extends gr1 {
    public double i0;
    public double j0;

    @Override // defpackage.gr1
    public final double a(double d) {
        double d2 = this.j0;
        int i = (d > d2 ? 1 : (d == d2 ? 0 : -1));
        double d3 = this.i0;
        if (i < 0) {
            return (d2 * d) / (((d2 - d) * d3) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * d3));
    }

    @Override // defpackage.gr1
    public final double b(double d) {
        double d2 = this.j0;
        int i = (d > d2 ? 1 : (d == d2 ? 0 : -1));
        double d3 = this.i0;
        if (i < 0) {
            double d4 = d3 * d2 * d2;
            double d5 = ((d2 - d) * d3) + d;
            return d4 / (d5 * d5);
        }
        double d6 = d2 - 1.0d;
        double d7 = (((d2 - d) * (-d3)) - d) + 1.0d;
        return ((d6 * d3) * d6) / (d7 * d7);
    }
}
