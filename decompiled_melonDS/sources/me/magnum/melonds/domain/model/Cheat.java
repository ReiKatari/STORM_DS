package me.magnum.melonds.domain.model;

import nc.k;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class Cheat {
    public static final int $stable = 0;
    private final long cheatDatabaseId;
    private final String code;
    private final String description;
    private final boolean enabled;

    /* renamed from: id  reason: collision with root package name */
    private final Long f9476id;
    private final String name;

    public Cheat(Long l10, long j2, String str, String str2, String str3, boolean z10) {
        str.getClass();
        str3.getClass();
        this.f9476id = l10;
        this.cheatDatabaseId = j2;
        this.name = str;
        this.description = str2;
        this.code = str3;
        this.enabled = z10;
    }

    public static /* synthetic */ Cheat copy$default(Cheat cheat, Long l10, long j2, String str, String str2, String str3, boolean z10, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l10 = cheat.f9476id;
        }
        if ((i2 & 2) != 0) {
            j2 = cheat.cheatDatabaseId;
        }
        if ((i2 & 4) != 0) {
            str = cheat.name;
        }
        if ((i2 & 8) != 0) {
            str2 = cheat.description;
        }
        if ((i2 & 16) != 0) {
            str3 = cheat.code;
        }
        if ((i2 & 32) != 0) {
            z10 = cheat.enabled;
        }
        return cheat.copy(l10, j2, str, str2, str3, z10);
    }

    public final Long component1() {
        return this.f9476id;
    }

    public final long component2() {
        return this.cheatDatabaseId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.code;
    }

    public final boolean component6() {
        return this.enabled;
    }

    public final Cheat copy(Long l10, long j2, String str, String str2, String str3, boolean z10) {
        str.getClass();
        str3.getClass();
        return new Cheat(l10, j2, str, str2, str3, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cheat)) {
            return false;
        }
        Cheat cheat = (Cheat) obj;
        if (k.a(this.f9476id, cheat.f9476id) && this.cheatDatabaseId == cheat.cheatDatabaseId && k.a(this.name, cheat.name) && k.a(this.description, cheat.description) && k.a(this.code, cheat.code) && this.enabled == cheat.enabled) {
            return true;
        }
        return false;
    }

    public final long getCheatDatabaseId() {
        return this.cheatDatabaseId;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Long getId() {
        return this.f9476id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode;
        Long l10 = this.f9476id;
        int i2 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int d4 = d.d(d.f(this.cheatDatabaseId, hashCode * 31, 31), 31, this.name);
        String str = this.description;
        if (str != null) {
            i2 = str.hashCode();
        }
        return Boolean.hashCode(this.enabled) + d.d((d4 + i2) * 31, 31, this.code);
    }

    public String toString() {
        Long l10 = this.f9476id;
        long j2 = this.cheatDatabaseId;
        String str = this.name;
        String str2 = this.description;
        String str3 = this.code;
        boolean z10 = this.enabled;
        StringBuilder sb2 = new StringBuilder("Cheat(id=");
        sb2.append(l10);
        sb2.append(", cheatDatabaseId=");
        sb2.append(j2);
        d.B(sb2, ", name=", str, ", description=", str2);
        sb2.append(", code=");
        sb2.append(str3);
        sb2.append(", enabled=");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}
