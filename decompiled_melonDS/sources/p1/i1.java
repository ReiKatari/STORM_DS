package p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
final class i1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f11216a;

    public i1(o0 o0Var) {
        this.f11216a = o0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p1.j1, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f11226i0 = this.f11216a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i1) && nc.k.a(this.f11216a, ((i1) obj).f11216a)) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((j1) oVar).f11226i0 = this.f11216a;
    }

    public final int hashCode() {
        return this.f11216a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f11216a + ')';
    }
}
