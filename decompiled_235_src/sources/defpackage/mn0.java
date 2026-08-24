package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mn0 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ on2 B;

    public /* synthetic */ mn0(int i, on2 on2Var) {
        this.A = i;
        this.B = on2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        on2 on2Var = this.B;
        switch (i) {
            case 0:
                ((uh3) obj).getClass();
                on2Var.c();
                return jg7Var;
            case 1:
                ((Boolean) obj).booleanValue();
                on2Var.c();
                return jg7Var;
            case 2:
                ((Boolean) obj).booleanValue();
                on2Var.c();
                return jg7Var;
            case 3:
                ((z8) obj).getClass();
                on2Var.c();
                return jg7Var;
            case 4:
                ((uh3) obj).getClass();
                if (on2Var != null) {
                    on2Var.c();
                }
                return jg7Var;
            case 5:
                ((z8) obj).getClass();
                on2Var.c();
                return jg7Var;
            case 6:
                ((e36) obj).getClass();
                return on2Var.c();
            case 7:
                qh1 qh1Var = (qh1) obj;
                return new i93(u24.E(((Number) on2Var.c()).floatValue()) << 32);
            default:
                qh1 qh1Var2 = (qh1) obj;
                return (jk4) on2Var.c();
        }
    }
}
