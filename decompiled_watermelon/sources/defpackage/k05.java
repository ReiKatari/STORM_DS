package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k05  reason: default package */
/* loaded from: classes.dex */
public final class k05 extends s05 {
    public final kl3 a;
    public final j15 b;
    public final URL c;

    public k05(kl3 kl3Var, j15 j15Var, URL url) {
        kl3Var.getClass();
        j15Var.getClass();
        this.a = kl3Var;
        this.b = j15Var;
        this.c = url;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k05) {
                k05 k05Var = (k05) obj;
                if (!b53.x(this.a, k05Var.a) || !b53.x(this.b, k05Var.b) || !this.c.equals(k05Var.c)) {
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
