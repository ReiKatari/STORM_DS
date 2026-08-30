package f3;

import a4.n0;
import a4.p;
import a4.r0;
import a4.x1;
import b3.o;
import d2.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends o implements x1, a, p {

    /* renamed from: i0  reason: collision with root package name */
    public final c f4818i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f4819j0;

    /* renamed from: k0  reason: collision with root package name */
    public mc.l f4820k0;

    public b(c cVar, mc.l lVar) {
        this.f4818i0 = cVar;
        this.f4820k0 = lVar;
        cVar.A = this;
    }

    @Override // b3.o
    public final void I0() {
        O0();
    }

    @Override // a4.x1
    public final void J() {
        O0();
    }

    public final void O0() {
        this.f4819j0 = false;
        this.f4818i0.B = null;
        a4.l.j(this);
    }

    @Override // a4.j, a4.h2
    public final void a() {
        O0();
    }

    @Override // f3.a
    public final x4.c b() {
        return a4.l.t(this).f295t0;
    }

    @Override // f3.a
    public final long c() {
        return zb.k.T(a4.l.r(this, 4).L);
    }

    @Override // f3.a
    public final x4.m getLayoutDirection() {
        return a4.l.t(this).f296u0;
    }

    @Override // a4.p
    public final void q0() {
        O0();
    }

    @Override // a4.j
    public final void w0() {
        O0();
    }

    @Override // a4.p
    public final void z(r0 r0Var) {
        boolean z10 = this.f4819j0;
        c cVar = this.f4818i0;
        if (!z10) {
            cVar.B = null;
            a4.l.p(this, new n0(7, this, cVar));
            if (cVar.B != null) {
                this.f4819j0 = true;
            } else {
                throw w.d.g("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        t tVar = cVar.B;
        tVar.getClass();
        ((mc.l) tVar.B).k(r0Var);
    }

    @Override // b3.o
    public final void H0() {
    }
}
