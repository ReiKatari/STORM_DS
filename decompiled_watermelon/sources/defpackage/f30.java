package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f30  reason: default package */
/* loaded from: classes.dex */
public final class f30 extends yy3 implements mf3, gz5 {
    public mi2 j0;

    public f30(mi2 mi2Var) {
        this.j0 = mi2Var;
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        yn4 c = mv3Var.c(j);
        return vv3Var.s0(c.A, c.B, qp1.A, new ej(6, c, this));
    }

    @Override // defpackage.gz5
    public final boolean l() {
        return false;
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        y26 y26Var;
        boolean z;
        mi2 mi2Var;
        m74 N = l.N(this, 2);
        if (!N.C0) {
            rf5 rf5Var = tq5.l;
            if (rf5Var == null) {
                tq5.l = new rf5();
            } else {
                rf5Var.a();
            }
            rf5 rf5Var2 = tq5.l;
            rf5Var2.getClass();
            rf5Var2.j0 = N.j0.t0;
            rf5Var2.i0 = hk2.U(N.L);
            ga6 z2 = io2.z();
            if (z2 != null) {
                mi2Var = z2.e();
            } else {
                mi2Var = null;
            }
            ga6 Y = io2.Y(z2);
            try {
                this.j0.n(rf5Var2);
                io2.l0(z2, Y, mi2Var);
                y26Var = rf5Var2.g0;
                z = rf5Var2.h0;
            } catch (Throwable th) {
                io2.l0(z2, Y, mi2Var);
                throw th;
            }
        } else {
            y26Var = N.A0;
            z = N.B0;
        }
        if (!z) {
            return;
        }
        pz5.e(rz5Var, y26Var);
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.j0 + ')';
    }
}
