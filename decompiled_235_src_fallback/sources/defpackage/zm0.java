package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zm0  reason: default package */
/* loaded from: classes.dex */
public final class zm0 {
    public final java.lang.Long a;
    public final long b;
    public final long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final boolean g;

    public zm0(java.lang.Long r1, long r2, long r4, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9) {
            r0 = this;
            r6.getClass()
            r8.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r6
            r0.e = r7
            r0.f = r8
            r0.g = r9
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.zm0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zm0 r8 = (defpackage.zm0) r8
            java.lang.Long r1 = r7.a
            java.lang.Long r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            long r3 = r7.c
            long r5 = r8.c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.String r1 = r7.f
            java.lang.String r3 = r8.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            boolean r7 = r7.g
            boolean r8 = r8.g
            if (r7 == r8) goto L51
            return r2
        L51:
            return r0
    }

    public final int hashCode() {
            r5 = this;
            r0 = 0
            java.lang.Long r1 = r5.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            long r3 = r5.b
            int r1 = defpackage.i61.c(r3, r1, r2)
            long r3 = r5.c
            int r1 = defpackage.i61.c(r3, r1, r2)
            java.lang.String r3 = r5.d
            int r1 = defpackage.xg6.d(r1, r2, r3)
            java.lang.String r3 = r5.e
            if (r3 != 0) goto L25
            goto L29
        L25:
            int r0 = r3.hashCode()
        L29:
            int r1 = r1 + r0
            int r1 = r1 * r2
            java.lang.String r0 = r5.f
            int r0 = defpackage.xg6.d(r1, r2, r0)
            boolean r5 = r5.g
            int r5 = java.lang.Boolean.hashCode(r5)
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CheatEntity(id="
            r0.<init>(r1)
            java.lang.Long r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", cheatFolderId="
            r0.append(r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", cheatDatabaseId="
            java.lang.String r2 = ", name="
            long r3 = r5.c
            defpackage.xg6.B(r0, r1, r3, r2)
            java.lang.String r1 = ", description="
            java.lang.String r2 = ", code="
            java.lang.String r3 = r5.d
            java.lang.String r4 = r5.e
            defpackage.i61.B(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            r0.append(r1)
            boolean r5 = r5.g
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
