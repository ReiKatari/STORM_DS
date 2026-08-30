package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yr3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yr3 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ vo6 B;

    public /* synthetic */ yr3(vo6 vo6Var, int i) {
        this.A = i;
        this.B = vo6Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        vo6 vo6Var = this.B;
        switch (i) {
            case 0:
                vo6Var.a();
                return o27Var;
            default:
                vo6Var.onCancel();
                return o27Var;
        }
    }
}
