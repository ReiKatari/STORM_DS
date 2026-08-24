package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc3  reason: default package */
/* loaded from: classes.dex */
public final class xc3 extends uc3 {
    public final ed3 d0;
    public final yc3 e0;
    public final iq0 f0;
    public final Object g0;

    public xc3(ed3 ed3Var, yc3 yc3Var, iq0 iq0Var, Object obj) {
        this.d0 = ed3Var;
        this.e0 = yc3Var;
        this.f0 = iq0Var;
        this.g0 = obj;
    }

    @Override // defpackage.uc3
    public final boolean q() {
        return false;
    }

    @Override // defpackage.uc3
    public final void r(Throwable th) {
        iq0 iq0Var = this.f0;
        iq0 g0 = ed3.g0(iq0Var);
        ed3 ed3Var = this.d0;
        yc3 yc3Var = this.e0;
        Object obj = this.g0;
        if (g0 == null || !ed3Var.t0(yc3Var, g0, obj)) {
            yc3Var.A.b(new lw3(2), 2);
            iq0 g02 = ed3.g0(iq0Var);
            if (g02 != null && ed3Var.t0(yc3Var, g02, obj)) {
                return;
            }
            ed3Var.d(ed3Var.I(yc3Var, obj));
        }
    }
}
