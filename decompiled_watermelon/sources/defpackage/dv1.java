package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dv1  reason: default package */
/* loaded from: classes.dex */
public final class dv1 {
    public final j15 a;
    public final URL b;

    public dv1(j15 j15Var, URL url) {
        j15Var.getClass();
        this.a = j15Var;
        this.b = url;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dv1) {
                dv1 dv1Var = (dv1) obj;
                if (!b53.x(this.a, dv1Var.a) || !this.b.equals(dv1Var.b)) {
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
