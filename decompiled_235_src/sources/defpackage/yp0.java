package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yp0  reason: default package */
/* loaded from: classes.dex */
public final class yp0 implements le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ de5 B;

    public /* synthetic */ yp0(de5 de5Var, int i) {
        this.A = i;
        this.B = de5Var;
    }

    @Override // defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        de5 de5Var = this.B;
        switch (i) {
            case 0:
                Object b = de5Var.A.b(new a7(ne2Var, 6), r41Var);
                if (b == x61.COROUTINE_SUSPENDED) {
                    return b;
                }
                return jg7Var;
            default:
                Object b2 = de5Var.A.b(new a7(ne2Var, 7), r41Var);
                if (b2 == x61.COROUTINE_SUSPENDED) {
                    return b2;
                }
                return jg7Var;
        }
    }
}
