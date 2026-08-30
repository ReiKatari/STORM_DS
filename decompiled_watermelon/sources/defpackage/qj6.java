package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qj6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qj6 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ wj6 B;

    public /* synthetic */ qj6(wj6 wj6Var, int i) {
        this.A = i;
        this.B = wj6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        wj6 wj6Var = this.B;
        switch (i) {
            case 0:
                iq2.x().execute(new qj6(wj6Var, 1));
                return;
            default:
                if (!wj6Var.n) {
                    wj6Var.d();
                    return;
                }
                return;
        }
    }
}
