package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RASimpleRuntimeAchievementBucketEntry {
    public static final int $stable = 0;
    private final long achievementId;
    private final int bucketType;
    private final long subsetId;

    public RASimpleRuntimeAchievementBucketEntry(long r1, long r3, int r5) {
            r0 = this;
            r0.<init>()
            r0.achievementId = r1
            r0.subsetId = r3
            r0.bucketType = r5
            return
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry copy$default(me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry r6, long r7, long r9, int r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L6
            long r7 = r6.achievementId
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Ld
            long r9 = r6.subsetId
        Ld:
            r3 = r9
            r7 = r12 & 4
            if (r7 == 0) goto L14
            int r11 = r6.bucketType
        L14:
            r0 = r6
            r5 = r11
            me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry r6 = r0.copy(r1, r3, r5)
            return r6
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.achievementId
            return r0
    }

    public final long component2() {
            r2 = this;
            long r0 = r2.subsetId
            return r0
    }

    public final int component3() {
            r0 = this;
            int r0 = r0.bucketType
            return r0
    }

    public final me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry copy(long r1, long r3, int r5) {
            r0 = this;
            me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry r0 = new me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry
            r0.<init>(r1, r3, r5)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry r8 = (me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry) r8
            long r3 = r7.achievementId
            long r5 = r8.achievementId
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.subsetId
            long r5 = r8.subsetId
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1e
            return r2
        L1e:
            int r7 = r7.bucketType
            int r8 = r8.bucketType
            if (r7 == r8) goto L25
            return r2
        L25:
            return r0
    }

    public final long getAchievementId() {
            r2 = this;
            long r0 = r2.achievementId
            return r0
    }

    public final int getBucketType() {
            r0 = this;
            int r0 = r0.bucketType
            return r0
    }

    public final long getSubsetId() {
            r2 = this;
            long r0 = r2.subsetId
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.achievementId
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.subsetId
            int r0 = defpackage.i61.c(r2, r0, r1)
            int r4 = r4.bucketType
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public java.lang.String toString() {
            r6 = this;
            long r0 = r6.achievementId
            long r2 = r6.subsetId
            int r6 = r6.bucketType
            java.lang.String r4 = "RASimpleRuntimeAchievementBucketEntry(achievementId="
            java.lang.String r5 = ", subsetId="
            java.lang.StringBuilder r0 = defpackage.xg6.s(r0, r4, r5)
            r0.append(r2)
            java.lang.String r1 = ", bucketType="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ")"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
