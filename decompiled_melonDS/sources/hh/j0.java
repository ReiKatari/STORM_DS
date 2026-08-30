package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final oi.b f6535a;

    public j0(oi.b bVar) {
        this.f6535a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof j0) || !this.f6535a.equals(((j0) obj).f6535a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6535a.hashCode();
    }

    public final String toString() {
        return "AchievementPrimed(achievement=" + this.f6535a + ")";
    }
}
