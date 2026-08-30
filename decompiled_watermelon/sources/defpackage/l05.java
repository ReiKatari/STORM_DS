package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l05  reason: default package */
/* loaded from: classes.dex */
public final class l05 extends s05 {
    public final kl3 a;
    public final String b;

    public l05(kl3 kl3Var, String str) {
        kl3Var.getClass();
        this.a = kl3Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l05) {
                l05 l05Var = (l05) obj;
                if (!b53.x(this.a, l05Var.a) || !this.b.equals(l05Var.b)) {
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
        return "LeaderboardAttemptUpdated(key=" + this.a + ", formattedValue=" + this.b + ")";
    }
}
