package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zj3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zj3 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ak3 B;

    public /* synthetic */ zj3(ak3 ak3Var, int i) {
        this.A = i;
        this.B = ak3Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        ak3 ak3Var = this.B;
        switch (i) {
            case 0:
                return Float.valueOf(ak3Var.k0.b());
            case 1:
                return Float.valueOf(ak3Var.k0.e());
            default:
                return Float.valueOf(ak3Var.k0.a() - ak3Var.k0.d());
        }
    }
}
