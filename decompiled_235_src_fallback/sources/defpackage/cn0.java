package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn0  reason: default package */
/* loaded from: classes.dex */
public final class cn0 {
    public final java.lang.Long a;
    public final long b;
    public final java.lang.String c;

    public cn0(java.lang.Long r1, long r2, java.lang.String r4) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.cn0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cn0 r8 = (defpackage.cn0) r8
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
            java.lang.String r7 = r7.c
            java.lang.String r8 = r8.c
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L2b
            return r2
        L2b:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.Long r0 = r4.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r4 = r4.c
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CheatFolderEntity(id="
            r0.<init>(r1)
            java.lang.Long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", gameId="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r3 = r3.c
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
