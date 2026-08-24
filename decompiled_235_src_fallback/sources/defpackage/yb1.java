package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb1  reason: default package */
/* loaded from: classes.dex */
public final class yb1 {
    public long a;
    public float b;

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.yb1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            yb1 r8 = (defpackage.yb1) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            float r7 = r7.b
            float r8 = r8.b
            int r7 = java.lang.Float.compare(r7, r8)
            if (r7 == 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            float r2 = r2.b
            int r2 = java.lang.Float.hashCode(r2)
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DataPointAtTime(time="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", dataPoint="
            r0.append(r1)
            float r3 = r3.b
            r1 = 41
            java.lang.String r3 = defpackage.xg6.p(r0, r3, r1)
            return r3
    }
}
