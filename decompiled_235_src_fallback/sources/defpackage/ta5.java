package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ta5  reason: default package */
/* loaded from: classes.dex */
public final class ta5 {
    public final long a;
    public final long b;
    public final long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final boolean i;

    public ta5(long r1, long r3, long r5, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10, java.lang.String r11, boolean r12) {
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

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L3
            goto L61
        L3:
            boolean r0 = r7 instanceof defpackage.ta5
            r1 = 0
            if (r0 != 0) goto L9
            goto L60
        L9:
            ta5 r7 = (defpackage.ta5) r7
            long r2 = r6.a
            long r4 = r7.a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L14
            goto L60
        L14:
            long r2 = r6.b
            long r4 = r7.b
            boolean r0 = defpackage.ga5.a(r2, r4)
            if (r0 != 0) goto L1f
            goto L60
        L1f:
            long r2 = r6.c
            long r4 = r7.c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L63
            java.lang.String r0 = r6.d
            java.lang.String r2 = r7.d
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L32
            goto L60
        L32:
            java.lang.String r0 = r6.e
            java.lang.String r2 = r7.e
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L3d
            goto L60
        L3d:
            boolean r0 = r6.f
            boolean r2 = r7.f
            if (r0 == r2) goto L44
            goto L60
        L44:
            java.lang.String r0 = r6.g
            java.lang.String r2 = r7.g
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L4f
            goto L60
        L4f:
            java.lang.String r0 = r6.h
            java.lang.String r2 = r7.h
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L5a
            goto L60
        L5a:
            boolean r6 = r6.i
            boolean r7 = r7.i
            if (r6 == r7) goto L61
        L60:
            return r1
        L61:
            r6 = 1
            return r6
        L63:
            return r1
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
            long r0 = r5.b
            java.lang.String r0 = defpackage.ga5.b(r0)
            long r1 = r5.c
            java.lang.String r1 = defpackage.mp2.a0(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "RALeaderboard(id="
            r2.<init>(r3)
            long r3 = r5.a
            r2.append(r3)
            java.lang.String r3 = ", gameId="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", setId="
            java.lang.String r3 = ", mem="
            java.lang.String r4 = r5.d
            defpackage.i61.B(r2, r0, r1, r3, r4)
            java.lang.String r0 = ", format="
            r2.append(r0)
            java.lang.String r0 = r5.e
            r2.append(r0)
            java.lang.String r0 = ", lowerIsBetter="
            r2.append(r0)
            boolean r0 = r5.f
            r2.append(r0)
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", description="
            java.lang.String r3 = r5.g
            java.lang.String r4 = r5.h
            defpackage.i61.B(r2, r0, r3, r1, r4)
            java.lang.String r0 = ", hidden="
            r2.append(r0)
            boolean r5 = r5.i
            r2.append(r5)
            java.lang.String r5 = ")"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            return r5
    }
}
