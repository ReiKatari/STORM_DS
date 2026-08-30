package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wr0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wr0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ra5 B;
    public final /* synthetic */ gb5 L;
    public final /* synthetic */ long R;
    public final /* synthetic */ hh X;

    public /* synthetic */ wr0(ra5 ra5Var, gb5 gb5Var, long j, hh hhVar, int i) {
        this.A = i;
        this.B = ra5Var;
        this.L = gb5Var;
        this.R = j;
        this.X = hhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        hh hhVar = this.X;
        long j = this.R;
        gb5 gb5Var = this.L;
        ra5 ra5Var = this.B;
        switch (i) {
            case 0:
                ra5Var.K(gb5Var, j, hhVar);
                return;
            default:
                ra5Var.i(gb5Var, j, hhVar);
                return;
        }
    }
}
