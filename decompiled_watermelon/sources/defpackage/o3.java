package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o3  reason: default package */
/* loaded from: classes.dex */
public final class o3 extends t3 {
    public final long a;
    public final kl3 b;
    public final String c;
    public final URL d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final os i;
    public final long j;

    public o3(long j, kl3 kl3Var, String str, URL url, String str2, String str3, long j2, long j3, os osVar, long j4) {
        str.getClass();
        this.a = j;
        this.b = kl3Var;
        this.c = str;
        this.d = url;
        this.e = str2;
        this.f = str3;
        this.g = j2;
        this.h = j3;
        this.i = osVar;
        this.j = j4;
    }

    @Override // defpackage.t3
    public final os a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o3) {
                o3 o3Var = (o3) obj;
                if (this.a == o3Var.a && b53.x(this.b, o3Var.b) && b53.x(this.c, o3Var.c) && b53.x(this.d, o3Var.d) && this.e.equals(o3Var.e) && b53.x(this.f, o3Var.f) && this.g == o3Var.g && this.h == o3Var.h && this.i == o3Var.i && this.j == o3Var.j) {
                    return true;
                }
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
        return Long.hashCode(this.j) + ((this.i.hashCode() + b31.c(this.h, b31.c(this.g, (b2 + i) * 31, 31), 31)) * 31);
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
        sb.append(this.h);
        sb.append(", state=");
        sb.append(this.i);
        return wh1.p(sb, ", uiInstanceId=", this.j, ")");
    }
}
