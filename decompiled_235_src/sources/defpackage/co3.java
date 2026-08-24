package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: co3  reason: default package */
/* loaded from: classes.dex */
public final class co3 implements on2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ qn2 B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public co3(na4 na4Var, fk3 fk3Var, qn2 qn2Var) {
        this.L = na4Var;
        this.R = fk3Var;
        this.B = qn2Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj = this.R;
        qn2 qn2Var = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                fk3 fk3Var = (fk3) obj;
                ((na4) obj2).k(fk3Var);
                qn2Var.g(fk3Var);
                return jg7Var;
            default:
                nu4 nu4Var = (nu4) obj2;
                int i2 = ru4.b;
                if (nu4Var != xz5.RESET && nu4Var != xz5.EXIT && nu4Var != cd2.RESET && nu4Var != cd2.EXIT) {
                    qn2Var.g(nu4Var);
                } else {
                    ((qa4) obj).setValue(nu4Var);
                }
                return jg7Var;
        }
    }

    public co3(nu4 nu4Var, qn2 qn2Var, qa4 qa4Var) {
        this.L = nu4Var;
        this.B = qn2Var;
        this.R = qa4Var;
    }
}
