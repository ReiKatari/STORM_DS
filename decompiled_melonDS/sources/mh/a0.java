package mh;

import d1.i0;
import hh.k0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final z2.p f9667a = new z2.p();

    public final void a(k0 k0Var) {
        this.f9667a.add(0, new b(k0Var.f6538a, k0Var.f6539b, k0Var.f6540c, k0Var.f6541d, new a4.n(new a3.e(22, this, k0Var))));
    }

    public final void b(int i2, g0 g0Var) {
        z2.p pVar = this.f9667a;
        Object obj = pVar.get(i2);
        obj.getClass();
        a4.n nVar = ((g) obj).f9687b;
        g gVar = new g(g0Var, nVar);
        ((i0) nVar.L).f3596c.setValue(Boolean.TRUE);
        pVar.set(i2, gVar);
    }

    public final void c(int i2, k0 k0Var) {
        z2.p pVar = this.f9667a;
        Object obj = pVar.get(i2);
        obj.getClass();
        b bVar = (b) obj;
        a4.n nVar = bVar.f9672e;
        long j2 = bVar.f9668a.f11012a;
        oi.b bVar2 = k0Var.f6538a;
        int i10 = (j2 > bVar2.f11012a ? 1 : (j2 == bVar2.f11012a ? 0 : -1));
        int i11 = k0Var.f6539b;
        if (i10 == 0) {
            pVar.set(i2, new b(bVar2, i11, k0Var.f6540c, k0Var.f6541d, nVar));
        } else if (i11 / k0Var.f6540c > bVar.f9669b / bVar.f9670c) {
            nVar.o();
            a(k0Var);
        }
    }
}
