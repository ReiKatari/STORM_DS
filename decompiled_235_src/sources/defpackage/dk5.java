package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk5  reason: default package */
/* loaded from: classes.dex */
public final class dk5 implements fu3 {
    public final /* synthetic */ st3 A;
    public final /* synthetic */ dh5 B;
    public final /* synthetic */ w61 L;
    public final /* synthetic */ st3 R;
    public final /* synthetic */ rj0 X;
    public final /* synthetic */ hb4 Y;
    public final /* synthetic */ eo2 Z;

    public dk5(st3 st3Var, dh5 dh5Var, w61 w61Var, st3 st3Var2, rj0 rj0Var, hb4 hb4Var, eo2 eo2Var) {
        this.A = st3Var;
        this.B = dh5Var;
        this.L = w61Var;
        this.R = st3Var2;
        this.X = rj0Var;
        this.Y = hb4Var;
        this.Z = eo2Var;
    }

    @Override // defpackage.fu3
    public final void h(hu3 hu3Var, st3 st3Var) {
        st3 st3Var2 = this.A;
        dh5 dh5Var = this.B;
        if (st3Var == st3Var2) {
            dh5Var.A = hv.L(this.L, null, null, new l5(this.Y, this.Z, (r41) null, 28), 3);
            return;
        }
        if (st3Var == this.R) {
            rc3 rc3Var = (rc3) dh5Var.A;
            if (rc3Var != null) {
                rc3Var.h(null);
            }
            dh5Var.A = null;
        }
        if (st3Var == st3.ON_DESTROY) {
            this.X.i(jg7.a);
        }
    }
}
