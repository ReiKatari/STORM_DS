package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dx2 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ex2 B;

    public /* synthetic */ dx2(ex2 ex2Var, int i) {
        this.A = i;
        this.B = ex2Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        ex2 ex2Var = this.B;
        switch (i) {
            case 0:
                we7 we7Var = ex2Var.r0;
                if (we7Var != null) {
                    we7Var.getValue();
                    return jg7Var;
                }
                throw lb1.c("Font resolution state is not set.");
            default:
                we7 we7Var2 = ex2Var.r0;
                if (we7Var2 != null) {
                    we7Var2.getValue();
                    return jg7Var;
                }
                throw lb1.c("Font resolution state is not set.");
        }
    }
}
