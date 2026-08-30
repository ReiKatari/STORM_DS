package q4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final l4.h f12244a;

    /* renamed from: b  reason: collision with root package name */
    public final q f12245b;

    public e0(l4.h hVar, q qVar) {
        this.f12244a = hVar;
        this.f12245b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!nc.k.a(this.f12244a, e0Var.f12244a) || !this.f12245b.equals(e0Var.f12245b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12245b.hashCode() + (this.f12244a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f12244a) + ", offsetMapping=" + this.f12245b + ')';
    }
}
