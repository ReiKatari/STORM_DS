package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np3  reason: default package */
/* loaded from: classes.dex */
public final class np3 {
    public final int a;
    public final int b;

    public np3(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2 = 0
            r0 = 1
            if (r3 < 0) goto Ld
            r1 = r0
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 != 0) goto L15
            java.lang.String r1 = "negative start index"
            defpackage.s53.a(r1)
        L15:
            if (r4 < r3) goto L18
            r2 = r0
        L18:
            if (r2 != 0) goto L1f
            java.lang.String r2 = "end index greater than start"
            defpackage.s53.a(r2)
        L1f:
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.np3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            np3 r5 = (defpackage.np3) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Interval(start="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
