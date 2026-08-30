package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ev5  reason: default package */
/* loaded from: classes.dex */
public final class ev5 extends an1 {
    public double h0;
    public double i0;

    @Override // defpackage.an1
    public final double b(double d) {
        double d2 = this.i0;
        int i = (d > d2 ? 1 : (d == d2 ? 0 : -1));
        double d3 = this.h0;
        if (i < 0) {
            return (d2 * d) / (((d2 - d) * d3) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * d3));
    }

    @Override // defpackage.an1
    public final double c(double d) {
        double d2 = this.i0;
        int i = (d > d2 ? 1 : (d == d2 ? 0 : -1));
        double d3 = this.h0;
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
