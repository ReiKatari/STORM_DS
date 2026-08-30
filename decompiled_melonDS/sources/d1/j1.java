package d1;

import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j1 implements s2 {
    public final n1 A;
    public mc.l B;
    public nc.l L;
    public final /* synthetic */ k1 R;

    public j1(k1 k1Var, n1 n1Var, mc.l lVar, mc.l lVar2) {
        this.R = k1Var;
        this.A = n1Var;
        this.B = lVar;
        this.L = (nc.l) lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nc.l, mc.l] */
    /* JADX WARN: Type inference failed for: r1v5, types: [nc.l, mc.l] */
    public final void a(l1 l1Var) {
        Object k10 = this.L.k(l1Var.c());
        boolean g10 = this.R.f3599c.g();
        n1 n1Var = this.A;
        if (g10) {
            n1Var.g(this.L.k(l1Var.a()), k10, (x) this.B.k(l1Var));
        } else {
            n1Var.h(k10, (x) this.B.k(l1Var));
        }
    }

    @Override // n2.s2
    public final Object getValue() {
        a(this.R.f3599c.f());
        return this.A.f3614d0.getValue();
    }
}
