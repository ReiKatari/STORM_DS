package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fv1  reason: default package */
/* loaded from: classes.dex */
public final class fv1 {
    public final String a;
    public final String b;
    public final long c;
    public final jb4 d;
    public final lb4 e;
    public final String f;
    public final long g;
    public long h;

    public fv1(String str, String str2, long j, jb4 jb4Var, lb4 lb4Var, String str3, long j2) {
        str.getClass();
        str2.getClass();
        jb4Var.getClass();
        lb4Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = jb4Var;
        this.e = lb4Var;
        this.f = str3;
        this.g = j2;
        this.h = 0L;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fv1) {
                fv1 fv1Var = (fv1) obj;
                if (!b53.x(this.a, fv1Var.a) || !b53.x(this.b, fv1Var.b) || this.c != fv1Var.c || this.d != fv1Var.d || this.e != fv1Var.e || !this.f.equals(fv1Var.f) || this.g != fv1Var.g || this.h != fv1Var.h) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = b31.c(this.c, ej6.b(this.a.hashCode() * 31, 31, this.b), 31);
        return Long.hashCode(this.h) + b31.c(this.g, ej6.b((this.e.hashCode() + ((this.d.hashCode() + c) * 31)) * 31, 31, this.f), 31);
    }

    public final String toString() {
        long j = this.h;
        StringBuilder v = b31.v("OfflineRetroAchievementsSession(userId=", this.a, ", contentId=", this.b, ", gameId=");
        v.append(this.c);
        v.append(", unlockMode=");
        v.append(this.d);
        v.append(", offlineType=");
        v.append(this.e);
        v.append(", sessionId=");
        v.append(this.f);
        ej6.k(v, ", startedAtEpochMs=", this.g, ", nextOrderIndex=");
        return wh1.n(v, j, ")");
    }
}
