package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cl0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cl0 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pl0 B;
    public final /* synthetic */ mi2 L;

    public /* synthetic */ cl0(pl0 pl0Var, mi2 mi2Var, int i) {
        this.A = i;
        this.B = pl0Var;
        this.L = mi2Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = false;
        mi2 mi2Var = this.L;
        pl0 pl0Var = this.B;
        switch (i) {
            case 0:
                tj4 tj4Var = pl0Var.e;
                if (zg6.B0(((oq6) pl0Var.b.getValue()).a.B)) {
                    tj4Var.setValue(ol0.CANNOT_BE_EMPTY);
                } else {
                    tj4Var.setValue(null);
                    z = true;
                }
                boolean b = pl0Var.b();
                if (z && b) {
                    mi2Var.n(pl0Var.a());
                }
                return o27Var;
            default:
                tj4 tj4Var2 = pl0Var.e;
                if (zg6.B0(((oq6) pl0Var.b.getValue()).a.B)) {
                    tj4Var2.setValue(ol0.CANNOT_BE_EMPTY);
                } else {
                    tj4Var2.setValue(null);
                    z = true;
                }
                boolean b2 = pl0Var.b();
                if (z && b2) {
                    mi2Var.n(pl0Var.a());
                }
                return o27Var;
        }
    }
}
