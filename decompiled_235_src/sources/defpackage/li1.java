package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: li1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class li1 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ oi1 B;

    public /* synthetic */ li1(oi1 oi1Var, int i) {
        this.A = i;
        this.B = oi1Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        on2 on2Var;
        int i = this.A;
        oi1 oi1Var = this.B;
        switch (i) {
            case 0:
                ((gl1) obj).getClass();
                oi1Var.j0.addView(oi1Var, oi1Var.k0);
                return new mi1(oi1Var, 0);
            case 1:
                ((gl1) obj).getClass();
                return new mi1(oi1Var, 1);
            default:
                jk4 jk4Var = (jk4) obj;
                if (oi1Var.i0.b && (on2Var = oi1Var.l0) != null) {
                    on2Var.c();
                }
                return jg7.a;
        }
    }
}
