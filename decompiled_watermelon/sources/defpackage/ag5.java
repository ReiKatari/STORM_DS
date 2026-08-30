package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ag5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ag5 implements bi1 {
    public final /* synthetic */ int A;
    public final /* synthetic */ eg5 B;

    public /* synthetic */ ag5(eg5 eg5Var, int i) {
        this.A = i;
        this.B = eg5Var;
    }

    @Override // defpackage.bi1
    public final double a(double d) {
        int i = this.A;
        eg5 eg5Var = this.B;
        switch (i) {
            case 0:
                return io2.k(eg5Var.k.a(d), eg5Var.e, eg5Var.f);
            default:
                return eg5Var.n.a(io2.k(d, eg5Var.e, eg5Var.f));
        }
    }
}
