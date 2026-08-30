package h0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final f0.c f5833a;

    public b(f0.c cVar) {
        this.f5833a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof b) || !this.f5833a.equals(((b) obj).f5833a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5833a.hashCode();
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.f5833a + ')';
    }
}
