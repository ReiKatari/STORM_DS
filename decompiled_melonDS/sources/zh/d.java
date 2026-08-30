package zh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15116a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15117b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15118c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15119d;

    public d(int i2, int i10, int i11, boolean z10) {
        this.f15116a = z10;
        this.f15117b = i2;
        this.f15118c = i10;
        this.f15119d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f15116a == dVar.f15116a && this.f15117b == dVar.f15117b && this.f15118c == dVar.f15118c && this.f15119d == dVar.f15119d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15119d) + w.d.c(this.f15118c, w.d.c(this.f15117b, Boolean.hashCode(this.f15116a) * 31, 31), 31);
    }

    public final String toString() {
        return "RomAchievementsSummary(forHardcoreMode=" + this.f15116a + ", totalAchievements=" + this.f15117b + ", completedAchievements=" + this.f15118c + ", totalPoints=" + this.f15119d + ")";
    }
}
