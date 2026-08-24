package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: my4  reason: default package */
/* loaded from: classes.dex */
public final class my4 {
    public int a;
    public int b;

    public my4(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.my4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            my4 r5 = (defpackage.my4) r5
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
            r4 = this;
            int r0 = r4.a
            int r4 = r4.b
            java.lang.String r1 = ", y="
            java.lang.String r2 = ")"
            java.lang.String r3 = "Point(x="
            java.lang.String r4 = defpackage.xg6.m(r0, r4, r3, r1, r2)
            return r4
    }
}
