package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t3  reason: default package */
/* loaded from: classes.dex */
public final class t3 extends defpackage.nb3 {
    public final long x;

    public t3(long r1) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.t3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t3 r6 = (defpackage.t3) r6
            long r3 = r5.x
            long r5 = r6.x
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L15
            return r2
        L15:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.x
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "SubmitLeaderboard(leaderboardId="
            java.lang.String r1 = ")"
            long r2 = r4.x
            java.lang.String r4 = defpackage.lb1.i(r2, r0, r1)
            return r4
    }
}
