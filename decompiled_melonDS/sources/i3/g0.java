package i3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends z {

    /* renamed from: f  reason: collision with root package name */
    public final h3.c f6634f;

    public g0(h3.c cVar) {
        this.f6634f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                if (!this.f6634f.equals(((g0) obj).f6634f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6634f.hashCode();
    }

    @Override // i3.z
    public final h3.c l() {
        return this.f6634f;
    }
}
