package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b40  reason: default package */
/* loaded from: classes.dex */
public final class b40 implements defpackage.ic {
    public final float a;

    public b40(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.ic
    public final long a(long r4, long r6, defpackage.kk3 r8) {
            r3 = this;
            r8 = 32
            long r0 = r6 >> r8
            int r0 = (int) r0
            long r1 = r4 >> r8
            int r1 = (int) r1
            int r0 = r0 - r1
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r1
            int r6 = (int) r6
            long r4 = r4 & r1
            int r4 = (int) r4
            int r6 = r6 - r4
            long r4 = (long) r0
            long r4 = r4 << r8
            long r6 = (long) r6
            long r6 = r6 & r1
            long r4 = r4 | r6
            long r6 = r4 >> r8
            int r6 = (int) r6
            float r6 = (float) r6
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            long r4 = r4 & r1
            int r4 = (int) r4
            float r4 = (float) r4
            float r4 = r4 / r7
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.a
            float r5 = r5 + r3
            float r5 = r5 * r6
            r3 = 0
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r5)
            int r4 = java.lang.Math.round(r4)
            long r5 = (long) r3
            long r5 = r5 << r8
            long r3 = (long) r4
            long r3 = r3 & r1
            long r3 = r3 | r5
            return r3
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L1f
        L3:
            boolean r0 = r2 instanceof defpackage.b40
            if (r0 != 0) goto L8
            goto L1d
        L8:
            b40 r2 = (defpackage.b40) r2
            float r1 = r1.a
            float r2 = r2.a
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 == 0) goto L15
            goto L1d
        L15:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = java.lang.Float.compare(r1, r1)
            if (r1 == 0) goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r1 = this;
            float r1 = r1.a
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 * 31
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BiasAbsoluteAlignment(horizontalBias="
            r0.<init>(r1)
            float r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ", verticalBias=-1.0)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
