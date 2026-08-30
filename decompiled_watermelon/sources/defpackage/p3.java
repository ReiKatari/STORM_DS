package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p3  reason: default package */
/* loaded from: classes.dex */
public final class p3 extends t3 {
    public final kl3 a;
    public final String b;
    public final URL c;
    public final String d;
    public final os e;
    public final long f;

    public p3(kl3 kl3Var, String str, URL url, String str2, os osVar, long j) {
        kl3Var.getClass();
        this.a = kl3Var;
        this.b = str;
        this.c = url;
        this.d = str2;
        this.e = osVar;
        this.f = j;
    }

    @Override // defpackage.t3
    public final os a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p3) {
                p3 p3Var = (p3) obj;
                if (b53.x(this.a, p3Var.a) && this.b.equals(p3Var.b) && b53.x(this.c, p3Var.c) && this.d.equals(p3Var.d) && this.e == p3Var.e && this.f == p3Var.f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int b = ej6.b(this.a.hashCode() * 31, 31, this.b);
        URL url = this.c;
        if (url == null) {
            hashCode = 0;
        } else {
            hashCode = url.hashCode();
        }
        int b2 = ej6.b((b + hashCode) * 31, 31, this.d);
        return Long.hashCode(this.f) + ((this.e.hashCode() + b2) * 31);
    }

    public final String toString() {
        return "LeaderboardSubmissionPending(key=" + this.a + ", title=" + this.b + ", gameIcon=" + this.c + ", trackerDisplay=" + this.d + ", state=" + this.e + ", uiInstanceId=" + this.f + ")";
    }
}
