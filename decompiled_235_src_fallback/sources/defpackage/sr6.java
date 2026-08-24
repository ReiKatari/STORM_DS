package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr6  reason: default package */
/* loaded from: classes.dex */
public final class sr6 {
    public final java.util.Map a;
    public final int b;

    public sr6(int r1, java.util.Map r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.sr6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sr6 r5 = (defpackage.sr6) r5
            java.util.Map r1 = r4.a
            java.util.Map r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StreamSpecQueryResult(streamSpecs="
            r0.<init>(r1)
            java.util.Map r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", maxSupportedFrameRate="
            r0.append(r1)
            int r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
