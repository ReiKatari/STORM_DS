package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l56  reason: default package */
/* loaded from: classes.dex */
public final class l56 extends yy3 implements mf3, m94, gk1, jv0 {
    public g56 j0;

    @Override // defpackage.yy3
    public final void J0() {
        nk2.Q(this, this.j0.R);
        this.j0.getClass();
    }

    @Override // defpackage.yy3
    public final void K0() {
        this.j0.getClass();
    }

    @Override // defpackage.m94
    public final void Q() {
        this.j0.f();
        nk2.Q(this, this.j0.R);
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        y55 c;
        os osVar;
        xf3Var.a();
        g56 g56Var = this.j0;
        rh0 rh0Var = xf3Var.A;
        xa6 xa6Var = g56Var.Z;
        if (xa6Var.size() > 1) {
            wq0.A0(xa6Var, new so5(5));
        }
        int size = xa6Var.size();
        for (int i = 0; i < size; i++) {
            w36 w36Var = (w36) xa6Var.get(i);
            pn2 pn2Var = (pn2) w36Var.h0.getValue();
            if (pn2Var != null && (c = w36Var.e().c.d().c()) != null && w36Var.g()) {
                long d = c.d();
                float intBitsToFloat = Float.intBitsToFloat((int) (d >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (d & 4294967295L));
                vi viVar = w36Var.e0;
                if (viVar != null) {
                    os osVar2 = rh0Var.B;
                    osVar = rh0Var.B;
                    long E = osVar2.E();
                    osVar2.s().m();
                    try {
                        ((os) ((bq0) osVar2.B).B).s().u(viVar);
                        ((bq0) osVar.B).e0(intBitsToFloat, intBitsToFloat2);
                        sn2.v(xf3Var, pn2Var);
                    } finally {
                        wh1.u(osVar2, E);
                    }
                } else {
                    os osVar3 = rh0Var.B;
                    osVar = rh0Var.B;
                    ((bq0) osVar3.B).e0(intBitsToFloat, intBitsToFloat2);
                    try {
                        sn2.v(xf3Var, pn2Var);
                    } finally {
                        ((bq0) osVar.B).e0(-intBitsToFloat, -intBitsToFloat2);
                    }
                }
            }
        }
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        yn4 c = mv3Var.c(j);
        return vv3Var.s0(c.A, c.B, qp1.A, new zm(vv3Var, this, c, 7));
    }
}
