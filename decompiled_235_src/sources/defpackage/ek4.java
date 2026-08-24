package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek4  reason: default package */
/* loaded from: classes.dex */
public final class ek4 {
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
    public final gk4 k;
    public final ik4 l;
    public final boolean m;

    public ek4(long j, String str, String str2, long j2, long j3, boolean z, String str3, long j4, long j5, long j6, gk4 gk4Var, ik4 ik4Var, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        gk4Var.getClass();
        ik4Var.getClass();
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
        this.k = gk4Var;
        this.l = ik4Var;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek4)) {
            return false;
        }
        ek4 ek4Var = (ek4) obj;
        if (this.a == ek4Var.a && nb3.k(this.b, ek4Var.b) && nb3.k(this.c, ek4Var.c) && this.d == ek4Var.d && this.e == ek4Var.e && this.f == ek4Var.f && nb3.k(this.g, ek4Var.g) && this.h == ek4Var.h && this.i == ek4Var.i && this.j == ek4Var.j && this.k == ek4Var.k && this.l == ek4Var.l && this.m == ek4Var.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c = i61.c(this.j, i61.c(this.i, i61.c(this.h, xg6.d(xg6.e(i61.c(this.e, i61.c(this.d, xg6.d(xg6.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), this.f, 31), 31, this.g), 31), 31), 31);
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
        xg6.B(sb, ", achievementId=", this.e, ", isHardcore=");
        sb.append(this.f);
        sb.append(", sessionId=");
        sb.append(this.g);
        sb.append(", localTimestampEpochMs=");
        sb.append(this.h);
        xg6.B(sb, ", offsetFromSessionStartMs=", this.i, ", orderIndex=");
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
