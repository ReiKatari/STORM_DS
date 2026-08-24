package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kn0 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xn0 B;
    public final /* synthetic */ qn2 L;

    public /* synthetic */ kn0(xn0 xn0Var, qn2 qn2Var, int i) {
        this.A = i;
        this.B = xn0Var;
        this.L = qn2Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z = false;
        qn2 qn2Var = this.L;
        xn0 xn0Var = this.B;
        switch (i) {
            case 0:
                vs4 vs4Var = xn0Var.e;
                if (qs6.v0(((c37) xn0Var.b.getValue()).a.B)) {
                    vs4Var.setValue(wn0.CANNOT_BE_EMPTY);
                } else {
                    vs4Var.setValue(null);
                    z = true;
                }
                boolean b = xn0Var.b();
                if (z && b) {
                    qn2Var.g(xn0Var.a());
                }
                return jg7Var;
            default:
                vs4 vs4Var2 = xn0Var.e;
                if (qs6.v0(((c37) xn0Var.b.getValue()).a.B)) {
                    vs4Var2.setValue(wn0.CANNOT_BE_EMPTY);
                } else {
                    vs4Var2.setValue(null);
                    z = true;
                }
                boolean b2 = xn0Var.b();
                if (z && b2) {
                    qn2Var.g(xn0Var.a());
                }
                return jg7Var;
        }
    }
}
