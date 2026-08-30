package je;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f7859a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7860b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7861c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7862d;

    public j(long j2, long j10, boolean z10, boolean z11) {
        this.f7859a = j2;
        this.f7860b = j10;
        this.f7861c = z10;
        this.f7862d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f7859a == jVar.f7859a && this.f7860b == jVar.f7860b && this.f7861c == jVar.f7861c && this.f7862d == jVar.f7862d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7862d) + w.d.e(w.d.f(this.f7860b, Long.hashCode(this.f7859a) * 31, 31), this.f7861c, 31);
    }

    public final String toString() {
        return "RAUserAchievementEntity(gameId=" + this.f7859a + ", achievementId=" + this.f7860b + ", isUnlocked=" + this.f7861c + ", isHardcore=" + this.f7862d + ")";
    }
}
