package f1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final j1.i f4641a;

    public q0(j1.i iVar) {
        this.f4641a = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f1.u0, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f4654i0 = this.f4641a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q0) && nc.k.a(((q0) obj).f4641a, this.f4641a)) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        u0 u0Var = (u0) oVar;
        j1.i iVar = u0Var.f4654i0;
        j1.i iVar2 = this.f4641a;
        if (!nc.k.a(iVar, iVar2)) {
            u0Var.Q0();
            u0Var.f4654i0 = iVar2;
        }
    }

    public final int hashCode() {
        return this.f4641a.hashCode() * 31;
    }
}
