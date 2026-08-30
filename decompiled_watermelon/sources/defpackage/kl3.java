package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kl3  reason: default package */
/* loaded from: classes.dex */
public final class kl3 {
    public final long a;
    public final long b;

    public kl3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl3)) {
            return false;
        }
        kl3 kl3Var = (kl3) obj;
        if (this.a == kl3Var.a && this.b == kl3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wh1.n(wh1.q(this.a, "LeaderboardAttemptKey(leaderboardId=", ", attemptId="), this.b, ")");
    }
}
