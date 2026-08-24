package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ab5  reason: default package */
/* loaded from: classes.dex */
public final class ab5 {
    public final long a;
    public final long b;
    public final boolean c;
    public final long d;

    public ab5(long r1, long r3, boolean r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r6
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.ab5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ab5 r8 = (defpackage.ab5) r8
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
            boolean r1 = r7.c
            boolean r3 = r8.c
            if (r1 == r3) goto L25
            return r2
        L25:
            long r3 = r7.d
            long r7 = r8.d
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L2e
            return r2
        L2e:
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
            boolean r2 = r4.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            long r1 = r4.d
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "RAPendingAchievementSubmissionEntity(achievementId="
            java.lang.String r1 = ", gameId="
            long r2 = r5.a
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", forHardcoreMode="
            r0.append(r1)
            boolean r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", createdAtEpochMs="
            java.lang.String r2 = ")"
            long r3 = r5.d
            java.lang.String r5 = defpackage.lb1.r(r0, r1, r3, r2)
            return r5
    }
}
