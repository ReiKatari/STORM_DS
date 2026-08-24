package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pr3 B;
    public final /* synthetic */ w61 L;
    public final /* synthetic */ float R;

    public /* synthetic */ o4(pr3 pr3Var, w61 w61Var, float f, int i) {
        this.A = i;
        this.B = pr3Var;
        this.L = w61Var;
        this.R = f;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        float f = this.R;
        w61 w61Var = this.L;
        pr3 pr3Var = this.B;
        switch (i) {
            case 0:
                mj0 mj0Var = (mj0) obj;
                mj0Var.getClass();
                int i2 = mj0Var.a;
                if (i2 == 5) {
                    if (pr3Var.b()) {
                        mj0Var.b = true;
                        hv.L(w61Var, null, null, new o5(pr3Var, f, null, 0), 3);
                    } else if (pr3Var.h() == 0) {
                        mj0Var.b = true;
                    }
                } else if (i2 == 6 && pr3Var.c()) {
                    mj0Var.b = true;
                    hv.L(w61Var, null, null, new o5(pr3Var, f, null, 1), 3);
                }
                return jg7Var;
            default:
                fh2 fh2Var = (fh2) obj;
                fh2Var.getClass();
                fh2Var.c(new o4(pr3Var, w61Var, f, 0));
                return jg7Var;
        }
    }
}
