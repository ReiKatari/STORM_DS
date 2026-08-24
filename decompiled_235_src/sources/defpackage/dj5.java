package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dj5  reason: default package */
/* loaded from: classes.dex */
public final class dj5 extends r0 implements o61 {
    public final /* synthetic */ cy0 B;
    public final /* synthetic */ ej5 L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dj5(cy0 cy0Var, ej5 ej5Var) {
        super(r0);
        cs1 cs1Var = cs1.Z;
        this.B = cy0Var;
        this.L = ej5Var;
    }

    @Override // defpackage.o61
    public final void u(l61 l61Var, Throwable th) {
        cy0 cy0Var = this.B;
        ej5 ej5Var = this.L;
        nw7.s0(th, new q6(18, cy0Var, ej5Var));
        o61 o61Var = (o61) ej5Var.A.Z(cs1.Z);
        if (o61Var != null) {
            o61Var.u(l61Var, th);
            return;
        }
        throw th;
    }
}
