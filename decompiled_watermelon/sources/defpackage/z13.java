package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z13  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z13 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ a23 B;

    public /* synthetic */ z13(a23 a23Var, int i) {
        this.A = i;
        this.B = a23Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        a23 a23Var = this.B;
        zx6 zx6Var = (zx6) obj;
        switch (i) {
            case 0:
                zx6Var.getClass();
                a23 a23Var2 = (a23) zx6Var;
                re7 re7Var = a23Var.k0;
                if (!b53.x(a23Var2.j0, re7Var)) {
                    a23Var2.j0 = re7Var;
                    a23Var2.S0();
                }
                return yx6.SkipSubtreeAndContinueTraversal;
            default:
                zx6Var.getClass();
                a23Var.j0 = ((a23) zx6Var).k0;
                return Boolean.FALSE;
        }
    }
}
