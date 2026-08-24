package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p3  reason: default package */
/* loaded from: classes.dex */
public final class p3 extends v3 {
    public final ls3 a;
    public final ta5 b;
    public final URL c;
    public final String d;
    public final n3 e;
    public final bt f;
    public final long g;

    public p3(ls3 ls3Var, ta5 ta5Var, URL url, String str, n3 n3Var, bt btVar, long j) {
        ls3Var.getClass();
        ta5Var.getClass();
        n3Var.getClass();
        this.a = ls3Var;
        this.b = ta5Var;
        this.c = url;
        this.d = str;
        this.e = n3Var;
        this.f = btVar;
        this.g = j;
    }

    @Override // defpackage.v3
    public final bt a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p3) {
                p3 p3Var = (p3) obj;
                if (nb3.k(this.a, p3Var.a) && nb3.k(this.b, p3Var.b) && this.c.equals(p3Var.c) && this.d.equals(p3Var.d) && this.e == p3Var.e && this.f == p3Var.f && this.g == p3Var.g) {
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
        int hashCode2 = this.f.hashCode();
        return Long.hashCode(this.g) + ((hashCode2 + ((this.e.hashCode() + d) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardAttemptResult(key=");
        sb.append(this.a);
        sb.append(", leaderboard=");
        sb.append(this.b);
        sb.append(", gameIcon=");
        sb.append(this.c);
        sb.append(", currentValue=");
        sb.append(this.d);
        sb.append(", result=");
        sb.append(this.e);
        sb.append(", state=");
        sb.append(this.f);
        sb.append(", uiInstanceId=");
        return lb1.p(sb, this.g, ")");
    }
}
