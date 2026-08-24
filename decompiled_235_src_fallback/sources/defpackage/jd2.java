package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jd2  reason: default package */
/* loaded from: classes.dex */
public final class jd2 implements defpackage.z31 {
    @Override // defpackage.z31
    public final long c(long r3, long r5) {
            r2 = this;
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = java.lang.Float.floatToRawIntBits(r2)
            long r3 = (long) r3
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r5 = (long) r2
            r2 = 32
            long r2 = r3 << r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r5 & r0
            long r2 = r2 | r4
            int r4 = defpackage.a66.a
            return r2
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L3
            goto L12
        L3:
            boolean r0 = r1 instanceof defpackage.jd2
            if (r0 != 0) goto L8
            goto L10
        L8:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L12
        L10:
            r0 = 0
            return r0
        L12:
            r0 = 1
            return r0
    }

    public final int hashCode() {
            r0 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "FixedScale(value=1.0)"
            return r0
    }
}
