package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Cheat {
    public static final int $stable = 0;
    private final long cheatDatabaseId;
    private final String code;
    private final String description;
    private final boolean enabled;
    private final Long id;
    private final String name;

    public Cheat(Long l, long j, String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.id = l;
        this.cheatDatabaseId = j;
        this.name = str;
        this.description = str2;
        this.code = str3;
        this.enabled = z;
    }

    public static /* synthetic */ Cheat copy$default(Cheat cheat, Long l, long j, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            l = cheat.id;
        }
        if ((i & 2) != 0) {
            j = cheat.cheatDatabaseId;
        }
        if ((i & 4) != 0) {
            str = cheat.name;
        }
        if ((i & 8) != 0) {
            str2 = cheat.description;
        }
        if ((i & 16) != 0) {
            str3 = cheat.code;
        }
        if ((i & 32) != 0) {
            z = cheat.enabled;
        }
        return cheat.copy(l, j, str, str2, str3, z);
    }

    public final Long component1() {
        return this.id;
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

    public final Cheat copy(Long l, long j, String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        return new Cheat(l, j, str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cheat)) {
            return false;
        }
        Cheat cheat = (Cheat) obj;
        if (nb3.k(this.id, cheat.id) && this.cheatDatabaseId == cheat.cheatDatabaseId && nb3.k(this.name, cheat.name) && nb3.k(this.description, cheat.description) && nb3.k(this.code, cheat.code) && this.enabled == cheat.enabled) {
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
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode;
        Long l = this.id;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int d = xg6.d(i61.c(this.cheatDatabaseId, hashCode * 31, 31), 31, this.name);
        String str = this.description;
        if (str != null) {
            i = str.hashCode();
        }
        return Boolean.hashCode(this.enabled) + xg6.d((d + i) * 31, 31, this.code);
    }

    public String toString() {
        Long l = this.id;
        long j = this.cheatDatabaseId;
        String str = this.name;
        String str2 = this.description;
        String str3 = this.code;
        boolean z = this.enabled;
        StringBuilder sb = new StringBuilder("Cheat(id=");
        sb.append(l);
        sb.append(", cheatDatabaseId=");
        sb.append(j);
        i61.B(sb, ", name=", str, ", description=", str2);
        sb.append(", code=");
        sb.append(str3);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
