package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r3  reason: default package */
/* loaded from: classes.dex */
public final class r3 extends v3 {
    public final ls3 a;
    public final String b;
    public final URL c;
    public final String d;
    public final bt e;
    public final long f;

    public r3(ls3 ls3Var, String str, URL url, String str2, bt btVar, long j) {
        ls3Var.getClass();
        this.a = ls3Var;
        this.b = str;
        this.c = url;
        this.d = str2;
        this.e = btVar;
        this.f = j;
    }

    @Override // defpackage.v3
    public final bt a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r3) {
                r3 r3Var = (r3) obj;
                if (nb3.k(this.a, r3Var.a) && this.b.equals(r3Var.b) && nb3.k(this.c, r3Var.c) && this.d.equals(r3Var.d) && this.e == r3Var.e && this.f == r3Var.f) {
                    return true;
                }
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
        int d2 = xg6.d((d + hashCode) * 31, 31, this.d);
        return Long.hashCode(this.f) + ((this.e.hashCode() + d2) * 31);
    }

    public final String toString() {
        return "LeaderboardSubmissionPending(key=" + this.a + ", title=" + this.b + ", gameIcon=" + this.c + ", trackerDisplay=" + this.d + ", state=" + this.e + ", uiInstanceId=" + this.f + ")";
    }
}
