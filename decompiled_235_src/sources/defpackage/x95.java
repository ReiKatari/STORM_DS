package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x95  reason: default package */
/* loaded from: classes.dex */
public final class x95 extends ca5 {
    public final long a;
    public final ls3 b;
    public final String c;
    public final URL d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;

    public x95(long j, ls3 ls3Var, String str, URL url, String str2, String str3, long j2, long j3) {
        str.getClass();
        this.a = j;
        this.b = ls3Var;
        this.c = str;
        this.d = url;
        this.e = str2;
        this.f = str3;
        this.g = j2;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x95) {
                x95 x95Var = (x95) obj;
                if (this.a != x95Var.a || !nb3.k(this.b, x95Var.b) || !nb3.k(this.c, x95Var.c) || !nb3.k(this.d, x95Var.d) || !this.e.equals(x95Var.e) || !nb3.k(this.f, x95Var.f) || this.g != x95Var.g || this.h != x95Var.h) {
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
        ls3 ls3Var = this.b;
        if (ls3Var == null) {
            hashCode = 0;
        } else {
            hashCode = ls3Var.hashCode();
        }
        int d = xg6.d((hashCode3 + hashCode) * 31, 31, this.c);
        URL url = this.d;
        if (url == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = url.hashCode();
        }
        int d2 = xg6.d((d + hashCode2) * 31, 31, this.e);
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return Long.hashCode(this.h) + i61.c(this.g, (d2 + i) * 31, 31);
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
        i61.B(sb, ", submittedScore=", this.e, ", bestScore=", this.f);
        xg6.B(sb, ", rank=", this.g, ", numberOfEntries=");
        return lb1.p(sb, this.h, ")");
    }
}
