package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 extends i0 {

    /* renamed from: a  reason: collision with root package name */
    public final oi.b f6523a;

    public f0(oi.b bVar) {
        this.f6523a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f0) || !this.f6523a.equals(((f0) obj).f6523a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6523a.hashCode();
    }

    public final String toString() {
        return "AchievementUnlockPopup(achievement=" + this.f6523a + ")";
    }
}
