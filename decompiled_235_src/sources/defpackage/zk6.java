package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zk6  reason: default package */
/* loaded from: classes.dex */
public final class zk6 {
    public final long a;
    public final yk6 b;
    public final String c;

    public zk6(long j, yk6 yk6Var, String str) {
        yk6Var.getClass();
        this.a = j;
        this.b = yk6Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk6)) {
            return false;
        }
        zk6 zk6Var = (zk6) obj;
        if (this.a == zk6Var.a && this.b == zk6Var.b && nb3.k(this.c, zk6Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "SmartSyncSkippedAchievement(achievementId=" + this.a + ", reason=" + this.b + ", reasonDetail=" + this.c + ")";
    }
}
