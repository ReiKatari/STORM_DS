package f1;

import a4.l2;
import a4.q2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 extends a4.k implements l2, a4.q, a4.i, a4.x1, q2 {

    /* renamed from: q0  reason: collision with root package name */
    public static final b f4606q0 = new Object();

    /* renamed from: k0  reason: collision with root package name */
    public j1.i f4607k0;

    /* renamed from: l0  reason: collision with root package name */
    public final mc.l f4608l0;

    /* renamed from: m0  reason: collision with root package name */
    public j1.d f4609m0;

    /* renamed from: n0  reason: collision with root package name */
    public p1.j0 f4610n0;

    /* renamed from: o0  reason: collision with root package name */
    public a4.r1 f4611o0;
    public final g3.g0 p0;

    public l0(j1.i iVar, int i2, a2.g gVar) {
        this.f4607k0 = iVar;
        this.f4608l0 = gVar;
        g3.g0 g0Var = new g3.g0(i2, new k0(2, this, l0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 0), 10);
        O0(g0Var);
        this.p0 = g0Var;
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // b3.o
    public final void I0() {
        p1.j0 j0Var = this.f4610n0;
        if (j0Var != null) {
            j0Var.b();
        }
        this.f4610n0 = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nc.t, java.lang.Object] */
    @Override // a4.x1
    public final void J() {
        ?? obj = new Object();
        a4.l.p(this, new a3.e(9, (Object) obj, this));
        p1.j0 j0Var = (p1.j0) obj.A;
        if (this.p0.T0().isFocused()) {
            p1.j0 j0Var2 = this.f4610n0;
            if (j0Var2 != null) {
                j0Var2.b();
            }
            if (j0Var != null) {
                j0Var.a();
            } else {
                j0Var = null;
            }
            this.f4610n0 = j0Var;
        }
    }

    public final void R0(j1.i iVar, j1.h hVar) {
        zc.i0 i0Var;
        if (this.f1777h0) {
            zc.y0 y0Var = (zc.y0) ((ah.h0) C0()).B.t(zc.r.B);
            if (y0Var != null) {
                i0Var = y0Var.I(new a7.l(18, iVar, hVar));
            } else {
                i0Var = null;
            }
            zc.x.v(C0(), null, null, new a2.o(iVar, hVar, i0Var, null, 15), 3);
            return;
        }
        iVar.b(hVar);
    }

    public final void S0() {
        a4.n1 n1Var;
        if (this.f1777h0) {
            if (!this.A.f1777h0) {
                x3.a.c("visitAncestors called on an unattached node");
            }
            b3.o oVar = this.A.X;
            a4.o0 t5 = a4.l.t(this);
            while (t5 != null) {
                if ((t5.A0.f268f.R & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.L & 262144) != 0) {
                            b3.o oVar2 = oVar;
                            p2.b bVar = null;
                            while (oVar2 != null) {
                                if (oVar2 instanceof q2) {
                                    if (m0.f4617i0.equals(((q2) oVar2).k())) {
                                        return;
                                    }
                                } else if ((oVar2.L & 262144) != 0 && (oVar2 instanceof a4.k)) {
                                    int i2 = 0;
                                    for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                        if ((oVar3.L & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    bVar.b(oVar2);
                                                    oVar2 = null;
                                                }
                                                bVar.b(oVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oVar2 = a4.l.e(bVar);
                            }
                            continue;
                        }
                        oVar = oVar.X;
                    }
                }
                t5 = t5.u();
                if (t5 != null && (n1Var = t5.A0) != null) {
                    oVar = n1Var.f267e;
                } else {
                    oVar = null;
                }
            }
        }
    }

    public final void T0(j1.i iVar) {
        j1.d dVar;
        if (!nc.k.a(this.f4607k0, iVar)) {
            j1.i iVar2 = this.f4607k0;
            if (iVar2 != null && (dVar = this.f4609m0) != null) {
                iVar2.b(new j1.e(dVar));
            }
            this.f4609m0 = null;
            this.f4607k0 = iVar;
        }
    }

    @Override // a4.q
    public final void b0(a4.r1 r1Var) {
        this.f4611o0 = r1Var;
        if (this.p0.T0().isFocused()) {
            if (r1Var.X0().f1777h0) {
                a4.r1 r1Var2 = this.f4611o0;
                if (r1Var2 != null && r1Var2.X0().f1777h0) {
                    S0();
                    return;
                }
                return;
            }
            S0();
        }
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
        boolean isFocused = this.p0.T0().isFocused();
        tc.c[] cVarArr = i4.v.f6808a;
        i4.w wVar = i4.t.f6791k;
        tc.c cVar = i4.v.f6808a[4];
        xVar.a(wVar, Boolean.valueOf(isFocused));
        xVar.a(i4.l.f6761w, new i4.a(null, new b4.o(0, this, l0.class, "requestFocus", "requestFocus()Z", 0, 0, 1)));
    }

    @Override // a4.q2
    public final Object k() {
        return f4606q0;
    }
}
