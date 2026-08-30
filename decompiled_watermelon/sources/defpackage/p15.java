package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p15  reason: default package */
/* loaded from: classes.dex */
public final class p15 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final long e;
    public final URL f;

    public p15(String str, int i, int i2, String str2, long j, URL url) {
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
        if (!(obj instanceof p15)) {
            return false;
        }
        p15 p15Var = (p15) obj;
        if (b53.x(this.a, p15Var.a) && this.b == p15Var.b && this.c == p15Var.c && b53.x(this.d, p15Var.d) && this.e == p15Var.e && b53.x(this.f, p15Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = b31.c(this.e, ej6.b(wh1.a(this.c, wh1.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
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
