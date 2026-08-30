package a2;

import f2.s0;
import f2.u0;
import f2.v0;
import n2.e0;
import n2.s;
import y3.z;
import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends a4.k implements a4.i, b2.g {

    /* renamed from: k0  reason: collision with root package name */
    public a0.g f140k0;

    /* renamed from: l0  reason: collision with root package name */
    public u0 f141l0;

    /* renamed from: m0  reason: collision with root package name */
    public v0 f142m0;

    /* renamed from: n0  reason: collision with root package name */
    public s0 f143n0;

    /* renamed from: o0  reason: collision with root package name */
    public l1 f144o0;
    public final e0 p0 = s.q(new n(0, this));

    /* renamed from: q0  reason: collision with root package name */
    public h3.c f145q0 = h3.c.f6051e;

    public p(a0.g gVar, u0 u0Var, v0 v0Var, s0 s0Var) {
        this.f140k0 = gVar;
        this.f141l0 = u0Var;
        this.f142m0 = v0Var;
        this.f143n0 = s0Var;
    }

    @Override // b3.o
    public final void G0() {
        a0.g gVar = this.f140k0;
        gVar.L = q.Attached;
        gVar.B = this;
    }

    @Override // b3.o
    public final void H0() {
        a0.g gVar = this.f140k0;
        gVar.L = q.Detached;
        gVar.B = null;
    }

    @Override // b2.g
    public final long h0(z zVar) {
        return u(zVar).d();
    }

    @Override // b2.g
    public final h3.c u(z zVar) {
        if (!this.f1777h0) {
            return this.f145q0;
        }
        h3.c cVar = (h3.c) this.f143n0.k(zVar);
        if (cVar == null) {
            return this.f145q0;
        }
        this.f145q0 = cVar;
        return cVar;
    }

    @Override // b2.g
    public final x1.c v0() {
        return (x1.c) this.p0.getValue();
    }
}
