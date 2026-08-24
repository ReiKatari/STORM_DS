package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: za5  reason: default package */
/* loaded from: classes.dex */
public final class za5 {
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final long e;
    public final java.net.URL f;

    public za5(java.lang.String r1, int r2, int r3, java.lang.String r4, long r5, java.net.URL r7) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r7
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.za5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            za5 r8 = (defpackage.za5) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r7.b
            int r3 = r8.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r7.c
            int r3 = r8.c
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            long r3 = r7.e
            long r5 = r8.e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L39
            return r2
        L39:
            java.net.URL r7 = r7.f
            java.net.URL r8 = r8.f
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L44
            return r2
        L44:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r4.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.lang.String r2 = r4.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.e
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.net.URL r4 = r4.f
            if (r4 != 0) goto L27
            r4 = 0
            goto L2b
        L27:
            int r4 = r4.hashCode()
        L2b:
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RALeaderboardRankingEntry(user="
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", rank="
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", rawScore="
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", formattedScore="
            r0.append(r1)
            java.lang.String r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", submittedAtEpochSeconds="
            r0.append(r1)
            long r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", avatarUrl="
            r0.append(r1)
            java.net.URL r3 = r3.f
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
