package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RASimpleLeaderboard {
    public static final int $stable = 0;
    private final String format;
    private final long id;
    private final String memoryAddress;

    public RASimpleLeaderboard(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.id = j;
        this.memoryAddress = str;
        this.format = str2;
    }

    public static /* synthetic */ RASimpleLeaderboard copy$default(RASimpleLeaderboard rASimpleLeaderboard, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = rASimpleLeaderboard.id;
        }
        if ((i & 2) != 0) {
            str = rASimpleLeaderboard.memoryAddress;
        }
        if ((i & 4) != 0) {
            str2 = rASimpleLeaderboard.format;
        }
        return rASimpleLeaderboard.copy(j, str, str2);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.memoryAddress;
    }

    public final String component3() {
        return this.format;
    }

    public final RASimpleLeaderboard copy(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        return new RASimpleLeaderboard(j, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RASimpleLeaderboard)) {
            return false;
        }
        RASimpleLeaderboard rASimpleLeaderboard = (RASimpleLeaderboard) obj;
        if (this.id == rASimpleLeaderboard.id && b53.x(this.memoryAddress, rASimpleLeaderboard.memoryAddress) && b53.x(this.format, rASimpleLeaderboard.format)) {
            return true;
        }
        return false;
    }

    public final String getFormat() {
        return this.format;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMemoryAddress() {
        return this.memoryAddress;
    }

    public int hashCode() {
        return this.format.hashCode() + ej6.b(Long.hashCode(this.id) * 31, 31, this.memoryAddress);
    }

    public String toString() {
        long j = this.id;
        String str = this.memoryAddress;
        String str2 = this.format;
        return "RASimpleLeaderboard(id=" + j + ", memoryAddress=" + str + ", format=" + str2 + ")";
    }
}
