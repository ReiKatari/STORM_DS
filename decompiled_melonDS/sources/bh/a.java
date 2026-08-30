package bh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final oi.b f2254a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2255b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2256c;

    public a(oi.b bVar, boolean z10, boolean z11) {
        this.f2254a = bVar;
        this.f2255b = z10;
        this.f2256c = z11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f2254a.equals(aVar.f2254a) || this.f2255b != aVar.f2255b || this.f2256c != aVar.f2256c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2256c) + w.d.e(this.f2254a.hashCode() * 31, this.f2255b, 31);
    }

    public final String toString() {
        return "AchievementSubmission(achievement=" + this.f2254a + ", forHardcoreMode=" + this.f2255b + ", firstTry=" + this.f2256c + ")";
    }
}
