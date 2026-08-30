package c1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r<S> extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final d1.k1 f2514a;

    /* renamed from: b  reason: collision with root package name */
    public final n2.w0 f2515b;

    /* renamed from: c  reason: collision with root package name */
    public final v f2516c;

    public r(d1.k1 k1Var, n2.w0 w0Var, v vVar) {
        this.f2514a = k1Var;
        this.f2515b = w0Var;
        this.f2516c = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c1.h1, c1.u, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? h1Var = new h1(0);
        h1Var.f2527j0 = this.f2514a;
        h1Var.f2528k0 = this.f2515b;
        h1Var.f2529l0 = this.f2516c;
        h1Var.f2530m0 = m.f2469a;
        return h1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (nc.k.a(rVar.f2514a, this.f2514a) && rVar.f2515b.equals(this.f2515b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        u uVar = (u) oVar;
        uVar.f2527j0 = this.f2514a;
        uVar.f2528k0 = this.f2515b;
        uVar.f2529l0 = this.f2516c;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f2516c.hashCode() * 31;
        d1.k1 k1Var = this.f2514a;
        if (k1Var != null) {
            i2 = k1Var.hashCode();
        } else {
            i2 = 0;
        }
        return this.f2515b.hashCode() + ((hashCode + i2) * 31);
    }
}
