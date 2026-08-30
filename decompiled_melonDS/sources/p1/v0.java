package p1;

import h1.n1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.a f11268a;

    /* renamed from: b  reason: collision with root package name */
    public final u0 f11269b;

    /* renamed from: c  reason: collision with root package name */
    public final n1 f11270c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11271d;

    public v0(mc.a aVar, u0 u0Var, n1 n1Var, boolean z10) {
        this.f11268a = aVar;
        this.f11269b = u0Var;
        this.f11270c = n1Var;
        this.f11271d = z10;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new y0(this.f11268a, this.f11269b, this.f11270c, this.f11271d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (this.f11268a == v0Var.f11268a && nc.k.a(this.f11269b, v0Var.f11269b) && this.f11270c == v0Var.f11270c && this.f11271d == v0Var.f11271d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        y0 y0Var = (y0) oVar;
        y0Var.f11289i0 = this.f11268a;
        y0Var.f11290j0 = this.f11269b;
        n1 n1Var = y0Var.f11291k0;
        n1 n1Var2 = this.f11270c;
        if (n1Var != n1Var2) {
            y0Var.f11291k0 = n1Var2;
            a4.l.l(y0Var);
        }
        boolean z10 = y0Var.f11292l0;
        boolean z11 = this.f11271d;
        if (z10 == z11) {
            return;
        }
        y0Var.f11292l0 = z11;
        y0Var.O0();
        a4.l.l(y0Var);
    }

    public final int hashCode() {
        int hashCode = this.f11269b.hashCode();
        return Boolean.hashCode(false) + w.d.e((this.f11270c.hashCode() + ((hashCode + (this.f11268a.hashCode() * 31)) * 31)) * 31, this.f11271d, 31);
    }
}
