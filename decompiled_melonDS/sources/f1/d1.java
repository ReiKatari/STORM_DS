package f1;

import a4.l2;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d1 extends b3.o implements a4.q, a4.p, l2, a4.x1 {

    /* renamed from: i0  reason: collision with root package name */
    public f2.g1 f4531i0;

    /* renamed from: j0  reason: collision with root package name */
    public f2.e1 f4532j0;

    /* renamed from: k0  reason: collision with root package name */
    public o1 f4533k0;

    /* renamed from: l0  reason: collision with root package name */
    public View f4534l0;

    /* renamed from: m0  reason: collision with root package name */
    public x4.c f4535m0;

    /* renamed from: n0  reason: collision with root package name */
    public n1 f4536n0;
    public n2.e0 p0;

    /* renamed from: r0  reason: collision with root package name */
    public x4.l f4539r0;

    /* renamed from: s0  reason: collision with root package name */
    public bd.h f4540s0;

    /* renamed from: o0  reason: collision with root package name */
    public final n2.f1 f4537o0 = new n2.f1(null, n2.e.R);

    /* renamed from: q0  reason: collision with root package name */
    public long f4538q0 = 9205357640488583168L;

    public d1(f2.g1 g1Var, f2.e1 e1Var, o1 o1Var) {
        this.f4531i0 = g1Var;
        this.f4532j0 = e1Var;
        this.f4533k0 = o1Var;
    }

    @Override // b3.o
    public final void G0() {
        J();
        this.f4540s0 = ij.a.s(0, 7, null);
        zc.x.v(C0(), null, zc.w.UNDISPATCHED, new a9.b(13, null, this), 1);
    }

    @Override // b3.o
    public final void H0() {
        n1 n1Var = this.f4536n0;
        if (n1Var != null) {
            ((p1) n1Var).b();
        }
        this.f4536n0 = null;
    }

    @Override // a4.x1
    public final void J() {
        a4.l.p(this, new c1(this, 0));
    }

    public final long O0() {
        if (this.p0 == null) {
            this.p0 = n2.s.q(new c1(this, 2));
        }
        n2.e0 e0Var = this.p0;
        if (e0Var != null) {
            return ((h3.b) e0Var.getValue()).f6050a;
        }
        return 9205357640488583168L;
    }

    public final void P0() {
        n1 n1Var = this.f4536n0;
        if (n1Var != null) {
            ((p1) n1Var).b();
        }
        View view = this.f4534l0;
        if (view == null) {
            view = a4.l.v(this);
        }
        this.f4534l0 = view;
        x4.c cVar = this.f4535m0;
        if (cVar == null) {
            cVar = a4.l.t(this).f295t0;
        }
        this.f4535m0 = cVar;
        this.f4536n0 = this.f4533k0.b(view, cVar);
        R0();
    }

    public final void Q0() {
        x4.c cVar = this.f4535m0;
        if (cVar == null) {
            cVar = a4.l.t(this).f295t0;
            this.f4535m0 = cVar;
        }
        long j2 = ((h3.b) this.f4531i0.k(cVar)).f6050a;
        if ((j2 & 9223372034707292159L) != 9205357640488583168L && (9223372034707292159L & O0()) != 9205357640488583168L) {
            this.f4538q0 = h3.b.e(O0(), j2);
            if (this.f4536n0 == null) {
                P0();
            }
            n1 n1Var = this.f4536n0;
            if (n1Var != null) {
                n1Var.a(this.f4538q0, 9205357640488583168L);
            }
            R0();
            return;
        }
        this.f4538q0 = 9205357640488583168L;
        n1 n1Var2 = this.f4536n0;
        if (n1Var2 != null) {
            ((p1) n1Var2).b();
        }
    }

    public final void R0() {
        x4.c cVar;
        n1 n1Var = this.f4536n0;
        if (n1Var != null && (cVar = this.f4535m0) != null) {
            p1 p1Var = (p1) n1Var;
            if (!x4.l.a(p1Var.c(), this.f4539r0)) {
                this.f4532j0.k(new x4.h(cVar.t(zb.k.T(p1Var.c()))));
                this.f4539r0 = new x4.l(p1Var.c());
            }
        }
    }

    @Override // a4.q
    public final void b0(a4.r1 r1Var) {
        this.f4537o0.setValue(r1Var);
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
        xVar.a(e1.f4542a, new c1(this, 1));
    }

    @Override // a4.p
    public final void z(a4.r0 r0Var) {
        r0Var.a();
        bd.h hVar = this.f4540s0;
        if (hVar != null) {
            hVar.a(yb.y.f14813a);
        }
    }
}
