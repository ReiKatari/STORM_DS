package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o3  reason: default package */
/* loaded from: classes.dex */
public final class o3 extends v3 {
    public final ls3 a;
    public final ta5 b;
    public final URL c;
    public final String d;
    public final bt e;
    public final long f;

    public o3(ls3 ls3Var, ta5 ta5Var, URL url, String str, bt btVar, long j) {
        ls3Var.getClass();
        ta5Var.getClass();
        this.a = ls3Var;
        this.b = ta5Var;
        this.c = url;
        this.d = str;
        this.e = btVar;
        this.f = j;
    }

    @Override // defpackage.v3
    public final bt a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o3) {
                o3 o3Var = (o3) obj;
                if (nb3.k(this.a, o3Var.a) && nb3.k(this.b, o3Var.b) && this.c.equals(o3Var.c) && this.d.equals(o3Var.d) && this.e == o3Var.e && this.f == o3Var.f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int d = xg6.d((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        return Long.hashCode(this.f) + ((this.e.hashCode() + d) * 31);
    }

    public final String toString() {
        return "LeaderboardAttempt(key=" + this.a + ", leaderboard=" + this.b + ", gameIcon=" + this.c + ", currentValue=" + this.d + ", state=" + this.e + ", uiInstanceId=" + this.f + ")";
    }
}
