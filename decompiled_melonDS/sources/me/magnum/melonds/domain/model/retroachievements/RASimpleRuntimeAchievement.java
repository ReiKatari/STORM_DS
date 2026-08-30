package me.magnum.melonds.domain.model.retroachievements;

import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RASimpleRuntimeAchievement {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final long f9479id;
    private final int target;
    private final int value;

    public RASimpleRuntimeAchievement(long j2, int i2, int i10) {
        this.f9479id = j2;
        this.value = i2;
        this.target = i10;
    }

    public static /* synthetic */ RASimpleRuntimeAchievement copy$default(RASimpleRuntimeAchievement rASimpleRuntimeAchievement, long j2, int i2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j2 = rASimpleRuntimeAchievement.f9479id;
        }
        if ((i11 & 2) != 0) {
            i2 = rASimpleRuntimeAchievement.value;
        }
        if ((i11 & 4) != 0) {
            i10 = rASimpleRuntimeAchievement.target;
        }
        return rASimpleRuntimeAchievement.copy(j2, i2, i10);
    }

    public final long component1() {
        return this.f9479id;
    }

    public final int component2() {
        return this.value;
    }

    public final int component3() {
        return this.target;
    }

    public final RASimpleRuntimeAchievement copy(long j2, int i2, int i10) {
        return new RASimpleRuntimeAchievement(j2, i2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RASimpleRuntimeAchievement)) {
            return false;
        }
        RASimpleRuntimeAchievement rASimpleRuntimeAchievement = (RASimpleRuntimeAchievement) obj;
        if (this.f9479id == rASimpleRuntimeAchievement.f9479id && this.value == rASimpleRuntimeAchievement.value && this.target == rASimpleRuntimeAchievement.target) {
            return true;
        }
        return false;
    }

    public final long getId() {
        return this.f9479id;
    }

    public final int getTarget() {
        return this.target;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.target) + d.c(this.value, Long.hashCode(this.f9479id) * 31, 31);
    }

    public String toString() {
        long j2 = this.f9479id;
        int i2 = this.value;
        int i10 = this.target;
        return "RASimpleRuntimeAchievement(id=" + j2 + ", value=" + i2 + ", target=" + i10 + ")";
    }
}
