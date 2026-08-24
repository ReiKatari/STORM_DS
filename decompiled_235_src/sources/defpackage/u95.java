package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u95  reason: default package */
/* loaded from: classes.dex */
public final class u95 extends ca5 {
    public final ls3 a;
    public final ta5 b;
    public final URL c;

    public u95(ls3 ls3Var, ta5 ta5Var, URL url) {
        ls3Var.getClass();
        ta5Var.getClass();
        this.a = ls3Var;
        this.b = ta5Var;
        this.c = url;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u95) {
                u95 u95Var = (u95) obj;
                if (!nb3.k(this.a, u95Var.a) || !nb3.k(this.b, u95Var.b) || !this.c.equals(u95Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LeaderboardAttemptStarted(key=" + this.a + ", leaderboard=" + this.b + ", gameIcon=" + this.c + ")";
    }
}
