package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 implements v2 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f9877a;

    public c0(mc.l lVar) {
        this.f9877a = lVar;
    }

    @Override // n2.v2
    public final Object a(v2.g gVar) {
        return this.f9877a.k(gVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c0) || !this.f9877a.equals(((c0) obj).f9877a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9877a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f9877a + ')';
    }
}
