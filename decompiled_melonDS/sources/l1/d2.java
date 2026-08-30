package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d2 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f8543a;

    /* renamed from: b  reason: collision with root package name */
    public final mc.p f8544b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8545c;

    public d2(c0 c0Var, mc.p pVar, Object obj) {
        this.f8543a = c0Var;
        this.f8544b = pVar;
        this.f8545c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.f2, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f8554i0 = this.f8543a;
        oVar.f8555j0 = this.f8544b;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && d2.class == obj.getClass()) {
                d2 d2Var = (d2) obj;
                if (this.f8543a != d2Var.f8543a || !nc.k.a(this.f8545c, d2Var.f8545c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        f2 f2Var = (f2) oVar;
        f2Var.f8554i0 = this.f8543a;
        f2Var.f8555j0 = this.f8544b;
    }

    public final int hashCode() {
        return this.f8545c.hashCode() + w.d.e(this.f8543a.hashCode() * 31, false, 31);
    }
}
