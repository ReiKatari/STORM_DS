package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f00  reason: default package */
/* loaded from: classes.dex */
public final class f00 extends defpackage.kj2 {
    public final java.lang.Object i;
    public final long j;

    public f00(long r1, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.i = r3
            r0.j = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1f
        L3:
            boolean r0 = r3 instanceof defpackage.f00
            if (r0 != 0) goto L8
            goto L1d
        L8:
            f00 r3 = (defpackage.f00) r3
            java.lang.Object r0 = r2.i
            java.lang.Object r1 = r3.i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1d
        L15:
            long r0 = r2.j
            long r2 = r3.j
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.i
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.j
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BackHandlerInfo(owner="
            r0.<init>(r1)
            java.lang.Object r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ", compositeKey="
            r0.append(r1)
            long r1 = r3.j
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
