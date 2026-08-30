package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f8629a;

    public t1(mc.l lVar) {
        this.f8629a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.o0, l1.u1, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? o0Var = new o0(c.f8507c);
        o0Var.f8632l0 = this.f8629a;
        return o0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t1) {
                if (this.f8629a == ((t1) obj).f8629a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        u1 u1Var = (u1) oVar;
        mc.l lVar = u1Var.f8632l0;
        mc.l lVar2 = this.f8629a;
        if (lVar != lVar2) {
            u1Var.f8632l0 = lVar2;
            c2 c2Var = u1Var.f8633m0;
            if (c2Var != null) {
                b2 b2Var = (b2) lVar2.k(c2Var);
                if (!nc.k.a(b2Var, u1Var.f8592k0)) {
                    u1Var.f8592k0 = b2Var;
                    u1Var.P0();
                }
            }
        }
    }

    public final int hashCode() {
        return this.f8629a.hashCode();
    }
}
