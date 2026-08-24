package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx0  reason: default package */
/* loaded from: classes.dex */
public final class hx0 {
    public final int a;
    public final java.lang.Integer b;

    public hx0(int r1, defpackage.jx2 r2, java.lang.Integer r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.hx0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hx0 r5 = (defpackage.hx0) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            r1 = 0
            boolean r1 = defpackage.nb3.k(r1, r1)
            if (r1 != 0) goto L1b
            return r2
        L1b:
            java.lang.Integer r4 = r4.b
            java.lang.Integer r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L26
            return r2
        L26:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            r1 = 0
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Integer r2 = r2.b
            if (r2 != 0) goto L11
            goto L15
        L11:
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ComposeStackTraceFrame(groupKey="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", sourceInfo="
            r0.append(r1)
            r1 = 0
            r0.append(r1)
            java.lang.String r1 = ", groupOffset="
            r0.append(r1)
            java.lang.Integer r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
