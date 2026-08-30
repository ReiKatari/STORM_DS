package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h77  reason: default package */
/* loaded from: classes.dex */
public final class h77 extends qi4 {
    public final tj4 X = me2.G(new i76(0));
    public final tj4 Y = me2.G(Boolean.FALSE);
    public final r67 Z;
    public final tj4 c0;
    public float d0;
    public b30 e0;

    public h77(jo2 jo2Var) {
        r67 r67Var = new r67(jo2Var);
        r67Var.f = new dj(20, this);
        this.Z = r67Var;
        this.c0 = new tj4(o27.a, k45.f0);
        this.d0 = 1.0f;
    }

    @Override // defpackage.qi4
    public final void d(float f) {
        this.d0 = f;
    }

    @Override // defpackage.qi4
    public final void e(b30 b30Var) {
        this.e0 = b30Var;
    }

    @Override // defpackage.qi4
    public final long h() {
        return ((i76) this.X.getValue()).a;
    }

    @Override // defpackage.qi4
    public final void i(xf3 xf3Var) {
        rh0 rh0Var = xf3Var.A;
        b30 b30Var = this.e0;
        r67 r67Var = this.Z;
        if (b30Var == null) {
            b30Var = (b30) r67Var.g.getValue();
        }
        if (((Boolean) this.Y.getValue()).booleanValue() && xf3Var.getLayoutDirection() == sd3.Rtl) {
            long f0 = rh0Var.f0();
            os osVar = rh0Var.B;
            long E = osVar.E();
            osVar.s().m();
            try {
                ((bq0) osVar.B).d0(-1.0f, 1.0f, f0);
                r67Var.e(xf3Var, this.d0, b30Var);
            } finally {
                wh1.u(osVar, E);
            }
        } else {
            r67Var.e(xf3Var, this.d0, b30Var);
        }
        this.c0.getValue();
    }
}
