package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
final class d2 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final y1 f2404a;

    public d2(y1 y1Var) {
        this.f2404a = y1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c1.e2, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f2416i0 = this.f2404a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d2) && nc.k.a(this.f2404a, ((d2) obj).f2404a)) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        e2 e2Var = (e2) oVar;
        y1 y1Var = e2Var.f2416i0;
        y1 y1Var2 = this.f2404a;
        if (!nc.k.a(y1Var2, y1Var)) {
            a4.l.p(e2Var, y1Var2.R);
        }
        e2Var.f2416i0 = y1Var2;
    }

    public final int hashCode() {
        return this.f2404a.hashCode();
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.f2404a + ')';
    }
}
