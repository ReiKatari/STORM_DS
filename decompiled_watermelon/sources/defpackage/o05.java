package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o05  reason: default package */
/* loaded from: classes.dex */
public final class o05 extends s05 {
    public final kl3 a;
    public final String b;
    public final URL c;
    public final String d;

    public o05(kl3 kl3Var, String str, URL url, String str2) {
        kl3Var.getClass();
        this.a = kl3Var;
        this.b = str;
        this.c = url;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o05) {
                o05 o05Var = (o05) obj;
                if (!b53.x(this.a, o05Var.a) || !this.b.equals(o05Var.b) || !b53.x(this.c, o05Var.c) || !this.d.equals(o05Var.d)) {
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
        int b = ej6.b(this.a.hashCode() * 31, 31, this.b);
        URL url = this.c;
        if (url == null) {
            hashCode = 0;
        } else {
            hashCode = url.hashCode();
        }
        return this.d.hashCode() + ((b + hashCode) * 31);
    }

    public final String toString() {
        return "LeaderboardSubmissionPending(key=" + this.a + ", title=" + this.b + ", gameIcon=" + this.c + ", trackerDisplay=" + this.d + ")";
    }
}
