package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n66  reason: default package */
/* loaded from: classes.dex */
public final class n66 extends defpackage.gr1 {
    public double i0;
    public double j0;

    @Override // defpackage.gr1
    public final double a(double r12) {
            r11 = this;
            double r0 = r11.j0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            double r3 = r11.i0
            if (r2 >= 0) goto Lf
            double r5 = r0 * r12
            double r0 = r0 - r12
            double r0 = r0 * r3
            double r0 = r0 + r12
            double r5 = r5 / r0
            return r5
        Lf:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r5 - r0
            double r9 = r12 - r5
            double r9 = r9 * r7
            double r5 = r5 - r12
            double r0 = r0 - r12
            double r0 = r0 * r3
            double r5 = r5 - r0
            double r9 = r9 / r5
            return r9
    }

    @Override // defpackage.gr1
    public final double b(double r12) {
            r11 = this;
            double r0 = r11.j0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            double r3 = r11.i0
            if (r2 >= 0) goto L11
            double r5 = r3 * r0
            double r5 = r5 * r0
            double r0 = r0 - r12
            double r0 = r0 * r3
            double r0 = r0 + r12
            double r0 = r0 * r0
            double r5 = r5 / r0
            return r5
        L11:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r0 - r5
            double r9 = r7 * r3
            double r9 = r9 * r7
            double r2 = -r3
            double r0 = r0 - r12
            double r0 = r0 * r2
            double r0 = r0 - r12
            double r0 = r0 + r5
            double r0 = r0 * r0
            double r9 = r9 / r0
            return r9
    }
}
