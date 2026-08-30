package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 implements v2 {

    /* renamed from: a  reason: collision with root package name */
    public final f1 f9928a;

    public i0(f1 f1Var) {
        this.f9928a = f1Var;
    }

    @Override // n2.v2
    public final Object a(v2.g gVar) {
        return this.f9928a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof i0) || !this.f9928a.equals(((i0) obj).f9928a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9928a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f9928a + ')';
    }
}
