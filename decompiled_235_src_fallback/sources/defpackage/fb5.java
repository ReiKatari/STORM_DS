package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb5  reason: default package */
/* loaded from: classes.dex */
public final class fb5 {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public fb5(long r1, long r3, boolean r5, boolean r6) {
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
            boolean r1 = r8 instanceof defpackage.fb5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb5 r8 = (defpackage.fb5) r8
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
            boolean r7 = r7.d
            boolean r8 = r8.d
            if (r7 == r8) goto L2c
            return r2
        L2c:
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
            boolean r4 = r4.d
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "RAUserAchievementEntity(gameId="
            java.lang.String r1 = ", achievementId="
            long r2 = r4.a
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            long r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", isUnlocked="
            r0.append(r1)
            boolean r1 = r4.c
            r0.append(r1)
            java.lang.String r1 = ", isHardcore="
            r0.append(r1)
            boolean r4 = r4.d
            r0.append(r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
