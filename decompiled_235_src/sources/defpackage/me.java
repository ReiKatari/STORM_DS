package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: me  reason: default package */
/* loaded from: classes.dex */
public final class me extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ dh5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me(int i, dh5 dh5Var) {
        super(1);
        this.B = i;
        this.L = dh5Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean z;
        int i = this.B;
        dh5 dh5Var = this.L;
        switch (i) {
            case 0:
                dh5Var.A = (vh2) obj;
                return Boolean.TRUE;
            case 1:
                ny2 ny2Var = (ny2) obj;
                Object obj2 = dh5Var.A;
                if (obj2 == null && ny2Var.m0) {
                    dh5Var.A = ny2Var;
                } else if (obj2 != null) {
                    ny2Var.getClass();
                }
                return Boolean.TRUE;
            default:
                ub7 ub7Var = (ub7) obj;
                if (((z64) ub7Var).A.j0) {
                    dh5Var.A = ub7Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
