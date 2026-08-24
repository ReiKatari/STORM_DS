package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xe4  reason: default package */
/* loaded from: classes.dex */
public final class xe4 extends c20 {
    public final int b;

    static {
        ga0.h("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe4(if4 if4Var) {
        super(if4Var);
        if4Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.k11
    public final boolean c(yw7 yw7Var) {
        yw7Var.getClass();
        if (yw7Var.j.a == kf4.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c20
    public final int d() {
        return this.b;
    }

    @Override // defpackage.c20
    public final boolean e(Object obj) {
        gf4 gf4Var = (gf4) obj;
        gf4Var.getClass();
        if (gf4Var.a && gf4Var.d && !gf4Var.e) {
            return false;
        }
        return true;
    }
}
