package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jy4  reason: default package */
/* loaded from: classes.dex */
public final class jy4 {
    public final long a;
    public final long b;
    public final String c;
    public final gy4 d;
    public final URL e;

    public jy4(long j, long j2, String str, gy4 gy4Var, URL url) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = gy4Var;
        this.e = url;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jy4) {
                jy4 jy4Var = (jy4) obj;
                if (this.a != jy4Var.a || !w05.a(this.b, jy4Var.b) || !b53.x(this.c, jy4Var.c) || this.d != jy4Var.d || !this.e.equals(jy4Var.e)) {
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
        int c = b31.c(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.d.hashCode();
        return this.e.hashCode() + ((hashCode2 + ((c + hashCode) * 31)) * 31);
    }

    public final String toString() {
        String b = w05.b(this.b);
        return "RAAchievementSetSummary(setId=" + this.a + ", gameId=" + b + ", title=" + this.c + ", type=" + this.d + ", iconUrl=" + this.e + ")";
    }
}
