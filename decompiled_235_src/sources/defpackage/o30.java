package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o30  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o30 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ f47 B;
    public final /* synthetic */ qn2 L;

    public /* synthetic */ o30(f47 f47Var, qn2 qn2Var, int i) {
        this.A = i;
        this.B = f47Var;
        this.L = qn2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        qn2 qn2Var = this.L;
        f47 f47Var = this.B;
        switch (i) {
            case 0:
                a47 a47Var = (a47) obj;
                if (f47Var != null) {
                    f47Var.a.setValue(a47Var);
                }
                if (qn2Var != null) {
                    qn2Var.g(a47Var);
                }
                return jg7.a;
            default:
                gl1 gl1Var = (gl1) obj;
                f47Var.c.add(qn2Var);
                return new j00(7, f47Var, qn2Var);
        }
    }
}
