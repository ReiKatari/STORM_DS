package s0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final t0.b f12782a;

    /* renamed from: b  reason: collision with root package name */
    public final t0.b f12783b;

    public a(t0.b bVar, t0.b bVar2) {
        this.f12782a = bVar;
        this.f12783b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f12782a.equals(aVar.f12782a) && this.f12783b.equals(aVar.f12783b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f12782a.hashCode() ^ 1000003) * 1000003) ^ this.f12783b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f12782a + ", secondaryOutConfig=" + this.f12783b + "}";
    }
}
