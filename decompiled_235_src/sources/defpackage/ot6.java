package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ot6  reason: default package */
/* loaded from: classes.dex */
public final class ot6 extends aj3 implements eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ pt6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot6(pt6 pt6Var, int i) {
        super(2);
        this.B = i;
        this.L = pt6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.B;
        jg7 jg7Var = jg7.a;
        pt6 pt6Var = this.L;
        switch (i) {
            case 0:
                sm3 sm3Var = (sm3) obj;
                pt6Var.a().B = (zx0) obj2;
                return jg7Var;
            case 1:
                gn3 a = pt6Var.a();
                ((sm3) obj).c0(new cn3(a, (eo2) obj2, a.l0));
                return jg7Var;
            default:
                sm3 sm3Var2 = (sm3) obj;
                pt6 pt6Var2 = (pt6) obj2;
                st6 st6Var = pt6Var.a;
                gn3 gn3Var = sm3Var2.D0;
                if (gn3Var == null) {
                    gn3Var = new gn3(sm3Var2, st6Var);
                    sm3Var2.D0 = gn3Var;
                }
                pt6Var.b = gn3Var;
                pt6Var.a().h();
                gn3 a2 = pt6Var.a();
                if (a2.L != st6Var) {
                    a2.L = st6Var;
                    a2.i(false);
                    sm3.V(a2.A, false, 7);
                }
                return jg7Var;
        }
    }
}
