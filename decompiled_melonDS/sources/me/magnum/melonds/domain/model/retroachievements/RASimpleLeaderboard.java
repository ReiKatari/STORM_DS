package me.magnum.melonds.domain.model.retroachievements;

import nc.k;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RASimpleLeaderboard {
    public static final int $stable = 0;
    private final String format;

    /* renamed from: id  reason: collision with root package name */
    private final long f9478id;
    private final String memoryAddress;

    public RASimpleLeaderboard(long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f9478id = j2;
        this.memoryAddress = str;
        this.format = str2;
    }

    public static /* synthetic */ RASimpleLeaderboard copy$default(RASimpleLeaderboard rASimpleLeaderboard, long j2, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = rASimpleLeaderboard.f9478id;
        }
        if ((i2 & 2) != 0) {
            str = rASimpleLeaderboard.memoryAddress;
        }
        if ((i2 & 4) != 0) {
            str2 = rASimpleLeaderboard.format;
        }
        return rASimpleLeaderboard.copy(j2, str, str2);
    }

    public final long component1() {
        return this.f9478id;
    }

    public final String component2() {
        return this.memoryAddress;
    }

    public final String component3() {
        return this.format;
    }

    public final RASimpleLeaderboard copy(long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        return new RASimpleLeaderboard(j2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RASimpleLeaderboard)) {
            return false;
        }
        RASimpleLeaderboard rASimpleLeaderboard = (RASimpleLeaderboard) obj;
        if (this.f9478id == rASimpleLeaderboard.f9478id && k.a(this.memoryAddress, rASimpleLeaderboard.memoryAddress) && k.a(this.format, rASimpleLeaderboard.format)) {
            return true;
        }
        return false;
    }

    public final String getFormat() {
        return this.format;
    }

    public final long getId() {
        return this.f9478id;
    }

    public final String getMemoryAddress() {
        return this.memoryAddress;
    }

    public int hashCode() {
        return this.format.hashCode() + d.d(Long.hashCode(this.f9478id) * 31, 31, this.memoryAddress);
    }

    public String toString() {
        long j2 = this.f9478id;
        String str = this.memoryAddress;
        String str2 = this.format;
        return "RASimpleLeaderboard(id=" + j2 + ", memoryAddress=" + str + ", format=" + str2 + ")";
    }
}
