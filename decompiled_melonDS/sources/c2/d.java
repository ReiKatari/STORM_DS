package c2;

import a2.h;
import a4.h2;
import a4.k;
import a4.l;
import a4.o;
import a4.o1;
import a4.o2;
import g3.b0;
import g3.e0;
import g3.g;
import v3.c0;
import v3.h0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends k implements h2, g, b0 {

    /* renamed from: k0  reason: collision with root package name */
    public mc.a f2553k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f2554l0;

    /* renamed from: m0  reason: collision with root package name */
    public final h0 f2555m0;

    public d(mc.a aVar) {
        this.f2553k0 = aVar;
        h hVar = new h(1, this);
        v3.k kVar = c0.f13637a;
        h0 h0Var = new h0(null, null, null, hVar);
        O0(h0Var);
        this.f2555m0 = h0Var;
    }

    @Override // g3.g
    public final void M(e0 e0Var) {
        this.f2554l0 = e0Var.isFocused();
    }

    @Override // a4.h2
    public final void g0() {
        this.f2555m0.g0();
    }

    @Override // a4.h2
    public final long n() {
        o oVar = b.f2551a;
        x4.c cVar = l.t(this).f295t0;
        oVar.getClass();
        int i2 = o2.f304b;
        return o1.c(cVar.O(oVar.f274a), cVar.O(oVar.f275b), cVar.O(oVar.f276c), cVar.O(oVar.f277d));
    }

    @Override // a4.h2
    public final void s0(v3.k kVar, v3.l lVar, long j2) {
        this.f2555m0.s0(kVar, lVar, j2);
    }
}
