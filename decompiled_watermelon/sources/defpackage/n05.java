package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n05  reason: default package */
/* loaded from: classes.dex */
public final class n05 extends s05 {
    public final long a;
    public final kl3 b;
    public final String c;
    public final URL d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;

    public n05(long j, kl3 kl3Var, String str, URL url, String str2, String str3, long j2, long j3) {
        str.getClass();
        this.a = j;
        this.b = kl3Var;
        this.c = str;
        this.d = url;
        this.e = str2;
        this.f = str3;
        this.g = j2;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n05) {
                n05 n05Var = (n05) obj;
                if (this.a != n05Var.a || !b53.x(this.b, n05Var.b) || !b53.x(this.c, n05Var.c) || !b53.x(this.d, n05Var.d) || !this.e.equals(n05Var.e) || !b53.x(this.f, n05Var.f) || this.g != n05Var.g || this.h != n05Var.h) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Long.hashCode(this.a) * 31;
        int i = 0;
        kl3 kl3Var = this.b;
        if (kl3Var == null) {
            hashCode = 0;
        } else {
            hashCode = kl3Var.hashCode();
        }
        int b = ej6.b((hashCode3 + hashCode) * 31, 31, this.c);
        URL url = this.d;
        if (url == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = url.hashCode();
        }
        int b2 = ej6.b((b + hashCode2) * 31, 31, this.e);
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return Long.hashCode(this.h) + b31.c(this.g, (b2 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardEntrySubmitted(leaderboardId=");
        sb.append(this.a);
        sb.append(", attemptKey=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", gameIcon=");
        sb.append(this.d);
        b31.B(sb, ", submittedScore=", this.e, ", bestScore=", this.f);
        ej6.k(sb, ", rank=", this.g, ", numberOfEntries=");
        return wh1.n(sb, this.h, ")");
    }
}
