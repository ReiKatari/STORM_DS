package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hb4  reason: default package */
/* loaded from: classes.dex */
public final class hb4 {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final boolean f;
    public final String g;
    public final long h;
    public final long i;
    public final long j;
    public final jb4 k;
    public final lb4 l;
    public final boolean m;

    public hb4(long j, String str, String str2, long j2, long j3, boolean z, String str3, long j4, long j5, long j6, jb4 jb4Var, lb4 lb4Var, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        jb4Var.getClass();
        lb4Var.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.g = str3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = jb4Var;
        this.l = lb4Var;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb4)) {
            return false;
        }
        hb4 hb4Var = (hb4) obj;
        if (this.a == hb4Var.a && b53.x(this.b, hb4Var.b) && b53.x(this.c, hb4Var.c) && this.d == hb4Var.d && this.e == hb4Var.e && this.f == hb4Var.f && b53.x(this.g, hb4Var.g) && this.h == hb4Var.h && this.i == hb4Var.i && this.j == hb4Var.j && this.k == hb4Var.k && this.l == hb4Var.l && this.m == hb4Var.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c = b31.c(this.j, b31.c(this.i, b31.c(this.h, ej6.b(ej6.c(b31.c(this.e, b31.c(this.d, ej6.b(ej6.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), this.f, 31), 31, this.g), 31), 31), 31);
        int hashCode = this.l.hashCode();
        return Boolean.hashCode(this.m) + ((hashCode + ((this.k.hashCode() + c) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineUnlockEvent(seq=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", contentId=");
        sb.append(this.c);
        sb.append(", gameId=");
        sb.append(this.d);
        ej6.k(sb, ", achievementId=", this.e, ", isHardcore=");
        sb.append(this.f);
        sb.append(", sessionId=");
        sb.append(this.g);
        sb.append(", localTimestampEpochMs=");
        sb.append(this.h);
        ej6.k(sb, ", offsetFromSessionStartMs=", this.i, ", orderIndex=");
        sb.append(this.j);
        sb.append(", unlockMode=");
        sb.append(this.k);
        sb.append(", offlineType=");
        sb.append(this.l);
        sb.append(", pendingSync=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
