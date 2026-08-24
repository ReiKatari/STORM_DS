package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g83  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g83 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ h83 B;

    public /* synthetic */ g83(h83 h83Var, int i) {
        this.A = i;
        this.B = h83Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        h83 h83Var = this.B;
        ub7 ub7Var = (ub7) obj;
        switch (i) {
            case 0:
                ub7Var.getClass();
                h83 h83Var2 = (h83) ub7Var;
                tt7 tt7Var = h83Var.l0;
                if (!nb3.k(h83Var2.k0, tt7Var)) {
                    h83Var2.k0 = tt7Var;
                    h83Var2.S0();
                }
                return tb7.SkipSubtreeAndContinueTraversal;
            default:
                ub7Var.getClass();
                h83Var.k0 = ((h83) ub7Var).l0;
                return Boolean.FALSE;
        }
    }
}
