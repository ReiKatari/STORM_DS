package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c61  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c61 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ e61 B;

    public /* synthetic */ c61(e61 e61Var, int i) {
        this.A = i;
        this.B = e61Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        e61 e61Var = this.B;
        switch (i) {
            case 0:
                nc1.c0(e61Var);
                return jg7Var;
            case 1:
                e61Var.s0.h(true);
                break;
            case 2:
                e61Var.s0.d(true);
                break;
            case 3:
                e61Var.s0.f();
                break;
            case 4:
                nc1.c0(e61Var);
                return jg7Var;
            case 5:
                e61Var.s0.p();
                break;
            case 6:
                w51 w51Var = e61Var.o0.w;
                w51Var.B.r.b(e61Var.t0.e);
                break;
            default:
                jt3 jt3Var = e61Var.o0;
                nh2 nh2Var = e61Var.u0;
                if (!jt3Var.b()) {
                    nh2.a(nh2Var);
                } else {
                    xm6 xm6Var = jt3Var.c;
                    if (xm6Var != null) {
                        ((bh1) xm6Var).b();
                    }
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
