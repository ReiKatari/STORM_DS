package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da5  reason: default package */
/* loaded from: classes.dex */
public final class da5 {
    public final long a;
    public final java.lang.String b;
    public final java.net.URL c;
    public final java.lang.String d;
    public final java.util.List e;

    public da5(long r1, java.lang.String r3, java.net.URL r4, java.lang.String r5, java.util.List r6) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L42
        L3:
            boolean r0 = r5 instanceof defpackage.da5
            if (r0 != 0) goto L8
            goto L40
        L8:
            da5 r5 = (defpackage.da5) r5
            long r0 = r4.a
            long r2 = r5.a
            boolean r0 = defpackage.ga5.a(r0, r2)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.lang.String r0 = r4.b
            java.lang.String r1 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.net.URL r0 = r4.c
            java.net.URL r1 = r5.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.lang.String r0 = r4.d
            java.lang.String r1 = r5.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            java.util.List r4 = r4.e
            java.util.List r5 = r5.e
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L42
        L40:
            r4 = 0
            return r4
        L42:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.net.URL r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.d
            if (r0 != 0) goto L1d
            r0 = 0
            goto L21
        L1d:
            int r0 = r0.hashCode()
        L21:
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r3 = r3.e
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            long r0 = r5.a
            java.lang.String r0 = defpackage.ga5.b(r0)
            java.lang.String r1 = ", title="
            java.lang.String r2 = ", icon="
            java.lang.String r3 = "RAGame(id="
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r3, r0, r1, r4, r2)
            java.net.URL r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", richPresencePatch="
            r0.append(r1)
            java.lang.String r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", sets="
            r0.append(r1)
            java.util.List r5 = r5.e
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
