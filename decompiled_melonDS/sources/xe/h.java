package xe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f14572a;

    public h(long j2) {
        this.f14572a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f14572a == ((h) obj).f14572a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14572a);
    }

    public final String toString() {
        return "OnLeaderboardAttemptCancelled(leaderboardId=" + this.f14572a + ")";
    }
}
