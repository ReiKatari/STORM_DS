package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oz1  reason: default package */
/* loaded from: classes.dex */
public final class oz1 {
    public final ta5 a;
    public final URL b;

    public oz1(ta5 ta5Var, URL url) {
        ta5Var.getClass();
        this.a = ta5Var;
        this.b = url;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oz1) {
                oz1 oz1Var = (oz1) obj;
                if (!nb3.k(this.a, oz1Var.a) || !this.b.equals(oz1Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LeaderboardUiContext(leaderboard=" + this.a + ", gameIcon=" + this.b + ")";
    }
}
