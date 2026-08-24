package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yp5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yp5 implements gm1 {
    public final /* synthetic */ int A;
    public final /* synthetic */ cq5 B;

    public /* synthetic */ yp5(cq5 cq5Var, int i) {
        this.A = i;
        this.B = cq5Var;
    }

    @Override // defpackage.gm1
    public final double c(double d) {
        int i = this.A;
        cq5 cq5Var = this.B;
        switch (i) {
            case 0:
                return gi2.o(cq5Var.k.c(d), cq5Var.e, cq5Var.f);
            default:
                return cq5Var.n.c(gi2.o(d, cq5Var.e, cq5Var.f));
        }
    }
}
