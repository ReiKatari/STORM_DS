package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ee5  reason: default package */
/* loaded from: classes.dex */
public final class ee5 {
    public final int a;
    public final int b;

    public ee5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee5)) {
            return false;
        }
        ee5 ee5Var = (ee5) obj;
        if (this.a == ee5Var.a && this.b == ee5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PendingSubmissionsSummary(pendingAchievements=" + this.a + ", pendingLeaderboardSubmissions=" + this.b + ")";
    }
}
