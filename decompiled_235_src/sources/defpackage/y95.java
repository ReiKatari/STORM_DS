package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y95  reason: default package */
/* loaded from: classes.dex */
public final class y95 extends ca5 {
    public final ls3 a;
    public final String b;
    public final URL c;
    public final String d;

    public y95(ls3 ls3Var, String str, URL url, String str2) {
        ls3Var.getClass();
        this.a = ls3Var;
        this.b = str;
        this.c = url;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y95) {
                y95 y95Var = (y95) obj;
                if (!nb3.k(this.a, y95Var.a) || !this.b.equals(y95Var.b) || !nb3.k(this.c, y95Var.c) || !this.d.equals(y95Var.d)) {
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
        int d = xg6.d(this.a.hashCode() * 31, 31, this.b);
        URL url = this.c;
        if (url == null) {
            hashCode = 0;
        } else {
            hashCode = url.hashCode();
        }
        return this.d.hashCode() + ((d + hashCode) * 31);
    }

    public final String toString() {
        return "LeaderboardSubmissionPending(key=" + this.a + ", title=" + this.b + ", gameIcon=" + this.c + ", trackerDisplay=" + this.d + ")";
    }
}
