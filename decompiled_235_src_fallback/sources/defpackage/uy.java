package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uy  reason: default package */
/* loaded from: classes.dex */
public final class uy {
    public final defpackage.wr0 a;
    public final java.util.HashMap b;

    public uy(defpackage.wr0 r1, java.util.HashMap r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final long a(defpackage.b35 r9, long r10, int r12) {
            r8 = this;
            wr0 r0 = r8.a
            long r0 = r0.a()
            long r10 = r10 - r0
            java.util.HashMap r8 = r8.b
            java.lang.Object r8 = r8.get(r9)
            vy r8 = (defpackage.vy) r8
            long r0 = r8.a
            int r12 = r12 + (-1)
            r2 = 1
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L1b
            r2 = r0
            goto L1d
        L1b:
            r2 = 2
        L1d:
            r4 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r4 = java.lang.Math.log(r4)
            long r6 = (long) r12
            long r2 = r2 * r6
            double r2 = (double) r2
            double r2 = java.lang.Math.log(r2)
            double r4 = r4 / r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = java.lang.Math.max(r2, r4)
            r4 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = (double) r12
            double r4 = java.lang.Math.pow(r4, r6)
            double r0 = (double) r0
            double r4 = r4 * r0
            double r4 = r4 * r2
            long r0 = (long) r4
            long r9 = java.lang.Math.max(r0, r10)
            long r11 = r8.b
            long r8 = java.lang.Math.min(r9, r11)
            return r8
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof defpackage.uy
            if (r0 == 0) goto L1f
            uy r3 = (defpackage.uy) r3
            wr0 r0 = r2.a
            wr0 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            java.util.HashMap r2 = r2.b
            java.util.HashMap r3 = r3.b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1f
        L1d:
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            wr0 r0 = r2.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.HashMap r2 = r2.b
            int r2 = r2.hashCode()
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SchedulerConfig{clock="
            r0.<init>(r1)
            wr0 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", values="
            r0.append(r1)
            java.util.HashMap r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
