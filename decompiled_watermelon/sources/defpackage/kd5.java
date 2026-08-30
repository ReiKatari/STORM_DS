package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kd5  reason: default package */
/* loaded from: classes.dex */
public final class kd5 {
    public final qd5 a;
    public final qd5 b;
    public final jd5 c;
    public final String d;
    public final String e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public kd5(qd5 qd5Var, qd5 qd5Var2, jd5 jd5Var, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        qd5Var.getClass();
        qd5Var2.getClass();
        jd5Var.getClass();
        this.a = qd5Var;
        this.b = qd5Var2;
        this.c = jd5Var;
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
        if (!(obj instanceof kd5)) {
            return false;
        }
        kd5 kd5Var = (kd5) obj;
        if (this.a == kd5Var.a && this.b == kd5Var.b && this.c == kd5Var.c && b53.x(this.d, kd5Var.d) && b53.x(this.e, kd5Var.e) && this.f == kd5Var.f && this.g == kd5Var.g && this.h == kd5Var.h && this.i == kd5Var.i) {
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
        return Boolean.hashCode(this.i) + ej6.c(ej6.c(b31.c(this.f, (i2 + i) * 31, 31), this.g, 31), this.h, 31);
    }

    public final String toString() {
        return "RetroAchievementsEndpointSnapshot(backendSelected=" + this.a + ", backendEffective=" + this.b + ", hostSource=" + this.c + ", apiUrl=" + this.d + ", nativeClientHost=" + this.e + ", generation=" + this.f + ", externalActivationActive=" + this.g + ", builtInLedgerEnabled=" + this.h + ", builtInSyncEnabled=" + this.i + ")";
    }
}
