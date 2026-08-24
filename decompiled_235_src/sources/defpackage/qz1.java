package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz1  reason: default package */
/* loaded from: classes.dex */
public final class qz1 {
    public final String a;
    public final String b;
    public final long c;
    public final gk4 d;
    public final ik4 e;
    public final String f;
    public final long g;
    public long h;

    public qz1(String str, String str2, long j, gk4 gk4Var, ik4 ik4Var, String str3, long j2) {
        str.getClass();
        str2.getClass();
        gk4Var.getClass();
        ik4Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = gk4Var;
        this.e = ik4Var;
        this.f = str3;
        this.g = j2;
        this.h = 0L;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qz1) {
                qz1 qz1Var = (qz1) obj;
                if (!nb3.k(this.a, qz1Var.a) || !nb3.k(this.b, qz1Var.b) || this.c != qz1Var.c || this.d != qz1Var.d || this.e != qz1Var.e || !this.f.equals(qz1Var.f) || this.g != qz1Var.g || this.h != qz1Var.h) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = i61.c(this.c, xg6.d(this.a.hashCode() * 31, 31, this.b), 31);
        return Long.hashCode(this.h) + i61.c(this.g, xg6.d((this.e.hashCode() + ((this.d.hashCode() + c) * 31)) * 31, 31, this.f), 31);
    }

    public final String toString() {
        long j = this.h;
        StringBuilder u = i61.u("OfflineRetroAchievementsSession(userId=", this.a, ", contentId=", this.b, ", gameId=");
        u.append(this.c);
        u.append(", unlockMode=");
        u.append(this.d);
        u.append(", offlineType=");
        u.append(this.e);
        u.append(", sessionId=");
        u.append(this.f);
        xg6.B(u, ", startedAtEpochMs=", this.g, ", nextOrderIndex=");
        return lb1.p(u, j, ")");
    }
}
