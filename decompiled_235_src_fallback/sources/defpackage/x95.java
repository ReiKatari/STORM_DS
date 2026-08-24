package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x95  reason: default package */
/* loaded from: classes.dex */
public final class x95 extends defpackage.ca5 {
    public final long a;
    public final defpackage.ls3 b;
    public final java.lang.String c;
    public final java.net.URL d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final long g;
    public final long h;

    public x95(long r1, defpackage.ls3 r3, java.lang.String r4, java.net.URL r5, java.lang.String r6, java.lang.String r7, long r8, long r10) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            r0.h = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L5d
        L3:
            boolean r0 = r5 instanceof defpackage.x95
            if (r0 != 0) goto L8
            goto L5b
        L8:
            x95 r5 = (defpackage.x95) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L5b
        L13:
            ls3 r0 = r4.b
            ls3 r1 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L1e
            goto L5b
        L1e:
            java.lang.String r0 = r4.c
            java.lang.String r1 = r5.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L29
            goto L5b
        L29:
            java.net.URL r0 = r4.d
            java.net.URL r1 = r5.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L34
            goto L5b
        L34:
            java.lang.String r0 = r4.e
            java.lang.String r1 = r5.e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L5b
        L3f:
            java.lang.String r0 = r4.f
            java.lang.String r1 = r5.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L4a
            goto L5b
        L4a:
            long r0 = r4.g
            long r2 = r5.g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L53
            goto L5b
        L53:
            long r0 = r4.h
            long r4 = r5.h
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L5d
        L5b:
            r4 = 0
            return r4
        L5d:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            ls3 r3 = r4.b
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r3)
            java.net.URL r3 = r4.d
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.e
            int r0 = defpackage.xg6.d(r0, r1, r3)
            java.lang.String r3 = r4.f
            if (r3 != 0) goto L33
            goto L37
        L33:
            int r2 = r3.hashCode()
        L37:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r4.g
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r1 = r4.h
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LeaderboardEntrySubmitted(leaderboardId="
            r0.<init>(r1)
            long r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", attemptKey="
            r0.append(r1)
            ls3 r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", gameIcon="
            r0.append(r1)
            java.net.URL r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", submittedScore="
            java.lang.String r2 = ", bestScore="
            java.lang.String r3 = r5.e
            java.lang.String r4 = r5.f
            defpackage.i61.B(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", rank="
            java.lang.String r2 = ", numberOfEntries="
            long r3 = r5.g
            defpackage.xg6.B(r0, r1, r3, r2)
            java.lang.String r1 = ")"
            long r2 = r5.h
            java.lang.String r5 = defpackage.lb1.p(r0, r2, r1)
            return r5
    }
}
