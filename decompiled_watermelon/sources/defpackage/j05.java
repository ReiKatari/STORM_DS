package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j05  reason: default package */
/* loaded from: classes.dex */
public final class j05 extends s05 {
    public final long a;
    public final kl3 b;

    public j05(long j, kl3 kl3Var) {
        this.a = j;
        this.b = kl3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j05)) {
            return false;
        }
        j05 j05Var = (j05) obj;
        if (this.a == j05Var.a && b53.x(this.b, j05Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.a) * 31;
        kl3 kl3Var = this.b;
        if (kl3Var == null) {
            hashCode = 0;
        } else {
            hashCode = kl3Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "LeaderboardAttemptCancelled(leaderboardId=" + this.a + ", attemptKey=" + this.b + ")";
    }
}
