package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a86  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a86 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ e86 B;

    public /* synthetic */ a86(e86 e86Var, int i) {
        this.A = i;
        this.B = e86Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        e86 e86Var = this.B;
        switch (i) {
            case 0:
                return Boolean.valueOf(e86Var.j0);
            default:
                vh2 vh2Var = e86Var.L0;
                if (!vh2Var.A.j0) {
                    return null;
                }
                sh2 W0 = vh2Var.W0();
                if (!W0.getHasFocus()) {
                    return null;
                }
                if (W0.isFocused()) {
                    return vh2Var.U0(null);
                }
                vh2 f = ((eh2) ((te) nc1.g0(vh2Var)).getFocusOwner()).f();
                if (f == null) {
                    return null;
                }
                return f.U0(nc1.e0(vh2Var));
        }
    }
}
