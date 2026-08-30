package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y05  reason: default package */
/* loaded from: classes.dex */
public final class y05 {
    public final long a;
    public final l23 b;
    public final l23 c;
    public final l23 d;

    public y05(long j, l23 l23Var, l23 l23Var2, l23 l23Var3) {
        this.a = j;
        this.b = l23Var;
        this.c = l23Var2;
        this.d = l23Var3;
    }

    public static y05 a(y05 y05Var, l23 l23Var, l23 l23Var2, l23 l23Var3, int i) {
        long j = y05Var.a;
        if ((i & 2) != 0) {
            l23Var = y05Var.b;
        }
        l23 l23Var4 = l23Var;
        if ((i & 4) != 0) {
            l23Var2 = y05Var.c;
        }
        l23 l23Var5 = l23Var2;
        if ((i & 8) != 0) {
            l23Var3 = y05Var.d;
        }
        y05Var.getClass();
        return new y05(j, l23Var4, l23Var5, l23Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y05)) {
            return false;
        }
        y05 y05Var = (y05) obj;
        if (this.a == y05Var.a && b53.x(this.b, y05Var.b) && b53.x(this.c, y05Var.c) && b53.x(this.d, y05Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Long.hashCode(this.a) * 31;
        int i = 0;
        l23 l23Var = this.b;
        if (l23Var == null) {
            hashCode = 0;
        } else {
            hashCode = l23Var.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        l23 l23Var2 = this.c;
        if (l23Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l23Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        l23 l23Var3 = this.d;
        if (l23Var3 != null) {
            i = l23Var3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "RAGameSetMetadata(gameId=" + this.a + ", lastAchievementSetUpdated=" + this.b + ", lastSoftcoreUserDataUpdated=" + this.c + ", lastHardcoreUserDataUpdated=" + this.d + ")";
    }
}
