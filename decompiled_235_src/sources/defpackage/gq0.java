package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq0  reason: default package */
/* loaded from: classes.dex */
public final class gq0 extends uc3 {
    public final rj0 d0;

    public gq0(rj0 rj0Var) {
        this.d0 = rj0Var;
    }

    @Override // defpackage.uc3
    public final boolean q() {
        return true;
    }

    @Override // defpackage.uc3
    public final void r(Throwable th) {
        boolean p;
        ed3 p2 = p();
        rj0 rj0Var = this.d0;
        Throwable q = rj0Var.q(p2);
        if (!rj0Var.B()) {
            p = false;
        } else {
            p = ((nk1) rj0Var.R).p(q);
        }
        if (!p) {
            rj0Var.w(q);
            if (!rj0Var.B()) {
                rj0Var.o();
            }
        }
    }
}
