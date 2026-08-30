package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zd5  reason: default package */
/* loaded from: classes.dex */
public final class zd5 extends ae5 {
    public final j15 a;
    public final int b;
    public final String c;
    public final x15 d;
    public final boolean e;

    public zd5(j15 j15Var, int i, String str, x15 x15Var, boolean z) {
        this.a = j15Var;
        this.b = i;
        this.c = str;
        this.d = x15Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zd5) {
                zd5 zd5Var = (zd5) obj;
                if (!this.a.equals(zd5Var.a) || this.b != zd5Var.b || !this.c.equals(zd5Var.c) || !this.d.equals(zd5Var.d) || this.e != zd5Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b = ej6.b(wh1.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + b) * 31);
    }

    public final String toString() {
        return "LeaderboardEntrySubmission(leaderboard=" + this.a + ", value=" + this.b + ", formattedValue=" + this.c + ", authentication=" + this.d + ", firstTry=" + this.e + ")";
    }
}
