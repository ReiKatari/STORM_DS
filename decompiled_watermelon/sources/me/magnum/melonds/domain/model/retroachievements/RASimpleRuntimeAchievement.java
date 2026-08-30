package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RASimpleRuntimeAchievement {
    public static final int $stable = 0;
    private final long id;
    private final int target;
    private final int value;

    public RASimpleRuntimeAchievement(long j, int i, int i2) {
        this.id = j;
        this.value = i;
        this.target = i2;
    }

    public static /* synthetic */ RASimpleRuntimeAchievement copy$default(RASimpleRuntimeAchievement rASimpleRuntimeAchievement, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = rASimpleRuntimeAchievement.id;
        }
        if ((i3 & 2) != 0) {
            i = rASimpleRuntimeAchievement.value;
        }
        if ((i3 & 4) != 0) {
            i2 = rASimpleRuntimeAchievement.target;
        }
        return rASimpleRuntimeAchievement.copy(j, i, i2);
    }

    public final long component1() {
        return this.id;
    }

    public final int component2() {
        return this.value;
    }

    public final int component3() {
        return this.target;
    }

    public final RASimpleRuntimeAchievement copy(long j, int i, int i2) {
        return new RASimpleRuntimeAchievement(j, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RASimpleRuntimeAchievement)) {
            return false;
        }
        RASimpleRuntimeAchievement rASimpleRuntimeAchievement = (RASimpleRuntimeAchievement) obj;
        if (this.id == rASimpleRuntimeAchievement.id && this.value == rASimpleRuntimeAchievement.value && this.target == rASimpleRuntimeAchievement.target) {
            return true;
        }
        return false;
    }

    public final long getId() {
        return this.id;
    }

    public final int getTarget() {
        return this.target;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.target) + wh1.a(this.value, Long.hashCode(this.id) * 31, 31);
    }

    public String toString() {
        long j = this.id;
        int i = this.value;
        int i2 = this.target;
        return "RASimpleRuntimeAchievement(id=" + j + ", value=" + i + ", target=" + i2 + ")";
    }
}
