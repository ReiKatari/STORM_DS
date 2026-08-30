package g3;

import a4.j1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
final class s extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final v f5536a;

    public s(v vVar) {
        this.f5536a = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g3.x, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f5549i0 = this.f5536a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof s) || !this.f5536a.equals(((s) obj).f5536a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((x) oVar).f5549i0 = this.f5536a;
    }

    public final int hashCode() {
        return this.f5536a.A.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f5536a + ')';
    }
}
