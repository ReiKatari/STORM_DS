package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c95  reason: default package */
/* loaded from: classes.dex */
public final class c95 extends defpackage.l95 {
    public final long a;
    public final long b;
    public final long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final long f;
    public final long g;

    public c95(long r1, long r3, long r5, java.lang.String r7, java.lang.String r8, long r9, long r11) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.g = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L4e
        L3:
            boolean r0 = r5 instanceof defpackage.c95
            if (r0 != 0) goto L8
            goto L4c
        L8:
            c95 r5 = (defpackage.c95) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L4c
        L13:
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            goto L4c
        L1c:
            long r0 = r4.c
            long r2 = r5.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L25
            goto L4c
        L25:
            java.lang.String r0 = r4.d
            java.lang.String r1 = r5.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L4c
        L30:
            java.lang.String r0 = r4.e
            java.lang.String r1 = r5.e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L4c
        L3b:
            long r0 = r4.f
            long r2 = r5.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L44
            goto L4c
        L44:
            long r0 = r4.g
            long r4 = r5.g
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L4e
        L4c:
            r4 = 0
            return r4
        L4e:
            r4 = 1
            return r4
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
            long r2 = r4.f
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r1 = r4.g
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "OnLeaderboardScoreboard(leaderboardId="
            java.lang.String r1 = ", attemptId="
            long r2 = r5.a
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", eventSequence="
            java.lang.String r2 = ", submittedScore="
            long r3 = r5.c
            defpackage.xg6.B(r0, r1, r3, r2)
            java.lang.String r1 = ", bestScore="
            java.lang.String r2 = ", newRank="
            java.lang.String r3 = r5.d
            java.lang.String r4 = r5.e
            defpackage.i61.B(r0, r3, r1, r4, r2)
            long r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", numEntries="
            java.lang.String r2 = ")"
            long r3 = r5.g
            java.lang.String r5 = defpackage.lb1.r(r0, r1, r3, r2)
            return r5
    }
}
