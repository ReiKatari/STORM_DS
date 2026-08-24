package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fa5  reason: default package */
/* loaded from: classes.dex */
public final class fa5 {
    public final java.lang.String a;
    public final long b;

    public fa5(java.lang.String r1, long r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.fa5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fa5 r6 = (defpackage.fa5) r6
            java.lang.String r1 = r5.a
            java.lang.String r3 = r6.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r5.b
            long r5 = r6.b
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.b
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RAGameHashEntity(gameHash="
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", gameId="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
