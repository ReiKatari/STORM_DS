package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl7  reason: default package */
/* loaded from: classes.dex */
public final class gl7 extends sr4 {
    public final vs4 X = np2.Y(new xi6(0));
    public final vs4 Y = np2.Y(Boolean.FALSE);
    public final qk7 Z;
    public final vs4 d0;
    public float e0;
    public z40 f0;

    public gl7(mu2 mu2Var) {
        qk7 qk7Var = new qk7(mu2Var);
        qk7Var.f = new pj(this, 20);
        this.Z = qk7Var;
        this.d0 = new vs4(jg7.a, vs0.j0);
        this.e0 = 1.0f;
    }

    @Override // defpackage.sr4
    public final void d(float f) {
        this.e0 = f;
    }

    @Override // defpackage.sr4
    public final void e(z40 z40Var) {
        this.f0 = z40Var;
    }

    @Override // defpackage.sr4
    public final long h() {
        return ((xi6) this.X.getValue()).a;
    }

    @Override // defpackage.sr4
    public final void i(um3 um3Var) {
        zj0 zj0Var = um3Var.A;
        z40 z40Var = this.f0;
        qk7 qk7Var = this.Z;
        if (z40Var == null) {
            z40Var = (z40) qk7Var.g.getValue();
        }
        if (((Boolean) this.Y.getValue()).booleanValue() && um3Var.getLayoutDirection() == kk3.Rtl) {
            long t0 = zj0Var.t0();
            bt btVar = zj0Var.B;
            long L = btVar.L();
            btVar.G().h();
            try {
                ((os0) btVar.B).f0(-1.0f, 1.0f, t0);
                qk7Var.e(um3Var, this.e0, z40Var);
            } finally {
                xg6.v(btVar, L);
            }
        } else {
            qk7Var.e(um3Var, this.e0, z40Var);
        }
        this.d0.getValue();
    }
}
