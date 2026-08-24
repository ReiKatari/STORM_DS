package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z85  reason: default package */
/* loaded from: classes.dex */
public final class z85 extends defpackage.l95 {
    public final long a;
    public final long b;
    public final long c;
    public final java.lang.String d;

    public z85(long r1, long r3, long r5, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L31
        L3:
            boolean r0 = r5 instanceof defpackage.z85
            if (r0 != 0) goto L8
            goto L2f
        L8:
            z85 r5 = (defpackage.z85) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L2f
        L13:
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            goto L2f
        L1c:
            long r0 = r4.c
            long r2 = r5.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L25
            goto L2f
        L25:
            java.lang.String r4 = r4.d
            java.lang.String r5 = r5.d
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L31
        L2f:
            r4 = 0
            return r4
        L31:
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
            java.lang.String r4 = r4.d
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "OnLeaderboardAttemptSubmitted(leaderboardId="
            java.lang.String r1 = ", attemptId="
            long r2 = r5.a
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", eventSequence="
            java.lang.String r2 = ", trackerDisplay="
            long r3 = r5.c
            defpackage.xg6.B(r0, r1, r3, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.d
            java.lang.String r5 = defpackage.i61.n(r0, r5, r1)
            return r5
    }
}
