package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p05  reason: default package */
/* loaded from: classes.dex */
public final class p05 extends s05 {
    public final kl3 a;

    public p05(kl3 kl3Var) {
        this.a = kl3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof p05) || !this.a.equals(((p05) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LeaderboardTrackerHidden(key=" + this.a + ")";
    }
}
