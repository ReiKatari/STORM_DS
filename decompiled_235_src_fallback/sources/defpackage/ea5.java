package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea5  reason: default package */
/* loaded from: classes.dex */
public final class ea5 {
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;

    public ea5(long r1, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.ea5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ea5 r8 = (defpackage.ea5) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.lang.String r7 = r7.d
            java.lang.String r8 = r8.d
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L36
            return r2
        L36:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            if (r2 != 0) goto Lf
            r2 = 0
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RAGameEntity(gameId="
            r0.<init>(r1)
            long r1 = r4.a
            r0.append(r1)
            java.lang.String r1 = ", richPresencePatch="
            r0.append(r1)
            java.lang.String r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", title="
            java.lang.String r2 = ", icon="
            java.lang.String r3 = r4.c
            java.lang.String r4 = r4.d
            defpackage.i61.B(r0, r1, r3, r2, r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
