package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: za5  reason: default package */
/* loaded from: classes.dex */
public final class za5 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final long e;
    public final URL f;

    public za5(String str, int i, int i2, String str2, long j, URL url) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = j;
        this.f = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za5)) {
            return false;
        }
        za5 za5Var = (za5) obj;
        if (nb3.k(this.a, za5Var.a) && this.b == za5Var.b && this.c == za5Var.c && nb3.k(this.d, za5Var.d) && this.e == za5Var.e && nb3.k(this.f, za5Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = i61.c(this.e, xg6.d(lb1.a(this.c, lb1.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
        URL url = this.f;
        if (url == null) {
            hashCode = 0;
        } else {
            hashCode = url.hashCode();
        }
        return c + hashCode;
    }

    public final String toString() {
        return "RALeaderboardRankingEntry(user=" + this.a + ", rank=" + this.b + ", rawScore=" + this.c + ", formattedScore=" + this.d + ", submittedAtEpochSeconds=" + this.e + ", avatarUrl=" + this.f + ")";
    }
}
