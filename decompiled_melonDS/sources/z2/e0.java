package z2;

import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends f {

    /* renamed from: e  reason: collision with root package name */
    public final f f14905e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14906f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14907g;

    /* renamed from: h  reason: collision with root package name */
    public mc.l f14908h;

    /* renamed from: i  reason: collision with root package name */
    public final long f14909i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f fVar, mc.l lVar, boolean z10, boolean z11) {
        super(0L, j.X);
        mc.l lVar2;
        h1 h1Var = l.f14917a;
        this.f14905e = fVar;
        this.f14906f = z10;
        this.f14907g = z11;
        this.f14908h = l.k(lVar, (fVar == null || (lVar2 = fVar.e()) == null) ? l.f14926j.f14885e : lVar2, z10);
        this.f14909i = v2.h.b();
    }

    @Override // z2.f
    public final void c() {
        f fVar;
        this.f14912c = true;
        if (this.f14907g && (fVar = this.f14905e) != null) {
            fVar.c();
        }
    }

    @Override // z2.f
    public final j d() {
        return v().d();
    }

    @Override // z2.f
    public final mc.l e() {
        return this.f14908h;
    }

    @Override // z2.f
    public final boolean f() {
        return v().f();
    }

    @Override // z2.f
    public final long g() {
        return v().g();
    }

    @Override // z2.f
    public final mc.l i() {
        return null;
    }

    @Override // z2.f
    public final void k() {
        q.l();
        throw null;
    }

    @Override // z2.f
    public final void l() {
        q.l();
        throw null;
    }

    @Override // z2.f
    public final void m() {
        v().m();
    }

    @Override // z2.f
    public final void n(y yVar) {
        v().n(yVar);
    }

    @Override // z2.f
    public final f u(mc.l lVar) {
        mc.l k10 = l.k(lVar, this.f14908h, true);
        if (!this.f14906f) {
            return l.g(v().u(null), k10, true);
        }
        return v().u(k10);
    }

    public final f v() {
        f fVar = this.f14905e;
        if (fVar == null) {
            return l.f14926j;
        }
        return fVar;
    }
}
