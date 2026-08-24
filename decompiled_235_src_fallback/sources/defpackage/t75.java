package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t75  reason: default package */
/* loaded from: classes.dex */
public final class t75 {
    public final long a;
    public final long b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;

    public t75(long r1, long r3, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r6.getClass()
            r7.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r6
            r0.e = r7
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.t75
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t75 r8 = (defpackage.t75) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r7 = r7.e
            java.lang.String r8 = r8.e
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L3f
            return r2
        L3f:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r2 = r4.c
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r4 = r4.e
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "RAAchievementSetEntity(id="
            java.lang.String r1 = ", gameId="
            long r2 = r4.a
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            long r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r4.c
            r0.append(r1)
            java.lang.String r1 = ", type="
            java.lang.String r2 = ", iconUrl="
            java.lang.String r3 = r4.d
            java.lang.String r4 = r4.e
            defpackage.i61.B(r0, r1, r3, r2, r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
