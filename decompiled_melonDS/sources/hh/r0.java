package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f6566a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6567b;

    public r0(long j2, String str) {
        this.f6566a = j2;
        this.f6567b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                if (this.f6566a != r0Var.f6566a || !this.f6567b.equals(r0Var.f6567b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6567b.hashCode() + (Long.hashCode(this.f6566a) * 31);
    }

    public final String toString() {
        return "LeaderboardAttemptUpdated(leaderboardId=" + this.f6566a + ", formattedValue=" + this.f6567b + ")";
    }
}
