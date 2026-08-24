package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp2  reason: default package */
/* loaded from: classes.dex */
public final class cp2 {
    public final java.lang.Long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.util.List e;

    public cp2(java.lang.Long r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.List r5) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof defpackage.cp2
            if (r0 != 0) goto L8
            goto L40
        L8:
            cp2 r3 = (defpackage.cp2) r3
            java.lang.Long r0 = r2.a
            java.lang.Long r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.lang.String r0 = r2.d
            java.lang.String r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            java.util.List r2 = r2.e
            java.util.List r3 = r3.e
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Long r0 = r3.a
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
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.util.List r3 = r3.e
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Game(id="
            r0.<init>(r1)
            java.lang.Long r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", gameCode="
            r0.append(r1)
            java.lang.String r1 = ", gameChecksum="
            java.lang.String r2 = ", cheats="
            java.lang.String r3 = r5.c
            java.lang.String r4 = r5.d
            defpackage.i61.B(r0, r3, r1, r4, r2)
            java.util.List r5 = r5.e
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
