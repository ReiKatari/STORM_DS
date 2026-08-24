package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: en5  reason: default package */
/* loaded from: classes.dex */
public final class en5 {
    public final ln5 a;
    public final ln5 b;
    public final dn5 c;
    public final String d;
    public final String e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public en5(ln5 ln5Var, ln5 ln5Var2, dn5 dn5Var, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        ln5Var.getClass();
        ln5Var2.getClass();
        dn5Var.getClass();
        this.a = ln5Var;
        this.b = ln5Var2;
        this.c = dn5Var;
        this.d = str;
        this.e = str2;
        this.f = j;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en5)) {
            return false;
        }
        en5 en5Var = (en5) obj;
        if (this.a == en5Var.a && this.b == en5Var.b && this.c == en5Var.c && nb3.k(this.d, en5Var.d) && nb3.k(this.e, en5Var.e) && this.f == en5Var.f && this.g == en5Var.g && this.h == en5Var.h && this.i == en5Var.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = 0;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Boolean.hashCode(this.i) + xg6.e(xg6.e(i61.c(this.f, (i2 + i) * 31, 31), this.g, 31), this.h, 31);
    }

    public final String toString() {
        return "RetroAchievementsEndpointSnapshot(backendSelected=" + this.a + ", backendEffective=" + this.b + ", hostSource=" + this.c + ", apiUrl=" + this.d + ", nativeClientHost=" + this.e + ", generation=" + this.f + ", externalActivationActive=" + this.g + ", builtInLedgerEnabled=" + this.h + ", builtInSyncEnabled=" + this.i + ")";
    }
}
