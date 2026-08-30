package xe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f14571a;

    public g(long j2) {
        this.f14571a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && this.f14571a == ((g) obj).f14571a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14571a);
    }

    public final String toString() {
        return "OnAchievementUnPrimed(achievementId=" + this.f14571a + ")";
    }
}
