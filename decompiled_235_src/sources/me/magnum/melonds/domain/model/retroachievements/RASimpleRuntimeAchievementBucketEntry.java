package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RASimpleRuntimeAchievementBucketEntry {
    public static final int $stable = 0;
    private final long achievementId;
    private final int bucketType;
    private final long subsetId;

    public RASimpleRuntimeAchievementBucketEntry(long j, long j2, int i) {
        this.achievementId = j;
        this.subsetId = j2;
        this.bucketType = i;
    }

    public static /* synthetic */ RASimpleRuntimeAchievementBucketEntry copy$default(RASimpleRuntimeAchievementBucketEntry rASimpleRuntimeAchievementBucketEntry, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = rASimpleRuntimeAchievementBucketEntry.achievementId;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = rASimpleRuntimeAchievementBucketEntry.subsetId;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = rASimpleRuntimeAchievementBucketEntry.bucketType;
        }
        return rASimpleRuntimeAchievementBucketEntry.copy(j3, j4, i);
    }

    public final long component1() {
        return this.achievementId;
    }

    public final long component2() {
        return this.subsetId;
    }

    public final int component3() {
        return this.bucketType;
    }

    public final RASimpleRuntimeAchievementBucketEntry copy(long j, long j2, int i) {
        return new RASimpleRuntimeAchievementBucketEntry(j, j2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RASimpleRuntimeAchievementBucketEntry)) {
            return false;
        }
        RASimpleRuntimeAchievementBucketEntry rASimpleRuntimeAchievementBucketEntry = (RASimpleRuntimeAchievementBucketEntry) obj;
        if (this.achievementId == rASimpleRuntimeAchievementBucketEntry.achievementId && this.subsetId == rASimpleRuntimeAchievementBucketEntry.subsetId && this.bucketType == rASimpleRuntimeAchievementBucketEntry.bucketType) {
            return true;
        }
        return false;
    }

    public final long getAchievementId() {
        return this.achievementId;
    }

    public final int getBucketType() {
        return this.bucketType;
    }

    public final long getSubsetId() {
        return this.subsetId;
    }

    public int hashCode() {
        return Integer.hashCode(this.bucketType) + i61.c(this.subsetId, Long.hashCode(this.achievementId) * 31, 31);
    }

    public String toString() {
        long j = this.achievementId;
        long j2 = this.subsetId;
        int i = this.bucketType;
        StringBuilder s = xg6.s(j, "RASimpleRuntimeAchievementBucketEntry(achievementId=", ", subsetId=");
        s.append(j2);
        s.append(", bucketType=");
        s.append(i);
        s.append(")");
        return s.toString();
    }
}
