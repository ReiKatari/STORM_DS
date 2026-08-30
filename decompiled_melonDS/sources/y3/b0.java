package y3;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14663a;

    public b0(String str) {
        this.f14663a = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y3.d0, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f14670i0 = this.f14663a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof b0) || !this.f14663a.equals(((b0) obj).f14663a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((d0) oVar).f14670i0 = this.f14663a;
    }

    public final int hashCode() {
        return this.f14663a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f14663a) + ')';
    }
}
