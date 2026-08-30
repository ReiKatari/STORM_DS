package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m3  reason: default package */
/* loaded from: classes.dex */
public final class m3 extends t3 {
    public final kl3 a;
    public final j15 b;
    public final URL c;
    public final String d;
    public final os e;
    public final long f;

    public m3(kl3 kl3Var, j15 j15Var, URL url, String str, os osVar, long j) {
        kl3Var.getClass();
        j15Var.getClass();
        this.a = kl3Var;
        this.b = j15Var;
        this.c = url;
        this.d = str;
        this.e = osVar;
        this.f = j;
    }

    @Override // defpackage.t3
    public final os a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m3) {
                m3 m3Var = (m3) obj;
                if (b53.x(this.a, m3Var.a) && b53.x(this.b, m3Var.b) && this.c.equals(m3Var.c) && this.d.equals(m3Var.d) && this.e == m3Var.e && this.f == m3Var.f) {
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
        return Long.hashCode(this.f) + ((this.e.hashCode() + b) * 31);
    }

    public final String toString() {
        return "LeaderboardAttempt(key=" + this.a + ", leaderboard=" + this.b + ", gameIcon=" + this.c + ", currentValue=" + this.d + ", state=" + this.e + ", uiInstanceId=" + this.f + ")";
    }
}
