package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sj6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sj6 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ hc1 B;

    public /* synthetic */ sj6(hc1 hc1Var, int i) {
        this.A = i;
        this.B = hc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        hc1 hc1Var = this.B;
        switch (i) {
            case 0:
                hc1Var.a();
                return;
            default:
                hc1Var.b();
                return;
        }
    }
}
