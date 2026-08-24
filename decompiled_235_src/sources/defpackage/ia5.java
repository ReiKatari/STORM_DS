package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ia5  reason: default package */
/* loaded from: classes.dex */
public final class ia5 {
    public final long a;
    public final s83 b;
    public final s83 c;
    public final s83 d;

    public ia5(long j, s83 s83Var, s83 s83Var2, s83 s83Var3) {
        this.a = j;
        this.b = s83Var;
        this.c = s83Var2;
        this.d = s83Var3;
    }

    public static ia5 a(ia5 ia5Var, s83 s83Var, s83 s83Var2, s83 s83Var3, int i) {
        long j = ia5Var.a;
        if ((i & 2) != 0) {
            s83Var = ia5Var.b;
        }
        s83 s83Var4 = s83Var;
        if ((i & 4) != 0) {
            s83Var2 = ia5Var.c;
        }
        s83 s83Var5 = s83Var2;
        if ((i & 8) != 0) {
            s83Var3 = ia5Var.d;
        }
        ia5Var.getClass();
        return new ia5(j, s83Var4, s83Var5, s83Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia5)) {
            return false;
        }
        ia5 ia5Var = (ia5) obj;
        if (this.a == ia5Var.a && nb3.k(this.b, ia5Var.b) && nb3.k(this.c, ia5Var.c) && nb3.k(this.d, ia5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Long.hashCode(this.a) * 31;
        int i = 0;
        s83 s83Var = this.b;
        if (s83Var == null) {
            hashCode = 0;
        } else {
            hashCode = s83Var.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        s83 s83Var2 = this.c;
        if (s83Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = s83Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        s83 s83Var3 = this.d;
        if (s83Var3 != null) {
            i = s83Var3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "RAGameSetMetadata(gameId=" + this.a + ", lastAchievementSetUpdated=" + this.b + ", lastSoftcoreUserDataUpdated=" + this.c + ", lastHardcoreUserDataUpdated=" + this.d + ")";
    }
}
