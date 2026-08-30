package f1;

import h1.i2;
import h1.j2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y1 extends a4.k implements a4.i, a4.x1 {

    /* renamed from: k0  reason: collision with root package name */
    public j2 f4689k0;

    /* renamed from: l0  reason: collision with root package name */
    public h1.n1 f4690l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f4691m0;

    /* renamed from: n0  reason: collision with root package name */
    public h1.q0 f4692n0;

    /* renamed from: o0  reason: collision with root package name */
    public j1.i f4693o0;
    public h1.d p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f4694q0;

    /* renamed from: r0  reason: collision with root package name */
    public i f4695r0;

    /* renamed from: s0  reason: collision with root package name */
    public i2 f4696s0;

    /* renamed from: t0  reason: collision with root package name */
    public a4.j f4697t0;

    /* renamed from: u0  reason: collision with root package name */
    public j f4698u0;

    /* renamed from: v0  reason: collision with root package name */
    public i f4699v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f4700w0;

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // b3.o
    public final void G0() {
        i iVar;
        this.f4700w0 = S0();
        R0();
        if (this.f4696s0 == null) {
            j2 j2Var = this.f4689k0;
            if (this.f4694q0) {
                iVar = this.f4699v0;
            } else {
                iVar = this.f4695r0;
            }
            i iVar2 = iVar;
            h1.q0 q0Var = this.f4692n0;
            h1.n1 n1Var = this.f4690l0;
            boolean z10 = this.f4691m0;
            boolean z11 = this.f4700w0;
            i2 i2Var = new i2(iVar2, this.p0, q0Var, n1Var, j2Var, this.f4693o0, z10, z11);
            O0(i2Var);
            this.f4696s0 = i2Var;
        }
    }

    @Override // b3.o
    public final void H0() {
        a4.j jVar = this.f4697t0;
        if (jVar != null) {
            P0(jVar);
        }
    }

    @Override // a4.x1
    public final void J() {
        i iVar;
        j jVar = (j) a4.l.h(this, m1.f4618a);
        if (!nc.k.a(jVar, this.f4698u0)) {
            this.f4698u0 = jVar;
            this.f4699v0 = null;
            a4.j jVar2 = this.f4697t0;
            if (jVar2 != null) {
                P0(jVar2);
            }
            this.f4697t0 = null;
            R0();
            i2 i2Var = this.f4696s0;
            if (i2Var != null) {
                j2 j2Var = this.f4689k0;
                h1.n1 n1Var = this.f4690l0;
                if (this.f4694q0) {
                    iVar = this.f4699v0;
                } else {
                    iVar = this.f4695r0;
                }
                i iVar2 = iVar;
                boolean z10 = this.f4691m0;
                boolean z11 = this.f4700w0;
                i2Var.j1(iVar2, this.p0, this.f4692n0, n1Var, j2Var, this.f4693o0, z10, z11);
            }
        }
    }

    public final void R0() {
        i iVar;
        a4.j jVar = this.f4697t0;
        if (jVar == null) {
            if (this.f4694q0) {
                a4.l.p(this, new a2.n(16, this));
            }
            if (this.f4694q0) {
                iVar = this.f4699v0;
            } else {
                iVar = this.f4695r0;
            }
            if (iVar != null) {
                a4.k kVar = iVar.f4576i;
                if (!kVar.A.f1777h0) {
                    O0(kVar);
                    this.f4697t0 = kVar;
                }
            }
        } else if (!((b3.o) jVar).A.f1777h0) {
            O0(jVar);
        }
    }

    public final boolean S0() {
        x4.m mVar = x4.m.Ltr;
        if (this.f1777h0) {
            mVar = a4.l.t(this).f296u0;
        }
        h1.n1 n1Var = this.f4690l0;
        if (mVar == x4.m.Rtl && n1Var != h1.n1.Vertical) {
            return false;
        }
        return true;
    }

    public final void T0(i iVar, h1.d dVar, h1.q0 q0Var, h1.n1 n1Var, j2 j2Var, j1.i iVar2, boolean z10, boolean z11) {
        boolean z12;
        i iVar3;
        this.f4689k0 = j2Var;
        this.f4690l0 = n1Var;
        boolean z13 = true;
        if (this.f4694q0 != z10) {
            this.f4694q0 = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        if (!nc.k.a(this.f4695r0, iVar)) {
            this.f4695r0 = iVar;
        } else {
            z13 = false;
        }
        if (z12 || (z13 && !z10)) {
            a4.j jVar = this.f4697t0;
            if (jVar != null) {
                P0(jVar);
            }
            this.f4697t0 = null;
            R0();
        }
        this.f4691m0 = z11;
        this.f4692n0 = q0Var;
        this.f4693o0 = iVar2;
        this.p0 = dVar;
        boolean S0 = S0();
        this.f4700w0 = S0;
        i2 i2Var = this.f4696s0;
        if (i2Var != null) {
            if (this.f4694q0) {
                iVar3 = this.f4699v0;
            } else {
                iVar3 = this.f4695r0;
            }
            i2Var.j1(iVar3, dVar, q0Var, n1Var, j2Var, iVar2, z11, S0);
        }
    }

    @Override // a4.j
    public final void w0() {
        i iVar;
        boolean S0 = S0();
        if (this.f4700w0 != S0) {
            this.f4700w0 = S0;
            j2 j2Var = this.f4689k0;
            h1.n1 n1Var = this.f4690l0;
            boolean z10 = this.f4694q0;
            if (z10) {
                iVar = this.f4699v0;
            } else {
                iVar = this.f4695r0;
            }
            i iVar2 = iVar;
            boolean z11 = this.f4691m0;
            T0(iVar2, this.p0, this.f4692n0, n1Var, j2Var, this.f4693o0, z10, z11);
        }
    }
}
