package mh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends g0 {

    /* renamed from: f  reason: collision with root package name */
    public final long f9684f;

    public e(long j2) {
        this.f9684f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.f9684f == ((e) obj).f9684f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9684f);
    }

    public final String toString() {
        return "AwardAchievement(achievementId=" + this.f9684f + ")";
    }
}
