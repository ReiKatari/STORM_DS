package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f6559a;

    public p0(long j2) {
        this.f6559a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p0) && this.f6559a == ((p0) obj).f6559a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6559a);
    }

    public final String toString() {
        return "LeaderboardAttemptCancelled(leaderboardId=" + this.f6559a + ")";
    }
}
