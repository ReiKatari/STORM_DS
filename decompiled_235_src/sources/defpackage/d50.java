package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d50  reason: default package */
/* loaded from: classes.dex */
public final class d50 extends z64 implements jm3, va6 {
    public qn2 k0;

    public d50(qn2 qn2Var) {
        this.k0 = qn2Var;
    }

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        ke6 ke6Var;
        boolean z;
        qn2 qn2Var;
        eg4 d0 = nc1.d0(this, 2);
        if (!d0.D0) {
            op5 op5Var = hv.g;
            if (op5Var == null) {
                hv.g = new op5();
            } else {
                op5Var.b();
            }
            op5 op5Var2 = hv.g;
            op5Var2.getClass();
            op5Var2.l0 = d0.k0.u0;
            op5Var2.k0 = qo2.S(d0.L);
            vl6 t = ln2.t();
            if (t != null) {
                qn2Var = t.e();
            } else {
                qn2Var = null;
            }
            vl6 N = ln2.N(t);
            try {
                this.k0.g(op5Var2);
                ln2.V(t, N, qn2Var);
                ke6Var = op5Var2.i0;
                z = op5Var2.j0;
            } catch (Throwable th) {
                ln2.V(t, N, qn2Var);
                throw th;
            }
        } else {
            ke6Var = d0.B0;
            z = d0.C0;
        }
        if (!z) {
            return;
        }
        eb6.e(gb6Var, ke6Var);
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        dx4 y = x24Var.y(j);
        return g34Var.K(y.A, y.B, zt1.A, new qj(6, y, this));
    }

    @Override // defpackage.va6
    public final boolean j() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.k0 + ')';
    }
}
