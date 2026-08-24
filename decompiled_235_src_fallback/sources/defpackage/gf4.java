package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gf4  reason: default package */
/* loaded from: classes.dex */
public final class gf4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public gf4(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.gf4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gf4 r5 = (defpackage.gf4) r5
            boolean r1 = r4.a
            boolean r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L21
            return r2
        L21:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L28
            return r2
        L28:
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 == r5) goto L2f
            return r2
        L2f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.d
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r3 = r3.e
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NetworkState(isConnected="
            r0.<init>(r1)
            boolean r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", isValidated="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", isMetered="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", isNotRoaming="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", isBlocked="
            r0.append(r1)
            boolean r2 = r2.e
            r1 = 41
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
