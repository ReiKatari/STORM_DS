package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya5  reason: default package */
/* loaded from: classes.dex */
public final class ya5 {
    public final long a;
    public final int b;
    public final java.util.ArrayList c;

    public ya5(long r1, int r3, java.util.ArrayList r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L26
        L3:
            boolean r0 = r5 instanceof defpackage.ya5
            if (r0 != 0) goto L8
            goto L24
        L8:
            ya5 r5 = (defpackage.ya5) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L24
        L13:
            int r0 = r4.b
            int r1 = r5.b
            if (r0 == r1) goto L1a
            goto L24
        L1a:
            java.util.ArrayList r4 = r4.c
            java.util.ArrayList r5 = r5.c
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L26
        L24:
            r4 = 0
            return r4
        L26:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.util.ArrayList r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RALeaderboardRanking(leaderboardId="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", totalEntries="
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", entries="
            r0.append(r1)
            java.util.ArrayList r3 = r3.c
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
