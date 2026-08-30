package xe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f14577a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14578b;

    public k(long j2, String str) {
        this.f14577a = j2;
        this.f14578b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (this.f14577a != kVar.f14577a || !this.f14578b.equals(kVar.f14578b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14578b.hashCode() + (Long.hashCode(this.f14577a) * 31);
    }

    public final String toString() {
        return "OnLeaderboardAttemptUpdated(leaderboardId=" + this.f14577a + ", formattedValue=" + this.f14578b + ")";
    }
}
