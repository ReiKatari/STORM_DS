package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: he1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class he1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ke1 B;

    public /* synthetic */ he1(ke1 ke1Var, int i) {
        this.A = i;
        this.B = ke1Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ki2 ki2Var;
        int i = this.A;
        ke1 ke1Var = this.B;
        switch (i) {
            case 0:
                ((ch1) obj).getClass();
                ke1Var.i0.addView(ke1Var, ke1Var.j0);
                return new ie1(ke1Var, 0);
            case 1:
                ((ch1) obj).getClass();
                return new ie1(ke1Var, 1);
            default:
                mb4 mb4Var = (mb4) obj;
                if (ke1Var.h0.b && (ki2Var = ke1Var.k0) != null) {
                    ki2Var.c();
                }
                return o27.a;
        }
    }
}
