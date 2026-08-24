package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: va5  reason: default package */
/* loaded from: classes.dex */
public final class va5 {
    public final long a;
    public final long b;
    public final long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final boolean i;

    public va5(long r1, long r3, long r5, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r0 = this;
            r7.getClass()
            r8.getClass()
            r10.getClass()
            r11.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.g = r10
            r0.h = r11
            r0.i = r12
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.va5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            va5 r8 = (defpackage.va5) r8
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
            long r3 = r7.c
            long r5 = r8.c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L27
            return r2
        L27:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L32
            return r2
        L32:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L3d
            return r2
        L3d:
            boolean r1 = r7.f
            boolean r3 = r8.f
            if (r1 == r3) goto L44
            return r2
        L44:
            java.lang.String r1 = r7.g
            java.lang.String r3 = r8.g
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4f
            return r2
        L4f:
            java.lang.String r1 = r7.h
            java.lang.String r3 = r8.h
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L5a
            return r2
        L5a:
            boolean r7 = r7.i
            boolean r8 = r8.i
            if (r7 == r8) goto L61
            return r2
        L61:
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
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r2 = r4.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.e
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r4.f
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r2 = r4.g
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.h
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r4 = r4.i
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "RALeaderboardEntity(id="
            java.lang.String r1 = ", gameId="
            long r2 = r5.a
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", setId="
            java.lang.String r2 = ", mem="
            long r3 = r5.c
            defpackage.xg6.B(r0, r1, r3, r2)
            java.lang.String r1 = ", format="
            java.lang.String r2 = ", lowerIsBetter="
            java.lang.String r3 = r5.d
            java.lang.String r4 = r5.e
            defpackage.i61.B(r0, r3, r1, r4, r2)
            boolean r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r5.g
            r0.append(r1)
            java.lang.String r1 = ", description="
            r0.append(r1)
            java.lang.String r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = ", hidden="
            r0.append(r1)
            boolean r5 = r5.i
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
