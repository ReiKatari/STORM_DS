package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j7  reason: default package */
/* loaded from: classes.dex */
public final class j7 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ kx6 B;

    public /* synthetic */ j7(kx6 kx6Var, int i) {
        this.A = i;
        this.B = kx6Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        kx6 kx6Var = this.B;
        switch (i) {
            case 0:
                return kx6Var.d.getValue();
            case 1:
                return kx6Var.f();
            case 2:
                return kx6Var.d.getValue();
            default:
                return kx6Var.f();
        }
    }
}
