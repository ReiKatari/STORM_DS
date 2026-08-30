package xe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f14573a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14574b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14575c;

    public i(String str, int i2, long j2) {
        this.f14573a = j2;
        this.f14574b = i2;
        this.f14575c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (this.f14573a != iVar.f14573a || this.f14574b != iVar.f14574b || !this.f14575c.equals(iVar.f14575c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14575c.hashCode() + w.d.c(this.f14574b, Long.hashCode(this.f14573a) * 31, 31);
    }

    public final String toString() {
        return "OnLeaderboardAttemptCompleted(leaderboardId=" + this.f14573a + ", value=" + this.f14574b + ", formattedValue=" + this.f14575c + ")";
    }
}
