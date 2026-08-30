package me.magnum.melonds.domain.model.retroachievements;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RASimpleAchievement {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final long f9477id;
    private final String memoryAddress;

    public RASimpleAchievement(long j2, String str) {
        str.getClass();
        this.f9477id = j2;
        this.memoryAddress = str;
    }

    public static /* synthetic */ RASimpleAchievement copy$default(RASimpleAchievement rASimpleAchievement, long j2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = rASimpleAchievement.f9477id;
        }
        if ((i2 & 2) != 0) {
            str = rASimpleAchievement.memoryAddress;
        }
        return rASimpleAchievement.copy(j2, str);
    }

    public final long component1() {
        return this.f9477id;
    }

    public final String component2() {
        return this.memoryAddress;
    }

    public final RASimpleAchievement copy(long j2, String str) {
        str.getClass();
        return new RASimpleAchievement(j2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RASimpleAchievement)) {
            return false;
        }
        RASimpleAchievement rASimpleAchievement = (RASimpleAchievement) obj;
        if (this.f9477id == rASimpleAchievement.f9477id && k.a(this.memoryAddress, rASimpleAchievement.memoryAddress)) {
            return true;
        }
        return false;
    }

    public final long getId() {
        return this.f9477id;
    }

    public final String getMemoryAddress() {
        return this.memoryAddress;
    }

    public int hashCode() {
        return this.memoryAddress.hashCode() + (Long.hashCode(this.f9477id) * 31);
    }

    public String toString() {
        long j2 = this.f9477id;
        String str = this.memoryAddress;
        return "RASimpleAchievement(id=" + j2 + ", memoryAddress=" + str + ")";
    }
}
