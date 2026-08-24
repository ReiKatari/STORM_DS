package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zc3  reason: default package */
/* loaded from: classes.dex */
public final class zc3 extends uc3 {
    public final v96 d0;
    public final /* synthetic */ ed3 e0;

    public zc3(ed3 ed3Var, v96 v96Var) {
        this.e0 = ed3Var;
        this.d0 = v96Var;
    }

    @Override // defpackage.uc3
    public final boolean q() {
        return false;
    }

    @Override // defpackage.uc3
    public final void r(Throwable th) {
        ed3 ed3Var = this.e0;
        Object Q = ed3Var.Q();
        if (!(Q instanceof av0)) {
            Q = fd3.a(Q);
        }
        this.d0.k(ed3Var, Q);
    }
}
