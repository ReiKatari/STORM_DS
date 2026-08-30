package nc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Class f10261a;

    public n(Class cls) {
        this.f10261a = cls;
    }

    @Override // nc.d
    public final Class a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            if (this.f10261a.equals(((n) obj).f10261a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10261a.hashCode();
    }

    public final String toString() {
        return this.f10261a.toString() + " (Kotlin reflection is not available)";
    }
}
