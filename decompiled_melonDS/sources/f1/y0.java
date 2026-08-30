package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
final class y0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final j1.i f4687a;

    /* renamed from: b  reason: collision with root package name */
    public final a1 f4688b;

    public y0(j1.i iVar, a1 a1Var) {
        this.f4687a = iVar;
        this.f4688b = a1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a4.k, f1.z0, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        a4.j a10 = this.f4688b.a(this.f4687a);
        ?? kVar = new a4.k();
        kVar.f4703k0 = a10;
        kVar.O0(a10);
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (nc.k.a(this.f4687a, y0Var.f4687a) && nc.k.a(this.f4688b, y0Var.f4688b)) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        z0 z0Var = (z0) oVar;
        a4.j a10 = this.f4688b.a(this.f4687a);
        z0Var.P0(z0Var.f4703k0);
        z0Var.f4703k0 = a10;
        z0Var.O0(a10);
    }

    public final int hashCode() {
        return this.f4688b.hashCode() + (this.f4687a.hashCode() * 31);
    }
}
