package xe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f14566a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14567b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14568c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14569d;

    public e(int i2, int i10, long j2, String str) {
        this.f14566a = j2;
        this.f14567b = i2;
        this.f14568c = i10;
        this.f14569d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f14566a != eVar.f14566a || this.f14567b != eVar.f14567b || this.f14568c != eVar.f14568c || !this.f14569d.equals(eVar.f14569d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14569d.hashCode() + w.d.c(this.f14568c, w.d.c(this.f14567b, Long.hashCode(this.f14566a) * 31, 31), 31);
    }

    public final String toString() {
        return "OnAchievementProgressUpdated(achievementId=" + this.f14566a + ", current=" + this.f14567b + ", target=" + this.f14568c + ", progress=" + this.f14569d + ")";
    }
}
