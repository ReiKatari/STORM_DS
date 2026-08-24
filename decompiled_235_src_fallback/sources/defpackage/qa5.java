package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qa5  reason: default package */
/* loaded from: classes.dex */
public final class qa5 extends defpackage.ra5 {
    public final java.net.URL a;
    public final java.lang.String b;
    public final boolean c;

    public qa5(java.net.URL r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.ra5
    public final java.net.URL a() {
            r0 = this;
            java.net.URL r0 = r0.a
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.qa5
            if (r0 != 0) goto L8
            goto L26
        L8:
            qa5 r3 = (defpackage.qa5) r3
            java.net.URL r0 = r2.a
            java.net.URL r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            boolean r2 = r2.c
            boolean r3 = r3.c
            if (r2 == r3) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.net.URL r0 = r3.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r3 = r3.c
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Welcome(icon="
            r0.<init>(r1)
            java.net.URL r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", username="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", hardcore="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.c
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}
