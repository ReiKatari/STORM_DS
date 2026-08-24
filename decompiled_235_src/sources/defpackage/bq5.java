package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq5  reason: default package */
/* loaded from: classes.dex */
public final class bq5 extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ cq5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bq5(cq5 cq5Var, int i) {
        super(1);
        this.B = i;
        this.L = cq5Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        cq5 cq5Var = this.L;
        switch (i) {
            case 0:
                return Double.valueOf(cq5Var.n.c(gi2.o(((Number) obj).doubleValue(), cq5Var.e, cq5Var.f)));
            default:
                return Double.valueOf(gi2.o(cq5Var.k.c(((Number) obj).doubleValue()), cq5Var.e, cq5Var.f));
        }
    }
}
