package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xl3  reason: default package */
/* loaded from: classes.dex */
public final class xl3 {
    public final long a;
    public final long b;

    public xl3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl3)) {
            return false;
        }
        xl3 xl3Var = (xl3) obj;
        if (this.a == xl3Var.a && this.b == xl3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wh1.n(wh1.q(this.a, "AttemptKey(leaderboardId=", ", attemptId="), this.b, ")");
    }
}
