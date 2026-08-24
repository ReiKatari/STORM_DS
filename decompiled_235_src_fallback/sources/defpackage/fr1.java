package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fr1  reason: default package */
/* loaded from: classes.dex */
public final class fr1 extends defpackage.gr1 {
    public final double i0;
    public final double j0;
    public final double k0;
    public final double l0;

    public fr1(java.lang.String r6) {
            r5 = this;
            r5.<init>()
            r5.B = r6
            r0 = 40
            int r0 = r6.indexOf(r0)
            r1 = 44
            int r2 = r6.indexOf(r1, r0)
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0, r2)
            java.lang.String r0 = r0.trim()
            double r3 = java.lang.Double.parseDouble(r0)
            r5.i0 = r3
            int r2 = r2 + 1
            int r0 = r6.indexOf(r1, r2)
            java.lang.String r2 = r6.substring(r2, r0)
            java.lang.String r2 = r2.trim()
            double r2 = java.lang.Double.parseDouble(r2)
            r5.j0 = r2
            int r0 = r0 + 1
            int r1 = r6.indexOf(r1, r0)
            java.lang.String r0 = r6.substring(r0, r1)
            java.lang.String r0 = r0.trim()
            double r2 = java.lang.Double.parseDouble(r0)
            r5.k0 = r2
            int r1 = r1 + 1
            r0 = 41
            int r0 = r6.indexOf(r0, r1)
            java.lang.String r6 = r6.substring(r1, r0)
            java.lang.String r6 = r6.trim()
            double r0 = java.lang.Double.parseDouble(r6)
            r5.l0 = r0
            return
    }

    @Override // defpackage.gr1
    public final double a(double r9) {
            r8 = this;
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return r0
        L7:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto Le
            return r0
        Le:
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2 = r0
            r4 = r2
        L12:
            r6 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 <= 0) goto L28
            double r6 = r8.f(r4)
            double r2 = r2 * r0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 >= 0) goto L26
            double r4 = r4 + r2
            goto L12
        L26:
            double r4 = r4 - r2
            goto L12
        L28:
            double r0 = r4 - r2
            double r6 = r8.f(r0)
            double r4 = r4 + r2
            double r2 = r8.f(r4)
            double r0 = r8.h(r0)
            double r4 = r8.h(r4)
            double r4 = r4 - r0
            double r9 = r9 - r6
            double r9 = r9 * r4
            double r2 = r2 - r6
            double r9 = r9 / r2
            double r9 = r9 + r0
            return r9
    }

    @Override // defpackage.gr1
    public final double b(double r9) {
            r8 = this;
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2 = r0
            r4 = r2
        L4:
            r6 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 <= 0) goto L1a
            double r6 = r8.f(r4)
            double r2 = r2 * r0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 >= 0) goto L18
            double r4 = r4 + r2
            goto L4
        L18:
            double r4 = r4 - r2
            goto L4
        L1a:
            double r9 = r4 - r2
            double r0 = r8.f(r9)
            double r4 = r4 + r2
            double r2 = r8.f(r4)
            double r9 = r8.h(r9)
            double r4 = r8.h(r4)
            double r4 = r4 - r9
            double r2 = r2 - r0
            double r4 = r4 / r2
            return r4
    }

    public final double f(double r7) {
            r6 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r7
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r2 = r2 * r0
            double r0 = r0 * r2
            double r0 = r0 * r7
            double r2 = r2 * r7
            double r2 = r2 * r7
            double r4 = r7 * r7
            double r4 = r4 * r7
            double r7 = r6.i0
            double r7 = r7 * r0
            double r0 = r6.k0
            double r0 = r0 * r2
            double r0 = r0 + r7
            double r0 = r0 + r4
            return r0
    }

    public final double h(double r7) {
            r6 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r7
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r2 = r2 * r0
            double r0 = r0 * r2
            double r0 = r0 * r7
            double r2 = r2 * r7
            double r2 = r2 * r7
            double r4 = r7 * r7
            double r4 = r4 * r7
            double r7 = r6.j0
            double r7 = r7 * r0
            double r0 = r6.l0
            double r0 = r0 * r2
            double r0 = r0 + r7
            double r0 = r0 + r4
            return r0
    }
}
