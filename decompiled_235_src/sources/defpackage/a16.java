package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a16  reason: default package */
/* loaded from: classes.dex */
public final class a16 implements le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ng2 B;

    public /* synthetic */ a16(ng2 ng2Var, int i) {
        this.A = i;
        this.B = ng2Var;
    }

    @Override // defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        ng2 ng2Var = this.B;
        switch (i) {
            case 0:
                Object b = ng2Var.b(new a7(ne2Var, 26), r41Var);
                if (b == x61.COROUTINE_SUSPENDED) {
                    return b;
                }
                return jg7Var;
            default:
                Object b2 = ng2Var.b(new a7(ne2Var, 29), r41Var);
                if (b2 == x61.COROUTINE_SUSPENDED) {
                    return b2;
                }
                return jg7Var;
        }
    }
}
