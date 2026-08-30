package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f6569a;

    public s0(long j2) {
        this.f6569a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s0) && this.f6569a == ((s0) obj).f6569a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6569a);
    }

    public final String toString() {
        return "LeaderboardEntrySubmitError(leaderboardId=" + this.f6569a + ")";
    }
}
