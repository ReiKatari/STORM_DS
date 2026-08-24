package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e40  reason: default package */
/* loaded from: classes.dex */
public final class e40 implements defpackage.ic {
    public final float a;
    public final float b;

    public e40(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.ic
    public final long a(long r6, long r8, defpackage.kk3 r10) {
            r5 = this;
            r0 = 32
            long r1 = r8 >> r0
            int r1 = (int) r1
            long r2 = r6 >> r0
            int r2 = (int) r2
            int r1 = r1 - r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r3
            int r8 = (int) r8
            long r6 = r6 & r3
            int r6 = (int) r6
            int r8 = r8 - r6
            float r6 = (float) r8
            float r6 = r6 / r2
            kk3 r7 = defpackage.kk3.Ltr
            float r8 = r5.a
            if (r10 != r7) goto L20
            goto L23
        L20:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r8 = r8 * r7
        L23:
            r7 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 + r7
            float r8 = r8 * r1
            float r5 = r5.b
            float r7 = r7 + r5
            float r7 = r7 * r6
            int r5 = java.lang.Math.round(r8)
            int r6 = java.lang.Math.round(r7)
            long r7 = (long) r5
            long r7 = r7 << r0
            long r5 = (long) r6
            long r5 = r5 & r3
            long r5 = r5 | r7
            return r5
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.e40
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            e40 r5 = (defpackage.e40) r5
            float r1 = r4.a
            float r3 = r5.a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r4 = r4.b
            float r5 = r5.b
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r1.b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BiasAlignment(horizontalBias="
            r0.<init>(r1)
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", verticalBias="
            r0.append(r1)
            float r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
