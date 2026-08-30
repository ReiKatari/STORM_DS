package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final w1 f4704a;

    public z1(w1 w1Var) {
        this.f4704a = w1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f1.u1, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f4656i0 = this.f4704a;
        oVar.f4657j0 = true;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z1) {
            if (nc.k.a(this.f4704a, ((z1) obj).f4704a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        u1 u1Var = (u1) oVar;
        u1Var.f4656i0 = this.f4704a;
        u1Var.f4657j0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + w.d.e(this.f4704a.hashCode() * 31, false, 31);
    }
}
