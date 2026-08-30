package bh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f2264a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2265b;

    public g(int i2, int i10) {
        this.f2264a = i2;
        this.f2265b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f2264a == gVar.f2264a && this.f2265b == gVar.f2265b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2265b) + (Integer.hashCode(this.f2264a) * 31);
    }

    public final String toString() {
        return "PendingSubmissionsSummary(pendingAchievements=" + this.f2264a + ", pendingLeaderboardSubmissions=" + this.f2265b + ")";
    }
}
