package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RASimpleAchievement {
    public static final int $stable = 0;
    private final long id;
    private final String memoryAddress;

    public RASimpleAchievement(long j, String str) {
        str.getClass();
        this.id = j;
        this.memoryAddress = str;
    }

    public static /* synthetic */ RASimpleAchievement copy$default(RASimpleAchievement rASimpleAchievement, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = rASimpleAchievement.id;
        }
        if ((i & 2) != 0) {
            str = rASimpleAchievement.memoryAddress;
        }
        return rASimpleAchievement.copy(j, str);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.memoryAddress;
    }

    public final RASimpleAchievement copy(long j, String str) {
        str.getClass();
        return new RASimpleAchievement(j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RASimpleAchievement)) {
            return false;
        }
        RASimpleAchievement rASimpleAchievement = (RASimpleAchievement) obj;
        if (this.id == rASimpleAchievement.id && nb3.k(this.memoryAddress, rASimpleAchievement.memoryAddress)) {
            return true;
        }
        return false;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMemoryAddress() {
        return this.memoryAddress;
    }

    public int hashCode() {
        return this.memoryAddress.hashCode() + (Long.hashCode(this.id) * 31);
    }

    public String toString() {
        long j = this.id;
        String str = this.memoryAddress;
        return "RASimpleAchievement(id=" + j + ", memoryAddress=" + str + ")";
    }
}
