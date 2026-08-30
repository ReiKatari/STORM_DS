package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final oi.b f6547a;

    public m0(oi.b bVar) {
        this.f6547a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof m0) || !this.f6547a.equals(((m0) obj).f6547a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6547a.hashCode();
    }

    public final String toString() {
        return "AchievementTriggered(achievement=" + this.f6547a + ")";
    }
}
