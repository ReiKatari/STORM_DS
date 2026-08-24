package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fh1  reason: default package */
/* loaded from: classes.dex */
public final class fh1 {
    public final java.lang.Object a;
    public final boolean b;

    public fh1(boolean r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof defpackage.fh1
            if (r0 != 0) goto L8
            goto L1b
        L8:
            fh1 r3 = (defpackage.fh1) r3
            java.lang.Object r0 = r2.a
            java.lang.Object r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r2 = r2.b
            boolean r3 = r3.b
            if (r2 == r3) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            boolean r1 = r1.b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Deletable(data="
            r0.<init>(r1)
            java.lang.Object r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", isDeleted="
            r0.append(r1)
            boolean r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
