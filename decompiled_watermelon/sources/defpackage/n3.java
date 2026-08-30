package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n3  reason: default package */
/* loaded from: classes.dex */
public final class n3 extends t3 {
    public final kl3 a;
    public final j15 b;
    public final URL c;
    public final String d;
    public final l3 e;
    public final os f;
    public final long g;

    public n3(kl3 kl3Var, j15 j15Var, URL url, String str, l3 l3Var, os osVar, long j) {
        kl3Var.getClass();
        j15Var.getClass();
        l3Var.getClass();
        this.a = kl3Var;
        this.b = j15Var;
        this.c = url;
        this.d = str;
        this.e = l3Var;
        this.f = osVar;
        this.g = j;
    }

    @Override // defpackage.t3
    public final os a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n3) {
                n3 n3Var = (n3) obj;
                if (b53.x(this.a, n3Var.a) && b53.x(this.b, n3Var.b) && this.c.equals(n3Var.c) && this.d.equals(n3Var.d) && this.e == n3Var.e && this.f == n3Var.f && this.g == n3Var.g) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int b = ej6.b((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        int hashCode2 = this.f.hashCode();
        return Long.hashCode(this.g) + ((hashCode2 + ((this.e.hashCode() + b) * 31)) * 31);
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
        return wh1.n(sb, this.g, ")");
    }
}
