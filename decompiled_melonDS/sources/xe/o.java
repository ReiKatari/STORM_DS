package xe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final oi.b f14585a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14586b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14587c;

    public o(oi.b bVar, boolean z10, boolean z11) {
        this.f14585a = bVar;
        this.f14586b = z10;
        this.f14587c = z11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (!this.f14585a.equals(oVar.f14585a) || this.f14586b != oVar.f14586b || this.f14587c != oVar.f14587c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14587c) + w.d.e(this.f14585a.hashCode() * 31, this.f14586b, 31);
    }

    public final String toString() {
        return "RAUserAchievement(achievement=" + this.f14585a + ", isUnlocked=" + this.f14586b + ", forHardcoreMode=" + this.f14587c + ")";
    }
}
