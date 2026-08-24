package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u75  reason: default package */
/* loaded from: classes.dex */
public final class u75 {
    public final long a;
    public final long b;
    public final String c;
    public final r75 d;
    public final URL e;

    public u75(long j, long j2, String str, r75 r75Var, URL url) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = r75Var;
        this.e = url;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u75) {
                u75 u75Var = (u75) obj;
                if (this.a != u75Var.a || !ga5.a(this.b, u75Var.b) || !nb3.k(this.c, u75Var.c) || this.d != u75Var.d || !this.e.equals(u75Var.e)) {
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
        int c = i61.c(this.b, Long.hashCode(this.a) * 31, 31);
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
        String b = ga5.b(this.b);
        return "RAAchievementSetSummary(setId=" + this.a + ", gameId=" + b + ", title=" + this.c + ", type=" + this.d + ", iconUrl=" + this.e + ")";
    }
}
