package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xh6  reason: default package */
/* loaded from: classes.dex */
public final class xh6 extends ic3 implements aj2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ yh6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh6(yh6 yh6Var, int i) {
        super(2);
        this.B = i;
        this.L = yh6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.B;
        o27 o27Var = o27.a;
        yh6 yh6Var = this.L;
        switch (i) {
            case 0:
                vf3 vf3Var = (vf3) obj;
                yh6Var.a().B = (dv0) obj2;
                return o27Var;
            case 1:
                jg3 a = yh6Var.a();
                ((vf3) obj).c0(new fg3(a, (aj2) obj2, a.k0));
                return o27Var;
            default:
                vf3 vf3Var2 = (vf3) obj;
                yh6 yh6Var2 = (yh6) obj2;
                bi6 bi6Var = yh6Var.a;
                jg3 jg3Var = vf3Var2.C0;
                if (jg3Var == null) {
                    jg3Var = new jg3(vf3Var2, bi6Var);
                    vf3Var2.C0 = jg3Var;
                }
                yh6Var.b = jg3Var;
                yh6Var.a().h();
                jg3 a2 = yh6Var.a();
                if (a2.L != bi6Var) {
                    a2.L = bi6Var;
                    a2.i(false);
                    vf3.V(a2.A, false, 7);
                }
                return o27Var;
        }
    }
}
