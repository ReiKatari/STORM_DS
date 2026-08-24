package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p83  reason: default package */
/* loaded from: classes.dex */
public final class p83 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public p83(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.p83
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p83 r5 = (defpackage.p83) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 != r1) goto L25
            int r1 = r4.b
            int r3 = r5.b
            if (r1 != r3) goto L25
            int r1 = r4.c
            int r3 = r5.c
            if (r1 != r3) goto L25
            int r4 = r4.d
            int r5 = r5.d
            if (r4 != r5) goto L25
            return r0
        L25:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.c
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.d
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InsetsValues(left="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r2 = r2.d
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
