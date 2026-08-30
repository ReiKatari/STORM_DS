package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uk0  reason: default package */
/* loaded from: classes.dex */
public final class uk0 {
    public final Long a;
    public final long b;
    public final String c;

    public uk0(Long l, long j, String str) {
        str.getClass();
        this.a = l;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk0)) {
            return false;
        }
        uk0 uk0Var = (uk0) obj;
        if (b53.x(this.a, uk0Var.a) && this.b == uk0Var.b && b53.x(this.c, uk0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l = this.a;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return this.c.hashCode() + b31.c(this.b, hashCode * 31, 31);
    }

    public final String toString() {
        return "CheatFolderEntity(id=" + this.a + ", gameId=" + this.b + ", name=" + this.c + ")";
    }
}
