package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi6  reason: default package */
/* loaded from: classes.dex */
public final class zi6 {
    public final defpackage.gn a;
    public long b;

    public zi6(defpackage.gn r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L1d
        L3:
            boolean r0 = r5 instanceof defpackage.zi6
            r1 = 0
            if (r0 != 0) goto L9
            goto L1c
        L9:
            zi6 r5 = (defpackage.zi6) r5
            gn r0 = r4.a
            gn r2 = r5.a
            if (r0 == r2) goto L12
            return r1
        L12:
            long r2 = r4.b
            long r4 = r5.b
            boolean r4 = defpackage.q93.b(r2, r4)
            if (r4 != 0) goto L1d
        L1c:
            return r1
        L1d:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            gn r0 = r3.a
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
            java.lang.String r1 = "AnimData(anim="
            r0.<init>(r1)
            gn r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", startSize="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r3 = defpackage.q93.c(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
