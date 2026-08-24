package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pa3  reason: default package */
/* loaded from: classes.dex */
public final class pa3 implements le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ cf2 B;
    public final /* synthetic */ wa3 L;

    public /* synthetic */ pa3(cf2 cf2Var, wa3 wa3Var, int i) {
        this.A = i;
        this.B = cf2Var;
        this.L = wa3Var;
    }

    @Override // defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        wa3 wa3Var = this.L;
        cf2 cf2Var = this.B;
        switch (i) {
            case 0:
                Object b = cf2Var.b(new oa3(ne2Var, wa3Var, 0), r41Var);
                if (b == x61.COROUTINE_SUSPENDED) {
                    return b;
                }
                return jg7Var;
            default:
                Object b2 = cf2Var.b(new oa3(ne2Var, wa3Var, 1), r41Var);
                if (b2 == x61.COROUTINE_SUSPENDED) {
                    return b2;
                }
                return jg7Var;
        }
    }
}
