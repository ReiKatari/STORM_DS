package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td2  reason: default package */
/* loaded from: classes.dex */
public final class td2 {
    public final float a;
    public final float b;
    public final long c;

    public td2(float r1, float r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.td2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            td2 r6 = (defpackage.td2) r6
            float r1 = r5.a
            float r3 = r6.a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r5.b
            float r3 = r6.b
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            long r3 = r5.c
            long r5 = r6.c
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L2b
            return r2
        L2b:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            long r1 = r3.c
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FlingInfo(initialVelocity="
            r0.<init>(r1)
            float r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", distance="
            r0.append(r1)
            float r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r3.c
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
