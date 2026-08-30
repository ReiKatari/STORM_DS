package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qb1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qb1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ hk6 B;

    public /* synthetic */ qb1(hk6 hk6Var, int i) {
        this.A = i;
        this.B = hk6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        hk6 hk6Var = this.B;
        switch (i) {
            case 0:
                hk6Var.b();
                return;
            default:
                hk6Var.e.cancel(true);
                return;
        }
    }
}
