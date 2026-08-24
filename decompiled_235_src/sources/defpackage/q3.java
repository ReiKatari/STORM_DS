package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q3  reason: default package */
/* loaded from: classes.dex */
public final class q3 extends v3 {
    public final long a;
    public final ls3 b;
    public final String c;
    public final URL d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final bt i;
    public final long j;

    public q3(long j, ls3 ls3Var, String str, URL url, String str2, String str3, long j2, long j3, bt btVar, long j4) {
        str.getClass();
        this.a = j;
        this.b = ls3Var;
        this.c = str;
        this.d = url;
        this.e = str2;
        this.f = str3;
        this.g = j2;
        this.h = j3;
        this.i = btVar;
        this.j = j4;
    }

    @Override // defpackage.v3
    public final bt a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q3) {
                q3 q3Var = (q3) obj;
                if (this.a == q3Var.a && nb3.k(this.b, q3Var.b) && nb3.k(this.c, q3Var.c) && nb3.k(this.d, q3Var.d) && this.e.equals(q3Var.e) && nb3.k(this.f, q3Var.f) && this.g == q3Var.g && this.h == q3Var.h && this.i == q3Var.i && this.j == q3Var.j) {
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
        return Long.hashCode(this.j) + ((this.i.hashCode() + i61.c(this.h, i61.c(this.g, (d2 + i) * 31, 31), 31)) * 31);
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
        sb.append(this.h);
        sb.append(", state=");
        sb.append(this.i);
        return lb1.r(sb, ", uiInstanceId=", this.j, ")");
    }
}
