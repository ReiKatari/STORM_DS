package oi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11031a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11032b;

    public e(int i2, boolean z10) {
        this.f11031a = z10;
        this.f11032b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f11031a == eVar.f11031a && this.f11032b == eVar.f11032b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11032b) + (Boolean.hashCode(this.f11031a) * 31);
    }

    public final String toString() {
        return "RAAwardAchievementResponse(achievementAwarded=" + this.f11031a + ", remainingAchievements=" + this.f11032b + ")";
    }
}
